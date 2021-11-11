/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0020/src/com/nec/jp/orteus/metamorBase/KU0020/KU0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0020;

import com.nec.jp.orteus.metamorBase.KU0020.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KU0020010Control
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
        protected List list; // �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X
       
        // �f�t�H���g�A�N�Z�T���\�b�h
        public List getList() {
         return this.list;
        } // ���X�g��Ԃ��܂��B
        public void setList(List listname) {
         this.list = listname;
        } // ���X�g���Z�b�g���܂��B
        public int getListsize() { // ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if (this.list != null) {
          nret = this.list.size();
         }
         return nret;
        }
        //	public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l��Ԃ��܂��B
        public KU0020010Struct getListvalue(int x) {
         return (KU0020010Struct) (this.list.get(x));
        } // ���X�g�̒l��Ԃ��܂��B
        public KU0020010Struct getStruct() {
         return this.struct;
        } // Struct��Ԃ��܂��B
        public KU0020010Struct createStruct() {
         return new KU0020010Struct();
        } // �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) {
         this.struct.setStruct((KU0020010Struct) structname);
        } // Struct���Z�b�g���܂��B
        public void initializeStruct() {
         this.struct.initialize();
        } // Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter() {
         return this.csvWriter;
        }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr) {
         this.csvReader = cr;
        }
       
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        /**
         * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         */
        private void setInformationMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addInfo(emsg);
        }
        /**
         * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         */
        private void setWarningMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
         * @param code ���b�Z�[�W�R�[�h
         * @param value1 �u��������P
         */
        private void setWarningMessage(String code, String value1) {
         ExpjMessage emsg = new ExpjMessage(code, value1);
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
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
         param.append(".");
         param.append(columnName);
         param.append(":");
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
       
        /**
         * ��ʂ̑S���ڂ����������܂��B
         */
        private void initializeAll() {
         struct.setr1_PrintType("true");
         struct.setr2_PrintType(null);
         struct.setr3_PrintType(null);
         struct.setDESINATED_SHIP_DATE_FROM(null);
         struct.setDESINATED_SHIP_DATE_TO(null);
         struct.setSLIP_CD_FROM(null);
         struct.setSLIP_CD_TO(null);
         struct.setWH_CD(null);
         struct.setCUST_CD(null);
         struct.setc_ReOut(null);
       
         initializeDetail();
        }
       
        /**
         * ��ʂ̏ڍ׍��ڂ����������܂��B
         */
        private void initializeDetail() {
       
         list = null;
       
         readStatus = INITIAL;
        }

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0020");
		logger.entering("KU0020010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			KU0020010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			String printId = null; // ���[ID���w�肵�Ă�������
			if ("true".equals(struct.getr1_PrintType())) {
				printId = "KU00200101"; // ���[ID���w�肵�Ă�������
			} else if ("true".equals(struct.getr2_PrintType())) {
				printId = "KU00200102"; // ���[ID���w�肵�Ă�������
			} else {
				printId = "KU00200103"; // ���[ID���w�肵�Ă�������
			}

			// ��ۊǋ�R�[�h������͂���Ă����ꍇ�A���݃`�F�b�N������B
			if (struct.getWH_CD() != null && !"".equals(struct.getWH_CD())) {
				if (!entity.mM_WH.check(conn, struct)) {
					setErrorMessage("KU00027");
					setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
				}
			}
			// ����Ӑ�R�[�h������͂���Ă����ꍇ�A���݃`�F�b�N������B
			if (struct.getCUST_CD() != null && !"".equals(struct.getCUST_CD())) {
				if (!entity.mM_CUST.check(conn, struct)) {
					setErrorMessage("KA00032");
					setErrorParameter("M_CUST", "CUST_CD", struct.getCUST_CD());
				}
			}

			// �G���[���������ꍇ�͏������I��
			if (msgStruct.hasError()) {
				return;
			}

			// �`�F�b�N�{�b�N�X�̒l����Ɍ����L�[���Z�b�g
			if ("true".equals(struct.getc_ReOut())) {
				struct.setPRINT_FLG("1");
			} else {
				struct.setPRINT_FLG("0");
			}

			// �o�׎w���`�[�p��Ж�
			String companyName = null;			
	
			ret = svf.VrInit(printId); // PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath(); // pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName(); // pdf�t�@�C�����iWeb�p�j
			String excuteOutput = svf.getExcuteOutput(); // �T�[�o�o�͏���
			
			if(dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}

		
			/* �N�G���[�t�@�C���̎w�� */
			
			if ("true".equals(struct.getr1_PrintType())) {
				// MIN�l��MAX�l�����
				List WorkList = entity.mPdf_1.read(conn, struct);
				KU0020010Struct Workstruct = (KU0020010Struct)WorkList.get(0);

				if (Workstruct.getMIN_DESINATED_SHIP_DATE() == null
						|| "".equals(Workstruct.getMIN_DESINATED_SHIP_DATE())) {
					setErrorMessage("ZZ06001");
					return;
				} else {
					struct.setMIN_DESINATED_SHIP_DATE(Workstruct.getMIN_DESINATED_SHIP_DATE());
					struct.setMAX_DESINATED_SHIP_DATE(Workstruct.getMAX_DESINATED_SHIP_DATE());
				}
				/* �N�G���[���o�����̎w�� */


				ret = svf.VrCondition("[X|MIN_DESINATED_SHIP_DATE]=" + struct.getMIN_DESINATED_SHIP_DATE(), 4);

				ret = svf.VrCondition("[X|MAX_DESINATED_SHIP_DATE]=" + struct.getMAX_DESINATED_SHIP_DATE(), 4);
								
				
			}else if ("true".equals(struct.getr3_PrintType())) {
				// ��Ж����擾
				List classCodeList = entity.mSYS_CLASS_CODE.read(conn, struct);
				if (!classCodeList.isEmpty()) {
					KU0020010Struct classCodeStruct = (KU0020010Struct) classCodeList.get(0);
					companyName = classCodeStruct.getCODE_NAME();					
				}
				if (companyName==null||"".equals(companyName)){
					ret = svf.VrCondition("[X|COMPANY_NAME]=" + "#", 4);
					ret = svf.VrCondition("[X|COMPANY_NAME_FLG]=" + "0", 4);
				}else{
					ret = svf.VrCondition("[X|COMPANY_NAME]=" + companyName, 4);
					ret = svf.VrCondition("[X|COMPANY_NAME_FLG]=" + "1", 4);
				}
				
			}


			/* �N�G���[���o�����̎w�� */
			
			//�o�׎w���
			if (struct.getDESINATED_SHIP_DATE_FROM()==null||"".equals(struct.getDESINATED_SHIP_DATE_FROM())){
				ret = svf.VrCondition("[X|DESINATED_SHIP_DATE_FROM]=" + "1000/01/01", 4);
			}else{
				ret = svf.VrCondition("[X|DESINATED_SHIP_DATE_FROM]=" + struct.getDESINATED_SHIP_DATE_FROM(), 4);
			}				

			if (struct.getDESINATED_SHIP_DATE_TO()==null||"".equals(struct.getDESINATED_SHIP_DATE_TO())){
				ret = svf.VrCondition("[X|DESINATED_SHIP_DATE_TO]=" + "9999/12/31", 4);
			}else{
				ret = svf.VrCondition("[X|DESINATED_SHIP_DATE_TO]=" + struct.getDESINATED_SHIP_DATE_TO(), 4);
			}				
			//�`�[�ԍ�
			if (struct.getSLIP_CD_FROM()==null||"".equals(struct.getSLIP_CD_FROM())){
				ret = svf.VrCondition("[X|SLIP_CD_FROM]=" + "AAAAAAAAAAAAAAAAAAAAAAAAAA", 4);
			}else{
				ret = svf.VrCondition("[X|SLIP_CD_FROM]=" + struct.getSLIP_CD_FROM(), 4);
			}

			if (struct.getSLIP_CD_TO()==null||"".equals(struct.getSLIP_CD_TO())){
				ret = svf.VrCondition("[X|SLIP_CD_TO]=" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZ", 4);
			}else{
				ret = svf.VrCondition("[X|SLIP_CD_TO]=" + struct.getSLIP_CD_TO(), 4);
			}
			//�ۊǋ�R�[�h
			if (struct.getWH_CD()==null||"".equals(struct.getWH_CD())){
				ret = svf.VrCondition("[X|WH_CD]=" + "%", 4);
			}else{
				ret = svf.VrCondition("[X|WH_CD]=" + struct.getWH_CD(), 4);
			}
			//���Ӑ�R�[�h
			if (struct.getCUST_CD()==null||"".equals(struct.getCUST_CD())){
				ret = svf.VrCondition("[X|CUST_CD]=" + "%", 4);
			}else{
				ret = svf.VrCondition("[X|CUST_CD]=" + struct.getCUST_CD(), 4);

			}
			//�o�͍ύďo��
			ret = svf.VrCondition("[X|PRINT_FLG]=" + struct.getPRINT_FLG(), 4);
			

			
			/* �N�G���[���s */
			ret = svf.VrReport();
			if(ret == -554) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}

			/* PDF�쐬�I�� */
			ret = svf.VrQuit();
			
			// �X�V����
			if (!"true".equals(struct.getc_ReOut())) {
				if ("true".equals(struct.getr1_PrintType())) {
					entity.mT_SHIP_ODR.update(conn, struct);
				} else if ("true".equals(struct.getr2_PrintType())) {
					entity.mT_UN_SHIP_LIST.update(conn, struct);
				} else {
					entity.mT_SHIP_SLIP.update(conn, struct);
				}
			}
			

			
			if ("0".equals(printType)) { // �N���C�A���g����̏ꍇ
				struct.setDOWNLOAD_FILE(getPdfFileName());
			} else if ("1".equals(printType)) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(excuteOutput);
				} catch (IOException e) {
					// �T�[�o������s���̃G���[�������L�q���Ă��������B
				}
			}
			
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			if (conn != null) {
				conn.rollback();
			}
			throw new ExpjException(e);
		} 
                //}}user_implement_dev:<controlPrint>
		logger.exiting("KU0020010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0020");
		logger.entering("KU0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KU0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0020");
		logger.entering("KU0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KU0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0020");
		logger.entering("KU0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			initializeAll();
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KU0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0020");
		logger.entering("KU0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KU0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KU0020010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0020010-E999","CSV�̏o�͏���"));
			throw new FoundationException("KU0020010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0020010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KU0020010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0020010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KU0020010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KU0020010Entity entity;
	protected KU0020010Struct struct;
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

		entity = new KU0020010Entity();
		struct = new KU0020010Struct();

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
	 * KU0020010�N���X�̕W���R���X�g���N�^
	 */
	public KU0020010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor

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
				KU0020010Struct key = (KU0020010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_PrintType") && key.getr1_PrintType() != null) {
					msgKey.setKeyValue("r1_PrintType", key.getr1_PrintType());
				}
				if(msgKeyType.containsKeyColumn("r2_PrintType") && key.getr2_PrintType() != null) {
					msgKey.setKeyValue("r2_PrintType", key.getr2_PrintType());
				}
				if(msgKeyType.containsKeyColumn("r3_PrintType") && key.getr3_PrintType() != null) {
					msgKey.setKeyValue("r3_PrintType", key.getr3_PrintType());
				}
				if(msgKeyType.containsKeyColumn("c_ReOut") && key.getc_ReOut() != null) {
					msgKey.setKeyValue("c_ReOut", key.getc_ReOut());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("MIN_DESINATED_SHIP_DATE") && key.getMIN_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("MIN_DESINATED_SHIP_DATE", key.getMIN_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("MAX_DESINATED_SHIP_DATE") && key.getMAX_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("MAX_DESINATED_SHIP_DATE", key.getMAX_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE_FROM") && key.getDESINATED_SHIP_DATE_FROM() != null) {
					msgKey.setKeyValue("DESINATED_SHIP_DATE_FROM", key.getDESINATED_SHIP_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE_TO") && key.getDESINATED_SHIP_DATE_TO() != null) {
					msgKey.setKeyValue("DESINATED_SHIP_DATE_TO", key.getDESINATED_SHIP_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD_FROM") && key.getSLIP_CD_FROM() != null) {
					msgKey.setKeyValue("SLIP_CD_FROM", key.getSLIP_CD_FROM());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD_TO") && key.getSLIP_CD_TO() != null) {
					msgKey.setKeyValue("SLIP_CD_TO", key.getSLIP_CD_TO());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("PRINT_FLG") && key.getPRINT_FLG() != null) {
					msgKey.setKeyValue("PRINT_FLG", key.getPRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__UN_SHIP_SEQ_NO") && key.getT_UN_SHIP_LIST__UN_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("T_UN_SHIP_LIST__UN_SHIP_SEQ_NO", key.getT_UN_SHIP_LIST__UN_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__CUST_CD") && key.getT_UN_SHIP_LIST__CUST_CD() != null) {
					msgKey.setKeyValue("T_UN_SHIP_LIST__CUST_CD", key.getT_UN_SHIP_LIST__CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("M_CUST__CUST_NAME") && key.getM_CUST__CUST_NAME() != null) {
					msgKey.setKeyValue("M_CUST__CUST_NAME", key.getM_CUST__CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_ODR_CTL__CUST_ITEM_CD") && key.getT_ODR_CTL__CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("T_ODR_CTL__CUST_ITEM_CD", key.getT_ODR_CTL__CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__ITEM_CD") && key.getT_UN_SHIP_LIST__ITEM_CD() != null) {
					msgKey.setKeyValue("T_UN_SHIP_LIST__ITEM_CD", key.getT_UN_SHIP_LIST__ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("T_ODR__CUST_ODR_NO") && key.getT_ODR__CUST_ODR_NO() != null) {
					msgKey.setKeyValue("T_ODR__CUST_ODR_NO", key.getT_ODR__CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__UN_SHIP_QTY") && key.getT_UN_SHIP_LIST__UN_SHIP_QTY() != null) {
					msgKey.setKeyValue("T_UN_SHIP_LIST__UN_SHIP_QTY", key.getT_UN_SHIP_LIST__UN_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT") && key.getM_ITEM__STOCK_UNIT() != null) {
					msgKey.setKeyValue("M_ITEM__STOCK_UNIT", key.getM_ITEM__STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__WH_CD") && key.getT_UN_SHIP_LIST__WH_CD() != null) {
					msgKey.setKeyValue("T_UN_SHIP_LIST__WH_CD", key.getT_UN_SHIP_LIST__WH_CD());
				}
				if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__ACPT_ODR_CD") && key.getT_UN_SHIP_LIST__ACPT_ODR_CD() != null) {
					msgKey.setKeyValue("T_UN_SHIP_LIST__ACPT_ODR_CD", key.getT_UN_SHIP_LIST__ACPT_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__PART_DLV_SEQ_NO") && key.getT_UN_SHIP_LIST__PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("T_UN_SHIP_LIST__PART_DLV_SEQ_NO", key.getT_UN_SHIP_LIST__PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__SLIP_CD") && key.getT_SHIP_SLIP__SLIP_CD() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__SLIP_CD", key.getT_SHIP_SLIP__SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__ITEM_CD") && key.getT_SHIP_SLIP__ITEM_CD() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__ITEM_CD", key.getT_SHIP_SLIP__ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CUST_ITEM_CD") && key.getT_SHIP_SLIP__CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__CUST_ITEM_CD", key.getT_SHIP_SLIP__CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__PART_NAME") && key.getT_SHIP_SLIP__PART_NAME() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__PART_NAME", key.getT_SHIP_SLIP__PART_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CUST_ODR_NO") && key.getT_SHIP_SLIP__CUST_ODR_NO() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__CUST_ODR_NO", key.getT_SHIP_SLIP__CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CUST_NAME") && key.getT_SHIP_SLIP__CUST_NAME() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__CUST_NAME", key.getT_SHIP_SLIP__CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__DLV_LOC_NAME_KANJI") && key.getT_SHIP_SLIP__DLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__DLV_LOC_NAME_KANJI", key.getT_SHIP_SLIP__DLV_LOC_NAME_KANJI());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__BUYER_NAME") && key.getT_SHIP_SLIP__BUYER_NAME() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__BUYER_NAME", key.getT_SHIP_SLIP__BUYER_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CUS_DLV_KEY_CD") && key.getT_SHIP_SLIP__CUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__CUS_DLV_KEY_CD", key.getT_SHIP_SLIP__CUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__DESINATED_SHIP_DATE") && key.getT_SHIP_SLIP__DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__DESINATED_SHIP_DATE", key.getT_SHIP_SLIP__DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__DESINATED_DLV_DATE") && key.getT_SHIP_SLIP__DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__DESINATED_DLV_DATE", key.getT_SHIP_SLIP__DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__SCDL_DLV_DATE") && key.getT_SHIP_SLIP__SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__SCDL_DLV_DATE", key.getT_SHIP_SLIP__SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL") && key.getT_SHIP_SLIP__PUCH_ODR_QTY_TOTAL() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL", key.getT_SHIP_SLIP__PUCH_ODR_QTY_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__DLV_ODR_QTY") && key.getT_SHIP_SLIP__DLV_ODR_QTY() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__DLV_ODR_QTY", key.getT_SHIP_SLIP__DLV_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__SHIP_ODR_QTY") && key.getT_SHIP_SLIP__SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__SHIP_ODR_QTY", key.getT_SHIP_SLIP__SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__UNIT_CD") && key.getT_SHIP_SLIP__UNIT_CD() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__UNIT_CD", key.getT_SHIP_SLIP__UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__UNIT_PRICE") && key.getT_SHIP_SLIP__UNIT_PRICE() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__UNIT_PRICE", key.getT_SHIP_SLIP__UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__SHIP_ODR_AMOUNT") && key.getT_SHIP_SLIP__SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__SHIP_ODR_AMOUNT", key.getT_SHIP_SLIP__SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__TAX_AMOUNT") && key.getT_SHIP_SLIP__TAX_AMOUNT() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__TAX_AMOUNT", key.getT_SHIP_SLIP__TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX") && key.getT_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX", key.getT_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CLIENT_REMARK_KANJI") && key.getT_SHIP_SLIP__CLIENT_REMARK_KANJI() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__CLIENT_REMARK_KANJI", key.getT_SHIP_SLIP__CLIENT_REMARK_KANJI());
				}
				if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CLIENT_BARCODE_INF") && key.getT_SHIP_SLIP__CLIENT_BARCODE_INF() != null) {
					msgKey.setKeyValue("T_SHIP_SLIP__CLIENT_BARCODE_INF", key.getT_SHIP_SLIP__CLIENT_BARCODE_INF());
				}
				if(msgKeyType.containsKeyColumn("CODE_NAME") && key.getCODE_NAME() != null) {
					msgKey.setKeyValue("CODE_NAME", key.getCODE_NAME());
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
					KU0020010Struct key = new KU0020010Struct();
					if(msgKeyType.containsKeyColumn("r1_PrintType")) {
						key.setr1_PrintType(msgKey.getKeyValue("r1_PrintType"));
					}
					if(msgKeyType.containsKeyColumn("r2_PrintType")) {
						key.setr2_PrintType(msgKey.getKeyValue("r2_PrintType"));
					}
					if(msgKeyType.containsKeyColumn("r3_PrintType")) {
						key.setr3_PrintType(msgKey.getKeyValue("r3_PrintType"));
					}
					if(msgKeyType.containsKeyColumn("c_ReOut")) {
						key.setc_ReOut(msgKey.getKeyValue("c_ReOut"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("MIN_DESINATED_SHIP_DATE")) {
						key.setMIN_DESINATED_SHIP_DATE(msgKey.getKeyValue("MIN_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MAX_DESINATED_SHIP_DATE")) {
						key.setMAX_DESINATED_SHIP_DATE(msgKey.getKeyValue("MAX_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE_FROM")) {
						key.setDESINATED_SHIP_DATE_FROM(msgKey.getKeyValue("DESINATED_SHIP_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE_TO")) {
						key.setDESINATED_SHIP_DATE_TO(msgKey.getKeyValue("DESINATED_SHIP_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD_FROM")) {
						key.setSLIP_CD_FROM(msgKey.getKeyValue("SLIP_CD_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD_TO")) {
						key.setSLIP_CD_TO(msgKey.getKeyValue("SLIP_CD_TO"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_FLG")) {
						key.setPRINT_FLG(msgKey.getKeyValue("PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__UN_SHIP_SEQ_NO")) {
						key.setT_UN_SHIP_LIST__UN_SHIP_SEQ_NO(msgKey.getKeyValue("T_UN_SHIP_LIST__UN_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__CUST_CD")) {
						key.setT_UN_SHIP_LIST__CUST_CD(msgKey.getKeyValue("T_UN_SHIP_LIST__CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("M_CUST__CUST_NAME")) {
						key.setM_CUST__CUST_NAME(msgKey.getKeyValue("M_CUST__CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_ODR_CTL__CUST_ITEM_CD")) {
						key.setT_ODR_CTL__CUST_ITEM_CD(msgKey.getKeyValue("T_ODR_CTL__CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__ITEM_CD")) {
						key.setT_UN_SHIP_LIST__ITEM_CD(msgKey.getKeyValue("T_UN_SHIP_LIST__ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_ODR__CUST_ODR_NO")) {
						key.setT_ODR__CUST_ODR_NO(msgKey.getKeyValue("T_ODR__CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__UN_SHIP_QTY")) {
						key.setT_UN_SHIP_LIST__UN_SHIP_QTY(msgKey.getKeyValue("T_UN_SHIP_LIST__UN_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT")) {
						key.setM_ITEM__STOCK_UNIT(msgKey.getKeyValue("M_ITEM__STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__WH_CD")) {
						key.setT_UN_SHIP_LIST__WH_CD(msgKey.getKeyValue("T_UN_SHIP_LIST__WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__ACPT_ODR_CD")) {
						key.setT_UN_SHIP_LIST__ACPT_ODR_CD(msgKey.getKeyValue("T_UN_SHIP_LIST__ACPT_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_UN_SHIP_LIST__PART_DLV_SEQ_NO")) {
						key.setT_UN_SHIP_LIST__PART_DLV_SEQ_NO(msgKey.getKeyValue("T_UN_SHIP_LIST__PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__SLIP_CD")) {
						key.setT_SHIP_SLIP__SLIP_CD(msgKey.getKeyValue("T_SHIP_SLIP__SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__ITEM_CD")) {
						key.setT_SHIP_SLIP__ITEM_CD(msgKey.getKeyValue("T_SHIP_SLIP__ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CUST_ITEM_CD")) {
						key.setT_SHIP_SLIP__CUST_ITEM_CD(msgKey.getKeyValue("T_SHIP_SLIP__CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__PART_NAME")) {
						key.setT_SHIP_SLIP__PART_NAME(msgKey.getKeyValue("T_SHIP_SLIP__PART_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CUST_ODR_NO")) {
						key.setT_SHIP_SLIP__CUST_ODR_NO(msgKey.getKeyValue("T_SHIP_SLIP__CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CUST_NAME")) {
						key.setT_SHIP_SLIP__CUST_NAME(msgKey.getKeyValue("T_SHIP_SLIP__CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__DLV_LOC_NAME_KANJI")) {
						key.setT_SHIP_SLIP__DLV_LOC_NAME_KANJI(msgKey.getKeyValue("T_SHIP_SLIP__DLV_LOC_NAME_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__BUYER_NAME")) {
						key.setT_SHIP_SLIP__BUYER_NAME(msgKey.getKeyValue("T_SHIP_SLIP__BUYER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CUS_DLV_KEY_CD")) {
						key.setT_SHIP_SLIP__CUS_DLV_KEY_CD(msgKey.getKeyValue("T_SHIP_SLIP__CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__DESINATED_SHIP_DATE")) {
						key.setT_SHIP_SLIP__DESINATED_SHIP_DATE(msgKey.getKeyValue("T_SHIP_SLIP__DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__DESINATED_DLV_DATE")) {
						key.setT_SHIP_SLIP__DESINATED_DLV_DATE(msgKey.getKeyValue("T_SHIP_SLIP__DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__SCDL_DLV_DATE")) {
						key.setT_SHIP_SLIP__SCDL_DLV_DATE(msgKey.getKeyValue("T_SHIP_SLIP__SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL")) {
						key.setT_SHIP_SLIP__PUCH_ODR_QTY_TOTAL(msgKey.getKeyValue("T_SHIP_SLIP__PUCH_ODR_QTY_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__DLV_ODR_QTY")) {
						key.setT_SHIP_SLIP__DLV_ODR_QTY(msgKey.getKeyValue("T_SHIP_SLIP__DLV_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__SHIP_ODR_QTY")) {
						key.setT_SHIP_SLIP__SHIP_ODR_QTY(msgKey.getKeyValue("T_SHIP_SLIP__SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__UNIT_CD")) {
						key.setT_SHIP_SLIP__UNIT_CD(msgKey.getKeyValue("T_SHIP_SLIP__UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__UNIT_PRICE")) {
						key.setT_SHIP_SLIP__UNIT_PRICE(msgKey.getKeyValue("T_SHIP_SLIP__UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__SHIP_ODR_AMOUNT")) {
						key.setT_SHIP_SLIP__SHIP_ODR_AMOUNT(msgKey.getKeyValue("T_SHIP_SLIP__SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__TAX_AMOUNT")) {
						key.setT_SHIP_SLIP__TAX_AMOUNT(msgKey.getKeyValue("T_SHIP_SLIP__TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX")) {
						key.setT_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX(msgKey.getKeyValue("T_SHIP_SLIP__SHIP_ODR_AMOUNT_TAX"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CLIENT_REMARK_KANJI")) {
						key.setT_SHIP_SLIP__CLIENT_REMARK_KANJI(msgKey.getKeyValue("T_SHIP_SLIP__CLIENT_REMARK_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("T_SHIP_SLIP__CLIENT_BARCODE_INF")) {
						key.setT_SHIP_SLIP__CLIENT_BARCODE_INF(msgKey.getKeyValue("T_SHIP_SLIP__CLIENT_BARCODE_INF"));
					}
					if(msgKeyType.containsKeyColumn("CODE_NAME")) {
						key.setCODE_NAME(msgKey.getKeyValue("CODE_NAME"));
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
