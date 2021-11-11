/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueProcess.java,v $
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
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;

/**
 * <B>IssueProcess</B><BR>
 * 出庫処理メイン処理<BR>
 * <BR>
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.8 $
 */
public class IssueProcess implements RcvIssueConst
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
	 *		   SQLの発行に失敗した場合
	 * @throws FoundationException 
	 */
	public boolean execProcess() throws SQLException, FoundationException
	{
		IssueStruct _struct = createStruct();
		// 取得失敗
		if(_struct == null)
		{
			return false;
		}
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);
		
		BizCommon bc = new BizCommon(_conn,_struct.getUPDATED_BY(),_struct.getUPDATED_PRG_NM(),_struct.getPLANT_CD());

		// 入出庫管理番号の妥当性チェック
		// 入出庫区分が出庫or不良品出庫であること
		if(_struct.getRCV_ISSUE_TYP().intValue() != IssueStruct.ISSUE_RCV_TYP_ISSUE
			&& _struct.getRCV_ISSUE_TYP().intValue() != IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE)
		{
			_errorList.add("AF00063");
			return false;
		}

		// 入出庫発生区分が 通常出庫・計画外出庫・移動出庫・振替出庫・出庫取消である
		if(_struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_DEFAULT
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_OUTSIDE_OF_PLAN
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_MOVE
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_TRANSFER
			&& _struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_CANCEL)
		{
			_errorList.add("AF00064");
			return false;
		}

		// 入出庫区分が不良品出庫の場合、入出庫発生区分が計画外出庫で、且つ製番がNULLである
		if(_struct.getRCV_ISSUE_TYP().intValue() == IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE
			&& (_struct.getRCV_ISSUE_GNR_TYP().intValue() != IssueStruct.GNR_TYP_OUTSIDE_OF_PLAN
				|| _struct.getJOB_ODR_CD() != null))
		{
			_errorList.add("AF00065");
			return false;
		}
		
		if (_struct.getLOT_CTRL_FLG().intValue() != IssueStruct.LOT_CTRL_LOT) {
			// 入出庫発生区分が振替出庫で、製番がNOT NULLである
			if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_TRANSFER
				&& _struct.getJOB_ODR_CD() == null)
			{
				_errorList.add("AF00066");
				return false;
			}
		}

		// 不良品出庫の場合
		if(_struct.getRCV_ISSUE_TYP().intValue() == IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE)
		{
			// 不良出庫数のチェック
			if(Calculate.compare(Calculate.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getDEFECT_QTY()) == 1)
			{
				_errorList.add("AF00069");
				return false;
			}

			ItemStock itemStock = new ItemStock(_conn);
			if(_itemFlg){
				// 保管区別品目在庫テーブルの更新
				itemStock.updateItemStock(_struct);
				
			}else{
				// 保管区別品目在庫テーブルの追加
				itemStock.insertItemStock(_struct);
			}
			
			if(_struct.getLOT_NO() != null) {
				// ロット別不良在庫数を取得
				BigDecimal stockQty = itemStock.getLotDefectQty(
						   _struct.getITEM_CD(),
						   _struct.getWH_CD(),
						   _struct.getLOT_NO(),
						   RcvIssueConst.SELECT_FOR_UPDATE);
				if(stockQty != null){
					_struct.setSAVE_STOCK_QTY(stockQty.toString());
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


		// 入出庫数が 0(Zero)以外の場合、在庫取得する
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// infoメッセージの一時退避用
			ArrayList tmpInfoList = new ArrayList();

			// 出庫可能数の判別
			if( _struct.getJOB_ODR_CD() == null )
			{
				if(Calculate.compare(Calculate.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getITEM_STOCK_ON_HAND_QTY()) == 1)
				{
					// 計画外出庫・余剰振替の場合
					if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_OUTSIDE_OF_PLAN
						|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_TRANSFER)
					{
						_errorList.add("AF00071");
						return false;
					}else if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_CANCEL) {
						tmpInfoList.add("AF60002");
					}else{
						tmpInfoList.add("AF60001");
					}
				}

				// 製番=='NULL'のとき 保管区別品目在庫テーブルの更新
				ItemStock itemStock = new ItemStock(_conn);
				if(_itemFlg){
					// 保管区別品目在庫テーブルの更新
					itemStock.updateItemStock(_struct);
				}else{
					// 保管区別品目在庫テーブルの追加
					itemStock.insertItemStock(_struct);
				}
				if(_struct.getLOT_NO() != null){
					// ロット別手持在庫数を取得
					BigDecimal stockQty = itemStock.getLotHandQty(
							   _struct.getITEM_CD(),
							   _struct.getWH_CD(),
							   _struct.getLOT_NO(),
							   RcvIssueConst.SELECT_FOR_UPDATE);
					if(stockQty!=null){
						_struct.setSAVE_STOCK_QTY(stockQty.toString());
					}
					/*ロット別品目在庫登録・更新部品呼び出し*/
					_resultList = bc.excUpdateLotStockFd(_ctrlCd,"");
					if(bc.getResultStatus().intValue() != 1){
						_errorList.add((String)_resultList.get(0));
						return false;
					}
				}
			}else if( _struct.getJOB_ODR_CD() != null )
			{
				if(Calculate.compare(Calculate.multiply(_struct.getRCV_ISSUE_QTY(), "-1"), _struct.getJOB_STOCK_ON_HAND_QTY()) == 1)
				{
					// 計画外出庫・余剰振替の場合
					if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_OUTSIDE_OF_PLAN
						|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_TRANSFER)
					{
						_errorList.add("AF00070");
						return false;
					}else if(_struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_CANCEL) {
						tmpInfoList.add("AF60002");
					}else{
						tmpInfoList.add("AF60001");
					}
				}

				// 製番!='NULL'のとき 保管区別製番在庫テーブルの更新
				JobOdrStock jobodrstock = new JobOdrStock(_conn);
				if(_jobFlg){
					// 保管区別製番在庫テーブルの更新
					jobodrstock.updateJobOdrCdStock(_struct);
				}else{
					// 保管区別製番在庫テーブルの追加
					jobodrstock.insertJobOdrCdStock(_struct);
				}
			}

			// 一時リストをinfoリストへ移行
			_infoList.addAll(tmpInfoList);
		}

		// 入出庫発生区分が通常出庫or出庫取消の場合
		if( _struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_DEFAULT
			|| _struct.getRCV_ISSUE_GNR_TYP().intValue() == IssueStruct.GNR_TYP_CANCEL)
		{
			// 入出庫完了フラグがoffの場合、入出庫完了日に null を設定
			if(_struct.getRCV_ISSUE_CMPLT_FLG().intValue() != IssueStruct.ISSUE_CMPLT_FLG_COMPLETED){
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

	// Add Start 20140220 liuj
	/**
	 * 良品出庫処理のmainメソッド
	 *
	 * @return boolean 処理成功ならtrue、処理失敗ならfalseを返す
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 * @throws FoundationException 
	 */
	public boolean execAcptProcess() throws SQLException, FoundationException
	{
		IssueStruct _struct = createAcptStruct();
		// 取得失敗
		if(_struct == null)
		{
			return false;
		}
		
		// 入出庫数が 0(Zero)以外の場合、在庫取得する
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// 出庫可能数の判別
			if( _struct.getJOB_ODR_CD() == null )
			{

				// 製番=='NULL'のとき 保管区別品目在庫テーブルの更新
				ItemStock itemStock = new ItemStock(_conn);
				if(_itemFlg){
					// 保管区別品目在庫テーブルの更新
					itemStock.updateAcptItemStock(_struct);
				}else{
					// 保管区別品目在庫テーブルの追加
					itemStock.insertAcptItemStock(_struct);
				}

				if(_struct.getLOT_NO() != null){
					// ロット別手持在庫数を取得
					BigDecimal stockQty = itemStock.getLotHandQty(
							   _struct.getITEM_CD(),
							   _struct.getWH_CD(),
							   _struct.getLOT_NO(),
							   RcvIssueConst.SELECT_FOR_UPDATE);
					if(stockQty!=null){
						_struct.setSAVE_STOCK_QTY(stockQty.toString());
					}
					/*ロット別品目在庫登録・更新部品呼び出し*/
					BizCommon bc = new BizCommon(_conn,_struct.getUPDATED_BY(),_struct.getUPDATED_PRG_NM(),_struct.getPLANT_CD());
					_resultList = bc.excUpdateLotStockFd(_ctrlCd,"");
					if(bc.getResultStatus().intValue() != 1){
						_errorList.add((String)_resultList.get(0));
						return false;
					}
				}
			}else if( _struct.getJOB_ODR_CD() != null ){

				// 製番!='NULL'のとき 保管区別製番在庫テーブルの更新
				JobOdrStock jobodrstock = new JobOdrStock(_conn);
				if(_jobFlg){
					// 保管区別製番在庫テーブルの更新
					jobodrstock.updateJobOdrCdStock(_struct);
				}else{
					// 保管区別製番在庫テーブルの追加
					jobodrstock.insertJobOdrCdStock(_struct);
				}
			}
		}
		
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);
      
		// 保管区別入出庫テーブルの更新
		_dbAccessor.updateRcvIssue(_struct);
		
		return true;
	}
	
	/**
	 * 不良品出庫処理のmainメソッド
	 *
	 * @return boolean 処理成功ならtrue、処理失敗ならfalseを返す
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 * @throws FoundationException 
	 */
	public boolean execDefectProcess() throws SQLException, FoundationException
	{
		IssueStruct _struct = createDefectStruct();
		// 取得失敗
		if(_struct == null)
		{
			return false;
		}
		
		// 入出庫数が 0(Zero)以外の場合、在庫取得する
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0)
		{
			// 出庫可能数の判別
			if( _struct.getJOB_ODR_CD() == null )
			{
				// 製番=='NULL'のとき 保管区別品目在庫テーブルの更新
				ItemStock itemStock = new ItemStock(_conn);
				if(_itemFlg){
					// 保管区別品目在庫テーブルの更新
					itemStock.updateDefectItemStock(_struct);
				}else{
					// 保管区別品目在庫テーブルの追加
					itemStock.insertDefectItemStock(_struct);
				}

			}
			if(_struct.getLOT_NO() != null) {
				// ロット別不良在庫数を取得
				ItemStock itemStock = new ItemStock(_conn);
				BigDecimal stockQty = itemStock.getLotDefectQty(
						   _struct.getITEM_CD(),
						   _struct.getWH_CD(),
						   _struct.getLOT_NO(),
						   RcvIssueConst.SELECT_FOR_UPDATE);
				if(stockQty != null){
					_struct.setSAVE_STOCK_QTY(stockQty.toString());
				}
				/*ロット別品目在庫登録・更新部品呼び出し*/
				BizCommon bc = new BizCommon(_conn,_struct.getUPDATED_BY(),_struct.getUPDATED_PRG_NM(),_struct.getPLANT_CD());
				_resultList = bc.excUpdateLotStockFd(_ctrlCd,"");
				if(bc.getResultStatus().intValue() != 1){
					_errorList.add((String)_resultList.get(0));
					return false;
				}
			}
		}
		
		IssueDBAccessor _dbAccessor = new IssueDBAccessor(_conn);
      
		// 保管区別入出庫テーブルの更新
		_dbAccessor.updateRcvIssue(_struct);
		
		return true;
	}
	/**
	 * 良品出庫処理用のStructを構築する
	 *
	 * @return IssueStruct 出庫処理用Struct
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 */
	private IssueStruct createAcptStruct() throws SQLException
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
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0 ||
				(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") == 0 && 
						_struct.getWH_CD() != null && !"".equals(_struct.getWH_CD()))) {
			// 製番品かどうかチェック
			if(_struct.getJOB_ODR_CD() == null)
			{
				// 保管区別品目在庫の出庫可能数,品目別不良数 取得
				ItemStock itemStock = new ItemStock(_conn);
				
				BigDecimal stockQty = null;

				stockQty = itemStock.getHandQty(
						   _struct.getITEM_CD(),
						   _struct.getWH_CD(),
						   RcvIssueConst.SELECT_FOR_UPDATE);

				if(stockQty!=null){
					_struct.setITEM_STOCK_ON_HAND_QTY(stockQty.toString());
					_struct.setSAVE_STOCK_QTY(stockQty.toString());
					_itemFlg = true;
				}
					
			}else{
				// 保管区別製番在庫の出庫可能数 取得
				JobOdrStock jobodrstock = new JobOdrStock(_conn);
				BigDecimal stockOnHandQty = jobodrstock.getHandQty(_struct.getJOB_ODR_CD(),
																   RcvIssueConst.JOB_ODR_DETAIL_ZERO,
																   _struct.getITEM_CD(),
																   _struct.getWH_CD(),
																   RcvIssueConst.SELECT_FOR_UPDATE);
				if(stockOnHandQty != null)
				{
					_struct.setJOB_STOCK_ON_HAND_QTY(stockOnHandQty.toString());
					_struct.setSAVE_STOCK_QTY(stockOnHandQty.toString());
					_jobFlg = true;
				}
			}
		}
		return _struct;
	}
	
	/**
	 * 不良品出庫処理用のStructを構築する
	 *
	 * @return IssueStruct 出庫処理用Struct
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
	 */
	private IssueStruct createDefectStruct() throws SQLException
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
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0 ||
				(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") == 0 && 
						_struct.getWH_CD() != null && !"".equals(_struct.getWH_CD()))) {
			// 製番品かどうかチェック
			if(_struct.getJOB_ODR_CD() == null)
			{
				// 保管区別品目在庫の品目別不良数 取得
				ItemStock itemStock = new ItemStock(_conn);
				
				BigDecimal stockQty = null;

				stockQty = itemStock.getDefectQty(
						   _struct.getITEM_CD(),
						   _struct.getWH_CD(),
						   RcvIssueConst.SELECT_FOR_UPDATE);
				
				if(stockQty!=null){
					_struct.setDEFECT_QTY(stockQty.toString());
					_struct.setSAVE_STOCK_QTY(stockQty.toString());
					_itemFlg = true;
				}	
			}
		}
		return _struct;
	}
	// Add End 20140220 liuj
	/**
	 * 出庫処理用のStructを構築する
	 *
	 * @return IssueStruct 出庫処理用Struct
	 * @throws SQLException
	 *		   SQLの発行に失敗した場合
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
		if(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") != 0 ||
				(Calculate.compare(_struct.getRCV_ISSUE_QTY(), "0") == 0 && 
						_struct.getWH_CD() != null && !"".equals(_struct.getWH_CD()))) {
			// 製番品かどうかチェック
			if(_struct.getJOB_ODR_CD() == null)
			{
				// 保管区別品目在庫の出庫可能数,品目別不良数 取得
				ItemStock itemStock = new ItemStock(_conn);
				
				BigDecimal stockQty = null;
				
				// 不良在庫更新か 良品在庫更新か
				if (_struct.getRCV_ISSUE_TYP().intValue() == IssueStruct.ISSUE_RCV_TYP_DEF_ISSUE) {
					stockQty = itemStock.getDefectQty(
							   _struct.getITEM_CD(),
							   _struct.getWH_CD(),
							   RcvIssueConst.SELECT_FOR_UPDATE);
					
					if(stockQty!=null){
						_struct.setDEFECT_QTY(stockQty.toString());
						_struct.setSAVE_STOCK_QTY(stockQty.toString());
						_itemFlg = true;
					}
					
				} else {
					stockQty = itemStock.getHandQty(
							   _struct.getITEM_CD(),
							   _struct.getWH_CD(),
							   RcvIssueConst.SELECT_FOR_UPDATE);

					if(stockQty!=null){
						_struct.setITEM_STOCK_ON_HAND_QTY(stockQty.toString());
						_struct.setSAVE_STOCK_QTY(stockQty.toString());
						_itemFlg = true;
					}
				}
					
			}else{
				// 保管区別製番在庫の出庫可能数 取得
				JobOdrStock jobodrstock = new JobOdrStock(_conn);
				BigDecimal stockOnHandQty = jobodrstock.getHandQty(_struct.getJOB_ODR_CD(),
																   RcvIssueConst.JOB_ODR_DETAIL_ZERO,
																   _struct.getITEM_CD(),
																   _struct.getWH_CD(),
																   RcvIssueConst.SELECT_FOR_UPDATE);
				if(stockOnHandQty != null)
				{
					_struct.setJOB_STOCK_ON_HAND_QTY(stockOnHandQty.toString());
					_struct.setSAVE_STOCK_QTY(stockOnHandQty.toString());
					_jobFlg = true;
				}
			}
		}

		// [製番引当]出庫済数・引当済数 取得
		IssueStruct alcStruct = _dbAccessor.selectJobOdrAlc(_struct);

		if(alcStruct != null)
		{
			_struct.setJOB_ODR_ALC_CD(alcStruct.getJOB_ODR_ALC_CD());
			_struct.setALCD_QTY(alcStruct.getALCD_QTY());
			_struct.setISSUEED_QTY(alcStruct.getISSUEED_QTY());
		}

		// 行ロック用select文
		_dbAccessor.selectIssueInst(_struct);
		_dbAccessor.selectOd(_struct);

	return _struct;
	}

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