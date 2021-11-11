/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/ValidateWh.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;

/**
 * <pre>
 * 有効保管区の規定値取得クラス
 * 保管区の有効規定値を取得することができます。
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.7 $ $Date: 2009/11/04 09:54:44 $
 *
 **/

public class ValidateWh implements RcvIssueConst{

	/**
	 * コンストラクタ
	 */
	private ValidateWh(){
	}

	//-------  公開メソッド  -------------------------------

	/**
	 * <pre>
	 * 自動出庫の出庫保管区順を取得する。
	 * 工場コード、品目コードを元に下記処理を実行して保管区コードを取得する。
	 * getPriorityByItem()⇒getMrpAscAll()の順で処理を実行し、
	 * データが存在した時点で処理終了。
	 * </pre>
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @param iItemCd	   品目番号
	 * @return List 出庫元保管区コード<br>データが存在しない場合はサイズ0のList。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final List getAutoIssue(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		List outList;

		// 引数チェック
		if( iConnect == null || !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getAutoIssue()");
			throw e;
		}

		// ①工場コード、品目番号、所要量計算対象フラグを元に
		//	 [品目別保管先優先順位]、[保管区]から保管区コード一覧を
		//	 優先順位番号の昇順で取得する。
		outList = getPriorityByItem(iConnect, iPlantCd, iItemCd, RcvIssueConst.SORT_ASC);
		if( outList.size() > 0 ){
			return outList;
		}

		// ②所要量計算対象フラグがON（1:所要量計算対象）の保管区コード一覧を
		//	 [保管区]から保管区コードの昇順で取得する。
		outList = getMrpAscAll(iConnect, iPlantCd);
		if( outList.size() > 0 ){
			return outList;
		}

		// 1件もデータが存在しなかった場合処理終了
		return outList;

	}

	/**
	 * <pre>
	 * 余剰在庫一括振替の振替保管区順を取得する。
	 * 工場コード、品目コードを元に下記処理を実行して保管区コードを取得する。
	 * getMrpDescExceptPriority()⇒getPriorityByItem()の順で処理を実行し、
	 * 取得したデータ全てを保管区コードの降順で返却する。
	 * </pre>
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @param iItemCd	   品目番号
	 * @return List 出庫元保管区コード<br>データが存在しない場合はサイズ0のList。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final List getFree(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		List outList = new ArrayList();
		List wkList;

		// 引数チェック
		if( iConnect == null || !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getFree()");
			throw e;
		}

		// ①所要量計算対象フラグがON（1:所要量計算対象）かつ[品目別保管先優先順位]に未登録の
		//	 保管区コード一覧を[保管区]から保管区コードの降順で取得する。
		wkList = getMrpDescExceptPriority(iConnect, iPlantCd, iItemCd);
		if( wkList.size() > 0 ){
			for( int i=0; i<wkList.size(); i++ ){
				outList.add((String)wkList.get(i));
			}
			wkList.clear();
		}

		// ②工場コード、品目番号、所要量計算対象フラグを元に
		//	 [品目別保管先優先順位]、[保管区]から保管区コード一覧を
		//	 優先順位番号の降順で取得する。
		wkList = getPriorityByItem(iConnect, iPlantCd, iItemCd, RcvIssueConst.SORT_DESC);
		if( wkList.size() > 0 ){
			for( int i=0; i<wkList.size(); i++ ){
				outList.add((String)wkList.get(i));
			}
			wkList.clear();
		}

		// 1件もデータが存在しなかった場合処理終了
		if( outList.size() <= 0 ){
			return outList;
		}

		return outList;

	}

	/**
	 * <pre>
	 * デフォルト入庫保管区を取得する。
	 * 工場コード、品目コードを元に下記処理を実行して保管区コードを取得する。
	 * getPriorityByItem()⇒getInsideTypical()⇒getMinimum()の順で処理を実行し、
	 * データが存在した時点で処理終了。
	 * </pre>
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @param iItemCd	   品目番号
	 * @return String 入庫元保管区コード<br>データが存在しない場合は空文字。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final String getDefaultOprWh(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		List outList;
		String outWhCd = "";

		// 引数チェック
		if( iConnect == null || !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getDefaultIssue()");
			throw e;
		}

		// ①getRcvByItem() を実行
		outWhCd = getRcvByItem(iConnect, iPlantCd, iItemCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// ②getInsideTypical() を実行
		outWhCd = getInsideTypical(iConnect, iPlantCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// ③getMinimum() を実行
		outWhCd = getMinimum(iConnect, iPlantCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// 1件もデータが存在しなかった場合処理終了
		return outWhCd;

	}

	/**
	 * <pre>
	 * デフォルト受け入れ保管区を取得する。
	 * 工場コード、品目コードを元に下記処理を実行して保管区コードを取得する。
	 * getRcvByItem()⇒getOutsideTypical()⇒getMinimum()の順で処理を実行し、
	 * データが存在した時点で処理終了。
	 * </pre>
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @param iItemCd	   品目番号
	 * @return String 出庫元保管区コード<br>データが存在しない場合は空文字。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final String getDefaultRcv(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		List outList;
		String outWhCd = "";

		// 引数チェック
		if( iConnect == null || !StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getDefaultIssue()");
			throw e;
		}

		// ①getRcvByItem() を実行
		outWhCd = getRcvByItem(iConnect, iPlantCd, iItemCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// ②getOutsideTypical() を実行
		outWhCd = getOutsideTypical(iConnect, iPlantCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// ③getMinimum() を実行
		outWhCd = getMinimum(iConnect, iPlantCd);
		if( !"".equals(outWhCd) ){
			return outWhCd;
		}

		// 1件もデータが存在しなかった場合処理終了
		return outWhCd;

	}

	/**
	 * 工場コード、所要量計算対象フラグを元に[保管区]から最小の保管区コードを取得する。
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @return String 保管区コード([保管区]."保管区コード"の最も小さい保管区コード)<br>データが存在しない場合は空文字。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final String getMinimum(IDbConnection iConnect, String iPlantCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// 引数チェック
		if( iConnect == null || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getMinimum()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		String outWhCd = "";

		// [保管区]データ読込のSQL
		// 検索条件：工場コード、所要量計算対象フラグ⇒1
		String selectMWh =
			"select"
				+ " MIN(M_WH.WH_CD) "
				+ "from"
				+ " M_WH "
				+ "where"
				+ " M_WH.PLANT_CD = ?"
				+ " and M_WH.MRP_FLG = ?";
		try {
			// データ読込のSQL作成
			ps = conn.prepareStatement(selectMWh);
			ps.setString(1, iPlantCd);
			ps.setInt(2, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// 存在チェック
			rs.next();
			if(rs.getString(1) == null){
				return outWhCd;
			}

			// 結果を設定
			outWhCd = rs.getString(1);

			return outWhCd;

		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	/**
	 * <pre>
	 * 工場コード、品目番号、所要量計算対象フラグを元に
	 * [品目別保管先優先順位]、[保管区]から保管区コード一覧を
	 * 優先順位番号の昇順または降順で取得する。
	 * </pre>
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @param iItemCd		品目番号
	 * @param iSortTyp		ソートフラグ TRUE：昇順、FALSE：降順
	 * @return List	優先保管区コード([品目別保管先優先順位]."品目別保管先優先順位"の昇順or降順)<br>データが存在しない場合はリストサイズが0。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final List getPriorityByItem(IDbConnection iConnect, String iPlantCd, String iItemCd, boolean iSortTyp)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// 引数チェック
		if( iConnect == null ||
			!StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getPriorityByItem()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		List outList = new ArrayList();

		// [品目別保管先優先順位]データ読込のSQL
		// 検索条件：工場コード、保管区コード、所要量計算対象フラグ⇒1
		// ソートタイプの設定
		String selectMWhPriority = "";
		if( iSortTyp ){
			selectMWhPriority =
			"select"
				+ " M_WH_PRIORITY.WH_CD "
				+ "from"
				+ " M_WH_PRIORITY, "
				+ " M_WH "
				+ "where"
				+ " M_WH_PRIORITY.WH_CD = M_WH.WH_CD"
				+ " and M_WH_PRIORITY.PLANT_CD = ?"
				+ " and M_WH_PRIORITY.ITEM_CD = ?"
				+ " and M_WH.MRP_FLG = ? "
				+ "order by "
				+ " M_WH_PRIORITY.WH_PRIORITY_REF_NO ASC";
		} else {
			selectMWhPriority =
			"select"
				+ " M_WH_PRIORITY.WH_CD "
				+ "from"
				+ " M_WH_PRIORITY, "
				+ " M_WH "
				+ "where"
				+ " M_WH_PRIORITY.WH_CD = M_WH.WH_CD"
				+ " and M_WH_PRIORITY.PLANT_CD = ?"
				+ " and M_WH_PRIORITY.ITEM_CD = ?"
				+ " and M_WH.MRP_FLG = ? "
				+ "order by "
				+ " M_WH_PRIORITY.WH_PRIORITY_REF_NO DESC";
		}
		try {		
			// データ読込のSQL作成
			ps = conn.prepareStatement(selectMWhPriority);
			ps.setString(1, iPlantCd);
			ps.setString(2, iItemCd);
			ps.setInt(3, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// 存在チェック
			if(rs.next()){
				// 結果を設定
				outList.add(rs.getString(1));
				while(rs.next()){
					// データを取得
					outList.add(rs.getString(1));
				}
			}

			return outList;

		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	/**
	 * <pre>
	 * 工場コード、品目番号、所要量計算対象フラグを元に
	 * [品目別入庫先保管区]、[保管区]から保管区コードを取得する。
	 * </pre>
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @param iItemCd		品目番号
	 * @return String	品目別入庫先保管区コード<br>データが存在しない場合は空文字。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final String getRcvByItem(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// 引数チェック
		if( iConnect == null ||
			!StringUtil.Validate(iPlantCd) || !StringUtil.Validate(iItemCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getRcvByItem()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		String outWhCd = "";

		// [品目別保管先優先順位]データ読込のSQL
		// 検索条件：工場コード、保管区コード、所要量計算対象フラグ⇒1
		String selectMItemRcvWh =
			"select"
				+ " M_ITEM_RCV_WH.WH_CD "
				+ "from"
				+ " M_ITEM_RCV_WH, "
				+ " M_WH "
				+ "where"
				+ " M_ITEM_RCV_WH.WH_CD = M_WH.WH_CD"
				+ " and M_ITEM_RCV_WH.PLANT_CD = ?"
				+ " and M_ITEM_RCV_WH.ITEM_CD = ?"
				+ " and M_WH.MRP_FLG = ?";
		try {
			// データ読込のSQL作成
			ps = conn.prepareStatement(selectMItemRcvWh);
			ps.setString(1, iPlantCd);
			ps.setString(2, iItemCd);
			ps.setInt(3, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// 存在チェック
			if(rs.next()){
				// 結果を設定
				outWhCd = rs.getString(1);
			}

			return outWhCd;

		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	/**
	 * <pre>
	 * 工場コード、所要量計算対象フラグ、内作代表フラグを元に
	 * [保管区]から内作代表の保管区コードを取得する。
	 * </pre>
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @return String 内作代表保管区コード<br>データが存在しない場合は空文字。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final String getInsideTypical(IDbConnection iConnect, String iPlantCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// 引数チェック
		if( iConnect == null || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getInsideTypical()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		String outWhCd = "";

		// [品目別保管先優先順位]データ読込のSQL
		// 検索条件：工場コード、所要量計算対象フラグ⇒1、内作代表フラグ⇒1
		String selectMWh =
			"select"
				+ " MIN(M_WH.WH_CD) "
				+ "from"
				+ " M_WH "
				+ "where"
				+ " M_WH.PLANT_CD = ?"
				+ " and M_WH.MRP_FLG = ?" 
				+ " and M_WH.WH_INSIDE_FLG = ?";
		try {
			// データ読込のSQL作成
			ps = conn.prepareStatement(selectMWh);
			ps.setString(1, iPlantCd);
			ps.setInt(2, RcvIssueConst.MRP_TARGET);
			ps.setInt(3, RcvIssueConst.WH_INSIDE_TYPICAL);
			rs = ps.executeQuery();

			// 存在チェック
			rs.next();
			if( rs.getString(1) == null ){
				return outWhCd;
			}

			// 結果を設定
			outWhCd = rs.getString(1);

			return outWhCd;

		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	/**
	 * <pre>
	 * 工場コード、外作代表フラグを元に
	 * [保管区]から外作代表の保管区コードを取得する。
	 * </pre>
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @return String 外作代表保管区コード<br>データが存在しない場合は空文字。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final String getOutsideTypical(IDbConnection iConnect, String iPlantCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// 引数チェック
		if( iConnect == null || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getOutsideTypical()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		String outWhCd = "";

		// [品目別保管先優先順位]データ読込のSQL
		// 検索条件：工場コード、外作代表フラグ⇒1
		String selectMWh =
			"select"
				+ " MIN(M_WH.WH_CD) "
				+ "from"
				+ " M_WH "
				+ "where"
				+ " M_WH.PLANT_CD = ?"
				+ " and M_WH.WH_OUTSIDE_FLG = ?";
		try {
			// データ読込のSQL作成
			ps = conn.prepareStatement(selectMWh);
			ps.setString(1, iPlantCd);
			ps.setInt(2, RcvIssueConst.WH_OUTSIDE_TYPICAL);
			rs = ps.executeQuery();

			// 存在チェック
			rs.next();
			if( rs.getString(1) == null ){
				return outWhCd;
			}

			// 結果を設定
			outWhCd = rs.getString(1);

			return outWhCd;

		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	/**
	 * <pre>
	 * 所要量計算対象フラグがON（1:所要量計算対象）の保管区コード一覧を
	 * [保管区]から保管区コードの昇順で取得する。
	 * </pre>
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @param oWhCdList		保管区コード([保管区]."保管区コード"の昇順)
	 * @return List 保管区コード([保管区]."保管区コード"の昇順)<br>データが存在しない場合はリストサイズが0。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final List getMrpAscAll(IDbConnection iConnect, String iPlantCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// 引数チェック
		if( iConnect == null || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getMrpAscAll()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		List outList = new ArrayList();

		// [保管区]データ読込のSQL
		// 検索条件：工場コード、所要量計算対象フラグ⇒1
		String selectMWh =
			"select"
				+ " M_WH.WH_CD "
				+ "from"
				+ " M_WH "
				+ "where"
				+ " M_WH.PLANT_CD = ?"
				+ " and M_WH.MRP_FLG = ? "
				+ "order by "
				+ " M_WH.WH_CD ASC";
		try {
			// データ読込のSQL作成
			ps = conn.prepareStatement(selectMWh);
			ps.setString(1, iPlantCd);
			ps.setInt(2, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// 存在チェック
			if(rs.next()){
				// 結果を設定
				outList.add(rs.getString(1));
				while(rs.next()){
					// データを取得
					outList.add(rs.getString(1));
				}
			}

			return outList;

		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}

	/**
	 * <pre>
	 * 所要量計算対象フラグがON（1:所要量計算対象）かつ[品目別保管先優先順位]に未登録の
	 * 保管区コード一覧を[保管区]から保管区コードの降順で取得する。
	 * </pre>
	 *
	 * @param iConnect コネクションがOPENされているIDbConnection
	 * @param iPlantCd		工場コード
	 * @param iItemCd		品目番号
	 * @return List 保管区コード([保管区]."保管区コード"の昇順)<br>データが存在しない場合はリストサイズが0。
	 * @throws SQLException DBアクセスエラー
	 */
	public static final List getMrpDescExceptPriority(IDbConnection iConnect, String iPlantCd, String iItemCd)
		throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// 引数チェック
		if( iConnect == null || !StringUtil.Validate(iPlantCd) ){
			IllegalArgumentException e = new IllegalArgumentException("ValidateWh.getMrpDescExceptPriority()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		List outList = new ArrayList();

		// [保管区]データ読込のSQL
		// 検索条件：工場コード、所要量計算対象フラグ⇒1、[品目別保管先優先順位]に未登録
		String selectMWh =
			"select"
				+ " WH_CD "
				+ "from"
				+ " M_WH "
				+ "where"
				+ " PLANT_CD =  ? "
				+ " and MRP_FLG = ? "
				+ " and (not exists("
				+ "  select"
				+ "   WH_CD"
				+ "  from"
				+ "   M_WH_PRIORITY"
				+ "  where"
				+ "   M_WH.WH_CD = M_WH_PRIORITY.WH_CD"
				+ "   and PLANT_CD = ?"
				+ "   and ITEM_CD = ?"
				+ "   and MRP_FLG = ?)) "
				+ "order by "
				+ " M_WH.WH_CD DESC";
		try {
			// データ読込のSQL作成
			ps = conn.prepareStatement(selectMWh);
			ps.setString(1, iPlantCd);
			ps.setInt(2, RcvIssueConst.MRP_TARGET);
			ps.setString(3, iPlantCd);
			ps.setString(4, iItemCd);
			ps.setInt(5, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// 存在チェック
			if(rs.next()){
				// 結果を設定
				outList.add(rs.getString(1));
				while(rs.next()){
					// データを取得
					outList.add(rs.getString(1));
				}
			}

			return outList;

		} finally {
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
	}
}
