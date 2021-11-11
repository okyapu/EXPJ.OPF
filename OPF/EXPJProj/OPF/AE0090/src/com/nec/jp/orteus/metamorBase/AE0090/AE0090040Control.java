/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/src/com/nec/jp/orteus/metamorBase/AE0090/AE0090040Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0090;

import com.nec.jp.orteus.metamorBase.AE0090.*;
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
import org.w3c.dom.*;
import org.apache.crimson.tree.*;
//{{user_implement_code_import
import java.text.ParseException;

import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.PrivateConfig;
import com.nec.jp.orteus.expj.psmaintenance.PsMaintenance;
import com.nec.jp.orteus.expj.exception.ExpjBadException;
import com.nec.jp.orteus.expj.exception.NoDataException;
import com.nec.jp.orteus.expj.exception.PsEffPhaseException;
import com.nec.jp.orteus.expj.exception.PsLoopException;
import com.nec.jp.orteus.expj.exception.PsMrpOdrTypException;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;

//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0090040Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: koizumi $
 * @version $Revision: 1.7 $ $Date: 2012/09/27 09:43:39 $
 *
 */
//}}user_implement_code_header

public class AE0090040Control
{

	//////////////////////////////
	// �A�N�Z�T���\�b�h�����`���܂�
	// Business�I�u�W�F�N�g�A�N�Z�T���\�b�h
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	// FlashTree�p�A�N�Z�T���\�b�h
	private Document flashTree = null;
	public Document getFlashTree() { return this.flashTree; }
	public void setFlashTree( Document obj ) { this.flashTree = obj; }
	public String getFlashTreeXML() {
		if(flashTree == null) {
			return (String)null;
		}
		StringWriter strWr = new StringWriter();
		try {
			((XmlDocument)flashTree).write(strWr, "Shift_JIS");
		}catch(IOException e){
			e.printStackTrace();
		}
                String osname = System.getProperty("os.name");
                if(osname.indexOf("Windows")>=0){
         		return StringConverter.substitute(strWr.toString(), "\r\n", "");
                } else {
              		return StringConverter.substitute(strWr.toString(), "\n", "");
                }
	}
	public int setXMLDoc(Element el, List list, int startId, int lvl, int parentId) throws BusinessProcessException, FoundationException {

		if(el != null && list != null) {
			Element elChild = null;
			for(int i=0; i<list.size(); i++, startId++) {
				// �G�������g�𐶐�
				elChild = flashTree.createElement("node");
				setStruct2XML(elChild, (AE0090040Struct)list.get(i), startId, lvl, parentId);
				// �쐬�����G�������g���q���Ƃ��Ēǉ�
				el.appendChild(elChild);
			}
		}
		return startId;
	}

	public int setXMLDoc(Element el, List list, int startId) throws BusinessProcessException, FoundationException {
		return setXMLDoc(el, list, startId, 1, 0);
	} 

	public void setStruct2XML(Element el, AE0090040Struct struct, int id, int lvl, int parentId) throws BusinessProcessException, FoundationException {

		if(el != null && struct != null) {
			try {
		//{{user_implement_dev:<setStruct2XML>
				// id����(id)�̐ݒ�
				el.setAttribute("id", Integer.toString(id));
				// ���x������(LVL)�̐ݒ�
				el.setAttribute("lvl", Integer.toString(lvl));
				// �e����(Parent)�̐ݒ�
				el.setAttribute("parent", Integer.toString(parentId));
				// ���x������(Label)�̐ݒ�
				if(struct.getlabel() != null && !struct.getlabel().equals("")) {
					el.setAttribute("label", struct.getlabel());
				}
//				 �g������
                // ��ʃ��x���i�ڔԍ������̐ݒ�
                if (struct.getUpper_ITEM_CD() != null
                        && struct.getUpper_ITEM_CD().equals("") == false)
                {
                    el.setAttribute("Upper_ITEM_CD", struct.getUpper_ITEM_CD());
                } else {
                    el.setAttribute("Upper_ITEM_CD", "");
                }
//              ��ʃ��x���i�ږ������̐ݒ�
                if (struct.getUpper_ITEM_NAME() != null
                        && struct.getUpper_ITEM_NAME().equals("") == false)
                {
                    el.setAttribute("Upper_ITEM_NAME", struct.getUpper_ITEM_NAME());
                } else {
                    el.setAttribute("Upper_ITEM_NAME", "");
                }
                // ���ʃ��x���i�ڔԍ������̐ݒ�
                if (struct.getLower_ITEM_CD() != null
                        && struct.getLower_ITEM_CD().equals("") == false)
                {
                    el.setAttribute("Lower_ITEM_CD", struct.getLower_ITEM_CD());
                } else {
                    el.setAttribute("Lower_ITEM_CD", "");
                }
//              ���ʃ��x���i�ږ��̐ݒ�
                if (struct.getLower_ITEM_NAME() != null
                        && struct.getLower_ITEM_NAME().equals("") == false)
                {
                    el.setAttribute("Lower_ITEM_NAME", struct.getLower_ITEM_NAME());
                } else {
                    el.setAttribute("Lower_ITEM_NAME", "");
                }
                // ���i�\���Ő������̐ݒ�
                if (struct.getPS_EDITION() != null
                        && struct.getPS_EDITION().equals("") == false)
                {
                    el.setAttribute("PS_EDITION", struct.getPS_EDITION());
                } else {
                    el.setAttribute("PS_EDITION", "");
                }
                //�K�v�������̐ݒ�
                if (struct.getLower_NEED_QTY() != null
                		&& struct.getLower_NEED_QTY().equals("") == false)
                {
                	el.setAttribute("Lower_NEED_QTY",struct.getLower_NEED_QTY());
                }else{
                	el.setAttribute("Lower_NEED_QTY", "");
                }
                //���݌ɐ���
                if (struct.getONHAND_STOCK() != null && struct.getONHAND_STOCK().equals("") == false)
                {
                	el.setAttribute("ONHAND_STOCK",struct.getONHAND_STOCK());
                }else{
                	el.setAttribute("ONHAND_STOCK","");
                }
                //}}user_implement_dev:<setStruct2XML>
			} catch(DOMException e) {
				e.printStackTrace();
			}
		}
		return;
	}

	public void setStruct2XML(Element el, AE0090040Struct struct, int id) throws BusinessProcessException, FoundationException {
		setStruct2XML(el, struct, id, 1, 0);
		return;
	}

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
	public AE0090040Struct getListvalue(int x) { return (AE0090040Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AE0090040Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AE0090040Struct createStruct() { return new AE0090040Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AE0090040Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	private Date targetDate;
	private boolean ceilflg = false;
	/** �W�J�敪�F���W�J */
    private static final String DEVELOP_NORMAL = "1";

    /** �W�J�敪�F�t�W�J */
    private static final String DEVELOP_REVERSE = "2";

    /** �f�t�H�[���g�����W�J���x�� */
    private static final int DEFAULT_INIT_DEVELOP_LEVEL = 15;

    /** �f�t�H�[���g�ő�W�J���x�� */
    private static final int DEFAULT_MAX_DEVELOP_LEVEL = 50;

    /** �f�t�H�[���g�����W�J���x�� */
    private int _intInitDevelopLevel = DEFAULT_INIT_DEVELOP_LEVEL;

    /** �ő�W�J���x�� */
    private int _intMaxDevelopLevel = DEFAULT_MAX_DEVELOP_LEVEL;

    /** �ő�Ǎ��s�� */
    private int _intMaxReadNum = 0;

    /** �Ώۓ��t */
    private String _targetDate = null;

    /** ���i�\�������e�i���X���i�A�N�Z�X�p�I�u�W�F�N�g */
    private PsMaintenance _psMaint = null;

    /** �i�ڎ�z�敪�R���{�{�b�N�X�l���X�g */
    private List _detMrpOdrTypValList = null;

    /** �i�ڎ�z�敪�R���{�{�b�N�X�\���������X�g */
    private List _detMrpOdrTypNameList = null;

    /** ���O��敪�R���{�{�b�N�X�l���X�g */
    private List _detOutsideTypValList = null;

    /** ���O��敪�R���{�{�b�N�X�\���������X�g */
    private List _detOutsideTypNameList = null;
    
    /** �\���i�ڐ��i�敪�g�p�t���O�\���p�i�R���{�{�b�N�X�j�l���X�g */
	private List _detProductTypValList = null;

	/** �\���i�ڐ��i�敪�g�p�t���O�\���p�i�R���{�{�b�N�X�j�������X�g */
	private List _detProductTypNameList = null;

	/** �\���i�ڎx���敪�g�p�t���O�\���p�i�R���{�{�b�N�X�j�l���X�g */
	private List _detConsTypValList = null;

	/** �\���i�ڎx���敪�g�p�t���O�\���p�i�R���{�{�b�N�X�j�������X�g */
	private List _detConsTypNameList = null;
 
    /** ���i�\�����X�g */
    private ArrayList _deployList = new ArrayList(0);
   
    /** ���i�\�����X�g�擾 
     * @return ���i�\�����X�g
    */
    public ArrayList getDeployList(){ return _deployList; }
    
    /**
	 * Date�^ �� String�^�B
	 * 
	 * @return String YYYY/MM/DD�`��
	 */
    public String dateToString(Date date)
    {
     //return _dateFormat.format(date);
     return Converter.dateToStr(date, "yyyy/MM/dd");
    }

    /**
     * String�^ �� Date�^�B
     * @return Date 
     */
    public Date stringToDate(String date) throws ParseException
    {
     //return _dateFormat.parse(date);
     return Converter.strToDate(date, "yyyy/MM/dd");
    }
    
    /**    
     * check ���t�`���Fyyyy/MM/dd
     * @param sourceDate    
     * @return    
     */     
     public static boolean checkDate(String sourceDate){     
     if(sourceDate==null){     
     return false;     
     }     
     try {     
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");     
     dateFormat.setLenient(false);     
     dateFormat.parse(sourceDate);     
     return true;     
     } catch (Exception e) {     
     }     
     return false;     
     }   
     /**
 	 * �Ɩ����W�b�N�̃C���t�H���[�V�������b�Z�[�W�ݒ菈����؂�o���Ċ֐���
 	 * @param code ���b�Z�[�W�R�[�h
 	 */
 	private void setInformationMessage(String code) {
 		ExpjMessage emsg = new ExpjMessage(code);
 		msgStruct.addInfo(emsg);
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
 	 * �Ɩ����W�b�N�̃��[�j���O���b�Z�[�W�ݒ菈����؂�o���Ċ֐���
 	 * @param code ���b�Z�[�W�R�[�h
 	 * @param value1 �u��������P
 	 */
 	private void setWarningMessage(String code, String value1) {
 		ExpjMessage emsg = new ExpjMessage(code, value1);
 		msgStruct.addWarn(emsg);
 		sysLog.info(emsg, sysUSER_CD);
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
     /**
      * �f�[�^�Ȃ���O�N���X�ł��B
      */
     private class AE0090040NoPlantException extends ExpjBadException
     {
         /**
          * AE0090040NoPlantException�I�u�W�F�N�g���\�z���܂��B
          *
          * @param em �G���[���b�Z�[�W�I�u�W�F�N�g
          */
         private AE0090040NoPlantException(ExpjMessage em)
         {
             super(em);
         }
     }
    /**
     * �f�[�^�Ȃ���O�N���X�ł��B
     */
    private class AE0090040NoDataException extends ExpjBadException
    {
        /**
         * AE0090040NoDataException�I�u�W�F�N�g���\�z���܂��B
         *
         * @param em �G���[���b�Z�[�W�I�u�W�F�N�g
         */
        private AE0090040NoDataException(ExpjMessage em)
        {
            super(em);
        }
    }

    /**
     * �c���[�̓Ǎ��s���I�[�o�[��O�N���X�ł��B
     */
    private class AE0090040MaxReadException extends ExpjBadException
    {
        /**
         * AE0090040MaxReadException�I�u�W�F�N�g���\�z���܂��B
         *
         * @param em �G���[���b�Z�[�W�I�u�W�F�N�g
         */
        private AE0090040MaxReadException(ExpjMessage em)
        {
            super(em);
        }
    }

    /**
     * �c���[�̍ő�W�J���x���I�[�o�[��O�N���X�ł��B
     */
    private class AE0090040MaxLevelException extends ExpjBadException
    {
        /**
         * AE0090040MaxLevelException�I�u�W�F�N�g���\�z���܂��B
         */
        private AE0090040MaxLevelException()
        {
            super();
        }
    }

    /**
     * ��ʃ��x���m�[�h�ɑ΂����ʃ��x���m�[�h���c���[�W�J���܂��B
     *
     * @param  upperNodeElement ��ʃ��x���m�[�h�G�������g
     * @param  upperNodeStruct ��ʃ��x���m�[�h��sturct
     * @param  upperNodeId ��ʃ��x���m�[�hID
     * @param  lowerNodeId ���ʃ��x���m�[�hID�i����ID����n�J�j
     * @param  maxNodeId �Ǎ��\�ő�m�[�hID�i����ID�𒴂��邱�Ƃ͂ł��Ȃ��j
     * @param  lowerTreeLevel ���ʃ��x���c���[���x��
     * @param  maxLevel �ő�W�J���x��
     * @return ���̃m�[�hID
     * @throws BusinessProcessException
     * @throws FoundationException
     * @throws SQLException
     * @throws ParseException
     * @throws AE0090040NoDataException
     * @throws AE0090040MaxReadException
     */
    private int expandTree(Element upperNodeElement, AE0090040Struct upperNodeStruct,
            int upperNodeId, int lowerNodeId, int maxNodeId, int lowerTreeLevel, int maxLevel)
            throws BusinessProcessException, FoundationException, SQLException, ParseException,
                    AE0090040NoDataException, AE0090040MaxReadException
    {
    	// �q�m�[�h�̈ꗗ���擾
        List lowerNodeList = getLowerNodeList(upperNodeStruct.getLower_ITEM_CD());
        if (lowerNodeList.isEmpty()) {
            // ���[�m�[�h�̏ꍇ
            upperNodeElement.setAttribute("ctx", "T");
            if(Calculate.compare(upperNodeStruct.getONHAND_STOCK(),upperNodeStruct.getLower_NEED_QTY()) < 0){
            	upperNodeElement.setAttribute("icon1", "TreeIcon3C");
            }else{
            	upperNodeElement.setAttribute("icon1", "AD0020011CIcon01C");
            }
        } else if (upperNodeElement.hasAttribute("target") == false) {
            // ���[�ȊO�̃m�[�h�ł���ARoot�łȂ��ꍇ
            upperNodeElement.setAttribute("ctx", "N");
            if(Calculate.compare(upperNodeStruct.getONHAND_STOCK(),upperNodeStruct.getLower_NEED_QTY()) < 0){
            	upperNodeElement.setAttribute("icon1", "TreeIcon3A");
            	upperNodeElement.setAttribute("icon2", "TreeIcon3B");
            }else{
            	upperNodeElement.setAttribute("icon1", "AD0020011CIcon01A");
            	upperNodeElement.setAttribute("icon2", "AD0020011CIcon01B");
            }
            if (lowerTreeLevel > maxLevel) {
                // �c���[�̃��x�����ő僌�x���𒴂����ꍇ
                if (lowerTreeLevel > _intMaxDevelopLevel + 1) {
                    // �c���[�̃��x�����ő�W�J���x���𒴂����ꍇ
                    // �e�m�[�h�ɉ��ʃ��x���W�J�s������ݒ�
                    upperNodeElement.setAttribute("terminated", "true");
                    // �x���F�ő�W�J���x���i{0}�j�𒴂��ēW�J���邱�Ƃ͂ł��܂���B
                    ExpjMessage emsg = new ExpjMessage("AA20018",
                            String.valueOf(_intMaxDevelopLevel));
                    upperNodeElement.setAttribute("terminate_comment",
                            emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
                } else {
                    // �e�m�[�h�ɉ��ʃ��x�����Ǎ�������ݒ�
                    upperNodeElement.setAttribute("not_read", "true");
                }
                return lowerNodeId;
            }
        }
        int lowerNodeListSize = lowerNodeList.size();
        if (maxNodeId > 0 && lowerNodeId + lowerNodeListSize - 1 > maxNodeId) {
            // �c���[�̓Ǎ��s�����ő�l�𒴂����ꍇ
            throw new AE0090040MaxReadException(new ExpjMessage("ZZ01006",
                "M_PS.COMP_ITEM_CD:" + upperNodeStruct.getLower_ITEM_CD()));
        }
        for (int i = 0; i < lowerNodeListSize; i++) {
            // �q�m�[�h�𐶐��A�c���[�pXML�ɒǉ�
            Element lowerNodeElement = flashTree.createElement("node");
            upperNodeElement.appendChild(lowerNodeElement);
            // lowerNodeStruct����q�m�[�h�̊e�푮���f�[�^��ݒ�
            String[] lowerNode = (String[])lowerNodeList.get(i);
            StringBuffer buf = new StringBuffer(lowerNode[0]);
            buf.append(",");
            buf.append(getItemName(lowerNode[0]));
            buf.append(",");
            buf.append(lowerNode[1]);
            buf.append("[");
            buf.append(lowerNode[2]);
            buf.append("-");
            buf.append(lowerNode[3]);
            buf.append("]");
            AE0090040Struct lowerNodeStruct = new AE0090040Struct();
            lowerNodeStruct.setlabel(buf.toString());
            lowerNodeStruct.setUpper_ITEM_CD(upperNodeStruct.getLower_ITEM_CD());
            lowerNodeStruct.setUpper_ITEM_NAME(upperNodeStruct.getLower_ITEM_NAME());
            lowerNodeStruct.setLower_ITEM_CD(lowerNode[0]);
            lowerNodeStruct.setLower_ITEM_NAME(lowerNode[1]);
            lowerNodeStruct.setPS_EDITION(lowerNode[1]);
            lowerNodeStruct.setPLANT_CD(struct.getPLANT_CD());
            lowerNodeStruct.setUpper_NEED_QTY(upperNodeStruct.getLower_NEED_QTY());
            // �K�v���ƍ݌ɐ��� �ݒ�
        	List onHand_StockList = null;
        	List need_QTYList = null;
            String onHand_Stock = null;
            String need_QTY = null;
            if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
        		onHand_StockList = entity.mSelectStock.read(conn,lowerNodeStruct);
        		need_QTYList = entity.mSelectNeed_QTY.read(conn,lowerNodeStruct);
        	}else{
        		onHand_StockList = entity.mSelectStock.read(conn,lowerNodeStruct);
        		need_QTYList = entity.mSelectNeed_QTYReverse.read(conn,lowerNodeStruct);
        	}
            if (onHand_StockList != null && !onHand_StockList.isEmpty() && need_QTYList != null && !need_QTYList.isEmpty()) {
				onHand_Stock = ((AE0090040Struct) onHand_StockList.get(0)).getONHAND_STOCK();
				need_QTY = ((AE0090040Struct) need_QTYList.get(0)).getLower_NEED_QTY();
				lowerNodeStruct.setONHAND_STOCK(onHand_Stock);
				lowerNodeStruct.setLower_NEED_QTY(need_QTY);
			}
            setStruct2XML(lowerNodeElement, lowerNodeStruct, lowerNodeId, lowerTreeLevel,
                    upperNodeId);
            // ���ʃ��x���m�[�h��W�J�i�ċA�I�Ƀc���[��W�J����j
            lowerNodeId = expandTree(lowerNodeElement, lowerNodeStruct, lowerNodeId,
                    lowerNodeId + 1, maxNodeId, lowerTreeLevel + 1, maxLevel);
            
            
        }

        return lowerNodeId;
    }

    /**
     * ���ʃ��x���m�[�h�̈ꗗ���擾���܂��B
     *
     * @param  itemCd �i�ڔԍ�
     * @return ���ʃ��x���m�[�h�̈ꗗ
     * @throws SQLException DB�A�N�Z�X�Ɏ��s
     * @throws ParseException ���t�̌`���ϊ��Ɏ��s
     */
    private List getLowerNodeList(String itemCd)
            throws SQLException, ParseException
    {
        if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
            // ���W�J�̏ꍇ
            if (_targetDate == null || _targetDate.equals("") == true) {
                // �Ώۓ��t�Ȃ��̏ꍇ
                return _psMaint.getCompPsList(itemCd);
            } else {
                // �Ώۓ��t����̏ꍇ
                return _psMaint.getCompPsList(itemCd, _targetDate);
            }
        } else {
            // �t�W�J�̏ꍇ
            if (_targetDate == null || _targetDate.equals("") == true) {
                // �Ώۓ��t�Ȃ��̏ꍇ
                return _psMaint.getParentPsList(itemCd);
            } else {
                // �Ώۓ��t����̏ꍇ
                return _psMaint.getParentPsList(itemCd, _targetDate);
            }
        }
    }

    /** ���W�J 
     * @param repository ���i�\�����|�W�g��
     * @param item �e�i��
     * @param deployLevel �W�J���x��
     * @param no �K�w���x��
    */
    public void getDeploy(ProductStructureRepository repository, 
          String item, Integer deployLevel, Integer no, AE0090040Struct qtyStruct)
     throws SQLException, FoundationException
    {
     // �q�i�ڔԍ��ꗗ�擾
     ArrayList itemList = repository.orderDeployment(item);
     checkItemList(itemList);
   
     // �e�i�ڂƎq�i�ڂ̍\�����擾
     ArrayList deployList = new ArrayList(0);
     AE0090040Struct workStruct = new AE0090040Struct();
     workStruct.setTarget_ITEM_CD(item);
     workStruct.setTargetDate(struct.getTargetDate());
     for(int i = 0; i < itemList.size(); i++){
      workStruct.setCOMP_ITEM_CD((String)itemList.get(i));
      List workList = entity.mSelectM_PS_F.read(conn, workStruct);
      for(int t = 0; t < workList.size(); t++){ 
       	  AE0090040Struct tempStruct = new AE0090040Struct();
     	  tempStruct = (AE0090040Struct)workList.get(t);
     	  
     	  //�K�v���ݒ�
   		  if(struct.getNEED_QTY() == null ||  "".equals(struct.getNEED_QTY()))
 		  {
 		    qtyStruct.setNEED_QTY("0");
 		  }
     	  tempStruct.setUpper_ITEM_CD(tempStruct.getPARENT_ITEM_CD());
     	  tempStruct.setUpper_NEED_QTY(qtyStruct.getNEED_QTY());
     	  tempStruct.setLower_ITEM_CD(tempStruct.getCOMP_ITEM_CD());
     	  tempStruct.setPLANT_CD(struct.getPLANT_CD());
          tempStruct.setTERM2STARTDATE(struct.getTERM2STARTDATE());    

   		  
    	  // �K�v�����v�Z
          String needQTY = null;
          List needQTYList = entity.mSelectNeed_QTY.read(conn,tempStruct);
          if(needQTYList != null && !needQTYList.isEmpty()){
        	  needQTY = ((AE0090040Struct)needQTYList.get(0)).getLower_NEED_QTY();
          }else{
        	  needQTY = "0";
          }
          
          //�݌ɒP�ʋ敪���擾
          String unit_QTY_Typ = null;
          List unit_QTY_TypList = entity.mSelectUNIT_QTY_TYP.read(conn,tempStruct);
          if(unit_QTY_TypList != null && !unit_QTY_TypList.isEmpty()){
          	unit_QTY_Typ =((AE0090040Struct)unit_QTY_TypList.get(0)).getUNIT_QTY_TYP();	
          }
          //�����Ǘ��i�ڂ̏ꍇ�͐؏グ
          if("1".equals(unit_QTY_Typ)&& !Calculate.isInteger(needQTY)){
            tempStruct.setNEED_QTY(Calculate.ceil(needQTY,0));
       	    ceilflg = true;
          }else{
        	tempStruct.setNEED_QTY(needQTY);
          }
          
    	  // �݌ɐ����v�Z
          String handQTY = null;
          List handQTYList = entity.mSelectStock.read(conn,tempStruct);
          if(handQTYList != null && !handQTYList.isEmpty()){
        	  handQTY = ((AE0090040Struct)handQTYList.get(0)).getONHAND_STOCK();
          }
          
    	  // ���ɗ\��P���v�Z
          String odrQTY1 = null;
          List odrQTY1List = entity.mSelectOdrQTY1.read(conn,tempStruct);
          if(odrQTY1List != null && !odrQTY1List.isEmpty()){
          	odrQTY1 = ((AE0090040Struct)odrQTY1List.get(0)).getRECEIPT_SCHEDULES_NUMBER1();
          }
          // ���ɗ\��2���v�Z
          String odrQTY2 = null;
          List odrQTY2List = entity.mSelectOdrQTY2.read(conn,tempStruct);
          if(odrQTY2List != null && !odrQTY2List.isEmpty()){
          	odrQTY2 = ((AE0090040Struct)odrQTY2List.get(0)).getRECEIPT_SCHEDULES_NUMBER2();
          }
          //�݌ɐ��A���ɗ\��P�A���ɗ\��2��ݒ�
          tempStruct.setUNIT_QTY(handQTY);
          tempStruct.setIN_UNIT_1(odrQTY1);
          tempStruct.setIN_UNIT_2(odrQTY2);
          workList.set(t, tempStruct);
          deployList.add((AE0090040Struct)(workList.get(t)));
      }
     }
   
     // �W�J���x���`�F�b�N
     if(deployLevel.intValue() <= 1){
      for(int i = 0; i < deployList.size(); i++){
       AE0090040Struct noStruct = (AE0090040Struct)deployList.get(i);
       noStruct.setNO(no.toString());
       _deployList.add(deployList.get(i));
      }
     }
     else{
      // �\����񂩂�X�ɉ��̎q�i�ڎ擾
      for(int i = 0; i < deployList.size(); i++){
       AE0090040Struct noStruct = (AE0090040Struct)deployList.get(i);
       noStruct.setNO(no.toString());
       _deployList.add(deployList.get(i));
       getDeploy(repository, 
           ((AE0090040Struct)deployList.get(i)).getCOMP_ITEM_CD(),
           new Integer(deployLevel.intValue() - 1),
           new Integer(no.intValue() + 1),
           (AE0090040Struct)deployList.get(i));
      }
     }
    }
    
    /** �t�W�J 
     * @param repository ���i�\�����|�W�g��
     * @param item �q�i��
     * @param deployLevel �W�J���x��
     * @param no �K�w���x��
    */
    public void getReverseDeploy(ProductStructureRepository repository, 
            String item, Integer deployLevel, Integer no, AE0090040Struct qtyStruct)
    throws SQLException, FoundationException
   {
    // �q�i�ڔԍ��ꗗ�擾
    ArrayList itemList = repository.reverseDeployment(item); 
    checkItemList(itemList);
  
    // �e�i�ڂƎq�i�ڂ̍\�����擾
    ArrayList deployList = new ArrayList(0);
    AE0090040Struct workStruct = new AE0090040Struct();
    workStruct.setCOMP_ITEM_CD(item);
    workStruct.setTargetDate(struct.getTargetDate());
    for(int i = 0; i < itemList.size(); i++){
     workStruct.setTarget_ITEM_CD((String)itemList.get(i));
     List workList = entity.mSelectM_PS_F.read(conn, workStruct);
     for(int t = 0; t < workList.size(); t++){ 
      	  AE0090040Struct tempStruct = new AE0090040Struct();
    	  tempStruct = (AE0090040Struct)workList.get(t);
    	  
     	  //�K�v���ݒ�
   		  if(struct.getNEED_QTY() == null ||  "".equals(struct.getNEED_QTY()))
 		  {
 		    qtyStruct.setNEED_QTY("0");
 		  }
    	  tempStruct.setUpper_ITEM_CD(tempStruct.getCOMP_ITEM_CD());
     	  tempStruct.setUpper_NEED_QTY(qtyStruct.getNEED_QTY());
    	  tempStruct.setLower_ITEM_CD(tempStruct.getPARENT_ITEM_CD());
    	  tempStruct.setPLANT_CD(struct.getPLANT_CD());
          tempStruct.setTERM2STARTDATE(struct.getTERM2STARTDATE());   
          
          
    	  // �K�v�����v�Z
          String needQTY = null;
          List needQTYList = entity.mSelectNeed_QTYReverse.read(conn,tempStruct);
          if(needQTYList != null && !needQTYList.isEmpty()){
        	  needQTY = ((AE0090040Struct)needQTYList.get(0)).getLower_NEED_QTY();
          }else{
        	  needQTY = "0";
          }
          
          //�݌ɒP�ʋ敪���擾
          String unit_QTY_Typ = null;
          List unit_QTY_TypList = entity.mSelectUNIT_QTY_TYP.read(conn,tempStruct);
          if(unit_QTY_TypList != null && !unit_QTY_TypList.isEmpty()){
          	unit_QTY_Typ =((AE0090040Struct)unit_QTY_TypList.get(0)).getUNIT_QTY_TYP();	
          }
          //�����Ǘ��i�ڂ̏ꍇ�͐؏グ
          if("1".equals(unit_QTY_Typ)&& !Calculate.isInteger(needQTY)){
            tempStruct.setNEED_QTY(Calculate.ceil(needQTY,0));
       	    ceilflg = true;
          }else{
        	tempStruct.setNEED_QTY(needQTY);
          }
          
   	     // �݌ɐ����v�Z
         String handQTY = null;
         List handQTYList = entity.mSelectStock.read(conn,tempStruct);
         if(handQTYList != null && !handQTYList.isEmpty()){
       	  handQTY = ((AE0090040Struct)handQTYList.get(0)).getONHAND_STOCK();
         }
         
   	     // ���ɗ\��P���v�Z
         String odrQTY1 = null;
         List odrQTY1List = entity.mSelectOdrQTY1.read(conn,tempStruct);
         if(odrQTY1List != null && !odrQTY1List.isEmpty()){
         	odrQTY1 = ((AE0090040Struct)odrQTY1List.get(0)).getRECEIPT_SCHEDULES_NUMBER1();
         }
         // ���ɗ\��2���v�Z
         String odrQTY2 = null;
         List odrQTY2List = entity.mSelectOdrQTY2.read(conn,tempStruct);
         if(odrQTY2List != null && !odrQTY2List.isEmpty()){
         	odrQTY2 = ((AE0090040Struct)odrQTY2List.get(0)).getRECEIPT_SCHEDULES_NUMBER2();
         }
         //�݌ɐ��A���ɗ\��P�A���ɗ\��2��ݒ�
         tempStruct.setUNIT_QTY(handQTY);
         tempStruct.setIN_UNIT_1(odrQTY1);
         tempStruct.setIN_UNIT_2(odrQTY2);
         workList.set(t, tempStruct);
         deployList.add((AE0090040Struct)(workList.get(t)));
     }
    }
  
    // �W�J���x���`�F�b�N
    if(deployLevel.intValue() <= 1){
     for(int i = 0; i < deployList.size(); i++){
      AE0090040Struct noStruct = (AE0090040Struct)deployList.get(i);
      noStruct.setNO(no.toString());
      _deployList.add(deployList.get(i));
     }
    }
    else{
     // �\����񂩂�X�ɏ�̐e�i�ڎ擾
     for(int i = 0; i < deployList.size(); i++){
      AE0090040Struct noStruct = (AE0090040Struct)deployList.get(i);
      noStruct.setNO(no.toString());
      _deployList.add(deployList.get(i));
      getReverseDeploy(repository, 
          ((AE0090040Struct)deployList.get(i)).getPARENT_ITEM_CD(),
          new Integer(deployLevel.intValue() - 1),
          new Integer(no.intValue() + 1),
          (AE0090040Struct)deployList.get(i));
     }
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
    
    /**
     * �i�ڔԍ��ɑ΂���i�ږ����擾���܂��B
     *
     * @param  itemCd �i�ڔԍ�
     * @return �i�ږ�
     * @throws FoundationException
     * @throws SQLException DB�A�N�Z�X�Ɏ��s
     * @throws AE0090040NoDataException DB�A�N�Z�X�Ɏ��s
     */
    private String getItemName(String itemCd)
            throws FoundationException, SQLException, AE0090040NoDataException
    {
        AE0090040Struct workStruct = new AE0090040Struct();
        workStruct.setLower_ITEM_CD(itemCd);
        List workList = entity.mSelectItem.read(conn, workStruct);
        if (workList == null || workList.isEmpty()) {
            // �i�ڔԍ������݂��Ȃ��ꍇ
            throw new AE0090040NoDataException(new ExpjMessage("ZZ01006",
                    "M_ITEM.ITEM_CD:" + itemCd));
        }
        workStruct = (AE0090040Struct)workList.get(0);
        if (workStruct.getLower_ITEM_NAME() == null) {
            return "";
        } else {
            return workStruct.getLower_ITEM_NAME();
        }
    }

    /**
     * ���ϐ���ݒ肵�܂��B
     *
     * @throws FoundationException
     * @throws ExpjException �T�[�o�[�G���[
     */
    private void setEnvironment()
            throws FoundationException, ExpjException
    {
        try {
            PrivateConfig pc = new PrivateConfig(conn);

            // �ő�W�J���x�����擾
            _intMaxDevelopLevel = DEFAULT_MAX_DEVELOP_LEVEL;
            Integer maxDevelopLevel = pc.getNumber("MAX_DISPLAY_PS_LEVEL");
            if (maxDevelopLevel != null) {
                int i = maxDevelopLevel.intValue();
                if (i < 0) {
                    // �x���F�ő�W�J���x����0�ȏ��ݒ肵�Ă��������B
                    ExpjMessage emsg = new ExpjMessage("AA20017");
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, getsysUSER_CD());
                } else {
                    _intMaxDevelopLevel = i;
                }
            }

            // �f�t�H�[���g�����W�J���x�����擾
            _intInitDevelopLevel = DEFAULT_INIT_DEVELOP_LEVEL;
            Integer initDevelopLevel = pc.getNumber("INIT_DISPLAY_PS_LEVEL");
            if (initDevelopLevel != null) {
                int i = initDevelopLevel.intValue();
                if (i < 0) {
                    // �x���F�����W�J���x����0�ȏ��ݒ肵�Ă��������B
                    ExpjMessage emsg = new ExpjMessage("AA20016");
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, getsysUSER_CD());
                } else if (i > _intMaxDevelopLevel) {
                    // �x���F�����W�J���x���͍ő�W�J���x���i{0}�j�ȓ����w�肵�Ă��������B
                    ExpjMessage emsg = new ExpjMessage("AA20001",
                            String.valueOf(_intMaxDevelopLevel));
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, getsysUSER_CD());
                    _intInitDevelopLevel = _intMaxDevelopLevel;
                } else {
                    _intInitDevelopLevel = i;
                }
            }

            // �ő�Ǎ��s����ݒ�
            _intMaxReadNum = sp.getMaxLine(conn, 10);

        } catch (SQLException se) {
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
    }

    /**
     * ��ʂ����������܂��B
     * @throws ParseException 
     * @throws SQLException 
     * @throws FoundationException 
     * @throws SQLException 
     * @throws FoundationException 
     * @throws SQLException 
     */
    private void initializeScreen()
    {
        // �Ǎ���ԁi������ԁj��ݒ�
        setReadStatus(INITIAL);
        // struct��������
        struct.initialize();
        // list��������
        if (list != null) {
            list.clear();
        }
        // �c���[��������
        flashTree = new XmlDocument();
        // �����W�J���x����ݒ�
        struct.setInitLevel(String.valueOf(_intInitDevelopLevel));
        // �ő�W�J���x����ݒ�
        struct.seth_MaxLevel(String.valueOf(_intMaxDevelopLevel));
    }
    /**
     * ��ʏ������̏ꍇ�A����2�N�_�����v�Z
     * 
     */
    private void initializeStartDate() throws FoundationException, SQLException{
    	// �H��R�[�h���擾
        String plantCd = getsysPLANT_CD();
        struct.setPLANT_CD(plantCd);
    	// �Ɩ��^�p�����擾
        String businessOprDate = DateCtrl.getBusinessOprDate(conn,plantCd);
        if(businessOprDate == null){
        	setErrorMessage("AB00026");
        	setErrorParameter("SYS_DATE_CTRL","BUSINESS_OPR_DATE",plantCd);
        	return ;
        }
        // �Ώۓ��t���擾
        struct.setTargetDate(businessOprDate);
    	// ���ɗ\�蔻����ԁk���l�k���l���擾
        String schedulesTerm = getReceiptTerm();
        // ���ɗ\�蔻�萔���擾
        String schedulesNumber = getReceiptNumber();      
        // ����2�N�_�����v�Z
        String Term2StartDate = null;
        if(schedulesTerm != null && schedulesNumber != null){
        	try{
            	businessOprDate = DateTool.addDay(businessOprDate,"1");
            	if("1".equals(schedulesTerm)){
            		Term2StartDate = DateTool.addMonth(businessOprDate,schedulesNumber);
                }else{
                	Term2StartDate = DateTool.addDay(businessOprDate,schedulesNumber);
                }
            }catch(ParseException e){
            	setErrorMessage("AE05054");
            }
            struct.setTERM2STARTDATE(Term2StartDate);
        }
    }
    /**
     * ���ɗ\�蔻����ԁk���l�k���l���擾
     * @throws SQLException 
     * @throws FoundationException 
     * 
     */
    private String getReceiptTerm() throws FoundationException, SQLException{
    	// ���ɗ\�蔻����ԁk���l�k���l���擾�A1:���A2�F��
    	List schedulesTermList = entity.mSelectReceiptTerm.read(conn,struct);
        String schedulesTerm = null;
        if(schedulesTermList == null || schedulesTermList.isEmpty()){
        	setErrorMessage("AE05051");
        	setErrorParameter("SYS_PARAMS","VALUE","RECEIPT_SCHEDULES_TERM");
        }else{
        	schedulesTerm = ((AE0090040Struct)schedulesTermList.get(0)).getRECEIPT_SCHEDULES_TERM();
        	if(!("1".equals(schedulesTerm) || "2".equals(schedulesTerm))){
        		schedulesTerm = null;
        		setErrorMessage("AE05053");
        		setErrorParameter("SYS_PARAMS","VALUE",schedulesTerm);
        	}
        }
        return schedulesTerm;
    }
    /**
     * ���ɗ\�蔻�萔���擾
     * 
     * @return String
     * @throws FoundationException
     * @throws SQLException
     */
    private String getReceiptNumber() throws FoundationException, SQLException{
    	List schedulesNumberList = entity.mSelectReceiptNumber.read(conn,struct);
        String schedulesNumber = null;
        if(schedulesNumberList == null || schedulesNumberList.isEmpty()){
        	setErrorMessage("AE05052");
        	setErrorParameter("SYS_PARAMS","VALUE","RECEIPT_SCHEDULES_NUMBER");
        }else{
        	schedulesNumber = ((AE0090040Struct)schedulesNumberList.get(0)).getRECEIPT_SCHEDULES_NUMBER();
        	if(schedulesNumber != null && Calculate.isInteger(schedulesNumber)){
        		
        	}else{
        		schedulesNumber = null;
        		setErrorMessage("AE05056");
        		setErrorParameter("SYS_PARAMS","VALUE",schedulesNumber);
        	}
        }
        return schedulesNumber;
    }
    /**
     * �ڍ׉�ʃf�[�^��Struct�����������܂��B
     */
    private void initializeDetStruct()
    {
    	struct.setDet_Parent_ITEM_CD(null);
        struct.setDet_Parent_ITEM_NAME(null);
        struct.setDet_Comp_ITEM_CD(null);
        struct.setDet_Comp_ITEM_NAME(null);
        struct.setDet_Comp_Need_QTY(null);
        struct.setDet_Comp_ONHAND_QTY(null);
        struct.setRECEIPT_SCHEDULES_NUMBER1(null);
        struct.setRECEIPT_SCHEDULES_NUMBER2(null);
        struct.setDet_Comp_STOCK_UNIT(null);
        struct.setDet_Comp_PRODUCT_TYP(null);
        struct.setDet_Comp_OUTSIDE_TYP(null);
        struct.setDet_Comp_MRP_ODR_TYP(null);
        struct.setDet_Comp_PS_UNIT_QTY(null);
        struct.setDet_Comp_ITEM_SPOIL(null);
        struct.setDet_Comp_PS_SPOIL(null);
        struct.setDet_Comp_EFF_PHASE_IN_DATE(null);
        struct.setDet_Comp_EFF_PHASE_OUT_DATE(null);
        struct.setDet_Comp_CONS_TYP(null);
      
    }

    /**
     * �R���{�{�b�N�X�̒l�A�l���X�g�A�\���������X�g��n���ƁA�l�ɑΉ�����\��������Ԃ��܂��B
     *
     * @param  val �R���{�{�b�N�X�̒l
     * @param  valList �R���{�{�b�N�X�̒l���X�g
     * @param  nameList �R���{�{�b�N�X�̕\���������X�g
     * @return �l�ɑΉ�����\������
     */
    private String getDisplayName(String val, List valList, List nameList)
    {
        if (val == null || val.equals("") == true) {
            return null;
        }
        int i = valList.indexOf(val);
        if (i == -1) {
            return null;
        } else {
            return (String)nameList.get(i);
        }
    }

    /**
     * �ڍ׉�ʃf�[�^��Struct�𕡎ʂ��܂��B
     *
     * @param  detStruct AE0090040��Struct
     */
    private void copyDetStruct(AE0090040Struct detStruct)
    {
        struct.setDet_Parent_ITEM_CD(detStruct.getDet_Parent_ITEM_CD());
        struct.setDet_Parent_ITEM_NAME(detStruct.getDet_Parent_ITEM_NAME());
        struct.setDet_Comp_ITEM_CD(detStruct.getDet_Comp_ITEM_CD());
        struct.setDet_Comp_ITEM_NAME(detStruct.getDet_Comp_ITEM_NAME());
        struct.setDet_Comp_Need_QTY(detStruct.getDet_Comp_Need_QTY());
        struct.setDet_Comp_ONHAND_QTY(detStruct.getDet_Comp_ONHAND_QTY());
        struct.setRECEIPT_SCHEDULES_NUMBER1(detStruct.getRECEIPT_SCHEDULES_NUMBER1());
        struct.setRECEIPT_SCHEDULES_NUMBER2(detStruct.getRECEIPT_SCHEDULES_NUMBER2());
        struct.setDet_Comp_STOCK_UNIT(detStruct.getDet_Comp_STOCK_UNIT());
        struct.setDet_Comp_PRODUCT_TYP(getDisplayName(detStruct.getDet_Comp_PRODUCT_TYP(),_detProductTypValList,_detProductTypNameList));
        struct.setDet_Comp_OUTSIDE_TYP(getDisplayName(detStruct.getDet_Comp_OUTSIDE_TYP(),_detOutsideTypValList, _detOutsideTypNameList));
        struct.setDet_Comp_MRP_ODR_TYP(getDisplayName(detStruct.getDet_Comp_MRP_ODR_TYP(),_detMrpOdrTypValList, _detMrpOdrTypNameList));
        struct.setDet_Comp_PS_UNIT_QTY(detStruct.getDet_Comp_PS_UNIT_QTY());
        struct.setDet_Comp_ITEM_SPOIL(detStruct.getDet_Comp_ITEM_SPOIL());
        struct.setDet_Comp_PS_SPOIL(detStruct.getDet_Comp_PS_SPOIL());
        struct.setDet_Comp_EFF_PHASE_IN_DATE(detStruct.getDet_Comp_EFF_PHASE_IN_DATE());
        struct.setDet_Comp_EFF_PHASE_OUT_DATE(detStruct.getDet_Comp_EFF_PHASE_OUT_DATE());
        struct.setDet_Comp_CONS_TYP(getDisplayName(detStruct.getDet_Comp_CONS_TYP(),_detConsTypValList,_detConsTypNameList));
    }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			list = entity.mSelectOdrQTY1.read(conn, struct);
			list = entity.mSelectOdrQTY2.read(conn, struct);
			list = entity.mSelectReceiptTerm.read(conn, struct);
			list = entity.mSelectReceiptNumber.read(conn, struct);
			list = entity.mSelectItem.read(conn, struct);
			list = entity.mSelectDetail.read(conn, struct);
			list = entity.mSelectStock.read(conn, struct);
			list = entity.mSelectUNIT_QTY_TYP.read(conn, struct);
			list = entity.mSelectNeed_QTY.read(conn, struct);
			list = entity.mSelectNeed_QTYReverse.read(conn, struct);
			list = entity.mTreeSelect.read(conn, struct);
			list = entity.mselectM_ITEM.read(conn, struct);
			list = entity.mselectSYS_DATE_CTRL.read(conn, struct);
			list = entity.mselectM_PS.read(conn, struct);
			list = entity.mselect_M_ITEM_VIEW.read(conn, struct);
			list = entity.mselectM_PS_Forward.read(conn, struct);
			list = entity.mSelectM_PS_F.read(conn, struct);
		} catch(SQLException e) {
			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * FlashTree�������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlFlashTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");
			//{{user_implement_dev:<controlFlashTree>
			
		
                //}}user_implement_dev:<controlFlashTree>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		// ���ϐ���ݒ�
        setEnvironment();
        try{
        	initializeScreen();
        	initializeStartDate();
        }catch (SQLException se) {
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006");
            sysLog.severe(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ���̕i�ڂŐ��W�J�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlShowS_Tree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowS_Tree");
			//{{user_implement_dev:<controlShowS_Tree>
		// ���̕i�ڂŐ��W�J�p�̃p�����^��ݒ�
        struct.setTarget_ITEM_CD(struct.getLower_ITEM_CD());
        struct.setDEVELOP_TYP(DEVELOP_NORMAL);
        // ���̕i�ڂŐ��W�J�p�̃p�����^�ōēǍ����āA��ʂ�\��
        controlTreeSelect();
                //}}user_implement_dev:<controlShowS_Tree>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowS_Tree");

		return;
	}

	/**
	 * ���̕i�ڂŋt�W�J�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlShowR_Tree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowR_Tree");
			//{{user_implement_dev:<controlShowR_Tree>
		// ���̕i�ڂŋt�W�J�p�̃p�����^��ݒ�
        struct.setTarget_ITEM_CD(struct.getLower_ITEM_CD());
        struct.setDEVELOP_TYP(DEVELOP_REVERSE);

        // ���̕i�ڂŋt�W�J�p�̃p�����^�ōēǍ����āA��ʂ�\��
        controlTreeSelect();
                //}}user_implement_dev:<controlShowR_Tree>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowR_Tree");

		return;
	}

	/**
	 * �ڍ׏��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlShowDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");
			//{{user_implement_dev:<controlShowDetail>
		String tableAndKeys = null;
        try {
            // �ڍ׏���ʂ̏�����
            initializeDetStruct();
            //�K�v��
            String Det_NeedQTY = null;
            //�݌ɒP�ʋ敪���擾
            String unit_QTY_Typ = null;
            List unit_QTY_TypList = entity.mSelectUNIT_QTY_TYP.read(conn,struct);
            if(unit_QTY_TypList != null && !unit_QTY_TypList.isEmpty()){
            	unit_QTY_Typ =((AE0090040Struct)unit_QTY_TypList.get(0)).getUNIT_QTY_TYP();	
            }
            if ("1".equals(struct.getid()) == true) {
                // �ŏ�ʃm�[�h�̏ꍇ
                // �e�i�ڔԍ��A�i�ږ��A�i�ڎ�z�敪�A�i�ړ��O��敪�݂̂�\��
                tableAndKeys = "M_ITEM:" + struct.getLower_ITEM_CD();
                if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                    // ���W�J�̏ꍇ
                    // �e�i�ڔԍ��A�i�ږ��A�i�ڎ�z�敪�A�i�ړ��O��敪�݂̂�\��
                    struct.setDet_Parent_ITEM_CD(struct.getLower_ITEM_CD());
                    struct.setDet_Parent_ITEM_NAME(getItemName(struct.getLower_ITEM_CD()));
                } else {
                    // �t�W�J�̏ꍇ
                    // �q�i�ڔԍ��A�i�ږ��A�i�ڎ�z�敪�A�i�ړ��O��敪�݂̂�\��
                    struct.setDet_Comp_ITEM_CD(struct.getLower_ITEM_CD());
                    struct.setDet_Comp_ITEM_NAME(getItemName(struct.getLower_ITEM_CD()));
                }
            } else {
                // �ŏ�ʃm�[�h�ȊO�̏ꍇ
                // ���ׂĂ̍��ڂ�\��
                AE0090040Struct workStruct = new AE0090040Struct();
                if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                    // ���W�J�̏ꍇ
                    workStruct.setDet_Parent_ITEM_CD(struct.getUpper_ITEM_CD());
                    workStruct.setDet_Comp_ITEM_CD(struct.getLower_ITEM_CD());
                } else {
                    // �t�W�J�̏ꍇ
                    workStruct.setDet_Parent_ITEM_CD(struct.getLower_ITEM_CD());
                    workStruct.setDet_Comp_ITEM_CD(struct.getUpper_ITEM_CD());
                }
                workStruct.setPS_EDITION(struct.getPS_EDITION());
                tableAndKeys = "M_PS,M_ITEM:" + workStruct.getDet_Parent_ITEM_CD() + ","
                        + workStruct.getDet_Comp_ITEM_CD() + "," + workStruct.getPS_EDITION();
                List workList = entity.mSelectDetail.read(conn, workStruct);
                if (workList == null || workList.isEmpty()) {
                    throw new AE0090040NoDataException(new ExpjMessage("ZZ01006", tableAndKeys));
                }
                copyDetStruct((AE0090040Struct)workList.get(0));
            }
            // �K�v����ݒ�
            Det_NeedQTY = struct.getLower_NEED_QTY();
            if("1".equals(unit_QTY_Typ)&& Calculate.isNumeric(Det_NeedQTY)==true){
            	Det_NeedQTY = Calculate.ceil(Det_NeedQTY,0);
        		setWarningMessage("AE00034");
        	}
            struct.setDet_Comp_Need_QTY(Det_NeedQTY);
            // �݌ɐ���ݒ�
            struct.setDet_Comp_ONHAND_QTY(struct.getONHAND_STOCK());
            // ���ɗ\��P���v�Z
            String odrQTY1 = null;
            List odrQTY1List = entity.mSelectOdrQTY1.read(conn,struct);
            if(odrQTY1List != null && !odrQTY1List.isEmpty()){
            	odrQTY1 = ((AE0090040Struct)odrQTY1List.get(0)).getRECEIPT_SCHEDULES_NUMBER1();
            }
            // ���ɗ\��2���v�Z
            String odrQTY2 = null;
            List odrQTY2List = entity.mSelectOdrQTY2.read(conn,struct);
            if(odrQTY2List != null && !odrQTY2List.isEmpty()){
            	odrQTY2 = ((AE0090040Struct)odrQTY2List.get(0)).getRECEIPT_SCHEDULES_NUMBER2();
            }
            //���ɗ\��P�Ɠ��ɗ\��2��ݒ�
            struct.setRECEIPT_SCHEDULES_NUMBER1(odrQTY1);
            struct.setRECEIPT_SCHEDULES_NUMBER2(odrQTY2);
        } catch (AE0090040NoDataException nde) {
            // �x���F�Ώۃf�[�^�����݂��܂���B
            ExpjMessage emsg = new ExpjMessage("ZZ06001");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            emsg = nde.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
        } catch (SQLException se) {
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006", tableAndKeys);
            sysLog.severe(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlShowDetail>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");

		return;
	}

	/**
	 * �݌ɎQ�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlStockInquiry() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlStockInquiry");
			//{{user_implement_dev:<controlStockInquiry>
			
                //}}user_implement_dev:<controlStockInquiry>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlStockInquiry");

		return;
	}

	/**
	 * �����v�惁���e�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlMaintenanceRequestOrderPlan() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlMaintenanceRequestOrderPlan");
			//{{user_implement_dev:<controlMaintenanceRequestOrderPlan>
			
                //}}user_implement_dev:<controlMaintenanceRequestOrderPlan>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlMaintenanceRequestOrderPlan");

		return;
	}

	/**
	 * �c���[�Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlTreeSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlTreeSelect");
			//{{user_implement_dev:<controlTreeSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		Element rootElement = null;
        Element topNodeElement = null;
        try {
            // �Ǎ��L�[���c���āAStruct���N���A
        	 String savePlantCD = struct.getPLANT_CD();
        	String saveTerm2StartDate = struct.getTERM2STARTDATE();
        	String saveTargetItemCd = struct.getTarget_ITEM_CD();
        	String saveDevelopTyp = struct.getDEVELOP_TYP();
            String saveTargetDate = struct.getTargetDate();
            String saveInitLevel = struct.getInitLevel();
            String saveNeedQTY = struct.getNEED_QTY_1();
            initializeScreen();
            struct.setPLANT_CD(savePlantCD);
            struct.setTERM2STARTDATE(saveTerm2StartDate);
            struct.setTarget_ITEM_CD(saveTargetItemCd);
            struct.setDEVELOP_TYP(saveDevelopTyp);
            struct.setTargetDate(saveTargetDate);
            struct.setInitLevel(saveInitLevel);
            struct.setNEED_QTY_1(saveNeedQTY);
            if (savePlantCD != null && savePlantCD.length() != 0) {
				if (entity.mSelectPlant.check(conn, struct) == false) {
					setErrorMessage("ZZ09028");
					setErrorParameter("M_PLANT", "PLANT_CD", savePlantCD);
					return;
				}
			}
            // �ő�W�J���x���`�F�b�N
            int initLevel = Integer.parseInt(struct.getInitLevel());
            if (initLevel > _intMaxDevelopLevel) {
                // ���N���C�A���g�Ń`�F�b�N����̂ŁA�����ɗ��邱�Ƃ͂Ȃ�
                // �ő�W�J���x���𒴂����ꍇ
                throw new AE0090040MaxLevelException();
            }
            // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
            beginTransaction();     // �V�X�e���������擾
            _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                    struct.getsSysdate());
            // �Ώۓ��t��ݒ�
            _targetDate = struct.getTargetDate();
            // �i�ڔԍ��A�i�ږ���ݒ�
            struct.setLower_ITEM_CD(struct.getTarget_ITEM_CD());
            struct.setLower_ITEM_NAME(getItemName(struct.getLower_ITEM_CD()));
            struct.setUpper_NEED_QTY(saveNeedQTY);
            struct.setLower_NEED_QTY(saveNeedQTY);
            // �h�L�������gRoot���쐬�A�c���[�pXML�ɒǉ�
            rootElement = flashTree.createElement("root");
            flashTree.appendChild(rootElement);
            // �h�L�������gRoot�ɏ����W�J���x����ݒ�
            rootElement.setAttribute("init_level", struct.getInitLevel());
            // �ŏ�ʃ��x���m�[�h�𐶐��A�c���[�pXML�ɒǉ�
            topNodeElement = flashTree.createElement("node");
            rootElement.appendChild(topNodeElement);
            // struct����ŏ�ʃ��x���m�[�h�̊e�푮���f�[�^��ݒ�
            // �ŏ�ʃ��x���m�[�h�́ALower_ITEM_CD�����Lower_ITEM_NAME�̂�
            struct.setlabel(struct.getLower_ITEM_CD() + "," + struct.getLower_ITEM_NAME());
            List topNodeOnHand_QTYList = null;
            String onHand_Stock = "0";
            topNodeOnHand_QTYList = entity.mSelectStock.read(conn,struct);
            if(topNodeOnHand_QTYList != null && !topNodeOnHand_QTYList.isEmpty()){
            	onHand_Stock =((AE0090040Struct)topNodeOnHand_QTYList.get(0)).getONHAND_STOCK();
            	struct.setONHAND_STOCK(onHand_Stock);
            }
            // �����Ӂ�
            // Flash ���i�̎d�l�ŁA�m�[�h�̃��x���Ƃ��āu1�v����_�Ƃ���K�v������܂��B
            setStruct2XML(topNodeElement, struct, 1, 1, 0);
            // ���ʃ��x���m�[�h��W�J�i�ċA�I�Ƀc���[��W�J����j
            // �����Ӂ�
            // �m�[�h�̃��x���̊�_���u1�v�Ȃ̂ŁA
            // �����W�J���x�����u+1�v���Ă����K�v������܂��B
            expandTree(topNodeElement, struct, 1, 2, _intMaxReadNum, 2, initLevel + 1);
            // �Ǎ���ԁi�Ǎ������j��ݒ�
            setReadStatus(NORMAL);
        } catch (AE0090040MaxLevelException mle) {
            // ���N���C�A���g�Ń`�F�b�N����̂ŁA�����ɗ��邱�Ƃ͂Ȃ�
            // �Ǎ���ԁi�Ǎ����s�j��ݒ�
            setReadStatus(ERROR);
            // �x���F�����W�J���x���͍ő�W�J���x���i{0}�j�ȓ����w�肵�Ă��������B
            ExpjMessage emsg = new ExpjMessage("AA20001", String.valueOf(_intMaxDevelopLevel));
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            return;
        } catch (AE0090040NoDataException nde) {
            // �Ǎ���ԁi�Ǎ����s�j��ݒ�
            setReadStatus(ERROR);
            // �x���F�Ώۃf�[�^�����݂��܂���B
            ExpjMessage emsg = new ExpjMessage("ZZ06001");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            emsg = nde.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
        } catch (AE0090040MaxReadException mle) {
            // �Ǎ���ԁi�ő�s���I�[�o�[�j��ݒ�
            setReadStatus(TOO_MANY);
            // �ŏ�ʍs�݂̂�W�J�s�s�Ƃ��ĕ\��
            rootElement.removeChild(topNodeElement);
            Element stopNodeElement = flashTree.createElement("node");
            rootElement.appendChild(stopNodeElement);
            setStruct2XML(stopNodeElement, struct, 1, 1, 0);
            stopNodeElement.setAttribute("terminated", "true");
            // �x���F�\���������K��l(%0)�𒴂��Ă��܂��B������ύX���Ă�蒼���Ă��������B
            ExpjMessage emsg = new ExpjMessage("ZZ01115", String.valueOf(_intMaxReadNum));
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            stopNodeElement.setAttribute("terminate_comment",
                    emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
            emsg = mle.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
        } catch (ParseException pe) {
            // �Ǎ���ԁi�Ǎ����s�j��ݒ�
            setReadStatus(ERROR);
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(pe, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            throw ee;
        } catch (SQLException se) {
            // �Ǎ���ԁi�Ǎ����s�j��ݒ�
            setReadStatus(ERROR);
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlTreeSelect>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlTreeSelect");

		return;
	}

	/**
	 * �ꗗ�Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlViewSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlViewSelect");
			//{{user_implement_dev:<controlViewSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		
		try {
			
		ceilflg=false;	
		//�H��R�[�h�`�F�b�N
		 if (struct.getPLANT_CD() != null && struct.getPLANT_CD().length() != 0) {
				if (entity.mSelectPlant.check(conn, struct) == false) {
					setErrorMessage("ZZ09028");
					setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
					return;
				}
			}
		 
		 Integer inLevel;
         // ���͂����W�J���x����Integer�^�ɕϊ����Ď擾����
		 inLevel = IntegerConverter.Convert(struct.getInitLevel());
		 
		 
		AE0090040Struct tempstruct = new AE0090040Struct();
			
        // �\����񃊃X�g�N���A
        _deployList.clear(); 
      
         List workList = null;	   // �Ώەi�ڏ��i�[                         
     	
         // �Ώەi�ڏ��擾
         workList = entity.mselectM_ITEM.read(conn, struct);
         if(workList.size() <= 0){       // �Ώەi�ڂ̎擾���s
          setReadStatus(INITIAL);
      
          String Message = "M_ITEM.ITEM_CD:" + struct.getTarget_ITEM_CD();
          setErrorMessage("ZZ06001", Message);
         } else {
          setReadStatus(NORMAL);
          tempstruct = (AE0090040Struct)workList.get(0);
          tempstruct.setPARENT_ITEM_CD(((AE0090040Struct)workList.get(0)).getTarget_ITEM_CD());
          tempstruct.setPARENT_ITEM_NAME(((AE0090040Struct)workList.get(0)).getITEM_NAME());
          tempstruct.setNO("1");          
          tempstruct.setNEED_QTY(struct.getNEED_QTY_1());

          
     	  tempstruct.setLower_ITEM_CD(((AE0090040Struct)workList.get(0)).getTarget_ITEM_CD());
     	  tempstruct.setPLANT_CD(struct.getPLANT_CD());
          tempstruct.setTERM2STARTDATE(struct.getTERM2STARTDATE());   

          //�݌ɒP�ʋ敪���擾
          String unit_QTY_Typ = null;
          List unit_QTY_TypList = entity.mSelectUNIT_QTY_TYP.read(conn,tempstruct);
          if(unit_QTY_TypList != null && !unit_QTY_TypList.isEmpty()){
          	unit_QTY_Typ =((AE0090040Struct)unit_QTY_TypList.get(0)).getUNIT_QTY_TYP();	
          }
          if("1".equals(unit_QTY_Typ)&& Calculate.isNumeric(struct.getNEED_QTY_1())==true){
       	    tempstruct.setNEED_QTY(Calculate.ceil(struct.getNEED_QTY_1(),0));
       	    ceilflg = true;
          }
          
    	  // �݌ɐ����v�Z
          String handQTY = null;
          List handQTYList = entity.mSelectStock.read(conn,tempstruct);
          if(handQTYList != null && !handQTYList.isEmpty()){
        	  handQTY = ((AE0090040Struct)handQTYList.get(0)).getONHAND_STOCK();
          }
          
    	  // ���ɗ\��P���v�Z
          String odrQTY1 = null;
          List odrQTY1List = entity.mSelectOdrQTY1.read(conn,tempstruct);
          if(odrQTY1List != null && !odrQTY1List.isEmpty()){
          	odrQTY1 = ((AE0090040Struct)odrQTY1List.get(0)).getRECEIPT_SCHEDULES_NUMBER1();
          }
          // ���ɗ\��2���v�Z
          String odrQTY2 = null;
          List odrQTY2List = entity.mSelectOdrQTY2.read(conn,tempstruct);
          if(odrQTY2List != null && !odrQTY2List.isEmpty()){
          	odrQTY2 = ((AE0090040Struct)odrQTY2List.get(0)).getRECEIPT_SCHEDULES_NUMBER2();
          }        
          
          //�݌ɐ��A���ɗ\��P�Ɠ��ɗ\��2��ݒ�
          tempstruct.setUNIT_QTY(handQTY);
          tempstruct.setIN_UNIT_1(odrQTY1);
          tempstruct.setIN_UNIT_2(odrQTY2);

          
          _deployList.add(tempstruct);
          
         }
       
         // ���i�\�����|�W�g���쐬
         ProductStructureRepository repository = new ProductStructureRepository(conn);
         struct.setNEED_QTY(struct.getNEED_QTY_1());
         //struct.setPLANT_CD(getsysPLANT_CD());
         

     	      	  

         
         
         //�\���W�J
         if("1".equals(struct.getDEVELOP_TYP()) && !"0".equals(struct.getInitLevel())){
             getDeploy(repository, struct.getTarget_ITEM_CD(), inLevel, new Integer(2),struct);
         }else if("2".equals(struct.getDEVELOP_TYP()) && !"0".equals(struct.getInitLevel())){
        	 getReverseDeploy(repository, struct.getTarget_ITEM_CD(), inLevel, new Integer(2),struct);        	 
         }
         // ��ʑJ�ڗp�W�J�敪�̐ݒ�
         struct.seth_DEVELOP_TYP(struct.getDEVELOP_TYP());
         
         //�؏グ�i�ڂ�����΃��[�j���O
         if(ceilflg==true){
       		setWarningMessage("AE00173");
         }
         //�r��
         if(this._deployList.size() == 0)
         {
         	return;
         }else{         
         	list = _deployList;
                     
	            // �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
	        	int maxLine = sp.getMaxLine(conn, 10);
	        	if ((maxLine != 0) && (list.size() > maxLine)) {
	        		setErrorMessage("ZZ01115", String.valueOf(maxLine));
	        		readStatus = TOO_MANY;
	        		list.clear();
	        		return;
	        	} 
         }
         
         
         
        } catch (SQLException se) {
            // �Ǎ���ԁi�Ǎ����s�j��ݒ�
            setReadStatus(ERROR);
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
         
        } catch(Exception e){
			e.printStackTrace();
        }
                //}}user_implement_dev:<controlViewSelect>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlViewSelect");

		return;
	}

	/**
	 * �L���݌ɎQ�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlValidStockInquiry() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlValidStockInquiry");
			//{{user_implement_dev:<controlValidStockInquiry>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlValidStockInquiry>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlValidStockInquiry");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSubClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlSubClear");
			//{{user_implement_dev:<controlSubClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// ���ϐ���ݒ�
        setEnvironment();
        try {
        	initializeScreen();
        	initializeStartDate();
        } catch (SQLException se) {
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006");
            sysLog.severe(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlSubClear>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlSubClear");

		return;
	}

	/**
	 * �c���[�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAddTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlAddTree");
			//{{user_implement_dev:<controlAddTree>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        Element rootElement = null;       
        try {
            // �ő�W�J���x���`�F�b�N
            int treeLevel = Integer.parseInt(struct.getlvl());
            // �����Ӂ�
            //   �m�[�h�̃��x���̊�_���u1�v�Ȃ̂ŁA
            //   �ő�W�J���x�����u+1�v���Ă����K�v������܂��B
            if (treeLevel + 1 > _intMaxDevelopLevel + 1) {
                // �ő�W�J���x���𒴂����ꍇ
                // ���N���C�A���g�Ń`�F�b�N����̂ŁA�����ɗ��邱�Ƃ͂Ȃ�
                throw new AE0090040MaxLevelException();
            }

            // ���i�\�������e�i���X�p�I�u�W�F�N�g���\�z
            beginTransaction();     // �V�X�e���������擾
            _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                    struct.getsSysdate());
            // �Ώۓ��t�̐ݒ�
            _targetDate = struct.getTargetDate();

            // �c���[�pXML�h�L�������g���č\�z
            flashTree = new XmlDocument();

            // �h�L�������gRoot���쐬�A�c���[�pXML�ɒǉ�
            rootElement = flashTree.createElement("root");
            flashTree.appendChild(rootElement);
            // �h�L�������gRoot�Ƀc���[�ǉ��Ώ�id��ݒ�
            rootElement.setAttribute("target", struct.getid());

            // �ő�Ǎ��s����ݒ�
            int maxReadNum = _intMaxReadNum;
            int nodeId = Integer.parseInt(struct.getmaxid());
            if (maxReadNum > 0) {
                maxReadNum += nodeId;
            } else {
                maxReadNum = 0;
            }

            // ���ʃ��x���m�[�h��W�J
            //   �����ł́A�P���x�������m�[�h��W�J����B
            //   ���̂��߁A�ő�W�J���x���Ɍ��݂̃��x���{�P��n���Ă���B
            expandTree(rootElement, struct, Integer.parseInt(struct.getid()), nodeId + 1,
                    maxReadNum, treeLevel + 1, treeLevel + 1);

        } catch (AE0090040MaxLevelException mle) {
            // ���N���C�A���g�Ń`�F�b�N����̂ŁA�����ɗ��邱�Ƃ͂Ȃ�
            // �x���F�ő�W�J���x���i{0}�j�𒴂��ēW�J���邱�Ƃ͂ł��܂���B
            ExpjMessage emsg = new ExpjMessage("AA20018", String.valueOf(_intMaxDevelopLevel));
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            return;
        } catch (AE0090040NoDataException nde) {
            // �x���F���̏����ɂ���ăf�[�^�������������Ă��܂��B�Ď��s���Ă��������B
            ExpjMessage emsg = new ExpjMessage("ZZ01105");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            emsg = nde.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
        } catch (AE0090040MaxReadException mle) {
            // �W�J�s�s�Ƃ��ĕ\��
            flashTree.removeChild(rootElement);
            Element stopNodeElement = flashTree.createElement("node");
            flashTree.appendChild(stopNodeElement);
            stopNodeElement.setAttribute("target", struct.getid());
            stopNodeElement.setAttribute("terminated", "true");
            // �x���F�\���������K��l(%0)�𒴂��Ă��܂��B������ύX���Ă�蒼���Ă��������B
            ExpjMessage emsg = new ExpjMessage("ZZ01115", String.valueOf(_intMaxReadNum));
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            stopNodeElement.setAttribute("terminate_comment",
                    emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
            emsg = mle.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
        } catch (ParseException pe) {
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(pe, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            throw ee;
        } catch (SQLException se) {
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlAddTree>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlAddTree");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

        // ���ϐ���ݒ�
        setEnvironment();

        try{
        	initializeScreen();
        	initializeStartDate();
        }catch (SQLException se) {
            // �G���[�F�T�[�o�ŃG���[���������܂����B
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006");
            sysLog.severe(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			String SysMyCompany = SystemInformation.getSysMyCompanyCd();
			try{
			if(SysMyCompany==null||SysMyCompany.length()==0){
				throw new Exception();
			}
			}catch(Exception e){
				ExpjException ee = new ExpjException(e, "KQ00039");
				throw ee;
			}
			try {
                ComboBox comboController = new ComboBox(conn, sysUSER_CD);
                // �W�J�敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                ComboStruct developTyp = comboController.getData("DEVELOP_TYP");
                struct.setList_DEVELOP_TYP_val(developTyp.getValList());
                struct.setList_DEVELOP_TYP_name(developTyp.getExplanList());
                // �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                ComboStruct detMrpOdrTyp = comboController.getData("MRP_ODR_TYP");
                _detMrpOdrTypValList = detMrpOdrTyp.getValList();
                _detMrpOdrTypNameList = detMrpOdrTyp.getExplanList();
                // ���O��敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                ComboStruct detOutsideTyp = comboController.getData("OUTSIDE_TYP");
                _detOutsideTypValList = detOutsideTyp.getValList();
                _detOutsideTypNameList = detOutsideTyp.getExplanList();
                //�\���i�ڐ��i�敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                ComboStruct detProductTyp  =comboController.getData("PRODUCT_TYP");
                _detProductTypValList = detProductTyp.getValList();
                _detProductTypNameList = detProductTyp.getExplanList();
                //�\���i�ڎx���敪�̃R���{�{�b�N�X�f�[�^��ݒ�
                ComboStruct detConsTyp = comboController.getData("CONS_TYP");
                _detConsTypValList = detConsTyp.getValList();
                _detConsTypNameList = detConsTyp.getExplanList();
            } catch (SQLException se) {
                // �G���[�F�T�[�o�ŃG���[���������܂����B
                ExpjMessage emsg = new ExpjMessage("ZZ01106");
                sysLog.severe(emsg, getsysUSER_CD());
                ExpjException ee = new ExpjException(se, emsg);
                emsg = new ExpjMessage("ZZ01006", se.toString());
                sysLog.severe(emsg, getsysUSER_CD());
                throw ee;
            }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("FlashTree") ) {
				controlFlashTree();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("ShowS_Tree") ) {
				controlShowS_Tree();
			} else if( button.equals("ShowR_Tree") ) {
				controlShowR_Tree();
			} else if( button.equals("ShowDetail") ) {
				controlShowDetail();
			} else if( button.equals("StockInquiry") ) {
				controlStockInquiry();
			} else if( button.equals("MaintenanceRequestOrderPlan") ) {
				controlMaintenanceRequestOrderPlan();
			} else if( button.equals("TreeSelect") ) {
				controlTreeSelect();
			} else if( button.equals("ViewSelect") ) {
				controlViewSelect();
			} else if( button.equals("ValidStockInquiry") ) {
				controlValidStockInquiry();
			} else if( button.equals("SubClear") ) {
				controlSubClear();
			} else if( button.equals("AddTree") ) {
				controlAddTree();
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
//			throw new FoundationException("AE0090040Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0090040-E999","CSV�̏o�͏���"));
			throw new FoundationException("AE0090040Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0090040-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AE0090040Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0090040-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AE0090040Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AE0090040Entity entity;
	protected AE0090040Struct struct;
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

		entity = new AE0090040Entity();
		struct = new AE0090040Struct();

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
	 * AE0090040�N���X�̕W���R���X�g���N�^
	 */
	public AE0090040Control() throws BusinessProcessException, FoundationException
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
				AE0090040Struct key = (AE0090040Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP") && key.getDEVELOP_TYP() != null) {
					msgKey.setKeyValue("DEVELOP_TYP", key.getDEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name") && key.getDEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_name", key.getDEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val") && key.getDEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_val", key.getDEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("InitLevel") && key.getInitLevel() != null) {
					msgKey.setKeyValue("InitLevel", key.getInitLevel());
				}
				if(msgKeyType.containsKeyColumn("h_MaxLevel") && key.geth_MaxLevel() != null) {
					msgKey.setKeyValue("h_MaxLevel", key.geth_MaxLevel());
				}
				if(msgKeyType.containsKeyColumn("AE0090040tree1") && key.getAE0090040tree1() != null) {
					msgKey.setKeyValue("AE0090040tree1", key.getAE0090040tree1());
				}
				if(msgKeyType.containsKeyColumn("id") && key.getid() != null) {
					msgKey.setKeyValue("id", key.getid());
				}
				if(msgKeyType.containsKeyColumn("lvl") && key.getlvl() != null) {
					msgKey.setKeyValue("lvl", key.getlvl());
				}
				if(msgKeyType.containsKeyColumn("parent") && key.getparent() != null) {
					msgKey.setKeyValue("parent", key.getparent());
				}
				if(msgKeyType.containsKeyColumn("label") && key.getlabel() != null) {
					msgKey.setKeyValue("label", key.getlabel());
				}
				if(msgKeyType.containsKeyColumn("ctx") && key.getctx() != null) {
					msgKey.setKeyValue("ctx", key.getctx());
				}
				if(msgKeyType.containsKeyColumn("maxid") && key.getmaxid() != null) {
					msgKey.setKeyValue("maxid", key.getmaxid());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("NEED_QTY_1") && key.getNEED_QTY_1() != null) {
					msgKey.setKeyValue("NEED_QTY_1", key.getNEED_QTY_1());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_Need_QTY") && key.getDet_Comp_Need_QTY() != null) {
					msgKey.setKeyValue("Det_Comp_Need_QTY", key.getDet_Comp_Need_QTY());
				}
				if(msgKeyType.containsKeyColumn("Upper_ITEM_NAME") && key.getUpper_ITEM_NAME() != null) {
					msgKey.setKeyValue("Upper_ITEM_NAME", key.getUpper_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_ONHAND_QTY") && key.getDet_Comp_ONHAND_QTY() != null) {
					msgKey.setKeyValue("Det_Comp_ONHAND_QTY", key.getDet_Comp_ONHAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("NO") && key.getNO() != null) {
					msgKey.setKeyValue("NO", key.getNO());
				}
				if(msgKeyType.containsKeyColumn("NEED_QTY") && key.getNEED_QTY() != null) {
					msgKey.setKeyValue("NEED_QTY", key.getNEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY") && key.getUNIT_QTY() != null) {
					msgKey.setKeyValue("UNIT_QTY", key.getUNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("IN_UNIT_1") && key.getIN_UNIT_1() != null) {
					msgKey.setKeyValue("IN_UNIT_1", key.getIN_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("IN_UNIT_2") && key.getIN_UNIT_2() != null) {
					msgKey.setKeyValue("IN_UNIT_2", key.getIN_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP") && key.geth_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("h_DEVELOP_TYP", key.geth_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER1") && key.getRECEIPT_SCHEDULES_NUMBER1() != null) {
					msgKey.setKeyValue("RECEIPT_SCHEDULES_NUMBER1", key.getRECEIPT_SCHEDULES_NUMBER1());
				}
				if(msgKeyType.containsKeyColumn("Lower_ITEM_CD") && key.getLower_ITEM_CD() != null) {
					msgKey.setKeyValue("Lower_ITEM_CD", key.getLower_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TERM2STARTDATE") && key.getTERM2STARTDATE() != null) {
					msgKey.setKeyValue("TERM2STARTDATE", key.getTERM2STARTDATE());
				}
				if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER2") && key.getRECEIPT_SCHEDULES_NUMBER2() != null) {
					msgKey.setKeyValue("RECEIPT_SCHEDULES_NUMBER2", key.getRECEIPT_SCHEDULES_NUMBER2());
				}
				if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_TERM") && key.getRECEIPT_SCHEDULES_TERM() != null) {
					msgKey.setKeyValue("RECEIPT_SCHEDULES_TERM", key.getRECEIPT_SCHEDULES_TERM());
				}
				if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER") && key.getRECEIPT_SCHEDULES_NUMBER() != null) {
					msgKey.setKeyValue("RECEIPT_SCHEDULES_NUMBER", key.getRECEIPT_SCHEDULES_NUMBER());
				}
				if(msgKeyType.containsKeyColumn("Lower_ITEM_NAME") && key.getLower_ITEM_NAME() != null) {
					msgKey.setKeyValue("Lower_ITEM_NAME", key.getLower_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det_Parent_ITEM_CD") && key.getDet_Parent_ITEM_CD() != null) {
					msgKey.setKeyValue("Det_Parent_ITEM_CD", key.getDet_Parent_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Det_Parent_ITEM_NAME") && key.getDet_Parent_ITEM_NAME() != null) {
					msgKey.setKeyValue("Det_Parent_ITEM_NAME", key.getDet_Parent_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_CD") && key.getDet_Comp_ITEM_CD() != null) {
					msgKey.setKeyValue("Det_Comp_ITEM_CD", key.getDet_Comp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_NAME") && key.getDet_Comp_ITEM_NAME() != null) {
					msgKey.setKeyValue("Det_Comp_ITEM_NAME", key.getDet_Comp_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_STOCK_UNIT") && key.getDet_Comp_STOCK_UNIT() != null) {
					msgKey.setKeyValue("Det_Comp_STOCK_UNIT", key.getDet_Comp_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_PRODUCT_TYP") && key.getDet_Comp_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("Det_Comp_PRODUCT_TYP", key.getDet_Comp_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_MRP_ODR_TYP") && key.getDet_Comp_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("Det_Comp_MRP_ODR_TYP", key.getDet_Comp_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_OUTSIDE_TYP") && key.getDet_Comp_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("Det_Comp_OUTSIDE_TYP", key.getDet_Comp_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_PS_UNIT_QTY") && key.getDet_Comp_PS_UNIT_QTY() != null) {
					msgKey.setKeyValue("Det_Comp_PS_UNIT_QTY", key.getDet_Comp_PS_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_SPOIL") && key.getDet_Comp_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("Det_Comp_ITEM_SPOIL", key.getDet_Comp_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_EFF_PHASE_IN_DATE") && key.getDet_Comp_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("Det_Comp_EFF_PHASE_IN_DATE", key.getDet_Comp_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_EFF_PHASE_OUT_DATE") && key.getDet_Comp_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("Det_Comp_EFF_PHASE_OUT_DATE", key.getDet_Comp_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_PS_SPOIL") && key.getDet_Comp_PS_SPOIL() != null) {
					msgKey.setKeyValue("Det_Comp_PS_SPOIL", key.getDet_Comp_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_CONS_TYP") && key.getDet_Comp_CONS_TYP() != null) {
					msgKey.setKeyValue("Det_Comp_CONS_TYP", key.getDet_Comp_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("ONHAND_STOCK") && key.getONHAND_STOCK() != null) {
					msgKey.setKeyValue("ONHAND_STOCK", key.getONHAND_STOCK());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("Lower_NEED_QTY") && key.getLower_NEED_QTY() != null) {
					msgKey.setKeyValue("Lower_NEED_QTY", key.getLower_NEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("Upper_NEED_QTY") && key.getUpper_NEED_QTY() != null) {
					msgKey.setKeyValue("Upper_NEED_QTY", key.getUpper_NEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("Upper_ITEM_CD") && key.getUpper_ITEM_CD() != null) {
					msgKey.setKeyValue("Upper_ITEM_CD", key.getUpper_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Target_ITEM_CD") && key.getTarget_ITEM_CD() != null) {
					msgKey.setKeyValue("Target_ITEM_CD", key.getTarget_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("NUMERATOR") && key.getNUMERATOR() != null) {
					msgKey.setKeyValue("NUMERATOR", key.getNUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("DENOMINATOR") && key.getDENOMINATOR() != null) {
					msgKey.setKeyValue("DENOMINATOR", key.getDENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("TargetDate") && key.getTargetDate() != null) {
					msgKey.setKeyValue("TargetDate", key.getTargetDate());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME") && key.getCOMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("COMP_ITEM_NAME", key.getCOMP_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD_VIEW") && key.getITEM_CD_VIEW() != null) {
					msgKey.setKeyValue("ITEM_CD_VIEW", key.getITEM_CD_VIEW());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME") && key.getPARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ITEM_NAME", key.getPARENT_ITEM_NAME());
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
					AE0090040Struct key = new AE0090040Struct();
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP")) {
						key.setDEVELOP_TYP(msgKey.getKeyValue("DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name")) {
						key.setDEVELOP_TYP_name(msgKey.getKeyValue("DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val")) {
						key.setDEVELOP_TYP_val(msgKey.getKeyValue("DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("InitLevel")) {
						key.setInitLevel(msgKey.getKeyValue("InitLevel"));
					}
					if(msgKeyType.containsKeyColumn("h_MaxLevel")) {
						key.seth_MaxLevel(msgKey.getKeyValue("h_MaxLevel"));
					}
					if(msgKeyType.containsKeyColumn("AE0090040tree1")) {
						key.setAE0090040tree1(msgKey.getKeyValue("AE0090040tree1"));
					}
					if(msgKeyType.containsKeyColumn("id")) {
						key.setid(msgKey.getKeyValue("id"));
					}
					if(msgKeyType.containsKeyColumn("lvl")) {
						key.setlvl(msgKey.getKeyValue("lvl"));
					}
					if(msgKeyType.containsKeyColumn("parent")) {
						key.setparent(msgKey.getKeyValue("parent"));
					}
					if(msgKeyType.containsKeyColumn("label")) {
						key.setlabel(msgKey.getKeyValue("label"));
					}
					if(msgKeyType.containsKeyColumn("ctx")) {
						key.setctx(msgKey.getKeyValue("ctx"));
					}
					if(msgKeyType.containsKeyColumn("maxid")) {
						key.setmaxid(msgKey.getKeyValue("maxid"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("NEED_QTY_1")) {
						key.setNEED_QTY_1(msgKey.getKeyValue("NEED_QTY_1"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_Need_QTY")) {
						key.setDet_Comp_Need_QTY(msgKey.getKeyValue("Det_Comp_Need_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Upper_ITEM_NAME")) {
						key.setUpper_ITEM_NAME(msgKey.getKeyValue("Upper_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_ONHAND_QTY")) {
						key.setDet_Comp_ONHAND_QTY(msgKey.getKeyValue("Det_Comp_ONHAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("NO")) {
						key.setNO(msgKey.getKeyValue("NO"));
					}
					if(msgKeyType.containsKeyColumn("NEED_QTY")) {
						key.setNEED_QTY(msgKey.getKeyValue("NEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY")) {
						key.setUNIT_QTY(msgKey.getKeyValue("UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IN_UNIT_1")) {
						key.setIN_UNIT_1(msgKey.getKeyValue("IN_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("IN_UNIT_2")) {
						key.setIN_UNIT_2(msgKey.getKeyValue("IN_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP")) {
						key.seth_DEVELOP_TYP(msgKey.getKeyValue("h_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER1")) {
						key.setRECEIPT_SCHEDULES_NUMBER1(msgKey.getKeyValue("RECEIPT_SCHEDULES_NUMBER1"));
					}
					if(msgKeyType.containsKeyColumn("Lower_ITEM_CD")) {
						key.setLower_ITEM_CD(msgKey.getKeyValue("Lower_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TERM2STARTDATE")) {
						key.setTERM2STARTDATE(msgKey.getKeyValue("TERM2STARTDATE"));
					}
					if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER2")) {
						key.setRECEIPT_SCHEDULES_NUMBER2(msgKey.getKeyValue("RECEIPT_SCHEDULES_NUMBER2"));
					}
					if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_TERM")) {
						key.setRECEIPT_SCHEDULES_TERM(msgKey.getKeyValue("RECEIPT_SCHEDULES_TERM"));
					}
					if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER")) {
						key.setRECEIPT_SCHEDULES_NUMBER(msgKey.getKeyValue("RECEIPT_SCHEDULES_NUMBER"));
					}
					if(msgKeyType.containsKeyColumn("Lower_ITEM_NAME")) {
						key.setLower_ITEM_NAME(msgKey.getKeyValue("Lower_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det_Parent_ITEM_CD")) {
						key.setDet_Parent_ITEM_CD(msgKey.getKeyValue("Det_Parent_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Det_Parent_ITEM_NAME")) {
						key.setDet_Parent_ITEM_NAME(msgKey.getKeyValue("Det_Parent_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_CD")) {
						key.setDet_Comp_ITEM_CD(msgKey.getKeyValue("Det_Comp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_NAME")) {
						key.setDet_Comp_ITEM_NAME(msgKey.getKeyValue("Det_Comp_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_STOCK_UNIT")) {
						key.setDet_Comp_STOCK_UNIT(msgKey.getKeyValue("Det_Comp_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_PRODUCT_TYP")) {
						key.setDet_Comp_PRODUCT_TYP(msgKey.getKeyValue("Det_Comp_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_MRP_ODR_TYP")) {
						key.setDet_Comp_MRP_ODR_TYP(msgKey.getKeyValue("Det_Comp_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_OUTSIDE_TYP")) {
						key.setDet_Comp_OUTSIDE_TYP(msgKey.getKeyValue("Det_Comp_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_PS_UNIT_QTY")) {
						key.setDet_Comp_PS_UNIT_QTY(msgKey.getKeyValue("Det_Comp_PS_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_SPOIL")) {
						key.setDet_Comp_ITEM_SPOIL(msgKey.getKeyValue("Det_Comp_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_EFF_PHASE_IN_DATE")) {
						key.setDet_Comp_EFF_PHASE_IN_DATE(msgKey.getKeyValue("Det_Comp_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_EFF_PHASE_OUT_DATE")) {
						key.setDet_Comp_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("Det_Comp_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_PS_SPOIL")) {
						key.setDet_Comp_PS_SPOIL(msgKey.getKeyValue("Det_Comp_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_CONS_TYP")) {
						key.setDet_Comp_CONS_TYP(msgKey.getKeyValue("Det_Comp_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("ONHAND_STOCK")) {
						key.setONHAND_STOCK(msgKey.getKeyValue("ONHAND_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Lower_NEED_QTY")) {
						key.setLower_NEED_QTY(msgKey.getKeyValue("Lower_NEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Upper_NEED_QTY")) {
						key.setUpper_NEED_QTY(msgKey.getKeyValue("Upper_NEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Upper_ITEM_CD")) {
						key.setUpper_ITEM_CD(msgKey.getKeyValue("Upper_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Target_ITEM_CD")) {
						key.setTarget_ITEM_CD(msgKey.getKeyValue("Target_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("NUMERATOR")) {
						key.setNUMERATOR(msgKey.getKeyValue("NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("DENOMINATOR")) {
						key.setDENOMINATOR(msgKey.getKeyValue("DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TargetDate")) {
						key.setTargetDate(msgKey.getKeyValue("TargetDate"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME")) {
						key.setCOMP_ITEM_NAME(msgKey.getKeyValue("COMP_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD_VIEW")) {
						key.setITEM_CD_VIEW(msgKey.getKeyValue("ITEM_CD_VIEW"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME")) {
						key.setPARENT_ITEM_NAME(msgKey.getKeyValue("PARENT_ITEM_NAME"));
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
