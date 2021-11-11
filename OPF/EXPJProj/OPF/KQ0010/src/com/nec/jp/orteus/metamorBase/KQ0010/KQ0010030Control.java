/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010030Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010;

import com.nec.jp.orteus.metamorBase.KQ0010.*;
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
import com.nec.jp.orteus.expj.tranappr.TranAppr;
//Add Anken Start   20140411 hui-x
import com.nec.jp.orteus.metamorBase.KM0030.KM0030010Struct;
import com.nec.jp.orteus.metamorBase.KM0030.KM0030010Control;
//Add Anken End   20140411 hui-x
//Add Nec Start 20140616
import com.nec.jp.orteus.metamorBase.KQ0090.KQ0090010Struct;
import com.nec.jp.orteus.metamorBase.KQ0090.KQ0090010Control;
//Add Nec End 20140616
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KQ0010030Control �N���X
 * �t�@�C���E�N���X����
 * @author $Author: geng-jia $
 * @version $Revision: 1.17 $ $Date: 2015/12/03 08:12:27 $
 *
 */
//}}user_implement_code_header

public class KQ0010030Control
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
	public KQ0010030Struct getListvalue(int x) { return (KQ0010030Struct)(this.list.get(x)); }	// ���X�g�̒l��Ԃ��܂��B
	public KQ0010030Struct getStruct() { return this.struct; }	// Struct�̒l��Ԃ��܂��B
	public KQ0010030Struct createStruct() { return new KQ0010030Struct(); }	// �V����Struct������ĕԂ��܂��B
	public void setStruct(Object structname) { this.struct.setStruct((KQ0010030Struct)structname); }	// Struct���Z�b�g���܂��B
	public void initializeStruct() { this.struct.initialize(); }	// Struct�̒l�����������܂��B

	// CSV�o�͗p���X�g
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	private PrivateConfig privateConfig;

	/** �����敪*/
	private ComboStruct _PROC_TYP = new ComboStruct();
	/** ���F��ԁ@*/
	private ComboStruct _APPR_STATUS_TYP = new ComboStruct();
	/** �����敪*/
	private ComboStruct _ODR_ODR_TYP = new ComboStruct();
	/** ���l�敪 */
	private ComboStruct _ODR_SPCL_PRICE = new ComboStruct();
	/** �a���q�ɋ敪 */
	private ComboStruct _ODR_DEPO_TYP = new ComboStruct();
	/** �ύX�L���L�� */
	private String changed = "��";
	
	// �˗��ҏ��F�ғ��ꋖ��
	private String _REQUEST_APPR_SAME = null;
	
	public String get_REQUEST_APPR_SAME() {
		return _REQUEST_APPR_SAME;
	}
	public void set_REQUEST_APPR_SAME(String _request_appr_same) {
		_REQUEST_APPR_SAME = _request_appr_same;
	}
	/**
    * �敪���擾
    * @param comboStruct �敪��񃊃X�g
    * @param strTyp �敪�R�[�h
    * @return �敪���́B�Y������f�[�^���Ȃ������ꍇ�͋敪�R�[�h��Ԃ�
    */
   private String getTypeName(ComboStruct comboStruct, String strTyp)
   {
    String strTypName = strTyp;
    for(int i = 0; i < comboStruct.getValList().size(); i++){
     if(strTyp.equals((String)(comboStruct.getValList().get(i)))){
      strTypName = (String)(comboStruct.getExplanList().get(i));
      break;
     }
    }
    return strTypName;
   }
   
	/**
     * ��ʃG���[���b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     */
    private void setErrorMessage(String code){
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError( emsg );	// �G���[���b�Z�[�W�Ƃ��ēo�^
     sysLog.warning(emsg, getsysUSER_CD()); //�G���[���e
    }

    /**
     * ��񃁃b�Z�[�W�ݒ�
     * @param ���b�Z�[�W�ԍ�
     * @param �u��������P
     */
    private void setErrorMessage(String messageno, String value1)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1 );
     msgStruct.addError( emsg );
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
	 * �˗��ҏ��F�ғ��ꋖ�`�F�b�N
	 * @retrun �p�����[�^�u�˗��ҏ��F�ғ��ꋖ�v��0�̏ꍇ�A�˗��˗��҂Ə��F�҂�����@false
	 */
	private boolean check(){
		if("0".equals(struct.geth_REQUEST_APPR_SAME())){
			for(int i = 0;i<struct.getList_l_REQUEST_BY().size();i++){
				if(getsysUSER_CD().equals(struct.getList_l_REQUEST_BY().get(i))){
					setErrorMessage("KA00128");
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * �˗���������
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private void selectApprInfo() throws FoundationException, SQLException{
	
		// �g�������F�˗���񌟍����ʗp�̗Վ����X�g
		List tempAppList = null;
		
		// �g������ʃf�[�^��񌟍����ʗp�̗Վ����X�g
		List tempSrcList = null;
		
		// �g�������F�˗���������
		if("1".equals(struct.geth_SELECT_TYP())){
			tempAppList = entity.mselectModel1.read(conn,struct);
		}else if("2".equals(struct.geth_SELECT_TYP())){
			tempAppList = entity.mselectModel2.read(conn,struct);
		}else{
			tempAppList = entity.mselectModel3.read(conn,struct);
		}
		
		// �g������ʃf�[�^�����Z�b�g
		if(tempAppList.size()>0){
			for(int i= 0;i<tempAppList.size();i++){
				KQ0010030Struct tempAppStruct= new KQ0010030Struct();
				tempAppStruct = (KQ0010030Struct) tempAppList.get(i);
				// ����
				tempSrcList = entity.mselectT_TRAN_SRC.read(conn, tempAppStruct);
				if(tempSrcList.size()>0){
					KQ0010010Struct kq0010010struct = new KQ0010010Struct();
					KQ0010020Struct kq0010020struct = new KQ0010020Struct();
					//Add Anken Start 20140319 hui-x
					KM0030010Struct km0030010Strut = new KM0030010Struct();
					//Add Anken End   20140319 hui-x
					//Add Nec Start 20140616
					KQ0090010Struct kq0090010Struct = new KQ0090010Struct();
					//Add Nec End   20140616
					for(int j=0 ;j<tempSrcList.size();j++){
						// ��ʂ̍��ڂ��Z�b�g
						if(!((KQ0010030Struct)tempSrcList.get(j)).getFIELD_FLG().equals("2")){
							//Mod Anken Start 20140319 hui-x
//							if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010010Servlet")){
//                                 //�@�󒍓o�^�f�[�^
//								settoStruct(kq0010010struct,(KQ0010030Struct)tempSrcList.get(j));	
//    						}else{
// 								// �󒍏��C���f�[�^
//    							settoStruct(kq0010020struct,(KQ0010030Struct)tempSrcList.get(j));	
//							}
							if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010010Servlet")){
		                          //�@�Č��łȂ��󒍂̏ꍇ�A�󒍓o�^�f�[�^
									settoStruct(kq0010010struct,(KQ0010030Struct)tempSrcList.get(j));	
								}else if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010020Servlet")){
									// �Č��łȂ��󒍂̏ꍇ�A�󒍏��C���f�[�^
									settoStruct(kq0010020struct,(KQ0010030Struct)tempSrcList.get(j));	
								}else if(tempAppStruct.geth_SCREEN_URL().equals("KM0030010Servlet")){
									settoStruct(km0030010Strut,(KQ0010030Struct)tempSrcList.get(j));
								}
							//Mod Anken End   20140319 hui-x
							//Add Nec Start 20140616
								else if(tempAppStruct.geth_SCREEN_URL().equals("KQ0090010Servlet")){
									settoStruct(kq0090010Struct,(KQ0010030Struct)tempSrcList.get(j));
								}
							//Add Nec End   20140616
						}
					}
					//Mod Anken Start 20140319 hui-x
//                    if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010010Servlet")){
//                    	// �󒍓o�^�f�[�^���Z�b�g
//						copyToAppStruct(tempAppStruct,kq0010010struct);
//					}else{
//						// �󒍏��C���f�[�^���Z�b�g
//						copyToAppStruct(tempAppStruct,kq0010020struct);
//					}
					if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010010Servlet")){
						// �Č��łȂ��󒍂̏ꍇ�A�󒍓o�^�f�[�^���Z�b�g
						copyToAppStruct(tempAppStruct,kq0010010struct);
					}else if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010020Servlet")) {
						// �Č��łȂ��󒍂̏ꍇ�A�󒍏��C���f�[�^���Z�b�g
						copyToAppStruct(tempAppStruct,kq0010020struct);
					}else if(tempAppStruct.geth_SCREEN_URL().equals("KM0030010Servlet")) {
						//�Č��̎󒍂̏ꍇ�A�Č��󒍓o�^�f�[�^
						copyToAppStruct(tempAppStruct,km0030010Strut);
					}
					//Mod Anken End   20140319 hui-x
					//Add Nec Start 20140616
					else if(tempAppStruct.geth_SCREEN_URL().equals("KQ0090010Servlet")) {
						//��݌ɕi�󒍂̏ꍇ�A��݌ɕi�󒍓o�^�f�[�^
						copyToAppStruct(tempAppStruct,kq0090010Struct);
					}
					//Add Nec End   20140616
				}
				// �����敪
				tempAppStruct.setl_PROC_TYP_VALUE(getTypeName(_PROC_TYP,tempAppStruct.geth_PROC_TYP()));
				// ���F���
				tempAppStruct.setl_STATUS_NAME(getTypeName(_APPR_STATUS_TYP,tempAppStruct.geth_STATUS()));
				// �����敪
				tempAppStruct.setl_ODR_TYP_DN(getTypeName(_ODR_ODR_TYP,tempAppStruct.getl_ODR_TYP()));
				// ���l�敪 
				tempAppStruct.setl_SPCL_PRICE_TYP_DN(getTypeName(_ODR_SPCL_PRICE,tempAppStruct.getl_SPCL_PRICE_TYP()));
				// �a���q�ɋ敪
				if(tempAppStruct.getl_DEPO_TYP() != null)
				tempAppStruct.setl_DEPO_TYP_DN(getTypeName(_ODR_DEPO_TYP,tempAppStruct.getl_DEPO_TYP()));
				
				// ���X�g�ɒǉ�
				list.add(tempAppStruct);
				
			}
		}
	}
	
	/**
	 * ���F�˗���񂩂�A�󒍓o�^�Ǝ󒍏��C���̑Ώۂ��Z�b�g
	 * @param object
	 * @param tempSrcStruct
	 */
	private void settoStruct(Object object,KQ0010030Struct tempSrcStruct){
		String methodName = null;
		methodName = "set"+tempSrcStruct.getFIELD_NAME();
		Class detailStructClass = object.getClass();
		Class partypes[] = new Class[1];
		partypes[0] = String.class;
		Method detailStructMethod;
		try {
			detailStructMethod = detailStructClass.getMethod(methodName,partypes);
			Object arglist[] = new Object[1];
			arglist[0] = tempSrcStruct.getFIELD_VALUE();
			detailStructMethod.invoke(object, arglist);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	/**
	 * KQ0010010Struct�̑����ɂ��AKQ0010030Struct�̑������Z�b�g
	 * @param appstruct
	 * @param tempStruct
	 */
	private void copyToAppStruct(KQ0010030Struct appStruct,KQ0010010Struct tempStruct){
		appStruct.setl_ODR_TYP(tempStruct.getl_ODR_TYP());                                          // �����敪
		appStruct.setl_CUST_ODR_NO(tempStruct.getl_CUST_ODR_NO());                                  // ���Ӑ撍���ԍ�
		appStruct.setl_CUST_ITEM_CD(tempStruct.getl_CUST_ITEM_CD());                                // ���Ӑ�i�ڔԍ�
		appStruct.setl_ITEM_CD(tempStruct.getl_ITEM_CD());                                          // �i�ڔԍ�
		appStruct.setl_CUST_CD(tempStruct.getl_CUST_CD());                                          // ���Ӑ�R�[�h
		appStruct.setl_CUST_ANAME(tempStruct.getl_CUST_ANAME());                                    // ���Ӑ於
		appStruct.setl_DESINATED_DLV_DATE(tempStruct.getl_DESINATED_DLV_DATE());                    // �w��[��
		appStruct.setl_ODR_QTY(tempStruct.getl_ODR_QTY());                                          // �󒍐���
		appStruct.setl_UNIT_CD(tempStruct.getl_UNIT_CD());                                          // �P��
		appStruct.setl_ODR_UNIT_PRICE(tempStruct.getl_ODR_UNIT_PRICE());                            // �P��
		appStruct.setl_CUR_UNIT(tempStruct.getl_CUR_UNIT());                                        // �ʉݒP��
		appStruct.setl_SPCL_PRICE_TYP(tempStruct.getl_SPCL_PRICE_TYP());                            // ���l�敪
		appStruct.setl_DLV_LOC_CD(tempStruct.getl_DLV_LOC_CD());                                    // �[�i�ꏊ�R�[�h
		appStruct.setl_DLV_LOC_NAME(tempStruct.getl_DLV_LOC_NAME());                                // �[�i�ꏊ��
		appStruct.setl_DEPO_TYP(tempStruct.getl_DEPO_TYP());                                        // �a���q�ɋ敪
		appStruct.setl_CUST_ITEM_NAME(tempStruct.getl_CUST_ITEM_NAME());                            // ���Ӑ�i�ږ�
		appStruct.setl_ITEM_NAME(tempStruct.getl_ITEM_NAME());                                      // �i�ږ�
		appStruct.setl_ODR_ACPT_DATE(tempStruct.getl_ODR_ACPT_DATE());                              // �󒍓�
		appStruct.setl_JOB_ODR_CD(tempStruct.getl_JOB_ODR_CD());                                    // ����
		appStruct.setl_JOB_ODR_QTY(tempStruct.getl_JOB_ODR_QTY());                                  // ��z����
		appStruct.setl_JOB_ODR_DLV_DATE(tempStruct.getl_JOB_ODR_DLV_DATE());                        // ���Ԕ[��
		appStruct.setl_ALC_GRP_CD(tempStruct.getl_ALC_GRP_CD());                                    // �����O���[�v�R�[�h
		appStruct.setl_REMARKS(tempStruct.getl_REMARKS());                                          // ���l
		appStruct.seth_ODR_NO(tempStruct.getl_ODR_NO());                                            // �󒍔ԍ�
	}
	/**
	 * KQ0010020Struct�̑����ɂ��AKQ0010030Struct�̑������Z�b�g
	 * @param appStruct
	 * @param tempStruct
	 */
	private void copyToAppStruct(KQ0010030Struct appStruct,KQ0010020Struct tempStruct){
		appStruct.setl_ODR_TYP(tempStruct.getODR_TYP());                                          // �����敪
		appStruct.setl_CUST_ODR_NO(tempStruct.getCUST_ODR_NO());                                  // ���Ӑ撍���ԍ�
		appStruct.setl_CUST_ITEM_CD(tempStruct.getCUST_ITEM_CD());                                // ���Ӑ�i�ڔԍ�
		appStruct.setl_ITEM_CD(tempStruct.getITEM_CD());                                          // �i�ڔԍ�
		appStruct.setl_CUST_CD(tempStruct.getCUST_CD());                                          // ���Ӑ�R�[�h
		appStruct.setl_CUST_ANAME(tempStruct.getCUST_ANAME());                                    // ���Ӑ於
		appStruct.setl_DESINATED_DLV_DATE(tempStruct.getDESINATED_DLV_DATE());                    // �w��[��
		appStruct.setl_ODR_QTY(tempStruct.getODR_QTY());                                          // �󒍐���
		appStruct.setl_UNIT_CD(tempStruct.getUNIT_CD());                                          // �P��
		appStruct.setl_ODR_UNIT_PRICE(tempStruct.getODR_UNIT_PRICE());                            // �P��
		appStruct.setl_CUR_UNIT(tempStruct.getUNIT_NAME());                                       // �ʉݒP��
		appStruct.setl_SPCL_PRICE_TYP(tempStruct.getSPCL_PRICE_TYP());                            // ���l�敪
		appStruct.setl_DLV_LOC_CD(tempStruct.getDLV_LOC_CD());                                    // �[�i�ꏊ�R�[�h
		appStruct.setl_DLV_LOC_NAME(tempStruct.getDLV_LOC_NAME_KANJI());                          // �[�i�ꏊ��
		appStruct.setl_DEPO_TYP(tempStruct.getDEPO_TYP());                                        // �a���q�ɋ敪
		appStruct.setl_CUST_ITEM_NAME(tempStruct.getCUST_ITEM_NAME());                            // ���Ӑ�i�ږ�
		appStruct.setl_ITEM_NAME(tempStruct.getITEM_NAME());                                      // �i�ږ�
		appStruct.setl_ODR_ACPT_DATE(tempStruct.getODR_ACPT_DATE());                              // �󒍓�
		appStruct.setl_REMARKS(tempStruct.getREMARKS());                                          // ���l
		appStruct.seth_ODR_NO(tempStruct.getIN_ODR_NO());                                         // �󒍔ԍ�
		appStruct.setl_CUS_DLV_KEY_CD(tempStruct.getCUS_DLV_KEY_CD());                            // �[�i�L�[�ԍ�
		appStruct.setl_CUS_DLV_CD(tempStruct.getCUS_DLV_CD());                                    // �[���ԍ�
	}
	//Add Anken Start 20140319 hui-x
	/**
	 * KM0030010Struct�̑����ɂ��AKQ0010030Struct�̑������Z�b�g
	 * @param appStruct
	 * @param tempStruct
	 */
	private void copyToAppStruct(KQ0010030Struct appStruct,KM0030010Struct tempStruct){
		appStruct.setl_ODR_TYP(tempStruct.getl_ODR_TYP());                                          // �����敪
		appStruct.setl_h_ODR_TYP(tempStruct.getl_h_ODR_TYP());                                      // �����敪
		appStruct.setl_CUST_ODR_NO(tempStruct.getl_CUST_ODR_NO());                                  // ���Ӑ撍���ԍ�
		appStruct.setl_CUST_ITEM_CD(tempStruct.getl_CUST_ITEM_CD());                                // ���Ӑ�i�ڔԍ�
		appStruct.setl_ITEM_CD(tempStruct.getl_ITEM_CD());                                          // �i�ڔԍ�
		appStruct.setl_CUST_CD(tempStruct.getCUST_CD());                                            // ���Ӑ�R�[�h
		appStruct.setl_CUST_ANAME(tempStruct.getCUST_NAME());                                 	    // ���Ӑ於
		appStruct.setl_DESINATED_DLV_DATE(tempStruct.getl_DESINATED_DLV_DATE());                    // �w��[��
		appStruct.setl_ODR_QTY(tempStruct.getl_ODR_QTY());                                          // �󒍐���
		appStruct.setl_UNIT_CD(tempStruct.getl_UNIT_CD());                                          // �P��
		appStruct.setl_ODR_UNIT_PRICE(tempStruct.getl_ESTIMATE_UNIT_PRICE());                       // �P��
		appStruct.setl_CUR_UNIT(tempStruct.getl_CUR_UNIT());                                        // �ʉݒP��
		appStruct.setl_SPCL_PRICE_TYP("1");                   	                                    // ���l�敪
		appStruct.setl_DLV_LOC_CD(tempStruct.getl_DLV_LOC_CD());                                    // �[�i�ꏊ�R�[�h
		appStruct.setl_DLV_LOC_NAME(tempStruct.getl_DLV_LOC_NAME());                                // �[�i�ꏊ��
		appStruct.setl_DEPO_TYP(tempStruct.getl_DEPO_TYP());                                        // �a���q�ɋ敪
		appStruct.setl_CUST_ITEM_NAME(tempStruct.getl_CUST_ITEM_NAME());                            // ���Ӑ�i�ږ�
		appStruct.setl_ITEM_NAME(tempStruct.getl_ESTIMATE_ITEM_NAME());                             // �i�ږ�
		appStruct.setl_ODR_ACPT_DATE(tempStruct.getl_ODR_ACPT_DATE());                              // �󒍓�
		appStruct.setl_JOB_ODR_CD(tempStruct.getl_JOB_ODR_CD());                                    // ����
		appStruct.setl_JOB_ODR_QTY(tempStruct.getl_ESTIMATE_QTY());                                 // ��z����
		appStruct.setl_JOB_ODR_DLV_DATE(tempStruct.getl_JOB_ODR_DLV_DATE());                        // ���Ԕ[��
		appStruct.setl_ALC_GRP_CD(tempStruct.getl_ALC_GRP_CD());                                    // �����O���[�v�R�[�h
		appStruct.setl_REMARKS(tempStruct.getl_REMARKS());                                          // ���l
		appStruct.seth_ODR_NO(tempStruct.getl_ODR_NO());                                            // �󒍔ԍ�
		appStruct.setl_PROJECT_CD(tempStruct.getPROJECT_CD());                                      // �Č��ԍ�
		appStruct.setl_ESTIMATE_NO(tempStruct.getESTIMATE_NO());                                    // ���ϔԍ�
		appStruct.setl_DETAL_NO(tempStruct.getl_DETAL_NO());                                        // ���הԍ�	
		appStruct.setl_h_ESTIMATE_TYPE(tempStruct.getl_h_ESTIMATE_TYPE()) ;                         // ��z�i�ڎ�	
		appStruct.setl_ESTIMATE_TYPE(tempStruct.getl_ESTIMATE_TYPE()) ;                             // ��z�i�ڎ�	
    	appStruct.setl_OWN_PERSON_CD(tempStruct.getl_OWN_PERSON_CD()) ;                             // �󒍒S���҃R�[�h
    	appStruct.setl_OWN_ORG_CD(tempStruct.getl_OWN_ORG_CD()) ;                                   // �󒍒S������R�[�h
		
	}
	//Add Anken End   20140319 hui-x
	//Add Nec Start 20140616
	/**
	 * KQ0090010Struct�̑����ɂ��AKQ0010030Struct�̑������Z�b�g
	 * @param appStruct
	 * @param tempStruct
	 */
	private void copyToAppStruct(KQ0010030Struct appStruct,KQ0090010Struct tempStruct){
		//���L
		appStruct.setl_ODR_TYP("3");                                                              // �����敪
		appStruct.setl_SPCL_PRICE_TYP("1");                   	                                  // ���l�敪
		appStruct.setl_DEPO_TYP("10");                                                            // �a���q�ɋ敪
		appStruct.setl_CUST_ITEM_CD("");                                                          // ���Ӑ�i�ڔԍ�
		appStruct.setl_h_ESTIMATE_TYPE("3") ;                                                     // ��z�i�ڎ�˂R�F��݌ɕi
		//��݌ɕi���
		appStruct.setl_CUST_ODR_NO(tempStruct.getCUST_ODR_NO());                                  // ���Ӑ撍���ԍ�
		appStruct.setl_ITEM_CD(tempStruct.getITEM_CD());                                          // �i�ڔԍ�
		appStruct.setl_ITEM_NAME(tempStruct.getITEM_NAME());                                      // �i�ږ�
		appStruct.setl_CUST_CD(tempStruct.getCUST_CD());                                          // ���Ӑ�R�[�h
		appStruct.setl_CUST_ANAME(tempStruct.getCUST_ANAME());                                    // ���Ӑ於
		appStruct.setl_DESINATED_DLV_DATE(tempStruct.getDESINATED_DLV_DATE());                    // �w��[��
		appStruct.setl_ODR_QTY(tempStruct.getODR_QTY());                                          // �󒍐���
		appStruct.setl_UNIT_CD(tempStruct.getSTOCK_UNIT());                                       // �P��
		appStruct.setl_ODR_UNIT_PRICE(tempStruct.getODR_UNIT_PRICE());                            // �P��
		appStruct.setl_ODR_ACPT_DATE(tempStruct.getODR_ACPT_DATE());                              // �󒍓�
		appStruct.setl_REMARKS(tempStruct.getREMARKS());                                          // ���l
		appStruct.seth_ODR_NO(tempStruct.getODR_NO());                                            // �󒍔ԍ�
    	appStruct.setl_OWN_PERSON_CD(tempStruct.getl_OWN_PERSON_CD()) ;                           // ���Ў󒍒S���҃R�[�h
		appStruct.setl_OWN_ORG_CD(tempStruct.getl_OWN_ORG_CD());                                  // ���Ў󒍒S���҃R�[�h
		appStruct.setl_ORGN_ODR_NO(tempStruct.getORGN_ODR_NO());                                  // ���󒍔ԍ�       �˔�݌ɕi�󒍐�pADD
		appStruct.setl_ADD_ODR_FLG(tempStruct.getw_ADD_ODR_FLG());                                // ���z�󒍃t���O   �˔�݌ɕi�󒍐�pADD
		
	}
	//Add Nec End   20140616x
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try {
            //  ���X�g���N���A
			if(list == null){
				list = new ArrayList();
			}else{
				list.clear();
			}
			// ���F�����p�̃��X�g
			List apprPowerList = null;
			// ���O�C�����[�U�[����Ɂm���[�U�}�X�^�n���F�������`�F�b�N
			struct.setLOGIN_USER_CD(this.getsysUSER_CD());
			apprPowerList = entity.mcheckUSER_MST.read(conn, struct);
			if(apprPowerList.isEmpty()){
				setWarnMessage("AZ00037",struct.getLOGIN_USER_CD());
			}else{
				struct.seth_APPR_POWER_TYP(((KQ0010030Struct)apprPowerList.get(0)).geth_APPR_POWER_TYP());
				if("0".equals(struct.geth_APPR_POWER_TYP())){
					setWarnMessage("AZ00037",struct.getLOGIN_USER_CD());
				}
			}

			// �����p�^�[�����擾
			if("true".equals(struct.getr1_FILTER1())){
				struct.seth_SELECT_TYP("1");
			}else if("true".equals(struct.getr2_FILTER1())){
				struct.seth_SELECT_TYP("2");
			}else if("true".equals(struct.getr3_FILTER1())){
				struct.seth_SELECT_TYP("3");
			}
			int maxLine = sp.getMaxLine(conn,10);
	         if(maxLine !=0){
            	 struct.setROW_COUNT(String.valueOf(maxLine));
             }else{
            	 struct.setROW_COUNT(null);
             }
			List resultList= null;
			// �g�������F�˗���������
			if("1".equals(struct.geth_SELECT_TYP())){
				resultList = entity.mselectModel1Cnt.read(conn,struct);
			}else if("2".equals(struct.geth_SELECT_TYP())){
				resultList = entity.mselectModel2Cnt.read(conn,struct);
			}else{
				resultList = entity.mselectModel3Cnt.read(conn,struct);
			}
			 int rowCount = Integer.parseInt(((KQ0010030Struct)resultList.get(0)).getl_COUNT()); 
			// �G���[
			if(rowCount == 0){
                setErrorMessage("ZZ06001");
                setReadStatus(NOT_FOUND);
				setList(null);
                return ;
			}	
			 //�\���Ώۂ̃f�[�^���ő�\�������𒴂����ꍇ�B
			if(maxLine != 0 && rowCount == maxLine+1){			
				ExpjMessage emsg = new ExpjMessage("ZZ01115",String.valueOf(maxLine));
				msgStruct.addError( emsg );
				sysLog.warning(emsg, getsysUSER_CD());
				// ������Ԃ��u�ő�s���I�[�o�[�v�ɐݒ�
				setReadStatus(TOO_MANY);
				setList(null);
				return;
			}
			// �˗���������
			selectApprInfo();
		    //������Ԃ��u�Ǎ������v�ɐݒ�
			setReadStatus(NORMAL);
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * �I�����F�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlApprAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlApprAssort");
			//{{user_implement_dev:<controlApprAssort>
		TranAppr tranAppr = new TranAppr(conn,this.getsysUSER_CD(),this.getScreenId());
		List tran_src_lst = null;                                           // ���F�˗���񃊃X�g
		List tempList = null;  
		KQ0010030Struct tempStruct = new KQ0010030Struct();                 // �󒍏��Fstruct�Ώ� 
		KQ0010010Struct kq0010010struct = new KQ0010010Struct();            // �󒍓o�^struct�Ώ�
		KQ0010020Struct kq0010020struct = new KQ0010020Struct();            // �󒍏��C��struct�Ώ�
		KQ0010010Control kq0010010control = new KQ0010010Control();         // �󒍓o�^control�Ώ�
		KQ0010020Control kq0010020control = new KQ0010020Control();         // �󒍏��C��control�Ώ�
		//Add Anken Start   20140319 hui-x
		KM0030010Struct km0030010Struct = new KM0030010Struct();            // �Č��󒍓o�^struct�Ώ�
		KM0030010Control km0030010Control = new KM0030010Control();         // �Č��󒍓o�^control�Ώ�
		//Add Anken End   20140319 hui-x
		//Add Nec Start 20140616
		KQ0090010Struct kq0090010Struct = new KQ0090010Struct();            // ��݌ɕi�󒍓o�^struct�Ώ�
		KQ0090010Control kq0090010Control = new KQ0090010Control();         // ��݌ɕi�󒍓o�^control�Ώ�
		//Add Nec End 20140616
		try {
		// �˗��ҏ��F�ғ��ꋖ�`�F�b�N
		if(!check()){
			return;
		}
		List apprID_lst = struct.getList_h_APPR_ID();                      // ���FID���X�g
		List screen_url_lst = struct.getList_h_SCREEN_URL();                //�@���URL���X�g 
		List proc_typ_lst = struct.getList_h_PROC_TYP();                    //�@�����敪�@1:�o�^�@�@2:�X�V�@3:�폜
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		
		// �X�V���`�F�b�N
		for(int i=0;i<apprID_lst.size();i++){
			tempStruct.seth_APPR_ID((String) apprID_lst.get(i));                         // ���FID��ݒ�
			tempStruct.seth_MODIFY_COUNT((String) modifycount_lst.get(i));               // �X�V����ݒ�
			// ����
			tempList = entity.mcheckMODIFY_COUNT.read(conn,tempStruct);
			if(tempList.isEmpty()){
				setErrorMessage("ZZ01105");
				return ;
			}
		}
		// �I���f�[�^�����F 
		for(int i = 0;i<apprID_lst.size();i++){
			// 
			String appr_id = (String) apprID_lst.get(i);
			tempStruct.seth_APPR_ID(appr_id);
			tran_src_lst = entity.mselectT_TRAN_SRC.read(conn, tempStruct);

			// �󒍓o�^�f�[�^����			
			if(screen_url_lst.get(i).equals("KQ0010010Servlet")){
				for(int j=0;j<tran_src_lst.size();j++){
					//�@�������l���Z�b�g
					if(((KQ0010030Struct)tran_src_lst.get(j)).getFIELD_FLG().equals("2")){
						settoStruct(kq0010010control,(KQ0010030Struct)tran_src_lst.get(j));
					}else{
						//�@��ʃf�[�^���Z�b�g
						settoStruct(kq0010010struct,(KQ0010030Struct)tran_src_lst.get(j));
					}
				}
				kq0010010control.set_APR_ODR("3");                       // �󒍃f�[�^�ă`�F�b�N�p
				kq0010010control.struct = kq0010010struct;               // �󒍓o�^struct�Ώ�
				kq0010010control.list = new ArrayList();                 // �󒍓o�^���X�g    
				kq0010010control.list.add(kq0010010struct);              // �f�[�^�ǉ�              
				kq0010010control.conn = conn;                            // DB
				kq0010010control.setBusiness(this.business);             // �Ɩ����
				
				kq0010010control.createMsgStruct();                      // ���b�Z�W�[
				//kq0010010control.beginTransaction();                     // �V�X�e�����t�擾
				kq0010010control.control_eventHandller("Insert");        // �󒍓o�^�̓o�^�������s��
				msgStruct = kq0010010control.getMsgStruct();             // ���b�Z�W�[��߂�
				
				//Mod Anken Start   20140319 hui-x
//			}else{
//				// �󒍏��C������			
//				for(int j=0;j<tran_src_lst.size();j++){
//					if(((KQ0010030Struct)tran_src_lst.get(j)).getFIELD_FLG().equals("2")){
//						//�@�������l���Z�b�g
//						settoStruct(kq0010020control,(KQ0010030Struct)tran_src_lst.get(j));
//					}else{
//						//�@��ʃf�[�^���Z�b�g
//						settoStruct(kq0010020struct,(KQ0010030Struct)tran_src_lst.get(j));
//					}
//				}
//				kq0010020control.struct = kq0010020struct;               // �󒍏��C��struct�Ώ�
//				kq0010020control.list = new ArrayList();                 // �󒍏��C�����X�g    
//				kq0010020control.list.add(kq0010020struct);              // �f�[�^�ǉ�         
//				kq0010020control.conn = conn;                            // DB
//				kq0010020control.setBusiness(this.business);             // �Ɩ����
//				
//				kq0010020control.createMsgStruct();                      // ���b�Z�W�[
//				kq0010020control.beginTransaction();                     // �V�X�e�����t�擾
//				// �󒍏��C���̍X�V�������s��
//				if(((String)proc_typ_lst.get(i)).equals("2")){
//					kq0010020control.control_eventHandller("Update");
//				}else{	
//					// �󒍏��C���̍폜�������s��
//					kq0010020control.control_eventHandller("Delete");
//				}
//				msgStruct = kq0010020control.getMsgStruct();             // ���b�Z�W�[��߂�
//			} 
			}else if(screen_url_lst.get(i).equals("KQ0010020Servlet")) {
				// �󒍏��C������			
				for(int j=0;j<tran_src_lst.size();j++){
					if(((KQ0010030Struct)tran_src_lst.get(j)).getFIELD_FLG().equals("2")){
						//�@�������l���Z�b�g
						settoStruct(kq0010020control,(KQ0010030Struct)tran_src_lst.get(j));
					}else{
						//�@��ʃf�[�^���Z�b�g
						settoStruct(kq0010020struct,(KQ0010030Struct)tran_src_lst.get(j));
					}
				}
				kq0010020control.struct = kq0010020struct;               // �󒍏��C��struct�Ώ�
				kq0010020control.list = new ArrayList();                 // �󒍏��C�����X�g    
				kq0010020control.list.add(kq0010020struct);              // �f�[�^�ǉ�         
				kq0010020control.conn = conn;                            // DB
				kq0010020control.setBusiness(this.business);             // �Ɩ����
				
				kq0010020control.createMsgStruct();                      // ���b�Z�W�[
				kq0010020control.beginTransaction();                     // �V�X�e�����t�擾
				
				if(((String)proc_typ_lst.get(i)).equals("2")){
					kq0010020control.control_eventHandller("Update");
				}else{	
					// �󒍏��C���̍폜�������s��
					kq0010020control.control_eventHandller("Delete");
				}
				msgStruct = kq0010020control.getMsgStruct();             // ���b�Z�W�[��߂�
			} else if(screen_url_lst.get(i).equals("KM0030010Servlet")){
				   // �Č��󒍓o�^�f�[�^����
					for(int j=0;j<tran_src_lst.size();j++){
						//�@�������l���Z�b�g
						if(((KQ0010030Struct)tran_src_lst.get(j)).getFIELD_FLG().equals("2")){
							settoStruct(km0030010Control,(KQ0010030Struct)tran_src_lst.get(j));
						}else{
							//�@��ʃf�[�^���Z�b�g
							settoStruct(km0030010Struct,(KQ0010030Struct)tran_src_lst.get(j));
						}
					}
					km0030010Control.setStruct(km0030010Struct);           	    // �Č��󒍓o�^struct�Ώ�
					km0030010Struct.seth_APR_ODR("0");
					km0030010Struct.seth_UPDATE_FLG("1");
					List list = new ArrayList();               					// �Č��󒍓o�^���X�g    
					list.add(km0030010Struct);									// �f�[�^�ǉ�           
					km0030010Control.setList(list);
					km0030010Control.connect() ;                       		    // DB
					km0030010Control.setBusiness(this.business);				// �Ɩ����
					
					km0030010Control.createMsgStruct();                		    // ���b�Z�W�[
					km0030010Control.beginTransaction();               		    // �V�X�e�����t�擾
					
					if(((String)proc_typ_lst.get(i)).equals("1")){
						// �Č��󒍓o�^�̓o�^�������s��
						km0030010Control.control_eventHandller("Insert");       
					}else if(((String)proc_typ_lst.get(i)).equals("2")){
						// �Č��󒍓o�^�̍X�V�������s��
						km0030010Control.control_eventHandller("Update");
					}else{	
						// �Č��󒍓o�^�̍폜�������s��
						km0030010Control.control_eventHandller("Delete");
					}

					msgStruct = km0030010Control.getMsgStruct();             // ���b�Z�W�[��߂�
			}
			//Mod Anken End   20140319 hui-x
			//Add Nec 20140616 STR
			else if(screen_url_lst.get(i).equals("KQ0090010Servlet")){
				   // ��݌ɕi_�󒍓o�^�f�[�^����
					for(int j=0;j<tran_src_lst.size();j++){
						//�@�������l���Z�b�g
						if(((KQ0010030Struct)tran_src_lst.get(j)).getFIELD_FLG().equals("2")){
							settoStruct(kq0090010Control,(KQ0010030Struct)tran_src_lst.get(j));
						}else{
							//�@��ʃf�[�^���Z�b�g
							settoStruct(kq0090010Struct,(KQ0010030Struct)tran_src_lst.get(j));
						}
					}
					kq0090010Control.setStruct(kq0090010Struct);           	    // ��݌ɕi�󒍓o�^struct�Ώ�
					kq0090010Struct.seth_APR_ODR("0");
					//kq0090010Struct.seth_UPDATE_FLG("1");
					List list = new ArrayList();               					// ��݌ɕi�󒍓o�^���X�g    
					list.add(kq0090010Struct);									// �f�[�^�ǉ�           
					kq0090010Control.setList(list);
					kq0090010Control.connect() ;                       		    // DB
					kq0090010Control.setBusiness(this.business);				// �Ɩ����
					
					kq0090010Control.createMsgStruct();                		    // ���b�Z�W�[
					kq0090010Control.beginTransaction();               		    // �V�X�e�����t�擾
					
					if(((String)proc_typ_lst.get(i)).equals("1")){
						// ��݌ɕi�󒍓o�^�̓o�^�������s��
						kq0090010Control.control_eventHandller("Insert");       
					}else if(((String)proc_typ_lst.get(i)).equals("2")){
						// ��݌ɕi�󒍓o�^�̍X�V�������s��
						kq0090010Control.control_eventHandller("Update");
					}else{	
						// ��݌ɕi�󒍓o�^�̍폜�������s��
						kq0090010Control.control_eventHandller("Delete");
					}

					msgStruct = kq0090010Control.getMsgStruct();             // ���b�Z�W�[��߂�
			}
			//Add Nec 20140616 END
			
			// �G���[
			if(msgStruct.hasError()){
				return;
			}
			// ���F�˗������폜
			tranAppr.deleteTranSrc(appr_id);
			tranAppr.deleteTranApr(appr_id);
		}
		conn.commit();
		// �ēǍ�
		controlSelect();
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlApprAssort>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlApprAssort");

		return;
	}

	/**
	 * �I��ۗ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReserveAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlReserveAssort");
			//{{user_implement_dev:<controlReserveAssort>
		TranAppr tranAppr = new TranAppr(conn,this.getsysUSER_CD(),this.getScreenId());
		List apprID_lst = struct.getList_h_APPR_ID();
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		List tempList = null;                                             // �X�V���`�F�b�N�p���X�g
		KQ0010030Struct tempStruct = new KQ0010030Struct();               // �X�V���`�F�b�N�p�I�u�W�F�N�g
		try {
			// �˗��ҏ��F�ғ��ꋖ�`�F�b�N
			if(!check()){
				return;
			}
			// �X�V���`�F�b�N
			for(int i=0;i<apprID_lst.size();i++){
					tempStruct.seth_APPR_ID((String) apprID_lst.get(i));                         // ���FID��ݒ�
					tempStruct.seth_MODIFY_COUNT((String) modifycount_lst.get(i));               // �X�V����ݒ�
					// ����
					tempList = entity.mcheckMODIFY_COUNT.read(conn,tempStruct);
					if(tempList.isEmpty()){
						setErrorMessage("ZZ01105");
						return ;
					}
			}
			// �I���f�[�^��ۗ�
			for(int i=0;i<apprID_lst.size();i++){
				tranAppr.updateTranApr((String)apprID_lst.get(i), "2", this.getsysUSER_CD(), struct.getRESERVE_CAUSE());
			}
			conn.commit();
			struct.setRESERVE_CAUSE("");
			// �ēǍ�
			controlSelect();
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlReserveAssort>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlReserveAssort");

		return;
	}

	/**
	 * �I��ۗ������{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlReserveDelAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlReserveDelAssort");
			//{{user_implement_dev:<controlReserveDelAssort>
		TranAppr tranAppr = new TranAppr(conn,this.getsysUSER_CD(),this.getScreenId());
		List apprID_lst = struct.getList_h_APPR_ID();
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		List tempList = null;                                             // �X�V���`�F�b�N�p���X�g
		KQ0010030Struct tempStruct = new KQ0010030Struct();               // �X�V���`�F�b�N�p�I�u�W�F�N�g
		try {

		// �˗��ҏ��F�ғ��ꋖ�`�F�b�N
		if(!check()){
			return;
		}

		// �X�V���`�F�b�N
		for(int i=0;i<apprID_lst.size();i++){
				tempStruct.seth_APPR_ID((String) apprID_lst.get(i));                         // ���FID��ݒ�
				tempStruct.seth_MODIFY_COUNT((String) modifycount_lst.get(i));               // �X�V����ݒ�
				// ����
				tempList = entity.mcheckMODIFY_COUNT.read(conn,tempStruct);
				if(tempList.isEmpty()){
					setErrorMessage("ZZ01105");
					return ;
				}
		}
		// �I���f�[�^��ۗ�����
		for(int i=0;i<apprID_lst.size();i++){
			tranAppr.updateTranApr((String)apprID_lst.get(i), "1", "", "");
		}
		conn.commit();
		// �ۗ����R���N���A
		struct.setRESERVE_CAUSE("");
		// �ēǍ�
		controlSelect();
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlReserveDelAssort>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlReserveDelAssort");

		return;
	}

	/**
	 * �I���˗��폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlApprDelAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlApprDelAssort");
			//{{user_implement_dev:<controlApprDelAssort>
		TranAppr tranAppr = new TranAppr(conn,this.getsysUSER_CD(),this.getScreenId());
		List apprID_lst = struct.getList_h_APPR_ID();
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		List tempList = null;                                             // �X�V���`�F�b�N�p���X�g
		KQ0010030Struct tempStruct = new KQ0010030Struct();               // �X�V���`�F�b�N�p�I�u�W�F�N�g
		try {
			
			// �X�V���`�F�b�N
			for(int i=0;i<apprID_lst.size();i++){
					tempStruct.seth_APPR_ID((String) apprID_lst.get(i));                         // ���FID��ݒ�
					tempStruct.seth_MODIFY_COUNT((String) modifycount_lst.get(i));               // �X�V����ݒ�
					// ����
					tempList = entity.mcheckMODIFY_COUNT.read(conn,tempStruct);
					if(tempList.isEmpty()){
						setErrorMessage("ZZ01105");
						return ;
					}
			}
			// �I���˗��f�[�^���폜
			for(int i=0;i<apprID_lst.size();i++){
				tranAppr.deleteTranSrc((String)apprID_lst.get(i));
				tranAppr.deleteTranApr((String)apprID_lst.get(i));
			}
			conn.commit();
			struct.setRESERVE_CAUSE("");
			// �ēǍ�
			controlSelect();
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlApprDelAssort>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlApprDelAssort");

		return;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlCheckClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");
			//{{user_implement_dev:<controlCheckClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlCheckClear>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");

		return;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		// ���X�g�N���A
		if(list != null){
			list.clear();
		}
		struct.seth_REQUEST_APPR_SAME(_REQUEST_APPR_SAME);
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlClose>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ���׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlClickDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClickDetail");
			//{{user_implement_dev:<controlClickDetail>
		
		try{
			KQ0010030Struct oldStruct = new KQ0010030Struct();
			List oldDateList = null;
			if(!"1".equals(struct.geth_PROC_TYP())){
	            // �ύX�O�f�[�^���X�g���擾
				//Mod Anken Start   20140509 hui-x
				//oldDateList = entity.mselectMSTINFO.read(conn, struct);

				if( (null != struct.getl_h_ESTIMATE_TYPE() && !"".equals(struct.getl_h_ESTIMATE_TYPE()) && "2".equals(struct.getl_h_ESTIMATE_TYPE()) ) ||
				   (null != struct.getl_h_ESTIMATE_TYPE() && !"".equals(struct.getl_h_ESTIMATE_TYPE()) && "3".equals(struct.getl_h_ESTIMATE_TYPE()) ) )
				{
					oldDateList = entity.mselectT_ODR_UNSTOCK.read(conn, struct);
				}else {
					oldDateList = entity.mselectMSTINFO.read(conn, struct);
				}
				
				//Mod Anken End   20140509 hui-x
			}
		    
			//�@�ύX�O�f�[�^�I�u�W�F�N�g��ݒ�
			if (oldDateList!=null && oldDateList.size()>0) {
				oldStruct = (KQ0010030Struct) oldDateList.get(0);
				struct.setd_OLD_ODR_NO((oldStruct.getd_OLD_ODR_NO()==null?"":oldStruct.getd_OLD_ODR_NO()));                         // �󒍔ԍ�
				struct.setd_OLD_ODR_TYP((oldStruct.getd_OLD_ODR_TYP()==null?"":oldStruct.getd_OLD_ODR_TYP()));                      // �󒍋敪
				struct.setd_OLD_CUST_ODR_NO((oldStruct.getd_OLD_CUST_ODR_NO()==null?"":oldStruct.getd_OLD_CUST_ODR_NO()));          // ���Ӑ撍���ԍ�
				struct.setd_OLD_CUST_CD((oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD()));                      // ���Ӑ�R�[�h
				struct.setd_OLD_CUST_ITEM_CD((oldStruct.getd_OLD_CUST_ITEM_CD()==null?"":oldStruct.getd_OLD_CUST_ITEM_CD()));       // ���Ӑ�i�ڔԍ�
				struct.setd_OLD_DLV_LOC_CD((oldStruct.getd_OLD_DLV_LOC_CD()==null?"":oldStruct.getd_OLD_DLV_LOC_CD()));             // �[�i�ꏊ�R�[�h
				struct.setd_OLD_ODR_QTY((oldStruct.getd_OLD_ODR_QTY()==null?"":oldStruct.getd_OLD_ODR_QTY()));                      // �󒍐���
				struct.setd_OLD_DESINATED_DLV_DATE((oldStruct.getd_OLD_DESINATED_DLV_DATE()==null?"":oldStruct.getd_OLD_DESINATED_DLV_DATE())); // �w��[��
				struct.setd_OLD_SPCL_PRICE_TYP((oldStruct.getd_OLD_SPCL_PRICE_TYP()==null?"":oldStruct.getd_OLD_SPCL_PRICE_TYP()));  // ���l�敪
				struct.setd_OLD_ODR_UNIT_PRICE((oldStruct.getd_OLD_ODR_UNIT_PRICE()==null?"":oldStruct.getd_OLD_ODR_UNIT_PRICE()));  // �P��
				struct.setd_OLD_REMARKS((oldStruct.getd_OLD_REMARKS()==null?"":oldStruct.getd_OLD_REMARKS()));                       // ���l
			}else{
				struct.setd_OLD_ODR_NO("");
				struct.setd_OLD_ODR_TYP("");
				struct.setd_OLD_CUST_ODR_NO("");
				struct.setd_OLD_CUST_CD("");
				struct.setd_OLD_CUST_ITEM_CD("");
				struct.setd_OLD_DLV_LOC_CD("");
				struct.setd_OLD_ODR_QTY("");
				struct.setd_OLD_DESINATED_DLV_DATE("");
				struct.setd_OLD_SPCL_PRICE_TYP("");
				struct.setd_OLD_ODR_UNIT_PRICE("");
				struct.setd_OLD_REMARKS("");
			}
			// �@�ύX��f�[�^�I�u�W�F�N�g��ݒ�
			if(!"3".equals(struct.geth_PROC_TYP())){
				struct.setd_NEW_ODR_NO(struct.geth_ODR_NO());                            // �󒍔ԍ�
				struct.setd_NEW_ODR_TYP(struct.getl_ODR_TYP());                          // �󒍋敪
				struct.setd_NEW_CUST_ODR_NO(struct.getl_CUST_ODR_NO());                  // ���Ӑ撍���ԍ�
				struct.setd_NEW_CUST_CD(struct.getl_CUST_CD());                          // ���Ӑ�R�[�h
				struct.setd_NEW_CUST_ITEM_CD(struct.getl_CUST_ITEM_CD());                // ���Ӑ�i�ڔԍ�
				struct.setd_NEW_DLV_LOC_CD(struct.getl_DLV_LOC_CD());                    // �[�i�ꏊ�R�[�h
				struct.setd_NEW_ODR_QTY(struct.getl_ODR_QTY());                          // �󒍐���
				struct.setd_NEW_DESINATED_DLV_DATE(struct.getl_DESINATED_DLV_DATE());    // �w��[��
				struct.setd_NEW_SPCL_PRICE_TYP(struct.getl_SPCL_PRICE_TYP());            // ���l�敪
				struct.setd_NEW_ODR_UNIT_PRICE(struct.getl_ODR_UNIT_PRICE());            // �P��
				struct.setd_NEW_REMARKS(struct.getl_REMARKS());                          // ���l
			} 
			else{
				struct.setd_NEW_ODR_NO("");
				struct.setd_NEW_ODR_TYP("");
				struct.setd_NEW_CUST_ODR_NO("");
				struct.setd_NEW_CUST_CD("");
				struct.setd_NEW_CUST_ITEM_CD("");
				struct.setd_NEW_DLV_LOC_CD("");
				struct.setd_NEW_ODR_QTY("");
				struct.setd_NEW_DESINATED_DLV_DATE("");
				struct.setd_NEW_SPCL_PRICE_TYP("");
				struct.setd_NEW_ODR_UNIT_PRICE("");
				struct.setd_NEW_REMARKS("");
			}
			// �����敪
			struct.setd_OLD_ODR_TYP(getTypeName(_ODR_ODR_TYP,struct.getd_OLD_ODR_TYP()));
			struct.setd_NEW_ODR_TYP(getTypeName(_ODR_ODR_TYP,struct.getd_NEW_ODR_TYP()));
			// ���l�敪 
			struct.setd_OLD_SPCL_PRICE_TYP(getTypeName(_ODR_SPCL_PRICE,struct.getd_OLD_SPCL_PRICE_TYP()));
			struct.setd_NEW_SPCL_PRICE_TYP(getTypeName(_ODR_SPCL_PRICE,struct.getd_NEW_SPCL_PRICE_TYP()));
			//	  �X�V�̏ꍇ�A�ύX�ς݂�ݒ�
			if("2".equals(struct.geth_PROC_TYP())){
				// �󒍔ԍ��̕ύX�L���t���O
				if (!struct.getd_OLD_ODR_NO().equals(struct.getd_NEW_ODR_NO())) {
					struct.setd_ODR_NO_CHANGE(changed);
				}
				// �󒍋敪�̕ύX�L���t���O
				if (!struct.getd_OLD_ODR_TYP().equals(struct.getd_NEW_ODR_TYP())) {
					struct.setd_ODR_TYP_CHANGE(changed);
				}
				// ���Ӑ撍���ԍ��̕ύX�L���t���O
				if (!struct.getd_OLD_CUST_ODR_NO().equals(struct.getd_NEW_CUST_ODR_NO())) {
					struct.setd_CUST_ODR_NO_CHANGE(changed);
				}
				// ���Ӑ�R�[�h�̕ύX�L���t���O
				if (!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())) {
					struct.setd_CUST_CD_CHANGE(changed);
				}
				// ���Ӑ�i�ڔԍ��̕ύX�L���t���O
				if (!struct.getd_OLD_CUST_ITEM_CD().equals(struct.getd_NEW_CUST_ITEM_CD())) {
					struct.setd_CUST_ITEM_CD_CHANGE(changed);
				}
				// �[�i�ꏊ�R�[�h�̕ύX�L���t���O
				if (!struct.getd_OLD_DLV_LOC_CD().equals(struct.getd_NEW_DLV_LOC_CD())) {
					struct.setd_DLV_LOC_CD_CHANGE(changed);
				}
				//Mod Anken Start   20140418 hui-x
				// �󒍐��ʂ̕ύX�L���t���O
//				if(Calculate.compare(struct.getd_OLD_ODR_QTY(), struct.getd_NEW_ODR_QTY()) != 0){
//					struct.setd_ODR_QTY_CHANGE(changed);
//				}
				if(Calculate.compare(struct.getd_OLD_ODR_QTY() == "" ? "0" : struct.getd_OLD_ODR_QTY(), struct.getd_NEW_ODR_QTY()) != 0){
					struct.setd_ODR_QTY_CHANGE(changed);
				}
				//Mod Anken End   20140418 hui-x
				// �w��[���̕ύX�L���t���O
				if (!struct.getd_OLD_DESINATED_DLV_DATE().equals(struct.getd_NEW_DESINATED_DLV_DATE())) {
					struct.setd_DESINATED_DLV_DATE_CHANGE(changed);
				}
				// ���l�敪�̕ύX�L���t���O
				if (!struct.getd_OLD_SPCL_PRICE_TYP().equals(struct.getd_NEW_SPCL_PRICE_TYP())) {
					struct.setd_SPCL_PRICE_TYP_CHANGE(changed);
				}
				//Mod Anken Start   20140418 hui-x
				// �P���̕ύX�L���t���O
//				if(Calculate.compare(struct.getd_OLD_ODR_UNIT_PRICE(), struct.getd_NEW_ODR_UNIT_PRICE()) != 0){
//					struct.setd_ODR_UNIT_PRICE_CHANGE(changed);
//				}
				if(Calculate.compare(struct.getd_OLD_ODR_UNIT_PRICE() == "" ? "0" : struct.getd_OLD_ODR_UNIT_PRICE(), struct.getd_NEW_ODR_UNIT_PRICE()) != 0){
					struct.setd_ODR_UNIT_PRICE_CHANGE(changed);
				}
				//Mod Anken End   20140418 hui-x
				// ���l�̕ύX�L���t���O
				if (!struct.getd_OLD_REMARKS().equals(struct.getd_NEW_REMARKS())) {
					struct.setd_REMARKS_CHANGE(changed);
				}
			}
		} catch(SQLException e) {
			// �G���[���b�Z�[�W�쐬
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlClickDetail>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClickDetail");

		return;
	}


	/**
	 * ���������Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * �����[�h���Ɏ��s����鏈���ł��B
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			/** �p�����[�^���擾 */
			privateConfig = new PrivateConfig(conn);
			String apr_odr = privateConfig.getString("APR_ODR");
			// �p�����[�^�u�󒍏��F�v���擾�ł��Ȃ������ꍇ
			if (apr_odr == null || "".equals(apr_odr)) {
				String locale = CoreTools.getLocale(struct.getsUser_ID());
				ResourceBundle messages = CoreTools.getResourceBundle(
						"ExpjMessage", locale);
				setErrorMessage("AZ00041", messages.getString("AZ00072"));
				// ������Ԃ��u���s�v�ɐݒ�
				setReadStatus(ERROR);
				return;
			} else if ("1".equals(apr_odr)) {
				// �P�̏ꍇ
				apr_odr = "1";
			} else {
				// �P�ȊO�̏ꍇ
				apr_odr = "0";
				setErrorMessage("KQ00336");
				// ������Ԃ��u���s�v�ɐݒ�
				setReadStatus(ERROR);
				return;
			}
			// �˗��ҏ��F�ғ��ꋖ��
			String request_Appr_Same = privateConfig.getString("REQUEST_APPR_SAME");
			// �p�����[�^�u�˗��ҏ��F�ғ��ꋖ�v���擾�ł��Ȃ������ꍇ
			if (request_Appr_Same == null || "".equals(request_Appr_Same)) {
				// �p�����[�^�u�˗��ҏ��F�ғ��ꋖ�v���擾�ł��Ȃ������ꍇ
				struct.seth_REQUEST_APPR_SAME("0");
				setErrorMessage("AA00212");
				setReadStatus(ERROR);
				struct.seth_REQUEST_APPR_SAME("0");
			} else if (!"1".equals(request_Appr_Same)) {
				// �P�ȊO�̏ꍇ
				struct.seth_REQUEST_APPR_SAME("0");
			} else {
				struct.seth_REQUEST_APPR_SAME("1");
			}
			set_REQUEST_APPR_SAME(request_Appr_Same);
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage("ZZ01006", " (SBM1093)�����[�h�����͎��s���܂����B");
			msgStruct.addWarn(emsg);
			sysLog.info(emsg, getsysUSER_CD());
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * �C�x���g�n���h���̑O�����ł��B
	 *
	 * @param buttun �{�^����
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			try {
			ComboBox comboController = new ComboBox(conn);
			// �����敪
			_PROC_TYP = comboController.getData("APPR_PROC_TYP");
			// ���F���
			_APPR_STATUS_TYP = comboController.getData("APPR_STATUS_TYP");
			// �����敪
			_ODR_ODR_TYP = comboController.getData("ODR_ODR_TYP");
			// ���l�敪
			_ODR_SPCL_PRICE = comboController.getData("ODR_SPCL_PRICE");
			// �a���q�ɋ敪
			_ODR_DEPO_TYP = comboController.getData("ODR_DEPO_TYP");
			} catch (SQLException e) {
				e.printStackTrace();
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("ApprAssort") ) {
				controlApprAssort();
			} else if( button.equals("ReserveAssort") ) {
				controlReserveAssort();
			} else if( button.equals("ReserveDelAssort") ) {
				controlReserveDelAssort();
			} else if( button.equals("ApprDelAssort") ) {
				controlApprDelAssort();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("CheckClear") ) {
				controlCheckClear();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("ClickDetail") ) {
				controlClickDetail();
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
//			throw new FoundationException("KQ0010030Control",e.getMessage(),"control_eventHandller���\�b�h�ŃG���[���������܂����B");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010030-E999","CSV�̏o�͏���"));
			throw new FoundationException("KQ0010030Control",e.getMessage(),"createDefaultCSV���\�b�h�ŃG���[���������܂����B");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010030-E999","�V�X�e�����t�̎擾����"));
				throw new FoundationException("KQ0010030Control","beginTransaction()","�V�X�e�����t�擾�����ŃG���[���������܂����B");
			}

			// Struct�ϐ��փf�[�^�̃Z�b�g
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010030-E999","�R���g���[���̃C�x���g����"));
			throw new FoundationException("KQ0010030Control",e.getMessage(),"beginTransaction���\�b�h�ŃG���[���������܂����B");
		}

		return;
	}

	//////////////////////////////
	/**
	 * �����o�ϐ��̒�`
	 */
	protected KQ0010030Entity entity;
	protected KQ0010030Struct struct;
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

		entity = new KQ0010030Entity();
		struct = new KQ0010030Struct();

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
	 * KQ0010030�N���X�̕W���R���X�g���N�^
	 */
	public KQ0010030Control() throws BusinessProcessException, FoundationException
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
				KQ0010030Struct key = (KQ0010030Struct)keyList.get(j);
				// ���b�Z�[�W�L�[���쐬����
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_FILTER1") && key.getr1_FILTER1() != null) {
					msgKey.setKeyValue("r1_FILTER1", key.getr1_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER1") && key.getr2_FILTER1() != null) {
					msgKey.setKeyValue("r2_FILTER1", key.getr2_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r3_FILTER1") && key.getr3_FILTER1() != null) {
					msgKey.setKeyValue("r3_FILTER1", key.getr3_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("h_SELECT_TYP") && key.geth_SELECT_TYP() != null) {
					msgKey.setKeyValue("h_SELECT_TYP", key.geth_SELECT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_REQUEST_APPR_SAME") && key.geth_REQUEST_APPR_SAME() != null) {
					msgKey.setKeyValue("h_REQUEST_APPR_SAME", key.geth_REQUEST_APPR_SAME());
				}
				if(msgKeyType.containsKeyColumn("RESERVE_CAUSE") && key.getRESERVE_CAUSE() != null) {
					msgKey.setKeyValue("RESERVE_CAUSE", key.getRESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_TYP_VALUE") && key.getl_PROC_TYP_VALUE() != null) {
					msgKey.setKeyValue("l_PROC_TYP_VALUE", key.getl_PROC_TYP_VALUE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_TYP_DN") && key.getl_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_ODR_TYP_DN", key.getl_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_TYP") && key.getl_ODR_TYP() != null) {
					msgKey.setKeyValue("l_ODR_TYP", key.getl_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO") && key.getl_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("l_CUST_ODR_NO", key.getl_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ANAME") && key.getl_CUST_ANAME() != null) {
					msgKey.setKeyValue("l_CUST_ANAME", key.getl_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_CD") && key.getl_UNIT_CD() != null) {
					msgKey.setKeyValue("l_UNIT_CD", key.getl_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE") && key.getl_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ODR_UNIT_PRICE", key.getl_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_UNIT") && key.getl_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_CUR_UNIT", key.getl_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP_DN") && key.getl_SPCL_PRICE_TYP_DN() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_TYP_DN", key.getl_SPCL_PRICE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP") && key.getl_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_TYP", key.getl_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD") && key.getl_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("l_DLV_LOC_CD", key.getl_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME") && key.getl_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("l_DLV_LOC_NAME", key.getl_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP_DN") && key.getl_DEPO_TYP_DN() != null) {
					msgKey.setKeyValue("l_DEPO_TYP_DN", key.getl_DEPO_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP") && key.getl_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_DEPO_TYP", key.getl_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE") && key.getl_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_DATE", key.getl_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY") && key.getl_JOB_ODR_QTY() != null) {
					msgKey.setKeyValue("l_JOB_ODR_QTY", key.getl_JOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE") && key.getl_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DLV_DATE", key.getl_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_CUS_DLV_KEY_CD") && key.getl_CUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("l_CUS_DLV_KEY_CD", key.getl_CUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUS_DLV_CD") && key.getl_CUS_DLV_CD() != null) {
					msgKey.setKeyValue("l_CUS_DLV_CD", key.getl_CUS_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_ODR_NO") && key.getd_NEW_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("d_NEW_CUST_ODR_NO", key.getd_NEW_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_ODR_NO_CHANGE") && key.getd_CUST_ODR_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_ODR_NO_CHANGE", key.getd_CUST_ODR_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_CD") && key.getd_NEW_CUST_CD() != null) {
					msgKey.setKeyValue("d_NEW_CUST_CD", key.getd_NEW_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_CD_CHANGE") && key.getd_CUST_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_CD_CHANGE", key.getd_CUST_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_ITEM_CD") && key.getd_NEW_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("d_NEW_CUST_ITEM_CD", key.getd_NEW_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_ITEM_CD_CHANGE") && key.getd_CUST_ITEM_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_ITEM_CD_CHANGE", key.getd_CUST_ITEM_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_DLV_LOC_CD_CHANGE") && key.getd_DLV_LOC_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_DLV_LOC_CD_CHANGE", key.getd_DLV_LOC_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ODR_QTY") && key.getd_NEW_ODR_QTY() != null) {
					msgKey.setKeyValue("d_NEW_ODR_QTY", key.getd_NEW_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_ODR_QTY_CHANGE") && key.getd_ODR_QTY_CHANGE() != null) {
					msgKey.setKeyValue("d_ODR_QTY_CHANGE", key.getd_ODR_QTY_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DESINATED_DLV_DATE") && key.getd_NEW_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("d_NEW_DESINATED_DLV_DATE", key.getd_NEW_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_DESINATED_DLV_DATE_CHANGE") && key.getd_DESINATED_DLV_DATE_CHANGE() != null) {
					msgKey.setKeyValue("d_DESINATED_DLV_DATE_CHANGE", key.getd_DESINATED_DLV_DATE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SPCL_PRICE_TYP") && key.getd_NEW_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("d_NEW_SPCL_PRICE_TYP", key.getd_NEW_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_SPCL_PRICE_TYP_CHANGE") && key.getd_SPCL_PRICE_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_SPCL_PRICE_TYP_CHANGE", key.getd_SPCL_PRICE_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ODR_UNIT_PRICE") && key.getd_NEW_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("d_NEW_ODR_UNIT_PRICE", key.getd_NEW_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("d_ODR_UNIT_PRICE_CHANGE") && key.getd_ODR_UNIT_PRICE_CHANGE() != null) {
					msgKey.setKeyValue("d_ODR_UNIT_PRICE_CHANGE", key.getd_ODR_UNIT_PRICE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_CD") && key.getd_NEW_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_NEW_DLV_LOC_CD", key.getd_NEW_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_REMARKS") && key.getd_NEW_REMARKS() != null) {
					msgKey.setKeyValue("d_NEW_REMARKS", key.getd_NEW_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("d_REMARKS_CHANGE") && key.getd_REMARKS_CHANGE() != null) {
					msgKey.setKeyValue("d_REMARKS_CHANGE", key.getd_REMARKS_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ODR_NO") && key.getd_NEW_ODR_NO() != null) {
					msgKey.setKeyValue("d_NEW_ODR_NO", key.getd_NEW_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("d_ODR_NO_CHANGE") && key.getd_ODR_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_ODR_NO_CHANGE", key.getd_ODR_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ODR_TYP") && key.getd_NEW_ODR_TYP() != null) {
					msgKey.setKeyValue("d_NEW_ODR_TYP", key.getd_NEW_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_ODR_TYP_CHANGE") && key.getd_ODR_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_ODR_TYP_CHANGE", key.getd_ODR_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS_NAME") && key.getl_STATUS_NAME() != null) {
					msgKey.setKeyValue("l_STATUS_NAME", key.getl_STATUS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PROJECT_CD") && key.getl_PROJECT_CD() != null) {
					msgKey.setKeyValue("l_PROJECT_CD", key.getl_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_NO") && key.getl_ESTIMATE_NO() != null) {
					msgKey.setKeyValue("l_ESTIMATE_NO", key.getl_ESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DETAL_NO") && key.getl_DETAL_NO() != null) {
					msgKey.setKeyValue("l_DETAL_NO", key.getl_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYPE") && key.getl_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("l_ESTIMATE_TYPE", key.getl_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE") && key.getl_h_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("l_h_ESTIMATE_TYPE", key.getl_h_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD") && key.getl_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_CD", key.getl_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD") && key.getl_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("l_OWN_ORG_CD", key.getl_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ORGN_ODR_NO") && key.getl_ORGN_ODR_NO() != null) {
					msgKey.setKeyValue("l_ORGN_ODR_NO", key.getl_ORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ADD_ODR_FLG") && key.getl_ADD_ODR_FLG() != null) {
					msgKey.setKeyValue("l_ADD_ODR_FLG", key.getl_ADD_ODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_h_ODR_TYP") && key.getl_h_ODR_TYP() != null) {
					msgKey.setKeyValue("l_h_ODR_TYP", key.getl_h_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_h_DEPO_TYP") && key.getl_h_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_h_DEPO_TYP", key.getl_h_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP") && key.geth_APPR_POWER_TYP() != null) {
					msgKey.setKeyValue("h_APPR_POWER_TYP", key.geth_APPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOGIN_USER_CD") && key.getLOGIN_USER_CD() != null) {
					msgKey.setKeyValue("LOGIN_USER_CD", key.getLOGIN_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("h_SCREEN_URL") && key.geth_SCREEN_URL() != null) {
					msgKey.setKeyValue("h_SCREEN_URL", key.geth_SCREEN_URL());
				}
				if(msgKeyType.containsKeyColumn("h_STATUS") && key.geth_STATUS() != null) {
					msgKey.setKeyValue("h_STATUS", key.geth_STATUS());
				}
				if(msgKeyType.containsKeyColumn("h_PROC_TYP") && key.geth_PROC_TYP() != null) {
					msgKey.setKeyValue("h_PROC_TYP", key.geth_PROC_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_REQUEST_BY") && key.getl_REQUEST_BY() != null) {
					msgKey.setKeyValue("l_REQUEST_BY", key.getl_REQUEST_BY());
				}
				if(msgKeyType.containsKeyColumn("l_REQUEST_BY_NAME") && key.getl_REQUEST_BY_NAME() != null) {
					msgKey.setKeyValue("l_REQUEST_BY_NAME", key.getl_REQUEST_BY_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_REQUEST_DATE") && key.getl_REQUEST_DATE() != null) {
					msgKey.setKeyValue("l_REQUEST_DATE", key.getl_REQUEST_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_REMARKS") && key.getl_APPR_REMARKS() != null) {
					msgKey.setKeyValue("l_APPR_REMARKS", key.getl_APPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_RESERVE_CAUSE") && key.getl_RESERVE_CAUSE() != null) {
					msgKey.setKeyValue("l_RESERVE_CAUSE", key.getl_RESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("START_DATE") && key.getSTART_DATE() != null) {
					msgKey.setKeyValue("START_DATE", key.getSTART_DATE());
				}
				if(msgKeyType.containsKeyColumn("END_DATE") && key.getEND_DATE() != null) {
					msgKey.setKeyValue("END_DATE", key.getEND_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("FIELD_NAME") && key.getFIELD_NAME() != null) {
					msgKey.setKeyValue("FIELD_NAME", key.getFIELD_NAME());
				}
				if(msgKeyType.containsKeyColumn("FIELD_VALUE") && key.getFIELD_VALUE() != null) {
					msgKey.setKeyValue("FIELD_VALUE", key.getFIELD_VALUE());
				}
				if(msgKeyType.containsKeyColumn("FIELD_FLG") && key.getFIELD_FLG() != null) {
					msgKey.setKeyValue("FIELD_FLG", key.getFIELD_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ODR_NO") && key.getd_OLD_ODR_NO() != null) {
					msgKey.setKeyValue("d_OLD_ODR_NO", key.getd_OLD_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ODR_TYP") && key.getd_OLD_ODR_TYP() != null) {
					msgKey.setKeyValue("d_OLD_ODR_TYP", key.getd_OLD_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_ODR_NO") && key.getd_OLD_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("d_OLD_CUST_ODR_NO", key.getd_OLD_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_CD") && key.getd_OLD_CUST_CD() != null) {
					msgKey.setKeyValue("d_OLD_CUST_CD", key.getd_OLD_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_ITEM_CD") && key.getd_OLD_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("d_OLD_CUST_ITEM_CD", key.getd_OLD_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_CD") && key.getd_OLD_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_OLD_DLV_LOC_CD", key.getd_OLD_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ODR_QTY") && key.getd_OLD_ODR_QTY() != null) {
					msgKey.setKeyValue("d_OLD_ODR_QTY", key.getd_OLD_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DESINATED_DLV_DATE") && key.getd_OLD_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("d_OLD_DESINATED_DLV_DATE", key.getd_OLD_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SPCL_PRICE_TYP") && key.getd_OLD_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("d_OLD_SPCL_PRICE_TYP", key.getd_OLD_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ODR_UNIT_PRICE") && key.getd_OLD_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("d_OLD_ODR_UNIT_PRICE", key.getd_OLD_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_REMARKS") && key.getd_OLD_REMARKS() != null) {
					msgKey.setKeyValue("d_OLD_REMARKS", key.getd_OLD_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_NO") && key.geth_ODR_NO() != null) {
					msgKey.setKeyValue("h_ODR_NO", key.geth_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CMPLT_FLG") && key.getl_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("l_ODR_CMPLT_FLG", key.getl_ODR_CMPLT_FLG());
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
					KQ0010030Struct key = new KQ0010030Struct();
					if(msgKeyType.containsKeyColumn("r1_FILTER1")) {
						key.setr1_FILTER1(msgKey.getKeyValue("r1_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER1")) {
						key.setr2_FILTER1(msgKey.getKeyValue("r2_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r3_FILTER1")) {
						key.setr3_FILTER1(msgKey.getKeyValue("r3_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("h_SELECT_TYP")) {
						key.seth_SELECT_TYP(msgKey.getKeyValue("h_SELECT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_REQUEST_APPR_SAME")) {
						key.seth_REQUEST_APPR_SAME(msgKey.getKeyValue("h_REQUEST_APPR_SAME"));
					}
					if(msgKeyType.containsKeyColumn("RESERVE_CAUSE")) {
						key.setRESERVE_CAUSE(msgKey.getKeyValue("RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_TYP_VALUE")) {
						key.setl_PROC_TYP_VALUE(msgKey.getKeyValue("l_PROC_TYP_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_TYP_DN")) {
						key.setl_ODR_TYP_DN(msgKey.getKeyValue("l_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_TYP")) {
						key.setl_ODR_TYP(msgKey.getKeyValue("l_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO")) {
						key.setl_CUST_ODR_NO(msgKey.getKeyValue("l_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ANAME")) {
						key.setl_CUST_ANAME(msgKey.getKeyValue("l_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_CD")) {
						key.setl_UNIT_CD(msgKey.getKeyValue("l_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE")) {
						key.setl_ODR_UNIT_PRICE(msgKey.getKeyValue("l_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_UNIT")) {
						key.setl_CUR_UNIT(msgKey.getKeyValue("l_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP_DN")) {
						key.setl_SPCL_PRICE_TYP_DN(msgKey.getKeyValue("l_SPCL_PRICE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP")) {
						key.setl_SPCL_PRICE_TYP(msgKey.getKeyValue("l_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD")) {
						key.setl_DLV_LOC_CD(msgKey.getKeyValue("l_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME")) {
						key.setl_DLV_LOC_NAME(msgKey.getKeyValue("l_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP_DN")) {
						key.setl_DEPO_TYP_DN(msgKey.getKeyValue("l_DEPO_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP")) {
						key.setl_DEPO_TYP(msgKey.getKeyValue("l_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE")) {
						key.setl_ODR_ACPT_DATE(msgKey.getKeyValue("l_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY")) {
						key.setl_JOB_ODR_QTY(msgKey.getKeyValue("l_JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE")) {
						key.setl_JOB_ODR_DLV_DATE(msgKey.getKeyValue("l_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_CUS_DLV_KEY_CD")) {
						key.setl_CUS_DLV_KEY_CD(msgKey.getKeyValue("l_CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUS_DLV_CD")) {
						key.setl_CUS_DLV_CD(msgKey.getKeyValue("l_CUS_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_ODR_NO")) {
						key.setd_NEW_CUST_ODR_NO(msgKey.getKeyValue("d_NEW_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_ODR_NO_CHANGE")) {
						key.setd_CUST_ODR_NO_CHANGE(msgKey.getKeyValue("d_CUST_ODR_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_CD")) {
						key.setd_NEW_CUST_CD(msgKey.getKeyValue("d_NEW_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_CD_CHANGE")) {
						key.setd_CUST_CD_CHANGE(msgKey.getKeyValue("d_CUST_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_ITEM_CD")) {
						key.setd_NEW_CUST_ITEM_CD(msgKey.getKeyValue("d_NEW_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_ITEM_CD_CHANGE")) {
						key.setd_CUST_ITEM_CD_CHANGE(msgKey.getKeyValue("d_CUST_ITEM_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_DLV_LOC_CD_CHANGE")) {
						key.setd_DLV_LOC_CD_CHANGE(msgKey.getKeyValue("d_DLV_LOC_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ODR_QTY")) {
						key.setd_NEW_ODR_QTY(msgKey.getKeyValue("d_NEW_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_ODR_QTY_CHANGE")) {
						key.setd_ODR_QTY_CHANGE(msgKey.getKeyValue("d_ODR_QTY_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DESINATED_DLV_DATE")) {
						key.setd_NEW_DESINATED_DLV_DATE(msgKey.getKeyValue("d_NEW_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_DESINATED_DLV_DATE_CHANGE")) {
						key.setd_DESINATED_DLV_DATE_CHANGE(msgKey.getKeyValue("d_DESINATED_DLV_DATE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SPCL_PRICE_TYP")) {
						key.setd_NEW_SPCL_PRICE_TYP(msgKey.getKeyValue("d_NEW_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_SPCL_PRICE_TYP_CHANGE")) {
						key.setd_SPCL_PRICE_TYP_CHANGE(msgKey.getKeyValue("d_SPCL_PRICE_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ODR_UNIT_PRICE")) {
						key.setd_NEW_ODR_UNIT_PRICE(msgKey.getKeyValue("d_NEW_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("d_ODR_UNIT_PRICE_CHANGE")) {
						key.setd_ODR_UNIT_PRICE_CHANGE(msgKey.getKeyValue("d_ODR_UNIT_PRICE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_CD")) {
						key.setd_NEW_DLV_LOC_CD(msgKey.getKeyValue("d_NEW_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_REMARKS")) {
						key.setd_NEW_REMARKS(msgKey.getKeyValue("d_NEW_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("d_REMARKS_CHANGE")) {
						key.setd_REMARKS_CHANGE(msgKey.getKeyValue("d_REMARKS_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ODR_NO")) {
						key.setd_NEW_ODR_NO(msgKey.getKeyValue("d_NEW_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_ODR_NO_CHANGE")) {
						key.setd_ODR_NO_CHANGE(msgKey.getKeyValue("d_ODR_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ODR_TYP")) {
						key.setd_NEW_ODR_TYP(msgKey.getKeyValue("d_NEW_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_ODR_TYP_CHANGE")) {
						key.setd_ODR_TYP_CHANGE(msgKey.getKeyValue("d_ODR_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS_NAME")) {
						key.setl_STATUS_NAME(msgKey.getKeyValue("l_STATUS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PROJECT_CD")) {
						key.setl_PROJECT_CD(msgKey.getKeyValue("l_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_NO")) {
						key.setl_ESTIMATE_NO(msgKey.getKeyValue("l_ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAL_NO")) {
						key.setl_DETAL_NO(msgKey.getKeyValue("l_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYPE")) {
						key.setl_ESTIMATE_TYPE(msgKey.getKeyValue("l_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE")) {
						key.setl_h_ESTIMATE_TYPE(msgKey.getKeyValue("l_h_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD")) {
						key.setl_OWN_PERSON_CD(msgKey.getKeyValue("l_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD")) {
						key.setl_OWN_ORG_CD(msgKey.getKeyValue("l_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ORGN_ODR_NO")) {
						key.setl_ORGN_ODR_NO(msgKey.getKeyValue("l_ORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ADD_ODR_FLG")) {
						key.setl_ADD_ODR_FLG(msgKey.getKeyValue("l_ADD_ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ODR_TYP")) {
						key.setl_h_ODR_TYP(msgKey.getKeyValue("l_h_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_h_DEPO_TYP")) {
						key.setl_h_DEPO_TYP(msgKey.getKeyValue("l_h_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP")) {
						key.seth_APPR_POWER_TYP(msgKey.getKeyValue("h_APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOGIN_USER_CD")) {
						key.setLOGIN_USER_CD(msgKey.getKeyValue("LOGIN_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREEN_URL")) {
						key.seth_SCREEN_URL(msgKey.getKeyValue("h_SCREEN_URL"));
					}
					if(msgKeyType.containsKeyColumn("h_STATUS")) {
						key.seth_STATUS(msgKey.getKeyValue("h_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("h_PROC_TYP")) {
						key.seth_PROC_TYP(msgKey.getKeyValue("h_PROC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_REQUEST_BY")) {
						key.setl_REQUEST_BY(msgKey.getKeyValue("l_REQUEST_BY"));
					}
					if(msgKeyType.containsKeyColumn("l_REQUEST_BY_NAME")) {
						key.setl_REQUEST_BY_NAME(msgKey.getKeyValue("l_REQUEST_BY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_REQUEST_DATE")) {
						key.setl_REQUEST_DATE(msgKey.getKeyValue("l_REQUEST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_REMARKS")) {
						key.setl_APPR_REMARKS(msgKey.getKeyValue("l_APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_RESERVE_CAUSE")) {
						key.setl_RESERVE_CAUSE(msgKey.getKeyValue("l_RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("START_DATE")) {
						key.setSTART_DATE(msgKey.getKeyValue("START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("END_DATE")) {
						key.setEND_DATE(msgKey.getKeyValue("END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("FIELD_NAME")) {
						key.setFIELD_NAME(msgKey.getKeyValue("FIELD_NAME"));
					}
					if(msgKeyType.containsKeyColumn("FIELD_VALUE")) {
						key.setFIELD_VALUE(msgKey.getKeyValue("FIELD_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("FIELD_FLG")) {
						key.setFIELD_FLG(msgKey.getKeyValue("FIELD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ODR_NO")) {
						key.setd_OLD_ODR_NO(msgKey.getKeyValue("d_OLD_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ODR_TYP")) {
						key.setd_OLD_ODR_TYP(msgKey.getKeyValue("d_OLD_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_ODR_NO")) {
						key.setd_OLD_CUST_ODR_NO(msgKey.getKeyValue("d_OLD_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_CD")) {
						key.setd_OLD_CUST_CD(msgKey.getKeyValue("d_OLD_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_ITEM_CD")) {
						key.setd_OLD_CUST_ITEM_CD(msgKey.getKeyValue("d_OLD_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_CD")) {
						key.setd_OLD_DLV_LOC_CD(msgKey.getKeyValue("d_OLD_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ODR_QTY")) {
						key.setd_OLD_ODR_QTY(msgKey.getKeyValue("d_OLD_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DESINATED_DLV_DATE")) {
						key.setd_OLD_DESINATED_DLV_DATE(msgKey.getKeyValue("d_OLD_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SPCL_PRICE_TYP")) {
						key.setd_OLD_SPCL_PRICE_TYP(msgKey.getKeyValue("d_OLD_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ODR_UNIT_PRICE")) {
						key.setd_OLD_ODR_UNIT_PRICE(msgKey.getKeyValue("d_OLD_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_REMARKS")) {
						key.setd_OLD_REMARKS(msgKey.getKeyValue("d_OLD_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_NO")) {
						key.seth_ODR_NO(msgKey.getKeyValue("h_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CMPLT_FLG")) {
						key.setl_ODR_CMPLT_FLG(msgKey.getKeyValue("l_ODR_CMPLT_FLG"));
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
