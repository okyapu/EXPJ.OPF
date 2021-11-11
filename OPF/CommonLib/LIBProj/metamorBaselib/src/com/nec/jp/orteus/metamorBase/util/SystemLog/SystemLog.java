//------------------------------------------------------------------------------
// (#)SystemLog.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/17 新規作成 M.Sakamoto
// 2003/06/25 Copyrightの記述修正 Y.Inada
//			  前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//			  後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//			  JavaDoc用コメントの体裁を整える
// 2003/07/29 Y.Inada
//			  初期化時、システムログ定義の初期化処理を追加(SunOne対応)
//			  コネクション設定メソッド追加(setConnection())
// 2003/09/30 Y.Mitui
//			  取得メッセージをＤＢから取得するのを廃止
//			  取得メッセージをAlarmMessage.propertiesファイルから取得する修正
//			  （getLogMessage内のメッセージ取得方法を一新)
// 2003/10/08 メッセージ取得ファイル定義をSystemLogCommonに移動  K.Shiraki
//            メッセージ取得失敗時の返却メッセージにメッセージ番号を含める
//------------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.util.SystemLog;

import com.nec.jp.orteus.util.logging.LogManager;
import com.nec.jp.orteus.util.logging.Logger;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.util.logging.Level;
import com.nec.jp.orteus.util.CoreTools;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.MissingResourceException;

/**
 * システムログを出力する為のインタフェース。
 *
 * @author	Y.Inada
 * @version 1.00
 */
public class SystemLog
{
	/**
	 * オブジェクトを構築する。
	 */
	public SystemLog(){}

	/**
	 * 初期化。<BR>
	 * システムログの機能を使用する場合、必ず初期化を行う必要があり、<BR>
	 * 未初期化時にシステムログ機能を使用した場合の動作は保証しない。
	 * <BR>
	 * @param  category カテゴリ
	 * @return true:初期化成功	false:初期化失敗
	 */
	public boolean init(String packageName)
	{
		// ログ出力の準備
		SystemLogConfig config = SystemLogConfig.getInstance();
		if(config.init() == false) return false;

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

//-----------------------------------------------------------------------------

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。<BR>
	 * 不正な値を引き渡した場合の動作は保障しない。<BR>
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void severe(String messageNo, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.SEVERE) == false) return;

		log(Level.SEVERE, messageNo, user);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  user 実行ユーザ名
	 */
	public void severe(String messageNo, String user, Object param1)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.SEVERE) == false) return;

		log(Level.SEVERE, messageNo, user, param1);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  user 実行ユーザ名
	 */
	public void severe(String messageNo, String user,
					Object param1, Object param2)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.SEVERE) == false) return;

		log(Level.SEVERE, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @param  user 実行ユーザ名
	 */
	public void severe(String messageNo, String user,
					Object param1, Object param2, Object param3)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.SEVERE) == false) return;

		log(Level.SEVERE, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param パラメータ配列
	 * @param  user 実行ユーザ名
	 */
	public void severe(String messageNo, String user, Object[] param)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.SEVERE) == false) return;

		log(Level.SEVERE, messageNo, user, param);
	}

//-----------------------------------------------------------------------------

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void warning(String messageNo, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.WARNING) == false) return;

		log(Level.WARNING, messageNo, user);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  user 実行ユーザ名
	 */
	public void warning(String messageNo, String user, Object param1)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.WARNING) == false) return;

		log(Level.WARNING, messageNo, user, param1);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  user 実行ユーザ名
	 */
	public void warning(String messageNo, String user,
					Object param1, Object param2)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.WARNING) == false) return;

		log(Level.WARNING, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @param  user 実行ユーザ名
	 */
	public void warning(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.WARNING) == false) return;

		log(Level.WARNING, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param パラメータ配列
	 * @param  user 実行ユーザ名
	 */
	public void warning(String messageNo, String user, Object[] param)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.WARNING) == false) return;

		log(Level.WARNING, messageNo, user, param);
	}

//-----------------------------------------------------------------------------

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void info(String messageNo, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.INFO) == false) return;

		log(Level.INFO, messageNo, user);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  user 実行ユーザ名
	 */
	public void info(String messageNo, String user, Object param1)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.INFO) == false) return;

		log(Level.INFO, messageNo, user, param1);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  user 実行ユーザ名
	 */
	public void info(String messageNo, String user,
					Object param1, Object param2)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.INFO) == false) return;

		log(Level.INFO, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @param  user 実行ユーザ名
	 */
	public void info(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.INFO) == false) return;

		log(Level.INFO, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param パラメータ配列
	 * @param  user 実行ユーザ名
	 */
	public void info(String messageNo, String user, Object[] param)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.INFO) == false) return;

		log(Level.INFO, messageNo, user, param);
	}

//-----------------------------------------------------------------------------

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void config(String messageNo, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.CONFIG) == false) return;

		log(Level.CONFIG, messageNo, user);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  user 実行ユーザ名
	 */
	public void config(String messageNo, String user, Object param1)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.CONFIG) == false) return;

		log(Level.CONFIG, messageNo, user, param1);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  user 実行ユーザ名
	 */
	public void config(String messageNo, String user, 
					Object param1, Object param2)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.CONFIG) == false) return;

		log(Level.CONFIG, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @param  user 実行ユーザ名
	 */
	public void config(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.CONFIG) == false) return;

		log(Level.CONFIG, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param パラメータ配列
	 * @param  user 実行ユーザ名
	 */
	public void config(String messageNo, String user, Object[] param)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.CONFIG) == false) return;

		log(Level.CONFIG, messageNo, user, param);
	}

//-----------------------------------------------------------------------------

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void fine(String messageNo, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINE) == false) return;

		log(Level.FINE, messageNo, user);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  user 実行ユーザ名
	 */
	public void fine(String messageNo, String user, Object param1)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINE) == false) return;

		log(Level.FINE, messageNo, user, param1);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  user 実行ユーザ名
	 */
	public void fine(String messageNo, String user, 
					Object param1, Object param2)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINE) == false) return;

		log(Level.FINE, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @param  user 実行ユーザ名
	 */
	public void fine(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINE) == false) return;

		log(Level.FINE, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param パラメータ配列
	 * @param  user 実行ユーザ名
	 */
	public void fine(String messageNo, String user, Object[] param)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINE) == false) return;

		log(Level.FINE, messageNo, user, param);
	}

//-----------------------------------------------------------------------------

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void finer(String messageNo, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINER) == false) return;

		log(Level.FINER, messageNo, user);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  user 実行ユーザ名
	 */
	public void finer(String messageNo, String user, Object param1)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINER) == false) return;

		log(Level.FINER, messageNo, user, param1);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  user 実行ユーザ名
	 */
	public void finer(String messageNo, String user, 
					Object param1, Object param2)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINER) == false) return;

		log(Level.FINER, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @param  user 実行ユーザ名
	 */
	public void finer(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINER) == false) return;

		log(Level.FINER, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param パラメータ配列
	 * @param  user 実行ユーザ名
	 */
	public void finer(String messageNo, String user, Object[] param)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINER) == false) return;

		log(Level.FINER, messageNo, user, param);
	}

//-----------------------------------------------------------------------------
	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void finest(String messageNo, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log(Level.FINEST, messageNo, user);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  user 実行ユーザ名
	 */
	public void finest(String messageNo, String user, Object param1)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log(Level.FINEST, messageNo, user, param1);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  user 実行ユーザ名
	 */
	public void finest(String messageNo, String user, 
					Object param1, Object param2)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log(Level.FINEST, messageNo, user, param1, param2);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @param  user 実行ユーザ名
	 */
	public void finest(String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log(Level.FINEST, messageNo, user, param1, param2, param3);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  messageNo ログメッセージ番号
	 * @param  param パラメータ配列
	 * @param  user 実行ユーザ名
	 */
	public void finest(String messageNo, String user, Object[] param)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log(Level.FINEST, messageNo, user, param);
	}

//-----------------------------------------------------------------------------
	/**
	 * デバッグ用 ログ出力。<BR>
	 * 指定されたログメッセージを、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void fine_d(String message, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINE) == false) return;

		log_d(Level.FINE, message, user);
	}

	/**
	 * デバッグ用 ログ出力。<BR>
	 * 指定されたログメッセージを、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void finer_d(String message, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINER) == false) return;
		log_d(Level.FINER, message, user);
	}

	/**
	 * デバッグ用 ログ出力。<BR>
	 * 指定されたログメッセージを、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void finest_d(String message, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(Level.FINEST) == false) return;

		log_d(Level.FINEST, message, user);
	}

//-----------------------------------------------------------------------------
	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  level 出力レベル
	 * @param  messageNo ログメッセージ番号
	 * @param  user 実行ユーザ名
	 */
	public void log(Level level, String messageNo, String user)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(level) == false) return;

		Object[] param = {};
		log(level, messageNo, user, param);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  level 出力レベル
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  user 実行ユーザ名
	 */
	public void log(Level level, String messageNo, String user,
					Object param1)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(level) == false) return;

		Object[] param = {param1};
		log(level, messageNo, user, param);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  level 出力レベル
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  user 実行ユーザ名
	 */
	public void log(Level level, String messageNo, String user, 
					Object param1, Object param2)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(level) == false) return;

		Object[] param = {param1, param2};
		log(level, messageNo, user, param);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  level 出力レベル
	 * @param  messageNo ログメッセージ番号
	 * @param  param1 パラメータ1
	 * @param  param2 パラメータ2
	 * @param  param3 パラメータ3
	 * @param  user 実行ユーザ名
	 */
	public void log(Level level, String messageNo, String user, 
					Object param1, Object param2, Object param3)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(level) == false) return;

		Object[] param = {param1, param2, param3};
		log(level, messageNo, user, param);
	}

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  level 出力レベル
	 * @param  messageNo ログメッセージ番号
	 * @param  param パラメータ配列
	 * @param  user 実行ユーザ名
	 */
	public void log(Level level, String messageNo, String user, Object[] param)
	{
		// ログを記録する? 記録しない場合、終了。
		if(_logger.isLoggable(level) == false) return;

		String message = getLogMessage(messageNo, CoreTools.getLocale(user));
		String newMessage = createMessage(message, param);
		log_d(level, newMessage, user);
	}

//-----------------------------------------------------------------------------

	/**
	 * ログ出力。<BR>
	 * 指定されたログメッセージ番号からログメッセージを取得し、<BR>
	 * 出力先定義、アプリケーション定義で定義された出力先に出力する。
	 * @param  level 出力レベル
	 * @param  message ログメッセージ
	 * @param  user 実行ユーザ名
	 */
	public void log_d(Level level, String message, String user)
	{
		_logger.log(level, SystemLog.class.getName(), 
								null, messagecat(message, user));
	}

//-----------------------------------------------------------------------------

	/**
	 * メッセージと実行ユーザ名を連結する。
	 * <BR>
	 * @param  message メッセージ
	 * @param  user 実行ユーザ名
	 * @return 連結したメッセージ
	 */
	private String messagecat(String message, String user)
	{
		if(user == null) return message;

		// 連結
		String newMessage = message+"["+user+"]";
		return newMessage;
	}

	/**
	 * メッセージにパラメータを挿入し、メッセージ文字列を作成する。
	 * <BR>
	 * @param  message メッセージ
	 * @param  param パラメータ
	 * @return パラメータを設定したメッセージ
	 */
	private String createMessage(String message, Object[] param)
	{
		return MessageFormat.format(message, param);
	}

//-----------------------------------------------------------------------------
	/**
	 * 指定されたキーのメッセージを取得する。
	 * <BR>
	 * @param  messageNo メッセージ番号
	 * @param  locale 言語コード
	 * @return 取得したメッセージ。
	 *		   取得できなかった場合は、メッセージが存在しない旨を伝えるメッセージを返す。
	 */
	private String getLogMessage(String messageNo, String locale)
	{

		/** メッセージプロパティファイル */
		ResourceBundle messageFile = null;
		String filename = SystemLogCommon.MESSAGE_PROPERTIES_FILE;

		try {
			//メッセージプロパティファイルのバンドル
			if (CoreTools.getLocale(null).equals(locale)) {
				messageFile = ResourceBundle.getBundle(filename);
			} else {
				messageFile = CoreTools.getResourceBundle(filename, locale);
			}

		}catch (MissingResourceException e) {
			//バンドル失敗
			messageFile = null;
			return new String("(SBM0943)メッセージ定義ファイル[" + filename + "]が見つかりません。");
		}

		String val = null;

		try {
			//メッセージの取得
			val = messageFile.getString(messageNo);

			if(val == null){
				val = new String("(SBM0835)メッセージキー " + messageNo + " に対応するメッセージがありません。");
			}

		}catch (MissingResourceException e) {
			val = new String("(SBM0835)メッセージキー " + messageNo + " に対応するメッセージがありません。");

		}finally{
			messageFile = null;
		}

		return val;

	}

	/** コネクション */
	private IDbConnection _conn = null;

	/** ロッガー */
	private Logger _logger = null;

}

