/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0040/src/com/nec/jp/orteus/metamorBase/AC0040/AC0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0040;

import com.nec.jp.orteus.metamorBase.AC0040.*;
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
import java.text.DecimalFormat;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0040010Control
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
        public AC0040010Struct getListvalue(int x) { return (AC0040010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
        public AC0040010Struct getStruct() { return this.struct; }	// Struct��Ԃ��܂��B
        public AC0040010Struct createStruct() { return new AC0040010Struct(); }	// �V����Struct������ĕԂ��܂��B
        public void setStruct(Object structname) { this.struct.setStruct((AC0040010Struct)structname); }	// Struct���Z�b�g���܂��B
        public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B
       
        // CSV�o�͗p���X�g
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
         private String format(String value) throws Exception {
          if (value == null) {
           return "";
          }
          Double dblValue = Double.valueOf(value);
          // CSV�̐������ڃt�H�[�}�b�g
          DecimalFormat cvsFormatter = new DecimalFormat("###,###,###,###,##0.00");
          return cvsFormatter.format(dblValue.doubleValue());
         }
 		//�R���{�{�b�N�X�̐����擾�i������j
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
     			throw new ExpjException(e, emsg);
     		}
     	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AC0040010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			String printId1 = "AC00400101";
			String queryId1 = null;
			
		try {
			//���������F�H��R�[�h�̎w��
			struct.setk_PLANT_CD(getsysPLANT_CD());
			
			//���������F���t�̎w��
			struct.setk_ODR_START_DATE(null);
			struct.setk_PRD_DUE_DATE(null);
			struct.setk_PRD_START_DATE(null);
			
			//���������F�����̎w��
			struct.setk_VEND_CD(struct.getVEND_CD());
			// �����͂܂���%�̂Ƃ���null�ɂ���
			if ( struct.getVEND_CD() != null && 
					(struct.getVEND_CD().equals("") || struct.getVEND_CD().equals("%")) ) {
				struct.setk_VEND_CD(null);
			}
			
			//���������F���Ԃ̎w��
			struct.setk_JOB_ODR_CD(struct.getJOB_ODR_CD());
			// �����͂܂���%�̂Ƃ���null�ɂ���
			if ( struct.getJOB_ODR_CD() != null &&
				(struct.getJOB_ODR_CD().equals("") || struct.getJOB_ODR_CD().equals("%")) ) {
				struct.setk_JOB_ODR_CD(null);
			}
			
			// ��������J�n
			if (struct.getr_ODR_START_DATE().equals("true")) { // ��z�����
				struct.setk_ODR_START_DATE(struct.getINPUT_DATE());
				struct.setIN_RadioButton("1");
				
				if (struct.getc_CHECK3().equals("true")) { // �����c���܂߂�Ƀ`�F�b�N������
					struct.setk_ODR_STS_TYP(null);
					struct.setIN_c_CHECK3("1");
					
					if (struct.getk_VEND_CD() == null) { // ����悪�����͂܂��́�
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC00400101";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC00400102";
						}
					} else { // // ����悪���͂���Ă���
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC00400103";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC00400104";
						}
					}
				} else { // �����c���܂߂�Ƀ`�F�b�N���Ȃ�
					struct.setk_ODR_STS_TYP("1");
					struct.setIN_c_CHECK3(null);
					
					if (struct.getk_VEND_CD() == null) { // ����悪�����͂܂��́�
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC00400105";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC00400106";
						}
					} else { // // ����悪���͂���Ă���
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC00400107";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC00400108";
						}
					}
					
				}
			} else if (struct.getr_PRD_START_DATE().equals("true")) { // ���������
				struct.setk_PRD_START_DATE(struct.getINPUT_DATE());
				struct.setIN_RadioButton("2");
				
				if (struct.getc_CHECK3().equals("true")) { // �����c���܂߂�Ƀ`�F�b�N������
					struct.setk_ODR_STS_TYP(null);
					struct.setIN_c_CHECK3("1");
					
					if (struct.getk_VEND_CD() == null) { // ����悪�����͂܂��́�
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC00400109";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC004001010";
						}
					} else { // // ����悪���͂���Ă���
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC004001011";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC004001012";
						}
					}
				} else { // �����c���܂߂�Ƀ`�F�b�N���Ȃ�
					struct.setk_ODR_STS_TYP("1");
					struct.setIN_c_CHECK3(null);
					
					if (struct.getk_VEND_CD() == null) { // ����悪�����͂܂��́�
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC004001013";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC004001014";
						}
					} else { // // ����悪���͂���Ă���
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC004001015";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC004001016";
						}
					}
				}
			} else { // �����[��
				struct.setk_PRD_DUE_DATE(struct.getINPUT_DATE());
				struct.setIN_RadioButton("3");
				
				if (struct.getc_CHECK3().equals("true")) { // �����c���܂߂�Ƀ`�F�b�N������
					struct.setk_ODR_STS_TYP(null);
					struct.setIN_c_CHECK3("1");
					
					if (struct.getk_VEND_CD() == null) { // ����悪�����͂܂��́�
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC004001017";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC004001018";
						}
					} else { // // ����悪���͂���Ă���
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC004001019";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC004001020";
						}
					}
				} else { // �����c���܂߂�Ƀ`�F�b�N���Ȃ�
					struct.setk_ODR_STS_TYP("1");
					struct.setIN_c_CHECK3(null);
					
					if (struct.getk_VEND_CD() == null) { // ����悪�����͂܂��́�
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC004001021";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC004001022";
						}
					} else { // // ����悪���͂���Ă���
						if (struct.getk_JOB_ODR_CD() == null) { // ���Ԃ������͂܂��́�
							queryId1 = "AC004001023";
						} else { // // ���Ԃ����͂���Ă���
							queryId1 = "AC004001024";
						}
					}
				}
			}

			ret = svf.VrInit(printId1,queryId1);	// PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath();	// pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName();	// pdf�t�@�C�����iWeb�p�j
			queryFileName = svf.getQueryFileName();	// query�t�@�C����

			/* �N�G���[�t�@�C���̎w�� */
			if(dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}
			/* �N�G���[���o�����̎w�� */

			ret = svf.VrCondition("[X|PLANT_CD]=" + struct.getk_PLANT_CD(), 4); // �H��R�[�h
			ret = svf.VrCondition("[X|ODR_START_DATE]=" + struct.getk_ODR_START_DATE(), 4); // ��z�����
			ret = svf.VrCondition("[X|PRD_START_DATE]=" + struct.getk_PRD_START_DATE(), 4); // ���������
			ret = svf.VrCondition("[X|PRD_DUE_DATE]=" + struct.getk_PRD_DUE_DATE(), 4); // �����[��
			ret = svf.VrCondition("[X|VEND_CD]=" + struct.getk_VEND_CD(), 4); // �����
			ret = svf.VrCondition("[X|JOB_ODR_CD]=" + struct.getk_JOB_ODR_CD(), 4); // ����
			ret = svf.VrCondition("[X|ODR_STS_TYP]=" + struct.getk_ODR_STS_TYP(), 4); // �I�[�_��ԋ敪


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
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				}catch(IOException e){
					// �T�[�o������s���̃G���[�������L�q���Ă��������B
                   ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                   sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
                   ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
                   throw ee;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                 
                try{
                 //�Ɩ��^�p���̎擾
                 struct.setuser_PLANT_CD(getsysPLANT_CD());
                 list = entity.mselectSYS_DATE_CTRL.read(conn,struct);
                 AC0040010Struct strDate = null;
                 strDate = (AC0040010Struct)list.get(0);
                 struct.setBUSINESS_OPR_DATE(strDate.getBUSINESS_OPR_DATE());
                 
                } catch(SQLException e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
                 ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
                 throw ee;
                }catch(Exception e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
                 ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
                 throw ee;
                }
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
                try {
                 csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
                 // CSV�o�͏��擾
                 setReadStatus(INITIAL );
              
                 //���������F���t�̎w��
                 struct.setk_ODR_START_DATE(null);
                 struct.setk_PRD_DUE_DATE(null);
                 struct.setk_PRD_START_DATE(null);
                 if (struct.getr_ODR_START_DATE().equals("true")) {
                  struct.setk_ODR_START_DATE(struct.getINPUT_DATE());
                  struct.setIN_RadioButton("1");
                 } else if (struct.getr_PRD_START_DATE().equals("true")) {
                  struct.setk_PRD_START_DATE(struct.getINPUT_DATE());
                  struct.setIN_RadioButton("2");
                 } else {
                  struct.setk_PRD_DUE_DATE(struct.getINPUT_DATE());
                  struct.setIN_RadioButton("3");
                 }
                 //���������F�H��R�[�h�̎w��
                 struct.setk_PLANT_CD(getsysPLANT_CD());
                 //���������F�I�[�_��ԋ敪�̎w��
                 if (struct.getc_CHECK3().equals("true")) {
                  struct.setk_ODR_STS_TYP(null);
                  struct.setIN_c_CHECK3("1");
                 } else {
                  struct.setk_ODR_STS_TYP("1");
                  struct.setIN_c_CHECK3(null);
                 }
                 //���������F�����̎w��
                 struct.setk_VEND_CD(struct.getVEND_CD());
                 if (struct.getVEND_CD() != null && struct.getVEND_CD().equals("%")) {
                  struct.setk_VEND_CD(null);
                 }
                 //���������F���Ԃ̎w��
                 struct.setk_JOB_ODR_CD(struct.getJOB_ODR_CD());
                 if (struct.getJOB_ODR_CD() != null && struct.getJOB_ODR_CD().equals("%")) {
                  struct.setk_JOB_ODR_CD(null);
                 }
                 //�w���\��\�u�h�d�v�̓ǂݍ���
                 list = entity.mselectT_OD.read(conn, struct);
                 if(getListsize() == 0){
                  //�w��L�[�̃f�[�^�����݂��܂���B
                  ExpjMessage emsg = new ExpjMessage("ZZ01101");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());//�G���[�ڍ�
                  setReadStatus(NOT_FOUND);
                  return;
                 }
              
                 List csvList = new ArrayList();
                 //CSV���̍쐬
                 String csvTitle[] = {
						"Expj.OD_NO" ,
						"Expj.PLANT_CD" ,
						"Expj.JOB_ODR_CD" ,
						"Expj.JOB_ODR_DETAIL_NO" ,
						"Expj.ITEM_CD" ,
						"Expj.ITEM_NAME" ,
						"Expj.COMPANY_CD" ,
						"Expj.VEND_CD" ,
						"Expj.Cmt1064" ,
						"Expj.ODR_STS_TYP" ,
						"Expj.Cmt6204",
						"Expj.ODR_START_DATE" ,
						"Expj.PRD_DUE_DATE" ,
						"Expj.PRD_START_DATE" ,
						"Expj.OD_TYP" ,
						"Expj.Cmt6205",
						"Expj.ODR_QTY" ,
						"Expj.OUTSIDE_TYP_3" ,
						"Expj.Cmt6206",
						"Expj.RCV_QTY_1" ,
						"Expj.PUCH_ODR_QTY" ,
						"Expj.UNIT_COST" ,
						"Expj.UNIT_COST_TYP" ,
						"Expj.Cmt1094",
						"Expj.ROUND_TYP" ,
						"Expj.Cmt6207",
						"Expj.PUCH_ODR_AMOUNT_2" 
				};
                 csvList.add(csvTitle);
                 AC0040010Struct workStruct;
                 for(int i=0;i<getListsize();i++){
                  workStruct = getListvalue(i);
                  //�R���{�{�b�N�X�̎擾  
                  workStruct.setODR_STS_TYP_DEN(multcombo("ODR_STS_TYP",workStruct.gets_ODR_STS_TYP()));
                  workStruct.setOD_TYP_DEN(multcombo("OD_TYP",workStruct.gets_OD_TYP()));
                  workStruct.setOUTSIDE_TYP_DEN(multcombo("OUTSIDE_TYP",workStruct.gets_OUTSIDE_TYP()));
                  workStruct.setROUND_TYP_DEN(multcombo("ROUND_TYP",workStruct.gets_ROUND_TYP()));
                  workStruct.setUNIT_COST_TYP_DEN(multcombo("UNIT_COST_TYP",workStruct.gets_UNIT_COST_TYP()));
                  
                  String csvStr [] = new String[csvTitle.length];
                  csvStr[0] = workStruct.gets_OD_NO();
                  csvStr[1] = workStruct.gets_PLANT_CD();
                  csvStr[2] = workStruct.gets_JOB_ODR_CD();
                  csvStr[3] = workStruct.gets_JOB_ODR_DETAIL_NO();
                  csvStr[4] = workStruct.gets_ITEM_CD();
                  csvStr[5] = workStruct.gets_ITEM_NAME();
                  csvStr[6] = workStruct.gets_COMPANY_CD();
                  csvStr[7] = workStruct.gets_VEND_CD();
                  csvStr[8] = workStruct.gets_VEND_NAME();
                  csvStr[9] = workStruct.gets_ODR_STS_TYP();
                  csvStr[10] = workStruct.getODR_STS_TYP_DEN();
                  csvStr[11] = workStruct.gets_ODR_START_DATE();
                  csvStr[12] = workStruct.gets_PRD_DUE_DATE();
                  csvStr[13] = workStruct.gets_PRD_START_DATE();
                  csvStr[14] = workStruct.gets_OD_TYP();
                  csvStr[15] = workStruct.getOD_TYP_DEN();
                  csvStr[16] = this.format(workStruct.gets_ODR_QTY());
                  csvStr[17] = workStruct.gets_OUTSIDE_TYP();
                  csvStr[18] = workStruct.getOUTSIDE_TYP_DEN();
                  csvStr[19] = this.format(workStruct.gets_TOTAL_RCV_QTY());
                  csvStr[20] = this.format(workStruct.gets_PUCH_ODR_QTY());
                  csvStr[21] = this.format(workStruct.gets_UNIT_COST());
                  csvStr[22] = workStruct.gets_UNIT_COST_TYP();
                  csvStr[23] = workStruct.getUNIT_COST_TYP_DEN();
                  csvStr[24] = workStruct.gets_ROUND_TYP();
                  csvStr[25] = workStruct.getROUND_TYP_DEN();
                  csvStr[26] = this.format(workStruct.gets_PUCH_ODR_AMOUNT());
                  csvList.add(csvStr);
                 }
              
                 if(csvList != null && csvList.size() > 0){
                  try{
                   csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
                  }catch(Exception e){
                   //CSV�o�͎��s
                   ExpjMessage emsg = new ExpjMessage("ZZ01107");
                   sysLog.severe(emsg, getsysUSER_CD());
                   ExpjException ee = new ExpjException(e, emsg);
                   throw ee;
                  }
                 }
                 setReadStatus(NORMAL);
                 
                } catch(Exception e) {
                 e.printStackTrace();
                 // �G���[�������L�q���Ă��������B
                }
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try{
                 // ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
                 if ( isScreenMove() == true ) {
                  // �����̃R���g���[�����\�b�h���Ăяo���܂��B
              //				controlSelect();
                 }
              
                 //�Ɩ��^�p���̎擾
                 struct.setuser_PLANT_CD(getsysPLANT_CD());
                 list = entity.mselectSYS_DATE_CTRL.read(conn,struct);
                 AC0040010Struct strDate = null;
                 strDate = (AC0040010Struct)list.get(0);
                 struct.setBUSINESS_OPR_DATE(strDate.getBUSINESS_OPR_DATE());
                 
                } catch(SQLException e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
                 ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
                 throw ee;
                }catch(Exception e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
                 ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
                 throw ee;
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
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
//			throw new FoundationException("AC0040010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0040010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AC0040010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0040010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AC0040010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0040010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AC0040010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AC0040010Entity entity;
	protected AC0040010Struct struct;
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

		entity = new AC0040010Entity();
		struct = new AC0040010Struct();

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
	 * AC0040010�N���X�̕W���R���X�g���N�^
	 */
	public AC0040010Control() throws BusinessProcessException, FoundationException
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
				AC0040010Struct key = (AC0040010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("SUBMIT_BUTTON_TYPE") && key.getSUBMIT_BUTTON_TYPE() != null) {
					msgKey.setKeyValue("SUBMIT_BUTTON_TYPE", key.getSUBMIT_BUTTON_TYPE());
				}
				if(msgKeyType.containsKeyColumn("PRINTER_TYPE") && key.getPRINTER_TYPE() != null) {
					msgKey.setKeyValue("PRINTER_TYPE", key.getPRINTER_TYPE());
				}
				if(msgKeyType.containsKeyColumn("SELECTED_PRINTER") && key.getSELECTED_PRINTER() != null) {
					msgKey.setKeyValue("SELECTED_PRINTER", key.getSELECTED_PRINTER());
				}
				if(msgKeyType.containsKeyColumn("r_ODR_START_DATE") && key.getr_ODR_START_DATE() != null) {
					msgKey.setKeyValue("r_ODR_START_DATE", key.getr_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("INPUT_DATE") && key.getINPUT_DATE() != null) {
					msgKey.setKeyValue("INPUT_DATE", key.getINPUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("r_PRD_START_DATE") && key.getr_PRD_START_DATE() != null) {
					msgKey.setKeyValue("r_PRD_START_DATE", key.getr_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("r_PRD_DUE_DATE") && key.getr_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("r_PRD_DUE_DATE", key.getr_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("c_CHECK3") && key.getc_CHECK3() != null) {
					msgKey.setKeyValue("c_CHECK3", key.getc_CHECK3());
				}
				if(msgKeyType.containsKeyColumn("IN_c_CHECK3") && key.getIN_c_CHECK3() != null) {
					msgKey.setKeyValue("IN_c_CHECK3", key.getIN_c_CHECK3());
				}
				if(msgKeyType.containsKeyColumn("IN_RadioButton") && key.getIN_RadioButton() != null) {
					msgKey.setKeyValue("IN_RadioButton", key.getIN_RadioButton());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DEN") && key.getODR_STS_TYP_DEN() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_DEN", key.getODR_STS_TYP_DEN());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP_DEN") && key.getOD_TYP_DEN() != null) {
					msgKey.setKeyValue("OD_TYP_DEN", key.getOD_TYP_DEN());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DEN") && key.getOUTSIDE_TYP_DEN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DEN", key.getOUTSIDE_TYP_DEN());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP_DEN") && key.getROUND_TYP_DEN() != null) {
					msgKey.setKeyValue("ROUND_TYP_DEN", key.getROUND_TYP_DEN());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_DEN") && key.getUNIT_COST_TYP_DEN() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_DEN", key.getUNIT_COST_TYP_DEN());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("user_PLANT_CD") && key.getuser_PLANT_CD() != null) {
					msgKey.setKeyValue("user_PLANT_CD", key.getuser_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("s_OD_NO") && key.gets_OD_NO() != null) {
					msgKey.setKeyValue("s_OD_NO", key.gets_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("s_PLANT_CD") && key.gets_PLANT_CD() != null) {
					msgKey.setKeyValue("s_PLANT_CD", key.gets_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("s_JOB_ODR_CD") && key.gets_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("s_JOB_ODR_CD", key.gets_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("s_JOB_ODR_DETAIL_NO") && key.gets_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("s_JOB_ODR_DETAIL_NO", key.gets_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("s_ITEM_CD") && key.gets_ITEM_CD() != null) {
					msgKey.setKeyValue("s_ITEM_CD", key.gets_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("s_ITEM_NAME") && key.gets_ITEM_NAME() != null) {
					msgKey.setKeyValue("s_ITEM_NAME", key.gets_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("s_COMPANY_CD") && key.gets_COMPANY_CD() != null) {
					msgKey.setKeyValue("s_COMPANY_CD", key.gets_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("s_VEND_CD") && key.gets_VEND_CD() != null) {
					msgKey.setKeyValue("s_VEND_CD", key.gets_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("s_VEND_NAME") && key.gets_VEND_NAME() != null) {
					msgKey.setKeyValue("s_VEND_NAME", key.gets_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_STS_TYP") && key.gets_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("s_ODR_STS_TYP", key.gets_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_START_DATE") && key.gets_ODR_START_DATE() != null) {
					msgKey.setKeyValue("s_ODR_START_DATE", key.gets_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_DUE_DATE") && key.gets_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("s_PRD_DUE_DATE", key.gets_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_START_DATE") && key.gets_PRD_START_DATE() != null) {
					msgKey.setKeyValue("s_PRD_START_DATE", key.gets_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_OD_TYP") && key.gets_OD_TYP() != null) {
					msgKey.setKeyValue("s_OD_TYP", key.gets_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_QTY") && key.gets_ODR_QTY() != null) {
					msgKey.setKeyValue("s_ODR_QTY", key.gets_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("s_OUTSIDE_TYP") && key.gets_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("s_OUTSIDE_TYP", key.gets_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_TOTAL_RCV_QTY") && key.gets_TOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("s_TOTAL_RCV_QTY", key.gets_TOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("s_PUCH_ODR_QTY") && key.gets_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("s_PUCH_ODR_QTY", key.gets_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("s_UNIT_COST") && key.gets_UNIT_COST() != null) {
					msgKey.setKeyValue("s_UNIT_COST", key.gets_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("s_UNIT_COST_TYP") && key.gets_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("s_UNIT_COST_TYP", key.gets_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ROUND_TYP") && key.gets_ROUND_TYP() != null) {
					msgKey.setKeyValue("s_ROUND_TYP", key.gets_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_PUCH_ODR_AMOUNT") && key.gets_PUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("s_PUCH_ODR_AMOUNT", key.gets_PUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("k_VEND_CD") && key.getk_VEND_CD() != null) {
					msgKey.setKeyValue("k_VEND_CD", key.getk_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("k_JOB_ODR_CD") && key.getk_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("k_JOB_ODR_CD", key.getk_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("k_ODR_STS_TYP") && key.getk_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("k_ODR_STS_TYP", key.getk_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("k_PLANT_CD") && key.getk_PLANT_CD() != null) {
					msgKey.setKeyValue("k_PLANT_CD", key.getk_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("k_ODR_START_DATE") && key.getk_ODR_START_DATE() != null) {
					msgKey.setKeyValue("k_ODR_START_DATE", key.getk_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("k_PRD_DUE_DATE") && key.getk_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("k_PRD_DUE_DATE", key.getk_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("k_PRD_START_DATE") && key.getk_PRD_START_DATE() != null) {
					msgKey.setKeyValue("k_PRD_START_DATE", key.getk_PRD_START_DATE());
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
					AC0040010Struct key = new AC0040010Struct();
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("SUBMIT_BUTTON_TYPE")) {
						key.setSUBMIT_BUTTON_TYPE(msgKey.getKeyValue("SUBMIT_BUTTON_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("PRINTER_TYPE")) {
						key.setPRINTER_TYPE(msgKey.getKeyValue("PRINTER_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("SELECTED_PRINTER")) {
						key.setSELECTED_PRINTER(msgKey.getKeyValue("SELECTED_PRINTER"));
					}
					if(msgKeyType.containsKeyColumn("r_ODR_START_DATE")) {
						key.setr_ODR_START_DATE(msgKey.getKeyValue("r_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INPUT_DATE")) {
						key.setINPUT_DATE(msgKey.getKeyValue("INPUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("r_PRD_START_DATE")) {
						key.setr_PRD_START_DATE(msgKey.getKeyValue("r_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("r_PRD_DUE_DATE")) {
						key.setr_PRD_DUE_DATE(msgKey.getKeyValue("r_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_CHECK3")) {
						key.setc_CHECK3(msgKey.getKeyValue("c_CHECK3"));
					}
					if(msgKeyType.containsKeyColumn("IN_c_CHECK3")) {
						key.setIN_c_CHECK3(msgKey.getKeyValue("IN_c_CHECK3"));
					}
					if(msgKeyType.containsKeyColumn("IN_RadioButton")) {
						key.setIN_RadioButton(msgKey.getKeyValue("IN_RadioButton"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DEN")) {
						key.setODR_STS_TYP_DEN(msgKey.getKeyValue("ODR_STS_TYP_DEN"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP_DEN")) {
						key.setOD_TYP_DEN(msgKey.getKeyValue("OD_TYP_DEN"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DEN")) {
						key.setOUTSIDE_TYP_DEN(msgKey.getKeyValue("OUTSIDE_TYP_DEN"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP_DEN")) {
						key.setROUND_TYP_DEN(msgKey.getKeyValue("ROUND_TYP_DEN"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_DEN")) {
						key.setUNIT_COST_TYP_DEN(msgKey.getKeyValue("UNIT_COST_TYP_DEN"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("user_PLANT_CD")) {
						key.setuser_PLANT_CD(msgKey.getKeyValue("user_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_OD_NO")) {
						key.sets_OD_NO(msgKey.getKeyValue("s_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("s_PLANT_CD")) {
						key.sets_PLANT_CD(msgKey.getKeyValue("s_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_JOB_ODR_CD")) {
						key.sets_JOB_ODR_CD(msgKey.getKeyValue("s_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_JOB_ODR_DETAIL_NO")) {
						key.sets_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("s_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("s_ITEM_CD")) {
						key.sets_ITEM_CD(msgKey.getKeyValue("s_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_ITEM_NAME")) {
						key.sets_ITEM_NAME(msgKey.getKeyValue("s_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("s_COMPANY_CD")) {
						key.sets_COMPANY_CD(msgKey.getKeyValue("s_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_VEND_CD")) {
						key.sets_VEND_CD(msgKey.getKeyValue("s_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_VEND_NAME")) {
						key.sets_VEND_NAME(msgKey.getKeyValue("s_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_STS_TYP")) {
						key.sets_ODR_STS_TYP(msgKey.getKeyValue("s_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_START_DATE")) {
						key.sets_ODR_START_DATE(msgKey.getKeyValue("s_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_DUE_DATE")) {
						key.sets_PRD_DUE_DATE(msgKey.getKeyValue("s_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_START_DATE")) {
						key.sets_PRD_START_DATE(msgKey.getKeyValue("s_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_OD_TYP")) {
						key.sets_OD_TYP(msgKey.getKeyValue("s_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_QTY")) {
						key.sets_ODR_QTY(msgKey.getKeyValue("s_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("s_OUTSIDE_TYP")) {
						key.sets_OUTSIDE_TYP(msgKey.getKeyValue("s_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_TOTAL_RCV_QTY")) {
						key.sets_TOTAL_RCV_QTY(msgKey.getKeyValue("s_TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("s_PUCH_ODR_QTY")) {
						key.sets_PUCH_ODR_QTY(msgKey.getKeyValue("s_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("s_UNIT_COST")) {
						key.sets_UNIT_COST(msgKey.getKeyValue("s_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("s_UNIT_COST_TYP")) {
						key.sets_UNIT_COST_TYP(msgKey.getKeyValue("s_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ROUND_TYP")) {
						key.sets_ROUND_TYP(msgKey.getKeyValue("s_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_PUCH_ODR_AMOUNT")) {
						key.sets_PUCH_ODR_AMOUNT(msgKey.getKeyValue("s_PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("k_VEND_CD")) {
						key.setk_VEND_CD(msgKey.getKeyValue("k_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("k_JOB_ODR_CD")) {
						key.setk_JOB_ODR_CD(msgKey.getKeyValue("k_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("k_ODR_STS_TYP")) {
						key.setk_ODR_STS_TYP(msgKey.getKeyValue("k_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("k_PLANT_CD")) {
						key.setk_PLANT_CD(msgKey.getKeyValue("k_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("k_ODR_START_DATE")) {
						key.setk_ODR_START_DATE(msgKey.getKeyValue("k_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("k_PRD_DUE_DATE")) {
						key.setk_PRD_DUE_DATE(msgKey.getKeyValue("k_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("k_PRD_START_DATE")) {
						key.setk_PRD_START_DATE(msgKey.getKeyValue("k_PRD_START_DATE"));
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
