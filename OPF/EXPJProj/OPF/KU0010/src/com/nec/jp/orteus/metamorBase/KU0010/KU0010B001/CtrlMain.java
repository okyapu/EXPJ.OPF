/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0010/src/com/nec/jp/orteus/metamorBase/KU0010/KU0010B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0010.KU0010B001;

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
	// TODO: ここにimportパッケージを記述してください
//======================================================================================
/*import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
//sunww追加20040730
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
//import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
/*sunww削除20040730
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
*/
/*import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkDay;
import com.nec.jp.orteus.kis.common.ExchAmount.*;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;*/

import java.util.Date;

import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
//import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
//import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
//import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
//import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
//import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
//import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.util.Converter;
//======================================================================================
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.22 $ $Date: 2015/12/03 08:16:00 $
 */

//{{user_implement_dev:header
/**
 * CLASS     : CtrlMain クラス
 * VERSION   : 1.0.0.0
 * DATE      : <日付>
 * AUTHOR    : <開発者名>
 * HISTORY
 *           : 1.0.0.0　(2003/11/6),新規作成
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
	public medKU0010B001 m_med=null;

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
	public CtrlMain(medKU0010B001 med, BatchAppConductor cdr) throws BatchAppException
	{
		// メンバ変数を初期化します
		m_conductor = cdr;
		m_med = med;
		m_control = new interControl(med);

		return;
	}

	//{{user_implement_code
	protected IDbConnection conn;

	//////////////////////////////
	// コードジェネレータは、以下のコードへの上書きを行いません
	private String m_vMSG = "";				//ログハァイル用メッセージ

	/** ExchAmount　外貨計算クラスのインスタンス */
	private ExchAmount exch = null;

	//固定値
	private final static String m_kSYS_CLASS = "SALES";		//システム分類
	private final static String m_kCTRL_CD = "SYSTEM";		//SYSコントロールコード
	private final static String m_kPLT_CLASS_CODE = "PLANT_BATCH";	//工場コード
	private final static String m_kRSN_CLASS_CODE = "UN_SHIP_RSN";	//出荷不可理由
	private final static String m_kLEED_CLASS_CODE = "SHIP_LT";	//リードタイム
	private final static String m_kNORMAL_DEPO_TYP = "10";		//預託倉庫区分(通常)
		
	private String strUserId = null;


	//共通設定値
	//swwテスト追加
	private String glb_plantCd ="";
	private String mv_PLANT_CD = "";				//工場コード
	private String mv_PLANT_CAL_CD = "7";				//工場カレンダーコード
	private String mv_BUSINEESS_OPR_DATE = "";			//業務運用日
	private String mv_COMPANY_CD = "";				//会社コード
	private String mv_LEED_TIME = "";				//リードタイム
	private String mv_SCDL_DLV_DATE = "";				//納入予定日
	private String mv_UN_SHIP_RSN = "";				//出荷指示不可理由
//	private double md_TRUE_SHIP_QTY;				//出荷引当数量(実際指示数量)
	private double md_SHIP_ODR_AMOUNT;				//出荷指示金額
	private String mv_CASE_QTY;					//箱数
	private String mv_REST_QTY;					//端数
	private String mv_TOTAL_CASE_QTY;				//口数

	private double md_SHIP_QTY_SUM;		//出荷指示数量の合計数

	private double md_STOCK_ON_HAND_QTY;//品目別手持在庫数
	private double md_YUKOSU;//有効在庫数
	private String mv_WH_CD;//保管区コード

	//出荷計画の値(出荷計画、受注明細、受注管理)
	//出荷計画TBL
	private String mv_ODR_NO = "";					//受注番号
	private String mv_PART_DLV_SEQ_NO = "";				//分納項番
	private String mv_DESINATED_SHIP_DATE = "";			//出荷指定日
	private String mv_DESINATED_SHIP_QTY = "";			//出荷指定数量
	private String mv_REST_SHIP_ODR_QTY = "";			//出荷指示残数量

	//受注明細TBL
	private String mv_EXCH_TYP = "";//為替種別sww追加受注明細、邦貨計算の引数

	private String mv_ODR_CTL_NO = "";				//受注管理番号
	private String mv_CUST_ODR_NO = "";				//得意先注文番号7
	private String mv_CUST_CHRG_PSN_CD = "";		//営業担当者コード10
	private String mv_DLV_LOC_CD = "";				//納品場所コード12
	private String mv_DEPO_TYP = "";				//預託倉庫区分13
	private String mv_UNIT_CD = "";					//単位19
	private String mv_ODR_UNIT_PRICE = "";			//受注単価20
	private String mv_CURRNCY_CD = "";				//通貨コード23
	private String mv_REMARKS = "";					//備考28
	private String mv_CUS_DLV_KEY_CD = "";			//納品キー番号29
	//20040204仕様追加
	private int mv_SHIP_CNT = 0;					//出荷回数29
	private String mv_TRANSPORT_CD = "";			//運送便コード31

	private String mv_PART_NAME = "";					//品名4
	private String mv_DLV_LOC_NAME_KANJI = "";			//納品場所名(漢字)9
	//20040107仕様変更用
	private String mv_BUYER_NAME = "";					//購買担当10
	private String mv_DESINATED_DLV_DATE = "";			//指定納期13
	private String mv_PUCH_ODR_QTY_TOTAL = "";			//総注文数量15
	private String mv_DLV_ODR_QTY = "";					//納入指示数量16
	private String mv_UNIT_CD_ORG = "";					//伝票・ラベル用単位(変換前単位)18
	private String mv_INSPC_TYP = "";					//検査区分33
	private String mv_CLIENT_REMARK = "";				//発注者備考34
	private String mv_CLIENT_BARCODE_INF = "";			//発注者バーコード情報35

	private String mv_PARTIAL_SHIP_INST_FLG = "";	//分納出荷指示F


	//受注管理TBL
	private String mv_ITEM_CD = "";					//品目番号5
	private String mv_CUST_ITEM_CD = "";			//得意先品目番号6
	private String mv_CUST_CD = "";					//得意先コード8

	//品目マスタ
	private String mv_PKG_UNIT_QTY = "";			//荷姿単位数24

	//得意先マスタ
	private String mv_CUST_ANAME = "";				//得意先名略称9
	private String mv_DETAIL_ROUND_TYP = "";   //明細計算まるめ区分

	//得意先納品場所
	private String mv_TRANSPORT_LT = "";				//運送日数
	private String mv_SHIP_WH_CD = "";				//出荷倉庫コード33
	private String mv_DEPO_WH_CD = "";				//払出預託保管区34


	//消費税計算関連
	private String mv_TAX_KBN = "";					//税込み区分
	private String mv_TAX_RATE = "";				//税率
	private String mv_TAX_START_DATE = "";			//新消費税開始日
	private String mv_ROUND_TYP = "";				//ROUND_TYP
	private String mv_TAX_AMOUNT = "";				//消費税
	private String mv_SHIP_ODR_AMOUNT_TAX = "";		//出荷指示金額(税込み)
	//Add Start 20131223 ma-jf
	private String mv_TAX_CD = "";                  //消費税コード
	private String mv_INSPC_ACPT_TYP = "";          //検収区分
	//Add End 20131223 ma-jf

	//預託倉庫コード
	private String mv_TRANSFER_WH_CD = "";			//振替先保管区

	private void doInit() throws BatchAppException{

		this.mv_EXCH_TYP = "";//為替種別
//delete by t-tou 2004/08/11
//		this.mv_COMPANY_CD = "";//自社情報

		this.mv_ITEM_CD = "";
		this.mv_ODR_NO = "";
		this.mv_PART_DLV_SEQ_NO = "";
		this.mv_DESINATED_SHIP_DATE = "";
		this.mv_DESINATED_SHIP_QTY = "";
		this.mv_REST_SHIP_ODR_QTY = "";
		this.mv_ODR_CTL_NO = "";
		this.mv_CUST_CD = "";

		this.mv_CUST_ODR_NO = "";
		this.mv_UNIT_CD = "";
		this.mv_ODR_UNIT_PRICE = "";
		this.mv_CURRNCY_CD = "";
		this.mv_REMARKS = "";
		this.mv_TRANSPORT_CD = "";
		this.mv_PART_NAME = "";
		this.mv_DLV_LOC_NAME_KANJI = "";

		this.mv_CUS_DLV_KEY_CD = "";
		this.mv_DESINATED_DLV_DATE = "";
		this.mv_INSPC_TYP = "";

		//this.mv_CLIENT_REMARK_KANJI = "";

		this.mv_CLIENT_BARCODE_INF = "";
		this.mv_CUST_CHRG_PSN_CD = "";

		this.mv_DLV_LOC_CD = "";
		this.mv_DEPO_TYP = "";


		this.mv_PARTIAL_SHIP_INST_FLG = "";
		this.mv_BUYER_NAME = "";
		this.mv_PUCH_ODR_QTY_TOTAL = "";
		this.mv_DLV_ODR_QTY = "";
		this.mv_UNIT_CD_ORG = "";
		this.mv_SHIP_CNT = 0;

		this.mv_CUST_ITEM_CD = "";

		this.mv_CUST_ANAME = "";
		this.mv_DETAIL_ROUND_TYP = "";//明細計算まるめ区分
//		this.mv_SLIP_TYPE = "";
//		this.mv_LABEL_TYP = "";
//		this.mv_PRICE_DISP_TYP = "";

		this.mv_PKG_UNIT_QTY = "";
		//this.mv_UNIT_WEIGHT = "";

		this.mv_TRANSPORT_LT = "";
		this.mv_SHIP_WH_CD = "";
		this.mv_DEPO_WH_CD = "";

		//this.md_WHSU = 0.0;

		this.mv_WH_CD = "";
		this.md_STOCK_ON_HAND_QTY = 0.0;
//		this.md_ALCED_QTY = 0.0;
		this.md_YUKOSU = 0.0;
//		this.mv_LOC_CD = "";

//		this.md_TRUE_SHIP_QTY =0.0;

		this.mv_UN_SHIP_RSN = "";

		this.mv_TRANSFER_WH_CD = "";
		//Add Start 20131223 ma-jf
		this.mv_TAX_CD = "";
		//Add End 20131223 ma-jf
	}

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
	 * エラー/警告メッセージログ出力処理(IF情報管理番号埋め込み)
	 *
	 * @param String メッセージコード
	 * @param String IF情報管理番号
	 */
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException
	{
		ExpjMessage am = new ExpjMessage(msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
		//System.out.println(am.getMessage(CoreTools.getLocale(strUserId)));
	}

//------------------------消費税関連--------------------------------BEGIN
//以前の消費税金額計算の削除sww20040730
//sww追加関数開始20040730
	/**
	 * 消費税金額計算
	 * @param  String strCustCd 得意先コード
	 * @param  String strTaxCd 消費税コード
	 * @param  String strAmount 出荷指示金額
     * @param  String strCurrncyCd 通貨コード
	 * @return String rv 消費税金額
	 *
	 * */
	private String[] doCalcuTaxAmount(medKU0010B001 m_med, String strCustCd,
                              //Mod Start 20131223 ma-jf
	                          String strCompanyCd, String strTaxCd,
//	                          String strCompanyCd, String strItemCd,
	                          //Mod End 20131223 ma-jf
                              String strAmount, String strCurrncyCd)
                              throws BatchAppException, ParseException,
                              FoundationException, SQLException{

			String rv[] = new String[3];
            int decimalFig = 0;

            m_med.setstrCUR_CD(strCurrncyCd);
            if(m_med.gettblM_CUR().read() != SUCCESS){
            }else{
                if( m_med.gettblM_CUR().next() == false){
                } else {
                    decimalFig = Integer.parseInt(m_med.getstrDECIMAL_FIG());
                }
            }

			//消費税マスタから取得
			String strTaxKbn = "";	//税込区分
			//String strStartDate ="";	//新消費税コード開始日
		   	String strTaxRate[] = {"0", "0", "0"};	//税率
			//String strTaxRate[] = new String[3];	//税率
			String strRoundTyp = "";

			m_med.setstrTaxIN_COMPANYCD(strCompanyCd);
			m_med.setstrTaxIN_CUSTCD(strCustCd);
			//Add Start 20131223 ma-jf
			m_med.setstrTaxIN_TAXCD(strTaxCd);
			//Add End 20131223 ma-jf
			//Del Start 20131223 ma-jf
//		    m_med.setg_CUST_ITEM_CD(strItemCd);
			//Del End 20131223 ma-jf

	        if(m_med.getgetTax().read() != SUCCESS){
	        }else{
	        	if( m_med.getgetTax().next() == false){
				} else {
					this.mv_TAX_KBN = m_med.getstrTaxTAX_KBN();
					//strStartDate = m_med.getstrTaxSTART_DATE();
					this.mv_TAX_START_DATE = m_med.getstrTaxSTART_DATE();
					strRoundTyp = m_med.getstrTaxROUND_TYP();
					//Add Start 20131223 ma-jf
					this.mv_INSPC_ACPT_TYP = m_med.getstrINSPC_ACPT_TYP();
					//Add End 20131223 ma-jf

					//税率設定(新消費税開始日<=出荷指定日の場合、新税率)
					if(this.isNewTax()){
						strTaxRate[0] = this.plZero(m_med.getstrTaxNEW_TAX_1());
						strTaxRate[1] = this.plZero(m_med.getstrTaxNEW_TAX_2());
						strTaxRate[2] = this.plZero(m_med.getstrTaxNEW_TAX_3());
					} else {
						strTaxRate[0] = this.plZero(m_med.getstrTaxOLD_TAX_1());
						strTaxRate[1] = this.plZero(m_med.getstrTaxOLD_TAX_2());
						strTaxRate[2] = this.plZero(m_med.getstrTaxOLD_TAX_3());
					}
				}
			}
//Add by t-tou 2004/08/11
//System.out.println(strTaxRate[0]);
//System.out.println(strTaxRate[1]);
//System.out.println(strTaxRate[2]);

			//端数区分でROUNDを行う
			ExchAmount ex = new ExchAmount(conn);

			for (int i = 0; i < 3; i ++) {
				String strIn = ex.doMul(strAmount,strTaxRate[i]);
//System.out.println("計算前strIn==" + strIn);
				if ("0".equals(this.mv_TAX_KBN)){
					strIn = "0";
				} else if ("1".equals(this.mv_TAX_KBN)){
					strIn = String.valueOf(Double.parseDouble(strIn) / Double.parseDouble("100"));
				} else {
					strIn = String.valueOf(
						Double.parseDouble(strIn) / (Double.parseDouble("100")
						+ Double.parseDouble(strTaxRate[i])));
				}
//System.out.println("計算後strIn==" + strIn);
				//rv[i] = this.doRound(strIn,strRoundTyp);
                if ("2".equals(strRoundTyp)) {
                    // 切り上げ
                    rv[i] = Calculate.ceil(strIn, decimalFig);
                }
                else if ("3".equals(strRoundTyp)) {
                    // 切り捨て
                    rv[i] = Calculate.floor(strIn, decimalFig);
                }
                else {
                    // 四捨五入
                    rv[i] = Calculate.round(strIn, decimalFig);
                }
                //System.out.println("rv[" + i + "]:" + rv[i]);

			}
			return rv;
	}

//sww追加関数開始20040730終了

	/**
	 * 新消費税コード開始日と比較
	 *
	 * @return true/false
	 */
	private boolean isNewTax() throws ParseException
	{
		boolean rv = false;

	//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
		//新消費税コード開始日
		GregorianCalendar date1 = new GregorianCalendar();
	//	date1.setTime(sdi.parse(this.mv_TAX_START_DATE));
		date1.setTime(Converter.strToDate(this.mv_TAX_START_DATE, "yyyy/MM/dd"));
		//出荷指定日
		GregorianCalendar date2 = new GregorianCalendar();
	//	date2.setTime(sdi.parse(this.mv_DESINATED_SHIP_DATE));
		//Add Start 20131223 ma-jf
		if ("1".equals(this.mv_INSPC_ACPT_TYP)) {
        //Add End 20131223 ma-jf
		    date2.setTime(Converter.strToDate(this.mv_DESINATED_SHIP_DATE, "yyyy/MM/dd"));
		//Add Start 20131223 ma-jf
		} else {
			date2.setTime(Converter.strToDate(this.mv_SCDL_DLV_DATE, "yyyy/MM/dd"));
		}
		//Add End 20131223 ma-jf
		//新消費税コード開始日 <= 出荷指定日の場合、新税率
		if(date1.getTime().compareTo(date2.getTime()) <= 0){
			rv = true;
		}
		return rv;
	}

	/**
	 * 端数区分によって整数変換
	 *
	 * @param	strIn 		変換値
	 * 			strRoundTyp	端数区分
	 * @return rv	変換結果
	 */
	private String doRound(String strIn, String strRoundTyp){
		String rv = strIn;

		int iPt;
		double d1 = 0.0;
		double d2 = 0.0;
		double d3 = 0.0;

		iPt = rv.indexOf(".");

		if(iPt != -1){
			String str1 = rv.substring(0, iPt);
			if(!"".equals(str1)){
				d1 = Double.parseDouble(str1);
			}
			d2 = Double.parseDouble(rv.substring(iPt+1));
			d3 = Double.parseDouble(rv.substring(iPt+1,iPt+2));
			if("2".equals(strRoundTyp)){
				if(d2 > 0){
					d1 += 1;
				}
			}else if("1".equals(strRoundTyp)){
				if(d3 > 4){
					d1 += 1;
				}
			}
			rv = d1 + "";
		}
		return rv;
	}

	/**
	 * .999の小数を9.999の形式に変換(例：.12→0.12)
	 *
	 * @param	String strIn	変換値
	 * @return	String rv		変換結果値
	 */
	private String plZero(String strIn){
		String rv = strIn;
		int ipt = rv.indexOf(".");

		if(ipt==0){
			rv="0"+rv;
		}
		return rv;
	}
//------------------------消費税関連--------------------------------END


	/**
	 * リードタイム+日付の取得
	 *
	 * @param	IDbConnection conn		DBコネクション
	 * 			String strUserId		ユーザID
	 * 			String strBusinessName	ビジネス名
	 * 			String strKbn			日付取得区分(UNTIL/SDLC)
	 * @return true/false
	 */
	private boolean getPlusLeedDate(IDbConnection conn, String strUserId, String strBusinessName, String strKbn)
		throws BatchAppException
		//, ParseException,FoundationException
	{

		boolean rv = true;
		String strBaseDate = "";
		String strLeedTime = "";
		String strLT = "";
		String strUnSoDate = "";
		int iAddDays = 0;
		try{

	//		SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
	//		SimpleDateFormat sdc = new SimpleDateFormat("yyyyMMdd");
			// 運送日数 + 出荷指定日 + リードタイム
			strLT = this.mv_LEED_TIME;
			strUnSoDate = this.mv_TRANSPORT_LT;
			iAddDays = Integer.parseInt(strLT) + Integer.parseInt(strUnSoDate) ;
			strLeedTime = String.valueOf(iAddDays);
			strBaseDate = this.mv_DESINATED_SHIP_DATE;


			GregorianCalendar inpDate = new GregorianCalendar();
		//	inpDate.setTime(sdi.parse(strBaseDate));
			inpDate.setTime(Converter.strToDate(strBaseDate, "yyyy/MM/dd"));

			java.util.Date wkDate = inpDate.getTime();

//System.out.println("00000000000000000");
			WorkCalendar wkd = new WorkCalendar(
					conn,
					strUserId,				//ユーザコード
					strBusinessName,			//業務コード
					this.glb_plantCd,					//工場コード
					wkDate,					//対象日付
					Integer.parseInt(strLeedTime),		//加算日
					false					//前倒しフラグ
					);
			wkDate = wkd.calcDate();				//計算結果

			if(wkDate == null){
				throw new Exception();
			}

			//納入予定日
			//	this.mv_SCDL_DLV_DATE = new String(sdi.format(wkDate));
			this.mv_SCDL_DLV_DATE = new String(Converter.dateToStr(wkDate, "yyyy/MM/dd"));
	
		}catch (Exception e) {
			rv = false;
		}finally{
			return rv;
		}
	}
	private String replaceNull(String strIn){

		String rv="";

		if(strIn != null){
			rv = strIn;
		}

		return rv;
	}
	/**
	 *　LPAD処理
	 *
	 * @return 結果
	 */
	private String doLpad(String strIn, int iLen, String strBlank) throws BatchAppException{
		String rv = "";

		int istrInLen = strIn.length();

		if(istrInLen < iLen){
			for(int i=0; i<iLen-istrInLen; i++){
				rv += strBlank;
			}
		}
		rv += strIn;
		return rv;
	}

	/**
	 * CtrlMainクラスの標準コンストラクタ
	 *
	 * @return なし
	 */
	public CtrlMain(medKU0010B001 med) throws BatchAppException
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
		// todo: ここにユーザ定義コードを記述してください
//-------------------------------------------------------------------------------------
       		// 初期化
        	int nret = 0;
        	List WhCdList = new ArrayList();
        	List YukouSuList = new ArrayList();
        	boolean errFlg = false;

       		// エラーリスト
		//List errCodeList = new ArrayList();
//delete by t-tou
//        IDbConnection conn = null;

		String strBusinessName = null;
		String strPlantCd = null;
		String strDirectDlvFlg = null;

		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();

		Numbering logCd = null;		//ログ識別コード採番の準備
		
		// 業務ロック
		int lockCancelKey = -1;		//ロックキャンセルキーの準備
		BusinessLock lock = null;	//ロック準備		

		// 引数受け取り
		String args[] = m_med.getArgs();
		//業務コード、ユーザコード、工場コード、在庫チェックなしフラグ
		strBusinessName = args[0];
		strUserId = args[1];
		strPlantCd = args[2];
		strDirectDlvFlg = args[3];

    if ("true".equals(strDirectDlvFlg)) {
     strDirectDlvFlg = "1"; 
    } else{
     strDirectDlvFlg = "0";
    }

		this.glb_plantCd=strPlantCd;

//System.out.println("業務名:" + args[0]);
//System.out.println("ユーザ:" + args[1]);
//System.out.println("工場:" + args[2]);


		try{
			// システム工場コード取得
			String sysClassCode = strPlantCd;
			if (m_med.gettblSYS_CLASS_CODE().read() == SUCCESS) {
				if (m_med.gettblSYS_CLASS_CODE().next()) {
					sysClassCode = m_med.getstrSYS_CLASS_CODE();
				}
			}

			CoreTools.write("(SBM1090)sww開始");
			conn = m_conductor.m_transactionConn;
			//バッチ開始メッセージ登録
			try {
				conn.beginTransWeb();
				
				// コネクションを渡して、業務メッセージ準備
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strPlantCd);
				
				// コネクションを渡して、採番の準備
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strPlantCd);
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
				String strMsgCd = "KU00001";
				String strDataString = "(SBM0604)<< 出荷指示バッチ処理開始>>";
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
				throw new Exception();
			}

			try{
//System.out.println("\n||******>>>> 出荷指示バッチスタート <<<******||");
//●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
//-----------------------------------------------------------------------------
//		出荷指示処理（ここから）
//------------------------------------------------------------------------------
//-----------------------------------------------------------------------------

				//sww追加20030730開始
				// =======================================
				// 自社情報の取得
				// =======================================
				if(m_med.getgetCompanyInfo().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetCompanyInfo().next() == false
					|| m_med.getstrCOMPANY_CD() == null
					|| "".equals(m_med.getstrCOMPANY_CD())){

					//自社情報が無い/複数件
					this.writeLogMessage("KQ00039");
					throw new Exception();

				}
//System.out.println("自社情報の取得");
//System.out.println("\tCOMPANY_CD=" + m_med.getstrCOMPANY_CD());
				this.mv_COMPANY_CD = m_med.getstrCOMPANY_CD();

				//=======================================
				// 業務日付取得
				//=======================================
				if(m_med.getgetGyomuDate().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetGyomuDate().next() == false
					|| m_med.getstrBUSINESS_OPR_DATE() == null
					|| "".equals(m_med.getstrBUSINESS_OPR_DATE())){
					//業務日付情報が無い/複数件
					this.writeLogMessage("KQ00026");
					throw new Exception();
				}
//System.out.println("業務日付取得");
//System.out.println("\tBUSINESS_OPR_DATE=" + m_med.getstrBUSINESS_OPR_DATE());
				this.mv_BUSINEESS_OPR_DATE = m_med.getstrBUSINESS_OPR_DATE();

				//自社情報処理と業務日付の取得終了sww完成20040802

				// =======================================
				// リードタイムの取得
				// =======================================
				//システム分類、区分コードsales,ship_lt
				if(m_med.getleedTime().read() != SUCCESS){
					throw new Exception();
				}else{
					if(m_med.getleedTime().next() == false
						|| m_med.getleedTimeCODE() == null ){
						//出荷準備L/T情報が無い/複数件
						this.writeLogMessage("KQ00037");
						throw new Exception();
					}else{
						//出荷準備リードタイムの取得
						this.mv_LEED_TIME = m_med.getleedTimeCODE();
					}
				}
//System.out.println("出荷準備リーダタイムを取得する");
//System.out.println("||**リードタイム取得成功(mv_LEED_TIME):"+this.mv_LEED_TIME);

				//=======================================
				// //対象出荷指定日の取得
				//=======================================
//System.out.println("4)運用+リードタイムの取得");

				// 出荷指定日に 対象出荷指定日(業務運用日+リードタイム )を設定する
////System.out.println("||**<"+this.mv_UNTIL_DATE);

				m_med.setreadTAnsDlvDateDESINATED_SHIP_DATE(this.mv_BUSINEESS_OPR_DATE);

				//自社コード
				m_med.setreadTAnsDlvDateCOMPANY_CD(this.mv_COMPANY_CD);


				//=======================================
				// 出荷指示不可リストを初期化
				//=======================================
				m_med.setUN_SHIP_SEQ_NO("1");
				if(m_med.gettblT_UN_SHIP_LIST().delete()!=SUCCESS){
//System.out.println("出荷指示不可リストを初期化失敗");
					throw new Exception();
				}

				//=======================================
				//出荷計画から対象データを抽出するif開始
				//=======================================
				if(m_med.gettblT_ANS_DLV_DATE().read()!=SUCCESS){
//System.out.println("||***対象データ取得失敗");
					throw new Exception();
				}else{
					int iNum = 0;	//テスト用


					//=======================================
					//出荷計画から対象データの処理while開始
					//=======================================
				  try {
					while(m_med.gettblT_ANS_DLV_DATE().next()){
						//品目番号でROLLBACKを行うため
						conn.beginTransWeb();
						this.doInit();//初期化

//System.out.println("\n||----------[("+(++iNum)+")番目出荷指示バッチ開始]----------||");



						//=======================================
						//出荷指示登録用の出荷計画からのデータの取得
						//=======================================
						this.mv_ODR_NO = replaceNull(m_med.getreadTAnsDlvDateODR_NO());							//受注番号2
						this.mv_PART_DLV_SEQ_NO = replaceNull(m_med.getreadTAnsDlvDatePART_DLV_SEQ_NO());		//分納項番3
						this.mv_ITEM_CD = replaceNull(m_med.getreadTAnsDlvDateITEM_CD());						//品目番号5
						this.mv_DESINATED_SHIP_DATE = replaceNull(m_med.getreadTAnsDlvDateDESINATED_SHIP_DATE());//出荷指定日14
						this.mv_REST_SHIP_ODR_QTY = replaceNull(m_med.getreadTAnsDlvDateREST_SHIP_ODR_QTY());	//出荷指示残数量（更新用）

						this.mv_DESINATED_SHIP_QTY = replaceNull(m_med.getreadTAnsDlvDateDESINATED_SHIP_QTY());	//出荷指示数量16



						//=======================================
						//出荷指示登録用の出荷明細からのデータの取得
						//=======================================
						// Mod Start 20140217 liu-chy
						//this.mv_EXCH_TYP = replaceNull(m_med.getreadTAnsDlvDateEXCH_TYP());//為替種別sww追加受注明細,邦貨計算の引数
						this.mv_EXCH_TYP = replaceNull(m_med.getreadTAnsDlvDateEXCH_TYP_R());//為替種別sww追加得意先マスタ,邦貨計算の引数
						// Mod End 20140217 liu-chy

						this.mv_CUST_ODR_NO =replaceNull( m_med.getreadTAnsDlvDateCUST_ODR_NO());			//得意先注文番号7
						this.mv_CUST_CHRG_PSN_CD = replaceNull(m_med.getreadTAnsDlvDateCUST_CHRG_PSN_CD());		//営業担当者コード10
						this.mv_DLV_LOC_CD = replaceNull(m_med.getreadTAnsDlvDateDLV_LOC_CD());			//納品場所コード12
						this.mv_DEPO_TYP = replaceNull(m_med.getreadTAnsDlvDateDEPO_TYP());				//預託倉庫区分13
						this.mv_UNIT_CD = replaceNull(m_med.getreadTAnsDlvDateUNIT_CD());				//単位19
													    //readTAnsDlvDateODR_UNIT_PRICE
						this.mv_ODR_UNIT_PRICE = replaceNull(m_med.getreadTAnsDlvDateODR_UNIT_PRICE());		//受注単価20
						// Mod Start 20140217 liu-chy
						//this.mv_CURRNCY_CD = replaceNull(m_med.getreadTAnsDlvDateCURRNCY_CD());			//通貨コード23
						this.mv_CURRNCY_CD = replaceNull(m_med.getreadTAnsDlvDateCUR_CD());			//通貨コード23
						// Mod End 20140217 liu-chy
						this.mv_REMARKS =replaceNull( m_med.getreadTAnsDlvDateREMARKS());				//備考28
						this.mv_CUS_DLV_KEY_CD = replaceNull(m_med.getreadTAnsDlvDateCUS_DLV_KEY_CD());		//納品キー番号29
						//swwintから修正
						this.mv_SHIP_CNT = Integer.parseInt(m_med.getreadTAnsDlvDateSHIP_CNT());	//出荷回数29
/*del g-matsumoto 2004.08.27
//add t-tou 2004/08/11
						String strTemp = String.valueOf(this.mv_SHIP_CNT + 1);
						if(strTemp.length() == 1){
							strTemp = "00" + strTemp;
						}else if(strTemp.length() == 2){
							strTemp = "0" + strTemp;
						}
						if(this.mv_CUS_DLV_KEY_CD.equals("")){
							this.mv_CUS_DLV_KEY_CD = this.mv_CUST_ODR_NO + "+" + strTemp;
						}else{
							this.mv_CUS_DLV_KEY_CD = this.mv_CUS_DLV_KEY_CD + "+" + strTemp;
						}
//end
//del-end g-matsumoto 2004.08.27 */
						//得意先注文番号の追加必要29
						this.mv_TRANSPORT_CD = m_med.getreadTAnsDlvDateTRANSPORT_CD();			//運送便コード31

						//出荷伝票登録用の出荷明細からのデータの取得
						this.mv_PART_NAME = replaceNull(m_med.getreadTAnsDlvDatePART_NAME());			//品名4
						this.mv_DLV_LOC_NAME_KANJI = replaceNull(m_med.getreadTAnsDlvDateDLV_LOC_NAME_KANJI());	//納品場所名(漢字)9
						this.mv_BUYER_NAME = replaceNull(m_med.getreadTAnsDlvDateBUYER_NAME());			//購買担当10
						this.mv_DESINATED_DLV_DATE = replaceNull(m_med.getreadTAnsDlvDateDESINATED_DLV_DATE());	//指定納期13
						this.mv_PUCH_ODR_QTY_TOTAL = replaceNull(m_med.getreadTAnsDlvDatePUCH_ODR_QTY_TOTAL());	//総注文数量15
						this.mv_DLV_ODR_QTY = replaceNull(m_med.getreadTAnsDlvDateODR_QTY()); 			//納入指示数量16
						this.mv_UNIT_CD_ORG = replaceNull(m_med.getreadTAnsDlvDateUNIT_CD_ORG()); 			//単位(伝票・ラベル用)18
						this.mv_INSPC_TYP = replaceNull(m_med.getreadTAnsDlvDateINSPC_TYP());			//検査区分33
						this.mv_CLIENT_REMARK = replaceNull(m_med.getreadTAnsDlvDateCLIENT_REMARK());		//発注者備考34
						this.mv_CLIENT_BARCODE_INF = replaceNull(m_med.getreadTAnsDlvDateCLIENT_BARCODE_INF());	//発注者バーコード情報35
						//Add Start 201312223 ma-jf
						this.mv_TAX_CD = replaceNull(m_med.getreadTAnsDlvDateTAX_CD());                 //消費税コード
						//Add End 20131223 ma-jf
						//有効在庫数の算数チェックため
						this.mv_PARTIAL_SHIP_INST_FLG = replaceNull(m_med.getreadTAnsDlvDatePARTIAL_SHIP_INST_FLG());//分納出荷指示F

						//=======================================
						//出荷指示登録用の受注管理からのデータの取得
						//=======================================
						this.mv_ITEM_CD =      replaceNull(m_med.getreadTAnsDlvDateITEM_CD());			//品目番号5
						this.mv_CUST_ITEM_CD = replaceNull(m_med.getreadTAnsDlvDateCUST_ITEM_CD()); 		//得意先品目番号6
						this.mv_CUST_CD =      replaceNull(m_med.getreadTAnsDlvDateCUST_CD());			//得意先コード8

						//=======================================
						//出荷指示登録用の得意先マスタからのデータの取得
						//=======================================

						this.mv_CUST_ANAME =   replaceNull(m_med.getreadTAnsDlvDateCUST_ANAME());		//得意先名略称9
						//明細計算まるめ区分sww追加邦貨計算の引数
						this.mv_DETAIL_ROUND_TYP =   replaceNull(m_med.getreadTAnsDlvDateDETAIL_ROUND_TYP());

						//=======================================
						//出荷指示登録用の品目からのデータの取得
						//=======================================
						this.mv_PKG_UNIT_QTY = replaceNull(m_med.getreadTAnsDlvDatePKG_UNIT_QTY());		//荷姿単位数24

						//=======================================
						//出荷指示登録用の得意先納品場所からのデータの取得
						//=======================================
						this.mv_TRANSPORT_LT = replaceNull(m_med.getreadTAnsDlvDateTRANSPORT_LT());		//運送日数15
//modified t-tou
//						this.mv_SHIP_WH_CD =   replaceNull(m_med.getreadTAnsDlvDateCUST_ITEM_CD());		//出荷倉庫コード33
//						this.mv_DEPO_WH_CD =   replaceNull(m_med.getreadTAnsDlvDateCUST_ITEM_CD());		//払出預託保管区34
						this.mv_SHIP_WH_CD =   replaceNull(m_med.getreadTAnsDlvDateSHIP_WH_CD());		//出荷倉庫コード33
						this.mv_DEPO_WH_CD =   replaceNull(m_med.getreadTAnsDlvDateDEPO_WH_CD());		//払出預託保管区34
//end t-tou

						//納入予定日の取得15(出荷計画出荷指示日、得意先納品場所の運送日数、出荷準備リードタイム)
						boolean returnPlusNouhinDate =
							this.getPlusLeedDate(conn, strUserId, strBusinessName,"SCDL");
						//this.mv_SCDL_DLV_DATEの取得

						//SWWデータの取得の完成20040802
						
						
						
						// ケイ前営　2007/10/30
						m_med.setreadTJOBODRODRALCPLANT_CD(strPlantCd);
						// 製番受注紐付に受注番号チック
						if(m_med.gettblT_JOB_ODR_ODR_ALC().read() != SUCCESS){
							throw new Exception();
						}else{
							if(m_med.gettblT_JOB_ODR_ODR_ALC().next()){
								//受注管理の品目番号、得意先納品場所の出荷倉庫コードの検索条件
								m_med.setreadTJOBODRCDSTOCKITEM_CD(this.mv_ITEM_CD);
								m_med.setreadTJOBODRCDSTOCKIN_WHCD(this.mv_SHIP_WH_CD);
								if(m_med.gettblT_JOB_ODR_CD_STOCK().read() != SUCCESS){
									//System.out.println("--------------------------------------");
									throw new Exception();
								}else{
									if(m_med.gettblT_JOB_ODR_CD_STOCK().next()){
										//保管区コード
										this.mv_WH_CD = m_med.getreadTJOBODRCDSTOCK_WHCD();
										//有効在庫数=品目手持在庫数-出荷指示数量の合計数
										this.md_YUKOSU =  Double.parseDouble(m_med.getreadTJOBODRCDSTOCK_PBL_SHIP_QTY());
									}
								}
							}else{
								//=======================================
								//保管区別品目在庫から品目別手持在庫数の取得
								//=======================================
								//受注管理の品目番号、得意先納品場所の出荷倉庫コードの検索条件
								m_med.setreadTItemStockIN_ITEMCD(this.mv_ITEM_CD);
								m_med.setreadTItemStockIN_WHTYP(this.mv_SHIP_WH_CD);
								//出荷指示登録製番がnullに設定
								m_med.setstrJOB_ODR_CD("");
								if(m_med.gettblT_ITEM_STOCK().read()!=SUCCESS){
									throw new Exception();
								}else{
									if(m_med.gettblT_ITEM_STOCK().next()){
									//保管区コード
									this.mv_WH_CD = m_med.getreadTItemStockWH_CD();
									//有効在庫数量
									this.md_YUKOSU = Double.parseDouble(m_med.getreadTItemStockYUKOSU());
									}
								}
							}
						}
						//　ケイ前営　2007/10/30

						

						/*//=======================================
						//出荷指示より出荷指示数量の合計数の取得
						//=======================================
						if(m_med.gettblT_SHIP_ODR_CHK().read()!=SUCCESS){
							throw new Exception();
						}else{
							//出荷指示有効在庫数算出のために読込
							if(m_med.gettblT_SHIP_ODR_CHK().next()){
								//出荷指示より出荷指示数量の合計数の取得
								this.md_SHIP_QTY_SUM = Double.parseDouble(m_med.getstrSHIP_QTY_SUM());
							}
						}

						//=======================================
						//有効在庫数=品目手持在庫数-出荷指示数量の合計数
						//=======================================
						this.md_YUKOSU = this.md_STOCK_ON_HAND_QTY - this.md_SHIP_QTY_SUM ;*/
//System.out.println("有効在庫数 ==" + this.md_YUKOSU);

						//出荷指示数量と出荷指示不可数量の算出
						double md_CHKYUKOSU = this.md_YUKOSU;//有効在庫数
						double md_CHKSHIP_QTY= Double.parseDouble(this.mv_REST_SHIP_ODR_QTY);//出荷指定数

						//=======================================
						//分岐処理：出荷指示数と出荷指示不可数量の算出
						//=======================================
						//出荷指示数
						double md_CALCULATION_SHIP_QTY = 0;
						//出荷指示不可数量
						double md_DISABLE_QTY = 0;

/*2005・08・19　update　start*/
						if ( (md_CHKYUKOSU >= md_CHKSHIP_QTY) || (strDirectDlvFlg == "1")) { 
							//有効在庫数>=出荷指定数、あるいは在庫チェックしないとき
							//出荷指定数、０
							md_CALCULATION_SHIP_QTY = md_CHKSHIP_QTY;
							md_DISABLE_QTY = 0 ;
						}else if (  md_CHKYUKOSU < md_CHKSHIP_QTY ) {
							if  ( ("1".equals(this.mv_PARTIAL_SHIP_INST_FLG)) && (strDirectDlvFlg == "0")){ 
							  //有効在庫数<出荷指定数　かつ　分納OK　かつ　在庫チェックするとき
								//有効在庫数、出荷指定数-有効在庫数
								md_CALCULATION_SHIP_QTY = md_CHKYUKOSU;
								md_DISABLE_QTY = md_CHKSHIP_QTY - md_CHKYUKOSU;
							} else if( ("0".equals(this.mv_PARTIAL_SHIP_INST_FLG)) && (strDirectDlvFlg == "0")) { 
                //有効在庫数<出荷指定数　かつ　分納不可　かつ　在庫チェックするとき
                //０、出荷指定数
								md_CALCULATION_SHIP_QTY = 0;
								md_DISABLE_QTY = md_CHKSHIP_QTY ;
							}
						}
/*2005・08・19　update　end*/

						//=======================================
						//出荷指示数>0の場合、登録更新処理
						//=======================================
						if ( md_CALCULATION_SHIP_QTY > 0 ) {

							Numbering SHIP_ODR_NO = null;		//出荷指示番号採番の準備
							Numbering SLIP_CD = null;			//伝票番号採番の準備

							// =======================================
							//出荷指示の登録
							// =======================================
							//出荷指示番号、伝票番号を自動採番する
							SHIP_ODR_NO = new Numbering(conn,Numbering.SHIP_ODR_NO,strUserId,strBusinessName, sysClassCode);
							SLIP_CD = new Numbering(conn,Numbering.SLIP_CD,strUserId,strBusinessName, sysClassCode);
							String strSHIP_ODR_NO = SHIP_ODR_NO.getNo();
							String strSLIP_CD = SLIP_CD.getNo();

							m_med.setcreTShipOdrSHIP_ODR_NO(strSHIP_ODR_NO);//出荷指示番号1
							m_med.setcreTShipOdrSLIP_CD(strSLIP_CD);//伝票番号4
//							m_med.setcreTShipOdrSLIP_CD(strSHIP_ODR_NO);//出荷指示番号1
//							m_med.setcreTShipOdrSHIP_ODR_NO(strSLIP_CD);//伝票番号4

							m_med.setcreTShipOdrODR_NO(this.mv_ODR_NO);			//受注番号2
							m_med.setcreTShipOdrPART_DLV_SEQ_NO(this.mv_PART_DLV_SEQ_NO);	//分納項番3
							m_med.setcreTShipOdrITEM_CD(this.mv_ITEM_CD);			//品目番号5

							m_med.setcreTShipOdrCUST_ITEM_CD(this.mv_CUST_ITEM_CD);		//得意先品目番号6
							m_med.setcreTShipOdrCUST_ODR_NO(this.mv_CUST_ODR_NO);		//得意先注文番号7
							m_med.setcreTShipOdrCUST_CD(this.mv_CUST_CD);			//得意先コード8
							m_med.setcreTShipOdrCUST_NAME(this.mv_CUST_ANAME);		//得意先名称9
							m_med.setcreTShipOdrCUST_CHRG_PSN_CD(this.mv_CUST_CHRG_PSN_CD);	//営業担当者コード10

							m_med.setcreTShipOdrSHIP_ODR_ISS_PSN_CD(strUserId);	//発行担当者コード11ユーザＩＤ
							m_med.setcreTShipOdrDLV_LOC_CD(this.mv_DLV_LOC_CD);		//納品場所コード12
							m_med.setcreTShipOdrDEPO_TYP(this.mv_DEPO_TYP);			//預託倉庫区分13
							m_med.setcreTShipOdrDESINATED_SHIP_DATE(this.mv_DESINATED_SHIP_DATE);	//出荷指定日14

							//納入予定日の取得確認必要
							//if(!this.getPlusLeedDate(conn, strUserId, strBusinessName, "SCDL"))
								//{ throw new Exception(); }

							m_med.setcreTShipOdrSCDL_DLV_DATE(this.mv_SCDL_DLV_DATE);	//納入予定日15 //2004.1.6追加

							m_med.setcreTShipOdrSHIP_QTY(md_CALCULATION_SHIP_QTY+"");		//出荷指示数量16,17=0,18=0
							m_med.setcreTShipOdrUNIT_CD(this.mv_UNIT_CD);			//単位19
							m_med.setcreTShipOdrUNIT_PRICE(this.mv_ODR_UNIT_PRICE);		//単価20

							ExchAmount ex = new ExchAmount(conn);
							//出荷指示数量＊単価＝出荷指示金額21
//modified by t-tou
//System.out.println("this.mv_ODR_UNIT_PRICE ===" + this.mv_ODR_UNIT_PRICE);
//System.out.println("this.md_CALCULATION_SHIP_QTY ===" + md_CALCULATION_SHIP_QTY);
							String strAmount = ex.doMul(this.mv_ODR_UNIT_PRICE,md_CALCULATION_SHIP_QTY+"") ;
//							String strAmount = ex.doMul(this.mv_ODR_UNIT_PRICE,this.md_TRUE_SHIP_QTY+"") ;

							//出荷指示金額21
							m_med.setcreTShipOdrSHIP_ODR_AMOUNT(strAmount);
							this.md_SHIP_ODR_AMOUNT = Double.parseDouble(strAmount);

							String strShipOdrAmount = "";//中間値
			                String strShipOdrAmountExchRates = "";//出荷指示金額（邦貨）

							// =======================================
							//共通関数を利用し、邦貨の換算(出荷指示の登録)sww修正必要
							// =======================================
			                if(ex.doMarume(strAmount, this.mv_COMPANY_CD, this.mv_CURRNCY_CD, this.mv_EXCH_TYP,
			                						this.mv_DETAIL_ROUND_TYP, this.mv_BUSINEESS_OPR_DATE)){
			                    strShipOdrAmount = ex.getS_EXCH_AMOUNT();
			                }
//add by t-tou
//System.out.println("strShipOdrAmount ===" + strShipOdrAmount);
//System.out.println("this.mv_COMPANY_CD ===" + this.mv_COMPANY_CD);
//System.out.println("this.mv_CURRNCY_CD ===" + this.mv_CURRNCY_CD);
//System.out.println("this.mv_EXCH_TYP ===" + this.mv_EXCH_TYP);
//System.out.println("this.mv_DETAIL_ROUND_TYP ===" + this.mv_DETAIL_ROUND_TYP);
//System.out.println("this.mv_BUSINEESS_OPR_DATE ===" + this.mv_BUSINEESS_OPR_DATE);
			                if(ex.doExchAmount(strShipOdrAmount, this.mv_COMPANY_CD, this.mv_CURRNCY_CD,
			                			this.mv_EXCH_TYP, this.mv_DETAIL_ROUND_TYP, this.mv_BUSINEESS_OPR_DATE)){
			                    strShipOdrAmountExchRates = ex.getS_EXCH_AMOUNT();
//System.out.println("（doExchAmount）邦貨に換算成功、換算後値 ===" + strShipOdrAmountExchRates);
			                }
							//出荷指示金額（邦貨）＝共通関数仕様換算した邦貨22
							m_med.setcreTShipOdrSHIP_ODR_AMOUNT_EXCH_RATES(strShipOdrAmountExchRates);

							m_med.setcreTShipOdrCURRNCY_CD(this.mv_CURRNCY_CD);		//通貨コード23
							m_med.setcreTShipOdrPKG_UNIT_QTY(this.mv_PKG_UNIT_QTY);		//荷姿単位数入数24
							//25,26,27要らない
							m_med.setcreTShipOdrREMARKS(this.mv_REMARKS);			//備考28
							//2004.2.4追加15
/* add 2004.08.27 g-matsumoto */
							if(this.mv_CUS_DLV_KEY_CD.equals("")){
								this.mv_CUS_DLV_KEY_CD = strSHIP_ODR_NO;
							}
/* add-end 2004.08.27 g-matsumoto */
							m_med.setcreTShipOdrDLV_KEY_NO(this.mv_CUS_DLV_KEY_CD);		//納品キー番号29,30=0

							m_med.setcreTShipOdrTRANSPORT_CD(this.mv_TRANSPORT_CD);		//運送便コード31
							//輸送形態区分32要らない
							m_med.setcreTShipOdrALLCT_WH_CD(this.mv_SHIP_WH_CD);		//引当保管区33
							//振替元保管区34
							if ("10".equals(this.mv_DEPO_TYP) ){
								m_med.setcreTShipOdrTRANSFER_WH_CD("");
							}else if ("20".equals(this.mv_DEPO_TYP) ){
								m_med.setcreTShipOdrTRANSFER_WH_CD(this.mv_DEPO_WH_CD);
							}

/* add-start 2005.08.11 */
							//直送フラグ
							if (strDirectDlvFlg=="1"){
								m_med.setcreTShipOdrDIRECT_DLV_FLG("1");
							}else{
								m_med.setcreTShipOdrDIRECT_DLV_FLG("0");
							}
/* add-end 2005.08.11 */
							//製番
							m_med.setcreTShipOdrJOB_ODR_CD(m_med.getstrJOB_ODR_CD());

							//３５から４０まで0,1,0,0,0,0

							//出荷指示レコード作成
							if(m_med.gettblT_SHIP_ODR().create()!=SUCCESS){
//System.out.println("||***!!出荷指示レコードの作成失敗!!!");
							    throw new Exception();
							}

							// =======================================
							// 受注明細 TBL の更新(20040701追加)
							// =======================================
							//受注番号単位で出荷回数を更新する。(出荷回数+1,分納回数+1)
							m_med.setuptOdr_IN_ODRNO(this.mv_ODR_NO);

							//受注明細レコード更新
							if(m_med.gettblT_ODR().update()!=SUCCESS){
//System.out.println("||***!!受注明細コードの更新失敗!!!");
							    throw new Exception();
							}


							// =======================================
							//出荷伝票の登録
							// =======================================
							m_med.setcreTShipSlipSLIP_CD(strSLIP_CD);//伝票番号
							m_med.setcreTShipSlipITEM_CD(this.mv_ITEM_CD);				//品目番号2
							m_med.setcreTShipSlipCUST_ITEM_CD(this.mv_CUST_ITEM_CD);		//得意先品目番号3
							m_med.setcreTShipSlipPART_NAME(this.mv_PART_NAME);			//一般品名4
							m_med.setcreTShipSlipCUST_ODR_NO(this.mv_CUST_ODR_NO);			//得意先注文番号5

							m_med.setcreTShipSlipCUST_CD(this.mv_CUST_CD);				//得意先コード6
							m_med.setcreTShipSlipCUST_NAME(this.mv_CUST_ANAME);			//得意先名称7
							m_med.setcreTShipSlipDLV_LOC_CD(this.mv_DLV_LOC_CD);			//納品場所コード8
							m_med.setcreTShipSlipDLV_LOC_NAME_KANJI(this.mv_DLV_LOC_NAME_KANJI);	//納品場所名(漢字)9
							m_med.setcreTShipSlipBUYER_NAME(this.mv_BUYER_NAME);			//購買担当10

							//2004.2.4変更
							m_med.setcreTShipSlipCUS_DLV_KEY_CD(m_med.getcreTShipOdrDLV_KEY_NO());	//納品キー番号11
							m_med.setcreTShipSlipDESINATED_SHIP_DATE(this.mv_DESINATED_SHIP_DATE);	//出荷指定日12
							m_med.setcreTShipSlipDESINATED_DLV_DATE(this.mv_DESINATED_DLV_DATE);	//指定納期13
							//納入予定日の取得
							//if(!this.getPlusLeedDate(conn, strUserId, strBusinessName, "SCDL"))
							//{ throw new Exception(); }

							m_med.setcreTShipSlipSCDL_DLV_DATE(this.mv_SCDL_DLV_DATE);		//納入予定日14
							m_med.setcreTShipSlipPUCH_ODR_QTY_TOTAL(this.mv_PUCH_ODR_QTY_TOTAL);//総注文数量15

							m_med.setcreTShipSlipDLV_ODR_QTY(this.mv_DLV_ODR_QTY);			//納入指示数量16
							m_med.setcreTShipSlipSHIP_ODR_QTY(md_CALCULATION_SHIP_QTY+"");	//出荷指示数量17
							m_med.setcreTShipSlipUNIT_CD(this.mv_UNIT_CD_ORG);				//単位18
							m_med.setcreTShipSlipUNIT_PRICE(this.mv_ODR_UNIT_PRICE);		//単価19

							m_med.setcreTShipSlipINSPC_TYP(this.mv_INSPC_TYP);					//検査区分33
							//20040202仕様変更→受注明細の発注者備考を設定
							m_med.setcreTShipSlipCLIENT_REMARK_KANJI(this.mv_CLIENT_REMARK);	//発注者備考(漢字)34
							m_med.setcreTShipSlipCLIENT_BARCODE_INF(this.mv_CLIENT_BARCODE_INF);//発注者バーコード情報35

							//帳票出力F36 削除F37 0,0

							// =======================================
							//消費税金額計算(出荷伝票の登録)  ２０以下のfieldsの計算
							// =======================================
							//sww修正20040729開始
//Add by t-tou
//System.out.println("this.mv_CUST_CD = "+this.mv_CUST_CD);
//System.out.println("this.mv_COMPANY_CD = "+this.mv_COMPANY_CD);
//System.out.println("this.mv_CUST_ITEM_CD = "+this.mv_CUST_ITEM_CD);
//System.out.println("strShipOdrAmountExchRates = "+strShipOdrAmountExchRates);
							String taxAmount[] = this.doCalcuTaxAmount(m_med, this.mv_CUST_CD,
			                                                           //Mod Start 20131223 ma-jf
//											                           this.mv_COMPANY_CD, this.mv_CUST_ITEM_CD,
											                           this.mv_COMPANY_CD, this.mv_TAX_CD,
											                           //Mod End 20131223 ma-jf
                                                                       strShipOdrAmount, this.mv_CURRNCY_CD);

							//sww修正20040729終了
							m_med.setcreTShipSlipTAX_AMOUNT_1(taxAmount[0]);	// 税額１ 29
							m_med.setcreTShipSlipTAX_AMOUNT_2(taxAmount[1]);	// 税額２ 30
							m_med.setcreTShipSlipTAX_AMOUNT_3(taxAmount[2]);	// 税額３ 31

							//23,24,25,27,28値のくリア
							m_med.setcreTShipSlipEXTERNAL_TAX_SALES_AMOUNT("0");// 外税対象金額
							m_med.setcreTShipSlipINTERNAL_TAX_SALES_AMOUNT("0");// 内税対象金額
							m_med.setcreTShipSlipTAXFREE_SALES_AMOUNT("0");		// 非課税対象金額
							m_med.setcreTShipSlipEXTERNAL_TAX_AMOUNT("0");		// 消費税額（外税）
							m_med.setcreTShipSlipINTERNAL_TAX_AMOUNT("0");		// 消費税額（内税）

							//税額1 ＋ 税額2 ＋ 税額3 （和和和）
                            String sTmpTax = Calculate.add(taxAmount[0], taxAmount[1]);
                            sTmpTax = Calculate.add(sTmpTax, taxAmount[2]);
                            double tmpTax = Double.parseDouble(sTmpTax);
							//double tmpTax = Double.parseDouble(taxAmount[0])
							//			+Double.parseDouble(taxAmount[1])
							//			+Double.parseDouble(taxAmount[2]);

							if ("1".equals(this.mv_TAX_KBN)){
								//消費税額（外税）27
								m_med.setcreTShipSlipEXTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
								//外税対象金額 23
								m_med.setcreTShipSlipEXTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
							} else
							if ("5".equals(this.mv_TAX_KBN) || "9".equals(this.mv_TAX_KBN)){
								//消費税額（内税）28
								m_med.setcreTShipSlipINTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
								//内税対象金額 24
								m_med.setcreTShipSlipINTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
							} else
							if ("0".equals(this.mv_TAX_KBN)){
								//非課税対象金額 25
								m_med.setcreTShipSlipTAXFREE_SALES_AMOUNT(strShipOdrAmount);
							}

							//消費税金額 21 の計算	（和）
							tmpTax = Double.parseDouble(m_med.getcreTShipSlipEXTERNAL_TAX_AMOUNT())
									+Double.parseDouble(m_med.getcreTShipSlipINTERNAL_TAX_AMOUNT());
							//消費税金額 21
							m_med.setcreTShipSlipTAX_AMOUNT(String.valueOf(tmpTax));

							// 税抜売上金額 26		（和和和差）
							tmpTax = Double.parseDouble(m_med.getcreTShipSlipEXTERNAL_TAX_SALES_AMOUNT())
									+Double.parseDouble(m_med.getcreTShipSlipINTERNAL_TAX_SALES_AMOUNT())
									+Double.parseDouble(m_med.getcreTShipSlipTAXFREE_SALES_AMOUNT())
									-Double.parseDouble(m_med.getcreTShipSlipINTERNAL_TAX_AMOUNT());
							m_med.setcreTShipSlipTAX_CREDIT_SALES_AMOUNT(String.valueOf(tmpTax));

                            // 税抜売上金額（邦貨）32
                            String tmpTaxExchRates = "0";
                            if(ex.doExchAmount(String.valueOf(tmpTax), this.mv_COMPANY_CD, this.mv_CURRNCY_CD,
                                               this.mv_EXCH_TYP, this.mv_DETAIL_ROUND_TYP, this.mv_BUSINEESS_OPR_DATE)){
                                tmpTaxExchRates = ex.getS_EXCH_AMOUNT();
                                //System.out.println("（税抜売上金額）邦貨に換算成功、換算前値 ===" + tmpTax);
                                //System.out.println("（税抜売上金額）邦貨に換算成功、換算後値 ===" + tmpTaxExchRates);
                            }
							m_med.setcreTShipSlipOWN_CUR_TAXCREDIT_SALES_AMOUNT(tmpTaxExchRates);

							//出荷指示金額 20 //sww修正20040729
							m_med.setcreTShipSlipSHIP_ODR_AMOUNT(String.valueOf(tmpTax));

							//出荷指示金額(税込) 22 （和）
							tmpTax = tmpTax + Double.parseDouble(m_med.getcreTShipSlipTAX_AMOUNT());
							m_med.setcreTShipSlipSHIP_ODR_AMOUNT_TAX(String.valueOf(tmpTax));

							//sww追加計算20040730終了
							//以前の金額計算のsww削除20040730終了
							//出荷伝票レコード作成
							if(m_med.gettblT_SHIP_SLIP().create()!=SUCCESS){
								//System.out.println("||***!!出荷伝票レコードの作成失敗!!!");
							    throw new Exception();
							}

							// =======================================
							// 出荷計画ＴＢＬの更新
							// =======================================
							//受注番号
							m_med.setupTAnsDlvDateIN_ODRNO(this.mv_ODR_NO);
							//分納項番
							m_med.setupTAnsDlvDateIN_PARTDLVSEQNO(this.mv_PART_DLV_SEQ_NO);
							//sww修正必要double,String
							this.mv_REST_SHIP_ODR_QTY = String.valueOf(Double.parseDouble(this.mv_REST_SHIP_ODR_QTY) - md_CALCULATION_SHIP_QTY);
							//出荷指示残数量
							m_med.setupTAnsDlvDateREST_SHIP_ODR_QTY(this.mv_REST_SHIP_ODR_QTY);
							if (Double.parseDouble(this.mv_REST_SHIP_ODR_QTY) == 0) {
								//出荷指示完了フラグ
								m_med.setupTAnsDlvDateSHIP_ODR_CMPLT_FLG("1");
							}else{
								//出荷指示完了フラグ
								m_med.setupTAnsDlvDateSHIP_ODR_CMPLT_FLG("0");
							}

							//出荷計画の更新
							if(m_med.gettblT_ANS_DLV_DATE().update()!=SUCCESS){
								//System.out.println("||***!!出荷計画レコードの更新失敗!!!");
							    throw new Exception();
							}
						}

						//=======================================
						//出荷指示不可数量>0の場合、登録更新処理
						//=======================================
						if ( md_DISABLE_QTY > 0) {

//System.out.println("出荷指示不可リストレコード作成 開始");
							m_med.setcreTUnShipListCUST_CD(this.mv_CUST_CD);			//得意先コード2
							m_med.setcreTUnShipListACPT_ODR_CD(this.mv_ODR_NO);			//受注番号3
							m_med.setcreTUnShipListPART_DLV_SEQ_NO(this.mv_PART_DLV_SEQ_NO);	//分納項番4
							m_med.setcreTUnShipListITEM_CD(this.mv_ITEM_CD);			//品目番号5

							m_med.setcreTUnShipListUN_SHIP_QTY(md_DISABLE_QTY+"");		//出荷指示不可数量6
//							this.mv_UN_SHIP_RSN = "KU00032 指定保管区から在庫付属のため出荷出来ません" ;

							// 04.08.16add by g.matsumoto コネクションを渡して、採番の準備
							logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strPlantCd);
							// 出荷指示対象データの取得に失敗しました。
							String strMsgCd = "KU00032";
							String strDataString = "(SBM0605)受注番号[" + this.mv_ODR_NO + "] 分納項番[" + this.mv_PART_DLV_SEQ_NO + "]";
							businessMsgAcc.init(conn);
							businessMsg.setBusinessOperatingName(strBusinessName);
							businessMsg.setUser(strUserId);
							businessMsg.setPlantCode(strPlantCd);
							businessMsg.setLogCode(logCd.getNo());
							businessMsg.setData(strDataString);
							businessMsg.setMessageCode(strMsgCd);
							businessMsgAcc.add(businessMsg);
							if(this.getSysMsg(strMsgCd)){
								CoreTools.write(strMsgCd+" "+this.m_vMSG);
							}else{
								throw new Exception();
							}
							this.mv_UN_SHIP_RSN = strMsgCd+" "+this.m_vMSG;

							m_med.setcreTUnShipListUN_SHIP_RSN(this.mv_UN_SHIP_RSN);	//出荷指示不可理由7
//04.08.29.MOD						m_med.setcreTUnShipListWH_CD(this.mv_WH_CD);				//保管区コード8
							m_med.setcreTUnShipListWH_CD(this.mv_SHIP_WH_CD);				//保管区コード8
//System.out.println("m_med.getcreTUnShipListCUST_CD" + m_med.getcreTUnShipListCUST_CD());
//System.out.println("m_med.setcreTUnShipListACPT_ODR_CD" + m_med.getcreTUnShipListACPT_ODR_CD());
//System.out.println("m_med.setcreTUnShipListPART_DLV_SEQ_NO" + m_med.getcreTUnShipListPART_DLV_SEQ_NO());
//System.out.println("m_med.setcreTUnShipListITEM_CD" + m_med.getcreTUnShipListITEM_CD());
//System.out.println("m_med.setcreTUnShipListUN_SHIP_QTY" + m_med.getcreTUnShipListUN_SHIP_QTY());
//System.out.println("m_med.setcreTUnShipListUN_SHIP_RSN" + m_med.getcreTUnShipListUN_SHIP_RSN());
//System.out.println("m_med.setcreTUnShipListWH_CD" + m_med.getcreTUnShipListWH_CD());

							//出荷ラベルレコード作成
							if(m_med.gettblT_UN_SHIP_LIST().create()!=SUCCESS){
//System.out.println("||***!!出荷指示不可リストレコードの作成失敗!!!");
							    throw new Exception();
							}
						}


//-----------------------------------------------------------------------------
//		注文情報取込処理（ここまで）
//-----------------------------------------------------------------------------
//System.out.println("||----------[("+iNum+")番目の出荷指示バッチ処理→成功]--||");
//System.out.println("\n******>>>>出荷指示バッチ処理処理END <<<<******");
						//対処品目番号がバッチ処理が正常に終わった場合 COMMITする
						conn.commit();
					}//while-end読込終了
				   } catch (Exception e) {
					   // エラー詳細情報を設定
					   String strDataString = "(SBM0605)受注番号[" + this.mv_ODR_NO + "] 分納項番[" + this.mv_PART_DLV_SEQ_NO + "]";
					   businessMsg.setData(strDataString);
					   throw e;
				   }
					if(iNum==0){
//System.out.println("\n||*****出荷指示対象データがありません！！");
					}
				}//if-end読込成功終了
				//バッチ処理END
			}catch(Exception e) {
//add by t-tou 2004/08/11
		e.printStackTrace();
//end
				try {
					errFlg = true;
					//conn.rollback();
					conn.rollback();
					// コネクションを渡して、採番の準備
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strPlantCd);
					// 出荷指示対象データの取得に失敗しました。
					String strMsgCd = "KU00010";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strPlantCd);
					businessMsg.setLogCode(logCd.getNo());
					businessMsg.setMessageCode(strMsgCd);
					businessMsgAcc.add(businessMsg);
					if(this.getSysMsg(strMsgCd)){
						CoreTools.write(strMsgCd+" "+this.m_vMSG);
					}else{
						throw new Exception();
					}
					conn.commit();
				} catch (SQLException ex) {
					ex.printStackTrace();
					errFlg = true;
				} catch (FoundationException ex) {
					ex.printStackTrace();
					errFlg = true;
				}
			}
//System.out.println("\n||******>>>> ("+this.mv_BUSINEESS_OPR_DATE+")の出荷指示バッチ処理END <<<<******||");
	    } catch (Exception e) {
			try {
				errFlg = true;
				conn.rollback();
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strPlantCd);
				// 出荷指示バッチ処理にて致命的なエラーが発生しました。
				String strMsgCd = "KU00003";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
				businessMsgAcc.add(businessMsg);
				if(this.getSysMsg(strMsgCd)){
					CoreTools.write(strMsgCd+" "+this.m_vMSG);
				}
				conn.commit();
			} catch (SQLException ex) {
				errFlg = true;
				ex.printStackTrace();
			} catch (FoundationException ex) {
				errFlg = true;
				ex.printStackTrace();
			}
	    } finally {
				//バッチ終了メッセージ登録
				try {
					
					// コネクションを渡して、業務メッセージ準備
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strPlantCd);
					
					// コネクションを渡して、採番の準備
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strPlantCd);
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
						String strMsgCd = null;
						// 業務メッセージ追加
						if(errFlg) {
							strMsgCd = "KU00111"; // 異常終了場合
						} else {
							strMsgCd = "KU00002"; // 正常終了場合
						}
						String strDataString = "(SBM0606)<< 出荷指示バッチ処理終了 >>";
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
		public medKU0010B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKU0010B001 med) throws BatchAppException
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
