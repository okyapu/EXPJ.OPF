/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0160/src/com/nec/jp/orteus/metamorBase/AA0160/AA0160010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0160;

import com.nec.jp.orteus.metamorBase.AA0160.*;
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
import com.nec.jp.orteus.expj.util.PrivateConfig;
import java.io.*;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
//import com.nec.jp.orteus.metamorBase.common01.util.DateTool;
import java.text.ParseException;
import java.math.BigDecimal;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import com.nec.jp.orteus.expj.psmaintenance.PsMaintenance;
import com.nec.jp.orteus.expj.exception.NoDataException;
import com.nec.jp.orteus.expj.exception.PsEffPhaseException;
import com.nec.jp.orteus.expj.exception.PsLoopException;
import com.nec.jp.orteus.expj.exception.PsMrpOdrTypException;
// 2008/07/29 SYSCOM �镔 ADD START
import com.nec.jp.orteus.expj.exception.PsManhourTypException;
// 2008/07/29 SYSCOM �镔 ADD END
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0160010Control
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
    protected List list;                                            // �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X


    // �f�t�H���g�A�N�Z�T���\�b�h
    public List getList() { return this.list; }                     // ���X�g��Ԃ��܂��B
    public void setList(List listname) { this.list = listname; }    // ���X�g���Z�b�g���܂��B
    public int getListsize() {                                      // ���X�g�^�̃T�C�Y��Ԃ��܂��B
        int nret = 0;
        if( this.list != null ) {nret = this.list.size();}
        return nret;
    }
//  public Object getListvalue(int x) { return this.list.get(x); }  // ���X�g�̒l��Ԃ��܂��B
    public AA0160010Struct getListvalue(int x) { return (AA0160010Struct)(this.list.get(x)); }  // ���X�g�̒l��Ԃ��܂��B
    public AA0160010Struct getStruct() { return this.struct; }  // Struct��Ԃ��܂��B
    public AA0160010Struct createStruct() { return new AA0160010Struct(); } // �V����Struct������ĕԂ��܂��B
    public void setStruct(Object structname) { this.struct.setStruct((AA0160010Struct)structname); }    // Struct���Z�b�g���܂��B
    public void initializeStruct() { this.struct.initialize(); }    // Struct�̒l�����������܂��B

    // CSV�o�͗p���X�g
    private CsvWriter csvWriter = null;
    public CsvWriter getCsvWriter(){ return this.csvWriter; }

    /** ���i�\�������e�i���X���i�A�N�Z�X�p�I�u�W�F�N�g */
    private PsMaintenance _psMaint = null;

    /** �W�J�敪�F���W�J */
//  private static final String DEVELOP_NORMAL = "1";

    /** �W�J�敪�F�t�W�J */
//  private static final String DEVELOP_REVERSE = "2";

    
    // �g���q
    private final String EXTENSION_CSV = "csv"; 

    private CsvReader csvReader = null;
    public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
    
    /**
     * SQLException�G���[���b�Z�[�W�ݒ�
     * @param SQLException
     */
    private void setSqlExceptionMsg(SQLException e) throws ExpjException
    {
        ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
        sysLog.severe(emsg, getsysUSER_CD());
        ExpjException ee = new ExpjException(e, emsg);
        throw ee;
    }

//------------------------------------------------------------------------

    /** �e���struct���ꎞ�ޔ�p */
    private AA0160010Struct _save_struct = new AA0160010Struct();

    /**
     * �e��ʂ�struct����ޔ�
     */
    private void saveParentStruct()
    {
        _save_struct.copy(struct);
    }

//------------------------------------------------------------------------
    /**
     * ���O���b�Z�[�W�ݒ�
     * @param �o�̓��b�Z�[�W
     */
    private void setSyslogConfig(String message)
    {
        ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
        sysLog.config(emsg, getsysUSER_CD());
    }

    //---------- �b�r�u�f�[�^�֘A�`�F�b�N�̏��� START-----------------------------------------
    /**
     * �w�肳�ꂽ���Ԃ����i�\���L�����ԂƏd�����Ȃ������ׂ܂�
     *
     * @param targetBDate �����Ώۂ̐��i�\���L���i���ԁj�J�n��
     * @param targetEDate �����Ώۂ̐��i�\���L���i���ԁj�I����
     * @param inDate ���i�\���L���i���ԁj�J�n��
     * @param outDate ���i�\���L���i���ԁj�I����
     * @return boolean     true  :�G���[����
     *                     false :�G���[����
    */
    private boolean chkConflictEffPhase(String targetBDate,String targetEDate, String inDate, String outDate)
            throws  ParseException
    {
        SimpleDateFormat formatYyyyMmDd = new SimpleDateFormat("yyyy/MM/dd");
        Date dateTargetBDate = formatYyyyMmDd.parse(targetBDate);
        Date dateTargetEDate = formatYyyyMmDd.parse(targetEDate);
        Date dateInDate = formatYyyyMmDd.parse(inDate);
        Date dateOutDate = formatYyyyMmDd.parse(outDate);
        boolean b = false;
        
        // �����Ώۂ̊J�n�����w��J�n���̏ꍇ
        if (dateTargetBDate.compareTo(dateInDate) > 0) {
            // �����Ώۂ̊J�n�����w��I�����Ȃ�΁F
            if (dateTargetBDate.compareTo(dateOutDate) <= 0) {
                // �d������
                b = true;
            }
        // �����Ώۂ̊J�n�����w��J�n�̏ꍇ
        } else if (dateTargetBDate.compareTo(dateInDate) < 0) {
            // �����Ώۂ̏I�������w��J�n��
            if (dateTargetEDate.compareTo(dateInDate) >= 0) {
                // �d������
                b = true;
            }
        } else {
            // �����Ώۂ̊J�n��==�w��J�n��
            // �d������
                b = true;
        }
        
        return b;
    }

    /**
     * �e���i�\���Ƀ��[�v���Ȃ������ׂ܂�
     *
     * @param  parentItemCd �������鐻�i�\���̐e�i�ڔԍ�
     * @param  compItemCd �������鐻�i�\���̎q�i�ڔԍ�
     * @throws SQLException DB�A�N�Z�X�Ɏ��s
     * @throws PsLoopException �e���i�\���Ƀ��[�v����
     */
    private void chkLoopingParentPs(String parentItemCd, String compItemCd)
            throws PsLoopException
    {
        // �e�̐e�i�ڔԍ��̈ꗗ���擾
        List grandParentPsList = getParentPsList(parentItemCd);
        int listSize = grandParentPsList.size();
        for (int i = 0; i < listSize; i++) {
            String[] grandParentPs = (String[])grandParentPsList.get(i);
            String grandParentItemCd = grandParentPs[0];
            // �e�̐e�i�ڂ̓���i�ڌ����i���[�v�����j
            if (compItemCd.equals(grandParentItemCd) == true) {
                // ���[�v����
                throw new PsLoopException(new ExpjMessage("ZZ01006",
                    "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
            }
            // �e�̐e�̐e�i�ڂ̃��[�v����
            chkLoopingParentPs(grandParentItemCd, compItemCd);
        }
        // ���[�v�Ȃ�
    }

    /**
     * �e���i�\���̈ꗗ���擾���A�ԋp���܂�
     *
     * @param  compItemCd �q�i�ڔԍ��i��i�ڔԍ��j
     * @return �e���i�\���̈ꗗ
     * @throws SQLException DB�A�N�Z�X�Ɏ��s
     */
    private List getParentPsList(String compItemCd)
    {
        List rtnList = new ArrayList();
        for(int i=0;i<PsList.size();i++){
            String[] strArr = (String[])PsList.get(i);
            if(strArr[1].equals(compItemCd)){
                rtnList.add(strArr);
            }
        }
        return rtnList;
    }
    
    /**
     * �q���i�\���Ƀ��[�v���Ȃ������ׂ܂�
     *
     * @param  parentItemCd �������鐻�i�\���̐e�i�ڔԍ�
     * @param  compItemCd �������鐻�i�\���̎q�i�ڔԍ�
     * @throws SQLException DB�A�N�Z�X�Ɏ��s
     * @throws PsLoopException �q���i�\���Ƀ��[�v����
     */
    private void chkLoopingCompPs(String parentItemCd, String compItemCd)
            throws PsLoopException
    {
        // ���i�ڔԍ��̈ꗗ���擾
        List grandCompPsList = getCompPsList(compItemCd);
        int listSize = grandCompPsList.size();
        for (int i = 0; i < listSize; i++) {
            String[] grandCompPs = (String[])grandCompPsList.get(i);
            String grandCompItemCd = grandCompPs[1];
            // ���i�ڂ̓���i�ڌ����i���[�v�����j
            if (parentItemCd.equals(grandCompItemCd) == true) {
                // ���[�v����
                throw new PsLoopException(new ExpjMessage("ZZ01006",
                    "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
            }
            // �]���i�ڂ̃��[�v����
            chkLoopingCompPs(parentItemCd, grandCompItemCd);
        }
        // ���[�v�Ȃ�
    }
    
    /**
     * �q���i�\���̈ꗗ���擾���A�ԋp���܂�
     *
     * @param  parentItemCd �e�i�ڔԍ��i��i�ڔԍ��j
     * @return �q���i�\���̈ꗗ
     * @throws SQLException DB�A�N�Z�X�Ɏ��s
     */
    private List getCompPsList(String parentItemCd)
    {
        List rtnList = new ArrayList();
        for(int i=0;i<PsList.size();i++){
            String[] strArr = (String[])PsList.get(i);
            if(strArr[0].equals(parentItemCd)){
                rtnList.add(strArr);
                continue;
            }
        }
        return rtnList;
    }
    
    /**
     * ���[�s���O�`�F�b�N�B���W�J���s�����i�ڔԍ������� �L��
     * @param repository ���i�\�����|�W�g��
     * @param  checkItem �Ώەi�ڔԍ�
     * @param item ��r����i�ڔԍ�
     * @return true:�L  false:��
     */
    private void checkRooping(ProductStructureRepository repository, 
            String targetItem, String item)
     throws PsLoopException
    {
      try{
      // �q�i�ڔԍ��ꗗ�擾
      ArrayList itemList = repository.orderDeployment(item);
      checkItemList(itemList);
   
        for(int i = 0; i < itemList.size(); i++){
          if(targetItem.equals((String)itemList.get(i)) == false){
            // �q�i�ڔԍ��ꗗ����X�ɉ��̎q�i�ڎ擾
            checkRooping(repository, targetItem, (String)itemList.get(i));
          }else{
            throw new PsLoopException(new ExpjMessage("ZZ01006",
                    "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + targetItem + "," + item));
          }
        }
      } catch (SQLException e){
        e.printStackTrace();
      } 
    }
    
    /**
     * ���[�s���O�`�F�b�N�B�t�W�J���s�����i�ڔԍ������� �L��
     * @param repository ���i�\�����|�W�g��
     * @param checkItem �Ώەi�ڔԍ�
     * @param item ��r����i�ڔԍ�
     * @return true:�L  false:��
     */
    private void checkReverseRooping(ProductStructureRepository repository, 
               String targetItem, String item)
     throws PsLoopException
    {
      try {
        // �e�i�ڔԍ��ꗗ�擾
        ArrayList itemList = repository.reverseDeployment(item);
        checkItemList(itemList);
   
        for(int i = 0; i < itemList.size(); i++){
          if(targetItem.equals((String)itemList.get(i)) == false){
          // �e�i�ڔԍ��ꗗ����X�ɏ�̐e�i�ڎ擾
          checkReverseRooping(repository, 
              targetItem, (String)itemList.get(i));
          }else{
              throw new PsLoopException(new ExpjMessage("ZZ01006",
                  "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + targetItem + "," + item));
          }
        }
      }catch(SQLException e){
    	  e.printStackTrace();
      }
    }
    
    /** �d���`�F�b�N
     * @param itemList �d���`�F�b�N����i�ڃ��X�g
    */
    private void checkItemList(ArrayList itemList)
    {
     List workList = new ArrayList(0);
     for(int i = 0; i < itemList.size(); i++){
      boolean result =true;
      String item_cd = (String)itemList.get(i);
      for(int t = 0; t < workList.size(); t++){
       if(item_cd.equals((String)workList.get(t)) == true)
        result = false;
      }
      if(result == true)
       workList.add(item_cd);
     }
   
     itemList.clear();
     for(int i = 0; i < workList.size(); i++)
      itemList.add(workList.get(i));
    }
    
    //---------- �b�r�u�f�[�^�֘A�`�F�b�N�̏��� END-------------------------------------------
    //---------- �b�r�u�o�͊֘A�̏��� START---------------------------------------------------

    private String strSysdate = "";
    private List PsList = new ArrayList(0);
    
    /** 
     * �b�r�u�o�̓f�[�^�ݒ菀��
     *
     * @param target_struct �Ώۃf�[�^���
     * @param listTarget    �Ώۃf�[�^���X�g
     * @param ErrlineNo     �G���[�����s
     * @param ErrItem       �G���[���ږ�
     * @param ErrCd         �G���[�R�[�h
     * @param ErrNo         �G���[NO
     * @param ErrMsg        �G���[���b�Z�[�W
     * @param CsvCnount     �G���[���O���ڐ�
     * @return �ُ�Ȃ� true �G���[ false
     */ 
    private boolean csvExport(AA0160010Struct target_struct , int ErrlineNo , String ErrItem, String ErrCd, String ErrNo ,String ErrMsg , String CsvCnount,int ErrItemNo)
    {
        
        AA0160010Struct aa0160010Struct = new AA0160010Struct();
        String locale = CoreTools.getLocale(sysUSER_CD);

        // ���אݒ�
        // ������L�[�Z�b�g
        // �G���[�s
        if(ErrItemNo != CSV_COLNO_99){
          ExpjMessage emsg = new ExpjMessage("AH00045",String.valueOf(ErrlineNo),String.valueOf(ErrItemNo + 1));
          aa0160010Struct.setERROR_IN(emsg.getMessage(locale));
      }else{
          ExpjMessage emsg = new ExpjMessage("AA01520",String.valueOf(ErrlineNo));
          aa0160010Struct.setERROR_IN(emsg.getMessage(locale));
        }
        // �e�i�ڔԍ�
        aa0160010Struct.setPARENT_ITEM_CD(target_struct.geth_PARENT_ITEM_CD());
        // �q�i�ڔԍ�
        aa0160010Struct.setCOMP_ITEM_CD(target_struct.geth_COMP_ITEM_CD());
        // ���i�\���Ő�
        aa0160010Struct.setPS_EDITION(target_struct.geth_PS_EDITION());
        // �G���[���ږ�
        aa0160010Struct.setERR_CTR_NM(ErrItem);
        // �G���[���b�Z�[�W
        aa0160010Struct.setERR_INFO(ErrMsg);
        list.add(aa0160010Struct);
        
        // ���������t���O������(true:����)
        return true;
    }

    /** 
     * �b�r�u�o�̓f�[�^�ݒ菀��(�������O)
     *
     * @param target_struct �Ώۃf�[�^���
     * @param listTarget    �Ώۃf�[�^���X�g
     * @param UserId        ���[�U�R�[�h
     * @param SyoriKbn      �����敪
     * @param DataKbn       �ύX�f�[�^�敪
     * @param 
     * @return �ُ�Ȃ� true �G���[ false
     */ 
    private boolean csvExportCorrection( AA0160010Struct target_struct , String UserId, String SyoriKbn, String DataKbn, boolean bWrite )
    {
        // ���������t���O������
        boolean bSuccess = false;
        // CSV�t�@�C���ҏW�p
        String csvStr = "";
        String strTmp = "";
        BufferedWriter outStream = null;

        try {
            // �ύX�f�[�^�敪��(1:�ύX�O�f�[�^)�������ꍇ�B
            if ( "1".equals(DataKbn))
            {
                // *�X�V�O�̃f�[�^�̎擾*
                struct.setC_setPARENT_ITEM_CD(target_struct.geth_PARENT_ITEM_CD());
                struct.setC_setCOMP_ITEM_CD(target_struct.geth_COMP_ITEM_CD());
                struct.setC_setPS_EDITION(target_struct.geth_PS_EDITION());
                List listmitemType = entity.mselectM_PS.read(conn, struct);
                csvStr = '"' + strSysdate + '"' + "," ;
                // ��2���O�C�����[�U�[��
                csvStr = csvStr + '"' + UserId + '"' + "," ;
                // ��3�����敪
                csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
                // ��4�ύX�f�[�^�敪
                csvStr = csvStr + '"' + DataKbn + '"' + "," ;
                // ��5�e�i�ڔԍ�
                csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PARENT_ITEM_CD() + '"' + "," ;
                // ��6�q�i�ڔԍ�
                csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_COMP_ITEM_CD() + '"' + "," ;
                // ��7���i�\���Ő�
                csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_EDITION() + '"' + "," ;
                // ��8���i�\���P�ʐ�����
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_UNIT_DENOMINATOR() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_UNIT_DENOMINATOR() + '"' + "," ;
                }
                // ��9���i�\���P�ʐ����q
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_UNIT_NUMERATOR() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_UNIT_NUMERATOR() + '"' + "," ;
                }
                // ��10���i�\���L���J�n��
                if(((AA0160010Struct)listmitemType.get(0)).getC_EFF_PHASE_IN_DATE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_EFF_PHASE_IN_DATE() + '"' + "," ;
                }
                // ��11���i�\���L���I����
                if(((AA0160010Struct)listmitemType.get(0)).getC_EFF_PHASE_OUT_DATE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_EFF_PHASE_OUT_DATE() + '"' + "," ;
                }
                // ��11�\���d����
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_SPOIL() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_SPOIL() + '"' + "," ;
                }
                // ��12�x���敪
                if(((AA0160010Struct)listmitemType.get(0)).getC_CONS_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_CONS_TYP() + '"' + "," ;
                }
                // ��13���i�\�����[�h�^�C���g�p�t���O
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_LT_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_LT_FLG() + '"' + "," ;
                }
                // ��14���i�\���Œ蕪���[�h�^�C��
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_FIXED_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_FIXED_LT() + '"' + "," ;
                }
                // ��15���i�\����ᕪ���[�h�^�C��
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_PROP_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_PROP_LT() + '"' + "," ;
                }
                // ��16���i�\����ᕪ���b�g�T�C�Y
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_PROP_LOT_SIZE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_PROP_LOT_SIZE() + '"' + "," ;
                }
                // ��17���i�\���Ɖ�L�[
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_REF_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_REF_NO() + '"' + "," ;
                }
                // ��18�����Ϗ�敪
                if(((AA0160010Struct)listmitemType.get(0)).getC_COST_UP_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_COST_UP_TYP() + '"' + "," ;
                }
                // ��19���v�ʓW�J�敪
                if(((AA0160010Struct)listmitemType.get(0)).getC_MRP_EXP_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_MRP_EXP_TYP() + '"' ;
                }
            } else {
                // �������O�쐬(�ύX��f�[�^)
                csvStr = '"' + strSysdate + '"' + "," ;

                // ��2���O�C�����[�U�[��
                csvStr = csvStr + '"' + UserId + '"' + "," ;
                // ��3�����敪
                csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
                // ��4�ύX�f�[�^�敪
                csvStr = csvStr + '"' + DataKbn + '"' + "," ;
                // ��5�e�i�ڔԍ�
                csvStr = csvStr + '"' + target_struct.geth_PARENT_ITEM_CD() + '"' + "," ;
                // ��6�q�i�ڔԍ�
                csvStr = csvStr + '"' + target_struct.geth_COMP_ITEM_CD() + '"' + "," ;
                // ��7���i�\���Ő�
                csvStr = csvStr + '"' + target_struct.geth_PS_EDITION() + '"' + "," ;
                // ��8���i�\���P�ʐ�����
                if(target_struct.geth_PS_UNIT_DENOMINATOR() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_UNIT_DENOMINATOR() + '"' + "," ;
                }
                // ��9���i�\���P�ʐ����q
                if(target_struct.geth_PS_UNIT_NUMERATOR() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_UNIT_NUMERATOR() + '"' + "," ;
                }
                // ��10���i�\���L���J�n��
                if(target_struct.geth_EFF_PHASE_IN_DATE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_EFF_PHASE_IN_DATE() + '"' + "," ;
                }
                // ��11���i�\���L���I����
                if(target_struct.geth_EFF_PHASE_OUT_DATE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_EFF_PHASE_OUT_DATE() + '"' + "," ;
                }
                // ��12�\���d����
                if(target_struct.geth_PS_SPOIL() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_SPOIL() + '"' + "," ;
                }
                // ��13�x���敪
                if(target_struct.geth_CONS_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_CONS_TYP() + '"' + "," ;
                }
                // ��14���i�\�����[�h�^�C���g�p�t���O
                if(target_struct.geth_PS_LT_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_LT_FLG() + '"' + "," ;
                }
                // ��15���i�\���Œ蕪���[�h�^�C��
                if(target_struct.geth_PS_FIXED_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_FIXED_LT() + '"' + "," ;
                }
                // ��15���i�\����ᕪ���[�h�^�C��
                if(target_struct.geth_PS_PROP_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_PROP_LT() + '"' + "," ;
                }
                // ��16���i�\����ᕪ���b�g�T�C�Y
                if(target_struct.geth_PS_PROP_LOT_SIZE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_PROP_LOT_SIZE() + '"' + "," ;
                }
                // ��17���i�\���Ɖ�L�[
                if(target_struct.geth_PS_REF_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_REF_NO() + '"' + "," ;
                }
                // ��18�����Ϗ�敪
                if(target_struct.geth_COST_UP_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_COST_UP_TYP() + '"' + "," ;
                }
                // ��19���v�ʓW�J�敪
                if(target_struct.geth_MRP_EXP_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MRP_EXP_TYP() + '"' ;
                }
            }

            // �������O�o��(�o�̓t�@�C�����Z�b�g)
            
            if(bWrite){
              outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(),true));
          }else{
              outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(),false));
          }
            // �t�@�C���ɏ���
            outStream.write(csvStr);
            // ���s�R�[�h�t��
            outStream.newLine();
            // BufferedWriter�N���[�Y
            outStream.close();
            // �����t���O�Z�b�g(true:����)
            bSuccess = true;
            return bSuccess;
        } catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
            sysLog.severe(emsg, getsysUSER_CD());
            // �����t���O�Z�b�g(false:���s)
            bSuccess = false;
            return bSuccess;
        }finally{
            if (outStream != null ) {
                try {
                    outStream.close();
                } catch (Exception e ) {
                    e.printStackTrace();
                }
              outStream = null;
             }
        }
    }
    //---------- �b�r�u�o�͊֘A�̏��� END---------------------------------------------------

    //---------- �b�r�u�捞�֘A�̏��� START---------------------------------------------------

    /** �b�r�u���ڔԍ���` */
    private final int CSV_COLNO_PARENT_ITEM_CD = 0;         //  0�e�i�ڔԍ�
    private final int CSV_COLNO_COMP_ITEM_CD = 1;             //  1�q�i�ڔԍ�
    private final int CSV_COLNO_PS_EDITION = 2;               //  2���i�\���Ő�
    private final int CSV_COLNO_PS_UNIT_DENOMINATOR = 3;//  3���i�\���P�ʐ�����
    private final int CSV_COLNO_PS_UNIT_NUMERATOR = 4;  //  4���i�\���P�ʐ����q
    private final int CSV_COLNO_EFF_PHASE_IN_DATE = 5;  //  5���i�\���L���J�n��
    private final int CSV_COLNO_EFF_PHASE_OUT_DATE = 6; //  6���i�\���L���I����
    private final int CSV_COLNO_PS_SPOIL = 7;                   //  7�\���d����
    private final int CSV_COLNO_CONS_TYP = 8;                   //  8�x���敪
    private final int CSV_COLNO_PS_LT_FLG = 9;                // 09���i�\�����[�h�^�C���g�p�t���O
    private final int CSV_COLNO_PS_FIXED_LT = 10;             // 10���i�\���Œ蕪���[�h�^�C��
    private final int CSV_COLNO_PS_PROP_LT = 11;              // 11���i�\����ᕪ���[�h�^�C��
    private final int CSV_COLNO_PS_PROP_LOT_SIZE = 12;  // 12���i�\����ᕪ���b�g�T�C�Y
    private final int CSV_COLNO_PS_REF_NO = 13;               // 13���i�\���Ɖ�L�[
    private final int CSV_COLNO_COST_UP_TYP = 14;             // 14�����Ϗ�敪
    private final int CSV_COLNO_MRP_EXP_TYP = 15;             // 15���v�ʓW�J�敪
    private final int CSV_COLNO_99 = 99;                        // 99

    /** �b�r�u�捞�f�[�^�K�v���ڐ�(���v) */
    private final int CSV_NECESSARY_COLUMN = (CSV_COLNO_MRP_EXP_TYP + 1);

    /**
     * �b�r�u�f�[�^�擾�ƃ��X�g�f�[�^��
     *
     * @return  CSV�f�[�^���X�g
     */
    private List readCsvData() throws ExpjException
    {
        // ���O�o�͏��i�[�p
        String logMessage = "";
        String [] strsCsvData = null;
        List listCsv = null;

        try {
            // �b�r�u�f�[�^�̃A�b�v���[�h
            strsCsvData = (String []) csvReader.lineRead();
            if(null != strsCsvData)
            {
                logMessage = "strsCsvData.length:" + strsCsvData.length;
                setSyslogConfig(logMessage);

                // �f�[�^�����Ƃ���strsCsvData.length�͎g���Ȃ��B���ۂ̍s���{�T�s���炢�炵��
                listCsv = new ArrayList(0);
                for(int i = 0; i < strsCsvData.length; i++)
                {
                    // ���s�݂̂̃��R�[�h��EOF�Ɣ��f���܂�
                    if(strsCsvData[i].length() == 0)
                    {
                        // �����𔲂���B
                        break;
                    }

                    // ���R�[�h�����ږ��ɂ΂炷
                    AA0160010Struct structCsv = new AA0160010Struct();
                    Vector v = csvReader.importCSVLine(strsCsvData[i]);
                    if(null != v)
                    {
                        // ���ڐ��`�F�b�N
                        // CSV�t�@�C���̍��ڐ���ϐ��Ɏ擾�B
                        int intColNum = v.size();
                        if(CSV_NECESSARY_COLUMN == intColNum)
                        {
                            // ��1�e�i�ڔԍ�
                            if ((String) v.get(CSV_COLNO_PARENT_ITEM_CD) == null || ("").equals((String) v.get(CSV_COLNO_PARENT_ITEM_CD)) == true )
                            {
                                structCsv.seth_PARENT_ITEM_CD((String)null);
                            } else {
                                structCsv.seth_PARENT_ITEM_CD((String) v.get(CSV_COLNO_PARENT_ITEM_CD));
                            }
                            // \�̏ꍇ�A\\�Œu������
                            structCsv.seth_PARENT_ITEM_CD(replaceSlash(structCsv.geth_PARENT_ITEM_CD()));
                            // ��2�q�i�ڔԍ�
                            if ((String) v.get(CSV_COLNO_COMP_ITEM_CD) == null || ("").equals((String) v.get(CSV_COLNO_COMP_ITEM_CD)) == true )
                            {
                                structCsv.seth_COMP_ITEM_CD((String)null);
                            } else {
                                structCsv.seth_COMP_ITEM_CD((String) v.get(CSV_COLNO_COMP_ITEM_CD));
                            }
                            // \�̏ꍇ�A\\�Œu������
                            structCsv.seth_COMP_ITEM_CD(replaceSlash(structCsv.geth_COMP_ITEM_CD()));
                            // ��3���i�\���Ő�
                            if ((String) v.get(CSV_COLNO_PS_EDITION) == null || ("").equals((String) v.get(CSV_COLNO_PS_EDITION)) == true )
                            {
                                structCsv.seth_PS_EDITION((String)null);
                            } else {
                                structCsv.seth_PS_EDITION((String) v.get(CSV_COLNO_PS_EDITION));
                            }
                            // \�̏ꍇ�A\\�Œu������
                            structCsv.seth_PS_EDITION(replaceSlash(structCsv.geth_PS_EDITION()));
                            // ��4���i�\���P�ʐ�����
                            if ((String) v.get(CSV_COLNO_PS_UNIT_DENOMINATOR) == null || ("").equals((String) v.get(CSV_COLNO_PS_UNIT_DENOMINATOR)) == true )
                            {
                                structCsv.seth_PS_UNIT_DENOMINATOR((String)null);
                            } else {
                                structCsv.seth_PS_UNIT_DENOMINATOR((String) v.get(CSV_COLNO_PS_UNIT_DENOMINATOR));
                            }
                            structCsv.seth_PS_UNIT_DENOMINATOR(trim(structCsv.geth_PS_UNIT_DENOMINATOR()));
                            // ��5���i�\���P�ʐ����q
                            if ((String) v.get(CSV_COLNO_PS_UNIT_NUMERATOR) == null || ("").equals((String) v.get(CSV_COLNO_PS_UNIT_NUMERATOR)) == true )
                            {
                                structCsv.seth_PS_UNIT_NUMERATOR((String)null);
                            } else {
                                structCsv.seth_PS_UNIT_NUMERATOR((String) v.get(CSV_COLNO_PS_UNIT_NUMERATOR));
                            }
                            structCsv.seth_PS_UNIT_NUMERATOR(trim(structCsv.geth_PS_UNIT_NUMERATOR()));
                            // ��6���i�\���L���J�n��
                            if ((String) v.get(CSV_COLNO_EFF_PHASE_IN_DATE) == null || ("").equals((String) v.get(CSV_COLNO_EFF_PHASE_IN_DATE)) == true)
                            {
                                structCsv.seth_EFF_PHASE_IN_DATE((String)null);
                            } else {
                                structCsv.seth_EFF_PHASE_IN_DATE((String) v.get(CSV_COLNO_EFF_PHASE_IN_DATE));
                            }
                            structCsv.seth_EFF_PHASE_IN_DATE(trim(structCsv.geth_EFF_PHASE_IN_DATE()));
                            // ��7���i�\���L���I����
                            if ((String) v.get(CSV_COLNO_EFF_PHASE_OUT_DATE) == null || ("").equals((String) v.get(CSV_COLNO_EFF_PHASE_OUT_DATE)) == true)
                            {
                                structCsv.seth_EFF_PHASE_OUT_DATE((String)null);
                            } else {
                                structCsv.seth_EFF_PHASE_OUT_DATE((String) v.get(CSV_COLNO_EFF_PHASE_OUT_DATE));
                            }
                            structCsv.seth_EFF_PHASE_OUT_DATE(trim(structCsv.geth_EFF_PHASE_OUT_DATE()));
                            // ��8�\���d����
                            if ((String) v.get(CSV_COLNO_PS_SPOIL) == null || ("").equals((String) v.get(CSV_COLNO_PS_SPOIL)) == true)
                            {
                                structCsv.seth_PS_SPOIL((String)null);
                            } else {
                                structCsv.seth_PS_SPOIL((String) v.get(CSV_COLNO_PS_SPOIL));
                            }
                            structCsv.seth_PS_SPOIL(trim(structCsv.geth_PS_SPOIL()));
                            // ��9�x���敪
                            if ((String) v.get(CSV_COLNO_CONS_TYP) == null || ("").equals((String) v.get(CSV_COLNO_CONS_TYP)) == true)
                            {
                                structCsv.seth_CONS_TYP((String)null);
                            } else {
                                structCsv.seth_CONS_TYP((String) v.get(CSV_COLNO_CONS_TYP));
                            }
                            structCsv.seth_CONS_TYP(trim(structCsv.geth_CONS_TYP()));
                            // ��10���i�\�����[�h�^�C���g�p�t���O
                            if ((String) v.get(CSV_COLNO_PS_LT_FLG) == null || ("").equals((String) v.get(CSV_COLNO_PS_LT_FLG)) == true)
                            {
                                structCsv.seth_PS_LT_FLG((String)null);
                            } else {
                                structCsv.seth_PS_LT_FLG((String) v.get(CSV_COLNO_PS_LT_FLG));
                            }
                            structCsv.seth_PS_LT_FLG(trim(structCsv.geth_PS_LT_FLG()));
                            // ��11���i�\���Œ蕪���[�h�^�C��
                            if ((String) v.get(CSV_COLNO_PS_FIXED_LT) == null || ("").equals((String) v.get(CSV_COLNO_PS_FIXED_LT)) == true)
                            {
                                structCsv.seth_PS_FIXED_LT((String)null);
                            } else {
                                structCsv.seth_PS_FIXED_LT((String) v.get(CSV_COLNO_PS_FIXED_LT));
                            }
                            structCsv.seth_PS_FIXED_LT(trim(structCsv.geth_PS_FIXED_LT()));
                            // ��12���i�\����ᕪ���[�h�^�C��
                            if ((String) v.get(CSV_COLNO_PS_PROP_LT) == null || ("").equals((String) v.get(CSV_COLNO_PS_PROP_LT)) == true)
                            {
                                structCsv.seth_PS_PROP_LT((String)null);
                            } else {
                                structCsv.seth_PS_PROP_LT((String) v.get(CSV_COLNO_PS_PROP_LT));
                            }
                            structCsv.seth_PS_PROP_LT(trim(structCsv.geth_PS_PROP_LT()));
                            // ��13���i�\����ᕪ���b�g�T�C�Y
                            if ((String) v.get(CSV_COLNO_PS_PROP_LOT_SIZE) == null || ("").equals((String) v.get(CSV_COLNO_PS_PROP_LOT_SIZE)) == true)
                            {
                                structCsv.seth_PS_PROP_LOT_SIZE((String)null);
                            } else {
                                structCsv.seth_PS_PROP_LOT_SIZE((String) v.get(CSV_COLNO_PS_PROP_LOT_SIZE));
                            }
                            structCsv.seth_PS_PROP_LOT_SIZE(trim(structCsv.geth_PS_PROP_LOT_SIZE()));
                            // ��14���i�\���Ɖ�L�[
                            if ((String) v.get(CSV_COLNO_PS_REF_NO) == null || ("").equals((String) v.get(CSV_COLNO_PS_REF_NO)) == true)
                            {
                                structCsv.seth_PS_REF_NO((String)null);
                            } else {
                                structCsv.seth_PS_REF_NO((String) v.get(CSV_COLNO_PS_REF_NO));
                            }
                            structCsv.seth_PS_REF_NO(trim(structCsv.geth_PS_REF_NO()));
                            // ��15�����Ϗ�敪
                            if ((String) v.get(CSV_COLNO_COST_UP_TYP) == null || ("").equals((String) v.get(CSV_COLNO_COST_UP_TYP)) == true)
                            {
                                structCsv.seth_COST_UP_TYP((String)null);
                            } else {
                                structCsv.seth_COST_UP_TYP((String) v.get(CSV_COLNO_COST_UP_TYP));
                            }
                            structCsv.seth_COST_UP_TYP(trim(structCsv.geth_COST_UP_TYP()));
                            // ��16���v�ʓW�J�敪
                            if ((String) v.get(CSV_COLNO_MRP_EXP_TYP) == null || ("").equals((String) v.get(CSV_COLNO_MRP_EXP_TYP)) == true)
                            {
                                structCsv.seth_MRP_EXP_TYP((String)null);
                            } else {
                                structCsv.seth_MRP_EXP_TYP((String) v.get(CSV_COLNO_MRP_EXP_TYP));
                            }
                            structCsv.seth_MRP_EXP_TYP(trim(structCsv.geth_MRP_EXP_TYP()));
                            // ����捞�ꍇ�́A�ϐ�COLUMN_FLG��null���Z�b�g����B
                            structCsv.setw_COLUMN_FLG((String)null);
                        } else {
                            // �b�r�u�̍��ڂ����X�g�f�[�^��
                            // ��1�e�i�ڔԍ�
                            structCsv.seth_PARENT_ITEM_CD((String) v.get(CSV_COLNO_PARENT_ITEM_CD));
                            // \�̏ꍇ�A\\�Œu������
                            structCsv.seth_PARENT_ITEM_CD(replaceSlash(structCsv.geth_PARENT_ITEM_CD()));
                        	if(intColNum > 1){
                                // ��2�q�i�ڔԍ�
                                structCsv.seth_COMP_ITEM_CD((String) v.get(CSV_COLNO_COMP_ITEM_CD));
                                // \�̏ꍇ�A\\�Œu������
                                structCsv.seth_COMP_ITEM_CD(replaceSlash(structCsv.geth_COMP_ITEM_CD()));
                        	}else{
                                structCsv.seth_COMP_ITEM_CD((String)null);
                        	}

                            // ��3���i�\���Ő�
                            if(intColNum > CSV_COLNO_PS_EDITION)
                            {
                                structCsv.seth_PS_EDITION((String) v.get(CSV_COLNO_PS_EDITION));
                            } else {
                                structCsv.seth_PS_EDITION((String)null);
                            }
                            // \�̏ꍇ�A\\�Œu������
                            structCsv.seth_PS_EDITION(replaceSlash(structCsv.geth_PS_EDITION()));
                            // ��4���i�\���P�ʐ�����
                            if(intColNum > CSV_COLNO_PS_UNIT_DENOMINATOR)
                            {
                                structCsv.seth_PS_UNIT_DENOMINATOR((String) v.get(CSV_COLNO_PS_UNIT_DENOMINATOR));
                            } else {
                                structCsv.seth_PS_UNIT_DENOMINATOR((String)null);
                            }
                            // ��5���i�\���P�ʐ����q
                            if(intColNum > CSV_COLNO_PS_UNIT_NUMERATOR)
                            {
                                structCsv.seth_PS_UNIT_NUMERATOR((String) v.get(CSV_COLNO_PS_UNIT_NUMERATOR));
                            } else {
                                structCsv.seth_PS_UNIT_NUMERATOR((String)null);
                            }
                            // ��6���i�\���L���J�n��
                            if(intColNum > CSV_COLNO_EFF_PHASE_IN_DATE)
                            {
                                structCsv.seth_EFF_PHASE_IN_DATE((String) v.get(CSV_COLNO_EFF_PHASE_IN_DATE));
                            } else {
                                structCsv.seth_EFF_PHASE_IN_DATE((String)null);
                            }
                            // ��7���i�\���L���I����
                            if(intColNum > CSV_COLNO_EFF_PHASE_OUT_DATE)
                            {
                                structCsv.seth_EFF_PHASE_OUT_DATE((String) v.get(CSV_COLNO_EFF_PHASE_OUT_DATE));
                            } else {
                                structCsv.seth_EFF_PHASE_OUT_DATE((String)null);
                            }
                            // ��8�\���d����
                            if(intColNum > CSV_COLNO_PS_SPOIL)
                            {
                                structCsv.seth_PS_SPOIL((String) v.get(CSV_COLNO_PS_SPOIL));
                            } else {
                                structCsv.seth_PS_SPOIL((String)null);
                            }
                            // ��9�x���敪
                            if(intColNum > CSV_COLNO_CONS_TYP)
                            {
                                structCsv.seth_CONS_TYP((String) v.get(CSV_COLNO_CONS_TYP));
                            } else {
                                structCsv.seth_CONS_TYP((String)null);
                            }
                            // ��10���i�\�����[�h�^�C���g�p�t���O
                            if(intColNum > CSV_COLNO_PS_LT_FLG)
                            {
                                structCsv.seth_PS_LT_FLG((String) v.get(CSV_COLNO_PS_LT_FLG));
                            } else {
                                structCsv.seth_PS_LT_FLG((String)null);
                            }
                            // ��11���i�\���Œ蕪���[�h�^�C��
                            if(intColNum > CSV_COLNO_PS_FIXED_LT)
                            {
                                structCsv.seth_PS_FIXED_LT((String) v.get(CSV_COLNO_PS_FIXED_LT));
                            } else {
                                structCsv.seth_PS_FIXED_LT((String)null);
                            }
                            // ��12���i�\����ᕪ���[�h�^�C��
                            if(intColNum > CSV_COLNO_PS_PROP_LT)
                            {
                                structCsv.seth_PS_PROP_LT((String) v.get(CSV_COLNO_PS_PROP_LT));
                            } else {
                                structCsv.seth_PS_PROP_LT((String)null);
                            }
                            // ��13���i�\����ᕪ���b�g�T�C�Y
                            if(intColNum > CSV_COLNO_PS_PROP_LOT_SIZE)
                            {
                                structCsv.seth_PS_PROP_LOT_SIZE((String) v.get(CSV_COLNO_PS_PROP_LOT_SIZE));
                            } else {
                                structCsv.seth_PS_PROP_LOT_SIZE((String)null);
                            }
                            // ��14���i�\���Ɖ�L�[
                            if(intColNum > CSV_COLNO_PS_REF_NO)
                            {
                                structCsv.seth_PS_REF_NO((String) v.get(CSV_COLNO_PS_REF_NO));
                            } else {
                                structCsv.seth_PS_REF_NO((String)null);
                            }
                            // ��15�����Ϗ�敪
                            if(intColNum > CSV_COLNO_COST_UP_TYP)
                            {
                                structCsv.seth_COST_UP_TYP((String) v.get(CSV_COLNO_COST_UP_TYP));
                            } else {
                                structCsv.seth_COST_UP_TYP((String)null);
                            }
                            // ��16���v�ʓW�J�敪
                            if(intColNum > CSV_COLNO_MRP_EXP_TYP)
                            {
                                structCsv.seth_MRP_EXP_TYP((String) v.get(CSV_COLNO_MRP_EXP_TYP));
                            } else {
                                structCsv.seth_MRP_EXP_TYP((String)null);
                            }
                            // �����ڐ����K�v���ڐ�����OR�ȏ�̂Ƃ��͍��ڐ��ߕs���G���[��w_COLUMN_FLG�ɃJ���������Z�b�g����B
                            structCsv.setw_COLUMN_FLG(String.valueOf(intColNum));
                        }
                        // ���X�g�ǉ�
                        listCsv.add(structCsv);
                    }
                    else
                    {
                        //�x�N�^�[�������s�G���[
                        logMessage = "csvReader.Vector was Failed... line:" + strsCsvData[i];
                        setSyslogConfig(logMessage);
                        listCsv = null;
                        break;
                    }
                }

                // �b�r�u�f�[�^�����i�^�C�g���s�͏Ȃ��j
                if((listCsv == null) || (listCsv.size() <= 0))
                {
                    // �捞���s�܂��̓f�[�^�Ȃ�
                    ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
                    msgStruct.addError( emsg );
                    sysLog.warning(emsg, getsysUSER_CD());
                    listCsv = null;
                }
                else
                {
                    // �b�r�u�Ǎ��݌������O�\��
                    ExpjMessage emsg = new ExpjMessage( "AH00043", ""+listCsv.size());
                    sysLog.config(emsg, getsysUSER_CD());
                }
            }
        } catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
        }
        return listCsv;
    }

    /**
     * ���[�̃X�y�[�X������
     *
     * @param     input     ���͒l
     * @return  String  ������l
     */
    private String trim(String input){
        if(null == input)return null;
        return input.trim();
    }
    /**
     * �b�r�u�f�[�^���e�`�F�b�N����
     *
     * @param   listCsv CSV�f�[�^���X�g
     * @return  ����:true / �G���[:false
     */
    private boolean checkCsvData(List listCsv) throws BusinessProcessException, FoundationException
    {

        // ���O�o�͏��i�[�p

        boolean bSuccess = true;    // ���������t���O������
        int intSuccessCount = 0;    // �`�F�b�N���탌�R�[�h����
        int intCsvDataCount = 0;    // �Ώۃf�[�^����
        int ErrlineNo = 0;          // �G���[�s�ԍ�
        String CsvCnt = "16";       // CSV����
        String ErrItem = "";        // �G���[����
        String ErrItemWork1 = "";       // �G���[����1(���ڕҏW�p)
        String ErrItemWork2 = "";       // �G���[����2(���ڕҏW�p)
        String ErrItemWork3 = "";       // �G���[����3(���ڕҏW�p)
        String ErrCd = "";          // �G���[�敪
        String ErrNo = "";          // �G���[�ԍ�
        String ErrMsg = "";         // �G���[���b�Z�[�W
        int strLength = 0;          // ������̒����擾
        boolean result = false;     // �`�F�b�N���ʊi�[
        // �����ꍀ�ڎ擾�Ή�
        String locale = CoreTools.getLocale(sysUSER_CD);
        String property = "OrteusUserDic";
        String key = "";            // �����ꎫ���擾�L�[

        boolean chkflg = false;         // �w��L�[�`�F�b�N�p
        boolean chkPkeyflg = false;     // �w��L�[�`�F�b�N�p2
        String  range1 = "1";      // 0.0001 �` 99999999999999.9999
        String  range2 = "2";      // 0.0001 �` 99999.9999

        try {
            AA0160010Struct structCsv;
            intCsvDataCount = listCsv.size();

            // �z�񐶐�
            String  pKey1    [] = new String[intCsvDataCount];      // ��L�[1
            String  pKey2    [] = new String[intCsvDataCount];      // ��L�[2
            String  pKey3    [] = new String[intCsvDataCount];      // ��L�[3
            String[]  chkArray  = null;
            PsList = new ArrayList();
          boolean chkflg1     = false;                              // �w��L�[�`�F�b�N�p1
          boolean chkflg2     = false;                            // �w��L�[�`�F�b�N�p2
            
            // �V�X�e�����t�擾
            beginTransaction();
            strSysdate = struct.getsSysdate();

            // CSV�t�@�C���̍s��LOOP
            for(int i = 0; i < intCsvDataCount; i++)
            {
                chkArray = new String[5];
                // �G���[�t���O������
                boolean bError = false;
                // CSV���̎擾
                structCsv = (AA0160010Struct)listCsv.get(i);
                // ���ڐ��s���G���[�`�F�b�N
                if(structCsv.getw_COLUMN_FLG() != null && ("").equals(structCsv.getw_COLUMN_FLG()) != true && ("true").equals(_save_struct.getrdoDelete()) != true)
                {
                    ErrlineNo = i + 1;                  // �G���[�����s(���ۂ̃G���[�s)
//                  ErrItem = "���ډߕs��";             // �G���[����
                    // ������L�[�Z�b�g
                    key = "Expj.Cmt3099"; // ���ډߕs��
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                        // �G���[�敪
                    int cntColumn = Integer.parseInt(structCsv.getw_COLUMN_FLG());
                    if(cntColumn < CSV_NECESSARY_COLUMN){
                      ErrNo = "AA01500";                    // �G���[�ԍ�
                  }else{
                      ErrNo = "AA01519";                    // �G���[�ԍ�
                  }
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo,structCsv.getw_COLUMN_FLG());
                    ErrMsg = emsg.getMessage(locale);

                    // ���ډߕs���̏ꍇ�z��0ST�̂���-1����
                    int setColumnFlg = Integer.parseInt(structCsv.getw_COLUMN_FLG());
                    // �ߕs��CSV�z�񐔌v�Z
                    setColumnFlg = setColumnFlg - 1 ;
                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, String.valueOf(setColumnFlg),CSV_COLNO_99);
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs(�G���[�s�͔�΂��B)
                    continue;
                }

                ////////////////////////////////////////////////////////////////////////////////////
                // �ʃ`�F�b�N�����J�n
                ////////////////////////////////////////////////////////////////////////////////////

// ��1�e�i�ڔԍ� START========================================================
                // �K�{���ڃ`�F�b�N �e�i�ڔԍ�
                if(structCsv.geth_PARENT_ITEM_CD() == null || ("").equals(structCsv.geth_PARENT_ITEM_CD()) == true)
                {
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                  ErrItem = "�e�i�ڔԍ�";                         // �G���[����
                    // ������L�[�Z�b�g
                    key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01601";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }

                // ���͕⏕�@�\�`�F�b�N �e�i�ڔԍ�
                // ����25���ȏ�̏ꍇ�G���[
                strLength = StrLengthChk(structCsv.geth_PARENT_ITEM_CD());
                if(strLength > 25)
                {
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                  ErrItem = "�e�i�ڔԍ�";                         // �G���[����
                    // ������L�[�Z�b�g
                    key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01501";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }

                // �֑�����������̏ꍇ�G���[
                int iHankaku = chkHankaku(structCsv.geth_PARENT_ITEM_CD());
                if(iHankaku != 0)
                {
                    
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                  ErrItem = "�e�i�ڔԍ�";                         // �G���[����
                    // ������L�[�Z�b�g
                    key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(key, resource);
                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01524";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }
// ��1�e�i�ڔԍ� END==========================================================

// ��2�q�i�ڔԍ� START========================================================
                // �K�{���ڃ`�F�b�N �q�i�ڔԍ�
                if(structCsv.geth_COMP_ITEM_CD() == null || ("").equals(structCsv.geth_COMP_ITEM_CD()) == true)
                {
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                  ErrItem = "�q�i�ڔԍ�";                         // �G���[����
                    // ������L�[�Z�b�g
                    key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01602";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COMP_ITEM_CD);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }

                // ���͕⏕�@�\�`�F�b�N �q�i�ڔԍ�
                // ����25���ȏ�̏ꍇ�G���[
                strLength = StrLengthChk(structCsv.geth_COMP_ITEM_CD());
                if(strLength > 25)
                {
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                  ErrItem = "�q�i�ڔԍ�";                         // �G���[����
                    // ������L�[�Z�b�g
                    key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(key, resource);


                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01501";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COMP_ITEM_CD);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }

                // �֑�����������̏ꍇ�G���[
                iHankaku = chkHankaku(structCsv.geth_COMP_ITEM_CD());
                if(iHankaku != 0)
                {
                    
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                  ErrItem = "�q�i�ڔԍ�";                         // �G���[����
                    // ������L�[�Z�b�g
                    key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(key, resource);


                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01524";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COMP_ITEM_CD);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }
// ��2�q�i�ڔԍ� END==========================================================

// ��3���i�\���Ő� START======================================================
                // �K�{���ڃ`�F�b�N ���i�\���Ő�
                if(structCsv.geth_PS_EDITION() == null || ("").equals(structCsv.geth_PS_EDITION()) == true)
                {
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                  ErrItem = "���i�\���Ő�";                       // �G���[����
                    // ������L�[�Z�b�g
                    key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01603";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_EDITION);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }

                // ���͕⏕�@�\�`�F�b�N 
                // ����25���ȏ�̏ꍇ�G���[
                strLength = StrLengthChk(structCsv.geth_PS_EDITION());
                if(strLength > 25)
                {
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                  ErrItem = "���i�\���Ő�";                       // �G���[����
                    // ������L�[�Z�b�g
                    key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01501";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_EDITION);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }

                // �֑�����������̏ꍇ�G���[
                iHankaku = chkHankaku(structCsv.geth_PS_EDITION());
                if(iHankaku != 0)
                {
                    
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                  ErrItem = "���i�\���Ő�";                       // �G���[����
                    // ������L�[�Z�b�g
                    key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01524";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_EDITION);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }
// ��3���i�\���Ő� END========================================================

                // ���o�^���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���o�^��)��
                if (("true").equals(_save_struct.getrdoInsert()) == true)
                {
                    if (chkflg == false)
                    {
                        // 1���
                        // �e�i�ڔԍ��A�q�i�ڔԍ��A���i�\���Ő���z��ɃZ�b�g
                        pKey1[i] = structCsv.geth_PARENT_ITEM_CD();       // �e�i�ڔԍ�
                        pKey2[i] = structCsv.geth_COMP_ITEM_CD();             // �q�i�ڔԍ�
                        pKey3[i] = structCsv.geth_PS_EDITION();               // ���i�\���Ő�

                        // �`�F�b�N�t���O��true���Z�b�g
                        chkflg = true;
                    } else {
                        // 2��ڈȍ~
                        chkPkeyflg = true;
                        // �z��̍Ōォ��t�������ē����H��R�[�h�A�i�ڔԍ��A�i�ڕʍ�ƃR�[�h�����݂��Ȃ����`�F�b�N����B
                        for (int j = i - 1; j >= 0; j--)
                        {
                            if ((structCsv.geth_PARENT_ITEM_CD()).equals(String.valueOf(pKey1[j])) == true &&
                                (structCsv.geth_COMP_ITEM_CD()).equals(String.valueOf(pKey2[j])) == true &&
                                (structCsv.geth_PS_EDITION()).equals(String.valueOf(pKey3[j])) == true )
                            {
                                // �z����ň�ӃL�[�ᔽ(false)�̏ꍇ�m�F�t���O��"false"�ɃZ�b�g�B
                                chkPkeyflg = false;
                                // ���[�v�𔲂���B
                                break;
                            }
                        }

                        // ��ӃL�[�ᔽ�̏ꍇ�G���[
                        if (chkPkeyflg == false)
                        {

                            ErrlineNo = i + 1;                                  // �G���[�����s(���ۂ̃G���[�s)

                            // ������L�[�Z�b�g
                            key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItemWork1 = CoreTools.getRBString(key, resource);

                            // ������L�[�Z�b�g
                            key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                            ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItemWork2 = CoreTools.getRBString(key, resource2);

                            // ������L�[�Z�b�g
                            key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                            ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItemWork3 = CoreTools.getRBString(key, resource3);

                            // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                            ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                            ErrCd = "1";                                        // �G���[�敪
                            ErrNo = "ZZ01102";                                  // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // �e�i�ڔԍ��A�q�i�ڔԍ��A���i�\���Ő���z��ɃZ�b�g
                        pKey1[i] = structCsv.geth_PARENT_ITEM_CD();       // �e�i�ڔԍ�
                        pKey2[i] = structCsv.geth_COMP_ITEM_CD();           // �q�i�ڔԍ�
                        pKey3[i] = structCsv.geth_PS_EDITION();             // ���i�\���Ő�
                    }

                    struct.setsetPARENT_ITEM_CD(structCsv.geth_PARENT_ITEM_CD());
                    struct.setsetCOMP_ITEM_CD(structCsv.geth_COMP_ITEM_CD());
                    struct.setsetPS_EDITION(structCsv.geth_PS_EDITION());
                    result = entity.mcheckM_PS.check(conn, struct);
                    if(result == true)
                    {
                        ErrlineNo = i + 1;                                  // �G���[�����s(���ۂ̃G���[�s)
//                      ErrItem = "�e�i�ڔԍ��A�q�i�ڔԍ��A���i�\���Ő�";   // �G���[����
                        // ������L�[�Z�b�g
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // ������L�[�Z�b�g
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // ������L�[�Z�b�g
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                        ErrCd = "1";                                        // �G���[�敪
                        ErrNo = "ZZ01102";                                  // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                }   // end if���o�^��

                // ���o�^OR�X�V���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���o�^OR�X�V��)��
                if (("true").equals(_save_struct.getrdoInsert()) == true || ("true").equals(_save_struct.getrdoUpdate()) == true )
                {

// ��4���i�\���P�ʐ����� START================================================
                    // ��ʃ`�F�b�N(���l) ���i�\���P�ʐ�����
                    if(structCsv.geth_PS_UNIT_DENOMINATOR() == null || ("").equals(structCsv.geth_PS_UNIT_DENOMINATOR()) == true)
                    {
                        // CSV�t�@�C�����i�\���P�ʐ����ꂪ���ݒ肾�����ꍇ�A�����l1���Z�b�g����B
                        structCsv.seth_PS_UNIT_DENOMINATOR("1");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_PS_UNIT_DENOMINATOR()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\���P�ʐ�����";                 // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_UNIT_DENOMINATOR"; // Expj.PS_UNIT_DENOMINATOR=���i�\���P�ʐ�����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_UNIT_DENOMINATOR);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_PS_UNIT_DENOMINATOR(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\���P�ʐ�����";                 // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_UNIT_DENOMINATOR"; // Expj.PS_UNIT_DENOMINATOR=���i�\���P�ʐ�����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_UNIT_DENOMINATOR);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��4���i�\���P�ʐ����� END==================================================

// ��5���i�\���P�ʐ����q START================================================
                    // ��ʃ`�F�b�N(���l) ���i�\���P�ʐ����q
                    if(structCsv.geth_PS_UNIT_NUMERATOR() == null || ("").equals(structCsv.geth_PS_UNIT_NUMERATOR()) == true)
                    {
                        // CSV�t�@�C�����i�\���P�ʐ����q�����ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_PS_UNIT_NUMERATOR("1");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_PS_UNIT_NUMERATOR()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\���P�ʐ����q";                 // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_UNIT_NUMERATOR"; // Expj.PS_UNIT_NUMERATOR=���i�\���P�ʐ����q
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_UNIT_NUMERATOR);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_PS_UNIT_NUMERATOR(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\���P�ʐ����q";                 // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_UNIT_NUMERATOR"; // Expj.PS_UNIT_NUMERATOR=���i�\���P�ʐ����q
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_UNIT_NUMERATOR);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��5���i�\���P�ʐ����q END==================================================

// ��6���i�\���L���J�n�� START================================================
                    if(structCsv.geth_EFF_PHASE_IN_DATE() == null || ("").equals(structCsv.geth_EFF_PHASE_IN_DATE()) == true)
                    {
                    
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                      ErrItem = "���i�\���L���J�n��";                 // �G���[����
                        // ������L�[�Z�b�g
                        key = "Expj.Cmt1070"; // Expj.Cmt1070=���i�\���L���J�n��
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(key, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01604";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_EFF_PHASE_IN_DATE);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

                    if(StrDateChk(structCsv.geth_EFF_PHASE_IN_DATE()) != true )
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                      ErrItem = "���i�\���L���J�n��";                 // �G���[����
                        // ������L�[�Z�b�g
                        key = "Expj.Cmt1070"; // Expj.Cmt1070=���i�\���L���J�n��
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(key, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01606";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_EFF_PHASE_IN_DATE);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
// ��6���i�\���L���J�n�� END==================================================

// ��7���i�\���L���I���� START================================================
                    if(structCsv.geth_EFF_PHASE_OUT_DATE() == null || ("").equals(structCsv.geth_EFF_PHASE_OUT_DATE()) == true)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                      ErrItem = "���i�\���L���I����";                 // �G���[����
                        // ������L�[�Z�b�g
                        key = "Expj.Cmt1071"; // Expj.Cmt1071=���i�\���L���I����
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(key, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01605";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_EFF_PHASE_OUT_DATE);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

                    if(StrDateChk(structCsv.geth_EFF_PHASE_OUT_DATE()) != true )
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                      ErrItem = "���i�\���L���I����";                 // �G���[����
                        // ������L�[�Z�b�g
                        key = "Expj.Cmt1071"; // Expj.Cmt1071=���i�\���L���I����
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(key, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01606";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_EFF_PHASE_OUT_DATE);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
// ��7���i�\���L���I���� END==================================================

// ��8�\���d���� START========================================================
                    // ��ʃ`�F�b�N(���l) �\���d����
                    if(structCsv.geth_PS_SPOIL() == null || ("").equals(structCsv.geth_PS_SPOIL()) == true)
                    {
                        // CSV�t�@�C���\���d���������ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_PS_SPOIL("0");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_PS_SPOIL()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "�\���d����";                         // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_SPOIL"; // Expj.PS_SPOIL=�\���d����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_SPOIL);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_PS_SPOIL(),range2,false))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "�\���d����";                 // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_SPOIL"; // Expj.PS_SPOIL=�\���d����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_SPOIL);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��8�\���d���� END==========================================================

// ��9�x���敪 START=========================================================
                    // ��ʃ`�F�b�N(����) �x���敪
                    if(structCsv.geth_CONS_TYP() == null || ("").equals(structCsv.geth_CONS_TYP()) == true)
                    {
                        // CSV�t�@�C���x���敪�����ݒ肾�����ꍇ�A�����l1:�L���x�����Z�b�g����B
                        structCsv.seth_CONS_TYP("1");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_CONS_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "�x���敪";                           // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.CONS_TYP"; // Expj.CONS_TYP=�x���敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CONS_TYP);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �����`�F�b�N
                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_CONS_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "�x���敪";                           // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.CONS_TYP"; // Expj.CONS_TYP=�x���敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CONS_TYP);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��9�x���敪 END===========================================================

// ��10���i�\�����[�h�^�C���g�p�t���O START===================================
                    // ��ʃ`�F�b�N(����) ���i�\�����[�h�^�C���g�p�t���O
                    if(structCsv.geth_PS_LT_FLG() == null || ("").equals(structCsv.geth_PS_LT_FLG()) == true)
                    {
                        // CSV�t�@�C�����i�\�����[�h�^�C���g�p�t���O�����ݒ肾�����ꍇ�A�����l:0���Z�b�g����B
                        structCsv.seth_PS_LT_FLG("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_PS_LT_FLG()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\�����[�h�^�C���g�p�t���O";     // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_LT_FLG"; // Expj.PS_LT_FLG=���i�\�����[�h�^�C���g�p�t���O
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_LT_FLG);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �����`�F�b�N
                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_PS_LT_FLG());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\�����[�h�^�C���g�p�t���O";     // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_LT_FLG"; // Expj.PS_LT_FLG=���i�\�����[�h�^�C���g�p�t���O
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_LT_FLG);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��10���i�\�����[�h�^�C���g�p�t���O END=====================================

// ��11���i�\���Œ蕪���[�h�^�C�� START=======================================
                    // ��ʃ`�F�b�N(����) ���i�\���Œ蕪���[�h�^�C��
                    if(structCsv.geth_PS_FIXED_LT() == null || ("").equals(structCsv.geth_PS_FIXED_LT()) == true)
                    {
                        // CSV�t�@�C�����i�\���Œ蕪���[�h�^�C�������ݒ肾�����ꍇ�A�����l:0���Z�b�g����B
                        structCsv.seth_PS_FIXED_LT("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_PS_FIXED_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\���Œ蕪���[�h�^�C��";         // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_FIXED_LT"; // Expj.PS_FIXED_LT=���i�\���Œ蕪���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_FIXED_LT);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �����`�F�b�N
                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_PS_FIXED_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\���Œ蕪���[�h�^�C��";         // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_FIXED_LT"; // Expj.PS_FIXED_LT=���i�\���Œ蕪���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);
                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_FIXED_LT);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��11���i�\���Œ蕪���[�h�^�C�� END=========================================

// ��12���i�\����ᕪ���[�h�^�C�� START=======================================
                    // ��ʃ`�F�b�N(����) ���i�\����ᕪ���[�h�^�C��
                    if(structCsv.geth_PS_PROP_LT() == null || ("").equals(structCsv.geth_PS_PROP_LT()) == true)
                    {
                        // CSV�t�@�C�����i�\����ᕪ���[�h�^�C�������ݒ肾�����ꍇ�A�����l:0���Z�b�g����B
                        structCsv.seth_PS_PROP_LT("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_PS_PROP_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\����ᕪ���[�h�^�C��";         // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_PROP_LT"; // Expj.PS_PROP_LT=���i�\����ᕪ���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_PROP_LT);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �����`�F�b�N
                        // ����6���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_PS_PROP_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\����ᕪ���[�h�^�C��";         // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_PROP_LT"; // Expj.PS_PROP_LT=���i�\����ᕪ���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_PROP_LT);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��12���i�\����ᕪ���[�h�^�C�� END=========================================

// ��13���i�\����ᕪ���b�g�T�C�Y START=======================================
                    // ��ʃ`�F�b�N(���l) ���i�\����ᕪ���b�g�T�C�Y
                    if(structCsv.geth_PS_PROP_LOT_SIZE() == null || ("").equals(structCsv.geth_PS_PROP_LOT_SIZE()) == true)
                    {
                        // CSV�t�@�C�����i�\����ᕪ���b�g�T�C�Y�����ݒ肾�����ꍇ�A�����l1���Z�b�g����B
                        structCsv.seth_PS_PROP_LOT_SIZE("1");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_PS_PROP_LOT_SIZE()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\����ᕪ���b�g�T�C�Y";         // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_PROP_LOT_SIZE"; // Expj.PS_PROP_LOT_SIZE=���i�\����ᕪ���b�g�T�C�Y
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_PROP_LOT_SIZE);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_PS_PROP_LOT_SIZE(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\����ᕪ���b�g�T�C�Y";         // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_PROP_LOT_SIZE"; // Expj.PS_PROP_LOT_SIZE=���i�\����ᕪ���b�g�T�C�Y
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_PROP_LOT_SIZE);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��13���i�\����ᕪ���b�g�T�C�Y END=========================================

// ��14���i�\���Ɖ�L�[ START=================================================
                    // ��ʃ`�F�b�N(����) ���i�\���Ɖ�L�[
                    if(structCsv.geth_PS_REF_NO() == null || ("").equals(structCsv.geth_PS_REF_NO()) == true)
                    {
                        // CSV�t�@�C�����i�\���Ɖ�L�[�����ݒ肾�����ꍇ�A�����l:0���Z�b�g����B
                        structCsv.seth_PS_REF_NO("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_PS_REF_NO()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\���Ɖ�L�[";                   // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_REF_NO"; // Expj.PS_REF_NO=���i�\���Ɖ�L�[
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_REF_NO);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �����`�F�b�N
                        // ����6���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_PS_REF_NO());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\���Ɖ�L�[";                   // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_REF_NO"; // Expj.PS_REF_NO=���i�\���Ɖ�L�[
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_REF_NO);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��14���i�\���Ɖ�L�[ END===================================================

// ��15�����Ϗ�敪 START=====================================================
                    // ��ʃ`�F�b�N(����) �����Ϗ�敪
                    if(structCsv.geth_COST_UP_TYP() == null || ("").equals(structCsv.geth_COST_UP_TYP()) == true)
                    {
                        // CSV�t�@�C�������Ϗ�敪�����ݒ肾�����ꍇ�A�����l:0���Z�b�g����B
                        structCsv.seth_COST_UP_TYP("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_COST_UP_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "�����Ϗ�敪";                       // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.COST_UP_TYP"; // Expj.COST_UP_TYP=�����Ϗ�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COST_UP_TYP);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �����`�F�b�N
                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_COST_UP_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "�����Ϗ�敪";                       // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.COST_UP_TYP"; // Expj.COST_UP_TYP=�����Ϗ�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COST_UP_TYP);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��15�����Ϗ�敪 END=======================================================

// ��16���v�ʓW�J�敪 START===================================================
                    // ��ʃ`�F�b�N(����) ���v�ʓW�J�敪
                    if(structCsv.geth_MRP_EXP_TYP() == null || ("").equals(structCsv.geth_MRP_EXP_TYP()) == true)
                    {
                        // CSV�t�@�C�����v�ʓW�J�敪�����ݒ肾�����ꍇ�A�����l:0���Z�b�g����B
                        structCsv.seth_MRP_EXP_TYP("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_MRP_EXP_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���v�ʓW�J�敪";                     // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.MRP_EXP_TYP"; // Expj.MRP_EXP_TYP=���v�ʓW�J�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_EXP_TYP);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �����`�F�b�N
                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_MRP_EXP_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���v�ʓW�J�敪";                     // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.MRP_EXP_TYP"; // Expj.MRP_EXP_TYP=���v�ʓW�J�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_EXP_TYP);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��16���v�ʓW�J�敪 END=====================================================

// �R���{�{�b�N�X�f�[�^�`�F�b�N START-------------------------------------------------------------------------------------------

// ��1�x���敪�R���{ START====================================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �x���敪
                    if(structCsv.geth_CONS_TYP() != null && ("").equals(structCsv.geth_CONS_TYP()) != true)
                    {
                        struct.setsetNAME("CONS_TYP");
                        struct.setsetVALUE(structCsv.geth_CONS_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) 
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "�x���敪";                           // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.CONS_TYP"; // Expj.CONS_TYP=�x���敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CONS_TYP);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��1�x���敪�R���{ END======================================================


// ��2���i�\�����[�h�^�C���g�p�t���O�R���{ START====================================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �x���敪
                    if(structCsv.geth_PS_LT_FLG() != null && ("").equals(structCsv.geth_PS_LT_FLG()) != true)
                    {
                        struct.setsetNAME("PS_LT_FLG");
                        struct.setsetVALUE(structCsv.geth_PS_LT_FLG());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) 
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���i�\�����[�h�^�C���g�p�t���O";                         // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.PS_LT_FLG"; // Expj.PS_LT_FLG=���i�\�����[�h�^�C���g�p�t���O
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_LT_FLG);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��2���i�\�����[�h�^�C���g�p�t���O�R���{ END======================================================

// ��3�����Ϗ�敪�R���{ START================================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �x���敪
                    if(structCsv.geth_COST_UP_TYP() != null && ("").equals(structCsv.geth_COST_UP_TYP()) != true)
                    {
                        struct.setsetNAME("COST_UP_TYP");
                        struct.setsetVALUE(structCsv.geth_COST_UP_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) 
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "�����Ϗ�敪";                       // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.COST_UP_TYP"; // Expj.COST_UP_TYP=�����Ϗ�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COST_UP_TYP);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��3�����Ϗ�L���R���{ END==================================================

// ��4���v�ʓW�J�敪�R���{ START==============================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N ���v�ʓW�J�敪
                    if(structCsv.geth_MRP_EXP_TYP() != null && ("").equals(structCsv.geth_MRP_EXP_TYP()) != true)
                    {
                        struct.setsetNAME("MRP_EXP_TYP");
                        struct.setsetVALUE(structCsv.geth_MRP_EXP_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) 
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                          ErrItem = "���v�ʓW�J�敪";                     // �G���[����
                            // ������L�[�Z�b�g
                            key = "Expj.MRP_EXP_TYP"; // Expj.MRP_EXP_TYP=���v�ʓW�J�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_EXP_TYP);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��4���v�ʓW�J�敪�R���{ END================================================

// �R���{�{�b�N�X�f�[�^�`�F�b�N END-------------------------------------------------------------------------------------------

// �X�V�`�F�b�N����-1
// 1���i�ڂ̓��ꐫ���� �o�^���X�V�� START=====================================
                    if (structCsv.geth_PARENT_ITEM_CD().equals(structCsv.geth_COMP_ITEM_CD()) == true)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        
                        // ������L�[�Z�b�g
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // ������L�[�Z�b�g
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // ������L�[�Z�b�g
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00051";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
// 1���i�ڔԍ�=�\���i�ڔԍ��`�F�b�N END=======================================

// 2���L���J�n��>�L���I�����`�F�b�N �o�^���X�V�� START========================
                    int intcompChk = compareYMD(structCsv.geth_EFF_PHASE_IN_DATE(), structCsv.geth_EFF_PHASE_OUT_DATE());
                    if (intcompChk > 0)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                      ErrItem = "���i�\���L���J�n���A���i�\���L���I����";                         // �G���[����
                        // ������L�[�Z�b�g
                        key = "Expj.Cmt1070"; // Expj.Cmt1070=���i�\���L���J�n��
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // ������L�[�Z�b�g
                        key = "Expj.Cmt1071"; // Expj.Cmt1071=���i�\���L���I����
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // �G���[���ڕҏW
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2;

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00048";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_EFF_PHASE_IN_DATE);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                        
                    }
// 2���L���J�n��>�L���I�����`�F�b�N END=======================================

// 3�����i�\���̕i�ڎ�z�敪�`�F�b�N �o�^���X�V�� START=======================
// 4�����i�\���̏d�����ԃ`�F�b�N �o�^���X�V�� START===========================
// 5�����i�\���̃��[�s���O�`�F�b�N �o�^�� START===============================

          // �b�r�u�t�@�C���֘A BEGIN========================================
                
                    if (chkflg1 == false)
                    {
                        // 1���
                        // �`�F�b�N�t���O��true���Z�b�g
                        chkflg1 = true;
                    } else {
                        // 2��ڈȍ~
                        chkflg2 = true;
                        // �z��̍Ōォ��t�������ē����H��R�[�h�A�i�ڔԍ��ƈႤ�i�ڕʍ�ƃR�[�h�����݂��Ȃ����`�F�b�N����B
                        for (int cnt=0;cnt<PsList.size();cnt++)
                        {
                            String[] strData = (String[])PsList.get(cnt);
                            if ((structCsv.geth_PARENT_ITEM_CD().equals(strData[0])) == true &&
                                (structCsv.geth_COMP_ITEM_CD().equals(strData[1]))     == true &&
                                (structCsv.geth_PS_EDITION().equals(strData[2]))       != true )
                            {
                                if(chkConflictEffPhase(strData[3],strData[4],structCsv.geth_EFF_PHASE_IN_DATE(),structCsv.geth_EFF_PHASE_OUT_DATE())){
                            chkflg2 = false;
                                    // ���[�v�𔲂���B
                                    break;
                                }
                            }
                        }
                        
                        // ��ӃL�[�ᔽ�̏ꍇ�G���[
                        if (chkflg2 == false)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            
                            // ������L�[�Z�b�g
                            key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItemWork1 = CoreTools.getRBString(key, resource);
    
                            // ������L�[�Z�b�g
                            key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                            ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItemWork2 = CoreTools.getRBString(key, resource2);
    
                            // ������L�[�Z�b�g
                            key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                            ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItemWork3 = CoreTools.getRBString(key, resource3);
    
                            // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                            ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;
    
                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00054";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);
    
                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
                        
          try{
                        // �o�^���̂ݐ��i�\�����[�s���O�`�F�b�N
                        if (("true").equals(_save_struct.getrdoInsert()) == true )
                        {
                            // ���i�\���̃��[�s���O�����ECsv�f�[�^
                            //if (struct.geth_DEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                            // ���W�J�̏ꍇ
                            chkLoopingCompPs(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());
                            ////} else {
                            // �t�W�J�̏ꍇ
                            chkLoopingParentPs(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());
                            //}
                        }
                    } catch (PsLoopException ple) {
                        // �x���F�\�����ɖ���������܂��B
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        
                        // ������L�[�Z�b�g
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // ������L�[�Z�b�g
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // ������L�[�Z�b�g
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00055";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                        
          // �b�r�u�t�@�C���֘A END==========================================
          // DB�֘A BEGIN====================================================
                    try{
                        // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z

                        _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(), strSysdate);

                        // �B���i�\���̕i�ڎ�z�敪����(�����F�e�i�ڔԍ��A�q�i�ڔԍ�)
                        _psMaint.testMrpOrderType(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());

                        // �C���i�\���̏d�����Ԍ���(�����F�e�i�ڔԍ��A�q�i�ڔԍ��A�L���J�n���A�L���I����)
                        _psMaint.testConflictEffPhase(structCsv.geth_PARENT_ITEM_CD(),
                                structCsv.geth_COMP_ITEM_CD(), structCsv.geth_PS_EDITION(),
                                structCsv.geth_EFF_PHASE_IN_DATE(), structCsv.geth_EFF_PHASE_OUT_DATE());

                        // �D�o�^���̂ݐ��i�\�����[�s���O�`�F�b�N
                        if (("true").equals(_save_struct.getrdoInsert()) == true )
                        {
                            // ���i�\���̃��[�s���O����
                            //if (struct.geth_DEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                            // ���W�J�̏ꍇ
                            _psMaint.testLoopingCompPs(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());
                            ////} else {
                            // �t�W�J�̏ꍇ
                            _psMaint.testLoopingParentPs(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());
                            //}
// 2008/07/29 SYSCOM �镔 ADD START
                            // �i�ڂ̍H���Ǘ��i�ڋ敪����
                            _psMaint.testManhourTyp(structCsv.geth_PARENT_ITEM_CD());
// 2008/07/29 SYSCOM �镔 ADD END
                        }

                    } catch (PsMrpOdrTypException pmote) {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        
                        // ������L�[�Z�b�g
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // ������L�[�Z�b�g
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // ������L�[�Z�b�g
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00052";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    } catch (PsEffPhaseException pepe) {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        
                        // ������L�[�Z�b�g
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // ������L�[�Z�b�g
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // ������L�[�Z�b�g
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00054";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    } catch (PsLoopException ple) {
                        // �x���F�\�����ɖ���������܂��B
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        
                        // ������L�[�Z�b�g
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // ������L�[�Z�b�g
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // ������L�[�Z�b�g
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00055";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
// 2008/07/29 SYSCOM �镔 ADD START
                    } catch (PsManhourTypException pmte) {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)

                        // ������L�[�Z�b�g
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // ������L�[�Z�b�g
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // ������L�[�Z�b�g
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00178";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
// 2008/07/29 SYSCOM �镔 ADD END
                    } catch (NoDataException nde) {
                        // �x���F�Ώۃf�[�^�����݂��܂���B
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        
                        // ������L�[�Z�b�g
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // ������L�[�Z�b�g
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // ������L�[�Z�b�g
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "ZZ06001";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
          // DB�֘A END=======================================================

// 3�����i�\���̕i�ڎ�z�敪�`�F�b�N �o�^���X�V�� END=========================
// 4�����i�\���̏d�����ԃ`�F�b�N �o�^���X�V�� END=============================
// 5�����i�\���̃��[�s���O�`�F�b�N �o�^�� END=================================
                }   // end if(���o�^OR�X�V��)

                // ���X�Vor�폜���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���X�Vor�폜��)��
                if (("true").equals(_save_struct.getrdoUpdate()) == true || ("true").equals(_save_struct.getrdoDelete()) == true )
                {
                    struct.setsetPARENT_ITEM_CD(structCsv.geth_PARENT_ITEM_CD());
                    struct.setsetCOMP_ITEM_CD(structCsv.geth_COMP_ITEM_CD());
                    struct.setsetPS_EDITION(structCsv.geth_PS_EDITION());
                    result = entity.mcheckM_PS.check(conn, struct);
                    if(result == false)
                    {
                        ErrlineNo = i + 1;                                  // �G���[�����s(���ۂ̃G���[�s)
//                      ErrItem = "�e�i�ڔԍ��A�q�i�ڔԍ��A���i�\���Ő�";   // �G���[����
                        // ������L�[�Z�b�g
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // ������L�[�Z�b�g
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // ������L�[�Z�b�g
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                        ErrCd = "1";                                        // �G���[�敪
                        ErrNo = "ZZ06001";                                  // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                }   // end if���X�Vor�폜��
                
// �o�^/�X�V���`�F�b�N END-------------------------------------------------------------------------------------------

                
                // �`�F�b�N�G���[�ƂȂ��Ă��Ȃ��ꍇ�A���탌�R�[�h�Ƃ��ăJ�E���g
                if(bError != true)
                {
                    // �e�i�ڔԍ��A�q�i�ڔԍ��A���i�\���Ő��A���i�\���L���J�n���A���i�\���L���I������z��ɃZ�b�g
                    chkArray[0] = structCsv.geth_PARENT_ITEM_CD();        // �e�i�ڔԍ�
                    chkArray[1] = structCsv.geth_COMP_ITEM_CD();            // �q�i�ڔԍ�
                    chkArray[2]  = structCsv.geth_PS_EDITION();             // ���i�\���Ő�
                    chkArray[3] = structCsv.geth_EFF_PHASE_IN_DATE();         // ���i�\���L���J�n��
                    chkArray[4] = structCsv.geth_EFF_PHASE_OUT_DATE();      // ���i�\���L���I����
                    PsList.add(chkArray);
                    intSuccessCount++;
                }
                ////////////////////////////////////////////////////////////////////////////////////
                // �ʃ`�F�b�N�����I��
                ////////////////////////////////////////////////////////////////////////////////////
            }  //for end
            // �`�F�b�N���ʏ���(�G���[���X�g�T�C�Y�̎擾)
            if(getListsize() > 0)
            {
                bSuccess = false;
            }

            // �G���[�f�[�^���ݎ��A��ʲ�̫Ұ��݂֏o��
            if(("true").equals(_save_struct.getDO_CHK()) == true && bSuccess != true)
            {
                // �G���[�f�[�^�L��̂��ߍX�V���Ȃ������ꍇ�̃��b�Z�[�W�\��
                ExpjMessage emsg = new ExpjMessage( "AA01608",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
                msgStruct.addInfo( emsg );
                sysLog.config(emsg, getsysUSER_CD());
            } else {
                // �G���[�f�[�^���ݎ��A��ʲ�̫Ұ��݂֏o��
                if(bSuccess != true)
                {
                    // �G���[����������΃��b�Z�[�W�\������
                    // �Ȃ���΃��X�g(���[�j���O)�݂̂Ɣ��肷��B
                    if ((intCsvDataCount - intSuccessCount) > 0)
                    {
                        // �G���[�f�[�^�L��̂��ߍX�V���Ȃ������ꍇ�̃��b�Z�[�W�\��
                        ExpjMessage emsg = new ExpjMessage( "AA01607",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
                        msgStruct.addError( emsg );
                        sysLog.severe(emsg, getsysUSER_CD());
                    }
                }
            }

        }catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
        }
        return bSuccess;
    }

    /**
     * �t�@�C���l�[�~���O
     *
     * @return  ����:true / �G���[:false
     */
  private boolean chkOutputFilePath() throws BusinessProcessException, FoundationException
  {
    String filePath = null;
    try{
        // �o�̓t�@�C���l�[�~���O
            PrivateConfig pc = new PrivateConfig(conn);
            // �������O�t�@�C�����擾(�V�X�e���p�����[�^���擾)
            String CsvCancelFileName = pc.getString("PS_CANCEL");
            if(null == CsvCancelFileName || "".equals(CsvCancelFileName)){
                  msgStruct.clear();
                    // �G���[���b�Z�[�W�\��
                    ExpjMessage emsg = new ExpjMessage( "AA01521");
                    msgStruct.addError( emsg );
                    sysLog.severe(emsg, getsysUSER_CD());
                    return false;
            }
            // �t�@�C���l�[�~���O
            FileNaming fnm = new FileNaming();
            // ���[�U
            fnm.setUser(getsysUSER_CD());
            // �g���q
            fnm.setExtension(EXTENSION_CSV);
            // �f�B���N�g��
            fnm.setDirectory(CsvCancelFileName);
            filePath = fnm.naming();
            if(null == filePath || "".equals(filePath)){
                  msgStruct.clear();
                    // �G���[���b�Z�[�W�\��
                    ExpjMessage emsg = new ExpjMessage( "AA01522");
                    msgStruct.addError( emsg );
                    sysLog.severe(emsg, getsysUSER_CD());
                    return false;
            }
        }catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
        }
        struct.setCANCEL_FILE(filePath);
        return true;
  }
    /**
     * �b�r�u�f�[�^�c�a���f����
     *
     * @param   listCsv CSV�f�[�^���X�g
     * @return  ����:true / �G���[:false
     */
    private boolean csvData2Db(List listCsv) throws BusinessProcessException, FoundationException
    {
        // ���O�o�͏��i�[�p
        String logMessage = "";

        boolean bSuccess = true;    // ���������t���O������
        boolean aSuccess = true;    // ���������t���O������(���b�Z�[�W)
        boolean bDBUpdate = false;  // DB�X�V���t���O������
        boolean bWrite = false; // �����t�@�C��
        int intCsvDataCount = 0;    // �Ώۃf�[�^����
        int intSuccessCount = 0;    // �`�F�b�N���탌�R�[�h����
        String strUserId = "";      // �������O�o�͗p(���[�U�[ID)
        String strSyoriKbn = "";    // �������O�o�͗p(�����敪)
        String strDataKbn = "";     // �������O�o�͗p(�ύX�f�[�^�敪)

        // �������O��struct����ޔ�
        AA0160010Struct structCopy = new AA0160010Struct();
        structCopy.copy(struct);
        try
        {
            AA0160010Struct structCsv;
            // �g�����U�N�V�����J�n
            conn.beginTransWeb();
            // DB�X�V���t���OON
            bDBUpdate = true;

            // �V�X�e�����t�擾
            beginTransaction();
            strSysdate = struct.getsSysdate();

            // �f�[�^�������������J��Ԃ�
            intCsvDataCount = listCsv.size();
            for(int i = 0; i < intCsvDataCount; i++)
            {
                // CSV���擾
                struct.copy((AA0160010Struct)listCsv.get(i));
                struct.setCANCEL_FILE(structCopy.getCANCEL_FILE());
                structCsv = (AA0160010Struct)listCsv.get(i);
                strUserId = "";     // �������O�o�͗p������(���[�U�[ID)
                strSyoriKbn = "";   // �������O�o�͗p������(�����敪)
                strDataKbn = "";    // �������O�o�͗p������(�ύX�f�[�^�敪)

                // �e��ʂ̃��W�I�{�^����1:�o�^�̏ꍇ�̏���
                if (("true").equals(_save_struct.getrdoInsert()) == true)
                {
                    // �����i�\���}�X�^�o�^������
                    entity.minsertM_PS.create(conn, struct);

                    if(("true").equals(_save_struct.getDO_CHK()) != true){
                    	// [SYS���ݼ�ٔԍ�]�ő�l�̎擾
                    	List listSeqNo = entity.mreadSYS_PS_T.read(conn, struct);
                    	if(listSeqNo.size() > 0) {
                    		// �����i�\���g�����U�N�V�����o�^������
                    		struct.seth_SEQ_NO(((AA0160010Struct)listSeqNo.get(0)).getreadMAXSEQ_NO()); // SYS���ݼ�ٔԍ�
                    		struct.seth_ACCESS_TYP("1");                                                // �������@(1:�ǉ�)
                    		struct.seth_CMPLT_FLG("0");                                                 // �����׸�(0:��)
                    		entity.minsertSYS_PS_T.create(conn, struct);
                    	}

                    	// *�������O�o�͏���*
                    	strUserId = getsysUSER_CD();            // ���[�U�[ID�Z�b�g
                    	strSyoriKbn = "1";                      // �����敪�Z�b�g(1:�o�^)
                    	strDataKbn = "2";                       // �ύX�f�[�^�敪�Z�b�g
                    	// ����CSV�o�͏���(����:�Ώۍs�A�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�f�[�^�敪)
                    	csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn, bWrite );
                    	bWrite = true;
                    }
                }
                // �e��ʂ̃��W�I�{�^����2:�ύX�̏ꍇ�̏���
                if (("true").equals(_save_struct.getDO_CHK()) != true) {
                	if (("true").equals(_save_struct.getrdoUpdate()) == true)
                	{
                		// *�������O�o�͏���*
                		strUserId = getsysUSER_CD();            // ���[�U�[ID�Z�b�g
                		strSyoriKbn = "2";                      // �����敪�Z�b�g(2:�ύX)
                		strDataKbn = "1";                       // �ύX�f�[�^�敪�Z�b�g
                		// ����CSV�o�͏���(����:�Ώۍs�A�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�f�[�^�敪)
                		csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn, bWrite );
                		bWrite = true;

                		// �����i�\���}�X�^�X�V������
                		entity.mupdateM_PS.update(conn, struct);
                		strDataKbn = "2";                       // �ύX�f�[�^�敪�Z�b�g
                		// ����CSV�o�͏���(����:�Ώۍs�A�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�f�[�^�敪)
                		csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn, bWrite );
                		bWrite = true;
                	}
                }
                // �e��ʂ̃��W�I�{�^����3:�폜�̏ꍇ�̏���
                if (("true").equals(_save_struct.getrdoDelete()) == true)
                {
                	if (("true").equals(_save_struct.getDO_CHK()) != true) {
                		// *�������O�o�͏���*
                		strUserId = getsysUSER_CD();            // ���[�U�[ID�Z�b�g
                		strSyoriKbn = "3";                      // �����敪�Z�b�g(3:�폜)
                		strDataKbn = "1";                       // �ύX�f�[�^�敪�Z�b�g
                		// ����CSV�o�͏���(����:�Ώۍs�A�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�f�[�^�敪)
                		csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn, bWrite );
                		bWrite = true;
                	}
                    
                    	// �����i�\���}�X�^�폜������
                    	entity.mdeleteM_PS.delete(conn, struct);

                    if (("true").equals(_save_struct.getDO_CHK()) != true) {
                    	// [SYS���ݼ�ٔԍ�]�ő�l�̎擾
                    	List listSeqNo = entity.mreadSYS_PS_T.read(conn, struct);
                    	if(listSeqNo.size() > 0) {
                    		// �����i�\���g�����U�N�V�����o�^������
                    		struct.seth_SEQ_NO(((AA0160010Struct)listSeqNo.get(0)).getreadMAXSEQ_NO()); // SYS���ݼ�ٔԍ�
                    		struct.seth_ACCESS_TYP("2");                                                // �������@(1:�폜)
                    		struct.seth_CMPLT_FLG("0");                                                 // �����׸�(0:��)
                    		entity.minsertSYS_PS_T.create(conn, struct);
                    	}
                    }
                }
            } // Endfor()
            // CSV�t�@�C���̍s��LOOP
            int ErrlineNo = 0;          // �G���[�s�ԍ�
            String CsvCnt = "16";       // CSV����
            String ErrItem = "";        // �G���[����
            String ErrItemWork1 = "";   // �G���[����1(���ڕҏW�p)
            String ErrItemWork2 = "";   // �G���[����2(���ڕҏW�p)
            String ErrItemWork3 = "";   // �G���[����3(���ڕҏW�p)
            String ErrCd = "";          // �G���[�敪
            String ErrNo = "";          // �G���[�ԍ�
            String ErrMsg = "";         // �G���[���b�Z�[�W
            // �����ꍀ�ڎ擾�Ή�
            String locale = CoreTools.getLocale(sysUSER_CD);
            String property = "OrteusUserDic";           
            String key = "";            // �����ꎫ���擾�L�[
            
            for(int i = 0; i < intCsvDataCount; i++)
            {
                // �G���[�t���O������
                boolean bError = false;
                // CSV���̎擾
                structCsv = (AA0160010Struct)listCsv.get(i);
                try{
                	// ���i�\���̃��[�s���O�����EDB�f�[�^
                	// ���i�\�����|�W�g���쐬
                	ProductStructureRepository repository = new ProductStructureRepository(conn);
                	// ���W�J�̏ꍇ
                	checkRooping(repository, structCsv.geth_PARENT_ITEM_CD(), structCsv.geth_COMP_ITEM_CD());
                	// �t�W�J�̏ꍇ
                	checkReverseRooping(repository, structCsv.geth_COMP_ITEM_CD(), structCsv.geth_PARENT_ITEM_CD());
                } catch (PsLoopException ple) {
                    // �x���F�\�����ɖ���������܂��B
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                    
                    // ������L�[�Z�b�g
                    key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItemWork1 = CoreTools.getRBString(key, resource);

                    // ������L�[�Z�b�g
                    key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                    ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItemWork2 = CoreTools.getRBString(key, resource2);

                    // ������L�[�Z�b�g
                    key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                    ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItemWork3 = CoreTools.getRBString(key, resource3);

                    // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                    ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA00055";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }
                try{
                	// ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
                	_psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(), strSysdate);

                	// ���i�\���̕i�ڎ�z�敪����(�����F�e�i�ڔԍ��A�q�i�ڔԍ�)
                	_psMaint.testMrpOrderType(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());

                } catch (PsMrpOdrTypException pmote) {
                	ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                
                	// ������L�[�Z�b�g
                	key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                	ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                	// �����ꍀ�ڎ擾�Z�b�g
                	ErrItemWork1 = CoreTools.getRBString(key, resource);

                	// ������L�[�Z�b�g
                	key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                	ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                	// �����ꍀ�ڎ擾�Z�b�g
                	ErrItemWork2 = CoreTools.getRBString(key, resource2);

                	// ������L�[�Z�b�g
                	key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                	ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                	// �����ꍀ�ڎ擾�Z�b�g
                	ErrItemWork3 = CoreTools.getRBString(key, resource3);

                	// �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                	ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                	ErrCd = "1";                                    // �G���[�敪
                	ErrNo = "AA00052";                              // �G���[�ԍ�
                	// ���b�Z�[�W�擾 
                	ExpjMessage emsg = new ExpjMessage(ErrNo);
                	ErrMsg = emsg.getMessage(locale);

                	// CSV�o��(�G���[)
                	csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                	// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                	structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                	// �G���[�t���O"true"�ɃZ�b�g
                	bError = true;
                	// �����ׂ֏������ڍs
                	continue;
                } catch (NoDataException nde) {
                    // �x���F�Ώۃf�[�^�����݂��܂���B
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                    
                    // ������L�[�Z�b�g
                    key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=�e�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItemWork1 = CoreTools.getRBString(key, resource);

                    // ������L�[�Z�b�g
                    key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=�q�i�ڔԍ�
                    ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItemWork2 = CoreTools.getRBString(key, resource2);

                    // ������L�[�Z�b�g
                    key = "Expj.PS_EDITION"; // Expj.PS_EDITION=���i�\���Ő�
                    ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItemWork3 = CoreTools.getRBString(key, resource3);

                    // �G���[���ڕҏW(�e�i�ڔԍ�+�q�i�ڔԍ�+���i�\���Ő�)
                    ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "ZZ06001";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    // �����ׂ֏������ڍs
                    continue;
                }
                // �`�F�b�N�G���[�ƂȂ��Ă��Ȃ��ꍇ�A���탌�R�[�h�Ƃ��ăJ�E���g
                if(bError != true){
                    intSuccessCount++;
                }
            }
            // �`�F�b�N���ʏ���(�G���[���X�g�T�C�Y�̎擾)
            if(getListsize() > 0)
            {
                bSuccess = false;
            }

            // �G���[�f�[�^���ݎ��A��ʲ�̫Ұ��݂֏o��
            if(("true").equals(_save_struct.getDO_CHK()) == true)
            {
                    // �G���[�f�[�^�L��̂��ߍX�V���Ȃ������ꍇ�̃��b�Z�[�W�\��
                    ExpjMessage emsg = new ExpjMessage( "AA01608",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
                    msgStruct.addInfo( emsg );
                    sysLog.config(emsg, getsysUSER_CD());
                    return false;
            } else {
                    // �G���[�f�[�^���ݎ��A��ʲ�̫Ұ��݂֏o��
                    if(bSuccess != true)
                    {
                        // �G���[����������΃��b�Z�[�W�\������
                        // �Ȃ���΃��X�g(���[�j���O)�݂̂Ɣ��肷��B
                        if ((intCsvDataCount - intSuccessCount) > 0)
                        {
                            // �G���[�f�[�^�L��̂��ߍX�V���Ȃ������ꍇ�̃��b�Z�[�W�\��
                            ExpjMessage emsg = new ExpjMessage( "AA01607",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
                            msgStruct.addError( emsg );
                            sysLog.severe(emsg, getsysUSER_CD());
                            return false;
                        }
                    } else {
                          // �G���[�E���[�j���O���Ȃ��ꍇ
                            ExpjMessage emsg = new ExpjMessage( "AA01514", ""+intSuccessCount);
                            msgStruct.addInfo( emsg );
                            sysLog.config(emsg, getsysUSER_CD());
                    }
            }

            // �R�~�b�g���s
            conn.commit();

            // DB�X�V���t���OOFF
            bDBUpdate = false;

            // ���������t���O�ݒ�
            bSuccess = true;
        } catch(SQLException e) {
            //logMessage = "M.ITEM_CD:" +  struct.geth_ITEM_CD();
            ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.severe(emsg, getsysUSER_CD());
            setSqlExceptionMsg(e);
        } finally {
            // DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
            if(bDBUpdate == true)
            {
                // ���[���o�b�N
                conn.rollback();

                logMessage = "Control�FcsvData2Db - rollback!! ";
                setSyslogConfig(logMessage);

                // �������O��struct��񕜋A
                struct.copy(structCopy);

				if(("true").equals(_save_struct.getDO_CHK()) != true){
                	// �X�V���s�̃��b�Z�[�W�\��
                	ExpjMessage emsg = new ExpjMessage( "AH00042", ""+intSuccessCount, ""+(intCsvDataCount - intSuccessCount));
                	msgStruct.addError( emsg );
                	sysLog.warning(emsg, getsysUSER_CD());
            	}
            }

            if(aSuccess == true)
            {
                if(bSuccess == true)
                {
                    // ����I���̃��b�Z�[�W�\��
                    //ExpjMessage emsg = new ExpjMessage( "UA00030", ""+intCsvDataCount, "0");
                    //msgStruct.addInfo( emsg );
                    //sysLog.config(emsg, getsysUSER_CD());
                }
            }
        }
        return bSuccess;
    }
//---------- �b�r�u�捞�֘A�̏��� END---------------------------------------------------


//---------- ���͊֘A�`�F�b�N�̏��� START---------------------------------------------------

    /**
    *   ���l�`�F�b�N
    *   ���ڂ����l�����f����
    *
    *   @param    strInString  ���̓p�����[�^
    *   @return ����:true / �G���[:false
    */
    public boolean IsNumChk(String strInString)
    {
        // ���l��input���Z�b�g�p
        //private int ElementNumUp;

        try
        {
            //int InString = Integer.valueOf(strInString).intValue();
            double InString = Double.parseDouble(strInString);
        }
        catch(Exception e)
        {
            // ���l�ł͂Ȃ��ꍇException�ɔ�΂��ď���
            // false���Z�b�g���ď����𔲂���(�G���[�F���l�ȊO�̓���)
            return false;
        }
        // true���Z�b�g���ď����𔲂���(����I��)
        return true;
    }

    /**
    *   ���l�͈̓`�F�b�N
    *   ���ڂ����l�͈͂����f����
    *
    *   @param    strInString  ���̓p�����[�^
    *   @param    strRangeFlg  "1"   : 99999999999999.9999 �` 0.0001
    *                          "2"   : 99999.9999 �` 0.0001
    *             bZeroFlg     true  : �`�F�b�N���A�[�����܂�
    *                          false : �`�F�b�N���A�[���͑ΏۊO
    *   @return ����:true / �G���[:false
    */
    public boolean isNotInNumRange(String strInString,String strRangeFlg,boolean bZeroFlg)
    {
        boolean b = false;                                             // �߂��l
        int ONE = 1;                                                   // ��r�t���O1
        int ZERO = 0;                                                  // ��r�t���O0
        BigDecimal bdZERO = new BigDecimal("0");                       // �Œ�l0
        BigDecimal in = new BigDecimal(strInString);                   // ���̓p�����[�^
        BigDecimal maxValue1 = new BigDecimal("99999999999999.9999");  // �Œ�l�ő�l
        BigDecimal maxValue2 = new BigDecimal("99999.9999");           // �Œ�l�ő�l
        BigDecimal minValue = new BigDecimal("0.0001");                // �Œ�l�ŏ��l
        
        if(!bZeroFlg){
            if(bdZERO.compareTo(in)==ZERO) return false;
      }
        // 99999999999999.9999 �` 0.0001�̔���
        if("1".equals(strRangeFlg)){
            if(in.compareTo(maxValue1)==ONE || minValue.compareTo(in) == ONE){
                b = true;
            }
        }
        // 99999.9999 �` 0.0001�̔���
        else{
            if(in.compareTo(maxValue2)==ONE || minValue.compareTo(in) == ONE){
                b = true;
            }
        }
        // �����I��
        return b;
    }
    
    /**
    *   �����񒷂��`�F�b�N
    *   
    *   @param    strInString  ���̓p�����[�^
    *   @return ����:true / �G���[:false
    */
    public int StrLengthChk(String strInput)
    {
        int intLen = 0;
        //strInput = GetSjisFromUni(strInput);

        try {
            byte[] bytstr = strInput.getBytes("SJIS");
            intLen = bytstr.length;
        } catch( Exception e )
            {return  0;}
    return intLen;
    }

    /**
    *   ���t�`�F�b�N
    *   
    *   @param    strInString  ���̓p�����[�^���t(####/##/##)
    *   @return ���t:true / ���t�ȊO:false
    */
    public boolean StrDateChk(String strInput)
    {
        int intYear;    // ����N�ޔ�p
        int intMonth;   // ���ޔ�p
        int intDay;     // ���ޔ�p

        // ���͕�����10��('####/##/##')�ȊO�̏ꍇ�G���[
        if (strInput.length() != 10)
        {
            return false;
        }

        // ���t�̐����`�F�b�N�A�����ȊO�̏ꍇ�G���[
        if(Calculate.isInteger(strInput.substring(0,4)) != true || 
            Calculate.isInteger(strInput.substring(5,7)) != true || 
            Calculate.isInteger(strInput.substring(8,10)) != true) 
        {
            return false;
        }

        // ���̓p�����[�^���t�؂蕪��
        intYear = Integer.parseInt(strInput.substring(0,4));
        intMonth = Integer.parseInt(strInput.substring(5,7));
        intDay = Integer.parseInt(strInput.substring(8,10));

        Calendar cal = new GregorianCalendar();
        cal.setLenient( false );
        cal.set(intYear, intMonth-1, intDay);

        try
        {
            java.util.Date ud = cal.getTime();
        }
        catch(IllegalArgumentException iae)
        {
            // ���t�ȊO�ꍇException�ɔ�΂��ď���
            // false���Z�b�g���ď����𔲂���(�G���[�F���t�ȊO�̓���)
            return false;
        }
        // true���Z�b�g���ď����𔲂���(����I��)
        return true;
    }

    /**
     * "yyyy/MM/dd"�`���̓��t��������r���܂��B
     * @param dateString1 ���t������P
     * @param dateString2 ���t������Q
     * @return ���t������P �� ���t������Q �̏ꍇ�� 0��߂��B���t������P �� ���t������Q �̏ꍇ�� 0 ��菬�����l��߂��B���t������P �� ���t������Q �̏ꍇ�� 0 ���傫���l��߂��B
     * @throws ParseException �p�����[�^�����t������ł͂Ȃ��B
     */
    public int compareYMD(String dateString1, String dateString2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Date date1 = sdf.parse(dateString1);
        Date date2 = sdf.parse(dateString2);

        return date1.compareTo(date2);
    }

    /**
     * �֑������`�F�b�N(�u_�v �u"�v�u\�v)
     * @param str  ������
     * @return     �u_�v: 1
     *             �u"�v: 2
     *             �u\�v: 3
     *            ���̑�: 0
     */
  private int chkHankaku(String str) {
        int state = 0;

        CharacterIterator iter = new StringCharacterIterator(str);

        for (char c = iter.first();
            c != CharacterIterator.DONE;
            c = iter.next()) {
            // �u%�v 0x0025
            if (c == 0x0025) {
                // �֑�����!
                state = 1;
                break;
            }
            // �u\�v 0x005C
            if (c == 0x005C) {
                // �֑�����!
                state = 2;
                break;
            }
            // �u_�v 0x005F
            if (c == 0x005F ) {
                // �֑�����!
                state = 3;
                break;
            }
        }
        return state;
    }

    /**
     * ����(\)�ϊ��A�u\�v�Ȃ�A�u\�v�𒼑O�ɒǉ�����
     * @param in  ������
     * @return    �ҏW�㕶����
     */
  private String replaceSlash(String in) {
        if(in == null)
            return null;
        StringBuffer buffer = new StringBuffer(in.length()*2);
        for(int i=0;i<in.length();i++) {
            char c = in.charAt(i);
            if(c == '\\')
                buffer.append("\\\\");
            else
                buffer.append(c);
        }
        return buffer.toString();
    }
//---------- ���͊֘A�`�F�b�N�̏��� END---------------------------------------------------


//---------- �i�ڎ�z�敪�\������ START---------------------------------------------------

    // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvImport() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������


        // ���X�g�N���A
        if(null == list){
          list = new ArrayList();
      }else{
        list.clear();
      }
      if(null == PsList){
          PsList = new ArrayList();
      }else{
        PsList.clear();
      }
      
        // �e��ʂ�struct��ޔ�
        saveParentStruct();

        // �T�u1��ʏ�����
        struct.clear();

                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        // �G���[�t���O������
        boolean bError = false;

        // ��ʕ\���p���X�g�N���A
        if(null == list){
          list = new ArrayList();
      }else{
        list.clear();
      }
      if(null == PsList){
          PsList = new ArrayList();
      }else{
        PsList.clear();
      }
      
        // �b�r�u�f�[�^�擾
        List listCsv = readCsvData();
        // �b�r�u�f�[�^���擾�ł��Ȃ����G���[
        if(listCsv == null)
        {
            bError = true;
        }

        // �`�F�b�N�{�b�N�X(�`�F�b�N�̂ݍs��)���`�F�b�N�̏ꍇ�ADB�ւ̃f�[�^�̔��f�͍s��Ȃ��B
        if (("true").equals(_save_struct.getDO_CHK()) != true && bError != true)
        {
          if(chkOutputFilePath() != true){
                bError = true;
          }
      }
      
        // �b�r�u�f�[�^�擾����
        if(bError != true)
        {
            // �b�r�u�f�[�^���e�`�F�b�N
            if(checkCsvData(listCsv) != true)
            {
                bError = true;
            }
        }

        // �`�F�b�N�{�b�N�X(�`�F�b�N�̂ݍs��)���`�F�b�N�̏ꍇ�ADB�ւ̃f�[�^�̔��f�͍s��Ȃ��B
        if (bError != true)
        {
            // �b�r�u�f�[�^���f����
            csvData2Db(listCsv);
        }

        // �`�F�b�N���ʏ���(�G���[���X�g�T�C�Y�̎擾)
        if(getListsize() > 0)
        {
            // ��ʔ���e�L�X�g�ɏI�����Z�b�g
            struct.setJUDGMENT_TXT("ERR_HAS");
        }else{
            // ��ʔ���e�L�X�g�ɏI�����Z�b�g
            struct.setJUDGMENT_TXT("");
        }
        struct.setCANCEL_FILE("");

                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

        // �N���A����
        this.struct.clear();
        this.struct.setrdoInsert("true");
        this.struct.setrdoUpdate("false");
        this.struct.setrdoDelete("false");
        this.struct.setDO_CHK("false");

        setReadStatus(INITIAL);
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
      csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
    
      List csvList = new ArrayList();
      //CSV���̍쐬
      // �^�C�g�����ݒ�
      String csvTitle[] = {
        "Expj.Cmt3094" ,         // �G���[�ӏ�
        "Expj.PARENT_ITEM_CD" ,         // �e�i�ڔԍ�
        "Expj.COMP_ITEM_CD" ,         // �q�i�ڔԍ�
        "Expj.PS_EDITION" ,         // ���i�\���Ő�
        "Expj.Cmt3097" ,         // �G���[���ږ�
        "Expj.Cmt3098"           // �G���[���e
           };
      // CSV���X�g�ɓ����
      csvList.add(csvTitle);
      
      AA0160010Struct workStruct;
      // ���ד��e�ݒ�
      for(int i=0; i<getListsize() ;i++){
       workStruct = getListvalue(i);
       String csvStr [] = new String[csvTitle.length];
       csvStr[0] = workStruct.getERROR_IN();// �G���[�ӏ�
       csvStr[1] = workStruct.getPARENT_ITEM_CD();// �e�i�ڔԍ�
       csvStr[2] = workStruct.getCOMP_ITEM_CD();// �q�i�ڔԍ�
       csvStr[3] = workStruct.getPS_EDITION();// ���i�\���Ő�
       csvStr[4] = workStruct.getERR_CTR_NM();// �G���[���ږ�
       csvStr[5] = workStruct.getERR_INFO();// �G���[���e
       csvList.add(csvStr);// CSV���X�g�ɓ����
      }
    
      if(csvList != null && csvList.size() > 0){
       try{
        // csv�t�@�C���ɏ���
        csvWriter.write(csvList,CoreTools.getLocale(struct.getsUser_ID()),true);
        struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
       }catch(Exception e){
        //CSV�o�͎��s
        ExpjMessage emsg = new ExpjMessage("ZZ01107");
        sysLog.severe(emsg, getsysUSER_CD());
        ExpjException ee = new ExpjException(e, emsg);
        throw ee;
       }
      }
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

        // �N���A
        controlclear();

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("CsvImport") ) {
				controlCsvImport();
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//      �\�[�X���ɂ܂�AlarmMessageException���c���Ă���ꍇ�́A�ȉ��̍s�̃R�����g���O����AlarmMessageException���n������B
//      } catch(AlarmMessageException ame){
//          ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//          throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// �g���b�Z�[�W�o�͈˗��쐬
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0160010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0160010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0160010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0160010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0160010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0160010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0160010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0160010Entity entity;
	protected AA0160010Struct struct;
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

		entity = new AA0160010Entity();
		struct = new AA0160010Struct();

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
	 * AA0160010�N���X�̕W���R���X�g���N�^
	 */
	public AA0160010Control() throws BusinessProcessException, FoundationException
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
				AA0160010Struct key = (AA0160010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoInsert") && key.getrdoInsert() != null) {
					msgKey.setKeyValue("rdoInsert", key.getrdoInsert());
				}
				if(msgKeyType.containsKeyColumn("rdoUpdate") && key.getrdoUpdate() != null) {
					msgKey.setKeyValue("rdoUpdate", key.getrdoUpdate());
				}
				if(msgKeyType.containsKeyColumn("rdoDelete") && key.getrdoDelete() != null) {
					msgKey.setKeyValue("rdoDelete", key.getrdoDelete());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("CANCEL_FILE") && key.getCANCEL_FILE() != null) {
					msgKey.setKeyValue("CANCEL_FILE", key.getCANCEL_FILE());
				}
				if(msgKeyType.containsKeyColumn("JUDGMENT_TXT") && key.getJUDGMENT_TXT() != null) {
					msgKey.setKeyValue("JUDGMENT_TXT", key.getJUDGMENT_TXT());
				}
				if(msgKeyType.containsKeyColumn("ERROR_IN") && key.getERROR_IN() != null) {
					msgKey.setKeyValue("ERROR_IN", key.getERROR_IN());
				}
				if(msgKeyType.containsKeyColumn("ERR_CTR_NM") && key.getERR_CTR_NM() != null) {
					msgKey.setKeyValue("ERR_CTR_NM", key.getERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("ERR_INFO") && key.getERR_INFO() != null) {
					msgKey.setKeyValue("ERR_INFO", key.getERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("DO_CHK") && key.getDO_CHK() != null) {
					msgKey.setKeyValue("DO_CHK", key.getDO_CHK());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("readNAME") && key.getreadNAME() != null) {
					msgKey.setKeyValue("readNAME", key.getreadNAME());
				}
				if(msgKeyType.containsKeyColumn("readVALUE") && key.getreadVALUE() != null) {
					msgKey.setKeyValue("readVALUE", key.getreadVALUE());
				}
				if(msgKeyType.containsKeyColumn("setNAME") && key.getsetNAME() != null) {
					msgKey.setKeyValue("setNAME", key.getsetNAME());
				}
				if(msgKeyType.containsKeyColumn("setVALUE") && key.getsetVALUE() != null) {
					msgKey.setKeyValue("setVALUE", key.getsetVALUE());
				}
				if(msgKeyType.containsKeyColumn("readSYS_P_NAME") && key.getreadSYS_P_NAME() != null) {
					msgKey.setKeyValue("readSYS_P_NAME", key.getreadSYS_P_NAME());
				}
				if(msgKeyType.containsKeyColumn("readSYS_P_VALUE") && key.getreadSYS_P_VALUE() != null) {
					msgKey.setKeyValue("readSYS_P_VALUE", key.getreadSYS_P_VALUE());
				}
				if(msgKeyType.containsKeyColumn("setSYS_P_NAME") && key.getsetSYS_P_NAME() != null) {
					msgKey.setKeyValue("setSYS_P_NAME", key.getsetSYS_P_NAME());
				}
				if(msgKeyType.containsKeyColumn("readPARENT_ITEM_CD") && key.getreadPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("readPARENT_ITEM_CD", key.getreadPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readCOMP_ITEM_CD") && key.getreadCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("readCOMP_ITEM_CD", key.getreadCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readPS_EDITION") && key.getreadPS_EDITION() != null) {
					msgKey.setKeyValue("readPS_EDITION", key.getreadPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("setPARENT_ITEM_CD") && key.getsetPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("setPARENT_ITEM_CD", key.getsetPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setCOMP_ITEM_CD") && key.getsetCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("setCOMP_ITEM_CD", key.getsetCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setPS_EDITION") && key.getsetPS_EDITION() != null) {
					msgKey.setKeyValue("setPS_EDITION", key.getsetPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("readM_ITEM_ITEM_CD") && key.getreadM_ITEM_ITEM_CD() != null) {
					msgKey.setKeyValue("readM_ITEM_ITEM_CD", key.getreadM_ITEM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_ITEM_ITEM_CD") && key.getsetM_ITEM_ITEM_CD() != null) {
					msgKey.setKeyValue("setM_ITEM_ITEM_CD", key.getsetM_ITEM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PARENT_ITEM_CD") && key.geth_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("h_PARENT_ITEM_CD", key.geth_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_COMP_ITEM_CD") && key.geth_COMP_ITEM_CD() != null) {
					msgKey.setKeyValue("h_COMP_ITEM_CD", key.geth_COMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PS_EDITION") && key.geth_PS_EDITION() != null) {
					msgKey.setKeyValue("h_PS_EDITION", key.geth_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("h_PS_UNIT_DENOMINATOR") && key.geth_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("h_PS_UNIT_DENOMINATOR", key.geth_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("h_PS_UNIT_NUMERATOR") && key.geth_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("h_PS_UNIT_NUMERATOR", key.geth_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("h_EFF_PHASE_IN_DATE") && key.geth_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("h_EFF_PHASE_IN_DATE", key.geth_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_EFF_PHASE_OUT_DATE") && key.geth_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("h_EFF_PHASE_OUT_DATE", key.geth_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_PS_SPOIL") && key.geth_PS_SPOIL() != null) {
					msgKey.setKeyValue("h_PS_SPOIL", key.geth_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("h_CONS_TYP") && key.geth_CONS_TYP() != null) {
					msgKey.setKeyValue("h_CONS_TYP", key.geth_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PS_LT_FLG") && key.geth_PS_LT_FLG() != null) {
					msgKey.setKeyValue("h_PS_LT_FLG", key.geth_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_PS_FIXED_LT") && key.geth_PS_FIXED_LT() != null) {
					msgKey.setKeyValue("h_PS_FIXED_LT", key.geth_PS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("h_PS_PROP_LT") && key.geth_PS_PROP_LT() != null) {
					msgKey.setKeyValue("h_PS_PROP_LT", key.geth_PS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("h_PS_PROP_LOT_SIZE") && key.geth_PS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("h_PS_PROP_LOT_SIZE", key.geth_PS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("h_PS_REF_NO") && key.geth_PS_REF_NO() != null) {
					msgKey.setKeyValue("h_PS_REF_NO", key.geth_PS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("h_COST_UP_TYP") && key.geth_COST_UP_TYP() != null) {
					msgKey.setKeyValue("h_COST_UP_TYP", key.geth_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MRP_EXP_TYP") && key.geth_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("h_MRP_EXP_TYP", key.geth_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_PARENT_ITEM_CD") && key.getC_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("C_PARENT_ITEM_CD", key.getC_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_COMP_ITEM_CD") && key.getC_COMP_ITEM_CD() != null) {
					msgKey.setKeyValue("C_COMP_ITEM_CD", key.getC_COMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_PS_EDITION") && key.getC_PS_EDITION() != null) {
					msgKey.setKeyValue("C_PS_EDITION", key.getC_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("C_PS_UNIT_DENOMINATOR") && key.getC_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("C_PS_UNIT_DENOMINATOR", key.getC_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("C_PS_UNIT_NUMERATOR") && key.getC_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("C_PS_UNIT_NUMERATOR", key.getC_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("C_EFF_PHASE_IN_DATE") && key.getC_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("C_EFF_PHASE_IN_DATE", key.getC_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("C_EFF_PHASE_OUT_DATE") && key.getC_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("C_EFF_PHASE_OUT_DATE", key.getC_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("C_PS_SPOIL") && key.getC_PS_SPOIL() != null) {
					msgKey.setKeyValue("C_PS_SPOIL", key.getC_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("C_CONS_TYP") && key.getC_CONS_TYP() != null) {
					msgKey.setKeyValue("C_CONS_TYP", key.getC_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_PS_LT_FLG") && key.getC_PS_LT_FLG() != null) {
					msgKey.setKeyValue("C_PS_LT_FLG", key.getC_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("C_PS_FIXED_LT") && key.getC_PS_FIXED_LT() != null) {
					msgKey.setKeyValue("C_PS_FIXED_LT", key.getC_PS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("C_PS_PROP_LT") && key.getC_PS_PROP_LT() != null) {
					msgKey.setKeyValue("C_PS_PROP_LT", key.getC_PS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("C_PS_PROP_LOT_SIZE") && key.getC_PS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("C_PS_PROP_LOT_SIZE", key.getC_PS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("C_PS_REF_NO") && key.getC_PS_REF_NO() != null) {
					msgKey.setKeyValue("C_PS_REF_NO", key.getC_PS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("C_COST_UP_TYP") && key.getC_COST_UP_TYP() != null) {
					msgKey.setKeyValue("C_COST_UP_TYP", key.getC_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_MRP_EXP_TYP") && key.getC_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("C_MRP_EXP_TYP", key.getC_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_setPARENT_ITEM_CD") && key.getC_setPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("C_setPARENT_ITEM_CD", key.getC_setPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_setCOMP_ITEM_CD") && key.getC_setCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("C_setCOMP_ITEM_CD", key.getC_setCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_setPS_EDITION") && key.getC_setPS_EDITION() != null) {
					msgKey.setKeyValue("C_setPS_EDITION", key.getC_setPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("readMAXSEQ_NO") && key.getreadMAXSEQ_NO() != null) {
					msgKey.setKeyValue("readMAXSEQ_NO", key.getreadMAXSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("h_SEQ_NO") && key.geth_SEQ_NO() != null) {
					msgKey.setKeyValue("h_SEQ_NO", key.geth_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ACCESS_TYP") && key.geth_ACCESS_TYP() != null) {
					msgKey.setKeyValue("h_ACCESS_TYP", key.geth_ACCESS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_CMPLT_FLG") && key.geth_CMPLT_FLG() != null) {
					msgKey.setKeyValue("h_CMPLT_FLG", key.geth_CMPLT_FLG());
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
					AA0160010Struct key = new AA0160010Struct();
					if(msgKeyType.containsKeyColumn("rdoInsert")) {
						key.setrdoInsert(msgKey.getKeyValue("rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("rdoUpdate")) {
						key.setrdoUpdate(msgKey.getKeyValue("rdoUpdate"));
					}
					if(msgKeyType.containsKeyColumn("rdoDelete")) {
						key.setrdoDelete(msgKey.getKeyValue("rdoDelete"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("CANCEL_FILE")) {
						key.setCANCEL_FILE(msgKey.getKeyValue("CANCEL_FILE"));
					}
					if(msgKeyType.containsKeyColumn("JUDGMENT_TXT")) {
						key.setJUDGMENT_TXT(msgKey.getKeyValue("JUDGMENT_TXT"));
					}
					if(msgKeyType.containsKeyColumn("ERROR_IN")) {
						key.setERROR_IN(msgKey.getKeyValue("ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("ERR_CTR_NM")) {
						key.setERR_CTR_NM(msgKey.getKeyValue("ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("ERR_INFO")) {
						key.setERR_INFO(msgKey.getKeyValue("ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("DO_CHK")) {
						key.setDO_CHK(msgKey.getKeyValue("DO_CHK"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("readNAME")) {
						key.setreadNAME(msgKey.getKeyValue("readNAME"));
					}
					if(msgKeyType.containsKeyColumn("readVALUE")) {
						key.setreadVALUE(msgKey.getKeyValue("readVALUE"));
					}
					if(msgKeyType.containsKeyColumn("setNAME")) {
						key.setsetNAME(msgKey.getKeyValue("setNAME"));
					}
					if(msgKeyType.containsKeyColumn("setVALUE")) {
						key.setsetVALUE(msgKey.getKeyValue("setVALUE"));
					}
					if(msgKeyType.containsKeyColumn("readSYS_P_NAME")) {
						key.setreadSYS_P_NAME(msgKey.getKeyValue("readSYS_P_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readSYS_P_VALUE")) {
						key.setreadSYS_P_VALUE(msgKey.getKeyValue("readSYS_P_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("setSYS_P_NAME")) {
						key.setsetSYS_P_NAME(msgKey.getKeyValue("setSYS_P_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readPARENT_ITEM_CD")) {
						key.setreadPARENT_ITEM_CD(msgKey.getKeyValue("readPARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readCOMP_ITEM_CD")) {
						key.setreadCOMP_ITEM_CD(msgKey.getKeyValue("readCOMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPS_EDITION")) {
						key.setreadPS_EDITION(msgKey.getKeyValue("readPS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("setPARENT_ITEM_CD")) {
						key.setsetPARENT_ITEM_CD(msgKey.getKeyValue("setPARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setCOMP_ITEM_CD")) {
						key.setsetCOMP_ITEM_CD(msgKey.getKeyValue("setCOMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setPS_EDITION")) {
						key.setsetPS_EDITION(msgKey.getKeyValue("setPS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("readM_ITEM_ITEM_CD")) {
						key.setreadM_ITEM_ITEM_CD(msgKey.getKeyValue("readM_ITEM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_ITEM_ITEM_CD")) {
						key.setsetM_ITEM_ITEM_CD(msgKey.getKeyValue("setM_ITEM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PARENT_ITEM_CD")) {
						key.seth_PARENT_ITEM_CD(msgKey.getKeyValue("h_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_COMP_ITEM_CD")) {
						key.seth_COMP_ITEM_CD(msgKey.getKeyValue("h_COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_EDITION")) {
						key.seth_PS_EDITION(msgKey.getKeyValue("h_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_UNIT_DENOMINATOR")) {
						key.seth_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("h_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_UNIT_NUMERATOR")) {
						key.seth_PS_UNIT_NUMERATOR(msgKey.getKeyValue("h_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("h_EFF_PHASE_IN_DATE")) {
						key.seth_EFF_PHASE_IN_DATE(msgKey.getKeyValue("h_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_EFF_PHASE_OUT_DATE")) {
						key.seth_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("h_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_SPOIL")) {
						key.seth_PS_SPOIL(msgKey.getKeyValue("h_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("h_CONS_TYP")) {
						key.seth_CONS_TYP(msgKey.getKeyValue("h_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_LT_FLG")) {
						key.seth_PS_LT_FLG(msgKey.getKeyValue("h_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_FIXED_LT")) {
						key.seth_PS_FIXED_LT(msgKey.getKeyValue("h_PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_PROP_LT")) {
						key.seth_PS_PROP_LT(msgKey.getKeyValue("h_PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_PROP_LOT_SIZE")) {
						key.seth_PS_PROP_LOT_SIZE(msgKey.getKeyValue("h_PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_REF_NO")) {
						key.seth_PS_REF_NO(msgKey.getKeyValue("h_PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_COST_UP_TYP")) {
						key.seth_COST_UP_TYP(msgKey.getKeyValue("h_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MRP_EXP_TYP")) {
						key.seth_MRP_EXP_TYP(msgKey.getKeyValue("h_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_PARENT_ITEM_CD")) {
						key.setC_PARENT_ITEM_CD(msgKey.getKeyValue("C_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_COMP_ITEM_CD")) {
						key.setC_COMP_ITEM_CD(msgKey.getKeyValue("C_COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_EDITION")) {
						key.setC_PS_EDITION(msgKey.getKeyValue("C_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_UNIT_DENOMINATOR")) {
						key.setC_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("C_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_UNIT_NUMERATOR")) {
						key.setC_PS_UNIT_NUMERATOR(msgKey.getKeyValue("C_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("C_EFF_PHASE_IN_DATE")) {
						key.setC_EFF_PHASE_IN_DATE(msgKey.getKeyValue("C_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("C_EFF_PHASE_OUT_DATE")) {
						key.setC_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("C_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_SPOIL")) {
						key.setC_PS_SPOIL(msgKey.getKeyValue("C_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("C_CONS_TYP")) {
						key.setC_CONS_TYP(msgKey.getKeyValue("C_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_LT_FLG")) {
						key.setC_PS_LT_FLG(msgKey.getKeyValue("C_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_FIXED_LT")) {
						key.setC_PS_FIXED_LT(msgKey.getKeyValue("C_PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_PROP_LT")) {
						key.setC_PS_PROP_LT(msgKey.getKeyValue("C_PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_PROP_LOT_SIZE")) {
						key.setC_PS_PROP_LOT_SIZE(msgKey.getKeyValue("C_PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_REF_NO")) {
						key.setC_PS_REF_NO(msgKey.getKeyValue("C_PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("C_COST_UP_TYP")) {
						key.setC_COST_UP_TYP(msgKey.getKeyValue("C_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_MRP_EXP_TYP")) {
						key.setC_MRP_EXP_TYP(msgKey.getKeyValue("C_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_setPARENT_ITEM_CD")) {
						key.setC_setPARENT_ITEM_CD(msgKey.getKeyValue("C_setPARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_setCOMP_ITEM_CD")) {
						key.setC_setCOMP_ITEM_CD(msgKey.getKeyValue("C_setCOMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_setPS_EDITION")) {
						key.setC_setPS_EDITION(msgKey.getKeyValue("C_setPS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("readMAXSEQ_NO")) {
						key.setreadMAXSEQ_NO(msgKey.getKeyValue("readMAXSEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_SEQ_NO")) {
						key.seth_SEQ_NO(msgKey.getKeyValue("h_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ACCESS_TYP")) {
						key.seth_ACCESS_TYP(msgKey.getKeyValue("h_ACCESS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_CMPLT_FLG")) {
						key.seth_CMPLT_FLG(msgKey.getKeyValue("h_CMPLT_FLG"));
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
