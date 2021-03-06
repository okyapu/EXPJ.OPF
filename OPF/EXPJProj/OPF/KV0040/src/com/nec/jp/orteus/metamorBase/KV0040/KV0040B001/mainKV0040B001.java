/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0040/src/com/nec/jp/orteus/metamorBase/KV0040/KV0040B001/mainKV0040B001.java,v $
 *
 * Copyright (c) 2003-2005 NEC Corporation.
 * Copyright (c) 2003-2005 NEC Informatec Systems,Ltd.
 *
 * ALL RIGHTS RESERVED  BY   NEC INFORMATEC SYSTEMS, LTD.
 * THIS PROGRAM MUST BE USED SOLELY  FOR  THE PURPOSE FOR
 * WHICH IT WAS FURNISHED BY NEC INFORMATEC SYSTEMS, LTD,
 * NO PART OF THIS PROGRAM MAY BE REPRODUCED OR DISCLOSED
 * TO  OTHERS,  IN ANY FORM  WITHOUT  THE  PRIOR  WRITTEN
 * PERMISSION OF NEC INFORMATEC SYSTEMS, LTD.
 * USE OF COPYRIGHT NOTICE  DOES NOT EVIDENCE PUBLICATION
 * OF THE PROGRAM
 *
 * NEC INFORMATEC SYSTEMS  CONFIDENTIAL  AND  PROPRIETARY
 *
 * テンプレート履歴：
 * EXPJ    (2006/03/16),ログ出力機能強化
 * EXPJ    (2004/09/21),ログ出力のバグを修正
 * EXPJ    (2004/03/21),EXPLANNER/J用に改造
 *                      SystemLogの記述を追加。
 * 3.0.0.2 (2003/12/10),リターン値を変更可能にする修正
 * 3.0.0.1 (2003/12/09),静的ファイルパス指定のリソースバンドル化
 * 3.0.0.0 (2003/03/19),bootファイルのデフォルト修正
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.KV0040.KV0040B001;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.ba.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.foundation.j2.*;

import java.util.Properties;
import java.sql.*;

import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.systemlog.*;

import java.util.ResourceBundle;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.File;

//{{user_implement_dev:import
	// TODO: ここにimportパッケージを記述してください
//}}user_implement_dev:import

/**
 * CLASS     : mainKV0040B001 クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2016/05/23 08:25:59 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class mainKV0040B001
{
    // リターン値
	//{{user_implement_dev:variables
	public static int RV_SUCCESS = 0;
	public static int RV_FAIL = 1;
        //}}user_implement_dev:variables

	// バッチメイン処理
	public static void main(String args[])
	{
		ManageContainer container;
		SystemLog sysLog = null;

		try {
			/** 
			 * ログファイルの初期化
			 */
			if (sysLog == null) {
				sysLog = new SystemLog();
				if(!sysLog.init("com.nec.jp.orteus.metamorBase.KV0040B001")) {
					//システムログの初期化に失敗しました
					throw new ExpjException("ZZ01005");
				}
			}

			//{{user_implement_dev:main
			ResourceBundle bundle = SystemConfig.getBundle();

			// 標準出力ファイル名設定
			String logFileName = "KV0040B001.log";
			if(logFileName == null){
				ExpjMessage emsg = new ExpjMessage("ZZ01006","Logging FileName Can't get");
				sysLog.severe(emsg, "batchuser");
				throw new ExpjException(emsg);
			}

			// バッチ用プロパティからパス情報の取得。
			String logOutputPath = SystemConfig.getProperty("BATCH_LOG_PATH", bundle);
			if(logOutputPath == null){
				ExpjMessage emsg = new ExpjMessage("ZZ01006","Logging Directory Can't Get.");
				sysLog.severe(emsg, "batchuser");
				throw new ExpjException(emsg);
			}
			else {
				System.setOut(new PrintStream( new FileOutputStream(logOutputPath + "/KV0040B001stdout.log") ) );
				System.setErr(new PrintStream( new FileOutputStream(logOutputPath + "/KV0040B001stderr.log") ) );
			}

			// ログ設定の取得
			String configFile = SystemConfig.getProperty("BATCH_CONFIG_FILE", bundle);
			if(configFile == null){
				ExpjMessage emsg = new ExpjMessage("ZZ01006","ConfigFile Can't Get.");
				sysLog.severe(emsg, "batchuser");
			}

			// ログファイルの初期化
			CoreTools.initLog();
			CoreTools.setDir( logOutputPath + "/" );
			CoreTools.setFileName( logFileName );

			if( (null == configFile) || (CoreTools.initialize(configFile) == false) ) {
				ExpjMessage emsg = new ExpjMessage("ZZ01006","Batch Initialize Failed configFile=" + configFile);
				sysLog.severe(emsg, "batchuser");
			}

			container = CoreTools.getContainer();

			// プロパティファイルの読込み
			ApplicationProperties.init(container);
                        //}}user_implement_dev:main

			if (container.getBatchString("batchUser") == null) {
				sysLog.severe("ZZ01006", "batchuser", "can't get batchuser");
			}

			cdrKV0040B001 ebo = new cdrKV0040B001();
			ebo.m_med.setSyslog(sysLog);
			ebo.m_med.setArgs(args);

			ebo.beginProc();
			ebo.execute();
			ebo.endProc();

			// 処理の結果をリターン値とする場合はここに記述します。
			//{{user_implement_dev:main_set_return
			// RV_SUCCESS = CtrlMain.getExecuteStatus();
                        //}}user_implement_dev:main_set_return

		} catch(BatchAppException e) {
			e.printStackTrace();
			System.exit(RV_FAIL);
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(RV_FAIL);
		}

		System.exit(RV_SUCCESS);
	}

}

