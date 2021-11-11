/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/SvfWrapper.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import com.nec.jp.orteus.expj.file.*;
import com.nec.jp.orteus.util.CoreTools;

import java.util.*;
import java.io.*;
import jp.co.fit.vfreport.*;

/**
 * ���V�X�e���r�u�e�̂��߂̒��[�쐬�p���b�p�[�N���X�B<BR>
 * ���[�J������ƃ����[�g���������Ő؂�ւ��Ďg�p���܂��B<BR>
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.9 $ $Date: 2014/11/04 02:03:12 $
 */
public class SvfWrapper {

	private int ret = 0;
	private Vrw32 svfLocal       = null;
	private SvfrClient svfRemote  = null;
	private String printType      = null;
	private String printer        = null;
	private String userCd         = null;
	private ResourceBundle bundle = SystemConfig.getBundle();
	private String acrobatPath    = SystemConfig.getProperty("ACROBAT_PATH",    bundle);
	private String acrobatOption1 = SystemConfig.getProperty("ACROBAT_OPTION1", bundle);
	private String acrobatOption2 = SystemConfig.getProperty("ACROBAT_OPTION2", bundle);
	private String frmPath        = SystemConfig.getProperty("FRM_PATH",        bundle);
	private String webRootPath    = SystemConfig.getProperty("WEBROOT",         bundle);
	private String pdfSpoolPath   = SystemConfig.getProperty("PDF_SPOOL_PATH",  bundle);
	private String pdfPath        = new String(webRootPath + pdfSpoolPath);
	private String SpoolHost      = new String("localhost");
	private String executeOutput  = null;
	private String pdfFilePath    = null;
	private String pdfFileName    = null;
	private String queryFileName  = null;
	private String frmFileName    = null;
	
	private String printMode      = null;
	private String locale         = null;
	private boolean multiLangFlg  = false;
	private String svfLocale      = null;
	private String encoding      = null;
	
	
	/**
	 * �I�u�W�F�N�g���\�z���܂��B
	 *
	 * @param  _printType ���[�o�̓^�C�v(0:���[�J������A1:�T�[�o����A2:�X�v�[�����)
	 * @param  _userCd ���[�U�R�[�h
	 * @param  _printer �o�͐�v�����^
	 */
	public SvfWrapper(String _printType, String _userCd, String _printer){
		try {
			printType = _printType;
			userCd = _userCd;
			printer = _printer;
			if ( "2".equals(printType) ) {	// �X�v�[������̏ꍇ
				SpoolHost = printer;
				svfRemote = new SvfrClient(SpoolHost);
			} else {
				svfLocal = new Vrw32();
			}
			
			printMode = PrintConfig.getPrintMode(bundle);
			locale = CoreTools.getLocale(userCd);
			
			ret = 0;
		} catch(Exception e) {
			ret = -1;
		}
	}

	/**
	 * ���P�[���ɂ��VrSetLocale�ɐݒ肷�郍�P�[����ݒ肵�܂��B
	 */
	private void setSvfLocale() {
		svfLocale = PrintConfig.convertOrteusLocaleToSvfLocale(locale);
	}

	/**
	 * ���P�[���ɂ��VrInit�ɐݒ肷��G���R�[�h��ݒ肵�܂��B
	 */
	private void setEncoding() {
		encoding = PrintConfig.getSvfEncodeByLocale(locale);
	}

	/**
	 * ������t���O��ݒ肵�܂��B</br>
	 * ������[�h��SVFX��������p�l���t�@�C���E�N�G���t�@�C�������݂���Ƃ�true�B
	 * ���̂Ƃ���false�B
	 *
	 * @param  printId1 ���[ID
	 * @param  queryId1 �N�G��ID
	 */
	private void setMultiLangFlg(String printId1, String queryId1) {
		StringBuffer svfDir = new StringBuffer(frmPath);
		String localel = locale.toLowerCase();
		svfDir.append("/").append("svfx").append("/");

		StringBuffer fsb = new StringBuffer(svfDir.toString());
		StringBuffer qsb = new StringBuffer(svfDir.toString());
		
		String _frmFileName = fsb.append(localel).append("/").append(printId1)
							.append("_").append(localel).append(".xml").toString();
		String _queryFileName = qsb.append(queryId1).append(".vrq").toString();
		
		if ( printMode.equals("SVFX")
			&& new File(_frmFileName).exists() && new File(_queryFileName).exists() ) {
			multiLangFlg = true;
		} else {
			multiLangFlg = false;
		}
	};

	/**
	 * �l���t�@�C�����A�N�G���t�@�C������ݒ肵�܂��B
	 * @param  printId1 ���[ID
	 * @param  queryId1 �N�G��ID
	 */
	private void setFileNames(String printId1, String queryId1) {
		if ( multiLangFlg == true ) {
			
			StringBuffer svfDir = new StringBuffer(frmPath);
			String localel = locale.toLowerCase();
			svfDir.append("/").append("svfx").append("/");

			StringBuffer _frmFileName = new StringBuffer(svfDir.toString());
			StringBuffer _queryFileName = new StringBuffer(svfDir.toString());
			
			frmFileName = _frmFileName.append(localel).append("/").append(printId1)
								.append("_").append(localel).append(".xml").toString();
			queryFileName = _queryFileName.append(queryId1).append(".vrq").toString();
			
		} else {
			frmFileName = new StringBuffer(frmPath).append("/").append(printId1).append(".frm").toString();
			queryFileName = new StringBuffer(frmPath).append("/").append(queryId1).append(".vrq").toString();
		}
	}

	/**
	 * �v�����^����ݒ肵�܂��B
	 * 
	 * @return SVF �� VrSetPrinter �̖߂�l
	 */
	private int VrSetPrinter() {
		try {
			if ( multiLangFlg == true ) {
				String printer = null;
				if ( printType.equals("2") ) { // �X�v�[������̏ꍇ
					printer = PrintConfig.getRdePrinterByLocale(locale,bundle);
					ret = svfRemote.VrSetPrinter("", printer);
				} else {
					printer = PrintConfig.getPdfPrinterByLocale(locale,bundle);
					ret = svfLocal.VrSetPrinter("", printer);	// PDF�o�ׂ͂̈̎w��
				}
				System.out.println("Printer    :" + printer     + ":");
			} else {
				if ( printType.equals("2") ) { // �X�v�[������̏ꍇ
					ret = svfRemote.VrSetPrinter("PDF", "");
				} else { // �T�[�o����E�N���C�A���g����̏ꍇ
					ret = svfLocal.VrSetPrinter("PDF", "PDF");	// PDF�o�ׂ͂̈̎w��
				}
			}
		} catch (Exception e) {
			ret = -1;
		}
		
		return ret;
	}

	/**
	 * ������̏ꍇ�A���P�[����ݒ�EVrInit���܂��B< /br>
	 * ������ł͂Ȃ��ꍇ�A����VrInit���܂��B
	 * @return SVF �� VrInit �̖߂�l
	 */
	private int VrSetLocaleInit() {
		try {
			if (  multiLangFlg == true ) { // ������̏ꍇ
				setSvfLocale();
				setEncoding();
				if ( "2".equals(printType) ) {	// �X�v�[������̏ꍇ
					ret = svfRemote.VrSetLocale(svfLocale);
					ret = svfRemote.VrInit(encoding);
				}
				else {	// �T�[�o����E�N���C�A���g����̏ꍇ
					ret = svfLocal.VrSetLocale(svfLocale);
					ret = svfLocal.VrInit(encoding);
				}
			} else { // ������ł͂Ȃ��ꍇ
				if ( "2".equals(printType) ) {	// �X�v�[������̏ꍇ
					ret = svfRemote.VrInit();
				}
				else {	// �T�[�o����E�N���C�A���g����̏ꍇ
					ret = svfLocal.VrInit();
				}
			}
		} catch (Exception e) {
			ret = -1;
		}
		return ret;
	}

	/**
	 * ������
	 * @param  printId1 ���[ID
	 * @return VrInit(printId1, printId1)
	 */
	public int VrInit(String printId1){
		return VrInit(printId1, printId1);
	}
	
	/**
	 * ������
	 * @param  printId1 ���[ID
	 * @param  queryId1 �N�G��ID
	 * @return SVF �� VrSetForm �̖߂�l
	 */
	public int VrInit(String printId1, String queryId1){
		try {
			
			setMultiLangFlg(printId1, queryId1);
			setFileNames(printId1,queryId1);

			if ((acrobatOption1 == null) || (acrobatOption1.equalsIgnoreCase("null")) ||
				(acrobatOption1.length() == 0)) {
				acrobatOption1 = "";
			}
			if ((acrobatOption2 == null) || (acrobatOption2.equalsIgnoreCase("null")) ||
				(acrobatOption2.length() == 0)) {
				acrobatOption2 = "";
			}

			if (!"2".equals(printType) ) {
				FileNaming fileName = new FileNaming();
				fileName.setDirectory(pdfPath);
				fileName.setUser(userCd);
				fileName.setExtension("pdf");
				if ( "1".equals(printType) ) {		// �T�[�o����̏ꍇ
					fileName.setMark("SV");
				}
				else if ( "0".equals(printType) ) {	// �N���C�A���g����̏ꍇ
					fileName.setMark("CL");
				}
				pdfFilePath = fileName.naming();	// pdf�t���p�X�t�@�C����
				pdfFileName = new String(pdfSpoolPath + "/" + fileName.getNamingName());	// pdf�t�@�C�����iWeb�p�j
				executeOutput = new String(acrobatPath + " " + acrobatOption1 + " "
					 + acrobatOption2 + " \"" + pdfFilePath + "\" \"" + printer + "\"");
			}

			ret = VrSetLocaleInit();
			
			if(ret == 0) {
				System.out.println("(SBM1259)PDF����������");
			}
			else {
				System.out.println("(SBM1256)PDF���������s�F" + ret);
			}

			if ( "2".equals(printType) ) {	// �X�v�[������̏ꍇ
				ret = svfRemote.VrSetCalcMode(1);	// �ۂ߃��[�h�ݒ�
			}
			else {	// �T�[�o����E�N���C�A���g����̏ꍇ
				ret = svfLocal.VrSetCalcMode(1);	// �ۂ߃��[�h�ݒ�
			}
			if(ret == 0) {
				System.out.println("(SBM1254)�܂�߃��[�h�ݒ萬��");
			}
			else {
				System.out.println("(SBM1253)�܂�߃��[�h�ݒ莸�s�F" + ret);
			}

			ret = VrSetPrinter();
			
			if(ret == 0) {
				System.out.println("(SBM1196)PDF�o�͐ݒ萬��");
			}
			else {
				System.out.println("(SBM1127)PDF�o�͐ݒ莸�s�F" + ret);
			}

			if ( "2".equals(printType) ) {	// �X�v�[������̏ꍇ
				//ret = svfRemote.VrSetSpoolFileName2(pdfFilePath);	// PDF�t�@�C�����̎w��
			}
			else {	// �T�[�o����E�N���C�A���g����̏ꍇ
				ret = svfLocal.VrSetSpoolFileName2(pdfFilePath);	// PDF�t�@�C�����̎w��
			}
			if(ret == 0) {
				System.out.println("(SBM1060)PDF�t�@�C�����ݒ萬��");
			}
			else {
				System.out.println("(SBM1059)PDF�t�@�C�����ݒ�F" + ret);
			}

			if ( "2".equals(printType) ) {	// �X�v�[������̏ꍇ
				ret = svfRemote.VrSetForm(frmFileName, 5);			// �t�H�[���t�@�C���̎w��
			}
			else {	// �T�[�o����E�N���C�A���g����̏ꍇ
				ret = svfLocal.VrSetForm(frmFileName, 5);			// �t�H�[���t�@�C���̎w��
			}
			if(ret == 0) {
				System.out.println("(SBM1057)�t�H�[���t�@�C���ݒ萬��");
			}
			else {
				System.out.println("(SBM1056)�t�H�[���t�@�C���ݒ莸�s�F" + ret);
			}

		} catch(Exception e) {
			ret = -1;
		}

		System.out.println("printType     :" + printType      + ":");
		System.out.println("acrobatPath   :" + acrobatPath    + ":");
		System.out.println("acrobatOption1:" + acrobatOption1 + ":");
		System.out.println("acrobatOption2:" + acrobatOption2 + ":");
		System.out.println("frmPath       :" + frmPath        + ":");
		System.out.println("webRootPath   :" + webRootPath    + ":");
		System.out.println("pdfSpoolPath  :" + pdfSpoolPath   + ":");
		System.out.println("pdfPath       :" + pdfPath        + ":");
		System.out.println("pdfFilePath   :" + pdfFilePath    + ":");
		System.out.println("pdfFileName   :" + pdfFileName    + ":");
		System.out.println("queryFileName :" + queryFileName  + ":");
		System.out.println("frmFileName   :" + frmFileName    + ":");
		System.out.println("executeOutput :" + executeOutput  + ":");
		System.out.println("SpoolHost     :" + SpoolHost      + ":");
		System.out.println("printMode     :" + printMode      + ":");
		System.out.println("locale        :" + locale         + ":");
		System.out.println("multiLangFlg  :" + multiLangFlg   + ":");
		System.out.println("svfLocale     :" + svfLocale    + ":");
		System.out.println("encoding      :" + encoding      + ":");

		return(ret);
	}

	/**
	 * �X�v�[�����[���ݒ�
	 * @param  printName �X�v�[�����[��
	 * @return SVF �� VrSetDocName2 �̖߂�l
	 */
	public int VrSetDocName2(String printName){
		try {
			if ( "2".equals(printType) ) {
				ret = svfRemote.VrSetDocName2(printName);
			} else {
				ret = 0;
			}
		} catch(Exception e) {
			ret = -1;
		}

		if(ret == 0) {
			System.out.println("(SBM1055)�X�v�[�����[���ݒ萬��");
		}
		else {
			System.out.println("(SBM1054)�X�v�[�����[���ݒ莸�s�F" + ret);
		}

		return(ret);
	}

	/**
	 * �o�̓t�@�C�������o��
	 * @return SVF �� VrGetSpoolFileName �̖߂�l
	 */
	public String VrGetSpoolFileName(){
		String sRet;
		try {
			if ( "2".equals(printType) ) {
				sRet = svfRemote.VrGetSpoolFileName();
			} else {
				sRet = svfLocal.VrGetSpoolFileName();
			}
		} catch(Exception e) {
			sRet = "";
		}

		return(sRet);
	}

	/**
	 * pdf�t���p�X�t�@�C�������o��
	 * @return pdf�t���p�X�t�@�C����
	 */
	public String getPdfFilePath(){
		return(pdfFilePath);
	}

	/**
	 * pdf�t�@�C�����iWeb�p�j���o��
	 * @return pdf�t�@�C����
	 */
	public String getPdfFileName(){
		return(pdfFileName);
	}

	/**
	 * query�t�@�C�������o��
	 * @return query�t�@�C����
	 */
	public String getQueryFileName(){
		return(queryFileName);
	}

	/**
	 * �T�[�o������s��������o��
	 * @return �T�[�o������s������
	 */
	public String getExecuteOutput(){
		return(executeOutput);
	}

	/**
	 * �T�[�o������s��������o���i�݊��m�ہj
	 * @return �T�[�o������s������
	 */
	public String getExcuteOutput(){
		return(executeOutput);
	}

	/**
	 * �T�[�o������sAdobePath���o��
	 * @return �T�[�o������sAdobePath
	 */
	public String getAcrobatPath(){
		return(acrobatPath);
	}
	
	/**
	 * �T�[�o������sAdobebatOption1���o��
	 * @return �T�[�o������sOption1
	 */
	public String getAcrobatOption1(){
		return(acrobatOption1);
	}

	/**
	 * �T�[�o������sAdobebatOption2���o��
	 * @return �T�[�o������sbatOption2
	 */
	public String getAcrobatOption2(){
		return(acrobatOption2);
	}

	/**
	 * �T�[�o������s�v�����^�[���o��
	 * @return �T�[�o������s�v�����^�[
	 */
	public String getPrinter(){
		return(printer);
	}
	
	
	/**
	 * �����o��
	 * @param  Column �󎚍���ID
	 * @param  Data �󎚓��e
	 * @return SVF �� VrsOut �̖߂�l
	 */
	public int VrsOut(String Column, String Data){
		try {
			if ( "2".equals(printType) ) {
				if(Data != null) {
					ret = svfRemote.VrsOut(Column, Data);
				}
				else {
					ret = svfRemote.VrsOut(Column, "");
				}
			} else {
				if(Data != null) {
					ret = svfLocal.VrsOut(Column, Data);
				}
				else {
					ret = svfLocal.VrsOut(Column, "");
				}
			}
		} catch(Exception e) {
			ret = -1;
		}

		return(ret);
	}

	/**
	 * ���s���s
	 * @return SVF �� VrEndRecord �̖߂�l
	 */
	public int VrEndRecord(){
		try {
			if ( "2".equals(printType) ) {
				ret = svfRemote.VrEndRecord();
			} else {
				ret = svfLocal.VrEndRecord();
			}
		} catch(Exception e) {
			ret = -1;
		}

		if(ret == 0) {
			System.out.print("�E");
		}
		else {
			System.out.println("(SBM1051)���s���s�F" + ret);
		}

		return(ret);
	}

	/**
	 * ���Ŏ��s
	 * @return SVF �� VrEndPage �̖߂�l
	 */
	public int VrEndPage(){
		try {
			if ( "2".equals(printType) ) {
				ret = svfRemote.VrEndPage();
			} else {
				ret = svfLocal.VrEndPage();
			}
		} catch(Exception e) {
			ret = -1;
		}

		if(ret == 0) {
			System.out.println("(SBM1050)���Ő���");
		}
		else {
			System.out.println("(SBM0973)���Ŏ��s�F" + ret);
		}

		return(ret);
	}

	/**
	 * �N�G���w��
	 * @param con SVF �� VrSetQuery �p�����[�^�Q��
	 * @param query SVF �� VrSetQuery �p�����[�^�Q��
	 * @param mode SVF �� VrSetQuery �p�����[�^�Q��
	 * @return SVF �� VrSetQuery �̖߂�l
	 */
	public int VrSetQuery(String con, String query, int mode){
		try {
			if ( "2".equals(printType) ) {
				ret = svfRemote.VrSetQuery(con, query, mode);
			} else {
				ret = svfLocal.VrSetQuery(con, query, mode);
			}
		} catch(Exception e) {
			ret = -1;
		}

		if(ret >= 0) {
			System.out.println("(SBM0950)�N�G���w�萬���F" + ret);
			System.out.println("(SBM0950)�N�G���w�萬���F[" + con  + "][" + query + "][" + mode + "]");
		}
		else {
			System.out.println("(SBM0949)�N�G���w�莸�s�F" + ret);
			System.out.println("(SBM0949)�N�G���w�莸�s�F[" + con  + "][" + query + "][" + mode + "]");
		}

		return(ret);
	}

	/**
	 * �N�G���w��
	 * @param con SVF �� VrSetQuery �p�����[�^�Q��
	 * @return SVF �� VrSetQuery �̖߂�l
	 */
	public int VrSetQuery(String con){
		try {
			if ( "2".equals(printType) ) {
				ret = svfRemote.VrSetQuery(con, queryFileName, 0);
			} else {
				ret = svfLocal.VrSetQuery(con, queryFileName, 0);
			}
		} catch(Exception e) {
			ret = -1;
		}

		if(ret >= 0) {
			System.out.println("(SBM0950)�N�G���w�萬���F" + ret);
			System.out.println("(SBM0950)�N�G���w�萬���F[" + con  + "][" + queryFileName + "]");
		}
		else {
			System.out.println("(SBM0949)�N�G���w�莸�s�F" + ret);
			System.out.println("(SBM0949)�N�G���w�莸�s�F[" + con  + "][" + queryFileName + "]");
		}

		return(ret);
	}

	/**
	 * �N�G�����s
	 * @return SVF �� VrReport �̖߂�l
	 */
	public int VrReport(){
		try {
			if ( "2".equals(printType) ) {
				ret = svfRemote.VrReport();
			} else {
				ret = svfLocal.VrReport();
			}
		} catch(Exception e) {
			ret = -1;
		}

		if(ret >= 0) {
			System.out.println("(SBM0948)�N�G�����s�����F" + ret);
		}
		else {
			System.out.println("(SBM0947)�N�G�����s���s�F" + ret);
		}

		return(ret);
	}

	/**
	 * �N�G���̒��o�����w��
	 * @param pic SVF �� VrCondition �p�����[�^�Q��
	 * @param mode SVF �� VrCondition �p�����[�^�Q��
	 * @return SVF �� VrCondition �̖߂�l
	 */
	public int VrCondition(String pic, int mode){
		try {
			if ( "2".equals(printType) ) {
				ret = svfRemote.VrCondition(pic, mode);
			} else {
				ret = svfLocal.VrCondition(pic, mode);
			}
		} catch(Exception e) {
			ret = -1;
		}

		if(ret >= 0) {
			System.out.println("(SBM0946)�N�G���̒��o�����w�萬���F" + ret);
			System.out.println("(SBM0946)�N�G���̒��o�����w�萬���F[" + pic  + "][" + mode + "]");
		}
		else {
			System.out.println("(SBM0945)�N�G���̒��o�����w�莸�s�F" + ret);
			System.out.println("(SBM0945)�N�G���̒��o�����w�莸�s�F[" + pic  + "][" + mode + "]");
		}

		return(ret);
	}

	/**
	 * ������s
	 * @return SVF �� VrPrint �̖߂�l
	 */
	public int VrPrint(){
		try {
			if ( "2".equals(printType) ) {
				ret = svfRemote.VrPrint();
			} else {
				ret = svfLocal.VrPrint();
			}
		} catch(Exception e) {
			ret = -1;
		}

		if(ret >= 0) {
			System.out.println("(SBM0944)������s�����F" + ret);
		}
		else {
			System.out.println("(SBM0926)������s���s�F" + ret);
		}

		return(ret);
	}

	/**
	 * �I��
	 * @return SVF �� VrQuit �̖߂�l
	 */
	public int VrQuit(){
		try {
			if ( "2".equals(printType) ) {
				ret = svfRemote.VrQuit();
			} else {
				ret = svfLocal.VrQuit();
			}
		} catch(Exception e) {
			ret = -1;
		}

		if(ret >= 0) {
			System.out.println("(SBM0894)�I�����������F" + ret);
		}
		else {
			System.out.println("((SBM0862)�I���������s�F" + ret);
		}

		return(ret);
	}

	
	
	/**
	 * �C���X�^���X�j�󎞂ɍs������
	 * @throws Throwable
	 */
	public void finalize() throws Throwable {
		super.finalize();
		svfRemote = null;
		svfLocal = null;
	}

	/**
	 *  ��frm
	 *  ���ӁFSVF�͕]���ς����ASVFX�����꒠�[�͖��]���i�����p�j
	 */
	 public void Frm_change(String printId){
		// �t�H�[���t�@�C����	
		if (multiLangFlg) {
			StringBuffer svfDir = new StringBuffer(frmPath);
			String localel = locale.toLowerCase();
			svfDir.append("/").append("svfx").append("/");
			StringBuffer _frmFileName = new StringBuffer(svfDir.toString());
			
			frmFileName = _frmFileName.append(localel).append("/").append(printId)
								.append("_").append(localel).append(".xml").toString();			
		} else {
			frmFileName = new StringBuffer(frmPath).append("/").append(printId).append(".frm").toString();
		}
		// �t�H�[���t�@�C���̎w��
		try {
			if ("2".equals(printType) ) {
				ret = svfRemote.VrSetForm(frmFileName, 5);
			} else {
				ret = svfLocal.VrSetForm(frmFileName, 5);
			}
		} catch(Exception e) {
			ret = -1;
		}
	 }
}
