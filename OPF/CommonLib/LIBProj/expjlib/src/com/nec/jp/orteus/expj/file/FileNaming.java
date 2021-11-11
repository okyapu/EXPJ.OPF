/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/file/FileNaming.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.file;

import java.lang.System;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.io.File;

/**
 * ファイルネーミング。
 * システムにおけるファイル命名機能を提供する。<BR>
 * 命名するファイル名は、システムで一意であることを保証する。
 *
 * @see FileNaming
 * @author $Author: wang-derui $
 * @version $Revision: 1.4 $ $Date: 2008/03/26 07:27:55 $
 */

public class FileNaming
{
	/**  機能名  */
	private String _target = null;
	/**
	 * 機能名設定。
	 * @param target 機能名
	 */
	public void setTarget(String target) { _target = target; }
	/**
	 * 機能名取得。
	 * @return 機能名
	 */
	public String getTarget() { return _target; }


	/**  アプリケーション番号  */
	private String _applicationNo = null;
	/**
	 * アプリケーション番号設定。
	 * @param appNo アプリケーション番号
	 */
	public void setApplicationNo(String applicationNo) { _applicationNo = applicationNo; }
	/**
	 * アプリケーション番号取得。
	 * @return アプリケーション番号
	 */
	public String getApplicationNo() { return _applicationNo; }


	/**  ユーザ  */
	private String _user = null;
	/**
	 * ユーザ設定。
	 * @param user ユーザ
	 */
	public void setUser(String user) { _user = user; }
	/**
	 * ユーザ取得。
	 * @return ユーザ
	 */
	public String getUser() { return _user; }


	/**  追加識別  */
	private String _mark = null;
	/**
	 * 追加識別設定。
	 * @param mark 追加識別
	 */
	public void setMark(String mark) { _mark = mark; }
	/**
	 * 追加識別取得。
	 * @return 追加識別
	 */
	public String getMark() { return _user; }


	/**  拡張子  */
	private String _extension = null;
	/**
	 * 拡張子設定。
	 * @param extension 拡張子
	 */
	public void setExtension(String extension) { _extension = extension; }
	/**
	  * 拡張子取得。
	  * @return 拡張子
	*/
	public String getExtension() { return _extension; }


	/**  ディレクトリ  */
	private String _directory = null;
	/**
	 * ディレクトリ設定。
	 * @param directory ディレクトリ
	 */
	public void setDirectory(String directory) { _directory = directory; }
	/**
	  * ディレクトリ取得。
	  * @return ディレクトリ
	*/
	public String getDirectory() { return _directory; }


	/**  ファイル名  */
	private String _namingName = null;

	/**  作成日時  */
	private String _namingTime = null;

	/**  ディレクトリ  */
	private String _namingDirectory = null;


	/**
	  * 命名。
	  * @return ファイル名
	*/
	public String naming()
	{
		_namingName = null;
		_namingDirectory = null;
		_namingTime = null;

		// 未設定判定
		if(null == _directory || null == _extension)
			return null;	// 未設定のため、結果異常

		// ディレクトリチェック
		if(false == existsDir(_directory))
			return null;	// ディレクトリが正しくないため、結果異常

		// 時刻文字列取得(現在時刻:YYYYMMDDHHmmSS)
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateformat = formatter.format((new Date(System.currentTimeMillis())));

		// ファイル名用意(機能名/アプリケーション番号/ユーザ/日付 部分のみ)
		String directoryformat = _directory + "/";
		StringBuffer fileformat = new StringBuffer();
		if(null != _target) fileformat.append(_target + "_");
		if(null != _applicationNo) fileformat.append(_applicationNo + "_");
		if(null != _user) fileformat.append(_user + "_");
		fileformat.append(dateformat + "_");
		if(null != _mark) fileformat.append(_mark);
		String extension = "." + _extension;

		// ファイル確定
		int sequenceNo = -1;
		String filename = null;
		do {
			sequenceNo++;
			filename = fileformat.toString() + Integer.toString(sequenceNo) + extension;
		}
		while(true == exists(directoryformat + filename));

		// 確定
		_namingName = filename;
		_namingDirectory = _directory;
		_namingTime = dateformat;
		return getNamingPath();
	}

	/**
	  * 命名ファイル名取得。
	  * @return ファイル名
	*/
	public String getNamingName()
	{
		return _namingName;
	}

	/**
	  * 命名ディレクトリ取得。
	  * @return ファイル名
	*/
	public String getNamingDirectory()
	{
		return _namingDirectory;
	}

	/**
	  * 命名時刻文字列取得。
	  * @return 時刻文字列:yyyyMMddHHmmss
	*/
	public String getNamingTime()
	{
		return _namingTime;
	}

	/**
	  * 命名パス取得。
	  * @return ファイル名
	*/
	public String getNamingPath()
	{
		if(null == _namingName || null == _namingDirectory) return null;
		return _namingDirectory + "/" + _namingName;
	}

	/**
	  * ファイル存在判定。
	  * @return true:存在する / false:存在しない
	*/
	public boolean exists()
	{
		return exists(_namingDirectory + "/" + _namingName);
	}

	/**
	  * ディレクトリ存在判定。
	  * @return true:存在する / false:存在しない
	*/
	public boolean existsDir()
	{
		return existsDir(_namingDirectory);
	}

	/**
	  * ファイル存在判定。
	  * @param path 判定ファイルパス
	  * @return true:存在する / false:存在しない
	*/
	public static boolean exists(String path)
	{
		if(null == path) return false;
		File file = new File(path);
		return file.isFile();
	}

	/**
	  * ディレクトリ存在判定。
	  * @param path 判定ディレクトリパス
	  * @return true:存在する / false:存在しない
	*/
	public static boolean existsDir(String path)
	{
		if(null == path) return false;
		File file = new File(path);
		return file.isDirectory();
	}

	/**
	  * ファイルネーミングの構築。
	*/
	public FileNaming()
	{
		_target = null;
		_applicationNo = null;
		_user = null;
		_extension = null;
		_directory = null;
		_namingName = null;
		_namingTime = null;
		_namingDirectory = null;
	}



}
