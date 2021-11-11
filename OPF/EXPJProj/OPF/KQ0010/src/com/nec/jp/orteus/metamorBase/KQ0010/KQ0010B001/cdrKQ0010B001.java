/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010B001/cdrKQ0010B001.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010.KQ0010B001;

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
 * CLASS     : cdrKQ0010B001 クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.21 $ $Date: 2015/12/03 08:12:35 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : cdrKQ0010B001 クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2003/11/29),新規作成
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class cdrKQ0010B001 extends Object
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
			m_med.settbl_T_ODR( new tbl_T_ODR(m_med, m_conductor) );
			m_med.settbl_T_ODR_CTL( new tbl_T_ODR_CTL(m_med, m_conductor) );
			m_med.settbl_T_ODR_ACPT_RSLT( new tbl_T_ODR_ACPT_RSLT(m_med, m_conductor) );
			m_med.settbl_T_ANS_DLV_DATE( new tbl_T_ANS_DLV_DATE(m_med, m_conductor) );
			m_med.settbl_T_ALLOC_FIXED_ODR_RSLT( new tbl_T_ALLOC_FIXED_ODR_RSLT(m_med, m_conductor) );
			m_med.settbl_M_CUST( new tbl_M_CUST(m_med, m_conductor) );
			m_med.settbl_M_CUR( new tbl_M_CUR(m_med, m_conductor) );
			m_med.settbl_M_CUST_BASE( new tbl_M_CUST_BASE(m_med, m_conductor) );
			m_med.settbl_M_ITEM( new tbl_M_ITEM(m_med, m_conductor) );
			m_med.settbl_M_ITEM_SPEC( new tbl_M_ITEM_SPEC(m_med, m_conductor) );
			m_med.settbl_M_UNIT_COST( new tbl_M_UNIT_COST(m_med, m_conductor) );
			m_med.setgetUserInfo( new getUserInfo(m_med, m_conductor) );
			m_med.setgetGyomuDate( new getGyomuDate(m_med, m_conductor) );
			m_med.setgetSEQ_ODR( new getSEQ_ODR(m_med, m_conductor) );
			m_med.setgetSEQ_ODR_CTL( new getSEQ_ODR_CTL(m_med, m_conductor) );
			m_med.setgetSEQ_RSLT_ODR( new getSEQ_RSLT_ODR(m_med, m_conductor) );
			m_med.setgetCompanyInfo( new getCompanyInfo(m_med, m_conductor) );
			m_med.setnaiji_T_ODR( new naiji_T_ODR(m_med, m_conductor) );
			m_med.setINDATA( new INDATA(m_med, m_conductor) );
			m_med.setreadSysBusinessMessage( new readSysBusinessMessage(m_med, m_conductor) );
			m_med.setwriteErrWngLst( new writeErrWngLst(m_med, m_conductor) );
			m_med.setgetSEQ_ERR_WNG_LST( new getSEQ_ERR_WNG_LST(m_med, m_conductor) );
			m_med.settbl_M_CUST_BASE_check( new tbl_M_CUST_BASE_check(m_med, m_conductor) );
			m_med.setnaiji_T_ODR_hinban( new naiji_T_ODR_hinban(m_med, m_conductor) );
			m_med.setgetSYS_CLASS_CODE( new getSYS_CLASS_CODE(m_med, m_conductor) );
			m_med.setgetSYS_HOME_CUR( new getSYS_HOME_CUR(m_med, m_conductor) );
			m_med.setCtrlMain( new CtrlMain(m_med, m_conductor) );
			m_conductor.addObject( m_med.gettbl_T_ODR() );
			m_conductor.addObject( m_med.gettbl_T_ODR_CTL() );
			m_conductor.addObject( m_med.gettbl_T_ODR_ACPT_RSLT() );
			m_conductor.addObject( m_med.gettbl_T_ANS_DLV_DATE() );
			m_conductor.addObject( m_med.gettbl_T_ALLOC_FIXED_ODR_RSLT() );
			m_conductor.addObject( m_med.gettbl_M_CUST() );
			m_conductor.addObject( m_med.gettbl_M_CUR() );
			m_conductor.addObject( m_med.gettbl_M_CUST_BASE() );
			m_conductor.addObject( m_med.gettbl_M_ITEM() );
			m_conductor.addObject( m_med.gettbl_M_ITEM_SPEC() );
			m_conductor.addObject( m_med.gettbl_M_UNIT_COST() );
			m_conductor.addObject( m_med.getgetUserInfo() );
			m_conductor.addObject( m_med.getgetGyomuDate() );
			m_conductor.addObject( m_med.getgetSEQ_ODR() );
			m_conductor.addObject( m_med.getgetSEQ_ODR_CTL() );
			m_conductor.addObject( m_med.getgetSEQ_RSLT_ODR() );
			m_conductor.addObject( m_med.getgetCompanyInfo() );
			m_conductor.addObject( m_med.getnaiji_T_ODR() );
			m_conductor.addObject( m_med.getINDATA() );
			m_conductor.addObject( m_med.getreadSysBusinessMessage() );
			m_conductor.addObject( m_med.getwriteErrWngLst() );
			m_conductor.addObject( m_med.getgetSEQ_ERR_WNG_LST() );
			m_conductor.addObject( m_med.gettbl_M_CUST_BASE_check() );
			m_conductor.addObject( m_med.getnaiji_T_ODR_hinban() );
			m_conductor.addObject( m_med.getgetSYS_CLASS_CODE() );
			m_conductor.addObject( m_med.getgetSYS_HOME_CUR() );
			m_conductor.addObject( m_med.getCtrlMain() );

			// データ参照処理を追加します
			m_conductor.addInputEntity( m_med.getgetSYS_HOME_CUR() );

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
			BatchAppException be=new BatchAppException("cdrKQ0010B001", "beginProc", "conductorの初期処理に失敗しました");
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
	medKQ0010B001 m_med=new medKQ0010B001();

	// BatchAppConductorクラスインスタンス
	BatchAppConductor m_conductor=new BatchAppConductor("KQ0010B001");

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	//////////////////////////////

	/**
	 * ctrKQ0010B001クラス 標準コンストラクタ
	 *
		 */
	public cdrKQ0010B001() throws BatchAppException
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
