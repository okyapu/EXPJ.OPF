/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0120/src/com/nec/jp/orteus/metamorBase/AD0120/AD0120010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0120;

import com.nec.jp.orteus.metamorBase.AD0120.*;
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
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0120010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2015/11/16 02:32:36 $
 *
 */
//}}user_implement_code_header

public class AD0120010Control
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
	public AD0120010Struct getListvalue(int x) { return (AD0120010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0120010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AD0120010Struct createStruct() { return new AD0120010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0120010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
	 
	// ���i�[���������ʗp
	AD0120010Struct mainStruct = new AD0120010Struct();
	
	// ��Ǝ��ы敪�̃R���{�{�b�N�X�f�[�^
	private ComboStruct OPR_RSLT_TYP = null;
	/**
	  * ��Ǝ��ы敪���Q�b�g
	  * @return
	*/
	public ComboStruct getComOprRsltTyp() {
		return OPR_RSLT_TYP;
	}
	/**
	 * ��Ǝ��ы敪���Z�b�g
	 * @param cs
	 */
	public void setComOprRsltTyp(ComboStruct cs){
		OPR_RSLT_TYP = cs;
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
     * ��ʃG���[���b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     */
    private void setErrorMessage(String code){
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
     sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
    }

	/**
	 * �R���{�{�b�N�X�f�[�^����\���������擾����
	 * @param combo �R���{�{�b�N�X�f�[�^
	 * @param value �R���{�{�b�N�X�f�[�^�̒l
	 * @return �R���{�{�b�N�X�f�[�^�̕\������
	 */
	private String getDisplayName(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if ((combo.getData(j)[0]).equals(value)) {
				return combo.getData(j)[1];
			}
		}
		return null;
	}
	
	/**
	 * ���i�[�̓o�^
	 * @param insertStruct
	 */
	private void insertIdentCard (AD0120010Struct insertStruct) {
		try {
			// ���i�[�Ǘ��ԍ�
			List identCardCtlNoList = entity.mSELECT_IDENT_CARD_CTL_NO.read(conn, insertStruct);
			if (!identCardCtlNoList.isEmpty()) {
				insertStruct.setIDENT_CARD_CTL_NO(((AD0120010Struct) identCardCtlNoList.get(0)).getIDENT_CARD_CTL_NO());
			}
			// �H��R�[�h
			insertStruct.setPLANT_CD(getsysPLANT_CD());
			// �쐬��
			insertStruct.setsSysdate(struct.getsSysdate());
			// �쐬��
			insertStruct.setsUser_ID(getsysUSER_CD());
			entity.mT_IDENT_CARD.create(conn, insertStruct);
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		}
	}
	
	/**
	 * �i�ڕʎd�|�̎��ۏo�͐��X�V
	 * @param updateStruct
	 */
	private void updateWorkInProcByItem (AD0120010Struct updateStruct) {
		
		try {
			// �X�V��
			updateStruct.setsSysdate(struct.getsSysdate());
			// �X�V��
			updateStruct.setsUser_ID(getsysUSER_CD());
			entity.mT_WORK_IN_PROC_BY_ITEM.update(conn, updateStruct);
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		}
	}
	
	/**
	 * �����̐ݒ�
	 * @param  input    ����String
	 * @param  cnt      ����
	 * @return String   ���Ƀ[���𖄂߂�
	 */
	private String AppendZero(String input,int cnt){
	  int nCount = cnt - input.length() ;
	  for(int i = 1; i <= nCount;i++)
	  {
	  	input = "0" + input;
	  }
	  return input;
	}
	
	/**
	 * �����̌v�Z�i�����[��From~To �ƍ�ƒ����From~To�j
	 */
	private void calculateDateTime() {
		
		if (null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
			// �����[���iFrom�j
			if(null == struct.getIN_WORK_ODR_DLV_DATE_FROM() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_FROM())){
				struct.setIN_WORK_ODR_DLV_DATETIME_FROM(null);
			}else{
				// �����ݒ�
				if(null == struct.getIN_WORK_ODR_DLV_TIME_FROM() || "".equals(struct.getIN_WORK_ODR_DLV_TIME_FROM())){
					struct.setIN_WORK_ODR_DLV_DATETIME_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM() + " 00:00");
				}else{
					struct.setIN_WORK_ODR_DLV_TIME_FROM(AppendZero(struct.getIN_WORK_ODR_DLV_TIME_FROM(),4));
					struct.setIN_WORK_ODR_DLV_DATETIME_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM() + " " + 
					struct.getIN_WORK_ODR_DLV_TIME_FROM().substring(0,2) + ":" + 
					struct.getIN_WORK_ODR_DLV_TIME_FROM().substring(2));
				}
			}
			// �����[���iTo�j
			if(null == struct.getIN_WORK_ODR_DLV_DATE_TO() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_TO())){
				struct.setIN_WORK_ODR_DLV_DATETIME_TO(null);
			}else{
				// �����ݒ�
				if(null == struct.getIN_WORK_ODR_DLV_TIME_TO() || "".equals(struct.getIN_WORK_ODR_DLV_TIME_TO())){
					struct.setIN_WORK_ODR_DLV_DATETIME_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " 23:59");
				}else{
					struct.setIN_WORK_ODR_DLV_TIME_TO(AppendZero(struct.getIN_WORK_ODR_DLV_TIME_TO(),4));
					struct.setIN_WORK_ODR_DLV_DATETIME_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " " + 
					struct.getIN_WORK_ODR_DLV_TIME_TO().substring(0,2) + ":" + 
					struct.getIN_WORK_ODR_DLV_TIME_TO().substring(2));
				}
			}
			// ��ƒ�����iFrom�j
			if (null == struct.getOPR_INST_START_DATE_FROM() || "".equals(struct.getOPR_INST_START_DATE_FROM())) {
				struct.setOPR_INST_START_DATETIME_FROM(null);
			} else {
				// �����ݒ�
				if (null == struct.getOPR_INST_START_TIME_FROM() || "".equals(struct.getOPR_INST_START_TIME_FROM())) {
					struct.setOPR_INST_START_DATETIME_FROM(struct.getOPR_INST_START_DATE_FROM() + " 00:00");
				} else {
					struct.setOPR_INST_START_TIME_FROM(AppendZero(struct.getOPR_INST_START_TIME_FROM(), 4));
					struct.setOPR_INST_START_DATETIME_FROM(struct.getOPR_INST_START_DATE_FROM() + " "+
					struct.getOPR_INST_START_TIME_FROM().substring(0, 2) + ":" +
					struct.getOPR_INST_START_TIME_FROM().substring(2));
				}
			}
			// ��ƒ�����iTo�j
			if (null == struct.getOPR_INST_START_DATE_TO() || "".equals(struct.getOPR_INST_START_DATE_TO())) {
				struct.setOPR_INST_START_DATETIME_TO(null);
			} else {
				// �����ݒ�
				if (null == struct.getOPR_INST_START_TIME_TO() || "".equals(struct.getOPR_INST_START_TIME_TO())) {
					struct.setOPR_INST_START_DATETIME_TO(struct.getOPR_INST_START_DATE_TO() + " 00:00");
				} else {
					struct.setOPR_INST_START_TIME_TO(AppendZero(struct.getOPR_INST_START_TIME_TO(), 4));
					struct.setOPR_INST_START_DATETIME_TO(struct.getOPR_INST_START_DATE_TO() + " "+
					struct.getOPR_INST_START_TIME_TO().substring(0, 2) + ":" +
					struct.getOPR_INST_START_TIME_TO().substring(2));
				}
			}
		} else {
			
			struct.setIN_WORK_ODR_DLV_DATETIME_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM());
			if(null == struct.getIN_WORK_ODR_DLV_DATE_TO() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_TO())){
				struct.setIN_WORK_ODR_DLV_DATETIME_TO(null);
			}else{
				struct.setIN_WORK_ODR_DLV_DATETIME_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " 23:59");
			}
			struct.setOPR_INST_START_DATETIME_FROM(struct.getOPR_INST_START_DATE_FROM());
			if(null == struct.getOPR_INST_START_DATE_TO() || "".equals(struct.getOPR_INST_START_DATE_TO())){
				struct.setOPR_INST_START_DATETIME_TO(null);
			}else{
				struct.setOPR_INST_START_DATETIME_TO(struct.getOPR_INST_START_DATE_TO() + " 23:59");
			}
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			if (list == null) {
				list = new ArrayList();
			} else {
				list.clear();
			}
			// �i�ږ�
			struct.setITEM_NAME(null);
			// ��Ƌ於
			struct.setWS_NAME(null);
			// �H��R�[�h
			struct.setPLANT_CD(getsysPLANT_CD());
			
			// �i�ڑ��݃`�F�b�N
			if (struct.getITEM_CD() != null && !"".equals(struct.getITEM_CD())) {
				List checkItemList = entity.mM_ITEM.read(conn, struct);
				if (checkItemList.isEmpty()) {
					setErrorMessage("ZZ11002");
					setReadStatus(ERROR);
					return;
				} else {
					// �i�ږ��̎擾
					struct.setITEM_NAME(((AD0120010Struct)checkItemList.get(0)).getITEM_NAME());
				}
			}
			
			// ��Ƌ摶�݃`�F�b�N
			if (struct.getWS_CD() != null && !"".equals(struct.getWS_CD())) {
				List checkWsList = entity.mM_WS.read(conn, struct);
				if (checkWsList.isEmpty()) {
					setErrorMessage("ZZ11007");
					setReadStatus(ERROR);
					return;
				} else {
					// ��Ƌ於�̎擾
					struct.setWS_NAME(((AD0120010Struct)checkWsList.get(0)).getWS_NAME());
				}
			}
			// �\���Ώۂ̃f�[�^���ő�\������
			int maxLine = sp.getMaxLine(conn,10);
			if (maxLine != 0) {
				struct.setMAX_LINE(maxLine + "");
			} else {
				struct.setMAX_LINE(null);
			}
			
			// ���o�����i���t�̐ݒ�j
			calculateDateTime();
			
			list = entity.mSelect.read(conn, struct);
			
			if(list == null || list.size()<= 0 ){
				setErrorMessage("ZZ06001");
				setReadStatus(NOT_FOUND);
				return;
			} else {
				// �\���Ώۂ̃f�[�^���ő�\�������𒴂����ꍇ�B
				if(maxLine != 0 && list.size() == maxLine + 1){
					setErrorMessage("ZZ01119", String.valueOf(maxLine));
					// ������Ԃ��u�ő�s���I�[�o�[�v�ɐݒ�
					setReadStatus(TOO_MANY);
					setList(null);
					return;
				} else {
					// ������Ԃ��u�Ǎ������v�ɐݒ�
					setReadStatus(NORMAL);
				}
			}
			// �R���{�{�b�N�X�f�[�^���擾
			ComboBox cb = new ComboBox(conn, sysUSER_CD);
			// ��Ǝ��ы敪
			setComOprRsltTyp(cb.getData("OPR_RSLT_TYP"));
			
			AD0120010Struct tempStruct = new AD0120010Struct();
			for (int i = 0; i < list.size(); i++) {
				tempStruct = (AD0120010Struct) list.get(i);
				// ��Ǝ��ы敪
				tempStruct.setl_OPR_RSLT_TYP_SHOW(getDisplayName(getComOprRsltTyp(), tempStruct.geth_l_OPR_RSLT_TYP()));
				// �o�͖����ƍő�o�͖�����ݒ肷��
				if ("1".equals(tempStruct.geth_l_OPR_RSLT_TYP())) {
					// �o�������т̏ꍇ
					tempStruct.seth_l_MAX_PRINT_QTY(tempStruct.getl_PRINT_QTY());
				} else {
					// ��Ǝ��т̏ꍇ
					tempStruct.setl_PRINT_QTY(Calculate.divide(
							Calculate.subtract(tempStruct.getl_OPR_INST_QTY(), tempStruct.getl_SUM_IDENT_CARD_QTY()),
							tempStruct.getl_PKG_UNIT_QTY(),
							0,
							Calculate.CEIL));
					tempStruct.seth_l_MAX_PRINT_QTY(tempStruct.getl_PRINT_QTY());
				}

				// �o�͖����}�X�N
				if ("1".equals(tempStruct.geth_l_OPR_RSLT_TYP())) {
					tempStruct.seth_l_MASK_FLG(null);
				} else {
					tempStruct.seth_l_MASK_FLG("MASK");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// CSV���̍쐬
			List csvList = new ArrayList();
			String[] title = {
				"Expj.Cmt0065",	            	// �敪
				"Expj.PLANT_CD",				// �H��R�[�h
				"Expj.OPR_INST_START_DATE_3",	// ��Ɛ��������
				"Expj.WORK_ODR_DLV_DATE",		// ��Ɛ����[��
				"Expj.OPR_INST_CD",				// ��Ǝw���ԍ�
				"Expj.ITEM_CD",			    	// �i�ڔԍ�
				"Expj.ITEM_NAME",				// �i�ږ�
				"Expj.OPR_INST_QTY_1",			// ��ƌv�搔
				"Expj.Cmt6217",	            	// �ݐϏo�͍ϐ�
				"Expj.Cmt5863",					// �׎p��
				"Expj.PRINT_QTY",				// �o�͖���
				"Expj.WS_CD",			    	// ��Ƌ�R�[�h
				"Expj.WS_NAME"		        	// ��Ƌ於
			};
			csvList.add(title);
			
			for (Iterator i = list.iterator(); i.hasNext();) {
				AD0120010Struct csvStruct = (AD0120010Struct) i.next();
				String[] csvStr = new String[title.length];
				int nCnt = 0;
				// �敪
				csvStr[nCnt++] = csvStruct.getl_OPR_RSLT_TYP_SHOW();
				// �H��R�[�h
				csvStr[nCnt++] = csvStruct.getl_PLANT_CD();
				// ��Ɛ��������
				csvStr[nCnt++] = csvStruct.getl_OPR_INST_START_DATE();
				// ��Ɛ����[��
				csvStr[nCnt++] = csvStruct.getl_WORK_ODR_DLV_DATE();
				// ��Ǝw���ԍ�
				csvStr[nCnt++] = csvStruct.getl_OPR_INST_CD();
				// �i�ڔԍ�
				csvStr[nCnt++] = csvStruct.getl_ITEM_CD();
				// �i�ږ�
				csvStr[nCnt++] = csvStruct.getl_ITEM_NAME();
				// ��ƌv�搔
				csvStr[nCnt++] = csvStruct.getl_OPR_INST_QTY();
				// �ݐϏo�͍ϐ�
				csvStr[nCnt++] = csvStruct.getl_SUM_IDENT_CARD_QTY();
				// �׎p��
				csvStr[nCnt++] = csvStruct.getl_PKG_UNIT_QTY();
				// �o�͖���
				csvStr[nCnt++] = csvStruct.getl_PRINT_QTY();
				// ��Ƌ�R�[�h
				csvStr[nCnt++] = csvStruct.getl_WS_CD();
				// ��Ƌ於
				csvStr[nCnt++] = csvStruct.getl_WS_NAME();
				csvList.add(csvStr);
			}
			
			if (csvList != null && !csvList.isEmpty()) {
				// CsvWriter�𐶐�
				csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
				csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
				struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
			}
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		if (list == null) {
			list = new ArrayList();
		} else {
			list.clear();
		}
		setReadStatus(INITIAL);
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AD0120010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// ������X�g
			List printList = new ArrayList();
			// �i�ڕʎd�|���X�g
			List workInProcByItemList = new ArrayList();
			// �i�ڔԍ����X�g
			List itemCdList = struct.getList_l_ITEM_CD();
			// �i�ږ����X�g
			List itemNameList = struct.getList_l_ITEM_NAME();
			// �P�ʃ��X�g
			List stockUnitList = struct.getList_h_l_STOCK_UNIT();
			// ��ƌv�搔���X�g
			List oprInstQtyList = struct.getList_l_OPR_INST_QTY();
			// �ݐϏo�͍ϐ����X�g
			List sumIdentCardQtyList = struct.getList_l_SUM_IDENT_CARD_QTY();
			// �׎p��(�i��)
			List pkgUnitQtyList = struct.getList_l_PKG_UNIT_QTY();
			// �o�͖������X�g
			List printQtyList = struct.getList_l_PRINT_QTY();
			// �敪���X�g
			List oprRsltTypList = struct.getList_h_l_OPR_RSLT_TYP();
			// ��Ƌ�R�[�h���X�g
			List wsCdList = struct.getList_l_WS_CD();
			// ���ԃ��X�g
			List jobOdrCdList = struct.getList_h_l_JOB_ODR_CD();
			// ��Ǝw���ԍ����X�g
			List oprInstCdList = struct.getList_l_OPR_INST_CD();
			// �ő�o�͖���
			List maxPrintQtyList = struct.getList_h_l_MAX_PRINT_QTY();
			
			int count = 0;	// �J�E���g
			String tempQty = new String();	// �o�c�͐�
			String qty = new String();		// �o�͐�
			String printQty = new String();	// ���͂����o�͖���
			AD0120010Struct insertStruct = new AD0120010Struct();
			AD0120010Struct workInProcByItemStruct = new AD0120010Struct();
			AD0120010Struct selectStruct = new AD0120010Struct();
			conn.beginTransWeb();

			// �����̌v�Z�i�����[��From~To �ƍ�ƒ����From~To�j
			calculateDateTime();
			// ���o�����i���t�̐ݒ�j
			// �����[���iFrom�j
			selectStruct.setIN_WORK_ODR_DLV_DATETIME_FROM(struct.getIN_WORK_ODR_DLV_DATETIME_FROM());
			// �����[���iTo�j
			selectStruct.setIN_WORK_ODR_DLV_DATETIME_TO(struct.getIN_WORK_ODR_DLV_DATETIME_TO());
			// ��ƒ�����iFrom�j
			selectStruct.setOPR_INST_START_DATETIME_FROM(struct.getOPR_INST_START_DATETIME_FROM());
			// ��ƒ�����iTo�j
			selectStruct.setOPR_INST_START_DATETIME_TO(struct.getOPR_INST_START_DATETIME_TO());

			// ���[�o��
			for (int i = 0; i < itemCdList.size(); i++) {
				// �i�ڔԍ�
				selectStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
				// [���i�[]��o�^
				if ("1".equals(oprRsltTypList.get(i))) {
					// �o�������т̏ꍇ
					// �H��R�[�h
					selectStruct.setPLANT_CD(getsysPLANT_CD());
					
					// �I���������׍s�̍ő�o�͖����𔻒f����
					if ("0".equals(String.valueOf(maxPrintQtyList.get(i)))) {
						// �ő�o�͖���= 0�̏ꍇ
						if ("0".equals(String.valueOf(printQtyList.get(i)))) {
							// �I���������׍s�̏o�͖�����0�̏ꍇ�A�����R�[�h���s��
							continue;
						}
						
						// ��Ɛ����[���ł��x���̃��R�[�h���擾����
						workInProcByItemList = entity.mSELECT_OPR_INST_CD.read(conn, selectStruct);
						workInProcByItemStruct = new AD0120010Struct();
						workInProcByItemStruct = (AD0120010Struct) workInProcByItemList.get(0);
						
						insertStruct = new AD0120010Struct();
						// �i�ڔԍ�
						insertStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
						// ���i�[����
						insertStruct.setIDENT_CARD_QTY("0");
						// ��Ǝw���ԍ�
						insertStruct.setOPR_INST_CD(workInProcByItemStruct.getOPR_INST_CD());
						// �i�ږ���
						insertStruct.setITEM_NAME(String.valueOf(itemNameList.get(i)));
						// �׎p�P�ʐ�
						insertStruct.setPKG_UNIT_QTY(String.valueOf(pkgUnitQtyList.get(i)));
						// ��Ƌ�R�[�h
						insertStruct.setWS_CD(workInProcByItemStruct.getWS_CD());
						// �P��
						insertStruct.setSTOCK_UNIT(String.valueOf(stockUnitList.get(i)));
						// �o�͖���
						insertStruct.setPRINT_QTY(String.valueOf(printQtyList.get(i)));
						
						// [���i�[]��o�^����
						insertIdentCard(insertStruct);
						printList.add(insertStruct);
					} else {
						// �ő�o�͖��� > 0�̏ꍇ
						workInProcByItemList = entity.mT_WORK_IN_PROC_BY_ITEM.read(conn, selectStruct);
						workInProcByItemStruct = new AD0120010Struct();

						count = workInProcByItemList.size();
						// �o�͖���
						printQty = String.valueOf(printQtyList.get(i));
						for (int j = 0; j < count; j++) {
							insertStruct = new AD0120010Struct();
							workInProcByItemStruct = (AD0120010Struct) workInProcByItemList.get(j);
							// �o�͎c��
							tempQty = Calculate.subtract(workInProcByItemStruct.getOPR_INST_QTY(), workInProcByItemStruct.getPRINT_QTY());
							// �o�͐�
							qty = Calculate.multiply(printQty, String.valueOf(pkgUnitQtyList.get(i)));
							// �I���������׍s�́u�o�͐��v >= �I���������׍s�́u��ƌv�搔�v-�I���������׍s�́u�ݐϏo�͍ϐ��v�̏ꍇ
							if (Calculate.compare(qty, tempQty) >= 0) {
								// �i�ڔԍ�
								insertStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
								// ���i�[����
								insertStruct.setIDENT_CARD_QTY(tempQty);
								// ��Ǝw���ԍ�
								insertStruct.setOPR_INST_CD(workInProcByItemStruct.getOPR_INST_CD());
								// �i�ږ���
								insertStruct.setITEM_NAME(String.valueOf(itemNameList.get(i)));
								// �׎p�P�ʐ�
								insertStruct.setPKG_UNIT_QTY(String.valueOf(pkgUnitQtyList.get(i)));
								// ��Ƌ�R�[�h
								insertStruct.setWS_CD(workInProcByItemStruct.getWS_CD());
								// �P��
								insertStruct.setSTOCK_UNIT(String.valueOf(stockUnitList.get(i)));
								// �o�͖���
								if (j + 1 == count) {
									// ���͂����o�͖������ő�o�͖����𒴂���ꍇ�A�Ō�̍�Ǝw���ԍ��𗘗p���o�͂���
									insertStruct.setPRINT_QTY(printQty);
								} else {
									insertStruct.setPRINT_QTY(Calculate.divide(insertStruct.getIDENT_CARD_QTY(), insertStruct.getPKG_UNIT_QTY(), 0, Calculate.CEIL));
								}
								
								// [���i�[]��o�^����
								insertIdentCard(insertStruct);
								printList.add(insertStruct);

								// [�i�ڕʎd�|].�h���ۏo�͐��h�\�� [�i�ڕʎd�|].�h��Ǝw�����h
								workInProcByItemStruct.setPRINT_QTY(workInProcByItemStruct.getOPR_INST_QTY());
								// [�i�ڕʎd�|]���X�V����
								updateWorkInProcByItem(workInProcByItemStruct);
								
								// �u�o�͖����v �\�� �u�o�͖����v - [���i�[].�h�o�͖����h
								printQty = Calculate.subtract(printQty, insertStruct.getPRINT_QTY());
							} else if (Calculate.compare(qty, "0") > 0) {
								// �i�ڔԍ�
								insertStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
								// ���i�[����
								insertStruct.setIDENT_CARD_QTY(qty);
								// ��Ǝw���ԍ�
								insertStruct.setOPR_INST_CD(workInProcByItemStruct.getOPR_INST_CD());
								// �i�ږ���
								insertStruct.setITEM_NAME(String.valueOf(itemNameList.get(i)));
								// �׎p�P�ʐ�
								insertStruct.setPKG_UNIT_QTY(String.valueOf(pkgUnitQtyList.get(i)));
								// ��Ƌ�R�[�h
								insertStruct.setWS_CD(workInProcByItemStruct.getWS_CD());
								// �P��
								insertStruct.setSTOCK_UNIT(String.valueOf(stockUnitList.get(i)));
								// �o�͖���
								insertStruct.setPRINT_QTY(printQty);
								// [���i�[]��o�^����
								insertIdentCard(insertStruct);
								printList.add(insertStruct);

								// [�i�ڕʎd�|].�h���ۏo�͐��h�\�� �u���i�[�o�͐��v + [�i�ڕʎd�|].�h���ۏo�͐��h
								workInProcByItemStruct.setPRINT_QTY(Calculate.add(qty, workInProcByItemStruct.getPRINT_QTY()));
								// [�i�ڕʎd�|]���X�V����
								updateWorkInProcByItem(workInProcByItemStruct);
								// �����I��
								break;
							}
						}
					}
				} else {
					// ��Ǝw�����т̏ꍇ
					if ("0".equals(String.valueOf(printQtyList.get(i)))) {
						// �I���������׍s�̏o�͖�����0�̏ꍇ�A�����R�[�h���s��
						continue;
					}

					insertStruct = new AD0120010Struct();
					// �i�ڔԍ�
					insertStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
					// ���i�[����
					insertStruct.setIDENT_CARD_QTY(Calculate.subtract(String.valueOf(oprInstQtyList.get(i)), String.valueOf(sumIdentCardQtyList.get(i))));
					// ��Ǝw���ԍ�
					insertStruct.setOPR_INST_CD(String.valueOf(oprInstCdList.get(i)));
					// �i�ږ���
					insertStruct.setITEM_NAME(String.valueOf(itemNameList.get(i)));
					// �׎p�P�ʐ�
					insertStruct.setPKG_UNIT_QTY(String.valueOf(pkgUnitQtyList.get(i)));
					// ��Ƌ�R�[�h
					insertStruct.setWS_CD(String.valueOf(wsCdList.get(i)));
					// �o�͖���
					insertStruct.setPRINT_QTY(String.valueOf(printQtyList.get(i)));
					// �P��
					insertStruct.setSTOCK_UNIT(String.valueOf(stockUnitList.get(i)));
					// ����
					insertStruct.setJOB_ODR_CD(String.valueOf(jobOdrCdList.get(i)));
					// [���i�[]��o�^����
					insertIdentCard(insertStruct);
					printList.add(insertStruct);
				}
			}

			String printId1 = "AD01200101"; // ���[ID���w�肵�Ă�������
			ret = svf.VrInit(printId1); // PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath(); // pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName(); // pdf�t�@�C�����iWeb�p�j
			int no = 0;

			for (int i = 0; i < printList.size(); i++) {
				strPdf = (AD0120010Struct) printList.get(i);
				if (strPdf.getIDENT_CARD_CTL_NO() != null && !"".equals(strPdf.getIDENT_CARD_CTL_NO())) {
					double bunshi = Double.parseDouble(strPdf.getIDENT_CARD_QTY());
					double bunbo = Double.parseDouble(strPdf.getPKG_UNIT_QTY());
					double maxPrintQty;
					double overno;
					// �ő�o�͖���
					maxPrintQty = Double.parseDouble(Calculate.divide(String.valueOf(bunshi), String.valueOf(bunbo), 0, Calculate.CEIL));
					// ���i�[���ʁ��׎p�P�ʐ��ʂ̗]������߂�
					overno = bunshi % bunbo;

					for (int j = 1; j <= Double.parseDouble(strPdf.getPRINT_QTY()); j++) {
						// �i�ڔԍ�
						ret = svf.VrsOut("ITEM_CD", strPdf.getITEM_CD());
						// �i�ږ���
						ret = svf.VrsOut("ITEM_NAME", strPdf.getITEM_NAME());
						
						if (j >= maxPrintQty) {
							// �ŏI�y�[�W�ł��A�]�肪����ꍇ
							if (j == maxPrintQty) {
								// �]����׎p�P�ʐ��ʂɐݒ�
								if (overno != 0){
									ret = svf.VrsOut("PKG_UNIT_QTY", Calculate.floor(Double.toString(overno), 4));
								} else {
									ret = svf.VrsOut("PKG_UNIT_QTY", strPdf.getPKG_UNIT_QTY());
								}
							} else {
								// ���͂����o�͖����͍ő�o�͖����𒴂���ꍇ
								ret = svf.VrsOut("PKG_UNIT_QTY", "0");
							}
						} else {
							// �׎p�P�ʐ���
							ret = svf.VrsOut("PKG_UNIT_QTY", strPdf.getPKG_UNIT_QTY());
						}
						// �P��
						ret = svf.VrsOut("STOCK_UNIT", strPdf.getSTOCK_UNIT());
						// ���i�[�Ǘ��ԍ�
						ret = svf.VrsOut("IDENT_CARD_CTL_NO", strPdf.getIDENT_CARD_CTL_NO());
						// �݌Ƀ��b�g�ԍ�
						ret = svf.VrsOut("LOT_NO", strPdf.getLOT_NO());
						// ����
						ret = svf.VrsOut("JOB_ODR_CD", strPdf.getJOB_ODR_CD());
						// ���ѐ���
						ret = svf.VrsOut("IDENT_CARD_QTY", strPdf.getIDENT_CARD_QTY());
						// ��Ǝw���ԍ�
						ret = svf.VrsOut("OPR_INST_CD", strPdf.getOPR_INST_CD());
						// �����
						ret = svf.VrsOut("PARTIAL_PRD_NO", strPdf.getPARTIAL_PRD_NO());
						// ��Ɠ�
						ret = svf.VrsOut("OPR_DATE", strPdf.getOPR_DATE());
						ret = svf.VrsOut("PAGE_NO", j + "");
						ret = svf.VrsOut("PRINT_QTY", strPdf.getPRINT_QTY());
						// �\�[�g �y�[�W�p
						ret = svf.VrsOut("NO", Integer.toString(no++));
						ret = svf.VrEndRecord();
						ret = svf.VrEndPage(); // ���y�[�W���s
					}
					// ���i�[�X�V
					entity.mT_IDENT_CARD.update(conn, strPdf);
				}
			}
			
			ret = svf.VrPrint(); // PDF�쐬�I��
			ret = svf.VrQuit(); // PDF�쐬�I��
			if ("0".equals(printType)) { // �N���C�A���g����̏ꍇ
				struct.setDOWNLOAD_FILE(getPdfFileName());
			} else if ("1".equals(printType)) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			controlSelect();
			// �R�~�b�g
			conn.commit();
		} catch(ResourceBusyException e) {
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		} finally {
			try {
				conn.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				setErrorMessage("ZZ01106");
			}
		}
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * �o�͐� �󔒏o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlNullPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlNullPrint");
			//{{user_implement_dev:<controlNullPrint>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		AD0120010Struct strPdf = null;
		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);
		try {
			// ������X�g
			List printList = new ArrayList();
			// �i�ڔԍ����X�g
			List itemCdList = struct.getList_l_ITEM_CD();
			// �i�ږ����X�g
			List itemNameList = struct.getList_l_ITEM_NAME();
			// �P�ʃ��X�g
			List stockUnitList = struct.getList_h_l_STOCK_UNIT();
			// �׎p��(�i��)
			List pkgUnitQtyList = struct.getList_l_PKG_UNIT_QTY();
			AD0120010Struct printBlankStruct = new AD0120010Struct();
			// ���[�o��
			for (int i = 0; i < itemCdList.size(); i++) {
				printBlankStruct = new AD0120010Struct();
				// �i�ڔԍ�
				printBlankStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
				// �i�ږ���
				printBlankStruct.setITEM_NAME(String.valueOf(itemNameList.get(i)));
				// �׎p�P�ʐ���
				printBlankStruct.setPKG_UNIT_QTY(String.valueOf(pkgUnitQtyList.get(i)));
				// �P��
				printBlankStruct.setSTOCK_UNIT(String.valueOf(stockUnitList.get(i)));
				// ���i�[�Ǘ��ԍ�
				printBlankStruct.setIDENT_CARD_CTL_NO("");
				// �݌Ƀ��b�g�ԍ�
				printBlankStruct.setLOT_NO("");
				// ����
				printBlankStruct.setJOB_ODR_CD("");
				// ���ѐ���
				printBlankStruct.setIDENT_CARD_QTY("");
				// ��Ǝw���ԍ�
				printBlankStruct.setOPR_INST_CD("");
				// �����
				printBlankStruct.setPARTIAL_PRD_NO("");
				// ��Ɠ�
				printBlankStruct.setOPR_DATE("");
				// ����
				printBlankStruct.setPRINT_QTY("");
				printList.add(printBlankStruct);
			}
			String printId1 = "AD01200101"; // ���[ID���w�肵�Ă�������
			ret = svf.VrInit(printId1); // PDF�쐬�J�n
			pdfFilePath = svf.getPdfFilePath(); // pdf�t���p�X�t�@�C����
			pdfFileName = svf.getPdfFileName(); // pdf�t�@�C�����iWeb�p�j
			int no = 0;
			for (int i = 0; i < printList.size(); i++) {
				strPdf = (AD0120010Struct) printList.get(i);
				// �i�ڔԍ�
				ret = svf.VrsOut("ITEM_CD", strPdf.getITEM_CD());
				// �i�ږ���
				ret = svf.VrsOut("ITEM_NAME", strPdf.getITEM_NAME());
				// �׎p�P�ʐ���
				ret = svf.VrsOut("PKG_UNIT_QTY", strPdf.getPKG_UNIT_QTY());
				// �P��
				ret = svf.VrsOut("STOCK_UNIT", strPdf.getSTOCK_UNIT());
				// ���i�[�Ǘ��ԍ�
				ret = svf.VrsOut("IDENT_CARD_CTL_NO", strPdf.getIDENT_CARD_CTL_NO());
				// �݌Ƀ��b�g�ԍ�
				ret = svf.VrsOut("LOT_NO", strPdf.getLOT_NO());
				// ����
				ret = svf.VrsOut("JOB_ODR_CD", strPdf.getJOB_ODR_CD());
				// ���ѐ���
				ret = svf.VrsOut("IDENT_CARD_QTY", strPdf.getIDENT_CARD_QTY());
				// ��Ǝw���ԍ�
				ret = svf.VrsOut("OPR_INST_CD", strPdf.getOPR_INST_CD());
				// �����
				ret = svf.VrsOut("PARTIAL_PRD_NO", strPdf.getPARTIAL_PRD_NO());
				// ��Ɠ�
				ret = svf.VrsOut("OPR_DATE", strPdf.getOPR_DATE());
				// ����
				ret = svf.VrsOut("PRINT_QTY", null);
				ret = svf.VrsOut("PAGE_NO", null);
				// �\�[�g �y�[�W�p
				ret = svf.VrsOut("NO", Integer.toString(no++));
				ret = svf.VrEndRecord();
				ret = svf.VrEndPage(); // ���y�[�W���s
			}
			
			ret = svf.VrPrint(); // PDF�쐬�I��
			ret = svf.VrQuit(); // PDF�쐬�I��
			if ("0".equals(printType)) { // �N���C�A���g����̏ꍇ
				struct.setDOWNLOAD_FILE(getPdfFileName());
			} else if ("1".equals(printType)) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			controlSelect();
		}catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlNullPrint>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlNullPrint");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			// ���i�[�o�̓^�C�~���O�̎擾
			List checkList = entity.mSYS_PARAMETER.read(conn, struct);
			if (checkList.isEmpty()) {
				ExpjMessage emsg = new ExpjMessage("AD34030");
				sysLog.severe(emsg, getsysUSER_CD());          //�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(emsg);    // �G�N�Z�v�V�����𐶐�
				throw ee;
			} else {
				String flag = ((AD0120010Struct)checkList.get(0)).getIDENT_CARD();
				// ����ꍇ
				if ("1".equals(flag)) {
					ExpjMessage emsg = new ExpjMessage("AD34030");
					sysLog.severe(emsg, getsysUSER_CD());          //�v���I�G���[ �G���[���e
					ExpjException ee = new ExpjException(emsg);    // �G�N�Z�v�V�����𐶐�
					throw ee;
				}
			}
			// �V�X�e���p�����[�^�iTIME_CTRL�j�擾
			List timeCtrlList = entity.mSELECT_TIME_CTRL.read(conn, struct);
			if(timeCtrlList.isEmpty()){
				struct.setTIME_CTRL(null);
			}else{			
				struct.setTIME_CTRL(((AD0120010Struct)timeCtrlList.get(0)).getTIME_CTRL());
			}
			// �u���[�o�́v�}�X�N�t���O(BTN_PRINT_MASK)�擾
			List maskFlgList = entity.mSELECT_MASK_FLG.read(conn, struct);
			if (maskFlgList.isEmpty()) {
				struct.seth_MASK_FLG(null);
			} else {
				struct.seth_MASK_FLG(((AD0120010Struct)maskFlgList.get(0)).getMASK_FLG());
			}
		} catch (ExpjException ee){
        	throw ee;
        } catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// �v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// �_�E�����[�h�t�@�C�����N���A
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
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("NullPrint") ) {
				controlNullPrint();
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
//			throw new FoundationException("AD0120010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0120010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0120010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0120010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0120010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0120010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0120010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0120010Entity entity;
	protected AD0120010Struct struct;
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

		entity = new AD0120010Entity();
		struct = new AD0120010Struct();

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
	 * AD0120010�N���X�̕W���R���X�g���N�^
	 */
	public AD0120010Control() throws BusinessProcessException, FoundationException
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
				AD0120010Struct key = (AD0120010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_FROM") && key.getIN_WORK_ODR_DLV_DATE_FROM() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATE_FROM", key.getIN_WORK_ODR_DLV_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_FROM") && key.getIN_WORK_ODR_DLV_TIME_FROM() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_TIME_FROM", key.getIN_WORK_ODR_DLV_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_TO") && key.getIN_WORK_ODR_DLV_DATE_TO() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATE_TO", key.getIN_WORK_ODR_DLV_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_TO") && key.getIN_WORK_ODR_DLV_TIME_TO() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_TIME_TO", key.getIN_WORK_ODR_DLV_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP_SHOW") && key.getl_OPR_RSLT_TYP_SHOW() != null) {
					msgKey.setKeyValue("l_OPR_RSLT_TYP_SHOW", key.getl_OPR_RSLT_TYP_SHOW());
				}
				if(msgKeyType.containsKeyColumn("h_l_MASK_FLG") && key.geth_l_MASK_FLG() != null) {
					msgKey.setKeyValue("h_l_MASK_FLG", key.geth_l_MASK_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_MASK_FLG") && key.geth_MASK_FLG() != null) {
					msgKey.setKeyValue("h_MASK_FLG", key.geth_MASK_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_l_MAX_PRINT_QTY") && key.geth_l_MAX_PRINT_QTY() != null) {
					msgKey.setKeyValue("h_l_MAX_PRINT_QTY", key.geth_l_MAX_PRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_FROM") && key.getOPR_INST_START_DATE_FROM() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_FROM", key.getOPR_INST_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME_FROM") && key.getOPR_INST_START_TIME_FROM() != null) {
					msgKey.setKeyValue("OPR_INST_START_TIME_FROM", key.getOPR_INST_START_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_TO") && key.getOPR_INST_START_DATE_TO() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_TO", key.getOPR_INST_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME_TO") && key.getOPR_INST_START_TIME_TO() != null) {
					msgKey.setKeyValue("OPR_INST_START_TIME_TO", key.getOPR_INST_START_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO") && key.getIDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("IDENT_CARD_CTL_NO", key.getIDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAGE_NO") && key.getPAGE_NO() != null) {
					msgKey.setKeyValue("PAGE_NO", key.getPAGE_NO());
				}
				if(msgKeyType.containsKeyColumn("h_l_OPR_RSLT_TYP") && key.geth_l_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("h_l_OPR_RSLT_TYP", key.geth_l_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_WS_CD") && key.getl_WS_CD() != null) {
					msgKey.setKeyValue("l_WS_CD", key.getl_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WS_NAME") && key.getl_WS_NAME() != null) {
					msgKey.setKeyValue("l_WS_NAME", key.getl_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE") && key.getl_WORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_WORK_ODR_DLV_DATE", key.getl_WORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE") && key.getl_OPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("l_OPR_INST_START_DATE", key.getl_OPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY") && key.getl_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("l_OPR_INST_QTY", key.getl_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_SUM_IDENT_CARD_QTY") && key.getl_SUM_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("l_SUM_IDENT_CARD_QTY", key.getl_SUM_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_PKG_UNIT_QTY") && key.getl_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("l_PKG_UNIT_QTY", key.getl_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_CD") && key.getl_OPR_INST_CD() != null) {
					msgKey.setKeyValue("l_OPR_INST_CD", key.getl_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_l_JOB_ODR_CD") && key.geth_l_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_l_JOB_ODR_CD", key.geth_l_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_l_STOCK_UNIT") && key.geth_l_STOCK_UNIT() != null) {
					msgKey.setKeyValue("h_l_STOCK_UNIT", key.geth_l_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PRINT_QTY") && key.getl_PRINT_QTY() != null) {
					msgKey.setKeyValue("l_PRINT_QTY", key.getl_PRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATETIME_FROM") && key.getIN_WORK_ODR_DLV_DATETIME_FROM() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATETIME_FROM", key.getIN_WORK_ODR_DLV_DATETIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATETIME_TO") && key.getIN_WORK_ODR_DLV_DATETIME_TO() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATETIME_TO", key.getIN_WORK_ODR_DLV_DATETIME_TO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATETIME_FROM") && key.getOPR_INST_START_DATETIME_FROM() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATETIME_FROM", key.getOPR_INST_START_DATETIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATETIME_TO") && key.getOPR_INST_START_DATETIME_TO() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATETIME_TO", key.getOPR_INST_START_DATETIME_TO());
				}
				if(msgKeyType.containsKeyColumn("MAX_LINE") && key.getMAX_LINE() != null) {
					msgKey.setKeyValue("MAX_LINE", key.getMAX_LINE());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD") && key.getIDENT_CARD() != null) {
					msgKey.setKeyValue("IDENT_CARD", key.getIDENT_CARD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY") && key.getPKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("PKG_UNIT_QTY", key.getPKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("PRINT_QTY") && key.getPRINT_QTY() != null) {
					msgKey.setKeyValue("PRINT_QTY", key.getPRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY") && key.getIDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("IDENT_CARD_QTY", key.getIDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("MASK_FLG") && key.getMASK_FLG() != null) {
					msgKey.setKeyValue("MASK_FLG", key.getMASK_FLG());
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
					AD0120010Struct key = new AD0120010Struct();
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_FROM")) {
						key.setIN_WORK_ODR_DLV_DATE_FROM(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_FROM")) {
						key.setIN_WORK_ODR_DLV_TIME_FROM(msgKey.getKeyValue("IN_WORK_ODR_DLV_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_TO")) {
						key.setIN_WORK_ODR_DLV_DATE_TO(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_TO")) {
						key.setIN_WORK_ODR_DLV_TIME_TO(msgKey.getKeyValue("IN_WORK_ODR_DLV_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP_SHOW")) {
						key.setl_OPR_RSLT_TYP_SHOW(msgKey.getKeyValue("l_OPR_RSLT_TYP_SHOW"));
					}
					if(msgKeyType.containsKeyColumn("h_l_MASK_FLG")) {
						key.seth_l_MASK_FLG(msgKey.getKeyValue("h_l_MASK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_MASK_FLG")) {
						key.seth_MASK_FLG(msgKey.getKeyValue("h_MASK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_l_MAX_PRINT_QTY")) {
						key.seth_l_MAX_PRINT_QTY(msgKey.getKeyValue("h_l_MAX_PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_FROM")) {
						key.setOPR_INST_START_DATE_FROM(msgKey.getKeyValue("OPR_INST_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME_FROM")) {
						key.setOPR_INST_START_TIME_FROM(msgKey.getKeyValue("OPR_INST_START_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_TO")) {
						key.setOPR_INST_START_DATE_TO(msgKey.getKeyValue("OPR_INST_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME_TO")) {
						key.setOPR_INST_START_TIME_TO(msgKey.getKeyValue("OPR_INST_START_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO")) {
						key.setIDENT_CARD_CTL_NO(msgKey.getKeyValue("IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAGE_NO")) {
						key.setPAGE_NO(msgKey.getKeyValue("PAGE_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_l_OPR_RSLT_TYP")) {
						key.seth_l_OPR_RSLT_TYP(msgKey.getKeyValue("h_l_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_CD")) {
						key.setl_WS_CD(msgKey.getKeyValue("l_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_NAME")) {
						key.setl_WS_NAME(msgKey.getKeyValue("l_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE")) {
						key.setl_WORK_ODR_DLV_DATE(msgKey.getKeyValue("l_WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE")) {
						key.setl_OPR_INST_START_DATE(msgKey.getKeyValue("l_OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY")) {
						key.setl_OPR_INST_QTY(msgKey.getKeyValue("l_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_SUM_IDENT_CARD_QTY")) {
						key.setl_SUM_IDENT_CARD_QTY(msgKey.getKeyValue("l_SUM_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_PKG_UNIT_QTY")) {
						key.setl_PKG_UNIT_QTY(msgKey.getKeyValue("l_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_CD")) {
						key.setl_OPR_INST_CD(msgKey.getKeyValue("l_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_l_JOB_ODR_CD")) {
						key.seth_l_JOB_ODR_CD(msgKey.getKeyValue("h_l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_l_STOCK_UNIT")) {
						key.seth_l_STOCK_UNIT(msgKey.getKeyValue("h_l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PRINT_QTY")) {
						key.setl_PRINT_QTY(msgKey.getKeyValue("l_PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATETIME_FROM")) {
						key.setIN_WORK_ODR_DLV_DATETIME_FROM(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATETIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATETIME_TO")) {
						key.setIN_WORK_ODR_DLV_DATETIME_TO(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATETIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATETIME_FROM")) {
						key.setOPR_INST_START_DATETIME_FROM(msgKey.getKeyValue("OPR_INST_START_DATETIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATETIME_TO")) {
						key.setOPR_INST_START_DATETIME_TO(msgKey.getKeyValue("OPR_INST_START_DATETIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("MAX_LINE")) {
						key.setMAX_LINE(msgKey.getKeyValue("MAX_LINE"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD")) {
						key.setIDENT_CARD(msgKey.getKeyValue("IDENT_CARD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY")) {
						key.setPKG_UNIT_QTY(msgKey.getKeyValue("PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_QTY")) {
						key.setPRINT_QTY(msgKey.getKeyValue("PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY")) {
						key.setIDENT_CARD_QTY(msgKey.getKeyValue("IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("MASK_FLG")) {
						key.setMASK_FLG(msgKey.getKeyValue("MASK_FLG"));
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
