//------------------------------------------------------------------------------
// (#)PdfInfomation.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/26 新規作成 Y.Inada
// 2003/09/01 JavaDoc用コメント修正 Y.Inada
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.Pdf;

/**
 * ファイル情報。
 * ファイル情報を保持する。
 *
 * @author  Y.Inada
 * @version 1.00
*/
public class PdfInfomation
{
	/**
	  * ファイル情報の構築。
	*/
	public PdfInfomation(){}

	/**
	  * アプリケーション番号設定。
	  * @param appNo アプリケーション番号
	*/
	public void setApplicationNo(String applicationNo)
	{
		_applicationNo = applicationNo;
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
	  * コメント1設定。
	  * @param comment1 コメント1
	*/
	public void setComment1(String comment1)
	{
		_comment1 = comment1;
	}

	/**
	  * コメント2設定。
	  * @param comment2 コメント2
	*/
	public void setComment2(String comment2)
	{
		_comment2 = comment2;
	}

	/**
	  * コメント3設定。
	  * @param comment3 コメント3
	*/
	public void setComment3(String comment3)
	{
		_comment3 = comment3;
	}

	/**
	  * ファイル名設定。
	  * @param fileName ファイル名
	*/
	public void setFileName(String fileName)
	{
		_fileName = fileName;
	}

	/**
	  * ファイル作成日設定。
	  * @param fileDate ファイル作成日
	*/
	public void setFileDate(String fileDate)
	{
		_fileDate = fileDate;
	}

	/**
	  * サフィックス設定。
	  * @param suffix サフィックス
	*/
	public void setSuffix(String suffix)
	{
		_suffix = suffix;
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
	  * ユーザ取得。
	  * @return ユーザ
	*/
	public String getUser()
	{
		return _user;
	}

	/**
	  * コメント1取得。
	  * @return コメント1
	*/
	public String getComment1()
	{
		return _comment1;
	}

	/**
	  * コメント2取得。
	  * @return コメント1
	*/
	public String getComment2()
	{
		return _comment2;
	}

	/**
	  * コメント3取得。
	  * @return コメント1
	*/
	public String getComment3()
	{
		return _comment3;
	}

	/**
	  * ファイル名取得。
	  * @return ファイル名
	*/
	public String getFileName()
	{
		return _fileName;
	}

	/**
	  * ファイル作成日取得。
	  * @return ファイル作成日
	*/
	public String getFileDate()
	{
		return _fileDate;
	}

	/**
	  * サフィックス取得。
	  * @param サフィックス
	*/
	public String getSuffix()
	{
		return _suffix;
	}

	/** ユーザ */
	private String _user = null;

	/** アプリケーション番号 */
	private String _applicationNo = null;

	/** コメント1 */
	private String _comment1 = null;

	/** コメント2 */
	private String _comment2 = null;

	/** コメント3 */
	private String _comment3 = null;

	/** ファイル名 */
	private String _fileName = null;

	/** ファイル作成日 */
	private String _fileDate = null;

	/** サフィックス */
	private String _suffix = null;

}
