//------------------------------------------------------------------------------
// (#)SystemLogConfig.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/17 新規作成 M.Sakamoto
// 2003/06/24 OrteusStudioバージョンアップに伴う修正 Y.Inada
//            前：doConnection[ver1.00.03]
//            後：IDbConnection[ver1.00.05]
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
// 2003/07/29 SunOne対応の為、本クラスをシングルトンクラスに修正 Y.Inada
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.SystemLog;

import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.util.logging.LogManager;
import com.nec.jp.orteus.util.logging.Handler;
import com.nec.jp.orteus.util.logging.Level;
import com.nec.jp.orteus.util.logging.Logger;
import com.nec.jp.orteus.util.logging.ConsoleHandler;
import com.nec.jp.orteus.util.logging.LogStartupException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.MissingResourceException;
import java.util.Enumeration;

/**
  * システムログ設定
  *
  * @author  M.Sakamoto
  * @version 1.00
*/
public class SystemLogConfig
{

	/**
	  * インスタンス取得
	  * @return システム設定
	 */
	public static SystemLogConfig getInstance()
	{
		return _config;
	}

	/**
	  * 初期化。
	  * @return true:初期化成功  false:初期化失敗
	*/
	public static synchronized boolean init()
	{
		// ログ出力状態のチェック
		if(_status == true) return _status;

		// 初期化
		LogManager manager = LogManager.getLogManager();
		manager.removeAllGlobalHandlers();

		// 実行
		boolean ret = exec();
		_categorys.clear();
		_logfiles.clear();

		// 判定
		if(false == ret) {
			// 異常検出のため、クリーンアップ
			manager.removeAllGlobalHandlers();

			// 異常終了
			System.out.println("(SBM1204)ERROR SystemLog:初期化に失敗しました");
			System.out.println("(SBM1212)ERROR SystemLog:起動を停止します");

			// ログ出力不可設定
			_status = false;
		}
		else{
			// ログ出力可能設定
			_status = true;
		}

		return _status;
	}

	/**
	  * 実施。
	  * @return 成功:true / 失敗:false
	*/
	private static boolean exec()
	{
		// 定義ファイル用意
		ResourceBundle outproperties = null;
		try {
			outproperties = ResourceBundle.getBundle(SystemLogCommon.HANDLER_PROPERTIES);
		}catch(MissingResourceException ex) {
			System.out.println("(SBM1213)ERROR SystemLog:出力先定義["
					+ SystemLogCommon.HANDLER_PROPERTIES + ".properties]が見つかりません");
			return false;
		}

		// 環境取得
		int environment = getEnvironment(outproperties);
		if(SystemLogCommon.ENVIRONMENT_UNKOWN == environment)
			return false;		// 結果異常

		// 共通定義展開
		boolean ret = makeHandler(
				SystemLogCommon.COMMON_CATEGORY, environment, outproperties);
		if(false == ret)
			return false;		// 結果異常

		// 個別定義展開
		ret = makeIndividualHandler(environment, outproperties);
		if(false == ret)
			return false;		// 結果異常

		// 正常終了
		return true;
	}

	/**
	  * 個別定義展開。
	  * @param environment 動作環境
	  * @param properties 出力先定義ファイルのリソースバンドル
	  * @return true(結果正常), false(結果異常)
	*/
	private static boolean makeIndividualHandler(
			int environment, ResourceBundle properties)
	{
		// 定義数取得
		Integer propertynum = SystemConfig.getPropertyNumber("DefinitionCount", properties);
		if(null == propertynum) {
			System.out.println("(SBM1214)ERROR SystemLog:出力先定義 Key[DefinitionCount]が未設定です");
			return false;		// 結果異常
		}
		if(propertynum.intValue() < 0 || 999 < propertynum.intValue()) {
			System.out.println("(SBM1215)ERROR SystemLog:出力先定義 "
					+ "Key[DefinitionCount]の設定値が不正です[" + propertynum.intValue() + "]");
			return false;		// 結果異常
		}

		// 定義数分、定義を展開
		String category = null;
		String categorykey = null;
		for(int i = 1; i <= propertynum.intValue(); i++) {
			// カテゴリ名取得
			categorykey = "category" + paddingZero(i, 3);
			category = SystemConfig.getProperty(categorykey, properties);
			if(null == category)
				continue;		// 処理を飛ばす

			// カテゴリ重複チェック
			for(int j = 0; j < _categorys.size(); j++) {
				if(true == category.equals((String)_categorys.get(j))) {
					System.out.println("(SBM1216)ERROR SystemLog:出力先定義 "
							+ "カテゴリ[" + category + "]が重複定義されています");
					return false;	// カテゴリ重複のため、結果異常
				}
			}

			// ハンドラ作成
			boolean ret = makeHandler(category, environment, properties);
			if(false == ret)
				return false;		// 結果異常
		}
		return true;
	}

	/**
	  * 出力先定義展開。
	  * @param category 出力先定義を展開するカテゴリ
	  * @param environment 動作環境
	  * @param properties 出力先定義ファイルのリソースバンドル
	  * @return true(結果正常), false(結果異常)
	*/
	private static boolean makeHandler(
			String category, int environment, ResourceBundle properties)
	{
		// 出力レベル取得
		Level level = getLevel(category, properties);
		if(Level.OFF == level)
			return false;	// 結果異常

		// ハンドラキー取得
		ArrayList handlerkeys = getHandlers(category, properties);
		if(null == handlerkeys)
			return false;	// 結果異常

		// 出力先詳細設定
		boolean ret = false;
		ArrayList handlers = new ArrayList(0);
		for(int i = 0; i < handlerkeys.size(); i++) {
			ret = createHandler(category + "." + (String)handlerkeys.get(i), properties, handlers);
			if(false == ret)
				return false;		// 結果異常
			if(true == handlers.isEmpty())
				break;				// "なし"の設定が行われたため、設定停止
		}

		// ハンドラ登録
		SystemLogFilter filter = new SystemLogFilter(category);
		SystemLogFormatter formatter = new SystemLogFormatter(environment);
		LogManager manager = LogManager.getLogManager();
		for(int j = 0; j < handlers.size(); j++) {
			Handler handler = (Handler)handlers.get(j);
			handler.setFilter(filter);
			handler.setFormatter(formatter);
			handler.setLevel(level);
			manager.addGlobalHandler(handler);
		}

		// カテゴリ登録
		_categorys.add(category);

		// ロッガー登録
		ret = makeLogger(category, level);
		if(false == ret)
			return false;		// 結果異常

		return true;
	}

	/**
	  * 出力先定義展開。
	  * @param category 出力先定義を展開するハンドラキー
	  * @param properties 出力先定義ファイルのリソースバンドル
	  * @param handlers ハンドラリスト
	  * @return true(結果正常), false(結果異常)
	*/
	private static boolean createHandler(
			String key, ResourceBundle properties, ArrayList handlers)
	{
		String value = SystemConfig.getProperty(key, properties);
		if(true == "Console".equals(value)) {
			// コンソールハンドラ作成
			handlers.add(new ConsoleHandler());

		}else if(true == "File".equals(value)) {
			// ファイルハンドラ作成
			Handler handler = createFileHandler(key, properties);
			if(null == handler)
				return false;			// 結果異常
			handlers.add(handler);

		}else if(true == "None".equals(value)) {
			// 出力なし
			handlers.clear();

		}else if(null == value) {
			// 設定値異常
			System.out.println("(SBM1217)ERROR SystemLog:出力先定義 Key[" + key + "]が未設定です");
			return false;

		}else{
			// 未設定
			System.out.println("(SBM1218)ERROR SystemLog:出力先定義 "
					+ "Key[" + key + "]の設定値が不正です[" + value + "]");
			return false;
		}
		return true;
	}

	/**
	  * ファイルハンドラ生成。
	  * @param category 出力先定義を展開するハンドラキー
	  * @param properties 出力先定義ファイルのリソースバンドル
	  * @param handlers ハンドラリスト
	  * @return true(結果正常), false(結果異常)
	*/
	private static Handler createFileHandler(String key, ResourceBundle properties)
	{
		// 用意
		SystemLogFileHandler fileHandler = null;
		String pathvalue = null;
		Integer limit = new Integer(0);
		Integer backup = new Integer(0);

		// ファイルパス
		String keypath = key + ".logfile";
		pathvalue = SystemConfig.getProperty(keypath, properties);
		if(null == pathvalue) {
			System.out.println("(SBM1217)ERROR SystemLog:出力先定義 Key[" + keypath + "]が未設定です");
			return null;			// 結果異常
		}else if(true == pathvalue.equals("")) {
			System.out.println("(SBM1217)ERROR SystemLog:出力先定義 Key[" + keypath + "]が未設定です");
			return null;			// 結果異常
		}

		// パス重複チェック
		for(int i = 0; i < _logfiles.size(); i++) {
			if(true == pathvalue.equals((String)_logfiles.get(i))) {
				System.out.println("(SBM1235)ERROR SystemLog:出力先定義 "
						+ "ログファイル[" + pathvalue + "]が重複定義されています");
				return null;
			}
		}

		// 切り替え
		String keyswitch = key + ".switchTrigger";
		String triggervalue = SystemConfig.getProperty(keyswitch, properties);
		if(null != triggervalue) {
			// 切り替えあり
			if(true == triggervalue.equals("")) {
				System.out.println("(SBM1217)ERROR SystemLog:出力先定義 Key[" + keyswitch + "]が未設定です");
				return null;			// 結果異常
			}
			if(false == "Size".equals(triggervalue)) {
				System.out.println("(SBM1218)ERROR SystemLog:出力先定義 "
						+ "Key[" + keyswitch + "]の設定値が不正です[" + triggervalue + "]");
				return null;			// 設定値が"Size"以外のため、結果異常
			}

			// 切り替え単位、バックアップ数
			String keynum = key + ".switchnum";
			String keybackup = key + ".backup";
			limit = SystemConfig.getPropertyNumber(keynum, properties);
			backup = SystemConfig.getPropertyNumber(keybackup, properties);
			if(null == limit) {
				System.out.println("(SBM1217)ERROR SystemLog:出力先定義 Key[" + keynum + "]が未設定です");
				return null;			// 結果異常
			}
			if(null == backup) {
				System.out.println("(SBM1217)ERROR SystemLog:出力先定義 Key[" + keybackup + "]が未設定です");
				return null;			// 結果異常
			}

			// 範囲チェック
			if(limit.intValue() < 1 || Long.MAX_VALUE < limit.intValue()) {
				System.out.println("(SBM1218)ERROR SystemLog:出力先定義 "
						+ "Key[" + keynum + "]の設定値が不正です[" + limit + "]");
				return null;		// 切り替え単位が範囲外のため、結果異常
			}
			if(backup.intValue() < 1 || 999 < backup.intValue()) {
				System.out.println("(SBM1218)ERROR SystemLog:出力先定義 "
						+ "Key[" + keybackup + "]の設定値が不正です[" + backup + "]");
				return null;		// バックアップ数が範囲外のため、結果異常
			}
		}

		// ファイルハンドラ生成
		try{
			fileHandler = new SystemLogFileHandler(pathvalue, limit.intValue(), backup.intValue());
		}catch(LogStartupException logex){
			System.out.println("(SBM1236)ERROR SystemLog:出力先定義 "
					+ "Key[" + key + "]設定による初期化に失敗しました");
			System.out.println("MESSAGE " + logex.getMessage());
			return null;
		}

		// ファイルパス登録
		_logfiles.add(pathvalue);
		return fileHandler;
	}

	/**
	  * ロッガー登録。
	  * @param category 出力先定義を展開するハンドラキー
	  * @param level 出力レベル
	  * @return true(結果正常), false(結果異常)
	*/
	private static boolean makeLogger(String category, Level level)
	{
		// ロッガー作成
		boolean ret = SystemLogger.makeLogger(category, level);
		if(false == ret) {
			System.out.println("(SBM1237)ERROR SystemLog:カテゴリ[" + category + "]のLOGGER生成に失敗しました");
		}
		return ret;
	}

	/**
	  * 環境取得。
	  * @param properties 出力先定義ファイルのリソースバンドル
	  * @return 環境
	*/
	private static int getEnvironment(ResourceBundle properties)
	{
		int environment = SystemLogCommon.ENVIRONMENT_UNKOWN;	// 不定
		String value = SystemConfig.getProperty("systemlog.environment", properties);
		if(null == value) {
			System.out.println("(SBM1238)ERROR SystemLog:出力先定義 Key[systemlog.environment]が未設定です");
			return environment;
		}
		if(true == "Development".equals(value)) {
			environment = SystemLogCommon.ENVIRONMENT_DEVELOPMENT;		// 開発環境
		}else if(true == "Employment".equals(value)) {
			environment = SystemLogCommon.ENVIRONMENT_EMPLOYMENT;		// 運用環境
		}else{
			System.out.println("(SBM1239)ERROR SystemLog:出力先定義 " + 
				"Key[systemlog.environment]の設定値が不正です[設定値:" + value + "]");
		}
		return environment;
	}

	/**
	  * 出力レベル取得。
	  * @param category 取得対象カテゴリ
	  * @param properties 出力先定義ファイルのリソースバンドル
	  * @return 出力レベル
	*/
	private static Level getLevel(String category, ResourceBundle properties)
	{
		Level level = Level.OFF;		// ログ出力なし
		String key = category + ".level";
		String value = null;
		try {
			value = SystemConfig.getProperty(key, properties);
			if(value != null) {
				level = Level.parse(value);
			}else{
				System.out.println("(SBM1217)ERROR SystemLog:出力先定義 Key[" + key + "]が未設定です");
			}
		}
		catch(IllegalArgumentException ex) {
			System.out.println("(SBM1218)ERROR SystemLog:出力先定義 "
					+ "Key[" + category + "]の設定値が不正です[" + value + "]");
		}
		return level;
	}

	/**
	  * 出力先取得。
	  * @param category 取得対象カテゴリ
	  * @param properties 出力先定義ファイルのリソースバンドル
	  * @return 出力先(ハンドラ)のリスト
	*/
	private static ArrayList getHandlers(String category, ResourceBundle properties)
	{
		ArrayList list = null;
		String value = null;
		try {
			value = SystemConfig.getProperty(category, properties);
			if(null != value) {
				list = new ArrayList(0);
				StringTokenizer token = new StringTokenizer(value, ",");
				while(true == token.hasMoreTokens()) {
					list.add(token.nextToken());
				}
			}else{
				System.out.println("(SBM1217)ERROR SystemLog:出力先定義 Key[" + category + "]が未設定です");
			}
		}
		catch(NoSuchElementException ex) {
			System.out.println("(SBM1218)ERROR SystemLog:出力先定義 "
					+ "Key[" + category + "]の設定値が不正です[" + value + "]");
			list = null;
		}
		return list;
	}

	/**
	  * 数値の0詰め。
	  * @param target 数値
	  * @param count 桁数
	  * @return 結果
	*/
	private static String paddingZero(int target, int count)
	{
		StringBuffer buff = new StringBuffer(Integer.toString(target));
		while(buff.length() < count) {
			buff.insert(0, '0');
		}
		return buff.toString();
	}

	/**
	 * コンストラクタ
	 */
	private SystemLogConfig(){}

	/** インスタンス */
	private static SystemLogConfig _config = new SystemLogConfig();

	/** ログ出力状態  true:出力可能  false:出力不可 */
	private static boolean _status = false;

	/** カテゴリリスト */
	private static ArrayList _categorys = new ArrayList(0);

	/** ログファイルパスリスト */
	private static ArrayList _logfiles = new ArrayList(0);
}

