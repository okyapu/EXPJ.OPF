/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0060/src/com/nec/jp/orteus/metamorBase/KU0060/KU0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0060;

import com.nec.jp.orteus.metamorBase.KU0060.*;
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
import com.nec.jp.orteus.metamorBase.common06.util.numberUtil;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KU0060010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.17 $ $Date: 2015/11/16 05:16:52 $
 *
 */
//}}user_implement_code_header

public class KU0060010Control
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
	public KU0060010Struct getListvalue(int x) { return (KU0060010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KU0060010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KU0060010Struct createStruct() { return new KU0060010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KU0060010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

	public int getListsize(List _list) {
		int nret = 0;
		if( _list != null ) {nret = _list.size();}
		return nret;
	}


// �o�׎w�������e�i���X�Ɠ��l�X�^�[�g


	/** �V�X�e������ */
  private final static String m_kSYS_CLASS = "SYSTEM";

	/** TAX KBN */
	private String TAX_KBN = "";

	/** �ʏ�̗a���q�ɋ敪 */
	private final static String m_kNORMAL_DEPOTYP = "10";

	/** �a���̗a���q�ɋ敪 */
	private final static String m_kYOTO_DEPOTYP = "20";

  /** �����Ǘ��敪 */
  private String unitQtyType = "";

//------------------------------------------------------------------------------

	/**
	 * �[���\���
	 *
	 * @param KU0060010Struct Struct
	 * @return �Z�o��̔[���\���
	 */
	private String getScdlDlvDate(KU0060010Struct wst, String strDesinatedShipDate,String strTransportLt) throws ParseException,FoundationException
	{
		String rv = null;

		//�o�׎w���
		GregorianCalendar inpDate = new GregorianCalendar();
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
			return null;

		}
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
	private String[] doCalcuTaxAmount(KU0060010Struct wst, String strCustCd,
	                                  String strCompanyCd, String strItemCd,
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
		//Add Start 20131218 zhang-jq
		String strINSPC_ACPT_TYP = "";//�����敪
		String strTAX_CD = "";//����ŃR�[�h
		strINSPC_ACPT_TYP = wst.getmCust_INSPC_ACPT_TYP();
		wst.settOdr_IN_ODRNO(wst.getl_ODR_NO());
		List listTodr ;
		     listTodr = entity.mtbl_T_ODR.read(conn, wst);
		if(listTodr == null ||listTodr.size()!= 1 ){
		}else{
			//[�󒍖���]."����ŃR�[�h��
			strTAX_CD = ((KU0060010Struct)listTodr.get(0)).gettOdr_TAX_CD().toString();
			wst.setstrTAX_CD(strTAX_CD);
		}
		//Add End 20131218 zhang-jq
		List listTax;
		//Mod Start 20131218 zhang-jq
		//listTax = entity.mgetTax.read(conn, wst);
		listTax = entity.mgetTaxByTaxCd.read(conn, wst);
		//Mod End 20131218 zhang-jq

        wst.settCUR_CD(strCurrncyCd);
        List listCur = entity.mtblM_CUR.read(conn, wst);
        int decimalFig = 0;

		if(listTax == null || listTax.size() != 1){
		}else{
			this.TAX_KBN = ((KU0060010Struct)listTax.get(0)).getstrTaxTAX_KBN();
			strStartDate = ((KU0060010Struct)listTax.get(0)).getstrTaxSTART_DATE();
			strRoundTyp = ((KU0060010Struct)listTax.get(0)).getstrTaxROUND_TYP();

			//Mod Start 20131218 zhang-jq
			/*
			//�ŗ��ݒ�(�V����ŊJ�n��<=�o�׎w����̏ꍇ�A�V�ŗ�)
			if(this.isNewTax(wst, strStartDate)){
				strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
				strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
				strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
			} else {
				strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
				strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
				strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
			}
			*/
			if ("1".equals(strINSPC_ACPT_TYP)){
				//�u���Ӑ�v. �g�����敪�h�@�� 1�̏ꍇ�i�o�׊�j
				if(this.isNewTax("1",wst, strStartDate)){
					strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
					strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
					strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
				} else {
					strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
					strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
					strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
				}
				
			}else {
				//�u���Ӑ�v. �g�����敪�h�@�� 1�ȊO�̏ꍇ�i��̔����j
				if(this.isNewTax("2",wst, strStartDate)){
					strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
					strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
					strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
				} else {
					strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
					strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
					strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
				}
			}
			//Mod End 20131218 zhang-jq
			//�[���敪��ROUND���s��
			ExchAmount ex = new ExchAmount(conn);


      if (!listCur.isEmpty()) {
         decimalFig = Integer.parseInt(((KU0060010Struct)listCur.get(0)).gettDECIMAL_FIG());
      }

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

			}
		}

		return rv;
	}

	/**
	 * �V����ŃR�[�h�J�n���Ɣ�r
	 *
	 */
	private boolean isNewTax(KU0060010Struct wst, String strStartDate) throws ParseException
	{
		boolean rv = false;

		//�V����ŃR�[�h�J�n��
		GregorianCalendar date1 = new GregorianCalendar();
		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));

		//�o�׎w���
		GregorianCalendar date2 = new GregorianCalendar();
		date2.setTime(Converter.strToDate(wst.getl_DESINATED_SHIP_DATE(), "yyyy/MM/dd"));

		//�V����ŃR�[�h�J�n�� <= �o�׎w����̏ꍇ�A�V�ŗ�
		if(date1.getTime().compareTo(date2.getTime()) <= 0){
			rv = true;
		}
		return rv;
	}
	//Add Start 20131218 zhang-jq
	/**
	 * �V����ŃR�[�h�J�n���Ɣ�r
	 *
	 */
	private boolean isNewTax(String flag,KU0060010Struct wst, String strStartDate) throws ParseException
	{
		boolean rv = false;
		
		//�V����ŃR�[�h�J�n��
		GregorianCalendar date1 = new GregorianCalendar();
		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));
		//�o�׎w���
		GregorianCalendar date2 = new GregorianCalendar();
		date2.setTime(Converter.strToDate(wst.getl_DESINATED_SHIP_DATE(), "yyyy/MM/dd"));
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
//Add End 20131218 zhang-jq

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

// �o�׎w�������e�i���X���瓯�l�G���h

	// �o��LT
	private String strSyuKaLt = "0";

	public String getstrSyuKaLt() {return this.strSyuKaLt;}
	public void setstrSyuKaLt(String strSyuKaLt) { this.strSyuKaLt = strSyuKaLt;}

	/**
	 * �o�׃��[�h�^�C���擾
	 * @param KU0060010Struct st
	 * @return String �o�׃��[�h�^�C��
	 * */
	private String getSYUKA_LT(KU0060010Struct st) throws FoundationException, SQLException {

		String syukalt = "0";
		List listShipCd = new ArrayList();
		
		listShipCd = entity.mgetSYUKA_LT.read(conn,st);
		if(getListsize(listShipCd) != 1){
			//�o�׏���LT������
			//�G���[���b�Z�[�W�o��
		 	ExpjMessage emsg = new ExpjMessage("KQ00037");
			msgStruct.addError(emsg);
			}else{
			syukalt = ((KU0060010Struct)listShipCd.get(0)).getstrSYUKA_LT();
		}
		listShipCd = null;
		return syukalt;
	}



	private String strCompanyCd = "";

	/**
	 * SYSTEM�̉�ЃR�[�h�擾
	 * @param KU0060010Struct st
	 * @return String ��ЃR�[�h
	 * */

	private String getstrCompanyCd(KU0060010Struct st) throws FoundationException, SQLException {
			
			String companyinfo = "";
	
			// st�͎��s�����r�p�k�Ɉˑ����Ȃ�
			List listCompanyInfo = entity.mgetCompanyInfo.read(conn,st);
	
			if(listCompanyInfo == null || listCompanyInfo.size() != 1){
				//���Џ�񂪖���/������
				ExpjMessage emsg = new ExpjMessage("KQ00039");
	      msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
	      sysLog.severe(emsg, getsysUSER_CD()); //�G���[���e
	      ExpjException ee = new ExpjException(emsg);
			}else{
				st.setstrCOMPANY_CD(((KU0060010Struct)listCompanyInfo.get(0)).getstrCOMPANY_CD());
				companyinfo = st.getstrCOMPANY_CD();
			}
			listCompanyInfo = null;
			return companyinfo;
	}
 
/**
	 * �o�׎w���A���[�����X�g�l�ݒ�
	 * @param KU0060010Struct s 
	 * @param List errorLst �o�׎w���s���R
	 **/
	private void setTUnShipList(KU0060010Struct s, List errorLst) {
		s.settUnShipList_CUST_CD(s.getl_CUST_CD()); // ���Ӑ�R�[�h
		//s.settUnShipList_ACPT_ODR_CD(s.getl_ODR_NO()); // �󒍔ԍ�
		//s.settUnShipList_PART_DLV_SEQ_NO(s.getl_PART_DLV_SEQ_NO()); // ���[����
		s.settUnShipList_ITEM_CD(s.getl_ITEM_CD()); // �i�ڔԍ�
		s.settUnShipList_UN_SHIP_QTY(s.getl_SHIP_QTY()); // �o�׎w���s����
			
		Iterator _iterator = errorLst.iterator();
		String UnShipRsn = "";
		while (_iterator.hasNext()) {
			ExpjMessage msg = (ExpjMessage)_iterator.next();
			UnShipRsn = msg.getMessage(CoreTools.getLocale(getsysUSER_CD()));
		}

		s.settUnShipList_UN_SHIP_RSN(UnShipRsn); // �o�׎w���s���R
		s.settUnShipList_WH_CD(s.getl_WH_CD()); // �ۊǋ�R�[�h
		s.settUnShipList_PRINT_FLG("0"); // ���[�o�̓t���O
		s.settUnShipList_DEL_FLG("0"); // �폜�t���O
	}
		
	/**
	 * �o�׎w���s�Ǘ��ԍ��擾
	 * @param �󒍔ԍ��A���[����
	 * @return �o�׎w���s�Ǘ��ԍ��B�擾�ł��Ȃ����null�B
	 * @throws FoundationException
	 **/
	private String getTUnShipListUnShipSeqNo(String odrNo, String seqNo) throws FoundationException, SQLException {
		List rList = null;
		KU0060010Struct u = new KU0060010Struct();
		String unShipSeqNo = null;
		
		u.settUnShipList_ACPT_ODR_CD(odrNo);
		u.settUnShipList_PART_DLV_SEQ_NO(seqNo);
		
		rList = entity.mT_UN_SHIP_LIST_UN_SHIP_SEQ_NO.read(conn, u);
		if (!rList.isEmpty()) {
			unShipSeqNo = ((KU0060010Struct)rList.get(0)).gettUnShipList_UN_SHIP_SEQ_NO();
		}
		return unShipSeqNo;
	}
		
	/**
	 * �o�׎w���s�폜
	 * @param �󒍔ԍ��A���[����
	 * @throws FoundationException
	 **/
	private void deleteUnShipList(String odrNo, String seqNo) throws FoundationException, SQLException {
		List rList = null;
		KU0060010Struct u = new KU0060010Struct();
		
		u.settUnShipList_ACPT_ODR_CD(odrNo);
		u.settUnShipList_PART_DLV_SEQ_NO(seqNo);
		
		entity.mtbl_T_UN_SHIP_LIST.delete(conn, u);
	}
		
		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {

      this.conn.beginTransWeb();
			int maxLine = 0;

     ////////// ���Ɩ����W�b�N�� //////////

			if (struct.getr1_SHIP_ODR().equals("true")) {
                // �\���ő�s��
				maxLine = sp.getMaxLine(conn,10);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);
				list = entity.mtbl_T_ANS_DLV_DATECnt.read(conn, struct);
				long rowCount = Long.parseLong(((KU0060010Struct) list.get(0)).getl_COUNT());
                // �o�׌v��̑��݃`�F�b�N
				if(rowCount == 0){
					setReadStatus(NOT_FOUND);
					//���݂��Ȃ��ꍇ�G���[�o��
					ExpjMessage emsg = new ExpjMessage("ZZ06001");
					msgStruct.addError(emsg);
					setReadStatus(NOT_FOUND);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				} else {
				}
				
				// �ő�s���𒴉߂��Ă�����G���[
				if(maxLine != 0 && rowCount == maxLine + 1){
					ExpjMessage emsg = new ExpjMessage( "ZZ01115" ,""+maxLine);
					msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
					setReadStatus(TOO_MANY);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				}
				// �o�׌v�悩��o�׎w���o�^

				list = entity.mtbl_T_ANS_DLV_DATE.read(conn, struct);

				// �ǂݍ��ݐ���
				setReadStatus(NORMAL);

			}
			else
			{
                // �\���ő�s��
				maxLine = sp.getMaxLine(conn,20);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);
				list = entity.mtbl_T_SHIP_ODRCnt.read(conn, struct);
				long rowCount = Long.parseLong(((KU0060010Struct) list.get(0)).getl_COUNT());
				if (rowCount == 0) {
					setReadStatus(NOT_FOUND);
					ExpjMessage emsg = new ExpjMessage("ZZ06001");
					msgStruct.addError(emsg);
					setReadStatus(NOT_FOUND);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				}

				if(maxLine != 0 && rowCount == maxLine + 1){
					ExpjMessage emsg = new ExpjMessage( "ZZ01115" ,""+maxLine);
					msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
					setReadStatus(TOO_MANY);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				}
				// �`�[�ԍ����L�[�Ƃ��ďo�׎w���폜
				list = entity.mtbl_T_SHIP_ODR.read(conn, struct);

				// �ǂݍ��ݐ���
				setReadStatus(NORMAL);
			}

	   	////////// ���Ɩ����W�b�N�� //////////
			this.conn.commit();

		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" ); // �T�[�o�ŃG���[���������܂���
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�

			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			throw ee;
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106"); // �T�[�o�ŃG���[���������܂���
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
    } finally {
      if (conn != null) {
        try {
           conn.rollback();
        } catch (FoundationException fe) {
					ExpjMessage emsg = new ExpjMessage( "ZZ01106"); // �T�[�o�ŃG���[���������܂���
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
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �I��o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			Numbering SHIP_ODR_NO = null;		//�o�׎w���ԍ��̔Ԃ̏���
			Numbering SLIP_CD = null;			//�`�[�ԍ��̔Ԃ̏���

		try {

			// �ꎞ�e�[�u���̃G���g�����폜
			entity.mtbl_SHIP_T.delete(conn, struct);

			// �ꎞ�e�[�u���Ɋi�[
			int _tempLstCnt = 0;
			KU0060010Struct _tempStruct = new KU0060010Struct();

			// Orteus�W�����[�U�h�c���Z�b�g
			_tempStruct.setsUser_ID(struct.getsUser_ID());

			List _tempOdrNoLst = struct.getList_l_ODR_NO();	// �󒍔ԍ�
			List _tempPartDlvSeqNo = struct.getList_l_PART_DLV_SEQ_NO();	// ���[����
			List _tempItemCd = struct.getList_l_ITEM_CD();	// �i�ڔԍ�
			List _tempItemName = struct.getList_l_ITEM_NAME();	// �i�ږ�
			List _tempDesinatedDlvDate = struct.getList_l_DESINATED_DLV_DATE();	// �w��[��
			List _tempDesinatedShipDate = struct.getList_l_DESINATED_SHIP_DATE();	// �o�׎w���
			List _tempShipQty = struct.getList_l_SHIP_QTY();	// �o�׎w������
			List _tempRestShipQty = struct.getList_l_REST_SHIP_QTY();	// �o�׎w���c����
			List _tempWhCd = struct.getList_l_WH_CD();	// �ۊǋ�R�[�h
			List _tempWhName = struct.getList_l_WH_NAME();	// �ۊǋ於
			List _tempCDirectDlvFlg = struct.getList_l_c_DIRECT_DLV_FLG();	// �݌Ƀ`�F�b�N�Ȃ��t���O
			List _tempCustOdrNo = struct.getList_l_CUST_ODR_NO();	// ���Ӑ撍���ԍ�
			List _tempCustCd = struct.getList_l_CUST_CD();	// ���Ӑ�R�[�h
			List _tempCustName = struct.getList_l_CUST_NAME();	// ���Ӑ於
			List _tempCustItemCd = struct.getList_l_CUST_ITEM_CD();	// ���Ӑ�i�ڔԍ�
			List _tempCustItemName = struct.getList_l_CUST_ITEM_NAME();	// ���Ӑ�i�ږ�

			List _tempStockUnit = struct.getList_l_STOCK_UNIT();	// �v�ʒP��
			List _tempUnitQtyTyp = struct.getList_l_UNIT_QTY_TYP();	// �݌ɐ��P�ʋ敪
			List _tempMrpOdrTyp = struct.getList_l_MRP_ODR_TYP();	// �i�ڎ�z�敪
			List _tempTransportTyp = struct.getList_l_TRANSPORT_TYP();	// �A���`�ԋ敪
			List _tempOdrUnitPrice = struct.getList_l_ODR_UNIT_PRICE();	// �󒍒P��
			List _tempSpclPriceTyp = struct.getList_l_SPCL_PRICE_TYP();	// ���l�敪
			List _tempPartialShipInstFlg = struct.getList_l_PARTIAL_SHIP_INST_FLG();	// ���[�o�׎w���t���O
			List _tempOdrCtlNo = struct.getList_l_ODR_CTL_NO();	// �󒍊Ǘ��ԍ�
			List _tAnsDlvDateModifyCount = struct.getList_l_MODIFY_COUNT();	// ���f�B�t�@�C�J�E���g

			if (_tempOdrNoLst != null) {
				_tempLstCnt = _tempOdrNoLst.size();
			} else {
				_tempLstCnt = 0;
			}

			for (int i = 0; i < _tempLstCnt; i++) {

				_tempStruct.setl_ODR_NO((String)_tempOdrNoLst.get(i));	// �󒍔ԍ�
				_tempStruct.setl_PART_DLV_SEQ_NO((String)_tempPartDlvSeqNo.get(i));	// ���[����
				_tempStruct.setl_ITEM_CD((String)_tempItemCd.get(i));	// �i�ڔԍ�
				_tempStruct.setl_ITEM_NAME((String)_tempItemName.get(i));	// �i�ږ�
				_tempStruct.setl_DESINATED_DLV_DATE((String)_tempDesinatedDlvDate.get(i));	// �w��[��
				_tempStruct.setl_DESINATED_SHIP_DATE((String)_tempDesinatedShipDate.get(i));	// �o�׎w���
				_tempStruct.setl_SHIP_QTY(numberUtil.encodeNumberFormat((String)_tempShipQty.get(i)));	// �o�׎w������
				_tempStruct.setl_REST_SHIP_QTY(numberUtil.encodeNumberFormat((String)_tempRestShipQty.get(i)));	// �o�׎w���c����
				_tempStruct.setl_WH_CD((String)_tempWhCd.get(i));	// �ۊǋ�R�[�h
				_tempStruct.setl_WH_NAME((String)_tempWhName.get(i));	// �ۊǋ於

				// ��ʏ��true/false��1or0�Ƃ���
				// �݌Ƀ`�F�b�N�Ȃ��t���O
				if (_tempCDirectDlvFlg.get(i).equals("true")) {
					_tempStruct.setl_c_DIRECT_DLV_FLG("1");
				} else {
					_tempStruct.setl_c_DIRECT_DLV_FLG("0");
				}

				_tempStruct.setl_CUST_ODR_NO((String)_tempCustOdrNo.get(i));	// ���Ӑ撍���ԍ�
				_tempStruct.setl_CUST_CD((String)_tempCustCd.get(i));	// ���Ӑ�R�[�h
				_tempStruct.setl_CUST_NAME((String)_tempCustName.get(i));	// ���Ӑ於
				_tempStruct.setl_CUST_ITEM_CD((String)_tempCustItemCd.get(i));	// ���Ӑ�i�ڔԍ�
				_tempStruct.setl_CUST_ITEM_NAME((String)_tempCustItemName.get(i));	// ���Ӑ�i�ږ�
				_tempStruct.setl_STOCK_UNIT((String)_tempStockUnit.get(i));	// �v�ʒP��
				_tempStruct.setl_UNIT_QTY_TYP((String)_tempUnitQtyTyp.get(i));	// �݌ɐ��P�ʋ敪
				_tempStruct.setl_MRP_ODR_TYP((String)_tempMrpOdrTyp.get(i));	// �i�ڎ�z�敪
				_tempStruct.setl_TRANSPORT_TYP((String)_tempTransportTyp.get(i));	// �A���`�ԋ敪
				_tempStruct.setl_ODR_UNIT_PRICE(numberUtil.encodeNumberFormat((String)_tempOdrUnitPrice.get(i)));	// �󒍒P��
				_tempStruct.setl_SPCL_PRICE_TYP((String)_tempSpclPriceTyp.get(i));	// ���l�敪
				_tempStruct.setl_PARTIAL_SHIP_INST_FLG((String)_tempPartialShipInstFlg.get(i));	// ���[�o�׎w���t���O
				_tempStruct.setl_ODR_CTL_NO((String)_tempOdrCtlNo.get(i));	// �󒍊Ǘ��ԍ�
				_tempStruct.settAnsDlvDate_MODIFY_COUNT((String)_tAnsDlvDateModifyCount.get(i));	// ���f�B�t�@�C�J�E���g

				entity.mtbl_SHIP_T.create(conn, _tempStruct);
			}

			this.conn.commit();


      // �ϐ����N���A���Ă����B
			_tempLstCnt = 0;
			_tempStruct.clear();

			// �i�ځA�ۊǋ�A�o�׎w����A�󒍔ԍ��A���[���ԂŃ\�[�g����
			// struct�͎��s�����r�p�k�ɉe�����Ȃ�
			List _tempShipList = entity.mtbl_SHIP_T.read(conn, struct);
			int _tempShipLstCnt = getListsize(_tempShipList);


			// ��s���Ƃɏo�׎w���������s��

			// �����A���[�j���O�A���s�J�E���g
			int[] status = new int[3];
			status[0] = 0; // ��������
			status[1] = 0; // ���[�j���O����
			status[2] = 0; // ���s����

			for(int i = 0; i < _tempShipLstCnt; i++) {


			// �g�����U�N�V�����X�^�[�g
			this.conn.beginTransWeb();
				
				boolean success = true; // �����^���s
				boolean warning = false; // ���[�j���O
				ArrayList _errorlst = new ArrayList();
				
				try {

				// �ϐ��i�[
				_tempStruct.setl_ODR_NO(((KU0060010Struct)_tempShipList.get(i)).getl_ODR_NO());	// �󒍔ԍ�
				_tempStruct.setl_PART_DLV_SEQ_NO(((KU0060010Struct)_tempShipList.get(i)).getl_PART_DLV_SEQ_NO());	// ���[����
				_tempStruct.setl_ITEM_CD(((KU0060010Struct)_tempShipList.get(i)).getl_ITEM_CD()); // �i�ڔԍ�
				_tempStruct.setl_ITEM_NAME(((KU0060010Struct)_tempShipList.get(i)).getl_ITEM_NAME()); // �i�ږ�
				_tempStruct.setl_DESINATED_DLV_DATE(((KU0060010Struct)_tempShipList.get(i)).getl_DESINATED_DLV_DATE());	// �w��[��
				_tempStruct.setl_DESINATED_SHIP_DATE(((KU0060010Struct)_tempShipList.get(i)).getl_DESINATED_SHIP_DATE());	// �o�׎w���
				_tempStruct.setl_SHIP_QTY(((KU0060010Struct)_tempShipList.get(i)).getl_SHIP_QTY());	// �o�׎w������
				_tempStruct.setl_REST_SHIP_QTY(((KU0060010Struct)_tempShipList.get(i)).getl_REST_SHIP_QTY());	// �o�׎w���c����
				_tempStruct.setl_WH_CD(((KU0060010Struct)_tempShipList.get(i)).getl_WH_CD());	// �ۊǋ�R�[�h
				_tempStruct.setl_WH_NAME(((KU0060010Struct)_tempShipList.get(i)).getl_WH_NAME());	// �ۊǋ於
				_tempStruct.setl_c_DIRECT_DLV_FLG(((KU0060010Struct)_tempShipList.get(i)).getl_c_DIRECT_DLV_FLG());	// �݌Ƀ`�F�b�N�t���O
				_tempStruct.setl_CUST_ODR_NO(((KU0060010Struct)_tempShipList.get(i)).getl_CUST_ODR_NO());	// ���Ӑ撍���ԍ�
				_tempStruct.setl_CUST_CD(((KU0060010Struct)_tempShipList.get(i)).getl_CUST_CD());	// ���Ӑ�R�[�h
				_tempStruct.setl_CUST_NAME(((KU0060010Struct)_tempShipList.get(i)).getl_CUST_NAME());	// ���Ӑ於
				_tempStruct.setl_CUST_ITEM_CD(((KU0060010Struct)_tempShipList.get(i)).getl_CUST_ITEM_CD());	// ���Ӑ�i�ڔԍ�
				_tempStruct.setl_CUST_ITEM_NAME(((KU0060010Struct)_tempShipList.get(i)).getl_CUST_ITEM_NAME());	// ���Ӑ�i�ږ�
				_tempStruct.setl_STOCK_UNIT(((KU0060010Struct)_tempShipList.get(i)).getl_STOCK_UNIT());	// �v�ʒP��
				_tempStruct.setl_UNIT_QTY_TYP(((KU0060010Struct)_tempShipList.get(i)).getl_UNIT_QTY_TYP());	// �݌ɐ��P�ʋ敪
				_tempStruct.setl_MRP_ODR_TYP(((KU0060010Struct)_tempShipList.get(i)).getl_MRP_ODR_TYP());	// �i�ڎ�z�敪
				_tempStruct.setl_TRANSPORT_TYP(((KU0060010Struct)_tempShipList.get(i)).getl_TRANSPORT_TYP());	// �A���`�ԋ敪
				_tempStruct.setl_ODR_UNIT_PRICE(((KU0060010Struct)_tempShipList.get(i)).getl_ODR_UNIT_PRICE());	// �󒍒P��
				_tempStruct.setl_SPCL_PRICE_TYP(((KU0060010Struct)_tempShipList.get(i)).getl_SPCL_PRICE_TYP());	// ���l�敪
				_tempStruct.setl_PARTIAL_SHIP_INST_FLG(((KU0060010Struct)_tempShipList.get(i)).getl_PARTIAL_SHIP_INST_FLG());	// ���[�o�׎w���t���O
				_tempStruct.setl_ODR_CTL_NO(((KU0060010Struct)_tempShipList.get(i)).getl_ODR_CTL_NO());	// �󒍊Ǘ��ԍ�
				_tempStruct.setShipt_MODIFY_COUNT(((KU0060010Struct)_tempShipList.get(i)).getShipt_MODIFY_COUNT());	// ���f�B�t�@�C�J�E���g
				_tempStruct.setl_SPCL_PRICE_TYP(((KU0060010Struct)_tempShipList.get(i)).getl_SPCL_PRICE_TYP());	// ���l�敪
				_tempStruct.setl_JOB_ODR_CD(((KU0060010Struct)_tempShipList.get(i)).getl_JOB_ODR_CD());	// ���� 

				// �Ǎ����̍X�V�񐔂ƈقȂ�ꍇ�̓G���[
				List _modifycountlist = entity.mMODIFY_COUNT_T_ANS_DLV_DATE.read(conn, _tempStruct);
				KU0060010Struct _modifycount = (KU0060010Struct) _modifycountlist.get(0);

				if (!_modifycount.gettAnsDlvDate_MODIFY_COUNT().equals(_tempStruct.getShipt_MODIFY_COUNT())) {
					ExpjMessage emsg = new ExpjMessage("KU00088");
					_errorlst.add(emsg);
					throw new ExpjBadException();
				}
				_modifycountlist.clear();

				//�ۊǋ摶�݉�
				// =======================================
				//��ʂ�����͂����q�ɂ̃}�X�^���݃`�F�b�N
				// =======================================

				_tempStruct.setchkis_IN_WHCD(_tempStruct.getl_WH_CD());
				List listchkisinWhCd = entity.mchkIsInWhCd.read(conn, _tempStruct);

				if (listchkisinWhCd == null || listchkisinWhCd.size() != 1) {
					//���݂��Ȃ��Ƃ���������ꍇ�G���[���b�Z�[�W�̏o��
					ExpjMessage emsg = new ExpjMessage("KA00116");
					_errorlst.add(emsg);
					throw new ExpjBadException();
				}
				listchkisinWhCd.clear();

				if (!"1".equals(_tempStruct.getl_c_DIRECT_DLV_FLG())) {
					//�����ȊO�̏ꍇ

					// =======================================
					//�݌Ƀ`�F�b�N
					// =======================================

					List listchkWhCd = null;

					// �ϐ��Z�b�g
					_tempStruct.setchkisWhCd_IN_ITEMCD(_tempStruct.getl_ITEM_CD());
					_tempStruct.setchkisWhCd_IN_WHCD(_tempStruct.getl_WH_CD());
					
					// �i�ڍ݌ɂ��`�F�b�N����
					listchkWhCd = entity.mchkIsWhCd.read(conn, _tempStruct);

					if (listchkWhCd == null || listchkWhCd.size() != 1) {
							ExpjMessage emsg = new ExpjMessage("KU00032");
							_errorlst.add(emsg);
							throw new ExpjBadException();
					} else {
						//�L���݌ɐ��ʂ��擾���ďo�׎w�����Ɣ�r�`�F�b�N
						double intPblShipQty = Double.parseDouble(((KU0060010Struct)listchkWhCd.get(0)).getchkisWhCd_PBL_SHIP_QTY());

						if (intPblShipQty < Double.parseDouble(_tempStruct.getl_SHIP_QTY())) {
							//�L���݌ɐ���<�o�׎w������
							ExpjMessage emsg = new ExpjMessage("KU00032");
							_errorlst.add(emsg);
							throw new ExpjBadException();
						}
					}
					listchkWhCd.clear();
				}

				// =======================================
        // �x���`�F�b�N
        // =======================================
				_tempStruct.settWH_CD(_tempStruct.getl_WH_CD());
				_tempStruct.settCAL_DATE(_tempStruct.getl_DESINATED_SHIP_DATE());

        List listM_CAL = entity.mtblM_CAL.read(conn, _tempStruct);

				if(!listM_CAL.isEmpty()){
        	if ("1".equals(((KU0060010Struct)listM_CAL.get(0)).gettHOLIDAY_FLG())) {
            ExpjMessage emsg = new ExpjMessage("KU02005");
						_errorlst.add(emsg);
						throw new ExpjBadException();
           }
				}
				listM_CAL.clear();

				// =======================================
				// �����Ǘ��`�F�b�N
				// �o�׎w�����ʂ��������͂̂Ƃ��؂�グ
        // =======================================

				if ("1".equals(_tempStruct.getl_UNIT_QTY_TYP())) {
					// �����Ǘ�
					if (_tempStruct.getl_SHIP_QTY().indexOf(".") >= 0) {
						// �������͂̏ꍇ�F�؏グ
						String tempString = _tempStruct.getl_SHIP_QTY();
						double tempDouble1 = Double.parseDouble(tempString);
						_tempStruct.setl_SHIP_QTY(Calculate.ceil(_tempStruct.getl_SHIP_QTY(), 0));
						double tempDouble2 = Double.parseDouble(_tempStruct.getl_SHIP_QTY());
						if (tempDouble1 != tempDouble2) {
							// ".0"���͏��O
							warning = true;
							ExpjMessage emsg = new ExpjMessage("KQ20004");
							msgStruct.addWarn(emsg);
						}
					}
				}

				// =======================================
				// �o�׎w���s�a�k�̍쐬
				// =======================================

				//�o�׎w���ԍ��A�`�[�ԍ��������̔Ԃ���
				SHIP_ODR_NO = new Numbering(conn,Numbering.SHIP_ODR_NO, struct.getsUser_ID(),"KU0060010",struct.getstrPLANT_CD());
				SLIP_CD = new Numbering(conn,Numbering.SLIP_CD,struct.getsUser_ID(),"KU0060010",struct.getstrPLANT_CD());
				String strSHIP_ODR_NO = SHIP_ODR_NO.getNo();
				String strSLIP_CD = SLIP_CD.getNo();

				//�󒍖��׃e�[�u��������擾
				_tempStruct.settOdr_IN_ODRNO(_tempStruct.getl_ODR_NO());
				List listT_ODR = entity.mtbl_T_ODR.read(conn, _tempStruct);
				if(listT_ODR == null || listT_ODR.size()==0){
				}

				String strOdrCtl = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_ODR_CTL_NO()); //�󒍊Ǘ��ԍ�
				String strCustOdrNo = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CUST_ODR_NO());//�ڋq�����ԍ�
				String strDlvLocCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_DLV_LOC_CD());//�[�i�ꏊ�R�[�h
				String strUnitPrice = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_ODR_UNIT_PRICE());//�P��
				String strCurrncyCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CURRNCY_CD());//�ʉ݃R�[�h
				String strRemarks = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_REMARKS());//���l
				String strDepoTyp = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_DEPO_TYP());//�a���q�ɋ敪
				String strTransportCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_TRANSPORT_CD());//�^���փR�[�h
				//String strTryMassPrdTyp = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_TRY_MASS_PRD_TYP());//����_�ʎY�敪
				String strCustChrgPsnCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CUST_CHRG_PSN_CD());//�c�ƒS���҃R�[�h
				String strUnitCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_UNIT_CD());	//�P��
        String strEXCH_TYP = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_EXCH_TYP()); //�ב֎��

				//�o�ד`�[�p
				String strPartName = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_PART_NAME());//�i��
				String strDlvLocNameKanji = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_DLV_LOC_NAME_KANJI());//�[�i�ꏊ��(����)
				String strBuyerName = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_BUYER_NAME());//�w���S��
				String strCusDlvCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CUS_DLV_CD());//�[��NO
				String strCusDlvKeyCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CUS_DLV_KEY_CD());//�[�i�L�[�ԍ�
				String strDesinatedDlvDate = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_DESINATED_DLV_DATE());//�w��[��
				String strPuchOdrQtyTotal =this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_PUCH_ODR_QTY_TOTAL());//����������
				String strDlvOdrQty =this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_ODR_QTY());//�[���w����
				String strUnitCdOrg =this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_UNIT_CD_ORG());//�P��(20040107�ϊ��O�P�ʂ���擾�Ɏd�l�ύX)->�o�ד`�[�A���x���p

				String strSlipPricdPringTyp = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_SLIP_PRICE_PRINT_TYP());//�[�i�����i�\���敪
				String strInspcTyp = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_INSPC_TYP());//�����敪
				String strClientRemark = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CLIENT_REMARK());	//�����Ҕ��l
				String strClientRemarkKanji = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CLIENT_REMARK_KANJI());	//�����Ҕ��l(����)
				String strClientBarcodeInf = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CLIENT_BARCODE_INF());	//�����҃o�[�R�[�h���

				//�[�i�L�[�擾20040204
				String strIfCtlNo = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_BUYER_NAME());//IF�Ǘ��ԍ�
				String strShipCnt = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_SHIP_CNT());//�o�׉�

				//�ݒ�p�[�i�L�[�ԍ�
				String strDlvKeyNo = "";
				if("".equals(strCusDlvKeyCd) || strCusDlvKeyCd ==null){
					//�[�i�L�[�ԍ��̒l�������ꍇ
					strDlvKeyNo = strSHIP_ODR_NO;
				}else{
					strDlvKeyNo = strCusDlvKeyCd;
				}
				listT_ODR.clear();

				//�󒍊Ǘ��e�[�u��������擾

				_tempStruct.settOdrCtl_IN_ODRCTLNO(strOdrCtl);
				List listT_ODR_CTL = entity.mtbl_T_ODR_CTL.read(conn, _tempStruct);
				if(listT_ODR_CTL == null || listT_ODR_CTL.size()==0){
					//�G���[����
				}
				String strCustCd = this.replaceNull(((KU0060010Struct)listT_ODR_CTL.get(0)).gettOdrCtl_CUST_CD());//�ڋq�R�[�h

				listT_ODR_CTL.clear();


				//�i�ڃ}�X�^������擾
				_tempStruct.setmItem_IN_ITEMCD(_tempStruct.getl_ITEM_CD());
				List listM_ITEM = entity.mtbl_M_ITEM.read(conn, _tempStruct);
				if(listM_ITEM == null || listM_ITEM.size()==0){
					//�G���[����
				}
				String strPkgUnitQty = this.replaceNull(((KU0060010Struct)listM_ITEM.get(0)).getmItem_PKG_UNIT_QTY());//�׎p�P�ʐ�
				String strUnitWeight = this.replaceNull(((KU0060010Struct)listM_ITEM.get(0)).getmItem_UNIT_WEIGHT());//�P�ʏd��

				listM_ITEM.clear();


				//�ڋq�[�i�ꏊ����^�������̎擾
				//�L�[:��ЃR�[�h�A�ڋq�R�[�h�A�[�i�ꏊ�R�[�h

				String strTransportLt = "0";
				_tempStruct.setmCustBase_IN_COMPANYCD(strCompanyCd);
				_tempStruct.setmCustBase_IN_CUSTCD(strCustCd);
				_tempStruct.setmCustBase_IN_DLVLOCCD(strDlvLocCd);

				List listMCustBase = entity.mtbl_M_CUST_BASE.read(conn,_tempStruct);
				if(listMCustBase == null || listMCustBase.size() != 1){
					//�G���[����
				}else{
					strTransportLt = this.replaceNull(((KU0060010Struct)listMCustBase.get(0)).getmCustBase_TRANSPORT_LT());
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

				_tempStruct.setmCust_IN_COMPANYCD(strCompanyCd);
				_tempStruct.setmCust_IN_CUSTCD(strCustCd);
				List listMCust = entity.mtbl_M_CUST.read(conn,_tempStruct);
				if(listMCust == null || listMCust.size() != 1){
					//�G���[����
				}else{
					strCust_Aname = this.replaceNull(((KU0060010Struct)listMCust.get(0)).getmCust_CUST_ANAME());
          strCust_DETAIL_ROUND_TYP = this.replaceNull(((KU0060010Struct)listMCust.get(0)).getmCust_DETAIL_ROUND_TYP().toString());
          		//Add Start 20131220 zhang-jq
          		strINSPC_ACPT_TYP = ((KU0060010Struct)listMCust.get(0)).getmCust_INSPC_ACPT_TYP();
          		_tempStruct.setmCust_INSPC_ACPT_TYP(strINSPC_ACPT_TYP);
          		//Add End 20131220 zhang-jq
				}


				//�o�׎w���e�[�u���ݒ�
				_tempStruct.setin_tShipOdr_SHIP_ODR_NO(strSHIP_ODR_NO);			//�o�׎w���ԍ�
				_tempStruct.setin_tShipOdr_ODR_NO(_tempStruct.getl_ODR_NO());			//�󒍔ԍ�
				_tempStruct.setin_tShipOdr_PART_DLV_SEQ_NO(_tempStruct.getl_PART_DLV_SEQ_NO());	//���[����
				_tempStruct.setin_tShipOdr_SLIP_CD(strSLIP_CD);				//�`�[�ԍ�
				_tempStruct.setin_tShipOdr_ITEM_CD(_tempStruct.getl_ITEM_CD());			//�i��
				_tempStruct.setin_tShipOdr_CUST_ITEM_CD(_tempStruct.getl_CUST_ITEM_CD());		//�ڋq�i��
				_tempStruct.setin_tShipOdr_CUST_ODR_NO(strCustOdrNo);			//�ڋq�����ԍ�
				_tempStruct.setin_tShipOdr_CUST_CD(strCustCd);				//�ڋq�R�[�h
				_tempStruct.setin_tShipOdr_CUST_NAME(strCust_Aname);			//�ڋq����
				_tempStruct.setin_tShipOdr_CUST_CHRG_PSN_CD(strCustChrgPsnCd);		//�c�ƒS���҃R�[�h
				_tempStruct.setin_tShipOdr_SHIP_ODR_ISS_PSN_CD(struct.getstrUSER_CD());	//���s�S���҃R�[�h(1212-LOGIN���[�U��CD)
				_tempStruct.setin_tShipOdr_DLV_LOC_CD(strDlvLocCd);			//�[�i�ꏊ�R�[�h
				_tempStruct.setin_tShipOdr_DEPO_TYP(strDepoTyp);				//�a���q�ɋ敪
				_tempStruct.setin_tShipOdr_DESINATED_SHIP_DATE(_tempStruct.getl_DESINATED_SHIP_DATE());	//�o�׎w���
				_tempStruct.setin_tShipOdr_SHIP_QTY(_tempStruct.getl_SHIP_QTY());		//�o�׎w������
				_tempStruct.setin_tShipOdr_UNIT_CD(strUnitCd);				//�P��
				_tempStruct.setin_tShipOdr_UNIT_PRICE(strUnitPrice);			//�P��
				String strAmount = this.calMultiply(conn,_tempStruct.getl_SHIP_QTY(), strUnitPrice);
				_tempStruct.setin_tShipOdr_JOB_ODR_CD(_tempStruct.getl_JOB_ODR_CD());			//����

				String strShipOdrAmount = "";
        String strShipOdrAmountExchRates = "";

        ExchAmount ex = new ExchAmount(conn);

        if(ex.doMarume(strAmount, struct.getstrCOMPANY_CD(), strCurrncyCd, strEXCH_TYP, strCust_DETAIL_ROUND_TYP, struct.getstrBUSINESS_OPR_DATE())){
					strShipOdrAmount = ex.getS_EXCH_AMOUNT();
				}else{
					ExpjMessage emsg = new ExpjMessage("KQ00038");
					_errorlst.add(emsg);
					throw new ExpjBadException();
        }

				if(ex.doExchAmount(strShipOdrAmount, struct.getstrCOMPANY_CD(), strCurrncyCd, strEXCH_TYP, strCust_DETAIL_ROUND_TYP, struct.getstrBUSINESS_OPR_DATE())){
                    strShipOdrAmountExchRates = ex.getS_EXCH_AMOUNT();
				}else{
					ExpjMessage emsg = new ExpjMessage("KQ00038");
					_errorlst.add(emsg);
					throw new ExpjBadException();

				}

				_tempStruct.setin_tShipOdr_SHIP_ODR_AMOUNT(new Double(strShipOdrAmount));			//�o�׎w�����z(�o�׎w�����ʁ��P��)
				_tempStruct.setin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(new Double(strShipOdrAmountExchRates));

				_tempStruct.setin_tShipOdr_CURRNCY_CD(strCurrncyCd);			//�ʉ݃R�[�h

				//�����A�����A�[���A�����̌v�Z
				_tempStruct.setin_tShipOdr_PKG_UNIT_QTY(strPkgUnitQty);			//����

				_tempStruct.setin_tShipOdr_REMARKS(strRemarks);				//���l
				_tempStruct.setin_tShipOdr_TRANSPORT_CD(strTransportCd);			//�^���փR�[�h
				_tempStruct.setin_tShipOdr_ALLCT_WH_CD(_tempStruct.getl_WH_CD());			//�����ۊǋ�(�o�בq��)
				_tempStruct.setin_tShipOdr_ENTRY_TYP("2");				//�f�[�^���͋敪(���:2)
				_tempStruct.setin_tShipOdr_PRINT_FLG("0");				//���[�o��F
				_tempStruct.setin_tShipOdr_SHP_CMPLT_FLG("0");				//���я���F
				_tempStruct.setin_tShipOdr_DEL_FLG("0");				//�폜�e
				_tempStruct.setin_tShipOdr_DIRECT_DLV_FLG(_tempStruct.getl_c_DIRECT_DLV_FLG());		//����F

				//�[���\���(�o�ח\����{�^�������{�o�׏���LT)
				int iAddDays = Integer.parseInt(strTransportLt) +  Integer.parseInt(strSyuKaLt) ;
				String strAddDays = String.valueOf(iAddDays);
				
				String strScdlDlvDate = this.getScdlDlvDate(_tempStruct,_tempStruct.getl_DESINATED_SHIP_DATE(),strAddDays);
				if(strScdlDlvDate == null) {
					ExpjMessage emsg = new ExpjMessage("KQ00040");
					_errorlst.add(emsg);
					throw new ExpjBadException();
				}
				_tempStruct.setin_tShipOdr_SCDL_DLV_DATE(this.replaceNull(strScdlDlvDate));

				//�U�֐�ۊǋ�(�a���q��)
				// [�󒍖���]."�a���q�ɋ敪"���P�O�i�ʏ�j�FNull
				// [�󒍖���]."�a���q�ɋ敪"���Q�O�i�a���j�F[���Ӑ�[�i�ꏊ]."���o�a���ۊǋ�"
				if(!m_kNORMAL_DEPOTYP.equals(strDepoTyp)
						&& m_kYOTO_DEPOTYP.equals(strDepoTyp)){
						_tempStruct.setstrYotaku_IN_WH_TYP(strDepoTyp);

					String strYoWhCd = this.replaceNull(((KU0060010Struct)listMCustBase.get(0)).getmCustBase_DEPO_WH_CD());
					_tempStruct.setin_tShipOdr_TRANSFER_WH_CD(strYoWhCd);
				}
				//�[�i�L�[�ԍ�
				_tempStruct.setin_tShipOdr_DLV_KEY_NO(strDlvKeyNo);


				//�o�׎w�����R�[�h�쐬
				int rv = entity.mtbl_T_SHIP_ODR.create(conn, _tempStruct);
				
				// �o�׎w���s�폜
				if (rv == 1) {
					deleteUnShipList( _tempStruct.getin_tShipOdr_ODR_NO(), _tempStruct.getin_tShipOdr_PART_DLV_SEQ_NO() );
				}
					
				// =======================================
				// �󒍖���TBL�̍X�V
				// =======================================
				//�󒍔ԍ��P�ʂŏo�׉񐔂��X�V����B(�o�׉�+1)
				_tempStruct.setuptOdr_IN_ODRNO(_tempStruct.getl_ODR_NO());
				_tempStruct.setuptOdr_SHIP_CNT(Integer.parseInt(strShipCnt)+1+"");
				_tempStruct.setuptOdr_PART_DLV_COUNT(1+"");
				rv = entity.mupdateT_ODR.update(conn,_tempStruct);

				// =======================================
				// �o�ד`�[�s�a�k�̍쐬
				// =======================================

				_tempStruct.setin_tShipSlip_SLIP_CD(strSLIP_CD);					//�`�[�ԍ�
				_tempStruct.setin_tShipSlip_ITEM_CD(_tempStruct.getl_ITEM_CD());				//�i��
				_tempStruct.setin_tShipSlip_CUST_ITEM_CD(_tempStruct.getl_CUST_ITEM_CD());			//�ڋq�i��
				_tempStruct.setin_tShipSlip_PART_NAME(strPartName);				//�i��
				_tempStruct.setin_tShipSlip_CUST_ODR_NO(strCustOdrNo);				//�ڋq�����ԍ�
				_tempStruct.setin_tShipSlip_CUST_CD(strCustCd);					//�ڋq�R�[�h
				_tempStruct.setin_tShipSlip_CUST_NAME(strCust_Aname);				//�ڋq����(�ڋq���̂�ݒ�)
				_tempStruct.setin_tShipSlip_DLV_LOC_CD(strDlvLocCd);				//�[�i�ꏊ�R�[�h
				_tempStruct.setin_tShipSlip_DLV_LOC_NAME_KANJI(strDlvLocNameKanji);			//�[�i�ꏊ��(����)
				_tempStruct.setin_tShipSlip_BUYER_NAME(strBuyerName);				//�w���S��
				_tempStruct.setin_tShipSlip_CUS_DLV_KEY_CD(strDlvKeyNo);				//�[�i�L�[�ԍ�(20040204�d�l�ύX)
				_tempStruct.setin_tShipSlip_DESINATED_SHIP_DATE(_tempStruct.getl_DESINATED_SHIP_DATE());	//�o�׎w���
				_tempStruct.setin_tShipSlip_DESINATED_DLV_DATE(strDesinatedDlvDate);			//�w��[��
				_tempStruct.setin_tShipSlip_SCDL_DLV_DATE(strScdlDlvDate);				//�[���\���
				_tempStruct.setin_tShipSlip_PUCH_ODR_QTY_TOTAL(strPuchOdrQtyTotal);			//����������
				_tempStruct.setin_tShipSlip_DLV_ODR_QTY(strDlvOdrQty);				//�[���w������
				_tempStruct.setin_tShipSlip_SHIP_ODR_QTY(_tempStruct.getl_SHIP_QTY());		//�o�׎w������
				_tempStruct.setin_tShipSlip_UNIT_CD(strUnitCdOrg);					//�P��(�ݒ�l�ύX)
				_tempStruct.setin_tShipSlip_UNIT_PRICE(strUnitPrice);				//�P��

				_tempStruct.setin_tShipSlip_INSPC_TYP(strInspcTyp);					//�����敪
				_tempStruct.setin_tShipSlip_CLIENT_REMARK_KANJI(strClientRemark);			//�����Ҕ��l
				_tempStruct.setin_tShipSlip_CLIENT_BARCODE_INF(strClientBarcodeInf);			//�����҃o�[�R�[�h���
				_tempStruct.setin_tShipSlip_PRINT_FLG("0");					//���[�o��F
				_tempStruct.setin_tShipSlip_DEL_FLG("0");					//�폜F

				//����ŋ��z�v�Z

				String taxAmount[] = this.doCalcuTaxAmount(_tempStruct, strCustCd, strCompanyCd, _tempStruct.getl_ITEM_CD(), strShipOdrAmount, strCurrncyCd);

				_tempStruct.setin_tShipSlip_TAX_AMOUNT_1(taxAmount[0]);		// �Ŋz�P
				_tempStruct.setin_tShipSlip_TAX_AMOUNT_2(taxAmount[1]);		// �Ŋz�Q
				_tempStruct.setin_tShipSlip_TAX_AMOUNT_3(taxAmount[2]);		// �Ŋz�R

				_tempStruct.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT("0");	// �O�őΏۋ��z
				_tempStruct.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT("0");	// ���őΏۋ��z
				_tempStruct.setin_tShipSlip_TAXFREE_SALES_AMOUNT("0");		// ��ېőΏۋ��z
				_tempStruct.setin_tShipSlip_EXTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i�O�Łj
				_tempStruct.setin_tShipSlip_INTERNAL_TAX_AMOUNT("0");		// ����Ŋz�i���Łj

				String sTmpTax = Calculate.add(taxAmount[0], taxAmount[1]);
				sTmpTax = Calculate.add(sTmpTax, taxAmount[2]);
				double tmpTax = Double.parseDouble(sTmpTax);
				
				if ("1".equals(this.TAX_KBN)){
					_tempStruct.setin_tShipSlip_EXTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
					_tempStruct.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
				} else
				if ("5".equals(this.TAX_KBN) || "9".equals(this.TAX_KBN)){
					_tempStruct.setin_tShipSlip_INTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
					_tempStruct.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
				} else
				if ("0".equals(this.TAX_KBN)){
					_tempStruct.setin_tShipSlip_TAXFREE_SALES_AMOUNT(strShipOdrAmount);
				}

				tmpTax = Double.parseDouble(_tempStruct.getin_tShipSlip_EXTERNAL_TAX_AMOUNT())
						+Double.parseDouble(_tempStruct.getin_tShipSlip_INTERNAL_TAX_AMOUNT());
				_tempStruct.setin_tShipSlip_TAX_AMOUNT(String.valueOf(tmpTax));			//����ŋ��z(�~��)-�ݒ薳��

				tmpTax = Double.parseDouble(_tempStruct.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT())
						+Double.parseDouble(_tempStruct.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT())
						+Double.parseDouble(_tempStruct.getin_tShipSlip_TAXFREE_SALES_AMOUNT())
						-Double.parseDouble(_tempStruct.getin_tShipSlip_INTERNAL_TAX_AMOUNT());

				_tempStruct.setin_tShipSlip_TAX_CREDIT_SALES_AMOUNT(String.valueOf(tmpTax));	// �Ŕ�������z

        String tmpTaxExchRates = "0";
        if(ex.doExchAmount(String.valueOf(tmpTax), struct.getstrCOMPANY_CD(), strCurrncyCd, strEXCH_TYP, strCust_DETAIL_ROUND_TYP, struct.getstrBUSINESS_OPR_DATE())){
        	tmpTaxExchRates = ex.getS_EXCH_AMOUNT();
        }
				
				_tempStruct.setin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(tmpTaxExchRates);	// �Ŕ�������z�i�M�݁j

				_tempStruct.setin_tShipSlip_SHIP_ODR_AMOUNT(String.valueOf(tmpTax));	//�o�׎w�����z//sww�C��20040729
				tmpTax = tmpTax + Double.parseDouble(_tempStruct.getin_tShipSlip_TAX_AMOUNT());
				_tempStruct.setin_tShipSlip_SHIP_ODR_AMOUNT_TAX(String.valueOf(tmpTax));					//�o�׎w�����z(�ō�)

				//�o�ד`�[���R�[�h�쐬
				rv = entity.mtbl_T_SHIP_SLIP.create(conn, _tempStruct);

				// =======================================
				// �o�׌v��s�a�k�̍X�V
				// =======================================

				_tempStruct.setup_tAnsDlvDate_DESINATED_SHIP_DATE(_tempStruct.getl_DESINATED_SHIP_DATE());//�o�׎w����
				_tempStruct.setup_tAnsDlvDate_REST_SHIP_ODR_QTY(_tempStruct.getl_SHIP_QTY());//�o�׎w���c����(�I���N���Őݒ�)
				_tempStruct.setup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(_tempStruct.getl_SHIP_QTY());//�o�׎w�������e(�I���N���Őݒ�)

				_tempStruct.setup_tAnsDlvDate_IN_ODRNO(_tempStruct.getl_ODR_NO());					//�󒍔ԍ�
				_tempStruct.setup_tAnsDlvDate_IN_PARTDLVSEQNO(_tempStruct.getl_PART_DLV_SEQ_NO());	//���[����

				//�o�׌v�惌�R�[�h�X�V
				rv = entity.mtbl_T_ANS_DLV_DATE.update(conn, _tempStruct);

				// �����A���[�j���O�A���s�J�E���g
				if ( warning == true) {
					// ���[�j���O
					status[0] = status[0] + 1;
					status[1] = status[1] + 1;
				} else if (success == true) {
					// ����
					status[0] = status[0] + 1;
				}

				} catch (ExpjBadException eb) {
					// �o�׎w�����s
					status[2] += 1;

					// ���ڐݒ�ݒ�
					setTUnShipList(_tempStruct, _errorlst);

					String UnShipSeqNo = getTUnShipListUnShipSeqNo(_tempStruct.getl_ODR_NO(),_tempStruct.getl_PART_DLV_SEQ_NO());
					if (UnShipSeqNo == null) {
						// �ϐ��i�[
						List _tUnShipLst = entity.mtbl_T_UN_SHIP_LIST.read(conn, _tempStruct);
						_tempStruct.settUnShipList_UN_SHIP_SEQ_NO(((KU0060010Struct)_tUnShipLst.get(0)).gettUnShipList_UN_SHIP_SEQ_NO()); // �o�׎w���s�Ǘ��ԍ�
						_tempStruct.settUnShipList_ACPT_ODR_CD(_tempStruct.getl_ODR_NO()); // �󒍔ԍ�
						_tempStruct.settUnShipList_PART_DLV_SEQ_NO(_tempStruct.getl_PART_DLV_SEQ_NO()); // ���[����
						
						// �ǉ�
						entity.mtbl_T_UN_SHIP_LIST.create(conn, _tempStruct);
					} else {
						_tempStruct.settUnShipList_UN_SHIP_SEQ_NO(UnShipSeqNo); // �o�׎w���s�Ǘ��ԍ�
						// �X�V
						entity.mtbl_T_UN_SHIP_LIST.update(conn, _tempStruct);
					}
				}

				this.conn.commit();

			}
		// ��s���Ƃɏo�׎w�������I��


			// ���b�Z�[�W�i�[�p�z��
			String[] msgs = new String[4];
			msgs[0] = String.valueOf(_tempShipLstCnt);
			msgs[1] = String.valueOf(status[0]);
			msgs[2] = String.valueOf(status[1]);
			msgs[3] = String.valueOf(status[2]);


			ExpjMessage emsg = new ExpjMessage("KU00108",msgs); // �����^���[�j���O�^���s�����̕\��
			msgStruct.addInfo(emsg);

		controlSelect();

		}catch(SQLException e){

			e.printStackTrace();
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�

			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			throw ee;

		} catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
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

                //}}user_implement_dev:<controlInsert>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �I���폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {

			int _tempLstCnt = 0;	// �s��
			KU0060010Struct _tempStruct = new KU0060010Struct();
	
			// Orteus�W�����[�U�h�c���Z�b�g
			_tempStruct.setsUser_ID(struct.getsUser_ID());

			// �s���擾
			_tempLstCnt = getListsize(struct.getList_l_ODR_NO());
			
			String modifyCount = null;
			for (int i = 0; i < _tempLstCnt; i++) {

				// �g�����U�N�V�����X�^�[�g
				this.conn.beginTransWeb();

				_tempStruct.clear();

				_tempStruct.setl_SLIP_CD((String)struct.getList_l_SLIP_CD().get(i));			//�`�[�ԍ�
				_tempStruct.setl_ODR_NO((String)struct.getList_l_ODR_NO().get(i)); 			//�󒍔ԍ�
				_tempStruct.setl_PART_DLV_SEQ_NO((String)struct.getList_l_PART_DLV_SEQ_NO().get(i)); 	//���[����
				_tempStruct.setl_DESINATED_SHIP_DATE((String)struct.getList_l_DESINATED_SHIP_DATE().get(i));//�o�׎w����
				_tempStruct.setl_REST_SHIP_QTY((String)struct.getList_l_REST_SHIP_QTY().get(i));	//�o�׎w���c����
				_tempStruct.setl_SHIP_QTY((String)struct.getList_l_SHIP_QTY().get(i));//�o�׎w����
				_tempStruct.setl_WH_CD((String)struct.getList_l_WH_CD().get(i));			//�q��(�ۊǋ�)
				_tempStruct.setl_c_DIRECT_DLV_FLG((String)struct.getList_l_c_DIRECT_DLV_FLG().get(i));				//�����t���O
				_tempStruct.setl_MODIFY_COUNT((String)struct.getList_l_MODIFY_COUNT().get(i));				//�Ǎ����X�V��
				//�Ǎ����̍X�V�񐔂ƈقȂ�ꍇ�̓G���[
				List _modifycountlist = entity.mMODIFY_COUNT_T_SHIP_ODR.read(conn, _tempStruct);
				if(_modifycountlist.size() > 0){
					KU0060010Struct _modifycount = (KU0060010Struct) _modifycountlist.get(0);
					if (!_modifycount.getSHIP_MODIFY_COUNT().equals(_tempStruct.getl_MODIFY_COUNT())) {
						ExpjMessage emsg = new ExpjMessage("KU00088");
						msgStruct.addError(emsg);
						sysLog.warning(emsg, getsysUSER_CD());
	                    return;
					}
				}else{
					ExpjMessage emsg = new ExpjMessage("KU00088");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, getsysUSER_CD());
                    return;
				}
				_modifycountlist.clear();

				// ��ʏ��true/false��1or0�Ƃ���
				// �݌Ƀ`�F�b�N�Ȃ��t���O
				if (_tempStruct.getl_c_DIRECT_DLV_FLG().equals("true")) {
					_tempStruct.setl_c_DIRECT_DLV_FLG("1");
				} else {
					_tempStruct.setl_c_DIRECT_DLV_FLG("0");
				}
				
				_tempStruct.setl_ITEM_CD((String)struct.getList_l_ITEM_CD().get(i));			//�i��
				_tempStruct.setl_CUST_NAME((String)struct.getList_l_CUST_NAME().get(i));		//�ڋq����
				_tempStruct.setl_CUST_ITEM_CD((String)struct.getList_l_CUST_ITEM_CD().get(i));		//�ڋq�i��

				//�󒍖��ׂ���o�׉񐔂��擾
				String strOdrPartDlvCnt = "";
				_tempStruct.settOdr_IN_ODRNO(_tempStruct.getl_ODR_NO());
				List listT_ODR = entity.mtbl_T_ODR.read(conn, _tempStruct);
				if(listT_ODR == null || listT_ODR.size()==0){
					//�G���[����
				}else{
					strOdrPartDlvCnt = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_PART_DLV_COUNT());//���[��
				}

				// =======================================
				// �o�׌v��s�a�k�̍X�V
				// =======================================
				_tempStruct.settori_tAnsDlvDate_IN_ODRNO(_tempStruct.getl_ODR_NO());
				_tempStruct.settori_tAnsDlvDate_IN_PARTDLVSEQNO(_tempStruct.getl_PART_DLV_SEQ_NO());
				_tempStruct.settori_tAnsDlvDate_REST_SHIP_ODR_QTY(_tempStruct.getl_SHIP_QTY());// �o�׎w������+
				_tempStruct.settori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG("0");
				// �r������
				modifyCount = (String)struct.getList_l_DLV_MODIFY_COUNT().get(i);
				List dlvModifyCountList = entity.mSELECT_DLV_MODIFY_COUNT.read(conn, _tempStruct);
				if (dlvModifyCountList.isEmpty()) {
					ExpjMessage emsg = new ExpjMessage("ZZ01105");
					msgStruct.addError(emsg);
					conn.rollback();
					return;
				}else{
					KU0060010Struct dlvModifyCountStruct = (KU0060010Struct)dlvModifyCountList.get(0);
					if (modifyCount != null && !"".equals(modifyCount) && !modifyCount.equals(dlvModifyCountStruct.getSEL_MODIFY_COUNT())) {
						ExpjMessage emsg = new ExpjMessage("ZZ01105");
						msgStruct.addError(emsg);
						conn.rollback();
						return;
					}
				}
				int rv = entity.mtoriTbl_T_ANS_DLV_DATE.update(conn,_tempStruct);


				// =======================================
				// �o�׎w���s�a�k�̎��(�����폜)
				// =======================================
				_tempStruct.setdel_tShipOdr_IN_SLIPCD(_tempStruct.getl_SLIP_CD());
				rv = entity.mtbl_T_SHIP_ODR.delete(conn,_tempStruct);

				// =======================================
				// �󒍖���TBL�̍X�V
				// =======================================
				_tempStruct.setuptOdr_IN_ODRNO(_tempStruct.getl_ODR_NO());
				_tempStruct.setuptOdr_PART_DLV_COUNT(Integer.parseInt(strOdrPartDlvCnt)-1+"");
				rv = entity.mtbl_T_ODR.update(conn,_tempStruct);


				// =======================================
				// �o�ד`�[�s�a�k�̎��(�����폜)
				// =======================================
				_tempStruct.setdel_tShipSlip_IN_SLIPCD(_tempStruct.getl_SLIP_CD());
				rv = entity.mtbl_T_SHIP_SLIP.delete(conn,_tempStruct);


			this.conn.commit();

			}	// for end

			_tempStruct = null;
				
			controlSelect();

	  	////////// ���Ɩ����W�b�N�� //////////

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
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			initializeStruct();
			list = null;
			controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �o�׎w�������e�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlScrmvToShipDir() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlScrmvToShipDir");
			//{{user_implement_dev:<controlScrmvToShipDir>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlScrmvToShipDir>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlScrmvToShipDir");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
		try{
			struct.seth_RESULT("NG");
			// ���[�h�ݒ�
			
			// =======================================
			// ���Џ��̎擾
			// =======================================

			strCompanyCd = getstrCompanyCd(struct);

			// =======================================
			// �Ɩ����t�̎擾
			// =======================================
			List listGyomuDate = entity.mgetGyomuDate.read(conn,struct);
			if(listGyomuDate == null || listGyomuDate.size() != 1){
				//�Ɩ����t��񂪖���/������
				ExpjMessage emsg = new ExpjMessage("KR00017");
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}else{
				struct.setstrBUSINESS_OPR_DATE(((KU0060010Struct)listGyomuDate.get(0)).getstrBUSINESS_OPR_DATE());
				struct.setstrPLANT_CD(((KU0060010Struct)listGyomuDate.get(0)).getstrPLANT_CD());
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
				struct.setstrUSER_NAME(((KU0060010Struct)listUserInfo.get(0)).getstrUSER_NAME());
				struct.setstrSECTION_CD(((KU0060010Struct)listUserInfo.get(0)).getstrSECTION_CD());
				struct.setstrPLANT_NAME(((KU0060010Struct)listUserInfo.get(0)).getstrPLANT_NAME());
				struct.setstrPLANT_ANAME(((KU0060010Struct)listUserInfo.get(0)).getstrPLANT_ANAME());
				struct.setstrCAL_NO(((KU0060010Struct)listUserInfo.get(0)).getstrCAL_NO());

			}
			listUserInfo = null;

			// �o�ׂk�^�s�̎擾
			strSyuKaLt = getSYUKA_LT(struct);

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
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("ScrmvToShipDir") ) {
				controlScrmvToShipDir();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
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
//			throw new FoundationException("KU0060010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0060010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KU0060010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0060010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KU0060010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0060010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KU0060010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KU0060010Entity entity;
	protected KU0060010Struct struct;
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

		entity = new KU0060010Entity();
		struct = new KU0060010Struct();

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
	 * KU0060010�N���X�̕W���R���X�g���N�^
	 */
	public KU0060010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
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
				KU0060010Struct key = (KU0060010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_SHIP_ODR") && key.getr1_SHIP_ODR() != null) {
					msgKey.setKeyValue("r1_SHIP_ODR", key.getr1_SHIP_ODR());
				}
				if(msgKeyType.containsKeyColumn("r2_SHIP_ODR") && key.getr2_SHIP_ODR() != null) {
					msgKey.setKeyValue("r2_SHIP_ODR", key.getr2_SHIP_ODR());
				}
				if(msgKeyType.containsKeyColumn("tAnsDlvDate_MODIFY_COUNT") && key.gettAnsDlvDate_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("tAnsDlvDate_MODIFY_COUNT", key.gettAnsDlvDate_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_MODIFY_COUNT") && key.gettShipOdr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("tShipOdr_MODIFY_COUNT", key.gettShipOdr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("Shipt_MODIFY_COUNT") && key.getShipt_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("Shipt_MODIFY_COUNT", key.getShipt_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("strBUSINESS_OPR_DATE") && key.getstrBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("strBUSINESS_OPR_DATE", key.getstrBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_CD") && key.getstrPLANT_CD() != null) {
					msgKey.setKeyValue("strPLANT_CD", key.getstrPLANT_CD());
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
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tDECIMAL_FIG") && key.gettDECIMAL_FIG() != null) {
					msgKey.setKeyValue("tDECIMAL_FIG", key.gettDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("tCUR_CD") && key.gettCUR_CD() != null) {
					msgKey.setKeyValue("tCUR_CD", key.gettCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("strCOMPANY_CD") && key.getstrCOMPANY_CD() != null) {
					msgKey.setKeyValue("strCOMPANY_CD", key.getstrCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("strUSER_NAME") && key.getstrUSER_NAME() != null) {
					msgKey.setKeyValue("strUSER_NAME", key.getstrUSER_NAME());
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
					msgKey.setKeyValue("strCAL_NO", key.getstrCAL_NO());
				}
				if(msgKeyType.containsKeyColumn("strUSER_CD") && key.getstrUSER_CD() != null) {
					msgKey.setKeyValue("strUSER_CD", key.getstrUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("strSYUKA_LT") && key.getstrSYUKA_LT() != null) {
					msgKey.setKeyValue("strSYUKA_LT", key.getstrSYUKA_LT());
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
				if(msgKeyType.containsKeyColumn("l_ODR_NO") && key.getl_ODR_NO() != null) {
					msgKey.setKeyValue("l_ODR_NO", key.getl_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO") && key.getl_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("l_PART_DLV_SEQ_NO", key.getl_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE") && key.getl_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_DATE", key.getl_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_QTY") && key.getl_SHIP_QTY() != null) {
					msgKey.setKeyValue("l_SHIP_QTY", key.getl_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_REST_SHIP_QTY") && key.getl_REST_SHIP_QTY() != null) {
					msgKey.setKeyValue("l_REST_SHIP_QTY", key.getl_REST_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WH_NAME") && key.getl_WH_NAME() != null) {
					msgKey.setKeyValue("l_WH_NAME", key.getl_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO") && key.getl_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("l_CUST_ODR_NO", key.getl_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_NAME") && key.getl_CUST_NAME() != null) {
					msgKey.setKeyValue("l_CUST_NAME", key.getl_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP") && key.getl_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP", key.getl_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CTL_NO") && key.getl_ODR_CTL_NO() != null) {
					msgKey.setKeyValue("l_ODR_CTL_NO", key.getl_ODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_TYP") && key.getl_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("l_TRANSPORT_TYP", key.getl_TRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE") && key.getl_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ODR_UNIT_PRICE", key.getl_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP") && key.getl_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_TYP", key.getl_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG") && key.getl_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("l_PARTIAL_SHIP_INST_FLG", key.getl_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE") && key.getDESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("DESINATED_SHIP_DATE", key.getDESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
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
				if(msgKeyType.containsKeyColumn("l_SLIP_CD") && key.getl_SLIP_CD() != null) {
					msgKey.setKeyValue("l_SLIP_CD", key.getl_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_c_DIRECT_DLV_FLG") && key.getl_c_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("l_c_DIRECT_DLV_FLG", key.getl_c_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_MODIFY_COUNT") && key.getl_DLV_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_DLV_MODIFY_COUNT", key.getl_DLV_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
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
				if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_CD") && key.getchkisinWhCd_WH_CD() != null) {
					msgKey.setKeyValue("chkisinWhCd_WH_CD", key.getchkisinWhCd_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_TYP") && key.getchkisinWhCd_WH_TYP() != null) {
					msgKey.setKeyValue("chkisinWhCd_WH_TYP", key.getchkisinWhCd_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("chkis_IN_WHCD") && key.getchkis_IN_WHCD() != null) {
					msgKey.setKeyValue("chkis_IN_WHCD", key.getchkis_IN_WHCD());
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
				if(msgKeyType.containsKeyColumn("tOdr_IN_ODRNO") && key.gettOdr_IN_ODRNO() != null) {
					msgKey.setKeyValue("tOdr_IN_ODRNO", key.gettOdr_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("uptOdr_PART_DLV_COUNT") && key.getuptOdr_PART_DLV_COUNT() != null) {
					msgKey.setKeyValue("uptOdr_PART_DLV_COUNT", key.getuptOdr_PART_DLV_COUNT());
				}
				if(msgKeyType.containsKeyColumn("uptOdr_IN_ODRNO") && key.getuptOdr_IN_ODRNO() != null) {
					msgKey.setKeyValue("uptOdr_IN_ODRNO", key.getuptOdr_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_ODR_CTL_NO") && key.gettOdrCtl_ODR_CTL_NO() != null) {
					msgKey.setKeyValue("tOdrCtl_ODR_CTL_NO", key.gettOdrCtl_ODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_CD") && key.gettOdrCtl_CUST_CD() != null) {
					msgKey.setKeyValue("tOdrCtl_CUST_CD", key.gettOdrCtl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_CD") && key.gettOdrCtl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("tOdrCtl_CUST_ITEM_CD", key.gettOdrCtl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_NAME") && key.gettOdrCtl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("tOdrCtl_CUST_ITEM_NAME", key.gettOdrCtl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_CD") && key.gettOdrCtl_ITEM_CD() != null) {
					msgKey.setKeyValue("tOdrCtl_ITEM_CD", key.gettOdrCtl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_NAME") && key.gettOdrCtl_ITEM_NAME() != null) {
					msgKey.setKeyValue("tOdrCtl_ITEM_NAME", key.gettOdrCtl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_IN_ODRCTLNO") && key.gettOdrCtl_IN_ODRCTLNO() != null) {
					msgKey.setKeyValue("tOdrCtl_IN_ODRCTLNO", key.gettOdrCtl_IN_ODRCTLNO());
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
				if(msgKeyType.containsKeyColumn("mCust_CUST_ANAME") && key.getmCust_CUST_ANAME() != null) {
					msgKey.setKeyValue("mCust_CUST_ANAME", key.getmCust_CUST_ANAME());
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
				if(msgKeyType.containsKeyColumn("strYotaku_WH_CD") && key.getstrYotaku_WH_CD() != null) {
					msgKey.setKeyValue("strYotaku_WH_CD", key.getstrYotaku_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("strYotaku_IN_WH_TYP") && key.getstrYotaku_IN_WH_TYP() != null) {
					msgKey.setKeyValue("strYotaku_IN_WH_TYP", key.getstrYotaku_IN_WH_TYP());
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
				if(msgKeyType.containsKeyColumn("uptOdr_SHIP_CNT") && key.getuptOdr_SHIP_CNT() != null) {
					msgKey.setKeyValue("uptOdr_SHIP_CNT", key.getuptOdr_SHIP_CNT());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_SEQ_NO") && key.gettUnShipList_UN_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("tUnShipList_UN_SHIP_SEQ_NO", key.gettUnShipList_UN_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_CUST_CD") && key.gettUnShipList_CUST_CD() != null) {
					msgKey.setKeyValue("tUnShipList_CUST_CD", key.gettUnShipList_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_ACPT_ODR_CD") && key.gettUnShipList_ACPT_ODR_CD() != null) {
					msgKey.setKeyValue("tUnShipList_ACPT_ODR_CD", key.gettUnShipList_ACPT_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_PART_DLV_SEQ_NO") && key.gettUnShipList_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("tUnShipList_PART_DLV_SEQ_NO", key.gettUnShipList_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_ITEM_CD") && key.gettUnShipList_ITEM_CD() != null) {
					msgKey.setKeyValue("tUnShipList_ITEM_CD", key.gettUnShipList_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_QTY") && key.gettUnShipList_UN_SHIP_QTY() != null) {
					msgKey.setKeyValue("tUnShipList_UN_SHIP_QTY", key.gettUnShipList_UN_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_RSN") && key.gettUnShipList_UN_SHIP_RSN() != null) {
					msgKey.setKeyValue("tUnShipList_UN_SHIP_RSN", key.gettUnShipList_UN_SHIP_RSN());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_WH_CD") && key.gettUnShipList_WH_CD() != null) {
					msgKey.setKeyValue("tUnShipList_WH_CD", key.gettUnShipList_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_PRINT_FLG") && key.gettUnShipList_PRINT_FLG() != null) {
					msgKey.setKeyValue("tUnShipList_PRINT_FLG", key.gettUnShipList_PRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_DEL_FLG") && key.gettUnShipList_DEL_FLG() != null) {
					msgKey.setKeyValue("tUnShipList_DEL_FLG", key.gettUnShipList_DEL_FLG());
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
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("strTAX_CD") && key.getstrTAX_CD() != null) {
					msgKey.setKeyValue("strTAX_CD", key.getstrTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_MODIFY_COUNT") && key.getSHIP_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SHIP_MODIFY_COUNT", key.getSHIP_MODIFY_COUNT());
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
					KU0060010Struct key = new KU0060010Struct();
					if(msgKeyType.containsKeyColumn("r1_SHIP_ODR")) {
						key.setr1_SHIP_ODR(msgKey.getKeyValue("r1_SHIP_ODR"));
					}
					if(msgKeyType.containsKeyColumn("r2_SHIP_ODR")) {
						key.setr2_SHIP_ODR(msgKey.getKeyValue("r2_SHIP_ODR"));
					}
					if(msgKeyType.containsKeyColumn("tAnsDlvDate_MODIFY_COUNT")) {
						key.settAnsDlvDate_MODIFY_COUNT(msgKey.getKeyValue("tAnsDlvDate_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_MODIFY_COUNT")) {
						key.settShipOdr_MODIFY_COUNT(msgKey.getKeyValue("tShipOdr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("Shipt_MODIFY_COUNT")) {
						key.setShipt_MODIFY_COUNT(msgKey.getKeyValue("Shipt_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("strBUSINESS_OPR_DATE")) {
						key.setstrBUSINESS_OPR_DATE(msgKey.getKeyValue("strBUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_CD")) {
						key.setstrPLANT_CD(msgKey.getKeyValue("strPLANT_CD"));
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
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tDECIMAL_FIG")) {
						key.settDECIMAL_FIG(msgKey.getKeyValue("tDECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("tCUR_CD")) {
						key.settCUR_CD(msgKey.getKeyValue("tCUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("strCOMPANY_CD")) {
						key.setstrCOMPANY_CD(msgKey.getKeyValue("strCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("strUSER_NAME")) {
						key.setstrUSER_NAME(msgKey.getKeyValue("strUSER_NAME"));
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
						key.setstrCAL_NO(msgKey.getKeyValue("strCAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("strUSER_CD")) {
						key.setstrUSER_CD(msgKey.getKeyValue("strUSER_CD"));
					}
					if(msgKeyType.containsKeyColumn("strSYUKA_LT")) {
						key.setstrSYUKA_LT(msgKey.getKeyValue("strSYUKA_LT"));
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
					if(msgKeyType.containsKeyColumn("l_ODR_NO")) {
						key.setl_ODR_NO(msgKey.getKeyValue("l_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO")) {
						key.setl_PART_DLV_SEQ_NO(msgKey.getKeyValue("l_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE")) {
						key.setl_DESINATED_SHIP_DATE(msgKey.getKeyValue("l_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_QTY")) {
						key.setl_SHIP_QTY(msgKey.getKeyValue("l_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_REST_SHIP_QTY")) {
						key.setl_REST_SHIP_QTY(msgKey.getKeyValue("l_REST_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_NAME")) {
						key.setl_WH_NAME(msgKey.getKeyValue("l_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO")) {
						key.setl_CUST_ODR_NO(msgKey.getKeyValue("l_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_NAME")) {
						key.setl_CUST_NAME(msgKey.getKeyValue("l_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP")) {
						key.setl_MRP_ODR_TYP(msgKey.getKeyValue("l_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CTL_NO")) {
						key.setl_ODR_CTL_NO(msgKey.getKeyValue("l_ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_TYP")) {
						key.setl_TRANSPORT_TYP(msgKey.getKeyValue("l_TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE")) {
						key.setl_ODR_UNIT_PRICE(msgKey.getKeyValue("l_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP")) {
						key.setl_SPCL_PRICE_TYP(msgKey.getKeyValue("l_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG")) {
						key.setl_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("l_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE")) {
						key.setDESINATED_SHIP_DATE(msgKey.getKeyValue("DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("l_SLIP_CD")) {
						key.setl_SLIP_CD(msgKey.getKeyValue("l_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_c_DIRECT_DLV_FLG")) {
						key.setl_c_DIRECT_DLV_FLG(msgKey.getKeyValue("l_c_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_MODIFY_COUNT")) {
						key.setl_DLV_MODIFY_COUNT(msgKey.getKeyValue("l_DLV_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
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
					if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_CD")) {
						key.setchkisinWhCd_WH_CD(msgKey.getKeyValue("chkisinWhCd_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_TYP")) {
						key.setchkisinWhCd_WH_TYP(msgKey.getKeyValue("chkisinWhCd_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("chkis_IN_WHCD")) {
						key.setchkis_IN_WHCD(msgKey.getKeyValue("chkis_IN_WHCD"));
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
					if(msgKeyType.containsKeyColumn("tOdr_IN_ODRNO")) {
						key.settOdr_IN_ODRNO(msgKey.getKeyValue("tOdr_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("uptOdr_PART_DLV_COUNT")) {
						key.setuptOdr_PART_DLV_COUNT(msgKey.getKeyValue("uptOdr_PART_DLV_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("uptOdr_IN_ODRNO")) {
						key.setuptOdr_IN_ODRNO(msgKey.getKeyValue("uptOdr_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_ODR_CTL_NO")) {
						key.settOdrCtl_ODR_CTL_NO(msgKey.getKeyValue("tOdrCtl_ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_CD")) {
						key.settOdrCtl_CUST_CD(msgKey.getKeyValue("tOdrCtl_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_CD")) {
						key.settOdrCtl_CUST_ITEM_CD(msgKey.getKeyValue("tOdrCtl_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_NAME")) {
						key.settOdrCtl_CUST_ITEM_NAME(msgKey.getKeyValue("tOdrCtl_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_CD")) {
						key.settOdrCtl_ITEM_CD(msgKey.getKeyValue("tOdrCtl_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_NAME")) {
						key.settOdrCtl_ITEM_NAME(msgKey.getKeyValue("tOdrCtl_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_IN_ODRCTLNO")) {
						key.settOdrCtl_IN_ODRCTLNO(msgKey.getKeyValue("tOdrCtl_IN_ODRCTLNO"));
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
					if(msgKeyType.containsKeyColumn("mCust_CUST_ANAME")) {
						key.setmCust_CUST_ANAME(msgKey.getKeyValue("mCust_CUST_ANAME"));
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
					if(msgKeyType.containsKeyColumn("strYotaku_WH_CD")) {
						key.setstrYotaku_WH_CD(msgKey.getKeyValue("strYotaku_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("strYotaku_IN_WH_TYP")) {
						key.setstrYotaku_IN_WH_TYP(msgKey.getKeyValue("strYotaku_IN_WH_TYP"));
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
					if(msgKeyType.containsKeyColumn("uptOdr_SHIP_CNT")) {
						key.setuptOdr_SHIP_CNT(msgKey.getKeyValue("uptOdr_SHIP_CNT"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_SEQ_NO")) {
						key.settUnShipList_UN_SHIP_SEQ_NO(msgKey.getKeyValue("tUnShipList_UN_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_CUST_CD")) {
						key.settUnShipList_CUST_CD(msgKey.getKeyValue("tUnShipList_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_ACPT_ODR_CD")) {
						key.settUnShipList_ACPT_ODR_CD(msgKey.getKeyValue("tUnShipList_ACPT_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_PART_DLV_SEQ_NO")) {
						key.settUnShipList_PART_DLV_SEQ_NO(msgKey.getKeyValue("tUnShipList_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_ITEM_CD")) {
						key.settUnShipList_ITEM_CD(msgKey.getKeyValue("tUnShipList_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_QTY")) {
						key.settUnShipList_UN_SHIP_QTY(msgKey.getKeyValue("tUnShipList_UN_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_RSN")) {
						key.settUnShipList_UN_SHIP_RSN(msgKey.getKeyValue("tUnShipList_UN_SHIP_RSN"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_WH_CD")) {
						key.settUnShipList_WH_CD(msgKey.getKeyValue("tUnShipList_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_PRINT_FLG")) {
						key.settUnShipList_PRINT_FLG(msgKey.getKeyValue("tUnShipList_PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_DEL_FLG")) {
						key.settUnShipList_DEL_FLG(msgKey.getKeyValue("tUnShipList_DEL_FLG"));
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
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("strTAX_CD")) {
						key.setstrTAX_CD(msgKey.getKeyValue("strTAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_MODIFY_COUNT")) {
						key.setSHIP_MODIFY_COUNT(msgKey.getKeyValue("SHIP_MODIFY_COUNT"));
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
