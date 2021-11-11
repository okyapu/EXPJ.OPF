/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0160/src/com/nec/jp/orteus/metamorBase/AE0160/AE0160B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0160.AE0160B001;

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
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.util.DateCtrl;
import com.nec.jp.orteus.expj.util.DateTool;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.PrivateConfig;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.AE0060.AE0060010Entity;
import com.nec.jp.orteus.metamorBase.AE0060.AE0060010Struct;
import com.nec.jp.orteus.metamorBase.AE0060.InspcAcpt;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.expj.util.Calculate;
import java.math.BigDecimal;
import java.math.BigInteger;

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.19 $ $Date: 2017/01/09 08:43:58 $
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
	public medAE0160B001 m_med=null;

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
	public CtrlMain(medAE0160B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// メンバ変数を初期化します
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
	/** ログレベル インフォメーション */
    private static final int INFOMATION = 0;
    /** ログレベル ワーニング */
    private static final int WORNING = 1;
    /** ログレベル エラー */
    private static final int ERROR = 2;
    
    /** エラー */
    private static final String ERROR_NO = "PUCH_ODR_CD = ";
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
    /** DBコネクション */
    private IDbConnection conn = null;
	IDbConnection conn_msg = null;
   
    /** 業務メッセージログ用Numberingクラス */
    private Numbering numbering = null;
    /** 業務メッセージログ用BusinessMessageAccessorクラス */
    private BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
    /** 業務メッセージログ用BusinessMessageクラス */
    private BusinessMessage businessMsg = new BusinessMessage();
    // バッチクラス共通エラー処理用
    private String errCode = null;		     // バッチエラーコード
    private List errList  = null;            // エラーリスト
    private String businessErrCode = null;          // metamorBase業務メッセージコード
    private String errNote = "";             // バッチエラーメッセージ(備考) 必要に応じて使用
    private AE0060010Entity entity = null;
    private AE0060010Struct struct = null;
    /** ロック失敗時ロックキー */
    private static final int LOCK_FAILD = -1;
   
//  支給品使用テーブルの[使用予定数量]・[支給品使用単位数分母]・[支給品使用単位数分子]の最大値 
    BigDecimal Decival = new BigDecimal("100000000000000");
    List lotNoList = new ArrayList();
    //  読込件数
    int inputCount = 0;                
    // 登録件数
    int insertCount = 0;                    
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
     * @throws FoundationException
     * @throws SQLException
     */
    private void writeLog(int logLevel, String code) throws FoundationException, SQLException {
     writeLog(logLevel, code, null, null);
    }
    /**
     * ストアドプロシージャ実行
     * @param userId ユーザID
     * @param businessName 業務名
     * @param plantCd 工場コード
     * @param csvTime CSV取込時間
     * @param outStatus 処理結果
     * @return 実行結果
     * @throws Exception 
     * @throws Exception 
     */
    public void spExecute(String userId, String businessName, 
      String plantCd, String _sysDateFrom,String _sysDateTo,String _businessOprDate) throws Exception{
        try{
		    // 処理実行 --------------------------------------------------------
		    writeLog(INFOMATION, "AE00176" );// バッチ処理を開始しました。
		    // メッセージプロパティファイル
	        ResourceBundle _messages = CoreTools.getResourceBundle("ExpjMessage", CoreTools.getLocale(userId));

		    // 各カウンタに初期値=0をセットする。
		    inputCount = 0;                     
		    insertCount = 0;  
		    entity = new AE0060010Entity();
		    // 発注番号区分、件数
		    int recordCount ;
			// [受入実績取込]読込
			m_med.setDATEFROM(_sysDateFrom);
			m_med.setDATETO(_sysDateTo);
			m_med.getselectT_ACPT_RSLT_TEMP().read();
			while(m_med.getselectT_ACPT_RSLT_TEMP().next()){
				inputCount = inputCount + Integer.parseInt(m_med.getLINE_COUNT());

				// 発注番号より、 [受入実績取込]読込
				m_med.getselectT_ACPT_RSLT_TEMPByPuchOdrCd().read();

				int checkresult = 0;
				boolean completeFlg = false;
				conn.beginTransWeb();
			    // 発注番号区分、件数
			    recordCount = 1;
				while(m_med.getselectT_ACPT_RSLT_TEMPByPuchOdrCd().next()){
					errList = new ArrayList();
					//受入日  
					if(null == m_med.getTEMP_ACPT_DATE() || "".equals(m_med.getTEMP_ACPT_DATE())){
						//Nullの場合、「業務運用日」
						m_med.setTEMP_ACPT_DATE(_businessOprDate);
					}
					m_med.getlockT_ACPT_RSLT_TEMP().read();
					struct = new AE0060010Struct();
					writeLogFiles(INFOMATION, "AE00188",m_med.getTEMP_ACPT_RSLT_TEMP_CTL_NO());
					// 受入完了の設定
					if("1".equals(m_med.getTEMP_ACPT_RSLT_COMP()) || "2".equals(m_med.getTEMP_ACPT_RSLT_COMP())){
						completeFlg = true;
					}
					if(recordCount == Integer.parseInt(m_med.getLINE_COUNT())){
						if(completeFlg == true){
							m_med.setCOMPLETE_FLG("true");
						}else{
							m_med.setCOMPLETE_FLG("false");
						}
					}else{
						m_med.setCOMPLETE_FLG("false");
					}
/*					//受入数の設定:受入数がNullの場合、[発注残]．発注数-SUM（[受入実績]．受入数）
					if (m_med.getTEMP_ACPT_QTY() == null || "".equals(m_med.getTEMP_ACPT_QTY())){
						m_med.getselectT_ACPT_RSLT().read();
						m_med.getselectT_ACPT_RSLT().next();
					}*/
					// 受入完了フラグが２：0完了の場合、かつ「受入数」≠０の場合
					if("2".equals(m_med.getTEMP_ACPT_RSLT_COMP()) && Calculate.compare("0", m_med.getTEMP_ACPT_QTY()) !=0){
						m_med.setTEMP_ACPT_QTY("0");
						writeLogFiles(INFOMATION, "AE00190");
					}
					// データチェック
					checkresult = doCheck(_businessOprDate,m_med.getTEMP_PUCH_ODR_CD());
					plantCd = m_med.getPLANT_CD();
					if(0 != checkresult){
						conn.rollback();
						break;
					}
					//在庫ロット番号採番
					if ("1".equals(m_med.getLOT_CTRL_FLG())
							&& !"0".equals(m_med.getTEMP_ACPT_QTY())
							&& !"1".equals(m_med.getNON_NO_ITEM_FLG())
							&& !(null != m_med.getWORK_ODR_CD() 
									&& !"".equals(m_med.getWORK_ODR_CD()) 
									&& "0".equals(m_med.getFINAL_PROC_FLG()))){
						//自動採番の場合、かつ、在庫ロット番号がNullの場合
						if (!"0".equals(m_med.getLOT_NUMBERING_TYP())
								&& (null == m_med.getTEMP_LOT_NO() || "".equals(m_med.getTEMP_LOT_NO()))){
							// 在庫ロット番号の自動採番を行う。
			                String itemCdStr = m_med.getTEMP_ITEM_CD();              //品目番号
			                String acptDateStr = m_med.getTEMP_ACPT_DATE();          //受入日
							BizCommon bc = new BizCommon(conn, userId, businessName, plantCd);
							//ロット採番共通部品
							List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
							//結果ステータスが正常終了
				            if(bc.getResultStatus().intValue() == 1){
				                if(resultList != null && resultList.size() > 0){
				        	        String result1 = (String)resultList.get(0);
				        	        struct.setLOT_NO(result1);                  //ロット番号
				                }
				            }else{
				            	//結果ステータスが正常終了以外
				                if(resultList != null && resultList.size() > 1){
				                	//引数のエラーコードでエラーメッセージを表示し
				                	errCode = "AE00184";
				                	writeLog(ERROR, errCode, null,ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
				        	        struct.setLOT_NO(null); 
				        	        checkresult = 9;
				        	        conn.rollback();
				        	        break;
				                }
				            }
						}
						//手入力する場合、在庫ロット番号がロット管理に存在しない場合
						if("0".equals(m_med.getLOT_NUMBERING_TYP())
								&& (null != m_med.getTEMP_LOT_NO() && !"".equals(m_med.getTEMP_LOT_NO()))){
							//ロット管理にデータを読込
							m_med.getT_LOT_CTRL().read();
							if (!m_med.getT_LOT_CTRL().next()){
								// 賞味期限自動計算を行う。
				                String itemCdStr = m_med.getTEMP_ITEM_CD();              //品目番号
				                String acptDateStr = m_med.getTEMP_ACPT_DATE();          //受入日
								BizCommon bc = new BizCommon(conn, userId, businessName, plantCd);
								//賞味期限自動計算共通部品
								List resultList = bc.calcBestBeforeFd(itemCdStr, acptDateStr);
								//結果ステータスが正常終了
					            if(bc.getResultStatus().intValue() == 1){
					                if(resultList != null && resultList.size() > 0){
					        	        String result1 = (String)resultList.get(0);
										if(result1.length() < 10) {
											m_med.setTEMP_BEST_BEFORE_DATE(null); // 賞味期限
										} else {
											m_med.setTEMP_BEST_BEFORE_DATE(result1); // 賞味期限
										}
					                }
					            }else{
					            	//結果ステータスが正常終了以外
					                if(resultList != null && resultList.size() > 1){
					                	//引数のエラーコードでエラーメッセージを表示し
					                	errCode = "AE22056";
					                	writeLog(ERROR, "AE22056", null, ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
					        	        m_med.setTEMP_BEST_BEFORE_DATE(null);                  //賞味期限
					        	        checkresult = 9;
					        	        conn.rollback();
					        	        break;
					                }
					            }
								m_med.setUSER_CD(userId);
								m_med.setPRG_NM(businessName);
								m_med.getT_LOT_CTRL().create();				
							}
						}
					}
/*					//structに変数を置きました
					copyMedToStruct();*/
					struct.setsUser_ID(userId);
					if("true".equals(m_med.getCOMPLETE_FLG())){
						struct.setc_COMPLETE("true");
					}
					//「値引金額」の [通貨].”小数点桁数” 未満 を [取引先].”発注金額まるめ区分” でまるめた場合
					String disc_amount = Calculate.divide(struct.getDISC_AMOUNT(), "1", 
							Integer.parseInt(struct.getVEND_DECIMAL_FIG()),	Integer.parseInt(struct.getROUND_TYP()));
					if (!disc_amount.equals(struct.getDISC_AMOUNT())){
						//値引金額について有効桁数以下のまるめ処理を行いました。
						writeLogFiles(WORNING, "AE00195");
						struct.setDISC_AMOUNT(disc_amount);
					}
					
					// ｢受入金額｣の計算
					String puchOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							struct.getACPT_QTY(),
							struct.getUNIT_COST(),
							struct.getROUND_TYP(),
							struct.getVEND_DECIMAL_FIG());
					struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
					// 本体金額の計算
					struct.setNET_AMOUNT(AmountCalculator.calcNetAmount(struct.getPUCH_ODR_AMOUNT(), struct.getDISC_AMOUNT()));
					// Add Start 20131227 fang-xf
					TaxStruct ts =
						TaxControl.getDataTax(
							conn,
							m_med.getCOMPANY_CD(),
							m_med.getVEND_CD(),
							m_med.getITEM_CD(),
							struct.getACPT_DATE(),
							m_med.getTAX_CD());
					// 消費税コード
					struct.setTAX_CD(ts.getTAX_CD());
					// 税率１
					struct.setTAX_RATE_1(ts.getTAX_RATE_1());
					// 税率２
					struct.setTAX_RATE_2(ts.getTAX_RATE_2());
					// 税率３
					struct.setTAX_RATE_3(ts.getTAX_RATE_3());
					// 税端数処理区分
					struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
					// Add End 20131227 fang-xf
					// Mod Start 20140207 fang-xf
					//// ｢税額1｣の計算
					//String taxAmount1 =
					//	AmountCalculator.calcTaxAmount(
					//		struct.getNET_AMOUNT(),
					//		struct.getTAX_RATE_1(),
					//		struct.getTAX_ROUND_TYP(),
					//		struct.getVEND_DECIMAL_FIG());
					//struct.setTAX_AMOUNT_1(taxAmount1);
					//// ｢税額2｣の計算
					//String taxAmount2 =
					//	AmountCalculator.calcTaxAmount(
					//		struct.getNET_AMOUNT(),
					//		struct.getTAX_RATE_2(),
					//		struct.getTAX_ROUND_TYP(),
					//		struct.getVEND_DECIMAL_FIG());
					//struct.setTAX_AMOUNT_2(taxAmount2);
					//// ｢税額3｣の計算
					//String taxAmount3 =
					//	AmountCalculator.calcTaxAmount(
					//		struct.getNET_AMOUNT(),
					//		struct.getTAX_RATE_3(),
					//		struct.getTAX_ROUND_TYP(),
					//		struct.getVEND_DECIMAL_FIG());
					//struct.setTAX_AMOUNT_3(taxAmount3);
					//// ｢税込金額｣の計算
					//String amountIncludeTax =
					//	AmountCalculator.calcAmountIncludeTax(
					//		struct.getNET_AMOUNT(),
					//		struct.getTAX_AMOUNT_1(),
					//		struct.getTAX_AMOUNT_2(),
					//		struct.getTAX_AMOUNT_3());
					//struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
					
					// 内税の場合に税額を計算する
			 		String lowerTaxCd =
			 			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
			 		if (!lowerTaxCd.equals("1")) {
						//バッチパラメータ呼出
						List batList = entity.mSYS_BAT_PARM.read(conn, struct);
						if(!batList.isEmpty()){
							//税計算部品をコール
							AE0060010Struct batStruct = (AE0060010Struct)batList.get(0);
							struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
							struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
							struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
							struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
							struct.setPVC2USERID(m_med.getUSER_CD());
							struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
							struct.setPVC2PLANTCD(m_med.getPLANT_CD());
							struct.setPVC2TAXID("5");
							batList = entity.mcallSQLCALCTAXCALCAMT.call(conn, struct);
							batStruct = (AE0060010Struct)batList.get(0);
							if(!"1".equals(batStruct.getPNUMSTATUS())){
								// 引数のエラーコードでエラーメッセージを表示し
			                	errCode = batStruct.getPVC2ERRCD();
			                	writeLog(ERROR, batStruct.getPVC2ERRCD(), null, ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
			        	        m_med.setTEMP_BEST_BEFORE_DATE(null);                  //賞味期限
			        	        checkresult = 9;
			        	        conn.rollback();
			        	        break;  				       				
							}
							struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
							struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
							struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
							struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
						}else{
							// 引数のエラーコードでエラーメッセージを表示し
		                	errCode = "ZZ09007";
		                	writeLog(ERROR, "ZZ09007", null, ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
		        	        m_med.setTEMP_BEST_BEFORE_DATE(null);                  //賞味期限
		        	        checkresult = 9;
		        	        conn.rollback();
		        	        break;      				
						}
			     	}else{
			     		//  ｢税額1｣の計算
						String taxAmount1 =
							AmountCalculator.calcTaxAmount(
								struct.getNET_AMOUNT(),
								struct.getTAX_RATE_1(),
								struct.getTAX_ROUND_TYP(),
								struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_1(taxAmount1);
						// ｢税額2｣の計算
						String taxAmount2 =
							AmountCalculator.calcTaxAmount(
								struct.getNET_AMOUNT(),
								struct.getTAX_RATE_2(),
								struct.getTAX_ROUND_TYP(),
								struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_2(taxAmount2);
						// ｢税額3｣の計算
						String taxAmount3 =
							AmountCalculator.calcTaxAmount(
								struct.getNET_AMOUNT(),
								struct.getTAX_RATE_3(),
								struct.getTAX_ROUND_TYP(),
								struct.getVEND_DECIMAL_FIG());
						struct.setTAX_AMOUNT_3(taxAmount3);
						// ｢税込金額｣の計算
						String amountIncludeTax =
							AmountCalculator.calcAmountIncludeTax(
								struct.getNET_AMOUNT(),
								struct.getTAX_AMOUNT_1(),
								struct.getTAX_AMOUNT_2(),
								struct.getTAX_AMOUNT_3());
						struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
			     	}
					// Mod End 20140207 fang-xf
					// ｢邦貨金額｣の計算
					HomeCurStruct _homeCurStruct = new HomeCurStruct();
					_homeCurStruct = HomeCurControl.getData(conn);
					String homeCurAmount =
						AmountCalculator.calcHomeCurAmount(
							struct.getAMOUNT_INCLUDE_TAX(),
							struct.getEXCH_RATE(),
							struct.getROUND_TYP(),
							_homeCurStruct.getDECIMAL_FIG());
					struct.setHOME_CUR_AMOUNT(homeCurAmount);
					
					// [発注残]."発注時受入検査区分"が1:受入のみ の場合
					if ("1".equals(struct.getACPT_INSPC_TYP())) {
						//検査待ち保管区
						struct.setINSPC_WH_CD(null);
						//受入状態区分: 2：検査完了
						struct.setACPT_STS_TYP("2");
					}
					
					// [発注残].”発注時受入検査区分” が 2：受入と検査を行う の場合
					if("2".equals(struct.getACPT_INSPC_TYP())){
						//受入状態区分: 1：未検査
						struct.setACPT_STS_TYP("1");
					}
				
					// パラメータ[検査完了フラグ]を取得
					PrivateConfig pc = new PrivateConfig(conn);
				    String _inspcvalue = pc.getString("INSPC_CMPLT_FLG");
					//　[発注残]."受入検査区分"が2:受入後に検査を行うかつ受入数量=0かつ"検査完了フラグ"=1　2009/07/14
					if("2".equals(struct.getACPT_INSPC_TYP()) &&
					   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
					   "1".equals(_inspcvalue)){
						struct.setACPT_STS_TYP("2");
					}
					
					// [発注残]."備品発注フラグ"が0:備品以外（通常仕入品）だった場合
					if ("0".equals(struct.getNON_NO_ITEM_FLG())) {
						//備品発注品目名 : NULL
						struct.setITEM_NAME(null);
					}
					// [受入実績]を登録
					entity.mT_ACPT_RSLT.create(conn, struct);

					// [発注残]."受入検査区分"が1:受入のみの場合
					if ("1".equals(struct.getACPT_INSPC_TYP())) {
						// [検査実績]を登録
						entity.mT_INSPC_RSLT.create(conn, struct);
					}

					// 全受入完了の場合
					if ("true".equals(struct.getc_COMPLETE())) {
						//受入完了日を読込
						List aList = entity.mT_RLSD_PUCH_ODRForComplete.read(conn, struct);
						AE0060010Struct aStruct = (AE0060010Struct) aList.get(0);
						aStruct.setsOraganization_CD(struct.getsOrganization_CD());
						aStruct.setsSysdate(struct.getsSysdate());
						aStruct.setsUser_ID(struct.getsUser_ID());
						//発注状態区分:9 完了
						aStruct.setPUCH_ODR_STS_TYP("9");
						//注文取消伝票発行フラグ 
						aStruct.setODR_CANCEL_SLIP_ISS_FLG("0");
						
						//　[発注残]."受入検査区分"が2:受入後に検査を行うかつ受入数量=0かつ"検査完了フラグ"=1　2009/07/14
						if("2".equals(struct.getACPT_INSPC_TYP()) &&
								   Calculate.compare(struct.getACPT_QTY(), "0") ==0 &&
								   "1".equals(_inspcvalue)){
							aStruct.setINSPC_CMPLT_DATE(struct.getACPT_DATE());
							aStruct.setINSPC_CMPLT_FLG("1");
						}
						// [発注残]を更新
						entity.mT_RLSD_PUCH_ODRForComplete.update(conn, aStruct);
					}
		
					// 受入実績関連のテーブルを更新
					String[] message;
					InspcAcpt ia = new InspcAcpt(conn, userId, businessName, plantCd);
				
					if (!ia.addAcpt(struct.getPUCH_ODR_CD(), struct.getACPT_NO(), null, m_med.getCOMPANY_CD())) {
						if (ia.getErrorList() != null && !ia.getErrorList().isEmpty() ) {
							if ("BZ00180".equals(ia.getErrorList().get(0).toString())) {
								errCode = "BZ00180";
								writeLog(ERROR, "BZ00180", null, ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
								checkresult = 9;
								conn.rollback();
								break;
							}
						}
						errCode = "AE05017";
						writeLog(ERROR, "AE05017", null, ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
						checkresult = 9;
						conn.rollback();
						break;
					}

					// 業務ワーニングの出力
					for(int i=0; i<ia.getWarnList().size(); i++){
						message = (String[])ia.getErrorList().get(i);
						if("AD10003".equals(message[0])){
							writeLogFiles(WORNING, "AE00162");
						}
					}
					if(!ia.getErrorList().isEmpty()){
						for(int i=0; i<ia.getErrorList().size(); i++){
							message = (String[])ia.getErrorList().get(i);
							errCode = message[0];
		                	errList.add(message[0]);
		                	errList.add(message[1]);
		                	writeLog(ERROR, errCode, message[1], ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
						}
						checkresult = 9;
						conn.rollback();
						break;
					}
					// 支給品みなし出庫処理
					if(!consInssue(userId, businessName, plantCd, m_med.getTEMP_PUCH_ODR_CD())){
						checkresult = 9;
						conn.rollback();
						break;
					}

					// 自動出庫の業務アラームがあれば出力する。
					for(int i=0; i<ia.getWarnList().size(); i++){
						message = (String[])ia.getWarnList().get(i);
						writeLogFiles(WORNING, message[0], message[1]);
					}
					if(recordCount == Integer.parseInt(m_med.getLINE_COUNT())){
						insertCount = insertCount + Integer.parseInt(m_med.getLINE_COUNT());
					}
					recordCount++;
					
				}
				if(checkresult !=0){
					m_med.setACPT_RSLT_TEMP_CTL_NO(m_med.getTEMP_ACPT_RSLT_TEMP_CTL_NO());
					m_med.setACPT_RSLT_TAKE_ERR_TYP(Integer.toString(checkresult));
					StringBuffer sb = new StringBuffer();
					if (errList.isEmpty()){
						sb.append(_messages.getString((String)errCode));
					}else {
						for(int i =0;i< errList.size();i++){
							ExpjMessage emsg = new ExpjMessage((String)errList.get(i), (String)errList.get(i+1));
							sb.append(emsg.getMessage());
							i++;
						}
					}
					m_med.setACPT_RSLT_TAKE_ERR_INFO(sb.toString());
				}else{
					m_med.setACPT_RSLT_TEMP_CTL_NO(null);
					m_med.setACPT_RSLT_TAKE_ERR_TYP(null);
					m_med.setACPT_RSLT_TAKE_ERR_INFO(null);
				}
				m_med.setUSER_CD(userId);
				m_med.setPRG_NM(businessName);
				
				// ［受入実績取込履歴］の登録
				m_med.getinsertT_ACPT_RSLT_TEMP_HISTORY().create();
				// [受入実績取込]の削除
				m_med.getdeleteT_ACPT_RSLT_TEMP().delete();
				conn.commit();
			}
			
        } catch(SQLException e) {
        	e.printStackTrace();
        	//エラー内容を印刷
			writeLog(ERROR, "ZZ01106",null,e.getMessage());
			writeLog(ERROR, "AE00186",null ,ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
    		conn.rollback();
    		throw e;
    	} catch(Exception e) {
        	e.printStackTrace();
			writeLog(ERROR, "AE00186",null ,ERROR_NO + m_med.getTEMP_PUCH_ODR_CD());
    		conn.rollback();
    		throw e;
    	}
	}
	/**
	 * 	データチェック
	 * @return 1：発注残エラー 2：入力項目エラー 0:正常
	 * @throws BatchAppException
	 * @throws ParseException 
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private int doCheck(String _businessOprDate, String puchno) throws BatchAppException, ParseException, SQLException, FoundationException{
	    // [発注残]に読込
		m_med.getT_RLSD_PUCH_ODR().read();
		// [受入実績取込].”発注番号” が [発注残] に存在していない場合
		if(!m_med.getT_RLSD_PUCH_ODR().next()){
			errCode = "ZZ06001";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 1;
		}
		// [発注残].”発注状態区分” が 1：未指示 である場合
		if("1".equals(m_med.getPUCH_ODR_STS_TYP())){
			errCode = "AE30803";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 1;
		}
		// [発注残].”税コード” で [消費税区分] を検索し、存在しなかった場合
		if(null == m_med.getTAX_CD() || "".equals(m_med.getTAX_CD())){
			try {
				TaxStruct ts =
					TaxControl.getData(
						conn,
						m_med.getCOMPANY_CD(),
						m_med.getVEND_CD(),
						m_med.getITEM_CD(),
						m_med.getPUCH_ODR_START_DATE());

				m_med.setTAX_CD(ts.getTAX_CD());
			} catch (DataNotFoundException e) {
				// Mod Start 20140211 fang-xf
				//errCode = "AE05003";
				errCode = "KQ10011";
				// Mod End 20140211 fang-xf
				writeLog(ERROR, errCode, null, ERROR_NO + puchno);
				return 1;
			}
		}
		m_med.getM_TAX().read();
		if (!m_med.getM_TAX().next()){
			errCode = "AE05003";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 1;
		}
		
		// [発注残].”受給区分”≠2:無償受給
		if(!"2".equals(m_med.getSPL_ITEM_TYP())){
			// 買掛管理がインストールされている場合、当年月度を取得
			AE0060010Struct readStruct = new AE0060010Struct();
			List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, readStruct);
			if (installOptionsList.size() > 0) {
				AE0060010Struct installOptionsStruct = (AE0060010Struct)installOptionsList.get(0);
				struct.setINSTALL_FLG(installOptionsStruct.getINSTALL_FLG());
			} else {
				struct.setINSTALL_FLG("0");
			}
			
			// 買掛管理がインストールされている場合、当年月度を取得
			if ("1".equals(struct.getINSTALL_FLG())) {
				List debtCtrlList = entity.mSYS_DEBT_CTRL.read(conn, readStruct);
				if (debtCtrlList.size() > 0) {
					AE0060010Struct debtCtrlStruct = (AE0060010Struct)debtCtrlList.get(0);
					struct.setTHIS_MONTH(debtCtrlStruct.getTHIS_MONTH());
					// [インストールオプション]." システムオプション識別子"＝ C* 、[インストールオプション]." システム導入フラグ"＝ 1:導入で
					//[自社]." SYSコントロールコード"　＝　SYSTEM、[自社]."会社コード"＝[買掛システム管理]."会社コード"、
					//[買掛システム管理]."当年月度"＞ [受入実績取込]. "受入日"（YYYY/MM）
					if(DateTool.compareYM(m_med.getTEMP_ACPT_DATE(), struct.getTHIS_MONTH()) < 0){
						writeLogFiles(WORNING, "AE00183");
					}
				} else {
					// 買掛システム管理の当年月度が設定されていません。
					errCode = "AE00145";
					writeLog(ERROR, errCode, null, ERROR_NO + puchno);
					return 1;
				}
			}
		}

		// [発注残].”発注状態区分” が 9：受入完了である場合
		if("9".equals(m_med.getPUCH_ODR_STS_TYP())){
			errCode = "AE05005";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 1;
		}
		// [発注残].”発注時受入検査区分” が 2：受入と検査を行う
		if("2".equals(m_med.getACPT_INSPC_TYP())){
			AE0060010Struct readStruct = new AE0060010Struct();
			readStruct.setPLANT_CD(m_med.getPLANT_CD());
			List inspcWhList = entity.mselectM_WH.read(conn, readStruct);
			
			// [保管区]."工場コード"=[発注残]."工場コード"かつ[保管区]."倉庫区分"=40(検査待ち保管区)
			// に該当するデータが存在しない場合
			if (inspcWhList.isEmpty()) {
				// 検査待ち保管区が存在しません。
				errCode = "AE00163";
				writeLog(ERROR, errCode, null, ERROR_NO + puchno);
				return 1;
			}
			//検査待ち保管区の設定
			m_med.setWH_CD(((AE0060010Struct)inspcWhList.get(0)).getINSPC_WH_CD());
		}
		// [受入実績取込]."受入日" ＞ [日付制御]."業務運用日" の場合
		if(DateTool.compareYMD(m_med.getTEMP_ACPT_DATE(), _businessOprDate)>0){
			errCode = "AE33111";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		//[受入実績取込]."品目番号" ≠ [発注残]."品目番号"の場合
		if(m_med.getTEMP_ITEM_CD() != null && !"".equals(m_med.getTEMP_ITEM_CD())
				&& !m_med.getTEMP_ITEM_CD().equals(m_med.getITEM_CD())){
			errCode = "AE00187";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		//structに変数を置きました
		copyMedToStruct();
		// 「受入数」＝0、「受入完了フラグ」≠2：0完の場合
		if(Calculate.compare(struct.getACPT_QTY(), "0") == 0 && !"2".equals(m_med.getTEMP_ACPT_RSLT_COMP())) {
			errCode = "AE00197";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		
		// [受入実績取込].”受入場所” で [保管区] を検索し、存在しない場合
		if(null!= m_med.getTEMP_WH_CD() && !"".equals(m_med.getTEMP_WH_CD())){
			AE0060010Struct whStruct = new AE0060010Struct();
			whStruct.setWH_CD(m_med.getTEMP_WH_CD());
			List whList = entity.mM_WH.read(conn, whStruct);
			if (whList.isEmpty()) {
				errCode = "AE00018";
				writeLog(ERROR, errCode, null, ERROR_NO + puchno);
				return 2;
			} else {
				// [保管区]."工場コード" != ｢工場コード｣の場合
				whStruct = (AE0060010Struct) whList.get(0);
				if (!m_med.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
					errCode = "AE00032";
					writeLog(ERROR, errCode, null, ERROR_NO + puchno);
					return 2;
				}
			}
		}
		// [発注残]."備品発注フラグ" = 1:備品発注 且つ　[受入実績取込]."在庫ロット番号"　≠ Null の場合
		if("1".equals(m_med.getNON_NO_ITEM_FLG())
				&& m_med.getTEMP_LOT_NO() != null 
				&& !"".equals(m_med.getTEMP_LOT_NO())){
			errCode = "AE20608";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		// [品目]."ロット管理フラグ" = 1(ロット管理を行う。) かつ [品目]．"ロット番号採番区分"＝ 0：手入力。 
		//かつ、[発注残]."作業計画番号" = Null かつ、[発注残]."備品発注フラグ" ≠ 1(備品発注)　かつ、[受入実績取込]."在庫ロット番号" が Nullの場合
		m_med.getM_ITEM().read();
		m_med.getM_ITEM().next();
		//[品目] .”在庫数単位区分”が整数管理で、「受入数」に小数点以下が存在する場合
		if ("1".equals(m_med.getUNIT_QTY_TYP()) && Calculate.isNumeric(struct.getACPT_QTY())){
			errCode = "AE00194";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		if("1".equals(m_med.getLOT_CTRL_FLG()) 
				&& "0".equals(m_med.getLOT_NUMBERING_TYP()) 
				&& (m_med.getWORK_ODR_CD() == null || "".equals(m_med.getWORK_ODR_CD()) )
				&& !"1".equals(m_med.getNON_NO_ITEM_FLG()) 
				&& (m_med.getTEMP_LOT_NO() == null || "".equals(m_med.getTEMP_LOT_NO()))
				&& Calculate.compare(struct.getACPT_QTY(), "0") > 0){
			errCode = "AE20600";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		
		// [受入実績取込].”在庫ロット番号”　≠ Nullで、[品目].”ロット管理フラグ” ≠ 1の場合
		if(null != m_med.getTEMP_LOT_NO() 
				&& !"".equals(m_med.getTEMP_LOT_NO()) 
				&& !"1".equals(m_med.getLOT_CTRL_FLG())){
			errCode = "AF20006";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		
		// [作業系列別仕掛]に読込
		m_med.getT_WORK_IN_PROC_BY_PROC().read();
		m_med.getT_WORK_IN_PROC_BY_PROC().next();
		// [発注残]."作業計画番号" ≠ Null かつ、[作業系列別仕掛]."最終系列フラグ" ≠ 1かつ、[受入実績取込]."在庫ロット番号"　≠ Null　の場合
		if(m_med.getWORK_ODR_CD() != null
				&& !"".equals(m_med.getWORK_ODR_CD()) 
				&& !"1".equals(m_med.getFINAL_PROC_FLG()) 
				&& m_med.getTEMP_LOT_NO() != null
				&& !"".equals(m_med.getTEMP_LOT_NO())){
			errCode = "AE20602";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		// [品目]."ロット管理フラグ" = 1(ロット管理を行う。) かつ [品目]．"ロット番号採番区分"＝ 0：手入力。
		//かつ、[発注残]."備品発注フラグ" ≠ 1(備品発注) かつ、[発注残]."作業計画番号" ≠ Null
		//かつ、[発注残]."作業計画番号"、"仕掛作業コード"で「作業系列別仕掛」を検索し、「作業系列別仕掛」."最終系列フラグ" = 1(最終系列)で、
		//[受入実績取込]."在庫ロット番号" が Null場合
		if("1".equals(m_med.getLOT_CTRL_FLG()) 
				&& "0".equals(m_med.getLOT_NUMBERING_TYP()) 
				&& !"1".equals(m_med.getNON_NO_ITEM_FLG()) 
				&& (null != m_med.getWORK_ODR_CD() || !"".equals(m_med.getWORK_ODR_CD())) 
				&& "1".equals(m_med.getFINAL_PROC_FLG()) 
				&& (null == m_med.getTEMP_LOT_NO() || "".equals(m_med.getTEMP_LOT_NO()))
				&& Calculate.compare(struct.getACPT_QTY(), "0") > 0){
			errCode = "AE20600";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		// [品目]."ロット管理フラグ" = 1(ロット管理を行う。) 
		//かつ [受入実績取込]."在庫ロット番号"　≠ Null[受入実績取込].”在庫ロット番号”と[発注残].”品目番号”で[ロット管理]を検索し、[ロット管理]に存在しない場合
		if("1".equals(m_med.getLOT_CTRL_FLG()) 
				&& null != m_med.getTEMP_LOT_NO() 
				&& !"".equals(m_med.getTEMP_LOT_NO()) 
				&& !"0".equals(m_med.getLOT_NUMBERING_TYP())){
			m_med.getT_LOT_CTRL().read();
			if(!m_med.getT_LOT_CTRL().next()){
				errCode = "AE22008";
				writeLog(ERROR, errCode, null, ERROR_NO + puchno);
				return 2;
			}
		}
		// [発注残].”発注日” ＞[受入実績取込].”受入日” の場合
		if(DateTool.compareYMD(m_med.getPUCH_ODR_SLIP_ISS_DATE(), m_med.getTEMP_ACPT_DATE())>0){
			errCode = "AE05006";
			writeLog(ERROR, errCode, null, ERROR_NO + puchno);
			return 2;
		}
		// 累計数を取得
		m_med.getT_ACPT_RSLT().read();
		m_med.getT_ACPT_RSLT().next();
		// 「受入数」＝0、「受入完了フラグ」=2：0完の場合は数量チェックをスキップ
		if(Calculate.compare(struct.getACPT_QTY(), "0") != 0 || !"2".equals(m_med.getTEMP_ACPT_RSLT_COMP())) {			
			// 「累計数」） ＞　「発注数」 の場合
			if(Calculate.compare(m_med.getALREADY_ACPT_QTY(), m_med.getPUCH_ODR_QTY())>0){
				errCode = "AE00178";
				writeLog(ERROR, errCode, null, ERROR_NO + puchno);
				return 2;
			}
			// [受入実績取込].”受入完了”　が 0：未完了かつ、（「受入数」＋「累計数」） ＞ 「発注数」 の場合
			String sumAcptQty = Calculate.add(m_med.getALREADY_ACPT_QTY(), struct.getACPT_QTY());
			if("false".equals(m_med.getCOMPLETE_FLG())){
				if(Calculate.compare(sumAcptQty, m_med.getPUCH_ODR_QTY()) > 0){
					writeLogFiles(WORNING, "AE00179");	
				}
			}
			
			if("true".equals(m_med.getCOMPLETE_FLG())){
				// [受入実績取込]."受入完了"　が 1：完了かつ、（「受入数」＋「累計数」） ＜ 「発注数」 の場合
				if(Calculate.compare(sumAcptQty, m_med.getPUCH_ODR_QTY()) < 0){
					writeLogFiles(WORNING, "AE00180");
				}
			}
		}
		// [受入実績取込]." 受入日" の年月 （YYYY/MM） ＜ 「業務運用日」 の年月 （YYYY/MM） 場合
		if(DateTool.compareYM(m_med.getTEMP_ACPT_DATE(), _businessOprDate)<0){
			writeLogFiles(WORNING, "AE00181");
		}
		// [受入実績取込]. "単価"」 ＜ （[受入実績取込]. "加工費" ＋ [受入実績取込]. "材料費"」 ＋[受入実績取込]. " その他経費"）の場合
		if(Calculate.compare(struct.getUNIT_COST(), Calculate.add(Calculate.add(struct.getPROCESSING_COST(), struct.getMATERIAL_COST()),struct.getOTHER_OVERHEADS()))<0){
			writeLogFiles(WORNING, "AE00182");
		}

		// パラメータ[実際原価の締めが完了している月の実績の登録／修正を可能とするか否かの区分]を取得
		PrivateConfig pc = new PrivateConfig(conn);
		String value = pc.getString("PAST_RESULT_ENTRY_TYP");
		// [実際原価管理パラメータ].“対象年月”を取得
		m_med.getSYS_ACTUAL_COST_CTRL_AC().read();
		m_med.getSYS_ACTUAL_COST_CTRL_AC().next();
		if(null != m_med.getPROC_EXEC_DATE() && m_med.getPROC_EXEC_DATE().length() >4){
			m_med.setPROC_EXEC_DATE(m_med.getPROC_EXEC_DATE().substring(0,4)+"/"+m_med.getPROC_EXEC_DATE().substring(4)) ;
		}
		if(value != null && "false".equalsIgnoreCase(value)){
			if(DateTool.compareYM(m_med.getTEMP_ACPT_DATE(),m_med.getPROC_EXEC_DATE())<0){
				errCode = "AE00160";
				writeLog(ERROR,errCode, null, ERROR_NO + puchno);
				return 2;
			}
		}
		// 子品目であるかつ保管区コードが保管区マスタに存在しない場合
		AE0060010Struct tempstruct = new AE0060010Struct();
		tempstruct.setPUCH_ODR_CD(m_med.getTEMP_PUCH_ODR_CD());
		List issueList = entity.mT_ISSUE_INST.read(conn, tempstruct);
		if (!issueList.isEmpty()){
			// ループチェック
			for (int i = 0; i < issueList.size(); i++ ) {
				AE0060010Struct issueStruct = (AE0060010Struct) issueList.get(i);
				// [出庫指示]."取引先"=[保管区マスタ]."保管区コード"の存在チェック
				tempstruct.setsetVEND_CD(issueStruct.getreadVEND_CD());
				tempstruct.setsetPLANT_CD(issueStruct.getreadPLANT_CD());
				List m_whList = entity.mreadM_WH.read(conn, tempstruct);
				// 支給先と一致する取引先保管が存在しない場合
				if (m_whList.isEmpty()) {
					// AE00068:支給先と一致する取引先保管区が存在しません。保管区コードの登録が必要です。
					errCode = "AE00068";
					writeLog(ERROR,errCode, null, ERROR_NO + puchno);
					// 処理を抜ける。
					return 2;
				}
			} // FOR END
		}
		return 0;
    }
    private boolean consInssue(String userId,String businessName,String plantCd,String puchno) throws FoundationException, SQLException{
    	String itemCdBak = struct.getITEM_CD();
		String vendlotno_bak = struct.getLOT_NO();
    	String itemQty = struct.getACPT_QTY();
    	double acptQty = Double.parseDouble(itemQty);
    	String lotNumberingTypBak = struct.geth_LOT_NUMBERING_TYP();
    	String lotControlFlgBak = struct.geth_LOT_CTRL_FLG();

		//支給品みなし出庫処理
		BigDecimal planSum     = new BigDecimal(0);			// 受入数
		BigDecimal denominator = new BigDecimal(0);			// 出庫指示単位数分子
		BigDecimal numerator   = new BigDecimal(0);			// 出庫指示単位数分母

		boolean mHantei = false ;							// 在庫数マイナス確認フラグ
		boolean lHantei = false ;							// 在庫数マイナス確認フラグ

		// [出庫指示]データを取得する。
		List issueInstList = entity.mT_ISSUE_INST.read(conn, struct);
		if (!issueInstList.isEmpty()){
			for (int i = 0; i < issueInstList.size(); i++ ) 
			{
				AE0060010Struct tempIssueStruct = (AE0060010Struct) issueInstList.get(i);
				// 使用予定数量の計算
				planSum = new BigDecimal(struct.getACPT_QTY());										// 受入数
				denominator = new BigDecimal(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// 出庫指示単位数分子
				numerator = new BigDecimal(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// 出庫指示単位数分母

				double beforeQty = 0;		// 更新前手持在庫数(初期化)
				double afterQty = 0;		// 更新後手持在庫数(初期化)
				double rcvissueQty = 0;		// 保管区別入出庫入出庫数(初期化)

				// 在庫数単位区分の判定
				if ("1".equals(tempIssueStruct.getreadUNIT_QTY_TYP()))
				{
					// [出庫指示]テーブルの出庫指示単位数分子・分母が0の場合
					// 計算式に組み込まない。
					// 1:整数管理
					if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
						"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
					{
						// 単位分母、分子が0の場合。
						planSum = planSum.setScale(0,BigDecimal.ROUND_UP);
					} else {
						planSum = planSum.multiply(numerator).divide(denominator,0,BigDecimal.ROUND_UP).setScale(1);
					}
				} else {
					// [出庫指示]テーブルの出庫指示単位数分子・分母が0の場合
					// 計算式に組み込まない。
					// 2:小数管理
					if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
						"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
					{
						planSum = planSum.setScale(4,BigDecimal.ROUND_HALF_UP);
					} else {
						// 小数第5位を四捨五入
						planSum = planSum.multiply(numerator).divide(denominator,4,BigDecimal.ROUND_HALF_UP);
					}
				}

				//支給品テーブルの主キーが存在する場合の対応(品目構成に擬似品目があり、同じ品目をみなし出庫する場合)
				String parentITEM_CD = struct.getITEM_CD();
				//struct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
				//struct.setACPT_NO(struct.getACPT_NO());
				struct.setITEM_CD(tempIssueStruct.getreadITEM_CD());
				List PartSuppliedIssueList = entity.mreadT_PART_SUPPLIED_ISSUE.read(conn, struct);
				if(PartSuppliedIssueList.isEmpty()){
					//支給品使用テーブルに同一主キーが存在しない場合
					if(parentITEM_CD != null && !"".equals(parentITEM_CD.trim())){
						String subITEM_CD = tempIssueStruct.getreadITEM_CD();
						// 製品構成リポジトリ作成
                        ProductStructureRepository repository = new ProductStructureRepository(conn);
				        if(checkReverseRooping(repository, subITEM_CD, parentITEM_CD)){
				        	errCode = "AE20607";
				        	writeLog(ERROR, errCode, null, ERROR_NO + puchno);
            				conn.rollback();
            				return false;
                        }
					}
					
					// 1支給品使用テーブル(T_PART_SUPPLIED_ISSUE)の登録処理
					struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());												// 発注番号
					struct.setsetACPT_NO(struct.getACPT_NO());														// 受入回数
					struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());											// 支給品品目番号
					struct.setsetACPT_QTY(struct.getACPT_QTY());													// 受入数
					struct.setsetCOMPANY_CD(tempIssueStruct.getreadCOMPANY_CD());									// 会社コード
					struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());											// 取引先コード
					struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());									// 製番
					struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());						// 製番枝番
					struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());										// 工場コード
					struct.setsetISSUE_INST_CD(tempIssueStruct.getreadISSUE_INST_CD());								// 出庫指示番号
					struct.setsetMRP_ODR_TYP(tempIssueStruct.getreadMRP_ODR_TYP());									// 品目手配区分
					struct.setsetSUPPLIED_ISSUE_GNR_TYP("1");														// 処理区分(1:みなし出庫)
					struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf(planSum));										// 使用予定数量
					struct.setsetTOTAL_ISSUE_QTY(String.valueOf(planSum));											// 使用済数量
					struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// 支給品使用単位数分母
					struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// 支給品使用単位数分子
					struct.setsetSUPPLIED_DATE(struct.getACPT_DATE());												// 使用日
					struct.setsetPART_SUPPLIED_COMMENT(null);														// 支給品使用備考
					entity.mT_PART_SUPPLIED_ISSUE.create(conn, struct);
				}else{
					///支給品使用テーブルに同一主キーが存在する場合
					AE0060010Struct tempSuppliedStruct = (AE0060010Struct) PartSuppliedIssueList.get(0);
					BigDecimal Denominator = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_UNIT_DENOMINATOR());	// 検索した支給品使用単位数分母
					BigDecimal Numerator   = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_UNIT_NUMERATOR());		// 検索した支給品使用単位数分子
					BigDecimal newDenominator = new BigDecimal(0); //計算後の支給品使用単位数分母
					BigDecimal newNumerator = new BigDecimal(0);  //計算後の支給品使用単位数分子
					BigDecimal gcd = new BigDecimal(0); //分母同士の最大公約数
					
					//支給品使用単位数分母・分子の計算を行う
					if ("1".equals(tempIssueStruct.getreadUNIT_QTY_TYP()))
					{
						// [出庫指示]テーブルの出庫指示単位数分子・分母が0の場合
						// 値を変更しない。
						// 1:整数管理
						if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
							"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
						{
							// 単位分母、分子が0の場合。
							struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// 支給品使用単位数分母
							struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// 支給品使用単位数分子
						} else {
							gcd = getgcd(Denominator,denominator);//分母同士の最小公倍数を更新する分母とする 
							newDenominator = Denominator.multiply(denominator).divide(gcd,0,BigDecimal.ROUND_UP); //分母（最小公倍数）
							newNumerator = Numerator.multiply(newDenominator).divide(Denominator,0,BigDecimal.ROUND_UP).add(numerator.multiply(newDenominator).divide(denominator,0,BigDecimal.ROUND_UP));//分子の計算
							//分母同士の最小公倍数を更新する分母とする
							struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));
							struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));
						}
					} else {
						// [出庫指示]テーブルの出庫指示単位数分子・分母が0の場合
						// 値を変更しない。
						// 2:小数管理
						if ("0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR()) || 
							"0".equals(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR()))
						{
							struct.setsetSUPPLIED_UNIT_DENOMINATOR(tempIssueStruct.getreadISSUE_INST_UNIT_DENOMINATOR());	// 支給品使用単位数分母
							struct.setsetSUPPLIED_UNIT_NUMERATOR(tempIssueStruct.getreadISSUE_INST_UNIT_NUMERATOR());		// 支給品使用単位数分子
						} else {
							// 小数第5位を四捨五入
							if(Denominator.compareTo(denominator) >= 0){ //大きいほうの分母を分母として更新する
								newDenominator = Denominator;
								newNumerator = Numerator.add((numerator.multiply(Denominator)).divide(denominator,4,BigDecimal.ROUND_UP));
							}else{
								newDenominator = denominator;
								newNumerator = numerator.add((Numerator.multiply(denominator)).divide(Denominator,4,BigDecimal.ROUND_UP))/*.setScale(4,BigDecimal.ROUND_HALF_UP))*/;
							}//大きいほうの分母を分母として更新する
							struct.setsetSUPPLIED_UNIT_DENOMINATOR(String.valueOf(newDenominator));
							struct.setsetSUPPLIED_UNIT_NUMERATOR(String.valueOf(newNumerator));
						}
					}
					BigDecimal SuppliedIssueQty = new BigDecimal(tempSuppliedStruct.getreadSUPPLIED_ISSUE_QTY());	// 検索した使用予定数量
					struct.setsetSUPPLIED_ISSUE_QTY(String.valueOf((SuppliedIssueQty).add(planSum)));				// 使用予定数量
					struct.setsetTOTAL_ISSUE_QTY(String.valueOf((SuppliedIssueQty).add(planSum)));					// 使用済数量

					if(newDenominator.compareTo(Decival) > 0 ||
						newNumerator.compareTo(Decival) > 0 ||
						SuppliedIssueQty.compareTo(Decival) > 0){//登録する数値が桁あふれが起こる場合
						errCode = "ZZ05109";
						writeLog(ERROR, errCode, null, ERROR_NO + puchno);
						return false;
					}//登録する桁数チェック 
					entity.mupdateT_PART_SUPPLIED_ISSUE.update(conn, struct);
				}
			    if(lotNoList != null){
                    lotNoList.clear();
                }
				//ロット管理導入済、ロット管理を行う
				if("1".equals(tempIssueStruct.getreadLOT_CONTROL_FLG())){
                    AE0060010Struct chkStruct = new AE0060010Struct();
                    chkStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());           //発注番号
                    chkStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());      //品目番号
                    chkStruct.setACPT_NO(struct.getACPT_NO());                   //受入回数
                    //出庫実績明細に存在チェック
                    if(entity.mcheckT_LOT_ISSUE_INST.check(conn, chkStruct)){
                	    AE0060010Struct tmpStruct = new AE0060010Struct();
                	    tmpStruct.setACPT_NO(struct.getACPT_NO());               //受入回数
                	    tmpStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());       //発注番号
                	    tmpStruct.setITEM_CD(tempIssueStruct.getreadITEM_CD());  //品目番号
                	    tmpStruct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());    //発注番号
                	    tmpStruct.setsetACPT_NO(struct.getACPT_NO());            //受入回数
                	    tmpStruct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());//品目番号
                    	//[支給品使用]の読込
                	    List tmpList = entity.mSelectT_PART_SUPPLIED_ISSUE.read(conn, tmpStruct);
                	    if(tmpList != null && tmpList.size() > 0){
                		    AE0060010Struct tpsiStruct = (AE0060010Struct)tmpList.get(0);
                		    tmpStruct.setVEND_CD(tpsiStruct.getreadVEND_CD());                //取引先コード
            		        tmpStruct.setPLANT_CD(tpsiStruct.getreadPLANT_CD());              //工場コード
            		        tmpStruct.setISSUE_INST_CD(tpsiStruct.getreadISSUE_INST_CD());    //出庫指示番号
            		        tmpStruct.setsetISSUE_INST_CD(tpsiStruct.getreadISSUE_INST_CD()); //出庫指示番号
            		        tmpStruct.setsetSUPPLIED_DATE(tpsiStruct.getreadSUPPLIED_DATE()); //使用日
            		        //[ロット別使用実績]の追加
            		        if(!insertT_LOT_USE_RSLT(tmpStruct,puchno)){
            		        	return false;
            		        }
                	    }else{
                	    	//支給品目に対する出庫実績明細またはロット管理マスタが存在しません。
                	    	errCode = "AE20609";
                	    	writeLog(ERROR, errCode, null, ERROR_NO + puchno);
						    conn.rollback();
						    return false;
                	    }
                    }else{
                    	//支給品目に対する出庫実績明細またはロット管理マスタが存在しません。
                    	errCode = "AE20609";
                    	writeLog(ERROR, "AE20609", null, ERROR_NO + puchno);
					    conn.rollback();
					    return false;
                    }
                }
				// ②保管区別品目在庫(T_ITEM_STOCK)、保管区別製番在庫(T_JOB_ODR_CD_STOCK)の登録・更新処理
				// 品目手配区分による更新対象の変更
				// MRP管理品  4:ﾏﾆｭｱﾙ手配品目、5:ﾛｯﾄ手配品目、6:定量手配品目、7:発注点手配品目
				// 製番管理品 1:製番、2 :在庫引当型製番

				// 保管区コード取得
				struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());                       //取引先コード
				struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());                     //工場コード
				List mWhList = entity.mreadM_WH.read(conn, struct);
				AE0060010Struct tempWhStruct = (AE0060010Struct) mWhList.get(0);

				if (("4".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("5".equals(tempIssueStruct.getreadMRP_ODR_TYP())) ||
				   ("6".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("7".equals(tempIssueStruct.getreadMRP_ODR_TYP())))
				{
					// MRP管理品(保管区別品目在庫対象)
					// 保管区別品目在庫チェック
					struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());
					List itemStList = entity.mreadT_ITEM_STOCK.read(conn, struct);

					// 更新チェック
					if (itemStList.isEmpty()) 
					{
						// 保管区別品目在庫登録
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 01.品目番号
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 02.保管区コード
						struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());						// 03.工場コード
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(planSum.doubleValue() * -1));		// 04.品目別手持在庫数
						entity.minsertT_ITEM_STOCK.create(conn, struct);

						// 更新前手持在庫数セット
						beforeQty = 0;								// 更新前
						afterQty = planSum.doubleValue() * -1;		// 更新後
						rcvissueQty = planSum.doubleValue() * -1;	// 入出庫数
						// 判定フラグに"true"(マイナスデータ)セット
						mHantei = true;
					} else {
						AE0060010Struct tempItemStStruct = (AE0060010Struct) itemStList.get(0);
						// 保管区別品目在庫更新
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue()));						// 01.品目別手持在庫数
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 条件.品目番号
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 条件.保管区コード
						entity.mupdateT_ITEM_STOCK.update(conn, struct);

						// 更新前手持在庫数セット
						beforeQty = Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY());	// 更新前
						afterQty = Double.parseDouble(tempItemStStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue();						// 更新後
						rcvissueQty = planSum.doubleValue() * -1;										// 入出庫数
						// 在庫数のマイナスチェック
						if (afterQty < 0 && lHantei == false)
						{
							// 判定フラグに"true"(マイナスデータ)セット
							mHantei = true;
							lHantei = true; 
						}
					}
				} else if (("1".equals(tempIssueStruct.getreadMRP_ODR_TYP())) || ("2".equals(tempIssueStruct.getreadMRP_ODR_TYP()))) {
					// 製番管理品(保管区別製番在庫対象)
					// 保管区別製番在庫チェック
					struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());						// 製番
					struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());			// 製番枝番
					struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());								// 品目番号
					struct.setsetWH_CD(tempWhStruct.getreadWH_CD());									// 保管区コード
					List itemJobList = entity.mreadT_JOB_ODR_CD_STOCK.read(conn, struct);

					// 更新チェック
					if (itemJobList.isEmpty()) 
					{
						// 保管区別製番在庫登録
						struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());					// 01.製番
						struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());		// 02.製番枝番
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 03.品目番号
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 04.保管区コード
						struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());						// 05.工場コード
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(planSum.doubleValue() * -1));		// 06.製番別手持在庫数
						entity.minsertT_JOB_ODR_CD_STOCK.create(conn, struct);
						// 更新前手持在庫数セット
						beforeQty = 0;								// 更新前
						afterQty = planSum.doubleValue() * -1;		// 更新後
						rcvissueQty = planSum.doubleValue() * -1;	// 入出庫数
						// 判定フラグに"true"(マイナスデータ)セット
						mHantei = true;
					} else {
						AE0060010Struct tempJobStruct = (AE0060010Struct) itemJobList.get(0);
						// 保管区別製番在庫更新
						struct.setsetSTOCK_ON_HAND_QTY(String.valueOf(Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue()));						// 01.製番別手持在庫数
						struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());					// 条件.製番
						struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());		// 条件.製番枝番
						struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());							// 条件.品目番号
						struct.setsetWH_CD(tempWhStruct.getreadWH_CD());								// 条件.保管区コード
						entity.mupdateT_JOB_ODR_CD_STOCK.update(conn, struct);
						// 更新前手持在庫数セット
						beforeQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY());		// 更新前
						afterQty = Double.parseDouble(tempJobStruct.getreadSTOCK_ON_HAND_QTY()) 
														- planSum.doubleValue();						// 更新後
						rcvissueQty = planSum.doubleValue() * -1;										// 入出庫数
						// 在庫数のマイナスチェック
						if (afterQty < 0 && lHantei == false)
						{
							// 判定フラグに"true"(マイナスデータ)セット
							mHantei = true;
							lHantei = true; 
						}
					}
				} // END IF保管区別品目在庫、保管区別製番在庫の登録・更新処理

				// ③保管区別入出庫(T_RCV_ISSUE)の登録処理
				// 入出庫番号採番, 
				Numbering collectNum = new Numbering(conn,
						CollectNumber.ISSUE_CD,
						userId,
						businessName,
						plantCd);
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) 
				{
					//採番結果がない
					errCode = "ZZ01106";
					writeLog(ERROR, errCode, null, ERROR_NO + puchno);
					return false;
				}
				struct.setsetRCV_ISSUE_CTRL_CD(no);														// 01.入出庫管理番号
				struct.setsetRCV_ISSUE_TYP("2");														// 02.入出庫区分(2:固定)
				struct.setsetITEM_CD(tempIssueStruct.getreadITEM_CD());									// 03.品目番号
				struct.setsetPLANT_CD(tempIssueStruct.getreadPLANT_CD());								// 04.工場コード
				struct.setsetWH_CD(tempWhStruct.getreadWH_CD());										// 05.保管区コード

				// 品目手配区分による更新値変更
				if (("1".equals(tempIssueStruct.getreadMRP_ODR_TYP())) ||
				    ("2".equals(tempIssueStruct.getreadMRP_ODR_TYP()))) 
				{
					struct.setsetJOB_ODR_CD(tempIssueStruct.getreadJOB_ODR_CD());						// 06.製番
					struct.setsetJOB_ODR_DETAIL_NO(tempIssueStruct.getreadJOB_ODR_DETAIL_NO());			// 07.製番枝番
				}
				struct.setsetPUCH_ODR_CD(struct.getPUCH_ODR_CD());										// 08.発注番号
				struct.setsetACPT_NO(struct.getACPT_NO());												// 09.受入回数
				struct.setsetACPT_RSLT_CRCT_NO("0");													// 10.受入実績訂正回数(0:固定)
				struct.setsetINSPEC_RSLT_CRCT_NO("0");													// 11.検査実績訂正回数(0:固定)
				struct.setsetWORK_ODR_CD(null);															// 12.作業計画番号(null)
				struct.setWORK_IN_PROC_CD(null);														// 13.仕掛作業コード(null)
				struct.setsetPARTIAL_PRD_NO("0");														// 14.分作回数(0:固定)
				struct.setsetOPR_RSLT_CRCT_NO("0");														// 15.作業実績訂正回数(0:固定)
				struct.setsetISSUE_INST_CD(tempIssueStruct.getreadISSUE_INST_CD());						// 16.出庫指示番号
				struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.入出庫前在庫数
				struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.入出庫数
				struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.入出庫後在庫数
				struct.setsetRCV_ISSUE_AMOUNT("0");														// 20.入出庫金額(0:固定)
				struct.setsetRCV_ISSUE_DATE(struct.getACPT_DATE());										// 21.入出庫年月日
				struct.setsetRCV_ISSUE_GNR_TYP("71");													// 22.入出庫発生区分(71:固定)
				struct.setsetRCV_ISSUE_ODD_QTY("0");													// 23.入出庫端数(0:固定)
				struct.setsetDEFECT_CAUSE_CD(null);														// 24.入出庫不良理由コード
				struct.setsetSTOCK_UPD_TYP("2");														// 25.在庫更新区分(2:固定)
				struct.setsetRCV_ISSUE_CMPLT_FLG("0");													// 26.入出庫完了フラグ
				struct.setsetOD_NO(tempIssueStruct.getreadOD_NO());										// 27.オーダデマンド番号
				struct.setsetVEND_LOT_NO(struct.getVEND_LOT_NO());										// 28.メーカロット番号
				struct.setsetRCV_ISSUE_COMMENT(null);													// 30.入出庫備考(null)
				struct.setsetCOMPANY_CD(tempIssueStruct.getreadCOMPANY_CD());							// 31.会社コード
				struct.setsetVEND_CD(tempIssueStruct.getreadVEND_CD());									// 32.取引先コード
				struct.setsetCONS_TYP(tempIssueStruct.getreadCONS_TYP());								// 33.支給区分
				struct.setsetCONS_EXEC_DATE(null);														// 34.有償支給実績抽出日
				
				if(lotNoList != null && lotNoList.size() > 0){
				    for(int l=0; l<lotNoList.size(); l++){
					    if(l > 0){
						    no = null;
						    Numbering collectNum1 = new Numbering(conn,
					    			CollectNumber.ISSUE_CD,
					    			userId,
					    			businessName,
					    			plantCd);
				            no = collectNum1.getNo();
				            if (no == null || no.length() == 0) 
				            {
				                //採番結果がない
				            	errCode = "ZZ01106";
				            	writeLog(ERROR, "ZZ01106", null, ERROR_NO + puchno);
							    conn.rollback();
							    return false;
				            }
				            beforeQty = afterQty;
				        }
				        struct.setsetRCV_ISSUE_CTRL_CD(no);
				        struct.setsetLOT_NO((String)lotNoList.get(l));                                          // 29.在庫ロット番号
				        rcvissueQty = getDoubleValue((String)lotNoList.get(l+1)) * -1;
				        afterQty = beforeQty + rcvissueQty;
				        struct.setsetRCV_ISSUE_BEFORE_QTY(String.valueOf(beforeQty));							// 17.入出庫前在庫数
				        struct.setsetRCV_ISSUE_QTY(String.valueOf(rcvissueQty));								// 18.入出庫数
				        struct.setsetRCV_ISSUE_AFTER_QTY(String.valueOf(afterQty));								// 19.入出庫後在庫数
				        entity.minsertT_RCV_ISSUE.create(conn, struct);
					    //ロット別品目在庫登録．更新
				        BizCommon bc = new BizCommon(conn, userId,businessName,plantCd);
				        List updateLotStockList = bc.excUpdateLotStockFd(no, "");
         
				        if(bc.getResultStatus().intValue() == 1){
				        }else{
				            if(updateLotStockList != null && updateLotStockList.size() > 0){
				            	errCode = (String)updateLotStockList.get(0);
				            	writeLog(ERROR, (String)updateLotStockList.get(0), null, ERROR_NO + puchno);
							    conn.rollback();
							    return false;
				            }else{
				            	errCode = "ZZ22001";
				            	writeLog(ERROR, errCode, null, ERROR_NO + puchno);
							    conn.rollback();
							    return false;
				            }
				        }
				        //ロットトレース追加
				        if("1".equals(lotControlFlgBak)){
				        	if(acptQty != 0 && vendlotno_bak != null){
				        		  List lotTraceList = bc.excMakeLotTraceFd(tempIssueStruct.getreadITEM_CD(),       //[ロット別使用実績].”支給品目番号”
		                                   								   (String)lotNoList.get(l),               //[ロット別使用実績].”在庫ロット番号”
		                                   								   itemCdBak,                              //”発注番号”で検索した[発注残]．”品目番号”
				        				                                   vendlotno_bak,                          //[受入実績].”在庫ロット番号”
				        				                                   "1");                                   //1:受入
						            if(bc.getResultStatus().intValue() != 1){
						                if(lotTraceList != null && lotTraceList.size() > 0){
						                    errCode = (String)lotTraceList.get(0);
						                    writeLog(ERROR, errCode, null, ERROR_NO + puchno);
										    conn.rollback();
										    return false;
						                }else{
						                	errCode = "ZZ22016";
						                	writeLog(ERROR, errCode, null, ERROR_NO + puchno);
										    conn.rollback();
										    return false;
						                } 
						            } else {
						            	struct.setFROM_ITEM_CD(tempIssueStruct.getreadITEM_CD());
						            	struct.setFROM_LOT_NO((String)lotNoList.get(l));
						            	struct.setTO_ITEM_CD(itemCdBak);
						            	struct.setTO_LOT_NO(vendlotno_bak);
						            	struct.setTO_PUCH_ODR_CD(struct.getPUCH_ODR_CD());
						            	//[受入実績]で発注番号を取得
						            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, struct);
						            	if((formList != null && formList.size() > 0)){
						            		//発注番号をソート順（降順）にし、１件目のレコードを取得する。
							            	AE0060010Struct orderStruct = (AE0060010Struct) formList.get(0);
							            	//[ロットトレース].“元発注番号” = [受入実績]."発注番号"
							            	struct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
						            	}else{
						            		struct.setFROM_PUCH_ODR_CD("");
						            	}
						            	// ［ロットトレース］の更新を行う
						            	entity.mupdateT_LOT_TRACE.update(conn, struct);	
					            }
				        	}
				        }
				        l = l+1;
				    }
				}else{
					//在庫ロット番号
					struct.setsetLOT_NO(null);
				    //保管区別入出庫を追加
					entity.minsertT_RCV_ISSUE.create(conn, struct);
				}
			} // END FOR
		}
		if (mHantei == true ){ 
			// AE00069:支給品みなし出庫で取引先保管区の品目または
			// 製番手持在庫数が一部マイナスとなりました。
			writeLogFiles(WORNING,"AE00069");
		}

		// [ロット管理]の更新
        if(vendlotno_bak != null && !"".equals(vendlotno_bak)){
            AE0060010Struct setStructForTlot = new AE0060010Struct();
            setStructForTlot.setsetLOT_NO(vendlotno_bak);               //在庫ロット番号
            setStructForTlot.setsetITEM_CD(itemCdBak);        //品目番号
            setStructForTlot.setsUser_ID(userId);
            entity.mupdateT_LOT_CTRL.update(conn, setStructForTlot);    //[ロット管理]の更新
        }
        // 他製番により引当済みの場合に、引当済出庫残数未満の在庫数となる実績数で完了した場合
        if(StringUtil.Validate(struct.getJOB_ODR_CD()) &&
				"true".equals(struct.getc_COMPLETE())){
			// 引当済出庫残数＞製番在庫（手持在庫）の場合
			// ｢全受入完了｣がチェックされている時にチェック
			if(!(new IssueRemain(conn)).isEnoughAlcdQty(plantCd,
					struct.getITEM_CD(), struct.getJOB_ODR_CD(),
					0)){
				writeLogFiles(WORNING, "AE00080");
			}
		}
        
		return true;
    }
    /**
     *structに変数を置きました
     */
    private void copyMedToStruct() throws FoundationException, SQLException{
    	struct.setPUCH_ODR_CD(m_med.getTEMP_PUCH_ODR_CD());                            // 発注番号
    	struct.setITEM_CD(m_med.getTEMP_ITEM_CD());                                    // 品目番号
    	struct.setACPT_DATE(m_med.getTEMP_ACPT_DATE());                                // 受入日
    	//struct.setACPT_QTY(m_med.getTEMP_ACPT_QTY());                                  // 受入数
    	struct.setLOT_NO(m_med.getTEMP_LOT_NO());                                      // 在庫ロット番号
    	struct.setVEND_LOT_NO(m_med.getTEMP_VEND_LOT_NO());                            // メーカロット番号
    	struct.setDLV_CD(m_med.getTEMP_DLV_CD());                                      // 納品書番号
    	struct.setACPT_RSLT_COMMENT(m_med.getTEMP_ACPT_RSLT_COMMENT());                // 受入実績備考
    	struct.setACPT_INSPC_TYP(m_med.getACPT_INSPC_TYP());						   // 受入検査区分
    	struct.setTAX_RATE_1(m_med.getTAX_RATE_1());								   // 税率1
    	struct.setTAX_RATE_2(m_med.getTAX_RATE_2());								   // 税率2
    	struct.setTAX_RATE_3(m_med.getTAX_RATE_3());								   // 税率3
    	//受入データを読込
    	AE0060010Struct tempStruct = new AE0060010Struct();
    	tempStruct.setPUCH_ODR_CD(struct.getPUCH_ODR_CD());
    	tempStruct.setACPT_NO("1");
    	
    	//受入実績存在チェック
		List acptList = entity.mT_ACPT_RSLT.read(conn, tempStruct);
		List tempList = null;
		if (acptList.isEmpty()){
			tempList = entity.mFormFirst.read(conn, tempStruct);
		} else {
			tempList = entity.mFormAfter.read(conn, tempStruct);
		}
    	tempStruct = (AE0060010Struct) tempList.get(0);
    	if ("0".equals(tempStruct.getNON_NO_ITEM_FLG())){
    		struct.setITEM_NAME(null);                                                 //品目番号
    	} else {
        	struct.setITEM_NAME(tempStruct.getNON_NO_ITEM_NAME());                     // 備品品目名	
    	}
    	// 受入数
    	if (m_med.getTEMP_ACPT_QTY() != null && !"".equals(m_med.getTEMP_ACPT_QTY())){
    		struct.setACPT_QTY(m_med.getTEMP_ACPT_QTY());
    	} else {
    		struct.setACPT_QTY(tempStruct.getACPT_QTY());
    	}
    	// 受入場所
    	if (m_med.getTEMP_WH_CD() != null && !"".equals(m_med.getTEMP_WH_CD())){
        	struct.setWH_CD(m_med.getTEMP_WH_CD());
    	} else {
    		m_med.setTEMP_WH_CD(tempStruct.getWH_CD());
    		struct.setWH_CD(tempStruct.getWH_CD());
    	}
        // 単価区分
    	if (m_med.getTEMP_UNIT_COST_TYP() != null && !"".equals(m_med.getTEMP_UNIT_COST_TYP())){
    		struct.setUNIT_COST_TYP(m_med.getTEMP_UNIT_COST_TYP());
    	} else {
    		struct.setUNIT_COST_TYP(tempStruct.getUNIT_COST_TYP());
    	}
    	// 単価
    	if (m_med.getTEMP_UNIT_COST() != null && !"".equals(m_med.getTEMP_UNIT_COST())){
    		struct.setUNIT_COST(m_med.getTEMP_UNIT_COST());
    	} else {
    		struct.setUNIT_COST(tempStruct.getUNIT_COST());
    	}
    	//加工費
    	if (m_med.getTEMP_PROCESSING_COST() != null && !"".equals(m_med.getTEMP_PROCESSING_COST())){
    		struct.setPROCESSING_COST(m_med.getTEMP_PROCESSING_COST());
    	} else {
    		struct.setPROCESSING_COST(tempStruct.getPROCESSING_COST());
    	}
    	// 材料費
    	if (m_med.getTEMP_MATERIAL_COST() != null && !"".equals(m_med.getTEMP_MATERIAL_COST())){
    		struct.setMATERIAL_COST(m_med.getTEMP_MATERIAL_COST());
    	} else {
    		struct.setMATERIAL_COST(tempStruct.getMATERIAL_COST());
    	}
    	// その他経費
    	if (m_med.getTEMP_OTHER_OVERHEADS() != null && !"".equals(m_med.getTEMP_OTHER_OVERHEADS())){
    		struct.setOTHER_OVERHEADS(m_med.getTEMP_OTHER_OVERHEADS());
    	} else {
    		struct.setOTHER_OVERHEADS(tempStruct.getOTHER_OVERHEADS());
    	}
    	// 値引金額
    	if (m_med.getTEMP_DISC_AMOUNT() != null && !"".equals(m_med.getTEMP_DISC_AMOUNT())){
    		struct.setDISC_AMOUNT(m_med.getTEMP_DISC_AMOUNT());
    	} else {
    		struct.setDISC_AMOUNT(tempStruct.getDISC_AMOUNT());
    	}
    	//為替レート
    	if (m_med.getTEMP_EXCH_RATE() != null && !"".equals(m_med.getTEMP_EXCH_RATE())){
    		struct.setEXCH_RATE(m_med.getTEMP_EXCH_RATE());
    	} else {
    		struct.setEXCH_RATE(tempStruct.getEXCH_RATE());
    	}
    	struct.setROUND_TYP(tempStruct.getROUND_TYP());								   // 発注金額まるめ区分
        struct.setTAX_ROUND_TYP(tempStruct.getTAX_ROUND_TYP());                        // 税端数区分
    	struct.setVEND_DECIMAL_FIG(tempStruct.getVEND_DECIMAL_FIG());                  // [通貨].”小数点桁数” 
    	struct.seth_LOT_NUMBERING_TYP(tempStruct.geth_LOT_NUMBERING_TYP());            // ロット番号採番区分
    	struct.seth_LOT_CTRL_FLG(tempStruct.geth_LOT_CTRL_FLG());					   // ロット管理フラグ
    	struct.setNON_NO_ITEM_FLG(tempStruct.getNON_NO_ITEM_FLG());					   // 備品発注フラグ
    	struct.setPLANT_CD(tempStruct.getPLANT_CD());                                  // 工場コード
    	struct.setACPT_NO(tempStruct.getACPT_NO());                                    // 受入回数
    	struct.setINSPC_WH_CD(m_med.getWH_CD());                                       // 検査待ち保管区
        struct.setTAX_CD(tempStruct.getTAX_CD());                                      // 税コード
    	struct.setJOB_ODR_CD(tempStruct.getJOB_ODR_CD());                              // 製番
    	struct.setDRAW_CD(tempStruct.getDRAW_CD());                                    // 図面番号
    	struct.setSPEC(tempStruct.getSPEC());										   // 企画
    	struct.setUNIT_QTY_TYP(tempStruct.getUNIT_QTY_TYP());                          // 在庫数単位区分
    	struct.setPUCH_ODR_QTY(tempStruct.getPUCH_ODR_QTY());                          // 発注数
    	struct.setSUM_ACPT_QTY(tempStruct.getSUM_ACPT_QTY());                          // 受入累計数
    	struct.setPUCH_ODR_SLIP_ISS_DATE(tempStruct.getPUCH_ODR_SLIP_ISS_DATE());      // 発注日
    	struct.setPUCH_ODR_DLV_DATE(tempStruct.getPUCH_ODR_DLV_DATE());                // 発注納期
    	struct.setCONFIRM_DLV_DATE(tempStruct.getCONFIRM_DLV_DATE());                  // 取引先回答納期
    	struct.setWORK_IN_PROC_CD(tempStruct.getWORK_IN_PROC_CD());                    // 作業コード
    	struct.setPROC_NAME(tempStruct.getPROC_NAME());                                // 作業名
    	struct.setPUCH_ODR_PERSON(tempStruct.getPUCH_ODR_PERSON());                    // 発注担当者コード
    	struct.setPUCH_ODR_STS_TYP(tempStruct.getPUCH_ODR_STS_TYP());                  // 発注状態区分
    	struct.setINSPC_CMPLT_FLG(tempStruct.getINSPC_CMPLT_FLG());                    // 検査完了フラグ
    	struct.setSPL_ITEM_TYP(tempStruct.getSPL_ITEM_TYP());                          // 受給品区分
    	struct.setPRODUCT_TYP(tempStruct.getPRODUCT_TYP());                            // 製品区分
    	struct.setCOMPANY_CD(tempStruct.getCOMPANY_CD());                              // 会社コード
    	struct.setPUCH_ODR_START_DATE(tempStruct.getPUCH_ODR_START_DATE());            // 発注着手日
    	struct.setPUCH_ODR_MODIFY_COUNT(tempStruct.getPUCH_ODR_MODIFY_COUNT());        // 更新数
    	struct.setPUCH_ODR_COMMENT(tempStruct.getPUCH_ODR_COMMENT());                  // 発注備考
    	struct.seth_WORK_ODR_CD(tempStruct.geth_WORK_ODR_CD());                        // 作業計画番号
    	struct.seth_FINAL_PROC_CD(tempStruct.geth_FINAL_PROC_CD());                    // 最終系列フラグ
    }
    /**
     * ルーピングチェック。逆展開を行い同品目番号が存在 有無
     * @param repository 製品構成リポジトリ
     * @param checkItem 対象品目番号
     * @param item 比較する品目番号
     * @return true:有  false:無
    */
    private boolean checkReverseRooping(ProductStructureRepository repository, 
                   String targetItem, String item)
         throws SQLException
    {
        // 親品目番号一覧取得
        ArrayList itemList = repository.reverseDeployment(item);
        checkItemList(itemList);

        for(int i = 0; i < itemList.size(); i++){
            if(targetItem.equals((String)itemList.get(i)) == false){
                // 親品目番号一覧から更に上の親品目取得
                boolean result = checkReverseRooping(repository, 
                                       targetItem, (String)itemList.get(i));
                if(result == true){
                    return true;
                }
            }else{
                return true;
            }
        }
        return false;
    }
    /** 重複チェック
     * @param itemList 重複チェックする品目リスト
    */
    private void checkItemList(ArrayList itemList){
        List workList = new ArrayList(0);
        for(int i = 0; i < itemList.size(); i++){
            boolean result =true;
            String item_cd = (String)itemList.get(i);
            for(int t = 0; t < workList.size(); t++){
                if(item_cd.equals((String)workList.get(t)) == true){
                    result = false;
                }
            }
            if(result == true){
                workList.add(item_cd);
            }
        }

        itemList.clear();
        for(int i = 0; i < workList.size(); i++){
            itemList.add(workList.get(i));
        }
    }
    /**
	 * 分母の最大公約数を求める処理
	 * @param Bigvala
	 */
	public BigDecimal getgcd(BigDecimal Bigvala,BigDecimal Bigvalb)
	{
		BigInteger gcdval = new BigInteger("0");
		gcdval = Bigvala.toBigInteger().gcd(Bigvalb.toBigInteger()); 
		return new BigDecimal(gcdval);
	}
	/**
     * [ロット別使用実績]の追加,[出庫実績明細]の更新
     */
    private boolean insertT_LOT_USE_RSLT(AE0060010Struct s, String puchno) throws FoundationException,SQLException{  
    	try{
    	    String vendCd = s.getVEND_CD();                  //取引先コード
    	    String plantCd = s.getPLANT_CD();                //工場コード
    	    String issueInstCd = s.getsetISSUE_INST_CD();    //出庫指示番号
    	    String puchOdrCd = s.getsetPUCH_ODR_CD();        //発注番号
    	    String acptNo = s.getsetACPT_NO();               //受入回数
    	    String itemCd = s.getsetITEM_CD();               //品目番号
    	    String suppliedDate = s.getsetSUPPLIED_DATE();   //使用日
    	
    	    List qtyList = entity.mSelectQty.read(conn, s);
    	
    	    if(qtyList != null && qtyList.size() > 0){
    		    String supplied_issue_qty = ((AE0060010Struct)qtyList.get(0)).getreadSUPPLIED_ISSUE_QTY();  //[支給品使用].”使用予定数量”
                AE0060010Struct whcdStruct = new AE0060010Struct();
                whcdStruct.setVEND_CD(vendCd);               //取引先コード
                whcdStruct.setPLANT_CD(plantCd);             //工場コード
                String wh_cdStr = getWh_cd(whcdStruct);      //保管区コード
            
                int listSize = qtyList.size();
                for(int i=0; i<listSize; i++){
            	    AE0060010Struct rStruct = (AE0060010Struct)qtyList.get(i);
                    String lot_no = rStruct.getreadLOT_NO();  //在庫ロット番号
                    String qty = rStruct.getreadQTY();        //[出庫実績明細].”出庫支払数量”－[出庫実績明細].”使用済数量”
                    
                    if(lotNoList == null){
                    	lotNoList = new ArrayList();
                    }

                    AE0060010Struct insertStruct = new AE0060010Struct();
                    insertStruct.setsetSEQ_NO(getNextval());          //オラクルシーケンス採番
                    insertStruct.setsetISSUE_INST_CD(issueInstCd);    //出庫指示番号
                    insertStruct.setsetLOT_NO(lot_no);                //在庫ロット番号
                    insertStruct.setsetPUCH_ODR_CD(puchOdrCd);        //発注番号
                    insertStruct.setsetACPT_NO(acptNo);               //受入回数
                    insertStruct.setsetITEM_CD(itemCd);               //支給品目番号
                    insertStruct.setsetWH_CD(wh_cdStr);               //保管区コード
                    insertStruct.setsetSUPPLIED_DATE(suppliedDate);   //使用日
                    insertStruct.setsUser_ID(struct.getsUser_ID());        //ユーザコード

                    //最後レコード
                    if(i == (listSize-1)){
                    	
                    	if(Calculate.compare(supplied_issue_qty, qty) == 1){
                    		//支給品のロット使用数が出庫支払数量を超えています。
                    		//支給品目番号{0},在庫ロット番号{0}
                    		writeLogFiles(WORNING, "AE20610");
                    		writeLogFiles(WORNING, "ZZ01006", "T_PART_SUPPLIED_ISSUE.ITEM_CD:" + itemCd);
                    		writeLogFiles(WORNING, "ZZ01006", "T_LOT_ISSUE_INST.LOT_NO:" + lot_no);
                    	}
                        lotNoList.add(lot_no);                                      //在庫ロット番号
                        lotNoList.add(supplied_issue_qty);                          //使用済数量
                	    insertStruct.setsetTOTAL_ISSUE_QTY(supplied_issue_qty);     //使用済数量
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(supplied_issue_qty);  //使用予定数量
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);    //[ロット別使用実績]の追加

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(supplied_issue_qty);           //使用済数量
                        updateStruct.setISSUE_INST_CD(issueInstCd);                 //出庫指示番号
                        updateStruct.setLOT_NO(lot_no);                             //在庫ロット番号
                        updateStruct.setITEM_CD(itemCd);                            //出庫品目番号
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                     //発注番号
                        updateStruct.setsUser_ID(struct.getsUser_ID());                  //ユーザコード
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct);  //[出庫実績明細]の更新
                        break;
                    }

                    if("0".equals(qty)){
                    	continue;
                    }
                    //[支給品使用].”使用予定数量”>[出庫実績明細].”出庫支払数量”－[出庫実績明細].”使用済数量”
                    if(Calculate.compare(supplied_issue_qty, qty) == 1){
                    	//[支給品使用].”使用予定数量” － １件目で更新した数量
                        supplied_issue_qty = Calculate.subtract(supplied_issue_qty, qty);
                        lotNoList.add(lot_no);
                        lotNoList.add(qty);
                        insertStruct.setsetTOTAL_ISSUE_QTY(qty);                   //使用済数量
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(qty);                //使用予定数量
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);   //[ロット別使用実績]の追加

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(qty);                         //使用済数量
                        updateStruct.setISSUE_INST_CD(issueInstCd);                //出庫指示番号
                        updateStruct.setLOT_NO(lot_no);                            //在庫ロット番号
                        updateStruct.setITEM_CD(itemCd);                           //出庫品目番号
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                    //発注番号
                        updateStruct.setsUser_ID(struct.getsUser_ID());                 //ユーザコード
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct); //[出庫実績明細]の更新

                    }else{
                    	//[出庫実績明細].”出庫支払数量” － [出庫実績明細].”使用済数量” ≧ [支給品使用].”使用予定数量”
                    	//の場合は [支給品使用].”使用予定数量”をセットする
                    	lotNoList.add(lot_no);
                        lotNoList.add(supplied_issue_qty);
                        insertStruct.setsetTOTAL_ISSUE_QTY(supplied_issue_qty);    //使用済数量
                        insertStruct.setsetSUPPLIED_ISSUE_QTY(supplied_issue_qty); //使用予定数量
                        entity.minsertT_LOT_USE_RSLT.create(conn, insertStruct);   //[ロット別使用実績]の追加

                        AE0060010Struct updateStruct = new AE0060010Struct();
                        updateStruct.setsetSPENT_QTY(supplied_issue_qty);          //使用済数量
                        updateStruct.setISSUE_INST_CD(issueInstCd);                //出庫指示番号
                        updateStruct.setLOT_NO(lot_no);                            //在庫ロット番号
                        updateStruct.setITEM_CD(itemCd);                           //出庫品目番号
                        updateStruct.setPUCH_ODR_CD(puchOdrCd);                    //発注番号
                        updateStruct.setsUser_ID(struct.getsUser_ID());                 //ユーザコード
                        entity.mupdateT_LOT_ISSUE_INST.update(conn, updateStruct); //[出庫実績明細]の更新
                        break;
                    }
                }
    	    }else{
    	    	//支給品目に対する出庫実績明細またはロット管理マスタが存在しません
    	    	writeLog(ERROR, "AE20609", null, ERROR_NO + puchno);
                return false;
            }
        }catch(Exception e){
        	e.printStackTrace();
        	//支給品目に対する出庫実績明細またはロット管理マスタが存在しません
        	writeLog(ERROR, "AE20609", null, ERROR_NO + puchno);
            return false;
        }
        return true;
    }
    private double getDoubleValue(String numString){
    	if(numString == null || "".equals(numString.trim())){
    		return 0.0;
    	}
    	BigDecimal bd = new BigDecimal(0);
    	bd = new BigDecimal(numString);
    	return bd.doubleValue();
    }
    /**
	 * オラクルシーケンス採番
	 */
	private String getNextval(){
		try{
		    List l = entity.mSelectSEQ_JF_RSLT.read(conn, struct);
		    if(l != null && l.size() > 0){
			    return ((AE0060010Struct)l.get(0)).getNEXTVAL();
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * [支給品使用].”取引先コード”＝[保管区].“取引先コード”、[支給品使用].”工場コード”＝[保管区].“工場コード”となるMIN([保管区].”保管区コード”)
	 */
    private String getWh_cd(AE0060010Struct s){
    	try{
    	    List list = entity.mSelectWH_CD.read(conn, s);
    	    if(list != null && list.size() > 0){
    		    return ((AE0060010Struct)list.get(0)).getreadWH_CD();
    	    }
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return null;
    }
	/**
     * バッチパラメータのチェックを行います。
     * @param batchType バッチ処理区分
     * @return 正常の場合true、不正の場合false
     * @throws BatchAppException
     */
    private boolean checkArgs(String batchType) throws BatchAppException,FoundationException,SQLException {
     // バッチパラメータの形式が不正な場合
     if (m_med.getArgs().length != 7) {
    	 writeLog(ERROR, "ZZ09022");
      return false;
     }
     // バッチ処理区分がNullの場合
     if (isNull(batchType)) {
    	 writeLog(ERROR, "ZZ09023");
      return false;
     }
     // バッチ処理区分が１、２以外の場合
     if (!"1".equals(batchType) && !"2".equals(batchType)) {
    	 writeLog(ERROR, "ZZ09024");
      return false;
     }
     return true;
    }


	//////////////////////////////
	// コードジェネレータは、以下のコードへの上書きを行いません

	/**
	 * CtrlMainクラスの標準コンストラクタ
	 *
		 */
	public CtrlMain(medAE0160B001 med) throws BatchAppException
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
	public int main() throws BatchAppException,SQLException,FoundationException
	{

		// todo: ここにユーザ定義コードを記述してください
		BusinessLock Lock = null;     // 業務ロック
        int lockCancelKey = 0;	      // ロック解除キー
        Numbering logCd = null;       //ログ識別コード採番の準備

        // metamorBase業務メッセージ
       
      
        // ストアドプロシージャ名
        String functionName = "AE0160B001";  // 受入実績取込処理
        // パラメータ取得
		String[] args = m_med.getArgs();

		if(args.length >= 2){
           m_med.setUsername(args[1]);
        }
		String _sysBatchType = args[0];
	    String _sysUserCd    = args[1];
	    String _sysProgramId = args[2];
	    String _sysPlantCd   = args[3];
	    String _sysDateFrom  = args[4];
	    String _sysDateTo    = args[5];
	    String _businessOprDate = args[6];
        // 引数チェック
        if (!checkArgs(_sysBatchType)) {
        	writeLog(ERROR, "ZZ09009");
         return BREAK;
        }

        try{	
		   // DB接続取得処理
		   conn = m_conductor.m_transactionConn;			

		   // DBメッセージ更新準備
		   conn_msg = m_conductor.m_defaultConn;
           // 業務メッセージの準備
		   numbering = new Numbering(conn_msg, Numbering.LOG_CD, _sysUserCd, _sysProgramId, _sysPlantCd);
           businessMsgAcc = new BusinessMessageAccessor();
           businessMsg = new BusinessMessage();
           businessMsgAcc.init(conn_msg);
           businessMsg.setBusinessOperatingName(_sysProgramId);
           businessMsg.setUser(_sysUserCd);
           businessMsg.setPlantCode(_sysPlantCd);  
           // 業務ロックをかける
           Lock = new BusinessLock(conn_msg, _sysUserCd, _sysPlantCd);
           lockCancelKey = Lock.doLock(_sysProgramId);  // 解除キーの取得
			if (lockCancelKey == LOCK_FAILD) {
				writeLog(ERROR, "ZZ01008");
				return BREAK;
			}
           conn_msg.commit();
	       // SP実行
           spExecute( _sysUserCd,_sysProgramId, _sysPlantCd, _sysDateFrom,_sysDateTo,_businessOprDate);

           // バッチが正常に終了した場合
	       writeLog(INFOMATION, "AE00185",null,"(SBM0638)読込件数 = ["+inputCount+"]、登録件数 = ["+insertCount+"]、エラー件数 = ["+(inputCount-insertCount)+"]");
 		
		}catch (SQLException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (FoundationException e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			throw new BatchAppException("CtrlMain", "main", e.getMessage());
		} finally {
			try {
				// 業務ロック解除
				Lock.doUnLock(_sysProgramId, lockCancelKey);
				conn_msg.commit();
				} catch (Exception e) {
				e.printStackTrace();
				throw new BatchAppException("CtrlMain", "main", e.getMessage());
			}
		}
		return BREAK;
	}


	// ////////////////////////////

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
	 * @exception <
	 *                <コメントを記述してください>>
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
		public medAE0160B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medAE0160B001 med) throws BatchAppException
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
