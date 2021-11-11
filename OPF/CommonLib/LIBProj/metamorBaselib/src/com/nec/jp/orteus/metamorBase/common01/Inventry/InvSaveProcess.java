//------------------------------------------------------------------------------
// (#)InvSaveProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import java.util.ArrayList;
import java.util.List;

/**
 * 棚卸在庫退避処理クラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvSaveProcess
{
//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvSaveProcess(){ clear(); }

	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 * @param	strUserCd		ユーザコード
	 * @param	strProgramName	プログラム名（例 AH0070B001）
	 */
	public InvSaveProcess(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
		_invSaveAccessor = 
			new InvSaveAccessor(_strPlantCd, _strUserCd, _strProgramName);
		_invGetAccessor = 
			new InvGetAccessor(_strPlantCd, _strUserCd, _strProgramName);
		_invUpdateAccessor = 
			new InvUpdateAccessor(_strPlantCd, _strUserCd, _strProgramName);
	}

//--------------------------------------------------------------------------
// 変数

	/** 工場コード格納用 */
	private String _strPlantCd = null;

	/** ユーザコード格納用 */
	private String _strUserCd = null;

	/** プログラム名格納用 */
	private String _strProgramName = null;

	/** メッセージ管理クラス */
	private InvMessageControl _msg = null;

	/** 棚卸退避アクセッサクラス */
	private InvSaveAccessor _invSaveAccessor = null;

	/** 棚卸取得アクセッサクラス */
	private InvGetAccessor _invGetAccessor = null;

	/** 棚卸更新アクセッサクラス */
	private InvUpdateAccessor _invUpdateAccessor = null;

//--------------------------------------------------------------------------
// 共通メソッド

	////////////////////////////////////////////////////////////////////////////
	/**
	 * クリア
	 *
	 * @return	なし
	 */
	public void clear()
	{
		_strPlantCd = null;
		_strUserCd = null;
		_strProgramName = null;
		_msg = null;
		_invSaveAccessor = null;
		_invGetAccessor = null;
		_invUpdateAccessor = null;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * メッセージ管理クラス設定
	 *
	 * @param	メッセージ管理クラス
	 */
	public void setMessage(InvMessageControl msg)
	{
		_msg = msg;
	}

	/**
	 * メッセージ管理クラス取得
	 *
	 * @return	メッセージ管理クラス
	 */
	public InvMessageControl getMessage()
	{
		return _msg;
	}

//--------------------------------------------------------------------------
// 操作

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別品目在庫退避処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean saveItemStock(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// 対象情報格納用
		int intDeleteCount = 0;	// 削除レコード数
		int intInsertCount = 0;	// 追加レコード数
		int intTargetCount = 0;	// 処理対象レコード数
		int intResult;			// 処理結果
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1117)■■■■■■■■■■保管区別品目在庫退避処理-開始");

		//-------------------------------------------------------------------
		// ① 保管区別品目棚卸削除（同一棚卸日の前回処理データ：再実行対応）
		//-------------------------------------------------------------------
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1118)① 保管区別品目棚卸削除（同一棚卸日の前回処理データ：再実行対応）\n"
			+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
			+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
		);
		intDeleteCount = _invSaveAccessor.deleteItemInvTable(conn, info);
		if(intDeleteCount == -1)
		{
			// エラー
			_msg.addCopy(_invSaveAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}

		//-----------------------------------------------
		// ② 保管区別品目在庫読込（棚卸対象データのみ）
		//-----------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", "(SBM1119)② 保管区別製番在庫の読込（棚卸対象データのみ）");
		// 最新棚卸情報取得
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1120)最新棚卸情報取得\n"
			+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
			+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
		);
		info = _invGetAccessor.readInvCtrl(conn, info);
		if(info == null)
		{
			// エラー
			_msg.addCopy(_invSaveAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}
		// 在庫情報一覧読込
		List listItemStock = null;						// 品目在庫一覧
		int intKindData = InvGetAccessor.DATA_NORMAL;	// 棚卸在庫情報
		int intKindStock = InvGetAccessor.STOCK_ITEM;	// 品目在庫
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		info.setWH_CD("%");
		info.setLOT_NO("%");
		info.setITEM_CD("%");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1121)在庫情報一覧読込\n"
			+ " 取得情報種類:[ 棚卸在庫情報:" + String.valueOf(intKindData) + " ]"
			+ " 在庫種類:[ 品目在庫:" + String.valueOf(intKindStock) + " ]"
			+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
			+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			+ " 保管区コード:[ " + info.getWH_CD() + " ]"
		);
		_invGetAccessor.setMessage(_msg);
		listItemStock =_invGetAccessor.getStockList(conn, info, intKindData, intKindStock);
		_msg = _invGetAccessor.getMessage();
		if(listItemStock == null)
		{
			// エラー
			_msg.addCopy(_invGetAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}

		// 対象データ件数チェック
		intTargetCount = listItemStock.size();
		if(intTargetCount <= 0)
		{
			// 棚卸条件に該当するデータが保管区別品目在庫に存在しませんでした
			_msg.add(InvMessageControl.TYP_INFO, "AH60003", "");
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1122)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 取得情報種類:[ 棚卸在庫情報 ]"
				+ " 在庫種類:[ 品目在庫 ]"
			);
		}
		
		// 削除重復行
		List itemInvList = new ArrayList();
		if(intTargetCount > 0){			
			itemInvList.add((InvInformation)listItemStock.get(0));
			InvInformation itemInvInfo;
			boolean flg = false;
			for(int i = 1; i < intTargetCount; i++){
				info = (InvInformation)listItemStock.get(i);
				flg = false;
				for (int j = 0; j < itemInvList.size(); j++) {
					itemInvInfo = (InvInformation)itemInvList.get(j);
					if(info.getWH_CD().equals(itemInvInfo.getWH_CD())&& 
							info.getITEM_CD().equals(itemInvInfo.getITEM_CD())){ 
						itemInvInfo.setSTOCK_ON_HAND_QTY(
								Calculate.add(info.getSTOCK_ON_HAND_QTY(),itemInvInfo.getSTOCK_ON_HAND_QTY()));
						flg = true;
					} 
				}
				if (!flg){
					itemInvList.add(info);
				}
			}
		}

		for(int i = 0; i < itemInvList.size(); i++)
		{
			// 読込情報取得
			info = (InvInformation)itemInvList.get(i);
			info.setINV_DATE(strInvDate);
			info.setPLANT_CD(_strPlantCd);
			info.setACTUAL_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());
			info.setFINAL_BOOK_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());

			//---------------------------
			// ③ 保管区別品目棚卸の追加
			//---------------------------
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				+ "(SBM1123)③ 保管区別製番棚卸の追加(" + (i+1) + "件目)\n"
				+ " s)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " s)品目番号:[ " + info.getITEM_CD() + " ]"
				+ " s)保管区コード:[ " + info.getWH_CD() + " ]"
				+ " s)工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " s)実棚数:[ " + info.getACTUAL_STOCK_QTY() + " ]"
				+ " s)最終帳簿在庫数:[ " + info.getFINAL_BOOK_STOCK_QTY() + " ]"
				+ " s)不良数:[ " + info.getDEFECT_QTY() + " ]"
			);
			intResult = _invSaveAccessor.insertItemInvTable(conn, info);
			if(intResult == -1)
			{
				// エラー
				_msg.addCopy(_invSaveAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}

			// 登録レコード数カウント
			intInsertCount++;
		}

		// 処理成功
		_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
			// 詳細情報
			+ "(SBM1124)●●●●●●●●●●" 
			+ "\n 保管区別品目在庫退避処理成功！" 
			+ "\n 保管区別品目棚卸削除レコード件数:[ " + intDeleteCount + " ]"
			+ "\n 保管区別品目棚卸追加レコード件数:[ " + intInsertCount + " ]"
		);

		return true;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別製番在庫退避処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean saveJobOdrCdStock(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// 対象情報格納用
		int intDeleteCount = 0;	// 削除レコード数
		int intInsertCount = 0;	// 追加レコード数
		int intTargetCount = 0;	// 処理対象レコード数
		int intResult;			// 処理結果
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1125)■■■■■■■■■■保管区別製番在庫退避処理-開始");

		//---------------------------------------------------------------------
		// ① 保管区別製番棚卸の削除（同一棚卸日の前回処理データ：再実行対応）
		//---------------------------------------------------------------------
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1126)① 保管区別製番棚卸の削除（同一棚卸日の前回処理データ：再実行対応）\n"
			+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
			+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
		);
		intDeleteCount = _invSaveAccessor.deleteJobOdrCdInvTable(conn, info);
		if(intDeleteCount == -1)
		{
			// エラー
			_msg.addCopy(_invSaveAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}

		//-------------------------------------------------
		// ② 保管区別製番在庫の読込（棚卸対象データのみ）
		//-------------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", "(SBM1127)② 保管区別製番在庫の読込（棚卸対象データのみ）");
				// 最新棚卸情報取得
				info.setINV_DATE(strInvDate);
				info.setPLANT_CD(_strPlantCd);
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1120)最新棚卸情報取得\n"
			+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
			+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
		);
		info = _invGetAccessor.readInvCtrl(conn, info);
		if(info == null)
		{
			// エラー
			_msg.addCopy(_invSaveAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}
		// 在庫情報一覧読込
		List listJobOdrCdStock = null;					// 製番在庫一覧
		int intKindData = InvGetAccessor.DATA_NORMAL;	// 棚卸在庫情報
		int intKindStock = InvGetAccessor.STOCK_JOB_ODR;// 製番在庫
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		info.setWH_CD("%");
		info.setITEM_CD("%");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
			+ "(SBM1121)在庫情報一覧読込\n"
			+ " 取得情報種類:[ 棚卸在庫情報:" + String.valueOf(intKindData) + " ]"
			+ " 在庫種類:[ 品目在庫:]" + String.valueOf(intKindStock) + " ]"
			+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
			+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			+ " 保管区コード:[ " + info.getWH_CD() + " ]"
		);
		_invGetAccessor.setMessage(_msg);
		listJobOdrCdStock =_invGetAccessor.getStockList(conn, info, intKindData, intKindStock);
		_msg = _invGetAccessor.getMessage();
		if(listJobOdrCdStock == null)
		{
			// エラー
			_msg.addCopy(_invGetAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}

		// 対象データ件数チェック
		intTargetCount = listJobOdrCdStock.size();
		if(intTargetCount <= 0)
		{
			// 棚卸条件に該当するデータが保管区別製番在庫に存在しませんでした
			_msg.add(InvMessageControl.TYP_INFO, "AH60004", "");
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				// 詳細情報
				+ " (SBM1128)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
				+ " 取得情報種類:[ 棚卸在庫情報 ]"
				+ " 在庫種類:[ 製番在庫 ]"
			);
		}

		for(int i = 0; i < intTargetCount; i++)
		{
			// 読込情報取得
			info = (InvInformation)listJobOdrCdStock.get(i);
			info.setINV_DATE(strInvDate);
			info.setPLANT_CD(_strPlantCd);
			info.setACTUAL_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());
			info.setFINAL_BOOK_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());

			//---------------------------
			// ③ 保管区別製番棚卸の追加
			//---------------------------
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				+ "(SBM1129)③ 保管区別製番棚卸の追加(" + (i+1) + "件目)\n"
				+ " s)棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " s)製番:[ " + info.getJOB_ODR_CD() + " ]"
				+ " s)品目番号:[ " + info.getITEM_CD() + " ]"
				+ " s)保管区コード:[ " + info.getWH_CD() + " ]"
				+ " s)工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " s)実棚数:[ " + info.getACTUAL_STOCK_QTY() + " ]"
				+ " s)最終帳簿在庫数:[ " + info.getFINAL_BOOK_STOCK_QTY() + " ]"
			);
			intResult = _invSaveAccessor.insertJobOdrCdInvTable(conn, info);
			if(intResult == -1)
			{
				// エラー
				_msg.addCopy(_invSaveAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}

			// 登録レコード数カウント
			intInsertCount++;
		}

		// 処理成功
		_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
			// 詳細情報
			+ "\n(SBM1130)●●●●●●●●●●" 
			+ "\n 保管区別製番在庫退避処理成功！" 
			+ "\n 保管区別製番棚卸削除レコード件数:[ " + intDeleteCount + " ]"
			+ "\n 保管区別製番棚卸追加レコード件数:[ " + intInsertCount + " ]"
		);

		return true;
	}
	
	////////////////////////////////////////////////////////////////////////////
	/**
	 * ロット別品目在庫退避処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean saveLotStock(
			IDbConnection conn, 
			String strInvDate)
		{
			InvInformation info = new InvInformation();	// 対象情報格納用
			int intDeleteCount = 0;	// 削除レコード数
			int intInsertCount = 0;	// 追加レコード数
			int intTargetCount = 0;	// 処理対象レコード数
			int intResult;			// 処理結果
			_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1131)■■■■■■■■■■ロット別品目在庫退避処理-開始");

			//-------------------------------------------------------------------
			// ①ロット番号別棚卸削除（同一棚卸日の前回処理データ：再実行対応）
			//-------------------------------------------------------------------
			info.setINV_DATE(strInvDate);
			info.setPLANT_CD(_strPlantCd);
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				+ "(SBM1132)① ロット別品目棚卸削除（同一棚卸日の前回処理データ：再実行対応）\n"
				+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
	        intDeleteCount = _invSaveAccessor.deleteLotInvTable(conn, info);
			if(intDeleteCount == -1)
			{
				// エラー
				_msg.addCopy(_invSaveAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}

			//-----------------------------------------------
			// ② ロット番号別品目在庫読込（棚卸対象データのみ）
			//-----------------------------------------------
			_msg.add(InvMessageControl.TYP_CONFIG, "", "(SBM1133)② ロット別品目在庫の読込（棚卸対象データのみ）");
					// 最新棚卸情報取得
					info.setINV_DATE(strInvDate);
					info.setPLANT_CD(_strPlantCd);
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				+ "(SBM1120)最新棚卸情報取得\n"
				+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
			);
	        info = _invGetAccessor.readInvCtrl(conn, info);
			if(info == null)
			{
				// エラー
				_msg.addCopy(_invSaveAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}
			// 在庫情報一覧読込
			List listItemStock = null;					// 品目在庫一覧
			int intKindData = InvGetAccessor.DATA_LOT;	// ロット在庫情報
			int intKindStock = InvGetAccessor.STOCK_LOT;// ロット在庫
			info.setINV_DATE(strInvDate);
			info.setPLANT_CD(_strPlantCd);
			info.setWH_CD("%");
			info.setITEM_CD("%");
			info.setLOT_NO("%");
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
				+ "(SBM1134)在庫情報一覧読込\n"
				+ " 取得情報種類:[ ロット在庫情報:" + String.valueOf(intKindData) + " ]"
				+ " 在庫種類:[ ロット在庫:" + String.valueOf(intKindStock) + " ]"
				+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保管区コード:[ " + info.getWH_CD() + " ]"
			);
			_invGetAccessor.setMessage(_msg);
			listItemStock =_invGetAccessor.getStockList(conn, info, intKindData, intKindStock);
			_msg = _invGetAccessor.getMessage();
			if(listItemStock == null)
			{
				// エラー
				_msg.addCopy(_invGetAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}

			// 対象データ件数チェック
			intTargetCount = listItemStock.size();
			if(intTargetCount <= 0)
			{
				// 棚卸条件に該当するデータが保管区別品目在庫に存在しませんでした
				_msg.add(InvMessageControl.TYP_INFO, "AH60009", "");
				_msg.add(InvMessageControl.TYP_CONFIG, "", ""
					// 詳細情報
					+ " (SBM1135)棚卸日:[ " + info.getINV_DATE() + " ]"
					+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
					+ " 保管区コード:[ " + info.getWH_CD() + " ]"
					+ " 取得情報種類:[ 棚卸在庫情報 ]"
					+ " 在庫種類:[ ロット在庫 ]"
				);
			}

			for(int i = 0; i < intTargetCount; i++)
			{
				// 読込情報取得
				info = (InvInformation)listItemStock.get(i);
				info.setINV_DATE(strInvDate);
				info.setPLANT_CD(_strPlantCd);
				info.setACTUAL_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());
				info.setFINAL_BOOK_STOCK_QTY(info.getSTOCK_ON_HAND_QTY());
				info.setLOT_NO(info.getLOT_NO());

				//---------------------------
				// ③ ロット番号別棚卸の追加
				//---------------------------
				_msg.add(InvMessageControl.TYP_CONFIG, "", ""
					+ "(SBM1136)③ ロット番号別棚卸の追加(" + (i+1) + "件目)\n"
					+ " s)棚卸日:[ " + info.getINV_DATE() + " ]"
					+ " s)品目番号:[ " + info.getITEM_CD() + " ]"
					+ " s)保管区コード:[ " + info.getWH_CD() + " ]"
					+ " s)工場コード:[ " + info.getPLANT_CD() + " ]"
					+ " s)実棚数:[ " + info.getACTUAL_STOCK_QTY() + " ]"
					+ " s)最終帳簿在庫数:[ " + info.getFINAL_BOOK_STOCK_QTY() + " ]"
					+ " s)不良数:[ " + info.getDEFECT_QTY() + " ]"
				);
				intResult = _invSaveAccessor.insertLotInvTable(conn, info);
				if(intResult == -1)
				{
					// エラー
					_msg.addCopy(_invSaveAccessor.getMessage());	// 処理結果メッセージ取得追加
					return false;
				}

				// 登録レコード数カウント
				intInsertCount++;
			}

			// 処理成功
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// 詳細情報
				+ "(SBM1137)●●●●●●●●●●" 
				+ "\n ロット番号別品目在庫退避処理成功！" 
				+ "\n ロット番号別品目棚卸削除レコード件数:[ " + intDeleteCount + " ]"
				+ "\n ロット番号別品目棚卸追加レコード件数:[ " + intInsertCount + " ]"
			);

			return true;
		}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 棚卸制御更新処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean updateInvCtrl(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// 対象情報格納用
		int intUpdateCount = 0;	// 更新レコード数
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1138)■■■■■■■■■■棚卸制御更新処理-開始");

		//----------------------------
		// 棚卸制御読込（排他モード）
		//----------------------------
		List listInvCtrl = null;		// 棚卸制御一覧
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1139)棚卸制御読込（排他モード）\n"
	+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
);
		listInvCtrl = _invUpdateAccessor.readInvCtrlTable4Update(conn, info);
		if(listInvCtrl == null)
		{
			// エラー
			_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}

		//--------------
		// 棚卸制御更新
		//--------------
		info.setINV_STS_TYP("1");		// set 1（棚卸期間中）を設定
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1140)棚卸制御更新\n"
	+ " 棚卸状態区分:[ " + info.getINV_STS_TYP() + " ]"
	+ " 棚卸日:[ " + info.getINV_DATE() + " ]"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
);
		intUpdateCount = _invSaveAccessor.updateInvCtrlTable(conn, info);
		if(intUpdateCount == -1)
		{
			// エラー
			_msg.addCopy(_invSaveAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}

		// 処理成功
		_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
			// 詳細情報
			+ "\n(SBM1141)●●●●●●●●●●" 
			+ "\n 棚卸制御更新処理成功！" 
			+ "\n 棚卸制御更新レコード件数：[ " + intUpdateCount + " ]"
		);

		return true;
	}
}
