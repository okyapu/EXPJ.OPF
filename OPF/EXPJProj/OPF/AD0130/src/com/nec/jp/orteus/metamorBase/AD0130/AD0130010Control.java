/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0130/src/com/nec/jp/orteus/metamorBase/AD0130/AD0130010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0130;

import com.nec.jp.orteus.metamorBase.AD0130.*;
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
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0130010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.8 $ $Date: 2016/01/15 07:18:29 $
 * �C������
 *
 */
//}}user_implement_code_header

public class AD0130010Control
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
	public AD0130010Struct getListvalue(int x) { return (AD0130010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AD0130010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AD0130010Struct createStruct() { return new AD0130010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AD0130010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

    /**
     * ��ʑJ�ڃp�����[�^
     */
    private String _P_DAILY_WORK_REPORT_TYP = null;
    protected void setP_DAILY_WORK_REPORT_TYP(String val) { _P_DAILY_WORK_REPORT_TYP = val; }
    protected String getP_DAILY_WORK_REPORT_TYP() { return _P_DAILY_WORK_REPORT_TYP; }
    private String _P_PLANT_CD = null;
    protected void setP_PLANT_CD(String val) { _P_PLANT_CD = val; }
    protected String getP_PLANT_CD() { return _P_PLANT_CD; }
    private String _P_OPR_DATE_FROM = null;
    protected void setP_OPR_DATE_FROM(String val) { _P_OPR_DATE_FROM = val; }
    protected String getP_OPR_DATE_FROM() { return _P_OPR_DATE_FROM; }
    private String _P_OPR_DATE_TO = null;
    protected void setP_OPR_DATE_TO(String val) { _P_OPR_DATE_TO = val; }
    protected String getP_OPR_DATE_TO() { return _P_OPR_DATE_TO; }
    private String _P_USER_CD = null;
    protected void setP_USER_CD(String val) { _P_USER_CD = val; }
    protected String getP_USER_CD() { return _P_USER_CD; }
    private String _P_WS_CD = null;
    protected void setP_WS_CD(String val) { _P_WS_CD = val; }
    protected String getP_WS_CD() { return _P_WS_CD; }
	
	/**
	  * ��ЃR�[�h���Q�b�g
	  * @return
	*/
	public String getPlantCd() {
		return sysPLANT_CD;
	}
	
    /** �Ɩ��^�p�� */
	private String _BUSINESS_OPR_DATE = null;
	/**
	  * �Ɩ��^�p�����Q�b�g
	  * @return
	*/
	public String getBusinessOprDate() {
		return _BUSINESS_OPR_DATE;
	}
	/**
	 * �Ɩ��^�p�����Z�b�g
	 * @param cd
	 */
	public void setBusinessOprDate(String cd){
		_BUSINESS_OPR_DATE = cd;
	}
	
    /** ��Ǝ��Ԃ̏���l */
	private String _MAX_OPR_TIME = null;
	/**
	  * ��Ǝ��Ԃ̏���l���Q�b�g
	  * @return
	*/
	public String getMaxOprTime() {
		return _MAX_OPR_TIME;
	}
	/**
	 * ��Ǝ��Ԃ̏���l���Z�b�g
	 * @param cd
	 */
	public void setMaxOprTime(String cd){
		_MAX_OPR_TIME = cd;
	}
	
	/** ��s�\������ */
	private String _ADD_LINE_CNT = null;
	/**
	  * ��s�\���������Q�b�g
	  * @return
	*/
	public String getAddLineCnt() {
		return _ADD_LINE_CNT;
	}
	/**
	 * ��s�\���������Z�b�g
	 * @param cd
	 */
	public void setAddLineCnt(String cd){
		_ADD_LINE_CNT = cd;
	}
	
	/** ���Y���\���t�H�[�}�b�g */
	private String _PRD_QTY_FORMAT = null;
	/**
	  * ���Y���\���t�H�[�}�b�g���Q�b�g
	  * @return
	*/
	public String getPrdQtyFormat() {
		return _PRD_QTY_FORMAT;
	}
	/**
	 * ���Y���\���t�H�[�}�b�g���Z�b�g
	 * @param cd
	 */
	public void setPrdQtyFormat(String cd){
		_PRD_QTY_FORMAT = cd;
	}
	
	/** �l���\���t�H�[�}�b�g */
	private String _WORKER_QTY_FORMAT = null;
	/**
	  * �l���\���t�H�[�}�b�g���Q�b�g
	  * @return
	*/
	public String getWorkerQtyFormat() {
		return _WORKER_QTY_FORMAT;
	}
	/**
	 * �l���\���t�H�[�}�b�g���Z�b�g
	 * @param cd
	 */
	public void setWorkerQtyFormat(String cd){
		_WORKER_QTY_FORMAT = cd;
	}
	
	/** �s��Ǝ��ԁi���j�\���t�H�[�}�b�g */
	private String _UN_OPR_TIME_FORMAT = null;
	/**
	  * �s��Ǝ��ԁi���j�\���t�H�[�}�b�g���Q�b�g
	  * @return
	*/
	public String getUnOprTimeFormat() {
		return _UN_OPR_TIME_FORMAT;
	}
	/**
	 * �s��Ǝ��ԁi���j�\���t�H�[�}�b�g���Z�b�g
	 * @param cd
	 */
	public void setUnOprTimeFormat(String cd){
		_UN_OPR_TIME_FORMAT = cd;
	}
	
	// ��Ɠ���E�l���񃁃��e�i���X�p
	AD0130010Struct mainStruct = new AD0130010Struct();
	
	// ����敪�̃R���{�{�b�N�X�f�[�^
	private ComboStruct COM_DAILY_WORK_REPORT_TYP = null;
	/**
	  * ����敪���Q�b�g
	  * @return
	*/
	public ComboStruct getComDailyWorkReportTyp() {
		return COM_DAILY_WORK_REPORT_TYP;
	}
	/**
	 * ����敪���Z�b�g
	 * @param cs
	 */
	public void setComDailyWorkReportTyp(ComboStruct cs){
		COM_DAILY_WORK_REPORT_TYP = cs;
	}
	
	// ��Ƌ敪�̃R���{�{�b�N�X�f�[�^
	private ComboStruct COM_OPR_TYP = null;
	/**
	  * ��Ƌ敪���Q�b�g
	  * @return
	*/
	public ComboStruct getComOprTyp() {
		return COM_OPR_TYP;
	}
	/**
	 * ��Ƌ敪���Z�b�g
	 * @param cs
	 */
	public void setComOprTyp(ComboStruct cs){
		COM_OPR_TYP = cs;
	}
	
	// �s��Ɨ��R�敪�̃R���{�{�b�N�X�f�[�^
	private ComboStruct COM_UN_OPR_CAUSE_TYP = null;
	/**
	  * �s��Ɨ��R�敪���Q�b�g
	  * @return
	*/
	public ComboStruct getComUnOprCauseTyp() {
		return COM_UN_OPR_CAUSE_TYP;
	}
	/**
	 * �s��Ɨ��R�敪���Z�b�g
	 * @param cs
	 */
	public void setComUnOprCauseTyp(ComboStruct cs){
		COM_UN_OPR_CAUSE_TYP = cs;
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
     * ���O���b�Z�[�W�ݒ�
     * @param �o�̓��b�Z�[�W
     */
    private void setSyslogConfig(String message)
    {
       ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
       sysLog.config(emsg, getsysUSER_CD());
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
	 * �Ɩ����W�b�N�̃G���[���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
	 * @param code ���b�Z�[�W�R�[�h
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
	 * �Ɩ����W�b�N�̃C���t�H���[�V�����ݒ菈����؂�o���Ċ֐���
	 * @param code
	 * @param msg1
	 */
	private void setInfoMessage(String code,String msg1) {
		ExpjMessage emsg = new ExpjMessage(code,msg1);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
	 * Struct��copy
	 * @param beforeStruct
	 * @param afterStruct
	 */
	private void copyStruct(AD0130010Struct beforeStruct, AD0130010Struct afterStruct) {
		// ����敪
		afterStruct.setDAILY_WORK_REPORT_TYP(beforeStruct.getDAILY_WORK_REPORT_TYP());
		// �H��R�[�h
		afterStruct.setPLANT_CD(beforeStruct.getPLANT_CD());
		// �H��R�[�h
		afterStruct.setUSER_PLANT_CD(beforeStruct.getUSER_PLANT_CD());
		// �H�ꖼ
		afterStruct.setPLANT_NAME(beforeStruct.getPLANT_NAME());
		// ��Ɠ�
		afterStruct.setOPR_DATE_FROM(beforeStruct.getOPR_DATE_FROM());
		afterStruct.setOPR_DATE_TO(beforeStruct.getOPR_DATE_TO());
		// ���[�U�R�[�h
		afterStruct.setUSER_CD(beforeStruct.getUSER_CD());
		// ���[�U��
		afterStruct.setUSER_NAME(beforeStruct.getUSER_NAME());
		// ���C���R�[�h
		afterStruct.setWS_CD(beforeStruct.getWS_CD());
		// ���C����
		afterStruct.setWS_NAME(beforeStruct.getWS_NAME());
	}
	
	/**
	 * struct��clear
	 */
	private void clearMainStruct() {
		// ����敪
		struct.setDAILY_WORK_REPORT_TYP(null);
		// �H��R�[�h
		struct.setPLANT_CD(null);
		// �H�ꖼ
		struct.setPLANT_NAME(null);
		// ��Ɠ�
		struct.setOPR_DATE_FROM(null);
		struct.setOPR_DATE_TO(null);
		// ���[�U�R�[�h
		struct.setUSER_CD(null);
		// ���[�U��
		struct.setUSER_NAME(null);
		// ���C���R�[�h
		struct.setWS_CD(null);
		// ���C����
		struct.setWS_NAME(null);
	}
	
	/**
	 * �`�F�b�N����
	 * @param time ����
	 * @return boolean 
	 * @throws FoundationException,SQLException
	 */
	private boolean checkTimeFormat(String time) throws FoundationException,SQLException
	{
		/* ������3���̏ꍇ�͐擪��0��t������ */
		if(time.length() == 3) {
			time = "0" + time;
		}

		/* �����̎��Ԃ�"00"�`"23"�̊ԈȊO�̏ꍇ�̓G���[�Ƃ��� */
		if(Integer.parseInt(time.substring(0,2)) < 0 || Integer.parseInt(time.substring(0,2)) > 23) {
			return false;
		}

		/* �����̕���"00"�`"59"�̊ԈȊO�̏ꍇ�̓G���[�Ƃ��� */
		if(Integer.parseInt(time.substring(2,4)) < 0 || Integer.parseInt(time.substring(2,4)) > 59) {
			return false;
		}

		/* ����I�� */
		return true;
	}
	
	/**
	 * �����\��
	 * @param time ����
	 * @param colonFlag :�t���O
	 * @return String 
	 * @throws FoundationException,SQLException
	 */
	private String changeTimeFormat(String time, boolean colonFlag)
	{
		/* ������3���̏ꍇ�͐擪��0��t������ */
		if (time == null || "".equals(time) || (time.length() != 3 && time.length() != 4)) {
			return time;
		}
		if(time.length() == 3) {
			time = "0" + time;
		}
		if (colonFlag && time.length() == 4) {
			time = time.substring(0,2) + ":" + time.substring(2,4);
		}
		
		/* ����I�� */
		return time;
	}
	
	
	/**
	 * �X�V�����i�l����j
	 * @param updateFlag �o�^�@�X�V�t���O
	 */
	private void updateWorker(boolean updateFlag) throws BusinessProcessException, FoundationException {
		try {
			String property = "OrteusUserDic";
			String locale = CoreTools.getLocale(sysUSER_CD); //  �����ꍀ�ڎ擾�Ή�
			ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
			String lineNo= CoreTools.getRBString("Expj.Cmt6789", resource);
			
			// �x���t���O
			String holidayFlg = "";
			// ���C���R�[�hnull�J�E���g
			int lineNullCount  = 0;
			list.clear();
			// ���׍s�`�F�b�N
			AD0130010Struct checkStruct = new AD0130010Struct();	
			for (int i = 0; i < struct.getList_l_SEQ_NO().size(); i++) {
				checkStruct = new AD0130010Struct();
				// �s�ԍ�
				checkStruct.setl_SEQ_NO((String)struct.getList_l_SEQ_NO().get(i));
				// ���C���R�[�h
				checkStruct.setl_WS_CD((String)struct.getList_l_WS_CD().get(i));
				if (checkStruct.getl_WS_CD() == null || "".equals(checkStruct.getl_WS_CD())) {
					// ���C����
					checkStruct.setl_WS_NAME(null);
					// null�J�E���g
					lineNullCount++;
				} else {
					// ���C����
					checkStruct.setl_WS_NAME((String)struct.getList_l_WS_NAME().get(i));
				}
				// �J�n����
				checkStruct.setl_START_TIME((String)struct.getList_l_START_TIME().get(i));
				// �I������
				checkStruct.setl_END_TIME((String)struct.getList_l_END_TIME().get(i));
				// ���ԁi���j
				checkStruct.setl_OPR_TIME("0");
				// ��Ƌ敪
				checkStruct.setl_OPR_TYP((String)struct.getList_l_OPR_TYP().get(i));
				// �s��Ɨ��R
				checkStruct.setl_UN_OPR_CAUSE_TYP((String)struct.getList_l_UN_OPR_CAUSE_TYP().get(i));
				// �s��Ǝ��ԁi���j
				checkStruct.setl_UN_OPR_TIME((String)struct.getList_l_UN_OPR_TIME().get(i));
				// ���l
				checkStruct.setl_REMARKS((String)struct.getList_l_REMARKS().get(i));
				// �X�V��
				checkStruct.seth_l_MODIFY_COUNT((String)struct.getList_h_l_MODIFY_COUNT().get(i));
				list.add(checkStruct);
			}
			String strline = String.valueOf(lineNullCount);
			// ���C���R�[�h���S�ē��͂���Ă��Ȃ��ꍇ
			if(strline.equals(checkStruct.getl_SEQ_NO())){
				setErrorMessage("AD61011");
				return;
			}
			// ���[�U��
			struct.setUSER_NAME(null);
			// �Ζ��V�t�g��
			struct.setWORK_SHIFT_NAME(null);
			
			List resultList = new ArrayList();

			// ���[�U�R�[�h
			resultList = entity.mselectUSER_MST_PLANT.read(conn, struct);
			if (resultList.isEmpty()) {
				// ���[�U��
				struct.setUSER_NAME(null);
				// ���O�C�����[�U�[�́g�H��R�[�h�h
				struct.setUSER_PLANT_CD(sysPLANT_CD);
			} else {
				// ���[�U��
				struct.setUSER_NAME(((AD0130010Struct)resultList.get(0)).getUSER_NAME());
				// [���[�U�}�X�^].�g�H��R�[�h�h
				struct.setUSER_PLANT_CD(((AD0130010Struct)resultList.get(0)).getUSER_PLANT_CD());
			}
			// ��Ɠ�
			struct.setw_USER_CD(struct.getUSER_CD());
			resultList = entity.mselectM_CAL_2.read(conn, struct);
			if (resultList.isEmpty()) {
				setErrorMessage("ZZ06002");
				return;
			} else {
				holidayFlg = ((AD0130010Struct)resultList.get(0)).getHOLIDAY_FLG();
			}

			// �Ζ��V�t�g
			resultList = entity.mselectUM_WORK_SHIFT_H.read(conn, struct);
			if (resultList.isEmpty()) {
				setErrorMessage("AD61003");
				return;
			} else {
				// �Ζ��V�t�g��
				struct.setWORK_SHIFT_NAME(((AD0130010Struct)resultList.get(0)).getWORK_SHIFT_NAME());
			}
			
			AD0130010Struct tempStruct = new AD0130010Struct();
			// �W�v���ԁi���j
			String totalOprTime = "0";
			for (int i = 0; i < list.size(); i++) {
				checkStruct = (AD0130010Struct) list.get(i);
				// ���C���R�[�h
				if (checkStruct.getl_WS_CD() == null || "".equals(checkStruct.getl_WS_CD())) {
					if ( (checkStruct.getl_START_TIME() != null && !"".equals(checkStruct.getl_START_TIME()))
							|| (checkStruct.getl_END_TIME() != null && !"".equals(checkStruct.getl_END_TIME()))
							|| (checkStruct.getl_OPR_TYP() != null && !"".equals(checkStruct.getl_OPR_TYP()) && !"0".equals(checkStruct.getl_OPR_TYP()))
							) {
						setErrorMessage("AD20057");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					}
				} else {
					// ���O�C�����[�U�̏����H��R�[�h
					tempStruct.setPLANT_CD(sysPLANT_CD);
					// ���C���R�[�h
					tempStruct.setWS_CD(checkStruct.getl_WS_CD());
					resultList = entity.mselectM_WS_PLANT.read(conn, tempStruct);
					if (resultList.isEmpty()) {
						// ���C����
						checkStruct.setl_WS_NAME(null);
						setErrorMessage("AA01003");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					} else {
						// ���C����
						checkStruct.setl_WS_NAME(((AD0130010Struct)resultList.get(0)).getWS_NAME());
					}
					
					// �J�n�����E�I������
					if (checkStruct.getl_START_TIME() == null || "".equals(checkStruct.getl_START_TIME()) 
							|| checkStruct.getl_END_TIME() == null || "".equals(checkStruct.getl_END_TIME())) {
						setErrorMessage("AD61004");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					} else {
						if (checkStruct.getl_START_TIME().length() < 3 || checkStruct.getl_END_TIME().length() < 3) {
							setErrorMessage("AD61005");
							setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
							return;
						} else {
							if (!checkTimeFormat(checkStruct.getl_START_TIME()) || !checkTimeFormat(checkStruct.getl_END_TIME()) ) {
								setErrorMessage("AD61006");
								setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
								return;
							}
							// ���ԑяd���`�F�b�N
							AD0130010Struct timeStruct = new AD0130010Struct();
							for (int j = 0; j < i; j++) {
								timeStruct = (AD0130010Struct) list.get(j);
								if (timeStruct.getl_START_TIME() != null && !"".equals(timeStruct.getl_START_TIME())) {
									if (!checkTime(timeStruct.getl_START_TIME(), timeStruct.getl_END_TIME(), checkStruct.getl_START_TIME(), checkStruct.getl_END_TIME())) {
										setErrorMessage("AD61007");
										setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
										return;
									}
								}
							}
						}
					}
				}
				// �s��Ɨ��R
				if ("0".equals(checkStruct.getl_UN_OPR_CAUSE_TYP())) {
					if (!"0".equals(checkStruct.getl_UN_OPR_TIME())) {
						setErrorMessage("AD61008");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					}
				} else {
					// �s��Ǝ���
					if ("0".equals(checkStruct.getl_UN_OPR_TIME())) {
						setErrorMessage("AD61009");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					}
				}
				if ( checkStruct.getl_START_TIME() != null && !"".equals(checkStruct.getl_START_TIME())
						&& checkStruct.getl_END_TIME() != null && !"".equals(checkStruct.getl_END_TIME())) {
					// ���ԁi���j
					checkStruct.setl_OPR_TIME(getTimeCalculate(struct.getWORK_SHIFT_CODE(), checkStruct.getl_START_TIME(), checkStruct.getl_END_TIME()));
					if ("".equals(checkStruct.getl_OPR_TIME())) {
						setErrorMessage("AD61010", lineNo + checkStruct.getl_SEQ_NO());
						return;
					}
				}
				// �s��Ǝ��ԁi���j
				String unOprTime = checkStruct.getl_UN_OPR_TIME();
				String oprTime = checkStruct.getl_OPR_TIME();
				if (oprTime == null || "".equals(oprTime)) {
					oprTime = "0";
				} 
				if (unOprTime == null || "".equals(unOprTime)) {
					unOprTime = "0";
				}

				if (checkStruct.getl_WS_CD() == null || "".equals(checkStruct.getl_WS_CD())) {
					if (!"0".equals(checkStruct.getl_UN_OPR_CAUSE_TYP())) {
						setErrorMessage("AD20057");
						setErrorMessage("ZZ01006", lineNo + checkStruct.getl_SEQ_NO());
						return;
					}
				}
				if (updateFlag && checkStruct.geth_l_MODIFY_COUNT() != null && !"".equals(checkStruct.geth_l_MODIFY_COUNT())) {
					// �X�V��
					checkStruct.seth_DAILY_WORK_REPORT_CTL_NO(struct.geth_DAILY_WORK_REPORT_CTL_NO());
					resultList = entity.mselectUT_DAILY_WORK_REPORT_MODIFY.read(conn, checkStruct);
					if (resultList.isEmpty()) {
						setErrorMessage("ZZ01105");
						return;
					} else {
						tempStruct = (AD0130010Struct) resultList.get(0);
						String modifyCount = tempStruct.getMODIFY_COUNT();
						if (!modifyCount.equals(checkStruct.geth_l_MODIFY_COUNT())) {
							setErrorMessage("ZZ01105");
							return;
						}
					}
				}
				// �W�v���ԁi���j
				totalOprTime = Calculate.add(totalOprTime, oprTime);
			}
			// ���ԑяd���`�F�b�N
			AD0130010Struct timeStruct = new AD0130010Struct();
			AD0130010Struct timeStruct2 = new AD0130010Struct();
			for (int j = 0; j < list.size(); j++) {
				timeStruct = (AD0130010Struct) list.get(j);
				if (timeStruct.getl_WS_CD() != null && !"".equals(timeStruct.getl_WS_CD())) {
					for(int m = 0; m < list.size(); m++){
						if (m == j){
							continue;
						}
						timeStruct2 = (AD0130010Struct) list.get(m);
						if (timeStruct2.getl_WS_CD() != null && !"".equals(timeStruct2.getl_WS_CD())) {
							if (!checkTime(timeStruct2.getl_START_TIME(), timeStruct2.getl_END_TIME(), timeStruct.getl_START_TIME(), timeStruct.getl_END_TIME())) {
								setErrorMessage("AD61014");
								setErrorMessage("ZZ01006", lineNo + timeStruct.getl_SEQ_NO());
								return;
							}
						}
						
					}
				}
			}
			
			// ��Ǝ��Ԃ�����𒴂����ꍇ
			if (Calculate.compare(totalOprTime, _MAX_OPR_TIME) > 0) {
				setErrorMessage("AD61012");
				return;
			}
			// �g�x���t���O�h = 1 (�x��) �̏ꍇ
			if ("1".equals(holidayFlg)) {
				setWarningMessage("AD61013");
			} 
			conn.beginTransWeb();
			if (updateFlag) {
				AD0130010Struct deleteStruct = new AD0130010Struct();
				deleteStruct.seth_DAILY_WORK_REPORT_CTL_NO(struct.geth_DAILY_WORK_REPORT_CTL_NO());
				// �폜
				entity.mdeleteUT_DAILY_WORK_REPORT.delete(conn, deleteStruct);
			}
			
			// ��Ǝ��ԑяd���`�F�b�N
			timeStruct = new AD0130010Struct();
			AD0130010Struct timeResultStruct = new AD0130010Struct();
			timeStruct.setOPR_DATE(struct.getOPR_DATE());
			timeStruct.setUSER_CD(struct.getUSER_CD());
			// �l����
			timeStruct.setDAILY_WORK_REPORT_TYP("1");
			resultList = entity.mselectUT_DAILY_WORK_REPORT_TIME.read(conn, timeStruct);
			for (int j = 0; j < list.size(); j++) {
				checkStruct = (AD0130010Struct) list.get(j);
				if (checkStruct.getl_WS_CD() != null && !"".equals(checkStruct.getl_WS_CD())) {
					for (int i = 0; i < resultList.size(); i++) {
						timeResultStruct = (AD0130010Struct) resultList.get(i);
						if (!checkTime(timeResultStruct.getSTART_TIME(), timeResultStruct.getEND_TIME(), checkStruct.getl_START_TIME(), checkStruct.getl_END_TIME())) {
							setErrorMessage("AD61014");
							conn.rollback();
							return;
						}
					}
				}
			}
			// ��Ǝ��Ԃ̏W�v�l�i���j
			resultList = entity.mselectSUM_OPR_TIME.read(conn, timeStruct);
			String totalOprTimeDb = ((AD0130010Struct)resultList.get(0)).getTOTAL_OPR_TIME();
			if (totalOprTimeDb == null || "".equals(totalOprTimeDb)) {
				totalOprTimeDb = "0";
			}
			if (Calculate.compare(Calculate.add(totalOprTime, totalOprTimeDb), _MAX_OPR_TIME) > 0) {
				setErrorMessage("AD61012");
				conn.rollback();
				return;
			}
			AD0130010Struct insertStruct = new AD0130010Struct();
			if (updateFlag) {
				// ��Ɠ���Ǘ��ԍ�
				insertStruct.setDAILY_WORK_REPORT_CTL_NO(struct.geth_DAILY_WORK_REPORT_CTL_NO());
			} else {
			// ��Ɠ���Ǘ��ԍ�
				List nextvalList = entity.mselectUSEQ_DAILY_WORK_REPORT_CTL_NO.read(conn, struct);
				insertStruct.setDAILY_WORK_REPORT_CTL_NO(((AD0130010Struct)nextvalList.get(0)).getDAILY_WORK_REPORT_CTL_NO());
			}
			
			// �H��R�[�h
			insertStruct.setPLANT_CD(struct.getUSER_PLANT_CD());
			// ����敪
			insertStruct.setDAILY_WORK_REPORT_TYP("1");
			// ���[�U�R�[�h
			insertStruct.setUSER_CD(struct.getUSER_CD());
			// ��Ɠ�
			insertStruct.setOPR_DATE(struct.getOPR_DATE());
			// �Ζ��V�t�g
			insertStruct.setWORK_SHIFT_CODE(struct.getWORK_SHIFT_CODE());
			
			AD0130010Struct valueStruct = new AD0130010Struct();
			int lineSeqNo = 0;
			for (int i = 0; i < list.size(); i++) {
				valueStruct = (AD0130010Struct) list.get(i);
				// �s�ԍ�
				if ((valueStruct.getl_WS_CD() == null || "".equals(valueStruct.getl_WS_CD()))
						&& (valueStruct.getl_START_TIME() == null || "".equals(valueStruct.getl_START_TIME()))
						&& (valueStruct.getl_END_TIME() == null || "".equals(valueStruct.getl_END_TIME()))
						&& (valueStruct.getl_REMARKS() == null || "".equals(valueStruct.getl_REMARKS()))
						&& ("0".equals(valueStruct.getl_UN_OPR_TIME()))
						) {
					continue;
				} else {
					lineSeqNo++;
					insertStruct.setSEQ_NO(lineSeqNo + "");
				}
				// ���C���R�[�h
				insertStruct.setWS_CD(valueStruct.getl_WS_CD());
				// �J�n����
				insertStruct.setSTART_TIME(changeTimeFormat(valueStruct.getl_START_TIME(), false));
				// �I������
				insertStruct.setEND_TIME(changeTimeFormat(valueStruct.getl_END_TIME(), false));
				// ��Ǝ���
				insertStruct.setOPR_TIME(valueStruct.getl_OPR_TIME());
				// ��Ƌ敪
				insertStruct.setOPR_TYP(valueStruct.getl_OPR_TYP());
				// �s��Ɨ��R�敪
				insertStruct.setUN_OPR_CAUSE_TYP(valueStruct.getl_UN_OPR_CAUSE_TYP());
				// �s��Ǝ���
				insertStruct.setUN_OPR_TIME(valueStruct.getl_UN_OPR_TIME());
				// ���l
				insertStruct.setREMARKS(valueStruct.getl_REMARKS());
				// �V�X�e�����[�U�R�[�h
				insertStruct.setsUser_ID(sysUSER_CD);
				entity.minsertUT_DAILY_WORK_REPORT.create(conn, insertStruct);
			}
			conn.commit();
		} catch(Exception e) {
			conn.rollback();
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
	}
	
	/**
	 * ��Ǝ��Ԍv�Z
	 * @param workShiftCode �Ζ��V�t�g
	 * @param startTime �J�n����
	 * @param endTime �I������
	 * @return
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private String getTimeCalculate(String workShiftCode, String startTime, String endTime) throws FoundationException, SQLException {
		String time = "";
		AD0130010Struct tempStruct = new AD0130010Struct();
		List resultList = new ArrayList();
		

		if("0000".equals(struct.getSTART_TIME()) && "0000".equals(struct.getEND_TIME())){
			time = "0";
		} else {
			ResourceBundle rb = SystemConfig.getBundle();
			// LOG���[�h
			tempStruct.setPVC2LOGMODE(SystemConfig.getProperty("LOG_MODE", rb));
			// ���O�o�̓��[�h
			tempStruct.setPVC2OUTPUTMODE(SystemConfig.getProperty("OUTPUT_MODE", rb));
			// ���O�o�̓t�@�C���p�X
			tempStruct.setPVC2OUTPUTPATH(SystemConfig.getProperty("OUTPUT_PATH", rb));
			// ���O�o�̓t�@�C����
			tempStruct.setPVC2OUTPUTNAME(SystemConfig.getProperty("OUTPUT_NAME", rb));
			// ���[�U�R�[�h
			tempStruct.setPVC2USERID(this.sysUSER_CD);
			// �Ɩ�ID
			tempStruct.setPVC2BUSINESSNAME("AD0130010");
			// �H��R�[�h
			tempStruct.setPVC2PLANTCD(this.sysPLANT_CD);
			// �Ζ��V�t�g
			tempStruct.setWORK_SHIFT_CODE(workShiftCode);
			// �J�n����
			tempStruct.setSTART_TIME(startTime);
			// �I������
			tempStruct.setEND_TIME(endTime);
			resultList = entity.mcallUSQLOPRTIMECALC.call(conn, tempStruct);
			tempStruct = (AD0130010Struct) resultList.get(0);
			if ("9".equals(tempStruct.getRETURN_STATUS())) {
				String locale = CoreTools.getLocale(sysUSER_CD); //  �����ꍀ�ڎ擾�Ή�
				setErrorMessage("AD61010", new ExpjMessage(tempStruct.getRETURN_MESSAGE()).getMessage(locale));
			} else {
				time = tempStruct.getOPR_TIME();
			}
		}

		return time;
		
	}
	
	/**
	 * ��Ǝ��ԑт̏d���`�F�b�N
	 * @param startTime1�@�J�n����
	 * @param endTime1�@�I������
	 * @param startTime2�@�J�n����
	 * @param endTime2�@�I������
	 * @return
	 */
	private boolean checkTime(String startTime1, String endTime1, String startTime2, String endTime2) {
		if (Calculate.compare(startTime2, endTime2) > 0) {
			if (Calculate.compare(startTime1, startTime2) >= 0 
					|| Calculate.compare(endTime1, startTime2) > 0
					|| Calculate.compare(startTime1, endTime2) < 0
					|| Calculate.compare(endTime1, endTime2) <= 0
					|| (Calculate.compare(startTime1, endTime1) > 0
							&& Calculate.compare(startTime1, startTime2) < 0 
							&& Calculate.compare(endTime1, endTime2) > 0)
					)
			{
				return false;
			}
		} else {
			if (Calculate.compare(startTime1, endTime1) > 0) {
				if (Calculate.compare(startTime1, startTime2) <= 0 
						|| Calculate.compare(startTime1, endTime2) < 0
						|| Calculate.compare(endTime1, startTime2) > 0
						|| Calculate.compare(endTime1, endTime2) >= 0) {
					return false;	
				}
			} else {
				if ((Calculate.compare(startTime1, startTime2) >= 0 
						&& Calculate.compare(startTime1, endTime2) < 0 ) 
						||(Calculate.compare(endTime1, startTime2) > 0
								&& Calculate.compare(endTime1, endTime2) <= 0)
						||(Calculate.compare(startTime1, startTime2) <= 0 
						        && Calculate.compare(endTime1, endTime2) >= 0)) {
					return false;
				}
				
			}
		}
		return true;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			List resultList = new ArrayList();
			// ���X�g���N���A
			setList(null);
			// �H��R�[�h
			struct.setPLANT_NAME(null);
			// ���[�U�R�[�h
			struct.setUSER_NAME(null);
			// ���C���R�[�h
			struct.setWS_NAME(null);
			// �H��R�[�h
			if (struct.getPLANT_CD()!= null && !"".equals(struct.getPLANT_CD())) {
				resultList = entity.mselectM_PLANT.read(conn, struct);
				if (resultList.isEmpty()) {
					setErrorMessage("ZZ09028");
					setReadStatus(ERROR);
					return;
				} else {
					// �H�ꖼ
					struct.setPLANT_NAME(((AD0130010Struct)resultList.get(0)).getPLANT_NAME());
				}
			}

			// ���[�U�R�[�h
			if (struct.getUSER_CD() != null && !"".equals(struct.getUSER_CD())) {

				resultList = entity.mselectUSER_MST_PLANT.read(conn, struct);
				if (resultList.isEmpty()) {
					struct.setUSER_NAME(null);
				} else {
					// ���[�U��
					struct.setUSER_NAME(((AD0130010Struct)resultList.get(0)).getUSER_NAME());
				}
			}
			
			// ���C���R�[�h
			if (struct.getWS_CD() != null && !"".equals(struct.getWS_CD())) {
				resultList = entity.mselectM_WS_PLANT.read(conn, struct);
				if (resultList.isEmpty()) {
					setErrorMessage("AA01003");
					setReadStatus(ERROR);
					return;
				} else {
					// ���C����
					struct.setWS_NAME(((AD0130010Struct)resultList.get(0)).getWS_NAME());
				}
			}
			
			// �\���Ώۂ̃f�[�^���ő�\������
			int maxLine = sp.getMaxLine(conn,10);
			if (maxLine != 0) {
				struct.setMAX_LINE(maxLine + "");
			} else {
				struct.setMAX_LINE(null);
			}
			list = entity.mSelect.read(conn, struct);
			
			if(list == null || list.size()<= 0 ){
				setReadStatus(NORMAL);
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
			AD0130010Struct tempStruct = new AD0130010Struct();
			for (int i = 0; i < list.size(); i++) {
				tempStruct = (AD0130010Struct) list.get(i);
				// ����敪
				tempStruct.setl_DAILY_WORK_REPORT_TYP_SHOW(this.getDisplayName(getComDailyWorkReportTyp(), tempStruct.geth_l_DAILY_WORK_REPORT_TYP()));
				// �s��Ɨ��R
				tempStruct.setl_UN_OPR_CAUSE_TYP_SHOW(this.getDisplayName(getComUnOprCauseTyp(), tempStruct.geth_l_UN_OPR_CAUSE_TYP()));
				// �J�n����
				tempStruct.setl_START_TIME(changeTimeFormat(tempStruct.getl_START_TIME(), true));
				// �I������
				tempStruct.setl_END_TIME(changeTimeFormat(tempStruct.getl_END_TIME(), true));
				// ��Ƌ敪
				tempStruct.setl_OPR_TYP_SHOW(this.getDisplayName(getComOprTyp(), tempStruct.geth_l_OPR_TYP()));
				// �s��Ɨ��R
				tempStruct.setl_UN_OPR_CAUSE_TYP_SHOW(this.getDisplayName(getComUnOprCauseTyp(), tempStruct.geth_l_UN_OPR_CAUSE_TYP()));
			}
			
			// �s��Ǝ��ԁi���j�\���t�H�[�}�b�g
			setUnOprTimeFormat("OBT_INTEGER_Z;4;;");
			
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			copyStruct(struct, mainStruct);
			// �p�����[�^���擾
			PrivateConfig privateConfig = new PrivateConfig(conn);
			// �ݒ�l�i��Ǝ��Ԃ̏���l�j���擾����
			_MAX_OPR_TIME = privateConfig.getString("WORK_REPORT_MAX_OPR_TIME");
			if (_MAX_OPR_TIME == null || "".equals(_MAX_OPR_TIME)) {
				setErrorMessage("AD61001");
				return;
			}
			if ("1".equals(struct.getDAILY_WORK_REPORT_TYP())) {
				// ����̏ꍇ
				
				// �ݒ�l�i��s�\�������j���擾����
				_ADD_LINE_CNT = privateConfig.getString("WORK_REPORT_LINE_CNT");
				if (_ADD_LINE_CNT == null || "".equals(_ADD_LINE_CNT) || "0".equals(_ADD_LINE_CNT)) {
					setErrorMessage("AD61002");
					return;
				}
				if (list != null) {
					list.clear();
				}
				clearMainStruct();
				// ����敪
				struct.setDAILY_WORK_REPORT_TYP("1");
				// ���[�U�R�[�h
				struct.setUSER_CD(sysUSER_CD);
				// ��Ɠ�
				struct.setOPR_DATE(getBusinessOprDate());
				AD0130010Struct tempStruct = new AD0130010Struct();
				for (int i = 1; i <= Integer.parseInt(_ADD_LINE_CNT); i++) {
					tempStruct = new AD0130010Struct();
					// �s�ԍ�
					tempStruct.setl_SEQ_NO(i+"");
					// ��Ƌ敪
					tempStruct.setl_OPR_TYP("0");
					// �s��Ɨ��R
					tempStruct.setl_UN_OPR_CAUSE_TYP("0");
					list.add(tempStruct);
				}
			}
			struct.seth_UpdateFlag("false");
			
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			copyStruct(struct, mainStruct);
			// �p�����[�^���擾
			PrivateConfig privateConfig = new PrivateConfig(conn);
			// �ݒ�l�i��Ǝ��Ԃ̏���l�j���擾����
			_MAX_OPR_TIME = privateConfig.getString("WORK_REPORT_MAX_OPR_TIME");
			if (_MAX_OPR_TIME == null || "".equals(_MAX_OPR_TIME)) {
				setErrorMessage("AD61001");
				return;
			}
			// ����̏ꍇ
				
			// �ݒ�l�i��s�\�������j���擾����
			_ADD_LINE_CNT = privateConfig.getString("WORK_REPORT_LINE_CNT");
			if (_ADD_LINE_CNT == null || "".equals(_ADD_LINE_CNT)) {
				setErrorMessage("AD61002");
				return;
			}
			List resultList = new ArrayList();
			// ���[�U�R�[�h
			struct.setUSER_CD(struct.getl_USER_CD());
			// ���[�U��
			resultList = entity.mselectUSER_MST.read(conn, struct);
			if (resultList.isEmpty()) {
				struct.setUSER_NAME(null);
			} else {
				// ���[�U��
				struct.setUSER_NAME(((AD0130010Struct)resultList.get(0)).getUSER_NAME());
			}
			// ��Ɠ�
			struct.setOPR_DATE(struct.getl_OPR_DATE());
			// �Ζ��V�t�g
			struct.setWORK_SHIFT_CODE(struct.getl_WORK_SHIFT_CODE());
			// �Ζ��V�t�g��
			resultList = entity.mselectUM_WORK_SHIFT_H.read(conn, struct);
			if (resultList.isEmpty()) {
				struct.setWORK_SHIFT_NAME(null);
			} else {
				struct.setWORK_SHIFT_NAME(((AD0130010Struct)resultList.get(0)).getWORK_SHIFT_NAME());
			}
				
			resultList = entity.mselectUT_DAILY_WORK_REPORT_WORKER.read(conn, struct);
			if (resultList.isEmpty()) {
				setErrorMessage("ZZ06001");
				return;
			}
			if (list != null) {
				list.clear();
			}
			list.addAll(resultList);
			AD0130010Struct tempStruct = new AD0130010Struct();
			int maxSeqNo = Integer.parseInt(((AD0130010Struct)list.get(list.size()-1)).getl_SEQ_NO());
			// ��Ɠ���Ǘ��ԍ��i��\���j
			struct.seth_DAILY_WORK_REPORT_CTL_NO(((AD0130010Struct)list.get(list.size()-1)).geth_DAILY_WORK_REPORT_CTL_NO());
			for (int i = 0; i < list.size(); i++) {
				tempStruct = (AD0130010Struct) list.get(i);
				// �J�n����
				tempStruct.setl_START_TIME(changeTimeFormat(tempStruct.getl_START_TIME(), false));
				// �I������
				tempStruct.setl_END_TIME(changeTimeFormat(tempStruct.getl_END_TIME(), false));
			}
				
			for (int i = 1; i <= Integer.parseInt(_ADD_LINE_CNT); i++) {
				tempStruct = new AD0130010Struct();
				// �s�ԍ�
				tempStruct.setl_SEQ_NO(maxSeqNo + i + "");
				// ��Ƌ敪
				tempStruct.setl_OPR_TYP("0");
				// �s��Ɨ��R
				tempStruct.setl_UN_OPR_CAUSE_TYP("0");
				list.add(tempStruct);
			}
			struct.seth_UpdateFlag("true");
			
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			conn.beginTransWeb();
			List modifyList = new ArrayList();
			for (int i = 0; i < struct.getList_l_DAILY_WORK_REPORT_CTL_NO().size(); i++) {
				
				struct.seth_DAILY_WORK_REPORT_CTL_NO((String)struct.getList_l_DAILY_WORK_REPORT_CTL_NO().get(i));
				// ����̏ꍇ
				struct.setl_SEQ_NO((String)struct.getList_h_l_SEQ_NO().get(i));

				modifyList = entity.mselectUT_DAILY_WORK_REPORT_MODIFY.read(conn, struct);
				if (modifyList.isEmpty()) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				} else {
					AD0130010Struct modifyStruct = (AD0130010Struct) modifyList.get(0);
					String modifyCount = modifyStruct.getMODIFY_COUNT();
					String checkModify = (String)struct.getList_h_l_MODIFY_COUNT().get(i);
					if (!modifyCount.equals(checkModify)) {
						setErrorMessage("ZZ01105");
						conn.rollback();
						return;
					}
				}
				entity.mdeleteUT_DAILY_WORK_REPORT.delete(conn, struct);
			}
			conn.commit();
			controlSelect();
			
		} catch(Exception e) {
			conn.rollback();
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		if (list == null) {
			list = new ArrayList();
		} else {
			list.clear();
		}
		setReadStatus(INITIAL);

		try {
			//�Ɩ��^�p���̎擾
			try {
				setBusinessOprDate(DateCtrlControl.getData(conn, getsysPLANT_CD()).getBUSINESS_OPR_DATE());
			} catch (Exception e) {
				ExpjMessage emsg = new ExpjMessage("AC34080");
				sysLog.severe(emsg, getsysUSER_CD());          //�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(emsg);    // �G�N�Z�v�V�����𐶐�
				ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
				throw ee;
			}
			if (_BUSINESS_OPR_DATE == null || "".equals(_BUSINESS_OPR_DATE)) {
				ExpjMessage emsg = new ExpjMessage("AC34080");
				sysLog.severe(emsg, getsysUSER_CD());          //�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(emsg);    // �G�N�Z�v�V�����𐶐�
				ee.setLocale(CoreTools.getLocale(getsysUSER_CD()));
				throw ee;
			}
            // ���O�C�����[�U �̍H��R�[�h
            struct.setPLANT_CD(getsysPLANT_CD());
            struct.setUSER_PLANT_CD(getsysPLANT_CD());
            // ����敪  1:����
            struct.setDAILY_WORK_REPORT_TYP("1");
            // ��Ɠ�(FROM)
            struct.setOPR_DATE_FROM(getBusinessOprDate());
            // ��Ɠ�(TO)
            struct.setOPR_DATE_TO(getBusinessOprDate());
            // ���[�U�R�[�h
            struct.setUSER_CD(getsysUSER_CD());
		} catch (ExpjException ee){
        	throw ee;
        } catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1_Return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Return");
			//{{user_implement_dev:<controlsub1_Return>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		struct.setUSER_PLANT_CD(null);
		copyStruct(mainStruct, struct);
		controlSelect();
		
                //}}user_implement_dev:<controlsub1_Return>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Return");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1_Insert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Insert");
			//{{user_implement_dev:<controlsub1_Insert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			updateWorker(false);			
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlsub1_Insert>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Insert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1_Update() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Update");
			//{{user_implement_dev:<controlsub1_Update>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			updateWorker(true);
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlsub1_Update>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlsub1_Update");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        controlClear();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        controlClear();

		try {
            // ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
            if ( isScreenMove() == true ) {
                struct.setDAILY_WORK_REPORT_TYP(this.getP_DAILY_WORK_REPORT_TYP());
                struct.setPLANT_CD(this.getP_PLANT_CD());
                struct.setUSER_PLANT_CD(this.getP_PLANT_CD());
                struct.setOPR_DATE_FROM(this.getP_OPR_DATE_FROM());
                struct.setOPR_DATE_TO(this.getP_OPR_DATE_TO());
                struct.setUSER_CD(this.getP_USER_CD());
                struct.setWS_CD(this.getP_WS_CD());

                // �����̃R���g���[�����\�b�h���Ăяo���܂��B
                controlSelect();
            }
		} catch(Exception e) {
			e.printStackTrace();
			setReadStatus(ERROR);
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0130");
		logger.entering("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// ����敪���Z�b�g
			try {
				// �R���{�{�b�N�X�f�[�^���擾
				ComboBox cb = new ComboBox(conn, sysUSER_CD);
				
				// ����敪
				setComDailyWorkReportTyp(cb.getData("DAILY_WORK_REPORT_TYP_01"));
				struct.setList_DAILY_WORK_REPORT_TYP_name(getComDailyWorkReportTyp().getExplanList());
				struct.setList_DAILY_WORK_REPORT_TYP_val(getComDailyWorkReportTyp().getValList());
				
				//�s��Ɨ��R�敪���Z�b�g
				setComUnOprCauseTyp(cb.getData("UN_OPR_CAUSE_CD_01"));
				struct.setList_l_UN_OPR_CAUSE_TYP_name(getComUnOprCauseTyp().getExplanList());
				struct.setList_l_UN_OPR_CAUSE_TYP_val(getComUnOprCauseTyp().getValList());
				
				//��Ƌ敪���Z�b�g
				setComOprTyp(cb.getData("OPR_TYP_CD_01"));
				struct.setList_l_OPR_TYP_name(getComOprTyp().getExplanList());
				struct.setList_l_OPR_TYP_val(getComOprTyp().getValList());
				
			} catch (Exception e) {
				e.printStackTrace();
				setErrorMessage("ZZ01106");
				setReadStatus(ERROR);
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("sub1_Return") ) {
				controlsub1_Return();
			} else if( button.equals("sub1_Insert") ) {
				controlsub1_Insert();
			} else if( button.equals("sub1_Update") ) {
				controlsub1_Update();
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
//			throw new FoundationException("AD0130010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0130010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AD0130010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0130010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AD0130010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0130010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AD0130010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AD0130010Entity entity;
	protected AD0130010Struct struct;
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

		entity = new AD0130010Entity();
		struct = new AD0130010Struct();

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
	 * AD0130010�N���X�̕W���R���X�g���N�^
	 */
	public AD0130010Control() throws BusinessProcessException, FoundationException
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
				AD0130010Struct key = (AD0130010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP_name") && key.getDAILY_WORK_REPORT_TYP_name() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_TYP_name", key.getDAILY_WORK_REPORT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP_val") && key.getDAILY_WORK_REPORT_TYP_val() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_TYP_val", key.getDAILY_WORK_REPORT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_DAILY_WORK_REPORT_TYP_SHOW") && key.getl_DAILY_WORK_REPORT_TYP_SHOW() != null) {
					msgKey.setKeyValue("l_DAILY_WORK_REPORT_TYP_SHOW", key.getl_DAILY_WORK_REPORT_TYP_SHOW());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_TYP_SHOW") && key.getl_OPR_TYP_SHOW() != null) {
					msgKey.setKeyValue("l_OPR_TYP_SHOW", key.getl_OPR_TYP_SHOW());
				}
				if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_SHOW") && key.getl_UN_OPR_CAUSE_TYP_SHOW() != null) {
					msgKey.setKeyValue("l_UN_OPR_CAUSE_TYP_SHOW", key.getl_UN_OPR_CAUSE_TYP_SHOW());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_TYP_name") && key.getl_OPR_TYP_name() != null) {
					msgKey.setKeyValue("l_OPR_TYP_name", key.getl_OPR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_TYP_val") && key.getl_OPR_TYP_val() != null) {
					msgKey.setKeyValue("l_OPR_TYP_val", key.getl_OPR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_name") && key.getl_UN_OPR_CAUSE_TYP_name() != null) {
					msgKey.setKeyValue("l_UN_OPR_CAUSE_TYP_name", key.getl_UN_OPR_CAUSE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_val") && key.getl_UN_OPR_CAUSE_TYP_val() != null) {
					msgKey.setKeyValue("l_UN_OPR_CAUSE_TYP_val", key.getl_UN_OPR_CAUSE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_UpdateFlag") && key.geth_UpdateFlag() != null) {
					msgKey.setKeyValue("h_UpdateFlag", key.geth_UpdateFlag());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_l_DAILY_WORK_REPORT_TYP") && key.geth_l_DAILY_WORK_REPORT_TYP() != null) {
					msgKey.setKeyValue("h_l_DAILY_WORK_REPORT_TYP", key.geth_l_DAILY_WORK_REPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_USER_CD") && key.getl_USER_CD() != null) {
					msgKey.setKeyValue("l_USER_CD", key.getl_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_DATE") && key.getl_OPR_DATE() != null) {
					msgKey.setKeyValue("l_OPR_DATE", key.getl_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_SHIFT_CODE") && key.getl_WORK_SHIFT_CODE() != null) {
					msgKey.setKeyValue("l_WORK_SHIFT_CODE", key.getl_WORK_SHIFT_CODE());
				}
				if(msgKeyType.containsKeyColumn("l_START_TIME") && key.getl_START_TIME() != null) {
					msgKey.setKeyValue("l_START_TIME", key.getl_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_END_TIME") && key.getl_END_TIME() != null) {
					msgKey.setKeyValue("l_END_TIME", key.getl_END_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_TIME") && key.getl_OPR_TIME() != null) {
					msgKey.setKeyValue("l_OPR_TIME", key.getl_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_WS_CD") && key.getl_WS_CD() != null) {
					msgKey.setKeyValue("l_WS_CD", key.getl_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("h_l_OPR_TYP") && key.geth_l_OPR_TYP() != null) {
					msgKey.setKeyValue("h_l_OPR_TYP", key.geth_l_OPR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_l_UN_OPR_CAUSE_TYP") && key.geth_l_UN_OPR_CAUSE_TYP() != null) {
					msgKey.setKeyValue("h_l_UN_OPR_CAUSE_TYP", key.geth_l_UN_OPR_CAUSE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UN_OPR_TIME") && key.getl_UN_OPR_TIME() != null) {
					msgKey.setKeyValue("l_UN_OPR_TIME", key.getl_UN_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_DAILY_WORK_REPORT_CTL_NO") && key.getl_DAILY_WORK_REPORT_CTL_NO() != null) {
					msgKey.setKeyValue("l_DAILY_WORK_REPORT_CTL_NO", key.getl_DAILY_WORK_REPORT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_l_SEQ_NO") && key.geth_l_SEQ_NO() != null) {
					msgKey.setKeyValue("h_l_SEQ_NO", key.geth_l_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("h_l_MODIFY_COUNT") && key.geth_l_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_l_MODIFY_COUNT", key.geth_l_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("USER_PLANT_CD") && key.getUSER_PLANT_CD() != null) {
					msgKey.setKeyValue("USER_PLANT_CD", key.getUSER_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP") && key.getDAILY_WORK_REPORT_TYP() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_TYP", key.getDAILY_WORK_REPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE_FROM") && key.getOPR_DATE_FROM() != null) {
					msgKey.setKeyValue("OPR_DATE_FROM", key.getOPR_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE_TO") && key.getOPR_DATE_TO() != null) {
					msgKey.setKeyValue("OPR_DATE_TO", key.getOPR_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("MAX_LINE") && key.getMAX_LINE() != null) {
					msgKey.setKeyValue("MAX_LINE", key.getMAX_LINE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_DAILY_WORK_REPORT_CTL_NO") && key.geth_DAILY_WORK_REPORT_CTL_NO() != null) {
					msgKey.setKeyValue("h_DAILY_WORK_REPORT_CTL_NO", key.geth_DAILY_WORK_REPORT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_SEQ_NO") && key.getl_SEQ_NO() != null) {
					msgKey.setKeyValue("l_SEQ_NO", key.getl_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_WS_NAME") && key.getl_WS_NAME() != null) {
					msgKey.setKeyValue("l_WS_NAME", key.getl_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_TYP") && key.getl_OPR_TYP() != null) {
					msgKey.setKeyValue("l_OPR_TYP", key.getl_OPR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP") && key.getl_UN_OPR_CAUSE_TYP() != null) {
					msgKey.setKeyValue("l_UN_OPR_CAUSE_TYP", key.getl_UN_OPR_CAUSE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("WORK_SHIFT_NAME") && key.getWORK_SHIFT_NAME() != null) {
					msgKey.setKeyValue("WORK_SHIFT_NAME", key.getWORK_SHIFT_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE") && key.getWORK_SHIFT_CODE() != null) {
					msgKey.setKeyValue("WORK_SHIFT_CODE", key.getWORK_SHIFT_CODE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_CTL_NO") && key.getDAILY_WORK_REPORT_CTL_NO() != null) {
					msgKey.setKeyValue("DAILY_WORK_REPORT_CTL_NO", key.getDAILY_WORK_REPORT_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("START_TIME") && key.getSTART_TIME() != null) {
					msgKey.setKeyValue("START_TIME", key.getSTART_TIME());
				}
				if(msgKeyType.containsKeyColumn("END_TIME") && key.getEND_TIME() != null) {
					msgKey.setKeyValue("END_TIME", key.getEND_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TYP") && key.getOPR_TYP() != null) {
					msgKey.setKeyValue("OPR_TYP", key.getOPR_TYP());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP") && key.getUN_OPR_CAUSE_TYP() != null) {
					msgKey.setKeyValue("UN_OPR_CAUSE_TYP", key.getUN_OPR_CAUSE_TYP());
				}
				if(msgKeyType.containsKeyColumn("UN_OPR_TIME") && key.getUN_OPR_TIME() != null) {
					msgKey.setKeyValue("UN_OPR_TIME", key.getUN_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_OPR_TIME") && key.getTOTAL_OPR_TIME() != null) {
					msgKey.setKeyValue("TOTAL_OPR_TIME", key.getTOTAL_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("PVC2LOGMODE") && key.getPVC2LOGMODE() != null) {
					msgKey.setKeyValue("PVC2LOGMODE", key.getPVC2LOGMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE") && key.getPVC2OUTPUTMODE() != null) {
					msgKey.setKeyValue("PVC2OUTPUTMODE", key.getPVC2OUTPUTMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH") && key.getPVC2OUTPUTPATH() != null) {
					msgKey.setKeyValue("PVC2OUTPUTPATH", key.getPVC2OUTPUTPATH());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME") && key.getPVC2OUTPUTNAME() != null) {
					msgKey.setKeyValue("PVC2OUTPUTNAME", key.getPVC2OUTPUTNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2USERID") && key.getPVC2USERID() != null) {
					msgKey.setKeyValue("PVC2USERID", key.getPVC2USERID());
				}
				if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME") && key.getPVC2BUSINESSNAME() != null) {
					msgKey.setKeyValue("PVC2BUSINESSNAME", key.getPVC2BUSINESSNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2PLANTCD") && key.getPVC2PLANTCD() != null) {
					msgKey.setKeyValue("PVC2PLANTCD", key.getPVC2PLANTCD());
				}
				if(msgKeyType.containsKeyColumn("RETURN_MESSAGE") && key.getRETURN_MESSAGE() != null) {
					msgKey.setKeyValue("RETURN_MESSAGE", key.getRETURN_MESSAGE());
				}
				if(msgKeyType.containsKeyColumn("RETURN_STATUS") && key.getRETURN_STATUS() != null) {
					msgKey.setKeyValue("RETURN_STATUS", key.getRETURN_STATUS());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_USER_CD") && key.getw_USER_CD() != null) {
					msgKey.setKeyValue("w_USER_CD", key.getw_USER_CD());
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
					AD0130010Struct key = new AD0130010Struct();
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP_name")) {
						key.setDAILY_WORK_REPORT_TYP_name(msgKey.getKeyValue("DAILY_WORK_REPORT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP_val")) {
						key.setDAILY_WORK_REPORT_TYP_val(msgKey.getKeyValue("DAILY_WORK_REPORT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_DAILY_WORK_REPORT_TYP_SHOW")) {
						key.setl_DAILY_WORK_REPORT_TYP_SHOW(msgKey.getKeyValue("l_DAILY_WORK_REPORT_TYP_SHOW"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_TYP_SHOW")) {
						key.setl_OPR_TYP_SHOW(msgKey.getKeyValue("l_OPR_TYP_SHOW"));
					}
					if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_SHOW")) {
						key.setl_UN_OPR_CAUSE_TYP_SHOW(msgKey.getKeyValue("l_UN_OPR_CAUSE_TYP_SHOW"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_TYP_name")) {
						key.setl_OPR_TYP_name(msgKey.getKeyValue("l_OPR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_TYP_val")) {
						key.setl_OPR_TYP_val(msgKey.getKeyValue("l_OPR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_name")) {
						key.setl_UN_OPR_CAUSE_TYP_name(msgKey.getKeyValue("l_UN_OPR_CAUSE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP_val")) {
						key.setl_UN_OPR_CAUSE_TYP_val(msgKey.getKeyValue("l_UN_OPR_CAUSE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_UpdateFlag")) {
						key.seth_UpdateFlag(msgKey.getKeyValue("h_UpdateFlag"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_l_DAILY_WORK_REPORT_TYP")) {
						key.seth_l_DAILY_WORK_REPORT_TYP(msgKey.getKeyValue("h_l_DAILY_WORK_REPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_CD")) {
						key.setl_USER_CD(msgKey.getKeyValue("l_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_DATE")) {
						key.setl_OPR_DATE(msgKey.getKeyValue("l_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_SHIFT_CODE")) {
						key.setl_WORK_SHIFT_CODE(msgKey.getKeyValue("l_WORK_SHIFT_CODE"));
					}
					if(msgKeyType.containsKeyColumn("l_START_TIME")) {
						key.setl_START_TIME(msgKey.getKeyValue("l_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_END_TIME")) {
						key.setl_END_TIME(msgKey.getKeyValue("l_END_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_TIME")) {
						key.setl_OPR_TIME(msgKey.getKeyValue("l_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_CD")) {
						key.setl_WS_CD(msgKey.getKeyValue("l_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_l_OPR_TYP")) {
						key.seth_l_OPR_TYP(msgKey.getKeyValue("h_l_OPR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_l_UN_OPR_CAUSE_TYP")) {
						key.seth_l_UN_OPR_CAUSE_TYP(msgKey.getKeyValue("h_l_UN_OPR_CAUSE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UN_OPR_TIME")) {
						key.setl_UN_OPR_TIME(msgKey.getKeyValue("l_UN_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_DAILY_WORK_REPORT_CTL_NO")) {
						key.setl_DAILY_WORK_REPORT_CTL_NO(msgKey.getKeyValue("l_DAILY_WORK_REPORT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_l_SEQ_NO")) {
						key.seth_l_SEQ_NO(msgKey.getKeyValue("h_l_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_l_MODIFY_COUNT")) {
						key.seth_l_MODIFY_COUNT(msgKey.getKeyValue("h_l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("USER_PLANT_CD")) {
						key.setUSER_PLANT_CD(msgKey.getKeyValue("USER_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_TYP")) {
						key.setDAILY_WORK_REPORT_TYP(msgKey.getKeyValue("DAILY_WORK_REPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE_FROM")) {
						key.setOPR_DATE_FROM(msgKey.getKeyValue("OPR_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE_TO")) {
						key.setOPR_DATE_TO(msgKey.getKeyValue("OPR_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("MAX_LINE")) {
						key.setMAX_LINE(msgKey.getKeyValue("MAX_LINE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_DAILY_WORK_REPORT_CTL_NO")) {
						key.seth_DAILY_WORK_REPORT_CTL_NO(msgKey.getKeyValue("h_DAILY_WORK_REPORT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_SEQ_NO")) {
						key.setl_SEQ_NO(msgKey.getKeyValue("l_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_NAME")) {
						key.setl_WS_NAME(msgKey.getKeyValue("l_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_TYP")) {
						key.setl_OPR_TYP(msgKey.getKeyValue("l_OPR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UN_OPR_CAUSE_TYP")) {
						key.setl_UN_OPR_CAUSE_TYP(msgKey.getKeyValue("l_UN_OPR_CAUSE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("WORK_SHIFT_NAME")) {
						key.setWORK_SHIFT_NAME(msgKey.getKeyValue("WORK_SHIFT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_SHIFT_CODE")) {
						key.setWORK_SHIFT_CODE(msgKey.getKeyValue("WORK_SHIFT_CODE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DAILY_WORK_REPORT_CTL_NO")) {
						key.setDAILY_WORK_REPORT_CTL_NO(msgKey.getKeyValue("DAILY_WORK_REPORT_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("START_TIME")) {
						key.setSTART_TIME(msgKey.getKeyValue("START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("END_TIME")) {
						key.setEND_TIME(msgKey.getKeyValue("END_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TYP")) {
						key.setOPR_TYP(msgKey.getKeyValue("OPR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_CAUSE_TYP")) {
						key.setUN_OPR_CAUSE_TYP(msgKey.getKeyValue("UN_OPR_CAUSE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UN_OPR_TIME")) {
						key.setUN_OPR_TIME(msgKey.getKeyValue("UN_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_OPR_TIME")) {
						key.setTOTAL_OPR_TIME(msgKey.getKeyValue("TOTAL_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2LOGMODE")) {
						key.setPVC2LOGMODE(msgKey.getKeyValue("PVC2LOGMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE")) {
						key.setPVC2OUTPUTMODE(msgKey.getKeyValue("PVC2OUTPUTMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH")) {
						key.setPVC2OUTPUTPATH(msgKey.getKeyValue("PVC2OUTPUTPATH"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME")) {
						key.setPVC2OUTPUTNAME(msgKey.getKeyValue("PVC2OUTPUTNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2USERID")) {
						key.setPVC2USERID(msgKey.getKeyValue("PVC2USERID"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME")) {
						key.setPVC2BUSINESSNAME(msgKey.getKeyValue("PVC2BUSINESSNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2PLANTCD")) {
						key.setPVC2PLANTCD(msgKey.getKeyValue("PVC2PLANTCD"));
					}
					if(msgKeyType.containsKeyColumn("RETURN_MESSAGE")) {
						key.setRETURN_MESSAGE(msgKey.getKeyValue("RETURN_MESSAGE"));
					}
					if(msgKeyType.containsKeyColumn("RETURN_STATUS")) {
						key.setRETURN_STATUS(msgKey.getKeyValue("RETURN_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(msgKey.getKeyValue("HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_USER_CD")) {
						key.setw_USER_CD(msgKey.getKeyValue("w_USER_CD"));
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
