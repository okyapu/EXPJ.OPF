/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DC0010/src/com/nec/jp/orteus/metamorBase/DC0010/DC0010B001/CtrlMain.java,v $
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
 * 3.0.0.0 (2003/12/10),処理結果を利用可能にする修正
 * 2.0.0.0 (2002/05/27),new foundation対応
 *
 */

package com.nec.jp.orteus.metamorBase.DC0010.DC0010B001;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.ba.*;

import java.lang.Number.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;

//{{user_implement_dev:import
import com.nec.jp.orteus.expj.businesslock.BusinessLock;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.14 $ $Date: 2014/11/05 07:22:48 $
 */

//{{user_implement_dev:header
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediatorクラス インスタンス
	 */
	public medDC0010B001 m_med=null;

	/**
	 * controlクラス インスタンス
	 */
	protected interControl m_control=null;

	/**
	 * コンダクタクラスインスタンス
	 */
	protected BatchAppConductor m_conductor;

	/**
	 * ログ部品インスタンス
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	/**
	 * 処理結果ステータス
	 */
	public static int m_status = 0;
	public static int getExecuteStatus() { return m_status; }
	public static void setExecuteStatus(int status) { m_status = status; }

	//////////////////////////////

	/**
	 * CtrlMainクラスのコンストラクタ
	 *
		 */
	public CtrlMain(medDC0010B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// メンバ変数を初期化します
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
       
        //////////////////////////////
        // コードジェネレータは、以下のコードへの上書きを行いません
       
        /**
         * CtrlMainクラスの標準コンストラクタ
         *
         */
        public CtrlMain(medDC0010B001 med) throws BatchAppException {
         // メンバ変数を初期化します
         m_med = med;
         m_control = new interControl(med);
       
         // todo: インスタンス初期化時に実行する処理を記述してください
       
         return;
        }
       
        /**
         * インスタンス破壊時に行う処理
         *
         */
        public void finalize() {
         // 各メンバ変数の初期化
         m_med = null;
         m_control = null;
         objMessage = null;
       
         // todo: インスタンス消滅時に実行する処理を記述してください
       
         return;
        }
       
        //////////////////////////////
       
        /** ログレベル インフォメーション */
        private static final int INFOMATION = 0;
        /** ログレベル ワーニング */
        private static final int WORNING = 1;
        /** ログレベル エラー */
        private static final int ERROR = 2;
       
        /** DBコネクション */
        private IDbConnection conn = null;
       
        /** 業務メッセージログ用Numberingクラス */
        private Numbering numbering = null;
        /** 業務メッセージログ用BusinessMessageAccessorクラス */
        private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
        /** 業務メッセージログ用BusinessMessageクラス */
        private BusinessMessage businessMsg = new BusinessMessage();
       
        /** 業務ロッククラス */
        private BusinessLock lock = null;
       
        /** ロック失敗時ロックキー */
        private static final int LOCK_FAILD = -1;
       
        /** バッチパラメータ(共通1) バッチ処理区分 */
        private String _sysBatchType;
        /** バッチパラメータ(共通2)ユーザID */
        private String _sysUserCd;
        /** バッチパラメータ(共通3)工場コード */
        private String _sysPlantCd;
        /** バッチパラメータ(共通4)業務ID */
        private String _sysProgramId;
       
        /**
         * ログファイル出力
         * @param logLevel ログレベル
         * @param code メッセージコード
         * @param value 置換文字列
         */
        private void writeLogFiles(int logLevel, String code, String value) {
         ExpjMessage emsg;
         // 置換文字列判定
         if (!isNull(value)) {
          emsg = new ExpjMessage(code, value);
         } else {
          emsg = new ExpjMessage(code);
         }
       
         // ログレベルによってログタイプを分ける
         switch (logLevel) {
          case INFOMATION :
           m_med.getSyslog().info(emsg, m_med.getUsername());
           break;
          case WORNING :
           m_med.getSyslog().warning(emsg, m_med.getUsername());
           break;
          case ERROR :
           m_med.getSyslog().severe(emsg, m_med.getUsername());
           break;
         }
        }
       
        /**
         * ログファイル出力
         * @param logLevel ログレベル
         * @param code メッセージコード
         */
        private void writeLogFiles(int logLevel, String code) {
         writeLogFiles(logLevel, code, null);
        }
       
        /**
         * ログDB出力
         * @param code メッセージコード
         * @param value 置換文字列
         * @param dataStr データストリング
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLogDB(String code, String value, String dataStr)
         throws FoundationException, SQLException {
         if (numbering == null) {
          throw new NullPointerException();
         }
         businessMsg.setLogCode(numbering.getNo());
         businessMsg.setMessageCode(code);
         businessMsg.setData(dataStr);
         businessMsgAcc.add(businessMsg);
        }
       
        /**
         * ログDB出力
         * @param code メッセージコード
         * @param dataStr データストリング
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLogDB(String code, String dataStr) throws FoundationException, SQLException {
         writeLogDB(code, null, dataStr);
        }
       
        /**
         * ログファイル、ログDB出力を行います。
         * @param logLevel ログレベル
         * @param code メッセージコード
         * @param value 置換文字列
         * @param dataStr データストリング
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLog(int logLevel, String code, String value, String dataStr)
         throws FoundationException, SQLException {
         writeLogFiles(logLevel, code, value);
         if (!isNull(dataStr)) {
          writeLogFiles(logLevel, "ZZ01006", dataStr);
         }
         writeLogDB(code, value, dataStr);
        }
       
        /**
         * ログファイル、ログDB出力を行います。
         * @param logLevel ログレベル
         * @param code メッセージコード
         * @param dataStr データストリング
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLog(int logLevel, String code, String dataStr)
         throws FoundationException, SQLException {
         writeLog(logLevel, code, null, dataStr);
        }
       
        /**
         * ログファイル、ログDB出力を行います。
         * @param logLevel ログレベル
         * @param code メッセージコード
         * @throws FoundationException
         * @throws SQLException
         */
        private void writeLog(int logLevel, String code) throws FoundationException, SQLException {
         writeLog(logLevel, code, null, null);
        }
       
        /**
         * 業務ロックを行います
         * @return ロックキャンセルキー
         * @throws FoundationException
         */
        private int businessLock() throws FoundationException {
         lock = new BusinessLock(conn, _sysUserCd, _plantCd);
         System.out.println("_sysUserCd:"+_sysUserCd);
         System.out.println("_plantCd:"+_plantCd);

         // 解除キーの取得
         int lockCancelKey = lock.doLock(m_med.getProgname());
         System.out.println("m_med.getProgname():"+m_med.getProgname());
         
         if (lock.getLockingInfo()!=null){
        	 String info[] = (String [])lock.getLockingInfo().get(0);
        	 System.out.println("lock.getLockingInfo(0):"+info[0]);
        	 System.out.println("lock.getLockingInfo(1):"+info[1]);
        	 System.out.println("lock.getLockingInfo(2):"+info[2]);
        	 System.out.println("lock.getLockingInfo(3):"+info[3]);
        	 
         }
         System.out.println("lockCancelKey:"+lockCancelKey);
         conn.commit();
         return lockCancelKey;
        }
       
        /**
         * 業務ロックを解除します
         * @param lockCancelKey ロックキャンセルキー
         * @return ロック解除成功時true、失敗時false
         * @throws FoundationException
         */
        private boolean businessUnLock(int lockCancelKey) throws FoundationException {
       
         if (lockCancelKey == LOCK_FAILD) {
          return true;
         }
         boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
         conn.commit();
         return result;
        }
       
        /**
         * バッチパラメータ（共通）を設定します。
         * @return 設定に成功した場合は true 、失敗した場合は false を返します。
         * @throws BatchAppException
         */
        private boolean setCommonParams() throws BatchAppException {
         String[] args = m_med.getArgs();
       
         // バッチパラメータの形式が不正な場合
         if (args.length != 9) {
          writeLogFiles(ERROR, "ZZ09022");
          return false;
         }

         _sysBatchType = args[0];
         _sysUserCd = args[1];
         _sysPlantCd = args[2];
         _sysProgramId = args[3];
       
         return true;
        }
       
        /**
         * バッチパラメータ（共通）のチェックを行います。
         * @return 正常の場合true、不正の場合false
         * @throws BatchAppException
         */
        private boolean checkCommonParams() throws BatchAppException {
         // バッチ処理区分がNullの場合
         if (isNull(_sysBatchType)) {
          writeLogFiles(ERROR, "ZZ09023");
          return false;
         }
       
         // バッチ処理区分が１、２以外の場合
         if ((!_sysBatchType.equals("1") && !_sysBatchType.equals("2"))) {
          writeLogFiles(ERROR, "ZZ09024");
          return false;
         }
       
         // ユーザーコードがNullの場合
         if (isNull(_sysUserCd)) {
          writeLogFiles(ERROR, "ZZ09025");
          return false;
         }
       
         // [ユーザマスタ]に存在しない場合
         if (!isExsistsUserMst(_sysUserCd)) {
          writeLogFiles(ERROR, "ZZ09026");
          return false;
         }
       
         // 工場コードがNullの場合
         if (isNull(_sysPlantCd)) {
          writeLogFiles(ERROR, "ZZ09027");
          return false;
         }
         // [工場]に存在しない場合
         if (!isExistsMPlant(_sysPlantCd)) {
          writeLogFiles(ERROR, "ZZ09028");
          return false;
         }
       
         // 業務IDがNullの場合
         if (isNull(_sysProgramId)) {
          writeLogFiles(ERROR, "ZZ09029");
          return false;
         }
       
         return true;
        }
       
        /**
         * 対象の文字列がNull（空文字あるいはNull）であるかを判定します。
         * @param str 対象文字列
         * @return Nullの場合はtrue、Nullではない場合はfalse
         */
        private boolean isNull(String str) {
         if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
          return true;
         }
         return false;
        }
       
        /**
         * [ユーザマスタ]に存在するかを判定します 。
         * @return [ユーザマスタ]に存在する場合はtrue、存在しない場合はfalse
         */
        private boolean isExsistsUserMst(String userCd) throws BatchAppException {
         m_med.setUSER_CD(userCd);
         m_med.getUSER_MST().read();
         return m_med.getUSER_MST().hasRecord(false);
        }
       
        /**
         * [工場]に存在するかを判定します 。
         * @param plantCd 工場コード
         * @return [工場]に存在する場合はtrue、存在しない場合はfalse
         */
        private boolean isExistsMPlant(String plantCd) throws BatchAppException {
         m_med.setPLANT_CD(plantCd);
         m_med.getM_PLANT().read();
         return m_med.getM_PLANT().hasRecord(false);
        }
       
        // ↓業務ロジック
        /** バッチパラメータ(5)工場コード */
        private String _plantCd;
        /** バッチパラメータ(6)年度 */
        private String _year;
        /** バッチパラメータ(7)半期区分 */
        private String _halfTermTyp;
        /** バッチパラメータ(8)原価種別 */
        private String _costTyp;
        /** バッチパラメータ(9)実行区分 */
        private String _executeTyp;
       
        /** PL/SQL 標準原価構成品ワーク作成処理 を表す定数 */
        static final int SQLSTDITEMPSWORKENTRY = 2;
        /** PL/SQL 標準材料費・加工費計算処理 を表す定数 */
        static final int SQLSTDMATRPROCCOST = 3;
        /** PL/SQL 品目別標準原価積上処理 を表す定数 */
        static final int SQLSTDITEMCOSTACCOUNT = 4;
        /** PL/SQL 在庫評価金額作成処理 を表す定数 */
        static final int SQLSTOCKVALUPDATE = 6;
       
        /**
         * バッチパラメータ（業務固有）の設定を行います。
         * @return 正常の場合true、不正の場合false
         * @throws BatchAppException
         * @throws FoundationException
         * @throws SQLException
         */
        private boolean setParams() throws BatchAppException {
         String[] args = m_med.getArgs();
       
         if (!isNull(args[4])) {
          _plantCd = args[4];
         } else {
          _plantCd = _sysPlantCd;
         }
       
         // DBから、[原価管理パラメータ]を検索
         m_med.setPLANT_CD(_plantCd);
         m_med.getSYS_COST_CTRL().read();
         m_med.getSYS_COST_CTRL().next();
       
         if (!isNull(args[5]) || isNumber(args[5])) {
          _year = args[5];
         } else {
          _year = m_med.getCURRENT_YEAR();
         }
       
         if (!isNull(args[6]) || isNumber(args[6])) {
          _halfTermTyp = args[6];
         } else {
          _halfTermTyp = m_med.getHALF_TERM_TYP();
         }
       
         if (!isNull(args[7]) || isNumber(args[7])) {
          _costTyp = args[7];
         } else {
          _costTyp = "1";
         }
       
         if (!isNull(args[8]) || isNumber(args[8])) {
          _executeTyp = args[8];
         } else {
          _executeTyp = "1";
         }
       
         return true;
        }
       
        /**
         * バッチパラメータ（業務固有）のチェックを行います。
         * @return 正常の場合true、不正の場合false
         * @throws BatchAppException
         * @throws FoundationException
         * @throws SQLException
         */
        private boolean checkParams() throws BatchAppException {
         // 処理対象工場コードが[工場]に存在しない場合
         if (!isExistsMPlant(_plantCd)) {
          writeLogFiles(ERROR, "DC00002");
          return false;
         }
         // 処理対象工場コードが[原価管理パラメータ]に存在しない場合
         if (!isExistsSysCostCtrl(_plantCd)) {
          writeLogFiles(ERROR, "DC00003");
          return false;
         }
         // 年度が数値以外の場合
         if (!isNumber(_year)) {
          writeLogFiles(ERROR, "DC00004");
          return false;
         }
         // 半期区分が数値以外または1or2以外の場合
         if (!isNumber(_halfTermTyp) || (!"1".equals(_halfTermTyp) && !"2".equals(_halfTermTyp))) {
          writeLogFiles(ERROR, "DC00005");
          return false;
         }
         // 原価種別が数値以外または1以外の場合
         if (!isNumber(_costTyp) || !"1".equals(_costTyp)) {
          writeLogFiles(ERROR, "DC00006");
          return false;
         }
         // 実行区分が数値以外または1or2以外の場合
         if (!isNumber(_executeTyp) || (!"1".equals(_executeTyp) && !"2".equals(_executeTyp))) {
          writeLogFiles(ERROR, "DC00007");
          return false;
         }
       
         return true;
        }
       
        /**
         * [原価管理パラメータ]に存在するかを判定します 。
         * @param plantCd 工場コード
         * @return [原価管理パラメータ]に存在する場合はtrue、存在しない場合はfalse
         */
        private boolean isExistsSysCostCtrl(String plantCd) throws BatchAppException {
         m_med.setPLANT_CD(plantCd);
         m_med.getSYS_COST_CTRL().read();
         return m_med.getSYS_COST_CTRL().hasRecord(false);
        }
       
        /**
         * 対象文字列が数値文字列であるか判定します。
         * @param arg 対象文字列
         * @return 数値文字列の場合true、それ以外の場合false
         */
        private boolean isNumber(String arg) {
         try {
          Integer num = new Integer(arg);
       
          if (num.compareTo(new Integer("0")) <= 0) {
           return false;
          }
       
         } catch (NumberFormatException e) {
          return false;
         }
         return true;
        }
        // ↑業務ロジック
       
        /**
         * main： ユーザ定義用メソッドです<br>
         * <<説明を記述してください>>
         *
         * @return <<説明を記述してください>>
         * @exception <<説明を記述してください>>
         */
        public int main() throws BatchAppException {
       
         // ロック解除キー
         int lockCancelKey = LOCK_FAILD;
       
         // パラメータ取得
         String args[] = m_med.getArgs();
       
         // バッチパラメータ出力
         System.out.println("-------------------------------------------------");
         System.out.println("execute " + m_med.getProgname());
         for (int i = 0; i < args.length; i++) {
          System.out.println("args[" + i + "]:" + args[i]);
         }
       
         // DB接続取得処理
         conn = m_conductor.m_transactionConn;
         //SYSLOG英語化用
         if(args.length >= 2){
         	m_med.setUsername(args[1]);
         }
         // バッチパラメータ（共通）をパラメータ変数に設定
         if (!setCommonParams()) {
          writeLogFiles(ERROR, "ZZ09009");
          return BREAK;
         }
         // バッチパラメータ（共通）チェック
         if (!checkCommonParams()) {
          writeLogFiles(ERROR, "ZZ09009");
          return BREAK;
         }
       
         // ↓業務ロジック
         // バッチパラメータ（業務固有）をパラメータ変数に設定
         if (!setParams()) {
          writeLogFiles(ERROR, "ZZ09009");
          return BREAK;
         }
         // バッチパラメータ（業務固有）チェック
         if (!checkParams()) {
          writeLogFiles(ERROR, "ZZ09009");
          return BREAK;
         }
         // ↑業務ロジック
         // トランザクションの開始
         //conn.beginTrans();
         try {
         conn.beginTransWeb();
         }catch(Exception e){
        	 e.printStackTrace();
         }
         try {
          // DBメッセージ更新準備
          IDbConnection conn_msg = m_conductor.m_defaultConn;
          numbering =
           new Numbering(conn_msg, Numbering.LOG_CD, _sysUserCd, _sysProgramId, _plantCd);
          businessMsgAcc.init(conn_msg);
          businessMsg.setBusinessOperatingName(_sysProgramId);
          businessMsg.setUser(_sysUserCd);
          businessMsg.setPlantCode(_plantCd);
       
       
          // 開始メッセージ
          writeLog(INFOMATION, "ZZ09001");
       
          // ↓業務ロジック
          // [原価計算処理制御]を開始状態として登録or更新
          // パラメータ設定
          m_med.setPLANT_CD(_plantCd);
          m_med.setYEAR(_year);
          m_med.setHALF_TERM_TYP(_halfTermTyp);
          m_med.setCOST_TYP(_costTyp);
          m_med.setBATCH_TYP(_sysBatchType);
          m_med.setEXECUTE_TYP(_executeTyp);
          m_med.setRESULT_STATUS_TYP("1");
          
          // 業務ロック
          System.out.println("(SBM0987)業務ロック0:"+lockCancelKey);
          lockCancelKey = businessLock();
          System.out.println("(SBM0988)業務ロック1:"+lockCancelKey);
          if (lockCancelKey == LOCK_FAILD) {
        	  System.out.println("(SBM0989)業務ロックerr!");
           writeLog(ERROR, "ZZ01008");
           return BREAK;
          }   
          
          // 存在チェックを行い登録・更新を振り分け
          m_med.getSYS_CS_CALC_CTRL().read();
          if (m_med.getSYS_CS_CALC_CTRL().next()) {
           m_med.getSYS_CS_CALC_CTRL_Start().update();
          } else {
           m_med.getSYS_CS_CALC_CTRL_Start().create();
          }
          conn.commit();
       
          // バッチパラメータ｢実行区分｣=1の場合[構成品ワーク]を削除する
          if ("1".equals(_executeTyp)) {
           m_med.setPLANT_CD(_plantCd);
           m_med.getT_CS_PS_T().delete();
           conn.commit();
          }
       
          // PL/SQLの実行結果
          String result;
       
          // 標準原価構成品ワーク作成処理
          result = executeProcedure(SQLSTDITEMPSWORKENTRY);
          System.out.println("result:" + result);
          if ("3".equals(result)) {
           // [原価計算処理制御]を終了状態として更新
           m_med.getSYS_CS_CALC_CTRL_Stop().update();
           return BREAK;
          }
       
          // 標準原価材料費・加工費計算処理
          result = executeProcedure(SQLSTDMATRPROCCOST);
          System.out.println("result:" + result);
          if ("3".equals(result)) {
           // [原価計算処理制御]を終了状態として更新
           m_med.getSYS_CS_CALC_CTRL_Stop().update();
           return BREAK;
          }
       
          // 品目別標準原価積上計算処理
          result = executeProcedure(SQLSTDITEMCOSTACCOUNT);
          System.out.println("result:" + result);
          if ("3".equals(result)) {
           // [原価計算処理制御]を終了状態として更新
           m_med.getSYS_CS_CALC_CTRL_Stop().update();
           return BREAK;
          }
       
          // 在庫評価金額作成処理
          result = executeProcedure(SQLSTOCKVALUPDATE);
          System.out.println("result:" + result);
          if ("3".equals(result)) {
           // [原価計算処理制御]を終了状態として更新
           m_med.getSYS_CS_CALC_CTRL_Stop().update();
           return BREAK;
          }

          // [原価計算処理制御]を終了状態として更新
          m_med.getSYS_CS_CALC_CTRL_Stop().update();
       
          // ↑業務ロジック
       
          // コミット
          conn.commit();
         } catch (SQLException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (FoundationException e) {
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } catch (Exception e) {
          // ここでExceptionをキャッチしてはいけないのですが、mainメソッドを
          // 呼び出しているexecuteメソッドがStackTraceを行わないためキャッチしています。
          e.printStackTrace();
          throw new BatchAppException("CtrlMain", "main", e.getMessage());
         } finally {        	
        try { 
        	System.out.println("Ends By finally");
        	m_med.getSYS_CS_CALC_CTRL_Stop().update();
        	conn.commit();
        	System.out.println("SYS_CS_CALC_CTRL_Stop().update()");
       
           // 業務ロック解除
           if (!businessUnLock(lockCancelKey)) {
            writeLog(ERROR, "ZZ01004");
           }
       
           // 終了ログ
           writeLog(INFOMATION, "ZZ09002");
          } catch (Exception e) {
           e.printStackTrace();
           throw new BatchAppException("CtrlMain", "main", e.getMessage());
          }
         }
         return BREAK;
        }
       
        /**
         * 
         * @param csCalcProcNo
         * @return
         * @throws Exception
         */
        private String executeProcedure(int csCalcProcNo)
         throws BatchAppException, FoundationException {
         // [バッチパラメータ]の検索
         m_med.setPROGRAM_CD(m_med.getProgname());
         if (csCalcProcNo == SQLSTDITEMPSWORKENTRY) {
          m_med.setFUNCTION_NAME("SQLSTDITEMPSWORKENTRY");
         } else if (csCalcProcNo == SQLSTDMATRPROCCOST) {
          m_med.setFUNCTION_NAME("SQLSTDMATRPROCCOST");
         } else if (csCalcProcNo == SQLSTDITEMCOSTACCOUNT) {
          m_med.setFUNCTION_NAME("SQLSTDITEMCOSTACCOUNT");
         } else if (csCalcProcNo == SQLSTOCKVALUPDATE) {
          m_med.setFUNCTION_NAME("SQLSTOCKVALUPDATE");
         }
       
         int nret = m_med.getSYS_BAT_PARM().read();
         if (!m_med.getSYS_BAT_PARM().next()) {
          ExpjMessage emsg = new ExpjMessage("ZZ09030");
          throw new BatchAppException("CtrlMain", "excuteProcedure", emsg.getMessage(CoreTools.getLocale(_sysUserCd)));
         }
       
         // 戻り値表示
         System.out.println("nret:" + nret);
         System.out.println("--------------------------------------");
         System.out.println("PROGRAM_CD:" + m_med.getPROGRAM_CD());
         System.out.println("FUNCTION_NAME:" + m_med.getFUNCTION_NAME());
         System.out.println("LOG_MODE_TYP:" + m_med.getLOG_MODE_TYP());
         System.out.println("OUTPUT_MODE_TYP:" + m_med.getOUTPUT_MODE_TYP());
         System.out.println("FILE_PATH:" + m_med.getFILE_PATH());
         System.out.println("FILE_NAME:" + m_med.getFILE_NAME());
         System.out.println("BUSINESS_GROUP_CD:" + m_med.getBUSINESS_GROUP_CD());
         System.out.println("BUSINESS_CD:" + m_med.getBUSINESS_CD());
       
         // [原価計算処理制御]を現在の実行状態で更新（PL/SQL実行直前）
         m_med.setCS_CALC_PROC_NO(Integer.toString(csCalcProcNo));
         m_med.getSYS_CS_CALC_CTRL_Active().update();
         conn.commit();
       
         // PL/SQLの実行
         m_med.setpvc2LogMode(m_med.getLOG_MODE_TYP().toString());
         m_med.setpvc2OutputMode(m_med.getOUTPUT_MODE_TYP().toString());
         m_med.setpvc2OutputPath(m_med.getFILE_PATH());
         m_med.setpvc2OutputName(m_med.getFILE_NAME());
         m_med.setpvc2UserId(_sysUserCd);
         m_med.setpvc2BusinessName(_sysProgramId);
         m_med.setpvc2PlantCd(_plantCd);
         m_med.setpnumYear(_year);
         m_med.setpnumHalfTermTyp(_halfTermTyp);
         m_med.setpnumCostTyp(_costTyp);
         m_med.setpnumActTyp(_executeTyp);
       
         System.out.println("--------------------------------------");
         System.out.println("pvc2LogMode:" + m_med.getpvc2LogMode());
         System.out.println("pvc2OutputMode:" + m_med.getpvc2OutputMode());
         System.out.println("pvc2OutputPath:" + m_med.getpvc2OutputPath());
         System.out.println("pvc2OutputName:" + m_med.getpvc2OutputName());
         System.out.println("pvc2UserId:" + m_med.getpvc2UserId());
         System.out.println("pvc2BusinessName:" + m_med.getpvc2BusinessName());
         System.out.println("pvc2PlantCd:" + m_med.getpvc2PlantCd());
         System.out.println("pnumYear:" + m_med.getpnumYear());
         System.out.println("pnumHalfTermTyp:" + m_med.getpnumHalfTermTyp());
         System.out.println("pnumCostTyp:" + m_med.getpnumCostTyp());
         System.out.println("pnumActTyp:" + m_med.getpnumActTyp());
       
         List callList = null;
         if (csCalcProcNo == SQLSTDITEMPSWORKENTRY) {
          callList = m_med.getSQLSTDITEMPSWORKENTRY().call();
         } else if (csCalcProcNo == SQLSTDMATRPROCCOST) {
          callList = m_med.getSQLSTDMATRPROCCOST().call();
         } else if (csCalcProcNo == SQLSTDITEMCOSTACCOUNT) {
          callList = m_med.getSQLSTDITEMCOSTACCOUNT().call();
         } else if (csCalcProcNo == SQLSTOCKVALUPDATE) {
          callList = m_med.getSQLSTOCKVALUPDATE().call();
         }
       
         // PL/SQLの実行結果を取得
         medDC0010B001 resultMed = (medDC0010B001) callList.get(0);
         String result = resultMed.getpnumReturn();
       
         // [原価計算処理制御]を現在の実行状態で更新（PL/SQL実行直後）
         if (Integer.valueOf(result).intValue()
          > Integer.valueOf(m_med.getRESULT_STATUS_TYP()).intValue()) {
          m_med.setRESULT_STATUS_TYP(result);
         }
         m_med.setCS_CALC_PROC_NO(Integer.toString(csCalcProcNo));
         m_med.getSYS_CS_CALC_CTRL_Active().update();
         conn.commit();
       
         return result;
        }
       
        //////////////////////////////
       
        /**
         * object型を返します
         *
         * @return object型
         */
        public int getType() {
         return m_control.getType();
        }
       
        /**
         * 初期処理
         *
         * @return <<コメントを記述してください>>
         * @exception <<コメントを記述してください>>
         */
        public int beginProc() throws BatchAppException {
       
         // todo: ここにユーザ定義コードを記述してください
       
         return m_control.beginProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int endProc() throws BatchAppException {
       
         // todo: ここにユーザ定義コードを記述してください
       
         return m_control.endProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int execute() throws BatchAppException {
       
         // todo: ここにユーザ定義コードを記述してください
       
         // 処理結果をリターン値としたいときはここで設定します。
         // setExecuteStatus(0);
       
         return m_control.execute();
        }
       
        //}}user_implement_code

	//{{control_class(wizard code)

	//////////////////////////////

	class interControl
		implements IBatchAppCommon
	{

		//////////////////////////////

		/**
		 * mediatorクラス インスタンス
		 */
		public medDC0010B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medDC0010B001 med) throws BatchAppException
		{
			// 各メンバ変数の初期化
			m_med = med;

			try {
				m_container = new ManageContainer();
			} catch(FoundationException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "constractor", "DBへの接続に失敗しました");
			}
			return;
		}

		protected void finalize()
		{
			m_med = null;
			return;
		}

		//////////////////////////////



		//////////////////////////////

		public int getType()
		{
			return TYPE_CONTROL;
		}

		public int beginProc() throws BatchAppException
		{
			return IBatchAppCommon.SUCCESS;
		}

		public int endProc() throws BatchAppException
		{
			int ret;

			return IBatchAppCommon.SUCCESS;
		}

		public int execute() throws BatchAppException
		{
			int ret;

			try {
				if((ret=main())!=IBatchAppCommon.SUCCESS ) return ret;
			} catch(Exception ex) {
				throw new BatchAppException("CtrlMain", "execute", "executeの処理に失敗しました");
			}

			return IBatchAppCommon.SUCCESS;
		}

		public void commit() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().commit();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "commit", "DBへのコミット時に失敗しました(SQLException)");
			}

			return;
		}

		public void rollback() throws BatchAppException
		{
			try {
				m_conductor.m_transactionConn.getConn().rollback();
				m_conductor.m_transactionConn.getConn().setAutoCommit(false);
			} catch(SQLException e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "rollback", "DBへのロールバック時に失敗しました(SQLException)");
			}

			return;
		}

		//////////////////////////////

	}

	//}}control_class(wizard code)

}
