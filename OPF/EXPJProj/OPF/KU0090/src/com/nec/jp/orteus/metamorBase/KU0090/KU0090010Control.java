/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0090/src/com/nec/jp/orteus/metamorBase/KU0090/KU0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0090;

import com.nec.jp.orteus.metamorBase.KU0090.*;
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
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KU0090010Control
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
//	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
	public KU0090010Struct getListvalue(int x) { return (KU0090010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KU0090010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KU0090010Struct createStruct() { return new KU0090010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KU0090010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	/** Explanner/J*/
	private static final String EXPLANNER_J = "J*";
	
	/** Explanner/Ja*/
	private static final String EXPLANNER_JA = "JA*";
	
	/** CSV�f�[�^���X�g */
	private List _csvList = null;
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
	 * Exception���b�Z�[�W�ݒ�
	 * @param �L�[����
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		throw ee;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
        	// ���������̏o�ח\������Ɏ�����t������
			StringBuffer sbShipPlanDateFrom = null;
			StringBuffer sbShipPlanDateTo = null;
	        if (EXPLANNER_J.equals(struct.getOPTION_ID())) {
	        	// �J�n�����̐ݒ�
	        	if (struct.getSCDL_SHIP_DATE_FROM() != null && !"".equals(struct.getSCDL_SHIP_DATE_FROM())) {
	        		sbShipPlanDateFrom = new StringBuffer(struct.getSCDL_SHIP_DATE_FROM());
	        		sbShipPlanDateFrom.append(" 00:00");
	        		struct.setSCDL_SHIP_DATE_FROM(sbShipPlanDateFrom.toString());
	        	}
	        	// �I�������̐ݒ�
	        	if (struct.getSCDL_SHIP_DATE_TO() != null && !"".equals(struct.getSCDL_SHIP_DATE_TO())) {
	        		sbShipPlanDateTo = new StringBuffer(struct.getSCDL_SHIP_DATE_TO());
	        		sbShipPlanDateTo.append(" 59:59");
	        		struct.setSCDL_SHIP_DATE_TO(sbShipPlanDateTo.toString());
	        	}
	        } else {
	        	// �J�n�����̐ݒ�
	        	if (struct.getSCDL_SHIP_DATE_FROM() != null && !"".equals(struct.getSCDL_SHIP_DATE_FROM())) {
	        		sbShipPlanDateFrom = new StringBuffer(struct.getSCDL_SHIP_DATE_FROM());
	        		if (struct.getSHIP_PLAN_DATE_TIME_FROM() != null && !"".equals(struct.getSHIP_PLAN_DATE_TIME_FROM())) {
		        		sbShipPlanDateFrom.append(" ");
		        		String strTime = struct.getSHIP_PLAN_DATE_TIME_FROM();
		        		if (strTime.length() == 3) {
		        			strTime = "0" + strTime;
			        		struct.setSHIP_PLAN_DATE_TIME_FROM(strTime);
		        		}
		        		sbShipPlanDateFrom.append(strTime.subSequence(0, 2));
	        			sbShipPlanDateFrom.append(":");
		        		sbShipPlanDateFrom.append(strTime.subSequence(2, 4));
	        		} else {
		        		sbShipPlanDateFrom.append(" 00:00");
	        		}
	        		struct.setSCDL_SHIP_DATE_FROM(sbShipPlanDateFrom.toString());
	        	}
	        	// �I�������̐ݒ�
	        	if (struct.getSCDL_SHIP_DATE_TO() != null && !"".equals(struct.getSCDL_SHIP_DATE_TO())) {
	        		sbShipPlanDateTo = new StringBuffer(struct.getSCDL_SHIP_DATE_TO());
	        		if (struct.getSHIP_PLAN_DATE_TIME_TO() != null && !"".equals(struct.getSHIP_PLAN_DATE_TIME_TO())) {
		        		sbShipPlanDateTo.append(" ");
		        		String strTime = struct.getSHIP_PLAN_DATE_TIME_TO();
		        		if (strTime.length() == 3) {
		        			strTime = "0" + strTime;
			        		struct.setSHIP_PLAN_DATE_TIME_TO(strTime);
		        		}
		        		sbShipPlanDateTo.append(strTime.subSequence(0, 2));
		        		sbShipPlanDateTo.append(":");
		        		sbShipPlanDateTo.append(strTime.subSequence(2, 4));
	        		} else {
		        		sbShipPlanDateTo.append(" 59:59");
	        		}
	        		struct.setSCDL_SHIP_DATE_TO(sbShipPlanDateTo.toString());
	        	}
	        }
			if ("true".equals(struct.getOPed())) {
				// �o�͍ς��`�F�b�N���Ȃ���
				struct.setw_PRINT_FLG("1");
			} else {
				// �o�͍ς��`�F�b�N��
				struct.setw_PRINT_FLG("0");
			}
			// �\���ő�s��
			int maxLine = sp.getMaxLine(conn, 10);
			List cntList = new ArrayList();
			cntList = entity.mSelect_ViewCnt.read(conn, struct);
			long rowCount = Long.parseLong(((KU0090010Struct) cntList.get(0))
					.getROW_COUNT());
			// �Ώۃf�[�^�� 0 ���ł���ꍇ
			if (rowCount == 0) {
				setErrorMessage("ZZ06001");
				readStatus = NOT_FOUND;
				if (list !=null &&list.size()>0) {
					list.clear();
				}
				return;
			}
			// �\���ő�s����������
	        if ((maxLine != 0) && (rowCount >= maxLine+1)) {
	            setErrorMessage("ZZ01115", String.valueOf(maxLine));
	            readStatus = TOO_MANY;
	            if (list !=null &&list.size()>0) {
				    list.clear();
			    }
	            return;
			}
	        list = entity.mSelect_M_SHIP_INVOICE_HEAD.read(conn, struct);
        	// E/J�̏ꍇ�A�o�͂���o�ח\�������YYYY/MM/DD�̌`���ɂ���
	        if (EXPLANNER_J.equals(struct.getOPTION_ID()) && list != null && list.size() > 0) {
	        	KU0090010Struct st = null;
	        	for (int i = 0; i < list.size(); i++) {
	        		st = (KU0090010Struct) list.get(i);
	        		if (st.getl_SCDL_SHIP_DATE() != null && st.getl_SCDL_SHIP_DATE().length() > 10) {
	        			st.setl_SCDL_SHIP_DATE(st.getl_SCDL_SHIP_DATE().substring(0, 10));
	        		}
	        	}
	        }
	        
			_csvList = list;
			setReadStatus(NORMAL);
		} catch(SQLException e) {
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �����e�i���X�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlMaintenance() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlMaintenance");
			//{{user_implement_dev:<controlMaintenance>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlMaintenance>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlMaintenance");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			if ("true".equals(struct.getOPed())) {
				// �o�͍ς��`�F�b�N���Ȃ���
				struct.setw_PRINT_FLG("1");
			} else {
				// �o�͍ς��`�F�b�N��
				struct.setw_PRINT_FLG("0");
			}
			// ���X�g�f�[�^�̌���
			_csvList = entity.mSelect_M_SHIP_INVOICE_HEAD.read(conn, struct);
			if(_csvList.isEmpty()){
				setErrorMessage("ZZ06001");
				return;
			}
			// ���X�g�f�[�^��ݒ�
			// CSV���̍쐬
			List csvList = new ArrayList();
			String[] title = {
					"Expj.SHIP_INVOICE_CTL_NO",           // �o�׃C���{�C�X�Ǘ��ԍ�
					"Expj.INVOICE_CD_1",			      // �C���{�C�X�ԍ�
					"Expj.SCDL_SHIP_DATE",				  // �o�ח\���
					"Expj.CUST_CD",                       // ���Ӑ�R�[�h
					"Expj.DLV_LOC_CD",                    // �[�i�ꏊ�R�[�h
					"Expj.DEPARTURE_PLACE",               // �o�`��
					"Expj.DEPARTURE_DATE",                // �o�`��
					"Expj.ARRIVAL_PLACE",                 // �����n
					"Expj.ARRIVAL_DATE_1",                // ���`��
					"Expj.TRANSPORT_METHOD",              // �A����i
					"Expj.SHIP_NO",                       // �D�ւm�n
					"Expj.INVOICE_AMOUNT",                // �C���{�C�X���z
					"Expj.INVOICE_TAX_AMOUNT",            // �C���{�C�X����Ŋz
					"Expj.REMARKS_1",                     // ���l�P
					"Expj.REMARKS_2"                      // ���l�Q
					
			};
			csvList.add(title);
			String[] csvStr = null;
			for (Iterator i = _csvList.iterator(); i.hasNext();) {
				KU0090010Struct csvStruct = (KU0090010Struct)i.next();
				csvStr = new String[title.length];
				int nCnt = 0;
				csvStr[nCnt++] = csvStruct.getl_SHIP_INVOICE_CTL_NO();
				csvStr[nCnt++] = csvStruct.getl_INVOICE_CD_1();
	        	// E/J�̏ꍇ�A�o�͂���o�ח\�������YYYY/MM/DD�̌`���ɂ���
		        if (EXPLANNER_J.equals(struct.getOPTION_ID())) {
	        		if (csvStruct.getl_SCDL_SHIP_DATE() != null && csvStruct.getl_SCDL_SHIP_DATE().length() > 10) {
	        			csvStruct.setl_SCDL_SHIP_DATE(csvStruct.getl_SCDL_SHIP_DATE().substring(0, 10));
	        		}
		        }
	        	csvStr[nCnt++] = csvStruct.getl_SCDL_SHIP_DATE();
				csvStr[nCnt++] = csvStruct.getl_CUST_CD();
				csvStr[nCnt++] = csvStruct.getl_DLV_LOC_CD();
				csvStr[nCnt++] = csvStruct.getl_DEPARTURE_PLACE();
				csvStr[nCnt++] = csvStruct.getl_DEPARTURE_DATE();
				csvStr[nCnt++] = csvStruct.getl_ARRIVAL_PLACE();
				csvStr[nCnt++] = csvStruct.getl_ARRIVAL_DATE_1();
				csvStr[nCnt++] = csvStruct.getl_TRANSPORT_METHOD();
				csvStr[nCnt++] = csvStruct.getl_SHIP_NO();
				csvStr[nCnt++] = csvStruct.getl_INVOICE_AMOUNT();
				csvStr[nCnt++] = csvStruct.getl_INVOICE_TAX_AMOUNT();
				csvStr[nCnt++] = csvStruct.getl_REMARKS_1();
				csvStr[nCnt++] = csvStruct.getl_REMARKS_2();
				csvList.add(csvStr);
			}
			if (csvList != null && !csvList.isEmpty()) {
				// CsvWriter�𐶐�
				csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
				csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
				struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
			}
		}catch(Exception e) {
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		struct.initialize();
		setReadStatus(INITIAL);
		controlRELOAD();
		setList(null);
                //}}user_implement_dev:<controlClear>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

		try {
			
			// =======================================
			// �C���X�g�[���I�v�V�����̎擾
			// =======================================
			struct.setOPTION_ID(EXPLANNER_JA);
			if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, struct)) {
				struct.setOPTION_ID(EXPLANNER_J);
			}
			
			struct.setOPed("NULL");
			
		} catch(SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			msgStruct.addError(emsg);
			sysLog.warning(emsg, sysUSER_CD);
		}
		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Maintenance") ) {
				controlMaintenance();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
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
//			throw new FoundationException("KU0090010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0090010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KU0090010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0090010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KU0090010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0090010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KU0090010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KU0090010Entity entity;
	protected KU0090010Struct struct;
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

		entity = new KU0090010Entity();
		struct = new KU0090010Struct();

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
	 * KU0090010�N���X�̕W���R���X�g���N�^
	 */
	public KU0090010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: �����ɏ����������L�q���Ă�������
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
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
				KU0090010Struct key = (KU0090010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OPed") && key.getOPed() != null) {
					msgKey.setKeyValue("OPed", key.getOPed());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_FROM") && key.getSHIP_PLAN_DATE_TIME_FROM() != null) {
					msgKey.setKeyValue("SHIP_PLAN_DATE_TIME_FROM", key.getSHIP_PLAN_DATE_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_TO") && key.getSHIP_PLAN_DATE_TIME_TO() != null) {
					msgKey.setKeyValue("SHIP_PLAN_DATE_TIME_TO", key.getSHIP_PLAN_DATE_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("INVOICE_CD") && key.getINVOICE_CD() != null) {
					msgKey.setKeyValue("INVOICE_CD", key.getINVOICE_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_FROM") && key.getSHIP_INVOICE_DATE_FROM() != null) {
					msgKey.setKeyValue("SHIP_INVOICE_DATE_FROM", key.getSHIP_INVOICE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_TO") && key.getSHIP_INVOICE_DATE_TO() != null) {
					msgKey.setKeyValue("SHIP_INVOICE_DATE_TO", key.getSHIP_INVOICE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_FROM") && key.getSCDL_SHIP_DATE_FROM() != null) {
					msgKey.setKeyValue("SCDL_SHIP_DATE_FROM", key.getSCDL_SHIP_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_TO") && key.getSCDL_SHIP_DATE_TO() != null) {
					msgKey.setKeyValue("SCDL_SHIP_DATE_TO", key.getSCDL_SHIP_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_PRINT_FLG") && key.getw_PRINT_FLG() != null) {
					msgKey.setKeyValue("w_PRINT_FLG", key.getw_PRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_INVOICE_CTL_NO") && key.getl_SHIP_INVOICE_CTL_NO() != null) {
					msgKey.setKeyValue("l_SHIP_INVOICE_CTL_NO", key.getl_SHIP_INVOICE_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_INVOICE_CD_1") && key.getl_INVOICE_CD_1() != null) {
					msgKey.setKeyValue("l_INVOICE_CD_1", key.getl_INVOICE_CD_1());
				}
				if(msgKeyType.containsKeyColumn("l_SCDL_SHIP_DATE") && key.getl_SCDL_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_SCDL_SHIP_DATE", key.getl_SCDL_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD") && key.getl_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("l_DLV_LOC_CD", key.getl_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DEPARTURE_PLACE") && key.getl_DEPARTURE_PLACE() != null) {
					msgKey.setKeyValue("l_DEPARTURE_PLACE", key.getl_DEPARTURE_PLACE());
				}
				if(msgKeyType.containsKeyColumn("l_DEPARTURE_DATE") && key.getl_DEPARTURE_DATE() != null) {
					msgKey.setKeyValue("l_DEPARTURE_DATE", key.getl_DEPARTURE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ARRIVAL_PLACE") && key.getl_ARRIVAL_PLACE() != null) {
					msgKey.setKeyValue("l_ARRIVAL_PLACE", key.getl_ARRIVAL_PLACE());
				}
				if(msgKeyType.containsKeyColumn("l_ARRIVAL_DATE_1") && key.getl_ARRIVAL_DATE_1() != null) {
					msgKey.setKeyValue("l_ARRIVAL_DATE_1", key.getl_ARRIVAL_DATE_1());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_METHOD") && key.getl_TRANSPORT_METHOD() != null) {
					msgKey.setKeyValue("l_TRANSPORT_METHOD", key.getl_TRANSPORT_METHOD());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_NO") && key.getl_SHIP_NO() != null) {
					msgKey.setKeyValue("l_SHIP_NO", key.getl_SHIP_NO());
				}
				if(msgKeyType.containsKeyColumn("l_INVOICE_AMOUNT") && key.getl_INVOICE_AMOUNT() != null) {
					msgKey.setKeyValue("l_INVOICE_AMOUNT", key.getl_INVOICE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_INVOICE_TAX_AMOUNT") && key.getl_INVOICE_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("l_INVOICE_TAX_AMOUNT", key.getl_INVOICE_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS_1") && key.getl_REMARKS_1() != null) {
					msgKey.setKeyValue("l_REMARKS_1", key.getl_REMARKS_1());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS_2") && key.getl_REMARKS_2() != null) {
					msgKey.setKeyValue("l_REMARKS_2", key.getl_REMARKS_2());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
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
					KU0090010Struct key = new KU0090010Struct();
					if(msgKeyType.containsKeyColumn("OPed")) {
						key.setOPed(msgKey.getKeyValue("OPed"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_FROM")) {
						key.setSHIP_PLAN_DATE_TIME_FROM(msgKey.getKeyValue("SHIP_PLAN_DATE_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_TO")) {
						key.setSHIP_PLAN_DATE_TIME_TO(msgKey.getKeyValue("SHIP_PLAN_DATE_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("INVOICE_CD")) {
						key.setINVOICE_CD(msgKey.getKeyValue("INVOICE_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_FROM")) {
						key.setSHIP_INVOICE_DATE_FROM(msgKey.getKeyValue("SHIP_INVOICE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_TO")) {
						key.setSHIP_INVOICE_DATE_TO(msgKey.getKeyValue("SHIP_INVOICE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_FROM")) {
						key.setSCDL_SHIP_DATE_FROM(msgKey.getKeyValue("SCDL_SHIP_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_TO")) {
						key.setSCDL_SHIP_DATE_TO(msgKey.getKeyValue("SCDL_SHIP_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_PRINT_FLG")) {
						key.setw_PRINT_FLG(msgKey.getKeyValue("w_PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_INVOICE_CTL_NO")) {
						key.setl_SHIP_INVOICE_CTL_NO(msgKey.getKeyValue("l_SHIP_INVOICE_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_INVOICE_CD_1")) {
						key.setl_INVOICE_CD_1(msgKey.getKeyValue("l_INVOICE_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("l_SCDL_SHIP_DATE")) {
						key.setl_SCDL_SHIP_DATE(msgKey.getKeyValue("l_SCDL_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD")) {
						key.setl_DLV_LOC_CD(msgKey.getKeyValue("l_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPARTURE_PLACE")) {
						key.setl_DEPARTURE_PLACE(msgKey.getKeyValue("l_DEPARTURE_PLACE"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPARTURE_DATE")) {
						key.setl_DEPARTURE_DATE(msgKey.getKeyValue("l_DEPARTURE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ARRIVAL_PLACE")) {
						key.setl_ARRIVAL_PLACE(msgKey.getKeyValue("l_ARRIVAL_PLACE"));
					}
					if(msgKeyType.containsKeyColumn("l_ARRIVAL_DATE_1")) {
						key.setl_ARRIVAL_DATE_1(msgKey.getKeyValue("l_ARRIVAL_DATE_1"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_METHOD")) {
						key.setl_TRANSPORT_METHOD(msgKey.getKeyValue("l_TRANSPORT_METHOD"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_NO")) {
						key.setl_SHIP_NO(msgKey.getKeyValue("l_SHIP_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_INVOICE_AMOUNT")) {
						key.setl_INVOICE_AMOUNT(msgKey.getKeyValue("l_INVOICE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_INVOICE_TAX_AMOUNT")) {
						key.setl_INVOICE_TAX_AMOUNT(msgKey.getKeyValue("l_INVOICE_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS_1")) {
						key.setl_REMARKS_1(msgKey.getKeyValue("l_REMARKS_1"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS_2")) {
						key.setl_REMARKS_2(msgKey.getKeyValue("l_REMARKS_2"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
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
