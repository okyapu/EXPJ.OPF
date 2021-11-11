/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/amount/TaxAmountControl.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.amount;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.ExchAmount;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 消税額計算部品
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 08:30:30 $
 */
public class TaxAmountControl {

	/**
	 * 税額計算部品のデフォルトコンストラクタです。
	 * このクラスは static メソッドのみであり、
	 * 動的アクセス防止のため private としてオーバーライドしています。
	 */
	private TaxAmountControl() {
	}

	/**
	 * 税額情報を取得します。
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param amount      金額（必須）
	 * @param taxCd       消費税コード（必須）
	 * @param taxRate_1   税率１（必須）
	 * @param taxRate_2   税率２（必須）
    * @param taxRate_3   税率３（必須）
    * @param taxRoundTyp 端数区分（必須）
	 * @return 税額情報データクラス
	 * @throws IllegalArgumentException 必須パラメータが null または空文字の場合
	 * @throws SQLException データベースアクセスエラーが発生した場合
	 * @throws DataNotFoundException 該当レコードが存在しない場合
	 */
	public static TaxAmountStruct getData(
		IDbConnection conn,
		String amount,
		String taxCd,
		String taxRate_1,
		String taxRate_2,
      String taxRate_3,
      String taxRoundTyp)
		throws Exception {

		// 金額が不正な場合			
		if (amount == null || amount.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 消費税コードが不正な場合
		if (taxCd == null || taxCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 税率１が不正な場合
		if (taxRate_1 == null || taxRate_1.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 税率２が不正な場合
		if (taxRate_2 == null || taxRate_2.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 税率３が不正な場合
		if (taxRate_3 == null || taxRate_3.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// 端数区分が不正な場合
		if (taxRoundTyp == null || taxRoundTyp.length() <= 0) {
			throw new IllegalArgumentException();
		} 
		// メソッドリターン用データクラス
		TaxAmountStruct ts = new TaxAmountStruct();
      
      // 消費税コードの３桁目
      String tempTaxCd = taxCd.substring(taxCd.length() - 1, taxCd.length());
      
     
      String strIn1 = "";
      String strIn2 = "";
      String strIn3 = "";
      String strIn4 = "";
      
      // 消費税コードの３桁目 = "1" の場合
      if ("1".equals(tempTaxCd)){
          // 外税対象金額
          ts.setEXTERNAL_TAX_AMOUNT(amount);
          // 内税対象金額
          ts.setINTERNAL_TAX_AMOUNT("0");
          // 非課税対象金額
          ts.setTAXFREE_AMOUNT("0");
          
          // 税額１
          strIn1 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_1));
          strIn1 = String.valueOf(Double.parseDouble(strIn1) / Double.parseDouble("100"));
          
          // 税額２
          strIn2 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_2));
          strIn2 = String.valueOf(Double.parseDouble(strIn2) / Double.parseDouble("100"));
          
          // 税額３
          strIn3 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_3));
          strIn3 = String.valueOf(Double.parseDouble(strIn3) / Double.parseDouble("100"));
          
          // 端数処理
          // 端数区分が1：四捨五入の場合
          if ("1".equals(taxRoundTyp)){
              // 税額１
              strIn1 = Calculate.round(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // 税額２
              strIn2 = Calculate.round(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // 税額３
              strIn3 = Calculate.round(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);
          // 端数区分が2：切り上げの場合
          } else if ("2".equals(taxRoundTyp)){
              // 税額１
              strIn1 = Calculate.ceil(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // 税額２
              strIn2 = Calculate.ceil(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // 税額３
              strIn3 = Calculate.ceil(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);

          // 端数区分が3：切り捨ての場合
          } else if ("3".equals(taxRoundTyp)){
              // 税額１
              strIn1 = Calculate.floor(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // 税額２
              strIn2 = Calculate.floor(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // 税額３
              strIn3 = Calculate.floor(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);
          }
          // 税込み金額
          strIn4 = String.valueOf(Double.parseDouble(amount) + Double.parseDouble(strIn1) + Double.parseDouble(strIn2) + Double.parseDouble(strIn3));
          ts.setTAX_AMOUNT(strIn4);
          
          // 税抜き金額
          ts.setTAX_CREDIT_AMOUNT(amount);
          
      // 消費税コードの３桁目 = "5" の場合
      }else if ("5".equals(tempTaxCd) || "9".equals(tempTaxCd)){
          // 外税対象金額
          ts.setEXTERNAL_TAX_AMOUNT("0");
          // 内税対象金額
          ts.setINTERNAL_TAX_AMOUNT(amount);
          // 非課税対象金額
          ts.setTAXFREE_AMOUNT("0");
          
          // 税額１
          strIn1 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_1));
          strIn1 = String.valueOf(Double.parseDouble(strIn1) / (Double.parseDouble("100") + Double.parseDouble(taxRate_1) + Double.parseDouble(taxRate_2) + Double.parseDouble(taxRate_3)));
          
          // 税額２
          strIn2 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_2));
          strIn2 = String.valueOf(Double.parseDouble(strIn2) / (Double.parseDouble("100") + Double.parseDouble(taxRate_1) + Double.parseDouble(taxRate_2) + Double.parseDouble(taxRate_3)));
          
          // 税額３
          strIn3 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_3));
          strIn3 = String.valueOf(Double.parseDouble(strIn3) / (Double.parseDouble("100") + Double.parseDouble(taxRate_1) + Double.parseDouble(taxRate_2) + Double.parseDouble(taxRate_3)));
          
          // 端数処理
          // 端数区分が1：四捨五入の場合
          if ("1".equals(taxRoundTyp)){
              // 税額１
              strIn1 = Calculate.round(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // 税額２
              strIn2 = Calculate.round(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // 税額３
              strIn3 = Calculate.round(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);
          // 端数区分が2：切り上げの場合
          } else if ("2".equals(taxRoundTyp)){
              // 税額１
              strIn1 = Calculate.ceil(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // 税額２
              strIn2 = Calculate.ceil(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // 税額３
              strIn3 = Calculate.ceil(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);

          // 端数区分が3：切り捨ての場合
          } else if ("3".equals(taxRoundTyp)){
              // 税額１
              strIn1 = Calculate.floor(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // 税額２
              strIn2 = Calculate.floor(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // 税額３
              strIn3 = Calculate.floor(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);
          }
          // 税込み金額
          ts.setTAX_AMOUNT(amount);
          
          // 税抜き金額
          strIn4 = String.valueOf(Double.parseDouble(amount) - Double.parseDouble(strIn1) - Double.parseDouble(strIn2) - Double.parseDouble(strIn3));
          ts.setTAX_CREDIT_AMOUNT(strIn4);
      // 消費税コードの３桁目 = "0" の場合
      }else if ("0".equals(tempTaxCd)){
          // 外税対象金額
          ts.setEXTERNAL_TAX_AMOUNT("0");
          // 内税対象金額
          ts.setINTERNAL_TAX_AMOUNT("0");
          // 非課税対象金額
          ts.setTAXFREE_AMOUNT(amount);
          // 税額１
          ts.setTAX_AMOUNT_1("0");
          // 税額２
          ts.setTAX_AMOUNT_2("0");
          // 税額３
          ts.setTAX_AMOUNT_3("0");
          // 税込み金額
          ts.setTAX_AMOUNT(amount);
          // 税抜き金額
          ts.setTAX_CREDIT_AMOUNT(amount);
      }
		return ts;
	}
}
