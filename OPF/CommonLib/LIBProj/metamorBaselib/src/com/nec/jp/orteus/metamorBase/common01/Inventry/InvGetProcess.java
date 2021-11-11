//------------------------------------------------------------------------------
// (#)InvGetProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.util.List;

/**
 * 棚卸情報取得処理クラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvGetProcess
{
//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvGetProcess(){ clear(); }

	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 * @param	strUserCd		ユーザコード
	 * @param	strProgramName	プログラム名（例 AH0070B001）
	 */
	public InvGetProcess(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
		_invGetAccessor = new InvGetAccessor(_strPlantCd, _strUserCd, _strProgramName);
		_invCommon = new InvCommon();
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

	/** 棚卸情報取得アクセッサクラス */
	private InvGetAccessor _invGetAccessor = null;

	/** 共通クラス */
	private InvCommon _invCommon = null;

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
		_invGetAccessor = null;
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
	 * 取得情報種類別データ取得<br>
	 *<br>
	 * @param	conn			DBアクセス用のコネクション
	 * @param	strInvDate		棚卸日
	 * @param	strKindData		取得情報種類
	 * @param	strKindStock	在庫種類
	 * @param	strWhCd			保管区コード
	 * @param	strLotNo		ロット
	 * @param	strItemCd		品目番号
	 * @return	情報一覧:成功 / null:失敗
	 */
	public List getStockList(
		IDbConnection conn, 
		String strInvDate,
		String strKindData,
		String strKindStock,
		String strWhCd,
		String strLotNo,
		String strItemCd)

	{
		InvInformation info = new InvInformation();
		int intKindStock;	// 在庫種類
		int intKindData;	// 取得情報種類

		// 在庫種類変換設定
		if("0".equals(strKindStock) == true)
		{
			intKindStock = InvGetAccessor.STOCK_ITEM;
		}
		else
		{
			intKindStock = InvGetAccessor.STOCK_JOB_ODR;
		}

		// 取得情報種類変換設定
		if("0".equals(strKindData) == true)
		{
			intKindData = InvGetAccessor.DATA_NORMAL;
		}
		else if("1".equals(strKindData) == true)
		{
			intKindData = InvGetAccessor.DATA_DEFECT;
		}
		else if("2".equals(strKindData) == true)
		{
			intKindData = InvGetAccessor.DATA_MINUS;
		}
		else
		{
			intKindData = InvGetAccessor.DATA_TRANSPORT;

			// 積送の場合は在庫種類に積送を設定
			intKindStock = InvGetAccessor.STOCK_TRANSPORT;
		}

		// 最新情報読込
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		info = _invGetAccessor.readInvCtrl(conn, info);
		if(info == null)
		{
			// エラー
			_msg.addCopy(_invGetAccessor.getMessage());	// 処理結果メッセージ取得追加
			return null;
		}

		// 取得
		info.setINV_DATE(strInvDate);
		info.setPLANT_CD(_strPlantCd);
		info.setWH_CD(strWhCd);
		info.setLOT_NO(strLotNo);
		info.setITEM_CD(strItemCd);

		List list = _invGetAccessor.getStockList(conn, info, intKindData, intKindStock);
		if(list == null)
		{
			// エラー
			_msg.addCopy(_invGetAccessor.getMessage());	// 処理結果メッセージ取得追加
			return null;
		}

		// システム日時取得
		String strDateTime = _invCommon.readSystemDateTime(conn);
		if(strDateTime == null)
		{
			// システム日時取得に失敗
			list = null;
			// システム日時取得に成功
		}
		else
		{
			for(int i = 0; i < list.size(); i++)
			{
				// リスト内のデータにシステム日付を設定
				InvInformation infoTemp = (InvInformation)list.get(i);
				infoTemp.setSYSTEM_DATETIME(strDateTime);
			}
		}
		return list;
	}
}
