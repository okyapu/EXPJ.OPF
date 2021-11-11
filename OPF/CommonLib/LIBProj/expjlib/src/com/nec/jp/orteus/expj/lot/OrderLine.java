/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/lot/OrderLine.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.lot;

import java.util.*;
import java.math.*;

import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * <pre>
 * 受注ヘッダ用のデータクラス
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.1 $
 *
 **/

public class OrderLine
{
	/** 処理区分　*/
	public static final BigDecimal PROC_DIV_REG = BigDecimal.valueOf(1);    	// 処理区分 1（登録）
	public static final BigDecimal PROC_DIV_UPD = BigDecimal.valueOf(2);     	// 処理区分 2（更新）
	public static final BigDecimal PROC_DIV_DEL = BigDecimal.valueOf(3);     	// 処理区分 3（削除）

	public static final BigDecimal EXC_DIV_VAL  = BigDecimal.valueOf(1);     	// 実行区分 1（確認）
	public static final BigDecimal EXC_DIV_EXC  = BigDecimal.valueOf(2);		// 実行区分 2（実行）

	public static final BigDecimal ENTRY_TYPE_BATCH  = BigDecimal.valueOf(1);		// 実行区分 1 (バッチ)　
	public static final BigDecimal ENTRY_TYPE_ONLINE = BigDecimal.valueOf(2);		// 実行区分 2（O/L）

	
	//-------------------------------------------------------------------------
	// 値格納用メンバ変数
	//-------------------------------------------------------------------------
	/** 会社コード */
	private String  m_COMPANY_CD = null;
	/** 受注伝票番号 */
	private String  m_ORDER_H_NO = null;
	/** 受注明細行番号 */
	private BigDecimal  m_ODR_D_LINE_NO = null;
	/** 受注明細発生連番 */
	private BigDecimal  m_ODR_D_SEQ_NO = null;
	/** 伝票区分 */
	private BigDecimal m_SLIP_TYP = null;
	/** 自動計上区分 */
	private BigDecimal  m_AUTO_APP_TYP = null;
	/** 得意先注文番号 */
	private String  m_CUST_ODR_NO = null;
	/** 営業担当部門コード */
	private String  m_CUST_CHRG_ORG_CD = null;
	/** 営業担当者コード */
	private String  m_CUST_CHRG_PSN_CD = null;
	/** 発行担当者部門コード */
	private String  m_ODR_ACPT_ORG_CD =null;
	/** 発行担当者コード */
	private String  m_ODR_ACPT_PSN_CD = null;
	/** 得意先コード */
	private String  m_CUST_CD = null;
	/** 納品場所コード */
	private String  m_DLV_LOC_CD = null;
	/** 出荷倉庫コード */
	private String  m_SHIP_WH_CD = null;
	/** 出荷倉庫名 */
	private String  m_SHIP_WH_NAME = null;
	/** 品目番号 */
	private String  m_ITEM_CD = null;
	/** 品目名 */
	private String  m_ITEM_NAME = null;
	/** 取引区分 */
	private BigDecimal  m_TRANS_TYP = null;
	/** 明細取消理由コード */
	private String  m_ODR_D_CANCEL_CAUSE_CD = null;
	/** 納入予定便番号 */
	private BigDecimal  m_CUST_DLV_PLAN_TRANS_NO = null;
	/** 社内出荷予定便番号 */
	private BigDecimal  m_IN_HOUSE_SHIP_PLAN_TRANS_NO = null;
	/** 受注単価 */
	private BigDecimal  m_ODR_UNIT_PRICE = null;
	/** 納入予定日時 */
	private Date  m_SCDL_DLV_DATE = null;
	/** 出荷予定日時 */
	private Date  m_SHIP_PLAN_DATE = null;
	/** セット開始日時 */
	private Date  m_SET_ST_DATE = null;
	/** 運送便コード */
	private String  m_TRANSPORT_CD = null;
	/** 運送便名 */
	private String  m_TRANSPORT_NAME = null;
	/** 受注数量 */
	private BigDecimal  m_ODR_QTY = null;
	/** 受注単位 */
	private String  m_UNIT_CD = null;
	/** 指定ロット番号 */
	private String  m_LOT_NO = null;
	/** 備考 */
	private String  m_REMARKS = null;
	/** 受注日 */
	private Date  m_ODR_DATE = null;
	/** IF情報管理番号 */
	private BigDecimal  m_IF_CTL_NO = null;
	/** 注文項番 */
	private BigDecimal  m_ODR_SEQ = null;
	/** データ入力区分 */
	private BigDecimal  m_ENTRY_TYP = null;
	/** 受注金額 */
	private BigDecimal  m_ODR_AMOUNT = null;
	/** 受注金額(邦貨) */
	private BigDecimal  m_ODR_AMOUNT_EXCH_RATES = null;
	/** 消費税額 */
	private BigDecimal  m_TAX_AMOUNT = null;
	/** 受注金額(税込み) */
	private BigDecimal  m_ODR_AMOUNT_TAX = null;
	/** 受注金額(税抜) */
	private BigDecimal  m_ODR_AMOUNT_EXC_TAX = null;
	
	/** 受注単位数 */
	private BigDecimal  m_OODR_UNIT_QTY = null;
	/** 得意先品目番号 */
	private String  m_CUST_ITEM_CD = null;
	/** 得意先品目名称 */
	private String  m_CUST_ITEM_NAME = null;
	/** 更新数 */
	private BigDecimal  m_MODIFY_COUNT = null;
	/** 処理区分 */
	private BigDecimal  m_PROC_DIV = null;
	/** 実行区分 */
	private BigDecimal  m_EXC_DIV = null;
	/** エラー番号 */
	private String  m_ERROR_NO = null;
	/** JANコード */
	private String  m_JANCODE = null;
	

	//-------------------------------------------------------------------------
	// 要素取得関数
	//-------------------------------------------------------------------------
	/** 会社コード */
	public String  companyCd() { return m_COMPANY_CD; }
	/** 受注伝票番号 */
	public String  orderHNo() { return m_ORDER_H_NO; }
	/** 受注明細行番号 */
	public BigDecimal  lineNo() { return m_ODR_D_LINE_NO; }
	/** 受注明細発生連番 */
	public BigDecimal  seqNo() { return m_ODR_D_SEQ_NO; }
	/** 伝票区分 */
	public BigDecimal slipType() {return m_SLIP_TYP; }
	/** 自動計上区分 */
	public BigDecimal autoAppType() {return m_AUTO_APP_TYP; }
	/** 得意先注文番号 */
	public String  custOdrNo() {  return m_CUST_ODR_NO; }
	/** 営業担当部門コード*/
	public String  custChrgOrgCd() { return m_CUST_CHRG_ORG_CD; }
	/** 営業担当者コード*/
	public String  custChrgPsnCd() { return m_CUST_CHRG_PSN_CD; }
	/** 発行担当者部門コード */
	public String  acptOrgCd() { return m_ODR_ACPT_ORG_CD; }
	/** 発行担当者コード*/
	public String  acptPsnCd() { return m_ODR_ACPT_PSN_CD; }
	/** 得意先コード */
	public String  custCd() { return m_CUST_CD; }
	/** 納品場所コード */
	public String  dlvLocCd() { return m_DLV_LOC_CD; }
	/** 出荷倉庫コード */
	public String  shipWhCd() { return m_SHIP_WH_CD ;}
	/** 出荷倉庫名 */
	public String shipWhName() { return m_SHIP_WH_NAME; }
	/** 品目番号 */
	public String  itemCd() { return m_ITEM_CD; }
	/** 品目名称 */
	public String  itemName() { return m_ITEM_NAME; }
	/** 取引区分 */
	public BigDecimal  transType() {  return m_TRANS_TYP; }
	/** 明細取消理由コード */
	public String  cancelCauseCd() { return m_ODR_D_CANCEL_CAUSE_CD; }
	/** 納入予定便番号 */
	public BigDecimal  custDlvPlanTransNo() {  return m_CUST_DLV_PLAN_TRANS_NO; }
	/** 社内出荷予定便番号 */
	public BigDecimal  inHouseShipPlanTransNo() {  return m_IN_HOUSE_SHIP_PLAN_TRANS_NO; }
	/** 受注単価 */
	public BigDecimal  orderUnitPrice() {  return m_ODR_UNIT_PRICE; }
	/** 納入予定日時 */
	public Date  scdlDlvDate() {  return m_SCDL_DLV_DATE; }
	/** 出荷予定日 */
	public Date  shipPlanDate() {  return m_SHIP_PLAN_DATE; }
	/** セット開始日時 */
	public Date  setStDate() {  return m_SET_ST_DATE; }
	/** 運送便コード*/
	public String  transPortCd() { return m_TRANSPORT_CD; }
	/** 運送便名 */
	public String transPortName() { return m_TRANSPORT_NAME; }
	/** 受注数量 */
	public BigDecimal  orderQty() {  return m_ODR_QTY; }
	/** 受注単位 */
	public String  orderUnitCd() { return m_UNIT_CD; }
	/** 指定ロット番号 */
	public String  lotNo() { return m_LOT_NO; }
	/** 備考 */
	public String  remarks() {  return m_REMARKS; }
	/** 受注日 */
	public Date  orderDate() { return m_ODR_DATE; }
	/** IF情報管理番号 */
	public BigDecimal  ifCtlNo() {  return m_IF_CTL_NO; }
	/** 注文項番 */
	public BigDecimal  orderSqe() {  return m_ODR_SEQ; }
	/** データ入力区分 */
	public BigDecimal  entryType() {  return m_ENTRY_TYP; }
	/** 受注金額  */
	public BigDecimal orderAmount() { return m_ODR_AMOUNT; }
	/** 受注金額(邦貨)  */
	public BigDecimal orderAmountExchRates() { return m_ODR_AMOUNT_EXCH_RATES; }
	/** 消費税額 */
	public BigDecimal taxAmount() { return m_TAX_AMOUNT; }
	/** 受注金額(税込み) */
	public BigDecimal orderAmountTax() { return m_ODR_AMOUNT_TAX; }
	/** 受注金額(税抜) */
	public BigDecimal orderAmountExcTax() { return m_ODR_AMOUNT_EXC_TAX; }
	/** 受注単位数 */
	public BigDecimal orderUnitQty() { return m_OODR_UNIT_QTY; }
	/** 得意先品目番号 */
	public String custItemCd() { return m_CUST_ITEM_CD; }
	/** 得意先品目名称 */
	public String custItemName() { return m_CUST_ITEM_NAME; }
	/** 更新数 */
	public BigDecimal  modifyCount() {  return m_MODIFY_COUNT; }
	/** 処理区分 */
	public BigDecimal  procDiv() {  return m_PROC_DIV; }
	/** 実行区分 */
	public BigDecimal  excDiv() {  return m_EXC_DIV; }
	/** エラー番号 */
	public String  errorNo() {  return m_ERROR_NO; }
	/** JANコード */
	public String  janCode() {  return m_JANCODE; }
	//-------------------------------------------------------------------------
	// 要素設定関数
	//-------------------------------------------------------------------------
	/** 会社コード */
	public void  companyCd(String val) {  m_COMPANY_CD = val; }
	/** 受注伝票番号 */
	public void  orderHNo(String val) {  m_ORDER_H_NO = val; }
	/** 受注明細行番号 */
	public void  lineNo(BigDecimal val) {  m_ODR_D_LINE_NO = val; }
	/** 受注明細発生連番 */
	public void  seqNo(BigDecimal val) {  m_ODR_D_SEQ_NO = val; }
	/** 伝票区分 */
	public void slipType(BigDecimal val) { m_SLIP_TYP = val; }
	/** 自動計上区分 */
	public void autoAppType(BigDecimal val) { m_AUTO_APP_TYP = val; }
	/** 得意先注文番号 */
	public void  custOdrNo(String val) {   m_CUST_ODR_NO = val; }
	/** 営業担当部門コード*/
	public void  custChrgOrgCd(String val) {  m_CUST_CHRG_ORG_CD = val; }
	/** 営業担当者コード*/
	public void  custChrgPsnCd(String val) {  m_CUST_CHRG_PSN_CD = val; }
	/** 発行担当者部門コード */
	public void  acptOrgCd(String val) {  m_ODR_ACPT_ORG_CD = val; }
	/** 発行担当者コード*/
	public void  acptPsnCd(String val) {  m_ODR_ACPT_PSN_CD = val; }
	/** 得意先コード */
	public void  custCd(String val) {  m_CUST_CD = val; }
	/** 納品場所コード */
	public void  dlvLocCd(String val) {  m_DLV_LOC_CD = val; }
	/** 出荷倉庫コード */
	public void  shipWhCd(String val) {  m_SHIP_WH_CD  = val; }
	/** 出荷倉庫名 */
	public void shipWhName(String val) {  m_SHIP_WH_NAME = val; }
	/** 品目番号 */
	public void  itemCd(String val) {  m_ITEM_CD = val; }
	/** 品目名称 */
	public void  itemName(String val) {  m_ITEM_NAME = val; }
	/** 取引区分 */
	public void  transType(BigDecimal val) {   m_TRANS_TYP = val; }
	/** 明細取消理由コード */
	public void  cancelCauseCd(String val) {  m_ODR_D_CANCEL_CAUSE_CD = val; }
	/** 納入予定便番号 */
	public void  custDlvPlanTransNo(BigDecimal val) {   m_CUST_DLV_PLAN_TRANS_NO = val; }
	/** 社内出荷予定便番号 */
	public void  inHouseShipPlanTransNo(BigDecimal val) {   m_IN_HOUSE_SHIP_PLAN_TRANS_NO = val; }
	/** 受注単価 */
	public void  orderUnitPrice(BigDecimal val) {   m_ODR_UNIT_PRICE= val; }
	/** 納入予定日時 */
	public void  scdlDlvDate(Date val) {   m_SCDL_DLV_DATE = val; }
	/** 出荷予定日 */
	public void  shipPlanDate(Date val) {   m_SHIP_PLAN_DATE = val; }
	/** セット開始日時 */
	public void  setStDate(Date val) {   m_SET_ST_DATE = val; }
	/** 運送便コード*/
	public void  transPortCd(String val) {  m_TRANSPORT_CD = val; }
	/** 運送便名 */
	public void transPortName(String val) {  m_TRANSPORT_NAME = val; }
	/** 受注数量 */
	public void  orderQty(BigDecimal val) {   m_ODR_QTY = val; }
	/** 受注単位 */
	public void  orderUnitCd(String val) {  m_UNIT_CD = val; }
	/** 指定ロット番号 */
	public void  lotNo(String val) {  m_LOT_NO = val; }
	/** 備考 */
	public void  remarks(String val) {   m_REMARKS = val; }
	/** 受注日 */
	public void  orderDate(Date val) {  m_ODR_DATE = val; }
	/** IF情報管理番号 */
	public void  ifCtlNo(BigDecimal val) {   m_IF_CTL_NO = val; }
	/** 注文項番 */
	public void  orderSqe(BigDecimal val) {   m_ODR_SEQ = val; }
	/** データ入力区分 */
	public void  entryType(BigDecimal val) {   m_ENTRY_TYP = val; }
	/** 受注金額  */
	public void orderAmount(BigDecimal val) {  m_ODR_AMOUNT = val; }
	/** 受注金額(邦貨)  */
	public void orderAmountExchRates(BigDecimal val) {  m_ODR_AMOUNT_EXCH_RATES = val; }
	/** 消費税額 */
	public void taxAmount(BigDecimal val) {  m_TAX_AMOUNT = val; }
	/** 受注金額(税込み) */
	public void orderAmountTax(BigDecimal val) {  m_ODR_AMOUNT_TAX = val; }
	/** 受注金額(税抜) */
	public void orderAmountExcTax(BigDecimal val) {  m_ODR_AMOUNT_EXC_TAX = val; }
	/** 受注単位数 */
	public void orderUnitQty(BigDecimal val) { m_OODR_UNIT_QTY= val; }
	/** 得意先品目番号 */
	public void custItemCd(String val) {  m_CUST_ITEM_CD = val; }
	/** 得意先品目名称 */
	public void custItemName(String val) {  m_CUST_ITEM_NAME = val; }
	/** 更新数 */
	public void  modifyCount(BigDecimal val) {   m_MODIFY_COUNT = val; }
	/** 処理区分 */
	public void  procDiv(BigDecimal val) {   m_PROC_DIV = val; }
	/** 実行区分 */
	public void  excDiv(BigDecimal val) {   m_EXC_DIV = val; }
	/** エラー番号 */
	public void  errorNo(String val) {   m_ERROR_NO = val; }
	/** JANコード */
	public void  janCode(String val) {   m_JANCODE = val; }
	
	/**
	 * コンストラクタ
	 *
	 * @param なし
	 */
	public OrderLine()
	{
		// 初期化
		initialize();
		return;
	}

	/**
	 * メンバ変数のクリア
	 *
	 * @param なし
	 */
	public void clear()
	{
		/** 会社コード */
		m_COMPANY_CD = null;
		/** 受注伝票番号 */
		m_ORDER_H_NO = null;
		/** 受注明細行番号 */
		m_ODR_D_LINE_NO = null;
		/** 受注明細発生連番 */
		m_ODR_D_SEQ_NO = null;
		/** 伝票区分 */
		m_SLIP_TYP = null;
		/** 自動計上区分 */
		m_AUTO_APP_TYP = null;
		/** 得意先注文番号 */
		m_CUST_ODR_NO = null;
		/** 営業担当部門コード */
		m_CUST_CHRG_ORG_CD = null;
		/** 営業担当者コード */
		m_CUST_CHRG_PSN_CD = null;
		/** 発行担当者部門コード */
		m_ODR_ACPT_ORG_CD =null;
		/** 発行担当者コード */
		m_ODR_ACPT_PSN_CD = null;
		/** 得意先コード */
		m_CUST_CD = null;
		/** 納品場所コード */
		m_DLV_LOC_CD = null;
		/** 出荷倉庫コード */
		m_SHIP_WH_CD = null;
		/** 出荷倉庫名 */
		m_SHIP_WH_NAME = null;
		/** 品目番号 */
		m_ITEM_CD = null;
		/** 品目名 */
		m_ITEM_NAME = null;
		/** 取引区分 */
		m_TRANS_TYP = null;
		/** 明細取消理由コード */
		m_ODR_D_CANCEL_CAUSE_CD = null;
		/** 納入予定便番号 */
		m_CUST_DLV_PLAN_TRANS_NO = null;
		/** 社内出荷予定便番号 */
		m_IN_HOUSE_SHIP_PLAN_TRANS_NO = null;
		/** 受注単価 */
		m_ODR_UNIT_PRICE = null;
		/** 納入予定日時 */
		m_SCDL_DLV_DATE = null;
		/** 出荷予定日時 */
		m_SHIP_PLAN_DATE = null;
		/** セット開始日時 */
		m_SET_ST_DATE = null;
		/** 運送便コード */
		m_TRANSPORT_CD = null;
		/** 運送便名 */
		m_TRANSPORT_NAME = null;
		/** 受注数量 */
		m_ODR_QTY = null;
		/** 受注単位 */
		m_UNIT_CD = null;
		/** 指定ロット番号 */
		m_LOT_NO = null;
		/** 備考 */
		m_REMARKS = null;
		/** 受注日 */
		m_ODR_DATE = null;
		/** IF情報管理番号 */
		m_IF_CTL_NO = null;
		/** 注文項番 */
		m_ODR_SEQ = null;
		/** データ入力区分 */
		m_ENTRY_TYP = null;
		/** 受注金額 */
		m_ODR_AMOUNT = null;
		/** 受注金額(邦貨) */
		m_ODR_AMOUNT_EXCH_RATES = null;
		/** 消費税額 */
		m_TAX_AMOUNT = null;
		/** 受注金額(税込み) */
		m_ODR_AMOUNT_TAX = null;
		/** 得意先品目番号 */
		m_CUST_ITEM_CD = null;
		/** 得意先品目名称 */
		m_CUST_ITEM_NAME = null;
		/** 更新数 */
		m_MODIFY_COUNT = null;
		/** 処理区分 */
		m_PROC_DIV = null;
		/** 実行区分 */
		m_EXC_DIV = null;
		/** エラー番号 */
		m_ERROR_NO = null;
		

		return;
	}

	/**
	 * インスタンス破壊時に行う処理
	 *
	 * @param なし
	 */
	public void finalize()
	{
		// クリア
		clear();
		return;
	}

	/**
	 * 初期化
	 */
	public void initialize()
	{
		/** 会社コード */
		m_COMPANY_CD = null;
		/** 受注伝票番号 */
		m_ORDER_H_NO = null;
		/** 受注明細行番号 */
		m_ODR_D_LINE_NO = null;
		/** 受注明細発生連番 */
		m_ODR_D_SEQ_NO = null;
		/** 伝票区分 */
		m_SLIP_TYP = null;
		/** 自動計上区分 */
		m_AUTO_APP_TYP = null;
		/** 得意先注文番号 */
		m_CUST_ODR_NO = null;
		/** 営業担当部門コード */
		m_CUST_CHRG_ORG_CD = null;
		/** 営業担当者コード */
		m_CUST_CHRG_PSN_CD = null;
		/** 発行担当者部門コード */
		m_ODR_ACPT_ORG_CD =null;
		/** 発行担当者コード */
		m_ODR_ACPT_PSN_CD = null;
		/** 得意先コード */
		m_CUST_CD = null;
		/** 納品場所コード */
		m_DLV_LOC_CD = null;
		/** 出荷倉庫コード */
		m_SHIP_WH_CD = null;
		/** 出荷倉庫名 */
		m_SHIP_WH_NAME = null;
		/** 品目番号 */
		m_ITEM_CD = null;
		/** 品目名 */
		m_ITEM_NAME = null;
		/** 取引区分 */
		m_TRANS_TYP = null;
		/** 明細取消理由コード */
		m_ODR_D_CANCEL_CAUSE_CD = null;
		/** 納入予定便番号 */
		m_CUST_DLV_PLAN_TRANS_NO = null;
		/** 社内出荷予定便番号 */
		m_IN_HOUSE_SHIP_PLAN_TRANS_NO = null;
		/** 受注単価 */
		m_ODR_UNIT_PRICE = null;
		/** 納入予定日時 */
		m_SCDL_DLV_DATE = null;
		/** 出荷予定日時 */
		m_SHIP_PLAN_DATE = null;
		/** セット開始日時 */
		m_SET_ST_DATE = null;
		/** 運送便コード */
		m_TRANSPORT_CD = null;
		/** 運送便名 */
		m_TRANSPORT_NAME = null;
		/** 受注数量 */
		m_ODR_QTY = null;
		/** 受注単位 */
		m_UNIT_CD = null;
		/** 指定ロット番号 */
		m_LOT_NO = null;
		/** 備考 */
		m_REMARKS = null;
		/** 受注日 */
		m_ODR_DATE = null;
		/** IF情報管理番号 */
		m_IF_CTL_NO = null;
		/** 注文項番 */
		m_ODR_SEQ = null;
		/** データ入力区分 */
		m_ENTRY_TYP = null;
		/** 受注金額 */
		m_ODR_AMOUNT = null;
		/** 受注金額(邦貨) */
		m_ODR_AMOUNT_EXCH_RATES = null;
		/** 消費税額 */
		m_TAX_AMOUNT = null;
		/** 受注金額(税込み) */
		m_ODR_AMOUNT_TAX = null;
		/** 得意先品目番号 */
		m_CUST_ITEM_CD = null;
		/** 得意先品目名称 */
		m_CUST_ITEM_NAME = null;
		/** 更新数 */
		m_MODIFY_COUNT = null;
		/** 処理区分 */
		m_PROC_DIV = null;
		/** 実行区分 */
		m_EXC_DIV = null;
		/** エラー番号 */
		m_ERROR_NO = null;
		

	}

	

}