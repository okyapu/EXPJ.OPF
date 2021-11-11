/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvCancel.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

//package com.nec.jp.orteus.expj.stock;
package com.nec.jp.orteus.expj.pr.rcvissue.process;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.*;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.*;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 * <B>RcvCancel</B><BR>
 * 入庫処理メイン処理<BR>
 * <BR>
 *  : 1.0.0.1、<2003/10/12>、修正履歴
 * 1.入庫取り消し処理呼び出し後に、所要量の更新する処理を追加。
 *  : 1.0.0.2、<2003/10/13>、修正履歴
 * 1.所要量更新時に、更新プログラム名が業務コードになってしまっているのを、業務名に修正。
 * 2.保管区別入出庫更新時に、更新プログラム名が業務コードになってしまっているのを、業務名に修正。
 * 3.保管区別入出庫へ登録時に、保管区別入出庫から取得した更新プログラム名を登録するように修正。
 * 4.前月実績数の読み込みの条件で、系列番号にnullが入ってきた場合に、系列番号がnullのデータを検索できないバグを修正。
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $
 */
public class RcvCancel
{

	/**
	 * デフォルトコンストラクタ
	 */
	private RcvCancel(){}
	
	/**
	 * 指定のコネクションを持つオブジェクトを構築する
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 * @param  rcvIssueCtrlCd 入庫処理を行う入出庫管理番号
	 * @param  UserId 処理を呼び出すユーザのID
	 */
	public RcvCancel(IDbConnection connect, String rcvIssueCtrlCd, String UserId)
	{
		_conn = connect;
		_ctrlCd = rcvIssueCtrlCd;
		_userId = UserId;
	}

	/**
	 * 入庫処理のmainメソッド
	 *
	 * @return boolean 処理成功ならtrue、処理失敗ならfalseを返す
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public boolean execProcess() throws SQLException
	{
		RcvCancelStruct _struct = new RcvCancelStruct();
		RcvCancelDBAccessor _dbAccessor = new RcvCancelDBAccessor(_conn);
		//ログ出力
		SystemLog sysLog = new SystemLog();
		boolean logInit = false;
		
		try{
			logInit = sysLog.init("com.nec.jp.orteus.metamorBase.common03.RcvCancel");
			if(!logInit) throw new AlarmMessageException("ZZ01005",new String[0]); //初期化失敗
			// 保管区別入出庫テーブルの読込み
			_struct = _dbAccessor.selectRcvIssue(_ctrlCd);
			String UpdatedPrgNm = _struct.getUPDATED_PRG_NM(); //20031013追記

			if(_struct == null)
			{
				_errorList.add("AD00078");//ｴﾗｰｺｰﾄﾞ確認
				sysLog.setConnection(_conn);
				sysLog.warning("AD00078",_userId);
				return false;
			}

			// --- 2.4.2 エラーチェック --->
			// 入出庫区分が"1"(入庫)でない
			if(_struct.getRCV_ISSUE_TYP()!=null
					&& !_struct.getRCV_ISSUE_TYP().equals("1")){
				_errorList.add("AD00069");//ｴﾗｰｺｰﾄﾞ確認
				sysLog.setConnection(_conn);
				sysLog.warning("AD00069",_userId);
				return false;
			}

			// 入出庫発生区分が"11"(通常入庫)でない
			if(_struct.getRCV_ISSUE_GNR_TYP()!=null 
					&& !_struct.getRCV_ISSUE_GNR_TYP().equals("11")){
				_errorList.add("AD00070");//ｴﾗｰｺｰﾄﾞ確認
				sysLog.setConnection(_conn);
				sysLog.warning("AD00070",_userId);
				return false;
			}

			// 入出庫数量が０より小さい
			if(_struct.getRCV_ISSUE_QTY()!=null
					&& _struct.getRCV_ISSUE_QTY().compareTo("0")<0)
			{
				_errorList.add("AD00071");
				sysLog.setConnection(_conn);
				sysLog.warning("AD00071",_userId);
				return false;
			}

			// 品目手配区分が"8"(擬似品目)
			if(_struct.getMRP_ODR_TYP()!=null 
				&& _struct.getMRP_ODR_TYP().equals("8"))
			{
				_errorList.add("AD00072");
				sysLog.setConnection(_conn);
				sysLog.warning("AD00072",_userId);
				return false;
			}
			//<------------------------

			// 2.4.3 入庫処理の呼び出し
			RcvProcess RcvP = new RcvProcess(_conn,_ctrlCd);
			boolean bRslt = RcvP.execProcess();
			if( !bRslt ) return false;

			// 2.4.4 所要量の更新 --20031012.CommonOdに引き渡す業務名を修正
			CommonOd C_Od = new CommonOd(_conn,_struct.getPLANT_CD(),_userId,_struct.getUPDATED_PRG_NM());
			C_Od.updateOrderForReceive(_struct.getOD_NO()
										,Double.parseDouble(_struct.getRCV_ISSUE_QTY())
										,Long.parseLong("-1"));

			// 2.4.5 入庫取り消し処理
			// 前回入庫実績の検索
			if(_struct.getPUCH_ODR_CD()==null
					&& _struct.getOPR_RSLT_CRCT_NO()!=null
					&& _struct.getOPR_RSLT_CRCT_NO().compareTo("1")>=0){
				_struct = _dbAccessor.selectLstRslt(_struct);
			}else{
				return true;	//前回入庫実績を検索しない場合は処理自体を抜ける。ｴﾗｰではない ---20031010修正エラーではないのでtrueで返す。
			}

			if(_struct == null)
			{
				_errorList.add("AD00078");//ｴﾗｰｺｰﾄﾞ確認
				sysLog.setConnection(_conn);
				sysLog.warning("AD00078",_userId);
				return false;
			}

			//保管区別入出庫への追加
			BigDecimal bQty = new BigDecimal(_struct.getRCV_ISSUE_QTY());
			_struct.setRCV_ISSUE_QTY(bQty.negate().toString());
			CollectNumber IssueCd = new CollectNumber(CollectNumber.ISSUE_CD,_userId,"RcvCancel",_struct.getPLANT_CD());
			_struct.setRCV_ISSUE_CTRL_CD(IssueCd.getNo());//採番したｷｰをｾｯﾄ
			_struct.setUPDATED_BY(_userId);
//20031012修正			_struct.setUPDATED_PRG_NM("RcvCancel");
			_struct.setUPDATED_PRG_NM(UpdatedPrgNm);
			int iROWS = _dbAccessor.insertRcvIssue(_struct);

/*bak20031010
			//保管区別入出庫への追加
			BigDecimal bQty = new BigDecimal(_struct.getRCV_ISSUE_QTY());
			_struct.setRCV_ISSUE_QTY(bQty.negate().toString());
			CollectNumber IssueCd = new CollectNumber(CollectNumber.ISSUE_CD,_userId,"RcvCancel",_struct.getPLANT_CD());
			String No = IssueCd.getNo();
			_struct.setRCV_ISSUE_CTRL_CD(No);//採番したｷｰをｾｯﾄ
			_struct.setUPDATED_BY(_userId);
			_struct.setUPDATED_PRG_NM("RcvCancel");
			int iROWS = _dbAccessor.insertRcvIssue(_struct);
*/
			// 入庫取り消し処理呼び出し
			RcvP = new RcvProcess(_conn,_struct.getRCV_ISSUE_CTRL_CD());
			bRslt = RcvP.execProcess();
			if( !bRslt ) {
				if (RcvP.getErrorList() != null && !RcvP.getErrorList().isEmpty() && RcvP.getErrorList().size() > 0) {
					for (int m = 0; m < RcvP.getErrorList().size(); m++){
						_errorList.add((String)RcvP.getErrorList().get(m));
					}
				}
				return false;
			}

			// 所要量の更新 ---20031010追加
			C_Od = new CommonOd(_conn,_struct.getPLANT_CD(),_userId,_struct.getUPDATED_PRG_NM());
			C_Od.updateOrderForReceive(_struct.getOD_NO()
										,Double.parseDouble(_struct.getRCV_ISSUE_QTY())
										,Long.parseLong("-1"));

			return true;

		}catch(Exception e){
			e.printStackTrace();
			sysLog.setConnection(_conn);
			sysLog.severe("ZZ01106",_userId);
			return false;
		}
	}

	/** 入庫処理コネクションクラス */
	protected IDbConnection _conn;

	/** 入庫処理データクラス */
	protected RcvCancelStruct _struct;

	/** 入庫処理 DBアクセスクラス */
	protected RcvCancelDBAccessor _dbAccessor;

	/** 入出庫管理番号 */
	protected String _ctrlCd;

	/** ユーザＩＤ */
	protected String _userId;

	/** エラーメッセージ格納リスト */
	protected ArrayList _errorList = new ArrayList();

	/**
	 * メッセージ取得 
	 * @return エラーリスト
	 */
	public ArrayList getErrorList()
	{
		return _errorList;
	}

	/**
	 * メッセージ設定
	 * @param メッセージリスト
	 */
	public void setErrorList(ArrayList list)
	{
		_errorList = list;
	}

	/** 情報メッセージ格納リスト */
	protected ArrayList _infoList = new ArrayList();

	/**
	 * メッセージ取得 
	 * @return infoリスト
	 */
	public ArrayList getInfoList()
	{
		return _infoList;
	}

	/**
	 * メッセージ設定
	 * @param メッセージリスト
	 */
	public void setInfoList(ArrayList list)
	{
		_infoList = list;
	}

	/** 警告メッセージ格納リスト */
	protected ArrayList _warnList = new ArrayList();

	/**
	 * メッセージ取得 
	 * @return warnリスト
	 */
	public ArrayList getWarnList()
	{
		return _warnList;
	}

	/**
	 * メッセージ設定
	 * @param メッセージリスト
	 */
	public void setWarnList(ArrayList list)
	{
		_warnList = list;
	}

	/** 日付フォーマット */
	private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");

	/**
	 * String型 ⇒ Date型。
	 * @return Date 
	 */
	public Date convertDate(String date)
	{
		try{
			return _dateFormat.parse(date);

		}catch(ParseException ex){}

		return null;
	}
}