/**
 *(#)WorkDay.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author S.Takahashi
 * Date : 2003/08/05
 * @version 1.00
 * History 2003/07/29 新規作成 S.Takahashi
 * @version 1.01
 * History 2003/08/08 S.Takahashi
 * コンストラクタ追加
 * 稼動日計算（引数：対象日付、加算日、前倒しフラグ）メソッド追加(calcDate)
 * 稼動日判定メソッド追加(isWorkDate)
 * 稼動日判定（引数：対象日）メソッド追加(isWorkDate)
 * @version 1.02
 * History 2003/08/13 T.Taniguchi
 * ・使用するコネクションを外部より指定する形式に変更。
 * @version 1.03
 * History 2003/08/17 実態をWorkCalender()とし、その拡張として再作成 T.Taniguchi
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
public class WorkDay extends WorkCalendar{

	/**
	 * コンストラクタ
	 *
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	 * @param  date         対象日付
	 * @param  margin       加算日
	 * @param  moveFlg      前倒しフラグ（対象日付が休日の場合にその日以降の初稼働日を基準にする(true)かその日以前の初稼働日を基準にする(false)か）
	 * @throws FoundationException プロパティファイル読込失敗
	*/
	public WorkDay(String userCd,String businessCd,
							String plantCd,Date date,int margin,boolean moveFlg) throws FoundationException{
		super(null,userCd,businessCd,plantCd,date,margin,moveFlg);
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
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	 * @param  date         対象日付
	 * @throws FoundationException プロパティファイル読込失敗
	*/
	public WorkDay(String userCd,String businessCd,
							String plantCd,Date date) throws FoundationException{
		super(null,userCd,businessCd,plantCd,date);
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
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	 * @param  itemcd       品目番号
	 * @param  date         対象日付
	 * @param  margin       加算日
	 * @param  moveFlg      前倒しフラグ（対象日付が休日の場合にその日以降の初稼働日を基準にする(true)かその日以前の初稼働日を基準にする(false)か）
	 * @throws FoundationException プロパティファイル読込失敗
	*/
	public WorkDay(String userCd,String businessCd,
							String plantCd,String itemCd,Date date,int margin,boolean moveFlg) throws FoundationException{
		super(null,userCd,businessCd,plantCd,itemCd,date,margin,moveFlg);
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
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	 * @param  itemcd       品目番号
	 * @param  date         対象日付
	 * @throws FoundationException プロパティファイル読込失敗
	*/
	public WorkDay(String userCd,String businessCd,
							String plantCd,String itemCd,Date date) throws FoundationException{
		super(null,userCd,businessCd,plantCd,itemCd,date);
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

	/**
	 * 対象日付から算出した稼動日日付を返却する。（SP部品使用）
	 *
	 * @return         算出された日付を返却
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
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
		IDbConnection conn = null;
		try{
			conn = CoreTools.getTransConnection();
			WorkCalendar MyCal;
			MyCal = new WorkCalendar(conn,userCd,businessCd,plantCd,itemCd,date,margin,moveFlg);
			calcDate = MyCal.calcDate();
			this.resultStatus =MyCal.getResultStatus();
			MyCal = null;

		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
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
		IDbConnection conn = null;

		try{
			conn = CoreTools.getTransConnection();
			WorkCalendar MyCal;
			MyCal = new WorkCalendar(conn,userCd,businessCd,plantCd,itemCd,date,margin,moveFlg);
			checkOk = MyCal.isWorkDate();
			this.resultStatus =MyCal.getResultStatus();
			MyCal = null;

		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
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
			FoundationException fe = new FoundationException("WorkDay",mre.getMessage(),"(SBM0854)プロパティファイルの読み込みに失敗しました。");
			fe.setPreviousException(mre);
			throw fe;
		}
	}
}

