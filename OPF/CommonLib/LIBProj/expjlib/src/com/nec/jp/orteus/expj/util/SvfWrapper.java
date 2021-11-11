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
 * 翼システムＳＶＦのための帳票作成用ラッパークラス。<BR>
 * ローカル印刷とリモート印刷を内部で切り替えて使用します。<BR>
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
	 * オブジェクトを構築します。
	 *
	 * @param  _printType 帳票出力タイプ(0:ローカル印刷、1:サーバ印刷、2:スプール印刷)
	 * @param  _userCd ユーザコード
	 * @param  _printer 出力先プリンタ
	 */
	public SvfWrapper(String _printType, String _userCd, String _printer){
		try {
			printType = _printType;
			userCd = _userCd;
			printer = _printer;
			if ( "2".equals(printType) ) {	// スプール印刷の場合
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
	 * ロケールによりVrSetLocaleに設定するロケールを設定します。
	 */
	private void setSvfLocale() {
		svfLocale = PrintConfig.convertOrteusLocaleToSvfLocale(locale);
	}

	/**
	 * ロケールによりVrInitに設定するエンコードを設定します。
	 */
	private void setEncoding() {
		encoding = PrintConfig.getSvfEncodeByLocale(locale);
	}

	/**
	 * 多言語フラグを設定します。</br>
	 * 印刷モードがSVFXかつ多言語用様式ファイル・クエリファイルが存在するときtrue。
	 * 他のときはfalse。
	 *
	 * @param  printId1 帳票ID
	 * @param  queryId1 クエリID
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
	 * 様式ファイル名、クエリファイル名を設定します。
	 * @param  printId1 帳票ID
	 * @param  queryId1 クエリID
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
	 * プリンタ名を設定します。
	 * 
	 * @return SVF の VrSetPrinter の戻り値
	 */
	private int VrSetPrinter() {
		try {
			if ( multiLangFlg == true ) {
				String printer = null;
				if ( printType.equals("2") ) { // スプール印刷の場合
					printer = PrintConfig.getRdePrinterByLocale(locale,bundle);
					ret = svfRemote.VrSetPrinter("", printer);
				} else {
					printer = PrintConfig.getPdfPrinterByLocale(locale,bundle);
					ret = svfLocal.VrSetPrinter("", printer);	// PDF出力の為の指定
				}
				System.out.println("Printer    :" + printer     + ":");
			} else {
				if ( printType.equals("2") ) { // スプール印刷の場合
					ret = svfRemote.VrSetPrinter("PDF", "");
				} else { // サーバ印刷・クライアント印刷の場合
					ret = svfLocal.VrSetPrinter("PDF", "PDF");	// PDF出力の為の指定
				}
			}
		} catch (Exception e) {
			ret = -1;
		}
		
		return ret;
	}

	/**
	 * 多言語の場合、ロケールを設定・VrInitします。< /br>
	 * 多言語ではない場合、ただVrInitします。
	 * @return SVF の VrInit の戻り値
	 */
	private int VrSetLocaleInit() {
		try {
			if (  multiLangFlg == true ) { // 多言語の場合
				setSvfLocale();
				setEncoding();
				if ( "2".equals(printType) ) {	// スプール印刷の場合
					ret = svfRemote.VrSetLocale(svfLocale);
					ret = svfRemote.VrInit(encoding);
				}
				else {	// サーバ印刷・クライアント印刷の場合
					ret = svfLocal.VrSetLocale(svfLocale);
					ret = svfLocal.VrInit(encoding);
				}
			} else { // 多言語ではない場合
				if ( "2".equals(printType) ) {	// スプール印刷の場合
					ret = svfRemote.VrInit();
				}
				else {	// サーバ印刷・クライアント印刷の場合
					ret = svfLocal.VrInit();
				}
			}
		} catch (Exception e) {
			ret = -1;
		}
		return ret;
	}

	/**
	 * 初期化
	 * @param  printId1 帳票ID
	 * @return VrInit(printId1, printId1)
	 */
	public int VrInit(String printId1){
		return VrInit(printId1, printId1);
	}
	
	/**
	 * 初期化
	 * @param  printId1 帳票ID
	 * @param  queryId1 クエリID
	 * @return SVF の VrSetForm の戻り値
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
				if ( "1".equals(printType) ) {		// サーバ印刷の場合
					fileName.setMark("SV");
				}
				else if ( "0".equals(printType) ) {	// クライアント印刷の場合
					fileName.setMark("CL");
				}
				pdfFilePath = fileName.naming();	// pdfフルパスファイル名
				pdfFileName = new String(pdfSpoolPath + "/" + fileName.getNamingName());	// pdfファイル名（Web用）
				executeOutput = new String(acrobatPath + " " + acrobatOption1 + " "
					 + acrobatOption2 + " \"" + pdfFilePath + "\" \"" + printer + "\"");
			}

			ret = VrSetLocaleInit();
			
			if(ret == 0) {
				System.out.println("(SBM1259)PDF初期化成功");
			}
			else {
				System.out.println("(SBM1256)PDF初期化失敗：" + ret);
			}

			if ( "2".equals(printType) ) {	// スプール印刷の場合
				ret = svfRemote.VrSetCalcMode(1);	// 丸めモード設定
			}
			else {	// サーバ印刷・クライアント印刷の場合
				ret = svfLocal.VrSetCalcMode(1);	// 丸めモード設定
			}
			if(ret == 0) {
				System.out.println("(SBM1254)まるめモード設定成功");
			}
			else {
				System.out.println("(SBM1253)まるめモード設定失敗：" + ret);
			}

			ret = VrSetPrinter();
			
			if(ret == 0) {
				System.out.println("(SBM1196)PDF出力設定成功");
			}
			else {
				System.out.println("(SBM1127)PDF出力設定失敗：" + ret);
			}

			if ( "2".equals(printType) ) {	// スプール印刷の場合
				//ret = svfRemote.VrSetSpoolFileName2(pdfFilePath);	// PDFファイル名の指定
			}
			else {	// サーバ印刷・クライアント印刷の場合
				ret = svfLocal.VrSetSpoolFileName2(pdfFilePath);	// PDFファイル名の指定
			}
			if(ret == 0) {
				System.out.println("(SBM1060)PDFファイル名設定成功");
			}
			else {
				System.out.println("(SBM1059)PDFファイル名設定：" + ret);
			}

			if ( "2".equals(printType) ) {	// スプール印刷の場合
				ret = svfRemote.VrSetForm(frmFileName, 5);			// フォームファイルの指定
			}
			else {	// サーバ印刷・クライアント印刷の場合
				ret = svfLocal.VrSetForm(frmFileName, 5);			// フォームファイルの指定
			}
			if(ret == 0) {
				System.out.println("(SBM1057)フォームファイル設定成功");
			}
			else {
				System.out.println("(SBM1056)フォームファイル設定失敗：" + ret);
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
	 * スプーラ帳票名設定
	 * @param  printName スプーラ帳票名
	 * @return SVF の VrSetDocName2 の戻り値
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
			System.out.println("(SBM1055)スプーラ帳票名設定成功");
		}
		else {
			System.out.println("(SBM1054)スプーラ帳票名設定失敗：" + ret);
		}

		return(ret);
	}

	/**
	 * 出力ファイル名取り出し
	 * @return SVF の VrGetSpoolFileName の戻り値
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
	 * pdfフルパスファイル名取り出し
	 * @return pdfフルパスファイル名
	 */
	public String getPdfFilePath(){
		return(pdfFilePath);
	}

	/**
	 * pdfファイル名（Web用）取り出し
	 * @return pdfファイル名
	 */
	public String getPdfFileName(){
		return(pdfFileName);
	}

	/**
	 * queryファイル名取り出し
	 * @return queryファイル名
	 */
	public String getQueryFileName(){
		return(queryFileName);
	}

	/**
	 * サーバ印刷実行文字列取り出し
	 * @return サーバ印刷実行文字列
	 */
	public String getExecuteOutput(){
		return(executeOutput);
	}

	/**
	 * サーバ印刷実行文字列取り出し（互換確保）
	 * @return サーバ印刷実行文字列
	 */
	public String getExcuteOutput(){
		return(executeOutput);
	}

	/**
	 * サーバ印刷実行AdobePath取り出し
	 * @return サーバ印刷実行AdobePath
	 */
	public String getAcrobatPath(){
		return(acrobatPath);
	}
	
	/**
	 * サーバ印刷実行AdobebatOption1取り出し
	 * @return サーバ印刷実行Option1
	 */
	public String getAcrobatOption1(){
		return(acrobatOption1);
	}

	/**
	 * サーバ印刷実行AdobebatOption2取り出し
	 * @return サーバ印刷実行batOption2
	 */
	public String getAcrobatOption2(){
		return(acrobatOption2);
	}

	/**
	 * サーバ印刷実行プリンター取り出し
	 * @return サーバ印刷実行プリンター
	 */
	public String getPrinter(){
		return(printer);
	}
	
	
	/**
	 * 文字出力
	 * @param  Column 印字項目ID
	 * @param  Data 印字内容
	 * @return SVF の VrsOut の戻り値
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
	 * 改行実行
	 * @return SVF の VrEndRecord の戻り値
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
			System.out.print("・");
		}
		else {
			System.out.println("(SBM1051)改行失敗：" + ret);
		}

		return(ret);
	}

	/**
	 * 改頁実行
	 * @return SVF の VrEndPage の戻り値
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
			System.out.println("(SBM1050)改頁成功");
		}
		else {
			System.out.println("(SBM0973)改頁失敗：" + ret);
		}

		return(ret);
	}

	/**
	 * クエリ指定
	 * @param con SVF の VrSetQuery パラメータ参照
	 * @param query SVF の VrSetQuery パラメータ参照
	 * @param mode SVF の VrSetQuery パラメータ参照
	 * @return SVF の VrSetQuery の戻り値
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
			System.out.println("(SBM0950)クエリ指定成功：" + ret);
			System.out.println("(SBM0950)クエリ指定成功：[" + con  + "][" + query + "][" + mode + "]");
		}
		else {
			System.out.println("(SBM0949)クエリ指定失敗：" + ret);
			System.out.println("(SBM0949)クエリ指定失敗：[" + con  + "][" + query + "][" + mode + "]");
		}

		return(ret);
	}

	/**
	 * クエリ指定
	 * @param con SVF の VrSetQuery パラメータ参照
	 * @return SVF の VrSetQuery の戻り値
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
			System.out.println("(SBM0950)クエリ指定成功：" + ret);
			System.out.println("(SBM0950)クエリ指定成功：[" + con  + "][" + queryFileName + "]");
		}
		else {
			System.out.println("(SBM0949)クエリ指定失敗：" + ret);
			System.out.println("(SBM0949)クエリ指定失敗：[" + con  + "][" + queryFileName + "]");
		}

		return(ret);
	}

	/**
	 * クエリ実行
	 * @return SVF の VrReport の戻り値
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
			System.out.println("(SBM0948)クエリ実行成功：" + ret);
		}
		else {
			System.out.println("(SBM0947)クエリ実行失敗：" + ret);
		}

		return(ret);
	}

	/**
	 * クエリの抽出条件指定
	 * @param pic SVF の VrCondition パラメータ参照
	 * @param mode SVF の VrCondition パラメータ参照
	 * @return SVF の VrCondition の戻り値
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
			System.out.println("(SBM0946)クエリの抽出条件指定成功：" + ret);
			System.out.println("(SBM0946)クエリの抽出条件指定成功：[" + pic  + "][" + mode + "]");
		}
		else {
			System.out.println("(SBM0945)クエリの抽出条件指定失敗：" + ret);
			System.out.println("(SBM0945)クエリの抽出条件指定失敗：[" + pic  + "][" + mode + "]");
		}

		return(ret);
	}

	/**
	 * 印刷実行
	 * @return SVF の VrPrint の戻り値
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
			System.out.println("(SBM0944)印刷実行成功：" + ret);
		}
		else {
			System.out.println("(SBM0926)印刷実行失敗：" + ret);
		}

		return(ret);
	}

	/**
	 * 終了
	 * @return SVF の VrQuit の戻り値
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
			System.out.println("(SBM0894)終了処理成功：" + ret);
		}
		else {
			System.out.println("((SBM0862)終了処理失敗：" + ret);
		}

		return(ret);
	}

	
	
	/**
	 * インスタンス破壊時に行う処理
	 * @throws Throwable
	 */
	public void finalize() throws Throwable {
		super.finalize();
		svfRemote = null;
		svfLocal = null;
	}

	/**
	 *  改frm
	 *  注意：SVFは評価済だが、SVFX多言語帳票は未評価（将来用）
	 */
	 public void Frm_change(String printId){
		// フォームファイル名	
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
		// フォームファイルの指定
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
