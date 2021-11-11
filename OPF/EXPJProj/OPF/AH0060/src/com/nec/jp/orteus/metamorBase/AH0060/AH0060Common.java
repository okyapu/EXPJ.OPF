//------------------------------------------------------------------------------
// (#)AH0060Common.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AH0060;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboStruct;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboDataAccessController;
import com.nec.jp.orteus.metamorBase.util.Combo.ComboException;

/**
 * 実棚一覧専用クラス<br>
 *
 * @author  M.Isoda
 * @version 1.00
*/
public class AH0060Common
{
	/** DBとのコネクション */
	private IDbConnection _conn = null;

	/** 工場コード格納用 */
	private String _strPlantCd = null;

	/** 棚卸日格納用 */
	private String _strInvDate = null;

	//--------------------------------------------------------------------------
	// 構築

	/**
	 * コンストラクタ
	*/
	public AH0060Common(){ clear(); }

	//--------------------------------------------------------------------------
	// 操作

	/**
	 * 初期設定<br>
	 *<br>
	 * @param	conn		DBアクセス用のコネクション
	 * @param	strPlantCd	工場コード
	 * @return	true:成功 / false:失敗
	 */
	public boolean init(IDbConnection conn, String strPlantCd)
	{
		// クリア
		clear();

		// 工場コード設定
		setPlantCd(strPlantCd);

		// 処理成功フラグ初期化
		boolean bSuccess = true;
		try
		{
			// コンボデータの取得
			ComboDataAccessController controller = new ComboDataAccessController(conn);
			_MRP_FLG	 = controller.getData("MRP_FLG");		// 所要量計算対象フラグ
			_WH_TYP		 = controller.getData("WH_TYP");		// 倉庫区分
			_MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");	// 品目手配区分
			_ABC_TYP	 = controller.getData("ABC_TYP");		// 棚卸区分

		}catch(SQLException e){
			// エラーフラグ設定
			bSuccess = false;

		}catch(ComboException e){
			// エラーフラグ設定
			bSuccess = false;
		}

		return bSuccess;
	}

	/**
	 * 工場コード設定<br>
	 *<br>
	 * @param	strPlantCd	工場コード
	 * @return	なし
	 */
	public void setPlantCd(String strPlantCd)
	{
		_strPlantCd = strPlantCd;
	}

	/**
	 * 工場コード取得<br>
	 *<br>
	 * @return	工場コード
	 */
	public String getPlantCd()
	{
		return _strPlantCd;
	}

	/**
	 * コネクション設定<br>
	 *<br>
	 * @param	connect	コネクション
	 */
	public void setConnection(IDbConnection connect)
	{
		_conn = connect;
	}

	/**
	 * 棚卸日設定<br>
	 *<br>
	 * @param	strInvDate	棚卸日
	 */
	public void setINV_DATE(String strInvDate)
	{
		_strInvDate = strInvDate;
	}

	/**
	 * 棚卸日取得<br>
	 *<br>
	 * @return	棚卸日
	 */
	public String getINV_DATE()
	{
		return _strInvDate;
	}

	/**
	 * クリア<br>
	 *<br>
	 * @return	なし
	 */
	public void clear()
	{
		_conn = null;
		_strPlantCd = null;
		_strInvDate = null;
	}

	/**
	 * 実棚一覧表情報取得<br>
	 *<br>
	 * @param	conn				DBアクセス用のコネクション
	 * @param	strInvDate			棚卸日
	 * @param	intKindStock		在庫種類（品目：0 製番：1）
	 * @param	intKindSort			並び順種類（保管区順：0 品目順：1）
	 * @param	strItemCd			品目番号
	 * @param	strWhCd				保管区コード
	 * @param	strJobOdrCd			製番
	 * @param	strDefferenceRate	差異率
	 * @param	strAbcTyp			棚卸区分
	 * @return	情報一覧:成功 / null:失敗
	 */
	public List getData(
		IDbConnection conn, 
		String strInvDate, 
		int intKindStock, 
		int intKindSort,
		String strItemCd, 
		String strWhCd, 
		String strJobOdrCd,
		String strDefferenceRate,
		String strAbcTyp,
		String strStock_Lot_Cd) throws SQLException
	{
 		// コネクション設定
		setConnection(conn);

 		// 棚卸日をクラスメンバに設定
		setINV_DATE(strInvDate);

		// SQL作成
		String strSQL = makeSQL(intKindStock, intKindSort);
		if(strSQL == null)
		{
			return null;
		}
		// SQL実行
		List listData = doSQL(	strSQL, 
								intKindStock, 
								strItemCd, 
								strWhCd, 
								strJobOdrCd, 
								strDefferenceRate,
								strAbcTyp,
								strStock_Lot_Cd);
		if(listData == null)
		{
			return null;
		}
		return listData;
	}

	//--------------------------------------------------------------------------
	//--------------------------------------------------------------------------
	//--------------------------------------------------------------------------

	/**
	 * SQL作成
	 *
	 * @param	intKindStock	在庫種類（品目：0 製番：1）
	 * @param	intKindSort		並び順種類（保管区順：0 品目順：1）
	 * @return	SQL文字列:成功 / null:失敗
	 */
	private String makeSQL(
		int intKindStock, 
		int intKindSort)
	{
		// SQL文字列格納用変数宣言
		String strSQL = null;

		// 基本SQL設定
		if(intKindStock == 0)
		{
			// 品目在庫
			strSQL = _sqlBASE_ITEM;

			// 並び順SQLを追加
			strSQL += "order by ";
			if(intKindSort == 0)
			{
				// 保管区順
				strSQL += _sqlORDERBY_ITEM_and_WH;
			}
			else
			{
				// 品目順
				strSQL += _sqlORDERBY_ITEM_and_ITEM;
			}
		}
		else if (intKindStock == 1) {		
			// 製番在庫
			strSQL = _sqlBASE_JOB_ODR_CD;

			// 並び順SQLを追加
			strSQL += "order by ";
			if(intKindSort == 0)
			{
				// 保管区順
				strSQL += _sqlORDERBY_JOB_ODR_and_WH;
			}
			else
			{
				// 品目順
				strSQL += _sqlORDERBY_JOB_ODR_and_ITEM;
			}
		}
		else if (intKindStock == 2) {
			//Lot在庫
			strSQL = _sqlBASE_Lot;

			// 並び順SQLを追加
			strSQL += "order by ";
			if(intKindSort == 0)
			{
				// 保管区順
				strSQL += _sqlORDERBY_Lot_and_WH;
			}
			else
			{
				// 品目順
				strSQL += _sqlORDERBY_Lot_and_ITEM;
			}
		}
		return strSQL;
	}

	/**
	 * 情報取得SQL実行
	 *
	 * @param	strSQL				実行SQL
	 * @param	intKindStock		在庫種類（品目：0 製番：1）
	 * @param	strItemCd			品目番号
	 * @param	strWhCd				保管区コード
	 * @param	strJobOdrCd			製番
	 * @param	strDefferenceRate	差異率
	 * @param	strAbcTyp			棚卸区分
	 * @return	情報一覧:成功 / null:失敗
	 */
	private List doSQL(
		String strSQL, 
		int intKindStock, 
		String strItemCd, 
		String strWhCd, 
		String strJobOdrCd, 
		String strDefferenceRate,
		String strAbcTyp,
		String strStock_Lot_Cd) throws SQLException
	{
		List listData = new ArrayList(0);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try {
			stmt = (_conn.getConn()).prepareStatement(strSQL);
			if(intKindStock == 0) {
				// 品目在庫
				stmt.setString(1, _strInvDate);
				stmt.setString(2, _strPlantCd);
				stmt.setString(3, strItemCd);
				stmt.setString(4, strWhCd);
				stmt.setString(5, strDefferenceRate);
				stmt.setString(6, strAbcTyp);
				rset = stmt.executeQuery();
				listData = getReadInfoList(rset, intKindStock);
			}
			else if(intKindStock == 1) {
				// 製番在庫
				stmt.setString(1, _strInvDate);
				stmt.setString(2, _strPlantCd);
				stmt.setString(3, strItemCd);
				stmt.setString(4, strWhCd);
				stmt.setString(5, strJobOdrCd);
				stmt.setString(6, strDefferenceRate);
				stmt.setString(7, strAbcTyp);
				rset = stmt.executeQuery();
				listData = getReadInfoList(rset, intKindStock);
			}
			else if (intKindStock == 2) {
                // Lot在庫
                stmt.setString(1, _strInvDate);
                stmt.setString(2, _strPlantCd);
                stmt.setString(3, strItemCd);
                stmt.setString(4, strWhCd);
                stmt.setString(5, strDefferenceRate);
                stmt.setString(6, strAbcTyp);
                stmt.setString(7, strStock_Lot_Cd);
                rset = stmt.executeQuery();
                listData = getReadInfoList(rset, intKindStock);				
			}
		} finally{
			closeResultSet(rset);
			closePreparedStatement(stmt);
		}
		return listData;
	}

	/**
	 * 読込データ取得
	 *
	 * @param	rset			対象ResultSet
	 * @param	intKindStock	在庫種類
	 * @return	SQL文字列:成功 / null:失敗
	 */
	private List getReadInfoList(ResultSet rset, int intKindStock) throws SQLException
	{
		List listData = new ArrayList(0);
		while(rset.next() == true)
		{
			AH0060010Struct info = new AH0060010Struct();
			if(intKindStock == 0) {
				// 品目在庫
				info.setINV_DATE(rset.getString(1));
				info.setPLANT_CD(rset.getString(2));
				info.setPLANT_NAME(rset.getString(3));
				info.setWH_CD(rset.getString(4));
				info.setWH_NAME(rset.getString(5));
				info.setITEM_CD(rset.getString(6));
				info.setITEM_NAME(rset.getString(7));
				info.setFINAL_BOOK_STOCK_QTY(rset.getString(8));
				info.setACTUAL_STOCK_QTY(rset.getString(9));
				info.setSTOCK_UNIT(rset.getString(10));
				info.setdifference_rate(rset.getString(11));
				info.setSAFETY_STOCK(rset.getString(12));
				info.setMRP_ODR_TYP(rset.getString(13));
				info.setMRP_FLG(rset.getString(14));
				info.setWH_TYP(rset.getString(15));
				info.setVEND_CD(rset.getString(16));
				info.setVEND_ANAME(rset.getString(17));
				info.setABC_TYP(rset.getString(18));
			}
			else if (intKindStock == 1) {
				// 製番在庫
				info.setINV_DATE(rset.getString(1));
				info.setPLANT_CD(rset.getString(2));
				info.setPLANT_NAME(rset.getString(3));
				info.setWH_CD(rset.getString(4));
				info.setWH_NAME(rset.getString(5));
				info.setITEM_CD(rset.getString(6));
				info.setITEM_NAME(rset.getString(7));
				info.setJOB_ODR_CD(rset.getString(8));
				info.setFINAL_BOOK_STOCK_QTY(rset.getString(9));
				info.setACTUAL_STOCK_QTY(rset.getString(10));
				info.setSTOCK_UNIT(rset.getString(11));
				info.setdifference_rate(rset.getString(12));
				info.setSAFETY_STOCK(rset.getString(13));
				info.setMRP_ODR_TYP(rset.getString(14));
				info.setMRP_FLG(rset.getString(15));
				info.setWH_TYP(rset.getString(16));
				info.setVEND_CD(rset.getString(17));
				info.setVEND_ANAME(rset.getString(18));
				info.setABC_TYP(rset.getString(19));
			}
			else if (intKindStock == 2) {
				// Lot在庫
                info.setINV_DATE(rset.getString(1));
                info.setPLANT_CD(rset.getString(2));
                info.setPLANT_NAME(rset.getString(3));
                info.setWH_CD(rset.getString(4));
                info.setWH_NAME(rset.getString(5));
                info.setITEM_CD(rset.getString(6));
                info.setITEM_NAME(rset.getString(7));
                info.setFINAL_BOOK_STOCK_QTY(rset.getString(8));
                info.setACTUAL_STOCK_QTY(rset.getString(9));
                info.setSTOCK_UNIT(rset.getString(10));
                info.setdifference_rate(rset.getString(11));               
                info.setMRP_ODR_TYP(rset.getString(12));
                info.setMRP_FLG(rset.getString(13));
                info.setWH_TYP(rset.getString(14));
                info.setVEND_CD(rset.getString(15));
                info.setVEND_ANAME(rset.getString(16));
                info.setABC_TYP(rset.getString(17));
                info.setl_STOCK_LOT_CD(rset.getString(18));			
			}
			// 区分コードから区分名取得設定
			info.setw_MRP_ODR_TYP(getMRP_ODR_TYP_name(info.getMRP_ODR_TYP()));
			info.setw_MRP_FLG(getMRP_FLG_name(info.getMRP_FLG()));
			info.setw_WH_TYP(getWH_TYP_name(info.getWH_TYP()));
			info.setw_ABC_TYP(getABC_TYP_name(info.getABC_TYP()));

			listData.add(info);
		}
		return listData;
	}

	//------------ コンボボックスデータ--------------------------------------

	/**
	 * 区分名取得（共通）
	 *
	 * @param	comboStruct	区分情報リスト
	 * @param	strTyp		区分コード
	 * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
	 */
	private String getTypName(ComboStruct comboStruct, String strTyp)
	{
		String strTypName = strTyp;
		if((comboStruct != null) && (strTyp != null))
		{
			for(int i = 0; i < comboStruct.getValList().size(); i++)
			{
				if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true)
				{
					strTypName = (String)(comboStruct.getExplanList().get(i));
					break;
				}
			}
		}
		return strTypName;
	}

	/** 所要量計算対象フラグ */
	private ComboStruct _MRP_FLG = new ComboStruct();

	/**
	 * 所要量計算対象フラグ内容取得
	 *
	 * @param	typ		区分コード
	 * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
	 */
	private String getMRP_FLG_name(String typ)
	{
		return (getTypName(_MRP_FLG, typ));
	}

	/** 倉庫区分 */
	private ComboStruct _WH_TYP = new ComboStruct();

	/**
	 * 倉庫区分名取得
	 *
	 * @param	typ		区分コード
	 * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
	 */
	private String getWH_TYP_name(String typ)
	{
		return (getTypName(_WH_TYP, typ));
	}

	/** 品目手配区分 */
	private ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/**
	 * 品目手配区分名取得
	 *
	 * @param	typ		区分コード
	 * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
	 */
	private String getMRP_ODR_TYP_name(String typ)
	{
		return (getTypName(_MRP_ODR_TYP, typ));
	}

	/** 棚卸区分 */
	private ComboStruct _ABC_TYP = new ComboStruct();

	/**
	 * 棚卸区分名取得
	 *
	 * @param	typ		区分コード
	 * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
	 */
	private String getABC_TYP_name(String typ)
	{
		return (getTypName(_ABC_TYP, typ));
	}

	/**
	 * プリペアドステートメントを閉じる
	 *
	 * @param	statement	閉じる対象のステートメント
	 */
	private void closePreparedStatement(PreparedStatement statement)
	{
		if(statement == null)  return;
		try{
			statement.close();
			statement = null;
		}
		catch (SQLException e){}
	}

	/**
	 * リザルトセットを閉じる
	 *
	 * @param	resultset	閉じる対象のリザルトセット
	 */
	private void closeResultSet(ResultSet resultset)
	{
		if(resultset == null)  return;
		try{
			resultset.close();
			resultset = null;
		}
		catch (SQLException e){}
	}

	//--------------------------------------------------------------------------
	// SQL定義

	/** 品目在庫用基本SQL */
	private String _sqlBASE_ITEM = ""
		+"select "
		+" TO_CHAR(T_ITEM_INV.INV_DATE, 'YYYY/MM/DD') as INV_DATE, "
		+" T_ITEM_INV.PLANT_CD as PLANT_CD, "
		+" M_PLANT.PLANT_NAME as PLANT_NAME, "
		+" T_ITEM_INV.WH_CD as WH_CD, "
		+" M_WH.WH_NAME as WH_NAME, "
		+" T_ITEM_INV.ITEM_CD as ITEM_CD, "
		+" M_ITEM.ITEM_NAME as ITEM_NAME, "
		+" TO_CHAR(T_ITEM_INV.FINAL_BOOK_STOCK_QTY,'FM999999999999999990.0999') as FINAL_BOOK_STOCK_QTY, "
		+" TO_CHAR(T_ITEM_INV.ACTUAL_STOCK_QTY,'FM999999999999999990.0999') as ACTUAL_STOCK_QTY, "
		+" M_ITEM.STOCK_UNIT as STOCK_UNIT, "
		+" TO_CHAR(DECODE(FINAL_BOOK_STOCK_QTY,0,DECODE(ACTUAL_STOCK_QTY,0,0,100), TRUNC(((ACTUAL_STOCK_QTY/FINAL_BOOK_STOCK_QTY)-1)*100)),'FM999999999999999990') as DIFFERENCE_RATE, "
		+" TO_CHAR(M_ITEM.SAFETY_STOCK,'FM999999999999999990.0999') as SAFETY_STOCK, "
		+" M_ITEM.MRP_ODR_TYP as MRP_ODR_TYP, "
		+" M_WH.MRP_FLG as MRP_FLG, "
		+" M_WH.WH_TYP as WH_TYP, "
		+" M_WH.VEND_CD as VEND_CD, "
		+" M_VEND_CTRL.VEND_ANAME as VEND_ANAME, "
		+" M_ITEM.ABC_TYP as ABC_TYP "
		+"from "
		+" T_ITEM_INV, "
		+" M_PLANT, "
		+" M_WH, "
		+" M_ITEM, "
		+" M_VEND_CTRL "
		+"where "
		+" T_ITEM_INV.ITEM_CD = M_ITEM.ITEM_CD "
		+" and T_ITEM_INV.PLANT_CD = M_PLANT.PLANT_CD "
		+" and T_ITEM_INV.WH_CD = M_WH.WH_CD "
		+" and M_WH.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
		+" and M_WH.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
		+" and T_ITEM_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
		+" and T_ITEM_INV.PLANT_CD = ? "
		+" and T_ITEM_INV.ITEM_CD like NVL(?,'%') "
		+" and T_ITEM_INV.WH_CD like NVL(?,'%') "
		+" and DECODE(FINAL_BOOK_STOCK_QTY,0,DECODE(ACTUAL_STOCK_QTY,0,0,100),ABS(TRUNC(((ACTUAL_STOCK_QTY/FINAL_BOOK_STOCK_QTY)-1)*100))) >= ABS(NVL(?,0)) "
		+" and M_ITEM.ABC_TYP like NVL(?,'%') "
		+" and M_ITEM.ABC_TYP <> 9 ";

	/** 製番在庫用基本SQL */
	private String _sqlBASE_JOB_ODR_CD = ""
		+"select "
		+" TO_CHAR(T_JOB_ODR_CD_INV.INV_DATE, 'YYYY/MM/DD') as INV_DATE, "
		+" T_JOB_ODR_CD_INV.PLANT_CD as PLANT_CD, "
		+" M_PLANT.PLANT_NAME as PLANT_NAME, "
		+" T_JOB_ODR_CD_INV.WH_CD as WH_CD, "
		+" M_WH.WH_NAME as WH_NAME, "
		+" T_JOB_ODR_CD_INV.ITEM_CD as ITEM_CD, "
		+" M_ITEM.ITEM_NAME as ITEM_NAME, "
		+" T_JOB_ODR_CD_INV.JOB_ODR_CD as JOB_ODR_CD, "
		+" TO_CHAR(T_JOB_ODR_CD_INV.FINAL_BOOK_STOCK_QTY,'FM999999999999999990.0999') as FINAL_BOOK_STOCK_QTY, "
		+" TO_CHAR(T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY,'FM999999999999999990.0999') as ACTUAL_STOCK_QTY, "
		+" M_ITEM.STOCK_UNIT as STOCK_UNIT, "
		+" TO_CHAR(DECODE(FINAL_BOOK_STOCK_QTY,0,DECODE(ACTUAL_STOCK_QTY,0,0,100), TRUNC(((ACTUAL_STOCK_QTY/FINAL_BOOK_STOCK_QTY)-1)*100)),'FM999999999999999990') as DIFFERENCE_RATE, "
		+" TO_CHAR(M_ITEM.SAFETY_STOCK,'FM999999999999999990.0999') as SAFETY_STOCK, "
		+" M_ITEM.MRP_ODR_TYP as MRP_ODR_TYP, "
		+" M_WH.MRP_FLG as MRP_FLG, "
		+" M_WH.WH_TYP as WH_TYP, "
		+" M_WH.VEND_CD as VEND_CD, "
		+" M_VEND_CTRL.VEND_ANAME as VEND_ANAME, "
		+" M_ITEM.ABC_TYP as ABC_TYP "
		+"from "
		+" T_JOB_ODR_CD_INV, "
		+" M_PLANT, "
		+" M_WH, "
		+" M_ITEM, "
		+" M_VEND_CTRL "
		+"where "
		+" T_JOB_ODR_CD_INV.ITEM_CD = M_ITEM.ITEM_CD "
		+" and T_JOB_ODR_CD_INV.PLANT_CD = M_PLANT.PLANT_CD "
		+" and T_JOB_ODR_CD_INV.WH_CD = M_WH.WH_CD "
		+" and M_WH.VEND_CD = M_VEND_CTRL.VEND_CD(+) "
		+" and M_WH.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) "
		+" and T_JOB_ODR_CD_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') "
		+" and T_JOB_ODR_CD_INV.PLANT_CD = ? "
		+" and T_JOB_ODR_CD_INV.ITEM_CD like NVL(?,'%') "
		+" and T_JOB_ODR_CD_INV.WH_CD like NVL(?,'%') "
		+" and T_JOB_ODR_CD_INV.JOB_ODR_CD like NVL(?,'%') "
		+" and DECODE(FINAL_BOOK_STOCK_QTY,0,DECODE(ACTUAL_STOCK_QTY,0,0,100),ABS(TRUNC(((ACTUAL_STOCK_QTY/FINAL_BOOK_STOCK_QTY)-1)*100))) >= ABS(NVL(?,0)) "
		+" and M_ITEM.ABC_TYP like NVL(?,'%') "
		+" and M_ITEM.ABC_TYP <> 9 ";
	/** Lot在庫用基本SQL */
	private String _sqlBASE_Lot = "" +
		"select " +
		" TO_CHAR(T_LOT_INV.INV_DATE, 'YYYY/MM/DD') as INV_DATE, " +
		" T_LOT_INV.PLANT_CD as PLANT_CD, " +
		" M_PLANT.PLANT_NAME as PLANT_NAME, " +
		" T_LOT_INV.WH_CD as WH_CD, " +
		" M_WH.WH_NAME as WH_NAME, " +
		" T_LOT_INV.ITEM_CD as ITEM_CD, " +
		" M_ITEM.ITEM_NAME as ITEM_NAME, " +
		" TO_CHAR(T_LOT_INV.FINAL_BOOK_STOCK_QTY,'FM999999999999999990.0999') as FINAL_BOOK_STOCK_QTY, " +
		" TO_CHAR(T_LOT_INV.ACTUAL_STOCK_QTY,'FM999999999999999990.0999') as ACTUAL_STOCK_QTY, " +
		" M_ITEM.STOCK_UNIT as STOCK_UNIT, " +
		" TO_CHAR(DECODE(T_LOT_INV.FINAL_BOOK_STOCK_QTY,0,DECODE(T_LOT_INV.ACTUAL_STOCK_QTY,0,0,100), TRUNC(((T_LOT_INV.ACTUAL_STOCK_QTY/T_LOT_INV.FINAL_BOOK_STOCK_QTY)-1)*100)),'FM999999999999999990') as DIFFERENCE_RATE," +
		" M_ITEM.MRP_ODR_TYP as MRP_ODR_TYP, " +
		" M_WH.MRP_FLG as MRP_FLG, " +
		" M_WH.WH_TYP as WH_TYP, " +
		" M_WH.VEND_CD as VEND_CD, " +
		" M_VEND_CTRL.VEND_ANAME as VEND_ANAME, " +
		" M_ITEM.ABC_TYP as ABC_TYP, " +
		" T_LOT_INV.LOT_NO as LOT_NO " +
		"from " +
		" T_LOT_INV, " +
		" M_PLANT, " +
		" M_WH, " +
		" M_ITEM, " +
		" M_VEND_CTRL " +
		"where " +
		" T_LOT_INV.ITEM_CD = M_ITEM.ITEM_CD " +
		" and T_LOT_INV.PLANT_CD = M_PLANT.PLANT_CD " +
		" and T_LOT_INV.WH_CD = M_WH.WH_CD " +
		" and M_WH.VEND_CD = M_VEND_CTRL.VEND_CD(+) " +
		" and M_WH.COMPANY_CD = M_VEND_CTRL.COMPANY_CD(+) " +
		" and T_LOT_INV.INV_DATE = TO_DATE(?, 'YYYY/MM/DD') " +
		" and T_LOT_INV.PLANT_CD = ? " +
		" and T_LOT_INV.ITEM_CD like NVL(?,'%') " +
		" and T_LOT_INV.WH_CD like NVL(?,'%') " +
		" and DECODE(T_LOT_INV.FINAL_BOOK_STOCK_QTY,0,DECODE(T_LOT_INV.ACTUAL_STOCK_QTY,0,0,100),ABS(TRUNC(((T_LOT_INV.ACTUAL_STOCK_QTY/T_LOT_INV.FINAL_BOOK_STOCK_QTY)-1)*100))) >= ABS(NVL(?,0)) " +
		" and M_ITEM.ABC_TYP like NVL(?,'%') " +
        " and T_LOT_INV.LOT_NO like NVL(?,'%') " +
		" and M_ITEM.ABC_TYP <> 9 " ;
	////////////////////////////////////////////////////////////////////////////
	// 並び順SQL定義

	/** 品目在庫用並び順SQL（保管区順） */
	private String _sqlORDERBY_ITEM_and_WH = ""
		+" T_ITEM_INV.WH_CD, "
		+" T_ITEM_INV.ITEM_CD ";

	/** 品目在庫用並び順SQL（品目順） */
	private String _sqlORDERBY_ITEM_and_ITEM = ""
		+" T_ITEM_INV.ITEM_CD, "
		+" T_ITEM_INV.WH_CD ";

	/** 製番在庫用並び順SQL（保管区順） */
	private String _sqlORDERBY_JOB_ODR_and_WH = ""
		+" T_JOB_ODR_CD_INV.WH_CD, "
		+" T_JOB_ODR_CD_INV.ITEM_CD, "
		+" T_JOB_ODR_CD_INV.JOB_ODR_CD ";

	/** 製番在庫用並び順SQL（品目順） */
	private String _sqlORDERBY_JOB_ODR_and_ITEM = ""
		+" T_JOB_ODR_CD_INV.ITEM_CD, "
		+" T_JOB_ODR_CD_INV.JOB_ODR_CD, "
		+" T_JOB_ODR_CD_INV.WH_CD ";
	/** Lot在庫用並び順SQL（保管区順） */
	private String _sqlORDERBY_Lot_and_WH =""
		+" T_LOT_INV.WH_CD, "
		+" T_LOT_INV.ITEM_CD, "
        +" T_LOT_INV.LOT_NO ";
	
	/** Lot在庫用並び順SQL（品目順） */
	private String _sqlORDERBY_Lot_and_ITEM = ""
		+" T_LOT_INV.ITEM_CD, "
		+" T_LOT_INV.WH_CD, "
        +" T_LOT_INV.LOT_NO ";
}
