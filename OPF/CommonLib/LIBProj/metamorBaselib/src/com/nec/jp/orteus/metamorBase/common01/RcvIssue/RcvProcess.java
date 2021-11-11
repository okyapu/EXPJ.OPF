//------------------------------------------------------------------------------
// (#)RcvProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/21 新規作成 M.Hotokebuchi
// 2003/08/22 M.Hotokebuchi
//            製番在庫へのinsertSQLが不正だったため、修正
// 2003/08/26 M.Hotokebuchi
//            ・info,warningレベルの出力用リストを追加
//            ・数量をInteger → Double (int → double) に変換
// 2003/08/27 M.Hotokebuchi
//           ・SYSTEM時刻を取得する処理を追加
// 2003/08/28 M.Hotokebuchi
//           ・execProcess()でSQLExceptionをthrowするよう修正
// 2003/09/01 M.Hotokebuchi
//           ・Double→String 対応
// 2003/09/18 M.Hotokebuchi
//           ・入出庫数が0の場合、在庫テーブルにアクセスしないよう修正
//           ・String計算処理クラスのインスタンスを追加
// 2003/10/20 M.Hotokebuchi
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
 * <B>RcvProcess</B><BR>
 * 入庫処理メイン処理<BR>
 * <BR>
 * @author  M.Hotokebuchi
 * @version 1.01
 */
public class RcvProcess
{

	/**
	 * デフォルトコンストラクタ
	 */
	private RcvProcess(){}
	
	/**
	 * 指定のコネクションを持つオブジェクトを構築する
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 * @param  rcvIssueCtrlCd 出庫処理を行う入出庫管理番号
	 */
	public RcvProcess(IDbConnection connect, String rcvIssueCtrlCd)
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
		RcvStruct _struct = createStruct();
		// 取得失敗
		if(_struct == null)
		{
			return false;
		}
		RcvDBAccessor _dbAccessor = new RcvDBAccessor(_conn);

		// 入出庫管理番号の妥当性チェック
		// 入出庫区分が入庫or不良品入庫であること
		if(_struct.getRCV_ISSUE_TYP().intValue() != _struct.ISSUE_RCV_TYP_RCV
			&& _struct.getRCV_ISSUE_TYP().intValue() != _struct.ISSUE_RCV_TYP_DEF_RCV)
		{
			_errorList.add("AF00072");
			return false;
		}

		// 入出庫発生区分が 通常入庫・計画外入庫・移動入庫・振替入庫・入庫取消である
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_DEFAULT
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_OUTSIDE_OF_PLAN
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_MOVE
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_TRANSFER
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_CANCEL)
		{
			_errorList.add("AF00073");
			return false;
		}

		// 入出庫区分が不良品入庫の場合、入出庫発生区分が計画外入庫で、且つ製番がNULLである
		if(_struct.getRCV_ISSUE_TYP().intValue() == _struct.ISSUE_RCV_TYP_DEF_RCV
			&& (_struct.getRCV_ISSUE_GNR_TYP().intValue() != _struct.GNR_TYP_OUTSIDE_OF_PLAN
				|| _struct.getJOB_ODR_CD() != null))
		{
			_errorList.add("AF00074");
			return false;
		}

		// 入出庫発生区分が振替入庫で、製番がNULLである
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == _struct.GNR_TYP_TRANSFER
			&& _struct.getJOB_ODR_CD() != null)
		{
			_errorList.add("AF00075");
			return false;
		}

		// 入出庫数が0の場合、保管区別入出庫を更新して終了
		if(_calc.compare(_struct.getRCV_ISSUE_QTY(), "0") == 0)
		{
			// 保管区別入出庫テーブルの更新
			_dbAccessor.updateRcvIssue(_struct);

			return true;
		}

		// 不良品入庫の場合
		if(_struct.getRCV_ISSUE_TYP().intValue() == _struct.ISSUE_RCV_TYP_DEF_RCV)
		{
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

		if(_struct.getJOB_ODR_CD() == null)
		{
			// 製番=='NULL'のとき 保管区別品目在庫テーブルの更新
			if(_itemFlg){
				// 保管区別品目在庫テーブルの更新
				_dbAccessor.updateItemStock(_struct);
			}else{
				// 保管区別品目在庫テーブルの追加
				_dbAccessor.insertItemStock(_struct);
			}
		}else{
			// 製番!='NULL'のとき 保管区別製番在庫テーブルの更新
			if(_jobFlg){
				// 保管区別製番在庫テーブルの更新
				_dbAccessor.updateJobOdrCdStock(_struct);
			}else{
				// 保管区別製番在庫テーブルの追加
				_dbAccessor.insertJobOdrCdStock(_struct);
			}
		}

		// 保管区別入出庫テーブルの更新
		_dbAccessor.updateRcvIssue(_struct);

		return true;
	}

	/**
	 * 入庫処理用のStructを構築する
	 *
	 * @return RcvStruct 入庫処理用Struct
	 * @throws SQLException
	 *         SQLの発行に失敗した場合
	 */
	private RcvStruct createStruct() throws SQLException
	{
		RcvStruct _struct = new RcvStruct();
		RcvDBAccessor _dbAccessor = new RcvDBAccessor(_conn);

		// 保管区別入出庫テーブルの読込み
		_struct = _dbAccessor.selectRcvIssue(_ctrlCd);

		if(_struct == null)
		{
			_errorList.add("AF00068");
			return null;
		}

		// SYSTEM時刻の取得
		RcvStruct sysDateStruct = _dbAccessor.selectSYSDATE(_struct);
		_struct.setSYSDATE(sysDateStruct.getSYSDATE());

		// 入出庫数が 0(Zero)以外の場合、在庫取得する
		if(_calc.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// 製番品かどうかチェック
			if(_struct.getJOB_ODR_CD() == null)
			{
				// 保管区別品目在庫の出庫可能数,品目別不良数 取得
				RcvStruct itemStruct = new RcvStruct();
				itemStruct = _dbAccessor.selectItemStock(_struct);

				if(itemStruct != null)
				{
					_struct.setITEM_STOCK_ON_HAND_QTY(itemStruct.getITEM_STOCK_ON_HAND_QTY());
					_struct.setDEFECT_QTY(itemStruct.getDEFECT_QTY());
					_itemFlg = true;
				}
			}else{
				// 保管区別製番在庫の出庫可能数 取得
				RcvStruct jobStruct = new RcvStruct();
				jobStruct = _dbAccessor.selectJobOdrCdStock(_struct);

				if(jobStruct != null)
				{
					_struct.setJOB_STOCK_ON_HAND_QTY(jobStruct.getJOB_STOCK_ON_HAND_QTY());
					_jobFlg = true;
				}
			}
		}

	return _struct;
	}

	/** String計算処理クラス */
	protected Calculate _calc;

	/** 入庫処理コネクションクラス */
	protected IDbConnection _conn;

	/** 入庫処理データクラス */
	protected RcvStruct _struct;

	/** 入庫処理 DBアクセスクラス */
	protected RcvDBAccessor _dbAccessor;

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