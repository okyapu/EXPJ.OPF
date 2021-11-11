/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/file/FileCleaner.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * ファイルクリーナー。<br>
 * 与えられた条件に一致するファイルを削除します。<br>
 * ファイル削除の条件は、機能名、アプリケーション番号、ユーザ、拡張子、ディレクトリパス、日付です。
 *
 * @see FileNaming
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:55 $
 */
public class FileCleaner
{
	/**
	 * 機能名
	 */
	private String _target = null;
	
	/**
	 * アプリケーション番号
	 */
	private String _applicationNo = null;
	
	/**
	 * ユーザ
	 */
	private String _user = null;
	
	/**
	 * 拡張子
	 */
	private String _extension = null;
	
	/**
	 * ディレクトリパス
	 */
	private String _directory = null;

	/**
	 * ファイルクリーナーの構築。
	 */
	public FileCleaner()
	{
		_target = null;
		_applicationNo = null;
		_user = null;
		_extension = null;
		_directory = null;
	}

	/**
	 * アプリケーション番号設定。
	 * @param applicationNo アプリケーション番号
	 */
	public void setApplicationNo(String applicationNo)
	{
		_applicationNo = applicationNo;
	}

	/**
	 * ディレクトリパス設定。
	 * @param directory ディレクトリパス番号
	 */
	public void setDirectory(String directory)
	{
		_directory = directory;
	}

	/**
	 * 拡張子設定。
	 * @param extension 拡張子
	 */
	public void setExtension(String extension)
	{
		_extension = extension;
	}

	/**
	 * 機能名設定。
	 * @param target 機能名
	 */
	public void setTarget(String target)
	{
		_target = target;
	}

	/**
	 * ユーザ設定。
	 * @param user ユーザ
	 */
	public void setUser(String user)
	{
		_user = user;
	}

	/**
	 * アプリケーション番号取得。
	 * @return アプリケーション番号
	 */
	public String getApplicationNo()
	{
		return _applicationNo;
	}

	/**
	 * ディレクトリパス取得。
	 * @return ディレクトリパス
	 */
	public String getDirectory()
	{
		return _directory;
	}

	/**
	 * 拡張子取得。
	 * @return 拡張子
	 */
	public String getExtension()
	{
		return _extension;
	}

	/**
	 * 機能名取得。
	 * @return 機能名
	 */
	public String getTarget()
	{
		return _target;
	}

	/**
	 * ユーザ取得。
	 * @return ユーザ
	 */
	public String getUser()
	{
		return _user;
	}

	/**
	 * 掃除。保持する情報に基づいて、ファイルを削除します。
	 * @param before 日付。
	 * @return 処理の成否 true:成功  false:失敗
	 */
	public boolean cleanup(Date before)
	{
		// 未設定判定
		if (_directory == null || _extension == null) {
			return false;
		}
		// 引数判定
		if (before == null) {
			return false;
		}
		// 取得
		File[] files = null;
		if ((files = this.listFiles(_directory)) == null) {
			return false;
		}
		// 日付加工
		String date = this.convert(before);
		if (date.equals("") == true) {
			return false;
		}
		// 検索
		Vector buf = new Vector();
		for (int i = 0; i < files.length; i++) {
			String name = files[i].getName();
			// 拡張子を探す
			int index = name.lastIndexOf('.');
			if (index == -1) {
				continue;
			}
			if (name.substring(index + 1).equals(_extension) == false) {
				continue;
			}
			// ファイル名をトークンに分ける
			StringTokenizer token = new StringTokenizer(name, "_");
			if (token.countTokens() < 2) {	// 下限がトークン2個なので
				continue;
			}
			// 格納
			String[] tmp = new String[token.countTokens()];
			for (int j = 0; token.hasMoreTokens() == true; j++) {
				tmp[j] = token.nextToken();
			}
			// 日時比較
			if (tmp[tmp.length - 2].compareTo(date) >= 0) {
				continue;
			}
			// 検索ファイル名
			StringBuffer comp1 = new StringBuffer();
			if(null != _target) comp1.append(_target + "_");
			if(null != _applicationNo) comp1.append(_applicationNo + "_");
			if(null != _user) comp1.append(_user + "_");

			// 対象ファイル名
			StringBuffer comp2 = new StringBuffer();
			for (int j = 0; j < tmp.length - 2; j++) {
				comp2.append(tmp[j] + "_");
			}
			// ファイル名比較
			if (comp1.toString().equals(comp2.toString()) == false) {
				continue;
			}
			// 抽出
			buf.add(files[i]);
		}
		// 削除
		return this.delete(buf);
	}

	/**
	 * 掃除。保持する情報に基づいて、ファイルを削除します。
	 * @param before 日付
	 * @return 処理の成否 true:成功  false:失敗
	 */
	public boolean cleanupWild(Date before)
	{
		// 未設定判定
		if (_directory == null || _extension == null) {
			return false;
		}
		// 引数判定
		if (before == null) {
			return false;
		}
		// 取得
		File[] files = null;
		if ((files = this.listFiles(_directory)) == null) {
			return false;
		}
		// 日付加工
		String date = this.convert(before);
		if (date.equals("") == true) {
			return false;
		}
		// 検索
		Vector buf = new Vector();
		for (int i = 0; i < files.length; i++) {
			String name = files[i].getName();
			// 拡張子を探す
			int index = name.lastIndexOf('.');
			if (index == -1) {
				continue;
			}
			if (name.substring(index + 1).equals(_extension) == false) {
				continue;
			}
			// ファイル名をトークンに分ける
			StringTokenizer token = new StringTokenizer(name, "_");
			if (token.countTokens() != 5) {	// ファイル名省略無しのみ対象
				continue;
			}
			// 格納
			String[] tmp = new String[token.countTokens()];
			for (int j = 0; token.hasMoreTokens() == true; j++) {
				tmp[j] = token.nextToken();
			}
			// 日時比較
			if (tmp[tmp.length - 2].compareTo(date) >= 0) {
				continue;
			}
			// 比較ファイル名構築
			StringBuffer comp1 = new StringBuffer();
			StringBuffer comp2 = new StringBuffer();
			if(null != _target) {
				comp1.append(_target);
				comp2.append(tmp[0]);
			}
			if(null != _applicationNo) {
				comp1.append(_applicationNo);
				comp2.append(tmp[1]);
			}
			if(null != _user) {
				comp1.append(_user);
				comp2.append(tmp[2]);
			}
			// ファイル名比較
			if (comp1.toString().equals(comp2.toString()) == false) {
				continue;
			}
			// 抽出
			buf.add(files[i]);
		}
		// 削除
		return this.delete(buf);
	}

	/**
	 * 日付を文字列に変換。
	 * @param before 日付
	 * @return 変換された文字列
	 */
	private String convert(Date before)
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		// 日時変換
		return format.format(before);
	}

	/**
	 * ファイルの一覧を取得。
	 * @param path ディレクトリのパス
	 * @return ファイル一覧
	 */
	private File[] listFiles(String path)
	{
		try {
			File file = new File(path);
			return file.listFiles();
		} catch (RuntimeException e) {
			return null;
		}
	}

	/**
	 * ファイル削除。
	 * @param files ファイル一覧
	 * @return 処理の成否
	 */
	private boolean delete(Vector files)
	{
		boolean flag = true;
		for (int i = 0; i < files.size(); i++) {
			try {
				if (((File)files.get(i)).delete() == false) {
					flag = false;
				}
			} catch (SecurityException e) {
				flag = false;
			}
		}
		return flag;
	}
}
