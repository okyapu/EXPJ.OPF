/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0080/src/com/nec/jp/orteus/metamorBase/AA0080/AA0080020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0080;

import com.nec.jp.orteus.metamorBase.AA0080.*;
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
//------------------------------------------------------------------------------
import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0080020Control
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
        public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        public AA0080020Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
       
       //------------------------------------------------------------------------------
       
        /** ��ʋ��ʒ�`�擾�N���X */
        ScreenParam _scParam = sp;
       
       //-----------------------------------------------------------------------------
       
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
       
       //-----------------------------------------------------------------------------
       
        /** �J�����_�[ */
        Calendar _calendar = new GregorianCalendar();
       
        /** ���t�t�H�[�}�b�g1 */
        //private SimpleDateFormat _dateFormat1 = new SimpleDateFormat(_pattern1);
       
        /** ���t�t�H�[�}�b�g2 */
        //private SimpleDateFormat _dateFormat2 = new SimpleDateFormat(_pattern2);
       
        /** ���t�t�H�[�}�b�g3 */
        //private SimpleDateFormat _dateFormat3 = new SimpleDateFormat(_pattern3);
       
        /** ���t�t�H�[�}�b�g�p�^�[��1 */
        private final static String _pattern1 = "yyyy/MM/dd";
       
        /** ���t�t�H�[�}�b�g�p�^�[��2 */
        private final static String _pattern2 = "yyyy/MM";
       
        /** ���t�t�H�[�}�b�g�p�^�[��3 */
        private final static String _pattern3 = "yyyy";
       
       
        /**
         * Date�^ �� String�^�B
         * @return String �w�肵���p�^�[�������t������
         */
        public String dateToString(Date date, String pattern)
        {
         if(_pattern1.equals(pattern) == true)
          return Converter.dateToStr(date, _pattern1);
         else if(_pattern2.equals(pattern) == true)
          return Converter.dateToStr(date, _pattern2);
         else
          return Converter.dateToStr(date, _pattern3);
        }
       
        /**
         * String�^ �� Date�^�B
         * @return Date ���t
         */
        public Date stringToDate(String date, String pattern) throws ParseException
        {
         if(_pattern1.equals(pattern) == true)
          return Converter.strToDate(date, _pattern1);
         else if(_pattern2.equals(pattern) == true)
          return Converter.strToDate(date, _pattern2);
         else
          return Converter.strToDate(date, _pattern3);
        }
       
       //-- �ϐ���` ------------------------------------------------------------------
       
        /** �J�����_�[����(��)�̃p�^�[�� */
        private final static String _selectMonth = "/__";
       
        /** �J�����_�[����(�N)�̃p�^�[�� */
        private final static String _selectYear = "/__/__";
       
        /** �u�����N */
        private final static String _brank = " ";
       
        /** �󕶎� */
        private final static String _emptyStr = "";
       
        /** �x�� */
        private final static Integer _holidayOn = new Integer(1);
       
        /** �ғ��� */
        private final static Integer _holidayOff = new Integer(0);
       
       //---------- �J�����_���(��)�̏��� -------------------------------------------
       
        /** �擾���̃f�t�H���g */
        private String _monthDefoult = "�@�@�@�N �@�@��";
       
        /** �擾�� */
        private String _targetMonth = _monthDefoult;
       
        /** �擾�N */
        private String _targetYear = null;
       
        /** �J�����_���X�g */
        private List _calendarList = new ArrayList(0);
       
        /** 
         * �J�����_���X�g�擾 
         * @return �J�����_���X�g
        */
        public List getCalendarList(){ return _calendarList; }
       
        /** 
         * �J�����_���X�g�ݒ�
         * @param �J�����_���X�g
         */
        public void setCalendarList(List list){ _calendarList = list; }
       
       
        /** �q�ːe�ɉ�ʑJ�ڂ����ꍇ�̃L�[���ێ��ׂ̈�Struct */
        private AA0080020Struct _keyStruct = new AA0080020Struct();
       
        /** �L�[���Struct�̎擾 */
        public AA0080020Struct getKeyStruct(){ return _keyStruct; }
        
        /** �L�[���Struct�̐ݒ� */
        public void setKeyStruct(AA0080020Struct struct){ _keyStruct.copy(struct); }
       
        //------- �j���擾 -------------------------------------------------------------
       
        /** �j���z�� */
        private String[] days = new String[7];

		/** 
        * �V�X�e���g�p���[�U�̃��P�[���ɂ��j����Ԃ��܂��B
        * @return �j���z��
        */
				private String[] getDaysByLocale() {
					String _userCd = getsysUSER_CD();
					String _locale = CoreTools.getLocale(_userCd);
					ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic",_locale);
					String[] _localedays = {
						CoreTools.getRBString("Expj.Cmt0110",rb),
						CoreTools.getRBString("Expj.Cmt0104",rb), 
						CoreTools.getRBString("Expj.Cmt0105",rb), 
						CoreTools.getRBString("Expj.Cmt0106",rb),
						CoreTools.getRBString("Expj.Cmt0107",rb), 
						CoreTools.getRBString("Expj.Cmt0108",rb), 
						CoreTools.getRBString("Expj.Cmt0109",rb)
					};
					return _localedays;
				}
		
        /** 
         * �j���ݒ�
         * @param Struct���X�g
        */
        public void setDayWeek(List dayList) throws ParseException
        {
         for(int i = 0; i < dayList.size(); i++)
         {
          AA0080020Struct workStruct = (AA0080020Struct)dayList.get(i);
          _calendar.setTime(stringToDate(workStruct.getCAL_DATE(), _pattern1));
          workStruct.setCAL_DATE_WEEK(days[_calendar.get(_calendar.DAY_OF_WEEK) - 1]);
         }
        }
        
        
       
       //---------�N�x�ʃJ�����_ --------------------------------------------------
       
        /** �N�̍ŏI�� */
        private final static String _endDay = "/12/31";
       
        /** �N�̊J�n�� */
        private final static String _firstDay = "/01/01";
       
        /** ���t�t�H�[�}�b�g1 */
        //private SimpleDateFormat _yearDaysFormat = new SimpleDateFormat("D");
       
        /** �N�x�ʗpStruct */
        private AA0080020Struct _yearStruct = new AA0080020Struct();
       
        /** 
         * �N�ԓ����擾
         * @param �N(YYYY�w��)
         * @return ����
        */
        public String getYearAllDay(String year) throws ParseException
        {
         String endDay = year + _endDay;
         //return _yearDaysFormat.format(stringToDate(endDay, _pattern1));
         return Converter.dateToStr(stringToDate(endDay, _pattern1), "D");
        }
       
        /**
         * �N�n����̓����擾
         * @param ���t(YYYY/MM/DD)
         * @return ����
        */
        public String getYearDay(String day) throws ParseException
        {
         //return _yearDaysFormat.format(stringToDate(day, _pattern1));
         return Converter.dateToStr(stringToDate(day, _pattern1), "D");
        }
       
        /** 
         * �N�x�ʃJ�����_�쐬
         * @param �J�����_�ԍ�
         * @param �N(YYYY�w��)
        */
        public void makeYearDays(String no, String year)
            throws FoundationException, SQLException, ParseException
        {
         String yearStr = _emptyStr;		// �N�ԋx��������i�[
       
         // �J�����_���׌���
         struct.setCAL_DATE(year + _selectYear);
         List calList = entity.mselectM_CAL_month.read(conn, struct);
       
         // �N�ԓ����擾
         int yearNum = (Integer.valueOf(getYearAllDay(year))).intValue();
       
         if(calList.size() <= 0){
          // ���ׂȂ�
          for(int i = 0; i < yearNum; i++)
           yearStr = yearStr + _brank;
         }
         else{
          // �N�n������t�擾
          AA0080020Struct firstStruct = (AA0080020Struct)calList.get(0);
          int dayfrom = (Integer.valueOf(getYearDay(firstStruct.getCAL_DATE()))).intValue();
       
          // �N�n���疾�ׂȂ������̋x��������쐬
          for(int i = 1; i < dayfrom; i++){
           yearStr = yearStr + _brank;
          }
       
          // �J�����_�쐬
          _calendar.setTime(stringToDate(firstStruct.getCAL_DATE(), _pattern1));
       
          // ���ׂ��蕔���̋x��������쐬
          for(int i = 0; i < calList.size(); ){
           AA0080020Struct workStruct = (AA0080020Struct)calList.get(i);
           // ���t����
           if(_calendar.getTime().getTime() == 
             (stringToDate(workStruct.getCAL_DATE(), _pattern1)).getTime()){
            yearStr = yearStr + workStruct.getHOLIDAY_FLG().toString();
            i++;
           }
           else{
            yearStr = yearStr + _brank;
           }
           _calendar.add(Calendar.DATE, 1);
          }
       
          // �J�����_���ׂ̍ŏI���t�̔N�n����̓��t�擾
          AA0080020Struct endStruct = (AA0080020Struct)calList.get(calList.size() -1);
          int dayto = (Integer.valueOf(getYearDay(endStruct.getCAL_DATE()))).intValue();
       
          if(dayto != yearNum){
           // ���׍ŏI������N���܂ł̓��t�擾
           int num = yearNum - dayto;
       
           // ���׍ŏI������N���܂ł̋x��������쐬
           for(int i = 0; i < num; i++){
            yearStr = yearStr + _brank;
           }
          }
         }
       
         // �X�V
         struct.setCAL_YEAR(year);
         struct.setCAL_YEAR_HOLIDAY(yearStr);
         List yearList = entity.mselectT_CAL_BY_YEAR.read(conn, struct);
         if(yearList.size() <= 0)
          entity.minsertT_CAL_BY_YEAR.create(conn, struct);
         else
          entity.mupdateT_CAL_BY_YEAR.update(conn, struct);
       
        }
       
       //------------------------------------------------------------------------------
        /**
         * SQLException�G���[���b�Z�[�W�ݒ�
         * @param SQLException
         * @param �o�̓G���[���b�Z�[�W
         */
        private void setSqlExceptionMsg(SQLException e) throws ExpjException
        {
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
       
          throw ee;
        }
       
         
        /**
         * �G���[���b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setErrorMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * �G���[���b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W(List)
         */
        private void setErrorMessage(String messageno, List message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         
         for(int i=0; i<message.size(); i++)
         {
          emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
         }
        }
        
        /**
         * �x�����b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setWarnMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
         
        /**
         * ��񃁃b�Z�[�W�ݒ�
         * @param ���b�Z�[�W�ԍ�
         * @param �o�̓��b�Z�[�W
         */
        private void setInfoMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
        }
       
       //------------------------------------------------------------------------------
        /** �ŐV�J�����_���X�g */
        private List _nowCalendarList = new ArrayList(0);
       
        /** 
         * �ŐV�J�����_���X�g�擾 
         * @return �ŐV�J�����_���X�g
        */
        public List getNowCalendarList(){ return _nowCalendarList; }
       
        /** 
         * �ŐV�J�����_���X�g�ݒ�
         * @param �ŐV�J�����_���X�g
         */
        public void setNowCalendarList(List list){ _nowCalendarList = list; }
       
       
        /**
         * �Ώۈꗗ���ɂ��Ǎ���Ԃ��Đݒ肷�鏈��
         * @param �\���Ώۃ��X�g
         */
        private void renewalReadStatus(List listTarget)
        {
         if(listTarget != null && listTarget.size() > 0)
         {
          setReadStatus(NORMAL);
         }
         else
         {
          setReadStatus(NOT_FOUND);
         }
        }
       
        /**
         * �e�f�[�^�Ǎ�����
         *
         */
        public boolean readParentData() throws BusinessProcessException, FoundationException
        {
         String Message = "";
       
         boolean bSuccess = false;
         try{
          // �N���A
          _calendarList.clear();
          _keyStruct.clear();
          _keyStruct.setCAL_NO(struct.getCAL_NO());
          struct.setDATE_FROM((String)null);
          struct.setDATE_TO((String)null);
          struct.setCAL_NAME((String)null);
       
          // �J�����_�w�b�_����
          List hList = entity.mselectM_CAL_H.read(conn, struct);
          if(hList.size() <= 0){
           // �Ǎ��������s�F�w�肵���J�����_�ԍ��͖��o�^�ł�
           Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
           
           setErrorMessage("AA01013", Message);
          }else{
           // �J�����_���ݒ�
           AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
           _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
           struct.setCAL_NAME(workStruct.getCAL_NAME());
          }
       
          // SYSTEM_PARAMETER����TIME_CTRL �̒l���擾����
          AA0080020Struct wSt = new AA0080020Struct();
          wSt.setsysName("TIME_CTRL");
          List lst = entity.mselectSYS_PARAMETER.read(conn,wSt);
          if(lst.size() <=0 )
          {
        	  Message = "SYS_PARAMETER.NAME:" + wSt.getsysName();
              setErrorMessage("AC00106", Message);
          }else{
        	  String timeCtl = ((AA0080020Struct)lst.get(0)).getsysValue();
        	  if(timeCtl.toLowerCase().equals("false"))
        	  {
        		  struct.seth_TIME_CTRL("0");
        	  }else{
        		  struct.seth_TIME_CTRL("1");
        	  }
          }
          
          // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
          if(msgStruct.sizeError() <= 0)
          {
           List calList = null;
       
           // �J�����_�쐬�ς�FROM�`TO�擾
           calList = entity.mselectM_CAL_max_min.read(conn, struct);
           if(calList.size() > 0){
            // FROM�`TO�ݒ�
            AA0080020Struct workStruct = (AA0080020Struct)calList.get(0);
            
            // FROM�`TO���t�̎擾����
            if(workStruct.getDATE_FROM() != null &&
               workStruct.getDATE_TO() != null){
             struct.setDATE_FROM(workStruct.getDATE_FROM());
             struct.setDATE_TO(workStruct.getDATE_TO());
        
             _keyStruct.setDATE_FROM(workStruct.getDATE_FROM());
             _keyStruct.setDATE_TO(workStruct.getDATE_TO());
        
             // ����
             if(_targetMonth.equals(_monthDefoult) == false){
              struct.setCAL_DATE(_targetMonth + _selectMonth);
             }
             else{
              // �V�X�e�����t�擾
              Date target = new Date(System.currentTimeMillis());
              String s_sysDate = dateToString(target, _pattern2);
              String s_sysYear = dateToString(target, _pattern3);
              _targetMonth = s_sysDate;		// �������ۑ�
              _targetYear = s_sysYear;		// �����N�ۑ�
         
              struct.setCAL_DATE(s_sysDate + _selectMonth);
             }
             _calendarList = entity.mselectM_CAL_month.read(conn, struct);
       
             // �j���ݒ�
             setDayWeek(_calendarList);
             
             // �x���`�F�b�N�{�b�N�X�l�ݒ�
             for(int i = 0; i < _calendarList.size(); i++)
             {
              workStruct = (AA0080020Struct)_calendarList.get(i);
              if(workStruct.getHOLIDAY_FLG().intValue() == 1)
              {
               workStruct.setc_HOLIDAY_FLG("true");
              }
              else
              {
               workStruct.setc_HOLIDAY_FLG("NULL");
              }
              workStruct.seth_TIME_CTRL(struct.geth_TIME_CTRL());
             }
            }
           }
          }
          list = _calendarList;
         }
         catch(ParseException e){
          // �ϊ����s
          
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
       
          throw ee;
       
         }catch(SQLException e){
           setSqlExceptionMsg(e);
       
         }finally{
          if(msgStruct.sizeError() <= 0){
           bSuccess = true;
       
           // �ꗗ��񂩂�Ǎ���Ԃ��Đݒ�
           if(_calendarList != null && _calendarList.size() > 0)
           {
            setReadStatus(NORMAL);
           }
           else
           {
            setReadStatus(NOT_FOUND);
           }
       
          }else{
           bSuccess = false;
       
           // ������Ԃ�������
           setReadStatus(INITIAL);
          }
         }
         return bSuccess;
        }
       //------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //----------------------------------------------------------------------
                // �V�X�e�����t�擾
                Date target = new Date(System.currentTimeMillis());
                String s_sysDate = dateToString(target, _pattern2);
                String s_sysYear = dateToString(target, _pattern3);
                _targetMonth = s_sysDate;		// �������ۑ�
                _targetYear = s_sysYear;		// �����N�ۑ�
              
                // �Ǎ�����
                readParentData();
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �J�����_�쐬�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
                //----------------------------------------------------------------------
                 
                String Message = "";
                boolean bSuccess = false;
                 
                try{
                 // �L�[�ݒ�
                 _keyStruct.setCAL_NO(struct.getCAL_NO());
              
                 // �J�����_�w�b�_����
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // �쐬�������s�F�w�肵���J�����_�ԍ��͖��o�^�ł�", struct.getsUser_ID());
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01013", Message);
                 }else{
                  // �J�����_���ݒ�
                  AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
                  struct.setCAL_NAME(workStruct.getCAL_NAME());
                  _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0){
                  List calList = null;
                  
                  // �J�����_�쐬�ς�FROM�`TO�擾
                  calList = entity.mselectM_CAL_max_min.read(conn, struct);
                  if(calList.size() <= 0){
                   struct.setDATE_FROM((String)null);
                   struct.setDATE_TO((String)null);
                  }
                  else{
                   // FROM�`TO�ݒ�
                   AA0080020Struct workStruct = (AA0080020Struct)calList.get(0);
              
                   if(workStruct.getDATE_FROM() != null &&
                    workStruct.getDATE_TO() != null){
                    _calendar.setTime(stringToDate(workStruct.getDATE_TO(), _pattern1));
                    _calendar.add(Calendar.DATE, 1);
                    Date d_fromDate = _calendar.getTime();
               
                    struct.setDATE_FROM(dateToString(d_fromDate, _pattern1));
                    struct.setDATE_TO((String)null);
              
                    // FROM/TO���t�ݒ�
                    struct.setw_DATE_FROM(workStruct.getDATE_FROM());
                    struct.setw_DATE_TO(workStruct.getDATE_TO());
                    _keyStruct.setDATE_FROM(workStruct.getDATE_FROM());
                    _keyStruct.setDATE_TO(workStruct.getDATE_TO());
                   }
                   else{
                    struct.setDATE_FROM((String)null);
                    struct.setDATE_TO((String)null);
              
                    // FROM/TO���t�ݒ�
                    struct.setw_DATE_FROM((String)null);
                    struct.setw_DATE_TO((String)null);
                    _keyStruct.setDATE_FROM((String)null);
                    _keyStruct.setDATE_TO((String)null);
                   }
                  }
              
                  // �j���̋x���ݒ�
                  struct.seth_HOLIDAY_SUN(_holidayOff);
                  struct.seth_HOLIDAY_MON(_holidayOff);
                  struct.seth_HOLIDAY_TUE(_holidayOff);
                  struct.seth_HOLIDAY_WED(_holidayOff);
                  struct.seth_HOLIDAY_THU(_holidayOff);
                  struct.seth_HOLIDAY_FRI(_holidayOff);
                  struct.seth_HOLIDAY_SAT(_holidayOff);
                  
                  // �V�t�g�R�[�h�̓��͐���
                  //struct.s
              
                  // ��������
                  bSuccess = true;
                 }
              
                }catch(ParseException e){
                 // �ϊ����s
                 
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 // �G���[������ꍇ�́A�O��̏�Ԃɖ߂����߁Aservlet�Ŏ擾������Ԃ�ݒ�
                 if(bSuccess != true)
                 {
                  list = _nowCalendarList;
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �x���Đݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlchange() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlchange");
			//{{user_implement_dev:<controlchange>
                //----------------------------------------------------------------------
                
                String Message = "";
                boolean bSuccess = false;
              
                try{
                 // �L�[�ݒ�
                 _keyStruct.setCAL_NO(struct.getCAL_NO());
              
                 // �J�����_�w�b�_����
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // �x���Đݒ菈�����s�F�w�肵���J�����_�ԍ��͖��o�^�ł�
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01013", Message);
                 }
                 else{
                  // �J�����_���ݒ�
                  AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
                  struct.setCAL_NAME(workStruct.getCAL_NAME());
                  _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0){
                  List calList = null;
                  
                  // �J�����_�쐬�ς�FROM�`TO�擾
                  calList = entity.mselectM_CAL_max_min.read(conn, struct);
                  if(calList.size() <= 0){
                   // �x���Đݒ菈�����s�F�J�����_���׃f�[�^�����݂��܂���", struct.getsUser_ID());
                   Message = "M_CAL.CAL_NO:" + struct.getCAL_NO();
                   
                   setErrorMessage("ZZ06002", Message);
                  }else{
                   AA0080020Struct workStruct = (AA0080020Struct)calList.get(0);
                   if(workStruct.getDATE_FROM() == null ||
                    workStruct.getDATE_TO() == null){
                    // �x���Đݒ菈�����s�F�J�����_���׃f�[�^�����݂��܂���
                    Message = "M_CAL.CAL_NO:" + struct.getCAL_NO();
                    
                    setErrorMessage("ZZ06002", Message);
                   }else{
                    struct.setw_DATE_FROM(workStruct.getDATE_FROM());
                    struct.setw_DATE_TO(workStruct.getDATE_TO());
                    struct.setDATE_FROM((String)null);
                    struct.setDATE_TO((String)null);
                    _keyStruct.setDATE_FROM(workStruct.getDATE_FROM());
                    _keyStruct.setDATE_TO(workStruct.getDATE_TO());
              
                    // �j���̋x���ݒ�
                    struct.seth_HOLIDAY_SUN(_holidayOff);
                    struct.seth_HOLIDAY_MON(_holidayOff);
                    struct.seth_HOLIDAY_TUE(_holidayOff);
                    struct.seth_HOLIDAY_WED(_holidayOff);
                    struct.seth_HOLIDAY_THU(_holidayOff);
                    struct.seth_HOLIDAY_FRI(_holidayOff);
                    struct.seth_HOLIDAY_SAT(_holidayOff);
              
                    // ��������
                    bSuccess = true;
                   }
                  }
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 // �G���[������ꍇ�́A�O��̏�Ԃɖ߂����߁Aservlet�Ŏ擾������Ԃ�ݒ�
                 if(bSuccess != true)
                 {
                  list = _nowCalendarList;
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlchange>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlchange");

		return;
	}

	/**
	 * �O���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlbefore() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlbefore");
			//{{user_implement_dev:<controlbefore>
                //----------------------------------------------------------------------
                 
                String Message = "";
                boolean bSuccess = false;
              
                try{
                 // �J�����_�w�b�_����
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // �O���������s�F�w�肵���J�����_�ԍ��͖��o�^�ł�
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01013", Message);
                 }else{
                  // �J�����_���ݒ�
                  AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
                  _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
                  struct.setCAL_NAME(workStruct.getCAL_NAME());
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  // �O���v�Z
                  _calendar.setTime(stringToDate(_targetMonth, _pattern2));
                  _calendar.add(Calendar.MONTH, -1);
                  Date d_targetDate = _calendar.getTime();
              
                  String s_sysDate = dateToString(d_targetDate, _pattern2);
                  String s_sysYear = dateToString(d_targetDate, _pattern3);
                  _targetMonth = s_sysDate;		// �������ۑ�
                  _targetYear = s_sysYear;		// �����N�ۑ�
              
                  // �Ǎ�����
                  if(readParentData() == true)
                  {
                   bSuccess = true;
                  }
                 }
                }
                catch(ParseException e){
                 // �ϊ����s
                 
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 // �ŐV�̃J�����_����ݒ�
                 if(bSuccess == true)
                 {
                  // �G���[���Ȃ��ꍇ�́A�Ǎ���̏�Ԃ�ݒ�
                  list = _calendarList;
                 }
                 else
                 {
                  // �G���[������ꍇ�́Aservlet�Ŏ擾������Ԃ�ݒ�
                  list = _nowCalendarList;
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlbefore>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlbefore");

		return;
	}

	/**
	 * �����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlnext() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlnext");
			//{{user_implement_dev:<controlnext>
                //----------------------------------------------------------------------
                 
                String Message = "";
                boolean bSuccess = false;
              
                try{
                 // �J�����_�w�b�_����
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // �����������s�F�w�肵���J�����_�ԍ��͖��o�^�ł�
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01013", Message);
                 }else{
                  // �J�����_���ݒ�
                  AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
                  _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
                  struct.setCAL_NAME(workStruct.getCAL_NAME());
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0){
                  List calList = null;
              
                  // �O���v�Z
                  _calendar.setTime(stringToDate(_targetMonth, _pattern2));
                  _calendar.add(Calendar.MONTH, 1);
                  Date d_targetDate = _calendar.getTime();
              
                  String s_sysDate = dateToString(d_targetDate, _pattern2);
                  String s_sysYear = dateToString(d_targetDate, _pattern3);
                  _targetMonth = s_sysDate;		// �������ۑ�
                  _targetYear = s_sysYear;		// �����N�ۑ�
              
                  // �Ǎ�����
                  if(readParentData() == true)
                  {
                   bSuccess = true;
                  }
                 }
                }
                catch(ParseException e){
                 // �ϊ����s
                 
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 // �ŐV�̃J�����_����ݒ�
                 if(bSuccess == true)
                 {
                  // �G���[���Ȃ��ꍇ�́A�Ǎ���̏�Ԃ�ݒ�
                  list = _calendarList;
                 }
                 else
                 {
                  // �G���[������ꍇ�́Aservlet�Ŏ擾������Ԃ�ݒ�
                  list = _nowCalendarList;
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlnext>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlnext");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                String Message = "";
                boolean bSuccess = false;
              
                try{
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
                 transFlg = true;
                 List listMessage = new ArrayList();
              
                 // �J�����_�w�b�_����
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // �����������s�F�w�肵���J�����_�ԍ��͖��o�^�ł�
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01013", Message);
                 }else{
                  // �J�����_���ݒ�
                  AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
                  _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
                  struct.setCAL_NAME(workStruct.getCAL_NAME());
                 }
                               
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
               
                  // �J�����_���׍X�V
                  boolean allHolidayResult = false;
                  
                  for(int i = 0; i < _calendarList.size(); i++){
                   AA0080020Struct nowStruct = (AA0080020Struct)_nowCalendarList.get(i);
                   AA0080020Struct updateStruct = (AA0080020Struct)_calendarList.get(i);
               
                   // �J�����_���׃`�F�b�N
                   List checkList = entity.mselectM_CAL_modify_count.read(conn, updateStruct);
                   if(checkList.size() <= 0){
                    // �X�V�������s�F�폜����Ă���f�[�^������܂��B�ŐV�̏����m�F���Ă�������
                    listMessage.add("M_CAL.CAL_NO:" + struct.getCAL_NO());
                    listMessage.add("M_CAL.CAL_DATE:" + updateStruct.getCAL_DATE());
              
                    setErrorMessage("AA00136", listMessage);
                    break;
                   }else{
                    AA0080020Struct workStruct = (AA0080020Struct)checkList.get(0);
                    if(workStruct.getMODIFY_COUNT().equals(updateStruct.getMODIFY_COUNT()) == false){
                     // �X�V�������s�F���̏����ɂ��f�[�^�������������Ă��܂�
                     listMessage.add("M_CAL.CAL_NO:" + struct.getCAL_NO());
                     listMessage.add("M_CAL.CAL_DATE:" + updateStruct.getCAL_DATE());
              
                     setErrorMessage("ZZ01105", listMessage);
                     break;
                    }
                   }
               
//                 ASP�V�t�g�}�X�^�̑��݃`�F�b�N
                   if(nowStruct.getASP_SHIFT_CD() != null && !nowStruct.getASP_SHIFT_CD().equals("")){
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,nowStruct)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + nowStruct.getASP_SHIFT_CD();
	        				setErrorMessage("AS00086", Message);
	        				break;
	        			}
                   }
        			
                   // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                   if(msgStruct.sizeError() <= 0){
	                    String upComment = (String)nowStruct.getCAL_COMMENT();
	                    Integer upHoliday = (Integer)nowStruct.getHOLIDAY_FLG();
	               
	                    // �R�����g�ɕύX�L��?
	                    boolean commentResult = false;
	                    if(upComment.equals(_emptyStr) == true){
	                     if(updateStruct.getCAL_COMMENT() != null &&
	                      _emptyStr.equals(updateStruct.getCAL_COMMENT()) != true)
	                      commentResult = true;	// �ύX�L��
	                    }else{
	                     if(updateStruct.getCAL_COMMENT() == null ||
	                      _emptyStr.equals(updateStruct.getCAL_COMMENT()) == true ||
	                      upComment.equals(updateStruct.getCAL_COMMENT()) == false)
	                      commentResult = true;	// �ύX�L��
	                    }
	                    
	                    // �x���ɕύX�L��?
	                    boolean holidayResult = false;
	                    if(upHoliday.intValue() != updateStruct.getHOLIDAY_FLG().intValue()){
	                     holidayResult = true;
	                     allHolidayResult = true;
	                    }
	               
	                    // �X�V����
	                    if(commentResult == true){
	                     struct.setCAL_DATE(updateStruct.getCAL_DATE());
	                     struct.setCAL_COMMENT(upComment);
	                     struct.setHOLIDAY_FLG(upHoliday);
	                     entity.mupdateM_CAL_all.update(conn, struct);	// �X�V
	                    }else if(holidayResult == true){
	                     struct.setCAL_DATE(updateStruct.getCAL_DATE());
	                     struct.setHOLIDAY_FLG(upHoliday);
	                     entity.mupdateM_CAL_holiday.update(conn, struct);	// �X�V
	                    }
	                    
	                    // SYSTEM_PARAMETER TIME_CTRL = False ���ɂ͓o�^�E�X�V���Ȃ�
	                    if(struct.geth_TIME_CTRL().equals("1")){
	                    	// ASP�J�����_�ɑ��݂��Ȃ��ꍇ ->> �o�^
	                    	//              ���݂���ꍇ   ->> �X�V
	                    	struct.setCAL_DATE(updateStruct.getCAL_DATE());
		                    struct.setASP_SHIFT_CD(nowStruct.getASP_SHIFT_CD());
	                    	if(entity.mcheckM_ASP_CALENDAR.check(conn,struct)){
//	                    		 ASP�J�����_�X�V
			                    entity.mupdateM_ASP_CALENDAR.update(conn, struct);
	                    	}else{
	                    		entity.minsertM_ASP_CALENDAR.create(conn,struct);
	                    	}
	                    }
                   }else{
                    break;
                   }
                  }
                  // �N�x�ʃJ�����_�ݒ�
                  if(msgStruct.sizeError() <= 0 && allHolidayResult == true){
                   makeYearDays(struct.getCAL_NO(), _targetYear);
                  }
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0){
                  // �R�~�b�g
                  conn.commit();
                  transFlg = false;
              
                  // �Ǎ�����
                  if(readParentData() == true)
                  {
                   bSuccess = true;
                  }
              
                 }else{
                  // ���[���o�b�N
                  conn.rollback();
                  transFlg = false;
                 }
              
                }catch(ParseException e){
                 // �ϊ����s
              
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ���[���o�b�N
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
              
                 // �G���[������ꍇ�́A�O��̏�Ԃɖ߂����߁Aservlet�Ŏ擾������Ԃ�ݒ�
                 if(bSuccess != true)
                 {
                  // �G���[������ꍇ�́Aservlet�Ŏ擾������Ԃ�ݒ�
                  list = _nowCalendarList;
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //----------------------------------------------------------------------
              
                _calendarList.clear();
                _keyStruct.clear();
                struct.clear();
                _targetMonth = _monthDefoult;
                _targetYear = null;
              
                // �f�t�H���g�J�����_�ԍ��ݒ�
                _keyStruct.setCAL_NO(new String("0"));
                struct.setCAL_NO("0");
              
                // ������Ԃ�������
                setReadStatus(INITIAL);
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                String Message = "";
              
                try{
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // �J�����_�w�b�_����
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // �쐬�������s�F�Y���̃J�����_�͍폜����Ă��܂�
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01016", Message);
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  Date firstDate = stringToDate(struct.getDATE_FROM(), _pattern1);
                  Date endDate = stringToDate(struct.getDATE_TO(), _pattern1);
              
                  // �J�����_�쐬�ς�FROM�`TO�擾
                  List calList = entity.mselectM_CAL_max_min.read(conn, struct);
                  if(calList.size() > 0){
                   AA0080020Struct workStruct = (AA0080020Struct)calList.get(0);
              
                   // �Ǎ����A����0���̏ꍇ
                   if(struct.getw_DATE_FROM().equals(_emptyStr) == true ||
                    struct.getw_DATE_TO().equals(_emptyStr) == true){
                    if(workStruct.getDATE_FROM() != null ||
                      workStruct.getDATE_TO() != null){
                     // �쐬�������s�F�f�[�^���쐬����Ă��܂��B�ŐV�̏����m�F���Ă�������
                     Message = "M_CAL.CAL_NO:" + struct.getCAL_NO();
                     
                     setErrorMessage("AA00134", Message);
                    }
                   }
                   // �Ǎ����A����0���ȏ�
                   else if(struct.getw_DATE_FROM().equals(workStruct.getDATE_FROM()) != true ||
                     struct.getw_DATE_TO().equals(workStruct.getDATE_TO()) != true){
                    // �쐬�������s�F�f�[�^���쐬����Ă��܂��B�ŐV�̏����m�F���Ă�������", struct.getsUser_ID());
                    Message = "M_CAL.CAL_NO:" + struct.getCAL_NO();
                    
                    setErrorMessage("AA00134", Message);
                   }
                  }
                  
                  // ���͂��ꂽ�V�t�g�R�[�h���`�F�b�N
                  AA0080020Struct wSt = new AA0080020Struct();
//				  ���j��
                  if(struct.gett_HOLIDAY_SUN() != null && !struct.gett_HOLIDAY_SUN().equals("")){
                	    wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_SUN());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_SUN();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                ���j��
                  if(struct.gett_HOLIDAY_MON() != null && !struct.gett_HOLIDAY_MON().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_MON());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_MON();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                �Ηj��
                  if(struct.gett_HOLIDAY_TUE() != null && !struct.gett_HOLIDAY_TUE().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_TUE());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_TUE();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                ���j��
                  if(struct.gett_HOLIDAY_WED() != null && !struct.gett_HOLIDAY_WED().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_WED());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_WED();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                �ؗj��
                  if(struct.gett_HOLIDAY_THU() != null && !struct.gett_HOLIDAY_THU().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_THU());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_THU();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                ���j��
                  if(struct.gett_HOLIDAY_FRI() != null && !struct.gett_HOLIDAY_FRI().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_FRI());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_FRI();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                �y�j��
                  if(struct.gett_HOLIDAY_SAT() != null && !struct.gett_HOLIDAY_SAT().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_SAT());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_SAT();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
                  
                  // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                  if(msgStruct.sizeError() <= 0){
                   Integer[] days = {struct.geth_HOLIDAY_SUN(),
                        struct.geth_HOLIDAY_MON(),
                        struct.geth_HOLIDAY_TUE(),
                        struct.geth_HOLIDAY_WED(),
                        struct.geth_HOLIDAY_THU(),
                        struct.geth_HOLIDAY_FRI(),
                        struct.geth_HOLIDAY_SAT()};
              
                   String[] ASP_SHIFT ={struct.gett_HOLIDAY_SUN(),
                		struct.gett_HOLIDAY_MON(),
                		struct.gett_HOLIDAY_TUE(),
                		struct.gett_HOLIDAY_WED(),
                		struct.gett_HOLIDAY_THU(),
                		struct.gett_HOLIDAY_FRI(),
                		struct.gett_HOLIDAY_SAT()};
                   
                   // �x���J�����_�擾
                   List holidayList = entity.mselectM_HOLIDAY.read(conn, struct);
              
                   // �J�����_�쐬�I���� + 1
                   _calendar.setTime(endDate);
                   _calendar.add(Calendar.DATE, 1);
                   Date d_toDate = _calendar.getTime();
              
                   // �J�����_�쐬�J�n��
                   _calendar.setTime(firstDate);
              
                   // �J�����_�쐬�J�n�N
                   List yearList = new ArrayList(0);
                   yearList.add(dateToString(firstDate, _pattern3));
              
                   // �J�n�j���擾
                   int i_week = _calendar.get(_calendar.DAY_OF_WEEK) - 1;
              
                   // �J�����_�쐬
                   while(d_toDate.getTime() != _calendar.getTime().getTime())
                   {
                    // �쐬���ݒ�
                    struct.setCAL_DATE(dateToString(_calendar.getTime(), _pattern1));
              
                    // �x���ݒ�
                    struct.setHOLIDAY_FLG(days[i_week]);
              
                    // �R�����g�N���A
                    struct.setCAL_COMMENT((String)null);
                
                    // �x���ꗗ����x���ݒ�
                    for(int i = 0; i < holidayList.size(); i++){
                     AA0080020Struct holidayStruct = (AA0080020Struct)holidayList.get(i);
                     if(holidayStruct.getHOLIDAY_DATE().equals(struct.getCAL_DATE()) == true){
                      struct.setHOLIDAY_FLG(_holidayOn);
                      struct.setCAL_COMMENT(holidayStruct.getHOLIDAY_NAME());
                     }
                    }
              
                    // �o�^
                    entity.minsertM_CAL.create(conn, struct);
                    
                    
//                  SYSTEM_PARAMETER TIME_CTRL = False ���ɂ͓o�^�E�X�V���Ȃ�
                    if(struct.geth_TIME_CTRL().equals("1")){
                    	 //ASP�V�t�g�J�����_�o�^(�x���̏ꍇ�̓V�t�g�R�[�h���Z�b�g���Ȃ��j
                        if(struct.getHOLIDAY_FLG().equals(_holidayOn)){
                        	struct.setASP_SHIFT_CD(null);
                        }else{
                        	struct.setASP_SHIFT_CD(ASP_SHIFT[i_week]);
                        }
                        entity.minsertM_ASP_CALENDAR.create(conn,struct);
                    }
                    
                    // �N�擾
                    String workYear = (struct.getCAL_DATE()).substring(0, 4);
                    if(workYear.equals((String)yearList.get(yearList.size()-1)) == false){
                     yearList.add(workYear);
                    }
              
                    // 1���i��
                    _calendar.add(Calendar.DATE, 1);
                
                    // �j��
                    if(i_week == 6) 
                     i_week = 0;
                    else 
                     i_week++;
                   }
              
                   // �N�x�ʃJ�����_�ݒ�
                   for(int i = 0; i < yearList.size(); i++)
                    makeYearDays(struct.getCAL_NO(), (String)yearList.get(i));
                  }
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0)
                 {
                  // �R�~�b�g
                  conn.commit();
                  transFlg = false;
                 }
                 else{
                  // ���[���o�b�N
                  conn.rollback();
                  transFlg = false;
                 }
              
                }catch(ParseException e){
                 // �ϊ����s
                 
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }catch(AlarmMessageException msg){
                 throw msg;
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ���[���o�b�N
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 // �g�����U�N�V�����J�n
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // �J�����_�w�b�_����
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // �x���Đݒ菈�����s�F�Y���̃J�����_�͍폜����Ă��܂�
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01016", Message);
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0){
                  Date firstDate = stringToDate(struct.getDATE_FROM(), _pattern1);
                  Date endDate = stringToDate(struct.getDATE_TO(), _pattern1);
              
                  // �J�����_�쐬�ς�FROM�`TO�擾
                  List calList = entity.mselectM_CAL_from_to.read(conn, struct);
                  if(calList.size() <= 0){
                   // �x���Đݒ菈�����s�F�폜����Ă���f�[�^������܂�
                   listMessage.add("M_CAL.CAL_NO:" + struct.getCAL_NO());
                   listMessage.add("M_CAL.DATE_FROM:" + struct.getDATE_FROM());
                   listMessage.add("M_CAL.DATE_TO:" + struct.getDATE_TO());
              
                   setErrorMessage("AA00136", listMessage);
                  }else{
                   // FROM�`TO�ݒ�
                   AA0080020Struct  workStruct = null;
                   workStruct = (AA0080020Struct)calList.get(0);
                   Date minDate = stringToDate(workStruct.getCAL_DATE(), _pattern1);
                   workStruct = (AA0080020Struct)calList.get(calList.size() -1);
                   Date maxDate = stringToDate(workStruct.getCAL_DATE(), _pattern1);
                   
                   if (maxDate.getTime() != endDate.getTime() ||
                    minDate.getTime() != firstDate.getTime()){
                    // �x���Đݒ菈�����s�F�쐬�ς݊��Ԃ͈͓̔��̓��t���w�肵�Ă�������
                    setErrorMessage("AA00135", "");
                   }
                  }
                  
//                ���͂��ꂽ�V�t�g�R�[�h���`�F�b�N
                  AA0080020Struct wSt = new AA0080020Struct();
//				  ���j��
                  if(struct.gett_HOLIDAY_SUN() != null && !struct.gett_HOLIDAY_SUN().equals("")){
                	    wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_SUN());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_SUN();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                ���j��
                  if(struct.gett_HOLIDAY_MON() != null && !struct.gett_HOLIDAY_MON().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_MON());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_MON();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                �Ηj��
                  if(struct.gett_HOLIDAY_TUE() != null && !struct.gett_HOLIDAY_TUE().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_TUE());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_TUE();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                ���j��
                  if(struct.gett_HOLIDAY_WED() != null && !struct.gett_HOLIDAY_WED().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_WED());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_WED();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                �ؗj��
                  if(struct.gett_HOLIDAY_THU() != null && !struct.gett_HOLIDAY_THU().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_THU());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_THU();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                ���j��
                  if(struct.gett_HOLIDAY_FRI() != null && !struct.gett_HOLIDAY_FRI().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_FRI());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_FRI();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                �y�j��
                  if(struct.gett_HOLIDAY_SAT() != null && !struct.gett_HOLIDAY_SAT().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_SAT());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_SAT();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
              
                  // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                  if(msgStruct.sizeError() <= 0){
                   Integer[] days = {struct.geth_HOLIDAY_SUN(),
                        struct.geth_HOLIDAY_MON(),
                        struct.geth_HOLIDAY_TUE(),
                        struct.geth_HOLIDAY_WED(),
                        struct.geth_HOLIDAY_THU(),
                        struct.geth_HOLIDAY_FRI(),
                        struct.geth_HOLIDAY_SAT()};
                   
                   String[] ASP_SHIFT ={struct.gett_HOLIDAY_SUN(),
                   		struct.gett_HOLIDAY_MON(),
                   		struct.gett_HOLIDAY_TUE(),
                   		struct.gett_HOLIDAY_WED(),
                   		struct.gett_HOLIDAY_THU(),
                   		struct.gett_HOLIDAY_FRI(),
                   		struct.gett_HOLIDAY_SAT()};
              
                   // �x���J�����_�擾
                   List holidayList = entity.mselectM_HOLIDAY.read(conn, struct);
              
                   // �J�����_�쐬�I���� + 1
                   _calendar.setTime(endDate);
                   _calendar.add(Calendar.DATE, 1);
                   Date d_toDate = _calendar.getTime();
              
                   // �J�����_�쐬�J�n��
                   _calendar.setTime(firstDate);
              
                   // �J�����_�쐬�J�n�N
                   List yearList = new ArrayList(0);
                   yearList.add(dateToString(firstDate, _pattern3));
              
                   // �J�n�j���擾
                   int i_week = _calendar.get(_calendar.DAY_OF_WEEK) - 1;
              
                   // �J�����_�쐬
                   for(int t = 0; t < calList.size(); t++){
                    // ���ݒ�
                    struct.setCAL_DATE(((AA0080020Struct)calList.get(t)).getCAL_DATE());
              
                    // �x���ݒ�
                    struct.setHOLIDAY_FLG(days[i_week]);
              
                    // �x���ꗗ����x���ݒ�
                    boolean comStatus = false;
                    for(int i = 0; i < holidayList.size(); i++){
                     AA0080020Struct holidayStruct = (AA0080020Struct)holidayList.get(i);
                     if(holidayStruct.getHOLIDAY_DATE().equals(struct.getCAL_DATE()) == true){
                      struct.setHOLIDAY_FLG(_holidayOn);
                      struct.setCAL_COMMENT(holidayStruct.getHOLIDAY_NAME());
                      comStatus = true;
                     }
                    }
              
                    // �X�V
                    if(comStatus == false)
                     entity.mupdateM_CAL_holiday.update(conn, struct);
                    else
                     entity.mupdateM_CAL_all.update(conn, struct);
                    
                    // SYSTEM_PARAMETER TIME_CTRL = False ���ɂ͓o�^�E�X�V���Ȃ�
                    if(struct.geth_TIME_CTRL().equals("1")){
	                    //ASP�V�t�g�J�����_�o�^(�x���̏ꍇ�̓V�t�g�R�[�h���Z�b�g���Ȃ��j
	                    if(struct.getHOLIDAY_FLG().equals(_holidayOn)){
	                    	struct.setASP_SHIFT_CD(null);
	                    }else{
	                    	struct.setASP_SHIFT_CD(ASP_SHIFT[i_week]);
	                    }
	                    entity.mupdateM_ASP_CALENDAR.update(conn,struct);
                    }
                    
                    // �N�擾
                    String workYear = (struct.getCAL_DATE()).substring(0, 4);
                    if(workYear.equals((String)yearList.get(yearList.size()-1)) == false){
                     yearList.add(workYear);
                    }
              
                    // 1���i��
                    _calendar.add(Calendar.DATE, 1);
                
                    // �j��
                    if(i_week == 6) 
                     i_week = 0;
                    else 
                     i_week++;
                   }
              
                   // �N�x�ʃJ�����_�ݒ�
                   for(int i = 0; i < yearList.size(); i++){
                    makeYearDays(struct.getCAL_NO(), (String)yearList.get(i));
              
                   }
                  }
                 }
              
                 // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
                 if(msgStruct.sizeError() <= 0){
                  // �R�~�b�g
                  conn.commit();
                  transFlg = false;
                 }
                 else{
                  // ���[���o�b�N
                  conn.rollback();
                  transFlg = false;
                 }
              
                }catch(ParseException e){
                 // �ϊ����s
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ���[���o�b�N
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
                //------------------------------------------------------------------
              
                // �L�[�R�s�[
                struct.copy(_keyStruct);
              
                // �ēǍ�����
                readParentData();
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              /*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
                try{
              */
                 // ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlSelect()���Ăяo��
                 if ( isScreenMove() == true ) {
                  // �����̃R���g���[�����\�b�h���Ăяo���܂��B
              //				controlSelect();
                 }
              
              /*			// �f�[�^�x�[�X�ւ̃A�N�Z�X���s���ꍇ�́A����try catch���̃R�����g���O���Ă��������B
                } catch(SQLException e) {
              //			e.printStackTrace();
                 // �G���[�������L�q���Ă��������B
                 // 
                }
              */
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // �_�E�����[�h�t�@�C�����N���A
                 // PDF�ECSV�̃_�E�����[�h���s���Ƃ��́A��ʏ��OrHidden�ŁuDOWNLOAD_FILE�v���`���A���̍s�̃R�����g���O���Ă��������B
              //			struct.setDOWNLOAD_FILE((String)null);
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                 // �R���{�{�b�N�X�f�[�^�p��
				// �j���ݒ�
				days = getDaysByLocale();
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("select") ) {
				controlselect();
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("change") ) {
				controlchange();
			} else if( button.equals("before") ) {
				controlbefore();
			} else if( button.equals("next") ) {
				controlnext();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //------------------------------------------------------------------
                 if(_targetMonth.equals(_monthDefoult) == false){
                  _keyStruct.setHEAD_DATE(
                    _targetMonth.substring(0,4) + "�N" + _brank + 
                    _targetMonth.substring(5) + "��");
                 }
                 else{
                  _keyStruct.setHEAD_DATE(_monthDefoult);
                 }
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 throw ee;
                //------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0080020Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
                 
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0080020-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0080020Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0080020-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0080020Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0080020-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0080020Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0080020Entity entity;
	protected AA0080020Struct struct;
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

		entity = new AA0080020Entity();
		struct = new AA0080020Struct();

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
	 * AA0080020�N���X�̕W���R���X�g���N�^
	 */
	public AA0080020Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                 
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
				AA0080020Struct key = (AA0080020Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CAL_DATE_WEEK") && key.getCAL_DATE_WEEK() != null) {
					msgKey.setKeyValue("CAL_DATE_WEEK", key.getCAL_DATE_WEEK());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_SUN") && key.geth_HOLIDAY_SUN() != null) {
					msgKey.setKeyValue("h_HOLIDAY_SUN", key.geth_HOLIDAY_SUN().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_MON") && key.geth_HOLIDAY_MON() != null) {
					msgKey.setKeyValue("h_HOLIDAY_MON", key.geth_HOLIDAY_MON().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_TUE") && key.geth_HOLIDAY_TUE() != null) {
					msgKey.setKeyValue("h_HOLIDAY_TUE", key.geth_HOLIDAY_TUE().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_WED") && key.geth_HOLIDAY_WED() != null) {
					msgKey.setKeyValue("h_HOLIDAY_WED", key.geth_HOLIDAY_WED().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_THU") && key.geth_HOLIDAY_THU() != null) {
					msgKey.setKeyValue("h_HOLIDAY_THU", key.geth_HOLIDAY_THU().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_FRI") && key.geth_HOLIDAY_FRI() != null) {
					msgKey.setKeyValue("h_HOLIDAY_FRI", key.geth_HOLIDAY_FRI().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_SAT") && key.geth_HOLIDAY_SAT() != null) {
					msgKey.setKeyValue("h_HOLIDAY_SAT", key.geth_HOLIDAY_SAT().toString());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("HEAD_DATE") && key.getHEAD_DATE() != null) {
					msgKey.setKeyValue("HEAD_DATE", key.getHEAD_DATE());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_FLG") && key.getc_HOLIDAY_FLG() != null) {
					msgKey.setKeyValue("c_HOLIDAY_FLG", key.getc_HOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_SUN") && key.getc_HOLIDAY_SUN() != null) {
					msgKey.setKeyValue("c_HOLIDAY_SUN", key.getc_HOLIDAY_SUN());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_MON") && key.getc_HOLIDAY_MON() != null) {
					msgKey.setKeyValue("c_HOLIDAY_MON", key.getc_HOLIDAY_MON());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_TUE") && key.getc_HOLIDAY_TUE() != null) {
					msgKey.setKeyValue("c_HOLIDAY_TUE", key.getc_HOLIDAY_TUE());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_WED") && key.getc_HOLIDAY_WED() != null) {
					msgKey.setKeyValue("c_HOLIDAY_WED", key.getc_HOLIDAY_WED());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_THU") && key.getc_HOLIDAY_THU() != null) {
					msgKey.setKeyValue("c_HOLIDAY_THU", key.getc_HOLIDAY_THU());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_FRI") && key.getc_HOLIDAY_FRI() != null) {
					msgKey.setKeyValue("c_HOLIDAY_FRI", key.getc_HOLIDAY_FRI());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_SAT") && key.getc_HOLIDAY_SAT() != null) {
					msgKey.setKeyValue("c_HOLIDAY_SAT", key.getc_HOLIDAY_SAT());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_SUN") && key.gett_HOLIDAY_SUN() != null) {
					msgKey.setKeyValue("t_HOLIDAY_SUN", key.gett_HOLIDAY_SUN());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_MON") && key.gett_HOLIDAY_MON() != null) {
					msgKey.setKeyValue("t_HOLIDAY_MON", key.gett_HOLIDAY_MON());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_TUE") && key.gett_HOLIDAY_TUE() != null) {
					msgKey.setKeyValue("t_HOLIDAY_TUE", key.gett_HOLIDAY_TUE());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_WED") && key.gett_HOLIDAY_WED() != null) {
					msgKey.setKeyValue("t_HOLIDAY_WED", key.gett_HOLIDAY_WED());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_THU") && key.gett_HOLIDAY_THU() != null) {
					msgKey.setKeyValue("t_HOLIDAY_THU", key.gett_HOLIDAY_THU());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_FRI") && key.gett_HOLIDAY_FRI() != null) {
					msgKey.setKeyValue("t_HOLIDAY_FRI", key.gett_HOLIDAY_FRI());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_SAT") && key.gett_HOLIDAY_SAT() != null) {
					msgKey.setKeyValue("t_HOLIDAY_SAT", key.gett_HOLIDAY_SAT());
				}
				if(msgKeyType.containsKeyColumn("h_TIME_CTRL") && key.geth_TIME_CTRL() != null) {
					msgKey.setKeyValue("h_TIME_CTRL", key.geth_TIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO());
				}
				if(msgKeyType.containsKeyColumn("CAL_DATE") && key.getCAL_DATE() != null) {
					msgKey.setKeyValue("CAL_DATE", key.getCAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("CAL_COMMENT") && key.getCAL_COMMENT() != null) {
					msgKey.setKeyValue("CAL_COMMENT", key.getCAL_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ASP_SHIFT_CD") && key.getASP_SHIFT_CD() != null) {
					msgKey.setKeyValue("ASP_SHIFT_CD", key.getASP_SHIFT_CD());
				}
				if(msgKeyType.containsKeyColumn("CAL_NAME") && key.getCAL_NAME() != null) {
					msgKey.setKeyValue("CAL_NAME", key.getCAL_NAME());
				}
				if(msgKeyType.containsKeyColumn("DATE_TO") && key.getDATE_TO() != null) {
					msgKey.setKeyValue("DATE_TO", key.getDATE_TO());
				}
				if(msgKeyType.containsKeyColumn("DATE_FROM") && key.getDATE_FROM() != null) {
					msgKey.setKeyValue("DATE_FROM", key.getDATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("CAL_YEAR") && key.getCAL_YEAR() != null) {
					msgKey.setKeyValue("CAL_YEAR", key.getCAL_YEAR());
				}
				if(msgKeyType.containsKeyColumn("CAL_YEAR_HOLIDAY") && key.getCAL_YEAR_HOLIDAY() != null) {
					msgKey.setKeyValue("CAL_YEAR_HOLIDAY", key.getCAL_YEAR_HOLIDAY());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_DATE") && key.getHOLIDAY_DATE() != null) {
					msgKey.setKeyValue("HOLIDAY_DATE", key.getHOLIDAY_DATE());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_NAME") && key.getHOLIDAY_NAME() != null) {
					msgKey.setKeyValue("HOLIDAY_NAME", key.getHOLIDAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("sysValue") && key.getsysValue() != null) {
					msgKey.setKeyValue("sysValue", key.getsysValue());
				}
				if(msgKeyType.containsKeyColumn("sysName") && key.getsysName() != null) {
					msgKey.setKeyValue("sysName", key.getsysName());
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
					AA0080020Struct key = new AA0080020Struct();
					if(msgKeyType.containsKeyColumn("CAL_DATE_WEEK")) {
						key.setCAL_DATE_WEEK(msgKey.getKeyValue("CAL_DATE_WEEK"));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_SUN")) {
						key.seth_HOLIDAY_SUN(new Integer(msgKey.getKeyValue("h_HOLIDAY_SUN")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_MON")) {
						key.seth_HOLIDAY_MON(new Integer(msgKey.getKeyValue("h_HOLIDAY_MON")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_TUE")) {
						key.seth_HOLIDAY_TUE(new Integer(msgKey.getKeyValue("h_HOLIDAY_TUE")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_WED")) {
						key.seth_HOLIDAY_WED(new Integer(msgKey.getKeyValue("h_HOLIDAY_WED")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_THU")) {
						key.seth_HOLIDAY_THU(new Integer(msgKey.getKeyValue("h_HOLIDAY_THU")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_FRI")) {
						key.seth_HOLIDAY_FRI(new Integer(msgKey.getKeyValue("h_HOLIDAY_FRI")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_SAT")) {
						key.seth_HOLIDAY_SAT(new Integer(msgKey.getKeyValue("h_HOLIDAY_SAT")));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("HEAD_DATE")) {
						key.setHEAD_DATE(msgKey.getKeyValue("HEAD_DATE"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_FLG")) {
						key.setc_HOLIDAY_FLG(msgKey.getKeyValue("c_HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_SUN")) {
						key.setc_HOLIDAY_SUN(msgKey.getKeyValue("c_HOLIDAY_SUN"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_MON")) {
						key.setc_HOLIDAY_MON(msgKey.getKeyValue("c_HOLIDAY_MON"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_TUE")) {
						key.setc_HOLIDAY_TUE(msgKey.getKeyValue("c_HOLIDAY_TUE"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_WED")) {
						key.setc_HOLIDAY_WED(msgKey.getKeyValue("c_HOLIDAY_WED"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_THU")) {
						key.setc_HOLIDAY_THU(msgKey.getKeyValue("c_HOLIDAY_THU"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_FRI")) {
						key.setc_HOLIDAY_FRI(msgKey.getKeyValue("c_HOLIDAY_FRI"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_SAT")) {
						key.setc_HOLIDAY_SAT(msgKey.getKeyValue("c_HOLIDAY_SAT"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_SUN")) {
						key.sett_HOLIDAY_SUN(msgKey.getKeyValue("t_HOLIDAY_SUN"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_MON")) {
						key.sett_HOLIDAY_MON(msgKey.getKeyValue("t_HOLIDAY_MON"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_TUE")) {
						key.sett_HOLIDAY_TUE(msgKey.getKeyValue("t_HOLIDAY_TUE"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_WED")) {
						key.sett_HOLIDAY_WED(msgKey.getKeyValue("t_HOLIDAY_WED"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_THU")) {
						key.sett_HOLIDAY_THU(msgKey.getKeyValue("t_HOLIDAY_THU"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_FRI")) {
						key.sett_HOLIDAY_FRI(msgKey.getKeyValue("t_HOLIDAY_FRI"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_SAT")) {
						key.sett_HOLIDAY_SAT(msgKey.getKeyValue("t_HOLIDAY_SAT"));
					}
					if(msgKeyType.containsKeyColumn("h_TIME_CTRL")) {
						key.seth_TIME_CTRL(msgKey.getKeyValue("h_TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(msgKey.getKeyValue("CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CAL_DATE")) {
						key.setCAL_DATE(msgKey.getKeyValue("CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(new Integer(msgKey.getKeyValue("HOLIDAY_FLG")));
					}
					if(msgKeyType.containsKeyColumn("CAL_COMMENT")) {
						key.setCAL_COMMENT(msgKey.getKeyValue("CAL_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ASP_SHIFT_CD")) {
						key.setASP_SHIFT_CD(msgKey.getKeyValue("ASP_SHIFT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NAME")) {
						key.setCAL_NAME(msgKey.getKeyValue("CAL_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DATE_TO")) {
						key.setDATE_TO(msgKey.getKeyValue("DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("DATE_FROM")) {
						key.setDATE_FROM(msgKey.getKeyValue("DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("CAL_YEAR")) {
						key.setCAL_YEAR(msgKey.getKeyValue("CAL_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("CAL_YEAR_HOLIDAY")) {
						key.setCAL_YEAR_HOLIDAY(msgKey.getKeyValue("CAL_YEAR_HOLIDAY"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_DATE")) {
						key.setHOLIDAY_DATE(msgKey.getKeyValue("HOLIDAY_DATE"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_NAME")) {
						key.setHOLIDAY_NAME(msgKey.getKeyValue("HOLIDAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sysValue")) {
						key.setsysValue(msgKey.getKeyValue("sysValue"));
					}
					if(msgKeyType.containsKeyColumn("sysName")) {
						key.setsysName(msgKey.getKeyValue("sysName"));
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
