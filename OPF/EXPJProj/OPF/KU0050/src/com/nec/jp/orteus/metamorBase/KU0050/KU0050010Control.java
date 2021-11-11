/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0050/src/com/nec/jp/orteus/metamorBase/KU0050/KU0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0050;

import com.nec.jp.orteus.metamorBase.KU0050.*;
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
import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;
import com.nec.jp.orteus.metamorBase.common.util.ScreenPermission;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KU0050010Control
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
	public KU0050010Struct getListvalue(int x) { return (KU0050010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KU0050010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
	public KU0050010Struct createStruct() { return new KU0050010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KU0050010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	SystemLog _sysLog = sysLog;

	/** ���b�Z�[�W��`�t�@�C�� */
	private MessageConfig _msgConfig = null;
	private String _lotCtrl = new String();
	//private MessageStruct msgStruct = msgStruct;
	public MessageStruct _getMsgStruct(){ return this.msgStruct;}

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

        /** ��ʋ��ʒ�`�擾�N���X */
	ScreenParam _scParam = sp;

	//�ő�s����������
	private boolean getMaxLine(long rowCount) throws FoundationException {
		try {
			ScreenParam sp = new ScreenParam(this.getClass());
			int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0 && rowCount == maxLine + 1) {
				this.list.clear();
				ExpjMessage emsg = new ExpjMessage("ZZ01115", "" + maxLine);
				msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
				emsg = new ExpjMessage("ZZ01006", "CUST_CD:"+ struct.getIN_CUST_CD());
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[�ڍ�
				emsg = new ExpjMessage("ZZ01006", "ITEM_CD:"+ struct.getIN_ITEM_CD());
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[�ڍ�
				emsg = new ExpjMessage("ZZ01006", "CUST_ITEM_CD:"+ struct.getIN_CUST_ITEM_CD());
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[�ڍ�
				emsg = new ExpjMessage("ZZ01006", "FROM_SEARCH_DATE:"+ struct.getFROM_SEARCH_DATE());
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[�ڍ�
				emsg = new ExpjMessage("ZZ01006", "TO_SEARCH_DATE:"+ struct.getTO_SEARCH_DATE());
				sysLog.warning(emsg, getsysUSER_CD()); // �G���[�ڍ�

				setReadStatus(TOO_MANY);
				if (list != null && list.size() > 0) {
					list.clear();
				}
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();

			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e, emsg);
			emsg = new ExpjMessage("AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage("ZZ01106", e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			// throw msg;
		}
		return false;
	}
	// �R���{�{�b�N�X�̐����擾�i������j
	public String multcombo(String comname,String value) throws BusinessProcessException, FoundationException {
		try {
			ComboBox com = new ComboBox(conn, sysUSER_CD);
			ComboStruct _comstruct = new ComboStruct();
			_comstruct = com.getData(comname);
			for (int j = 0; j < _comstruct.size(); j++) {
				if ((_comstruct.getData(j)[0]).equals(value)) {
					return _comstruct.getData(j)[1];
				}
			}
			return null;
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			ee.setLocale(CoreTools.getLocale(sysUSER_CD));
			throw ee;
		}
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0050");
		logger.entering("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			String strSelPtn = "";
			//strSelPtn = (String)struct.getr_SEL_PTN();
			// ��ʏ��̎擾
			if (struct.getr_SEL_PTN1().equals("true")) {
				strSelPtn = "SIJI";//�o�׎w��
			} else if (struct.getr_SEL_PTN3().equals("true")) {
				strSelPtn = "MISIJI";//�o�׌v��
			} else if (("true").equals(struct.getr_SEL_PTN2())){
				strSelPtn = "SIJIALARM";//�o�׎w���s��
			} else{
				strSelPtn = "SIJICOMPILE";//�o�׍ς�
			}

			if ( ( strSelPtn.equals("SIJI") || strSelPtn.equals("SIJIALARM") || ("SIJICOMPILE").equals(strSelPtn)) && struct.getc_USER().equals("true") ) {

				struct.setw_USER_CD(getsysUSER_CD());
			} else {
				struct.setw_USER_CD(null);
			}
			
			// ���X�g�N���A
			if(list != null){
				list.clear();
			}

			setReadStatus(INITIAL );
			 // �\���ő�s����������
			ScreenParam sp = new ScreenParam(this.getClass());
		    int maxLine = sp.getMaxLine(conn, 10);
		    if (maxLine != 0){
				struct.setROW_COUNT(String.valueOf(maxLine));
		    }else{
				struct.setROW_COUNT(null);
		    }
		    
			if(strSelPtn.equals("SIJI")){
				list = entity.mselectT_SHIP_ODRCnt.read(conn, struct);
			}else{
				if(strSelPtn.equals("MISIJI")){
					list = entity.mselectT_ANS_DLV_DATECnt.read(conn, struct);
				}else if(strSelPtn.equals("SIJIALARM")){
					list = entity.mselectT_UN_SHIP_LISTCnt.read(conn, struct);				
				}else{
					list = entity.mselectT_ANS_DLV_DATE_COMPILECnt.read(conn, struct);
				}
			}
				long rowCount = Long.parseLong(((KU0050010Struct) list.get(0)).getl_COUNT());
			  	if( rowCount == 0 ){
			  		//�f�[�^�����݂��Ȃ�
					ExpjMessage emsg = new ExpjMessage( "ZZ06001" );
					msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
					setReadStatus(NOT_FOUND);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
			  	}else{
					//�ő�s����������
			  		if(this.getMaxLine(rowCount)){
			  			return;
			  		}
			  	}
			  	if(strSelPtn.equals("SIJI")){
					list = entity.mselectT_SHIP_ODR.read(conn, struct);  //�o�׎w��
				}else{
					if(strSelPtn.equals("MISIJI")){
						list = entity.mselectT_ANS_DLV_DATE.read(conn, struct);    //�o�׌v��
					}else if(strSelPtn.equals("SIJIALARM")){
						list = entity.mselectT_UN_SHIP_LIST.read(conn, struct);    //�o�׎w���s��
					}else{
						list = entity.mselectT_ANS_DLV_DATE_COMPLIE.read(conn, struct); //�o�׍�
					}
				}
			
				KU0050010Struct TempStruct;
                 for (int i = 0; i < this.list.size(); i++) {
                 	TempStruct = (KU0050010Struct)list.get(i);
                 	TempStruct.setDEPO_TYP(this.multcombo("DEPO_TYP",TempStruct.getDEPO_TYP()));
                 	//��ʑJ�ڗp
                 	TempStruct.setl_SHIP_ITEM_CD(TempStruct.getITEM_CD());
                 	TempStruct.setl_INV_LOT_NO(TempStruct.getLOT_NO());
                 }
				setReadStatus(NORMAL);
			
		} catch(SQLException e) {
			setReadStatus(ERROR);

			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			emsg = new ExpjMessage( "ZZ01006", "M_ITEM.ITEM_CD:" + struct.getIN_ITEM_CD() );
			sysLog. severe (emsg ,getsysUSER_CD()); //�G���[�ڍ�
			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog. severe (emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
			throw ee;

		}catch(Exception e){
			e.printStackTrace();

			setReadStatus(ERROR);

			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "AA99991");
			sysLog.severe(emsg, struct.getsUser_ID());
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());

			//throw ee;
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0050");
		logger.entering("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0050");
		logger.entering("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
				this.msgStruct.clearAll();
				struct.initialize();
				if (this.list != null) {
					this.list.clear();
				}
				struct.seth_LOTCTRL(_lotCtrl);
                //}}user_implement_dev:<controlClear>
		logger.exiting("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ���b�g�g���[�X�Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectLotTraceRef() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0050");
		logger.entering("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlSelectLotTraceRef");
			//{{user_implement_dev:<controlSelectLotTraceRef>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlSelectLotTraceRef>
		logger.exiting("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlSelectLotTraceRef");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0050");
		logger.entering("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0050");
		logger.entering("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try{
//System.out.println("controlRELOAD start");
//System.out.println("struct.setr_SEL_PTN=" + struct.getr_SEL_PTN());
//System.out.println("struct.setr_SEL_PTN1=" + struct.getr_SEL_PTN1());
//System.out.println("struct.setr_SEL_PTN2=" + struct.getr_SEL_PTN2());
//System.out.println("struct.setr_SEL_PTN3=" + struct.getr_SEL_PTN3());
			struct.initialize();
			if (list != null) {
        			list.clear();
        		}

			// ��ЃR�[�h�̎擾
			List listKaisyaCd = entity.mgetCompanyInfo.read(conn,struct);
			if(listKaisyaCd == null || listKaisyaCd.size() != 1){
				//��Џ�񂪖���/������
				//�G���[���b�Z�[�W�o��
				ExpjMessage emsg = new ExpjMessage("KQ00039");
                		msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
                		sysLog.severe(emsg, getsysUSER_CD()); //�G���[���e
                		ExpjException ee = new ExpjException(emsg);
                		throw ee;
			 }else{
				 struct.setstrCOMPANY_CD(((KU0050010Struct)listKaisyaCd.get(0)).getstrCOMPANY_CD());
//System.out.println("struct.setstrCOMPANY_CD=" + struct.getstrCOMPANY_CD());
			 }
			//���ʕ��i���b�g�Ǘ������σ`�F�b�N
			if (LotCtrl.checkLotCtrl(conn)) {
				_lotCtrl = "true";
			} else {
				_lotCtrl = "false";
			}
			struct.seth_LOTCTRL(_lotCtrl);
			 listKaisyaCd = null;
//System.out.println("controlRELOAD end");
		} catch(SQLException e) {
                	ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                	sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
                	ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
                	emsg = new ExpjMessage( "ZZ01006", e.toString());
                	sysLog.severe (emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
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
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0050");
		logger.entering("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KU0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("SelectLotTraceRef") ) {
				controlSelectLotTraceRef();
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
//			throw new FoundationException("KU0050010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0050010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KU0050010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0050010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KU0050010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0050010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KU0050010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KU0050010Entity entity;
	protected KU0050010Struct struct;
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

		entity = new KU0050010Entity();
		struct = new KU0050010Struct();

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
	 * KU0050010�N���X�̕W���R���X�g���N�^
	 */
	public KU0050010Control() throws BusinessProcessException, FoundationException
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
				KU0050010Struct key = (KU0050010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r_SEL_PTN1") && key.getr_SEL_PTN1() != null) {
					msgKey.setKeyValue("r_SEL_PTN1", key.getr_SEL_PTN1());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN2") && key.getr_SEL_PTN2() != null) {
					msgKey.setKeyValue("r_SEL_PTN2", key.getr_SEL_PTN2());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN3") && key.getr_SEL_PTN3() != null) {
					msgKey.setKeyValue("r_SEL_PTN3", key.getr_SEL_PTN3());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN") && key.getr_SEL_PTN() != null) {
					msgKey.setKeyValue("r_SEL_PTN", key.getr_SEL_PTN());
				}
				if(msgKeyType.containsKeyColumn("c_USER") && key.getc_USER() != null) {
					msgKey.setKeyValue("c_USER", key.getc_USER());
				}
				if(msgKeyType.containsKeyColumn("r_SEL_PTN4") && key.getr_SEL_PTN4() != null) {
					msgKey.setKeyValue("r_SEL_PTN4", key.getr_SEL_PTN4());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_ITEM_CD") && key.getl_SHIP_ITEM_CD() != null) {
					msgKey.setKeyValue("l_SHIP_ITEM_CD", key.getl_SHIP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_INV_LOT_NO") && key.getl_INV_LOT_NO() != null) {
					msgKey.setKeyValue("l_INV_LOT_NO", key.getl_INV_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("h_LOTCTRL") && key.geth_LOTCTRL() != null) {
					msgKey.setKeyValue("h_LOTCTRL", key.geth_LOTCTRL());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_USER_CD") && key.getw_USER_CD() != null) {
					msgKey.setKeyValue("w_USER_CD", key.getw_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_DATE") && key.getSHIP_DATE() != null) {
					msgKey.setKeyValue("SHIP_DATE", key.getSHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_ODR_NO") && key.getSHIP_ODR_NO() != null) {
					msgKey.setKeyValue("SHIP_ODR_NO", key.getSHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("DLV_KEY_NO") && key.getDLV_KEY_NO() != null) {
					msgKey.setKeyValue("DLV_KEY_NO", key.getDLV_KEY_NO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_QTY") && key.getSHIP_QTY() != null) {
					msgKey.setKeyValue("SHIP_QTY", key.getSHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALLCT_WH_CD") && key.getALLCT_WH_CD() != null) {
					msgKey.setKeyValue("ALLCT_WH_CD", key.getALLCT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO") && key.getPART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("PART_DLV_SEQ_NO", key.getPART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT") && key.getUNIT() != null) {
					msgKey.setKeyValue("UNIT", key.getUNIT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_CD") && key.getIN_CUST_CD() != null) {
					msgKey.setKeyValue("IN_CUST_CD", key.getIN_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_CD") && key.getIN_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_ITEM_CD", key.getIN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_ITEM_CD") && key.getIN_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_CUST_ITEM_CD", key.getIN_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_SEARCH_DATE") && key.getFROM_SEARCH_DATE() != null) {
					msgKey.setKeyValue("FROM_SEARCH_DATE", key.getFROM_SEARCH_DATE());
				}
				if(msgKeyType.containsKeyColumn("TO_SEARCH_DATE") && key.getTO_SEARCH_DATE() != null) {
					msgKey.setKeyValue("TO_SEARCH_DATE", key.getTO_SEARCH_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_ODR_NO") && key.getIN_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("IN_CUST_ODR_NO", key.getIN_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("strCOMPANY_CD") && key.getstrCOMPANY_CD() != null) {
					msgKey.setKeyValue("strCOMPANY_CD", key.getstrCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("FROM_SHIP_DATE") && key.getFROM_SHIP_DATE() != null) {
					msgKey.setKeyValue("FROM_SHIP_DATE", key.getFROM_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("TO_SHIP_DATE") && key.getTO_SHIP_DATE() != null) {
					msgKey.setKeyValue("TO_SHIP_DATE", key.getTO_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_LOT_NO") && key.getIN_LOT_NO() != null) {
					msgKey.setKeyValue("IN_LOT_NO", key.getIN_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_DATE") && key.getT_SHIP_DATE() != null) {
					msgKey.setKeyValue("T_SHIP_DATE", key.getT_SHIP_DATE());
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
					KU0050010Struct key = new KU0050010Struct();
					if(msgKeyType.containsKeyColumn("r_SEL_PTN1")) {
						key.setr_SEL_PTN1(msgKey.getKeyValue("r_SEL_PTN1"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN2")) {
						key.setr_SEL_PTN2(msgKey.getKeyValue("r_SEL_PTN2"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN3")) {
						key.setr_SEL_PTN3(msgKey.getKeyValue("r_SEL_PTN3"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN")) {
						key.setr_SEL_PTN(msgKey.getKeyValue("r_SEL_PTN"));
					}
					if(msgKeyType.containsKeyColumn("c_USER")) {
						key.setc_USER(msgKey.getKeyValue("c_USER"));
					}
					if(msgKeyType.containsKeyColumn("r_SEL_PTN4")) {
						key.setr_SEL_PTN4(msgKey.getKeyValue("r_SEL_PTN4"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_ITEM_CD")) {
						key.setl_SHIP_ITEM_CD(msgKey.getKeyValue("l_SHIP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_LOT_NO")) {
						key.setl_INV_LOT_NO(msgKey.getKeyValue("l_INV_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_LOTCTRL")) {
						key.seth_LOTCTRL(msgKey.getKeyValue("h_LOTCTRL"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_USER_CD")) {
						key.setw_USER_CD(msgKey.getKeyValue("w_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_DATE")) {
						key.setSHIP_DATE(msgKey.getKeyValue("SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_ODR_NO")) {
						key.setSHIP_ODR_NO(msgKey.getKeyValue("SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("DLV_KEY_NO")) {
						key.setDLV_KEY_NO(msgKey.getKeyValue("DLV_KEY_NO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_QTY")) {
						key.setSHIP_QTY(msgKey.getKeyValue("SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALLCT_WH_CD")) {
						key.setALLCT_WH_CD(msgKey.getKeyValue("ALLCT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO")) {
						key.setPART_DLV_SEQ_NO(msgKey.getKeyValue("PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT")) {
						key.setUNIT(msgKey.getKeyValue("UNIT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_CD")) {
						key.setIN_CUST_CD(msgKey.getKeyValue("IN_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_CD")) {
						key.setIN_ITEM_CD(msgKey.getKeyValue("IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_ITEM_CD")) {
						key.setIN_CUST_ITEM_CD(msgKey.getKeyValue("IN_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_SEARCH_DATE")) {
						key.setFROM_SEARCH_DATE(msgKey.getKeyValue("FROM_SEARCH_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TO_SEARCH_DATE")) {
						key.setTO_SEARCH_DATE(msgKey.getKeyValue("TO_SEARCH_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_ODR_NO")) {
						key.setIN_CUST_ODR_NO(msgKey.getKeyValue("IN_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("strCOMPANY_CD")) {
						key.setstrCOMPANY_CD(msgKey.getKeyValue("strCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("FROM_SHIP_DATE")) {
						key.setFROM_SHIP_DATE(msgKey.getKeyValue("FROM_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TO_SHIP_DATE")) {
						key.setTO_SHIP_DATE(msgKey.getKeyValue("TO_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_LOT_NO")) {
						key.setIN_LOT_NO(msgKey.getKeyValue("IN_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_DATE")) {
						key.setT_SHIP_DATE(msgKey.getKeyValue("T_SHIP_DATE"));
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
