//------------------------------------------------------------------------------
// (#)InvDeleteProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/23 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.util.List;

/**
 * 棚卸在庫削除処理クラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvDeleteProcess
{
//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvDeleteProcess(){ clear(); }

	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 * @param	strUserCd		ユーザコード
	 * @param	strProgramName	プログラム名（例 AH0070B001）
	 */
	public InvDeleteProcess(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
		_invDeleteAccessor = new InvDeleteAccessor(_strPlantCd, _strUserCd, _strProgramName);
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

	/** 棚卸削除アクセッサクラス */
	private InvDeleteAccessor _invDeleteAccessor = null;

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
		_invDeleteAccessor = null;
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
	 * 保管区別品目棚卸の削除処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean deleteItemInv(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// 対象情報格納用
		int intDeleteCount = 0;	// 削除レコード数
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1078)■■■■■■■■■■保管区別品目棚卸の削除処理-開始");

		//----------------------------------------------------
		// 保持期間の読込（保持情報区分=9：保管区別品目棚卸）
		//----------------------------------------------------
		List listSysMntPeriod = null;
		info.setPLANT_CD(_strPlantCd);
		info.setMNT_DATA_TYP("9");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1079)保持期間の読込（保持情報区分=9：保管区別品目棚卸）\n"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
	+ " 保持情報区分:[ " + info.getMNT_DATA_TYP() + " ]"
);
		listSysMntPeriod = _invDeleteAccessor.readSysMntPeriodTable(conn, info);
		if(listSysMntPeriod == null)
		{
			// エラー
			_msg.addCopy(_invDeleteAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}
		if(listSysMntPeriod.size() <= 0)
		{
			// 保持期間データが存在しない
			_msg.add(InvMessageControl.TYP_INFO, "", ""
				+ "(SBM1080)保持期間データが存在しませんでした。\n"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保持情報区分:[ " + info.getMNT_DATA_TYP() + " ]（保管区別品目棚卸）"
			);
		}
		else
		{
			InvInformation infoTemp = new InvInformation();
			infoTemp = (InvInformation)listSysMntPeriod.get(0);
			info.setPERIOD_DATE(infoTemp.getPERIOD_DATE());	// 削除基準日（システム日付－保持期間）
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	// 詳細情報
	+ "(SBM1081)保持期間読込結果（保持情報区分=9：保管区別品目棚卸）\n"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
	+ " 削除基準日（システム日付－保持期間）:[ " + info.getPERIOD_DATE() + " ]"
	+ " システム日付:[ " + infoTemp.getTODAY() + " ]"
	+ " 保持期間:[ " + infoTemp.getMNT_PERIOD() + " ]"
);

			//------------------------------------------------------
			// 保管区別品目棚卸の削除（保持期間を超えた過去データ）
			//------------------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1082)保管区別品目棚卸の削除（保持期間を超えた過去データ）\n"
	+ " 削除基準日（システム日付－保持期間）:[ " + info.getPERIOD_DATE() + " ]"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
);
			intDeleteCount = _invDeleteAccessor.deleteItemInvTable(conn, info);
			if(intDeleteCount == -1)
			{
				// エラー
				_msg.addCopy(_invDeleteAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}
		}

		// 処理成功
				_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
			// 詳細情報
			+ "\n(SBM1083)●●●●●●●●●●" 
			+ "\n 保管区別品目棚卸の削除処理成功！" 
			+ "\n 保持期間超え保管区別品目棚卸削除レコード件数:[ " + intDeleteCount + " ]"
		);

		return true;
	}

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別製番棚卸の削除処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return true:成功 / false:失敗
	 */
	public boolean deleteJobOdrCdInv(
		IDbConnection conn, 
		String strInvDate)
	{
		boolean bSuccess = true;	// 処理成功フラグ
		InvInformation info = new InvInformation();	// 対象情報格納用
		int intDeleteCount = 0;		// 削除レコード数
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1084)■■■■■■■■■■保管区別製番棚卸の削除処理-開始");

		//-----------------------------------------------------
		// 保持期間の読込（保持情報区分=10：保管区別製番棚卸）
		//-----------------------------------------------------
		List listSysMntPeriod = null;
		info.setPLANT_CD(_strPlantCd);
		info.setMNT_DATA_TYP("10");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1085)保持期間の読込（保持情報区分=10：保管区別製番棚卸）\n"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
	+ " 保持情報区分:[ " + info.getMNT_DATA_TYP() + " ]"
);
		listSysMntPeriod = _invDeleteAccessor.readSysMntPeriodTable(conn, info);
		if(listSysMntPeriod == null)
		{
			// エラー
			_msg.addCopy(_invDeleteAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}
		if(listSysMntPeriod.size() <= 0)
		{
			// 保持期間データが存在しない
				_msg.add(InvMessageControl.TYP_INFO, "", ""
				+ "(SBM1086)保持期間データが存在しませんでした。\n"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保持情報区分:[ " + info.getMNT_DATA_TYP() + " ]（保管区別製番棚卸）"
			);
		}
		else
		{
			InvInformation infoTemp = new InvInformation();
			infoTemp = (InvInformation)listSysMntPeriod.get(0);
			info.setPERIOD_DATE(infoTemp.getPERIOD_DATE());	// 削除基準日（システム日付－保持期間）
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	// 詳細情報
	+ "(SBM1087)保持期間読込結果（保持情報区分=10：保管区別製番棚卸）\n"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
	+ " 削除基準日（システム日付－保持期間）:[ " + info.getPERIOD_DATE() + " ]"
	+ " システム日付:[ " + infoTemp.getTODAY() + " ]"
	+ " 保持期間:[ " + infoTemp.getMNT_PERIOD() + " ]"
);

			//------------------------------------------------------
			// 保管区別製番棚卸の削除（保持期間を超えた過去データ）
			//------------------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1094)保管区別製番棚卸の削除（保持期間を超えた過去データ）\n"
	+ " 削除基準日（システム日付－保持期間）:[ " + info.getPERIOD_DATE() + " ]"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
);
			intDeleteCount = _invDeleteAccessor.deleteJobOdrCdInvTable(conn, info);
			if(intDeleteCount == -1)
			{
				// エラー
				_msg.addCopy(_invDeleteAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}

			// 処理成功
				_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// 詳細情報
				+ "\n(SBM1095)●●●●●●●●●●" 
				+ "\n 保管区別製番棚卸の削除処理成功！" 
				+ "\n 保持期間超え保管区別製番棚卸削除レコード件数:[ " + intDeleteCount + " ]"
			);
		}

		return true;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * ロット別品目棚卸の削除処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return true:成功 / false:失敗
	 */
	public boolean deleteLotInv(
		IDbConnection conn, 
		String strInvDate)
	{
		boolean bSuccess = true;	// 処理成功フラグ
		InvInformation info = new InvInformation();	// 対象情報格納用
		int intDeleteCount = 0;		// 削除レコード数
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1096)■■■■■■■■■■ロット別品目棚卸の削除処理-開始");

		//-----------------------------------------------------
		// 保持期間の読込（保持情報区分=9：ロット別品目棚卸）
		//-----------------------------------------------------
		List listSysMntPeriod = null;
		info.setPLANT_CD(_strPlantCd);
		info.setMNT_DATA_TYP("9");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
          + "(SBM1097)保持期間の読込（保持情報区分=9：ロット別品目棚卸）\n"
	      + " 工場コード:[ " + info.getPLANT_CD() + " ]"
	      + " 保持情報区分:[ " + info.getMNT_DATA_TYP() + " ]"
		);
		listSysMntPeriod = _invDeleteAccessor.readSysMntPeriodTable(conn, info);
		if(listSysMntPeriod == null)
		{
			// エラー
			_msg.addCopy(_invDeleteAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}
		if(listSysMntPeriod.size() <= 0)
		{
			// 保持期間データが存在しない
			_msg.add(InvMessageControl.TYP_INFO, "", ""
				+ "(SBM1098)保持期間データが存在しませんでした。\n"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保持情報区分:[ " + info.getMNT_DATA_TYP() + " ]（ロット別品目棚卸）"
			);
		}
		else
		{
			InvInformation infoTemp = new InvInformation();
			infoTemp = (InvInformation)listSysMntPeriod.get(0);
			info.setPERIOD_DATE(infoTemp.getPERIOD_DATE());	// 削除基準日（システム日付－保持期間）
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	        // 詳細情報
	          + "(SBM1099)保持期間読込結果（保持情報区分=9：ロット別品目棚卸）\n"
	          + " 工場コード:[ " + info.getPLANT_CD() + " ]"
	          + " 削除基準日（システム日付－保持期間）:[ " + info.getPERIOD_DATE() + " ]"
	          + " システム日付:[ " + infoTemp.getTODAY() + " ]"
	          + " 保持期間:[ " + infoTemp.getMNT_PERIOD() + " ]"
            );

			//------------------------------------------------------
			// ロット別品目棚卸の削除（保持期間を超えた過去データ）
			//------------------------------------------------------
            _msg.add(InvMessageControl.TYP_CONFIG, "", ""
	          + "(SBM1100)ロット別品目棚卸の削除（保持期間を超えた過去データ）\n"
	          + " 削除基準日（システム日付－保持期間）:[ " + info.getPERIOD_DATE() + " ]"
	          + " 工場コード:[ " + info.getPLANT_CD() + " ]"
            );
			intDeleteCount = _invDeleteAccessor.deleteLotInvTable(conn, info);
			if(intDeleteCount == -1)
			{
				// エラー
				_msg.addCopy(_invDeleteAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}

			// 処理成功
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// 詳細情報
				+ "\n(SBM1101)●●●●●●●●●●" 
				+ "\n ロット別品目棚卸の削除処理成功！" 
				+ "\n 保持期間超えロット別品目棚卸削除レコード件数:[ " + intDeleteCount + " ]"
			);
		}

		return true;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 棚卸制御の削除処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return true:成功 / false:失敗
	 */
	public boolean deleteInvCtrl(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// 対象情報格納用
		int intInvTargetWhCount = 0;	// 棚卸条件保管区指定用削除レコード数
		int intInvTargetItemCount = 0;	// 棚卸条件品目指定用削除レコード数
		int intInvCtrlCount = 0;		// 棚卸制御用削除レコード数
		_msg.add(InvMessageControl.TYP_CONFIG, "", "\n(SBM1102)■■■■■■■■■■棚卸制御の削除処理-開始");

		//--------------------------------------------
		// 保持期間の読込（保持情報区分=8：棚卸制御）
		//--------------------------------------------
		List listSysMntPeriod = null;
		info.setPLANT_CD(_strPlantCd);
		info.setMNT_DATA_TYP("8");
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1103)保持期間の読込（保持情報区分=8：棚卸制御）\n"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
	+ " 保持情報区分:[ " + info.getMNT_DATA_TYP() + " ]"
);
		listSysMntPeriod = _invDeleteAccessor.readSysMntPeriodTable(conn, info);
		if(listSysMntPeriod == null)
		{
			// エラー
			_msg.addCopy(_invDeleteAccessor.getMessage());	// 処理結果メッセージ取得追加
			return false;
		}
		if(listSysMntPeriod.size() <= 0)
		{
			// 保持期間データが存在しない
			_msg.add(InvMessageControl.TYP_INFO, "", ""
				+ "(SBM1104)保持期間データが存在しませんでした。\n"
				+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
				+ " 保持情報区分:[ " + info.getMNT_DATA_TYP() + " ]（棚卸制御）"
			);
		}
		else
		{
			InvInformation infoTemp = new InvInformation();
			infoTemp = (InvInformation)listSysMntPeriod.get(0);
			info.setPERIOD_DATE(infoTemp.getPERIOD_DATE());	// 削除基準日（システム日付－保持期間）
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	// 詳細情報
	+ "(SBM1105)保持期間読込結果（保持情報区分=8：棚卸制御）\n"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
	+ " 削除基準日（システム日付－保持期間）:[ " + info.getPERIOD_DATE() + " ]"
	+ " システム日付:[ " + infoTemp.getTODAY() + " ]"
	+ " 保持期間:[ " + infoTemp.getMNT_PERIOD() + " ]"
);

			//--------------------------------------------------------
			// 棚卸条件保管区指定の削除（保持期間を超えた過去データ）
			//--------------------------------------------------------
			_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1106)棚卸条件保管区指定の削除（保持期間を超えた過去データ）\n"
	+ " 削除基準日（システム日付－保持期間）:[ " + info.getPERIOD_DATE() + " ]"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
);
			intInvTargetWhCount = _invDeleteAccessor.deleteInvTargetWhTable(conn, info);
			if(intInvTargetWhCount == -1)
			{
				// エラー
				_msg.addCopy(_invDeleteAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}

			//------------------------------------------------------
			// 棚卸条件品目指定の削除（保持期間を超えた過去データ）
			//------------------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1107)棚卸条件品目指定の削除（保持期間を超えた過去データ）\n"
	+ " 削除基準日（システム日付－保持期間）:[ " + info.getPERIOD_DATE() + " ]"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
);
			intInvTargetItemCount = _invDeleteAccessor.deleteInvTargetItemTable(conn, info);
			if(intInvTargetItemCount == -1)
			{
				// エラー
				_msg.addCopy(_invDeleteAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}

			//----------------------------------------------
			// 棚卸制御の削除（保持期間を超えた過去データ）
			//----------------------------------------------
		_msg.add(InvMessageControl.TYP_CONFIG, "", ""
	+ "(SBM1108)棚卸制御の削除（保持期間を超えた過去データ）\n"
	+ " 削除基準日（システム日付－保持期間）:[ " + info.getPERIOD_DATE() + " ]"
	+ " 工場コード:[ " + info.getPLANT_CD() + " ]"
);
			intInvCtrlCount = _invDeleteAccessor.deleteInvCtrlTable(conn, info);
			if(intInvCtrlCount == -1)
			{
				// エラー
				_msg.addCopy(_invDeleteAccessor.getMessage());	// 処理結果メッセージ取得追加
				return false;
			}

		}
		// 処理成功
		_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
			// 詳細情報
			+ "\n(SBM1109)●●●●●●●●●●" 
			+ "\n 棚卸制御の削除処理成功！" 
			+ "\n 棚卸条件保管区指定の削除レコード件数:[ " + intInvTargetWhCount + " ]"
			+ "\n 棚卸条件品目指定の削除レコード件数:[ " + intInvTargetItemCount + " ]"
			+ "\n 棚卸制御の削除レコード件数:[ " + intInvCtrlCount + " ]"
		);

		return true;
	}
}
