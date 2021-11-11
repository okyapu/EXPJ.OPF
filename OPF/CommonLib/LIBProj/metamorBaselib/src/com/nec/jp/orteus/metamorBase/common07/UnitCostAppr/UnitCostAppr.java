package com.nec.jp.orteus.metamorBase.common07.UnitCostAppr;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

public class UnitCostAppr {

	/**
	 * デフォルトコンストラクタ
	 */
	private UnitCostAppr() {
	}

	/**
	 * 指定のコネクションを持つオブジェクトを構築する
	 * 
	 * @param connect
	 *            コネクションがOPENされているIDbConnection
	 * @param userCd
	 *            ログインユーザのコード
	 * @param programId
	 *            プログラムID
	 */
	public UnitCostAppr(IDbConnection connect, String userCd, String programId,String installFlg) {
		conn = connect;
		this.userCd = userCd;
		this.programId = programId;
		this.jaInstallFlg = installFlg;
	}

	/**
	 * 読込処理のmainメソッド
	 * 
	 * @param plantCd
	 *            工場コード
	 * @param unitCostApprTyp
	 *            対象単価マスタ
	 * @param status
	 *            状態区分
	 * 
	 * @return resultList
	 * 
	 * @throws FoundationException
	 * @throws SQLException
	 */
	public List selectUnitCostAppr(String plantCd, String unitCostApprTyp, String status) throws SQLException, FoundationException {
		List resultList = null;
		UnitCostApprDBAccessor dbAccessor = new UnitCostApprDBAccessor(conn);
		switch (Integer.parseInt(unitCostApprTyp)) {
		// 購入単価承認依頼情報を抽出
		case 1:
			resultList = dbAccessor.selectM_PUCH_UNIT_COST_APPR(plantCd, status);
			break;
		// 支給品単価承認依頼情報を抽出
		case 2:
			resultList = dbAccessor.selectM_CONS_UNIT_COST_APPR(plantCd, status);
			break;
		// 外注単価承認依頼情報を抽出
		case 3:
			resultList = dbAccessor.selectM_SBCNT_UNIT_COST_APPR(plantCd, status);
			break;
		
		case 4:
			// 製品単価承認依頼情報を抽出
			if("0".equals(jaInstallFlg)){
				resultList = dbAccessor.selectM_UNIT_COST_APPR(status);
			}
			// 販売単価承認依頼情報を抽出
			else{
				resultList = dbAccessor.selectM_SALES_UNIT_COST_APPR(status);
			}
			break;
		}
		return resultList;
	}

	/**
	 * 承認処理のmainメソッド
	 * 
	 * @param unitCostApprTyp
	 *            対象単価マスタ
	 * @param companyCd
	 *            会社コード
	 * @param plantCd
	 *            工場コード
	 * @param vendCd
	 *            取引先コード
	 * @param itemCd
	 *            品目コード
	 * @param effPhaseInDate
	 *            有効開始日
	 * @param size
	 *            サイズ
	 * @param procCd
	 *            品目作別作業コード
	 * @param custCd
	 *            得意先コード
	 * 
	 * @return nRet 行数
	 * 
	 * @throws FoundationException
	 * @throws SQLException
	 */
	public int applyUnitCostAppr(int unitCostApprTyp, String companyCd, String plantCd, String vendCd, String itemCd, String purposeUnitPriceTyp, String effPhaseInDate, String size, String procCd, String custCd) throws SQLException, FoundationException {

		int nRet = 0;
		UnitCostApprDBAccessor dbAccessor = new UnitCostApprDBAccessor(conn);

		UnitCostApprStruct struct = new UnitCostApprStruct();
		// SYSTEM時刻の取得
		struct = dbAccessor.selectSYSDATE(struct);
		struct.setM_COMPANY_CD(companyCd);
		struct.setM_PLANT_CD(plantCd);
		struct.setM_VEND_CD(vendCd);
		struct.setM_ITEM_CD(itemCd);
		struct.setM_PURPOSE_UNIT_PRICE_TYP(purposeUnitPriceTyp);
		struct.setM_EFF_PHASE_IN_DATE(effPhaseInDate);
		struct.setM_SIZE(size);
		struct.setM_PROC_CD(procCd);
		struct.setM_CUST_CD(custCd);
		struct.setM_STATUS("3");
		struct.setM_APPR_BY(userCd);
		struct.setM_CREATED_BY(userCd);
		struct.setM_CREATED_PRG_NM(programId);
		struct.setM_UPDATED_BY(userCd);
		struct.setM_UPDATED_PRG_NM(programId);
		switch (unitCostApprTyp) {
		// 購入単価承認依頼情報を更新
		case 1:
			nRet = dbAccessor.updateM_PUCH_UNIT_COST_APPR(struct);
			// 購入単価承認依頼情報を抽出
			struct = dbAccessor.selectM_PUCH_UNIT_COST_APPR_record(struct);
			// 処理区分は登録の場合
			if ("1".equals(struct.getM_PROC_TYP())) {
				dbAccessor.insertM_PUCH_UNIT_COST(struct);
			}
			// 処理区分は更新の場合
			if ("2".equals(struct.getM_PROC_TYP())) {
				dbAccessor.updateM_PUCH_UNIT_COST(struct);
			}
			// 処理区分は削除の場合
			if ("3".equals(struct.getM_PROC_TYP())) {
				dbAccessor.deleteM_PUCH_UNIT_COST(struct);
				if(false == dbAccessor.checkM_PUCH_UNIT_COST_H(struct)){
					dbAccessor.deleteM_PUCH_UNIT_COST_H(struct);
				}
			}
			break;
		// 支給品単価承認依頼情報を更新
		case 2:
			nRet = dbAccessor.updateM_CONS_UNIT_COST_APPR(struct);
			// 支給品単価承認依頼情報を抽出
			struct = dbAccessor.selectM_CONS_UNIT_COST_APPR_record(struct);
			// 処理区分は登録の場合
			if ("1".equals(struct.getM_PROC_TYP())) {
				dbAccessor.insertM_CONS_UNIT_COST(struct);
			}
			// 処理区分は更新の場合
			if ("2".equals(struct.getM_PROC_TYP())) {
				dbAccessor.updateM_CONS_UNIT_COST(struct);
			}
			// 処理区分は削除の場合
			if ("3".equals(struct.getM_PROC_TYP())) {
				dbAccessor.deleteM_CONS_UNIT_COST(struct);
			}
			break;
		// 外注単価承認依頼情報を更新
		case 3:
			nRet = dbAccessor.updateM_SBCNT_UNIT_COST_APPR(struct);
			// 外注単価承認依頼情報を抽出
			struct = dbAccessor.selectM_SBCNT_UNIT_COST_APPR_record(struct);
			// 処理区分は登録の場合
			if ("1".equals(struct.getM_PROC_TYP())) {
				dbAccessor.insertM_SBCNT_UNIT_COST(struct);
			}
			// 処理区分は更新の場合
			if ("2".equals(struct.getM_PROC_TYP())) {
				dbAccessor.updateM_SBCNT_UNIT_COST(struct);
			}
			// 処理区分は削除の場合
			if ("3".equals(struct.getM_PROC_TYP())) {
				dbAccessor.deleteM_SBCNT_UNIT_COST(struct);
				if(false == dbAccessor.checkM_SBCNT_UNIT_COST_H(struct)){
					dbAccessor.deleteM_SBCNT_UNIT_COST_H(struct);
				}
			}
			break;
		// 製品単価承認依頼情報を更新
		case 4:
			// Explanner/Jの場合
			if("0".equals(jaInstallFlg)){
				nRet = dbAccessor.updateM_UNIT_COST_APPR(struct);
				// 製品単価承認依頼情報を抽出
				struct = dbAccessor.selectM_UNIT_COST_APPR_record(struct);
				// 処理区分は登録の場合
				if ("1".equals(struct.getM_PROC_TYP())) {
					dbAccessor.insertM_UNIT_COST(struct);
				}
				// 処理区分は更新の場合
				if ("2".equals(struct.getM_PROC_TYP())) {
					dbAccessor.updateM_UNIT_COST(struct);
				}
				// 処理区分は削除の場合
				if ("3".equals(struct.getM_PROC_TYP())) {
					dbAccessor.deleteM_UNIT_COST(struct);
				}
			}else{// Explanner/Jaの場合
				nRet = dbAccessor.updateM_SALES_UNIT_COST_APPR(struct);
				// 販売単価承認依頼情報を抽出
				struct = dbAccessor.selectM_SALES_UNIT_COST_APPR_record(struct);
				// 処理区分は登録の場合
				if ("1".equals(struct.getM_PROC_TYP())) {
					dbAccessor.insertM_SALES_UNIT_COST(struct);
				}
				// 処理区分は更新の場合
				if ("2".equals(struct.getM_PROC_TYP())) {
					dbAccessor.updateM_SALES_UNIT_COST(struct);
				}
				// 処理区分は削除の場合
				if ("3".equals(struct.getM_PROC_TYP())) {
					dbAccessor.deleteM_SALES_UNIT_COST(struct);
				}
			}
			
			break;

		}
		return nRet;
	}

	/**
	 * 保留処理のmainメソッド
	 * 
	 * @param unitCostApprTyp  対象単価マスタ
	 * @param companyCd  会社コード
	 * @param plantCd  工場コード
	 * @param vendCd  取引先コード
	 * @param itemCd  品目コード
	 * @param effPhaseInDate  有効開始日
	 * @param size  サイズ
	 * @param procCd  品目作別作業コード
	 * @param custCd  得意先コード
	 * 
	 * @param reserveCause  保留理由
	 * @return nRet  行数
	 * 
	 * @throws FoundationException
	 * @throws SQLException
	 */
	public int reserveUnitCostAppr(int unitCostApprTyp, String companyCd, String plantCd, String vendCd, String itemCd, String purposeUnitPriceTyp, String effPhaseInDate, String size, String procCd, String custCd, String reserveCause) throws SQLException, FoundationException {

		int nRet = 0;
		UnitCostApprDBAccessor dbAccessor = new UnitCostApprDBAccessor(conn);
		UnitCostApprStruct struct = new UnitCostApprStruct();
		// SYSTEM時刻の取得
		struct = dbAccessor.selectSYSDATE(struct);
		struct.setM_COMPANY_CD(companyCd);
		struct.setM_PLANT_CD(plantCd);
		struct.setM_VEND_CD(vendCd);
		struct.setM_ITEM_CD(itemCd);
		struct.setM_PURPOSE_UNIT_PRICE_TYP(purposeUnitPriceTyp);
		struct.setM_EFF_PHASE_IN_DATE(effPhaseInDate);
		struct.setM_SIZE(size);
		struct.setM_PROC_CD(procCd);
		struct.setM_CUST_CD(custCd);
		struct.setM_RESERVE_CAUSE(reserveCause);
		struct.setM_STATUS("2"); // 状態区分は２：保留
		struct.setM_APPR_BY(userCd);
		struct.setM_UPDATED_BY(userCd);
		struct.setM_UPDATED_PRG_NM(programId);
		switch (unitCostApprTyp) {
		// 購入単価承認依頼情報を保留
		case 1:
			nRet = dbAccessor.updateM_PUCH_UNIT_COST_APPR(struct);
			break;
		// 支給品単価承認依頼情報を保留
		case 2:
			nRet = dbAccessor.updateM_CONS_UNIT_COST_APPR(struct);
			break;
		// 外注単価承認依頼情報を保留
		case 3:
			nRet = dbAccessor.updateM_SBCNT_UNIT_COST_APPR(struct);
			break;
		// 製品単価承認依頼情報を保留
		case 4:
			// Explanner/Jの場合
			if("0".equals(jaInstallFlg)){
				nRet = dbAccessor.updateM_UNIT_COST_APPR(struct);
			}else{// Explanner/Jaの場合
				nRet = dbAccessor.updateM_SALES_UNIT_COST_APPR(struct);
			}
			
			break;

		}
		return nRet;
	}

	/**
	 * 保留解除処理のmainメソッド
	 * 
	 * @param unitCostApprTyp  対象単価マスタ
	 * @param companyCd  会社コード
	 * @param plantCd  工場コード
	 * @param vendCd  取引先コード
	 * @param itemCd  品目コード
	 * @param effPhaseInDate  有効開始日
	 * @param size  サイズ
	 * @param procCd  品目作別作業コード
	 * @param custCd  得意先コード
	 * 
	 * @return nRet  行数
	 * 
	 * @throws FoundationException
	 * @throws SQLException
	 */
	public int nreserveUnitCostAppr(int unitCostApprTyp,String companyCd, String plantCd, String vendCd, String itemCd, String purposeUnitPriceTyp, String effPhaseInDate, String size, String procCd, String custCd) throws SQLException, FoundationException {

		int nRet = 0;
		UnitCostApprDBAccessor dbAccessor = new UnitCostApprDBAccessor(conn);
		UnitCostApprStruct struct = new UnitCostApprStruct();
		// SYSTEM時刻の取得
		struct = dbAccessor.selectSYSDATE(struct);
		struct.setM_COMPANY_CD(companyCd);
		struct.setM_PLANT_CD(plantCd);
		struct.setM_VEND_CD(vendCd);
		struct.setM_ITEM_CD(itemCd);
		struct.setM_PURPOSE_UNIT_PRICE_TYP(purposeUnitPriceTyp);
		struct.setM_EFF_PHASE_IN_DATE(effPhaseInDate);
		struct.setM_SIZE(size);
		struct.setM_PROC_CD(procCd);
		struct.setM_CUST_CD(custCd);
		struct.setM_STATUS("1");
		struct.setM_UPDATED_BY(userCd);
		struct.setM_UPDATED_PRG_NM(programId);
		switch (unitCostApprTyp) {
		// 購入単価承認依頼情報を保留解除
		case 1:
			nRet = dbAccessor.updateM_PUCH_UNIT_COST_APPR(struct);
			break;
		// 支給品単価承認依頼情報を保留解除
		case 2:
			nRet = dbAccessor.updateM_CONS_UNIT_COST_APPR(struct);
			break;
		// 外注単価承認依頼情報を保留解除
		case 3:
			nRet = dbAccessor.updateM_SBCNT_UNIT_COST_APPR(struct);
			break;
		// 製品単価承認依頼情報を保留解除
		case 4:
			// Explanner/Jの場合
			if("0".equals(jaInstallFlg)){
				nRet = dbAccessor.updateM_UNIT_COST_APPR(struct);
			}else{// Explanner/Jaの場合
				nRet = dbAccessor.updateM_SALES_UNIT_COST_APPR(struct);
			}

		}
		return nRet;
	}

	/** String計算処理クラス */
	protected Calculate _calc;

	/** 単価承認処理コネクションクラス */
	protected IDbConnection conn;

	/** ユーザコード */
	protected String userCd;

	/** プログラムID */
	protected String programId;

	/** エラーメッセージ格納リスト */
	protected ArrayList errorList = new ArrayList();
	
	/** Ja販売管理を導入フラグ */
	protected String jaInstallFlg ;

	/**
	 * メッセージ取得
	 * 
	 * @return エラーリスト
	 */
	public ArrayList getErrorList() {
		return errorList;
	}

	/**
	 * メッセージ設定
	 * 
	 * @param メッセージリスト
	 */
	public void setErrorList(ArrayList list) {
		errorList = list;
	}

	/** 情報メッセージ格納リスト */
	protected ArrayList infoList = new ArrayList();

	/**
	 * メッセージ取得
	 * 
	 * @return infoリスト
	 */
	public ArrayList getInfoList() {
		return infoList;
	}

	/**
	 * メッセージ設定
	 * 
	 * @param メッセージリスト
	 */
	public void setInfoList(ArrayList list) {
		infoList = list;
	}

	/** 警告メッセージ格納リスト */
	protected ArrayList warnList = new ArrayList();

	/**
	 * メッセージ取得
	 * 
	 * @return warnリスト
	 */
	public ArrayList getWarnList() {
		return warnList;
	}

	/**
	 * メッセージ設定
	 * 
	 * @param メッセージリスト
	 */
	public void setWarnList(ArrayList list) {
		warnList = list;
	}

}
