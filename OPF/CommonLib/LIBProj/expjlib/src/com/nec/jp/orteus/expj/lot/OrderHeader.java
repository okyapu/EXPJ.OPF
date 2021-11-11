/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/lot/OrderHeader.java,v $
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

public class OrderHeader
{
	/** 処理区分　*/
	public static final BigDecimal PROC_DIV_REG = BigDecimal.valueOf(1);    	// 処理区分 1（登録）
	public static final BigDecimal PROC_DIV_UPD = BigDecimal.valueOf(2);     	// 処理区分 2（更新）
	public static final BigDecimal PROC_DIV_DEL = BigDecimal.valueOf(3);     	// 処理区分 3（削除）

	public static final BigDecimal EXC_DIV_VAL  = BigDecimal.valueOf(1);     	// 実行区分 1（確認）
	public static final BigDecimal EXC_DIV_EXC  = BigDecimal.valueOf(2);		// 実行区分 2（実行）

	
	//-------------------------------------------------------------------------
	// 値格納用メンバ変数
	//-------------------------------------------------------------------------
	/** 会社コード */
	private String  m_COMPANY_CD = null;
	/** 受注伝票番号 */
	private String  m_ORDER_H_NO = null;
	/** 伝票区分 */
	private BigDecimal m_SLIP_TYP = null;
	/** 自動計上区分 */
	private BigDecimal  m_AUTO_APP_TYP = null;
	/** 受注日 */
	private Date  m_ODR_DATE = null;
	/** 営業担当部門コード */
	private String  m_CUST_CHRG_ORG_CD = null;
	/** 営業担当部門名 */
	private String  m_CUST_CHRG_ORG_NAME = null;
	/** 営業担当者コード */
	private String  m_CUST_CHRG_PSN_CD = null;
	/** 営業担当者名 */
	private String  m_CUST_CHRG_PSN_NAME = null;
	/** 発行担当者部門コード */
	private String  m_ODR_ACPT_ORG_CD =null;
	/** 発行担当者部門名 */
	private String  m_ODR_ACPT_ORG_NAME =null;
	/** 発行担当者コード */
	private String  m_ODR_ACPT_PSN_CD = null;
	/** 発行担当者名 */
	private String  m_ODR_ACPT_PSN_NAME = null;
	/** 通貨コード */
	private String  m_CURRNCY_CD = null;
	/** 為替種別 */
	private BigDecimal  m_EXCH_TYP = null;
	/** 入力方法 */
	private BigDecimal m_INPUT_TYP = null;
	/** 得意先コード */
	private String  m_CUST_CD = null;
	/** 得意先名 */
	private String  m_CUST_NAME = null;
	/** 得意先名略称 */
	private String  m_CUST_ANAME = null;
	/** 得意先担当者 */
	private String  m_CUST_PSN = null;
	/** 請求先コード */
	private String  m_BILL_ADDRESSEE_CD = null;
	/** 請求先名 */
	private String  m_BILL_ADDRESSEE_NAME = null;
	/** 納品場所コード */
	private String  m_DLV_LOC_CD = null;
	/** 納品場所名 */
	private String  m_DLV_LOC_NAME = null;
	/** 納品場所名（カナ） */
	private String  m_DLV_LOC_KNAME = null;
	/** 納品場所名（英名） */
	private String  m_DLV_LOC_ENAME = null;
	/** 納品場所郵便番号 */
	private String  m_DLV_LOC_ZIP_CD = null;
	/** 納品場所住所１ */
	private String  m_DLV_LOC_ADDRESS_1 = null;
	/** 納品場所住所２ */
	private String  m_DLV_LOC_ADDRESS_2 = null;
	/** 納品場所住所（カナ）１ */
	private String  m_DLV_LOC_ADDRESS_K_1 = null;
	/** 納品場所住所（カナ）２ */
	private String  m_DLV_LOC_ADDRESS_K_2 = null;
	/** 納品場所電話番号 */
	private String  m_DLV_LOC_TEL = null;
	/** 納品場所ＦＡＸ番号 */
	private String  m_DLV_LOC_FAX = null;
	/** 出荷倉庫コード */
	private String  m_SHIP_WH_CD = null;
	/** 出荷倉庫名 */
	private String  m_SHIP_WH_NAME = null;
	/** 出荷指定日 */
	private Date  m_DESINATED_SHIP_DATE = null;
	/** 指定納期 */
	private Date  m_DESINATED_DLV_DATE = null;
	/** 運送便コード */
	private String  m_TRANSPORT_CD = null;
	/** 運送便名 */
	private String  m_TRANSPORT_NAME = null;
	/** 納入予定便番号 */
	private BigDecimal  m_CUST_DLV_PLAN_TRANS_NO = null;
	/** 検収区分 */
	private BigDecimal  m_INSPC_ACPT_TYP = null;
	/** 本体金額計 */
	private BigDecimal  m_ODR_AMOUNT_SUM = null;
	/** 消費税合計 */
	private BigDecimal  m_ODR_TAX_SUM = null;
	/** 受注合計金額 */
	private BigDecimal  m_ODR_TAX_AMOUNT_SUM = null;
	/** 得意先注文番号 */
	private String  m_CUST_ODR_NO = null;
	/** 伝票取消理由コード */
	private String  m_ODR_H_CANCEL_CAUSE_CD = null;
	/** 伝票摘要 */
	private String  m_SLIP_REMARKS = null;
	/** 更新数 */
	private BigDecimal  m_MODIFY_COUNT = null;
	/** 処理区分 */
	private BigDecimal  m_PROC_DIV = null;
	/** 実行区分 */
	private BigDecimal  m_EXC_DIV = null;
	/** エラー番号 */
	private String  m_ERROR_NO = null;
	/** 請求サイクル */
	private BigDecimal m_CLAIM_CYCLE_TYP = null;
	
	private List m_OrderLines = null;

	//-------------------------------------------------------------------------
	// 要素取得関数
	//-------------------------------------------------------------------------
	/** 会社コード */
	public String  companyCd() { return m_COMPANY_CD; }
	/** 受注伝票番号 */
	public String  orderHNo() { return m_ORDER_H_NO; }
	/** 伝票区分 */
	public BigDecimal slipType() {return m_SLIP_TYP; }
	/** 自動計上区分 */
	public BigDecimal autoAppType() {return m_AUTO_APP_TYP; }
	/** 受注日 */
	public Date  orderDate() { return m_ODR_DATE; }
	/** 得意先コード */
	public String  custCd() { return m_CUST_CD; }
	/** 納品場所コード*/
	public String  dlvLocCd() { return m_DLV_LOC_CD; }
	/** 請求先コード*/
	public String  billAddresseeCd() { return m_BILL_ADDRESSEE_CD; }
	/** 運送便コード*/
	public String  transPortCd() { return m_TRANSPORT_CD; }
	/** 出荷倉庫コード*/
	public String  shipWhCd() { return m_SHIP_WH_CD ;}
	/** 営業担当部門コード*/
	public String  custChrgOrgCd() { return m_CUST_CHRG_ORG_CD; }
	/** 営業担当者コード*/
	public String  custChrgPsnCd() { return m_CUST_CHRG_PSN_CD; }
	/** 発行担当者部門コード */
	public String  acptOrgCd() { return m_ODR_ACPT_ORG_CD; }
	/** 発行担当者コード*/
	public String  acptPsnCd() { return m_ODR_ACPT_PSN_CD; }
	/** 得意先名 */
	public String custName() { return m_CUST_NAME; }
	/** 得意先名略称 */
	public String custAName() { return m_CUST_ANAME; }
	/** 得意先担当者 */
	public String custPsn() { return m_CUST_PSN; }
	/** 請求先名 */
	public String billAddresseeName() { return m_BILL_ADDRESSEE_NAME; }
	/** 納品場所名　*/
	public String dlvLocName() { return m_DLV_LOC_NAME; }
	/** 納品場所名（カナ） */
	public String dlvLocKName() { return m_DLV_LOC_KNAME; }
	/** 納品場所名（英名） */
	public String dlvLocEName() { return m_DLV_LOC_ENAME; }
	/** 納品場所郵便番号 */
	public String dlvLocZipCd() { return m_DLV_LOC_ZIP_CD; }
	/** 納品場所住所１ */
	public String dlvLocAddress1() { return m_DLV_LOC_ADDRESS_1; }
	/** 納品場所住所２ */
	public String dlvLocAddress2() { return m_DLV_LOC_ADDRESS_2; }
	/** 納品場所住所（カナ）１ */
	public String dlvLocAddressK1() { return m_DLV_LOC_ADDRESS_K_1; }
	/** 納品場所住所（カナ）２ */
	public String dlvLocAddressK2() { return m_DLV_LOC_ADDRESS_K_2; }
	/** 納品場所電話番号 */
	public String dlvLocTel() { return m_DLV_LOC_TEL; }
	/** 納品場所ＦＡＸ番号 */
	public String dlvLocFax() { return m_DLV_LOC_FAX; }
	/** 出荷倉庫名 */
	public String shipWhName() { return m_SHIP_WH_NAME; }
	/** 運送便名 */
	public String transPortName() { return m_TRANSPORT_NAME; }
	/** 営業担当部門名 */
	public String custChrgOrgName() { return m_CUST_CHRG_ORG_NAME; }
	/** 営業担当者コード */
	public String custChrgPsnName() { return m_CUST_CHRG_PSN_NAME; }
	/** 発行担当者部門名 */
	public String acptOrgName() { return m_ODR_ACPT_ORG_NAME; }
	/** 発行担当者名 */
	public String acptPsnName() { return m_ODR_ACPT_PSN_NAME; }
	/** 通貨コード */
	public String currncyCd() { return m_CURRNCY_CD; }
	/** 検収区分 */
	public BigDecimal inspcAcptTyp() { return m_INSPC_ACPT_TYP; }
	/** 為替種別 */
	public BigDecimal ExchTyp() { return m_EXCH_TYP; }
	/** 本体金額計 */
	public BigDecimal amountSum() { return m_ODR_AMOUNT_SUM; }
	/** 消費税合計 */
	public BigDecimal taxSum() { return m_ODR_TAX_SUM; }
	/** 受注合計金額(税込) */
	public BigDecimal taxAmountSum() { return m_ODR_TAX_AMOUNT_SUM; }
	/** 入力方法 */
	public BigDecimal  inputTyp() {  return m_INPUT_TYP; }
	/** 指定納期 */
	public Date  desinatedDlvDate() {  return m_DESINATED_DLV_DATE; }
	/** 出荷指定日 */
	public Date  desinatedShipDate() {  return m_DESINATED_SHIP_DATE; }
	/** 納入予定便番号 */
	public BigDecimal  custDlvPlanTransNo() {  return m_CUST_DLV_PLAN_TRANS_NO; }
	/** 得意先注文番号 */
	public String  custOdrNo() {  return m_CUST_ODR_NO; }
	/** 伝票摘要 */
	public String  slipRemarks() {  return m_SLIP_REMARKS; }
	/** 伝票取消理由コード */
	public String  cancelCauseCd() {  return m_ODR_H_CANCEL_CAUSE_CD; }
	/** 更新数 */
	public BigDecimal  modifyCount() {  return m_MODIFY_COUNT; }
	/** 処理区分 */
	public BigDecimal  procDiv() {  return m_PROC_DIV; }
	/** 実行区分 */
	public BigDecimal  excDiv() {  return m_EXC_DIV; }
	/** エラー番号 */
	public String  errorNo() {  return m_ERROR_NO; }
	/** 請求サイクル */
	public BigDecimal  claimCycleTyp() {  return m_CLAIM_CYCLE_TYP; }
	/** 受注明細リスト */
	public List  orderLines() {  return m_OrderLines; }
	
	//-------------------------------------------------------------------------
	// 要素設定関数
	//-------------------------------------------------------------------------
	/** 会社コード */
	public void  companyCd(String val) {m_COMPANY_CD = val; }
	/** 受注伝票番号 */
	public void orderHNo(String val) { m_ORDER_H_NO = val; }
	/** 伝票区分 */
	public void  slipType(BigDecimal val) {m_SLIP_TYP= val; }
	/** 自動計上区分 */
	public void  autoAppType(BigDecimal val) {m_AUTO_APP_TYP= val; }
	/** 受注日 */
	public void  orderDate(Date val) { m_ODR_DATE= val; }
	/** 得意先コード */
	public void custCd(String val) { m_CUST_CD = val; }
	/** 納品場所コード */
	public void dlvLocCd(String val) { m_DLV_LOC_CD = val; }
	/** 請求先コード */
	public void billAddresseeCd(String val) { m_BILL_ADDRESSEE_CD = val; }
	/** 出荷倉庫コード */
	public void shipWhCd(String val) { m_SHIP_WH_CD = val; }
	/** 運送便コード */
	public void transPortCd(String val) { m_TRANSPORT_CD = val; }
	/** 営業担当部門コード */
	public void custChrgOrgCd(String val) { m_CUST_CHRG_ORG_CD = val; }
	/** 営業担当者コード */
	public void custChrgPsnCd(String val) { m_CUST_CHRG_PSN_CD = val; }
	/** 発行担当者部門コード */
	public void acptOrgCd(String val) { m_ODR_ACPT_ORG_CD = val; }
	/** 発行担当者コード */
	public void acptPsnCd(String val) { m_ODR_ACPT_PSN_CD = val; }
	/** 入力方法 */
	public void  inputTyp(BigDecimal val) {  m_INPUT_TYP= val; }
	/** 指定納期 */
	public void  desinatedDlvDate(Date val) {  m_DESINATED_DLV_DATE= val; }
	/** 出荷指定日 */
	public void  desinatedShipDate(Date val) {  m_DESINATED_SHIP_DATE= val; }
	/** 納入予定便番号 */
	public void  custDlvPlanTransNo(BigDecimal val) {  m_CUST_DLV_PLAN_TRANS_NO= val; }
	/** 得意先注文番号 */
	public void  custOdrNo(String val) {  m_CUST_ODR_NO= val; }
	/** 伝票摘要 */
	public void  slipRemarks(String val) {  m_SLIP_REMARKS= val; }
	/** 伝票取消理由コード */
	public void  cancelCauseCd(String val) {  m_ODR_H_CANCEL_CAUSE_CD= val; }
	/** 更新数 */
	public void  modifyCount(BigDecimal val) {  m_MODIFY_COUNT= val; }
	/** 処理区分 */
	public void  procDiv(BigDecimal val) {  m_PROC_DIV= val; }
	/** 実行区分 */
	public void  excDiv(BigDecimal val) {  m_EXC_DIV= val; }
	/** エラー番号 */
	public void  errorNo(String val) {  m_ERROR_NO= val; }
	
	/** 得意先名 */
	public void custName(String val) { m_CUST_NAME = val; }
	/** 得意先名略称 */
	public void custAName(String val) { m_CUST_ANAME = val; }
	/** 得意先担当者 */
	public void custPsn(String val) {  m_CUST_PSN = val; }
	/** 請求先名 */
	public void billAddresseeName(String val) {  m_BILL_ADDRESSEE_NAME = val; }
	/** 納品場所名　*/
	public void dlvLocName(String val) {  m_DLV_LOC_NAME = val; }
	/** 納品場所名（カナ） */
	public void dlvLocKName(String val) {  m_DLV_LOC_KNAME = val; }
	/** 納品場所名（英名） */
	public void dlvLocEName(String val) {  m_DLV_LOC_ENAME = val; }
	/** 納品場所郵便番号 */
	public void dlvLocZipCd(String val) {  m_DLV_LOC_ZIP_CD = val; }
	/** 納品場所住所１ */
	public void dlvLocAddress1(String val) {  m_DLV_LOC_ADDRESS_1 = val; }
	/** 納品場所住所２ */
	public void dlvLocAddress2(String val) {  m_DLV_LOC_ADDRESS_2 = val; }
	/** 納品場所住所（カナ）１ */
	public void dlvLocAddressK1(String val) {  m_DLV_LOC_ADDRESS_K_1 = val; }
	/** 納品場所住所（カナ）２ */
	public void dlvLocAddressK2(String val) {  m_DLV_LOC_ADDRESS_K_2 = val; }
	/** 納品場所電話番号 */
	public void dlvLocTel(String val) {  m_DLV_LOC_TEL = val; }
	/** 納品場所ＦＡＸ番号 */
	public void dlvLocFax(String val) {  m_DLV_LOC_FAX = val; }
	/** 出荷倉庫名 */
	public void shipWhName(String val) {  m_SHIP_WH_NAME = val; }
	/** 運送便名 */
	public void transPortName(String val) {  m_TRANSPORT_NAME = val; }
	/** 営業担当部門名 */
	public void custChrgOrgName(String val) {  m_CUST_CHRG_ORG_NAME = val; }
	/** 営業担当者コード */
	public void custChrgPsnName(String val) {  m_CUST_CHRG_PSN_NAME = val; }
	/** 発行担当者部門名 */
	public void acptOrgName(String val) {  m_ODR_ACPT_ORG_NAME = val; }
	/** 発行担当者名 */
	public void acptPsnName(String val) {  m_ODR_ACPT_PSN_NAME = val; }
	/** 通貨コード */
	public void currncyCd(String val) {  m_CURRNCY_CD = val; }
	/** 検収区分 */
	public void inspcAcptTyp(BigDecimal val) {  m_INSPC_ACPT_TYP = val; }
	/** 為替種別 */
	public void exchTyp(BigDecimal val) {  m_EXCH_TYP = val; }
	/** 本体金額計 */
	public void amountSum(BigDecimal val) {  m_ODR_AMOUNT_SUM = val; }
	/** 消費税合計 */
	public void taxSum(BigDecimal val) {  m_ODR_TAX_SUM = val; }
	/** 受注合計金額(税込) */
	public void taxAmountSum(BigDecimal val) {  m_ODR_TAX_AMOUNT_SUM = val; }
	/** 受注明細情報 */
	public void orderLines(List val) {  m_OrderLines = val; }
	/** 通貨コード */
	public void claimCycleTyp(BigDecimal val) {  m_CLAIM_CYCLE_TYP = val; }
	/**
	 * コンストラクタ
	 *
	 * @param なし
	 */
	public OrderHeader()
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
		
		/** 伝票区分 */
		m_SLIP_TYP = null;
		
		/** 自動計上区分 */
		m_AUTO_APP_TYP = null;
		
		/** 受注日 */
		m_ODR_DATE = null;
		
		/** 営業担当部門コード */
		m_CUST_CHRG_ORG_CD = null;
		
		/** 営業担当部門名 */
		m_CUST_CHRG_ORG_NAME = null;
		
		/** 営業担当者コード */
		m_CUST_CHRG_PSN_CD = null;
		
		/** 営業担当者名 */
		m_CUST_CHRG_PSN_NAME = null;
		
		/** 発行担当者部門コード */
		m_ODR_ACPT_ORG_CD =null;
		
		/** 発行担当者部門名 */
		m_ODR_ACPT_ORG_NAME =null;
		
		/** 発行担当者コード */
		m_ODR_ACPT_PSN_CD = null;
		
		/** 発行担当者名 */
		m_ODR_ACPT_PSN_NAME = null;
		
		/** 通貨コード */
		m_CURRNCY_CD = null;
		
		/** 為替種別 */
		m_EXCH_TYP = null;
		
		/** 入力方法 */
		m_INPUT_TYP = null;
		
		/** 得意先コード */
		m_CUST_CD = null;
		
		/** 得意先名 */
		m_CUST_NAME = null;
		
		/** 得意先名略称 */
		m_CUST_ANAME = null;
		
		/** 得意先担当者 */
		m_CUST_PSN = null;
		
		/** 請求先コード */
		m_BILL_ADDRESSEE_CD = null;
		
		/** 請求先名 */
		m_BILL_ADDRESSEE_NAME = null;
		
		/** 納品場所コード */
		m_DLV_LOC_CD = null;
		
		/** 納品場所名 */
		m_DLV_LOC_NAME = null;
		
		/** 納品場所名（カナ） */
		m_DLV_LOC_KNAME = null;
		
		/** 納品場所名（英名） */
		m_DLV_LOC_ENAME = null;
		
		/** 納品場所郵便番号 */
		m_DLV_LOC_ZIP_CD = null;
		
		/** 納品場所住所１ */
		m_DLV_LOC_ADDRESS_1 = null;
		
		/** 納品場所住所２ */
		m_DLV_LOC_ADDRESS_2 = null;
		
		/** 納品場所住所（カナ）１ */
		m_DLV_LOC_ADDRESS_K_1 = null;
		
		/** 納品場所住所（カナ）２ */
		m_DLV_LOC_ADDRESS_K_2 = null;
		
		/** 納品場所電話番号 */
		m_DLV_LOC_TEL = null;
		
		/** 納品場所ＦＡＸ番号 */
		m_DLV_LOC_FAX = null;
		
		/** 出荷倉庫コード */
		m_SHIP_WH_CD = null;
		
		/** 出荷倉庫名 */
		m_SHIP_WH_NAME = null;
		
		/** 出荷指定日 */
		m_DESINATED_SHIP_DATE = null;
		
		/** 指定納期 */
		m_DESINATED_DLV_DATE = null;
		
		/** 運送便コード */
		m_TRANSPORT_CD = null;
		
		/** 運送便名 */
		m_TRANSPORT_NAME = null;
		
		/** 納入予定便番号 */
		m_CUST_DLV_PLAN_TRANS_NO = null;
		
		/** 検収区分 */
		m_INSPC_ACPT_TYP = null;
		
		/** 本体金額計 */
		m_ODR_AMOUNT_SUM = null;
		
		/** 消費税合計 */
		m_ODR_TAX_SUM = null;
		
		/** 受注合計金額 */
		m_ODR_TAX_AMOUNT_SUM = null;
		
		/** 得意先注文番号 */
		m_CUST_ODR_NO = null;
		
		/** 伝票取消理由コード */
		m_ODR_H_CANCEL_CAUSE_CD = null;
		
		/** 伝票摘要 */
		m_SLIP_REMARKS = null;
		
		/** 更新数 */
		m_MODIFY_COUNT = null;
		
		/** 処理区分 */
		m_PROC_DIV = null;
		
		/** 実行区分 */
		m_EXC_DIV = null;
		
		/** エラー番号 */
		m_ERROR_NO = null;
		
		/** 受注明細情報 */
		m_OrderLines = null;

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
		
		/** 伝票区分 */
		m_SLIP_TYP = null;
		
		/** 自動計上区分 */
		m_AUTO_APP_TYP = null;
		
		/** 受注日 */
		m_ODR_DATE = null;
		
		/** 営業担当部門コード */
		m_CUST_CHRG_ORG_CD = null;
		
		/** 営業担当部門名 */
		m_CUST_CHRG_ORG_NAME = null;
		
		/** 営業担当者コード */
		m_CUST_CHRG_PSN_CD = null;
		
		/** 営業担当者名 */
		m_CUST_CHRG_PSN_NAME = null;
		
		/** 発行担当者部門コード */
		m_ODR_ACPT_ORG_CD =null;
		
		/** 発行担当者部門名 */
		m_ODR_ACPT_ORG_NAME =null;
		
		/** 発行担当者コード */
		m_ODR_ACPT_PSN_CD = null;
		
		/** 発行担当者名 */
		m_ODR_ACPT_PSN_NAME = null;
		
		/** 通貨コード */
		m_CURRNCY_CD = null;
		
		/** 為替種別 */
		m_EXCH_TYP = null;
		
		/** 入力方法 */
		m_INPUT_TYP = null;
		
		/** 得意先コード */
		m_CUST_CD = null;
		
		/** 得意先名 */
		m_CUST_NAME = null;
		
		/** 得意先名略称 */
		m_CUST_ANAME = null;
		
		/** 得意先担当者 */
		m_CUST_PSN = null;
		
		/** 請求先コード */
		m_BILL_ADDRESSEE_CD = null;
		
		/** 請求先名 */
		m_BILL_ADDRESSEE_NAME = null;
		
		/** 納品場所コード */
		m_DLV_LOC_CD = null;
		
		/** 納品場所名 */
		m_DLV_LOC_NAME = null;
		
		/** 納品場所名（カナ） */
		m_DLV_LOC_KNAME = null;
		
		/** 納品場所名（英名） */
		m_DLV_LOC_ENAME = null;
		
		/** 納品場所郵便番号 */
		m_DLV_LOC_ZIP_CD = null;
		
		/** 納品場所住所１ */
		m_DLV_LOC_ADDRESS_1 = null;
		
		/** 納品場所住所２ */
		m_DLV_LOC_ADDRESS_2 = null;
		
		/** 納品場所住所（カナ）１ */
		m_DLV_LOC_ADDRESS_K_1 = null;
		
		/** 納品場所住所（カナ）２ */
		m_DLV_LOC_ADDRESS_K_2 = null;
		
		
		/** 納品場所電話番号 */
		m_DLV_LOC_TEL = null;
		
		/** 納品場所ＦＡＸ番号 */
		m_DLV_LOC_FAX = null;
		
		/** 出荷倉庫コード */
		m_SHIP_WH_CD = null;
		
		/** 出荷倉庫名 */
		m_SHIP_WH_NAME = null;
		
		/** 出荷指定日 */
		m_DESINATED_SHIP_DATE = null;
		
		/** 指定納期 */
		m_DESINATED_DLV_DATE = null;
		
		/** 運送便コード */
		m_TRANSPORT_CD = null;
		
		/** 運送便名 */
		m_TRANSPORT_NAME = null;
		
		/** 納入予定便番号 */
		m_CUST_DLV_PLAN_TRANS_NO = null;
		
		/** 検収区分 */
		m_INSPC_ACPT_TYP = null;
		
		/** 本体金額計 */
		m_ODR_AMOUNT_SUM = null;
		
		/** 消費税合計 */
		m_ODR_TAX_SUM = null;
		
		/** 受注合計金額 */
		m_ODR_TAX_AMOUNT_SUM = null;
		
		/** 得意先注文番号 */
		m_CUST_ODR_NO = null;
		
		/** 伝票取消理由コード */
		m_ODR_H_CANCEL_CAUSE_CD = null;
		
		/** 伝票摘要 */
		m_SLIP_REMARKS = null;
		
		/** 更新数 */
		m_MODIFY_COUNT = null;
		
		/** 処理区分 */
		m_PROC_DIV = null;
		
		/** 実行区分 */
		m_EXC_DIV = null;
		
		/** エラー番号 */
		m_ERROR_NO = null;
		
		/** 受注明細情報 */
		m_OrderLines = null;
	}
}
