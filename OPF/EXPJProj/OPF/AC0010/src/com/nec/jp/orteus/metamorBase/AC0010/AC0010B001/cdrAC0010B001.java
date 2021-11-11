/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0010/src/com/nec/jp/orteus/metamorBase/AC0010/AC0010B001/cdrAC0010B001.java,v $
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
 * EXPJ    (2004/04/05),メソッドコメントの「* @param なし」をすべて削除
 *                     ,メソッドコメントの「* @return なし」をすべて削除
 *                     ,EXPLANNER/J用に改造
 * 3.0.0.0 (2003/03/19),ManageContainerコンストラクタ修正
 * 2.0.0.1 (2002/10/18),user implements lavel名修正
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.AC0010.AC0010B001;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.ba.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.wa.*;

import java.util.*;
import java.io.*;

//{{user_implement_dev:import
 // TODO: ここにimportパッケージを記述してください
//}}user_implement_dev:import

/**
 * CLASS     : cdrAC0010B001 クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.10 $ $Date: 2014/11/05 07:01:05 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class cdrAC0010B001 extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	public void initialize() throws BatchAppException, SystemException
	{
		try {
			m_container = new ManageContainer();

			// db接続を取得します
			IManageConnection defaultMgr=m_container.findBatchConnection("default"),
						  transactionMgr=m_container.findBatchConnection("transaction");

			m_conductor.setConnection(defaultMgr.getConnection(), transactionMgr.getConnection());

			// entity、controlインスタンスを新規作成/追加します
			m_med.setreadMPlant_all( new readMPlant_all(m_med, m_conductor) );
			m_med.setreadSysOdCalcCtrl_all( new readSysOdCalcCtrl_all(m_med, m_conductor) );
			m_med.setreadSysJobOdCalcCtrl_all( new readSysJobOdCalcCtrl_all(m_med, m_conductor) );
			m_med.setCtrlMain( new CtrlMain(m_med, m_conductor) );
			m_conductor.addObject( m_med.getreadMPlant_all() );
			m_conductor.addObject( m_med.getreadSysOdCalcCtrl_all() );
			m_conductor.addObject( m_med.getreadSysJobOdCalcCtrl_all() );
			m_conductor.addObject( m_med.getCtrlMain() );

			// データ参照処理を追加します

			// データ加工処理を追加します
			m_conductor.addControl( m_med.getCtrlMain() );

			// データ更新処理を追加します
		} catch(FoundationException e) {
			throw new SystemException("SYSERR", "接続情報の取得に失敗しました", null, null, e);
		}

		return;
	}

	//////////////////////////////

	// commitかrollbackかを指示します
	static boolean m_doCommit=true;

	/**
	 * 最終的にcommitするかrollbackするかを指示します
	 *
	 * @param doCommit true .. commitします、false .. rollbackします
	 */
	public static void setCommitFlag(boolean doCommit) { m_doCommit = doCommit; }

	//////////////////////////////

	/**
	 * クラス型を返します
	 *
	 * @return クラス型
	 */
	public int getType() { return m_conductor.getType(); }

        //{{user_implement_dev:conductor
       
        /**
         * 初期処理を行います
         */
        public int beginProc() throws BatchAppException
        {
         try {
          if(m_container.getBatchString("batchUser") != null) {
           m_med.setUsername(m_container.getBatchString("batchUser"));
          }
          m_conductor.beginTrans();
          return m_conductor.beginProc();
         } catch(BatchAppException e) {
          setCommitFlag(false);
          throw e;
         } catch(FoundationException e) {
          setCommitFlag(false);
          BatchAppException be=new BatchAppException("cdrAC0010B001", "beginProc", "conductorの初期処理に失敗しました");
          be.addMessage(e.getErrmsg());
          throw be;
         }
        }
       
        /**
         * バッチ処理を実行します
         */
        public int execute() throws BatchAppException
        {
         try {
          return m_conductor.execute();
         } catch(BatchAppException e) {
          setCommitFlag(false);
          throw e;
         }
        }
       
        /**
         * 終了処理を行います
         */
        public int endProc() throws SystemException
        {
         int ret;
       
         try {
          ret = m_conductor.endProc();
         } catch(BatchAppException e) {
          setCommitFlag(false);
          m_conductor.rollback();
          throw new SystemException("SYSERR", "終了処理失敗", null, null, e);
         }
       
         if(m_doCommit==true) {
          m_conductor.commit();
         } else {
          m_conductor.rollback();
         }
       
         return ret;
        }
       
        //}}user_implement_dev:conductor

	//////////////////////////////

	// コンテナクラスインスタンス
	ManageContainer m_container;

	// mediatorのインスタンスを格納する
	medAC0010B001 m_med=new medAC0010B001();

	// BatchAppConductorクラスインスタンス
	BatchAppConductor m_conductor=new BatchAppConductor("AC0010B001");

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	//////////////////////////////

	/**
	 * ctrAC0010B001クラス 標準コンストラクタ
	 *
		 */
	public cdrAC0010B001() throws BatchAppException
	{
		initialize();

                //{{user_implement_dev:constractor
                 // TODO: ここに初期処理を記述してください
                //}}user_implement_dev:constractor

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
		 */
	protected void finalize()
	{
		objMessage=null;
		return;
	}

	//////////////////////////////

}
