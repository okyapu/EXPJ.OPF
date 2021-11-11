/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/systemlog/SystemLog.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.systemlog;

import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.util.logging.LogManager;
import com.nec.jp.orteus.util.logging.Logger;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.util.logging.Level;

import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.MissingResourceException;

/**
 * システムログを出力する為のインタフェース。
 * 
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2013/06/27 02:43:23 $
 */
public class SystemLog {

	/** 
	 * ロッガー 
	 */
	private Logger _logger = null;
	
	/**
	 * オブジェクトを構築します。
	 */
	public SystemLog(){}

	/**
	 * 初期化。<BR>
	 * システムログの機能を使用する場合、必ず初期化を行う必要があります。<BR>
	 * 未初期化時にシステムログ機能を使用した場合の動作は保証しません。
	 * 
	 * @param  packageName ログID
	 * @return true:初期化成功	false:初期化失敗
	 */
	public boolean init(String packageName)
	{
		// ログ出力の準備
		SystemLogConfig config = SystemLogConfig.getInstance();
		if (config.init() == false) {
			return false; 
		} 

		ResourceBundle appproperties =
				ResourceBundle.getBundle(SystemLogCommon.APPRICATION_PROPERTIES);

		String category = null;
		try {
			category = appproperties.getString(packageName);
		}
		catch(MissingResourceException ex) {
			// パッケージが定義されていない場合、共通カテゴリ使用
			category = SystemLogCommon.COMMON_CATEGORY;
		}
		catch(NullPointerException nu) {
			// キーがNULLの場合、共通カテゴリ使用
			category = SystemLogCommon.COMMON_CATEGORY;
		}

		LogManager logmgr = LogManager.getLogManager();
		_logger = logmgr.getLogger(category);

		return true;
	}

	/**
	 * コネクション設定。<BR>
	 * <BR>
	 * @param  connect コネクション
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void setConnection(IDbConnection connect)
	{

		/* 
			現在使用されていないコードです。
			将来業務ＡＰ側よりこのメソッドが呼び出される為、
			コンパイル不可の回避にこのメソッドは残します。
			よって、全ての業務ＡＰよりこのメソッドが削除された時に、
			このメソッドを消去してください。
			※　既に、内部で使用していた関連コードは全て削除済みです。
		*/

	}

	/**
	 * ログ出力。<br>
	 * 指定されたメッセージからログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void severe(ExpjMessage msg, String user)
	{
		if (_logger.isLoggable(Level.SEVERE) == false) {
			return;
		} 

		log_d(Level.SEVERE, msg.getMessage(CoreTools.getLocale(user)), user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void severe(String messageNo, String user)
	{
		if (_logger.isLoggable(Level.SEVERE) == false) {
			return;
		} 

		log(Level.SEVERE, messageNo, user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 */
	public void severe(String messageNo, String user, Object param1)
	{
		if (_logger.isLoggable(Level.SEVERE) == false) {
			return;
		} 

		log(Level.SEVERE, messageNo, user, param1);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void severe(String messageNo, String user,Object param1, Object param2)
	{
		if (_logger.isLoggable(Level.SEVERE) == false) {
			return;
		} 

		log(Level.SEVERE, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void severe(String messageNo, String user,Object param1, Object param2, Object param3)
	{
		if (_logger.isLoggable(Level.SEVERE) == false) {
			return;
		}

		log(Level.SEVERE, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param パラメータ配列
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void severe(String messageNo, String user, Object[] param)
	{
		if (_logger.isLoggable(Level.SEVERE) == false) {
			return;
		} 

		log(Level.SEVERE, messageNo, user, param);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたメッセージからログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void warning(ExpjMessage msg, String user)
	{
		if (_logger.isLoggable(Level.WARNING) == false) {
			return;
		} 

		log_d(Level.WARNING, msg.getMessage(CoreTools.getLocale(user)), user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void warning(String messageNo, String user)
	{
		if (_logger.isLoggable(Level.WARNING) == false) {
			return;
		} 

		log(Level.WARNING, messageNo, user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 */
	public void warning(String messageNo, String user, Object param1)
	{
		if (_logger.isLoggable(Level.WARNING) == false) {
			return;
		} 

		log(Level.WARNING, messageNo, user, param1);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void warning(String messageNo, String user, Object param1, Object param2)
	{
		if (_logger.isLoggable(Level.WARNING) == false) {
			return;
		} 

		log(Level.WARNING, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void warning(String messageNo, String user, Object param1, Object param2, Object param3)
	{
		if (_logger.isLoggable(Level.WARNING) == false) {
			return;
		} 

		log(Level.WARNING, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param パラメータ配列
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void warning(String messageNo, String user, Object[] param)
	{
		if (_logger.isLoggable(Level.WARNING) == false) {
			return;
		} 

		log(Level.WARNING, messageNo, user, param);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたメッセージからログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void info(ExpjMessage msg, String user)
	{
		if (_logger.isLoggable(Level.INFO) == false) {
			return;
		} 
		
		log_d(Level.INFO, msg.getMessage(CoreTools.getLocale(user)), user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void info(String messageNo, String user)
	{
		if (_logger.isLoggable(Level.INFO) == false) {
			return;
		} 

		log(Level.INFO, messageNo, user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 */
	public void info(String messageNo, String user, Object param1)
	{
		if (_logger.isLoggable(Level.INFO) == false) {
			return;
		} 

		log(Level.INFO, messageNo, user, param1);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void info(String messageNo, String user, Object param1, Object param2)
	{
		if (_logger.isLoggable(Level.INFO) == false) {
			return;
		} 

		log(Level.INFO, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void info(String messageNo, String user, Object param1, Object param2, Object param3)
	{
		if (_logger.isLoggable(Level.INFO) == false) {
			return;
		} 

		log(Level.INFO, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param パラメータ配列
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void info(String messageNo, String user, Object[] param)
	{
		if (_logger.isLoggable(Level.INFO) == false) {
			return;
		} 

		log(Level.INFO, messageNo, user, param);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたメッセージからログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void config(ExpjMessage msg, String user)
	{
		if (_logger.isLoggable(Level.CONFIG) == false) {
			return;
		} 

		log_d(Level.CONFIG, msg.getMessage(CoreTools.getLocale(user)), user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void config(String messageNo, String user)
	{
		if (_logger.isLoggable(Level.CONFIG) == false) {
			return;
		} 

		log(Level.CONFIG, messageNo, user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 */
	public void config(String messageNo, String user, Object param1)
	{
		if (_logger.isLoggable(Level.CONFIG) == false) {
			return;
		} 

		log(Level.CONFIG, messageNo, user, param1);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void config(String messageNo, String user, Object param1, Object param2)
	{
		if (_logger.isLoggable(Level.CONFIG) == false) {
			return;
		} 

		log(Level.CONFIG, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void config(String messageNo, String user, Object param1, Object param2, Object param3)
	{
		if (_logger.isLoggable(Level.CONFIG) == false) {
			return;
		} 

		log(Level.CONFIG, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param パラメータ配列
	 * @deprecated このメソッドはEXPLANNER/Jでは推奨されていません。
	 */
	public void config(String messageNo, String user, Object[] param)
	{
		if (_logger.isLoggable(Level.CONFIG) == false) {
			return;
		} 

		log(Level.CONFIG, messageNo, user, param);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたメッセージからログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void fine(ExpjMessage msg, String user)
	{
		if (_logger.isLoggable(Level.FINE) == false) {
			return;
		} 

		log_d(Level.FINE, msg.getMessage(CoreTools.getLocale(user)), user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void fine(String messageNo, String user)
	{
		if (_logger.isLoggable(Level.FINE) == false) {
			return;
		} 

		log(Level.FINE, messageNo, user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 */
	public void fine(String messageNo, String user, Object param1)
	{
		if (_logger.isLoggable(Level.FINE) == false) {
			return;
		} 

		log(Level.FINE, messageNo, user, param1);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 */
	public void fine(String messageNo, String user, Object param1, Object param2)
	{
		if (_logger.isLoggable(Level.FINE) == false) {
			return;
		} 

		log(Level.FINE, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 */
	public void fine(String messageNo, String user, Object param1, Object param2, Object param3)
	{
		if (_logger.isLoggable(Level.FINE) == false) {
			return;
		} 

		log(Level.FINE, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param パラメータ配列
	 */
	public void fine(String messageNo, String user, Object[] param)
	{
		if (_logger.isLoggable(Level.FINE) == false) {
			return;
		} 

		log(Level.FINE, messageNo, user, param);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたメッセージからログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void finer(ExpjMessage msg, String user)
	{
		if (_logger.isLoggable(Level.FINER) == false) {
			return;
		} 

		log_d(Level.FINER, msg.getMessage(CoreTools.getLocale(user)), user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void finer(String messageNo, String user)
	{
		if (_logger.isLoggable(Level.FINER) == false) {
			return;
		} 

		log(Level.FINER, messageNo, user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 */
	public void finer(String messageNo, String user, Object param1)
	{
		if (_logger.isLoggable(Level.FINER) == false) {
			return;
		} 

		log(Level.FINER, messageNo, user, param1);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 */
	public void finer(String messageNo, String user, Object param1, Object param2)
	{
		if (_logger.isLoggable(Level.FINER) == false) {
			return;
		} 

		log(Level.FINER, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 */
	public void finer(String messageNo, String user, Object param1, Object param2, Object param3)
	{
		if (_logger.isLoggable(Level.FINER) == false) {
			return;
		} 

		log(Level.FINER, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param パラメータ配列
	 */
	public void finer(String messageNo, String user, Object[] param)
	{
		if (_logger.isLoggable(Level.FINER) == false) {
			return;
		} 

		log(Level.FINER, messageNo, user, param);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたメッセージからログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void finest(ExpjMessage msg, String user)
	{
		if (_logger.isLoggable(Level.FINEST) == false) {
			return;
		} 

		log_d(Level.FINEST, msg.getMessage(CoreTools.getLocale(user)), user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void finest(String messageNo, String user)
	{
		if (_logger.isLoggable(Level.FINEST) == false) {
			return;
		} 

		log(Level.FINEST, messageNo, user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 */
	public void finest(String messageNo, String user, Object param1)
	{
		if (_logger.isLoggable(Level.FINEST) == false) {
			return;
		} 

		log(Level.FINEST, messageNo, user, param1);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 */
	public void finest(String messageNo, String user, Object param1, Object param2)
	{
		if (_logger.isLoggable(Level.FINEST) == false) {
			return;
		} 

		log(Level.FINEST, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 */
	public void finest(String messageNo, String user, Object param1, Object param2, Object param3)
	{
		if (_logger.isLoggable(Level.FINEST) == false) {
			return;
		} 

		log(Level.FINEST, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param パラメータ配列
	 */
	public void finest(String messageNo, String user, Object[] param)
	{
		if (_logger.isLoggable(Level.FINEST) == false) {
			return;
		} 

		log(Level.FINEST, messageNo, user, param);
	}

	/**
	 * デバッグ用 ログ出力。<br>
	 * 指定されたログメッセージを、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void fine_d(String message, String user)
	{
		if (_logger.isLoggable(Level.FINE) == false) {
			return;
		} 

		log_d(Level.FINE, message, user);
	}

	/**
	 * デバッグ用 ログ出力。<br>
	 * 指定されたログメッセージを、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void finer_d(String message, String user)
	{
		if (_logger.isLoggable(Level.FINER) == false) {
			return;
		} 
		
		log_d(Level.FINER, message, user);
	}

	/**
	 * デバッグ用 ログ出力。<br>
	 * 指定されたログメッセージを、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void finest_d(String message, String user)
	{
		if (_logger.isLoggable(Level.FINEST) == false) {
			return;
		} 

		log_d(Level.FINEST, message, user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  level 出力レベル
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void log(Level level, String messageNo, String user)
	{
		if (_logger.isLoggable(level) == false) {
			return;
		} 

		Object[] param = {};
		log(level, messageNo, user, param);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  level 出力レベル
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 */
	public void log(Level level, String messageNo, String user, Object param1)
	{
		if (_logger.isLoggable(level) == false) {
			return;
		} 

		Object[] param = {param1};
		log(level, messageNo, user, param);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  level 出力レベル
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 */
	public void log(Level level, String messageNo, String user, Object param1, Object param2)
	{
		if (_logger.isLoggable(level) == false) {
			return;
		} 

		Object[] param = {param1, param2};
		log(level, messageNo, user, param);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  level 出力レベル
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 */
	public void log(Level level, String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		if (_logger.isLoggable(level) == false) {
			return;
		} 

		Object[] param = {param1, param2, param3};
		log(level, messageNo, user, param);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  level 出力レベル
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 * @param  param パラメータ配列
	 */
	public void log(Level level, String messageNo, String user, Object[] param)
	{
		if (_logger.isLoggable(level) == false) {
			return;
		} 
		
		String message = getLogMessage(messageNo, CoreTools.getLocale(user));
		String newMessage = createMessage(message, param);
		log_d(level, newMessage, user);
	}

	/**
	 * ログ出力。<br>
	 * 指定されたログメッセージ番号からログメッセージを取得し、
	 * 出力先定義、アプリケーション定義で定義された出力先に出力します。
	 * 
	 * @param  level 出力レベル
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void log_d(Level level, String message, String user)
	{
		_logger.log(level, SystemLog.class.getName(), null, messagecat(message, user));
	}

	/**
	 * メッセージと実行ユーザ名を連結します。
	 * 
	 * @param  message メッセージ
	 * @param  user 実行ユーザ名
	 * @return 連結したメッセージ
	 */
	private String messagecat(String message, String user)
	{
		if (user == null) {
			return message;
		} 

		return message+"["+user+"]";
	}

	/**
	 * メッセージにパラメータを挿入し、メッセージ文字列を作成します。
	 * 
	 * @param  message メッセージ
	 * @param  param パラメータ
	 * @return パラメータを設定したメッセージ
	 */
	private String createMessage(String message, Object[] param)
	{
		return MessageFormat.format(message, param);
	}

	/**
	 * 指定されたキーのメッセージを取得します。
	 * 
	 * @param  messageNo メッセージ番号
	 * @param  locale 言語コード
	 * @return 取得したメッセージ。
	 * 			取得できなかった場合は、メッセージが存在しない旨を伝えるメッセージを返します。
	 */
	private String getLogMessage(String messageNo, String locale)
	{
		/** メッセージプロパティファイル */
		ResourceBundle messageFile = null;
		String filename = SystemLogCommon.MESSAGE_PROPERTIES_FILE;

		try {
			if (CoreTools.getLocale(null).equals(locale)) {
				messageFile = ResourceBundle.getBundle(filename);
			} else {
				messageFile = CoreTools.getResourceBundle(filename, locale);
			}

		}catch (MissingResourceException e) {
			messageFile = null;
			return new String("(SBM0943) メッセージ定義ファイル[" + filename + "]が見つかりません。");
		}

		String val = null;

		try {
			//メッセージの取得
			val = messageFile.getString(messageNo);

			if (val == null){
				val = new String("(SBM0835) メッセージキー " + messageNo + " に対応するメッセージがありません。");
			}

		}catch (MissingResourceException e) {
			val = new String("(SBM0835) メッセージキー " + messageNo + " に対応するメッセージがありません。");

		}finally{
			messageFile = null;
		}

		return val;

	}

}

