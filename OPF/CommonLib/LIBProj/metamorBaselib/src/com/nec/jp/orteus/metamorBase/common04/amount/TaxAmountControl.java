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
 * ���Ŋz�v�Z���i
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 08:30:30 $
 */
public class TaxAmountControl {

	/**
	 * �Ŋz�v�Z���i�̃f�t�H���g�R���X�g���N�^�ł��B
	 * ���̃N���X�� static ���\�b�h�݂̂ł���A
	 * ���I�A�N�Z�X�h�~�̂��� private �Ƃ��ăI�[�o�[���C�h���Ă��܂��B
	 */
	private TaxAmountControl() {
	}

	/**
	 * �Ŋz�����擾���܂��B
	 * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
	 * @param amount      ���z�i�K�{�j
	 * @param taxCd       ����ŃR�[�h�i�K�{�j
	 * @param taxRate_1   �ŗ��P�i�K�{�j
	 * @param taxRate_2   �ŗ��Q�i�K�{�j
    * @param taxRate_3   �ŗ��R�i�K�{�j
    * @param taxRoundTyp �[���敪�i�K�{�j
	 * @return �Ŋz���f�[�^�N���X
	 * @throws IllegalArgumentException �K�{�p�����[�^�� null �܂��͋󕶎��̏ꍇ
	 * @throws SQLException �f�[�^�x�[�X�A�N�Z�X�G���[�����������ꍇ
	 * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
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

		// ���z���s���ȏꍇ			
		if (amount == null || amount.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// ����ŃR�[�h���s���ȏꍇ
		if (taxCd == null || taxCd.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �ŗ��P���s���ȏꍇ
		if (taxRate_1 == null || taxRate_1.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �ŗ��Q���s���ȏꍇ
		if (taxRate_2 == null || taxRate_2.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �ŗ��R���s���ȏꍇ
		if (taxRate_3 == null || taxRate_3.length() <= 0) {
			throw new IllegalArgumentException();
		}
		// �[���敪���s���ȏꍇ
		if (taxRoundTyp == null || taxRoundTyp.length() <= 0) {
			throw new IllegalArgumentException();
		} 
		// ���\�b�h���^�[���p�f�[�^�N���X
		TaxAmountStruct ts = new TaxAmountStruct();
      
      // ����ŃR�[�h�̂R����
      String tempTaxCd = taxCd.substring(taxCd.length() - 1, taxCd.length());
      
     
      String strIn1 = "";
      String strIn2 = "";
      String strIn3 = "";
      String strIn4 = "";
      
      // ����ŃR�[�h�̂R���� = "1" �̏ꍇ
      if ("1".equals(tempTaxCd)){
          // �O�őΏۋ��z
          ts.setEXTERNAL_TAX_AMOUNT(amount);
          // ���őΏۋ��z
          ts.setINTERNAL_TAX_AMOUNT("0");
          // ��ېőΏۋ��z
          ts.setTAXFREE_AMOUNT("0");
          
          // �Ŋz�P
          strIn1 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_1));
          strIn1 = String.valueOf(Double.parseDouble(strIn1) / Double.parseDouble("100"));
          
          // �Ŋz�Q
          strIn2 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_2));
          strIn2 = String.valueOf(Double.parseDouble(strIn2) / Double.parseDouble("100"));
          
          // �Ŋz�R
          strIn3 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_3));
          strIn3 = String.valueOf(Double.parseDouble(strIn3) / Double.parseDouble("100"));
          
          // �[������
          // �[���敪��1�F�l�̌ܓ��̏ꍇ
          if ("1".equals(taxRoundTyp)){
              // �Ŋz�P
              strIn1 = Calculate.round(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // �Ŋz�Q
              strIn2 = Calculate.round(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // �Ŋz�R
              strIn3 = Calculate.round(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);
          // �[���敪��2�F�؂�グ�̏ꍇ
          } else if ("2".equals(taxRoundTyp)){
              // �Ŋz�P
              strIn1 = Calculate.ceil(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // �Ŋz�Q
              strIn2 = Calculate.ceil(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // �Ŋz�R
              strIn3 = Calculate.ceil(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);

          // �[���敪��3�F�؂�̂Ă̏ꍇ
          } else if ("3".equals(taxRoundTyp)){
              // �Ŋz�P
              strIn1 = Calculate.floor(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // �Ŋz�Q
              strIn2 = Calculate.floor(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // �Ŋz�R
              strIn3 = Calculate.floor(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);
          }
          // �ō��݋��z
          strIn4 = String.valueOf(Double.parseDouble(amount) + Double.parseDouble(strIn1) + Double.parseDouble(strIn2) + Double.parseDouble(strIn3));
          ts.setTAX_AMOUNT(strIn4);
          
          // �Ŕ������z
          ts.setTAX_CREDIT_AMOUNT(amount);
          
      // ����ŃR�[�h�̂R���� = "5" �̏ꍇ
      }else if ("5".equals(tempTaxCd) || "9".equals(tempTaxCd)){
          // �O�őΏۋ��z
          ts.setEXTERNAL_TAX_AMOUNT("0");
          // ���őΏۋ��z
          ts.setINTERNAL_TAX_AMOUNT(amount);
          // ��ېőΏۋ��z
          ts.setTAXFREE_AMOUNT("0");
          
          // �Ŋz�P
          strIn1 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_1));
          strIn1 = String.valueOf(Double.parseDouble(strIn1) / (Double.parseDouble("100") + Double.parseDouble(taxRate_1) + Double.parseDouble(taxRate_2) + Double.parseDouble(taxRate_3)));
          
          // �Ŋz�Q
          strIn2 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_2));
          strIn2 = String.valueOf(Double.parseDouble(strIn2) / (Double.parseDouble("100") + Double.parseDouble(taxRate_1) + Double.parseDouble(taxRate_2) + Double.parseDouble(taxRate_3)));
          
          // �Ŋz�R
          strIn3 = String.valueOf(Double.parseDouble(amount) * Double.parseDouble(taxRate_3));
          strIn3 = String.valueOf(Double.parseDouble(strIn3) / (Double.parseDouble("100") + Double.parseDouble(taxRate_1) + Double.parseDouble(taxRate_2) + Double.parseDouble(taxRate_3)));
          
          // �[������
          // �[���敪��1�F�l�̌ܓ��̏ꍇ
          if ("1".equals(taxRoundTyp)){
              // �Ŋz�P
              strIn1 = Calculate.round(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // �Ŋz�Q
              strIn2 = Calculate.round(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // �Ŋz�R
              strIn3 = Calculate.round(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);
          // �[���敪��2�F�؂�グ�̏ꍇ
          } else if ("2".equals(taxRoundTyp)){
              // �Ŋz�P
              strIn1 = Calculate.ceil(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // �Ŋz�Q
              strIn2 = Calculate.ceil(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // �Ŋz�R
              strIn3 = Calculate.ceil(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);

          // �[���敪��3�F�؂�̂Ă̏ꍇ
          } else if ("3".equals(taxRoundTyp)){
              // �Ŋz�P
              strIn1 = Calculate.floor(strIn1, 0);
              ts.setTAX_AMOUNT_1(strIn1);
              // �Ŋz�Q
              strIn2 = Calculate.floor(strIn2, 0);
              ts.setTAX_AMOUNT_2(strIn2);
              // �Ŋz�R
              strIn3 = Calculate.floor(strIn3, 0);
              ts.setTAX_AMOUNT_3(strIn3);
          }
          // �ō��݋��z
          ts.setTAX_AMOUNT(amount);
          
          // �Ŕ������z
          strIn4 = String.valueOf(Double.parseDouble(amount) - Double.parseDouble(strIn1) - Double.parseDouble(strIn2) - Double.parseDouble(strIn3));
          ts.setTAX_CREDIT_AMOUNT(strIn4);
      // ����ŃR�[�h�̂R���� = "0" �̏ꍇ
      }else if ("0".equals(tempTaxCd)){
          // �O�őΏۋ��z
          ts.setEXTERNAL_TAX_AMOUNT("0");
          // ���őΏۋ��z
          ts.setINTERNAL_TAX_AMOUNT("0");
          // ��ېőΏۋ��z
          ts.setTAXFREE_AMOUNT(amount);
          // �Ŋz�P
          ts.setTAX_AMOUNT_1("0");
          // �Ŋz�Q
          ts.setTAX_AMOUNT_2("0");
          // �Ŋz�R
          ts.setTAX_AMOUNT_3("0");
          // �ō��݋��z
          ts.setTAX_AMOUNT(amount);
          // �Ŕ������z
          ts.setTAX_CREDIT_AMOUNT(amount);
      }
		return ts;
	}
}
