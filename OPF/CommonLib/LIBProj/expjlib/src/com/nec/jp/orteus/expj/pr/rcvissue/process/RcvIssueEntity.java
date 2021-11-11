/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvIssueEntity.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;


/**
 * <pre>
 * 保管区別入出庫ファイル　データ操作クラス
 * 機能概要：保管区別入出庫ファイルの検索、登録などを行うクラスです。
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.4 $ $Date: 2008/03/26 07:28:03 $
 *
 */
public class RcvIssueEntity {
    private	IDbConnection _iconn;			// トランザクションコネクション情報
    private	Connection _conn;				// コネクション情報
    private	UpdateInfo _updInfo;			// 利用者管理情報(インナークラス)

    private final static BigDecimal bdZero = new BigDecimal("0");    

    /**
     * コンストラクタ
     *
     */
    protected RcvIssueEntity(IDbConnection conn, UpdateInfo iUpdInfo) {
    	_iconn = conn;
    	_conn =	_iconn.getConn();
    	_updInfo = iUpdInfo;
    }    
    
	protected String insert(RcvIssueStruct inData) 
	                     throws SQLException,FoundationException {
		String strOdrCd = "";
		PreparedStatement ps = null;
		try {
			int iIndex = 1;
			Numbering ODR_CD = null;
			String sql = "insert into "
					+ " T_RCV_ISSUE( "
					+ " RCV_ISSUE_CTRL_CD," // 入出庫管理番号
					+ "RCV_ISSUE_TYP," // 入出庫区分
					+ "ITEM_CD," // 品目番号
					+ "PLANT_CD," // 工場コード
					+ "WH_CD," // 保管区コード
					+ "JOB_ODR_CD," // 製番
					+ "JOB_ODR_DETAIL_NO," // 製番枝番
					+ "PUCH_ODR_CD," // 発注番号
					+ "ACPT_NO," // 受入回数
					+ "ACPT_RSLT_CRCT_NO," // 受入実績訂正回数
					+ "INSPEC_RSLT_CRCT_NO," // 検査実績訂正回数
					+ "WORK_ODR_CD," // 作業計画番号
					+ "WORK_IN_PROC_CD," // 仕掛作業コード
					+ "PARTIAL_PRD_NO," // 分作回数
					+ "OPR_RSLT_CRCT_NO," // 作業実績訂正回数
					+ "ISSUE_INST_CD," // 出庫指示番号
					+ "RCV_ISSUE_QTY," // 入出庫数
					+ "RCV_ISSUE_AMOUNT," // 入出庫金額
					+ "RCV_ISSUE_DATE," // 入出庫年月日
					+ "RCV_ISSUE_GNR_TYP," // 入出庫発生区分
					+ "RCV_ISSUE_ODD_QTY," // 入出庫端数
					+ "DEFECT_CAUSE_CD," // 入出庫不良理由コード
					+ "STOCK_UPD_TYP," // 在庫更新区分
					+ "RCV_ISSUE_CMPLT_FLG," // 入出庫完了フラグ
					+ "OD_NO," // オーダデマンド番号
					+ "VEND_LOT_NO," // メーカロット番号
					+ "RCV_ISSUE_COMMENT," // 入出庫備考
					+ "COMPANY_CD," // 会社コード
					+ "VEND_CD," // 取引先コード
					+ "CONS_TYP," // 支給区分
					+ "CONS_EXEC_DATE," // 有償支給実績抽出日
					+ "CREATED_BY," // 作成者
					+ "CREATED_PRG_NM," // 作成プログラム名
					+ "UPDATED_BY," // 更新者
					+ "UPDATED_PRG_NM," // 更新プログラム名
					+ "MODIFY_COUNT," // 更新数
					+ "LOT_NO)"        //  在庫ロット番号
					+ "values ("
					+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			// _log.methodStart();

			if (ps == null) {
				ps = _conn.prepareStatement(sql);
			}

			// 入出庫管理番号の採番
			ODR_CD = new Numbering(_iconn, Numbering.ISSUE_CD, _updInfo.getUpdateBy(), _updInfo.getUpdatePrgNm(),
					inData.m_PLANT_CD);
			strOdrCd = ODR_CD.getNo();

			// << 保管区別入出庫の登録 >>
			ps.setString(iIndex++, strOdrCd); // 入出庫管理番号
			ps.setInt(iIndex++, inData.m_RCV_ISSUE_TYP); // 入出庫区分
			ps.setString(iIndex++, Nvl(inData.m_ITEM_CD)); // 品目番号
			ps.setString(iIndex++, Nvl(inData.m_PLANT_CD)); // 工場コード
			setNvl(iIndex++, inData.m_WH_CD, ps); // 保管区コード
			setNvl(iIndex++, inData.m_JOB_ODR_CD, ps); // 製番
			ps.setDouble(iIndex++, inData.m_JOB_ODR_DETAIL_NO); // 製番枝番
			ps.setString(iIndex++, inData.m_PUCH_ODR_CD); // 発注番号
			ps.setDouble(iIndex++, inData.m_ACPT_NO); // 受入回数
			ps.setDouble(iIndex++, inData.m_ACPT_RSLT_CRCT_NO); // 受入実績訂正回数
			ps.setDouble(iIndex++, inData.m_INSPEC_RSLT_CRCT_NO); // 検査実績訂正回数
			ps.setString(iIndex++, inData.m_WORK_ODR_CD); // 作業計画番号
			ps.setString(iIndex++, inData.m_WORK_IN_PROC_CD); // 仕掛作業コード
			ps.setDouble(iIndex++, inData.m_PARTIAL_PRD_NO); // 分作回数
			ps.setDouble(iIndex++, inData.m_OPR_RSLT_CRCT_NO); // 作業実績訂正回数
			ps.setString(iIndex++, inData.m_ISSUE_INST_CD); // 出庫指示番号
			ps.setBigDecimal(iIndex++, inData.m_RCV_ISSUE_QTY); // 入出庫数
			ps.setBigDecimal(iIndex++, inData.m_RCV_ISSUE_AMOUNT); // 入出庫金額
			setNvl(iIndex++, inData.m_RCV_ISSUE_DATE, ps); // 入出庫年月日
			ps.setInt(iIndex++, inData.m_RCV_ISSUE_GNR_TYP); // 入出庫発生区分
			ps.setBigDecimal(iIndex++, inData.m_RCV_ISSUE_ODD_QTY); // 入出庫端数
			setNvl(iIndex++, inData.m_DEFECT_CAUSE_CD, ps); // 入出庫不良理由コード
			ps.setInt(iIndex++, inData.m_STOCK_UPD_TYP); // 在庫更新区分(更新済み)
			ps.setInt(iIndex++, inData.m_RCV_ISSUE_CMPLT_FLG); // 入出庫完了フラグ
			ps.setString(iIndex++, inData.m_OD_NO); // オーダデマンド番号
			ps.setString(iIndex++, inData.m_VEND_LOT_NO); // メーカロット番号
			ps.setString(iIndex++, inData.m_RCV_ISSUE_COMMENT); // 入出庫備考
			ps.setString(iIndex++, inData.m_COMPANY_CD); // 会社コード
			ps.setString(iIndex++, inData.m_VEND_CD); // 取引先コード
			ps.setDouble(iIndex++, inData.m_CONS_TYP); // 支給区分
			setNvl(iIndex++, inData.m_CONS_EXEC_DATE, ps); // 有償支給実績抽出日
			// -----------------------------------------------------------------
			ps.setString(iIndex++, _updInfo.getUpdateBy()); // 作成者
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm()); // 作成プログラム名
			ps.setString(iIndex++, _updInfo.getUpdateBy()); // 更新者
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm()); // 更新プログラム名
			ps.setDouble(iIndex++, 0); // 更新数
		    ps.setString(iIndex++, inData.m_LOT_NO);                //  在庫ロット番号

			int iCnt = ps.executeUpdate();
			// DEBUG
			// _log.message("保管区別入出庫の登録数=["+iIndex+"]");
			// _log.message(sql);

			ps.close(); // ちょっと工夫する予定。

			// _log.methodEnd();

			return strOdrCd;
		} catch (SQLException e) {
			throw e;
		} catch (FoundationException ee) {
			throw ee;
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				ps = null;
			}
		}
	}
	// -------------------------------------------------------
	//      非公開メソッド
	//-------------------------------------------------------

	/**
	 * １．指定された文字列がNULLの場合、長さ０の文字列を返却します。
	 * ２．指定された文字列がNUllでない場合は、指定された文字列を
	 *     そのまま返却します。
	 */
	private String Nvl(String iStr) {
		String ret_str;
		if (iStr == null) {
			ret_str = "";
		}else{
			ret_str = iStr;
		}
		return ret_str;
		
	}
	/**
	 * １．指定された日付型がNULLの場合、長さ０の文字列を返却します。
	 * ２．指定された日付型がNUllでない場合は、
	 *     指定された文字列(日付)を/付きに変換して返却します。
	 */
	private String Nvl(Date iDate) {
		String ret_str;

		if (iDate == null) {
			ret_str = "";
		}else{
			ret_str = Converter.dateToStr(iDate,Converter.SLASH_DATE);
		}
		return ret_str;
	}
	
	
	/**
	 * PrearedStatmentに、指定された値を設定します。
	 * @param idx    項目位置情報
	 * @param iStr   設定文字列   
	 * @param iPs    PreparedStatement
	 * @throws SQLException
	 *
	 */
	private void setNvl(int idx, String iStr, PreparedStatement iPs) 
	                throws SQLException {
		
		if (iStr == null) {
			iPs.setNull(idx,Types.VARCHAR);
		} else {
			iPs.setString(idx,iStr);
		}
	}
	private void setNvl(int idx, Date iDate, PreparedStatement iPs) 
					throws SQLException {
		
		if (iDate == null) {
			iPs.setNull(idx,Types.DATE);
		} else {
			iPs.setDate(idx,new java.sql.Date(iDate.getTime()));
		}
	}

}
