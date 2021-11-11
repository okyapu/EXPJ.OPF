/** 
 *
 * Copyright (c) 2003 NEC Informatec Systems,Ltd.
 * 
 * 2004/01/09 �V�K�쐬 Kim youngtak
 * 
 * �o�[�W�����Ǘ��L�[���[�h�ݒ�
 * $Date: 2008/03/26 07:28:39 $
 * $Revision: 1.5 $
 *
 */
package com.nec.jp.orteus.metamorBase.common06.ExchAmount;

import java.sql.Timestamp;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import com.nec.jp.orteus.metamorBase.common06.util.numberUtil;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageException;

/**
 * �O�݂��~�݂ɕϊ�����N���X�B
 *
 * @author  Kim youngtak
 * @version 1.00
 */
public class ExchAmount
{
	/** �R�l�N�V���� */
	protected IDbConnection _connect = null;

	/** ���z(�ϊ��O) */
	private String s_AMOUNT = "";

	/** ��ЃR�[�h */	
	private String s_COMPANY_CD = "";
	
	/** �ʉ݃R�[�h */
	private String s_CUR_CD = "";
	
	/** �ב֎�� */
	private String s_EXCH_TYP = "";
	
	/** ���z�܂�ߋ敪 */
	private String s_ROUND_TYP = "";
	
	/** �בփ��[�g����p���t */
	private String s_EXCH_DATE = "";

	/** �~�݃t���O */
	private boolean b_ISJPCUR = true;

	/** �������� */
	private int i_DECIMAL_FLG;

    /** �������� Home Currncy*/
	private int iHOME_DECIMAL_FLG;

  
	/** �~�݌v�Z����(DB�ݒ�p-String) */
	private String s_EXCH_AMOUNT = "";	
	
	/** �~�݌v�Z����(��ʕ\���p(�R���}�t��) */
	private String sc_EXCH_AMOUNT = "";
	
	/** �~�݌v�Z����(DB�ݒ�p-Double */
	private double d_EXCH_AMOUNT = 0.0;
	
	/** �~�݌v�Z�pQUERY */
	private String q_EXCH_SQL =
		"SELECT CUR.CUR_CD AS CUR_CD, "+
			"TO_CHAR(CUR.DECIMAL_FIG) AS DECIMAL_FIG, "+
			"TO_CHAR(TO_NUMBER(?)*EXCH.EXCH_RATE) AS AMOUNT_RV "+
		"FROM "+
			"(SELECT CUR_CD, DECIMAL_FIG FROM M_CUR WHERE CUR_CD=?) CUR, "+
			"(SELECT EXCH_RATE FROM M_EXCH_RATE WHERE COMPANY_CD=? AND CUR_CD=? AND EXCH_TYP=? "+
                        "AND EXCH_START_DATE =(SELECT MAX(EXCH_START_DATE) FROM M_EXCH_RATE "+
                        "WHERE COMPANY_CD=? AND CUR_CD=? AND EXCH_TYP=? AND EXCH_START_DATE <= TO_DATE(?))) EXCH ";

	/** �ʉ݃R�[�h�`�F�b�N�pQUERY*/
	private String q_ISJPCUR =
		"SELECT DECODE(JP.HOME_CUR_CD, CUR.CUR_CD, 'TRUE', 'FALSE') ISJPCUR, "+
		"CUR.DECIMAL_FIG DECIMAL_FIG,"+
		"H_CUR.DF "+
		"FROM "+
		"(SELECT HOME_CUR_CD FROM SYS_HOME_CUR WHERE CTRL_CD='SYSTEM') JP, "+
		"(SELECT CUR_CD, DECIMAL_FIG FROM M_CUR WHERE CUR_CD= ?) CUR ,"+
		"(SELECT C.DECIMAL_FIG DF FROM M_CUR C, SYS_HOME_CUR H WHERE H.HOME_CUR_CD=C.CUR_CD) H_CUR ";

	/** �l�̌ܓ� */
	private String q_ROUND =
		"SELECT TO_CHAR(ROUND(TO_NUMBER(?),?)) AS RV "+
		"FROM DUAL";

	/** �؂�グ */
	private String q_ROUNDUP =
		"SELECT TO_CHAR(ceil(TO_NUMBER(?) * power(10,?))/power(10,?)) AS RV "+
		"FROM DUAL";

	/** �؎̂�*/
	private String q_TRUNC =
		"SELECT TO_CHAR(TRUNC(TO_NUMBER(?),?)) AS RV "+
		"FROM DUAL";
		
	/** DOUBLE �v�Z */
	private String q_SUM =
		"SELECT TO_CHAR(TO_NUMBER(?)+TO_NUMBER(?)) AS RV "+
		"FROM DUAL";
		
	private String q_SUB =
		"SELECT TO_CHAR(TO_NUMBER(?)-TO_NUMBER(?)) AS RV "+
		"FROM DUAL";

	private String q_MUL=
		"SELECT TO_CHAR(TO_NUMBER(?)*TO_NUMBER(?)) AS RV "+
		"FROM DUAL";
		
	private String q_DIV =
		"SELECT TO_CHAR(TO_NUMBER(?)/TO_NUMBER(?)) AS RV "+
		"FROM DUAL";		
	
	/**
	 * �I�u�W�F�N�g���\�z����B
	 */
	public ExchAmount(IDbConnection conn){
		this._connect = conn;
	}
					
	/**
	 * �ʉ݃R�[�h�̉~�݃`�F�b�N
	 * 
	 * @param String strCurCd	�ʉ݃R�[�h
	 * @return true/false
	 */
	public boolean isJpCur(String strCurCd) throws SQLException{

		boolean rv = true;
		PreparedStatement stmt = null;
		ResultSet rset = null;					// ���U���g�Z�b�g	
		try{
			// �~�݂ɂ���SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(this.q_ISJPCUR);

			//������ݒ�			
			stmt.setString(1, this.s_CUR_CD);		//�ʉ݃R�[�h

			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ��擾
			while(rset.next()){
				this.setB_ISJPCUR(rset.getString(1));
				String strIsJpCur = rset.getString(1);
                                this.setI_DECIMAL_FLG(Integer.parseInt(rset.getString(2)));
                                this.setIHOME_DECIMAL_FLG(Integer.parseInt(rset.getString(3)));
                                if("FALSE".equals(strIsJpCur)){
					rv = false;
				}
			}

		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {}
			}
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {}
			}
		}		
		return rv;
	}


	/**
	 * ���z�̊ۂߌv�Z
	 * 
	 * @param 	String strAmout		�ϊ��O���z
	 * 			String strCompanyCd	��ЃR�[�h
	 * 			String strCurCd		�ʉ݃R�[�h
	 * 			String strExchTyp	�ב֎��
	 * 			String strRoundTyp	���z�܂�ߋ敪
	 * 			String strExchDate	�בփ��[�g����p���t
	 * @param	true/false
	 */
	public boolean doMarume(String strAmount, String strCompanyCd, String strCurCd, String strExchTyp, String strRoundTyp, String strExchDate) throws SQLException{
		boolean rv = true;
		this.s_AMOUNT = strAmount;
		this.s_COMPANY_CD = strCompanyCd;
		this.s_CUR_CD = strCurCd;
		this.s_EXCH_TYP = strExchTyp;
		this.s_ROUND_TYP = strRoundTyp;
		this.s_EXCH_DATE = strExchDate;
		
		return this.excuteMarume();
	}	
		
		
	private boolean excuteMarume() throws SQLException
	{	
		boolean rv = true;	
                //�ۂߏ��������s��
                this.isJpCur(this.s_CUR_CD);
                String strExchAmount = this.s_AMOUNT;
                strExchAmount = this.doRound(strExchAmount, this.s_ROUND_TYP, this.i_DECIMAL_FLG);
                this.setS_EXCH_AMOUNT(strExchAmount);
                this.setD_EXCH_AMOUNT(Double.parseDouble(strExchAmount));
                this.setSc_EXCH_AMOUNT(numberUtil.encodeNumberFormat(strExchAmount));

		return rv;
	}


	/**
	 * ���z�̉~�݌v�Z
	 * 
	 * @param 	String strAmout		�ϊ��O���z
	 * 			String strCompanyCd	��ЃR�[�h
	 * 			String strCurCd		�ʉ݃R�[�h
	 * 			String strExchTyp	�ב֎��
	 * 			String strRoundTyp	���z�܂�ߋ敪
	 * 			String strExchDate	�בփ��[�g����p���t
	 * @param	true/false
	 */
	public boolean doExchAmount(String strAmount, String strCompanyCd, String strCurCd, String strExchTyp, String strRoundTyp, String strExchDate) throws SQLException{
		boolean rv = true;
		this.s_AMOUNT = strAmount;
		this.s_COMPANY_CD = strCompanyCd;
		this.s_CUR_CD = strCurCd;
		this.s_EXCH_TYP = strExchTyp;
		this.s_ROUND_TYP = strRoundTyp;
		this.s_EXCH_DATE = strExchDate;
		
		return this.excuteExchAmount();		
	}	
		
		
	private boolean excuteExchAmount() throws SQLException
	{	
		boolean rv = true;	
		PreparedStatement stmt = null;
		ResultSet rset = null;			// ���U���g�Z�b�g
		try{
			//�~�̏ꍇ�ۂ߂����B�O�݂̏ꍇ���[�g���Z�{�ۂ�
			if(!this.isJpCur(this.s_CUR_CD)){			

				// �~�݂ɂ���SQL�쐬
				stmt = (_connect.getConn()).prepareStatement(this.q_EXCH_SQL);

				//������ݒ�			
				stmt.setString(1, this.s_AMOUNT);		//�ϊ��O���z
				stmt.setString(2, this.s_CUR_CD);		//�ʉ݃R�[�h
				stmt.setString(3, this.s_COMPANY_CD);	//��ЃR�[�h
				stmt.setString(4, this.s_CUR_CD);		//�ʉ݃R�[�h
				stmt.setString(5, this.s_EXCH_TYP);	//�ב֎��
				stmt.setString(6, this.s_COMPANY_CD);	//��ЃR�[�h
				stmt.setString(7, this.s_CUR_CD);		//�ʉ݃R�[�h
				stmt.setString(8, this.s_EXCH_TYP);	//�ב֎��
				stmt.setString(9, this.s_EXCH_DATE);	//���t

				// SQL���s
				rset = stmt.executeQuery();

              
				String strRoundTyp = this.s_ROUND_TYP;

				// ���ʂ��擾
				int rSize = 0;
				while(rset.next()){
					rSize++;
					String strExchAmount = rset.getString(3);
					int iDpt = Integer.parseInt(rset.getString(2));
					strExchAmount = this.doRound(strExchAmount, strRoundTyp, this.iHOME_DECIMAL_FLG);
					//this.setI_DECIMAL_FLG(Integer.parseInt(rset.getString(2)));
                  System.out.println("*GAIKA:amound="+strExchAmount+"*iDpt:"+this.iHOME_DECIMAL_FLG);		
                  this.setS_EXCH_AMOUNT(strExchAmount);
					this.setD_EXCH_AMOUNT(Double.parseDouble(strExchAmount));
					this.setSc_EXCH_AMOUNT(numberUtil.encodeNumberFormat(strExchAmount));		
				}
				if(rSize == 0){
					rv = false;
				}
			}else{
                                //�~�̏ꍇ�ۂߏ��������s��
                                String strExchAmount = this.s_AMOUNT;
                                strExchAmount = this.doRound(strExchAmount, this.s_ROUND_TYP, this.i_DECIMAL_FLG);
				this.setS_EXCH_AMOUNT(strExchAmount);
				this.setD_EXCH_AMOUNT(Double.parseDouble(strExchAmount));
				this.setSc_EXCH_AMOUNT(numberUtil.encodeNumberFormat(strExchAmount));			
			}
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {}
			}
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {}
			}
		}

		return rv;
	}


	/**
	 * �擾�������z�̂܂�ߏ���
	 * 
	 * @param	String strIn		���z
         * 	        String strRoundTyp	�܂�ߋ敪
	 * 		int iDpt		�����_�ȉ�����
	 * @return rv				�܂�ߏ������� 
	 */
	private String doRound(String strIn, String strRoundTyp, int iDpt) throws IndexOutOfBoundsException,SQLException{
                System.out.println("*strIn:"+strIn+"*strRoundTyp:"+strRoundTyp+"*iDpt:"+iDpt);		
		String rv = strIn;	
		
		if("1".equals(strRoundTyp)){
			//�l�̌ܓ�	
			return this.doRound(rv, iDpt);
		}else if("3".equals(strRoundTyp)){
			//�؎̂�
			return this.doTrunc(rv, iDpt);
		}else{
            //�؂�グ
            return this.doRoundUp(rv, iDpt);
		}
	}

	/**
	 * �؂�グ
	 * 
	 * 
	 */
	public String doRoundUp(String strAmount, int iDpt) throws SQLException{
		String rv = strAmount;
		PreparedStatement stmt = null;
		ResultSet rset = null;					// ���U���g�Z�b�g	
		try{
			// SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(this.q_ROUNDUP);

			//������ݒ�			
			stmt.setString(1, rv);
			stmt.setInt(2, iDpt);
			stmt.setInt(3, iDpt);
			
			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ��擾
			while(rset.next()){
				rv = rset.getString(1);
			}

		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {}
			}
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {}
			}
		}		
		return rv;
	}

	/**
	 * �l�̌ܓ�
	 * 
	 * 
	 */
	public String doRound(String strAmount, int iDpt) throws SQLException{
		String rv = strAmount;
		PreparedStatement stmt = null;
		ResultSet rset = null;					// ���U���g�Z�b�g	
		try{
			// �~�݂ɂ���SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(this.q_ROUND);

			//������ݒ�			
			stmt.setString(1, rv);
			stmt.setInt(2, iDpt);
			
			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ��擾
			while(rset.next()){
				rv = rset.getString(1);
			}

		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {}
			}
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {}
			}
		}		
		return rv;
	}
	
	/**
	 * �؎̂�
	 * 
	 * 
	 */
	public String doTrunc(String strAmount, int iDpt) throws SQLException{
		String rv = strAmount;
		PreparedStatement stmt = null;
		ResultSet rset = null;					// ���U���g�Z�b�g	
		try{
			// �~�݂ɂ���SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(this.q_TRUNC);

			//������ݒ�			
			stmt.setString(1, rv);
			stmt.setInt(2, iDpt);
			
			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ��擾
			while(rset.next()){
				rv = rset.getString(1);
			}

		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {}
			}
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {}
			}
		}		
		return rv;
	}	
	
	/**
	 * SUM
	 * 
	 */
	public String doSum(String sIn1, String sIn2) throws SQLException{
		String rv = "";
		PreparedStatement stmt = null;
		ResultSet rset = null;					// ���U���g�Z�b�g	
		try{
			// �~�݂ɂ���SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(this.q_SUM);

			//������ݒ�			
			stmt.setString(1, sIn1);
			stmt.setString(2, sIn2);
			
			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ��擾
			while(rset.next()){
				rv = rset.getString(1);
			}

		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {}
			}
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {}
			}
		}		
System.out.println("*doSum:"+rv);				
		return rv;

	}	
	
	/**
	 * SUBTRACTION
	 * 
	 */
	public String doSub(String sIn1, String sIn2) throws SQLException{
		String rv = "";
		PreparedStatement stmt = null;
		ResultSet rset = null;					// ���U���g�Z�b�g	
		try{
			// �~�݂ɂ���SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(this.q_SUB);

			//������ݒ�			
			stmt.setString(1, sIn1);
			stmt.setString(2, sIn2);
			
			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ��擾
			while(rset.next()){
				rv = rset.getString(1);
			}

		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {}
			}
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {}
			}
		}		
System.out.println("*doSub:"+rv);				
		return rv;

	}	
	/**
	 * MULTIPLY
	 * 
	 */
	public String doMul(String sIn1, String sIn2) throws SQLException{
		String rv = "";
		PreparedStatement stmt = null;
		ResultSet rset = null;					// ���U���g�Z�b�g	
		try{
			// �~�݂ɂ���SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(this.q_MUL);

			//������ݒ�			
			stmt.setString(1, sIn1);
			stmt.setString(2, sIn2);
			
			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ��擾
			while(rset.next()){
				rv = rset.getString(1);
			}

		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {}
			}
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {}
			}
		}		
System.out.println("*doMul:"+rv);
		return rv;
	}		
	
	/**
	 * DIVIDE
	 * 
	 */
	public String doDiv(String sIn1, String sIn2) throws SQLException{
		String rv = "";
		PreparedStatement stmt = null;
		ResultSet rset = null;					// ���U���g�Z�b�g	
		try{
			// �~�݂ɂ���SQL�쐬
			stmt = (_connect.getConn()).prepareStatement(this.q_DIV);

			//������ݒ�
			//������ݒ�
			stmt.setString(1, sIn1);
			stmt.setString(2, sIn2);
			
			// SQL���s
			rset = stmt.executeQuery();

			// ���ʂ��擾
			while(rset.next()){
				rv = rset.getString(1);
			}

		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {}
			}
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {}
			}
		}	
System.out.println("*doDiv:"+rv);					
		return rv;
	}		

	/**
	 * Returns the d_EXCH_AMOUNT.
	 * @return double
	 */
	public double getD_EXCH_AMOUNT() {
		return d_EXCH_AMOUNT;
	}

	/**
	 * Returns the s_EXCH_AMOUNT.
	 * @return String
	 */
	public String getS_EXCH_AMOUNT() {
		return s_EXCH_AMOUNT;
	}

	/**
	 * Returns the sc_EXCH_AMOUNT.
	 * @return String
	 */
	public String getSc_EXCH_AMOUNT() {
		return sc_EXCH_AMOUNT;
	}

	/**
	 * Sets the d_EXCH_AMOUNT.
	 * @param d_EXCH_AMOUNT The d_EXCH_AMOUNT to set
	 */
	private void setD_EXCH_AMOUNT(double d_EXCH_AMOUNT) {
		this.d_EXCH_AMOUNT = d_EXCH_AMOUNT;
	}

	/**
	 * Sets the s_EXCH_AMOUNT.
	 * @param s_EXCH_AMOUNT The s_EXCH_AMOUNT to set
	 */
	private void setS_EXCH_AMOUNT(String s_EXCH_AMOUNT) {
		this.s_EXCH_AMOUNT = s_EXCH_AMOUNT;
	}

	/**
	 * Sets the sc_EXCH_AMOUNT.
	 * @param sc_EXCH_AMOUNT The sc_EXCH_AMOUNT to set
	 */
	public void setSc_EXCH_AMOUNT(String sc_EXCH_AMOUNT) {
		this.sc_EXCH_AMOUNT = sc_EXCH_AMOUNT;
	}

	/**
	 * Returns the b_ISJPCUR.
	 * @return boolean
	 */
	public boolean isB_ISJPCUR() {
		return b_ISJPCUR;
	}

	/**
	 * Returns the i_DECIMAL_FLG.
	 * @return int
	 */
	private int getI_DECIMAL_FLG() {
		return i_DECIMAL_FLG;
	}

	/**
	 * Returns the iHOME_DECIMAL_FLG.
	 * @return int
	 */
	private int getIHOME_DECIMAL_FLG() {
		return iHOME_DECIMAL_FLG;
	}

	/**
	 * Sets the b_ISJPCUR.
	 * @param b_ISJPCUR The b_ISJPCUR to set
	 */
	private void setB_ISJPCUR(String s_ISJPCUR) {
		if("FALSE".equals(s_ISJPCUR)){
			this.b_ISJPCUR = false;	
		}
	}

	/**
	 * Sets the i_DECIMAL_FLG.
	 * @param i_DECIMAL_FLG The i_DECIMAL_FLG to set
	 */
	private void setI_DECIMAL_FLG(int i_DECIMAL_FLG) {
		this.i_DECIMAL_FLG = i_DECIMAL_FLG;
	}

	/**
	 * Sets the HOME_DECIMAL_FLG.
	 * @param IHOME_DECIMAL_FLG The HOME_DECIMAL_FLG to set
	 */
	private void setIHOME_DECIMAL_FLG(int iHOME_DECIMAL_FLG) {
		this.iHOME_DECIMAL_FLG = iHOME_DECIMAL_FLG;
	}

}
