/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ATWorkCalendar.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 * Copyright (c) 2003-2004 NEC Nexsolution Ltd.
 *
 */


package com.nec.jp.orteus.expj.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import com.nec.jp.orteus.xaf.util.FoundationException;


/**
 *(#)ATWorkCalendar.java
 *
 * Copyright (c) 2008 NEXS,Ltd.
 *
 * @author nexs.ima
 * Date : 2008/10/08
 * @version 1.01
 * History 
 * <pre>
 * 2008/07/07 新規 WorkCalendar.javaよりコピーして新規作成 nexs.ima
 * 2008/10/08 時間（分）のシフトメソッドの追加・修正 nexs.ima
 * 
 * ・For AT Chk:20081208
 * 
 * </pre>
 *         
 */


//public class ATWorkCalendar extends WorkCalendar{
public class ATWorkCalendar {

	public static final String SHIFT_END = "1";
	public static final String SHIFT_START = "0";
	
	public String userCd = null;
	public String businessCd = null;
	public String plantCd = null;
	public String itemCd = null;
	public Date date = null;
	public int margin = 0;
	public boolean moveFlg = false;
	public String logMode = null;
	public String outPutMode = null;
	public String outPutPath = null;
	public String outPutName = null;
	
	public Date baseDate = null;
	public Date targetDate = null;
	public String shiftMin = null;
	
	protected Integer resultStatus = null;
	protected SystemLog sysLog = null;
	protected IDbConnection conn = null;


	/**
	 * コンストラクタ
	 *
	 * @param  conn         DBコネクション
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	 * @throws FoundationException プロパティファイル読込失敗
	*/
	public ATWorkCalendar(
				IDbConnection conn,
				String userCd,
				String businessCd,
				String plantCd) throws FoundationException{
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.margin = 0;
		this.moveFlg = false;

		this.readProperty();
	}

	
	//-------ADD 20081208
	private String calcShiftVal() throws FoundationException{
		if(this.userCd == null || this.businessCd == null || this.plantCd == null 
				|| this.itemCd == null 
				|| this.baseDate == null 
				|| this.targetDate == null){
			return null;
		}
		int moveFlgInt = 0;
		if(this.moveFlg){
			moveFlgInt = 1;
		}

		this.resultStatus = null;
		String calcMin = null;
		IDbAdapter adapt = null;
		
			try{
				adapt = conn.getSpAdapter("begin SQLWORKMINUTEDIFF(?,?,?,?,?,?,?,?,?,?,?,?); end;");
				adapt.setString(1,this.logMode);//LOGモード
				adapt.setString(2,this.outPutMode);//出力モード
				adapt.setString(3,this.outPutPath);//出力ファイルパス
				adapt.setString(4,this.outPutName);//出力ファイル名
				adapt.setString(5,this.userCd);//ユーザID
				adapt.setString(6,this.businessCd);//業務名
				adapt.setString(7,this.plantCd);//工場コード
				adapt.setString(8,this.itemCd);//品目番号
				adapt.setDate(9,this.baseDate);//対象日時
				adapt.setDate(10,this.targetDate);//目的の日時
				adapt.setOutString(11);//計算結果	・・・日時の差（分）
				adapt.setOutInteger(12);//計算結果FLG

				adapt.execUpdate();

				calcMin = adapt.getOutString(11);
				this.resultStatus = adapt.getOutInteger(12);
			}finally{
				if(adapt != null){
					adapt.close();
					adapt = null;
				}
			}
			return calcMin;
	}

	/**
	 * 基準日時から対象日時までの稼動時間の差を分で求める。（SP部品使用）For AT
	 *
	 * @param  baseDate   基準日時
	 * @param  targetDate   対象日時
	 * @return         算出された時間を分で返す（String型）
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public String calcShiftVal(Date baseDate,Date targetDate) throws FoundationException{
		this.baseDate = baseDate;
		this.targetDate = targetDate;
		
		return this.calcShiftVal();
	}

	
	//	-------ADD 20081208
	private Date calcShiftMinute(String endFlg) throws FoundationException{
		if(this.userCd == null || this.businessCd == null || this.plantCd == null 
				|| this.baseDate == null
				|| this.shiftMin == null){
						//-----Item:Null可
			return null;
		}
		int moveFlgInt = 0;
		if(this.moveFlg){
			moveFlgInt = 1;
		}

		this.resultStatus = null;
		Date calcDate = null;
		IDbAdapter adapt = null;
		
			try{
				adapt = conn.getSpAdapter("begin SQLWORKMINUTESHIFT(?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
				adapt.setString(1,this.logMode);//LOGモード
				adapt.setString(2,this.outPutMode);//出力モード
				adapt.setString(3,this.outPutPath);//出力ファイルパス
				adapt.setString(4,this.outPutName);//出力ファイル名
				adapt.setString(5,this.userCd);//ユーザID
				adapt.setString(6,this.businessCd);//業務名
				adapt.setString(7,this.plantCd);//工場コード
				adapt.setString(8,this.itemCd);//品目番号
				adapt.setDate(9,this.baseDate);//対象日付
				adapt.setString(10,this.shiftMin);//加算分
				adapt.setString(11, endFlg); 
				adapt.setOutDate(12);//計算結果
				adapt.setOutInteger(13);//計算結果

				adapt.execUpdate();
				
				calcDate = adapt.getOutDate(12);
				this.resultStatus = adapt.getOutInteger(13);
				
			}finally{
				if(adapt != null){
					adapt.close();
					adapt = null;
				}
			}
			return calcDate;
	}

	/**
	 * 対象基準日時から分でシフト算出した稼動日日時を返却する。（SP部品使用）For AT
	 * Def 納期系吸着"1"：SHIFT_END
	 * 
	 * @param  baseDate   対象基準日時
	 * @param  shiftMin     シフトする分（マイナス可）
	 * @return         算出された日時を返却（Date型）
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public Date calcShiftMinute(Date baseDate,String shiftMin) 
	throws FoundationException{
		this.baseDate = baseDate;
		this.shiftMin = shiftMin;

		return this.calcShiftMinute(SHIFT_END);	
	}
	
	/**
	 * 対象基準日時から分でシフト算出した稼動日日時を返却する。（SP部品使用）For AT
	 *
	 * @param  baseDate   対象基準日時
	 * @param  shiftMin     シフトする分（マイナス可）
	 * @param  shiftFlg     吸着タイプ（「SHIFT_END」1：納期、「SHIFT_START」0：開始日）
	 * @return         算出された日時を返却（Date型）
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public Date calcShiftMinute(Date baseDate,String shiftMin, String shiftFlg) 
	throws FoundationException{
		this.baseDate = baseDate;
		this.shiftMin = shiftMin;

		return this.calcShiftMinute(shiftFlg);
	}
	
	
	
	
	public Date calcDate() throws FoundationException{
		if(this.userCd == null || this.businessCd == null || this.plantCd == null || this.date == null){
			return null;
		}
		int moveFlgInt = 0;
		if(this.moveFlg){
			moveFlgInt = 1;
		}

		this.resultStatus = null;
		Date calcDate = null;
		IDbAdapter adapt = null;
		
			try{
				adapt = conn.getSpAdapter("begin SQLWORKDAYCALC(?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
				adapt.setString(1,this.logMode);//LOGモード
				adapt.setString(2,this.outPutMode);//出力モード
				adapt.setString(3,this.outPutPath);//出力ファイルパス
				adapt.setString(4,this.outPutName);//出力ファイル名
				adapt.setString(5,this.userCd);//ユーザID
				adapt.setString(6,this.businessCd);//業務名
				adapt.setString(7,this.plantCd);//工場コード
				adapt.setString(8,this.itemCd);//品目番号
				adapt.setDate(9,this.date);//対象日付
				adapt.setInt(10,this.margin);//加算日
				adapt.setInt(11,moveFlgInt);//前倒しフラグ
				adapt.setOutDate(12);//計算結果
				adapt.setOutInteger(13);//計算結果

				adapt.execUpdate();

				calcDate = adapt.getOutDate(12);
				this.resultStatus = adapt.getOutInteger(13);
			}finally{
				if(adapt != null){
					adapt.close();
					adapt = null;
				}
			}
			return calcDate;
	}

	/**
	 * 対象日付から算出した稼動日日付を返却する。（SP部品使用）
	 *
	 * @param  date       対象日付
	 * @param  margin     加算日
	 * @param  moveFlg    前倒しフラグ
	 * @return         算出された日付を返却
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public Date calcDate(Date date,int margin,boolean moveFlg) throws FoundationException{
		this.date = date;
		this.margin = margin;
		this.moveFlg = moveFlg;
		
		return this.calcDate();
	}


	/**
	 * 稼動日かどうか判断する。（SP部品使用）
	 *
	 * @return         稼動日の場合true、それ以外false
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public boolean isWorkDate() throws FoundationException{
		if(this.userCd == null || this.businessCd == null || this.plantCd == null || this.date == null){
			return false;
		}

		this.resultStatus = null;
		boolean checkOk = false;

		IDbAdapter adapt = null;

		try{
			adapt = conn.getSpAdapter("begin SQLISWORKDAY(?,?,?,?,?,?,?,?,?,?,?); end;");
			adapt.setString(1,this.logMode);//LOGモード
			adapt.setString(2,this.outPutMode);//出力モード
			adapt.setString(3,this.outPutPath);//出力ファイルパス
			adapt.setString(4,this.outPutName);//出力ファイル名
			adapt.setString(5,this.userCd);//ユーザID
			adapt.setString(6,this.businessCd);//業務名
			adapt.setString(7,this.plantCd);//工場コード
			adapt.setString(8,this.itemCd);//品目番号
			adapt.setDate(9,this.date);//対象日付
			adapt.setOutInteger(10);//計算結果
			adapt.setOutInteger(11);//計算結果

			adapt.execUpdate();

			Integer resultInt = adapt.getOutInteger(10);
			this.resultStatus = adapt.getOutInteger(11);

			if(resultInt == null){
				checkOk = false;
			}
			else if(resultInt.intValue() == 0){
				checkOk = false;
			}else{
				checkOk = true;
			}

		}finally{
			if(adapt != null){
				adapt.close();
				adapt = null;
			}
		}

		return checkOk;
	}
	/**
	 * 稼動日かどうか判断する。（SP部品使用）
	 *
	 * @param  date       対象日付
	 * @return         稼動日の場合true、それ以外false
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public boolean isWorkDate(Date date) throws FoundationException{
		this.date = date;
		return this.isWorkDate();
	}


	/**
	 * LOG出力情報をプロパティファイルから読み込む
	*/
	private void readProperty() throws FoundationException{
		try{
			ResourceBundle rb = SystemConfig.getBundle();
			this.logMode = SystemConfig.getProperty("LOG_MODE",rb);
			this.outPutMode = SystemConfig.getProperty("OUTPUT_MODE",rb);
			this.outPutPath = SystemConfig.getProperty("OUTPUT_PATH",rb);
			this.outPutName = SystemConfig.getProperty("OUTPUT_NAME",rb);
		}catch(MissingResourceException mre){
			FoundationException fe = new FoundationException("WorkCalendar",mre.getMessage(),"(SBM0854)プロパティファイルの読み込みに失敗しました。");
			fe.setPreviousException(mre);
			throw fe;
		}
	}


	/**
	 * 処理結果を取得する
	 * @return         チェック結果のステータスを取得
	 */
	public Integer getResultStatus(){
		return this.resultStatus;
	}
}

