/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0190/src/com/nec/jp/orteus/metamorBase/AA0190/AA0190010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0190;

import com.nec.jp.orteus.metamorBase.AA0190.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AA0190010Control �N���X
 * �t�@�C���E�N���X����
 * @author ������ (NES�ϓ�)$
 * @version $Revision: 1.9 $ $Date: 2017/01/09 08:38:50 $
 *
 */
//}}user_implement_code_header

public class AA0190010Control
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
	public AA0190010Struct getListvalue(int x) { return (AA0190010Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public AA0190010Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public AA0190010Struct createStruct() { return new AA0190010Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((AA0190010Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

   /**
	* CommonCheck
	* @param AA0190010Struct
	* @return boolean
	*/
	public boolean commonCheck(AA0190010Struct chstruct) throws BusinessProcessException, FoundationException{
		boolean bCheck = true;
		int iDelCHK = 0;
        
        if (chstruct.getList_CLASS_CD3() != null){
		for (int i=0;i<(chstruct.getList_CLASS_CD3()).size();i++ ){
			String strCLASS_CD3 = (chstruct.getList_CLASS_CD3()).get(i).toString();
			String strCLASS_NAME3 = (chstruct.getList_CLASS_NAME3()).get(i).toString();
			int num = 0;	
			
			// �����͂̍s
			if ((("").equals(strCLASS_CD3)) && (("").equals(strCLASS_NAME3))){
				iDelCHK++;
				continue;
			}

			// �����ޖ��̂����͂���Ă��܂���B
			if ((!("").equals(strCLASS_CD3)) && ((" ").equals(strCLASS_NAME3) || ("").equals(strCLASS_NAME3))){
				ExpjMessage emsg = new ExpjMessage( "AA20006" );
				msgStruct.addError( emsg );
				bCheck = false;
				break;
			}
			// �����ނ����͂���Ă��܂���B
			if ((!("").equals(strCLASS_NAME3)) && (("").equals(strCLASS_CD3) || ("").equals(strCLASS_CD3))){
				ExpjMessage emsg = new ExpjMessage( "AA20007" );
				msgStruct.addError( emsg );
				bCheck = false;
				break;
			}
			// �����ނ� 00 �͓��͂ł��܂���B
			if ((!("").equals(strCLASS_NAME3)) && ("00").equals(strCLASS_CD3)){
				ExpjMessage emsg = new ExpjMessage( "AA20008" );
				msgStruct.addError( emsg );
				bCheck = false;
				break;
			}
			
			for (int j = 0;j<(chstruct.getList_CLASS_CD3()).size() ;j++ ){
				// �����ނ��d�����Ă��܂�
				if ((strCLASS_CD3).equals((chstruct.getList_CLASS_CD3()).get(j).toString())){
					num++;
				}
				if (num>1){
					ExpjMessage emsg = new ExpjMessage( "AA20009" );
					msgStruct.addError( emsg );
					bCheck = false;
					return bCheck;
				}
			}
		}
      }
		return bCheck;
        
	}
	/**
	 * ���Ӑ�}�X�^�ɏ����ނ����݂��邩�`�F�b�N���܂��B
	 * 
	 * @param strCLASS_CD2 �����ރR�[�h
	 * @param strCLASS_CD3 �����ރR�[�h
	 * @return isExist �itrue:���݂���Afalse:���݂��Ȃ��j
	 * @throws SQLException 
	 * @throws FoundationException 
	 *
	 */
	private boolean isExistM_CUST(String strCLASS_CD2, String strCLASS_CD3) 
					throws FoundationException, SQLException {
		
		// ���Ӑ敪��
		String CustClassTyp = AA0190Const.CLASS_01 + strCLASS_CD2;

		// ���Ӑ�}�X�^���݃t���O(true:���݂���)
		boolean isExist = false;
		
			if (CustClassTyp.equals(AA0190Const.CUST_CLASS_01_TYP)) {
				// ���Ӑ敪�ނ�"1001"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_01_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_01.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_02_TYP)) {
				// ���Ӑ敪�ނ�"1002"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_02_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_02.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_03_TYP)) {
				// ���Ӑ敪�ނ�"1003"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_03_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_03.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_04_TYP)) {
				// ���Ӑ敪�ނ�"1004"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_04_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_04.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_05_TYP)) {
				// ���Ӑ敪�ނ�"1005"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_05_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_05.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_06_TYP)) {
				// ���Ӑ敪�ނ�"1006"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_06_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_06.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_07_TYP)) {
				// ���Ӑ敪�ނ�"1007"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_07_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_07.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_08_TYP)) {
				// ���Ӑ敪�ނ�"1008"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_08_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_08.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_09_TYP)) {
				// ���Ӑ敪�ނ�"1009"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_09_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_09.check(conn, param);				
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_10_TYP)) {
				// ���Ӑ敪�ނ�"1010"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_10_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_10.check(conn, param);
			} 
					
		return isExist;

	}
	
	/**
	 * �����}�X�^�ɏ����ނ����݂��邩�`�F�b�N���܂��B
	 * 
	 * @param strCLASS_CD2 �����ރR�[�h
	 * @param strCLASS_CD3 �����ރR�[�h
	 * @return isExist �itrue:���݂���Afalse:���݂��Ȃ��j
	 * @throws SQLException 
	 * @throws FoundationException 
	 *
	 */
	private boolean isExistM_VEND_CTRL(String strCLASS_CD2, String strCLASS_CD3) 
				throws FoundationException, SQLException {
		
		// ����敪��
		String CustClassTyp = AA0190Const.CLASS_02 + strCLASS_CD2;

		// �����}�X�^���݃t���O(true:���݂���)
		boolean isExist = false;
		
			if (CustClassTyp.equals(AA0190Const.VEND_CLASS_01_TYP)) {
				// ����敪�ނ�"2001"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_01_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_01.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_02_TYP)) {
				// ����敪�ނ�"2002"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_02_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_02.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_03_TYP)) {
				// ����敪�ނ�"2003"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_03_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_03.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_04_TYP)) {
				// ����敪�ނ�"2004"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_04_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_04.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_05_TYP)) {
				// ����敪�ނ�"2005"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_05_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_05.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_06_TYP)) {
				// ����敪�ނ�"2006"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_06_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_06.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_07_TYP)) {
				// ����敪�ނ�"2007"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_07_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_07.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_08_TYP)) {
				// ����敪�ނ�"2008"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_08_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_08.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_09_TYP)) {
				// ����敪�ނ�"2009"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_09_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_09.check(conn, param);				
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_10_TYP)) {
				// ����敪�ނ�"2010"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_10_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_10.check(conn, param);
			} 
					
		return isExist;

	}

	/**
	 * �i�ڃ}�X�^�ɏ����ނ����݂��邩�`�F�b�N���܂��B
	 * 
	 * @param strCLASS_CD2 �����ރR�[�h
	 * @param strCLASS_CD3 �����ރR�[�h
	 * @return isExist �itrue:���݂���Afalse:���݂��Ȃ��j
	 * @throws SQLException 
	 * @throws FoundationException 
	 *
	 */
	private boolean isExistM_ITEM(String strCLASS_CD2, String strCLASS_CD3) 
					throws FoundationException, SQLException {
		
		// �i�ڕ���
		String CustClassTyp = AA0190Const.CLASS_03 + strCLASS_CD2;

		// �i�ڃ}�X�^���݃t���O(true:���݂���)
		boolean isExist = false;
		
			if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_01_TYP)) {
				// �i�ڕ��ނ�"3001"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_01_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_01.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_02_TYP)) {
				// �i�ڕ��ނ�"3002"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_02_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_02.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_03_TYP)) {
				// �i�ڕ��ނ�"3003"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_03_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_03.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_04_TYP)) {
				// �i�ڕ��ނ�"3004"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_04_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_04.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_05_TYP)) {
				// �i�ڕ��ނ�"3005"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_05_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_05.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_06_TYP)) {
				// �i�ڕ��ނ�"3006"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_06_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_06.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_07_TYP)) {
				// �i�ڕ��ނ�"3007"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_07_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_07.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_08_TYP)) {
				// �i�ڕ��ނ�"3008"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_08_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_08.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_09_TYP)) {
				// �i�ڕ��ނ�"3009"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_09_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_09.check(conn, param);				
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_10_TYP)) {
				// �i�ڕ��ނ�"3010"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_10_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_10.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_11_TYP)) {
				// �i�ڕ��ނ�"3011"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_11_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_11.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_12_TYP)) {
				// �i�ڕ��ނ�"3012"�̂Ƃ�
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_12_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_12.check(conn, param);
			} 
					
		return isExist;

	}
	
	/**
	 * ��ʂ̃f�[�^��ۑ�����
	 * @param dataStruct
	 */
	private void setData(AA0190010Struct dataStruct){
		List tempList = new ArrayList();
		for(int i = 0; i < list.size(); i++){
			AA0190010Struct tempStruct = new AA0190010Struct();
			AA0190010Struct listStruct = (AA0190010Struct)list.get(i);
			tempStruct.setCLASS_CD3(dataStruct.getList_CLASS_CD3().get(i).toString());	//�����ރR�[�h
			tempStruct.setCLASS_NAME3(dataStruct.getList_CLASS_NAME3().get(i).toString());	//�����ޖ�
			if(!"true".equals(listStruct.getWriteStatus().toString())){
				tempStruct.setWriteStatus("false");	//EDIT�t���O
			} else {
				tempStruct.setWriteStatus("true");
			}
			if(dataStruct.getList_MODIFY_COUNT_CD3().get(i) != null && !"".equals(dataStruct.getList_MODIFY_COUNT_CD3().get(i))){
				tempStruct.setMODIFY_COUNT_CD3(dataStruct.getList_MODIFY_COUNT_CD3().get(i).toString());	//�X�V��
			}			
			
			tempList.add(tempStruct);
		}
		setList(tempList);
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
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try{
			// ������
			setReadStatus(INITIAL);
			if (list != null) {
				list.clear();
			} else {
				list = new ArrayList(0);
			}

			// �O���b�h�̎c��͒ǉ��p
			AA0190010Struct addStruct = new AA0190010Struct();
			addStruct.setCLASS_CD3(null);
			addStruct.setCLASS_NAME3(null);
			addStruct.setWriteStatus("true");			
			
			AA0190010Struct tempStruct ;
			// �\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[�p
			int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine !=0){
				struct.setROW_COUNT(String.valueOf(maxLine));
			}else{
				struct.setROW_COUNT(null);
			}
			
            // �����ޖ��̂ɓǍ�����p
			list = entity.mCLASS_CD3Cnt.read(conn, struct);			
			long rowCount = Long.parseLong(((AA0190010Struct) list.get(0)).getl_COUNT());
			
          //�\���s�������l(SYS_SCREEN_PARM)�𒴂����ꍇ�G���[
			if ((maxLine != 0) && (rowCount == maxLine+1)) {
           		ExpjMessage emsg;
           		emsg = new ExpjMessage("ZZ01115",String.valueOf(maxLine));
           		msgStruct.addError(emsg);
           		sysLog.warning(emsg, getsysUSER_CD());
				setList(null);
				setReadStatus(TOO_MANY);
				return;
			}else{
                if(rowCount == 0){
                 // ������Ԃ��u�O���Ǎ��v�ɐݒ�
                 setReadStatus(NOT_FOUND);
                 if (list != null){
                	 list.clear();                	 
                 }
                } else {
                 // �����ޖ��̂ɓǍ�����p
        		list = entity.mCLASS_CD3.read(conn, struct);
                 // ������Ԃ��u�Ǎ������v�ɐݒ�
                 setReadStatus(NORMAL);
                }
			}
			
			
			
			
			// �O���b�h�̎c��͒ǉ��p�̍s��ǉ�����p
			int disLine = 0;
			int n = 0;

			// �啪�ޖ��̂ɓǍ�����
			List CD1list;
			CD1list = entity.mCLASS_CD1.read(conn, struct);
			if (CD1list.isEmpty()){
				struct.setCLASS_NAME1("");
				struct.setMODIFY_COUNT_CD1("");				
				ExpjMessage emsg = new ExpjMessage( "ZZ06001" );
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
				if (!list.isEmpty()){
					n = list.size(); 
				}
				disLine = maxLine-n;
				for (int i=0;i<disLine ;i++ ){
					list.add(addStruct);
				}
				struct.seth_CLASS_CD1("");// �啪�ރR�[�h(��r�p)
				struct.seth_CLASS_CD2("");// �����ރR�[�h(��r�p)
				return;
			}else{
				struct.setCLASS_NAME1(((AA0190010Struct)CD1list.get(0)).getCLASS_NAME1());
				struct.setMODIFY_COUNT_CD1(((AA0190010Struct)CD1list.get(0)).getMODIFY_COUNT_CD1());
			}
			
			// �����ޖ��̂ɓǍ�����
			List CD2list;
			CD2list = entity.mCLASS_CD2.read(conn, struct);
			if (CD2list.isEmpty()){
				struct.setCLASS_NAME2("");
				struct.setMODIFY_COUNT_CD2("");
				ExpjMessage emsg = new ExpjMessage( "ZZ06001" );
				msgStruct.addError(emsg);	// �G���[���b�Z�[�W�Ƃ��ēo�^
				sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
				if (!list.isEmpty()){
					n = list.size(); 
				}
				disLine = maxLine-n;
				for (int i=0;i<disLine ;i++ ){
					list.add(addStruct);
				}
				return;
			}else{
				struct.setCLASS_NAME2(((AA0190010Struct)CD2list.get(0)).getCLASS_NAME2());
				struct.setMODIFY_COUNT_CD2(((AA0190010Struct)CD2list.get(0)).getMODIFY_COUNT_CD2());
			}
			for (int i=0;i<list.size();i++){
				tempStruct = (AA0190010Struct) list.get(i);
				tempStruct.setWriteStatus("false");
			}


			
			// �O���b�h�̎c��͒ǉ��p�̍s��ǉ�����B
			if (!list.isEmpty()){
				n = list.size(); 
			}
			disLine = maxLine-n;
			for (int i=0;i<disLine ;i++ ){
				list.add(addStruct);
			}

			struct.seth_CLASS_CD1(struct.getCLASS_CD1());// �啪�ރR�[�h(��r�p)
			struct.seth_CLASS_CD2(struct.getCLASS_CD2());// �����ރR�[�h(��r�p)
		} catch(Exception e) {
			e.printStackTrace();
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			msgStruct.addError( emsg ); 
			sysLog.severe(emsg, getsysUSER_CD());
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			try{
				if(list!=null && list.size()!=0){
				//��ʂ̃f�[�^��ۑ�����
				setData(struct);
				}
                // ���ʃ`�F�b�N
				if (!commonCheck(struct)){
					return;
				}
				// �咆���ނ����ɓo�^�G���[
				List chkList;
				chkList = entity.mCLASS_CD2.read(conn, struct);
				if (!chkList.isEmpty()){
					ExpjMessage emsg = new ExpjMessage( "AA20010" );
					msgStruct.addError( emsg ); 
					return;
				}
				// �啪��DB�o�^
				List chkList_CD1;

				chkList_CD1 = entity.mCLASS_CD1_MODIFY_COUNT.read(conn, struct);
				if (chkList_CD1.isEmpty()){
					entity.minsertCLASS_CD1.create(conn, struct);
				}else{
					entity.mupdateCLASS_CD1.update(conn, struct);
				}
				// ������DB�o�^
				entity.minsertCLASS_CD2.create(conn, struct);
				
				// ������DB�o�^
				if (struct.getList_CLASS_CD3()!= null){
				for (int i=0;i<(struct.getList_CLASS_CD3()).size();i++){
					String strCLASS_CD3 = (struct.getList_CLASS_CD3()).get(i).toString();
					String strCLASS_CD2 = struct.getCLASS_CD2();
					String strCLASS_CD1 = struct.getCLASS_CD1();
					String strCLASS_NAME3 = (struct.getList_CLASS_NAME3()).get(i).toString();
					String oldCLASS_CD3_MODIFY_COUNT = (struct.getList_MODIFY_COUNT_CD3()).get(i).toString();
					List cd3List;
					AA0190010Struct cd3Struct = new AA0190010Struct(); // �o�^�pstruct

					// ��f�[�^
					if ((strCLASS_CD3==null||("").equals(strCLASS_CD3)) && (strCLASS_NAME3==null||("").equals(strCLASS_NAME3))){
						continue;
					}
					
					cd3Struct.setCLASS_CD1(strCLASS_CD1);
					cd3Struct.setCLASS_CD2(strCLASS_CD2);
					cd3Struct.setCLASS_CD3(strCLASS_CD3);
					cd3Struct.setCLASS_NAME3(strCLASS_NAME3);
					cd3Struct.setsUser_ID(struct.getsUser_ID());
					cd3List = entity.mCLASS_CD3_MODIFY_COUNT.read(conn, cd3Struct);
					
                    //�m���ރ}�X�^�n�ɖ�����
					if (cd3List.isEmpty()){	
						entity.minsertCLASS_CD3.create(conn, cd3Struct);
					}
					// [���ރ}�X�^�n�ɗL�鎞
					else{										
						// �X�V�񐔃`�F�b�N
						if (!oldCLASS_CD3_MODIFY_COUNT.equals(((AA0190010Struct)cd3List.get(0)).getMODIFY_COUNT_CD3())){
							ExpjMessage emsg = new ExpjMessage( "ZZ01105");
							msgStruct.addError( emsg ); 
							return;
						}
						entity.mupdateCLASS_CD3.update(conn, cd3Struct);
					}
				  }
				}
				conn.commit();
				controlSelect();			
			}catch(SQLException e) {
					conn.rollback();
					setReadStatus(ERROR);
					e.printStackTrace();
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}catch(Exception e) {
					e.printStackTrace();
					setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			try{
				if(list!=null && list.size()!=0){
					//��ʂ̃f�[�^��ۑ�����
					setData(struct);
					}
				// ���ʃ`�F�b�N
				if (!commonCheck(struct)){
					return;
				}

				// �����ނ����ɍ폜�G���[
				List chkList;
				chkList = entity.mCLASS_CD2_MODIFY_COUNT.read(conn, struct);
				if (chkList.isEmpty()){
					ExpjMessage emsg = new ExpjMessage( "AA20011" );
					msgStruct.addError( emsg ); 
					struct.clear();
					setList(null);
					return;
				}

				// �啪��DB�X�V
				List chkList_CD1;
				String oldCLASS_CD1_MODIFY_COUNT = struct.getMODIFY_COUNT_CD1();
				chkList_CD1 = entity.mCLASS_CD1_MODIFY_COUNT.read(conn, struct);
				if (!oldCLASS_CD1_MODIFY_COUNT.equals(((AA0190010Struct)chkList_CD1.get(0)).getMODIFY_COUNT_CD1())){
					ExpjMessage emsg = new ExpjMessage( "ZZ01105");
					msgStruct.addError( emsg ); 
					return;
				}
				entity.mupdateCLASS_CD1.update(conn, struct);

				// ������DB�X�V
				List chkList_CD2;
				String oldCLASS_CD2_MODIFY_COUNT = struct.getMODIFY_COUNT_CD2();
				chkList_CD2 = entity.mCLASS_CD2_MODIFY_COUNT.read(conn, struct);
				if (!oldCLASS_CD2_MODIFY_COUNT.equals(((AA0190010Struct)chkList_CD2.get(0)).getMODIFY_COUNT_CD2())){
					ExpjMessage emsg = new ExpjMessage( "ZZ01105");
					msgStruct.addError( emsg ); 
					return;
				}
				entity.mupdateCLASS_CD2.update(conn, struct);

				// ������DB�o�^
				if (struct.getList_CLASS_CD3()!= null){
				for (int i=0;i<(struct.getList_CLASS_CD3()).size();i++){
					String strCLASS_CD3 = (struct.getList_CLASS_CD3()).get(i).toString();
					String strCLASS_CD2 = struct.getCLASS_CD2();
					String strCLASS_CD1 = struct.getCLASS_CD1();
					String strCLASS_NAME3 = (struct.getList_CLASS_NAME3()).get(i).toString();
					String oldCLASS_CD3_MODIFY_COUNT = (struct.getList_MODIFY_COUNT_CD3()).get(i).toString();				
					List cd3List;
					AA0190010Struct cd3Struct = new AA0190010Struct(); // �o�^�pstruct

					// ��f�[�^
					if ((strCLASS_CD3==null||("").equals(strCLASS_CD3)) && (strCLASS_NAME3==null||("").equals(strCLASS_NAME3))){
						continue;
					}
					
					cd3Struct.setCLASS_CD1(strCLASS_CD1);
					cd3Struct.setCLASS_CD2(strCLASS_CD2);
					cd3Struct.setCLASS_CD3(strCLASS_CD3);
					cd3Struct.setCLASS_NAME3(strCLASS_NAME3);
					cd3Struct.setsUser_ID(struct.getsUser_ID());
					cd3List = entity.mCLASS_CD3_MODIFY_COUNT.read(conn, cd3Struct);
					
					
					//�m���ރ}�X�^�n�ɖ�����
					if (cd3List.isEmpty()){
						entity.minsertCLASS_CD3.create(conn, cd3Struct);
					}
					// [���ރ}�X�^�n�ɗL�鎞
					else{										
						// �X�V�񐔃`�F�b�N
						if (!oldCLASS_CD3_MODIFY_COUNT.equals(((AA0190010Struct)cd3List.get(0)).getMODIFY_COUNT_CD3())){
							ExpjMessage emsg = new ExpjMessage( "ZZ01105");
							msgStruct.addError( emsg ); 
							return;
						}
						entity.mupdateCLASS_CD3.update(conn, cd3Struct);
					}	
				  }
				}
				conn.commit();
				controlSelect();			
			}catch(SQLException e) {
					conn.rollback();
					setReadStatus(ERROR);
					e.printStackTrace();
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}catch(Exception e) {
					e.printStackTrace();
					setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * �I���폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			try{
				// ������DB�폜
				if (struct.getList_CLASS_CD3()!= null){
					for (int i=0;i<(struct.getList_CLASS_CD3()).size();i++){
						String strCLASS_CD3 = (struct.getList_CLASS_CD3()).get(i).toString();
						String strCLASS_CD2 = struct.getCLASS_CD2();
						String strCLASS_CD1 = struct.getCLASS_CD1();
						String strCLASS_NAME3 = (struct.getList_CLASS_NAME3()).get(i).toString();
						String oldCLASS_CD3_MODIFY_COUNT = (struct.getList_MODIFY_COUNT_CD3()).get(i).toString();
						List cd3List;
						AA0190010Struct cd3Struct = new AA0190010Struct();
                        //��f�[�^
						if ((strCLASS_CD3==null||("").equals(strCLASS_CD3)) && (strCLASS_NAME3==null||("").equals(strCLASS_NAME3))){
							continue;
						}
						
						cd3Struct.setCLASS_CD1(strCLASS_CD1);
						cd3Struct.setCLASS_CD2(strCLASS_CD2);
						cd3Struct.setCLASS_CD3(strCLASS_CD3);
						cd3Struct.setCLASS_NAME3(strCLASS_NAME3);
						cd3Struct.setsUser_ID(struct.getsUser_ID());
						cd3Struct.setMODIFY_COUNT_CD3(oldCLASS_CD3_MODIFY_COUNT);
						//cd3List = entity.mCLASS_CD3_MODIFY_COUNT.read(conn, cd3Struct);
				if (strCLASS_CD1.equals(AA0190Const.CLASS_01)) {
					// ���Ӑ�}�X�^���݃`�F�b�N
					if (isExistM_CUST(strCLASS_CD2, strCLASS_CD3)) {
						
						conn.rollback();
						ExpjMessage emsg = new ExpjMessage( "AA20045", strCLASS_CD2);
						msgStruct.addError( emsg ); 														
						return;
					}
				} else if (strCLASS_CD1.equals(AA0190Const.CLASS_02)) {
					// �����}�X�^���݃`�F�b�N
					if (isExistM_VEND_CTRL(strCLASS_CD2, strCLASS_CD3)) {
						
						conn.rollback();
						ExpjMessage emsg = new ExpjMessage( "AA20046", strCLASS_CD2);
						msgStruct.addError( emsg ); 						
						return;
					}
				} else if (strCLASS_CD1.equals(AA0190Const.CLASS_03)) {
					// �i�ڃ}�X�^���݃`�F�b�N
					if (isExistM_ITEM(strCLASS_CD2, strCLASS_CD3)) {
						
						conn.rollback();
						ExpjMessage emsg = new ExpjMessage( "AA20047", strCLASS_CD2);
						msgStruct.addError( emsg ); 						
						return;
					}
				}
				if (!"".equals(struct.getMODIFY_COUNT_CD3())){
					entity.mdeleteCLASS_CD3.delete(conn, cd3Struct);
				}				
			}
		}
				conn.commit();
				controlSelect();
			}catch(SQLException e) {
					conn.rollback();
					setReadStatus(ERROR);
					e.printStackTrace();
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}catch(Exception e) {
					e.printStackTrace();
					setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			if(list != null){
				list.clear();
			}
				struct.clear();
				setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * �S�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlAlldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlAlldelete");
			//{{user_implement_dev:<controlAlldelete>
		try{
			List cList;		
			List selectDataList = entity.mSELECT_DATA.read(conn, struct);
			AA0190010Struct selectDataStruct;
			if (selectDataList.isEmpty()) {
				ExpjMessage emsg = new ExpjMessage( "ZZ01105");
				msgStruct.addError( emsg ); 
				return;
			}
			for (int i=0;i<selectDataList.size();i++){
				selectDataStruct = (AA0190010Struct)selectDataList.get(i);
				String strCLASS_CD3 = selectDataStruct.getSEL_CLASS_CD3();
				String strCLASS_CD2 = struct.getCLASS_CD2();
				String strCLASS_CD1 = struct.getCLASS_CD1();

				if (strCLASS_CD1.equals(AA0190Const.CLASS_01)) {
					// ���Ӑ�}�X�^���݃`�F�b�N
					if (isExistM_CUST(strCLASS_CD2, strCLASS_CD3)) {
						
						ExpjMessage emsg = new ExpjMessage( "AA20045", strCLASS_CD2);
						msgStruct.addError( emsg ); 														
						return;
					}
				} else if (strCLASS_CD1.equals(AA0190Const.CLASS_02)) {
					// �����}�X�^���݃`�F�b�N
					if (isExistM_VEND_CTRL(strCLASS_CD2, strCLASS_CD3)) {
						
						ExpjMessage emsg = new ExpjMessage( "AA20046", strCLASS_CD2);
						msgStruct.addError( emsg ); 						
						return;
					}
				} else if (strCLASS_CD1.equals(AA0190Const.CLASS_03)) {
					// �i�ڃ}�X�^���݃`�F�b�N
					if (isExistM_ITEM(strCLASS_CD2, strCLASS_CD3)) {
						
						ExpjMessage emsg = new ExpjMessage( "AA20047", strCLASS_CD2);
						msgStruct.addError( emsg ); 						
						return;
					}
				}
			}	
            //��������DB�폜
			entity.mdeleteCLASS_CD2.delete(conn, struct); 
            //�啪��DB�폜
			cList = entity.mdeleteCHK.read(conn, struct);  
			if (cList.isEmpty()){
				entity.mdeleteCLASS_CD1.delete(conn, struct);
			}
			conn.commit();
			controlClear();			
		}catch(SQLException e) {
				conn.rollback();
				setReadStatus(ERROR);
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				msgStruct.addError( emsg ); 
				sysLog.severe(emsg, getsysUSER_CD());
		}catch(ResourceBusyException rbe) {
			rbe.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		}catch(Exception e) {
				e.printStackTrace();
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				msgStruct.addError( emsg ); 
				sysLog.severe(emsg, getsysUSER_CD());
		}
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlAlldelete>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlAlldelete");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
        //������
		setReadStatus(INITIAL);
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
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
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Alldelete") ) {
				controlAlldelete();
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
//			throw new FoundationException("AA0190010Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0190010-E999","CSV�̏o�͏���"));
			throw new FoundationException("AA0190010Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0190010-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("AA0190010Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0190010-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("AA0190010Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected AA0190010Entity entity;
	protected AA0190010Struct struct;
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

		entity = new AA0190010Entity();
		struct = new AA0190010Struct();

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
	 * AA0190010�N���X�̕W���R���X�g���N�^
	 */
	public AA0190010Control() throws BusinessProcessException, FoundationException
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
				AA0190010Struct key = (AA0190010Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_CLASS_CD1") && key.geth_CLASS_CD1() != null) {
					msgKey.setKeyValue("h_CLASS_CD1", key.geth_CLASS_CD1());
				}
				if(msgKeyType.containsKeyColumn("h_CLASS_CD2") && key.geth_CLASS_CD2() != null) {
					msgKey.setKeyValue("h_CLASS_CD2", key.geth_CLASS_CD2());
				}
				if(msgKeyType.containsKeyColumn("WriteStatus") && key.getWriteStatus() != null) {
					msgKey.setKeyValue("WriteStatus", key.getWriteStatus());
				}
				if(msgKeyType.containsKeyColumn("CLASS_NAME1") && key.getCLASS_NAME1() != null) {
					msgKey.setKeyValue("CLASS_NAME1", key.getCLASS_NAME1());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD1") && key.getMODIFY_COUNT_CD1() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_CD1", key.getMODIFY_COUNT_CD1());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CD1") && key.getCLASS_CD1() != null) {
					msgKey.setKeyValue("CLASS_CD1", key.getCLASS_CD1());
				}
				if(msgKeyType.containsKeyColumn("CLASS_NAME2") && key.getCLASS_NAME2() != null) {
					msgKey.setKeyValue("CLASS_NAME2", key.getCLASS_NAME2());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD2") && key.getMODIFY_COUNT_CD2() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_CD2", key.getMODIFY_COUNT_CD2());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CD2") && key.getCLASS_CD2() != null) {
					msgKey.setKeyValue("CLASS_CD2", key.getCLASS_CD2());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CD3") && key.getCLASS_CD3() != null) {
					msgKey.setKeyValue("CLASS_CD3", key.getCLASS_CD3());
				}
				if(msgKeyType.containsKeyColumn("CLASS_NAME3") && key.getCLASS_NAME3() != null) {
					msgKey.setKeyValue("CLASS_NAME3", key.getCLASS_NAME3());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD3") && key.getMODIFY_COUNT_CD3() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_CD3", key.getMODIFY_COUNT_CD3());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_01_CD") && key.getCUST_CLASS_01_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_01_CD", key.getCUST_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_02_CD") && key.getCUST_CLASS_02_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_02_CD", key.getCUST_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_03_CD") && key.getCUST_CLASS_03_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_03_CD", key.getCUST_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_04_CD") && key.getCUST_CLASS_04_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_04_CD", key.getCUST_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_05_CD") && key.getCUST_CLASS_05_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_05_CD", key.getCUST_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_06_CD") && key.getCUST_CLASS_06_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_06_CD", key.getCUST_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_07_CD") && key.getCUST_CLASS_07_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_07_CD", key.getCUST_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_08_CD") && key.getCUST_CLASS_08_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_08_CD", key.getCUST_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_09_CD") && key.getCUST_CLASS_09_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_09_CD", key.getCUST_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_10_CD") && key.getCUST_CLASS_10_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_10_CD", key.getCUST_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_01_CD") && key.getVEND_CLASS_01_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_01_CD", key.getVEND_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_02_CD") && key.getVEND_CLASS_02_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_02_CD", key.getVEND_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_03_CD") && key.getVEND_CLASS_03_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_03_CD", key.getVEND_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_04_CD") && key.getVEND_CLASS_04_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_04_CD", key.getVEND_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_05_CD") && key.getVEND_CLASS_05_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_05_CD", key.getVEND_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_06_CD") && key.getVEND_CLASS_06_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_06_CD", key.getVEND_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_07_CD") && key.getVEND_CLASS_07_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_07_CD", key.getVEND_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_08_CD") && key.getVEND_CLASS_08_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_08_CD", key.getVEND_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_09_CD") && key.getVEND_CLASS_09_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_09_CD", key.getVEND_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_10_CD") && key.getVEND_CLASS_10_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_10_CD", key.getVEND_CLASS_10_CD());
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
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_CLASS_CD1") && key.getSEL_CLASS_CD1() != null) {
					msgKey.setKeyValue("SEL_CLASS_CD1", key.getSEL_CLASS_CD1());
				}
				if(msgKeyType.containsKeyColumn("SEL_CLASS_CD2") && key.getSEL_CLASS_CD2() != null) {
					msgKey.setKeyValue("SEL_CLASS_CD2", key.getSEL_CLASS_CD2());
				}
				if(msgKeyType.containsKeyColumn("SEL_CLASS_CD3") && key.getSEL_CLASS_CD3() != null) {
					msgKey.setKeyValue("SEL_CLASS_CD3", key.getSEL_CLASS_CD3());
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
					AA0190010Struct key = new AA0190010Struct();
					if(msgKeyType.containsKeyColumn("h_CLASS_CD1")) {
						key.seth_CLASS_CD1(msgKey.getKeyValue("h_CLASS_CD1"));
					}
					if(msgKeyType.containsKeyColumn("h_CLASS_CD2")) {
						key.seth_CLASS_CD2(msgKey.getKeyValue("h_CLASS_CD2"));
					}
					if(msgKeyType.containsKeyColumn("WriteStatus")) {
						key.setWriteStatus(msgKey.getKeyValue("WriteStatus"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_NAME1")) {
						key.setCLASS_NAME1(msgKey.getKeyValue("CLASS_NAME1"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD1")) {
						key.setMODIFY_COUNT_CD1(msgKey.getKeyValue("MODIFY_COUNT_CD1"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CD1")) {
						key.setCLASS_CD1(msgKey.getKeyValue("CLASS_CD1"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_NAME2")) {
						key.setCLASS_NAME2(msgKey.getKeyValue("CLASS_NAME2"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD2")) {
						key.setMODIFY_COUNT_CD2(msgKey.getKeyValue("MODIFY_COUNT_CD2"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CD2")) {
						key.setCLASS_CD2(msgKey.getKeyValue("CLASS_CD2"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CD3")) {
						key.setCLASS_CD3(msgKey.getKeyValue("CLASS_CD3"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_NAME3")) {
						key.setCLASS_NAME3(msgKey.getKeyValue("CLASS_NAME3"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD3")) {
						key.setMODIFY_COUNT_CD3(msgKey.getKeyValue("MODIFY_COUNT_CD3"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_01_CD")) {
						key.setCUST_CLASS_01_CD(msgKey.getKeyValue("CUST_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_02_CD")) {
						key.setCUST_CLASS_02_CD(msgKey.getKeyValue("CUST_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_03_CD")) {
						key.setCUST_CLASS_03_CD(msgKey.getKeyValue("CUST_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_04_CD")) {
						key.setCUST_CLASS_04_CD(msgKey.getKeyValue("CUST_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_05_CD")) {
						key.setCUST_CLASS_05_CD(msgKey.getKeyValue("CUST_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_06_CD")) {
						key.setCUST_CLASS_06_CD(msgKey.getKeyValue("CUST_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_07_CD")) {
						key.setCUST_CLASS_07_CD(msgKey.getKeyValue("CUST_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_08_CD")) {
						key.setCUST_CLASS_08_CD(msgKey.getKeyValue("CUST_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_09_CD")) {
						key.setCUST_CLASS_09_CD(msgKey.getKeyValue("CUST_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_10_CD")) {
						key.setCUST_CLASS_10_CD(msgKey.getKeyValue("CUST_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_01_CD")) {
						key.setVEND_CLASS_01_CD(msgKey.getKeyValue("VEND_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_02_CD")) {
						key.setVEND_CLASS_02_CD(msgKey.getKeyValue("VEND_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_03_CD")) {
						key.setVEND_CLASS_03_CD(msgKey.getKeyValue("VEND_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_04_CD")) {
						key.setVEND_CLASS_04_CD(msgKey.getKeyValue("VEND_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_05_CD")) {
						key.setVEND_CLASS_05_CD(msgKey.getKeyValue("VEND_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_06_CD")) {
						key.setVEND_CLASS_06_CD(msgKey.getKeyValue("VEND_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_07_CD")) {
						key.setVEND_CLASS_07_CD(msgKey.getKeyValue("VEND_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_08_CD")) {
						key.setVEND_CLASS_08_CD(msgKey.getKeyValue("VEND_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_09_CD")) {
						key.setVEND_CLASS_09_CD(msgKey.getKeyValue("VEND_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_10_CD")) {
						key.setVEND_CLASS_10_CD(msgKey.getKeyValue("VEND_CLASS_10_CD"));
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
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_CLASS_CD1")) {
						key.setSEL_CLASS_CD1(msgKey.getKeyValue("SEL_CLASS_CD1"));
					}
					if(msgKeyType.containsKeyColumn("SEL_CLASS_CD2")) {
						key.setSEL_CLASS_CD2(msgKey.getKeyValue("SEL_CLASS_CD2"));
					}
					if(msgKeyType.containsKeyColumn("SEL_CLASS_CD3")) {
						key.setSEL_CLASS_CD3(msgKey.getKeyValue("SEL_CLASS_CD3"));
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
