/*
 * $Source: D:/EXPJCVS/EXPJCORE/ejstudioV2/EXPJStudio/tools/framework/expjhtml5/srcgen/rp_pfnd_tbl/ControlTempl.vm,v $
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
 * EXPJ    (2017/12/26),�c���[������������팸�AgetFlashTreeXML�@�\�C���i�c���[���g�p�\�[�X�ւ̉e���Ȃ��j
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

package com.nec.jp.orteus.metamorBase.AA0010;

import com.nec.jp.orteus.metamorBase.AA0010.*;
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
//-----------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common08.ClassMaster.ClassMaster;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AA0010010Control �N���X
 * �i�ڃ����e�i���X
 *
 * �C������
 * 2015/07/30 EJaSCM�^EJa�@�\�����Ή�
 */
//}}user_implement_code_header

public class AA0010010Control
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

	public AA0010010Struct getStruct() { return this.struct; }	// Struct�̒l�i���f�B�G�[�^�j��Ԃ��܂��B


//------------------------------------------------------------------------------

	/** �o�ɋ敪 */
	private ComboStruct _ISSUE_TYP = new ComboStruct();

	/** �o�ɋ敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setISSUE_TYP(ComboStruct combo){ _ISSUE_TYP = combo; }

	/** �o�ɋ敪�擾
	 * @return �o�ɋ敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getISSUE_TYP(){ return _ISSUE_TYP; }


	/** ���O��敪 */
	private ComboStruct _OUTSIDE_TYP = new ComboStruct();

	/** ���O��敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setOUTSIDE_TYP(ComboStruct combo){ _OUTSIDE_TYP = combo; }

	/** ���O��敪�擾
	 * @return ���O��敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getOUTSIDE_TYP(){ return _OUTSIDE_TYP; }


	/** �׎p�Ǘ��t���O */
	private ComboStruct _STOCK_UNIT_FLG = new ComboStruct();

	/** �׎p�Ǘ��t���O�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setSTOCK_UNIT_FLG(ComboStruct combo){ _STOCK_UNIT_FLG = combo; }

	/** �׎p�Ǘ��t���O�擾
	 * @return �׎p�Ǘ��t���O�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getSTOCK_UNIT_FLG(){ return _STOCK_UNIT_FLG; }


	/** �݌ɐ��P�ʋ敪 */
	private ComboStruct _UNIT_QTY_TYP = new ComboStruct();

	/** �݌ɐ��P�ʋ敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setUNIT_QTY_TYP(ComboStruct combo){ _UNIT_QTY_TYP = combo; }

	/** �݌ɐ��P�ʋ敪�擾
	 * @return �݌ɐ��P�ʋ敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getUNIT_QTY_TYP(){ return _UNIT_QTY_TYP; }


	/** �i�ڎ�z�敪 */
	private ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/** �i�ڎ�z�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setMRP_ODR_TYP(ComboStruct combo){ _MRP_ODR_TYP = combo; }

	/** �i�ڎ�z�敪�擾
	 * @return �i�ڎ�z�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getMRP_ODR_TYP(){ return _MRP_ODR_TYP; }


	/** ���b�g�܂Ƃߋ敪 */
	private ComboStruct _LOT_SIZING_TYP = new ComboStruct();

	/** ���b�g�܂Ƃߋ敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setLOT_SIZING_TYP(ComboStruct combo){ _LOT_SIZING_TYP = combo; }

	/** ���b�g�܂Ƃߋ敪�擾
	 * @return ���b�g�܂Ƃߋ敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getLOT_SIZING_TYP(){ return _LOT_SIZING_TYP; }

// 2008/07/14 SYSCOM ���� ADD START
	/** �H���Ǘ��i�ڋ敪 */
	private ComboStruct _MANHOUR_TYP = new ComboStruct();

	/** �H���Ǘ��i�ڋ敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setMANHOUR_TYP(ComboStruct combo){ _MANHOUR_TYP = combo; }

	/** �H���Ǘ��i�ڋ敪�擾
	 * @return �H���Ǘ��i�ڋ敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getMANHOUR_TYP(){ return _MANHOUR_TYP; }
// 2008/07/14 SYSCOM ���� ADD END

	/** MPS�i�ڃt���O */
	private ComboStruct _MPS_FLG = new ComboStruct();

	/** MPS�i�ڃt���O�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setMPS_FLG(ComboStruct combo){ _MPS_FLG = combo; }

	/** MPS�i�ڃt���O�擾
	 * @return MPS�i�ڃt���O�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getMPS_FLG(){ return _MPS_FLG; }


	/** ��������敪 */
	private ComboStruct _ACPT_INSPC_TYP = new ComboStruct();

	/** ��������敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setACPT_INSPC_TYP(ComboStruct combo){ _ACPT_INSPC_TYP = combo; }

	/** ��������敪�擾
	 * @return ��������敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getACPT_INSPC_TYP(){ return _ACPT_INSPC_TYP; }


	/** ���i�敪 */
	private ComboStruct _PRODUCT_TYP = new ComboStruct();

	/** ���i�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setPRODUCT_TYP(ComboStruct combo){ _PRODUCT_TYP = combo; }

	/** ���i�敪�擾
	 * @return ���i�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getPRODUCT_TYP(){ return _PRODUCT_TYP; }


	/** �I���敪 */
	private ComboStruct _ABC_TYP = new ComboStruct();

	/** �I���敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setABC_TYP(ComboStruct combo){ _ABC_TYP = combo; }

	/** �I���敪�擾
	 * @return �I���敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getABC_TYP(){ return _ABC_TYP; }


	/** ��Ǝ��ы敪 */
	private ComboStruct _OPR_RSLT_TYP = new ComboStruct();

	/** ��Ǝ��ы敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setOPR_RSLT_TYP(ComboStruct combo){ _OPR_RSLT_TYP = combo; }

	/** ��Ǝ��ы敪�擾
	 * @return ��Ǝ��ы敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getOPR_RSLT_TYP(){ return _OPR_RSLT_TYP; }


	/** �󋋕i�敪 */
	private ComboStruct _SPL_ITEM_TYP = new ComboStruct();

	/** �󋋕i�敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setSPL_ITEM_TYP(ComboStruct combo){ _SPL_ITEM_TYP = combo; }

	/** �󋋕i�敪�擾
	 * @return �󋋕i�敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getSPL_ITEM_TYP(){ return _SPL_ITEM_TYP; }

	/** �v�ʒP�� */
	private ComboStruct _STOCK_UNIT = new ComboStruct();

	/** �v�ʒP�ʐݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setSTOCK_UNIT(ComboStruct combo){ _STOCK_UNIT = combo; }

	/** �v�ʒP�ʎ擾
	 * @return �v�ʒP�ʂ̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getSTOCK_UNIT(){ return _STOCK_UNIT; }


	/** �ۊǋ敪 */
	private ComboStruct _DEPO_TYP = new ComboStruct();

	/** �ۊǋ敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setDEPO_TYP(ComboStruct combo){ _DEPO_TYP = combo; }

	/** �ۊǋ敪�擾
	 * @return �ۊǋ敪�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getDEPO_TYP(){ return _DEPO_TYP; }

	/** ���b�g�Ǘ��t���O */
	private ComboStruct _LOT_CTRL_FLG = new ComboStruct();

	/** ���b�g�Ǘ��t���O�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setLOT_CTRL_FLG(ComboStruct combo){ _LOT_CTRL_FLG = combo; }

	/** ���b�g�Ǘ��t���O�擾
	 * @return ���b�g�Ǘ��t���O���̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getLOT_CTRL_FLG(){ return _LOT_CTRL_FLG; }
	
	/** ���b�g�̔ԋ敪 */
	private ComboStruct _LOT_NUMBERING_TYP = new ComboStruct();

	/** ���b�g�̔ԋ敪�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setLOT_NUMBERING_TYP(ComboStruct combo){ _LOT_NUMBERING_TYP = combo; }

	/** ���b�g�̔ԋ敪�擾
	 * @return ���b�g�Ǘ��t���O���̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getLOT_NUMBERING_TYP(){ return _LOT_NUMBERING_TYP; }	

//20150730 ADD START BY SYSCOM
	/**�v���W�F�N�g�R�[�h*/
	private ComboStruct _unitPjCdStruct = new ComboStruct();
	/** �v���W�F�N�g�R�[�h�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setPJ_CD(ComboStruct combo){_unitPjCdStruct = combo;}
	/** �v���W�F�N�g�R�[�h�擾
	 * @return �v���W�F�N�g�R�[�h�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getPJ_CD(){ return _unitPjCdStruct; }
	
	/**�Z�O�����g1*/
	private ComboStruct _unitSegContent1Struct = new ComboStruct();
	/** �Z�O�����g1�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setSEG_CONTENTS1(ComboStruct combo){_unitSegContent1Struct = combo;}
	/** �Z�O�����g1�擾
	 * @return �Z�O�����g1�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getSEG_CONTENTS1(){ return _unitSegContent1Struct; }
		
	/**�Z�O�����g2*/
    private ComboStruct _unitSegContent2Struct = new ComboStruct();
	/** �Z�O�����g2�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setSEG_CONTENTS2(ComboStruct combo){_unitSegContent2Struct = combo;}
	/** �Z�O�����g2�擾
	 * @return �Z�O�����g2�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getSEG_CONTENTS2(){ return _unitSegContent2Struct; }
		
	/**�Z�O�����g3*/
    private ComboStruct _unitSegContent3Struct = new ComboStruct();
	/** �Z�O�����g3�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setSEG_CONTENTS3(ComboStruct combo){_unitSegContent3Struct = combo;}
	/** �Z�O�����g3�擾
	 * @return �Z�O�����g3�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getSEG_CONTENTS3(){ return _unitSegContent3Struct; }
		
	/**�Z�O�����g4*/
    private ComboStruct _unitSegContent4Struct = new ComboStruct();
	/** �Z�O�����g4�ݒ�
	 * @param �R���{�{�b�N�X�f�[�^
	*/
	public void setSEG_CONTENTS4(ComboStruct combo){_unitSegContent4Struct = combo;}
	/** �Z�O�����g4�擾
	 * @return �Z�O�����g4�̃R���{�{�b�N�X�f�[�^
	*/
	public ComboStruct getSEG_CONTENTS4(){ return _unitSegContent4Struct; }
		
//20150730 ADD END BY SYSCOM
		
	/**  ���ރ}�X�^�� */
	
	private String _ITEM_CLASS_01_TYP = new String();
	
	private String _ITEM_CLASS_02_TYP = new String();
	
	private String _ITEM_CLASS_03_TYP = new String();
	
	private String _ITEM_CLASS_04_TYP = new String();
	
	private String _ITEM_CLASS_05_TYP = new String();
	
	private String _ITEM_CLASS_06_TYP = new String();
	
	private String _ITEM_CLASS_07_TYP = new String();
	
	private String _ITEM_CLASS_08_TYP = new String();
	
	private String _ITEM_CLASS_09_TYP = new String();
	
	private String _ITEM_CLASS_10_TYP = new String();
	
	private String _ITEM_CLASS_11_TYP = new String();
	
	private String _ITEM_CLASS_12_TYP = new String();

//20150730 ADD START BY SYSCOM
	//���S����R�[�h�I��p��PEEKER�ɗp����ϐ�
	private String sysCOMPANY_CD;
	public String getsysCOMPANY_CD(){ return sysCOMPANY_CD; }
//20150730 ADD END BY SYSCOM

//---------- �i�ڎ�z�敪�\���`�F�b�N���� -------------------------------------

	/**
	 * �i�ڎ�z�敪�ʍ\���`�F�b�N
	 * @param repository ���i�\�����|�W�g��
	 * @param parent �e�i�ڔԍ�
	 * @param comp �q�i�ڔԍ�
	 * @return true�FOK  false:NG
	*/
	private boolean checkMRP_ODR_TYP(ProductStructureRepository repository,
										AA0010010Struct parent, AA0010010Struct comp)
		throws SQLException, FoundationException
	{
		Integer parent_typ = parent.getMRP_ODR_TYP();
		Integer comp_typ = comp.getMRP_ODR_TYP();

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
				itemList = repository.reverseDeployment(parent.getITEM_CD());
				AA0010010Struct workStruct = new AA0010010Struct();
				for(int i = 0; i < itemList.size(); i++)
				{
					// �擾�����e�i�ڂ̎�z�敪�擾
					workStruct.setITEM_CD((String)itemList.get(i));
					List parentList = entity.mselectMRP_ODR_TYP.read(conn, workStruct);
					Integer typ = ((AA0010010Struct)parentList.get(0)).getMRP_ODR_TYP();
					
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
				itemList = repository.orderDeployment(comp.getITEM_CD());
				AA0010010Struct workStruct = new AA0010010Struct();
				for(int i = 0; i < itemList.size(); i++)
				{
					// �擾�����q�i�ڂ̎�z�敪�擾
					workStruct.setITEM_CD((String)itemList.get(i));
					List compList = entity.mselectMRP_ODR_TYP.read(conn, workStruct);
					Integer typ = ((AA0010010Struct)compList.get(0)).getMRP_ODR_TYP();
					
					if(typ.intValue() == 1 || typ.intValue() == 2 ) return false;
				}
			}
		}

		return true;
	}


	// �q�i�ڂ̕i�ڎ�z�敪�̑Ó����m�F
	private boolean checkLowerType(
						ProductStructureRepository rep,
						AA0010010Struct myself
						) throws FoundationException, SQLException
	{
		// �\�����擾
		List list = rep.orderDeployment(myself.getITEM_CD());

		// �Ó����m�F
		boolean result = true;
		AA0010010Struct work = new AA0010010Struct();
		for (int i = 0; i < list.size(); i++)
		{
			// �q�i�ڎ擾
			work.setITEM_CD((String)list.get(i));
			List comList = entity.mselectMRP_ODR_TYP.read(conn, work);
			AA0010010Struct comp = (AA0010010Struct)comList.get(0);

			// ����
			if (checkMRP_ODR_TYP(rep, myself, comp) == false) {
				result = false;
				break;
			}
		}
		return result;
	}

	// �e�i�ڂ̕i�ڎ�z�敪�̑Ó����m�F
	private boolean checkUpperType(
						ProductStructureRepository rep,
						AA0010010Struct myself
						) throws FoundationException, SQLException
	{
		// �\�����擾
		List list = rep.reverseDeployment(myself.getITEM_CD());

		// �Ó����m�F
		boolean result = true;
		AA0010010Struct work = new AA0010010Struct();
		for (int i = 0; i < list.size(); i++)
		{
			// �e�i�ڎ擾
			work.setITEM_CD((String)list.get(i));
			List parentList = entity.mselectMRP_ODR_TYP.read(conn, work);
			AA0010010Struct parent = (AA0010010Struct)parentList.get(0);

			// ����
			if (checkMRP_ODR_TYP(rep, parent, myself) == false) {
				result = false;
				break;
			}
		}
		return result;
	}

	// ��ƌn��Ƃ̃��[�h�^�C���ݒ�̑Ó����m�F  OK:true/NG:false
	private boolean isValidLT(AA0010010Struct s) throws SQLException, FoundationException
	{
		List key = new ArrayList();

		// �i�ڔ��LT���ݒ肠��Ȃ� ��������OK
		Integer propLT = IntegerConverter.Convert(struct.getPROP_LT());
		if (propLT.intValue() != 0)  return true;

		// �i�ڂ̌Œ�LT
		Integer itemFixLT = IntegerConverter.Convert(struct.getFIXED_LT());

		// �H�ꂲ�Ƃ�LT�Ǎ�
		boolean result = true;
		List lts = entity.mLTbyPLANT.read(conn,struct);
		for(int n = 0; n < lts.size(); n++){
			AA0010010Struct w = (AA0010010Struct)lts.get(n);

			// �n����LT���ݒ肠��Ȃ� ��������OK
			if(w.getSUM_PROP_LT().intValue() != 0) continue;

			// �n��̌Œ�LT���i�ڌŒ�LT���傫����Όx���Ώ�
			Integer procFixLT = w.getSUM_FIXED_LT();
			if(itemFixLT.intValue() < procFixLT.intValue()){
				if(result == true){ // �ŏ��̌x���̂Ƃ������o�͂��郍�O
					// �G���[���b�Z�[�W�쐬
					key.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_ITEM.FIXED_LT:" + struct.getFIXED_LT());
					setWarnMessage("AA60001", key);
				}
				// �G���[���b�Z�[�W�쐬
				key.add("M_PROC_GRP.PLANT_CD:" + w.getPLANT_CD());
				key.add("M_PROC_GRP.SUM_FIXED_LT:" + procFixLT.toString());
				setWarnMessage("AA60001", key);

			}
		}
		return result;
	}
	
	// �i�ڎ�z�敪�\�������̎擾
	private String getMRP_ODR_TYP_DISPLAY_NAME(String value) throws ExpjException{
		struct.setuMRP_ODR_TYP_VALUE(value);
		try {
			list = entity.mselectMRP_ODR_TYP_DISPLAY_NAME.read(conn, struct);
		} catch(SQLException e){
			// �G���[���b�Z�[�W�쐬
			String keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setSqlExceptionMsg(e, keyMessage);
		}catch(Exception e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		if(getListsize()>0){
			return ((AA0010010Struct)list.get(0)).getuMRP_ODR_TYP_DISPLAY_NAME();
		}
		return "undefined";
	}
//---------------�i�ڏ��F�p-------------------------------------------
    // �i�ڏ��F
    //String aprItem;	
    String _APPR_ITEM;			        
    // ��ʑJ�ڃp�����[�^
    String _SCREENMOVE_TYP;	
    String _APPR_ID;

	public SystemLog getSysLog() {
		return sysLog;
	}
	public void setSysLog(SystemLog sysLog) {
		this.sysLog = sysLog;
	}
	
	public IDbConnection getConn() {
		return conn;
	}
	public void setConn(IDbConnection conn) {
		this.conn = conn;
	}
	public void setStruct(Object structname) { this.struct.setStruct((AA0010010Struct)structname); }	// Struct���Z�b�g���܂��B
	/**
	 * �}�X�^�L�[�̏W��
	 */
	private HashMap keyValueMap = new HashMap();
	
	/**
	 * @return Returns the keyValueMap.
	 */
	public HashMap getKeyValueMap() {
		return keyValueMap;
	}
	/**
	 * @param keyValueMap The keyvalueMap to set.
	 */
	public void setKeyValueMap(HashMap keyvalueMap) {
		this.keyValueMap = keyvalueMap;
	}
	

	/**
	 * ���F����o�^
	 * @param button
	 * @throws SQLException
	 */
    private boolean insertAppr(String button) throws SQLException{   	
    	/** ���F�˗����݃`�F�b�N */
		ArrayList keyValueList = new ArrayList();
		// �ϐ��ݒ�(�i�ڔԍ�)
		MstColumns key1 = new MstColumns();
		key1.setColumnname("ITEM_CD");
		key1.setColumnvalue(struct.getITEM_CD());
		keyValueList.add(key1);
		
		
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0010010","AA0010010Servlet");
		// ���F�˗����݃`�F�b�N
		boolean rtnFlg = mstappr.checkMST_APPR("M_ITEM", keyValueList);
		if(rtnFlg) {
			// �L�[�����݂��Ă���
			ExpjMessage emsg = new ExpjMessage("KA00125");
			msgStruct.addError(emsg); // ���[�j���O���b�Z�[�W�Ƃ��ēo�^
			sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
			return false;
		}
		
    	/** ���F�˗��\�֓o�^�@*/
    	MstApprStruct mstApprStruct = new MstApprStruct();
    	// ���URL
    	mstApprStruct.setSCREEN_URL("AA0010010Servlet");
    	// �H��R�[�h
    	mstApprStruct.setPLANT_CD(getsysPLANT_CD());
    	// �����敪
    	mstApprStruct.setPROC_TYP(button);
    	// ���F���l
    	mstApprStruct.setAPPR_REMARKS(struct.getAPPR_REMARKS());   	
    	// ���F���(���F�҂�)
    	mstApprStruct.setSTATUS("1");
    	// �˗���
    	mstApprStruct.setREQUEST_BY(struct.getsUser_ID());
    	// ���F�˗��\�Ƀf�[�^��ǉ�
    	String appr_ID = mstappr.insertMST_APPR(mstApprStruct);
    	
    	
    	/** ���F�L�[�֓o�^ */
    	MstApprKeyStruct keyStruct = new MstApprKeyStruct();
    	// ���FID
    	keyStruct.setAPPR_ID(appr_ID);
    	// �e�[�u����
    	keyStruct.setTABLE_NAME("M_ITEM");
    	// �L�[��(�i�ڔԍ�)
    	keyStruct.setKEY_NAME("ITEM_CD");
    	// �L�[�l(�i�ڔԍ�)
    	keyStruct.setKEY_VALUE(struct.getITEM_CD());
    	// ���F�L�[�Ή��\�Ƀ}�X�^�̃L�[(�i�ڔԍ�)��ǉ�����
    	mstappr.insertMST_APPR_KEY(keyStruct);
    	
    	
    	/** ���F���ו\�֓o�^ */
    	// �i�ڔԍ�
		String columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CD(),columnID);	
		// �i�ږ�
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_NAME");
		mstappr.setDetailByColumnID(struct.getITEM_NAME(),columnID);		
		// �}�ʔԍ�
		columnID = mstappr.getColumnID( "M_ITEM", "DRAW_CD");
		mstappr.setDetailByColumnID(struct.getDRAW_CD(),columnID);
		// �K�i
		columnID = mstappr.getColumnID( "M_ITEM", "SPEC");
		mstappr.setDetailByColumnID(struct.getSPEC(),columnID);				
		// ���x���ԍ�
		columnID = mstappr.getColumnID( "M_ITEM", "HIGH_LEVEL_NO");
		if(struct.getHIGH_LEVEL_NO() == null || "".equals(struct.getHIGH_LEVEL_NO())){
			mstappr.setDetailByColumnID("0",columnID);				
		}else{
			mstappr.setDetailByColumnID(struct.getHIGH_LEVEL_NO(),columnID);				
		}	
		// �i�ڎ�z�敪
		columnID = mstappr.getColumnID( "M_ITEM", "MRP_ODR_TYP");
		if(struct.getMRP_ODR_TYP() == null || "".equals(struct.getMRP_ODR_TYP())){
			mstappr.setDetailByColumnID("1",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getMRP_ODR_TYP().toString(),columnID);
		}
		// �i�ړ��O��敪
		columnID = mstappr.getColumnID( "M_ITEM", "OUTSIDE_TYP");
		if(struct.getOUTSIDE_TYP() == null || "".equals(struct.getOUTSIDE_TYP())){
			mstappr.setDetailByColumnID("1",columnID);					
		}else{
			mstappr.setDetailByColumnID(struct.getOUTSIDE_TYP().toString(),columnID);					
		}	
		// �׎p�Ǘ��t���O
		columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT_FLG");
		if(struct.getSTOCK_UNIT_FLG() == null || "".equals(struct.getSTOCK_UNIT_FLG())){
			mstappr.setDetailByColumnID("2",columnID);				
		}else{
			mstappr.setDetailByColumnID(struct.getSTOCK_UNIT_FLG().toString(),columnID);				
		}	
		// �v�ʒP��
		columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT");
		mstappr.setDetailByColumnID(struct.getSTOCK_UNIT(),columnID);	
		// �׎p�v�ʒP��
		columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT");
		mstappr.setDetailByColumnID(struct.getPKG_UNIT(),columnID);		
		// �׎p�P�ʐ�
		columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT_QTY");
		if(struct.getPKG_UNIT_QTY() == null || "".equals(struct.getPKG_UNIT_QTY())){
			mstappr.setDetailByColumnID("1",columnID);				
		}else{
			mstappr.setDetailByColumnID(struct.getPKG_UNIT_QTY(),columnID);				
		}	
		// �݌ɐ��P�ʋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "UNIT_QTY_TYP");
		if(struct.getUNIT_QTY_TYP() == null || "".equals(struct.getUNIT_QTY_TYP())){
			mstappr.setDetailByColumnID("1",columnID);				
		}else{
			mstappr.setDetailByColumnID(struct.getUNIT_QTY_TYP().toString(),columnID);				
		}	
		// �i�ڎ�z���[�h�^�C��
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_LT");
		if(struct.getODR_LT() == null || "".equals(struct.getODR_LT())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getODR_LT(),columnID);		
		}
		// �i�ڌŒ蕪���[�h�^�C��
		columnID = mstappr.getColumnID( "M_ITEM", "FIXED_LT");
		if(struct.getFIXED_LT() == null || "".equals(struct.getFIXED_LT())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getFIXED_LT(),columnID);			
		}
		// �i�ڔ�ᕪ���[�h�^�C��
		columnID = mstappr.getColumnID( "M_ITEM", "PROP_LT");
		if(struct.getPROP_LT() == null || "".equals(struct.getPROP_LT())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getPROP_LT(),columnID);			
		}
		// ���S����
		columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_LT");
		if(struct.getSAFETY_LT() == null || "".equals(struct.getSAFETY_LT())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getSAFETY_LT(),columnID);			
		}
		// ���o���[�h�^�C��
		columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_LT");
		if(struct.getISSUE_LT() == null || "".equals(struct.getISSUE_LT())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getISSUE_LT(),columnID);			
		}
		// �i�ڔ�ᕪ���b�g�T�C�Y
		columnID = mstappr.getColumnID( "M_ITEM", "PROP_LOT_SIZE");
		if(struct.getPROP_LOT_SIZE() == null || "".equals(struct.getPROP_LOT_SIZE())){
			mstappr.setDetailByColumnID("1",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getPROP_LOT_SIZE(),columnID);			
		}
		// �i�ڎd����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_SPOIL");
		if(struct.getITEM_SPOIL() == null || "".equals(struct.getITEM_SPOIL())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getITEM_SPOIL(),columnID);			
		}
		// ���S�݌ɗ�
		columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_STOCK");
		if(struct.getSAFETY_STOCK() == null || "".equals(struct.getSAFETY_STOCK())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getSAFETY_STOCK(),columnID);
		}
		
		// ���b�g�܂Ƃߋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_SIZING_TYP");
		mstappr.setDetailByColumnID(struct.getLOT_SIZING_TYP().toString(),columnID);
		// �ő�܂Ƃߊ���
		columnID = mstappr.getColumnID( "M_ITEM", "MAX_PERIOD");
		if(struct.getMAX_PERIOD() == null || "".equals(struct.getMAX_PERIOD())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getMAX_PERIOD(),columnID);
		}
		
		// �ő��z��
		columnID = mstappr.getColumnID( "M_ITEM", "MAX_ODR_QTY");
		if(struct.getMAX_ODR_QTY() == null || "".equals(struct.getMAX_ODR_QTY())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getMAX_ODR_QTY(),columnID);
		}
		
		// �����_�݌ɐ�
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_POINT");
		if(struct.getODR_POINT() == null || "".equals(struct.getODR_POINT())){
			mstappr.setDetailByColumnID(struct.getODR_POINT(),columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getODR_POINT(),columnID);
		}
		
		// ��ʔ�����
		columnID = mstappr.getColumnID( "M_ITEM", "FIXED_ODR_QTY");
		if(struct.getFIXED_ODR_QTY() == null || "".equals(struct.getFIXED_ODR_QTY())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getFIXED_ODR_QTY(),columnID);
		}
		
		// �ŏ���z��
		columnID = mstappr.getColumnID( "M_ITEM", "MIN_ODR_QTY");
		if(struct.getMIN_ODR_QTY() == null || "".equals(struct.getMIN_ODR_QTY())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getMIN_ODR_QTY(),columnID);
		}
			
		// �܂�ߒP��
		columnID = mstappr.getColumnID( "M_ITEM", "MUL_ODR_QTY");
		if(struct.getMUL_ODR_QTY() == null || "".equals(struct.getMUL_ODR_QTY())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getMUL_ODR_QTY(),columnID);
		}
		
		// �o�ɋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_TYP");
		mstappr.setDetailByColumnID(struct.getISSUE_TYP().toString(),columnID);
		// MPS�i�ڃt���O
		columnID = mstappr.getColumnID( "M_ITEM", "MPS_FLG");
		mstappr.setDetailByColumnID(struct.getMPS_FLG().toString(),columnID);
		// ��������敪
		columnID = mstappr.getColumnID( "M_ITEM", "ACPT_INSPC_TYP");
		mstappr.setDetailByColumnID(struct.getACPT_INSPC_TYP().toString(),columnID);
		// ���i�敪
		columnID = mstappr.getColumnID( "M_ITEM", "PRODUCT_TYP");
		mstappr.setDetailByColumnID(struct.getPRODUCT_TYP().toString(),columnID);
		// �Ǘ��R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "CLASIFICATION_CD");
		mstappr.setDetailByColumnID(struct.getCLASIFICATION_CD(),columnID);
		// �P�ʏd��
		columnID = mstappr.getColumnID( "M_ITEM", "UNIT_WEIGHT");
		if(struct.getUNIT_WEIGHT() == null || "".equals(struct.getUNIT_WEIGHT())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getUNIT_WEIGHT(),columnID);
		}
		
		// �I���敪
		columnID = mstappr.getColumnID( "M_ITEM", "ABC_TYP");
		mstappr.setDetailByColumnID(struct.getABC_TYP().toString(),columnID);
		// ��Ǝ��ы敪
		columnID = mstappr.getColumnID( "M_ITEM", "OPR_RSLT_TYP");
		mstappr.setDetailByColumnID(struct.getOPR_RSLT_TYP().toString(),columnID);
	
		// �󋋕i�敪
		columnID = mstappr.getColumnID( "M_ITEM", "SPL_ITEM_TYP");
		mstappr.setDetailByColumnID(struct.getSPL_ITEM_TYP().toString(),columnID);
		// ����ŃR�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "TAX_CD");
		mstappr.setDetailByColumnID(struct.getTAX_CD(),columnID);
	
		// �J�����_�ԍ�
		columnID = mstappr.getColumnID( "M_ITEM", "CAL_NO");
		if(struct.getCAL_NO() == null || "".equals(struct.getCAL_NO())){
			mstappr.setDetailByColumnID("",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getCAL_NO().toString(),columnID);
		}
		
		// �ܖ������N��
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_YEAR");
		if(struct.getBEST_BEFORE_YEAR() == null || "".equals(struct.getBEST_BEFORE_YEAR())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getBEST_BEFORE_YEAR(),columnID);
		}
		// �ܖ���������
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_MONTH");
		if(struct.getBEST_BEFORE_MONTH() == null || "".equals(struct.getBEST_BEFORE_MONTH())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getBEST_BEFORE_MONTH(),columnID);
		}
		
		// �ܖ���������
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_DAY");
		if(struct.getBEST_BEFORE_DAY() == null || "".equals(struct.getBEST_BEFORE_DAY())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getBEST_BEFORE_DAY(),columnID);
		}
		
		// �o�׊����N��
		columnID = mstappr.getColumnID( "M_ITEM", "SHIP_DEADLINE_YEAR");
		mstappr.setDetailByColumnID("0",columnID);
		// �o�׊�������
		columnID = mstappr.getColumnID( "M_ITEM", "SHIP_DEADLINE_MONTH");
		mstappr.setDetailByColumnID("0",columnID);
		// �o�׊�������
		columnID = mstappr.getColumnID( "M_ITEM", "SHIP_DEADLINE_DAY");
		mstappr.setDetailByColumnID("0",columnID);
		// ���b�g�Ǘ��t���O
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_CTRL_FLG");
		mstappr.setDetailByColumnID(struct.getLOT_CTRL_FLG().toString(),columnID);
		// ���b�g�ԍ��̔ԋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_NUMBERING_TYP");
		mstappr.setDetailByColumnID(struct.getLOT_NUMBERING_TYP().toString(),columnID);
		// �󒍒P��
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_UNIT");
		mstappr.setDetailByColumnID("",columnID);
		// �󒍒P�ʐ�
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_UNIT_QTY");
		mstappr.setDetailByColumnID("1",columnID);
		// �ő�݌ɐ�
		columnID = mstappr.getColumnID( "M_ITEM", "MAX_STOCK_QTY");
		mstappr.setDetailByColumnID("0",columnID);
		//�i�ڕ��ނO�P
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_01_TYP");
		mstappr.setDetailByColumnID("3001",columnID);	
		//�i�ڕ��ނO�P�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_01_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_01_CD(),columnID);
		//�i�ڕ��ނO�P����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_01_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ��ނO2
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_02_TYP");
		mstappr.setDetailByColumnID("3002",columnID);	
		//�i�ڕ��ނO2�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_02_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_02_CD(),columnID);
		//�i�ڕ��ނO2����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_02_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ��ނO3
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_03_TYP");
		mstappr.setDetailByColumnID("3003",columnID);	
		//�i�ڕ��ނO3�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_03_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_03_CD(),columnID);
		//�i�ڕ��ނO3����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_03_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ��ނO4
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_04_TYP");
		mstappr.setDetailByColumnID("3004",columnID);	
		//�i�ڕ��ނO4�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_04_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_04_CD(),columnID);
		//�i�ڕ��ނO4����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_04_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ��ނO5
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_05_TYP");
		mstappr.setDetailByColumnID("3005",columnID);	
		//�i�ڕ��ނO5�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_05_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_05_CD(),columnID);
		//�i�ڕ��ނO5����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_05_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ��ނO6
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_06_TYP");
		mstappr.setDetailByColumnID("3006",columnID);	
		//�i�ڕ��ނO�P�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_06_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_06_CD(),columnID);
		//�i�ڕ��ނO�P����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_06_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ��ނO7
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_07_TYP");
		mstappr.setDetailByColumnID("3007",columnID);	
		//�i�ڕ��ނO7�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_07_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_07_CD(),columnID);
		//�i�ڕ��ނO7����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_07_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ��ނO8
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_08_TYP");
		mstappr.setDetailByColumnID("3008",columnID);	
		//�i�ڕ��ނO8�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_08_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_08_CD(),columnID);
		//�i�ڕ��ނO8����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_08_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ��ނO9
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_09_TYP");
		mstappr.setDetailByColumnID("3009",columnID);	
		//�i�ڕ��ނO9�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_09_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_09_CD(),columnID);
		//�i�ڕ��ނO9����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_09_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ���10
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_10_TYP");
		mstappr.setDetailByColumnID("3010",columnID);	
		//�i�ڕ���10�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_10_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_10_CD(),columnID);
		//�i�ڕ���10����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_10_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ���11
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_11_TYP");
		mstappr.setDetailByColumnID("3011",columnID);	
		//�i�ڕ���11�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_11_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_11_CD(),columnID);
		//�i�ڕ���11����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_11_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//�i�ڕ���12
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_12_TYP");
		mstappr.setDetailByColumnID("3012",columnID);	
		//�i�ڕ���12�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_12_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_12_CD(),columnID);
		//�i�ڕ���12����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_12_NAME");
		mstappr.setDetailByColumnID("",columnID);
		// �ۊǋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "DEPO_TYP");
		mstappr.setDetailByColumnID(struct.getDEPO_TYP().toString(),columnID);
		// JAN�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "JANCODE");
		mstappr.setDetailByColumnID("",columnID);
		// ��\�p�^�[���R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "PATTERN_CD");
		mstappr.setDetailByColumnID("",columnID);
		// ���Y�ꏊ
		columnID = mstappr.getColumnID( "M_ITEM", "PRD_CD");
		mstappr.setDetailByColumnID("",columnID);
		// �Z�b�g���[�h�^�C��
		columnID = mstappr.getColumnID( "M_ITEM", "SET_LT");
		mstappr.setDetailByColumnID("0",columnID);
		// �ܖ��������[�h�^�C��
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_DATE_LT");
		mstappr.setDetailByColumnID("0",columnID);
		// ���l�P
		columnID = mstappr.getColumnID( "M_ITEM", "REMARK1");
		mstappr.setDetailByColumnID(struct.getREMARK1(),columnID);
		// ���l�Q
		columnID = mstappr.getColumnID( "M_ITEM", "REMARK2");
		mstappr.setDetailByColumnID(struct.getREMARK2(),columnID);
		// �H���Ǘ��i�ڋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "MANHOUR_TYP");
		mstappr.setDetailByColumnID(struct.getMANHOUR_TYP().toString(),columnID);		
		
		// �쐬��
		columnID = mstappr.getColumnID("M_ITEM","CREATED_DATE");
		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
		// �쐬��
		columnID = mstappr.getColumnID("M_ITEM","CREATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// �쐬�v���O������
		columnID = mstappr.getColumnID("M_ITEM","CREATED_PRG_NM");
		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
		// �X�V��
		columnID = mstappr.getColumnID("M_ITEM","UPDATED_DATE");
		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
		// �X�V��
		columnID = mstappr.getColumnID("M_ITEM","UPDATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// �X�V�v���O������
		columnID = mstappr.getColumnID("M_ITEM","UPDATED_PRG_NM");
		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
		// �X�V��
		columnID = mstappr.getColumnID("M_ITEM","MODIFY_COUNT");
		if("1".equals(button)){
			mstappr.setDetailByColumnID("0",columnID);  	
		}else{
			mstappr.setDetailByColumnID(struct.getMODIFY_COUNT(),columnID);  	
		}
//20150730 ADD START BY SYSCOM
    	// ���S����R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "DEPT_CD");
		mstappr.setDetailByColumnID(struct.getDEPT_CD().toString(),columnID);
    	// �v���W�F�N�g�R�[�h
    	//�v���W�F�N�g�R�[�h�������I������Ă��Ȃ��i�S�p�X�y�[�X�j�������ꍇ
		if("�@".equals(struct.getPJ_CD())){
			struct.setPJ_CD("");
		}
		columnID = mstappr.getColumnID( "M_ITEM", "PJ_CD");
		mstappr.setDetailByColumnID(struct.getPJ_CD().toString(),columnID);
    	// �Z�O�����g1
    	//�Z�O�����g1�������I������Ă��Ȃ��i�S�p�X�y�[�X�j�������ꍇ
		if("�@".equals(struct.getSEG_CONTENTS1())){
			struct.setSEG_CONTENTS1("");
		}
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS1");
		mstappr.setDetailByColumnID(struct.getSEG_CONTENTS1().toString(),columnID);
      	// �Z�O�����g2
    	//�Z�O�����g2�������I������Ă��Ȃ��i�S�p�X�y�[�X�j�������ꍇ
		if("�@".equals(struct.getSEG_CONTENTS2())){
			struct.setSEG_CONTENTS2("");
		}
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS2");
		mstappr.setDetailByColumnID(struct.getSEG_CONTENTS2().toString(),columnID);
    	// �Z�O�����g3
    	//�Z�O�����g3�������I������Ă��Ȃ��i�S�p�X�y�[�X�j�������ꍇ
		if("�@".equals(struct.getSEG_CONTENTS3())){
			struct.setSEG_CONTENTS3("");
		}
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS3");
		mstappr.setDetailByColumnID(struct.getSEG_CONTENTS3().toString(),columnID);
    	// �Z�O�����g4
		//�Z�O�����g4�������I������Ă��Ȃ��i�S�p�X�y�[�X�j�������ꍇ
		if("�@".equals(struct.getSEG_CONTENTS4())){
			struct.setSEG_CONTENTS4("");
		}
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS4");
		mstappr.setDetailByColumnID(struct.getSEG_CONTENTS4().toString(),columnID);
//20150730 ADD END BY SYSCOM

		// ���F���ׂɃf�[�^��ǉ�����B
		mstappr.insertMST_APPR_DETAIL("M_ITEM",appr_ID);
    	
		// ���F���˗����܂����B
		setInfoMessage("AZ00042");
		
		return true;
    	
    }
    

	/**
	 * ���F��{�^�������ƁA���ITEM��ݒ�
	 * @param tempStruct
	 * @param columnID
	 * @throws SQLException
	 * @throws FoundationException 
	 */

	private void setMoveItem(MstAppr mstappr, MstApprDetailStruct tempStruct) throws SQLException, FoundationException {

		String columnID = null;
		// �i�ږ�
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_NAME");
		struct.setITEM_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �}�ʔԍ�
		columnID = mstappr.getColumnID( "M_ITEM", "DRAW_CD");
		struct.setDRAW_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �K�i
		columnID = mstappr.getColumnID( "M_ITEM", "SPEC");
		struct.setSPEC(mstappr.getDetailByColumnID(tempStruct,columnID));	
		// ���x���ԍ�
		columnID = mstappr.getColumnID( "M_ITEM", "HIGH_LEVEL_NO");
		struct.setHIGH_LEVEL_NO(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �i�ڎ�z�敪
		columnID = mstappr.getColumnID( "M_ITEM", "MRP_ODR_TYP");
		struct.setMRP_ODR_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �i�ړ��O��敪
		columnID = mstappr.getColumnID( "M_ITEM", "OUTSIDE_TYP");
		struct.setOUTSIDE_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �׎p�Ǘ��t���O
		columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT_FLG");
		struct.setSTOCK_UNIT_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �v�ʒP��
		columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT");
		struct.setSTOCK_UNIT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �׎p�v�ʒP��
		columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT");
		struct.setPKG_UNIT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �׎p�P�ʐ�
		columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT_QTY");
		struct.setPKG_UNIT_QTY(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �݌ɐ��P�ʋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "UNIT_QTY_TYP");
		struct.setUNIT_QTY_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �i�ڎ�z���[�h�^�C��
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_LT");
		struct.setODR_LT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �i�ڌŒ蕪���[�h�^�C��
		columnID = mstappr.getColumnID( "M_ITEM", "FIXED_LT");
		struct.setFIXED_LT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �i�ڔ�ᕪ���[�h�^�C��
		columnID = mstappr.getColumnID( "M_ITEM", "PROP_LT");
		struct.setPROP_LT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ���S����
		columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_LT");
		struct.setSAFETY_LT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ���o���[�h�^�C��
		columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_LT");
		struct.setISSUE_LT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �i�ڔ�ᕪ���b�g�T�C�Y
		columnID = mstappr.getColumnID( "M_ITEM", "PROP_LOT_SIZE");
		struct.setPROP_LOT_SIZE(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �i�ڎd����
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_SPOIL");
		struct.setITEM_SPOIL(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ���S�݌ɗ�
		columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_STOCK");
		struct.setSAFETY_STOCK(mstappr.getDetailByColumnID(tempStruct,columnID));
		
		// ���b�g�܂Ƃߋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_SIZING_TYP");
		struct.setLOT_SIZING_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �ő�܂Ƃߊ���
		columnID = mstappr.getColumnID( "M_ITEM", "MAX_PERIOD");
		struct.setMAX_PERIOD(mstappr.getDetailByColumnID(tempStruct,columnID));
		
		// �ő��z��
		columnID = mstappr.getColumnID( "M_ITEM", "MAX_ODR_QTY");
		struct.setMAX_ODR_QTY(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �����_�݌ɐ�
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_POINT");
		struct.setODR_POINT(mstappr.getDetailByColumnID(tempStruct,columnID));
		
		// ��ʔ�����
		columnID = mstappr.getColumnID( "M_ITEM", "FIXED_ODR_QTY");
		struct.setFIXED_ODR_QTY(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �ŏ���z��
		columnID = mstappr.getColumnID( "M_ITEM", "MIN_ODR_QTY");
		struct.setMIN_ODR_QTY(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �܂�ߒP��
		columnID = mstappr.getColumnID( "M_ITEM", "MUL_ODR_QTY");
		struct.setMUL_ODR_QTY(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �o�ɋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_TYP");
		struct.setISSUE_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// MPS�i�ڃt���O
		columnID = mstappr.getColumnID( "M_ITEM", "MPS_FLG");
		struct.setMPS_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ��������敪
		columnID = mstappr.getColumnID( "M_ITEM", "ACPT_INSPC_TYP");
		struct.setACPT_INSPC_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ���i�敪
		columnID = mstappr.getColumnID( "M_ITEM", "PRODUCT_TYP");
		struct.setPRODUCT_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �Ǘ��R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "CLASIFICATION_CD");
		struct.setCLASIFICATION_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �P�ʏd��
		columnID = mstappr.getColumnID( "M_ITEM", "UNIT_WEIGHT");
		struct.setUNIT_WEIGHT(mstappr.getDetailByColumnID(tempStruct,columnID));
		
		// �I���敪
		columnID = mstappr.getColumnID( "M_ITEM", "ABC_TYP");
		struct.setABC_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ��Ǝ��ы敪
		columnID = mstappr.getColumnID( "M_ITEM", "OPR_RSLT_TYP");
		struct.setOPR_RSLT_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
	
		// �󋋕i�敪
		columnID = mstappr.getColumnID( "M_ITEM", "SPL_ITEM_TYP");
		struct.setSPL_ITEM_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ����ŃR�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "TAX_CD");
		struct.setTAX_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
	
		// �J�����_�ԍ�
		columnID = mstappr.getColumnID( "M_ITEM", "CAL_NO");
		struct.setCAL_NO(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �ܖ������N��
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_YEAR");
		struct.setBEST_BEFORE_YEAR(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �ܖ���������
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_MONTH");
		struct.setBEST_BEFORE_MONTH(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �ܖ���������
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_DAY");
		struct.setBEST_BEFORE_DAY(mstappr.getDetailByColumnID(tempStruct,columnID));
		
		// ���b�g�Ǘ��t���O
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_CTRL_FLG");
		struct.setLOT_CTRL_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ���b�g�ԍ��̔ԋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_NUMBERING_TYP");
		struct.setLOT_NUMBERING_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ��ނO�P�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_01_CD");
		struct.setITEM_CLASS_01_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ��ނO2�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_02_CD");
		struct.setITEM_CLASS_02_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ��ނO3�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_03_CD");
		struct.setITEM_CLASS_03_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ��ނO4�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_04_CD");
		struct.setITEM_CLASS_04_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ��ނO5�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_05_CD");
		struct.setITEM_CLASS_05_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ��ނO6�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_06_CD");
		struct.setITEM_CLASS_06_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ��ނO7�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_07_CD");
		struct.setITEM_CLASS_07_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ��ނO8�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_08_CD");
		struct.setITEM_CLASS_08_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ��ނO9�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_09_CD");
		struct.setITEM_CLASS_09_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ���10�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_10_CD");
		struct.setITEM_CLASS_10_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ���11�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_11_CD");
		struct.setITEM_CLASS_11_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//�i�ڕ���12�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_12_CD");
		struct.setITEM_CLASS_12_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �ۊǋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "DEPO_TYP");
		struct.setDEPO_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ���l�P
		columnID = mstappr.getColumnID( "M_ITEM", "REMARK1");
		struct.setREMARK1(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ���l�Q
		columnID = mstappr.getColumnID( "M_ITEM", "REMARK2");
		struct.setREMARK2(mstappr.getDetailByColumnID(tempStruct,columnID));
		// �H���Ǘ��i�ڋ敪
		columnID = mstappr.getColumnID( "M_ITEM", "MANHOUR_TYP");
		struct.setMANHOUR_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		//����Ŗ�
		if(struct.getTAX_CD() != null && !"".equals(struct.getTAX_CD())){
			List taxList = entity.mselectTAX_CD.read(conn,struct);
			if(taxList != null && taxList.size() > 0){
				struct.setTAX_NAME(((AA0010010Struct)taxList.get(0)).getTAX_NAME());
			}
		}
		//�J�����_��
    	if(struct.getCAL_NO() != null && !"".equals(struct.getCAL_NO())){
    		List calList  = entity.mselectCAL_NO.read(conn,struct);
    		if(calList != null && calList.size() > 0){
    			struct.setCAL_NAME(((AA0010010Struct)calList.get(0)).getCAL_NAME());
    		}
    	}
//20150730 ADD START BY SYSCOM
    	// ���S����R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "DEPT_CD");
		struct.setDEPT_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
    	
		// �v���W�F�N�g�R�[�h
		columnID = mstappr.getColumnID( "M_ITEM", "PJ_CD");
		struct.setPJ_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		
    	// �Z�O�����g1
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS1");
		struct.setSEG_CONTENTS1(mstappr.getDetailByColumnID(tempStruct,columnID));
		
      	// �Z�O�����g2
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS2");
		struct.setSEG_CONTENTS2(mstappr.getDetailByColumnID(tempStruct,columnID));
		
    	// �Z�O�����g3
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS3");
		struct.setSEG_CONTENTS3(mstappr.getDetailByColumnID(tempStruct,columnID));
		
    	// �Z�O�����g4
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS4");
		struct.setSEG_CONTENTS4(mstappr.getDetailByColumnID(tempStruct,columnID));
		
//20150730 ADD END BY SYSCOM
    }

	/**
	 * �o�^�{�^���������`�F�b�N
	 * @param �Ȃ�
	 * @throws SQLException�AFoundationException 
	 * @return boolean true:OK false:NG
	 */
	public boolean insertCheck() throws SQLException,FoundationException
	{
		boolean result = false; // �`�F�b�N���ʊi�[
		boolean numResult = false; // �����`�F�b�N

		Integer unitQtyTyp = new Integer("1"); // �����^�C�v
		// �����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ�����
		if (unitQtyTyp.equals(struct.getUNIT_QTY_TYP())) {
			// �׎p�P�ʐ�
			if (Calculate.isNumeric(struct.getPKG_UNIT_QTY())) {
				String pkgUnitQty = Calculate.ceil(struct.getPKG_UNIT_QTY(), 0);
				struct.setPKG_UNIT_QTY(pkgUnitQty);
				numResult = true;
			}
			// ���S�݌ɗ�
			if (Calculate.isNumeric(struct.getSAFETY_STOCK())) {
				String saftyStock = Calculate.ceil(struct.getSAFETY_STOCK(), 0);
				struct.setSAFETY_STOCK(saftyStock);
				numResult = true;
			}
			// �ő��z��
			if (Calculate.isNumeric(struct.getMAX_ODR_QTY())) {
				String maxOdrQty = Calculate.ceil(struct.getMAX_ODR_QTY(),
						0);
				struct.setMAX_ODR_QTY(maxOdrQty);
				numResult = true;
			}
			// �����_�݌ɐ�
			if (Calculate.isNumeric(struct.getODR_POINT())) {
				String odrPoint = Calculate.ceil(struct.getODR_POINT(), 0);
				struct.setODR_POINT(odrPoint);
				numResult = true;
			}
			// ��ʔ�����
			if (Calculate.isNumeric(struct.getFIXED_ODR_QTY())) {
				String fixedOdrQty = Calculate.ceil(struct
						.getFIXED_ODR_QTY(), 0);
				struct.setFIXED_ODR_QTY(fixedOdrQty);
				numResult = true;
			}
			// �ŏ���z��
			if (Calculate.isNumeric(struct.getMIN_ODR_QTY())) {
				String minOdrQty = Calculate.ceil(struct.getMIN_ODR_QTY(),
						0);
				struct.setMIN_ODR_QTY(minOdrQty);
				numResult = true;
			}
			// �܂�ߒP��
			if (Calculate.isNumeric(struct.getMUL_ODR_QTY())) {
				String mulOdrQty = Calculate.ceil(struct.getMUL_ODR_QTY(),
						0);
				struct.setMUL_ODR_QTY(mulOdrQty);
				numResult = true;
			}
			// ���[�j���O���b�Z�[�W�쐬
			if (numResult) {
				setWarnMessage("AA90010");
			}
		}
		// �i�ڏ�� �d���`�F�b�N
		result = entity.mcheckM_ITEM.check(conn, struct);
		if(result == true){
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setErrorMessage("AA00051", keyMessage);
		}

		// ����ŃR�[�h�`�F�b�N
		if(struct.getTAX_CD() != null && "".equals(struct.getTAX_CD()) != true){
			result = entity.mcheckM_TAX.check(conn, struct);
			if(result == false){
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_ITEM.TAX_CD:" + struct.getTAX_CD();
				setErrorMessage("AA01001", keyMessage);
			}
		}

		// �J�����_�ԍ��`�F�b�N
		if(struct.getCAL_NO() != null && "".equals(struct.getCAL_NO()) != true){
			result = entity.mcheckM_CAL_H.check(conn, struct);
			if(result == false){
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
				setErrorMessage("AA01013", keyMessage);
			}
		}
//20150730 ADD START BY SYSCOM
		//���S����R�[�h�`�F�b�N
		//���S����R�[�h��NULL�ł͂Ȃ��ꍇ
		if(struct.getDEPT_CD() != null && "".equals(struct.getDEPT_CD()) != true){
			List tempList = entity.mV_DEPT_CD.read(conn, struct);
			if (tempList.isEmpty()) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_ITEM.DEPT_CD:" + struct.getDEPT_CD();
				setErrorMessage("AA23603", keyMessage);
			}
		}
//20150730 ADD END BY SYSCOM
		// ���b�g�Ǘ��t���O�`�F�b�N
		if((struct.getMRP_ODR_TYP().intValue() == 1 || struct.getMRP_ODR_TYP().intValue() == 2) && struct.getLOT_CTRL_FLG().intValue() == 1){
			//�G���[���b�Z�[�W
			List msgs = new ArrayList();
			msgs.add("M_MRP_ODR_TYP:" + struct.getMRP_ODR_TYP().intValue());
			msgs.add("M_LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG().intValue());
			setErrorMessage("AA20048", msgs);
		}
		
		// ���ރ}�X�^�`�F�b�N
		checkClass(struct);

		// �G���[���������Ă��Ȃ��ꍇ�Atrue�G��������Ƃ��Afalse		
		return !msgStruct.hasError();
	}
	/**
	 * �X�V�{�^���������`�F�b�N
	 * @param �Ȃ�
	 * @throws SQLException�AFoundationException �AExpjException
	 * @return boolean true:OK false:NG
	 */
	public boolean updateCheck() throws SQLException,FoundationException
	{
		boolean result = true;		// �`�F�b�N���ʊi�[
		boolean numResult = false; // �����`�F�b�N
		
		Integer unitQtyTyp = new Integer("1"); // �����^�C�v

		// �����Ǘ��i�ڂ̂��ߏ����_�ȉ��͐؂�グ�����
		if (unitQtyTyp.equals(struct.getUNIT_QTY_TYP())) {
			// �׎p�P�ʐ�
			if (Calculate.isNumeric(struct.getPKG_UNIT_QTY())) {
				String pkgUnitQty = Calculate.ceil(struct.getPKG_UNIT_QTY(), 0);
				struct.setPKG_UNIT_QTY(pkgUnitQty);
				numResult = true;
			}
			// ���S�݌ɗ�
			if (Calculate.isNumeric(struct.getSAFETY_STOCK())) {
				String saftyStock = Calculate.ceil(struct.getSAFETY_STOCK(), 0);
				struct.setSAFETY_STOCK(saftyStock);
				numResult = true;
			}
			// �ő��z��
			if (Calculate.isNumeric(struct.getMAX_ODR_QTY())) {
				String maxOdrQty = Calculate.ceil(struct.getMAX_ODR_QTY(),
						0);
				struct.setMAX_ODR_QTY(maxOdrQty);
				numResult = true;
			}
			// �����_�݌ɐ�
			if (Calculate.isNumeric(struct.getODR_POINT())) {
				String odrPoint = Calculate.ceil(struct.getODR_POINT(), 0);
				struct.setODR_POINT(odrPoint);
				numResult = true;
			}
			// ��ʔ�����
			if (Calculate.isNumeric(struct.getFIXED_ODR_QTY())) {
				String fixedOdrQty = Calculate.ceil(struct
						.getFIXED_ODR_QTY(), 0);
				struct.setFIXED_ODR_QTY(fixedOdrQty);
				numResult = true;
			}
			// �ŏ���z��
			if (Calculate.isNumeric(struct.getMIN_ODR_QTY())) {
				String minOdrQty = Calculate.ceil(struct.getMIN_ODR_QTY(),
						0);
				struct.setMIN_ODR_QTY(minOdrQty);
				numResult = true;
			}
			// �܂�ߒP��
			if (Calculate.isNumeric(struct.getMUL_ODR_QTY())) {
				String mulOdrQty = Calculate.ceil(struct.getMUL_ODR_QTY(),
						0);
				struct.setMUL_ODR_QTY(mulOdrQty);
				numResult = true;
			}
			// ���[�j���O���b�Z�[�W�쐬
			if (numResult) {
				setWarnMessage("AA90010");
			}
		}
		// ����/�X�V�m�F
		List list = entity.mselectMODIFY_COUNT.read(conn, struct);
		if(list.size() <= 0){
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setErrorMessage("ZZ06001", keyMessage);
		}
		else{
			String modify = ((AA0010010Struct)list.get(0)).getMODIFY_COUNT();
			if (struct.getMODIFY_COUNT().equals(modify) == false)
			{
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("ZZ01105", keyMessage);
			}
		}
		// �ēx�i�ڏ����擾����
		List mitemList = entity.mselect.read(conn, struct);
		AA0010010Struct itemStruct = (AA0010010Struct)mitemList.get(0);
		
		// �C���X�g�[���I�v�V�����̑��݊m�F
		result = entity.mcheckSYS_INSTALL_OPTIONS.check(conn, struct);
		if(result == false){
			// �[���i���ύX���ꂽ�ꍇ�A���i�}�X�^�̑��݃`�F�b�N
			if ( (struct.getMRP_ODR_TYP().intValue() == 8) && (entity.mcheckM_ITEM_SPEC.check(conn, struct)) ) {
			    // �G���[���b�Z�[�W�ݒ�
			    keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			    setErrorMessage("AA01529", keyMessage);
			}
		
	    } else {
			// �[���i���ύX���ꂽ�ꍇ�A���Ӑ�i�ڃ}�X�^�̑��݃`�F�b�N
			if ( (struct.getMRP_ODR_TYP().intValue() == 8) && (entity.mcheckM_CUST_ITEM.check(conn, struct)) ) {
			    // �G���[���b�Z�[�W�ݒ�
			    keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			    setErrorMessage("AA01528", keyMessage);
			}
	    }
		
//2008/07/14 SYSCOM ���� ADD START
		// �H���Ǘ��i�ڋ敪���ύX���ꂽ�ꍇ�̃`�F�b�N
		// �q�i�ڂ����݂���i�ڂ��H���Ǘ��i�ڂɕύX���悤�Ƃ����ꍇ
		if(!itemStruct.getMANHOUR_TYP().equals(struct.getMANHOUR_TYP()) 
			&& struct.getMANHOUR_TYP().intValue() == 1 ){
			result = entity.mcheckM_PS.check(conn, struct);
			if (result) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_PS.PARENT_ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00180", keyMessage);
			}
		}
		
		// ���v�ʂ����݂���ꍇ�ɍH���Ǘ��i�ڋ敪���ύX���ꂽ�ꍇ�̓G���[�Ƃ���
		result = entity.mcheckT_OD_ITEM_CD.check(conn, struct);
		if (result) {
			// �H���Ǘ��i�ڋ敪�`�F�b�N
			if(!itemStruct.getMANHOUR_TYP().equals(struct.getMANHOUR_TYP())){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00181", keyMessage);
			}
		}
//2008/07/14 SYSCOM ���� ADD END
		// �ۊǋ�ʕi�ڍ݌ɂ����݂��A���莝�݌ɐ���<>0�̏ꍇ�Ƀ��b�g�Ǘ��t���O�A�v�ʒP�ʁA
		// �H���Ǘ��i�ڋ敪���ύX���ꂽ�ꍇ�̓G���[�Ƃ���
		List itemStockList = entity.mcheck_T_ITEM_STOCK.read(conn, struct);
		
		if(itemStockList.size() != 0){
			// �v�ʒP�ʃ`�F�b�N
			if(!itemStruct.getSTOCK_UNIT().equals(struct.getSTOCK_UNIT())){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA22055", keyMessage);
			}
			//�@���b�g�Ǘ��t���O�`�F�b�N
			if(!itemStruct.getLOT_CTRL_FLG().equals(struct.getLOT_CTRL_FLG())){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA22056", keyMessage);
			}
//2008/07/14 SYSCOM ���� ADD START
			// �H���Ǘ��i�ڋ敪�`�F�b�N
			if(!itemStruct.getMANHOUR_TYP().equals(struct.getMANHOUR_TYP())){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00181", keyMessage);
			}
//2008/07/14 SYSCOM ���� ADD END
		}
		
//2008/07/14 SYSCOM ���� ADD START
		// �ۊǋ�ʐ��ԍ݌ɂ����݂��A���莝�݌ɐ���<>0�̏ꍇ�ɍH���Ǘ��i�ڋ敪���ύX���ꂽ�ꍇ�̓G���[�Ƃ���
		result = entity.mcheckT_JOB_ODR_CD_STOCK_QTY.check(conn, struct);
		if (result) {
			// �H���Ǘ��i�ڋ敪�`�F�b�N
			if(!itemStruct.getMANHOUR_TYP().equals(struct.getMANHOUR_TYP())){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00181", keyMessage);
			}
		}

		// ��ƌn�񂪑��݂��A����ƌn����O��敪 = 2:�O��ōH���Ǘ��i�ڋ敪��1:�H���Ǘ��i�ڂɕύX���ꂽ�ꍇ�̓G���[�Ƃ���
		result = entity.mcheckM_PROC_GRP.check(conn, struct);
		if (result) {
			// �H���Ǘ��i�ڋ敪�`�F�b�N
		if(!itemStruct.getMANHOUR_TYP().equals(struct.getMANHOUR_TYP()) &&
				struct.getMANHOUR_TYP().intValue() == 1){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00189", keyMessage);
			}
		}
//2008/07/14 SYSCOM ���� ADD END
		
		// ����ŃR�[�h�`�F�b�N
		if(struct.getTAX_CD() != null && "".equals(struct.getTAX_CD()) != true){
			result = entity.mcheckM_TAX.check(conn, struct);
			if(result == false){
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_ITEM.TAX_CD:" + struct.getTAX_CD();
				setErrorMessage("AA01001", keyMessage);
			}
		}

		// �J�����_�ԍ��`�F�b�N
		if(struct.getCAL_NO() != null && "".equals(struct.getCAL_NO()) != true){
			result = entity.mcheckM_CAL_H.check(conn, struct);
			if(result == false){
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
				setErrorMessage("AA01013", keyMessage);
			}
		}

//20150730 ADD START BY SYSCOM
		//���S����R�[�h�`�F�b�N
		//���S����R�[�h��NULL�ł͂Ȃ��ꍇ
		if(struct.getDEPT_CD() != null && "".equals(struct.getDEPT_CD()) != true){
			List tempList = entity.mV_DEPT_CD.read(conn, struct);
			if (tempList.isEmpty()) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_ITEM.DEPT_CD:" + struct.getDEPT_CD();
				setErrorMessage("AA23603", keyMessage);
			}
		}
//20150730 ADD END BY SYSCOM
		
		// old�i�ڎ�z�敪��ݒ�
		list = entity.mselect.read(conn, struct);	
		if (list.size() != 0) {
			AA0010010Struct tempStruct = (AA0010010Struct)list.get(0);

			// �i�ڎ�z�敪�擾
			_OLD_MRP_ODR_TYP = new Integer(tempStruct.getMRP_ODR_TYP().intValue());
		}

		// �i�ڎ�z�敪�`�F�b�N
		if(_OLD_MRP_ODR_TYP.intValue() != struct.getMRP_ODR_TYP().intValue()){
			int status = 0;	// �X�V�ł��邩�ǂ����̏��
			result = entity.mcheckT_OD_ITEM_CD.check(conn, struct);
			if(result == true){
				status = 1;
			}else{
				result = entity.mcheckT_JOB_ODR_CD_STOCK.check(conn, struct);
				if(result == true){
					status = 1;
				}else{
					result = entity.mcheckT_ITEM_STOCK.check(conn, struct);
					if(result == true){
						status = 1;
					}
				}
			}
			// ��z��� ([���v��])�A�܂��͍݌ɏ�� ([�ۊǋ�ʐ��ԍ݌�]�A[�ۊǋ�ʕi�ڍ݌�])������ꍇ
			if(status == 1){
				// �i�ڎ�z�敪��4�F�}�j���A����z�i�ځA5�F���b�g��z�i�ځA6�F��ʎ�z�i�ځA7�F�����_��z�i�ڂ���
				// 1�F���ԁA2�F�݌Ɉ����^���ԁA8�F�[���i�ڂɕύX����ꍇ
				if(_OLD_MRP_ODR_TYP.intValue() == 4 || _OLD_MRP_ODR_TYP.intValue() == 5 ||
						_OLD_MRP_ODR_TYP.intValue() == 6 || _OLD_MRP_ODR_TYP.intValue() == 7){
					if(struct.getMRP_ODR_TYP().intValue() == 1 || struct.getMRP_ODR_TYP().intValue() == 2 ||
							struct.getMRP_ODR_TYP().intValue() == 8){
						status = 12;
					}
				}
				// �i�ڎ�z�敪��1�F���ԁA2�F�݌Ɉ����^���Ԃ��瑼�̕i�ڎ�z�敪(1,2��������)�ɕύX����ꍇ
				if(_OLD_MRP_ODR_TYP.intValue() == 1 || _OLD_MRP_ODR_TYP.intValue() == 2){
					if(struct.getMRP_ODR_TYP().intValue() != 1 && struct.getMRP_ODR_TYP().intValue() != 2){
						status = 11;
					}
				}
				//8�F�[���i�ڂ��瑼�̕i�ڎ�z�敪�ɕύX����ꍇ
				if(_OLD_MRP_ODR_TYP.intValue() == 8){
					status = 11;
				}
			}
			if(status == 11){
				// �G���[���b�Z�[�W�쐬
				List msgs = new ArrayList();
				msgs.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
				msgs.add("M_ITEM.MRP_ODR_TYP:" + struct.getMRP_ODR_TYP());
				setErrorMessage("AA00011", msgs);
			}else if (status == 12){
				// �G���[���b�Z�[�W�쐬
				List msgs = new ArrayList();
				msgs.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
				msgs.add("M_ITEM.MRP_ODR_TYP:" + struct.getMRP_ODR_TYP());
				try {
					setErrorMessage("AA00211", getMRP_ODR_TYP_DISPLAY_NAME(_OLD_MRP_ODR_TYP.toString()),
							getMRP_ODR_TYP_DISPLAY_NAME(struct.getMRP_ODR_TYP().toString()), msgs);
				} catch (ExpjException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
			}
		}
		// �i�ڎ�z�敪�Ɛ��Ԍv��̊֘A�`�F�b�N
		if(_OLD_MRP_ODR_TYP.intValue() == 1 || _OLD_MRP_ODR_TYP.intValue() == 2){
			if(struct.getMRP_ODR_TYP().intValue() != 1 && struct.getMRP_ODR_TYP().intValue() != 2){
					result = entity.mcheckT_JOB_ODR.check(conn, struct);
					if(result == true){
						// �G���[���b�Z�[�W�쐬
						List msgs = new ArrayList();
						msgs.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						msgs.add("M_ITEM.MRP_ODR_TYP:" + struct.getMRP_ODR_TYP());
						setErrorMessage("AA00011", msgs);
					}
			}
		}

		// �i�ڎ�z�ʍ\���`�F�b�N
		result = true;
		ProductStructureRepository rep = new ProductStructureRepository(conn);
		// �q�i�ڂ��m�F
		if(checkLowerType(rep, struct) == false){
			result = false;
		}
		// �e�i�ڂ��m�F
		if(checkUpperType(rep, struct) == false){
			result = false;
		}
		// �G���[����
		if (result == false) {
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_ITEM.MRP_ODR_TYP:" + struct.getMRP_ODR_TYP();
			setErrorMessage("AA00010", keyMessage);
		}
		// ���b�g�Ǘ��t���O�`�F�b�N
		if((struct.getMRP_ODR_TYP().intValue() == 1 || struct.getMRP_ODR_TYP().intValue() == 2) && struct.getLOT_CTRL_FLG().intValue() == 1){
			//�G���[���b�Z�[�W
			List msgs = new ArrayList();
			msgs.add("M_MRP_ODR_TYP:" + struct.getMRP_ODR_TYP().intValue());
			msgs.add("M_LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG().intValue());
			setErrorMessage("AA20048", msgs);
		}
		// ���ރ}�X�^�`�F�b�N
		checkClass(struct);

		// �G���[���������Ă��Ȃ��ꍇ�Atrue�G��������Ƃ��Afalse		
		return !msgStruct.hasError();
	}


	//------------------------------------------------------------------------
	/**
	 * �폜�X�V�{�^���������`�F�b�N
	 * @param �Ȃ�
	 * @throws SQLException�AFoundationException 
	 * @return boolean true:OK false:NG
	 */
	//------------------------------------------------------------------------
	
	public boolean deleteCheck()throws FoundationException, SQLException{

		// �i�ڏ��̑��݊m�F
		boolean result = entity.mcheckM_ITEM.check(conn, struct);
		if(result == false){
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_WH.ITEM_CD:" + struct.getITEM_CD();
			setErrorMessage("ZZ06001", keyMessage);
		}else{

			//�X�V�J�E���g�̃`�F�b�N
			List list = entity.mselectMODIFY_COUNT.read(conn, struct);

			String modify = ((AA0010010Struct)list.get(0)).getMODIFY_COUNT();
			if (struct.getMODIFY_COUNT().equals(modify) == false)
			{
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_WH.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("ZZ01105", keyMessage);
			}
			
			// �C���X�g�[���I�v�V�����̑��݊m�F
			result = entity.mcheckSYS_INSTALL_OPTIONS.check(conn, struct);
			if(result == false){
				
			    // ���i�}�X�^�̑��݃`�F�b�N
			    if (entity.mcheckM_ITEM_SPEC.check(conn, struct)) {
				    // �G���[���b�Z�[�W�ݒ�
				    keyMessage = "M_ITEM_SPEC.ITEM_CD:" + struct.getITEM_CD();
				    setErrorMessage("AA00173", keyMessage);
			    }
    
			    // ���i�P���}�X�^�̑��݃`�F�b�N
			    if (entity.mcheckM_UNIT_COST.check(conn, struct)) {
				    // �G���[���b�Z�[�W�ݒ�
				    keyMessage = "M_UNIT_COST.ITEM_CD:" + struct.getITEM_CD();
				    setErrorMessage("AA00174", keyMessage);
			    }
		    } else {
		    	// �̔��P���}�X�^�̑��݃`�F�b�N
				if (entity.mcheckM_SALES_UNIT_COST.check(conn, struct)) {
					// �G���[���b�Z�[�W�ݒ�
					keyMessage = "M_SALES_UNIT_COST.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AA34036", keyMessage);
				}
				
				// ���Ӑ�i�ڃ}�X�^�̑��݃`�F�b�N
				if (entity.mcheckM_CUST_ITEM.check(conn, struct)) {
					// �G���[���b�Z�[�W�ݒ�
					keyMessage = "M_CUST_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AA34101", keyMessage);
				}
		    }

			// �Q�Ɛ��������؁F���v��
			List list1 = entity.mselectT_OD.read(conn, struct);
			if (list1.size() != 0) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "T_OD.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00012", keyMessage);
			}

			// �Q�Ɛ��������؁F���Ԍv��
			List list2 = entity.mselectT_JOB_ODR.read(conn, struct);
			if (list2.size() != 0) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "T_JOB_ODR.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00013", keyMessage);
			}

			// �Q�Ɛ��������؁F���i�\��
			List list3 = entity.mselectM_PS.read(conn, struct);
			if (list3.size() != 0) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "M_PS.PARENT_ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00014", keyMessage);
			}

			// �Q�Ɛ��������؁F�ۊǋ�ʕi�ڍ݌�
			List list4 = entity.mselectT_ITEM_STOCK.read(conn, struct);
			if (list4.size() != 0) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00015", keyMessage);
			}

			// �Q�Ɛ��������؁F�ۊǋ搻�ʔԍ݌�
			List list5 = entity.mselectT_JOB_ODR_CD_STOCK.read(conn, struct);
			if (list5.size() != 0) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00016", keyMessage);
			}

			// �Q�Ɛ��������؁F��Ǝ���
			List list6 = entity.mselectT_OPR_RSLT.read(conn, struct);
			if (list6.size() != 0) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "T_OPR_RSLT.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00017", keyMessage);
			}

			// �Q�Ɛ��������؁F�����c
			List list7 = entity.mselectT_RLSD_PUCH_ODR.read(conn, struct);
			if (list7.size() != 0) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "T_RLSD_PUCH_ODR.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00018", keyMessage);
			}

			// �Q�Ɛ��������؁F��ƌn��ʎd�|
			List list8 = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, struct);
			if (list8.size() != 0) {
				// �G���[���b�Z�[�W�쐬
				keyMessage = "T_WORK_IN_PROC_BY_PROC.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00019", keyMessage);
			}

            // �Q�Ɛ��������؁F�L���x������
            List list9 = entity.mselectT_PAST_ONEROUS_CONS.read(conn, struct);
            if (list9.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "T_PAST_ONEROUS_CONS.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00999", keyMessage);
			}
            
            // �Q�Ɛ��������؁F�w���ԕi����
            List list10 = entity.mselectT_PUCH_ODR_RTN_RSLT.read(conn, struct);
            if (list10.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "T_PUCH_ODR_RTN_RSLT.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA01000", keyMessage);
			}
            // �Q�Ɛ��������؁F�i�ڕʓ��ɐ�ۊǋ�
            List list11 = entity.mselectM_ITEM_RCV_WH.read(conn, struct);
            if (list11.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "M_ITEM_RCV_WH.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00998", keyMessage);
            }
			
			// �Q�Ɛ��������؁F�l�o�r���b�N
            List list12 = entity.mselectSYS_MPS_LOCK.read(conn, struct);
            if (list12.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "SYS_MPS_LOCK.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00162", keyMessage);
            }
			
			// �Q�Ɛ��������؁F�o�Ɏw��
            List list13 = entity.mselectT_ISSUE_INST.read(conn, struct);
            if (list13.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "T_ISSUE_INST.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00163", keyMessage);
            }
			
			// �Q�Ɛ��������؁F�o��������
            List list14 = entity.mselectT_OUTPUT_RSLT.read(conn, struct);
            if (list14.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "T_OUTPUT_RSLT.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00078", keyMessage);
            }
			
			// �Q�Ɛ��������؁F�i�ڕʎd�|
            List list15 = entity.mselectT_WORK_IN_PROC_BY_ITEM.read(conn, struct);
            if (list15.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "T_WORK_IN_PROC_BY_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00164", keyMessage);
            }
			
			// �Q�Ɛ��������؁F���Ԉ���
            List list16 = entity.mselectT_JOB_ODR_ALC.read(conn, struct);
            if (list16.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "T_JOB_ODR_ALC.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00165", keyMessage);
            }
			
			// �Q�Ɛ��������؁F�ϑ��݌�
            List list17 = entity.mselectT_TRANSPORT_STOCK.read(conn, struct);
            if (list17.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "T_TRANSPORT_STOCK.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00166", keyMessage);
            }
			
			// �Q�Ɛ��������؁F�w���i�}�X�^
            List list18 = entity.mselectM_CS_PUCH.read(conn, struct);
            if (list18.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "M_CS_PUCH.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00167", keyMessage);
            }
			
			// �Q�Ɛ��������؁F�i�ڕʉ��H��
            List list19 = entity.mselectT_ITEM_PROC_COST.read(conn, struct);
            if (list19.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "T_ITEM_PROC_COST.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00168", keyMessage);
            }
			
			// �Q�Ɛ��������؁F�i�ڕʉ��H��}�X�^
            List list20 = entity.mselectM_ITEM_PROC_COST.read(conn, struct);
            if (list20.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "M_ITEM_PROC_COST.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00169", keyMessage);
            }
			
			// �Q�Ɛ��������؁F�i�ڕʌ���
            List list21 = entity.mselectT_ITEM_COST.read(conn, struct);
            if (list21.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "T_ITEM_COST.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00170", keyMessage);
            }
			
			// �Q�Ɛ��������؁F�ۊǋ�ʕi�ڒI��
            List list22 = entity.mselectT_ITEM_INV.read(conn, struct);
            if (list22.size() != 0 ) {
				// �G���[���b�Z�[�W�ݒ�
				keyMessage = "T_ITEM_INV.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00171", keyMessage);
            }
		}

		// �G���[���������Ă��Ȃ��ꍇ�Atrue�G��������Ƃ��Afalse		
		return !msgStruct.hasError();
	}
//---------- ���b�Z�[�W�֘A�̏���-- --------------------------------------------

	String keyMessage = "";
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

	
	/**
	 * ��񃁃b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setInfoMessage(String messageno)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	}

	/**
	 * Exception���b�Z�[�W�ݒ�
	 * @param �L�[����
	 */
	private void setSqlExceptionMsg(SQLException e, String key) throws ExpjException
	{
		// �G���[���b�Z�[�W�쐬
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//�v���I�G���[ �G���[���e
		ExpjException ee = new ExpjException(e, emsg); // �G�N�Z�v�V�����𐶐�
		//emsg = new ExpjMessage( "ZZ01006", key );
		//sysLog.severe(emsg ,getsysUSER_CD()); //�G���[�ڍ�
		//ee.add(emsg);

		//emsg = new ExpjMessage( "ZZ01006", e.toString());
		//sysLog.severe(emsg ,getsysUSER_CD()); //�G�N�Z�v�V�����̏ڍ׏��
		throw ee;
	}

	/**
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W
	 */
	private void setErrorMessage(String code, String key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
	}

	/**
	 * �G���[���b�Z�[�W�ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param �o�̓��b�Z�[�W(List)
	 */
	private void setErrorMessage(String code, List key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
			sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
		}
	}

	/**
	 * �G���[���b�Z�[�W�̐ݒ�
	 * @param ���b�Z�[�W�ԍ�
	 * @param ����1
	 * @param ����2
	 * @param �o�̓��b�Z�[�W�iList�j
	 */
	private void setErrorMessage(String code, String value1, String value2, List key)
	{
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
		sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
			sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
		}
	}
    
    /**
     * �x�����b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �o�̓��b�Z�[�W
     */
    private void setWarnMessage(String messageno)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
     msgStruct.addWarn( emsg );
     sysLog.warning(emsg, getsysUSER_CD());
    }
    
    /**
     * �x�����b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �o�̓��b�Z�[�W
     */
    private void setWarnMessage(String messageno,List key)
    {
        ExpjMessage emsg = new ExpjMessage( messageno );
        msgStruct.addWarn( emsg );
        sysLog.warning(emsg, getsysUSER_CD());
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addWarn( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
			sysLog.warning(emsg, getsysUSER_CD()); //�G���[�ڍ�
		}
    }
//---------- �ǉ��E�X�V���̓��͒l�`�F�b�N--------------------------------------

	/** 
	 * ���͒l�`�F�b�N�B
	 * NOT NULL���ڂɒl�������Ă��Ȃ��ꍇ�A�f�t�H���g�l��ݒ肷��
	 * ��ʔ������A�ŏ���z���ʂ̉ߑ�l�`�F�b�N
	 * @param checkStruct �`�F�b�N�Ώۂ�Struct
	 */
	private void checkStruct(AA0010010Struct checkStruct)
	{
		// ���x���ԍ�
		if(checkStruct.getHIGH_LEVEL_NO() == null
		|| "".equals(checkStruct.getHIGH_LEVEL_NO()))
			checkStruct.setHIGH_LEVEL_NO(AA0010Common._HIGH_LEVEL_NO);

		// �׎p�P�ʐ�
		if(checkStruct.getPKG_UNIT_QTY() == null
		|| "".equals(checkStruct.getPKG_UNIT_QTY()))
			checkStruct.setPKG_UNIT_QTY(AA0010Common._PKG_UNIT_QTY_DB);

		// �i�ڎ�z���[�h�^�C��
		if(checkStruct.getODR_LT() == null
		|| "".equals(checkStruct.getODR_LT()))
			checkStruct.setODR_LT(AA0010Common._ODR_LT);

		// �i�ڌŒ蕪���[�h�^�C��
		if(checkStruct.getFIXED_LT() == null
		|| "".equals(checkStruct.getFIXED_LT()))
			checkStruct.setFIXED_LT(AA0010Common._FIXED_LT);

		// �i�ڔ�ᕪ���[�h�^�C��
		if(checkStruct.getPROP_LT() == null
		|| "".equals(checkStruct.getPROP_LT()))
			checkStruct.setPROP_LT(AA0010Common._PROP_LT);

		// ���S����
		if(checkStruct.getSAFETY_LT() == null
		|| "".equals(checkStruct.getSAFETY_LT()))
			checkStruct.setSAFETY_LT(AA0010Common._SAFETY_LT);

		// ���o���[�h�^�C��
		if(checkStruct.getISSUE_LT() == null
		|| "".equals(checkStruct.getISSUE_LT()))
			checkStruct.setISSUE_LT(AA0010Common._ISSUE_LT);

		// �i�ڔ�ᕪ���b�g�T�C�Y
		if(checkStruct.getPROP_LOT_SIZE() == null
		|| "".equals(checkStruct.getPROP_LOT_SIZE()))
			checkStruct.setPROP_LOT_SIZE(AA0010Common._PROP_LOT_SIZE);

		// �i�ڎd����
		if(checkStruct.getITEM_SPOIL() == null
		|| "".equals(checkStruct.getITEM_SPOIL()))
			checkStruct.setITEM_SPOIL(AA0010Common._ITEM_SPOIL);

		// ���S�݌ɗ�
		if(checkStruct.getSAFETY_STOCK() == null
		|| "".equals(checkStruct.getSAFETY_STOCK()))
			checkStruct.setSAFETY_STOCK(AA0010Common._SAFETY_STOCK);

		// �ő�܂Ƃߊ���
		if(checkStruct.getMAX_PERIOD() == null
		|| "".equals(checkStruct.getMAX_PERIOD()))
			checkStruct.setMAX_PERIOD(AA0010Common._MAX_PERIOD_DB);

		// �ő��z��
		if(checkStruct.getMAX_ODR_QTY() == null
		|| "".equals(checkStruct.getMAX_ODR_QTY()))
			checkStruct.setMAX_ODR_QTY(AA0010Common._MAX_ODR_QTY_DB);

		// �����_�݌ɐ�
		if(checkStruct.getODR_POINT() == null
		|| "".equals(checkStruct.getODR_POINT()))
			checkStruct.setODR_POINT(AA0010Common._ODR_POINT);

		// ��ʔ�����
		if(checkStruct.getFIXED_ODR_QTY() == null
		|| "".equals(checkStruct.getFIXED_ODR_QTY()))
			checkStruct.setFIXED_ODR_QTY(AA0010Common._FIXED_ODR_QTY_DB);

		// �ŏ���z��
		if(checkStruct.getMIN_ODR_QTY() == null
		|| "".equals(checkStruct.getMIN_ODR_QTY()))
			checkStruct.setMIN_ODR_QTY(AA0010Common._MIN_ODR_QTY);

		// �܂�ߒP��
		if(checkStruct.getMUL_ODR_QTY() == null
		|| "".equals(checkStruct.getMUL_ODR_QTY()))
			checkStruct.setMUL_ODR_QTY(AA0010Common._MUL_ODR_QTY_DB);

		// �P�ʏd��
		if(checkStruct.getUNIT_WEIGHT() == null
		|| "".equals(checkStruct.getUNIT_WEIGHT()))
			checkStruct.setUNIT_WEIGHT(AA0010Common._UNIT_WEIGHT);

		// ��ʔ������A�ŏ���z���ʂ̉ߑ�l�`�F�b�N
		if((checkStruct.getMRP_ODR_TYP().intValue() == 6 || checkStruct.getMRP_ODR_TYP().intValue() == 7) && 
				Calculate.compare(checkStruct.getFIXED_ODR_QTY(),"1000000000") >= 0){
			//���[�j���O���b�Z�[�W
			setWarnMessage("AA00213");
		}
		if((checkStruct.getMRP_ODR_TYP().intValue() == 2 || checkStruct.getMRP_ODR_TYP().intValue() == 5) && 
				Calculate.compare(checkStruct.getMIN_ODR_QTY(),"1000000000") >= 0){
			//���[�j���O���b�Z�[�W
			setWarnMessage("AA00214");
		}
		return;
	}

//------------------------------------------------------------------------------

	/* �i�ڎ�z�敪�B 
	 * �X�V���ɕi�ڎ�z�敪�̕ύX�L�����`�F�b�N����ׁB
	*/
	private Integer _OLD_MRP_ODR_TYP = null;

//------------------------------------------------------------------------------

	/** �V�X�e�����O */
	// sysLog = null;

	//------------------------------------------------------------------------
	// �H��R�[�h/���[�U�R�[�h
	public void setPlantCd(String cd){ sysPLANT_CD = cd; };
	public String getPlantCd(){ return sysPLANT_CD; };

	public void setUserCd(String cd){ sysUSER_CD = cd; };
	public String getUserCd() { return sysUSER_CD; };

//------------------------------------------------------------------------------
//	---------- �ǉ��E�X�V���̕��ރ}�X�^�`�F�b�N--------------------------------------

	/** 
	 * ���ޒl�`�F�b�N�B
	 * NOT NULL���ڂɒl�������Ă��Ȃ��ꍇ�A�l�𑶍݃`�F�b�N����
	 * @param Struct �`�F�b�N�Ώۂ�Struct
	 * @throws SQLException 
	 */
	private void checkClass(AA0010010Struct checkStruct) throws SQLException {
		try {
			// �i�ڕ���01�`�F�b�N
			if (checkStruct.getITEM_CLASS_01_CD() != null && !"".equals(checkStruct.getITEM_CLASS_01_CD())) {
				boolean checkResult01 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD01,checkStruct.getITEM_CLASS_01_CD());
				if (!checkResult01) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD01);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_01_NAME("");
				} 
			}
			// �i�ڕ���02�`�F�b�N
			if (struct.getITEM_CLASS_02_CD() != null && !"".equals(checkStruct.getITEM_CLASS_02_CD())) {
				boolean checkResult02 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD02, checkStruct.getITEM_CLASS_02_CD());
				if (!checkResult02) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD02);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_02_NAME("");
				}
			}
			
			// �i�ڕ���03�`�F�b�N
			if (checkStruct.getITEM_CLASS_03_CD() != null && !"".equals(checkStruct.getITEM_CLASS_03_CD())) {
				boolean checkResult03 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD03, checkStruct.getITEM_CLASS_03_CD());
				if (!checkResult03) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD03);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_03_NAME("");
				}
			}
			// �i�ڕ���04�`�F�b�N
			if (checkStruct.getITEM_CLASS_04_CD() != null && !"".equals(checkStruct.getITEM_CLASS_04_CD())) {
				boolean checkResult04 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD04, checkStruct.getITEM_CLASS_04_CD());
				if (!checkResult04) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD04);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_04_NAME("");
				}
			}
			// �i�ڕ���05�`�F�b�N
			if (checkStruct.getITEM_CLASS_05_CD() != null && !"".equals(checkStruct.getITEM_CLASS_05_CD())) {
				boolean checkResult05 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD05, checkStruct.getITEM_CLASS_05_CD());
				if (!checkResult05) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD05);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_05_NAME("");
				}
			}
			// �i�ڕ���06�`�F�b�N
			if (checkStruct.getITEM_CLASS_06_CD() != null && !"".equals(checkStruct.getITEM_CLASS_06_CD())) {
				boolean checkResult06 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD06, checkStruct.getITEM_CLASS_06_CD());
				if (!checkResult06) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD06);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_06_NAME("");
				}
			}	
			// �i�ڕ���07�`�F�b�N
			if (checkStruct.getITEM_CLASS_07_CD() != null && !"".equals(checkStruct.getITEM_CLASS_07_CD())) {
				boolean checkResult07 = ClassMaster.checkMclass(conn, AA0010Common.CLASS_CD,AA0010Common.CLASS_CD07, checkStruct.getITEM_CLASS_07_CD());
				if (!checkResult07) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD07);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_07_NAME("");
				}
			}	
			// �i�ڕ���08�`�F�b�N
			if (checkStruct.getITEM_CLASS_08_CD() != null && !"".equals(checkStruct.getITEM_CLASS_08_CD())) {
				boolean checkResult08 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD08, checkStruct.getITEM_CLASS_08_CD());
				if (!checkResult08) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD08);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_08_NAME("");
				}
			}	
			// �i�ڕ���09�`�F�b�N
			if (checkStruct.getITEM_CLASS_09_CD() != null && !"".equals(checkStruct.getITEM_CLASS_09_CD())) {
				boolean checkResult09 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD09, checkStruct.getITEM_CLASS_09_CD());
				if (!checkResult09) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD09);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_09_NAME("");
				}
			}	
			// �i�ڕ���10�`�F�b�N
			if (checkStruct.getITEM_CLASS_10_CD() != null && !"".equals(checkStruct.getITEM_CLASS_10_CD())) {
				boolean checkResult10 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD10, checkStruct.getITEM_CLASS_10_CD());
				if (!checkResult10) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD10);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_10_NAME("");
				}
			}	
			// �i�ڕ���11�`�F�b�N
			if (checkStruct.getITEM_CLASS_11_CD() != null && !"".equals(checkStruct.getITEM_CLASS_11_CD())) {
				boolean checkResult11 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD11, checkStruct.getITEM_CLASS_11_CD());
				if (!checkResult11) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD11);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_11_NAME("");
				}
			}	
			// �i�ڕ���12�`�F�b�N
			if (checkStruct.getITEM_CLASS_12_CD() != null && !"".equals(checkStruct.getITEM_CLASS_12_CD())) {
				boolean checkResult12 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD12,checkStruct.getITEM_CLASS_12_CD());
				if (!checkResult12) {
					// �G���[���b�Z�W
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD12);
					msgStruct.addError(emsg); // �G���[���b�Z�[�W�Ƃ��ēo�^
					sysLog.warning(emsg, getsysUSER_CD()); // �G���[���e
					checkStruct.setITEM_CLASS_12_NAME("");
				}
			}		
			return;
		} catch (SQLException e) {
			throw e;
		}
	}
		
//20150730 ADD START BY SYSCOM
	/**
	* View�̒l���R���{�{�b�N�X�ɕ\��
	*
	*/
	public ComboStruct createComboData(String createType) throws SQLException, ComboException,Exception {
		
		ComboStruct rCombo = new ComboStruct();	// �R���{�{�b�N�X�f�[�^
		PreparedStatement stmt = null;			// �X�e�[�g�����g
		try{
			List rsetList = null;
			// SQL���s
			switch(Integer.parseInt(createType)){
			case 1:
				rsetList = entity.mV_PJ_CD.read(conn,struct);
				break;
			case 2:
				rsetList = entity.mV_SEG_CONTENTS_1.read(conn,struct);
				break;
			case 3:
				rsetList = entity.mV_SEG_CONTENTS_2.read(conn,struct);
				break;
			case 4:
				rsetList = entity.mV_SEG_CONTENTS_3.read(conn,struct);
				break;
			case 5:
				rsetList = entity.mV_SEG_CONTENTS_4.read(conn,struct);
				break;
			}
			AA0010010Struct tempStruct;
			for(int i=0; i<rsetList.size(); i++) {
				tempStruct = (AA0010010Struct)rsetList.get(i);
				String val = tempStruct.getVALUE();
				String explan = tempStruct.getDISPLAY_NAME();
				rCombo.addData(val, explan);
			}
			// �擾�f�[�^��0�ȉ��̏ꍇ�A��O����
			if (rCombo.size() <= 0){
				throw new ComboException();
			}
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return rCombo;
	}
//20150730 ADD END BY SYSCOM

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//---------------------------------------------------------------------
		String className = "";
		try{
			// �Ǎ��������̃L�[�����N���A
			struct.seth_ITEM_CD("");

			MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0010010","AA0010010Servlet");
			
			// ���F��ʂ́u���F��v�{�^������J�ڂ��鎞
			if("1".equals(struct.geth_APR_ITEM()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){		
				list = mstappr.selectMST_APPR_DETAIL(_APPR_ID);
			}else{
				// ����̓Ǎ��Ə��F��ʂ́u���F�O�v�{�^������J�ڂ��鎞
				list = entity.mselect.read(conn, struct);				
			}

			if (list.size() != 0) {
				// ���F��ʂ́u���F��v�{�^������J�ڂ��鎞
				if("1".equals(struct.geth_APR_ITEM()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){
					MstApprDetailStruct tempStruct = (MstApprDetailStruct) list.get(0);
					list.clear();
					setMoveItem(mstappr,tempStruct);
				}else{
					struct.copy((AA0010010Struct)list.get(0));

					// �i�ڎ�z�敪�擾
					_OLD_MRP_ODR_TYP = new Integer(struct.getMRP_ODR_TYP().intValue());

					// �Ǎ��������̃L�[����ޔ�(�Ǎ�SQL��select���ꂽITEM_CD�Ɠ����̂��̂Ȃ̂ŗ��p���Ă܂�)
					struct.seth_ITEM_CD(struct.getITEM_CD());

					// ������Ԃ��u�Ǎ������v�ɐݒ�
					setReadStatus(NORMAL);
				}
				// �i�ڏ��F
				struct.seth_APR_ITEM(_APPR_ITEM);
			} else {
				//�f�[�^�����݂��Ȃ�
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("ZZ01101", keyMessage);

				// �f�[�^�����݂��Ȃ��ꍇ�̃N���A����
				String w_itemCd = struct.getITEM_CD();	// �L�[���̑ޔ�
				struct.init();							// �\�����ڂ��f�t�H���g�ɖ߂�
				struct.setITEM_CD(w_itemCd);			// �L�[���̐ݒ�

				// ������Ԃ��u������ԁv�ɐݒ�
				setReadStatus(INITIAL);
				// �i�ڏ��F
				struct.seth_APR_ITEM(_APPR_ITEM);
				return;
			}
			//�i�ڕ���01�`12�����ޖ���
			struct.setITEM_CLASS_01_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD01,struct.getITEM_CLASS_01_CD()));
			struct.setITEM_CLASS_02_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD02,struct.getITEM_CLASS_02_CD()));
			struct.setITEM_CLASS_03_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD03,struct.getITEM_CLASS_03_CD()));
			struct.setITEM_CLASS_04_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD04,struct.getITEM_CLASS_04_CD()));
			struct.setITEM_CLASS_05_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD05,struct.getITEM_CLASS_05_CD()));
			struct.setITEM_CLASS_06_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD06,struct.getITEM_CLASS_06_CD()));
			struct.setITEM_CLASS_07_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD07,struct.getITEM_CLASS_07_CD()));
			struct.setITEM_CLASS_08_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD08,struct.getITEM_CLASS_08_CD()));
			struct.setITEM_CLASS_09_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD09,struct.getITEM_CLASS_09_CD()));
			struct.setITEM_CLASS_10_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD10,struct.getITEM_CLASS_10_CD()));
			struct.setITEM_CLASS_11_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD11,struct.getITEM_CLASS_11_CD()));
			struct.setITEM_CLASS_12_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD12,struct.getITEM_CLASS_12_CD()));
			
		}catch(SQLException e){
			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);

			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setSqlExceptionMsg(e, keyMessage);

		}catch(Exception e){
			// ������Ԃ��u�Ǎ����s�v�ɐݒ�
			setReadStatus(ERROR);

			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		//---------------------------------------------------------------------

		try {
			if(!insertCheck()){
				return;
			}

			// ���͒l�`�F�b�N
			checkStruct(struct);

			struct.setHIGH_LEVEL_NO("1");
			
			if("1".equals(struct.geth_APR_ITEM())){	//�i�ڏ��F�̂Ƃ�
				// �i�ڏ��F�̓o�^
				boolean rtn = insertAppr("1");
				if(!rtn) return;		
			}else{				//�i�ڏ��F���Ȃ�	
				entity.minsertM_ITEM.create(conn, struct);

				// ����
				controlselect();					
			}	
			//�R�����g
			conn.commit();	

		}catch(SQLException e){
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setSqlExceptionMsg(e, keyMessage);

		}finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		//---------------------------------------------------------------------

		try {
			conn.beginTransWeb();		// �g�����U�N�V�����J�n
			
			if(!updateCheck()){
				return;
			}

			// ���͒l�`�F�b�N
			checkStruct(struct);

			// ���[�h�^�C���̑Ó����m�F
			if(isValidLT(struct) == false){
				// false�̏ꍇ�́AisValidLT()���Ń��b�Z�[�W�o�͍ς�
			}
			
			if("1".equals(struct.geth_APR_ITEM())){	//�i�ڏ��F
				// ���F���̓o�^
				boolean rtn = insertAppr("2");
				if(!rtn) return;			
			}else{			//�i�ڏ��F���Ȃ�
				entity.mupdateM_ITEM.update(conn, struct);
				// ����
				controlselect();			
			}		
			//�R�����g
			conn.commit();	

		}catch(SQLException e){
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setSqlExceptionMsg(e, keyMessage);

		}finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		//---------------------------------------------------------------------

		try {
			conn.beginTransWeb();

			if(!deleteCheck()){
				return;
			}

			if("1".equals(struct.geth_APR_ITEM())){	//�i�ڏ��F				
				// ���F���̓o�^
				boolean rtn = insertAppr("3");
				if(!rtn) return;	
				controlclear();
			
			}else{
				int cnt = entity.mdeleteM_ITEM.delete(conn, struct);
				if(cnt <= 0){
					// �G���[���b�Z�[�W�쐬
					keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("ZZ06001", keyMessage);

				}else{
					controlclear();
				}
			}
		
			//�R�~�b�g
			conn.commit();

		}catch(SQLException e){
			// �G���[���b�Z�[�W�쐬
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setSqlExceptionMsg(e, keyMessage);

		}finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		//---------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		struct.init();
		// �i�ڏ��F
		struct.seth_APR_ITEM(_APPR_ITEM);

		// ������Ԃ��u������ԁv�ɐݒ�
		setReadStatus(INITIAL);

                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//---------------------------------------------------------------------
		String keyMessage = "";

		try{
//20150730 ADD START BY SYSCOM
			// ��ЃR�[�h�擾
			List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			if(companyList.size() > 0)
			 struct.setCOMPANY_CD(((AA0010010Struct)companyList.get(0)).getCOMPANY_CD());
			sysCOMPANY_CD = struct.getCOMPANY_CD();
//20150730 ADD END BY SYSCOM

			//��ʑJ�ڃp�����[�^���擾
			_SCREENMOVE_TYP = struct.geth_SCREENMOVE_TYP();
			_APPR_ID = struct.geth_APPR_ID();
			
			struct.init();

			// ������Ԃ��u������ԁv�ɐݒ�
			setReadStatus(INITIAL);
            //���b�g�Ǘ��t���O���擾
			boolean lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			if(lotCtrlFlg){
				struct.setLOTCTRLFLG("true");
			}else{
				struct.setLOTCTRLFLG("false");
			}
			
			// �R���{�{�b�N�X�f�[�^�p��
			ComboBox controller = new ComboBox(conn, sysUSER_CD);

			_ISSUE_TYP = controller.getData("ISSUE_TYP");
			_OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
			_STOCK_UNIT_FLG = controller.getData("STOCK_UNIT_FLG");
			_UNIT_QTY_TYP = controller.getData("UNIT_QTY_TYP");
			_MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");
			_LOT_SIZING_TYP = controller.getData("LOT_SIZING_TYP");
// 2008/07/14 SYSCOM ���� ADD START
			_MANHOUR_TYP = controller.getData("MANHOUR_TYP");
// 2008/07/14 SYSCOM ���� ADD END
			_MPS_FLG = controller.getData("MPS_FLG");
			_ACPT_INSPC_TYP = controller.getData("ACPT_INSPC_TYP");
			_PRODUCT_TYP = controller.getData("PRODUCT_TYP");
			_ABC_TYP = controller.getData("ABC_TYP");
			_OPR_RSLT_TYP = controller.getData("OPR_RSLT_TYP");
			_SPL_ITEM_TYP = controller.getData("SPL_ITEM_TYP");
			_STOCK_UNIT = controller.getData("STOCK_UNIT");
			_DEPO_TYP = controller.getData("WH_COND_TYP");
			_LOT_CTRL_FLG = controller.getData("LOT_TYP");
			_LOT_NUMBERING_TYP = controller.getData("LOT_NUMBERING");
//20150730 ADD START BY SYSCOM
			_unitPjCdStruct = createComboData("1");
			_unitSegContent1Struct = createComboData("2");
			_unitSegContent2Struct = createComboData("3");
			_unitSegContent3Struct = createComboData("4");
			_unitSegContent4Struct = createComboData("5");
//20150730 ADD END BY SYSCOM
		    //�i�ڕ���01�`12�����ޖ���
		    _ITEM_CLASS_01_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD01,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_02_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD02,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_03_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD03,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_04_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD04,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_05_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD05,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_06_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD06,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_07_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD07,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_08_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD08,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_09_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD09,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_10_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD10,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_11_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD11,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_12_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD12,AA0010Common.CLASS_CD00);
	        
	        /** �p�����[�^�u�i�ڏ��F�v���擾*/
		    //private PrivateConfig privateConfig;
		    PrivateConfig privateConfig = new PrivateConfig(conn);	        
	        // �i�ڏ��F
		    _APPR_ITEM = privateConfig.getString("APR_ITEM");
	        // �p�����[�^�u�i�ڏ��F�v���擾�ł��Ȃ������ꍇ
			if(_APPR_ITEM ==null || "".equals(_APPR_ITEM)) {
 				String locale = CoreTools.getLocale(struct.getsUser_ID());
 				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
 				ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00088"));
 				msgStruct.addError(emsg);
 				sysLog.warning(emsg, sysUSER_CD);
				struct.seth_APR_ITEM("0");
			} else if("1".equals(_APPR_ITEM)) {
				// �P�̏ꍇ
				struct.seth_APR_ITEM("1");
			} else {
				// �P�ȊO�̏ꍇ
				struct.seth_APR_ITEM("0");
			}
			_APPR_ITEM = struct.geth_APR_ITEM();
            // add �W��G ��
			// ��ʑJ�ڂ̌Ăяo����������AStruct�ɉ�ʑJ�ڃL�[��ݒ肵��controlselect()���Ăяo��
			if ( isScreenMove()== true ) {
				//���F�˗���񂩂�p�����[�^���擾
				if("1".equals(_SCREENMOVE_TYP) || "0".equals(_SCREENMOVE_TYP)){
					struct.setITEM_CD(keyValueMap.get("ITEM_CD").toString());
					struct.seth_SCREENMOVE_TYP(_SCREENMOVE_TYP);
				}
				controlselect();
			}
            // add �W��G ��
    
		}catch(SQLException e){
			// �G���[���b�Z�[�W�쐬
			keyMessage = "";
			setSqlExceptionMsg(e, keyMessage);

		}catch(ComboException e){
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
//20150730 ADD START BY SYSCOM
		catch (Exception e){
			e.printStackTrace();
			throw new ExpjException(e);
		}
//20150730 ADD END BY SYSCOM

		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>

			// �R���{�{�b�N�X�f�[�^�ݒ�
			struct.setList_ISSUE_TYP_val(_ISSUE_TYP.getValList());
			struct.setList_ISSUE_TYP_name(_ISSUE_TYP.getExplanList());
			struct.setList_OUTSIDE_TYP_val(_OUTSIDE_TYP.getValList());
			struct.setList_OUTSIDE_TYP_name(_OUTSIDE_TYP.getExplanList());
			struct.setList_STOCK_UNIT_FLG_val(_STOCK_UNIT_FLG.getValList());
			struct.setList_STOCK_UNIT_FLG_name(_STOCK_UNIT_FLG.getExplanList());
			struct.setList_UNIT_QTY_TYP_val(_UNIT_QTY_TYP.getValList());
			struct.setList_UNIT_QTY_TYP_name(_UNIT_QTY_TYP.getExplanList());
			struct.setList_MRP_ODR_TYP_val(_MRP_ODR_TYP.getValList());
			struct.setList_MRP_ODR_TYP_name(_MRP_ODR_TYP.getExplanList());
			struct.setList_LOT_SIZING_TYP_val(_LOT_SIZING_TYP.getValList());
			struct.setList_LOT_SIZING_TYP_name(_LOT_SIZING_TYP.getExplanList());
// 2008/07/14 SYSCOM ���� ADD START
			struct.setList_MANHOUR_TYP_val(_MANHOUR_TYP.getValList());
			struct.setList_MANHOUR_TYP_name(_MANHOUR_TYP.getExplanList());
// 2008/07/14 SYSCOM ���� ADD END
			struct.setList_MPS_FLG_val(_MPS_FLG.getValList());
			struct.setList_MPS_FLG_name(_MPS_FLG.getExplanList());
			struct.setList_ACPT_INSPC_TYP_val(_ACPT_INSPC_TYP.getValList());
			struct.setList_ACPT_INSPC_TYP_name(_ACPT_INSPC_TYP.getExplanList());
			struct.setList_PRODUCT_TYP_val(_PRODUCT_TYP.getValList());
			struct.setList_PRODUCT_TYP_name(_PRODUCT_TYP.getExplanList());
			struct.setList_ABC_TYP_val(_ABC_TYP.getValList());
			struct.setList_ABC_TYP_name(_ABC_TYP.getExplanList());
			struct.setList_OPR_RSLT_TYP_val(_OPR_RSLT_TYP.getValList());
			struct.setList_OPR_RSLT_TYP_name(_OPR_RSLT_TYP.getExplanList());
			struct.setList_SPL_ITEM_TYP_val(_SPL_ITEM_TYP.getValList());
			struct.setList_SPL_ITEM_TYP_name(_SPL_ITEM_TYP.getExplanList());
			struct.setList_STOCK_UNIT_val(_STOCK_UNIT.getExplanList());
			struct.setList_STOCK_UNIT_name(_STOCK_UNIT.getExplanList());		
			struct.setList_DEPO_TYP_val(_DEPO_TYP.getValList());
			struct.setList_DEPO_TYP_name(_DEPO_TYP.getExplanList());		
			struct.setList_LOT_CTRL_FLG_val(_LOT_CTRL_FLG.getValList());
			struct.setList_LOT_CTRL_FLG_name(_LOT_CTRL_FLG.getExplanList());		
			struct.setList_LOT_NUMBERING_TYP_val(_LOT_NUMBERING_TYP.getValList());
			struct.setList_LOT_NUMBERING_TYP_name(_LOT_NUMBERING_TYP.getExplanList());
//20150730 ADD START BY SYSCOM
			struct.setList_PJ_CD_val(_unitPjCdStruct.getValList());
			struct.setList_PJ_CD_name(_unitPjCdStruct.getExplanList());
			struct.setList_SEG_CONTENTS1_val(_unitSegContent1Struct.getValList());
			struct.setList_SEG_CONTENTS1_name(_unitSegContent1Struct.getExplanList());
			struct.setList_SEG_CONTENTS2_val(_unitSegContent2Struct.getValList());
			struct.setList_SEG_CONTENTS2_name(_unitSegContent2Struct.getExplanList());
			struct.setList_SEG_CONTENTS3_val(_unitSegContent3Struct.getValList());
			struct.setList_SEG_CONTENTS3_name(_unitSegContent3Struct.getExplanList());
			struct.setList_SEG_CONTENTS4_val(_unitSegContent4Struct.getValList());
			struct.setList_SEG_CONTENTS4_name(_unitSegContent4Struct.getExplanList());
//20150730 ADD END BY SYSCOM
			// ���ރ}�X�^��01�`12
			struct.setITEM_CLASS_01_TYP(_ITEM_CLASS_01_TYP);
			struct.setITEM_CLASS_02_TYP(_ITEM_CLASS_02_TYP);
			struct.setITEM_CLASS_03_TYP(_ITEM_CLASS_03_TYP);
			struct.setITEM_CLASS_04_TYP(_ITEM_CLASS_04_TYP);
			struct.setITEM_CLASS_05_TYP(_ITEM_CLASS_05_TYP);
			struct.setITEM_CLASS_06_TYP(_ITEM_CLASS_06_TYP);
			struct.setITEM_CLASS_07_TYP(_ITEM_CLASS_07_TYP);
			struct.setITEM_CLASS_08_TYP(_ITEM_CLASS_08_TYP);
			struct.setITEM_CLASS_09_TYP(_ITEM_CLASS_09_TYP);
			struct.setITEM_CLASS_10_TYP(_ITEM_CLASS_10_TYP);
			struct.setITEM_CLASS_11_TYP(_ITEM_CLASS_11_TYP);
			struct.setITEM_CLASS_12_TYP(_ITEM_CLASS_12_TYP);			
			struct.copy(struct);
  		} catch(AlarmMessageException ame){
			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
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
//			throw new FoundationException("AA0010010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0010010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0010010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0010010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0010010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0010010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0010010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0010010Entity entity;
	protected AA0010010Struct struct;
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

		entity = new AA0010010Entity();
		struct = new AA0010010Struct();

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
	 * AA0010010�N���X�̕W���R���X�g���N�^
	 */
	public AA0010010Control() throws BusinessProcessException, FoundationException
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
				AA0010010Struct key = (AA0010010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ISSUE_TYP_name") && key.getISSUE_TYP_name() != null) {
					msgKey.setKeyValue("ISSUE_TYP_name", key.getISSUE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP_val") && key.getISSUE_TYP_val() != null) {
					msgKey.setKeyValue("ISSUE_TYP_val", key.getISSUE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG_name") && key.getSTOCK_UNIT_FLG_name() != null) {
					msgKey.setKeyValue("STOCK_UNIT_FLG_name", key.getSTOCK_UNIT_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG_val") && key.getSTOCK_UNIT_FLG_val() != null) {
					msgKey.setKeyValue("STOCK_UNIT_FLG_val", key.getSTOCK_UNIT_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_name") && key.getUNIT_QTY_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_name", key.getUNIT_QTY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_val") && key.getUNIT_QTY_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_val", key.getUNIT_QTY_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name") && key.getACPT_INSPC_TYP_name() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_name", key.getACPT_INSPC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val") && key.getACPT_INSPC_TYP_val() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_val", key.getACPT_INSPC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_name") && key.getPRODUCT_TYP_name() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_name", key.getPRODUCT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_val") && key.getPRODUCT_TYP_val() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_val", key.getPRODUCT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP_name") && key.getABC_TYP_name() != null) {
					msgKey.setKeyValue("ABC_TYP_name", key.getABC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP_val") && key.getABC_TYP_val() != null) {
					msgKey.setKeyValue("ABC_TYP_val", key.getABC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_name") && key.getOPR_RSLT_TYP_name() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_name", key.getOPR_RSLT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_val") && key.getOPR_RSLT_TYP_val() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_val", key.getOPR_RSLT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_name") && key.getSPL_ITEM_TYP_name() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_name", key.getSPL_ITEM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_val") && key.getSPL_ITEM_TYP_val() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_val", key.getSPL_ITEM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP_name") && key.getLOT_SIZING_TYP_name() != null) {
					msgKey.setKeyValue("LOT_SIZING_TYP_name", key.getLOT_SIZING_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP_val") && key.getLOT_SIZING_TYP_val() != null) {
					msgKey.setKeyValue("LOT_SIZING_TYP_val", key.getLOT_SIZING_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MPS_FLG_name") && key.getMPS_FLG_name() != null) {
					msgKey.setKeyValue("MPS_FLG_name", key.getMPS_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("MPS_FLG_val") && key.getMPS_FLG_val() != null) {
					msgKey.setKeyValue("MPS_FLG_val", key.getMPS_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_name") && key.getSTOCK_UNIT_name() != null) {
					msgKey.setKeyValue("STOCK_UNIT_name", key.getSTOCK_UNIT_name());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_val") && key.getSTOCK_UNIT_val() != null) {
					msgKey.setKeyValue("STOCK_UNIT_val", key.getSTOCK_UNIT_val());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_TYP") && key.getITEM_CLASS_01_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_01_TYP", key.getITEM_CLASS_01_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_NAME") && key.getITEM_CLASS_01_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_01_NAME", key.getITEM_CLASS_01_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_TYP") && key.getITEM_CLASS_02_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_02_TYP", key.getITEM_CLASS_02_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_NAME") && key.getITEM_CLASS_02_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_02_NAME", key.getITEM_CLASS_02_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_TYP") && key.getITEM_CLASS_03_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_03_TYP", key.getITEM_CLASS_03_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_NAME") && key.getITEM_CLASS_03_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_03_NAME", key.getITEM_CLASS_03_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_TYP") && key.getITEM_CLASS_04_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_04_TYP", key.getITEM_CLASS_04_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_NAME") && key.getITEM_CLASS_04_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_04_NAME", key.getITEM_CLASS_04_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_TYP") && key.getITEM_CLASS_05_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_05_TYP", key.getITEM_CLASS_05_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_NAME") && key.getITEM_CLASS_05_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_05_NAME", key.getITEM_CLASS_05_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_TYP") && key.getITEM_CLASS_06_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_06_TYP", key.getITEM_CLASS_06_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_NAME") && key.getITEM_CLASS_06_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_06_NAME", key.getITEM_CLASS_06_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_TYP") && key.getITEM_CLASS_07_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_07_TYP", key.getITEM_CLASS_07_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_NAME") && key.getITEM_CLASS_07_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_07_NAME", key.getITEM_CLASS_07_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_TYP") && key.getITEM_CLASS_08_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_08_TYP", key.getITEM_CLASS_08_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_NAME") && key.getITEM_CLASS_08_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_08_NAME", key.getITEM_CLASS_08_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_TYP") && key.getITEM_CLASS_09_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_09_TYP", key.getITEM_CLASS_09_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_NAME") && key.getITEM_CLASS_09_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_09_NAME", key.getITEM_CLASS_09_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_TYP") && key.getITEM_CLASS_10_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_10_TYP", key.getITEM_CLASS_10_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_NAME") && key.getITEM_CLASS_10_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_10_NAME", key.getITEM_CLASS_10_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_TYP") && key.getITEM_CLASS_11_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_11_TYP", key.getITEM_CLASS_11_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_NAME") && key.getITEM_CLASS_11_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_11_NAME", key.getITEM_CLASS_11_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_TYP") && key.getITEM_CLASS_12_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_12_TYP", key.getITEM_CLASS_12_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_NAME") && key.getITEM_CLASS_12_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_12_NAME", key.getITEM_CLASS_12_NAME());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP_name") && key.getDEPO_TYP_name() != null) {
					msgKey.setKeyValue("DEPO_TYP_name", key.getDEPO_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP_val") && key.getDEPO_TYP_val() != null) {
					msgKey.setKeyValue("DEPO_TYP_val", key.getDEPO_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_name") && key.getLOT_CTRL_FLG_name() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG_name", key.getLOT_CTRL_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_val") && key.getLOT_CTRL_FLG_val() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG_val", key.getLOT_CTRL_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP_name") && key.getLOT_NUMBERING_TYP_name() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP_name", key.getLOT_NUMBERING_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP_val") && key.getLOT_NUMBERING_TYP_val() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP_val", key.getLOT_NUMBERING_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP_name") && key.getMANHOUR_TYP_name() != null) {
					msgKey.setKeyValue("MANHOUR_TYP_name", key.getMANHOUR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP_val") && key.getMANHOUR_TYP_val() != null) {
					msgKey.setKeyValue("MANHOUR_TYP_val", key.getMANHOUR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_APR_ITEM") && key.geth_APR_ITEM() != null) {
					msgKey.setKeyValue("h_APR_ITEM", key.geth_APR_ITEM());
				}
				if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP") && key.geth_SCREENMOVE_TYP() != null) {
					msgKey.setKeyValue("h_SCREENMOVE_TYP", key.geth_SCREENMOVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD_name") && key.getPJ_CD_name() != null) {
					msgKey.setKeyValue("PJ_CD_name", key.getPJ_CD_name());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD_val") && key.getPJ_CD_val() != null) {
					msgKey.setKeyValue("PJ_CD_val", key.getPJ_CD_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_name") && key.getSEG_CONTENTS1_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1_name", key.getSEG_CONTENTS1_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_val") && key.getSEG_CONTENTS1_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1_val", key.getSEG_CONTENTS1_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_name") && key.getSEG_CONTENTS2_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2_name", key.getSEG_CONTENTS2_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_val") && key.getSEG_CONTENTS2_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2_val", key.getSEG_CONTENTS2_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_name") && key.getSEG_CONTENTS3_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3_name", key.getSEG_CONTENTS3_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_val") && key.getSEG_CONTENTS3_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3_val", key.getSEG_CONTENTS3_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_name") && key.getSEG_CONTENTS4_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4_name", key.getSEG_CONTENTS4_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_val") && key.getSEG_CONTENTS4_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4_val", key.getSEG_CONTENTS4_val());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SUM_PROP_LT") && key.getSUM_PROP_LT() != null) {
					msgKey.setKeyValue("SUM_PROP_LT", key.getSUM_PROP_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("SUM_FIXED_LT") && key.getSUM_FIXED_LT() != null) {
					msgKey.setKeyValue("SUM_FIXED_LT", key.getSUM_FIXED_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("LOTCTRLFLG") && key.getLOTCTRLFLG() != null) {
					msgKey.setKeyValue("LOTCTRLFLG", key.getLOTCTRLFLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
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
				if(msgKeyType.containsKeyColumn("HIGH_LEVEL_NO") && key.getHIGH_LEVEL_NO() != null) {
					msgKey.setKeyValue("HIGH_LEVEL_NO", key.getHIGH_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG") && key.getSTOCK_UNIT_FLG() != null) {
					msgKey.setKeyValue("STOCK_UNIT_FLG", key.getSTOCK_UNIT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT") && key.getPKG_UNIT() != null) {
					msgKey.setKeyValue("PKG_UNIT", key.getPKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY") && key.getPKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("PKG_UNIT_QTY", key.getPKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ODR_LT") && key.getODR_LT() != null) {
					msgKey.setKeyValue("ODR_LT", key.getODR_LT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_LT") && key.getISSUE_LT() != null) {
					msgKey.setKeyValue("ISSUE_LT", key.getISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_STOCK") && key.getSAFETY_STOCK() != null) {
					msgKey.setKeyValue("SAFETY_STOCK", key.getSAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP") && key.getLOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("LOT_SIZING_TYP", key.getLOT_SIZING_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("MAX_PERIOD") && key.getMAX_PERIOD() != null) {
					msgKey.setKeyValue("MAX_PERIOD", key.getMAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("FIXED_ODR_QTY") && key.getFIXED_ODR_QTY() != null) {
					msgKey.setKeyValue("FIXED_ODR_QTY", key.getFIXED_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MAX_ODR_QTY") && key.getMAX_ODR_QTY() != null) {
					msgKey.setKeyValue("MAX_ODR_QTY", key.getMAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MIN_ODR_QTY") && key.getMIN_ODR_QTY() != null) {
					msgKey.setKeyValue("MIN_ODR_QTY", key.getMIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_POINT") && key.getODR_POINT() != null) {
					msgKey.setKeyValue("ODR_POINT", key.getODR_POINT());
				}
				if(msgKeyType.containsKeyColumn("MUL_ODR_QTY") && key.getMUL_ODR_QTY() != null) {
					msgKey.setKeyValue("MUL_ODR_QTY", key.getMUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MPS_FLG") && key.getMPS_FLG() != null) {
					msgKey.setKeyValue("MPS_FLG", key.getMPS_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_WEIGHT") && key.getUNIT_WEIGHT() != null) {
					msgKey.setKeyValue("UNIT_WEIGHT", key.getUNIT_WEIGHT());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP") && key.getABC_TYP() != null) {
					msgKey.setKeyValue("ABC_TYP", key.getABC_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME") && key.getTAX_NAME() != null) {
					msgKey.setKeyValue("TAX_NAME", key.getTAX_NAME());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("CAL_NAME") && key.getCAL_NAME() != null) {
					msgKey.setKeyValue("CAL_NAME", key.getCAL_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_CD") && key.getITEM_CLASS_01_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_01_CD", key.getITEM_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_CD") && key.getITEM_CLASS_02_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_02_CD", key.getITEM_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_CD") && key.getITEM_CLASS_03_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_03_CD", key.getITEM_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_CD") && key.getITEM_CLASS_04_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_04_CD", key.getITEM_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_CD") && key.getITEM_CLASS_05_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_05_CD", key.getITEM_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_CD") && key.getITEM_CLASS_06_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_06_CD", key.getITEM_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_CD") && key.getITEM_CLASS_07_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_07_CD", key.getITEM_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_CD") && key.getITEM_CLASS_08_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_08_CD", key.getITEM_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_CD") && key.getITEM_CLASS_09_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_09_CD", key.getITEM_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_CD") && key.getITEM_CLASS_10_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_10_CD", key.getITEM_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_CD") && key.getITEM_CLASS_11_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_11_CD", key.getITEM_CLASS_11_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_CD") && key.getITEM_CLASS_12_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_12_CD", key.getITEM_CLASS_12_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_YEAR") && key.getBEST_BEFORE_YEAR() != null) {
					msgKey.setKeyValue("BEST_BEFORE_YEAR", key.getBEST_BEFORE_YEAR());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_MONTH") && key.getBEST_BEFORE_MONTH() != null) {
					msgKey.setKeyValue("BEST_BEFORE_MONTH", key.getBEST_BEFORE_MONTH());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DAY") && key.getBEST_BEFORE_DAY() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DAY", key.getBEST_BEFORE_DAY());
				}
				if(msgKeyType.containsKeyColumn("REMARK1") && key.getREMARK1() != null) {
					msgKey.setKeyValue("REMARK1", key.getREMARK1());
				}
				if(msgKeyType.containsKeyColumn("REMARK2") && key.getREMARK2() != null) {
					msgKey.setKeyValue("REMARK2", key.getREMARK2());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("DEPT_CD") && key.getDEPT_CD() != null) {
					msgKey.setKeyValue("DEPT_CD", key.getDEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPT_NAME") && key.getDEPT_NAME() != null) {
					msgKey.setKeyValue("DEPT_NAME", key.getDEPT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD") && key.getPJ_CD() != null) {
					msgKey.setKeyValue("PJ_CD", key.getPJ_CD());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1") && key.getSEG_CONTENTS1() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1", key.getSEG_CONTENTS1());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2") && key.getSEG_CONTENTS2() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2", key.getSEG_CONTENTS2());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3") && key.getSEG_CONTENTS3() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3", key.getSEG_CONTENTS3());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4") && key.getSEG_CONTENTS4() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4", key.getSEG_CONTENTS4());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("uMRP_ODR_TYP_DISPLAY_NAME") && key.getuMRP_ODR_TYP_DISPLAY_NAME() != null) {
					msgKey.setKeyValue("uMRP_ODR_TYP_DISPLAY_NAME", key.getuMRP_ODR_TYP_DISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("uMRP_ODR_TYP_VALUE") && key.getuMRP_ODR_TYP_VALUE() != null) {
					msgKey.setKeyValue("uMRP_ODR_TYP_VALUE", key.getuMRP_ODR_TYP_VALUE());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
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
					AA0010010Struct key = new AA0010010Struct();
					if(msgKeyType.containsKeyColumn("ISSUE_TYP_name")) {
						key.setISSUE_TYP_name(msgKey.getKeyValue("ISSUE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP_val")) {
						key.setISSUE_TYP_val(msgKey.getKeyValue("ISSUE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG_name")) {
						key.setSTOCK_UNIT_FLG_name(msgKey.getKeyValue("STOCK_UNIT_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG_val")) {
						key.setSTOCK_UNIT_FLG_val(msgKey.getKeyValue("STOCK_UNIT_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_name")) {
						key.setUNIT_QTY_TYP_name(msgKey.getKeyValue("UNIT_QTY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_val")) {
						key.setUNIT_QTY_TYP_val(msgKey.getKeyValue("UNIT_QTY_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(msgKey.getKeyValue("MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name")) {
						key.setACPT_INSPC_TYP_name(msgKey.getKeyValue("ACPT_INSPC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val")) {
						key.setACPT_INSPC_TYP_val(msgKey.getKeyValue("ACPT_INSPC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_name")) {
						key.setPRODUCT_TYP_name(msgKey.getKeyValue("PRODUCT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_val")) {
						key.setPRODUCT_TYP_val(msgKey.getKeyValue("PRODUCT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP_name")) {
						key.setABC_TYP_name(msgKey.getKeyValue("ABC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP_val")) {
						key.setABC_TYP_val(msgKey.getKeyValue("ABC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_name")) {
						key.setOPR_RSLT_TYP_name(msgKey.getKeyValue("OPR_RSLT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_val")) {
						key.setOPR_RSLT_TYP_val(msgKey.getKeyValue("OPR_RSLT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_name")) {
						key.setSPL_ITEM_TYP_name(msgKey.getKeyValue("SPL_ITEM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_val")) {
						key.setSPL_ITEM_TYP_val(msgKey.getKeyValue("SPL_ITEM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP_name")) {
						key.setLOT_SIZING_TYP_name(msgKey.getKeyValue("LOT_SIZING_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP_val")) {
						key.setLOT_SIZING_TYP_val(msgKey.getKeyValue("LOT_SIZING_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MPS_FLG_name")) {
						key.setMPS_FLG_name(msgKey.getKeyValue("MPS_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("MPS_FLG_val")) {
						key.setMPS_FLG_val(msgKey.getKeyValue("MPS_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_name")) {
						key.setSTOCK_UNIT_name(msgKey.getKeyValue("STOCK_UNIT_name"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_val")) {
						key.setSTOCK_UNIT_val(msgKey.getKeyValue("STOCK_UNIT_val"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_TYP")) {
						key.setITEM_CLASS_01_TYP(msgKey.getKeyValue("ITEM_CLASS_01_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_NAME")) {
						key.setITEM_CLASS_01_NAME(msgKey.getKeyValue("ITEM_CLASS_01_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_TYP")) {
						key.setITEM_CLASS_02_TYP(msgKey.getKeyValue("ITEM_CLASS_02_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_NAME")) {
						key.setITEM_CLASS_02_NAME(msgKey.getKeyValue("ITEM_CLASS_02_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_TYP")) {
						key.setITEM_CLASS_03_TYP(msgKey.getKeyValue("ITEM_CLASS_03_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_NAME")) {
						key.setITEM_CLASS_03_NAME(msgKey.getKeyValue("ITEM_CLASS_03_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_TYP")) {
						key.setITEM_CLASS_04_TYP(msgKey.getKeyValue("ITEM_CLASS_04_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_NAME")) {
						key.setITEM_CLASS_04_NAME(msgKey.getKeyValue("ITEM_CLASS_04_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_TYP")) {
						key.setITEM_CLASS_05_TYP(msgKey.getKeyValue("ITEM_CLASS_05_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_NAME")) {
						key.setITEM_CLASS_05_NAME(msgKey.getKeyValue("ITEM_CLASS_05_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_TYP")) {
						key.setITEM_CLASS_06_TYP(msgKey.getKeyValue("ITEM_CLASS_06_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_NAME")) {
						key.setITEM_CLASS_06_NAME(msgKey.getKeyValue("ITEM_CLASS_06_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_TYP")) {
						key.setITEM_CLASS_07_TYP(msgKey.getKeyValue("ITEM_CLASS_07_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_NAME")) {
						key.setITEM_CLASS_07_NAME(msgKey.getKeyValue("ITEM_CLASS_07_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_TYP")) {
						key.setITEM_CLASS_08_TYP(msgKey.getKeyValue("ITEM_CLASS_08_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_NAME")) {
						key.setITEM_CLASS_08_NAME(msgKey.getKeyValue("ITEM_CLASS_08_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_TYP")) {
						key.setITEM_CLASS_09_TYP(msgKey.getKeyValue("ITEM_CLASS_09_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_NAME")) {
						key.setITEM_CLASS_09_NAME(msgKey.getKeyValue("ITEM_CLASS_09_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_TYP")) {
						key.setITEM_CLASS_10_TYP(msgKey.getKeyValue("ITEM_CLASS_10_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_NAME")) {
						key.setITEM_CLASS_10_NAME(msgKey.getKeyValue("ITEM_CLASS_10_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_TYP")) {
						key.setITEM_CLASS_11_TYP(msgKey.getKeyValue("ITEM_CLASS_11_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_NAME")) {
						key.setITEM_CLASS_11_NAME(msgKey.getKeyValue("ITEM_CLASS_11_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_TYP")) {
						key.setITEM_CLASS_12_TYP(msgKey.getKeyValue("ITEM_CLASS_12_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_NAME")) {
						key.setITEM_CLASS_12_NAME(msgKey.getKeyValue("ITEM_CLASS_12_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP_name")) {
						key.setDEPO_TYP_name(msgKey.getKeyValue("DEPO_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP_val")) {
						key.setDEPO_TYP_val(msgKey.getKeyValue("DEPO_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_name")) {
						key.setLOT_CTRL_FLG_name(msgKey.getKeyValue("LOT_CTRL_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_val")) {
						key.setLOT_CTRL_FLG_val(msgKey.getKeyValue("LOT_CTRL_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP_name")) {
						key.setLOT_NUMBERING_TYP_name(msgKey.getKeyValue("LOT_NUMBERING_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP_val")) {
						key.setLOT_NUMBERING_TYP_val(msgKey.getKeyValue("LOT_NUMBERING_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP_name")) {
						key.setMANHOUR_TYP_name(msgKey.getKeyValue("MANHOUR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP_val")) {
						key.setMANHOUR_TYP_val(msgKey.getKeyValue("MANHOUR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_ITEM")) {
						key.seth_APR_ITEM(msgKey.getKeyValue("h_APR_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP")) {
						key.seth_SCREENMOVE_TYP(msgKey.getKeyValue("h_SCREENMOVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD_name")) {
						key.setPJ_CD_name(msgKey.getKeyValue("PJ_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD_val")) {
						key.setPJ_CD_val(msgKey.getKeyValue("PJ_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_name")) {
						key.setSEG_CONTENTS1_name(msgKey.getKeyValue("SEG_CONTENTS1_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_val")) {
						key.setSEG_CONTENTS1_val(msgKey.getKeyValue("SEG_CONTENTS1_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_name")) {
						key.setSEG_CONTENTS2_name(msgKey.getKeyValue("SEG_CONTENTS2_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_val")) {
						key.setSEG_CONTENTS2_val(msgKey.getKeyValue("SEG_CONTENTS2_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_name")) {
						key.setSEG_CONTENTS3_name(msgKey.getKeyValue("SEG_CONTENTS3_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_val")) {
						key.setSEG_CONTENTS3_val(msgKey.getKeyValue("SEG_CONTENTS3_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_name")) {
						key.setSEG_CONTENTS4_name(msgKey.getKeyValue("SEG_CONTENTS4_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_val")) {
						key.setSEG_CONTENTS4_val(msgKey.getKeyValue("SEG_CONTENTS4_val"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUM_PROP_LT")) {
						key.setSUM_PROP_LT(new Integer(msgKey.getKeyValue("SUM_PROP_LT")));
					}
					if(msgKeyType.containsKeyColumn("SUM_FIXED_LT")) {
						key.setSUM_FIXED_LT(new Integer(msgKey.getKeyValue("SUM_FIXED_LT")));
					}
					if(msgKeyType.containsKeyColumn("LOTCTRLFLG")) {
						key.setLOTCTRLFLG(msgKey.getKeyValue("LOTCTRLFLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("HIGH_LEVEL_NO")) {
						key.setHIGH_LEVEL_NO(msgKey.getKeyValue("HIGH_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(new Integer(msgKey.getKeyValue("ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG")) {
						key.setSTOCK_UNIT_FLG(new Integer(msgKey.getKeyValue("STOCK_UNIT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT")) {
						key.setPKG_UNIT(msgKey.getKeyValue("PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY")) {
						key.setPKG_UNIT_QTY(msgKey.getKeyValue("PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ODR_LT")) {
						key.setODR_LT(msgKey.getKeyValue("ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_LT")) {
						key.setISSUE_LT(msgKey.getKeyValue("ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_STOCK")) {
						key.setSAFETY_STOCK(msgKey.getKeyValue("SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP")) {
						key.setLOT_SIZING_TYP(new Integer(msgKey.getKeyValue("LOT_SIZING_TYP")));
					}
					if(msgKeyType.containsKeyColumn("MAX_PERIOD")) {
						key.setMAX_PERIOD(msgKey.getKeyValue("MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_ODR_QTY")) {
						key.setFIXED_ODR_QTY(msgKey.getKeyValue("FIXED_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MAX_ODR_QTY")) {
						key.setMAX_ODR_QTY(msgKey.getKeyValue("MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MIN_ODR_QTY")) {
						key.setMIN_ODR_QTY(msgKey.getKeyValue("MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_POINT")) {
						key.setODR_POINT(msgKey.getKeyValue("ODR_POINT"));
					}
					if(msgKeyType.containsKeyColumn("MUL_ODR_QTY")) {
						key.setMUL_ODR_QTY(msgKey.getKeyValue("MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MPS_FLG")) {
						key.setMPS_FLG(new Integer(msgKey.getKeyValue("MPS_FLG")));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(new Integer(msgKey.getKeyValue("ACPT_INSPC_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(new Integer(msgKey.getKeyValue("PRODUCT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_WEIGHT")) {
						key.setUNIT_WEIGHT(msgKey.getKeyValue("UNIT_WEIGHT"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP")) {
						key.setABC_TYP(new Integer(msgKey.getKeyValue("ABC_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(new Integer(msgKey.getKeyValue("OPR_RSLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(new Integer(msgKey.getKeyValue("SPL_ITEM_TYP")));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME")) {
						key.setTAX_NAME(msgKey.getKeyValue("TAX_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(new Integer(msgKey.getKeyValue("CAL_NO")));
					}
					if(msgKeyType.containsKeyColumn("CAL_NAME")) {
						key.setCAL_NAME(msgKey.getKeyValue("CAL_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_CD")) {
						key.setITEM_CLASS_01_CD(msgKey.getKeyValue("ITEM_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_CD")) {
						key.setITEM_CLASS_02_CD(msgKey.getKeyValue("ITEM_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_CD")) {
						key.setITEM_CLASS_03_CD(msgKey.getKeyValue("ITEM_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_CD")) {
						key.setITEM_CLASS_04_CD(msgKey.getKeyValue("ITEM_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_CD")) {
						key.setITEM_CLASS_05_CD(msgKey.getKeyValue("ITEM_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_CD")) {
						key.setITEM_CLASS_06_CD(msgKey.getKeyValue("ITEM_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_CD")) {
						key.setITEM_CLASS_07_CD(msgKey.getKeyValue("ITEM_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_CD")) {
						key.setITEM_CLASS_08_CD(msgKey.getKeyValue("ITEM_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_CD")) {
						key.setITEM_CLASS_09_CD(msgKey.getKeyValue("ITEM_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_CD")) {
						key.setITEM_CLASS_10_CD(msgKey.getKeyValue("ITEM_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_CD")) {
						key.setITEM_CLASS_11_CD(msgKey.getKeyValue("ITEM_CLASS_11_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_CD")) {
						key.setITEM_CLASS_12_CD(msgKey.getKeyValue("ITEM_CLASS_12_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(new Integer(msgKey.getKeyValue("DEPO_TYP")));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(new Integer(msgKey.getKeyValue("LOT_CTRL_FLG")));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(new Integer(msgKey.getKeyValue("LOT_NUMBERING_TYP")));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_YEAR")) {
						key.setBEST_BEFORE_YEAR(msgKey.getKeyValue("BEST_BEFORE_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_MONTH")) {
						key.setBEST_BEFORE_MONTH(msgKey.getKeyValue("BEST_BEFORE_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DAY")) {
						key.setBEST_BEFORE_DAY(msgKey.getKeyValue("BEST_BEFORE_DAY"));
					}
					if(msgKeyType.containsKeyColumn("REMARK1")) {
						key.setREMARK1(msgKey.getKeyValue("REMARK1"));
					}
					if(msgKeyType.containsKeyColumn("REMARK2")) {
						key.setREMARK2(msgKey.getKeyValue("REMARK2"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(new Integer(msgKey.getKeyValue("MANHOUR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("DEPT_CD")) {
						key.setDEPT_CD(msgKey.getKeyValue("DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPT_NAME")) {
						key.setDEPT_NAME(msgKey.getKeyValue("DEPT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD")) {
						key.setPJ_CD(msgKey.getKeyValue("PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1")) {
						key.setSEG_CONTENTS1(msgKey.getKeyValue("SEG_CONTENTS1"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2")) {
						key.setSEG_CONTENTS2(msgKey.getKeyValue("SEG_CONTENTS2"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3")) {
						key.setSEG_CONTENTS3(msgKey.getKeyValue("SEG_CONTENTS3"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4")) {
						key.setSEG_CONTENTS4(msgKey.getKeyValue("SEG_CONTENTS4"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("uMRP_ODR_TYP_DISPLAY_NAME")) {
						key.setuMRP_ODR_TYP_DISPLAY_NAME(msgKey.getKeyValue("uMRP_ODR_TYP_DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("uMRP_ODR_TYP_VALUE")) {
						key.setuMRP_ODR_TYP_VALUE(msgKey.getKeyValue("uMRP_ODR_TYP_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
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
