/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/csv/CsvWriter.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.csv;

import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.xaf.util.FoundationException;

//import com.nec.jp.orteus.xaf.eo.WriteCsv;

import java.io.File;
import java.util.List;
import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.expj.util.SystemConfig;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.lang.NumberFormatException;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.io.File;
import java.util.Date;

/**
 * ＣＳＶダウンロード部品
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.5 $ $Date: 2013/06/27 02:01:53 $
*/
public class CsvWriter{

	protected File writePath = null;
	protected String path = null;
	protected String fileName = null;
	protected String webRoot = null;
	protected String _strDefaultLocale = CoreTools.getLocale(null);
	protected boolean _dicFlag = false;
	/**
	 * 一意となるファイル名を取得する
	 * @param userId   ユーザID
	 * @return         ファイル名（ユーザID＋日付[yyyyMMddHHmmssSSS]）
	 */
	public static String getFileName(String userId){
		return userId + "_" + Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS") + ".csv";
	}

	
	/**
	 * コンストラクタ
	 * @param fileName CSVファイル名
	 * @throws FoundationException
	 */
	public CsvWriter(String fileName) throws FoundationException{
		if(fileName == null){
			throw new FoundationException(this.getClass().getName(),"CsvWriter","(SBM0858) コンストラクタの引数が不正です");
		}
		this.fileName = fileName;
		this.readProperty();
	}

	
	/**
	 * CSVを出力する(文字コードをシステムロケールで指定）
	 * String配列のリストを引数に渡す。（一行目はタイトル）
	 * @param list	 String配列のリスト
	 * @throws FoundationException 引数がnullの場合
	 */
	public void write(List list) throws FoundationException {
		this.checkPath();
		write(list, writePath.getPath(), fileName,_strDefaultLocale);
	}

	/**
	 * CSVを出力する(文字コードをユーザロケールで指定）
	 * String配列のリストを引数に渡す。（一行目はタイトル）
	 * @param list	 String配列のリスト
	 * @param locale ロケール
	 * @throws FoundationException 引数がnullの場合
	 */
	public void write(List list,String locale) throws FoundationException {
		this.checkPath();
		write(list, writePath.getPath(), fileName,locale);
	}
	
		/**
	 * CSVを出力する（文字コードをユーザロケールで指定、辞書使用フラグにより多言語辞書での置換処理の判定を行う）
	 * String配列のリストを引数に渡す。（一行目はタイトル）
	 * @param list	 String配列のリスト
	 * @param locale ロケール
	 * @param dicFlag 多言語辞書使用フラグ
	 * @throws FoundationException 引数がnullの場合
	 */
	public void write(List list,String locale, boolean dicFlag) throws FoundationException {
		this.checkPath();
		_dicFlag = dicFlag;
		write(list, writePath.getPath(), fileName,locale);
	}
	
	
	/**
	 * CSV出力情報をプロパティファイルから読み込む
	 * @throws FoundationException プロパティファイルの読み込みに失敗
	*/
	private void readProperty() throws FoundationException{
		try{
			ResourceBundle rb = SystemConfig.getBundle();
			this.webRoot = SystemConfig.getProperty("WEBROOT",rb);
			this.path = SystemConfig.getProperty("CSVディレクトリ",rb);
		}catch(MissingResourceException mre){
			FoundationException fe = new FoundationException("CollectNumber",mre.getMessage(),"(SBM0854) プロパティファイルの読み込みに失敗しました。");
			fe.setPreviousException(mre);
			throw fe;
		}
	}


	/**
	 * CSVを出力する
	 * @param list	 csv出力List
	 * @param path	 webrootからのパス
	 * @param fileName CSVファイル名
	 * @param locale ロケール
	 * @throws FoundationException
	 */
	protected void write(List list, String path, String fileName, String locale) throws FoundationException {
		com.nec.jp.orteus.eo.CsvWriter m_writer = null;
		try {
			m_writer = new com.nec.jp.orteus.eo.CsvWriter(locale);
			m_writer.useDoubleQuote(true);
			m_writer.open(path, fileName);			
			int size = list.size();
			// データの設定
			String sColums[] = null;
			for(int i = 0; i < size; i++) {
				m_writer.beginIns();
				sColums = (String[])list.get(i);
				if (_dicFlag && i == 0){
					ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic",locale);
					for(int j = 0; j < sColums.length; j++) {
						m_writer.addCell( replaceQuat(CoreTools.getRBString(sColums[j],rb)) );
					}
				}else{
					for(int j = 0; j < sColums.length; j++) {
						m_writer.addCell( replaceQuat(sColums[j]) );
					}
				}
				m_writer.endIns();
			}
		}finally {
			if(m_writer != null){
				m_writer.close();
				m_writer = null;
			}
		}
	}


	/**
	 * 指定されたファイル・パスを元にディレクトリ環境のチェックを行う
	 * （CSVの出力ディレクトリが存在しない場合はディレクトリの作成を行う）
	 * @throws FoundationException ディレクトリの作成に失敗
	 */
	private void checkPath() throws FoundationException {
		writePath = new File(this.webRoot, path);
		if(!writePath.exists()) {
			if(!writePath.mkdirs()) {
				throw new FoundationException(this.getClass().getName(), "checkPath()", "(SBM0864) ディレクトリの作成に失敗しました。："+writePath.getPath());
			}
		}
	}

	/**
	 * CSVデータに「"」(ダブルクォーテーション)が含まれる場合に、エスケープ処理を行う
	 * @param str	 チェック文字列
	 * @return エスケープ処理後の文字列
	 */
	private String replaceQuat(String str) {
		if(str == null){
			str = "";
		}
		String before = "\"";
		String after = "\"\"";
		StringBuffer strBuf = new StringBuffer(str);
		int pos = 0;
		while((pos = strBuf.toString().indexOf(before, pos)) != -1) {
			strBuf.replace(pos, pos + before.length(), after);
			pos = pos + after.length();
		}
		return strBuf.toString();
	}


	/**
	 * CSVダウンロードURLを取得する
	 * @param response HttpServletResponse
	 * @return CSVダウンロードURL
	 */
	public String getUrl(javax.servlet.http.HttpServletResponse response) {
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "filename=\""+fileName+"\"");
		String urlPath = this.path;
		if(!urlPath.startsWith("/")){
			urlPath = "/" + urlPath;
		}
		if(!urlPath.endsWith("/")){
			urlPath = urlPath + "/";
		}
		String urlFileName = this.fileName;
		if(urlFileName.startsWith("/")){
			urlFileName = urlFileName.substring(1);
		}

		return urlPath + urlFileName;
	}

	/**
	 * 命名ファイル名取得。
	 * @return CSVダウンロードファイル名
	 */
	public String getFilePath()
	{
		String urlPath = this.path;
		if(!urlPath.startsWith("/")){
			urlPath = "/" + urlPath;
		}
		if(!urlPath.endsWith("/")){
			urlPath = urlPath + "/";
		}
		String urlFileName = this.fileName;
		if(urlFileName.startsWith("/")){
			urlFileName = urlFileName.substring(1);
		}

		return urlPath + urlFileName;
	}


	/**
	 * 保存期間を過ぎたCSVを削除する
	 * @param  today 本日日付
	 * @throws FoundationException
	 */
	public static void delete(Date today) throws FoundationException{
		try{
			if(today == null){
				throw new FoundationException("CsvWriter","delete","(SBM0865) 引数が不正です。");
			}

			ResourceBundle rb = SystemConfig.getBundle();
			String delWebRoot = SystemConfig.getProperty("WEBROOT",rb);
			String delPath = SystemConfig.getProperty("CSVディレクトリ",rb);
			String delTermStr = SystemConfig.getProperty("CSVファイル保持期間",rb);

			if(delWebRoot == null || delPath == null || delTermStr == null){
				throw new FoundationException("CsvWriter","delete","(SBM0866) プロパティファイルの設定が不正です。");
			}

			//削除期間
			int delTerm = Integer.parseInt(delTermStr);

			//CSVディレクトリの取得
			if(!delWebRoot.endsWith("/")){
				delWebRoot = delWebRoot + "/";
			}
			if(delPath.startsWith("/")){
				delPath = delPath.substring(1);
			}
			if(!delPath.endsWith("/")){
				delPath = delPath + "/";
			}
			String csvDir = delWebRoot + delPath;

			//CSVファイルの取得
			File tempFile = new File(csvDir);
			File [] csvFiles = tempFile.listFiles();
			if(csvFiles == null || csvFiles.length == 0){
				//CSVファイルが１つもない
				return;
			}

			for(int i=0;i<csvFiles.length;i++){
				String fileName = csvFiles[i].getName();
				if(fileName.indexOf(".csv") == -1){
					continue;
				}

				int startIndex = fileName.lastIndexOf("_");
				int lastIndex = fileName.lastIndexOf(".csv");
				if(startIndex == -1 || lastIndex == -1){
					continue;
				}
				String fileDateStr = fileName.substring(startIndex+1,lastIndex);
				Date keepDate = null;
				try{
					Date fileDate = Converter.strToDate(fileDateStr,"yyyyMMddHHmmssSSS");
					GregorianCalendar cal = new GregorianCalendar();
					cal.setTime(fileDate);
					cal.add(Calendar.DATE, delTerm);
					keepDate = cal.getTime();
				}catch(Exception pe){
					continue;
				}

				//保持期間が今日より前のCSVファイルを削除する
				if(keepDate.compareTo(today) < 0){
					csvFiles[i].delete();
				}
			}

		}catch(MissingResourceException mre){
			FoundationException fe = new FoundationException("CsvWriter","delete","(SBM0867) プロパティファイルが見つかりません。");
			fe.setPreviousException(mre);
			throw fe;
		}catch(NumberFormatException ne){
			FoundationException fe = new FoundationException("CsvWriter","delete","(SBM0868) CSV保持期間の値が不正です。");
			fe.setPreviousException(ne);
			throw fe;
		}catch(FoundationException foe){
			throw foe;
		}catch(Exception e){
			FoundationException fe = new FoundationException("CsvWriter","delete","(SBM0869) 予期せぬエラーです。");
			fe.setPreviousException(e);
			throw fe;
		}
	}
}
