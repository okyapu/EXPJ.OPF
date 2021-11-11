/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010.KQ0010B001;

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
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
//import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.util.Converter;
//-----------------------------------------------------------------------------
//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.23 $ $Date: 2015/12/03 08:12:34 $
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
	public medKQ0010B001 m_med=null;

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
	public CtrlMain(medKQ0010B001 med, BatchAppConductor cdr) throws BatchAppException
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

	/** 日本円の通貨コード */
	private String jpCurrency = null;

	/** 出荷準備L/T */
	private int shukka_jyunbi_day = 0;

	/** 短納期設定日 */
	private int tan_nouki_day = 0;

	/** EDI 情報区分コード */
	private final static String INFO_TYP_0201  = "0201";	//所要計画情報
	private final static String INFO_TYP_0203  = "0203";	//予約注文情報
	private final static String INFO_TYP_0501  = "0501";	//内示注文情報
	private final static String INFO_TYP_0502  = "0502";	//確定注文情報
	private final static String INFO_TYP_0503  = "0503";	//変更注文情報
	private final static String INFO_TYP_0504  = "0504";	//注文取消情報

	/** RN 情報区分コード */
	private final static String INFO_TYP_03A04      = "03A04";		//注文新規
	private final static String INFO_TYP_03A08_CHG  = "03A08_CHG";	//注文変更
	private final static String INFO_TYP_03A08_OFF  = "03A08_OFF";	//注文打切
	private final static String INFO_TYP_03A08_CMP  = "03A08_CMP";	//注文完納
	private final static String INFO_TYP_03A09      = "03A09";		//注文削除
	private final static String INFO_TYP_04A04      = "04A04";		//見込

	/** 納期回答 情報区分コード */
	private final static String INFO_TYP_0702      = "0702";		//納期回答

	/** 注文区分値 */
	private final static String ODR_TYP_MIKOMI = "1";
	private final static String ODR_TYP_NAIJI = "2";
	private final static String ODR_TYP_KAKUTEI = "3";

	/** 預託区分値 */
	private final static String YOTAKU_NORMAL = "10";
	private final static String YOTAKU_YOTAKU = "20";

	/** 処理区分 */
	private final static String	PROC_TYP_NEW = "1";		//新規
	private final static String	PROC_TYP_UPD = "2";		//変更
	private final static String	PROC_TYP_CAN = "3";		//取消・削除
	private final static String	PROC_TYP_STP = "4";		//打切
	private final static String	PROC_TYP_CPL = "5";		//完納
	private final static String	PROC_TYP_RSV = "6";		//予約

	/** システム処理区分 */
	private final static String	SYS_PROC_TYP_MI = "0";
	private final static String	SYS_PROC_TYP_SUMI = "1";
	private final static String	SYS_PROC_TYP_NG = "2";
	private final static String	SYS_PROC_TYP_ETC = "9";

	/** システムパラメータ読み出しキー */
	private final static String	SYSCLASS_JP_CUR = "JP_CUR";
	private final static String	SYSCLASS_SHUKKA_LT = "SHIP_LT";
	private final static String	SYSCLASS_TAN_NOUKI = "DLV_DATE_CDT";
	private final static String	SYSCLASS_PLANT_BATCH = "PLANT_BATCH";
	private final static String	SYSCLASS_CORP_CD = "UNIFIED_CORP_CD";

	/** 省略時のDB登録するデフォルト値 */
	private final static String DEFAULT_SPCL_PRICE_TYP = "0";
	private final static String DEFAULT_DEPO_TYP = YOTAKU_NORMAL;

	/** 起動引数 */
	private String strBusinessName = null;
	private String strUserId = null;
	private String strPlantCd = null;
	private String strMsgPlantCd = null;
	private String strLocale = null;
	private ResourceBundle strResource = null; 

	/** DBコネクション */
    private IDbConnection conn = null;

	private String m_vMSG = "";				//ログファイル用メッセージ

	/** ExchAmount　外貨計算クラスのインスタンス */
	private ExchAmount exch = null;

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
	 * 入力データチェック処理
	 *
	 * @return true:正常　false:異常
	 */
	private boolean chkInData() throws ParseException,Exception
	{
		/**
		 * ・IF情報管理番号の必須チェック
		 * ・注文区分の必須チェック、範囲チェック
		 * ・顧客品番の必須チェック
		 * ・顧客コードの必須チェック
		 * ・顧客注文番号の必須チェック
		 * ・指定納期の必須チェック、日付形式チェック
		 * ・注文数量の必須チェック、数字チェック、１以上チェック
		 * ・単価の数字チェック、０以上チェック
		 * ・指定納期が、当日（業務日付）または未来日であることをチェックする
		 */
		boolean ok_flg = true;

		if(m_med.getg_ODR_TYP() != null && "0".equals(m_med.getg_ODR_TYP())){
			//注文区分が０の場合は、取り込まれないので、チェックしないでＯＫにする
			return ok_flg;
		}
		//注文区分（必須チェック／範囲チェック）
		if(m_med.getg_ODR_TYP() == null || "".equals(m_med.getg_ODR_TYP()) ||
			(!"2".equals(m_med.getg_ODR_TYP()) && !"3".equals(m_med.getg_ODR_TYP()))){
			//注文区分が省略または範囲外
			ok_flg = false;
			this.writeLogMessage("KQ00101",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00101");
		}
		//顧客品番（必須チェック）
		if(m_med.getg_CUST_ITEM_CD() == null || "".equals(m_med.getg_CUST_ITEM_CD()) ){
			//顧客品番が省略
			ok_flg = false;
			this.writeLogMessage("KQ00102",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00102");
		}
		//顧客コード（必須チェック）
		if(m_med.getg_CUST_CD() == null || "".equals(m_med.getg_CUST_CD()) ){
			//顧客コードが省略
			ok_flg = false;
			this.writeLogMessage("KQ00103",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00103");
		}
		//顧客注文番号（必須チェック）
		if(m_med.getg_CUST_ODR_NO() == null || "".equals(m_med.getg_CUST_ODR_NO()) ){
			//顧客注文番号が省略
			ok_flg = false;
			this.writeLogMessage("KQ00149",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00149");
		}

		//通貨コード（省略可／指定があってもチェックなし）
		//納品場所（省略可／指定があってもチェックなし）
		//受注単位（省略可／指定があってもチェックなし）
		//受注単価（省略可／指定がある場合は０以上であること）
		if(m_med.getg_UNIT_COST() != null && m_med.getg_UNIT_COST().doubleValue() < 0){
			//設定値が範囲外
			ok_flg = false;
			this.writeLogMessage("KQ00123",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.writeLogMessageInfo(CoreTools.getRBString("Expj.ODR_UNIT_PRICE", strResource), m_med.getg_UNIT_COST().toString());
			this.setErrWngMessage("1","KQ00123");
		}
		//受注数量（必須チェック／0より大きいこと）
		if(m_med.getg_PUCH_ODR_QTY() == null){
			ok_flg = false;
			this.writeLogMessage("KQ00108",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00108");
		}else if(m_med.getg_PUCH_ODR_QTY().doubleValue() < 0){
			//設定値が範囲外
			ok_flg = false;
			this.writeLogMessage("KQ00122",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.writeLogMessageInfo(CoreTools.getRBString("Expj.ODR_QTY_4", strResource), m_med.getg_PUCH_ODR_QTY().toString());
			this.setErrWngMessage("1","KQ00122");
		}
		//納入番号（省略可／指定があってもチェックなし）
		//納品キー番号（省略可／指定があってもチェックなし）
		//備考（省略可／指定があってもチェックなし）
		//見積番号（省略可／指定があってもチェックなし）
		//指定納期（必須チェック／過去日不可）
		if(m_med.getg_DESINATED_DLV_DATE() == null || "".equals(m_med.getg_DESINATED_DLV_DATE()) ){
			//指定納期が省略
			ok_flg = false;
			this.writeLogMessage("KQ00105",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
			this.setErrWngMessage("1","KQ00105");
		}else{
			// =======================================
			//指定日付が過去日でないことをチェックする
			// =======================================
			/**　●●●●●●●●●●●●●●●●●●●
			 * 引込対象外と同じチェック
			 * 引込対象外のときエラーにしないのなら、日付の比較チェックはやってはダメ
			 *
			 */
			//SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");

			//指定納期
			GregorianCalendar inpDate = new GregorianCalendar();
		//	inpDate.setTime(sdi.parse(m_med.getg_DESINATED_DLV_DATE()));
			inpDate.setTime(Converter.strToDate(m_med.getg_DESINATED_DLV_DATE(), "yyyy/MM/dd"));
				//業務日付
			GregorianCalendar gyoDate = new GregorianCalendar();
		//	gyoDate.setTime(sdi.parse(m_med.getstrBUSINESS_OPR_DATE()));
			gyoDate.setTime(Converter.strToDate(m_med.getstrBUSINESS_OPR_DATE(), "yyyy/MM/dd"));
			//指定日付＜業務日付
			if(inpDate.getTime().compareTo(gyoDate.getTime()) < 0){
				//業務日付より過去日は警告 2004/1/27
//				ok_flg = false;
				this.writeLogMessage("KQ00106",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
				this.writeLogMessageInfo(CoreTools.getRBString("Expj.DESINATED_DLV_DATE",strResource), m_med.getg_DESINATED_DLV_DATE());
				this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6211", strResource), m_med.getstrBUSINESS_OPR_DATE());
				this.setErrWngMessage("2","KQ00106");
			}
		}
		return ok_flg;
	}
	/**
	 * 金額単位変換処理
	 *
	 * @param kin 変換対象金額
	 * @param inCur 変換対象の通貨コード
	 * @param outCur 変換後の通貨コード
	 * @return 変換後の金額
	 */
	private Double cnvQty(boolean exch_flg,String strAmount,String inCur,medKQ0010B001 wst) throws Exception,BatchAppException
	{
		// =======================================
		// 為替レートを読み込んで、金額変換する
		// =======================================
		//if(inCur.equals(this.jpCurrency)){
			//日本円の場合は、そのまま返す
			//System.out.println("入力と出力の通貨コードが同じ");
			//return new Double(kin);
		//}
		//String strAmount = NumberFormat.getInstance().format(kin).replaceAll(",","");
		String strCompanyCd = wst.getstrCOMPANY_CD();
		String strCurrcyCd = inCur;
		String strExchTyp = String.valueOf(wst.getstrEXCH_TYP().intValue());
		String strRoundTyp = wst.getstrROUND_TYP();
		String strDate = wst.getstrBUSINESS_OPR_DATE();
        double strRv ;
        if(exch_flg)
        {
            if(exch.doExchAmount(strAmount,strCompanyCd,strCurrcyCd,strExchTyp,strRoundTyp,strDate)){
                strRv = exch.getD_EXCH_AMOUNT();
            }else{
                this.writeLogMessage("KQ00138",Integer.toString(wst.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6212", strResource), strAmount);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), strCompanyCd);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.CUR_CD", strResource), strCurrcyCd);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6213", strResource), strExchTyp);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.ROUND_TYP_1", strResource), strRoundTyp);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt5857", strResource), strDate);
                this.setErrWngMessage("1","KQ00138");
                return null;
            }
        }
        else
        {
            if(exch.doMarume(strAmount,strCompanyCd,strCurrcyCd,strExchTyp,strRoundTyp,strDate)){
                strRv = exch.getD_EXCH_AMOUNT();
            }else{
                this.writeLogMessage("KQ00138",Integer.toString(wst.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6212", strResource), strAmount);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), strCompanyCd);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.CUR_CD", strResource), strCurrcyCd);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6213", strResource), strExchTyp);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.ROUND_TYP_1", strResource), strRoundTyp);
                this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt5857", strResource), strDate);
                this.setErrWngMessage("1","KQ00138");
                return null;
            }
        }
		return new Double(strRv);
	}
    /**
     * 出荷指定日計算処理
     *
     * @param KQ0010010Struct Struct
     * @return 算出後の出荷指定日
     */
    private String cnvShipDate(medKQ0010B001 wst, String plantCd) throws ParseException,FoundationException,BatchAppException,Exception
    {
        // =======================================
        // 出荷指定日を計算する
        // =======================================
        // 出荷指定日　＝　指定納期　－　運送日数
        // この計算処理では、カレンダを考慮します。
        //
        String rv = null;
        //SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");

        //指定納期
        GregorianCalendar inpDate = new GregorianCalendar();
//	    inpDate.setTime(sdi.parse(wst.getstrDESINATED_DLV_DATE()));
        inpDate.setTime(Converter.strToDate(wst.getstrDESINATED_DLV_DATE(), "yyyy/MM/dd"));
        //業務日付
        GregorianCalendar gyoDate = new GregorianCalendar();
	//  gyoDate.setTime(sdi.parse(m_med.getstrBUSINESS_OPR_DATE()));
        gyoDate.setTime(Converter.strToDate(m_med.getstrBUSINESS_OPR_DATE(), "yyyy/MM/dd"));
        //運送日数
        int unso_day = wst.getstrTRANSPORT_LT().intValue();
        //出荷準備L/T
        int jyun_day = shukka_jyunbi_day;

        //指定納期を計算基準日にする
        java.util.Date wkDate = inpDate.getTime();

        String tempPlantCd;
        if ((plantCd == null) || (plantCd.length() == 0)) {
            tempPlantCd = strPlantCd;
        }
        else {
            tempPlantCd = plantCd;
        }

        //業務日付計算
        //指定納期から運送日数を引く
        WorkCalendar wkd = new WorkCalendar(conn,this.strUserId,				//ユーザコード
                this.strBusinessName,											//業務コード
                tempPlantCd,														//工場コード
                wkDate,															//対象日付
                0 - unso_day - jyun_day,													//加算日
                true															//前倒しフラグ
                );
        wkDate = wkd.calcDate();		//計算結果
        if(wkDate == null){
            //エラー
            this.writeLogMessage("KQ00140",Integer.toString(wst.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
            this.setErrWngMessage("E","KQ00140");
            this.writeErrWngMessage();
            throw new Exception();
        }

        //過去日の場合は、業務日付を設定
//      String tmpSa = new String(sdi.format(gyoDate.getTime()));
        String tmpSa = new String(Converter.dateToStr(gyoDate.getTime(), "yyyy/MM/dd"));
        //String tmpSb = new String(sdi.format(wkDate));
		String tmpSb = new String(Converter.dateToStr(wkDate, "yyyy/MM/dd"));
		if (DateTool.compareYMD(tmpSb, tmpSa) < 0) {
       //   rv = new String(sdi.format(gyoDate.getTime()));
       		rv = new String(Converter.dateToStr(gyoDate.getTime(), "yyyy/MM/dd"));
        }else{
        //  rv = new String(sdi.format(wkDate));
        	rv = new String(Converter.dateToStr(wkDate, "yyyy/MM/dd"));
         }

        return rv;
	}
	/**
	 * 日付計算処理
	 *
	 * @param KQ0010010Struct Struct
	 * @return 算出後の日
	 */
	private java.util.Date calcWorkDate(java.util.Date dateValue,int addValue) throws ParseException,FoundationException,BatchAppException,Exception
	{
		// =======================================
		// 日付計算
		// =======================================
		String rv = null;
		java.util.Date wkDate = dateValue;
		//業務日付計算
		WorkCalendar wkd = new WorkCalendar(conn,this.strUserId,				//ユーザコード
				this.strBusinessName,											//業務コード
				strPlantCd,														//工場コード
				wkDate,															//対象日付
				addValue,														//加算日
				((addValue < 0) ? true : false)								//前倒しフラグ
				);
		wkDate = wkd.calcDate();		//計算結果
		if(wkDate == null){
			return null;
		}
		return wkDate;
	}
	private String calcWorkDate(String dateValue,int addValue) throws ParseException,FoundationException,BatchAppException,Exception
	{
		String rv = null;
		//SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
	//	java.util.Date wkDate = sdi.parse(dateValue);
		java.util.Date wkDate = Converter.strToDate(dateValue, "yyyy/MM/dd");
	//	return new String(sdi.format(calcWorkDate(wkDate,addValue)));
		return new String(Converter.dateToStr(calcWorkDate(wkDate,addValue), "yyyy/MM/dd"));
	}


	/**
	 * エラー/警告メッセージ処理用内部クラスＶＯ
	 *
	 */
	private class msgVO
	{
		String STATUS;
		String MSSGE_CD;
		String MSSGE;
		String CUST_CD;
		String CUST_ITEM_CD;
		String ITEM_CD;
		String CUST_ODR_NO;
		String CUST_CHRG_PSN_CD;
		String ERR_REC_TYPE;
		String PROC_TYP;
		Double ACTUAL_UNIT_PRICE;
		Double MASTER_UNIT_PRICE;
		Double QTY;
		String ODR_NO;
		String DESINATED_DLV_DATE;
		String SLIP_NO;
		Double IF_CTL_NO;
		Double ODR_SEQ;								// 2004/1/5
	}
	List msgList = new ArrayList();
	/**
	 * エラー/警告メッセージ設定(エラー警告リスト)
	 *
	 * @param String status	(E:エラー/W:警告)
	 * @param String msgCd		(エラーコード)
	 */
	private void setErrWngMessage(String status,String msgCd) throws Exception,BatchAppException
	{
		msgVO ms = new msgVO();

		ms.STATUS = status;
		ms.MSSGE_CD = msgCd;
		AlarmMessage am = new AlarmMessage(msgCd,Integer.toString((m_med.getg_ODR_INFO_COM_IF_CTRL_NO()==null) ? 0 : m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
		ms.MSSGE = am.getMessage();
		if(ms.MSSGE.indexOf("]") != -1){
			ms.MSSGE = ms.MSSGE.substring(ms.MSSGE.indexOf("]") + 1).trim();
		}
		ms.CUST_CD = m_med.getg_CUST_CD();
		ms.CUST_ITEM_CD = m_med.getg_CUST_ITEM_CD();
		ms.ITEM_CD = (m_med.getstrITEM_CD() == null) ? "" : m_med.getstrITEM_CD();
		ms.CUST_ODR_NO = m_med.getg_CUST_ODR_NO();
		ms.CUST_CHRG_PSN_CD = m_med.getstrOWN_PERSON_CD();
 		if(ODR_TYP_KAKUTEI.equals(m_med.getg_ODR_TYP())){ //確定注文以外は内示にする
	 		ms.ERR_REC_TYPE = "2";
 		}else{
	 		ms.ERR_REC_TYPE = "1";
 		}
		ms.PROC_TYP = (m_med.getg_PROC_TYP() == null) ? "" : m_med.getg_PROC_TYP();
		ms.ACTUAL_UNIT_PRICE = (m_med.getg_UNIT_COST() == null) ? new Double(0) : m_med.getg_UNIT_COST();
		ms.MASTER_UNIT_PRICE = (m_med.getstrUNIT_PRICE() == null) ? new Double(0) : m_med.getstrUNIT_PRICE();
		ms.QTY = (m_med.getg_PUCH_ODR_QTY() == null) ? new Double(0) : m_med.getg_PUCH_ODR_QTY();
		ms.ODR_NO = (m_med.getstrODR_NO() == null) ? "" : m_med.getstrODR_NO();
		ms.DESINATED_DLV_DATE = (m_med.getstrDESINATED_DLV_DATE() == null) ? "" : m_med.getstrDESINATED_DLV_DATE();
		if(ms.DESINATED_DLV_DATE == null || "".equals(ms.DESINATED_DLV_DATE)){
			ms.DESINATED_DLV_DATE = (m_med.getg_DESINATED_DLV_DATE() == null) ? "" : m_med.getg_DESINATED_DLV_DATE();
		}
		ms.SLIP_NO = "";		//受注では設定しない
		ms.IF_CTL_NO = m_med.getg_ODR_INFO_COM_IF_CTRL_NO();
		ms.ODR_SEQ = m_med.getg_ODR_SEQ();								// 2004/1/5
		msgList.add(ms);
	}
	/**
	 * エラー/警告メッセージ書き込み処理(エラー警告リスト)
	 */
	private void writeErrWngMessage() throws Exception,BatchAppException
	{
		try{
		    conn.rollback();
	    } catch(Exception e) {
            e.printStackTrace();
        }
		msgVO mv = null;
		String msgCd = "";
		String msgBody = "";
		String msgStatus = "2";
		if(msgList.size() > 0){
			for(int i = 0 ; i < msgList.size(); i++){
				mv = (msgVO)msgList.get(i);
				msgCd += "[" + mv.MSSGE_CD + "]";
				msgBody += "[" + mv.MSSGE + "]";
				if(mv.STATUS.equals("1")){
					msgStatus = mv.STATUS;
				}
			}
			if(!msgCd.equals("")){
				if(m_med.getgetSEQ_ERR_WNG_LST().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetSEQ_ERR_WNG_LST().next() == false){
					//エラー警告リスト番号採番エラー
					this.writeLogMessage("KQ00143");
					throw new Exception();
				}
				m_med.seterrMSSGE_CD(msgCd);
				m_med.seterrMSSGE(msgBody);
				m_med.seterrSTATUS(msgStatus);
				m_med.seterrCUST_CD(mv.CUST_CD);
				m_med.seterrCUST_ITEM_CD(mv.CUST_ITEM_CD);
				m_med.seterrITEM_CD(mv.ITEM_CD);
				m_med.seterrCUST_ODR_NO(mv.CUST_ODR_NO);
				m_med.seterrCUST_CHRG_PSN_CD(mv.CUST_CHRG_PSN_CD);
				m_med.seterrERR_REC_TYPE(mv.ERR_REC_TYPE);
				m_med.seterrPROC_TYP(mv.PROC_TYP);
				m_med.seterrACTUAL_UNIT_PRICE(mv.ACTUAL_UNIT_PRICE);
				m_med.seterrMASTER_UNIT_PRICE(mv.MASTER_UNIT_PRICE);
				m_med.seterrQTY(mv.QTY);
				m_med.seterrODR_NO(mv.ODR_NO);
				m_med.seterrDESINATED_DLV_DATE(mv.DESINATED_DLV_DATE);
				m_med.seterrSLIP_NO(mv.SLIP_NO);
				m_med.seterrIF_CTL_NO(mv.IF_CTL_NO);
				m_med.seterrODR_SEQ(mv.ODR_SEQ);

				int rv = m_med.getwriteErrWngLst().create();
			}
			try {
		        conn.commit();
		    } catch(Exception e) {
                e.printStackTrace();
            }
		}
		msgList = new ArrayList();
	}
	/**
	 * エラー/警告メッセージリセット処理(エラー警告リスト)
	 */
	private void resetErrWngMessage() throws Exception,BatchAppException
	{
		try {
		    conn.rollback();
		} catch(Exception e) {
            e.printStackTrace();
        }
		msgList = new ArrayList();
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
		System.out.println(am.getMessage(CoreTools.getLocale(strUserId)));
	}
	/**
	 * エラー/警告メッセージログ出力処理(IF情報管理番号埋め込み)
	 *
	 * @param String メッセージコード
	 * @param String IF情報管理番号
	 */
	private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException
	{
		ExpjMessage am = new ExpjMessage(msgCd,if_no);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
		System.out.println(am.getMessage(CoreTools.getLocale(strUserId)));
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
		System.out.println(am.getMessage());
	}
//-----------------------------------------------------------------------------

	/**
	 * CtrlMainクラスの標準コンストラクタ
	 *
	 * @return なし
	 */
	public CtrlMain(medKQ0010B001 med) throws BatchAppException
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
/*

		// todo: ここにユーザ定義コードを記述してください

*/
//-----------------------------------------------------------------------------

		// デフォルトアクセサメソッド
       // 初期化
        int nret = 0;
        List WhCdList = new ArrayList();
        List YukouSuList = new ArrayList();

       	// エラーリスト
		List errCodeList = new ArrayList();

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
		String property = "OrteusUserDic";
		strLocale = CoreTools.getLocale(strUserId);
		strResource = CoreTools.getResourceBundle(property, strLocale);
		

		// パラメータ確認
		//System.out.println(">>>PRG_NAM:" + args[0]);	// 業務名
		//System.out.println(">>>USER_ID:" + args[1]);	// ユーザＩＤ
		//System.out.println(">>>PLNT_CD:" + args[2]);	// 工場コード

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
				String strMsgCd = "KQ00301";
				String strDataString = "(SBM0602)<< 注文情報取込バッチ処理開始 >>";
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
//System.out.println("\n******>>>> 注文情報取込対象データ取得スタート <<<******");
//●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●
//-----------------------------------------------------------------------------
//		注文情報取込処理（ここから）
//-----------------------------------------------------------------------------
			//	SimpleDateFormat sdi = new SimpleDateFormat("yyyy/MM/dd");
				exch = new ExchAmount(conn);

				// =======================================
				// 自社情報の取得
				// =======================================
				if(m_med.getgetCompanyInfo().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetCompanyInfo().next() == false || m_med.getstrCOMPANY_CD() == null || "".equals(m_med.getstrCOMPANY_CD())){
					//自社情報が無い/複数件
					this.writeLogMessage("KQ00039");
					this.setErrWngMessage("1","KQ00039");
					this.writeErrWngMessage();
					throw new Exception();
				}

				//=======================================
				// 利用者情報取得
				//=======================================
				m_med.setstrUSER_CD(strUserId);
				if(m_med.getgetUserInfo().read() != SUCCESS){
					throw new Exception();
				}
                else if(m_med.getgetUserInfo().next() == false)
                {
					//ユーザ情報が無い/複数件
					this.writeLogMessage("KQ00025");
					this.writeLogMessageInfo(CoreTools.getRBString("Expj.USER_CD", strResource), m_med.getstrUSER_CD());
					this.setErrWngMessage("1","KQ00025");
					this.writeErrWngMessage();
					throw new Exception();
				}

				//=======================================
				// バッチ用工場コード取得
				//=======================================
				m_med.setsysCLASS_CODE(SYSCLASS_PLANT_BATCH);
				if(m_med.getgetSYS_CLASS_CODE().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetSYS_CLASS_CODE().next() == false || m_med.getsysCODE() == null || "".equals(m_med.getsysCODE())){
					//バッチ用コード情報が無い
					this.writeLogMessage("KQ00153");
					this.writeLogMessageInfo("CODE", SYSCLASS_PLANT_BATCH);
					this.setErrWngMessage("1","KQ00153");
					this.writeErrWngMessage();
					throw new Exception();
				}
				strPlantCd = m_med.getsysCODE();

				//=======================================
				// 業務日付取得
				//=======================================
				m_med.setstrPLANT_CD(this.strPlantCd);
				if(m_med.getgetGyomuDate().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetGyomuDate().next() == false || m_med.getstrBUSINESS_OPR_DATE() == null || "".equals(m_med.getstrBUSINESS_OPR_DATE())){
					//業務日付情報が無い/複数件
					this.writeLogMessage("KQ00026");
					this.writeLogMessageInfo(CoreTools.getRBString("Expj.PLANT_CD", strResource), m_med.getstrPLANT_CD());
					this.setErrWngMessage("1","KQ00026");
					this.writeErrWngMessage();
					throw new Exception();
				}

				//=======================================
				// 日本円通貨コード取得
				//=======================================
				if(m_med.getgetSYS_HOME_CUR().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetSYS_HOME_CUR().next() == false || m_med.getsysHomeCurCd() == null){
					//日本円通貨コード情報が無い/複数件
					this.writeLogMessage("KQ00041");
					this.writeLogMessageInfo("CODE", SYSCLASS_JP_CUR);
					this.setErrWngMessage("1","KQ00041");
					this.writeErrWngMessage();
					throw new Exception();
				}
				jpCurrency = m_med.getsysHomeCurCd();

				//=======================================
				// 出荷準備L/T取得
				//=======================================
				m_med.setsysCLASS_CODE(SYSCLASS_SHUKKA_LT);
				if(m_med.getgetSYS_CLASS_CODE().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetSYS_CLASS_CODE().next() == false || m_med.getsysCODE() == null){
					//出荷準備L/T情報が無い/複数件
					this.writeLogMessage("KQ00037");
					this.writeLogMessageInfo("CODE", this.SYSCLASS_SHUKKA_LT);
					this.setErrWngMessage("1","KQ00037");
					this.writeErrWngMessage();
					throw new Exception();
				}
				shukka_jyunbi_day = Integer.parseInt(m_med.getsysCODE());

				//=======================================
				// 短納期設定日取得
				//=======================================
				m_med.setsysCLASS_CODE(SYSCLASS_TAN_NOUKI);
				if(m_med.getgetSYS_CLASS_CODE().read() != SUCCESS){
					throw new Exception();
				}else if(m_med.getgetSYS_CLASS_CODE().next() == false || m_med.getsysCODE() == null){
					//短納期設定日が無い/複数件
					this.writeLogMessage("KQ00043");
					this.writeLogMessageInfo("CODE", this.SYSCLASS_TAN_NOUKI);
					this.setErrWngMessage("1","KQ00043");
					this.writeErrWngMessage();
					throw new Exception();
				}
				tan_nouki_day = Integer.parseInt(m_med.getsysCODE());

				//=======================================
				// 対象データの取得
				//=======================================
				if(m_med.getINDATA().read() != SUCCESS){
					throw new Exception();
				}
				boolean ok_flg = true;
				boolean warn_flg = true;
				long torikuzushiSuryo = 0;
				for(int rec=0;m_med.getINDATA().next();rec++){					// 受注情報取込Tから読み込んだデータを１件ずつ処理する
//System.out.println(Integer.toString(rec+1) +"件目のマスタチェック処理開始●●●●●");

					this.writeErrWngMessage();


					ok_flg = true;
					warn_flg = true;
					//=======================================
					// エラーリストに出力する項目のうち他のテーブルから取得する項目を初期化する
					//=======================================
					m_med.setstrITEM_CD("");
					m_med.setstrOWN_PERSON_CD("");
					m_med.setstrUNIT_PRICE(new Double(0));
					m_med.setstrODR_NO("");
					m_med.setstrDESINATED_DLV_DATE("");

					//=======================================
					// 情報区分チェック
					//=======================================
					//EDI
					//	0201		所要計画情報	見込登録	処理区分１のみ	引込条件期間判定
					//	0203		予約注文情報	見込登録	処理区分１のみ
					//	0501		内示注文情報	内示登録	処理区分１のみ
					//	0502		確定注文情報	確定登録	処理区分１のみ
					//	0503		変更注文情報	エラー警告
					//	0504		注文取消情報	エラー警告
					//RN
					//	03A04		注文新規		確定登録	処理区分１のみ
					//	03A08_CHG	注文変更		エラー警告
					//	03A08_OFF	注文打切		エラー警告
					//	03A08_CMP	注文完納		エラー警告
					//	03A09		注文削除		エラー警告
					//	04A04		見込			内示登録	処理区分１のみ
					//上記以外の情報区分を検出時はException
					String msgCd = "";
					if(!INFO_TYP_0201.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_0203.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_0501.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_0502.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_0503.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_0504.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_03A04.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_03A08_CHG.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_03A08_OFF.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_03A08_CMP.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_03A09.equals(m_med.getg_INFO_TYP_CD()) &&
					   !INFO_TYP_04A04.equals(m_med.getg_INFO_TYP_CD())	){
							//IFバッチとのインタフェースバグ
							//System.out.println("INFO_TYP="+m_med.getg_INFO_TYP_CD());
							throw new Exception();
					}
					if(INFO_TYP_0503.equals(m_med.getg_INFO_TYP_CD()) || INFO_TYP_03A08_CHG.equals(m_med.getg_INFO_TYP_CD())){
						//注文変更情報を検出
						msgCd = "KQ00062";
						m_med.setg_PROC_TYP(this.PROC_TYP_UPD);
					}
					if(INFO_TYP_0504.equals(m_med.getg_INFO_TYP_CD())){
						//注文取消情報を検出
						msgCd = "KQ00063";
						m_med.setg_PROC_TYP(this.PROC_TYP_CAN);
					}
					if(INFO_TYP_03A08_OFF.equals(m_med.getg_INFO_TYP_CD())){
						//注文打切情報を検出
						msgCd = "KQ00064";
						m_med.setg_PROC_TYP(this.PROC_TYP_STP);
					}
					if(INFO_TYP_03A09.equals(m_med.getg_INFO_TYP_CD())){
						//注文削除情報を検出
						msgCd = "KQ00065";
						m_med.setg_PROC_TYP(this.PROC_TYP_CAN);
					}
					if(INFO_TYP_03A08_CMP.equals(m_med.getg_INFO_TYP_CD())){
						//注文完納情報を検出
						msgCd = "KQ00066";
						m_med.setg_PROC_TYP(this.PROC_TYP_CPL);
					}
					if(INFO_TYP_04A04.equals(m_med.getg_INFO_TYP_CD())){
						//予約情報を検出
						msgCd = "KQ00071";
						m_med.setg_PROC_TYP(this.PROC_TYP_RSV);
					}
					if(!"".equals(msgCd)){
						ok_flg = false;
						this.writeLogMessage(msgCd,Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt5345", strResource), m_med.getg_INFO_TYP_CD());
						this.setErrWngMessage("1",msgCd);
						this.writeErrWngMessage();
						//当該データのシステム処理区分はその他に設定する
						m_med.setg_SYSTEM_PROC_TYP(SYS_PROC_TYP_ETC);
						int rv = m_med.getINDATA().update();
						conn.commit();
						continue;
						//以降のチェックは行わない
					}
					//=======================================
					// 処理区分チェック
					//=======================================
					if(!PROC_TYP_NEW.equals(m_med.getg_PROC_TYP())){
						//新規以外の処理区分は、エラー警告出力し、処理しない
						ok_flg = false;
						if(PROC_TYP_UPD.equals(m_med.getg_PROC_TYP())){
							msgCd = "KQ00044";
						}else{
							msgCd = "KQ00045";
						}
						this.writeLogMessage(msgCd,Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.EXEC_TYP", strResource), m_med.getg_PROC_TYP());
						this.setErrWngMessage("1",msgCd);
						this.writeErrWngMessage();
						//当該データのシステム処理区分はその他に設定する
						m_med.setg_SYSTEM_PROC_TYP(SYS_PROC_TYP_ETC);
						int rv = m_med.getINDATA().update();
						conn.commit();
						continue;
						//以降のチェックは行わない
					}
					//=======================================
					// 受注取込対象データの取込フラグをSYS_PROC_TYP_NGに更新
					//=======================================
					m_med.setg_SYSTEM_PROC_TYP(SYS_PROC_TYP_NG);
					int rv = m_med.getINDATA().update();
					conn.commit();
					//sww追加20040729

					//=======================================
					// 入力チェック
					//=======================================
					if(chkInData() == false){
						// 入力エラーがある場合は、次の行を処理する
						ok_flg = false;
//System.out.println("★★★入力値チェックエラー Continue");
//						continue;
						//以降のチェックは行わない
					}

					//=======================================
					// 顧客情報の取得
					//=======================================
					m_med.setstrCUST_CD(m_med.getg_CUST_CD());
					if(m_med.gettbl_M_CUST().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.gettbl_M_CUST().next() == false){
						//顧客情報が無い/複数件
						ok_flg = false;
						this.writeLogMessage("KQ00114",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getg_CUST_CD());
						this.setErrWngMessage("1","KQ00114");
						this.writeErrWngMessage();
						continue;
						//以降のチェックは行わない
					}
                    //NULL なら邦貨マスタ.日本円通貨コード
                    if(m_med.getstrCUR_CD() == null || "".equals(m_med.getstrCUR_CD())){
                        m_med.setstrCUR_CD(jpCurrency);
					}

					//通貨コード省略時は、顧客マスタの通貨コードを設定
					m_med.setg_CUR_CD(m_med.getstrCUR_CD());	// 画面 ← 通貨コード
					//=======================================
					// 納品場所のチェック/取得
					//=======================================
					//納品場所が省略された場合
					//		マスタから取得した納品場所を使用する
					//		複数件取得できる場合はエラー
					//納品場所の指定がある場合
					//		指定された納品場所がマスタに無ければエラー
                    String shipPlantCd = ""; // 出荷倉庫の工場コード
					if(m_med.getg_DLV_LOC_CD() == null || "".equals(m_med.getg_DLV_LOC_CD().trim())){
						//納品場所省略時
						m_med.setstrDLV_LOC_CD("");
						if(m_med.gettbl_M_CUST_BASE().read() != SUCCESS){
							throw new Exception();
						}else if(m_med.gettbl_M_CUST_BASE().next() == false){
							//納品場所情報が無い
							ok_flg = false;
							this.writeLogMessage("KQ00115",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
							this.setErrWngMessage("1","KQ00115");
						} else { }
						m_med.setg_DLV_LOC_CD(m_med.getstrDLV_LOC_CD());	// 画面 ← 納品場所コード
                        shipPlantCd = m_med.getstrSHIP_PLANT_CD();
						//もう一件読んで、読み込める場合は、エラー
						if(m_med.gettbl_M_CUST_BASE().next() != false){
							//納品場所情報が複数件
							ok_flg = false;
							this.writeLogMessage("KQ00116",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
							this.setErrWngMessage("1","KQ00116");
						} else {}
					}else{
						//納品場所指定時
						m_med.setstrDLV_LOC_CD(m_med.getg_DLV_LOC_CD());
						if(m_med.gettbl_M_CUST_BASE_check().read() != SUCCESS){
							throw new Exception();
						}else if(m_med.gettbl_M_CUST_BASE_check().next() == false){
							//納品場所情報が無い
							ok_flg = false;
							this.writeLogMessage("KQ00115",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt5934", strResource), m_med.getstrDLV_LOC_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6209", strResource), m_med.getstrDEPO_WH_CD());
							this.setErrWngMessage("1","KQ00115");
						}
                        shipPlantCd = m_med.getstrSHIP_PLANT_CD();
					}
//					custbase_calcd = Integer.parseInt(m_med.getstrCAL_NO());			//顧客納品場所のカレンダコードを設定

					//=======================================
					// 製品仕様情報の取得
					//=======================================
					m_med.setstrCUST_ITEM_CD(m_med.getg_CUST_ITEM_CD());
//System.out.println("@@@ CUST_ITEM_CD=" + m_med.getstrCUST_ITEM_CD());						//顧客品番
					if(m_med.gettbl_M_ITEM_SPEC().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.gettbl_M_ITEM_SPEC().next() == false){
						//製品仕様情報がない
						ok_flg = false;
						this.writeLogMessage("KQ00117",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6210", strResource), m_med.getstrCUST_ITEM_CD());
                        this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6209", strResource), m_med.getstrDEPO_TYP());
						this.setErrWngMessage("1","KQ00117");
//del					}else{
					}
					
					//Add Start 20131218 Meng-qzh
					if("1".equals(m_med.getstrTAX_APPLY_TYP())){        //[得意先].“消費税適用区分”は「1：製品マスタの消費税コード」の場合、[製品].“消費税コード”
						m_med.setstrTAX_CD(m_med.getstrsTAX_CD());      //消費税コード
					}
					//Add End 20131218 Meng-qzh
					
					//sww追加20040728開始
					//製品マスタテーブルのチェック
					if(m_med.getstrDEPO_WH_CD() == null && "20".equals(m_med.getstrDEPO_TYP())){
						//指定納期が省略
						ok_flg = false;
						this.writeLogMessage("KQ20002",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.DEPO_TYP", strResource), m_med.getstrDEPO_TYP());
						this.setErrWngMessage("1","KQ20002");
					}
					//sww追加20040802預託20かつ確認受注3の場合のエラー処理
					if( ("3".equals(m_med.getg_ODR_TYP())) && "20".equals(m_med.getstrDEPO_TYP())){
						//指定納期が省略
						ok_flg = false;
						this.writeLogMessage("KQ20003",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.DEPO_TYP", strResource), m_med.getstrDEPO_TYP());
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.ODR_TYP", strResource), m_med.getg_ODR_TYP());
						this.setErrWngMessage("1","KQ20003");
					}
					//sww追加20040802終了
					//sww追加20040728終了
					//=======================================
					// 単価の取得
					//=======================================
					m_med.setstrEFF_PHASE_IN_DATE(m_med.getstrBUSINESS_OPR_DATE());
					if(m_med.gettbl_M_UNIT_COST().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.gettbl_M_UNIT_COST().next() == false){
						//レコードなしの場合
						if(m_med.getg_UNIT_COST() == null || "".equals(m_med.getg_UNIT_COST().toString())){
							//単価が省略されている場合、０にする
							m_med.setg_UNIT_COST(new Double(0));	// 画面 ← 単価（０）
						}else{
							//単価が指定されている場合
							warn_flg = false;
							this.writeLogMessage("KQ00121",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.ITEM_CD", strResource), m_med.getstrITEM_CD());
							this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6211", strResource), m_med.getstrBUSINESS_OPR_DATE());
							this.setErrWngMessage("2","KQ00121");
							//警告なので処理続行
						}
					}else{
						//レコードがある場合
						if(m_med.getg_UNIT_COST() == null || "".equals(m_med.getg_UNIT_COST().toString())){
							//単価が省略されている場合、取得した単価を設定
							m_med.setg_UNIT_COST(m_med.getstrUNIT_PRICE());	// 画面 ← 単価
						}else{
							//単価が指定されている場合、取得した値と一致チェック
							double dbTanka = m_med.getstrUNIT_PRICE().doubleValue();
							double inTanka = m_med.getg_UNIT_COST().doubleValue();
							if(dbTanka != inTanka){
								//等しくないときは警告メッセージ
								warn_flg = false;
								this.writeLogMessage("KQ00120",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
								this.writeLogMessageInfo(CoreTools.getRBString("Expj.COMPANY_CD", strResource), m_med.getstrCOMPANY_CD());
								this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
								this.writeLogMessageInfo(CoreTools.getRBString("Expj.ITEM_CD", strResource), m_med.getstrITEM_CD());
								this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt5566", strResource), m_med.getstrEFF_PHASE_IN_DATE());
								this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6211", strResource), m_med.getstrBUSINESS_OPR_DATE());
								this.setErrWngMessage("2","KQ00120");
								//警告なので処理続行
							}
						}
					}
//System.out.println("UNIT_PRICE="+m_med.getstrUNIT_PRICE());
//System.out.println("UNIT_COST ="+m_med.getg_UNIT_COST());

					//=======================================
					// 品目情報の取得
					//=======================================
					if(m_med.gettbl_M_ITEM().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.gettbl_M_ITEM().next() == false){
						//品目情報が無い
						ok_flg = false;
						this.writeLogMessage("KQ00127",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.ITEM_CD", strResource), m_med.getstrITEM_CD());
						this.setErrWngMessage("1","KQ00127");
					}else if(m_med.getg_UNIT_CD() == null || "".equals(m_med.getg_UNIT_CD())){
						//単位が指定されていない場合、マスタの値を使用
						m_med.setg_UNIT_CD(m_med.getstrSTOCK_UNIT());
					}else if(!m_med.getg_UNIT_CD().equals(m_med.getstrSTOCK_UNIT())){
						//単位がマスタと異なる
						ok_flg = false;
						this.writeLogMessage("KQ00067",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.ITEM_CD", strResource), m_med.getstrITEM_CD());
						this.setErrWngMessage("1","KQ00067");
					}
					m_med.setstrUNIT_CD(m_med.getg_UNIT_CD());

                    // 整数管理チェック
                    if ("1".equals(m_med.getstrUNIT_QTY_TYP())) {
                        // 整数管理
                        // 小数入力の場合：切上げ
                        String tempString1 = m_med.getg_PUCH_ODR_QTY().toString();
                        double tempDouble1 = m_med.getg_PUCH_ODR_QTY().doubleValue();
                        String tempString2 = Calculate.ceil(tempString1, 0);
                        double tempDouble2 = Double.parseDouble(tempString2);
                        if (tempDouble1 != tempDouble2) {
                            // ".0"除外
                            this.writeLogMessage("KQ20005", Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
                            this.writeLogMessageInfo(CoreTools.getRBString("Expj.ITEM_CD", strResource), m_med.getstrITEM_CD());
                            this.setErrWngMessage("2", "KQ20005");
                            m_med.setg_PUCH_ODR_QTY(new Double(tempString2));
                        }
                    }


//System.out.println("ITEM_NAME=" + m_med.getstrITEM_NAME());						//品目名

//System.out.print("マスタチェックおしまい-----------------------------------------");
//System.out.println(Integer.toString(rec+1) +"件目の登録処理開始●●●●●");
					if(ok_flg == false){
						//エラーがある場合は、Continue
						//System.out.println("エラーがあるので登録しない");
						continue;
					}
					//=======================================
					// 受注管理番号の取得
					//=======================================
					boolean flg_create = false;	//受注管理テーブルを新規追加したか否かのフラグ
					if(m_med.gettbl_T_ODR_CTL().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.gettbl_T_ODR_CTL().next() == false){
						//受注管理情報が無い場合、受注管理番号を採番し、受注管理レコードを作成する
						//=======================================
						// 受注管理番号採番
						//=======================================
						if(m_med.getgetSEQ_ODR_CTL().read() != SUCCESS){
							throw new Exception();
						}else if(m_med.getgetSEQ_ODR_CTL().next() == false){
							//受注管理番号採番エラー
							this.writeLogMessage("KQ00130",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
							this.setErrWngMessage("1","KQ00130");
							this.writeErrWngMessage();
							continue;
						}
						//=======================================
						// 受注管理登録
						//=======================================
						rv = m_med.gettbl_T_ODR_CTL().create();
						flg_create = true;
					}else if(m_med.gettbl_T_ODR_CTL().next() != false){
						//受注管理情報が複数件存在する場合、エラーメッセージ出力
						this.writeLogMessage("KQ00129",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6208", strResource), m_med.getstrCUST_CD());
						this.writeLogMessageInfo(CoreTools.getRBString("Expj.Cmt6210", strResource), m_med.getstrCUST_ITEM_CD());
						this.setErrWngMessage("1","KQ00129");
						this.writeErrWngMessage();
						continue;
//del					}else{
					}

					//=======================================
					// 受注番号の取得
					//=======================================
                    if(m_med.getgetSEQ_ODR().read() != SUCCESS){
                        throw new Exception();
                    }else if(m_med.getgetSEQ_ODR().next() == false){
                        //受注番号採番エラー
                        this.writeLogMessage("KQ00131",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
                        this.setErrWngMessage("1","KQ00131");
                        this.writeErrWngMessage();
                        continue;
                    }


					//=======================================
					// 受注明細の登録
					//=======================================
					m_med.setstrODR_TYP(m_med.getg_ODR_TYP());												//注文区分
					m_med.setstrCUST_ODR_NO(m_med.getg_CUST_ODR_NO());										//顧客注文番号
					m_med.setstrCUST_CHRG_ORG_CD(m_med.getstrOWN_ORG_CD());									//営業担当部門
					m_med.setstrCUST_CHRG_PSN_CD(m_med.getstrOWN_PERSON_CD());								//営業担当者
					m_med.setstrODR_ACPT_ORG_CD(m_med.getstrORG_CD());										//発行担当者部門
					m_med.setstrODR_ACPT_PSN_CD(strUserId);								                    //発行担当者（バッチの場合）
					m_med.setstrCURRNCY_CD(m_med.getg_CUR_CD());											//通貨コード
					m_med.setstrDLV_LOC_CD_EIAJ(m_med.getg_DLV_LOC_CD_EIAJ());								//受け渡し場所（バッチのみ）
					m_med.setstrDLV_LOC_NAME_KANJI(m_med.getstrDLV_LOC_NAME());								//納品場所名漢字（納品場所）
					if(m_med.getg_DLV_LOC_NAME_KANJI() != null && !"".equals(m_med.getg_DLV_LOC_NAME_KANJI().replaceAll("　"," ").trim())){
						m_med.setstrDLV_LOC_NAME_KANJI(m_med.getg_DLV_LOC_NAME_KANJI());			//納品場所名漢字（入力があるときは、その値で置き換え）
					}
					//System.out.println("CURRNCY_CD=" + m_med.getstrCURRNCY_CD());
					m_med.setstrODR_UNIT_PRICE(m_med.getg_UNIT_COST());										//受注単価
					m_med.setstrSPCL_PRICE_TYP(DEFAULT_SPCL_PRICE_TYP);										//特値
					m_med.setstrODR_QTY(m_med.getg_PUCH_ODR_QTY());											//受注数量
					torikuzushiSuryo = m_med.getstrODR_QTY().longValue();
					//内示残算出　内示減算出
					if( ODR_TYP_NAIJI.equals(m_med.getg_ODR_TYP()) )
                    {// 注文区分が内示
                    m_med.setstrREMAIN_UNCONFIRM_ODR_QTY(m_med.getstrODR_QTY());					//内示残
                    m_med.setstrCANCELED_UNCONFIRM_ODR_QTY(new Double(0));							//内示減

					}else{
						//System.out.println("注文区分が内示以外");
						m_med.setstrREMAIN_UNCONFIRM_ODR_QTY(new Double(0));								//内示残
						m_med.setstrCANCELED_UNCONFIRM_ODR_QTY(new Double(0));								//内示減
					}

					m_med.setstrUNIT_CD(m_med.getg_UNIT_CD());												//単位
					if( ODR_TYP_NAIJI.equals(m_med.getg_ODR_TYP()) ){										//内示残金額（建値）
						// 注文区分が内示
//update by luo at 2004/05/25 start
//						Double w_qty = cnvQty(false,m_med.getstrREMAIN_UNCONFIRM_ODR_QTY().doubleValue() * m_med.getstrODR_UNIT_PRICE().doubleValue(),
//						m_med.getstrCURRNCY_CD(),m_med);

						String unconfirmOdrBalance1 = Calculate.multiply(
										m_med.getstrREMAIN_UNCONFIRM_ODR_QTY().toString(),
										m_med.getstrODR_UNIT_PRICE().toString());
						Double w_qty1 = cnvQty(false,unconfirmOdrBalance1,m_med.getstrCURRNCY_CD(),m_med);
//update by luo at 2004/05/25 end

						if(w_qty1 == null){
							ok_flg = false;
							continue;
						}
						m_med.setstrUNCONFIRM_ODR_BALANCE(w_qty1);
					}else{
						m_med.setstrUNCONFIRM_ODR_BALANCE(new Double(0));
					}

                    			//受注金額（建値）
//update by luo at 2004/05/25 start
//					Double w_qty = cnvQty(false,m_med.getstrODR_QTY().doubleValue() * m_med.getstrODR_UNIT_PRICE().doubleValue(),
//					m_med.getstrCURRNCY_CD(),m_med);

					String unconfirmOdrBalance2 = Calculate.multiply(
									m_med.getstrODR_QTY().toString(),
									m_med.getstrODR_UNIT_PRICE().toString());
					Double w_qty2 = cnvQty(false,unconfirmOdrBalance2,m_med.getstrCURRNCY_CD(),m_med);
//update by luo at 2004/05/25 end
					if(w_qty2 == null){
						ok_flg = false;
						continue;
					}
					m_med.setstrODR_AMOUNT(w_qty2);

					//受注金額（円貨）
					w_qty2 = null;
                    			w_qty2 = cnvQty(true,unconfirmOdrBalance2,m_med.getstrCURRNCY_CD(),m_med);
                    			if(w_qty2 == null){
                        			ok_flg = false;
                        			continue;
                    			}
					m_med.setstrODR_AMOUNT_EXCH_RATES(w_qty2);

					m_med.setstrCUS_DLV_CD(m_med.getg_CUS_DLV_CD());										//納入番号
					m_med.setstrCUS_DLV_KEY_CD(m_med.getg_CUS_DLV_KEY_CD());								//納品キー番号
					m_med.setstrREMARKS(m_med.getg_REMARK());												//備考
					m_med.setstrODR_ACPT_DATE(m_med.getstrBUSINESS_OPR_DATE());								//受注日

/* 2004/03/17
                    //出荷計画残数量
                    //2004/03/16
                    //通常内示：０
                    //通常確定注文：受注数量
                    //預託内示：受注数量
                    //預託確定：０
                m_med.setstrSHIP_PLAN_REMAIN_QTY(new Double(0));
                if(ODR_TYP_NAIJI.equals(m_med.getstrODR_TYP())){
                    if(YOTAKU_YOTAKU.equals(m_med.getstrDEPO_TYP())){
                        m_med.setstrSHIP_PLAN_REMAIN_QTY(m_med.getstrODR_QTY());
                    }
                }else if(ODR_TYP_KAKUTEI.equals(m_med.getstrODR_TYP())){
                    if(YOTAKU_NORMAL.equals(m_med.getstrDEPO_TYP())){
                        m_med.setstrSHIP_PLAN_REMAIN_QTY(m_med.getstrODR_QTY());
                    }
				}
*/
                    m_med.setstrDESINATED_DLV_DATE(m_med.getg_DESINATED_DLV_DATE());						//指定納期
                    m_med.setstrSTD_DESINATED_RCV_DATE(m_med.getg_DESINATED_DLV_DATE());					//基準指定納期

                //出荷計画残数量

                    //=======================================
                    //短納期判定
                    //=======================================
                    boolean tan_flg_QTY = false;
//update by luo at 2004/05/25 start
                    String quickDeliveryDate1 = calcWorkDate(m_med.getstrBUSINESS_OPR_DATE(), tan_nouki_day);


                    // 短納期
                    if (DateTool.compareYMD(quickDeliveryDate1, m_med.getstrDESINATED_DLV_DATE()) >= 0) {
                        tan_flg_QTY = true;
                    } else {
                        tan_flg_QTY = false;
                    }



//update by luo at 2004/05/25 end
//                    //指定納期
//                    GregorianCalendar inpDate_QTY = new GregorianCalendar();
//                    inpDate_QTY.setTime(sdi.parse(m_med.getstrDESINATED_DLV_DATE()));
//                    //業務日付
//                    GregorianCalendar gyoDate_QTY = new GregorianCalendar();
//                    gyoDate_QTY.setTime(sdi.parse(m_med.getstrBUSINESS_OPR_DATE()));

//                    gyoDate_QTY.add(GregorianCalendar.DATE,tan_nouki_day);
//                    //指定納期 <= 受注日＋短納期設定日　の場合、短納期となる
//                    if(inpDate_QTY.getTime().compareTo(gyoDate_QTY.getTime()) <= 0){
//                        tan_flg_QTY = true;
//                    }
                    if( tan_flg_QTY == true                                        // 今日の日付 + n日 >= 指定納期
                        && (ODR_TYP_KAKUTEI.equals(m_med.getg_ODR_TYP())  	   // 注文区分が確定注文
                        || ( ODR_TYP_NAIJI.equals(m_med.getg_ODR_TYP())        // 注文区分が内示
                        && YOTAKU_YOTAKU.equals(m_med.getstrDEPO_TYP())) ))   // 預託区分が預託
                    {
                        tan_flg_QTY = true;
                        m_med.setstrSHIP_PLAN_REMAIN_QTY(new Double(0));
                    }
                    else
                    {
                        tan_flg_QTY = false;
                        m_med.setstrSHIP_PLAN_REMAIN_QTY(m_med.getstrODR_QTY());
                    }

					//バッチ用項目
					m_med.setstrIF_CTL_NO(m_med.getg_ODR_INFO_COM_IF_CTRL_NO());							//IF情報管理番号
					m_med.setstrPART_NAME(m_med.getg_PART_NAME());											//品名
					m_med.setstrPKG_UNIT(m_med.getg_PKG_UNIT());											//荷姿
					m_med.setstrINSPC_TYP(m_med.getg_INSPC_TYP());											//検査区分
					m_med.setstrSLIP_PRICE_PRINT_TYP(m_med.getg_SLIP_PRICE_PRINT_TYP());					//納品書価格表示区分
					m_med.setstrCLIENT_REMARK(m_med.getg_CLIENT_REMARK());									//発注者備考
					m_med.setstrCLIENT_REMARK_KANJI(m_med.getg_CLIENT_REMARK_KANJI());						//発注者備考(漢字)
					m_med.setstrCLIENT_BARCODE_INF(m_med.getg_CLIENT_BARCODE_INF());						//発注者バーコード情報
					m_med.setstrODR_SEQ(m_med.getg_ODR_SEQ());												//注文項番　2004/1/5
					//バッチ（EDI）のみ
					m_med.setstrUNIT_CD_ORG(m_med.getg_UNIT_CD_ORG());										//変換前単位
					m_med.setstrPUCH_ODR_QTY_TOTAL(m_med.getg_PUCH_ODR_QTY_TOTAL());						//総注文数量
					m_med.setstrBUYER_NAME(m_med.getg_BUYER_NAME());										//購買担当
					m_med.setstrBUYER_ORG_CD(m_med.getg_BUYER_ORG_CD());									//発注部門コード
					m_med.setstrCOCK_TYP(m_med.getg_COCK_TYP());											//コック区分

					//System.out.println("ODR_NO=" + m_med.getstrODR_NO());
					//System.out.println("ODR_TYP=" + m_med.getstrODR_TYP());
					//System.out.println("ODR_CTL_NO=" + m_med.getstrODR_CTL_NO());
					//System.out.println("CUST_ODR_NO=" + m_med.getstrCUST_ODR_NO());
					//System.out.println("CUST_CHRG_ORG_CD=" + m_med.getstrCUST_CHRG_ORG_CD());
					//System.out.println("CUST_CHRG_PSN_CD=" + m_med.getstrCUST_CHRG_PSN_CD());
					//System.out.println("ODR_ACPT_ORG_CD=" + m_med.getstrODR_ACPT_ORG_CD());
					//System.out.println("ODR_ACPT_PSN_CD=" + m_med.getstrODR_ACPT_PSN_CD());
					//System.out.println("CURRNCY_CD=" + m_med.getstrCURRNCY_CD());
					//System.out.println("DLV_LOC_CD=" + m_med.getstrDLV_LOC_CD());
					//System.out.println("DLV_LOC_NAME=" + m_med.getstrDLV_LOC_NAME());
					//System.out.println("DLV_LOC_NAME_KANJI=" + m_med.getstrDLV_LOC_NAME_KANJI());
					//System.out.println("ODR_UNIT_PRICE=" + m_med.getstrODR_UNIT_PRICE());
					//System.out.println("SPCL_PRICE_TYP=" + m_med.getstrSPCL_PRICE_TYP());
					//System.out.println("DESINATED_DLV_DATE=" + m_med.getstrDESINATED_DLV_DATE());
					//System.out.println("STD_DESINATED_RCV_DATE=" + m_med.getstrSTD_DESINATED_RCV_DATE());
					//System.out.println("ODR_QTY=" + m_med.getstrODR_QTY());
					//System.out.println("REMAIN_UNCONFIRM_ODR_QTY=" + m_med.getstrREMAIN_UNCONFIRM_ODR_QTY());
					//System.out.println("CANCELED_UNCONFIRM_ODR_QTY=" + m_med.getstrCANCELED_UNCONFIRM_ODR_QTY());
					//System.out.println("UNIT_CD=" + m_med.getstrUNIT_CD());
					//System.out.println("UNCONFIRM_ODR_BALANCE=" + m_med.getstrUNCONFIRM_ODR_BALANCE());
					//System.out.println("ODR_AMOUNT=" + m_med.getstrODR_AMOUNT());
					//System.out.println("ODR_AMOUNT_EXCH_RATES=" + m_med.getstrODR_AMOUNT_EXCH_RATES());
					//System.out.println("CUS_DLV_CD=" + m_med.getstrCUS_DLV_CD());
					//System.out.println("CUS_DLV_KEY_CD=" + m_med.getstrCUS_DLV_KEY_CD());
					//System.out.println("PART_NAME=" + m_med.getstrPART_NAME());
					//System.out.println("TRANSPORT_CD=" + m_med.getstrTRANSPORT_CD());
					//System.out.println("TAX_APPLY_TYP=" + m_med.getstrTAX_APPLY_TYP());
					//System.out.println("TAX_CD=" + m_med.getstrTAX_CD());
					//System.out.println("TAX_CALC_TYP=" + m_med.getstrTAX_CALC_TYP());
					//System.out.println("REMARKS=" + m_med.getstrREMARKS());
					//System.out.println("ODR_ACPT_DATE=" + m_med.getstrODR_ACPT_DATE());
					//System.out.println("PARTIAL_SHIP_INST_FLG=" + m_med.getstrPARTIAL_SHIP_INST_FLG());
					//System.out.println("DEPO_TYP=" + m_med.getstrDEPO_TYP());
					//System.out.println("EXCH_TYP=" + m_med.getstrEXCH_TYP());
					//System.out.println("ODR_SEQ=" + m_med.getstrODR_SEQ());

                    // 受注明細を新規追加する
                    rv = m_med.gettbl_T_ODR().create();

					if( ODR_TYP_KAKUTEI.equals(m_med.getg_ODR_TYP()) &&
						 torikuzushiSuryo != 0){ 					// 注文区分が確定注文
						boolean wkFlg = false;

                        //内示の場合、取崩対象は、見込のみ。確定の場合、取崩対象は、見込と内示
                        //取崩対象検索条件に内示を加える
                        m_med.setnijODR_TYP(ODR_TYP_NAIJI);
                        //注文番号比較を行う顧客か否か

						if(wkFlg == false){
							//注文番号比較を行わない顧客場合、または、
							//注文番号比較を行う顧客でも、比較桁数条件で内示残が０の場合
							// =======================================
							// 内示取崩（顧客品番）
							// =======================================
							m_med.setnijCUST_CD(m_med.getstrCUST_CD());
							m_med.setnijCUST_ITEM_CD(m_med.getstrCUST_ITEM_CD());

                            if(m_med.getnaiji_T_ODR_hinban().read() != SUCCESS){
                                throw new Exception();
                            }
                            wkFlg = m_med.getnaiji_T_ODR_hinban().next();
						}

						// 取崩対象の件数を確認する
						long torisu = torikuzushiSuryo;
						if(wkFlg != false){
							//取崩数量（受注数量が初期値）
							int i_tk = 0;
							boolean bk_flg = true;

							do{
								long zansu = 0;
								if(ODR_TYP_NAIJI.equals(m_med.getnijODR_TYP())){
									if(m_med.getnijREMAIN_UNCONFIRM_ODR_QTY() != null){
										zansu = m_med.getnijREMAIN_UNCONFIRM_ODR_QTY().longValue();
									}
								}

								long hikiate_su = 0;
								if(torisu > zansu){
									hikiate_su = zansu;
									torisu -= zansu;
									if(ODR_TYP_NAIJI.equals(m_med.getnijODR_TYP())){
										m_med.setnijREMAIN_UNCONFIRM_ODR_QTY(new Double(0));					//内示残
										m_med.setnijUNCONFIRM_ODR_BALANCE(new Double(0));						//内示残金額（建値）
									}
								}else{
									hikiate_su = torisu;

									if(ODR_TYP_NAIJI.equals(m_med.getnijODR_TYP())){
										m_med.setnijREMAIN_UNCONFIRM_ODR_QTY(new Double(zansu - torisu));		//内示残
										torisu = 0;
//update by luo at 2004/05/25 start
//										w_qty = cnvQty(false,m_med.getnijREMAIN_UNCONFIRM_ODR_QTY().doubleValue() * m_med.getnijODR_UNIT_PRICE().doubleValue(),
//											m_med.getnijCURRNCY_CD(),m_med);

										String unconfirmOdrBalance3 = Calculate.multiply(
														m_med.getnijREMAIN_UNCONFIRM_ODR_QTY().toString(),
														m_med.getnijODR_UNIT_PRICE().toString());
										Double w_qty3 = cnvQty(false,unconfirmOdrBalance3,m_med.getnijCURRNCY_CD(),m_med);
//update by luo at 2004/05/25 end
										if(w_qty3 == null){
											ok_flg = false;
											continue;
										}
										m_med.setnijUNCONFIRM_ODR_BALANCE(w_qty3);								//内示残金額（建値）
									}
                                    else
                                    {
                                        m_med.setnijUNCONFIRM_ODR_BALANCE(new Double(0));
                                    }
								}
								rv = m_med.getnaiji_T_ODR().update();

								// =======================================
								// 内示確定注文取崩履歴作成
								// =======================================
								m_med.sethisFIXED_ODR_NO(m_med.getstrODR_NO());									//確定受注番号
								m_med.sethisALCTED_SEQ_CD(new Double(++i_tk));					//引き当て順
								m_med.sethisALCTED_UNCONFIRM_ODR_NO(m_med.getnijODR_NO());						//引き当て先内示受注番号
								m_med.sethisALCTED_UNCONFIRM_ODR_QTY(new Double(hikiate_su));					//引当数量
//System.out.println("FIXED_ODR_NO=" + m_med.gethisFIXED_ODR_NO());
//System.out.println("ALCTED_SEQ_CD=" + m_med.gethisALCTED_SEQ_CD());
//System.out.println("ALCTED_UNCONFIRM_ODR_NO=" + m_med.gethisALCTED_UNCONFIRM_ODR_NO());
//System.out.println("ALCTED_UNCONFIRM_ODR_QTY=" + m_med.gethisALCTED_UNCONFIRM_ODR_QTY());

								rv = m_med.gettbl_T_ALLOC_FIXED_ODR_RSLT().create();

								//次のレコードを読み込み
                                bk_flg = m_med.getnaiji_T_ODR_hinban().next();

								if(torisu <= 0) bk_flg = false;
							}while(bk_flg );
							// debug

//System.out.println("内示取崩 END");
						}else{
						}

					}

					// =======================================
					// 受注履歴番号採番
					// =======================================
//System.out.println("受注履歴番号採番 BEGIN");
					if(m_med.getgetSEQ_RSLT_ODR().read() != SUCCESS){
						throw new Exception();
					}else if(m_med.getgetSEQ_RSLT_ODR().next() == false){
						//受注履歴番号採番エラー
						this.writeLogMessage("KQ00135",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
						this.setErrWngMessage("1","KQ00135");
						this.writeErrWngMessage();
						continue;
					}
					m_med.setstrRSLT_CTL_SEQ_CD(m_med.getstrRSLT_CTL_SEQ_CD());
//int aaa=100/0;
					//=======================================
					// 受注履歴作成
					//=======================================
//System.out.println("受注履歴の登録 BEGIN");
					m_med.setstrUNIT(m_med.getstrUNIT_CD());										//単位
					m_med.setstrDLV_PLACE_CD(m_med.getstrDLV_LOC_CD());								//納品場所コード
					m_med.setstrUNIT_PRICE(m_med.getstrODR_UNIT_PRICE());							//単価
					m_med.setstrSPCL_PRICE_CO(m_med.getstrSPCL_PRICE_TYP());						//特値
					m_med.setstrCUST_DLV_CD(m_med.getstrCUS_DLV_CD());								//納入番号
					m_med.setstrCUST_DLV_KEY_CD(m_med.getstrCUS_DLV_KEY_CD());						//納品キー番号

					//System.out.println("RSLT_CTL_SEQ_CD=" + m_med.getstrRSLT_CTL_SEQ_CD());
					//System.out.println("UNIT=" + m_med.getstrUNIT());							//単位
					//System.out.println("DLV_PLACE_CD=" + m_med.getstrDLV_PLACE_CD());			//納品場所コード
					//System.out.println("UNIT_PRICE=" + m_med.getstrUNIT_PRICE());				//単価
					//System.out.println("SPCL_PRICE_CO=" + m_med.getstrSPCL_PRICE_CO());			//特値
					//System.out.println("CUST_DLV_CD=" + m_med.getstrCUST_DLV_CD());				//納入番号
					//System.out.println("CUST_DLV_KEY_CD=" + m_med.getstrCUST_DLV_KEY_CD());		//納品キー番号

					rv = m_med.gettbl_T_ODR_ACPT_RSLT().create();
					//System.out.println("受注履歴の登録 END");


					/* 短納期の場合 */
                    if(tan_flg_QTY == true){

                      //=======================================
                      // 出荷計画（納期回答）作成
                      //=======================================
                      //System.out.println("納期回答作成 BEGIN");
                      m_med.setstrDESINATED_SHIP_DATE(cnvShipDate(m_med, shipPlantCd));						//出荷指定日
                      m_med.setstrDESINATED_SHIP_QTY(m_med.getstrODR_QTY());						//出荷指定数量
                      m_med.setstrREST_SHIP_ODR_QTY(m_med.getstrODR_QTY());						//出荷指示残数量
                      //最新納期回答日　出荷指定日＋運送日数を設定 2004/1/21
                      m_med.setstrLAST_ANS_DLV_DATE_RCD(calcWorkDate(m_med.getstrDESINATED_SHIP_DATE(),m_med.getstrTRANSPORT_LT().intValue()));

                      rv = m_med.gettbl_T_ANS_DLV_DATE().create();
                      //System.out.println("納期回答作成 END");

                    }//確定注文（通常または預託SP）の場合の処理おわり

					//=======================================
					// 受注取込対象データの取込フラグを１に更新
					//=======================================
					m_med.setg_SYSTEM_PROC_TYP(SYS_PROC_TYP_SUMI);
					rv = m_med.getINDATA().update();
					conn.commit();

					this.writeLogMessage("KQ00146",Integer.toString(m_med.getg_ODR_INFO_COM_IF_CTRL_NO().intValue()));
//System.out.println(Integer.toString(rec+1) +"件目の処理終了-----------------------------------------commitしました");
				}
				//スタックされているメッセージがあれば、出力する
//				if(warn_flg == false || ok_flg == false){
					//警告またはエラーがある場合は、メッセージを書き込み
					this.writeErrWngMessage();
//				}

				conn.commit();

//-----------------------------------------------------------------------------
//		注文情報取込処理（ここまで）
//-----------------------------------------------------------------------------
//System.out.println("\n******>>>> ("+this.m_vTODAY+")の注文情報取込バッチ処理END <<<<******");
			}catch(Exception e) {
				try {
				conn.rollback();
				e.printStackTrace();
					// コネクションを渡して、採番の準備
					logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
					// 注文情報取込対象データの取得に失敗しました。
					String strMsgCd = "KQ00303";
					businessMsgAcc.init(conn);
					businessMsg.setBusinessOperatingName(strBusinessName);
					businessMsg.setUser(strUserId);
					businessMsg.setPlantCode(strMsgPlantCd);
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
				} catch (FoundationException ex) {
					ex.printStackTrace();
				}
			}
	    } catch (Exception e) {
			try {
				conn.rollback();
				e.printStackTrace();
				logCd = new Numbering(conn,Numbering.LOG_CD,strUserId,strBusinessName,strMsgPlantCd);
				// 注文情報取込バッチ処理にて致命的なエラーが発生しました。
				String strMsgCd = "KQ00303";
				businessMsgAcc.init(conn);
				businessMsg.setBusinessOperatingName(strBusinessName);
				businessMsg.setUser(strUserId);
				businessMsg.setPlantCode(strMsgPlantCd);
				businessMsg.setLogCode(logCd.getNo());
				businessMsg.setMessageCode(strMsgCd);
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
					String strMsgCd = "KQ00302";
					String strDataString = "(SBM0603)<< 注文情報取込バッチ処理終了 >>";
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
		public medKQ0010B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKQ0010B001 med) throws BatchAppException
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
