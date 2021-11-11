/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0050/src/com/nec/jp/orteus/metamorBase/AZ0050/AZ0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0050;

import com.nec.jp.orteus.metamorBase.AZ0050.*;
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
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import java.util.ArrayList;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AZ0050010Control
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
               protected List list;				// ���ʃ��X�g�̃C���X�^���X
               public List getList() { return this.list; }	// ���X�g��Ԃ��܂��B
               public void setList(List listname) { this.list = listname; }	// ���X�g���Z�b�g���܂��B
               public int getListsize() {
                // ���X�g�^�̃T�C�Y��Ԃ��܂��B
                int nret = 0;
                if( this.list != null ) {nret = this.list.size();}
                return nret;
               }
               public Object getListvalue(int x) { return this.list.get(x); }	// ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
              
               public AZ0050010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
              
              
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
               private AZ0050SQLEdit w_sqle = null;
              
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
               private AZ0050ColumnData w_cdata = null;
              
               /** �����ݒ��񃊃X�g�擾
                * @return �����ݒ��񃊃X�g
               */
               public AZ0050ColumnData getConditionList(){ return w_cdata; }
              
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
               private AZ0050010Struct _keyStruct = new AZ0050010Struct();
              
               /** �L�[���Struct�̎擾 */
               public  AZ0050010Struct getKeyStruct(){ return _keyStruct; }
               
               /** �L�[���Struct�̐ݒ� */
               public void setKeyStruct(AZ0050010Struct struct){ _keyStruct.copy(struct); }
              
              
               /** �e�ˎq�ɉ�ʑJ�ڂ����ꍇ�̑I�����Struct **/
               private AZ0050010Struct _selStruct = new AZ0050010Struct();
              
               /** �I�����Struct�̎擾 */
               public  AZ0050010Struct getSelStruct(){ return _selStruct; }
              
               /** �I�����Struct�̐ݒ� */
               public void setSelStruct(AZ0050010Struct struct){ _selStruct.copy(struct); }
              
               //------------------------------------------------------------------------------
              
               /** ���ږ����X�g **/
               private List _l_QUERY_COLUMN = new ArrayList();
               /** ���ږ����X�g�̎擾 */
               public  List getSub4Name(){ return _l_QUERY_COLUMN; }
              
               /** ���ڃ^�C�v���X�g **/
               private List _l_QUERY_COLUMN_TYP = new ArrayList();
               /** ���ڃ^�C�v���X�g�̎擾 */
               public  List getSub4Type(){ return _l_QUERY_COLUMN_TYP; }
              
               /** �f�[�^���X�g **/
               private List _l_QUERY_DATA = new ArrayList();
               /** �f�[�^���X�g�̎擾 */
               public  List getSub4Data(){ return _l_QUERY_DATA; }
              
           
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
// 2006/03/30�ǉ�
               /** �Ɩ��O���[�v���������ʃ��X�g **/
               private List groupList;
               /** �I���Ɩ��O���[�v���������ʃ��X�g **/
               private List selectedList;
               /** �Ɩ��O���[�v���ꗗ���X�g **/
               private ArrayList _l_GROUP_LIST = new ArrayList();
               /** �Ɩ��O���[�v���ꗗ���X�g�擾 **/
               public ArrayList getSub8Data(){ return _l_GROUP_LIST; }

               /** �Ɩ��O���[�v�R�[�h�ꗗ���X�g **/
               private ArrayList _l_GROUP_CODE_LIST = new ArrayList();
               /** �Ɩ��O���[�v�R�[�h�ꗗ���X�g�擾 **/
               public ArrayList getSub8CodeData(){ return _l_GROUP_CODE_LIST; }
// 2006/03/30�ǉ������܂�

               //-------------------------------------------------------------------------
               /**
                * ��ʌ����̃t���O�̕\����ݒ�
                * @param s �t���O�̒l���ݒ肳��Ă�����
                */
               private void setTypeValueAboutProcGroup(AZ0050010Struct s)
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
               public AZ0050DBInfo getDBinfo(String tablename)
               {
                AZ0050DBInfo dbinfo = w_sqle.getDBUtil().getDBInfo(tablename);
              
                return dbinfo;
               }
              
               /** DBUtil�N���X�̎擾 **/
               public AZ0050DBUtil getDBUtil()
               {
                AZ0050DBUtil dbutil = w_sqle.getDBUtil();
              
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
              
               private AZ0050ModeCheck modeCheck = new AZ0050ModeCheck();
               public boolean canReference(){ return modeCheck.canReference(); }
               public boolean isInsert(){ return modeCheck.isInsert(); }
               public boolean isUpdate(){ return modeCheck.isUpdate(); }
               public boolean isCopy(){ return modeCheck.isCopy(); }
               public boolean isFree(){ return modeCheck.isFree(); }
               public boolean isNew(){ return modeCheck.isNew(); }
              
               public boolean canSub3SelectItem(){ return modeCheck.isnotREF(); }
               public boolean canSub4Condition(){ return modeCheck.isGUI(); }
               public boolean canSub4InputTitle(){ return modeCheck.isnotREF(); }
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
                
                //��ʌ����i�ꗗ�\�����������e�i���X�j��SQL���擾��������
                i_sql = "SELECT * FROM(" + i_sql + "\n" +
                        ") WHERE ROWNUM <= NVL((SELECT MAX_DISPLAY_ROWNUM FROM SYS_SCREEN_PARM WHERE SERVLET_CD = 'AZ0050010' AND DISPLAY_CD = 10) , 1000) + 1";
                
                //�ėp�f�[�^�����N���X����
                AZ0050DBData azDBData = new AZ0050DBData(conn, i_sql);
                boolean bret = azDBData.load();
              
                if (bret == false) {
                 Message = "SQL:" + i_sql;
                 setErrorMessageNoKey("AZ00014", Message);
                 return;
                }
                //�\���ő�s����������
                ScreenParam sp = new ScreenParam(this.getClass());
                int maxLine = sp.getMaxLine(conn,10);
   
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
                  AZ0050ColumnInfo w_info = (AZ0050ColumnInfo)itr.next();
                  if(w_info.Display_Flg)
                   _l_QUERY_COLUMN.add(w_info.Column_Name_Comment);
                 }
                }
               }
              
               /**
                * AZ0050ColumnData������SQL���𐶐�����
                */
               private void makeSQLfromCData(int mode) throws SQLException
               {
                // SQL���̐���
                AZ0050SQLCreate w_create = new AZ0050SQLCreate(sysLog, getsysUSER_CD());
                w_create.Create(conn, (AZ0050ColumnData)w_cdata, mode);
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
                 setSelStruct((AZ0050010Struct)_deployList.get(getCheckNumber().intValue()));
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
                  w_sqle = new AZ0050SQLEdit(sysLog, getsysUSER_CD());
              
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
                 AZ0050ColumnInfo col_info = (AZ0050ColumnInfo)w_cdata.Column_infos.get(cnt);
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
                  setSelStruct((AZ0050010Struct)_deployList.get(getCheckNumber().intValue()));
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
                   w_sqle = new AZ0050SQLEdit(sysLog, getsysUSER_CD());
              
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
                 AZ0050010Struct w_struct = new AZ0050010Struct();
                 w_struct.importColumnInfo((AZ0050ColumnInfo)list.get(cnt));
                 _ColumnList.add(w_struct);
                }
              
                return;
               }
              
               /** �����ݒ��ʕ\���p�f�[�^ -> ColumnInfo�ϊ�
                *  ���������ݒ��ʂ���J�ڂ���Ƃ��̏���
               */
               private void postSetCondition(){
                List list = w_cdata.getColumnInfos();
                AZ0050010Struct w_struct = null;
              
                for(int cnt = 0; cnt < list.size(); cnt++)
                { 
                 w_struct = (AZ0050010Struct)_ColumnList.get(cnt);
                 w_struct.exportColumnInfo((AZ0050ColumnInfo)list.get(cnt));
                }
               }
              
               /**
                * �t���[���͉�ʂɑJ�ڂ���Ƃ��̏���
                * �I���N�G���̓��̓��[�h����AColumnData�����ASQL������
                */
               private void preSetFree() throws SQLException
               {
                String Message = "";
                
                // �I�����̐ݒ�
                setSelStruct((AZ0050010Struct)_deployList.get(getCheckNumber().intValue()));
              
                // ��ʑI��SQL�̎擾
                Saved_Sql = (String)(_selStruct.getSQL_INFO());	//�I���ʒu��SQL�擾
              
                // �I���N�G���̓��̓��[�h�`�F�b�N
                if(_selStruct.getEDIT_TYP().equals(String.valueOf(AZ0050Const.C_INPUT_GUI))){
                 if(w_sqle == null){
                  w_sqle = new AZ0050SQLEdit(sysLog, getsysUSER_CD());
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
                  makeSQLfromCData(AZ0050SQLCreate.C_DISPLAY);
                 }
                }
              
                // SQL����struct�ɃR�s�[
                struct.setsub6FREE_SQL(Saved_Sql);
              
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
              
               /**
                * �ҏW���̃N�G����񂪍X�V����Ă��邩����
                * @return ���ɍX�V����Ă��� true
                *		   �X�V����Ă��Ȃ�   false
                */
               private boolean isModified(AZ0050010Struct org_struct) throws FoundationException, SQLException{
              
                String Message = "";
                
                // �N�G���ԍ����L�[�ɓǂݏo��
                List temp_list = entity.mT_QUERY_INFO4Update.read(conn, org_struct);
              
                // ��������0���̏ꍇ
                if(temp_list.size() <= 0){
                 // �G���[���b�Z�[�W�쐬 �R�[�h�͎b��
                 Message = "T_QUERY_INFO.QUERY_CD:" + org_struct.getQUERY_CD();
                 setErrorMessage("ZZ01101", Message);
                 return true;
                }
              
                // �ǂݍ��񂾃f�[�^���擾
                AZ0050010Struct workStruct = (AZ0050010Struct)temp_list.get(0);
              
                // �X�V���̔�r
                if(workStruct.getMODIFY_COUNT().equals(org_struct.getMODIFY_COUNT()) != true)
                {
                 // �X�V�����قȂ�ꍇ�G���[���b�Z�[�W�쐬
                 Message = "T_QUERY_INFO.QUERY_CD:" + org_struct.getQUERY_CD();
                 setErrorMessage("AZ00024", Message);
                 return true;
                }
              
                return false;
               }
              

				/**
				 * �ҏW���̃N�G����񂪍X�V����Ă��邩����i�Ɩ��O���[�v�ݒ�p�j
				 * 
				 * @return ���ɍX�V����Ă��� true �X�V����Ă��Ȃ� false
				 */
				private boolean isModified2(AZ0050010Struct org_struct)
						throws FoundationException, SQLException {
			
					String Message = "";
			
					// �N�G���ԍ����L�[�ɓǂݏo��
					List temp_list = entity.mT_QUERY_INFO4Update.read(conn, org_struct);
			
					// ��������0���̏ꍇ
					if (temp_list.size() <= 0) {
						// �G���[���b�Z�[�W�쐬 �R�[�h�͎b��
						Message = "T_QUERY_INFO.QUERY_CD:" + org_struct.getQUERY_CD();
						setErrorMessage("ZZ01101", Message);
						return true;
					}
			
					// �ǂݍ��񂾃f�[�^���擾
					AZ0050010Struct workStruct = (AZ0050010Struct) temp_list.get(0);
			
					// �X�V���̔�r
					if (workStruct.getMODIFY_COUNT().equals(org_struct.getMODIFY_COUNT()) != true) {
						// �X�V�����قȂ�ꍇ�G���[���b�Z�[�W�쐬
						Message = "T_QUERY_INFO.QUERY_CD:" + org_struct.getQUERY_CD();
						setErrorMessage("ZZ01105", Message);
						return true;
					}
			
					return false;
				}


               // ------------------------------------------------------------------------------
               /** ��ʋ��ʒ�`�擾�N���X */
               ScreenParam _scParam = sp;
              
               // ------------------------------------------------------------------------------
              
               /**
				 * ���b�Z�[�W�擾
				 * 
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
               ComboStruct _sub3COND_TYPE = new ComboStruct();
              
               /** ���o�����ݒ�
                * @param �R���{�{�b�N�X�f�[�^
               */
               public void setsub3COND_TYPE(ComboStruct combo){ _sub3COND_TYPE = combo; }
              
               /** ���o�����擾
                * @return ���o�����̃R���{�{�b�N�X�f�[�^
               */
               public ComboStruct getsub3COND_TYPE(){ return _sub3COND_TYPE; }
              
               /** ���ёւ� **/
               ComboStruct _sub3SORT_TYPE = new ComboStruct();
              
               /** ���ёւ��ݒ�
                * @param �R���{�{�b�N�X�f�[�^
               */
               public void setsub3SORT_TYPE(ComboStruct combo){ _sub3SORT_TYPE = combo; }
              
               /** ���ёւ��擾
                * @return ���ёւ��̃R���{�{�b�N�X�f�[�^
               */
               public ComboStruct getsub3SORT_TYPE(){ return _sub3SORT_TYPE; }
              
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>

                             List listMessage = new ArrayList();
                           
                             try {
                              _deployList.clear();
                              // ���[�h�ݒ�
                              _mode = _NORMAL;
                           
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
                                 setTypeValueAboutProcGroup((AZ0050010Struct)(list.get(i)));
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
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                             //------------------------------------------------------------------
                             // ������
                             _keyStruct = new AZ0050010Struct();
                             struct.initialize();
                             Saved_Sql = null;
                           
                             _deployList.clear();
                           
                             // ���[�h�ݒ�
                             _mode = _NORMAL;
                           
                //}}user_implement_dev:<controlclear>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
                             //------------------------------------------------------------------
                             // �N���A����
                             controlclear();
                           
                             // ���[�h�ݒ�
                             _mode = _CLOSE;
                           
                //}}user_implement_dev:<controlclose>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub3clear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub3clear");
			//{{user_implement_dev:<controlsub3clear>
                             try{
                              preSetCondition();
                             } catch(SQLException e) {
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub3clear>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub3clear");

		return;
	}

	/**
	 * �b�r�u�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub4csv() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub4csv");
			//{{user_implement_dev:<controlsub4csv>
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
                //}}user_implement_dev:<controlsub4csv>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub4csv");

		return;
	}

	/**
	 * �������s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
                             //------------------------------------------------------------------
                             String Message = "";
                           
                             try{
                           
                              //�I�����̐ݒ�
                              setSelStruct((AZ0050010Struct)_deployList.get(getCheckNumber().intValue()));
                           
                              //��ʑI��SQL�̎擾
                              Saved_Sql = (String)(_selStruct.getSQL_INFO());	//�I���ʒu��SQL�擾
                           
                              // �I���N�G���̓��̓��[�h�`�F�b�N
                              if(_selStruct.getEDIT_TYP().equals(String.valueOf(AZ0050Const.C_INPUT_FREE))){
                               // ���̓��[�h���t���[�ɐݒ�
                               modeCheck.setInputMode(AZ0050Const.C_INPUT_FREE);
                              }
                           
                              // �I�����ꂽ�N�G���̃`�F�b�N(�t���[���̓`�F�b�N���g�p)
                              if(AZ0050Common.checkFreeSqlStr(Saved_Sql)){
                               if(!isFree()) {
                                if(w_sqle == null){
                                 w_sqle = new AZ0050SQLEdit(sysLog, getsysUSER_CD());
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
                                 makeSQLfromCData(AZ0050SQLCreate.C_DISPLAY);
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
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * ���������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcondition() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlcondition");
			//{{user_implement_dev:<controlcondition>
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
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlcondition");

		return;
	}

	/**
	 * �������s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub3execute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub3execute");
			//{{user_implement_dev:<controlsub3execute>
                             try{
                              // ���̓f�[�^�̎�荞�݂�SQL���̐���
                              postSetCondition();
                              makeSQLfromCData(AZ0050SQLCreate.C_DISPLAY);
                           
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
                           
                //}}user_implement_dev:<controlsub3execute>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub3execute");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub3return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub3return");
			//{{user_implement_dev:<controlsub3return>
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
                //}}user_implement_dev:<controlsub3return>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub3return");

		return;
	}

	/**
	 * ���������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub4condition() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub4condition");
			//{{user_implement_dev:<controlsub4condition>
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
                //}}user_implement_dev:<controlsub4condition>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub4condition");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub4return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub4return");
			//{{user_implement_dev:<controlsub4return>
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
                //}}user_implement_dev:<controlsub4return>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub4return");

		return;
	}

	/**
	 * �s�ǉ�(�f�t�h)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertgui() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlinsertgui");
			//{{user_implement_dev:<controlinsertgui>
                             //------------------------------------------------------------------
                             try {
                              // �������[�h��ǉ��ɐݒ�
                              modeCheck.setProcessMode(AZ0050Const.C_PROCESS_INS);
                           
                              // �e�[�u���I����ʂւ̑J�ڑO����
                              preSetSelectTable();
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlinsertgui>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlinsertgui");

		return;
	}

	/**
	 * �s�C��(�f�t�h)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdategui() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlupdategui");
			//{{user_implement_dev:<controlupdategui>
                             //------------------------------------------------------------------
                             try {
                              // �������[�h���X�V�ɐݒ�
                              modeCheck.setProcessMode(AZ0050Const.C_PROCESS_UPD);
                           
                              // �e�[�u���I����ʂւ̑J�ڑO����
                              preSetSelectTable();
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlupdategui>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlupdategui");

		return;
	}

	/**
	 * �s����(�f�t�h)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcopygui() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlcopygui");
			//{{user_implement_dev:<controlcopygui>
                             //------------------------------------------------------------------
                             try {
                              // �������[�h�𕡎ʂɐݒ�
                              modeCheck.setProcessMode(AZ0050Const.C_PROCESS_COPY);
                           
                              // �e�[�u���I����ʂւ̑J�ڑO����
                              preSetSelectTable();
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlcopygui>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlcopygui");

		return;
	}

	/**
	 * �s�ǉ�(�t���[)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertfree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlinsertfree");
			//{{user_implement_dev:<controlinsertfree>
                             //------------------------------------------------------------------
                           
                             // �������[�h��ǉ��ɐݒ�
                             modeCheck.setProcessMode(AZ0050Const.C_PROCESS_INS);
                             // ���̓��[�h���t���[�ɐݒ�
                             modeCheck.setInputMode(AZ0050Const.C_INPUT_FREE);
                           
                //}}user_implement_dev:<controlinsertfree>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlinsertfree");

		return;
	}

	/**
	 * �s�C��(�t���[)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdatefree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlupdatefree");
			//{{user_implement_dev:<controlupdatefree>
                             //------------------------------------------------------------------
                             try{
                           
                              // �������[�h���X�V�ɐݒ�
                              modeCheck.setProcessMode(AZ0050Const.C_PROCESS_UPD);
                              // ���̓��[�h���t���[�ɐݒ�
                              modeCheck.setInputMode(AZ0050Const.C_INPUT_FREE);
                           
                              // �t���[���͉�ʑJ�ڑO����
                              preSetFree();
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                           
                //}}user_implement_dev:<controlupdatefree>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlupdatefree");

		return;
	}

	/**
	 * �s����(�t���[)�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcopyfree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlcopyfree");
			//{{user_implement_dev:<controlcopyfree>
                             //------------------------------------------------------------------
                             try{
                           
                              // �������[�h�𕡎ʂɐݒ�
                              modeCheck.setProcessMode(AZ0050Const.C_PROCESS_COPY);
                              // ���̓��[�h���t���[�ɐݒ�
                              modeCheck.setInputMode(AZ0050Const.C_INPUT_FREE);
                           
                              // �t���[���͉�ʑJ�ڑO����
                              preSetFree();
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                           
                             }
                           
                //}}user_implement_dev:<controlcopyfree>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlcopyfree");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
                             try {
                              // �I�����̐ݒ�
                              setSelStruct((AZ0050010Struct)_deployList.get(getCheckNumber().intValue()));
                           
                              // ��ʑI��SQL�̎擾
                              Saved_Sql = (String)(_selStruct.getSQL_INFO());	//�I���ʒu��SQL�擾
                           
                              // �g�����U�N�V�����J�n
                              conn.beginTransWeb();
                           
                              // �����Ώۃf�[�^���X�V����Ă��Ȃ����`�F�b�N
                              if(isModified(_selStruct)) {
                               // �X�V����Ă���΃G���[
                               // ���[���o�b�N
                               conn.rollback();
                               return;
                              }
                           
                              //�f�[�^�폜
                  			  entity.mT_BUSINESS_GROUP_QUERY.delete(conn, _selStruct);	// 2006/03/30�ǉ�
                              entity.mT_QUERY_INFO.delete(conn, _selStruct);
                           
                              // �R�~�b�g
                              conn.commit();
                           
                              // �N�G���ꗗ�֑J�ڂ���O����
                              preQueryList();
                           
                             } catch(SQLException e) {
                              e.printStackTrace();
                           
                              // ���[���o�b�N
                              conn.rollback();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                           
                //}}user_implement_dev:<controldelete>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1freeSql() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub1freeSql");
			//{{user_implement_dev:<controlsub1freeSql>
                             //------------------------------------------------------------------
                             try{
                              // ���̓��[�h���t���[�ɐݒ�
                              modeCheck.setInputMode(AZ0050Const.C_INPUT_FREE);
                           
                              if(w_sqle == null){
                               w_sqle = new AZ0050SQLEdit(sysLog, getsysUSER_CD());
                              }
                              if(!w_sqle.setTables(conn, struct.getList_h_TABLE_TO(), struct.getList_h_TABLE_COMMENT_TO())){
                               // �G���[����
                               ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                               sysLog.severe(emsg, getsysUSER_CD());
                               ExpjException ee = new ExpjException(emsg);
                               ExpjMessage log = new ExpjMessage( "ZZ01006", "SELECT TABLE FAILURE" );
                               sysLog.severe(log, getsysUSER_CD());
                               
                               throw ee;
                              }
                           
                              w_cdata = w_sqle.getColumnData();
                           
                              // �I�������e�[�u���̃G���A�X����struct�ɐݒ�
                              struct.setList_h_TABLE_ALIAS_TO(w_cdata.Table_Name_Aliass);
                           
                              // ���̓f�[�^�̎�荞�݂�SQL���̐���
                              makeSQLfromCData(AZ0050SQLCreate.C_DISPLAY);
                           
                              // SQL����struct�ɃR�s�[
                              struct.setsub6FREE_SQL(Saved_Sql);
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub1freeSql>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub1freeSql");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1clear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub1clear");
			//{{user_implement_dev:<controlsub1clear>
                              
                //}}user_implement_dev:<controlsub1clear>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub1clear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub1return");
			//{{user_implement_dev:<controlsub1return>
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
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub1return");

		return;
	}

	/**
	 * �O�����ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub2selectTable() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub2selectTable");
			//{{user_implement_dev:<controlsub2selectTable>
                             try{
                              postSetJoin();
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub2selectTable>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub2selectTable");

		return;
	}

	/**
	 * �������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub2selectItem() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub2selectItem");
			//{{user_implement_dev:<controlsub2selectItem>
                             try{
                              postSetJoin();
                              preSetSelectItem();
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub2selectItem>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub2selectItem");

		return;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub2freeSql() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub2freeSql");
			//{{user_implement_dev:<controlsub2freeSql>
                             //------------------------------------------------------------------
                             try{
                              // ���̓��[�h���t���[�ɐݒ�
                              modeCheck.setInputMode(AZ0050Const.C_INPUT_FREE);
                           
                              postSetJoin();
                           
                              // ���̓f�[�^�̎�荞�݂�SQL���̐���
                              makeSQLfromCData(AZ0050SQLCreate.C_DISPLAY);
                           
                              // SQL����struct�ɃR�s�[
                              struct.setsub6FREE_SQL(Saved_Sql);
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub2freeSql>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub2freeSql");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub2clear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub2clear");
			//{{user_implement_dev:<controlsub2clear>
                              
                //}}user_implement_dev:<controlsub2clear>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub2clear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub2return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub2return");
			//{{user_implement_dev:<controlsub2return>
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
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub2return");

		return;
	}

	/**
	 * �������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub5condition() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub5condition");
			//{{user_implement_dev:<controlsub5condition>
                             try{
                              // ���̓f�[�^�̎�荞��
                              postSetSelectItem();
                           
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
                //}}user_implement_dev:<controlsub5condition>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub5condition");

		return;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub5freeSql() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub5freeSql");
			//{{user_implement_dev:<controlsub5freeSql>
                             //------------------------------------------------------------------
                             try{
                              // ���̓��[�h���t���[�ɐݒ�
                              modeCheck.setInputMode(AZ0050Const.C_INPUT_FREE);
                           
                              if(w_sqle == null){
                               w_sqle = new AZ0050SQLEdit(sysLog, getsysUSER_CD());
                              }
                              if(!w_sqle.setTables(conn, struct.getList_h_TABLE_TO(), struct.getList_h_TABLE_COMMENT_TO())){
                               // �G���[����
                               ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                               sysLog.severe(emsg, getsysUSER_CD());
                               ExpjException ee = new ExpjException(emsg);
                               ExpjMessage log = new ExpjMessage( "ZZ01006", "SELECT TABLE FAILURE" );
                               sysLog.severe(log, getsysUSER_CD());
                               
                               throw ee;
                              }
                           
                              // ���̓f�[�^�̎�荞�݂�SQL���̐���
                              postSetSelectItem();
                              makeSQLfromCData(AZ0050SQLCreate.C_DISPLAY);
                           
                              // SQL����struct�ɃR�s�[
                              struct.setsub6FREE_SQL(Saved_Sql);
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                           
                //}}user_implement_dev:<controlsub5freeSql>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub5freeSql");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub5clear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub5clear");
			//{{user_implement_dev:<controlsub5clear>
                              // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlsub5clear>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub5clear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub5return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub5return");
			//{{user_implement_dev:<controlsub5return>
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
                //}}user_implement_dev:<controlsub5return>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub5return");

		return;
	}

	/**
	 * �������s�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub6execute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub6execute");
			//{{user_implement_dev:<controlsub6execute>
                           
                             String Message = "";
                           
                             try {
                              // �t���[���̓f�[�^���擾
                              Saved_Sql = struct.getsub6FREE_SQL();
                           
                              // �t���[���̓f�[�^�̃`�F�b�N
                              if(AZ0050Common.checkFreeSqlStr(Saved_Sql)){
                               // �������ʕ\���p�f�[�^�擾
                               getDatafromSQL(Saved_Sql);
                              } else {
                               // ��ʑJ�ڂ��Ȃ�
                               _sqlexception_flg = true;
                               // ���̓f�[�^�s��
                               Message = "SQL:" + Saved_Sql;
                               setErrorMessageNoKey("AZ00035", Message);
                               return;
                              }
                           
                             } catch(SQLException e) {
                              // SQL��O����t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub6execute>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub6execute");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub6clear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub6clear");
			//{{user_implement_dev:<controlsub6clear>
                              
                //}}user_implement_dev:<controlsub6clear>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub6clear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub6return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub6return");
			//{{user_implement_dev:<controlsub6return>
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
                //}}user_implement_dev:<controlsub6return>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub6return");

		return;
	}

	/**
	 * �O�����ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub3selectItem() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub3selectItem");
			//{{user_implement_dev:<controlsub3selectItem>
                           
                             // ���̓f�[�^�̎�荞��
                             postSetCondition();
                           
                //}}user_implement_dev:<controlsub3selectItem>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub3selectItem");

		return;
	}

	/**
	 * �N�G�����ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub4inputTitle() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub4inputTitle");
			//{{user_implement_dev:<controlsub4inputTitle>
                              
                //}}user_implement_dev:<controlsub4inputTitle>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub4inputTitle");

		return;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub4freeSql() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub4freeSql");
			//{{user_implement_dev:<controlsub4freeSql>
                             //------------------------------------------------------------------
                           
                             // ���̓��[�h���t���[�ɐݒ�
                             modeCheck.setInputMode(AZ0050Const.C_INPUT_FREE);
                           
                             // SQL����struct�ɃR�s�[
                             struct.setsub6FREE_SQL(Saved_Sql);
                           
                //}}user_implement_dev:<controlsub4freeSql>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub4freeSql");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub7insert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub7insert");
			//{{user_implement_dev:<controlsub7insert>
                             //------------------------------------------------------------------
                             
                             String Message = "";
                           
                             try {
                              
                              // �N�G���ԍ��̔ԃN���X�I�u�W�F�N�g����
                              CollectNumber collect = new CollectNumber(CollectNumber.QUERY_CD, struct.getsUser_ID(), sp.getProcId(), getsysPLANT_CD());
                           
                              // �N�G���ԍ��擾
                              String queryNo = collect.getNo();
                              if(queryNo == null)
                              {
                               Message = "T_QUERY_INFO.QUERY_CD:" + queryNo;
                               setErrorMessage("ZZ01106", Message);
                               return;
                              }
                           
                              // �N�G���ԍ��̐ݒ�
                              struct.setQUERY_CD(queryNo);
                           
                              // �o�^����SQL���̐ݒ�
                              if(!isFree()){
                               // �f�t�h�o�R��SQL������
                               makeSQLfromCData(AZ0050SQLCreate.C_WRITE);
                              }
                              struct.setSQL_INFO(Saved_Sql);
                           
                              // �敪���̐ݒ�
                              struct.setEDIT_TYP(Integer.toString(modeCheck.getInputMode()));
                           
                              // �f�[�^�}��
                              entity.mT_QUERY_INFO.create2(conn, struct);
                           
                              // �R�~�b�g
                              conn.commit();
                           
                              // �N�G���ꗗ�֑J�ڂ���O����
                              preQueryList();
                           
                             }catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              e.printStackTrace();
                           
                              // ���[���o�b�N
                              conn.rollback();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                           
                //}}user_implement_dev:<controlsub7insert>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub7insert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub7update() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub7update");
			//{{user_implement_dev:<controlsub7update>
                             try {
                              // �g�����U�N�V�����J�n
                              conn.beginTransWeb();
                           
                              // �����Ώۃf�[�^���X�V����Ă��Ȃ����`�F�b�N
                              if(isModified(_selStruct)) {
                               // ��ʑJ�ڂ��Ȃ�
                               _sqlexception_flg = true;
                               // �X�V����Ă���΃G���[
                               // ���[���o�b�N
                               conn.rollback();
                               return;
                              }
                           
                              // �N�G���ԍ��̐ݒ�
                              struct.setQUERY_CD(_selStruct.getQUERY_CD());
                           
                              // �o�^����SQL���̐ݒ�
                              if(!isFree()){
                               // �f�t�h�o�R��SQL������
                               makeSQLfromCData(AZ0050SQLCreate.C_WRITE);
                              }
                              struct.setSQL_INFO(Saved_Sql);
                           
                              // �敪���̐ݒ�
                              struct.setEDIT_TYP(Integer.toString(modeCheck.getInputMode()));
                           
                              //�f�[�^�X�V
                              entity.mT_QUERY_INFO.update2(conn, struct);
                           
                              // �R�~�b�g
                              conn.commit();
                           
                              // �N�G���ꗗ�֑J�ڂ���O����
                              preQueryList();
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              e.printStackTrace();
                           
                              // ���[���o�b�N
                              conn.rollback();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub7update>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub7update");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub7clear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub7clear");
			//{{user_implement_dev:<controlsub7clear>
                              
                //}}user_implement_dev:<controlsub7clear>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub7clear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub7return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub7return");
			//{{user_implement_dev:<controlsub7return>
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
                //}}user_implement_dev:<controlsub7return>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub7return");

		return;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub3freeSql() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub3freeSql");
			//{{user_implement_dev:<controlsub3freeSql>
                             //------------------------------------------------------------------
                             try {
                              // ���̓��[�h���t���[�ɐݒ�
                              modeCheck.setInputMode(AZ0050Const.C_INPUT_FREE);
                           
                              // ���̓f�[�^�̎�荞�݂�SQL���̐���
                              postSetCondition();
                              makeSQLfromCData(AZ0050SQLCreate.C_DISPLAY);
                           
                              // SQL����struct�ɃR�s�[
                              struct.setsub6FREE_SQL(Saved_Sql);
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub3freeSql>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub3freeSql");

		return;
	}

	/**
	 * �t���[���̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlfreeSql() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlfreeSql");
			//{{user_implement_dev:<controlfreeSql>
                             //------------------------------------------------------------------
                             try{
                           
                              // ���̓��[�h���t���[�ɐݒ�
                              modeCheck.setInputMode(AZ0050Const.C_INPUT_FREE);
                           
                              // �t���[���͉�ʑJ�ڑO����
                              preSetFree();
                           
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlfreeSql>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlfreeSql");

		return;
	}

	/**
	 * �������ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub1next() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub1next");
			//{{user_implement_dev:<controlsub1next>
                             //------------------------------------------------------------------
                             try{
                              if(w_sqle == null){
                               w_sqle = new AZ0050SQLEdit(sysLog, getsysUSER_CD());
                              }
                              if(!w_sqle.setTables(conn, struct.getList_h_TABLE_TO(), struct.getList_h_TABLE_COMMENT_TO())){
                               // �G���[����
                               ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                               sysLog.severe(emsg, getsysUSER_CD());
                               ExpjException ee = new ExpjException(emsg);
                               ExpjMessage log = new ExpjMessage( "ZZ01006", "SELECT TABLE FAILURE" );
                               sysLog.severe(log, getsysUSER_CD());
                               
                               throw ee;
                              }
                           
                              w_cdata = w_sqle.getColumnData();
                           
                              // �I�������e�[�u���̃G���A�X����struct�ɐݒ�
                              struct.setList_h_TABLE_ALIAS_TO(w_cdata.Table_Name_Aliass);
                           
                              if(_table_cnt == 1){
                               // �Ώۍ��ڑI��O����
                               // �e�[�u���R�����g�A�J�����R�����g�A�J����������ݒ肷��
                               preSetSelectItem();
                              } else {
                               // ���������ݒ�O����
                               if(w_cdata.JoinList != null){
                                // ����������Struct�֐ݒ�
                                int joinsize = w_cdata.JoinList.size();
                           
                                List l_left_TableName = new ArrayList(joinsize);
                                List l_left_TableNameAlias = new ArrayList(joinsize);
                                List l_left_ColumnName = new ArrayList(joinsize);
                                List l_right_TableName = new ArrayList(joinsize);
                                List l_right_TableNameAlias = new ArrayList(joinsize);
                                List l_right_ColumnName = new ArrayList(joinsize);
                                List l_condition = new ArrayList();
                           
                                for(int i=0; i<joinsize; i++){
                                 AZ0050ColumnData.WhereInfo w_where = (AZ0050ColumnData.WhereInfo)w_cdata.JoinList.get(i);
                                 l_left_TableName.add(w_where.left_TableName);
                                 l_left_TableNameAlias.add(w_where.left_TableNameAlias);
                                 l_left_ColumnName.add(w_where.left_ColumnName);
                                 l_right_TableName.add(w_where.right_TableName);
                                 l_right_TableNameAlias.add(w_where.right_TableNameAlias);
                                 l_right_ColumnName.add(w_where.right_ColumnName);
                                 l_condition.add(w_where.condition);
                                }
                                struct.setList_h_LEFT_TABLE_NAME(l_left_TableName);
                                struct.setList_h_LEFT_TABLE_ALIAS(l_left_TableNameAlias);
                                struct.setList_h_LEFT_COLUMN(l_left_ColumnName);
                                struct.setList_h_RIGHT_TABLE_NAME(l_right_TableName);
                                struct.setList_h_RIGHT_TABLE_ALIAS(l_right_TableNameAlias);
                                struct.setList_h_RIGHT_COLUMN(l_right_ColumnName);
                                struct.setList_h_CONDITION(l_condition);
                               }
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
                //}}user_implement_dev:<controlsub1next>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub1next");

		return;
	}

	/**
	 * �O�����ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub5prior() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub5prior");
			//{{user_implement_dev:<controlsub5prior>
                             try{
                              // ���̓f�[�^�̎�荞��
                              postSetSelectItem();
                             } catch(SQLException e) {
                              // SQL��O�t���OON
                              _sqlexception_flg = true;
                           
                              // �G���[�������L�q���Ă��������B
                              e.printStackTrace();
                           
                              // �G���[���b�Z�[�W�쐬
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub5prior>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub5prior");

		return;
	}

	/**
	 * �Ɩ��O���[�v�ݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlgroupset() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlgroupset");
			//{{user_implement_dev:<controlgroupset>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������		
        
		List listMessage = new ArrayList();

		try {

			// ���[�h�ݒ�
			_mode = _NORMAL;

			// �I�����̐ݒ�
			setSelStruct((AZ0050010Struct) _deployList.get(getCheckNumber().intValue()));

			// �Ɩ��O���[�v���擾����
			groupList = new ArrayList();
			groupList = entity.mBUSINESS_GROUP_MST.read(conn, _selStruct);

			// �Ɩ��O���[�v�����݂��邩
			if (groupList.size() > 0) {
				_l_GROUP_LIST = new ArrayList();
				_l_GROUP_CODE_LIST = new ArrayList();

				// �Ɩ��O���[�v����ݒ�
				for(int i = 0 ; i < groupList.size() ; i++){
					AZ0050010Struct groupInfo = (AZ0050010Struct)groupList.get(i);
					_l_GROUP_LIST.add(groupInfo.getBUSINESS_GROUP_NAME());
					_l_GROUP_CODE_LIST.add(groupInfo.getBUSINESS_GROUP_CD());
				}

				// �I���Ɩ��O���[�v���擾
				selectedList = new ArrayList();
				selectedList = entity.mT_BUSINESS_GROUP_QUERY.read(conn, _selStruct);

				if (selectedList.size() > 0) {
					List selectedName = new ArrayList();
					List selectedCode = new ArrayList();
					for(int i = 0 ; i < selectedList.size() ; i++){
						AZ0050010Struct selectedInfo = (AZ0050010Struct)selectedList.get(i);
						selectedName.add(selectedInfo.getSELECTED_GROUP_NAME());
						selectedCode.add(selectedInfo.getSELECTED_GROUP_CD());
					}
					struct.setList_h_GROUP_TO(selectedName);
					struct.setList_h_GROUP_CODE_TO(selectedCode);
				}
				else{
					struct.setList_h_GROUP_TO(new ArrayList());
					struct.setList_h_GROUP_CODE_TO(new ArrayList());
				}

			} else {
				// �Ώۃf�[�^���Ȃ�
				listMessage.add("T_BUSINESS_GROUP_QUERY");
				setErrorMessage("ZZ06001", listMessage);
				// ���[�h�ݒ�
				_mode = _SELECT_WARNING;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			// ���[�h�ݒ�
			_mode = _NORMAL;

			// �G���[���b�Z�[�W�쐬
			String error = DBErrorMessage.getMessage(e);
			setSqlExceptionMsg(error);
		}
		
                //}}user_implement_dev:<controlgroupset>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlgroupset");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub8Insert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub8Insert");
			//{{user_implement_dev:<controlsub8Insert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

        try {
			// �g�����U�N�V�����J�n
			conn.beginTransWeb();
			beginTransaction();

			int keepModifyCount = 0;
			// �����Ώۃf�[�^���X�V����Ă��Ȃ����`�F�b�N
			if (isModified2(_selStruct)) {
				// �X�V����Ă���΃G���[
				// ���[���o�b�N
				conn.rollback();
				return;
			}
			else{
				// �X�V����ێ�
				keepModifyCount = new Integer(_selStruct.getMODIFY_COUNT()).intValue();
			}

			// �����f�[�^�̍폜
			entity.mT_BUSINESS_GROUP_QUERY.delete(conn, _selStruct);

			// �f�[�^�o�^
			List insertCodeList = struct.getList_h_GROUP_CODE_TO();
			List codeBuf = new ArrayList();
			for(int i = 0 ; i < insertCodeList.size() ; i++){
				int continueFlg = 0;
				String insertCode = (String)insertCodeList.get(i);
				// ����Ɩ��O���[�v�R�[�h�̓o�^�����
				for(int j = 0 ; j < codeBuf.size() ; j++){
					String checkCode = (String)codeBuf.get(j);
					if(checkCode.equals(insertCode)){
						continueFlg = 1;
						break;
					}
				}
				if(continueFlg == 1){
					continue;
				}
				else{
					codeBuf.add(insertCode);
				}
				// �o�^�l�ݒ�
				AZ0050010Struct insertStruct = new AZ0050010Struct();
				insertStruct = _selStruct;
				insertStruct.setQUERY_CD(_selStruct.getQUERY_CD());
				insertStruct.setBUSINESS_GROUP_CD(insertCode);
				insertStruct.setCREATED_DATE(struct.getsSysdate());
				insertStruct.setCREATED_BY(struct.getsUser_ID());
				insertStruct.setCREATED_PRG_NM("AZ0050010");
				insertStruct.setUPDATED_DATE(struct.getsSysdate());
				insertStruct.setUPDATED_BY(struct.getsUser_ID());
				insertStruct.setUPDATED_PRG_NM("AZ0050010");
				insertStruct.setMODIFY_COUNT(new String("0"));
				// �o�^���s
				entity.mT_BUSINESS_GROUP_QUERY.create(conn,insertStruct);
			}

			// �N�G���̍X�V
			// �r������̂��߂ɐe���R�[�h�̃��f�B�t�@�C�J�E���g���X�V����
			AZ0050010Struct updateStruct = new AZ0050010Struct();
			updateStruct = _selStruct;
			updateStruct.setUPDATED_DATE(struct.getsSysdate());
			updateStruct.setUPDATED_BY(struct.getsUser_ID());
			updateStruct.setUPDATED_PRG_NM("AZ0050010");
			int updateCount = keepModifyCount + 1;
			updateStruct.setMODIFY_COUNT(new Integer(updateCount).toString());
			entity.mT_QUERY_INFO.update(conn,updateStruct);

			// �R�~�b�g
			conn.commit();

			// �N�G���ꗗ�֑J�ڂ���O����
			preQueryList();

		} catch (SQLException e) {
			e.printStackTrace();

			// ���[���o�b�N
			conn.rollback();

			// �G���[���b�Z�[�W�쐬
			String error = DBErrorMessage.getMessage(e);
			setSqlExceptionMsg(error);
		}

		// ���[�h�ݒ�
		_mode = _SELECT;

                //}}user_implement_dev:<controlsub8Insert>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub8Insert");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub8clear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub8clear");
			//{{user_implement_dev:<controlsub8clear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// ���[�h�ݒ�
		_mode = _SELECT;
                //}}user_implement_dev:<controlsub8clear>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub8clear");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlsub8return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub8return");
			//{{user_implement_dev:<controlsub8return>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// ���[�h�ݒ�
		_mode = _SELECT;
                //}}user_implement_dev:<controlsub8return>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlsub8return");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {

			// �N���A����
			controlclear();

			// ���[�h�ݒ�
			_mode = _NORMAL;

			// SQL��O����t���O�N���A
			_sqlexception_flg = false;

			// �I���e�[�u�����N���A
			_table_cnt = 0;

			// �R���{�{�b�N�X�f�[�^�p��
			ComboBox controller = new ComboBox(conn, sysUSER_CD);

			_sub3COND_TYPE = controller.getData("COND_TYP");
			_sub3SORT_TYPE = controller.getData("SORT_TYP");

			// �敪���擾
			_EDIT_TYP = controller.getData("EDIT_TYP");

			// ���샂�[�h������
			modeCheck.initialize();

			// �����ݒ��񃊃X�g������
			w_cdata = new AZ0050ColumnData();

			// �e�[�u���ꗗ���X�g
			_l_TABLE_LIST = AZ0050Common.GetUsefulTable(conn);

			// �I���e�[�u���R�����g�擾
			AZ0050DBUtil dbutil = new AZ0050DBUtil();
			_l_TABLE_COM_LIST = dbutil.getTableComments(conn, _l_TABLE_LIST);
			
			// ���ԊǗ��擾
            PrivateConfig item_ctrl = new PrivateConfig(conn);
            AZ0050Common.time_ctrl = item_ctrl.getString("SELECT_TIME_CTRL");  

		} catch (SQLException e) {
			// �G���[�������L�q���Ă��������B
			setSqlExceptionMsg(e);

		} catch (ComboException e) {
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0050");
		logger.entering("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AZ0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("sub3clear") ) {
				controlsub3clear();
			} else if( button.equals("sub4csv") ) {
				controlsub4csv();
			} else if( button.equals("execute") ) {
				controlexecute();
			} else if( button.equals("condition") ) {
				controlcondition();
			} else if( button.equals("sub3execute") ) {
				controlsub3execute();
			} else if( button.equals("sub3return") ) {
				controlsub3return();
			} else if( button.equals("sub4condition") ) {
				controlsub4condition();
			} else if( button.equals("sub4return") ) {
				controlsub4return();
			} else if( button.equals("insertgui") ) {
				controlinsertgui();
			} else if( button.equals("updategui") ) {
				controlupdategui();
			} else if( button.equals("copygui") ) {
				controlcopygui();
			} else if( button.equals("insertfree") ) {
				controlinsertfree();
			} else if( button.equals("updatefree") ) {
				controlupdatefree();
			} else if( button.equals("copyfree") ) {
				controlcopyfree();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("sub1freeSql") ) {
				controlsub1freeSql();
			} else if( button.equals("sub1clear") ) {
				controlsub1clear();
			} else if( button.equals("sub1return") ) {
				controlsub1return();
			} else if( button.equals("sub2selectTable") ) {
				controlsub2selectTable();
			} else if( button.equals("sub2selectItem") ) {
				controlsub2selectItem();
			} else if( button.equals("sub2freeSql") ) {
				controlsub2freeSql();
			} else if( button.equals("sub2clear") ) {
				controlsub2clear();
			} else if( button.equals("sub2return") ) {
				controlsub2return();
			} else if( button.equals("sub5condition") ) {
				controlsub5condition();
			} else if( button.equals("sub5freeSql") ) {
				controlsub5freeSql();
			} else if( button.equals("sub5clear") ) {
				controlsub5clear();
			} else if( button.equals("sub5return") ) {
				controlsub5return();
			} else if( button.equals("sub6execute") ) {
				controlsub6execute();
			} else if( button.equals("sub6clear") ) {
				controlsub6clear();
			} else if( button.equals("sub6return") ) {
				controlsub6return();
			} else if( button.equals("sub3selectItem") ) {
				controlsub3selectItem();
			} else if( button.equals("sub4inputTitle") ) {
				controlsub4inputTitle();
			} else if( button.equals("sub4freeSql") ) {
				controlsub4freeSql();
			} else if( button.equals("sub7insert") ) {
				controlsub7insert();
			} else if( button.equals("sub7update") ) {
				controlsub7update();
			} else if( button.equals("sub7clear") ) {
				controlsub7clear();
			} else if( button.equals("sub7return") ) {
				controlsub7return();
			} else if( button.equals("sub3freeSql") ) {
				controlsub3freeSql();
			} else if( button.equals("freeSql") ) {
				controlfreeSql();
			} else if( button.equals("sub1next") ) {
				controlsub1next();
			} else if( button.equals("sub5prior") ) {
				controlsub5prior();
			} else if( button.equals("groupset") ) {
				controlgroupset();
			} else if( button.equals("sub8Insert") ) {
				controlsub8Insert();
			} else if( button.equals("sub8clear") ) {
				controlsub8clear();
			} else if( button.equals("sub8return") ) {
				controlsub8return();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			// �R���{�{�b�N�X�Ɏ擾�f�[�^�ݒ�
			struct.setList_sub3COND_TYPE_val(_sub3COND_TYPE.getValList());
			struct.setList_sub3COND_TYPE_name(_sub3COND_TYPE.getExplanList());
			struct.setList_sub3SORT_TYPE_val(_sub3SORT_TYPE.getValList());
			struct.setList_sub3SORT_TYPE_name(_sub3SORT_TYPE.getExplanList());

		} catch (AlarmMessageException ame) {
			ExpjException ee = new ExpjException(ame,
					(ExpjMessageList) ((Object) ame.getMessages()));
			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AZ0050010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0050010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AZ0050010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0050010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AZ0050010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0050010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AZ0050010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AZ0050010Entity entity;
	protected AZ0050010Struct struct;
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

		entity = new AZ0050010Entity();
		struct = new AZ0050010Struct();

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
	 * AZ0050010�N���X�̕W���R���X�g���N�^
	 */
	public AZ0050010Control() throws BusinessProcessException, FoundationException
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
				AZ0050010Struct key = (AZ0050010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("sub3COLUMN_TYPE") && key.getsub3COLUMN_TYPE() != null) {
					msgKey.setKeyValue("sub3COLUMN_TYPE", key.getsub3COLUMN_TYPE());
				}
				if(msgKeyType.containsKeyColumn("sub3COND_TYPE") && key.getsub3COND_TYPE() != null) {
					msgKey.setKeyValue("sub3COND_TYPE", key.getsub3COND_TYPE());
				}
				if(msgKeyType.containsKeyColumn("sub3COND_TYPE_name") && key.getsub3COND_TYPE_name() != null) {
					msgKey.setKeyValue("sub3COND_TYPE_name", key.getsub3COND_TYPE_name());
				}
				if(msgKeyType.containsKeyColumn("sub3COND_TYPE_val") && key.getsub3COND_TYPE_val() != null) {
					msgKey.setKeyValue("sub3COND_TYPE_val", key.getsub3COND_TYPE_val());
				}
				if(msgKeyType.containsKeyColumn("sub3COND_VALUE1") && key.getsub3COND_VALUE1() != null) {
					msgKey.setKeyValue("sub3COND_VALUE1", key.getsub3COND_VALUE1());
				}
				if(msgKeyType.containsKeyColumn("sub3COND_VALUE2") && key.getsub3COND_VALUE2() != null) {
					msgKey.setKeyValue("sub3COND_VALUE2", key.getsub3COND_VALUE2());
				}
				if(msgKeyType.containsKeyColumn("sub3DISPLAY_FLG") && key.getsub3DISPLAY_FLG() != null) {
					msgKey.setKeyValue("sub3DISPLAY_FLG", key.getsub3DISPLAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("sub3SORT_TYPE") && key.getsub3SORT_TYPE() != null) {
					msgKey.setKeyValue("sub3SORT_TYPE", key.getsub3SORT_TYPE());
				}
				if(msgKeyType.containsKeyColumn("sub3SORT_TYPE_name") && key.getsub3SORT_TYPE_name() != null) {
					msgKey.setKeyValue("sub3SORT_TYPE_name", key.getsub3SORT_TYPE_name());
				}
				if(msgKeyType.containsKeyColumn("sub3SORT_TYPE_val") && key.getsub3SORT_TYPE_val() != null) {
					msgKey.setKeyValue("sub3SORT_TYPE_val", key.getsub3SORT_TYPE_val());
				}
				if(msgKeyType.containsKeyColumn("sub3SORTKEY_PRI") && key.getsub3SORTKEY_PRI() != null) {
					msgKey.setKeyValue("sub3SORTKEY_PRI", key.getsub3SORTKEY_PRI());
				}
				if(msgKeyType.containsKeyColumn("sub3TABLE_NAME_COMMENT") && key.getsub3TABLE_NAME_COMMENT() != null) {
					msgKey.setKeyValue("sub3TABLE_NAME_COMMENT", key.getsub3TABLE_NAME_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("sub3TABLE_NAME") && key.getsub3TABLE_NAME() != null) {
					msgKey.setKeyValue("sub3TABLE_NAME", key.getsub3TABLE_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub3COLUMN_NAME") && key.getsub3COLUMN_NAME() != null) {
					msgKey.setKeyValue("sub3COLUMN_NAME", key.getsub3COLUMN_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub3COLUMN_NAME_COMMENT") && key.getsub3COLUMN_NAME_COMMENT() != null) {
					msgKey.setKeyValue("sub3COLUMN_NAME_COMMENT", key.getsub3COLUMN_NAME_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("sub6FREE_SQL") && key.getsub6FREE_SQL() != null) {
					msgKey.setKeyValue("sub6FREE_SQL", key.getsub6FREE_SQL());
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
				if(msgKeyType.containsKeyColumn("h_GROUP_TO") && key.geth_GROUP_TO() != null) {
					msgKey.setKeyValue("h_GROUP_TO", key.geth_GROUP_TO());
				}
				if(msgKeyType.containsKeyColumn("h_GROUP_CODE_TO") && key.geth_GROUP_CODE_TO() != null) {
					msgKey.setKeyValue("h_GROUP_CODE_TO", key.geth_GROUP_CODE_TO());
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
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_CD") && key.getBUSINESS_GROUP_CD() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_CD", key.getBUSINESS_GROUP_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_NAME") && key.getBUSINESS_GROUP_NAME() != null) {
					msgKey.setKeyValue("BUSINESS_GROUP_NAME", key.getBUSINESS_GROUP_NAME());
				}
				if(msgKeyType.containsKeyColumn("SELECTED_GROUP_CD") && key.getSELECTED_GROUP_CD() != null) {
					msgKey.setKeyValue("SELECTED_GROUP_CD", key.getSELECTED_GROUP_CD());
				}
				if(msgKeyType.containsKeyColumn("SELECTED_GROUP_NAME") && key.getSELECTED_GROUP_NAME() != null) {
					msgKey.setKeyValue("SELECTED_GROUP_NAME", key.getSELECTED_GROUP_NAME());
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
					AZ0050010Struct key = new AZ0050010Struct();
					if(msgKeyType.containsKeyColumn("sub3COLUMN_TYPE")) {
						key.setsub3COLUMN_TYPE(msgKey.getKeyValue("sub3COLUMN_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("sub3COND_TYPE")) {
						key.setsub3COND_TYPE(msgKey.getKeyValue("sub3COND_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("sub3COND_TYPE_name")) {
						key.setsub3COND_TYPE_name(msgKey.getKeyValue("sub3COND_TYPE_name"));
					}
					if(msgKeyType.containsKeyColumn("sub3COND_TYPE_val")) {
						key.setsub3COND_TYPE_val(msgKey.getKeyValue("sub3COND_TYPE_val"));
					}
					if(msgKeyType.containsKeyColumn("sub3COND_VALUE1")) {
						key.setsub3COND_VALUE1(msgKey.getKeyValue("sub3COND_VALUE1"));
					}
					if(msgKeyType.containsKeyColumn("sub3COND_VALUE2")) {
						key.setsub3COND_VALUE2(msgKey.getKeyValue("sub3COND_VALUE2"));
					}
					if(msgKeyType.containsKeyColumn("sub3DISPLAY_FLG")) {
						key.setsub3DISPLAY_FLG(msgKey.getKeyValue("sub3DISPLAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("sub3SORT_TYPE")) {
						key.setsub3SORT_TYPE(msgKey.getKeyValue("sub3SORT_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("sub3SORT_TYPE_name")) {
						key.setsub3SORT_TYPE_name(msgKey.getKeyValue("sub3SORT_TYPE_name"));
					}
					if(msgKeyType.containsKeyColumn("sub3SORT_TYPE_val")) {
						key.setsub3SORT_TYPE_val(msgKey.getKeyValue("sub3SORT_TYPE_val"));
					}
					if(msgKeyType.containsKeyColumn("sub3SORTKEY_PRI")) {
						key.setsub3SORTKEY_PRI(msgKey.getKeyValue("sub3SORTKEY_PRI"));
					}
					if(msgKeyType.containsKeyColumn("sub3TABLE_NAME_COMMENT")) {
						key.setsub3TABLE_NAME_COMMENT(msgKey.getKeyValue("sub3TABLE_NAME_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("sub3TABLE_NAME")) {
						key.setsub3TABLE_NAME(msgKey.getKeyValue("sub3TABLE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub3COLUMN_NAME")) {
						key.setsub3COLUMN_NAME(msgKey.getKeyValue("sub3COLUMN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub3COLUMN_NAME_COMMENT")) {
						key.setsub3COLUMN_NAME_COMMENT(msgKey.getKeyValue("sub3COLUMN_NAME_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("sub6FREE_SQL")) {
						key.setsub6FREE_SQL(msgKey.getKeyValue("sub6FREE_SQL"));
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
					if(msgKeyType.containsKeyColumn("h_GROUP_TO")) {
						key.seth_GROUP_TO(msgKey.getKeyValue("h_GROUP_TO"));
					}
					if(msgKeyType.containsKeyColumn("h_GROUP_CODE_TO")) {
						key.seth_GROUP_CODE_TO(msgKey.getKeyValue("h_GROUP_CODE_TO"));
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
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_CD")) {
						key.setBUSINESS_GROUP_CD(msgKey.getKeyValue("BUSINESS_GROUP_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_GROUP_NAME")) {
						key.setBUSINESS_GROUP_NAME(msgKey.getKeyValue("BUSINESS_GROUP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SELECTED_GROUP_CD")) {
						key.setSELECTED_GROUP_CD(msgKey.getKeyValue("SELECTED_GROUP_CD"));
					}
					if(msgKeyType.containsKeyColumn("SELECTED_GROUP_NAME")) {
						key.setSELECTED_GROUP_NAME(msgKey.getKeyValue("SELECTED_GROUP_NAME"));
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
