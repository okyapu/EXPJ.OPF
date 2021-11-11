/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0150/src/com/nec/jp/orteus/metamorBase/AA0150/AA0150010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0150;

import com.nec.jp.orteus.metamorBase.AA0150.*;
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
    // TODO: ������import�p�b�P�[�W���L�q���Ă�������
import com.nec.jp.orteus.expj.util.PrivateConfig;
import java.io.*;
import java.math.BigDecimal;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AA0150010Control �N���X
 * �i�ڃf�[�^�捞����
 *
 * �C������
 * (2015/08/03), EJaSCM�^EJa�@�\�����Ή�
 */
//}}user_implement_code_header

public class AA0150010Control
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
    protected List list;                                            // �ꗗ�����̌��ʃ��X�g����ʂɕ\�����邽�߂̃��X�g�C���X�^���X


    /** �R���{�{�b�N�X�f�[�^�擾�p�@�G���[��ԋ敪 */
    private ComboStruct COMBO_ERR_TYP = null;
    
    // �g���q
    private final String EXTENSION_CSV = "csv";
    
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
    
    // �f�t�H���g�A�N�Z�T���\�b�h
    public List getList() { return this.list; }                     // ���X�g��Ԃ��܂��B
    public void setList(List listname) { this.list = listname; }    // ���X�g���Z�b�g���܂��B
    public int getListsize() {                                      // ���X�g�^�̃T�C�Y��Ԃ��܂��B
        int nret = 0;
        if( this.list != null ) {nret = this.list.size();}
        return nret;
    }
//  public Object getListvalue(int x) { return this.list.get(x); }  // ���X�g�̒l��Ԃ��܂��B
    public AA0150010Struct getListvalue(int x) { return (AA0150010Struct)(this.list.get(x)); }  // ���X�g�̒l��Ԃ��܂��B
    public AA0150010Struct getStruct() { return this.struct; }  // Struct��Ԃ��܂��B
    public AA0150010Struct createStruct() { return new AA0150010Struct(); } // �V����Struct������ĕԂ��܂��B
    public void setStruct(Object structname) { this.struct.setStruct((AA0150010Struct)structname); }    // Struct���Z�b�g���܂��B
    public void initializeStruct() { this.struct.initialize(); }    // Struct�̒l�����������܂��B

    // CSV�o�͗p���X�g
    private CsvWriter csvWriter = null;
    public CsvWriter getCsvWriter(){ return this.csvWriter; }

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
    private AA0150010Struct _save_struct = new AA0150010Struct();

    /**
     * �e��ʂ�struct����ޔ�
     */
    private void saveParentStruct()
    {
        _save_struct.copy(struct);
    }

    /**
     * �e��ʂ�struct���𕜋A
     */
    private void loadParentStruct()
    {
        struct.copy(_save_struct);
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

    //---------- �b�r�u�o�͊֘A�̏��� START---------------------------------------------------
	// �i�ڎ�z�敪�\�������̎擾
	private String getMRP_ODR_TYP_DISPLAY_NAME(String value) throws ExpjException{
		struct.setsetNAME("MRP_ODR_TYP");
		struct.setsetVALUE(value);
		List nameList = new ArrayList();
		try {
			nameList = entity.mreadSYS_TYPE_VALUE.read(conn, struct);
		} catch(SQLException e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
			ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
			throw ee;
		}catch(Exception e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		if(nameList.size()>0){
			return ((AA0150010Struct)nameList.get(0)).getDISPLAY_NAME();
		}
		return "undefined";
	}

    private String strSysdate = "";
    private List _csvList = new ArrayList(0);
    public List getCsvList(){ return _csvList; }
    public void setCsvList(List list){ _csvList = list; }

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
     * @param ErrItemNo     �G���[���ڔԍ�
     * @return �ُ�Ȃ� true �G���[ false
     */ 
    private boolean csvExport(AA0150010Struct target_struct , int ErrlineNo , String ErrItem, String ErrCd, String ErrNo ,String ErrMsg , String CsvCnount,int ErrItemNo)
    {
        
        AA0150010Struct aa0150010struct = new AA0150010Struct();
        String locale = CoreTools.getLocale(sysUSER_CD);

        // ���אݒ�
        // ������L�[�Z�b�g
        if(ErrItemNo != CSV_COLNO_99){
          ExpjMessage emsg = new ExpjMessage("AH00045",String.valueOf(ErrlineNo),String.valueOf(ErrItemNo + 1));
          aa0150010struct.setERROR_IN(emsg.getMessage(locale));
      }else{
          ExpjMessage emsg = new ExpjMessage("AA01520",String.valueOf(ErrlineNo));
          aa0150010struct.setERROR_IN(emsg.getMessage(locale));
        }
        String ErrTyp = getDisplayName(COMBO_ERR_TYP, ErrCd);
        aa0150010struct.setERR_TYP(ErrTyp);
        aa0150010struct.setITEM_CD(target_struct.geth_ITEM_CD());
        // CSV�o�͂̕i�ڔԍ�
        aa0150010struct.setOUT_ITEM_CD(target_struct.getOUT_ITEM_CD());
        aa0150010struct.setERR_CTR_NM(ErrItem);
        aa0150010struct.setERR_INFO(ErrMsg);
        list.add(aa0150010struct);
        
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
    private boolean csvExportCorrection( AA0150010Struct target_struct , String UserId, String SyoriKbn, String DataKbn ,boolean bWrite)
    {
        // ���������t���O������
        boolean bSuccess = false;
        //AA0150010Struct structCsv;
        // CSV�t�@�C���ҏW�p
        String csvStr = "";
        String strTmp = "";
        BufferedWriter outStream = null;

        try {
            
            // �ύX�f�[�^�敪��(1:�ύX�O�f�[�^)�������ꍇ�B
            if (DataKbn == "1" )
            {
                // *�X�V�O�̃f�[�^�̎擾*
                struct.setC_setITEM_CD(target_struct.geth_ITEM_CD());
                List listmitemType = entity.mreadM_ITEM.read(conn, struct);

                csvStr = '"' + strSysdate + '"' + "," ;
                // ��2���O�C�����[�U�[��
                csvStr = csvStr + '"' + UserId + '"' + "," ;
                // ��3�����敪
                csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
                // ��4�ύX�f�[�^�敪
                csvStr = csvStr + '"' + DataKbn + '"' + "," ;
                // ��5�i�ڔԍ�
                csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CD() + '"' + "," ;
                // ��6�i�ږ�
                if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_NAME() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_NAME() + '"' + "," ;
                }
                // ��7�}�ʔԍ�
                if(((AA0150010Struct)listmitemType.get(0)).getC_DRAW_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_DRAW_CD() + '"' + "," ;
                }
                // ��8�K�i
                if(((AA0150010Struct)listmitemType.get(0)).getC_SPEC() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SPEC() + '"' + "," ;
                }
                // ��9���x���ԍ�
                if(((AA0150010Struct)listmitemType.get(0)).getC_HIGH_LEVEL_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_HIGH_LEVEL_NO() + '"' + "," ;
                }
                // ��10�i�ڎ�z�敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_MRP_ODR_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MRP_ODR_TYP() + '"' + "," ;
                }
                // ��11�i�ړ��O��敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_OUTSIDE_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_OUTSIDE_TYP() + '"' + "," ;
                }
                // ��12�׎p�Ǘ��t���O
                if(((AA0150010Struct)listmitemType.get(0)).getC_STOCK_UNIT_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_STOCK_UNIT_FLG() + '"' + "," ;
                }
                // ��13�v�ʒP��
                if(((AA0150010Struct)listmitemType.get(0)).getC_STOCK_UNIT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_STOCK_UNIT() + '"' + "," ;
                }
                // ��14�׎p�v�ʒP��
                if(((AA0150010Struct)listmitemType.get(0)).getC_PKG_UNIT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PKG_UNIT() + '"' + "," ;
                }
                // ��15�׎p�P�ʐ�
                if(((AA0150010Struct)listmitemType.get(0)).getC_PKG_UNIT_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PKG_UNIT_QTY() + '"' + "," ;
                }
                // ��16�݌ɐ��P�ʋ敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_UNIT_QTY_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_UNIT_QTY_TYP() + '"' + "," ;
                }
                // ��17�i�ڎ�z���[�h�^�C��
                if(((AA0150010Struct)listmitemType.get(0)).getC_ODR_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ODR_LT() + '"' + "," ;
                }
                // ��18�i�ڌŒ蕪���[�h�^�C��
                if(((AA0150010Struct)listmitemType.get(0)).getC_FIXED_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_FIXED_LT() + '"' + "," ;
                }
                // ��19�i�ڔ�ᕪ���[�h�^�C��
                if(((AA0150010Struct)listmitemType.get(0)).getC_PROP_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PROP_LT() + '"' + "," ;
                }
                // ��20���S����
                if(((AA0150010Struct)listmitemType.get(0)).getC_SAFETY_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SAFETY_LT() + '"' + "," ;
                }
                // ��21���o���[�h�^�C��
                if(((AA0150010Struct)listmitemType.get(0)).getC_ISSUE_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ISSUE_LT() + '"' + "," ;
                }
                // ��22�i�ڔ�ᕪ���b�g�T�C�Y
                if(((AA0150010Struct)listmitemType.get(0)).getC_PROP_LOT_SIZE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PROP_LOT_SIZE()+ '"' + "," ;
                }
                // ��23�i�ڎd����
                if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_SPOIL() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_SPOIL() + '"' + "," ;
                }
                // ��24���S�݌ɗ�
                if(((AA0150010Struct)listmitemType.get(0)).getC_SAFETY_STOCK() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SAFETY_STOCK() + '"' + "," ;
                }
                // ��25���b�g�܂Ƃߋ敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_LOT_SIZING_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_LOT_SIZING_TYP() + '"' + "," ;
                }
                // ��26�ő�܂Ƃߊ���
                if(((AA0150010Struct)listmitemType.get(0)).getC_MAX_PERIOD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MAX_PERIOD() + '"' + "," ;
                }
                // ��27�ő��z��
                if(((AA0150010Struct)listmitemType.get(0)).getC_MAX_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MAX_ODR_QTY() + '"' + "," ;
                }
                // ��28�����_�݌ɐ�
                if(((AA0150010Struct)listmitemType.get(0)).getC_ODR_POINT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ODR_POINT() + '"' + "," ;
                }
                // ��29��ʔ�����
                if(((AA0150010Struct)listmitemType.get(0)).getC_FIXED_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_FIXED_ODR_QTY() + '"' + "," ;
                }
                // ��30�ŏ���z��
                if(((AA0150010Struct)listmitemType.get(0)).getC_MIN_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MIN_ODR_QTY() + '"' + "," ;
                }
                // ��31�܂�ߒP��
                if(((AA0150010Struct)listmitemType.get(0)).getC_MUL_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MUL_ODR_QTY() + '"' + "," ;
                }
                // ��32�o�ɋ敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_ISSUE_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ISSUE_TYP() + '"' + "," ;
                }
                // ��33MPS�i�ڃt���O
                if(((AA0150010Struct)listmitemType.get(0)).getC_MPS_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MPS_FLG() + '"' + "," ;
                }
                // ��34��������敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_ACPT_INSPC_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ACPT_INSPC_TYP() + '"' + "," ;
                }
                // ��35���i�敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_PRODUCT_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PRODUCT_TYP() + '"' + "," ;
                }
                // ��36�Ǘ��R�[�h
                if(((AA0150010Struct)listmitemType.get(0)).getC_CLASIFICATION_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_CLASIFICATION_CD() + '"' + "," ;
                }
                // ��37�P�ʏd��
                if(((AA0150010Struct)listmitemType.get(0)).getC_UNIT_WEIGHT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_UNIT_WEIGHT() + '"' + "," ;
                }
                // ��38�I���敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_ABC_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ABC_TYP() + '"' + "," ;
                }
                // ��39��Ǝ��ы敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_OPR_RSLT_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_OPR_RSLT_TYP() + '"' + "," ;
                }
                // ��40�󋋕i�敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_SPL_ITEM_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SPL_ITEM_TYP() + '"' + "," ;
                }
                // ��41����ŃR�[�h
                if(((AA0150010Struct)listmitemType.get(0)).getC_TAX_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_TAX_CD() + '"' + "," ;
                }
                // ��42�J�����_�ԍ�
                if(((AA0150010Struct)listmitemType.get(0)).getC_CAL_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_CAL_NO() + '"' + "," ;
                }
                if("1".equals(SyoriKbn)){
                  // ��43�ۊǋ�R�[�h
// 2008/07/25 SYSCOM �镔 ORIGINAL START
//                  csvStr = csvStr + '"' + target_struct.geth_WH_CD() + '"' ;
// 2008/07/25 SYSCOM �镔 ORIGINAL END
// 2008/07/25 SYSCOM �镔 UPD START
                  csvStr = csvStr + '"' + target_struct.geth_WH_CD() + '"' + "," ;
// 2008/07/25 SYSCOM �镔 UPD END
              }
// 2008/07/25 SYSCOM �镔 ADD START
                // ��44�H���Ǘ��i�ڋ敪
                if(((AA0150010Struct)listmitemType.get(0)).getC_MANHOUR_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + ",";
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MANHOUR_TYP() + '"' + ",";
                }
// 2008/07/25 SYSCOM �镔 ADD END
//////////////////////////////////////////////////////////////////
				// ��43�ۊǋ敪
				if(((AA0150010Struct)listmitemType.get(0)).getC_DEPO_TYP() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_DEPO_TYP() + '"' + "," ;
				}
				// ��44���b�g�Ǘ��t���O
				if(((AA0150010Struct)listmitemType.get(0)).getC_LOT_CTRL_FLG() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_LOT_CTRL_FLG() + '"' + "," ;
				}
				// ��45���b�g�̔ԋ敪
				if(((AA0150010Struct)listmitemType.get(0)).getC_LOT_NUMBERING_TYP() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_LOT_NUMBERING_TYP() + '"' + "," ;
				}
				// ��46�i�������N��
				if(((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_YEAR() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_YEAR() + '"' + "," ;
				}
				// ��47�i����������
				if(((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_MONTH() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_MONTH() + '"' + "," ;
				}
				// ��48�i����������
				if(((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_DAY() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_DAY() + '"' + "," ;
				}
//20150803 ADD START BY SYSCOM
            	// ��49���S����R�[�h
				if(((AA0150010Struct)listmitemType.get(0)).getC_DEPT_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_DEPT_CD() + '"' + "," ;
				}
            	// ��50�v���W�F�N�g�R�[�h
            	if(((AA0150010Struct)listmitemType.get(0)).getC_PJ_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PJ_CD() + '"' + "," ;
				}
            	// ��51�Z�O�����g1
            	if(((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_1() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_1() + '"' + "," ;
				}
            	// ��52�Z�O�����g2
            	if(((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_2() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_2() + '"' + "," ;
				}
            	// ��53�Z�O�����g3
            	if(((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_3() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_3() + '"' + "," ;
				}
            	// ��54�Z�O�����g4
            	if(((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_4() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_4() + '"' + "," ;
				}
//20150803 ADD END BY SYSCOM
				// ��55���l�P
				if(((AA0150010Struct)listmitemType.get(0)).getC_REMARK1() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_REMARK1() + '"' + "," ;
				}
				// ��56���l2
				if(((AA0150010Struct)listmitemType.get(0)).getC_REMARK2() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_REMARK2() + '"' + "," ;
				}
				// ��57�i�ڕ���01
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_01_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_01_CD() + '"' + "," ;
				}
            	// ��58�i�ڕ���02
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_02_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_02_CD() + '"' + "," ;
				}
            	// ��59�i�ڕ���03
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_03_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_03_CD() + '"' + "," ;
				}
				// ��60�i�ڕ���04
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_04_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_04_CD() + '"' + "," ;
				}
				// ��61�i�ڕ���05
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_05_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_05_CD() + '"' + "," ;
				}
				// ��62�i�ڕ���06
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_06_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_06_CD() + '"' + "," ;
				}
				// ��63�i�ڕ���07
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_07_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_07_CD() + '"' + "," ;
				}
				// ��64�i�ڕ���08
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_08_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_08_CD() + '"' + "," ;
				}
				// ��65�i�ڕ���09
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_09_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_09_CD() + '"' + "," ;
				}
				// ��66�i�ڕ���10
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_10_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_10_CD() + '"' + "," ;
				}
				// ��67�i�ڕ���11
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_11_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_11_CD() + '"' + "," ;
				}
				// ��68�i�ڕ���12
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_12_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"';
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_12_CD() + '"';
				}

            } else {
                csvStr = '"' + strSysdate + '"' + "," ;

                // ��2���O�C�����[�U�[��
                csvStr = csvStr + '"' + UserId + '"' + "," ;
                // ��3�����敪
                csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
                // ��4�ύX�f�[�^�敪
                csvStr = csvStr + '"' + DataKbn + '"' + "," ;
                // ��5�i�ڔԍ�
                csvStr = csvStr + '"' + target_struct.geth_ITEM_CD() + '"' + "," ;
                // ��6�i�ږ�
                if(target_struct.geth_ITEM_NAME() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ITEM_NAME() + '"' + "," ;
                }
                // ��7�}�ʔԍ�
                if(target_struct.geth_DRAW_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_DRAW_CD() + '"' + "," ;
                }
                // ��8�K�i
                if(target_struct.geth_SPEC() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_SPEC() + '"' + "," ;
                }
                // ��9���x���ԍ�
                if(target_struct.geth_HIGH_LEVEL_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_HIGH_LEVEL_NO() + '"' + "," ;
                }
                // ��10�i�ڎ�z�敪
                if(target_struct.geth_MRP_ODR_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MRP_ODR_TYP() + '"' + "," ;
                }
                // ��11�i�ړ��O��敪
                if(target_struct.geth_OUTSIDE_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_OUTSIDE_TYP() + '"' + "," ;
                }
                // ��12�׎p�Ǘ��t���O
                if(target_struct.geth_STOCK_UNIT_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_STOCK_UNIT_FLG() + '"' + "," ;
                }
                // ��13�v�ʒP��
                if(target_struct.geth_STOCK_UNIT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_STOCK_UNIT() + '"' + "," ;
                }
                // ��14�׎p�v�ʒP��
                if(target_struct.geth_PKG_UNIT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PKG_UNIT() + '"' + "," ;
                }
                // ��15�׎p�P�ʐ�
                if(target_struct.geth_PKG_UNIT_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PKG_UNIT_QTY() + '"' + "," ;
                }
                // ��16�݌ɐ��P�ʋ敪
                if(target_struct.geth_UNIT_QTY_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_UNIT_QTY_TYP() + '"' + "," ;
                }
                // ��17�i�ڎ�z���[�h�^�C��
                if(target_struct.geth_ODR_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ODR_LT() + '"' + "," ;
                }
                // ��18�i�ڌŒ蕪���[�h�^�C��
                if(target_struct.geth_FIXED_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_FIXED_LT() + '"' + "," ;
                }
                // ��19�i�ڔ�ᕪ���[�h�^�C��
                if(target_struct.geth_PROP_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PROP_LT() + '"' + "," ;
                }
                // ��20���S����
                if(target_struct.geth_SAFETY_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_SAFETY_LT() + '"' + "," ;
                }
                // ��21���o���[�h�^�C��
                if(target_struct.geth_ISSUE_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ISSUE_LT() + '"' + "," ;
                }
                // ��22�i�ڔ�ᕪ���b�g�T�C�Y
                if(target_struct.geth_PROP_LOT_SIZE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PROP_LOT_SIZE()+ '"' + "," ;
                }
                // ��23�i�ڎd����
                if(target_struct.geth_ITEM_SPOIL() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ITEM_SPOIL() + '"' + "," ;
                }
                // ��24���S�݌ɗ�
                if(target_struct.geth_SAFETY_STOCK() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_SAFETY_STOCK() + '"' + "," ;
                }
                // ��25���b�g�܂Ƃߋ敪
                if(target_struct.geth_LOT_SIZING_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_LOT_SIZING_TYP() + '"' + "," ;
                }
                // ��26�ő�܂Ƃߊ���
                if(target_struct.geth_MAX_PERIOD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MAX_PERIOD() + '"' + "," ;
                }
                // ��27�ő��z��
                if(target_struct.geth_MAX_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MAX_ODR_QTY() + '"' + "," ;
                }
                // ��28�����_�݌ɐ�
                if(target_struct.geth_ODR_POINT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ODR_POINT() + '"' + "," ;
                }
                // ��29��ʔ�����
                if(target_struct.geth_FIXED_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_FIXED_ODR_QTY() + '"' + "," ;
                }
                // ��30�ŏ���z��
                if(target_struct.geth_MIN_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MIN_ODR_QTY() + '"' + "," ;
                }
                // ��31�܂�ߒP��
                if(target_struct.geth_MUL_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MUL_ODR_QTY() + '"' + "," ;
                }
                // ��32�o�ɋ敪
                if(target_struct.geth_ISSUE_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ISSUE_TYP() + '"' + "," ;
                }
                // ��33MPS�i�ڃt���O
                if(target_struct.geth_MPS_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MPS_FLG() + '"' + "," ;
                }
                // ��34��������敪
                if(target_struct.geth_ACPT_INSPC_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ACPT_INSPC_TYP() + '"' + "," ;
                }
                // ��35���i�敪
                if(target_struct.geth_PRODUCT_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PRODUCT_TYP() + '"' + "," ;
                }
                // ��36�Ǘ��R�[�h
                if(target_struct.geth_CLASIFICATION_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_CLASIFICATION_CD() + '"' + "," ;
                }
                // ��37�P�ʏd��
                if(target_struct.geth_UNIT_WEIGHT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_UNIT_WEIGHT() + '"' + "," ;
                }
                // ��38�I���敪
                if(target_struct.geth_ABC_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ABC_TYP() + '"' + "," ;
                }
                // ��39��Ǝ��ы敪
                if(target_struct.geth_OPR_RSLT_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_OPR_RSLT_TYP() + '"' + "," ;
                }
                // ��40�󋋕i�敪
                if(target_struct.geth_SPL_ITEM_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_SPL_ITEM_TYP() + '"' + "," ;
                }
                // ��41����ŃR�[�h
                if(target_struct.geth_TAX_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_TAX_CD() + '"' + "," ;
                }
                // ��42�J�����_�ԍ�
                if(target_struct.geth_CAL_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_CAL_NO() + '"' + "," ;
                }
                
                if("1".equals(SyoriKbn)){
                  // ��43�ۊǋ�R�[�h
// 2008/07/25 SYSCOM �镔 ORIGINAL START
//                  csvStr = csvStr + '"' + target_struct.geth_WH_CD() + '"' ;
// 2008/07/25 SYSCOM �镔 ORIGINAL END
// 2008/07/25 SYSCOM �镔 UPD START
                  csvStr = csvStr + '"' + target_struct.geth_WH_CD() + '"' + "," ;
// 2008/07/25 SYSCOM �镔 UPD END
              }
// 2008/07/25 SYSCOM �镔 ADD START
                // ��44�H���Ǘ��i�ڋ敪
                if(target_struct.geth_MANHOUR_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + ",";
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MANHOUR_TYP() + '"' + ",";
                }
// 2008/07/25 SYSCOM �镔 ADD END
				//////////////////////////////////////////

				// ��44�ۊǋ敪
				if(target_struct.geth_DEPO_TYP() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_DEPO_TYP() + '"' + "," ;
				}

				// ��45���b�g�Ǘ��t���O
				if(target_struct.geth_LOT_CTRL_FLG() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_LOT_CTRL_FLG() + '"' + "," ;
				}
				// ��46���b�g�̔ԋ敪
				if(target_struct.geth_LOT_NUMBERING_TYP() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_LOT_NUMBERING_TYP() + '"' + "," ;
				}
				// ��47�i�������N��
				if(target_struct.geth_BEST_BEFORE_YEAR() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_BEST_BEFORE_YEAR() + '"' + "," ;
				}
				// ��48�i����������
				if(target_struct.geth_BEST_BEFORE_MONTH() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_BEST_BEFORE_MONTH() + '"' + "," ;
				}
				// ��49�i����������
				if(target_struct.geth_BEST_BEFORE_DAY() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_BEST_BEFORE_DAY() + '"' + "," ;
				}
//20150803 ADD START BY SYSCOM
            	// ��50���S����R�[�h
				if(target_struct.geth_DEPT_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_DEPT_CD() + '"' + "," ;
				}
            	// ��51�v���W�F�N�g�R�[�h
				if(target_struct.geth_PJ_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_PJ_CD() + '"' + "," ;
				}
            	// ��52�Z�O�����g1
				if(target_struct.geth_SEG_CONTENTS_1() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_SEG_CONTENTS_1() + '"' + "," ;
				}
            	// ��53�Z�O�����g2
				if(target_struct.geth_SEG_CONTENTS_2() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_SEG_CONTENTS_2() + '"' + "," ;
				}
            	// ��54�Z�O�����g3
				if(target_struct.geth_SEG_CONTENTS_3() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_SEG_CONTENTS_3() + '"' + "," ;
				}

            	// ��55�Z�O�����g4
				if(target_struct.geth_SEG_CONTENTS_4() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_SEG_CONTENTS_4() + '"' + "," ;
				}
//20150803 ADD END BY SYSCOM
				// ��56���l�P
				if(target_struct.geth_REMARK1() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_REMARK1() + '"' + "," ;
				}
				// ��57���l2
				if(target_struct.geth_REMARK2() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_REMARK2() + '"' + "," ;
				}
				// ��58�i�ڕ���01
				if(target_struct.geth_ITEM_CLASS_01_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_01_CD() + '"' + "," ;
				}
				// ��59�i�ڕ���02
				if(target_struct.geth_ITEM_CLASS_02_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_02_CD() + '"' + "," ;
				}
				// ��60�i�ڕ���03
				if(target_struct.geth_ITEM_CLASS_03_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_03_CD() + '"' + "," ;
				}
				// ��61�i�ڕ���04
				if(target_struct.geth_ITEM_CLASS_04_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_04_CD() + '"' + "," ;
				}
				// ��62�i�ڕ���05
				if(target_struct.geth_ITEM_CLASS_05_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_05_CD() + '"' + "," ;
				}
				// ��63�i�ڕ���06
				if(target_struct.geth_ITEM_CLASS_06_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_06_CD() + '"' + "," ;
				}
				// ��64�i�ڕ���07
				if(target_struct.geth_ITEM_CLASS_07_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_07_CD() + '"' + "," ;
				}
				// ��65�i�ڕ���08
				if(target_struct.geth_ITEM_CLASS_08_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_08_CD() + '"' + "," ;
				}
				// ��66�i�ڕ���09
				if(target_struct.geth_ITEM_CLASS_09_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_09_CD() + '"' + "," ;
				}
				// ��67�i�ڕ���10
				if(target_struct.geth_ITEM_CLASS_10_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_10_CD() + '"' + "," ;
				}
				// ��68�i�ڕ���11
				if(target_struct.geth_ITEM_CLASS_11_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_11_CD() + '"' + "," ;
				}
				// ��69�i�ڕ���12
				if(target_struct.geth_ITEM_CLASS_12_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"';
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_12_CD() + '"' ;
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
    private final int CSV_COLNO_ITEM_CD = 0;            //  1�i�ڔԍ�
    private final int CSV_COLNO_ITEM_NAME = 1;          //  2�i�ږ�
    private final int CSV_COLNO_DRAW_CD = 2;            //  3�}�ʔԍ�
    private final int CSV_COLNO_SPEC = 3;               //  4�K�i
    private final int CSV_COLNO_HIGH_LEVEL_NO = 4;      //  5���x���ԍ�
    private final int CSV_COLNO_MRP_ODR_TYP = 5;        //  6�i�ڎ�z�敪
    private final int CSV_COLNO_OUTSIDE_TYP = 6;        //  7�i�ړ��O��敪
    private final int CSV_COLNO_STOCK_UNIT_FLG = 7;     //  8�׎p�Ǘ��t���O
    private final int CSV_COLNO_STOCK_UNIT = 8;         //  9�v�ʒP��
    private final int CSV_COLNO_PKG_UNIT = 9;           // 10�׎p�v�ʒP��
    private final int CSV_COLNO_PKG_UNIT_QTY = 10;      // 11�׎p�P�ʐ�
    private final int CSV_COLNO_UNIT_QTY_TYP = 11;      // 12�݌ɐ��P�ʋ敪
    private final int CSV_COLNO_ODR_LT = 12;            // 13�i�ڎ�z���[�h�^�C��
    private final int CSV_COLNO_FIXED_LT = 13;          // 14�i�ڌŒ蕪���[�h�^�C��
    private final int CSV_COLNO_PROP_LT = 14;           // 15�i�ڔ�ᕪ���[�h�^�C��
    private final int CSV_COLNO_SAFETY_LT = 15;         // 16���S����
    private final int CSV_COLNO_ISSUE_LT = 16;          // 17���o���[�h�^�C��
    private final int CSV_COLNO_PROP_LOT_SIZE = 17;     // 18�i�ڔ�ᕪ���b�g�T�C�Y
    private final int CSV_COLNO_ITEM_SPOIL = 18;        // 19�i�ڎd����
    private final int CSV_COLNO_SAFETY_STOCK = 19;      // 20���S�݌ɗ�
    private final int CSV_COLNO_LOT_SIZING_TYP = 20;    // 21���b�g�܂Ƃߋ敪
    private final int CSV_COLNO_MAX_PERIOD = 21;        // 22�ő�܂Ƃߊ���
    private final int CSV_COLNO_MAX_ODR_QTY = 22;       // 23�ő��z��
    private final int CSV_COLNO_ODR_POINT = 23;         // 24�����_��V�ɐ�
    private final int CSV_COLNO_FIXED_ODR_QTY = 24;     // 25��ʔ�����
    private final int CSV_COLNO_MIN_ODR_QTY = 25;       // 26�ŏ���z��
    private final int CSV_COLNO_MUL_ODR_QTY = 26;       // 27�܂�ߒP��
    private final int CSV_COLNO_ISSUE_TYP = 27;         // 28�o�ɋ敪
    private final int CSV_COLNO_MPS_FLG = 28;           // 29MPS�i�ڃt���O
    private final int CSV_COLNO_ACPT_INSPC_TYP = 29;    // 30��������敪
    private final int CSV_COLNO_PRODUCT_TYP = 30;       // 31���i�敪
    private final int CSV_COLNO_CLASIFICATION_CD = 31;  // 32�Ǘ��R�[�h
    private final int CSV_COLNO_UNIT_WEIGHT = 32;       // 33�P�ʏd��
    private final int CSV_COLNO_ABC_TYP = 33;           // 34�I���敪
    private final int CSV_COLNO_OPR_RSLT_TYP = 34;      // 35��Ǝ��ы敪
    private final int CSV_COLNO_SPL_ITEM_TYP = 35;      // 36�󋋕i�敪
    private final int CSV_COLNO_TAX_CD = 36;            // 37����ŃR�[�h
    private final int CSV_COLNO_CAL_NO = 37;            // 38�J�����_�ԍ�
    private final int CSV_COLNO_WH_CD = 38;             // 39�ۊǋ�R�[�h
// 2008/07/25 SYSCOM �镔 ADD START
    private final int CSV_COLNO_MANHOUR_TYP = 39;       // 40�H���Ǘ��i�ڋ敪
// 2008/07/25 SYSCOM �镔 ADD END
	private final int CSV_COLNO_DEPO_TYP = 40;				      // 41�ۊǋ敪
	private final int CSV_COLNO_LOT_CTRL_FLG = 41;				      // 42���b�g�Ǘ��t���O
	private final int CSV_COLNO_LOT_NUMBERING_TYP = 42;				      // 43���b�g�̔ԋ敪
	private final int CSV_COLNO_BEST_BEFORE_YEAR = 43;				      // 44�i�������N��
	private final int CSV_COLNO_BEST_BEFORE_MONTH = 44;				      // 45�i����������
	private final int CSV_COLNO_BEST_BEFORE_DAY = 45;				      // 46�i����������
//20150803 ADD SATRT BY SYSCOM
	private final int CSV_COLNO_DEPT_CD = 46;            // 47���S����R�[�h
	private final int CSV_COLNO_PJ_CD = 47;              // 48�v���W�F�N�g�R�[�h
	private final int CSV_COLNO_SEG_CONTENTS_1 = 48;     // 49�Z�O�����g1
	private final int CSV_COLNO_SEG_CONTENTS_2 = 49;     // 50�Z�O�����g2
	private final int CSV_COLNO_SEG_CONTENTS_3 = 50;     // 51�Z�O�����g3
	private final int CSV_COLNO_SEG_CONTENTS_4 = 51;     // 52�Z�O�����g4
//20150803 ADD END BY SYSCOM
//20150803 MOD START BY SYSCOM
//	private final int CSV_COLNO_REMARK1 = 46;				      // 47���l1
//	private final int CSV_COLNO_REMARK2 = 47;				      // 48���l2
//	private final int CSV_COLNO_ITEM_CLASS_01_CD = 48;				      // 49�i�ڕ���01�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_02_CD = 49;				      // 50�i�ڕ���02�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_03_CD = 50;				      // 51�i�ڕ���013�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_04_CD = 51;				      // 52�i�ڕ���04�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_05_CD = 52;				      // 53�i�ڕ���05�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_06_CD = 53;				      // 54�i�ڕ���06�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_07_CD = 54;				      // 55�i�ڕ���07�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_08_CD = 55;				      // 56�i�ڕ���08�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_09_CD = 56;				      // 57�i�ڕ���09�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_10_CD = 57;				      // 58�i�ڕ���10�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_11_CD = 58;				      // 59�i�ڕ���11�R�[�h
//	private final int CSV_COLNO_ITEM_CLASS_12_CD = 59;				      // 60�i�ڕ���12�R�[�h	
	
	private final int CSV_COLNO_REMARK1 = 52;				              // 53���l1
	private final int CSV_COLNO_REMARK2 = 53;				              // 54���l2
	private final int CSV_COLNO_ITEM_CLASS_01_CD = 54;				      // 55�i�ڕ���01�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_02_CD = 55;				      // 56�i�ڕ���02�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_03_CD = 56;				      // 57�i�ڕ���013�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_04_CD = 57;				      // 58�i�ڕ���04�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_05_CD = 58;				      // 59�i�ڕ���05�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_06_CD = 59;				      // 60�i�ڕ���06�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_07_CD = 60;				      // 61�i�ڕ���07�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_08_CD = 61;				      // 62�i�ڕ���08�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_09_CD = 62;				      // 63�i�ڕ���09�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_10_CD = 63;				      // 64�i�ڕ���10�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_11_CD = 64;				      // 65�i�ڕ���11�R�[�h
	private final int CSV_COLNO_ITEM_CLASS_12_CD = 65;				      // 66�i�ڕ���12�R�[�h	
//20150803 MOD END BY SYSCOM


    private final int CSV_COLNO_99 = 99;                // 99

    /** �b�r�u�捞�f�[�^�K�v���ڐ�(���v) */
// 2008/07/25 SYSCOM �镔 ORIGINAL START
//    private final int CSV_NECESSARY_COLUMN = (CSV_COLNO_WH_CD + 1);
// 2008/07/25 SYSCOM �镔 ORIGINAL END
// 2008/07/25 SYSCOM �镔 UPD START
    private final int CSV_NECESSARY_COLUMN = (CSV_COLNO_ITEM_CLASS_12_CD + 1);
// 2008/07/25 SYSCOM �镔 UPD END

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
                    AA0150010Struct structCsv = new AA0150010Struct();
                    Vector v = csvReader.importCSVLine(strsCsvData[i]);
                    if(null != v)
                    {
                        // ���ڐ��`�F�b�N
                        // CSV�t�@�C���̍��ڐ���ϐ��Ɏ擾�B
                        int intColNum = v.size();
                        if(CSV_NECESSARY_COLUMN == intColNum)
                        {
                            // ��1�i�ڔԍ�
                            if ((String) v.get(CSV_COLNO_ITEM_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CD)) == true )
                            {
                                structCsv.seth_ITEM_CD((String)null);
                            } else {
                                structCsv.seth_ITEM_CD((String) v.get(CSV_COLNO_ITEM_CD));
                            }
                            //CSV�o�͂̕i�ڔԍ�
                            structCsv.setOUT_ITEM_CD(structCsv.geth_ITEM_CD());
                            // \�̏ꍇ�A\\�Œu������
                            structCsv.seth_ITEM_CD(replaceSlash(structCsv.geth_ITEM_CD()));
                            // ��2�i�ږ�
                            if ((String) v.get(CSV_COLNO_ITEM_NAME) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_NAME)) == true )
                            {
                                structCsv.seth_ITEM_NAME((String)null);
                            } else {
                                structCsv.seth_ITEM_NAME((String) v.get(CSV_COLNO_ITEM_NAME));
                            }
                            // ��3�}�ʔԍ�
                            if ((String) v.get(CSV_COLNO_DRAW_CD) == null || ("").equals((String) v.get(CSV_COLNO_DRAW_CD)) == true )
                            {
                                structCsv.seth_DRAW_CD((String)null);
                            } else {
                                structCsv.seth_DRAW_CD((String) v.get(CSV_COLNO_DRAW_CD));
                            }
                            // ��4�K�i
                            if ((String) v.get(CSV_COLNO_SPEC) == null || ("").equals((String) v.get(CSV_COLNO_SPEC)) == true )
                            {
                                structCsv.seth_SPEC((String)null);
                            } else {
                                structCsv.seth_SPEC((String) v.get(CSV_COLNO_SPEC));
                            }
                            // ��5���x���ԍ�
                            if ((String) v.get(CSV_COLNO_HIGH_LEVEL_NO) == null || ("").equals((String) v.get(CSV_COLNO_HIGH_LEVEL_NO)) == true )
                            {
                                structCsv.seth_HIGH_LEVEL_NO((String)null);
                            } else {
                                structCsv.seth_HIGH_LEVEL_NO((String) v.get(CSV_COLNO_HIGH_LEVEL_NO));
                            }
                            structCsv.seth_HIGH_LEVEL_NO(trim(structCsv.geth_HIGH_LEVEL_NO()));
                            // ��6�i�ڎ�z�敪
                            if ((String) v.get(CSV_COLNO_MRP_ODR_TYP) == null || ("").equals((String) v.get(CSV_COLNO_MRP_ODR_TYP)) == true)
                            {
                                structCsv.seth_MRP_ODR_TYP((String)null);
                            } else {
                                structCsv.seth_MRP_ODR_TYP((String) v.get(CSV_COLNO_MRP_ODR_TYP));
                            }
                            structCsv.seth_MRP_ODR_TYP(trim(structCsv.geth_MRP_ODR_TYP()));
                            // ��7�i�ړ��O��敪
                            if ((String) v.get(CSV_COLNO_OUTSIDE_TYP) == null || ("").equals((String) v.get(CSV_COLNO_OUTSIDE_TYP)) == true)
                            {
                                structCsv.seth_OUTSIDE_TYP((String)null);
                            } else {
                                structCsv.seth_OUTSIDE_TYP((String) v.get(CSV_COLNO_OUTSIDE_TYP));
                            }
                            structCsv.seth_OUTSIDE_TYP(trim(structCsv.geth_OUTSIDE_TYP()));
                            // ��8�׎p�Ǘ��t���O
                            if ((String) v.get(CSV_COLNO_STOCK_UNIT_FLG) == null || ("").equals((String) v.get(CSV_COLNO_STOCK_UNIT_FLG)) == true)
                            {
                                structCsv.seth_STOCK_UNIT_FLG((String)null);
                            } else {
                                structCsv.seth_STOCK_UNIT_FLG((String) v.get(CSV_COLNO_STOCK_UNIT_FLG));
                            }
                            structCsv.seth_STOCK_UNIT_FLG(trim(structCsv.geth_STOCK_UNIT_FLG()));
                            // ��9�v�ʒP��
                            if ((String) v.get(CSV_COLNO_STOCK_UNIT) == null || ("").equals((String) v.get(CSV_COLNO_STOCK_UNIT)) == true)
                            {
                                structCsv.seth_STOCK_UNIT((String)null);
                            } else {
                                structCsv.seth_STOCK_UNIT((String) v.get(CSV_COLNO_STOCK_UNIT));
                            }
                            // ��10�׎p�v�ʒP��
                            if ((String) v.get(CSV_COLNO_PKG_UNIT) == null || ("").equals((String) v.get(CSV_COLNO_PKG_UNIT)) == true)
                            {
                                structCsv.seth_PKG_UNIT((String)null);
                            } else {
                                structCsv.seth_PKG_UNIT((String) v.get(CSV_COLNO_PKG_UNIT));
                            }
                            // ��11�׎p�P�ʐ�
                            if ((String) v.get(CSV_COLNO_PKG_UNIT_QTY) == null || ("").equals((String) v.get(CSV_COLNO_PKG_UNIT_QTY)) == true)
                            {
                                structCsv.seth_PKG_UNIT_QTY((String)null);
                            } else {
                                structCsv.seth_PKG_UNIT_QTY((String) v.get(CSV_COLNO_PKG_UNIT_QTY));
                            }
                            structCsv.seth_PKG_UNIT_QTY(trim(structCsv.geth_PKG_UNIT_QTY()));
                            // ��12�݌ɐ��P�ʋ敪
                            if ((String) v.get(CSV_COLNO_UNIT_QTY_TYP) == null || ("").equals((String) v.get(CSV_COLNO_UNIT_QTY_TYP)) == true)
                            {
                                structCsv.seth_UNIT_QTY_TYP((String)null);
                            } else {
                                structCsv.seth_UNIT_QTY_TYP((String) v.get(CSV_COLNO_UNIT_QTY_TYP));
                            }
                            structCsv.seth_UNIT_QTY_TYP(trim(structCsv.geth_UNIT_QTY_TYP()));
                            // ��13�i�ڎ�z���[�h�^�C��
                            if ((String) v.get(CSV_COLNO_ODR_LT) == null || ("").equals((String) v.get(CSV_COLNO_ODR_LT)) == true)
                            {
                                structCsv.seth_ODR_LT((String)null);
                            } else {
                                structCsv.seth_ODR_LT((String) v.get(CSV_COLNO_ODR_LT));
                            }
                            structCsv.seth_ODR_LT(trim(structCsv.geth_ODR_LT()));
                            // ��14�i�ڌŒ蕪���[�h�^�C��
                            if ((String) v.get(CSV_COLNO_FIXED_LT) == null || ("").equals((String) v.get(CSV_COLNO_FIXED_LT)) == true)
                            {
                                structCsv.seth_FIXED_LT((String)null);
                            } else {
                                structCsv.seth_FIXED_LT((String) v.get(CSV_COLNO_FIXED_LT));
                            }
                            structCsv.seth_FIXED_LT(trim(structCsv.geth_FIXED_LT()));
                            // ��15�i�ڔ�ᕪ���[�h�^�C��
                            if ((String) v.get(CSV_COLNO_PROP_LT) == null || ("").equals((String) v.get(CSV_COLNO_PROP_LT)) == true)
                            {
                                structCsv.seth_PROP_LT((String)null);
                            } else {
                                structCsv.seth_PROP_LT((String) v.get(CSV_COLNO_PROP_LT));
                            }
                            structCsv.seth_PROP_LT(trim(structCsv.geth_PROP_LT()));
                            // ��16���S����
                            if ((String) v.get(CSV_COLNO_SAFETY_LT) == null || ("").equals((String) v.get(CSV_COLNO_SAFETY_LT)) == true)
                            {
                                structCsv.seth_SAFETY_LT((String)null);
                            } else {
                                structCsv.seth_SAFETY_LT((String) v.get(CSV_COLNO_SAFETY_LT));
                            }
                            structCsv.seth_SAFETY_LT(trim(structCsv.geth_SAFETY_LT()));
                            // ��17���o���[�h�^�C��
                            if ((String) v.get(CSV_COLNO_ISSUE_LT) == null || ("").equals((String) v.get(CSV_COLNO_ISSUE_LT)) == true)
                            {
                                structCsv.seth_ISSUE_LT((String)null);
                            } else {
                                structCsv.seth_ISSUE_LT((String) v.get(CSV_COLNO_ISSUE_LT));
                            }
                            structCsv.seth_ISSUE_LT(trim(structCsv.geth_ISSUE_LT()));
                            // ��18�i�ڔ�ᕪ���b�g�T�C�Y
                            if ((String) v.get(CSV_COLNO_PROP_LOT_SIZE) == null || ("").equals((String) v.get(CSV_COLNO_PROP_LOT_SIZE)) == true)
                            {
                                structCsv.seth_PROP_LOT_SIZE((String)null);
                            } else {
                                structCsv.seth_PROP_LOT_SIZE((String) v.get(CSV_COLNO_PROP_LOT_SIZE));
                            }
                            structCsv.seth_PROP_LOT_SIZE(trim(structCsv.geth_PROP_LOT_SIZE()));
                            // ��19�i�ڎd����
                            if ((String) v.get(CSV_COLNO_ITEM_SPOIL) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_SPOIL)) == true)
                            {
                                structCsv.seth_ITEM_SPOIL((String)null);
                            } else {
                                structCsv.seth_ITEM_SPOIL((String) v.get(CSV_COLNO_ITEM_SPOIL));
                            }
                            structCsv.seth_ITEM_SPOIL(trim(structCsv.geth_ITEM_SPOIL()));
                            // ��20���S�݌ɗ�
                            if ((String) v.get(CSV_COLNO_SAFETY_STOCK) == null || ("").equals((String) v.get(CSV_COLNO_SAFETY_STOCK)) == true)
                            {
                                structCsv.seth_SAFETY_STOCK((String)null);
                            } else {
                                structCsv.seth_SAFETY_STOCK((String) v.get(CSV_COLNO_SAFETY_STOCK));
                            }
                            structCsv.seth_SAFETY_STOCK(trim(structCsv.geth_SAFETY_STOCK()));
                            // ��21���b�g�܂Ƃߋ敪
                            if ((String) v.get(CSV_COLNO_LOT_SIZING_TYP) == null || ("").equals((String) v.get(CSV_COLNO_LOT_SIZING_TYP)) == true)
                            {
                                structCsv.seth_LOT_SIZING_TYP((String)null);
                            } else {
                                structCsv.seth_LOT_SIZING_TYP((String) v.get(CSV_COLNO_LOT_SIZING_TYP));
                            }
                            structCsv.seth_LOT_SIZING_TYP(trim(structCsv.geth_LOT_SIZING_TYP()));
                            // ��22�ő�܂Ƃߊ���
                            if ((String) v.get(CSV_COLNO_MAX_PERIOD) == null || ("").equals((String) v.get(CSV_COLNO_MAX_PERIOD)) == true)
                            {
                                structCsv.seth_MAX_PERIOD((String)null);
                            } else {
                                structCsv.seth_MAX_PERIOD((String) v.get(CSV_COLNO_MAX_PERIOD));
                            }
                            structCsv.seth_MAX_PERIOD(trim(structCsv.geth_MAX_PERIOD()));
                            // ��23�ő��z��
                            if ((String) v.get(CSV_COLNO_MAX_ODR_QTY) == null || ("").equals((String) v.get(CSV_COLNO_MAX_ODR_QTY)) == true)
                            {
                                structCsv.seth_MAX_ODR_QTY((String)null);
                            } else {
                                structCsv.seth_MAX_ODR_QTY((String) v.get(CSV_COLNO_MAX_ODR_QTY));
                            }
                            structCsv.seth_MAX_ODR_QTY(trim(structCsv.geth_MAX_ODR_QTY()));
                            // ��24�����_�݌ɐ�
                            if ((String) v.get(CSV_COLNO_ODR_POINT) == null || ("").equals((String) v.get(CSV_COLNO_ODR_POINT)) == true)
                            {
                                structCsv.seth_ODR_POINT((String)null);
                            } else {
                                structCsv.seth_ODR_POINT((String) v.get(CSV_COLNO_ODR_POINT));
                            }
                            structCsv.seth_ODR_POINT(trim(structCsv.geth_ODR_POINT()));
                            // ��25��ʔ�����
                            if ((String) v.get(CSV_COLNO_FIXED_ODR_QTY) == null || ("").equals((String) v.get(CSV_COLNO_FIXED_ODR_QTY)) == true)
                            {
                                structCsv.seth_FIXED_ODR_QTY((String)null);
                            } else {
                                structCsv.seth_FIXED_ODR_QTY((String) v.get(CSV_COLNO_FIXED_ODR_QTY));
                            }
                            structCsv.seth_FIXED_ODR_QTY(trim(structCsv.geth_FIXED_ODR_QTY()));
                            // ��26�ŏ���z��
                            if ((String) v.get(CSV_COLNO_MIN_ODR_QTY) == null || ("").equals((String) v.get(CSV_COLNO_MIN_ODR_QTY)) == true)
                            {
                                structCsv.seth_MIN_ODR_QTY((String)null);
                            } else {
                                structCsv.seth_MIN_ODR_QTY((String) v.get(CSV_COLNO_MIN_ODR_QTY));
                            }
                            structCsv.seth_MIN_ODR_QTY(trim(structCsv.geth_MIN_ODR_QTY()));
                            // ��27�܂�ߒP��
                            if ((String) v.get(CSV_COLNO_MUL_ODR_QTY) == null || ("").equals((String) v.get(CSV_COLNO_MUL_ODR_QTY)) == true)
                            {
                                structCsv.seth_MUL_ODR_QTY((String)null);
                            } else {
                                structCsv.seth_MUL_ODR_QTY((String) v.get(CSV_COLNO_MUL_ODR_QTY));
                            }
                            structCsv.seth_MUL_ODR_QTY(trim(structCsv.geth_MUL_ODR_QTY()));
                            // ��28�o�ɋ敪
                            if ((String) v.get(CSV_COLNO_ISSUE_TYP) == null || ("").equals((String) v.get(CSV_COLNO_ISSUE_TYP)) == true)
                            {
                                structCsv.seth_ISSUE_TYP((String)null);
                            } else {
                                structCsv.seth_ISSUE_TYP((String) v.get(CSV_COLNO_ISSUE_TYP));
                            }
                            structCsv.seth_ISSUE_TYP(trim(structCsv.geth_ISSUE_TYP()));
                            // ��29MPS�i�ڃt���O
                            if ((String) v.get(CSV_COLNO_MPS_FLG) == null || ("").equals((String) v.get(CSV_COLNO_MPS_FLG)) == true)
                            {
                                structCsv.seth_MPS_FLG((String)null);
                            } else {
                                structCsv.seth_MPS_FLG((String) v.get(CSV_COLNO_MPS_FLG));
                            }
                            structCsv.seth_MPS_FLG(trim(structCsv.geth_MPS_FLG()));
                            // ��30��������敪
                            if ((String) v.get(CSV_COLNO_ACPT_INSPC_TYP) == null || ("").equals((String) v.get(CSV_COLNO_ACPT_INSPC_TYP)) == true)
                            {
                                structCsv.seth_ACPT_INSPC_TYP((String)null);
                            } else {
                                structCsv.seth_ACPT_INSPC_TYP((String) v.get(CSV_COLNO_ACPT_INSPC_TYP));
                            }
                            structCsv.seth_ACPT_INSPC_TYP(trim(structCsv.geth_ACPT_INSPC_TYP()));
                            // ��31���i�敪
                            if ((String) v.get(CSV_COLNO_PRODUCT_TYP) == null || ("").equals((String) v.get(CSV_COLNO_PRODUCT_TYP)) == true)
                            {
                                structCsv.seth_PRODUCT_TYP((String)null);
                            } else {
                                structCsv.seth_PRODUCT_TYP((String) v.get(CSV_COLNO_PRODUCT_TYP));
                            }
                            structCsv.seth_PRODUCT_TYP(trim(structCsv.geth_PRODUCT_TYP()));
                            // ��32�Ǘ��R�[�h
                            if ((String) v.get(CSV_COLNO_CLASIFICATION_CD) == null || ("").equals((String) v.get(CSV_COLNO_CLASIFICATION_CD)) == true)
                            {
                                structCsv.seth_CLASIFICATION_CD((String)null);
                            } else {
                                structCsv.seth_CLASIFICATION_CD((String) v.get(CSV_COLNO_CLASIFICATION_CD));
                            }
                            // ��33�P�ʏd��
                            if ((String) v.get(CSV_COLNO_UNIT_WEIGHT) == null || ("").equals((String) v.get(CSV_COLNO_UNIT_WEIGHT)) == true)
                            {
                                structCsv.seth_UNIT_WEIGHT((String)null);
                            } else {
                                structCsv.seth_UNIT_WEIGHT((String) v.get(CSV_COLNO_UNIT_WEIGHT));
                            }
                            structCsv.seth_UNIT_WEIGHT(trim(structCsv.geth_UNIT_WEIGHT()));
                            // ��34�I���敪
                            if ((String) v.get(CSV_COLNO_ABC_TYP) == null || ("").equals((String) v.get(CSV_COLNO_ABC_TYP)) == true)
                            {
                                structCsv.seth_ABC_TYP((String)null);
                            } else {
                                structCsv.seth_ABC_TYP((String) v.get(CSV_COLNO_ABC_TYP));
                            }
                            structCsv.seth_ABC_TYP(trim(structCsv.geth_ABC_TYP()));
                            // ��35��Ǝ��ы敪
                            if ((String) v.get(CSV_COLNO_OPR_RSLT_TYP) == null || ("").equals((String) v.get(CSV_COLNO_OPR_RSLT_TYP)) == true)
                            {
                                structCsv.seth_OPR_RSLT_TYP((String)null);
                            } else {
                                structCsv.seth_OPR_RSLT_TYP((String) v.get(CSV_COLNO_OPR_RSLT_TYP));
                            }
                            structCsv.seth_OPR_RSLT_TYP(trim(structCsv.geth_OPR_RSLT_TYP()));
                            // ��36�󋋕i�敪
                            if ((String) v.get(CSV_COLNO_SPL_ITEM_TYP) == null || ("").equals((String) v.get(CSV_COLNO_SPL_ITEM_TYP)) == true)
                            {
                                structCsv.seth_SPL_ITEM_TYP((String)null);
                            } else {
                                structCsv.seth_SPL_ITEM_TYP((String) v.get(CSV_COLNO_SPL_ITEM_TYP));
                            }
                            structCsv.seth_SPL_ITEM_TYP(trim(structCsv.geth_SPL_ITEM_TYP()));
                            // ��37����ŃR�[�h
                            if ((String) v.get(CSV_COLNO_TAX_CD) == null || ("").equals((String) v.get(CSV_COLNO_TAX_CD)) == true)
                            {
                                structCsv.seth_TAX_CD((String)null);
                            } else {
                                structCsv.seth_TAX_CD((String) v.get(CSV_COLNO_TAX_CD));
                            }
                            // ��38�J�����_�ԍ�
                            if ((String) v.get(CSV_COLNO_CAL_NO) == null || ("").equals((String) v.get(CSV_COLNO_CAL_NO)) == true)
                            {
                                structCsv.seth_CAL_NO((String)null);
                            } else {
                                structCsv.seth_CAL_NO((String) v.get(CSV_COLNO_CAL_NO));
                            }
                            structCsv.seth_CAL_NO(trim(structCsv.geth_CAL_NO()));
                            // ��39�ۊǋ�R�[�h
                            if ((String) v.get(CSV_COLNO_WH_CD) == null || ("").equals((String) v.get(CSV_COLNO_WH_CD)) == true)
                            {
                                structCsv.seth_WH_CD((String)null);
                            } else {
                                structCsv.seth_WH_CD((String) v.get(CSV_COLNO_WH_CD));
                            }
// 2008/07/25 SYSCOM �镔 ADD START
                            // ��40�H���Ǘ��i�ڋ敪
                            if ((String) v.get(CSV_COLNO_MANHOUR_TYP) == null || ("").equals((String) v.get(CSV_COLNO_MANHOUR_TYP)) == true)
                            {
                                structCsv.seth_MANHOUR_TYP((String)null);
                            } else {
                                structCsv.seth_MANHOUR_TYP((String) v.get(CSV_COLNO_MANHOUR_TYP));
                            }
                            structCsv.seth_MANHOUR_TYP(trim(structCsv.geth_MANHOUR_TYP()));
// 2008/07/25 SYSCOM �镔 ADD END
							// ��41�ۊǋ敪
							if ((String) v.get(CSV_COLNO_DEPO_TYP) == null || ("").equals((String) v.get(CSV_COLNO_DEPO_TYP)) == true)
							{
								structCsv.seth_DEPO_TYP((String)null);
							} else {
								structCsv.seth_DEPO_TYP((String) v.get(CSV_COLNO_DEPO_TYP));
							}
							// ��42���b�g�Ǘ��t���O
							if ((String) v.get(CSV_COLNO_LOT_CTRL_FLG) == null || ("").equals((String) v.get(CSV_COLNO_LOT_CTRL_FLG)) == true)
							{
								structCsv.seth_LOT_CTRL_FLG((String)null);
							} else {
								structCsv.seth_LOT_CTRL_FLG((String) v.get(CSV_COLNO_LOT_CTRL_FLG));
							}
							// ��43���b�g�̔ԋ敪
							if ((String) v.get(CSV_COLNO_LOT_NUMBERING_TYP) == null || ("").equals((String) v.get(CSV_COLNO_LOT_NUMBERING_TYP)) == true)
							{
								structCsv.seth_LOT_NUMBERING_TYP((String)null);
							} else {
								structCsv.seth_LOT_NUMBERING_TYP((String) v.get(CSV_COLNO_LOT_NUMBERING_TYP));
							}
							// ��44�i�������N��
							if ((String) v.get(CSV_COLNO_BEST_BEFORE_YEAR) == null || ("").equals((String) v.get(CSV_COLNO_BEST_BEFORE_YEAR)) == true)
							{
								structCsv.seth_BEST_BEFORE_YEAR((String)null);
							} else {
								structCsv.seth_BEST_BEFORE_YEAR((String) v.get(CSV_COLNO_BEST_BEFORE_YEAR));
							}
							// ��45�i����������
							if ((String) v.get(CSV_COLNO_BEST_BEFORE_MONTH) == null || ("").equals((String) v.get(CSV_COLNO_BEST_BEFORE_MONTH)) == true)
							{
								structCsv.seth_BEST_BEFORE_MONTH((String)null);
							} else {
								structCsv.seth_BEST_BEFORE_MONTH((String) v.get(CSV_COLNO_BEST_BEFORE_MONTH));
							}

							// ��46�i����������
							if ((String) v.get(CSV_COLNO_BEST_BEFORE_DAY) == null || ("").equals((String) v.get(CSV_COLNO_BEST_BEFORE_DAY)) == true)
							{
								structCsv.seth_BEST_BEFORE_DAY((String)null);
							} else {
								structCsv.seth_BEST_BEFORE_DAY((String) v.get(CSV_COLNO_BEST_BEFORE_DAY));
							}

//20150803 ADD START BY SYSCOM
							// ��47���S����R�[�h
							if ((String) v.get(CSV_COLNO_DEPT_CD) == null || ("").equals((String) v.get(CSV_COLNO_DEPT_CD)) == true)
							{
								structCsv.seth_DEPT_CD((String)null);
							} else {
								structCsv.seth_DEPT_CD((String) v.get(CSV_COLNO_DEPT_CD));
							}
                        	
							// ��48�v���W�F�N�g�R�[�h
							if ((String) v.get(CSV_COLNO_PJ_CD) == null || ("").equals((String) v.get(CSV_COLNO_PJ_CD)) == true)
							{
								structCsv.seth_PJ_CD((String)null);
							} else {
								structCsv.seth_PJ_CD((String) v.get(CSV_COLNO_PJ_CD));
							}
                        	
							// ��49�Z�O�����g1
							if ((String) v.get(CSV_COLNO_SEG_CONTENTS_1) == null || ("").equals((String) v.get(CSV_COLNO_SEG_CONTENTS_1)) == true)
							{
								structCsv.seth_SEG_CONTENTS_1((String)null);
							} else {
								structCsv.seth_SEG_CONTENTS_1((String) v.get(CSV_COLNO_SEG_CONTENTS_1));
							}
                        	
							// ��50�Z�O�����g2
							if ((String) v.get(CSV_COLNO_SEG_CONTENTS_2) == null || ("").equals((String) v.get(CSV_COLNO_SEG_CONTENTS_2)) == true)
							{
								structCsv.seth_SEG_CONTENTS_2((String)null);
							} else {
								structCsv.seth_SEG_CONTENTS_2((String) v.get(CSV_COLNO_SEG_CONTENTS_2));
							}
                        	
							// ��51�Z�O�����g3
							if ((String) v.get(CSV_COLNO_SEG_CONTENTS_3) == null || ("").equals((String) v.get(CSV_COLNO_SEG_CONTENTS_3)) == true)
							{
								structCsv.seth_SEG_CONTENTS_3((String)null);
							} else {
								structCsv.seth_SEG_CONTENTS_3((String) v.get(CSV_COLNO_SEG_CONTENTS_3));
							}
                        	
							// ��52�Z�O�����g4
							if ((String) v.get(CSV_COLNO_SEG_CONTENTS_4) == null || ("").equals((String) v.get(CSV_COLNO_SEG_CONTENTS_4)) == true)
							{
								structCsv.seth_SEG_CONTENTS_4((String)null);
							} else {
								structCsv.seth_SEG_CONTENTS_4((String) v.get(CSV_COLNO_SEG_CONTENTS_4));
							}
//20150803 ADD END BY SYSCOM
							// ��53���l1
							if ((String) v.get(CSV_COLNO_REMARK1) == null || ("").equals((String) v.get(CSV_COLNO_REMARK1)) == true)
							{
								structCsv.seth_REMARK1((String)null);
							} else {
								structCsv.seth_REMARK1((String) v.get(CSV_COLNO_REMARK1));
							}

							// ��54���l2
							if ((String) v.get(CSV_COLNO_REMARK2) == null || ("").equals((String) v.get(CSV_COLNO_REMARK2)) == true)
							{
								structCsv.seth_REMARK2((String)null);
							} else {
								structCsv.seth_REMARK2((String) v.get(CSV_COLNO_REMARK2));
							}

							// ��55�i�ڕ���01�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_01_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_01_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_01_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_01_CD((String) v.get(CSV_COLNO_ITEM_CLASS_01_CD));
							}

							// ��56�i�ڕ���02�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_02_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_02_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_02_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_02_CD((String) v.get(CSV_COLNO_ITEM_CLASS_02_CD));
							}

							// ��57�i�ڕ���03�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_03_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_03_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_03_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_03_CD((String) v.get(CSV_COLNO_ITEM_CLASS_03_CD));
							}

							// ��58�i�ڕ���04�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_04_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_04_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_04_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_04_CD((String) v.get(CSV_COLNO_ITEM_CLASS_04_CD));
							}

							// ��59�i�ڕ���05�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_05_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_05_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_05_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_05_CD((String) v.get(CSV_COLNO_ITEM_CLASS_05_CD));
							}

							// ��60�i�ڕ���06�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_06_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_06_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_06_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_06_CD((String) v.get(CSV_COLNO_ITEM_CLASS_06_CD));
							}

							// ��61�i�ڕ���07�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_07_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_07_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_07_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_07_CD((String) v.get(CSV_COLNO_ITEM_CLASS_07_CD));
							}
                        	
							// ��62�i�ڕ���08�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_08_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_08_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_08_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_08_CD((String) v.get(CSV_COLNO_ITEM_CLASS_08_CD));
							}

							// ��63�i�ڕ���09�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_09_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_09_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_09_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_09_CD((String) v.get(CSV_COLNO_ITEM_CLASS_09_CD));
							}

							// ��64�i�ڕ���10�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_10_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_10_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_10_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_10_CD((String) v.get(CSV_COLNO_ITEM_CLASS_10_CD));
							}

							// ��65�i�ڕ���11�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_11_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_11_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_11_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_11_CD((String) v.get(CSV_COLNO_ITEM_CLASS_11_CD));
							}

							// ��66�i�ڕ���12�R�[�h
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_12_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_12_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_12_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_12_CD((String) v.get(CSV_COLNO_ITEM_CLASS_12_CD));
							}

                            structCsv.setw_COLUMN_FLG((String)null);        // ����捞�ꍇ�́A�ϐ�COLUMN_FLG��null���Z�b�g����B
                        }
                        else
                        {
                            // �b�r�u�̍��ڂ����X�g�f�[�^��
                            // ��1�i�ڔԍ�
                            structCsv.seth_ITEM_CD((String) v.get(CSV_COLNO_ITEM_CD));
                            // CSV�o�͂̕i�ڔԍ�
                            structCsv.setOUT_ITEM_CD(structCsv.geth_ITEM_CD());
                            // \�̏ꍇ�A\\�Œu������
                            structCsv.seth_ITEM_CD(replaceSlash(structCsv.geth_ITEM_CD()));
                            // ��2�i�ږ��`�F�b�N
                            if(intColNum > CSV_COLNO_ITEM_NAME)
                            {
                                structCsv.seth_ITEM_NAME((String) v.get(CSV_COLNO_ITEM_NAME));
                            } else {
                                structCsv.seth_ITEM_NAME((String)null);
                            }
                            // ��3�}�ʔԍ��`�F�b�N
                            if(intColNum > CSV_COLNO_DRAW_CD)
                            {
                                structCsv.seth_DRAW_CD((String) v.get(CSV_COLNO_DRAW_CD));
                            } else {
                                structCsv.seth_DRAW_CD((String)null);
                            }
                            // ��4�K�i�`�F�b�N
                            if(intColNum > CSV_COLNO_SPEC)
                            {
                                structCsv.seth_SPEC((String) v.get(CSV_COLNO_SPEC));
                            } else {
                                structCsv.seth_SPEC((String)null);
                            }
                            // ��5���x���ԍ��`�F�b�N
                            if(intColNum > CSV_COLNO_HIGH_LEVEL_NO)
                            {
                                structCsv.seth_HIGH_LEVEL_NO((String) v.get(CSV_COLNO_HIGH_LEVEL_NO));
                            } else {
                                structCsv.seth_HIGH_LEVEL_NO((String)null);
                            }
                            // ��6�i�ڎ�z�敪�`�F�b�N
                            if(intColNum > CSV_COLNO_MRP_ODR_TYP)
                            {
                                structCsv.seth_MRP_ODR_TYP((String) v.get(CSV_COLNO_MRP_ODR_TYP));
                            } else {
                                structCsv.seth_MRP_ODR_TYP((String)null);
                            }
                            // ��7�i�ړ��O��敪�`�F�b�N
                            if(intColNum > CSV_COLNO_OUTSIDE_TYP)
                            {
                                structCsv.seth_OUTSIDE_TYP((String) v.get(CSV_COLNO_OUTSIDE_TYP));
                            } else {
                                structCsv.seth_OUTSIDE_TYP((String)null);
                            }
                            // ��8�׎p�Ǘ��t���O�`�F�b�N
                            if(intColNum > CSV_COLNO_STOCK_UNIT_FLG)
                            {
                                structCsv.seth_STOCK_UNIT_FLG((String) v.get(CSV_COLNO_STOCK_UNIT_FLG));
                            } else {
                                structCsv.seth_STOCK_UNIT_FLG((String)null);
                            }
                            // ��9�v�ʒP�ʃ`�F�b�N
                            if(intColNum > CSV_COLNO_STOCK_UNIT)
                            {
                                structCsv.seth_STOCK_UNIT((String) v.get(CSV_COLNO_STOCK_UNIT));
                            } else {
                                structCsv.seth_STOCK_UNIT((String)null);
                            }
                            // ��10�׎p�v�ʒP�ʃ`�F�b�N
                            if(intColNum > CSV_COLNO_PKG_UNIT)
                            {
                                structCsv.seth_PKG_UNIT((String) v.get(CSV_COLNO_PKG_UNIT));
                            } else {
                                structCsv.seth_PKG_UNIT((String)null);
                            }
                            // ��11�׎p�P�ʐ��`�F�b�N
                            if(intColNum > CSV_COLNO_PKG_UNIT_QTY)
                            {
                                structCsv.seth_PKG_UNIT_QTY((String) v.get(CSV_COLNO_PKG_UNIT_QTY));
                            } else {
                                structCsv.seth_PKG_UNIT_QTY((String)null);
                            }
                            // ��12�׎p�P�ʐ��`�F�b�N
                            if(intColNum > CSV_COLNO_UNIT_QTY_TYP)
                            {
                                structCsv.seth_UNIT_QTY_TYP((String) v.get(CSV_COLNO_UNIT_QTY_TYP));
                            } else {
                                structCsv.seth_UNIT_QTY_TYP((String)null);
                            }
                            // ��13�i�ڎ�z���[�h�^�C���`�F�b�N
                            if(intColNum > CSV_COLNO_ODR_LT)
                            {
                                structCsv.seth_ODR_LT((String) v.get(CSV_COLNO_ODR_LT));
                            } else {
                                structCsv.seth_ODR_LT((String)null);
                            }
                            // ��14�i�ڎ�z���[�h�^�C���`�F�b�N
                            if(intColNum > CSV_COLNO_FIXED_LT)
                            {
                                structCsv.seth_FIXED_LT((String) v.get(CSV_COLNO_FIXED_LT));
                            } else {
                                structCsv.seth_FIXED_LT((String)null);
                            }
                            // ��15�i�ڔ�ᕪ���[�h�^�C���`�F�b�N
                            if(intColNum > CSV_COLNO_PROP_LT)
                            {
                                structCsv.seth_PROP_LT((String) v.get(CSV_COLNO_PROP_LT));
                            } else {
                                structCsv.seth_PROP_LT((String)null);
                            }
                            // ��16���S�����`�F�b�N
                            if(intColNum > CSV_COLNO_SAFETY_LT)
                            {
                                structCsv.seth_SAFETY_LT((String) v.get(CSV_COLNO_SAFETY_LT));
                            } else {
                                structCsv.seth_SAFETY_LT((String)null);
                            }
                            // ��17���o���[�h�^�C���`�F�b�N
                            if(intColNum > CSV_COLNO_ISSUE_LT)
                            {
                                structCsv.seth_ISSUE_LT((String) v.get(CSV_COLNO_ISSUE_LT));
                            } else {
                                structCsv.seth_ISSUE_LT((String)null);
                            }
                            // ��18�i�ڔ�ᕪ���b�g�T�C�Y�`�F�b�N
                            if(intColNum > CSV_COLNO_PROP_LOT_SIZE)
                            {
                                structCsv.seth_PROP_LOT_SIZE((String) v.get(CSV_COLNO_PROP_LOT_SIZE));
                            } else {
                                structCsv.seth_PROP_LOT_SIZE((String)null);
                            }
                            // ��19�i�ڎd�����`�F�b�N
                            if(intColNum > CSV_COLNO_ITEM_SPOIL)
                            {
                                structCsv.seth_ITEM_SPOIL((String) v.get(CSV_COLNO_ITEM_SPOIL));
                            } else {
                                structCsv.seth_ITEM_SPOIL((String)null);
                            }
                            // ��20���S�݌ɗʃ`�F�b�N
                            if(intColNum > CSV_COLNO_SAFETY_STOCK)
                            {
                                structCsv.seth_SAFETY_STOCK((String) v.get(CSV_COLNO_SAFETY_STOCK));
                            } else {
                                structCsv.seth_SAFETY_STOCK((String)null);
                            }
                            // ��21���b�g�܂Ƃߋ敪�`�F�b�N
                            if(intColNum > CSV_COLNO_LOT_SIZING_TYP)
                            {
                                structCsv.seth_LOT_SIZING_TYP((String) v.get(CSV_COLNO_LOT_SIZING_TYP));
                            } else {
                                structCsv.seth_LOT_SIZING_TYP((String)null);
                            }
                            // ��22�ő�܂Ƃߊ��ԃ`�F�b�N
                            if(intColNum > CSV_COLNO_MAX_PERIOD)
                            {
                                structCsv.seth_MAX_PERIOD((String) v.get(CSV_COLNO_MAX_PERIOD));
                            } else {
                                structCsv.seth_MAX_PERIOD((String)null);
                            }
                            // ��23�ő��z���`�F�b�N
                            if(intColNum > CSV_COLNO_MAX_ODR_QTY)
                            {
                                structCsv.seth_MAX_ODR_QTY((String) v.get(CSV_COLNO_MAX_ODR_QTY));
                            } else {
                                structCsv.seth_MAX_ODR_QTY((String)null);
                            }
                            // ��24�����_�݌ɐ��`�F�b�N
                            if(intColNum > CSV_COLNO_ODR_POINT)
                            {
                                structCsv.seth_ODR_POINT((String) v.get(CSV_COLNO_ODR_POINT));
                            } else {
                                structCsv.seth_ODR_POINT((String)null);
                            }
                            // ��25��ʔ������`�F�b�N
                            if(intColNum > CSV_COLNO_FIXED_ODR_QTY)
                            {
                                structCsv.seth_FIXED_ODR_QTY((String) v.get(CSV_COLNO_FIXED_ODR_QTY));
                            } else {
                                structCsv.seth_FIXED_ODR_QTY((String)null);
                            }
                            // ��26�ŏ���z���`�F�b�N
                            if(intColNum > CSV_COLNO_MIN_ODR_QTY)
                            {
                                structCsv.seth_MIN_ODR_QTY((String) v.get(CSV_COLNO_MIN_ODR_QTY));
                            } else {
                                structCsv.seth_MIN_ODR_QTY((String)null);
                            }
                            // ��27�܂�ߒP�ʃ`�F�b�N
                            if(intColNum > CSV_COLNO_MUL_ODR_QTY)
                            {
                                structCsv.seth_MUL_ODR_QTY((String) v.get(CSV_COLNO_MUL_ODR_QTY));
                            } else {
                                structCsv.seth_MUL_ODR_QTY((String)null);
                            }
                            // ��28�o�ɋ敪�`�F�b�N
                            if(intColNum > CSV_COLNO_ISSUE_TYP)
                            {
                                structCsv.seth_ISSUE_TYP((String) v.get(CSV_COLNO_ISSUE_TYP));
                            } else {
                                structCsv.seth_ISSUE_TYP((String)null);
                            }
                            // ��29MPS�i�ڃt���O�`�F�b�N
                            if(intColNum > CSV_COLNO_MPS_FLG)
                            {
                                structCsv.seth_MPS_FLG((String) v.get(CSV_COLNO_MPS_FLG));
                            } else {
                                structCsv.seth_MPS_FLG((String)null);
                            }
                            // ��30��������敪�`�F�b�N
                            if(intColNum > CSV_COLNO_ACPT_INSPC_TYP)
                            {
                                structCsv.seth_ACPT_INSPC_TYP((String) v.get(CSV_COLNO_ACPT_INSPC_TYP));
                            } else {
                                structCsv.seth_ACPT_INSPC_TYP((String)null);
                            }
                            // ��31���i�敪�`�F�b�N
                            if(intColNum > CSV_COLNO_PRODUCT_TYP)
                            {
                                structCsv.seth_PRODUCT_TYP((String) v.get(CSV_COLNO_PRODUCT_TYP));
                            } else {
                                structCsv.seth_PRODUCT_TYP((String)null);
                            }
                            // ��32�Ǘ��R�[�h�`�F�b�N
                            if(intColNum > CSV_COLNO_CLASIFICATION_CD)
                            {
                                structCsv.seth_CLASIFICATION_CD((String) v.get(CSV_COLNO_CLASIFICATION_CD));
                            } else {
                                structCsv.seth_CLASIFICATION_CD((String)null);
                            }
                            // ��33�P�ʏd�ʃ`�F�b�N
                            if(intColNum > CSV_COLNO_UNIT_WEIGHT)
                            {
                                structCsv.seth_UNIT_WEIGHT((String) v.get(CSV_COLNO_UNIT_WEIGHT));
                            } else {
                                structCsv.seth_UNIT_WEIGHT((String)null);
                            }
                            // ��34�I���敪�`�F�b�N
                            if(intColNum > CSV_COLNO_ABC_TYP)
                            {
                                structCsv.seth_ABC_TYP((String) v.get(CSV_COLNO_ABC_TYP));
                            } else {
                                structCsv.seth_ABC_TYP((String)null);
                            }
                            // ��35��Ǝ��ы敪�`�F�b�N
                            if(intColNum > CSV_COLNO_OPR_RSLT_TYP)
                            {
                                structCsv.seth_OPR_RSLT_TYP((String) v.get(CSV_COLNO_OPR_RSLT_TYP));
                            } else {
                                structCsv.seth_OPR_RSLT_TYP((String)null);
                            }
                            // ��36�󋋕i�敪�`�F�b�N
                            if(intColNum > CSV_COLNO_SPL_ITEM_TYP)
                            {
                                structCsv.seth_SPL_ITEM_TYP((String) v.get(CSV_COLNO_SPL_ITEM_TYP));
                            } else {
                                structCsv.seth_SPL_ITEM_TYP((String)null);
                            }
                            // ��37����ŃR�[�h�`�F�b�N
                            if(intColNum > CSV_COLNO_TAX_CD)
                            {
                                structCsv.seth_TAX_CD((String) v.get(CSV_COLNO_TAX_CD));
                            } else {
                                structCsv.seth_TAX_CD((String)null);
                            }
                            // ��38�J�����_�ԍ��`�F�b�N
                            if(intColNum > CSV_COLNO_CAL_NO)
                            {
                                structCsv.seth_CAL_NO((String) v.get(CSV_COLNO_CAL_NO));
                            } else {
                                structCsv.seth_CAL_NO((String)null);
                            }
                            // ��39�ۊǋ�R�[�h�`�F�b�N
                            if(intColNum > CSV_COLNO_WH_CD)
                            {
                                structCsv.seth_WH_CD((String) v.get(CSV_COLNO_WH_CD));
                            } else {
                                structCsv.seth_WH_CD((String)null);
                            }
// 2008/07/25 SYSCOM �镔 ADD START
                            // ��40�H���Ǘ��i�ڋ敪�`�F�b�N
                            if(intColNum > CSV_COLNO_MANHOUR_TYP)
                            {
                                structCsv.seth_MANHOUR_TYP((String) v.get(CSV_COLNO_MANHOUR_TYP));
                            } else {
                                structCsv.seth_MANHOUR_TYP((String)null);
                            }
// 2008/07/25 SYSCOM �镔 ADD END
							// ��41�ۊǋ敪�`�F�b�N
							if (intColNum > CSV_COLNO_DEPO_TYP)
							{
								structCsv.seth_DEPO_TYP((String) v.get(CSV_COLNO_DEPO_TYP));
							} else {
								structCsv.seth_DEPO_TYP((String)null);
							}
							// ��42���b�g�Ǘ��t���O�`�F�b�N
							if (intColNum > CSV_COLNO_LOT_CTRL_FLG)
							{
								structCsv.seth_LOT_CTRL_FLG((String) v.get(CSV_COLNO_LOT_CTRL_FLG));
							} else {
								structCsv.seth_LOT_CTRL_FLG((String)null);
							}
							// ��43���b�g�̔ԋ敪�`�F�b�N
							if (intColNum > CSV_COLNO_LOT_NUMBERING_TYP)
							{
								structCsv.seth_LOT_NUMBERING_TYP((String) v.get(CSV_COLNO_LOT_NUMBERING_TYP));
							} else {
								structCsv.seth_LOT_NUMBERING_TYP((String)null);
							}
							// ��44�i�������N��
							if (intColNum > CSV_COLNO_BEST_BEFORE_YEAR)
							{
								structCsv.seth_BEST_BEFORE_YEAR((String) v.get(CSV_COLNO_BEST_BEFORE_YEAR));
							} else {
								structCsv.seth_BEST_BEFORE_YEAR((String)null);
							}
							// ��45�i����������
							if (intColNum > CSV_COLNO_BEST_BEFORE_MONTH)
							{
								structCsv.seth_BEST_BEFORE_MONTH((String) v.get(CSV_COLNO_BEST_BEFORE_MONTH));
							} else {
								structCsv.seth_BEST_BEFORE_MONTH((String)null);
							}

							// ��46�i����������
							if (intColNum > CSV_COLNO_BEST_BEFORE_DAY)
							{
								structCsv.seth_BEST_BEFORE_DAY((String) v.get(CSV_COLNO_BEST_BEFORE_DAY));
							} else {
								structCsv.seth_BEST_BEFORE_DAY((String)null);
							}
							
//20150803 ADD START BY SYSCOM
							// ��47���S����R�[�h
							if (intColNum > CSV_COLNO_DEPT_CD)
							{
								structCsv.seth_DEPT_CD((String) v.get(CSV_COLNO_DEPT_CD));
							} else {
								structCsv.seth_DEPT_CD((String)null);
							}
                        	
                        	// ��48�v���W�F�N�g�R�[�h
							if (intColNum > CSV_COLNO_PJ_CD)
							{
								structCsv.seth_PJ_CD((String) v.get(CSV_COLNO_PJ_CD));
							} else {
								structCsv.seth_PJ_CD((String)null);
							}
                        	
                        	// ��49�Z�O�����g1
							if (intColNum > CSV_COLNO_SEG_CONTENTS_1)
							{
								structCsv.seth_SEG_CONTENTS_1((String) v.get(CSV_COLNO_SEG_CONTENTS_1));
							} else {
								structCsv.seth_SEG_CONTENTS_1((String)null);
							}
                        	
                        	// ��50�Z�O�����g2
							if (intColNum > CSV_COLNO_SEG_CONTENTS_2)
							{
								structCsv.seth_SEG_CONTENTS_2((String) v.get(CSV_COLNO_SEG_CONTENTS_2));
							} else {
								structCsv.seth_SEG_CONTENTS_2((String)null);
							}
                        	// ��51�Z�O�����g3
							if (intColNum > CSV_COLNO_SEG_CONTENTS_3)
							{
								structCsv.seth_SEG_CONTENTS_3((String) v.get(CSV_COLNO_SEG_CONTENTS_3));
							} else {
								structCsv.seth_SEG_CONTENTS_3((String)null);
							}
                        	
                        	// ��52�Z�O�����g4
							if (intColNum > CSV_COLNO_SEG_CONTENTS_4)
							{
								structCsv.seth_SEG_CONTENTS_4((String) v.get(CSV_COLNO_SEG_CONTENTS_4));
							} else {
								structCsv.seth_SEG_CONTENTS_4((String)null);
							}
//20150803 ADD END BY SYSCOM
							// ��53���l1
							if (intColNum > CSV_COLNO_REMARK1)
							{
								structCsv.seth_REMARK1((String) v.get(CSV_COLNO_REMARK1));
							} else {
								structCsv.seth_REMARK1((String)null);
							}

							// ��54���l2
							if (intColNum > CSV_COLNO_REMARK2)
							{
								structCsv.seth_REMARK2((String) v.get(CSV_COLNO_REMARK2));
							} else {
								structCsv.seth_REMARK2((String)null);
							}
                        	
							// ��55�i�ڕ���01�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_01_CD)
							{
								structCsv.seth_ITEM_CLASS_01_CD((String) v.get(CSV_COLNO_ITEM_CLASS_01_CD));
							} else {
								structCsv.seth_ITEM_CLASS_01_CD((String)null);
							}
                        	
							// ��56�i�ڕ���02�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_02_CD)
							{
								structCsv.seth_ITEM_CLASS_02_CD((String) v.get(CSV_COLNO_ITEM_CLASS_02_CD));
							} else {
								structCsv.seth_ITEM_CLASS_02_CD((String)null);
							}
                        	
							// ��57�i�ڕ���03�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_03_CD)
							{
								structCsv.seth_ITEM_CLASS_03_CD((String) v.get(CSV_COLNO_ITEM_CLASS_03_CD));
							} else {
								structCsv.seth_ITEM_CLASS_03_CD((String)null);
							}
                        	
							// ��58�i�ڕ���04�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_04_CD)
							{
								structCsv.seth_ITEM_CLASS_04_CD((String) v.get(CSV_COLNO_ITEM_CLASS_04_CD));
							} else {
								structCsv.seth_ITEM_CLASS_04_CD((String)null);
							}
                        	
							// ��59�i�ڕ���05�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_05_CD)
							{
								structCsv.seth_ITEM_CLASS_05_CD((String) v.get(CSV_COLNO_ITEM_CLASS_05_CD));
							} else {
								structCsv.seth_ITEM_CLASS_05_CD((String)null);
							}
                        	
							// ��60�i�ڕ���06�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_06_CD)
							{
								structCsv.seth_ITEM_CLASS_06_CD((String) v.get(CSV_COLNO_ITEM_CLASS_06_CD));
							} else {
								structCsv.seth_ITEM_CLASS_06_CD((String)null);
							}
                        	
							// ��61�i�ڕ���07�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_07_CD)
							{
								structCsv.seth_ITEM_CLASS_07_CD((String) v.get(CSV_COLNO_ITEM_CLASS_07_CD));
							} else {
								structCsv.seth_ITEM_CLASS_07_CD((String)null);
							}
                        	
							// ��62�i�ڕ���08�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_08_CD)
							{
								structCsv.seth_ITEM_CLASS_08_CD((String) v.get(CSV_COLNO_ITEM_CLASS_08_CD));
							} else {
								structCsv.seth_ITEM_CLASS_08_CD((String)null);
							}
                        	
							// ��63�i�ڕ���09�R�[�h
                        	if (intColNum > CSV_COLNO_ITEM_CLASS_09_CD)
							{
								structCsv.seth_ITEM_CLASS_09_CD((String) v.get(CSV_COLNO_ITEM_CLASS_09_CD));
							} else {
								structCsv.seth_ITEM_CLASS_09_CD((String)null);
							}
                        	
							// ��64�i�ڕ���10�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_10_CD)
							{
								structCsv.seth_ITEM_CLASS_10_CD((String) v.get(CSV_COLNO_ITEM_CLASS_10_CD));
							} else {
								structCsv.seth_ITEM_CLASS_10_CD((String)null);
							}
                        	
							// ��65�i�ڕ���11�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_11_CD)
							{
								structCsv.seth_ITEM_CLASS_11_CD((String) v.get(CSV_COLNO_ITEM_CLASS_11_CD));
							} else {
								structCsv.seth_ITEM_CLASS_11_CD((String)null);
							}
                        	
							// ��66�i�ڕ���12�R�[�h
							if (intColNum > CSV_COLNO_ITEM_CLASS_12_CD)
							{
								structCsv.seth_ITEM_CLASS_12_CD((String) v.get(CSV_COLNO_ITEM_CLASS_12_CD));
							} else {
								structCsv.seth_ITEM_CLASS_12_CD((String)null);
							}
                            // ���ڐ����K�v���ڐ�����OR�ȏ�̂Ƃ��͍��ڐ��ߕs���G���[��w_COLUMN_FLG�ɃJ���������Z�b�g����B
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
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
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
        int intWarningCount = 0;    // �`�F�b�N���[�j���O���R�[�h����
        int intWarningCtByData = 0; // ���v�p�`�F�b�N���[�j���O���R�[�h����
        int intCsvDataCount = 0;    // �Ώۃf�[�^����
        int ErrlineNo = 0;          // �G���[�s�ԍ�
// 2008/07/25 SYSCOM �镔 ORIGINAL START
//        String CsvCnt = "39";       // CSV����
// 2008/07/25 SYSCOM �镔 ORIGINAL END
//20150803 MOD START BY SYSCOM
// 2008/07/25 SYSCOM �镔 UPD START
        //String CsvCnt = "60";       // CSV����
// 2008/07/25 SYSCOM �镔 UPD END
    	String CsvCnt = "66";       // CSV����
//20150803 MOD END BY SYSCOM
        String ErrItem = "";        // �G���[����
        String ErrCd = "";          // �G���[�敪
        String ErrNo = "";          // �G���[�ԍ�
        String ErrMsg = "";         // �G���[���b�Z�[�W
        int strLength = 0;          // ������̒����擾
        boolean result = false;     // �`�F�b�N���ʊi�[

        // �����ꍀ�ڎ擾�Ή�
        //String locale = "ja";//
        String locale = CoreTools.getLocale(sysUSER_CD);
        String property = "OrteusUserDic";
        String tkey = "";   // �����ꎫ���擾�L�[
        boolean chkflg = false;         // �w��L�[�`�F�b�N�p
        boolean chkPkeyflg = false;     // �w��L�[�`�F�b�N�p2
        boolean chkHasErr = false;    // ���X�g���ɃG���[���邩�ǂ���
        String  range1 = "1";      // 0.0001 �` 99999999999999.9999
        String  range2 = "2";      // 0.0001 �` 99999999999999.9999

        try {
            AA0150010Struct structCsv;
            intCsvDataCount = listCsv.size();
            // �z�񐶐�
            String pKey1 [] = new String[intCsvDataCount];      // ��L�[1(�i��.�i�ڔԍ�)

            // CSV�t�@�C���̍s��LOOP
            for(int i = 0; i < intCsvDataCount; i++)
            {
                // �G���[�t���O������
                boolean bError = false;
                boolean bWarningCount = false; // �`�F�b�N���[�j���O���R�[�h�t���O������
                // CSV���̎擾
                structCsv = (AA0150010Struct)listCsv.get(i);
                // ���ڐ��s���G���[�`�F�b�N
                // ���폜���W�I�{�^�����I������Ȃ��Ƃ��`�F�b�N���s���B(���폜�ȊO��)��
                if(structCsv.getw_COLUMN_FLG() != null && ("").equals(structCsv.getw_COLUMN_FLG()) != true && ("true").equals(_save_struct.getrdoDelete()) != true)
                {
                    ErrlineNo = i + 1;                  // �G���[�����s(���ۂ̃G���[�s)
                    // ������L�[�Z�b�g
                    tkey = "Expj.Cmt3099"; // Expj.Cmt3099=���ډߕs��
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(tkey, resource);

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

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, structCsv.getw_COLUMN_FLG(),CSV_COLNO_99);
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    chkHasErr = true;
                    // �����ׂ֏������ڍs(�G���[�s�͔�΂��B)
                    continue;
                }
                ////////////////////////////////////////////////////////////////////////////////////
                // �ʃ`�F�b�N�����J�n
                ////////////////////////////////////////////////////////////////////////////////////

// ��1�i�ڔԍ� START==========================================================
                // �K�{�`�F�b�N �i�ڔԍ�
                if(structCsv.geth_ITEM_CD() == null || ("").equals(structCsv.geth_ITEM_CD()) == true)
                {
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                    // ������L�[�Z�b�g
                    tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(tkey, resource);

                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01505";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    chkHasErr = true;
                    // �����ׂ֏������ڍs
                    continue;
                }

                // ���͕⏕�@�\�`�F�b�N �i�ڔԍ�
                // ����25���ȏ�̏ꍇ�G���[
                strLength = StrLengthChk(structCsv.getOUT_ITEM_CD());
                if(strLength > 25)
                {
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                    // ������L�[�Z�b�g
                    tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(tkey, resource);

                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01501";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    chkHasErr = true;
                    // �����ׂ֏������ڍs
                    continue;
                }
                // �֑�����������̏ꍇ�G���[
                int iHankaku = chkHankaku(structCsv.geth_ITEM_CD());
                if(iHankaku != 0)
                {
                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                    // ������L�[�Z�b�g
                    tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // �����ꍀ�ڎ擾�Z�b�g
                    ErrItem = CoreTools.getRBString(tkey, resource);

                    ErrCd = "1";                                    // �G���[�敪
                    ErrNo = "AA01524";                              // �G���[�ԍ�
                    // ���b�Z�[�W�擾 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV�o��(�G���[)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // �G���[�t���O"true"�ɃZ�b�g
                    bError = true;
                    chkHasErr = true;
                    // �����ׂ֏������ڍs
                    continue;
                }
// ��1�i�ڔԍ� END============================================================

                // ���o�^���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���o�^���̂�)��
                if (("true").equals(_save_struct.getrdoInsert()) == true )
                {
// ��1�i�ڔԍ��}�X�^���݃`�F�b�N START========================================
                    if (chkflg == false)
                    {
                        // 1���[�v��
                        // �i�ڔԍ���z��ɃZ�b�g
                        pKey1[i] = structCsv.geth_ITEM_CD();    // �i�ڔԍ�
                        
                        // �`�F�b�N�t���O��true���Z�b�g
                        chkflg = true;
                    } else {
                        // 2���[�v�ڈȍ~
                        chkPkeyflg = true;
                        // �z��̍Ōォ��t�������ē����H��R�[�h�A�i�ڔԍ��A�i�ڕʍ�ƃR�[�h�����݂��Ȃ����`�F�b�N����B
                        for (int j = i - 1; j >= 0; j--)
                        {
                            if ((structCsv.geth_ITEM_CD()).equals(String.valueOf(pKey1[j])) == true )
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
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                        // �G���[�敪
                            ErrNo = "AA00051";                                  // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �i�ڔԍ���z��ɃZ�b�g
                        pKey1[i] = structCsv.geth_ITEM_CD();    // �i�ڔԍ�
                    }

                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    result = entity.mcheckM_ITEM.check(conn, struct);
                    if(result == true){
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00051";                              // �G���[�ԍ�
                        //ErrMsg = "����i�ڔԍ��͒ǉ��ł��܂���B";        // �G���[���b�Z�[�W
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

//                // �K�{�`�F�b�N �ۊǋ�R�[�h
//                if(structCsv.geth_WH_CD() == null || ("").equals(structCsv.geth_WH_CD()) == true)
//                {
//                    ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
//                    // ������L�[�Z�b�g
//                    tkey = "Expj.WH_CD"; // Expj.WH_CD=�ۊǋ�R�[�h
//                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
//                    // �����ꍀ�ڎ擾�Z�b�g
//                    ErrItem = CoreTools.getRBString(tkey, resource);
//
//                    ErrCd = "1";                                    // �G���[�敪
//                    ErrNo = "AA01506";                              // �G���[�ԍ�
//                    // ���b�Z�[�W�擾 
//                    ExpjMessage emsg = new ExpjMessage(ErrNo);
//                    ErrMsg = emsg.getMessage(locale);
//
//                    // CSV�o��(�G���[)
//                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_WH_CD );
//                    // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
//                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
//                    // �G���[�t���O"true"�ɃZ�b�g
//                    bError = true;
//                    chkHasErr = true;
//                    // �����ׂ֏������ڍs
//                    continue;
//                }

                if(structCsv.geth_WH_CD() != null && !("").equals(structCsv.geth_WH_CD())){
                    // ���͕⏕�@�\�`�F�b�N �ۊǋ�R�[�h
                    // ����25���ȏ�̏ꍇ�G���[
                    strLength = StrLengthChk(structCsv.geth_WH_CD());
                    if(strLength > 25)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.WH_CD"; // Expj.WH_CD=�ۊǋ�R�[�h
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01501";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_WH_CD );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                    // �֑�����������̏ꍇ�G���[
                    iHankaku = chkHankaku(structCsv.geth_WH_CD());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.WH_CD"; // Expj.WH_CD=�ۊǋ�R�[�h
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01524";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_WH_CD );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

                        // �o�^���ۊǋ�R�[�h�}�X�^�`�F�b�N
                        struct.setsetM_WH_WH_CD(structCsv.geth_WH_CD());
                        result = entity.mcheckM_WH.check(conn, struct);
                        if(result == false)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.WH_CD"; // Expj.WH_CD=�ۊǋ�R�[�h
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01009";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_WH_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �i�ڕʕۊǐ�D�揇�ʃ`�F�b�N
                        struct.setsetM_WH_ITEM_CD(structCsv.geth_ITEM_CD());
                        struct.setsetM_WH_WH_CD(structCsv.geth_WH_CD());
                        result = entity.mcheckM_WH_PRIORITY.check(conn, struct);
                        if(result == true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.WH_CD"; // Expj.WH_CD=�ۊǋ�R�[�h
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "ZZ01102";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_WH_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                }


// ��1�i�ڔԍ��}�X�^���݃`�F�b�N END==========================================
                }   //�o�^���`�F�b�N end if

                // ���X�V���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���X�V/�폜�̂�)��
                if (("true").equals(_save_struct.getrdoUpdate()) == true || ("true").equals(_save_struct.getrdoDelete()) == true )
                {
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    result = entity.mcheckM_ITEM.check(conn, struct);
                    if(result == false){
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01002";                              // �G���[�ԍ�
                        //ErrMsg = "�w�肵���i�ڔԍ��͖��o�^�ł��B";        // �G���[���b�Z�[�W
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                }

                // ���o�^OR�X�V���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���o�^OR�X�V��)��
                if (("true").equals(_save_struct.getrdoInsert()) == true || ("true").equals(_save_struct.getrdoUpdate()) == true )
                {

// ��2�i�ږ� START============================================================
                    // ���͕⏕�@�\�`�F�b�N �i�ږ�
                    if(structCsv.geth_ITEM_NAME() != null && ("").equals(structCsv.geth_ITEM_NAME()) != true)
                    {
                        // ����40���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_ITEM_NAME());
                        if(strLength > 40)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_NAME"; // Expj.ITEM_NAME=�i�ږ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            //ErrMsg = "�����ȓ��Őݒ肵�Ă��������B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_NAME );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }

// ��2�i�ږ� END==============================================================

// ��3�}�ʔԍ� START==========================================================
                    // ���͕⏕�@�\�`�F�b�N �}�ʔԍ�
                    if(structCsv.geth_DRAW_CD() != null && ("").equals(structCsv.geth_DRAW_CD()) != true)
                    {
                        // ����25���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_DRAW_CD());
                        if(strLength > 25)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.DRAW_CD"; // Expj.DRAW_CD=�}�ʔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DRAW_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // �֑�����������̏ꍇ�G���[
                        iHankaku = chkHankaku(structCsv.geth_DRAW_CD());
                        if(iHankaku != 0)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.DRAW_CD"; // Expj.DRAW_CD=�}�ʔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01524";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DRAW_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��3�}�ʔԍ� END============================================================

// ��4�K�i START==============================================================
                    // ���͕⏕�@�\�`�F�b�N �K�i
                    if(structCsv.geth_SPEC() != null && ("").equals(structCsv.geth_SPEC()) != true)
                    {
                        // ����80���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_SPEC());
                        if(strLength > 80)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.SPEC"; // Expj.SPEC=�K�i
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            //ErrMsg = "�����ȓ��Őݒ肵�Ă��������B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPEC );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // �֑�����������̏ꍇ�G���[
                        iHankaku = chkHankaku(structCsv.geth_SPEC());
                        if(iHankaku != 0)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.SPEC"; // Expj.SPEC=�K�i
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01524";                              // �G���[�ԍ�
                            //ErrMsg = "�����ȓ��Őݒ肵�Ă��������B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPEC );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��4�K�i END================================================================

// ��5���x���ԍ� START========================================================
                    // �o�^���̂݃��x���ԍ���"1":�Œ�ɂ���B
                    if (("true").equals(_save_struct.getrdoInsert()) == true)
                    {
                        // CSV�t�@�C�����x���ԍ������ݒ肾�����ꍇ�A�����l1���Z�b�g����B
                        structCsv.seth_HIGH_LEVEL_NO("1");
                    }
// ��5���x���ԍ� END==========================================================

// ��6�i�ڎ�z�敪 START======================================================
                    // ��ʃ`�F�b�N(����) �i�ڎ�z�敪
                    if(structCsv.geth_MRP_ODR_TYP() == null || ("").equals(structCsv.geth_MRP_ODR_TYP()) == true)
                    {
                        // CSV�t�@�C���i�ڎ�z�敪�����ݒ肾�����ꍇ�A�����l1:���Ԃ��Z�b�g����B
                        structCsv.seth_MRP_ODR_TYP("1");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_MRP_ODR_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �����`�F�b�N
                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_MRP_ODR_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            //ErrMsg = "�����ȓ��Őݒ肵�Ă��������B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��6�i�ڎ�z�敪 END========================================================

// ��7�i�ړ��O��敪 START====================================================
                    // ��ʃ`�F�b�N(����) �i�ړ��O��敪
                    if(structCsv.geth_OUTSIDE_TYP() == null || ("").equals(structCsv.geth_OUTSIDE_TYP()) == true)
                    {
                        // CSV�t�@�C���i�ړ��O��敪�����ݒ肾�����ꍇ�A�����l1:������Z�b�g����B
                        structCsv.seth_OUTSIDE_TYP("1");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_OUTSIDE_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.OUTSIDE_TYP_4"; // Expj.OUTSIDE_TYP_4=�i�ړ��O��敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            //ErrMsg = "������ݒ肵�Ă��������B";          // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OUTSIDE_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �����`�F�b�N
                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_OUTSIDE_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.OUTSIDE_TYP_4"; // Expj.OUTSIDE_TYP_4=�i�ړ��O��敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OUTSIDE_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��7�i�ړ��O��敪 END======================================================

// ��8�׎p�Ǘ��t���O START====================================================
                    // ��ʃ`�F�b�N(����) �׎p�Ǘ��t���O
                    if(structCsv.geth_STOCK_UNIT_FLG() == null || ("").equals(structCsv.geth_STOCK_UNIT_FLG()) == true)
                    {
                        // CSV�t�@�C���׎p�Ǘ��t���O�����ݒ肾�����ꍇ�A�����l0:�׎p�Ǘ����Ȃ����Z�b�g����B
                        structCsv.seth_STOCK_UNIT_FLG("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_STOCK_UNIT_FLG()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.STOCK_UNIT_FLG"; // Expj.STOCK_UNIT_FLG=�׎p�Ǘ��t���O
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT_FLG );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // �����`�F�b�N
                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_STOCK_UNIT_FLG());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.STOCK_UNIT_FLG"; // Expj.STOCK_UNIT_FLG=�׎p�Ǘ��t���O
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            //ErrMsg = "�����ȓ��Őݒ肵�Ă��������B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT_FLG );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��8�׎p�Ǘ��t���O END======================================================

// ��9�v�ʒP�� START=========================================================
                    // �K�{�`�F�b�N �v�ʒP��
					if(structCsv.geth_STOCK_UNIT()== null || ("").equals(structCsv.geth_STOCK_UNIT()) == true){
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.STOCK_UNIT"; // Expj.STOCK_UNIT=�v�ʒP��
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01525";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
					}
                    // ���͕⏕�@�\�`�F�b�N �v�ʒP��
                    if(structCsv.geth_STOCK_UNIT() != null && ("").equals(structCsv.geth_STOCK_UNIT()) != true)
                    {
                        // ����12���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_STOCK_UNIT());
                        if(strLength > 12)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.STOCK_UNIT"; // Expj.STOCK_UNIT=�v�ʒP��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // �֑�����������̏ꍇ�G���[
                        iHankaku = chkHankaku(structCsv.geth_STOCK_UNIT());
                        if(iHankaku != 0)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.STOCK_UNIT"; // Expj.STOCK_UNIT=�v�ʒP��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01524";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }

// ��9�v���P�� END===========================================================

// ��10�׎p�v�ʒP�� START=====================================================
                    // ���͕⏕�@�\�`�F�b�N �׎p�v�ʒP��
                    if(structCsv.geth_PKG_UNIT() != null && ("").equals(structCsv.geth_PKG_UNIT()) != true)
                    {
                        // ����12���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_PKG_UNIT());
                        if(strLength > 12)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PKG_UNIT"; // Expj.PKG_UNIT=�׎p�v�ʒP��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PKG_UNIT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // �֑�����������̏ꍇ�G���[
                        iHankaku = chkHankaku(structCsv.geth_PKG_UNIT());
                        if(iHankaku != 0)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PKG_UNIT"; // Expj.PKG_UNIT=�׎p�v�ʒP��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01524";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PKG_UNIT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��10�׎p�v�ʒP�� END=======================================================

// ��11�׎p�P�ʐ� START=======================================================
                    // ��ʃ`�F�b�N(���l) �׎p�P�ʐ�
                    if(structCsv.geth_PKG_UNIT_QTY() == null || ("").equals(structCsv.geth_PKG_UNIT_QTY()) == true)
                    {
                        // CSV�t�@�C���׎p�P�ʐ������ݒ肾�����ꍇ�A�����l1���Z�b�g����B
                        structCsv.seth_PKG_UNIT_QTY("1");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_PKG_UNIT_QTY()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PKG_UNIT_QTY"; // Expj.PKG_UNIT_QTY=�׎p�P�ʐ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            //ErrMsg = "���l���w�肵�Ă��������B";          // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PKG_UNIT_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_PKG_UNIT_QTY(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PKG_UNIT_QTY"; // Expj.PKG_UNIT_QTY=�׎p�P�ʐ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            //ErrMsg = "�����ȓ��Őݒ肵�Ă��������B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PKG_UNIT_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��11�׎p�P�ʐ� END=========================================================

// ��12�݌ɐ��P�ʋ敪 START===================================================
                    // ��ʃ`�F�b�N(����) �݌ɐ��ʒP�ʋ敪
                    if(structCsv.geth_UNIT_QTY_TYP() == null || ("").equals(structCsv.geth_UNIT_QTY_TYP()) == true)
                    {
                        // CSV�t�@�C���݌ɐ��ʒP�ʋ敪�����ݒ肾�����ꍇ�A�����l1:�����Ǘ����Z�b�g����B
                        structCsv.seth_UNIT_QTY_TYP("1");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_UNIT_QTY_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=�݌ɐ��P�ʋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_UNIT_QTY_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=�݌ɐ��P�ʋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��12�݌ɐ��P�ʋ敪 END=====================================================

// ��13�i�ڎ�z���[�h�^�C�� START=============================================
                    // ��ʃ`�F�b�N(����) �i�ڎ�z���[�h�^�C��
                    if(structCsv.geth_ODR_LT() == null || ("").equals(structCsv.geth_ODR_LT()) == true)
                    {
                        // CSV�t�@�C���i�ڎ�z���[�h�^�C�������ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_ODR_LT("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_ODR_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ODR_LT_1"; // Expj.ODR_LT_1=�i�ڎ�z���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ODR_LT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����6���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_ODR_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ODR_LT_1"; // Expj.ODR_LT_1=�i�ڎ�z���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ODR_LT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��13�i�ڎ�z���[�h�^�C�� END===============================================

// ��14�i�ڌŒ蕪���[�h�^�C�� START===========================================
                    // ��ʃ`�F�b�N(����) �i�ڌŒ蕪���[�h�^�C��
                    if(structCsv.geth_FIXED_LT() == null || ("").equals(structCsv.geth_FIXED_LT()) == true)
                    {
                        // CSV�t�@�C���i�ڌŒ蕪���[�h�^�C�������ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_FIXED_LT("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_FIXED_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.FIXED_LT"; // Expj.FIXED_LT=�Œ蕪���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_FIXED_LT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����6���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_FIXED_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.FIXED_LT"; // Expj.FIXED_LT=�Œ蕪���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_FIXED_LT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��14�i�ڌŒ蕪���[�h�^�C�� END=============================================

// ��15�i�ڔ�ᕪ���[�h�^�C�� START==========================================
                    // ��ʃ`�F�b�N(����) �i�ڔ�ᕪ���[�h�^�C��
                    if(structCsv.geth_PROP_LT() == null || ("").equals(structCsv.geth_PROP_LT()) == true)
                    {
                        // CSV�t�@�C���i�ڔ�ᕪ���[�h�^�C�������ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_PROP_LT("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_PROP_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PROP_LT_2"; // Expj.PROP_LT_2=�i�ڔ�ᕪ���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PROP_LT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����6���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_PROP_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PROP_LT_2"; // Expj.PROP_LT_2=�i�ڔ�ᕪ���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PROP_LT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��15�i�ڔ�ᕪ���[�h�^�C�� END============================================

// ��16���S���� START=========================================================
                    // ��ʃ`�F�b�N(����) ���S����
                    if(structCsv.geth_SAFETY_LT() == null || ("").equals(structCsv.geth_SAFETY_LT()) == true)
                    {
                        // CSV�t�@�C�����S���������ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_SAFETY_LT("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_SAFETY_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.SAFETY_LT"; // Expj.SAFETY_LT=���S����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SAFETY_LT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����6���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_SAFETY_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.SAFETY_LT"; // Expj.SAFETY_LT=���S����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SAFETY_LT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��16���S���� END===========================================================

// ��17���o���[�h�^�C�� START=================================================
                    // ��ʃ`�F�b�N(����) ���o���[�h�^�C��
                    if(structCsv.geth_ISSUE_LT() == null || ("").equals(structCsv.geth_ISSUE_LT()) == true)
                    {
                        // CSV�t�@�C�����o���[�h�^�C�������ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_ISSUE_LT("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_ISSUE_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ISSUE_LT"; // Expj.ISSUE_LT=���o���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ISSUE_LT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����6���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_ISSUE_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ISSUE_LT"; // Expj.ISSUE_LT=���o���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ISSUE_LT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��17���o���[�h�^�C�� END===================================================

// ��18�i�ڔ�ᕪ���b�g�T�C�Y START===========================================
                    // ��ʃ`�F�b�N(���l) �i�ڔ�ᕪ���b�g�T�C�Y
                    if(structCsv.geth_PROP_LOT_SIZE() == null || ("").equals(structCsv.geth_PROP_LOT_SIZE()) == true)
                    {
                        // CSV�t�@�C���i�ڔ�ᕪ���b�g�T�C�Y�����ݒ肾�����ꍇ�A�����l1.0���Z�b�g����B
                        structCsv.seth_PROP_LOT_SIZE("1.0");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_PROP_LOT_SIZE()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PROP_LOT_SIZE_2"; // Expj.PROP_LOT_SIZE_2=�i�ڔ�ᕪ���b�g�T�C�Y
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PROP_LOT_SIZE );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_PROP_LOT_SIZE(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PROP_LOT_SIZE_2"; // Expj.PROP_LOT_SIZE_2=�i�ڔ�ᕪ���b�g�T�C�Y
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PROP_LOT_SIZE );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��18�i�ڔ�ᕪ���b�g�T�C�Y END=============================================

// ��19�i�ڎd���� START=======================================================
                    // ��ʃ`�F�b�N(���l) �i�ڎd����
                    if(structCsv.geth_ITEM_SPOIL() == null || ("").equals(structCsv.geth_ITEM_SPOIL()) == true)
                    {
                        // CSV�t�@�C���i�ڎd���������ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_ITEM_SPOIL("0");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_ITEM_SPOIL()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_SPOIL"; // Expj.ITEM_SPOIL=�i�ڎd����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_SPOIL );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_ITEM_SPOIL(),range2,false))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_SPOIL"; // Expj.ITEM_SPOIL=�i�ڎd����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_SPOIL );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        
                        // �i�ڎ�z�敪���[���i�ڂł��邩�̃`�F�b�N
                        if (structCsv.geth_MRP_ODR_TYP().equals("8"))
                        {
                        	// CSV�t�@�C���i�ڎ�z�敪���[���i�ڂ������ꍇ�A�����l0���Z�b�g����B
                            structCsv.seth_ITEM_SPOIL("0");
                            
                            ErrlineNo = i + 1;                                      // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_SPOIL"; // Expj.PROP_LT_2=�i�ڔ�ᕪ���[�h�^�C��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            if(("true").equals(_save_struct.getDO_CHK())){
                            	// �`�F�b�N�̂ݍs���ꍇ�A���[�j���O
                                ErrNo = "AA01527";                                      // �G���[�ԍ�
                            }else{
                            	// �o�^/�X�V����ꍇ�A���[�j���O
                                ErrNo = "AA01526";                                      // �G���[�ԍ�
                            }
                            // �G���[�敪:���[�j���O
                            ErrCd = "2";                                            // �G���[�敪(���[�j���O�ōX�V)
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SAFETY_STOCK  );
                            
                            intWarningCount++;
                            if(!bWarningCount){
                            	intWarningCtByData ++;
                            }
                            bError = true;
                        }
                    }
// ��19�i�ڎd���� END=========================================================

// ��20���S�݌ɗ� START=======================================================
                    // ��ʃ`�F�b�N(���l) ���S�݌ɗ�
                    if(structCsv.geth_SAFETY_STOCK() == null || ("").equals(structCsv.geth_SAFETY_STOCK()) == true)
                    {
                        // CSV�t�@�C�����S�݌ɗʂ����ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_SAFETY_STOCK("0");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_SAFETY_STOCK()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.SAFETY_STOCK"; // Expj.SAFETY_STOCK=���S�݌ɗ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SAFETY_STOCK );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_SAFETY_STOCK(),range1,false))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.SAFETY_STOCK"; // Expj.SAFETY_STOCK=���S�݌ɗ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SAFETY_STOCK );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��20���S�݌ɗ� END=========================================================

// ��21���b�g�܂Ƃߋ敪 START=================================================
                    // ��ʃ`�F�b�N(����) ���b�g�܂Ƃߋ敪
                    if(structCsv.geth_LOT_SIZING_TYP() == null || ("").equals(structCsv.geth_LOT_SIZING_TYP()) == true)
                    {
                        // CSV�t�@�C�����b�g�܂Ƃߋ敪�����ݒ肾�����ꍇ�A�����l1:�ő�܂Ƃߊ��Ԃ��Z�b�g����B
                        structCsv.seth_LOT_SIZING_TYP("1");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_LOT_SIZING_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.LOT_SIZING_TYP"; // Expj.LOT_SIZING_TYP=���b�g�܂Ƃߋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_SIZING_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_LOT_SIZING_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.LOT_SIZING_TYP"; // Expj.LOT_SIZING_TYP=���b�g�܂Ƃߋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_SIZING_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��21���b�g�܂Ƃߋ敪 END===================================================

// ��22�ő�܂Ƃߊ��� START===================================================
                    // ��ʃ`�F�b�N(����) �ő�܂Ƃߊ���
                    if(structCsv.geth_MAX_PERIOD() == null || ("").equals(structCsv.geth_MAX_PERIOD()) == true)
                    {
                        // CSV�t�@�C���ő�܂Ƃߊ��Ԃ����ݒ肾�����ꍇ�A�����l1���Z�b�g����B
                        structCsv.seth_MAX_PERIOD("1");
                    } else {
                    	// 0���܂܂�
                        if(Calculate.compare(structCsv.geth_MAX_PERIOD(), "0") == 0) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MAX_PERIOD"; // Expj.MAX_PERIOD=�ő�܂Ƃߊ���
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt, CSV_COLNO_MAX_PERIOD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        
                        // �����`�F�b�N
                        if("0".equals(structCsv.geth_MAX_PERIOD()) || Calculate.isInteger(structCsv.geth_MAX_PERIOD()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MAX_PERIOD"; // Expj.MAX_PERIOD=�ő�܂Ƃߊ���
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MAX_PERIOD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����6���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_MAX_PERIOD());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MAX_PERIOD"; // Expj.MAX_PERIOD=�ő�܂Ƃߊ���
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            //ErrMsg = "�����ȓ��Őݒ肵�Ă��������B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MAX_PERIOD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��22�ő�܂Ƃߊ��� END=====================================================

// ��23�ő��z�� START=======================================================
                    // ��ʃ`�F�b�N(���l) �ő��z����
                    if(structCsv.geth_MAX_ODR_QTY() == null || ("").equals(structCsv.geth_MAX_ODR_QTY()) == true)
                    {
                        // CSV�t�@�C���ő��z���ʂ����ݒ肾�����ꍇ�A�����l99999999999.0���Z�b�g����B
                        structCsv.seth_MAX_ODR_QTY("99999999999.0");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_MAX_ODR_QTY()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MAX_ODR_QTY"; // Expj.MAX_ODR_QTY=�ő��z��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MAX_ODR_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_MAX_ODR_QTY(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MAX_ODR_QTY"; // Expj.MAX_ODR_QTY=�ő��z��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            //ErrMsg = "�����ȓ��Őݒ肵�Ă��������B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MAX_ODR_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��23�ő��z�� END=========================================================

// ��24�����_�݌ɐ� START=====================================================
                    // ��ʃ`�F�b�N(���l) �����_�݌ɐ�
                    if(structCsv.geth_ODR_POINT() == null || ("").equals(structCsv.geth_ODR_POINT()) == true)
                    {
                        // CSV�t�@�C�������_�݌ɐ������ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_ODR_POINT("0");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_ODR_POINT()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ODR_POINT"; // Expj.ODR_POINT=�����_�݌ɐ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            //ErrMsg = "���l���w�肵�Ă��������B";          // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ODR_POINT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_ODR_POINT(),range1,false))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ODR_POINT"; // Expj.ODR_POINT=�����_�݌ɐ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ODR_POINT );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��24�����_�݌ɐ� END=======================================================

// ��25��ʔ����� START=======================================================
                    // ��ʃ`�F�b�N(���l) ��ʔ�������
                    if(structCsv.geth_FIXED_ODR_QTY() == null || ("").equals(structCsv.geth_FIXED_ODR_QTY()) == true)
                    {
                        // �i�ڎ�z�敪�� 6:��ʎ�z�i�ڂ܂��� 7:�����_��z�i�ڈȊO ����
                    	// CSV�t�@�C����ʔ������ʂ����ݒ肾�����ꍇ�A�����l0.0���Z�b�g����B
                    	if(!"6".equals(structCsv.geth_MRP_ODR_TYP()) && !"7".equals(structCsv.geth_MRP_ODR_TYP())) {
                    		structCsv.seth_FIXED_ODR_QTY("0.0");
                        } else {// �i�ڎ�z�敪�� 6:��ʎ�z�i�ڂ܂��� 7:�����_��z�i�ڏꍇ�A�G���[���o��
                        	ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.FIXED_ODR_QTY"; // Expj.FIXED_ODR_QTY=��ʔ�����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00200";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_FIXED_ODR_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        
                    } else {
                        if(IsNumChk(structCsv.geth_FIXED_ODR_QTY()) != true)
                        {
                            // ���l�`�F�b�N
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.FIXED_ODR_QTY"; // Expj.FIXED_ODR_QTY=��ʔ�����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_FIXED_ODR_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // �u�i�ڎ�z�敪�v��6,7�ȊO�̏ꍇ��0��������Ă��܂�
                        boolean bZeroFlg = false;
                        if("6".equals(structCsv.geth_MRP_ODR_TYP()) || "7".equals(structCsv.geth_MRP_ODR_TYP())) {
                        	bZeroFlg = true;
                        } 
                        	
                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_FIXED_ODR_QTY(),range1,bZeroFlg))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.FIXED_ODR_QTY"; // Expj.FIXED_ODR_QTY=��ʔ�����
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_FIXED_ODR_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��25��ʔ����� END=========================================================

// ��26�ŏ���z�� START=======================================================
                    // ��ʃ`�F�b�N(���l) �ŏ���z����
                    if(structCsv.geth_MIN_ODR_QTY() == null || ("").equals(structCsv.geth_MIN_ODR_QTY()) == true)
                    {
                        // CSV�t�@�C���ŏ���z���ʂ����ݒ肾�����ꍇ�A�����l0���Z�b�g����B
                        structCsv.seth_MIN_ODR_QTY("0");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_MIN_ODR_QTY()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MIN_ODR_QTY"; // Expj.MIN_ODR_QTY=�ŏ���z��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MIN_ODR_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_MIN_ODR_QTY(),range1,false))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MIN_ODR_QTY"; // Expj.MIN_ODR_QTY=�ŏ���z��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MIN_ODR_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��26�ŏ���z�� END=========================================================

// ��27�܂�ߒP�� START=======================================================
                    // ��ʃ`�F�b�N(���l) �܂�ߒP��
                    if(structCsv.geth_MUL_ODR_QTY() == null || ("").equals(structCsv.geth_MUL_ODR_QTY()) == true)
                    {
                        // CSV�t�@�C���܂�ߒP�ʂ����ݒ肾�����ꍇ�A�����l1���Z�b�g����B
                        structCsv.seth_MUL_ODR_QTY("1");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_MUL_ODR_QTY()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MUL_ODR_QTY"; // Expj.MUL_ODR_QTY=�܂�ߒP��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MUL_ODR_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_MUL_ODR_QTY(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MUL_ODR_QTY"; // Expj.MUL_ODR_QTY=�܂�ߒP��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            //ErrMsg = "�����ȓ��Őݒ肵�Ă��������B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MUL_ODR_QTY );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��27�܂�ߒP�� END=========================================================

// ��28�o�ɋ敪 START=========================================================
                    // ��ʃ`�F�b�N(����) �o�ɋ敪
                    if(structCsv.geth_ISSUE_TYP() == null || ("").equals(structCsv.geth_ISSUE_TYP()) == true)
                    {
                        // CSV�t�@�C���o�ɋ敪�����ݒ肾�����ꍇ�A�����l1:�}�j���A���o�ɂ��Z�b�g����B
                        structCsv.seth_ISSUE_TYP("1");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_ISSUE_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ISSUE_TYP"; // Expj.ISSUE_TYP=�o�ɋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            //ErrMsg = "������ݒ肵�Ă��������B";          // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ISSUE_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_ISSUE_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ISSUE_TYP"; // Expj.ISSUE_TYP=�o�ɋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ISSUE_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��28�o�ɋ敪 END===========================================================

// ��29MPS�i�ڃt���O START====================================================
                    // ��ʃ`�F�b�N(����) MPS�i�ڃt���O
                    if(structCsv.geth_MPS_FLG() == null || ("").equals(structCsv.geth_MPS_FLG()) == true)
                    {
                        // CSV�t�@�C��MPS�i�ڃt���O�����ݒ肾�����ꍇ�A�����l0:MPS�i�ڂł͂Ȃ����Z�b�g����B
                        structCsv.seth_MPS_FLG("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_MPS_FLG()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MPS_FLG"; // Expj.MPS_FLG=MPS�i�ڃt���O
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            //ErrMsg = "������ݒ肵�Ă��������B";          // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MPS_FLG );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_MPS_FLG());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MPS_FLG"; // Expj.MPS_FLG=MPS�i�ڃt���O
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MPS_FLG );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��29MPS�i�ڃt���O END======================================================

// ��30��������敪 START=====================================================
                    // ��ʃ`�F�b�N(����) ��������敪
                    if(structCsv.geth_ACPT_INSPC_TYP() == null || ("").equals(structCsv.geth_ACPT_INSPC_TYP()) == true)
                    {
                        // CSV�t�@�C����������敪�����ݒ肾�����ꍇ�A�����l1:�����݂̂ł͂Ȃ����Z�b�g����B
                        structCsv.seth_ACPT_INSPC_TYP("1");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_ACPT_INSPC_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ACPT_INSPC_TYP"; // Expj.ACPT_INSPC_TYP=��������敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ACPT_INSPC_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_ACPT_INSPC_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ACPT_INSPC_TYP"; // Expj.ACPT_INSPC_TYP=��������敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ACPT_INSPC_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��30��������敪 END=======================================================

// ��31���i�敪 START=========================================================
                    // ��ʃ`�F�b�N(����) ���i�敪
                    if(structCsv.geth_PRODUCT_TYP() == null || ("").equals(structCsv.geth_PRODUCT_TYP()) == true)
                    {
                        // CSV�t�@�C�����i�敪�����ݒ肾�����ꍇ�A�����l1:���i�ł͂Ȃ����Z�b�g����B
                        structCsv.seth_PRODUCT_TYP("1");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_PRODUCT_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PRODUCT_TYP"; // Expj.PRODUCT_TYP=���i�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PRODUCT_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_PRODUCT_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PRODUCT_TYP"; // Expj.PRODUCT_TYP=���i�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            //ErrMsg = "�����ȓ��Őݒ肵�Ă��������B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PRODUCT_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��31���i�敪 END===========================================================

// ��32�Ǘ��R�[�h START=======================================================
                    // ���͕⏕�@�\�`�F�b�N �Ǘ��R�[�h
                    if(structCsv.geth_CLASIFICATION_CD() != null && ("").equals(structCsv.geth_CLASIFICATION_CD()) != true)
                    {
                        // ����25���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_CLASIFICATION_CD());
                        if(strLength > 25)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.CLASIFICATION_CD"; // Expj.CLASIFICATION_CD=�Ǘ��R�[�h
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CLASIFICATION_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��32�Ǘ��R�[�h END=========================================================

// ��33�P�ʏd�� START=========================================================
                    // ��ʃ`�F�b�N(���l) �P�ʏd��
                    if(structCsv.geth_UNIT_WEIGHT() == null || ("").equals(structCsv.geth_UNIT_WEIGHT()) == true)
                    {
                        // CSV�t�@�C���P�ʏd�ʂ����ݒ肾�����ꍇ�A�����l0.0���Z�b�g����B
                        structCsv.seth_UNIT_WEIGHT("0.0");
                    } else {
                        // ���l�`�F�b�N
                        if(IsNumChk(structCsv.geth_UNIT_WEIGHT()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.UNIT_WEIGHT"; // Expj.UNIT_WEIGHT=�P�ʏd��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01503";                              // �G���[�ԍ�
                            //ErrMsg = "���l���w�肵�Ă��������B";          // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_WEIGHT  );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // 99999999999999.9999 �` 0.0001�͈̔̓`�F�b�N
                        if (isNotInNumRange(structCsv.geth_UNIT_WEIGHT(),range1,false))
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.UNIT_WEIGHT"; // Expj.UNIT_WEIGHT=�P�ʏd��
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_WEIGHT  );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��33�P�ʏd�� END===========================================================

// ��34�I���敪 START=========================================================
                    // ��ʃ`�F�b�N(����) �I���敪
                    if(structCsv.geth_ABC_TYP() == null || ("").equals(structCsv.geth_ABC_TYP()) == true)
                    {
                        // CSV�t�@�C���I���敪�����ݒ肾�����ꍇ�A�����l1:�I���Ώ��i���Z�b�g����B
                        structCsv.seth_ABC_TYP("1");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_ABC_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ABC_TYP"; // Expj.ABC_TYP=�I���敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ABC_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_ABC_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ABC_TYP"; // Expj.ABC_TYP=�I���敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ABC_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��34�I���敪 END===========================================================

// ��35��Ǝ��ы敪 START=====================================================
                    // ��ʃ`�F�b�N(����) ��Ǝ��ы敪
                    if(structCsv.geth_OPR_RSLT_TYP() == null || ("").equals(structCsv.geth_OPR_RSLT_TYP()) == true)
                    {
                        // CSV�t�@�C���I���敪�����ݒ肾�����ꍇ�A�����l2:��Ǝw�����т��Z�b�g����B
                        structCsv.seth_OPR_RSLT_TYP("2");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_OPR_RSLT_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.OPR_RSLT_TYP"; // Expj.OPR_RSLT_TYP=��Ǝ��ы敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            //ErrMsg = "������ݒ肵�Ă��������B";          // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OPR_RSLT_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_OPR_RSLT_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.OPR_RSLT_TYP"; // Expj.OPR_RSLT_TYP=��Ǝ��ы敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OPR_RSLT_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��35��Ǝ��ы敪 END=======================================================

// ��36�󋋕i�敪 START=======================================================
                    // ��ʃ`�F�b�N(����) �󋋕i�敪
                    if(structCsv.geth_SPL_ITEM_TYP() == null || ("").equals(structCsv.geth_SPL_ITEM_TYP()) == true)
                    {
                        // CSV�t�@�C���󋋕i�敪�����ݒ肾�����ꍇ�A�����l0:�󋋕i�ł͂Ȃ����Z�b�g����B
                        structCsv.seth_SPL_ITEM_TYP("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_SPL_ITEM_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.SPL_ITEM_TYP"; // Expj.SPL_ITEM_TYP=�󋋕i�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPL_ITEM_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����2���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_SPL_ITEM_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.SPL_ITEM_TYP"; // Expj.SPL_ITEM_TYP=�󋋕i�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPL_ITEM_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
                    
                     // ���O��敪��1:����@���@�󋋕i�敪��2:�����󋋂̏ꍇ
                    if("1".equals(structCsv.geth_OUTSIDE_TYP()) && "2".equals(structCsv.geth_SPL_ITEM_TYP())) {
                    	 ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                         // ������L�[�Z�b�g
                         tkey = "Expj.SPL_ITEM_TYP"; // Expj.SPL_ITEM_TYP=�󋋕i�敪
                         ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                         // �����ꍀ�ڎ擾�Z�b�g
                         ErrItem = CoreTools.getRBString(tkey, resource);

                         ErrCd = "2";                                    // �G���[�敪
                         ErrNo = "AA00216";                              // �G���[�ԍ�
                         // ���b�Z�[�W�擾 
                         ExpjMessage emsg = new ExpjMessage(ErrNo);
                         ErrMsg = emsg.getMessage(locale);

                         // CSV�o��(�G���[)
                         csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPL_ITEM_TYP );
                         // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                         structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                         intWarningCount ++;
                         intWarningCtByData ++;
                         // �`�F�b�N���[�j���O���R�[�h�t���O"true"�ɃZ�b�g
                         bWarningCount = true;
                         // �G���[�t���O"true"�ɃZ�b�g/
                         bError = true;
                    }
// ��36�󋋕i�敪 END=========================================================

// ��37����ŃR�[�h START=====================================================
                    // ���͕⏕�@�\�`�F�b�N ����ŃR�[�h
                    if(structCsv.geth_TAX_CD() != null && ("").equals(structCsv.geth_TAX_CD()) != true)
                    {
                        // ����3���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_TAX_CD());
                        if(strLength > 3)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.TAX_CD_1"; // Expj.TAX_CD_1=����ŃR�[�h
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_TAX_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // �֑�����������̏ꍇ�G���[
                        iHankaku = chkHankaku(structCsv.geth_TAX_CD());
                        if(iHankaku != 0)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.TAX_CD_1"; // Expj.TAX_CD_1=����ŃR�[�h
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01524";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_TAX_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��37����ŃR�[�h END=======================================================

// ��38�J�����_�ԍ� START=====================================================
                    // ���͕⏕�@�\�`�F�b�N �J�����_�ԍ�
                    if(structCsv.geth_CAL_NO() != null && ("").equals(structCsv.geth_CAL_NO()) != true)
                    {
                        // ��ʃ`�F�b�N(����) �J�����_�ԍ�
                        if(Calculate.isInteger(structCsv.geth_CAL_NO()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.CAL_NO"; // Expj.CAL_NO=�J�����_�ԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);
    
                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);
    
                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CAL_NO );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ����3���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_CAL_NO());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.CAL_NO"; // Expj.CAL_NO=�J�����_�ԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CAL_NO );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��38�J�����_�ԍ� END=======================================================

// 2008/07/25 SYSCOM �镔 ADD START
// ��40�H���Ǘ��i�ڋ敪 START=====================================================
                    // ��ʃ`�F�b�N(����) �H���Ǘ��i�ڋ敪
                    if(structCsv.geth_MANHOUR_TYP() == null || ("").equals(structCsv.geth_MANHOUR_TYP()) == true)
                    {
                        // CSV�t�@�C���H���Ǘ��i�ڋ敪�����ݒ肾�����ꍇ�A�����l0:�ʏ�i�ڂ��Z�b�g����B
                        structCsv.seth_MANHOUR_TYP("0");
                    } else {
                        // �����`�F�b�N
                        if(Calculate.isInteger(structCsv.geth_MANHOUR_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=�H���Ǘ��i�ڋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01502";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

                        // ����3���ȏ�̏ꍇ�G���[
                        strLength = StrLengthChk(structCsv.geth_MANHOUR_TYP());
                        if(strLength > 3)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=�H���Ǘ��i�ڋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01501";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��40�H���Ǘ��i�ڋ敪 END=======================================================
// 2008/07/25 SYSCOM �镔 ADD END
// ��39�ۊǋ敪 START=====================================================
					// ���͕⏕�@�\�`�F�b�N �ۊǋ敪
					if(structCsv.geth_DEPO_TYP() == null || ("").equals(structCsv.geth_DEPO_TYP()) == true)
					{
						// CSV�t�@�C���ۊǋ敪�����ݒ肾�����ꍇ�A�����l1�F�퉷���Z�b�g����B
						structCsv.seth_DEPO_TYP("1");
					}else{
						
						// ��ʃ`�F�b�N(����) �ۊǋ敪
						if(Calculate.isInteger(structCsv.geth_DEPO_TYP()) != true)
						{
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4091"; // Expj.Cmt4091=�ۊǋ敪
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);
	
							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01502";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);
	
							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DEPO_TYP );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						// ����3���ȏ�̏ꍇ�G���[
						strLength = StrLengthChk(structCsv.geth_DEPO_TYP());
						if(strLength > 2)
						{
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4091"; // Expj.Cmt4091=�ۊǋ敪
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01501";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DEPO_TYP );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
// ��39�ۊǋ敪 END=======================================================
					
// ��40���b�g�Ǘ��t���O START=====================================================
					// ���͕⏕�@�\�`�F�b�N ���b�g�Ǘ��t���O
					if(structCsv.geth_LOT_CTRL_FLG() == null || ("").equals(structCsv.geth_LOT_CTRL_FLG()) == true)
					{
						// CSV�t�@�C�����b�g�Ǘ��t���O �����ݒ肾�����ꍇ�A�����l0�F���b�g�Ǘ����s��Ȃ����Z�b�g����B
						structCsv.seth_LOT_CTRL_FLG("0");
					}else{
						
						// ��ʃ`�F�b�N(����) ���b�g�Ǘ��t���O
						if(Calculate.isInteger(structCsv.geth_LOT_CTRL_FLG()) != true)
						{
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.LOT_CTRL_FLG"; // Expj.LOT_CTRL_FLG=���b�g�Ǘ��t���O
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);
	
							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01502";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);
	
							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_CTRL_FLG );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						// ����2���ȏ�̏ꍇ�G���[
						strLength = StrLengthChk(structCsv.geth_LOT_CTRL_FLG());
						if(strLength > 1)
						{
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.LOT_CTRL_FLG"; // Expj.LOT_CTRL_FLG=���b�g�Ǘ��t���O
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01501";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_CTRL_FLG );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
// ��40���b�g�Ǘ��t���O END=======================================================			

					
// ��41���b�g�̔ԋ敪 START=====================================================
					// ���͕⏕�@�\�`�F�b�N ���b�g�̔ԋ敪
					if(structCsv.geth_LOT_NUMBERING_TYP() == null || ("").equals(structCsv.geth_LOT_NUMBERING_TYP()) == true)
					{
						// CSV�t�@�C�����b�g�̔ԋ敪 �����ݒ肾�����ꍇ�A�����l1�F�����̔Ԃ��Z�b�g����B
						structCsv.seth_LOT_NUMBERING_TYP("1");
						
					}else{
						// ��ʃ`�F�b�N(����) ���b�g�̔ԋ敪
						if(Calculate.isInteger(structCsv.geth_LOT_NUMBERING_TYP()) != true)
						{
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4092"; // Expj.Cmt4092=���b�g�̔ԋ敪
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);
	
							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01502";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);
	
							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_NUMBERING_TYP );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						// ����3���ȏ�̏ꍇ�G���[
						strLength = StrLengthChk(structCsv.geth_LOT_NUMBERING_TYP());
						if(strLength > 2)
						{
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4092"; // Expj.Cmt4092=���b�g�̔ԋ敪
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01501";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_NUMBERING_TYP );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
// ��41���b�g�̔ԋ敪 END=======================================================			

					
					
					
//  ��42�i�������N�� START=====================================================
					// ���͕⏕�@�\�`�F�b�N �i�������N��
					if(structCsv.geth_BEST_BEFORE_YEAR() == null || ("").equals(structCsv.geth_BEST_BEFORE_YEAR()) == true)
					{
						// CSV�t�@�C���i�������N�� �����ݒ肾�����ꍇ�A�����l0���Z�b�g����B
						structCsv.seth_BEST_BEFORE_YEAR("0");
						
					}else{
						// ��ʃ`�F�b�N(����) �i�������N��
						if(Calculate.isInteger(structCsv.geth_BEST_BEFORE_YEAR()) != true)
						{
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt5070"; // Expj.Cmt5070=�i�������N��
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);
	
							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01502";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);
	
							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_YEAR );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						// ����5���ȏ�̏ꍇ�G���[
						strLength = StrLengthChk(structCsv.geth_BEST_BEFORE_YEAR());
						if(strLength > 4)
						{
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt5070"; // Expj.Cmt5070=�i�������N��
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01501";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_YEAR );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
// ��42�i�������N�� END=======================================================					
					

// ��43�i���������� START=====================================================
					// ���͕⏕�@�\�`�F�b�N �i����������
					if(structCsv.geth_BEST_BEFORE_MONTH() == null || ("").equals(structCsv.geth_BEST_BEFORE_MONTH()) == true)
					{
						// CSV�t�@�C���i���������� �����ݒ肾�����ꍇ�A�����l0���Z�b�g����B
						structCsv.seth_BEST_BEFORE_MONTH("0");
						
					}else{
						// ��ʃ`�F�b�N(����) �i����������
						if(Calculate.isInteger(structCsv.geth_BEST_BEFORE_MONTH()) != true)
						{
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt5071"; // Expj.Cmt5071=�i����������
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);
	
							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01502";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);
	
							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_MONTH );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						// ����5���ȏ�̏ꍇ�G���[
						strLength = StrLengthChk(structCsv.geth_BEST_BEFORE_MONTH());
						if(strLength > 4)
						{
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt5071"; // Expj.Cmt5071=�i����������
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01501";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_MONTH );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}

// ��43�i���������� END=======================================================						
					

// ��44�i���������� START=====================================================
				// ���͕⏕�@�\�`�F�b�N �i����������
				if(structCsv.geth_BEST_BEFORE_DAY() == null || ("").equals(structCsv.geth_BEST_BEFORE_DAY()) == true)
				{
					// CSV�t�@�C���i���������� �����ݒ肾�����ꍇ�A�����l0���Z�b�g����B
					structCsv.seth_BEST_BEFORE_DAY("0");
					
				}else{
					// ��ʃ`�F�b�N(����) �i����������
					if(Calculate.isInteger(structCsv.geth_BEST_BEFORE_DAY()) != true)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt5072"; // Expj.Cmt5072=�i����������
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01502";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_DAY );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// ����5���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_BEST_BEFORE_DAY());
					if(strLength > 4)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt5072"; // Expj.Cmt5072=�i����������
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_DAY );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��44�i���������� END=======================================================						
					
//20150803 ADD START BY SYSCOM
// ��45���S����R�[�h START =================================================
				// ���͕⏕�@�\�`�F�b�N ���S����R�[�h
				if(structCsv.geth_DEPT_CD() == null || ("").equals(structCsv.geth_DEPT_CD()) == true)
				{
					// CSV�t�@�C�����S����R�[�h�����ݒ肾�����ꍇ�A�����l���Z�b�g����B
					structCsv.seth_DEPT_CD("");
					
				}else{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_DEPT_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.DEPT_CD"; // Expj.DEPT_CD=���S����R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DEPT_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
                    iHankaku = chkHankaku(structCsv.geth_DEPT_CD());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.DEPT_CD"; // Expj.DEPT_CD=���S����R�[�h
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01524";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DEPT_CD );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

				}
// ��45���S����R�[�h END=======================================================

// ��46�v���W�F�N�g�R�[�h START=======================================================
				// ���͕⏕�@�\�`�F�b�N �v���W�F�N�g�R�[�h
				if(structCsv.geth_PJ_CD() == null || ("").equals(structCsv.geth_PJ_CD()) == true)
				{
					// CSV�t�@�C���v���W�F�N�g�R�[�h�����ݒ肾�����ꍇ�A�����l���Z�b�g����B
					structCsv.seth_PJ_CD("");
					
				}else{
					// ����16���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_PJ_CD());
					if(strLength > 15)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.PJ_CD"; // Expj.PJ_CD=�v���W�F�N�g�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PJ_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
                    iHankaku = chkHankaku(structCsv.geth_PJ_CD());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.PJ_CD"; // Expj.PJ_CD=�v���W�F�N�g�R�[�h
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01524";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PJ_CD );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

				}
// ��46�v���W�F�N�g�R�[�h END=======================================================
                	
// ��47�Z�O�����g1 START=======================================================
				// ���͕⏕�@�\�`�F�b�N �Z�O�����g1
				if(structCsv.geth_SEG_CONTENTS_1() == null || ("").equals(structCsv.geth_SEG_CONTENTS_1()) == true)
				{
					// CSV�t�@�C���Z�O�����g1�����ݒ肾�����ꍇ�A�����l���Z�b�g����B
					structCsv.seth_SEG_CONTENTS_1("");
					
				}else{
					// ����51���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_SEG_CONTENTS_1());
					if(strLength > 50)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.SEG_CONTENTS1"; // Expj.SEG_CONTENTS_1=�Z�O�����g1
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_1 );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
                    iHankaku = chkHankaku(structCsv.geth_SEG_CONTENTS_1());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.SEG_CONTENTS1"; // Expj.SEG_CONTENTS_1=�Z�O�����g1
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01524";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_1 );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

				}
// ��47�Z�O�����g1 END=======================================================

// ��48�Z�O�����g2 START=======================================================
				// ���͕⏕�@�\�`�F�b�N �Z�O�����g2
				if(structCsv.geth_SEG_CONTENTS_2() == null || ("").equals(structCsv.geth_SEG_CONTENTS_2()) == true)
				{
					// CSV�t�@�C���Z�O�����g2�����ݒ肾�����ꍇ�A�����l���Z�b�g����B
					structCsv.seth_SEG_CONTENTS_2("");
					
				}else{
					// ����51���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_SEG_CONTENTS_2());
					if(strLength > 50)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.SEG_CONTENTS2"; // Expj.SEG_CONTENTS_2=�Z�O�����g2
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_2 );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
                    iHankaku = chkHankaku(structCsv.geth_SEG_CONTENTS_2());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.SEG_CONTENTS2"; // Expj.SEG_CONTENTS_2=�Z�O�����g2
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01524";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_2 );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

				}
// ��48�Z�O�����g2 END=======================================================

// ��49�Z�O�����g3 START=======================================================
				// ���͕⏕�@�\�`�F�b�N �Z�O�����g3
				if(structCsv.geth_SEG_CONTENTS_3() == null || ("").equals(structCsv.geth_SEG_CONTENTS_3()) == true)
				{
					// CSV�t�@�C���Z�O�����g3�����ݒ肾�����ꍇ�A�����l���Z�b�g����B
					structCsv.seth_SEG_CONTENTS_3("");
					
				}else{
					// ����51���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_SEG_CONTENTS_3());
					if(strLength > 50)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.SEG_CONTENTS3"; // Expj.SEG_CONTENTS_3=�Z�O�����g3
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_3 );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
                    iHankaku = chkHankaku(structCsv.geth_SEG_CONTENTS_3());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.SEG_CONTENTS3"; // Expj.SEG_CONTENTS_3=�Z�O�����g3
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01524";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_3 );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

				}
// ��49�Z�O�����g3 END=======================================================

// ��50�Z�O�����g4 START=======================================================
				// ���͕⏕�@�\�`�F�b�N �Z�O�����g4
				if(structCsv.geth_SEG_CONTENTS_4() == null || ("").equals(structCsv.geth_SEG_CONTENTS_4()) == true)
				{
					// CSV�t�@�C���Z�O�����g4�����ݒ肾�����ꍇ�A�����l���Z�b�g����B
					structCsv.seth_SEG_CONTENTS_4("");
					
				}else{
					// ����51���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_SEG_CONTENTS_4());
					if(strLength > 50)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.SEG_CONTENTS4"; // Expj.SEG_CONTENTS_4=�Z�O�����g4
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_4 );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
                    iHankaku = chkHankaku(structCsv.geth_SEG_CONTENTS_4());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.SEG_CONTENTS4"; // Expj.SEG_CONTENTS_4=�Z�O�����g4
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01524";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_4 );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

				}
// ��50�Z�O�����g4 END=======================================================
//20150803 ADD END BY SYSCOM

// ��51���l1 START=====================================================
				// ���͕⏕�@�\�`�F�b�N���l�P
				if(structCsv.geth_REMARK1() != null && ("").equals(structCsv.geth_REMARK1()) != true)
				{
					// ����81���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_REMARK1());
					if(strLength > 80)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.REMARKS_1"; // Expj.REMARKS_1=���l�P
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_REMARK1 );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_REMARK1());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.REMARKS_1"; // Expj.REMARKS_1=���l�P
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_REMARK1 );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��51���l1 END=======================================================				
				
// ��52���l2 START=====================================================
				// ���͕⏕�@�\�`�F�b�N���l2
				if(structCsv.geth_REMARK2() != null && ("").equals(structCsv.geth_REMARK2()) != true)
				{
					// ����81���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_REMARK2());
					if(strLength > 80)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.REMARKS_2"; // Expj.REMARKS_2=���l2
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_REMARK2 );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_REMARK2());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.REMARKS_2"; // Expj.REMARKS_2=���l2
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_REMARK2 );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��52���l2 END=======================================================					
				
// ��53�i�ڕ���01�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���01�R�[�h
				if(structCsv.geth_ITEM_CLASS_01_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_01_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_01_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4099"; // Expj.Cmt4099=�i�ڕ���01�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_01_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_01_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4099"; // Expj.Cmt4099=�i�ڕ���01�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_01_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��53�i�ڕ���01�R�[�h END=======================================================							
				
// ��54�i�ڕ���02�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���02�R�[�h
				if(structCsv.geth_ITEM_CLASS_02_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_02_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_02_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4100"; // Expj.Cmt4100=�i�ڕ���02�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_02_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_02_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4100"; // Expj.Cmt4100=�i�ڕ���02�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_02_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��54�i�ڕ���02�R�[�h END=======================================================							
				
// ��55�i�ڕ���03�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���03�R�[�h
				if(structCsv.geth_ITEM_CLASS_03_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_03_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_03_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4101"; // Expj.Cmt4101=�i�ڕ���03�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_03_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_03_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4101"; // Expj.Cmt4101=�i�ڕ���03�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_03_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��55�i�ڕ���03�R�[�h END=======================================================							

// ��56�i�ڕ���04�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���04�R�[�h
				if(structCsv.geth_ITEM_CLASS_04_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_04_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_04_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4102"; // Expj.Cmt4102=�i�ڕ���04�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_04_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_04_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4102"; // Expj.Cmt4102=�i�ڕ���04�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_04_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��56�i�ڕ���04�R�[�h END=======================================================							
								
// ��57�i�ڕ���05�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���05�R�[�h
				if(structCsv.geth_ITEM_CLASS_05_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_05_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_05_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4103"; // Expj.Cmt4103=�i�ڕ���05�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_05_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_05_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4103"; // Expj.Cmt4103=�i�ڕ���05�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_05_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��57�i�ڕ���05�R�[�h END=======================================================
                	
// ��58�i�ڕ���06�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���06�R�[�h
				if(structCsv.geth_ITEM_CLASS_06_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_06_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_06_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4104"; // Expj.Cmt4104=�i�ڕ���06�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_06_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_06_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4104"; // Expj.Cmt4104=�i�ڕ���06�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_06_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��58�i�ڕ���06�R�[�h END=======================================================							
				
// ��59�i�ڕ���07�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���07�R�[�h
				if(structCsv.geth_ITEM_CLASS_07_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_07_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_07_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4105"; // Expj.Cmt4105=�i�ڕ���07�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_07_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_07_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4105"; // Expj.Cmt4105=�i�ڕ���07�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_07_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��59�i�ڕ���07�R�[�h END=======================================================							
				
// ��60�i�ڕ���08�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���08�R�[�h
				if(structCsv.geth_ITEM_CLASS_08_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_08_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_08_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4106"; // Expj.Cmt4106=�i�ڕ���08�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_08_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_08_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4106"; // Expj.Cmt4106=�i�ڕ���08�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_08_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��60�i�ڕ���08�R�[�h END=======================================================							
				
// ��61�i�ڕ���09�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���09�R�[�h
				if(structCsv.geth_ITEM_CLASS_09_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_09_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_09_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4107"; // Expj.Cmt4107=�i�ڕ���09�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_09_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_09_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4107"; // Expj.Cmt4107=�i�ڕ���09�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_09_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��61�i�ڕ���09�R�[�h END=======================================================					
				
// ��62�i�ڕ���10�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���10�R�[�h
				if(structCsv.geth_ITEM_CLASS_10_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_10_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_10_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4108"; // Expj.Cmt4108=�i�ڕ���10�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_10_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_10_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4108"; // Expj.Cmt4108=�i�ڕ���10�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_10_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��62�i�ڕ���10�R�[�h END=======================================================	
				
// ��63�i�ڕ���11�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���11�R�[�h
				if(structCsv.geth_ITEM_CLASS_11_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_11_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_11_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4109"; // Expj.Cmt4109=�i�ڕ���11�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_11_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_11_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4109"; // Expj.Cmt4109=�i�ڕ���11�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_11_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��63�i�ڕ���11�R�[�h END=======================================================	
				
// ��64�i�ڕ���12�R�[�h START=====================================================
				// ���͕⏕�@�\�`�F�b�N�i�ڕ���12�R�[�h
				if(structCsv.geth_ITEM_CLASS_12_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_12_CD()) != true)
				{
					// ����26���ȏ�̏ꍇ�G���[
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_12_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4110"; // Expj.Cmt4110=�i�ڕ���12�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01501";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_12_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
					// �֑�����������̏ꍇ�G���[
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_12_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
						// ������L�[�Z�b�g
						tkey = "Expj.Cmt4110"; // Expj.Cmt4110=�i�ڕ���12�R�[�h
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// �����ꍀ�ڎ擾�Z�b�g
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// �G���[�敪
						ErrNo = "AA01524";								// �G���[�ԍ�
						// ���b�Z�[�W�擾 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV�o��(�G���[)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_12_CD );
						// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// �G���[�t���O"true"�ɃZ�b�g
						bError = true;
						chkHasErr = true;
						// �����ׂ֏������ڍs
						continue;
					}
				}
// ��64�i�ڕ���12�R�[�h END=======================================================					


// �R���{�{�b�N�X�f�[�^�`�F�b�N START-------------------------------------------------------------------------------------------

// ��1�i�ڎ�z�敪�R���{ START================================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �i�ڎ�z�敪
                    if(structCsv.geth_MRP_ODR_TYP() != null && ("").equals(structCsv.geth_MRP_ODR_TYP()) != true)
                    {
                        struct.setsetNAME("MRP_ODR_TYP");
                        struct.setsetVALUE(structCsv.geth_MRP_ODR_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            //ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��1�i�ڎ�z�敪�R���{ END==================================================

// ��2�i�ړ��O��敪�R���{ START==============================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �i�ړ��O��敪
                    if(structCsv.geth_OUTSIDE_TYP() != null && ("").equals(structCsv.geth_OUTSIDE_TYP()) != true)
                    {
                        struct.setsetNAME("OUTSIDE_TYP");
                        struct.setsetVALUE(structCsv.geth_OUTSIDE_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.OUTSIDE_TYP_4"; // Expj.OUTSIDE_TYP_4=�i�ړ��O��敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            //ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OUTSIDE_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��2�i�ړ��O��敪�R���{ END================================================

// ��3�݌ɐ��ʒP�ʋ敪�R���{ START============================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �݌ɐ��ʒP�ʋ敪
                    if(structCsv.geth_UNIT_QTY_TYP() != null && ("").equals(structCsv.geth_UNIT_QTY_TYP()) != true)
                    {
                        struct.setsetNAME("UNIT_QTY_TYP");
                        struct.setsetVALUE(structCsv.geth_UNIT_QTY_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=�݌ɐ��P�ʋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            //ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��3�݌ɐ��ʒP�ʋ敪�R���{ END==============================================

// ��4���b�g�܂Ƃߋ敪�R���{ START============================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N ���b�g�܂Ƃߋ敪
                    if(structCsv.geth_LOT_SIZING_TYP() != null && ("").equals(structCsv.geth_LOT_SIZING_TYP()) != true)
                    {
                        struct.setsetNAME("LOT_SIZING_TYP");
                        struct.setsetVALUE(structCsv.geth_LOT_SIZING_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.LOT_SIZING_TYP"; // Expj.LOT_SIZING_TYP=���b�g�܂Ƃߋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            //ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_SIZING_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��4���b�g�܂Ƃߋ敪�R���{ END==============================================

// ��5�o�ɋ敪�R���{ START====================================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �o�ɋ敪
                    if(structCsv.geth_ISSUE_TYP() != null && ("").equals(structCsv.geth_ISSUE_TYP()) != true)
                    {
                        struct.setsetNAME("ISSUE_TYP");
                        struct.setsetVALUE(structCsv.geth_ISSUE_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ISSUE_TYP"; // Expj.ISSUE_TYP=�o�ɋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ISSUE_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��5�o�ɋ敪�R���{ END======================================================

// ��6�׎p�Ǘ��t���O�R���{ START==============================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �׎p�Ǘ��t���O
                    if(structCsv.geth_STOCK_UNIT_FLG() != null && ("").equals(structCsv.geth_STOCK_UNIT_FLG()) != true)
                    {
                        struct.setsetNAME("STOCK_UNIT_FLG");
                        struct.setsetVALUE(structCsv.geth_STOCK_UNIT_FLG());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.STOCK_UNIT_FLG"; // Expj.STOCK_UNIT_FLG=�׎p�Ǘ��t���O
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT_FLG );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��6�׎p�Ǘ��t���O�R���{ END================================================

// ��7MPS�i�ڃt���O�R���{ START===============================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N MPS�i�ڃt���O
                    if(structCsv.geth_MPS_FLG() != null && ("").equals(structCsv.geth_MPS_FLG()) != true)
                    {
                        struct.setsetNAME("MPS_FLG");
                        struct.setsetVALUE(structCsv.geth_MPS_FLG());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MPS_FLG"; // Expj.MPS_FLG=MPS�i�ڃt���O
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            //ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MPS_FLG );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��7MPS�i�ڃt���O�R���{ END=================================================

// ��8��������敪�R���{ START================================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N ��������敪
                    if(structCsv.geth_ACPT_INSPC_TYP() != null && ("").equals(structCsv.geth_ACPT_INSPC_TYP()) != true)
                    {
                        struct.setsetNAME("ACPT_INSPC_TYP");
                        struct.setsetVALUE(structCsv.geth_ACPT_INSPC_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ACPT_INSPC_TYP"; // Expj.ACPT_INSPC_TYP=��������敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ACPT_INSPC_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��8��������敪�R���{ END==================================================

// ��9���i�敪�R���{ START====================================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N ���i�敪
                    if(structCsv.geth_PRODUCT_TYP() != null && ("").equals(structCsv.geth_PRODUCT_TYP()) != true)
                    {
                        struct.setsetNAME("PRODUCT_TYP");
                        struct.setsetVALUE(structCsv.geth_PRODUCT_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.PRODUCT_TYP"; // Expj.PRODUCT_TYP=���i�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PRODUCT_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��9���i�敪�R���{ END======================================================

// ��10�I���敪�R���{ START===================================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �I���敪
                    if(structCsv.geth_ABC_TYP() != null && ("").equals(structCsv.geth_ABC_TYP()) != true)
                    {
                        struct.setsetNAME("ABC_TYP");
                        struct.setsetVALUE(structCsv.geth_ABC_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ABC_TYP"; // Expj.ABC_TYP=�I���敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            //ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ABC_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��10�I���敪�R���{ END=====================================================

// ��11��Ǝ��ы敪�R���{ START===============================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �I���敪
                    if(structCsv.geth_OPR_RSLT_TYP() != null && ("").equals(structCsv.geth_OPR_RSLT_TYP()) != true)
                    {
                        struct.setsetNAME("OPR_RSLT_TYP");
                        struct.setsetVALUE(structCsv.geth_OPR_RSLT_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.OPR_RSLT_TYP"; // Expj.OPR_RSLT_TYP=��Ǝ��ы敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            //ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OPR_RSLT_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��11��Ǝ��ы敪�R���{ END=================================================

// ��12�󋋕i�敪�R���{ START=================================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �󋋕i�敪
                    if(structCsv.geth_SPL_ITEM_TYP() != null && ("").equals(structCsv.geth_SPL_ITEM_TYP()) != true)
                    {
                        struct.setsetNAME("SPL_ITEM_TYP");
                        struct.setsetVALUE(structCsv.geth_SPL_ITEM_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.SPL_ITEM_TYP"; // Expj.SPL_ITEM_TYP=�󋋕i�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            //ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPL_ITEM_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��12�󋋕i�敪�R���{ END===================================================

// 2008/07/25 SYSCOM �镔 ADD START
// ��13�H���Ǘ��i�ڋ敪�R���{ START=================================================
                    // �R���{�{�b�N�X���ڃ`�F�b�N �H���Ǘ��i�ڋ敪
                    if(structCsv.geth_MANHOUR_TYP() != null && ("").equals(structCsv.geth_MANHOUR_TYP()) != true)
                    {
                        struct.setsetNAME("MANHOUR_TYP");
                        struct.setsetVALUE(structCsv.geth_MANHOUR_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=�H���Ǘ��i�ڋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01504";                              // �G���[�ԍ�
                            //ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // ���X�g�N���A
                            listType.clear();
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        // ���X�g�N���A
                        listType.clear();
                    }
// ��13�H���Ǘ��i�ڋ敪�R���{ END===================================================
// 2008/07/25 SYSCOM �镔 ADD END

//�@���v�ʒP�ʃR���{ START=================================================
					// �R���{�{�b�N�X���ڃ`�F�b�N �󋋕i�敪
					if(structCsv.geth_STOCK_UNIT() != null && ("").equals(structCsv.geth_STOCK_UNIT()) != true)
					{
						struct.setsetDISPLAY_NAME(structCsv.geth_STOCK_UNIT());
						boolean stockUnitFlg = entity.mcheckSYS_TYPE_VALUE.check(conn,struct);


						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.STOCK_UNIT"; // Expj.STOCK_UNIT=�v�ʒP��
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01504";								// �G���[�ԍ�
							//ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
// ���v�ʒP�ʃR���{ END===================================================					
					

//��13�ۊǋ敪�R���{ START=================================================
					// �R���{�{�b�N�X���ڃ`�F�b�N �ۊǋ敪
					if(structCsv.geth_DEPO_TYP() != null && ("").equals(structCsv.geth_DEPO_TYP()) != true){
						struct.setsetNAME("WH_COND_TYP");
						struct.setsetVALUE(structCsv.geth_DEPO_TYP());
					    List  listType = entity.mreadSYS_TYPE_VALUE.read(conn,struct);
					    
					    if(listType.isEmpty()){
					    	ErrlineNo = i+1;               // �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
					    	tkey = "Expj.Cmt4091";
					    	ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
					    	ErrItem = CoreTools.getRBString(tkey, resource);
					    	
					    	
					    	ErrCd = "1";                                            // �G���[�敪
					    	ErrNo = "AA01504";                                     // �G���[�ԍ�
							//ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
					    	ExpjMessage emsg = new ExpjMessage(ErrNo);
					    	ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
					    	csvExport(structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg,CsvCnt,CSV_COLNO_DEPO_TYP);
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
					    	structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
					    	bError = true;
					    	chkHasErr = true;
							// ���X�g�N���A
					    	listType.clear();
							// �����ׂ֏������ڍs
					    	continue;
					    	
					    }
						// ���X�g�N���A
					    listType.clear();
					}
// ��13�ۊǋ敪�R���{ END===================================================

//��14���b�g�Ǘ��t���O�R���{ START=================================================
//					 �R���{�{�b�N�X���ڃ`�F�b�N ���b�g�Ǘ��t���O
					if(structCsv.geth_LOT_CTRL_FLG() != null && ("").equals(structCsv.geth_LOT_CTRL_FLG()) != true)
					{
						struct.setsetNAME("LOT_CTRL_FLG");
						struct.setsetVALUE(structCsv.geth_LOT_CTRL_FLG());
						List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

						if (listType.isEmpty()) {
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.LOT_CTRL_FLG";           // Expj.LOT_CTRL_FLG=���b�g�Ǘ��t���O
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01504";								// �G���[�ԍ�
							//ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_CTRL_FLG );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// ���X�g�N���A
							listType.clear();
							// �����ׂ֏������ڍs
							continue;
						}
						// ���X�g�N���A
						listType.clear();
					}
															
//��14���b�g�Ǘ��t���O�R���{ END===================================================
//��15���b�g�̔ԋ敪�R���{ START=================================================
					// �R���{�{�b�N�X���ڃ`�F�b�N ���b�g�̔ԋ敪
					if(structCsv.geth_LOT_NUMBERING_TYP() != null && ("").equals(structCsv.geth_LOT_NUMBERING_TYP()) != true)
					{
						struct.setsetNAME("LOT_NUMBERING");
						struct.setsetVALUE(structCsv.geth_LOT_NUMBERING_TYP());
						List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

						if (listType.isEmpty()) {
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4092"; // Expj.Cmt4092=���b�g�̔ԋ敪
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA01504";								// �G���[�ԍ�
							//ErrMsg = "�R���{�{�b�N�X�f�[�^�ɑ��݂��鐔�l���w�肵�Ă��������B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_NUMBERING_TYP );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// ���X�g�N���A
							listType.clear();
							// �����ׂ֏������ڍs
							continue;
						}
						// ���X�g�N���A
						listType.clear();
					}
//��15���b�g�̔ԋ敪�R���{ END===================================================

//20150803 ADD START BY SYSCOM
//��16�v���W�F�N�g�R�[�h�R���{ START===================================================
					// �R���{�{�b�N�X���ڃ`�F�b�N �v���W�F�N�g�R�[�h
					if(structCsv.geth_PJ_CD() != null && ("").equals(structCsv.geth_PJ_CD()) != true)
					{
						struct.setVALUE(structCsv.geth_PJ_CD());
						boolean stockUnitFlg = entity.mcheckV_PJ_CD.check(conn,struct);

						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.PJ_CD"; // Expj.PJ_CD=�v���W�F�N�g�R�[�h
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA23608";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PJ_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
//��16�v���W�F�N�g�R�[�h�R���{ END===================================================
                	
//��17�Z�O�����g1�R���{ START===================================================
					// �R���{�{�b�N�X���ڃ`�F�b�N �Z�O�����g1
					if(structCsv.geth_SEG_CONTENTS_1() != null && ("").equals(structCsv.geth_SEG_CONTENTS_1()) != true)
					{
						struct.setVALUE(structCsv.geth_SEG_CONTENTS_1());
						boolean stockUnitFlg = entity.mcheckV_SEG_CONTENTS_1.check(conn,struct);

						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.SEG_CONTENTS1"; // Expj.SEG_CONTENTS_1=�Z�O�����g1
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA23604";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_1 );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
//��17�Z�O�����g1�R���{ END===================================================

//��18�Z�O�����g2�R���{ START===================================================
					// �R���{�{�b�N�X���ڃ`�F�b�N �Z�O�����g2
					if(structCsv.geth_SEG_CONTENTS_2() != null && ("").equals(structCsv.geth_SEG_CONTENTS_2()) != true)
					{
						struct.setVALUE(structCsv.geth_SEG_CONTENTS_2());
						boolean stockUnitFlg = entity.mcheckV_SEG_CONTENTS_2.check(conn,struct);

						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.SEG_CONTENTS2"; // Expj.SEG_CONTENTS_2=�Z�O�����g2
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA23605";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_2 );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
//��18�Z�O�����g2�R���{ END===================================================

//��19�Z�O�����g3�R���{ START===================================================
					// �R���{�{�b�N�X���ڃ`�F�b�N �Z�O�����g3
					if(structCsv.geth_SEG_CONTENTS_3() != null && ("").equals(structCsv.geth_SEG_CONTENTS_3()) != true)
					{
						struct.setVALUE(structCsv.geth_SEG_CONTENTS_3());
						boolean stockUnitFlg = entity.mcheckV_SEG_CONTENTS_3.check(conn,struct);

						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.SEG_CONTENTS3"; // Expj.SEG_CONTENTS_3=�Z�O�����g3
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA23606";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_3 );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
//��19�Z�O�����g3�R���{ END===================================================

//��20�Z�O�����g4�R���{ START===================================================
					// �R���{�{�b�N�X���ڃ`�F�b�N �Z�O�����g4
					if(structCsv.geth_SEG_CONTENTS_4() != null && ("").equals(structCsv.geth_SEG_CONTENTS_4()) != true)
					{
						struct.setVALUE(structCsv.geth_SEG_CONTENTS_4());
						boolean stockUnitFlg = entity.mcheckV_SEG_CONTENTS_4.check(conn,struct);

						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.SEG_CONTENTS4"; // Expj.SEG_CONTENTS_4=�Z�O�����g4
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA23607";								// �G���[�ԍ�
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_4 );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
//��20�Z�O�����g4�R���{ END===================================================
//20150803 ADD END BY SYSCOM
// �R���{�{�b�N�X�`�F�b�N END-------------------------------------------------------------------------------------------

// ��1����ŃR�[�h�}�X�^���݃`�F�b�N START====================================
                    if(structCsv.geth_TAX_CD() != null )
                    {
// ---------------AA0010:�i�ڃ����e�i���X�����ƃ`�F�b�N�𓯗l�ɂ��Ă���(JAVA�L�q)---------------
                        struct.setsetTAXCD(structCsv.geth_TAX_CD());
                        result = entity.mcheckM_TAX.check(conn, struct);
                        if(result == false){
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.TAX_CD_1"; // Expj.TAX_CD_1=����ŃR�[�h
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01001";                              // �G���[�ԍ�
                            //ErrMsg = "�w�肵������ŃR�[�h�͖��o�^�ł��B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_TAX_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
    // ---------------AA0010:�i�ڃ����e�i���X�����ƃ`�F�b�N�𓯗l�ɂ��Ă���(JAVA�L�q)---------------
                        }
                    }
// ��1����ŃR�[�h�}�X�^���݃`�F�b�N END======================================

//20150803 ADD SATART BY SYSCOM
// ��4���S����`�F�b�N START==========================================
                    if(structCsv.geth_DEPT_CD() != null )
                    {
                        struct.seth_DEPT_CD(structCsv.geth_DEPT_CD());
                        result = entity.mcheckV_DEPT_CD.check(conn, struct);
                        if(result == false){
                        	System.out.println(structCsv.geth_DEPT_CD());
                        	System.out.println(result);
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.DEPT_CD"; // Expj.DEPT_CD=���S����R�[�h
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA23603";                              // �G���[�ԍ�
                            //ErrMsg = "�w�肵�����S����R�[�h�͖��o�^�ł��B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DEPT_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��4���S����`�F�b�N END======================================
//20150803 ADD END BY SYSCOM

// ��4�i�ڎ�z�敪�`�F�b�N START==========================================
                    // �i�ڎ�z�敪�� 6:��ʎ�z�i�ڂ܂��� 7:�����_��z�i�ڂ̎�
                    if((("6").equals(structCsv.geth_MRP_ODR_TYP()) == true) ||      // �i�ڎ�z�敪(MRP_ODR_TYP)��6:��ʎ�z�i�ڂł͂Ȃ�
                       (("7").equals(structCsv.geth_MRP_ODR_TYP()) == true))        // �i�ڎ�z�敪(MRP_ODR_TYP)�� 7:�����_��z�i�ڂł͂Ȃ�
                    {
                        // �����_�݌ɐ�
                        BigDecimal bdPoint = new BigDecimal(structCsv.geth_ODR_POINT());
                        BigDecimal bdZERO = new BigDecimal("0");
                        // �����_�݌ɐ��̒l�������͂܂���0�ȉ��̏ꍇ
                        if(bdPoint.compareTo(bdZERO) != 1){
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);
    
                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00003";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);
    
                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP  );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                      }
                    }
// ��4�i�ڎ�z�敪�`�F�b�N END============================================

// ��5�`11�݌ɐ��ʋ敪�`�F�b�N START==============================================
                    // �݌ɐ��P�ʋ敪(UNIT_QTY_TYP)��1:�����Ǘ��̎�ceil
                    //   �׎p�P�ʐ�(PKG_UNIT_QTY)�A���S�݌ɐ���(SAFETY_STOCK)�A�ő��z��(MAX_ODR_QTY)
                    //   �����_�݌ɐ�(ODR_POINT)�A��ʔ�����(FIXED_ODR_QTY)�A�ŏ���z��(MIN_ODR_QTY)�A�܂�ߒP��(MUL_ODR_QTY)
                    //  ���������͂Ȃ�ꍇ�G���[
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // �݌ɐ��P�ʋ敪(UNIT_QTY_TYP)��1:�����Ǘ�
                        (Calculate.isNumeric(structCsv.geth_PKG_UNIT_QTY()) == true))       // �׎p�P�ʐ�(PKG_UNIT_QTY)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=�݌ɐ��P�ʋ敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01507";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // �݌ɐ��P�ʋ敪(UNIT_QTY_TYP)��1:�����Ǘ�
                        (Calculate.isNumeric(structCsv.geth_SAFETY_STOCK()) == true))       // ���S�݌ɐ���(SAFETY_STOCK)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=�݌ɐ��P�ʋ敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01508";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // �݌ɐ��P�ʋ敪(UNIT_QTY_TYP)��1:�����Ǘ�
                        (Calculate.isNumeric(structCsv.geth_MAX_ODR_QTY()) == true))        // �ő��z��(MAX_ODR_QTY)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=�݌ɐ��P�ʋ敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01509";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // �݌ɐ��P�ʋ敪(UNIT_QTY_TYP)��1:�����Ǘ�
                        (Calculate.isNumeric(structCsv.geth_ODR_POINT()) == true))      // �����_�݌ɐ�(ODR_POINT)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=�݌ɐ��P�ʋ敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01510";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // �݌ɐ��P�ʋ敪(UNIT_QTY_TYP)��1:�����Ǘ�
                        (Calculate.isNumeric(structCsv.geth_FIXED_ODR_QTY()) == true))      // ��ʔ�����(FIXED_ODR_QTY)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=�݌ɐ��P�ʋ敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01511";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // �݌ɐ��P�ʋ敪(UNIT_QTY_TYP)��1:�����Ǘ�
                        (Calculate.isNumeric(structCsv.geth_MIN_ODR_QTY()) == true))        // �ŏ���z��(MIN_ODR_QTY)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=�݌ɐ��P�ʋ敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01512";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // �݌ɐ��P�ʋ敪(UNIT_QTY_TYP)��1:�����Ǘ�
                        (Calculate.isNumeric(structCsv.geth_MUL_ODR_QTY()) == true))        // �܂�ߒP��(MUL_ODR_QTY)
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=�݌ɐ��P�ʋ敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA01513";                              // �G���[�ԍ�
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
                    
// ��5�`11�݌ɐ��ʋ敪�`�F�b�N END================================================

// ��15��Ƌ敪/��Ǝ��ы敪�`�F�b�N START=====================================
                    // �i�ڎ�z�敪(MRP_ODR_TYP)��4:�}�j���A����z�i�ځA5:���b�g��z�i�ځA6:��ʎ�z�i��
                    // 7:�����_��z�i�ڂłȂ��Ƃ��ɁA��Ǝ��ы敪(OPR_RSLT_TYP)��1:�o�������т̏ꍇ
                    // ���������͂Ȃ�ꍇ�G���[�Ƃ���B
                    if((("4").equals(structCsv.geth_MRP_ODR_TYP()) != true) &&      // �i�ڎ�z�敪(MRP_ODR_TYP)��4:�}�j���A����z�i�ڂł͂Ȃ�
                      (("5").equals(structCsv.geth_MRP_ODR_TYP()) != true) &&       // �i�ڎ�z�敪(MRP_ODR_TYP)��5:���b�g��z�i�ڂł͂Ȃ�
                      (("6").equals(structCsv.geth_MRP_ODR_TYP()) != true) &&       // �i�ڎ�z�敪(MRP_ODR_TYP)��6:��ʎ�z�i�ڂł͂Ȃ�
                      (("7").equals(structCsv.geth_MRP_ODR_TYP()) != true) &&       // �i�ڎ�z�敪(MRP_ODR_TYP)�� 7:�����_��z�i�ڂł͂Ȃ�
                      (("1").equals(structCsv.geth_OPR_RSLT_TYP()) == true))        // ��Ǝ��ы敪(OPR_RSLT_TYP)��1:�o�������т̏ꍇ
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00138";                              // �G���[�ԍ�
                        //ErrMsg = "�Y���̎�z�敪�̂Ƃ��A�w�肵����Ǝ��ы敪�͎w��ł��܂���B";      // �G���[���b�Z�[�W
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }

// ��15��Ƌ敪/��Ǝ��ы敪�`�F�b�N END=======================================

// ��16�J�����_���݃`�F�b�N BEGIN=======================================

                    if(structCsv.geth_CAL_NO() != null && ("").equals(structCsv.geth_CAL_NO()) != true)
                    {
                        // �J�����_�w�b�_�`�F�b�N
                        struct.setsetM_CAL_H_CAL_NO(structCsv.geth_CAL_NO());
                        result = entity.mcheckM_CAL_H.check(conn, struct);
                        if(result == false)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.CAL_NO"; // Expj.CAL_NO=�J�����_�ԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);
    
                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01013";                              // �G���[�ԍ�
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);
    
                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CAL_NO );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                  }

// ��16�J�����_���݃`�F�b�N END=======================================

// ��17�ŏ���z��<�ő��z���`�F�b�N START=====================================
                    // �i�ڎ�z�敪(MRP_ODR_TYP)��5:���b�g��z�i�ڂ̎��A
                    // �ő��z�����ŏ���z�����傫���ꍇ�G���[�Ƃ���B
                    
                    if(("5").equals(structCsv.geth_MRP_ODR_TYP()) == true)
                    {
                        BigDecimal b1 = new BigDecimal(structCsv.geth_MAX_ODR_QTY());  // �ő��z����
                        BigDecimal b2 = new BigDecimal(structCsv.geth_MIN_ODR_QTY());  // �ŏ���z����
                        if (b2.compareTo(b1) == 1)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00147";                              // �G���[�ԍ�
                            //ErrMsg = "�ŏ���z���͍ő��z����菬�����l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);


                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP  );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��17�ŏ���z��<�ő��z���`�F�b�N END=======================================

// ��18�܂�ߒP��<�ő��z���`�F�b�N START====================================
                    // �i�ڎ�z�敪(MRP_ODR_TYP)��5:���b�g��z�i�ڂ̎��A
                    // �ő��z�����܂�ߒP�ʂ��傫���ꍇ�G���[�Ƃ���B
                    if(("5").equals(structCsv.geth_MRP_ODR_TYP()) == true)
                    {
                        BigDecimal b1 = new BigDecimal(structCsv.geth_MAX_ODR_QTY());  // �ő��z����
                        BigDecimal b2 = new BigDecimal(structCsv.geth_MUL_ODR_QTY());  // �܂邢�P��
                        if (b2.compareTo(b1) == 1)
                        {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00148";                              // �G���[�ԍ�
                            //ErrMsg = "�܂�ߒP�ʂ͍ő��z����菬�����l���w�肵�Ă��������B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��18�܂�ߒP��<�ő��z���`�F�b�N END======================================

// 2008/07/25 SYSCOM �镔 ADD START
// ��20�i�ڎ�z�敪/���ԃ`�F�b�N START========================================
                    // �H���Ǘ��i�ڋ敪(MANHOUR_TYP)��1�F�H���Ǘ��i�� ���� �A
                    // �i�ڎ�z�敪(MRP_ODR_TYP)��1:���ԂłȂ��ꍇ�G���[�Ƃ���B
                    if((("1").equals(structCsv.geth_MANHOUR_TYP()) == true) &&    // �H���Ǘ��i�ڋ敪(MANHOUR_TYP)��1:�H���Ǘ��i��
                      (("1").equals(structCsv.geth_MRP_ODR_TYP()) != true))       // �i�ڎ�z�敪(MRP_ODR_TYP)��1:���Ԃł͂Ȃ�
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00184";                              // �G���[�ԍ�
                        //ErrMsg = "�H���Ǘ��i�ڂ̏ꍇ�A�i�ڎ�z�敪��1:���Ԃ̂ݗL���ł��B";      // �G���[���b�Z�[�W
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
// ��20�i�ڎ�z�敪/���ԃ`�F�b�N END==========================================

// ��21���O��敪/����`�F�b�N START==========================================
                    // �H���Ǘ��i�ڋ敪(MANHOUR_TYP)��1�F�H���Ǘ��i�� ���� �A
                    // ���O��敪(OUTSIDE_TYP)��1:����łȂ��ꍇ�G���[�Ƃ���B
                    if((("1").equals(structCsv.geth_MANHOUR_TYP()) == true) &&    // �H���Ǘ��i�ڋ敪(MANHOUR_TYP)��1:�H���Ǘ��i��
                      (("1").equals(structCsv.geth_OUTSIDE_TYP()) != true))       // ���O��敪(OUTSIDE_TYP)��1:����ł͂Ȃ�
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.OUTSIDE_TYP"; // Expj.OUTSIDE_TYP=���O��敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00185";                              // �G���[�ԍ�
                        //ErrMsg = "�H���Ǘ��i�ڂ̏ꍇ�A���O��敪��1:����̂ݗL���ł��B";      // �G���[���b�Z�[�W
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OUTSIDE_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
// ��21���O��敪/����`�F�b�N END============================================

// ��22�I���敪/�I���Ώەi�O�`�F�b�N START====================================
                    // �H���Ǘ��i�ڋ敪(MANHOUR_TYP)��1�F�H���Ǘ��i�� ���� �A
                    // �I���敪(ABC_TYP)��9:�I���ΏۊO�łȂ��ꍇ�G���[�Ƃ���B
                    if((("1").equals(structCsv.geth_MANHOUR_TYP()) == true) &&    // �H���Ǘ��i�ڋ敪(MANHOUR_TYP)��1:�H���Ǘ��i��
                      (("9").equals(structCsv.geth_ABC_TYP()) != true))           // �I���敪(ABC_TYP)��9:�I���ΏۊO�ł͂Ȃ�
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.ABC_TYP"; // Expj.ABC_TYP=�I���敪
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00186";                              // �G���[�ԍ�
                        //ErrMsg = "�H���Ǘ��i�ڂ̏ꍇ�A�I���敪��9:�I���ΏۊO�̂ݗL���ł��B";      // �G���[���b�Z�[�W
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ABC_TYP  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
// ��22�I���敪/�I���Ώەi�O�`�F�b�N END======================================

// ��23�i�ڎd����=0�`�F�b�N START=============================================
                    // �H���Ǘ��i�ڋ敪(MANHOUR_TYP)��1�F�H���Ǘ��i�� ���� �A
                    // �i�ڎd����(ITEM_SPOIL)��0�łȂ��ꍇ�G���[�Ƃ���B
                    if((("1").equals(structCsv.geth_MANHOUR_TYP()) == true) &&    // �H���Ǘ��i�ڋ敪(MANHOUR_TYP)��1:�H���Ǘ��i��
                      (("0").equals(structCsv.geth_ITEM_SPOIL()) != true))           // �i�ڎd����(ITEM_SPOIL)��0�ł͂Ȃ�
                    {
                        ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                        // ������L�[�Z�b�g
                        tkey = "Expj.ITEM_SPOIL"; // Expj.ITEM_SPOIL=�i�ڎd����
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // �����ꍀ�ڎ擾�Z�b�g
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // �G���[�敪
                        ErrNo = "AA00187";                              // �G���[�ԍ�
                        //ErrMsg = "�H���Ǘ��i�ڂ̏ꍇ�A�i�ڎd������0�łȂ���΂����܂���B";      // �G���[���b�Z�[�W
                        // ���b�Z�[�W�擾 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV�o��(�G���[)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_SPOIL  );
                        // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // �G���[�t���O"true"�ɃZ�b�g
                        bError = true;
                        chkHasErr = true;
                        // �����ׂ֏������ڍs
                        continue;
                    }
// ��23�i�ڎd����=0�`�F�b�N END===============================================
// 2008/07/25 SYSCOM �镔 ADD END

// ��22�i�ڕ��ރR�[�h���݃`�F�b�N START====================================
					//�i�ڕ��ރR�[�h01
					boolean classFlg = false;
					if(structCsv.geth_ITEM_CLASS_01_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_01_CD()) != true)
					{
						struct.setsetCLASS_CD2("01");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_01_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4099"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"01");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_01_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}						
					}
					
					//�i�ڕ��ރR�[�h02
					if(structCsv.geth_ITEM_CLASS_02_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_02_CD()) != true){

						struct.setsetCLASS_CD2("02");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_02_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4100"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"02");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_02_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						
						
					}
					//�i�ڕ��ރR�[�h03
					if(structCsv.geth_ITEM_CLASS_03_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_03_CD()) != true){
						struct.setsetCLASS_CD2("03");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_03_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4101"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"03");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_03_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}						
					}
					//�i�ڕ��ރR�[�h04
					if(structCsv.geth_ITEM_CLASS_04_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_04_CD()) != true){

						struct.setsetCLASS_CD2("04");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_04_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4102"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"04");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_04_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						
					}
					//�i�ڕ��ރR�[�h05
					if(structCsv.geth_ITEM_CLASS_05_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_05_CD()) != true){

						struct.setsetCLASS_CD2("05");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_05_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4103"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"05");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_05_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						
					}
					//�i�ڕ��ރR�[�h06
					if(structCsv.geth_ITEM_CLASS_06_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_06_CD()) != true){

						struct.setsetCLASS_CD2("06");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_06_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4104"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"06");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_06_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						
					}
					//�i�ڕ��ރR�[�h07
					if(structCsv.geth_ITEM_CLASS_07_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_07_CD()) != true){

						struct.setsetCLASS_CD2("07");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_07_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4105"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"07");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_07_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
					//�i�ڕ��ރR�[�h08
					if(structCsv.geth_ITEM_CLASS_08_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_08_CD()) != true){

						struct.setsetCLASS_CD2("08");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_08_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4106"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"08");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_08_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						
					}
					//�i�ڕ��ރR�[�h09
					if(structCsv.geth_ITEM_CLASS_09_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_09_CD()) != true){

						struct.setsetCLASS_CD2("09");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_09_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4107"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"09");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_09_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						
					}
					//�i�ڕ��ރR�[�h10
					if(structCsv.geth_ITEM_CLASS_10_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_10_CD()) != true){

						struct.setsetCLASS_CD2("10");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_10_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4108"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"10");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_10_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						
					}
					//�i�ڕ��ރR�[�h11
					if(structCsv.geth_ITEM_CLASS_11_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_11_CD()) != true){

						struct.setsetCLASS_CD2("11");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_11_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4109"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"11");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_11_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
						
					}
					//�i�ڕ��ރR�[�h12
					if(structCsv.geth_ITEM_CLASS_12_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_12_CD()) != true){
						struct.setsetCLASS_CD2("12");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_12_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.Cmt4110"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20027";								// �G���[�ԍ�
							//ErrMsg = "�y�i�ڕ��ރR�[�h���m���ރ}�X�^�n�ɑ��݂��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"12");
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_12_CD );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}						
					}
					

// ��22�i�ڕ��ރR�[�h���݃`�F�b�N END======================================	
// ��23���ԁA���b�g�Ǘ��t���O�����`�F�b�N START====================================
					if("1".equals(structCsv.geth_MRP_ODR_TYP()) == true || "2".equals(structCsv.geth_MRP_ODR_TYP()) == true){
						if("1".equals(structCsv.geth_LOT_CTRL_FLG()) == true)
						{

							ErrlineNo = i + 1;								// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.LOT_CTRL_FLG"; // Expj.LOT_CTRL_FLG=���b�g�Ǘ��t���O
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// �G���[�敪
							ErrNo = "AA20048";								// �G���[�ԍ�
							//ErrMsg = "���Ԃ̏ꍇ�A���b�g�Ǘ��i�ڂɂł��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_CTRL_FLG );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						
						}
					}

// ��23���ԁA���b�g�Ǘ��t���O�����`�F�b�N END======================================

                    // ���X�V���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���X�V���̂�)��
                    if (("true").equals(_save_struct.getrdoUpdate()) == true)
                    {

// ��12��ƌn��Ƃ̃��[�h�^�C���ݒ�̑Ó����m�F�`�F�b�N START==================
// ---------------AA0010:�i�ڃ����e�i���X�����ƃ`�F�b�N�𓯗l�ɂ��Ă���(JAVA�L�q)---------------
                        // �i�ڔ�ᕪ���[�h�^�C����"0"�̎��`�F�b�N����B
                        if(("0").equals(structCsv.geth_PROP_LT()) == true)
                        {

                            // �i�ڂ̌Œ�LT
                            Integer itemFixLT = IntegerConverter.Convert(structCsv.geth_FIXED_LT());

                            // �H�ꂲ�Ƃ�LT�Ǎ�
                            boolean result2 = true;
                            struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                            List lts = entity.mLTbyPLANT.read(conn,struct);
                            for(int n = 0; n < lts.size(); n++){
                                AA0150010Struct w = (AA0150010Struct)lts.get(n);

                                // �n����LT���ݒ肠��Ȃ� ��������OK
                                if(w.getreadSUM_PROP_LT().intValue() != 0) continue;

                                // �n��̌Œ�LT���i�ڌŒ�LT���傫����Όx���Ώ�
                                Integer procFixLT = w.getreadSUM_FIXED_LT();
                                if(itemFixLT.intValue() < procFixLT.intValue()){
                                    // �G���[�t���O�Z�b�g
                                    result2 = false;
                                    // ���[�v�𔲂���B
                                    break;
                                }
                            }

                            // ��ƌn����Ƃ̊Ԃɖ������������ꍇ���[�j���O�œo�^
                            if(result2 == false)
                            {
                                ErrlineNo = i + 1;                                      // �G���[�����s(���ۂ̃G���[�s)
                                // ������L�[�Z�b�g
                                tkey = "Expj.PROP_LT_2"; // Expj.PROP_LT_2=�i�ڔ�ᕪ���[�h�^�C��
                                ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                                // �����ꍀ�ڎ擾�Z�b�g
                                ErrItem = CoreTools.getRBString(tkey, resource);

                                if(!("true").equals(_save_struct.getDO_CHK())){
                    // �o�^����ꍇ�A���[�j���O
                                    ErrNo = "AA60001";                                      // �G���[�ԍ�
                                }else{
                    // �o�^���Ȃ��ꍇ�A���[�j���O
                                    ErrNo = "AA01523";                                      // �G���[�ԍ�
                                }
                // �o�^���Ȃ��ꍇ�A���[�j���O
                                ErrCd = "2";                                            // �G���[�敪(���[�j���O�ōX�V)
                                //ErrMsg = "��ƌn����Ƃ̊Ԃɖ���������܂��B";      // �G���[���b�Z�[�W
                                // ���b�Z�[�W�擾 
                                ExpjMessage emsg = new ExpjMessage(ErrNo);
                                ErrMsg = emsg.getMessage(locale);

                                // CSV�o��(�G���[)
                                csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PROP_LT  );
                                
                                intWarningCount++;
                                if(!bWarningCount){
                                	intWarningCtByData ++;
                                }
                                bError = true;
                            }
                        }
// ---------------AA0010:�i�ڃ����e�i���X�����ƃ`�F�b�N�𓯗l�ɂ��Ă���(JAVA�L�q)---------------
// ��12��ƌn��Ƃ̃��[�h�^�C���ݒ�̑Ó����m�F�`�F�b�N END====================
                        
                        
//��14�݌ɏ��`�F�b�N START==================================================
                        boolean errorFlg = false;
                        boolean result4 = true;     // �`�F�b�N���ʊi�[
                        struct.setsetMRP_ODR_ITEM_CD(structCsv.geth_ITEM_CD());
                        result4 = entity.mcheckM_ITEM_mrp_odr_typ.check(conn, struct);
                        struct.setsetM_ITEM_ITEM_CD(structCsv.geth_ITEM_CD());
						List itemParm = entity.mselectM_ITEM.read(conn,struct);
						String mrpOdrTyp = ((AA0150010Struct)itemParm.get(0)).getreadM_ITEM_MRP_ODR_TYP();
						String mrpDdrTypCsv = structCsv.geth_MRP_ODR_TYP();
                        if(result4 == true && mrpOdrTyp.equals(mrpDdrTypCsv) == false){
    						if("4".equals(mrpOdrTyp) || "5".equals(mrpOdrTyp) || "6".equals(mrpOdrTyp) ||"7".equals(mrpOdrTyp) ){
    						    if("1".equals(mrpDdrTypCsv) || "2".equals(mrpDdrTypCsv) || "8".equals(mrpDdrTypCsv)){
    						    	errorFlg = true;
    						    	ErrNo ="AA00211";
    	                            // ���b�Z�[�W�擾 
    	                            ExpjMessage emsg = new ExpjMessage(ErrNo,getMRP_ODR_TYP_DISPLAY_NAME(mrpOdrTyp),getMRP_ODR_TYP_DISPLAY_NAME(mrpDdrTypCsv));
    	                            ErrMsg = emsg.getMessage(locale);
    						    }
    						}
    						if("1".equals(mrpOdrTyp) || "2".equals(mrpOdrTyp)){
    							if(!"1".equals(mrpDdrTypCsv) && !"2".equals(mrpDdrTypCsv)){
        							errorFlg = true;
    						    	ErrNo ="AA00011";
    	                            // ���b�Z�[�W�擾 
    	                            ExpjMessage emsg = new ExpjMessage(ErrNo);
    	                            ErrMsg = emsg.getMessage(locale);
    							}
    						}
    						if("8".equals(mrpOdrTyp)){
    							errorFlg = true;
						    	ErrNo ="AA00011";
	                            // ���b�Z�[�W�擾 
	                            ExpjMessage emsg = new ExpjMessage(ErrNo);
	                            ErrMsg = emsg.getMessage(locale);	
    						}
                        }
						if(errorFlg == true){
                            ErrlineNo = i + 1;        
                            // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);
                            ErrCd = "1";                                            // �G���[�敪
                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
						}
// ��14�݌ɏ��`�F�b�N END====================================================                   }
//// �i�ڎ�z�敪�Ɛ��Ԍv��̊֘A�`�F�b�N
						if("1".equals(mrpOdrTyp) || "2".equals(mrpOdrTyp)){
							if(!"1".equals(mrpDdrTypCsv) && !"2".equals(mrpDdrTypCsv)){
								if(entity.mcheckJOB_ODR_CD.check(conn, struct)){
		                            ErrlineNo = i + 1;        
		                            // �G���[�����s(���ۂ̃G���[�s)
		                            // ������L�[�Z�b�g
		                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
		                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
		                            // �����ꍀ�ڎ擾�Z�b�g
		                            ErrItem = CoreTools.getRBString(tkey, resource);
							    	ErrNo ="AA00011";
		                            // ���b�Z�[�W�擾 
		                            ExpjMessage emsg = new ExpjMessage(ErrNo);
		                            ErrMsg = emsg.getMessage(locale);
		                            ErrCd = "1";                                            // �G���[�敪
		                            // CSV�o��(�G���[)
		                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
		                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
		                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
		                            // �G���[�t���O"true"�ɃZ�b�g
		                            bError = true;
		                            chkHasErr = true;
		                            // �����ׂ֏������ڍs
		                            continue;
								}
								
							}
						}


// ��13�i�ڎ�z�敪�����`�F�b�N START==========================================

// ---------------AA0010:�i�ڃ����e�i���X�����ƃ`�F�b�N�𓯗l�ɂ��Ă���(JAVA�L�q)---------------
                        // �i�ڎ�z�ʍ\���`�F�b�N

                        boolean result3 = true;     // �`�F�b�N���ʊi�[
                        result3 = true;
                        ProductStructureRepository rep = new ProductStructureRepository(conn);

                        // ���q���\�����擾
                        List list = rep.orderDeployment(structCsv.geth_ITEM_CD());
                        // �Ó����m�F
                        for (int Z = 0; Z < list.size(); Z++)
                        {
                            // �q�i�ڎ擾
                            struct.setsetMRP_ITEM_CD((String)list.get(Z));
                            List comList = entity.mselectMRP_ODR_TYP.read(conn, struct);
                            AA0150010Struct comp = (AA0150010Struct)comList.get(0);
                            // ����
                            // �����q�i�ڂ̕i�ڎ�z�敪�̑Ó����m�F=1
                            // �����F1.�q�\����� 2.�Ώۃf�[�^ 3.�q�i�� 4."1"
                            if (checkMRP_ODR_TYP(rep, structCsv, comp, 1) == false) {
                                result3 = false;
                                break;
                            }
                        }

                        // ���e���\�����擾
                        List list2 = rep.reverseDeployment(structCsv.geth_ITEM_CD());
                        // �Ó����m�F
                        for (int X = 0; X < list2.size(); X++)
                        {
                            // �e�i�ڎ擾
                            struct.setsetMRP_ITEM_CD((String)list2.get(X));
                            List parentList = entity.mselectMRP_ODR_TYP.read(conn, struct);
                            AA0150010Struct parent = (AA0150010Struct)parentList.get(0);

                            // ����
                            // �����e�i�ڂ̕i�ڎ�z�敪�̑Ó����m�F=2
                            // �����F1.�e�\����� 2.�Ώۃf�[�^ 3.�e�i�� 4."2"
                            if (checkMRP_ODR_TYP(rep, parent, structCsv, 2) == false) {
                                result3 = false;
                                break;
                            }
                        }

                        // �G���[����
                        if (result3 == false) {
                            ErrlineNo = i + 1;                                      // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=�i�ڎ�z�敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                            // �G���[�敪
                            ErrNo = "AA00010";                                      // �G���[�ԍ�
                            //ErrMsg = "�i�ڎ�z�敪�����i�\�����ɖ������Ă��܂��B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }

// ---------------AA0010:�i�ڃ����e�i���X�����ƃ`�F�b�N�𓯗l�ɂ��Ă���(JAVA�L�q)---------------

// ��13�i�ڎ�z�敪�����`�F�b�N END============================================



// 2008/07/25 SYSCOM �镔 ADD START
                    // �ēx�i�ڏ����擾����
                    struct.setC_setITEM_CD(structCsv.geth_ITEM_CD());
                    List listmitemType = entity.mreadM_ITEM.read(conn, struct);
                    AA0150010Struct itemStruct = (AA0150010Struct)listmitemType.get(0);
// ��24���i�ڂ����H���Ǘ��i�ڃ`�F�b�N START=================================
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    result = entity.mcheckM_PS.check(conn, struct);
                    if (result == true) {
                        if(!itemStruct.getC_MANHOUR_TYP().equals(structCsv.geth_MANHOUR_TYP()) &&
                            ("1").equals(structCsv.geth_MANHOUR_TYP())){
                            if(("1").equals(structCsv.geth_MRP_ODR_TYP())){
                                ErrlineNo = i + 1;                                      // �G���[�����s(���ۂ̃G���[�s)
                                // ������L�[�Z�b�g
                                tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=�H���Ǘ��i�ڋ敪
                                ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                                // �����ꍀ�ڎ擾�Z�b�g
                                ErrItem = CoreTools.getRBString(tkey, resource);

                                ErrCd = "1";                                            // �G���[�敪
                                ErrNo = "AA00180";                                      // �G���[�ԍ�
                                //ErrMsg = "���ʕi�ڂ����ꍇ�A�H���Ǘ��i�ڂւ̕ύX�͂ł��܂���B";      // �G���[���b�Z�[�W
                                // ���b�Z�[�W�擾 
                                ExpjMessage emsg = new ExpjMessage(ErrNo);
                                ErrMsg = emsg.getMessage(locale);

                                // CSV�o��(�G���[)
                                csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
                                // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                                structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                                // �G���[�t���O"true"�ɃZ�b�g
                                bError = true;
                                chkHasErr = true;
                                // �����ׂ֏������ڍs
                                continue;
                            }
                        }
                    }
// ��24���i�ڂ����H���Ǘ��i�ڃ`�F�b�N END===================================

// ��25��z�A�݌ɏ��L���̍H���Ǘ��i�ڃ`�F�b�N START=========================
					boolean bErroJudge = false;		// �G���[�����ڍs���f�p

					// ���v�ʃ`�F�b�N
					struct.setsetT_OD_ITEM_CD(structCsv.geth_ITEM_CD());
					List tOdList = entity.mselectT_OD.read(conn, struct);
					if(tOdList.size() != 0){
						bErroJudge = true;
					}

					// �ۊǋ�ʐ��ԍ݌ɂ̎莝�݌ɐ���0�ȊO�̎��AbErroJudge�t���O�𗧂Ă�
					struct.setsetT_JOB_ODR_CD_ITEM_CD(structCsv.geth_ITEM_CD());
					List tJobOdrCdStockList = entity.mselectT_JOB_ODR_CD_STOCK.read(conn, struct);
					if(tJobOdrCdStockList.size() != 0){
						AA0150010Struct tJobOdrCdStockStruct = (AA0150010Struct)tJobOdrCdStockList.get(0);
						if(!tJobOdrCdStockStruct.getreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY().equals("0")){
							bErroJudge = true;
						}
					}

					// �ۊǋ�ʕi�ڍ݌ɂ̎莝�݌ɐ���0�ȊO�̎��AbErroJudge�t���O�𗧂Ă�
					struct.setsetT_ITEM_STOCK_ITEM_CD(structCsv.geth_ITEM_CD());
					List tItemStockList = entity.mselectT_ITEM_STOCK.read(conn, struct);
					if(tItemStockList.size() != 0){
						AA0150010Struct tItemStockStruct = (AA0150010Struct)tItemStockList.get(0);
						if(!tItemStockStruct.getreadT_ITEM_STOCK_STOCK_ON_HAND_QTY().equals("0")){
							bErroJudge = true;
						}
					}

					if(bErroJudge == true){
                        if(!itemStruct.getC_MANHOUR_TYP().equals(structCsv.geth_MANHOUR_TYP())){

                            ErrlineNo = i + 1;                                      // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=�H���Ǘ��i�ڋ敪
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                            // �G���[�敪
                            ErrNo = "AA00181";                                      // �G���[�ԍ�
                            //ErrMsg = "��z���܂��͍݌ɏ�񂪂��邽�߁A�H���Ǘ��i�ڋ敪��ύX�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    }
// ��25��z�A�݌ɏ��L���̍H���Ǘ��i�ڃ`�F�b�N END===========================

// ��26��ƌn��̍�ƌn����O��敪�`�F�b�N START=============================
					// ��ƌn�񂪑��݂��A����ƌn����O��敪 = 2:�O��̏ꍇ
					result = entity.mcheckM_PROC_GRP.check(conn, struct);
					if (result) {
						// �H���Ǘ��i�ڋ敪�`�F�b�N
						if(!itemStruct.getC_MANHOUR_TYP().equals(structCsv.geth_MANHOUR_TYP()) &&
							("1").equals(structCsv.geth_MANHOUR_TYP())){
							ErrlineNo = i + 1;										// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=�H���Ǘ��i�ڋ敪
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";											// �G���[�敪
							ErrNo = "AA00189";										// �G���[�ԍ�
							//ErrMsg = "��ƌn��ɊO���Ƃ�����ꍇ�A�H���Ǘ��i�ڂւ̕ύX�͂ł��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
					}
// ��26��ƌn��̍�ƌn����O��敪�`�F�b�N END===============================
// 2008/07/25 SYSCOM �镔 ADD END
// ��20�v�ʒP�ʕύX�`�F�b�N START==================================================
						boolean  stockOnHandFlg =false;               //�莝�݌ɐ��ʃ`�F�b�N�t���O
						struct.setsetT_ITEM_STOCK_ITEM_CD(structCsv.geth_ITEM_CD());
						stockOnHandFlg = entity.mcheckT_ITEM_STOCK.check(conn,struct);
						//�i�ڌv�ʒP�ʎ擾
						struct.setsetM_ITEM_ITEM_CD(structCsv.geth_ITEM_CD());
						itemParm = entity.mselectM_ITEM.read(conn,struct);
						String stockUnit = ((AA0150010Struct)itemParm.get(0)).getreadM_ITEM_STOCK_UNIT();
						
						String stockUnitCsv = structCsv.geth_STOCK_UNIT();             //CSV�̌v�ʒP�ʎ擾
						
						if(stockOnHandFlg && null != stockUnit && !"".equals(stockUnit) && stockUnit.equals(stockUnitCsv) == false){
							ErrlineNo = i + 1;										// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.STOCK_UNIT"; // Expj.STOCK_UNIT=�v�ʒP��
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";											// �G���[�敪
							ErrNo = "AA22055";										// �G���[�ԍ�
							//ErrMsg = "�݌ɂ����݂��Ă��邽�߁A�v�ʒP�ʂ�ύX�ł��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						
							
						}

// ��20�v�ʒP�ʕύX�`�F�b�N END====================================================
						
// ��21���b�g�Ǘ��t���O�ύX�`�F�b�N START==================================================
						struct.setsetT_ITEM_STOCK_ITEM_CD(structCsv.geth_ITEM_CD());
						stockOnHandFlg = entity.mcheckT_ITEM_STOCK.check(conn,struct);
						//�i�ڃ��b�g�Ǘ��t���O�擾
						struct.setsetM_ITEM_ITEM_CD(structCsv.geth_ITEM_CD());
						itemParm = entity.mselectM_ITEM.read(conn,struct);
						String lotCtrlFlg = ((AA0150010Struct)itemParm.get(0)).getreadM_ITEM_LOT_CTRL_FLG();
						
						String lotCtrlFlgCsv = structCsv.geth_LOT_CTRL_FLG();             //CSV�̃��b�g�Ǘ��t���O�擾
						if(stockOnHandFlg && lotCtrlFlg != null && !"".equals(lotCtrlFlg) && lotCtrlFlg.equals(lotCtrlFlgCsv) == false){
							ErrlineNo = i + 1;										// �G���[�����s(���ۂ̃G���[�s)
							// ������L�[�Z�b�g
							tkey = "Expj.LOT_CTRL_FLG"; // Expj.LOT_CTRL_FLG=���b�g�Ǘ��t���O
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// �����ꍀ�ڎ擾�Z�b�g
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";											// �G���[�敪
							ErrNo = "AA22056";										// �G���[�ԍ�
							//ErrMsg = "�݌ɂ����݂��Ă��邽�߁A���b�g�Ǘ��t���O��ύX�ł��܂���B";		// �G���[���b�Z�[�W
							// ���b�Z�[�W�擾 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV�o��(�G���[)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_CTRL_FLG );
							// w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// �G���[�t���O"true"�ɃZ�b�g
							bError = true;
							chkHasErr = true;
							// �����ׂ֏������ڍs
							continue;
						}
// ��21���b�g�Ǘ��t���O�ύX�`�F�b�N END====================================================						
                    }       //�X�V���̂݃`�F�b�N end if
                }   //�o�^OR�X�V���`�F�b�N end if

                // ���폜���W�I�{�^�����I�����ꂽ�Ƃ��̂݃`�F�b�N���s���B(���폜���̂�)��
                if (("true").equals(_save_struct.getrdoDelete()) == true)
                {
                    struct.setsetT_OD_ITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F���v��
                    List list1 = entity.mselectT_OD.read(conn, struct);
                    if (list1.size() != 0) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00012";                              // �G���[�ԍ�
                            //ErrMsg = "���v�ʂ����݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    struct.setsetT_JOB_ODR_ITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F���Ԍv��
                    List list2 = entity.mselectT_JOB_ODR.read(conn, struct);
                    if (list2.size() != 0) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00013";                              // �G���[�ԍ�
                            //ErrMsg = "���Ԍv�悪���݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }

                    struct.setsetM_PS_ITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F���i�\��
                    List list3 = entity.mselectM_PS.read(conn, struct);
                    if (list3.size() != 0) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00014";                              // �G���[�ԍ�
                            //ErrMsg = "���i�\�������݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }

                    struct.setsetT_ITEM_STOCK_ITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�ۊǋ�ʕi�ڍ݌�
                    List list4 = entity.mselectT_ITEM_STOCK.read(conn, struct);
                    if (list4.size() != 0) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00015";                              // �G���[�ԍ�
                            //ErrMsg = "�ۊǋ�ʕi�ڍ݌ɂ����݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }

                    struct.setsetT_JOB_ODR_CD_ITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�ۊǋ搻�ʔԍ݌�
                    List list5 = entity.mselectT_JOB_ODR_CD_STOCK.read(conn, struct);
                    if (list5.size() != 0) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00016";                              // �G���[�ԍ�
                            //ErrMsg = "�ۊǋ�ʐ��ԍ݌ɂ����݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }

                    struct.setsetT_OPR_RSLT_ITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F��Ǝ���
                    List list6 = entity.mselectT_OPR_RSLT.read(conn, struct);
                    if (list6.size() != 0) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00017";                              // �G���[�ԍ�
                            //ErrMsg = "��Ǝ��т����݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }

                    struct.setsetT_RLSD_P_ITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�����c
                    List list7 = entity.mselectT_RLSD_PUCH_ODR.read(conn, struct);
                    if (list7.size() != 0) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00018";                              // �G���[�ԍ�
                            //ErrMsg = "�����c�����݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }

                    struct.setsetT_WORK_IN_ITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F��ƌn��ʎd�|
                    List list8 = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, struct);
                    if (list8.size() != 0) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00019";                              // �G���[�ԍ�
                            //ErrMsg = "��ƌn��ʎd�|�����݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result9 = true;     // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�L���x������
                    result9 = entity.mcheckT_PAST_ONEROUS_CONS.check(conn, struct);
                    if (result9) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00999";                              // �G���[�ԍ�
                            //ErrMsg = "�L���x�����������݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result10 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�w���ԕi����
                    result10 = entity.mcheckT_PUCH_ODR_RTN_RSLT.check(conn, struct);
                    if (result10) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA01000";                              // �G���[�ԍ�
                            //ErrMsg = "�w���ԕi���т����݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result11 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�i�ڕʓ��ɐ�ۊǋ�
                    result11 = entity.mcheckM_ITEM_RCV_WH.check(conn, struct);
                    if (result11) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00998";                              // �G���[�ԍ�
                            //ErrMsg = "�i�ڕʓ��ɐ�ۊǋ悪���݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result12 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁FMPS���b�N
                    result12 = entity.mcheckSYS_MPS_LOCK.check(conn, struct);
                    if (result12) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00162";                              // �G���[�ԍ�
                            //ErrMsg = "MPS���b�N�����݂���̂ō폜�ł��܂���B";       // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result13 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�o�׎w��
                    result13 = entity.mcheckT_SHIP_ODR.check(conn, struct);
                    if (result13) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00163";                              // �G���[�ԍ�
                            //ErrMsg = "�o�׎w�������݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result14 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�o��������
                    result14 = entity.mcheckT_OUTPUT_RSLT.check(conn, struct);
                    if (result14) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00078";                              // �G���[�ԍ�
                            //ErrMsg = "�o�������т����݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result15 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�i�ڕʎd
                    result15 = entity.mcheckT_WORK_IN_PROC_BY_ITEM.check(conn, struct);
                    if (result15) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00164";                              // �G���[�ԍ�
                            //ErrMsg = "�i�ڕʎd�����݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result16 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F���Ԉ���
                    result16 = entity.mcheckT_JOB_ODR_ALC.check(conn, struct);
                    if (result16) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00165";                              // �G���[�ԍ�
                            //ErrMsg = "���Ԉ��������݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result17 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�ϑ��݌�
                    result17 = entity.mcheckT_TRANSPORT_STOCK.check(conn, struct);
                    if (result17) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00166";                              // �G���[�ԍ�
                            //ErrMsg = "�ϑ��݌ɂ����݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result18 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�w���i�}�X�^
                    result18 = entity.mcheckM_CS_PUCH.check(conn, struct);
                    if (result18) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00167";                              // �G���[�ԍ�
                            //ErrMsg = "�w���i�}�X�^�����݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result19 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�i�ڕʉ��H��
                    result19 = entity.mcheckT_ITEM_PROC_COST.check(conn, struct);
                    if (result19) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00168";                              // �G���[�ԍ�
                            //ErrMsg = "�i�ڕʉ��H����݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result20 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�i�ڕʉ��H��}�X�^
                    result20 = entity.mcheckM_ITEM_PROC_COST.check(conn, struct);
                    if (result20) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00169";                              // �G���[�ԍ�
                            //ErrMsg = "�i�ڕʉ��H��}�X�^�����݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result21 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�i�ڕʌ���
                    result21 = entity.mcheckT_ITEM_COST.check(conn, struct);
                    if (result21) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00170";                              // �G���[�ԍ�
                            //ErrMsg = "�i�ڕʌ��������݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    boolean result22 = true;        // �`�F�b�N���ʊi�[
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // �Q�Ɛ��������؁F�ۊǋ�ʕi�ڒI��
                    result22 = entity.mcheckT_ITEM_INV.check(conn, struct);
                    if (result22) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00171";                              // �G���[�ԍ�
                            //ErrMsg = "�ۊǋ�ʕi�ڒI�������݂���̂ō폜�ł��܂���B";        // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                    }
                    
                    // �C���X�g�[���I�v�V�����̑��݊m�F
                    boolean result27 = entity.mcheckSYS_INSTALL_OPTIONS.check(conn, struct);
                    if(result27 == false){
                        boolean result23 = true;        // �`�F�b�N���ʊi�[
                        struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                        // �Q�Ɛ��������؁F���i�}�X�^
                        result23 = entity.mcheckM_ITEM_SPEC.check(conn, struct);
                        if (result23) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00173";                              // �G���[�ԍ�
                            //ErrMsg = "���i�}�X�^�����݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        
                        boolean result24 = true;        // �`�F�b�N���ʊi�[
                        struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                        // �Q�Ɛ��������؁F���i�P���}�X�^
                        result24 = entity.mcheckM_UNIT_COST.check(conn, struct);
                        if (result24) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA00174";                              // �G���[�ԍ�
                            //ErrMsg = "���i�P���}�X�^�����݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    } else {
                    	boolean result25 = true;        // �`�F�b�N���ʊi�[
                        struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                        // �Q�Ɛ��������؁F�̔��P���}�X�^
                        result25 = entity.mcheckM_SALES_UNIT_COST.check(conn, struct);
                        if (result25) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA34036";                              // �G���[�ԍ�
                            //ErrMsg = "�̔��P���}�X�^�����݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                        
                        boolean result26 = true;        // �`�F�b�N���ʊi�[
                        struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                        // �Q�Ɛ��������؁F���Ӑ�i�ڃ}�X�^
                        result26 = entity.mcheckM_CUST_ITEM.check(conn, struct);
                        if (result26) {
                            ErrlineNo = i + 1;                              // �G���[�����s(���ۂ̃G���[�s)
                            // ������L�[�Z�b�g
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=�i�ڔԍ�
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // �����ꍀ�ڎ擾�Z�b�g
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // �G���[�敪
                            ErrNo = "AA34101";                              // �G���[�ԍ�
                            //ErrMsg = "���Ӑ�i�ڃ}�X�^�����݂���̂ō폜�ł��܂���B";      // �G���[���b�Z�[�W
                            // ���b�Z�[�W�擾 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV�o��(�G���[)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG�ϐ��ɃG���[����ޔ��B
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // �G���[�t���O"true"�ɃZ�b�g
                            bError = true;
                            chkHasErr = true;
                            // �����ׂ֏������ڍs
                            continue;
                        }
                    	
                    }
                }   //�폜�`�F�b�N end if

// �o�^/�X�V���`�F�b�N END-------------------------------------------------------------------------------------------
                // �`�F�b�N�G���[�ƂȂ��Ă��Ȃ��ꍇ�A���탌�R�[�h�Ƃ��ăJ�E���g
                if(bError != true)
                {
                    intSuccessCount++;
                }
                ////////////////////////////////////////////////////////////////////////////////////
                // �ʃ`�F�b�N�����I��
                ////////////////////////////////////////////////////////////////////////////////////
            }  //for end

            // �`�F�b�N���ʏ���(�G���[���X�g�T�C�Y�̎擾)
            if(getListsize() > 0 && chkHasErr)
            {
                bSuccess = false;
            }


            // �G���[�f�[�^���Ȃ��ꍇ�A�`�F�b�N������INFO�ɕ\������B(�`�F�b�N�{�b�N�X(�`�F�b�N�̂ݍs��)���`�F�b�N�̏ꍇ)
            if (("true").equals(_save_struct.getDO_CHK()) == true){
                    // �G���[�f�[�^�L��̂��ߍX�V���Ȃ������ꍇ�̃��b�Z�[�W�\��
                    ExpjMessage emsg = new ExpjMessage( "AA01517",""+intSuccessCount,""+intWarningCount,""+(intCsvDataCount - intSuccessCount-intWarningCtByData));
                    msgStruct.addInfo( emsg );
                    sysLog.config(emsg, getsysUSER_CD());
            }else{
                    // �G���[�f�[�^���ݎ��A��ʲ�̫Ұ��݂֏o��
                    if(bSuccess != true)
                    {
                        // �G���[����������΃��b�Z�[�W�\������
                        // �Ȃ���΃��X�g(���[�j���O)�݂̂Ɣ��肷��B
                        if ((intCsvDataCount - intSuccessCount) > 0)
                        {
                            // �G���[�f�[�^�L��̂��ߍX�V���Ȃ������ꍇ�̃��b�Z�[�W�\��
                            ExpjMessage emsg = new ExpjMessage( "AA01516",""+intSuccessCount,""+intWarningCount,""+(intCsvDataCount - intSuccessCount-intWarningCtByData));
                            msgStruct.addError( emsg );
                            sysLog.severe(emsg, getsysUSER_CD());
                        }
                    } else {
                        // �G���[�E���[�j���O���Ȃ��ꍇ
                        if(intWarningCount == 0){
                            ExpjMessage emsg = new ExpjMessage( "AA01514", ""+intSuccessCount);
                            msgStruct.addInfo( emsg );
                            sysLog.config(emsg, getsysUSER_CD());
                        }else{
                            ExpjMessage emsg = new ExpjMessage( "AA01515", ""+intSuccessCount,""+intWarningCount);
                            msgStruct.addWarn( emsg );
                            sysLog.warning(emsg, getsysUSER_CD());
                        }
                    }
                }

        }catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
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
            String CsvCancelFileName = pc.getString("ITEM_CANCEL");
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

        boolean bSuccess = false;   // ���������t���O������
        boolean aSuccess = true;    // ���������t���O������(���b�Z�[�W)
        boolean bDBUpdate = false;  // DB�X�V���t���O������
        boolean bWrite = false; // �����t�@�C��
        int intCsvDataCount = 0;    // �Ώۃf�[�^����
        String strUserId = "";      // �������O�o�͗p(���[�U�[ID)
        String strSyoriKbn = "";    // �������O�o�͗p(�����敪)
        String strDataKbn = "";     // �������O�o�͗p(�ύX�f�[�^�敪)

        // �������O��struct����ޔ�
        AA0150010Struct structCopy = new AA0150010Struct();
        structCopy.copy(struct);
        try
        {
            AA0150010Struct structCsv;
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
                struct.copy((AA0150010Struct)listCsv.get(i));
                struct.setCANCEL_FILE(structCopy.getCANCEL_FILE());
                structCsv = (AA0150010Struct)listCsv.get(i);
                strUserId = "";     // �������O�o�͗p������(���[�U�[ID)
                strSyoriKbn = "";   // �������O�o�͗p������(�����敪)
                strDataKbn = "";    // �������O�o�͗p������(�ύX�f�[�^�敪)

                // �e��ʂ̃��W�I�{�^����1:�o�^�̏ꍇ�̏���
                if (("true").equals(_save_struct.getrdoInsert()) == true)
                {
                    // ���i�ڃ}�X�^�o�^������
                    entity.minsertM_ITEM.create(conn, struct);

                    if(structCsv.geth_WH_CD() != null && !"".equals(structCsv.geth_WH_CD())){
                    	// INSERT�L�[�Z�b�g
	                    struct.setsetM_WH_ITEM_CD(structCsv.geth_ITEM_CD());        // �i�ڔԍ�
	                    struct.setsetM_WH_WH_CD(structCsv.geth_WH_CD());            // �ۊǋ�R�[�h
	                    struct.setsetM_WH_PLANT_CD(getsysPLANT_CD());               // ���O�C�����[�U�[�H��R�[�h
	                    struct.setsetM_WH_WH_REF_NO("1");                           // �i�ڕʕۊǋ��D�揇��
	
	                    // ���i�ڕʕۊǐ�D�揇�ʓo�^������
	                    entity.minsertM_WH_PRIORITY.create(conn, struct);
                    }

                    // *�������O�o�͏���*
                    strUserId = getsysUSER_CD();            // ���[�U�[ID�Z�b�g
                    strSyoriKbn = "1";                      // �����敪�Z�b�g(1:�o�^)
                    strDataKbn = "2";                       // �ύX�f�[�^�敪�Z�b�g
                    // ����CSV�o�͏���(����:�Ώۍs�A�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�f�[�^�敪)
                    csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn ,bWrite);
                    bWrite = true;
                }
                // �e��ʂ̃��W�I�{�^����2:�ύX�̏ꍇ�̏���
                if (("true").equals(_save_struct.getrdoUpdate()) == true)
                {
                    // *�������O�o�͏���*
                    strUserId = getsysUSER_CD();            // ���[�U�[ID�Z�b�g
                    strSyoriKbn = "2";                      // �����敪�Z�b�g(2:�ύX)
                    strDataKbn = "1";                       // �ύX�f�[�^�敪�Z�b�g
                    // ����CSV�o�͏���(����:�Ώۍs�A�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�f�[�^�敪)
                    csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn ,bWrite);
                    bWrite = true;

                    // ���i�ڃ}�X�^�X�V������
                    entity.mupdateM_ITEM.update(conn, struct);
                    strDataKbn = "2";                       // �ύX�f�[�^�敪�Z�b�g
                    // ����CSV�o�͏���(����:�Ώۍs�A�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�f�[�^�敪)
                    csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn ,bWrite);
                    bWrite = true;
                }
                // �e��ʂ̃��W�I�{�^����3:�폜�̏ꍇ�̏���
                if (("true").equals(_save_struct.getrdoDelete()) == true)
                {
                    // *�������O�o�͏���*
                    strUserId = getsysUSER_CD();            // ���[�U�[ID�Z�b�g
                    strSyoriKbn = "3";                      // �����敪�Z�b�g(3:�폜)
                    strDataKbn = "1";                       // �ύX�f�[�^�敪�Z�b�g
                    // ����CSV�o�͏���(����:�Ώۍs�A�Ώۃf�[�^�A���[�U�[ID�A�����敪�A�f�[�^�敪)
                    csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn ,bWrite);
                    bWrite = true;
                    // ���i�ڃ}�X�^�폜������
                    entity.mdeleteM_ITEM.delete(conn, struct);
                }
                    
            } // Endfor()

            // �R�~�b�g���s
            conn.commit();

            // DB�X�V���t���OOFF
            bDBUpdate = false;

            // ���������t���O�ݒ�
            bSuccess = true;
        } catch(SQLException e) {
            logMessage = "M_ITEM.ITEM_CD:" +  struct.geth_ITEM_CD();
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

                // �X�V���s�̃��b�Z�[�W�\��
                ExpjMessage emsg = new ExpjMessage( "AH00042", ""+intCsvDataCount, "0","0");
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
            }

            if(aSuccess == true)
            {
                if(bSuccess == true)
                {
                    // ����I���̃��b�Z�[�W�\��
                    //ExpjMessage emsg = new ExpjMessage( "AH60005", ""+intCsvDataCount, "0");
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
    *   @param    strRangeFlg  "1":99999999999999.9999 �` 0.0001
    *                          "2":99999.9999 �` 0.0001
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

//---------- ���͊֘A�`�F�b�N�̏��� END---------------------------------------------------

//---------- �i�ڎ�z�敪�\������ START---------------------------------------------------
    /**
     * �i�ڎ�z�敪�ʍ\���`�F�b�N
     * @param repository ���i�\�����|�W�g��
     * @param parent �e�i�ڔԍ�
     * @param comp �q�i�ڔԍ�
     * @return true�FOK  false:NG
    */
    private boolean checkMRP_ODR_TYP(ProductStructureRepository repository,
                                        AA0150010Struct parent, AA0150010Struct comp, int ChkTaisyo)
        throws SQLException, FoundationException
    {
        Integer parent_typ ;
        Integer comp_typ ;
        String parItem_cd = "";
        String comItem_cd = "";


        // �i�ڎ�z�敪:�q�i��(1)�A�e(2)�̐U�蕪�� int aCnt = Integer.parseInt(CsvCnount);
        if (ChkTaisyo == 1)
        {
            parent_typ = Integer.valueOf(parent.geth_MRP_ODR_TYP());
            comp_typ = comp.getreadMRP_ODR_TYP();
            parItem_cd = parent.geth_ITEM_CD();
            comItem_cd = comp.getreadMRP_ITEM_CD();
        } else {
            parent_typ = parent.getreadMRP_ODR_TYP();
            comp_typ = Integer.valueOf(comp.geth_MRP_ODR_TYP());
            parItem_cd = parent.getreadMRP_ITEM_CD();
            comItem_cd = comp.geth_ITEM_CD();
        }
        //  �e�i�� �C�}�j���A����z�i�ځA�D���b�g��z�i�ځA�E��ʎ�z�i�ځA�F�����_��z�i��
        if(parent_typ.intValue() == 4 || parent_typ.intValue() == 5 ||
            parent_typ.intValue() == 6 || parent_typ.intValue() == 7){

            //  �q�i�� �@�ʕi�� �A�݌Ɉ����^�ʕi��
            if(comp_typ.intValue() == 1 || comp_typ.intValue() == 2) return false;
        }

        ArrayList itemList = null;
        // �e�i�� �G�[���i��
        if(parent_typ.intValue() == 8)
        {
            // �q�i�� �G�[���i��
            if(comp_typ.intValue() == 8) return false;
            else if(comp_typ.intValue() == 4 || comp_typ.intValue() == 5 ||
                    comp_typ.intValue() == 6 || comp_typ.intValue() == 7) return true;
            else{
                // �e�i�ڂ��q�i�ڂƂȂ�\�����̐e�i�ڎ擾

                itemList = repository.reverseDeployment(parItem_cd);

                AA0150010Struct workStruct = new AA0150010Struct();
                for(int i = 0; i < itemList.size(); i++)
                {
                    // �擾�����e�i�ڂ̎�z�敪�擾
                    workStruct.setsetMRP_ITEM_CD((String)itemList.get(i));
                    List parentList = entity.mselectMRP_ODR_TYP.read(conn, workStruct);
                    Integer typ = ((AA0150010Struct)parentList.get(0)).getreadMRP_ODR_TYP();
                    
                    if(typ.intValue() == 4 || typ.intValue() == 5 ||
                        typ.intValue() == 6 || typ.intValue() == 7) return false;
                }
            }
        }

        // �q�i�� �G�[���i��
        if(comp_typ.intValue() == 8)
        {
            // �e�i�� �G�[���i��
            if(parent_typ.intValue() == 8) return false;
            else if(parent_typ.intValue() == 1 || parent_typ.intValue() == 2) return true;
            else{
                // �q�i�ڂ��e�i�ڂƂȂ�\�����̎q�i�ڎ擾
                itemList = repository.orderDeployment(comItem_cd);
                AA0150010Struct workStruct = new AA0150010Struct();
                for(int i = 0; i < itemList.size(); i++)
                {
                    // �擾�����q�i�ڂ̎�z�敪�擾
                    workStruct.setsetMRP_ITEM_CD((String)itemList.get(i));
                    List compList = entity.mselectMRP_ODR_TYP.read(conn, workStruct);
                    Integer typ = ((AA0150010Struct)compList.get(0)).getreadMRP_ODR_TYP();
                    
                    if(typ.intValue() == 1 || typ.intValue() == 2 ) return false;
                }
            }
        }

        return true;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
        // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

        // ���X�g�N���A
        if(null == list){
          list = new ArrayList();
      }else{
        list.clear();
      }

        // �e��ʂ�struct��ޔ�
        saveParentStruct();

        // �T�u1��ʏ�����
        struct.clear();

                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
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
        if (("true").equals(_save_struct.getDO_CHK()) != true && bError != true)
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
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
            controlclear();
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlclear");
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
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
      csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
    
      List csvList = new ArrayList();
      //CSV���̍쐬
      // �^�C�g�����ݒ�
      String csvTitle[] = {
        "Expj.Cmt3094" ,         // �G���[�ӏ�
        "Expj.Cmt3095" ,         // �G���[�敪
        "Expj.Cmt3096" ,         // �i�ڔԍ�
        "Expj.Cmt3097" ,         // �G���[���ږ�
        "Expj.Cmt3098"           // �G���[���e
           };
      // CSV���X�g�ɓ����
      csvList.add(csvTitle);
      
      AA0150010Struct workStruct;
      // ���ד��e�ݒ�
      for(int i=0; i<getListsize() ;i++){
       workStruct = getListvalue(i);
       String csvStr [] = new String[csvTitle.length];
       csvStr[0] = workStruct.getERROR_IN();// �G���[�ӏ�
       csvStr[1] = workStruct.getERR_TYP();// �G���[�敪
       csvStr[2] = workStruct.getOUT_ITEM_CD();// �i�ڔԍ�
       csvStr[3] = workStruct.getERR_CTR_NM();// �G���[���ږ�
       csvStr[4] = workStruct.getERR_INFO();// �G���[���e
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
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
            // �N���A
          controlclear();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

        // �N���A
        controlclear();

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
            try{
                ComboBox comboController = new ComboBox(conn, sysUSER_CD);
                // �R���v�{�b�N�X�̓��e������Ή�
                COMBO_ERR_TYP = comboController.getData("ERR_TYP");
            } catch (SQLException e) {
                e.printStackTrace();
                ExpjMessage emsg = new ExpjMessage("ZZ01106");
                sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
                ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
                throw ee;
            }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Close") ) {
				controlClose();
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
//			throw new FoundationException("AA0150010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0150010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0150010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0150010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0150010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
            // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0150010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0150010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0150010Entity entity;
	protected AA0150010Struct struct;
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

		entity = new AA0150010Entity();
		struct = new AA0150010Struct();

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
	 * AA0150010�N���X�̕W���R���X�g���N�^
	 */
	public AA0150010Control() throws BusinessProcessException, FoundationException
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
				AA0150010Struct key = (AA0150010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("DO_CHK") && key.getDO_CHK() != null) {
					msgKey.setKeyValue("DO_CHK", key.getDO_CHK());
				}
				if(msgKeyType.containsKeyColumn("ERROR_IN") && key.getERROR_IN() != null) {
					msgKey.setKeyValue("ERROR_IN", key.getERROR_IN());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ERR_CTR_NM") && key.getERR_CTR_NM() != null) {
					msgKey.setKeyValue("ERR_CTR_NM", key.getERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("ERR_INFO") && key.getERR_INFO() != null) {
					msgKey.setKeyValue("ERR_INFO", key.getERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("h_SYORI_KUBUN") && key.geth_SYORI_KUBUN() != null) {
					msgKey.setKeyValue("h_SYORI_KUBUN", key.geth_SYORI_KUBUN());
				}
				if(msgKeyType.containsKeyColumn("h_WH_CD") && key.geth_WH_CD() != null) {
					msgKey.setKeyValue("h_WH_CD", key.geth_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("CANCEL_FILE") && key.getCANCEL_FILE() != null) {
					msgKey.setKeyValue("CANCEL_FILE", key.getCANCEL_FILE());
				}
				if(msgKeyType.containsKeyColumn("JUDGMENT_TXT") && key.getJUDGMENT_TXT() != null) {
					msgKey.setKeyValue("JUDGMENT_TXT", key.getJUDGMENT_TXT());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("ERR_TYP") && key.getERR_TYP() != null) {
					msgKey.setKeyValue("ERR_TYP", key.getERR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("OUT_ITEM_CD") && key.getOUT_ITEM_CD() != null) {
					msgKey.setKeyValue("OUT_ITEM_CD", key.getOUT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readNAME") && key.getreadNAME() != null) {
					msgKey.setKeyValue("readNAME", key.getreadNAME());
				}
				if(msgKeyType.containsKeyColumn("readVALUE") && key.getreadVALUE() != null) {
					msgKey.setKeyValue("readVALUE", key.getreadVALUE());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
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
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_NAME") && key.geth_ITEM_NAME() != null) {
					msgKey.setKeyValue("h_ITEM_NAME", key.geth_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_DRAW_CD") && key.geth_DRAW_CD() != null) {
					msgKey.setKeyValue("h_DRAW_CD", key.geth_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("h_SPEC") && key.geth_SPEC() != null) {
					msgKey.setKeyValue("h_SPEC", key.geth_SPEC());
				}
				if(msgKeyType.containsKeyColumn("h_HIGH_LEVEL_NO") && key.geth_HIGH_LEVEL_NO() != null) {
					msgKey.setKeyValue("h_HIGH_LEVEL_NO", key.geth_HIGH_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP") && key.geth_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("h_MRP_ODR_TYP", key.geth_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_OUTSIDE_TYP") && key.geth_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("h_OUTSIDE_TYP", key.geth_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_STOCK_UNIT_FLG") && key.geth_STOCK_UNIT_FLG() != null) {
					msgKey.setKeyValue("h_STOCK_UNIT_FLG", key.geth_STOCK_UNIT_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_STOCK_UNIT") && key.geth_STOCK_UNIT() != null) {
					msgKey.setKeyValue("h_STOCK_UNIT", key.geth_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_PKG_UNIT") && key.geth_PKG_UNIT() != null) {
					msgKey.setKeyValue("h_PKG_UNIT", key.geth_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_PKG_UNIT_QTY") && key.geth_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("h_PKG_UNIT_QTY", key.geth_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_LT") && key.geth_ODR_LT() != null) {
					msgKey.setKeyValue("h_ODR_LT", key.geth_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("h_FIXED_LT") && key.geth_FIXED_LT() != null) {
					msgKey.setKeyValue("h_FIXED_LT", key.geth_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("h_PROP_LT") && key.geth_PROP_LT() != null) {
					msgKey.setKeyValue("h_PROP_LT", key.geth_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("h_SAFETY_LT") && key.geth_SAFETY_LT() != null) {
					msgKey.setKeyValue("h_SAFETY_LT", key.geth_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_LT") && key.geth_ISSUE_LT() != null) {
					msgKey.setKeyValue("h_ISSUE_LT", key.geth_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("h_PROP_LOT_SIZE") && key.geth_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("h_PROP_LOT_SIZE", key.geth_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_SPOIL") && key.geth_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("h_ITEM_SPOIL", key.geth_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("h_SAFETY_STOCK") && key.geth_SAFETY_STOCK() != null) {
					msgKey.setKeyValue("h_SAFETY_STOCK", key.geth_SAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_SIZING_TYP") && key.geth_LOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("h_LOT_SIZING_TYP", key.geth_LOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MAX_PERIOD") && key.geth_MAX_PERIOD() != null) {
					msgKey.setKeyValue("h_MAX_PERIOD", key.geth_MAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("h_MAX_ODR_QTY") && key.geth_MAX_ODR_QTY() != null) {
					msgKey.setKeyValue("h_MAX_ODR_QTY", key.geth_MAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_POINT") && key.geth_ODR_POINT() != null) {
					msgKey.setKeyValue("h_ODR_POINT", key.geth_ODR_POINT());
				}
				if(msgKeyType.containsKeyColumn("h_FIXED_ODR_QTY") && key.geth_FIXED_ODR_QTY() != null) {
					msgKey.setKeyValue("h_FIXED_ODR_QTY", key.geth_FIXED_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_MIN_ODR_QTY") && key.geth_MIN_ODR_QTY() != null) {
					msgKey.setKeyValue("h_MIN_ODR_QTY", key.geth_MIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_MUL_ODR_QTY") && key.geth_MUL_ODR_QTY() != null) {
					msgKey.setKeyValue("h_MUL_ODR_QTY", key.geth_MUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_TYP") && key.geth_ISSUE_TYP() != null) {
					msgKey.setKeyValue("h_ISSUE_TYP", key.geth_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MPS_FLG") && key.geth_MPS_FLG() != null) {
					msgKey.setKeyValue("h_MPS_FLG", key.geth_MPS_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_ACPT_INSPC_TYP") && key.geth_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("h_ACPT_INSPC_TYP", key.geth_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PRODUCT_TYP") && key.geth_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("h_PRODUCT_TYP", key.geth_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_CLASIFICATION_CD") && key.geth_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("h_CLASIFICATION_CD", key.geth_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_WEIGHT") && key.geth_UNIT_WEIGHT() != null) {
					msgKey.setKeyValue("h_UNIT_WEIGHT", key.geth_UNIT_WEIGHT());
				}
				if(msgKeyType.containsKeyColumn("h_ABC_TYP") && key.geth_ABC_TYP() != null) {
					msgKey.setKeyValue("h_ABC_TYP", key.geth_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_RSLT_TYP") && key.geth_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("h_OPR_RSLT_TYP", key.geth_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_SPL_ITEM_TYP") && key.geth_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("h_SPL_ITEM_TYP", key.geth_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CD") && key.geth_TAX_CD() != null) {
					msgKey.setKeyValue("h_TAX_CD", key.geth_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("h_CAL_NO") && key.geth_CAL_NO() != null) {
					msgKey.setKeyValue("h_CAL_NO", key.geth_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP") && key.geth_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("h_MANHOUR_TYP", key.geth_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_DEPO_TYP") && key.geth_DEPO_TYP() != null) {
					msgKey.setKeyValue("h_DEPO_TYP", key.geth_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG") && key.geth_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_LOT_CTRL_FLG", key.geth_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP") && key.geth_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("h_LOT_NUMBERING_TYP", key.geth_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_YEAR") && key.geth_BEST_BEFORE_YEAR() != null) {
					msgKey.setKeyValue("h_BEST_BEFORE_YEAR", key.geth_BEST_BEFORE_YEAR());
				}
				if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_MONTH") && key.geth_BEST_BEFORE_MONTH() != null) {
					msgKey.setKeyValue("h_BEST_BEFORE_MONTH", key.geth_BEST_BEFORE_MONTH());
				}
				if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_DAY") && key.geth_BEST_BEFORE_DAY() != null) {
					msgKey.setKeyValue("h_BEST_BEFORE_DAY", key.geth_BEST_BEFORE_DAY());
				}
				if(msgKeyType.containsKeyColumn("h_DEPT_CD") && key.geth_DEPT_CD() != null) {
					msgKey.setKeyValue("h_DEPT_CD", key.geth_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PJ_CD") && key.geth_PJ_CD() != null) {
					msgKey.setKeyValue("h_PJ_CD", key.geth_PJ_CD());
				}
				if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_1") && key.geth_SEG_CONTENTS_1() != null) {
					msgKey.setKeyValue("h_SEG_CONTENTS_1", key.geth_SEG_CONTENTS_1());
				}
				if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_2") && key.geth_SEG_CONTENTS_2() != null) {
					msgKey.setKeyValue("h_SEG_CONTENTS_2", key.geth_SEG_CONTENTS_2());
				}
				if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_3") && key.geth_SEG_CONTENTS_3() != null) {
					msgKey.setKeyValue("h_SEG_CONTENTS_3", key.geth_SEG_CONTENTS_3());
				}
				if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_4") && key.geth_SEG_CONTENTS_4() != null) {
					msgKey.setKeyValue("h_SEG_CONTENTS_4", key.geth_SEG_CONTENTS_4());
				}
				if(msgKeyType.containsKeyColumn("h_REMARK1") && key.geth_REMARK1() != null) {
					msgKey.setKeyValue("h_REMARK1", key.geth_REMARK1());
				}
				if(msgKeyType.containsKeyColumn("h_REMARK2") && key.geth_REMARK2() != null) {
					msgKey.setKeyValue("h_REMARK2", key.geth_REMARK2());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_01_CD") && key.geth_ITEM_CLASS_01_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_01_CD", key.geth_ITEM_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_02_CD") && key.geth_ITEM_CLASS_02_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_02_CD", key.geth_ITEM_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_03_CD") && key.geth_ITEM_CLASS_03_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_03_CD", key.geth_ITEM_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_04_CD") && key.geth_ITEM_CLASS_04_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_04_CD", key.geth_ITEM_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_05_CD") && key.geth_ITEM_CLASS_05_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_05_CD", key.geth_ITEM_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_06_CD") && key.geth_ITEM_CLASS_06_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_06_CD", key.geth_ITEM_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_07_CD") && key.geth_ITEM_CLASS_07_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_07_CD", key.geth_ITEM_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_08_CD") && key.geth_ITEM_CLASS_08_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_08_CD", key.geth_ITEM_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_09_CD") && key.geth_ITEM_CLASS_09_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_09_CD", key.geth_ITEM_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_10_CD") && key.geth_ITEM_CLASS_10_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_10_CD", key.geth_ITEM_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_11_CD") && key.geth_ITEM_CLASS_11_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_11_CD", key.geth_ITEM_CLASS_11_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_12_CD") && key.geth_ITEM_CLASS_12_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_12_CD", key.geth_ITEM_CLASS_12_CD());
				}
				if(msgKeyType.containsKeyColumn("readTAX_CD") && key.getreadTAX_CD() != null) {
					msgKey.setKeyValue("readTAX_CD", key.getreadTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("setTAXCD") && key.getsetTAXCD() != null) {
					msgKey.setKeyValue("setTAXCD", key.getsetTAXCD());
				}
				if(msgKeyType.containsKeyColumn("readITEM_CD") && key.getreadITEM_CD() != null) {
					msgKey.setKeyValue("readITEM_CD", key.getreadITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setITEM_CD") && key.getsetITEM_CD() != null) {
					msgKey.setKeyValue("setITEM_CD", key.getsetITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readVEND_CD") && key.getreadVEND_CD() != null) {
					msgKey.setKeyValue("readVEND_CD", key.getreadVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("setVEND_CD") && key.getsetVEND_CD() != null) {
					msgKey.setKeyValue("setVEND_CD", key.getsetVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("readPLANT_CD") && key.getreadPLANT_CD() != null) {
					msgKey.setKeyValue("readPLANT_CD", key.getreadPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("readSUM_PROP_LT") && key.getreadSUM_PROP_LT() != null) {
					msgKey.setKeyValue("readSUM_PROP_LT", key.getreadSUM_PROP_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("readSUM_FIXED_LT") && key.getreadSUM_FIXED_LT() != null) {
					msgKey.setKeyValue("readSUM_FIXED_LT", key.getreadSUM_FIXED_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("readMRP_ITEM_CD") && key.getreadMRP_ITEM_CD() != null) {
					msgKey.setKeyValue("readMRP_ITEM_CD", key.getreadMRP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readMRP_ODR_TYP") && key.getreadMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("readMRP_ODR_TYP", key.getreadMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("setMRP_ITEM_CD") && key.getsetMRP_ITEM_CD() != null) {
					msgKey.setKeyValue("setMRP_ITEM_CD", key.getsetMRP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readMRP_ODR_ITEM_CD") && key.getreadMRP_ODR_ITEM_CD() != null) {
					msgKey.setKeyValue("readMRP_ODR_ITEM_CD", key.getreadMRP_ODR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setMRP_ODR_ITEM_CD") && key.getsetMRP_ODR_ITEM_CD() != null) {
					msgKey.setKeyValue("setMRP_ODR_ITEM_CD", key.getsetMRP_ODR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CD") && key.getC_ITEM_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CD", key.getC_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_NAME") && key.getC_ITEM_NAME() != null) {
					msgKey.setKeyValue("C_ITEM_NAME", key.getC_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("C_DRAW_CD") && key.getC_DRAW_CD() != null) {
					msgKey.setKeyValue("C_DRAW_CD", key.getC_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("C_SPEC") && key.getC_SPEC() != null) {
					msgKey.setKeyValue("C_SPEC", key.getC_SPEC());
				}
				if(msgKeyType.containsKeyColumn("C_HIGH_LEVEL_NO") && key.getC_HIGH_LEVEL_NO() != null) {
					msgKey.setKeyValue("C_HIGH_LEVEL_NO", key.getC_HIGH_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("C_MRP_ODR_TYP") && key.getC_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("C_MRP_ODR_TYP", key.getC_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_OUTSIDE_TYP") && key.getC_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("C_OUTSIDE_TYP", key.getC_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_STOCK_UNIT_FLG") && key.getC_STOCK_UNIT_FLG() != null) {
					msgKey.setKeyValue("C_STOCK_UNIT_FLG", key.getC_STOCK_UNIT_FLG());
				}
				if(msgKeyType.containsKeyColumn("C_STOCK_UNIT") && key.getC_STOCK_UNIT() != null) {
					msgKey.setKeyValue("C_STOCK_UNIT", key.getC_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("C_PKG_UNIT") && key.getC_PKG_UNIT() != null) {
					msgKey.setKeyValue("C_PKG_UNIT", key.getC_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("C_PKG_UNIT_QTY") && key.getC_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("C_PKG_UNIT_QTY", key.getC_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("C_UNIT_QTY_TYP") && key.getC_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("C_UNIT_QTY_TYP", key.getC_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_ODR_LT") && key.getC_ODR_LT() != null) {
					msgKey.setKeyValue("C_ODR_LT", key.getC_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("C_FIXED_LT") && key.getC_FIXED_LT() != null) {
					msgKey.setKeyValue("C_FIXED_LT", key.getC_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("C_PROP_LT") && key.getC_PROP_LT() != null) {
					msgKey.setKeyValue("C_PROP_LT", key.getC_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("C_SAFETY_LT") && key.getC_SAFETY_LT() != null) {
					msgKey.setKeyValue("C_SAFETY_LT", key.getC_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("C_ISSUE_LT") && key.getC_ISSUE_LT() != null) {
					msgKey.setKeyValue("C_ISSUE_LT", key.getC_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("C_PROP_LOT_SIZE") && key.getC_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("C_PROP_LOT_SIZE", key.getC_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_SPOIL") && key.getC_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("C_ITEM_SPOIL", key.getC_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("C_SAFETY_STOCK") && key.getC_SAFETY_STOCK() != null) {
					msgKey.setKeyValue("C_SAFETY_STOCK", key.getC_SAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("C_LOT_SIZING_TYP") && key.getC_LOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("C_LOT_SIZING_TYP", key.getC_LOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_MAX_PERIOD") && key.getC_MAX_PERIOD() != null) {
					msgKey.setKeyValue("C_MAX_PERIOD", key.getC_MAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("C_MAX_ODR_QTY") && key.getC_MAX_ODR_QTY() != null) {
					msgKey.setKeyValue("C_MAX_ODR_QTY", key.getC_MAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("C_ODR_POINT") && key.getC_ODR_POINT() != null) {
					msgKey.setKeyValue("C_ODR_POINT", key.getC_ODR_POINT());
				}
				if(msgKeyType.containsKeyColumn("C_FIXED_ODR_QTY") && key.getC_FIXED_ODR_QTY() != null) {
					msgKey.setKeyValue("C_FIXED_ODR_QTY", key.getC_FIXED_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("C_MIN_ODR_QTY") && key.getC_MIN_ODR_QTY() != null) {
					msgKey.setKeyValue("C_MIN_ODR_QTY", key.getC_MIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("C_MUL_ODR_QTY") && key.getC_MUL_ODR_QTY() != null) {
					msgKey.setKeyValue("C_MUL_ODR_QTY", key.getC_MUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("C_ISSUE_TYP") && key.getC_ISSUE_TYP() != null) {
					msgKey.setKeyValue("C_ISSUE_TYP", key.getC_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_MPS_FLG") && key.getC_MPS_FLG() != null) {
					msgKey.setKeyValue("C_MPS_FLG", key.getC_MPS_FLG());
				}
				if(msgKeyType.containsKeyColumn("C_ACPT_INSPC_TYP") && key.getC_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("C_ACPT_INSPC_TYP", key.getC_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_PRODUCT_TYP") && key.getC_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("C_PRODUCT_TYP", key.getC_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_CLASIFICATION_CD") && key.getC_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("C_CLASIFICATION_CD", key.getC_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("C_UNIT_WEIGHT") && key.getC_UNIT_WEIGHT() != null) {
					msgKey.setKeyValue("C_UNIT_WEIGHT", key.getC_UNIT_WEIGHT());
				}
				if(msgKeyType.containsKeyColumn("C_ABC_TYP") && key.getC_ABC_TYP() != null) {
					msgKey.setKeyValue("C_ABC_TYP", key.getC_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_OPR_RSLT_TYP") && key.getC_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("C_OPR_RSLT_TYP", key.getC_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_SPL_ITEM_TYP") && key.getC_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("C_SPL_ITEM_TYP", key.getC_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_TAX_CD") && key.getC_TAX_CD() != null) {
					msgKey.setKeyValue("C_TAX_CD", key.getC_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("C_CAL_NO") && key.getC_CAL_NO() != null) {
					msgKey.setKeyValue("C_CAL_NO", key.getC_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("C_MANHOUR_TYP") && key.getC_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("C_MANHOUR_TYP", key.getC_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_DEPO_TYP") && key.getC_DEPO_TYP() != null) {
					msgKey.setKeyValue("C_DEPO_TYP", key.getC_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_LOT_CTRL_FLG") && key.getC_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("C_LOT_CTRL_FLG", key.getC_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("C_LOT_NUMBERING_TYP") && key.getC_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("C_LOT_NUMBERING_TYP", key.getC_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_YEAR") && key.getC_BEST_BEFORE_YEAR() != null) {
					msgKey.setKeyValue("C_BEST_BEFORE_YEAR", key.getC_BEST_BEFORE_YEAR());
				}
				if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_MONTH") && key.getC_BEST_BEFORE_MONTH() != null) {
					msgKey.setKeyValue("C_BEST_BEFORE_MONTH", key.getC_BEST_BEFORE_MONTH());
				}
				if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_DAY") && key.getC_BEST_BEFORE_DAY() != null) {
					msgKey.setKeyValue("C_BEST_BEFORE_DAY", key.getC_BEST_BEFORE_DAY());
				}
				if(msgKeyType.containsKeyColumn("C_REMARK1") && key.getC_REMARK1() != null) {
					msgKey.setKeyValue("C_REMARK1", key.getC_REMARK1());
				}
				if(msgKeyType.containsKeyColumn("C_REMARK2") && key.getC_REMARK2() != null) {
					msgKey.setKeyValue("C_REMARK2", key.getC_REMARK2());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_01_CD") && key.getC_ITEM_CLASS_01_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_01_CD", key.getC_ITEM_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_02_CD") && key.getC_ITEM_CLASS_02_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_02_CD", key.getC_ITEM_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_03_CD") && key.getC_ITEM_CLASS_03_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_03_CD", key.getC_ITEM_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_04_CD") && key.getC_ITEM_CLASS_04_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_04_CD", key.getC_ITEM_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_05_CD") && key.getC_ITEM_CLASS_05_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_05_CD", key.getC_ITEM_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_06_CD") && key.getC_ITEM_CLASS_06_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_06_CD", key.getC_ITEM_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_07_CD") && key.getC_ITEM_CLASS_07_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_07_CD", key.getC_ITEM_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_08_CD") && key.getC_ITEM_CLASS_08_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_08_CD", key.getC_ITEM_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_09_CD") && key.getC_ITEM_CLASS_09_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_09_CD", key.getC_ITEM_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_10_CD") && key.getC_ITEM_CLASS_10_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_10_CD", key.getC_ITEM_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_11_CD") && key.getC_ITEM_CLASS_11_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_11_CD", key.getC_ITEM_CLASS_11_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_12_CD") && key.getC_ITEM_CLASS_12_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_12_CD", key.getC_ITEM_CLASS_12_CD());
				}
				if(msgKeyType.containsKeyColumn("C_DEPT_CD") && key.getC_DEPT_CD() != null) {
					msgKey.setKeyValue("C_DEPT_CD", key.getC_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("C_PJ_CD") && key.getC_PJ_CD() != null) {
					msgKey.setKeyValue("C_PJ_CD", key.getC_PJ_CD());
				}
				if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_1") && key.getC_SEG_CONTENTS_1() != null) {
					msgKey.setKeyValue("C_SEG_CONTENTS_1", key.getC_SEG_CONTENTS_1());
				}
				if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_2") && key.getC_SEG_CONTENTS_2() != null) {
					msgKey.setKeyValue("C_SEG_CONTENTS_2", key.getC_SEG_CONTENTS_2());
				}
				if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_3") && key.getC_SEG_CONTENTS_3() != null) {
					msgKey.setKeyValue("C_SEG_CONTENTS_3", key.getC_SEG_CONTENTS_3());
				}
				if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_4") && key.getC_SEG_CONTENTS_4() != null) {
					msgKey.setKeyValue("C_SEG_CONTENTS_4", key.getC_SEG_CONTENTS_4());
				}
				if(msgKeyType.containsKeyColumn("C_setITEM_CD") && key.getC_setITEM_CD() != null) {
					msgKey.setKeyValue("C_setITEM_CD", key.getC_setITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_OD_ITEM_CD") && key.getreadT_OD_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_OD_ITEM_CD", key.getreadT_OD_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setT_OD_ITEM_CD") && key.getsetT_OD_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_OD_ITEM_CD", key.getsetT_OD_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readM_PS_ITEM_CD") && key.getreadM_PS_ITEM_CD() != null) {
					msgKey.setKeyValue("readM_PS_ITEM_CD", key.getreadM_PS_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_PS_ITEM_CD") && key.getsetM_PS_ITEM_CD() != null) {
					msgKey.setKeyValue("setM_PS_ITEM_CD", key.getsetM_PS_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_ITEM_STOCK_ITEM_CD") && key.getreadT_ITEM_STOCK_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_ITEM_STOCK_ITEM_CD", key.getreadT_ITEM_STOCK_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_ITEM_STOCK_STOCK_ON_HAND_QTY") && key.getreadT_ITEM_STOCK_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("readT_ITEM_STOCK_STOCK_ON_HAND_QTY", key.getreadT_ITEM_STOCK_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("setT_ITEM_STOCK_ITEM_CD") && key.getsetT_ITEM_STOCK_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_ITEM_STOCK_ITEM_CD", key.getsetT_ITEM_STOCK_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_JOB_ODR_CD_ITEM_CD") && key.getreadT_JOB_ODR_CD_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_JOB_ODR_CD_ITEM_CD", key.getreadT_JOB_ODR_CD_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_JOB_ODR_CD_STOCK_ON_HAND_QTY") && key.getreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("readT_JOB_ODR_CD_STOCK_ON_HAND_QTY", key.getreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("setT_JOB_ODR_CD_ITEM_CD") && key.getsetT_JOB_ODR_CD_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_JOB_ODR_CD_ITEM_CD", key.getsetT_JOB_ODR_CD_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_RLSD_P_ITEM_CD") && key.getreadT_RLSD_P_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_RLSD_P_ITEM_CD", key.getreadT_RLSD_P_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setT_RLSD_P_ITEM_CD") && key.getsetT_RLSD_P_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_RLSD_P_ITEM_CD", key.getsetT_RLSD_P_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_WORK_IN_ITEM_CD") && key.getreadT_WORK_IN_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_WORK_IN_ITEM_CD", key.getreadT_WORK_IN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setT_WORK_IN_ITEM_CD") && key.getsetT_WORK_IN_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_WORK_IN_ITEM_CD", key.getsetT_WORK_IN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_JOB_ODR_ITEM_CD") && key.getreadT_JOB_ODR_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_JOB_ODR_ITEM_CD", key.getreadT_JOB_ODR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setT_JOB_ODR_ITEM_CD") && key.getsetT_JOB_ODR_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_JOB_ODR_ITEM_CD", key.getsetT_JOB_ODR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_OPR_RSLT_ITEM_CD") && key.getreadT_OPR_RSLT_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_OPR_RSLT_ITEM_CD", key.getreadT_OPR_RSLT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setT_OPR_RSLT_ITEM_CD") && key.getsetT_OPR_RSLT_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_OPR_RSLT_ITEM_CD", key.getsetT_OPR_RSLT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_WH_ITEM_CD") && key.getsetM_WH_ITEM_CD() != null) {
					msgKey.setKeyValue("setM_WH_ITEM_CD", key.getsetM_WH_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_WH_WH_CD") && key.getsetM_WH_WH_CD() != null) {
					msgKey.setKeyValue("setM_WH_WH_CD", key.getsetM_WH_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_WH_PLANT_CD") && key.getsetM_WH_PLANT_CD() != null) {
					msgKey.setKeyValue("setM_WH_PLANT_CD", key.getsetM_WH_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_WH_WH_REF_NO") && key.getsetM_WH_WH_REF_NO() != null) {
					msgKey.setKeyValue("setM_WH_WH_REF_NO", key.getsetM_WH_WH_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("readM_WH_ITEM_CD") && key.getreadM_WH_ITEM_CD() != null) {
					msgKey.setKeyValue("readM_WH_ITEM_CD", key.getreadM_WH_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readM_WH_WH_CD") && key.getreadM_WH_WH_CD() != null) {
					msgKey.setKeyValue("readM_WH_WH_CD", key.getreadM_WH_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("readM_CAL_H_CAL_NO") && key.getreadM_CAL_H_CAL_NO() != null) {
					msgKey.setKeyValue("readM_CAL_H_CAL_NO", key.getreadM_CAL_H_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("setM_CAL_H_CAL_NO") && key.getsetM_CAL_H_CAL_NO() != null) {
					msgKey.setKeyValue("setM_CAL_H_CAL_NO", key.getsetM_CAL_H_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("readCLASS_CD1") && key.getreadCLASS_CD1() != null) {
					msgKey.setKeyValue("readCLASS_CD1", key.getreadCLASS_CD1());
				}
				if(msgKeyType.containsKeyColumn("setCLASS_CD2") && key.getsetCLASS_CD2() != null) {
					msgKey.setKeyValue("setCLASS_CD2", key.getsetCLASS_CD2());
				}
				if(msgKeyType.containsKeyColumn("setCLASS_CD3") && key.getsetCLASS_CD3() != null) {
					msgKey.setKeyValue("setCLASS_CD3", key.getsetCLASS_CD3());
				}
				if(msgKeyType.containsKeyColumn("readM_ITEM_STOCK_UNIT") && key.getreadM_ITEM_STOCK_UNIT() != null) {
					msgKey.setKeyValue("readM_ITEM_STOCK_UNIT", key.getreadM_ITEM_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("readM_ITEM_LOT_CTRL_FLG") && key.getreadM_ITEM_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("readM_ITEM_LOT_CTRL_FLG", key.getreadM_ITEM_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("readM_ITEM_MRP_ODR_TYP") && key.getreadM_ITEM_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("readM_ITEM_MRP_ODR_TYP", key.getreadM_ITEM_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("setM_ITEM_ITEM_CD") && key.getsetM_ITEM_ITEM_CD() != null) {
					msgKey.setKeyValue("setM_ITEM_ITEM_CD", key.getsetM_ITEM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setDISPLAY_NAME") && key.getsetDISPLAY_NAME() != null) {
					msgKey.setKeyValue("setDISPLAY_NAME", key.getsetDISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("DEPT_CD") && key.getDEPT_CD() != null) {
					msgKey.setKeyValue("DEPT_CD", key.getDEPT_CD());
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
					AA0150010Struct key = new AA0150010Struct();
					if(msgKeyType.containsKeyColumn("rdoInsert")) {
						key.setrdoInsert(msgKey.getKeyValue("rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("rdoUpdate")) {
						key.setrdoUpdate(msgKey.getKeyValue("rdoUpdate"));
					}
					if(msgKeyType.containsKeyColumn("rdoDelete")) {
						key.setrdoDelete(msgKey.getKeyValue("rdoDelete"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("DO_CHK")) {
						key.setDO_CHK(msgKey.getKeyValue("DO_CHK"));
					}
					if(msgKeyType.containsKeyColumn("ERROR_IN")) {
						key.setERROR_IN(msgKey.getKeyValue("ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ERR_CTR_NM")) {
						key.setERR_CTR_NM(msgKey.getKeyValue("ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("ERR_INFO")) {
						key.setERR_INFO(msgKey.getKeyValue("ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("h_SYORI_KUBUN")) {
						key.seth_SYORI_KUBUN(msgKey.getKeyValue("h_SYORI_KUBUN"));
					}
					if(msgKeyType.containsKeyColumn("h_WH_CD")) {
						key.seth_WH_CD(msgKey.getKeyValue("h_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("CANCEL_FILE")) {
						key.setCANCEL_FILE(msgKey.getKeyValue("CANCEL_FILE"));
					}
					if(msgKeyType.containsKeyColumn("JUDGMENT_TXT")) {
						key.setJUDGMENT_TXT(msgKey.getKeyValue("JUDGMENT_TXT"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("ERR_TYP")) {
						key.setERR_TYP(msgKey.getKeyValue("ERR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OUT_ITEM_CD")) {
						key.setOUT_ITEM_CD(msgKey.getKeyValue("OUT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readNAME")) {
						key.setreadNAME(msgKey.getKeyValue("readNAME"));
					}
					if(msgKeyType.containsKeyColumn("readVALUE")) {
						key.setreadVALUE(msgKey.getKeyValue("readVALUE"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
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
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_NAME")) {
						key.seth_ITEM_NAME(msgKey.getKeyValue("h_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_DRAW_CD")) {
						key.seth_DRAW_CD(msgKey.getKeyValue("h_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_SPEC")) {
						key.seth_SPEC(msgKey.getKeyValue("h_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("h_HIGH_LEVEL_NO")) {
						key.seth_HIGH_LEVEL_NO(msgKey.getKeyValue("h_HIGH_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP")) {
						key.seth_MRP_ODR_TYP(msgKey.getKeyValue("h_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_OUTSIDE_TYP")) {
						key.seth_OUTSIDE_TYP(msgKey.getKeyValue("h_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_STOCK_UNIT_FLG")) {
						key.seth_STOCK_UNIT_FLG(msgKey.getKeyValue("h_STOCK_UNIT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_STOCK_UNIT")) {
						key.seth_STOCK_UNIT(msgKey.getKeyValue("h_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_PKG_UNIT")) {
						key.seth_PKG_UNIT(msgKey.getKeyValue("h_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_PKG_UNIT_QTY")) {
						key.seth_PKG_UNIT_QTY(msgKey.getKeyValue("h_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_LT")) {
						key.seth_ODR_LT(msgKey.getKeyValue("h_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_FIXED_LT")) {
						key.seth_FIXED_LT(msgKey.getKeyValue("h_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_PROP_LT")) {
						key.seth_PROP_LT(msgKey.getKeyValue("h_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_SAFETY_LT")) {
						key.seth_SAFETY_LT(msgKey.getKeyValue("h_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_LT")) {
						key.seth_ISSUE_LT(msgKey.getKeyValue("h_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_PROP_LOT_SIZE")) {
						key.seth_PROP_LOT_SIZE(msgKey.getKeyValue("h_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_SPOIL")) {
						key.seth_ITEM_SPOIL(msgKey.getKeyValue("h_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("h_SAFETY_STOCK")) {
						key.seth_SAFETY_STOCK(msgKey.getKeyValue("h_SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_SIZING_TYP")) {
						key.seth_LOT_SIZING_TYP(msgKey.getKeyValue("h_LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MAX_PERIOD")) {
						key.seth_MAX_PERIOD(msgKey.getKeyValue("h_MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("h_MAX_ODR_QTY")) {
						key.seth_MAX_ODR_QTY(msgKey.getKeyValue("h_MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_POINT")) {
						key.seth_ODR_POINT(msgKey.getKeyValue("h_ODR_POINT"));
					}
					if(msgKeyType.containsKeyColumn("h_FIXED_ODR_QTY")) {
						key.seth_FIXED_ODR_QTY(msgKey.getKeyValue("h_FIXED_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_MIN_ODR_QTY")) {
						key.seth_MIN_ODR_QTY(msgKey.getKeyValue("h_MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_MUL_ODR_QTY")) {
						key.seth_MUL_ODR_QTY(msgKey.getKeyValue("h_MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_TYP")) {
						key.seth_ISSUE_TYP(msgKey.getKeyValue("h_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MPS_FLG")) {
						key.seth_MPS_FLG(msgKey.getKeyValue("h_MPS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_ACPT_INSPC_TYP")) {
						key.seth_ACPT_INSPC_TYP(msgKey.getKeyValue("h_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PRODUCT_TYP")) {
						key.seth_PRODUCT_TYP(msgKey.getKeyValue("h_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_CLASIFICATION_CD")) {
						key.seth_CLASIFICATION_CD(msgKey.getKeyValue("h_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_WEIGHT")) {
						key.seth_UNIT_WEIGHT(msgKey.getKeyValue("h_UNIT_WEIGHT"));
					}
					if(msgKeyType.containsKeyColumn("h_ABC_TYP")) {
						key.seth_ABC_TYP(msgKey.getKeyValue("h_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_RSLT_TYP")) {
						key.seth_OPR_RSLT_TYP(msgKey.getKeyValue("h_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_SPL_ITEM_TYP")) {
						key.seth_SPL_ITEM_TYP(msgKey.getKeyValue("h_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CD")) {
						key.seth_TAX_CD(msgKey.getKeyValue("h_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_CAL_NO")) {
						key.seth_CAL_NO(msgKey.getKeyValue("h_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP")) {
						key.seth_MANHOUR_TYP(msgKey.getKeyValue("h_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_DEPO_TYP")) {
						key.seth_DEPO_TYP(msgKey.getKeyValue("h_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG")) {
						key.seth_LOT_CTRL_FLG(msgKey.getKeyValue("h_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP")) {
						key.seth_LOT_NUMBERING_TYP(msgKey.getKeyValue("h_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_YEAR")) {
						key.seth_BEST_BEFORE_YEAR(msgKey.getKeyValue("h_BEST_BEFORE_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_MONTH")) {
						key.seth_BEST_BEFORE_MONTH(msgKey.getKeyValue("h_BEST_BEFORE_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_DAY")) {
						key.seth_BEST_BEFORE_DAY(msgKey.getKeyValue("h_BEST_BEFORE_DAY"));
					}
					if(msgKeyType.containsKeyColumn("h_DEPT_CD")) {
						key.seth_DEPT_CD(msgKey.getKeyValue("h_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PJ_CD")) {
						key.seth_PJ_CD(msgKey.getKeyValue("h_PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_1")) {
						key.seth_SEG_CONTENTS_1(msgKey.getKeyValue("h_SEG_CONTENTS_1"));
					}
					if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_2")) {
						key.seth_SEG_CONTENTS_2(msgKey.getKeyValue("h_SEG_CONTENTS_2"));
					}
					if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_3")) {
						key.seth_SEG_CONTENTS_3(msgKey.getKeyValue("h_SEG_CONTENTS_3"));
					}
					if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_4")) {
						key.seth_SEG_CONTENTS_4(msgKey.getKeyValue("h_SEG_CONTENTS_4"));
					}
					if(msgKeyType.containsKeyColumn("h_REMARK1")) {
						key.seth_REMARK1(msgKey.getKeyValue("h_REMARK1"));
					}
					if(msgKeyType.containsKeyColumn("h_REMARK2")) {
						key.seth_REMARK2(msgKey.getKeyValue("h_REMARK2"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_01_CD")) {
						key.seth_ITEM_CLASS_01_CD(msgKey.getKeyValue("h_ITEM_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_02_CD")) {
						key.seth_ITEM_CLASS_02_CD(msgKey.getKeyValue("h_ITEM_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_03_CD")) {
						key.seth_ITEM_CLASS_03_CD(msgKey.getKeyValue("h_ITEM_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_04_CD")) {
						key.seth_ITEM_CLASS_04_CD(msgKey.getKeyValue("h_ITEM_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_05_CD")) {
						key.seth_ITEM_CLASS_05_CD(msgKey.getKeyValue("h_ITEM_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_06_CD")) {
						key.seth_ITEM_CLASS_06_CD(msgKey.getKeyValue("h_ITEM_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_07_CD")) {
						key.seth_ITEM_CLASS_07_CD(msgKey.getKeyValue("h_ITEM_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_08_CD")) {
						key.seth_ITEM_CLASS_08_CD(msgKey.getKeyValue("h_ITEM_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_09_CD")) {
						key.seth_ITEM_CLASS_09_CD(msgKey.getKeyValue("h_ITEM_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_10_CD")) {
						key.seth_ITEM_CLASS_10_CD(msgKey.getKeyValue("h_ITEM_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_11_CD")) {
						key.seth_ITEM_CLASS_11_CD(msgKey.getKeyValue("h_ITEM_CLASS_11_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_12_CD")) {
						key.seth_ITEM_CLASS_12_CD(msgKey.getKeyValue("h_ITEM_CLASS_12_CD"));
					}
					if(msgKeyType.containsKeyColumn("readTAX_CD")) {
						key.setreadTAX_CD(msgKey.getKeyValue("readTAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("setTAXCD")) {
						key.setsetTAXCD(msgKey.getKeyValue("setTAXCD"));
					}
					if(msgKeyType.containsKeyColumn("readITEM_CD")) {
						key.setreadITEM_CD(msgKey.getKeyValue("readITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setITEM_CD")) {
						key.setsetITEM_CD(msgKey.getKeyValue("setITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readVEND_CD")) {
						key.setreadVEND_CD(msgKey.getKeyValue("readVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("setVEND_CD")) {
						key.setsetVEND_CD(msgKey.getKeyValue("setVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPLANT_CD")) {
						key.setreadPLANT_CD(msgKey.getKeyValue("readPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("readSUM_PROP_LT")) {
						key.setreadSUM_PROP_LT(new Integer(msgKey.getKeyValue("readSUM_PROP_LT")));
					}
					if(msgKeyType.containsKeyColumn("readSUM_FIXED_LT")) {
						key.setreadSUM_FIXED_LT(new Integer(msgKey.getKeyValue("readSUM_FIXED_LT")));
					}
					if(msgKeyType.containsKeyColumn("readMRP_ITEM_CD")) {
						key.setreadMRP_ITEM_CD(msgKey.getKeyValue("readMRP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readMRP_ODR_TYP")) {
						key.setreadMRP_ODR_TYP(new Integer(msgKey.getKeyValue("readMRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("setMRP_ITEM_CD")) {
						key.setsetMRP_ITEM_CD(msgKey.getKeyValue("setMRP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readMRP_ODR_ITEM_CD")) {
						key.setreadMRP_ODR_ITEM_CD(msgKey.getKeyValue("readMRP_ODR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setMRP_ODR_ITEM_CD")) {
						key.setsetMRP_ODR_ITEM_CD(msgKey.getKeyValue("setMRP_ODR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CD")) {
						key.setC_ITEM_CD(msgKey.getKeyValue("C_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_NAME")) {
						key.setC_ITEM_NAME(msgKey.getKeyValue("C_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("C_DRAW_CD")) {
						key.setC_DRAW_CD(msgKey.getKeyValue("C_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_SPEC")) {
						key.setC_SPEC(msgKey.getKeyValue("C_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("C_HIGH_LEVEL_NO")) {
						key.setC_HIGH_LEVEL_NO(msgKey.getKeyValue("C_HIGH_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("C_MRP_ODR_TYP")) {
						key.setC_MRP_ODR_TYP(msgKey.getKeyValue("C_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_OUTSIDE_TYP")) {
						key.setC_OUTSIDE_TYP(msgKey.getKeyValue("C_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_STOCK_UNIT_FLG")) {
						key.setC_STOCK_UNIT_FLG(msgKey.getKeyValue("C_STOCK_UNIT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("C_STOCK_UNIT")) {
						key.setC_STOCK_UNIT(msgKey.getKeyValue("C_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("C_PKG_UNIT")) {
						key.setC_PKG_UNIT(msgKey.getKeyValue("C_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("C_PKG_UNIT_QTY")) {
						key.setC_PKG_UNIT_QTY(msgKey.getKeyValue("C_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("C_UNIT_QTY_TYP")) {
						key.setC_UNIT_QTY_TYP(msgKey.getKeyValue("C_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_ODR_LT")) {
						key.setC_ODR_LT(msgKey.getKeyValue("C_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_FIXED_LT")) {
						key.setC_FIXED_LT(msgKey.getKeyValue("C_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_PROP_LT")) {
						key.setC_PROP_LT(msgKey.getKeyValue("C_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_SAFETY_LT")) {
						key.setC_SAFETY_LT(msgKey.getKeyValue("C_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_ISSUE_LT")) {
						key.setC_ISSUE_LT(msgKey.getKeyValue("C_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_PROP_LOT_SIZE")) {
						key.setC_PROP_LOT_SIZE(msgKey.getKeyValue("C_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_SPOIL")) {
						key.setC_ITEM_SPOIL(msgKey.getKeyValue("C_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("C_SAFETY_STOCK")) {
						key.setC_SAFETY_STOCK(msgKey.getKeyValue("C_SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("C_LOT_SIZING_TYP")) {
						key.setC_LOT_SIZING_TYP(msgKey.getKeyValue("C_LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_MAX_PERIOD")) {
						key.setC_MAX_PERIOD(msgKey.getKeyValue("C_MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("C_MAX_ODR_QTY")) {
						key.setC_MAX_ODR_QTY(msgKey.getKeyValue("C_MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("C_ODR_POINT")) {
						key.setC_ODR_POINT(msgKey.getKeyValue("C_ODR_POINT"));
					}
					if(msgKeyType.containsKeyColumn("C_FIXED_ODR_QTY")) {
						key.setC_FIXED_ODR_QTY(msgKey.getKeyValue("C_FIXED_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("C_MIN_ODR_QTY")) {
						key.setC_MIN_ODR_QTY(msgKey.getKeyValue("C_MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("C_MUL_ODR_QTY")) {
						key.setC_MUL_ODR_QTY(msgKey.getKeyValue("C_MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("C_ISSUE_TYP")) {
						key.setC_ISSUE_TYP(msgKey.getKeyValue("C_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_MPS_FLG")) {
						key.setC_MPS_FLG(msgKey.getKeyValue("C_MPS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("C_ACPT_INSPC_TYP")) {
						key.setC_ACPT_INSPC_TYP(msgKey.getKeyValue("C_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_PRODUCT_TYP")) {
						key.setC_PRODUCT_TYP(msgKey.getKeyValue("C_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_CLASIFICATION_CD")) {
						key.setC_CLASIFICATION_CD(msgKey.getKeyValue("C_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_UNIT_WEIGHT")) {
						key.setC_UNIT_WEIGHT(msgKey.getKeyValue("C_UNIT_WEIGHT"));
					}
					if(msgKeyType.containsKeyColumn("C_ABC_TYP")) {
						key.setC_ABC_TYP(msgKey.getKeyValue("C_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_OPR_RSLT_TYP")) {
						key.setC_OPR_RSLT_TYP(msgKey.getKeyValue("C_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_SPL_ITEM_TYP")) {
						key.setC_SPL_ITEM_TYP(msgKey.getKeyValue("C_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_TAX_CD")) {
						key.setC_TAX_CD(msgKey.getKeyValue("C_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_CAL_NO")) {
						key.setC_CAL_NO(msgKey.getKeyValue("C_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("C_MANHOUR_TYP")) {
						key.setC_MANHOUR_TYP(msgKey.getKeyValue("C_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_DEPO_TYP")) {
						key.setC_DEPO_TYP(msgKey.getKeyValue("C_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_LOT_CTRL_FLG")) {
						key.setC_LOT_CTRL_FLG(msgKey.getKeyValue("C_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("C_LOT_NUMBERING_TYP")) {
						key.setC_LOT_NUMBERING_TYP(msgKey.getKeyValue("C_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_YEAR")) {
						key.setC_BEST_BEFORE_YEAR(msgKey.getKeyValue("C_BEST_BEFORE_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_MONTH")) {
						key.setC_BEST_BEFORE_MONTH(msgKey.getKeyValue("C_BEST_BEFORE_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_DAY")) {
						key.setC_BEST_BEFORE_DAY(msgKey.getKeyValue("C_BEST_BEFORE_DAY"));
					}
					if(msgKeyType.containsKeyColumn("C_REMARK1")) {
						key.setC_REMARK1(msgKey.getKeyValue("C_REMARK1"));
					}
					if(msgKeyType.containsKeyColumn("C_REMARK2")) {
						key.setC_REMARK2(msgKey.getKeyValue("C_REMARK2"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_01_CD")) {
						key.setC_ITEM_CLASS_01_CD(msgKey.getKeyValue("C_ITEM_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_02_CD")) {
						key.setC_ITEM_CLASS_02_CD(msgKey.getKeyValue("C_ITEM_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_03_CD")) {
						key.setC_ITEM_CLASS_03_CD(msgKey.getKeyValue("C_ITEM_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_04_CD")) {
						key.setC_ITEM_CLASS_04_CD(msgKey.getKeyValue("C_ITEM_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_05_CD")) {
						key.setC_ITEM_CLASS_05_CD(msgKey.getKeyValue("C_ITEM_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_06_CD")) {
						key.setC_ITEM_CLASS_06_CD(msgKey.getKeyValue("C_ITEM_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_07_CD")) {
						key.setC_ITEM_CLASS_07_CD(msgKey.getKeyValue("C_ITEM_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_08_CD")) {
						key.setC_ITEM_CLASS_08_CD(msgKey.getKeyValue("C_ITEM_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_09_CD")) {
						key.setC_ITEM_CLASS_09_CD(msgKey.getKeyValue("C_ITEM_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_10_CD")) {
						key.setC_ITEM_CLASS_10_CD(msgKey.getKeyValue("C_ITEM_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_11_CD")) {
						key.setC_ITEM_CLASS_11_CD(msgKey.getKeyValue("C_ITEM_CLASS_11_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_12_CD")) {
						key.setC_ITEM_CLASS_12_CD(msgKey.getKeyValue("C_ITEM_CLASS_12_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_DEPT_CD")) {
						key.setC_DEPT_CD(msgKey.getKeyValue("C_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_PJ_CD")) {
						key.setC_PJ_CD(msgKey.getKeyValue("C_PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_1")) {
						key.setC_SEG_CONTENTS_1(msgKey.getKeyValue("C_SEG_CONTENTS_1"));
					}
					if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_2")) {
						key.setC_SEG_CONTENTS_2(msgKey.getKeyValue("C_SEG_CONTENTS_2"));
					}
					if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_3")) {
						key.setC_SEG_CONTENTS_3(msgKey.getKeyValue("C_SEG_CONTENTS_3"));
					}
					if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_4")) {
						key.setC_SEG_CONTENTS_4(msgKey.getKeyValue("C_SEG_CONTENTS_4"));
					}
					if(msgKeyType.containsKeyColumn("C_setITEM_CD")) {
						key.setC_setITEM_CD(msgKey.getKeyValue("C_setITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_OD_ITEM_CD")) {
						key.setreadT_OD_ITEM_CD(msgKey.getKeyValue("readT_OD_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setT_OD_ITEM_CD")) {
						key.setsetT_OD_ITEM_CD(msgKey.getKeyValue("setT_OD_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readM_PS_ITEM_CD")) {
						key.setreadM_PS_ITEM_CD(msgKey.getKeyValue("readM_PS_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_PS_ITEM_CD")) {
						key.setsetM_PS_ITEM_CD(msgKey.getKeyValue("setM_PS_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_ITEM_STOCK_ITEM_CD")) {
						key.setreadT_ITEM_STOCK_ITEM_CD(msgKey.getKeyValue("readT_ITEM_STOCK_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_ITEM_STOCK_STOCK_ON_HAND_QTY")) {
						key.setreadT_ITEM_STOCK_STOCK_ON_HAND_QTY(msgKey.getKeyValue("readT_ITEM_STOCK_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setT_ITEM_STOCK_ITEM_CD")) {
						key.setsetT_ITEM_STOCK_ITEM_CD(msgKey.getKeyValue("setT_ITEM_STOCK_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_JOB_ODR_CD_ITEM_CD")) {
						key.setreadT_JOB_ODR_CD_ITEM_CD(msgKey.getKeyValue("readT_JOB_ODR_CD_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_JOB_ODR_CD_STOCK_ON_HAND_QTY")) {
						key.setreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY(msgKey.getKeyValue("readT_JOB_ODR_CD_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setT_JOB_ODR_CD_ITEM_CD")) {
						key.setsetT_JOB_ODR_CD_ITEM_CD(msgKey.getKeyValue("setT_JOB_ODR_CD_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_RLSD_P_ITEM_CD")) {
						key.setreadT_RLSD_P_ITEM_CD(msgKey.getKeyValue("readT_RLSD_P_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setT_RLSD_P_ITEM_CD")) {
						key.setsetT_RLSD_P_ITEM_CD(msgKey.getKeyValue("setT_RLSD_P_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_WORK_IN_ITEM_CD")) {
						key.setreadT_WORK_IN_ITEM_CD(msgKey.getKeyValue("readT_WORK_IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setT_WORK_IN_ITEM_CD")) {
						key.setsetT_WORK_IN_ITEM_CD(msgKey.getKeyValue("setT_WORK_IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_JOB_ODR_ITEM_CD")) {
						key.setreadT_JOB_ODR_ITEM_CD(msgKey.getKeyValue("readT_JOB_ODR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setT_JOB_ODR_ITEM_CD")) {
						key.setsetT_JOB_ODR_ITEM_CD(msgKey.getKeyValue("setT_JOB_ODR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_OPR_RSLT_ITEM_CD")) {
						key.setreadT_OPR_RSLT_ITEM_CD(msgKey.getKeyValue("readT_OPR_RSLT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setT_OPR_RSLT_ITEM_CD")) {
						key.setsetT_OPR_RSLT_ITEM_CD(msgKey.getKeyValue("setT_OPR_RSLT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_WH_ITEM_CD")) {
						key.setsetM_WH_ITEM_CD(msgKey.getKeyValue("setM_WH_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_WH_WH_CD")) {
						key.setsetM_WH_WH_CD(msgKey.getKeyValue("setM_WH_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_WH_PLANT_CD")) {
						key.setsetM_WH_PLANT_CD(msgKey.getKeyValue("setM_WH_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_WH_WH_REF_NO")) {
						key.setsetM_WH_WH_REF_NO(msgKey.getKeyValue("setM_WH_WH_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("readM_WH_ITEM_CD")) {
						key.setreadM_WH_ITEM_CD(msgKey.getKeyValue("readM_WH_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readM_WH_WH_CD")) {
						key.setreadM_WH_WH_CD(msgKey.getKeyValue("readM_WH_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("readM_CAL_H_CAL_NO")) {
						key.setreadM_CAL_H_CAL_NO(msgKey.getKeyValue("readM_CAL_H_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("setM_CAL_H_CAL_NO")) {
						key.setsetM_CAL_H_CAL_NO(msgKey.getKeyValue("setM_CAL_H_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("readCLASS_CD1")) {
						key.setreadCLASS_CD1(msgKey.getKeyValue("readCLASS_CD1"));
					}
					if(msgKeyType.containsKeyColumn("setCLASS_CD2")) {
						key.setsetCLASS_CD2(msgKey.getKeyValue("setCLASS_CD2"));
					}
					if(msgKeyType.containsKeyColumn("setCLASS_CD3")) {
						key.setsetCLASS_CD3(msgKey.getKeyValue("setCLASS_CD3"));
					}
					if(msgKeyType.containsKeyColumn("readM_ITEM_STOCK_UNIT")) {
						key.setreadM_ITEM_STOCK_UNIT(msgKey.getKeyValue("readM_ITEM_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("readM_ITEM_LOT_CTRL_FLG")) {
						key.setreadM_ITEM_LOT_CTRL_FLG(msgKey.getKeyValue("readM_ITEM_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("readM_ITEM_MRP_ODR_TYP")) {
						key.setreadM_ITEM_MRP_ODR_TYP(msgKey.getKeyValue("readM_ITEM_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setM_ITEM_ITEM_CD")) {
						key.setsetM_ITEM_ITEM_CD(msgKey.getKeyValue("setM_ITEM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setDISPLAY_NAME")) {
						key.setsetDISPLAY_NAME(msgKey.getKeyValue("setDISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("DEPT_CD")) {
						key.setDEPT_CD(msgKey.getKeyValue("DEPT_CD"));
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
