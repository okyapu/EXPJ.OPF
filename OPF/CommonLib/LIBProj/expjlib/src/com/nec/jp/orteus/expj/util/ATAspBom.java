/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ATAspBom.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 * Copyright (c) 2003-2004 NEC Nexsolution Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;


//
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.DateTimeFormat;
import com.nec.jp.orteus.expj.util.ATCommonOd.Log;
import com.nec.jp.orteus.expj.util.ATCommonOd.UserInfo;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;


/**
 *(#)ATAspBom.java
 *
 * Copyright (c) 2008 NEXS,Ltd.
 *
 * @author nexs.ima
 * Date : 2008/10/09
 * @version 1.01
 * History 
 * <pre>
 * 2008/09/29 �d�l�ύX�iIssueLt�̎擾��ύX�j nexs.ima
 * 2008/10/09 ��zLT�A�\��LT�擾���\�b�h�ǉ� nexs.ima
 *   
 * ASP����BOM�̏����擾����
 *	 - ���oLT�iTASK3_EXPR�j�̎��ԁi���j���擾����			getIssueLtMin
 *	 - ��zLT�iTASK1_EXPR�j�̎��ԁi���j���擾����			getOdrLtMin
 *	 - �\��LT�iTIMECONSTRAINT_MIN�j�̎��ԁi���j���擾����	getPsLtMin
 *	 - ����LT�iTASK2_EXPR�j�̎��ԁi���j���擾����			getProdLtMin
 *
 * �EFor AT Chk:20081111
 *
 *  
 *  
 * </pre>
 *
 */

public class ATAspBom {
	private IDbConnection _iconn;				 // �g�����U�N�V�����R�l�N�V�������
	private Connection _conn;					 // �R�l�N�V�������
	private String _plantCd;					 // �H��R�[�h
	private UserInfo _userInfo; 				 // ���p�ҊǗ����(�C���i�[�N���X)
	private Log _log;							 // ���O���(�C���i�[�N���X)
	
	public ATAspBom(IDbConnection conn, 
			String plantCd, 
			String userId, 
			String businessName) {

		_iconn = conn;
		_conn = _iconn.getConn();
		_plantCd = plantCd;
		_userInfo = new UserInfo(userId,businessName);

		// ���O�p���i�̏��������s��
		String packageName = this.getClass().getName();
		packageName = packageName.substring(0,packageName.lastIndexOf("."));
		_log = new Log(packageName,_iconn); 										// 2003/08/11
	}

	
	//--------------------------------------
	/**
	 * ���oLT�iTASK3_EXPR�j�̎��ԁi���j���擾����
	 *
	 * �E���R�[�h���Ȃ���΂O�Ƃ���
	 *
	 * @param itemCd  �i�ڔԍ�
	 * @param instructionTyp  �w�}��ʁi"U"�Œ�j
	 * @return �����o��LT���ԁi���j
	 * @throws SQLException
	 */
	public String getIssueLtMin(String itemCd, String instructionTyp)
	throws SQLException {
		
		String task3Expr;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		// ���oLT
		String sql = ""
			+ "select NVL(REPLACE(REPLACE(TASK3_EXPR,'H'),'h'),'0') AS TASK3_EXPR " 
			+ "from M_ASP_BOM "
			+ "where ITEM_CD = ? "
			+ "and INSTRUCTION_TYP = ? ";
		ps = _conn.prepareStatement(sql);
		ps.setString(1, itemCd);
		ps.setString(2, instructionTyp);
		rs = ps.executeQuery();
		if(rs.next()==true) {
		//if( rs.= 0 ) {
			task3Expr = rs.getString("TASK3_EXPR");
		}else{
			task3Expr = "0";
		}
		rs.close();
		ps.close();
		
		
		// Hour��Min
		String sExp = "60";
		String min = Calculate.multiply(sExp , task3Expr);
		min = Calculate.ceil(min, 0);
		return min;
	}

	

	//--------------------------------------
	/**
	 * ��zLT�iTASK1_EXPR�j�̎��ԁi���j���擾����
	 * 
	 * �E���R�[�h���Ȃ���΂O�Ƃ���
	 *
	 *�@2008/10/09 add
	 *
	 * @param itemCd  �i�ڔԍ�
	 * @param instructionTyp  �w�}��ʁi"U"�Œ�j
	 * @return ��zLT���ԁi���j
	 * @throws SQLException
	 */
	public String getOdrLtMin(String itemCd, String instructionTyp)
	throws SQLException {
		
		String task1Expr;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		// ��zLT
		String sql = ""
			+ "select NVL(REPLACE(REPLACE(TASK1_EXPR,'H'),'h'),'0') AS TASK1_EXPR " 
			+ "from M_ASP_BOM "
			+ "where ITEM_CD = ? "
			+ "and INSTRUCTION_TYP = ? ";
		ps = _conn.prepareStatement(sql);
		ps.setString(1, itemCd);
		ps.setString(2, instructionTyp);
		rs = ps.executeQuery();
		if(rs.next()==true) {
		//if( rs.= 0 ) {
			task1Expr = rs.getString("TASK1_EXPR");
		}else{
			task1Expr = "0";
		}
		rs.close();
		ps.close();
		
		
		// Hour��Min
		String sExp = "60";
		String min = Calculate.multiply(sExp , task1Expr);
		min = Calculate.ceil(min, 0);
		return min;
	}

	//--------------------------------------
	/**
	 * �\��LT�iTIMECONSTRAINT_MIN�j�̎��ԁi���j���擾����
	 * 
	 * �E���R�[�h���Ȃ���΂O�Ƃ���
	 *
	 *�@2008/10/09 add
	 *
	 * @param pItemCd  �e�i�ڔԍ�
	 * @param cItemCd  �q�i�ڔԍ�
	 * @param instructionTyp  �w�}��ʁi"I"�Œ�j
	 * @return �\��LT���ԁi���j
	 * @throws SQLException
	 */
	public String getPsLtMin(String pItemCd, String cItemCd, String instructionTyp)
	throws SQLException {
		
		String timeConst;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		// �\��LT
		String sql = ""
			+ "select NVL(REPLACE(REPLACE(TIMECONSTRAINT_MIN,'H/M'),'h/m'),'0') AS TIMECONSTRAINT_MIN " 
			+ "from M_ASP_BOM "
			+ "where ITEM_CD = ? "
			+ "and ITEMORRES_CD = ? "
			+ "and INSTRUCTION_TYP = ? ";
		ps = _conn.prepareStatement(sql);
		ps.setString(1, pItemCd);
		ps.setString(2, cItemCd);
		ps.setString(3, instructionTyp);
		rs = ps.executeQuery();
		if(rs.next()==true) {
		//if( rs.= 0 ) {
			timeConst = rs.getString("TIMECONSTRAINT_MIN");
		}else{
			timeConst = "0";
		}
		rs.close();
		ps.close();
		
		
		// Hour��Min
		String sExp = "60";
		String min = Calculate.multiply(sExp , timeConst);
		min = Calculate.ceil(min, 0);
		return min;
	}
	
	//--------------------------------------
	
	//--------------------------------------
	/**
	 * <pre>
	 * ����LT�iTASK2_EXPR�j�̎��ԁi���j���擾����
	 * 
	 * �E���R�[�h���Ȃ���΂O�Ƃ���
	 * �ETASK2_EXPR�F �z��̐ݒ�l '99.99hp + 99.99h'�F��ᕪ + �Œ蕪
	 * 
	 *�@2008/11/11 add
	 *�@2009/01/22 upd �P�ʐ��iunitQty�j��Dummy�ƂȂ����B
	 *					�g��Ȃ��d�l�ɕύX�i�����ł͒P�ʐ��F�P�Ƃ��ď����j 
	 *
	 * </pre>
	 * @param itemCd  �i�ڔԍ�
	 * @param odrQty  ��z��
	 * @param unitQty  �P�ʐ�
	 * @param instructionTyp  �w�}��ʁi"U"�Œ�j
	 * @return ����LT���ԁi���j
	 * @throws SQLException
	 */
	public String getProdLtMin(String itemCd, String odrQty, String unitQty, String instructionTyp)
	throws SQLException {
		
		String propLt;
		String fixLt;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		// �\��LT
		String sql = ""
			+ "select " 
			+ "NVL(TRIM(SUBSTR(TASK2_EXPR, 1, INSTR(TASK2_EXPR,'hp') - 1)),'0') AS PROPLT, " 
			+ "NVL(TRIM(REPLACE(SUBSTR(TASK2_EXPR, INSTR(TASK2_EXPR,'+') + 1) , 'h')),'0') AS FIXLT " 
			+ "from M_ASP_BOM "
			+ "where ITEM_CD = ? "
			+ "and INSTRUCTION_TYP = ? ";
		ps = _conn.prepareStatement(sql);
		ps.setString(1, itemCd);
		ps.setString(2, instructionTyp);
		rs = ps.executeQuery();
		if(rs.next()==true) {
			propLt = rs.getString("PROPLT");
			fixLt = rs.getString("FIXLT");
		}else{
			propLt = "0";
			fixLt = "0";
		}
		rs.close();
		ps.close();
		
		
		// Hour��Min
		String sExp = "60";
		String fixLtw = Calculate.multiply(sExp , fixLt);
		String propLtw = Calculate.multiply(sExp , propLt);	
		//String dividew = Calculate.divide(odrQty , unitQty, 4); //4:Calculate._ROUND
		
		// CHG 20090122----�P�ʐ��P�Œ�Ƃ��ď�������d�l�ɕύX
		//String dividew = Calculate.divide(odrQty , unitQty, 10, Calculate._CEIL);
		//String min = Calculate.add(Calculate.multiply(propLtw, dividew), fixLtw );
		String min = Calculate.add(Calculate.multiply(propLtw, odrQty), fixLtw );
		
		//min = Calculate.ceil(min, 0);
		min = Calculate.round(min, 0);	//CHG 20081215
		return min;
	}
	
	//--------------------------------------	
	/**
	 *�@���[�U���ێ��p�N���X(�C���i�[�N���X)
	 */
	class UserInfo {

		private String userId;			   // ���[�UID
		private String businessName;	   // �Ɩ���

		public UserInfo(String userId, String businessName) {
			this.userId = userId;
			this.businessName = businessName;
		}
		public String getUserId() {
			return userId;
		}
		public String getBusinessName() {
			return businessName;
		}
	}
	/**
	 * ���O�o��(�C���i�[�N���X)
	 */
	class Log {
		private int indent = 0;
		private SystemLog _syslog = new SystemLog();   // �������O�o�̓N���X

		// �R���X�g���N�^	  // 2003/08/11 connection�擾���C��
		public Log(String packageName,IDbConnection conn){
			// ���� ������
			_syslog.init(packageName);
			_syslog.setConnection(conn);
		}

		public void methodStart() {
			log("start");
			indent++;
		}
		public void methodEnd() {
			indent--;
			log("end");
		}
		public void message(String message) {
			log(message);
		}
		private void log(String message) {

			// ���̃��\�b�h���Ăяo�������\�b�h���擾
			// (JDK1.3�̏ꍇSecurityManager#getStackTrace()���g��)
			StackTraceElement e = (new Throwable()).getStackTrace()[2];
			String className = e.getClassName();
			String methodName = e.getMethodName();

			// �p�b�P�[�W���������N���X�����擾
			StringTokenizer st = new StringTokenizer(className, ".");
			String lastClassName = "";
			while (st.hasMoreTokens()) {
				lastClassName = st.nextToken();
			}
			// ���̎��Ԃ��擾
			Date now = new Date();
			SimpleDateFormat f = new SimpleDateFormat("M/d HH:mm:ss.SSS");
			String sNow = f.format(now);
			String out = sNow + " <" + indent + "> [" + lastClassName + "/" + methodName + "] " +  message;

			// ���� ���O�o��
			_syslog.fine_d( out, _userInfo.getUserId() );

			// ���O�o��(System.out��)
			//System.out.println(out);
		}
	}
}
