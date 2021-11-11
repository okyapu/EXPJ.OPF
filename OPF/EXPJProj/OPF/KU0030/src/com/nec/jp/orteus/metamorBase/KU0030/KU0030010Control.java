/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0030/src/com/nec/jp/orteus/metamorBase/KU0030/KU0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0030;

import com.nec.jp.orteus.metamorBase.KU0030.*;
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
import com.nec.jp.orteus.metamorBase.util.Combo.ComboStruct;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboDataAccessController;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboException;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.ExchAmount;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

// Del Start 20131223 liu-j
//import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkDay;
// Del End 20131223 liu-j
import java.util.GregorianCalendar;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.MessageFormat;
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.sa.ArIf;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KU0030010Control
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
	protected List list;						// ���ʃ��X�g�̃C���X�^���X
	public List getList() { return this.list; }			// ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
	public int getListsize() {					// ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	public KU0030010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

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

	/** �a���q�ɋ敪 */
	private final static String m_DEPO_TYP = "10";

	/** ��ʃ��[�h �������� */
	private final static String _SELECT = "select";

	/** ��ʃ��[�h ����/����ȊO�̏��� */
	private final static String _NORMAL = "normal";

	/** ��ʃ��[�h ���鏈�� */
	private final static String _CLOSE = "close";

	/** ��ʕ\������ */
	private int hyouji_kensu = 1;

	/** ���{�~�̒ʉ݃R�[�h */
	private String jpCurrency = null;

    /** ���{�~�̏����_�ȉ����� */
    private int jpDecimalFig = 0;

    /** ����ʉ݂̏����_�ȉ����� */
    private int decimalFig = 0;

	/** TAX KBN */
	private String TAX_KBN = "";

	/** �V�X�e���p�����[�^�ǂݏo���L�[ */
	private final static String JPCUR_CTRL_CD = "SYSTEM";

	/** �V�X�e���ݒ�l�擾 */
	private PrivateConfig privateConfig;
	
	// Add Start 20131223 liu-j
	/**����Ōv�Z�^�C�v	 */
	private String CALCU_TAX_TYPE = "";
	
	/** �����敪 */
	private String INSPC_ACPT_TYP = "";
	
	/** �[�i�\��� */
	private String SCDL_DLV_DATE = "";
	// Add End 20131223 liu-j
	
	/** �M�݃t���O */
	private boolean bIsJpCur;
	/**
	 * null�܂��͋󔒕����Ȃ��0�A����ȊO�͂��̂܂܂ɂ��܂��B
	 *
	 * @param String str
	 * @return String �ϊ��㕶����
	 */
	private String chkNulltoZero(String str){
		if (str == null || str.equals("")) {
			return "0";
		}
		return str;
	}
	/**
	 * �[���\���
	 *
	 * @param KU0030010Struct Struct
	 * @return �Z�o��̔[���\���
	 */
	private String getScdlDlvDate(KU0030010Struct wst, String strDesinatedShipDate,String strTransportLt) throws ParseException,FoundationException
	{
		String rv = null;

		//�o�׎w���
		GregorianCalendar inpDate = new GregorianCalendar();
		inpDate.setTime(Converter.strToDate(strDesinatedShipDate, "yyyy/MM/dd"));

		//�o�׎w������v�Z����ɂ���
		Date wkDate = inpDate.getTime();
		try
		{
			//�Ɩ����t�v�Z
			//�w��[������^�������A�o�׏���L/T������
			WorkDay wkd = new WorkDay(struct.getsUser_ID(),		//���[�U�R�[�h
					this.getBusiness().getBusinessCd(),	//�Ɩ��R�[�h
					struct.getstrPLANT_CD(),		//�H��R�[�h
					wkDate,					//�Ώۓ��t
					Integer.parseInt(strTransportLt),	//���Z��
					false					//�O�|���t���O
				);
			wkDate = wkd.calcDate();		//�v�Z����
			if(wkDate == null){
				//�G���[
				ExpjMessage emsg = new ExpjMessage("KQ00040");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			return null;
		}

		rv = new String(Converter.dateToStr(wkDate, "yyyy/MM/dd"));
		return rv;
	}
	// Add Start 20131223 liu-j
	/**
	 * �[���\���
	 *
	 * @param KU0030010Struct Struct
	 * @return �Z�o��̔[���\���
	 */
	private String getScdlDlvDate(KU0030010Struct wst, String strDesinatedShipDate,String strTransportLt, String strItemCd) throws ParseException,FoundationException
	{
		String rv = null;

		//�o�׎w���
		GregorianCalendar inpDate = new GregorianCalendar();
		inpDate.setTime(Converter.strToDate(strDesinatedShipDate, "yyyy/MM/dd"));

		//�o�׎w������v�Z����ɂ���
		Date wkDate = inpDate.getTime();
		try
		{
			//�Ɩ����t�v�Z
			//�w��[������^�������A�o�׏���L/T������
			WorkDay wkd = new WorkDay(struct.getsUser_ID(),		//���[�U�R�[�h
					this.getBusiness().getBusinessCd(),	 		//�Ɩ��R�[�h
					struct.getstrPLANT_CD(),		 			//�H��R�[�h
					strItemCd,             					    // �i�ڔԍ�
					wkDate,								 		//�Ώۓ��t
					Integer.parseInt(strTransportLt),	 		//���Z��
					false								 		//�O�|���t���O
				);
			wkDate = wkd.calcDate();		//�v�Z����
			if(wkDate == null){
				//�G���[
				ExpjMessage emsg = new ExpjMessage("KQ00040");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			return null;
		}

		rv = new String(Converter.dateToStr(wkDate, "yyyy/MM/dd"));
		return rv;
	}
	// Add End 20131223 liu-j
	private String replaceNull(String strIn){

		String rv="";

		if(strIn != null){
			rv = strIn;
		}

		return rv;
	}

	private String calMultiply(String strIn1, String strIn2){

		String rv = "";

		if(!"".equals(strIn1) && !"".equals(strIn2)){
			rv = Double.parseDouble(chkNulltoZero(strIn1))*Double.parseDouble(chkNulltoZero(strIn2))+ "";
		}
		return rv;

	}

	private String calCaseQty(String strShipQty, String strPkgUnitQty){

		String rv = "";

		if(!"".equals(strShipQty) && !"".equals(strPkgUnitQty)){

			rv = Double.parseDouble(chkNulltoZero(strShipQty))/Double.parseDouble(chkNulltoZero(strPkgUnitQty))+ "";
		}
		return rv;

	}

	private String calRestQty(String strShipQty, String strPkgUnitQty){

		String rv = "";

		if(!"".equals(strShipQty) && !"".equals(strPkgUnitQty)){

			rv = Double.parseDouble(chkNulltoZero(strShipQty))%Double.parseDouble(chkNulltoZero(strPkgUnitQty))+ "";

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

	public static String Replace(String strin, String strRe, String strBy) {
		int iPos;
		String strTemp = "";
		iPos = strin.indexOf(strRe);
		while (iPos != -1) {
			strTemp = strTemp + strin.substring(0, iPos) + strBy;
			strin = strin.substring(iPos + strRe.length());
			iPos = strin.indexOf(strRe);
		}
		strin = strTemp + strin;
		return strin;
	}

	/**
	 * �`�[�ԍ��̍̔�(����p)
	 *
	 * @param old_slip_cd ���́h�`�[�ԍ��h
	 * @return String[] rv[0]�ԓ` rv[1]���`
	 */
	private String[] getSlipCd(KU0030010Struct st, String old_slip_cd) throws FoundationException,SQLException {

		String[] rv = new String[2];
		rv[0] = rv[1] = old_slip_cd;		//�ԓ`�����`�����́h�`�[�ԍ��h
		Numbering SLIP_CD = null;			//�`�[�ԍ��̔�

		if (entity.mchkSysInstallOptions.check(conn,st)) {

			SLIP_CD = new Numbering(conn,Numbering.SLIP_CD,struct.getsUser_ID(),"KU0030010",struct.getstrPLANT_CD());

			st.setchkSLIP_CD(old_slip_cd);
			List tmpLst = entity.mchkT_AR_LEDGER_H_TRN.read(conn,st);
			if(tmpLst == null || tmpLst.size() == 0) {
			} else {
				rv[1] = SLIP_CD.getNo();			//���`�̔�
				return rv;
			}
			tmpLst = entity.mchkT_AR_LEDGER_H.read(conn,st);
			if(tmpLst == null || tmpLst.size() == 0) {
			} else {
				rv[0] = SLIP_CD.getNo();			//�ԓ`�̔�
				rv[1] = SLIP_CD.getNo();			//���`�̔�
				return rv;
			}
		}

		return rv;
	}

	/**
	 * �`�[�ԍ��̍̔�(�ԕi�p)
	 *
	 * @param old_slip_cd ���́h�`�[�ԍ��h
	 * @return String[] rv[0]�ԓ` rv[1]���`
	 */
	private String[] getSlipCdAtReturn(KU0030010Struct st, String old_slip_cd) throws FoundationException,SQLException {

		String[] rv = new String[2];
		rv[0] = rv[1] = old_slip_cd;		//�ԓ`�����`�����́h�`�[�ԍ��h
		Numbering SLIP_CD = null;			//�`�[�ԍ��̔�

		if (entity.mchkSysInstallOptions.check(conn,st)) {

			SLIP_CD = new Numbering(conn,Numbering.SLIP_CD,struct.getsUser_ID(),"KU0030010",struct.getstrPLANT_CD());

			st.setchkSLIP_CD(old_slip_cd);
			List tmpLst = entity.mchkT_AR_LEDGER_H_TRN.read(conn,st);
			if(tmpLst == null || tmpLst.size() == 0) {
			} else {
				return rv;
			}
			tmpLst = entity.mchkT_AR_LEDGER_H.read(conn,st);
			if(tmpLst == null || tmpLst.size() == 0) {
			} else {
				rv[0] = SLIP_CD.getNo();			//�ԓ`�̔�
				rv[1] = SLIP_CD.getNo();			//���`�̔�
				return rv;
			}
		}

		return rv;
	}

	/**
	 * �o�׎��ю���^�ԕi���ѓo�^�u�^���L������
	 *
	 * @param status ��ԋ敪
	 * @param inspect �����敪
	 * @return int 0:�^1:�G���[�^2:�s���P�^3:�s���Q
	 */
	private int isToriHanEnable(String status, String inspect) throws Exception {
		int intStatus = Integer.parseInt(status);
		int intInspect = Integer.parseInt(inspect);
		if (intStatus >= 10 && intStatus <20) {
			switch (intInspect) {
			case 1 : return 1;
			case 2 :
			case 3 : return 0;
			}
		} else
		if (intStatus >= 20 && intStatus <40) {
			switch (intInspect) {
			case 1 : return 0;
			case 2 :
			case 3 : return 2;
			}
		} else
		if (intStatus >= 40) {
			switch (intInspect) {
			case 1 :
			case 2 :
			case 3 : return 3;
			}
		}
		throw new Exception();
	}
	
	// Del Start 20131223 liu-j
//	/**
//	 * �V����ŃR�[�h�J�n���Ɣ�r
//	 *
//	 */
//	private boolean isNewTax(KU0030010Struct wst, String strStartDate) throws ParseException
//	{
//		boolean rv = false;
//
//		//�V����ŃR�[�h�J�n��
//		GregorianCalendar date1 = new GregorianCalendar();
//		//date1.setTime(sdi.parse(strStartDate));
//		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));
//
//		//�o�׎��ѓ�
//		GregorianCalendar date2 = new GregorianCalendar();
//		date2.setTime(Converter.strToDate(wst.getg_DESINATED_SHIP_DATE(), "yyyy/MM/dd"));
//
//		//�V����ŃR�[�h�J�n�� <= �o�׎w����̏ꍇ�A�V�ŗ�
//		if(date1.getTime().compareTo(date2.getTime()) <= 0){
//			rv = true;
//		}
//		return rv;
//	}
	// Del End 20131223 liu-j
	// Add Start 20131223 liu-j 
	/**
	 * �V����ŃR�[�h�J�n���Ɣ�r
	 *
	 */
	private boolean isNewTax(String strObjectDate, String strStartDate) throws ParseException
	{
		boolean rv = false;

		//�V����ŃR�[�h�J�n��
		GregorianCalendar date1 = new GregorianCalendar();
		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));

		//�Ώۓ��t
		GregorianCalendar date2 = new GregorianCalendar();
		date2.setTime(Converter.strToDate(strObjectDate, "yyyy/MM/dd"));

		//�V����ŃR�[�h�J�n�� <= �Ώۓ��t�̏ꍇ�A�V�ŗ�
		if(date1.getTime().compareTo(date2.getTime()) <= 0){
			rv = true;
		}
		return rv;
	}
    // Add End 20131223 liu-j
	/**
	 * ����ŋ��z�v�Z
	 * @param 	String strCustCd �ڋq�R�[�h
	 * 		String strItemCd �i��
	 * 		String strAmount �o�׎w�����z
	 *
	 * @return String rv ����ŋ��z
	 *
	 * */
	private String[] doCalcuTaxAmount(KU0030010Struct wst, String strCustCd,
	                          String strCompanyCd, String strItemCd, String strAmount) throws ParseException, FoundationException, SQLException{

		String rv[] = new String[3];


		//����Ń}�X�^����擾
		wst.setstrTaxIN_COMPANYCD(strCompanyCd);
		wst.setstrTaxIN_CUSTCD(strCustCd);

		String strTaxKbn = "";	//�ō��敪
		String strStartDate ="";	//�V����ŃR�[�h�J�n��
	   	String strTaxRate[] = new String[3];	//�ŗ�
		String strRoundTyp = "";

		// Add Start 20131223 liu-j
		// �Ώۓ��t
		String strObjectDate = "";
		// Add End 20131223 liu-j
		
		List listTax = entity.mgetTax.read(conn, wst);

		if(listTax == null || listTax.size() != 1){
			// Add Start 20131223 liu-j
			// �o�׎��ѕԕi����(�m������сn�̓o�^)
			if ("4".equals(CALCU_TAX_TYPE)){
				listTax = entity.mgetTax1.read(conn, wst);
				if (!listTax.isEmpty()){
					this.TAX_KBN = ((KU0030010Struct)listTax.get(0)).getstrTaxTAX_KBN();
					strStartDate = ((KU0030010Struct)listTax.get(0)).getstrTaxSTART_DATE();
					strRoundTyp = ((KU0030010Struct)listTax.get(0)).getstrTaxROUND_TYP();
				}
				strObjectDate = SCDL_DLV_DATE; 
			}
			// Add End 20131223 liu-j
		}else{
			this.TAX_KBN = ((KU0030010Struct)listTax.get(0)).getstrTaxTAX_KBN();
			strStartDate = ((KU0030010Struct)listTax.get(0)).getstrTaxSTART_DATE();
			strRoundTyp = ((KU0030010Struct)listTax.get(0)).getstrTaxROUND_TYP();
			// Add Start 20131223 liu-j
			// [�o�׎w��]."�[�i�\���"
			strObjectDate = SCDL_DLV_DATE;	
		}	
		// Add End 20131223 liu-j
	
		// Mod Strat 20131223 liu-j
		////�ŗ��ݒ�(�V����ŊJ�n��<=�o�׎w����̏ꍇ�A�V�ŗ�)
		//if(this.isNewTax(wst, strStartDate)){
		//	strTaxRate[0] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
		//	strTaxRate[1] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
		//	strTaxRate[2] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
		//} else {
		//	strTaxRate[0] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
		//	strTaxRate[1] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
		//	strTaxRate[2] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
		//}
		// �ŗ��ݒ�(�V����ŊJ�n��<=�o�׎w����̏ꍇ�A�V�ŗ�)
		if(this.isNewTax(strObjectDate, strStartDate)){
			strTaxRate[0] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
			strTaxRate[1] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
			strTaxRate[2] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
		} else {
			strTaxRate[0] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
			strTaxRate[1] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
			strTaxRate[2] = this.chkNulltoZero(((KU0030010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
		}
		// Mod End 20131223 liu-j
		//�[���敪��ROUND���s��
		ExchAmount ex = new ExchAmount(conn);

		for (int i = 0; i < 3; i ++) {
			String strIn = ex.doMul(strAmount,strTaxRate[i]);

			if ("0".equals(this.TAX_KBN)){
				strIn = "0";
			} else if ("1".equals(this.TAX_KBN)){
				strIn = String.valueOf(Double.parseDouble(strIn) / Double.parseDouble("100"));
			} else {
				strIn = String.valueOf(Double.parseDouble(strIn) / (Double.parseDouble("100")+Double.parseDouble(strTaxRate[i])));
			}

            if ("2".equals(strRoundTyp)) {
                // �؂�グ
                rv[i] = Calculate.ceil(strIn, this.decimalFig);
            }
            else if ("3".equals(strRoundTyp)) {
                // �؂�̂�
                rv[i] = Calculate.floor(strIn, this.decimalFig);
            }
            else {
                // �l�̌ܓ�
                rv[i] = Calculate.round(strIn, this.decimalFig);
            }
		}

		return rv;
	}

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

	/**
	 * �ۊǋ�̍H��R�[�h����������
	 *
	 * @param KU0030010Struct Struct
	 * @return �ۊǋ�̍H��R�[�h
	 */
	private String getPlantCd(KU0030010Struct st) throws ParseException, FoundationException, SQLException{
		String WhPlantCd = null;
		List listM_WH = entity.mtbl_M_WH.read(conn, st);
		if (!listM_WH.isEmpty()) {
			KU0030010Struct tempSt = (KU0030010Struct) listM_WH.get(0);
			WhPlantCd = tempSt.getmWh_PLANT_CD();
		}
		return WhPlantCd;
	}

	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			KU0030010Struct sysParameterStruct = (KU0030010Struct) sysParameterList.get(0);
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
			KU0030010Struct procExecDateStruct = (KU0030010Struct) procExecDateList.get(0);
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
	 * ��r
	 * @param  bd1      ���͈���1
	 * @param  bd2 �@   ���͈���2
	 * @return boolean  �`�F�b�N�Ԃ��l
	 */
	private boolean compDecimal1(BigDecimal bd1,BigDecimal bd2){
		// bd1 > bd2
		if(bd1.compareTo(bd2) > 0) {
			return true;
		} else {
			return false;
		}
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
     * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
     * @param code ���b�Z�[�W�R�[�h
     * @param value1 �u��������P
     */
    private void setErrorMessage(String code, String value1) {
     ExpjMessage emsg = new ExpjMessage(code, value1);
     msgStruct.addError(emsg);
     sysLog.warning(emsg, sysUSER_CD);
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
     * �V�X�e���p�����[�^�`�F�b�N       
     * @throws SQLException �������s
     * @throws ExpjException �������s
   * @throws FoundationException 
     */
    private void chkAprSales(KU0030010Struct st)
    throws SQLException, ExpjException, FoundationException {
  	  
 	           /** �p�����[�^�u������я��F�v���擾*/
 	           privateConfig = new PrivateConfig(conn);
 	           String aprSales = privateConfig.getString("APR_SALES");
 	           // �p�����[�^�u�������F�v���擾�ł��Ȃ������ꍇ
 	          if(aprSales == null || "".equals(aprSales)){
 	     	  	st.setcreTsales_APPR_FLG("1");
 	    		st.setcreTsales_APPR_ID(null);
 	    		st.setcreTsales_APPR_DATE(null);
 	     	  	st.setupdTsales_APPR_FLG("1");
 	    		st.setupdTsales_APPR_ID(null);
 	    		st.setupdTsales_APPR_DATE(null);
 	          }else if(!"1".equals(aprSales)){   	        	  
     		    // �P�ȊO�̏ꍇ
 	     	  	st.setcreTsales_APPR_FLG("3");
 	 	    	st.setcreTsales_APPR_ID(getsysUSER_CD());
 	 	    	st.setcreTsales_APPR_DATE(st.getstrBUSINESS_OPR_DATE());
 	     	  	st.setupdTsales_APPR_FLG("3");
 	 	    	st.setupdTsales_APPR_ID(getsysUSER_CD());
 	 	    	st.setupdTsales_APPR_DATE(st.getstrBUSINESS_OPR_DATE());
 	          }else{
 	        	// �P�̏ꍇ
 	 	     	st.setcreTsales_APPR_FLG("1");
 	 	    	st.setcreTsales_APPR_ID(null);
 	 	    	st.setcreTsales_APPR_DATE(null);
 	     	  	st.setupdTsales_APPR_FLG("1");
 	    		st.setupdTsales_APPR_ID(null);
 	    		st.setupdTsales_APPR_DATE(null);
 	          }     	  
    }
    
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsearch() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlsearch");
			//{{user_implement_dev:<controlsearch>
			
		try{

			this.conn.beginTransWeb();

			boolean ok_flg = true;
			// Add Start 20140401 zhang-zl
			boolean lot_flg = false;
			// Add End 20140401 zhang-zl
			int rv;

			// �������ʃt���O��NG�ɐݒ�
			struct.seth_RESULT("NG");
			struct.seth_SELECT_FG("NG");

			//��ʃ��[�h�擾
			String strKMode="";
			String strSelPtn="";
			strKMode = (String)struct.getk_MODE();
			strSelPtn = (String)struct.getr_SEL_PTN();
			struct.seth_GYOMU_DATE((String)struct.geth_GYOMU_DATE());	//�Ɩ��v���

			if(strSelPtn.equals("ORDER")){
				// =======================================
				// ��ʕ\���s�����J��Ԃ�(�o�׎��ѓo�^�̏ꍇ)
				// =======================================
				for(int i=0;i<hyouji_kensu;i++){
					KU0030010Struct st = (KU0030010Struct)list.get(i);

					// =======================================
					// ���N�G�X�g��Struct�Ɋi�[
					// =======================================
					st.setg_SLIP_CD			("");	//�`�[�ԍ�
					st.setg_DATE			("");	//�o�ד�
					st.setg_DESINATED_SHIP_DATE ("");	//�o�׎w���
					st.setg_SHIP_QTY2		("");		//���ѐ���
					st.setg_SHIP_QTY		("");		//�w����
					st.seth_SHIP_QTY			("");
					st.setg_UNIT_PRICE			("");		//�P��
					st.setg_SHIP_ODR_AMOUNT		("");		//���z
					st.seth_EXCH_TYP			("");
					st.setg_WH_CD			("");		//�ۊǋ�
					st.setg_REMARKS			("");		//���l
					st.setg_CURRNCY				("");
					st.setg_CUST_ANAME			("");		//���Ӑ旪��
					st.setg_CUST_ITEM_CD		("");		//���Ӑ�i�ڔԍ�
					st.setg_ITEM_CD			("");		//�i�ڔԍ�
					st.setg_JOB_ODR_CD			("");		//����
					st.seth_ITEM_CD				("");
					st.seth_AP_SECRTY_TYP		("");
					st.seth_MODFIY_CNT			("");
					st.seth_RETURN_QTY			("");
					st.seth_TOTAL_SHIP_QTY		("");
					st.setg_CUR_UNIT("");

                    st.setg_STOCK_UNIT("");
                    st.setg_STOCK_UNIT2("");
                    st.setg_CUR_UNIT2("");
                    st.setg_WH_NAME("");
                    st.setg_ITEM_NAME("");
                    st.setg_SALES_DEPT_CD("");
                    st.setg_ORG_NAME("");
                    st.setg_CUST_CD("");
                    st.setg_CUST_ITEM_NAME("");
                    st.setg_CUST_ODR_NO("");
                    st.setg_ODR_NO("");
                    st.setg_PART_DLV_SEQ_NO("");
                    st.setg_SHIP_ODR_NO("");
										st.seth_MRP_ODR_TYP("");

					st.setg_SLIP_CD((String)struct.getList_g_SLIP_CD().get(i));		//�`�[�ԍ�

					st.seth_GYOMU_DATE(struct.geth_GYOMU_DATE());
					st.setg_DATE(struct.geth_GYOMU_DATE());
					st.setg_DIRECT_DLV_FLG("");					// �݌Ƀ`�F�b�N�Ȃ��t���O
					// Add by �����@2007/09/25�@Begin				
					st.seth_JOB_ODR_CD("");   // ����
					// Add by �����@2007/09/25�@End
					// =======================================
					// �o�׎w�����̎擾
					// =======================================
					//�L�[�F�`�[�ԍ�
					st.setserInsert_IN_SLIPCD(st.getg_SLIP_CD());

					List listT_SHIP_ODR = entity.mtbl_T_SHIP_ODR.read(conn, st);

					if(listT_SHIP_ODR == null || listT_SHIP_ODR.size() != 1){
						//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "ZZ06001");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
					}else{

						st.seth_MRP_ODR_TYP(((KU0030010Struct)listT_SHIP_ODR.get(0)).geth_MRP_ODR_TYP());


						st.setg_SLIP_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SLIP_CD());
						st.setg_DESINATED_SHIP_DATE(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DESINATED_SHIP_DATE());
						st.setg_SHIP_QTY(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_QTY());

						st.seth_SHIP_QTY(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_QTY());
						if(null==st.getg_SHIP_QTY2() || st.getg_SHIP_QTY2().equals("")){
							st.setg_SHIP_QTY2(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_QTY());
						}
						if(null==st.getg_UNIT_PRICE() || st.getg_UNIT_PRICE().equals("")){
							st.setg_UNIT_PRICE(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_UNIT_PRICE());
						}
						st.setg_CURRNCY(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUR_NAME());
						if(null==st.getg_WH_CD() || st.getg_WH_CD().equals("")){
							st.setg_WH_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ALLCT_WH_CD());
						}

						st.setg_SHIP_ODR_AMOUNT(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_ODR_AMOUNT());
						st.setg_CUST_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_ITEM_CD());
						st.setg_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD());
						st.setg_JOB_ODR_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_JOB_ODR_CD());

						if(st.getg_JOB_ODR_CD() != null && !st.getg_JOB_ODR_CD().equals("")) {
							st.setc_JOB_ODR_CD("true");
						} else {
							st.setc_JOB_ODR_CD("false");
						}
    					// Add by �����@2007/09/25�@Begin				
                        st.seth_JOB_ODR_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).geth_JOB_ODR_CD());  // ����
    					// Add by �����@2007/09/25�@End
						st.seth_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD());
						st.seth_EXCH_TYP(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_EXCH_TYP());
						st.seth_GYOMU_DATE(st.geth_GYOMU_DATE());
						st.seth_MODFIY_CNT(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_MODIFY_COUNT());

                        st.setg_CUST_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_CD());
                        st.setg_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ODR_NO());
                        st.setg_PART_DLV_SEQ_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_PART_DLV_SEQ_NO());
                        st.setg_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_ODR_NO());
                        st.setg_CUST_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_ODR_NO());
                        st.seth_DATE(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ODR_ACPT_DATE());

                        // Add Start 20140311 ma-jf
                        st.seth_LOT_CTRL_FLG(((KU0030010Struct)listT_SHIP_ODR.get(0)).geth_LOT_CTRL_FLG());
                        // Add End 20140311 ma-jf
                        st.setselMODIFY_COUNT(((KU0030010Struct)listT_SHIP_ODR.get(0)).getselMODIFY_COUNT());
                        
						// =======================================
						// �ʉݒP�ʂ̎擾
						// =======================================
						st.sett_CUR_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CURRNCY_CD());
						List listCur_unitInfo = entity.mgetCUR_UNIT.read(conn,st);
						if(listCur_unitInfo == null || listCur_unitInfo.size() != 1){
							//���Џ�񂪖���/������
							st.setg_CUR_UNIT("");
                            st.setg_CUR_UNIT2("");
                            st.setDECIMAL_FIG("0");
                            this.decimalFig = 0;
						}else{
							st.setg_CUR_UNIT(((KU0030010Struct)listCur_unitInfo.get(0)).getg_CUR_UNIT());
                            st.setg_CUR_UNIT2(st.getg_CUR_UNIT());
                            st.setDECIMAL_FIG(((KU0030010Struct)listCur_unitInfo.get(0)).getDECIMAL_FIG());
                            this.decimalFig = Integer.parseInt(st.getDECIMAL_FIG());
						}
						listCur_unitInfo = null;

						// =======================================
						// �󒍖��ׂ̓��l�敪�̎擾�@�Ɓ@���i�P���Ɖ�ʒP���̔���
						// =======================================
						//���l�敪
						String strSpclPriceTyp = "";
						//���l�敪�̎擾
						strSpclPriceTyp = this.replaceNull(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SPCL_PRICE_TYP());
						//���i�P���̐��i�P��
						String strUnitCost = "";
						//�����l�̃Z�b�g
						st.setmUnitCost_IN_COMPANYCD(st.getstrCOMPANY_CD());
						st.setmUnitCost_IN_CUSTCD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_CD());
						st.setmUnitCost_IN_ITEMCD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD());
						st.setmUnitCost_IN_EFFPHASEINDATE(st.geth_GYOMU_DATE());//��ʂ̏o�׎��ѓ�--�Ɩ����t
						//���l�敪=0�Ɛݒ�l�������ꍇ
						if("0".equals(strSpclPriceTyp) || "".equals(strSpclPriceTyp)){
							//���i�P���e�[�u���̓Ǎ�
							List listM_UNIT_COST = entity.mtblM_UNIT_COST.read(conn,st);
							//�Ȃ��̏ꍇ�A���[�j���O��\������
							if(listM_UNIT_COST == null || listM_UNIT_COST.size() < 1){
							}else{
								//���i�P���̐��i�P���̎擾
								strUnitCost = (((KU0030010Struct)listM_UNIT_COST.get(0)).getmUnitCost_UNIT_COST());
								st.seth_UNIT_PRICE(strUnitCost);
							}
						}

					}
					// Add Start 20140401 zhang-zl
					lot_flg = false;
					// Add End 20140401 zhang-zl
					
					listT_SHIP_ODR.clear();
				} // LOOP�G���h
			}else{
				// =======================================
				// ��ʕ\���s�����J��Ԃ�(�o�׎��ѓo�^�ȊO�̏ꍇ)
				// =======================================
				for(int i=0;i<hyouji_kensu;i++){
					KU0030010Struct st = (KU0030010Struct)list.get(i);

					// =======================================
					// ���N�G�X�g��Struct�Ɋi�[
					// =======================================

					st.setg_SLIP_CD			("");	//�`�[�ԍ�
					st.setg_DATE			("");	//�o�ד�
					st.setg_DESINATED_SHIP_DATE ("");	//�o�׎w���
					st.setg_SHIP_QTY2		("");		//���ѐ���
					st.setg_SHIP_QTY		("");		//�w����
					st.seth_SHIP_QTY			("");
					st.setg_UNIT_PRICE			("");		//�P��
					st.setg_SHIP_ODR_AMOUNT		("");		//���z
					st.seth_EXCH_TYP			("");
					st.setg_WH_CD			("");		//�ۊǋ�
					st.setg_REMARKS			("");		//���l
					st.setg_CURRNCY				("");
					st.setg_CUST_ANAME			("");		//���Ӑ旪��
					st.setg_CUST_ITEM_CD		("");		//���Ӑ�i�ڔԍ�
					st.setg_ITEM_CD			("");		//�i�ڔԍ�
					st.setg_JOB_ODR_CD("");		//����
					st.seth_ITEM_CD				("");
					st.seth_AP_SECRTY_TYP		("");
					st.seth_MODFIY_CNT			("");
					st.seth_RETURN_QTY			("");
					st.seth_TOTAL_SHIP_QTY		("");
					st.setg_CUR_UNIT("");

                    st.setg_STOCK_UNIT("");
                    st.setg_STOCK_UNIT2("");
                    st.setg_CUR_UNIT2("");
                    st.setg_WH_NAME("");
                    st.setg_ITEM_NAME("");
                    st.setg_SALES_DEPT_CD("");
                    st.setg_ORG_NAME("");
                    st.setg_CUST_CD("");
                    st.setg_CUST_ITEM_NAME("");
                    st.setg_CUST_ODR_NO("");
                    st.setg_ODR_NO("");
                    st.setg_PART_DLV_SEQ_NO("");
                    st.setg_SHIP_ODR_NO("");

					st.setg_SLIP_CD((String)struct.getList_g_SLIP_CD().get(i));		//�`�[�ԍ�
					st.seth_GYOMU_DATE(struct.geth_GYOMU_DATE());
					st.setg_DATE(struct.geth_GYOMU_DATE());
					st.setg_DIRECT_DLV_FLG("");					// �݌Ƀ`�F�b�N�Ȃ��t���O
					// =======================================
					// �o�׎��я��̎擾
					// =======================================
					//�L�[�F�`�[�ԍ�
					st.setserTori_IN_SLIPCD(st.getg_SLIP_CD());

					List listT_SHIP = entity.mtbl_T_SHIP.read(conn, st);

					if(listT_SHIP == null || listT_SHIP.size() == 0){
						//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "ZZ06001");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
					}else{

						st.setg_SLIP_CD(this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SLIP_CD()));
						st.setg_DESINATED_SHIP_DATE(this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_DATE()));
						st.setg_SHIP_QTY(this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_QTY()));

						st.seth_SHIP_QTY(this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_QTY()));
						if(null==st.getg_SHIP_QTY2() || st.getg_SHIP_QTY2().equals("")){
							st.setg_SHIP_QTY2(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_QTY());
						}
						if(null==st.getg_UNIT_PRICE() || st.getg_UNIT_PRICE().equals("")){
							st.setg_UNIT_PRICE(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_UNIT_PRICE());
						}
						st.setg_CURRNCY(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUR_NAME());
						if(null==st.getg_WH_CD() || st.getg_WH_CD().equals("")){
							st.setg_WH_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ALLCT_WH_CD());
						}

						st.setg_SHIP_ODR_AMOUNT(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_AMOUNT());
						st.setg_CUST_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_ITEM_CD());
						st.setg_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ITEM_CD());
						st.setg_JOB_ODR_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_JOB_ODR_CD());
						st.seth_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ITEM_CD());
						st.seth_EXCH_TYP(((KU0030010Struct)listT_SHIP.get(0)).getserTori_EXCH_TYP());
						st.seth_GYOMU_DATE(st.geth_GYOMU_DATE());
						st.seth_MODFIY_CNT(((KU0030010Struct)listT_SHIP.get(0)).getserTori_MODIFY_COUNT());
						st.seth_RETURN_QTY(((KU0030010Struct)listT_SHIP.get(0)).getserTori_RETURN_QTY());
						st.seth_TOTAL_SHIP_QTY(((KU0030010Struct)listT_SHIP.get(0)).getserTori_TOTAL_SHIP_QTY());

                        st.setg_CUST_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_CD());
                        st.setg_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ODR_NO());
                        st.setg_PART_DLV_SEQ_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_PART_DLV_SEQ_NO());
                        st.setg_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO());
                        st.setg_CUST_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_ODR_NO());
                        st.setg_SALES_DEPT_CD(((KU0030010Struct)listT_SHIP.get(0)).getserToriSALES_DEPT_CD());
                        st.seth_DATE(st.getg_DESINATED_SHIP_DATE());
                        st.setg_DIRECT_DLV_FLG(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DIRECT_DLV_FLG());
                        st.setserTodrMODIFY_COUNT(((KU0030010Struct)listT_SHIP.get(0)).getserTodrMODIFY_COUNT());
                        st.setserTori_SHIP_SEQ_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_SEQ_NO());
                        if ("1".equals(st.getg_DIRECT_DLV_FLG())){
                        	st.setg_DIRECT_DLV_FLG("true");
                        }

                        // Add Start 20140311 ma-jf
                        st.seth_LOT_CTRL_FLG(((KU0030010Struct)listT_SHIP.get(0)).geth_LOT_CTRL_FLG());
                        // Add End 20140311 ma-jf
                        
						// =======================================
						// �ʉݒP�ʂ̎擾
						// =======================================
						st.sett_CUR_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CURRNCY_CD());
						List listCur_unitInfo = entity.mgetCUR_UNIT.read(conn,st);
						if(listCur_unitInfo == null || listCur_unitInfo.size() != 1){
							//���Џ�񂪖���/������
							st.setg_CUR_UNIT("");
                            st.setg_CUR_UNIT2("");
                            st.setDECIMAL_FIG("0");
                            this.decimalFig = 0;
						}else{
							st.setg_CUR_UNIT(((KU0030010Struct)listCur_unitInfo.get(0)).getg_CUR_UNIT());
                            st.setg_CUR_UNIT2(st.getg_CUR_UNIT());
                            st.setDECIMAL_FIG(((KU0030010Struct)listCur_unitInfo.get(0)).getDECIMAL_FIG());
                            this.decimalFig = Integer.parseInt(st.getDECIMAL_FIG());
						}
						listCur_unitInfo = null;

						// =======================================
						// �C���X�g�[���I�v�V�����̃`�F�b�N
						// =======================================
						String tmpSTATUS = null;	// ��ԋ敪
						if (entity.mchkSysInstallOptions.check(conn,st)) {
							// �u���|�Ǘ��v�T�u�V�X�e�����C���X�g�[������Ă���ꍇ
							// �u���|�Ǘ��T�u�V�X�e���Ǘ��}�X�^�v����h�`�[�Ǘ��O���[�v�h���擾����
							List listSysArCtrl = entity.mreadSysArCtrl.read(conn,st);
							if(listSysArCtrl == null || listSysArCtrl.size() == 0){
								// ���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
								ok_flg = false;
								ExpjMessage emsg = new ExpjMessage( "KI00006");
								msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
								sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
								break;
							} else {
								//�`�[�Ǘ��O���[�v
								st.setstrSLIP_CTRL_GRP(((KU0030010Struct)listSysArCtrl.get(0)).getstrSLIP_CTRL_GRP());

								
								st.setstrSLIP_CD(st.getg_SLIP_CD());
								//���|�������w�b�_�e�[�u���̓Ǎ�
								List listT_AR_LEDGER_H = entity.mreadT_AR_LEDGER_H.read(conn,st);

								if(listT_AR_LEDGER_H == null || listT_AR_LEDGER_H.size() == 0){
									//���|���g�����w�b�_�e�[�u���̓Ǎ�
									List listT_AR_LEDGER_H_TRN = entity.mreadT_AR_LEDGER_H_TRN.read(conn,st);
									if(listT_AR_LEDGER_H_TRN == null || listT_AR_LEDGER_H_TRN.size() == 0){
										// ���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
										ok_flg = false;
										ExpjMessage emsg = new ExpjMessage( "KU02003");
										msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
										sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
										break;
									} else {
										// �u���|���g�����w�b�_�v�́h��ԋ敪�h���擾����
										tmpSTATUS = ((KU0030010Struct)listT_AR_LEDGER_H_TRN.get(0)).getstrSTATUS();
									}
									listT_AR_LEDGER_H_TRN = null;
								} else {
									// �u���|�������w�b�_�v�́h��ԋ敪�h���擾����
									tmpSTATUS = ((KU0030010Struct)listT_AR_LEDGER_H.get(0)).getstrSTATUS();
								}
								listT_AR_LEDGER_H = null;
							}
							listSysArCtrl = null;

						} else {
							// �u���|�Ǘ��v�T�u�V�X�e�����C���X�g�[������Ă��Ȃ��ꍇ
							// �u������сv�́h��ԋ敪�h���擾����
							tmpSTATUS = ((KU0030010Struct)listT_SHIP.get(0)).getserTori_STATUS();
						}

						// =======================================
						// ��ԋ敪�A�����敪������E�ԕi�۔���
						// =======================================
						rv = isToriHanEnable(tmpSTATUS, ((KU0030010Struct)listT_SHIP.get(0)).getserTori_INSPC_ACPT_TYP());
																							// �u������сv�̌����敪
						if (rv == 1) {
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "KU02001");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
							break;
						}
						if (rv == 2) {
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "KU02002");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
							break;
						}
						if (rv == 3) {
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "BD00027");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
							break;
						}

                        // �a���q�ɋ敪 = 20:�a��
                        if ("20".equals(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DEPO_TYP())) {
                            if("RECALL".equals(strSelPtn)){
                                ok_flg = false;
                                ExpjMessage emsg = new ExpjMessage("KU02013");
                                msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
                                sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
                                break;
                            }
                        }
                        
                        // Add Start 20140401 zhang-zl
    					st.setreadT_Ship_Inst_Ship_Seq_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_SEQ_NO());
    					lot_flg = true;
    					// Add End 20140401 zhang-zl
					}
					
					listT_SHIP.clear();

				} // LOOP�G���h
			}

            // �e����擾
            KU0030010Struct st = (KU0030010Struct) list.get(0);

            // �i�ڏ��擾
            // �i�ږ��C�P�ʁC�݌ɐ��P�ʋ敪
            st.setmItem_IN_ITEMCD(st.getg_ITEM_CD());
            List listM_ITEM = entity.mtbl_M_ITEM.read(conn, st);
            if (!listM_ITEM.isEmpty()) {
                KU0030010Struct tempSt = (KU0030010Struct) listM_ITEM.get(0);
                st.setg_ITEM_NAME(tempSt.getmItem_ITEM_NAME());
                st.setg_STOCK_UNIT(tempSt.getmItem_STOCK_UNIT());
                st.setg_STOCK_UNIT2(st.getg_STOCK_UNIT());
                st.setUNIT_QTY_TYP(tempSt.getmItem_UNIT_QTY_TYP());
            }
            listM_ITEM.clear();

            st.setUNIT_FIG("4");
            if ("1".equals(st.getUNIT_QTY_TYP())) {
                st.setUNIT_FIG("0");
            }

            // ���Ӑ���擾
            // ���Ӑ於�C�ۂߋ敪�C���ВS������R�[�h
            st.setmCust_IN_COMPANYCD(st.getstrCOMPANY_CD());
            st.setmCust_IN_CUSTCD(st.getg_CUST_CD());
            List listM_CUST = entity.mtbl_M_CUST.read(conn, st);
            st.setROUND_TYP("ROUND");
            String sOwnOrgCd = "";
            if (!listM_CUST.isEmpty()) {
                KU0030010Struct tempSt = (KU0030010Struct) listM_CUST.get(0);
                st.setg_CUST_ANAME(tempSt.getmCust_CUST_NAME());
                sOwnOrgCd = tempSt.getmCust_OWN_ORG_CD();
                
                if ("2".equals(tempSt.getmCust_DETAIL_ROUND_TYP())) {
                    st.setROUND_TYP("CEIL");
                }
                else if ("3".equals(tempSt.getmCust_DETAIL_ROUND_TYP())) {
                    st.setROUND_TYP("FLOOR");
                }
                // �ב֎��
                if ((st.geth_EXCH_TYP() == null) ||
                    (st.geth_EXCH_TYP().length() == 0)) {
                    st.seth_EXCH_TYP(tempSt.getmCust_EXCH_TYP());
                }
            }

            // �ۊǋ���擾
            // �ۊǋ於
            st.setmWh_IN_WH_CD(st.getg_WH_CD());
            List listM_WH = entity.mtbl_M_WH.read(conn, st);
            if (!listM_WH.isEmpty()) {
                KU0030010Struct tempSt = (KU0030010Struct) listM_WH.get(0);
                st.setg_WH_NAME(tempSt.getmWh_WH_NAME());
            }
            listM_WH.clear();

            // ���i���擾
            // ���Ӑ�i�ږ��C����v�㕔��R�[�h
            st.setmItemSpec_IN_COMPANY_CD(st.getstrCOMPANY_CD());
            st.setmItemSpec_IN_CUST_CD(st.getg_CUST_CD());
            st.setmItemSpec_IN_CUST_ITEM_CD(st.getg_CUST_ITEM_CD());
            List listM_ITEM_SPEC = entity.mtbl_M_ITEM_SPEC.read(conn, st);
            String sSalesDeptCd = "";
            if (!listM_ITEM_SPEC.isEmpty()) {
                KU0030010Struct tempSt = (KU0030010Struct) listM_ITEM_SPEC.get(0);
                st.setg_CUST_ITEM_NAME(tempSt.getmItemSpec_CUST_ITEM_NAME());
                sSalesDeptCd = tempSt.getmItemSpec_SALES_DEPT_CD();
            }
            listM_ITEM_SPEC.clear();

            // ������擾
            // ����R�[�h�C���喼
            if ( (st.getg_SALES_DEPT_CD() == null) ||
                (st.getg_SALES_DEPT_CD().length() == 0)) {
                st.setg_SALES_DEPT_CD(sSalesDeptCd);
            }
            
            if ( (st.getg_SALES_DEPT_CD() == null) ||
                (st.getg_SALES_DEPT_CD().length() == 0)) {
                st.setg_SALES_DEPT_CD(sOwnOrgCd);
            }
            
            st.setmOrg_IN_COMPANYCD(st.getstrCOMPANY_CD());
            st.setmOrg_IN_ORGCD(st.getg_SALES_DEPT_CD());
            List listM_ORG = entity.mtbl_M_ORG.read(conn, st);
            if (!listM_ORG.isEmpty()) {
                KU0030010Struct tempSt = (KU0030010Struct) listM_ORG.get(0);
                st.setg_ORG_NAME(tempSt.getmOrg_ORG_NAME());
            }
            listM_ORG.clear();
            
	        // Add Start 20140311 ma-jf
            if (lot_flg) {
            	List listT_SHIP_INST = entity.mgetLOT_NO.read(conn, st);
                if (listT_SHIP_INST != null && listT_SHIP_INST.size() == 1) {
                	struct.setg_STOCK_LOT_CD(((KU0030010Struct)listT_SHIP_INST.get(0)).getreadT_Ship_Inst_Lot_NO()); // �݌Ƀ��b�g�ԍ�
        			st.setg_STOCK_LOT_CD(((KU0030010Struct)listT_SHIP_INST.get(0)).getreadT_Ship_Inst_Lot_NO()); // �݌Ƀ��b�g�ԍ�
                }else {
                	struct.setg_STOCK_LOT_CD(null); // �݌Ƀ��b�g�ԍ�
        			st.setg_STOCK_LOT_CD(null); // �݌Ƀ��b�g�ԍ�
                }
            } else {
            	struct.setg_STOCK_LOT_CD(null); // �݌Ƀ��b�g�ԍ�
    			st.setg_STOCK_LOT_CD(null); // �݌Ƀ��b�g�ԍ�
            }
            
			// ���b�g�Ǘ��������Ă��Ȃ��ꍇ�A�݌Ƀ��b�g�ԍ����}�X�N����A���b�g�Ǘ��@�\�����삵�Ȃ��B
			if (!LotCtrl.checkLotCtrl(conn)) {
                st.seth_LOT_CTRL_FLG("0");
			}
	        // Add End 20140311 ma-jf

            //�x���ȊO�̃G���[�������Ȃ��ꍇOK�ɂ���
            if (ok_flg == true) {
				struct.seth_RESULT("OK");
				struct.seth_SELECT_FG("OK");
			}
			
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

		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
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
				}
			}
		}
                //}}user_implement_dev:<controlsearch>
		logger.exiting("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlsearch");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		try {
			this.conn.beginTransWeb();

			boolean ok_flg = true;
			int rv;

			// �������ʃt���O��NG�ɐݒ�
			struct.seth_RESULT("OK");

			// �ۊǋ於��
			String strWH_NAME = null;
			
			ExchAmount ex = new ExchAmount(conn);

			Numbering ISSUE_CD = null;		//���o�ɊǗ��ԍ��̔Ԃ̏���

			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				// �o�׎w���
				//if(chkProcExecDate("2",struct.getg_DESINATED_SHIP_DATE(),struct.getg_DESINATED_SHIP_DATE()) == false){
				//	setErrorMessage(ProcExecDateError);
				//	setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
				//	setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
				//	return;
				//}else{
					// �o�׎��ѓ�
					if(chkProcExecDate("1","",struct.getg_DATE()) == false){
						setErrorMessage(ProcExecDateError);
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
						return;
					}
				
			}
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

				KU0030010Struct st = (KU0030010Struct)list.get(i);

				// =======================================
				// ���N�G�X�g��Struct�Ɋi�[
				// =======================================
				st.setg_SLIP_CD((String)struct.getList_g_SLIP_CD().get(i));	//�`�[�ԍ�
				st.setg_SHIP_QTY2((String)struct.getList_g_SHIP_QTY2().get(i));	//���ѐ���
				st.seth_SHIP_QTY((String)struct.getList_h_SHIP_QTY().get(i));
				st.setg_UNIT_PRICE((String)struct.getList_g_UNIT_PRICE().get(i));//�P��
				st.setg_WH_CD((String)struct.getList_g_WH_CD().get(i));		//�q��
				st.setg_JOB_ODR_CD((String)struct.getList_g_JOB_ODR_CD().get(i));		//����
				st.setg_REMARKS((String)struct.getList_g_REMARKS().get(i));	//���l
				st.seth_GYOMU_DATE(st.geth_GYOMU_DATE());			//�Ɩ����t
				st.setg_DATE((String)struct.getList_g_DATE().get(i));
				st.seth_MODFIY_CNT((String)struct.getList_h_MODFIY_CNT().get(i));
                st.setg_SALES_DEPT_CD((String)struct.getList_g_SALES_DEPT_CD().get(i));
                st.setg_SHIP_ODR_AMOUNT((String)struct.getList_g_SHIP_ODR_AMOUNT().get(i));
                st.setg_DIRECT_DLV_FLG((String)mass.get(i));				//�����t���O
                // Add Start 20140311 ma-jf
                st.setg_STOCK_LOT_CD((String)struct.getList_g_STOCK_LOT_CD().get(i)); // �݌Ƀ��b�g�ԍ�
                // Add End 20140311 ma-jf
				// =======================================
				// �`�[�ԍ��ȗ����͎��̍s����������
				// =======================================
				if(st.getg_SLIP_CD().equals("")){
					continue;
				}

                // ������擾
                st.setmOrg_IN_COMPANYCD(st.getstrCOMPANY_CD());
                st.setmOrg_IN_ORGCD(st.getg_SALES_DEPT_CD());
                List listM_ORG = entity.mtbl_M_ORG.read(conn, st);
                if (listM_ORG.isEmpty()) {
                    listM_ORG.clear();
                    ok_flg = false;
                    ExpjMessage emsg = new ExpjMessage( "KA00058");
                    msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
                    sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
                    continue;
                }else{
                    KU0030010Struct tempSt = (KU0030010Struct)listM_ORG.get(0);
                    st.setg_ORG_NAME(tempSt.getmOrg_ORG_NAME());
                }
                listM_ORG.clear();

				// =======================================
				// DB�֘A�`�F�b�N���������O�s��
				// =======================================
				st.setserInsert_IN_SLIPCD(st.getg_SLIP_CD());
				List listT_SHIP_ODR = entity.mtbl_T_SHIP_ODR.read(conn, st);

				if(listT_SHIP_ODR == null || listT_SHIP_ODR.size() != 1){
					listT_SHIP_ODR.clear();
					//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
					ok_flg = false;
					ExpjMessage emsg = new ExpjMessage( "KU00026");
					msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
					
					continue;
				}else{
					//�a���q�ɋ敪
					String strDepoTyp = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DEPO_TYP();
                    // Add Start 20140311 ma-jf
					//���b�g�Ǘ��t���O
					String strLotCtrlFlg = ((KU0030010Struct)listT_SHIP_ODR.get(0)).geth_LOT_CTRL_FLG();
					if (!LotCtrl.checkLotCtrl(conn)) {
						strLotCtrlFlg = "0";
					}
                    // Add End 20140311 ma-jf

					// Add Start 20131223 liu-j
					// �[�i�\���
					String strScdlDlvDate = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SCDL_DLV_DATE();
					// Add End 20131223 liu-j
					// =======================================
					//��ʂ�����͂����ۊǋ�̃}�X�^���݃`�F�b�N
					// =======================================
					st.setchkisWhCd_IN_WHCD(st.getg_WH_CD());
					st.setchkisWhCd_IN_WHTYP(this.m_DEPO_TYP);

					List listchkWhCd = entity.mchkIsWhCd.read(conn, st);

					if(listchkWhCd == null || listchkWhCd.size() != 1){
						//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
						listchkWhCd.clear();
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KA00116");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
						
						continue;
					}else{
						// �ۊǋ於�̎擾
						strWH_NAME = ((KU0030010Struct)listchkWhCd.get(0)).getchkisinWhCd_WH_NAME();
					}
					listchkWhCd.clear();

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


					//�ۊǋ�ʍ݌�TBL�ɑ��݉ۂ̃`�F�b�N
					st.setserTitemStock_IN_ITEMCD(st.getg_ITEM_CD());
					st.setserTitemStock_IN_JOBODRCD(st.getg_JOB_ODR_CD());
					st.setserTitemStock_IN_WHCD(st.getg_WH_CD());

					List listchkItemStock = null;

		            // Add Start 20140311 ma-jf
					//���b�g�Ǘ��t���O���u 0�F���b�g�Ǘ����s��Ȃ��v�̏ꍇ
					if ("0".equals(strLotCtrlFlg)){
			        // Add End 20140311 ma-jf
						if (st.getserTitemStock_IN_JOBODRCD() == null || st.getserTitemStock_IN_JOBODRCD().equals(""))
						{
							// �i�ڍ݌Ƀ`�F�b�N
							listchkItemStock = entity.mtbl_T_ITEM_STOCK.read(conn,st);
						} else {
							// ���ԍ݌Ƀ`�F�b�N
							listchkItemStock = entity.mtbl_T_JOB_ODR_CD_STOCK.read(conn,st);
						}
	
						if(listchkItemStock == null || listchkItemStock.size() == 0){
							//�ۊǋ�ʍ݌�TBL�ɑ��݂��Ȃ��ꍇ�A�f�[�^��ǉ�����
							st.setcreTitemStock_ITEM_CD(st.getg_ITEM_CD());
							st.setcreTitemStock_JOB_ODR_CD(st.getg_JOB_ODR_CD());
							st.setcreTitemStock_WH_CD(st.getg_WH_CD());
							st.setcreTitemStock_STOCK_ON_HAND_QTY("0");
							List listGetPlantCd = entity.mgetPlantFromWhCd.read(conn,st);
							if(listGetPlantCd == null || listGetPlantCd.size() == 0){
							} else {
								st.setcreTitemStock_PLANT_CD(((KU0030010Struct)listGetPlantCd.get(0)).getcreTitemStock_PLANT_CD());
							}
	
							if (st.getserTitemStock_IN_JOBODRCD() == null || st.getserTitemStock_IN_JOBODRCD().equals("") )
							{
								// �i�ڍ݌ɍX�V
								rv = entity.mtbl_T_ITEM_STOCK.create(conn, st);
							} else {
								// ���ԍ݌ɍX�V
								rv = entity.mtbl_T_JOB_ODR_CD_STOCK.create(conn, st);
							}
							//�L���݌ɐ��ʂ��擾���ďo�׎��ѐ��Ɣ�r�`�F�b�N
							//�o�׎��ѐ����L���݌ɐ���(�����ȊO�̏ꍇ�̂�)
							double intPblShipQty = 0;
							if (intPblShipQty < Double.parseDouble(st.getg_SHIP_QTY2())) {
								if ("1".equals(st.getg_DIRECT_DLV_FLG())){
								    ExpjMessage emsg = new ExpjMessage("KU02015");
							    	msgStruct.addWarn(emsg);
								} else {
									ok_flg = false;
									ExpjMessage emsg = new ExpjMessage("KU00032");
									msgStruct.addError(emsg);
									continue;	
								}
							}
							listGetPlantCd.clear();
						}else {
							//�L���݌ɐ��ʂ��擾���ďo�׎��ѐ��Ɣ�r�`�F�b�N
							//�o�׎��ѐ����L���݌ɐ���(�����ȊO�̏ꍇ�̂�)
							double intPblShipQty = Double.parseDouble(((KU0030010Struct)listchkItemStock.get(0)).getserTitemStock_STOCK_ON_HAND_QTY());
							if (intPblShipQty < Double.parseDouble(st.getg_SHIP_QTY2())) {
								if ("1".equals(st.getg_DIRECT_DLV_FLG())){
								    ExpjMessage emsg = new ExpjMessage("KU02015");
							    	msgStruct.addWarn(emsg);
								} else {
									ok_flg = false;
									ExpjMessage emsg = new ExpjMessage("KU00032");
									msgStruct.addError(emsg);
									continue;	
								}
							}
						}
						
			        // Add Start 20140311 ma-jf
					} else {
						//���b�g�Ǘ��t���O��1�F���b�g�Ǘ����s���̏ꍇ
						//[���].�g�݌Ƀ��b�g�ԍ��h��Null�ȊO�ꍇ
						if (st.getg_STOCK_LOT_CD() != null && !st.getg_STOCK_LOT_CD().equals("")) {

							st.setchkLOT_NO(st.getg_STOCK_LOT_CD()); //�݌Ƀ��b�g�ԍ�
							st.setchkITEM_CD(st.getg_ITEM_CD()); //�i�ڔԍ�
							if (!entity.mchk_T_LOT_CTRL.check(conn, st)) {
								ok_flg = false;
								ExpjMessage emsg = new ExpjMessage("AF20002"); //�w�肳�ꂽ�i�ڔԍ��ƍ݌Ƀ��b�g�ԍ��ň�v���郍�b�g�Ǘ��f�[�^�͑��݂��܂���
								msgStruct.addError(emsg);
								continue;	
							}
						}
						
						double dblLotStockQty = 0;
						// ��������
						st.setgetQtyITEM_CD(st.getg_ITEM_CD()); //�i�ڔԍ�
						st.setgetQtyWH_CD(st.getg_WH_CD());
						st.setgetQtyLOT_NO(st.getg_STOCK_LOT_CD()); //�݌Ƀ��b�g�ԍ�
						listchkItemStock = entity.mgetQTY_T_LOT_STOCK.read(conn,st);
						if (listchkItemStock != null && listchkItemStock.size() > 0) {
							KU0030010Struct stTLotStock = (KU0030010Struct) listchkItemStock.get(0);
							dblLotStockQty = Double.parseDouble(chkNulltoZero(stTLotStock.getgetQtySTOCK_ON_HAND_QTY())) -
									Double.parseDouble(chkNulltoZero(stTLotStock.getgetQtyALCD_QTY()));
						}
						if (dblLotStockQty < Double.parseDouble(st.getg_SHIP_QTY2())) {
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage("KU00032");
							msgStruct.addError(emsg);
							continue;	
						}
					}
					if (listchkItemStock != null) {
		            // Add End 20140311 ma-jf
						listchkItemStock.clear();
		            // Add Start 20140311 ma-jf
					}
		            // Add End 20140311 ma-jf

					// �o�׎w��.�a���݌ɐU�֏���F ���擾����
					String strDepoTransferProcFlg = this.replaceNull(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DEPO_TRANSFER_PROC_FLG());

					//�󒍖��ׂ�����擾
					//�L�[�ݒ�
					st.settOdr_IN_ODRNO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ODR_NO());//�󒍔ԍ�

					String strSpclPriceTyp = "";			//���l�敪
					String strODRTotalShipQty = "";			//�o�׎��ї݌v��
					String strODRShipAmount = "";			//�o�׎��ы��z
					String strODRShipAmountExchRates = "";			//�o�׎��ы��z(�M��)
					String strOdrQty = "";				//�󒍐���
					String strOdrCmplyFlg = "";						//�󒍊����t���O
					String strOdrCmplyDate = "";					//�󒍊�����

					String strIfCtrNo = "";				//IF�Ǘ��ԍ�
					String strPartDlvCount = "";			//���[��
					String strShipCnt = "";				//�o�׉�
					String strPuchOdrQtyTotal = "";			//����������

					String strOdrDlvKeyNo = "";//�[�i�L�[�ԍ�
					String strPartName = "";//��ʕi��
					String strDlvLocNameKanji = "";//�[�i�ꏊ��(����)
					String strBuyerName = "";//�w���S��
					String strDesinatedDlvDate = "";//�w��[��
					String strDlvOdrQty = "";//�[���w������
					String strUnitCdOrg = ""; //�P��(�ݒ�l�ύX)
					String strInspcTyp = "";//�����敪
					String strClientRemark = "";//�����Ҕ��l
					String strClientBarcodeInf = "";//�����҃o�[�R�[�h���
					// Add Start 20131223 liu-j
					String strTaxCd = ""; //����ŃR�[�h
					String strDlvLocCd = ""; //�[�i�ꏊ�R�[�h
					String strOdrCurrncyCd = ""; // �ʉ݃R�[�h
					String strExchTyp = ""; // �ב֎��
					// Add End 20131223 liu-j


					List listT_ODR = entity.mtbl_T_ODR.read(conn, st);
					if(listT_ODR == null || listT_ODR.size() != 1){
						//�G���[
					}else{
						strSpclPriceTyp = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_SPCL_PRICE_TYP());		//���l�敪
						strODRTotalShipQty = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_TOTAL_SHIP_QTY());		//�o�׎��ї݌v��
						strODRShipAmount = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_SHIP_AMOUNT());			//�o�׎��ы��z
						strODRShipAmountExchRates = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_SHIP_AMOUNT_EXCH_RATES());//�o�׎��ы��z(�M��)
						strOdrQty = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_ODR_QTY());				//�󒍐���
						strIfCtrNo = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_IF_CTL_NO());				//IF�Ǘ��ԍ�
						strPartDlvCount = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_PART_DLV_COUNT());		//���[��
						strShipCnt = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_SHIP_CNT());				//�o�׉�
						strPuchOdrQtyTotal = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_PUCH_ODR_QTY_TOTAL());	//����������
						strOdrCmplyFlg = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_ODR_CMPLT_FLG());			//�󒍊����t���O
						strOdrCmplyDate = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_ODR_CMPLT_DATE());		//�󒍊�����
						strOdrDlvKeyNo = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_DLV_KEY_NO());//�[�i�L�[�ԍ�
						strPartName = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_PART_NAME());//��ʕi��
						strDlvLocNameKanji = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_DLV_LOC_NAME_KANJI());//�[�i�ꏊ��(����)
						strBuyerName = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_BUYER_NAME());//�w���S��
						strDesinatedDlvDate = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_DESINATED_DLV_DATE());//�w��[��
						strDlvOdrQty = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_ODR_QTY());//�[���w������
						strUnitCdOrg = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_UNIT_CD_ORG()); //�P��(�ݒ�l�ύX)
						strInspcTyp = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_INSPC_TYP());//�����敪
						strClientRemark = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_CLIENT_REMARK());//�����Ҕ��l
						strClientBarcodeInf = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_CLIENT_BARCODE_INF());//�����҃o�[�R�[�h���
						// Add Start 20131223 liu-j
						strTaxCd = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_TAX_CD()); //����ŃR�[�h
						strDlvLocCd = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_DLV_LOC_CD()); //�[�i�ꏊ�R�[�h
						strOdrCurrncyCd = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_CURRNCY_CD()); //�ʉ݃R�[�h
						strExchTyp = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_EXCH_TYP()); //�ב֎��
						// Add End 20131223 liu-j


					}
					listT_ODR.clear();

					//���l�敪=0�Ɛݒ�l�������ꍇ�A��ʂ̒l���`�F�b�N
					if("0".equals(strSpclPriceTyp) || "".equals(strSpclPriceTyp)){
						List listM_UNIT_COST = entity.mtblM_UNIT_COST.read(conn,st);
						if(listM_UNIT_COST == null || listM_UNIT_COST.size() < 1){
							if("0".equals(strSpclPriceTyp) || "".equals(strSpclPriceTyp)){
							}
						}else{
							String strUnitCost = (((KU0030010Struct)listM_UNIT_COST.get(0)).getmUnitCost_UNIT_COST());

						}
					}

				// ======================================================
				// �o�׎��ѐ��� < �o�׎w�����ʂ̏ꍇ
				// ======================================================

				if (Double.parseDouble(st.getg_SHIP_QTY2()) < Double.parseDouble(st.getg_SHIP_QTY())) {

					// �o�׎w�����ʂ���͂����o�׎��ѐ��ʂƂ���
					String serInsertShipOdrNo = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_ODR_NO();
					st.setdiffSHIP_ODR_NO(serInsertShipOdrNo); //�o�׎w���ԍ�
					st.setdiffSHIP_QTY(st.getg_SHIP_QTY2()); // ���͂����o�׎��ѐ���

					//�o�׎w�����z�A�o�׎w�����z�i�M�݁j�̍Čv�Z

					// �ב֎�ʁA���׌v�Z�܂�ߋ敪�擾
					st.setmCust_IN_COMPANYCD(st.getstrCOMPANY_CD());
					st.setmCust_IN_CUSTCD(struct.getg_CUST_CD());
					List _difflistM_CUST = entity.mtbl_M_CUST.read(conn, st);
					st.setROUND_TYP("ROUND");
					if (!_difflistM_CUST.isEmpty()) {
						KU0030010Struct tempSt = (KU0030010Struct) _difflistM_CUST.get(0);
						// Add Start 20131223 liu-j
						// �����敪
						INSPC_ACPT_TYP = tempSt.getmCust_INSPC_ACPT_TYP();
						// Add End 20131223 liu-j
						// ���׌v�Z�܂�ߋ敪
						if ("2".equals(tempSt.getmCust_DETAIL_ROUND_TYP())) {
							st.setROUND_TYP("CEIL");
						}
						else if ("3".equals(tempSt.getmCust_DETAIL_ROUND_TYP())) {
							st.setROUND_TYP("FLOOR");
						}

						// �ב֎��
						if ((st.geth_EXCH_TYP() == null) || (st.geth_EXCH_TYP().length() == 0)) {
							st.seth_EXCH_TYP(tempSt.getmCust_EXCH_TYP());
						}
					}

					// ���͂����o�׎��ѐ��ʂ��o�׎w�����ʂƂ��čČv�Z����
					String orgdiffstrAmount = this.calMultiply(st.getg_SHIP_QTY2(),st.getg_UNIT_PRICE()); // �ۂߑO�o�׎w�����z
					String orgdiffstrShipOdrAmount = "";//�o�׎w�����z
					String orgdiffstrShipOdrAmountExchRates = "";//�o�׎w�����z�i�M��)

					st.setdiffCURRENCY_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CURRNCY_CD());// �ʉ݃R�[�h

					// �o�׎w�����z�擾
			        if(ex.doMarume(orgdiffstrAmount, st.getstrCOMPANY_CD(), st.getdiffCURRENCY_CD(), st.geth_EXCH_TYP(), st.getROUND_TYP(), st.getstrBUSINESS_OPR_DATE())){
			        	orgdiffstrShipOdrAmount = ex.getS_EXCH_AMOUNT();
			        }else{
			        	ok_flg = false;
						ExpjMessage emsg = new ExpjMessage("KQ00038");
					    msgStruct.addError(emsg);
			            continue;
			        }

					// �o�׎w�����z�i�M�݁j�擾
			        // Mod Start 20140328 liu-j
					//if(ex.doExchAmount(orgdiffstrAmount, st.getstrCOMPANY_CD(), st.getdiffCURRENCY_CD(), st.geth_EXCH_TYP(), st.getROUND_TYP(),struct.getg_DESINATED_SHIP_DATE())){
			        if(ex.doExchAmount(orgdiffstrAmount, st.getstrCOMPANY_CD(), strOdrCurrncyCd, strExchTyp, st.getROUND_TYP(),struct.getg_DESINATED_SHIP_DATE())){
					// Mod End 20140328 liu-j	
						orgdiffstrShipOdrAmountExchRates = ex.getS_EXCH_AMOUNT();
					}else{
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage("KQ00038");
						msgStruct.addError(emsg);
	                    continue;
					}

					st.setdiffSHIP_ODR_AMOUNT(orgdiffstrShipOdrAmount);// �o�׎w�����z
					st.setdiffSHIP_ODR_AMOUNT_EXCH_RATE(orgdiffstrShipOdrAmountExchRates);// �o�׎w�����z�i�M�݁j�i�o�׎w�����z��M�݂Ŋ��Z�j

					// �X�V���`�F�b�N
					List modifyCountList = entity.mselectT_SHIP_ODR_MODIFY_COUNT.read(conn, st);
					if (modifyCountList.isEmpty()) {
						ExpjMessage emsg = new ExpjMessage("ZZ01105");
						msgStruct.addError(emsg);
						conn.rollback();
						return;
					}else{
						KU0030010Struct modifyCountStruct = (KU0030010Struct)modifyCountList.get(0);
						if (st.getselMODIFY_COUNT() != null && !"".equals(st.getselMODIFY_COUNT()) && !st.getselMODIFY_COUNT().equals(modifyCountStruct.getselTShipOdr_MODIFY_COUNT())) {
							ExpjMessage emsg = new ExpjMessage("ZZ01105");
							msgStruct.addError(emsg);
							conn.rollback();
							return;
						}
					}
					rv = entity.mdiffT_SHIP_ODR.update(conn,st);

					// �o�ד`�[���A�b�v�f�[�g

					st.setupdiffSLIP_CD(st.getg_SLIP_CD()); // �`�[�ԍ�

					st.setupdiffSHIP_ODR_QTY(st.getg_SHIP_QTY2()); // �o�׎w������
					// Add Start 20131223 liu-j
					if ("2".equals(INSPC_ACPT_TYP) || "3".equals(INSPC_ACPT_TYP)){
						// [���Ӑ�[�i�ꏊ].�g�^�������h
						String strTransportLt = "0";
						st.setmCustBase_IN_COMPANYCD(struct.getstrCOMPANY_CD());
						String strCust = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_CD();
						st.setmCustBase_IN_CUSTCD(strCust);
						st.setmCustBase_IN_DLVLOCCD(strDlvLocCd);

						List listMCustBase = entity.mtbl_M_CUST_BASE.read(conn,st);
						if(listMCustBase == null || listMCustBase.size() != 1){
							//�G���[����
						}else{
							strTransportLt = this.replaceNull(((KU0030010Struct)listMCustBase.get(0)).getmCustBase_TRANSPORT_LT());
						}
						// �o�׏���LT�̎擾
						String strSyuKaLt = "0";
						List listShipCd = new ArrayList();
						listShipCd = entity.mgetSYUKA_LT.read(conn,st);
						if(listShipCd == null || listShipCd.size() != 1){
		                    ok_flg = false;
							ExpjMessage emsg = new ExpjMessage("KQ00037");
							msgStruct.addError(emsg);
							continue;

						}else{
							strSyuKaLt = this.replaceNull(((KU0030010Struct)listShipCd.get(0)).getstrSYUKA_LT());
						}
						int iAddDays = Integer.parseInt(strTransportLt) +  Integer.parseInt(strSyuKaLt) ;
						String strAddDays = String.valueOf(iAddDays);
						// [���].�g�o�׎��ѓ��h �{[���Ӑ�[�i�ꏊ].�g�^�������h�{�o�׏����k�s
						String strItem = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD();
						strScdlDlvDate = getScdlDlvDate(st, st.getg_DATE(), strAddDays, strItem);
					} else if ("1".equals(INSPC_ACPT_TYP)){
						strScdlDlvDate = st.getg_DATE();
					}
					
					// ����ŃR�[�h
					st.setupdiffTAX_CD(strTaxCd);
					// �[�i�\���
					SCDL_DLV_DATE = "";
					SCDL_DLV_DATE = strScdlDlvDate;
					// �o�׎��ѓo�^����(�m�o�ד`�[�n�̍X�V)
					CALCU_TAX_TYPE = "1";
					// Add End 20131223 liu-j

					//����ŋ��z�v�Z

					String updifftaxAmount[] = this.doCalcuTaxAmount(st, st.getg_CUST_CD(),st.getstrCOMPANY_CD(),st.getg_ITEM_CD(), orgdiffstrShipOdrAmount);

					st.setupdiffTAX_AMOUNT_1(updifftaxAmount[0]);		// �Ŋz�P
					st.setupdiffTAX_AMOUNT_2(updifftaxAmount[1]);		// �Ŋz�Q
					st.setupdiffTAX_AMOUNT_3(updifftaxAmount[2]);		// �Ŋz�R

					st.setupdiffEXTERNAL_TAX_SALES_AMOUNT("0");	// �O�őΏۋ��z
					st.setupdiffINTERNAL_TAX_SALES_AMOUNT("0");	// ���őΏۋ��z
					st.setupdiffTAXFREE_SALES_AMOUNT("0");		// ��ېőΏۋ��z
					st.setupdiffEXTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i�O�Łj
					st.setupdiffINTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i���Łj

					String updiffsTmpTax = Calculate.add(updifftaxAmount[0], updifftaxAmount[1]);
					updiffsTmpTax = Calculate.add(updiffsTmpTax, updifftaxAmount[2]);
					double updifftmpTax = Double.parseDouble(updiffsTmpTax);
					
					if ("1".equals(this.TAX_KBN)){
						st.setupdiffEXTERNAL_TAX_AMOUNT(String.valueOf(updifftmpTax));
						st.setupdiffEXTERNAL_TAX_SALES_AMOUNT(orgdiffstrShipOdrAmount);
					} else
					if ("5".equals(this.TAX_KBN) || "9".equals(this.TAX_KBN)){
						st.setupdiffINTERNAL_TAX_AMOUNT(String.valueOf(updifftmpTax));
						st.setupdiffINTERNAL_TAX_SALES_AMOUNT(orgdiffstrShipOdrAmount);
					} else
					if ("0".equals(this.TAX_KBN)){
						st.setupdiffTAXFREE_SALES_AMOUNT(orgdiffstrShipOdrAmount);
					}

					updifftmpTax = Double.parseDouble(st.getupdiffEXTERNAL_TAX_AMOUNT())
							+Double.parseDouble(st.getupdiffINTERNAL_TAX_AMOUNT());
					st.setupdiffTAX_AMOUNT(String.valueOf(updifftmpTax));			//����ŋ��z(�~��)-�ݒ薳��

					updifftmpTax = Double.parseDouble(st.getupdiffEXTERNAL_TAX_SALES_AMOUNT())
							+Double.parseDouble(st.getupdiffINTERNAL_TAX_SALES_AMOUNT())
							+Double.parseDouble(st.getupdiffTAXFREE_SALES_AMOUNT())
							-Double.parseDouble(st.getupdiffINTERNAL_TAX_AMOUNT());

					st.setupdiffTAX_CREDIT_SALES_AMOUNT(String.valueOf(updifftmpTax));	// �Ŕ�������z

	                String updifftmpTaxExchRates = "0";
	                // Mod Start 20140409 liu-j
	                //if(ex.doExchAmount(String.valueOf(updifftmpTax), st.getstrCOMPANY_CD(),st.getdiffCURRENCY_CD(), st.geth_EXCH_TYP(), st.getROUND_TYP(), struct.getg_DESINATED_SHIP_DATE())){
	                if(ex.doExchAmount(String.valueOf(updifftmpTax), st.getstrCOMPANY_CD(), strOdrCurrncyCd, strExchTyp, st.getROUND_TYP(), struct.getg_DESINATED_SHIP_DATE())){
	                // Mod End 20140409 liu-j
	                	updifftmpTaxExchRates = ex.getS_EXCH_AMOUNT();
	                }
					st.setupdiffOWN_CUR_TAXCREDIT_SALES_AMOUNT(updifftmpTaxExchRates);	// �Ŕ�������z�i�M�݁j

					st.setupdiffSHIP_ODR_AMOUNT(String.valueOf(updifftmpTax));	//�o�׎w�����z
					updifftmpTax = updifftmpTax + Double.parseDouble(st.getupdiffTAX_AMOUNT());
					st.setupdiffSHIP_ODR_AMOUNT_TAX(String.valueOf(updifftmpTax));					//�o�׎w�����z(�ō�)

					rv = entity.mdiffT_SHIP_SLIP.update(conn, st);

					// �o�׎w������ = �o�׎w������ - �o�׎��ѐ��� �̏o�׎w����V�K�쐬

					// �o�׎w���ԍ��A�`�[�ԍ����擾
					Numbering SHIP_ODR_NO = null;		//�o�׎w���ԍ��̔Ԃ̏���
					Numbering SLIP_CD = null;			//�`�[�ԍ��̔Ԃ̏���
					//�o�׎w���ԍ��A�`�[�ԍ��������̔Ԃ���


					SHIP_ODR_NO = new Numbering(conn,Numbering.SHIP_ODR_NO,struct.getsUser_ID(),"KU0030010",struct.getstrPLANT_CD());
					SLIP_CD = new Numbering(conn,Numbering.SLIP_CD,struct.getsUser_ID(),"KU0030010",struct.getstrPLANT_CD());
					st.setdiffSHIP_ODR_NO(SHIP_ODR_NO.getNo()); //�o�׎w���ԍ�
					st.setdiffSLIP_CD(SLIP_CD.getNo());// �`�[�ԍ�

					st.setdiffODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ODR_NO()); //�󒍔ԍ�
					st.setdiffPART_DLV_SEQ_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_PART_DLV_SEQ_NO()); // ���[����
					st.setdiffITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD());// �i�ڔԍ�
					// Mod Start 20140328 liu-j
					// st.setdiffJOB_ODR_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_JOB_ODR_CD());// ����
					st.setdiffJOB_ODR_CD(st.getg_JOB_ODR_CD());// ����
					// Mod End 20140328 liu-j
					st.setdiffCUST_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_ITEM_CD());// ���Ӑ�i�ڔԍ�
					st.setdiffCUST_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_ODR_NO());// ���Ӑ撍���ԍ�
					st.setdiffCUST_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_CD());// ���Ӑ�R�[�h
					st.setdiffCUST_NAME(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_NAME()); // ���Ӑ於
					st.setdiffCUST_CHRG_PSN_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_CHRG_PSN_CD()); // �c�ƒS���҃R�[�h
					st.setdiffSHIP_ODR_ISS_PSN_CD(this.getsysUSER_CD());// ���s�S���҃R�[�h�E���O�C�����[�UID�Ƃ���
					st.setdiffDLV_LOC_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DLV_LOC_CD()); // �[�i�ꏊ�R�[�h
					st.setdiffDEPO_TYP(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DEPO_TYP());// �a���q�ɋ敪
					st.setdiffDESINATED_SHIP_DATE(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DESINATED_SHIP_DATE()); // �o�׎w���
					st.setdiffSCDL_DLV_DATE(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SCDL_DLV_DATE());// �[�i�\���

					// �o�׎w������ - ���͂����o�׎��ѐ���
					String ShipQty = Double.parseDouble(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_QTY()) - Double.parseDouble(st.getg_SHIP_QTY2()) + "";
					st.setdiffSHIP_QTY(ShipQty); // �o�׎w�����ʁi�o�׎w������ - ���͂����o�׎��ѐ��ʁj

					st.setdiffTOTAL_SHIP_QTY("0");// �o�׎��ї݌v���i0�j
					st.setdiffRETURN_QTY("0"); // �ԕi���ʁi0�j
					st.setdiffUNIT_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_UNIT_CD());// �P��
					st.setdiffUNIT_PRICE(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_UNIT_PRICE());// �P��
					st.setdiffCURRENCY_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CURRNCY_CD());// �ʉ݃R�[�h

					String diffstrAmount = this.calMultiply(st.getdiffSHIP_QTY(),st.getdiffUNIT_PRICE()); // �ۂߑO�o�׎w�����z
					String diffstrShipOdrAmount = "";//�o�׎w�����z
					String diffstrShipOdrAmountExchRates = "";//�o�׎w�����z�i�M��)
					
					// �ב֎�ʁih_EXCH_TYP�j�A���׌v�Z�܂�ߋ敪�iROUND_TYP�j�擾�ς�

					// �o�׎w�����z�擾
			        if(ex.doMarume(diffstrAmount, st.getstrCOMPANY_CD(), st.getdiffCURRENCY_CD(), st.geth_EXCH_TYP(), st.getROUND_TYP(), st.getstrBUSINESS_OPR_DATE())){
			        	diffstrShipOdrAmount = ex.getS_EXCH_AMOUNT();
			        }else{
			        	ok_flg = false;
						ExpjMessage emsg = new ExpjMessage("KQ00038");
						msgStruct.addError(emsg);
						continue;
			        }

					// �o�׎w�����z�i�M�݁j�擾
			        // Mod Start 20140409 liu-j 
					//if(ex.doExchAmount(diffstrAmount, st.getstrCOMPANY_CD(), st.getdiffCURRENCY_CD(), st.geth_EXCH_TYP(), st.getROUND_TYP(), struct.getg_DESINATED_SHIP_DATE())){
					if(ex.doExchAmount(diffstrAmount, st.getstrCOMPANY_CD(), strOdrCurrncyCd, strExchTyp, st.getROUND_TYP(), struct.getg_DESINATED_SHIP_DATE())){
					// Mod End 20140409 liu-j 
						diffstrShipOdrAmountExchRates = ex.getS_EXCH_AMOUNT();
					}else{
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage("KQ00038");
						msgStruct.addError(emsg);
						continue;
					}


					st.setdiffSHIP_ODR_AMOUNT(diffstrShipOdrAmount);// �o�׎w�����z
					st.setdiffSHIP_ODR_AMOUNT_EXCH_RATE(diffstrShipOdrAmountExchRates);// �o�׎w�����z�i�M�݁j�i�o�׎w�����z��M�݂Ŋ��Z�j

					st.setdiffLOC_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_LOC_CD());// ���P�[�V�����ԍ�
					st.setdiffPKG_UNIT_QTY(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_PKG_UNIT_QTY());// �׎p�P�ʐ�
					st.setdiffREMARKS(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_REMARKS());// ���l
					
					//�ݒ�p�[�i�L�[�ԍ�
					String strDlvKeyNo = "";
					if("".equals(strOdrDlvKeyNo) || strOdrDlvKeyNo == null){
						//�[�i�L�[�ԍ��̒l�������ꍇ�o�׎w���ԍ�
						strDlvKeyNo = st.getdiffSHIP_ODR_NO();
					}else{
						strDlvKeyNo = strOdrDlvKeyNo;
					}

					st.setdiffDLV_KEY_NO(strDlvKeyNo);// �[�i�L�[�ԍ�

					st.setdiffPART_DLV_COUNT("0"); // ���[�񐔁i0)
					st.setdiffTRANSPORT_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_TRANSPORT_CD());// �^���փR�[�h
					st.setdiffTRANSPORT_TYP(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_TRANSPORT_TYP());// �A���`�ԋ敪
					st.setdiffALLCT_WH_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ALLCT_WH_CD());// �����ۊǋ�
					st.setdiffTRANSFER_WH_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_TRANSFER_WH_CD());// �U�֐�ۊǋ�
					st.setdiffDIRECT_DLV_FLG(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DIRECT_DLV_FLG());// �݌Ƀ`�F�b�N�Ȃ��t���O
					st.setdiffENTRY_TYP(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ENTRY_TYP());// �f�[�^���͋敪
					st.setdiffPRINT_FLG(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_PRINT_FLG());// ���[�o�̓t���O
					st.setdiffSHIP_CMPLT_FLG(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHP_CMPLT_FLG());// ���я����t���O
					st.setdiffDEPO_TRANSFER_PROC_FLG(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DEPO_TRANSFER_PROC_FLG());// �a���݌ɐU�֏����t���O
					st.setdiffDEL_FLG(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DEL_FLG());// �폜�t���O

					rv = entity.mdiffT_SHIP_ODR.create(conn,st);

					// �o�׎w������ = �o�׎w������ - �o�׎��ѐ��� �̏o�׎w����V�K�쐬�I��

					// =======================================
					// �󒍖���TBL�̍X�V
					// =======================================
					//�󒍔ԍ��P�ʂŏo�׉񐔂��X�V����B(�o�׉�+1)���[�񐔂�1�Ƃ���B
					st.setdiffuptOdr_IN_ODRNO(st.getg_ODR_NO());
					st.setdiffuptOdr_SHIP_CNT(Integer.parseInt(strShipCnt)+1+"");
					st.setdiffuptOdr_PART_DLV_COUNT(Integer.parseInt(strPartDlvCount)+1+"");

					rv = entity.mupdateT_ODR.update(conn,st);

					// =======================================
					// �o�ד`�[�s�a�k�̍쐬
					// =======================================

					st.setin_tShipSlip_SLIP_CD(st.getdiffSLIP_CD());					//�`�[�ԍ�
					st.setin_tShipSlip_ITEM_CD(st.getdiffITEM_CD());				//�i��
					st.setin_tShipSlip_CUST_ITEM_CD(st.getdiffCUST_ITEM_CD());			//�ڋq�i��
					st.setin_tShipSlip_PART_NAME(strPartName);				//�i��
					st.setin_tShipSlip_CUST_ODR_NO(st.getdiffCUST_ODR_NO());				//�ڋq�����ԍ�
					st.setin_tShipSlip_CUST_CD(st.getdiffCUST_CD());					//�ڋq�R�[�h
					st.setin_tShipSlip_CUST_NAME(st.getdiffCUST_NAME());				//�ڋq����(�ڋq���̂�ݒ�)
					st.setin_tShipSlip_DLV_LOC_CD(st.getdiffDLV_LOC_CD());				//�[�i�ꏊ�R�[�h
					st.setin_tShipSlip_DLV_LOC_NAME_KANJI(strDlvLocNameKanji);			//�[�i�ꏊ��(����)
					st.setin_tShipSlip_BUYER_NAME(strBuyerName);				//�w���S��
					st.setin_tShipSlip_CUS_DLV_KEY_CD(st.getdiffDLV_KEY_NO());				//�[�i�L�[�ԍ�
					st.setin_tShipSlip_DESINATED_SHIP_DATE(st.getdiffDESINATED_SHIP_DATE());	//�o�׎w���
					st.setin_tShipSlip_DESINATED_DLV_DATE(strDesinatedDlvDate);			//�w��[��
					st.setin_tShipSlip_SCDL_DLV_DATE(st.getdiffSCDL_DLV_DATE());				//�[���\���
					st.setin_tShipSlip_PUCH_ODR_QTY_TOTAL(strPuchOdrQtyTotal);			//����������
					st.setin_tShipSlip_DLV_ODR_QTY(strDlvOdrQty);				//�[���w������
					st.setin_tShipSlip_SHIP_ODR_QTY(st.getdiffSHIP_QTY());		//�o�׎w������
					st.setin_tShipSlip_UNIT_CD(strUnitCdOrg);					//�P��(�ݒ�l�ύX)
					st.setin_tShipSlip_UNIT_PRICE(st.getdiffUNIT_PRICE());				//�P��

					st.setin_tShipSlip_INSPC_TYP(strInspcTyp);					//�����敪
					st.setin_tShipSlip_CLIENT_REMARK_KANJI(strClientRemark);			//�����Ҕ��l
					st.setin_tShipSlip_CLIENT_BARCODE_INF(strClientBarcodeInf);			//�����҃o�[�R�[�h���
					st.setin_tShipSlip_PRINT_FLG("0");					//���[�o��F
					st.setin_tShipSlip_DEL_FLG("0");					//�폜F

					// Add Start 20131223 liu-j
					// �o�׎��ѓo�^����(�m�o�ד`�[�n�̓o�^)
					CALCU_TAX_TYPE = "2";
					if ("1".equals(INSPC_ACPT_TYP)){
						// [�o�׎w��]."�o�׎w���"
						strScdlDlvDate = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DESINATED_SHIP_DATE();
					}else {
						// [�o�׎w��]."�[�i�\���"
						strScdlDlvDate = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SCDL_DLV_DATE();
					}
					SCDL_DLV_DATE = strScdlDlvDate;
					// Add End 20131223 liu-j
					
					//����ŋ��z�v�Z
					String difftaxAmount[] = this.doCalcuTaxAmount(st, st.getin_tShipSlip_CUST_CD(),st.getstrCOMPANY_CD(),st.getin_tShipSlip_ITEM_CD(), diffstrShipOdrAmount);

					st.setin_tShipSlip_TAX_AMOUNT_1(difftaxAmount[0]);		// �Ŋz�P
					st.setin_tShipSlip_TAX_AMOUNT_2(difftaxAmount[1]);		// �Ŋz�Q
					st.setin_tShipSlip_TAX_AMOUNT_3(difftaxAmount[2]);		// �Ŋz�R

					st.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT("0");	// �O�őΏۋ��z
					st.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT("0");	// ���őΏۋ��z
					st.setin_tShipSlip_TAXFREE_SALES_AMOUNT("0");		// ��ېőΏۋ��z
					st.setin_tShipSlip_EXTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i�O�Łj
					st.setin_tShipSlip_INTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i���Łj

					String diffsTmpTax = Calculate.add(difftaxAmount[0], difftaxAmount[1]);
					diffsTmpTax = Calculate.add(diffsTmpTax, difftaxAmount[2]);
					double difftmpTax = Double.parseDouble(diffsTmpTax);
					
					if ("1".equals(this.TAX_KBN)){
						st.setin_tShipSlip_EXTERNAL_TAX_AMOUNT(String.valueOf(difftmpTax));
						st.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(diffstrShipOdrAmount);
					} else
					if ("5".equals(this.TAX_KBN) || "9".equals(this.TAX_KBN)){
						st.setin_tShipSlip_INTERNAL_TAX_AMOUNT(String.valueOf(difftmpTax));
						st.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(diffstrShipOdrAmount);
					} else
					if ("0".equals(this.TAX_KBN)){
						st.setin_tShipSlip_TAXFREE_SALES_AMOUNT(diffstrShipOdrAmount);
					}

					difftmpTax = Double.parseDouble(st.getin_tShipSlip_EXTERNAL_TAX_AMOUNT())
							+Double.parseDouble(st.getin_tShipSlip_INTERNAL_TAX_AMOUNT());
					st.setin_tShipSlip_TAX_AMOUNT(String.valueOf(difftmpTax));			//����ŋ��z(�~��)-�ݒ薳��

					difftmpTax = Double.parseDouble(st.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT())
							+Double.parseDouble(st.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT())
							+Double.parseDouble(st.getin_tShipSlip_TAXFREE_SALES_AMOUNT())
							-Double.parseDouble(st.getin_tShipSlip_INTERNAL_TAX_AMOUNT());

					st.setin_tShipSlip_TAX_CREDIT_SALES_AMOUNT(String.valueOf(difftmpTax));	// �Ŕ�������z

	                String difftmpTaxExchRates = "0";
	                // Mod Start 20140409 liu-j
	                //if(ex.doExchAmount(String.valueOf(difftmpTax), st.getstrCOMPANY_CD(),st.getdiffCURRENCY_CD(), st.geth_EXCH_TYP(), st.getROUND_TYP(), struct.getg_DESINATED_SHIP_DATE())){
	                if(ex.doExchAmount(String.valueOf(difftmpTax), st.getstrCOMPANY_CD(), strOdrCurrncyCd, strExchTyp, st.getROUND_TYP(), struct.getg_DESINATED_SHIP_DATE())){
	                // Mod End 20140409 liu-j
	                	difftmpTaxExchRates = ex.getS_EXCH_AMOUNT();
	                }
					st.setin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(difftmpTaxExchRates);	// �Ŕ�������z�i�M�݁j

					st.setin_tShipSlip_SHIP_ODR_AMOUNT(String.valueOf(difftmpTax));	//�o�׎w�����z//sww�C��20040729
					difftmpTax = difftmpTax + Double.parseDouble(st.getin_tShipSlip_TAX_AMOUNT());
					st.setin_tShipSlip_SHIP_ODR_AMOUNT_TAX(String.valueOf(difftmpTax));					//�o�׎w�����z(�ō�)

					//�o�ד`�[���R�[�h�쐬
					rv = entity.mtbl_T_SHIP_SLIP.create(conn, st);

					// �o�׎w���o�^�������b�Z�[�W�\������B
					if (st.getdiffSHIP_ODR_NO() != null && !st.getdiffSHIP_ODR_NO().equals("") ) {
						ExpjMessage emsg = new ExpjMessage("KU00109",st.getdiffSHIP_ODR_NO());
						msgStruct.addInfo(emsg);
						sysLog.info(emsg,getsysUSER_CD());
					}

					// �o�ד`�[�o�^�������b�Z�[�W�\������B
					if (st.getdiffSLIP_CD() != null && !st.getdiffSLIP_CD().equals("") ) {
						ExpjMessage emsg = new ExpjMessage("KU00110",st.getdiffSLIP_CD());
						msgStruct.addInfo(emsg);
						sysLog.info(emsg,getsysUSER_CD());
					}
					
					
				}

				// ======================================================
				// �o�׎��ѐ��� < �o�׎w�����ʂ̏ꍇ�I��
				// ======================================================

					if(!this.m_DEPO_TYP.equals(strDepoTyp) ){
						//�y�a���o�ׂ̏����z;

						//�a���̏ꍇ�A�݌Ɉړ����s���Ă��Ȃ��ꍇ�A�݌Ɉړ����ɍs��

						String strRoundTyp = "";
						st.setmCust_IN_COMPANYCD(st.getstrCOMPANY_CD());
						st.setmCust_IN_CUSTCD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_CD());
						List listM_CUST = entity.mtbl_M_CUST.read(conn,st);
						if(listM_CUST == null || listM_CUST.size()==0){
							//�G���[����
						}else{
							strRoundTyp = (((KU0030010Struct)listM_CUST.get(0)).getmCust_DETAIL_ROUND_TYP());
						}
						listM_CUST.clear();

						String strShipOdrAmount="0";		//���z
						String strShipOdrAmountExchRates="0";	//���z(�M��)
						String strCurrncyCd = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CURRNCY_CD();//�ʉ݃R�[�h

						String strAmount = ex.doMul(st.getg_SHIP_QTY2(), st.getg_UNIT_PRICE());
						if(ex.doMarume(strAmount, st.getstrCOMPANY_CD(), strCurrncyCd, st.geth_EXCH_TYP(), strRoundTyp, struct.geth_GYOMU_DATE())){
							strShipOdrAmount = ex.getS_EXCH_AMOUNT();
						}else{
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "KQ00038");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
							
							continue;
						}
						if(ex.doExchAmount(strShipOdrAmount, st.getstrCOMPANY_CD(), strCurrncyCd, st.geth_EXCH_TYP(), strRoundTyp, struct.getg_DESINATED_SHIP_DATE())){
							strShipOdrAmountExchRates = ex.getS_EXCH_AMOUNT();
						}else{
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "KQ00038");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

							continue;
						}
						//�݌Ɉړ����s��
		                // Add Start 20140311 ma-jf
						//���b�g�Ǘ��t���O�� 0�F���b�g�Ǘ����s��Ȃ��̏ꍇ
						if ("0".equals(strLotCtrlFlg)) {
			            // Add End 20140311 ma-jf
							// =======================================
							// �ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�̍X�V
							// =======================================
							String strItemCd = st.getg_ITEM_CD();
							String strJobOdrCd = st.getg_JOB_ODR_CD();//����
							String strWhCd = st.getg_WH_CD();//�q��
							boolean bdo_update = true;
							String strStockOnHandQtyYotaku = "0"; // �莝�݌ɐ��i�a���j
							String strStockOnHandQty = ""; // �莝�݌ɐ��i�a���ł͂Ȃ��j
							
							for(int x=0; x < 2; x++){
								
								if(x==1){//�a���̏ꍇ�̂�
									//�U�֐�ۊǋ��ݒ�
									strWhCd = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_TRANSFER_WH_CD();
								}
									//�ۊǋ悩����擾
								st.setserTitemStock_IN_ITEMCD(strItemCd);
								st.setserTitemStock_IN_WHCD(strWhCd);
								// Mod Start 20140409 liu-j
								// List listT_ITEM_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn,st);
								List listT_ITEM_STOCK;
								if (x == 1){
									listT_ITEM_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn,st);
								} else {
									if (st.getserTitemStock_IN_JOBODRCD() == null || st.getserTitemStock_IN_JOBODRCD().equals(""))
									{
										// �i�ڍ݌Ƀ`�F�b�N
										listT_ITEM_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn,st);
									} else {
										// ���ԍ݌Ƀ`�F�b�N
										listT_ITEM_STOCK = entity.mtbl_T_JOB_ODR_CD_STOCK.read(conn,st);
									}
								}
								
								// Mod End 20140409 liu-j
								if(listT_ITEM_STOCK == null || listT_ITEM_STOCK.size() != 1){
									//�a���q�ɂ̕ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�������ꍇ�쐬
									if(x==1){//�a���ꍇ�̂�
										bdo_update = false;//�a�����R�[�h�쐬�̏ꍇ�͍X�V���Ȃ��B
										st.setcreTitemStock_ITEM_CD(strItemCd);
										st.setcreTitemStock_WH_CD(strWhCd);
										//�a���̍쐬���͎莝���ʂ��o�׎��ѐ��ʂɂȂ�B
										st.setcreTitemStock_STOCK_ON_HAND_QTY(st.getg_SHIP_QTY2());
	
										//�ۊǋ�̍H��R�[�h���擾
										st.setmWh_IN_WH_CD(strWhCd);
										st.setcreTitemStock_PLANT_CD(getPlantCd(st));	//�H��R�[�h
										//List listGetPlantCd = entity.mgetPlantFromWhCd.read(conn,st);
	
										//st.setcreTitemStock_PLANT_CD(((KU0030010Struct)listGetPlantCd.get(0)).getcreTitemStock_PLANT_CD());
										rv = entity.mtbl_T_ITEM_STOCK.create(conn, st);
									}
	
								}else{
									// �莝���݌ɐ��擾
									if (x == 1) {								
										// �a��
										strStockOnHandQtyYotaku = this.replaceNull(((KU0030010Struct)listT_ITEM_STOCK.get(0)).getserTitemStock_STOCK_ON_HAND_QTY());
									} else {
										// �a���ł͂Ȃ�
										strStockOnHandQty = this.replaceNull(((KU0030010Struct)listT_ITEM_STOCK.get(0)).getserTitemStock_STOCK_ON_HAND_QTY());
									}
								}
								listT_ITEM_STOCK.clear();
	
								if(bdo_update){//�a�����R�[�h���L��ꍇ�Əo�ɕۊǋ�̏ꍇ�̂ݍX�V
									
									st.setupTitemStock_IN_ITEMCD(strItemCd);
									st.setupTitemStock_IN_JOBODRCD(strJobOdrCd);
									st.setupTitemStock_IN_WHCD(strWhCd);
	
									if(x==0){
										//�ʏ�A�o�ɕۊǋ�̏ꍇ
										//�i�ڕʎ莝�݌�=�i�ڕʎ莝�݌�(�O)-���.���ѐ���
										st.setupTitemStock_STOCK_ON_HAND_QTY(Double.parseDouble(chkNulltoZero(strStockOnHandQty))-Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2()))+"");
										if (st.getupTitemStock_IN_JOBODRCD().equals(""))
										{
											//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�X�V
											rv = entity.mtbl_T_ITEM_STOCK.update(conn, st);
										} else {
											//�ۊǋ�ʐ��ԍ݌Ƀ��R�[�h�X�V
											rv = entity.mtbl_T_JOB_ODR_CD_STOCK.update(conn, st);
										}
									} else {
										//���ɕۊǋ�̏ꍇ(�a���̏ꍇ)
										//�i�ڕʎ莝�݌�=�i�ڕʎ莝�݌�(�O)+���.���ѐ���
										st.setupTitemStock_STOCK_ON_HAND_QTY(Double.parseDouble(chkNulltoZero(strStockOnHandQtyYotaku))+Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2()))+"");
										//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�X�V
										rv = entity.mtbl_T_ITEM_STOCK.update(conn, st);
									}
								
								}
							}
	
							// =======================================
							// �ۊǋ�ʕi�ړ��o�Ƀ��R�[�h�̍쐬
							// =======================================
							// �R�l�N�V������n���āA�̔Ԃ̏���
							ISSUE_CD = new Numbering(conn,Numbering.ISSUE_CD,st.getsUser_ID(),"KU0030010",st.getstrPLANT_CD());
							String strRcvIssueTyp = "2";//���o�ɋ敪(�o��:2)
							String strRcvIssueGnrTyp = "31";//���o�ɔ����敪(�ʏ�o��:31)
	
							strWhCd = st.getg_WH_CD();//�q��
							strJobOdrCd = st.getg_JOB_ODR_CD();//����
	
							if(!this.m_DEPO_TYP.equals(strDepoTyp)){
								strRcvIssueGnrTyp = "23";//���o�ɔ����敪(�a���o��:23)
							}
	
							for(int x=0; x < 2; x++){
								if(x==1){
									// �a���̏ꍇ
									strWhCd = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_TRANSFER_WH_CD();
									strRcvIssueTyp = "1"; //���o�ɋ敪(�a�����ɔ���:1)
									strRcvIssueGnrTyp = "13";//���o�ɔ����敪(�a������:13)
								}
								//�ۊǋ�̍H��R�[�h���擾
								st.setmWh_IN_WH_CD(strWhCd);
								st.setcreTrcvIssue_PLANT_CD(getPlantCd(st));	//�H��R�[�h
	
								st.setcreTrcvIssue_RCV_ISSUE_CTRL_CD(ISSUE_CD.getNo());
								st.setcreTrcvIssue_RCV_ISSUE_TYP(strRcvIssueTyp); //���o�ɋ敪(���ɁF�P�^�o�ɁF2)
								st.setcreTrcvIssue_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD());//�i��
								//st.setcreTrcvIssue_PLANT_CD(st.getstrPLANT_CD());		//�H��R�[�h
								st.setcreTrcvIssue_WH_CD(strWhCd);				//�q��
												
								// ���o�ɑO�݌ɐ��ƁA���o�ɐ���ݒ�
								if(x==0)
								{	//�o�בq��
								// Mod Strat 20140328 liu-j
								//st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(strStockOnHandQty); // ���o�ɑO�݌ɐ�
								st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(chkNulltoZero(strStockOnHandQty)); // ���o�ɑO�݌ɐ�
								// Mod End 20140328 liu-j
									st.setcreTrcvIssue_RCV_ISSUE_QTY(Double.toString( (-1) * Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2()))));		//���o�ɐ�
								}
								else
								{
									// �a���p�q��
								// Mod Strat 20140328 liu-j
								//st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(strStockOnHandQtyYotaku); // ���o�ɑO�݌ɐ�
								st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(chkNulltoZero(strStockOnHandQtyYotaku)); // ���o�ɑO�݌ɐ�
								// Mod End 20140328 liu-j
									st.setcreTrcvIssue_RCV_ISSUE_QTY(st.getg_SHIP_QTY2());		//���o�ɐ�
								}
	
								// ���Ԃ̓o�^
								if(x==0)
								{	//�o�בq��
									st.setcreTrcvIssue_JOB_ODR_CD(strJobOdrCd);
								}
								else
								{
									// �a���p�q��
									st.setcreTrcvIssue_JOB_ODR_CD("");
								}
	
								st.setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(Calculate.add(st.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(),st.getcreTrcvIssue_RCV_ISSUE_QTY())); // ���o�Ɍ�݌ɐ�
								
								st.setcreTrcvIssue_RCV_ISSUE_AMOUNT("0");		//���o�ɋ��z
								st.setcreTrcvIssue_RCV_ISSUE_DATE(st.getg_DATE());	//���o�ɔN����
								st.setcreTrcvIssue_RCV_ISSUE_COMMENT(st.getg_REMARKS());	//���o�ɔ��l
								st.setcreTrcvIssue_RCV_ISSUE_GNR_TYP(strRcvIssueGnrTyp);	//���o�ɔ����敪(���i�q�Ɂ��ڋq:31)
								st.setcreTrcvIssue_STOCK_UPD_TYP("2");				//�݌ɍX�V�敪
								st.setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG("1");			//���o�Ɋ����t���O
	
								//�ۊǋ�ʓ��o�Ƀ��R�[�h�쐬
								rv = entity.mtbl_T_RCV_ISSUE.create(conn, st);
							}
			            // Add Start 20140311 ma-jf
						} else {
							//���b�g�Ǘ��t���O��1�F���b�g�Ǘ����s���̏ꍇ
							String strItemCd = st.getg_ITEM_CD(); //�i�ڔԍ�
							String strWhCd = st.getg_WH_CD(); //�ۊǋ�R�[�h
							String strStockLotCD = st.getg_STOCK_LOT_CD(); //�݌Ƀ��b�g�ԍ�
							String strWhCdTransfer = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_TRANSFER_WH_CD(); //�U�֐�ۊǋ��ݒ�
							
							String strMayShipQty = st.getg_SHIP_QTY2(); //�ϐ��u�o�׉\���v=[���]."�o�׎��ѐ���"
							String strRealShipQty = st.getg_SHIP_QTY2(); //�ϐ��u�o�׎��ѐ��ʁv=[���]."�o�׎��ѐ���"
							
							st.setreadTlotStock_IN_ITEM_CD(strItemCd);
							st.setreadTlotStock_IN_WH_CD(strWhCd);
							st.setreadTlotStock_IN_LOT_NO(strStockLotCD);
							List listT_LOT_STOCK = entity.mreadT_LOT_STOCK.read(conn, st);
							if (listT_LOT_STOCK != null && listT_LOT_STOCK.size() > 0) {
								for (int j=0; j<listT_LOT_STOCK.size(); j++) {
									KU0030010Struct lotst = (KU0030010Struct)listT_LOT_STOCK.get(j);
									
									String strStockOnHandQty = this.chkNulltoZero(lotst.getreadTlotStock_STOCK_ON_HAND_QTY()); //���b�g�ʎ莝�݌�
									String strAlcdQty = this.chkNulltoZero(lotst.getreadTlotStock_ALCD_QTY()); //�����ϐ���
									String strRealLotQty = Calculate.subtract(strStockOnHandQty, strAlcdQty); //���b�g�݌ɐ�
									String strStockOnHandQtyYotaku = "0"; // �莝�݌ɐ��i�a���j
									
									if (compDecimal(new BigDecimal(strRealLotQty), new BigDecimal(strRealShipQty))) {
										strMayShipQty = strRealShipQty; //�ϐ��u�o�׉\���v�@���@�ϐ��u�o�׎��ѐ��ʁv
									} else {
										strMayShipQty = strRealLotQty; //�ϐ��u�o�׉\���v�@���@[���b�g�ʕi�ڍ݌�].�h���b�g�ʎ莝�݌Ɂh - [���b�g�ʕi�ڍ݌�].�h�����ϐ��ʁh
									}

									// =======================================
									// �ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�̍X�V
									// =======================================
									//�ۊǋ悩����擾
									st.setserTitemStock_IN_ITEMCD(strItemCd);
									st.setserTitemStock_IN_WHCD(strWhCd);
									List listT_ITEM_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn,st);
									if (listT_ITEM_STOCK != null && listT_ITEM_STOCK.size() == 1) {
	
										st.setupTitemStock_IN_ITEMCD(strItemCd);
										st.setupTitemStock_IN_WHCD(strWhCd);
										//�莝�݌ɐ�
										String strItemStockOnHandQty = this.chkNulltoZero(((KU0030010Struct)listT_ITEM_STOCK.get(0)).getserTitemStock_STOCK_ON_HAND_QTY());
										//�i�ڕʎ莝�݌�=�i�ڕʎ莝�݌�(�O)-���.���ѐ���
										st.setupTitemStock_STOCK_ON_HAND_QTY(Calculate.subtract(strItemStockOnHandQty, strMayShipQty));
										
										//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�X�V
										rv = entity.mtbl_T_ITEM_STOCK.update(conn, st);
									}
									listT_ITEM_STOCK.clear();
									
									// =======================================
									// ���b�g�ʎ莝�݌Ƀ��R�[�h�̍X�V
									// =======================================
									st.setupTlotStockIN_ITEM_CD(strItemCd);
									st.setupTlotStockIN_WH_CD(strWhCd);
									st.setupTlotStockIN_LOT_NO(lotst.getreadTlotStock_LOT_NO());
									//���b�g�ʎ莝�݌�=���b�g�ʎ莝�݌�(�O)-���.���ѐ���
									st.setupTlotStockSTOCK_ON_HAND_QTY(Calculate.subtract(strStockOnHandQty, strMayShipQty));
									
									//���b�g�ʎ莝�݌Ƀ��R�[�h�X�V
									rv = entity.mtbl_T_LOT_STOCK.update(conn, st);
									
									// =======================================
									// �ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�̍X�V(�U�֐�ۊǋ�)
									// =======================================
									//�ۊǋ悩����擾
									st.setserTitemStock_IN_ITEMCD(strItemCd);
									st.setserTitemStock_IN_WHCD(strWhCdTransfer);
									listT_ITEM_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn,st);
									if (listT_ITEM_STOCK != null && listT_ITEM_STOCK.size() == 1) {
	
										st.setupTitemStock_IN_ITEMCD(strItemCd);
										st.setupTitemStock_IN_WHCD(strWhCdTransfer);
										//�莝�݌ɐ�
										strStockOnHandQtyYotaku = this.chkNulltoZero(((KU0030010Struct)listT_ITEM_STOCK.get(0)).getserTitemStock_STOCK_ON_HAND_QTY());
										//�i�ڕʎ莝�݌�=�i�ڕʎ莝�݌�(�O)+���.���ѐ���
										st.setupTitemStock_STOCK_ON_HAND_QTY(Calculate.add(strStockOnHandQtyYotaku, strMayShipQty));
										
										//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�X�V
										rv = entity.mtbl_T_ITEM_STOCK.update(conn, st);
										
									} else {
										st.setcreTitemStock_ITEM_CD(strItemCd);
										st.setcreTitemStock_WH_CD(strWhCdTransfer);
										//�a���̍쐬���͎莝���ʂ��ϐ��u�o�׉\���v�ɂȂ�B
										st.setcreTitemStock_STOCK_ON_HAND_QTY(strMayShipQty);
	
										//�ۊǋ�̍H��R�[�h���擾
										st.setmWh_IN_WH_CD(strWhCdTransfer);
										st.setcreTitemStock_PLANT_CD(getPlantCd(st)); //�H��R�[�h
	
										//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�o�^
										rv = entity.mtbl_T_ITEM_STOCK.create(conn, st);
									}
									
									// =======================================
									// ���b�g�ʎ莝�݌Ƀ��R�[�h�̍X�V(�U�֐�ۊǋ�)
									// =======================================
									st.setserLotIN_ITEM_CD(strItemCd); //�i�ڔԍ�
									st.setserLotIN_WH_CD(strWhCdTransfer); //�U�֐�ۊǋ�
									st.setserLotIN_LOT_NO(lotst.getreadTlotStock_LOT_NO()); //�݌Ƀ��b�g�ԍ�
									List lstT_LOT_STOCK = entity.mtbl_T_LOT_STOCK.read(conn, st);
									if (lstT_LOT_STOCK != null && lstT_LOT_STOCK.size() == 1) {

										st.setupTlotStockIN_ITEM_CD(strItemCd);
										st.setupTlotStockIN_WH_CD(strWhCdTransfer);
										st.setupTlotStockIN_LOT_NO(lotst.getreadTlotStock_LOT_NO());
										//���b�g�ʎ莝�݌ɐ�
										String strLotStockOnHandQty = this.chkNulltoZero(((KU0030010Struct)lstT_LOT_STOCK.get(0)).getserLotSTOCK_ON_HAND_QTY());
										//���b�g�ʎ莝�݌�=���b�g�ʎ莝�݌�(�O)+���.���ѐ���
										st.setupTlotStockSTOCK_ON_HAND_QTY(Calculate.add(strLotStockOnHandQty, strMayShipQty));
										
										//���b�g�ʎ莝�݌Ƀ��R�[�h�X�V
										rv = entity.mtbl_T_LOT_STOCK.update(conn, st);
										lstT_LOT_STOCK.clear();
									} else {
										st.setinsertLotStock_ITEM_CD(strItemCd);
										st.setinsertLotStock_WH_CD(strWhCdTransfer);
										st.setinsertLotStock_LOT_CD(lotst.getreadTlotStock_LOT_NO());
										//�ۊǋ�̍H��R�[�h���擾
										st.setmWh_IN_WH_CD(strWhCdTransfer);
										st.setinsertLotStock_PLANT_CD(getPlantCd(st)); //�H��R�[�h
										//�a���̍쐬���͎莝���ʂ��ϐ��u�o�׉\���v�ɂȂ�B
										st.setinsertLotStock_STOCK_ON_HAND_QTY(strMayShipQty); //���b�g�ʎ莝�݌�
										st.setinsertLotStock_ALCD_QTY("0"); //�����ϐ���
										st.setinsertLotStock_DEFECT_QTY("0"); //���b�g�ʕs�ǐ�
										
										//���b�g�ʎ莝�݌Ƀ��R�[�h�o�^
										rv = entity.mtbl_T_LOT_STOCK.create(conn, st);
									}
									
									// =======================================
									// �ۊǋ�ʕi�ړ��o�Ƀ��R�[�h�̍쐬
									// =======================================
									// �R�l�N�V������n���āA�̔Ԃ̏���
									ISSUE_CD = new Numbering(conn,Numbering.ISSUE_CD,st.getsUser_ID(),"KU0030010",st.getstrPLANT_CD());
									String strRcvIssueTyp = "2";//���o�ɋ敪(�o��:2)
									String strRcvIssueGnrTyp = "31";//���o�ɔ����敪(�ʏ�o��:31)
									String strJobOdrCd = st.getg_JOB_ODR_CD();//����
			
									if(!this.m_DEPO_TYP.equals(strDepoTyp)){
										strRcvIssueGnrTyp = "23";//���o�ɔ����敪(�a���o��:23)
									}
			
									String strUpWhCd = strWhCd;
									for(int x=0; x < 2; x++){
										if(x==1){
											// �a���̏ꍇ
											strUpWhCd = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_TRANSFER_WH_CD();
											strRcvIssueTyp = "1"; //���o�ɋ敪(�a�����ɔ���:1)
											strRcvIssueGnrTyp = "13";//���o�ɔ����敪(�a������:13)
										}
										//�ۊǋ�̍H��R�[�h���擾
										st.setmWh_IN_WH_CD(strUpWhCd);
										st.setcreTrcvIssue_PLANT_CD(getPlantCd(st));	//�H��R�[�h
										st.setcreTrcvIssue_RCV_ISSUE_CTRL_CD(ISSUE_CD.getNo());
										st.setcreTrcvIssue_RCV_ISSUE_TYP(strRcvIssueTyp); //���o�ɋ敪(���ɁF�P�^�o�ɁF2)
										st.setcreTrcvIssue_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD());//�i��
										st.setcreTrcvIssue_WH_CD(strUpWhCd);				//�q��
														
										// ���o�ɑO�݌ɐ��ƁA���o�ɐ���ݒ�
										if(x==0)
										{	//�o�בq��
											st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(strStockOnHandQty); // ���o�ɑO�݌ɐ�
											st.setcreTrcvIssue_RCV_ISSUE_QTY(Double.toString( (-1) * Double.parseDouble(strMayShipQty)));		//���o�ɐ�
										}
										else
										{
											// �a���p�q��
											st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(strStockOnHandQtyYotaku); // ���o�ɑO�݌ɐ�
											st.setcreTrcvIssue_RCV_ISSUE_QTY(strMayShipQty);		//���o�ɐ�
										}
			
										// ���Ԃ̓o�^
										if(x==0)
										{	//�o�בq��
											st.setcreTrcvIssue_JOB_ODR_CD(strJobOdrCd);
										}
										else
										{
											// �a���p�q��
											st.setcreTrcvIssue_JOB_ODR_CD("");
										}
			
										st.setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(Calculate.add(st.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(),st.getcreTrcvIssue_RCV_ISSUE_QTY())); // ���o�Ɍ�݌ɐ�
										
										st.setcreTrcvIssue_RCV_ISSUE_AMOUNT("0");		//���o�ɋ��z
										st.setcreTrcvIssue_RCV_ISSUE_DATE(st.getg_DATE());	//���o�ɔN����
										st.setcreTrcvIssue_RCV_ISSUE_COMMENT(st.getg_REMARKS());	//���o�ɔ��l
										st.setcreTrcvIssue_RCV_ISSUE_GNR_TYP(strRcvIssueGnrTyp);	//���o�ɔ����敪(���i�q�Ɂ��ڋq:31)
										st.setcreTrcvIssue_STOCK_UPD_TYP("2");				//�݌ɍX�V�敪
										st.setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG("1");			//���o�Ɋ����t���O
										st.setcreTrcvIssue_LOT_NO(lotst.getreadTlotStock_LOT_NO()); //�݌Ƀ��b�g�ԍ�
										// Add Start 20140403 zhang-zl
										st.setcreTrcvIssue_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_ODR_NO()); //�o�׎w���ԍ�
										// Add End 20140403 zhang-zl
			
										//�ۊǋ�ʓ��o�Ƀ��R�[�h�쐬
										rv = entity.mtbl_T_RCV_ISSUE.create(conn, st);
									}

									//�ϐ��u�o�׎��ѐ��ʁv�@���@�ϐ��u�o�׎��ѐ��ʁv�@�|�@�ϐ��u�o�׉\���v
									strRealShipQty = Calculate.subtract(strRealShipQty, strMayShipQty);
									//�ϐ��u�o�׎��ѐ��ʁv �� 0�̏ꍇ
									if (new BigDecimal(strRealShipQty).compareTo(new BigDecimal("0")) == 0) {
										//�J��Ԃ��I��
										break;
									}
								}
							}
						}
			            // Add End 20140311 ma-jf
							
						// =======================================
						// �o�׎w�����R�[�h�̍X�V
						// =======================================
						//�a���݌ɐU�֏���F = 1�ɍX�V
						st.setupTshipOdr_IN_SLIPCD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SLIP_CD());
						st.setupTshipOdr_DEPO_TRANSFER_PROC_FLG("1");//�a���݌ɐU�֏���F
						rv = entity.mtbl_T_SHIP_ODR.update(conn, st);

						// =======================================
						// ���v�ʂ̃��R�[�h�X�V
						// =======================================
						// �󒍔ԍ�
						st.setinTod_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ODR_NO());
						// ���[����
						st.setinTod_PART_DLV_SEQ_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_PART_DLV_SEQ_NO());
						List listT_OD = entity.mtbl_T_OD.read(conn,st);
						if(listT_OD == null || listT_OD.size() != 1){
							//�������Ȃ��A���폈��
						}else{
							double totalIssueQty = Double.parseDouble(chkNulltoZero(((KU0030010Struct)listT_OD.get(0)).getstrTod_TOTAL_ISSUE_QTY()));	// �o�ɗ݌v��
							double dmQty = Double.parseDouble(chkNulltoZero(((KU0030010Struct)listT_OD.get(0)).getstrTod_DM_QTY()));	// �f�}���h��
							totalIssueQty = totalIssueQty + Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2()));
							String tmpOdNo = ((KU0030010Struct)listT_OD.get(0)).getstrTod_OD_NO();// �I�[�_�f�}���h�ԍ�
							// �f�}���h��ԋ敪�X�V����̔���
							if (totalIssueQty >= dmQty) {
								st.setstrTod_DM_STS_TYP("9");
							} else {
								st.setstrTod_DM_STS_TYP(((KU0030010Struct)listT_OD.get(0)).getstrTod_DM_STS_TYP());
							}
							st.setinTod_OD_NO(tmpOdNo);
							st.setstrTod_TOTAL_ISSUE_QTY(String.valueOf(totalIssueQty));
							rv = entity.mtbl_T_OD.update(conn, st);
						}
						listT_OD.clear();

						//�o��IF���R�[�h�̍č쐬���Ȃ��悤�ɁAFLG�ݒ�
						strDepoTransferProcFlg = "1";

					} else {

						//�y�ʏ�o�ׂ̏����z;
						
						// =======================================
						// �ڋq�R�[�h�̐ݒ�
						// =======================================
						//�ڋq�}�X�^������擾
						String strCustCd = "";
						String strRoundTyp = "";
						String strInspect = "";		// �����敪
						st.setmCust_IN_COMPANYCD(struct.getstrCOMPANY_CD());
						st.setmCust_IN_CUSTCD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_CD());

						List listM_CUST = entity.mtbl_M_CUST.read(conn,st);
						if(listM_CUST == null || listM_CUST.size() == 0){
						//�G���[����
						}else{
							strRoundTyp = ((KU0030010Struct)listM_CUST.get(0)).getmCust_DETAIL_ROUND_TYP();
							strInspect = ((KU0030010Struct)listM_CUST.get(0)).getmCust_INSPC_ACPT_TYP();
							// Add Start 20131223 liu-j
							// �����敪
							INSPC_ACPT_TYP = ((KU0030010Struct)listM_CUST.get(0)).getmCust_INSPC_ACPT_TYP();
							// Add End 20131223 liu-j
						}
						listM_CUST.clear();

						strCustCd =((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_CD();

						// =======================================
						// �o�׎��т̃��R�[�h�쐬
						// =======================================
						String strShipOdrAmount="0";		//���z
						String strShipOdrAmountExchRates="0";	//���z(�M��)
						String strCurrncyCd = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CURRNCY_CD();//�ʉ݃R�[�h

						String strAmount = ex.doMul(st.getg_SHIP_QTY2(),st.getg_UNIT_PRICE());
						if(ex.doMarume(strAmount, st.getstrCOMPANY_CD(), strCurrncyCd, st.geth_EXCH_TYP(), strRoundTyp, struct.geth_GYOMU_DATE())){
							strShipOdrAmount = ex.getS_EXCH_AMOUNT();
						}else{
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "KQ00038");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

							continue;
						}
						// Mod Start 20140409 liu-j
						//if(ex.doExchAmount(strShipOdrAmount, st.getstrCOMPANY_CD(), strCurrncyCd, st.geth_EXCH_TYP(), strRoundTyp, st.getg_DATE())){
						if(ex.doExchAmount(strShipOdrAmount, st.getstrCOMPANY_CD(), strOdrCurrncyCd, strExchTyp, strRoundTyp, st.getg_DATE())){
						// Mod End 20140409 liu-j
							strShipOdrAmountExchRates = ex.getS_EXCH_AMOUNT();
						}else{
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "KQ00038");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

							continue;
						}
						
			            // Add Start 20140311 ma-jf
						//���� [SEQ_SALES_SEQ_NO] ���擾
						List listgetT_SHIP_SEQ_NO = entity.mget_T_SHIP_SEQ_NO.read(conn, st);
						String strShipSeqNo = ((KU0030010Struct)listgetT_SHIP_SEQ_NO.get(0)).getgetTship_SHIP_SEQ_NO(); //�o�׎��ъǗ��ԍ�
						st.setcreTship_SHIP_SEQ_NO(strShipSeqNo); //�o�׎��ъǗ��ԍ�
			            // Add End 20140311 ma-jf
						st.setcreTship_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_ODR_NO());	//�o�׎w���ԍ�
						st.setcreTship_SLIP_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SLIP_CD());	//�`�[�ԍ�
						st.setcreTship_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ODR_NO());		//�󒍔ԍ�
						st.setcreTship_PART_DLV_SEQ_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_PART_DLV_SEQ_NO());//���[����
						st.setcreTship_ORGNAL_SLIP_CD("");	//���`�[�Ǘ��ԍ�(�ݒ薳��)
						st.setcreTship_SLIP_TRN_CD("1");	//�`�[�敪(1:����)
						st.setcreTship_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD());	//�i��
						st.setcreTship_JOB_ODR_CD(st.getg_JOB_ODR_CD());	//����
						st.setcreTship_CUST_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_ITEM_CD());//�ڋq�i��
						st.setcreTship_CUST_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_ODR_NO());//�ڋq�����ԍ�
						st.setcreTship_CUST_CD(strCustCd);								//�ڋq�R�[�h
						st.setcreTship_CUST_NAME(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_NAME());	//�ڋq����
						st.setcreTship_CUST_CHRG_PSN_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_CHRG_PSN_CD());//�c�ƒS���҃R�[�h
						st.setcreTship_SHIP_ODR_ISS_PSN_CD(struct.getstrUSER_CD());					//���s�S���҃R�[�h
						st.setcreTship_DLV_LOC_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DLV_LOC_CD());	//�[�i�ꏊ�R�[�h
						st.setcreTship_DEPO_TYP(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DEPO_TYP());	//�a���q�ɋ敪
						st.setcreTship_ALLCT_WH_CD(st.getg_WH_CD());							//�����ۊǋ�(���)
						st.setcreTship_DEPO_WH_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_TRANSFER_WH_CD());//���o�a���ۊǋ�
						st.setcreTship_LOC_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_LOC_CD());		//���P�[�V�����ԍ�
						st.setcreTship_SHIP_DATE(st.getg_DATE());							//�o�׎��ѓ�(���.�v���)
						st.setcreTship_SHIP_QTY(st.getg_SHIP_QTY2());							//�o�׎��ѐ���(���)
						st.setcreTship_UNIT_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_UNIT_CD());	//�P��
						st.setcreTship_SHIP_UNIT_PRICE(st.getg_UNIT_PRICE());						//���(�P��)
						// Mod Start 2014/02/20 liu-chy
						//st.setcreTship_CURRNCY_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CURRNCY_CD());	//�ʉ݃R�[�h
						List listM_CUST_R = entity.mtbl_M_CUST.read(conn,st);
						if(listM_CUST_R == null || listM_CUST_R.size() == 0){
							}else{
								st.setcreTship_CURRNCY_CD(((KU0030010Struct)listM_CUST_R.get(0)).getmCust_CUR_CD());	//�ʉ݃R�[�h
							}
						// Mod End 2014/02/20 liu-chy
						st.setcreTship_SHIP_ODR_AMOUNT(strShipOdrAmount);						//�o�׎w�����z

						st.setcreTship_SHIP_ODR_AMOUNT_EXCH_RATES(strShipOdrAmountExchRates);			//�o�׎w�����z(�M��)

						st.setcreTship_DIRECT_DLV_FLG(st.getg_DIRECT_DLV_FLG());//�����t���O
						st.setcreTship_DLV_KEY_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_DLV_KEY_NO());//�[�i�L�[�ԍ�
						st.setcreTship_REMARKS(st.getg_REMARKS());//���l
						st.setcreTship_DEL_FLG("0");//�폜�t���O('0'�ݒ�)


						//�o�׎��у��R�[�h�쐬
						rv = entity.mtbl_T_SHIP.create(conn, st);

						// =======================================
						// ������т̃��R�[�h�쐬
						// =======================================
						//�i�ڃ}�X�^������擾
						String strItemCd = ((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD();

						//�L�[�ݒ�
						st.setmItem_IN_ITEMCD(strItemCd);
						String strItemName = "";
						String strItemTyp  = "";

						List listM_ITEM = entity.mtbl_M_ITEM.read(conn, st);
						if(listM_ITEM == null || listM_ITEM.size() != 1){
							//�G���[
						}else{
							strItemName = this.replaceNull(((KU0030010Struct)listM_ITEM.get(0)).getmItem_ITEM_NAME());//�i��
						}
						listM_ITEM.clear();

						//���i�d�l�}�X�^������擾
						//�L�[:�i�ڔԍ��A�ʎY_����敪
						String strSalesDeptCd = "";

						st.setmItemSpec_IN_CUST_CD(strCustCd); //�ڋq�R�[�h
						st.setmItemSpec_IN_CUST_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_ITEM_CD()); //�ڋq�i�ڔԍ�
						st.setmItemSpec_IN_COMPANY_CD(struct.getstrCOMPANY_CD()); //��ЃR�[�h

						List listM_ITEM_SPEC = entity.mtbl_M_ITEM_SPEC.read(conn, st);
						if(listM_ITEM_SPEC == null || listM_ITEM_SPEC.size() != 1){
								//�G���[
						}else{
								strSalesDeptCd = this.replaceNull(((KU0030010Struct)listM_ITEM_SPEC.get(0)).getmItemSpec_SALES_DEPT_CD());//����v�㕔��
						}
						listM_ITEM_SPEC.clear();

						//����敪�A��ԋ敪�A��̌������A��̌������̔���
						String salesTyp = null;
						String status = null;
						String acptDate = null;
						String acptQty = null;
						if ("1".equals(strInspect)) {
							salesTyp = "1";
							status = "20";
							// Mod Start 20131223 liu-j
							// acptDate = st.getg_DESINATED_SHIP_DATE();
							acptDate = st.getg_DATE();
							// Mod End   20131223 liu-j
							acptQty = st.getg_SHIP_QTY2();
						} else {
							salesTyp = "2";
							status = "10";
						}
						st.setcreTsales_SALES_TYP(salesTyp);//����敪
						st.setcreTsales_STATUS(status);//��ԋ敪
						st.setcreTsales_INSPC_ACPT_TYP(strInspect);//�����敪

						st.setcreTsales_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_ODR_NO());//�o�׎w���ԍ�
						st.setcreTsales_SLIP_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SLIP_CD());//�`�[�ԍ�
						st.setcreTsales_CUST_CD(strCustCd);//�ڋq�R�[�h
						st.setcreTsales_ITEM_CD(strItemCd);//�i��
						st.setcreTsales_ITEM_NAME(strItemName);//�i��
						st.setcreTsales_CUST_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_ODR_NO());//�ڋq�����ԍ�
						// Del Start 20131223 liu-j
						// st.setcreTsales_SALES_DATE(st.getg_DATE());//����v���
						// Del End 20131223 liu-j
						st.setcreTsales_SALES_DEPT_CD(st.getg_SALES_DEPT_CD());//����v�㕔��
						st.setcreTsales_CUST_CHRG_PSN_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CUST_CHRG_PSN_CD());//�c�ƒS���҃R�[�h
						st.setcreTsales_ODR_ACPT_PSN_CD(struct.getstrUSER_CD());//���s�S���҃R�[�h
						st.setcreTsales_SALES_QTY(st.getg_SHIP_QTY2());			//������ѐ���
						st.setcreTsales_SALES_UNIT_PRICE(st.getg_UNIT_PRICE());		//�P��
						st.setcreTsales_UNIT_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_UNIT_CD());				//�P��
						st.setcreTsales_SALES_AMOUNT(strShipOdrAmount);			//������ы��z
						st.setcreTsales_SALES_AMOUNT_EXCH_RATES(strShipOdrAmountExchRates);//������ы��z(�M��)
						st.setcreTsales_INSPC_ACPT_DATE(acptDate);			//��̌�����
						st.setcreTsales_INSPC_ACPT_QTY(acptQty);			//��̌�����
						st.setcreTsales_ORG_SLIP_CD(null);//���`�[�ԍ�
						st.setcreTsales_CURRNCY_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_CURRNCY_CD());//�ʉ݃R�[�h
						st.setcreTsales_SPCL_PRICE_CO(strSpclPriceTyp);//���l�敪
						st.setcreTsales_REMARKS(st.getg_REMARKS());//���l
						st.setcreTsales_DEL_FLG("0");//�폜�e

						// Add Start 20131223 liu-j
						// [���Ӑ�[�i�ꏊ].�g�^�������h
						String strTransportLt = "0";
						st.setmCustBase_IN_COMPANYCD(struct.getstrCOMPANY_CD());
						st.setmCustBase_IN_CUSTCD(strCustCd);
						st.setmCustBase_IN_DLVLOCCD(strDlvLocCd);

						List listMCustBase = entity.mtbl_M_CUST_BASE.read(conn,st);
						if(listMCustBase == null || listMCustBase.size() != 1){
							//�G���[����
						}else{
							strTransportLt = this.replaceNull(((KU0030010Struct)listMCustBase.get(0)).getmCustBase_TRANSPORT_LT());
						}
						// �o�׏���LT�̎擾
						String strSyuKaLt = "0";
						List listShipCd = new ArrayList();
						listShipCd = entity.mgetSYUKA_LT.read(conn,st);
						if(listShipCd == null || listShipCd.size() != 1){
		                    ok_flg = false;
							ExpjMessage emsg = new ExpjMessage("KQ00037");
							msgStruct.addError(emsg);
							continue;

						}else{
							strSyuKaLt = this.replaceNull(((KU0030010Struct)listShipCd.get(0)).getstrSYUKA_LT());
						}
						int iAddDays = Integer.parseInt(strTransportLt) +  Integer.parseInt(strSyuKaLt) ;
						String strAddDays = String.valueOf(iAddDays);
						// [�o�׎���]."�o�׎��ѓ�"�{[���Ӑ�[�i�ꏊ].�g�^�������h�{�o�׏����k�s
						strScdlDlvDate = getScdlDlvDate(st, st.getcreTship_SHIP_DATE(), strAddDays, strItemCd);

						if ("1".equals(INSPC_ACPT_TYP)){
							SCDL_DLV_DATE = st.getg_DATE();					//[���].�g�o�׎��ѓ�
						} else {
							SCDL_DLV_DATE = strScdlDlvDate;
						}
						st.setcreTsales_SALES_DATE(SCDL_DLV_DATE);
						// �o�׎��ѓo�^����(�m������сn�̓o�^)
						st.setupdiffTAX_CD(strTaxCd);
						CALCU_TAX_TYPE = "3";
						// Add End 20131223 liu-j
						
						//����ŋ��z�v�Z
						String taxAmount[] = this.doCalcuTaxAmount(st, strCustCd, struct.getstrCOMPANY_CD(), st.getg_CUST_ITEM_CD(), strShipOdrAmount);
						st.setcreTsales_TAX_AMOUNT_1(taxAmount[0]);		// �Ŋz�P
						st.setcreTsales_TAX_AMOUNT_2(taxAmount[1]);		// �Ŋz�Q
						st.setcreTsales_TAX_AMOUNT_3(taxAmount[2]);		// �Ŋz�R

						st.setcreTsales_EXTERNAL_TAX_SALES_AMOUNT("0");	// �O�őΏۋ��z
						st.setcreTsales_INTERNAL_TAX_SALES_AMOUNT("0");	// ���őΏۋ��z
						st.setcreTsales_TAXFREE_SALES_AMOUNT("0");		// ��ېőΏۋ��z
						st.setcreTsales_EXTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i�O�Łj
						st.setcreTsales_INTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i���Łj

                        String sTmpTax = Calculate.add(taxAmount[0], taxAmount[1]);
                        sTmpTax = Calculate.add(sTmpTax, taxAmount[2]);
                        double tmpTax = Double.parseDouble(sTmpTax);

                        if ("1".equals(this.TAX_KBN)){
							st.setcreTsales_EXTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
							st.setcreTsales_EXTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
						} else
						if ("5".equals(this.TAX_KBN) || "9".equals(this.TAX_KBN)){
							st.setcreTsales_INTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
							st.setcreTsales_INTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
						} else
						if ("0".equals(this.TAX_KBN)){
							st.setcreTsales_TAXFREE_SALES_AMOUNT(strShipOdrAmount);
						}

						tmpTax = Double.parseDouble(st.getcreTsales_EXTERNAL_TAX_SALES_AMOUNT())
								+ Double.parseDouble(st.getcreTsales_INTERNAL_TAX_SALES_AMOUNT())
								+ Double.parseDouble(st.getcreTsales_TAXFREE_SALES_AMOUNT())
								- Double.parseDouble(st.getcreTsales_INTERNAL_TAX_AMOUNT());

						st.setcreTsales_TAX_CREDIT_SALES_AMOUNT(String.valueOf(tmpTax)); // �Ŕ�������z

                        String tmpTaxExchRates = "0";
                        // Mod Start 20140409 liu-j
                        // if(ex.doExchAmount(String.valueOf(tmpTax), st.getstrCOMPANY_CD(), strCurrncyCd, st.geth_EXCH_TYP(), strRoundTyp, st.getg_DATE())){
                        if(ex.doExchAmount(String.valueOf(tmpTax), st.getstrCOMPANY_CD(), strOdrCurrncyCd, strExchTyp, strRoundTyp, st.getg_DATE())){
                        // Mod End 20140409 liu-j
                            tmpTaxExchRates = ex.getS_EXCH_AMOUNT();
                        }
						st.setcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(tmpTaxExchRates); // �Ŕ�������z�i�M�݁j
						
						bIsJpCur = ex.isB_ISJPCUR();
						// �בփ��[�g
						// �M�݂̏ꍇ
						if (bIsJpCur) {
							// �בփ��[�g
							st.setcreTsales_EXCH_RATE("1");
						} else {
							KU0030010Struct wt = new KU0030010Struct();
							wt.setstrCOMPANY_CD(st.getstrCOMPANY_CD());
							wt.setstrOdrCurrncyCd(strOdrCurrncyCd);
							wt.setstrExchTyp(strExchTyp);
							wt.setg_DATE(st.getg_DATE());
							List tempList = new ArrayList();
							// �בփ��[�g���擾
							tempList = entity.mselectM_EXCH_RATE.read(conn, wt);
							
							st.setcreTsales_EXCH_RATE(((KU0030010Struct)tempList.get(0)).getcreTsales_EXCH_RATE());
						}

						//�V�X�e���p�����[�^("APR_SALES")�`�F�b�N
						chkAprSales(st);
						//������у��R�[�h�쐬
						rv = entity.mtbl_T_SALES.create(conn, st);

			            // Add Start 20140311 ma-jf
						//���b�g�Ǘ��t���O�� 0�F���b�g�Ǘ����s��Ȃ��̏ꍇ
						if ("0".equals(strLotCtrlFlg)) {
				        // Add End 20140311 ma-jf
							// =======================================
							// �ۊǋ�ʍ݌ɂ̃��R�[�h�X�V
							// =======================================
							String strWhCd = st.getg_WH_CD();//�q��
							String strJobOdrCd = st.getg_JOB_ODR_CD();//����
							st.setserTitemStock_IN_ITEMCD(strItemCd);
							st.setserTitemStock_IN_JOBODRCD(strJobOdrCd);
							st.setserTitemStock_IN_WHCD(strWhCd);
	
							// �莝���݌ɐ��擾
							String strStockOnHandQty = "";
							List _listT_STOCK = null;
							if (st.getserTitemStock_IN_JOBODRCD() == null || st.getserTitemStock_IN_JOBODRCD().equals("")) {
								// �ۊǋ�ʕi�ڍ݌ɂ̓Ǎ�
								_listT_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn,st);
							} else {
								// �ۊǋ�ʐ��ԍ݌ɂ̓Ǎ�
								_listT_STOCK = entity.mtbl_T_JOB_ODR_CD_STOCK.read(conn,st);
							}
	
							if(_listT_STOCK == null || _listT_STOCK.size() != 1){
								ok_flg = false;
								continue;
							}else{
								strStockOnHandQty = this.replaceNull(((KU0030010Struct)_listT_STOCK.get(0)).getserTitemStock_STOCK_ON_HAND_QTY());
							}
							_listT_STOCK.clear();
	
							st.setupTitemStock_IN_ITEMCD(strItemCd);
							st.setupTitemStock_IN_JOBODRCD(strJobOdrCd);
							st.setupTitemStock_IN_WHCD(strWhCd);
							//�i�ڕʎ莝�݌�=�i�ڕʎ莝�݌�(�O)-���.���ѐ���
							st.setupTitemStock_STOCK_ON_HAND_QTY(Double.parseDouble(chkNulltoZero(strStockOnHandQty))-Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2()))+"");
	
							if (st.getserTitemStock_IN_JOBODRCD() == null || st.getserTitemStock_IN_JOBODRCD().equals("")) {
								// �ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�̍X�V
									rv = entity.mtbl_T_ITEM_STOCK.update(conn, st);
							} else {
								// �ۊǋ�ʐ��ԍ݌Ƀ��R�[�h�̍X�V
									rv = entity.mtbl_T_JOB_ODR_CD_STOCK.update(conn,st);
							}
	
							// =======================================
							// �ۊǋ�ʓ��o�ɂ̃��R�[�h�쐬
							// =======================================
							// �R�l�N�V������n���āA�̔Ԃ̏���
							ISSUE_CD = new Numbering(conn,Numbering.ISSUE_CD,st.getsUser_ID(),"KU0030010",st.getstrPLANT_CD());
	
							String strRcvIssueTyp = "2";//���o�ɋ敪(�o��:2)
							String strRcvIssueGnrTyp = "31";//���o�ɔ����敪(�ʏ�o��:31)
							
							//�ۊǋ�̍H��R�[�h���擾
							st.setmWh_IN_WH_CD(strWhCd);
							st.setcreTrcvIssue_PLANT_CD(getPlantCd(st));	//�H��R�[�h
	
	
							st.setcreTrcvIssue_RCV_ISSUE_CTRL_CD(ISSUE_CD.getNo());
							st.setcreTrcvIssue_RCV_ISSUE_TYP(strRcvIssueTyp); //���o�ɋ敪(2��ݒ�)
							st.setcreTrcvIssue_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD());//�i��
							st.setcreTrcvIssue_JOB_ODR_CD(strJobOdrCd);//����
							//st.setcreTrcvIssue_PLANT_CD(st.getstrPLANT_CD());//�H��R�[�h
							st.setcreTrcvIssue_WH_CD(strWhCd);//�q��
							st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(strStockOnHandQty);//���o�ɑO�݌ɐ�
							st.setcreTrcvIssue_RCV_ISSUE_QTY(Double.toString((-1) * Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2()))));//���o�ɐ�
							st.setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(Calculate.add(st.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(),st.getcreTrcvIssue_RCV_ISSUE_QTY()));//���o�Ɍ�݌ɐ�
							st.setcreTrcvIssue_RCV_ISSUE_AMOUNT("0");//���o�ɋ��z
							st.setcreTrcvIssue_RCV_ISSUE_DATE(st.getg_DATE());//�o�׎��ьv���
							st.setcreTrcvIssue_RCV_ISSUE_COMMENT(st.getg_REMARKS());//���o�ɔ��l
							st.setcreTrcvIssue_RCV_ISSUE_GNR_TYP(strRcvIssueGnrTyp);//���o�ɔ����敪(���i�q�Ɂ��ڋq:31)
							st.setcreTrcvIssue_STOCK_UPD_TYP("2");		//�݌ɍX�V�敪
							st.setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG("1");	//���o�Ɋ����t���O
	
							//�ۊǋ�ʓ��o�ɂ̃��R�[�h�쐬
							rv = entity.mtbl_T_RCV_ISSUE.create(conn, st);

				        // Add Start 20140311 ma-jf
						} else {
							//���b�g�Ǘ��t���O��1�F���b�g�Ǘ����s���̏ꍇ
							String strStockLotCD = st.getg_STOCK_LOT_CD(); //�݌Ƀ��b�g�ԍ�
							String strWhCd = st.getg_WH_CD(); //�ۊǋ�R�[�h
							String strMayShipQty = st.getg_SHIP_QTY2(); //�ϐ��u�o�׉\���v=[���]."�o�׎��ѐ���"
							String strRealShipQty = st.getg_SHIP_QTY2(); //�ϐ��u�o�׎��ѐ��ʁv=[���]."�o�׎��ѐ���"
							
							st.setreadTlotStock_IN_ITEM_CD(strItemCd);
							st.setreadTlotStock_IN_WH_CD(strWhCd);
							st.setreadTlotStock_IN_LOT_NO(strStockLotCD);
							List listT_LOT_STOCK = entity.mreadT_LOT_STOCK.read(conn, st);
							if (listT_LOT_STOCK != null && listT_LOT_STOCK.size() > 0) {
								for (int j=0; j<listT_LOT_STOCK.size(); j++) {
									KU0030010Struct lotst = (KU0030010Struct)listT_LOT_STOCK.get(j);
									
									String strStockOnHandQty = this.chkNulltoZero(lotst.getreadTlotStock_STOCK_ON_HAND_QTY()); //���b�g�ʎ莝�݌�
									String strAlcdQty = this.chkNulltoZero(lotst.getreadTlotStock_ALCD_QTY()); //�����ϐ���
									String strRealLotQty = Calculate.subtract(strStockOnHandQty, strAlcdQty); //���b�g�݌ɐ�
									
									if (compDecimal(new BigDecimal(strRealLotQty), new BigDecimal(strRealShipQty))) {
										strMayShipQty = strRealShipQty; //�ϐ��u�o�׉\���v�@���@�ϐ��u�o�׎��ѐ��ʁv
									} else {
										strMayShipQty = strRealLotQty; //�ϐ��u�o�׉\���v�@���@[���b�g�ʕi�ڍ݌�].�h���b�g�ʎ莝�݌Ɂh - [���b�g�ʕi�ڍ݌�].�h�����ϐ��ʁh
									}

									// =======================================
									// �ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�̍X�V
									// =======================================
									//�ۊǋ悩����擾
									st.setserTitemStock_IN_ITEMCD(strItemCd);
									st.setserTitemStock_IN_WHCD(strWhCd);
									List listT_ITEM_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn,st);
									if (listT_ITEM_STOCK != null && listT_ITEM_STOCK.size() == 1) {
	
										st.setupTitemStock_IN_ITEMCD(strItemCd);
										st.setupTitemStock_IN_WHCD(strWhCd);
										//�莝�݌ɐ�
										String strItemStockOnHandQty = this.chkNulltoZero(((KU0030010Struct)listT_ITEM_STOCK.get(0)).getserTitemStock_STOCK_ON_HAND_QTY());
										//�i�ڕʎ莝�݌�=�i�ڕʎ莝�݌�(�O)-���.���ѐ���
										st.setupTitemStock_STOCK_ON_HAND_QTY(Calculate.subtract(strItemStockOnHandQty, strMayShipQty));
										
										//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�X�V
										rv = entity.mtbl_T_ITEM_STOCK.update(conn, st);
									}
									listT_ITEM_STOCK.clear();
									
									// =======================================
									// ���b�g�ʎ莝�݌Ƀ��R�[�h�̍X�V
									// =======================================
									st.setupTlotStockIN_ITEM_CD(strItemCd);
									st.setupTlotStockIN_WH_CD(strWhCd);
									st.setupTlotStockIN_LOT_NO(lotst.getreadTlotStock_LOT_NO());
									//���b�g�ʎ莝�݌�=���b�g�ʎ莝�݌�(�O)-���.���ѐ���
									st.setupTlotStockSTOCK_ON_HAND_QTY(Calculate.subtract(strStockOnHandQty, strMayShipQty));
									
									//���b�g�ʎ莝�݌Ƀ��R�[�h�X�V
									rv = entity.mtbl_T_LOT_STOCK.update(conn, st);
									
									// =======================================
									// �ۊǋ�ʕi�ړ��o�Ƀ��R�[�h�̍쐬
									// =======================================
									// �R�l�N�V������n���āA�̔Ԃ̏���
									ISSUE_CD = new Numbering(conn,Numbering.ISSUE_CD,st.getsUser_ID(),"KU0030010",st.getstrPLANT_CD());
			
									String strRcvIssueTyp = "2";//���o�ɋ敪(�o��:2)
									String strRcvIssueGnrTyp = "31";//���o�ɔ����敪(�ʏ�o��:31)
									
									//�ۊǋ�̍H��R�[�h���擾
									st.setmWh_IN_WH_CD(strWhCd);
									st.setcreTrcvIssue_PLANT_CD(getPlantCd(st));	//�H��R�[�h
			
									st.setcreTrcvIssue_RCV_ISSUE_CTRL_CD(ISSUE_CD.getNo());
									st.setcreTrcvIssue_RCV_ISSUE_TYP(strRcvIssueTyp); //���o�ɋ敪(2��ݒ�)
									st.setcreTrcvIssue_ITEM_CD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ITEM_CD());//�i��
									st.setcreTrcvIssue_JOB_ODR_CD(st.getg_JOB_ODR_CD());//����
									st.setcreTrcvIssue_WH_CD(strWhCd);//�q��
									st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(strStockOnHandQty);//���o�ɑO�݌ɐ�
									st.setcreTrcvIssue_RCV_ISSUE_QTY(Double.toString((-1) * Double.parseDouble(strMayShipQty)));//���o�ɐ�
									st.setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(Calculate.add(st.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(),st.getcreTrcvIssue_RCV_ISSUE_QTY()));//���o�Ɍ�݌ɐ�
									st.setcreTrcvIssue_RCV_ISSUE_AMOUNT("0");//���o�ɋ��z
									st.setcreTrcvIssue_RCV_ISSUE_DATE(st.getg_DATE());//�o�׎��ьv���
									st.setcreTrcvIssue_RCV_ISSUE_COMMENT(st.getg_REMARKS());//���o�ɔ��l
									st.setcreTrcvIssue_RCV_ISSUE_GNR_TYP(strRcvIssueGnrTyp);//���o�ɔ����敪(���i�q�Ɂ��ڋq:31)
									st.setcreTrcvIssue_STOCK_UPD_TYP("2");		//�݌ɍX�V�敪
									st.setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG("1");	//���o�Ɋ����t���O
									st.setcreTrcvIssue_LOT_NO(lotst.getreadTlotStock_LOT_NO()); //�݌Ƀ��b�g�ԍ�
									// Add Start 20140403 zhang-zl
									st.setcreTrcvIssue_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SHIP_ODR_NO()); //�o�׎w���ԍ�
									// Add End 20140403 zhang-zl
									//�ۊǋ�ʓ��o�Ƀ��R�[�h�쐬
									rv = entity.mtbl_T_RCV_ISSUE.create(conn, st);
									
									// =======================================
									// �o�׎��і��׃��R�[�h�̍쐬
									// =======================================
									st.setinsTshipInst_SHIP_SEQ_NO(strShipSeqNo); //�o�׎��ъǗ��ԍ�
									st.setinsTshipInst_SHIP_ODR_NO(st.getg_SHIP_ODR_NO()); //�o�׎w���ԍ�
									st.setinsTshipInst_LOT_NO(lotst.getreadTlotStock_LOT_NO()); //�݌Ƀ��b�g�ԍ�
									st.setinsTshipInst_ITEM_CD(st.getg_ITEM_CD()); //�o�וi�ڔԍ�
									st.setinsTshipInst_WH_CD(st.getg_WH_CD()); //�ۊǋ�R�[�h
									st.setinsTshipInst_ODR_NO(st.getg_ODR_NO()); //�󒍔ԍ�
									st.setinsTshipInst_SLIP_CD(st.getg_SLIP_CD()); //�`�[�ԍ�
									st.setinsTshipInst_SHIP_QTY(strMayShipQty); //���b�g�ʏo�׎��ѐ���
									st.setinsTshipInst_SHIP_DATE(st.getg_DATE()); //�o�׎��ѓ�
									
									//�o�׎��і��ׂ̃��R�[�h�쐬
									rv = entity.mtbl_T_SHIP_INST.create(conn, st);
			
									// =======================================
									// ���b�g�g���[�X���R�[�h�̍쐬
									// =======================================
									st.settlotTrace_FROM_ITEM_CD(strItemCd); //���i�ڔԍ�
									st.settlotTrace_FROM_LOT_NO(lotst.getreadTlotStock_LOT_NO()); //�����b�g�ԍ�
									st.settlotTrace_TO_ITEM_CD(strItemCd); //��i�ڔԍ�
									st.settlotTrace_TO_LOT_NO(lotst.getreadTlotStock_LOT_NO()); //�惍�b�g�ԍ�
									st.settlotTrace_LOT_TRACE_TYP("5"); //���b�g�g���[�X�敪=5�F�o�׎���
									st.settlotTrace_CUST_ODR_NO(st.getg_CUST_ODR_NO()); //���Ӑ撍���ԍ�
									st.settlotTrace_SLIP_CD(st.getg_SLIP_CD()); //�`�[�ԍ�
									st.settlotTrace_ODR_NO(st.getg_ODR_NO()); //�󒍔ԍ�
									if (entity.mtbl_T_LOT_TRACE.check(conn, st)) {
										rv = entity.mupdateT_LOT_TRACE.update(conn, st);
									} else {
										rv = entity.mtbl_T_LOT_TRACE.create(conn, st);
									}

									//�ϐ��u�o�׎��ѐ��ʁv�@���@�ϐ��u�o�׎��ѐ��ʁv�@�|�@�ϐ��u�o�׉\���v
									strRealShipQty = Calculate.subtract(strRealShipQty, strMayShipQty);
									//�ϐ��u�o�׎��ѐ��ʁv �� 0�̏ꍇ
									if (new BigDecimal(strRealShipQty).compareTo(new BigDecimal("0")) == 0) {
										//�J��Ԃ��I��
										break;
									}
								}
							}
						}
			            // Add End 20140311 ma-jf
						
						// =======================================
						// �󒍖��ׂ̃��R�[�h�X�V
						// =======================================
						strODRTotalShipQty = (Double.parseDouble(chkNulltoZero(strODRTotalShipQty))+Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2())))+""; //�׎��ї݌v��
						strODRShipAmount = (Double.parseDouble(chkNulltoZero(strODRShipAmount))+Double.parseDouble(chkNulltoZero(strShipOdrAmount)))+"";//�o�׎��ы��z

						strODRShipAmountExchRates =(Double.parseDouble(chkNulltoZero(strODRShipAmountExchRates))+Double.parseDouble(chkNulltoZero(strShipOdrAmountExchRates)))+"";//�o�׎��ы��z(�M��)

						st.setupTodr_IN_ODRNO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ODR_NO());//�󒍔ԍ�
						st.setupTodr_TOTAL_SHIP_QTY(strODRTotalShipQty);//
						st.setupTodr_SHIP_AMOUNT(strODRShipAmount);
						st.setupTodr_SHIP_AMOUNT_EXCH_RATES(strODRShipAmountExchRates);//������ы��z(�M��)

						if(Double.parseDouble(chkNulltoZero(strOdrQty)) <= Double.parseDouble(chkNulltoZero(strODRTotalShipQty))){
							st.setupTodr_ODR_CMPLT_FLG("1");
							st.setupTodr_ODR_CMPLT_DATE(st.getg_DATE());
						} else {
							st.setupTodr_ODR_CMPLT_FLG(strOdrCmplyFlg);
							st.setupTodr_ODR_CMPLT_DATE(strOdrCmplyDate);
						}

						//�󒍖���TBL�̍X�V
						rv = entity.mtbl_T_ODR.update(conn, st);

						// =======================================
						// �o�׎w���̃��R�[�h�X�V
						// =======================================
						String strSHIPTotalShipQty = (Double.parseDouble(chkNulltoZero(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_TOTAL_SHIP_QTY()))
								+ Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2())))+""; //�׎��ї݌v��
						st.setupTshipOdr_IN_SLIPCD(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_SLIP_CD());
						st.setupTshipOdr_SHP_CMPLT_FLG("1");//���я���F
						st.setupTshipOdr_TOTAL_SHIP_QTY(strSHIPTotalShipQty);//�o�׎��ї݌v��

						rv = entity.mtbl_T_SHIP_ODR1.update(conn, st);

						// =======================================
						// ���v�ʂ̃��R�[�h�X�V
						// =======================================

						st.setinTod_ODR_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_ODR_NO());	// �󒍔ԍ�
						st.setinTod_PART_DLV_SEQ_NO(((KU0030010Struct)listT_SHIP_ODR.get(0)).getserInsert_PART_DLV_SEQ_NO());
						// ���[����
						List listT_OD = entity.mtbl_T_OD.read(conn,st);
						if(listT_OD == null || listT_OD.size() != 1){
							//�������Ȃ��A���폈��
						}else{
							double totalIssueQty = Double.parseDouble(chkNulltoZero(((KU0030010Struct)listT_OD.get(0)).getstrTod_TOTAL_ISSUE_QTY()));	// �o�ɗ݌v��
							double dmQty = Double.parseDouble(chkNulltoZero(((KU0030010Struct)listT_OD.get(0)).getstrTod_DM_QTY()));	// �f�}���h��
							totalIssueQty = totalIssueQty + Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2()));
							String tmpOdNo = ((KU0030010Struct)listT_OD.get(0)).getstrTod_OD_NO();						// �I�[�_�f�}���h�ԍ�
							// �f�}���h��ԋ敪�X�V����̔���
							if (totalIssueQty >= dmQty) {
								st.setstrTod_DM_STS_TYP("9");
							} else {
								st.setstrTod_DM_STS_TYP(((KU0030010Struct)listT_OD.get(0)).getstrTod_DM_STS_TYP());
							}
							st.setinTod_OD_NO(tmpOdNo);
							st.setstrTod_TOTAL_ISSUE_QTY(String.valueOf(totalIssueQty));
							rv = entity.mtbl_T_OD.update(conn, st);
						}
						listT_OD.clear();
						listT_SHIP_ODR.clear();

						// =======================================
						// ���|�Ǘ��T�^�e(���i)�̌ďo
						// =======================================
						if (entity.mchkSysInstallOptions.check(conn,st)) {
							
                            ArIf arIf = new ArIf(conn);
                            arIf.setParameter("1", struct.getsUser_ID(),
                                              null, null, st.getg_SLIP_CD());
                            String msgNo = arIf.execute();
                            if (!"0".equals(msgNo)) {
                                ok_flg = false;
                                ExpjMessage emsg = new ExpjMessage(msgNo);
                                msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
                                sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
                            }
						}
					}
				}
				if ("1".equals(st.getg_DIRECT_DLV_FLG())){
					st.setg_DIRECT_DLV_FLG("true");
				}
			}
			mass.clear();
			if(ok_flg == true){

				//����o�^������ɏI������ꍇ
				ExpjMessage emsg = new ExpjMessage( "KU00101");
				sysLog.info(emsg, struct.getsUser_ID());
				msgStruct.addInfo( emsg );
				//�ۊǋ於�̐ݒ�
				((KU0030010Struct)list.get(0)).setg_WH_NAME(strWH_NAME);

				// �������ʃt���O��NG�ɐݒ�
				struct.seth_RESULT("NG");

				this.conn.commit();
			}else{
				this.conn.rollback();
			}
			// FLASH���Ή�
			if (struct.getg_DIRECT_DLV_FLG().equals("true")){
				((KU0030010Struct)list.get(0)).setg_DIRECT_DLV_FLG("true");
			}			
		    if (struct.getc_JOB_ODR_CD().equals("true")){
		    	((KU0030010Struct)list.get(0)).setc_JOB_ODR_CD("true");
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

		}catch(Exception e){
			e.printStackTrace();

			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		} finally {
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
				}
			}
		}
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �ԕi�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlrecall() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlrecall");
			//{{user_implement_dev:<controlrecall>

		try {
			this.conn.beginTransWeb();

			boolean ok_flg = true;

			ExchAmount ex = new ExchAmount(conn);

			Numbering ISSUE_CD = null;		//���o�ɊǗ��ԍ��̔Ԃ̏���

			// �������ʃt���O��NG�ɐݒ�
			struct.seth_RESULT("NG");

			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				// �o�׎��ѓ�
				if(chkProcExecDate("1","",struct.getg_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			// =======================================
			// ��ʕ\���s�����J��Ԃ�
			// =======================================
			// i:�s��
			for(int i=0;i<hyouji_kensu;i++){

				KU0030010Struct st = (KU0030010Struct)list.get(i);

				// =======================================
				// ���N�G�X�g��Struct�Ɋi�[
				// =======================================
				st.setg_SLIP_CD((String)struct.getList_g_SLIP_CD().get(i));//�`�[�ԍ�

				st.setg_SHIP_QTY2((String)struct.getList_g_SHIP_QTY2().get(i));
				st.seth_TOTAL_SHIP_QTY((String)struct.getList_h_TOTAL_SHIP_QTY().get(i));
				st.seth_RETURN_QTY((String)struct.getList_h_RETURN_QTY().get(i));

				st.seth_GYOMU_DATE(struct.geth_GYOMU_DATE());	//�Ɩ����t
				st.setg_DATE((String)struct.getList_g_DATE().get(i));
                st.setg_SALES_DEPT_CD((String)struct.getList_g_SALES_DEPT_CD().get(i));
                st.setg_SHIP_ODR_AMOUNT((String)struct.getList_g_SHIP_ODR_AMOUNT().get(i));
                st.setg_REMARKS((String)struct.getList_g_REMARKS().get(i));   //���l
                // Add Start 20140311 ma-jf
                st.setg_STOCK_LOT_CD((String)struct.getList_g_STOCK_LOT_CD().get(i)); // �݌Ƀ��b�g�ԍ�
                // Add End 20140311 ma-jf
				// =======================================
				// �`�[�ԍ��ȗ����͎��̍s����������
				// =======================================
				if(st.getg_SLIP_CD().equals("")){
					continue;
				}

                // �����Ǘ��`�F�b�N
                if ("1".equals(st.getUNIT_QTY_TYP())) {
                    // �����Ǘ�
                    if (st.getg_SHIP_QTY2().indexOf(".") >= 0) {
                        // �������͂̏ꍇ�F�؏グ
                        String tempString = st.getg_SHIP_QTY2();
                        double tempDouble1 = Double.parseDouble(tempString);
                        st.setg_SHIP_QTY2(Calculate.ceil(st.getg_SHIP_QTY2(), 0));
                        double tempDouble2 = Double.parseDouble(st.getg_SHIP_QTY2());
                        if (tempDouble1 != tempDouble2) {
                            // ".0"���͏��O
                            ExpjMessage emsg = new ExpjMessage( "KQ20004");
                            msgStruct.addWarn( emsg );	// ���[�j���O���b�Z�[�W�Ƃ��ēo�^
                            sysLog.info(emsg, struct.getsUser_ID()); // ���[�j���O���e
                        }
                    }
                }

				// =======================================
				// DB�֘A�`�F�b�N���������O�s��
				// =======================================

				// �r������
				List forUpdateNowaitList = entity.mselectT_SHIP_FOR_UPDATE_NOWAIT.read(conn, st);
				if (!forUpdateNowaitList.isEmpty()) {
					KU0030010Struct forUpdateNowaitStruct = (KU0030010Struct)forUpdateNowaitList.get(0);
					if (!st.getserTodrMODIFY_COUNT().equals(forUpdateNowaitStruct.getSEL_MODIFY_COUNT())) {
						ExpjMessage emsg = new ExpjMessage("ZZ01105");
						msgStruct.addError(emsg);
						conn.rollback();
						return;
					}
				}else{
					ExpjMessage emsg = new ExpjMessage("ZZ01105");
					msgStruct.addError(emsg);
					conn.rollback();
					return;
				}
				st.setserTori_IN_SLIPCD(st.getg_SLIP_CD());
				List listT_SHIP = entity.mtbl_T_SHIP.read(conn, st);

				if(listT_SHIP == null || listT_SHIP.size() == 0){
					listT_SHIP.clear();
					//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
					ok_flg = false;
					ExpjMessage emsg = new ExpjMessage( "ZZ06001");
					msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

					continue;
				}else{
                    if ("20".equals(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DEPO_TYP())) {
                        ok_flg = false;
                        ExpjMessage emsg = new ExpjMessage( "KU02013");
                        msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
                        sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
                        continue;
                    }
					// =======================================
					// �C���X�g�[���I�v�V�����̃`�F�b�N
					// =======================================
					String tmpSTATUS = null;	// ��ԋ敪
					if (entity.mchkSysInstallOptions.check(conn,st)) {
						// �u���|�Ǘ��v�T�u�V�X�e�����C���X�g�[������Ă���ꍇ
						// �u���|�Ǘ��T�u�V�X�e���Ǘ��}�X�^�v����h�`�[�Ǘ��O���[�v�h���擾����
						List listSysArCtrl = entity.mreadSysArCtrl.read(conn,st);
						if(listSysArCtrl == null || listSysArCtrl.size() == 0){
							// ���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "KI00006");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
							break;
						} else {
							//�`�[�Ǘ��O���[�v
							st.setstrSLIP_CTRL_GRP(((KU0030010Struct)listSysArCtrl.get(0)).getstrSLIP_CTRL_GRP());
							st.setstrSLIP_CD(st.getg_SLIP_CD());
							//���|�������w�b�_�e�[�u���̓Ǎ�
							List listT_AR_LEDGER_H = entity.mreadT_AR_LEDGER_H.read(conn,st);
							if(listT_AR_LEDGER_H == null || listT_AR_LEDGER_H.size() == 0){
								//���|���g�����w�b�_�e�[�u���̓Ǎ�
								List listT_AR_LEDGER_H_TRN = entity.mreadT_AR_LEDGER_H_TRN.read(conn,st);
								if(listT_AR_LEDGER_H_TRN == null || listT_AR_LEDGER_H_TRN.size() == 0){
									// ���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
									ok_flg = false;
									ExpjMessage emsg = new ExpjMessage( "KU02003");
									msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
									sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
									break;
								} else {
									// �u���|���g�����w�b�_�v�́h��ԋ敪�h���擾����
									tmpSTATUS = ((KU0030010Struct)listT_AR_LEDGER_H_TRN.get(0)).getstrSTATUS();
								}
								listT_AR_LEDGER_H_TRN = null;
							} else {
								// �u���|�������w�b�_�v�́h��ԋ敪�h���擾����
								tmpSTATUS = ((KU0030010Struct)listT_AR_LEDGER_H.get(0)).getstrSTATUS();
							}
							listT_AR_LEDGER_H = null;
						}
						listSysArCtrl = null;

					} else {
						// �u���|�Ǘ��v�T�u�V�X�e�����C���X�g�[������Ă��Ȃ��ꍇ
						// �u������сv�́h��ԋ敪�h���擾����
						tmpSTATUS = ((KU0030010Struct)listT_SHIP.get(0)).getserTori_STATUS();
					}

					// =======================================
					// ��ԋ敪�A�����敪������E�ԕi�۔���
					// =======================================
					int rv = isToriHanEnable(tmpSTATUS, ((KU0030010Struct)listT_SHIP.get(0)).getserTori_INSPC_ACPT_TYP());
					if (rv == 1) {
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KU02001");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
						break;
					}
					if (rv == 2) {
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KU02002");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
						break;
					}
					if (rv == 3) {
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "BD00027");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
						break;
					}

					//�ԕi�\���ʃ`�F�b�N
					//�o�׎��ѕԕi���ʂ��擾����
					String strReturnQty = "";
					String strTotalShipQty = "";

					st.setreadShipOdr_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO());
					List listSHIP_ODR = entity.mreadT_SHIP_ODR.read(conn, st);
					if(listSHIP_ODR == null || listSHIP_ODR.size() != 1){
						//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KU00026");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

					}else{
						strReturnQty =    (((KU0030010Struct)listSHIP_ODR.get(0)).getreadShipOdr_RETURN_QTY());
						strTotalShipQty = (((KU0030010Struct)listSHIP_ODR.get(0)).getreadShipOdr_TOTAL_SHIP_QTY());
						if(Double.parseDouble(chkNulltoZero(strTotalShipQty)) < Double.parseDouble(chkNulltoZero(strReturnQty))+Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2()))){
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "KU00068");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

						}
					}

					// =======================================
					// �o�׎��ы��z(�M��)�̎Z�o
					// =======================================
					String strShipOdrAmount="0";		//���z
					String strShipOdrAmountExchRates="0";	//���z(�M��)
					String strCurrncyCd = ((KU0030010Struct)listT_SHIP.get(0)).getserTori_CURRNCY_CD();//�ʉ݃R�[�h
					String strShipQty = st.getg_SHIP_QTY2();
					String strUnitPrice = st.getg_UNIT_PRICE();
					// Add Start 20140409 liu-j
					String strExchTyp = "";// �ב֎��
					// Add End 20140409 liu-j

					String strCustCd = "";
					String strRoundTyp = "";
					String strInspect = "";		// �����敪
					st.setmCust_IN_COMPANYCD(st.getstrCOMPANY_CD());
					st.setmCust_IN_CUSTCD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_CD());
					List listM_CUST = entity.mtbl_M_CUST.read(conn,st);
					if(listM_CUST == null || listM_CUST.size()==0){
						//�G���[����
					}else{
						strRoundTyp = (((KU0030010Struct)listM_CUST.get(0)).getmCust_DETAIL_ROUND_TYP());
						strInspect = ((KU0030010Struct)listM_CUST.get(0)).getmCust_INSPC_ACPT_TYP();
						// Add Start 20131223 liu-j
						// �����敪
						INSPC_ACPT_TYP = strInspect;
						// Add End 20131223 liu-j 
					}
					listM_CUST.clear();

					// Add Start 20140409 liu-j
					st.settOdr_IN_ODRNO(struct.getg_ODR_NO());
					List listT_ODR = entity.mtbl_T_ODR.read(conn, st);
					if(listT_ODR == null || listT_ODR.size() != 1){
						//�G���[
					}else{
						strCurrncyCd = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_CURRNCY_CD()); //�ʉ݃R�[�h
						strExchTyp = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_EXCH_TYP()); //�ב֎��
					}
					listT_ODR.clear();
					// Add End 20140409 liu-j
					
					strCustCd =((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_CD();

					String strAmount = ex.doMul(st.getg_SHIP_QTY2(),st.getg_UNIT_PRICE());
					if(ex.doMarume(strAmount, st.getstrCOMPANY_CD(), strCurrncyCd, st.geth_EXCH_TYP(), strRoundTyp, struct.geth_GYOMU_DATE())){
						strShipOdrAmount = ex.getS_EXCH_AMOUNT();
					}else{
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KQ00038");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

						continue;
					}
					// Mod Start 20140409 liu-j
					//if(ex.doExchAmount(strShipOdrAmount, st.getstrCOMPANY_CD(), strCurrncyCd, st.geth_EXCH_TYP(), strRoundTyp, st.getg_DATE())){
					if(ex.doExchAmount(strShipOdrAmount, st.getstrCOMPANY_CD(), strCurrncyCd, strExchTyp, strRoundTyp, st.getg_DATE())){
					// Mod End 20140409 liu-j
						strShipOdrAmountExchRates = ex.getS_EXCH_AMOUNT();
					}else{
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KQ00038");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

						continue;
					}

					// =======================================
					// �o�׎��т̐ԃ��R�[�h�쐬
					// =======================================

					//�ԃf�[�^�쐬
					String strShipQty0 = ((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_QTY();//�o�׎��ѐ���
					String strShipOdrAmount0=((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_AMOUNT();//���z
					String strShipOdrAmountExchRates0=((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_AMOUNT_EXCH_RATES();//���z(�M��)
					//�`�[�ԍ����̔Ԃ���
					String[] strSLIP_CD = getSlipCdAtReturn(st, ((KU0030010Struct)listT_SHIP.get(0)).getserTori_SLIP_CD());

					//�o�׎��т̌����R�[�h�_���폜
					st.setupdTship_SHIP_SEQ_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_SEQ_NO());
					rv = entity.mtbl_T_SHIP.update(conn, st);

		            // Add Start 20140311 ma-jf
					//���� [SEQ_SALES_SEQ_NO] ���擾
					List listgetT_SHIP_SEQ_NO = entity.mget_T_SHIP_SEQ_NO.read(conn, st);
					String strNewShipSeqNo = ((KU0030010Struct)listgetT_SHIP_SEQ_NO.get(0)).getgetTship_SHIP_SEQ_NO(); //�o�׎��ъǗ��ԍ�
					st.setcreTship_SHIP_SEQ_NO(strNewShipSeqNo); //�o�׎��ъǗ��ԍ�
		            // Add End 20140311 ma-jf
					st.setcreTship_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO());	//�o�׎w���ԍ�
					st.setcreTship_SLIP_CD(strSLIP_CD[0]);		//�`�[�ԍ�(�ԓ`)
					st.setcreTship_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ODR_NO());	//�󒍔ԍ�
					st.setcreTship_PART_DLV_SEQ_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_PART_DLV_SEQ_NO());//���[����
					st.setcreTship_ORGNAL_SLIP_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SLIP_CD());	//���`�[�Ǘ��ԍ�
					st.setcreTship_SLIP_TRN_CD("2");	//�`�[�敪(2�F�ԕi)
					st.setcreTship_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ITEM_CD());	//�i��
					st.setcreTship_JOB_ODR_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_JOB_ODR_CD());	//����
					st.setcreTship_CUST_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_ITEM_CD());//�ڋq�i��
					st.setcreTship_CUST_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_ODR_NO());//�ڋq�����ԍ�
					st.setcreTship_CUST_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_CD());//�ڋq�R�[�h
					st.setcreTship_CUST_NAME(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_NAME());//�ڋq����
					st.setcreTship_CUST_CHRG_PSN_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_CHRG_PSN_CD());//�c�ƒS���҃R�[�h
					st.setcreTship_SHIP_ODR_ISS_PSN_CD(struct.getstrUSER_CD());//���s�S���҃R�[�h
					st.setcreTship_DLV_LOC_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DLV_LOC_CD());//�[�i�ꏊ�R�[�h
					st.setcreTship_DEPO_TYP(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DEPO_TYP());//�a���q�ɋ敪
					st.setcreTship_ALLCT_WH_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ALLCT_WH_CD());	//�����ۊǋ�
					st.setcreTship_DEPO_WH_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DEPO_WH_CD());	//���o�a���ۊǋ�
					st.setcreTship_LOC_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_LOC_CD());//���P�[�V�����ԍ�
					st.setcreTship_SHIP_DATE(st.getg_DATE());//�o�׎��ѓ�(���.�v���)
					st.setcreTship_SHIP_QTY(Double.toString(Double.parseDouble(chkNulltoZero(strShipQty0)) * (-1)));//�o�׎��ѐ���
					st.setcreTship_UNIT_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_UNIT_CD());//�P��
					st.setcreTship_SHIP_UNIT_PRICE(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_UNIT_PRICE());//���(�P��)
					st.setcreTship_CURRNCY_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CURRNCY_CD());//�ʉ݃R�[�h
					st.setcreTship_SHIP_ODR_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmount0)) * (-1))); //�o�׎��ы��z
					st.setcreTship_SHIP_ODR_AMOUNT_EXCH_RATES(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmountExchRates0)) * (-1)));////�o�׎��ы��z(�M��)
					st.setcreTship_DIRECT_DLV_FLG(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DIRECT_DLV_FLG());//�����t���O
					st.setcreTship_DLV_KEY_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DLV_KEY_NO());//�[�i�L�[�ԍ�
					st.setcreTship_REMARKS(st.getg_REMARKS());//���l
					st.setcreTship_DEL_FLG("1");//�폜�t���O('0'�ݒ�)

					//�o�׎��у��R�[�h�쐬
					rv = entity.mtbl_T_SHIP.create(conn, st);

					// =======================================
					// �o�׎��т̍����R�[�h�쐬
					// =======================================
		            // Add Start 20140311 ma-jf
					//���� [SEQ_SALES_SEQ_NO] ���擾
					listgetT_SHIP_SEQ_NO = entity.mget_T_SHIP_SEQ_NO.read(conn, st);
					strNewShipSeqNo = ((KU0030010Struct)listgetT_SHIP_SEQ_NO.get(0)).getgetTship_SHIP_SEQ_NO(); //�o�׎��ъǗ��ԍ�
					st.setcreTship_SHIP_SEQ_NO(strNewShipSeqNo); //�o�׎��ъǗ��ԍ�
		            // Add End 20140311 ma-jf
					st.setcreTship_SLIP_CD(strSLIP_CD[1]);		//�`�[�ԍ�(���`)
					st.setcreTship_SLIP_TRN_CD("1");	//�`�[�敪(2�F�ԕi)
					//�o�׎��ѐ��� = [�o�׎���].�o�׎��ѐ��� - [���].���ѐ���
					st.setcreTship_SHIP_QTY(Double.toString(Double.parseDouble(chkNulltoZero(strShipQty0)) - Double.parseDouble(chkNulltoZero(strShipQty))));
					//�o�׎��ы��z = [�o�׎���].�o�׎��ы��z - ��L�v�Z����
					st.setcreTship_SHIP_ODR_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmount0)) - Double.parseDouble(chkNulltoZero(strShipOdrAmount))));
					//�o�׎��ы��z(�M��) = [�o�׎���].�o�׎��ы��z(�M��) - ��L�v�Z����
					st.setcreTship_SHIP_ODR_AMOUNT_EXCH_RATES(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmountExchRates0)) - Double.parseDouble(chkNulltoZero(strShipOdrAmountExchRates))));
					st.setcreTship_DEL_FLG("0");//�폜�t���O('0'�ݒ�)
					// Add Start 20130124 liu-j
					// �o�׎��ѓ�
					st.setcreTship_SHIP_DATE(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_DATE());//[�o�׎���] .�g�o�׎��ѓ��h
					// Add End 20130124 liu-j 
					//�o�׎��у��R�[�h�쐬
					rv = entity.mtbl_T_SHIP.create(conn, st);
										
					// =======================================
					// ������т̐ԃ��R�[�h�쐬
					// =======================================
					// ������т��猳���R�[�h�擾
					st.setserTsales_IN_SLIPCD(st.getg_SLIP_CD());//�L�[�ݒ�(�`�[�ԍ�)
					List listT_SALES = entity.mtbl_T_SALES.read(conn, st);
					if(listT_SALES == null || listT_SALES.size() == 0){continue;}

					
					//�V�X�e���p�����[�^("APR_SALES")�`�F�b�N
					chkAprSales(st);
					//������т̌����R�[�h�_���폜
					st.setupdTsales_SALES_SEQ_NO(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_SEQ_NO());
					rv = entity.mtbl_T_SALES.update(conn, st);

					strShipQty0 = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_QTY();//������ѐ���
					strShipOdrAmount0 = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_AMOUNT();//������z
					strShipOdrAmountExchRates0 = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_AMOUNT_EXCH_RATES();//������z(�M��)

					st.setcreTsales_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO());//�o�׎w���ԍ�
					st.setcreTsales_SLIP_CD(strSLIP_CD[0]);//�`�[�ԍ�(�ԓ`)
					st.setcreTsales_CUST_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_CUST_CD());	//�ڋq�R�[�h
					st.setcreTsales_ITEM_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_ITEM_CD());	//�i��
					st.setcreTsales_ITEM_NAME(((KU0030010Struct)listT_SALES.get(0)).getserTsales_ITEM_NAME());//�i��
					st.setcreTsales_CUST_ODR_NO(((KU0030010Struct)listT_SALES.get(0)).getserTsales_CUST_ODR_NO());//�ڋq�����ԍ�
					st.setcreTsales_SALES_DATE(st.getg_DATE());					//����v���
					st.setcreTsales_SALES_DEPT_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_DEPT_CD());//����v�㕔��
					st.setcreTsales_CUST_CHRG_PSN_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_CUST_CHRG_PSN_CD());//�c�ƒS���҃R�[�h
					st.setcreTsales_ODR_ACPT_PSN_CD(struct.getstrUSER_CD());				//���s�S���҃R�[�h
					st.setcreTsales_SALES_QTY(Double.toString(Double.parseDouble(chkNulltoZero(strShipQty0)) * (-1)));						//������ѐ���
					st.setcreTsales_SALES_UNIT_PRICE(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_UNIT_PRICE());//�P��
					st.setcreTsales_UNIT_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_UNIT_CD());	//�P��
					st.setcreTsales_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmount0)) * (-1)));					//������ы��z

					st.setcreTsales_SALES_AMOUNT_EXCH_RATES(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmountExchRates0)) * (-1)));		//������ы��z(�M��)
					st.setcreTsales_INSPC_ACPT_DATE(null);			//��̌�����
					st.setcreTsales_INSPC_ACPT_QTY(null);			//��̌�����
					st.setcreTsales_ORG_SLIP_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_ORG_SLIP_CD());//���`�[�ԍ�
					st.setcreTsales_CURRNCY_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_CURRNCY_CD());//�ʉ݃R�[�h
					st.setcreTsales_SPCL_PRICE_CO(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SPCL_PRICE_CO());//���l�敪
					st.setcreTsales_REMARKS(st.getg_REMARKS());	//���l
					st.setcreTsales_DEL_FLG("1");								//�폜�e
					st.setcreTsales_SALES_TYP(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_TYP());	//����敪
					st.setcreTsales_STATUS(((KU0030010Struct)listT_SALES.get(0)).getserTsales_STATUS());	//��ԋ敪
					st.setcreTsales_INSPC_ACPT_TYP(((KU0030010Struct)listT_SALES.get(0)).getserTsales_INSPC_ACPT_TYP());	//�����敪
					st.setcreTsales_EXCH_RATE(((KU0030010Struct)listT_SALES.get(0)).getserTsales_EXCH_RATE());	//�בփ��[�g
					String tmpTax;
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_TAX_AMOUNT_1();
					st.setcreTsales_TAX_AMOUNT_1(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// �Ŋz�P
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_TAX_AMOUNT_2();
					st.setcreTsales_TAX_AMOUNT_2(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// �Ŋz�Q
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_TAX_AMOUNT_3();
					st.setcreTsales_TAX_AMOUNT_3(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// �Ŋz�R
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_EXTERNAL_TAX_SALES_AMOUNT();
					st.setcreTsales_EXTERNAL_TAX_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));	// �O�őΏۋ��z
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_INTERNAL_TAX_SALES_AMOUNT();
					st.setcreTsales_INTERNAL_TAX_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));	// ���őΏۋ��z
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_TAXFREE_SALES_AMOUNT();
					st.setcreTsales_TAXFREE_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));;		// ��ېőΏۋ��z
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_EXTERNAL_TAX_AMOUNT();
					st.setcreTsales_EXTERNAL_TAX_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// ����Ŋz�i�O�Łj
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_INTERNAL_TAX_AMOUNT();
					st.setcreTsales_INTERNAL_TAX_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// ����Ŋz�i���Łj
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_TAX_CREDIT_SALES_AMOUNT();
					st.setcreTsales_TAX_CREDIT_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// �Ŕ�������z
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT();
					st.setcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));// �Ŕ�������z�i�M�݁j
					//������у��R�[�h�쐬
					rv = entity.mtbl_T_SALES.create(conn, st);

					// =======================================
					// ������т̍����R�[�h�쐬
					// =======================================
					//����敪�A��ԋ敪�A��̌������A��̌������̔���
					String salesTyp = null;
					String status = null;
					String acptDate = null;
					String acptQty = null;
					if ("1".equals(strInspect)) {
						salesTyp = "1";
						status = "20";
						acptDate = st.getg_DESINATED_SHIP_DATE();
						acptQty = st.getg_SHIP_QTY2();
					} else {
						salesTyp = "2";
						status = "10";
					}
					st.setcreTsales_SALES_TYP(salesTyp);//����敪
					st.setcreTsales_STATUS(status);//��ԋ敪
					st.setcreTsales_INSPC_ACPT_TYP(strInspect);//�����敪

					st.setcreTsales_SLIP_CD(strSLIP_CD[1]);//�`�[�ԍ�(���`)

					//������ѐ��� = [�������].���ѐ��� - [���].���ѐ���
					st.setcreTsales_SALES_QTY(Double.toString(Double.parseDouble(chkNulltoZero(strShipQty0)) - Double.parseDouble(chkNulltoZero(strShipQty))));
					//������ы��z = [�������].������ы��z - ��L�v�Z����
					st.setcreTsales_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmount0)) - Double.parseDouble(chkNulltoZero(strShipOdrAmount))));
					//������ы��z(�M��) = [�������].������ы��z(�M��) - ��L�v�Z����
					st.setcreTsales_SALES_AMOUNT_EXCH_RATES(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmountExchRates0)) - Double.parseDouble(chkNulltoZero(strShipOdrAmountExchRates))));
					st.setcreTsales_DEL_FLG("0");//�폜�e

					// Add Start 20131223 liu-j
					// [�o�׎w��].�g�󒍔ԍ��h��[�󒍖���].�g����ŃR�[�h�h���擾����
					List taxList = entity.mgetT_ODR_TAX.read(conn, struct);
					if (!taxList.isEmpty()){
						st.setupdiffTAX_CD(((KU0030010Struct)taxList.get(0)).getstrT_ODR_TAX());
					}	
					SCDL_DLV_DATE  = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_DATE();	
					st.setcreTsales_SALES_DATE(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_DATE());	
					// �o�׎��ѕԕi����(�m������сn�̓o�^)
					CALCU_TAX_TYPE = "4";
					// Add End 20131223 liu-j
					//����ŋ��z�v�Z
					String taxAmount[] = this.doCalcuTaxAmount(st, strCustCd, struct.getstrCOMPANY_CD(), st.getg_CUST_ITEM_CD(), st.getcreTsales_SALES_AMOUNT());
					st.setcreTsales_TAX_AMOUNT_1(taxAmount[0]); // �Ŋz�P
					st.setcreTsales_TAX_AMOUNT_2(taxAmount[1]); // �Ŋz�Q
					st.setcreTsales_TAX_AMOUNT_3(taxAmount[2]); // �Ŋz�R

					st.setcreTsales_EXTERNAL_TAX_SALES_AMOUNT("0"); // �O�őΏۋ��z
					st.setcreTsales_INTERNAL_TAX_SALES_AMOUNT("0"); // ���őΏۋ��z
					st.setcreTsales_TAXFREE_SALES_AMOUNT("0");      // ��ېőΏۋ��z
					st.setcreTsales_EXTERNAL_TAX_AMOUNT("0");       // ����Ŋz�i�O�Łj
					st.setcreTsales_INTERNAL_TAX_AMOUNT("0");       // ����Ŋz�i���Łj

                    String sTmpTax = Calculate.add(taxAmount[0], taxAmount[1]);
                    sTmpTax = Calculate.add(sTmpTax, taxAmount[2]);
                    double dblTax = Double.parseDouble(sTmpTax);
					
					if ("1".equals(this.TAX_KBN)){
						st.setcreTsales_EXTERNAL_TAX_AMOUNT(String.valueOf(dblTax));
						st.setcreTsales_EXTERNAL_TAX_SALES_AMOUNT(st.getcreTsales_SALES_AMOUNT());
					} else
					if ("5".equals(this.TAX_KBN) || "9".equals(this.TAX_KBN)){
						st.setcreTsales_INTERNAL_TAX_AMOUNT(String.valueOf(dblTax));
						st.setcreTsales_INTERNAL_TAX_SALES_AMOUNT(st.getcreTsales_SALES_AMOUNT());
					} else
					if ("0".equals(this.TAX_KBN)){
						st.setcreTsales_TAXFREE_SALES_AMOUNT(st.getcreTsales_SALES_AMOUNT());
					}

					dblTax = Double.parseDouble(st.getcreTsales_EXTERNAL_TAX_SALES_AMOUNT())
					       + Double.parseDouble(st.getcreTsales_INTERNAL_TAX_SALES_AMOUNT())
					       + Double.parseDouble(st.getcreTsales_TAXFREE_SALES_AMOUNT())
					       - Double.parseDouble(st.getcreTsales_INTERNAL_TAX_AMOUNT());

					st.setcreTsales_TAX_CREDIT_SALES_AMOUNT(String.valueOf(dblTax));        // �Ŕ�������z

                    String tmpTaxExchRates = "0";
                    // Mod Start 20140409 liu-j
                    //if(ex.doExchAmount(String.valueOf(dblTax), st.getstrCOMPANY_CD(), strCurrncyCd, st.geth_EXCH_TYP(), strRoundTyp, st.getg_DATE())){
                    if(ex.doExchAmount(String.valueOf(dblTax), st.getstrCOMPANY_CD(), strCurrncyCd, strExchTyp, strRoundTyp, st.getg_DATE())){
                    // Mod End 20140409 liu-j
                        tmpTaxExchRates = ex.getS_EXCH_AMOUNT();
                    }
					st.setcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(tmpTaxExchRates); // �Ŕ�������z�i�M�݁j
					
					// Add Start 20131223 liu-j
					// ����v���
					st.setcreTsales_SALES_DATE(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_DATE());	
					// Add End 20131223 liu-j
					bIsJpCur = ex.isB_ISJPCUR();
					// �בփ��[�g
					// �M�݂̏ꍇ
					if (bIsJpCur) {
						// �בփ��[�g
						st.setcreTsales_EXCH_RATE("1");
					} else {
						KU0030010Struct wt = new KU0030010Struct();
						wt.setstrCOMPANY_CD(st.getstrCOMPANY_CD());
						wt.setstrOdrCurrncyCd(strCurrncyCd);
						wt.setstrExchTyp(strExchTyp);
						wt.setg_DATE(st.getg_DATE());
						List tempList = new ArrayList();
						// �בփ��[�g���擾
						tempList = entity.mselectM_EXCH_RATE.read(conn, wt);
						
						st.setcreTsales_EXCH_RATE(((KU0030010Struct)tempList.get(0)).getcreTsales_EXCH_RATE());
					}
					//������у��R�[�h�쐬
					rv = entity.mtbl_T_SALES.create(conn, st);

		            // Del Start 20140311 ma-jf
					// =======================================
					// �ۊǋ�ʕi�ڂ̃��R�[�h�X�V
					// =======================================
		            // Del End 20140311 ma-jf
					//�ԕi��p�̕ۊǋ�R�[�h�擾
					String strRwhCd = "";
					List listRECALL_WH = entity.mgetRecallWhCd.read(conn,st);
					if(listRECALL_WH == null || listRECALL_WH.size() != 1){
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KU02004");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

						continue;
					}else{
						strRwhCd =((KU0030010Struct)listRECALL_WH.get(0)).getstrCode();
					}

		            // Add Start 20140311 ma-jf
					//���b�g�Ǘ��t���O
					String strLotCtrlFlg = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).geth_LOT_CTRL_FLG());
					if (!LotCtrl.checkLotCtrl(conn)) {
						strLotCtrlFlg = "0";
					}
					//[�i��].�g���b�g�Ǘ��t���O�h�� 0�F���b�g�Ǘ����s��Ȃ��̏ꍇ
					if ("0".equals(strLotCtrlFlg)) {
						
						// =======================================
						// �ۊǋ�ʕi�ڂ̃��R�[�h�X�V
						// =======================================
			        // Add End 20140311 ma-jf
						String strStockOnHandQty = "";
						
						//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�����݂��`�F�b�N
						st.setserTitemStock_IN_ITEMCD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_ITEM_CD());
						st.setserTitemStock_IN_WHCD(strRwhCd);
						List listT_ITEM_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn, st);
						if(listT_ITEM_STOCK == null || listT_ITEM_STOCK.size() != 1){
							//���݂��Ȃ��ꍇ�A���R�[�h����
							st.setcreTitemStock_ITEM_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_ITEM_CD());
							st.setcreTitemStock_WH_CD(strRwhCd);
							st.setcreTitemStock_STOCK_ON_HAND_QTY(strShipQty);
	
							/*List listGetPlantCd = entity.mgetPlantFromWhCd.read(conn,st);
							st.setcreTitemStock_PLANT_CD(((KU0030010Struct)listGetPlantCd.get(0)).getcreTitemStock_PLANT_CD());*/
							//�ۊǋ�̍H��R�[�h���擾
							st.setmWh_IN_WH_CD(strRwhCd);
							st.setcreTitemStock_PLANT_CD(getPlantCd(st));	//�H��R�[�h
	
							rv = entity.mtbl_T_ITEM_STOCK.create(conn, st);
						}else{
							//���݂���ꍇ�A���R�[�h�X�V
							strStockOnHandQty = ((KU0030010Struct)listT_ITEM_STOCK.get(0)).getserTitemStock_STOCK_ON_HAND_QTY();
							st.setupTitemStock_STOCK_ON_HAND_QTY(Double.parseDouble(chkNulltoZero(strStockOnHandQty))+Double.parseDouble(chkNulltoZero(strShipQty))+"");
							st.setupTitemStock_IN_WHCD(strRwhCd);
							st.setupTitemStock_IN_ITEMCD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_ITEM_CD());
	
							rv = entity.mtbl_T_ITEM_STOCK.update(conn, st);
						}
	
						// =======================================
						// �ۊǋ�ʓ��o�ɂ̃��R�[�h�쐬
						// =======================================
	
						// �R�l�N�V������n���āA�̔Ԃ̏���
						ISSUE_CD = new Numbering(conn,Numbering.ISSUE_CD,st.getsUser_ID(),"KU0030010",st.getstrPLANT_CD());
						st.setcreTrcvIssue_RCV_ISSUE_CTRL_CD(ISSUE_CD.getNo());	//���o�ɊǗ��ԍ�
						st.setcreTrcvIssue_RCV_ISSUE_TYP("1");			//���o�ɋ敪(1:����)
						st.setcreTrcvIssue_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ITEM_CD());//�i��
						
						//st.setcreTrcvIssue_PLANT_CD(st.getstrPLANT_CD());	//�H��R�[�h
						//�ۊǋ�̍H��R�[�h���擾
						st.setmWh_IN_WH_CD(strRwhCd);
						st.setcreTrcvIssue_PLANT_CD(getPlantCd(st));	//�H��R�[�h
						
						st.setcreTrcvIssue_WH_CD(strRwhCd);			//�ۊǋ�
						st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(chkNulltoZero(strStockOnHandQty));	//���o�ɑO�݌ɐ�
						st.setcreTrcvIssue_RCV_ISSUE_QTY(strShipQty);		//���o�ɐ�
						st.setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(Calculate.add(st.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(),st.getcreTrcvIssue_RCV_ISSUE_QTY())); //���o�Ɍ�݌ɐ�
						st.setcreTrcvIssue_RCV_ISSUE_AMOUNT("0");	//���o�ɋ��z
						st.setcreTrcvIssue_RCV_ISSUE_DATE(st.getg_DATE());//�o�׎��ьv���
						st.setcreTrcvIssue_RCV_ISSUE_COMMENT(st.getg_REMARKS());//���o�ɔ��l
						st.setcreTrcvIssue_RCV_ISSUE_GNR_TYP("33");		//���o�ɔ����敪
						st.setcreTrcvIssue_STOCK_UPD_TYP("2");			//�݌ɍX�V�敪
						st.setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG("1");		//���o�Ɋ����t���O
	
						//�ۊǋ�ʓ��o�ɂ̃��R�[�h�쐬
						rv = entity.mtbl_T_RCV_ISSUE.create(conn, st);
						
			        // Add Start 20140311 ma-jf
					} else {
						//[�i��].�g���b�g�Ǘ��t���O�h�� 1�F���b�g�Ǘ����s���̏ꍇ
						String strItemCd = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_ITEM_CD(); //�i�ڔԍ�
						String strShipSeqNo = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_SEQ_NO()); //�o�׎��ъǗ��ԍ�
						String strStockLotNo = st.getg_STOCK_LOT_CD(); //�݌Ƀ��b�g�ԍ�
						
						String strMayReturnQty = chkNulltoZero(st.getg_SHIP_QTY2()); //�ϐ��u�ԕi�\���v=[���]."�o�׎��ѐ���"
						String strRealShipQty = chkNulltoZero(st.getg_SHIP_QTY2()); //�ϐ��u�o�׎��ѐ��ʁv=[���]."�o�׎��ѐ���"
						
						//[�o�׎��і���]��茟������
						st.setreadTshipInst_IN_SHIP_SEQ_NO(strShipSeqNo); //�o�׎��ъǗ��ԍ�
						st.setreadTshipInst_IN_LOT_NO(strStockLotNo); //�݌Ƀ��b�g�ԍ�
						List listT_SHIP_INST = entity.mread_T_SHIP_INST.read(conn, st);
						if (listT_SHIP_INST != null && listT_SHIP_INST.size() > 0) {
							// �擾����[�o�׎��і���].�g���b�g�ʏo�׎��ѐ��ʁh�̍��v���擾����
							String strTotalLotShipQty = "0";
							for (int j=0; j<listT_SHIP_INST.size(); j++) {
								KU0030010Struct inst = (KU0030010Struct)listT_SHIP_INST.get(j);
								strTotalLotShipQty = Calculate.add(strTotalLotShipQty, chkNulltoZero(inst.getreadTshipInst_SHIP_QTY()));
							}
							// �擾����[�o�׎��і���].�g���b�g�ʏo�׎��ѐ��ʁh�̍��v < [���].�g�o�׎��ѐ��ʁh�̏ꍇ
							if (!compDecimal(new BigDecimal(strTotalLotShipQty), new BigDecimal(strRealShipQty))) {
								ok_flg = false;
								ExpjMessage emsg = new ExpjMessage( "KU00121");
								msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
								sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
								
								continue;
							}
							
							for (int j=0; j<listT_SHIP_INST.size(); j++) {
								KU0030010Struct inst = (KU0030010Struct)listT_SHIP_INST.get(j);
								String strLotShipQty = chkNulltoZero(inst.getreadTshipInst_SHIP_QTY()); //���b�g�ʏo�׎��ѐ���
								
								if (compDecimal(new BigDecimal(strLotShipQty), new BigDecimal(strRealShipQty))) {
									strMayReturnQty = strRealShipQty; //�ϐ��u�ԕi�\���v�@���@�ϐ��u�o�׎��ѐ��ʁv
								} else {
									strMayReturnQty = strLotShipQty; //�ϐ��u�ԕi�\���v�@���@�J��Ԃ��̃��b�g�ʏo�׎��ѐ���
								}
								
								// �T.�ϐ��u�ԕi���ѐ��ʁv �� 0�̏ꍇ�A�ԕi�p�q�� �� �o�׎��ѐ��� ����ɂ���B
								if (Double.parseDouble(strRealShipQty) > 0) {
									// =======================================
									// �ۊǋ�ʍ݌ɂ̃��R�[�h�X�V
									// =======================================
									st.setserTitemStock_IN_ITEMCD(strItemCd);
									st.setserTitemStock_IN_WHCD(strRwhCd);
									List listT_ITEM_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn,st);
									if (listT_ITEM_STOCK != null && listT_ITEM_STOCK.size() == 1) {
	
										st.setupTitemStock_IN_ITEMCD(strItemCd);
										st.setupTitemStock_IN_WHCD(strRwhCd);
										//�莝�݌ɐ�
										String strItemStockOnHandQty = this.replaceNull(((KU0030010Struct)listT_ITEM_STOCK.get(0)).getserTitemStock_STOCK_ON_HAND_QTY());
										//�i�ڕʎ莝�݌�=�i�ڕʎ莝�݌�(�O)+���.���ѐ���
										st.setupTitemStock_STOCK_ON_HAND_QTY(Double.parseDouble(chkNulltoZero(strItemStockOnHandQty))+Double.parseDouble(chkNulltoZero(strMayReturnQty))+"");
										
										//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�X�V
										rv = entity.mtbl_T_ITEM_STOCK.update(conn, st);
										listT_ITEM_STOCK.clear();
									} else {
										st.setcreTitemStock_ITEM_CD(strItemCd);
										st.setcreTitemStock_WH_CD(strRwhCd);
										//�a���̍쐬���͎莝���ʂ��ԕi�\���ɂȂ�B
										st.setcreTitemStock_STOCK_ON_HAND_QTY(strMayReturnQty);
	
										//�ۊǋ�̍H��R�[�h���擾
										st.setmWh_IN_WH_CD(strRwhCd);
										st.setcreTitemStock_PLANT_CD(getPlantCd(st)); //�H��R�[�h
	
										//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�o�^
										rv = entity.mtbl_T_ITEM_STOCK.create(conn, st);
									}
								
									// =======================================
									// ���b�g�ʎ莝�݌Ƀ��R�[�h�̍X�V
									// =======================================
									//���b�g�ʎ莝�݌ɐ�
									String strLotStockOnHandQty = "0";
										
									st.setserLotIN_ITEM_CD(strItemCd); //�i�ڔԍ�
									st.setserLotIN_WH_CD(strRwhCd); //�U�֐�ۊǋ�
									st.setserLotIN_LOT_NO(inst.getreadTshipInst_LOT_NO()); //�݌Ƀ��b�g�ԍ�
									List listT_LOT_STOCK = entity.mtbl_T_LOT_STOCK.read(conn, st);
									if (listT_LOT_STOCK != null && listT_LOT_STOCK.size() == 1) {
	
										st.setupTlotStockIN_ITEM_CD(strItemCd);
										st.setupTlotStockIN_WH_CD(strRwhCd);
										st.setupTlotStockIN_LOT_NO(inst.getreadTshipInst_LOT_NO());
										//���b�g�ʎ莝�݌ɐ�
										strLotStockOnHandQty = this.replaceNull(((KU0030010Struct)listT_LOT_STOCK.get(0)).getserLotSTOCK_ON_HAND_QTY());
										//���b�g�ʎ莝�݌�=���b�g�ʎ莝�݌�(�O)+���.���ѐ���
										st.setupTlotStockSTOCK_ON_HAND_QTY(Double.parseDouble(chkNulltoZero(strLotStockOnHandQty))+Double.parseDouble(chkNulltoZero(strMayReturnQty))+"");
										
										//���b�g�ʎ莝�݌Ƀ��R�[�h�X�V
										rv = entity.mtbl_T_LOT_STOCK.update(conn, st);
										listT_LOT_STOCK.clear();
									} else {
										st.setinsertLotStock_ITEM_CD(strItemCd);
										st.setinsertLotStock_WH_CD(strRwhCd);
										st.setinsertLotStock_LOT_CD(inst.getreadTshipInst_LOT_NO());
										//�ۊǋ�̍H��R�[�h���擾
										st.setmWh_IN_WH_CD(strRwhCd);
										st.setinsertLotStock_PLANT_CD(getPlantCd(st)); //�H��R�[�h
										//�a���̍쐬���͎莝���ʂ��o�׎��ѐ��ʂɂȂ�B
										st.setinsertLotStock_STOCK_ON_HAND_QTY(strMayReturnQty); //���b�g�ʎ莝�݌�
										st.setinsertLotStock_ALCD_QTY("0"); //�����ϐ���
										st.setinsertLotStock_DEFECT_QTY("0"); //���b�g�ʕs�ǐ�
										
										//���b�g�ʎ莝�݌Ƀ��R�[�h�o�^
										rv = entity.mtbl_T_LOT_STOCK.create(conn, st);
									}
								
									// =======================================
									// �ۊǋ�ʓ��o�ɂ̃��R�[�h�쐬
									// =======================================
				
									// �R�l�N�V������n���āA�̔Ԃ̏���
									ISSUE_CD = new Numbering(conn,Numbering.ISSUE_CD,st.getsUser_ID(),"KU0030010",st.getstrPLANT_CD());
									st.setcreTrcvIssue_RCV_ISSUE_CTRL_CD(ISSUE_CD.getNo());
									st.setcreTrcvIssue_RCV_ISSUE_TYP("1"); //���o�ɋ敪(1:����)
									st.setcreTrcvIssue_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ITEM_CD());//�i��
									st.setcreTrcvIssue_JOB_ODR_CD("");//����
									
									//�ۊǋ�̍H��R�[�h���擾
									st.setmWh_IN_WH_CD(strRwhCd);
									st.setcreTrcvIssue_PLANT_CD(getPlantCd(st));	//�H��R�[�h
									
									st.setcreTrcvIssue_WH_CD(strRwhCd);//�ۊǋ�R�[�h
									st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(strLotStockOnHandQty);//���o�ɑO�݌ɐ�
									st.setcreTrcvIssue_RCV_ISSUE_QTY(strMayReturnQty);//���o�ɐ�
									st.setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(Calculate.add(st.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(),st.getcreTrcvIssue_RCV_ISSUE_QTY()));//���o�Ɍ�݌ɐ�					
									st.setcreTrcvIssue_RCV_ISSUE_AMOUNT("0");//���o�ɋ��z
									st.setcreTrcvIssue_RCV_ISSUE_DATE(st.getg_DATE());//���o�ɔN����
									st.setcreTrcvIssue_RCV_ISSUE_COMMENT(st.getg_REMARKS());//���o�ɔ��l
									st.setcreTrcvIssue_RCV_ISSUE_GNR_TYP("33");	//���o�ɔ����敪
									st.setcreTrcvIssue_STOCK_UPD_TYP("2");		//�݌ɍX�V�敪
									st.setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG("1");//���o�Ɋ����t���O
									st.setcreTrcvIssue_LOT_NO(inst.getreadTshipInst_LOT_NO()); //�݌Ƀ��b�g�ԍ�
									// Add Start 20140401 zhang-zl
									st.setcreTrcvIssue_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO()); //�o�׎w���ԍ�
									// Add End 20140401 zhang-zl
				
									//�ۊǋ�ʓ��o�ɂ̃��R�[�h�쐬
									rv = entity.mtbl_T_RCV_ISSUE.create(conn, st);
									
									// =======================================
									// �o�׎��і��׃��R�[�h�̍쐬
									// =======================================
									// [�o�׎��і���].�g���b�g�ʏo�׎��ѐ��ʁh - �u�ԕi�\���v �� 0�̏ꍇ�A�]��̏o�׎��ѐ��ʂ�[�o�׎��і���]�ɓo�^����B
									if (compDecimal1(new BigDecimal(strLotShipQty), new BigDecimal(strMayReturnQty))) {
										st.setinsTshipInst_SHIP_SEQ_NO(strNewShipSeqNo); //�o�׎��ъǗ��ԍ�(���f�[�^)
										st.setinsTshipInst_SHIP_ODR_NO(inst.getreadTshipInst_SHIP_ODR_NO()); //�o�׎w���ԍ�
										st.setinsTshipInst_LOT_NO(inst.getreadTshipInst_LOT_NO()); //�݌Ƀ��b�g�ԍ�
										st.setinsTshipInst_ITEM_CD(inst.getreadTshipInst_ITEM_CD()); //�o�וi�ڔԍ�
										st.setinsTshipInst_WH_CD(inst.getreadTshipInst_WH_CD()); //�ۊǋ�R�[�h
										st.setinsTshipInst_ODR_NO(inst.getreadTshipInst_ODR_NO()); //�󒍔ԍ�
										st.setinsTshipInst_SLIP_CD(inst.getreadTshipInst_SLIP_CD()); //�`�[�ԍ�
										st.setinsTshipInst_SHIP_QTY(Calculate.subtract(strLotShipQty, strMayReturnQty)); //���b�g�ʏo�׎��ѐ���
										st.setinsTshipInst_SHIP_DATE(inst.getreadTshipInst_SHIP_DATE()); //�o�׎��ѓ�
										
										//�o�׎��і��ׂ̃��R�[�h�쐬
										rv = entity.mtbl_T_SHIP_INST.create(conn, st);
									}
								
									// =======================================
									// ���b�g�g���[�X�̃��R�[�h�쐬
									// =======================================
									st.settlotTrace_FROM_ITEM_CD(strItemCd); //���i�ڔԍ�
									st.settlotTrace_FROM_LOT_NO(inst.getreadTshipInst_LOT_NO()); //�����b�g�ԍ�
									st.settlotTrace_TO_ITEM_CD(strItemCd); //��i�ڔԍ�
									st.settlotTrace_TO_LOT_NO(inst.getreadTshipInst_LOT_NO()); //�惍�b�g�ԍ�
									st.settlotTrace_LOT_TRACE_TYP("5"); //���b�g�g���[�X�敪=5�F�o�׎���
									if (entity.mtbl_T_LOT_TRACE.check(conn, st)) {
										st.settlotTrace_CUST_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_ODR_NO()); //���Ӑ撍���ԍ�
										st.settlotTrace_SLIP_CD(strSLIP_CD[1]); //�`�[�ԍ�
										st.settlotTrace_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ODR_NO()); //�󒍔ԍ�
										rv = entity.mupdateT_LOT_TRACE.update(conn, st);
									}
									
									//�ϐ��u�o�׎��ѐ��ʁv�@���@�ϐ��u�o�׎��ѐ��ʁv�@�|�@�ϐ��u�ԕi�\���v
									strRealShipQty = Calculate.subtract(strRealShipQty, strMayReturnQty);

								// �U. �ϐ��u�ԕi���ѐ��ʁv�� 0�̏ꍇ�A�]��̏o�׎��і��׃f�[�^���������B
								} else {
									
									// =======================================
									// �o�׎��і��׃��R�[�h�̍쐬
									// =======================================
									// �U. �ϐ��u�ԕi���ѐ��ʁv�� 0�̏ꍇ�A�]��̏o�׎��і��׃f�[�^���������B
									st.setinsTshipInst_SHIP_SEQ_NO(strNewShipSeqNo); //�o�׎��ъǗ��ԍ�(���f�[�^)
									st.setinsTshipInst_SHIP_ODR_NO(inst.getreadTshipInst_SHIP_ODR_NO()); //�o�׎w���ԍ�
									st.setinsTshipInst_LOT_NO(inst.getreadTshipInst_LOT_NO()); //�݌Ƀ��b�g�ԍ�
									st.setinsTshipInst_ITEM_CD(inst.getreadTshipInst_ITEM_CD()); //�o�וi�ڔԍ�
									st.setinsTshipInst_WH_CD(inst.getreadTshipInst_WH_CD()); //�ۊǋ�R�[�h
									st.setinsTshipInst_ODR_NO(inst.getreadTshipInst_ODR_NO()); //�󒍔ԍ�
									st.setinsTshipInst_SLIP_CD(inst.getreadTshipInst_SLIP_CD()); //�`�[�ԍ�
									st.setinsTshipInst_SHIP_QTY(strLotShipQty); //���b�g�ʏo�׎��ѐ���
									st.setinsTshipInst_SHIP_DATE(inst.getreadTshipInst_SHIP_DATE()); //�o�׎��ѓ�
									
									//�o�׎��і��ׂ̃��R�[�h�쐬
									rv = entity.mtbl_T_SHIP_INST.create(conn, st);
								}
							}
							
							// =======================================
							// ���o�׎��і��ׂ̑ޔ�
							// =======================================
							// �݌Ƀ��b�g�ԍ�����͂���ꍇ
							if (strStockLotNo != null && !"".equals(strStockLotNo)) {
								// �ޔ����Ȃ�[�o�׎��і���]����������
								st.setreadTshipInst_IN_SHIP_SEQ_NO(strShipSeqNo); //�o�׎��ъǗ��ԍ�
								st.setreadTshipInst_IN_LOT_NO(strStockLotNo); //�݌Ƀ��b�g�ԍ�
								List restTShipInst = entity.mread_Rest_T_SHIP_INST.read(conn, st);
								if (restTShipInst != null && restTShipInst.size() > 0) {
									KU0030010Struct rstInst = null;
									for (int k = 0; k < restTShipInst.size(); k++) {
										rstInst = (KU0030010Struct) restTShipInst.get(k);

										rstInst.setsUser_ID(struct.getsUser_ID());
										rstInst.setinsTshipInst_SHIP_SEQ_NO(strNewShipSeqNo); //�o�׎��ъǗ��ԍ�(���f�[�^)
										rstInst.setinsTshipInst_SHIP_ODR_NO(rstInst.getreadTshipInst_SHIP_ODR_NO()); //�o�׎w���ԍ�
										rstInst.setinsTshipInst_LOT_NO(rstInst.getreadTshipInst_LOT_NO()); //�݌Ƀ��b�g�ԍ�
										rstInst.setinsTshipInst_ITEM_CD(rstInst.getreadTshipInst_ITEM_CD()); //�o�וi�ڔԍ�
										rstInst.setinsTshipInst_WH_CD(rstInst.getreadTshipInst_WH_CD()); //�ۊǋ�R�[�h
										rstInst.setinsTshipInst_ODR_NO(rstInst.getreadTshipInst_ODR_NO()); //�󒍔ԍ�
										rstInst.setinsTshipInst_SLIP_CD(rstInst.getreadTshipInst_SLIP_CD()); //�`�[�ԍ�
										rstInst.setinsTshipInst_SHIP_QTY(rstInst.getreadTshipInst_SHIP_QTY()); //���b�g�ʏo�׎��ѐ���
										rstInst.setinsTshipInst_SHIP_DATE(rstInst.getreadTshipInst_SHIP_DATE()); //�o�׎��ѓ�

										//�o�׎��і��ׂ̑ޔ��f�[�^�쐬
										rv = entity.mtbl_T_SHIP_INST.create(conn, rstInst);
									}
								}
							}
							
							// =======================================
							// ���o�׎��і��ׂ̍폜
							// =======================================
							st.setdelTshipInstIN_SHIP_SEQ_NO(strShipSeqNo); // �o�׎��ъǗ��ԍ�
							st.setdelTshipInstIN_LOT_NO(null); // �݌Ƀ��b�g�ԍ�
							rv = entity.mtbl_T_SHIP_INST.delete(conn, st);
						} else {
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "KU00120");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
							
							continue;
						}
					}
		            // Add End 20140311 ma-jf

					// =======================================
					// �o�׎w�����R�[�h�̍X�V
					// =======================================
					strReturnQty = (Double.parseDouble(chkNulltoZero(strReturnQty))+Double.parseDouble(chkNulltoZero(strShipQty)))+""; //�o�׎��ї݌v��(�݌v��+��ʓ��͎��ѐ���)

					st.setupTshipOdr_SLIP_CD(strSLIP_CD[1]);		//�`�[�ԍ�(���`)
					st.setupTshipOdr_ORG_SLIP_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SLIP_CD());		//���`�[�ԍ�
					st.setupTshipOdr_RETURN_QTY(strReturnQty);//�o�׎��ї݌v��
					st.setupTshipOdr_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO());//�o�׎w���ԍ�
					rv = entity.mtbl_T_SHIP_ODR3.update(conn, st);

					listT_SALES.clear();
						// =======================================
						// ���|�Ǘ��T�^�e(���i)�̌ďo
						// =======================================
					if (entity.mchkSysInstallOptions.check(conn,st)) {
						
                        ArIf arIf = new ArIf(conn);
                        arIf.setParameter("3", struct.getsUser_ID(),
                                          st.getg_SLIP_CD(),
                                          strSLIP_CD[0], strSLIP_CD[1]);
                        String msgNo = arIf.execute();
                        if (!"0".equals(msgNo)) {
                            ok_flg = false;
                            ExpjMessage emsg = new ExpjMessage(msgNo);
                            msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
                            sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
                        }
					}
                    struct.setg_SLIP_CD(strSLIP_CD[1]);	// ��ʓ`�[�ԍ�
				}
			}
			if(ok_flg == true){
				//����o�^������ɏI������ꍇ
				ExpjMessage emsg = new ExpjMessage( "KU00103");
				sysLog.severe(emsg, struct.getsUser_ID());
				msgStruct.addInfo( emsg );
				
				this.conn.commit();
			}else{
				this.conn.rollback();
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

		} catch(ResourceBusyException e){
			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01105" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			emsg = new ExpjMessage( "ZZ01105", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			throw ee;
		}catch(Exception e){
			e.printStackTrace();

			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		} finally {
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
				}
			}
		}

                //}}user_implement_dev:<controlrecall>
		logger.exiting("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlrecall");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controltorikeshi() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Control"+":USER="+struct.getsUser_ID(),"controltorikeshi");
			//{{user_implement_dev:<controltorikeshi>
		try {
			this.conn.beginTransWeb();

			boolean ok_flg = true;

			ExchAmount ex = new ExchAmount(conn);

			Numbering ISSUE_CD = null;		//���o�ɊǗ��ԍ��̔Ԃ̏���

			// �������ʃt���O��NG�ɐݒ�
			struct.seth_RESULT("OK");

			// ���Y���̉ߋ��̎��ѓ��͂̐����`�F�b�N
			if(getSysParameter() == false){
				// �o�׎w���
				if(chkProcExecDate("3",struct.getg_DESINATED_SHIP_DATE(),struct.getg_DESINATED_SHIP_DATE()) == false){
					setErrorMessage(ProcExecDateError);
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
					setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}
			// =======================================
			// ��ʕ\���s�����J��Ԃ�
			// =======================================
			// i:�s��
			for(int i=0;i<hyouji_kensu;i++){

				KU0030010Struct st = (KU0030010Struct)list.get(i);

				// =======================================
				// ���N�G�X�g��Struct�Ɋi�[
				// =======================================
				st.setg_SLIP_CD((String)struct.getList_g_SLIP_CD().get(i));	//�`�[�ԍ�
				st.seth_GYOMU_DATE(st.geth_GYOMU_DATE());			//�Ɩ����t
				st.setg_DATE((String)struct.getList_g_DATE().get(i));
				st.seth_MODFIY_CNT((String)struct.getList_h_MODFIY_CNT().get(i));
                st.setg_SALES_DEPT_CD((String)struct.getList_g_SALES_DEPT_CD().get(i));
                st.setg_SHIP_ODR_AMOUNT((String)struct.getList_g_SHIP_ODR_AMOUNT().get(i));
                st.setg_REMARKS((String)struct.getList_g_REMARKS().get(i));    //���l

				// =======================================
				// �`�[�ԍ��ȗ����͎��̍s����������
				// =======================================
				if(st.getg_SLIP_CD().equals("")){
					continue;
				}

				// �r������
				List forUpdateList = entity.mselectT_SHIP_FOR_UPDATE_NOWAIT.read(conn, st);
				if (!forUpdateList.isEmpty()) {
					KU0030010Struct forUpdateStruct = (KU0030010Struct)forUpdateList.get(0);
					if (!st.getserTodrMODIFY_COUNT().equals(forUpdateStruct.getSEL_MODIFY_COUNT())) {
						ExpjMessage emsg = new ExpjMessage("ZZ01105");
						msgStruct.addError(emsg);
						conn.rollback();
						return;
					}
				}else{
					ExpjMessage emsg = new ExpjMessage("ZZ01105");
					msgStruct.addError(emsg);
					conn.rollback();
					return;
				}
				// =======================================
				// DB�֘A�`�F�b�N���������O�s��
				// =======================================
				st.setserTori_IN_SLIPCD(st.getg_SLIP_CD());
				List listT_SHIP = entity.mtbl_T_SHIP.read(conn, st);

				if(listT_SHIP == null || listT_SHIP.size() == 0){
					listT_SHIP.clear();
					ok_flg = false;
					ExpjMessage emsg = new ExpjMessage( "KU00026");
					msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

					continue;
				}else{
		            // Add Start 20140311 ma-jf
					//���b�g�Ǘ��t���O
					String strLotCtrlFlg = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).geth_LOT_CTRL_FLG());
					if (!LotCtrl.checkLotCtrl(conn)) {
						strLotCtrlFlg = "0";
					}
		            // Add End 20140311 ma-jf

					// =======================================
					// �C���X�g�[���I�v�V�����̃`�F�b�N
					// =======================================
					String tmpSTATUS = null;	// ��ԋ敪
					if (entity.mchkSysInstallOptions.check(conn,st)) {
						// �u���|�Ǘ��v�T�u�V�X�e�����C���X�g�[������Ă���ꍇ
						// �u���|�Ǘ��T�u�V�X�e���Ǘ��}�X�^�v����h�`�[�Ǘ��O���[�v�h���擾����
						List listSysArCtrl = entity.mreadSysArCtrl.read(conn,st);
						if(listSysArCtrl == null || listSysArCtrl.size() == 0){
							// ���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
							ok_flg = false;
							ExpjMessage emsg = new ExpjMessage( "KI00006");
							msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
							sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
							break;
						} else {
							//�`�[�Ǘ��O���[�v
							st.setstrSLIP_CTRL_GRP(((KU0030010Struct)listSysArCtrl.get(0)).getstrSLIP_CTRL_GRP());
							st.setstrSLIP_CD(st.getg_SLIP_CD());
							//���|�������w�b�_�e�[�u���̓Ǎ�
							List listT_AR_LEDGER_H = entity.mreadT_AR_LEDGER_H.read(conn,st);
							if(listT_AR_LEDGER_H == null || listT_AR_LEDGER_H.size() == 0){
								//���|���g�����w�b�_�e�[�u���̓Ǎ�
								List listT_AR_LEDGER_H_TRN = entity.mreadT_AR_LEDGER_H_TRN.read(conn,st);
								if(listT_AR_LEDGER_H_TRN == null || listT_AR_LEDGER_H_TRN.size() == 0){
									// ���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
									ok_flg = false;
									ExpjMessage emsg = new ExpjMessage( "KU02003");
									msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
									sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
									break;
								} else {
									// �u���|���g�����w�b�_�v�́h��ԋ敪�h���擾����
									tmpSTATUS = ((KU0030010Struct)listT_AR_LEDGER_H_TRN.get(0)).getstrSTATUS();
								}
								listT_AR_LEDGER_H_TRN = null;
							} else {
								// �u���|�������w�b�_�v�́h��ԋ敪�h���擾����
								tmpSTATUS = ((KU0030010Struct)listT_AR_LEDGER_H.get(0)).getstrSTATUS();
							}
							listT_AR_LEDGER_H = null;
						}
						listSysArCtrl = null;

					} else {
						// �u���|�Ǘ��v�T�u�V�X�e�����C���X�g�[������Ă��Ȃ��ꍇ
						// �u������сv�́h��ԋ敪�h���擾����
						tmpSTATUS = ((KU0030010Struct)listT_SHIP.get(0)).getserTori_STATUS();
					}

					// =======================================
					// ��ԋ敪�A�����敪������E�ԕi�۔���
					// =======================================
					int rv = isToriHanEnable(tmpSTATUS, ((KU0030010Struct)listT_SHIP.get(0)).getserTori_INSPC_ACPT_TYP());
					if (rv == 1) {
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KU02001");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
						break;
					}
					if (rv == 2) {
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KU02002");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
						break;
					}
					if (rv == 3) {
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "BD00027");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
						break;
					}

					// =======================================
					// �o�׎��т̐ԃ��R�[�h�쐬
					// =======================================

					//�ԃf�[�^�쐬
					String strShipQty = ((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_QTY();//�o�׎��ѐ���
					String strShipOdrAmount=((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_AMOUNT();//���z
					String strShipOdrAmountExchRates=((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_AMOUNT_EXCH_RATES();//���z(�M��)

					//�`�[�ԍ����̔Ԃ���
					String[] strSLIP_CD = getSlipCd(st, ((KU0030010Struct)listT_SHIP.get(0)).getserTori_SLIP_CD());

					//�o�׎��т̌����R�[�h�_���폜
					st.setupdTship_SHIP_SEQ_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_SEQ_NO());
					rv = entity.mtbl_T_SHIP.update(conn, st);

		            // Add Start 20140311 ma-jf
					//���� [SEQ_SALES_SEQ_NO] ���擾
					List listgetT_SHIP_SEQ_NO = entity.mget_T_SHIP_SEQ_NO.read(conn, st);
					String strNewShipSeqNo = ((KU0030010Struct)listgetT_SHIP_SEQ_NO.get(0)).getgetTship_SHIP_SEQ_NO(); //�o�׎��ъǗ��ԍ�
					st.setcreTship_SHIP_SEQ_NO(strNewShipSeqNo); //�o�׎��ъǗ��ԍ�
		            // Add End 20140311 ma-jf
					st.setcreTship_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO());	//�o�׎w���ԍ�
					st.setcreTship_SLIP_CD(strSLIP_CD[0]);									//�`�[�ԍ�(�ԓ`)
					st.setcreTship_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ODR_NO());		//�󒍔ԍ�
					st.setcreTship_PART_DLV_SEQ_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_PART_DLV_SEQ_NO());//���[����
					st.setcreTship_ORGNAL_SLIP_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SLIP_CD());	//���`�[�Ǘ��ԍ�(�ݒ薳��)
					st.setcreTship_SLIP_TRN_CD("3");								//�`�[�敪(3�F���)
					st.setcreTship_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ITEM_CD());		//�i��
					st.setcreTship_JOB_ODR_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_JOB_ODR_CD());		//����
					st.setcreTship_CUST_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_ITEM_CD());	//�ڋq�i��
					st.setcreTship_CUST_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_ODR_NO());	//�ڋq�����ԍ�
					st.setcreTship_CUST_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_CD());		//�ڋq�R�[�h
					st.setcreTship_CUST_NAME(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_NAME());		//�ڋq����
					st.setcreTship_CUST_CHRG_PSN_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CUST_CHRG_PSN_CD());//�c�ƒS���҃R�[�h
					st.setcreTship_SHIP_ODR_ISS_PSN_CD(struct.getstrUSER_CD());					//���s�S���҃R�[�h
					st.setcreTship_DLV_LOC_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DLV_LOC_CD());	//�[�i�ꏊ�R�[�h
					st.setcreTship_DEPO_TYP(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DEPO_TYP());		//�a���q�ɋ敪
					st.setcreTship_ALLCT_WH_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ALLCT_WH_CD());	//�����ۊǋ�
					st.setcreTship_DEPO_WH_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DEPO_WH_CD());	//���o�a���ۊǋ�
					st.setcreTship_LOC_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_LOC_CD());		//���P�[�V�����ԍ�
					st.setcreTship_SHIP_DATE(st.getg_DATE());							//�o�׎��ѓ�(���.�v���)
					st.setcreTship_SHIP_QTY(Double.toString(Double.parseDouble(chkNulltoZero(strShipQty)) * (-1)));							//�o�׎��ѐ���(�Ԑ���)
					st.setcreTship_UNIT_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_UNIT_CD());		//�P��
					st.setcreTship_SHIP_UNIT_PRICE(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_UNIT_PRICE());//���(�P��)
					st.setcreTship_CURRNCY_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_CURRNCY_CD());	//�ʉ݃R�[�h
					st.setcreTship_SHIP_ODR_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmount)) * (-1)));						//�o�׎��ы��z

					st.setcreTship_SHIP_ODR_AMOUNT_EXCH_RATES(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmountExchRates)) * (-1)));		//�o�׎��ы��z(�M��)

					st.setcreTship_DIRECT_DLV_FLG(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DIRECT_DLV_FLG());//�����t���O
					st.setcreTship_DLV_KEY_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DLV_KEY_NO());//�[�i�L�[�ԍ�
					st.setcreTship_REMARKS(st.getg_REMARKS());//���l
					st.setcreTship_DEL_FLG("1");//�폜�t���O('1'�ݒ�)

					//�o�׎��у��R�[�h�쐬
					rv = entity.mtbl_T_SHIP.create(conn, st);

					// =======================================
					// ������т̐ԃ��R�[�h�쐬
					// =======================================

					// ������т��猳���R�[�h�擾
					st.setserTsales_IN_SLIPCD(st.getg_SLIP_CD());//�L�[�ݒ�(�`�[�ԍ�)
					List listT_SALES = entity.mtbl_T_SALES.read(conn, st);
					if(listT_SALES == null || listT_SALES.size() == 0){continue;}

					
					//�V�X�e���p�����[�^("APR_SALES")�`�F�b�N
					chkAprSales(st);
					//������т̌����R�[�h�_���폜
					st.setupdTsales_SALES_SEQ_NO(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_SEQ_NO());
					rv = entity.mtbl_T_SALES.update(conn, st);

					strShipQty = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_QTY();//������ѐ���
					strShipOdrAmount=((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_AMOUNT();//������z
					strShipOdrAmountExchRates=((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_AMOUNT_EXCH_RATES();//������z(�M��)

					st.setcreTsales_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO());//�o�׎w���ԍ�
					st.setcreTsales_SLIP_CD(strSLIP_CD[0]);//�`�[�ԍ�(��L�ɓo�^�����ԍ�)
					st.setcreTsales_CUST_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_CUST_CD());	//�ڋq�R�[�h
					st.setcreTsales_ITEM_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_ITEM_CD());	//�i��

					st.setcreTsales_ITEM_NAME(((KU0030010Struct)listT_SALES.get(0)).getserTsales_ITEM_NAME());//�i��
					st.setcreTsales_CUST_ODR_NO(((KU0030010Struct)listT_SALES.get(0)).getserTsales_CUST_ODR_NO());//�ڋq�����ԍ�
					st.setcreTsales_SALES_DATE(st.getg_DATE());					//����v���
					st.setcreTsales_SALES_DEPT_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_DEPT_CD());//����v�㕔��
					st.setcreTsales_CUST_CHRG_PSN_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_CUST_CHRG_PSN_CD());//�c�ƒS���҃R�[�h
					st.setcreTsales_ODR_ACPT_PSN_CD(struct.getstrUSER_CD());				//���s�S���҃R�[�h
					st.setcreTsales_SALES_QTY(Double.toString(Double.parseDouble(chkNulltoZero(strShipQty)) * (-1)));						//������ѐ���
					st.setcreTsales_SALES_UNIT_PRICE(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_UNIT_PRICE());//�P��
					st.setcreTsales_UNIT_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_UNIT_CD());	//�P��
					st.setcreTsales_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmount)) * (-1)));					//������ы��z

					st.setcreTsales_SALES_AMOUNT_EXCH_RATES(Double.toString(Double.parseDouble(chkNulltoZero(strShipOdrAmountExchRates)) * (-1)));		//������ы��z(�M��)
					st.setcreTsales_INSPC_ACPT_DATE(null);			//��̌�����
					st.setcreTsales_INSPC_ACPT_QTY(null);			//��̌�����
					st.setcreTsales_ORG_SLIP_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_ORG_SLIP_CD());//���`�[�ԍ�
					st.setcreTsales_CURRNCY_CD(((KU0030010Struct)listT_SALES.get(0)).getserTsales_CURRNCY_CD());//�ʉ݃R�[�h
					st.setcreTsales_SPCL_PRICE_CO(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SPCL_PRICE_CO());//���l�敪
					st.setcreTsales_REMARKS(st.getg_REMARKS());	//���l
					st.setcreTsales_DEL_FLG("1");								//�폜�e
					st.setcreTsales_SALES_TYP(((KU0030010Struct)listT_SALES.get(0)).getserTsales_SALES_TYP());	//����敪
					st.setcreTsales_STATUS(((KU0030010Struct)listT_SALES.get(0)).getserTsales_STATUS());	//��ԋ敪
					st.setcreTsales_INSPC_ACPT_TYP(((KU0030010Struct)listT_SALES.get(0)).getserTsales_INSPC_ACPT_TYP());	//�����敪
					st.setcreTsales_EXCH_RATE(((KU0030010Struct)listT_SALES.get(0)).getserTsales_EXCH_RATE());	//�בփ��[�g
					String tmpTax;
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_TAX_AMOUNT_1();
					st.setcreTsales_TAX_AMOUNT_1(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// �Ŋz�P
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_TAX_AMOUNT_2();
					st.setcreTsales_TAX_AMOUNT_2(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// �Ŋz�Q
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_TAX_AMOUNT_3();
					st.setcreTsales_TAX_AMOUNT_3(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// �Ŋz�R
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_EXTERNAL_TAX_SALES_AMOUNT();
					st.setcreTsales_EXTERNAL_TAX_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));	// �O�őΏۋ��z
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_INTERNAL_TAX_SALES_AMOUNT();
					st.setcreTsales_INTERNAL_TAX_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));	// ���őΏۋ��z
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_TAXFREE_SALES_AMOUNT();
					st.setcreTsales_TAXFREE_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));;		// ��ېőΏۋ��z
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_EXTERNAL_TAX_AMOUNT();
					st.setcreTsales_EXTERNAL_TAX_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// ����Ŋz�i�O�Łj
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_INTERNAL_TAX_AMOUNT();
					st.setcreTsales_INTERNAL_TAX_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// ����Ŋz�i���Łj
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_TAX_CREDIT_SALES_AMOUNT();
					st.setcreTsales_TAX_CREDIT_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));		// �Ŕ�������z
					tmpTax = ((KU0030010Struct)listT_SALES.get(0)).getserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT();
					st.setcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(Double.toString(Double.parseDouble(chkNulltoZero(tmpTax)) * (-1)));// �Ŕ�������z�i�M�݁j
					//������у��R�[�h�쐬
					rv = entity.mtbl_T_SALES.create(conn, st);

		            // Add Start 20140311 ma-jf
					//[�i��].�g���b�g�Ǘ��t���O�h�� 0�F���b�g�Ǘ����s��Ȃ��̏ꍇ
					if ("0".equals(strLotCtrlFlg)) {
		            // Add End 20140311 ma-jf
						
						// =======================================
						// �ۊǋ�ʍ݌ɂ̃��R�[�h�X�V
						// =======================================
	
						String strDepoTyp = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DEPO_TYP());
						String strWhCd = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ALLCT_WH_CD());
						String strItemCd = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ITEM_CD());
						String strJobOdrCd = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_JOB_ODR_CD());
	
						if(!strDepoTyp.equals(this.m_DEPO_TYP)){
							// �a���̏ꍇ
							strWhCd = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_DEPO_WH_CD());
						}
						st.setserTitemStock_IN_ITEMCD(strItemCd);
						st.setserTitemStock_IN_WHCD(strWhCd);
						st.setserTitemStock_IN_JOBODRCD(strJobOdrCd);
	
						String strStockOnHandQty = "0";
	
						List listT_ITEM_STOCK = null;
	
						if(st.getserTitemStock_IN_JOBODRCD().equals("")){
							//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�̓Ǎ�
							listT_ITEM_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn,st);
						} else {
							//�ۊǋ�ʐ��ԍ݌Ƀ��R�[�h�̓Ǎ�
							listT_ITEM_STOCK = entity.mtbl_T_JOB_ODR_CD_STOCK.read(conn,st);
						}
						
						// �莝���݌ɐ��擾
						if(listT_ITEM_STOCK != null){
							strStockOnHandQty =	this.replaceNull(((KU0030010Struct)listT_ITEM_STOCK.get(0)).getserTitemStock_STOCK_ON_HAND_QTY());
						}
	
						st.setupTitemStock_STOCK_ON_HAND_QTY(Double.parseDouble(chkNulltoZero(strStockOnHandQty))+Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2()))+"");
						st.setupTitemStock_IN_ITEMCD(strItemCd);
						st.setupTitemStock_IN_WHCD(strWhCd);
						st.setupTitemStock_IN_JOBODRCD(strJobOdrCd);
	
						if(st.getupTitemStock_IN_JOBODRCD().equals("")){
							//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�̍X�V
							rv = entity.mtbl_T_ITEM_STOCK.update(conn, st);
						} else {
							//�ۊǋ�ʐ��ԍ݌Ƀ��R�[�h�̍X�V
							rv = entity.mtbl_T_JOB_ODR_CD_STOCK.update(conn, st);
						}
	
						// =======================================
						// �ۊǋ�ʓ��o�ɂ̃��R�[�h�쐬
						// =======================================
	
						// �R�l�N�V������n���āA�̔Ԃ̏���
						ISSUE_CD = new Numbering(conn,Numbering.ISSUE_CD,st.getsUser_ID(),"KU0030010",st.getstrPLANT_CD());
						st.setcreTrcvIssue_RCV_ISSUE_CTRL_CD(ISSUE_CD.getNo());
						st.setcreTrcvIssue_RCV_ISSUE_TYP("1"); //���o�ɋ敪(1:����)
						st.setcreTrcvIssue_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ITEM_CD());//�i��
						st.setcreTrcvIssue_JOB_ODR_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_JOB_ODR_CD());//����
						
						//st.setcreTrcvIssue_PLANT_CD(st.getstrPLANT_CD());//�H��R�[�h
						//�ۊǋ�̍H��R�[�h���擾
						st.setmWh_IN_WH_CD(strWhCd);
						st.setcreTrcvIssue_PLANT_CD(getPlantCd(st));	//�H��R�[�h
						
						st.setcreTrcvIssue_WH_CD(strWhCd);//�ۊǋ�R�[�h
						st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(strStockOnHandQty);//���o�ɑO�݌ɐ�
						st.setcreTrcvIssue_RCV_ISSUE_QTY(st.getg_SHIP_QTY2());//���o�ɐ�
						st.setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(Calculate.add(st.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(),st.getcreTrcvIssue_RCV_ISSUE_QTY()));//���o�Ɍ�݌ɐ�					
						st.setcreTrcvIssue_RCV_ISSUE_AMOUNT("0");//���o�ɋ��z
						st.setcreTrcvIssue_RCV_ISSUE_DATE(st.getg_DATE());//���o�ɔN����
						st.setcreTrcvIssue_RCV_ISSUE_COMMENT(st.getg_REMARKS());//���o�ɔ��l
						st.setcreTrcvIssue_RCV_ISSUE_GNR_TYP("39");	//���o�ɔ����敪
						st.setcreTrcvIssue_STOCK_UPD_TYP("2");		//�݌ɍX�V�敪
						st.setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG("1");//���o�Ɋ����t���O
	
						//�ۊǋ�ʓ��o�ɂ̃��R�[�h�쐬
						rv = entity.mtbl_T_RCV_ISSUE.create(conn, st);

			        // Add Start 20140311 ma-jf
					} else {
						//[�i��].�g���b�g�Ǘ��t���O�h�� 1�F���b�g�Ǘ����s���̏ꍇ
						String strItemCd = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ITEM_CD()); //�i�ڔԍ�
						String strWhCd = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ALLCT_WH_CD()); //�ۊǋ�R�[�h
						String strShipSeqNo = this.replaceNull(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_SEQ_NO()); //�o�׎��ъǗ��ԍ�
						
						st.setreadTshipInst_IN_SHIP_SEQ_NO(strShipSeqNo);
						st.setreadTshipInst_IN_LOT_NO(null);
						List listT_SHIP_INST = entity.mread_T_SHIP_INST.read(conn, st);
						if (listT_SHIP_INST != null && listT_SHIP_INST.size() > 0) {
							for (int j=0; j<listT_SHIP_INST.size(); j++) {
								KU0030010Struct inst = (KU0030010Struct)listT_SHIP_INST.get(j);
								String strLotShipQty = chkNulltoZero(inst.getreadTshipInst_SHIP_QTY()); //���b�g�ʏo�׎��ѐ���
								
								// =======================================
								// �ۊǋ�ʍ݌ɂ̃��R�[�h�X�V
								// =======================================
								st.setserTitemStock_IN_ITEMCD(strItemCd);
								st.setserTitemStock_IN_WHCD(strWhCd);
								List listT_ITEM_STOCK = entity.mtbl_T_ITEM_STOCK.read(conn,st);
								if (listT_ITEM_STOCK != null && listT_ITEM_STOCK.size() == 1) {

									st.setupTitemStock_IN_ITEMCD(strItemCd);
									st.setupTitemStock_IN_WHCD(strWhCd);
									//�莝�݌ɐ�
									String strItemStockOnHandQty = this.chkNulltoZero(((KU0030010Struct)listT_ITEM_STOCK.get(0)).getserTitemStock_STOCK_ON_HAND_QTY());
									//�i�ڕʎ莝�݌�=�i�ڕʎ莝�݌�(�O)+���.���ѐ���
									st.setupTitemStock_STOCK_ON_HAND_QTY(Calculate.add(strItemStockOnHandQty, strLotShipQty));
									
									//�ۊǋ�ʕi�ڍ݌Ƀ��R�[�h�X�V
									rv = entity.mtbl_T_ITEM_STOCK.update(conn, st);
								}
								listT_ITEM_STOCK.clear();
								
								// =======================================
								// ���b�g�ʎ莝�݌Ƀ��R�[�h�̍X�V
								// =======================================
								String strLotStockOnHandQty = "0"; // ���b�g�ʎ莝�݌�
								
								st.setserLotIN_ITEM_CD(strItemCd);
								st.setserLotIN_WH_CD(strWhCd);
								st.setserLotIN_LOT_NO(inst.getreadTshipInst_LOT_NO());
								List listT_LOT_STOCK = entity.mtbl_T_LOT_STOCK.read(conn, st);
								if (listT_LOT_STOCK != null && listT_LOT_STOCK.size() > 0) {
									st.setupTlotStockIN_ITEM_CD(strItemCd);
									st.setupTlotStockIN_WH_CD(strWhCd);
									st.setupTlotStockIN_LOT_NO(inst.getreadTshipInst_LOT_NO());
									//�莝�݌ɐ�
									strLotStockOnHandQty = this.chkNulltoZero(((KU0030010Struct)listT_LOT_STOCK.get(0)).getserLotSTOCK_ON_HAND_QTY());
									//���b�g�ʎ莝�݌�=���b�g�ʎ莝�݌�(�O)+���.���ѐ���
									st.setupTlotStockSTOCK_ON_HAND_QTY(Calculate.add(strLotStockOnHandQty, strLotShipQty));
									
									//���b�g�ʎ莝�݌Ƀ��R�[�h�X�V
									rv = entity.mtbl_T_LOT_STOCK.update(conn, st);
								}
								listT_LOT_STOCK.clear();
								
								// =======================================
								// �ۊǋ�ʓ��o�ɂ̃��R�[�h�쐬
								// =======================================
			
								// �R�l�N�V������n���āA�̔Ԃ̏���
								ISSUE_CD = new Numbering(conn,Numbering.ISSUE_CD,st.getsUser_ID(),"KU0030010",st.getstrPLANT_CD());
								st.setcreTrcvIssue_RCV_ISSUE_CTRL_CD(ISSUE_CD.getNo());
								st.setcreTrcvIssue_RCV_ISSUE_TYP("1"); //���o�ɋ敪(1:����)
								st.setcreTrcvIssue_ITEM_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ITEM_CD());//�i��
								st.setcreTrcvIssue_JOB_ODR_CD("");//����
								
								//�ۊǋ�̍H��R�[�h���擾
								st.setmWh_IN_WH_CD(strWhCd);
								st.setcreTrcvIssue_PLANT_CD(getPlantCd(st));	//�H��R�[�h
								
								st.setcreTrcvIssue_WH_CD(strWhCd);//�ۊǋ�R�[�h
								st.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(strLotStockOnHandQty);//���o�ɑO�݌ɐ�
								st.setcreTrcvIssue_RCV_ISSUE_QTY(strLotShipQty);//���o�ɐ�
								st.setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(Calculate.add(st.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(),st.getcreTrcvIssue_RCV_ISSUE_QTY()));//���o�Ɍ�݌ɐ�					
								st.setcreTrcvIssue_RCV_ISSUE_AMOUNT("0");//���o�ɋ��z
								st.setcreTrcvIssue_RCV_ISSUE_DATE(st.getg_DATE());//���o�ɔN����
								st.setcreTrcvIssue_RCV_ISSUE_COMMENT(st.getg_REMARKS());//���o�ɔ��l
								st.setcreTrcvIssue_RCV_ISSUE_GNR_TYP("39");	//���o�ɔ����敪
								st.setcreTrcvIssue_STOCK_UPD_TYP("2");		//�݌ɍX�V�敪
								st.setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG("1");//���o�Ɋ����t���O
								st.setcreTrcvIssue_LOT_NO(inst.getreadTshipInst_LOT_NO()); //�݌Ƀ��b�g�ԍ�
								// Add Start 20140401 zhang-zl
								st.setcreTrcvIssue_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO()); //�o�׎w���ԍ�
								// Add End 20140401 zhang-zl
			
								//�ۊǋ�ʓ��o�ɂ̃��R�[�h�쐬
								rv = entity.mtbl_T_RCV_ISSUE.create(conn, st);
								
								// =======================================
								// ���b�g�g���[�X�̃��R�[�h�쐬
								// =======================================
								st.settlotTrace_FROM_ITEM_CD(strItemCd); //���i�ڔԍ�
								st.settlotTrace_FROM_LOT_NO(inst.getreadTshipInst_LOT_NO()); //�����b�g�ԍ�
								st.settlotTrace_TO_ITEM_CD(strItemCd); //��i�ڔԍ�
								st.settlotTrace_TO_LOT_NO(inst.getreadTshipInst_LOT_NO()); //�惍�b�g�ԍ�
								st.settlotTrace_LOT_TRACE_TYP("5"); //���b�g�g���[�X�敪=5�F�o�׎���
								if (entity.mtbl_T_LOT_TRACE.check(conn, st)) {
									rv = entity.mtbl_T_LOT_TRACE.update(conn, st);
								}
								
								// =======================================
								// ���o�׎��і��ׂ̍폜
								// =======================================
								st.setdelTshipInstIN_SHIP_SEQ_NO(strShipSeqNo); // �o�׎��ъǗ��ԍ�
								st.setdelTshipInstIN_LOT_NO(null); // �݌Ƀ��b�g�ԍ�
								rv = entity.mtbl_T_SHIP_INST.delete(conn, st);
							}
						}
					}
		            // Add End 20140311 ma-jf
					
					// =======================================
					// �󒍖��ׂ̍X�V
					// =======================================
					//�󒍖��ׂ�����擾
					st.settOdr_IN_ODRNO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ODR_NO());//�󒍔ԍ�
					String strODRTotalShipQty ="0";		//�o�׎��ї݌v��
					String strODRShipAmount = "0";		//�o�׎��ы��z
					String strODRShipAmountExchRates = "0";//�o�׎��ы��z(�M��)
					String strPartDlvCount = "";
					String strShipCnt = "";
					String strIfCtrNo = "";
					List listT_ODR = entity.mtbl_T_ODR.read(conn, st);
					if(listT_ODR == null || listT_ODR.size() != 1){//�G���[
					}else{
						strODRTotalShipQty = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_TOTAL_SHIP_QTY());//�o�׎��ї݌v��
						strODRShipAmount = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_SHIP_AMOUNT());//�o�׎��ы��z
						strODRShipAmountExchRates = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_SHIP_AMOUNT_EXCH_RATES());//�o�׎��ы��z(�M��)
						strIfCtrNo = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_IF_CTL_NO());		//IF�Ǘ��ԍ�
						strPartDlvCount = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_PART_DLV_COUNT());//���[��
						strShipCnt = this.replaceNull(((KU0030010Struct)listT_ODR.get(0)).gettOdr_SHIP_CNT());	//�o�׉�
					}

					strODRTotalShipQty = Double.parseDouble(chkNulltoZero(strODRTotalShipQty))-Double.parseDouble(chkNulltoZero(this.replaceNull(st.getg_SHIP_QTY2())))+""; //�׎��ї݌v��
					strODRShipAmount = Double.parseDouble(chkNulltoZero(strODRShipAmount))-Double.parseDouble(chkNulltoZero(this.replaceNull(strShipOdrAmount)))+"";//�o�׎��ы��z
					strODRShipAmountExchRates =(Double.parseDouble(chkNulltoZero(strODRShipAmountExchRates))-Double.parseDouble(chkNulltoZero(this.replaceNull(strShipOdrAmountExchRates))))+"";//�o�׎��ы��z(�M��)

					st.setupTodr_IN_ODRNO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ODR_NO());//�󒍔ԍ�
					st.setupTodr_TOTAL_SHIP_QTY(strODRTotalShipQty);//�o�׎��ї݌v��
					st.setupTodr_SHIP_AMOUNT(strODRShipAmount);//�o�׎��ы��z
								st.setupTodr_SHIP_AMOUNT_EXCH_RATES(strODRShipAmountExchRates);//�o�׎��ы��z(�M��)
					st.setupTodr_ODR_CMPLT_FLG("0");
					st.setupTodr_ODR_CMPLT_DATE(null);

					//�󒍖��׃��R�[�h�X�V
					rv = entity.mtbl_T_ODR.update(conn, st);

					// =======================================
					// �o�׎w���̍X�V
					// =======================================
					//�o�׎��ї݌v�����擾����
					String strRUIKEI_SU = "";
					st.setreadShipOdr_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO());//�o�׎w���ԍ�
					List listSHIP_ODR = entity.mreadT_SHIP_ODR.read(conn, st);
					if(listSHIP_ODR == null || listSHIP_ODR.size() != 1){
						//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
						ok_flg = false;
						ExpjMessage emsg = new ExpjMessage( "KU00026");
						msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
						sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e

					}else{
						strRUIKEI_SU =	(((KU0030010Struct)listSHIP_ODR.get(0)).getreadShipOdr_TOTAL_SHIP_QTY());
						strShipQty = ((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_QTY();
					}
					strRUIKEI_SU = (Double.parseDouble(chkNulltoZero(strRUIKEI_SU))-Double.parseDouble(chkNulltoZero(strShipQty)))+""; //�׎��ї݌v��(�݌v��-�o�׎���.�o�׎��ѐ���)

					st.setupTshipOdr_SLIP_CD(strSLIP_CD[1]);		//�`�[�ԍ�(���`)
					st.setupTshipOdr_ORG_SLIP_CD(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SLIP_CD());		//���`�[�ԍ�
					st.setupTshipOdr_TOTAL_SHIP_QTY(strRUIKEI_SU);//�o�׎��ї݌v��
					st.setupTshipOdr_SHP_CMPLT_FLG("0");

					//�o�׎w�����R�[�h�̍X�V
					st.setupTshipOdr_SHIP_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_SHIP_ODR_NO());//�o�׎w���ԍ�
					rv = entity.mtbl_T_SHIP_ODR2.update(conn, st);
					
					// =======================================
					// �o�ד`�[�̍X�V
					// =======================================
					st.setup_tShipSlip_SLIP_CD(st.getupTshipOdr_SLIP_CD());//�o�׎w���̓`�[�ԍ�(���`)���o�ד`�[�ɃZ�b�g
					st.setin_tShipSlip_SLIP_CD(st.getupTshipOdr_ORG_SLIP_CD());//�o�׎w���̌��`�[�ԍ������������̓`�[�ԍ��ɃZ�b�g
					//�o�ד`�[�̃��R�[�h�X�V
					rv = entity.mtbl_T_SHIP_SLIP.update(conn, st);
					

						// =======================================
						// ���v�ʂ̃��R�[�h�X�V
						// =======================================

						st.setinTod_ODR_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_ODR_NO());	// �󒍔ԍ�
						st.setinTod_PART_DLV_SEQ_NO(((KU0030010Struct)listT_SHIP.get(0)).getserTori_PART_DLV_SEQ_NO()); // ���[����
						List listT_OD = entity.mtbl_T_OD.read(conn,st);
						if(listT_OD == null || listT_OD.size() != 1){
						}else{
							double totalIssueQty = Double.parseDouble(chkNulltoZero(((KU0030010Struct)listT_OD.get(0)).getstrTod_TOTAL_ISSUE_QTY()));	// �o�ɗ݌v��
							totalIssueQty = totalIssueQty - Double.parseDouble(chkNulltoZero(st.getg_SHIP_QTY2()));
							String tmpOdNo = ((KU0030010Struct)listT_OD.get(0)).getstrTod_OD_NO();						// �I�[�_�f�}���h�ԍ�
							st.setinTod_OD_NO(tmpOdNo);
							st.setstrTod_DM_STS_TYP("2");// �f�}���h��ԋ敪
							st.setstrTod_TOTAL_ISSUE_QTY(String.valueOf(totalIssueQty));
							rv = entity.mtbl_T_OD.update(conn, st);
						}
						listT_OD.clear();
					listSHIP_ODR.clear();

						// =======================================
						// ���|�Ǘ��T�^�e(���i)�̌ďo
						// =======================================
					if (entity.mchkSysInstallOptions.check(conn,st)) {
						
                        ArIf arIf = new ArIf(conn);
                        arIf.setParameter("2", struct.getsUser_ID(),
                                          st.getg_SLIP_CD(), strSLIP_CD[0], null);
                        String msgNo = arIf.execute();
                        if (!"0".equals(msgNo)) {
                            ok_flg = false;
                            ExpjMessage emsg = new ExpjMessage(msgNo);
                            msgStruct.addError(emsg);  // �G���[���b�Z�[�W�Ƃ��ēo�^
                            sysLog.warning(emsg, struct.getsUser_ID());  //�G���[���e
                        }
					}
                    struct.setg_SLIP_CD(strSLIP_CD[1]);	// ��ʓ`�[�ԍ�
				}
			}

			if(ok_flg == true){

				//����o�^������ɏI������ꍇ
				ExpjMessage emsg = new ExpjMessage( "KU00102");
				sysLog.severe(emsg, struct.getsUser_ID());
				msgStruct.addInfo( emsg );

				// �������ʃt���O��NG�ɐݒ�
				struct.seth_RESULT("NG");
				
				this.conn.commit();
			}else{
				this.conn.rollback();
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

		} catch(ResourceBusyException e){
			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01105" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			emsg = new ExpjMessage( "ZZ01105", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			throw ee;
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		} finally {
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
				}
			}
		}

                //}}user_implement_dev:<controltorikeshi>
		logger.exiting("KU0030010Control"+":USER="+struct.getsUser_ID(),"controltorikeshi");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
			controlRELOAD();
			struct.seth_RESULT("NG");
			struct.seth_SELECT_FG("NG");

			// ���[�h�ݒ�
			_mode = _NORMAL;

			//���W�I�{�^�����[�h�ݒ�
			struct.setk_MODE(struct.getk_MODE());

		}catch(Exception e){
			e.printStackTrace();

			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		}
                //}}user_implement_dev:<controlclear>
		logger.exiting("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
		try{
			controlRELOAD();
			struct.seth_RESULT("NG");

			// ���[�h�ݒ�
			_mode = _CLOSE;
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		}
                //}}user_implement_dev:<controlclose>
		logger.exiting("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
            KU0030010Struct st = (KU0030010Struct)list.get(0);

            // =======================================
            // ���N�G�X�g��Struct�Ɋi�[
            // =======================================
            st.setg_SLIP_CD((String)struct.getList_g_SLIP_CD().get(0));	//�`�[�ԍ�
            st.setg_SHIP_QTY2((String)struct.getList_g_SHIP_QTY2().get(0));	//���ѐ���
            st.seth_SHIP_QTY((String)struct.getList_h_SHIP_QTY().get(0));
            st.setg_UNIT_PRICE((String)struct.getList_g_UNIT_PRICE().get(0));//�P��
            st.setg_WH_CD((String)struct.getList_g_WH_CD().get(0));		//�q��
            st.setg_REMARKS((String)struct.getList_g_REMARKS().get(0));	//���l
            st.seth_GYOMU_DATE(st.geth_GYOMU_DATE());			//�Ɩ����t
            st.setg_DATE((String)struct.getList_g_DATE().get(0));
            st.setg_SALES_DEPT_CD((String)struct.getList_g_SALES_DEPT_CD().get(0));

            // �P���f�[�^�Ǎ�
            st.setmUnitCost_IN_COMPANYCD(st.getstrCOMPANY_CD());
            st.setmUnitCost_IN_CUSTCD(st.getg_CUST_CD());
            st.setmUnitCost_IN_ITEMCD(st.getg_ITEM_CD());
            st.setmUnitCost_IN_EFFPHASEINDATE(st.getg_DATE());

            List listM_UNIT_COST = entity.mtblM_UNIT_COST.read(conn, st);
            // �P���f�[�^��0���̏ꍇ
            if (listM_UNIT_COST.isEmpty()) {
                listM_UNIT_COST.clear();
                ExpjMessage emsg = new ExpjMessage( "KU00067");
                msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
                sysLog.warning(emsg, struct.getsUser_ID()); //�G���[���e
                return;
            }

            KU0030010Struct unitCostStruct = (KU0030010Struct)listM_UNIT_COST.get(0);
            String strUnitCost = unitCostStruct.getmUnitCost_UNIT_COST();
            st.setg_UNIT_PRICE(strUnitCost);
            st.seth_UNIT_PRICE(strUnitCost);

            st.setg_SHIP_ODR_AMOUNT(
                Calculate.multiply(strUnitCost, st.getg_SHIP_QTY2()));

        } catch (SQLException e) {
            throw new ExpjException(e);
        }
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		//---------------------------------------------------------------------
		try{
			struct.init();
			struct.seth_RESULT("NG");
			struct.seth_SELECT_FG("NG");

			// ���[�h�ݒ�
			_mode = _NORMAL;

			// =======================================
			// ���Џ��̎擾
			// =======================================
			List listCompanyInfo = entity.mgetCompanyInfo.read(conn,struct);
			if(listCompanyInfo == null || listCompanyInfo.size() != 1){
				//���Џ�񂪖���/������
				ExpjMessage emsg = new ExpjMessage("KQ00039");
                msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
                sysLog.severe(emsg, getsysUSER_CD()); //�G���[���e
                ExpjException ee = new ExpjException(emsg);
                throw ee;

			}else{
				struct.setstrCOMPANY_CD(((KU0030010Struct)listCompanyInfo.get(0)).getstrCOMPANY_CD());
			}
			listCompanyInfo = null;

			// =======================================
			// �Ɩ����t�̎擾
			// =======================================
			List listGyomuDate = entity.mgetGyomuDate.read(conn,struct);
			if(listGyomuDate == null || listGyomuDate.size() != 1){
				//�Ɩ����t��񂪖���/������

				ExpjMessage emsg = new ExpjMessage("KQ00026");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}else{
				struct.setstrBUSINESS_OPR_DATE(((KU0030010Struct)listGyomuDate.get(0)).getstrBUSINESS_OPR_DATE());
				//�o�׎���(����)�v����ݒ�
				struct.seth_GYOMU_DATE(((KU0030010Struct)listGyomuDate.get(0)).getstrBUSINESS_OPR_DATE());
				struct.setstrPLANT_CD(((KU0030010Struct)listGyomuDate.get(0)).getstrPLANT_CD());
			}
			listGyomuDate = null;

			// =======================================
			// ���p�ҏ��̎擾
			// =======================================
			struct.setstrUSER_CD(struct.getsUser_ID());
			List listUserInfo = entity.mgetUserInfo.read(conn,struct);
			if(listUserInfo == null || listUserInfo.size() != 1){
				//���[�U��񂪖���/������
				ExpjMessage emsg = new ExpjMessage("KQ00025");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;

			}else{
				struct.setstrUSER_NAME(((KU0030010Struct)listUserInfo.get(0)).getstrUSER_NAME());
				struct.setstrSECTION_CD(((KU0030010Struct)listUserInfo.get(0)).getstrSECTION_CD());
				struct.setstrORG_CD(((KU0030010Struct)listUserInfo.get(0)).getstrORG_CD());
				struct.setstrORG_NAME(((KU0030010Struct)listUserInfo.get(0)).getstrORG_NAME());
				struct.setstrORG_ANAME(((KU0030010Struct)listUserInfo.get(0)).getstrORG_ANAME());
				struct.setstrPLANT_NAME(((KU0030010Struct)listUserInfo.get(0)).getstrPLANT_NAME());
				struct.setstrPLANT_ANAME(((KU0030010Struct)listUserInfo.get(0)).getstrPLANT_ANAME());
				struct.setstrCAL_NO(((KU0030010Struct)listUserInfo.get(0)).getstrCAL_NO());

			}
			listUserInfo = null;

			// =======================================
			// ���{�~�ʉ݃R�[�h�擾
			// =======================================
			struct.setgetHomeCur_CTRL_CD(JPCUR_CTRL_CD);
			List listCurrency = entity.mgetSYS_PARAMETER.read(conn,struct);
			if(listCurrency == null || listCurrency.size() != 1){
				//���{�~�ʉ݃R�[�h��񂪖���/������
				ExpjMessage emsg = new ExpjMessage("KQ00041");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;

			}else{
				jpCurrency = ((KU0030010Struct)listCurrency.get(0)).getgetHomeCur_CUR_CD();
                jpDecimalFig = Integer.parseInt(((KU0030010Struct)listCurrency.get(0)).getgetHomeCur_DECIMAL_FIG());

			}
			listCurrency = null;

			// =======================================
			// ��ʏo��(�\���p�̃��X�g���쐬����j
			// =======================================
			list = new ArrayList();
			for(int i=0;i<hyouji_kensu;i++){
				// Struct�̃C���X�^���X���쐬
				KU0030010Struct st = new KU0030010Struct();
				st.copy(struct);

				//������
				st.setsUser_ID(struct.getsUser_ID());

				//���Џ��
				st.setstrCOMPANY_CD(struct.getstrCOMPANY_CD());

				//���p�ҏ��
				st.setstrUSER_NAME(struct.getstrUSER_NAME());
				st.setstrPLANT_CD(struct.getstrPLANT_CD());
				st.setstrSECTION_CD(struct.getstrSECTION_CD());
				st.setstrORG_CD(struct.getstrORG_CD());
				st.setstrORG_NAME(struct.getstrORG_NAME());
				st.setstrORG_ANAME(struct.getstrORG_ANAME());
				st.setstrPLANT_NAME(struct.getstrPLANT_NAME());
				st.setstrPLANT_ANAME(struct.getstrPLANT_ANAME());
				st.setstrCAL_NO(struct.getstrCAL_NO());

				//�Ɩ����t
				st.setstrBUSINESS_OPR_DATE(struct.getstrBUSINESS_OPR_DATE());

				list.add(st);
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
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage( "ZZ01106");
				sysLog.severe(emsg, struct.getsUser_ID());
				ExpjException ee = new ExpjException(e,emsg);
				emsg = new ExpjMessage( "AA99991");
				sysLog.severe(emsg, struct.getsUser_ID());
				emsg = new ExpjMessage( "ZZ01106",e.toString());
				sysLog.severe(emsg, struct.getsUser_ID());
				throw ee;
			}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KU0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("recall") ) {
				controlrecall();
			} else if( button.equals("torikeshi") ) {
				controltorikeshi();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KU0030010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0030010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KU0030010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0030010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KU0030010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0030010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KU0030010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KU0030010Entity entity;
	protected KU0030010Struct struct;
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

		entity = new KU0030010Entity();
		struct = new KU0030010Struct();

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
	 * KU0030010�N���X�̕W���R���X�g���N�^
	 */
	public KU0030010Control() throws BusinessProcessException, FoundationException
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
				KU0030010Struct key = (KU0030010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("k_MODE") && key.getk_MODE() != null) {
					msgKey.setKeyValue("k_MODE", key.getk_MODE());
				}
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN") && key.getr_SEL_PTN() != null) {
					msgKey.setKeyValue("r_SEL_PTN", key.getr_SEL_PTN());
				}
				if(msgKeyType.containsKeyColumn("g_DESINATED_SHIP_DATE") && key.getg_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("g_DESINATED_SHIP_DATE", key.getg_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("g_SHIP_QTY") && key.getg_SHIP_QTY() != null) {
					msgKey.setKeyValue("g_SHIP_QTY", key.getg_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("g_SHIP_QTY2") && key.getg_SHIP_QTY2() != null) {
					msgKey.setKeyValue("g_SHIP_QTY2", key.getg_SHIP_QTY2());
				}
				if(msgKeyType.containsKeyColumn("g_UNIT_PRICE") && key.getg_UNIT_PRICE() != null) {
					msgKey.setKeyValue("g_UNIT_PRICE", key.getg_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("g_CURRNCY") && key.getg_CURRNCY() != null) {
					msgKey.setKeyValue("g_CURRNCY", key.getg_CURRNCY());
				}
				if(msgKeyType.containsKeyColumn("g_SHIP_ODR_AMOUNT") && key.getg_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("g_SHIP_ODR_AMOUNT", key.getg_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("g_WH_CD") && key.getg_WH_CD() != null) {
					msgKey.setKeyValue("g_WH_CD", key.getg_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("g_REMARKS") && key.getg_REMARKS() != null) {
					msgKey.setKeyValue("g_REMARKS", key.getg_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("g_CUST_ANAME") && key.getg_CUST_ANAME() != null) {
					msgKey.setKeyValue("g_CUST_ANAME", key.getg_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("g_ITEM_CD") && key.getg_ITEM_CD() != null) {
					msgKey.setKeyValue("g_ITEM_CD", key.getg_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_AP_SECRTY_TYP") && key.geth_AP_SECRTY_TYP() != null) {
					msgKey.setKeyValue("h_AP_SECRTY_TYP", key.geth_AP_SECRTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_SHIP_QTY") && key.geth_SHIP_QTY() != null) {
					msgKey.setKeyValue("h_SHIP_QTY", key.geth_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_GYOMU_DATE") && key.geth_GYOMU_DATE() != null) {
					msgKey.setKeyValue("h_GYOMU_DATE", key.geth_GYOMU_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_EXCH_TYP") && key.geth_EXCH_TYP() != null) {
					msgKey.setKeyValue("h_EXCH_TYP", key.geth_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MODFIY_CNT") && key.geth_MODFIY_CNT() != null) {
					msgKey.setKeyValue("h_MODFIY_CNT", key.geth_MODFIY_CNT());
				}
				if(msgKeyType.containsKeyColumn("h_TOTAL_SHIP_QTY") && key.geth_TOTAL_SHIP_QTY() != null) {
					msgKey.setKeyValue("h_TOTAL_SHIP_QTY", key.geth_TOTAL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("m_selRadio") && key.getm_selRadio() != null) {
					msgKey.setKeyValue("m_selRadio", key.getm_selRadio());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN1") && key.getr_SEL_PTN1() != null) {
					msgKey.setKeyValue("r_SEL_PTN1", key.getr_SEL_PTN1());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN2") && key.getr_SEL_PTN2() != null) {
					msgKey.setKeyValue("r_SEL_PTN2", key.getr_SEL_PTN2());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN3") && key.getr_SEL_PTN3() != null) {
					msgKey.setKeyValue("r_SEL_PTN3", key.getr_SEL_PTN3());
				}
				if(msgKeyType.containsKeyColumn("h_SELECT_FG") && key.geth_SELECT_FG() != null) {
					msgKey.setKeyValue("h_SELECT_FG", key.geth_SELECT_FG());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_PRICE") && key.geth_UNIT_PRICE() != null) {
					msgKey.setKeyValue("h_UNIT_PRICE", key.geth_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("g_STOCK_UNIT") && key.getg_STOCK_UNIT() != null) {
					msgKey.setKeyValue("g_STOCK_UNIT", key.getg_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("g_STOCK_UNIT2") && key.getg_STOCK_UNIT2() != null) {
					msgKey.setKeyValue("g_STOCK_UNIT2", key.getg_STOCK_UNIT2());
				}
				if(msgKeyType.containsKeyColumn("g_CUR_UNIT2") && key.getg_CUR_UNIT2() != null) {
					msgKey.setKeyValue("g_CUR_UNIT2", key.getg_CUR_UNIT2());
				}
				if(msgKeyType.containsKeyColumn("g_WH_NAME") && key.getg_WH_NAME() != null) {
					msgKey.setKeyValue("g_WH_NAME", key.getg_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("g_SALES_DEPT_CD") && key.getg_SALES_DEPT_CD() != null) {
					msgKey.setKeyValue("g_SALES_DEPT_CD", key.getg_SALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("g_ORG_NAME") && key.getg_ORG_NAME() != null) {
					msgKey.setKeyValue("g_ORG_NAME", key.getg_ORG_NAME());
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
				if(msgKeyType.containsKeyColumn("g_ODR_NO") && key.getg_ODR_NO() != null) {
					msgKey.setKeyValue("g_ODR_NO", key.getg_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("g_PART_DLV_SEQ_NO") && key.getg_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("g_PART_DLV_SEQ_NO", key.getg_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("g_SHIP_ODR_NO") && key.getg_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("g_SHIP_ODR_NO", key.getg_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_DATE") && key.geth_DATE() != null) {
					msgKey.setKeyValue("h_DATE", key.geth_DATE());
				}
				if(msgKeyType.containsKeyColumn("g_JOB_ODR_CD") && key.getg_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("g_JOB_ODR_CD", key.getg_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD") && key.getc_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("c_JOB_ODR_CD", key.getc_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("g_DIRECT_DLV_FLG") && key.getg_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("g_DIRECT_DLV_FLG", key.getg_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("g_STOCK_LOT_CD") && key.getg_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("g_STOCK_LOT_CD", key.getg_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_STOCK_LOT_CD") && key.geth_STOCK_LOT_CD() != null) {
					msgKey.setKeyValue("h_STOCK_LOT_CD", key.geth_STOCK_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("param1") && key.getparam1() != null) {
					msgKey.setKeyValue("param1", key.getparam1());
				}
				if(msgKeyType.containsKeyColumn("param2") && key.getparam2() != null) {
					msgKey.setKeyValue("param2", key.getparam2());
				}
				if(msgKeyType.containsKeyColumn("param3") && key.getparam3() != null) {
					msgKey.setKeyValue("param3", key.getparam3());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_FIG") && key.getUNIT_FIG() != null) {
					msgKey.setKeyValue("UNIT_FIG", key.getUNIT_FIG());
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
				if(msgKeyType.containsKeyColumn("strORG_CD") && key.getstrORG_CD() != null) {
					msgKey.setKeyValue("strORG_CD", key.getstrORG_CD());
				}
				if(msgKeyType.containsKeyColumn("strORG_NAME") && key.getstrORG_NAME() != null) {
					msgKey.setKeyValue("strORG_NAME", key.getstrORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("strORG_ANAME") && key.getstrORG_ANAME() != null) {
					msgKey.setKeyValue("strORG_ANAME", key.getstrORG_ANAME());
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
				if(msgKeyType.containsKeyColumn("serTori_SHIP_SEQ_NO") && key.getserTori_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("serTori_SHIP_SEQ_NO", key.getserTori_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("serTori_SHIP_ODR_NO") && key.getserTori_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("serTori_SHIP_ODR_NO", key.getserTori_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("serTori_SLIP_CD") && key.getserTori_SLIP_CD() != null) {
					msgKey.setKeyValue("serTori_SLIP_CD", key.getserTori_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_ODR_NO") && key.getserTori_ODR_NO() != null) {
					msgKey.setKeyValue("serTori_ODR_NO", key.getserTori_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("serTori_PART_DLV_SEQ_NO") && key.getserTori_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("serTori_PART_DLV_SEQ_NO", key.getserTori_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("serTori_ORGNAL_SLIP_CD") && key.getserTori_ORGNAL_SLIP_CD() != null) {
					msgKey.setKeyValue("serTori_ORGNAL_SLIP_CD", key.getserTori_ORGNAL_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_SLIP_TRN_CD") && key.getserTori_SLIP_TRN_CD() != null) {
					msgKey.setKeyValue("serTori_SLIP_TRN_CD", key.getserTori_SLIP_TRN_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_ITEM_CD") && key.getserTori_ITEM_CD() != null) {
					msgKey.setKeyValue("serTori_ITEM_CD", key.getserTori_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_JOB_ODR_CD") && key.getserTori_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("serTori_JOB_ODR_CD", key.getserTori_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_CUST_ITEM_CD") && key.getserTori_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("serTori_CUST_ITEM_CD", key.getserTori_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_CUST_ODR_NO") && key.getserTori_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("serTori_CUST_ODR_NO", key.getserTori_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("serTori_CUST_CD") && key.getserTori_CUST_CD() != null) {
					msgKey.setKeyValue("serTori_CUST_CD", key.getserTori_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_CUST_NAME") && key.getserTori_CUST_NAME() != null) {
					msgKey.setKeyValue("serTori_CUST_NAME", key.getserTori_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("serTori_CUST_CHRG_PSN_CD") && key.getserTori_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("serTori_CUST_CHRG_PSN_CD", key.getserTori_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_SHIP_ODR_ISS_PSN_CD") && key.getserTori_SHIP_ODR_ISS_PSN_CD() != null) {
					msgKey.setKeyValue("serTori_SHIP_ODR_ISS_PSN_CD", key.getserTori_SHIP_ODR_ISS_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_DLV_LOC_CD") && key.getserTori_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("serTori_DLV_LOC_CD", key.getserTori_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_DEPO_TYP") && key.getserTori_DEPO_TYP() != null) {
					msgKey.setKeyValue("serTori_DEPO_TYP", key.getserTori_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("serTori_ALLCT_WH_CD") && key.getserTori_ALLCT_WH_CD() != null) {
					msgKey.setKeyValue("serTori_ALLCT_WH_CD", key.getserTori_ALLCT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_DEPO_WH_CD") && key.getserTori_DEPO_WH_CD() != null) {
					msgKey.setKeyValue("serTori_DEPO_WH_CD", key.getserTori_DEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_LOC_CD") && key.getserTori_LOC_CD() != null) {
					msgKey.setKeyValue("serTori_LOC_CD", key.getserTori_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_SHIP_DATE") && key.getserTori_SHIP_DATE() != null) {
					msgKey.setKeyValue("serTori_SHIP_DATE", key.getserTori_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("serTori_SHIP_QTY") && key.getserTori_SHIP_QTY() != null) {
					msgKey.setKeyValue("serTori_SHIP_QTY", key.getserTori_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("serTori_UNIT_CD") && key.getserTori_UNIT_CD() != null) {
					msgKey.setKeyValue("serTori_UNIT_CD", key.getserTori_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_SHIP_UNIT_PRICE") && key.getserTori_SHIP_UNIT_PRICE() != null) {
					msgKey.setKeyValue("serTori_SHIP_UNIT_PRICE", key.getserTori_SHIP_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("serTori_SHIP_ODR_AMOUNT") && key.getserTori_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("serTori_SHIP_ODR_AMOUNT", key.getserTori_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("serTori_SHIP_ODR_AMOUNT_EXCH_RATES") && key.getserTori_SHIP_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("serTori_SHIP_ODR_AMOUNT_EXCH_RATES", key.getserTori_SHIP_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("serTori_CURRNCY_CD") && key.getserTori_CURRNCY_CD() != null) {
					msgKey.setKeyValue("serTori_CURRNCY_CD", key.getserTori_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("serTori_DIRECT_DLV_FLG") && key.getserTori_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("serTori_DIRECT_DLV_FLG", key.getserTori_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("serTori_SHIP_INFO_IF_CTRL_NO") && key.getserTori_SHIP_INFO_IF_CTRL_NO() != null) {
					msgKey.setKeyValue("serTori_SHIP_INFO_IF_CTRL_NO", key.getserTori_SHIP_INFO_IF_CTRL_NO());
				}
				if(msgKeyType.containsKeyColumn("serTori_INSPC_ACPT_INFO_IF_CTRL_NO") && key.getserTori_INSPC_ACPT_INFO_IF_CTRL_NO() != null) {
					msgKey.setKeyValue("serTori_INSPC_ACPT_INFO_IF_CTRL_NO", key.getserTori_INSPC_ACPT_INFO_IF_CTRL_NO());
				}
				if(msgKeyType.containsKeyColumn("serTori_DLV_KEY_NO") && key.getserTori_DLV_KEY_NO() != null) {
					msgKey.setKeyValue("serTori_DLV_KEY_NO", key.getserTori_DLV_KEY_NO());
				}
				if(msgKeyType.containsKeyColumn("serTori_DEL_FLG") && key.getserTori_DEL_FLG() != null) {
					msgKey.setKeyValue("serTori_DEL_FLG", key.getserTori_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("serTori_CUR_NAME") && key.getserTori_CUR_NAME() != null) {
					msgKey.setKeyValue("serTori_CUR_NAME", key.getserTori_CUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("serTori_EXCH_TYP") && key.getserTori_EXCH_TYP() != null) {
					msgKey.setKeyValue("serTori_EXCH_TYP", key.getserTori_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("serTori_MODIFY_COUNT") && key.getserTori_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("serTori_MODIFY_COUNT", key.getserTori_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("serTori_RETURN_QTY") && key.getserTori_RETURN_QTY() != null) {
					msgKey.setKeyValue("serTori_RETURN_QTY", key.getserTori_RETURN_QTY());
				}
				if(msgKeyType.containsKeyColumn("serTori_TOTAL_SHIP_QTY") && key.getserTori_TOTAL_SHIP_QTY() != null) {
					msgKey.setKeyValue("serTori_TOTAL_SHIP_QTY", key.getserTori_TOTAL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("serTori_STATUS") && key.getserTori_STATUS() != null) {
					msgKey.setKeyValue("serTori_STATUS", key.getserTori_STATUS());
				}
				if(msgKeyType.containsKeyColumn("serTori_INSPC_ACPT_TYP") && key.getserTori_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("serTori_INSPC_ACPT_TYP", key.getserTori_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("serToriSALES_DEPT_CD") && key.getserToriSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("serToriSALES_DEPT_CD", key.getserToriSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("serToriSALES_DATE") && key.getserToriSALES_DATE() != null) {
					msgKey.setKeyValue("serToriSALES_DATE", key.getserToriSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP") && key.geth_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("h_MRP_ODR_TYP", key.geth_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG") && key.geth_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_LOT_CTRL_FLG", key.geth_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("serTodrMODIFY_COUNT") && key.getserTodrMODIFY_COUNT() != null) {
					msgKey.setKeyValue("serTodrMODIFY_COUNT", key.getserTodrMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("serTori_IN_SLIPCD") && key.getserTori_IN_SLIPCD() != null) {
					msgKey.setKeyValue("serTori_IN_SLIPCD", key.getserTori_IN_SLIPCD());
				}
				if(msgKeyType.containsKeyColumn("creTship_SHIP_SEQ_NO") && key.getcreTship_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("creTship_SHIP_SEQ_NO", key.getcreTship_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("creTship_SHIP_ODR_NO") && key.getcreTship_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("creTship_SHIP_ODR_NO", key.getcreTship_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("creTship_SLIP_CD") && key.getcreTship_SLIP_CD() != null) {
					msgKey.setKeyValue("creTship_SLIP_CD", key.getcreTship_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_ODR_NO") && key.getcreTship_ODR_NO() != null) {
					msgKey.setKeyValue("creTship_ODR_NO", key.getcreTship_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("creTship_PART_DLV_SEQ_NO") && key.getcreTship_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("creTship_PART_DLV_SEQ_NO", key.getcreTship_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("creTship_ORGNAL_SLIP_CD") && key.getcreTship_ORGNAL_SLIP_CD() != null) {
					msgKey.setKeyValue("creTship_ORGNAL_SLIP_CD", key.getcreTship_ORGNAL_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_SLIP_TRN_CD") && key.getcreTship_SLIP_TRN_CD() != null) {
					msgKey.setKeyValue("creTship_SLIP_TRN_CD", key.getcreTship_SLIP_TRN_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_ITEM_CD") && key.getcreTship_ITEM_CD() != null) {
					msgKey.setKeyValue("creTship_ITEM_CD", key.getcreTship_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_JOB_ODR_CD") && key.getcreTship_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("creTship_JOB_ODR_CD", key.getcreTship_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_CUST_ITEM_CD") && key.getcreTship_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("creTship_CUST_ITEM_CD", key.getcreTship_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_CUST_ODR_NO") && key.getcreTship_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("creTship_CUST_ODR_NO", key.getcreTship_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("creTship_CUST_CD") && key.getcreTship_CUST_CD() != null) {
					msgKey.setKeyValue("creTship_CUST_CD", key.getcreTship_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_CUST_NAME") && key.getcreTship_CUST_NAME() != null) {
					msgKey.setKeyValue("creTship_CUST_NAME", key.getcreTship_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("creTship_CUST_CHRG_PSN_CD") && key.getcreTship_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("creTship_CUST_CHRG_PSN_CD", key.getcreTship_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_SHIP_ODR_ISS_PSN_CD") && key.getcreTship_SHIP_ODR_ISS_PSN_CD() != null) {
					msgKey.setKeyValue("creTship_SHIP_ODR_ISS_PSN_CD", key.getcreTship_SHIP_ODR_ISS_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_DLV_LOC_CD") && key.getcreTship_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("creTship_DLV_LOC_CD", key.getcreTship_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_DEPO_TYP") && key.getcreTship_DEPO_TYP() != null) {
					msgKey.setKeyValue("creTship_DEPO_TYP", key.getcreTship_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("creTship_ALLCT_WH_CD") && key.getcreTship_ALLCT_WH_CD() != null) {
					msgKey.setKeyValue("creTship_ALLCT_WH_CD", key.getcreTship_ALLCT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_DEPO_WH_CD") && key.getcreTship_DEPO_WH_CD() != null) {
					msgKey.setKeyValue("creTship_DEPO_WH_CD", key.getcreTship_DEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_LOC_CD") && key.getcreTship_LOC_CD() != null) {
					msgKey.setKeyValue("creTship_LOC_CD", key.getcreTship_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_SHIP_DATE") && key.getcreTship_SHIP_DATE() != null) {
					msgKey.setKeyValue("creTship_SHIP_DATE", key.getcreTship_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("creTship_SHIP_QTY") && key.getcreTship_SHIP_QTY() != null) {
					msgKey.setKeyValue("creTship_SHIP_QTY", key.getcreTship_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTship_UNIT_CD") && key.getcreTship_UNIT_CD() != null) {
					msgKey.setKeyValue("creTship_UNIT_CD", key.getcreTship_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_SHIP_UNIT_PRICE") && key.getcreTship_SHIP_UNIT_PRICE() != null) {
					msgKey.setKeyValue("creTship_SHIP_UNIT_PRICE", key.getcreTship_SHIP_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("creTship_SHIP_ODR_AMOUNT") && key.getcreTship_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("creTship_SHIP_ODR_AMOUNT", key.getcreTship_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTship_SHIP_ODR_AMOUNT_EXCH_RATES") && key.getcreTship_SHIP_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("creTship_SHIP_ODR_AMOUNT_EXCH_RATES", key.getcreTship_SHIP_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("creTship_CURRNCY_CD") && key.getcreTship_CURRNCY_CD() != null) {
					msgKey.setKeyValue("creTship_CURRNCY_CD", key.getcreTship_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("creTship_DIRECT_DLV_FLG") && key.getcreTship_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("creTship_DIRECT_DLV_FLG", key.getcreTship_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("creTship_DLV_KEY_NO") && key.getcreTship_DLV_KEY_NO() != null) {
					msgKey.setKeyValue("creTship_DLV_KEY_NO", key.getcreTship_DLV_KEY_NO());
				}
				if(msgKeyType.containsKeyColumn("creTship_REMARKS") && key.getcreTship_REMARKS() != null) {
					msgKey.setKeyValue("creTship_REMARKS", key.getcreTship_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("creTship_DEL_FLG") && key.getcreTship_DEL_FLG() != null) {
					msgKey.setKeyValue("creTship_DEL_FLG", key.getcreTship_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("updTship_SHIP_SEQ_NO") && key.getupdTship_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("updTship_SHIP_SEQ_NO", key.getupdTship_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("serInsert_SHIP_ODR_NO") && key.getserInsert_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("serInsert_SHIP_ODR_NO", key.getserInsert_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("serInsert_ODR_NO") && key.getserInsert_ODR_NO() != null) {
					msgKey.setKeyValue("serInsert_ODR_NO", key.getserInsert_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("serInsert_PART_DLV_SEQ_NO") && key.getserInsert_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("serInsert_PART_DLV_SEQ_NO", key.getserInsert_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("serInsert_SLIP_CD") && key.getserInsert_SLIP_CD() != null) {
					msgKey.setKeyValue("serInsert_SLIP_CD", key.getserInsert_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_ITEM_CD") && key.getserInsert_ITEM_CD() != null) {
					msgKey.setKeyValue("serInsert_ITEM_CD", key.getserInsert_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_JOB_ODR_CD") && key.getserInsert_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("serInsert_JOB_ODR_CD", key.getserInsert_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_CUST_ITEM_CD") && key.getserInsert_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("serInsert_CUST_ITEM_CD", key.getserInsert_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_CUST_ODR_NO") && key.getserInsert_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("serInsert_CUST_ODR_NO", key.getserInsert_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("serInsert_CUST_CD") && key.getserInsert_CUST_CD() != null) {
					msgKey.setKeyValue("serInsert_CUST_CD", key.getserInsert_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_CUST_NAME") && key.getserInsert_CUST_NAME() != null) {
					msgKey.setKeyValue("serInsert_CUST_NAME", key.getserInsert_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("serInsert_CUST_CHRG_PSN_CD") && key.getserInsert_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("serInsert_CUST_CHRG_PSN_CD", key.getserInsert_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_SHIP_ODR_ISS_PSN_CD") && key.getserInsert_SHIP_ODR_ISS_PSN_CD() != null) {
					msgKey.setKeyValue("serInsert_SHIP_ODR_ISS_PSN_CD", key.getserInsert_SHIP_ODR_ISS_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_DLV_LOC_CD") && key.getserInsert_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("serInsert_DLV_LOC_CD", key.getserInsert_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_DEPO_TYP") && key.getserInsert_DEPO_TYP() != null) {
					msgKey.setKeyValue("serInsert_DEPO_TYP", key.getserInsert_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("serInsert_DESINATED_SHIP_DATE") && key.getserInsert_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("serInsert_DESINATED_SHIP_DATE", key.getserInsert_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("serInsert_SHIP_QTY") && key.getserInsert_SHIP_QTY() != null) {
					msgKey.setKeyValue("serInsert_SHIP_QTY", key.getserInsert_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("serInsert_TOTAL_SHIP_QTY") && key.getserInsert_TOTAL_SHIP_QTY() != null) {
					msgKey.setKeyValue("serInsert_TOTAL_SHIP_QTY", key.getserInsert_TOTAL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("serInsert_UNIT_CD") && key.getserInsert_UNIT_CD() != null) {
					msgKey.setKeyValue("serInsert_UNIT_CD", key.getserInsert_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_UNIT_PRICE") && key.getserInsert_UNIT_PRICE() != null) {
					msgKey.setKeyValue("serInsert_UNIT_PRICE", key.getserInsert_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("serInsert_SHIP_ODR_AMOUNT") && key.getserInsert_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("serInsert_SHIP_ODR_AMOUNT", key.getserInsert_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("serInsert_SHIP_ODR_AMOUNT_EXCH_RATES") && key.getserInsert_SHIP_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("serInsert_SHIP_ODR_AMOUNT_EXCH_RATES", key.getserInsert_SHIP_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("serInsert_CURRNCY_CD") && key.getserInsert_CURRNCY_CD() != null) {
					msgKey.setKeyValue("serInsert_CURRNCY_CD", key.getserInsert_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_LOC_CD") && key.getserInsert_LOC_CD() != null) {
					msgKey.setKeyValue("serInsert_LOC_CD", key.getserInsert_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_PKG_UNIT_QTY") && key.getserInsert_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("serInsert_PKG_UNIT_QTY", key.getserInsert_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("serInsert_REMARKS") && key.getserInsert_REMARKS() != null) {
					msgKey.setKeyValue("serInsert_REMARKS", key.getserInsert_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("serInsert_TRANSPORT_CD") && key.getserInsert_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("serInsert_TRANSPORT_CD", key.getserInsert_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_TRANSPORT_TYP") && key.getserInsert_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("serInsert_TRANSPORT_TYP", key.getserInsert_TRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("serInsert_ALLCT_WH_CD") && key.getserInsert_ALLCT_WH_CD() != null) {
					msgKey.setKeyValue("serInsert_ALLCT_WH_CD", key.getserInsert_ALLCT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_TRANSFER_WH_CD") && key.getserInsert_TRANSFER_WH_CD() != null) {
					msgKey.setKeyValue("serInsert_TRANSFER_WH_CD", key.getserInsert_TRANSFER_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_DIRECT_DLV_FLG") && key.getserInsert_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("serInsert_DIRECT_DLV_FLG", key.getserInsert_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("serInsert_ENTRY_TYP") && key.getserInsert_ENTRY_TYP() != null) {
					msgKey.setKeyValue("serInsert_ENTRY_TYP", key.getserInsert_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("serInsert_PRINT_FLG") && key.getserInsert_PRINT_FLG() != null) {
					msgKey.setKeyValue("serInsert_PRINT_FLG", key.getserInsert_PRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("serInsert_SHP_CMPLT_FLG") && key.getserInsert_SHP_CMPLT_FLG() != null) {
					msgKey.setKeyValue("serInsert_SHP_CMPLT_FLG", key.getserInsert_SHP_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("serInsert_DEPO_TRANSFER_PROC_FLG") && key.getserInsert_DEPO_TRANSFER_PROC_FLG() != null) {
					msgKey.setKeyValue("serInsert_DEPO_TRANSFER_PROC_FLG", key.getserInsert_DEPO_TRANSFER_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("serInsert_DEL_FLG") && key.getserInsert_DEL_FLG() != null) {
					msgKey.setKeyValue("serInsert_DEL_FLG", key.getserInsert_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("serInsert_CUR_CD") && key.getserInsert_CUR_CD() != null) {
					msgKey.setKeyValue("serInsert_CUR_CD", key.getserInsert_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("serInsert_CUR_NAME") && key.getserInsert_CUR_NAME() != null) {
					msgKey.setKeyValue("serInsert_CUR_NAME", key.getserInsert_CUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("serInsert_EXCH_TYP") && key.getserInsert_EXCH_TYP() != null) {
					msgKey.setKeyValue("serInsert_EXCH_TYP", key.getserInsert_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("serInsert_SPCL_PRICE_TYP") && key.getserInsert_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("serInsert_SPCL_PRICE_TYP", key.getserInsert_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("serInsert_MODIFY_COUNT") && key.getserInsert_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("serInsert_MODIFY_COUNT", key.getserInsert_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("serInsert_SCDL_DLV_DATE") && key.getserInsert_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("serInsert_SCDL_DLV_DATE", key.getserInsert_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("serInsert_DLV_KEY_NO") && key.getserInsert_DLV_KEY_NO() != null) {
					msgKey.setKeyValue("serInsert_DLV_KEY_NO", key.getserInsert_DLV_KEY_NO());
				}
				if(msgKeyType.containsKeyColumn("h_RETURN_QTY") && key.geth_RETURN_QTY() != null) {
					msgKey.setKeyValue("h_RETURN_QTY", key.geth_RETURN_QTY());
				}
				if(msgKeyType.containsKeyColumn("serInsert_ODR_ACPT_DATE") && key.getserInsert_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("serInsert_ODR_ACPT_DATE", key.getserInsert_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("selMODIFY_COUNT") && key.getselMODIFY_COUNT() != null) {
					msgKey.setKeyValue("selMODIFY_COUNT", key.getselMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("serInsert_IN_SLIPCD") && key.getserInsert_IN_SLIPCD() != null) {
					msgKey.setKeyValue("serInsert_IN_SLIPCD", key.getserInsert_IN_SLIPCD());
				}
				if(msgKeyType.containsKeyColumn("upTshipOdr_DEPO_TRANSFER_PROC_FLG") && key.getupTshipOdr_DEPO_TRANSFER_PROC_FLG() != null) {
					msgKey.setKeyValue("upTshipOdr_DEPO_TRANSFER_PROC_FLG", key.getupTshipOdr_DEPO_TRANSFER_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("upTshipOdr_IN_SLIPCD") && key.getupTshipOdr_IN_SLIPCD() != null) {
					msgKey.setKeyValue("upTshipOdr_IN_SLIPCD", key.getupTshipOdr_IN_SLIPCD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_WH_CD") && key.getchkisWhCd_WH_CD() != null) {
					msgKey.setKeyValue("chkisWhCd_WH_CD", key.getchkisWhCd_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_WH_TYP") && key.getchkisWhCd_WH_TYP() != null) {
					msgKey.setKeyValue("chkisWhCd_WH_TYP", key.getchkisWhCd_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_NAME") && key.getchkisinWhCd_WH_NAME() != null) {
					msgKey.setKeyValue("chkisinWhCd_WH_NAME", key.getchkisinWhCd_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_IN_WHCD") && key.getchkisWhCd_IN_WHCD() != null) {
					msgKey.setKeyValue("chkisWhCd_IN_WHCD", key.getchkisWhCd_IN_WHCD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_IN_WHTYP") && key.getchkisWhCd_IN_WHTYP() != null) {
					msgKey.setKeyValue("chkisWhCd_IN_WHTYP", key.getchkisWhCd_IN_WHTYP());
				}
				if(msgKeyType.containsKeyColumn("creTsales_SHIP_ODR_NO") && key.getcreTsales_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("creTsales_SHIP_ODR_NO", key.getcreTsales_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("creTsales_SLIP_CD") && key.getcreTsales_SLIP_CD() != null) {
					msgKey.setKeyValue("creTsales_SLIP_CD", key.getcreTsales_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("creTsales_SALES_TYP") && key.getcreTsales_SALES_TYP() != null) {
					msgKey.setKeyValue("creTsales_SALES_TYP", key.getcreTsales_SALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("creTsales_CUST_CD") && key.getcreTsales_CUST_CD() != null) {
					msgKey.setKeyValue("creTsales_CUST_CD", key.getcreTsales_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("creTsales_ITEM_CD") && key.getcreTsales_ITEM_CD() != null) {
					msgKey.setKeyValue("creTsales_ITEM_CD", key.getcreTsales_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("creTsales_ITEM_NAME") && key.getcreTsales_ITEM_NAME() != null) {
					msgKey.setKeyValue("creTsales_ITEM_NAME", key.getcreTsales_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("creTsales_CUST_ODR_NO") && key.getcreTsales_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("creTsales_CUST_ODR_NO", key.getcreTsales_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("creTsales_SALES_DATE") && key.getcreTsales_SALES_DATE() != null) {
					msgKey.setKeyValue("creTsales_SALES_DATE", key.getcreTsales_SALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("creTsales_SALES_DEPT_CD") && key.getcreTsales_SALES_DEPT_CD() != null) {
					msgKey.setKeyValue("creTsales_SALES_DEPT_CD", key.getcreTsales_SALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("creTsales_CUST_CHRG_PSN_CD") && key.getcreTsales_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("creTsales_CUST_CHRG_PSN_CD", key.getcreTsales_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("creTsales_ODR_ACPT_PSN_CD") && key.getcreTsales_ODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("creTsales_ODR_ACPT_PSN_CD", key.getcreTsales_ODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("creTsales_SALES_QTY") && key.getcreTsales_SALES_QTY() != null) {
					msgKey.setKeyValue("creTsales_SALES_QTY", key.getcreTsales_SALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTsales_SALES_UNIT_PRICE") && key.getcreTsales_SALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("creTsales_SALES_UNIT_PRICE", key.getcreTsales_SALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("creTsales_UNIT_CD") && key.getcreTsales_UNIT_CD() != null) {
					msgKey.setKeyValue("creTsales_UNIT_CD", key.getcreTsales_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("creTsales_SALES_AMOUNT") && key.getcreTsales_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("creTsales_SALES_AMOUNT", key.getcreTsales_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTsales_SALES_AMOUNT_EXCH_RATES") && key.getcreTsales_SALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("creTsales_SALES_AMOUNT_EXCH_RATES", key.getcreTsales_SALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("creTsales_INSPC_ACPT_DATE") && key.getcreTsales_INSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("creTsales_INSPC_ACPT_DATE", key.getcreTsales_INSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("creTsales_INSPC_ACPT_QTY") && key.getcreTsales_INSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("creTsales_INSPC_ACPT_QTY", key.getcreTsales_INSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTsales_EXTERNAL_TAX_SALES_AMOUNT") && key.getcreTsales_EXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("creTsales_EXTERNAL_TAX_SALES_AMOUNT", key.getcreTsales_EXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTsales_INTERNAL_TAX_SALES_AMOUNT") && key.getcreTsales_INTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("creTsales_INTERNAL_TAX_SALES_AMOUNT", key.getcreTsales_INTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTsales_TAXFREE_SALES_AMOUNT") && key.getcreTsales_TAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("creTsales_TAXFREE_SALES_AMOUNT", key.getcreTsales_TAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTsales_TAX_CREDIT_SALES_AMOUNT") && key.getcreTsales_TAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("creTsales_TAX_CREDIT_SALES_AMOUNT", key.getcreTsales_TAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTsales_EXTERNAL_TAX_AMOUNT") && key.getcreTsales_EXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("creTsales_EXTERNAL_TAX_AMOUNT", key.getcreTsales_EXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTsales_INTERNAL_TAX_AMOUNT") && key.getcreTsales_INTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("creTsales_INTERNAL_TAX_AMOUNT", key.getcreTsales_INTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTsales_TAX_AMOUNT_1") && key.getcreTsales_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("creTsales_TAX_AMOUNT_1", key.getcreTsales_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("creTsales_TAX_AMOUNT_2") && key.getcreTsales_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("creTsales_TAX_AMOUNT_2", key.getcreTsales_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("creTsales_TAX_AMOUNT_3") && key.getcreTsales_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("creTsales_TAX_AMOUNT_3", key.getcreTsales_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTsales_ORG_SLIP_CD") && key.getcreTsales_ORG_SLIP_CD() != null) {
					msgKey.setKeyValue("creTsales_ORG_SLIP_CD", key.getcreTsales_ORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("creTsales_CURRNCY_CD") && key.getcreTsales_CURRNCY_CD() != null) {
					msgKey.setKeyValue("creTsales_CURRNCY_CD", key.getcreTsales_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("creTsales_SPCL_PRICE_CO") && key.getcreTsales_SPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("creTsales_SPCL_PRICE_CO", key.getcreTsales_SPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("creTsales_REMARKS") && key.getcreTsales_REMARKS() != null) {
					msgKey.setKeyValue("creTsales_REMARKS", key.getcreTsales_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("creTsales_DEL_FLG") && key.getcreTsales_DEL_FLG() != null) {
					msgKey.setKeyValue("creTsales_DEL_FLG", key.getcreTsales_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("creTsales_INSPC_ACPT_TYP") && key.getcreTsales_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("creTsales_INSPC_ACPT_TYP", key.getcreTsales_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("creTsales_STATUS") && key.getcreTsales_STATUS() != null) {
					msgKey.setKeyValue("creTsales_STATUS", key.getcreTsales_STATUS());
				}
				if(msgKeyType.containsKeyColumn("creTsales_APPR_FLG") && key.getcreTsales_APPR_FLG() != null) {
					msgKey.setKeyValue("creTsales_APPR_FLG", key.getcreTsales_APPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("creTsales_APPR_ID") && key.getcreTsales_APPR_ID() != null) {
					msgKey.setKeyValue("creTsales_APPR_ID", key.getcreTsales_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("creTsales_APPR_DATE") && key.getcreTsales_APPR_DATE() != null) {
					msgKey.setKeyValue("creTsales_APPR_DATE", key.getcreTsales_APPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("creTsales_EXCH_RATE") && key.getcreTsales_EXCH_RATE() != null) {
					msgKey.setKeyValue("creTsales_EXCH_RATE", key.getcreTsales_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("serTsales_SALES_SEQ_NO") && key.getserTsales_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("serTsales_SALES_SEQ_NO", key.getserTsales_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("serTsales_SLIP_CD") && key.getserTsales_SLIP_CD() != null) {
					msgKey.setKeyValue("serTsales_SLIP_CD", key.getserTsales_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("serTsales_SALES_TYP") && key.getserTsales_SALES_TYP() != null) {
					msgKey.setKeyValue("serTsales_SALES_TYP", key.getserTsales_SALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("serTsales_CUST_CD") && key.getserTsales_CUST_CD() != null) {
					msgKey.setKeyValue("serTsales_CUST_CD", key.getserTsales_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("serTsales_ITEM_CD") && key.getserTsales_ITEM_CD() != null) {
					msgKey.setKeyValue("serTsales_ITEM_CD", key.getserTsales_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("serTsales_ITEM_NAME") && key.getserTsales_ITEM_NAME() != null) {
					msgKey.setKeyValue("serTsales_ITEM_NAME", key.getserTsales_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("serTsales_CUST_ODR_NO") && key.getserTsales_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("serTsales_CUST_ODR_NO", key.getserTsales_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("serTsales_SALES_DATE") && key.getserTsales_SALES_DATE() != null) {
					msgKey.setKeyValue("serTsales_SALES_DATE", key.getserTsales_SALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("serTsales_SALES_DEPT_CD") && key.getserTsales_SALES_DEPT_CD() != null) {
					msgKey.setKeyValue("serTsales_SALES_DEPT_CD", key.getserTsales_SALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("serTsales_CUST_CHRG_PSN_CD") && key.getserTsales_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("serTsales_CUST_CHRG_PSN_CD", key.getserTsales_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("serTsales_ODR_ACPT_PSN_CD") && key.getserTsales_ODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("serTsales_ODR_ACPT_PSN_CD", key.getserTsales_ODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("serTsales_SALES_QTY") && key.getserTsales_SALES_QTY() != null) {
					msgKey.setKeyValue("serTsales_SALES_QTY", key.getserTsales_SALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("serTsales_SALES_UNIT_PRICE") && key.getserTsales_SALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("serTsales_SALES_UNIT_PRICE", key.getserTsales_SALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("serTsales_UNIT_CD") && key.getserTsales_UNIT_CD() != null) {
					msgKey.setKeyValue("serTsales_UNIT_CD", key.getserTsales_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("serTsales_SALES_AMOUNT") && key.getserTsales_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("serTsales_SALES_AMOUNT", key.getserTsales_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("serTsales_SALES_AMOUNT_EXCH_RATES") && key.getserTsales_SALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("serTsales_SALES_AMOUNT_EXCH_RATES", key.getserTsales_SALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("serTsales_EXTERNAL_TAX_SALES_AMOUNT") && key.getserTsales_EXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("serTsales_EXTERNAL_TAX_SALES_AMOUNT", key.getserTsales_EXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("serTsales_INTERNAL_TAX_SALES_AMOUNT") && key.getserTsales_INTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("serTsales_INTERNAL_TAX_SALES_AMOUNT", key.getserTsales_INTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("serTsales_TAXFREE_SALES_AMOUNT") && key.getserTsales_TAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("serTsales_TAXFREE_SALES_AMOUNT", key.getserTsales_TAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("serTsales_TAX_CREDIT_SALES_AMOUNT") && key.getserTsales_TAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("serTsales_TAX_CREDIT_SALES_AMOUNT", key.getserTsales_TAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("serTsales_EXTERNAL_TAX_AMOUNT") && key.getserTsales_EXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("serTsales_EXTERNAL_TAX_AMOUNT", key.getserTsales_EXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("serTsales_INTERNAL_TAX_AMOUNT") && key.getserTsales_INTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("serTsales_INTERNAL_TAX_AMOUNT", key.getserTsales_INTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("serTsales_TAX_AMOUNT_1") && key.getserTsales_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("serTsales_TAX_AMOUNT_1", key.getserTsales_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("serTsales_TAX_AMOUNT_2") && key.getserTsales_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("serTsales_TAX_AMOUNT_2", key.getserTsales_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("serTsales_TAX_AMOUNT_3") && key.getserTsales_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("serTsales_TAX_AMOUNT_3", key.getserTsales_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("serTsales_ORG_SLIP_CD") && key.getserTsales_ORG_SLIP_CD() != null) {
					msgKey.setKeyValue("serTsales_ORG_SLIP_CD", key.getserTsales_ORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("serTsales_CURRNCY_CD") && key.getserTsales_CURRNCY_CD() != null) {
					msgKey.setKeyValue("serTsales_CURRNCY_CD", key.getserTsales_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("serTsales_SPCL_PRICE_CO") && key.getserTsales_SPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("serTsales_SPCL_PRICE_CO", key.getserTsales_SPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("serTsales_REMARKS") && key.getserTsales_REMARKS() != null) {
					msgKey.setKeyValue("serTsales_REMARKS", key.getserTsales_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("serTsales_DEL_FLG") && key.getserTsales_DEL_FLG() != null) {
					msgKey.setKeyValue("serTsales_DEL_FLG", key.getserTsales_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("serTsales_INSPC_ACPT_TYP") && key.getserTsales_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("serTsales_INSPC_ACPT_TYP", key.getserTsales_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("serTsales_STATUS") && key.getserTsales_STATUS() != null) {
					msgKey.setKeyValue("serTsales_STATUS", key.getserTsales_STATUS());
				}
				if(msgKeyType.containsKeyColumn("serTsales_PRD_ODR_PLACE_CD") && key.getserTsales_PRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("serTsales_PRD_ODR_PLACE_CD", key.getserTsales_PRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("serTsales_EXCH_RATE") && key.getserTsales_EXCH_RATE() != null) {
					msgKey.setKeyValue("serTsales_EXCH_RATE", key.getserTsales_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("serTsales_IN_SLIPCD") && key.getserTsales_IN_SLIPCD() != null) {
					msgKey.setKeyValue("serTsales_IN_SLIPCD", key.getserTsales_IN_SLIPCD());
				}
				if(msgKeyType.containsKeyColumn("updTsales_APPR_FLG") && key.getupdTsales_APPR_FLG() != null) {
					msgKey.setKeyValue("updTsales_APPR_FLG", key.getupdTsales_APPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("updTsales_APPR_ID") && key.getupdTsales_APPR_ID() != null) {
					msgKey.setKeyValue("updTsales_APPR_ID", key.getupdTsales_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("updTsales_APPR_DATE") && key.getupdTsales_APPR_DATE() != null) {
					msgKey.setKeyValue("updTsales_APPR_DATE", key.getupdTsales_APPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("updTsales_SALES_SEQ_NO") && key.getupdTsales_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("updTsales_SALES_SEQ_NO", key.getupdTsales_SALES_SEQ_NO());
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
				if(msgKeyType.containsKeyColumn("mItemSpec_CUST_CD") && key.getmItemSpec_CUST_CD() != null) {
					msgKey.setKeyValue("mItemSpec_CUST_CD", key.getmItemSpec_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("mItemSpec_CUST_ITEM_CD") && key.getmItemSpec_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("mItemSpec_CUST_ITEM_CD", key.getmItemSpec_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("mItemSpec_COMPANY_CD") && key.getmItemSpec_COMPANY_CD() != null) {
					msgKey.setKeyValue("mItemSpec_COMPANY_CD", key.getmItemSpec_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("mItemSpec_SALES_DEPT_CD") && key.getmItemSpec_SALES_DEPT_CD() != null) {
					msgKey.setKeyValue("mItemSpec_SALES_DEPT_CD", key.getmItemSpec_SALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("mItemSpec_CUST_ITEM_NAME") && key.getmItemSpec_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("mItemSpec_CUST_ITEM_NAME", key.getmItemSpec_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("mItemSpec_IN_CUST_CD") && key.getmItemSpec_IN_CUST_CD() != null) {
					msgKey.setKeyValue("mItemSpec_IN_CUST_CD", key.getmItemSpec_IN_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("mItemSpec_IN_CUST_ITEM_CD") && key.getmItemSpec_IN_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("mItemSpec_IN_CUST_ITEM_CD", key.getmItemSpec_IN_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("mItemSpec_IN_COMPANY_CD") && key.getmItemSpec_IN_COMPANY_CD() != null) {
					msgKey.setKeyValue("mItemSpec_IN_COMPANY_CD", key.getmItemSpec_IN_COMPANY_CD());
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
				if(msgKeyType.containsKeyColumn("tOdr_ODR_UNIT_PRICE") && key.gettOdr_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("tOdr_ODR_UNIT_PRICE", key.gettOdr_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SPCL_PRICE_TYP") && key.gettOdr_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("tOdr_SPCL_PRICE_TYP", key.gettOdr_SPCL_PRICE_TYP());
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
				if(msgKeyType.containsKeyColumn("tOdr_DLV_KEY_NO") && key.gettOdr_DLV_KEY_NO() != null) {
					msgKey.setKeyValue("tOdr_DLV_KEY_NO", key.gettOdr_DLV_KEY_NO());
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
				if(msgKeyType.containsKeyColumn("tOdr_TRANSPORT_TYP") && key.gettOdr_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("tOdr_TRANSPORT_TYP", key.gettOdr_TRANSPORT_TYP());
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
				if(msgKeyType.containsKeyColumn("tOdr_PARTIAL_SHIP_INST_FLG") && key.gettOdr_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("tOdr_PARTIAL_SHIP_INST_FLG", key.gettOdr_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_IF_CTL_NO") && key.gettOdr_IF_CTL_NO() != null) {
					msgKey.setKeyValue("tOdr_IF_CTL_NO", key.gettOdr_IF_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ENTRY_TYP") && key.gettOdr_ENTRY_TYP() != null) {
					msgKey.setKeyValue("tOdr_ENTRY_TYP", key.gettOdr_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DEL_FLG") && key.gettOdr_DEL_FLG() != null) {
					msgKey.setKeyValue("tOdr_DEL_FLG", key.gettOdr_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_CNT") && key.gettOdr_SHIP_CNT() != null) {
					msgKey.setKeyValue("tOdr_SHIP_CNT", key.gettOdr_SHIP_CNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_UNIT_CD_ORG") && key.gettOdr_UNIT_CD_ORG() != null) {
					msgKey.setKeyValue("tOdr_UNIT_CD_ORG", key.gettOdr_UNIT_CD_ORG());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_CD") && key.gettOdrCtl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("tOdrCtl_CUST_ITEM_CD", key.gettOdrCtl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_COCK_TYP") && key.gettOdr_COCK_TYP() != null) {
					msgKey.setKeyValue("tOdr_COCK_TYP", key.gettOdr_COCK_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PUCH_ODR_QTY_TOTAL") && key.gettOdr_PUCH_ODR_QTY_TOTAL() != null) {
					msgKey.setKeyValue("tOdr_PUCH_ODR_QTY_TOTAL", key.gettOdr_PUCH_ODR_QTY_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("tOdr_BUYER_ORG_CD") && key.gettOdr_BUYER_ORG_CD() != null) {
					msgKey.setKeyValue("tOdr_BUYER_ORG_CD", key.gettOdr_BUYER_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_BUYER_NAME") && key.gettOdr_BUYER_NAME() != null) {
					msgKey.setKeyValue("tOdr_BUYER_NAME", key.gettOdr_BUYER_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdr_IN_ODRNO") && key.gettOdr_IN_ODRNO() != null) {
					msgKey.setKeyValue("tOdr_IN_ODRNO", key.gettOdr_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_NO") && key.getcreTodrODR_NO() != null) {
					msgKey.setKeyValue("creTodrODR_NO", key.getcreTodrODR_NO());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_TYP") && key.getcreTodrODR_TYP() != null) {
					msgKey.setKeyValue("creTodrODR_TYP", key.getcreTodrODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_CTL_NO") && key.getcreTodrODR_CTL_NO() != null) {
					msgKey.setKeyValue("creTodrODR_CTL_NO", key.getcreTodrODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("creTodrCUST_ODR_NO") && key.getcreTodrCUST_ODR_NO() != null) {
					msgKey.setKeyValue("creTodrCUST_ODR_NO", key.getcreTodrCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("creTodrCUST_CHRG_ORG_CD") && key.getcreTodrCUST_CHRG_ORG_CD() != null) {
					msgKey.setKeyValue("creTodrCUST_CHRG_ORG_CD", key.getcreTodrCUST_CHRG_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("creTodrCUST_CHRG_PSN_CD") && key.getcreTodrCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("creTodrCUST_CHRG_PSN_CD", key.getcreTodrCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_ACPT_ORG_CD") && key.getcreTodrODR_ACPT_ORG_CD() != null) {
					msgKey.setKeyValue("creTodrODR_ACPT_ORG_CD", key.getcreTodrODR_ACPT_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_ACPT_PSN_CD") && key.getcreTodrODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("creTodrODR_ACPT_PSN_CD", key.getcreTodrODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("creTodrCURRNCY_CD") && key.getcreTodrCURRNCY_CD() != null) {
					msgKey.setKeyValue("creTodrCURRNCY_CD", key.getcreTodrCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("creTodrEXCH_TYP") && key.getcreTodrEXCH_TYP() != null) {
					msgKey.setKeyValue("creTodrEXCH_TYP", key.getcreTodrEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("creTodrDLV_LOC_CD") && key.getcreTodrDLV_LOC_CD() != null) {
					msgKey.setKeyValue("creTodrDLV_LOC_CD", key.getcreTodrDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("creTodrDLV_LOC_NAME") && key.getcreTodrDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("creTodrDLV_LOC_NAME", key.getcreTodrDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("creTodrDLV_LOC_NAME_KANJI") && key.getcreTodrDLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("creTodrDLV_LOC_NAME_KANJI", key.getcreTodrDLV_LOC_NAME_KANJI());
				}
				if(msgKeyType.containsKeyColumn("creTodrPRD_ODR_PLACE_CD") && key.getcreTodrPRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("creTodrPRD_ODR_PLACE_CD", key.getcreTodrPRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_UNIT_PRICE") && key.getcreTodrODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("creTodrODR_UNIT_PRICE", key.getcreTodrODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("creTodrPART_DLV_COUNT") && key.getcreTodrPART_DLV_COUNT() != null) {
					msgKey.setKeyValue("creTodrPART_DLV_COUNT", key.getcreTodrPART_DLV_COUNT());
				}
				if(msgKeyType.containsKeyColumn("creTodrDEPO_TYP") && key.getcreTodrDEPO_TYP() != null) {
					msgKey.setKeyValue("creTodrDEPO_TYP", key.getcreTodrDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("creTodrDESINATED_DLV_DATE") && key.getcreTodrDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("creTodrDESINATED_DLV_DATE", key.getcreTodrDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_QTY") && key.getcreTodrODR_QTY() != null) {
					msgKey.setKeyValue("creTodrODR_QTY", key.getcreTodrODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTodrREMAIN_UNCONFIRM_ODR_QTY") && key.getcreTodrREMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("creTodrREMAIN_UNCONFIRM_ODR_QTY", key.getcreTodrREMAIN_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTodrCANCELED_UNCONFIRM_ODR_QTY") && key.getcreTodrCANCELED_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("creTodrCANCELED_UNCONFIRM_ODR_QTY", key.getcreTodrCANCELED_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTodrUNIT_CD") && key.getcreTodrUNIT_CD() != null) {
					msgKey.setKeyValue("creTodrUNIT_CD", key.getcreTodrUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("creTodrUNCONFIRM_ODR_BALANCE") && key.getcreTodrUNCONFIRM_ODR_BALANCE() != null) {
					msgKey.setKeyValue("creTodrUNCONFIRM_ODR_BALANCE", key.getcreTodrUNCONFIRM_ODR_BALANCE());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_AMOUNT") && key.getcreTodrODR_AMOUNT() != null) {
					msgKey.setKeyValue("creTodrODR_AMOUNT", key.getcreTodrODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_AMOUNT_EXCH_RATES") && key.getcreTodrODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("creTodrODR_AMOUNT_EXCH_RATES", key.getcreTodrODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("creTodrTOTAL_SHIP_QTY") && key.getcreTodrTOTAL_SHIP_QTY() != null) {
					msgKey.setKeyValue("creTodrTOTAL_SHIP_QTY", key.getcreTodrTOTAL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTodrSHIP_AMOUNT") && key.getcreTodrSHIP_AMOUNT() != null) {
					msgKey.setKeyValue("creTodrSHIP_AMOUNT", key.getcreTodrSHIP_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTodrSHIP_AMOUNT_EXCH_RATES") && key.getcreTodrSHIP_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("creTodrSHIP_AMOUNT_EXCH_RATES", key.getcreTodrSHIP_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_CMPLT_FLG") && key.getcreTodrODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("creTodrODR_CMPLT_FLG", key.getcreTodrODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_CMPLT_DATE") && key.getcreTodrODR_CMPLT_DATE() != null) {
					msgKey.setKeyValue("creTodrODR_CMPLT_DATE", key.getcreTodrODR_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("creTodrREMARKS") && key.getcreTodrREMARKS() != null) {
					msgKey.setKeyValue("creTodrREMARKS", key.getcreTodrREMARKS());
				}
				if(msgKeyType.containsKeyColumn("creTodrODR_ACPT_DATE") && key.getcreTodrODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("creTodrODR_ACPT_DATE", key.getcreTodrODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("creTodrSHIP_PLAN_REMAIN_QTY") && key.getcreTodrSHIP_PLAN_REMAIN_QTY() != null) {
					msgKey.setKeyValue("creTodrSHIP_PLAN_REMAIN_QTY", key.getcreTodrSHIP_PLAN_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTodrSHIP_PLAN_CMPLT_FLG") && key.getcreTodrSHIP_PLAN_CMPLT_FLG() != null) {
					msgKey.setKeyValue("creTodrSHIP_PLAN_CMPLT_FLG", key.getcreTodrSHIP_PLAN_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("creTodrUNCONFIRMED_ODR_EFF_OVR_FLG") && key.getcreTodrUNCONFIRMED_ODR_EFF_OVR_FLG() != null) {
					msgKey.setKeyValue("creTodrUNCONFIRMED_ODR_EFF_OVR_FLG", key.getcreTodrUNCONFIRMED_ODR_EFF_OVR_FLG());
				}
				if(msgKeyType.containsKeyColumn("creTodrPARTIAL_SHIP_INST_FLG") && key.getcreTodrPARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("creTodrPARTIAL_SHIP_INST_FLG", key.getcreTodrPARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("creTodrENTRY_TYP") && key.getcreTodrENTRY_TYP() != null) {
					msgKey.setKeyValue("creTodrENTRY_TYP", key.getcreTodrENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("creTodrDEL_FLG") && key.getcreTodrDEL_FLG() != null) {
					msgKey.setKeyValue("creTodrDEL_FLG", key.getcreTodrDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("upTodr_TOTAL_SHIP_QTY") && key.getupTodr_TOTAL_SHIP_QTY() != null) {
					msgKey.setKeyValue("upTodr_TOTAL_SHIP_QTY", key.getupTodr_TOTAL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("upTodr_SHIP_AMOUNT") && key.getupTodr_SHIP_AMOUNT() != null) {
					msgKey.setKeyValue("upTodr_SHIP_AMOUNT", key.getupTodr_SHIP_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("upTodr_SHIP_AMOUNT_EXCH_RATES") && key.getupTodr_SHIP_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("upTodr_SHIP_AMOUNT_EXCH_RATES", key.getupTodr_SHIP_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("upTodr_ODR_CMPLT_FLG") && key.getupTodr_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("upTodr_ODR_CMPLT_FLG", key.getupTodr_ODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("upTodr_ODR_CMPLT_DATE") && key.getupTodr_ODR_CMPLT_DATE() != null) {
					msgKey.setKeyValue("upTodr_ODR_CMPLT_DATE", key.getupTodr_ODR_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("upTodr_IN_ODRNO") && key.getupTodr_IN_ODRNO() != null) {
					msgKey.setKeyValue("upTodr_IN_ODRNO", key.getupTodr_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_CTRL_CD") && key.getcreTrcvIssue_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("creTrcvIssue_RCV_ISSUE_CTRL_CD", key.getcreTrcvIssue_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_TYP") && key.getcreTrcvIssue_RCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("creTrcvIssue_RCV_ISSUE_TYP", key.getcreTrcvIssue_RCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_ITEM_CD") && key.getcreTrcvIssue_ITEM_CD() != null) {
					msgKey.setKeyValue("creTrcvIssue_ITEM_CD", key.getcreTrcvIssue_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_JOB_ODR_CD") && key.getcreTrcvIssue_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("creTrcvIssue_JOB_ODR_CD", key.getcreTrcvIssue_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_PLANT_CD") && key.getcreTrcvIssue_PLANT_CD() != null) {
					msgKey.setKeyValue("creTrcvIssue_PLANT_CD", key.getcreTrcvIssue_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_WH_CD") && key.getcreTrcvIssue_WH_CD() != null) {
					msgKey.setKeyValue("creTrcvIssue_WH_CD", key.getcreTrcvIssue_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_BEFORE_QTY") && key.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY() != null) {
					msgKey.setKeyValue("creTrcvIssue_RCV_ISSUE_BEFORE_QTY", key.getcreTrcvIssue_RCV_ISSUE_BEFORE_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_QTY") && key.getcreTrcvIssue_RCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("creTrcvIssue_RCV_ISSUE_QTY", key.getcreTrcvIssue_RCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_AFTER_QTY") && key.getcreTrcvIssue_RCV_ISSUE_AFTER_QTY() != null) {
					msgKey.setKeyValue("creTrcvIssue_RCV_ISSUE_AFTER_QTY", key.getcreTrcvIssue_RCV_ISSUE_AFTER_QTY());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_AMOUNT") && key.getcreTrcvIssue_RCV_ISSUE_AMOUNT() != null) {
					msgKey.setKeyValue("creTrcvIssue_RCV_ISSUE_AMOUNT", key.getcreTrcvIssue_RCV_ISSUE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_DATE") && key.getcreTrcvIssue_RCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("creTrcvIssue_RCV_ISSUE_DATE", key.getcreTrcvIssue_RCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_GNR_TYP") && key.getcreTrcvIssue_RCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("creTrcvIssue_RCV_ISSUE_GNR_TYP", key.getcreTrcvIssue_RCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_STOCK_UPD_TYP") && key.getcreTrcvIssue_STOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("creTrcvIssue_STOCK_UPD_TYP", key.getcreTrcvIssue_STOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_CMPLT_FLG") && key.getcreTrcvIssue_RCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("creTrcvIssue_RCV_ISSUE_CMPLT_FLG", key.getcreTrcvIssue_RCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_COMMENT") && key.getcreTrcvIssue_RCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("creTrcvIssue_RCV_ISSUE_COMMENT", key.getcreTrcvIssue_RCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_LOT_NO") && key.getcreTrcvIssue_LOT_NO() != null) {
					msgKey.setKeyValue("creTrcvIssue_LOT_NO", key.getcreTrcvIssue_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("creTrcvIssue_SHIP_ODR_NO") && key.getcreTrcvIssue_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("creTrcvIssue_SHIP_ODR_NO", key.getcreTrcvIssue_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("upTitemStock_STOCK_ON_HAND_QTY") && key.getupTitemStock_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("upTitemStock_STOCK_ON_HAND_QTY", key.getupTitemStock_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("upTitemStock_IN_ITEMCD") && key.getupTitemStock_IN_ITEMCD() != null) {
					msgKey.setKeyValue("upTitemStock_IN_ITEMCD", key.getupTitemStock_IN_ITEMCD());
				}
				if(msgKeyType.containsKeyColumn("upTitemStock_IN_WHCD") && key.getupTitemStock_IN_WHCD() != null) {
					msgKey.setKeyValue("upTitemStock_IN_WHCD", key.getupTitemStock_IN_WHCD());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_ITEM_CD") && key.getserTitemStock_ITEM_CD() != null) {
					msgKey.setKeyValue("serTitemStock_ITEM_CD", key.getserTitemStock_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_WH_CD") && key.getserTitemStock_WH_CD() != null) {
					msgKey.setKeyValue("serTitemStock_WH_CD", key.getserTitemStock_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_PLANT_CD") && key.getserTitemStock_PLANT_CD() != null) {
					msgKey.setKeyValue("serTitemStock_PLANT_CD", key.getserTitemStock_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_STOCK_ON_HAND_QTY") && key.getserTitemStock_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("serTitemStock_STOCK_ON_HAND_QTY", key.getserTitemStock_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_DEFECT_QTY") && key.getserTitemStock_DEFECT_QTY() != null) {
					msgKey.setKeyValue("serTitemStock_DEFECT_QTY", key.getserTitemStock_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_PRVS_DAYEND_STOCK_QTY") && key.getserTitemStock_PRVS_DAYEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("serTitemStock_PRVS_DAYEND_STOCK_QTY", key.getserTitemStock_PRVS_DAYEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_PRVS_MONTHEND_STOCK_QTY") && key.getserTitemStock_PRVS_MONTHEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("serTitemStock_PRVS_MONTHEND_STOCK_QTY", key.getserTitemStock_PRVS_MONTHEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_PRVS_TERMEND_STOCK_QTY") && key.getserTitemStock_PRVS_TERMEND_STOCK_QTY() != null) {
					msgKey.setKeyValue("serTitemStock_PRVS_TERMEND_STOCK_QTY", key.getserTitemStock_PRVS_TERMEND_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_IN_ITEMCD") && key.getserTitemStock_IN_ITEMCD() != null) {
					msgKey.setKeyValue("serTitemStock_IN_ITEMCD", key.getserTitemStock_IN_ITEMCD());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_IN_WHCD") && key.getserTitemStock_IN_WHCD() != null) {
					msgKey.setKeyValue("serTitemStock_IN_WHCD", key.getserTitemStock_IN_WHCD());
				}
				if(msgKeyType.containsKeyColumn("creTitemStock_WH_CD") && key.getcreTitemStock_WH_CD() != null) {
					msgKey.setKeyValue("creTitemStock_WH_CD", key.getcreTitemStock_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("creTitemStock_ITEM_CD") && key.getcreTitemStock_ITEM_CD() != null) {
					msgKey.setKeyValue("creTitemStock_ITEM_CD", key.getcreTitemStock_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("creTitemStock_PLANT_CD") && key.getcreTitemStock_PLANT_CD() != null) {
					msgKey.setKeyValue("creTitemStock_PLANT_CD", key.getcreTitemStock_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("creTitemStock_STOCK_ON_HAND_QTY") && key.getcreTitemStock_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("creTitemStock_STOCK_ON_HAND_QTY", key.getcreTitemStock_STOCK_ON_HAND_QTY());
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
				if(msgKeyType.containsKeyColumn("mCust_DETAIL_ROUND_TYP") && key.getmCust_DETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("mCust_DETAIL_ROUND_TYP", key.getmCust_DETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_INSPC_ACPT_TYP") && key.getmCust_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("mCust_INSPC_ACPT_TYP", key.getmCust_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_OWN_ORG_CD") && key.getmCust_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("mCust_OWN_ORG_CD", key.getmCust_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_EXCH_TYP") && key.getmCust_EXCH_TYP() != null) {
					msgKey.setKeyValue("mCust_EXCH_TYP", key.getmCust_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUR_CD") && key.getmCust_CUR_CD() != null) {
					msgKey.setKeyValue("mCust_CUR_CD", key.getmCust_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_IN_COMPANYCD") && key.getmCust_IN_COMPANYCD() != null) {
					msgKey.setKeyValue("mCust_IN_COMPANYCD", key.getmCust_IN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("mCust_IN_CUSTCD") && key.getmCust_IN_CUSTCD() != null) {
					msgKey.setKeyValue("mCust_IN_CUSTCD", key.getmCust_IN_CUSTCD());
				}
				if(msgKeyType.containsKeyColumn("getHomeCur_CUR_CD") && key.getgetHomeCur_CUR_CD() != null) {
					msgKey.setKeyValue("getHomeCur_CUR_CD", key.getgetHomeCur_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("getHomeCur_DECIMAL_FIG") && key.getgetHomeCur_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("getHomeCur_DECIMAL_FIG", key.getgetHomeCur_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("getHomeCur_CTRL_CD") && key.getgetHomeCur_CTRL_CD() != null) {
					msgKey.setKeyValue("getHomeCur_CTRL_CD", key.getgetHomeCur_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("strCode") && key.getstrCode() != null) {
					msgKey.setKeyValue("strCode", key.getstrCode());
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
				if(msgKeyType.containsKeyColumn("readShipOdr_TOTAL_SHIP_QTY") && key.getreadShipOdr_TOTAL_SHIP_QTY() != null) {
					msgKey.setKeyValue("readShipOdr_TOTAL_SHIP_QTY", key.getreadShipOdr_TOTAL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("readShipOdr_RETURN_QTY") && key.getreadShipOdr_RETURN_QTY() != null) {
					msgKey.setKeyValue("readShipOdr_RETURN_QTY", key.getreadShipOdr_RETURN_QTY());
				}
				if(msgKeyType.containsKeyColumn("readShipOdr_SHIP_ODR_NO") && key.getreadShipOdr_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("readShipOdr_SHIP_ODR_NO", key.getreadShipOdr_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("g_CUR_UNIT") && key.getg_CUR_UNIT() != null) {
					msgKey.setKeyValue("g_CUR_UNIT", key.getg_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("t_CUR_CD") && key.gett_CUR_CD() != null) {
					msgKey.setKeyValue("t_CUR_CD", key.gett_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("strSLIP_CTRL_GRP") && key.getstrSLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("strSLIP_CTRL_GRP", key.getstrSLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("strSTATUS") && key.getstrSTATUS() != null) {
					msgKey.setKeyValue("strSTATUS", key.getstrSTATUS());
				}
				if(msgKeyType.containsKeyColumn("strSLIP_CD") && key.getstrSLIP_CD() != null) {
					msgKey.setKeyValue("strSLIP_CD", key.getstrSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("upTshipOdr_SHP_CMPLT_FLG") && key.getupTshipOdr_SHP_CMPLT_FLG() != null) {
					msgKey.setKeyValue("upTshipOdr_SHP_CMPLT_FLG", key.getupTshipOdr_SHP_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("upTshipOdr_TOTAL_SHIP_QTY") && key.getupTshipOdr_TOTAL_SHIP_QTY() != null) {
					msgKey.setKeyValue("upTshipOdr_TOTAL_SHIP_QTY", key.getupTshipOdr_TOTAL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("upTshipOdr_SLIP_CD") && key.getupTshipOdr_SLIP_CD() != null) {
					msgKey.setKeyValue("upTshipOdr_SLIP_CD", key.getupTshipOdr_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("upTshipOdr_ORG_SLIP_CD") && key.getupTshipOdr_ORG_SLIP_CD() != null) {
					msgKey.setKeyValue("upTshipOdr_ORG_SLIP_CD", key.getupTshipOdr_ORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("upTshipOdr_SHIP_ODR_NO") && key.getupTshipOdr_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("upTshipOdr_SHIP_ODR_NO", key.getupTshipOdr_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("strTod_OD_NO") && key.getstrTod_OD_NO() != null) {
					msgKey.setKeyValue("strTod_OD_NO", key.getstrTod_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("strTod_TOTAL_ISSUE_QTY") && key.getstrTod_TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("strTod_TOTAL_ISSUE_QTY", key.getstrTod_TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("strTod_DM_QTY") && key.getstrTod_DM_QTY() != null) {
					msgKey.setKeyValue("strTod_DM_QTY", key.getstrTod_DM_QTY());
				}
				if(msgKeyType.containsKeyColumn("strTod_DM_STS_TYP") && key.getstrTod_DM_STS_TYP() != null) {
					msgKey.setKeyValue("strTod_DM_STS_TYP", key.getstrTod_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("inTod_ODR_NO") && key.getinTod_ODR_NO() != null) {
					msgKey.setKeyValue("inTod_ODR_NO", key.getinTod_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("inTod_PART_DLV_SEQ_NO") && key.getinTod_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("inTod_PART_DLV_SEQ_NO", key.getinTod_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("inTod_OD_NO") && key.getinTod_OD_NO() != null) {
					msgKey.setKeyValue("inTod_OD_NO", key.getinTod_OD_NO());
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
				if(msgKeyType.containsKeyColumn("updiffTAX_CD") && key.getupdiffTAX_CD() != null) {
					msgKey.setKeyValue("updiffTAX_CD", key.getupdiffTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("upTshipOdr_RETURN_QTY") && key.getupTshipOdr_RETURN_QTY() != null) {
					msgKey.setKeyValue("upTshipOdr_RETURN_QTY", key.getupTshipOdr_RETURN_QTY());
				}
				if(msgKeyType.containsKeyColumn("chkSLIP_CD") && key.getchkSLIP_CD() != null) {
					msgKey.setKeyValue("chkSLIP_CD", key.getchkSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("mWh_WH_NAME") && key.getmWh_WH_NAME() != null) {
					msgKey.setKeyValue("mWh_WH_NAME", key.getmWh_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("mWh_PLANT_CD") && key.getmWh_PLANT_CD() != null) {
					msgKey.setKeyValue("mWh_PLANT_CD", key.getmWh_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("mWh_IN_WH_CD") && key.getmWh_IN_WH_CD() != null) {
					msgKey.setKeyValue("mWh_IN_WH_CD", key.getmWh_IN_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("mOrg_ORG_NAME") && key.getmOrg_ORG_NAME() != null) {
					msgKey.setKeyValue("mOrg_ORG_NAME", key.getmOrg_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("mOrg_IN_COMPANYCD") && key.getmOrg_IN_COMPANYCD() != null) {
					msgKey.setKeyValue("mOrg_IN_COMPANYCD", key.getmOrg_IN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("mOrg_IN_ORGCD") && key.getmOrg_IN_ORGCD() != null) {
					msgKey.setKeyValue("mOrg_IN_ORGCD", key.getmOrg_IN_ORGCD());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_JOB_ODR_CD") && key.getserTitemStock_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("serTitemStock_JOB_ODR_CD", key.getserTitemStock_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("serTitemStock_IN_JOBODRCD") && key.getserTitemStock_IN_JOBODRCD() != null) {
					msgKey.setKeyValue("serTitemStock_IN_JOBODRCD", key.getserTitemStock_IN_JOBODRCD());
				}
				if(msgKeyType.containsKeyColumn("creTitemStock_JOB_ODR_CD") && key.getcreTitemStock_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("creTitemStock_JOB_ODR_CD", key.getcreTitemStock_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("upTitemStock_IN_JOBODRCD") && key.getupTitemStock_IN_JOBODRCD() != null) {
					msgKey.setKeyValue("upTitemStock_IN_JOBODRCD", key.getupTitemStock_IN_JOBODRCD());
				}
				if(msgKeyType.containsKeyColumn("serTJobOdr_JOB_ODR_CD") && key.getserTJobOdr_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("serTJobOdr_JOB_ODR_CD", key.getserTJobOdr_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("serTJobOdr_ITEM_CD") && key.getserTJobOdr_ITEM_CD() != null) {
					msgKey.setKeyValue("serTJobOdr_ITEM_CD", key.getserTJobOdr_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("diffSHIP_QTY") && key.getdiffSHIP_QTY() != null) {
					msgKey.setKeyValue("diffSHIP_QTY", key.getdiffSHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("diffSHIP_ODR_AMOUNT") && key.getdiffSHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("diffSHIP_ODR_AMOUNT", key.getdiffSHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("diffSHIP_ODR_AMOUNT_EXCH_RATE") && key.getdiffSHIP_ODR_AMOUNT_EXCH_RATE() != null) {
					msgKey.setKeyValue("diffSHIP_ODR_AMOUNT_EXCH_RATE", key.getdiffSHIP_ODR_AMOUNT_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("diffSHIP_ODR_NO") && key.getdiffSHIP_ODR_NO() != null) {
					msgKey.setKeyValue("diffSHIP_ODR_NO", key.getdiffSHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("diffODR_NO") && key.getdiffODR_NO() != null) {
					msgKey.setKeyValue("diffODR_NO", key.getdiffODR_NO());
				}
				if(msgKeyType.containsKeyColumn("diffPART_DLV_SEQ_NO") && key.getdiffPART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("diffPART_DLV_SEQ_NO", key.getdiffPART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("diffSLIP_CD") && key.getdiffSLIP_CD() != null) {
					msgKey.setKeyValue("diffSLIP_CD", key.getdiffSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("diffITEM_CD") && key.getdiffITEM_CD() != null) {
					msgKey.setKeyValue("diffITEM_CD", key.getdiffITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("diffJOB_ODR_CD") && key.getdiffJOB_ODR_CD() != null) {
					msgKey.setKeyValue("diffJOB_ODR_CD", key.getdiffJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("diffCUST_ITEM_CD") && key.getdiffCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("diffCUST_ITEM_CD", key.getdiffCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("diffCUST_ODR_NO") && key.getdiffCUST_ODR_NO() != null) {
					msgKey.setKeyValue("diffCUST_ODR_NO", key.getdiffCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("diffCUST_CD") && key.getdiffCUST_CD() != null) {
					msgKey.setKeyValue("diffCUST_CD", key.getdiffCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("diffCUST_NAME") && key.getdiffCUST_NAME() != null) {
					msgKey.setKeyValue("diffCUST_NAME", key.getdiffCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("diffCUST_CHRG_PSN_CD") && key.getdiffCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("diffCUST_CHRG_PSN_CD", key.getdiffCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("diffSHIP_ODR_ISS_PSN_CD") && key.getdiffSHIP_ODR_ISS_PSN_CD() != null) {
					msgKey.setKeyValue("diffSHIP_ODR_ISS_PSN_CD", key.getdiffSHIP_ODR_ISS_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("diffDLV_LOC_CD") && key.getdiffDLV_LOC_CD() != null) {
					msgKey.setKeyValue("diffDLV_LOC_CD", key.getdiffDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("diffDEPO_TYP") && key.getdiffDEPO_TYP() != null) {
					msgKey.setKeyValue("diffDEPO_TYP", key.getdiffDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("diffDESINATED_SHIP_DATE") && key.getdiffDESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("diffDESINATED_SHIP_DATE", key.getdiffDESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("diffSCDL_DLV_DATE") && key.getdiffSCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("diffSCDL_DLV_DATE", key.getdiffSCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("diffTOTAL_SHIP_QTY") && key.getdiffTOTAL_SHIP_QTY() != null) {
					msgKey.setKeyValue("diffTOTAL_SHIP_QTY", key.getdiffTOTAL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("diffRETURN_QTY") && key.getdiffRETURN_QTY() != null) {
					msgKey.setKeyValue("diffRETURN_QTY", key.getdiffRETURN_QTY());
				}
				if(msgKeyType.containsKeyColumn("diffUNIT_CD") && key.getdiffUNIT_CD() != null) {
					msgKey.setKeyValue("diffUNIT_CD", key.getdiffUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("diffUNIT_PRICE") && key.getdiffUNIT_PRICE() != null) {
					msgKey.setKeyValue("diffUNIT_PRICE", key.getdiffUNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("diffCURRENCY_CD") && key.getdiffCURRENCY_CD() != null) {
					msgKey.setKeyValue("diffCURRENCY_CD", key.getdiffCURRENCY_CD());
				}
				if(msgKeyType.containsKeyColumn("diffLOC_CD") && key.getdiffLOC_CD() != null) {
					msgKey.setKeyValue("diffLOC_CD", key.getdiffLOC_CD());
				}
				if(msgKeyType.containsKeyColumn("diffPKG_UNIT_QTY") && key.getdiffPKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("diffPKG_UNIT_QTY", key.getdiffPKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("diffREMARKS") && key.getdiffREMARKS() != null) {
					msgKey.setKeyValue("diffREMARKS", key.getdiffREMARKS());
				}
				if(msgKeyType.containsKeyColumn("diffDLV_KEY_NO") && key.getdiffDLV_KEY_NO() != null) {
					msgKey.setKeyValue("diffDLV_KEY_NO", key.getdiffDLV_KEY_NO());
				}
				if(msgKeyType.containsKeyColumn("diffPART_DLV_COUNT") && key.getdiffPART_DLV_COUNT() != null) {
					msgKey.setKeyValue("diffPART_DLV_COUNT", key.getdiffPART_DLV_COUNT());
				}
				if(msgKeyType.containsKeyColumn("diffTRANSPORT_CD") && key.getdiffTRANSPORT_CD() != null) {
					msgKey.setKeyValue("diffTRANSPORT_CD", key.getdiffTRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("diffTRANSPORT_TYP") && key.getdiffTRANSPORT_TYP() != null) {
					msgKey.setKeyValue("diffTRANSPORT_TYP", key.getdiffTRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("diffALLCT_WH_CD") && key.getdiffALLCT_WH_CD() != null) {
					msgKey.setKeyValue("diffALLCT_WH_CD", key.getdiffALLCT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("diffTRANSFER_WH_CD") && key.getdiffTRANSFER_WH_CD() != null) {
					msgKey.setKeyValue("diffTRANSFER_WH_CD", key.getdiffTRANSFER_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("diffDIRECT_DLV_FLG") && key.getdiffDIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("diffDIRECT_DLV_FLG", key.getdiffDIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("diffENTRY_TYP") && key.getdiffENTRY_TYP() != null) {
					msgKey.setKeyValue("diffENTRY_TYP", key.getdiffENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("diffPRINT_FLG") && key.getdiffPRINT_FLG() != null) {
					msgKey.setKeyValue("diffPRINT_FLG", key.getdiffPRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("diffSHIP_CMPLT_FLG") && key.getdiffSHIP_CMPLT_FLG() != null) {
					msgKey.setKeyValue("diffSHIP_CMPLT_FLG", key.getdiffSHIP_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("diffDEPO_TRANSFER_PROC_FLG") && key.getdiffDEPO_TRANSFER_PROC_FLG() != null) {
					msgKey.setKeyValue("diffDEPO_TRANSFER_PROC_FLG", key.getdiffDEPO_TRANSFER_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("diffDEL_FLG") && key.getdiffDEL_FLG() != null) {
					msgKey.setKeyValue("diffDEL_FLG", key.getdiffDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("diffuptOdr_SHIP_CNT") && key.getdiffuptOdr_SHIP_CNT() != null) {
					msgKey.setKeyValue("diffuptOdr_SHIP_CNT", key.getdiffuptOdr_SHIP_CNT());
				}
				if(msgKeyType.containsKeyColumn("diffuptOdr_PART_DLV_COUNT") && key.getdiffuptOdr_PART_DLV_COUNT() != null) {
					msgKey.setKeyValue("diffuptOdr_PART_DLV_COUNT", key.getdiffuptOdr_PART_DLV_COUNT());
				}
				if(msgKeyType.containsKeyColumn("diffuptOdr_IN_ODRNO") && key.getdiffuptOdr_IN_ODRNO() != null) {
					msgKey.setKeyValue("diffuptOdr_IN_ODRNO", key.getdiffuptOdr_IN_ODRNO());
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
				if(msgKeyType.containsKeyColumn("up_tShipSlip_SLIP_CD") && key.getup_tShipSlip_SLIP_CD() != null) {
					msgKey.setKeyValue("up_tShipSlip_SLIP_CD", key.getup_tShipSlip_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("updiffSHIP_ODR_QTY") && key.getupdiffSHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("updiffSHIP_ODR_QTY", key.getupdiffSHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("updiffSHIP_ODR_AMOUNT") && key.getupdiffSHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("updiffSHIP_ODR_AMOUNT", key.getupdiffSHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("updiffTAX_AMOUNT") && key.getupdiffTAX_AMOUNT() != null) {
					msgKey.setKeyValue("updiffTAX_AMOUNT", key.getupdiffTAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("updiffSHIP_ODR_AMOUNT_TAX") && key.getupdiffSHIP_ODR_AMOUNT_TAX() != null) {
					msgKey.setKeyValue("updiffSHIP_ODR_AMOUNT_TAX", key.getupdiffSHIP_ODR_AMOUNT_TAX());
				}
				if(msgKeyType.containsKeyColumn("updiffEXTERNAL_TAX_SALES_AMOUNT") && key.getupdiffEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("updiffEXTERNAL_TAX_SALES_AMOUNT", key.getupdiffEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("updiffINTERNAL_TAX_SALES_AMOUNT") && key.getupdiffINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("updiffINTERNAL_TAX_SALES_AMOUNT", key.getupdiffINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("updiffTAXFREE_SALES_AMOUNT") && key.getupdiffTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("updiffTAXFREE_SALES_AMOUNT", key.getupdiffTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("updiffTAX_CREDIT_SALES_AMOUNT") && key.getupdiffTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("updiffTAX_CREDIT_SALES_AMOUNT", key.getupdiffTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("updiffEXTERNAL_TAX_AMOUNT") && key.getupdiffEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("updiffEXTERNAL_TAX_AMOUNT", key.getupdiffEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("updiffINTERNAL_TAX_AMOUNT") && key.getupdiffINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("updiffINTERNAL_TAX_AMOUNT", key.getupdiffINTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("updiffTAX_AMOUNT_1") && key.getupdiffTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("updiffTAX_AMOUNT_1", key.getupdiffTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("updiffTAX_AMOUNT_2") && key.getupdiffTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("updiffTAX_AMOUNT_2", key.getupdiffTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("updiffTAX_AMOUNT_3") && key.getupdiffTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("updiffTAX_AMOUNT_3", key.getupdiffTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getupdiffOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getupdiffOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("updiffSLIP_CD") && key.getupdiffSLIP_CD() != null) {
					msgKey.setKeyValue("updiffSLIP_CD", key.getupdiffSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_LT") && key.getmCustBase_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("mCustBase_TRANSPORT_LT", key.getmCustBase_TRANSPORT_LT());
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
				if(msgKeyType.containsKeyColumn("strSYUKA_LT") && key.getstrSYUKA_LT() != null) {
					msgKey.setKeyValue("strSYUKA_LT", key.getstrSYUKA_LT());
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
				if(msgKeyType.containsKeyColumn("strT_ODR_TAX") && key.getstrT_ODR_TAX() != null) {
					msgKey.setKeyValue("strT_ODR_TAX", key.getstrT_ODR_TAX());
				}
				if(msgKeyType.containsKeyColumn("g_SLIP_CD") && key.getg_SLIP_CD() != null) {
					msgKey.setKeyValue("g_SLIP_CD", key.getg_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("getTship_SHIP_SEQ_NO") && key.getgetTship_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("getTship_SHIP_SEQ_NO", key.getgetTship_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("chkLOT_NO") && key.getchkLOT_NO() != null) {
					msgKey.setKeyValue("chkLOT_NO", key.getchkLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("chkITEM_CD") && key.getchkITEM_CD() != null) {
					msgKey.setKeyValue("chkITEM_CD", key.getchkITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("getQtySTOCK_ON_HAND_QTY") && key.getgetQtySTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("getQtySTOCK_ON_HAND_QTY", key.getgetQtySTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("getQtyALCD_QTY") && key.getgetQtyALCD_QTY() != null) {
					msgKey.setKeyValue("getQtyALCD_QTY", key.getgetQtyALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("getQtyITEM_CD") && key.getgetQtyITEM_CD() != null) {
					msgKey.setKeyValue("getQtyITEM_CD", key.getgetQtyITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("getQtyWH_CD") && key.getgetQtyWH_CD() != null) {
					msgKey.setKeyValue("getQtyWH_CD", key.getgetQtyWH_CD());
				}
				if(msgKeyType.containsKeyColumn("getQtyLOT_NO") && key.getgetQtyLOT_NO() != null) {
					msgKey.setKeyValue("getQtyLOT_NO", key.getgetQtyLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("readTlotStock_LOT_NO") && key.getreadTlotStock_LOT_NO() != null) {
					msgKey.setKeyValue("readTlotStock_LOT_NO", key.getreadTlotStock_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("readTlotStock_STOCK_ON_HAND_QTY") && key.getreadTlotStock_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("readTlotStock_STOCK_ON_HAND_QTY", key.getreadTlotStock_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("readTlotStock_ALCD_QTY") && key.getreadTlotStock_ALCD_QTY() != null) {
					msgKey.setKeyValue("readTlotStock_ALCD_QTY", key.getreadTlotStock_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("readTlotStock_IN_ITEM_CD") && key.getreadTlotStock_IN_ITEM_CD() != null) {
					msgKey.setKeyValue("readTlotStock_IN_ITEM_CD", key.getreadTlotStock_IN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readTlotStock_IN_WH_CD") && key.getreadTlotStock_IN_WH_CD() != null) {
					msgKey.setKeyValue("readTlotStock_IN_WH_CD", key.getreadTlotStock_IN_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("readTlotStock_IN_LOT_NO") && key.getreadTlotStock_IN_LOT_NO() != null) {
					msgKey.setKeyValue("readTlotStock_IN_LOT_NO", key.getreadTlotStock_IN_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("upTlotStockSTOCK_ON_HAND_QTY") && key.getupTlotStockSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("upTlotStockSTOCK_ON_HAND_QTY", key.getupTlotStockSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("upTlotStockIN_ITEM_CD") && key.getupTlotStockIN_ITEM_CD() != null) {
					msgKey.setKeyValue("upTlotStockIN_ITEM_CD", key.getupTlotStockIN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("upTlotStockIN_WH_CD") && key.getupTlotStockIN_WH_CD() != null) {
					msgKey.setKeyValue("upTlotStockIN_WH_CD", key.getupTlotStockIN_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("upTlotStockIN_LOT_NO") && key.getupTlotStockIN_LOT_NO() != null) {
					msgKey.setKeyValue("upTlotStockIN_LOT_NO", key.getupTlotStockIN_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("serLotSTOCK_ON_HAND_QTY") && key.getserLotSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("serLotSTOCK_ON_HAND_QTY", key.getserLotSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("serLotALCD_QTY") && key.getserLotALCD_QTY() != null) {
					msgKey.setKeyValue("serLotALCD_QTY", key.getserLotALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("serLotIN_ITEM_CD") && key.getserLotIN_ITEM_CD() != null) {
					msgKey.setKeyValue("serLotIN_ITEM_CD", key.getserLotIN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("serLotIN_WH_CD") && key.getserLotIN_WH_CD() != null) {
					msgKey.setKeyValue("serLotIN_WH_CD", key.getserLotIN_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("serLotIN_LOT_NO") && key.getserLotIN_LOT_NO() != null) {
					msgKey.setKeyValue("serLotIN_LOT_NO", key.getserLotIN_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("insertLotStock_ITEM_CD") && key.getinsertLotStock_ITEM_CD() != null) {
					msgKey.setKeyValue("insertLotStock_ITEM_CD", key.getinsertLotStock_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("insertLotStock_WH_CD") && key.getinsertLotStock_WH_CD() != null) {
					msgKey.setKeyValue("insertLotStock_WH_CD", key.getinsertLotStock_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("insertLotStock_LOT_CD") && key.getinsertLotStock_LOT_CD() != null) {
					msgKey.setKeyValue("insertLotStock_LOT_CD", key.getinsertLotStock_LOT_CD());
				}
				if(msgKeyType.containsKeyColumn("insertLotStock_PLANT_CD") && key.getinsertLotStock_PLANT_CD() != null) {
					msgKey.setKeyValue("insertLotStock_PLANT_CD", key.getinsertLotStock_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("insertLotStock_STOCK_ON_HAND_QTY") && key.getinsertLotStock_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("insertLotStock_STOCK_ON_HAND_QTY", key.getinsertLotStock_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("insertLotStock_DEFECT_QTY") && key.getinsertLotStock_DEFECT_QTY() != null) {
					msgKey.setKeyValue("insertLotStock_DEFECT_QTY", key.getinsertLotStock_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("insertLotStock_ALCD_QTY") && key.getinsertLotStock_ALCD_QTY() != null) {
					msgKey.setKeyValue("insertLotStock_ALCD_QTY", key.getinsertLotStock_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("insTshipInst_SHIP_SEQ_NO") && key.getinsTshipInst_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("insTshipInst_SHIP_SEQ_NO", key.getinsTshipInst_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("insTshipInst_SHIP_ODR_NO") && key.getinsTshipInst_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("insTshipInst_SHIP_ODR_NO", key.getinsTshipInst_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("insTshipInst_LOT_NO") && key.getinsTshipInst_LOT_NO() != null) {
					msgKey.setKeyValue("insTshipInst_LOT_NO", key.getinsTshipInst_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("insTshipInst_ITEM_CD") && key.getinsTshipInst_ITEM_CD() != null) {
					msgKey.setKeyValue("insTshipInst_ITEM_CD", key.getinsTshipInst_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("insTshipInst_WH_CD") && key.getinsTshipInst_WH_CD() != null) {
					msgKey.setKeyValue("insTshipInst_WH_CD", key.getinsTshipInst_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("insTshipInst_ODR_NO") && key.getinsTshipInst_ODR_NO() != null) {
					msgKey.setKeyValue("insTshipInst_ODR_NO", key.getinsTshipInst_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("insTshipInst_SLIP_CD") && key.getinsTshipInst_SLIP_CD() != null) {
					msgKey.setKeyValue("insTshipInst_SLIP_CD", key.getinsTshipInst_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("insTshipInst_SHIP_QTY") && key.getinsTshipInst_SHIP_QTY() != null) {
					msgKey.setKeyValue("insTshipInst_SHIP_QTY", key.getinsTshipInst_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("insTshipInst_SHIP_DATE") && key.getinsTshipInst_SHIP_DATE() != null) {
					msgKey.setKeyValue("insTshipInst_SHIP_DATE", key.getinsTshipInst_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("delTshipInstIN_SHIP_SEQ_NO") && key.getdelTshipInstIN_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("delTshipInstIN_SHIP_SEQ_NO", key.getdelTshipInstIN_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("delTshipInstIN_LOT_NO") && key.getdelTshipInstIN_LOT_NO() != null) {
					msgKey.setKeyValue("delTshipInstIN_LOT_NO", key.getdelTshipInstIN_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("tlotTrace_FROM_ITEM_CD") && key.gettlotTrace_FROM_ITEM_CD() != null) {
					msgKey.setKeyValue("tlotTrace_FROM_ITEM_CD", key.gettlotTrace_FROM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tlotTrace_FROM_LOT_NO") && key.gettlotTrace_FROM_LOT_NO() != null) {
					msgKey.setKeyValue("tlotTrace_FROM_LOT_NO", key.gettlotTrace_FROM_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("tlotTrace_TO_ITEM_CD") && key.gettlotTrace_TO_ITEM_CD() != null) {
					msgKey.setKeyValue("tlotTrace_TO_ITEM_CD", key.gettlotTrace_TO_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tlotTrace_TO_LOT_NO") && key.gettlotTrace_TO_LOT_NO() != null) {
					msgKey.setKeyValue("tlotTrace_TO_LOT_NO", key.gettlotTrace_TO_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("tlotTrace_LOT_TRACE_TYP") && key.gettlotTrace_LOT_TRACE_TYP() != null) {
					msgKey.setKeyValue("tlotTrace_LOT_TRACE_TYP", key.gettlotTrace_LOT_TRACE_TYP());
				}
				if(msgKeyType.containsKeyColumn("tlotTrace_CUST_ODR_NO") && key.gettlotTrace_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("tlotTrace_CUST_ODR_NO", key.gettlotTrace_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("tlotTrace_SLIP_CD") && key.gettlotTrace_SLIP_CD() != null) {
					msgKey.setKeyValue("tlotTrace_SLIP_CD", key.gettlotTrace_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("tlotTrace_ODR_NO") && key.gettlotTrace_ODR_NO() != null) {
					msgKey.setKeyValue("tlotTrace_ODR_NO", key.gettlotTrace_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("readTshipInst_LOT_NO") && key.getreadTshipInst_LOT_NO() != null) {
					msgKey.setKeyValue("readTshipInst_LOT_NO", key.getreadTshipInst_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("readTshipInst_SHIP_QTY") && key.getreadTshipInst_SHIP_QTY() != null) {
					msgKey.setKeyValue("readTshipInst_SHIP_QTY", key.getreadTshipInst_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("readTshipInst_SHIP_ODR_NO") && key.getreadTshipInst_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("readTshipInst_SHIP_ODR_NO", key.getreadTshipInst_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("readTshipInst_ITEM_CD") && key.getreadTshipInst_ITEM_CD() != null) {
					msgKey.setKeyValue("readTshipInst_ITEM_CD", key.getreadTshipInst_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readTshipInst_WH_CD") && key.getreadTshipInst_WH_CD() != null) {
					msgKey.setKeyValue("readTshipInst_WH_CD", key.getreadTshipInst_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("readTshipInst_ODR_NO") && key.getreadTshipInst_ODR_NO() != null) {
					msgKey.setKeyValue("readTshipInst_ODR_NO", key.getreadTshipInst_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("readTshipInst_SLIP_CD") && key.getreadTshipInst_SLIP_CD() != null) {
					msgKey.setKeyValue("readTshipInst_SLIP_CD", key.getreadTshipInst_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("readTshipInst_SHIP_DATE") && key.getreadTshipInst_SHIP_DATE() != null) {
					msgKey.setKeyValue("readTshipInst_SHIP_DATE", key.getreadTshipInst_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("readTshipInst_IN_SHIP_SEQ_NO") && key.getreadTshipInst_IN_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("readTshipInst_IN_SHIP_SEQ_NO", key.getreadTshipInst_IN_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("readTshipInst_IN_LOT_NO") && key.getreadTshipInst_IN_LOT_NO() != null) {
					msgKey.setKeyValue("readTshipInst_IN_LOT_NO", key.getreadTshipInst_IN_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("readT_Ship_Inst_Lot_NO") && key.getreadT_Ship_Inst_Lot_NO() != null) {
					msgKey.setKeyValue("readT_Ship_Inst_Lot_NO", key.getreadT_Ship_Inst_Lot_NO());
				}
				if(msgKeyType.containsKeyColumn("readT_Ship_Inst_Ship_Seq_NO") && key.getreadT_Ship_Inst_Ship_Seq_NO() != null) {
					msgKey.setKeyValue("readT_Ship_Inst_Ship_Seq_NO", key.getreadT_Ship_Inst_Ship_Seq_NO());
				}
				if(msgKeyType.containsKeyColumn("strOdrCurrncyCd") && key.getstrOdrCurrncyCd() != null) {
					msgKey.setKeyValue("strOdrCurrncyCd", key.getstrOdrCurrncyCd());
				}
				if(msgKeyType.containsKeyColumn("strExchTyp") && key.getstrExchTyp() != null) {
					msgKey.setKeyValue("strExchTyp", key.getstrExchTyp());
				}
				if(msgKeyType.containsKeyColumn("g_DATE") && key.getg_DATE() != null) {
					msgKey.setKeyValue("g_DATE", key.getg_DATE());
				}
				if(msgKeyType.containsKeyColumn("selTShipOdr_MODIFY_COUNT") && key.getselTShipOdr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("selTShipOdr_MODIFY_COUNT", key.getselTShipOdr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT") && key.getSEL_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SEL_MODIFY_COUNT", key.getSEL_MODIFY_COUNT());
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
					KU0030010Struct key = new KU0030010Struct();
					if(msgKeyType.containsKeyColumn("k_MODE")) {
						key.setk_MODE(msgKey.getKeyValue("k_MODE"));
					}
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN")) {
						key.setr_SEL_PTN(msgKey.getKeyValue("r_SEL_PTN"));
					}
					if(msgKeyType.containsKeyColumn("g_DESINATED_SHIP_DATE")) {
						key.setg_DESINATED_SHIP_DATE(msgKey.getKeyValue("g_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("g_SHIP_QTY")) {
						key.setg_SHIP_QTY(msgKey.getKeyValue("g_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("g_SHIP_QTY2")) {
						key.setg_SHIP_QTY2(msgKey.getKeyValue("g_SHIP_QTY2"));
					}
					if(msgKeyType.containsKeyColumn("g_UNIT_PRICE")) {
						key.setg_UNIT_PRICE(msgKey.getKeyValue("g_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("g_CURRNCY")) {
						key.setg_CURRNCY(msgKey.getKeyValue("g_CURRNCY"));
					}
					if(msgKeyType.containsKeyColumn("g_SHIP_ODR_AMOUNT")) {
						key.setg_SHIP_ODR_AMOUNT(msgKey.getKeyValue("g_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("g_WH_CD")) {
						key.setg_WH_CD(msgKey.getKeyValue("g_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("g_REMARKS")) {
						key.setg_REMARKS(msgKey.getKeyValue("g_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("g_CUST_ANAME")) {
						key.setg_CUST_ANAME(msgKey.getKeyValue("g_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("g_ITEM_CD")) {
						key.setg_ITEM_CD(msgKey.getKeyValue("g_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_AP_SECRTY_TYP")) {
						key.seth_AP_SECRTY_TYP(msgKey.getKeyValue("h_AP_SECRTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_SHIP_QTY")) {
						key.seth_SHIP_QTY(msgKey.getKeyValue("h_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_GYOMU_DATE")) {
						key.seth_GYOMU_DATE(msgKey.getKeyValue("h_GYOMU_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_EXCH_TYP")) {
						key.seth_EXCH_TYP(msgKey.getKeyValue("h_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MODFIY_CNT")) {
						key.seth_MODFIY_CNT(msgKey.getKeyValue("h_MODFIY_CNT"));
					}
					if(msgKeyType.containsKeyColumn("h_TOTAL_SHIP_QTY")) {
						key.seth_TOTAL_SHIP_QTY(msgKey.getKeyValue("h_TOTAL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("m_selRadio")) {
						key.setm_selRadio(msgKey.getKeyValue("m_selRadio"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN1")) {
						key.setr_SEL_PTN1(msgKey.getKeyValue("r_SEL_PTN1"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN2")) {
						key.setr_SEL_PTN2(msgKey.getKeyValue("r_SEL_PTN2"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN3")) {
						key.setr_SEL_PTN3(msgKey.getKeyValue("r_SEL_PTN3"));
					}
					if(msgKeyType.containsKeyColumn("h_SELECT_FG")) {
						key.seth_SELECT_FG(msgKey.getKeyValue("h_SELECT_FG"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_PRICE")) {
						key.seth_UNIT_PRICE(msgKey.getKeyValue("h_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("g_STOCK_UNIT")) {
						key.setg_STOCK_UNIT(msgKey.getKeyValue("g_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("g_STOCK_UNIT2")) {
						key.setg_STOCK_UNIT2(msgKey.getKeyValue("g_STOCK_UNIT2"));
					}
					if(msgKeyType.containsKeyColumn("g_CUR_UNIT2")) {
						key.setg_CUR_UNIT2(msgKey.getKeyValue("g_CUR_UNIT2"));
					}
					if(msgKeyType.containsKeyColumn("g_WH_NAME")) {
						key.setg_WH_NAME(msgKey.getKeyValue("g_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("g_SALES_DEPT_CD")) {
						key.setg_SALES_DEPT_CD(msgKey.getKeyValue("g_SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("g_ORG_NAME")) {
						key.setg_ORG_NAME(msgKey.getKeyValue("g_ORG_NAME"));
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
					if(msgKeyType.containsKeyColumn("g_ODR_NO")) {
						key.setg_ODR_NO(msgKey.getKeyValue("g_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("g_PART_DLV_SEQ_NO")) {
						key.setg_PART_DLV_SEQ_NO(msgKey.getKeyValue("g_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("g_SHIP_ODR_NO")) {
						key.setg_SHIP_ODR_NO(msgKey.getKeyValue("g_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_DATE")) {
						key.seth_DATE(msgKey.getKeyValue("h_DATE"));
					}
					if(msgKeyType.containsKeyColumn("g_JOB_ODR_CD")) {
						key.setg_JOB_ODR_CD(msgKey.getKeyValue("g_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD")) {
						key.setc_JOB_ODR_CD(msgKey.getKeyValue("c_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("g_DIRECT_DLV_FLG")) {
						key.setg_DIRECT_DLV_FLG(msgKey.getKeyValue("g_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("g_STOCK_LOT_CD")) {
						key.setg_STOCK_LOT_CD(msgKey.getKeyValue("g_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_STOCK_LOT_CD")) {
						key.seth_STOCK_LOT_CD(msgKey.getKeyValue("h_STOCK_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("param1")) {
						key.setparam1(msgKey.getKeyValue("param1"));
					}
					if(msgKeyType.containsKeyColumn("param2")) {
						key.setparam2(msgKey.getKeyValue("param2"));
					}
					if(msgKeyType.containsKeyColumn("param3")) {
						key.setparam3(msgKey.getKeyValue("param3"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_FIG")) {
						key.setUNIT_FIG(msgKey.getKeyValue("UNIT_FIG"));
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
					if(msgKeyType.containsKeyColumn("strORG_CD")) {
						key.setstrORG_CD(msgKey.getKeyValue("strORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("strORG_NAME")) {
						key.setstrORG_NAME(msgKey.getKeyValue("strORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strORG_ANAME")) {
						key.setstrORG_ANAME(msgKey.getKeyValue("strORG_ANAME"));
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
					if(msgKeyType.containsKeyColumn("serTori_SHIP_SEQ_NO")) {
						key.setserTori_SHIP_SEQ_NO(msgKey.getKeyValue("serTori_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("serTori_SHIP_ODR_NO")) {
						key.setserTori_SHIP_ODR_NO(msgKey.getKeyValue("serTori_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("serTori_SLIP_CD")) {
						key.setserTori_SLIP_CD(msgKey.getKeyValue("serTori_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_ODR_NO")) {
						key.setserTori_ODR_NO(msgKey.getKeyValue("serTori_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("serTori_PART_DLV_SEQ_NO")) {
						key.setserTori_PART_DLV_SEQ_NO(msgKey.getKeyValue("serTori_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("serTori_ORGNAL_SLIP_CD")) {
						key.setserTori_ORGNAL_SLIP_CD(msgKey.getKeyValue("serTori_ORGNAL_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_SLIP_TRN_CD")) {
						key.setserTori_SLIP_TRN_CD(msgKey.getKeyValue("serTori_SLIP_TRN_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_ITEM_CD")) {
						key.setserTori_ITEM_CD(msgKey.getKeyValue("serTori_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_JOB_ODR_CD")) {
						key.setserTori_JOB_ODR_CD(msgKey.getKeyValue("serTori_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_CUST_ITEM_CD")) {
						key.setserTori_CUST_ITEM_CD(msgKey.getKeyValue("serTori_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_CUST_ODR_NO")) {
						key.setserTori_CUST_ODR_NO(msgKey.getKeyValue("serTori_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("serTori_CUST_CD")) {
						key.setserTori_CUST_CD(msgKey.getKeyValue("serTori_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_CUST_NAME")) {
						key.setserTori_CUST_NAME(msgKey.getKeyValue("serTori_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("serTori_CUST_CHRG_PSN_CD")) {
						key.setserTori_CUST_CHRG_PSN_CD(msgKey.getKeyValue("serTori_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_SHIP_ODR_ISS_PSN_CD")) {
						key.setserTori_SHIP_ODR_ISS_PSN_CD(msgKey.getKeyValue("serTori_SHIP_ODR_ISS_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_DLV_LOC_CD")) {
						key.setserTori_DLV_LOC_CD(msgKey.getKeyValue("serTori_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_DEPO_TYP")) {
						key.setserTori_DEPO_TYP(msgKey.getKeyValue("serTori_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("serTori_ALLCT_WH_CD")) {
						key.setserTori_ALLCT_WH_CD(msgKey.getKeyValue("serTori_ALLCT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_DEPO_WH_CD")) {
						key.setserTori_DEPO_WH_CD(msgKey.getKeyValue("serTori_DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_LOC_CD")) {
						key.setserTori_LOC_CD(msgKey.getKeyValue("serTori_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_SHIP_DATE")) {
						key.setserTori_SHIP_DATE(msgKey.getKeyValue("serTori_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("serTori_SHIP_QTY")) {
						key.setserTori_SHIP_QTY(msgKey.getKeyValue("serTori_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serTori_UNIT_CD")) {
						key.setserTori_UNIT_CD(msgKey.getKeyValue("serTori_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_SHIP_UNIT_PRICE")) {
						key.setserTori_SHIP_UNIT_PRICE(msgKey.getKeyValue("serTori_SHIP_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("serTori_SHIP_ODR_AMOUNT")) {
						key.setserTori_SHIP_ODR_AMOUNT(msgKey.getKeyValue("serTori_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTori_SHIP_ODR_AMOUNT_EXCH_RATES")) {
						key.setserTori_SHIP_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("serTori_SHIP_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("serTori_CURRNCY_CD")) {
						key.setserTori_CURRNCY_CD(msgKey.getKeyValue("serTori_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTori_DIRECT_DLV_FLG")) {
						key.setserTori_DIRECT_DLV_FLG(msgKey.getKeyValue("serTori_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("serTori_SHIP_INFO_IF_CTRL_NO")) {
						key.setserTori_SHIP_INFO_IF_CTRL_NO(msgKey.getKeyValue("serTori_SHIP_INFO_IF_CTRL_NO"));
					}
					if(msgKeyType.containsKeyColumn("serTori_INSPC_ACPT_INFO_IF_CTRL_NO")) {
						key.setserTori_INSPC_ACPT_INFO_IF_CTRL_NO(msgKey.getKeyValue("serTori_INSPC_ACPT_INFO_IF_CTRL_NO"));
					}
					if(msgKeyType.containsKeyColumn("serTori_DLV_KEY_NO")) {
						key.setserTori_DLV_KEY_NO(msgKey.getKeyValue("serTori_DLV_KEY_NO"));
					}
					if(msgKeyType.containsKeyColumn("serTori_DEL_FLG")) {
						key.setserTori_DEL_FLG(msgKey.getKeyValue("serTori_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("serTori_CUR_NAME")) {
						key.setserTori_CUR_NAME(msgKey.getKeyValue("serTori_CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("serTori_EXCH_TYP")) {
						key.setserTori_EXCH_TYP(msgKey.getKeyValue("serTori_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("serTori_MODIFY_COUNT")) {
						key.setserTori_MODIFY_COUNT(msgKey.getKeyValue("serTori_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTori_RETURN_QTY")) {
						key.setserTori_RETURN_QTY(msgKey.getKeyValue("serTori_RETURN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serTori_TOTAL_SHIP_QTY")) {
						key.setserTori_TOTAL_SHIP_QTY(msgKey.getKeyValue("serTori_TOTAL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serTori_STATUS")) {
						key.setserTori_STATUS(msgKey.getKeyValue("serTori_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("serTori_INSPC_ACPT_TYP")) {
						key.setserTori_INSPC_ACPT_TYP(msgKey.getKeyValue("serTori_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("serToriSALES_DEPT_CD")) {
						key.setserToriSALES_DEPT_CD(msgKey.getKeyValue("serToriSALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("serToriSALES_DATE")) {
						key.setserToriSALES_DATE(msgKey.getKeyValue("serToriSALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP")) {
						key.seth_MRP_ODR_TYP(msgKey.getKeyValue("h_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG")) {
						key.seth_LOT_CTRL_FLG(msgKey.getKeyValue("h_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("serTodrMODIFY_COUNT")) {
						key.setserTodrMODIFY_COUNT(msgKey.getKeyValue("serTodrMODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTori_IN_SLIPCD")) {
						key.setserTori_IN_SLIPCD(msgKey.getKeyValue("serTori_IN_SLIPCD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_SHIP_SEQ_NO")) {
						key.setcreTship_SHIP_SEQ_NO(msgKey.getKeyValue("creTship_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTship_SHIP_ODR_NO")) {
						key.setcreTship_SHIP_ODR_NO(msgKey.getKeyValue("creTship_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTship_SLIP_CD")) {
						key.setcreTship_SLIP_CD(msgKey.getKeyValue("creTship_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_ODR_NO")) {
						key.setcreTship_ODR_NO(msgKey.getKeyValue("creTship_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTship_PART_DLV_SEQ_NO")) {
						key.setcreTship_PART_DLV_SEQ_NO(msgKey.getKeyValue("creTship_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTship_ORGNAL_SLIP_CD")) {
						key.setcreTship_ORGNAL_SLIP_CD(msgKey.getKeyValue("creTship_ORGNAL_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_SLIP_TRN_CD")) {
						key.setcreTship_SLIP_TRN_CD(msgKey.getKeyValue("creTship_SLIP_TRN_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_ITEM_CD")) {
						key.setcreTship_ITEM_CD(msgKey.getKeyValue("creTship_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_JOB_ODR_CD")) {
						key.setcreTship_JOB_ODR_CD(msgKey.getKeyValue("creTship_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_CUST_ITEM_CD")) {
						key.setcreTship_CUST_ITEM_CD(msgKey.getKeyValue("creTship_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_CUST_ODR_NO")) {
						key.setcreTship_CUST_ODR_NO(msgKey.getKeyValue("creTship_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTship_CUST_CD")) {
						key.setcreTship_CUST_CD(msgKey.getKeyValue("creTship_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_CUST_NAME")) {
						key.setcreTship_CUST_NAME(msgKey.getKeyValue("creTship_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("creTship_CUST_CHRG_PSN_CD")) {
						key.setcreTship_CUST_CHRG_PSN_CD(msgKey.getKeyValue("creTship_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_SHIP_ODR_ISS_PSN_CD")) {
						key.setcreTship_SHIP_ODR_ISS_PSN_CD(msgKey.getKeyValue("creTship_SHIP_ODR_ISS_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_DLV_LOC_CD")) {
						key.setcreTship_DLV_LOC_CD(msgKey.getKeyValue("creTship_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_DEPO_TYP")) {
						key.setcreTship_DEPO_TYP(msgKey.getKeyValue("creTship_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("creTship_ALLCT_WH_CD")) {
						key.setcreTship_ALLCT_WH_CD(msgKey.getKeyValue("creTship_ALLCT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_DEPO_WH_CD")) {
						key.setcreTship_DEPO_WH_CD(msgKey.getKeyValue("creTship_DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_LOC_CD")) {
						key.setcreTship_LOC_CD(msgKey.getKeyValue("creTship_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_SHIP_DATE")) {
						key.setcreTship_SHIP_DATE(msgKey.getKeyValue("creTship_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("creTship_SHIP_QTY")) {
						key.setcreTship_SHIP_QTY(msgKey.getKeyValue("creTship_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTship_UNIT_CD")) {
						key.setcreTship_UNIT_CD(msgKey.getKeyValue("creTship_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_SHIP_UNIT_PRICE")) {
						key.setcreTship_SHIP_UNIT_PRICE(msgKey.getKeyValue("creTship_SHIP_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("creTship_SHIP_ODR_AMOUNT")) {
						key.setcreTship_SHIP_ODR_AMOUNT(msgKey.getKeyValue("creTship_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTship_SHIP_ODR_AMOUNT_EXCH_RATES")) {
						key.setcreTship_SHIP_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("creTship_SHIP_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("creTship_CURRNCY_CD")) {
						key.setcreTship_CURRNCY_CD(msgKey.getKeyValue("creTship_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTship_DIRECT_DLV_FLG")) {
						key.setcreTship_DIRECT_DLV_FLG(msgKey.getKeyValue("creTship_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("creTship_DLV_KEY_NO")) {
						key.setcreTship_DLV_KEY_NO(msgKey.getKeyValue("creTship_DLV_KEY_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTship_REMARKS")) {
						key.setcreTship_REMARKS(msgKey.getKeyValue("creTship_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("creTship_DEL_FLG")) {
						key.setcreTship_DEL_FLG(msgKey.getKeyValue("creTship_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("updTship_SHIP_SEQ_NO")) {
						key.setupdTship_SHIP_SEQ_NO(msgKey.getKeyValue("updTship_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_SHIP_ODR_NO")) {
						key.setserInsert_SHIP_ODR_NO(msgKey.getKeyValue("serInsert_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_ODR_NO")) {
						key.setserInsert_ODR_NO(msgKey.getKeyValue("serInsert_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_PART_DLV_SEQ_NO")) {
						key.setserInsert_PART_DLV_SEQ_NO(msgKey.getKeyValue("serInsert_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_SLIP_CD")) {
						key.setserInsert_SLIP_CD(msgKey.getKeyValue("serInsert_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_ITEM_CD")) {
						key.setserInsert_ITEM_CD(msgKey.getKeyValue("serInsert_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_JOB_ODR_CD")) {
						key.setserInsert_JOB_ODR_CD(msgKey.getKeyValue("serInsert_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_CUST_ITEM_CD")) {
						key.setserInsert_CUST_ITEM_CD(msgKey.getKeyValue("serInsert_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_CUST_ODR_NO")) {
						key.setserInsert_CUST_ODR_NO(msgKey.getKeyValue("serInsert_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_CUST_CD")) {
						key.setserInsert_CUST_CD(msgKey.getKeyValue("serInsert_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_CUST_NAME")) {
						key.setserInsert_CUST_NAME(msgKey.getKeyValue("serInsert_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_CUST_CHRG_PSN_CD")) {
						key.setserInsert_CUST_CHRG_PSN_CD(msgKey.getKeyValue("serInsert_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_SHIP_ODR_ISS_PSN_CD")) {
						key.setserInsert_SHIP_ODR_ISS_PSN_CD(msgKey.getKeyValue("serInsert_SHIP_ODR_ISS_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_DLV_LOC_CD")) {
						key.setserInsert_DLV_LOC_CD(msgKey.getKeyValue("serInsert_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_DEPO_TYP")) {
						key.setserInsert_DEPO_TYP(msgKey.getKeyValue("serInsert_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_DESINATED_SHIP_DATE")) {
						key.setserInsert_DESINATED_SHIP_DATE(msgKey.getKeyValue("serInsert_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_SHIP_QTY")) {
						key.setserInsert_SHIP_QTY(msgKey.getKeyValue("serInsert_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_TOTAL_SHIP_QTY")) {
						key.setserInsert_TOTAL_SHIP_QTY(msgKey.getKeyValue("serInsert_TOTAL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_UNIT_CD")) {
						key.setserInsert_UNIT_CD(msgKey.getKeyValue("serInsert_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_UNIT_PRICE")) {
						key.setserInsert_UNIT_PRICE(msgKey.getKeyValue("serInsert_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_SHIP_ODR_AMOUNT")) {
						key.setserInsert_SHIP_ODR_AMOUNT(msgKey.getKeyValue("serInsert_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_SHIP_ODR_AMOUNT_EXCH_RATES")) {
						key.setserInsert_SHIP_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("serInsert_SHIP_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_CURRNCY_CD")) {
						key.setserInsert_CURRNCY_CD(msgKey.getKeyValue("serInsert_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_LOC_CD")) {
						key.setserInsert_LOC_CD(msgKey.getKeyValue("serInsert_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_PKG_UNIT_QTY")) {
						key.setserInsert_PKG_UNIT_QTY(msgKey.getKeyValue("serInsert_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_REMARKS")) {
						key.setserInsert_REMARKS(msgKey.getKeyValue("serInsert_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_TRANSPORT_CD")) {
						key.setserInsert_TRANSPORT_CD(msgKey.getKeyValue("serInsert_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_TRANSPORT_TYP")) {
						key.setserInsert_TRANSPORT_TYP(msgKey.getKeyValue("serInsert_TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_ALLCT_WH_CD")) {
						key.setserInsert_ALLCT_WH_CD(msgKey.getKeyValue("serInsert_ALLCT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_TRANSFER_WH_CD")) {
						key.setserInsert_TRANSFER_WH_CD(msgKey.getKeyValue("serInsert_TRANSFER_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_DIRECT_DLV_FLG")) {
						key.setserInsert_DIRECT_DLV_FLG(msgKey.getKeyValue("serInsert_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_ENTRY_TYP")) {
						key.setserInsert_ENTRY_TYP(msgKey.getKeyValue("serInsert_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_PRINT_FLG")) {
						key.setserInsert_PRINT_FLG(msgKey.getKeyValue("serInsert_PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_SHP_CMPLT_FLG")) {
						key.setserInsert_SHP_CMPLT_FLG(msgKey.getKeyValue("serInsert_SHP_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_DEPO_TRANSFER_PROC_FLG")) {
						key.setserInsert_DEPO_TRANSFER_PROC_FLG(msgKey.getKeyValue("serInsert_DEPO_TRANSFER_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_DEL_FLG")) {
						key.setserInsert_DEL_FLG(msgKey.getKeyValue("serInsert_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_CUR_CD")) {
						key.setserInsert_CUR_CD(msgKey.getKeyValue("serInsert_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_CUR_NAME")) {
						key.setserInsert_CUR_NAME(msgKey.getKeyValue("serInsert_CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_EXCH_TYP")) {
						key.setserInsert_EXCH_TYP(msgKey.getKeyValue("serInsert_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_SPCL_PRICE_TYP")) {
						key.setserInsert_SPCL_PRICE_TYP(msgKey.getKeyValue("serInsert_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_MODIFY_COUNT")) {
						key.setserInsert_MODIFY_COUNT(msgKey.getKeyValue("serInsert_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_SCDL_DLV_DATE")) {
						key.setserInsert_SCDL_DLV_DATE(msgKey.getKeyValue("serInsert_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_DLV_KEY_NO")) {
						key.setserInsert_DLV_KEY_NO(msgKey.getKeyValue("serInsert_DLV_KEY_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_RETURN_QTY")) {
						key.seth_RETURN_QTY(msgKey.getKeyValue("h_RETURN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_ODR_ACPT_DATE")) {
						key.setserInsert_ODR_ACPT_DATE(msgKey.getKeyValue("serInsert_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("selMODIFY_COUNT")) {
						key.setselMODIFY_COUNT(msgKey.getKeyValue("selMODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("serInsert_IN_SLIPCD")) {
						key.setserInsert_IN_SLIPCD(msgKey.getKeyValue("serInsert_IN_SLIPCD"));
					}
					if(msgKeyType.containsKeyColumn("upTshipOdr_DEPO_TRANSFER_PROC_FLG")) {
						key.setupTshipOdr_DEPO_TRANSFER_PROC_FLG(msgKey.getKeyValue("upTshipOdr_DEPO_TRANSFER_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("upTshipOdr_IN_SLIPCD")) {
						key.setupTshipOdr_IN_SLIPCD(msgKey.getKeyValue("upTshipOdr_IN_SLIPCD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_WH_CD")) {
						key.setchkisWhCd_WH_CD(msgKey.getKeyValue("chkisWhCd_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_WH_TYP")) {
						key.setchkisWhCd_WH_TYP(msgKey.getKeyValue("chkisWhCd_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_NAME")) {
						key.setchkisinWhCd_WH_NAME(msgKey.getKeyValue("chkisinWhCd_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_IN_WHCD")) {
						key.setchkisWhCd_IN_WHCD(msgKey.getKeyValue("chkisWhCd_IN_WHCD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_IN_WHTYP")) {
						key.setchkisWhCd_IN_WHTYP(msgKey.getKeyValue("chkisWhCd_IN_WHTYP"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_SHIP_ODR_NO")) {
						key.setcreTsales_SHIP_ODR_NO(msgKey.getKeyValue("creTsales_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_SLIP_CD")) {
						key.setcreTsales_SLIP_CD(msgKey.getKeyValue("creTsales_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_SALES_TYP")) {
						key.setcreTsales_SALES_TYP(msgKey.getKeyValue("creTsales_SALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_CUST_CD")) {
						key.setcreTsales_CUST_CD(msgKey.getKeyValue("creTsales_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_ITEM_CD")) {
						key.setcreTsales_ITEM_CD(msgKey.getKeyValue("creTsales_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_ITEM_NAME")) {
						key.setcreTsales_ITEM_NAME(msgKey.getKeyValue("creTsales_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_CUST_ODR_NO")) {
						key.setcreTsales_CUST_ODR_NO(msgKey.getKeyValue("creTsales_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_SALES_DATE")) {
						key.setcreTsales_SALES_DATE(msgKey.getKeyValue("creTsales_SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_SALES_DEPT_CD")) {
						key.setcreTsales_SALES_DEPT_CD(msgKey.getKeyValue("creTsales_SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_CUST_CHRG_PSN_CD")) {
						key.setcreTsales_CUST_CHRG_PSN_CD(msgKey.getKeyValue("creTsales_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_ODR_ACPT_PSN_CD")) {
						key.setcreTsales_ODR_ACPT_PSN_CD(msgKey.getKeyValue("creTsales_ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_SALES_QTY")) {
						key.setcreTsales_SALES_QTY(msgKey.getKeyValue("creTsales_SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_SALES_UNIT_PRICE")) {
						key.setcreTsales_SALES_UNIT_PRICE(msgKey.getKeyValue("creTsales_SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_UNIT_CD")) {
						key.setcreTsales_UNIT_CD(msgKey.getKeyValue("creTsales_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_SALES_AMOUNT")) {
						key.setcreTsales_SALES_AMOUNT(msgKey.getKeyValue("creTsales_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_SALES_AMOUNT_EXCH_RATES")) {
						key.setcreTsales_SALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("creTsales_SALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_INSPC_ACPT_DATE")) {
						key.setcreTsales_INSPC_ACPT_DATE(msgKey.getKeyValue("creTsales_INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_INSPC_ACPT_QTY")) {
						key.setcreTsales_INSPC_ACPT_QTY(msgKey.getKeyValue("creTsales_INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setcreTsales_EXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("creTsales_EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_INTERNAL_TAX_SALES_AMOUNT")) {
						key.setcreTsales_INTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("creTsales_INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_TAXFREE_SALES_AMOUNT")) {
						key.setcreTsales_TAXFREE_SALES_AMOUNT(msgKey.getKeyValue("creTsales_TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_TAX_CREDIT_SALES_AMOUNT")) {
						key.setcreTsales_TAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("creTsales_TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_EXTERNAL_TAX_AMOUNT")) {
						key.setcreTsales_EXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("creTsales_EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_INTERNAL_TAX_AMOUNT")) {
						key.setcreTsales_INTERNAL_TAX_AMOUNT(msgKey.getKeyValue("creTsales_INTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_TAX_AMOUNT_1")) {
						key.setcreTsales_TAX_AMOUNT_1(msgKey.getKeyValue("creTsales_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_TAX_AMOUNT_2")) {
						key.setcreTsales_TAX_AMOUNT_2(msgKey.getKeyValue("creTsales_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_TAX_AMOUNT_3")) {
						key.setcreTsales_TAX_AMOUNT_3(msgKey.getKeyValue("creTsales_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setcreTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("creTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_ORG_SLIP_CD")) {
						key.setcreTsales_ORG_SLIP_CD(msgKey.getKeyValue("creTsales_ORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_CURRNCY_CD")) {
						key.setcreTsales_CURRNCY_CD(msgKey.getKeyValue("creTsales_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_SPCL_PRICE_CO")) {
						key.setcreTsales_SPCL_PRICE_CO(msgKey.getKeyValue("creTsales_SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_REMARKS")) {
						key.setcreTsales_REMARKS(msgKey.getKeyValue("creTsales_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_DEL_FLG")) {
						key.setcreTsales_DEL_FLG(msgKey.getKeyValue("creTsales_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_INSPC_ACPT_TYP")) {
						key.setcreTsales_INSPC_ACPT_TYP(msgKey.getKeyValue("creTsales_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_STATUS")) {
						key.setcreTsales_STATUS(msgKey.getKeyValue("creTsales_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_APPR_FLG")) {
						key.setcreTsales_APPR_FLG(msgKey.getKeyValue("creTsales_APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_APPR_ID")) {
						key.setcreTsales_APPR_ID(msgKey.getKeyValue("creTsales_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_APPR_DATE")) {
						key.setcreTsales_APPR_DATE(msgKey.getKeyValue("creTsales_APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("creTsales_EXCH_RATE")) {
						key.setcreTsales_EXCH_RATE(msgKey.getKeyValue("creTsales_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_SALES_SEQ_NO")) {
						key.setserTsales_SALES_SEQ_NO(msgKey.getKeyValue("serTsales_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_SLIP_CD")) {
						key.setserTsales_SLIP_CD(msgKey.getKeyValue("serTsales_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_SALES_TYP")) {
						key.setserTsales_SALES_TYP(msgKey.getKeyValue("serTsales_SALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_CUST_CD")) {
						key.setserTsales_CUST_CD(msgKey.getKeyValue("serTsales_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_ITEM_CD")) {
						key.setserTsales_ITEM_CD(msgKey.getKeyValue("serTsales_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_ITEM_NAME")) {
						key.setserTsales_ITEM_NAME(msgKey.getKeyValue("serTsales_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_CUST_ODR_NO")) {
						key.setserTsales_CUST_ODR_NO(msgKey.getKeyValue("serTsales_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_SALES_DATE")) {
						key.setserTsales_SALES_DATE(msgKey.getKeyValue("serTsales_SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_SALES_DEPT_CD")) {
						key.setserTsales_SALES_DEPT_CD(msgKey.getKeyValue("serTsales_SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_CUST_CHRG_PSN_CD")) {
						key.setserTsales_CUST_CHRG_PSN_CD(msgKey.getKeyValue("serTsales_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_ODR_ACPT_PSN_CD")) {
						key.setserTsales_ODR_ACPT_PSN_CD(msgKey.getKeyValue("serTsales_ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_SALES_QTY")) {
						key.setserTsales_SALES_QTY(msgKey.getKeyValue("serTsales_SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_SALES_UNIT_PRICE")) {
						key.setserTsales_SALES_UNIT_PRICE(msgKey.getKeyValue("serTsales_SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_UNIT_CD")) {
						key.setserTsales_UNIT_CD(msgKey.getKeyValue("serTsales_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_SALES_AMOUNT")) {
						key.setserTsales_SALES_AMOUNT(msgKey.getKeyValue("serTsales_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_SALES_AMOUNT_EXCH_RATES")) {
						key.setserTsales_SALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("serTsales_SALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setserTsales_EXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("serTsales_EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_INTERNAL_TAX_SALES_AMOUNT")) {
						key.setserTsales_INTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("serTsales_INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_TAXFREE_SALES_AMOUNT")) {
						key.setserTsales_TAXFREE_SALES_AMOUNT(msgKey.getKeyValue("serTsales_TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_TAX_CREDIT_SALES_AMOUNT")) {
						key.setserTsales_TAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("serTsales_TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_EXTERNAL_TAX_AMOUNT")) {
						key.setserTsales_EXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("serTsales_EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_INTERNAL_TAX_AMOUNT")) {
						key.setserTsales_INTERNAL_TAX_AMOUNT(msgKey.getKeyValue("serTsales_INTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_TAX_AMOUNT_1")) {
						key.setserTsales_TAX_AMOUNT_1(msgKey.getKeyValue("serTsales_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_TAX_AMOUNT_2")) {
						key.setserTsales_TAX_AMOUNT_2(msgKey.getKeyValue("serTsales_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_TAX_AMOUNT_3")) {
						key.setserTsales_TAX_AMOUNT_3(msgKey.getKeyValue("serTsales_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setserTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("serTsales_OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_ORG_SLIP_CD")) {
						key.setserTsales_ORG_SLIP_CD(msgKey.getKeyValue("serTsales_ORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_CURRNCY_CD")) {
						key.setserTsales_CURRNCY_CD(msgKey.getKeyValue("serTsales_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_SPCL_PRICE_CO")) {
						key.setserTsales_SPCL_PRICE_CO(msgKey.getKeyValue("serTsales_SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_REMARKS")) {
						key.setserTsales_REMARKS(msgKey.getKeyValue("serTsales_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_DEL_FLG")) {
						key.setserTsales_DEL_FLG(msgKey.getKeyValue("serTsales_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_INSPC_ACPT_TYP")) {
						key.setserTsales_INSPC_ACPT_TYP(msgKey.getKeyValue("serTsales_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_STATUS")) {
						key.setserTsales_STATUS(msgKey.getKeyValue("serTsales_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_PRD_ODR_PLACE_CD")) {
						key.setserTsales_PRD_ODR_PLACE_CD(msgKey.getKeyValue("serTsales_PRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_EXCH_RATE")) {
						key.setserTsales_EXCH_RATE(msgKey.getKeyValue("serTsales_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("serTsales_IN_SLIPCD")) {
						key.setserTsales_IN_SLIPCD(msgKey.getKeyValue("serTsales_IN_SLIPCD"));
					}
					if(msgKeyType.containsKeyColumn("updTsales_APPR_FLG")) {
						key.setupdTsales_APPR_FLG(msgKey.getKeyValue("updTsales_APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("updTsales_APPR_ID")) {
						key.setupdTsales_APPR_ID(msgKey.getKeyValue("updTsales_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("updTsales_APPR_DATE")) {
						key.setupdTsales_APPR_DATE(msgKey.getKeyValue("updTsales_APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("updTsales_SALES_SEQ_NO")) {
						key.setupdTsales_SALES_SEQ_NO(msgKey.getKeyValue("updTsales_SALES_SEQ_NO"));
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
					if(msgKeyType.containsKeyColumn("mItemSpec_CUST_CD")) {
						key.setmItemSpec_CUST_CD(msgKey.getKeyValue("mItemSpec_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItemSpec_CUST_ITEM_CD")) {
						key.setmItemSpec_CUST_ITEM_CD(msgKey.getKeyValue("mItemSpec_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItemSpec_COMPANY_CD")) {
						key.setmItemSpec_COMPANY_CD(msgKey.getKeyValue("mItemSpec_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItemSpec_SALES_DEPT_CD")) {
						key.setmItemSpec_SALES_DEPT_CD(msgKey.getKeyValue("mItemSpec_SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItemSpec_CUST_ITEM_NAME")) {
						key.setmItemSpec_CUST_ITEM_NAME(msgKey.getKeyValue("mItemSpec_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mItemSpec_IN_CUST_CD")) {
						key.setmItemSpec_IN_CUST_CD(msgKey.getKeyValue("mItemSpec_IN_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItemSpec_IN_CUST_ITEM_CD")) {
						key.setmItemSpec_IN_CUST_ITEM_CD(msgKey.getKeyValue("mItemSpec_IN_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItemSpec_IN_COMPANY_CD")) {
						key.setmItemSpec_IN_COMPANY_CD(msgKey.getKeyValue("mItemSpec_IN_COMPANY_CD"));
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
					if(msgKeyType.containsKeyColumn("tOdr_ODR_UNIT_PRICE")) {
						key.settOdr_ODR_UNIT_PRICE(msgKey.getKeyValue("tOdr_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SPCL_PRICE_TYP")) {
						key.settOdr_SPCL_PRICE_TYP(msgKey.getKeyValue("tOdr_SPCL_PRICE_TYP"));
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
					if(msgKeyType.containsKeyColumn("tOdr_DLV_KEY_NO")) {
						key.settOdr_DLV_KEY_NO(msgKey.getKeyValue("tOdr_DLV_KEY_NO"));
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
					if(msgKeyType.containsKeyColumn("tOdr_TRANSPORT_TYP")) {
						key.settOdr_TRANSPORT_TYP(msgKey.getKeyValue("tOdr_TRANSPORT_TYP"));
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
					if(msgKeyType.containsKeyColumn("tOdr_PARTIAL_SHIP_INST_FLG")) {
						key.settOdr_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("tOdr_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_IF_CTL_NO")) {
						key.settOdr_IF_CTL_NO(msgKey.getKeyValue("tOdr_IF_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ENTRY_TYP")) {
						key.settOdr_ENTRY_TYP(msgKey.getKeyValue("tOdr_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DEL_FLG")) {
						key.settOdr_DEL_FLG(msgKey.getKeyValue("tOdr_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_CNT")) {
						key.settOdr_SHIP_CNT(msgKey.getKeyValue("tOdr_SHIP_CNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_UNIT_CD_ORG")) {
						key.settOdr_UNIT_CD_ORG(msgKey.getKeyValue("tOdr_UNIT_CD_ORG"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_CD")) {
						key.settOdrCtl_CUST_ITEM_CD(msgKey.getKeyValue("tOdrCtl_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_COCK_TYP")) {
						key.settOdr_COCK_TYP(msgKey.getKeyValue("tOdr_COCK_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PUCH_ODR_QTY_TOTAL")) {
						key.settOdr_PUCH_ODR_QTY_TOTAL(msgKey.getKeyValue("tOdr_PUCH_ODR_QTY_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_BUYER_ORG_CD")) {
						key.settOdr_BUYER_ORG_CD(msgKey.getKeyValue("tOdr_BUYER_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_BUYER_NAME")) {
						key.settOdr_BUYER_NAME(msgKey.getKeyValue("tOdr_BUYER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_IN_ODRNO")) {
						key.settOdr_IN_ODRNO(msgKey.getKeyValue("tOdr_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_NO")) {
						key.setcreTodrODR_NO(msgKey.getKeyValue("creTodrODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_TYP")) {
						key.setcreTodrODR_TYP(msgKey.getKeyValue("creTodrODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_CTL_NO")) {
						key.setcreTodrODR_CTL_NO(msgKey.getKeyValue("creTodrODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTodrCUST_ODR_NO")) {
						key.setcreTodrCUST_ODR_NO(msgKey.getKeyValue("creTodrCUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTodrCUST_CHRG_ORG_CD")) {
						key.setcreTodrCUST_CHRG_ORG_CD(msgKey.getKeyValue("creTodrCUST_CHRG_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTodrCUST_CHRG_PSN_CD")) {
						key.setcreTodrCUST_CHRG_PSN_CD(msgKey.getKeyValue("creTodrCUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_ACPT_ORG_CD")) {
						key.setcreTodrODR_ACPT_ORG_CD(msgKey.getKeyValue("creTodrODR_ACPT_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_ACPT_PSN_CD")) {
						key.setcreTodrODR_ACPT_PSN_CD(msgKey.getKeyValue("creTodrODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTodrCURRNCY_CD")) {
						key.setcreTodrCURRNCY_CD(msgKey.getKeyValue("creTodrCURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTodrEXCH_TYP")) {
						key.setcreTodrEXCH_TYP(msgKey.getKeyValue("creTodrEXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("creTodrDLV_LOC_CD")) {
						key.setcreTodrDLV_LOC_CD(msgKey.getKeyValue("creTodrDLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTodrDLV_LOC_NAME")) {
						key.setcreTodrDLV_LOC_NAME(msgKey.getKeyValue("creTodrDLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("creTodrDLV_LOC_NAME_KANJI")) {
						key.setcreTodrDLV_LOC_NAME_KANJI(msgKey.getKeyValue("creTodrDLV_LOC_NAME_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("creTodrPRD_ODR_PLACE_CD")) {
						key.setcreTodrPRD_ODR_PLACE_CD(msgKey.getKeyValue("creTodrPRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_UNIT_PRICE")) {
						key.setcreTodrODR_UNIT_PRICE(msgKey.getKeyValue("creTodrODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("creTodrPART_DLV_COUNT")) {
						key.setcreTodrPART_DLV_COUNT(msgKey.getKeyValue("creTodrPART_DLV_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTodrDEPO_TYP")) {
						key.setcreTodrDEPO_TYP(msgKey.getKeyValue("creTodrDEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("creTodrDESINATED_DLV_DATE")) {
						key.setcreTodrDESINATED_DLV_DATE(msgKey.getKeyValue("creTodrDESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_QTY")) {
						key.setcreTodrODR_QTY(msgKey.getKeyValue("creTodrODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTodrREMAIN_UNCONFIRM_ODR_QTY")) {
						key.setcreTodrREMAIN_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("creTodrREMAIN_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTodrCANCELED_UNCONFIRM_ODR_QTY")) {
						key.setcreTodrCANCELED_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("creTodrCANCELED_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTodrUNIT_CD")) {
						key.setcreTodrUNIT_CD(msgKey.getKeyValue("creTodrUNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTodrUNCONFIRM_ODR_BALANCE")) {
						key.setcreTodrUNCONFIRM_ODR_BALANCE(msgKey.getKeyValue("creTodrUNCONFIRM_ODR_BALANCE"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_AMOUNT")) {
						key.setcreTodrODR_AMOUNT(msgKey.getKeyValue("creTodrODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_AMOUNT_EXCH_RATES")) {
						key.setcreTodrODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("creTodrODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("creTodrTOTAL_SHIP_QTY")) {
						key.setcreTodrTOTAL_SHIP_QTY(msgKey.getKeyValue("creTodrTOTAL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTodrSHIP_AMOUNT")) {
						key.setcreTodrSHIP_AMOUNT(msgKey.getKeyValue("creTodrSHIP_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTodrSHIP_AMOUNT_EXCH_RATES")) {
						key.setcreTodrSHIP_AMOUNT_EXCH_RATES(msgKey.getKeyValue("creTodrSHIP_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_CMPLT_FLG")) {
						key.setcreTodrODR_CMPLT_FLG(msgKey.getKeyValue("creTodrODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_CMPLT_DATE")) {
						key.setcreTodrODR_CMPLT_DATE(msgKey.getKeyValue("creTodrODR_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("creTodrREMARKS")) {
						key.setcreTodrREMARKS(msgKey.getKeyValue("creTodrREMARKS"));
					}
					if(msgKeyType.containsKeyColumn("creTodrODR_ACPT_DATE")) {
						key.setcreTodrODR_ACPT_DATE(msgKey.getKeyValue("creTodrODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("creTodrSHIP_PLAN_REMAIN_QTY")) {
						key.setcreTodrSHIP_PLAN_REMAIN_QTY(msgKey.getKeyValue("creTodrSHIP_PLAN_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTodrSHIP_PLAN_CMPLT_FLG")) {
						key.setcreTodrSHIP_PLAN_CMPLT_FLG(msgKey.getKeyValue("creTodrSHIP_PLAN_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("creTodrUNCONFIRMED_ODR_EFF_OVR_FLG")) {
						key.setcreTodrUNCONFIRMED_ODR_EFF_OVR_FLG(msgKey.getKeyValue("creTodrUNCONFIRMED_ODR_EFF_OVR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("creTodrPARTIAL_SHIP_INST_FLG")) {
						key.setcreTodrPARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("creTodrPARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("creTodrENTRY_TYP")) {
						key.setcreTodrENTRY_TYP(msgKey.getKeyValue("creTodrENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("creTodrDEL_FLG")) {
						key.setcreTodrDEL_FLG(msgKey.getKeyValue("creTodrDEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("upTodr_TOTAL_SHIP_QTY")) {
						key.setupTodr_TOTAL_SHIP_QTY(msgKey.getKeyValue("upTodr_TOTAL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("upTodr_SHIP_AMOUNT")) {
						key.setupTodr_SHIP_AMOUNT(msgKey.getKeyValue("upTodr_SHIP_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("upTodr_SHIP_AMOUNT_EXCH_RATES")) {
						key.setupTodr_SHIP_AMOUNT_EXCH_RATES(msgKey.getKeyValue("upTodr_SHIP_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("upTodr_ODR_CMPLT_FLG")) {
						key.setupTodr_ODR_CMPLT_FLG(msgKey.getKeyValue("upTodr_ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("upTodr_ODR_CMPLT_DATE")) {
						key.setupTodr_ODR_CMPLT_DATE(msgKey.getKeyValue("upTodr_ODR_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("upTodr_IN_ODRNO")) {
						key.setupTodr_IN_ODRNO(msgKey.getKeyValue("upTodr_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_CTRL_CD")) {
						key.setcreTrcvIssue_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("creTrcvIssue_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_TYP")) {
						key.setcreTrcvIssue_RCV_ISSUE_TYP(msgKey.getKeyValue("creTrcvIssue_RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_ITEM_CD")) {
						key.setcreTrcvIssue_ITEM_CD(msgKey.getKeyValue("creTrcvIssue_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_JOB_ODR_CD")) {
						key.setcreTrcvIssue_JOB_ODR_CD(msgKey.getKeyValue("creTrcvIssue_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_PLANT_CD")) {
						key.setcreTrcvIssue_PLANT_CD(msgKey.getKeyValue("creTrcvIssue_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_WH_CD")) {
						key.setcreTrcvIssue_WH_CD(msgKey.getKeyValue("creTrcvIssue_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_BEFORE_QTY")) {
						key.setcreTrcvIssue_RCV_ISSUE_BEFORE_QTY(msgKey.getKeyValue("creTrcvIssue_RCV_ISSUE_BEFORE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_QTY")) {
						key.setcreTrcvIssue_RCV_ISSUE_QTY(msgKey.getKeyValue("creTrcvIssue_RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_AFTER_QTY")) {
						key.setcreTrcvIssue_RCV_ISSUE_AFTER_QTY(msgKey.getKeyValue("creTrcvIssue_RCV_ISSUE_AFTER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_AMOUNT")) {
						key.setcreTrcvIssue_RCV_ISSUE_AMOUNT(msgKey.getKeyValue("creTrcvIssue_RCV_ISSUE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_DATE")) {
						key.setcreTrcvIssue_RCV_ISSUE_DATE(msgKey.getKeyValue("creTrcvIssue_RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_GNR_TYP")) {
						key.setcreTrcvIssue_RCV_ISSUE_GNR_TYP(msgKey.getKeyValue("creTrcvIssue_RCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_STOCK_UPD_TYP")) {
						key.setcreTrcvIssue_STOCK_UPD_TYP(msgKey.getKeyValue("creTrcvIssue_STOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_CMPLT_FLG")) {
						key.setcreTrcvIssue_RCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("creTrcvIssue_RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_RCV_ISSUE_COMMENT")) {
						key.setcreTrcvIssue_RCV_ISSUE_COMMENT(msgKey.getKeyValue("creTrcvIssue_RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_LOT_NO")) {
						key.setcreTrcvIssue_LOT_NO(msgKey.getKeyValue("creTrcvIssue_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("creTrcvIssue_SHIP_ODR_NO")) {
						key.setcreTrcvIssue_SHIP_ODR_NO(msgKey.getKeyValue("creTrcvIssue_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("upTitemStock_STOCK_ON_HAND_QTY")) {
						key.setupTitemStock_STOCK_ON_HAND_QTY(msgKey.getKeyValue("upTitemStock_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("upTitemStock_IN_ITEMCD")) {
						key.setupTitemStock_IN_ITEMCD(msgKey.getKeyValue("upTitemStock_IN_ITEMCD"));
					}
					if(msgKeyType.containsKeyColumn("upTitemStock_IN_WHCD")) {
						key.setupTitemStock_IN_WHCD(msgKey.getKeyValue("upTitemStock_IN_WHCD"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_ITEM_CD")) {
						key.setserTitemStock_ITEM_CD(msgKey.getKeyValue("serTitemStock_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_WH_CD")) {
						key.setserTitemStock_WH_CD(msgKey.getKeyValue("serTitemStock_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_PLANT_CD")) {
						key.setserTitemStock_PLANT_CD(msgKey.getKeyValue("serTitemStock_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_STOCK_ON_HAND_QTY")) {
						key.setserTitemStock_STOCK_ON_HAND_QTY(msgKey.getKeyValue("serTitemStock_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_DEFECT_QTY")) {
						key.setserTitemStock_DEFECT_QTY(msgKey.getKeyValue("serTitemStock_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_PRVS_DAYEND_STOCK_QTY")) {
						key.setserTitemStock_PRVS_DAYEND_STOCK_QTY(msgKey.getKeyValue("serTitemStock_PRVS_DAYEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_PRVS_MONTHEND_STOCK_QTY")) {
						key.setserTitemStock_PRVS_MONTHEND_STOCK_QTY(msgKey.getKeyValue("serTitemStock_PRVS_MONTHEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_PRVS_TERMEND_STOCK_QTY")) {
						key.setserTitemStock_PRVS_TERMEND_STOCK_QTY(msgKey.getKeyValue("serTitemStock_PRVS_TERMEND_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_IN_ITEMCD")) {
						key.setserTitemStock_IN_ITEMCD(msgKey.getKeyValue("serTitemStock_IN_ITEMCD"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_IN_WHCD")) {
						key.setserTitemStock_IN_WHCD(msgKey.getKeyValue("serTitemStock_IN_WHCD"));
					}
					if(msgKeyType.containsKeyColumn("creTitemStock_WH_CD")) {
						key.setcreTitemStock_WH_CD(msgKey.getKeyValue("creTitemStock_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTitemStock_ITEM_CD")) {
						key.setcreTitemStock_ITEM_CD(msgKey.getKeyValue("creTitemStock_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTitemStock_PLANT_CD")) {
						key.setcreTitemStock_PLANT_CD(msgKey.getKeyValue("creTitemStock_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("creTitemStock_STOCK_ON_HAND_QTY")) {
						key.setcreTitemStock_STOCK_ON_HAND_QTY(msgKey.getKeyValue("creTitemStock_STOCK_ON_HAND_QTY"));
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
					if(msgKeyType.containsKeyColumn("mCust_DETAIL_ROUND_TYP")) {
						key.setmCust_DETAIL_ROUND_TYP(msgKey.getKeyValue("mCust_DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_INSPC_ACPT_TYP")) {
						key.setmCust_INSPC_ACPT_TYP(msgKey.getKeyValue("mCust_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_OWN_ORG_CD")) {
						key.setmCust_OWN_ORG_CD(msgKey.getKeyValue("mCust_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_EXCH_TYP")) {
						key.setmCust_EXCH_TYP(msgKey.getKeyValue("mCust_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUR_CD")) {
						key.setmCust_CUR_CD(msgKey.getKeyValue("mCust_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_IN_COMPANYCD")) {
						key.setmCust_IN_COMPANYCD(msgKey.getKeyValue("mCust_IN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_IN_CUSTCD")) {
						key.setmCust_IN_CUSTCD(msgKey.getKeyValue("mCust_IN_CUSTCD"));
					}
					if(msgKeyType.containsKeyColumn("getHomeCur_CUR_CD")) {
						key.setgetHomeCur_CUR_CD(msgKey.getKeyValue("getHomeCur_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("getHomeCur_DECIMAL_FIG")) {
						key.setgetHomeCur_DECIMAL_FIG(msgKey.getKeyValue("getHomeCur_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("getHomeCur_CTRL_CD")) {
						key.setgetHomeCur_CTRL_CD(msgKey.getKeyValue("getHomeCur_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("strCode")) {
						key.setstrCode(msgKey.getKeyValue("strCode"));
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
					if(msgKeyType.containsKeyColumn("readShipOdr_TOTAL_SHIP_QTY")) {
						key.setreadShipOdr_TOTAL_SHIP_QTY(msgKey.getKeyValue("readShipOdr_TOTAL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readShipOdr_RETURN_QTY")) {
						key.setreadShipOdr_RETURN_QTY(msgKey.getKeyValue("readShipOdr_RETURN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readShipOdr_SHIP_ODR_NO")) {
						key.setreadShipOdr_SHIP_ODR_NO(msgKey.getKeyValue("readShipOdr_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("g_CUR_UNIT")) {
						key.setg_CUR_UNIT(msgKey.getKeyValue("g_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("t_CUR_CD")) {
						key.sett_CUR_CD(msgKey.getKeyValue("t_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("strSLIP_CTRL_GRP")) {
						key.setstrSLIP_CTRL_GRP(msgKey.getKeyValue("strSLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("strSTATUS")) {
						key.setstrSTATUS(msgKey.getKeyValue("strSTATUS"));
					}
					if(msgKeyType.containsKeyColumn("strSLIP_CD")) {
						key.setstrSLIP_CD(msgKey.getKeyValue("strSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("upTshipOdr_SHP_CMPLT_FLG")) {
						key.setupTshipOdr_SHP_CMPLT_FLG(msgKey.getKeyValue("upTshipOdr_SHP_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("upTshipOdr_TOTAL_SHIP_QTY")) {
						key.setupTshipOdr_TOTAL_SHIP_QTY(msgKey.getKeyValue("upTshipOdr_TOTAL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("upTshipOdr_SLIP_CD")) {
						key.setupTshipOdr_SLIP_CD(msgKey.getKeyValue("upTshipOdr_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("upTshipOdr_ORG_SLIP_CD")) {
						key.setupTshipOdr_ORG_SLIP_CD(msgKey.getKeyValue("upTshipOdr_ORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("upTshipOdr_SHIP_ODR_NO")) {
						key.setupTshipOdr_SHIP_ODR_NO(msgKey.getKeyValue("upTshipOdr_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("strTod_OD_NO")) {
						key.setstrTod_OD_NO(msgKey.getKeyValue("strTod_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("strTod_TOTAL_ISSUE_QTY")) {
						key.setstrTod_TOTAL_ISSUE_QTY(msgKey.getKeyValue("strTod_TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("strTod_DM_QTY")) {
						key.setstrTod_DM_QTY(msgKey.getKeyValue("strTod_DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("strTod_DM_STS_TYP")) {
						key.setstrTod_DM_STS_TYP(msgKey.getKeyValue("strTod_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("inTod_ODR_NO")) {
						key.setinTod_ODR_NO(msgKey.getKeyValue("inTod_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("inTod_PART_DLV_SEQ_NO")) {
						key.setinTod_PART_DLV_SEQ_NO(msgKey.getKeyValue("inTod_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("inTod_OD_NO")) {
						key.setinTod_OD_NO(msgKey.getKeyValue("inTod_OD_NO"));
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
					if(msgKeyType.containsKeyColumn("updiffTAX_CD")) {
						key.setupdiffTAX_CD(msgKey.getKeyValue("updiffTAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("upTshipOdr_RETURN_QTY")) {
						key.setupTshipOdr_RETURN_QTY(msgKey.getKeyValue("upTshipOdr_RETURN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("chkSLIP_CD")) {
						key.setchkSLIP_CD(msgKey.getKeyValue("chkSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("mWh_WH_NAME")) {
						key.setmWh_WH_NAME(msgKey.getKeyValue("mWh_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mWh_PLANT_CD")) {
						key.setmWh_PLANT_CD(msgKey.getKeyValue("mWh_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("mWh_IN_WH_CD")) {
						key.setmWh_IN_WH_CD(msgKey.getKeyValue("mWh_IN_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("mOrg_ORG_NAME")) {
						key.setmOrg_ORG_NAME(msgKey.getKeyValue("mOrg_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mOrg_IN_COMPANYCD")) {
						key.setmOrg_IN_COMPANYCD(msgKey.getKeyValue("mOrg_IN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("mOrg_IN_ORGCD")) {
						key.setmOrg_IN_ORGCD(msgKey.getKeyValue("mOrg_IN_ORGCD"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_JOB_ODR_CD")) {
						key.setserTitemStock_JOB_ODR_CD(msgKey.getKeyValue("serTitemStock_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTitemStock_IN_JOBODRCD")) {
						key.setserTitemStock_IN_JOBODRCD(msgKey.getKeyValue("serTitemStock_IN_JOBODRCD"));
					}
					if(msgKeyType.containsKeyColumn("creTitemStock_JOB_ODR_CD")) {
						key.setcreTitemStock_JOB_ODR_CD(msgKey.getKeyValue("creTitemStock_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("upTitemStock_IN_JOBODRCD")) {
						key.setupTitemStock_IN_JOBODRCD(msgKey.getKeyValue("upTitemStock_IN_JOBODRCD"));
					}
					if(msgKeyType.containsKeyColumn("serTJobOdr_JOB_ODR_CD")) {
						key.setserTJobOdr_JOB_ODR_CD(msgKey.getKeyValue("serTJobOdr_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("serTJobOdr_ITEM_CD")) {
						key.setserTJobOdr_ITEM_CD(msgKey.getKeyValue("serTJobOdr_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffSHIP_QTY")) {
						key.setdiffSHIP_QTY(msgKey.getKeyValue("diffSHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("diffSHIP_ODR_AMOUNT")) {
						key.setdiffSHIP_ODR_AMOUNT(msgKey.getKeyValue("diffSHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("diffSHIP_ODR_AMOUNT_EXCH_RATE")) {
						key.setdiffSHIP_ODR_AMOUNT_EXCH_RATE(msgKey.getKeyValue("diffSHIP_ODR_AMOUNT_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("diffSHIP_ODR_NO")) {
						key.setdiffSHIP_ODR_NO(msgKey.getKeyValue("diffSHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("diffODR_NO")) {
						key.setdiffODR_NO(msgKey.getKeyValue("diffODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("diffPART_DLV_SEQ_NO")) {
						key.setdiffPART_DLV_SEQ_NO(msgKey.getKeyValue("diffPART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("diffSLIP_CD")) {
						key.setdiffSLIP_CD(msgKey.getKeyValue("diffSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffITEM_CD")) {
						key.setdiffITEM_CD(msgKey.getKeyValue("diffITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffJOB_ODR_CD")) {
						key.setdiffJOB_ODR_CD(msgKey.getKeyValue("diffJOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffCUST_ITEM_CD")) {
						key.setdiffCUST_ITEM_CD(msgKey.getKeyValue("diffCUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffCUST_ODR_NO")) {
						key.setdiffCUST_ODR_NO(msgKey.getKeyValue("diffCUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("diffCUST_CD")) {
						key.setdiffCUST_CD(msgKey.getKeyValue("diffCUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffCUST_NAME")) {
						key.setdiffCUST_NAME(msgKey.getKeyValue("diffCUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("diffCUST_CHRG_PSN_CD")) {
						key.setdiffCUST_CHRG_PSN_CD(msgKey.getKeyValue("diffCUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffSHIP_ODR_ISS_PSN_CD")) {
						key.setdiffSHIP_ODR_ISS_PSN_CD(msgKey.getKeyValue("diffSHIP_ODR_ISS_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffDLV_LOC_CD")) {
						key.setdiffDLV_LOC_CD(msgKey.getKeyValue("diffDLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffDEPO_TYP")) {
						key.setdiffDEPO_TYP(msgKey.getKeyValue("diffDEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("diffDESINATED_SHIP_DATE")) {
						key.setdiffDESINATED_SHIP_DATE(msgKey.getKeyValue("diffDESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("diffSCDL_DLV_DATE")) {
						key.setdiffSCDL_DLV_DATE(msgKey.getKeyValue("diffSCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("diffTOTAL_SHIP_QTY")) {
						key.setdiffTOTAL_SHIP_QTY(msgKey.getKeyValue("diffTOTAL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("diffRETURN_QTY")) {
						key.setdiffRETURN_QTY(msgKey.getKeyValue("diffRETURN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("diffUNIT_CD")) {
						key.setdiffUNIT_CD(msgKey.getKeyValue("diffUNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffUNIT_PRICE")) {
						key.setdiffUNIT_PRICE(msgKey.getKeyValue("diffUNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("diffCURRENCY_CD")) {
						key.setdiffCURRENCY_CD(msgKey.getKeyValue("diffCURRENCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffLOC_CD")) {
						key.setdiffLOC_CD(msgKey.getKeyValue("diffLOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffPKG_UNIT_QTY")) {
						key.setdiffPKG_UNIT_QTY(msgKey.getKeyValue("diffPKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("diffREMARKS")) {
						key.setdiffREMARKS(msgKey.getKeyValue("diffREMARKS"));
					}
					if(msgKeyType.containsKeyColumn("diffDLV_KEY_NO")) {
						key.setdiffDLV_KEY_NO(msgKey.getKeyValue("diffDLV_KEY_NO"));
					}
					if(msgKeyType.containsKeyColumn("diffPART_DLV_COUNT")) {
						key.setdiffPART_DLV_COUNT(msgKey.getKeyValue("diffPART_DLV_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("diffTRANSPORT_CD")) {
						key.setdiffTRANSPORT_CD(msgKey.getKeyValue("diffTRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffTRANSPORT_TYP")) {
						key.setdiffTRANSPORT_TYP(msgKey.getKeyValue("diffTRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("diffALLCT_WH_CD")) {
						key.setdiffALLCT_WH_CD(msgKey.getKeyValue("diffALLCT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffTRANSFER_WH_CD")) {
						key.setdiffTRANSFER_WH_CD(msgKey.getKeyValue("diffTRANSFER_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("diffDIRECT_DLV_FLG")) {
						key.setdiffDIRECT_DLV_FLG(msgKey.getKeyValue("diffDIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("diffENTRY_TYP")) {
						key.setdiffENTRY_TYP(msgKey.getKeyValue("diffENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("diffPRINT_FLG")) {
						key.setdiffPRINT_FLG(msgKey.getKeyValue("diffPRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("diffSHIP_CMPLT_FLG")) {
						key.setdiffSHIP_CMPLT_FLG(msgKey.getKeyValue("diffSHIP_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("diffDEPO_TRANSFER_PROC_FLG")) {
						key.setdiffDEPO_TRANSFER_PROC_FLG(msgKey.getKeyValue("diffDEPO_TRANSFER_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("diffDEL_FLG")) {
						key.setdiffDEL_FLG(msgKey.getKeyValue("diffDEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("diffuptOdr_SHIP_CNT")) {
						key.setdiffuptOdr_SHIP_CNT(msgKey.getKeyValue("diffuptOdr_SHIP_CNT"));
					}
					if(msgKeyType.containsKeyColumn("diffuptOdr_PART_DLV_COUNT")) {
						key.setdiffuptOdr_PART_DLV_COUNT(msgKey.getKeyValue("diffuptOdr_PART_DLV_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("diffuptOdr_IN_ODRNO")) {
						key.setdiffuptOdr_IN_ODRNO(msgKey.getKeyValue("diffuptOdr_IN_ODRNO"));
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
					if(msgKeyType.containsKeyColumn("up_tShipSlip_SLIP_CD")) {
						key.setup_tShipSlip_SLIP_CD(msgKey.getKeyValue("up_tShipSlip_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("updiffSHIP_ODR_QTY")) {
						key.setupdiffSHIP_ODR_QTY(msgKey.getKeyValue("updiffSHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("updiffSHIP_ODR_AMOUNT")) {
						key.setupdiffSHIP_ODR_AMOUNT(msgKey.getKeyValue("updiffSHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("updiffTAX_AMOUNT")) {
						key.setupdiffTAX_AMOUNT(msgKey.getKeyValue("updiffTAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("updiffSHIP_ODR_AMOUNT_TAX")) {
						key.setupdiffSHIP_ODR_AMOUNT_TAX(msgKey.getKeyValue("updiffSHIP_ODR_AMOUNT_TAX"));
					}
					if(msgKeyType.containsKeyColumn("updiffEXTERNAL_TAX_SALES_AMOUNT")) {
						key.setupdiffEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("updiffEXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("updiffINTERNAL_TAX_SALES_AMOUNT")) {
						key.setupdiffINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("updiffINTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("updiffTAXFREE_SALES_AMOUNT")) {
						key.setupdiffTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("updiffTAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("updiffTAX_CREDIT_SALES_AMOUNT")) {
						key.setupdiffTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("updiffTAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("updiffEXTERNAL_TAX_AMOUNT")) {
						key.setupdiffEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("updiffEXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("updiffINTERNAL_TAX_AMOUNT")) {
						key.setupdiffINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("updiffINTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("updiffTAX_AMOUNT_1")) {
						key.setupdiffTAX_AMOUNT_1(msgKey.getKeyValue("updiffTAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("updiffTAX_AMOUNT_2")) {
						key.setupdiffTAX_AMOUNT_2(msgKey.getKeyValue("updiffTAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("updiffTAX_AMOUNT_3")) {
						key.setupdiffTAX_AMOUNT_3(msgKey.getKeyValue("updiffTAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setupdiffOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("updiffOWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("updiffSLIP_CD")) {
						key.setupdiffSLIP_CD(msgKey.getKeyValue("updiffSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_LT")) {
						key.setmCustBase_TRANSPORT_LT(msgKey.getKeyValue("mCustBase_TRANSPORT_LT"));
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
					if(msgKeyType.containsKeyColumn("strSYUKA_LT")) {
						key.setstrSYUKA_LT(msgKey.getKeyValue("strSYUKA_LT"));
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
					if(msgKeyType.containsKeyColumn("strT_ODR_TAX")) {
						key.setstrT_ODR_TAX(msgKey.getKeyValue("strT_ODR_TAX"));
					}
					if(msgKeyType.containsKeyColumn("g_SLIP_CD")) {
						key.setg_SLIP_CD(msgKey.getKeyValue("g_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("getTship_SHIP_SEQ_NO")) {
						key.setgetTship_SHIP_SEQ_NO(msgKey.getKeyValue("getTship_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("chkLOT_NO")) {
						key.setchkLOT_NO(msgKey.getKeyValue("chkLOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("chkITEM_CD")) {
						key.setchkITEM_CD(msgKey.getKeyValue("chkITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("getQtySTOCK_ON_HAND_QTY")) {
						key.setgetQtySTOCK_ON_HAND_QTY(msgKey.getKeyValue("getQtySTOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("getQtyALCD_QTY")) {
						key.setgetQtyALCD_QTY(msgKey.getKeyValue("getQtyALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("getQtyITEM_CD")) {
						key.setgetQtyITEM_CD(msgKey.getKeyValue("getQtyITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("getQtyWH_CD")) {
						key.setgetQtyWH_CD(msgKey.getKeyValue("getQtyWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("getQtyLOT_NO")) {
						key.setgetQtyLOT_NO(msgKey.getKeyValue("getQtyLOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("readTlotStock_LOT_NO")) {
						key.setreadTlotStock_LOT_NO(msgKey.getKeyValue("readTlotStock_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("readTlotStock_STOCK_ON_HAND_QTY")) {
						key.setreadTlotStock_STOCK_ON_HAND_QTY(msgKey.getKeyValue("readTlotStock_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readTlotStock_ALCD_QTY")) {
						key.setreadTlotStock_ALCD_QTY(msgKey.getKeyValue("readTlotStock_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readTlotStock_IN_ITEM_CD")) {
						key.setreadTlotStock_IN_ITEM_CD(msgKey.getKeyValue("readTlotStock_IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readTlotStock_IN_WH_CD")) {
						key.setreadTlotStock_IN_WH_CD(msgKey.getKeyValue("readTlotStock_IN_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("readTlotStock_IN_LOT_NO")) {
						key.setreadTlotStock_IN_LOT_NO(msgKey.getKeyValue("readTlotStock_IN_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("upTlotStockSTOCK_ON_HAND_QTY")) {
						key.setupTlotStockSTOCK_ON_HAND_QTY(msgKey.getKeyValue("upTlotStockSTOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("upTlotStockIN_ITEM_CD")) {
						key.setupTlotStockIN_ITEM_CD(msgKey.getKeyValue("upTlotStockIN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("upTlotStockIN_WH_CD")) {
						key.setupTlotStockIN_WH_CD(msgKey.getKeyValue("upTlotStockIN_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("upTlotStockIN_LOT_NO")) {
						key.setupTlotStockIN_LOT_NO(msgKey.getKeyValue("upTlotStockIN_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("serLotSTOCK_ON_HAND_QTY")) {
						key.setserLotSTOCK_ON_HAND_QTY(msgKey.getKeyValue("serLotSTOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serLotALCD_QTY")) {
						key.setserLotALCD_QTY(msgKey.getKeyValue("serLotALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("serLotIN_ITEM_CD")) {
						key.setserLotIN_ITEM_CD(msgKey.getKeyValue("serLotIN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("serLotIN_WH_CD")) {
						key.setserLotIN_WH_CD(msgKey.getKeyValue("serLotIN_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("serLotIN_LOT_NO")) {
						key.setserLotIN_LOT_NO(msgKey.getKeyValue("serLotIN_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("insertLotStock_ITEM_CD")) {
						key.setinsertLotStock_ITEM_CD(msgKey.getKeyValue("insertLotStock_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("insertLotStock_WH_CD")) {
						key.setinsertLotStock_WH_CD(msgKey.getKeyValue("insertLotStock_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("insertLotStock_LOT_CD")) {
						key.setinsertLotStock_LOT_CD(msgKey.getKeyValue("insertLotStock_LOT_CD"));
					}
					if(msgKeyType.containsKeyColumn("insertLotStock_PLANT_CD")) {
						key.setinsertLotStock_PLANT_CD(msgKey.getKeyValue("insertLotStock_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("insertLotStock_STOCK_ON_HAND_QTY")) {
						key.setinsertLotStock_STOCK_ON_HAND_QTY(msgKey.getKeyValue("insertLotStock_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("insertLotStock_DEFECT_QTY")) {
						key.setinsertLotStock_DEFECT_QTY(msgKey.getKeyValue("insertLotStock_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("insertLotStock_ALCD_QTY")) {
						key.setinsertLotStock_ALCD_QTY(msgKey.getKeyValue("insertLotStock_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("insTshipInst_SHIP_SEQ_NO")) {
						key.setinsTshipInst_SHIP_SEQ_NO(msgKey.getKeyValue("insTshipInst_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("insTshipInst_SHIP_ODR_NO")) {
						key.setinsTshipInst_SHIP_ODR_NO(msgKey.getKeyValue("insTshipInst_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("insTshipInst_LOT_NO")) {
						key.setinsTshipInst_LOT_NO(msgKey.getKeyValue("insTshipInst_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("insTshipInst_ITEM_CD")) {
						key.setinsTshipInst_ITEM_CD(msgKey.getKeyValue("insTshipInst_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("insTshipInst_WH_CD")) {
						key.setinsTshipInst_WH_CD(msgKey.getKeyValue("insTshipInst_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("insTshipInst_ODR_NO")) {
						key.setinsTshipInst_ODR_NO(msgKey.getKeyValue("insTshipInst_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("insTshipInst_SLIP_CD")) {
						key.setinsTshipInst_SLIP_CD(msgKey.getKeyValue("insTshipInst_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("insTshipInst_SHIP_QTY")) {
						key.setinsTshipInst_SHIP_QTY(msgKey.getKeyValue("insTshipInst_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("insTshipInst_SHIP_DATE")) {
						key.setinsTshipInst_SHIP_DATE(msgKey.getKeyValue("insTshipInst_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("delTshipInstIN_SHIP_SEQ_NO")) {
						key.setdelTshipInstIN_SHIP_SEQ_NO(msgKey.getKeyValue("delTshipInstIN_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("delTshipInstIN_LOT_NO")) {
						key.setdelTshipInstIN_LOT_NO(msgKey.getKeyValue("delTshipInstIN_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("tlotTrace_FROM_ITEM_CD")) {
						key.settlotTrace_FROM_ITEM_CD(msgKey.getKeyValue("tlotTrace_FROM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tlotTrace_FROM_LOT_NO")) {
						key.settlotTrace_FROM_LOT_NO(msgKey.getKeyValue("tlotTrace_FROM_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("tlotTrace_TO_ITEM_CD")) {
						key.settlotTrace_TO_ITEM_CD(msgKey.getKeyValue("tlotTrace_TO_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tlotTrace_TO_LOT_NO")) {
						key.settlotTrace_TO_LOT_NO(msgKey.getKeyValue("tlotTrace_TO_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("tlotTrace_LOT_TRACE_TYP")) {
						key.settlotTrace_LOT_TRACE_TYP(msgKey.getKeyValue("tlotTrace_LOT_TRACE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tlotTrace_CUST_ODR_NO")) {
						key.settlotTrace_CUST_ODR_NO(msgKey.getKeyValue("tlotTrace_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("tlotTrace_SLIP_CD")) {
						key.settlotTrace_SLIP_CD(msgKey.getKeyValue("tlotTrace_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("tlotTrace_ODR_NO")) {
						key.settlotTrace_ODR_NO(msgKey.getKeyValue("tlotTrace_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("readTshipInst_LOT_NO")) {
						key.setreadTshipInst_LOT_NO(msgKey.getKeyValue("readTshipInst_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("readTshipInst_SHIP_QTY")) {
						key.setreadTshipInst_SHIP_QTY(msgKey.getKeyValue("readTshipInst_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("readTshipInst_SHIP_ODR_NO")) {
						key.setreadTshipInst_SHIP_ODR_NO(msgKey.getKeyValue("readTshipInst_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("readTshipInst_ITEM_CD")) {
						key.setreadTshipInst_ITEM_CD(msgKey.getKeyValue("readTshipInst_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readTshipInst_WH_CD")) {
						key.setreadTshipInst_WH_CD(msgKey.getKeyValue("readTshipInst_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("readTshipInst_ODR_NO")) {
						key.setreadTshipInst_ODR_NO(msgKey.getKeyValue("readTshipInst_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("readTshipInst_SLIP_CD")) {
						key.setreadTshipInst_SLIP_CD(msgKey.getKeyValue("readTshipInst_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("readTshipInst_SHIP_DATE")) {
						key.setreadTshipInst_SHIP_DATE(msgKey.getKeyValue("readTshipInst_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("readTshipInst_IN_SHIP_SEQ_NO")) {
						key.setreadTshipInst_IN_SHIP_SEQ_NO(msgKey.getKeyValue("readTshipInst_IN_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("readTshipInst_IN_LOT_NO")) {
						key.setreadTshipInst_IN_LOT_NO(msgKey.getKeyValue("readTshipInst_IN_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("readT_Ship_Inst_Lot_NO")) {
						key.setreadT_Ship_Inst_Lot_NO(msgKey.getKeyValue("readT_Ship_Inst_Lot_NO"));
					}
					if(msgKeyType.containsKeyColumn("readT_Ship_Inst_Ship_Seq_NO")) {
						key.setreadT_Ship_Inst_Ship_Seq_NO(msgKey.getKeyValue("readT_Ship_Inst_Ship_Seq_NO"));
					}
					if(msgKeyType.containsKeyColumn("strOdrCurrncyCd")) {
						key.setstrOdrCurrncyCd(msgKey.getKeyValue("strOdrCurrncyCd"));
					}
					if(msgKeyType.containsKeyColumn("strExchTyp")) {
						key.setstrExchTyp(msgKey.getKeyValue("strExchTyp"));
					}
					if(msgKeyType.containsKeyColumn("g_DATE")) {
						key.setg_DATE(msgKey.getKeyValue("g_DATE"));
					}
					if(msgKeyType.containsKeyColumn("selTShipOdr_MODIFY_COUNT")) {
						key.setselTShipOdr_MODIFY_COUNT(msgKey.getKeyValue("selTShipOdr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT")) {
						key.setSEL_MODIFY_COUNT(msgKey.getKeyValue("SEL_MODIFY_COUNT"));
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
