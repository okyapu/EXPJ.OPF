//------------------------------------------------------------------------------
// (#)IssueProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/21 新規作成 M.Hotokebuchi
// 2003/08/26 M.Hotokebuchi
//           ・info,warningレベルの出力用リストを追加
//           ・在庫更新時に、計画外・振替以外の場合でマイナス在庫となる値
//             だとinfoメッセージを出すよう修正
//           ・数量をInteger → Double (int → double) に変換
// 2003/08/27 M.Hotokebuchi
//           ・SYSTEM時刻を取得する処理を追加
// 2003/08/28 M.Hotokebuchi
//           ・execProcess()でSQLExceptionをthrowするよう修正
// 2003/08/31 M.Hotokebuchi
//           ・在庫レコードがない場合、insertする処理を追加
// 2003/09/01 M.Hotokebuchi
//           ・計算処理Calculate() 対応
//           ・Double→String 対応
// 2003/09/17 M.Hotokebuchi
//           ・出庫取消時のマイナス在庫更新のメッセージを追加
// 2003/09/18 M.Hotokebuchi
//           ・[出庫指示]、[所要量] 更新前に行ロックするよう修正
//           ・[製番引当].引当在庫区分 の設定を削除
//           ・入出庫数が0の場合、在庫テーブルにアクセスしないよう修正
//           ・SQLException が発生した場合にinfoメッセージを排出しないよう修正
// 2003/10/20 M.Hotokebuchi
//           ・入出庫完了フラグがoffの場合、入出庫完了日に null を設定するよう修正
//           ・業務運用日を計上日に変更し、入出庫年月日が計上日より未来だと
//             何もせずに正常終了するよう修正
// 2003/12/05 M.Hotokebuchi
//           ・計上日判定処理の削除に伴い、SimpleDateFormat,Dateのimportを削除
//           ・計上日判定処理の削除に伴い、入出庫日と計上日の判定処理を削除
//           ・計上日判定処理の削除に伴い、日付のConvertメソッドを削除
//
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.RcvIssue;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.util.CoreTools;

import java.text.ParseException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;

/**
 * <B>IssueProcess</B><BR>
 * 出庫処理メイン処理<BR>
 * <BR>
 * @author  M.Hotokebuchi
 * @version 1.00
 */
public class IssueProcess
{

	/**
	 * デフォルトコンストラクタ
	 */
	private IssueProcess(){}
	
	/**
	 * 指定のコネクションを持つオブジェクトを構築する
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 * @param  rcvIssueCtrlCd 出庫処理を行う入出庫管理番号
	 */
	public IssueProcess(IDbConnection connect, String rcvIssueCtrlCd)
	{
		_conn = connect;
		_ctrlCd = rcvIssueCtrlCd;
	}

	/**
	 * 出庫処理のmainメソッド
	 *
	 * @return boolean 処理成功ならtrue、処理失敗ならfalseを返す
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	public boolean execProcess() throws SQLException
	{
		IssueStruct _struct = createStruct();
		// 取得失敗
		if(_struct == null)
		{
			return false;
		}
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);

		// 入出庫管理番号の妥当性チェック
		// 入出庫区分が出庫or不良品出庫であること
		if(_struct.getRCV_ISSUE_TYP().intValue() != _struct.ISSUE_RCV_TYP_ISSUE
			&& _struct.getRCV_ISSUE_TYP().intValue() != _struct.ISSUE_RCV_TYP_DEF_ISSUE)
		{
			_errorList.add("AF00063");
			return false;
		}

		// 入出庫発生区分が 通常出庫・計画外出庫・移動出庫・振替出庫・出庫取消である
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_DEFAULT
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_OUTSIDE_OF_PLAN
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_MOVE
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_TRANSFER
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_CANCEL)
		{
			_errorList.add("AF00064");
			return false;
		}

		// 入出庫区分が不良品出庫の場合、入出庫発生区分が計画外出庫で、且つ製番がNULLである
		if(_struct.getRCV_ISSUE_TYP().intValue() == _struct.ISSUE_RCV_TYP_DEF_ISSUE
			&& (_struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_OUTSIDE_OF_PLAN
				|| _struct.getJOB_ODR_CD() != null))
		{
			_errorList.add("AF00065");
			return false;
		}

		// 入出庫発生区分が振替出庫で、製番がNOT NULLである
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_TRANSFER
			&& _struct.getJOB_ODR_CD() == null)
		{
			_errorList.add("AF00066");
			return false;
		}

		// 不良品出庫の場合
		if(_struct.getRCV_ISSUE_TYP().intValue() == _struct.ISSUE_RCV_TYP_DEF_ISSUE)
		{
			// 不良出庫数のチェック
			if(_calc.compare(_calc.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getDEFECT_QTY()) == 1)
			{
				_errorList.add("AF00069");
				return false;
			}

			if(_itemFlg){
				// 保管区別品目在庫テーブルの更新
				_dbAccessor.updateItemStock(_struct);
			}else{
				// 保管区別品目在庫テーブルの追加
				_dbAccessor.insertItemStock(_struct);
			}

			// 保管区別入出庫テーブルの更新
			_dbAccessor.updateRcvIssue(_struct);

			return true;
		}


		// 入出庫数が 0(Zero)以外の場合、在庫取得する
		if(_calc.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// infoメッセージの一時退避用
			ArrayList tmpInfoList = new ArrayList();

			// 出庫可能数の判別
			if( _struct.getJOB_ODR_CD() == null )
			{
				if(_calc.compare(_calc.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getITEM_STOCK_ON_HAND_QTY()) == 1)
				{
					// 計画外出庫・余剰振替の場合
					if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_OUTSIDE_OF_PLAN
						|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_TRANSFER)
					{
						_errorList.add("AF00071");
						return false;
					}else if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_CANCEL) {
						tmpInfoList.add("AF60002");
					}else{
						tmpInfoList.add("AF60001");
					}
				}

				// 製番=='NULL'のとき 保管区別品目在庫テーブルの更新
				if(_itemFlg){
					// 保管区別品目在庫テーブルの更新
					_dbAccessor.updateItemStock(_struct);
				}else{
					// 保管区別品目在庫テーブルの追加
					_dbAccessor.insertItemStock(_struct);
				}
			}else if( _struct.getJOB_ODR_CD() != null )
			{
				if(_calc.compare(_calc.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getJOB_STOCK_ON_HAND_QTY()) == 1)
				{
					// 計画外出庫・余剰振替の場合
					if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_OUTSIDE_OF_PLAN
						|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_TRANSFER)
					{
						_errorList.add("AF00070");
						return false;
					}else if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_CANCEL) {
						tmpInfoList.add("AF60002");
					}else{
						tmpInfoList.add("AF60001");
					}
				}

				// 製番!='NULL'のとき 保管区別製番在庫テーブルの更新
				if(_jobFlg){
					// 保管区別製番在庫テーブルの更新
					_dbAccessor.updateJobOdrCdStock(_struct);
				}else{
					// 保管区別製番在庫テーブルの追加
					_dbAccessor.insertJobOdrCdStock(_struct);
				}
			}

			// 一時リストをinfoリストへ移行
			_infoList.addAll(tmpInfoList);
		}

		// 入出庫発生区分が通常出庫or出庫取消の場合
		if( _struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_DEFAULT
			|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_CANCEL)
		{
			// 入出庫完了フラグがoffの場合、入出庫完了日に null を設定
			if(_struct.getRCV_ISSUE_CMPLT_FLG().intValue() != _struct.ISSUE_CMPLT_FLG_COMPLETED){
				_struct.setRCV_ISSUE_DATE((String)null);
			}

			// 出庫指示テーブルの更新
			_dbAccessor.updateIssueInst(_struct);

			// 製番引当テーブルの更新
			_dbAccessor.updateJobOdrAlc(_struct);

			// 所要量テーブルの更新
			_dbAccessor.updateOd(_struct);
		}

		// 保管区別入出庫テーブルの更新
		_dbAccessor.updateRcvIssue(_struct);

		return true;
	}

	/**
	 * 出庫処理用のStructを構築する
	 *
	 * @return IssueStruct 出庫処理用Struct
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	private IssueStruct createStruct() throws SQLException
	{
		IssueStruct _struct = new IssueStruct();
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);

		// 保管区別入出庫テーブルの読込み
		_struct = _dbAccessor.selectRcvIssue(_ctrlCd);

		if(_struct == null)
		{
			_errorList.add("AF00068");
			return null;
		}

		// SYSTEM時刻の取得
		IssueStruct sysDateStruct = _dbAccessor.selectSYSDATE(_struct);
		_struct.setSYSDATE(sysDateStruct.getSYSDATE());

		// 入出庫数が 0(Zero)以外の場合、在庫取得する
		if(_calc.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// 製番品かどうかチェック
			if(_struct.getJOB_ODR_CD() == null)
			{
				// 保管区別品目在庫の出庫可能数,品目別不良数 取得
				IssueStruct itemStruct = new IssueStruct();
				itemStruct = _dbAccessor.selectItemStock(_struct);

				if(itemStruct != null)
				{
					_struct.setITEM_STOCK_ON_HAND_QTY(itemStruct.getITEM_STOCK_ON_HAND_QTY());
					_struct.setDEFECT_QTY(itemStruct.getDEFECT_QTY());
					_itemFlg = true;
				}
			}else{
				// 保管区別製番在庫の出庫可能数 取得
				IssueStruct jobStruct = new IssueStruct();
				jobStruct = _dbAccessor.selectJobOdrCdStock(_struct);

				if(jobStruct != null)
				{
					_struct.setJOB_STOCK_ON_HAND_QTY(jobStruct.getJOB_STOCK_ON_HAND_QTY());
					_jobFlg = true;
				}
			}
		}

		// [製番引当]出庫済数・引当済数 取得
		IssueStruct alcStruct = _dbAccessor.selectJobOdrAlc(_struct);

		if(alcStruct != null)
		{
			_struct.setALCD_QTY(alcStruct.getALCD_QTY());
			_struct.setISSUEED_QTY(alcStruct.getISSUEED_QTY());
		}

		// 行ロック用select文
		_dbAccessor.selectIssueInst(_struct);
		_dbAccessor.selectOd(_struct);

	return _struct;
	}

	/** String計算処理クラス */
	protected Calculate _calc;

	/** 出庫処理コネクションクラス */
	protected IDbConnection _conn;

	/** 出庫処理データクラス */
	protected IssueStruct _struct;

	/** 出庫処理 DBアクセスクラス */
	protected IssueDBAccessor _dbAccessor;

	/** 入出庫管理番号 */
	protected String _ctrlCd;

	/** 品目在庫存在フラグ */
	protected boolean _itemFlg = false;

	/** 製番在庫存在フラグ */
	protected boolean _jobFlg = false;

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

}