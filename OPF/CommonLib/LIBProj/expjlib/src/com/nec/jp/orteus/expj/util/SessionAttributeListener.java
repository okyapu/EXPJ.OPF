/**
 *(#)SessionAttributeListener.java
 *
 * Copyright (c) 2008 NEC Informatec Systems,Ltd.
 *
 * History 2008/09/10 Orteus/Studio側の同クラスを元に作成
 *                    EXPLANNNER/Jのログに情報を出力する機能を追加
 */
package com.nec.jp.orteus.expj.util;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import com.nec.jp.orteus.util.logging.*;
import com.nec.jp.orteus.expj.systemlog.*;

/**
 * ログイン・ログアウトログ出力クラス
 * ログイン、ログアウト(セッションタイムアウト時含む)情報をコンソール画面、及び
 * ログファイルに出力するためのクラスです。
 * 使用するためには、"web.xml"ファイルに<listener>タグでクラスを定義しておく必要が
 * あります。
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.2 $
 */
public class SessionAttributeListener implements HttpSessionAttributeListener {

	/** 
	 * システムログ初期化失敗メッセージ
	 */
	private final static String initErr = "(SBM1219)システムログの初期化に失敗しました";

	/**
	 * ログイン情報を出力します。
	 */
	public void attributeAdded(HttpSessionBindingEvent sbe) {
		if("UserId".equals(sbe.getName())) {
			String message = "(SBM1220)セッション(UserId:" + sbe.getValue() + ")が設定されました。";
			System.out.println(message);
			SystemLog sysLog = new SystemLog();
			boolean logInit = sysLog.init(getClass().getName());
			if(!logInit){
				//システムログの初期化に失敗しました
				System.out.println(initErr);
			}
			sysLog.info("ZZ01006", (String)sbe.getValue(), message);
		}
	}

	/**
	 * ログアウト(セッションタイムアウト含む)情報を出力します。
	 */
	public void attributeRemoved(HttpSessionBindingEvent sbe) {
		if("UserId".equals(sbe.getName())) {
			String message = "(SBM1221)セッション(UserId:" + sbe.getValue() + ")が削除されました。";
			System.out.println(message);
			SystemLog sysLog = new SystemLog();
			boolean logInit = sysLog.init(getClass().getName());
			if(!logInit){
				//システムログの初期化に失敗しました
				System.out.println(initErr);
			}
			sysLog.info("ZZ01006", (String)sbe.getValue(), message);
		}
	}

	/**
	 * セッションが置換された際の情報を出力します。
	 * EXPLANNERJ 2.5.0以前の環境では、ログアウト時にセッション置換処理が行われます。
	 */
	public void attributeReplaced(HttpSessionBindingEvent sbe) {
		if("UserId".equals(sbe.getName())) {
			String message = "(SBM1222)セッション(UserId:" + sbe.getValue() + ")が置き換えられました。";
			System.out.println(message);
			SystemLog sysLog = new SystemLog();
			boolean logInit = sysLog.init(getClass().getName());
			if(!logInit){
				//システムログの初期化に失敗しました
				System.out.println(initErr);
			}
			sysLog.info("ZZ01006", (String)sbe.getValue(), message);
		}
	}

}
