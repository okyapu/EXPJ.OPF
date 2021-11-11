//------------------------------------------------------------------------------
// (#)InvUpdateProcess.java
//
// Copyright (c) 2004 NEC Informatec Systems,Ltd.
//
// 2004/01/23 新規作成  M.Isoda
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Inventry;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import java.sql.SQLException;
import java.util.List;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.sysdata.*;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
/**
 * 棚卸更新処理クラス
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class InvUpdateProcess
{
//--------------------------------------------------------------------------
// 構築

	/** コンストラクタ */
	public InvUpdateProcess(){ clear(); }

	/** コンストラクタ
	 *
	 * @param	strPlantCd		工場コード
	 * @param	strUserCd		ユーザコード
	 * @param	strProgramName	プログラム名（例 AH0070B001）
	 */
	public InvUpdateProcess(
		String strPlantCd, 
		String strUserCd, 
		String strProgramName)
	{
		clear();
		_strPlantCd = strPlantCd;
		_strUserCd = strUserCd;
		_strProgramName = strProgramName;
		_msg = new InvMessageControl();
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

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 新在庫数算出
	 *
	 * @param	info	パラメータ情報
	 * @return	新在庫数文字列
	 */
	private String calculateNewStock(
		InvInformation info)
	{
		// 計算対象内容チェック
		String strStockInHandQty = info.getSTOCK_ON_HAND_QTY();
		String strFinalBookStockQty = info.getFINAL_BOOK_STOCK_QTY();
		String strSumRecIssueQty = info.getw_SUM_RCV_ISSUE_QTY();
		String strActualStockQty = info.getACTUAL_STOCK_QTY();

		// 実績日が棚卸日以降の入出庫数＝今在庫－（セーブ在庫＋遅れ伝票）
		// wk数 = ②strStockInHandQty - (①strFinalBookStockQty + ③strSumRecIssueQty)
		String strWork = Calculate.subtract(strStockInHandQty, Calculate.add(strFinalBookStockQty, strSumRecIssueQty) );
		// 新在庫数＝実棚数＋実績日が棚卸日以降の入出庫数
		// 新在庫数 = ①strActualStockQty + wk数
		String strNewStock = Calculate.add(strActualStockQty, strWork);

		return strNewStock;
	}

//--------------------------------------------------------------------------
// 操作

	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別品目在庫更新処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean updateItemStock(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// 対象情報格納用
		boolean bSuccess = true;	// 処理成功フラグ
		int intUpdateCount = 0;		// 更新レコード数
		//会社コード取得
		MyCompanyStruct companystruct = new MyCompanyStruct();
		try {
			 companystruct = MyCompanyControl.getData(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		//---------------------------------------
		// ① 保管区別品目棚卸読込（排他モード）
		//---------------------------------------
		List listItemInv = null;
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		listItemInv = _invUpdateAccessor.readItemInvTable4Update(conn, info);
		if(listItemInv == null)
		{
			// エラー
			_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
			bSuccess = false;
		}

		// 処理成功の場合
		if(bSuccess == true)
		{
			boolean bIsStock;			// 在庫存在フラグ
			InvInformation infoTemp;	// レコード情報退避用
			List listTemp;				// リスト情報退避用
			String strRcvIssueCtrlCd;	// 自動採番コード退避用
			int intResultCount;			// 処理レコード数退避用
			String strStockOnHandQty;	// 在庫数退避用
			String strSumRcvIssueQty;	// 入出庫集計数退避用
			String strNewStock;			// 新在庫数退避用
			for(int i = 0; i < listItemInv.size(); i++)
			{
				// 読込情報取得
				info = (InvInformation)listItemInv.get(i);
				info.setINV_DATE(strInvDate);
				info.setPLANT_CD(_strPlantCd);
				info.setJOB_ODR_CD(null);
				System.out.println("(SBM1147)■■■■■ 更新対象保管区別品目棚卸レコード：" + (i+1) + " 件目 ■■■■■"
	+ "\nレコード情報"
	+ "\n             INV_DATE：" + info.getINV_DATE()
	+ "\n             PLANT_CD：" + info.getPLANT_CD()
	+ "\n              ITEM_CD：" + info.getITEM_CD()
	+ "\n                WH_CD：" + info.getWH_CD()
	+ "\n           JOB_ODR_CD：" + info.getJOB_ODR_CD()
	+ "\n     ACTUAL_STOCK_QTY：" + info.getACTUAL_STOCK_QTY()
	+ "\n FINAL_BOOK_STOCK_QTY：" + info.getFINAL_BOOK_STOCK_QTY()
);

				// -------------------------------------------------------
				// ② 保管区別入出庫読込（遅れ伝票の入出庫数を集計取得）
				// -------------------------------------------------------
				System.out.println("(SBM1149)②保管区別入出庫読込");
				// INV_DATE // where 上部で設定済み
				// PLANT_CD // where 上部で設定済み
				// JOB_ODR_CD // where 上部で設定済み
				// ITEM_CD // where 上部で設定済み
				// WH_CD // where 上部で設定済み
				listTemp = _invUpdateAccessor.readRcvIssueTable(conn, info);
				if (listTemp == null) {
					// エラー
					_msg.addCopy(_invUpdateAccessor.getMessage()); // 処理結果メッセージ取得追加
					bSuccess = false;
					break;
				}
				// 遅れ伝票の入出庫集計数を取得
				strSumRcvIssueQty = "0"; // 入出庫集計数を0(ゼロ)で初期化
				if (listTemp.size() > 0) {
					// データが存在した場合、集計数を取得
					infoTemp = (InvInformation) listTemp.get(0);
					strSumRcvIssueQty = infoTemp.getw_SUM_RCV_ISSUE_QTY();
				}
				
				System.out.println("(SBM1150)② 保管区別入出庫読込終了"
		+ "\n r) w_SUM_RCV_ISSUE_QTY：" + strSumRcvIssueQty
		+ "\n 読込件数：" + listTemp.size());

				// 最終帳簿在庫数 + 遅れ伝票 <> 実棚数時、新在庫数を算出
				if(Calculate.compare(Calculate.add(info.getFINAL_BOOK_STOCK_QTY(), strSumRcvIssueQty), 
						info.getACTUAL_STOCK_QTY()) == 0) {
					continue;
				}
	
				//---------------------------------------
				// ③ 保管区別品目在庫読込（排他モード）
				//---------------------------------------
				System.out.println("(SBM1151)③ 保管区別品目在庫読込");
				//ITEM_CD						// where 上部で設定済み
				//WH_CD							// where 上部で設定済み
				info.setPLANT_CD(_strPlantCd);	// where
				listTemp = _invUpdateAccessor.readItemStockTable4Update(conn, info);
				if(listTemp == null)
				{
					// エラー
					_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
					bSuccess = false;
					break;
				}
				// 品目在庫数取得
				strStockOnHandQty = "0";	// 品目在庫数を0(ゼロ)で初期化
				bIsStock = false;			// 品目在庫存在フラグをなしで初期化
				if(listTemp.size() > 0)
				{
					// 品目在庫が存在する
					bIsStock = true;
					infoTemp = (InvInformation)listTemp.get(0);
					strStockOnHandQty = infoTemp.getSTOCK_ON_HAND_QTY();
				}
				System.out.println("(SBM1152)③ 保管区別品目在庫読込終了"
	+ "\n r) STOCK_ON_HAND_QTY：" + strStockOnHandQty
	+ "\n 読込件数：" + listTemp.size()
);
				//------------------------------------------------------
				// ロット管理フラグの取得
				//------------------------------------------------------
                _invUpdateAccessor.readLotCtrlFlg(conn, info);
                
				//-----------------
				// ④ 新在庫数算出
				//-----------------
				info.setSTOCK_ON_HAND_QTY(strStockOnHandQty);
				info.setw_SUM_RCV_ISSUE_QTY(strSumRcvIssueQty);
				strNewStock = calculateNewStock(info);	// 新在庫数取得
				System.out.println("(SBM1153)④ 新在庫数算出後"
	+ "\n セーブ在庫(FINAL_BOOK_STOCK_QTY)：" + info.getFINAL_BOOK_STOCK_QTY()
	+ "\n 今在庫(STOCK_ON_HAND_QTY)：" + info.getSTOCK_ON_HAND_QTY()
	+ "\n 遅れ伝票(SUM_RCV_ISSUE_QTY)：" + info.getw_SUM_RCV_ISSUE_QTY()
	+ "\n 新在庫：" + strNewStock);

				if(bIsStock == true)
				{
					// 品目在庫が存在する

					//------------------------------------------
					// ⑤-1 保管区別品目在庫更新（新在庫数反映）
					//------------------------------------------
					System.out.println("(SBM1154)⑤-1 保管区別品目在庫更新 - 品目在庫が存在する");
					info.setSTOCK_ON_HAND_QTY(strNewStock);	// set
					//ITEM_CD								// where 上部で設定済み
					//PLANT_CD								// where 上部で設定済み
					//WH_CD									// where 上部で設定済み
					intResultCount = _invUpdateAccessor.updateItemStockTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1155)⑤-1 保管区別品目在庫更新終了 - 品目在庫が存在する。更新件数：" + intResultCount);
                    //ロット管理フラグが1の場合
                    if (!(info.getLOT_CTRL_FLG() != null && "1".equals(info.getLOT_CTRL_FLG()))){
    					//-------------------------------
    					// ⑥ 保管区別入出庫登録（赤伝）
    					//-------------------------------
                    	System.out.println("(SBM1156)⑥ 保管区別入出庫登録（赤伝） - 品目在庫が存在する");
    					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// 入出庫管理番号の自動採番
    					if(strRcvIssueCtrlCd == null)
    					{
    						// エラー
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
    						bSuccess = false;
    						break;
    					}
    					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);						// set 採番後の入出庫管理番号を設定
    					info.setRCV_ISSUE_TYP("2");											// set 赤伝は 2 を設定
    					//ITEM_CD															// set 上部で設定済み
    					//PLANT_CD															// set 上部で設定済み
    					//WH_CD																// set 上部で設定済み
    					//JOB_ODR_CD														// set 上部で設定済み
    					info.setRCV_ISSUE_QTY(Calculate.multiply(strStockOnHandQty, "-1"));	// set 更新前の品目手持在庫数をマイナス変換
    					info.setSAVE_STOCK_HAND_QTY(strStockOnHandQty);						// set 前後数セット用に手持ち在庫数をセット
    					info.setRCV_ISSUE_DATE(strInvDate);									// set 棚卸日を設定
    					info.setRCV_ISSUE_GNR_TYP("28");									// set 28（棚卸調整出庫）を設定
    					info.setSTOCK_UPD_TYP("2");											// set 2（更新済み）を設定
    					info.setRCV_ISSUE_CMPLT_FLG("0");									// set 0（未）を設定
    				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());                  // set 会社コード
    					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
    					if(intResultCount == -1)
    					{
    						// エラー
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
    						bSuccess = false;
    						break;
    					}
    					System.out.println("(SBM1157)⑥ 保管区別入出庫登録終了（赤伝） - 品目在庫が存在する。登録件数：" + intResultCount);

    					//-------------------------------
    					// ⑥ 保管区別入出庫登録（黒伝）
    					//-------------------------------
    					System.out.println("(SBM1158)⑥ 保管区別入出庫登録（黒伝） - 品目在庫が存在する");
    					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// 入出庫管理番号の自動採番
    					if(strRcvIssueCtrlCd == null)
    					{
    						// エラー
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
    						bSuccess = false;
    						break;
    					}
    					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set 採番後の入出庫管理番号を設定
    					info.setRCV_ISSUE_TYP("1");						// set 黒伝は 1 を設定
    					//ITEM_CD										// set 上部で設定済み
    					//PLANT_CD										// set 上部で設定済み
    					//WH_CD											// set 上部で設定済み
    					//JOB_ODR_CD									// set 上部で設定済み
    					info.setRCV_ISSUE_QTY(strNewStock);				// set 新在庫数を設定
    					info.setSAVE_STOCK_HAND_QTY("0");				// set 前後数セット用に0をセット
    					info.setRCV_ISSUE_DATE(strInvDate);				// set 棚卸日を設定
    					info.setRCV_ISSUE_GNR_TYP("28");				// set 28（棚卸調整出庫）を設定
    					info.setSTOCK_UPD_TYP("2");						// set 2（更新済み）を設定
    					info.setRCV_ISSUE_CMPLT_FLG("0");				// set 0（未）を設定
    				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());    // set 会社コード
    					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
    					if(intResultCount == -1)
    					{
    						// エラー
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
    						bSuccess = false;
    						break;
    					}
    					System.out.println("(SBM1159)⑥ 保管区別入出庫登録終了（黒伝） - 品目在庫が存在する。登録件数：" + intResultCount);	
                    }
				}
				else
				{
					// 品目在庫が存在しない

					//-------------------------------------------
					// ⑤-2 保管区別品目在庫登録（新在庫数反映）
					//-------------------------------------------
					System.out.println("(SBM1160)⑤-2 保管区別品目在庫登録 - 品目在庫が存在しない");
					//ITEM_CD		// 上部で設定済み
					//WH_CD			// 上部で設定済み
					//PLANT_CD		// 上部で設定済み
					info.setSTOCK_ON_HAND_QTY(strNewStock);
					intResultCount = _invUpdateAccessor.insertItemStockTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1161)⑤-2 保管区別品目在庫登録終了 - 品目在庫が存在しない。登録件数：" + intResultCount);

                    //ロット管理フラグが1の場合
                    if (!(info.getLOT_CTRL_FLG() != null && "1".equals(info.getLOT_CTRL_FLG()))){
    					//-------------------------------
    					// ⑥ 保管区別入出庫登録（黒伝）
    					//-------------------------------
                    	System.out.println("(SBM1162)⑥ 保管区別入出庫登録（黒伝） - 品目在庫が存在しない");
    					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// 入出庫管理番号の自動採番
    					if(strRcvIssueCtrlCd == null)
    					{
    						// エラー
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
    						bSuccess = false;
    						break;
    					}
    					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set 採番後の入出庫管理番号を設定
    					info.setRCV_ISSUE_TYP("1");							// set 黒伝は 1 を設定
    					//ITEM_CD											// set 上部で設定済み
    					//PLANT_CD											// set 上部で設定済み
    					//WH_CD												// set 上部で設定済み
    					//JOB_ODR_CD										// set 上部で設定済み
    					info.setRCV_ISSUE_QTY(strNewStock);					// set 新在庫数を設定
    					info.setSAVE_STOCK_HAND_QTY("0");					// set 前後数セット用に0をセット
    					info.setRCV_ISSUE_DATE(strInvDate);					// set 棚卸日を設定
    					info.setRCV_ISSUE_GNR_TYP("28");					// set 28（棚卸調整出庫）を設定
    					info.setSTOCK_UPD_TYP("2");							// set 2（更新済み）を設定
    					info.setRCV_ISSUE_CMPLT_FLG("0");					// set 0（未）を設定
    				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());  // set 会社コード
    					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
    					if(intResultCount == -1)
    					{
    						// エラー
    						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
    						bSuccess = false;
    						break;
    					}
    					System.out.println("(SBM1163)⑥ 保管区別入出庫登録終了（黒伝） - 品目在庫が存在しない。登録件数：" + intResultCount);
                    }
				}
				//-------------------------------------------
				// ⑦ 保管区別品目棚卸更新（更新フラグ更新）
				//-------------------------------------------
				System.out.println("(SBM1164)⑦ 保管区別品目棚卸更新");
				info.setINV_UPD_FLG("1");	// 1（済）を設定
				intResultCount = _invUpdateAccessor.updateItemInvTable(conn, info);
				if(intResultCount == -1)
				{
					// エラー
					_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
					bSuccess = false;
					break;
				}
				System.out.println("(SBM1165)⑦ 保管区別品目棚卸更新終了。更新件数：" + intResultCount);

				// 更新レコード数カウント
				intUpdateCount++;
			}
		}
		// 処理成功の場合
		if(bSuccess == true)
		{
			// 処理成功
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// 詳細情報
				+ "(SBM1166)保管区別品目在庫更新レコード件数：[ " + intUpdateCount + " ]"
			);
		}
		return bSuccess;
	}
	
	
	/**
	 * ロット別品目在庫更新処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean updateLotStock(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// 対象情報格納用
		boolean bSuccess = true;	// 処理成功フラグ
		int intUpdateCount = 0;		// 更新レコード数
		//会社コード取得
		MyCompanyStruct companystruct = new MyCompanyStruct();
		try {
			 companystruct = MyCompanyControl.getData(conn);			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		//---------------------------------------
		// ① ロット別品目棚卸読込（排他モード）
		//---------------------------------------
		List listLotInv = null;
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		listLotInv = _invUpdateAccessor.readLotInvTable4Update(conn, info);
		if(listLotInv == null)
		{
			// エラー
			_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
			bSuccess = false;
		}

		// 処理成功の場合
		if(bSuccess == true)
		{
			boolean bIsStock;			// 在庫存在フラグ
			InvInformation infoTemp;	// レコード情報退避用
			List listTemp;				// リスト情報退避用
			String strRcvIssueCtrlCd;	// 自動採番コード退避用
			int intResultCount;			// 処理レコード数退避用
			String strStockOnHandQty;	// 在庫数退避用
			String strSumRcvIssueQty;	// 入出庫集計数退避用
			String strNewStock;			// 新在庫数退避用
			for(int i = 0; i < listLotInv.size(); i++)
			{
				// 読込情報取得
				info = (InvInformation)listLotInv.get(i);
				info.setINV_DATE(strInvDate);
				info.setPLANT_CD(_strPlantCd);
				info.setJOB_ODR_CD(null);
				System.out.println("(SBM1167)■■■■■ 更新対象ロット別品目棚卸レコード：" + (i+1) + " 件目 ■■■■■"
					+ "\nレコード情報"
					+ "\n             INV_DATE：" + info.getINV_DATE()
					+ "\n             PLANT_CD：" + info.getPLANT_CD()
					+ "\n              ITEM_CD：" + info.getITEM_CD()
					+ "\n                WH_CD：" + info.getWH_CD()
					+ "\n           JOB_ODR_CD：" + info.getJOB_ODR_CD()
					+ "\n     ACTUAL_STOCK_QTY：" + info.getACTUAL_STOCK_QTY()
					+ "\n               LOT_NO：" + info.getLOT_NO()
					+ "\n FINAL_BOOK_STOCK_QTY：" + info.getFINAL_BOOK_STOCK_QTY()
				);

				//-------------------------------------------------------
				// ②ロット別入出庫読込（遅れ伝票の入出庫数を集計取得）
				//-------------------------------------------------------
				System.out.println("(SBM1168)② ロット別入出庫読込");
				//INV_DATE		// where 上部で設定済み
				//PLANT_CD		// where 上部で設定済み
				//JOB_ODR_CD	// where 上部で設定済み
				//ITEM_CD		// where 上部で設定済み
				//WH_CD			// where 上部で設定済み
				listTemp = _invUpdateAccessor.readLotRcvIssueTable(conn, info);
				if(listTemp == null)
				{
					// エラー
					_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
					bSuccess = false;
					break;
				}
				// 遅れ伝票の入出庫集計数を取得
				strSumRcvIssueQty = "0";	// 入出庫集計数を0(ゼロ)で初期化
				if(listTemp.size() > 0)
				{
					// データが存在した場合、集計数を取得
					infoTemp = (InvInformation)listTemp.get(0);
					strSumRcvIssueQty = infoTemp.getw_SUM_RCV_ISSUE_QTY();
				}
				System.out.println("(SBM1169)② ロット別入出庫読込終了"
					+ "\n r) w_SUM_RCV_ISSUE_QTY：" + strSumRcvIssueQty
					+ "\n 読込件数：" + listTemp.size()
				);
				
				// 最終帳簿在庫数 + 遅れ伝票 <> 実棚数時、新在庫数を算出
				if(Calculate.compare(Calculate.add(info.getFINAL_BOOK_STOCK_QTY(), strSumRcvIssueQty), 
						info.getACTUAL_STOCK_QTY()) == 0) {
					continue;
				}
				
				//---------------------------------------
				// ③ ロット別品目在庫読込（排他モード）
				//---------------------------------------
				System.out.println("(SBM1170)③ ロット別品目在庫読込");
				//ITEM_CD						// where 上部で設定済み
				//WH_CD							// where 上部で設定済み
				info.setPLANT_CD(_strPlantCd);	// where
				listTemp = _invUpdateAccessor.readLotStockTable4Update(conn, info);
				if(listTemp == null)
				{
					// エラー
					_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
					bSuccess = false;
					break;
				}
				// 品目在庫数取得
				strStockOnHandQty = "0";	// 品目在庫数を0(ゼロ)で初期化
				bIsStock = false;			// 品目在庫存在フラグをなしで初期化
				if(listTemp.size() > 0)
				{
					// 品目在庫が存在する
					bIsStock = true;
					infoTemp = (InvInformation)listTemp.get(0);
					strStockOnHandQty = infoTemp.getSTOCK_ON_HAND_QTY();
				}
				System.out.println("(SBM1171)③ ロット別品目在庫読込終了"
					+ "\n r) STOCK_ON_HAND_QTY：" + strStockOnHandQty
					+ "\n 読込件数：" + listTemp.size()
				);

				//-----------------
				// ④ 新在庫数算出
				//-----------------
				info.setSTOCK_ON_HAND_QTY(strStockOnHandQty);
				info.setw_SUM_RCV_ISSUE_QTY(strSumRcvIssueQty);
				strNewStock = calculateNewStock(info);	// 新在庫数取得
				System.out.println("(SBM1153)④ 新在庫数算出後"
					+ "\n セーブ在庫(FINAL_BOOK_STOCK_QTY)：" + info.getFINAL_BOOK_STOCK_QTY()
					+ "\n 今在庫(STOCK_ON_HAND_QTY)：" + info.getSTOCK_ON_HAND_QTY()
					+ "\n 遅れ伝票(SUM_RCV_ISSUE_QTY)：" + info.getw_SUM_RCV_ISSUE_QTY()
					+ "\n 新在庫：" + strNewStock);

				if(bIsStock == true)
				{
					// 品目在庫が存在する

					//------------------------------------------
					// ⑤-1 ロット別品目在庫更新（新在庫数反映）
					//------------------------------------------
					System.out.println("(SBM1172)⑤-1 ロット別品目在庫更新 - 品目在庫が存在する");
					info.setSTOCK_ON_HAND_QTY(strNewStock);	// set
					//ITEM_CD								// where 上部で設定済み
					//PLANT_CD								// where 上部で設定済み
					//WH_CD									// where 上部で設定済み
					intResultCount = _invUpdateAccessor.updateLotStockTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1173)⑤-1 ロット別品目在庫更新終了 - 品目在庫が存在する。更新件数：" + intResultCount);

					//-------------------------------
					// ⑥ 保管区別入出庫登録（赤伝）
					//-------------------------------
					System.out.println("(SBM1156)⑥ 保管区別入出庫登録（赤伝） - 品目在庫が存在する");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// 入出庫管理番号の自動採番
					if(strRcvIssueCtrlCd == null)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);						// set 採番後の入出庫管理番号を設定
					info.setRCV_ISSUE_TYP("2");											// set 赤伝は 2 を設定
					//ITEM_CD															// set 上部で設定済み
					//PLANT_CD															// set 上部で設定済み
					//WH_CD																// set 上部で設定済み
					//JOB_ODR_CD														// set 上部で設定済み
					info.setRCV_ISSUE_QTY(Calculate.multiply(strStockOnHandQty, "-1"));	// set 更新前の品目手持在庫数をマイナス変換
					info.setSAVE_STOCK_HAND_QTY(strStockOnHandQty);						// set 前後数セット用に手持ち在庫数をセット
					info.setRCV_ISSUE_DATE(strInvDate);									// set 棚卸日を設定
					info.setRCV_ISSUE_GNR_TYP("28");									// set 28（棚卸調整出庫）を設定
					info.setSTOCK_UPD_TYP("2");											// set 2（更新済み）を設定
					info.setRCV_ISSUE_CMPLT_FLG("0");									// set 0（未）を設定
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());                  // set 会社コード
					intResultCount = _invUpdateAccessor.insertLotRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1157)⑥ 保管区別入出庫登録終了（赤伝） - 品目在庫が存在する。登録件数：" + intResultCount);

					//-------------------------------
					// ⑥ 保管区別入出庫登録（黒伝）
					//-------------------------------
					System.out.println("(SBM1158)⑥ 保管区別入出庫登録（黒伝） - 品目在庫が存在する");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// 入出庫管理番号の自動採番
					if(strRcvIssueCtrlCd == null)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set 採番後の入出庫管理番号を設定
					info.setRCV_ISSUE_TYP("1");						// set 黒伝は 1 を設定
					//ITEM_CD										// set 上部で設定済み
					//PLANT_CD										// set 上部で設定済み
					//WH_CD											// set 上部で設定済み
					//JOB_ODR_CD									// set 上部で設定済み
					info.setRCV_ISSUE_QTY(strNewStock);				// set 新在庫数を設定
					info.setSAVE_STOCK_HAND_QTY("0");				// set 前後数セット用に0をセット
					info.setRCV_ISSUE_DATE(strInvDate);				// set 棚卸日を設定
					info.setRCV_ISSUE_GNR_TYP("28");				// set 28（棚卸調整出庫）を設定
					info.setSTOCK_UPD_TYP("2");						// set 2（更新済み）を設定
					info.setRCV_ISSUE_CMPLT_FLG("0");				// set 0（未）を設定
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD()); // set 会社コード
					intResultCount = _invUpdateAccessor.insertLotRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1159)⑥ 保管区別入出庫登録終了（黒伝） - 品目在庫が存在する。登録件数：" + intResultCount);
				}
				else
				{
					// 品目在庫が存在しない

					//-------------------------------------------
					// ⑤-2 ロット別品目在庫登録（新在庫数反映）
					//-------------------------------------------
					System.out.println("(SBM1174)⑤-2 ロット別品目在庫登録 - 品目在庫が存在しない");
					//ITEM_CD		// 上部で設定済み
					//WH_CD			// 上部で設定済み
					//PLANT_CD		// 上部で設定済み
					info.setSTOCK_ON_HAND_QTY(strNewStock);
					intResultCount = _invUpdateAccessor.insertLotStockTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1175)⑤-2ロット別品目在庫登録終了 - 品目在庫が存在しない。登録件数：" + intResultCount);

					//-------------------------------
					// ⑥ ロット別入出庫登録（黒伝）
					//-------------------------------
					System.out.println("(SBM1176)⑥ ロット別入出庫登録（黒伝） - 品目在庫が存在しない");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// 入出庫管理番号の自動採番
					if(strRcvIssueCtrlCd == null)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set 採番後の入出庫管理番号を設定
					info.setRCV_ISSUE_TYP("1");							// set 黒伝は 1 を設定
					//ITEM_CD											// set 上部で設定済み
					//PLANT_CD											// set 上部で設定済み
					//WH_CD												// set 上部で設定済み
					//JOB_ODR_CD										// set 上部で設定済み
					info.setRCV_ISSUE_QTY(strNewStock);					// set 新在庫数を設定
					info.setSAVE_STOCK_HAND_QTY("0");					// set 前後数セット用に0をセット
					info.setRCV_ISSUE_DATE(strInvDate);					// set 棚卸日を設定
					info.setRCV_ISSUE_GNR_TYP("28");					// set 28（棚卸調整出庫）を設定
					info.setSTOCK_UPD_TYP("2");							// set 2（更新済み）を設定
					info.setRCV_ISSUE_CMPLT_FLG("0");					// set 0（未）を設定
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());  // set 会社コード
					intResultCount = _invUpdateAccessor.insertLotRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1177)⑥  ロット別入出庫登録終了（黒伝） - 品目在庫が存在しない。登録件数：" + intResultCount);
				}

				//-------------------------------------------
				// ⑦  ロット別品目棚卸更新（更新フラグ更新）
				//-------------------------------------------
				System.out.println("(SBM1178)⑦  ロット別品目棚卸更新");
				info.setINV_UPD_FLG("1");	// 1（済）を設定
				intResultCount = _invUpdateAccessor.updateLotInvTable(conn, info);
				if(intResultCount == -1)
				{
					// エラー
					_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
					bSuccess = false;
					break;
				}
				System.out.println("(SBM1179)⑦  ロット別品目棚卸更新終了。更新件数：" + intResultCount);

				// 更新レコード数カウント
				intUpdateCount++;
			}
		}

		// 処理成功の場合
		if(bSuccess == true)
		{
			// 処理成功
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// 詳細情報
				+ " (SBM1180)ロット別在庫更新レコード件数：[ " + intUpdateCount + " ]"
			);
		}
		return bSuccess;
	}
	////////////////////////////////////////////////////////////////////////////
	/**
	 * 保管区別製番在庫更新処理
	 *
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strInvDate	棚卸日
	 * @return	true:成功 / false:失敗
	 */
	public boolean updateJobOdrCdStock(
		IDbConnection conn, 
		String strInvDate)
	{
		InvInformation info = new InvInformation();	// 対象情報格納用
		boolean bSuccess = true;	// 処理成功フラグ
		int intUpdateCount = 0;		// 更新レコード数
		//会社コード取得
		MyCompanyStruct companystruct = new MyCompanyStruct();
		try {
			 companystruct = MyCompanyControl.getData(conn);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (DataNotFoundException e) {
			e.printStackTrace();
		}
		//---------------------------------------
		// ① 保管区別製番棚卸読込（排他モード）
		//---------------------------------------
		List listJobOdrCdInv = null;
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		listJobOdrCdInv = _invUpdateAccessor.readJobOdrCdInvTable4Update(conn, info);
		if(listJobOdrCdInv == null)
		{
			// エラー
			_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
			bSuccess = false;
		}

		// 処理成功の場合
		if(bSuccess == true)
		{
			boolean bIsStock;			// 在庫存在フラグ
			InvInformation infoTemp;	// レコード情報退避用
			List listTemp;				// リスト情報退避用
			String strRcvIssueCtrlCd;	// 自動採番コード退避用
			int intResultCount;			// 処理レコード数退避用
			String strStockOnHandQty;	// 在庫数退避用
			String strSumRcvIssueQty;	// 入出庫集計数退避用
			String strNewStock;			// 新在庫数退避用
			for(int i = 0; i < listJobOdrCdInv.size(); i++)
			{
				// 読込情報取得
				info = (InvInformation)listJobOdrCdInv.get(i);
				info.setINV_DATE(strInvDate);
				info.setPLANT_CD(_strPlantCd);
				System.out.println("(SBM1181)■■■■■ 更新対象保管区別製番棚卸レコード：" + (i+1) + " 件目 ■■■■■"
	+ "\nレコード情報"
	+ "\n             INV_DATE：" + info.getINV_DATE()
	+ "\n             PLANT_CD：" + info.getPLANT_CD()
	+ "\n              ITEM_CD：" + info.getITEM_CD()
	+ "\n                WH_CD：" + info.getWH_CD()
	+ "\n           JOB_ODR_CD：" + info.getJOB_ODR_CD()
	+ "\n     ACTUAL_STOCK_QTY：" + info.getACTUAL_STOCK_QTY()
	+ "\n FINAL_BOOK_STOCK_QTY：" + info.getFINAL_BOOK_STOCK_QTY()
);

				// -------------------------------------------------------
				// ② 保管区別入出庫読込（遅れ伝票の入出庫数を集計取得）
				// -------------------------------------------------------
				System.out.println("(SBM1149)② 保管区別入出庫読込");
				// INV_DATE // where 上部で設定済み
				// PLANT_CD // where 上部で設定済み
				// JOB_ODR_CD // where 上部で設定済み
				// ITEM_CD // where 上部で設定済み
				// WH_CD // where 上部で設定済み
				listTemp = _invUpdateAccessor.readRcvIssueTable(conn, info);
				if (listTemp == null) {
					// エラー
					_msg.addCopy(_invUpdateAccessor.getMessage()); // 処理結果メッセージ取得追加
					bSuccess = false;
					break;
				}
				// 遅れ伝票の入出庫集計数を取得
				strSumRcvIssueQty = "0"; // 入出庫集計数を0(ゼロ)で初期化
				if (listTemp.size() > 0) {
					// データが存在した場合、集計数を取得
					infoTemp = (InvInformation) listTemp.get(0);
					strSumRcvIssueQty = infoTemp.getw_SUM_RCV_ISSUE_QTY();
				}
				System.out.println("(SBM1150)② 保管区別入出庫読込終了"
						+ "\n ｒ) w_SUM_RCV_ISSUE_QTY：" + strSumRcvIssueQty
						+ "\n 読込件数：" + listTemp.size());

				// 最終帳簿在庫数 + 遅れ伝票 <> 実棚数時、新在庫数を算出
				if(Calculate.compare(Calculate.add(info.getFINAL_BOOK_STOCK_QTY(), strSumRcvIssueQty), 
						info.getACTUAL_STOCK_QTY()) == 0) {
					continue;
				}

				//---------------------------------------
				// ③ 保管区別製番在庫読込（排他モード）
				//---------------------------------------
				System.out.println("(SBM1182)③ 保管区別製番在庫読込");
				//JOB_ODR_CD					// where 上部で設定済み
				//ITEM_CD						// where 上部で設定済み
				//WH_CD							// where 上部で設定済み
				info.setPLANT_CD(_strPlantCd);	// where
				listTemp = _invUpdateAccessor.readJobOdrCdStockTable4Update(conn, info);
				if(listTemp == null)
				{
					// エラー
					_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
					bSuccess = false;
					break;
				}
				// 製番在庫数取得
				strStockOnHandQty = "0";// 製番在庫数を0(ゼロ)で初期化
				bIsStock = false;		// 製番在庫存在フラグをなしで初期化
				if(listTemp.size() > 0)
				{
					// 製番在庫が存在する
					bIsStock = true;
					infoTemp = (InvInformation)listTemp.get(0);
					strStockOnHandQty = infoTemp.getSTOCK_ON_HAND_QTY();
				}
				System.out.println("(SBM1183)③ 保管区別製番在庫読込終了"
	+ "\n r) STOCK_ON_HAND_QTY：" + strStockOnHandQty
	+ "\n 読込件数：" + listTemp.size()
);
				
				//-----------------
				// ④ 新在庫数算出
				//-----------------
				info.setSTOCK_ON_HAND_QTY(strStockOnHandQty);
				info.setw_SUM_RCV_ISSUE_QTY(strSumRcvIssueQty);
				strNewStock = calculateNewStock(info);	// 新在庫数取得
				System.out.println("(SBM1153)④ 新在庫数算出後"
	+ "\n セーブ在庫(FINAL_BOOK_STOCK_QTY)：" + info.getFINAL_BOOK_STOCK_QTY()
	+ "\n 今在庫(STOCK_ON_HAND_QTY)：" + info.getSTOCK_ON_HAND_QTY()
	+ "\n 遅れ伝票(SUM_RCV_ISSUE_QTY)：" + info.getw_SUM_RCV_ISSUE_QTY()
	+ "\n 新在庫：" + strNewStock);

				if(bIsStock == true)
				{
					// 製番在庫が存在する

					//-------------------------------------------
					// ⑤-1 保管区別製番在庫更新（新在庫数反映）
					//-------------------------------------------
					System.out.println("(SBM1184)⑤-1 保管区別製番在庫更新 - 製番在庫が存在する");
					info.setSTOCK_ON_HAND_QTY(strNewStock);	// set
					//JOB_ODR_CD							// where 上部で設定済み
					//ITEM_CD								// where 上部で設定済み
					//WH_CD									// where 上部で設定済み
					//PLANT_CD								// where 上部で設定済み
					intResultCount = _invUpdateAccessor.updateJobOdrCdStockTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1185)⑤-1 保管区別製番在庫更新終了 - 製番在庫が存在する。更新件数：" + intResultCount);

					//-------------------------------
					// ⑥ 保管区別入出庫登録（赤伝）
					//-------------------------------
					System.out.println("(SBM1186)⑥ 保管区別入出庫登録（赤伝） - 製番在庫が存在する");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// 入出庫管理番号の自動採番
					if(strRcvIssueCtrlCd == null)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);						// set 採番後の入出庫管理番号を設定
					info.setRCV_ISSUE_TYP("2");											// set 赤伝は 2 を設定
					//ITEM_CD															// set 上部で設定済み
					//PLANT_CD															// set 上部で設定済み
					//WH_CD																// set 上部で設定済み
					//JOB_ODR_CD														// set 上部で設定済み
					info.setRCV_ISSUE_QTY(Calculate.multiply(strStockOnHandQty, "-1"));	// set 更新前の製番手持在庫数をマイナス変換
					info.setSAVE_STOCK_HAND_QTY(strStockOnHandQty);							// set 前後数セット用に更新前手持ち在庫数をセット
					info.setRCV_ISSUE_DATE(strInvDate);									// set 棚卸日を設定
					info.setRCV_ISSUE_GNR_TYP("28");									// set 28（棚卸調整出庫）を設定
					info.setSTOCK_UPD_TYP("2");											// set 2（更新済み）を設定
					info.setRCV_ISSUE_CMPLT_FLG("0");									// set 0（未）を設定
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());                  // set 会社コード
					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1187)⑥ 保管区別入出庫登録終了（赤伝） - 製番在庫が存在する。登録件数：" + intResultCount);

					//-------------------------------
					// ⑥ 保管区別入出庫登録（黒伝）
					//-------------------------------
					System.out.println("(SBM1188)⑥ 保管区別入出庫登録（黒伝） - 製番在庫が存在する");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// 入出庫管理番号の自動採番
					if(strRcvIssueCtrlCd == null)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set 採番後の入出庫管理番号を設定
					info.setRCV_ISSUE_TYP("1");						// set 黒伝は 1 を設定
					//ITEM_CD										// set 上部で設定済み
					//PLANT_CD										// set 上部で設定済み
					//WH_CD											// set 上部で設定済み
					//JOB_ODR_CD									// set 上部で設定済み
					info.setRCV_ISSUE_QTY(strNewStock);				// set 新在庫数設定
					info.setSAVE_STOCK_HAND_QTY("0");				// set 前後数セット用に0をセット
					info.setRCV_ISSUE_DATE(strInvDate);				// set 棚卸日を設定
					info.setRCV_ISSUE_GNR_TYP("28");				// set 28（棚卸調整出庫）を設定
					info.setSTOCK_UPD_TYP("2");						// set 2（更新済み）を設定
					info.setRCV_ISSUE_CMPLT_FLG("0");				// set 0（未）を設定
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD()); // set 会社コード
					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1189)⑥ 保管区別入出庫登録終了（黒伝） - 製番在庫が存在する。登録件数：" + intResultCount);
				}
				else
				{
					// 製番在庫が存在しない

					//-------------------------------------------
					// ⑤-2 保管区別製番在庫登録（新在庫数反映）
					//-------------------------------------------
					System.out.println("(SBM1190)⑤-2 保管区別製番在庫登録 - 製番在庫が存在しない");
					//JOB_ODR_CD							// set 上部で設定済み
					//ITEM_CD								// set 上部で設定済み
					//WH_CD									// set 上部で設定済み
					//PLANT_CD								// set 上部で設定済み
					info.setSTOCK_ON_HAND_QTY(strNewStock);	// set
					intResultCount = _invUpdateAccessor.insertJobOdrCdStockTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1191)⑤-2 保管区別製番在庫登録終了 - 製番在庫が存在しない。登録件数：" + intResultCount);

					//-------------------------------
					// ⑥ 保管区別入出庫登録（黒伝）
					//-------------------------------
					System.out.println("(SBM1192)⑥ 保管区別入出庫登録（黒伝） - 製番在庫が存在しない");
					strRcvIssueCtrlCd = _invUpdateAccessor.getRcvIssueCtrlCd(conn);	// 入出庫管理番号の自動採番
					if(strRcvIssueCtrlCd == null)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					info.setRCV_ISSUE_CTRL_CD(strRcvIssueCtrlCd);	// set 採番後の入出庫管理番号を設定
					info.setRCV_ISSUE_TYP("1");						// set 黒伝は 1 を設定
					//ITEM_CD										// set 上部で設定済み
					//PLANT_CD										// set 上部で設定済み
					//WH_CD											// set 上部で設定済み
					//JOB_ODR_CD									// set 上部で設定済み
					info.setRCV_ISSUE_QTY(strNewStock);				// set 新在庫数を設定
					info.setSAVE_STOCK_HAND_QTY("0");				// set 前後数セット用に0をセット
					info.setRCV_ISSUE_DATE(strInvDate);				// set 棚卸日を設定
					info.setRCV_ISSUE_GNR_TYP("28");				// set 28（棚卸調整出庫）を設定
					info.setSTOCK_UPD_TYP("2");						// set 2（更新済み）を設定
					info.setRCV_ISSUE_CMPLT_FLG("0");				// set 0（未）を設定
				    info.setCOMPANY_CD(companystruct.getCOMPANY_CD());   // set 会社コード
					intResultCount = _invUpdateAccessor.insertRcvIssueTable(conn, info);
					if(intResultCount == -1)
					{
						// エラー
						_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
						bSuccess = false;
						break;
					}
					System.out.println("(SBM1193)⑥ 保管区別入出庫登録終了（黒伝） - 製番在庫が存在しない。登録件数：" + intResultCount);
				}

				//-------------------------------------------
				// ⑦ 保管区別製番棚卸更新（更新フラグ更新）
				//-------------------------------------------
				System.out.println("(SBM1164)⑦ 保管区別品目棚卸更新");
				info.setINV_UPD_FLG("1");	// 1（済）を設定
				intResultCount = _invUpdateAccessor.updateJobOdrCdInvTable(conn, info);
				if(intResultCount == -1)
				{
					// エラー
					_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
					bSuccess = false;
					break;
				}
				System.out.println("(SBM1165)⑦ 保管区別品目棚卸更新終了。更新件数：" + intResultCount);

				// 更新レコード数カウント
				intUpdateCount++;
			}
		}

		// 処理成功の場合
		if(bSuccess == true)
		{
			// 処理成功
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// 詳細情報
				+ "(SBM1194)保管区別製番在庫更新レコード件数：[ " + intUpdateCount + " ]"
			);
		}
		return bSuccess;
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
		boolean bSuccess = true;	// 処理成功フラグ
		int intUpdateCount = 0;		// 更新レコード数

		//----------------------------
		// 棚卸制御読込（排他モード）
		//----------------------------
		info.setINV_DATE(strInvDate);	// where
		info.setPLANT_CD(_strPlantCd);	// where
		List listInvCtrl = _invUpdateAccessor.readInvCtrlTable4Update(conn, info);
		if(listInvCtrl == null)
		{
			// エラー
			_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
			bSuccess = false;
		}

		// 処理成功の場合
		if(bSuccess == true)
		{
			//--------------
			// 棚卸制御更新
			//--------------
			info.setINV_STS_TYP("2");		// set 2（棚卸更新済）を設定
			info.setINV_DATE(strInvDate);	// where
			info.setPLANT_CD(_strPlantCd);	// where
			intUpdateCount = _invUpdateAccessor.updateInvCtrlTable(conn, info);
			if(intUpdateCount == -1)
			{
				// エラー
				_msg.addCopy(_invUpdateAccessor.getMessage());	// 処理結果メッセージ取得追加
				bSuccess = false;
			}
		}

		// 処理成功の場合
		if(bSuccess == true)
		{
			// 処理成功
			_msg.add(InvMessageControl.TYP_SUCCESS, "", ""
				// 詳細情報
				+ "(SBM1195)棚卸制御更新レコード件数：[ " + intUpdateCount + " ]"
			);
		}
		return bSuccess;
	}
}
