/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0020/src/com/nec/jp/orteus/metamorBase/KV0020/KV0020B002/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0020.KV0020B002;

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
//-----------------------------------------------------------------------------
import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
// import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
// import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
//import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
//-----------------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.11 $ $Date: 2015/12/03 08:55:49 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2003/11/29),新規作成
 *         [ : <バージョン> (<日付>),<内容> ]
 *                        ・ ・ ・
 */
//}}user_implement_dev:header

public class CtrlMain extends Object
		implements IBatchAppCommon
{

	//////////////////////////////

	/**
	 * mediatorクラス インスタンス
	 */
	public medKV0020B002 m_med=null;

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
	public CtrlMain(medKV0020B002 med, BatchAppConductor cdr) throws BatchAppException
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
       //-----------------------------------------------------------------------------
        /** 注文区分値 */
       //	private final static String ODR_TYP_MIKOMI = "1";
        private final static String ODR_TYP_NAIJI = "2";
        private final static String ODR_TYP_KAKUTEI = "3";
       
        /** システム処理区分 */
        private final static String	SYS_PROC_TYP_MI = "0";
        private final static String	SYS_PROC_TYP_SUMI = "1";
        private final static String	SYS_PROC_TYP_NG = "2";
        private final static String	SYS_PROC_TYP_ETC = "9";
       
        /** EDI 情報区分コード */
        private final static String INFO_TYP_0201  = "0201";	//所要計画情報
        private final static String INFO_TYP_0203  = "0203";	//予約注文情報
        private final static String INFO_TYP_0501  = "0501";	//内示注文情報
        private final static String INFO_TYP_0502  = "0502";	//確定注文情報
        private final static String INFO_TYP_0503  = "0503";	//変更注文情報
        private final static String INFO_TYP_0504  = "0504";	//注文取消情報
       
        /** システムパラメータ読み出しキー */
        private final static String	SYSCLASS_UNIT_CD = "EIAJ_UNIT_CD";
        private final static String	SYSCLASS_CUR_CD = "EIAJ_CUR_CD";
        private final static String	SYSCLASS_CORP_CD = "UNIFIED_CORP_CD";
       //	private final static String	SYSCLASS_MATSUSHITA = "MATSUSHITA";
       
        /** 起動引数 */
        private String strBusinessName = null;
        private String strUserId = null;
        private String strPlantCd = null;
        private String strMsgPlantCd = null;
       
        /** DBコネクション */
           private IDbConnection conn = null;
       
        private String m_vMSG = "";				//ログファイル用メッセージ
       
        /**
         * ローグファイルのメッセージの取得
         *
         * @param String strMsgCd		キー:SYSコントロールコード
         *
         */
        private boolean getSysMsg(String strMsgCd) throws BatchAppException{
         boolean rv = true;
         try{
          //キー設定
       
          m_med.setsysBusinessIN_MEG_CD(strMsgCd);
       
          if(m_med.getreadSysBusinessMessage().read() != SUCCESS){
           rv = false;
          }else{
           if(m_med.getreadSysBusinessMessage().next()){
            this.m_vMSG = m_med.getsysBusinessMEG();
           }else{
            throw new Exception();
           }
          }
         }catch (Exception e) {
          rv=false;
         }finally{
          return rv;
         }
        }
        /**
         * エラー/警告メッセージログ出力処理(埋め込みなし)
         *
         * @param String メッセージコード
         */
        private void writeLogMessage(String msgCd) throws Exception,BatchAppException
        {
         ExpjMessage am = new ExpjMessage(msgCd);
         CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
       
        }
        /**
         * エラー/警告メッセージログ出力処理(IF情報管理番号埋め込み)
         *
         * @param String メッセージコード
         * @param String IF情報管理番号
         */
        private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException
        {
         AlarmMessage am = new AlarmMessage(msgCd,if_no);
         CoreTools.write(am.getMessage());
       
        }
        /**
         * エラー/警告メッセージログ出力補助情報(埋め込み)
         *
         * @param String 補助情報名
         * @param String 補助情報値
         */
        private void writeLogMessageInfo(String name,String value) throws Exception,BatchAppException
        {
         AlarmMessage am = new AlarmMessage("AA99991","    " + name,value);
         CoreTools.write(am.getMessage());
       
        }
       //-----------------------------------------------------------------------------
       
        /**
         * CtrlMainクラスの標準コンストラクタ
         *
         * @return なし
         */
        public CtrlMain(medKV0020B002 med) throws BatchAppException
        {
         // メンバ変数を初期化します
         m_med = med;
         m_control = new interControl(med);
       
         // todo: インスタンス初期化時に実行する処理を記述してください
       
         return;
        }
       
        /**
         * インスタンス破壊時に行う処理
         *
         * @param なし
         */
        public void finalize()
        {
         // 各メンバ変数の初期化
         m_med = null;
         m_control = null;
         objMessage = null;
       
         // todo: インスタンス消滅時に実行する処理を記述してください
       
         return;
        }
       
        //////////////////////////////
       
        /**
         * main： ユーザ定義用メソッドです<br>
         * <<説明を記述してください>>
         *
         * @return <<説明を記述してください>>
         * @exception <<説明を記述してください>>
         */
        public int main() throws BatchAppException
        {
       //-----------------------------------------------------------------------------
       
         // デフォルトアクセサメソッド
              // 初期化
               int rec = 0;
               
         BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
         BusinessMessage businessMsg = new BusinessMessage();
       
         Numbering logCd = null;		//ログ識別コード採番の準備
         
         // 業務ロック
         int lockCancelKey = -1;		//ロックキャンセルキーの準備
         BusinessLock lock = null;	//ロック準備
       
         // 引数受け取り
         String args[] = m_med.getArgs();
       
         strBusinessName = args[0];
         strUserId = args[1];;
         strPlantCd = args[2];
         strMsgPlantCd = args[2];
       
         // パラメータ確認
       
       
       
         try{
          conn = m_conductor.m_transactionConn;
          //バッチ開始メッセージ登録
          try {
          	
            // コネクションを渡して、業務メッセージ準備
            businessMsgAcc.init(conn);
            businessMsg.setBusinessOperatingName(strBusinessName);
            businessMsg.setUser(strUserId);
            businessMsg.setPlantCode(strMsgPlantCd);
          	
            // コネクションを渡して、採番の準備
            logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
            businessMsg.setLogCode(logCd.getNo());
          	
			// 業務ロック実行
			lock = new BusinessLock(conn, strUserId,strPlantCd);
			lockCancelKey = lock.doLock(m_med.getProgname());
			if ( lockCancelKey == -1) {
				// 業務メッセージ追加
				String strMsgCd = "ZZ01001";
				businessMsg.setMessageCode(strMsgCd);
				businessMsgAcc.add(businessMsg);
				
				return BREAK;
			}
          	
			// 業務メッセージ追加
			String strMsgCd = "KV02201";
			String strDataString = "(SBM0610)<< 注文IF(EDI)変換バッチ処理開始 >>";
			//kis businessMsg.setLogCode("a" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
			businessMsg.setMessageCode(strMsgCd);
			businessMsg.setData(strDataString);
			businessMsgAcc.add(businessMsg);
			if(this.getSysMsg(strMsgCd)){
				CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
			}else{
				throw new Exception();
			}
			conn.commit();
          }catch(Exception e) {
           e.printStackTrace();
           throw new Exception();
          }
          try{
           CoreTools.write("\n(SBM1246)******>>>> 注文IF(EDI)変換対象データ取得スタート <<<******");
       //●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
       //-----------------------------------------------------------------------------
       //		注文IF(EDI)変換処理（ここから）
       //-----------------------------------------------------------------------------
       
           m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
           m_med.setUsername(strUserId);
           //=======================================
           // バッチ用工場コード
           //=======================================
           if(m_med.getSYS_CLASS_CODE().read() != SUCCESS){
            throw new Exception();
           }else if(m_med.getSYS_CLASS_CODE().next() == false){
            //バッチ用工場コード取得失敗
            this.writeLogMessage("KQ00153");
            throw new Exception();
           }
           CoreTools.write("BATCH PLANT_CD=" + m_med.getbtPLANT_CD());
           
           //=======================================
           // 業務日付取得
           //=======================================
           if(m_med.getBatchGyomuDate().read() != SUCCESS){
            throw new Exception();
           }else if(m_med.getBatchGyomuDate().next() == false){
            //業務日付取得失敗
            this.writeLogMessage("KV02204");
            throw new Exception();
           }
           CoreTools.write("BUSINESS_OPR_DATE=" + m_med.getbtBUSINESS_OPR_DATE());
       
           //=======================================
           // 日本円通貨コード取得
           //=======================================
           if(m_med.getJpCurrency().read() != SUCCESS){
            throw new Exception();
           }else if(m_med.getJpCurrency().next() == false){
            //通貨コード取得失敗
            this.writeLogMessage("KV02208");
            throw new Exception();
           }
           CoreTools.write("JP_CUR=" + m_med.getstrJP_CUR());
           
           //=======================================
           // 対象データの取得
           //=======================================
           if(m_med.getT_ODR_INFO_EDI_IF().read() != SUCCESS){
            throw new Exception();
           }
           for(rec=0; m_med.getT_ODR_INFO_EDI_IF().next(); rec++ ){
            try{
             CoreTools.write("----------------------------------------");
             this.writeLogMessageInfo("ODR_INFO_IF_CTRL_NO",String.valueOf(m_med.getEdiODR_INFO_IF_CTRL_NO().intValue()));
             //=======================================
             // 注文I/F（EDI)のシステム処理区分を異常に設定
             //=======================================
             m_med.setEdiSYSTEM_PROC_TYP(SYS_PROC_TYP_NG);
             int rv = m_med.getT_ODR_INFO_EDI_IF().update();
             conn.commit();
       
             //========================================
             // 得意先情報の取得
             //========================================
             m_med.setcustCUST_CD(null);
             m_med.setcustCUR_CD(null);
             m_med.setcustEDI_CUST_VEND_CD(m_med.getEdiCLIENT_CD());
             if(m_med.getM_CUST().read() != SUCCESS){
              throw new Exception();
             }else {
              if(m_med.getM_CUST().next() == false){
               //得意先情報取得失敗(メッセージのみ）
               this.writeLogMessage("KV02205");
               this.writeLogMessageInfo("CLIENT_CD",m_med.getEdiCLIENT_CD());
              }
              if(m_med.getM_CUST().next() == true){
               //複数件あった場合もエラー(メッセージのみ）
               this.writeLogMessage("KV02205");
               this.writeLogMessageInfo("CLIENT_CD",m_med.getEdiCLIENT_CD());
               m_med.setcustCUST_CD(null);
               m_med.setcustCUR_CD(null);
              }
             }
             if (m_med.getcustCUR_CD() == null) {
              m_med.setcustCUR_CD(m_med.getstrJP_CUR());
             }
       
             //========================================
             // 検査区分のチェック
             //========================================
             if ( m_med.getEdiINSPC_TYP() == null ||
            	  m_med.getEdiINSPC_TYP().length() > 2 || 
            	  !Calculate.isInteger(m_med.getEdiINSPC_TYP())){
            	 //検査区分不正値(メッセージのみ）
                 this.writeLogMessage("KV22077");
                 this.writeLogMessageInfo("INSPC_TYP",m_med.getEdiINSPC_TYP());         	 
            	 m_med.setEdiINSPC_TYP(null);
             }             
             
             //========================================
             // 受注情報共通IF編集出力
             //========================================
             //注文情報共通I/F管理番号　←　注文情報I/F管理番号
             m_med.setODR_INFO_COM_IF_CTRL_NO(m_med.getEdiODR_INFO_IF_CTRL_NO());
             //注文処理順
             m_med.setODR_ACPT_PROC_ODR(null);					
             //注文区分
             if(this.INFO_TYP_0201.equals(m_med.getEdiINFO_TYP_CD()) ||
              this.INFO_TYP_0203.equals(m_med.getEdiINFO_TYP_CD()) || 
              this.INFO_TYP_0501.equals(m_med.getEdiINFO_TYP_CD())){
              //内示
              m_med.setODR_TYP(this.ODR_TYP_NAIJI);
             }else if(this.INFO_TYP_0502.equals(m_med.getEdiINFO_TYP_CD())){
              //確定
              m_med.setODR_TYP(this.ODR_TYP_KAKUTEI);
             }else{
              //上記以外
              m_med.setODR_TYP("0");
             }
             //情報区分コード
             m_med.setINFO_TYP_CD(m_med.getEdiINFO_TYP_CD());
             //得意先注文番号
             if(this.INFO_TYP_0201.equals(m_med.getEdiINFO_TYP_CD()) ||
              this.INFO_TYP_0203.equals(m_med.getEdiINFO_TYP_CD())) {
              //sww削除20040727開始
              //|| this.INFO_TYP_0501.equals(m_med.getEdiINFO_TYP_CD())){
              //sww削除20040727終了
              m_med.setCUST_ODR_NO(m_med.getEdiUNCONFIRM_ODR_CD());
             } else {
              m_med.setCUST_ODR_NO(m_med.getEdiPUCH_ODR_CD());
             }
             //受注日
             m_med.setODR_ACPT_DATE(m_med.getbtBUSINESS_OPR_DATE());
             //得意先コード
             m_med.setCUST_CD(m_med.getcustCUST_CD());
             //発注部門コード
             m_med.setBUYER_ORG_CD(m_med.getEdiBUYER_ORG_CD());
             //得意先品目番号
             m_med.setCUST_ITEM_CD(m_med.getEdiCUST_ITEM_CD());
             //品名
             m_med.setPART_NAME(m_med.getEdiPART_NAME());
             //処理区分
             m_med.setPROC_TYP(m_med.getEdiMODIFICATION_CODE());
             //コック区分
             m_med.setCOCK_TYP(m_med.getEdiCOCK_TYP());
             //単位
             m_med.setUNIT_CD(m_med.getEdiUNIT());
             //変換前単位
             m_med.setUNIT_CD_ORG(m_med.getEdiUNIT());
             //単価
             m_med.setUNIT_COST(m_med.getEdiUNIT_PRICE());
             //単価区分
             m_med.setUNIT_COST_TYP(m_med.getEdiPRICE_TYP());
             //指定納期 ↓のロジックで設定
             //注文数量 ↓のロジックで設定
             //総注文数量
             m_med.setPUCH_ODR_QTY_TOTAL(m_med.getEdiPUCH_ODR_QTY());
             //荷姿
             m_med.setPKG_UNIT(m_med.getEdiPKG_UNIT());
             //購買担当
             m_med.setBUYER_NAME(m_med.getEdiBUYER_NAME());
             //検査区分
             m_med.setINSPC_TYP(m_med.getEdiINSPC_TYP());
             //納品場所コード
             m_med.setDLV_LOC_CD(m_med.getEdiDLV_LOC_CD());
             //受渡場所コード
             m_med.setDLV_LOC_CD_EIAJ(m_med.getEdiDLV_LOC_CD());
             //受渡場所名（漢字）
             m_med.setDLV_LOC_NAME_KANJI(m_med.getEdiDLV_LOC_NAME_KANJI());
             //納入NO ↓のロジックで設定
             //納品キー番号 ↓のロジックで設定
             //自由使用欄
             m_med.setFREE_REMARK(m_med.getEdiFREE_TEXT());
             //備考
             m_med.setREMARK(m_med.getEdiREMARKS());
             //発注者用バーコード情報
             m_med.setCLIENT_BARCODE_INF(m_med.getEdiCLIENT_BARCODE_INF());
             //発注者用備考　←　発注者用備考
             m_med.setCLIENT_REMARK(m_med.getEdiCLIENT_REMARK());
             //発注者用備考(漢字）
             m_med.setCLIENT_REMARK_KANJI(m_med.getEdiCLIENT_REMARK_KANJI());
             //納品書価格表示区分
             m_med.setSLIP_PRICE_PRINT_TYP(m_med.getEdiSLIP_PRICE_PRINT_TYP());
             //通貨コード
             m_med.setCUR_CD(m_med.getcustCUR_CD());
             //納期１～３１のループ
             for(int i = 0; i < 31; i++){
              m_med.setDESINATED_DLV_DATE(null);
              if (i == 0 && !(m_med.getEdiSCDL_DLV_DATE_1() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_1()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_1());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_1());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_1());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_1());
              } else if (i == 1 && !(m_med.getEdiSCDL_DLV_DATE_2() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_2()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_2());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_2());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_2());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_2());
              } else if (i == 2 && !(m_med.getEdiSCDL_DLV_DATE_3() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_3()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_3());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_3());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_3());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_3());
              } else if (i == 3 && !(m_med.getEdiSCDL_DLV_DATE_4() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_4()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_4());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_4());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_4());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_4());
              } else if (i == 4 && !(m_med.getEdiSCDL_DLV_DATE_5() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_5()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_5());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_5());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_5());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_5());
              } else if (i == 5 && !(m_med.getEdiSCDL_DLV_DATE_6() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_6()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_6());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_6());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_6());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_6());
              } else if (i == 6 && !(m_med.getEdiSCDL_DLV_DATE_7() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_7()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_7());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_7());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_7());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_7());
              } else if (i == 7 && !(m_med.getEdiSCDL_DLV_DATE_8() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_8()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_8());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_8());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_8());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_8());
              } else if (i == 8 && !(m_med.getEdiSCDL_DLV_DATE_9() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_9()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_9());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_9());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_9());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_9());
              } else if (i == 9 && !(m_med.getEdiSCDL_DLV_DATE_10() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_10()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_10());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_10());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_10());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_10());
              } else if (i == 10 && !(m_med.getEdiSCDL_DLV_DATE_11() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_11()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_11());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_11());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_11());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_11());
              } else if (i == 11 && !(m_med.getEdiSCDL_DLV_DATE_12() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_12()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_12());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_12());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_12());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_12());
              } else if (i == 12 && !(m_med.getEdiSCDL_DLV_DATE_13() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_13()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_13());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_13());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_13());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_13());
              } else if (i == 13 && !(m_med.getEdiSCDL_DLV_DATE_14() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_14()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_14());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_14());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_14());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_14());
              } else if (i == 14 && !(m_med.getEdiSCDL_DLV_DATE_15() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_15()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_15());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_15());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_15());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_15());
              } else if (i == 15 && !(m_med.getEdiSCDL_DLV_DATE_16() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_16()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_16());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_16());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_16());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_16());
              } else if (i == 16 && !(m_med.getEdiSCDL_DLV_DATE_17() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_17()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_17());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_17());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_17());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_17());
              } else if (i == 17 && !(m_med.getEdiSCDL_DLV_DATE_18() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_18()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_18());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_18());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_18());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_18());
              } else if (i == 18 && !(m_med.getEdiSCDL_DLV_DATE_19() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_19()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_19());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_19());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_19());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_19());
              } else if (i == 19 && !(m_med.getEdiSCDL_DLV_DATE_20() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_20()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_20());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_20());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_20());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_20());
              } else if (i == 20 && !(m_med.getEdiSCDL_DLV_DATE_21() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_21()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_21());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_21());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_21());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_21());
              } else if (i == 21 && !(m_med.getEdiSCDL_DLV_DATE_22() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_22()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_22());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_22());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_22());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_22());
              } else if (i == 22 && !(m_med.getEdiSCDL_DLV_DATE_23() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_23()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_23());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_23());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_23());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_23());
              } else if (i == 23 && !(m_med.getEdiSCDL_DLV_DATE_24() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_24()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_24());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_24());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_24());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_24());
              } else if (i == 24 && !(m_med.getEdiSCDL_DLV_DATE_25() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_25()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_25());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_25());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_25());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_25());
              } else if (i == 25 && !(m_med.getEdiSCDL_DLV_DATE_26() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_26()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_26());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_26());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_26());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_26());
              } else if (i == 26 && !(m_med.getEdiSCDL_DLV_DATE_27() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_27()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_27());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_27());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_27());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_27());
              } else if (i == 27 && !(m_med.getEdiSCDL_DLV_DATE_28() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_28()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_28());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_28());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_28());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_28());
              } else if (i == 28 && !(m_med.getEdiSCDL_DLV_DATE_29() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_29()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_29());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_29());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_29());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_29());
              } else if (i == 29 && !(m_med.getEdiSCDL_DLV_DATE_30() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_30()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_30());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_30());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_30());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_30());
              } else if (i == 30 && !(m_med.getEdiSCDL_DLV_DATE_31() == null || "".equals(m_med.getEdiSCDL_DLV_DATE_31()))) {
               m_med.setDESINATED_DLV_DATE(m_med.getEdiSCDL_DLV_DATE_31());
               m_med.setPUCH_ODR_QTY(m_med.getEdiSCDL_DLV_QTY_31());
               m_med.setCUS_DLV_CD(m_med.getEdiDLV_CD_31());
               m_med.setCUS_DLV_KEY_CD(m_med.getEdiDLV_KEY_NO_31());
              }
              if (m_med.getDESINATED_DLV_DATE() != null && !"000000".equals(m_med.getDESINATED_DLV_DATE())) {
               m_med.setODR_SEQ(new Double(i + 1));
               this.writeLogMessageInfo("T_ODR_INFO_COM_IF insert SEQ=",String.valueOf(m_med.getODR_SEQ().intValue()) );
               rv = m_med.getT_ODR_INFO_COM_IF().create();
              }
             }
             //=======================================
             // 注文I/F（EDI)のシステム処理区分を正常に設定
             //=======================================
             m_med.setEdiSYSTEM_PROC_TYP(SYS_PROC_TYP_SUMI);
             rv = m_med.getT_ODR_INFO_EDI_IF().update();
             conn.commit();
            }catch(Exception e) {
             try {
              conn.rollback();
       //							e.printStackTrace();
              // コネクションを渡して、採番の準備
              logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
              // 注文IF(EDI)変換対象データの取得に失敗しました。
              String strMsgCd = "KV02203";
              String strDataString = "LINE=" + (rec + 1);
              businessMsgAcc.init(conn);
              businessMsg.setBusinessOperatingName(strBusinessName);
              businessMsg.setUser(strUserId);
              businessMsg.setPlantCode(strMsgPlantCd);
              businessMsg.setLogCode(logCd.getNo());
       //kis businessMsg.setLogCode("b" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
              businessMsg.setMessageCode(strMsgCd);
              businessMsg.setData(strDataString);
              businessMsgAcc.add(businessMsg);
              if(this.getSysMsg(strMsgCd)){
               CoreTools.write(strMsgCd+" "+this.m_vMSG);
               this.writeLogMessageInfo(" ", e.getMessage());
               this.writeLogMessageInfo(" ", strDataString);
               this.writeLogMessageInfo(" ", "ODR_INFO_COM_IF_CTRL_NO=" + m_med.getODR_INFO_COM_IF_CTRL_NO());
               this.writeLogMessageInfo(" ", "ODR_SEQ=" + m_med.getODR_SEQ());
               this.writeLogMessageInfo(" ", "ODR_TYP=" + m_med.getODR_TYP());
               this.writeLogMessageInfo(" ", "INFO_TYP_CD=" + m_med.getINFO_TYP_CD());
               this.writeLogMessageInfo(" ", "CUST_ODR_NO=" + m_med.getCUST_ODR_NO());
               this.writeLogMessageInfo(" ", "ODR_ACPT_DATE=" + m_med.getODR_ACPT_DATE());
               this.writeLogMessageInfo(" ", "CUST_CD=" + m_med.getCUST_CD());
               this.writeLogMessageInfo(" ", "CUST_ITEM_CD=" + m_med.getCUST_ITEM_CD());
               this.writeLogMessageInfo(" ", "PART_NAME=" + m_med.getPART_NAME());
               this.writeLogMessageInfo(" ", "PROC_TYP=" + m_med.getPROC_TYP());
               this.writeLogMessageInfo(" ", "COCK_TYP=" + m_med.getCOCK_TYP());
               this.writeLogMessageInfo(" ", "UNIT_CD=" + m_med.getUNIT_CD());
               this.writeLogMessageInfo(" ", "UNIT_COST=" + m_med.getUNIT_COST());
               this.writeLogMessageInfo(" ", "UNIT_COST_TYP=" + m_med.getUNIT_COST_TYP());
               this.writeLogMessageInfo(" ", "DESINATED_DLV_DATE=" + m_med.getDESINATED_DLV_DATE());
               this.writeLogMessageInfo(" ", "PUCH_ODR_QTY=" + m_med.getPUCH_ODR_QTY());
               this.writeLogMessageInfo(" ", "PKG_UNIT=" + m_med.getPKG_UNIT());
               this.writeLogMessageInfo(" ", "INSPC_TYP=" + m_med.getINSPC_TYP());
               this.writeLogMessageInfo(" ", "DLV_LOC_CD=" + m_med.getDLV_LOC_CD());
               this.writeLogMessageInfo(" ", "DLV_LOC_CD_EIAJ=" + m_med.getDLV_LOC_CD_EIAJ());
               this.writeLogMessageInfo(" ", "DLV_LOC_NAME_KANJI=" + m_med.getDLV_LOC_NAME_KANJI());
               this.writeLogMessageInfo(" ", "CUS_DLV_CD=" + m_med.getCUS_DLV_CD());
               this.writeLogMessageInfo(" ", "CUS_DLV_KEY_CD=" + m_med.getCUS_DLV_KEY_CD());
               this.writeLogMessageInfo(" ", "FREE_REMARK=" + m_med.getFREE_REMARK());
               this.writeLogMessageInfo(" ", "REMARK=" + m_med.getREMARK());
               this.writeLogMessageInfo(" ", "CLIENT_BARCODE_INF=" + m_med.getCLIENT_BARCODE_INF());
               this.writeLogMessageInfo(" ", "CLIENT_REMARK=" + m_med.getCLIENT_REMARK());
               this.writeLogMessageInfo(" ", "CLIENT_REMARK_KANJI=" + m_med.getCLIENT_REMARK_KANJI());
               this.writeLogMessageInfo(" ", "SLIP_PRICE_PRINT_TYP=" + m_med.getSLIP_PRICE_PRINT_TYP());
               this.writeLogMessageInfo(" ", "CUR_CD=" + m_med.getCUR_CD());
               this.writeLogMessageInfo(" ", "UNIT_CD_ORG=" + m_med.getUNIT_CD_ORG());
               this.writeLogMessageInfo(" ", "PUCH_ODR_QTY_TOTAL=" + m_med.getPUCH_ODR_QTY_TOTAL());
               this.writeLogMessageInfo(" ", "BUYER_NAME=" + m_med.getBUYER_NAME());
               this.writeLogMessageInfo(" ", "ODR_ACPT_PROC_ODR=" + m_med.getODR_ACPT_PROC_ODR());
               this.writeLogMessageInfo(" ", "BUYER_ORG_CD=" + m_med.getBUYER_ORG_CD());
              }else{
               throw new Exception();
              }
              conn.commit();
             } catch (SQLException ex) {
              ex.printStackTrace();
             } catch (FoundationException ex) {
              ex.printStackTrace();
             }
            }
           }
       
           CoreTools.write("(SBM1247)注文IF(EDI)変換処理終了");
           
       //-----------------------------------------------------------------------------
       //		注文IF(EDI)変換処理（ここまで）
       //-----------------------------------------------------------------------------
       
          }catch(Exception e) {
           try {
            conn.rollback();
            e.printStackTrace();
            // コネクションを渡して、採番の準備
            logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
            // 注文IF(EDI)変換対象データの取得に失敗しました。
            String strMsgCd = "KV02203";
            String strDataString = "LINE=" + (rec + 1);
            businessMsgAcc.init(conn);
            businessMsg.setBusinessOperatingName(strBusinessName);
            businessMsg.setUser(strUserId);
            businessMsg.setPlantCode(strMsgPlantCd);
            businessMsg.setLogCode(logCd.getNo());
       //kis businessMsg.setLogCode("b" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
            businessMsg.setMessageCode(strMsgCd);
            businessMsg.setData(strDataString);
            businessMsgAcc.add(businessMsg);
            if(this.getSysMsg(strMsgCd)){
             CoreTools.write(strMsgCd+" "+this.m_vMSG);
            }else{
             throw new Exception();
            }
            conn.commit();
           } catch (SQLException ex) {
            ex.printStackTrace();
           } catch (FoundationException ex) {
            ex.printStackTrace();
           }
          }
            } catch (Exception e) {
          try {
           conn.rollback();
           e.printStackTrace();
           logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
           // 注文IF(EDI)変換バッチ処理にて致命的なエラーが発生しました。
           String strMsgCd = "KV02203";
            String strDataString = "LINE=" + (rec + 1);
           businessMsgAcc.init(conn);
           businessMsg.setBusinessOperatingName(strBusinessName);
           businessMsg.setUser(strUserId);
           businessMsg.setPlantCode(strMsgPlantCd);
           businessMsg.setLogCode(logCd.getNo());
       //kis businessMsg.setLogCode("c" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
           businessMsg.setMessageCode(strMsgCd);
           businessMsg.setData(strDataString);
           businessMsgAcc.add(businessMsg);
           if(this.getSysMsg(strMsgCd)){
            CoreTools.write(strMsgCd+" "+this.m_vMSG);
           }
           conn.commit();
          } catch (SQLException ex) {
           ex.printStackTrace();
          } catch (FoundationException ex) {
           ex.printStackTrace();
          }
            } finally {
          //バッチ終了メッセージ登録
          // コネクションを渡して、採番の準備
          try {
          	
            // コネクションを渡して、業務メッセージ準備
            businessMsgAcc.init(conn);
            businessMsg.setBusinessOperatingName(strBusinessName);
            businessMsg.setUser(strUserId);
            businessMsg.setPlantCode(strMsgPlantCd);
          	
			// コネクションを渡して、採番の準備
            logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
            businessMsg.setLogCode(logCd.getNo());
            
			//業務ロック解除
			boolean result = lock.doUnLock(m_med.getProgname(), lockCancelKey);
			if (result == false) {
				// 業務メッセージ追加
				String strMsgCd = "ZZ01004";
				businessMsg.setMessageCode(strMsgCd);
				businessMsgAcc.add(businessMsg);
			}
			
			if (lockCancelKey != -1) {
				// 業務メッセージ追加
				String strMsgCd = "KV02202";
				String strDataString = "(SBM0611)<<注文IF(EDI)変換バッチ処理終了>>";
				//kis businessMsg.setLogCode("d" +Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS"));
				businessMsg.setMessageCode(strMsgCd);
				businessMsg.setData(strDataString);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG+" "+strDataString);
				}
			}
          	
			conn.commit();
          } catch (SQLException ex) {
           ex.printStackTrace();
          } catch (FoundationException ex) {
           ex.printStackTrace();
          }
         }
       
       //-----------------------------------------------------------------------------
       
         return BREAK;
        }
       
       
        //////////////////////////////
       
        /**
         * object型を返します
         *
         * @return object型
         */
        public int getType()
        {
         return m_control.getType();
        }
       
        /**
         * 初期処理
         *
         * @return <<コメントを記述してください>>
         * @exception <<コメントを記述してください>>
         */
        public int beginProc() throws BatchAppException
        {
       
         // todo: ここにユーザ定義コードを記述してください
       
         return m_control.beginProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int endProc() throws BatchAppException
        {
       
         // todo: ここにユーザ定義コードを記述してください
       
         return m_control.endProc();
        }
       
        /**
         * 終了処理
         *
         * @exception <<コメントを記述してください>>
         */
        public int execute() throws BatchAppException
        {
       
         // todo: ここにユーザ定義コードを記述してください
       
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
		public medKV0020B002 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKV0020B002 med) throws BatchAppException
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
