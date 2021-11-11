/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0040/src/com/nec/jp/orteus/metamorBase/AL0040/AL0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0040;

import com.nec.jp.orteus.metamorBase.AL0040.*;
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

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.lang.Integer;
import java.math.BigDecimal;
import java.applet.Applet;

// metamorBaseSystem.properties����p�����[�^�擾�p
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import java.util.ResourceBundle;

// Espress Chart�ł̃O���t�`��p
import quadbase.ChartAPI.*;
import quadbase.util.*;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Dimension;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AL0040010Control
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
	protected List list;                                            // ���ʃ��X�g�̃C���X�^���X
	public List getList() { return this.list; }                     // ���X�g��Ԃ��܂��B
	public void setList(List listname) { this.list = listname; }    // ���X�g���Z�b�g���܂��B
	public int getListsize() {                                      // ���X�g�^�̃T�C�Y��Ԃ��܂��B
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
	public Object getListvalue(int x) { return this.list.get(x); }  // ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	public AL0040010Struct getStruct() { return this.struct; }  // Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B

	// ===< ���[�U��`���� >====================================================
	/** �R���{�{�b�N�X�f�[�^�擾�p�萔�@�I�[�_��ԋ敪 */
	private final static String ODR_STS_TYP_PARAMETER_NAME= "LOAD_ODR_STS_TYP"; 
	
	/** ���[�J���@������ */
	private final static String LOCALE_ZH = "zh";
	
	/** ���[�J���@�p�� */
	private final static String LOCALE_EN = "en";
	
	/** ���ׁ@���{�� */
	private final static String LOAD_JP = "����";
	
	/** ���ׁ@�p�� */
	private final static String LOAD_EN = "LOAD";
	
	/** �R���{�{�b�N�X�f�[�^�擾�p�@�I�[�_��ԋ敪 */
	private ComboStruct ODR_STS_TYP = null;

	/** (������)�R���{�{�b�N�X�f�[�^�擾�p�@�I�[�_��ԋ敪 */
	private ComboStruct ODR_STS_TYP_EN = null;
	
	private void othercomboTyp(AL0040010Struct aStruct) {
		aStruct.setLKM_ODR_STS_TYP(getDisplayName(ODR_STS_TYP, aStruct.getLKM_ODR_STS_TYP()));
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

	// ���ז��חp
	private List _neckDetailList;
	private int _neckDetailsize;
	private AL0040010Struct _neckDetailStruct = new AL0040010Struct();

	// ��ʏ����t���O
	private boolean _initialScreenFlg = true;
	// ��ʏI���t���O
	private boolean _closeScreenFlg = false;

	// ���t�ϐ�
	private String _headerDay[] = new String[90];
	private String _holiDay[] = new String[90];
	private String _kFromDay = "";
	private String _kToDay = "";

	// ����MAX�l�ϐ�
	private int _intP_HIGH_LOAD = 100;
	// ����MID�l�ϐ�
	private int _intP_MIDD_LOAD = 80;
	// ����LOW�l�ϐ�
	private int _intP_LOW_LOAD  = 40;

	// ���W�I�{�^��No�ϐ�
	private int _checkNo = 0;

	// AL�C���X�g�[���σt���O
	private String _alInstalledFlg = "0";

	// �V�X�e���g�p�̋Ɩ�ID
	private String sysPROC_ID = null;

	// �O���t�C���[�W�t�@�C�����΃p�X
	private String _jpegName = null;
	// �O���t�C���[�W�t�@�C����΃p�X
	private String _jpegFullName = null;
	// MAP�^�O�t�@�C�����΃p�X
	private String _mapName = null;
	// MAP�^�O�t�@�C����΃p�X
	private String _mapFullName = null;
	// �O���t�e���v���[�g�t�@�C����΃p�X
	private String TPLFullName = null;
	

	// Graph�p�f�[�^���X�g
	private String[][] GraphDataList = null;
	private String strGraphNeckProcCd = null;
	private String strGraphNeckProcCapa = null;

	/**
	 * Struct�̒l���N���A���܂��B
	 */
	private void clearStruct()
	{
		for (int i = 0; i < 90; i++) {
			_headerDay[i] = "";
			_holiDay[i] = "";
		}
		_kFromDay = "";
		_kToDay = "";
		_intP_HIGH_LOAD = 100;
		_intP_MIDD_LOAD = 80;
		_intP_LOW_LOAD  = 40;
		String saveK_PLANT_CD = struct.getK_PLANT_CD();
		String saveK_NECK_PROC_CD = struct.getK_NECK_PROC_CD();
		String saveS_LOAD_DATE = struct.getS_LOAD_DATE();
		struct.clear();
		struct.setK_PLANT_CD(saveK_PLANT_CD);
		struct.setK_NECK_PROC_CD(saveK_NECK_PROC_CD);
		struct.setS_LOAD_DATE(saveS_LOAD_DATE);
		if (list != null) {
			list.clear();
		}
	}

	/**
	 * From���t��To���t�Ƀf�t�H�[���g�l��ݒ肵�܂��B
	 *
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 * @throws ExpjException �V�X�e���G���[
	 */
	private void setDefaultFromAndToDate()
			throws BusinessProcessException, FoundationException, ExpjException
	{
		try {
            // �Ɩ��^�p�����擾
            struct.setK_PLANT_CD(getsysPLANT_CD());
            List workList = entity.mSelectSysDateCtrl.read(conn, struct);
            if (workList != null && workList.size() > 0) {
				AL0040010Struct workStruct = (AL0040010Struct)workList.get(0);
				struct.setDateFrom(workStruct.getDateFrom());
				struct.setDateTo(workStruct.getDateTo());
            } else {
				// �u�Ɩ��^�p���v���A�m���t����n�ɑ��݂��Ȃ��ꍇ
                ExpjMessage emsg = new ExpjMessage("AL60002");
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
			}
		} catch (SQLException se) {
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(se, emsg);
			emsg = new ExpjMessage("ZZ01006", "SYS_DATE_CTRL.PLANT_CD:" + struct.getK_PLANT_CD());
			sysLog.severe(emsg, getsysUSER_CD());
			emsg = new ExpjMessage("ZZ01006", se.toString());
			sysLog.severe(emsg, getsysUSER_CD());
			throw ee;
		}
	}

	/**
	 * AL�C���X�g�[���σt���O�̒l��ݒ肵�܂��B
	 *
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 * @throws ExpjException �V�X�e���G���[
	 */
	private void setAlInstalledFlg()
			throws BusinessProcessException, FoundationException, ExpjException
	{
		try {
            // AL�C���X�g�[���σt���O�̒l���擾
            List workList = entity.mSelectSysInstallOptions.read(conn, struct);
            if (workList == null || workList.isEmpty()) {
				struct.setw_AlInstalledFlg("0");
            } else {
				AL0040010Struct workStruct = (AL0040010Struct)workList.get(0);
				struct.setw_AlInstalledFlg(workStruct.getw_AlInstalledFlg());
			}
            // AL�C���X�g�[���σt���O�̒l��ݒ�
			_alInstalledFlg = struct.getw_AlInstalledFlg();
		} catch (SQLException se) {
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(se, emsg);
			emsg = new ExpjMessage("ZZ01006", "SYS_INSTALL_OPTIONS.OPTION_ID:AL");
			sysLog.severe(emsg, getsysUSER_CD());
			emsg = new ExpjMessage("ZZ01006", se.toString());
			sysLog.severe(emsg, getsysUSER_CD());
			throw ee;
		}
	}

	/**
	 * �p�����[�^�̃O���t��ނ�EspressChart�̃`���[�g�^�C�v�ɕϊ����܂��B
	 *
	 * @param int chartType �O���t��ޖ�(1:STACKCOL,2:STACKAREA,�ȊO:STACKCOL)
	 * @return int EspressChart�̃`���[�g�^�C�v
	 *         �A���A�z��ȊO�̎�ނ̏ꍇ��STACKCOL�ɕϊ�
	 */
	private int ToQbChartType(int chartType)
	{
		switch (chartType) {
		case 1:
			return QbChart.STACKCOL;
		case 2:
			return QbChart.STACKAREA;
		//case 3:
		//	return QbChart.STACKBAR;
		default:
			return QbChart.STACKCOL;
		}
	}

	/**
	 * �p�����[�^�̃O���t����(2D,3D)��EspressChart��DIMMENSION�ɕϊ����܂��B
	 *
	 * @param chartView �O���t����(1:2D,2:3D,�ȊO:2D)
	 * @return int EspressChart��DIMMENSION
	 *         �A���A�z��ȊO�̎�ނ̏ꍇ��VIEW2D�ɕϊ�
	 */
	private int ToQbChartView(int chartView)
	{
		switch (chartView) {
		case 1:
			return QbChart.VIEW2D;
		case 2:
			return QbChart.VIEW3D;
		default:
			return QbChart.VIEW2D;
		}
	}

	/**
	 * �L����RGB�l���ۂ����ׂāA���ʂ�Ԃ��܂��B
	 *
	 * @param red
	 * @param green
	 * @param blue
	 * @return true: �L����RGB�l�Cfalse: ������RGB�l
	 */
	private boolean isValidRgbValue(Integer red, Integer green, Integer blue)
	{
		return red.intValue() >= 0 && red.intValue() <= 255
				&& green.intValue() >= 0 && green.intValue() <= 255
				&& blue.intValue() >= 0 && blue.intValue() <= 255
				&& (red.intValue() != 0 || green.intValue() != 0 || blue.intValue() != 0);
	}

	/**
	 * 16�i��2���̕������Ԃ��܂��B
	 *
	 * @param value
	 * @return 16�i��2���̕�����
	 */
	private String getHex2DigitString(int value)
	{
		String x = Integer.toHexString(value);
		if (value < 16) {
			x = "0" + x;
		}
		return x;
	}

	/**
	 * �O���t�C���[�W�t�@�C���̑��΃p�X���擾���܂��B
	 *
	 * @return String �O���t�C���[�W�t�@�C�����΃p�X
	 */
	public String getJpegName() { return _jpegName; };

	/**
	 * �}�b�v�t�@�C���̑��΃p�X���擾���܂��B
	 *
	 * @return String �}�b�v�t�@�C�����΃p�X
	 */
	public String getMapName() { return _mapName; };

	/**
	 * ��������Ƀt�@�C���p�X���ɕϊ����܂��B
	 *
	 * @param String path �t�@�C���p�X
	 * @param String name �t�@�C����
	 * @return String �t�@�C���p�X��
	 */
	public String getFileName(String path, String name)
	{
		String out_path = null;
		int intPathLen = path.length();
		if (path.substring(intPathLen - 1, intPathLen).equals("/") == true) {
			out_path = path + name;
		} else {
			out_path = path + "/" + name;
		}
		return out_path;
	}

	/**
	 * ��ʏ����t���O���m�F���܂��B
	 *
	 * @return ��ʂ�������Ԃ̏ꍇ��true�A�����łȂ��ꍇ��false
	 */
	public boolean isInitialScreen() { return _initialScreenFlg; }

	/**
	 * ��ʏI���t���O���m�F���܂��B
	 *
	 * @return ��ʂ��I������ꍇ��true�A�����łȂ��ꍇ��false
	 */
	public boolean isCloseScreen() { return _closeScreenFlg; }

	/**
	 * ���(From���t)�����擾���܂��B
	 *
	 * @return From���t
	 */
	public String getKFromDay() { return _kFromDay; }

	/**
	 * ���(To���t)�����擾���܂��B
	 *
	 * @return To���t
	 */
	public String getKToDay() { return _kToDay; }

	/**
	 * ��ʃw�b�_���t�����擾���܂��B
	 *
	 * @param i
	 * @return ���t
	 */
	public String getHeaderDay(int i) { return _headerDay[i]; }

	/**
	 * ��ʃw�b�_���t(�x��)�����擾���܂��B
	 *
	 * @param i
	 * @return �x���t���O
	 */
	public String getHoliDay(int i) {
		if (_holiDay[i].equals("") == true) {
			return "0";
		} else {
			return _holiDay[i];
		}
	}

	/**
	 * ��ʏڍ�(���ח�)�����擾���܂��B
	 *
	 * @param loadQtyIndex ���ח��C���f�b�N�X
	 * @param lineIndex �s�C���f�b�N�X
	 * @return ���ח�
	 */
	public String getLOAD_QTY(int loadQtyIndex, int lineIndex)
	{
		AL0040010Struct workStruct = (AL0040010Struct)list.get(lineIndex);

		switch (loadQtyIndex) {
		case 0:
			return workStruct.getLOAD_QTY1();
		case 1:
			return workStruct.getLOAD_QTY2();
		case 2:
			return workStruct.getLOAD_QTY3();
		case 3:
			return workStruct.getLOAD_QTY4();
		case 4:
			return workStruct.getLOAD_QTY5();
		case 5:
			return workStruct.getLOAD_QTY6();
		case 6:
			return workStruct.getLOAD_QTY7();
		case 7:
			return workStruct.getLOAD_QTY8();
		case 8:
			return workStruct.getLOAD_QTY9();
		case 9:
			return workStruct.getLOAD_QTY10();
		case 10:
			return workStruct.getLOAD_QTY11();
		case 11:
			return workStruct.getLOAD_QTY12();
		case 12:
			return workStruct.getLOAD_QTY13();
		case 13:
			return workStruct.getLOAD_QTY14();
		case 14:
			return workStruct.getLOAD_QTY15();
		case 15:
			return workStruct.getLOAD_QTY16();
		case 16:
			return workStruct.getLOAD_QTY17();
		case 17:
			return workStruct.getLOAD_QTY18();
		case 18:
			return workStruct.getLOAD_QTY19();
		case 19:
			return workStruct.getLOAD_QTY20();
		case 20:
			return workStruct.getLOAD_QTY21();
		case 21:
			return workStruct.getLOAD_QTY22();
		case 22:
			return workStruct.getLOAD_QTY23();
		case 23:
			return workStruct.getLOAD_QTY24();
		case 24:
			return workStruct.getLOAD_QTY25();
		case 25:
			return workStruct.getLOAD_QTY26();
		case 26:
			return workStruct.getLOAD_QTY27();
		case 27:
			return workStruct.getLOAD_QTY28();
		case 28:
			return workStruct.getLOAD_QTY29();
		case 29:
			return workStruct.getLOAD_QTY30();
		case 30:
			return workStruct.getLOAD_QTY31();
		case 31:
			return workStruct.getLOAD_QTY32();
		case 32:
			return workStruct.getLOAD_QTY33();
		case 33:
			return workStruct.getLOAD_QTY34();
		case 34:
			return workStruct.getLOAD_QTY35();
		case 35:
			return workStruct.getLOAD_QTY36();
		case 36:
			return workStruct.getLOAD_QTY37();
		case 37:
			return workStruct.getLOAD_QTY38();
		case 38:
			return workStruct.getLOAD_QTY39();
		case 39:
			return workStruct.getLOAD_QTY40();
		case 40:
			return workStruct.getLOAD_QTY41();
		case 41:
			return workStruct.getLOAD_QTY42();
		case 42:
			return workStruct.getLOAD_QTY43();
		case 43:
			return workStruct.getLOAD_QTY44();
		case 44:
			return workStruct.getLOAD_QTY45();
		case 45:
			return workStruct.getLOAD_QTY46();
		case 46:
			return workStruct.getLOAD_QTY47();
		case 47:
			return workStruct.getLOAD_QTY48();
		case 48:
			return workStruct.getLOAD_QTY49();
		case 49:
			return workStruct.getLOAD_QTY50();
		case 50:
			return workStruct.getLOAD_QTY51();
		case 51:
			return workStruct.getLOAD_QTY52();
		case 52:
			return workStruct.getLOAD_QTY53();
		case 53:
			return workStruct.getLOAD_QTY54();
		case 54:
			return workStruct.getLOAD_QTY55();
		case 55:
			return workStruct.getLOAD_QTY56();
		case 56:
			return workStruct.getLOAD_QTY57();
		case 57:
			return workStruct.getLOAD_QTY58();
		case 58:
			return workStruct.getLOAD_QTY59();
		case 59:
			return workStruct.getLOAD_QTY60();
		case 60:
			return workStruct.getLOAD_QTY61();
		case 61:
			return workStruct.getLOAD_QTY62();
		case 62:
			return workStruct.getLOAD_QTY63();
		case 63:
			return workStruct.getLOAD_QTY64();
		case 64:
			return workStruct.getLOAD_QTY65();
		case 65:
			return workStruct.getLOAD_QTY66();
		case 66:
			return workStruct.getLOAD_QTY67();
		case 67:
			return workStruct.getLOAD_QTY68();
		case 68:
			return workStruct.getLOAD_QTY69();
		case 69:
			return workStruct.getLOAD_QTY70();
		case 70:
			return workStruct.getLOAD_QTY71();
		case 71:
			return workStruct.getLOAD_QTY72();
		case 72:
			return workStruct.getLOAD_QTY73();
		case 73:
			return workStruct.getLOAD_QTY74();
		case 74:
			return workStruct.getLOAD_QTY75();
		case 75:
			return workStruct.getLOAD_QTY76();
		case 76:
			return workStruct.getLOAD_QTY77();
		case 77:
			return workStruct.getLOAD_QTY78();
		case 78:
			return workStruct.getLOAD_QTY79();
		case 79:
			return workStruct.getLOAD_QTY80();
		case 80:
			return workStruct.getLOAD_QTY81();
		case 81:
			return workStruct.getLOAD_QTY82();
		case 82:
			return workStruct.getLOAD_QTY83();
		case 83:
			return workStruct.getLOAD_QTY84();
		case 84:
			return workStruct.getLOAD_QTY85();
		case 85:
			return workStruct.getLOAD_QTY86();
		case 86:
			return workStruct.getLOAD_QTY87();
		case 87:
			return workStruct.getLOAD_QTY88();
		case 88:
			return workStruct.getLOAD_QTY89();
		case 89:
			return workStruct.getLOAD_QTY90();
		}
		return null;
	}

	/**
	 * ��ʏڍׁi�t���O�j�����擾���܂��B
	 *
	 * @param flgIndex �t���O�C���f�b�N�X
	 * @param lineIndex �s�C���f�b�N�X
	 * @return �t���O
	 */
	public String getFlg(int flgIndex, int lineIndex)
	{
		AL0040010Struct workStruct = (AL0040010Struct)list.get(lineIndex);

		switch (flgIndex) {
		case 0:
			return workStruct.getFLG1();
		case 1:
			return workStruct.getFLG2();
		case 2:
			return workStruct.getFLG3();
		case 3:
			return workStruct.getFLG4();
		case 4:
			return workStruct.getFLG5();
		case 5:
			return workStruct.getFLG6();
		case 6:
			return workStruct.getFLG7();
		case 7:
			return workStruct.getFLG8();
		case 8:
			return workStruct.getFLG9();
		case 9:
			return workStruct.getFLG10();
		case 10:
			return workStruct.getFLG11();
		case 11:
			return workStruct.getFLG12();
		case 12:
			return workStruct.getFLG13();
		case 13:
			return workStruct.getFLG14();
		case 14:
			return workStruct.getFLG15();
		case 15:
			return workStruct.getFLG16();
		case 16:
			return workStruct.getFLG17();
		case 17:
			return workStruct.getFLG18();
		case 18:
			return workStruct.getFLG19();
		case 19:
			return workStruct.getFLG20();
		case 20:
			return workStruct.getFLG21();
		case 21:
			return workStruct.getFLG22();
		case 22:
			return workStruct.getFLG23();
		case 23:
			return workStruct.getFLG24();
		case 24:
			return workStruct.getFLG25();
		case 25:
			return workStruct.getFLG26();
		case 26:
			return workStruct.getFLG27();
		case 27:
			return workStruct.getFLG28();
		case 28:
			return workStruct.getFLG29();
		case 29:
			return workStruct.getFLG30();
		case 30:
			return workStruct.getFLG31();
		case 31:
			return workStruct.getFLG32();
		case 32:
			return workStruct.getFLG33();
		case 33:
			return workStruct.getFLG34();
		case 34:
			return workStruct.getFLG35();
		case 35:
			return workStruct.getFLG36();
		case 36:
			return workStruct.getFLG37();
		case 37:
			return workStruct.getFLG38();
		case 38:
			return workStruct.getFLG39();
		case 39:
			return workStruct.getFLG40();
		case 40:
			return workStruct.getFLG41();
		case 41:
			return workStruct.getFLG42();
		case 42:
			return workStruct.getFLG43();
		case 43:
			return workStruct.getFLG44();
		case 44:
			return workStruct.getFLG45();
		case 45:
			return workStruct.getFLG46();
		case 46:
			return workStruct.getFLG47();
		case 47:
			return workStruct.getFLG48();
		case 48:
			return workStruct.getFLG49();
		case 49:
			return workStruct.getFLG50();
		case 50:
			return workStruct.getFLG51();
		case 51:
			return workStruct.getFLG52();
		case 52:
			return workStruct.getFLG53();
		case 53:
			return workStruct.getFLG54();
		case 54:
			return workStruct.getFLG55();
		case 55:
			return workStruct.getFLG56();
		case 56:
			return workStruct.getFLG57();
		case 57:
			return workStruct.getFLG58();
		case 58:
			return workStruct.getFLG59();
		case 59:
			return workStruct.getFLG60();
		case 60:
			return workStruct.getFLG61();
		case 61:
			return workStruct.getFLG62();
		case 62:
			return workStruct.getFLG63();
		case 63:
			return workStruct.getFLG64();
		case 64:
			return workStruct.getFLG65();
		case 65:
			return workStruct.getFLG66();
		case 66:
			return workStruct.getFLG67();
		case 67:
			return workStruct.getFLG68();
		case 68:
			return workStruct.getFLG69();
		case 69:
			return workStruct.getFLG70();
		case 70:
			return workStruct.getFLG71();
		case 71:
			return workStruct.getFLG72();
		case 72:
			return workStruct.getFLG73();
		case 73:
			return workStruct.getFLG74();
		case 74:
			return workStruct.getFLG75();
		case 75:
			return workStruct.getFLG76();
		case 76:
			return workStruct.getFLG77();
		case 77:
			return workStruct.getFLG78();
		case 78:
			return workStruct.getFLG79();
		case 79:
			return workStruct.getFLG80();
		case 80:
			return workStruct.getFLG81();
		case 81:
			return workStruct.getFLG82();
		case 82:
			return workStruct.getFLG83();
		case 83:
			return workStruct.getFLG84();
		case 84:
			return workStruct.getFLG85();
		case 85:
			return workStruct.getFLG86();
		case 86:
			return workStruct.getFLG87();
		case 87:
			return workStruct.getFLG88();
		case 88:
			return workStruct.getFLG89();
		case 89:
			return workStruct.getFLG90();
		}
		return null;
	}

	/**
	 * ��ʁi�~���lHigh�j�����擾���܂��B
	 *
	 * @return �~���lHigh
	 */
	public int getHighLoad() { return _intP_HIGH_LOAD; }

	/**
	 * ��ʁi�~���lLow�j�����擾���܂��B
	 *
	 * @return �~���lLow
	 */
	public int getLowLoad() { return _intP_LOW_LOAD; }

	/**
	 * �Ώۂ̃��W�I�{�^��No���擾���܂��B
	 *
	 * @return �Ώۂ̃��W�I�{�^��No
	 */
	public int getCheckNumber() { return _checkNo; }

	/**
	 * �Ώۂ̃��W�I�{�^��No��ݒ肵�܂��B
	 *
	 * @param �Ώۂ̃��W�I�{�^��No
	 */
	public void setCheckNumber(int no) { _checkNo = no; }

	/**
	 * �V�~�����[�V�����w�肩�ۂ���Ԃ��܂��B
	 *
	 * @return true: �V�~�����[�V�����w�肠��Afalse: �V�~�����[�V�����w��Ȃ�
	 */
	public boolean isSimulation() { return _checkNo == 1; }

	/**
	 * AL�C���X�g�[���σt���O�̒l���擾���܂��B
	 *
	 * @return AL�C���X�g�[���σt���O�̒l
	 */
	public String getAlInstalledFlg() { return _alInstalledFlg; }

	/**
	 * �ŐVJPEG�t�@�C���擾�p��ID���擾���܂��B
	 *
	 * @return �ŐVJPEG�t�@�C���擾�p��ID
	 */
	public String getJpegIdentifier()
	{
		return String.valueOf(Calendar.getInstance().getTime().getTime());
	}

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>

		String tableAndKeys = null;

		try {
			// ���C����ʐF�~���l�̕ϐ��錾
			int intL_H_LOAD_C_R = 255;
			int intL_H_LOAD_C_G = 95;
			int intL_H_LOAD_C_B = 95;
			int intL_M_LOAD_C_R = 100;
			int intL_M_LOAD_C_G = 118;
			int intL_M_LOAD_C_B = 220;
			int intL_L_LOAD_C_R = 255;
			int intL_L_LOAD_C_G = 255;
			int intL_L_LOAD_C_B = 0;

			// ��ʏ����\���t���O�����Z�b�g
			_initialScreenFlg = false;
			// �����p�ɍH��R�[�h��hidden�ɃZ�b�g
			struct.setK_PLANT_CD(getsysPLANT_CD());
			// ��ʍĕ\���̂��߂ɊJ�n�E�I�����t��hidden�ɃZ�b�g
			struct.sethidden_DateFrom(struct.getDateFrom());
			struct.sethidden_DateTo(struct.getDateTo());

			// �O���t�\���p�����[�^�擾
			tableAndKeys = "SYS_LOAD_CHART_PARM.PLANT_CD,CHART_CD:"
					+ struct.getK_PLANT_CD() + ",AL0040010";
			List chartParaList = entity.mSelectChartPara.read(conn, struct);

			if (chartParaList != null && chartParaList.size() > 0) {
				AL0040010Struct workStruct = (AL0040010Struct)chartParaList.get(0);

				// Max�l
				_intP_HIGH_LOAD = workStruct.getL_HIGH_LOAD().intValue();
				// MaxColor�l
				if (isValidRgbValue(workStruct.getL_H_LOAD_C_R(), workStruct.getL_H_LOAD_C_G(),
						workStruct.getL_H_LOAD_C_B()))
				{
					intL_H_LOAD_C_R = workStruct.getL_H_LOAD_C_R().intValue();
					intL_H_LOAD_C_G = workStruct.getL_H_LOAD_C_G().intValue();
					intL_H_LOAD_C_B = workStruct.getL_H_LOAD_C_B().intValue();
				}

				// Mid�l
				_intP_MIDD_LOAD = workStruct.getL_MIDD_LOAD().intValue();
				// MidColor�l
				if (isValidRgbValue(workStruct.getL_M_LOAD_C_R(), workStruct.getL_M_LOAD_C_G(),
						workStruct.getL_M_LOAD_C_B()))
				{
					intL_M_LOAD_C_R = workStruct.getL_M_LOAD_C_R().intValue();
					intL_M_LOAD_C_G = workStruct.getL_M_LOAD_C_G().intValue();
					intL_M_LOAD_C_B = workStruct.getL_M_LOAD_C_B().intValue();
				}

				// Low�l
				_intP_LOW_LOAD = workStruct.getL_LOW_LOAD().intValue();
				// LowColor�l
				if (isValidRgbValue(workStruct.getL_L_LOAD_C_R(), workStruct.getL_L_LOAD_C_G(),
						workStruct.getL_L_LOAD_C_B()))
				{
					intL_L_LOAD_C_R = workStruct.getL_L_LOAD_C_R().intValue();
					intL_L_LOAD_C_G = workStruct.getL_L_LOAD_C_G().intValue();
					intL_L_LOAD_C_B = workStruct.getL_L_LOAD_C_B().intValue();
				}
			}

			// Hidden�J���[�ɒl���Z�b�g����
			// Max
			struct.sethidden_High_Color("#" + getHex2DigitString(intL_H_LOAD_C_R)
					+ getHex2DigitString(intL_H_LOAD_C_G) + getHex2DigitString(intL_H_LOAD_C_B));

			// Middle
			struct.sethidden_Midd_Color("#" + getHex2DigitString(intL_M_LOAD_C_R)
					+ getHex2DigitString(intL_M_LOAD_C_G) + getHex2DigitString(intL_M_LOAD_C_B));

			// Low
			struct.sethidden_Low_Color("#" + getHex2DigitString(intL_L_LOAD_C_R)
					+ getHex2DigitString(intL_L_LOAD_C_G) + getHex2DigitString(intL_L_LOAD_C_B));

			tableAndKeys = "M_CAL,M_PLANT.PLANT_CD:" + struct.getK_PLANT_CD();
			List calendarList = entity.mSelectDate.read(conn, struct);
			
			//�m��ʏ���(����From+90����)�Łn
			if (calendarList.size() <= 0 || calendarList.size() != 90 ) {
				// �J�����_�f�[�^�����݂��Ȃ��ꍇ
				// ����ʂœ��t���������Ă���̂ŁA������ʂ邱�Ƃ͂Ȃ��B
				// ��ʏ����\���t���O�̃Z�b�g
				_initialScreenFlg = true;

				// Struct���N���A
				String saveFromDay = struct.getDateFrom();
				String saveToDay = struct.getDateTo();
				clearStruct();
				struct.setDateFrom(saveFromDay);
				struct.setDateTo(saveToDay);

				// �x���F����(From�`To)�̃J�����_�}�X�^������܂���B
				ExpjMessage emsg = new ExpjMessage("AL40007");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				return;
			}

			_kFromDay = struct.getDateFrom();
			_kToDay = struct.getDateTo();

			//�Â��f�[�^���������� 
			for(int i=0; i < _headerDay.length; i++){
				_headerDay[i] = null;
				_holiDay[i] = null;
			}
			
			int calendarListSize = calendarList.size();
			for (int i = 0; i < calendarListSize; i++) {
				AL0040010Struct workStruct = (AL0040010Struct)calendarList.get(i);
				_headerDay[i] = workStruct.getCAL_DATE();
				_holiDay[i] = workStruct.getHoliday_Flg();
			}

			// �����H���ʃf�[�^���擾
			if (isSimulation()) {
				// �V�~�����[�V�����w��̏ꍇ
				tableAndKeys = "T_SIM_LOAD_DETAIL,T_LOAD_DETAIL,M_RESOURCE.PLANT_CD:"
						+ struct.getK_PLANT_CD();
				list = entity.mSelectSim.read(conn, struct);
			} else {
				// �V�~�����[�V�����w��łȂ��ꍇ
				tableAndKeys = "T_LOAD_DETAIL,M_RESOURCE.PLANT_CD:" + struct.getK_PLANT_CD();
				list = entity.mSelect.read(conn, struct);
			}
			if (list == null || list.isEmpty()) {
				//�m��ʏ���(����From�`To)�Łn�f�[�^�����݂��Ȃ��ꍇ
				// ��ʏ����\���t���O�̃Z�b�g
				_initialScreenFlg = true;
				// �x���F�Ώۃf�[�^�����݂��܂���B
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				emsg = new ExpjMessage("ZZ01006", tableAndKeys);
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				return;
			}

		} catch (SQLException se) {
			// �G���[�F�T�[�o�[�ɃG���[���������܂����B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(se, emsg);
			emsg = new ExpjMessage("ZZ01006", tableAndKeys);
			sysLog.severe(emsg, getsysUSER_CD());
			emsg = new ExpjMessage("ZZ01006", se.toString());
			sysLog.severe(emsg, getsysUSER_CD());
			throw ee;
		} catch (Exception e) {
			// �G���[�F�T�[�o�[�ɃG���[���������܂����B
			ExpjException ee = null;
			if (e instanceof ExpjException) {
				ee = (ExpjException)e;
				sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
			} else {
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ee = new ExpjException(e, emsg);
				emsg = new ExpjMessage("ZZ01006", e.toString());
				sysLog.severe(emsg, getsysUSER_CD());
			}
			throw ee;
		}

                //}}user_implement_dev:<controlSelect>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �A���J�[�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectNeckCD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlSelectNeckCD");
			//{{user_implement_dev:<controlSelectNeckCD>

		String tableAndKeys = null;

		try {
			struct.setK_PLANT_CD(getsysPLANT_CD());

			// ������
			List neckList = null;
			int intOdrStsTyp9 = 0;
			int intOdrStsTyp2 = 0;
			int intOdrStsTyp1 = 0;
			int intOdrStsTyp0 = 0;
			double dblSelDayCnt = 0;

			// �O���t�p�����[�^�����l
			int intL_CHT_DIM = 1;
			int intL_CHT_TYPE = 1;
			int intL_BG_C_R = 255;
			int intL_BG_C_G = 255;
			int intL_BG_C_B = 204;
			Double dblL_MAX_SCALE = new Double(2.0);
			Double dblL_SCALE_STEP = new Double(10.0);
			int intL_CHT_C0_R = 153;
			int intL_CHT_C0_G = 204;
			int intL_CHT_C0_B = 0;
			int intL_CHT_C1_R = 153;
			int intL_CHT_C1_G = 204;
			int intL_CHT_C1_B = 255;
			int intL_CHT_C2_R = 255;
			int intL_CHT_C2_G = 204;
			int intL_CHT_C2_B = 102;
			int intL_CHT_C9_R = 255;
			int intL_CHT_C9_G = 153;
			int intL_CHT_C9_B = 204;
			int intL_HIGH_LOAD = 100;
			int intL_H_LOAD_C_R = 255;
			int intL_H_LOAD_C_G = 95;
			int intL_H_LOAD_C_B = 95;
			int intL_MIDD_LOAD = 80;
			int intL_M_LOAD_C_R = 100;
			int intL_M_LOAD_C_G = 118;
			int intL_M_LOAD_C_B = 220;
			int intL_LOW_LOAD = 40;
			int intL_L_LOAD_C_R = 255;
			int intL_L_LOAD_C_G = 255;
			int intL_L_LOAD_C_B = 0;

			// �����H�����ʕ��׎Q�ƂőI��������
			int intL_SEL_DAY_C_R = 0;
			int intL_SEL_DAY_C_G = 0;
			int intL_SEL_DAY_C_B = 0;

			AL0040010Struct workStruct = null;

			// �O���t�p�f�[�^�쐬������
			strGraphNeckProcCd = struct.getK_NECK_PROC_CD();

			// �O���t�\���p�����[�^�擾
			tableAndKeys = "SYS_LOAD_CHART_PARM.PLANT_CD,CHART_CD:"
					+ struct.getK_PLANT_CD() + ",AL0040010";
			List chartParaList = entity.mSelectChartPara.read(conn, struct);
			if (chartParaList != null && chartParaList.size() > 0) {
				workStruct = (AL0040010Struct)chartParaList.get(0);

				intL_CHT_DIM = workStruct.getL_CHT_DIM().intValue();
				intL_CHT_TYPE = workStruct.getL_CHT_TYPE().intValue();
				if (isValidRgbValue(workStruct.getL_BG_C_R(), workStruct.getL_BG_C_G(),
						workStruct.getL_BG_C_B()))
				{
					intL_BG_C_R = workStruct.getL_BG_C_R().intValue();
					intL_BG_C_G = workStruct.getL_BG_C_G().intValue();
					intL_BG_C_B = workStruct.getL_BG_C_B().intValue();
				}

				dblL_MAX_SCALE = workStruct.getL_MAX_SCALE();
				dblL_SCALE_STEP = workStruct.getL_SCALE_STEP();
				if (isValidRgbValue(workStruct.getL_CHT_C0_R(), workStruct.getL_CHT_C0_G(),
						workStruct.getL_CHT_C0_B()))
				{
					intL_CHT_C0_R = workStruct.getL_CHT_C0_R().intValue();
					intL_CHT_C0_G = workStruct.getL_CHT_C0_G().intValue();
					intL_CHT_C0_B = workStruct.getL_CHT_C0_B().intValue();
				}

				if (isValidRgbValue(workStruct.getL_CHT_C1_R(), workStruct.getL_CHT_C1_G(),
						workStruct.getL_CHT_C1_B()))
				{
					intL_CHT_C1_R = workStruct.getL_CHT_C1_R().intValue();
					intL_CHT_C1_G = workStruct.getL_CHT_C1_G().intValue();
					intL_CHT_C1_B = workStruct.getL_CHT_C1_B().intValue();
				}

				if (isValidRgbValue(workStruct.getL_CHT_C2_R(), workStruct.getL_CHT_C2_G(),
						workStruct.getL_CHT_C2_B()))
				{
					intL_CHT_C2_R = workStruct.getL_CHT_C2_R().intValue();
					intL_CHT_C2_G = workStruct.getL_CHT_C2_G().intValue();
					intL_CHT_C2_B = workStruct.getL_CHT_C2_B().intValue();
				}

				if (isValidRgbValue(workStruct.getL_CHT_C9_R(), workStruct.getL_CHT_C9_G(),
						workStruct.getL_CHT_C9_B()))
				{
					intL_CHT_C9_R = workStruct.getL_CHT_C9_R().intValue();
					intL_CHT_C9_G = workStruct.getL_CHT_C9_G().intValue();
					intL_CHT_C9_B = workStruct.getL_CHT_C9_B().intValue();
				}

				intL_HIGH_LOAD = workStruct.getL_HIGH_LOAD().intValue();
				if (isValidRgbValue(workStruct.getL_H_LOAD_C_R(), workStruct.getL_H_LOAD_C_G(),
						workStruct.getL_H_LOAD_C_B()))
				{
					intL_H_LOAD_C_R = workStruct.getL_H_LOAD_C_R().intValue();
					intL_H_LOAD_C_G = workStruct.getL_H_LOAD_C_G().intValue();
					intL_H_LOAD_C_B = workStruct.getL_H_LOAD_C_B().intValue();
				}

				intL_MIDD_LOAD = workStruct.getL_MIDD_LOAD().intValue();
				if (isValidRgbValue(workStruct.getL_M_LOAD_C_R(), workStruct.getL_M_LOAD_C_G(),
						workStruct.getL_M_LOAD_C_B()))
				{
					intL_M_LOAD_C_R = workStruct.getL_M_LOAD_C_R().intValue();
					intL_M_LOAD_C_G = workStruct.getL_M_LOAD_C_G().intValue();
					intL_M_LOAD_C_B = workStruct.getL_M_LOAD_C_B().intValue();
				}

				intL_LOW_LOAD = workStruct.getL_LOW_LOAD().intValue();
				if (isValidRgbValue(workStruct.getL_L_LOAD_C_R(), workStruct.getL_L_LOAD_C_G(),
						workStruct.getL_L_LOAD_C_B()))
				{
					intL_L_LOAD_C_R = workStruct.getL_L_LOAD_C_R().intValue();
					intL_L_LOAD_C_G = workStruct.getL_L_LOAD_C_G().intValue();
					intL_L_LOAD_C_B = workStruct.getL_L_LOAD_C_B().intValue();
				}
			}

			// �����}�X�^���擾
			tableAndKeys = "M_RESOURCE.PLANT_CD,NECK_PROC_CD:"
					+ struct.getK_PLANT_CD() + "," + struct.getK_NECK_PROC_CD();
			List resouceList = entity.mSelectResource.read(conn, struct);
			if (resouceList == null || resouceList.isEmpty()) {
				// �����}�X�^�����݂��Ȃ��ꍇ
				// �x���F�����}�X�^�����݂��܂���B
				ExpjMessage emsg = new ExpjMessage("AL60006");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				emsg = new ExpjMessage("ZZ01006", tableAndKeys);
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				// �����H�����ʕ��׎Q�Ɖ�ʂ��ĕ\��
				controlSelect();
				return;
			}

			workStruct = (AL0040010Struct)resouceList.get(0);
			struct.setL_NECK_PROC_CD(workStruct.getL_NECK_PROC_CD());
			struct.setL_NECK_PROC_NAME(workStruct.getL_NECK_PROC_NAME());
			struct.setL_NECK_PROC_CAPA(workStruct.getL_NECK_PROC_CAPA());
			struct.setL_NECK_PROC_CAPA_UNIT(workStruct.getL_NECK_PROC_CAPA_UNIT());
			strGraphNeckProcCapa = workStruct.getL_NECK_PROC_CAPA();

			// �O���t�\�������ݒ�
			int intNeckDateSize = 41;
			// ���׃O���t���׎擾
			// �V�~�����[�V�����f�[�^���������邩�ۂ���entity�ύX
			if (isSimulation()) {
				tableAndKeys = "T_LOAD_DETAIL,T_SIM_LOAD_DETAIL.PLANT_CD,NECK_PROC_CD:"
						+ struct.getK_PLANT_CD() + ","+ struct.getK_NECK_PROC_CD();
				neckList = entity.mSelectNeckCDSim.read(conn, struct);
			} else {
				tableAndKeys = "T_LOAD_DETAIL.PLANT_CD,NECK_PROC_CD:"
						+ struct.getK_PLANT_CD() + "," + struct.getK_NECK_PROC_CD();
				neckList = entity.mSelectNeckCD.read(conn, struct);
			}
			int neckListSize = neckList.size();

			// �O���t�z��J�E���^
			int intGraphDataListCnt = 0;
			int intGraphDataListSize = neckListSize + intNeckDateSize;
			// �O���t�p�z��Ē�`
			GraphDataList = new String[intGraphDataListSize][4];

			// �O���t�\�����t�f�[�^�Z�b�g
			Calendar cal = new GregorianCalendar();
			Date dateDefFrom;
			cal.setTime(Converter.strToDate(struct.getK_LOAD_DATE(), "yyyy/MM/dd"));
			cal.add(Calendar.DATE, -20);

			String strWkODR_STS_TYP = null;
			String locale = CoreTools.getLocale(sysUSER_CD);
			if (neckList != null && neckListSize > 0) {
				workStruct = (AL0040010Struct)neckList.get(0);
				// ������̏ꍇ�A�p����Z�b�g
				if(LOCALE_ZH.equals(locale)){
					strWkODR_STS_TYP = getDisplayName(ODR_STS_TYP_EN, workStruct.getL_ODR_STS_TYP());
				}else{
					strWkODR_STS_TYP = getDisplayName(ODR_STS_TYP, workStruct.getL_ODR_STS_TYP());
				}
			} else {
				strWkODR_STS_TYP = "";
			}

			for(int i=0;i<neckListSize;i++){
				AL0040010Struct multiLngStruct = (AL0040010Struct)neckList.get(i);
				// ������̏ꍇ�A�p����Z�b�g
				if(LOCALE_ZH.equals(locale)){
					multiLngStruct.setL_ODR_STS_TYP(getDisplayName(ODR_STS_TYP_EN, multiLngStruct.getL_ODR_STS_TYP()));
				}else{
					multiLngStruct.setL_ODR_STS_TYP(getDisplayName(ODR_STS_TYP, multiLngStruct.getL_ODR_STS_TYP()));
				}
			}
			
			//!DEBUG�p�R�[�h
			//System.out.println("\t�A���J�[�I���: " + struct.getS_LOAD_DATE());

			for (int i = 0; i < intNeckDateSize; i++) {
				String strLOAD_DATE = Converter.dateToStr(cal.getTime(), "yyyy/MM/dd");
				GraphDataList[i][0] = strGraphNeckProcCd;
				if (strLOAD_DATE.equals(struct.getS_LOAD_DATE()) == true) {
					dblSelDayCnt = i + 0.5;
				}
				GraphDataList[i][1] = strLOAD_DATE;
				GraphDataList[i][2] = "0";
				GraphDataList[i][3] = strWkODR_STS_TYP;
				intGraphDataListCnt = i;
				cal.add(Calendar.DATE, 1);
			}

			// ���׃O���t�f�[�^�Z�b�g
			if (neckList == null || neckList.isEmpty()) {
				// �x���F�Ώۃf�[�^�����݂��܂���B
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				emsg = new ExpjMessage("ZZ01006", tableAndKeys);
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				// �����H�����ʕ��׎Q�Ɖ�ʂ��ĕ\��
				controlSelect();
				return;
			}

			for (int i = 0; i < neckListSize; i++) {
				workStruct = (AL0040010Struct)neckList.get(i);
				GraphDataList[i + intGraphDataListCnt + 1][0] = workStruct.getL_NECK_PROC_CD();
				GraphDataList[i + intGraphDataListCnt + 1][1] = workStruct.getL_LOAD_DATE();
				GraphDataList[i + intGraphDataListCnt + 1][2] = workStruct.getL_LOAD_QTY();
				GraphDataList[i + intGraphDataListCnt + 1][3] = workStruct.getL_ODR_STS_TYP();
				if (workStruct.getL_ODR_STS_TYP().substring(0, 1).equals("9") == true) {
					intOdrStsTyp9 = 1;
				} else if (workStruct.getL_ODR_STS_TYP().substring(0, 1).equals("2") == true) {
					intOdrStsTyp2 = 1;
				} else if (workStruct.getL_ODR_STS_TYP().substring(0, 1).equals("1") == true) {
					intOdrStsTyp1 = 1;
				} else if (workStruct.getL_ODR_STS_TYP().substring(0, 1).equals("0") == true) {
					intOdrStsTyp0 = 1;
				}
			}
			// �O���t�p�f�[�^�쐬������

			// �O���t�쐬������
			// �v���p�e�B�[�t�@�C������p�����[�^���擾
			// �o�̓p�X���擾
			ResourceBundle rb = SystemConfig.getBundle();
			String outWebRoot = SystemConfig.getProperty("WEBROOT", rb);
			String outPath = SystemConfig.getProperty("GRAPH_OUT_PATH", rb);
			String templatePath = SystemConfig.getProperty("GRAPH_TEMPLATE_PATH", rb);

			if (outWebRoot == null || outPath == null || templatePath == null) {
				// �v���p�e�B�l��null�̏ꍇ
				// catch��ɔ�΂����Ƃ��ړI�Ȃ̂ŁA�����͂��ׂă_�~�[�i�󕶎���j�Ƃ���B
				throw new MissingResourceException("", "", "");
			}

			if (intGraphDataListSize > 0) {
				// �o�̓f�B���N�g�����`�F�b�N
				File writePath = new File(outWebRoot, outPath);
				if (writePath.exists() == false) {
					// ���݂��Ȃ������ꍇ
					// �f�B���N�g�����쐬
					if (writePath.mkdirs() == false) {
						throw new FoundationException(getClass().getName(), "checkPath()",
								"(SBM0864)�f�B���N�g���̍쐬�Ɏ��s���܂����B�F" + writePath.getPath());
					}
				}

				// �t�@�C��������
				// �O���t�C���[�W�t�@�C����
				_jpegName = getFileName(outPath, getsysUSER_CD());
				_jpegFullName = getFileName(outWebRoot, _jpegName);

				// �O���t�C���[�W�}�b�v�t�@�C����
				_mapName = getFileName(outPath, getsysUSER_CD());
				_mapFullName = getFileName(outWebRoot, _mapName);

				// �O���t�p�f�[�^�̗�̈Ӗ��Â�
				ColInfo colInfo = new ColInfo();
				colInfo.series = 0;
				colInfo.category = 1;
				colInfo.sumBy = 3;
				colInfo.value = 2;

				// �O���t�p�f�[�^�̃f�[�^�\����`
				String fieldName[] = { "NECK_PROC_CD", "LOAD_DATE", "LOAD_QTY", "ODR_STS_TYP" };
				String dataType[] = { "varchar", "varchar", "double", "varchar" };

				// �O���t�p�f�[�^�쐬
				DbData graphData = new DbData(dataType, fieldName, GraphDataList);

				// chart server���g�p���Ȃ�
				QbChart.setChartServerUsed(false);

				// �`���[�g�����p�����[�^�쐬
				// �O���t����
				int intChartView = ToQbChartView(intL_CHT_DIM);
				// �O���t���
				int intChartType = ToQbChartType(intL_CHT_TYPE);

				// �O���t�e���v���[�g�t�@�C����
				if (intChartView == QbChart.VIEW3D) {
					TPLFullName = getFileName(templatePath, "AL00400203D.tpl");
				} else {
					TPLFullName = getFileName(templatePath, "AL00400202D.tpl");
				}

				// �`���[�g����
				// following is obsolete style...
				//QbChart chart = new QbChart(new Frame(), intChartView, intChartType, graphData,
				//		colInfo, TPLFullName);
				QbChart chart = new QbChart((Applet)null, intChartView, intChartType, graphData,
						colInfo, TPLFullName);

				// �G���[����
				String errorMessage = chart.getErrorMessage();
				if (errorMessage != null) {
					// �x���F�O���t�̐����Ɏ��s���܂����B
					ExpjMessage emsg = new ExpjMessage("AL40013");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, getsysUSER_CD());
					emsg = new ExpjMessage("ZZ01006", errorMessage);
					msgStruct.addError(emsg);
					sysLog.warning(emsg, getsysUSER_CD());
					// �����H�����ʕ��׎Q�Ɖ�ʂ��ĕ\��
					controlSelect();
					return;
				}

				// �w�i�F�ݒ�
				ILegend hLegend = chart.gethLegend();
				hLegend.setBackgroundColor(new Color(intL_BG_C_R, intL_BG_C_G, intL_BG_C_B));
				IPlot hChartPlot = chart.gethChartPlot();
				hChartPlot.setBackgroundColor(new Color(intL_BG_C_R, intL_BG_C_G, intL_BG_C_B));

				// �O���t�f�[�^�̃\�[�g�����ǉ�
				IDataPointSet hDataPoints = chart.gethDataPoints();
				hDataPoints.setSortOrder(QbChart.CATEGORY, QbChart.ASCENDING);
				hDataPoints.setSortOrder(QbChart.SUMBY, QbChart.DESCENDING);
				// �O���t�J�����̕��ݒ�
				hDataPoints.setBarGapToWidthRatio((float)0);

				// �O���t�̐F�ݒ�
				Color[] chartColor = new Color[intOdrStsTyp9 + intOdrStsTyp2 + 1 + intOdrStsTyp0];
				int idx = 0;
				if (intOdrStsTyp9 == 1) {
					chartColor[idx] = new Color(intL_CHT_C9_R, intL_CHT_C9_G, intL_CHT_C9_B);
					idx++;
				}
				if (intOdrStsTyp2 == 1) {
					chartColor[idx] = new Color(intL_CHT_C2_R, intL_CHT_C2_G, intL_CHT_C2_B);
					idx++;
				}
				if (intOdrStsTyp1 == 1) {
					chartColor[idx] = new Color(intL_CHT_C1_R, intL_CHT_C1_G, intL_CHT_C1_B);
					idx++;
				}
				if (intOdrStsTyp0 == 1) {
					chartColor[idx] = new Color(intL_CHT_C0_R, intL_CHT_C0_G, intL_CHT_C0_B);
				}
				hDataPoints.setColors(chartColor);

				// �O���t0(ZERO)�f�[�^�̕\��
				hDataPoints.setZeroAsNullData(false);

				// Set axises
				IAxis hXAxis, hYAxis;
				hXAxis = chart.gethXAxis();
				hXAxis.setGridVisible(false);
				hXAxis.setVisible(true);
				hYAxis = chart.gethYAxis();
				hYAxis.setGridVisible(true);

				// Set Y axis scale, min=0, max = ����H��CAPA*�p�����[�^�̔{��,
				// step size = max / �p�����[�^�̃X�e�b�v
				
				/***********************************************************************/
				
				ILabel hXLabel = hXAxis.gethLabel();
				Dimension hDimension = new Dimension();
				hDimension.setSize(0, 2.5);
				hXLabel.setOffset(hDimension);
				
				/***********************************************************************/
				
				// ���ח�(Y��)�̍ő�l��ݒ�
				// �A���A�p�����[�^�̔{����0�ȉ��̏ꍇ�́A������
				long lngYMaxScale = 0;
				if (dblL_MAX_SCALE.doubleValue() > 0) {
					double dblYMaxScale = (new Double(strGraphNeckProcCapa).doubleValue()
							* dblL_MAX_SCALE.doubleValue());
					lngYMaxScale = Math.round(dblYMaxScale);
					if (dblYMaxScale > lngYMaxScale) {
						lngYMaxScale++;
					}
					hYAxis.setScaleAutomatic(false);
					hYAxis.setMinScale(new Integer(0));
					hYAxis.setMaxScale(new Integer(Long.toString(lngYMaxScale)));
				} else {
					lngYMaxScale = Math.round(Double.parseDouble(strGraphNeckProcCapa));
				}

				// ���ח�(Y��)�̖ڐ���\���Ԋu��ݒ�
				double dblScaleStep = lngYMaxScale / dblL_SCALE_STEP.doubleValue();
				long lngScaleStep = Math.round(dblScaleStep);
				hYAxis.setScaleStep(new Integer(Long.toString(lngScaleStep)));
				hYAxis.setVisible(true);

				// HyperLink �쐬
				IHyperLinkSet hHyperLinks = chart.gethHyperLinks();
				// �S�Ẵn�C�p�[�����N���폜
				hHyperLinks.removeAll();

				for (int i = 0; i < neckListSize; i++) {
					int ii = i + intGraphDataListCnt + 1;

					//!DEBUG�p�R�[�h
					//System.out.println("\tHyperLink...");
					//System.out.println("\tGraphDataList[" + ii + "][0]: " + GraphDataList[ii][0]);
					//System.out.println("\tGraphDataList[" + ii + "][1]: " + GraphDataList[ii][1]);
					//System.out.println("\tGraphDataList[" + ii + "][3]: " + GraphDataList[ii][3]);

					// ��ʕ��郁�b�Z�[�W��\���p�ɕ�Window�\���ɕύX
					StringBuffer anchor = new StringBuffer(256);
					anchor.append("AL0040010Servlet?Pid=AL0040012&NeckCd=");
					anchor.append(GraphDataList[ii][0]);
					anchor.append("&LoadDay=");
					anchor.append(GraphDataList[ii][1]);
					anchor.append("&GraphDay=");
					anchor.append(struct.getK_LOAD_DATE());
					anchor.append("&ShiftDay=");
					anchor.append(struct.getShift_Date());
					anchor.append("&DateFrom=");
					anchor.append(struct.getDateFrom());
					anchor.append("&DateTo=");
					anchor.append(struct.getDateTo());
					anchor.append("&SLoadDay=");
					anchor.append(struct.getS_LOAD_DATE());
					anchor.append("\" onClick=\"return clickHyperlink(this.form)");
					//!DEBUG�p�R�[�h
					//System.out.println("\tanchor: " + anchor.toString());
					hHyperLinks.add(new HyperLink(GraphDataList[ii][0], GraphDataList[ii][1],
							GraphDataList[ii][3], anchor.toString(), ""));
				}

				// TrendLine �쐬
				IDataLineSet hDataLines = chart.gethDataLines();

				// �����H�����ʕ��׎Q�ƂɂđI�����ꂽ���t����������A�c���C���ǉ�
				if (dblSelDayCnt > 0) {
					IHorzVertLine SelDayLine
							= hDataLines.newHorzVertLine(IHorzVertLine.VERTICAL_LINE, "");
					SelDayLine.setColor(new Color(intL_SEL_DAY_C_R, intL_SEL_DAY_C_G,
							intL_SEL_DAY_C_B));
					SelDayLine.setLineValue(dblSelDayCnt); // vertical line on Select Day value
					SelDayLine.setThickness(1);
					SelDayLine.setTitleVisibleInLegend(false);
					hDataLines.add(SelDayLine);
				}
				// �O���t�Œ�����̏ꍇ�͉p��ɕς���
				String fuka = LOAD_JP;
				
				// ������̏ꍇ�A�p����Z�b�g
				if(LOCALE_ZH.equals(locale) || LOCALE_EN.equals(locale)){
					fuka = LOAD_EN;
				}
				
				// �v���p�e�B�[�t�@�C���ɍō����חʂ��ݒ肳��Ă����烉�C���ݒ�
				if (intL_HIGH_LOAD > 0) {
					IHorzVertLine HighLine
							= hDataLines.newHorzVertLine(IHorzVertLine.HORIZONTAL_LINE,
									fuka + intL_HIGH_LOAD + "%");
					HighLine.setColor(new Color(intL_H_LOAD_C_R, intL_H_LOAD_C_G, intL_H_LOAD_C_B));
					HighLine.setLineValue(Double.parseDouble(strGraphNeckProcCapa)
							* intL_HIGH_LOAD / 100);	// horizontal line on high value
					HighLine.setThickness(5);
					hDataLines.add(HighLine);
				}

				// �v���p�e�B�[�t�@�C���ɕW�����חʂ��ݒ肳��Ă����烉�C���ݒ�
				if (intL_MIDD_LOAD > 0) {
					IHorzVertLine MidLine
							= hDataLines.newHorzVertLine(IHorzVertLine.HORIZONTAL_LINE,
									fuka + intL_MIDD_LOAD + "%");
					MidLine.setColor(new Color(intL_M_LOAD_C_R, intL_M_LOAD_C_G, intL_M_LOAD_C_B));
					MidLine.setLineValue(Double.parseDouble(strGraphNeckProcCapa)
							* intL_MIDD_LOAD / 100);	// horizontal line on middle value
					MidLine.setThickness(5);
					hDataLines.add(MidLine);
				}

				// �v���p�e�B�[�t�@�C���ɍŒᕉ�חʂ��ݒ肳��Ă����烉�C���ݒ�
				if (intL_LOW_LOAD > 0) {
					IHorzVertLine LowLine
							= hDataLines.newHorzVertLine(IHorzVertLine.HORIZONTAL_LINE,
									fuka + intL_LOW_LOAD + "%");
					LowLine.setColor(new Color(intL_L_LOAD_C_R, intL_L_LOAD_C_G, intL_L_LOAD_C_B));
					LowLine.setLineValue(Double.parseDouble(strGraphNeckProcCapa)
							* intL_LOW_LOAD / 100);	// horizontal line on low value
					LowLine.setThickness(5);
					hDataLines.add(LowLine);
				}

				// Export the chart
				chart.export(QbChart.JPEG, _jpegFullName, _mapFullName, 900, 380);
				errorMessage = chart.getErrorMessage();
				if (errorMessage != null) {
					// �x���F�O���t�̐����Ɏ��s���܂����B
					ExpjMessage emsg = new ExpjMessage("AL40013");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, getsysUSER_CD());
					emsg = new ExpjMessage("ZZ01006", errorMessage);
					msgStruct.addError(emsg);
					sysLog.warning(emsg, getsysUSER_CD());
					// �����H�����ʕ��׎Q�Ɖ�ʂ��ĕ\��
					controlSelect();
					return;
				}

				// ���t�@�C���̑��ݔ���
				File orgfile = new File(_mapFullName + ".map");
				if (orgfile.exists() == true) {
					// �t�@�C�������l�[��
					File newfile = new File(_mapFullName + ".html");
					if (newfile.exists() == true) {
						// �t�@�C�����폜
						if (newfile.delete() == false) {
							// �폜�����s�����ꍇ
							System.out.println("(SBM0885)��HTML�t�@�C���̍폜�Ɏ��s���܂����B");
						}
					}
					if (orgfile.renameTo(newfile) == false) {
						// ���l�[���Ɏ��s
						System.out.println("(SBM0886)�}�b�v�t�@�C������HTML�t�@�C���ւ̃��l�[���Ɏ��s���܂����B");
					}
				} else {
					// ���t�@�C�������݂��Ȃ�
					System.out.println("(SBM0887)�}�b�v�t�@�C�������݂��܂���B");
				}
			}
			// �O���t�p�f�[�^�쐬������

		} catch (SQLException se) {
			// �G���[�F�T�[�o�[�ɃG���[���������܂����B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(se, emsg);
			emsg = new ExpjMessage("ZZ01006", tableAndKeys);
			sysLog.severe(emsg, getsysUSER_CD());
			emsg = new ExpjMessage("ZZ01006", se.toString());
			sysLog.severe(emsg, getsysUSER_CD());
			throw ee;
		} catch (MissingResourceException mre) {
			// �x���F�v���p�e�B�t�@�C���̓ǂݍ��݂Ɏ��s���܂����B
			ExpjMessage emsg = new ExpjMessage("AL40010");
			msgStruct.addError(emsg);
			sysLog.warning(emsg, getsysUSER_CD());
			// �����H�����ʕ��׎Q�Ɖ�ʂ��ĕ\��
			controlSelect();
			return;
		} catch (ParseException pe) {
			// �G���[�F�T�[�o�[�ɃG���[���������܂����B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(pe, emsg);
			emsg = new ExpjMessage("ZZ01006", pe.toString());
			sysLog.severe(emsg, getsysUSER_CD());
			throw ee;
		} catch (IOException ioe) {
			// �G���[�F�T�[�o�[�ɃG���[���������܂����B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(ioe, emsg);
			emsg = new ExpjMessage("ZZ01006", ioe.toString());
			sysLog.severe(emsg, getsysUSER_CD());
			throw ee;
		} catch (Exception e) {
			// �G���[�F�T�[�o�[�ɃG���[���������܂����B
			ExpjException ee = null;
			if (e instanceof ExpjException) {
				ee = (ExpjException)e;
				sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
			} else {
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ee = new ExpjException(e, emsg);
				emsg = new ExpjMessage("ZZ01006", e.toString());
				sysLog.severe(emsg, getsysUSER_CD());
			}
			throw ee;
		}

                //}}user_implement_dev:<controlSelectNeckCD>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlSelectNeckCD");

		return;
	}

	/**
	 * �����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect_Prev() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect_Prev");
			//{{user_implement_dev:<controlSelect_Prev>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlSelect_Prev>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect_Prev");

		return;
	}

	/**
	 * �E���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect_Next() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect_Next");
			//{{user_implement_dev:<controlSelect_Next>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlSelect_Next>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect_Next");

		return;
	}

	/**
	 * �O���t�����N�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelectNeckDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlSelectNeckDetail");
			//{{user_implement_dev:<controlSelectNeckDetail>

		String tableAndKeys = null;

		try {
			struct.setK_PLANT_CD(getsysPLANT_CD());
			List neckDtHdList = null;

			// ���ז��׃w�b�_���擾
			// �V�~�����[�V�����f�[�^���������邩�ۂ���entity�ύX
			if (isSimulation()) {
				tableAndKeys = "T_LOAD_DETAIL,T_SIM_LOAD_DETAIL,M_RESOURCE.PLANT_CD,NECK_PROC_CD:"
						+ struct.getK_PLANT_CD() + "," + struct.getK_NECK_PROC_CD();
				neckDtHdList = entity.mSelectNeckDtHdSim.read(conn, struct);
			} else {
				tableAndKeys = "T_LOAD_DETAIL,M_RESOURCE.PLANT_CD,NECK_PROC_CD:"
						+ struct.getK_PLANT_CD() + "," + struct.getK_NECK_PROC_CD();
				neckDtHdList = entity.mSelectNeckDtHd.read(conn, struct);
			}

			if (neckDtHdList == null || neckDtHdList.isEmpty()) {
				// �x���F�Ώۃf�[�^�����݂��܂���B
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				emsg = new ExpjMessage("ZZ01006", tableAndKeys);
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
				return;
			}

			AL0040010Struct workStruct = (AL0040010Struct)neckDtHdList.get(0);
			struct.setLKM_NECK_PROC_CD(workStruct.getLKM_NECK_PROC_CD());
			struct.setLKM_NECK_PROC_NAME(workStruct.getLKM_NECK_PROC_NAME());
			struct.setLKM_NECK_PROC_CAPA(workStruct.getLKM_NECK_PROC_CAPA());
			struct.setLKM_NECK_PROC_CAPA_UNIT(workStruct.getLKM_NECK_PROC_CAPA_UNIT());
			struct.setLKM_LOAD_DATE(workStruct.getLKM_LOAD_DATE());
			struct.setLKM_SUM_LOAD_QTY(workStruct.getLKM_SUM_LOAD_QTY());
			struct.setLKM_OVR_LOAD_QTY(workStruct.getLKM_OVR_LOAD_QTY());

			// ���ז��׎擾
			// �V�~�����[�V�����f�[�^���������邩�ۂ���entity�ύX
			if (isSimulation()) {
				tableAndKeys = "T_LOAD_DETAIL,T_SIM_LOAD_DETAIL.PLANT_CD,NECK_PROC_CD:"
						+ struct.getK_PLANT_CD() + "," + struct.getK_NECK_PROC_CD();
				list = entity.mSelectNeckDetailSim.read(conn, struct);
			} else {
				tableAndKeys = "T_LOAD_DETAIL.PLANT_CD,NECK_PROC_CD:"
						+ struct.getK_PLANT_CD() + "," + struct.getK_NECK_PROC_CD();
				list = entity.mSelectNeckDetail.read(conn, struct);
			}
			for (int i = 0; i < list.size(); i++) {
				// �R���{�{�b�N�X�̎擾
				othercomboTyp((AL0040010Struct)list.get(i));
			}

		} catch (SQLException se) {
			// �G���[�F�T�[�o�[�ɃG���[���������܂����B
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(se, emsg);
			emsg = new ExpjMessage("ZZ01006", tableAndKeys);
			sysLog.severe(emsg, getsysUSER_CD());
			emsg = new ExpjMessage("ZZ01006", se.toString());
			sysLog.severe(emsg, getsysUSER_CD());
			throw ee;
		}

                //}}user_implement_dev:<controlSelectNeckDetail>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlSelectNeckDetail");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>

		_closeScreenFlg = true;

                //}}user_implement_dev:<controlClose>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>

		// ��ʏ����\���t���O�̃Z�b�g
		_initialScreenFlg = true;

		// Struct���N���A
		clearStruct();

		// �f�t�H�[���g��From���t��To���t��ݒ�
		setDefaultFromAndToDate();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlCancelSub1");
			//{{user_implement_dev:<controlCancelSub1>

		controlSelect();

                //}}user_implement_dev:<controlCancelSub1>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlCancelSub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCancelSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlCancelSub2");
			//{{user_implement_dev:<controlCancelSub2>

		if (_alInstalledFlg.equals("0") == true) {
			// AL���C���X�g�[������Ă��Ȃ��ꍇ
			controlSelect();
		} else {
			// AL���C���X�g�[������Ă���ꍇ
			struct.setL_NECK_PROC_CD(struct.getLKM_NECK_PROC_CD());
			struct.setL_NECK_PROC_NAME(struct.getLKM_NECK_PROC_NAME());
			struct.setL_NECK_PROC_CAPA(struct.getLKM_NECK_PROC_CAPA());
			struct.setL_NECK_PROC_CAPA_UNIT(struct.getLKM_NECK_PROC_CAPA_UNIT());
			controlSelectNeckCD();
		}

                //}}user_implement_dev:<controlCancelSub2>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlCancelSub2");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

		try {
			_closeScreenFlg = false;

			// ���C����ʐF�~���l�̕ϐ��錾
			int intL_H_LOAD_C_R = 255;
			int intL_H_LOAD_C_G = 0;
			int intL_H_LOAD_C_B = 0;
			int intL_M_LOAD_C_R = 0;
			int intL_M_LOAD_C_G = 0;
			int intL_M_LOAD_C_B = 255;
			int intL_L_LOAD_C_R = 255;
			int intL_L_LOAD_C_G = 255;
			int intL_L_LOAD_C_B = 0;

			// �Ɩ�ID���擾���ăZ�b�g
			sysPROC_ID = sp.getProcId();

			// Hidden�J���[�ɒl���Z�b�g����
			// Max
			struct.sethidden_High_Color("#" + getHex2DigitString(intL_H_LOAD_C_R)
					+ getHex2DigitString(intL_H_LOAD_C_G) + getHex2DigitString(intL_H_LOAD_C_B));

			// Middle
			struct.sethidden_Midd_Color("#" + getHex2DigitString(intL_M_LOAD_C_R)
					+ getHex2DigitString(intL_M_LOAD_C_G) + getHex2DigitString(intL_M_LOAD_C_B));

			// Low
			struct.sethidden_Low_Color("#" + getHex2DigitString(intL_L_LOAD_C_R)
					+ getHex2DigitString(intL_L_LOAD_C_G) + getHex2DigitString(intL_L_LOAD_C_B));

			// Struct���N���A
			clearStruct();

			// �f�t�H�[���g��From���t��To���t��ݒ�
			setDefaultFromAndToDate();

			// AL�C���X�g�[���σt���O�̒l��ݒ�
			setAlInstalledFlg();

		} catch (Exception e) {
			ExpjException ee = null;
			if (e instanceof ExpjException) {
				ee = (ExpjException)e;
				sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
			} else {
				// �G���[�F�T�[�o�[�ɃG���[���������܂����B
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				ee = new ExpjException(e, emsg);
				emsg = new ExpjMessage("ZZ01006", e.toString());
				sysLog.severe(emsg, getsysUSER_CD());
			}
			throw ee;
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0040");
		logger.entering("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			try{
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);
				ComboBox comboController_en = new ComboBox(conn, sysUSER_CD.substring(0,sysUSER_CD.length()-1) + "1");
				// �R���v�{�b�N�X�̓��e������Ή�
				ODR_STS_TYP = comboController.getData(ODR_STS_TYP_PARAMETER_NAME);
				ODR_STS_TYP_EN = comboController_en.getData(ODR_STS_TYP_PARAMETER_NAME);
			} catch (SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
				ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
				throw ee;
			}
//			conn.beginTransWeb();
			// �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AL0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("SelectNeckCD") ) {
				controlSelectNeckCD();
			} else if( button.equals("Select_Prev") ) {
				controlSelect_Prev();
			} else if( button.equals("Select_Next") ) {
				controlSelect_Next();
			} else if( button.equals("SelectNeckDetail") ) {
				controlSelectNeckDetail();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("CancelSub1") ) {
				controlCancelSub1();
			} else if( button.equals("CancelSub2") ) {
				controlCancelSub2();
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
//			throw new FoundationException("AL0040010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0040010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AL0040010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0040010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AL0040010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0040010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AL0040010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AL0040010Entity entity;
	protected AL0040010Struct struct;
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

		entity = new AL0040010Entity();
		struct = new AL0040010Struct();

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
	 * AL0040010�N���X�̕W���R���X�g���N�^
	 */
	public AL0040010Control() throws BusinessProcessException, FoundationException
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
				AL0040010Struct key = (AL0040010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("Shift_Date") && key.getShift_Date() != null) {
					msgKey.setKeyValue("Shift_Date", key.getShift_Date());
				}
				if(msgKeyType.containsKeyColumn("hidden_High_Color") && key.gethidden_High_Color() != null) {
					msgKey.setKeyValue("hidden_High_Color", key.gethidden_High_Color());
				}
				if(msgKeyType.containsKeyColumn("hidden_Midd_Color") && key.gethidden_Midd_Color() != null) {
					msgKey.setKeyValue("hidden_Midd_Color", key.gethidden_Midd_Color());
				}
				if(msgKeyType.containsKeyColumn("hidden_Low_Color") && key.gethidden_Low_Color() != null) {
					msgKey.setKeyValue("hidden_Low_Color", key.gethidden_Low_Color());
				}
				if(msgKeyType.containsKeyColumn("hidden_DateFrom") && key.gethidden_DateFrom() != null) {
					msgKey.setKeyValue("hidden_DateFrom", key.gethidden_DateFrom());
				}
				if(msgKeyType.containsKeyColumn("hidden_DateTo") && key.gethidden_DateTo() != null) {
					msgKey.setKeyValue("hidden_DateTo", key.gethidden_DateTo());
				}
				if(msgKeyType.containsKeyColumn("S_LOAD_DATE") && key.getS_LOAD_DATE() != null) {
					msgKey.setKeyValue("S_LOAD_DATE", key.getS_LOAD_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_AlInstalledFlg") && key.getw_AlInstalledFlg() != null) {
					msgKey.setKeyValue("w_AlInstalledFlg", key.getw_AlInstalledFlg());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_NAME") && key.getNECK_PROC_NAME() != null) {
					msgKey.setKeyValue("NECK_PROC_NAME", key.getNECK_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_CD") && key.getNECK_PROC_CD() != null) {
					msgKey.setKeyValue("NECK_PROC_CD", key.getNECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY1") && key.getLOAD_QTY1() != null) {
					msgKey.setKeyValue("LOAD_QTY1", key.getLOAD_QTY1());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY2") && key.getLOAD_QTY2() != null) {
					msgKey.setKeyValue("LOAD_QTY2", key.getLOAD_QTY2());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY3") && key.getLOAD_QTY3() != null) {
					msgKey.setKeyValue("LOAD_QTY3", key.getLOAD_QTY3());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY4") && key.getLOAD_QTY4() != null) {
					msgKey.setKeyValue("LOAD_QTY4", key.getLOAD_QTY4());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY5") && key.getLOAD_QTY5() != null) {
					msgKey.setKeyValue("LOAD_QTY5", key.getLOAD_QTY5());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY6") && key.getLOAD_QTY6() != null) {
					msgKey.setKeyValue("LOAD_QTY6", key.getLOAD_QTY6());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY7") && key.getLOAD_QTY7() != null) {
					msgKey.setKeyValue("LOAD_QTY7", key.getLOAD_QTY7());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY8") && key.getLOAD_QTY8() != null) {
					msgKey.setKeyValue("LOAD_QTY8", key.getLOAD_QTY8());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY9") && key.getLOAD_QTY9() != null) {
					msgKey.setKeyValue("LOAD_QTY9", key.getLOAD_QTY9());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY10") && key.getLOAD_QTY10() != null) {
					msgKey.setKeyValue("LOAD_QTY10", key.getLOAD_QTY10());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY11") && key.getLOAD_QTY11() != null) {
					msgKey.setKeyValue("LOAD_QTY11", key.getLOAD_QTY11());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY12") && key.getLOAD_QTY12() != null) {
					msgKey.setKeyValue("LOAD_QTY12", key.getLOAD_QTY12());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY13") && key.getLOAD_QTY13() != null) {
					msgKey.setKeyValue("LOAD_QTY13", key.getLOAD_QTY13());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY14") && key.getLOAD_QTY14() != null) {
					msgKey.setKeyValue("LOAD_QTY14", key.getLOAD_QTY14());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY15") && key.getLOAD_QTY15() != null) {
					msgKey.setKeyValue("LOAD_QTY15", key.getLOAD_QTY15());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY16") && key.getLOAD_QTY16() != null) {
					msgKey.setKeyValue("LOAD_QTY16", key.getLOAD_QTY16());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY17") && key.getLOAD_QTY17() != null) {
					msgKey.setKeyValue("LOAD_QTY17", key.getLOAD_QTY17());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY18") && key.getLOAD_QTY18() != null) {
					msgKey.setKeyValue("LOAD_QTY18", key.getLOAD_QTY18());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY19") && key.getLOAD_QTY19() != null) {
					msgKey.setKeyValue("LOAD_QTY19", key.getLOAD_QTY19());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY20") && key.getLOAD_QTY20() != null) {
					msgKey.setKeyValue("LOAD_QTY20", key.getLOAD_QTY20());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY21") && key.getLOAD_QTY21() != null) {
					msgKey.setKeyValue("LOAD_QTY21", key.getLOAD_QTY21());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY22") && key.getLOAD_QTY22() != null) {
					msgKey.setKeyValue("LOAD_QTY22", key.getLOAD_QTY22());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY23") && key.getLOAD_QTY23() != null) {
					msgKey.setKeyValue("LOAD_QTY23", key.getLOAD_QTY23());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY24") && key.getLOAD_QTY24() != null) {
					msgKey.setKeyValue("LOAD_QTY24", key.getLOAD_QTY24());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY25") && key.getLOAD_QTY25() != null) {
					msgKey.setKeyValue("LOAD_QTY25", key.getLOAD_QTY25());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY26") && key.getLOAD_QTY26() != null) {
					msgKey.setKeyValue("LOAD_QTY26", key.getLOAD_QTY26());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY27") && key.getLOAD_QTY27() != null) {
					msgKey.setKeyValue("LOAD_QTY27", key.getLOAD_QTY27());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY28") && key.getLOAD_QTY28() != null) {
					msgKey.setKeyValue("LOAD_QTY28", key.getLOAD_QTY28());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY29") && key.getLOAD_QTY29() != null) {
					msgKey.setKeyValue("LOAD_QTY29", key.getLOAD_QTY29());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY30") && key.getLOAD_QTY30() != null) {
					msgKey.setKeyValue("LOAD_QTY30", key.getLOAD_QTY30());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY31") && key.getLOAD_QTY31() != null) {
					msgKey.setKeyValue("LOAD_QTY31", key.getLOAD_QTY31());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY32") && key.getLOAD_QTY32() != null) {
					msgKey.setKeyValue("LOAD_QTY32", key.getLOAD_QTY32());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY33") && key.getLOAD_QTY33() != null) {
					msgKey.setKeyValue("LOAD_QTY33", key.getLOAD_QTY33());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY34") && key.getLOAD_QTY34() != null) {
					msgKey.setKeyValue("LOAD_QTY34", key.getLOAD_QTY34());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY35") && key.getLOAD_QTY35() != null) {
					msgKey.setKeyValue("LOAD_QTY35", key.getLOAD_QTY35());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY36") && key.getLOAD_QTY36() != null) {
					msgKey.setKeyValue("LOAD_QTY36", key.getLOAD_QTY36());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY37") && key.getLOAD_QTY37() != null) {
					msgKey.setKeyValue("LOAD_QTY37", key.getLOAD_QTY37());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY38") && key.getLOAD_QTY38() != null) {
					msgKey.setKeyValue("LOAD_QTY38", key.getLOAD_QTY38());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY39") && key.getLOAD_QTY39() != null) {
					msgKey.setKeyValue("LOAD_QTY39", key.getLOAD_QTY39());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY40") && key.getLOAD_QTY40() != null) {
					msgKey.setKeyValue("LOAD_QTY40", key.getLOAD_QTY40());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY41") && key.getLOAD_QTY41() != null) {
					msgKey.setKeyValue("LOAD_QTY41", key.getLOAD_QTY41());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY42") && key.getLOAD_QTY42() != null) {
					msgKey.setKeyValue("LOAD_QTY42", key.getLOAD_QTY42());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY43") && key.getLOAD_QTY43() != null) {
					msgKey.setKeyValue("LOAD_QTY43", key.getLOAD_QTY43());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY44") && key.getLOAD_QTY44() != null) {
					msgKey.setKeyValue("LOAD_QTY44", key.getLOAD_QTY44());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY45") && key.getLOAD_QTY45() != null) {
					msgKey.setKeyValue("LOAD_QTY45", key.getLOAD_QTY45());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY46") && key.getLOAD_QTY46() != null) {
					msgKey.setKeyValue("LOAD_QTY46", key.getLOAD_QTY46());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY47") && key.getLOAD_QTY47() != null) {
					msgKey.setKeyValue("LOAD_QTY47", key.getLOAD_QTY47());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY48") && key.getLOAD_QTY48() != null) {
					msgKey.setKeyValue("LOAD_QTY48", key.getLOAD_QTY48());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY49") && key.getLOAD_QTY49() != null) {
					msgKey.setKeyValue("LOAD_QTY49", key.getLOAD_QTY49());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY50") && key.getLOAD_QTY50() != null) {
					msgKey.setKeyValue("LOAD_QTY50", key.getLOAD_QTY50());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY51") && key.getLOAD_QTY51() != null) {
					msgKey.setKeyValue("LOAD_QTY51", key.getLOAD_QTY51());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY52") && key.getLOAD_QTY52() != null) {
					msgKey.setKeyValue("LOAD_QTY52", key.getLOAD_QTY52());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY53") && key.getLOAD_QTY53() != null) {
					msgKey.setKeyValue("LOAD_QTY53", key.getLOAD_QTY53());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY54") && key.getLOAD_QTY54() != null) {
					msgKey.setKeyValue("LOAD_QTY54", key.getLOAD_QTY54());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY55") && key.getLOAD_QTY55() != null) {
					msgKey.setKeyValue("LOAD_QTY55", key.getLOAD_QTY55());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY56") && key.getLOAD_QTY56() != null) {
					msgKey.setKeyValue("LOAD_QTY56", key.getLOAD_QTY56());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY57") && key.getLOAD_QTY57() != null) {
					msgKey.setKeyValue("LOAD_QTY57", key.getLOAD_QTY57());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY58") && key.getLOAD_QTY58() != null) {
					msgKey.setKeyValue("LOAD_QTY58", key.getLOAD_QTY58());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY59") && key.getLOAD_QTY59() != null) {
					msgKey.setKeyValue("LOAD_QTY59", key.getLOAD_QTY59());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY60") && key.getLOAD_QTY60() != null) {
					msgKey.setKeyValue("LOAD_QTY60", key.getLOAD_QTY60());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY61") && key.getLOAD_QTY61() != null) {
					msgKey.setKeyValue("LOAD_QTY61", key.getLOAD_QTY61());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY62") && key.getLOAD_QTY62() != null) {
					msgKey.setKeyValue("LOAD_QTY62", key.getLOAD_QTY62());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY63") && key.getLOAD_QTY63() != null) {
					msgKey.setKeyValue("LOAD_QTY63", key.getLOAD_QTY63());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY64") && key.getLOAD_QTY64() != null) {
					msgKey.setKeyValue("LOAD_QTY64", key.getLOAD_QTY64());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY65") && key.getLOAD_QTY65() != null) {
					msgKey.setKeyValue("LOAD_QTY65", key.getLOAD_QTY65());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY66") && key.getLOAD_QTY66() != null) {
					msgKey.setKeyValue("LOAD_QTY66", key.getLOAD_QTY66());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY67") && key.getLOAD_QTY67() != null) {
					msgKey.setKeyValue("LOAD_QTY67", key.getLOAD_QTY67());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY68") && key.getLOAD_QTY68() != null) {
					msgKey.setKeyValue("LOAD_QTY68", key.getLOAD_QTY68());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY69") && key.getLOAD_QTY69() != null) {
					msgKey.setKeyValue("LOAD_QTY69", key.getLOAD_QTY69());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY70") && key.getLOAD_QTY70() != null) {
					msgKey.setKeyValue("LOAD_QTY70", key.getLOAD_QTY70());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY71") && key.getLOAD_QTY71() != null) {
					msgKey.setKeyValue("LOAD_QTY71", key.getLOAD_QTY71());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY72") && key.getLOAD_QTY72() != null) {
					msgKey.setKeyValue("LOAD_QTY72", key.getLOAD_QTY72());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY73") && key.getLOAD_QTY73() != null) {
					msgKey.setKeyValue("LOAD_QTY73", key.getLOAD_QTY73());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY74") && key.getLOAD_QTY74() != null) {
					msgKey.setKeyValue("LOAD_QTY74", key.getLOAD_QTY74());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY75") && key.getLOAD_QTY75() != null) {
					msgKey.setKeyValue("LOAD_QTY75", key.getLOAD_QTY75());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY76") && key.getLOAD_QTY76() != null) {
					msgKey.setKeyValue("LOAD_QTY76", key.getLOAD_QTY76());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY77") && key.getLOAD_QTY77() != null) {
					msgKey.setKeyValue("LOAD_QTY77", key.getLOAD_QTY77());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY78") && key.getLOAD_QTY78() != null) {
					msgKey.setKeyValue("LOAD_QTY78", key.getLOAD_QTY78());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY79") && key.getLOAD_QTY79() != null) {
					msgKey.setKeyValue("LOAD_QTY79", key.getLOAD_QTY79());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY80") && key.getLOAD_QTY80() != null) {
					msgKey.setKeyValue("LOAD_QTY80", key.getLOAD_QTY80());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY81") && key.getLOAD_QTY81() != null) {
					msgKey.setKeyValue("LOAD_QTY81", key.getLOAD_QTY81());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY82") && key.getLOAD_QTY82() != null) {
					msgKey.setKeyValue("LOAD_QTY82", key.getLOAD_QTY82());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY83") && key.getLOAD_QTY83() != null) {
					msgKey.setKeyValue("LOAD_QTY83", key.getLOAD_QTY83());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY84") && key.getLOAD_QTY84() != null) {
					msgKey.setKeyValue("LOAD_QTY84", key.getLOAD_QTY84());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY85") && key.getLOAD_QTY85() != null) {
					msgKey.setKeyValue("LOAD_QTY85", key.getLOAD_QTY85());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY86") && key.getLOAD_QTY86() != null) {
					msgKey.setKeyValue("LOAD_QTY86", key.getLOAD_QTY86());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY87") && key.getLOAD_QTY87() != null) {
					msgKey.setKeyValue("LOAD_QTY87", key.getLOAD_QTY87());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY88") && key.getLOAD_QTY88() != null) {
					msgKey.setKeyValue("LOAD_QTY88", key.getLOAD_QTY88());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY89") && key.getLOAD_QTY89() != null) {
					msgKey.setKeyValue("LOAD_QTY89", key.getLOAD_QTY89());
				}
				if(msgKeyType.containsKeyColumn("LOAD_QTY90") && key.getLOAD_QTY90() != null) {
					msgKey.setKeyValue("LOAD_QTY90", key.getLOAD_QTY90());
				}
				if(msgKeyType.containsKeyColumn("DateFrom") && key.getDateFrom() != null) {
					msgKey.setKeyValue("DateFrom", key.getDateFrom());
				}
				if(msgKeyType.containsKeyColumn("DateTo") && key.getDateTo() != null) {
					msgKey.setKeyValue("DateTo", key.getDateTo());
				}
				if(msgKeyType.containsKeyColumn("K_PLANT_CD") && key.getK_PLANT_CD() != null) {
					msgKey.setKeyValue("K_PLANT_CD", key.getK_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("CAL_DATE") && key.getCAL_DATE() != null) {
					msgKey.setKeyValue("CAL_DATE", key.getCAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("Holiday_Flg") && key.getHoliday_Flg() != null) {
					msgKey.setKeyValue("Holiday_Flg", key.getHoliday_Flg());
				}
				if(msgKeyType.containsKeyColumn("L_NECK_PROC_CD") && key.getL_NECK_PROC_CD() != null) {
					msgKey.setKeyValue("L_NECK_PROC_CD", key.getL_NECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("L_LOAD_DATE") && key.getL_LOAD_DATE() != null) {
					msgKey.setKeyValue("L_LOAD_DATE", key.getL_LOAD_DATE());
				}
				if(msgKeyType.containsKeyColumn("L_LOAD_QTY") && key.getL_LOAD_QTY() != null) {
					msgKey.setKeyValue("L_LOAD_QTY", key.getL_LOAD_QTY());
				}
				if(msgKeyType.containsKeyColumn("L_ODR_STS_TYP") && key.getL_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("L_ODR_STS_TYP", key.getL_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("K_NECK_PROC_CD") && key.getK_NECK_PROC_CD() != null) {
					msgKey.setKeyValue("K_NECK_PROC_CD", key.getK_NECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("K_LOAD_DATE") && key.getK_LOAD_DATE() != null) {
					msgKey.setKeyValue("K_LOAD_DATE", key.getK_LOAD_DATE());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_DIM") && key.getL_CHT_DIM() != null) {
					msgKey.setKeyValue("L_CHT_DIM", key.getL_CHT_DIM().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_TYPE") && key.getL_CHT_TYPE() != null) {
					msgKey.setKeyValue("L_CHT_TYPE", key.getL_CHT_TYPE().toString());
				}
				if(msgKeyType.containsKeyColumn("L_BG_C_R") && key.getL_BG_C_R() != null) {
					msgKey.setKeyValue("L_BG_C_R", key.getL_BG_C_R().toString());
				}
				if(msgKeyType.containsKeyColumn("L_BG_C_G") && key.getL_BG_C_G() != null) {
					msgKey.setKeyValue("L_BG_C_G", key.getL_BG_C_G().toString());
				}
				if(msgKeyType.containsKeyColumn("L_BG_C_B") && key.getL_BG_C_B() != null) {
					msgKey.setKeyValue("L_BG_C_B", key.getL_BG_C_B().toString());
				}
				if(msgKeyType.containsKeyColumn("L_MAX_SCALE") && key.getL_MAX_SCALE() != null) {
					msgKey.setKeyValue("L_MAX_SCALE", key.getL_MAX_SCALE().toString());
				}
				if(msgKeyType.containsKeyColumn("L_SCALE_STEP") && key.getL_SCALE_STEP() != null) {
					msgKey.setKeyValue("L_SCALE_STEP", key.getL_SCALE_STEP().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C0_R") && key.getL_CHT_C0_R() != null) {
					msgKey.setKeyValue("L_CHT_C0_R", key.getL_CHT_C0_R().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C0_G") && key.getL_CHT_C0_G() != null) {
					msgKey.setKeyValue("L_CHT_C0_G", key.getL_CHT_C0_G().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C0_B") && key.getL_CHT_C0_B() != null) {
					msgKey.setKeyValue("L_CHT_C0_B", key.getL_CHT_C0_B().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C1_R") && key.getL_CHT_C1_R() != null) {
					msgKey.setKeyValue("L_CHT_C1_R", key.getL_CHT_C1_R().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C1_G") && key.getL_CHT_C1_G() != null) {
					msgKey.setKeyValue("L_CHT_C1_G", key.getL_CHT_C1_G().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C1_B") && key.getL_CHT_C1_B() != null) {
					msgKey.setKeyValue("L_CHT_C1_B", key.getL_CHT_C1_B().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C2_R") && key.getL_CHT_C2_R() != null) {
					msgKey.setKeyValue("L_CHT_C2_R", key.getL_CHT_C2_R().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C2_G") && key.getL_CHT_C2_G() != null) {
					msgKey.setKeyValue("L_CHT_C2_G", key.getL_CHT_C2_G().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C2_B") && key.getL_CHT_C2_B() != null) {
					msgKey.setKeyValue("L_CHT_C2_B", key.getL_CHT_C2_B().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C9_R") && key.getL_CHT_C9_R() != null) {
					msgKey.setKeyValue("L_CHT_C9_R", key.getL_CHT_C9_R().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C9_G") && key.getL_CHT_C9_G() != null) {
					msgKey.setKeyValue("L_CHT_C9_G", key.getL_CHT_C9_G().toString());
				}
				if(msgKeyType.containsKeyColumn("L_CHT_C9_B") && key.getL_CHT_C9_B() != null) {
					msgKey.setKeyValue("L_CHT_C9_B", key.getL_CHT_C9_B().toString());
				}
				if(msgKeyType.containsKeyColumn("L_HIGH_LOAD") && key.getL_HIGH_LOAD() != null) {
					msgKey.setKeyValue("L_HIGH_LOAD", key.getL_HIGH_LOAD().toString());
				}
				if(msgKeyType.containsKeyColumn("L_H_LOAD_C_R") && key.getL_H_LOAD_C_R() != null) {
					msgKey.setKeyValue("L_H_LOAD_C_R", key.getL_H_LOAD_C_R().toString());
				}
				if(msgKeyType.containsKeyColumn("L_H_LOAD_C_G") && key.getL_H_LOAD_C_G() != null) {
					msgKey.setKeyValue("L_H_LOAD_C_G", key.getL_H_LOAD_C_G().toString());
				}
				if(msgKeyType.containsKeyColumn("L_H_LOAD_C_B") && key.getL_H_LOAD_C_B() != null) {
					msgKey.setKeyValue("L_H_LOAD_C_B", key.getL_H_LOAD_C_B().toString());
				}
				if(msgKeyType.containsKeyColumn("L_MIDD_LOAD") && key.getL_MIDD_LOAD() != null) {
					msgKey.setKeyValue("L_MIDD_LOAD", key.getL_MIDD_LOAD().toString());
				}
				if(msgKeyType.containsKeyColumn("L_M_LOAD_C_R") && key.getL_M_LOAD_C_R() != null) {
					msgKey.setKeyValue("L_M_LOAD_C_R", key.getL_M_LOAD_C_R().toString());
				}
				if(msgKeyType.containsKeyColumn("L_M_LOAD_C_G") && key.getL_M_LOAD_C_G() != null) {
					msgKey.setKeyValue("L_M_LOAD_C_G", key.getL_M_LOAD_C_G().toString());
				}
				if(msgKeyType.containsKeyColumn("L_M_LOAD_C_B") && key.getL_M_LOAD_C_B() != null) {
					msgKey.setKeyValue("L_M_LOAD_C_B", key.getL_M_LOAD_C_B().toString());
				}
				if(msgKeyType.containsKeyColumn("L_LOW_LOAD") && key.getL_LOW_LOAD() != null) {
					msgKey.setKeyValue("L_LOW_LOAD", key.getL_LOW_LOAD().toString());
				}
				if(msgKeyType.containsKeyColumn("L_L_LOAD_C_R") && key.getL_L_LOAD_C_R() != null) {
					msgKey.setKeyValue("L_L_LOAD_C_R", key.getL_L_LOAD_C_R().toString());
				}
				if(msgKeyType.containsKeyColumn("L_L_LOAD_C_G") && key.getL_L_LOAD_C_G() != null) {
					msgKey.setKeyValue("L_L_LOAD_C_G", key.getL_L_LOAD_C_G().toString());
				}
				if(msgKeyType.containsKeyColumn("L_L_LOAD_C_B") && key.getL_L_LOAD_C_B() != null) {
					msgKey.setKeyValue("L_L_LOAD_C_B", key.getL_L_LOAD_C_B().toString());
				}
				if(msgKeyType.containsKeyColumn("LKM_ITEM_CD") && key.getLKM_ITEM_CD() != null) {
					msgKey.setKeyValue("LKM_ITEM_CD", key.getLKM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("LKM_ITEM_NAME") && key.getLKM_ITEM_NAME() != null) {
					msgKey.setKeyValue("LKM_ITEM_NAME", key.getLKM_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("LKM_JOB_ODR_CD") && key.getLKM_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("LKM_JOB_ODR_CD", key.getLKM_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("LKM_ODR_STS_TYP") && key.getLKM_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("LKM_ODR_STS_TYP", key.getLKM_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("LKM_PRD_START_DATE") && key.getLKM_PRD_START_DATE() != null) {
					msgKey.setKeyValue("LKM_PRD_START_DATE", key.getLKM_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("LKM_PRD_DUE_DATE") && key.getLKM_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("LKM_PRD_DUE_DATE", key.getLKM_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("LKM_ODR_QTY") && key.getLKM_ODR_QTY() != null) {
					msgKey.setKeyValue("LKM_ODR_QTY", key.getLKM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("LKM_TOTAL_RCV_QTY") && key.getLKM_TOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("LKM_TOTAL_RCV_QTY", key.getLKM_TOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("LKM_UNIT_LOAD") && key.getLKM_UNIT_LOAD() != null) {
					msgKey.setKeyValue("LKM_UNIT_LOAD", key.getLKM_UNIT_LOAD());
				}
				if(msgKeyType.containsKeyColumn("LKM_LOAD_QTY") && key.getLKM_LOAD_QTY() != null) {
					msgKey.setKeyValue("LKM_LOAD_QTY", key.getLKM_LOAD_QTY());
				}
				if(msgKeyType.containsKeyColumn("KM_LOAD_DATE") && key.getKM_LOAD_DATE() != null) {
					msgKey.setKeyValue("KM_LOAD_DATE", key.getKM_LOAD_DATE());
				}
				if(msgKeyType.containsKeyColumn("LKM_SUM_LOAD_QTY") && key.getLKM_SUM_LOAD_QTY() != null) {
					msgKey.setKeyValue("LKM_SUM_LOAD_QTY", key.getLKM_SUM_LOAD_QTY());
				}
				if(msgKeyType.containsKeyColumn("LKM_OVR_LOAD_QTY") && key.getLKM_OVR_LOAD_QTY() != null) {
					msgKey.setKeyValue("LKM_OVR_LOAD_QTY", key.getLKM_OVR_LOAD_QTY());
				}
				if(msgKeyType.containsKeyColumn("LKM_NECK_PROC_CD") && key.getLKM_NECK_PROC_CD() != null) {
					msgKey.setKeyValue("LKM_NECK_PROC_CD", key.getLKM_NECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("LKM_LOAD_DATE") && key.getLKM_LOAD_DATE() != null) {
					msgKey.setKeyValue("LKM_LOAD_DATE", key.getLKM_LOAD_DATE());
				}
				if(msgKeyType.containsKeyColumn("LKM_NECK_PROC_NAME") && key.getLKM_NECK_PROC_NAME() != null) {
					msgKey.setKeyValue("LKM_NECK_PROC_NAME", key.getLKM_NECK_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("LKM_NECK_PROC_CAPA") && key.getLKM_NECK_PROC_CAPA() != null) {
					msgKey.setKeyValue("LKM_NECK_PROC_CAPA", key.getLKM_NECK_PROC_CAPA());
				}
				if(msgKeyType.containsKeyColumn("LKM_NECK_PROC_CAPA_UNIT") && key.getLKM_NECK_PROC_CAPA_UNIT() != null) {
					msgKey.setKeyValue("LKM_NECK_PROC_CAPA_UNIT", key.getLKM_NECK_PROC_CAPA_UNIT());
				}
				if(msgKeyType.containsKeyColumn("FLG1") && key.getFLG1() != null) {
					msgKey.setKeyValue("FLG1", key.getFLG1());
				}
				if(msgKeyType.containsKeyColumn("FLG2") && key.getFLG2() != null) {
					msgKey.setKeyValue("FLG2", key.getFLG2());
				}
				if(msgKeyType.containsKeyColumn("FLG3") && key.getFLG3() != null) {
					msgKey.setKeyValue("FLG3", key.getFLG3());
				}
				if(msgKeyType.containsKeyColumn("FLG4") && key.getFLG4() != null) {
					msgKey.setKeyValue("FLG4", key.getFLG4());
				}
				if(msgKeyType.containsKeyColumn("FLG5") && key.getFLG5() != null) {
					msgKey.setKeyValue("FLG5", key.getFLG5());
				}
				if(msgKeyType.containsKeyColumn("FLG6") && key.getFLG6() != null) {
					msgKey.setKeyValue("FLG6", key.getFLG6());
				}
				if(msgKeyType.containsKeyColumn("FLG7") && key.getFLG7() != null) {
					msgKey.setKeyValue("FLG7", key.getFLG7());
				}
				if(msgKeyType.containsKeyColumn("FLG8") && key.getFLG8() != null) {
					msgKey.setKeyValue("FLG8", key.getFLG8());
				}
				if(msgKeyType.containsKeyColumn("FLG9") && key.getFLG9() != null) {
					msgKey.setKeyValue("FLG9", key.getFLG9());
				}
				if(msgKeyType.containsKeyColumn("FLG10") && key.getFLG10() != null) {
					msgKey.setKeyValue("FLG10", key.getFLG10());
				}
				if(msgKeyType.containsKeyColumn("FLG11") && key.getFLG11() != null) {
					msgKey.setKeyValue("FLG11", key.getFLG11());
				}
				if(msgKeyType.containsKeyColumn("FLG12") && key.getFLG12() != null) {
					msgKey.setKeyValue("FLG12", key.getFLG12());
				}
				if(msgKeyType.containsKeyColumn("FLG13") && key.getFLG13() != null) {
					msgKey.setKeyValue("FLG13", key.getFLG13());
				}
				if(msgKeyType.containsKeyColumn("FLG14") && key.getFLG14() != null) {
					msgKey.setKeyValue("FLG14", key.getFLG14());
				}
				if(msgKeyType.containsKeyColumn("FLG15") && key.getFLG15() != null) {
					msgKey.setKeyValue("FLG15", key.getFLG15());
				}
				if(msgKeyType.containsKeyColumn("FLG16") && key.getFLG16() != null) {
					msgKey.setKeyValue("FLG16", key.getFLG16());
				}
				if(msgKeyType.containsKeyColumn("FLG17") && key.getFLG17() != null) {
					msgKey.setKeyValue("FLG17", key.getFLG17());
				}
				if(msgKeyType.containsKeyColumn("FLG18") && key.getFLG18() != null) {
					msgKey.setKeyValue("FLG18", key.getFLG18());
				}
				if(msgKeyType.containsKeyColumn("FLG19") && key.getFLG19() != null) {
					msgKey.setKeyValue("FLG19", key.getFLG19());
				}
				if(msgKeyType.containsKeyColumn("FLG20") && key.getFLG20() != null) {
					msgKey.setKeyValue("FLG20", key.getFLG20());
				}
				if(msgKeyType.containsKeyColumn("FLG21") && key.getFLG21() != null) {
					msgKey.setKeyValue("FLG21", key.getFLG21());
				}
				if(msgKeyType.containsKeyColumn("FLG22") && key.getFLG22() != null) {
					msgKey.setKeyValue("FLG22", key.getFLG22());
				}
				if(msgKeyType.containsKeyColumn("FLG23") && key.getFLG23() != null) {
					msgKey.setKeyValue("FLG23", key.getFLG23());
				}
				if(msgKeyType.containsKeyColumn("FLG24") && key.getFLG24() != null) {
					msgKey.setKeyValue("FLG24", key.getFLG24());
				}
				if(msgKeyType.containsKeyColumn("FLG25") && key.getFLG25() != null) {
					msgKey.setKeyValue("FLG25", key.getFLG25());
				}
				if(msgKeyType.containsKeyColumn("FLG26") && key.getFLG26() != null) {
					msgKey.setKeyValue("FLG26", key.getFLG26());
				}
				if(msgKeyType.containsKeyColumn("FLG27") && key.getFLG27() != null) {
					msgKey.setKeyValue("FLG27", key.getFLG27());
				}
				if(msgKeyType.containsKeyColumn("FLG28") && key.getFLG28() != null) {
					msgKey.setKeyValue("FLG28", key.getFLG28());
				}
				if(msgKeyType.containsKeyColumn("FLG29") && key.getFLG29() != null) {
					msgKey.setKeyValue("FLG29", key.getFLG29());
				}
				if(msgKeyType.containsKeyColumn("FLG30") && key.getFLG30() != null) {
					msgKey.setKeyValue("FLG30", key.getFLG30());
				}
				if(msgKeyType.containsKeyColumn("FLG31") && key.getFLG31() != null) {
					msgKey.setKeyValue("FLG31", key.getFLG31());
				}
				if(msgKeyType.containsKeyColumn("FLG32") && key.getFLG32() != null) {
					msgKey.setKeyValue("FLG32", key.getFLG32());
				}
				if(msgKeyType.containsKeyColumn("FLG33") && key.getFLG33() != null) {
					msgKey.setKeyValue("FLG33", key.getFLG33());
				}
				if(msgKeyType.containsKeyColumn("FLG34") && key.getFLG34() != null) {
					msgKey.setKeyValue("FLG34", key.getFLG34());
				}
				if(msgKeyType.containsKeyColumn("FLG35") && key.getFLG35() != null) {
					msgKey.setKeyValue("FLG35", key.getFLG35());
				}
				if(msgKeyType.containsKeyColumn("FLG36") && key.getFLG36() != null) {
					msgKey.setKeyValue("FLG36", key.getFLG36());
				}
				if(msgKeyType.containsKeyColumn("FLG37") && key.getFLG37() != null) {
					msgKey.setKeyValue("FLG37", key.getFLG37());
				}
				if(msgKeyType.containsKeyColumn("FLG38") && key.getFLG38() != null) {
					msgKey.setKeyValue("FLG38", key.getFLG38());
				}
				if(msgKeyType.containsKeyColumn("FLG39") && key.getFLG39() != null) {
					msgKey.setKeyValue("FLG39", key.getFLG39());
				}
				if(msgKeyType.containsKeyColumn("FLG40") && key.getFLG40() != null) {
					msgKey.setKeyValue("FLG40", key.getFLG40());
				}
				if(msgKeyType.containsKeyColumn("FLG41") && key.getFLG41() != null) {
					msgKey.setKeyValue("FLG41", key.getFLG41());
				}
				if(msgKeyType.containsKeyColumn("FLG42") && key.getFLG42() != null) {
					msgKey.setKeyValue("FLG42", key.getFLG42());
				}
				if(msgKeyType.containsKeyColumn("FLG43") && key.getFLG43() != null) {
					msgKey.setKeyValue("FLG43", key.getFLG43());
				}
				if(msgKeyType.containsKeyColumn("FLG44") && key.getFLG44() != null) {
					msgKey.setKeyValue("FLG44", key.getFLG44());
				}
				if(msgKeyType.containsKeyColumn("FLG45") && key.getFLG45() != null) {
					msgKey.setKeyValue("FLG45", key.getFLG45());
				}
				if(msgKeyType.containsKeyColumn("FLG46") && key.getFLG46() != null) {
					msgKey.setKeyValue("FLG46", key.getFLG46());
				}
				if(msgKeyType.containsKeyColumn("FLG47") && key.getFLG47() != null) {
					msgKey.setKeyValue("FLG47", key.getFLG47());
				}
				if(msgKeyType.containsKeyColumn("FLG48") && key.getFLG48() != null) {
					msgKey.setKeyValue("FLG48", key.getFLG48());
				}
				if(msgKeyType.containsKeyColumn("FLG49") && key.getFLG49() != null) {
					msgKey.setKeyValue("FLG49", key.getFLG49());
				}
				if(msgKeyType.containsKeyColumn("FLG50") && key.getFLG50() != null) {
					msgKey.setKeyValue("FLG50", key.getFLG50());
				}
				if(msgKeyType.containsKeyColumn("FLG51") && key.getFLG51() != null) {
					msgKey.setKeyValue("FLG51", key.getFLG51());
				}
				if(msgKeyType.containsKeyColumn("FLG52") && key.getFLG52() != null) {
					msgKey.setKeyValue("FLG52", key.getFLG52());
				}
				if(msgKeyType.containsKeyColumn("FLG53") && key.getFLG53() != null) {
					msgKey.setKeyValue("FLG53", key.getFLG53());
				}
				if(msgKeyType.containsKeyColumn("FLG54") && key.getFLG54() != null) {
					msgKey.setKeyValue("FLG54", key.getFLG54());
				}
				if(msgKeyType.containsKeyColumn("FLG55") && key.getFLG55() != null) {
					msgKey.setKeyValue("FLG55", key.getFLG55());
				}
				if(msgKeyType.containsKeyColumn("FLG56") && key.getFLG56() != null) {
					msgKey.setKeyValue("FLG56", key.getFLG56());
				}
				if(msgKeyType.containsKeyColumn("FLG57") && key.getFLG57() != null) {
					msgKey.setKeyValue("FLG57", key.getFLG57());
				}
				if(msgKeyType.containsKeyColumn("FLG58") && key.getFLG58() != null) {
					msgKey.setKeyValue("FLG58", key.getFLG58());
				}
				if(msgKeyType.containsKeyColumn("FLG59") && key.getFLG59() != null) {
					msgKey.setKeyValue("FLG59", key.getFLG59());
				}
				if(msgKeyType.containsKeyColumn("FLG60") && key.getFLG60() != null) {
					msgKey.setKeyValue("FLG60", key.getFLG60());
				}
				if(msgKeyType.containsKeyColumn("FLG61") && key.getFLG61() != null) {
					msgKey.setKeyValue("FLG61", key.getFLG61());
				}
				if(msgKeyType.containsKeyColumn("FLG62") && key.getFLG62() != null) {
					msgKey.setKeyValue("FLG62", key.getFLG62());
				}
				if(msgKeyType.containsKeyColumn("FLG63") && key.getFLG63() != null) {
					msgKey.setKeyValue("FLG63", key.getFLG63());
				}
				if(msgKeyType.containsKeyColumn("FLG64") && key.getFLG64() != null) {
					msgKey.setKeyValue("FLG64", key.getFLG64());
				}
				if(msgKeyType.containsKeyColumn("FLG65") && key.getFLG65() != null) {
					msgKey.setKeyValue("FLG65", key.getFLG65());
				}
				if(msgKeyType.containsKeyColumn("FLG66") && key.getFLG66() != null) {
					msgKey.setKeyValue("FLG66", key.getFLG66());
				}
				if(msgKeyType.containsKeyColumn("FLG67") && key.getFLG67() != null) {
					msgKey.setKeyValue("FLG67", key.getFLG67());
				}
				if(msgKeyType.containsKeyColumn("FLG68") && key.getFLG68() != null) {
					msgKey.setKeyValue("FLG68", key.getFLG68());
				}
				if(msgKeyType.containsKeyColumn("FLG69") && key.getFLG69() != null) {
					msgKey.setKeyValue("FLG69", key.getFLG69());
				}
				if(msgKeyType.containsKeyColumn("FLG70") && key.getFLG70() != null) {
					msgKey.setKeyValue("FLG70", key.getFLG70());
				}
				if(msgKeyType.containsKeyColumn("FLG71") && key.getFLG71() != null) {
					msgKey.setKeyValue("FLG71", key.getFLG71());
				}
				if(msgKeyType.containsKeyColumn("FLG72") && key.getFLG72() != null) {
					msgKey.setKeyValue("FLG72", key.getFLG72());
				}
				if(msgKeyType.containsKeyColumn("FLG73") && key.getFLG73() != null) {
					msgKey.setKeyValue("FLG73", key.getFLG73());
				}
				if(msgKeyType.containsKeyColumn("FLG74") && key.getFLG74() != null) {
					msgKey.setKeyValue("FLG74", key.getFLG74());
				}
				if(msgKeyType.containsKeyColumn("FLG75") && key.getFLG75() != null) {
					msgKey.setKeyValue("FLG75", key.getFLG75());
				}
				if(msgKeyType.containsKeyColumn("FLG76") && key.getFLG76() != null) {
					msgKey.setKeyValue("FLG76", key.getFLG76());
				}
				if(msgKeyType.containsKeyColumn("FLG77") && key.getFLG77() != null) {
					msgKey.setKeyValue("FLG77", key.getFLG77());
				}
				if(msgKeyType.containsKeyColumn("FLG78") && key.getFLG78() != null) {
					msgKey.setKeyValue("FLG78", key.getFLG78());
				}
				if(msgKeyType.containsKeyColumn("FLG79") && key.getFLG79() != null) {
					msgKey.setKeyValue("FLG79", key.getFLG79());
				}
				if(msgKeyType.containsKeyColumn("FLG80") && key.getFLG80() != null) {
					msgKey.setKeyValue("FLG80", key.getFLG80());
				}
				if(msgKeyType.containsKeyColumn("FLG81") && key.getFLG81() != null) {
					msgKey.setKeyValue("FLG81", key.getFLG81());
				}
				if(msgKeyType.containsKeyColumn("FLG82") && key.getFLG82() != null) {
					msgKey.setKeyValue("FLG82", key.getFLG82());
				}
				if(msgKeyType.containsKeyColumn("FLG83") && key.getFLG83() != null) {
					msgKey.setKeyValue("FLG83", key.getFLG83());
				}
				if(msgKeyType.containsKeyColumn("FLG84") && key.getFLG84() != null) {
					msgKey.setKeyValue("FLG84", key.getFLG84());
				}
				if(msgKeyType.containsKeyColumn("FLG85") && key.getFLG85() != null) {
					msgKey.setKeyValue("FLG85", key.getFLG85());
				}
				if(msgKeyType.containsKeyColumn("FLG86") && key.getFLG86() != null) {
					msgKey.setKeyValue("FLG86", key.getFLG86());
				}
				if(msgKeyType.containsKeyColumn("FLG87") && key.getFLG87() != null) {
					msgKey.setKeyValue("FLG87", key.getFLG87());
				}
				if(msgKeyType.containsKeyColumn("FLG88") && key.getFLG88() != null) {
					msgKey.setKeyValue("FLG88", key.getFLG88());
				}
				if(msgKeyType.containsKeyColumn("FLG89") && key.getFLG89() != null) {
					msgKey.setKeyValue("FLG89", key.getFLG89());
				}
				if(msgKeyType.containsKeyColumn("FLG90") && key.getFLG90() != null) {
					msgKey.setKeyValue("FLG90", key.getFLG90());
				}
				if(msgKeyType.containsKeyColumn("L_NECK_PROC_NAME") && key.getL_NECK_PROC_NAME() != null) {
					msgKey.setKeyValue("L_NECK_PROC_NAME", key.getL_NECK_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("L_NECK_PROC_CAPA") && key.getL_NECK_PROC_CAPA() != null) {
					msgKey.setKeyValue("L_NECK_PROC_CAPA", key.getL_NECK_PROC_CAPA());
				}
				if(msgKeyType.containsKeyColumn("L_NECK_PROC_CAPA_UNIT") && key.getL_NECK_PROC_CAPA_UNIT() != null) {
					msgKey.setKeyValue("L_NECK_PROC_CAPA_UNIT", key.getL_NECK_PROC_CAPA_UNIT());
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
					AL0040010Struct key = new AL0040010Struct();
					if(msgKeyType.containsKeyColumn("Shift_Date")) {
						key.setShift_Date(msgKey.getKeyValue("Shift_Date"));
					}
					if(msgKeyType.containsKeyColumn("hidden_High_Color")) {
						key.sethidden_High_Color(msgKey.getKeyValue("hidden_High_Color"));
					}
					if(msgKeyType.containsKeyColumn("hidden_Midd_Color")) {
						key.sethidden_Midd_Color(msgKey.getKeyValue("hidden_Midd_Color"));
					}
					if(msgKeyType.containsKeyColumn("hidden_Low_Color")) {
						key.sethidden_Low_Color(msgKey.getKeyValue("hidden_Low_Color"));
					}
					if(msgKeyType.containsKeyColumn("hidden_DateFrom")) {
						key.sethidden_DateFrom(msgKey.getKeyValue("hidden_DateFrom"));
					}
					if(msgKeyType.containsKeyColumn("hidden_DateTo")) {
						key.sethidden_DateTo(msgKey.getKeyValue("hidden_DateTo"));
					}
					if(msgKeyType.containsKeyColumn("S_LOAD_DATE")) {
						key.setS_LOAD_DATE(msgKey.getKeyValue("S_LOAD_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_AlInstalledFlg")) {
						key.setw_AlInstalledFlg(msgKey.getKeyValue("w_AlInstalledFlg"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_NAME")) {
						key.setNECK_PROC_NAME(msgKey.getKeyValue("NECK_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_CD")) {
						key.setNECK_PROC_CD(msgKey.getKeyValue("NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY1")) {
						key.setLOAD_QTY1(msgKey.getKeyValue("LOAD_QTY1"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY2")) {
						key.setLOAD_QTY2(msgKey.getKeyValue("LOAD_QTY2"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY3")) {
						key.setLOAD_QTY3(msgKey.getKeyValue("LOAD_QTY3"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY4")) {
						key.setLOAD_QTY4(msgKey.getKeyValue("LOAD_QTY4"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY5")) {
						key.setLOAD_QTY5(msgKey.getKeyValue("LOAD_QTY5"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY6")) {
						key.setLOAD_QTY6(msgKey.getKeyValue("LOAD_QTY6"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY7")) {
						key.setLOAD_QTY7(msgKey.getKeyValue("LOAD_QTY7"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY8")) {
						key.setLOAD_QTY8(msgKey.getKeyValue("LOAD_QTY8"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY9")) {
						key.setLOAD_QTY9(msgKey.getKeyValue("LOAD_QTY9"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY10")) {
						key.setLOAD_QTY10(msgKey.getKeyValue("LOAD_QTY10"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY11")) {
						key.setLOAD_QTY11(msgKey.getKeyValue("LOAD_QTY11"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY12")) {
						key.setLOAD_QTY12(msgKey.getKeyValue("LOAD_QTY12"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY13")) {
						key.setLOAD_QTY13(msgKey.getKeyValue("LOAD_QTY13"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY14")) {
						key.setLOAD_QTY14(msgKey.getKeyValue("LOAD_QTY14"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY15")) {
						key.setLOAD_QTY15(msgKey.getKeyValue("LOAD_QTY15"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY16")) {
						key.setLOAD_QTY16(msgKey.getKeyValue("LOAD_QTY16"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY17")) {
						key.setLOAD_QTY17(msgKey.getKeyValue("LOAD_QTY17"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY18")) {
						key.setLOAD_QTY18(msgKey.getKeyValue("LOAD_QTY18"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY19")) {
						key.setLOAD_QTY19(msgKey.getKeyValue("LOAD_QTY19"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY20")) {
						key.setLOAD_QTY20(msgKey.getKeyValue("LOAD_QTY20"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY21")) {
						key.setLOAD_QTY21(msgKey.getKeyValue("LOAD_QTY21"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY22")) {
						key.setLOAD_QTY22(msgKey.getKeyValue("LOAD_QTY22"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY23")) {
						key.setLOAD_QTY23(msgKey.getKeyValue("LOAD_QTY23"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY24")) {
						key.setLOAD_QTY24(msgKey.getKeyValue("LOAD_QTY24"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY25")) {
						key.setLOAD_QTY25(msgKey.getKeyValue("LOAD_QTY25"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY26")) {
						key.setLOAD_QTY26(msgKey.getKeyValue("LOAD_QTY26"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY27")) {
						key.setLOAD_QTY27(msgKey.getKeyValue("LOAD_QTY27"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY28")) {
						key.setLOAD_QTY28(msgKey.getKeyValue("LOAD_QTY28"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY29")) {
						key.setLOAD_QTY29(msgKey.getKeyValue("LOAD_QTY29"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY30")) {
						key.setLOAD_QTY30(msgKey.getKeyValue("LOAD_QTY30"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY31")) {
						key.setLOAD_QTY31(msgKey.getKeyValue("LOAD_QTY31"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY32")) {
						key.setLOAD_QTY32(msgKey.getKeyValue("LOAD_QTY32"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY33")) {
						key.setLOAD_QTY33(msgKey.getKeyValue("LOAD_QTY33"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY34")) {
						key.setLOAD_QTY34(msgKey.getKeyValue("LOAD_QTY34"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY35")) {
						key.setLOAD_QTY35(msgKey.getKeyValue("LOAD_QTY35"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY36")) {
						key.setLOAD_QTY36(msgKey.getKeyValue("LOAD_QTY36"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY37")) {
						key.setLOAD_QTY37(msgKey.getKeyValue("LOAD_QTY37"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY38")) {
						key.setLOAD_QTY38(msgKey.getKeyValue("LOAD_QTY38"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY39")) {
						key.setLOAD_QTY39(msgKey.getKeyValue("LOAD_QTY39"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY40")) {
						key.setLOAD_QTY40(msgKey.getKeyValue("LOAD_QTY40"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY41")) {
						key.setLOAD_QTY41(msgKey.getKeyValue("LOAD_QTY41"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY42")) {
						key.setLOAD_QTY42(msgKey.getKeyValue("LOAD_QTY42"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY43")) {
						key.setLOAD_QTY43(msgKey.getKeyValue("LOAD_QTY43"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY44")) {
						key.setLOAD_QTY44(msgKey.getKeyValue("LOAD_QTY44"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY45")) {
						key.setLOAD_QTY45(msgKey.getKeyValue("LOAD_QTY45"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY46")) {
						key.setLOAD_QTY46(msgKey.getKeyValue("LOAD_QTY46"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY47")) {
						key.setLOAD_QTY47(msgKey.getKeyValue("LOAD_QTY47"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY48")) {
						key.setLOAD_QTY48(msgKey.getKeyValue("LOAD_QTY48"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY49")) {
						key.setLOAD_QTY49(msgKey.getKeyValue("LOAD_QTY49"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY50")) {
						key.setLOAD_QTY50(msgKey.getKeyValue("LOAD_QTY50"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY51")) {
						key.setLOAD_QTY51(msgKey.getKeyValue("LOAD_QTY51"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY52")) {
						key.setLOAD_QTY52(msgKey.getKeyValue("LOAD_QTY52"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY53")) {
						key.setLOAD_QTY53(msgKey.getKeyValue("LOAD_QTY53"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY54")) {
						key.setLOAD_QTY54(msgKey.getKeyValue("LOAD_QTY54"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY55")) {
						key.setLOAD_QTY55(msgKey.getKeyValue("LOAD_QTY55"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY56")) {
						key.setLOAD_QTY56(msgKey.getKeyValue("LOAD_QTY56"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY57")) {
						key.setLOAD_QTY57(msgKey.getKeyValue("LOAD_QTY57"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY58")) {
						key.setLOAD_QTY58(msgKey.getKeyValue("LOAD_QTY58"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY59")) {
						key.setLOAD_QTY59(msgKey.getKeyValue("LOAD_QTY59"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY60")) {
						key.setLOAD_QTY60(msgKey.getKeyValue("LOAD_QTY60"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY61")) {
						key.setLOAD_QTY61(msgKey.getKeyValue("LOAD_QTY61"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY62")) {
						key.setLOAD_QTY62(msgKey.getKeyValue("LOAD_QTY62"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY63")) {
						key.setLOAD_QTY63(msgKey.getKeyValue("LOAD_QTY63"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY64")) {
						key.setLOAD_QTY64(msgKey.getKeyValue("LOAD_QTY64"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY65")) {
						key.setLOAD_QTY65(msgKey.getKeyValue("LOAD_QTY65"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY66")) {
						key.setLOAD_QTY66(msgKey.getKeyValue("LOAD_QTY66"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY67")) {
						key.setLOAD_QTY67(msgKey.getKeyValue("LOAD_QTY67"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY68")) {
						key.setLOAD_QTY68(msgKey.getKeyValue("LOAD_QTY68"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY69")) {
						key.setLOAD_QTY69(msgKey.getKeyValue("LOAD_QTY69"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY70")) {
						key.setLOAD_QTY70(msgKey.getKeyValue("LOAD_QTY70"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY71")) {
						key.setLOAD_QTY71(msgKey.getKeyValue("LOAD_QTY71"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY72")) {
						key.setLOAD_QTY72(msgKey.getKeyValue("LOAD_QTY72"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY73")) {
						key.setLOAD_QTY73(msgKey.getKeyValue("LOAD_QTY73"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY74")) {
						key.setLOAD_QTY74(msgKey.getKeyValue("LOAD_QTY74"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY75")) {
						key.setLOAD_QTY75(msgKey.getKeyValue("LOAD_QTY75"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY76")) {
						key.setLOAD_QTY76(msgKey.getKeyValue("LOAD_QTY76"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY77")) {
						key.setLOAD_QTY77(msgKey.getKeyValue("LOAD_QTY77"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY78")) {
						key.setLOAD_QTY78(msgKey.getKeyValue("LOAD_QTY78"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY79")) {
						key.setLOAD_QTY79(msgKey.getKeyValue("LOAD_QTY79"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY80")) {
						key.setLOAD_QTY80(msgKey.getKeyValue("LOAD_QTY80"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY81")) {
						key.setLOAD_QTY81(msgKey.getKeyValue("LOAD_QTY81"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY82")) {
						key.setLOAD_QTY82(msgKey.getKeyValue("LOAD_QTY82"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY83")) {
						key.setLOAD_QTY83(msgKey.getKeyValue("LOAD_QTY83"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY84")) {
						key.setLOAD_QTY84(msgKey.getKeyValue("LOAD_QTY84"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY85")) {
						key.setLOAD_QTY85(msgKey.getKeyValue("LOAD_QTY85"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY86")) {
						key.setLOAD_QTY86(msgKey.getKeyValue("LOAD_QTY86"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY87")) {
						key.setLOAD_QTY87(msgKey.getKeyValue("LOAD_QTY87"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY88")) {
						key.setLOAD_QTY88(msgKey.getKeyValue("LOAD_QTY88"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY89")) {
						key.setLOAD_QTY89(msgKey.getKeyValue("LOAD_QTY89"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_QTY90")) {
						key.setLOAD_QTY90(msgKey.getKeyValue("LOAD_QTY90"));
					}
					if(msgKeyType.containsKeyColumn("DateFrom")) {
						key.setDateFrom(msgKey.getKeyValue("DateFrom"));
					}
					if(msgKeyType.containsKeyColumn("DateTo")) {
						key.setDateTo(msgKey.getKeyValue("DateTo"));
					}
					if(msgKeyType.containsKeyColumn("K_PLANT_CD")) {
						key.setK_PLANT_CD(msgKey.getKeyValue("K_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CAL_DATE")) {
						key.setCAL_DATE(msgKey.getKeyValue("CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Holiday_Flg")) {
						key.setHoliday_Flg(msgKey.getKeyValue("Holiday_Flg"));
					}
					if(msgKeyType.containsKeyColumn("L_NECK_PROC_CD")) {
						key.setL_NECK_PROC_CD(msgKey.getKeyValue("L_NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("L_LOAD_DATE")) {
						key.setL_LOAD_DATE(msgKey.getKeyValue("L_LOAD_DATE"));
					}
					if(msgKeyType.containsKeyColumn("L_LOAD_QTY")) {
						key.setL_LOAD_QTY(msgKey.getKeyValue("L_LOAD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("L_ODR_STS_TYP")) {
						key.setL_ODR_STS_TYP(msgKey.getKeyValue("L_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("K_NECK_PROC_CD")) {
						key.setK_NECK_PROC_CD(msgKey.getKeyValue("K_NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("K_LOAD_DATE")) {
						key.setK_LOAD_DATE(msgKey.getKeyValue("K_LOAD_DATE"));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_DIM")) {
						key.setL_CHT_DIM(new Integer(msgKey.getKeyValue("L_CHT_DIM")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_TYPE")) {
						key.setL_CHT_TYPE(new Integer(msgKey.getKeyValue("L_CHT_TYPE")));
					}
					if(msgKeyType.containsKeyColumn("L_BG_C_R")) {
						key.setL_BG_C_R(new Integer(msgKey.getKeyValue("L_BG_C_R")));
					}
					if(msgKeyType.containsKeyColumn("L_BG_C_G")) {
						key.setL_BG_C_G(new Integer(msgKey.getKeyValue("L_BG_C_G")));
					}
					if(msgKeyType.containsKeyColumn("L_BG_C_B")) {
						key.setL_BG_C_B(new Integer(msgKey.getKeyValue("L_BG_C_B")));
					}
					if(msgKeyType.containsKeyColumn("L_MAX_SCALE")) {
						key.setL_MAX_SCALE(new Double(msgKey.getKeyValue("L_MAX_SCALE")));
					}
					if(msgKeyType.containsKeyColumn("L_SCALE_STEP")) {
						key.setL_SCALE_STEP(new Double(msgKey.getKeyValue("L_SCALE_STEP")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C0_R")) {
						key.setL_CHT_C0_R(new Integer(msgKey.getKeyValue("L_CHT_C0_R")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C0_G")) {
						key.setL_CHT_C0_G(new Integer(msgKey.getKeyValue("L_CHT_C0_G")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C0_B")) {
						key.setL_CHT_C0_B(new Integer(msgKey.getKeyValue("L_CHT_C0_B")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C1_R")) {
						key.setL_CHT_C1_R(new Integer(msgKey.getKeyValue("L_CHT_C1_R")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C1_G")) {
						key.setL_CHT_C1_G(new Integer(msgKey.getKeyValue("L_CHT_C1_G")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C1_B")) {
						key.setL_CHT_C1_B(new Integer(msgKey.getKeyValue("L_CHT_C1_B")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C2_R")) {
						key.setL_CHT_C2_R(new Integer(msgKey.getKeyValue("L_CHT_C2_R")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C2_G")) {
						key.setL_CHT_C2_G(new Integer(msgKey.getKeyValue("L_CHT_C2_G")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C2_B")) {
						key.setL_CHT_C2_B(new Integer(msgKey.getKeyValue("L_CHT_C2_B")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C9_R")) {
						key.setL_CHT_C9_R(new Integer(msgKey.getKeyValue("L_CHT_C9_R")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C9_G")) {
						key.setL_CHT_C9_G(new Integer(msgKey.getKeyValue("L_CHT_C9_G")));
					}
					if(msgKeyType.containsKeyColumn("L_CHT_C9_B")) {
						key.setL_CHT_C9_B(new Integer(msgKey.getKeyValue("L_CHT_C9_B")));
					}
					if(msgKeyType.containsKeyColumn("L_HIGH_LOAD")) {
						key.setL_HIGH_LOAD(new Integer(msgKey.getKeyValue("L_HIGH_LOAD")));
					}
					if(msgKeyType.containsKeyColumn("L_H_LOAD_C_R")) {
						key.setL_H_LOAD_C_R(new Integer(msgKey.getKeyValue("L_H_LOAD_C_R")));
					}
					if(msgKeyType.containsKeyColumn("L_H_LOAD_C_G")) {
						key.setL_H_LOAD_C_G(new Integer(msgKey.getKeyValue("L_H_LOAD_C_G")));
					}
					if(msgKeyType.containsKeyColumn("L_H_LOAD_C_B")) {
						key.setL_H_LOAD_C_B(new Integer(msgKey.getKeyValue("L_H_LOAD_C_B")));
					}
					if(msgKeyType.containsKeyColumn("L_MIDD_LOAD")) {
						key.setL_MIDD_LOAD(new Integer(msgKey.getKeyValue("L_MIDD_LOAD")));
					}
					if(msgKeyType.containsKeyColumn("L_M_LOAD_C_R")) {
						key.setL_M_LOAD_C_R(new Integer(msgKey.getKeyValue("L_M_LOAD_C_R")));
					}
					if(msgKeyType.containsKeyColumn("L_M_LOAD_C_G")) {
						key.setL_M_LOAD_C_G(new Integer(msgKey.getKeyValue("L_M_LOAD_C_G")));
					}
					if(msgKeyType.containsKeyColumn("L_M_LOAD_C_B")) {
						key.setL_M_LOAD_C_B(new Integer(msgKey.getKeyValue("L_M_LOAD_C_B")));
					}
					if(msgKeyType.containsKeyColumn("L_LOW_LOAD")) {
						key.setL_LOW_LOAD(new Integer(msgKey.getKeyValue("L_LOW_LOAD")));
					}
					if(msgKeyType.containsKeyColumn("L_L_LOAD_C_R")) {
						key.setL_L_LOAD_C_R(new Integer(msgKey.getKeyValue("L_L_LOAD_C_R")));
					}
					if(msgKeyType.containsKeyColumn("L_L_LOAD_C_G")) {
						key.setL_L_LOAD_C_G(new Integer(msgKey.getKeyValue("L_L_LOAD_C_G")));
					}
					if(msgKeyType.containsKeyColumn("L_L_LOAD_C_B")) {
						key.setL_L_LOAD_C_B(new Integer(msgKey.getKeyValue("L_L_LOAD_C_B")));
					}
					if(msgKeyType.containsKeyColumn("LKM_ITEM_CD")) {
						key.setLKM_ITEM_CD(msgKey.getKeyValue("LKM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("LKM_ITEM_NAME")) {
						key.setLKM_ITEM_NAME(msgKey.getKeyValue("LKM_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LKM_JOB_ODR_CD")) {
						key.setLKM_JOB_ODR_CD(msgKey.getKeyValue("LKM_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("LKM_ODR_STS_TYP")) {
						key.setLKM_ODR_STS_TYP(msgKey.getKeyValue("LKM_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LKM_PRD_START_DATE")) {
						key.setLKM_PRD_START_DATE(msgKey.getKeyValue("LKM_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LKM_PRD_DUE_DATE")) {
						key.setLKM_PRD_DUE_DATE(msgKey.getKeyValue("LKM_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LKM_ODR_QTY")) {
						key.setLKM_ODR_QTY(msgKey.getKeyValue("LKM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("LKM_TOTAL_RCV_QTY")) {
						key.setLKM_TOTAL_RCV_QTY(msgKey.getKeyValue("LKM_TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("LKM_UNIT_LOAD")) {
						key.setLKM_UNIT_LOAD(msgKey.getKeyValue("LKM_UNIT_LOAD"));
					}
					if(msgKeyType.containsKeyColumn("LKM_LOAD_QTY")) {
						key.setLKM_LOAD_QTY(msgKey.getKeyValue("LKM_LOAD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("KM_LOAD_DATE")) {
						key.setKM_LOAD_DATE(msgKey.getKeyValue("KM_LOAD_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LKM_SUM_LOAD_QTY")) {
						key.setLKM_SUM_LOAD_QTY(msgKey.getKeyValue("LKM_SUM_LOAD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("LKM_OVR_LOAD_QTY")) {
						key.setLKM_OVR_LOAD_QTY(msgKey.getKeyValue("LKM_OVR_LOAD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("LKM_NECK_PROC_CD")) {
						key.setLKM_NECK_PROC_CD(msgKey.getKeyValue("LKM_NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("LKM_LOAD_DATE")) {
						key.setLKM_LOAD_DATE(msgKey.getKeyValue("LKM_LOAD_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LKM_NECK_PROC_NAME")) {
						key.setLKM_NECK_PROC_NAME(msgKey.getKeyValue("LKM_NECK_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LKM_NECK_PROC_CAPA")) {
						key.setLKM_NECK_PROC_CAPA(msgKey.getKeyValue("LKM_NECK_PROC_CAPA"));
					}
					if(msgKeyType.containsKeyColumn("LKM_NECK_PROC_CAPA_UNIT")) {
						key.setLKM_NECK_PROC_CAPA_UNIT(msgKey.getKeyValue("LKM_NECK_PROC_CAPA_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("FLG1")) {
						key.setFLG1(msgKey.getKeyValue("FLG1"));
					}
					if(msgKeyType.containsKeyColumn("FLG2")) {
						key.setFLG2(msgKey.getKeyValue("FLG2"));
					}
					if(msgKeyType.containsKeyColumn("FLG3")) {
						key.setFLG3(msgKey.getKeyValue("FLG3"));
					}
					if(msgKeyType.containsKeyColumn("FLG4")) {
						key.setFLG4(msgKey.getKeyValue("FLG4"));
					}
					if(msgKeyType.containsKeyColumn("FLG5")) {
						key.setFLG5(msgKey.getKeyValue("FLG5"));
					}
					if(msgKeyType.containsKeyColumn("FLG6")) {
						key.setFLG6(msgKey.getKeyValue("FLG6"));
					}
					if(msgKeyType.containsKeyColumn("FLG7")) {
						key.setFLG7(msgKey.getKeyValue("FLG7"));
					}
					if(msgKeyType.containsKeyColumn("FLG8")) {
						key.setFLG8(msgKey.getKeyValue("FLG8"));
					}
					if(msgKeyType.containsKeyColumn("FLG9")) {
						key.setFLG9(msgKey.getKeyValue("FLG9"));
					}
					if(msgKeyType.containsKeyColumn("FLG10")) {
						key.setFLG10(msgKey.getKeyValue("FLG10"));
					}
					if(msgKeyType.containsKeyColumn("FLG11")) {
						key.setFLG11(msgKey.getKeyValue("FLG11"));
					}
					if(msgKeyType.containsKeyColumn("FLG12")) {
						key.setFLG12(msgKey.getKeyValue("FLG12"));
					}
					if(msgKeyType.containsKeyColumn("FLG13")) {
						key.setFLG13(msgKey.getKeyValue("FLG13"));
					}
					if(msgKeyType.containsKeyColumn("FLG14")) {
						key.setFLG14(msgKey.getKeyValue("FLG14"));
					}
					if(msgKeyType.containsKeyColumn("FLG15")) {
						key.setFLG15(msgKey.getKeyValue("FLG15"));
					}
					if(msgKeyType.containsKeyColumn("FLG16")) {
						key.setFLG16(msgKey.getKeyValue("FLG16"));
					}
					if(msgKeyType.containsKeyColumn("FLG17")) {
						key.setFLG17(msgKey.getKeyValue("FLG17"));
					}
					if(msgKeyType.containsKeyColumn("FLG18")) {
						key.setFLG18(msgKey.getKeyValue("FLG18"));
					}
					if(msgKeyType.containsKeyColumn("FLG19")) {
						key.setFLG19(msgKey.getKeyValue("FLG19"));
					}
					if(msgKeyType.containsKeyColumn("FLG20")) {
						key.setFLG20(msgKey.getKeyValue("FLG20"));
					}
					if(msgKeyType.containsKeyColumn("FLG21")) {
						key.setFLG21(msgKey.getKeyValue("FLG21"));
					}
					if(msgKeyType.containsKeyColumn("FLG22")) {
						key.setFLG22(msgKey.getKeyValue("FLG22"));
					}
					if(msgKeyType.containsKeyColumn("FLG23")) {
						key.setFLG23(msgKey.getKeyValue("FLG23"));
					}
					if(msgKeyType.containsKeyColumn("FLG24")) {
						key.setFLG24(msgKey.getKeyValue("FLG24"));
					}
					if(msgKeyType.containsKeyColumn("FLG25")) {
						key.setFLG25(msgKey.getKeyValue("FLG25"));
					}
					if(msgKeyType.containsKeyColumn("FLG26")) {
						key.setFLG26(msgKey.getKeyValue("FLG26"));
					}
					if(msgKeyType.containsKeyColumn("FLG27")) {
						key.setFLG27(msgKey.getKeyValue("FLG27"));
					}
					if(msgKeyType.containsKeyColumn("FLG28")) {
						key.setFLG28(msgKey.getKeyValue("FLG28"));
					}
					if(msgKeyType.containsKeyColumn("FLG29")) {
						key.setFLG29(msgKey.getKeyValue("FLG29"));
					}
					if(msgKeyType.containsKeyColumn("FLG30")) {
						key.setFLG30(msgKey.getKeyValue("FLG30"));
					}
					if(msgKeyType.containsKeyColumn("FLG31")) {
						key.setFLG31(msgKey.getKeyValue("FLG31"));
					}
					if(msgKeyType.containsKeyColumn("FLG32")) {
						key.setFLG32(msgKey.getKeyValue("FLG32"));
					}
					if(msgKeyType.containsKeyColumn("FLG33")) {
						key.setFLG33(msgKey.getKeyValue("FLG33"));
					}
					if(msgKeyType.containsKeyColumn("FLG34")) {
						key.setFLG34(msgKey.getKeyValue("FLG34"));
					}
					if(msgKeyType.containsKeyColumn("FLG35")) {
						key.setFLG35(msgKey.getKeyValue("FLG35"));
					}
					if(msgKeyType.containsKeyColumn("FLG36")) {
						key.setFLG36(msgKey.getKeyValue("FLG36"));
					}
					if(msgKeyType.containsKeyColumn("FLG37")) {
						key.setFLG37(msgKey.getKeyValue("FLG37"));
					}
					if(msgKeyType.containsKeyColumn("FLG38")) {
						key.setFLG38(msgKey.getKeyValue("FLG38"));
					}
					if(msgKeyType.containsKeyColumn("FLG39")) {
						key.setFLG39(msgKey.getKeyValue("FLG39"));
					}
					if(msgKeyType.containsKeyColumn("FLG40")) {
						key.setFLG40(msgKey.getKeyValue("FLG40"));
					}
					if(msgKeyType.containsKeyColumn("FLG41")) {
						key.setFLG41(msgKey.getKeyValue("FLG41"));
					}
					if(msgKeyType.containsKeyColumn("FLG42")) {
						key.setFLG42(msgKey.getKeyValue("FLG42"));
					}
					if(msgKeyType.containsKeyColumn("FLG43")) {
						key.setFLG43(msgKey.getKeyValue("FLG43"));
					}
					if(msgKeyType.containsKeyColumn("FLG44")) {
						key.setFLG44(msgKey.getKeyValue("FLG44"));
					}
					if(msgKeyType.containsKeyColumn("FLG45")) {
						key.setFLG45(msgKey.getKeyValue("FLG45"));
					}
					if(msgKeyType.containsKeyColumn("FLG46")) {
						key.setFLG46(msgKey.getKeyValue("FLG46"));
					}
					if(msgKeyType.containsKeyColumn("FLG47")) {
						key.setFLG47(msgKey.getKeyValue("FLG47"));
					}
					if(msgKeyType.containsKeyColumn("FLG48")) {
						key.setFLG48(msgKey.getKeyValue("FLG48"));
					}
					if(msgKeyType.containsKeyColumn("FLG49")) {
						key.setFLG49(msgKey.getKeyValue("FLG49"));
					}
					if(msgKeyType.containsKeyColumn("FLG50")) {
						key.setFLG50(msgKey.getKeyValue("FLG50"));
					}
					if(msgKeyType.containsKeyColumn("FLG51")) {
						key.setFLG51(msgKey.getKeyValue("FLG51"));
					}
					if(msgKeyType.containsKeyColumn("FLG52")) {
						key.setFLG52(msgKey.getKeyValue("FLG52"));
					}
					if(msgKeyType.containsKeyColumn("FLG53")) {
						key.setFLG53(msgKey.getKeyValue("FLG53"));
					}
					if(msgKeyType.containsKeyColumn("FLG54")) {
						key.setFLG54(msgKey.getKeyValue("FLG54"));
					}
					if(msgKeyType.containsKeyColumn("FLG55")) {
						key.setFLG55(msgKey.getKeyValue("FLG55"));
					}
					if(msgKeyType.containsKeyColumn("FLG56")) {
						key.setFLG56(msgKey.getKeyValue("FLG56"));
					}
					if(msgKeyType.containsKeyColumn("FLG57")) {
						key.setFLG57(msgKey.getKeyValue("FLG57"));
					}
					if(msgKeyType.containsKeyColumn("FLG58")) {
						key.setFLG58(msgKey.getKeyValue("FLG58"));
					}
					if(msgKeyType.containsKeyColumn("FLG59")) {
						key.setFLG59(msgKey.getKeyValue("FLG59"));
					}
					if(msgKeyType.containsKeyColumn("FLG60")) {
						key.setFLG60(msgKey.getKeyValue("FLG60"));
					}
					if(msgKeyType.containsKeyColumn("FLG61")) {
						key.setFLG61(msgKey.getKeyValue("FLG61"));
					}
					if(msgKeyType.containsKeyColumn("FLG62")) {
						key.setFLG62(msgKey.getKeyValue("FLG62"));
					}
					if(msgKeyType.containsKeyColumn("FLG63")) {
						key.setFLG63(msgKey.getKeyValue("FLG63"));
					}
					if(msgKeyType.containsKeyColumn("FLG64")) {
						key.setFLG64(msgKey.getKeyValue("FLG64"));
					}
					if(msgKeyType.containsKeyColumn("FLG65")) {
						key.setFLG65(msgKey.getKeyValue("FLG65"));
					}
					if(msgKeyType.containsKeyColumn("FLG66")) {
						key.setFLG66(msgKey.getKeyValue("FLG66"));
					}
					if(msgKeyType.containsKeyColumn("FLG67")) {
						key.setFLG67(msgKey.getKeyValue("FLG67"));
					}
					if(msgKeyType.containsKeyColumn("FLG68")) {
						key.setFLG68(msgKey.getKeyValue("FLG68"));
					}
					if(msgKeyType.containsKeyColumn("FLG69")) {
						key.setFLG69(msgKey.getKeyValue("FLG69"));
					}
					if(msgKeyType.containsKeyColumn("FLG70")) {
						key.setFLG70(msgKey.getKeyValue("FLG70"));
					}
					if(msgKeyType.containsKeyColumn("FLG71")) {
						key.setFLG71(msgKey.getKeyValue("FLG71"));
					}
					if(msgKeyType.containsKeyColumn("FLG72")) {
						key.setFLG72(msgKey.getKeyValue("FLG72"));
					}
					if(msgKeyType.containsKeyColumn("FLG73")) {
						key.setFLG73(msgKey.getKeyValue("FLG73"));
					}
					if(msgKeyType.containsKeyColumn("FLG74")) {
						key.setFLG74(msgKey.getKeyValue("FLG74"));
					}
					if(msgKeyType.containsKeyColumn("FLG75")) {
						key.setFLG75(msgKey.getKeyValue("FLG75"));
					}
					if(msgKeyType.containsKeyColumn("FLG76")) {
						key.setFLG76(msgKey.getKeyValue("FLG76"));
					}
					if(msgKeyType.containsKeyColumn("FLG77")) {
						key.setFLG77(msgKey.getKeyValue("FLG77"));
					}
					if(msgKeyType.containsKeyColumn("FLG78")) {
						key.setFLG78(msgKey.getKeyValue("FLG78"));
					}
					if(msgKeyType.containsKeyColumn("FLG79")) {
						key.setFLG79(msgKey.getKeyValue("FLG79"));
					}
					if(msgKeyType.containsKeyColumn("FLG80")) {
						key.setFLG80(msgKey.getKeyValue("FLG80"));
					}
					if(msgKeyType.containsKeyColumn("FLG81")) {
						key.setFLG81(msgKey.getKeyValue("FLG81"));
					}
					if(msgKeyType.containsKeyColumn("FLG82")) {
						key.setFLG82(msgKey.getKeyValue("FLG82"));
					}
					if(msgKeyType.containsKeyColumn("FLG83")) {
						key.setFLG83(msgKey.getKeyValue("FLG83"));
					}
					if(msgKeyType.containsKeyColumn("FLG84")) {
						key.setFLG84(msgKey.getKeyValue("FLG84"));
					}
					if(msgKeyType.containsKeyColumn("FLG85")) {
						key.setFLG85(msgKey.getKeyValue("FLG85"));
					}
					if(msgKeyType.containsKeyColumn("FLG86")) {
						key.setFLG86(msgKey.getKeyValue("FLG86"));
					}
					if(msgKeyType.containsKeyColumn("FLG87")) {
						key.setFLG87(msgKey.getKeyValue("FLG87"));
					}
					if(msgKeyType.containsKeyColumn("FLG88")) {
						key.setFLG88(msgKey.getKeyValue("FLG88"));
					}
					if(msgKeyType.containsKeyColumn("FLG89")) {
						key.setFLG89(msgKey.getKeyValue("FLG89"));
					}
					if(msgKeyType.containsKeyColumn("FLG90")) {
						key.setFLG90(msgKey.getKeyValue("FLG90"));
					}
					if(msgKeyType.containsKeyColumn("L_NECK_PROC_NAME")) {
						key.setL_NECK_PROC_NAME(msgKey.getKeyValue("L_NECK_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("L_NECK_PROC_CAPA")) {
						key.setL_NECK_PROC_CAPA(msgKey.getKeyValue("L_NECK_PROC_CAPA"));
					}
					if(msgKeyType.containsKeyColumn("L_NECK_PROC_CAPA_UNIT")) {
						key.setL_NECK_PROC_CAPA_UNIT(msgKey.getKeyValue("L_NECK_PROC_CAPA_UNIT"));
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
