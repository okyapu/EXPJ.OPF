/**
 *(#)CsvReader.java
 *
 * Copyright (c) 2004 NEC informatec Systems,Ltd.
 *
 * @author T.Taniguchi
 *
 * バージョン管理キーワード設定
 * \$Date\$
 * \$Revision\$
 * \$Log\$
 */

package com.nec.jp.orteus.metamorBase.common.CsvReader;

import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.eo.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CsvReader extends com.nec.jp.orteus.eo.CsvReader {

	protected HttpServletRequest req = null;
	private int maxSize = 1024 * 1024 * 1;  // 最大ファイルサイズ1MB

	/**
	 * コンストラクタ
	 * @param request	インプットストリームを含むHTTPリクエスト
	 * @throws FoundationException
	 */
	public CsvReader(HttpServletRequest request) throws FoundationException{
		if(request == null){
			throw new FoundationException(this.getClass().getName(),"CsvReader","(SBM0858)コンストラクタの引数が不正です");
		}
		this.req = request;
	}


	/**
	 *  アップロードデータをストリング配列に取り込む。<p>
	 *
	 * @throws FoundationException
	 */
	public String[] lineRead() throws FoundationException{
		Hashtable ctt_tbl = new Hashtable();
		try {

			/*
			 *  ファイルチェック
			 */
			String errorMsg = checkUploadFileFormat(this.req);
			if (errorMsg != null) {
				/*
				 *  エラーの表示
				 */
				throw new FoundationException(this.getClass().getName(),"CsvReader",errorMsg);
			}
			else {
				/*
				 *  マルチ・パートのデータから必要なデータを抽出する。
				 */
				int ind = this.req.getContentType().indexOf("boundary=");
				String boundary = this.req.getContentType().substring(ind + 9);
				ctt_tbl = parseMultipart(boundary, this.req.getInputStream());   // マルチ・パート解析
				String ctt_str = ((ByteArrayOutputStream) ctt_tbl.get("content")).toString();

				/*
				 *  バイト配列を改行で分離した文字列配列へ変換
				 */
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
			throw new FoundationException("CsvReader", "lineRead", "(SBM0859)ファイルの読み込み時にエラーが発生しました");
		} finally {
			if (ctt_tbl != null) {
				ctt_tbl = null;
			}
		}
	}


	/**
	 *  マルチ・パートのデータから必要なデータ(file名,content-type名,contentデータ)を抽出する。<p>
	 *
	 *@param  bdry             マルチ・パート・データ
	 *@param  in               入力ストリーム
	 *@return                  抽出データ
	 *@exception  IOException  I/O例外
	 *@since
	 */
	public Hashtable parseMultipart(String bdry, ServletInputStream in)
			throws IOException {
		Hashtable tbl = new Hashtable();
		int buffer_size = maxSize;
		byte[] b = new byte[buffer_size];
		String line = null;
		String lowerline = null;
		int len;
		ByteArrayOutputStream content = new ByteArrayOutputStream(buffer_size);
		String name = null;

		while ((len = in.readLine(b, 0, buffer_size)) != -1) {
			line = new String(b, 0, len - 2);   //改行コード\r\nを除去
			lowerline = line.toLowerCase();

			/*
			 *  content-dispositionの監視
			 */
			if (lowerline.startsWith("content-disposition")) {

				/*
				 *  name(識別キー文字)の取得
				 */
				int s1 = lowerline.indexOf("name=\"");
				int e1 = lowerline.indexOf("\"", s1 + 7);
				if (s1 != -1 && e1 != -1) {
					name = line.substring(s1 + 6, e1);

					/*
					 *  nameが[upload]の場合はcontentsまで取得する
					 */
					if (name.equals("upload")) {

						/*
						 *  filenameの取得
						 */
						int s2 = lowerline.indexOf("filename=\"", e1 + 2);
						int e2 = lowerline.indexOf("\"", s2 + 10);
						if (s2 != -1 && e2 != -1) {
							//filename抽出
							tbl.put("filename", line.substring(s2 + 10, e2));
						}

						/*
						 *  content-typeの取得
						 *  ブランク行まで読み飛ばす
						 */
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

						/*
						 *  contentの取得
						 */
						ByteArrayOutputStream content_cache = new ByteArrayOutputStream();
						while ((len = in.readLine(b, 0, buffer_size)) != -1) {
							content_cache.write(b, 0, len);
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
						/*
						 *  tablenameの取得
						 */
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
						/*
						 *  nextPageの取得
						 */
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
	 *  ファイルがアップロード可能かチェックする。
	 *
	 *@param  req  HTTPリクエスト
	 *@return      エラー・メッセージ。エラーがなければnullを返す。
	 *@since
	 */
	private String checkUploadFileFormat(HttpServletRequest req) {
		String errorMsg = null;

		/*
		 *  ContentTypeのチェック
		 */
		if (!req.getContentType().toLowerCase().startsWith("multipart/form-data")) {
			errorMsg = "(SBM0860)FORMタグで指定されたcontent-typeが正しくありません。";
		}

		/*
		 *  ファイルサイズのチェック
		 *
		 *  サイズの大きなファイルを指定して下記のgetContentLength()をコールすると
		 *  エラーが発生する。サイズの上限は確認できていないが、参考にしたサンプル
		 *  実装でも同様の現象となるので、WebLogicの問題と思われる。
		 *  回避策として、サイズチェックを行わない事とする。
		 */
		else if (req.getContentLength() > maxSize) {
		    errorMsg = "(SBM0861)ファイルのサイズが大きすぎます。" + maxSize + " 以下にして下さい。";
		}

		/*
		 *  boundary値のチェック (RFC1867非対応のブラウザで発生する）
		 */
		else if (req.getContentType().indexOf("boundary=") == -1) {
			errorMsg = "(SBM0863)お使いのブラウザはRFC1867に準拠していないのでサービスを利用できません。";
		}

		return errorMsg;
	}
}
