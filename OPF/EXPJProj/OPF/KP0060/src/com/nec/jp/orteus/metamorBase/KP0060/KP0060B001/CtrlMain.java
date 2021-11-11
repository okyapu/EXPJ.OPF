/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0060/src/com/nec/jp/orteus/metamorBase/KP0060/KP0060B001/CtrlMain.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0060.KP0060B001;

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
//-----------------------------------------------------------------------------
import java.util.Date;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessLock.BusinessLock;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.expj.util.*;
//-----------------------------------------------------------------------------

//}}user_implement_dev:import

/**
 * CLASS     : CtrlMain クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.13 $ $Date: 2015/12/03 08:54:24 $
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
	public medKP0060B001 m_med=null;

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
	public CtrlMain(medKP0060B001 med, BatchAppConductor cdr) throws BatchAppException
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

	/** 起動引数 */
	private String strBusinessName = null;
	private String strUserId = null;
	private String strPlantCd = null;
	private String strMsgPlantCd = null;
	
	/** DBコネクション */
	private IDbConnection conn = null;
	private String m_vMSG = "";				//ログファイル用メッセージ

	// バッチクラス共通エラー処理用
	private String errCode = null;		     // バッチエラーコード
	private String errMsg = null;		     // バッチエラーメッセージ
	private String errNote = "";             // バッチエラーメッセージ(備考) 必要に応じて使用。

	// 工場コードとそれに対するロック解除キーの配列を保持するリスト
	private ArrayList plantList = new ArrayList();
	
	/** 業務ロッククラス */
	private BusinessLock lock = null;
	
	/** ロック失敗時ロックキー */
	private static final int LOCK_FAILD = -1;	
		
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
	private void writeLogMessage(String msgCd) throws Exception,BatchAppException{
		ExpjMessage am = new ExpjMessage(msgCd);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}

	/**
	* エラー/警告メッセージログ出力処理(IF情報管理番号埋め込み)
	*
	* @param String メッセージコード
	* @param String IF情報管理番号
	*/
	private void writeLogMessage(String msgCd,String if_no) throws Exception,BatchAppException{
		ExpjMessage am = new ExpjMessage(msgCd,if_no);
		CoreTools.write(am.getMessage(CoreTools.getLocale(strUserId)));
	}

	/**
	* エラー/警告メッセージログ出力補助情報(埋め込み)
	*
	* @param String 補助情報名
	* @param String 補助情報値
	*/
	private void writeLogMessageInfo(String name,String value) throws Exception,BatchAppException{
		AlarmMessage am = new AlarmMessage("AA99991","    " + name,value);
		CoreTools.write(am.getMessage());
	}

	/**
	* 業務ロックを行います
	* @param strBusinessName 業務名
	* @param strUserId ユーザコード
	* @param strMsgPlantCd 工場コード
	* @return ロックキャンセルキー
	* @throws FoundationException
	*/
	private int businessLock(String strBusinessName,String strUserId,String strMsgPlantCd) throws FoundationException {
		lock = new BusinessLock(conn, strUserId, strMsgPlantCd);
		// 解除キーの取得
		int lockCancelKey = lock.doLock(m_med.getProgname());
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
	* metamorBase業務メッセージの出力を行う。
	* metamorBase業務メッセージの出力には、業務名、ユーザコード、工場コードを必要とする
	*
	* @param conn DBコネクション
	* @param businessName 業務名
	* @param userId ユーザコード
	* @param plantCd 工場コード
	* @return なし
	*/
	protected void outBusinessMessage(IDbConnection conn, String businessName, String userId, String plantCd) {
	// 特定の業務エラーコードがセットされていない場合
		if (errCode == null) {
			errCode = "ZZ09009";  // バッチ処理を開始できませんでした。
		}

		// 業務メッセージの準備
		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();
		businessMsgAcc.init(conn);
		businessMsg.setBusinessOperatingName(businessName);
		businessMsg.setUser(userId);
		businessMsg.setPlantCode(plantCd);
		businessMsg.setMessageCode(errCode);
		businessMsg.setData(errNote);
		try {
			Numbering logCd = new Numbering(conn,Numbering.LOG_CD,userId,businessName,plantCd);
			businessMsg.setLogCode(logCd.getNo());
			businessMsgAcc.add(businessMsg);
			// 業務メッセージは、業務プログラム側でコネクションをコミットする
			// 必要がある。販売所要計画Ｉ／Ｆは、業務プログラムでトランザクションを
			// 意識する必要がないため、メイン処理と同じコネクションに対し都度コミット
			// する。
			conn.commit();
		} catch (SQLException e) {
			errCode = "AC00999"; // SQL実行時エラー。
			setBatchErrorMessage(e);
			e.printStackTrace();
		} catch (Exception e) {
			errCode = "KP06002";  // その他　Ｅｒｒｏｒ
			setBatchErrorMessage(e);
			e.printStackTrace();
		}
	}

	/**
	* バッチクラス共通エラー処理のエラーメッセージをメンバ変数にセットする。
	* バッチクラス共通エラー処理は、仕様上、引数にエラーコードではなくエラーメッセージ文字列を必要とする。
	* よって、業務プログラム側でエラーコードからメッセージを作成する必要がある。
	*
	* @param e Exceptionオブジェクト
	* @return なし
	*/
	protected void setBatchErrorMessage(Exception e) {
		// 特定のバッチエラーコードがセットされていない場合
		if (errCode == null) {
			errCode = "KP06002";  // その他　Ｅｒｒｏｒ
		}
		// バッチエラーメッセージの作成
		if (errMsg == null) {
			//AlarmMessage msg = new AlarmMessage(errCode);
			//errMsg = "[" + errCode + "]" + msg.getMessage();
		}
		// Exceptionオブジェクトにメッセージがある場合、付加する。
		if (e.getMessage() != null) {
			errMsg = errMsg + " " + e.getMessage();
		}
	}
	protected String getBatchErrorMessage() {
		return errMsg;
	}

	/**
	* 共通部品WorkCalendarを用いて稼働日ベースで日数計算を行う。
	* 計算にはユーザコード、業務コード、工場コード、対象日付、加算日、前倒しフラグが必要とする。
	*
	* @param Plant_Cd 工場コード
	* @param date     対象日付
	* @param margin   加算日
	* @param Item_Cd  品目番号
	* @return 計算結果
	*/
		private Date calcdate(String Plant_Cd, String Item_Cd, Date date, int margin)throws Exception{
			try{
				WorkCalendar wkd = new WorkCalendar(
												conn,
												strUserId,				//ユーザコード
												strBusinessName,			//業務コード
												Plant_Cd,					//工場コード
												Item_Cd,				//品目番号
												date,					//対象日付
												margin,		//加算日
												false					//前倒しフラグ
												);
				return wkd.calcDate();
			}catch(Exception e){
				throw new Exception();
			}
		}
	/**
	/**
	 * CtrlMainクラスの標準コンストラクタ
	 *
		 */
	public CtrlMain(medKP0060B001 med) throws BatchAppException
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
	public int main() throws BatchAppException {

		// ロック解除キー
		int lockCancelKey = LOCK_FAILD;
		
		try{

			// 引数受け取り
			String args[] = m_med.getArgs();
			if (args.length < 4 || args.length > 5) {
				throw new Exception();
			}

			strUserId = args[1];
			strMsgPlantCd = args[2];
			strBusinessName = args[3];
			if (args.length == 4) {
				strPlantCd = "%";
			} else {
				strPlantCd = args[4];
			}
			
			//パラメータ確認
			/*System.out.println(">>>PRG_NAM:" + strBusinessName);	// 業務名
			System.out.println(">>>USER_ID:" + strUserId);	// ユーザＩＤ
			System.out.println(">>>USER_PLNT_CD:" + strMsgPlantCd);	// ユーザ工場コード
			System.out.println(">>>PLNT_CD:" + strPlantCd);	// 工場コード*/

			conn = m_conductor.m_transactionConn;

			//内示・受注I/Fバッチの開始メッセージ登録
			// コネクションを渡して、業務メッセージ準備
			String strMsgCd = "KP06001";
			if(this.getSysMsg(strMsgCd)){
				CoreTools.write(strMsgCd);
			}else{
				throw new Exception();
			}
			errCode = "KP06001";
			errNote = "(SBM0600)<< 内示・受注Ｉ／Ｆバッチ処理開始 >>";
			outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
			CoreTools.write("\n(SBM1091)******>>>> 内示・受注Ｉ／Ｆスタート <<<******");

			//=======================================
			// 対象工場コード取得
			//=======================================
			m_med.setinPLANT_CD(strPlantCd);
			if(m_med.getreadM_PLANT().read() != SUCCESS){
				errCode = "KP06002";
				errNote = "(SBM0594)<< 致命的なエラー >>";
				throw new Exception();
			}
			if(m_med.getreadM_PLANT().next() == false){
				//対象工場コード取得失敗
				errCode = "KV03001";
				errNote = "(SBM0595)<< 指定した工場コードは未登録です >>";
				this.writeLogMessage(errCode);
				throw new Exception();
			}

			do {
				// 工場コードとロックを格納する配列を用意
				Object plantData[] = new Object[3];
				plantData[0] = m_med.getPLANT_CD(); // 工場コードをセット
				plantData[1] = null;                // ロックオブジェクト格納用
				plantData[2] = null;                // ロック解除キー格納用
				// リストに配列を保持
				plantList.add(plantData);
			} while (m_med.getreadM_PLANT().next() == true);

			for (Iterator it = plantList.iterator(); it.hasNext(); ) {
				try{
					// 各工場コードの取得
					Object plantData[] = (Object[]) it.next();
					String plantCd = plantData[0].toString();
					m_med.setPLANT_CD(plantCd);
					//System.out.println("工場コード :"+m_med.getPLANT_CD());
					
					//=======================================
					// 業務ロック
					//=======================================
					lockCancelKey = businessLock(strBusinessName,strUserId,plantCd);
					if (lockCancelKey == LOCK_FAILD) {
						//this.writeLogMessage("ZZ01008");
						strMsgCd = "ZZ01008";
						if(this.getSysMsg(strMsgCd)){
							CoreTools.write(strMsgCd);
						}else{
							throw new Exception();
						}
						// コネクションを渡して、業務メッセージ準備
						errCode = "ZZ01008";
						errNote = "(SBM0596)<< 業務ロックの開始に失敗しました。 >>";
						outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						CoreTools.write("(SBM0596)業務ロックの開始に失敗しました。");
						return BREAK;
					}
		
					m_med.setSysdate(Converter.dateToStr(new Date(),"yyyy/MM/dd HH:mm:ss"));
					m_med.setUsername(strUserId);
					//=======================================
					// 自社情報コード
					//=======================================
					if(m_med.getreadSYS_MY_COMPANY().read() != SUCCESS){
						errCode = "KP06002";
						errNote = "(SBM0594)<< 致命的なエラー >>";
						throw new Exception();
					}
					if(m_med.getreadSYS_MY_COMPANY().next() == false){
						//自社情報コード取得失敗
						errCode = "KQ00039";
						errNote = "(SBM0597)<< 自社情報の取得に失敗しました >>";
						this.writeLogMessage(errCode);
					//	outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
						throw new Exception();
					}
					// 自社情報
					CoreTools.write("BATCH COMPANY_CD=" + m_med.getCOMPANY_CD());
					//System.out.println("自社コード :"+m_med.getCOMPANY_CD());
					
					// 工場情報
					CoreTools.write("BATCH PLANT_CD=" + plantCd);
		
					//=======================================
					// 削除対象のレコードを削除する
					//=======================================
					if(m_med.getdeleteT_OD().delete() != SUCCESS){
						errCode = "KP06002";
						errNote = "(SBM0594)<< 致命的なエラー >>";
						throw new Exception();
					}
					//=======================================
					// [販売所要計画]の対象レコードを抽出する
					//=======================================
					if(m_med.getreadT_ODR().read() != SUCCESS){
						errCode = "KP06002";
						errNote = "(SBM0594)<< 致命的なエラー >>";
						throw new Exception();
					}
	
					//=======================================
					// [システムパラメータ]の取込月数
					//=======================================
					String KP_ADD_MONTH =null;
					String KP_SUB_MONTH =null;
					if(m_med.getreadKP_ADD_MONTH().read() != SUCCESS){
						errCode = "KP06002";
						errNote = "(SBM0594)<< 致命的なエラー >>";
						throw new Exception();
					}else{
						m_med.getreadKP_ADD_MONTH().next();
						KP_ADD_MONTH = m_med.getKP_ADD_MONTH();
					}
					if( m_med.getreadKP_SUB_MONTH().read()!= SUCCESS){
						errCode = "KP06002";
						errNote = "(SBM0594)<< 致命的なエラー >>";
						throw new Exception();
					}else{
						m_med.getreadKP_SUB_MONTH().next();
						KP_SUB_MONTH = m_med.getKP_SUB_MONTH();
					}
					//System.out.println("未来取込月数 :"+m_med.getKP_ADD_MONTH()+"  過去取込月数 :"+m_med.getKP_SUB_MONTH());
					while (m_med.getreadT_ODR().next() == true) {
	
						//=======================================
						// 取込開始日、取込終了日の算出
						//=======================================
						String KP_STR_DATE = null;
						String KP_END_DATE = null;
						
						//取込開始日を算出
						KP_STR_DATE = DateTool.subtractMonth(m_med.getBUSINESS_OPR_DATE(),KP_SUB_MONTH);
						Calendar cal = Calendar.getInstance();
						Date tempDate = new Date();
						tempDate = Converter.strToDate(KP_STR_DATE ,"yyyy/MM/dd");
						cal.setTime(tempDate);
						cal.set(cal.DAY_OF_MONTH,1);
						tempDate = cal.getTime();
						KP_STR_DATE = Converter.dateToStr(tempDate ,"yyyy/MM/dd");
	
						//取込終了日を算出
						KP_END_DATE = DateTool.addMonth(m_med.getBUSINESS_OPR_DATE(),KP_ADD_MONTH);
						tempDate = Converter.strToDate(KP_END_DATE ,"yyyy/MM/dd");
						cal.setTime(tempDate);
						cal.set(cal.DAY_OF_MONTH,cal.getActualMaximum(cal.DAY_OF_MONTH));
						tempDate = cal.getTime();
						KP_END_DATE = Converter.dateToStr(tempDate ,"yyyy/MM/dd");
						
						//System.out.println("取込開始日 :"+KP_STR_DATE+"  取込終了日 :"+KP_END_DATE);
						//System.out.println("DESINATED_DLV_DATE ;"+m_med.getDESINATED_DLV_DATE()+" ODR_TYP ;"+m_med.getODR_TYP());
						
						//取込期間に属するかチェック
						boolean chk_fg = false;
						if((m_med.getODR_TYP()).equals("2")){
							if ((DateTool.compareYMD(m_med.getDESINATED_DLV_DATE(), KP_STR_DATE)) >= 0 
								&& (DateTool.compareYMD(m_med.getDESINATED_DLV_DATE(), KP_END_DATE)) <= 0){
								chk_fg = true;
							}
						}else{
							chk_fg = true;
						}
						if(chk_fg){
							//System.out.println("*****計画範囲内******");
	
							//=======================================
							// 要求納期、デマンド数の設定
							//=======================================
	
							String ShipLT = null;
							String DM_QTY = null;
							//出荷Ｌ／Ｔの設定
							if(m_med.getreadSYS_CLASS_CODE().read() != SUCCESS){
								errCode = "KP06002";
								errNote = "(SBM0594)<< 致命的なエラー >>";
								throw new Exception();
							}else{
								m_med.getreadSYS_CLASS_CODE().next();
								ShipLT = m_med.getCLASS_CD();
							}
	
							if((m_med.getODR_TYP()).equals("3")){
								tempDate = this.calcdate(m_med.getPLANT_CD(),m_med.getITEM_CD(),
														Converter.strToDate(m_med.getDESINATED_DLV_DATE(),"yyyy/MM/dd"),
														-((Integer.parseInt(m_med.getTRANSPORT_LT()))+ (Integer.parseInt(ShipLT)))
														);
	
								//System.out.println("要求納期 :"+tempDate+"  出荷L/T :"+ShipLT + "運送日数  :"+m_med.getTRANSPORT_LT());
								m_med.setDUE_DATE(Converter.dateToStr(tempDate,"yyyy/MM/dd"));
								m_med.setDM_QTY(m_med.getODR_QTY());
							}else if((m_med.getODR_TYP()).equals("2")){
								tempDate = this.calcdate(m_med.getPLANT_CD(),m_med.getITEM_CD(),
														Converter.strToDate(m_med.getDESINATED_DLV_DATE(),"yyyy/MM/dd"),
														-((Integer.parseInt(m_med.getTRANSPORT_LT()))+ (Integer.parseInt(ShipLT)))
														);
								//System.out.println("要求納期 :"+tempDate+"  出荷L/T :"+ShipLT + "運送日数  :"+m_med.getTRANSPORT_LT());
								m_med.setDUE_DATE(Converter.dateToStr(tempDate,"yyyy/MM/dd"));
								m_med.setDM_QTY(m_med.getREMAIN_UNCONFIRM_ODR_QTY());
							}
							if (tempDate == null) {
								errCode = "KP06002";
								errNote = "(SBM0594)<< 致命的なエラー >>";
								throw new Exception();
							}
							//=======================================
							// [所要量]の更新
							//=======================================
	
							String inOD_NO = null;
							//追加対象のレコードを追加する(初日に登録、末日に登録選択時）
	
							// オーダデマンド番号採番クラスオブジェクト生成
							Numbering MyNo = new Numbering(conn,
												Numbering.ODNO,
												strUserId,
												strBusinessName,
												m_med.getWH_PLANT_CD()
							);
							inOD_NO = MyNo.getNo();
							if (inOD_NO == null || inOD_NO.trim().length() == 0) {
								errCode = "KP06002";
								errNote = "(SBM0594)<< 致命的なエラー >>";
								throw new Exception();
							}
							if(m_med.getreadTOTAL_SHIP_QTY().read() != SUCCESS){
								errCode = "KP06002";
								errNote = "(SBM0594)<< 致命的なエラー >>";
								throw new Exception();
							}else{
								m_med.getreadTOTAL_SHIP_QTY().next();
							}
							m_med.setinOD_NO(inOD_NO);
							/*System.out.println("合計出荷指示累計数  :"+m_med.getTOTAL_SHIP_QTY());
							System.out.println("****以下のデータを[所要量]に追加する*****");
							System.out.println("OD_NO:"+m_med.getinOD_NO()+" PLANT_CD:"+m_med.getPLANT_CD()+" ITEM_CD:"+m_med.getITEM_CD());
							System.out.println("DUE_DATE:"+m_med.getDUE_DATE()+" PRD_DUE_DATE:"+m_med.getDUE_DATE()+" DM_QTY:"+m_med.getDM_QTY());
							System.out.println("MRP_ODR_TYP:"+m_med.getMRP_ODR_TYP()+" OUTSIDE_TYP:"+m_med.getOUTSIDE_TYP()+" ISSUE_TYP:"+m_med.getISSUE_TYP());
							System.out.println("ODR_LT:"+m_med.getODR_LT()+" FIXED_LT:"+m_med.getFIXED_LT()+" PROP_LT:"+m_med.getPROP_LT());
							System.out.println("SAFETY_LT:"+m_med.getSAFETY_LT()+" ISSUE_LT:"+m_med.getISSUE_LT()+" PROP_LOT_SIZE:"+m_med.getPROP_LOT_SIZE());
							System.out.println("OD_LEVEL_NO:"+m_med.getHIGH_LEVEL_NO()+" ITEM_SPOIL:"+m_med.getITEM_SPOIL());
							System.out.println(" ");*/
	
							if(m_med.getinsertT_OD().create() != SUCCESS){
								errCode = "KP06002";
								errNote = "(SBM0594)<< 致命的なエラー >>";
								throw new Exception();
							}
						}else{
							//System.out.println("****計画範囲外****");
							//System.out.println(" ");
						}
					}
				}catch(Exception e){
					throw e;
				}finally{
					//=======================================
					// 業務ロック解除
					//=======================================
					if (!businessUnLock(lockCancelKey)) {
						this.writeLogMessage("ZZ01004");
					}
				}
			}

		} catch (Exception e) {
			try {
			    conn.rollback();
			    e.printStackTrace();
				setBatchErrorMessage(e);
				outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
			} catch (Exception ee) {
				ee.printStackTrace();
			}
		} finally {
			try {
			//バッチ終了メッセージ登録
			errCode = "KP06003";
			errNote = "(SBM0601)<< 内示・受注Ｉ／Ｆバッチ処理終了 >>";
			outBusinessMessage(conn, strBusinessName, strUserId, strMsgPlantCd);
			conn.commit();
			CoreTools.write("\n(SBM1092)******>>>> 内示・受注Ｉ／Ｆエンド <<<******");

			//内示・受注Ｉ／Ｆバッチの終了メッセージ登録sww20040804追加
			// コネクションを渡して、業務メッセージ準備
			String strMsgCd = "KP06003";
			if(this.getSysMsg(strMsgCd)){
				CoreTools.write(strMsgCd);
			}
		    } catch (Exception ee) {
				ee.printStackTrace();
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
		public medKP0060B001 m_med=null;

		/**
		 * コンテナクラスインスタンス
		 */
		public ManageContainer m_container=null;

		//////////////////////////////

		public interControl(medKP0060B001 med) throws BatchAppException
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
