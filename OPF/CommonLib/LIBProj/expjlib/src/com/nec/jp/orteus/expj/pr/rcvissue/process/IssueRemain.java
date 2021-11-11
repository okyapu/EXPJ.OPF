/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueRemain.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigDecimal;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;

/**
 * <pre>
 * 個別手配分出庫残数・引当済出庫残数の取得クラス
 * </pre>
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.8 $
 *
 **/

public class IssueRemain implements RcvIssueConst{

	/** メンバ変数 */
	private IDbConnection _conn = null;		// コネクション
	private BigDecimal _odrQty = null; 		// オーダ数
	private BigDecimal _totalIssueQty = null;	// 出庫累計数
	private BigDecimal _issueedQty = null;		// 出庫済総数
	private String _jobOdrCd = null;			// 製番
	private int _jobOdrDetailNo = 0;			// 製番枝番
	private final static BigDecimal cZero = new BigDecimal("0");

	/**
	 * <pre>
	 * コンストラクタ
	 * 指定のコネクションを持つオブジェクトを構築する
	 * </pre>
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public IssueRemain(IDbConnection connect){
		_conn = connect;
	}
	
	/**
	 * <pre>
	 * 製番情報格納用インナークラス
	 * 出庫残数、製番、製番枝番
	 * </pre>
	 */
	public class ResultByOd{
		/** 出庫残数 */
		public BigDecimal remainQty;
		
		/** 製番 */
		public String jobOdrCd;
		
		/** 製番枝番 */
		public int jobOdrDetailNo;
	}

	//-------  公開メソッド  -------------------------------
	/**
	 * <pre>
	 * <b>オーダデマンド単位の個別手配分出庫残数の取得</b><br>
	 * 特定のオーダデマンドの個別手配分在庫からの出庫残数を取得する。
	 * </pre>
	 *
	 * @param iOdNo オーダデマンド番号
	 * @return ResultByOd 製番情報格納用インナークラス 取得に失敗した場合はNULL。
	 * @throws SQLException DBアクセスエラー
	 */
	public ResultByOd getRemainQtyByOd(String iOdNo) throws SQLException
	{
		// 引数チェック
		if( !StringUtil.Validate(iOdNo) ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		// [所要量]、[製番引当]からオーダ数、出庫累計数、出庫済数の取得
		if( !read(iOdNo) ){
			// 対象データが存在しない場合
			return null;
			
		}
		
		// 個別手配分出庫残数の計算処理
		calcResult =  _odrQty.subtract(_totalIssueQty.subtract(_issueedQty));
		if( calcResult.compareTo(cZero) < 0 ){
			// 計算結果＜０の場合
			calcResult = cZero;
		}
		
		// 製番情報格納
		ResultByOd resultByOd = new ResultByOd();
		resultByOd.remainQty = calcResult;
		resultByOd.jobOdrCd = _jobOdrCd;
		resultByOd.jobOdrDetailNo = _jobOdrDetailNo;
		
		return resultByOd;
	}

	/**
	 * <pre>
	 * <b>オーダデマンド単位の個別手配分出庫済数の取得</b><br>
	 * 特定のオーダデマンドの個別手配分在庫からの出庫済数を取得する。
	 * </pre>
	 *
	 * @param iOdNo オーダデマンド番号
	 * @return BigDecimal 個別手配分出庫済数 取得に失敗した場合は０。
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getIssuedQtyByOd(String iOdNo) throws SQLException
	{
		// 引数チェック
		if( !StringUtil.Validate(iOdNo) ){
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		// [所要量]、[製番引当]から出庫累計数、出庫済数の取得
		if( !read(iOdNo) ){
			// 対象データが存在しない場合
			return calcResult;
			
		}
		
		// 個別手配分出庫残数の計算処理
		calcResult =  _totalIssueQty.subtract(_issueedQty);
		if( calcResult.compareTo(cZero) < 0 ){
			// 計算結果＜０の場合
			return cZero;
		}
		
		return calcResult;
	}

	/**
	 * <pre>
	 * <b>特定オーダデマンドへの他製番在庫（特定製番）からの引当済出庫残数の取得</b><br>
	 * 特定のオーダデマンドへの特定の製番からの引当済出庫残数を取得する。
	 * </pre>
	 *
	 * @param iOdNo オーダデマンド番号
	 * @param iJobOdrCd 製番
	 * @param iJobOdrDetailNo 製番枝番
	 * @return BigDecimal 個別手配分出庫済数 取得に失敗した場合は０。
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getRemainQtyByJobOdr(String iOdNo, String iJobOdrCd,
											int iJobOdrDetailNo)
		throws SQLException {
		
		// 引数チェック
		if( !StringUtil.Validate(iOdNo) ||
				!StringUtil.Validate(iJobOdrCd) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [製番引当]読込 SQL */
		String sql = 
			"SELECT"
			+" ALCD_QTY,"
			+" ISSUEED_QTY "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND JOB_ODR_CD = ?"
			+" AND JOB_ODR_DETAIL_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
		
		try {
			
			// [製番引当]の読込処理実行
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectStmt.setString(2, iJobOdrCd);
			selectStmt.setInt(3, iJobOdrDetailNo);
			selectRslt = selectStmt.executeQuery();
			
			// 対象データなしの場合
			if( !selectRslt.next() ){
				return calcResult;
			}

			// 検索結果のセット（引当済数、出庫済数）
			BigDecimal alcdQty = selectRslt.getBigDecimal(1);
			BigDecimal issuedQty = selectRslt.getBigDecimal(2);
			
			// 引当済出庫残数の計算処理
			calcResult =  alcdQty.subtract(issuedQty);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>特定のオーダデマンドへの他製番在庫（特定製番）からの出庫済数の取得</b><br>
	 * 製番品の特定のオーダデマンドへの特定の他製番在庫から引当による出庫済数を取得する。
	 * </pre>
	 *
	 * @param iOdNo オーダデマンド番号
	 * @param iJobOdrCd 製番
	 * @param iJobOdrDetailNo 製番枝番
	 * @return BigDecimal 個別手配分出庫済数 取得に失敗した場合は０。
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getIssuedQtyByJobOdr(String iOdNo, String iJobOdrCd,
											int iJobOdrDetailNo)
		throws SQLException {
		
		// 引数チェック
		if( !StringUtil.Validate(iOdNo) ||
				!StringUtil.Validate(iJobOdrCd) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [製番引当]読込 SQL */
		String sql = 
			"SELECT"
			+" ISSUEED_QTY "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND JOB_ODR_CD = ?"
			+" AND JOB_ODR_DETAIL_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
		
		try {
			
			// [製番引当]の読込処理実行
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectStmt.setString(2, iJobOdrCd);
			selectStmt.setInt(3, iJobOdrDetailNo);
			selectRslt = selectStmt.executeQuery();
			
			// 対象データなしの場合
			if( !selectRslt.next() ){
				return calcResult;
			}

			// 検索結果のセット（出庫済数）
			calcResult = selectRslt.getBigDecimal(1);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>特定のオーダデマンドへの品目在庫からの引当済出庫残数の取得</b><br>
	 * 特定のオーダデマンドへの品目在庫からの引当済出庫残数を取得する。
	 * </pre>
	 *
	 * @param iOdNo オーダデマンド番号
	 * @return BigDecimal 個別手配分出庫済数 取得に失敗した場合は０。
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getRemainQtyByItem(String iOdNo)
		throws SQLException {
		
		// 引数チェック
		if( !StringUtil.Validate(iOdNo) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [製番引当]読込 SQL */
		String sql = 
			"SELECT"
			+" ALCD_QTY,"
			+" ISSUEED_QTY "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_ITEM;
		
		try {
			
			// [製番引当]の読込処理実行
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectRslt = selectStmt.executeQuery();
			
			// 対象データなしの場合
			if( !selectRslt.next() ){
				return calcResult;
			}

			// 検索結果のセット（引当済数、出庫済数）
			BigDecimal alcdQty = selectRslt.getBigDecimal(1);
			BigDecimal issuedQty = selectRslt.getBigDecimal(2);
			
			// 引当済出庫残数の計算処理
			calcResult =  alcdQty.subtract(issuedQty);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>特定のオーダデマンドへの品目在庫からの出庫済数の取得</b><br>
	 * 製番品の特定のオーダデマンドへの品目在庫から引当による出庫済数を取得する。
	 * </pre>
	 *
	 * @param iOdNo オーダデマンド番号
	 * @return BigDecimal 個別手配分出庫済数 取得に失敗した場合は０。
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getIssuedQtyByItem(String iOdNo)
		throws SQLException {
		
		// 引数チェック
		if( !StringUtil.Validate(iOdNo) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [製番引当]読込 SQL */
		String sql = 
			"SELECT"
			+" ISSUEED_QTY "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_ITEM;
		
		try {
			
			// [製番引当]の読込処理実行
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectRslt = selectStmt.executeQuery();
			
			// 対象データなしの場合
			if( !selectRslt.next() ){
				return calcResult;
			}

			// 検索結果のセット（出庫済数）
			calcResult = selectRslt.getBigDecimal(1);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>特定のオーダデマンドへの他製番在庫（全製番）からの出庫残数の取得</b><br>
	 * 製番品の特定のオーダデマンドへの全ての他製番在庫から引当による出庫残数を取得する。
	 * </pre>
	 * @param iOdNo オーダデマンド番号
	 * @return BigDecimal 個別手配分出庫済数 取得に失敗した場合は０。
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getRemainQtyByAllJobOdr(String iOdNo)
		throws SQLException {
		
		// 引数チェック
		if( !StringUtil.Validate(iOdNo) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [製番引当]読込 SQL */
		String sql = 
			 "SELECT"
			+" SUM(ALCD_QTY) -"
			+" SUM(ISSUEED_QTY) "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
		
		try {
			
			// [製番引当]の読込処理実行
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectRslt = selectStmt.executeQuery();
			
			// 対象データなしの場合
			selectRslt.next();
			if( selectRslt.getBigDecimal(1) == null ){
				return calcResult;
			}

			// 検索結果のセット（引当済出庫済数）
			calcResult = selectRslt.getBigDecimal(1);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>特定のオーダデマンドへの他製番在庫（全製番）からの出庫済数の取得</b><br>
	 * 製番品の特定のオーダデマンドへの全ての他製番在庫から引当による出庫済数を取得する。
	 * </pre>
	 * @param iOdNo オーダデマンド番号
	 * @return BigDecimal 個別手配分出庫済数 取得に失敗した場合は０。
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getIssuedQtyByAllJobOdr(String iOdNo)
		throws SQLException {
		
		// 引数チェック
		if( !StringUtil.Validate(iOdNo) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [製番引当]読込 SQL */
		String sql = 
			 "SELECT"
			+" SUM(ISSUEED_QTY) "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
		
		try {
			
			// [製番引当]の読込処理実行
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iOdNo);
			selectRslt = selectStmt.executeQuery();
			
			// 対象データなしの場合
			selectRslt.next();
			if( selectRslt.getBigDecimal(1) == null ){
				return calcResult;
			}

			// 検索結果のセット
			calcResult = selectRslt.getBigDecimal(1);
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * <b>製番・品目単位の未引当数の取得</b><br>
	 * 指定した製番・品目の製番在庫数から未引当分の数量を取得する。
	 * </pre>
	 *
	 * @param iPlantCd 工場コード
	 * @param iItemCd 品目番号
	 * @param iJobOdrCd 製番
	 * @param iJobOdrDetailNo 製番枝番
	 * @return BigDecimal 個別手配分出庫済数 取得に失敗した場合は０。
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getFreeStockQtyOfJobOdr(String iPlantCd,  String iItemCd,
											   String iJobOdrCd, int iJobOdrDetailNo)
		throws SQLException {
		
		// 引数チェック
		if( !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) || 
				!StringUtil.Validate(iJobOdrCd)) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		// 製番別手持在庫合計数の取得
		JobOdrStock jobodrstock = new JobOdrStock(_conn);
		BigDecimal nowQty =  jobodrstock.getSumHandQty(iJobOdrCd, iJobOdrDetailNo,
													   iItemCd,   iPlantCd);
		if( nowQty == null ){
			return cZero;
		}
		
		PreparedStatement selectStmtTOd = null;
		ResultSet selectRsltTOd = null;
		PreparedStatement selectStmtTJobOdrAlc = null;
		ResultSet selectRsltTJobOdrAlc = null;
		
		try {
			
			/** [所要量]読込SQL */
			String sqlTOd =
				 "SELECT"
				+" OD_NO "
				+"FROM"
				+" T_OD "
				+"WHERE"
				+" PLANT_CD = ?"
				+" AND ITEM_CD = ?"
				+" AND JOB_ODR_CD = ?"
				+" AND JOB_ODR_DETAIL_NO = ?"
				+" AND PARENT_OD_NO IS NOT NULL"
				+" AND DM_STS_TYP <> " + RcvIssueConst.DM_STS_COMPLETE;
			
			// [所要量]の読込処理実行
			selectStmtTOd = _conn.getConn().prepareStatement(sqlTOd);
			selectStmtTOd.setString(1, iPlantCd);
			selectStmtTOd.setString(2, iItemCd);
			selectStmtTOd.setString(3, iJobOdrCd);
			selectStmtTOd.setInt(4, iJobOdrDetailNo);
			selectRsltTOd = selectStmtTOd.executeQuery();
			
			BigDecimal ownRemainQty = cZero;

			while(selectRsltTOd.next()){
				ownRemainQty = ownRemainQty.add((getRemainQtyByOd(selectRsltTOd.getString(1))).remainQty);
			}
			/** [製番引当]読込 SQL */
			String sqlTJobOdrAlc = 
				 "SELECT"
				+" SUM(ALCD_QTY),"
				+" SUM(ISSUEED_QTY) "
				+"FROM"
				+" T_JOB_ODR_ALC "
				+"WHERE"
				+" PLANT_CD = ?"
				+" AND ITEM_CD = ?"
				+" AND JOB_ODR_CD = ?"
				+" AND JOB_ODR_DETAIL_NO = ?"
				+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
			
			// [製番引当]の読込処理実行
			selectStmtTJobOdrAlc = _conn.getConn().prepareStatement(sqlTJobOdrAlc);
			selectStmtTJobOdrAlc.setString(1, iPlantCd);
			selectStmtTJobOdrAlc.setString(2, iItemCd);
			selectStmtTJobOdrAlc.setString(3, iJobOdrCd);
			selectStmtTJobOdrAlc.setInt(4, iJobOdrDetailNo);
			selectRsltTJobOdrAlc = selectStmtTJobOdrAlc.executeQuery();
			
			selectRsltTJobOdrAlc.next();
			BigDecimal alcRemainQty = cZero;
			if( selectRsltTJobOdrAlc.getBigDecimal(1) != null ){
				// 検索結果のセット（引当済数、出庫済数）
				BigDecimal alcdQty = selectRsltTJobOdrAlc.getBigDecimal(1);
				BigDecimal issuedQty = selectRsltTJobOdrAlc.getBigDecimal(2);
				
				// 引当済出庫残数の計算処理
				alcRemainQty =  alcdQty.subtract(issuedQty);
			}
			
			// 未引当数の計算
			calcResult = (nowQty.subtract(ownRemainQty)).subtract(alcRemainQty);
			
			// 未引当数が０以下の場合
			if( calcResult.compareTo(cZero) <= 0 ){
				return cZero;
			}
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRsltTOd);
			this.closePreparedStatement(selectStmtTOd);
			this.closeResultSet(selectRsltTJobOdrAlc);
			this.closePreparedStatement(selectStmtTJobOdrAlc);
		}
	}

	/**
	 * <pre>
	 * <b>品目在庫の未引当数の取得</b><br>
	 * 指定した品目の在庫数から未引当分の数量を取得する。
	 * </pre>
	 *
	 * @param iPlantCd 工場コード
	 * @param iItemCd 品目番号
	 * @return BigDecimal 個別手配分出庫済数 取得に失敗した場合は０。
	 * @throws SQLException DBアクセスエラー
	 */
	public BigDecimal getFreeStockQtyOfItem(String iPlantCd, String iItemCd) throws SQLException
	{
		
		// 引数チェック
		if( !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		BigDecimal calcResult = cZero;
		
		// 製番別手持在庫合計数の取得
		ItemStock itemstock = new ItemStock(_conn);
		BigDecimal handQty =  itemstock.getSumHandQty(iItemCd, iPlantCd);
		if( handQty == null ){
			handQty = cZero;
		}
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;

		/** [製番引当]読込 SQL */
		String sql = 
			"SELECT"
			+" SUM(ALCD_QTY),"
			+" SUM(ISSUEED_QTY) "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" PLANT_CD = ?"
			+" AND ITEM_CD = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_ITEM;
		
		try {
			
			// [製番引当]の読込処理実行
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iPlantCd);
			selectStmt.setString(2, iItemCd);
			selectRslt = selectStmt.executeQuery();
			
			// 対象データなしの場合
			selectRslt.next();
			BigDecimal freeQty;
			if( selectRslt.getBigDecimal(1) == null ){
				freeQty = cZero;
			} else {
				// 検索結果のセット（引当済数、出庫済数）
				BigDecimal alcdQty = selectRslt.getBigDecimal(1);
				BigDecimal issuedQty = selectRslt.getBigDecimal(2);
				
				// 引当済出庫残数の計算処理
				freeQty =  alcdQty.subtract(issuedQty);
			}
			
			// 未引当数の計算
			calcResult = handQty.subtract(freeQty);
			
			// ０以下の場合は０とする
			if( calcResult.compareTo(cZero) <= 0 ){
				return cZero;
			}
			
			return calcResult;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}

	/**
	 * <pre>
	 * 特定の製番・品目からの引当済出庫残数と製番在庫（手持在庫）を比較して、
	 * 手持在庫が引当済み出庫残数に満たない場合、falseを返却します。
	 * </pre>
	 * @param iPlantCd 工場コード
	 * @param iItemCd 品目番号
	 * @param iJobOdrCd 製番
	 * @param iJobOdrDetailNo 製番枝番
	 * @return true/false 引当済出庫残数＞製番在庫（手持在庫）　のときfalse
	 * @throws SQLException DBアクセスエラー
	 */
	public boolean isEnoughAlcdQty(String iPlantCd,
	                                 String iItemCd,
 			                         String iJobOdrCd,
 			                         int iJobOdrDetailNo) throws SQLException {
 			                             
 		boolean ret;	                             
 			                             
 		//指定された製番・品目の引当済み出庫残数の取得	             
	    BigDecimal w_RemainQty = this.getRemainQtyOfJobOdr(iPlantCd,iItemCd,iJobOdrCd,iJobOdrDetailNo);
	    
	    //指定された品目の製番在庫（手持在庫）の取得
	    JobOdrStock wStock = new JobOdrStock(_conn);
	    BigDecimal w_HandQty = wStock.getSumHandQty(iJobOdrCd,iJobOdrDetailNo,iItemCd,iPlantCd);
	    if (w_HandQty == null) {
	        w_HandQty = new BigDecimal("0");
	    }
	    
	    if (w_RemainQty.compareTo(w_HandQty) > 0) {
	        ret = false;
	    } else {
	        ret = true;
	    }
	    return ret;
	}
	

	//-------  非公開メソッド  -------------------------------
	/**
	 * メンバ変数の初期化
	 */
	private void initialize()
	{
		_odrQty = new BigDecimal("0");
		_totalIssueQty = new BigDecimal("0");
		_issueedQty = new BigDecimal("0");
		_jobOdrCd = "";
		_jobOdrDetailNo = 0;
	}

	/**
	 * <pre>
	 * <b>特定の製番・品目からの引当済出庫残数の取得</b>
	 * </pre>
	 * @param iPlantCd 工場コード
	 * @param iItemCd 品目番号
	 * @param iJobOdrCd 製番
	 * @param iJobOdrDetailNo 製番枝番
	 * @return BigDecimal 引当済出庫残数 取得に失敗した場合は０
	 * @throws SQLException DBアクセスエラー
	 */
	private BigDecimal getRemainQtyOfJobOdr(String iPlantCd, String iItemCd,
											String iJobOdrCd, int iJobOdrDetailNo) throws SQLException
	{
		// 引数チェック
		if( !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ||
				!StringUtil.Validate(iJobOdrCd)) {
			IllegalArgumentException e = new IllegalArgumentException(this.getClass().getName());
			throw e;
		}
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		
		// [製番引当]読込(計算)用SQL
		String sql =
			 "SELECT"
			+" SUM(ALCD_QTY)-SUM(ISSUEED_QTY) "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" PLANT_CD =?"
			+" AND ITEM_CD = ?"
			+" AND JOB_ODR_CD = ?"
			+" AND JOB_ODR_DETAIL_NO = ?"
			+" AND ALC_STOCK_TYP = " + RcvIssueConst.ALC_STOCK_JOB_ODR;
		
		try{

			BigDecimal calcResult = cZero;
			
			// [製番引当]の読込(計算)処理実行
			selectStmt = _conn.getConn().prepareStatement(sql);
			selectStmt.setString(1, iPlantCd);
			selectStmt.setString(2, iItemCd);
			selectStmt.setString(3, iJobOdrCd);
			selectStmt.setInt(4, iJobOdrDetailNo);
			selectRslt = selectStmt.executeQuery();
			
			selectRslt.next();
			if( selectRslt.getBigDecimal(1) != null ){
				calcResult = selectRslt.getBigDecimal(1);
			}
			
			return calcResult;
			
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * <pre>
	 * <b>オーダ数、出庫累計数、出庫済総数の取得</b><br>
	 * 特定のオーダデマンドのオーダ数、出庫累計数、出庫済総数
	 * を取得する。
	 * </pre>
	 *
	 * @param iOdNo オーダデマンド番号
	 * @return boolean true/false 対象データが存在しない場合false
	 * @throws SQLException DBアクセスエラー
	 */
	private boolean read(String iOdNo) throws SQLException
	{
		
		PreparedStatement selectStmtTOd = null;
		ResultSet selectRsltTOd = null;
		PreparedStatement selectStmtTJobOdrAlc = null;
		ResultSet selectRsltTJobOdrAlc = null;


		/** [所要量]読込 SQL */
		String sqlTOd = 
			"SELECT"
			+" ODR_QTY,"
			+" TOTAL_ISSUE_QTY,"
			+" JOB_ODR_CD,"
			+" JOB_ODR_DETAIL_NO "
			+"FROM"
			+" T_OD "
			+"WHERE"
			+" OD_NO = ?";

		/** [製番引当]読込 SQL */
		String sqlTJobOdrAlc = 
			"SELECT"
			+" SUM(ISSUEED_QTY) "
			+"FROM"
			+" T_JOB_ODR_ALC "
			+"WHERE"
			+" OD_NO = ?";
		
		try {
			initialize();
			
			// [所要量]の読込処理実行
			selectStmtTOd = _conn.getConn().prepareStatement(sqlTOd);
			selectStmtTOd.setString(1, iOdNo);
			selectRsltTOd = selectStmtTOd.executeQuery();

			// 検索結果のセット（オーダ数、出庫累計数）
			if(selectRsltTOd.next()){
				_odrQty = selectRsltTOd.getBigDecimal(1);
				_totalIssueQty = selectRsltTOd.getBigDecimal(2);
				_jobOdrCd = selectRsltTOd.getString(3);
				_jobOdrDetailNo = selectRsltTOd.getInt(4);
			} else {
				return false;
			}
			
			// [製番引当]の読込処理実行
			selectStmtTJobOdrAlc = _conn.getConn().prepareStatement(sqlTJobOdrAlc);
			selectStmtTJobOdrAlc.setString(1, iOdNo);
			selectRsltTJobOdrAlc = selectStmtTJobOdrAlc.executeQuery();

			// 検索結果のセット（出庫済総数）
			selectRsltTJobOdrAlc.next();
			if(selectRsltTJobOdrAlc.getBigDecimal(1) != null){
				_issueedQty = selectRsltTJobOdrAlc.getBigDecimal(1);
			} else {
				_issueedQty = cZero;
			}
			
			return true;

		} finally {
			this.closeResultSet(selectRsltTOd);
			this.closePreparedStatement(selectStmtTOd);
			this.closeResultSet(selectRsltTJobOdrAlc);
			this.closePreparedStatement(selectStmtTJobOdrAlc);
		}
	}
	
	/**
	 * プリペアドステートメントを閉じる
	 *
	 * @param statement 閉じる対象のステートメント
	 */
	private void closePreparedStatement(PreparedStatement statement)
	{
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				statement = null;
			}
		}
	}
	
	/**
	 * リザルトセットを閉じる
	 *
	 * @param resultset 閉じる対象のリザルトセット
	 */
	private void closeResultSet(ResultSet resultset)
	{
		if (resultset != null) {
			try {
				resultset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				resultset = null;
			}
		}
	}
}
