//------------------------------------------------------------------------------
// (#)InvAccessor.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/12/15 新規作成  M.Isoda
// 2004/01/05 M.Isoda
//            日付変換処理をDataConverterクラスを使用して処理するように変更
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.util.List;

import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.lang.NumberFormatException;
import java.text.MessageFormat;
import java.sql.SQLException;

/**
 * 棚卸アクセッサクラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvAccessor
{
//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvAccessor(){ clear(); }

	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 */
	public InvAccessor(
		String strPlantCd)
	{
		clear();
		_strPlantCd = strPlantCd;
	}

	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 * @param	strUserCd		ユーザコード
	 * @param	strProgramName	プログラム名（例 AH0070B001）
	 */
	public InvAccessor(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
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

//--------------------------------------------------------------------------
// 共通メソッド

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
	 * 棚卸情報一覧取得処理
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	strInvDate		棚卸日
	 * @param	intKindData		取得情報種類
	 * @param	intKindStock	在庫種類
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
		// 処理成功フラグ初期化
		List list = null;

		// 使用クラス準備
		InvGetProcess invGetProcess =
			new InvGetProcess(_strPlantCd, _strUserCd, _strProgramName);

		// メッセージ管理クラスクリア
		_msg.clear();

		// 棚卸情報一覧の取得
		list = invGetProcess.getStockList(conn, strInvDate, strKindData, strKindStock, strWhCd, strLotNo, strItemCd);
		_msg = invGetProcess.getMessage();	// 処理結果メッセージ取得

		return list;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 棚卸更新処理（保管区別品目在庫更新）
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	strInvDate		棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean updateItemStock(
		IDbConnection conn, 
		String strInvDate)
	{
		// 処理成功フラグ初期化
		boolean bSuccess = true;

		// 使用クラス準備
		InvUpdateProcess invUpdateProcess =
			new InvUpdateProcess(_strPlantCd, _strUserCd, _strProgramName);

		// メッセージ管理クラスクリア
		_msg.clear();

		// 保管区別品目在庫の更新
		bSuccess = invUpdateProcess.updateItemStock(conn, strInvDate);
		_msg = invUpdateProcess.getMessage();	// 処理結果メッセージ取得

		return bSuccess;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 棚卸更新処理（ロット別品目在庫更新）
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	strInvDate		棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean updateLotStock(
		IDbConnection conn, 
		String strInvDate)
	{
		// 処理成功フラグ初期化
		boolean bSuccess = true;

		// 使用クラス準備
		InvUpdateProcess invUpdateProcess =
			new InvUpdateProcess(_strPlantCd, _strUserCd, _strProgramName);

		// メッセージ管理クラスクリア
		_msg.clear();

		// 保管区別品目在庫の更新
		bSuccess = invUpdateProcess.updateLotStock(conn, strInvDate);
		_msg = invUpdateProcess.getMessage();	// 処理結果メッセージ取得

		return bSuccess;
	}
	/**
	 * 棚卸更新処理（保管区別製番在庫更新）
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	strInvDate		棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean updateJobOdrCdStock(
		IDbConnection conn, 
		String strInvDate)
	{
		// 処理成功フラグ初期化
		boolean bSuccess = true;

		// 使用クラス準備
		InvUpdateProcess invUpdateProcess =
			new InvUpdateProcess(_strPlantCd, _strUserCd, _strProgramName);

		// メッセージ管理クラスクリア
		_msg.clear();

		// 保管区別製番在庫の更新
		bSuccess = invUpdateProcess.updateJobOdrCdStock(conn, strInvDate);
		_msg = invUpdateProcess.getMessage();	// 処理結果メッセージ取得

		return bSuccess;
	}
	/**
	 * 棚卸更新処理（棚卸制御更新）
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	strInvDate		棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean updateInvCtrl(
		IDbConnection conn, 
		String strInvDate)
	{
		// 処理成功フラグ初期化
		boolean bSuccess = true;

		// 使用クラス準備
		InvUpdateProcess invUpdateProcess =
			new InvUpdateProcess(_strPlantCd, _strUserCd, _strProgramName);

		// メッセージ管理クラスクリア
		_msg.clear();

		// 棚卸制御の更新
		bSuccess = invUpdateProcess.updateInvCtrl(conn, strInvDate);
		_msg = invUpdateProcess.getMessage();	// 処理結果メッセージ取得

		return bSuccess;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 棚卸削除処理
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	strInvDate		棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean delete(
		IDbConnection conn, 
		String strInvDate)
	{
		// 処理成功フラグ初期化
		boolean bSuccess = true;

		// 使用クラス準備
		InvDeleteProcess invDeleteProcess =
			new InvDeleteProcess(_strPlantCd, _strUserCd, _strProgramName);

		// メッセージ管理クラスクリア
		_msg.clear();

		// 保管区別品目棚卸の削除
		bSuccess = invDeleteProcess.deleteItemInv(conn, strInvDate);
		_msg = invDeleteProcess.getMessage();	// 処理結果メッセージ取得
		if(bSuccess != true)
		{
			// エラー
			return false;
		}

		// 保管区別製番棚卸の削除
		bSuccess = invDeleteProcess.deleteJobOdrCdInv(conn, strInvDate);
		_msg = invDeleteProcess.getMessage();	// 処理結果メッセージ取得
		if(bSuccess != true)
		{
			// エラー
			return false;
		}

		// 棚卸制御の削除
		bSuccess = invDeleteProcess.deleteInvCtrl(conn, strInvDate);
		_msg = invDeleteProcess.getMessage();	// 処理結果メッセージ取得
		if(bSuccess != true)
		{
			// エラー
			return false;
		}
		try {
			if(LotCtrl.checkLotCtrl(conn)){
				// ロット別品目棚卸の削除
				bSuccess = invDeleteProcess.deleteLotInv(conn, strInvDate);
				_msg = invDeleteProcess.getMessage();	// 処理結果メッセージ取得
				if(bSuccess != true)
				{
					// エラー
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// エラー
			return false;
		}

		return true;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 棚卸退避処理
	 *
	 * @param	conn			DBアクセス用のコネクション
	 * @param	strInvDate		棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean save(
		IDbConnection conn, 
		String strInvDate)
	{
		// 処理成功フラグ初期化
		boolean bSuccess = true;

		// 使用クラス準備
		InvSaveProcess invSaveProcess =
			new InvSaveProcess(_strPlantCd, _strUserCd, _strProgramName);

		// メッセージ管理クラスクリア
		_msg.clear();

		// 棚卸制御の更新
		bSuccess = invSaveProcess.updateInvCtrl(conn, strInvDate);_msg = invSaveProcess.getMessage();	// 処理結果メッセージ取得
		if(bSuccess != true)
		{
			// エラー
			return false;
		}

		// 保管区別品目在庫の退避
		bSuccess = invSaveProcess.saveItemStock(conn, strInvDate);
		_msg = invSaveProcess.getMessage();	// 処理結果メッセージ取得
		if(bSuccess != true)
		{
			// エラー
			return false;
		}

		// 製番品目在庫の退避
		bSuccess = invSaveProcess.saveJobOdrCdStock(conn, strInvDate);
		_msg = invSaveProcess.getMessage();	// 処理結果メッセージ取得
		if(bSuccess != true)
		{
			// エラー
			return false;
		}
		try {
			if(LotCtrl.checkLotCtrl(conn)){
				// ロット別品目在庫の退避
				bSuccess = invSaveProcess.saveLotStock(conn, strInvDate);
				_msg = invSaveProcess.getMessage();	// 処理結果メッセージ取得
				if(bSuccess != true)
				{
					// エラー
					return false;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// エラー
			return false;
		}

		return true;
	}

	////////////////////////////////////////////////////////////////////////////
	/** 棚卸タイプ情報パラメータ取得アクセスキー */
	private final String INV_FLG_ACCESS_KEY = "INV_FLG";

	/** 棚卸状態区分情報パラメータ取得アクセスキー */
	private final String INV_STS_TYP_ACCESS_KEY = "INV_STS_TYP";

	/**
	 * 棚卸状態文字列取得<br>
	 *<br>
	 * @param	conn				DBアクセス用のコネクション
	 * @param	strRegularInvFlg	定期棚卸フラグ
	 * @param	strCycleInvFlg		循環棚卸フラグ
	 * @param	strTempInvFlg		臨時棚卸フラグ
	 * @param	strInvStsTyp		棚卸状態区分
	 * @param	locale		        ロケール
	 * @return	棚卸状態文字列:成功 / null:失敗
	 */
	public String getInvStatus(
		IDbConnection conn,
		String strRegularInvFlg, 
		String strCycleInvFlg, 
		String strTempInvFlg, 
		String strInvStsTyp,
		String local)
 	{
		// メッセージ情報
		ExpjMessage emsg = null;

		// 定期棚卸
		if("1".equals(strRegularInvFlg)) {
			if("0".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00052"); // 定期棚卸が棚卸実施前です。
			} else if("1".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00053"); // 定期棚卸が棚卸期間中です。
			} else if("2".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00054"); // 定期棚卸が棚卸更新済です。
			}
		}
		
		// 循環棚卸
		if("1".equals(strCycleInvFlg)) {
			if("0".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00055"); // 循環棚卸が棚卸実施前です。
			} else if("1".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00056"); // 循環棚卸が棚卸期間中です。
			} else if("2".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00057"); // 循環棚卸が棚卸更新済です。
			}
		}
		
		// 臨時棚卸
		if("1".equals(strTempInvFlg)) {
			if("0".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00058"); // 臨時棚卸が棚卸実施前です。
			} else if("1".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00059"); // 臨時棚卸が棚卸期間中です。
			} else if("2".equals(strInvStsTyp)) {
				emsg = new ExpjMessage("AH00060"); // 臨時棚卸が棚卸更新済です。
			}
		}	
		return 	emsg.getMessage(local);
	}

	////////////////////////////////////////////////////////////////////////////

}
