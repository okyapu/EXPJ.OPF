/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0170/src/com/nec/jp/orteus/metamorBase/AA0170/AA0170010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0170;

import com.nec.jp.orteus.metamorBase.AA0170.*;
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
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import java.util.ArrayList;
import java.text.ParseException;
import java.math.BigDecimal;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0170010Control
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
        protected List list;										    // ���ʃ��X�g�̃C���X�^���X
        public List getList() { return this.list; }					     // ���X�g��Ԃ��܂��B
        public void setList(List listname) { this.list = listname; }    // ���X�g���Z�b�g���܂��B
        public int getListsize() {									      // ���X�g�^�̃T�C�Y��Ԃ��܂��B
         int nret = 0;
         if ( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }  // ���X�g�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
        public AA0170010Struct getStruct() { return this.struct; }      // Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B
       
    //------------------------------------------------------------------------------
       
    /** ��ʋ��ʒ�`�擾�N���X */
    ScreenParam _scParam = sp;
     
    //---------- �����W�J���x�� ---------------------------------------------------
       
    /** �ő�W�J���x�� */
    String _level = null;
      
    /** �����W�J���x�� */
    String _initlevel = null;
    
    //---------- �o�^�σt���O
    
    /** �o�^�ς� */
    String _REGISTED = "1";
    
    /** ���o�^ */
    String _NOT_REGISTED = "0";
    
       
    //---------- �R���{�{�b�N�X�f�[�^�擾�֘A�̏��� -------------------------------
       
    /** �W�J�敪 */
    ComboStruct _DEVELOP_TYP = new ComboStruct();
       
    /** �W�J�敪�ݒ�
     * @param �R���{�{�b�N�X�f�[�^
    */
    public void setDEVELOP_TYP(ComboStruct combo) { _DEVELOP_TYP = combo; }
       
    /** �W�J�敪�擾
     * @return �W�J�敪�̃R���{�{�b�N�X�f�[�^
    */
    public ComboStruct getDEVELOP_TYP() { return _DEVELOP_TYP; }
     
        
    /** �x���敪 */
    ComboStruct _CONS_TYP = new ComboStruct();
       
    /** �x���敪�ݒ�
     * @param �R���{�{�b�N�X�f�[�^
    */
    public void setCONS_TYP(ComboStruct combo) { _CONS_TYP = combo; }
       
    /** �x���敪�擾
     * @return �x���敪�̃R���{�{�b�N�X�f�[�^
    */
    public ComboStruct getCONS_TYP() { return _CONS_TYP; }
       
       
    /** �����ςݏグ�L�� */
    ComboStruct _COST_UP_TYP = new ComboStruct();
       
    /** �����ςݏグ�L�� �ݒ�
     * @param �R���{�{�b�N�X�f�[�^
    */
    public void setCOST_UP_TYP(ComboStruct combo) { _COST_UP_TYP = combo; }
       
    /** �����ςݏグ�L�� �擾
     * @return �����ςݏグ�L�� �̃R���{�{�b�N�X�f�[�^
    */
    public ComboStruct getCOST_UP_TYP() { return _COST_UP_TYP; }
             
    /** MRP�W�J�L�� */
    ComboStruct _MRP_EXP_TYP = new ComboStruct();
        
    /** MRP�W�J�L���ݒ�
     * @param �R���{�{�b�N�X�f�[�^
    */
    public void setMRP_EXP_TYP(ComboStruct combo) { _MRP_EXP_TYP = combo; }
       
    /** MRP�W�J�L���擾
     * @return MRP�W�J�L���̃R���{�{�b�N�X�f�[�^
    */
    public ComboStruct getMRP_EXP_TYP() { return _MRP_EXP_TYP; }  
    
// 2008/07/16 SYSCOM ���� ADD START
    /** �H���Ǘ��i�ڋ敪 */
    ComboStruct _MANHOUR_TYP = new ComboStruct();
    
    /** �H���Ǘ��i�ڋ敪�ݒ�
     * @param �R���{�{�b�N�X�f�[�^
    */
    public void setMANHOUR_TYP(ComboStruct combo){ _MANHOUR_TYP = combo; }
    
    /** �H���Ǘ��i�ڋ敪
     * @return �H���Ǘ��i�ڋ敪�̃R���{�{�b�N�X�f�[�^
    */
    public ComboStruct getMANHOUR_TYP(){ return _MANHOUR_TYP; }
// 2008/07/16 SYSCOM ���� ADD END
       
    /** ���i�\��L/T�̎g�p�L�� */
    ComboStruct _PS_LT_FLG = new ComboStruct();
        
    /** ���i�\��L/T�̎g�p�L���ݒ�
     * @param �R���{�{�b�N�X�f�[�^
    */
    public void setPS_LT_FLG(ComboStruct combo) { _PS_LT_FLG = combo; }
       
    /** ���i�\��L/T�̎g�p�L���擾
     * @return ���i�\��L/T�̎g�p�L���̃R���{�{�b�N�X�f�[�^
    */
    public ComboStruct getPS_LT_FLG() { return _PS_LT_FLG; }

    /** �i�ڎ�z�敪 */
    ComboStruct _MRP_ODR_TYP = new ComboStruct();
   
    /** �i�ڎ�z�敪�ݒ�
     * @param �R���{�{�b�N�X�f�[�^
     */
    public void setMRP_ODR_TYP_comb(ComboStruct combo) { _MRP_ODR_TYP = combo; }
   
    /** �i�ڎ�z�敪�擾
     * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
     */
    public ComboStruct getMRP_ODR_TYP_comb() { return _MRP_ODR_TYP; }
   
    /** ���O��敪(�i�ڕʁE��ƌn���) */
    ComboStruct _OUTSIDE_TYP = new ComboStruct();
   
    /** ���O��敪�ݒ�
     * @param �R���{�{�b�N�X�f�[�^
    */
    public void setOUTSIDE_TYP_comb(ComboStruct combo) { _OUTSIDE_TYP = combo; }
   
    /** ���O��敪�擾
     * @return ���O��敪�̃R���{�{�b�N�X�f�[�^
    */
    public ComboStruct getOUTSIDE_TYP_comb() { return _OUTSIDE_TYP; }
   
    /** �i�ڕʍ�Ǝ��ы敪 */
    ComboStruct _OPR_RSLT_TYP = new ComboStruct();
   
    /** �i�ڕʍ�Ǝ��ы敪�ݒ�
     * @param �R���{�{�b�N�X�f�[�^
    */
    public void setOPR_RSLT_TYP_comb(ComboStruct combo) { _OPR_RSLT_TYP = combo; }
   
    /** �i�ڕʍ�Ǝ��ы敪�擾
     * @return �i�ڕʍ�Ǝ��ы敪�̃R���{�{�b�N�X�f�[�^
    */
    public ComboStruct getOPR_RSLT_TYP_comb() { return _OPR_RSLT_TYP; }
   
    /** ��������敪 */
    ComboStruct _ACPT_INSPC_TYP = new ComboStruct();
       
    /** ��������敪�ݒ�
     * @param �R���{�{�b�N�X�f�[�^
     */
    public void setACPT_INSPC_TYP_comb(ComboStruct combo) { _ACPT_INSPC_TYP = combo; }
       
    /** ��������敪�擾
     * @return ��������敪�̃R���{�{�b�N�X�f�[�^
     */
    public ComboStruct getACPT_INSPC_TYP_comb() { return _ACPT_INSPC_TYP; }
 
    /** ��ƌn��Œ蕪���[�h�^�C���P�� */
    ComboStruct _PROC_GRP_LT_UNIT = new ComboStruct();
       
    /** ��ƌn��Œ蕪���[�h�^�C���P�ʐݒ�
     * @param �R���{�{�b�N�X�f�[�^
     */
    public void setPROC_GRP_LT_UNIT_comb(ComboStruct combo) { _PROC_GRP_LT_UNIT = combo; }
       
    /** ��ƌn��Œ蕪���[�h�^�C���P�ʎ擾
     * @return ��ƌn��Œ蕪���[�h�^�C���P�ʂ̃R���{�{�b�N�X�f�[�^
     */
    public ComboStruct getPROC_GRP_LT_UNIT_comb() { return _PROC_GRP_LT_UNIT; }
	/**
	 * �R���{�{�b�N�X�̒��g���擾���܂��B
	 *
	 * @param data �f�[�^�̔�
	 */
    private void setComboData(AA0170010Struct data) throws ExpjException {
    	
    	ComboBox comboController = new ComboBox(conn, sysUSER_CD);
    	
    	try {
    		
    		//�R���{�f�[�^�̎擾
    		ComboStruct OUTSIDE_TYP_comb = comboController.getData("OUTSIDE_TYP");
    		ComboStruct ACPT_INSPC_TYP_comb = comboController.getData("ACPT_INSPC_TYP");
   
    		comboController.setConnection(null);
   
    		//�����Ɏ擾�f�[�^�ݒ�
    		setOUTSIDE_TYP_comb(OUTSIDE_TYP_comb);
    		setACPT_INSPC_TYP_comb(ACPT_INSPC_TYP_comb);
   
    	} catch(SQLException e) {
    		setSqlExceptionMsg(e);
   
    	} catch(ComboException e) {
    		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
    		sysLog.severe(emsg, getsysUSER_CD());
    		ExpjException ee = new ExpjException(e, emsg);
    		throw ee;
    	}
    }
    
	/**
	 * �敪���擾
	 * @param comboStruct �敪��񃊃X�g
	 * @param strTyp �敪�R�[�h
	 * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
	 */
	private String getTypeName(ComboStruct comboStruct, String strTyp) {
	 
		if (comboStruct == null || strTyp == null) {
			return null;
		}
		String strTypName = strTyp;
		for (int i = 0; i < comboStruct.getValList().size(); i++) {
			if (strTyp.equals((String)(comboStruct.getValList().get(i))) == true) {
				strTypName = (String)(comboStruct.getExplanList().get(i));
				break;
			}
		}
		if (strTypName == null) {
			strTypName = strTyp;
		}
		return strTypName;
	}
       
        /**
         * ���i�\�����̃t���O�̕\����ݒ�
         * @param s �t���O�̒l���ݒ肳��Ă�����A�\����ݒ肷����
         */
        private void setTypeValueAboutPs(AA0170010Struct s)
        {
         s.setps_CONS_NAME(getTypeName(_CONS_TYP,s.getps_CONS_TYP()));
         s.setps_PS_LT_NAME(getTypeName(_PS_LT_FLG,s.getps_PS_LT_FLG()));
         s.setps_COST_UP_NAME(getTypeName(_COST_UP_TYP,s.getps_COST_UP_TYP()));
         s.setps_MRP_EXP_NAME(getTypeName(_MRP_EXP_TYP,s.getps_MRP_EXP_TYP()));
// 2008/07/16 SYSCOM ���� ADD START
         s.setps_COMP_MANHOUR_NAME(getTypeName(_MANHOUR_TYP,s.getps_COMP_MANHOUR_TYP()));
// 2008/07/16 SYSCOM ���� ADD END
        }
       
       //---------- �e�q��ʊ֘A�̏��� -------------------------------------------
       
        /** �q�ːe�ɉ�ʑJ�ڂ����ꍇ�̃L�[���ێ��ׂ̈�Struct */
        private AA0170010Struct _keyStruct = new AA0170010Struct();
       
        /** �L�[���Struct�̎擾 */
        public AA0170010Struct getKeyStruct() { return _keyStruct; }
        
        /** �L�[���Struct�̐ݒ� */
        public void setKeyStruct(AA0170010Struct struct) { _keyStruct.copy(struct); }
       
       
       //---------- �ǉ��E�X�V���̓��͒l�`�F�b�N--------------------------------------
       
	/** 
	 * �T�u�P��ʓ��͒l�`�F�b�N�B
	 * NOT NULL���ڂɒl�������Ă��Ȃ��ꍇ�A�f�t�H���g�l��ݒ肷��
	 * @param checkStruct �`�F�b�N�Ώۂ�Struct
	 */
	private void checkInputSub1(AA0170010Struct checkStruct) {
		// �Ɖ��
		if (checkStruct.getsub1_PS_REF_NO() == null
				|| "".equals(checkStruct.getsub1_PS_REF_NO())) {
			checkStruct.setsub1_PS_REF_NO(AA0170Common._PS_REF_NO);
		}
			
		// �\���d����
		if (checkStruct.getsub1_PS_SPOIL() == null
				|| "".equals(checkStruct.getsub1_PS_SPOIL())) {
			checkStruct.setsub1_PS_SPOIL(AA0170Common._PS_SPOIL);
		}
		
        // �\���Œ蕪���[�h�^�C��
		if (checkStruct.getsub1_PS_FIXED_LT() == null
				|| "".equals(checkStruct.getsub1_PS_FIXED_LT())) {
			checkStruct.setsub1_PS_FIXED_LT(AA0170Common._PS_FIXED_LT);
		}

		// �\����ᕪ���[�h�^�C��
		if (checkStruct.getsub1_PS_PROP_LT() == null
				|| "".equals(checkStruct.getsub1_PS_PROP_LT())) {
			checkStruct.setsub1_PS_PROP_LT(AA0170Common._PS_PROP_LT);
		}
        // �\����ᕪ���b�g�T�C�Y
		
		if (checkStruct.getsub1_PS_PROP_LOT_SIZE() == null
				|| "".equals(checkStruct.getsub1_PS_PROP_LOT_SIZE())) {
			checkStruct.setsub1_PS_PROP_LOT_SIZE(AA0170Common._PS_PROP_LOT_SIZE);
        }
	}

    /**
     * �T�u�Q��ʓ��͒l�`�F�b�N�B
     * NOT NULL���ڂɒl�������Ă��Ȃ��ꍇ�A�����l��ݒ肷��
     * @param checkStruct �`�F�b�N�Ώۂ�Struct
     */
    private void checkInputSub2(AA0170010Struct checkStruct) {
    	
    	// ��ƌn��ԍ�
    	if (checkStruct.getsub2_PROC_NO() == null
    			|| "".equals(checkStruct.getsub2_PROC_NO())) {
    		checkStruct.setsub2_PROC_NO(AA0170Common._PR_PROC_NO);
    	}
     
    	// ��ƌn��Œ蕪���[�h�^�C��
    	if (checkStruct.getsub2_FIXED_LT() == null
    			|| "".equals(checkStruct.getsub2_FIXED_LT())) {
    		checkStruct.setsub2_FIXED_LT(AA0170Common._PR_FIXED_LT);
    	}
    	 
    	// ��ƌn���ᕪ���[�h�^�C��
    	if (checkStruct.getsub2_PROP_LT() == null
    			|| "".equals(checkStruct.getsub2_PROP_LT())) {
    		checkStruct.setsub2_PROP_LT(AA0170Common._PR_PROP_LT);	
    	}
     
    	// ��ƌn����S����
    	if (checkStruct.getsub2_SAFETY_LT() == null
    			|| "".equals(checkStruct.getsub2_SAFETY_LT())) {
    		checkStruct.setsub2_SAFETY_LT(AA0170Common._PR_SAFETY_LT);
    	}
   
    	// ��ƌn���ᕪ���b�g�T�C�Y
    	if (checkStruct.getsub2_PROP_LOT_SIZE() == null
    			|| "".equals(checkStruct.getsub2_PROP_LOT_SIZE())) {
    		checkStruct.setsub2_PROP_LOT_SIZE(AA0170Common._PR_PROP_LOT_SIZE);
    	}
    	
    	// ��ƌn��d����
    	if (checkStruct.getsub2_SPOIL() == null
    			|| "".equals(checkStruct.getsub2_SPOIL())) {
    		checkStruct.setsub2_SPOIL(AA0170Common._PR_SPOIL);
    	}
    	
    	// �W���H��
    	if (checkStruct.getsub2_STANDARD_COST() == null
    			|| "".equals(checkStruct.getsub2_STANDARD_COST())) {
    		checkStruct.setsub2_STANDARD_COST(AA0170Common._PR_STANDARD_COST);
    	} 	
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
       //---------- ���b�Z�[�W�֘A�̏���-- --------------------------------------------
       
	/**
	 * ���b�Z�[�W�擾 
	 * @return ���b�Z�[�W
	 */
	public MessageStruct getMessage() {
	
		return msgStruct;
   
	}
       
	/**
	 * ���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W
	 */
	public void setMessage(MessageStruct msg) {
		
		msgStruct = msg;
        
	}
       
       //---------- ���[�s���O�`�F�b�N���� -------------------------------------------
       
	/**
	 * ���[�s���O�`�F�b�N�B�t�W�J���s�����i�ڔԍ������� �L��
	 * @param repository ���i�\�����|�W�g��
	 * @param checkItem �Ώەi�ڔԍ�
	 * @param item ��r����i�ڔԍ�
	 * @return true:�L  false:��
	 */
	private boolean checkReverseRooping(ProductStructureRepository repository, 
				String targetItem, String item)
				throws SQLException {
		// �e�i�ڔԍ��ꗗ�擾
		ArrayList itemList = repository.reverseDeployment(item);
		checkItemList(itemList);
       
		for (int i = 0; i < itemList.size(); i++) {
			if (targetItem.equals((String)itemList.get(i)) == false) {
				// �e�i�ڔԍ��ꗗ����X�ɏ�̐e�i�ڎ擾
				boolean result = checkReverseRooping(repository, 
														targetItem, 
														(String)itemList.get(i));
				if (result == true) {
					return true;
				}
			} else {
				return true;
			}
       	}
		return false;
	}
       
       
	/**
	 * ���[�s���O�`�F�b�N�B���W�J���s�����i�ڔԍ������� �L��
	 * @param repository ���i�\�����|�W�g��
	 * @param checkItem �Ώەi�ڔԍ�
	 * @param item ��r����i�ڔԍ�
	 * @return true:�L  false:��
	 */
	private boolean checkRooping(ProductStructureRepository repository, 
	        String targetItem, String item)
			throws SQLException {
		// �q�i�ڔԍ��ꗗ�擾
		ArrayList itemList = repository.orderDeployment(item);
		checkItemList(itemList);
       
		for (int i = 0; i < itemList.size(); i++) {
			if (targetItem.equals((String)itemList.get(i)) == false) {
				// �q�i�ڔԍ��ꗗ����X�ɉ��̎q�i�ڎ擾
				boolean result = checkRooping(repository, 
												targetItem, 
												(String)itemList.get(i));
				if (result == true) {
					return true;
				}
			} else {
				return true;
			}
		}
         	return false;
	}
       
       //---------- �L�����̏d���`�F�b�N���� -----------------------------------------
       
	/**
	 * �L�����̏d���`�F�b�N
	 * @param parentItem �e�i�ڔԍ�
	 * @param compItem   �q�i�ڔԍ�
	 * @param psedition  �\���Ő�
	 * @param inDate     �L���J�n��
	 * @param outDate    �L���I����
	 * @return true:OK   false:NG
	*/
	private boolean checkEffectiveDate_update(String parentItem, String compItem, String psedition,
			String inDate, String outDate)
			throws SQLException, FoundationException, ParseException {
		
		// �e�i�ځA�q�i�ڂ���v����\�����擾
		AA0170010Struct workStruct = new AA0170010Struct();
		workStruct.setPARENT_ITEM_CD(parentItem);
		workStruct.setCOMP_ITEM_CD(compItem);
		List dateList = entity.mselectM_PS_eff_phase_date.read(conn, workStruct);
       
		// ���\�����͔�r�Ώۂ���폜
		for (int i = 0; i < dateList.size(); i++) {
			AA0170010Struct checkStruct = (AA0170010Struct)dateList.get(i);
			if (parentItem.equals(checkStruct.getPARENT_ITEM_CD()) &&
					compItem.equals(checkStruct.getCOMP_ITEM_CD()) &&
					psedition.equals(checkStruct.getPS_EDITION())) {
				dateList.remove(i);
				break;
			}
		}
		return checkEffectiveDate(dateList, inDate, outDate);
	}
       
	/**
	 * �L�����̏d���`�F�b�N
	 * @param parentItem �e�i�ڔԍ�
	 * @param compItem �q�i�ڔԍ�
	 * @param inDate �L���J�n��
	 * @param outDate �L���I����
	 * @return true:OK  false:NG
	 */
	private boolean checkEffectiveDate_insert(String parentItem, String compItem,
			String inDate, String outDate)
			throws SQLException, FoundationException, ParseException {
   
		// �e�i�ځA�q�i�ڂ���v����\�����擾
		AA0170010Struct workStruct = new AA0170010Struct();
		workStruct.setPARENT_ITEM_CD(parentItem);
		workStruct.setCOMP_ITEM_CD(compItem);
		List dateList = entity.mselectM_PS_eff_phase_date.read(conn, workStruct);
		return checkEffectiveDate(dateList, inDate, outDate);
    }
       
	/**
	 * �L�����̏d���`�F�b�N
	 * @param dateList �d���`�F�b�N����\�����
	 * @param inDate �L���J�n��
	 * @param outDate �L���I����
	 * @return true:OK  false:NG
	*/
    private boolean checkEffectiveDate(List dateList, String inDate, String outDate)
    	throws SQLException, FoundationException, ParseException {
         
    	boolean result = true;	  // �`�F�b�N���ʊi�[
    	Date d_inDate = stringToDate(inDate);
    	Date d_outDate = stringToDate(outDate);
    	for (int i = 0; i < dateList.size(); i++) {
    		String targetInDate = ((AA0170010Struct)dateList.get(i)).getEFF_PHASE_IN_DATE();
    		String targetOutDate = ((AA0170010Struct)dateList.get(i)).getEFF_PHASE_OUT_DATE();
       
    		Date d_targetInDate = stringToDate(targetInDate);
    		Date d_targetOutDate =  stringToDate(targetOutDate);
       
    		if (d_targetInDate.getTime() > d_inDate.getTime()) {
    			// �J�n���t �� �`�F�b�N�Ώۂ̊J�n���t�̏ꍇ
    			if (d_targetInDate.getTime() <= d_outDate.getTime()) {
    				// �J�n���t �� �`�F�b�N�Ώۂ̏I�����t�̏ꍇ
    				result = false;
    				break;
    			}
    		} else if (d_targetInDate.getTime() < d_inDate.getTime()) {
    			// �J�n���t �� �`�F�b�N�Ώۂ̏I�����t�̏ꍇ
    			if (d_targetOutDate.getTime() >= d_inDate.getTime()) {
    				// �`�F�b�N�Ώۂ̏I�����t ���� �J�n���t
    				result = false;
    				break;
    			}
    		} else {
    			// �J�n���t == �`�F�b�N�Ώۂ̊J�n���t
    			result = false;
    			break;
    		}
    	}
    	return result;
    }
       
       
       //---------- �i�ڎ�z�敪�\���`�F�b�N���� -------------------------------------
       
	/**
	 * �i�ڎ�z�敪�ʍ\���`�F�b�N
	 * @param repository ���i�\�����|�W�g��
	 * @param parent �e�i�ڔԍ�
	 * @param comp �q�i�ڔԍ�
	 * @return true�FOK  false:NG
	*/
	private boolean checkMRP_ODR_TYP(ProductStructureRepository repository,
        			String parent, String comp)
         			throws SQLException, FoundationException {
        	
       	AA0170010Struct workStruct = new AA0170010Struct();
       	List workList      = null;
       	Integer parent_typ = null;
       	Integer comp_typ   = null;
   
       	// �e�̎�z�敪�擾
       	workStruct.setITEM_CD(parent);
       	workList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
       	parent_typ = ((AA0170010Struct)workList.get(0)).getMRP_ODR_TYP();
   
       	// �q�̎�z�敪�擾
       	workStruct.setITEM_CD(comp);	
       	workList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
       	comp_typ = ((AA0170010Struct)workList.get(0)).getMRP_ODR_TYP();
       	//  �e�i�� �C�}�j���A����z�i�ځA�D���b�g��z�i�ځA�E��ʎ�z�i�ځA�F�����_��z�i��
	   	if (parent_typ.intValue() == 4 || parent_typ.intValue() == 5 ||
	   			parent_typ.intValue() == 6 || parent_typ.intValue() == 7) {
	
	   		//  �q�i�� �@�ʕi�� �A�݌Ɉ����^�ʕi��
	   		if (comp_typ.intValue() == 1 || comp_typ.intValue() == 2) return false;
	   	}
         
        ArrayList itemList = null;
        // �e�i�� �G�[���i��
        if (parent_typ.intValue() == 8) {
        	// �q�i�� �G�[���i��
        	if (comp_typ.intValue() == 8) {
        		return false;
        	} else if (comp_typ.intValue() == 4 || comp_typ.intValue() == 5 ||
        			comp_typ.intValue() == 6 || comp_typ.intValue() == 7) {
        	} else {
        		// �e�i�ڂ��q�i�ڂƂȂ�\�����̐e�i�ڎ擾
        		itemList = repository.reverseDeployment(parent);
        		checkItemList(itemList);
        		
        		for (int i = 0; i < itemList.size(); i++) {
        			// �擾�����e�i�ڂ̎�z�敪�擾
        			workStruct.setITEM_CD((String)itemList.get(i));
        			List parentList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
        			Integer typ = ((AA0170010Struct)parentList.get(0)).getMRP_ODR_TYP();
            
        			if (typ.intValue() == 4 || typ.intValue() == 5 ||
        					typ.intValue() == 6 || typ.intValue() == 7) return false;
        		}
        	}
        }
       
        // �q�i�� �G�[���i��
        if (comp_typ.intValue() == 8) {
        	// �e�i�� �G�[���i��
        	if (parent_typ.intValue() == 8) {
        		return false;
        	} else if (parent_typ.intValue() == 1 || parent_typ.intValue() == 2) {
        		return true;
        	} else {
        		// �q�i�ڂ��e�i�ڂƂȂ�\�����̎q�i�ڎ擾
        		itemList = repository.orderDeployment(comp);
        		checkItemList(itemList);
        		for (int i = 0; i < itemList.size(); i++) {
        			// �擾�����q�i�ڂ̎�z�敪�擾
        			workStruct.setITEM_CD((String)itemList.get(i));
        			List compList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
        			Integer typ = ((AA0170010Struct)compList.get(0)).getMRP_ODR_TYP();
            
        			if (typ.intValue() == 1 || typ.intValue() == 2 ) {
        				return false;
        			}
        		}
        	}
        }
         return true;
        }
       
       
       //---------- ���i�\�����|�W�g���֘A�̏��� -------------------------------------------
       
	/** �d���`�F�b�N
	 * @param itemList �d���`�F�b�N����i�ڃ��X�g
	 */
	private void checkItemList(ArrayList itemList) {
		
		List workList = new ArrayList(0);
		for (int i = 0; i < itemList.size(); i++) {
			boolean result =true;
			String item_cd = (String)itemList.get(i);
		
			for (int t = 0; t < workList.size(); t++) {
				
				if (item_cd.equals((String)workList.get(t)) == true) {
					result = false;
				}
			}
				if (result == true) {
					workList.add(item_cd);
				}
		}
       
		itemList.clear();
		for (int i = 0; i < workList.size(); i++) {
			itemList.add(workList.get(i));
		}
	}
       
       
       //---------- ���i�\���擾�֘A�̏��� -------------------------------------------
       
    /** ���i�\�����X�g */
    private List _deployList = new ArrayList(0);
       
    /** ���i�\�����X�g�擾 
     * @return ���i�\�����X�g
     */
    public List getDeployList() { return _deployList; }
       
    /** ��ƌn�񃊃X�g */
    private List _procedureList = new ArrayList(0);
       
    /** ��ƌn�񃊃X�g�擾 
     * @return ��ƌn�񃊃X�g
     */
    public List getProcedureList() { return _procedureList; }
    
    /** ���o���X�g */
    /*private List _issueList = new ArrayList(0);*/
       
    /** ���o���X�g�擾 
     * @return ���o���X�g
     
    public List getIssueList() { return _issueList; }*/

        
    /**
     * Date�^ �� String�^�B
     * @return String YYYY/MM/DD�`��
     */
    public String dateToString(Date date) {
    	return Converter.dateToStr(date, "yyyy/MM/dd");
    }
       
    /**
     * String�^ �� Date�^�B
     * @return Date 
     */
    public Date stringToDate(String date) throws ParseException {
    	return Converter.strToDate(date, "yyyy/MM/dd");
    }
       
       
    //---------- ���W�J --------------------------------------------------------
       
	/** ���W�J  
	 * @param repository ���i�\�����|�W�g��
	 * @param item �e�i��
	 * @param inLevel �W�J���x��
	 * @param tagetDate �Ώۓ��t
	 * @param no �K�w���x��
	*/
	public void getDeploy(ProductStructureRepository repository, 
			String item, int inLevel, Date targetDate, Integer no)
	        throws SQLException, FoundationException {
   
		// �q�i�ڔԍ��ꗗ�擾
		ArrayList itemList = repository.orderDeployment(item, targetDate);
		checkItemList(itemList);
   
		// �e�i�ڂƎq�i�ڂ̍\�����擾
		ArrayList deployList = new ArrayList(0);
		AA0170010Struct workStruct = new AA0170010Struct();
		workStruct.setPARENT_ITEM_CD(item);
		workStruct.setEFF_PHASE_IN_DATE(dateToString(targetDate));
		workStruct.setEFF_PHASE_OUT_DATE(dateToString(targetDate));
		for (int i = 0; i < itemList.size(); i++) {
			workStruct.setCOMP_ITEM_CD((String)itemList.get(i));
			List workList = entity.mselectM_PS.read(conn, workStruct);
		
			for (int t = 0; t < workList.size(); t++) {
				deployList.add((AA0170010Struct)(workList.get(t)));
			}
		}
		   
		// �W�J���x���`�F�b�N
		if (inLevel <= 1) {
			for (int i = 0; i < deployList.size(); i++) {
				AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
				noStruct.setps_NO(Integer.toString(no.intValue()));
				_deployList.add(deployList.get(i));
			}
		} else {
			// �\����񂩂�X�ɉ��̎q�i�ڎ擾
			for (int i = 0; i < deployList.size(); i++) {
				AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
				noStruct.setps_NO(Integer.toString(no.intValue()));
				_deployList.add(deployList.get(i));
				getDeploy(repository, 
						((AA0170010Struct)deployList.get(i)).getps_COMP_ITEM_CD(),
						inLevel - 1,
						targetDate,
						new Integer(no.intValue() + 1));
			}
		}
	}
             
        //---------- �t�W�J --------------------------------------------------------
       
	/** �t�W�J �Ώۓ��t���� 
	 * @param repository ���i�\�����|�W�g��
	 * @param item �q�i��
	 * @param inLevel �W�J���x��
	 * @param tagetDate �Ώۓ��t
	 * @param j �K�w���x��
	*/
    public void getReverseDeploy(ProductStructureRepository repository, 
    		String item, int inLevel, Date targetDate, int j)
    		throws SQLException, FoundationException {
   
		// �e�i�ڔԍ��ꗗ�擾
		ArrayList itemList = repository.reverseDeployment(item, targetDate);
		checkItemList(itemList);
		   
		// �e�i�ڂƎq�i�ڂ̍\�����擾
		ArrayList deployList = new ArrayList(0);
		AA0170010Struct workStruct = new AA0170010Struct();
		workStruct.setCOMP_ITEM_CD(item);
		workStruct.setEFF_PHASE_IN_DATE(dateToString(targetDate));
		workStruct.setEFF_PHASE_OUT_DATE(dateToString(targetDate));

		for (int i = 0; i < itemList.size(); i++) {
			workStruct.setPARENT_ITEM_CD((String)itemList.get(i));
			List workList = entity.mselectM_PS.read(conn, workStruct);
			
			for (int t = 0; t < workList.size(); t++) {
				deployList.add((AA0170010Struct)(workList.get(t)));
			}
		}
   
		// �W�J���x���`�F�b�N
		if (inLevel <= 1) {
			// �ő�W�J���x��
			for (int i = 0; i < deployList.size(); i++) {
				AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
				noStruct.setps_NO(Integer.toString(j));
				_deployList.add(deployList.get(i));
			}
		} else {
			// �\����񂩂�X�ɏ�̐e�i�ڎ擾
			for (int i = 0; i < deployList.size(); i++) {
				AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
				noStruct.setps_NO(Integer.toString(j));
				_deployList.add(deployList.get(i));
				getReverseDeploy(repository, 
						((AA0170010Struct)deployList.get(i)).getps_PARENT_ITEM_CD(),
						inLevel - 1,
						targetDate,
						j + 1);
			}
		}
    }
   
       
	/** �t�W�J �Ώۓ��t�Ȃ� 
	 * @param repository ���i�\�����|�W�g��
	 * @param item �q�i��
	 * @param deployLevel �W�J���x��
	 * @param no �K�w���x��
	*/
    public void getReverseDeploy(ProductStructureRepository repository, 
    		String item, Integer deployLevel, Integer no)
    		throws SQLException, FoundationException {
       
    	// �e�i�ڔԍ��ꗗ�擾
    	ArrayList itemList = repository.reverseDeployment(item);
    	checkItemList(itemList);
       
    	// �e�i�ڂƎq�i�ڂ̍\�����擾
    	ArrayList deployList = new ArrayList(0);
    	AA0170010Struct workStruct = new AA0170010Struct();
    	workStruct.setCOMP_ITEM_CD(item);
    	for (int i = 0; i < itemList.size(); i++) {
    		workStruct.setPARENT_ITEM_CD((String)itemList.get(i));
    		List workList = entity.mselectM_PS.read(conn, workStruct);
    		for (int t = 0; t < workList.size(); t++) {
    			deployList.add((AA0170010Struct)(workList.get(t)));
    		}
    	}
       
    	// �W�J���x���`�F�b�N
    	if (deployLevel.intValue() <= 1) {
    		// �ő�W�J���x��
    		for (int i = 0; i < deployList.size(); i++) {
    			AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
    			noStruct.setps_NO(Integer.toString(no.intValue()));
    			_deployList.add(deployList.get(i));
    		}
    	} else {
    		// �\����񂩂�X�ɏ�̐e�i�ڎ擾
    		for (int i = 0; i < deployList.size(); i++) {
    			AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
    			noStruct.setps_NO(Integer.toString(no.intValue()));
    			_deployList.add(deployList.get(i));
    			getReverseDeploy(repository, 
    					((AA0170010Struct)deployList.get(i)).getPARENT_ITEM_CD(),
    					new Integer(deployLevel.intValue() - 1),
    					new Integer(no.intValue() + 1));
    		}
    	}
    }
       
        //------------------------------------------------------------------------------
         
    /**
     * SQLException�G���[���b�Z�[�W�ݒ�
     * @param SQLException
     * @param �o�̓G���[���b�Z�[�W
     */
    private void setSqlExceptionMsg(SQLException e) throws ExpjException{
         	
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
    private void setErrorMessage(String messageno, String message) {
         
    	ExpjMessage emsg = new ExpjMessage( messageno );
    	msgStruct.addError( emsg );
    	sysLog.severe(emsg, getsysUSER_CD());
    	emsg = new ExpjMessage( "ZZ01006", message );
    	msgStruct.addError( emsg );
    	sysLog.severe(emsg, getsysUSER_CD());
    }
       
    /**
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W(List)
	 */
	private void setErrorMessage(String messageno, List message) {
		
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.severe(emsg, getsysUSER_CD());
	 
		for (int i=0; i<message.size(); i++) {
			emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
			msgStruct.addError( emsg );
			sysLog.severe(emsg, getsysUSER_CD());
		}
	}
         
	/**
	 * �G���[���b�Z�[�W�ݒ�(�L�[�o�͂Ȃ�)
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setErrorMessageNoKey(String messageno, String message) {
        
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.severe(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.severe(emsg, getsysUSER_CD());
    }
         
	/**
	 * �x�����b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setWarnMessage(String messageno, String message) {
    
		ExpjMessage emsg = new ExpjMessage( messageno );
        msgStruct.addWarn( emsg );
        sysLog.warning(emsg, getsysUSER_CD());
    }

	/**
	 * ��񃁃b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setInfoMessage(String messageno, String message) {
         
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.info(emsg, getsysUSER_CD());
    }
	
	/**
	 * ��񃁃b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setInfoMessage(String messageno, List message) {

		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	 
		for (int i=0; i<message.size(); i++) {
			emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
			msgStruct.addInfo( emsg );
			sysLog.info(emsg, getsysUSER_CD());
		}		
		
	}
	// DB�X�V���t���O
	private boolean bDBUpdate;
            
	/** 
	 * @param target_struct �Ώۃf�[�^���
	 * @param devType       �W�J�t���O(1:���W�J)
	 * @return delList      �폜�Ώۃf�[�^
	 */
	private List checkTargetDataIn(AA0170010Struct target_struct, int devType) 
		throws FoundationException, SQLException {

		String Message = "";
         
        // �폜����Ώۃf�[�^
        List delList = null;
         
        // ���v���R�[�h����
        int ArgCount = 0;
       
        // ���v�t���O
        boolean chekflg;
       
        // �폜���郌�R�[�h���擾
        delList = entity.mselectM_PS_ps_edition.read(conn, target_struct);
         
         
        for	(int i=1; i<_deployList.size(); i++) {
          
        	String depParItem = null;	// �����e�i�ڔԍ�
        	String depComItem = null;	// �����q�i�ڔԍ�
        	String depEdition = null;	// �������i�\���Ő�
          
        	// �W�J���x���`�F�b�N
        	if (devType == 1) {
        		chekflg = checkDataExistence(target_struct.getps_PARENT_ITEM_CD(), 
        				((AA0170010Struct)_deployList.get(i)).getps_PARENT_ITEM_CD());
        	} else {
        		chekflg = checkDataExistence(target_struct.getps_COMP_ITEM_CD(), 
        				((AA0170010Struct)_deployList.get(i)).getps_COMP_ITEM_CD());
        	}
          
        	if (chekflg) {
           
        		// ���v���R�[�h�̌��������Z
        		ArgCount++;
           
        		// ���v�����e���ڂ�������X�g���擾
        		depParItem = ((AA0170010Struct)_deployList.get(i)).getps_PARENT_ITEM_CD();
        		depComItem = ((AA0170010Struct)_deployList.get(i)).getps_COMP_ITEM_CD();
        		depEdition = ((AA0170010Struct)_deployList.get(i)).getps_PS_EDITION();
           
        		// �f�[�^���݃t���O������
        		boolean isExist = false;
           
        		String modify = null;
           
        		for (int j=0; j<delList.size(); j++) {
        			if (depParItem.equals(((AA0170010Struct)delList.get(j)).getPARENT_ITEM_CD()) &&
        					depComItem.equals(((AA0170010Struct)delList.get(j)).getCOMP_ITEM_CD())  &&
        					depEdition.equals(((AA0170010Struct)delList.get(j)).getPS_EDITION())   ) {
              
        				// �f�[�^���݃t���OON
        				isExist = true;
              
        				// �X�V�񐔎擾
        				modify = ((AA0170010Struct)delList.get(j)).getMODIFY_COUNT();
        				break;
        			} 
        		}
           
        		// �f�[�^�ˍ����G���[
        		if	(isExist == false) {
        			Message = "Data is rewritten by other processings.";
        			setErrorMessageNoKey("ZZ01105", Message);
            
        			return null;
        		} else {
        			// �X�V�񐔃`�F�b�N
        			if	(((AA0170010Struct)_deployList.get(i)).getps_MODIFY_COUNT().equals(modify) == false) {
        				Message = "Data is rewritten by other processings.";
        				setErrorMessageNoKey("ZZ01105", Message);
             
        				return null;
        			}
        		}
        	}
        }
         
        // �폜����f�[�^���������ɂ���f�[�^��葽���ꍇ
        if (ArgCount != delList.size()) {
        	Message = "Data is rewritten by other processings.";
        	setErrorMessageNoKey("ZZ01105", Message);
          
        	return null;
        }
         
        	return delList;
        }
         
	/** 
	 * @param sTarget �`�F�b�N����e�^�q�i�ڔԍ�
	 * @param gChkData �������X�g�̐e�^�q�i�ڔԍ�
	 * @return boolean true:�f�[�^���� false:�f�[�^�Ȃ�
	 */
	private boolean checkDataExistence(String sTarget, String gChkData) throws FoundationException {
         
		if (sTarget.equals(gChkData) == true) {
			return true;
		} else {
			return false;
		}
    }
    /**
     * �i�ڏ��ݒ菈��
     * @param target_struct �ݒ�Ώ�
     * @param w_itemList �i�ڏ�񃊃X�g
     */
    private void setItemInfo(AA0170010Struct target_struct, List w_itemList) {
    	
    	if (w_itemList.size() <= 0) {
    		target_struct.setSTOCK_UNIT("");
    	} else {
    		AA0170010Struct itemStruct = (AA0170010Struct)w_itemList.get(0);
    		target_struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
    	}
    }

    /**
     * ��ƌn����̃t���O�̕\����ݒ�
     * @param s �t���O�̒l���ݒ肳��Ă�����
     */
    private void setTypeValueAboutProcGroup(AA0170010Struct s) {
    	
    	s.setpr_OUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getpr_OUTSIDE_TYP()));
    	s.setpr_ACPT_INSPC_NAME(getTypeName(_ACPT_INSPC_TYP,s.getpr_ACPT_INSPC_TYP()));
    }

    /** 
     * �Ώۃf�[�^�����ɍX�V����Ă��邩�ǂ����̔��菈��
     * �i���Ӂjfor update nowait����������̂ŁA���̊֐����ĂԑO�Ƀg�����U�N�V�����J�n�������s���Ă����K�v����
     *
     * @param target_struct �Ώۃf�[�^���
     * @param modify_count �Ώۃf�[�^MODIFY_COUNT
     * @return boolean true:�G���[���� false:�G���[�Ȃ�
     */
    private boolean checkTargetDataInM_PROC_GRP(AA0170010Struct target_struct, String modify_count) 
    	throws FoundationException, SQLException   {
    	
    	List listMessage = new ArrayList();
     
    	// �����Ώۃf�[�^�̑��݃`�F�b�N
    	List temp_list = new ArrayList(0);
    	temp_list = entity.mselectM_PROC_GRP_modify_count.read(conn, target_struct);
    	if (temp_list.size() <= 0) {
      
    		listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getpr_PLANT_CD());
    		listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getpr_ITEM_CD());
    		listMessage.add("M_PROC_GRP.PROC_CD:" + struct.getpr_PROC_CD());
   
    		setErrorMessage("ZZ06001", listMessage);
    		return true;
    	} else {
    		// ���R�[�h���X�V����Ă��Ȃ����`�F�b�N
    		AA0170010Struct temp_struct = (AA0170010Struct)temp_list.get(0);
    		if (temp_struct.getMODIFY_COUNT().equals(modify_count) != true) {
       
    			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getpr_PLANT_CD());
    			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getpr_ITEM_CD());
    			listMessage.add("M_PROC_GRP.PROC_CD:" + struct.getpr_PROC_CD());
   
    			setErrorMessage("ZZ01105", listMessage);
    			return true;
    		}
    	}
   
    	return false;
    }
    
    /** 
     * �ΏۑS�f�[�^�����ɍX�V����Ă��邩�ǂ����̔��菈��
     * �i���Ӂjfor update nowait����������̂ŁA���̊֐����ĂԑO�Ƀg�����U�N�V�����J�n�������s���Ă����K�v����
     *
     * @param target_struct �Ώۃf�[�^���
     * @return boolean true:�G���[���� false:�G���[�Ȃ�
     */
    private boolean checkTargetAllDataInM_PROC_GRP(AA0170010Struct target_struct) 
    			throws FoundationException, SQLException {
    
    	List listMessage = new ArrayList();
     
    	// �Ǎ����̃L�[�Ńf�[�^��Ǎ�(select for update no wait�������Ă���Ǎ�����)
    	struct.setPLANT_CD(getsysPLANT_CD());
    	struct.sethidden_ITEM_CD(_keyStruct.gethidden_ITEM_CD());
    	List new_list = entity.mselectM_PROC_GRP_for_update_nowait.read(conn, struct);
   
    	// DB�擾��������ʕ\�������Ɠ������ǂ����̃`�F�b�N
    	if (new_list.size() != _procedureList.size()) {
      
			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getpr_PLANT_CD());	
			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getpr_ITEM_CD());
   
    		setErrorMessage("ZZ01105", listMessage);
    		return true;
    	} else {
    		
    		for (int i = 0; i < _procedureList.size(); i++) {
    			
    			// ��ʕ\���f�[�^
    			AA0170010Struct dispData  = (AA0170010Struct)_procedureList.get(i); 
    			// ��ʕ\���f�[�^���L�[��M_PROC_GRP����ŐV�̃��R�[�h���擾
    			List selectedList = entity.mselectM_PROC_GRP_modify_count.read(conn, dispData);
    			// �f�[�^���擾�ł��Ȃ������ꍇ�̓G���[
    			if (selectedList.size() <= 0) {
    			      
    				listMessage.add("M_PROC_GRP.PLANT_CD:" + dispData.getpr_PLANT_CD());	
    				listMessage.add("M_PROC_GRP.ITEM_CD:" + dispData.getpr_ITEM_CD());
    	   
    	    		setErrorMessage("ZZ01105", listMessage);
    	    		return true;
    	    		
    			} else {
    				// �擾�f�[�^�f�[�^
        			AA0170010Struct selectedData  = (AA0170010Struct)selectedList.get(0);
        			if (! dispData.getpr_MODIFY_COUNT().equals(selectedData.getMODIFY_COUNT())) {
        				// �X�V�񐔂��قȂ�ꍇ�̓G���[
        				listMessage.add("M_PROC_GRP.PLANT_CD:" + dispData.getpr_PLANT_CD());	
        				listMessage.add("M_PROC_GRP.ITEM_CD:" + dispData.getpr_ITEM_CD());
   
        				setErrorMessage("ZZ01105", listMessage);
        				return true;
        			}
    			}
    		}
    	}
    	return false;
    }
    /**
     * �Œ胊�[�h�^�C���`�F�b�N
     * @param itemStruct �i�ڏ��Struct
     * @throws SQLException 
     * @throws FoundationException 
     */
    private void checkLT(AA0170010Struct itemStruct) throws FoundationException, SQLException {
        
    	// ��ƌn��̍Ď擾
    	List prList = new ArrayList();
    	struct.setPLANT_CD(getsysPLANT_CD());
    	struct.setITEM_CD(struct.getsub2_ITEM_CD());
    	prList = entity.mselectM_PROC_GRP.read(conn, struct);
    	

    	// �Œ蕪���[�h�^�C���`�F�b�N
    	long fixed_lt = 0;
    	long prop_lt = 0;
    	for (int i = 0; i < prList.size(); i++) {
    		AA0170010Struct workStruct = (AA0170010Struct)prList.get(i);
    		fixed_lt = fixed_lt + 
    					(Long.valueOf(workStruct.getpr_FIXED_LT())).longValue();
     		prop_lt  = prop_lt + 
     					(Long.valueOf(workStruct.getpr_PROP_LT())).longValue();
    	}
   
    	// �i�ڂ̔�ᕪ���[�h�^�C�� == 0 && �S��ƌn���ᕪ���[�h�^�C�� == 0
    	if (itemStruct.getITEM_PROP_LT().longValue() == 0 && prop_lt == 0) {
    		if (itemStruct.getITEM_FIXED_LT().longValue() < fixed_lt) {
    			setInfoMessage("AA60003", "");
    		}
    	}
    }
    /**
     * �T�u�Q��ʂ�\�����܂�
     * @param  status "0":�s�ǉ��A�s���ʁA"1"�F�s�C���A�T�u��ʂ���̖߂�
     * @throws FoundationException 
     * @throws ExpjException 
     */    
	private void dispSub2(String status) throws FoundationException, ExpjException {
		
		String Message = "";
		
		try {
        	// �Ώەi�ڏ��擾
        	struct.setw_TARGET_ITEM_CD(_keyStruct.gethidden_ITEM_CD());
        	List itemList = entity.mselectM_ITEM.read(conn, struct);
      
        	if (itemList.size() <= 0) {
        		
        		Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
        		setErrorMessage("ZZ06001", Message);
        	
        	} else {
        		// ��ƌn��ꗗ�擾
        		struct.setPLANT_CD(getsysPLANT_CD());
        		struct.setITEM_CD(_keyStruct.gethidden_ITEM_CD());
        		struct.setPROC_CD(_keyStruct.getpr_PROC_CD());
        		List mProcList = entity.mselectM_PROC_GRP_oneRecord.read(conn, struct);
        		
        		struct.setFIRST_PROC_FLG("false");
        		
        		if (mProcList.size() > 0) {
        			// �擾�f�[�^����ʂɃZ�b�g
        			AA0170010Struct dispData = (AA0170010Struct)mProcList.get(0);
        			
        			struct.setsub2_PLANT_CD(dispData.getsub2_PLANT_CD());
        			struct.setsub2_ITEM_CD(dispData.getsub2_ITEM_CD());
        			struct.setsub2_PROC_CD(dispData.getsub2_PROC_CD());
        			struct.setsub2_PROC_NO(dispData.getsub2_PROC_NO());
        			struct.setsub2_PROC_NAME(dispData.getsub2_PROC_NAME());
        			struct.setsub2_WS_CD(dispData.getsub2_WS_CD());
        			struct.setsub2_COMPANY_CD(dispData.getsub2_COMPANY_CD());
        			struct.setsub2_VEND_CD(dispData.getsub2_VEND_CD());
        			struct.setsub2_FIXED_LT(dispData.getsub2_FIXED_LT());
        			struct.setsub2_PROP_LT(dispData.getsub2_PROP_LT());
        			struct.setsub2_SAFETY_LT(dispData.getsub2_SAFETY_LT());
        			struct.setsub2_PROP_LOT_SIZE(dispData.getsub2_PROP_LOT_SIZE());
        			struct.setsub2_SPOIL(dispData.getsub2_SPOIL());
        			struct.setsub2_OUTSIDE_TYP(dispData.getsub2_OUTSIDE_TYP());
        			struct.setsub2_ACPT_INSPC_TYP(dispData.getsub2_ACPT_INSPC_TYP());
        			struct.setsub2_STANDARD_COST(dispData.getsub2_STANDARD_COST());
        			struct.setsub2_MODIFY_COUNT(dispData.getsub2_MODIFY_COUNT());
        			struct.setsub2_ITEM_NAME(dispData.getsub2_ITEM_NAME());
        			struct.setsub2_WS_NAME(dispData.getsub2_WS_NAME());
        			struct.setsub2_VEND_NAME(dispData.getsub2_VEND_NAME());
        			struct.setsub2_STOCK_UNIT(dispData.getsub2_STOCK_UNIT());
        			struct.setsub2_UNIT_QTY(dispData.getsub2_UNIT_QTY());
        			struct.setsub2_WORK_TIME(dispData.getsub2_WORK_TIME());
// 2008/07/16 SYSCOM ���� ADD START
        			struct.setsub2_MANHOUR_TYP(dispData.getsub2_MANHOUR_TYP());
// 2008/07/16 SYSCOM ���� ADD END
        			try {
        				// �V�X�e���p�����[�^�擾
        				struct.setPARAM_INPUT_DATA("PROC_GRP_LT_UNIT");
        				List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
        				
        				if (sysParameterList!=null && sysParameterList.size()>0) {
        					AA0170010Struct sysParameterStruct = (AA0170010Struct) sysParameterList.get(0);
        					String paramResult = sysParameterStruct.getPARAM_RESULT_DATA();			
        					/** ��ƌn��Œ蕪���[�h�^�C���P�� */
        					struct.setsub2_STOCK_UNIT_1(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
        					/** ��ƌn���ᕪ���[�h�^�C���P�� */
        					struct.setsub2_STOCK_UNIT_2(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
        					/** ���S�����P�� */
        					struct.setsub2_STOCK_UNIT_3(getTypeName(_PROC_GRP_LT_UNIT,paramResult));										
        				}
        			}catch(SQLException e) {
        		    	setSqlExceptionMsg(e);
        			}catch(FoundationException e){
        				throw e;	
        			}

        		} else if (mProcList.size() == 0) {
        			
    				Message = "The target data does not exist";
    				setErrorMessageNoKey("ZZ06001", Message);

        		}
        	}
        } catch (SQLException e) {
        	// �Ǎ����
        	setReadStatus(ERROR);
      
        	setSqlExceptionMsg(e);
        }
		
	}   
	/**
	 * �s�ǉ��i���i�\���j�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void initializeSub1() {

		// ����������
		/** ���i�\���Ő� */
		struct.setsub1_PS_EDITION(AA0170Common._PS_EDITION);		

		/** ���i�\���P�ʐ����� */
		struct.setsub1_PS_UNIT_DENOMINATOR(AA0170Common._PS_UNIT_DENOMINATOR);
		
		/** ���i�\���P�ʐ����q */
		struct.setsub1_PS_UNIT_NUMERATOR(AA0170Common._PS_UNIT_NUMERATOR);
		
		/** �\���d���� */
		struct.setsub1_PS_SPOIL(AA0170Common._PS_SPOIL);
		
		/** ���i�\���Œ蕪���[�h�^�C�� */
		struct.setsub1_PS_FIXED_LT(AA0170Common._PS_FIXED_LT);
		
		/** ���i�\����ᕪ���[�h�^�C�� */
		struct.setsub1_PS_PROP_LT( AA0170Common._PS_PROP_LT);
		
		/** ���i�\����ᕪ���b�g�T�C�Y */
		struct.setsub1_PS_PROP_LOT_SIZE(AA0170Common._PS_PROP_LOT_SIZE);

		/** �����Ϗ�L�� */
		struct.setsub1_COST_UP_TYP(AA0170Common._COST_UP_TYP);
		
		/** MRP�W�J�L�� */
		struct.setsub1_MRP_EXP_TYP(AA0170Common._MRP_EXP_TYP);					
	}

	/**
	 * �s�ǉ��i��ƌn��j�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void initializeSub2() throws BusinessProcessException, FoundationException{
		
    	// �T�u�Q���
    	/** ��ƌn��Œ蕪���[�h�^�C�� */
		struct.setsub2_FIXED_LT(AA0170Common._PR_FIXED_LT);
    	
    	/** ��ƌn���ᕪ���[�h�^�C�� */
		struct.setsub2_PROP_LT(AA0170Common._PR_PROP_LT);

    	/** ��ƌn����S���� */
		struct.setsub2_SAFETY_LT(AA0170Common._PR_SAFETY_LT);
    	
    	/** ��ƌn���ᕪ���b�g�T�C�Y */
		struct.setsub2_PROP_LOT_SIZE(AA0170Common._PR_PROP_LOT_SIZE);

    	/** ��ƌn��d���� */
		struct.setsub2_SPOIL(AA0170Common._PR_SPOIL);

    	/** ��ƌn����O��敪 */
		struct.setsub2_OUTSIDE_TYP(AA0170Common._PR_OUTSIDE_TYP);

    	/** ��ƌn���������敪 */
		struct.setsub2_ACPT_INSPC_TYP(AA0170Common._PR_ACPT_INSPC_TYP);

    	/** �W���H�� */
		struct.setsub2_STANDARD_COST(AA0170Common._PR_STANDARD_COST);
		try {
			// �V�X�e���p�����[�^�擾
			struct.setPARAM_INPUT_DATA("PROC_GRP_LT_UNIT");
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			
			if (sysParameterList!=null && sysParameterList.size()>0) {
				AA0170010Struct sysParameterStruct = (AA0170010Struct) sysParameterList.get(0);
				String paramResult = sysParameterStruct.getPARAM_RESULT_DATA();			
				/** ��ƌn��Œ蕪���[�h�^�C���P�� */
				struct.setsub2_STOCK_UNIT_1(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
				/** ��ƌn���ᕪ���[�h�^�C���P�� */
				struct.setsub2_STOCK_UNIT_2(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
				/** ���S�����P�� */
				struct.setsub2_STOCK_UNIT_3(getTypeName(_PROC_GRP_LT_UNIT,paramResult));										
			}
		}catch(SQLException e) {
	    	setSqlExceptionMsg(e);
		}catch(FoundationException e){
			throw e;	
		}
	}
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
              
		String Message = "";
              
		try {
                 
            // �\����񃊃X�g�N���A
            _deployList.clear();
            // ��ƌn�񃊃X�g�N���A
            _procedureList.clear();
              
            List workList = null;	   // �Ώەi�ڏ��i�[
              
            // �W�J���x���̃`�F�b�N
            int level = Integer.parseInt(_level);
              
            // ���͂����W�J���x����Integer�^�ɕϊ����Ď擾����
            int inLevel = Integer.parseInt(struct.getmain_LEVEL());
              
            if (level < inLevel) {
                setErrorMessageNoKey("AA00104", "");
            }
              
			// �Ώەi�ڏ��擾
			struct.setw_TARGET_ITEM_CD(struct.getmain_TARGET_ITEM_CD()); // �Ώەi�ڃR�[�h
			workList = entity.mselectM_ITEM.read(conn, struct);
			if (workList.size() <= 0) {       // �Ώەi�ڂ̎擾���s
				setReadStatus(INITIAL);
			  
				Message = "M_ITEM.ITEM_CD:" + struct.getw_TARGET_ITEM_CD();
				setErrorMessage("ZZ06001", Message);
			} else {
				setReadStatus(NORMAL);
			}
              
			// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
			if (msgStruct.sizeError() <= 0) {
				AA0170010Struct targetStruct = new AA0170010Struct();
				targetStruct.clear();
				AA0170010Struct workStruct = (AA0170010Struct)workList.get(0);
				targetStruct.setps_PARENT_ITEM_CD(workStruct.getITEM_CD());
				targetStruct.setps_PARENT_ITEM_NAME(workStruct.getITEM_NAME());
				targetStruct.setps_STOCK_UNIT(workStruct.getSTOCK_UNIT());
// 2008/07/16 SYSCOM ���� ADD START
				targetStruct.setps_PARENT_MANHOUR_TYP(workStruct.getps_COMP_MANHOUR_TYP());
// 2008/07/16 SYSCOM ���� ADD END
				targetStruct.setps_NO("1");
				_deployList.add(targetStruct);
               
                // �W�J���x��'0'�łȂ��ꍇ�A�W�J�������{
                if (inLevel != 0) {
               
	                // ���i�\�����|�W�g���쐬
	                ProductStructureRepository repository = new ProductStructureRepository(conn);
                
                    // ���W�J
                    if (Integer.parseInt(struct.getmain_DEVELOP_TYP()) == 1) {
                         Date targetDate = stringToDate(struct.getmain_TARGET_DATE());
                         getDeploy(repository, struct.getw_TARGET_ITEM_CD(), 
                         inLevel, targetDate, new Integer(2));
                    } else {
                    // �t�W�J
                        Date targetDate = stringToDate(struct.getmain_TARGET_DATE());
                        getReverseDeploy(repository, struct.getw_TARGET_ITEM_CD(), 
                        inLevel, targetDate, 2);
                    }
                }
            }
              
			// �t���O�̕\��������ݒ�
			for (int n = 0; n < _deployList.size(); n++) {
				setTypeValueAboutPs((AA0170010Struct)(_deployList.get(n)));
			}
			// �B�����ڂ��N���A����B
    		struct.sethidden_ITEM_CD("");
    		struct.sethidden_ITEM_NAME("");
    		// �L�[���ݒ�
    		_keyStruct.setmain_TARGET_ITEM_CD(struct.getmain_TARGET_ITEM_CD());
    		_keyStruct.setmain_DEVELOP_TYP(struct.getmain_DEVELOP_TYP());
    		_keyStruct.setmain_LEVEL(struct.getmain_LEVEL());
    		_keyStruct.setmain_TARGET_DATE(struct.getmain_TARGET_DATE());
    		_keyStruct.setPLANT_CD(getsysPLANT_CD());
			  
		} catch(ParseException e) {
			// �ϊ����s
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			  
			throw ee;
			  
		} catch(SQLException e) {
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                //------------------------------------------------------------------
              
		String Message   = "";
		List listMessage = new ArrayList();
                
		// DB�X�V���t���O������
		bDBUpdate = false;
              
		try {
			// �g�����U�N�V�����J�n
			conn.beginTrans();
                 
			// DB�X�V���t���OON
			bDBUpdate = true;
              
			boolean result = false;		 // �`�F�b�N���ʊi�[�p
                   
			// ����/�X�V�`�F�b�N
			struct.setps_PARENT_ITEM_CD(struct.getsub1_PARENT_ITEM_CD());
			struct.setps_COMP_ITEM_CD(struct.getsub1_COMP_ITEM_CD());
			struct.setps_PS_EDITION(struct.getsub1_PS_EDITION());
			List countList = entity.mselectM_PS_modify_count.read(conn, struct);
			if (countList.size() <= 0) {
				
				Message = "The target data does not exist";
				setErrorMessageNoKey("ZZ06001", Message);
			
			} else {
				String modify = ((AA0170010Struct)countList.get(0)).getMODIFY_COUNT();
				if (struct.getsub1_MODIFY_COUNT().equals(modify) == false) {
					Message = "Data is rewritten by other processings.";
					setErrorMessageNoKey("ZZ01105", Message);
				}
			}
			
			// �L�����͈͂̏d���`�F�b�N
			result = checkEffectiveDate_update(struct.getsub1_PARENT_ITEM_CD(), 
												struct.getsub1_COMP_ITEM_CD(),
												struct.getsub1_PS_EDITION(), 
												struct.getsub1_EFF_PHASE_IN_DATE(), 
												struct.getsub1_EFF_PHASE_OUT_DATE());
			if (result == false) {
				Message = "Data is rewritten by other processings.";
				setErrorMessageNoKey("AA00054", "");
            }
					
			
			// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
			if (msgStruct.sizeError() <= 0) {
				// ���͒l�`�F�b�N
				checkInputSub1(struct);
              
				// �X�V
				entity.mupdateSub1M_PS.update(conn, struct);
               
				// �R�~�b�g
				conn.commit();
                  
				// DB�X�V���t���OOFF
				bDBUpdate = false;
               
				// ����
				struct.copy(_keyStruct);
				controlselect();
              
			}
              
		} catch(ParseException e) {
			// �ϊ����s
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
              
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
              
		} finally {
			// DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
			if (bDBUpdate == true) {
                  // ���[���o�b�N
                  conn.rollback();
              
                  // DB�X�V���t���OOFF
                  bDBUpdate = false;
			}
		}
              
                //------------------------------------------------------------------
              
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>

		// �L�[�R�s�[
        struct.copy(_keyStruct);		
              
        //�Č���
        controlselect();
              
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //----------------------------------------------------------------------
              
                // ������
                _keyStruct = new AA0170010Struct();
                struct.initialize();
                struct.setmain_LEVEL(_initlevel);
              
                // ���i�\�����X�g�N���A
                _deployList.clear();
                // ��ƌn�񃊃X�g�N���A
                _procedureList.clear();
              
                // ���x���ݒ�
                _keyStruct.setmain_LEVEL(_initlevel);
              
                setReadStatus(INITIAL);
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //------------------------------------------------------------------
              
		String Message = "";
        List listMessage = new ArrayList();
              
        try {
        	// �g�����U�N�V�����J�n
            conn.beginTrans();
              
            boolean result = false;		 // �`�F�b�N���ʊi�[�p
              
            // ���i�\�����|�W�g���쐬
            ProductStructureRepository repository = new ProductStructureRepository(conn);
              
            // �ǉ��i�ڏ��`�F�b�N
            if (Integer.parseInt(_keyStruct.getmain_DEVELOP_TYP()) == 1) {
            	// ���W�J
                struct.setITEM_CD(struct.getsub1_COMP_ITEM_CD());
                result = entity.mcheckM_ITEM.check(conn, struct);
                if (result == false) {    // �Ώەi�ڂ̎擾���s
                	Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                	setErrorMessage("ZZ06001", Message);
                }
            } else {
                // �t�W�J
                struct.setITEM_CD(struct.getsub1_PARENT_ITEM_CD());
                result = entity.mcheckM_ITEM.check(conn, struct);
                if (result == false) {    // �Ώەi�ڂ̎擾���s
                	Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                	setErrorMessage("ZZ06001", Message);
                }
            }
        
// 2008/07/16 SYSCOM ���� ADD START
            // �H���Ǘ��i�ڋ敪�`�F�b�N
            AA0170010Struct checkStruct = new AA0170010Struct();
            checkStruct.setw_TARGET_ITEM_CD(struct.getsub1_PARENT_ITEM_CD());
            List checkList = entity.mselectM_ITEM.read(conn, checkStruct);
            if(checkList.size() > 0){
                if(((AA0170010Struct)checkList.get(0)).getps_COMP_MANHOUR_TYP().equals("1")){
                	Message = "M_ITEM.ITEM_CD:" + struct.getsub1_PARENT_ITEM_CD();
                	setErrorMessage("AA00178", Message);
                }
            }
// 2008/07/16 SYSCOM ���� ADD END
        
            // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
            if (msgStruct.sizeError() <= 0) {
            	
                // �L���J�n���̃p�����[�^�`�F�b�N
                if(!checkDate(struct.getsub1_EFF_PHASE_IN_DATE())){
                	setErrorMessageNoKey("ZZ13001", "");
                }
                // �L���I�����̃p�����[�^�`�F�b�N
                if(!checkDate(struct.getsub1_EFF_PHASE_OUT_DATE())){
                	setErrorMessageNoKey("ZZ13002", "");
                }          	
            	// �i�ڎ�z�敪�ʍ\���`�F�b�N
                if (checkMRP_ODR_TYP(repository, 
                		struct.getsub1_PARENT_ITEM_CD(), struct.getsub1_COMP_ITEM_CD()) == false) {
                	
                	Message = "Item arrangements classification composition is inaccurate";
                	setErrorMessageNoKey("AA00052", Message);
                
                }
                  
                // ���i�\���d���`�F�b�N
                struct.setPARENT_ITEM_CD(struct.getsub1_PARENT_ITEM_CD());
                struct.setCOMP_ITEM_CD(struct.getsub1_COMP_ITEM_CD());
                struct.setPS_EDITION(struct.getsub1_PS_EDITION());
                result = entity.mcheckM_PS_ps_edition.check(conn, struct);
                if (result == true) {
                	listMessage.add("M_PS.PARENT_ITEM_CD:" + struct.getPARENT_ITEM_CD());
                	listMessage.add("M_PS.COMP_ITEM_CD:" + struct.getCOMP_ITEM_CD());
                	listMessage.add("M_PS.PS_EDITION:" + struct.getPS_EDITION());
                	setErrorMessage("ZZ01102", listMessage);
                }
              
                // �L�����͈͂̏d���`�F�b�N
                result = checkEffectiveDate_insert(struct.getsub1_PARENT_ITEM_CD(), 
                									struct.getsub1_COMP_ITEM_CD(),
                									struct.getsub1_EFF_PHASE_IN_DATE(), 
                									struct.getsub1_EFF_PHASE_OUT_DATE());
                if (result == false) {
                	setErrorMessageNoKey("AA00054", "");
                }
              
                // ���[�s���O�`�F�b�N true:�L  false:��
                if (Integer.parseInt(_keyStruct.getmain_DEVELOP_TYP()) == 1) {
                	if (checkReverseRooping(repository, 
                				struct.getCOMP_ITEM_CD(), 
                				struct.getPARENT_ITEM_CD()) == true) {
                     
                		setErrorMessageNoKey("AA00055", "");
                	}
                } else {
                	if (checkRooping(repository, 
                				struct.getPARENT_ITEM_CD(), 
                				struct.getCOMP_ITEM_CD()) == true) {
                     
                		setErrorMessageNoKey("AA00055", "");
                	}
                }

                // �Ɩ����t�̑��ݐ��`�F�b�N
                if(getsysPLANT_CD() != null && !"".equals(getsysPLANT_CD())){
                   struct.setPLANT_CD(getsysPLANT_CD());
                   List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
      	      	   if(temlist.isEmpty()){
      	      		   // �Ɩ��^�p�� ���擾�ł��Ȃ������ꍇ
      	      		   setErrorMessageNoKey("KR00017", "");             				  
      	      	   }
                } else {
                	// ���Џ�� ���擾�ł��Ȃ������ꍇ
                	setErrorMessageNoKey("KR00017", "");    
                }          
            }
              
            // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
            if (msgStruct.sizeError() <= 0) {
            	// ���͒l�`�F�b�N
                checkInputSub1(struct);
              
                // �o�^
                
                entity.minsertSub1M_PS.create(conn, struct);
                
                // ���i�\���g�����U�N�V�����o�^
                List workList = entity.mselectSYS_PS_T.read(conn, struct);
                long no = 0;	 // �V�[�P���V����No
                if (workList.size() <= 0 || 
                		((AA0170010Struct)workList.get(0)).getSEQ_NO() == null) {
                	no = 0;
                } else {
                	no = Long.parseLong(((AA0170010Struct)workList.get(0)).getSEQ_NO());
                }
                AA0170010Struct addStruct = new AA0170010Struct();
                addStruct.setsUser_ID(new String(struct.getsUser_ID()));	// ���[�UID�ݒ�
                addStruct.setACCESS_TYP("1");		            			// �������@ 1:�폜
                addStruct.setCMPLT_FLG("0");					            // �������@ 0:��
                addStruct.setSEQ_NO(Long.toString(no + 1));
                addStruct.setPARENT_ITEM_CD(struct.getsub1_PARENT_ITEM_CD());
                addStruct.setCOMP_ITEM_CD(struct.getsub1_COMP_ITEM_CD());
                addStruct.setPS_EDITION(struct.getsub1_PS_EDITION());
                entity.minsertSYS_PS_T.create(conn, addStruct);
                
                // �R�~�b�g
                conn.commit();
                
                // ����
                struct.copy(_keyStruct);
                controlselect();
            }
              
        } catch(ParseException e) {
        	// �ϊ����s
            ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
              
        } catch(SQLException e) {
            setSqlExceptionMsg(e);
        }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * �{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselectProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlselectProcGrp");
			//{{user_implement_dev:<controlselectProcGrp>
		

        String Message = "";
        setReadStatus(INITIAL);
      
        try {
        	// ��ƌn�񃊃X�g�N���A
        	_procedureList.clear();
      
        	// �Ώەi�ڏ��擾
        	struct.setw_TARGET_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        	List itemList = entity.mselectM_ITEM.read(conn, struct);
      

        	if (itemList.size() <= 0) {
        		
        		Message = "M_ITEM.ITEM_CD:" + struct.getps_PARENT_ITEM_CD();
        		setErrorMessage("AA01002", Message);
        		// �L�[���N���A
        		_keyStruct.setps_PARENT_ITEM_CD("");
        		_keyStruct.setps_PARENT_ITEM_NAME("");
        		_keyStruct.setps_COMP_ITEM_CD("");
    			_keyStruct.setps_PS_EDITION("");
    			_keyStruct.sethidden_ITEM_CD("");
       		    _keyStruct.sethidden_ITEM_NAME("");
// 2008/07/16 SYSCOM ���� ADD START
       		    _keyStruct.setsub2_MANHOUR_TYP("");
// 2008/07/16 SYSCOM ���� ADD END
                struct.sethidden_ITEM_CD("");
       		    struct.sethidden_ITEM_NAME("");
       		    // �Ǎ����
       		    setReadStatus(NOT_FOUND);
        	
        	} else {
        		// ��ƌn��ꗗ�擾
        		struct.setPLANT_CD(getsysPLANT_CD());
        		if ("1".equals(struct.getmain_DEVELOP_TYP())) {
        			if("1".equals(struct.getps_NO())){
        				struct.setITEM_CD(struct.getps_PARENT_ITEM_CD());
        				_keyStruct.sethidden_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        				_keyStruct.sethidden_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
// 2008/07/16 SYSCOM ���� ADD START
        				_keyStruct.setsub2_MANHOUR_TYP(struct.getps_PARENT_MANHOUR_TYP());
// 2008/07/16 SYSCOM ���� ADD END
        				struct.sethidden_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        				struct.sethidden_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
        			} else {
        				struct.setITEM_CD(struct.getps_COMP_ITEM_CD());
        				_keyStruct.sethidden_ITEM_CD(struct.getps_COMP_ITEM_CD());
        				_keyStruct.sethidden_ITEM_NAME(struct.getps_COMP_ITEM_NAME());
// 2008/07/16 SYSCOM ���� ADD START
        				_keyStruct.setsub2_MANHOUR_TYP(struct.getps_COMP_MANHOUR_TYP());
// 2008/07/16 SYSCOM ���� ADD END
        				struct.sethidden_ITEM_CD(struct.getps_COMP_ITEM_CD());
        				struct.sethidden_ITEM_NAME(struct.getps_COMP_ITEM_NAME());
        			}
        		} else {
        			struct.setITEM_CD(struct.getps_PARENT_ITEM_CD());
        			_keyStruct.sethidden_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        			_keyStruct.sethidden_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
// 2008/07/16 SYSCOM ���� ADD START
        			_keyStruct.setsub2_MANHOUR_TYP(struct.getps_PARENT_MANHOUR_TYP());
// 2008/07/16 SYSCOM ���� ADD END
        			struct.sethidden_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        			struct.sethidden_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
        		}
        		List mProcList = entity.mselectM_PROC_GRP.read(conn, struct);
        		
      
        		if (mProcList.size() > 0) {
        			
        			for (int n = 0; n < mProcList.size(); n++) {
        				// �R���{�l�̑Ή����閼�̂��擾
        				AA0170010Struct tempStruct = (AA0170010Struct)mProcList.get(n);
        				setTypeValueAboutProcGroup(tempStruct);
        				// ���i�\���Ő����Z�b�g
        				tempStruct.setpr_PS_EDITION(struct.getps_PS_EDITION());
        				// ��ƌn�񃊃X�g�Ɏ擾�f�[�^���Z�b�g
        				_procedureList.add(tempStruct);
        			}
        			
        			// �Ǎ����
        			setReadStatus(NORMAL);
        		} else {
        			
        			setReadStatus(NOT_FOUND);
        		}   		

        		// �L�[���ޔ�
        		_keyStruct.setps_PARENT_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        		_keyStruct.setps_PARENT_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
        		_keyStruct.setps_COMP_ITEM_CD(struct.getps_COMP_ITEM_CD());
    			_keyStruct.setps_PS_EDITION(struct.getps_PS_EDITION());
    			_keyStruct.setps_NO(struct.getps_NO());
       
        	}
      
        } catch (SQLException e) {
        	// �Ǎ����
        	setReadStatus(ERROR);
      
        	setSqlExceptionMsg(e);
        }

                //}}user_implement_dev:<controlselectProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlselectProcGrp");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertProcGrp");
			//{{user_implement_dev:<controlinsertProcGrp>
		// ����������
		initializeSub2();

		// �L�[���ݒ�
        _keyStruct.setpr_PS_EDITION(_keyStruct.getps_PS_EDITION());

		// �Ώۂ̍\�������R�s�[
		struct.setsub2_ITEM_CD(_keyStruct.gethidden_ITEM_CD());      // �i�ڔԍ�
        struct.setsub2_ITEM_NAME(_keyStruct.gethidden_ITEM_NAME());  // �i�ږ�
// 2008/07/16 SYSCOM ���� ADD START
        struct.setsub2_MANHOUR_TYP(_keyStruct.getsub2_MANHOUR_TYP());  // �H���Ǘ��i�ڋ敪
// 2008/07/16 SYSCOM ���� ADD END
        
        struct.setsub2_STATUS(_NOT_REGISTED);


                //}}user_implement_dev:<controlinsertProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertProcGrp");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdateProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateProcGrp");
			//{{user_implement_dev:<controlupdateProcGrp>

		// �L�[���ݒ�
        _keyStruct.setpr_PROC_CD(struct.getpr_PROC_CD());
        _keyStruct.setpr_PS_EDITION(_keyStruct.getps_PS_EDITION());
        
        // ��ʕ\�����ݒ�
        String status = "1";
        dispSub2(status);

        struct.setsub2_STATUS(_REGISTED);

	
                //}}user_implement_dev:<controlupdateProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateProcGrp");

		return;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcopyProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcopyProcGrp");
			//{{user_implement_dev:<controlcopyProcGrp>

		// �L�[���ݒ�
      _keyStruct.setpr_PROC_CD(struct.getpr_PROC_CD());
      _keyStruct.setpr_PS_EDITION(_keyStruct.getps_PS_EDITION());
      
      // ��ʕ\�����ݒ�
      String status = "0";
      dispSub2(status);
      
      // �i�ڕʍ�ƃR�[�h�͋󗓂ɂ���
      struct.setsub2_PROC_CD("");
      
      struct.setsub2_STATUS(_NOT_REGISTED);

                //}}user_implement_dev:<controlcopyProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcopyProcGrp");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldeleteProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteProcGrp");
			//{{user_implement_dev:<controldeleteProcGrp>

		boolean transFlg = false;
        List listMessage = new ArrayList();
      
        try {
        	// �g�����U�N�V�����J�n
        	conn.beginTransWeb();
        	transFlg = true;
           
        	// �O���P���e�[�u���폜
        	int cnt1 = entity.mdeleteM_SBCNT_UNIT_COST.delete(conn, struct);
      
        	// �O���P���w�b�_�e�[�u���폜
        	int cnt2 = entity.mdeleteM_SBCNT_UNIT_COST_H.delete(conn, struct);
      
        	// ��ƌn��e�[�u���̑Ώۃf�[�^�`�F�b�N
        	checkTargetDataInM_PROC_GRP(struct, struct.getpr_MODIFY_COUNT());
        	
            // �i�ڎ擾
        	struct.setw_TARGET_ITEM_CD(struct.gethidden_ITEM_CD());
        	List itemList = entity.mselectM_ITEM.read(conn, struct);
      
        	// �G���[���Ȃ��ꍇ�A�폜����
        	if (msgStruct.sizeError() <= 0) {
        		// ��ƌn��e�[�u���폜
        		int cnt3 = entity.mdeleteM_PROC_GRP.delete(conn, struct);
        		     
        		// �R�~�b�g
        		conn.commit();
        		transFlg = false;
        		
        		// �L�[���Z�b�g
        		struct.copy(_keyStruct);
        		// �ēǍ�
        		controlselectProcGrp();
      
        		// �폜�Ώۂ��Ȃ������ꍇ
        		if (cnt1 <= 0 && cnt2 <= 0 && cnt3 <= 0) {
        			// �폜�������s�F�Ώۃf�[�^�����݂��܂���
        			listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:"    + struct.getpr_ITEM_CD());
        			listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:"   + struct.getpr_PLANT_CD());
        			listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:"    + struct.getpr_PROC_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:"  + struct.getpr_ITEM_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getpr_PLANT_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:"  + struct.getpr_PROC_CD());
        			listMessage.add("M_PROC_GRP.ITEM_CD:"           + struct.getpr_ITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:"          + struct.getpr_PLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:"           + struct.getpr_PROC_CD());
      
        			setErrorMessage("ZZ06001", listMessage);
           
        		}
        		      
        		// �i�ڏ��擾
        		struct.setw_TARGET_ITEM_CD(struct.getpr_ITEM_CD());
        		itemList.clear();
        		itemList = entity.mselectM_ITEM.read(conn, struct);
        		if (itemList.size() > 0) {
        			// �Œ胊�[�h�^�C���`�F�b�N
        			checkLT((AA0170010Struct)itemList.get(0));
        		}
        	}
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
         
        } finally {
        	try {
        		if (transFlg == true) {
        			// ���[���o�b�N
        			conn.rollback();
        		}
      
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }
                //}}user_implement_dev:<controldeleteProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteProcGrp");

		return;
	}

	/**
	 * �S�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldeleteAllProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteAllProcGrp");
			//{{user_implement_dev:<controldeleteAllProcGrp>
        
		boolean transFlg = false;
        List listMessage = new ArrayList();
      
        try {
        	// �g�����U�N�V�����J�n
        	conn.beginTransWeb();
        	transFlg = true;
        	// �O���P���e�[�u���폜
        	int cnt1 = entity.mdeleteAllM_SBCNT_UNIT_COST.delete(conn, _keyStruct);
      
        	// �O���P���w�b�_�e�[�u���폜
        	int cnt2 = entity.mdeleteAllM_SBCNT_UNIT_COST_H.delete(conn, _keyStruct);
         
        	// ��ƌn��e�[�u���̑ΏۑS�f�[�^�`�F�b�N
        	checkTargetAllDataInM_PROC_GRP(_keyStruct);
      
        	// �G���[���Ȃ��ꍇ�A�폜����
        	if (msgStruct.sizeError() <= 0) {
        		// ��ƌn��e�[�u���폜
        		int cnt3 = entity.mdeleteAllM_PROC_GRP.delete(conn, _keyStruct);
      
        		// �R�~�b�g
        		conn.commit();
        		transFlg = false;
      
        		// ����
        		struct.copy(_keyStruct);
        		controlselectProcGrp();
      
        		// �폜�Ώۂ��Ȃ������ꍇ
        		if (cnt1 <= 0 && cnt2 <= 0 && cnt3 <= 0) {
        			// �ꊇ�폜�������s�F�Ώۃf�[�^�����݂��܂���
        			listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
        			listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getPLANT_CD());
        			listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" +  struct.getPROC_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getPLANT_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" +  struct.getPROC_CD());
        			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
      
        			setErrorMessage("ZZ06001", listMessage);
        		}
      
        		// �i�ڏ��擾
        		struct.setw_TARGET_ITEM_CD(struct.getpr_ITEM_CD());
        		List itemList = entity.mselectM_ITEM.read(conn, struct);
        		if (itemList.size() > 0) {
        			// �Œ胊�[�h�^�C���`�F�b�N
        			checkLT((AA0170010Struct)itemList.get(0));
        		}
        	}
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
      
        } finally {
        	try {
        		if (transFlg == true) {
        			// ���[���o�b�N
        			conn.rollback();
        		}
      
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }
        
		
                //}}user_implement_dev:<controldeleteAllProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteAllProcGrp");

		return;
	}

	/**
	 * �ԍ��ĐU�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlrenumProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlrenumProcGrp");
			//{{user_implement_dev:<controlrenumProcGrp>

		boolean transFlg = false;
        List listMessage = new ArrayList();
      
        try {
        	// �g�����U�N�V�����J�n
        	conn.beginTransWeb();
        	transFlg = true;
      
        	// ��ƌn����̌n��ԍ���"10"���݂ōX�V
        	for (int i = 0, t = 10; i < _procedureList.size(); i++) {
      
        		AA0170010Struct updateStruct = (AA0170010Struct)_procedureList.get(i);
      
        		// ����/�X�V�`�F�b�N
        		List countList = entity.mselectM_PROC_GRP_modify_count.read(conn, updateStruct);
        		if (countList.size() <= 0) {
        			// ��ƌn��ԍ��U���������s�F�Ώۃf�[�^�����݂��܂���
        			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getpr_ITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getpr_PLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getpr_PROC_CD());
      
        			setErrorMessage("ZZ06001", listMessage);
        		} else {
        			String modify = ((AA0170010Struct)countList.get(0)).getMODIFY_COUNT();
        			if (! updateStruct.getpr_MODIFY_COUNT().equals(modify)) {
        				// ��ƌn��ԍ��U���������s�F���̏����ɂ��f�[�^�������������Ă��܂�
        				listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getpr_ITEM_CD());
        				listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getpr_PLANT_CD());
        				listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getpr_PROC_CD());
      
        				setErrorMessage("ZZ01105", listMessage);
        			}
        		}
      
        		// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
        		if (msgStruct.sizeError() <= 0) {
        			// �n��ԍ��A�H��R�[�h�A���[�UID �ݒ�
        			updateStruct.setpr_PROC_NO(Long.toString(t));
        			updateStruct.setPLANT_CD(getsysPLANT_CD());
        			updateStruct.setsUser_ID(struct.getsUser_ID());
      
        			// �X�V
        			entity.mupdateM_PROC_GRP_procNo.update(conn, updateStruct);
        		} else {
        			break;
        		}
      
        		t = t + 10;
        	}
      
        	// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
        	if (msgStruct.sizeError() <= 0) {
        		// �R�~�b�g
        		conn.commit();
        		transFlg = false;
       
        		// ����
        		struct.copy(_keyStruct);
        		controlselect();
        		controlselectProcGrp();
        		
        	} else {
        		// ���[���o�b�N
        		conn.rollback();
        		transFlg = false;
        	}
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
      
        } finally {
        	try {
        		if (transFlg == true) {
        			// ���[���o�b�N
        			conn.rollback();
        		}
      
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }
		
                //}}user_implement_dev:<controlrenumProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlrenumProcGrp");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");
			//{{user_implement_dev:<controlinsertSub2>

		boolean transFlg = false;
		String Message = "";
      	List listMessage = new ArrayList();
      
        try {
        	// ���ږ����͎��̃f�t�H���g�l�ݒ�
        	checkInputSub2(struct);
      
        	// �g�����U�N�V�����J�n
        	conn.beginTransWeb();
        	transFlg = true;
      
        	boolean result = true;			// �`�F�b�N���ʊi�[
        	
        	// �i�ڃe�[�u���擾
        	struct.setw_TARGET_ITEM_CD(struct.getsub2_ITEM_CD());
        	struct.setsub2_PLANT_CD(getsysPLANT_CD());
        	List itemList = entity.mselectM_ITEM.read(conn, struct);
        	// �i�ڏ��ݒ�
        	setItemInfo(struct, itemList);
        	if (itemList.size() <= 0) {
        		// �o�^�������s�F�i�ڏ��̎擾�Ɏ��s���܂���
        		Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
          
        		setErrorMessage("AA01002", Message);
        	} else {
        		// ��ƌn���� �d���`�F�b�N
        		struct.setPLANT_CD(getsysPLANT_CD());
        		struct.setITEM_CD(struct.getsub2_ITEM_CD());
        		struct.setPROC_CD(struct.getsub2_PROC_CD());
        		result = entity.mselectM_PROC_GRP_oneRecord.check(conn, struct);
        		if (result == true) {
        			// �o�^�������s�F�w��L�[�̃f�[�^�����łɑ��݂��܂�
        			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
      
        			setErrorMessage("ZZ01102", listMessage);
        		}
      
        		// ��ƌn��ԍ� �d���`�F�b�N
        		result = entity.mselectM_PROC_GRP_procNo.check(conn, struct);
        		if (result == true) {
        			// �o�^�������s�F��ƌn��ԍ����d�����Ă��܂�
        			listMessage.clear();
           
        			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
      
        			setErrorMessage("AA00065", listMessage);
        		}
      
        		// ��Ƌ�R�[�h�`�F�b�N
        		if (struct.getsub2_WS_CD() != null 
        				&& "".equals(struct.getsub2_WS_CD()) == false) {
        			result = entity.mcheckM_WS.check(conn, struct);
        			if (result == false) {
        				// �o�^�������s�F�w�肵����Ƌ�R�[�h�͖��o�^�ł�
        				Message = "M_WS.WS_CD:" + struct.getsub2_WS_CD();
            
        				setErrorMessage("AA01003", Message);
        			} else {
        				struct.setPLANT_CD(getsysPLANT_CD());
        				result = entity.mcheckM_WS_plantCd.check(conn, struct);
        				if (result == false) {
        					// �o�^�������s�F���H��̍�Ƌ�R�[�h�͎w��ł��܂���
        					listMessage.clear();
             
        					listMessage.add("M_WS.PLANT_CD:" + struct.getPLANT_CD());
        					listMessage.add("M_WS.PROC_CD:" + struct.getsub2_PROC_CD());
      
        					setErrorMessage("AA01005", listMessage);
        				}
        			}
        		}
       
        		// �����R�[�h�`�F�b�N
        		if (struct.getsub2_VEND_CD() != null 
        				&& "".equals(struct.getsub2_VEND_CD()) == false) {
        			result = entity.mcheckM_VEND_CTRL.check(conn, struct);
        			if (result == false) {
        				// �o�^�������s�F�w�肵�������R�[�h�͖��o�^�ł�", struct.getsUser_ID());
        				Message = "M_VEND_CTRL.VEND_CD:" + struct.getsub2_VEND_CD();
            
        				setErrorMessage("AA01004", Message);
        			}
        		}
        	}
      
        	// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
        	if (msgStruct.sizeError() <= 0) {
        		AA0170010Struct itemStruct = (AA0170010Struct)itemList.get(0);
      
        		// ��ЃR�[�h�擾
        		List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
        		if (companyList.size() > 0) {
        			struct.setsub2_COMPANY_CD(((AA0170010Struct)companyList.get(0)).getCOMPANY_CD());
        		}
      
        		// ��ƌn���ᕪ���b�g�T�C�Y�`�F�b�N
        		boolean resultCeil = false;
        		if (itemStruct.getUNIT_QTY_TYP().intValue() == 1) {
        			if (Calculate.isNumeric(struct.getsub2_PROP_LOT_SIZE()) == true) {
        				resultCeil = true;
        				struct.setsub2_PROP_LOT_SIZE(Calculate.ceil(struct.getsub2_PROP_LOT_SIZE(), 0));
        			}
        		}
      
        		// ��ƌn��ǉ�       		
        		entity.minsertM_PROC_GRP.create(conn, struct);       		
        		
        		if (resultCeil == true) {
        			// �o�^�������s�F�����Ǘ��i�ڂ̂��ߔ�ᕪ���b�g�T�C�Y�̏����_�ȉ��͐؂�グ���ēo�^���܂���
        			setInfoMessage("AA60002", "");
        		}
      
        		// �R�~�b�g
        		conn.commit();
        		transFlg = false;
      
        		// �L�[���ݒ�
        		_keyStruct.setpr_PROC_CD(struct.getsub2_PROC_CD());
      
        		// ����
        		struct.copy(_keyStruct);
        		controlselect();
        	} 
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
      
        } finally {
        	try {
        		if (transFlg == true) {
        			// ���[���o�b�N
        			conn.rollback();
        		}
      
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }
		

        
                //}}user_implement_dev:<controlinsertSub2>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdateSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub2");
			//{{user_implement_dev:<controlupdateSub2>

		boolean transFlg = false;
        String inProcNo = null;
        String Message = "";
        List listMessage = new ArrayList();
      
        try {
        	// ���ږ����͎��̃f�t�H���g�l�ݒ�
        	checkInputSub2(struct);
      
        	// �g�����U�N�V�����J�n
        	conn.beginTransWeb();
        	transFlg = true;
      
        	boolean result = true;			// �`�F�b�N���ʊi�[
      
        	// �i�ڃe�[�u���擾
        	struct.setw_TARGET_ITEM_CD(struct.getsub2_ITEM_CD());
        	List itemList = entity.mselectM_ITEM.read(conn, struct);
        	
        	// �X�V�O��ƌn��擾
        	struct.setPLANT_CD(getsysPLANT_CD());
        	struct.setITEM_CD(struct.getsub2_ITEM_CD());
        	struct.setPROC_CD(struct.getsub2_PROC_CD());
        	List prList_old = entity.mselectM_PROC_GRP_oneRecord.read(conn, struct);
        	
        	// �i�ڏ��ݒ�
        	setItemInfo(struct, itemList);
        	if (itemList.size() <= 0) {
        		// �X�V�������s�F�i�ڏ��̎擾�Ɏ��s���܂���
        		Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
          
        		setErrorMessage("AA01002", Message);
        	} else {
    			// �����p�p�����[�^�̐ݒ�
    			struct.setpr_PLANT_CD(struct.getsub2_PLANT_CD());
        		struct.setpr_ITEM_CD(struct.getsub2_ITEM_CD());
        		struct.setpr_PROC_CD(struct.getsub2_PROC_CD());

        		// ����/�X�V�`�F�b�N
        		List countList = entity.mselectM_PROC_GRP_modify_count.read(conn, struct);
        		if (countList.size() <= 0) {
        			// �X�V�������s�F�Ώۃf�[�^�����݂��܂���
        			listMessage.add("M_PROC_GRP.ITEM_CD:"  + struct.getsub2_ITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getsub2_PLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:"  + struct.getsub2_PROC_CD());
      
        			setErrorMessage("ZZ06001", listMessage);
        		} else {
        			String modify = ((AA0170010Struct)countList.get(0)).getMODIFY_COUNT();
        			if (! struct.getsub2_MODIFY_COUNT().equals(modify)) {
        				// �X�V�������s�F���̏����ɂ��f�[�^�������������Ă��܂�", struct.getsUser_ID());
        				listMessage.add("M_PROC_GRP.ITEM_CD:"  + struct.getsub2_ITEM_CD());
        				listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getsub2_PLANT_CD());
        				listMessage.add("M_PROC_GRP.PROC_CD:"  + struct.getsub2_PROC_CD());
      
        				setErrorMessage("ZZ01105", listMessage);
        			}
        		}
        		
        		// ��ƌn��ԍ��̏d���`�F�b�N
    			result = entity.mselectM_PROC_GRP_procNo.check(conn, struct);
    			if (result == true) {
    				// �X�V�������s�F��ƌn��ԍ����d�����Ă��܂�", struct.getsUser_ID());
    				listMessage.clear();
       
    				listMessage.add("M_PROC_GRP.ITEM_CD:"  + struct.getsub2_ITEM_CD());
    				listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getsub2_PLANT_CD());
    				listMessage.add("M_PROC_GRP.PROC_CD:"  + struct.getsub2_PROC_CD());
  
    				setErrorMessage("AA00065", listMessage);
    			}

                // ��Ƌ�R�[�h�`�F�b�N
        		if (struct.getsub2_WS_CD() != null 
        				&& ! "".equals(struct.getsub2_WS_CD())) {
        			result = entity.mcheckM_WS.check(conn, struct);
        			if (! result) { 
        				// �X�V�������s�F�w�肵����Ƌ�R�[�h�͖��o�^�ł�
        				Message = "M_WS.PROC_CD:" + struct.getsub2_PROC_CD();
          
        				setErrorMessage("AA01003", Message);
        			} else {
        				struct.setPLANT_CD(getsysPLANT_CD());

        				result = entity.mcheckM_WS_plantCd.check(conn, struct);
        				if (! result) {
        					// �X�V�������s�F���H��̍�Ƌ�R�[�h�͎w��ł��܂���
        					listMessage.clear();
            
        					listMessage.add("M_WS.PLANT_CD:" + struct.getsub2_PLANT_CD());
        					listMessage.add("M_WS.PROC_CD:"  + struct.getsub2_PROC_CD());
      
        					setErrorMessage("AA01005", listMessage);
        				}
        			}
        		}
       
        		// �����R�[�h�`�F�b�N
        		if (struct.getsub2_VEND_CD() != null 
        				&& ! "".equals(struct.getsub2_VEND_CD())) {
        			result = entity.mcheckM_VEND_CTRL.check(conn, struct);
        			if (! result) {
        				// �X�V�������s�F�w�肵�������R�[�h�͖��o�^�ł�
        				Message = "M_VEND_CTRL.VEND_CD:" + struct.getsub2_VEND_CD();
          
        				setErrorMessage("AA01004", Message);
        			}
        		}
        	}
      
        	// �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
        	if (msgStruct.sizeError() <= 0) {
        		AA0170010Struct itemStruct = (AA0170010Struct)itemList.get(0);
       
        		// ��ЃR�[�h�擾
        		List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
        		if (companyList.size() > 0) {
        			struct.setsub2_COMPANY_CD(((AA0170010Struct)companyList.get(0)).getCOMPANY_CD());
        		}
        		// ��ƌn���ᕪ���b�g�T�C�Y�`�F�b�N
        		boolean resultCeil = false;
        		if (itemStruct.getUNIT_QTY_TYP().intValue() == 1) {
        			if (Calculate.isNumeric(struct.getsub2_PROP_LOT_SIZE())) {
        				resultCeil = true;
        				struct.setsub2_PROP_LOT_SIZE(Calculate.ceil(struct.getsub2_PROP_LOT_SIZE(), 0));
        			}
        		}	
      
        		// ��ƌn��X�V
        		entity.mupdateM_PROC_GRP.update(conn, struct);
        		
        		if (resultCeil) {
        			// �o�^�������s�F�����Ǘ��i�ڂ̂��ߔ�ᕪ���b�g�T�C�Y�̏����_�ȉ��͐؂�グ���ēo�^���܂���", struct.getsUser_ID());
        			setInfoMessage("AA60002", "");
        		}
      
        		// �R�~�b�g
        		conn.commit();
        		transFlg = false;
        		     
        		// ����
        		struct.copy(_keyStruct);
        		controlselect();
      
        	} else {
        		// ���[���o�b�N
        		conn.rollback();
        		transFlg = false;
        	}
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
      
        } finally {
        	try {
        		if (transFlg == true) {
        			// ���[���o�b�N
        			conn.rollback();
        		}
        		
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }	
		
                //}}user_implement_dev:<controlupdateSub2>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub2");

		return;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlcloseSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");
			//{{user_implement_dev:<controlcloseSub2>
		
		// �L�[���R�s�[
        struct.copy(_keyStruct);		
              
        // ���i�\���O���b�h�Č���
        controlselect();


                //}}user_implement_dev:<controlcloseSub2>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");

		return;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsertPs() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertPs");
			//{{user_implement_dev:<controlinsertPs>

		// �Ώۂ̍\�������R�s�[
		AA0170010Struct workStruct = (struct);
		
		// ����������
		initializeSub1();
		
		// ���W�J
		if (struct.getmain_DEVELOP_TYP().equals("1")) {
			
			if (struct.getps_NO().equals("1")) {
				// �擪�s(�i�ڂ݂̂̍s)�̏ꍇ �e�i�ڔԍ����T�u��ʂ̕i�ڔԍ�
				struct.setsub1_PARENT_ITEM_CD(workStruct.getps_PARENT_ITEM_CD());
				struct.setsub1_PARENT_ITEM_NAME(workStruct.getps_PARENT_ITEM_NAME());
			} else {
				// 2�s�ڈȍ~�� ���̍s�̍\���i�ڔԍ����T�u��ʂ̕i�ڔԍ�
				struct.setsub1_PARENT_ITEM_CD(workStruct.getps_COMP_ITEM_CD());
				struct.setsub1_PARENT_ITEM_NAME(workStruct.getps_COMP_ITEM_NAME());
			}
			
		} else {
			// �t�W�J�̂Ƃ��� ��ɐe�i�ڔԍ��� �T�u��ʂ̍\���i�ڔԍ�
			struct.setsub1_COMP_ITEM_CD(workStruct.getps_PARENT_ITEM_CD());
			struct.setsub1_COMP_ITEM_NAME(workStruct.getps_PARENT_ITEM_NAME());
			struct.setsub1_STOCK_UNIT(workStruct.getps_STOCK_UNIT());
		}
		  
		struct.setmain_TARGET_ITEM_CD(workStruct.getmain_DEVELOP_TYP());
		struct.setmain_DEVELOP_TYP(workStruct.getmain_DEVELOP_TYP());
		struct.setmain_LEVEL(workStruct.getmain_DEVELOP_TYP());
		struct.setmain_TARGET_DATE(workStruct.getmain_DEVELOP_TYP());
		
		struct.setsub1_TARGET_ITEM_CD(workStruct.getmain_DEVELOP_TYP());
		struct.setsub1_DEVELOP_TYP(workStruct.getmain_DEVELOP_TYP());
		struct.setsub1_LEVEL(workStruct.getmain_DEVELOP_TYP());
		struct.setsub1_TARGET_DATE(workStruct.getmain_DEVELOP_TYP());
		
		try{
		// �V�X�e���p�����[�^�擾
		struct.setPARAM_INPUT_DATA("PS_EFF_PHASE_IN_DATE");
		List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
		if (sysParameterList!=null && sysParameterList.size()>0) {
			AA0170010Struct sysParameterStruct = (AA0170010Struct) sysParameterList.get(0);
			// �\���L���J�n��       
	        String ps_EFF_PHASE_IN_DATE = sysParameterStruct.getPARAM_RESULT_DATA();  
	        // �f*�f�ł���΁A�H��Ɩ����t��\������
			if("*".equals(ps_EFF_PHASE_IN_DATE)){
	      	   List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
	      	   if(!temlist.isEmpty()){
	      		   // �\���L���J�n��  =  �Ɩ��^�p��
	      		   struct.setsub1_EFF_PHASE_IN_DATE(((AA0170010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());             				  
	      	   }
			} else {
				if(checkDate(ps_EFF_PHASE_IN_DATE)){
					try{
	        			//���t�`���𔻕�
	        			Date t = stringToDate(ps_EFF_PHASE_IN_DATE);
	        			  //[�p�����[�^]�D"�ݒ�l"!=null�̏ꍇ�A�L���I�����t�@= [�p�����[�^]�D"�ݒ�l"
	        			struct.setsub1_EFF_PHASE_IN_DATE(dateToString(t));
	        		}catch(ParseException   e){
	        			//"�L���I�����̃p�����[�^���s���ł��B"
	        			ExpjMessage emsg = new ExpjMessage("ZZ13002");
	                    msgStruct.addError(emsg);
	                    sysLog.warning(emsg, getsysUSER_CD());
	        		}
				} else if(!ps_EFF_PHASE_IN_DATE.toLowerCase().equals("null")){
					//"�L���J�n���̃p�����[�^���s���ł��B"
	      			ExpjMessage emsg = new ExpjMessage("ZZ13001");
	                msgStruct.addError(emsg);
	                sysLog.warning(emsg, getsysUSER_CD());
				}
			}
		} else {
			struct.setsub1_EFF_PHASE_IN_DATE(null); 
		}
		// �V�X�e���p�����[�^�擾
		struct.setPARAM_INPUT_DATA("PS_EFF_PHASE_OUT_DATE");
		List sysParameterList2 = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
		if (sysParameterList2 != null && sysParameterList2.size() > 0) {
			AA0170010Struct sysParameterStruct = (AA0170010Struct) sysParameterList2.get(0);
			// �\���L���I����
			String ps_EFF_PHASE_OUT_DATE = sysParameterStruct.getPARAM_RESULT_DATA(); 
	        // �f*�f�ł���΁A�H��Ɩ����t��\������
			if("*".equals(ps_EFF_PHASE_OUT_DATE)){
	      	   List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
	      	   if(!temlist.isEmpty()){
	      		   // �\���L���J�n��  =  �Ɩ��^�p��
	      		   struct.setsub1_EFF_PHASE_OUT_DATE(((AA0170010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());             				  
	      	   }
			} else {
				if(checkDate(ps_EFF_PHASE_OUT_DATE)){
					try{
	        			//���t�`���𔻕�
	        			Date t = stringToDate(ps_EFF_PHASE_OUT_DATE);
	        			  //[�p�����[�^]�D"�ݒ�l"!=null�̏ꍇ�A�L���I�����t�@= [�p�����[�^]�D"�ݒ�l"
	        			struct.setsub1_EFF_PHASE_OUT_DATE(dateToString(t));
	        		}catch(ParseException   e){
	        			//"�L���I�����̃p�����[�^���s���ł��B"
	        			ExpjMessage emsg = new ExpjMessage("ZZ13002");
	                    msgStruct.addError(emsg);
	                    sysLog.warning(emsg, getsysUSER_CD());
	        		}
				} else if(!ps_EFF_PHASE_OUT_DATE.toLowerCase().equals("null")){
					//"�L���J�n���̃p�����[�^���s���ł��B"
	      			ExpjMessage emsg = new ExpjMessage("ZZ13002");
	                msgStruct.addError(emsg);
	                sysLog.warning(emsg, getsysUSER_CD());
				}				
			}
		} else {
			struct.setsub1_EFF_PHASE_OUT_DATE(null);
		}
		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
        	//      ------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertPs>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertPs");

		return;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdatePs() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdatePs");
			//{{user_implement_dev:<controlupdatePs>
		
		// �e��ʂ̏����q��ʂɃZ�b�g
		struct.setsub1_PARENT_ITEM_CD(struct.getps_PARENT_ITEM_CD());
		struct.setsub1_PARENT_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
		struct.setsub1_COMP_ITEM_CD(struct.getps_COMP_ITEM_CD());
		struct.setsub1_COMP_ITEM_NAME(struct.getps_COMP_ITEM_NAME());
		struct.setsub1_PS_EDITION(struct.getps_PS_EDITION());
		struct.setsub1_PS_UNIT_NUMERATOR(struct.getps_PS_UNIT_NUMERATOR());
		struct.setsub1_PS_UNIT_DENOMINATOR(struct.getps_PS_UNIT_DENOMINATOR());
		struct.setsub1_h_PS_UNIT_NUMERATOR(struct.getps_PS_UNIT_NUMERATOR());
		struct.setsub1_h_PS_UNIT_DENOMINATOR(struct.getps_PS_UNIT_DENOMINATOR());
		struct.setsub1_STOCK_UNIT(struct.getps_STOCK_UNIT());
		struct.setsub1_EFF_PHASE_IN_DATE(struct.getps_EFF_PHASE_IN_DATE());
		struct.setsub1_EFF_PHASE_OUT_DATE(struct.getps_EFF_PHASE_OUT_DATE());
		struct.setsub1_PS_SPOIL(struct.getps_PS_SPOIL());
		struct.setsub1_CONS_TYP(struct.getps_CONS_TYP());
		struct.setsub1_PS_REF_NO(struct.getps_PS_REF_NO());
		struct.setsub1_PS_LT_CHECK(struct.getps_PS_LT_FLG());
		struct.setsub1_PS_FIXED_LT(struct.getps_PS_FIXED_LT());
		struct.setsub1_PS_PROP_LT(struct.getps_PS_PROP_LT());
		struct.setsub1_PS_PROP_LOT_SIZE(struct.getps_PS_PROP_LOT_SIZE());
		struct.setsub1_COST_UP_TYP(struct.getps_COST_UP_TYP());
		struct.setsub1_MRP_EXP_TYP(struct.getps_MRP_EXP_TYP());
		struct.setsub1_DEVELOP_TYP(struct.getmain_DEVELOP_TYP());
		struct.setsub1_MODIFY_COUNT(struct.getps_MODIFY_COUNT());
		struct.setsub1_PS_LT_FLG(struct.getps_PS_LT_FLG());
		
		struct.setmain_TARGET_ITEM_CD(struct.getmain_TARGET_ITEM_CD());
		struct.setmain_DEVELOP_TYP(struct.getmain_DEVELOP_TYP());
		struct.setmain_LEVEL(struct.getmain_LEVEL());
		struct.setmain_TARGET_DATE(struct.getmain_TARGET_DATE());

		
                //}}user_implement_dev:<controlupdatePs>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdatePs");

		return;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldeletePs() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeletePs");
			//{{user_implement_dev:<controldeletePs>
		String Message = "";
        
        // DB�X�V���t���O������
        bDBUpdate = false;
         
        try {
	        // �g�����U�N�V�����J�n
	        conn.beginTrans();
	         
	        // DB�X�V���t���OON
	        bDBUpdate = true;
	      
	        // ����/�X�V�`�F�b�N
	        List countList = entity.mselectM_PS_modify_count.read(conn, struct);
	        if (countList.size() <= 0) {
	        	Message = "The target data does not exist";
	            setErrorMessageNoKey("ZZ01105", Message);
	        } else {
	            String modify = ((AA0170010Struct)countList.get(0)).getMODIFY_COUNT();
	            if (struct.getps_MODIFY_COUNT().equals(modify) == false) {
	                Message = "Data is rewritten by other processings.";
	                setErrorMessageNoKey("ZZ01105", Message);
	            }
	        }
         
	        // �`�F�b�N�ŃG���[���������Ă��Ȃ��ꍇ
	        if (msgStruct.sizeError() <= 0) {
	         
	            AA0170010Struct targetStruct = struct;
	          
	            // ���i�\���g�����U�N�V�����ւ̒ǉ�
	            AA0170010Struct addStruct = new AA0170010Struct();
	            addStruct.setsUser_ID(new String(struct.getsUser_ID()));		// ���[�UID�ݒ�
	      
	            List workList = entity.mselectSYS_PS_T.read(conn, targetStruct);
	            long no = 0;	 // �V�[�P���V����No
	            if (workList.size() <= 0 || 
	            		((AA0170010Struct)workList.get(0)).getSEQ_NO() == null) {
	            	no = 0;
	            } else {
	                no = Long.parseLong(((AA0170010Struct) workList.get(0)).getSEQ_NO());
	            }
	            addStruct.setACCESS_TYP("2");   	// �������@ 2:�폜
	            addStruct.setCMPLT_FLG("0");        // �����t���O 0:��
	      
	            if (_keyStruct.getmain_DEVELOP_TYP().equals("1")) {
	            // ���W�J
	            addStruct.setCOMP_ITEM_CD(targetStruct.getps_COMP_ITEM_CD());
	            addStruct.setPARENT_ITEM_CD(targetStruct.getps_PARENT_ITEM_CD());
	            addStruct.setSEQ_NO(Long.toString(no + 1));
	            addStruct.setPS_EDITION(targetStruct.getps_PS_EDITION());
	            entity.minsertSYS_PS_T.create(conn, addStruct);
           
	            } else {
	            	// �t�W�J
	            	addStruct.setPARENT_ITEM_CD(targetStruct.getps_PARENT_ITEM_CD());
	            	addStruct.setCOMP_ITEM_CD(targetStruct.getps_COMP_ITEM_CD());
	            	addStruct.setSEQ_NO(Long.toString(no + 1));
	            	addStruct.setPS_EDITION(targetStruct.getps_PS_EDITION());
	            	entity.minsertSYS_PS_T.create(conn, addStruct);
	           
	            }
	            
		        // ���i�\���e�[�u���폜
		        entity.mdeleteM_PS.delete(conn, targetStruct);
	      
		        // �R�~�b�g
		        conn.commit();
	          
		        // DB�X�V���t���OOFF
		        bDBUpdate = false;
	      
		        // ����
		        struct.copy(_keyStruct);
		        controlselect();
		        
		    }
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
  
        } finally {
        	// DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��roolback�������Ȃ�
        	if (bDBUpdate == true) {
        		// ���[���o�b�N
        		conn.rollback();
  
        		// DB�X�V���t���OOFF
        		bDBUpdate = false;
        	}
        }
                //}}user_implement_dev:<controldeletePs>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeletePs");

		return;
	}

	/**
	 * �S�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldeleteAllPs() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteAllPs");
			//{{user_implement_dev:<controldeleteAllPs>

		// DB�X�V���t���O������
        bDBUpdate = false;
      
        try {
      
        	// �g�����U�N�V�����J�n
        	conn.beginTrans();
         
        	// DB�X�V���t���OON
        	bDBUpdate = true;
         
        	// �폜
        	AA0170010Struct targetStruct = new AA0170010Struct();
        	targetStruct.copy(struct);
      
        	// �V�[�P���V����No�擾
        	List workList = entity.mselectSYS_PS_T.read(conn, targetStruct);
        	long no = 0;	 // �V�[�P���V����No
        	if (workList.size() <= 0 || 
        			((AA0170010Struct)workList.get(0)).getSEQ_NO() == null) {
        		no = 0;
        	} else {
        		no = Long.parseLong(((AA0170010Struct)workList.get(0)).getSEQ_NO());
        	}
        	AA0170010Struct addStruct = new AA0170010Struct();
        	addStruct.setsUser_ID(new String(struct.getsUser_ID()));	// ���[�UID�ݒ�
        	addStruct.setACCESS_TYP("2");					// �������@ 2:�폜
        	addStruct.setCMPLT_FLG("0");					 // �����t���O 0:��
      
        	List deleteList = null;
        	if (_keyStruct.getmain_DEVELOP_TYP().equals("1")) {
        		// ���W�J
        		targetStruct.setps_COMP_ITEM_CD(null);
        	} else { 
        		// �t�W�J
        		targetStruct.setps_PARENT_ITEM_CD(null);
        	}
      
        	deleteList = checkTargetDataIn(targetStruct, 
        			Integer.parseInt(_keyStruct.getmain_DEVELOP_TYP()));
         
        	// �G���[���������Ă��Ȃ��ꍇ�A�X�V�������{
        	if (deleteList != null) {
         
        		for (int i = 0; i < deleteList.size(); i++) {
        			AA0170010Struct paramStruct = (AA0170010Struct)deleteList.get(i);
        			paramStruct.setPLANT_CD(getsysPLANT_CD());
        			paramStruct.setps_PARENT_ITEM_CD(paramStruct.getPARENT_ITEM_CD());
        			paramStruct.setps_COMP_ITEM_CD(paramStruct.getCOMP_ITEM_CD());
        			paramStruct.setps_PS_EDITION(paramStruct.getPS_EDITION());
        			// ���i�\���e�[�u���폜
        			entity.mdeleteM_PS.delete(conn, paramStruct);
        		}
          
        		// ���i�\���g�����U�N�V�����ǉ�
        		for (int i = 0; i < deleteList.size(); i++) {
        			addStruct.setSEQ_NO(Long.toString(no + 1 + i));
        			addStruct.setPARENT_ITEM_CD(((AA0170010Struct)deleteList.get(i)).getPARENT_ITEM_CD());
        			addStruct.setCOMP_ITEM_CD(((AA0170010Struct)deleteList.get(i)).getCOMP_ITEM_CD());
        			addStruct.setPS_EDITION(((AA0170010Struct)deleteList.get(i)).getPS_EDITION());
        			entity.minsertSYS_PS_T.create(conn, addStruct);
        		}
      
        		// �R�~�b�g
        		conn.commit();
          
        		// DB�X�V���t���OOFF
        		bDBUpdate = false;
      
        		// ����
        		struct.copy(_keyStruct);
        		controlselect();
        	}
      
        } catch (SQLException e) {
        	setSqlExceptionMsg(e);
      
        } finally {
        	// DB�X�V�������ɉ��炩�̃G���[�����������ꍇ��rollback�������Ȃ�
        	if (bDBUpdate == true) {
        		// ���[���o�b�N
        		conn.rollback();
      
        		// DB�X�V���t���OOFF
        		bDBUpdate = false;
        	}
        }
                //}}user_implement_dev:<controldeleteAllPs>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteAllPs");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		setComboData(struct);
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
               //------------------------------------------------------------------
              
                try {
              
                 PrivateConfig c = new PrivateConfig(conn);
              
                 // �����W�J���x���擾
                 Integer initlevel = c.getNumber("INIT_DISPLAY_PS_LEVEL");
                 if (initlevel == null) {
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ���O�o�͂̂�
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The initial deployment level is not defined" );
                  sysLog.severe(log, getsysUSER_CD());
                  throw ee;
                 }
                 else if (initlevel.intValue() < 0) {
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ���O�o�͂̂�
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The value of an initial deployment level is not right" );
                  sysLog.severe(log, getsysUSER_CD());
                  throw ee;
                 }
                 // �ő�W�J���x���擾
                 Integer level = c.getNumber("MAX_DISPLAY_PS_LEVEL");
                 if (level == null) {
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ���O�o�͂̂�
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The max deployment level is not defined" );
                  sysLog.severe(log, getsysUSER_CD());
                  throw ee;
                 }
                 else if (level.intValue() < 0) {
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ���O�o�͂̂�
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The max of an initial deployment level is not right" );
                  sysLog.severe(log, getsysUSER_CD());
                  throw ee;
                 }                             
                 
                 _level = level.toString();
                 _initlevel = initlevel.toString();
                 _keyStruct.setmain_LEVEL(_initlevel);
              
                 // �R���{�{�b�N�X�f�[�^�p��
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);
              
                 _DEVELOP_TYP    = comboController.getData("DEVELOP_TYP");
                 _CONS_TYP       = comboController.getData("CONS_TYP");
                 _COST_UP_TYP    = comboController.getData("COST_UP_TYP");
                 _MRP_EXP_TYP    = comboController.getData("MRP_EXP_TYP");
// 2008/07/16 SYSCOM ���� ADD START 
                 _MANHOUR_TYP = comboController.getData("MANHOUR_TYP");
// 2008/07/16 SYSCOM ���� ADD END
                 _PS_LT_FLG      = comboController.getData("PS_LT_FLG");
                 _OUTSIDE_TYP    = comboController.getData("OUTSIDE_TYP");
                 _ACPT_INSPC_TYP = comboController.getData("ACPT_INSPC_TYP");
                 _PROC_GRP_LT_UNIT = comboController.getData("PROC_GRP_LT_UNIT");
                 comboController.setConnection(null);
              
                 controlclear();
               
                 setReadStatus(INITIAL);

              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } catch(ComboException e) {
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
                }
                
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // �R���{�{�b�N�X���i�̃f�[�^�̃Z�b�g�͂����ɋL�q���Ă��������B
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("selectProcGrp") ) {
				controlselectProcGrp();
			} else if( button.equals("insertProcGrp") ) {
				controlinsertProcGrp();
			} else if( button.equals("updateProcGrp") ) {
				controlupdateProcGrp();
			} else if( button.equals("copyProcGrp") ) {
				controlcopyProcGrp();
			} else if( button.equals("deleteProcGrp") ) {
				controldeleteProcGrp();
			} else if( button.equals("deleteAllProcGrp") ) {
				controldeleteAllProcGrp();
			} else if( button.equals("renumProcGrp") ) {
				controlrenumProcGrp();
			} else if( button.equals("insertSub2") ) {
				controlinsertSub2();
			} else if( button.equals("updateSub2") ) {
				controlupdateSub2();
			} else if( button.equals("closeSub2") ) {
				controlcloseSub2();
			} else if( button.equals("insertPs") ) {
				controlinsertPs();
			} else if( button.equals("updatePs") ) {
				controlupdatePs();
			} else if( button.equals("deletePs") ) {
				controldeletePs();
			} else if( button.equals("deleteAllPs") ) {
				controldeleteAllPs();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
               //------------------------------------------------------------------
                struct.setList_main_DEVELOP_TYP_val(_DEVELOP_TYP.getValList());
                struct.setList_main_DEVELOP_TYP_name(_DEVELOP_TYP.getExplanList());
                struct.setList_sub1_CONS_TYP_val(_CONS_TYP.getValList());
                struct.setList_sub1_CONS_TYP_name(_CONS_TYP.getExplanList());
                struct.setList_sub1_COST_UP_TYP_val(_COST_UP_TYP.getValList());
                struct.setList_sub1_COST_UP_TYP_name(_COST_UP_TYP.getExplanList());
                struct.setList_sub1_MRP_EXP_TYP_val(_MRP_EXP_TYP.getValList());
                struct.setList_sub1_MRP_EXP_TYP_name(_MRP_EXP_TYP.getExplanList());
                struct.setList_sub2_OUTSIDE_TYP_val((_OUTSIDE_TYP.getValList()));
                struct.setList_sub2_OUTSIDE_TYP_name((_OUTSIDE_TYP.getExplanList()));
                struct.setList_sub2_ACPT_INSPC_TYP_val((_ACPT_INSPC_TYP.getValList()));
                struct.setList_sub2_ACPT_INSPC_TYP_name((_ACPT_INSPC_TYP.getExplanList()));

              
              //	      } catch(AlarmMessageException ame) {
              //		      ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
              //		      throw ee;
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
//			throw new FoundationException("AA0170010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0170010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0170010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0170010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0170010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0170010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0170010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0170010Entity entity;
	protected AA0170010Struct struct;
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

		entity = new AA0170010Entity();
		struct = new AA0170010Struct();

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
	 * AA0170010�N���X�̕W���R���X�g���N�^
	 */
	public AA0170010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
              
                list = new ArrayList(0);
                
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
				AA0170010Struct key = (AA0170010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP_name") && key.getsub2_OUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("sub2_OUTSIDE_TYP_name", key.getsub2_OUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP_val") && key.getsub2_OUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("sub2_OUTSIDE_TYP_val", key.getsub2_OUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP_name") && key.getsub2_ACPT_INSPC_TYP_name() != null) {
					msgKey.setKeyValue("sub2_ACPT_INSPC_TYP_name", key.getsub2_ACPT_INSPC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP_val") && key.getsub2_ACPT_INSPC_TYP_val() != null) {
					msgKey.setKeyValue("sub2_ACPT_INSPC_TYP_val", key.getsub2_ACPT_INSPC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("main_TARGET_ITEM_CD") && key.getmain_TARGET_ITEM_CD() != null) {
					msgKey.setKeyValue("main_TARGET_ITEM_CD", key.getmain_TARGET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP") && key.getmain_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("main_DEVELOP_TYP", key.getmain_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP_name") && key.getmain_DEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("main_DEVELOP_TYP_name", key.getmain_DEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP_val") && key.getmain_DEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("main_DEVELOP_TYP_val", key.getmain_DEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("main_TARGET_DATE") && key.getmain_TARGET_DATE() != null) {
					msgKey.setKeyValue("main_TARGET_DATE", key.getmain_TARGET_DATE());
				}
				if(msgKeyType.containsKeyColumn("main_LEVEL") && key.getmain_LEVEL() != null) {
					msgKey.setKeyValue("main_LEVEL", key.getmain_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("ps_NO") && key.getps_NO() != null) {
					msgKey.setKeyValue("ps_NO", key.getps_NO());
				}
				if(msgKeyType.containsKeyColumn("ps_CONS_NAME") && key.getps_CONS_NAME() != null) {
					msgKey.setKeyValue("ps_CONS_NAME", key.getps_CONS_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_LT_NAME") && key.getps_PS_LT_NAME() != null) {
					msgKey.setKeyValue("ps_PS_LT_NAME", key.getps_PS_LT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_COST_UP_NAME") && key.getps_COST_UP_NAME() != null) {
					msgKey.setKeyValue("ps_COST_UP_NAME", key.getps_COST_UP_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_MRP_EXP_NAME") && key.getps_MRP_EXP_NAME() != null) {
					msgKey.setKeyValue("ps_MRP_EXP_NAME", key.getps_MRP_EXP_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_OUTSIDE_NAME") && key.getpr_OUTSIDE_NAME() != null) {
					msgKey.setKeyValue("pr_OUTSIDE_NAME", key.getpr_OUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_ACPT_INSPC_NAME") && key.getpr_ACPT_INSPC_NAME() != null) {
					msgKey.setKeyValue("pr_ACPT_INSPC_NAME", key.getpr_ACPT_INSPC_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub1_PARENT_ITEM_NAME") && key.getsub1_PARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("sub1_PARENT_ITEM_NAME", key.getsub1_PARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub1_DEVELOP_TYP") && key.getsub1_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("sub1_DEVELOP_TYP", key.getsub1_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("sub1_COMP_ITEM_NAME") && key.getsub1_COMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("sub1_COMP_ITEM_NAME", key.getsub1_COMP_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub1_MODIFY_COUNT") && key.getsub1_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("sub1_MODIFY_COUNT", key.getsub1_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("sub1_STOCK_UNIT") && key.getsub1_STOCK_UNIT() != null) {
					msgKey.setKeyValue("sub1_STOCK_UNIT", key.getsub1_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("sub1_CONS_TYP_name") && key.getsub1_CONS_TYP_name() != null) {
					msgKey.setKeyValue("sub1_CONS_TYP_name", key.getsub1_CONS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("sub1_CONS_TYP_val") && key.getsub1_CONS_TYP_val() != null) {
					msgKey.setKeyValue("sub1_CONS_TYP_val", key.getsub1_CONS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_LT_CHECK") && key.getsub1_PS_LT_CHECK() != null) {
					msgKey.setKeyValue("sub1_PS_LT_CHECK", key.getsub1_PS_LT_CHECK());
				}
				if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP_name") && key.getsub1_COST_UP_TYP_name() != null) {
					msgKey.setKeyValue("sub1_COST_UP_TYP_name", key.getsub1_COST_UP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP_val") && key.getsub1_COST_UP_TYP_val() != null) {
					msgKey.setKeyValue("sub1_COST_UP_TYP_val", key.getsub1_COST_UP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP_name") && key.getsub1_MRP_EXP_TYP_name() != null) {
					msgKey.setKeyValue("sub1_MRP_EXP_TYP_name", key.getsub1_MRP_EXP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP_val") && key.getsub1_MRP_EXP_TYP_val() != null) {
					msgKey.setKeyValue("sub1_MRP_EXP_TYP_val", key.getsub1_MRP_EXP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("sub1_TARGET_ITEM_CD") && key.getsub1_TARGET_ITEM_CD() != null) {
					msgKey.setKeyValue("sub1_TARGET_ITEM_CD", key.getsub1_TARGET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("sub1_LEVEL") && key.getsub1_LEVEL() != null) {
					msgKey.setKeyValue("sub1_LEVEL", key.getsub1_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("sub1_TARGET_DATE") && key.getsub1_TARGET_DATE() != null) {
					msgKey.setKeyValue("sub1_TARGET_DATE", key.getsub1_TARGET_DATE());
				}
				if(msgKeyType.containsKeyColumn("pr_PS_EDITION") && key.getpr_PS_EDITION() != null) {
					msgKey.setKeyValue("pr_PS_EDITION", key.getpr_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("hidden_ITEM_NAME") && key.gethidden_ITEM_NAME() != null) {
					msgKey.setKeyValue("hidden_ITEM_NAME", key.gethidden_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub2_STATUS") && key.getsub2_STATUS() != null) {
					msgKey.setKeyValue("sub2_STATUS", key.getsub2_STATUS());
				}
				if(msgKeyType.containsKeyColumn("FIRST_PROC_FLG") && key.getFIRST_PROC_FLG() != null) {
					msgKey.setKeyValue("FIRST_PROC_FLG", key.getFIRST_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("sub1_h_PS_UNIT_NUMERATOR") && key.getsub1_h_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("sub1_h_PS_UNIT_NUMERATOR", key.getsub1_h_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("sub1_h_PS_UNIT_DENOMINATOR") && key.getsub1_h_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("sub1_h_PS_UNIT_DENOMINATOR", key.getsub1_h_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_1") && key.getsub2_STOCK_UNIT_1() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT_1", key.getsub2_STOCK_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_2") && key.getsub2_STOCK_UNIT_2() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT_2", key.getsub2_STOCK_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_3") && key.getsub2_STOCK_UNIT_3() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT_3", key.getsub2_STOCK_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("ps_COMP_MANHOUR_NAME") && key.getps_COMP_MANHOUR_NAME() != null) {
					msgKey.setKeyValue("ps_COMP_MANHOUR_NAME", key.getps_COMP_MANHOUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_PARENT_ITEM_CD") && key.getps_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("ps_PARENT_ITEM_CD", key.getps_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ps_COMP_ITEM_CD") && key.getps_COMP_ITEM_CD() != null) {
					msgKey.setKeyValue("ps_COMP_ITEM_CD", key.getps_COMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_EDITION") && key.getps_PS_EDITION() != null) {
					msgKey.setKeyValue("ps_PS_EDITION", key.getps_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_UNIT_DENOMINATOR") && key.getps_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("ps_PS_UNIT_DENOMINATOR", key.getps_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_UNIT_NUMERATOR") && key.getps_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("ps_PS_UNIT_NUMERATOR", key.getps_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("ps_EFF_PHASE_IN_DATE") && key.getps_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("ps_EFF_PHASE_IN_DATE", key.getps_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("ps_EFF_PHASE_OUT_DATE") && key.getps_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("ps_EFF_PHASE_OUT_DATE", key.getps_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_SPOIL") && key.getps_PS_SPOIL() != null) {
					msgKey.setKeyValue("ps_PS_SPOIL", key.getps_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("ps_CONS_TYP") && key.getps_CONS_TYP() != null) {
					msgKey.setKeyValue("ps_CONS_TYP", key.getps_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_LT_FLG") && key.getps_PS_LT_FLG() != null) {
					msgKey.setKeyValue("ps_PS_LT_FLG", key.getps_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_FIXED_LT") && key.getps_PS_FIXED_LT() != null) {
					msgKey.setKeyValue("ps_PS_FIXED_LT", key.getps_PS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_PROP_LT") && key.getps_PS_PROP_LT() != null) {
					msgKey.setKeyValue("ps_PS_PROP_LT", key.getps_PS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_PROP_LOT_SIZE") && key.getps_PS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("ps_PS_PROP_LOT_SIZE", key.getps_PS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_REF_NO") && key.getps_PS_REF_NO() != null) {
					msgKey.setKeyValue("ps_PS_REF_NO", key.getps_PS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("ps_COST_UP_TYP") && key.getps_COST_UP_TYP() != null) {
					msgKey.setKeyValue("ps_COST_UP_TYP", key.getps_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("ps_MRP_EXP_TYP") && key.getps_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("ps_MRP_EXP_TYP", key.getps_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("ps_MODIFY_COUNT") && key.getps_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("ps_MODIFY_COUNT", key.getps_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ps_PARENT_ITEM_NAME") && key.getps_PARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("ps_PARENT_ITEM_NAME", key.getps_PARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_COMP_ITEM_NAME") && key.getps_COMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("ps_COMP_ITEM_NAME", key.getps_COMP_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_STOCK_UNIT") && key.getps_STOCK_UNIT() != null) {
					msgKey.setKeyValue("ps_STOCK_UNIT", key.getps_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ps_COMP_MANHOUR_TYP") && key.getps_COMP_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("ps_COMP_MANHOUR_TYP", key.getps_COMP_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ps_PARENT_MANHOUR_TYP") && key.getps_PARENT_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("ps_PARENT_MANHOUR_TYP", key.getps_PARENT_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("sub1_PARENT_ITEM_CD") && key.getsub1_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("sub1_PARENT_ITEM_CD", key.getsub1_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("sub1_COMP_ITEM_CD") && key.getsub1_COMP_ITEM_CD() != null) {
					msgKey.setKeyValue("sub1_COMP_ITEM_CD", key.getsub1_COMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_EDITION") && key.getsub1_PS_EDITION() != null) {
					msgKey.setKeyValue("sub1_PS_EDITION", key.getsub1_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_UNIT_DENOMINATOR") && key.getsub1_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("sub1_PS_UNIT_DENOMINATOR", key.getsub1_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_UNIT_NUMERATOR") && key.getsub1_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("sub1_PS_UNIT_NUMERATOR", key.getsub1_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("sub1_EFF_PHASE_IN_DATE") && key.getsub1_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("sub1_EFF_PHASE_IN_DATE", key.getsub1_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("sub1_EFF_PHASE_OUT_DATE") && key.getsub1_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("sub1_EFF_PHASE_OUT_DATE", key.getsub1_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_SPOIL") && key.getsub1_PS_SPOIL() != null) {
					msgKey.setKeyValue("sub1_PS_SPOIL", key.getsub1_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("sub1_CONS_TYP") && key.getsub1_CONS_TYP() != null) {
					msgKey.setKeyValue("sub1_CONS_TYP", key.getsub1_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_LT_FLG") && key.getsub1_PS_LT_FLG() != null) {
					msgKey.setKeyValue("sub1_PS_LT_FLG", key.getsub1_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_FIXED_LT") && key.getsub1_PS_FIXED_LT() != null) {
					msgKey.setKeyValue("sub1_PS_FIXED_LT", key.getsub1_PS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_PROP_LT") && key.getsub1_PS_PROP_LT() != null) {
					msgKey.setKeyValue("sub1_PS_PROP_LT", key.getsub1_PS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_PROP_LOT_SIZE") && key.getsub1_PS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("sub1_PS_PROP_LOT_SIZE", key.getsub1_PS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_REF_NO") && key.getsub1_PS_REF_NO() != null) {
					msgKey.setKeyValue("sub1_PS_REF_NO", key.getsub1_PS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP") && key.getsub1_COST_UP_TYP() != null) {
					msgKey.setKeyValue("sub1_COST_UP_TYP", key.getsub1_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP") && key.getsub1_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("sub1_MRP_EXP_TYP", key.getsub1_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("ACCESS_TYP") && key.getACCESS_TYP() != null) {
					msgKey.setKeyValue("ACCESS_TYP", key.getACCESS_TYP());
				}
				if(msgKeyType.containsKeyColumn("CMPLT_FLG") && key.getCMPLT_FLG() != null) {
					msgKey.setKeyValue("CMPLT_FLG", key.getCMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_TYP") && key.getITEM_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("ITEM_OUTSIDE_TYP", key.getITEM_OUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_FIXED_LT") && key.getITEM_FIXED_LT() != null) {
					msgKey.setKeyValue("ITEM_FIXED_LT", key.getITEM_FIXED_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PROP_LT") && key.getITEM_PROP_LT() != null) {
					msgKey.setKeyValue("ITEM_PROP_LT", key.getITEM_PROP_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PROP_LOT_SIZE") && key.getITEM_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("ITEM_PROP_LOT_SIZE", key.getITEM_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_ISSUE_LT") && key.getITEM_ISSUE_LT() != null) {
					msgKey.setKeyValue("ITEM_ISSUE_LT", key.getITEM_ISSUE_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SAFETY_LT") && key.getITEM_SAFETY_LT() != null) {
					msgKey.setKeyValue("ITEM_SAFETY_LT", key.getITEM_SAFETY_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD") && key.getw_TARGET_ITEM_CD() != null) {
					msgKey.setKeyValue("w_TARGET_ITEM_CD", key.getw_TARGET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_PLANT_CD") && key.getpr_PLANT_CD() != null) {
					msgKey.setKeyValue("pr_PLANT_CD", key.getpr_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_ITEM_CD") && key.getpr_ITEM_CD() != null) {
					msgKey.setKeyValue("pr_ITEM_CD", key.getpr_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_PROC_CD") && key.getpr_PROC_CD() != null) {
					msgKey.setKeyValue("pr_PROC_CD", key.getpr_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_PROC_NO") && key.getpr_PROC_NO() != null) {
					msgKey.setKeyValue("pr_PROC_NO", key.getpr_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("pr_PROC_NAME") && key.getpr_PROC_NAME() != null) {
					msgKey.setKeyValue("pr_PROC_NAME", key.getpr_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_WS_CD") && key.getpr_WS_CD() != null) {
					msgKey.setKeyValue("pr_WS_CD", key.getpr_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_COMPANY_CD") && key.getpr_COMPANY_CD() != null) {
					msgKey.setKeyValue("pr_COMPANY_CD", key.getpr_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_VEND_CD") && key.getpr_VEND_CD() != null) {
					msgKey.setKeyValue("pr_VEND_CD", key.getpr_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_FIXED_LT") && key.getpr_FIXED_LT() != null) {
					msgKey.setKeyValue("pr_FIXED_LT", key.getpr_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("pr_PROP_LT") && key.getpr_PROP_LT() != null) {
					msgKey.setKeyValue("pr_PROP_LT", key.getpr_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("pr_SAFETY_LT") && key.getpr_SAFETY_LT() != null) {
					msgKey.setKeyValue("pr_SAFETY_LT", key.getpr_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("pr_PROP_LOT_SIZE") && key.getpr_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("pr_PROP_LOT_SIZE", key.getpr_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("pr_SPOIL") && key.getpr_SPOIL() != null) {
					msgKey.setKeyValue("pr_SPOIL", key.getpr_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("pr_OUTSIDE_TYP") && key.getpr_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("pr_OUTSIDE_TYP", key.getpr_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("pr_ACPT_INSPC_TYP") && key.getpr_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("pr_ACPT_INSPC_TYP", key.getpr_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("pr_STANDARD_COST") && key.getpr_STANDARD_COST() != null) {
					msgKey.setKeyValue("pr_STANDARD_COST", key.getpr_STANDARD_COST());
				}
				if(msgKeyType.containsKeyColumn("pr_MODIFY_COUNT") && key.getpr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("pr_MODIFY_COUNT", key.getpr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("pr_UNIT_QTY") && key.getpr_UNIT_QTY() != null) {
					msgKey.setKeyValue("pr_UNIT_QTY", key.getpr_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("pr_WORK_TIME") && key.getpr_WORK_TIME() != null) {
					msgKey.setKeyValue("pr_WORK_TIME", key.getpr_WORK_TIME());
				}
				if(msgKeyType.containsKeyColumn("pr_ITEM_NAME") && key.getpr_ITEM_NAME() != null) {
					msgKey.setKeyValue("pr_ITEM_NAME", key.getpr_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_WS_NAME") && key.getpr_WS_NAME() != null) {
					msgKey.setKeyValue("pr_WS_NAME", key.getpr_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_VEND_NAME") && key.getpr_VEND_NAME() != null) {
					msgKey.setKeyValue("pr_VEND_NAME", key.getpr_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_STOCK_UNIT") && key.getpr_STOCK_UNIT() != null) {
					msgKey.setKeyValue("pr_STOCK_UNIT", key.getpr_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("hidden_ITEM_CD") && key.gethidden_ITEM_CD() != null) {
					msgKey.setKeyValue("hidden_ITEM_CD", key.gethidden_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_CD") && key.getPROC_CD() != null) {
					msgKey.setKeyValue("PROC_CD", key.getPROC_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_PLANT_CD") && key.getsub2_PLANT_CD() != null) {
					msgKey.setKeyValue("sub2_PLANT_CD", key.getsub2_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_ITEM_CD") && key.getsub2_ITEM_CD() != null) {
					msgKey.setKeyValue("sub2_ITEM_CD", key.getsub2_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_PROC_CD") && key.getsub2_PROC_CD() != null) {
					msgKey.setKeyValue("sub2_PROC_CD", key.getsub2_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_PROC_NO") && key.getsub2_PROC_NO() != null) {
					msgKey.setKeyValue("sub2_PROC_NO", key.getsub2_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("sub2_PROC_NAME") && key.getsub2_PROC_NAME() != null) {
					msgKey.setKeyValue("sub2_PROC_NAME", key.getsub2_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub2_WS_CD") && key.getsub2_WS_CD() != null) {
					msgKey.setKeyValue("sub2_WS_CD", key.getsub2_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_COMPANY_CD") && key.getsub2_COMPANY_CD() != null) {
					msgKey.setKeyValue("sub2_COMPANY_CD", key.getsub2_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_VEND_CD") && key.getsub2_VEND_CD() != null) {
					msgKey.setKeyValue("sub2_VEND_CD", key.getsub2_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_FIXED_LT") && key.getsub2_FIXED_LT() != null) {
					msgKey.setKeyValue("sub2_FIXED_LT", key.getsub2_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("sub2_PROP_LT") && key.getsub2_PROP_LT() != null) {
					msgKey.setKeyValue("sub2_PROP_LT", key.getsub2_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("sub2_SAFETY_LT") && key.getsub2_SAFETY_LT() != null) {
					msgKey.setKeyValue("sub2_SAFETY_LT", key.getsub2_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("sub2_PROP_LOT_SIZE") && key.getsub2_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("sub2_PROP_LOT_SIZE", key.getsub2_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("sub2_SPOIL") && key.getsub2_SPOIL() != null) {
					msgKey.setKeyValue("sub2_SPOIL", key.getsub2_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP") && key.getsub2_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("sub2_OUTSIDE_TYP", key.getsub2_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP") && key.getsub2_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("sub2_ACPT_INSPC_TYP", key.getsub2_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("sub2_STANDARD_COST") && key.getsub2_STANDARD_COST() != null) {
					msgKey.setKeyValue("sub2_STANDARD_COST", key.getsub2_STANDARD_COST());
				}
				if(msgKeyType.containsKeyColumn("sub2_UNIT_QTY") && key.getsub2_UNIT_QTY() != null) {
					msgKey.setKeyValue("sub2_UNIT_QTY", key.getsub2_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("sub2_WORK_TIME") && key.getsub2_WORK_TIME() != null) {
					msgKey.setKeyValue("sub2_WORK_TIME", key.getsub2_WORK_TIME());
				}
				if(msgKeyType.containsKeyColumn("sub2_MODIFY_COUNT") && key.getsub2_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("sub2_MODIFY_COUNT", key.getsub2_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("sub2_ITEM_NAME") && key.getsub2_ITEM_NAME() != null) {
					msgKey.setKeyValue("sub2_ITEM_NAME", key.getsub2_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub2_WS_NAME") && key.getsub2_WS_NAME() != null) {
					msgKey.setKeyValue("sub2_WS_NAME", key.getsub2_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub2_VEND_NAME") && key.getsub2_VEND_NAME() != null) {
					msgKey.setKeyValue("sub2_VEND_NAME", key.getsub2_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT") && key.getsub2_STOCK_UNIT() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT", key.getsub2_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("sub2_MANHOUR_TYP") && key.getsub2_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("sub2_MANHOUR_TYP", key.getsub2_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NO") && key.getPROC_NO() != null) {
					msgKey.setKeyValue("PROC_NO", key.getPROC_NO());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("BY_PRODUCT_CD") && key.getBY_PRODUCT_CD() != null) {
					msgKey.setKeyValue("BY_PRODUCT_CD", key.getBY_PRODUCT_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PARAM_RESULT_DATA") && key.getPARAM_RESULT_DATA() != null) {
					msgKey.setKeyValue("PARAM_RESULT_DATA", key.getPARAM_RESULT_DATA());
				}
				if(msgKeyType.containsKeyColumn("PARAM_INPUT_DATA") && key.getPARAM_INPUT_DATA() != null) {
					msgKey.setKeyValue("PARAM_INPUT_DATA", key.getPARAM_INPUT_DATA());
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
					AA0170010Struct key = new AA0170010Struct();
					if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP_name")) {
						key.setsub2_OUTSIDE_TYP_name(msgKey.getKeyValue("sub2_OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP_val")) {
						key.setsub2_OUTSIDE_TYP_val(msgKey.getKeyValue("sub2_OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP_name")) {
						key.setsub2_ACPT_INSPC_TYP_name(msgKey.getKeyValue("sub2_ACPT_INSPC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP_val")) {
						key.setsub2_ACPT_INSPC_TYP_val(msgKey.getKeyValue("sub2_ACPT_INSPC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("main_TARGET_ITEM_CD")) {
						key.setmain_TARGET_ITEM_CD(msgKey.getKeyValue("main_TARGET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP")) {
						key.setmain_DEVELOP_TYP(msgKey.getKeyValue("main_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP_name")) {
						key.setmain_DEVELOP_TYP_name(msgKey.getKeyValue("main_DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP_val")) {
						key.setmain_DEVELOP_TYP_val(msgKey.getKeyValue("main_DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("main_TARGET_DATE")) {
						key.setmain_TARGET_DATE(msgKey.getKeyValue("main_TARGET_DATE"));
					}
					if(msgKeyType.containsKeyColumn("main_LEVEL")) {
						key.setmain_LEVEL(msgKey.getKeyValue("main_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("ps_NO")) {
						key.setps_NO(msgKey.getKeyValue("ps_NO"));
					}
					if(msgKeyType.containsKeyColumn("ps_CONS_NAME")) {
						key.setps_CONS_NAME(msgKey.getKeyValue("ps_CONS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_LT_NAME")) {
						key.setps_PS_LT_NAME(msgKey.getKeyValue("ps_PS_LT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_COST_UP_NAME")) {
						key.setps_COST_UP_NAME(msgKey.getKeyValue("ps_COST_UP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_MRP_EXP_NAME")) {
						key.setps_MRP_EXP_NAME(msgKey.getKeyValue("ps_MRP_EXP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_OUTSIDE_NAME")) {
						key.setpr_OUTSIDE_NAME(msgKey.getKeyValue("pr_OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_ACPT_INSPC_NAME")) {
						key.setpr_ACPT_INSPC_NAME(msgKey.getKeyValue("pr_ACPT_INSPC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PARENT_ITEM_NAME")) {
						key.setsub1_PARENT_ITEM_NAME(msgKey.getKeyValue("sub1_PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub1_DEVELOP_TYP")) {
						key.setsub1_DEVELOP_TYP(msgKey.getKeyValue("sub1_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("sub1_COMP_ITEM_NAME")) {
						key.setsub1_COMP_ITEM_NAME(msgKey.getKeyValue("sub1_COMP_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub1_MODIFY_COUNT")) {
						key.setsub1_MODIFY_COUNT(msgKey.getKeyValue("sub1_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("sub1_STOCK_UNIT")) {
						key.setsub1_STOCK_UNIT(msgKey.getKeyValue("sub1_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("sub1_CONS_TYP_name")) {
						key.setsub1_CONS_TYP_name(msgKey.getKeyValue("sub1_CONS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("sub1_CONS_TYP_val")) {
						key.setsub1_CONS_TYP_val(msgKey.getKeyValue("sub1_CONS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_LT_CHECK")) {
						key.setsub1_PS_LT_CHECK(msgKey.getKeyValue("sub1_PS_LT_CHECK"));
					}
					if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP_name")) {
						key.setsub1_COST_UP_TYP_name(msgKey.getKeyValue("sub1_COST_UP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP_val")) {
						key.setsub1_COST_UP_TYP_val(msgKey.getKeyValue("sub1_COST_UP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP_name")) {
						key.setsub1_MRP_EXP_TYP_name(msgKey.getKeyValue("sub1_MRP_EXP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP_val")) {
						key.setsub1_MRP_EXP_TYP_val(msgKey.getKeyValue("sub1_MRP_EXP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("sub1_TARGET_ITEM_CD")) {
						key.setsub1_TARGET_ITEM_CD(msgKey.getKeyValue("sub1_TARGET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub1_LEVEL")) {
						key.setsub1_LEVEL(msgKey.getKeyValue("sub1_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("sub1_TARGET_DATE")) {
						key.setsub1_TARGET_DATE(msgKey.getKeyValue("sub1_TARGET_DATE"));
					}
					if(msgKeyType.containsKeyColumn("pr_PS_EDITION")) {
						key.setpr_PS_EDITION(msgKey.getKeyValue("pr_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("hidden_ITEM_NAME")) {
						key.sethidden_ITEM_NAME(msgKey.getKeyValue("hidden_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STATUS")) {
						key.setsub2_STATUS(msgKey.getKeyValue("sub2_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_PROC_FLG")) {
						key.setFIRST_PROC_FLG(msgKey.getKeyValue("FIRST_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("sub1_h_PS_UNIT_NUMERATOR")) {
						key.setsub1_h_PS_UNIT_NUMERATOR(msgKey.getKeyValue("sub1_h_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("sub1_h_PS_UNIT_DENOMINATOR")) {
						key.setsub1_h_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("sub1_h_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_1")) {
						key.setsub2_STOCK_UNIT_1(msgKey.getKeyValue("sub2_STOCK_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_2")) {
						key.setsub2_STOCK_UNIT_2(msgKey.getKeyValue("sub2_STOCK_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_3")) {
						key.setsub2_STOCK_UNIT_3(msgKey.getKeyValue("sub2_STOCK_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("ps_COMP_MANHOUR_NAME")) {
						key.setps_COMP_MANHOUR_NAME(msgKey.getKeyValue("ps_COMP_MANHOUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_PARENT_ITEM_CD")) {
						key.setps_PARENT_ITEM_CD(msgKey.getKeyValue("ps_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ps_COMP_ITEM_CD")) {
						key.setps_COMP_ITEM_CD(msgKey.getKeyValue("ps_COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_EDITION")) {
						key.setps_PS_EDITION(msgKey.getKeyValue("ps_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_UNIT_DENOMINATOR")) {
						key.setps_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("ps_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_UNIT_NUMERATOR")) {
						key.setps_PS_UNIT_NUMERATOR(msgKey.getKeyValue("ps_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("ps_EFF_PHASE_IN_DATE")) {
						key.setps_EFF_PHASE_IN_DATE(msgKey.getKeyValue("ps_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ps_EFF_PHASE_OUT_DATE")) {
						key.setps_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("ps_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_SPOIL")) {
						key.setps_PS_SPOIL(msgKey.getKeyValue("ps_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("ps_CONS_TYP")) {
						key.setps_CONS_TYP(msgKey.getKeyValue("ps_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_LT_FLG")) {
						key.setps_PS_LT_FLG(msgKey.getKeyValue("ps_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_FIXED_LT")) {
						key.setps_PS_FIXED_LT(msgKey.getKeyValue("ps_PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_PROP_LT")) {
						key.setps_PS_PROP_LT(msgKey.getKeyValue("ps_PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_PROP_LOT_SIZE")) {
						key.setps_PS_PROP_LOT_SIZE(msgKey.getKeyValue("ps_PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_REF_NO")) {
						key.setps_PS_REF_NO(msgKey.getKeyValue("ps_PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("ps_COST_UP_TYP")) {
						key.setps_COST_UP_TYP(msgKey.getKeyValue("ps_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ps_MRP_EXP_TYP")) {
						key.setps_MRP_EXP_TYP(msgKey.getKeyValue("ps_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ps_MODIFY_COUNT")) {
						key.setps_MODIFY_COUNT(msgKey.getKeyValue("ps_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ps_PARENT_ITEM_NAME")) {
						key.setps_PARENT_ITEM_NAME(msgKey.getKeyValue("ps_PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_COMP_ITEM_NAME")) {
						key.setps_COMP_ITEM_NAME(msgKey.getKeyValue("ps_COMP_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_STOCK_UNIT")) {
						key.setps_STOCK_UNIT(msgKey.getKeyValue("ps_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ps_COMP_MANHOUR_TYP")) {
						key.setps_COMP_MANHOUR_TYP(msgKey.getKeyValue("ps_COMP_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ps_PARENT_MANHOUR_TYP")) {
						key.setps_PARENT_MANHOUR_TYP(msgKey.getKeyValue("ps_PARENT_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PARENT_ITEM_CD")) {
						key.setsub1_PARENT_ITEM_CD(msgKey.getKeyValue("sub1_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub1_COMP_ITEM_CD")) {
						key.setsub1_COMP_ITEM_CD(msgKey.getKeyValue("sub1_COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_EDITION")) {
						key.setsub1_PS_EDITION(msgKey.getKeyValue("sub1_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_UNIT_DENOMINATOR")) {
						key.setsub1_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("sub1_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_UNIT_NUMERATOR")) {
						key.setsub1_PS_UNIT_NUMERATOR(msgKey.getKeyValue("sub1_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("sub1_EFF_PHASE_IN_DATE")) {
						key.setsub1_EFF_PHASE_IN_DATE(msgKey.getKeyValue("sub1_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("sub1_EFF_PHASE_OUT_DATE")) {
						key.setsub1_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("sub1_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_SPOIL")) {
						key.setsub1_PS_SPOIL(msgKey.getKeyValue("sub1_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("sub1_CONS_TYP")) {
						key.setsub1_CONS_TYP(msgKey.getKeyValue("sub1_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_LT_FLG")) {
						key.setsub1_PS_LT_FLG(msgKey.getKeyValue("sub1_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_FIXED_LT")) {
						key.setsub1_PS_FIXED_LT(msgKey.getKeyValue("sub1_PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_PROP_LT")) {
						key.setsub1_PS_PROP_LT(msgKey.getKeyValue("sub1_PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_PROP_LOT_SIZE")) {
						key.setsub1_PS_PROP_LOT_SIZE(msgKey.getKeyValue("sub1_PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_REF_NO")) {
						key.setsub1_PS_REF_NO(msgKey.getKeyValue("sub1_PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP")) {
						key.setsub1_COST_UP_TYP(msgKey.getKeyValue("sub1_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP")) {
						key.setsub1_MRP_EXP_TYP(msgKey.getKeyValue("sub1_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("ACCESS_TYP")) {
						key.setACCESS_TYP(msgKey.getKeyValue("ACCESS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CMPLT_FLG")) {
						key.setCMPLT_FLG(msgKey.getKeyValue("CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_TYP")) {
						key.setITEM_OUTSIDE_TYP(new Integer(msgKey.getKeyValue("ITEM_OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(new Integer(msgKey.getKeyValue("OPR_RSLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_FIXED_LT")) {
						key.setITEM_FIXED_LT(new Long(msgKey.getKeyValue("ITEM_FIXED_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PROP_LT")) {
						key.setITEM_PROP_LT(new Long(msgKey.getKeyValue("ITEM_PROP_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PROP_LOT_SIZE")) {
						key.setITEM_PROP_LOT_SIZE(msgKey.getKeyValue("ITEM_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_ISSUE_LT")) {
						key.setITEM_ISSUE_LT(new Long(msgKey.getKeyValue("ITEM_ISSUE_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SAFETY_LT")) {
						key.setITEM_SAFETY_LT(new Long(msgKey.getKeyValue("ITEM_SAFETY_LT")));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD")) {
						key.setw_TARGET_ITEM_CD(msgKey.getKeyValue("w_TARGET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_PLANT_CD")) {
						key.setpr_PLANT_CD(msgKey.getKeyValue("pr_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_ITEM_CD")) {
						key.setpr_ITEM_CD(msgKey.getKeyValue("pr_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_PROC_CD")) {
						key.setpr_PROC_CD(msgKey.getKeyValue("pr_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_PROC_NO")) {
						key.setpr_PROC_NO(msgKey.getKeyValue("pr_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("pr_PROC_NAME")) {
						key.setpr_PROC_NAME(msgKey.getKeyValue("pr_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_WS_CD")) {
						key.setpr_WS_CD(msgKey.getKeyValue("pr_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_COMPANY_CD")) {
						key.setpr_COMPANY_CD(msgKey.getKeyValue("pr_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_VEND_CD")) {
						key.setpr_VEND_CD(msgKey.getKeyValue("pr_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_FIXED_LT")) {
						key.setpr_FIXED_LT(msgKey.getKeyValue("pr_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("pr_PROP_LT")) {
						key.setpr_PROP_LT(msgKey.getKeyValue("pr_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("pr_SAFETY_LT")) {
						key.setpr_SAFETY_LT(msgKey.getKeyValue("pr_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("pr_PROP_LOT_SIZE")) {
						key.setpr_PROP_LOT_SIZE(msgKey.getKeyValue("pr_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("pr_SPOIL")) {
						key.setpr_SPOIL(msgKey.getKeyValue("pr_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("pr_OUTSIDE_TYP")) {
						key.setpr_OUTSIDE_TYP(msgKey.getKeyValue("pr_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("pr_ACPT_INSPC_TYP")) {
						key.setpr_ACPT_INSPC_TYP(msgKey.getKeyValue("pr_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("pr_STANDARD_COST")) {
						key.setpr_STANDARD_COST(msgKey.getKeyValue("pr_STANDARD_COST"));
					}
					if(msgKeyType.containsKeyColumn("pr_MODIFY_COUNT")) {
						key.setpr_MODIFY_COUNT(msgKey.getKeyValue("pr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("pr_UNIT_QTY")) {
						key.setpr_UNIT_QTY(msgKey.getKeyValue("pr_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("pr_WORK_TIME")) {
						key.setpr_WORK_TIME(msgKey.getKeyValue("pr_WORK_TIME"));
					}
					if(msgKeyType.containsKeyColumn("pr_ITEM_NAME")) {
						key.setpr_ITEM_NAME(msgKey.getKeyValue("pr_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_WS_NAME")) {
						key.setpr_WS_NAME(msgKey.getKeyValue("pr_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_VEND_NAME")) {
						key.setpr_VEND_NAME(msgKey.getKeyValue("pr_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_STOCK_UNIT")) {
						key.setpr_STOCK_UNIT(msgKey.getKeyValue("pr_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("hidden_ITEM_CD")) {
						key.sethidden_ITEM_CD(msgKey.getKeyValue("hidden_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_CD")) {
						key.setPROC_CD(msgKey.getKeyValue("PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PLANT_CD")) {
						key.setsub2_PLANT_CD(msgKey.getKeyValue("sub2_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_ITEM_CD")) {
						key.setsub2_ITEM_CD(msgKey.getKeyValue("sub2_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PROC_CD")) {
						key.setsub2_PROC_CD(msgKey.getKeyValue("sub2_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PROC_NO")) {
						key.setsub2_PROC_NO(msgKey.getKeyValue("sub2_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PROC_NAME")) {
						key.setsub2_PROC_NAME(msgKey.getKeyValue("sub2_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_WS_CD")) {
						key.setsub2_WS_CD(msgKey.getKeyValue("sub2_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_COMPANY_CD")) {
						key.setsub2_COMPANY_CD(msgKey.getKeyValue("sub2_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_VEND_CD")) {
						key.setsub2_VEND_CD(msgKey.getKeyValue("sub2_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_FIXED_LT")) {
						key.setsub2_FIXED_LT(msgKey.getKeyValue("sub2_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PROP_LT")) {
						key.setsub2_PROP_LT(msgKey.getKeyValue("sub2_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("sub2_SAFETY_LT")) {
						key.setsub2_SAFETY_LT(msgKey.getKeyValue("sub2_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PROP_LOT_SIZE")) {
						key.setsub2_PROP_LOT_SIZE(msgKey.getKeyValue("sub2_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("sub2_SPOIL")) {
						key.setsub2_SPOIL(msgKey.getKeyValue("sub2_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP")) {
						key.setsub2_OUTSIDE_TYP(msgKey.getKeyValue("sub2_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP")) {
						key.setsub2_ACPT_INSPC_TYP(msgKey.getKeyValue("sub2_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STANDARD_COST")) {
						key.setsub2_STANDARD_COST(msgKey.getKeyValue("sub2_STANDARD_COST"));
					}
					if(msgKeyType.containsKeyColumn("sub2_UNIT_QTY")) {
						key.setsub2_UNIT_QTY(msgKey.getKeyValue("sub2_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("sub2_WORK_TIME")) {
						key.setsub2_WORK_TIME(msgKey.getKeyValue("sub2_WORK_TIME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_MODIFY_COUNT")) {
						key.setsub2_MODIFY_COUNT(msgKey.getKeyValue("sub2_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("sub2_ITEM_NAME")) {
						key.setsub2_ITEM_NAME(msgKey.getKeyValue("sub2_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_WS_NAME")) {
						key.setsub2_WS_NAME(msgKey.getKeyValue("sub2_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_VEND_NAME")) {
						key.setsub2_VEND_NAME(msgKey.getKeyValue("sub2_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT")) {
						key.setsub2_STOCK_UNIT(msgKey.getKeyValue("sub2_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("sub2_MANHOUR_TYP")) {
						key.setsub2_MANHOUR_TYP(msgKey.getKeyValue("sub2_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NO")) {
						key.setPROC_NO(msgKey.getKeyValue("PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("BY_PRODUCT_CD")) {
						key.setBY_PRODUCT_CD(msgKey.getKeyValue("BY_PRODUCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PARAM_RESULT_DATA")) {
						key.setPARAM_RESULT_DATA(msgKey.getKeyValue("PARAM_RESULT_DATA"));
					}
					if(msgKeyType.containsKeyColumn("PARAM_INPUT_DATA")) {
						key.setPARAM_INPUT_DATA(msgKey.getKeyValue("PARAM_INPUT_DATA"));
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
