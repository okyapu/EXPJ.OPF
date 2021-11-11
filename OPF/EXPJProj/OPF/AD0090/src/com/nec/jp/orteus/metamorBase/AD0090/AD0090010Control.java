/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0090/src/com/nec/jp/orteus/metamorBase/AD0090/AD0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0090;

import com.nec.jp.orteus.metamorBase.AD0090.*;
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
import java.io.IOException;
import java.math.BigDecimal;
import com.nec.jp.orteus.xaf.wa.sqlparser.ParseException;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc.AutoIssueParam;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.flash.Kind;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.CommonOd;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0090010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.16 $ $Date: 2015/12/22 09:53:54 $
 *
 */
//}}user_implement_code_header

public class AD0090010Control
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
	public AD0090010Struct getListvalue(int x) { return (AD0090010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0090010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AD0090010Struct createStruct() { return new AD0090010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0090010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	
	/** ���Ԏ}�� ZERO */
    final static int _JOB_ODR_DETAIL_NO = 0;
    
    /** �s�ǃ��X�g�̒ǉ��\������ */
	static public int DISPLAY_NUMBER = 15;
	
	//�q�i�ڂ̍X�V�̐���
	private int errCount = 0;
	private int norCount = 0;
	/*��ЃR�[�h*/
	public String _company_cd = null;

	// log�p
	private String logInfomation = null;
	
	//msgStruct�ۑ��p
	public MessageStruct saveStruct = null;
    
	// Add Start 20140219 huang-lh
		/** �H���ۊǏꏊ�̍݌ɂ��Ǘ����� 0:�H���ۊǏꏊ�̍݌ɂ��s�Ȃ�Ȃ� 1:�H���ۊǏꏊ�̍݌ɂ��Ȃ�*/
		private String _processManageFlg = "0";
		/** �s�Ǎ݌ɂ��H���Ǘ����� 0:�s�Ǎ݌ɂ̍H���Ǘ�������s�Ȃ�Ȃ� 1:�s�Ǎ݌ɂ̍H���Ǘ�������Ȃ�*/
		private String _defectManageFlg = "0";
		private String lestQty[] = null;
		private String useQty[] = null;
		/**
	     * �Ώۂ̕�����Null�i�󕶎����邢��Null�j�ł��邩�𔻒肵�܂��B
	     * @param str �Ώە�����
	     * @return Null�̏ꍇ��true�ANull�ł͂Ȃ��ꍇ��false
	     */
	    private boolean isNull(String str) {
	     if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
	      return true;
	     }
	     return false;
		    }
	    
	    /**
	     * ���H���̑O�H�������H�����擾����
	     * @throws SQLException 
	     * @throws FoundationException 
	     */
	    private void SelectPrevOrNextWork() throws FoundationException, SQLException {
	    	List tempList = new ArrayList();
	    	AD0090010Struct paramStruct  = new AD0090010Struct();
	    	AD0090010Struct tempStruct  = new AD0090010Struct();
	    	paramStruct.setWORK_ODR_CD(selectStruct.getWORK_ODR_CD());
	    	paramStruct.setPROC_NO(selectStruct.getPROC_NO());
	    	
	    	// ��ƌn��ʎd�|����A�ŏ��H�������擾����
	    	tempList = entity.mCheckFirstWork.read(conn, paramStruct);
	    	 
	    	if (null != tempList && tempList.size() > 0) {
	    		tempStruct = (AD0090010Struct) tempList.get(0);
	    		if (selectStruct.getIN_OPR_INST_CD().equals(tempStruct.getFIRST_OPR_INST_CD())) {
	    			// �ŏ��H���ꍇ
	    			selectStruct.setFIRST_WORK_FLG("1");
	     			
	     			// ���H�������擾����
	    			tempList = entity.mSelectNextWorkInfo.read(conn, paramStruct);
	    			if (null != tempList && tempList.size() > 0) {
	    				tempStruct = (AD0090010Struct) tempList.get(0);
	        			selectStruct.setNEXT_WH_CD(tempStruct.getNEXT_WH_CD());
	        			selectStruct.setNEXT_WORK_ODR_CD(tempStruct.getNEXT_WORK_ODR_CD());
	        			selectStruct.setNEXT_OPR_INST_CD(tempStruct.getNEXT_OPR_INST_CD());
	        			selectStruct.setNEXT_PROC_NO(tempStruct.getNEXT_PROC_NO());
	        			selectStruct.setNEXT_WS_CD(tempStruct.getNEXT_WS_CD());
	        			selectStruct.setNEXT_WS_NAME(tempStruct.getNEXT_WS_NAME());
	        			selectStruct.setNEXT_WH_NAME(tempStruct.getNEXT_WH_NAME());
	    			}
	    		}else if (!"1".equals(selectStruct.geth_FINAL_PROC_FLG())){
		 			// �ŏ��H���łȂ����ŏ��H���łȂ��ꍇ
	    			selectStruct.setFIRST_WORK_FLG("0");
	 			
	    			// �O�H�������擾����
	    			tempList = entity.mSelectPrevWorkInfo.read(conn, paramStruct);
	    			if (null != tempList && tempList.size() > 0) {
	    				tempStruct = (AD0090010Struct) tempList.get(0);
	        			selectStruct.setPREV_WORK_ODR_CD(tempStruct.getPREV_WORK_ODR_CD());
	        			selectStruct.setPREV_OPR_INST_CD(tempStruct.getPREV_OPR_INST_CD());
	        			selectStruct.setPREV_PARTIAL_PRD_NO(tempStruct.getPREV_PARTIAL_PRD_NO());
	        			selectStruct.setPREV_PROC_NO(tempStruct.getPREV_PROC_NO());
	        			selectStruct.setPREV_WH_CD(tempStruct.getPREV_WH_CD());
	    			}
	    			// ���H�������擾����
	    			tempList = entity.mSelectNextWorkInfo.read(conn, paramStruct);
	    			if (null != tempList && tempList.size() > 0) {
	    				tempStruct = (AD0090010Struct) tempList.get(0);
	        			selectStruct.setNEXT_WH_CD(tempStruct.getNEXT_WH_CD());
	        			selectStruct.setNEXT_WORK_ODR_CD(tempStruct.getNEXT_WORK_ODR_CD());
	        			selectStruct.setNEXT_OPR_INST_CD(tempStruct.getNEXT_OPR_INST_CD());
	        			selectStruct.setNEXT_PROC_NO(tempStruct.getNEXT_PROC_NO());
	        			selectStruct.setNEXT_WS_CD(tempStruct.getNEXT_WS_CD());
	        			selectStruct.setNEXT_WS_NAME(tempStruct.getNEXT_WS_NAME());
	        			selectStruct.setNEXT_WH_NAME(tempStruct.getNEXT_WH_NAME());
	    			}
	    		} else {
	    			// �Ō�H���ꍇ
	    			selectStruct.setFIRST_WORK_FLG("0");
	 			
	    			// �O�H�������擾����
	    			tempList = entity.mSelectPrevWorkInfo.read(conn, paramStruct);
	    			if (null != tempList && tempList.size() > 0) {
	    				tempStruct = (AD0090010Struct) tempList.get(0);
	        			selectStruct.setPREV_WORK_ODR_CD(tempStruct.getPREV_WORK_ODR_CD());
	        			selectStruct.setPREV_OPR_INST_CD(tempStruct.getPREV_OPR_INST_CD());
	        			selectStruct.setPREV_PARTIAL_PRD_NO(tempStruct.getPREV_PARTIAL_PRD_NO());
	        			selectStruct.setPREV_PROC_NO(tempStruct.getPREV_PROC_NO());
	        			selectStruct.setPREV_WH_CD(tempStruct.getPREV_WH_CD());
	    			}
	    		}
	    	}
	    }
	    
	    /**
	     * �i�ڂ̍H���݌ɂ̊Ǘ�����
	     * @param	AD0090010Struct	 ��Ǝ���struct
	     * @param	AD0090010Struct	 ��Ǝd�|struct
	     * @return  int             ���s����
		 * @throws SQLException 
	     * @throws FoundationException 
	     * */
	    private int ItemWorkManager(int updFlg) throws SQLException, FoundationException {
	    	AD0090010Struct issueStruct = null;
	    	List issueList = new ArrayList();
	    	List tempList = new ArrayList();
	    	AD0090010Struct tempStruct = new AD0090010Struct();
	    	
	    		//�@�ŏI�H���̈ȊO���ǂ������f����
	    		if (!"1".equals(selectStruct.geth_FINAL_PROC_FLG())) {
	    			//�@�ŏI�H���̈ȊO�̏ꍇ
	    			// --------------[�o�Ɏw��]�̃f�[�^���擾����----------
	    			issueList = entity.mSelectIssue.read(conn,this.selectStruct);
	    			
	    			// �o�Ɏw���f�[�^���J��Ԃ��B
	    			for(int j = 0; j < issueList.size(); j++) {
	    				issueStruct = (AD0090010Struct)issueList.get(j);
	        			
	    				// �擾���ꂽ���ځu�g�p���ۊǋ�v���Đݒ肷��
	        			tempList = entity.mCheckFirstWork.read(conn, this.selectStruct);
	    				if (null != tempList && tempList.size() > 0) {
	    					tempStruct = (AD0090010Struct)tempList.get(0);
	    				}
			    		// �ŏ��H�����ǂ������f����
			    		if (!tempStruct.getFIRST_OPR_INST_CD().equals(this.selectStruct.getIN_OPR_INST_CD())) {
			    			// �ŏ��H���łȂ��ꍇ
			    			issueStruct.setFIRST_WORK_FLG("0");
			    			
			    			// �O�H�������擾����
			    			tempList = entity.mSelectPrevWorkInfo.read(conn, this.selectStruct);
			    			if (null != tempList && tempList.size() > 0) {
		    					tempStruct = (AD0090010Struct)tempList.get(0);
		    				}
			    			// �O�H��������̏ꍇ�F�O�H���̍�Ǝ��тœo�^�����ۊǋ�R�[�h
			    			issueStruct.setWH_CD(tempStruct.getPREV_WH_CD());
			    		}
			    		
			    		// �ۊǋ�R�[�h��NULL�`�F�b�N
						if (isNull(issueStruct.getWH_CD())) {
							// �q�i�ڂ̎g�p���ۊǋ�R�[�h�������͂ł��B
							setErrorMessage("AD00215");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
							updFlg = 9;
							break;
							
						}
						
						// �ۊǋ�R�[�h�`�F�b�N
						tempList = entity.mSelectChkWhCd.read(conn,issueStruct);
						if(tempList.isEmpty()){
							setErrorMessage("AD00216");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
							updFlg = 9;
							break;
						}
						
						// �ۊǋ�R�[�h�̍H��R�[�h�ƍ�ƌn��ʎd�|�̍H��R�[�h�̓���`�F�b�N
						AD0090010Struct whStruct = (AD0090010Struct)tempList.get(0);
						if (whStruct.getPLANT_CD() == null || !whStruct.getPLANT_CD().equals(getsysPLANT_CD())) {
							setErrorMessage("AD00217");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
							updFlg = 9;
							break;
						}
						
						String denominator = null;  // ����
						String numerator = null;  //  ���q
						String useSum = null;  // �X�V�g�p����
						String acptQty = null; // �X�V�g�p����(�Ǖi)
						String defectQty = null; // �X�V�g�p����(�s�Ǖi)
						
						// �X�V�g�p���ʂ̌v�Z
						denominator = issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(); // ����
						numerator = issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR(); // ���q
						useSum = Calculate.add(struct.getACPT_QTY(), struct.getDEFECT_QTY());	
						
						if("1".equals(issueStruct.getUNIT_QTY_TYP())) { //�@�����Ǘ�
							// �X�V�g�p����
							useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, Calculate.CEIL);
							useSum = Calculate.ceil(useSum, 0);
							
							// �X�V�g�p���ʁi�Ǖi���j
							acptQty = Calculate.divide(
									Calculate.multiply(struct.getACPT_QTY(), 
											issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
											issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
									Calculate.CEIL);
							acptQty = Calculate.ceil(acptQty, 0);
							
							// �X�V�g�p���ʁi�s�ǐ��j
							defectQty = Calculate.divide(
									Calculate.multiply(struct.getDEFECT_QTY(), 
											issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
											issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
									Calculate.CEIL);
							defectQty = Calculate.ceil(defectQty, 0);
						} else {
							// �X�V�g�p����
							useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, 4, Calculate.CEIL);
							
							// �X�V�g�p���ʁi�Ǖi���j
							acptQty = Calculate.divide(
									Calculate.multiply(struct.getACPT_QTY(), 
											issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
											issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
											4,
											Calculate.CEIL);
							
							// �X�V�g�p���ʁi�s�ǐ��j
							defectQty = Calculate.divide(
									Calculate.multiply(struct.getDEFECT_QTY(), 
											issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
											issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
											4,
											Calculate.CEIL);
						}
						// �ޔ�p�莝���݌ɐ���������
						issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
						issueStruct.setTEMP_USE_QTY(useSum);
						issueStruct.setUSE_ACPT_QTY(acptQty);
						issueStruct.setUSE_DEFECT_QTY(defectQty);
						// �H��
						issueStruct.setPLANT_CD(sysPLANT_CD);
						issueStruct.setUSER_CD(sysUSER_CD);
						issueStruct.setUPDATED_PRG_NM(this.sp.getProcId());
						
						//�X�V�g�p���ʂ��h0�h�ꍇ�A���̏o�Ɏw���f�[�^�ɐi�ށB
						if ("0".equals(useSum)) {
							continue;
						}
						// ----------------------�H���݌ɏo�ɏ���------------------
						if(issueStruct.getJOB_ODR_CD() == null 
								|| issueStruct.getJOB_ODR_CD().length() == 0){
							//�ۊǋ�ʕi�ڍ݌ɍX�V
							tempList = entity.mSelectItemStock.read(conn,issueStruct);
							AD0090010Struct stockStruct = new AD0090010Struct();
							stockStruct.setStructM(issueStruct);
							setStandardItem(stockStruct);

							if (tempList.isEmpty()) {
								//�o�^
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
								entity.mInsertItemStock.create(conn, stockStruct);
							} else {
								//�X�V
								tempStruct = (AD0090010Struct)tempList.get(0);
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), 
										issueStruct.getTEMP_USE_QTY()));
								entity.mUpdateItemStock.update(conn, stockStruct);
							}
						} else {
							//���Ԏd�|�݌ɍX�V
							tempList = entity.mSelectOdrStock.read(conn,issueStruct);
							AD0090010Struct stockStruct = new AD0090010Struct();	
							stockStruct.setStructM(issueStruct);
							setStandardItem(stockStruct);
			
							if (tempList.isEmpty()) {
								//�o�^
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
								entity.mInsertOdrStock.create(conn,stockStruct);
							} else {
								//�X�V
								tempStruct = (AD0090010Struct)tempList.get(0);
								stockStruct.setJOB_ODR_DETAIL_NO(tempStruct.getJOB_ODR_DETAIL_NO());
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), 
										issueStruct.getTEMP_USE_QTY()));
								entity.mUpdateOdrStock.update(conn,stockStruct);
							}
						}
						
						boolean bResult;
						// ���b�g�Ǘ��t���O = 1(���b�g�Ǘ����s��)�̏ꍇ
						if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
							// �g�p���̌v�Z�������Ăяo���B
							updFlg = CalcUseQty("2",issueStruct);
							if (updFlg != 0) {
								break;
							}
						} else {
							//---------------[�ۊǋ�ʓ��o��]�̒ǉ�(�o��)------------------
							updFlg = InsertRecvIssue("2",issueStruct);
							if (updFlg != 0) {
								break;
							}
						}
						
						issueStruct.setWH_CD(this.struct.getWH_CD());
						issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
						// ----------------------�H���݌ɓ��ɏ���------------------
						if(issueStruct.getJOB_ODR_CD() == null 
								|| issueStruct.getJOB_ODR_CD().length() == 0){
							//�ۊǋ�ʕi�ڍ݌ɍX�V
							tempList = entity.mSelectItemStock.read(conn,issueStruct);
							AD0090010Struct stockStruct = new AD0090010Struct();
							stockStruct.setStructM(issueStruct);
							setStandardItem(stockStruct);

							if (tempList.isEmpty()) {
								//�o�^
								stockStruct.setSTOCK_ON_HAND_QTY(acptQty);
								entity.mInsertItemStock.create(conn, stockStruct);
							} else {
								//�X�V
								tempStruct = (AD0090010Struct)tempList.get(0);
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.add(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), 
										acptQty));
								entity.mUpdateItemStock.update(conn, stockStruct);
							}
						} else {
							//���Ԏd�|�݌ɍX�V
							tempList = entity.mSelectOdrStock.read(conn,issueStruct);
							AD0090010Struct stockStruct = new AD0090010Struct();	
							stockStruct.setStructM(issueStruct);
							setStandardItem(stockStruct);
			
							if (tempList.isEmpty()) {
								//�o�^
								stockStruct.setSTOCK_ON_HAND_QTY(acptQty);
								entity.mInsertOdrStock.create(conn,stockStruct);
							} else {
								//�X�V
								tempStruct = (AD0090010Struct)tempList.get(0);
								stockStruct.setJOB_ODR_DETAIL_NO(tempStruct.getJOB_ODR_DETAIL_NO());
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.add(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), 
										acptQty));
								entity.mUpdateOdrStock.update(conn,stockStruct);
							}
						}
						
						// ���b�g�Ǘ��t���O = 1(���b�g�Ǘ����s��)�̏ꍇ
						if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
							// �g�p���̌v�Z�������Ăяo���B
							updFlg = CalcUseQty("1",issueStruct);
							if (updFlg != 0) {
								break;
							}
						} else {
							//---------------[�ۊǋ�ʓ��o��]�̒ǉ�(�o��)------------------
							updFlg = InsertRecvIssue("1",issueStruct);
							if (updFlg != 0) {
								break;
							}
						}
						
						// �V�X�e���p�����[�^�F�h�s�Ǎ݌ɂ��H���Ǘ�����h���h�n�m�h�ꍇ
						if ("1".equals(_defectManageFlg) && !"0".equals(defectQty)) {
							// ���b�g�Ǘ��t���O = 1(���b�g�Ǘ����s��)�̏ꍇ
							if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
								// �g�p���̌v�Z�������Ăяo���B
								updFlg = CalcUseQty("3",issueStruct);
								if (updFlg != 0) {
									break;
								}
							} else {
								//---------------[�ۊǋ�ʓ��o��]�̒ǉ�(�o��)------------------
								updFlg = InsertRecvIssue("3",issueStruct);
								if (updFlg != 0) {
									break;
								}
								// �s�Ǖi�o�ɏ����Ăяo��
								IssueProcess IProc = new IssueProcess(conn, this.issueStruct.getRCV_ISSUE_CTRL_CD());
								bResult = IProc.execDefectProcess();
								if (!bResult) {
									//�o�ɏ������s �T�[�o�[�G���[
									updFlg = 9;
									break;
								}
							}
						}
	    			}
	    		} 
	    		return updFlg;
	    }
	    /**
	     * �g�p���̌v�Z��������
	     * @param	int         	 �o�^�t���O
	     * @param	AD0090010Struct �o�Ɏw���f�[�^
	     * @return  int             ���s����
		 * @throws SQLException 
	     * @throws FoundationException 
	     * @throws BatchAppException 
	     * */
	    private int CalcUseQty(String insertType,AD0090010Struct issueStruct) throws FoundationException, SQLException{
	    	List tempList = new ArrayList();
	    	AD0090010Struct tempStruct = new AD0090010Struct();
	    	int updFlg = 0;
	    	
	    	// �o�Ɏ��і��׎擾
			List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,issueStruct);

			if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
				 lestQty = new String[lotIssueList.size()];
				 useQty = new String[lotIssueList.size()];
			}
			
			// �f�[�^���Ȃ��ꍇ
			if (lotIssueList == null || lotIssueList.size() == 0) {
				errCount = errCount + 1;
				setErrorMessage("AD20135");
				setSupportMessage("T_ISSUE_INST.ITEM_CD",issueStruct.getITEM_CD());
				setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
						issueStruct.geth_ISSUE_INST_CD());// �o�Ɏw���ԍ�
				setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",issueStruct.getITEM_CD());// �i�ڔԍ�
				setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",issueStruct.getWORK_ODR_CD());	// ��ƌv��ԍ�
				updFlg = 9;
				return updFlg;
			}

			// �g�p�c���ݒ�
			BigDecimal remainQty = null;
			if ("2".equals(insertType)) {		// �o�ɂ̏ꍇ
				remainQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			} else if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
				remainQty = new BigDecimal(issueStruct.getUSE_ACPT_QTY());
			} else if ("3".equals(insertType)) {			// �s�Ǔ��ɂ̏ꍇ
				remainQty = new BigDecimal(issueStruct.getUSE_DEFECT_QTY());
			}

			for (int j = 0; j < lotIssueList.size(); j++) {
				
				
				AD0090010Struct lotIssueStruct = (AD0090010Struct) lotIssueList.get(j);

				// �������ĉ\���ݒ�
				BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
				BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
				BigDecimal availQty = null;
				if ("3".equals(insertType)){
					availQty = new BigDecimal(lestQty[j]);
				} else {
					availQty = issueQty.subtract(spentQty);
				}
				
				
				if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
					lestQty[j] = availQty.toString();
					useQty[j] = "0";
				}

				//�g�p�c����0�ȉ��̏ꍇ���[�v�I��
				if (remainQty.doubleValue() <= 0) {
					continue;
				}
				
				if ("3".equals(insertType) && Calculate.compare(lestQty[j], "0") <= 0){
					continue;
				}

				BigDecimal useLotQty = null;
				

				
				// �������ĉ\�� >= �g�p�c���̏ꍇ
				if (availQty.doubleValue() >= remainQty.doubleValue()) {
					// �g�p�c�����������Đ��ɐݒ�
					useLotQty = remainQty;
					// �������ĉ\�� < �g�p�c���̏ꍇ
				} else {
					// �ŏI�f�[�^�̏ꍇ
					if (j == lotIssueList.size() - 1) {
						// �g�p�c�����g�p���ɐݒ�
						useLotQty = remainQty;
						// �ŏI�f�[�^�łȂ��ꍇ
					} else {
						// �����\����0���傫���ꍇ
						if (availQty.doubleValue() > 0) {
							// �g�p�c�����g�p���ɐݒ�
							useLotQty = remainQty;

							// �����R�[�h�ȍ~���擾
							for (int k = j + 1; k < lotIssueList.size(); k++) {
								AD0090010Struct nextLotIssueStruct = (AD0090010Struct) lotIssueList.get(k);

								// �������ĉ\���ݒ�
								BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
								BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
								BigDecimal nextAvailQty = null;

								if ("3".equals(insertType)){
									nextAvailQty = new BigDecimal(lestQty[k]);
								} else {
									nextAvailQty = nextIssueQty.subtract(nextSpentQty);
								}
								
								// �����R�[�h�ȍ~�Ɉ����\�ȃf�[�^������ꍇ
								if (nextAvailQty.doubleValue() > 0) {
									// �������ĉ\�����g�p���ɐݒ�
									useLotQty = availQty;
									break;
								}
							}
							// �����\����0�ȉ��̏ꍇ
						} else {
							// ���̃f�[�^���擾
							continue;
						}
					}
				}

				// �g�p���������\�����傫���ꍇ
				if (useLotQty.doubleValue() > availQty.doubleValue()) {
					// ���b�Z�[�W�o��
					setWarningMessage("AD20136");
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD",issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
							issueStruct.geth_ISSUE_INST_CD());// �o�Ɏw���ԍ�
					setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",issueStruct.getITEM_CD());
					// �i�ڔԍ�
					setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",issueStruct.getWORK_ODR_CD());
					// ��ƌv��ԍ�
				}

				issueStruct.setUSE_LOT_NO(lotIssueStruct.getLOT_NO());
				issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
				issueStruct.setRCV_ISSUE_QTY(useLotQty.toString());
				
				if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
					lestQty[j] = Calculate.add(issueQty.toString(), useLotQty.negate().toString());
					useQty[j] = Calculate.add(spentQty.toString(), useLotQty.toString());
				}
				
				// ���b�g�ʕi�ڍ݌Ɍ���
				tempList = entity.mT_LOT_STOCK.read(conn,issueStruct);

				// �X�V�O�̍݌ɐ��ݒ�
				if (tempList.isEmpty()) {
					issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
				} else {
					tempStruct = (AD0090010Struct) tempList.get(0);
					issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
				}

				//[�ۊǋ�ʓ��o��]�̒ǉ�
				if ("2".equals(insertType)) {		// �o�ɂ̏ꍇ
					updFlg = InsertRecvIssue("2",issueStruct);
				} else if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
					updFlg = InsertRecvIssue("1",issueStruct);
				} else if ("3".equals(insertType)) {			// �s�Ǔ��ɂ̏ꍇ
					updFlg = InsertRecvIssue("3",issueStruct);
					// �s�Ǖi�o�ɏ����Ăяo��
					IssueProcess IProc = new IssueProcess(conn, this.issueStruct.getRCV_ISSUE_CTRL_CD());
					boolean bResult = IProc.execDefectProcess();
					if (!bResult) {
						//�o�ɏ������s �T�[�o�[�G���[
						updFlg = 9;
						break;
					}
				}
				if (updFlg != 0) {
					break;
				}

				// ���b�g�ʕi�ڍ݌ɍX�V
				BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
				List updateLotStockList = null;
				if ("2".equals(insertType) || "1".equals(insertType)) {		// �o�Ɉ�����ɂ̏ꍇ
					 updateLotStockList = bc.excUpdateLotStockFd(this.issueStruct.getRCV_ISSUE_CTRL_CD(), "");
					// �ُ�I���̏ꍇ
					if (bc.getResultStatus().intValue() == 3) {
						// �G���[���b�Z�[�W�擾
						if (updateLotStockList != null&& updateLotStockList.size() > 0) {
							setErrorMessage((String) updateLotStockList.get(0));
						}
						updFlg = 9;
						break;
					}
				}

				//�g�p�c�����Z
				remainQty = remainQty.subtract(new BigDecimal(useLotQty.toString()));

			}
			//���b�g�Ǘ��t���O = 1(���b�g�Ǘ����s��)�łȂ��ꍇ
	    	return updFlg;
	    }
	    /**
	     * �ۊǋ�ʓ��o�ɂ̓o�^����
	     * @param	int         	 �o�^�t���O
	     * @param	AD0090010Struct �o�Ɏw���f�[�^
	     * @return  int             ���s����
		 * @throws SQLException 
	     * @throws FoundationException 
	     * @throws BatchAppException 
	     * */
	    private int InsertRecvIssue(String insertType,AD0090010Struct issueStruct) throws FoundationException, SQLException {
	    	int updFlg = 0;
	    	Numbering collectNum = new Numbering(conn,
					CollectNumber.ISSUE_CD,
					sysUSER_CD,
					this.sp.getProcId(),
					sysPLANT_CD);
	    	String no = null;
	    	
	    	AD0090010Struct tempIssueStruct = new AD0090010Struct();
			// ���o�ɊǗ��ԍ��̔�
			 no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//�̔Ԍ��ʂ��Ȃ�
				setErrorMessage("ZZ01106");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
				updFlg = 9;
				return updFlg;
			}
			// ���o�ɊǗ��ԍ�
			tempIssueStruct.setRCV_ISSUE_CTRL_CD(no);
			this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
			//�i�ڔԍ�
			tempIssueStruct.setITEM_CD(issueStruct.getITEM_CD());
			//����
			tempIssueStruct.setJOB_ODR_CD(issueStruct.getJOB_ODR_CD());
			//���Ԏ}��
			tempIssueStruct.setJOB_ODR_DETAIL_NO("0");
			//�����
			tempIssueStruct.setACPT_NO("0");
			//��ƌv��ԍ�
			tempIssueStruct.setWORK_ODR_CD(selectStruct.getWORK_ODR_CD());
			//�d�|��ƃR�[�h
			tempIssueStruct.setWORK_IN_PROC_CD(selectStruct.getWORK_IN_PROC_CD());
			//�����
			tempIssueStruct.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			//��Ǝ��ђ�����
			tempIssueStruct.setOPR_RSLT_CRCT_NO("0");
			//���o�ɔN����
			tempIssueStruct.setRCV_ISSUE_DATE(struct.getOPR_DATE());
			//���o�ɒ[��
			tempIssueStruct.setRCV_ISSUE_ODD_QTY("0");
			//�݌ɍX�V�敪
			tempIssueStruct.setSTOCK_UPD_TYP("2");
			//�I�[�_�f�}���h�ԍ�
			tempIssueStruct.setOD_NO(selectStruct.getOD_NO());
			//�H��R�[�h
			tempIssueStruct.setPLANT_CD(selectStruct.getPLANT_CD());
			
			tempIssueStruct.setUSER_CD(sysUSER_CD);
			tempIssueStruct.setUPDATED_PRG_NM(this.sp.getProcId());
			
			// ���b�g�Ǘ����s���̏ꍇ
			if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
				//�݌Ƀ��b�g�ԍ�
				tempIssueStruct.setLOT_NO(issueStruct.getUSE_LOT_NO());
			} else {
				//�݌Ƀ��b�g�ԍ�
				tempIssueStruct.setLOT_NO("");
			}
			
			if ("2".equals(insertType)) {					// �o�ɂ̏ꍇ
				//���o�ɋ敪
				tempIssueStruct.setRCV_ISSUE_TYP("2");
				//�ۊǋ�R�[�h
				tempIssueStruct.setWH_CD(issueStruct.getWH_CD());
				//�o�Ɏw���ԍ�
				tempIssueStruct.seth_ISSUE_INST_CD(issueStruct.geth_ISSUE_INST_CD());
				//���o�ɑO�݌ɐ�
				tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
				// ���b�g�Ǘ����s���̏ꍇ
				if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
					//���o�ɐ�
					tempIssueStruct.setRCV_ISSUE_QTY(Calculate.multiply(issueStruct.getRCV_ISSUE_QTY(), "-1"));
				} else {
					//���o�ɐ�
					tempIssueStruct.setRCV_ISSUE_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
				}
				
				//���o�ɔ����敪
				tempIssueStruct.setRCV_ISSUE_GNR_TYP("41");
				//���o�Ɋ����t���O
				tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
	    	} else if ("1".equals(insertType)) {			// ���ɂ̏ꍇ
	    		//���o�ɋ敪
				tempIssueStruct.setRCV_ISSUE_TYP("1");
				//�ۊǋ�R�[�h
				tempIssueStruct.setWH_CD(struct.getWH_CD());
				//�o�Ɏw���ԍ�
				tempIssueStruct.setISSUE_INST_CD(null);
				//���o�ɑO�݌ɐ�
				tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
				//���o�ɐ�
				// ���b�g�Ǘ����s���̏ꍇ
				if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
					//���o�ɐ�
					tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getRCV_ISSUE_QTY());
				} else {
					//���o�ɐ�
					tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getUSE_ACPT_QTY());
				}
				
				//���o�ɔ����敪
				tempIssueStruct.setRCV_ISSUE_GNR_TYP("61");
				//���o�Ɋ����t���O
				if (this.struct.getchk_COMPLETE() != null 
						&& "true".equals(this.struct.getchk_COMPLETE())) {
					tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
				} else {
					tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				}
	    	} else if ("3".equals(insertType)) {			// �s�Ǔ��ɂ̏ꍇ
	    		//���o�ɋ敪
				tempIssueStruct.setRCV_ISSUE_TYP("3");
				//�ۊǋ�R�[�h
				tempIssueStruct.setWH_CD(struct.getWH_CD());
				//�o�Ɏw���ԍ�
				tempIssueStruct.setISSUE_INST_CD(null);
				//���o�ɑO�݌ɐ�
				tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
				//���o�ɐ�
				// ���b�g�Ǘ����s���̏ꍇ
				if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
					//���o�ɐ�
					tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getRCV_ISSUE_QTY());
				} else {
					//���o�ɐ�
					tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getUSE_DEFECT_QTY());
				}
				
				//���o�ɔ����敪
				tempIssueStruct.setRCV_ISSUE_GNR_TYP("61");
				//���o�Ɋ����t���O
				if (this.struct.getchk_COMPLETE() != null 
						&& "true".equals(this.struct.getchk_COMPLETE())) {
					tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
				} else {
					tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				}
	    	}

			//�ۊǋ�ʓ��o�ɓo�^
			setStandardItem(tempIssueStruct);
			tempIssueStruct.setCOMPANY_CD(_company_cd);
			entity.mInsertRecvIssue.create(conn, tempIssueStruct);
	    	return updFlg;
	    }
		// Add End 20140219 huang-lh
	
	/** ���[�t�@�C�� **/
	private String _downloadFile = null;
	private String _printFlg = "0";
	private String _outputFlg = "1";
	private String _initOutputFlg = "1";
	private String _initProduct_Typ = "";

	/** ����t���O�擾 **/
	public String getPrintFlg() { return _printFlg; };
	/** ����L���t���O�擾 **/
	public String getOutputFlg() { return _outputFlg; };

	/** �Ɩ����t */
	private String _oprDate = null;

	/** �Ɩ����t */
	private String _oprTime = null;
	/** ���ԊǗ��t���O */
	private String tempTimeCtrl = null;
	
	/** ��Ǝw���ԍ� */
	private String _keepOprInstCd = null;
	/** ����� */
	private String _keepPartialPrdNo = null;
	/** �Ǖi�����v*/
	private String SumAcptQty = null;
	/** �s�ǐ��̍��v*/
	private String SumDefectQty = null; 
	/** ��Ɠ�*/
	private String OprDate = null;
	/** ���b�g�Ǘ������σ`�F�b�N **/
	private boolean lotCtrlFlg = false;
		
	/** �ŏI�H�����ǂ������f���邽�߂̃t���O */
	private boolean _lastProc = true;
	/** �ŏI�H�����擾**/
	public boolean getLastProc(){
		return _lastProc;
	}
	
	/** ���эX�V�����^�C�v 0:�o�^ 1:�X�V */
	public int _rsltExeType = 0;
	/** �ۊǋ�ʓ��o�ɍX�V�����^�C�v 0:�o�^ 1:�X�V */
	public int _issueExeType = 0;
	/** ��Ǝ��ь����㌏�� 0:�Ȃ� 1:���� */
	public int _rsltListflg = 0;
	
	/** [�R���{�{�b�N�X�f�[�^]���i��Ǝ��ԒP�ʋ敪�j */
	private ComboStruct _oprTimeUnitTtpStruct = new ComboStruct();
	
	/** [�R���{�{�b�N�X�f�[�^]���i�s�Ǘ��R�j */
	private ComboStruct DEFECT_CAUSE_CD = new ComboStruct();
	
	/** �V�X�e�����O���b�Z�[�W�쐬�p */
	private StringBuffer _sysLogMessage;

	/** ���шꗗ */
	private List rsltList = new ArrayList();
	/** �o�Ɉꗗ */
	private List issueList = new ArrayList();
	/** �s�Ǘ��R�R�[�h*/
	private List defectViewList = new ArrayList(0);
	/** Main Struct */
	private AD0090010Struct selectStruct = new AD0090010Struct();
	/** ��ƕs�ǍX�V�Ώ�Struct */
	private AD0090010Struct defectStruct = new AD0090010Struct();
	/** �ۊǋ�ʓ��o�ɍX�V�Ώ�Struct */
	private AD0090010Struct issueStruct = new AD0090010Struct();
	/** ��Ɛ��W�vStruct */
	private AD0090010Struct QtyStruct = new AD0090010Struct();
	
	//PDF�p�A�N�Z�T���\�b�h
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
		
	/**
	 * Main SelectStruct�̎擾
	 * @return Main SelectStruct
	 */
	public AD0090010Struct getSelectStruct() {
		return this.selectStruct;
	}
	
	/**
	 * Orteus�W��Struct�̒l��Ώ�Struct�ɃR�s�[���܂��B
	 * @param target �R�s�[�ΏۂƂȂ�Struct
	 */
	public void setStandardItem(AD0090010Struct target){

		target.setsUser_ID(struct.getsUser_ID());
		target.setsSysdate(struct.getsSysdate());
		target.setsOraganization_CD(struct.getsOrganization_CD());
		target.setTIME_CTRL(struct.getTIME_CTRL());
	}

	/**
	 * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setInformationMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}
	
	private void setInformationMessage(String code,String value1,String value2){
		ExpjMessage emsg = new ExpjMessage(code,value1,value2);
		msgStruct.addInfo(emsg);
	}
	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 * @param value2 �u��������Q
	 */
	private void setWarningMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 * @param value1 �u��������P
	 */
	private void setErrorMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setSupportMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg = new ExpjMessage("ZZ01006", _sysLogMessage.toString());
		msgStruct.addError(emsg);
	}
	/**
	 * �Ɩ����W�b�N�̃V�X�e�����O(�v���I�G���[)�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setSeverSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.severe(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃V�X�e�����O(�G���[)�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setWarningSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.warning(emsg, getsysUSER_CD());
	}
	/**
	 * �Ɩ����W�b�N�̃V�X�e�����O�i���[�j���O�j�ݒ菈����؂�o���Ċ֐���
	 * @param db1 �f�[�^�x�[�X���ڂP
	 * @param value1 �u��������P
	 */
	private void setInfoSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.info(emsg, getsysUSER_CD());
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
	/**msgStruct�ޔ�p*/
	private void getsaveStruct() {
		saveStruct = new MessageStruct(getsysUSER_CD(), false);
		for (int i = 0; i < msgStruct.sizeError(); i++) {
			saveStruct.getError().add(msgStruct.getError().get(i));
		}
		for (int i = 0; i < msgStruct.sizeWarn(); i++) {
			saveStruct.getWarn().add(msgStruct.getWarn().get(i));
		}
		for (int i = 0; i < msgStruct.sizeInfo(); i++) {
			saveStruct.getInfo().add(msgStruct.getInfo().get(i));
		}
		
	}
	/** ���X�g�̃N���A */
	private void listClear() {

		if(this.list != null && this.list.size() > 0){
			this.list.clear();
		}else{
			list = new ArrayList();
		}

		for (int i = 0; i < DISPLAY_NUMBER; i++) {
			AD0090010Struct viewStruct = new AD0090010Struct();
			viewStruct.setl_DEFECT_QTY("0");
			this.list.add(viewStruct);
		}
		//���шꗗ
		if(this.rsltList != null && this.rsltList.size() > 0){
			this.rsltList.clear();
		}
		//�o�Ɉꗗ
		if(this.issueList != null && this.issueList.size() > 0){
			this.issueList.clear();
		}
	}
	
	/** struct�̃N���A */
	private void structClear() {
		
		if (this.struct != null) {
			this.struct.clear();
		}
		//Main Select Struct
		if (this.selectStruct != null) {
			this.selectStruct.clear();
		}
		//�ۊǋ�ʓ��o�ɍX�V�Ώ�Struct
		if (this.issueStruct != null) {
			this.issueStruct.clear();
		}
		//��ƕs�ǍX�V�Ώ�Struct
		if (this.defectStruct != null) {
			this.defectStruct.clear();
		}
	}
	
	/**
	 * ���C����ʍ��ڂ̏����l���Z�b�g����
	 */
	public void mainInitialize() {
		//�����l�̐ݒ�
		this.struct.setOPR_INST_QTY("0.0");//��Ǝw����
		this.struct.setSUM_ACPT_QTY("0.0");//�Ǖi���݌v
		this.struct.setSUM_DEFECT_QTY("0.0");//�s�Ǖi�݌v
		this.selectStruct.setUNIT_QTY_TYP(Kind.NUMBER);//�v�ʒP��
		this.struct.setUNIT_QTY_TYP(Kind.NUMBER);//�v�ʒP��
	}

	/**
	 * �V�X�e���p�����[�^
	 * @return 
	 */
	private void GetTimeCtrl() throws BusinessProcessException, FoundationException {
		try{
			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			PrivateConfig pc = new PrivateConfig(conn);
			tempTimeCtrl = pc.getString("TIME_CTRL");
			if("true".equals(tempTimeCtrl)){
				struct.setTIME_CTRL("true");
			}else{
				struct.setTIME_CTRL("false");
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
	}
	
	/**
	 * �Ɩ��^�p�����擾���܂��B
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void setBussinessOprDate() 
			throws FoundationException, SQLException {
		this.struct.setPLANT_CD(this.sysPLANT_CD);
		
		_oprDate = DateCtrl.getBusinessOprDate(conn,this.sysPLANT_CD);
		if(null == _oprDate || "".equals(_oprDate)){
			//�Ɩ����t�̎擾�Ɏ��s���܂����B
			setErrorMessage("KR00017");
			setReadStatus(ERROR);
			setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
			return;
		}
		
		struct.seth_BUSINESS_OPR_DATE(_oprDate);
		_oprTime = "0000";		
	}
	
	//���i�[�o�̓`�F�b�N�{�b�N�X���䏈��
	private void setIdentCard() throws FoundationException, SQLException{

		PrivateConfig pc = new PrivateConfig(conn);
		String tempIDENT_CARD = pc.getString("IDENT_CARD");
		
		if(!"1".equals(tempIDENT_CARD)){
			_initOutputFlg = "0";
			_outputFlg = "0";
			struct.setchk_OUTPUT("false");
		}

		_initProduct_Typ = pc.getString("PRODUCT_TYP");
	}
	/**
	 * �V�X�e���p�����[�^�擾
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AD0090010Struct sysParameterStruct = (AD0090010Struct) sysParameterList.get(0);
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
			AD0090010Struct procExecDateStruct = (AD0090010Struct) procExecDateList.get(0);
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
	
	/**
	 * �s�Ǘ��R�R�[�h���Đݒ�
	 */
	private void setDefect(){
		
		defectViewList.clear();
		List defectCauseCdListNew = struct.getList_l_DEFECT_CAUSE_CD();
		List defectInspcQtyListNew = struct.getList_l_DEFECT_QTY();
		List defectCommentListNew = struct.getList_l_DEFECT_COMMENT();
		String defectCauseCd;
		String defectInspcQty;
		String defectComment;
		for (int i = 0; i < defectCauseCdListNew.size(); i++) {
			defectCauseCd = (String) defectCauseCdListNew.get(i);
			defectInspcQty = (String) defectInspcQtyListNew.get(i);
			defectComment = (String) defectCommentListNew.get(i);
			AD0090010Struct defectStruct = new AD0090010Struct();
			defectStruct.setl_DEFECT_CAUSE_CD(defectCauseCd);
			defectStruct.setl_DEFECT_QTY(defectInspcQty);
			defectStruct.setl_DEFECT_COMMENT(defectComment);
			defectViewList.add(defectStruct);
		}
		this.list = defectViewList;
	}
	
	/**
	 * struct��ۑ�
	 *
	 */
	private void structSave(){
		//�ڍ׃E�B���h�E�ɁA�f�[�^��ۗ�
		struct.setDRAW_CD(selectStruct.getDRAW_CD());
		struct.setSPEC(selectStruct.getSPEC());
		struct.setMRP_ODR_TYP_DN(selectStruct.getMRP_ODR_TYP_DN());
		struct.setJOB_ODR_CD(selectStruct.getJOB_ODR_CD());
		struct.setWS_CD(selectStruct.getWS_CD());
		struct.setWS_NAME(selectStruct.getWS_NAME());
		struct.setWORK_ODR_DLV_DATE(selectStruct.getWORK_ODR_DLV_DATE());
		struct.setOPR_INST_START_DATE(selectStruct.getOPR_INST_START_DATE());
	}
	/**
	 * �o�Ɏw�����X�g��ݒ肵�܂��B
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ExpjException 
	 */
	private void setIssueList() 
			throws FoundationException, SQLException, ExpjException {

		try{
			this.issueList = entity.mSelectIssue.read(conn,this.selectStruct);
			
			//String partialNo = this.struct.getPARTIAL_PRD_NO();
			BigDecimal acptQty = new BigDecimal(this.struct.getACPT_QTY());
			BigDecimal defectQty = new BigDecimal(this.struct.getDEFECT_QTY());

			for (int i = 0; i < this.issueList.size(); i++) {

				BigDecimal planSum = acptQty.add(defectQty);
				AD0090010Struct tempIssueStruct = (AD0090010Struct) this.issueList.get(i);

				// �v��g�p���ʂ̎擾
				int round = Integer.parseInt(tempIssueStruct.getUNIT_QTY_TYP());
				BigDecimal denominator = new BigDecimal(tempIssueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR());
				BigDecimal numerator = new BigDecimal(tempIssueStruct.geth_ISSUE_INST_UNIT_NUMERATOR());

				// ��Ǝ��ѐ� * �\�������v��g�p���ʂɐݒ�
				if (round == 1) {
					planSum = planSum.multiply(numerator).divide(denominator, 0, BigDecimal.ROUND_UP).setScale(1);
				} else {
					planSum = planSum.multiply(numerator).divide(denominator, 4, BigDecimal.ROUND_UP);

					// �����̕\���X�P�[������
					/*BigDecimal intVal = new BigDecimal(""+ planSum.intValue());
					BigDecimal decimalVal = planSum.subtract(intVal).multiply(new BigDecimal(10000));
					int decVal = decimalVal.intValue();
					int roundCount = 1;
					while (true) {
						decVal = decVal / 10;
						if (decVal == 0) {
							break;
						}
						roundCount++;
					}

					planSum = planSum.setScale(roundCount,BigDecimal.ROUND_UP);*/
				}
				
				tempIssueStruct.setTEMP_PLAN_QTY(planSum.toString());

				// �g�p�ϐ��ʁA�v��O�g�p�ϐ��ʁA�X�V�g�p���ʂ̎擾
				tempIssueStruct.setTEMP_USEOVER_QTY("0.0");
				tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
				tempIssueStruct.setTEMP_USE_QTY(planSum.toString());		
			}
		}catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_ISSUE_INST.WORK_ODR_CD",selectStruct.getWORK_ODR_CD());//��ƌv��ԍ�
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_ISSUE_INST.WORK_ODR_CD",selectStruct.getWORK_ODR_CD());//��ƌv��ԍ�
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_ISSUE_INST.WORK_ODR_CD",selectStruct.getWORK_ODR_CD());//��ƌv��ԍ�
			throw new ExpjException(e, emsg);
		} finally {
			try {				
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}

	}
	
	// �q�i�ڎ��эX�V
	private void ChildRsltUpdate() throws BusinessProcessException, FoundationException
	{
	
		try{
			
			List tempList = new ArrayList();
			AD0090010Struct tempStruct = new AD0090010Struct();
						
			boolean isSuccess = true;
			errCount = 0;
			norCount = 0;
			for (int i = 0; i < this.issueList.size(); i++ ) {

				isSuccess = true;
				conn.beginTransWeb();
				
				this.issueStruct = new AD0090010Struct();
				this.issueStruct = (AD0090010Struct)this.issueList.get(i);
				setStandardItem(issueStruct);
				this.issueStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
				// this.issueStruct.setJOB_ODR_CD(this.selectStruct.getJOB_ODR_CD());
				// �q�i�ڂ̕i�ڎ�z�敪���A���Ԃ�ݒ�
				if("1".equals(issueStruct.getMRP_ODR_TYP()) || "2".equals(issueStruct.getMRP_ODR_TYP())) {
					issueStruct.setJOB_ODR_CD(selectStruct.getJOB_ODR_CD());
				} else {
					issueStruct.setJOB_ODR_CD("");
				}
				
				if (this.issueStruct.getTEMP_USE_QTY() == null
						|| Double.parseDouble(this.issueStruct.getTEMP_USE_QTY()) == 0) {
					norCount = norCount + 1;
					isSuccess = false;
					continue;
				}

				// Add Start 20140219 huang-lh
				// �擾���ꂽ���ځu�g�p���ۊǋ�v���Đݒ肷��
				if ("1".equals(_processManageFlg)) {
					// �H���ۊǏꏊ�̍݌ɂ��Ǘ�����Ƃ�
					tempList = entity.mCheckFirstWork.read(conn, this.selectStruct);
					if (null != tempList && tempList.size() > 0) {
						tempStruct = (AD0090010Struct)tempList.get(0);
					}
		    		// �ŏ��H�����ǂ������f����
		    		if (!tempStruct.getFIRST_OPR_INST_CD().equals(this.selectStruct.getIN_OPR_INST_CD())) {
		    			// �ŏ��H���łȂ��ꍇ
		    			issueStruct.setFIRST_WORK_FLG("0");
		    			
		    			// �O�H�������擾����
		    			tempList = entity.mSelectPrevWorkInfo.read(conn, this.selectStruct);
		    			if (null != tempList && tempList.size() > 0) {
	    					tempStruct = (AD0090010Struct)tempList.get(0);
	    				}
		    			// �O�H��������̏ꍇ�F�O�H���̍�Ǝ��тœo�^�����ۊǋ�R�[�h
		    			issueStruct.setWH_CD(tempStruct.getPREV_WH_CD());
		    		}
				}
    			// Add End 20140219 huang-lh
				
				//�ۊǋ�R�[�h��NULL�`�F�b�N
				if (this.issueStruct.getWH_CD() == null 
						|| "".equals(this.issueStruct.getWH_CD())) {
					errCount = errCount + 1;
					setErrorMessage("AD00215");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//�o�Ɏw��.�i�ڔԍ�
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//�o�Ɏw��.�o�Ɏw���ԍ�
					isSuccess = false;
					continue;
				}

				//�ۊǋ�R�[�h�`�F�b�N
				tempList = entity.mSelectChkWhCd.read(conn,this.issueStruct);
				if(tempList == null || tempList.size() == 0){
					errCount = errCount + 1;
  					setErrorMessage("AD00216");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//�o�Ɏw��.�i�ڔԍ�
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//�o�Ɏw��.�o�Ɏw���ԍ�
					setWarningSysLogMessage("M_WH.WH_CD",this.issueStruct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
					isSuccess = false;
					continue;
				}

				tempStruct = (AD0090010Struct)tempList.get(0);
				this.issueStruct.setWH_NAME(tempStruct.getWH_NAME());
				//�ۊǋ�R�[�h�̍H��R�[�h�ƍ�ƌn��ʎd�|�̍H��R�[�h�̓���`�F�b�N
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.selectStruct.getPLANT_CD())) {
					errCount = errCount + 1;
					setErrorMessage("AD00217");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//�o�Ɏw��.�i�ڔԍ�
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//�o�Ɏw��.�o�Ɏw���ԍ�
					setWarningSysLogMessage("M_WH.WH_CD", this.issueStruct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
					isSuccess = false;
					continue;
				}
				
				CollectNumber collectNum = 
						new CollectNumber(
							CollectNumber.ISSUE_CD,
							this.sysUSER_CD,
							this.sp.getProcId(),
							this.sysPLANT_CD);
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) {
					//�̔Ԍ��ʂ��Ȃ�
					setErrorMessage("ZZ01106");
					errCount = errCount + 1;
					isSuccess = false;
					continue;
				}
	
				BigDecimal keepUseQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
	
				//BigDecimal planQty = new BigDecimal(this.issueStruct.getTEMP_PLAN_QTY());
				BigDecimal useQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				if (this.issueStruct.getUNIT_QTY_TYP() != null
						&& "1".equals(this.issueStruct.getUNIT_QTY_TYP())) {
					//�i�ڂ������Ǘ��i�̏ꍇ�A�؏グ���s��
					useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
				}
				//�C�����e��ێ�
				this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
				this.issueStruct.setPLANT_CD(this.sysPLANT_CD);
				this.issueStruct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());
				this.issueStruct.setWORK_IN_PROC_CD(this.selectStruct.getWORK_IN_PROC_CD());
				this.issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
				if (useQty.doubleValue() > 0) {
					//�H���݌ɏo��
					this.issueStruct.setRCV_ISSUE_GNR_TYP("41");
				} else {
					//�H���݌ɏo�Ɏ��
					this.issueStruct.setRCV_ISSUE_GNR_TYP("49");
				}

				this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
				this.issueStruct.setOD_NO(this.selectStruct.getOD_NO());
				this.issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				this.issueStruct.setSTOCK_UPD_TYP("2");
				this.issueStruct.setRCV_ISSUE_TYP("2");
	
				// �ޔ�p�莝���݌ɐ���������
				issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
	
				useQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				BigDecimal stockQty = null;
				//�H���d�|�݌ɏo�ɏ���
				if(this.issueStruct.getJOB_ODR_CD() == null 
						|| this.issueStruct.getJOB_ODR_CD().length() == 0){
					//�ۊǋ�ʕi�ڍ݌ɍX�V
					tempList = entity.mSelectItemStock.read(conn,this.issueStruct);
					AD0090010Struct stockStruct = new AD0090010Struct();
					stockStruct.setStructM(this.issueStruct);
					setStandardItem(stockStruct);

					if (tempList.isEmpty()) {
						//�o�^
						useQty = useQty.negate();
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
						entity.mInsertItemStock.create(conn, stockStruct);
					} else {
						//�X�V
						tempStruct = (AD0090010Struct)tempList.get(0);
						issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
						if (useQty.doubleValue() > 0) { //�o��
							useQty = stockQty.subtract(useQty) ;
						} else { //����
							useQty = stockQty.add(useQty.negate()) ;
						}
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
						entity.mUpdateItemStock.update(conn, stockStruct);
					}
				} else {
					//���Ԏd�|�݌ɍX�V
					tempList = entity.mSelectOdrStock.read(conn,this.issueStruct);
					AD0090010Struct stockStruct = new AD0090010Struct();	
					stockStruct.setStructM(this.issueStruct);
					setStandardItem(stockStruct);
	
					if (tempList.isEmpty()) {
						//�o�^
						useQty = useQty.negate();
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
						entity.mInsertOdrStock.create(conn,stockStruct);
					} else {
						//�X�V
						tempStruct = (AD0090010Struct)tempList.get(0);
						stockStruct.setJOB_ODR_DETAIL_NO(tempStruct.getJOB_ODR_DETAIL_NO());
						issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
						if (useQty.doubleValue() > 0) { 
							//�o��
							useQty = stockQty.subtract(useQty) ;
						} else {
							//����
							useQty = stockQty.add(useQty.negate()) ;
						}
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
						entity.mUpdateOdrStock.update(conn,stockStruct);
					}
				}
				
				this.issueStruct.setOPR_RSLT_CRCT_NO("0");  //��Ǝ��ђ�����
				this.issueStruct.setRCV_ISSUE_DATE(struct.getOPR_DATE());//��Ɠ�
				//��ЃR�[�h
				this.issueStruct.setCOMPANY_CD(_company_cd);
				// ���b�g�Ǘ��t���O = 1(���b�g�Ǘ����s��)�̏ꍇ
				if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
					// �o�Ɏ��і��׎擾
					List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,this.issueStruct);

					// �f�[�^���Ȃ��ꍇ
					if (lotIssueList == null || lotIssueList.size() == 0) {
						errCount = errCount + 1;
						setErrorMessage("AD20135");
						setSupportMessage("T_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
								this.issueStruct.geth_ISSUE_INST_CD());// �o�Ɏw���ԍ�
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());// �i�ڔԍ�
						setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",this.issueStruct.getWORK_ODR_CD());	// ��ƌv��ԍ�
						isSuccess = false;
						continue;
					}

					// �g�p�c���ݒ�
					BigDecimal remainQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());

					AD0090010Struct lotUseStruct = new AD0090010Struct();
					lotUseStruct.setStructM(this.issueStruct);
					setStandardItem(lotUseStruct);

					for (int j = 0; j < lotIssueList.size(); j++) {
						AD0090010Struct lotIssueStruct = (AD0090010Struct) lotIssueList.get(j);

						// �������ĉ\���ݒ�
						BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
						BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
						BigDecimal availQty = issueQty.subtract(spentQty);

						// ���b�g�ʎg�p���ъǗ��ԍ��̔�
						List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
						if (seqList != null && seqList.size() > 0) {
							lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0090010Struct) seqList.get(0)).getNEXTVAL());
						}

						// ���b�g�ԍ��ݒ�
						lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

						BigDecimal useLotQty = null;

						// �������ĉ\�� >= �g�p�c���̏ꍇ
						if (availQty.doubleValue() >= remainQty.doubleValue()) {
							// �g�p�c�����������Đ��ɐݒ�
							useLotQty = remainQty;
							// �������ĉ\�� < �g�p�c���̏ꍇ
						} else {
							// �ŏI�f�[�^�̏ꍇ
							if (j == lotIssueList.size() - 1) {
								// �g�p�c�����g�p���ɐݒ�
								useLotQty = remainQty;
								// �ŏI�f�[�^�łȂ��ꍇ
							} else {
								// �����\����0���傫���ꍇ
								if (availQty.doubleValue() > 0) {
									// �g�p�c�����g�p���ɐݒ�
									useLotQty = remainQty;

									// �����R�[�h�ȍ~���擾
									for (int k = j + 1; k < lotIssueList.size(); k++) {
										AD0090010Struct nextLotIssueStruct = (AD0090010Struct) lotIssueList.get(k);

										// �������ĉ\���ݒ�
										BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
										BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
										BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

										// �����R�[�h�ȍ~�Ɉ����\�ȃf�[�^������ꍇ
										if (nextAvailQty.doubleValue() > 0) {
											// �������ĉ\�����g�p���ɐݒ�
											useLotQty = availQty;
											break;
										}
									}
									// �����\����0�ȉ��̏ꍇ
								} else {
									// ���̃f�[�^���擾
									continue;
								}
							}
						}

						// �g�p���������\�����傫���ꍇ
						if (useLotQty.doubleValue() > availQty.doubleValue()) {
							// ���b�Z�[�W�o��
							setWarningMessage("AD20136");
							setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
							setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
									this.issueStruct.geth_ISSUE_INST_CD());// �o�Ɏw���ԍ�
							setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
							// �i�ڔԍ�
							setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",this.issueStruct.getWORK_ODR_CD());
							// ��ƌv��ԍ�
						}

						// �g�p�ϐ��ʁA�g�p�\�萔�ʂɏ�L�Őݒ肵���g�p����ݒ�
						lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
						lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

						// ���ѓ����g�p���ɐݒ�
						lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

						// [���b�g�ʎg�p����]�̒ǉ�
						entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

						// [�o�Ɏ��і���]�̍X�V
						lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
						entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

						this.issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
						this.issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

						// ���b�g�ʕi�ڍ݌Ɍ���
						tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

						// �X�V�O�̍݌ɐ��ݒ�
						if (tempList.isEmpty()) {
							issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
						} else {
							tempStruct = (AD0090010Struct) tempList.get(0);
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						}

						// 2���ڈȍ~�̃f�[�^�̏ꍇ
						if (j > 0) {
							// ���o�ɊǗ��ԍ��̔�
							collectNum = new CollectNumber(CollectNumber.ISSUE_CD, this.sysUSER_CD,this.sp.getProcId(), this.sysPLANT_CD);
							no = collectNum.getNo();
							if (no == null || no.length() == 0) {
								// �̔Ԍ��ʂ��Ȃ�
								setErrorMessage("ZZ01106");
								isSuccess = false;
								break;
							}
							this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
						}
						
						//[�ۊǋ�ʓ��o��]�̒ǉ�
						entity.mInsertRecvIssue.create(conn, this.issueStruct);

						// ���b�g�ʕi�ڍ݌ɍX�V
						BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						List updateLotStockList = bc.excUpdateLotStockFd(no, "");

						// �ُ�I���̏ꍇ
						if (bc.getResultStatus().intValue() == 3) {
							// �G���[���b�Z�[�W�擾
							if (updateLotStockList != null&& updateLotStockList.size() > 0) {
								setErrorMessage((String) updateLotStockList.get(0));
							}
							isSuccess = false;
							break;
						}

						// ��Ǝ��ѕi�ڂ̃��b�g�Ǘ��t���O = 1(���b�g�Ǘ����s��)�̏ꍇ
						if ("1".equals(selectStruct.getLOT_CTRL_FLG())) {
							if(!"".equals(struct.getLOT_NO())){
								//���b�g�g���[�X�o�^�E�X�V����
								List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
										this.issueStruct.getLOT_NO(),selectStruct.getITEM_CD(),
										struct.getLOT_NO(),"2");
								// ����I���̏ꍇ
								if (bc.getResultStatus().intValue() == 1) {
									// ���b�g�g���[�X�o�^�E�X�V�����������ꍇ�A�m���b�g�g���[�X�n�̍X�V���s��
					            	tempStruct = new AD0090010Struct();
					            	tempStruct.setFROM_ITEM_CD(issueStruct.getITEM_CD());
					            	tempStruct.setFROM_LOT_NO(issueStruct.getLOT_NO());
					            	tempStruct.setTO_ITEM_CD(selectStruct.getITEM_CD());
					            	tempStruct.setTO_LOT_NO(struct.getLOT_NO());
					            	tempStruct.setTO_PUCH_ODR_CD(null);
					            	tempStruct.setsUser_ID(getsysUSER_CD());
					            	
					            	//[�������]�Ŕ����ԍ����擾
					            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, tempStruct);
					            	if((formList != null && formList.size() > 0)){
					            		//�����ԍ����\�[�g���i�~���j�ɂ��A�P���ڂ̃��R�[�h���擾����B
					            		AD0090010Struct orderStruct = (AD0090010Struct) formList.get(0);
						            	//[���b�g�g���[�X].�g�������ԍ��h = [�������]."�����ԍ�"
						            	tempStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
					            	}else{
					            		tempStruct.setFROM_PUCH_ODR_CD(null);
					            	}
					            	// �m���b�g�g���[�X�n�̍X�V���s��
					            	entity.mupdateT_LOT_TRACE.update(conn, tempStruct);
								}
								
								// �ُ�I���̏ꍇ
								if (bc.getResultStatus().intValue() == 3) {
									// �G���[���b�Z�[�W�擾
									if (lotTraceList != null && lotTraceList.size() > 0) {
										setErrorMessage((String) lotTraceList.get(0));
										}
									isSuccess = false;
									break;
									}
								}
						}

						//�g�p�c�����Z
						remainQty = remainQty.subtract(new BigDecimal(lotUseStruct.getTOTAL_ISSUE_QTY()));

						//�g�p�c����0�ȉ��̏ꍇ���[�v�I��
						if (remainQty.doubleValue() <= 0) {
							break;
						}
					}
					//���b�g�Ǘ��t���O = 1(���b�g�Ǘ����s��)�łȂ��ꍇ
				} else {
					//�ۊǋ�ʓ��o�ɓo�^
					entity.mInsertRecvIssue.create(conn, this.issueStruct);
				}
				
				if(isSuccess){
					norCount = norCount + 1;					
				}
				
				if(isSuccess){
					conn.commit();				
				}else{
					conn.rollback();
				}
			}
	
		}catch (NumberFormatException e) {
			errCount = errCount + 1;
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			errCount = errCount + 1;
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			errCount = errCount + 1;
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {				
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}
		
	}
	
	//[���i�[]�̏o��
	private void IdentCardOutPut() throws BusinessProcessException, FoundationException
	{
		try{

			//����O���[�v�ԍ��̐V�K�̔�
			ManagementNumber mngNumber = new ManagementNumber();
			String strPrintGrpNo = mngNumber.getSequenceNo("SEQ_ICT");
			mngNumber = null;

			AD0090010Struct InsIdentCardTempStruct = new AD0090010Struct();

			InsIdentCardTempStruct.setTMP_OPR_INST_CD(this.struct.getIN_OPR_INST_CD());
			InsIdentCardTempStruct.setTMP_PARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());

			List list_temp = entity.mSelectIdentCardForPrint.read(conn, InsIdentCardTempStruct);

			AD0090010Struct IdentCardTempStruct = new AD0090010Struct();
			setStandardItem(IdentCardTempStruct);

			//���i�[�̌������ʂ̃`�F�b�N
			if (list_temp.isEmpty()){
				setErrorMessage("ZZ11001");
				return;
			}else{
				//���i�[�̌������ʂ��i�[����
				InsIdentCardTempStruct = (AD0090010Struct) list_temp.get(0);
				setStandardItem(InsIdentCardTempStruct);
				IdentCardTempStruct.setINS_PRINT_GRP_NO(strPrintGrpNo);
				IdentCardTempStruct.setINS_IDENT_CARD_CTL_NO(InsIdentCardTempStruct.getTMP_IDENT_CARD_CTL_NO());
				IdentCardTempStruct.setINS_OPR_INST_CD(InsIdentCardTempStruct.getTMP_OPR_INST_CD());
				IdentCardTempStruct.setINS_PARTIAL_PRD_NO(InsIdentCardTempStruct.getTMP_PARTIAL_PRD_NO());
				IdentCardTempStruct.setINS_RCV_ISSUE_CTRL_CD(InsIdentCardTempStruct.getTMP_RCV_ISSUE_CTRL_CD());
				IdentCardTempStruct.setINS_ITEM_CD(InsIdentCardTempStruct.getTMP_ITEM_CD());
				IdentCardTempStruct.setINS_JOB_ODR_CD(InsIdentCardTempStruct.getTMP_JOB_ODR_CD());
				IdentCardTempStruct.setINS_FIRST_IDENT_CARD_QTY(InsIdentCardTempStruct.getTMP_FIRST_IDENT_CARD_QTY());
				IdentCardTempStruct.setINS_IDENT_CARD_QTY(InsIdentCardTempStruct.getTMP_IDENT_CARD_QTY());
				IdentCardTempStruct.setINS_OPR_DATE(InsIdentCardTempStruct.getTMP_OPR_DATE());
				IdentCardTempStruct.setINS_PKG_UNIT_QTY(InsIdentCardTempStruct.getTMP_PKG_UNIT_QTY());
				IdentCardTempStruct.setINS_PLANT_CD(InsIdentCardTempStruct.getTMP_PLANT_CD());
				IdentCardTempStruct.setINS_WS_CD(InsIdentCardTempStruct.getTMP_WS_CD());
				IdentCardTempStruct.setLOT_NO(InsIdentCardTempStruct.getLOT_NO());
			}

            //���i�[���ʁ��׎p�P�ʐ��ʂ̏������߂�
			String pageno = Calculate.divide(IdentCardTempStruct.getINS_IDENT_CARD_QTY(), IdentCardTempStruct.getINS_PKG_UNIT_QTY(), 0, Calculate.FLOOR);

			double bunshi = Double.parseDouble(IdentCardTempStruct.getINS_IDENT_CARD_QTY());
			double bunbo = Double.parseDouble(IdentCardTempStruct.getINS_PKG_UNIT_QTY());
			double overno;

			//���i�[���ʁ��׎p�P�ʐ��ʂ̗]������߂�
			overno = bunshi % bunbo;

			//���y�[�W���̎Z�o
			if (0 < overno){
				//�]�肪����ꍇ�A�P�����Z
				pageno = Calculate.add(pageno, "1");
			}

			//���y�[�W�������[�v����
			for(long i=1;i<=Long.parseLong(pageno) ;i++)
			{
				//�ŏI�y�[�W�ł��A�]�肪����ꍇ
				if (i == Long.parseLong(pageno) && 0 < overno){
					//�]����׎p�P�ʐ��ʂɐݒ�
					IdentCardTempStruct.setINS_PKG_UNIT_QTY(Double.toString(overno));
				}

				IdentCardTempStruct.setINS_PAGE_NO(Long.toString(i));

				// ���i�[TEMP�̓o�^
				entity.mInsertIdentCardTemp.create(conn,IdentCardTempStruct);
	    	} 

			//���i�[�o��
			controlPrint(strPrintGrpNo);

			//�o�͖�����ݒ�
			IdentCardTempStruct.setINS_PRINT_QTY(pageno);

			//���i�[�̍X�V
			entity.mUpdateIdentCard2.update(conn,IdentCardTempStruct);

			//���i�[TEMP�̍폜
			entity.mDeleteIdentCardTemp.delete(conn,IdentCardTempStruct);
		
		}catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_IDENT_CARD.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��Ǝw���ԍ�
			setSeverSysLogMessage("T_IDENT_CARD.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_IDENT_CARD.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��Ǝw���ԍ�
			setSeverSysLogMessage("T_IDENT_CARD.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_IDENT_CARD.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��Ǝw���ԍ�
			setSeverSysLogMessage("T_IDENT_CARD.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}
	}
	
	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint(String strPrintGrpNo) throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090011Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AD0090010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
		try {
			String printId1 = "AD00900101";		// TODO: ���[ID���w�肵�Ă�������

			ret = svf.VrInit(printId1);	// PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath();	// pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName();	// pdf�t�@�C�����iWeb�p�j
			queryFileName = svf.getQueryFileName();	// query�t�@�C����
		
			/* �N�G���[�t�@�C���̎w�� */
			if(dbKIND != null && !"".equals(dbKIND)) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}
			/* �N�G���[���o�����̎w�� */

			ret = svf.VrCondition("[X|PRINT_GRP_NO]=" + Long.parseLong(strPrintGrpNo), 4);

			/* �N�G���[���s */
			ret = svf.VrReport();
			if(ret == -554) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}
			if (ret != 0){
				setErrorMessage("ZZ01108");
				return;
			}

			/* PDF�쐬�I�� */
			ret = svf.VrQuit();

			//struct.setDOWNLOAD_FILE(getPdfFileName());
			_printFlg = "1";
			_downloadFile = getPdfFileName();
			_keepOprInstCd = this.struct.getIN_OPR_INST_CD();
			_keepPartialPrdNo = struct.getPARTIAL_PRD_NO();

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
		logger.exiting("AD0090011Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}
	
	/**
	 * ���l�^�C�v���ڂ�null�̏ꍇ�A0���Z�b�g���܂��B
	 * @throws Exception
	 */
	private void zeroSet(AD0090010Struct targetStruct)
			throws Exception {
		//��Ǝw������null�̏ꍇ�A0�Z�b�g
		if (targetStruct.getOPR_INST_QTY() == null 
				|| targetStruct.getOPR_INST_QTY().length() == 0) {
			targetStruct.setOPR_INST_QTY("0.0");
		}
		//�Ǖi����null�̏ꍇ�A0���Z�b�g
		if (targetStruct.getACPT_QTY() == null 
				|| targetStruct.getACPT_QTY().length() == 0) {
			targetStruct.setACPT_QTY("0.0");
		}
		//�Ǖi�݌v����null�̏ꍇ�A0���Z�b�g
		if (targetStruct.getSUM_ACPT_QTY() == null 
				|| targetStruct.getSUM_ACPT_QTY().length() == 0) {
			targetStruct.setSUM_ACPT_QTY("0.0");
		}
		//�s�Ǖi����null�̏ꍇ�A0���Z�b�g
		if (targetStruct.getDEFECT_QTY() == null 
				|| targetStruct.getDEFECT_QTY().length() == 0) {
			targetStruct.setDEFECT_QTY("0.0");
		}
		//�s�Ǖi�݌v����null�̏ꍇ�A0���Z�b�g
		if (targetStruct.getSUM_DEFECT_QTY() == null 
				|| targetStruct.getSUM_DEFECT_QTY().length() == 0) {
			targetStruct.setSUM_DEFECT_QTY("0.0");
		}
		//�O�i��莞�Ԃ�null�̏ꍇ�A0���Z�b�g
		if (targetStruct.getPRE_ARRANGEMENT_TIME() == null 
				|| targetStruct.getPRE_ARRANGEMENT_TIME().length() == 0) {
			targetStruct.setPRE_ARRANGEMENT_TIME("0.0");
		}
		//��Ǝ��Ԃ�null�̏ꍇ�A0���Z�b�g
		if (targetStruct.getOPR_TIME() == null 
				|| targetStruct.getOPR_TIME().length() == 0) {
			targetStruct.setOPR_TIME("0.0");
		}
		//��i��莞�Ԃ�null�̏ꍇ�A0���Z�b�g
		if (targetStruct.getPOST_ARRANGEMENT_TIME() == null 
				|| targetStruct.getPOST_ARRANGEMENT_TIME().length() == 0) {
			targetStruct.setPOST_ARRANGEMENT_TIME("0.0");
		}
		//��~���Ԃ�null�̏ꍇ�A0���Z�b�g
		if (targetStruct.getCESSATION_TIME() == null 
				|| targetStruct.getCESSATION_TIME().length() == 0) {
			targetStruct.setCESSATION_TIME("0.0");
		}
		//�����s�ǐ���0�̏ꍇ�A0�Z�b�g
		if (targetStruct.getl_DEFECT_QTY() == null
				|| targetStruct.getl_DEFECT_QTY().length() == 0){
			targetStruct.setl_DEFECT_QTY("0.0");
		}
		
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �ڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>

		try {
			
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
			
			_keepOprInstCd = struct.getIN_OPR_INST_CD();
			_outputFlg = _initOutputFlg;
			_lastProc = true;
			struct.setchk_CHILD_RSLTUPDATE("true");
			this.selectStruct.clear();
			this.listClear();
			this.struct.clear();
			
			//�����l�̐ݒ�
			mainInitialize();
			this.struct.setIN_OPR_INST_CD(_keepOprInstCd);
			this.struct.setPARTIAL_PRD_NO(null);
			
			//��Ǝw���`�[����
			List tempList = entity.mSelectOprInstSlip.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD30587");
				setWarningSysLogMessage("T_OPR_INST_SLIP.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��Ǝw���`�[.��Ǝw���ԍ�
				setReadStatus(NOT_FOUND);
				return;
			}
			AD0090010Struct tempStruct = (AD0090010Struct)tempList.get(0);
			if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
				setErrorMessage("AD00031");
				setWarningSysLogMessage("T_OPR_INST_SLIP.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��Ǝw���`�[.��Ǝw���ԍ�
				setWarningSysLogMessage("T_OPR_INST_SLIP.PLANT_CD", tempStruct.getPLANT_CD());//��Ǝw���`�[.�H��
				setReadStatus(ERROR);
				return;
			}			
			
			// Main Select		
			tempList = new ArrayList();
			tempList = entity.mSelect.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//�n��ʎd�|.��Ǝw���ԍ�
				setReadStatus(NOT_FOUND);
				return;
			}
			
			this.selectStruct = new AD0090010Struct();
			this.selectStruct = (AD0090010Struct)tempList.get(0);
		        this.selectStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",selectStruct.getMRP_ODR_TYP()));
			setStandardItem(selectStruct);
			
			//��Ə�ԋ敪= 1�F���w�� �̏ꍇ
			if("1".equals(selectStruct.getWORK_STS_TYP())){
				setErrorMessage("AD30804");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��ƌn��ʎd�|.��Ǝw���ԍ�
				setReadStatus(ERROR);
				return;
			}
			
			//�o�����̏ꍇ�G���[
			if("1".equals(selectStruct.getOPR_RSLT_TYP())){
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��ƌn��ʎd�|.��Ǝw���ԍ�
				setReadStatus(ERROR);
				return;
			}
			
			
			
			//��Ə�ԋ敪= 9�F���� �̏ꍇ
			if("9".equals(selectStruct.getWORK_STS_TYP())){
				setWarningMessage("AD00090");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��ƌn��ʎd�|.��Ǝw���ԍ�
			}
			
			this.selectStruct.seth_FINAL_PROC_FLG(selectStruct.getFINAL_PROC_FLG());
			//��Ɠ�
			this.selectStruct.setOPR_DATE(_oprDate);
			//��Ɠ�(����)
			this.selectStruct.setOPRATION_TIME("0000");
			
			//�Ǖi���A�s�ǐ��̍��v
			SumAcptQty = "0";
			SumDefectQty = "0"; 
			for (int i = 0;i<tempList.size();i++) {
				this.QtyStruct = new AD0090010Struct();
				this.QtyStruct = (AD0090010Struct)tempList.get(i);
				SumAcptQty = Calculate.add(SumAcptQty, this.QtyStruct.getSUM_ACPT_QTY());
				SumDefectQty = Calculate.add(SumDefectQty, this.QtyStruct.getSUM_DEFECT_QTY());
				//��Ɠ��𔻒�A�ő��Ɠ����w��
				if (i == 0) {
					OprDate = this.QtyStruct.geth_OPR_DATE();
				} else {
					if (OprDate.compareTo(this.QtyStruct.geth_OPR_DATE())<0) {
						OprDate = this.QtyStruct.geth_OPR_DATE();
					}
				}
			}
            //�Ǖi���A�s�ǐ�����ʂɃZ�b�g
			this.selectStruct.setSUM_ACPT_QTY(SumAcptQty);
			this.selectStruct.setSUM_DEFECT_QTY(SumDefectQty);
			//��Ɠ�����ʂɃZ�b�g
			this.selectStruct.seth_OPR_DATE(OprDate);
						
			//�Ǖi���̍��v + �s�ǐ��̍��v
			String qty_Hj = Calculate.add(SumAcptQty, SumDefectQty);
			
			//�Ǖi�����Z�b�g (��Ǝw���� - (�Ǖi���̍��v + �s�ǐ��̍��v))
			this.selectStruct.setACPT_QTY(Calculate.subtract(selectStruct.getOPR_INST_QTY(), qty_Hj));
			if(Calculate.compare("0", selectStruct.getACPT_QTY()) > 0){
				this.selectStruct.setACPT_QTY("0");
			}
			
			//�s�Ǖi���P��
			this.selectStruct.setd1_STOCK_UNIT(selectStruct.getSTOCK_UNIT());
			
			//��Ɗ����`�F�b�N�{�b�N�X
			this.selectStruct.setchk_COMPLETE("true");
			
			//���i�[�o�̓`�F�b�N�{�b�N�X���䏈��
			AD0090010Struct FormSetStruct = new AD0090010Struct();
			
			if("1".equals(_outputFlg)){
				
				_outputFlg = "0";
				FormSetStruct.setFORM_SET_ITEM_CD(this.selectStruct.getITEM_CD());
				
				List list_formset2 = entity.mSelectPRODUCT_TYP.read(conn, FormSetStruct);
				//�i�ڃ}�X�^���琻�i�敪�̌������ʂ̃`�F�b�N
				if (list_formset2.isEmpty()){
					setErrorMessage("KR20011");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", selectStruct.getITEM_CD());//�i��.�i�ڔԍ�
					setReadStatus(ERROR);
					return;
				}
				//���i�敪�̎擾
				FormSetStruct = (AD0090010Struct)list_formset2.get(0);
				String strProduct_Typ = FormSetStruct.getPRODUCT_TYP();
				
				if (null != _initProduct_Typ && !"".equals(_initProduct_Typ) && "1".equals(selectStruct.getFINAL_PROC_FLG())){
					String[] arrProduct_Typ = _initProduct_Typ.split(",");
					for(int i=0; i < arrProduct_Typ.length; i++){
						if(null != strProduct_Typ && !"".equals(strProduct_Typ) && strProduct_Typ.equals(arrProduct_Typ[i])){
							_outputFlg = "1";
							break;
						}
					}
				}
			}
			
			if("1".equals(_outputFlg)){
				this.selectStruct.setchk_OUTPUT("true");
			}else{
				this.selectStruct.setchk_OUTPUT("false");
			}
			
			//�q�i�ڈꊇ�X�V�`�F�b�N�{�b�N�X
			//����̍ő�d�|��ƌn��ԍ����擾
			String maxProcNo = null;
			tempList = entity.mSelectMaxProcNo.read(conn, this.selectStruct);
			if (tempList != null && tempList.size() != 0) {
				tempStruct = (AD0090010Struct)tempList.get(0);
				maxProcNo = tempStruct.getPROC_NO();
			}
			
			if (null != maxProcNo && "1".equals(this.selectStruct.getOUTSIDE_TYP()) 
					&& maxProcNo.equals(this.selectStruct.getPROC_NO())){			
				//�ŏI�H���t���O�𗧂Ă�
				_lastProc = true;
				this.selectStruct.setchk_CHILD_RSLTUPDATE("true");
			}else{
				_lastProc = false;
				this.selectStruct.setchk_CHILD_RSLTUPDATE("false");
			}
			
			this.selectStruct.seth_PROCESS_MANAGE_FLG(this._processManageFlg);
			
			// ���H���̑O�H�������H�����擾����
			SelectPrevOrNextWork();
			
			// �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A�ŏ��H���łȂ��A���O��H����[��Ǝ���]�ɓo�^���Ȃ��ꍇ
	 		if("1".equals(_processManageFlg) && !"1".equals(selectStruct.getFIRST_WORK_FLG())) {
	 			if (isNull(selectStruct.getPREV_WORK_ODR_CD())) {
	 				setErrorMessage("AD00228");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
					setReadStatus(ERROR);
					return;
	 			}
	 		}
	 		
	 		// �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A
	 		// [��ƌn��ʎd�|]����擾����[��ƌn��ʎd�|].�g�d�|���O��敪�h��2�F�O��̃��R�[�h������ꍇ
	 		if("1".equals(_processManageFlg)) {
	 			AD0090010Struct paramStruct = new AD0090010Struct();
	 			paramStruct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());
	 			tempList = entity.mSelectTworkProcByProc.read(conn,paramStruct);
	 			if (null != tempList && tempList.size() > 0) {
					struct.setDATA_COUNT(((AD0090010Struct)tempList.get(0)).getDATA_COUNT());
				}
	 			
	 			if (Calculate.compare(struct.getDATA_COUNT(), "0") < 0) {
	 				setErrorMessage("AD00229");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
					setReadStatus(ERROR);
					return;
	 			}
	 		}
			
			//�ۊǋ�R�[�h�̃Z�b�g
//			if(Calculate.compare(selectStruct.getPARTIAL_PRD_NO(),"1") > 0){
//				tempList = entity.mSELECT_T_OPR_RSLT.read(conn, selectStruct);
//				if(null != tempList && tempList.size() > 0){
//					tempStruct = (AD0090010Struct)tempList.get(0);
//					this.selectStruct.setWH_CD(tempStruct.getWH_CD());
//					this.selectStruct.setWH_NAME(tempStruct.getWH_NAME());
//					this.selectStruct.setWS_CD(tempStruct.getWS_CD());
//					this.selectStruct.setWS_NAME(tempStruct.getWS_NAME());
//				}
//			}else{
//				this.selectStruct.setPLANT_CD(this.sysPLANT_CD);
//				this.selectStruct.setWH_CD(ValidateWh.getDefaultOprWh(
//					conn, getsysPLANT_CD(), this.selectStruct.getITEM_CD()));
//				if(StringUtil.Validate(this.selectStruct.getWH_CD())){
//					tempList = entity.mM_WH.read(conn,this.selectStruct);
//					this.selectStruct.setWH_NAME(((AD0090010Struct)tempList.get(0)).getWH_NAME());
//				}
//			}
			
			// �V�X�e���p�����[�^�F�@�g�H���ۊǏꏊ�̍݌ɂ��Ǘ�����h���hON�h���ŏI�H���łȂ��̏ꍇ
			if ("1".equals(_processManageFlg) && !"1".equals(selectStruct.getFINAL_PROC_FLG())) {
				tempList = entity.mSELECT_T_OPR_RSLT.read(conn, selectStruct);
				if(null != tempList && tempList.size() > 0){
					if(Calculate.compare(selectStruct.getPARTIAL_PRD_NO(),"1") > 0){
						tempStruct = (AD0090010Struct)tempList.get(0);
						this.selectStruct.setWH_CD(tempStruct.getWH_CD());
						this.selectStruct.setWH_NAME(tempStruct.getWH_NAME());
						this.selectStruct.setWS_CD(tempStruct.getWS_CD());
						this.selectStruct.setWS_NAME(tempStruct.getWS_NAME());
					} else {
						// ���H���̍�Ƌ�R�[�h�����Ƌ�ɓo�^����Ă���ۊǋ�R�[�h���擾����B
						this.selectStruct.setWH_CD(selectStruct.getNEXT_WH_CD());
						this.selectStruct.setWH_NAME(selectStruct.getNEXT_WH_NAME());
					}
					
				} else {
					// ���H���̍�Ƌ�R�[�h�����Ƌ�ɓo�^����Ă���ۊǋ�R�[�h���擾����B
					this.selectStruct.setWH_CD(selectStruct.getNEXT_WH_CD());
					this.selectStruct.setWH_NAME(selectStruct.getNEXT_WH_NAME());
				}
			} else {
				// �V�X�e���p�����[�^�F�@�g�H���ۊǏꏊ�̍݌ɂ��Ǘ�����h���hOFF�h�ꍇ
				if(Calculate.compare(selectStruct.getPARTIAL_PRD_NO(),"1") > 0){
					tempList = entity.mSELECT_T_OPR_RSLT.read(conn, selectStruct);
					if(null != tempList && tempList.size() > 0){
						tempStruct = (AD0090010Struct)tempList.get(0);
						this.selectStruct.setWH_CD(tempStruct.getWH_CD());
						this.selectStruct.setWH_NAME(tempStruct.getWH_NAME());
						this.selectStruct.setWS_CD(tempStruct.getWS_CD());
						this.selectStruct.setWS_NAME(tempStruct.getWS_NAME());
					}
				}else{
					this.selectStruct.setPLANT_CD(this.sysPLANT_CD);
					this.selectStruct.setWH_CD(ValidateWh.getDefaultOprWh(
						conn, getsysPLANT_CD(), this.selectStruct.getITEM_CD()));
					if(StringUtil.Validate(this.selectStruct.getWH_CD())){
						tempList = entity.mM_WH.read(conn,this.selectStruct);
						this.selectStruct.setWH_NAME(((AD0090010Struct)tempList.get(0)).getWH_NAME());
					}
				}
			}
			
			zeroSet(selectStruct);
			//�o�Ɏw���ԍ�
			this.selectStruct.seth_ISSUE_INST_CD(null);
			
			this.struct.setStructM(selectStruct);
			
			//���ԊǗ��t���O
			if("true".equals(tempTimeCtrl)){
				struct.setTIME_CTRL("true");
			}else{
				struct.setTIME_CTRL("false");
				struct.setOPRATION_TIME("");
			}
			this.struct.seth_BUSINESS_OPR_DATE(_oprDate);
			
			setReadStatus(NORMAL);
			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		try{
			//�s�Ǘ��R�R�[�h���Đݒ�
			setDefect();
			//���ی����̒��߂��������Ă�����t�`�F�b�N
			if(getSysParameter() == false){
				//���ی����Ǘ��p�����[�^�̑Ώ۔N����
				BigDecimal ProcExecDate = getProcExecDate();
				if(null != ProcExecDate){
					boolean b = true;
					// ��ʓ��͔N����
					BigDecimal input = new BigDecimal(struct.getOPR_DATE().substring(0,4) + struct.getOPR_DATE().substring(5,7));
					b = compDecimal(input,ProcExecDate);
					if(!b){
						setErrorMessage("AE00160");
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
						return;
					}
				}
			}
			
			//���l�^�C�v���ڂ�null�̏ꍇ�A0���Z�b�g
			zeroSet(this.struct);
			_downloadFile = null;
			struct.setDOWNLOAD_FILE(null);
			List tempList = null;
			AD0090010Struct tempStruct = null;
			
			//��Ə�ԋ敪�̃`�F�b�N
			tempList = entity.mSELECT_Work_Sts_Typ.read(conn, struct);
			if(null != tempList && tempList.size() > 0){
				tempStruct = (AD0090010Struct)tempList.get(0);	
				if("9".equals(tempStruct.getWORK_STS_TYP())){
					setErrorMessage("AD00120");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��ƌn��ʎd�|.��Ǝw���ԍ�
					return;
				}
			}

			//�ۊǋ�R�[�h�`�F�b�N
			if(null != struct.getWH_CD() && !"".equals(struct.getWH_CD())){
				tempList = entity.mSelectChkWhCd.read(conn,struct);
				if(tempList.isEmpty()){
					setErrorMessage("AD00020");
					setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
					return;
				} else {
					tempStruct = (AD0090010Struct)tempList.get(0);
					this.struct.setWH_NAME(tempStruct.getWH_NAME());
					//�ۊǋ�R�[�h�̍H��R�[�h�ƍ�ƌn��ʎd�|�̍H��R�[�h�̓���`�F�b�N
					if (tempStruct.getPLANT_CD() == null 
							|| !tempStruct.getPLANT_CD().equals(this.selectStruct.getPLANT_CD())) {
						this.struct.setWH_NAME(null);
						setErrorMessage("AD00021");
						setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//�ۊǋ�.�ۊǋ�R�[�h
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
						return;
					}
				}
			}
			//���э�Ƌ�R�[�h�`�F�b�N
			tempList = entity.mSelectChkWsCd.read(conn,this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD20029");
				setWarningSysLogMessage("M_WS.WS_CD",this.struct.getWS_CD());//��Ƌ�.��Ƌ�R�[�h
				return;
			} else {
				tempStruct = (AD0090010Struct)tempList.get(0);
				this.struct.setWS_NAME(tempStruct.getWS_NAME());
				//���э�Ƌ�R�[�h�̍H��R�[�h�ƍ�ƌn��ʎd�|�̍H��R�[�h�̓���`�F�b�N
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.selectStruct.getPLANT_CD())) {
					this.struct.setWH_NAME(null);
					setErrorMessage("AD00004");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
					return;
				}
			}

			//Add start 20140219 huang-lh
			
			AD0090010Struct paramStruct = new AD0090010Struct();
	 		// �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A�ŏI�H���ȊO�̏ꍇ�A[�ۊǋ�].�h�q�ɋ敪�h�� �P�F�H���ۊǏꏊ �łȂ��ꍇ
	 		if("1".equals(_processManageFlg) && !"1".equals(selectStruct.geth_FINAL_PROC_FLG())) {
	 			paramStruct.setNEXT_WH_CD(struct.getWH_CD());
				tempList = entity.mSelectWhTyp.read(conn,paramStruct);
				// �ۊǋ�̑q�ɋ敪���擾����
				if (null != tempList && tempList.size() > 0) {
					struct.setWH_TYP(((AD0090010Struct)tempList.get(0)).getWH_TYP());
				}
	 			if (!"1".equals(struct.getWH_TYP().toString())) {
	 				setErrorMessage("AA00156");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
					return;
	 			}
	 		}
	 		
	 		//�V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A�ŏI�H���ȊO�������>1�̏ꍇ�A��Ǝw���ԍ����Ƃɕۊǋ�R�[�h���s��v�̏ꍇ
	 		if("1".equals(_processManageFlg) && !"1".equals(selectStruct.geth_FINAL_PROC_FLG())
	 				&& Calculate.compare(selectStruct.getPARTIAL_PRD_NO(),"1") > 0) {
	 			// ��Ǝ��т̓�����Ǝw���ԍ��̕ۊǋ�R�[�h�̐��ʂ��擾����
	 			paramStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
	 			paramStruct.setWH_CD(struct.getWH_CD());
	 			tempList = entity.mSelectWhCdCount.read(conn,paramStruct);
				// �ۊǋ�̑q�ɋ敪���擾����
				if (null != tempList && tempList.size() > 0) {
					struct.setWH_CD_COUNT(((AD0090010Struct)tempList.get(0)).getWH_CD_COUNT());
				}
	 			if (Calculate.compare(struct.getWH_CD_COUNT(),"0") == 0) {
	 				setErrorMessage("AD00230");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
					return;
	 			}
	 		}
	 		
	 		// �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A�ŏ��H���łȂ��A���O��H����[��Ǝ���]�ɓo�^���Ȃ��ꍇ
	 		if("1".equals(_processManageFlg) && !"1".equals(selectStruct.getFIRST_WORK_FLG())) {
	 			if (isNull(selectStruct.getPREV_WORK_ODR_CD())) {
	 				setErrorMessage("AD00228");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
					return;
	 			}
	 		}
	 		
	 		// �V�X�e���p�����[�^�F�h�H���ۊǏꏊ�̍݌ɂ��Ǘ��h���h�n�m�h ���A
	 		// [��ƌn��ʎd�|]����擾����[��ƌn��ʎd�|].�g�d�|���O��敪�h��2�F�O��̃��R�[�h������ꍇ
	 		if("1".equals(_processManageFlg)) {
	 			paramStruct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());
	 			tempList = entity.mSelectTworkProcByProc.read(conn,paramStruct);
	 			if (null != tempList && tempList.size() > 0) {
					struct.setDATA_COUNT(((AD0090010Struct)tempList.get(0)).getDATA_COUNT());
				}
	 			
	 			if (Calculate.compare(struct.getDATA_COUNT(), "0") > 0) {
	 				setErrorMessage("AD00229");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//�n��ʎd�|.��Ǝw���ԍ�
					return;
	 			}
	 		}
	 		//Add End 20140219 huang-lh
			
			// ���b�g�Ǘ��t���O = 1(���b�g�Ǘ�) �Ɓ@�ŏI�n��t���O = 1(�ŏI�n��)�̏ꍇ
			if("1".equals(selectStruct.getLOT_CTRL_FLG()) && "1".equals(selectStruct.getFINAL_PROC_FLG())){
				BigDecimal acptQty = new BigDecimal(this.struct.getACPT_QTY());
				//�Ǖi�� > 0�̏ꍇ
				if(acptQty.doubleValue() > 0){
					//���b�g�ԍ��̔ԋ敪 = 0(�����̔Ԃ��Ȃ�)�̏ꍇ
					if("0".equals(selectStruct.getLOT_NUMBERING_TYP())){
						//���b�g�Ǘ�����
						tempList = entity.mT_LOT_CTRL.read(conn,this.struct);
						//[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ
						if(tempList == null || tempList.size() == 0){
							setErrorMessage("AE20603");
							setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", this.struct.getLOT_NO());
							return;
						}
						//���b�g�ԍ��̔ԋ敪 = 0(�����̔Ԃ��Ȃ�)�łȂ��ꍇ
					}else{
						//���b�g�ԍ���null�̏ꍇ
						if (this.struct.getLOT_NO() == null || this.struct.getLOT_NO().equals("")) {
							// �݌Ƀ��b�g�ԍ��̎����̔Ԃ��s���B
							BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
					 		List retList = bc.getsetLotNumberingFd(struct.getITEM_CD(), struct.getOPR_DATE());

							//����I���̏ꍇ
							if(bc.getResultStatus().intValue() != 3){
								//�݌Ƀ��b�g�ԍ��̎擾
								if(retList != null && retList.size() > 0){
									String result1 = (String)retList.get(0);
									struct.setLOT_NO(result1);
								}
							//�ُ�I���̏ꍇ
							}else{
								//�G���[���b�Z�[�W�̎擾
								if(retList != null && retList.size() > 1){
									String result2 = (String)retList.get(1);
									setErrorMessage(result2);
									return;
								}
							}
						//�X�V�O�̃��b�g�ԍ���null�łȂ��ꍇ
						} else {
							//���b�g�Ǘ�����
							tempList = entity.mT_LOT_CTRL.read(conn,this.struct);

							//[���b�g�Ǘ�]�ɑ��݂��Ȃ��ꍇ
							if(tempList == null || tempList.size() == 0){
								setErrorMessage("AE20603");
								setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", this.struct.getLOT_NO());
								return;
							}
						}
					}
				}
			}		
			
			//�ꗗ�́u�s�Ǘ��R�R�[�h�v���d���`�F�b�N
			HashSet hs = new HashSet();		
			int defectCauseCount = 0;

			List defectCauseCdListChk = struct.getList_l_DEFECT_CAUSE_CD();
			for (int i = 0; i < defectCauseCdListChk.size()-1; i++) {
				String defectCauseCd = (String) defectCauseCdListChk.get(i);
				if("0".equals(defectCauseCd)){
					continue;
				}
				hs.add(defectCauseCd);
				defectCauseCount = defectCauseCount + 1;
			}
			
			//�ꗗ�́u�s�Ǘ��R�R�[�h�v���d���̏ꍇ
			if(defectCauseCount != hs.size()){
				setErrorMessage("AE05062");
				return;				
			}
			
			//��Ǝ��т֒ǉ�
			struct.setPLANT_CD(selectStruct.getPLANT_CD());
			//��Ǝ��э�Ɠ� = �u��Ɠ��v�{�u��ƊJ�n����(����)�v
			if(null == struct.getOPRATION_TIME() || "".equals(struct.getOPRATION_TIME())){
				struct.setOPRATION_TIME("0000");
			}
			if(struct.getOPRATION_TIME().length() == 3){
				struct.setOPRATION_TIME("0"+struct.getOPRATION_TIME());
			}
			struct.setOPR_DATE(struct.getOPR_DATE()+ " " + struct.getOPRATION_TIME());
			//�o�������єԍ�
			struct.setOUTPUT_RSLT_CD(null);
			//��ƒ�����
			struct.setOPR_CRCT_NO("0");
			
			try{
				entity.mInsertT_OPR_RSLT.create(conn, struct);
			}catch(SQLException ee){
				String err = ee.toString();
				if (err.indexOf("ORA-00001") != -1) { //��Ӑ���G���[
					setErrorMessage("ZZ01102");
					setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD",this.struct.getIN_OPR_INST_CD());//��Ǝ���.��Ǝw���ԍ�
					setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO",this.struct.getPARTIAL_PRD_NO());//��Ǝ���.�����
					return;
				}
				throw ee;
			}
			
			//[��ƌn��ʎd�|]�A[�i�ڕʎd�|]�̍X�V
			//�����̃`�F�b�N�{�b�N�X�L��̏ꍇ�A�d�|���̍X�V
			this.struct.setUPDATE_WORK_STS_TYP("9");
			this.struct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());

			if ("true".equals(this.struct.getchk_COMPLETE())) {

				AD0090010Struct completeStruct = new AD0090010Struct();
				setStandardItem(completeStruct);
				completeStruct.setUPDATE_WORK_STS_TYP("9");
				completeStruct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());
				completeStruct.setIN_OPR_INST_CD(this.struct.getIN_OPR_INST_CD());
				completeStruct.setPLANT_CD(this.sysPLANT_CD);
				
				//����Ǝw���ԍ����̍Œx��Ɠ��̎擾�i[��Ǝ���]."��Ǝ��э�Ɠ�"�j
				tempList = entity.mT_OPR_RSLT.read(conn, completeStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.struct.getIN_OPR_INST_CD());//��ƌn��d�|.��Ǝw���ԍ�
					return;
				}
				tempStruct = (AD0090010Struct)tempList.get(0);
				completeStruct.setOPR_DATE(tempStruct.getOPR_DATE());
				
				//��ƌn��d�|�X�V����
				tempList = entity.mSelectChkWorkProc.read(conn,this.struct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.struct.getIN_OPR_INST_CD());//��ƌn��d�|.��Ǝw���ԍ�
					return;
				}
				tempStruct = (AD0090010Struct)tempList.get(0);
				if (this.selectStruct.getPROC_MODIFY_COUNT() != null 
						&& !this.selectStruct.getPROC_MODIFY_COUNT().equals(
						tempStruct.getPROC_MODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.struct.getIN_OPR_INST_CD());//��ƌn��d�|.��Ǝw���ԍ�
					return;
				}

				entity.mUpdateWorkProc.update(conn, completeStruct);
				//ModifyCount�̍ăZ�b�g
				tempList = entity.mSelectChkWorkProc.read(conn,this.struct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.struct.getIN_OPR_INST_CD());//��ƌn��d�|.��Ǝw���ԍ�
					return;
				}
				tempStruct = (AD0090010Struct)tempList.get(0);
				this.selectStruct.setPROC_MODIFY_COUNT(tempStruct.getPROC_MODIFY_COUNT());

				//��ƌn�񂪍ŏI�n��̏ꍇ�A�i�ڕʎd�|�X�V����
				if ("1".equals(this.selectStruct.geth_FINAL_PROC_FLG())) {
					
					tempList = entity.mSelectChkWorkItem.read(conn,this.selectStruct);
					if (tempList.isEmpty()) {
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.selectStruct.getWORK_ODR_CD());//�i�ڎd�|.��ƌv��ԍ�
						return;
					}
					tempStruct = (AD0090010Struct)tempList.get(0);
					if (this.selectStruct.getITEM_MODIFY_COUNT() != null 
							&& !this.selectStruct.getITEM_MODIFY_COUNT().equals(
							tempStruct.getITEM_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",this.selectStruct.getWORK_ODR_CD());//�i�ڎd�|.��ƌv��ԍ�
						return;
					}

					entity.mUpdateWorkItem.update(conn, completeStruct);

					//ModifyCount�̍ăZ�b�g
					tempList = entity.mSelectChkWorkItem.read(conn,this.struct);
					if (tempList.isEmpty()) {
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",this.selectStruct.getWORK_ODR_CD());//�i�ڎd�|.��ƌv��ԍ�
						return;
					}
					tempStruct = (AD0090010Struct)tempList.get(0);
					this.struct.setITEM_MODIFY_COUNT(tempStruct.getITEM_MODIFY_COUNT());
				}
			}
			
			//�����o�ɌĂяo��
			BigDecimal bdQty = new BigDecimal("0");
			if (this.struct.getACPT_QTY() != null) {
				bdQty = new BigDecimal(this.struct.getACPT_QTY());
			}
			if (this.struct.getDEFECT_QTY() != null) {
				bdQty = bdQty.add(new BigDecimal(this.struct.getDEFECT_QTY()));
			}
			String sFLG = "0";	//�u��Ɗ����v��
			if (this.struct.getchk_COMPLETE() != null 
					&& "true".equals(this.struct.getchk_COMPLETE())) {
				sFLG = "1";	//�u��Ɗ����v
			}
			if (this.struct.getOPR_CRCT_NO() == null 
					|| this.struct.getOPR_CRCT_NO().length() == 0) {
				this.struct.setOPR_CRCT_NO("0");
			}
			
			/********************
			 * �����o�ɏ����J�n *
			 *******************/
			WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
					this.sysPLANT_CD,
					this.sysUSER_CD,
					this.sp.getProcId());
			WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
			
			// �p�����[�^�̃Z�b�g
			autoIssueParam.m_WORK_ODR_CD = this.selectStruct.getWORK_ODR_CD();
			autoIssueParam.m_WORK_IN_PROC_CD = this.selectStruct.getWORK_IN_PROC_CD();
			autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(this.struct.getPARTIAL_PRD_NO());
			autoIssueParam.m_OPR_RSLT_CRCT_NO = Integer.parseInt(this.struct.getOPR_CRCT_NO());
			autoIssueParam.m_PUCH_ODR_CD = "";
			autoIssueParam.m_ACPT_NO = 0;
			autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
			autoIssueParam.m_RCV_ISSUE_TYP = 2;
			autoIssueParam.m_RCV_ISSUE_DATE = this.struct.getOPR_DATE();
			autoIssueParam.m_RCV_ISSUE_RSLT_NO = bdQty.toString();
			autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(sFLG);
			autoIssueParam.m_PLANT_CD = this.sysPLANT_CD;
			
			AutoIssue autoIssue = new AutoIssue(conn,
					this.sysPLANT_CD,this.sysUSER_CD,this.sp.getProcId());
			
			// �����o�Ɏ��s
			boolean result = autoIssue.AutoIssueOpr(autoIssueParam);

			String[] message;
			if(result){
				// �Ɩ��A���[��������Ώo�͂���B
				for(int i=0; i<autoIssue.getWarnList().size(); i++){
					message = (String[])autoIssue.getWarnList().get(i);
					setWarningMessage(message[0], message[1]);
				}
			}else{
				// �Ɩ��G���[�̏o��
				for(int i=0; i<autoIssue.getErrorList().size(); i++){
					message = (String[])autoIssue.getErrorList().get(i);
					setErrorMessage(message[0], message[1]);
				}
				return;
			}
			
			// Add Start 20140219 huang-lh
			// �V�X�e���p�����[�^�F�@�h�H���ۊǏꏊ�̍݌ɂ��Ǘ�����h�@���@�h�n�m�h�@�ɐݒ肵���ꍇ�A�ȉ��̏������s��
			// �i�ڂ̍H���݌ɂ̊Ǘ����s��
			if ("1".equals(_processManageFlg)) {
				int updFlg = 0;
				updFlg = ItemWorkManager(updFlg);
				
				// �G���[�����ꍇ
				if (updFlg != 0) {
					return;
				}
			}
			// Add End 20140219 huang-lh
			
			//���ɏ����i�ۊǋ�ʓ��o�ɒǉ��j
			if ("1".equals(this.selectStruct.geth_FINAL_PROC_FLG())) {
				//���Ԃ̃`�F�b�N
				String jobOdrNo = this.selectStruct.getJOB_ODR_CD();
				if (jobOdrNo != null) {
					tempList = entity.mSelectJobOdr.read(conn,this.selectStruct);
					if (tempList != null && tempList.size() > 0) {
						tempStruct = (AD0090010Struct)tempList.get(0);
						if (tempStruct.getJOB_ODR_TYP() != null 
								&& "3".equals(tempStruct.getJOB_ODR_TYP())
									&& tempStruct.getITEM_CD().equals(this.selectStruct.getITEM_CD())) {//�ŏ�ʕi�ڂ̏ꍇ
							//�݌ɕ�[����
							jobOdrNo = null;
						}
					}
				}

				CollectNumber collectNum = 
						new CollectNumber(
							CollectNumber.ISSUE_CD,
							this.sysUSER_CD,
							this.sp.getProcId(),
							this.sysPLANT_CD);
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) {
					//�̔Ԍ��ʂ��Ȃ�
					setErrorMessage("ZZ01106");
					setReadStatus(ERROR);
					return;
				}
				
				AD0090010Struct rcvIssueStruct = new AD0090010Struct();
				
				BigDecimal inAcptQty = new BigDecimal(this.struct.getACPT_QTY());
				BigDecimal inDefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
				if (this.selectStruct.getUNIT_QTY_TYP() != null 
						&& "1".equals(this.selectStruct.getUNIT_QTY_TYP())) {
					//�i�ڂ������Ǘ��i�̏ꍇ�A�؏グ���s��
					inAcptQty = inAcptQty.setScale(0,BigDecimal.ROUND_DOWN);
					inDefectQty = inDefectQty.setScale(0,BigDecimal.ROUND_DOWN);
				}
				
				rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);
				rcvIssueStruct.setITEM_CD(this.selectStruct.getITEM_CD());
				rcvIssueStruct.setPLANT_CD(this.sysPLANT_CD);
				rcvIssueStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
				rcvIssueStruct.setWH_CD(this.struct.getWH_CD());
				rcvIssueStruct.setJOB_ODR_CD(jobOdrNo);
				rcvIssueStruct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());
				rcvIssueStruct.setWORK_IN_PROC_CD(this.selectStruct.getWORK_IN_PROC_CD());
				rcvIssueStruct.setRCV_ISSUE_QTY(inAcptQty.toString());
				rcvIssueStruct.setRCV_ISSUE_DATE(this.struct.getOPR_DATE());
				rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");
				rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");
				rcvIssueStruct.setOD_NO(this.struct.getOD_NO());
				rcvIssueStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());
				rcvIssueStruct.setLOT_NO(this.struct.getLOT_NO());
				rcvIssueStruct.setRCV_ISSUE_TYP("1");
				rcvIssueStruct.setCOMPANY_CD(_company_cd);
				if (this.struct.getchk_COMPLETE() != null 
						&& "true".equals(this.struct.getchk_COMPLETE())) {
					rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
				} else {
					rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				}
				rcvIssueStruct.setSTOCK_UPD_TYP("1");

				//��Ǝ��ђ�����
				rcvIssueStruct.setOPR_RSLT_CRCT_NO(this.struct.getOPR_CRCT_NO());  

				// �莝���݌ɐ���������
				rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
				setStandardItem(rcvIssueStruct);

				//�ۊǋ�ʓ��o��
				entity.mInsertRecvIssue.create(conn, rcvIssueStruct);

				//���i�[�p
				AD0090010Struct IdentCardStruct = new AD0090010Struct();
				setStandardItem(IdentCardStruct);
				//���i�[�p�Ƀf�[�^�ۊ�
				IdentCardStruct.setRCV_ISSUE_CTRL_CD(no);//�ۊǋ�ʓ��o�ɔԍ�
				IdentCardStruct.setJOB_ODR_CD(jobOdrNo); //����
				
				// ���ɏ����Ăяo��
				RcvCancel RCan = 
						new RcvCancel(
							conn,
							rcvIssueStruct.getRCV_ISSUE_CTRL_CD(),
							this.sysUSER_CD);
				boolean bRSLT = RCan.execProcess();
				if (!bRSLT) {
					//���ɏ������s �T�[�o�[�G���[
					throw new Exception();
				}
				
				// �V�X�e���p�����[�^�F�h�s�Ǎ݌ɂ��H���Ǘ�����h���h�n�m�h���A�u�s�ǐ��v�����O�ꍇ�A�s�Ǖi���ɂ��s��
				if ("1".equals(_defectManageFlg) && !"0".equals(struct.getDEFECT_QTY())) {
					AD0090010Struct defectInIssueStruct = new AD0090010Struct();
					no = collectNum.getNo();
					if (no == null || no.length() == 0) {
						//�̔Ԍ��ʂ��Ȃ�
						setErrorMessage("ZZ01106");
						setReadStatus(ERROR);
						return;
					}
					
					// ���o�ɊǗ��ԍ�
					defectInIssueStruct.setRCV_ISSUE_CTRL_CD(no);
					//���o�ɋ敪
					defectInIssueStruct.setRCV_ISSUE_TYP("3");
					//�i�ڔԍ�
					defectInIssueStruct.setITEM_CD(this.selectStruct.getITEM_CD());
					//�ۊǋ�R�[�h
					defectInIssueStruct.setWH_CD(this.struct.getWH_CD());
					//����
					defectInIssueStruct.setJOB_ODR_CD(jobOdrNo);
					//���Ԏ}��
					defectInIssueStruct.setJOB_ODR_DETAIL_NO("0");
					//�����
					defectInIssueStruct.setACPT_NO("0");
					//��ƌv��ԍ�
					defectInIssueStruct.setWORK_ODR_CD(selectStruct.getWORK_ODR_CD());
					//�d�|��ƃR�[�h
					defectInIssueStruct.setWORK_IN_PROC_CD(selectStruct.getWORK_IN_PROC_CD());
					//�����
					defectInIssueStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
					//��Ǝ��ђ�����
					defectInIssueStruct.setOPR_RSLT_CRCT_NO("0");
					//�o�Ɏw���ԍ�
					defectInIssueStruct.setISSUE_INST_CD(null);
					//���o�ɐ�
					defectInIssueStruct.setRCV_ISSUE_QTY(struct.getDEFECT_QTY());
					//���o�ɑO�݌ɐ�
					defectInIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
					//���o�ɔN����
					defectInIssueStruct.setRCV_ISSUE_DATE(struct.getOPR_DATE());
					//���o�ɔ����敪
					defectInIssueStruct.setRCV_ISSUE_GNR_TYP("11");
					//�݌ɍX�V�敪
					defectInIssueStruct.setSTOCK_UPD_TYP("2");
					//���o�Ɋ����t���O
					if (this.struct.getchk_COMPLETE() != null 
							&& "true".equals(this.struct.getchk_COMPLETE())) {
						defectInIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
					} else {
						defectInIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
					}
					
					//�I�[�_�f�}���h�ԍ�
					defectInIssueStruct.setOD_NO(selectStruct.getOD_NO());
					//���o�ɒ[��
					defectInIssueStruct.setRCV_ISSUE_ODD_QTY("0");
					//�H��R�[�h
					defectInIssueStruct.setPLANT_CD(selectStruct.getPLANT_CD());
					//�݌Ƀ��b�g�ԍ�
					defectInIssueStruct.setLOT_NO(struct.getLOT_NO());
					defectInIssueStruct.setCOMPANY_CD(_company_cd);
					defectInIssueStruct.setUSER_CD(sysUSER_CD);
					defectInIssueStruct.setUPDATED_PRG_NM(this.sp.getProcId());
					setStandardItem(defectInIssueStruct);
					// �ۊǋ�ʓ��o��
					entity.mInsertRecvIssue.create(conn, defectInIssueStruct);
					IssueProcess IProc = new IssueProcess(conn, no);
					boolean bResult = IProc.execDefectProcess();
					if (!bResult) {
						//���ɏ������s �T�[�o�[�G���[
						throw new Exception();
					}
				}
				
				//�H���Ǘ��i�ځi[�i��].�h�H���Ǘ��i�ڋ敪�h�� 1�F�H���Ǘ��i�ځj�̏ꍇ �i���ɑ��o�Ɂj		
				List manhourTypList = new ArrayList();
				AD0090010Struct manhourTypStruct = null;
				List parentList = new ArrayList();
				AD0090010Struct parentStruct = null;
				List tRlsdPuchOdrList = new ArrayList();
				AD0090010Struct tRlsdPuchOdrStruct = null;
				List tWorkInProcByProcList = new ArrayList();
				AD0090010Struct tWorkInProcByProcStruct = null;
				
				manhourTypStruct = null;
				List selelctRcvIssueList = new ArrayList();
				AD0090010Struct selectRcvIssueStruct = new AD0090010Struct();
				
				boolean bFlg = false;

				String strPuchOdrCd = null;		// �o�^�p�����ԍ�
				String strWorkOdrCd = null;		// �o�^�p��ƌv��ԍ�
				String strWorkInProcCd = null;	// �o�^�p�d�|��ƃR�[�h

				manhourTypList = entity.mSelectItem.read(conn,this.selectStruct);

				if (!manhourTypList.isEmpty()) {
					manhourTypStruct = (AD0090010Struct)manhourTypList.get(0);
				}

				// [�i��].�H���Ǘ��i�ڋ敪 = 1:�H���Ǘ��i�ڂ̏ꍇ
				if ("1".equals(manhourTypStruct.getMANHOUR_TYP())){

					collectNum = 
						new CollectNumber(
							CollectNumber.ISSUE_CD,
							this.sysUSER_CD,
							this.sp.getProcId(),
							this.sysPLANT_CD);
					no = collectNum.getNo();
					if (no == null || no.length() == 0) {
						//�̔Ԍ��ʂ��Ȃ�
						setErrorMessage("ZZ01106");
						setReadStatus(ERROR);
						return;
					}
					
					// �e�i�ڂ̏��H���ɏo�ɂ��邽�߂̃f�[�^�ݒ�
					parentList = entity.mSELECT_PARENT.read(conn,this.selectStruct);
					if ( !parentList.isEmpty()) {
						parentStruct = (AD0090010Struct)parentList.get(0);
						// �e�i�ڂ��[���i�ڂ̏ꍇ�A����ɏ�̕i�ڂ̃I�[�_�f�}���h�ԍ����擾����
						if ( "8".equals(parentStruct.getPARENT_MRP_ODR_TYP())){
							parentList = new ArrayList();
							parentList = entity.mSELECT_DUMMY_PARENT.read(conn,parentStruct);
							if ( !parentList.isEmpty()){
								parentStruct = null;
								parentStruct = (AD0090010Struct)parentList.get(0);
							}
						}

						if ( !parentList.isEmpty()){
							// �e�i�ڂ�����̏ꍇ
							if ( "1".equals(parentStruct.getPARENT_OUTSIDE_TYP())){
								tWorkInProcByProcList = entity.mSELECT_T_WORK_IN_PROC_BY_PROC.read(conn,parentStruct);
								if ( !tWorkInProcByProcList.isEmpty()){
									tWorkInProcByProcStruct = (AD0090010Struct)tWorkInProcByProcList.get(0);
									// ��ƌv��ԍ��ݒ�
									strWorkOdrCd = tWorkInProcByProcStruct.getPARENT_WORK_ODR_CD();

									// ��Ǝw���ԍ��ݒ�
									strWorkInProcCd = tWorkInProcByProcStruct.getPARENT_WORK_IN_PROC_CD();
								}
							}
							// �e�i�ڂ��O��̏ꍇ
							if ( "2".equals(parentStruct.getPARENT_OUTSIDE_TYP())){
								tRlsdPuchOdrList = entity.mSELECT_T_RLSD_PUCH_ODR.read(conn,parentStruct);
								if ( !tRlsdPuchOdrList.isEmpty()){
									tRlsdPuchOdrStruct = (AD0090010Struct)tRlsdPuchOdrList.get(0);
									// �����ԍ��ݒ�
									strPuchOdrCd = tRlsdPuchOdrStruct.getPARENT_PUCH_ODR_CD();
								}
							}
						}
					}

				    // ���o�ɐ����}�C�i�X�ɂ���
					BigDecimal minusOne = new BigDecimal("-1");
					inAcptQty = inAcptQty.multiply(minusOne);

					AD0090010Struct outIssueStruct = new AD0090010Struct();
					setStandardItem(outIssueStruct);
					outIssueStruct.setPUCH_ODR_CD(strPuchOdrCd);                          //�����ԍ�
					outIssueStruct.setWORK_ODR_CD(strWorkOdrCd);                          //��ƌv��ԍ�
					outIssueStruct.setWORK_IN_PROC_CD(strWorkInProcCd);                   //�d�|��ƃR�[�h
					outIssueStruct.setRCV_ISSUE_CTRL_CD(no);                              //���o�ɊǗ��ԍ�
					outIssueStruct.setITEM_CD(this.selectStruct.getITEM_CD());           //�i�ڔԍ�
					outIssueStruct.setPLANT_CD(this.sysPLANT_CD);                         //�H��R�[�h
					outIssueStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());    //�����
					outIssueStruct.setWH_CD(this.struct.getWH_CD());                     //�ۊǋ�R�[�h
					outIssueStruct.setJOB_ODR_CD(jobOdrNo);                              //����
					outIssueStruct.setRCV_ISSUE_QTY(inAcptQty.toString());               //���o�ɐ�
					outIssueStruct.setRCV_ISSUE_DATE(this.struct.getOPR_DATE());        //���o�ɔN����
					outIssueStruct.setRCV_ISSUE_GNR_TYP("21");                           //���o�ɔ����敪
					outIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");                          //���o�ɒ[��
					outIssueStruct.setOD_NO(this.selectStruct.getOD_NO());              //�I�[�_�f�}���h�ԍ�
					outIssueStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());        //���[�J���b�g�ԍ�
					outIssueStruct.setLOT_NO(this.struct.getLOT_NO());                  //�݌Ƀ��b�g�ԍ�
					outIssueStruct.setRCV_ISSUE_TYP("2");                                //���o�ɋ敪
					outIssueStruct.setCOMPANY_CD(_company_cd);                           //��ЃR�[�h
					if (this.struct.getchk_COMPLETE() != null 
							&& "true".equals(this.struct.getchk_COMPLETE())) {
						outIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");                     //���o�Ɋ����t���O
					} else {
						outIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
					}
					outIssueStruct.setSTOCK_UPD_TYP("1");                              //�݌ɍX�V�敪

					//��Ǝ��ђ�����
					outIssueStruct.setOPR_RSLT_CRCT_NO(this.struct.getOPR_CRCT_NO());  

					// �ޔ�p�莝���݌ɐ���������
					outIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");

					//�ۊǋ�ʓ��o��
					entity.mINSERT_RCV_ISSUE2.create(conn, outIssueStruct);

					/* �o�Ɏ������START */
					/* [T_RCV_ISSUE]�Ǎ� */
					selelctRcvIssueList = entity.mSELECT_CHECK_T_RCV_ISSUE.read(conn,outIssueStruct);
					if (selelctRcvIssueList.isEmpty()) {
						bFlg = true;
						bRSLT = false;
					}else{
						selectRcvIssueStruct = (AD0090010Struct)selelctRcvIssueList.get(0);
					}

					/* �G���[�`�F�b�N */
					// ���o�ɋ敪��"2"(�o��)�łȂ�
					if(selectRcvIssueStruct.getRCV_ISSUE_TYP()!=null
							&& !selectRcvIssueStruct.getRCV_ISSUE_TYP().equals("2")){
						bFlg = true;
						bRSLT = false;
					}

					// ���o�ɔ����敪��"21"(�ʏ�o��)�łȂ�
					if(!bFlg
						&& selectRcvIssueStruct.getRCV_ISSUE_GNR_TYP()!=null 
						&& !selectRcvIssueStruct.getRCV_ISSUE_GNR_TYP().equals("21")){
						bFlg = true;
						bRSLT = false;
					}

					// �o�ɏ����Ăяo��
					if(!bFlg){
						IssueProcess IProc = new IssueProcess(conn,selectRcvIssueStruct.getRCV_ISSUE_CTRL_CD());
						bRSLT = IProc.execProcess();
						if( !bRSLT ){
							bFlg = true;
							bRSLT = false;
						}
					}

					// �o�Ɏ������
					// �O��o�Ɏ��т̌���
					if(!bFlg){
						// [�ۊǋ�ʓ��o��]."��Ǝ��ђ�����"��1�ȏ�̎�
						// ���o�ɂ�������ꍇ�͕K��1�ȏ�ł���
						if( selectRcvIssueStruct.getOPR_RSLT_CRCT_NO()!=null
								&& selectRcvIssueStruct.getOPR_RSLT_CRCT_NO().compareTo("1")>=0){

							selelctRcvIssueList = new ArrayList();
							selelctRcvIssueList = entity.mSELECT_T_RCV_ISSUE.read(conn,selectRcvIssueStruct);
							if (selelctRcvIssueList.isEmpty()) {
								bFlg = true;
								bRSLT = false;
							}else{
								selectRcvIssueStruct = new AD0090010Struct();
								selectRcvIssueStruct = (AD0090010Struct)selelctRcvIssueList.get(0);
							}
						}else{
							bFlg = true;
						}
					}

					if(!bFlg){
						//�ۊǋ�ʓ��o�ɂւ̒ǉ�
						BigDecimal bQty = new BigDecimal(selectRcvIssueStruct.getRCV_ISSUE_QTY());
						selectRcvIssueStruct.setRCV_ISSUE_QTY(bQty.negate().toString());

						collectNum = 
							new CollectNumber(
								CollectNumber.ISSUE_CD,
								this.sysUSER_CD,
								this.sp.getProcId(),
								this.sysPLANT_CD);
						no = collectNum.getNo();

						selectRcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);		//�̔Ԃ��������
						if (this.struct.getchk_COMPLETE() != null 
								&& "true".equals(this.struct.getchk_COMPLETE())) {
							selectRcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
						} else {
							selectRcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
						}
						selectRcvIssueStruct.setCOMPANY_CD(_company_cd);//��ЃR�[�h
						entity.mINSERT_T_RCV_ISSUE.create(conn,selectRcvIssueStruct);

						// �o�Ɏ�������Ăяo��
						IssueProcess IProc = new IssueProcess(conn,selectRcvIssueStruct.getRCV_ISSUE_CTRL_CD());
						bRSLT = IProc.execProcess();
					}

					if (!bRSLT) {
						//�o�ɏ������s �T�[�o�[�G���[
						throw new Exception();
					}
				}
				
				//[���i�[]�̒ǉ�
				//�Ǖi�����O�ȉ��̏ꍇ�͌��i�[�͍쐬���Ȃ�
				if (Calculate.compare(this.struct.getACPT_QTY(), "0") > 0) {

					//���i�[�A�N�e�B�u�̏ꍇ�A���i�[�̓o�^����
					if ("1".equals(_outputFlg)) {

						//���i�[�Ǘ��ԍ��̐V�K�̔�
						AD0090010Struct GetIdentCardCtlNoStruct = new AD0090010Struct();

						List list_Get = entity.mselectGetIdentCardCtlNo.read(conn, GetIdentCardCtlNoStruct);

						GetIdentCardCtlNoStruct = (AD0090010Struct) list_Get.get(0);

						AD0090010Struct InsOprRsltStruct = new AD0090010Struct();

						InsOprRsltStruct.setSEL_OPR_INST_CD(this.struct.getIN_OPR_INST_CD());
						InsOprRsltStruct.setSEL_PARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());

						List list_temp = entity.mSelectOprRsltForPrint.read(conn, InsOprRsltStruct);

						//��Ǝ��т̌������ʂ̃`�F�b�N
						if (list_temp.size()==0||list_temp.isEmpty()){
							setErrorMessage("ZZ11001");
							return;
						}else{
							//��Ǝ��т̌������ʂ��i�[����
							InsOprRsltStruct = (AD0090010Struct) list_temp.get(0);
							IdentCardStruct.setINS_IDENT_CARD_CTL_NO(GetIdentCardCtlNoStruct.getGET_IDENT_CARD_CTL_NO());
							IdentCardStruct.setINS_OPR_INST_CD(InsOprRsltStruct.getSEL_OPR_INST_CD());
							IdentCardStruct.setINS_PARTIAL_PRD_NO(InsOprRsltStruct.getSEL_PARTIAL_PRD_NO());
							IdentCardStruct.setINS_ITEM_CD(InsOprRsltStruct.getSEL_ITEM_CD());
							IdentCardStruct.setINS_JOB_ODR_CD(rcvIssueStruct.getJOB_ODR_CD());
							IdentCardStruct.setINS_RCV_ISSUE_CTRL_CD(rcvIssueStruct.getRCV_ISSUE_CTRL_CD());
							IdentCardStruct.setINS_FIRST_IDENT_CARD_QTY(InsOprRsltStruct.getSEL_ACPT_QTY());
							IdentCardStruct.setINS_IDENT_CARD_QTY(InsOprRsltStruct.getSEL_ACPT_QTY());
							IdentCardStruct.setINS_OPR_DATE(InsOprRsltStruct.getSEL_OPR_DATE());
							IdentCardStruct.setINS_PKG_UNIT_QTY(InsOprRsltStruct.getSEL_PKG_UNIT_QTY());
							IdentCardStruct.setINS_PLANT_CD(InsOprRsltStruct.getSEL_PLANT_CD());
							IdentCardStruct.setINS_WS_CD(InsOprRsltStruct.getSEL_WS_CD());
							IdentCardStruct.setLOT_NO(InsOprRsltStruct.getLOT_NO());
						}

						// ���i�[�̓o�^
						entity.mInsertIdentCard.create(conn,IdentCardStruct);
					}
				}	
			}
			
			//�s�Ǘ��R�̓o�^
			defectStruct = new AD0090010Struct();
			setStandardItem(defectStruct);
			this.defectStruct.setOPR_INST_CD(this.struct.getIN_OPR_INST_CD());
			this.defectStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
			this.defectStruct.setPLANT_CD(this.sysPLANT_CD);

			List defectCauseCdList = struct.getList_l_DEFECT_CAUSE_CD();
			List defectQtyList = struct.getList_l_DEFECT_QTY();
			List defectCommentList = struct.getList_l_DEFECT_COMMENT();

			for (int i = 0; i < defectCauseCdList.size(); i++) {
				String defectCauseCd = (String) defectCauseCdList.get(i);
				if ("0".equals(defectCauseCd)) {
					continue;
				}
				String defectInspcQty = (String) defectQtyList.get(i);
				String defectComment = (String) defectCommentList.get(i);

				this.defectStruct.setl_DEFECT_CAUSE_CD(defectCauseCd);
				this.defectStruct.setl_DEFECT_QTY(defectInspcQty);
				this.defectStruct.setl_DEFECT_COMMENT(defectComment);

				entity.mInsertDefect.create(conn, this.defectStruct);
			}

			if(StringUtil.Validate(this.selectStruct.getJOB_ODR_CD()) &&
					"true".equals(struct.getchk_COMPLETE())){
				// �����Ϗo�Ɏc�������ԍ݌Ɂi�莝�݌Ɂj�̏ꍇ
				// ���Ɗ�������`�F�b�N����Ă��鎞�̂݃`�F�b�N
				if(!(new IssueRemain(conn)).isEnoughAlcdQty(getsysPLANT_CD(),
						this.selectStruct.getITEM_CD(), this.selectStruct.getJOB_ODR_CD(),
						_JOB_ODR_DETAIL_NO)){
					setWarningMessage("AD60001");
				}
			}
			
		//�ŏI�n��t���O = 1(�ŏI�n��)�̏ꍇ
		if("1".equals(selectStruct.getLOT_CTRL_FLG()) && "1".equals(selectStruct.getFINAL_PROC_FLG())){
			
			//���b�g�Ǘ��̍X�V����
			entity.mT_LOT_CTRL.update(conn,this.struct);
		}
		
		conn.commit();
		
		//�q�i�ڈꊇ�X�V
		if("true".equals(struct.getchk_CHILD_RSLTUPDATE())){
			
			//�o�Ɏw�����X�g�擾
			this.setIssueList();
			
			if (!this.issueList.isEmpty()) {
				
				ChildRsltUpdate();	
			}

			if(0 != norCount || 0 != errCount){
				setInformationMessage("AD00507",String.valueOf(norCount),String.valueOf(errCount));
				setInfoSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��Ǝw���ԍ�
				setInfoSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", selectStruct.geth_ISSUE_INST_CD());					
			}
		}
		
		//[���i�[]�̏o��
		if("true".equals(struct.getchk_OUTPUT())){
			//�ŏI�n��̎��т̏ꍇ �Ɓ@�Ǖi�������@�O�̏ꍇ�̂݁@���i�[�͈������
			if (Double.parseDouble(this.struct.getACPT_QTY()) > 0){
				IdentCardOutPut();
			}	
		}
		
		if("true".equals(struct.getchk_COMPLETE())){
			this.selectStruct.setWORK_STS_TYP("9");
			setWarningMessage("AD00090");
			setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//��ƌn��ʎd�|.��Ǝw���ԍ�
		}
		
		structSave();
		getsaveStruct();

		}catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ApsComException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * ���������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCancelComplete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");
			//{{user_implement_dev:<controlCancelComplete>
		try {
			//���ی����̒��߂��������Ă�����t�`�F�b�N
			if(getSysParameter() == false){
				//���ی����Ǘ��p�����[�^�̑Ώ۔N����
				BigDecimal ProcExecDate = getProcExecDate();
				if(null != ProcExecDate){
					boolean b = true;
					// ��ʓ��͔N����
					BigDecimal input = new BigDecimal(struct.geth_OPR_DATE().substring(0,4) + struct.geth_OPR_DATE().substring(5,7));
					b = compDecimal(input,ProcExecDate);
					if(!b){
						setErrorMessage("AE00177");
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
						return;
					}
				}
			}
			
			//Main ����
			List tempList = new ArrayList();
			tempList = entity.mSelect.read(conn, struct);
			
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//�n��ʎd�|.��Ǝw���ԍ�
				setReadStatus(NOT_FOUND);
				return;
			}
			this.selectStruct = new AD0090010Struct();
			this.selectStruct = (AD0090010Struct)tempList.get(0);
			setStandardItem(selectStruct);
			this.selectStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());

			tempList = entity.mSelectChkWorkProc.read(conn,this.selectStruct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.selectStruct.getOPR_INST_CD());//��ƌn��d�|.��Ǝw���ԍ�
				return;
			}
			AD0090010Struct tempStruct = (AD0090010Struct)tempList.get(0);
			if (this.selectStruct.getPROC_MODIFY_COUNT() != null 
					&& !this.selectStruct.getPROC_MODIFY_COUNT().equals(
					tempStruct.getPROC_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.selectStruct.getOPR_INST_CD());//��ƌn��d�|.��Ǝw���ԍ�
				return;
			}
			
			this.selectStruct.setUPDATE_WORK_STS_TYP("2");
			this.selectStruct.setOPR_DATE(null);
			//��ƌn��ʎd�|�X�V����
			entity.mUpdateWorkProc.update(conn,this.selectStruct);
			
			//�f�}���h���������i���v�ʁj
			CommonOd od = 
					new CommonOd(
						conn,
						this.sysPLANT_CD,
						this.sysUSER_CD,
						this.sp.getProcId());
			od.changeDemandForCancel(
					this.selectStruct.getWORK_ODR_CD(),
					this.selectStruct.getWORK_IN_PROC_CD());
			
			if ("1".equals(this.selectStruct.getFINAL_PROC_FLG())) {
				//��ƌn�񂪍ŏI�n��̏ꍇ�A�i�ڕʎd�|�X�V����
				tempList = entity.mSelectChkWorkItem.read(conn,this.selectStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", this.selectStruct.getOPR_INST_CD());//�i�ڎd�|.��Ǝw���ԍ�
					return;
				}
				tempStruct = (AD0090010Struct)tempList.get(0);
				if(this.selectStruct.getITEM_MODIFY_COUNT() != null 
						&& !selectStruct.getITEM_MODIFY_COUNT().equals(
						tempStruct.getITEM_MODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", this.selectStruct.getOPR_INST_CD());//�i�ڎd�|.��Ǝw���ԍ�
					return;
				}
			
				//�i�ڕʎd�|�X�V����
				entity.mUpdateWorkItem.update(conn,this.selectStruct);
			
				//�I�[�_��񊮗������i���v�ʁj
				od.changeOrderForCancel(this.selectStruct.getOD_NO(),-1);

				//�H���Ǘ��i�̏ꍇ
				List manhourTypList = new ArrayList();
				AD0090010Struct manhourTypStruct = null;
				AD0090010Struct tOdUpdateStruct = new AD0090010Struct();

				manhourTypList = entity.mSelectItem.read(conn,this.selectStruct);

				if (!manhourTypList.isEmpty()) {
					manhourTypStruct = (AD0090010Struct)manhourTypList.get(0);
				}
				// [�i��].�H���Ǘ��i�ڋ敪 = 1:�H���Ǘ��i�ڂ̏ꍇ
				if (manhourTypStruct.getMANHOUR_TYP() != null
						&& "1".equals(manhourTypStruct.getMANHOUR_TYP())){
					tOdUpdateStruct.setDM_STS_TYP("2");
					tOdUpdateStruct.setISSUE_CMPLT_DATE(null);
					tOdUpdateStruct.setOD_NO(this.selectStruct.getOD_NO());
					tOdUpdateStruct.setUSER_CD(this.sysUSER_CD);
					tOdUpdateStruct.setUPDATED_PRG_NM(this.sp.getProcId());
					// �f�}���h�����i���v�ʁj
					entity.mUPDATE_T_OD.update(conn,tOdUpdateStruct);
				}
			}
			
			conn.commit();
			
			//�Č���
			controlSelect();
			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ApsComException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}
                //}}user_implement_dev:<controlCancelComplete>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");

		return;
	}

	/**
	 * �����e�i���X�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlMainTain() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlMainTain");
			//{{user_implement_dev:<controlMainTain>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlMainTain>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlMainTain");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			listClear();
			_outputFlg = _initOutputFlg;
			_lastProc = true;
			struct.setchk_CHILD_RSLTUPDATE("true");
			struct.setchk_COMPLETE("true");
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrintShow() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlPrintShow");
			//{{user_implement_dev:<controlPrintShow>
		
		// ��Ɗ����̃��[�j���O���b�Z�[�W�\������
		struct.setIN_OPR_INST_CD(_keepOprInstCd);
		struct.setDOWNLOAD_FILE(_downloadFile);
		struct.setPARTIAL_PRD_NO(_keepPartialPrdNo);
		structSave();
		_printFlg = "0";
		saveStruct.RemakeMessage();
		msgStruct = saveStruct;
                //}}user_implement_dev:<controlPrintShow>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlPrintShow");

		return;
	}

	/**
	 * ���b�g�Ǘ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLotInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");
			//{{user_implement_dev:<controlLotInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlLotInsert>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			// �R���{�{�b�N�X�f�[�^�𕔕i���擾
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_oprTimeUnitTtpStruct = cdac.getData("OPR_TIME_UNIT_TYP");
	         DEFECT_CAUSE_CD = cdac.getData("DEFECT_CAUSE_CD_INNER");
	         
			cdac.setConnection(null);

			//�����l�̐ݒ�
			mainInitialize();

			GetTimeCtrl();
			setBussinessOprDate();
			lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			//���i�[�o�̓`�F�b�N�{�b�N�X���䏈��
			setIdentCard();
			
			try {
				zeroSet(struct);
			} catch (Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
			int maxLine = 0;
			maxLine = sp.getMaxLine(conn,10);//�s�Ǘ��R�\������
			if (maxLine > 0) {
				DISPLAY_NUMBER = maxLine;
			}
			
			PrivateConfig privateConfig = new PrivateConfig(conn);
			
	 		// �V�X�e���p�����[�^�u�H���ۊǏꏊ�̍݌ɂ��Ǘ��v���擾����
			
	 		_processManageFlg  = privateConfig.getString("PROCESS_MANAGE_FLG");
	 		if(isNull(_processManageFlg)) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage("AD00231");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException eUse = new ExpjException(emsg);
				throw eUse;
	 		} else {
	 			if(!"0".equals(_processManageFlg) && !"1".equals(_processManageFlg)) {
	 				setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage("AD00231");
					sysLog.severe(emsg, getsysUSER_CD());
					ExpjException eUse = new ExpjException(emsg);
					throw eUse;
	 			}
	 		}
	 		
	 		// �V�X�e���p�����[�^�u�s�Ǎ݌ɂ��H���Ǘ��v���擾����
	 		_defectManageFlg  = privateConfig.getString("DEFECT_MANAGE_FLG");
	 		if(isNull(_defectManageFlg)) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage("AD00232");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException eUse = new ExpjException(emsg);
				throw eUse;
	 		} else {
	 			if(!"0".equals(_defectManageFlg) && !"1".equals(_defectManageFlg)) {
	 				setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage("AD00232");
					sysLog.severe(emsg, getsysUSER_CD());
					ExpjException eUse = new ExpjException(emsg);
					throw eUse;
	 			}
	 		}
			
			listClear();
			setReadStatus(INITIAL);
			// ��ЃR�[�h�擾
			_company_cd = SystemInformation.getSysMyCompanyCd();

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ComboException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Detail") ) {
				controlDetail();
			} else if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("CancelComplete") ) {
				controlCancelComplete();
			} else if( button.equals("MainTain") ) {
				controlMainTain();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("PrintShow") ) {
				controlPrintShow();
			} else if( button.equals("LotInsert") ) {
				controlLotInsert();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			if(lotCtrlFlg){
				struct.seth_SYS_LOT_CTRL_FLG("true");
			}else{
				struct.seth_SYS_LOT_CTRL_FLG("false");
			}

			//�R���{�{�b�N�X�̃Z�b�g
			struct.setList_OPR_TIME_UNIT_TYP_val(_oprTimeUnitTtpStruct.getValList());
			struct.setList_OPR_TIME_UNIT_TYP_name(_oprTimeUnitTtpStruct.getExplanList());
	        struct.setList_l_DEFECT_CAUSE_CD_val(DEFECT_CAUSE_CD.getValList());
	        struct.setList_l_DEFECT_CAUSE_CD_name(DEFECT_CAUSE_CD.getExplanList());
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
//			throw new FoundationException("AD0090010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0090010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0090010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0090010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0090010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0090010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0090010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0090010Entity entity;
	protected AD0090010Struct struct;
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

		entity = new AD0090010Entity();
		struct = new AD0090010Struct();

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
	 * AD0090010�N���X�̕W���R���X�g���N�^
	 */
	public AD0090010Control() throws BusinessProcessException, FoundationException
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
				AD0090010Struct key = (AD0090010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("chk_COMPLETE") && key.getchk_COMPLETE() != null) {
					msgKey.setKeyValue("chk_COMPLETE", key.getchk_COMPLETE());
				}
				if(msgKeyType.containsKeyColumn("OPRATION_TIME") && key.getOPRATION_TIME() != null) {
					msgKey.setKeyValue("OPRATION_TIME", key.getOPRATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("chk_OUTPUT") && key.getchk_OUTPUT() != null) {
					msgKey.setKeyValue("chk_OUTPUT", key.getchk_OUTPUT());
				}
				if(msgKeyType.containsKeyColumn("d1_STOCK_UNIT") && key.getd1_STOCK_UNIT() != null) {
					msgKey.setKeyValue("d1_STOCK_UNIT", key.getd1_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_name") && key.getOPR_TIME_UNIT_TYP_name() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP_name", key.getOPR_TIME_UNIT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_val") && key.getOPR_TIME_UNIT_TYP_val() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP_val", key.getOPR_TIME_UNIT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_name") && key.getl_DEFECT_CAUSE_CD_name() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD_name", key.getl_DEFECT_CAUSE_CD_name());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_val") && key.getl_DEFECT_CAUSE_CD_val() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD_val", key.getl_DEFECT_CAUSE_CD_val());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("h_FINAL_PROC_FLG") && key.geth_FINAL_PROC_FLG() != null) {
					msgKey.setKeyValue("h_FINAL_PROC_FLG", key.geth_FINAL_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG") && key.geth_SYS_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_SYS_LOT_CTRL_FLG", key.geth_SYS_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("chk_CHILD_RSLTUPDATE") && key.getchk_CHILD_RSLTUPDATE() != null) {
					msgKey.setKeyValue("chk_CHILD_RSLTUPDATE", key.getchk_CHILD_RSLTUPDATE());
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
				if(msgKeyType.containsKeyColumn("h_PROCESS_MANAGE_FLG") && key.geth_PROCESS_MANAGE_FLG() != null) {
					msgKey.setKeyValue("h_PROCESS_MANAGE_FLG", key.geth_PROCESS_MANAGE_FLG());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY") && key.getTEMP_PLAN_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLAN_QTY", key.getTEMP_PLAN_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY") && key.getTEMP_USEOVER_QTY() != null) {
					msgKey.setKeyValue("TEMP_USEOVER_QTY", key.getTEMP_USEOVER_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY") && key.getTEMP_PLANOUT_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLANOUT_QTY", key.getTEMP_PLANOUT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USE_QTY") && key.getTEMP_USE_QTY() != null) {
					msgKey.setKeyValue("TEMP_USE_QTY", key.getTEMP_USE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_PARTIAL_PRD_NO") && key.getl_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("l_PARTIAL_PRD_NO", key.getl_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("FIRST_WORK_FLG") && key.getFIRST_WORK_FLG() != null) {
					msgKey.setKeyValue("FIRST_WORK_FLG", key.getFIRST_WORK_FLG());
				}
				if(msgKeyType.containsKeyColumn("USE_LOT_NO") && key.getUSE_LOT_NO() != null) {
					msgKey.setKeyValue("USE_LOT_NO", key.getUSE_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("USE_ACPT_QTY") && key.getUSE_ACPT_QTY() != null) {
					msgKey.setKeyValue("USE_ACPT_QTY", key.getUSE_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("USE_DEFECT_QTY") && key.getUSE_DEFECT_QTY() != null) {
					msgKey.setKeyValue("USE_DEFECT_QTY", key.getUSE_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_CD") && key.getIN_OPR_INST_CD() != null) {
					msgKey.setKeyValue("IN_OPR_INST_CD", key.getIN_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_NO") && key.getPROC_NO() != null) {
					msgKey.setKeyValue("PROC_NO", key.getPROC_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_MODIFY_COUNT") && key.getPROC_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("PROC_MODIFY_COUNT", key.getPROC_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("FINAL_PROC_FLG") && key.getFINAL_PROC_FLG() != null) {
					msgKey.setKeyValue("FINAL_PROC_FLG", key.getFINAL_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY") && key.getSUM_ACPT_QTY() != null) {
					msgKey.setKeyValue("SUM_ACPT_QTY", key.getSUM_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_DEFECT_QTY") && key.getSUM_DEFECT_QTY() != null) {
					msgKey.setKeyValue("SUM_DEFECT_QTY", key.getSUM_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_MODIFY_COUNT") && key.getITEM_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("ITEM_MODIFY_COUNT", key.getITEM_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_DATE") && key.geth_OPR_DATE() != null) {
					msgKey.setKeyValue("h_OPR_DATE", key.geth_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_TIME") && key.geth_BUSINESS_OPR_TIME() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_TIME", key.geth_BUSINESS_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("FORM_SET_ITEM_CD") && key.getFORM_SET_ITEM_CD() != null) {
					msgKey.setKeyValue("FORM_SET_ITEM_CD", key.getFORM_SET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON") && key.getOPR_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OPR_RSLT_PERSON", key.getOPR_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT") && key.getOPR_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OPR_RSLT_COMMENT", key.getOPR_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP") && key.getOPR_TIME_UNIT_TYP() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP", key.getOPR_TIME_UNIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME") && key.getPRE_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("PRE_ARRANGEMENT_TIME", key.getPRE_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME") && key.getPOST_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("POST_ARRANGEMENT_TIME", key.getPOST_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_TIME") && key.getCESSATION_TIME() != null) {
					msgKey.setKeyValue("CESSATION_TIME", key.getCESSATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_CAUSE") && key.getCESSATION_CAUSE() != null) {
					msgKey.setKeyValue("CESSATION_CAUSE", key.getCESSATION_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD") && key.getOUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_CD", key.getOUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_CRCT_NO") && key.getOPR_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_CRCT_NO", key.getOPR_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("UPDATE_WORK_STS_TYP") && key.getUPDATE_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("UPDATE_WORK_STS_TYP", key.getUPDATE_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD") && key.geth_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_CD", key.geth_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY") && key.getSAVE_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SAVE_STOCK_ON_HAND_QTY", key.getSAVE_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY") && key.getRCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_ODD_QTY", key.getRCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP") && key.getPARENT_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("PARENT_OUTSIDE_TYP", key.getPARENT_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_MRP_ODR_TYP") && key.getPARENT_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("PARENT_MRP_ODR_TYP", key.getPARENT_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_WORK_ODR_CD") && key.getPARENT_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("PARENT_WORK_ODR_CD", key.getPARENT_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_WORK_IN_PROC_CD") && key.getPARENT_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("PARENT_WORK_IN_PROC_CD", key.getPARENT_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_PUCH_ODR_CD") && key.getPARENT_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PARENT_PUCH_ODR_CD", key.getPARENT_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM") && key.getUPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("UPDATED_PRG_NM", key.getUPDATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("GET_IDENT_CARD_CTL_NO") && key.getGET_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("GET_IDENT_CARD_CTL_NO", key.getGET_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("SEL_OPR_INST_CD") && key.getSEL_OPR_INST_CD() != null) {
					msgKey.setKeyValue("SEL_OPR_INST_CD", key.getSEL_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_PARTIAL_PRD_NO") && key.getSEL_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("SEL_PARTIAL_PRD_NO", key.getSEL_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("SEL_ITEM_CD") && key.getSEL_ITEM_CD() != null) {
					msgKey.setKeyValue("SEL_ITEM_CD", key.getSEL_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_ACPT_QTY") && key.getSEL_ACPT_QTY() != null) {
					msgKey.setKeyValue("SEL_ACPT_QTY", key.getSEL_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SEL_OPR_DATE") && key.getSEL_OPR_DATE() != null) {
					msgKey.setKeyValue("SEL_OPR_DATE", key.getSEL_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("SEL_PKG_UNIT_QTY") && key.getSEL_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("SEL_PKG_UNIT_QTY", key.getSEL_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SEL_PLANT_CD") && key.getSEL_PLANT_CD() != null) {
					msgKey.setKeyValue("SEL_PLANT_CD", key.getSEL_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_WS_CD") && key.getSEL_WS_CD() != null) {
					msgKey.setKeyValue("SEL_WS_CD", key.getSEL_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_CTL_NO") && key.getINS_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("INS_IDENT_CARD_CTL_NO", key.getINS_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_OPR_INST_CD") && key.getINS_OPR_INST_CD() != null) {
					msgKey.setKeyValue("INS_OPR_INST_CD", key.getINS_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_PARTIAL_PRD_NO") && key.getINS_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("INS_PARTIAL_PRD_NO", key.getINS_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_RCV_ISSUE_CTRL_CD") && key.getINS_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("INS_RCV_ISSUE_CTRL_CD", key.getINS_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_ITEM_CD") && key.getINS_ITEM_CD() != null) {
					msgKey.setKeyValue("INS_ITEM_CD", key.getINS_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_JOB_ODR_CD") && key.getINS_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("INS_JOB_ODR_CD", key.getINS_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_FIRST_IDENT_CARD_QTY") && key.getINS_FIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("INS_FIRST_IDENT_CARD_QTY", key.getINS_FIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_QTY") && key.getINS_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("INS_IDENT_CARD_QTY", key.getINS_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_OPR_DATE") && key.getINS_OPR_DATE() != null) {
					msgKey.setKeyValue("INS_OPR_DATE", key.getINS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("INS_PKG_UNIT_QTY") && key.getINS_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("INS_PKG_UNIT_QTY", key.getINS_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_PLANT_CD") && key.getINS_PLANT_CD() != null) {
					msgKey.setKeyValue("INS_PLANT_CD", key.getINS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_WS_CD") && key.getINS_WS_CD() != null) {
					msgKey.setKeyValue("INS_WS_CD", key.getINS_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD") && key.getl_DEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD", key.getl_DEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_QTY") && key.getl_DEFECT_QTY() != null) {
					msgKey.setKeyValue("l_DEFECT_QTY", key.getl_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_COMMENT") && key.getl_DEFECT_COMMENT() != null) {
					msgKey.setKeyValue("l_DEFECT_COMMENT", key.getl_DEFECT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTRL_SEQ_NO") && key.getRSLT_CTRL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTRL_SEQ_NO", key.getRSLT_CTRL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY") && key.getSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY", key.getSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY_sum") && key.getSUPPLIED_ISSUE_QTY_sum() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY_sum", key.getSUPPLIED_ISSUE_QTY_sum());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_DENOMINATOR") && key.geth_ISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_UNIT_DENOMINATOR", key.geth_ISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_NUMERATOR") && key.geth_ISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_UNIT_NUMERATOR", key.geth_ISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("count_RCV_ISSUE") && key.getcount_RCV_ISSUE() != null) {
					msgKey.setKeyValue("count_RCV_ISSUE", key.getcount_RCV_ISSUE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SPENT_QTY") && key.getSPENT_QTY() != null) {
					msgKey.setKeyValue("SPENT_QTY", key.getSPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("NEXTVAL") && key.getNEXTVAL() != null) {
					msgKey.setKeyValue("NEXTVAL", key.getNEXTVAL());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO") && key.getRSLT_CTL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_NO", key.getRSLT_CTL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT") && key.getPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("PART_SUPPLIED_COMMENT", key.getPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_DATE") && key.getSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("SUPPLIED_DATE", key.getSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_CTL_NO") && key.getTMP_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("TMP_IDENT_CARD_CTL_NO", key.getTMP_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_OPR_INST_CD") && key.getTMP_OPR_INST_CD() != null) {
					msgKey.setKeyValue("TMP_OPR_INST_CD", key.getTMP_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_PARTIAL_PRD_NO") && key.getTMP_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("TMP_PARTIAL_PRD_NO", key.getTMP_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_RCV_ISSUE_CTRL_CD") && key.getTMP_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("TMP_RCV_ISSUE_CTRL_CD", key.getTMP_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_ITEM_CD") && key.getTMP_ITEM_CD() != null) {
					msgKey.setKeyValue("TMP_ITEM_CD", key.getTMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_JOB_ODR_CD") && key.getTMP_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("TMP_JOB_ODR_CD", key.getTMP_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_FIRST_IDENT_CARD_QTY") && key.getTMP_FIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TMP_FIRST_IDENT_CARD_QTY", key.getTMP_FIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_QTY") && key.getTMP_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TMP_IDENT_CARD_QTY", key.getTMP_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_OPR_DATE") && key.getTMP_OPR_DATE() != null) {
					msgKey.setKeyValue("TMP_OPR_DATE", key.getTMP_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("TMP_PKG_UNIT_QTY") && key.getTMP_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("TMP_PKG_UNIT_QTY", key.getTMP_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_PLANT_CD") && key.getTMP_PLANT_CD() != null) {
					msgKey.setKeyValue("TMP_PLANT_CD", key.getTMP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_WS_CD") && key.getTMP_WS_CD() != null) {
					msgKey.setKeyValue("TMP_WS_CD", key.getTMP_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_PRINT_GRP_NO") && key.getINS_PRINT_GRP_NO() != null) {
					msgKey.setKeyValue("INS_PRINT_GRP_NO", key.getINS_PRINT_GRP_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_PAGE_NO") && key.getINS_PAGE_NO() != null) {
					msgKey.setKeyValue("INS_PAGE_NO", key.getINS_PAGE_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_PRINT_QTY") && key.getINS_PRINT_QTY() != null) {
					msgKey.setKeyValue("INS_PRINT_QTY", key.getINS_PRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WH_CD") && key.getNEXT_WH_CD() != null) {
					msgKey.setKeyValue("NEXT_WH_CD", key.getNEXT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("FIRST_OPR_INST_CD") && key.getFIRST_OPR_INST_CD() != null) {
					msgKey.setKeyValue("FIRST_OPR_INST_CD", key.getFIRST_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("FIRST_PROC_NO") && key.getFIRST_PROC_NO() != null) {
					msgKey.setKeyValue("FIRST_PROC_NO", key.getFIRST_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WORK_ODR_CD") && key.getNEXT_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("NEXT_WORK_ODR_CD", key.getNEXT_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("NEXT_OPR_INST_CD") && key.getNEXT_OPR_INST_CD() != null) {
					msgKey.setKeyValue("NEXT_OPR_INST_CD", key.getNEXT_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("NEXT_PROC_NO") && key.getNEXT_PROC_NO() != null) {
					msgKey.setKeyValue("NEXT_PROC_NO", key.getNEXT_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WS_CD") && key.getNEXT_WS_CD() != null) {
					msgKey.setKeyValue("NEXT_WS_CD", key.getNEXT_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WS_NAME") && key.getNEXT_WS_NAME() != null) {
					msgKey.setKeyValue("NEXT_WS_NAME", key.getNEXT_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WH_NAME") && key.getNEXT_WH_NAME() != null) {
					msgKey.setKeyValue("NEXT_WH_NAME", key.getNEXT_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("PREV_WORK_ODR_CD") && key.getPREV_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("PREV_WORK_ODR_CD", key.getPREV_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PREV_OPR_INST_CD") && key.getPREV_OPR_INST_CD() != null) {
					msgKey.setKeyValue("PREV_OPR_INST_CD", key.getPREV_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PREV_PARTIAL_PRD_NO") && key.getPREV_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PREV_PARTIAL_PRD_NO", key.getPREV_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("PREV_PROC_NO") && key.getPREV_PROC_NO() != null) {
					msgKey.setKeyValue("PREV_PROC_NO", key.getPREV_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("PREV_WH_CD") && key.getPREV_WH_CD() != null) {
					msgKey.setKeyValue("PREV_WH_CD", key.getPREV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("DATA_COUNT") && key.getDATA_COUNT() != null) {
					msgKey.setKeyValue("DATA_COUNT", key.getDATA_COUNT());
				}
				if(msgKeyType.containsKeyColumn("WH_CD_COUNT") && key.getWH_CD_COUNT() != null) {
					msgKey.setKeyValue("WH_CD_COUNT", key.getWH_CD_COUNT());
				}
				if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD") && key.getFROM_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("FROM_PUCH_ODR_CD", key.getFROM_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD") && key.getTO_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("TO_PUCH_ODR_CD", key.getTO_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_ITEM_CD") && key.getFROM_ITEM_CD() != null) {
					msgKey.setKeyValue("FROM_ITEM_CD", key.getFROM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_LOT_NO") && key.getFROM_LOT_NO() != null) {
					msgKey.setKeyValue("FROM_LOT_NO", key.getFROM_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("TO_ITEM_CD") && key.getTO_ITEM_CD() != null) {
					msgKey.setKeyValue("TO_ITEM_CD", key.getTO_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_LOT_NO") && key.getTO_LOT_NO() != null) {
					msgKey.setKeyValue("TO_LOT_NO", key.getTO_LOT_NO());
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
					AD0090010Struct key = new AD0090010Struct();
					if(msgKeyType.containsKeyColumn("chk_COMPLETE")) {
						key.setchk_COMPLETE(msgKey.getKeyValue("chk_COMPLETE"));
					}
					if(msgKeyType.containsKeyColumn("OPRATION_TIME")) {
						key.setOPRATION_TIME(msgKey.getKeyValue("OPRATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("chk_OUTPUT")) {
						key.setchk_OUTPUT(msgKey.getKeyValue("chk_OUTPUT"));
					}
					if(msgKeyType.containsKeyColumn("d1_STOCK_UNIT")) {
						key.setd1_STOCK_UNIT(msgKey.getKeyValue("d1_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_name")) {
						key.setOPR_TIME_UNIT_TYP_name(msgKey.getKeyValue("OPR_TIME_UNIT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_val")) {
						key.setOPR_TIME_UNIT_TYP_val(msgKey.getKeyValue("OPR_TIME_UNIT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_name")) {
						key.setl_DEFECT_CAUSE_CD_name(msgKey.getKeyValue("l_DEFECT_CAUSE_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_val")) {
						key.setl_DEFECT_CAUSE_CD_val(msgKey.getKeyValue("l_DEFECT_CAUSE_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("h_FINAL_PROC_FLG")) {
						key.seth_FINAL_PROC_FLG(msgKey.getKeyValue("h_FINAL_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG")) {
						key.seth_SYS_LOT_CTRL_FLG(msgKey.getKeyValue("h_SYS_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("chk_CHILD_RSLTUPDATE")) {
						key.setchk_CHILD_RSLTUPDATE(msgKey.getKeyValue("chk_CHILD_RSLTUPDATE"));
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
					if(msgKeyType.containsKeyColumn("h_PROCESS_MANAGE_FLG")) {
						key.seth_PROCESS_MANAGE_FLG(msgKey.getKeyValue("h_PROCESS_MANAGE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY")) {
						key.setTEMP_PLAN_QTY(msgKey.getKeyValue("TEMP_PLAN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY")) {
						key.setTEMP_USEOVER_QTY(msgKey.getKeyValue("TEMP_USEOVER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY")) {
						key.setTEMP_PLANOUT_QTY(msgKey.getKeyValue("TEMP_PLANOUT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USE_QTY")) {
						key.setTEMP_USE_QTY(msgKey.getKeyValue("TEMP_USE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_PARTIAL_PRD_NO")) {
						key.setl_PARTIAL_PRD_NO(msgKey.getKeyValue("l_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_WORK_FLG")) {
						key.setFIRST_WORK_FLG(msgKey.getKeyValue("FIRST_WORK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("USE_LOT_NO")) {
						key.setUSE_LOT_NO(msgKey.getKeyValue("USE_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("USE_ACPT_QTY")) {
						key.setUSE_ACPT_QTY(msgKey.getKeyValue("USE_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("USE_DEFECT_QTY")) {
						key.setUSE_DEFECT_QTY(msgKey.getKeyValue("USE_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_CD")) {
						key.setIN_OPR_INST_CD(msgKey.getKeyValue("IN_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NO")) {
						key.setPROC_NO(msgKey.getKeyValue("PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_MODIFY_COUNT")) {
						key.setPROC_MODIFY_COUNT(msgKey.getKeyValue("PROC_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("FINAL_PROC_FLG")) {
						key.setFINAL_PROC_FLG(msgKey.getKeyValue("FINAL_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(msgKey.getKeyValue("LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY")) {
						key.setSUM_ACPT_QTY(msgKey.getKeyValue("SUM_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_DEFECT_QTY")) {
						key.setSUM_DEFECT_QTY(msgKey.getKeyValue("SUM_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_MODIFY_COUNT")) {
						key.setITEM_MODIFY_COUNT(msgKey.getKeyValue("ITEM_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_DATE")) {
						key.seth_OPR_DATE(msgKey.getKeyValue("h_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_TIME")) {
						key.seth_BUSINESS_OPR_TIME(msgKey.getKeyValue("h_BUSINESS_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("FORM_SET_ITEM_CD")) {
						key.setFORM_SET_ITEM_CD(msgKey.getKeyValue("FORM_SET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON")) {
						key.setOPR_RSLT_PERSON(msgKey.getKeyValue("OPR_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT")) {
						key.setOPR_RSLT_COMMENT(msgKey.getKeyValue("OPR_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP")) {
						key.setOPR_TIME_UNIT_TYP(msgKey.getKeyValue("OPR_TIME_UNIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME")) {
						key.setPRE_ARRANGEMENT_TIME(msgKey.getKeyValue("PRE_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME")) {
						key.setPOST_ARRANGEMENT_TIME(msgKey.getKeyValue("POST_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_TIME")) {
						key.setCESSATION_TIME(msgKey.getKeyValue("CESSATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_CAUSE")) {
						key.setCESSATION_CAUSE(msgKey.getKeyValue("CESSATION_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD")) {
						key.setOUTPUT_RSLT_CD(msgKey.getKeyValue("OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_CRCT_NO")) {
						key.setOPR_CRCT_NO(msgKey.getKeyValue("OPR_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("UPDATE_WORK_STS_TYP")) {
						key.setUPDATE_WORK_STS_TYP(msgKey.getKeyValue("UPDATE_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(msgKey.getKeyValue("RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(msgKey.getKeyValue("OPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD")) {
						key.seth_ISSUE_INST_CD(msgKey.getKeyValue("h_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY")) {
						key.setSAVE_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SAVE_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY")) {
						key.setRCV_ISSUE_ODD_QTY(msgKey.getKeyValue("RCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(msgKey.getKeyValue("STOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(msgKey.getKeyValue("MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP")) {
						key.setPARENT_OUTSIDE_TYP(msgKey.getKeyValue("PARENT_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_MRP_ODR_TYP")) {
						key.setPARENT_MRP_ODR_TYP(msgKey.getKeyValue("PARENT_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_WORK_ODR_CD")) {
						key.setPARENT_WORK_ODR_CD(msgKey.getKeyValue("PARENT_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_WORK_IN_PROC_CD")) {
						key.setPARENT_WORK_IN_PROC_CD(msgKey.getKeyValue("PARENT_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_PUCH_ODR_CD")) {
						key.setPARENT_PUCH_ODR_CD(msgKey.getKeyValue("PARENT_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM")) {
						key.setUPDATED_PRG_NM(msgKey.getKeyValue("UPDATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("GET_IDENT_CARD_CTL_NO")) {
						key.setGET_IDENT_CARD_CTL_NO(msgKey.getKeyValue("GET_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SEL_OPR_INST_CD")) {
						key.setSEL_OPR_INST_CD(msgKey.getKeyValue("SEL_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_PARTIAL_PRD_NO")) {
						key.setSEL_PARTIAL_PRD_NO(msgKey.getKeyValue("SEL_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("SEL_ITEM_CD")) {
						key.setSEL_ITEM_CD(msgKey.getKeyValue("SEL_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_ACPT_QTY")) {
						key.setSEL_ACPT_QTY(msgKey.getKeyValue("SEL_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SEL_OPR_DATE")) {
						key.setSEL_OPR_DATE(msgKey.getKeyValue("SEL_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SEL_PKG_UNIT_QTY")) {
						key.setSEL_PKG_UNIT_QTY(msgKey.getKeyValue("SEL_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SEL_PLANT_CD")) {
						key.setSEL_PLANT_CD(msgKey.getKeyValue("SEL_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_WS_CD")) {
						key.setSEL_WS_CD(msgKey.getKeyValue("SEL_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_CTL_NO")) {
						key.setINS_IDENT_CARD_CTL_NO(msgKey.getKeyValue("INS_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_OPR_INST_CD")) {
						key.setINS_OPR_INST_CD(msgKey.getKeyValue("INS_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_PARTIAL_PRD_NO")) {
						key.setINS_PARTIAL_PRD_NO(msgKey.getKeyValue("INS_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_RCV_ISSUE_CTRL_CD")) {
						key.setINS_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("INS_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_ITEM_CD")) {
						key.setINS_ITEM_CD(msgKey.getKeyValue("INS_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_JOB_ODR_CD")) {
						key.setINS_JOB_ODR_CD(msgKey.getKeyValue("INS_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_FIRST_IDENT_CARD_QTY")) {
						key.setINS_FIRST_IDENT_CARD_QTY(msgKey.getKeyValue("INS_FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_QTY")) {
						key.setINS_IDENT_CARD_QTY(msgKey.getKeyValue("INS_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_OPR_DATE")) {
						key.setINS_OPR_DATE(msgKey.getKeyValue("INS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INS_PKG_UNIT_QTY")) {
						key.setINS_PKG_UNIT_QTY(msgKey.getKeyValue("INS_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_PLANT_CD")) {
						key.setINS_PLANT_CD(msgKey.getKeyValue("INS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_WS_CD")) {
						key.setINS_WS_CD(msgKey.getKeyValue("INS_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD")) {
						key.setl_DEFECT_CAUSE_CD(msgKey.getKeyValue("l_DEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_QTY")) {
						key.setl_DEFECT_QTY(msgKey.getKeyValue("l_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_COMMENT")) {
						key.setl_DEFECT_COMMENT(msgKey.getKeyValue("l_DEFECT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTRL_SEQ_NO")) {
						key.setRSLT_CTRL_SEQ_NO(msgKey.getKeyValue("RSLT_CTRL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY")) {
						key.setSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY_sum")) {
						key.setSUPPLIED_ISSUE_QTY_sum(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY_sum"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_DENOMINATOR")) {
						key.seth_ISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("h_ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_NUMERATOR")) {
						key.seth_ISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("h_ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("count_RCV_ISSUE")) {
						key.setcount_RCV_ISSUE(msgKey.getKeyValue("count_RCV_ISSUE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SPENT_QTY")) {
						key.setSPENT_QTY(msgKey.getKeyValue("SPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NEXTVAL")) {
						key.setNEXTVAL(msgKey.getKeyValue("NEXTVAL"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO")) {
						key.setRSLT_CTL_SEQ_NO(msgKey.getKeyValue("RSLT_CTL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT")) {
						key.setPART_SUPPLIED_COMMENT(msgKey.getKeyValue("PART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_DATE")) {
						key.setSUPPLIED_DATE(msgKey.getKeyValue("SUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_CTL_NO")) {
						key.setTMP_IDENT_CARD_CTL_NO(msgKey.getKeyValue("TMP_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_OPR_INST_CD")) {
						key.setTMP_OPR_INST_CD(msgKey.getKeyValue("TMP_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PARTIAL_PRD_NO")) {
						key.setTMP_PARTIAL_PRD_NO(msgKey.getKeyValue("TMP_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_RCV_ISSUE_CTRL_CD")) {
						key.setTMP_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("TMP_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_ITEM_CD")) {
						key.setTMP_ITEM_CD(msgKey.getKeyValue("TMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_JOB_ODR_CD")) {
						key.setTMP_JOB_ODR_CD(msgKey.getKeyValue("TMP_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_FIRST_IDENT_CARD_QTY")) {
						key.setTMP_FIRST_IDENT_CARD_QTY(msgKey.getKeyValue("TMP_FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_QTY")) {
						key.setTMP_IDENT_CARD_QTY(msgKey.getKeyValue("TMP_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_OPR_DATE")) {
						key.setTMP_OPR_DATE(msgKey.getKeyValue("TMP_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PKG_UNIT_QTY")) {
						key.setTMP_PKG_UNIT_QTY(msgKey.getKeyValue("TMP_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PLANT_CD")) {
						key.setTMP_PLANT_CD(msgKey.getKeyValue("TMP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_WS_CD")) {
						key.setTMP_WS_CD(msgKey.getKeyValue("TMP_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_PRINT_GRP_NO")) {
						key.setINS_PRINT_GRP_NO(msgKey.getKeyValue("INS_PRINT_GRP_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_PAGE_NO")) {
						key.setINS_PAGE_NO(msgKey.getKeyValue("INS_PAGE_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_PRINT_QTY")) {
						key.setINS_PRINT_QTY(msgKey.getKeyValue("INS_PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WH_CD")) {
						key.setNEXT_WH_CD(msgKey.getKeyValue("NEXT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_OPR_INST_CD")) {
						key.setFIRST_OPR_INST_CD(msgKey.getKeyValue("FIRST_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_PROC_NO")) {
						key.setFIRST_PROC_NO(msgKey.getKeyValue("FIRST_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WORK_ODR_CD")) {
						key.setNEXT_WORK_ODR_CD(msgKey.getKeyValue("NEXT_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_OPR_INST_CD")) {
						key.setNEXT_OPR_INST_CD(msgKey.getKeyValue("NEXT_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_PROC_NO")) {
						key.setNEXT_PROC_NO(msgKey.getKeyValue("NEXT_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WS_CD")) {
						key.setNEXT_WS_CD(msgKey.getKeyValue("NEXT_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WS_NAME")) {
						key.setNEXT_WS_NAME(msgKey.getKeyValue("NEXT_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WH_NAME")) {
						key.setNEXT_WH_NAME(msgKey.getKeyValue("NEXT_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PREV_WORK_ODR_CD")) {
						key.setPREV_WORK_ODR_CD(msgKey.getKeyValue("PREV_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PREV_OPR_INST_CD")) {
						key.setPREV_OPR_INST_CD(msgKey.getKeyValue("PREV_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PREV_PARTIAL_PRD_NO")) {
						key.setPREV_PARTIAL_PRD_NO(msgKey.getKeyValue("PREV_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PREV_PROC_NO")) {
						key.setPREV_PROC_NO(msgKey.getKeyValue("PREV_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("PREV_WH_CD")) {
						key.setPREV_WH_CD(msgKey.getKeyValue("PREV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("DATA_COUNT")) {
						key.setDATA_COUNT(msgKey.getKeyValue("DATA_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD_COUNT")) {
						key.setWH_CD_COUNT(msgKey.getKeyValue("WH_CD_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD")) {
						key.setFROM_PUCH_ODR_CD(msgKey.getKeyValue("FROM_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD")) {
						key.setTO_PUCH_ODR_CD(msgKey.getKeyValue("TO_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_ITEM_CD")) {
						key.setFROM_ITEM_CD(msgKey.getKeyValue("FROM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_LOT_NO")) {
						key.setFROM_LOT_NO(msgKey.getKeyValue("FROM_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("TO_ITEM_CD")) {
						key.setTO_ITEM_CD(msgKey.getKeyValue("TO_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_LOT_NO")) {
						key.setTO_LOT_NO(msgKey.getKeyValue("TO_LOT_NO"));
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
