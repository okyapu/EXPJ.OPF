/**
 *(#)WorkCalendar.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author T.Taniguchi
 * Date : 2003/08/17
 * @version 1.00
 * History 2003/08/17 WorkDayよりコピーして新規作成 T.Taniguchi
 *         2003/11/10 isWorkDate()がカレンダの存在しない日付の指定でNullPointerExceptionとなるバグを修正 T.Taniguchi

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
 * 稼働日計算を行うクラス
 */
public class WorkCalendar{

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
	 * @param  date         対象日付
	 * @param  margin       加算日
	 * @param  moveFlg      前倒しフラグ（対象日付が休日の場合にその日以降の初稼働日を基準にする(true)かその日以前の初稼働日を基準にする(false)か）
	 * @throws FoundationException プロパティファイル読込失敗
	*/
	public WorkCalendar(IDbConnection conn,String userCd,String businessCd,
							String plantCd,Date date,int margin,boolean moveFlg) throws FoundationException{
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.date = date;
		this.margin = margin;
		this.moveFlg = moveFlg;

		this.readProperty();
	}


	/**
	 * コンストラクタ
	 *
	 * @param  conn         DBコネクション
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	 * @param  date         対象日付
	 * @throws FoundationException プロパティファイル読込失敗
	*/
	public WorkCalendar(IDbConnection conn,String userCd,String businessCd,
							String plantCd,Date date) throws FoundationException{
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.date = date;
		this.margin = 0;
		this.moveFlg = false;

		this.readProperty();
	}

	/**
	 * コンストラクタ
	 *
	 * @param  conn         DBコネクション
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	 * @param  itemcd       品目番号
	 * @param  date         対象日付
	 * @param  margin       加算日
	 * @param  moveFlg      前倒しフラグ（対象日付が休日の場合にその日以降の初稼働日を基準にする(true)かその日以前の初稼働日を基準にする(false)か）
	 * @throws FoundationException プロパティファイル読込失敗
	*/
	public WorkCalendar(IDbConnection conn,String userCd,String businessCd,
							String plantCd,String itemCd,Date date,int margin,
							boolean moveFlg) throws FoundationException{
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.itemCd = itemCd;
		this.date = date;
		this.margin = margin;
		this.moveFlg = moveFlg;

		this.readProperty();
	}
	
	/**
	 * コンストラクタ
	 *
	 * @param  conn         DBコネクション
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	 * @param  itemcd       品目番号
	 * @param  date         対象日付
	 * @throws FoundationException プロパティファイル読込失敗
	*/
	public WorkCalendar(IDbConnection conn,String userCd,String businessCd,
							String plantCd,String itemCd,Date date) throws FoundationException{
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.itemCd = itemCd;
		this.date = date;
		this.margin = 0;
		this.moveFlg = false;

		this.readProperty();
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

