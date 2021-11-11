/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvProcess.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.util.Calculate;
/**
 * <B>IssueProcess</B><BR>
 * 入庫処理メイン処理<BR>
 * <BR>
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $
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
	 * @throws FoundationException 
	 */
	public boolean execProcess() throws SQLException, FoundationException
	{
		RcvStruct _struct = createStruct();
		// 取得失敗
		if(_struct == null)
		{
			return false;
		}
		RcvDBAccessor _dbAccessor = new RcvDBAccessor(_conn);
		
		BizCommon bc = new BizCommon(_conn,_struct.getUPDATED_BY(),_struct.getUPDATED_PRG_NM(),_struct.getPLANT_CD());

		// 入出庫管理番号の妥当性チェック
		// 入出庫区分が入庫or不良品入庫であること
		if(_struct.getRCV_ISSUE_TYP().intValue() != RcvStruct.ISSUE_RCV_TYP_RCV
			&& _struct.getRCV_ISSUE_TYP().intValue() != RcvStruct.ISSUE_RCV_TYP_DEF_RCV)
		{
			_errorList.add("AF00072");
			return false;
		}

		// 入出庫発生区分が 通常入庫・計画外入庫・移動入庫・振替入庫・入庫取消、
		// 工程在庫入庫、工程在庫入庫取消、取引先在庫入庫、取引先在庫入庫t取消である
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_DEFAULT
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_OUTSIDE_OF_PLAN
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_MOVE
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_TRANSFER
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_CANCEL
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_PROC_STOCK
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_PROC_STOCK_CANCEL
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_VEND_STOCK
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_VEND_STOCK_CANCEL)
		{
			_errorList.add("AF00073");
			return false;
		}

		// 入出庫区分が不良品入庫の場合、入出庫発生区分が計画外入庫で、且つ製番がNULLである
		if(_struct.getRCV_ISSUE_TYP().intValue() == RcvStruct.ISSUE_RCV_TYP_DEF_RCV
			&& (_struct.getRCV_ISSUE_GNR_TYP().intValue() != RcvStruct.GNR_TYP_OUTSIDE_OF_PLAN
				|| _struct.getJOB_ODR_CD() != null))
		{
			_errorList.add("AF00074");
			return false;
		}

		// 入出庫発生区分が振替入庫で、製番がNULLである
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == RcvStruct.GNR_TYP_TRANSFER
			&& _struct.getJOB_ODR_CD() != null)
		{
			_errorList.add("AF00075");
			return false;
		}

		// 入出庫数が0の場合、保管区別入出庫を更新して終了
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") == 0)
		{
			// 保管区別入出庫テーブルの更新
			_dbAccessor.updateRcvIssue(_struct);

			return true;
		}

		// 不良品入庫の場合
		if(_struct.getRCV_ISSUE_TYP().intValue() == RcvStruct.ISSUE_RCV_TYP_DEF_RCV)
		{
			if(_itemFlg){
				// 保管区別品目在庫テーブルの更新
				_dbAccessor.updateItemStock(_struct);
			}else{
				// 保管区別品目在庫テーブルの追加
				_dbAccessor.insertItemStock(_struct);
			}
			
			if(_struct.getLOT_NO() != null){
				RcvStruct lotStruct = _dbAccessor.selectLotStock(_struct);
				if(lotStruct != null){
					_struct.setSAVE_STOCK_QTY(lotStruct.getDEFECT_QTY());
				}
				/*ロット別品目在庫登録・更新部品呼び出し*/
				_resultList = bc.excUpdateLotStockFd(_ctrlCd,"");
				if(bc.getResultStatus().intValue() != 1){
					_errorList.add((String)_resultList.get(0));
					return false;
				}
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
			
			if(_struct.getLOT_NO() != null){
				RcvStruct lotStruct = _dbAccessor.selectLotStock(_struct);
				if(lotStruct != null){
					_struct.setSAVE_STOCK_QTY(lotStruct.getITEM_STOCK_ON_HAND_QTY());
				}
				/*ロット別品目在庫登録・更新部品呼び出し*/
				_resultList = bc.excUpdateLotStockFd(_ctrlCd,"");
				if(bc.getResultStatus().intValue() != 1){
					_errorList.add((String)_resultList.get(0));
					return false;
				}
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
		//20091102 入出庫数が 0の時、ここで取得しないと[保管区別入出庫]."入出庫前在庫数","入出庫後在庫数"が0になってしまうため、取得する。
		/*
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
		*/
			// 製番品かどうかチェック
			if(_struct.getJOB_ODR_CD() == null)
			{
				// 保管区別品目在庫の出庫可能数,品目別不良数 取得
				RcvStruct itemStruct = new RcvStruct();
				itemStruct = _dbAccessor.selectItemStock(_struct);

				// 不良在庫更新か 良品在庫更新か
				if( _struct.getRCV_ISSUE_TYP().intValue() == RcvStruct.ISSUE_RCV_TYP_DEF_RCV ){

					if(itemStruct != null){
						_struct.setDEFECT_QTY(itemStruct.getDEFECT_QTY());
						_struct.setSAVE_STOCK_QTY(itemStruct.getDEFECT_QTY());
						_itemFlg = true;
					}

				} else {

					if(itemStruct != null){
						_struct.setITEM_STOCK_ON_HAND_QTY(itemStruct.getITEM_STOCK_ON_HAND_QTY());
						_struct.setSAVE_STOCK_QTY(itemStruct.getITEM_STOCK_ON_HAND_QTY());
						_itemFlg = true;
					}

				}

			}else{
				// 保管区別製番在庫の出庫可能数 取得
				RcvStruct jobStruct = new RcvStruct();
				jobStruct = _dbAccessor.selectJobOdrCdStock(_struct);

				if(jobStruct != null)
				{
					_struct.setJOB_STOCK_ON_HAND_QTY(jobStruct.getJOB_STOCK_ON_HAND_QTY());
					_struct.setSAVE_STOCK_QTY(jobStruct.getJOB_STOCK_ON_HAND_QTY());
					_jobFlg = true;
				}
			}
		//}

	return _struct;
	}

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
	
	/** 部品呼出しの返却値格納リスト */
	protected List _resultList;

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