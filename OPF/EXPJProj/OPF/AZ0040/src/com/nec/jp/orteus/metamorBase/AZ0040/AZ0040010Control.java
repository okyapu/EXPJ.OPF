/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0040/src/com/nec/jp/orteus/metamorBase/AZ0040/AZ0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0040;

import com.nec.jp.orteus.metamorBase.AZ0040.*;
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
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import java.util.ArrayList;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AZ0040010Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.18 $ $Date: 2017/01/09 08:54:38 $
 *
 */
//}}user_implement_code_header

public class AZ0040010Control
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
	public AZ0040010Struct getListvalue(int x) { return (AZ0040010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AZ0040010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AZ0040010Struct createStruct() { return new AZ0040010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AZ0040010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

               //------------------------------------------------------------------------------
              
               /** ���[�h */
               private String _mode = null;
              
               /** ���[�h�̎擾
                * @return ���[�h
               */
               public String getMode(){ return _mode; }
              
               /** ���[�h�̐ݒ�
                * @param mode ���[�h
               */
               public void setMode(String mode){ _mode = mode; }
              
               /** ��ʃ��[�h �������� */
               private final static String _SELECT = "select";
              
               /** ��ʃ��[�h ���������i�Ǎ����ʂ��O��) */
               private final static String _SELECT_WARNING = "select_war";
              
               /** ��ʃ��[�h ����/����ȊO�̏��� */
               private final static String _NORMAL = "normal";
              
               /** ��ʃ��[�h ���鏈�� */
               private final static String _CLOSE = "close";
              
               //------------------------------------------------------------------------------
               /** �N�G���[��񃊃X�g */
               private ArrayList _deployList = new ArrayList(0);
              
               /** �N�G���[��񃊃X�g�擾
                * @return �N�G���[��񃊃X�g
               */
               public ArrayList getDeployList(){ return _deployList; }
              
               //------------------------------------------------------------------------------
               /** SQL����̓N���X�ϐ��@*/
               private AZ0040SQLEdit w_sqle = null;
              
               //------------------------------------------------------------------------------
                
               /** SQLException���������肷��t���O
                * servlet�ŎQ�ƁA�N���A���s��
                * control�ł�reload���ɃN���A����
               */
               public boolean _sqlexception_flg = false;
              
               //------------------------------------------------------------------------------
               /** �e�[�u���I����ʂőI�����ꂽ�e�[�u������ێ�����
                * servlet�Őݒ�A�Q�Ƃ��s��
                * control��reload���ɃN���A����
               */
               public int _table_cnt = 0;
              
               //------------------------------------------------------------------------------
               /** SQL���ۑ��G���A�@*/
               private String Saved_Sql = null;
              
               /** �����ݒ��񃊃X�g */
               private AZ0040ColumnData w_cdata = null;
              
               /** �����ݒ��񃊃X�g�擾
                * @return �����ݒ��񃊃X�g
               */
               public AZ0040ColumnData getConditionList(){ return w_cdata; }
              
               /** �����ݒ��ʕ\���p�f�[�^���X�g */
               private ArrayList _ColumnList = new ArrayList(0);
              
               /** �����ݒ��ʕ\���p�f�[�^���X�g�擾
                * @return �����ݒ��ʕ\���p�f�[�^���X�g
               */
               public List getColumnList(){ return _ColumnList; }
              
               //------------------------------------------------------------------------------
              
               // �ǉ�/�X�V�Ώۂ̍\�����No
               private Integer _checkNo = null;
               
               /** �ǉ�/�X�V�Ώۂ̍\�����No�擾
                * @return �\�����No
               */
               public Integer getCheckNumber(){ return _checkNo; }
              
               /** �ǉ�/�X�V�Ώۂ̍\�����No�ݒ�
                * @param �ǉ�/�X�V�Ώۂ̍\�����No
               */
               public void setCheckNumber(Integer no){ _checkNo = no; }
              
              
               /** �q�ːe�ɉ�ʑJ�ڂ����ꍇ�̃L�[���ێ��ׂ̈�Struct */
               private AZ0040010Struct _keyStruct = new AZ0040010Struct();
              
               /** �L�[���Struct�̎擾 */
               public  AZ0040010Struct getKeyStruct(){ return _keyStruct; }
               
               /** �L�[���Struct�̐ݒ� */
               public void setKeyStruct(AZ0040010Struct struct){ _keyStruct.copy(struct); }
              
              
               /** �e�ˎq�ɉ�ʑJ�ڂ����ꍇ�̑I�����Struct **/
               private AZ0040010Struct _selStruct = new AZ0040010Struct();
              
               /** �I�����Struct�̎擾 */
               public  AZ0040010Struct getSelStruct(){ return _selStruct; }
              
               /** �I�����Struct�̐ݒ� */
               public void setSelStruct(AZ0040010Struct struct){ _selStruct.copy(struct); }
              
               //------------------------------------------------------------------------------
              
               /** ���ږ����X�g **/
               private List _l_QUERY_COLUMN = new ArrayList();
               /** ���ږ����X�g�̎擾 */
               public  List getsub2Name(){ return _l_QUERY_COLUMN; }
              
               /** ���ڃ^�C�v���X�g **/
               private List _l_QUERY_COLUMN_TYP = new ArrayList();
               /** ���ڃ^�C�v���X�g�̎擾 */
               public  List getsub2Type(){ return _l_QUERY_COLUMN_TYP; }
              
               /** �f�[�^���X�g **/
               private List _l_QUERY_DATA = new ArrayList();
               /** �f�[�^���X�g�̎擾 */
               public  List getsub2Data(){ return _l_QUERY_DATA; }
              
               private String	_w_DATA[];
              
               //------------------------------------------------------------------------------
                
               private ComboStruct _EDIT_TYP = new ComboStruct();
              
               /** �敪���ݒ�
                * @param �R���{�{�b�N�X�f�[�^
               */
               public void setEdit_Typ(ComboStruct combo){ _EDIT_TYP = combo; }
              
               /** �敪���擾
                * @return �敪���̃R���{�{�b�N�X�f�[�^
               */
               public ComboStruct getEdit_Typ(){ return _EDIT_TYP; }
              
               //------------------------------------------------------------------------------
              
               /** �e�[�u���ꗗ���X�g **/
               private ArrayList _l_TABLE_LIST = new ArrayList();
               /** �e�[�u���ꗗ���X�g�擾 **/
               public ArrayList getSub1Data(){ return _l_TABLE_LIST; }
              
               /** �e�[�u���ꗗ���X�g **/
               private ArrayList _l_TABLE_COM_LIST = new ArrayList();
               /** �e�[�u���ꗗ���X�g�擾 **/
               public ArrayList getSub1CommentData(){ return _l_TABLE_COM_LIST; }
              
               /** �I���e�[�u���ݒ� **/
               public void setColData(List tablList, List commentList)
               {
                w_cdata.Table_Names = tablList;
                w_cdata.Table_Name_Comments = commentList;
               }
              
               //-------------------------------------------------------------------------
               /**
                * ��ʌ����̃t���O�̕\����ݒ�
                * @param s �t���O�̒l���ݒ肳��Ă�����
                */
               private void setTypeValueAboutProcGroup(AZ0040010Struct s)
               {
                s.setEDIT_NAME(getTypeName(_EDIT_TYP,s.getEDIT_TYP()));
               }
                
               //-------------------------------------------------------------------------
               /**
                * �敪���擾
                * @param comboStruct �敪��񃊃X�g
                * @param intType �敪�R�[�h
                * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
                */
               private String getTypeName(ComboStruct comboStruct, String strTyp)
               {
                if(comboStruct == null || strTyp == null)  return null;
                String strTypName = strTyp;
                for(int i = 0; i < comboStruct.getValList().size(); i++){
                 if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true){
                  strTypName = (String)(comboStruct.getExplanList().get(i));
                  break;
                 }
                }
                if(strTypName == null) strTypName = strTyp;
                return strTypName;
               }
                
               //-------------------------------------------------------------------------
                
               /** �e�[�u�����A�J�������R�����g�擾�p�N���X **/
              
               /** DBInfo�N���X�̎擾 **/
               public AZ0040DBInfo getDBinfo(String tablename)
               {
                AZ0040DBInfo dbinfo = w_sqle.getDBUtil().getDBInfo(tablename);
              
                return dbinfo;
               }
              
               /** DBUtil�N���X�̎擾 **/
               public AZ0040DBUtil getDBUtil()
               {
                AZ0040DBUtil dbutil = w_sqle.getDBUtil();
              
                return dbutil;
               }
              
               /** �e�[�u���R�����g�̎擾 **/
               public String getDBUtilToTableComment(String tablename)
               {
                String tablecomment = w_sqle.getDBUtil().getTableComment(tablename);
                return tablecomment;
               }
               
               /** �J�����R�����g�̎擾 **/
               public String getDBUtilToColumnComment(String tablename, String column)
               {
                String columncomment = w_sqle.getDBUtil().getColumnComment(tablename, column);
                return columncomment;
               }
              
               //------------------------------------------------------------------------------
              
               private AZ0040ModeCheck modeCheck = new AZ0040ModeCheck();
               public boolean canReference(){ return modeCheck.canReference(); }
               public boolean isInsert(){ return modeCheck.isInsert(); }
               public boolean isUpdate(){ return modeCheck.isUpdate(); }
               public boolean isCopy(){ return modeCheck.isCopy(); }
               public boolean isFree(){ return modeCheck.isFree(); }
               public boolean isNew(){ return modeCheck.isNew(); }
              
               public boolean cansub1SelectItem(){ return modeCheck.isnotREF(); }
               public boolean cansub2Condition(){ return modeCheck.isGUI(); }
               public boolean cansub2InputTitle(){ return modeCheck.isnotREF(); }
               public boolean canSub7Insert(){ return modeCheck.isInsert(); }
               public boolean canSub7Copy(){ return modeCheck.isCopy(); }
               public boolean canSub7Update(){ return modeCheck.isUpdate(); }
              
               //--------------------------------------------------------------------------
               // �e��ʂɑJ�ڂ���O�Ɏ��s���郁�\�b�h�Q
               /**
                * �w�肵��SQL���Ō������s�B
                * ��ʗp�̏��ɃZ�b�g����B
                */
               private void getDatafromSQL(String i_sql) throws FoundationException, SQLException
               {
                String Message = "";
              
                // �N���A����
                _l_QUERY_COLUMN.clear();
                _l_QUERY_COLUMN_TYP.clear();
                _l_QUERY_DATA.clear();
             
                // ��ʌ����i�ꗗ�\�����������e�i���X�j��SQL���擾��������
                i_sql = "SELECT * FROM(" + i_sql + "\n" +
                        ") WHERE ROWNUM <= NVL((SELECT MAX_DISPLAY_ROWNUM FROM SYS_SCREEN_PARM WHERE SERVLET_CD = 'AZ0040010' AND DISPLAY_CD = 50) , 1000) + 1";
                
                //�ėp�f�[�^�����N���X����
                AZ0040DBData azDBData = new AZ0040DBData(conn, i_sql);
                boolean bret = azDBData.load();
              
                if (bret == false) {
                 Message = "SQL:" + i_sql;
                 setErrorMessageNoKey("AZ00014", Message);
                 return;
                }
                //�\���ő�s����������
                ScreenParam sp = new ScreenParam(this.getClass());
                int maxLine = sp.getMaxLine(conn,50);
              
                //�f�[�^�̎擾
                _l_QUERY_DATA = (List)azDBData.getData();
              
                // �������ʂ��\���ő�s���𒴂���
                if (maxLine != 0 && _l_QUERY_DATA.size() > maxLine) {
                 _l_QUERY_DATA.clear();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
                 msgStruct.addError( emsg );
                 sysLog.warning(emsg, getsysUSER_CD());
                 return;
                }
              
                // �������ʂ��O��
                if(_l_QUERY_DATA.size() <= 0){
                 Message = "SQL:" + i_sql;
                 setErrorMessageNoKey("ZZ06001", Message);
                 return;
                }
              
                //�J��������SQL�^�擾
                _l_QUERY_COLUMN_TYP = azDBData.getColTypes();
              
                // �t���[���͂̏ꍇ�̓J���������擾
                if(isFree()){
                 _l_QUERY_COLUMN = azDBData.getColNames();
                } else {
                 // �J���������擾
                 List w_columnInfos = new ArrayList();
                 w_columnInfos = w_cdata.getColumnInfos();
              
                 for(Iterator itr = w_columnInfos.iterator();itr.hasNext();) {
                  AZ0040ColumnInfo w_info = (AZ0040ColumnInfo)itr.next();
                  if(w_info.Display_Flg)
                   _l_QUERY_COLUMN.add(w_info.Column_Name_Comment);
                 }
                }
               }
              
               /**
                * AZ0040ColumnData������SQL���𐶐�����
                */
               private void makeSQLfromCData(int mode) throws SQLException
               {
                // SQL���̐���
                AZ0040SQLCreate w_create = new AZ0040SQLCreate(sysLog, getsysUSER_CD());
                w_create.Create(conn, (AZ0040ColumnData)w_cdata, mode);
                Saved_Sql = w_create.getSQL();
               }
              
               //------------------------------------------------------------------------------
              
               /**
                * �e�[�u���I����ʂɑJ�ڂ���Ƃ��̏���
                */
               private void preSetSelectTable() throws SQLException
               {
                String Message = "";
                
                // hiddenList���N���A
                struct.clearList();
              
                // �s�ǉ�(�f�t�h)�̏ꍇ�͉������Ȃ�
                if(isInsert()) {
                 return;
                }
              
                // SQL����ۑ����Ă��Ȃ��ꍇ�� ���߂Ă̏����ݒ�B
                // �ꗗ���X�g����Y����SQL���擾�� ���
                if(Saved_Sql == null){
                 // �I�����ꂽSQL
                 String strsql;
              
                 // �I�����̐ݒ�
                 setSelStruct((AZ0040010Struct)_deployList.get(getCheckNumber().intValue()));
                 // �I�����ꂽSQL�̎擾
                 strsql = (String)(_selStruct.getSQL_INFO());
                 // SQL��ۑ��G���A�ɑޔ�
                 Saved_Sql = strsql;
              
                 if((strsql == null)||("".equals(strsql))){
                  //SQL���I������Ă��Ȃ�
                  Message = "SQL:" + strsql;
                  setErrorMessageNoKey("AZ00011", Message);
                  return;
                 }
              
                 // �擾����SQL���̕���
                 if(w_sqle == null){
                  w_sqle = new AZ0040SQLEdit(sysLog, getsysUSER_CD());
              
                  if(w_sqle.Analize(conn, strsql)){
                   // �������ꂽSQL�f�[�^�e�[�u���̎擾
                   w_cdata = w_sqle.getColumnData();
                   // �������ꂽSQL�f�[�^�e�[�u�������ʕ\���p�f�[�^�ւ̕ϊ�
                  } else {
                   // SQL��̓G���[
                   Message = "SQL:" + strsql;
                   setErrorMessageNoKey("AZ00011", Message);
                   return;
                  }
                 }
                }
              
                struct.setList_h_TABLE_COMMENT_TO(w_cdata.getTableComments());
                struct.setList_h_TABLE_TO(w_cdata.getTableNames());
              
                return;
               }
              
              
               /**
                * ���������ݒ��ʂ���J�ڂ���Ƃ��̏���
                */
               private void postSetJoin() throws SQLException
               {
                if(w_sqle == null){
                 return;
                }
              
                // ����������ʂ̏���ColumnData���č\�z����
                if(!w_sqle.setJoinInfo(struct.getList_h_LEFT_TABLE_NAME(),
                        struct.getList_h_LEFT_TABLE_ALIAS(),
                        struct.getList_h_LEFT_COLUMN(),
                        struct.getList_h_RIGHT_TABLE_NAME(),
                        struct.getList_h_RIGHT_TABLE_ALIAS(),
                        struct.getList_h_RIGHT_COLUMN(),
                        struct.getList_h_CONDITION()))
                return;
               }
              
              
               /**
                * ���ڑI����ʂɑJ�ڂ���Ƃ��̏���
                */
               private void preSetSelectItem() throws SQLException
               {
                // �e�[�u���R�����g�A�J�����R�����g�A�J����������ݒ肷��
                int infosize = w_cdata.Column_infos.size();
              
                List l_col = new ArrayList(infosize);
                List l_alias = new ArrayList(infosize);
                List l_name = new ArrayList(infosize);
              
                for(int cnt=0; cnt<infosize; cnt++)
                {
                 AZ0040ColumnInfo col_info = (AZ0040ColumnInfo)w_cdata.Column_infos.get(cnt);
                 l_col.add(col_info.getColumn_Name());
                 l_alias.add(col_info.getTable_Name_Alias());
                 l_name.add(col_info.getTable_Name());
                }
                struct.setList_h_COLUMN(l_col);
                struct.setList_h_TABLE_ALIAS(l_alias);
                struct.setList_h_TABLE_NAME(l_name);
              
               }
              
              
               /**
                * ���ڑI����ʂ���J�ڂ���Ƃ��̏���
                */
               private void postSetSelectItem() throws SQLException
               {
                // ���̓f�[�^�̎�荞��
                w_sqle.renewColumnInfos(struct.getList_h_TABLE_NAME(),
                      struct.getList_h_TABLE_ALIAS(),
                      struct.getList_h_COLUMN());
               }
              
              
               /**
                * ���������ݒ��ʂɑJ�ڂ���Ƃ��̏���
                */
               private void preSetCondition() throws SQLException
               {
                String Message = "";
                
                // �s�ǉ�(GUI)�ȊO�͑I�����ꂽ�N�G�������Ɍ��������𐶐�
                if(!isNew()){
                 // SQL����ۑ����Ă��Ȃ��ꍇ�� ���߂Ă̏����ݒ�B
                 // �ꗗ���X�g����Y����SQL���擾�� ���
                 if(Saved_Sql == null){
                  // �I�����ꂽSQL
                  String strsql;
              
                  // �I�����̐ݒ�
                  setSelStruct((AZ0040010Struct)_deployList.get(getCheckNumber().intValue()));
                  // �I�����ꂽSQL�̎擾
                  strsql = (String)(_selStruct.getSQL_INFO());
                  // SQL��ۑ��G���A�ɑޔ�
                  Saved_Sql = strsql;
              
                  if((strsql == null)||("".equals(strsql))){
                   //SQL���I������Ă��Ȃ�
                   Message = "SQL:" + strsql;
                   setErrorMessageNoKey("AZ00011", Message);
                   
                   return;
                  }
              
                  // �擾����SQL���̕���
                  if(w_sqle == null){
                   w_sqle = new AZ0040SQLEdit(sysLog, getsysUSER_CD());
              
                   if(w_sqle.Analize(conn, strsql)){
                    // �������ꂽSQL�f�[�^�e�[�u���̎擾
                    w_cdata = w_sqle.getColumnData();
                    // �������ꂽSQL�f�[�^�e�[�u�������ʕ\���p�f�[�^�ւ̕ϊ�
                   } else {
                    // SQL��̓G���[
                    Message = "SQL:" + strsql;
                    setErrorMessageNoKey("AZ00011", Message);
                    return;
                   }
                  }
                 }
                }
              
                // ColumnInfo -> �����ݒ��ʕ\���p�f�[�^�ϊ�
                _ColumnList.clear();
                List list = w_cdata.getColumnInfos();
              
                for(int cnt = 0; cnt < list.size(); cnt++)
                { 
                 AZ0040010Struct w_struct = new AZ0040010Struct();
                 w_struct.importColumnInfo((AZ0040ColumnInfo)list.get(cnt));
                 _ColumnList.add(w_struct);
                }
              
                return;
               }
              
               /** �����ݒ��ʕ\���p�f�[�^ -> ColumnInfo�ϊ�
                *  ���������ݒ��ʂ���J�ڂ���Ƃ��̏���
               */
               private void postSetCondition(){
                List list = w_cdata.getColumnInfos();
                AZ0040010Struct w_struct = null;
              
                for(int cnt = 0; cnt < list.size(); cnt++)
                { 
                 w_struct = (AZ0040010Struct)_ColumnList.get(cnt);
                 w_struct.exportColumnInfo((AZ0040ColumnInfo)list.get(cnt));
                }
               }
              
               /**
                * �N�G���ꗗ��ʂɑJ�ڂ���Ƃ��̏���
                * �e�����ϐ��̃N���A���N�G���ꗗ�ēǍ�
                */
               private void preQueryList() throws BusinessProcessException, FoundationException, SQLException
               {
                Saved_Sql = null;
                _l_QUERY_COLUMN.clear();
                _l_QUERY_COLUMN_TYP.clear();
                _l_QUERY_DATA.clear();
                _ColumnList.clear();
                struct.clear();
                struct.copy(_keyStruct);
                controlselect();
                _selStruct.clear();
                w_sqle = null;
                w_cdata = null;
                modeCheck.initialize();
              
                return;
               }
              
              
               //------------------------------------------------------------------------------
               /** ��ʋ��ʒ�`�擾�N���X */
               ScreenParam _scParam = sp;
              
               //------------------------------------------------------------------------------
              
               /**
                * ���b�Z�[�W�擾 
                * @@return ���b�Z�[�W
                */
               public MessageStruct getMessage()
               {
                return msgStruct;
               }
              
               /**
                * ���b�Z�[�W�ݒ�
                * @@param ���b�Z�[�W
                */
               public void setMessage(MessageStruct msg)
               {
                msgStruct = msg;
               }
              
               //------------------------------------------------------------------------------
              
               /** ���o���� **/
               ComboStruct _sub1COND_TYPE = new ComboStruct();
              
               /** ���o�����ݒ�
                * @param �R���{�{�b�N�X�f�[�^
               */
               public void setsub1COND_TYPE(ComboStruct combo){ _sub1COND_TYPE = combo; }
              
               /** ���o�����擾
                * @return ���o�����̃R���{�{�b�N�X�f�[�^
               */
               public ComboStruct getsub1COND_TYPE(){ return _sub1COND_TYPE; }
              
               /** ���ёւ� **/
               ComboStruct _sub1SORT_TYPE = new ComboStruct();
              
               /** ���ёւ��ݒ�
                * @param �R���{�{�b�N�X�f�[�^
               */
               public void setsub1SORT_TYPE(ComboStruct combo){ _sub1SORT_TYPE = combo; }
              
               /** ���ёւ��擾
                * @return ���ёւ��̃R���{�{�b�N�X�f�[�^
               */
               public ComboStruct getsub1SORT_TYPE(){ return _sub1SORT_TYPE; }
              
               //------------------------------------------------------------------------------
              
               private List csvList = null;
               public List getCsvList(){ return this.csvList; }
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
                * SQLException�G���[���b�Z�[�W�ݒ�
                * @param �o�̓G���[���b�Z�[�W
                */
               private void setSqlExceptionMsg(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
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
                * �G���[���b�Z�[�W�ݒ�
                * @param ���O�o�̓��b�Z�[�W
                */
               private void setErrorLogMessage(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                sysLog.warning(emsg, getsysUSER_CD());
               }
                
               /**
                * �G���[���b�Z�[�W�ݒ�(�L�[�o�͂Ȃ�)
                * @param ���b�Z�[�W�ԍ�
                * @param �o�̓��b�Z�[�W
                */
               private void setErrorMessageNoKey(String messageno, String message)
               {
                ExpjMessage emsg = new ExpjMessage( messageno );
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
                emsg = new ExpjMessage( "ZZ01006", message );
                sysLog.warning(emsg, getsysUSER_CD());
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
                * �x�����b�Z�[�W�ݒ�
                * @param �o�̓��b�Z�[�W
                */
               private void setWarnMessage(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                msgStruct.addWarn( emsg );
                sysLog.info(emsg, getsysUSER_CD());
               }
              
               /**
                * �x�����b�Z�[�W�ݒ�
                * @param ���O�o�̓��b�Z�[�W
                */
               private void setWarnLogMessage(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
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
              
               /**
                * ��񃁃b�Z�[�W�ݒ�
                * @param �o�̓��b�Z�[�W
                */
               private void setInfoMessage(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                msgStruct.addInfo( emsg );
                sysLog.config(emsg, getsysUSER_CD());
               }
                
               /**
                * ��񃁃b�Z�[�W�ݒ�
                * @param ���O�o�̓��b�Z�[�W
                */
               private void setInfoLogMessage(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                sysLog.config(emsg, getsysUSER_CD());
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

                             String Message = "";
                             List listMessage = new ArrayList();
                           
                             try {
                              _deployList.clear();
                              // ���[�h�ݒ�
                              _mode = _NORMAL;
                           
                              // ���[�U�R�[�h�ݒ�
                              struct.setw_USER_CD(getsysUSER_CD());
                           
                              // �Ǎ��{�^������
                              list = entity.mT_QUERY_INFO.read(conn, struct);
                           
                              // ���׃��X�g�\�������݂��邩?
                              if(list.size() > 0){
                           
                               // �\���ő�s����������
                               ScreenParam sp = new ScreenParam(this.getClass());
                               int maxLine = sp.getMaxLine(conn,10);
                           
                               if(maxLine != 0 && list.size() > maxLine){
                                list.clear();
                           
                                ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.QUERY_NAME:" + struct.getw_QUERY_NAME() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.QUERY_GROUP:" + struct.getw_QUERY_GROUP() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.MEMO:" + struct.getw_MEMO() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.CREATED_BY:" + struct.getw_CREATED_BY() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.CREATED_DATE[FROM]:" + struct.getw_CREATED_DATE_FROM() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.CREATED_DATE[TO]:" + struct.getw_CREATED_DATE_TO() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                
                                // ���[�h�ݒ�
                                _mode = _NORMAL;
                               } else {
                            
                                for(int i=0; i<list.size(); i++)
                                {
                                 // �R���{�{�b�N�X�̃f�[�^�ݒ�
                                 setTypeValueAboutProcGroup((AZ0040010Struct)(list.get(i)));
                                }
                                
                                _deployList =(ArrayList)list;
                                // ���[�h�ݒ�
                                _mode = _SELECT;
                               }
                              } else {
                               //�Ώۃf�[�^���Ȃ�
                               listMessage.add("T_QUERY_INFO.QUERY_NAME:" + struct.getw_QUERY_NAME());
                               listMessage.add("T_QUERY_INFO.QUERY_GROUP:" + struct.getw_QUERY_GROUP());
                               listMessage.add("T_QUERY_INFO.MEMO:" + struct.getw_MEMO());
                               listMessage.add("T_QUERY_INFO.CREATED_BY:" + struct.getw_CREATED_BY());
                               listMessage.add("T_QUERY_INFO.CREATED_DATE[FROM]:" + struct.getw_CREATED_DATE_FROM());
                               listMessage.add("T_QUERY_INFO.CREATED_DATE[TO]:" + struct.getw_CREATED_DATE_TO());
                               setErrorMessage("ZZ06001", listMessage);
                               // ���[�h�ݒ�
                               _mode = _SELECT_WARNING;
                              }
                           
                             } catch(SQLException e) {
                              e.printStackTrace();
                              // ���[�h�ݒ�
                              _mode = _NORMAL;
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlselect>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                             //------------------------------------------------------------------
                             // ������
                             _keyStruct = new AZ0040010Struct();
                             struct.initialize();
                             Saved_Sql = null;
                           
                             _deployList.clear();
                           
                             // ���[�h�ݒ�
                             _mode = _NORMAL;
                           
                //}}user_implement_dev:<controlclear>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                             //------------------------------------------------------------------
                             // �N���A����
                             controlclear();
                           
                             // ���[�h�ݒ�
                             _mode = _CLOSE;
                           
                //}}user_implement_dev:<controlclose>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1clear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1clear");
			//{{user_implement_dev:<controlsub1clear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                             try{
                              preSetCondition();
                             } catch(SQLException e) {
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub1clear>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1clear");

		return;
	}

	/**
	 * �b�r�u�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub2csv() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2csv");
			//{{user_implement_dev:<controlsub2csv>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                             //------------------------------------------------------------------
                             try {
                              csvList = new ArrayList();
                           
                              // 0���̏ꍇ�I��
                              if(_l_QUERY_DATA.size() <= 0) return;
                           
                              String title [] = new String[_l_QUERY_COLUMN.size()];
                           
                              for(int i=0; i<_l_QUERY_COLUMN.size(); i++)
                              {
                               title[i] = (String)_l_QUERY_COLUMN.get(i);
                              }
                           
                              csvList.add(title);
                              for(int i=0;i<_l_QUERY_DATA.size();i++){
                               String csvStr [] = new String[_l_QUERY_COLUMN.size()];
                               String val [] = (String[])_l_QUERY_DATA.get(i);
                               
                               for(int j=0; j<_l_QUERY_COLUMN.size(); j++)
                               {
                                csvStr[j] = val[j];
                               }
                           
                               csvList.add(csvStr);
                              }
                              setInfoLogMessage("CSV data was created");
                           
                             }catch(Exception e){
                              ExpjMessage msg = new ExpjMessage( "ZZ01006", "CSV output failure" );
                              sysLog.warning(msg, getsysUSER_CD());
                           
                              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                              sysLog.severe(emsg, getsysUSER_CD());
                              ExpjException ee = new ExpjException(e, emsg);
                           
                              throw ee;
                             }
                //}}user_implement_dev:<controlsub2csv>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2csv");

		return;
	}

	/**
	 * �������s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                             //------------------------------------------------------------------
                             String Message = "";
                           
                             try{
                           
                              //�I�����̐ݒ�
                              setSelStruct((AZ0040010Struct)_deployList.get(getCheckNumber().intValue()));
                           
                              //��ʑI��SQL�̎擾
                              Saved_Sql = (String)(_selStruct.getSQL_INFO());	//�I���ʒu��SQL�擾
                           
                              // �I���N�G���̓��̓��[�h�`�F�b�N
                              if(_selStruct.getEDIT_TYP().equals(String.valueOf(AZ0040Const.C_INPUT_FREE))){
                               // ���̓��[�h���t���[�ɐݒ�
                               modeCheck.setInputMode(AZ0040Const.C_INPUT_FREE);
                              }
                           
                              // �I�����ꂽ�N�G���̃`�F�b�N(�t���[���̓`�F�b�N���g�p)
                              if(AZ0040Common.checkFreeSqlStr(Saved_Sql)){
                               if(!isFree()) {
                                if(w_sqle == null){
                                 w_sqle = new AZ0040SQLEdit(sysLog, getsysUSER_CD());
                                 // SQL���̕���
                                 if(!w_sqle.Analize(conn, Saved_Sql)){
                                  // SQL��̓G���[
                                  Message = "SQL:" + Saved_Sql;
                                  setErrorMessageNoKey("AZ00011", Message);
                                  return;
                                 }
                                 // �������ꂽSQL�f�[�^�e�[�u���̎擾
                                 w_cdata = w_sqle.getColumnData();
                           
                                 //�r�p�k���̐���
                                 makeSQLfromCData(AZ0040SQLCreate.C_DISPLAY);
                                }
                               }
                               // �������ʕ\���p�f�[�^�擾
                               getDatafromSQL(Saved_Sql);
                              } else {
                               preQueryList();
                               // ��ʑJ�ڂ��Ȃ�
                               _sqlexception_flg = true;
                               // ���̓f�[�^�s��
                               Message = "SQL:" + Saved_Sql;
                               setErrorMessageNoKey("AZ00035", Message);
                               return;
                              }
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }

                //}}user_implement_dev:<controlexecute>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * ���������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcondition() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlcondition");
			//{{user_implement_dev:<controlcondition>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                             //------------------------------------------------------------------
                             try{
                              preSetCondition();
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                           
                             }

                //}}user_implement_dev:<controlcondition>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlcondition");

		return;
	}

	/**
	 * �������s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1execute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1execute");
			//{{user_implement_dev:<controlsub1execute>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                             try{
                              // ���̓f�[�^�̎�荞�݂�SQL���̐���
                              postSetCondition();
                              makeSQLfromCData(AZ0040SQLCreate.C_DISPLAY);
                           
                              // �������ʕ\���p�f�[�^�擾
                              getDatafromSQL(Saved_Sql);
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }

                //}}user_implement_dev:<controlsub1execute>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1execute");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1return");
			//{{user_implement_dev:<controlsub1return>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                             try{
                              preQueryList();
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub1return>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1return");

		return;
	}

	/**
	 * ���������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub2condition() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2condition");
			//{{user_implement_dev:<controlsub2condition>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                             try{
                              preSetCondition();
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub2condition>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2condition");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub2return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2return");
			//{{user_implement_dev:<controlsub2return>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                             try{
                              preQueryList();
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub2return>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2return");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                              //------------------------------------------------------------------
                              try{
                               
                               // �N���A����
                               controlclear();
                               
                               // ���[�h�ݒ�
                               _mode = _NORMAL;
                            
                               // SQL��O����t���O�N���A
                               _sqlexception_flg = false;
                            
                               // �I���e�[�u�����N���A
                               _table_cnt = 0;
                            
                               // �R���{�{�b�N�X�f�[�^�p��
                               ComboBox controller
                                    = new ComboBox(conn, sysUSER_CD);
                            
                               _sub1COND_TYPE = controller.getData("COND_TYP");
                               _sub1SORT_TYPE = controller.getData("SORT_TYP");
                            
                               // �敪���擾
                               _EDIT_TYP = controller.getData("EDIT_TYP");
                            
                               // ���샂�[�h������
                               modeCheck.initialize();
                            
                               // �����ݒ��񃊃X�g������
                               w_cdata = new AZ0040ColumnData();
                            
                               // �e�[�u���ꗗ���X�g
                               _l_TABLE_LIST = AZ0040Common.GetUsefulTable(conn);
                            
                               // �I���e�[�u���R�����g�擾
                               AZ0040DBUtil dbutil = new AZ0040DBUtil();
                               _l_TABLE_COM_LIST = dbutil.getTableComments(conn, _l_TABLE_LIST);
                            
                              } catch(SQLException e) {
                               // �G���[�������L�q���Ă��������B
                               setSqlExceptionMsg(e);
                            
                              }catch(ComboException e){
                               // �G���[���b�Z�[�W�쐬
                               ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                               sysLog.severe(emsg, getsysUSER_CD());
                               ExpjException ee = new ExpjException(e, emsg);
                               
                               throw ee;
                              }

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("sub1clear") ) {
				controlsub1clear();
			} else if( button.equals("sub2csv") ) {
				controlsub2csv();
			} else if( button.equals("execute") ) {
				controlexecute();
			} else if( button.equals("condition") ) {
				controlcondition();
			} else if( button.equals("sub1execute") ) {
				controlsub1execute();
			} else if( button.equals("sub1return") ) {
				controlsub1return();
			} else if( button.equals("sub2condition") ) {
				controlsub2condition();
			} else if( button.equals("sub2return") ) {
				controlsub2return();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                              //------------------------------------------------------------------
                               //�R���{�{�b�N�X�Ɏ擾�f�[�^�ݒ�
                               struct.setList_sub1COND_TYPE_val(_sub1COND_TYPE.getValList());
                               struct.setList_sub1COND_TYPE_name(_sub1COND_TYPE.getExplanList());
                               struct.setList_sub1SORT_TYPE_val(_sub1SORT_TYPE.getValList());
                               struct.setList_sub1SORT_TYPE_name(_sub1SORT_TYPE.getExplanList());
                            
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
//			throw new FoundationException("AZ0040010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0040010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AZ0040010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0040010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AZ0040010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0040010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AZ0040010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AZ0040010Entity entity;
	protected AZ0040010Struct struct;
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

		entity = new AZ0040010Entity();
		struct = new AZ0040010Struct();

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
	 * AZ0040010�N���X�̕W���R���X�g���N�^
	 */
	public AZ0040010Control() throws BusinessProcessException, FoundationException
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
				AZ0040010Struct key = (AZ0040010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("sub1COLUMN_TYPE") && key.getsub1COLUMN_TYPE() != null) {
					msgKey.setKeyValue("sub1COLUMN_TYPE", key.getsub1COLUMN_TYPE());
				}
				if(msgKeyType.containsKeyColumn("sub1COND_TYPE") && key.getsub1COND_TYPE() != null) {
					msgKey.setKeyValue("sub1COND_TYPE", key.getsub1COND_TYPE());
				}
				if(msgKeyType.containsKeyColumn("sub1COND_TYPE_name") && key.getsub1COND_TYPE_name() != null) {
					msgKey.setKeyValue("sub1COND_TYPE_name", key.getsub1COND_TYPE_name());
				}
				if(msgKeyType.containsKeyColumn("sub1COND_TYPE_val") && key.getsub1COND_TYPE_val() != null) {
					msgKey.setKeyValue("sub1COND_TYPE_val", key.getsub1COND_TYPE_val());
				}
				if(msgKeyType.containsKeyColumn("sub1COND_VALUE1") && key.getsub1COND_VALUE1() != null) {
					msgKey.setKeyValue("sub1COND_VALUE1", key.getsub1COND_VALUE1());
				}
				if(msgKeyType.containsKeyColumn("sub1COND_VALUE2") && key.getsub1COND_VALUE2() != null) {
					msgKey.setKeyValue("sub1COND_VALUE2", key.getsub1COND_VALUE2());
				}
				if(msgKeyType.containsKeyColumn("sub1DISPLAY_FLG") && key.getsub1DISPLAY_FLG() != null) {
					msgKey.setKeyValue("sub1DISPLAY_FLG", key.getsub1DISPLAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("sub1SORT_TYPE") && key.getsub1SORT_TYPE() != null) {
					msgKey.setKeyValue("sub1SORT_TYPE", key.getsub1SORT_TYPE());
				}
				if(msgKeyType.containsKeyColumn("sub1SORT_TYPE_name") && key.getsub1SORT_TYPE_name() != null) {
					msgKey.setKeyValue("sub1SORT_TYPE_name", key.getsub1SORT_TYPE_name());
				}
				if(msgKeyType.containsKeyColumn("sub1SORT_TYPE_val") && key.getsub1SORT_TYPE_val() != null) {
					msgKey.setKeyValue("sub1SORT_TYPE_val", key.getsub1SORT_TYPE_val());
				}
				if(msgKeyType.containsKeyColumn("sub1SORTKEY_PRI") && key.getsub1SORTKEY_PRI() != null) {
					msgKey.setKeyValue("sub1SORTKEY_PRI", key.getsub1SORTKEY_PRI());
				}
				if(msgKeyType.containsKeyColumn("sub1TABLE_NAME_COMMENT") && key.getsub1TABLE_NAME_COMMENT() != null) {
					msgKey.setKeyValue("sub1TABLE_NAME_COMMENT", key.getsub1TABLE_NAME_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("sub1TABLE_NAME") && key.getsub1TABLE_NAME() != null) {
					msgKey.setKeyValue("sub1TABLE_NAME", key.getsub1TABLE_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub1COLUMN_NAME") && key.getsub1COLUMN_NAME() != null) {
					msgKey.setKeyValue("sub1COLUMN_NAME", key.getsub1COLUMN_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub1COLUMN_NAME_COMMENT") && key.getsub1COLUMN_NAME_COMMENT() != null) {
					msgKey.setKeyValue("sub1COLUMN_NAME_COMMENT", key.getsub1COLUMN_NAME_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("EDIT_NAME") && key.getEDIT_NAME() != null) {
					msgKey.setKeyValue("EDIT_NAME", key.getEDIT_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_TO") && key.geth_TABLE_TO() != null) {
					msgKey.setKeyValue("h_TABLE_TO", key.geth_TABLE_TO());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_COMMENT_TO") && key.geth_TABLE_COMMENT_TO() != null) {
					msgKey.setKeyValue("h_TABLE_COMMENT_TO", key.geth_TABLE_COMMENT_TO());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_ALIAS_TO") && key.geth_TABLE_ALIAS_TO() != null) {
					msgKey.setKeyValue("h_TABLE_ALIAS_TO", key.geth_TABLE_ALIAS_TO());
				}
				if(msgKeyType.containsKeyColumn("h_LEFT_TABLE_NAME") && key.geth_LEFT_TABLE_NAME() != null) {
					msgKey.setKeyValue("h_LEFT_TABLE_NAME", key.geth_LEFT_TABLE_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_LEFT_TABLE_ALIAS") && key.geth_LEFT_TABLE_ALIAS() != null) {
					msgKey.setKeyValue("h_LEFT_TABLE_ALIAS", key.geth_LEFT_TABLE_ALIAS());
				}
				if(msgKeyType.containsKeyColumn("h_LEFT_COLUMN") && key.geth_LEFT_COLUMN() != null) {
					msgKey.setKeyValue("h_LEFT_COLUMN", key.geth_LEFT_COLUMN());
				}
				if(msgKeyType.containsKeyColumn("h_RIGHT_TABLE_NAME") && key.geth_RIGHT_TABLE_NAME() != null) {
					msgKey.setKeyValue("h_RIGHT_TABLE_NAME", key.geth_RIGHT_TABLE_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_RIGHT_TABLE_ALIAS") && key.geth_RIGHT_TABLE_ALIAS() != null) {
					msgKey.setKeyValue("h_RIGHT_TABLE_ALIAS", key.geth_RIGHT_TABLE_ALIAS());
				}
				if(msgKeyType.containsKeyColumn("h_RIGHT_COLUMN") && key.geth_RIGHT_COLUMN() != null) {
					msgKey.setKeyValue("h_RIGHT_COLUMN", key.geth_RIGHT_COLUMN());
				}
				if(msgKeyType.containsKeyColumn("h_CONDITION") && key.geth_CONDITION() != null) {
					msgKey.setKeyValue("h_CONDITION", key.geth_CONDITION());
				}
				if(msgKeyType.containsKeyColumn("h_COLUMN") && key.geth_COLUMN() != null) {
					msgKey.setKeyValue("h_COLUMN", key.geth_COLUMN());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_ALIAS") && key.geth_TABLE_ALIAS() != null) {
					msgKey.setKeyValue("h_TABLE_ALIAS", key.geth_TABLE_ALIAS());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_NAME") && key.geth_TABLE_NAME() != null) {
					msgKey.setKeyValue("h_TABLE_NAME", key.geth_TABLE_NAME());
				}
				if(msgKeyType.containsKeyColumn("EDIT_TYP") && key.getEDIT_TYP() != null) {
					msgKey.setKeyValue("EDIT_TYP", key.getEDIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("QUERY_NAME") && key.getQUERY_NAME() != null) {
					msgKey.setKeyValue("QUERY_NAME", key.getQUERY_NAME());
				}
				if(msgKeyType.containsKeyColumn("QUERY_GROUP") && key.getQUERY_GROUP() != null) {
					msgKey.setKeyValue("QUERY_GROUP", key.getQUERY_GROUP());
				}
				if(msgKeyType.containsKeyColumn("QUERY_MEMO") && key.getQUERY_MEMO() != null) {
					msgKey.setKeyValue("QUERY_MEMO", key.getQUERY_MEMO());
				}
				if(msgKeyType.containsKeyColumn("CREATED_DATE") && key.getCREATED_DATE() != null) {
					msgKey.setKeyValue("CREATED_DATE", key.getCREATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("CREATED_BY") && key.getCREATED_BY() != null) {
					msgKey.setKeyValue("CREATED_BY", key.getCREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_DATE") && key.getUPDATED_DATE() != null) {
					msgKey.setKeyValue("UPDATED_DATE", key.getUPDATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_BY") && key.getUPDATED_BY() != null) {
					msgKey.setKeyValue("UPDATED_BY", key.getUPDATED_BY());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("QUERY_CD") && key.getQUERY_CD() != null) {
					msgKey.setKeyValue("QUERY_CD", key.getQUERY_CD());
				}
				if(msgKeyType.containsKeyColumn("SQL_INFO") && key.getSQL_INFO() != null) {
					msgKey.setKeyValue("SQL_INFO", key.getSQL_INFO());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM") && key.getCREATED_PRG_NM() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM", key.getCREATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM") && key.getUPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("UPDATED_PRG_NM", key.getUPDATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("w_USER_CD") && key.getw_USER_CD() != null) {
					msgKey.setKeyValue("w_USER_CD", key.getw_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("w_QUERY_NAME") && key.getw_QUERY_NAME() != null) {
					msgKey.setKeyValue("w_QUERY_NAME", key.getw_QUERY_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_QUERY_GROUP") && key.getw_QUERY_GROUP() != null) {
					msgKey.setKeyValue("w_QUERY_GROUP", key.getw_QUERY_GROUP());
				}
				if(msgKeyType.containsKeyColumn("w_MEMO") && key.getw_MEMO() != null) {
					msgKey.setKeyValue("w_MEMO", key.getw_MEMO());
				}
				if(msgKeyType.containsKeyColumn("w_CREATED_BY") && key.getw_CREATED_BY() != null) {
					msgKey.setKeyValue("w_CREATED_BY", key.getw_CREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("w_CREATED_DATE_FROM") && key.getw_CREATED_DATE_FROM() != null) {
					msgKey.setKeyValue("w_CREATED_DATE_FROM", key.getw_CREATED_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_CREATED_DATE_TO") && key.getw_CREATED_DATE_TO() != null) {
					msgKey.setKeyValue("w_CREATED_DATE_TO", key.getw_CREATED_DATE_TO());
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
					AZ0040010Struct key = new AZ0040010Struct();
					if(msgKeyType.containsKeyColumn("sub1COLUMN_TYPE")) {
						key.setsub1COLUMN_TYPE(msgKey.getKeyValue("sub1COLUMN_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("sub1COND_TYPE")) {
						key.setsub1COND_TYPE(msgKey.getKeyValue("sub1COND_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("sub1COND_TYPE_name")) {
						key.setsub1COND_TYPE_name(msgKey.getKeyValue("sub1COND_TYPE_name"));
					}
					if(msgKeyType.containsKeyColumn("sub1COND_TYPE_val")) {
						key.setsub1COND_TYPE_val(msgKey.getKeyValue("sub1COND_TYPE_val"));
					}
					if(msgKeyType.containsKeyColumn("sub1COND_VALUE1")) {
						key.setsub1COND_VALUE1(msgKey.getKeyValue("sub1COND_VALUE1"));
					}
					if(msgKeyType.containsKeyColumn("sub1COND_VALUE2")) {
						key.setsub1COND_VALUE2(msgKey.getKeyValue("sub1COND_VALUE2"));
					}
					if(msgKeyType.containsKeyColumn("sub1DISPLAY_FLG")) {
						key.setsub1DISPLAY_FLG(msgKey.getKeyValue("sub1DISPLAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("sub1SORT_TYPE")) {
						key.setsub1SORT_TYPE(msgKey.getKeyValue("sub1SORT_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("sub1SORT_TYPE_name")) {
						key.setsub1SORT_TYPE_name(msgKey.getKeyValue("sub1SORT_TYPE_name"));
					}
					if(msgKeyType.containsKeyColumn("sub1SORT_TYPE_val")) {
						key.setsub1SORT_TYPE_val(msgKey.getKeyValue("sub1SORT_TYPE_val"));
					}
					if(msgKeyType.containsKeyColumn("sub1SORTKEY_PRI")) {
						key.setsub1SORTKEY_PRI(msgKey.getKeyValue("sub1SORTKEY_PRI"));
					}
					if(msgKeyType.containsKeyColumn("sub1TABLE_NAME_COMMENT")) {
						key.setsub1TABLE_NAME_COMMENT(msgKey.getKeyValue("sub1TABLE_NAME_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("sub1TABLE_NAME")) {
						key.setsub1TABLE_NAME(msgKey.getKeyValue("sub1TABLE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub1COLUMN_NAME")) {
						key.setsub1COLUMN_NAME(msgKey.getKeyValue("sub1COLUMN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub1COLUMN_NAME_COMMENT")) {
						key.setsub1COLUMN_NAME_COMMENT(msgKey.getKeyValue("sub1COLUMN_NAME_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("EDIT_NAME")) {
						key.setEDIT_NAME(msgKey.getKeyValue("EDIT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_TO")) {
						key.seth_TABLE_TO(msgKey.getKeyValue("h_TABLE_TO"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_COMMENT_TO")) {
						key.seth_TABLE_COMMENT_TO(msgKey.getKeyValue("h_TABLE_COMMENT_TO"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_ALIAS_TO")) {
						key.seth_TABLE_ALIAS_TO(msgKey.getKeyValue("h_TABLE_ALIAS_TO"));
					}
					if(msgKeyType.containsKeyColumn("h_LEFT_TABLE_NAME")) {
						key.seth_LEFT_TABLE_NAME(msgKey.getKeyValue("h_LEFT_TABLE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_LEFT_TABLE_ALIAS")) {
						key.seth_LEFT_TABLE_ALIAS(msgKey.getKeyValue("h_LEFT_TABLE_ALIAS"));
					}
					if(msgKeyType.containsKeyColumn("h_LEFT_COLUMN")) {
						key.seth_LEFT_COLUMN(msgKey.getKeyValue("h_LEFT_COLUMN"));
					}
					if(msgKeyType.containsKeyColumn("h_RIGHT_TABLE_NAME")) {
						key.seth_RIGHT_TABLE_NAME(msgKey.getKeyValue("h_RIGHT_TABLE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_RIGHT_TABLE_ALIAS")) {
						key.seth_RIGHT_TABLE_ALIAS(msgKey.getKeyValue("h_RIGHT_TABLE_ALIAS"));
					}
					if(msgKeyType.containsKeyColumn("h_RIGHT_COLUMN")) {
						key.seth_RIGHT_COLUMN(msgKey.getKeyValue("h_RIGHT_COLUMN"));
					}
					if(msgKeyType.containsKeyColumn("h_CONDITION")) {
						key.seth_CONDITION(msgKey.getKeyValue("h_CONDITION"));
					}
					if(msgKeyType.containsKeyColumn("h_COLUMN")) {
						key.seth_COLUMN(msgKey.getKeyValue("h_COLUMN"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_ALIAS")) {
						key.seth_TABLE_ALIAS(msgKey.getKeyValue("h_TABLE_ALIAS"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_NAME")) {
						key.seth_TABLE_NAME(msgKey.getKeyValue("h_TABLE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EDIT_TYP")) {
						key.setEDIT_TYP(msgKey.getKeyValue("EDIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("QUERY_NAME")) {
						key.setQUERY_NAME(msgKey.getKeyValue("QUERY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("QUERY_GROUP")) {
						key.setQUERY_GROUP(msgKey.getKeyValue("QUERY_GROUP"));
					}
					if(msgKeyType.containsKeyColumn("QUERY_MEMO")) {
						key.setQUERY_MEMO(msgKey.getKeyValue("QUERY_MEMO"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_DATE")) {
						key.setCREATED_DATE(msgKey.getKeyValue("CREATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_BY")) {
						key.setCREATED_BY(msgKey.getKeyValue("CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_DATE")) {
						key.setUPDATED_DATE(msgKey.getKeyValue("UPDATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_BY")) {
						key.setUPDATED_BY(msgKey.getKeyValue("UPDATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("QUERY_CD")) {
						key.setQUERY_CD(msgKey.getKeyValue("QUERY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SQL_INFO")) {
						key.setSQL_INFO(msgKey.getKeyValue("SQL_INFO"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM")) {
						key.setCREATED_PRG_NM(msgKey.getKeyValue("CREATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM")) {
						key.setUPDATED_PRG_NM(msgKey.getKeyValue("UPDATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("w_USER_CD")) {
						key.setw_USER_CD(msgKey.getKeyValue("w_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_QUERY_NAME")) {
						key.setw_QUERY_NAME(msgKey.getKeyValue("w_QUERY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_QUERY_GROUP")) {
						key.setw_QUERY_GROUP(msgKey.getKeyValue("w_QUERY_GROUP"));
					}
					if(msgKeyType.containsKeyColumn("w_MEMO")) {
						key.setw_MEMO(msgKey.getKeyValue("w_MEMO"));
					}
					if(msgKeyType.containsKeyColumn("w_CREATED_BY")) {
						key.setw_CREATED_BY(msgKey.getKeyValue("w_CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("w_CREATED_DATE_FROM")) {
						key.setw_CREATED_DATE_FROM(msgKey.getKeyValue("w_CREATED_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_CREATED_DATE_TO")) {
						key.setw_CREATED_DATE_TO(msgKey.getKeyValue("w_CREATED_DATE_TO"));
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
