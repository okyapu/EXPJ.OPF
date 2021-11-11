/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/csv/CsvReader.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.csv;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.PrivateConfig;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
//import com.nec.jp.orteus.eo.*;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.nec.jp.orteus.util.CoreTools;

/**
 * ＣＳＶアップロード部品
 *
 * @author $Author: geng-jia $
 * @version $Revision: 1.8 $ $Date: 2015/07/09 07:37:36 $
*/
public class CsvReader extends com.nec.jp.orteus.eo.CsvReader {

	protected HttpServletRequest req = null;
	private int maxSize = 1024 * 1024 * 1;  // 最大ファイルサイズ1MB
	private int minSize = 1024; //最小限ファイルサイズ1KB
	private String charset = null;
	private String encoding = null;
	private int csvLenth = 0;
	private static final String PROP_FILE = "Encoding";	// プロパティファイル
	private static final String PROP_KEY = ".csv.read";	// プロパティキー
	private static final String DEFAULT_ENCODING = "Windows-31J";	// デフォルト文字エンコード

 /**
 * コンストラクタ
 * @param request	インプットストリームを含むHTTPリクエスト
 * @throws FoundationException 引数が正しくない場合
*/
	public CsvReader(HttpServletRequest request)
			throws FoundationException {
		if (request == null){
			throw new FoundationException(this.getClass().getName(),"CsvReader","(SBM0858) コンストラクタの引数が不正です");
		}
		this.req = request;
	}

	public void setCharset(String str) {
		if ((str != null) && (str.length() != 0)) charset = str;
		else charset = "iso-2022-jp";
	}

	public void setEncoding(String str) {
		if ((str != null) && (str.length() != 0)) encoding = str;
		else encoding = "SJIS";
	}

	/**
	 *  CSVサイズの取得
	 *
	 * @return CSVサイズ
	 * @throws SQLException 
	 * @throws エラー
	 */
	public int getCsvReadSize() throws SQLException{
		int n = 1;
		IDbConnection conn = null;
		try {
			conn = CoreTools.getTransConnection();
			PrivateConfig privateConfig = new PrivateConfig(conn);
			String csvReadSize = privateConfig.getString("CSV_READ_SIZE");
			if (csvReadSize == null || "".equals(csvReadSize)){
				n = 1;
			} else {
				try{
					n = Integer.parseInt(csvReadSize);
					if ( n <= 0){
						n = 1;
					}
				} catch(Exception e){
					n = 1;
				}
			}
		} catch (FoundationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			CoreTools.closeTransConnection(conn);
			conn = null;
		}
		return n;
	}
	/**
	 *  アップロードデータをストリング配列に取り込みます。
	 *
	 * @return ストリング配列
	 * @throws FoundationException ファイル読み込み時のエラー
	 */
	public String[] lineRead()
			throws FoundationException{
		Hashtable ctt_tbl = new Hashtable();
		try {

			String errorMsg = checkUploadFileFormat(this.req);
			if (errorMsg != null) {
				throw new FoundationException(this.getClass().getName(),"CsvReader",errorMsg);
			}
			else {

				// charset取得
				String user_cd = req.getRemoteUser();
				String locale = CoreTools.getLocale(user_cd);
				setCharset(CoreTools.getCharset(locale));

				// 「Encoding.properties」で、キー「XX.csv.read」が存在しない場合、
				//  キー「XX」の値を使用。但し、XX はロケールの値である
				ResourceBundle rb = CoreTools.getResourceBundle(PROP_FILE);
				String enc = null;
				try{
					enc = rb.getString(locale + PROP_KEY);
				} catch (MissingResourceException e) {
					enc = null;
				}

				if(enc == null || enc.length() <= 0){
					setEncoding(DEFAULT_ENCODING);
				} else {
					setEncoding(enc);
				}

				/*
				String e = CoreTools.getEncoding(locale + PROP_KEY);
				if(e == null || e.length() <= 0) {
					setEncoding(CoreTools.getEncoding(locale));
				} else {
					setEncoding(e);
				}
				*/

				//マルチ・パートのデータから必要なデータを抽出
				int ind = this.req.getContentType().indexOf("boundary=");
				String boundary = this.req.getContentType().substring(ind + 9);
				csvLenth = this.req.getContentLength();
				ctt_tbl = parseMultipart(boundary, this.req.getInputStream());   // マルチ・パート解析
//				String ctt_str = ((ByteArrayOutputStream) ctt_tbl.get("content")).toString();
				String ctt_str = new String(((ByteArrayOutputStream)ctt_tbl.get("content")).toByteArray(), charset);

				//バイト配列を改行で分離した文字列配列へ変換
				StringTokenizer token = new StringTokenizer(ctt_str, "\n");
				String[] data_buff = new String[token.countTokens()];
				for (int i = 0; token.hasMoreTokens(); i++) {
					String current = token.nextToken();
					if ((current != null) && (current.length() > 0)) {
						if ("\r".equals(current.substring(current.length()-1,current.length()))) {
							data_buff[i] = current.substring(0,current.length()-1);
						}
						else {
							data_buff[i] = current;
						}
					}
					else {
						data_buff[i] = "";
					}
				}
				return data_buff;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new FoundationException("CsvReader", "lineRead", "(SBM0859) ファイルの読み込み時にエラーが発生しました");
		} finally {
			if (ctt_tbl != null) {
				ctt_tbl = null;
			}
		}
	}

	/**
	 *  マルチ・パートのデータから必要なデータ(file名,content-type名,contentデータ)を抽出します
	 *
	 * @param bdry マルチ・パート・データ
	 * @param in 入力ストリーム
	 * @return 抽出データ
	 * @exception IOException  I/O例外
	 * @throws SQLException 
	 */
	public Hashtable parseMultipart(String bdry, ServletInputStream in)
			throws IOException, SQLException {
		Hashtable tbl = new Hashtable();
		if (csvLenth<minSize) {
			csvLenth = minSize;
		}
		int buffer_size = csvLenth;
		byte[] b = new byte[buffer_size];
		String line = null;
		String lowerline = null;
		int len;
		ByteArrayOutputStream content = new ByteArrayOutputStream(buffer_size);
		String name = null;

		while ((len = in.readLine(b, 0, buffer_size)) != -1) {
			line = new String(b, 0, len - 2);   //改行コード\r\nを除去
			lowerline = line.toLowerCase();

			//content-dispositionの監視
			if (lowerline.startsWith("content-disposition")) {
				//name(識別キー文字)の取得
				int s1 = lowerline.indexOf("name=\"");
				int e1 = lowerline.indexOf("\"", s1 + 7);
				if (s1 != -1 && e1 != -1) {
					name = line.substring(s1 + 6, e1);
					//nameが[upload]の場合はcontentsまで取得します
					if (name.equals("upload")) {
						//filenameの取得
						int s2 = lowerline.indexOf("filename=\"", e1 + 2);
						int e2 = lowerline.indexOf("\"", s2 + 10);
						if (s2 != -1 && e2 != -1) {
							tbl.put("filename", line.substring(s2 + 10, e2));
						}

						//content-typeの取得　ブランク行まで読み飛ばします
						while ((len = in.readLine(b, 0, buffer_size)) != 2) {
							line = new String(b, 0, len - 2);
							lowerline = line.toLowerCase();
							if (lowerline.startsWith("content-type")) {
								int s3 = lowerline.indexOf(" ");
								if (s3 != -1) {
									//contenttype抽出
									tbl.put("contenttype", lowerline.substring(s3 + 1));
								}
							}
						}

						//contentの取得
						ByteArrayOutputStream content_cache = new ByteArrayOutputStream();

						//while ((len = in.readLine(b, 0, buffer_size)) != -1) {
						//	content_cache.write(b, 0, len);
						//}

						String encCont;
						byte[] charsetCont;
						boolean keyCheck = (encoding.toLowerCase()).equals(charset.toLowerCase());

						while ((len = in.readLine(b, 0, buffer_size)) != -1) {
							if(keyCheck){
								content_cache.write(b, 0, len);

							// 「Encoding.properties」で設定した内容と「CharSet.properties」の内容と異なる場合
							// バイトストリーム　→　文字列　→　バイトストリーム
							// 　　　　　　　　Encoding　　Charset
							} else {
								encCont = new String(b, 0, len, encoding);
								charsetCont = encCont.getBytes(charset);
								content_cache.write(charsetCont, 0, charsetCont.length);
							}
						}


						//boundary文字列並びに改行を除去して整形
						content.write(content_cache.toByteArray(),
								0,
								(content_cache.toByteArray()).length - ("--" + bdry + "--").length() - 4);
						tbl.put("content", content);
						content_cache.close();
						content.close();

					}
					else if (name.equals("tablename")) {
						//tablenameの取得
						String s_cache = null;
						while (lowerline.indexOf(bdry) == -1) {
							s_cache = line;
							len = in.readLine(b, 0, buffer_size);
							line = new String(b, 0, len - 2);
							lowerline = line.toLowerCase();
						}
						//tablename抽出
						tbl.put(name, s_cache);
					}
					else {
						//nextPageの取得
						String s_cache = null;
						while (lowerline.indexOf(bdry) == -1) {
							s_cache = line;
							len = in.readLine(b, 0, buffer_size);
							line = new String(b, 0, len - 2);
							lowerline = line.toLowerCase();
						}
						//tablename抽出
						tbl.put(name, s_cache);
					}
				}
			}
		}
		in.close();
		return tbl;
	}


	/**
	 *  ファイルがアップロード可能かチェックします。
	 *
	 *@param req HTTPリクエスト
	 *@return エラー・メッセージ。エラーがなければnullを返します。
	 * @throws SQLException 
	 */
	private String checkUploadFileFormat(HttpServletRequest req) throws SQLException {
		String errorMsg = null;

		//ContentTypeのチェック
		if (!req.getContentType().toLowerCase().startsWith("multipart/form-data")) {
			errorMsg = "(SBM0860) FORMタグで指定されたcontent-typeが正しくありません。";
		}

		//ファイルサイズのチェック
		else if (req.getContentLength() > maxSize * getCsvReadSize()) {
		    errorMsg = "(SBM0861) ファイルのサイズが大きすぎます。" + maxSize *getCsvReadSize() + " 以下にして下さい。";
		}

		//boundary値のチェック (RFC1867非対応のブラウザで発生する）
		else if (req.getContentType().indexOf("boundary=") == -1) {
			errorMsg = "(SBM0863) お使いのブラウザはRFC1867に準拠していないのでサービスを利用できません。";
		}


		return errorMsg;
	}

}
