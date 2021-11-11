/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/psmaintenance/PsMaintenance.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 * 2004/02/09 新規作成 S.Ishiguro
 *
 */

package com.nec.jp.orteus.expj.psmaintenance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.nec.jp.orteus.util.DisplayMessageUtil;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.exception.ExpjBadException;
import com.nec.jp.orteus.expj.exception.NoDataException;
import com.nec.jp.orteus.expj.exception.PsLoopException;
import com.nec.jp.orteus.expj.exception.PsEffPhaseException;
import com.nec.jp.orteus.expj.exception.PsMrpOdrTypException;
// 2008/07/15 SYSCOM 小林 ADD START
import com.nec.jp.orteus.expj.exception.PsManhourTypException;
// 2008/07/15 SYSCOM 小林 ADD END

/**
 * 製品構成をメンテナンスするためのユーティリティクラス
 *
 * @author $Author: chenjunhua268 $
 * @version $Revision: 1.5 $ $Date: 2014/06/17 02:10:24 $
 */
public class PsMaintenance
{
	/**
	  * [品目].品目手配区分コード
	  */
	private final static int MRP_ODR_TYP_ORDER_CD = 1;		// 製番
	private final static int MRP_ODR_TYP_STOCK_ALLOC = 2;	// 在庫引当型製番
	private final static int MRP_ODR_TYP_MANUAL = 4;		// マニュアル手配品目
	private final static int MRP_ODR_TYP_LOT_QTY = 5;		// ロット手配品目
	private final static int MRP_ODR_TYP_FIXED_QTY = 6;		// 定量手配品目
	private final static int MRP_ODR_TYP_ORDER_POINT = 7;	// 発注点手配品目
	private final static int MRP_ODR_TYP_PSEUDO_ITEM = 8;	// 擬似品目
	
	/**
	  * [製品構成].処理方法コード
	  */
	private final static int ACCESS_TYP_ADD = 1;		// 追加
	private final static int ACCESS_TYP_DELETE = 2;		// 削除

	/**
	  * [製品構成].完了フラグ
	  */
	private final static int CMPLT_FLG_FALSE = 0;		// 未完了
	private final static int CMPLT_FLG_TRUE = 1;		// 完了

// 2008/07/15 SYSCOM 小林 ADD START
	/**
	  * [品目].工数管理品目区分
	  */
	private final static int MANHOUR_TYP_NORMAL = 0;	// 通常品目
	private final static int MANHOUR_TYP_CTRL = 1;		// 工数管理品目
// 2008/07/15 SYSCOM 小林 ADD END
	
	// Add Start 20140311 wanghp
	/**
	 * 置換の件数（0件の場合、エラー出力）
	 */
	private int ReplaceCount = 0;
	// Add End 20140311 wanghp

	/**
	  * SQL定義 子製品構成取得用
	  */
	private final String _sqlGetCompPs =
		  "SELECT "
		+ "COMP_ITEM_CD, "
		+ "PS_EDITION, "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(MODIFY_COUNT) "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "ORDER BY PS_REF_NO, COMP_ITEM_CD ";

	/**
	  * SQL定義 子製品構成取得用(日付指定)
	  */
	private final String _sqlGetCompPsByDate =
		  "SELECT "
		+ "COMP_ITEM_CD, "
		+ "PS_EDITION, "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(MODIFY_COUNT) "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD') <= ? "
		+ "AND TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD') >= ? "
		+ "ORDER BY PS_REF_NO, COMP_ITEM_CD ";

	/**
	  * SQL定義 親製品構成取得用
	  */
	private final String _sqlGetParentPs =
		  "SELECT "
		+ "PARENT_ITEM_CD, "
		+ "PS_EDITION, "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(MODIFY_COUNT) "
		+ "FROM M_PS "
		+ "WHERE COMP_ITEM_CD = ? "
		+ "ORDER BY PS_REF_NO, PARENT_ITEM_CD ";

	/**
	  * SQL定義 親製品構成取得用(日付指定)
	  */
	private final String _sqlGetParentPsByDate =
		  "SELECT "
		+ "PARENT_ITEM_CD, "
		+ "PS_EDITION, "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(MODIFY_COUNT) "
		+ "FROM M_PS "
		+ "WHERE COMP_ITEM_CD = ? "
		+ "AND TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD') <= ? "
		+ "AND TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD') >= ? "
		+ "ORDER BY PS_REF_NO, PARENT_ITEM_CD ";

	/**
	  * SQL定義 製品構成追加用
	  */
	private final String _sqlAddM_PS =
		  "INSERT INTO M_PS ("
		+ "PARENT_ITEM_CD, "
		+ "COMP_ITEM_CD, "
		+ "PS_EDITION, "
		+ "PS_UNIT_DENOMINATOR, "
		+ "PS_UNIT_NUMERATOR, "
		+ "EFF_PHASE_IN_DATE, "
		+ "EFF_PHASE_OUT_DATE, "
		+ "PS_SPOIL, "
		+ "CONS_TYP, "
		+ "PS_LT_FLG, "
		+ "PS_FIXED_LT, "
		+ "PS_PROP_LT, "
		+ "PS_PROP_LOT_SIZE, "
		+ "PS_REF_NO, "
		+ "COST_UP_TYP, "
		+ "MRP_EXP_TYP) "
		+ "VALUES( ?, ?, ?, TO_NUMBER(?), TO_NUMBER(?), "
		+ "TO_DATE(?, 'YYYY/MM/DD'), TO_DATE(?, 'YYYY/MM/DD'), "
		+ "TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), "
		+ "TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), TO_NUMBER(?), "
		+ "TO_NUMBER(?)) ";

	// Add Start 20140310 wanghp
	/**
	 * SQL定義 製品構成修正用（置換先品目が子構成あり）
	 */
	private final String _sqlHasCompModifyM_PS = 
		  "UPDATE M_PS SET "
		+ "EFF_PHASE_IN_DATE = TO_DATE(?, 'YYYY/MM/DD'), "
		+ "EFF_PHASE_OUT_DATE = TO_DATE(?, 'YYYY/MM/DD')"
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION = ? ";
	// Add End 20140310 wanghp
	
	/**
	  * SQL定義 製品構成修正用
	  */
	private final String _sqlModifyM_PS =
		  "UPDATE M_PS SET "
		+ "PS_UNIT_DENOMINATOR = TO_NUMBER(?), "
		+ "PS_UNIT_NUMERATOR = TO_NUMBER(?), "
		+ "EFF_PHASE_IN_DATE = TO_DATE(?, 'YYYY/MM/DD'), "
		+ "EFF_PHASE_OUT_DATE = TO_DATE(?, 'YYYY/MM/DD'), "
		+ "PS_SPOIL = TO_NUMBER(?), "
		+ "CONS_TYP = TO_NUMBER(?), "
		+ "PS_LT_FLG = TO_NUMBER(?), "
		+ "PS_FIXED_LT = TO_NUMBER(?), "
		+ "PS_PROP_LT = TO_NUMBER(?), "
		+ "PS_PROP_LOT_SIZE = TO_NUMBER(?), "
		+ "PS_REF_NO = TO_NUMBER(?), "
		+ "COST_UP_TYP = TO_NUMBER(?), "
		+ "MRP_EXP_TYP = TO_NUMBER(?) "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION = ? ";

	/**
	  * SQL定義 製品構成削除用
	  */
	private final String _sqlDeleteM_PS =
		  "DELETE FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION = ? ";

	/**
	  * SQL定義 製品構成更新数取得用
	  */
	private final String _sqlGetModifyCount =
		  "SELECT "
		+ "TO_CHAR(MODIFY_COUNT) "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION = ? "
		+ "FOR UPDATE ";

	/**
	  * SQL定義 最大SYSシーケンシャル番号取得用
	  */
	private final String _sqlGetMaxSeqNo =
		  "SELECT MAX(SEQ_NO) "
		+ "FROM SYS_PS_T ";

	/**
	  * SQL定義 製品構成トランザクション追加用
	  */
	private final String _sqlAddSYS_PS_T =
		  "INSERT INTO SYS_PS_T ("
		+ "SEQ_NO, "
		+ "PARENT_ITEM_CD, "
		+ "COMP_ITEM_CD, "
		+ "PS_EDITION, "
		+ "ACCESS_TYP, "
		+ "CMPLT_FLG) "
		+ "VALUES( ?, ?, ?, ?, ?, ? ) ";

	/**
	  * SQL定義 製品構成属性データ取得用
	  */
	private final String _sqlGetPsAttribute =
		  "SELECT "
		+ "TO_CHAR(PS_UNIT_DENOMINATOR, 'FM99999999999990.0999'), "
		+ "TO_CHAR(PS_UNIT_NUMERATOR, 'FM99999999999990.0999'), "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD'), "
		+ "TO_CHAR(PS_SPOIL, 'FM99990.0999'), "
		+ "CONS_TYP, "
		+ "PS_LT_FLG, "
		+ "TO_CHAR(PS_FIXED_LT), "
		+ "TO_CHAR(PS_PROP_LT), "
		+ "TO_CHAR(PS_PROP_LOT_SIZE, 'FM99999999999990.0999'), "
		+ "TO_CHAR(PS_REF_NO), "
		+ "COST_UP_TYP, "
		+ "MRP_EXP_TYP, "
		+ "MODIFY_COUNT "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION = ? ";

	/**
	  * SQL定義 親品目番号存在確認用
	  */
	private final String _sqlHasParentItem =
		  "SELECT PARENT_ITEM_CD "
		+ "FROM M_PS "
		+ "WHERE COMP_ITEM_CD = ? ";

	/**
	  * SQL定義 子品目番号存在確認用
	  */
	private final String _sqlHasCompItem =
		  "SELECT COMP_ITEM_CD "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? ";

	/**
	  * SQL定義 製品構成有効期間一覧取得用
	  */
	private final String _sqlGetEffPhaseList =
		  "SELECT "
		+ "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYYMMDD'), "
		+ "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYYMMDD') "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? ";

	/**
	  * SQL定義 製品構成有効期間一覧取得用（指定製品構成版数を除外）
	  */
	private final String _sqlGetEffPhaseListWoPse =
		  "SELECT TRUNC(EFF_PHASE_IN_DATE), TRUNC(EFF_PHASE_OUT_DATE) "
		+ "FROM M_PS "
		+ "WHERE PARENT_ITEM_CD = ? "
		+ "AND COMP_ITEM_CD = ? "
		+ "AND PS_EDITION != ? ";

	/**
	  * SQL定義 品目手配区分取得用
	  */
	private final String _sqlGetMrpOrderType =
		  "SELECT MRP_ODR_TYP "
		+ "FROM M_ITEM "
		+ "WHERE ITEM_CD = ? ";

// 2008/07/15 SYSCOM 小林 ADD START
	/**
	  * SQL定義 工数管理品目区分取得用
	  */
	private final String _sqlGetManhourTyp =
		  "SELECT MANHOUR_TYP "
		+ "FROM M_ITEM "
		+ "WHERE ITEM_CD = ? ";
// 2008/07/15 SYSCOM 小林 ADD END

	/**
	  * 日付指定を行う場合の有効フォーマット
	  */
	private final String _dateFormat = "yyyyMMdd";

	/**
	  * コネクションオブジェクト
	  */
	private Connection _connection = null;

	/**
	  * ユーザコード
	  */
	private String _userCode = null;

	/**
	  * プログラム名
	  */
	private String _programName = null;

	/**
	  * システム時刻
	  */
	private String _sysdate = null;

	/**
	  * 日付型⇔文字列型変換用オブジェクト
	  */
	private DisplayMessageUtil _objMessage = new DisplayMessageUtil();

	/**
	  * SQL例外発生時のエラーメッセージ情報保存用オブジェクト
	  */
	private ExpjMessage _errorInfo = null;

	/**
	 * 製品構成を取得します（日付指定なし）
	 *
	 * @param  itemCd 基準品目番号
	 * @param  sql 製品構成取得用のSQL文
	 * @return 品目番号の一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	private List getPsList(String itemCd, String sql)
			throws SQLException
	{
		PreparedStatement stmt = null;
		try {
			// 製品構成を取得
			stmt = _connection.prepareStatement(sql);
			stmt.setString(1, itemCd);
			return getPsListSub(stmt);
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_PS.PARENT_ITEM_CD:" + itemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 製品構成を取得します（日付指定あり）
	 *
	 * @param  itemCd 基準品目番号
	 * @param  targetDate 指定日付
	 * @param  sql 製品構成取得用のSQL文
	 * @return 品目番号の一覧
	 * @throws SQLException DBアクセスに失敗
	 * @throws ParseException 日付の形式変換に失敗
	 */
	private List getPsListByDate(String itemCd, String targetDate, String sql)
			throws SQLException, ParseException
	{
		PreparedStatement stmt = null;
		try {
			SimpleDateFormat formatYyyyMmDd = new SimpleDateFormat("yyyy/MM/dd");
			// 置換日付を正規化（"YYYY/MM/DD"）
			Date dateTargetDate = formatYyyyMmDd.parse(targetDate);
			String targetDateYyyyMmDd = formatYyyyMmDd.format(dateTargetDate);
			// 製品構成を取得（日付指定あり）
			stmt = _connection.prepareStatement(sql);
			stmt.setString(1, itemCd);
			stmt.setString(2, targetDateYyyyMmDd);
			stmt.setString(3, targetDateYyyyMmDd);
			return getPsListSub(stmt);
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_PS.PARENT_ITEM_CD:" + itemCd);
			throw se;
		} catch (ParseException pe) {
			_errorInfo = new ExpjMessage("ZZ01006", targetDate);
			throw pe;
		} finally {
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 製品構成の取得のSQLを発行し、製品構成の一覧を取得します
	 *
	 * @param  stmt SQL構築済みのPreparedStatement
	 * @return 製品構成の一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	private List getPsListSub(PreparedStatement stmt)
			throws SQLException
	{
		ResultSet result = null;
		try {
			List list = new ArrayList(0);
			// SQL発行
			result = stmt.executeQuery();
			// 製品構成を取得
			while (result.next()) {
				String[] data = new String[5];
				data[0] = result.getString(1);	// 子品目番号/親品目番号
				data[1] = result.getString(2);	// 製品構成版数
				data[2] = result.getString(3);	// 製品構成有効開始日
				data[3] = result.getString(4);	// 製品構成有効終了日
				data[4] = result.getString(5);	// 更新数
				list.add(data);
			}
			return list;
		} finally {
			closeResultSet(result);
		}
	}

	/**
	 * 製品構成の更新数を調べます
	 *
	 * @param  parentItemCd 親品目番号
	 * @param  compItemCd 子品目番号
	 * @param  psEdition 製品構成版数
	 * @param  modifyCount 更新
	 * @throws SQLException DBアクセスに失敗
	 * @throws ExpjBadException 更新数不一致
	 * @throws NoDataException 対象データなし
	 */
	private void testModifyCount(
			String parentItemCd, String compItemCd, String psEdition, String modifyCount)
			throws SQLException, ExpjBadException, NoDataException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			String nowModifyCount = "0";
			// 製品構成の更新数を取得
			stmt = _connection.prepareStatement(_sqlGetModifyCount);
			stmt.setString(1, parentItemCd);	// 親品目番号
			stmt.setString(2, compItemCd);		// 子品目番号
			stmt.setString(3, psEdition);		// 製品構成版数
			result = stmt.executeQuery();
			if (result.next() == false) {
				// 対象データが存在しません。
				_errorInfo = new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition);
				throw new NoDataException();
			}
			nowModifyCount = result.getString(1);	// [製品構成]."更新数"
			if (nowModifyCount.equals(modifyCount) == false) {
				// 他の処理によってデータが書き換えられています。再試行してください。
				throw new ExpjBadException(new ExpjMessage("ZZ01105",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition));
			}
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * 製品構成の追加、削除を記録します
	 *
	 * @param  parentItemCd 親品目番号
	 * @param  compItemCd 子品目番号
	 * @param  psEdition 製品構成版数
	 * @param  accsessType 処理方法
	 * @param  completeFlag 完了フラグ
	 * @throws SQLException DBアクセスに失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 */
	private void addSYS_PS_T(String parentItemCd, String compItemCd, String psEdition,
			int accessType, int completeFlag)
			throws SQLException, FoundationException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		int maxSeqNo = 0;
		try {
			// 製品構成トランザクションの最大シーケンス番号を取得
			stmt = _connection.prepareStatement(_sqlGetMaxSeqNo);
			result = stmt.executeQuery();
			if (result.next() == true) {
				maxSeqNo = result.getInt(1);
			}
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
		try {
			// 製品構成の追加、削除を製品構成トランザクションに記録
			if ("Oracle".equals(_connection.getMetaData().getDatabaseProductName()) == true) {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I(_sqlAddSYS_PS_T));
			} else if ("Microsoft SQL Server".equals(
					_connection.getMetaData().getDatabaseProductName()) == true)
			{
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I_MSSQL(_sqlAddSYS_PS_T));
			} else {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I_DB2(_sqlAddSYS_PS_T));
			}
			stmt.setString(1, _sysdate);		// 作成時刻
			stmt.setString(2, _userCode);		// 作成者
			stmt.setString(3, _programName);	// 作成プログラム名
			stmt.setString(4, _sysdate);		// 更新時刻
			stmt.setString(5, _userCode);		// 更新者
			stmt.setString(6, _programName);	// 更新プログラム名
			stmt.setInt(7, maxSeqNo + 1);		// 新規のシーケンス番号
			stmt.setString(8, parentItemCd);	// 親品目番号
			stmt.setString(9, compItemCd);		// 子品目番号
			stmt.setString(10, psEdition);		// 製品構成版数
			stmt.setInt(11, accessType);		// 処理区分
			stmt.setInt(12, completeFlag);		// 完了フラグ
			stmt.executeUpdate();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 親製品構成をもっているか調べます
	 *
	 * @param  compItemCd 子品目番号
	 * @return true:もっている／false:もっていない
	 * @throws SQLException DBアクセスに失敗
	 */
	private boolean hasParentPs(String compItemCd)
			throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			// 親製品構成の存在を検査
			stmt = _connection.prepareStatement(_sqlHasParentItem);
			stmt.setString(1, compItemCd);
			result = stmt.executeQuery();
			// 親製品構成が： true:存在する／false:存在しない
			return result.next();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_PS.COMP_ITEM_CD:" + compItemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * 子製品構成の存在を調べます
	 *
	 * @param  parentItemCd 親品目番号
	 * @return true:存在する／false:存在しない
	 * @throws SQLException DBアクセスに失敗
	 */
	private boolean hasCompPs(String parentItemCd)
			throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			// 子製品構成の存在を検査
			stmt = _connection.prepareStatement(_sqlHasCompItem);
			stmt.setString(1, parentItemCd);
			result = stmt.executeQuery();
			// 子製品構成が： true:存在する／false:存在しない
			return result.next();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_PS.PARENT_ITEM_CD:" + parentItemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}
	
	// Add Start 20140310 wanghp
	/**
	 * 置換先品目が子構成ありの場合、置換元子構成と置換先子構成の置換
	 * @param fromItemCd　置換元品目
	 * @param toItemCd　置換先品目
	 * @param replaceDate　置換日
	 * @return true:ワーニングあり　false:ワーニングなし
	 * @throws ParseException 日付の形式変換に失敗
	 * @throws SQLException DBアクセスに失敗
	 * @throws ExpjBadException 更新数不一致
	 * @throws FoundationException テーブル更新用SQL文の生成に失敗
	 */
	private boolean replaceHasCompPs(String fromItemCd, String toItemCd, String replaceDate) 
			throws ParseException, SQLException, FoundationException, ExpjBadException{
		// 置換先の品目構成に、有効期間範囲以外の下位品目の存在フラグ
		boolean hasWarning = false;
		
		try {
			SimpleDateFormat formatYyyyMmDd = new SimpleDateFormat("yyyy/MM/dd");
			// 置換日付を正規化（"YYYY/MM/DD"）
			Date dateReplaceDate;
			dateReplaceDate = formatYyyyMmDd.parse(replaceDate);
			replaceDate = formatYyyyMmDd.format(dateReplaceDate);
			
			// 置換元品目の子構成を取得
			List fromCompPsList = getCompPsList(fromItemCd);
			String[] fromCompPs = new String[5];
			for(int i = 0; i < fromCompPsList.size(); i++){
				fromCompPs = (String[])fromCompPsList.get(i);
				List fromAttribute = getPsAttribute(fromItemCd, fromCompPs[0], fromCompPs[1]);
				
				String fromInDate = (String)fromAttribute.get(2);	// 製品構成有効開始日
				Date dateFromInDate = formatYyyyMmDd.parse(fromInDate);
				String fromOutDate = (String)fromAttribute.get(3);	// 製品構成有効終了日
				Date dateFromOutDate = formatYyyyMmDd.parse(fromOutDate);
				if (dateFromOutDate.compareTo(dateReplaceDate) < 0) {
					// 置換日付　≧　製品構成有効終了日の場合
					// 何もしない
					continue;
				}
				if (dateFromInDate.compareTo(dateReplaceDate) >= 0) {
					// 置換日付　＜　製品構成有効開始日場合
					// 置換元製品構成を削除
					deleteM_PS(fromItemCd, fromCompPs[0], fromCompPs[1], (String)fromAttribute.get(13));
					// 置換件数のカウントアップ
					++ReplaceCount;
				} else {
					// 製品構成有効開始日　≦　「置換日付」　＜　製品構成有効終了日
					// 置換元製品構成を修正（製品構成有効終了日を置換日付の前日に修正）
					String newFromOutDate = formatYyyyMmDd.format(
							new Date(dateReplaceDate.getTime() - 60 * 60 * 24));
					modifyM_PS(fromItemCd, fromCompPs[0], fromCompPs[1], 
							fromInDate, newFromOutDate, (String)fromAttribute.get(13));
					// 置換件数のカウントアップ
					++ReplaceCount;
				}
			}
			
			// 置換先品目の子構成を取得
			List toCompPsList = getCompPsList(toItemCd);
			String[] toCompPs = new String[5];
			for(int i = 0; i < toCompPsList.size(); i++){
				toCompPs = (String[])toCompPsList.get(i);
				List toAttribute = getPsAttribute(toItemCd, toCompPs[0], toCompPs[1]);
				
				String toInDate = (String)toAttribute.get(2);	// 製品構成有効開始日
				Date dateToInDate = formatYyyyMmDd.parse(toInDate);
				String toOutDate = (String)toAttribute.get(3);	// 製品構成有効終了日
				Date dateToOutDate = formatYyyyMmDd.parse(toOutDate);
				if (dateToOutDate.compareTo(dateReplaceDate) < 0 
				        || dateToInDate.compareTo(dateReplaceDate) >= 0) {
					// 置換日付　≧　製品構成有効終了日の場合
					// 置換日付　＜　製品構成有効開始日場合
					// 何もしない
					hasWarning = true;
					continue;
				}
				// Del Start 20140410 wanghp
//				else {
//					// 製品構成有効開始日　≦　「置換日付」　＜　製品構成有効終了日
//					// 置換先製品構成を修正（製品構成有効開始日を置換日付に修正）
//					modifyM_PS(toItemCd, toCompPs[0], toCompPs[1], 
//							replaceDate, toOutDate, (String)toAttribute.get(13));
//					// 置換件数のカウントアップ
//					++ReplaceCount;
//				}
				// Del End 20140410 wanghp
			}
			
			return hasWarning;
		} catch (ParseException pe) {
			_errorInfo = new ExpjMessage("ZZ01006", replaceDate);
			throw pe;
		}
	}
	// Add End 20140310 wanghp

	/**
	 * 製品構成の親品目または子品目を置換します
	 *
	 * @param  parentItemCd 置換する製品構成の置換元親品目番号
	 * @param  compItemCd 置換する製品構成の置換元子品目番号
	 * @param  psEdition 置換する製品構成の版数
	 * @param  toItemCd 置換する製品構成の置換先品目番号
	 * @param  replaceDate 置換日付
	 * @param  modifyCount 置換する製品構成の更新数
	 * @param  parent 親品目置換フラグ（falseのとき子品目置換）
	 * @throws SQLException DBアクセスに失敗
	 * @throws ParseException 日付の形式変換に失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws ExpjBadException 更新数不一致
	 */
	private void replacePsSub(String parentItemCd, String compItemCd, String psEdition,
			String toItemCd, String replaceDate, String modifyCount, boolean parent)
			throws SQLException, ParseException, FoundationException, ExpjBadException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			SimpleDateFormat formatYyyyMmDd = new SimpleDateFormat("yyyy/MM/dd");
			// 置換日付を正規化（"YYYY/MM/DD"）
			Date dateReplaceDate = formatYyyyMmDd.parse(replaceDate);
			replaceDate = formatYyyyMmDd.format(dateReplaceDate);
			// 置換元製品構成の製品構成属性データを取得
			List fromAttribute = getPsAttribute(parentItemCd, compItemCd, psEdition);
			if (((String)fromAttribute.get(13)).equals(modifyCount) == false) {
				// 更新数が一致しない場合
				// 他の処理によってデータが書き換えられています。再試行してください。
				throw new ExpjBadException(new ExpjMessage("ZZ01105",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition));
			}
			String fromInDate = (String)fromAttribute.get(2);	// 製品構成有効開始日
			Date dateFromInDate = formatYyyyMmDd.parse(fromInDate);
			String fromOutDate = (String)fromAttribute.get(3);	// 製品構成有効終了日
			Date dateFromOutDate = formatYyyyMmDd.parse(fromOutDate);
			if (dateFromOutDate.compareTo(dateReplaceDate) < 0) {
				// 製品構成有効終了日が置換日付より前の場合
				// 何もしない
				return;
			}
			// 追加または修正用の製品構成属性データリストを作成
			List replaceAttribute = new ArrayList(0);
			replaceAttribute.add((String)fromAttribute.get(0));		// 製品構成単位数分母
			replaceAttribute.add((String)fromAttribute.get(1));		// 製品構成単位数分子
			if (dateFromInDate.compareTo(dateReplaceDate) >= 0) {
				// 製品構成有効開始日が置換日付以降の場合
				// 製品構成有効開始日は置換元の値
				replaceAttribute.add(fromInDate);
			} else {
				// 製品構成有効開始日が置換日付より前の場合
				// 製品構成有効開始日は置換日付
				replaceAttribute.add(replaceDate);
			}
			replaceAttribute.add(fromOutDate);	// 製品構成有効終了日
			// 構成仕損率から所要量展開区分まで
			for (int i = 4; i < 14; i++) {
				replaceAttribute.add((String)fromAttribute.get(i));
			}
			// 置換先製品構成を追加
			if (parent) {
				// 親品目置換の場合
				addM_PS(toItemCd, compItemCd, psEdition, replaceAttribute);
				// Add Start 20140311 wanghp
				// 置換件数のカウントアップ
				++ReplaceCount;
				// Add End 20140311 wanghp
			} else {
				// 子品目置換の場合
				addM_PS(parentItemCd, toItemCd, psEdition, replaceAttribute);
				// Add Start 20140311 wanghp
				// 置換件数のカウントアップ
				++ReplaceCount;
				// Add End 20140311 wanghp
			}
			if (dateFromInDate.compareTo(dateReplaceDate) >= 0) {
				// 製品構成有効開始日が置換日付以降の場合
				// 置換元製品構成を削除
				deleteM_PS(parentItemCd, compItemCd, psEdition, (String)fromAttribute.get(13));
				// Add Start 20140311 wanghp
				// 置換件数のカウントアップ
				++ReplaceCount;
				// Add End 20140311 wanghp
			} else {
				// 製品構成有効開始日が置換日付より前の場合
				// 置換元製品構成を修正
				// （製品構成有効終了日を置換日付の前日に変更）
				replaceAttribute.remove(2);						// 製品構成有効開始日
				replaceAttribute.add(2, fromInDate);			// （取得した値に戻す）
				replaceAttribute.remove(3);						// 製品構成有効終了日
				String newFromOutDate = formatYyyyMmDd.format(
						new Date(dateReplaceDate.getTime() - 60 * 60 * 24));
				replaceAttribute.add(3, newFromOutDate);		// （置換日付の前日を設定）
				modifyM_PS(parentItemCd, compItemCd, psEdition, replaceAttribute);
				// Add Start 20140311 wanghp
				// 置換件数のカウントアップ
				++ReplaceCount;
				// Add End 20140311 wanghp
			}
		} catch (ParseException pe) {
			_errorInfo = new ExpjMessage("ZZ01006", replaceDate);
			throw pe;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * 製品構成の有効期間の一覧を取得します
	 *
	 * @param  parentItemCd 親品目番号
	 * @param  compItemCd 子品目番号
	 * @return 品目手配区分
	 * @throws SQLException DBアクセスに失敗
	 */
	private List getEffPhaseList(String parentItemCd, String compItemCd)
			throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			List phaseList = new ArrayList(0);
			// 製品構成の有効期間の一覧を取得
			stmt = _connection.prepareStatement(_sqlGetEffPhaseList);
			stmt.setString(1, parentItemCd);
			stmt.setString(2, compItemCd);
			result = stmt.executeQuery();
			while (result.next() == true) {
				Date[] phase = new Date[2];
				phase[0] = result.getDate(1);	// 製品構成有効期間開始日
				phase[1] = result.getDate(2);	// 製品構成有効期間終了日
				phaseList.add(phase);
			}
			return phaseList;
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * 指定された製品構成版数を除いた製品構成の有効期間の一覧を取得します
	 *
	 * @param  parentItemCd 親品目番号
	 * @param  compItemCd 子品目番号
	 * @param  peEdition 製品構成版数
	 * @return 品目手配区分
	 * @throws SQLException DBアクセスに失敗
	 */
	private List getEffPhaseListWoPse(String parentItemCd, String compItemCd, String psEdition)
			throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			List phaseList = new ArrayList(0);
			// 製品構成の有効期間の一覧を取得
			stmt = _connection.prepareStatement(_sqlGetEffPhaseListWoPse);
			stmt.setString(1, parentItemCd);
			stmt.setString(2, compItemCd);
			stmt.setString(3, psEdition);
			result = stmt.executeQuery();
			while (result.next() == true) {
				Date[] phase = new Date[2];
				phase[0] = result.getDate(1);	// 製品構成有効期間開始日
				phase[1] = result.getDate(2);	// 製品構成有効期間終了日
				phaseList.add(phase);
			}
			return phaseList;
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * 指定された期間が製品構成有効期間と重複しないか調べます
	 *
	 * @param targetList 検査対象の製品構成有効期間の一覧
	 * @param inDate 製品構成有効（期間）開始日
	 * @param outDate 製品構成有効（期間）終了日
	 * @throws SQLException DBアクセスに失敗
	 * @throws ParseException 日付の形式変換に失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws PsEffPhaseException 有効期間に重複あり
	*/
	private void testConflictEffPhaseSub(List targetList, String inDate, String outDate)
			throws SQLException, FoundationException, ParseException, PsEffPhaseException
	{
		SimpleDateFormat formatYyyyMmDd = new SimpleDateFormat("yyyy/MM/dd");
		Date dateInDate = formatYyyyMmDd.parse(inDate);
		Date dateOutDate = formatYyyyMmDd.parse(outDate);
		int listSize = targetList.size();
		for (int i = 0; i < listSize; i++) {
			Date[] targetPhase = (Date[])(targetList.get(i));
			// [0]:開始日、[1]:終了日
			// 検査対象の開始日＞指定開始日の場合
			if (targetPhase[0].compareTo(dateInDate) > 0) {
				// 検査対象の開始日≦指定終了日ならば：
				if (targetPhase[0].compareTo(dateOutDate) <= 0) {
					// 重複する
					throw new PsEffPhaseException(new ExpjMessage("ZZ01006",
							inDate + "," + outDate));
				}
			// 検査対象の開始日＜指定開始の場合
			} else if (targetPhase[0].compareTo(dateInDate) < 0) {
				// 検査対象の終了日≧指定開始日
				if (targetPhase[1].compareTo(dateInDate) >= 0) {
					// 重複する
					throw new PsEffPhaseException(new ExpjMessage("ZZ01006",
							inDate + "," + outDate));
				}
			} else {
				// 検査対象の開始日==指定開始日
				// 重複する
				throw new PsEffPhaseException(new ExpjMessage("ZZ01006",
						inDate + "," + outDate));
			}
		}
		// 重複しない
	}

	/**
	 * 品目手配区分を取得します
	 *
	 * @param  itemCd 品目番号
	 * @return 品目手配区分
	 * @throws SQLException DBアクセスに失敗
	 * @throws NoDataException 指定キーデータなし
	 */
	private Integer getMrpOrderType(String itemCd)
			throws SQLException, NoDataException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			// 品目手配区分を取得
			stmt = _connection.prepareStatement(_sqlGetMrpOrderType);
			stmt.setString(1, itemCd);
			result = stmt.executeQuery();
			if (result.next() == false) {
				// 指定キーのデータが存在しません。
				_errorInfo = new ExpjMessage("ZZ01006", "M_ITEM.ITEM_CD:" + itemCd);
				throw new NoDataException();
			}
			return new Integer(result.getInt(1));	// 品目手配区分
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_ITEM.ITEM_CD:" + itemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

// 2008/07/15 SYSCOM 小林 ADD START
	/**
	 * 工数管理品目区分を取得します
	 *
	 * @param  itemCd 品目番号
	 * @return 工数管理品目区分
	 * @throws SQLException DBアクセスに失敗
	 * @throws NoDataException 指定キーデータなし
	 */
	private Integer getManhourTyp(String itemCd)
			throws SQLException, NoDataException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			// 工数管理品目区分を取得
			stmt = _connection.prepareStatement(_sqlGetManhourTyp);
			stmt.setString(1, itemCd);
			result = stmt.executeQuery();
			if (result.next() == false) {
				// 指定キーのデータが存在しません。
				_errorInfo = new ExpjMessage("ZZ01006", "M_ITEM.ITEM_CD:" + itemCd);
				throw new NoDataException();
			}
			return new Integer(result.getInt(1));	// 工数管理品目区分
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_ITEM.ITEM_CD:" + itemCd);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}
// 2008/07/15 SYSCOM 小林 ADD END

	/**
	 * プリペアドステートメントを閉じます
	 *
	 * @param stmt 閉じるプリペアドステートメント
	 */
	private void closePreparedStatement(PreparedStatement stmt)
	{
		if (stmt != null) {
			try {
				stmt.close();
				stmt = null;
			} catch (SQLException se) {
				// 対処不能なのでSQLExceptionを無視する
			}
		}
	}

	/**
	 * リザルトセットを閉じます
	 *
	 * @param result 閉じるリザルトセット
	 */
	private void closeResultSet(ResultSet result)
	{
		if (result != null) {
			try {
				result.close();
				result = null;
			} catch (SQLException e) {
				// 対処不能なのでSQLExceptionを無視する
			}
		}
	}

	/**
	 * 重複する品目番号をひとつにします
	 *
	 * @param targetList 品目番号の一覧
	 */
	private void deleteDuplicateItemCd(List targetList)
	{
		// 品目番号（製品構成：品目番号、製品構成版数、他）の一覧を作業用リストに複写
		List workList = new ArrayList(targetList);
		// いったん品目番号の一覧をクリア
		targetList.clear();
		int workListSize = workList.size();
		for (int i = 0; i < workListSize; i++) {
			boolean unique = true;
			String[] workPs = (String[])workList.get(i);
			String itemCd = workPs[0];
			int targetListSize = targetList.size();
			for (int j = 0; j < targetListSize; j++) {
				String[] targetPs = (String[])targetList.get(j);
				if (itemCd.equals(targetPs[0]) == true) {
					// 重複あり
					unique = false;
					break;
				}
			}
			if (unique == true) {
				// 重複していない品目番号だけを一覧に追加
				targetList.add(workPs);
			}
		}
	}

	/**
	 * 製品構成の属性データを取得します
	 *
	 * @param  parentItemCd 親品目番号
	 * @param  compItemCd 親品目番号
	 * @param  psEdition 製品構成版数
	 * @return 製品構成の属性データ
	 * @throws SQLException DBアクセスに失敗
	 * @throws NoDataException 対象データなし
	 */
	public List getPsAttribute(String parentItemCd, String compItemCd, String psEdition)
			throws SQLException, NoDataException
	{
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			// 製品構成の属性データを取得
			stmt = _connection.prepareStatement(_sqlGetPsAttribute);
			stmt.setString(1, parentItemCd);	// 親品目番号
			stmt.setString(2, compItemCd);		// 子品目番号
			stmt.setString(3, psEdition);		// 製品構成版数
			result = stmt.executeQuery();
			if (result.next() == false) {
				// 対象データが存在しません。
				_errorInfo = new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition);
				throw new NoDataException();
			}
			List attribute = new ArrayList(0);
			for (int i = 1; i <= 14; i++) {
				attribute.add(result.getString(i));
			}
			return attribute;
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006", "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
			closeResultSet(result);
		}
	}

	/**
	 * 子製品構成の一覧を取得し、返却します
	 *
	 * @param  parentItemCd 親品目番号（基準品目番号）
	 * @return 子製品構成の一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	public List getCompPsList(String parentItemCd)
			throws SQLException
	{
		return getPsList(parentItemCd, _sqlGetCompPs);
	}

	/**
	 * 指定日付で有効な子製品構成の一覧を取得し、返却します
	 *
	 * @param  parentItemCd 親品目番号（基準品目番号）
	 * @param  targetDate 指定日付
	 * @return 子製品構成の一覧
	 * @throws SQLException DBアクセスに失敗
	 * @throws ParseException 日付の形式変換に失敗
	 */
	public List getCompPsList(String parentItemCd, String targetDate)
			throws SQLException, ParseException
	{
		if (targetDate == null) {
			return getCompPsList(parentItemCd);
		} else {
			return getPsListByDate(parentItemCd, targetDate, _sqlGetCompPsByDate);
		}
	}

	/**
	 * 親製品構成の一覧を取得し、返却します
	 *
	 * @param  compItemCd 子品目番号（基準品目番号）
	 * @return 親製品構成の一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	public List getParentPsList(String compItemCd)
			throws SQLException
	{
		return getPsList(compItemCd, _sqlGetParentPs);
	}

	/**
	 * 指定日付で有効な親製品構成の一覧を取得し、返却します
	 *
	 * @param  compItemCd 子品目番号（基準品目番号）
	 * @param  targetDate 指定日付
	 * @return 親製品構成の一覧
	 * @throws SQLException DBアクセスに失敗
	 * @throws ParseException 日付の形式変換に失敗
	 */
	public List getParentPsList(String compItemCd, String targetDate)
			throws SQLException, ParseException
	{
		if (targetDate == null) {
			return getParentPsList(compItemCd);
		} else {
			return getPsListByDate(compItemCd, targetDate, _sqlGetParentPsByDate);
		}
	}

	/**
	 * 製品構成を追加します
	 *
	 * @param  parentItemCd 追加する製品構成の親品目番号
	 * @param  compItemCd 追加する製品構成の子品目番号
	 * @param  psEdition 追加する製品構成の版数
	 * @param  attribute 追加する製品構成の属性データ
	 * @throws SQLException DBアクセスに失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws ExpjBadException キー重複
	 */
	public void addM_PS(String parentItemCd, String compItemCd, String psEdition, List attribute)
			throws SQLException, FoundationException, ExpjBadException
	{
		// 製品構成を追加
		PreparedStatement stmt = null;
		try {
			if ("Oracle".equals(_connection.getMetaData().getDatabaseProductName()) == true) {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I(_sqlAddM_PS));
			} else if ("Microsoft SQL Server".equals(
					_connection.getMetaData().getDatabaseProductName()) == true)
			{
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I_MSSQL(_sqlAddM_PS));
			} else {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_I_DB2(_sqlAddM_PS));
			}
			stmt.setString(1, _sysdate);		// 作成時刻
			stmt.setString(2, _userCode);		// 作成者
			stmt.setString(3, _programName);	// 作成プログラム名
			stmt.setString(4, _sysdate);		// 更新時刻
			stmt.setString(5, _userCode);		// 更新者
			stmt.setString(6, _programName);	// 更新プログラム名
			stmt.setString(7, parentItemCd);	// 親品目番号
			stmt.setString(8, compItemCd);		// 子品目番号
			stmt.setString(9, psEdition);		// 製品構成版数
			stmt.setString(10, (String)attribute.get(0));	// 製品構成単位数分母
			stmt.setString(11, (String)attribute.get(1));	// 製品構成単位数分子
			stmt.setString(12, (String)attribute.get(2));	// 製品構成有効開始日
			stmt.setString(13, (String)attribute.get(3));	// 製品構成有効終了日
			stmt.setString(14, (String)attribute.get(4));	// 構成仕損率
			stmt.setString(15, (String)attribute.get(5));	// 支給区分
			stmt.setString(16, (String)attribute.get(6));	// 製品構成リードタイム使用フラグ
			stmt.setString(17, (String)attribute.get(7));	// 製品構成固定リードタイム
			stmt.setString(18, (String)attribute.get(8));	// 製品構成比例分リードタイム
			stmt.setString(19, (String)attribute.get(9));	// 製品構成比例分ロットサイズ
			stmt.setString(20, (String)attribute.get(10));	// 製品構成照会キー
			stmt.setString(21, (String)attribute.get(11));	// 原価積上区分
			stmt.setString(22, (String)attribute.get(12));	// 所要量展開区分
			stmt.executeUpdate();
		} catch (SQLException se) {
			if (se.getErrorCode() == 1) {
				// キー重複の場合
				throw new ExpjBadException(new ExpjMessage("ZZ01102",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition));
			} else {
				_errorInfo = new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
						+ parentItemCd + "," + compItemCd + "," + psEdition);
				throw se;
			}
		} finally {
			closePreparedStatement(stmt);
		}
		// 製品構成トランザクションへの追加記録の追加
		addSYS_PS_T(parentItemCd, compItemCd, psEdition, ACCESS_TYP_ADD, CMPLT_FLG_FALSE);
	}

	// Add Start 20140310 wanghp
	/**
	 * 製品構成を修正します
	 *
	 * @param  parentItemCd 親品目番号
	 * @param  compItemCd 子品目番号
	 * @param  psEdition 版数
	 * @param  inDate 開始日
	 * @param  outDate 終了日
	 * @param  modifyCount 更新数
	 * @throws SQLException DBアクセスに失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws ExpjBadException 更新数不一致
	 */
	private void modifyM_PS(String parentItemCd, String compItemCd, String psEdition,
			String inDate, String outDate, String modifyCount)
			throws SQLException, FoundationException, ExpjBadException
	{
		// 製品構成の更新数を検査
		testModifyCount(parentItemCd, compItemCd, psEdition, modifyCount);
		// 製品構成を修正
		PreparedStatement stmt = null;
		try {
			if ("Oracle".equals(_connection.getMetaData().getDatabaseProductName()) == true) {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U(_sqlHasCompModifyM_PS));
			} else if ("Microsoft SQL Server".equals(
					_connection.getMetaData().getDatabaseProductName()) == true)
			{
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U_MSSQL(_sqlHasCompModifyM_PS));
			} else {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U_DB2(_sqlHasCompModifyM_PS));
			}
			stmt.setString(1, _sysdate);		// 更新時刻
			stmt.setString(2, _userCode);		// 更新者
			stmt.setString(3, _programName);	// 更新プログラム名
			stmt.setString(4, inDate);			// 製品構成有効開始日
			stmt.setString(5, outDate);			// 製品構成有効終了日
			stmt.setString(6, parentItemCd);	// 親品目番号
			stmt.setString(7, compItemCd);		// 子品目番号
			stmt.setString(8, psEdition);		// 製品構成版数
			stmt.executeUpdate();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
		}
	}
	// Add End 20140310 wanghp
	
	/**
	 * 製品構成を修正します
	 *
	 * @param  parentItemCd 修正する製品構成の親品目番号
	 * @param  compItemCd 修正する製品構成の子品目番号
	 * @param  psEdition 修正する製品構成の版数
	 * @param  attribute 修正する製品構成の属性データ
	 * @throws SQLException DBアクセスに失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws ExpjBadException 更新数不一致
	 */
	public void modifyM_PS(String parentItemCd, String compItemCd, String psEdition,
			List attribute)
			throws SQLException, FoundationException, ExpjBadException
	{
		// 製品構成の更新数を検査
		testModifyCount(parentItemCd, compItemCd, psEdition, (String)attribute.get(13));
		// 製品構成を修正
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			if ("Oracle".equals(_connection.getMetaData().getDatabaseProductName()) == true) {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U(_sqlModifyM_PS));
			} else if ("Microsoft SQL Server".equals(
					_connection.getMetaData().getDatabaseProductName()) == true)
			{
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U_MSSQL(_sqlModifyM_PS));
			} else {
				stmt = _connection.prepareStatement(
						_objMessage.replaceSQL_U_DB2(_sqlModifyM_PS));
			}
			stmt.setString(1, _sysdate);		// 更新時刻
			stmt.setString(2, _userCode);		// 更新者
			stmt.setString(3, _programName);	// 更新プログラム名
			stmt.setString(4, (String)attribute.get(0));	// 製品構成単位数分母
			stmt.setString(5, (String)attribute.get(1));	// 製品構成単位数分子
			stmt.setString(6, (String)attribute.get(2));	// 製品構成有効開始日
			stmt.setString(7, (String)attribute.get(3));	// 製品構成有効終了日
			stmt.setString(8, (String)attribute.get(4));	// 構成仕損率
			stmt.setString(9, (String)attribute.get(5));	// 支給区分
			stmt.setString(10, (String)attribute.get(6));	// 製品構成リードタイム使用フラグ
			stmt.setString(11, (String)attribute.get(7));	// 製品構成固定リードタイム
			stmt.setString(12, (String)attribute.get(8));	// 製品構成比例分リードタイム
			stmt.setString(13, (String)attribute.get(9));	// 製品構成比例分ロットサイズ
			stmt.setString(14, (String)attribute.get(10));	// 製品構成照会キー
			stmt.setString(15, (String)attribute.get(11));	// 原価積上区分
			stmt.setString(16, (String)attribute.get(12));	// 所要量展開区分
			stmt.setString(17, parentItemCd);	// 親品目番号
			stmt.setString(18, compItemCd);		// 子品目番号
			stmt.setString(19, psEdition);		// 製品構成版数
			stmt.executeUpdate();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
		}
	}

	/**
	 * 製品構成を削除します
	 *
	 * @param  parentItemCd 削除する製品構成の親品目番号
	 * @param  compItemCd 削除する製品構成の子品目番号
	 * @param  psEdition 削除する製品構成の版数
	 * @param  modifyCount 削除する製品構成の更新数
	 * @throws SQLException DBアクセスに失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws ExpjBadException 更新数不一致
	 */
	public void deleteM_PS(String parentItemCd, String compItemCd, String psEdition,
			String modifyCount)
			throws SQLException, FoundationException, ExpjBadException
	{
		// 製品構成の更新数を検査
		testModifyCount(parentItemCd, compItemCd, psEdition, modifyCount);
		// 製品構成を削除
		PreparedStatement stmt = null;
		ResultSet result = null;
		try {
			stmt = _connection.prepareStatement(_sqlDeleteM_PS);
			stmt.setString(1, parentItemCd);
			stmt.setString(2, compItemCd);
			stmt.setString(3, psEdition);
			stmt.executeUpdate();
		} catch (SQLException se) {
			_errorInfo = new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ parentItemCd + "," + compItemCd + "," + psEdition);
			throw se;
		} finally {
			closePreparedStatement(stmt);
		}
		// 製品構成トランザクションへの削除記録の追加
		addSYS_PS_T(parentItemCd, compItemCd, psEdition, ACCESS_TYP_DELETE, CMPLT_FLG_FALSE);
	}

	/**
	 * 子製品構成をコピーします
	 *
	 * @param  fromParentItemCd コピー元製品構成の親品目番号
	 * @param  fromCompItemCd コピー元製品構成の子品目番号
	 * @param  fromPsEdition コピー元製品構成の製品構成版数
	 * @param  fromModifyCount コピー元製品構成の更新数
	 * @param  toParentItemCd コピー先製品構成の親品目番号
	 * @throws SQLException DBアクセスに失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws ExpjBadException 更新数不一致
	 */
	public void copyCompPs(String fromParentItemCd, String fromCompItemCd, String fromPsEdition,
			String fromModifyCount, String toParentItemCd)
			throws SQLException, FoundationException, ExpjBadException
	{
		// コピー元製品構成の属性データを取得
		List attribute = getPsAttribute(fromParentItemCd, fromCompItemCd, fromPsEdition);
		if (((String)attribute.get(13)).equals(fromModifyCount) == false) {
			// 更新数が一致しない場合
			// 他の処理によってデータが書き換えられています。再試行してください。
			throw new ExpjBadException(new ExpjMessage("ZZ01105",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ fromParentItemCd + "," + fromCompItemCd + "," + fromPsEdition));
		}
		// コピー先親品目の下に製品構成を追加
		addM_PS(toParentItemCd, fromCompItemCd, fromPsEdition, attribute);
	}

	/**
	 * 親製品構成をコピーします
	 *
	 * @param  fromParentItemCd コピー元製品構成の親品目番号
	 * @param  fromCompItemCd コピー元製品構成の子品目番号
	 * @param  fromPsEdition コピー元製品構成の製品構成版数
	 * @param  fromModifyCount コピー元製品構成の更新数
	 * @param  toCompItemCd コピー先製品構成の子品目番号
	 * @throws SQLException DBアクセスに失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws ExpjBadException 更新数不一致
	 */
	public void copyParentPs(String fromParentItemCd, String fromCompItemCd,
			String fromPsEdition, String fromModifyCount, String toCompItemCd)
			throws SQLException, FoundationException, ExpjBadException
	{
		// コピー元製品構成の属性データを取得
		List attribute = getPsAttribute(fromParentItemCd, fromCompItemCd, fromPsEdition);
		if (((String)attribute.get(13)).equals(fromModifyCount) == false) {
			// 更新数が一致しない場合
			// 他の処理によってデータが書き換えられています。再試行してください。
			throw new ExpjBadException(new ExpjMessage("ZZ01105",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD,PS_EDITION:"
					+ fromParentItemCd + "," + fromCompItemCd + "," + fromPsEdition));
		}
		// コピー先子品目の上に製品構成を追加
		addM_PS(fromParentItemCd, toCompItemCd, fromPsEdition, attribute);
	}

	/**
	 * 製品構成の親品目を置換します
	 *
	 * @param  parentItemCd 置換する製品構成の置換元親品目番号
	 * @param  compItemCd 置換する製品構成の子品目番号
	 * @param  psEdition 置換する製品構成の版数
	 * @param  toParentItemCd 置換する製品構成の置換先親品目番号
	 * @param  replaceDate 置換日付
	 * @param  modifyCount 削除/更新する製品構成の更新数
	 * @throws SQLException DBアクセスに失敗
	 * @throws ParseException 日付の形式変換に失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws ExpjBadException 更新数不一致
	 */
	//
	// 親品目置換イメージ
	//
	//   parentItemCd  P --> T toParentItemCd
	//      psEdition  |     |
	//     compItemCd  C     C
	//
	//   有効終了日が置換日付以降ならば有効終了日を置換日付の前日として残され、
	//   有効終了日が置換日付より前ならば削除される
	//   新たに、有効開始日が置換日付または置換日付より後の有効開始日の構成が
	//   生成される
	//
	public void replaceParentPs(String parentItemCd, String compItemCd, String psEdition,
			String toParentItemCd, String replaceDate, String modifyCount)
			throws SQLException, ParseException, FoundationException, ExpjBadException
	{
		replacePsSub(parentItemCd, compItemCd, psEdition, toParentItemCd, replaceDate, modifyCount,
				true);
	}

	/**
	 * 製品構成の子品目を置換します
	 *
	 * @param  parentItemCd 置換する製品構成の親品目番号
	 * @param  compItemCd 置換する製品構成の置換元子品目番号
	 * @param  psEdition 置換する製品構成の版数
	 * @param  toCompItemCd 置換する製品構成の置換先子品目番号
	 * @param  replaceDate 置換日付
	 * @param  modifyCount 削除/更新する製品構成の更新数
	 * @throws SQLException DBアクセスに失敗
	 * @throws ParseException 日付の形式変換に失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws ExpjBadException 更新数不一致
	 */
	//
	// 子品目置換イメージ
	//
	//   parentItemCd  P     P
	//      psEdition  |     |
	//     compItemCd  C --> T toCompItemCd
	//
	//   有効終了日が置換日付以降ならば有効終了日を置換日付の前日として残され、
	//   有効終了日が置換日付より前ならば削除される
	//   新たに、有効開始日が置換日付または置換日付より後の有効開始日の構成が
	//   生成される
	//
	public void replaceCompPs(String parentItemCd, String compItemCd, String psEdition,
			String toCompItemCd, String replaceDate, String modifyCount)
			throws SQLException, ParseException, FoundationException, ExpjBadException
	{
		replacePsSub(parentItemCd, compItemCd, psEdition, toCompItemCd, replaceDate, modifyCount,
				false);
	}

	/**
	 * 製品構成の品目を置換します
	 *
	 * @param  fromItemCd 置換する製品構成中の置換元品目番号
	 * @param  parentDataList 置換する製品構成の親品目番号、製品構成版数、更新数の組の一覧
	 * @param  compDataList 置換する製品構成の子品目番号と製品構成版数、更新数の組の一覧
	 * @param  toItemCd 置換する製品構成中の置換先品目番号
	 * @param  replaceDate 置換日付
	 * @return 1以上:ワーニングあり　0:ワーニングなし
	 * @throws SQLException DBアクセスに失敗
	 * @throws ParseException 日付の形式変換に失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws ExpjBadException 置換先品目に既存構成あり
	 * @throws PsMrpOdrTypException 品目手配区分に矛盾あり
	 */
	//
	// 置換イメージ
	//
	//   parentDataList P1 P2 P3...   P1 P2 P3...
	//                  |  |  |       |  |  |
	//                  +--+--+       +--+--+
	//                     |             |
	//       fromItemCd    F   ------>   T    toItemCd
	//                     |             |
	//                  +--+--+       +--+--+
	//                  |  |  |       |  |  |
	//     compDataList C1 C2 C3...   C1 C2 C3...
	//
	//   有効終了日が置換日付以降の構成は有効終了日を置換日付の前日として残され、
	//   有効終了日が置換日付より前の構成は削除される
	//   新たに、有効開始日が置換日付または置換日付より後の有効開始日の構成が
	//   生成される
	//
	// Upd Start 20140310 wanghp
	// public void replacePs(String fromItemCd, List parentDataList, List compDataList,
	public int replacePs(String fromItemCd, List parentDataList, List compDataList,
	// Upd End 20140310 wanghp
			String toItemCd, String replaceDate)
			throws SQLException, ParseException, FoundationException, ExpjBadException,
// 2008/07/15 SYSCOM 小林 ORIGINAL START
//					PsMrpOdrTypException
// 2008/07/15 SYSCOM 小林 ORIGINAL END
// 2008/07/15 SYSCOM 小林 UPD START
					PsMrpOdrTypException, PsManhourTypException
// 2008/07/15 SYSCOM 小林 UPD END
	{
		// Upd Start 20140304 wanghp
		// List itemEditionList = null;
		// 子構成なし/ありフラグ
		boolean hasCompPs = false;
		// 置換先の品目構成に、有効期間範囲以外の下位品目の存在フラグ
		int hasWarning = 0;
		// 置換件数の初期化
		ReplaceCount = 0;
		// Upd End 20140304 wanghp
		
		// Del Start 20140304 wanghp
		// if (hasParentPs(toItemCd)) {
		// 	// 置換先品目が親製品構成をもっていた場合
		// 	// エラー：置換先品目は既に製品構成に使用されています。
		// 	throw new ExpjBadException(new ExpjMessage("AA20012",
		// 			"M_PS.COMP_ITEM_CD:" + toItemCd));
		// }
		// Del End 20140304 wanghp
		
		if (hasCompPs(toItemCd)) {
			// Upd Start 20140304 wanghp
			// // 置換先品目が子製品構成をもっていた場合
			// // エラー：置換先品目は既に製品構成に使用されています。
			// throw new ExpjBadException(new ExpjMessage("AA20012",
			// 		"M_PS.PARENT_ITEM_CD:" + toItemCd));
			// 子構成あり
			hasCompPs = true;
			// Upd End 20140304 wanghp
		}
		
		// Add Start 20140306 wanghp
		// 置換先が子構成ありの場合
		if(hasCompPs){
			// 置換先の子構成と置換元の親構成が等しいのチェック
			isParentCompEqual(fromItemCd, toItemCd);
			
			// 置換元子構成が選択された場合、エラーとします。
			if(compDataList.size() > 0){
				throw new ExpjBadException("AA00218");
			}
		}
		// Add End 20140306 wanghp
		
// 2008/07/15 SYSCOM 小林 ADD START
		// Del Start 20140310 wanghp
		// if (compDataList.size() > 0) {
		// Del End 20140310 wanghp
			// 子構成の一覧を選択している場合、置換先品目番号が工数管理品目かチェックを行う。
			// エラー：置換元品目が工数管理品目の場合、下位品目を作成する置換は行えません。
			testManhourTyp(toItemCd);
		// Del Start 20140310 wanghp
		// }
		// Del End 20140310 wanghp
// 2008/07/15 SYSCOM 小林 ADD END
		
		int parentListSize = parentDataList.size();
		for (int i = 0; i < parentListSize; i++) {
			// 置換対象製品構成の親品目番号と製品構成版数を１組取得
			String[] parentData = (String[])parentDataList.get(i);
			
			// Add Start 20140311 wanghp
			// 同じ親品目が存在する場合、その構成は置換対象外
			if(isParentSame(parentData[0], toItemCd)){
				continue;
			}
			// Add End 20140311 wanghp
			
			// 製品構成の品目手配区分検査
			testMrpOrderType(parentData[0], toItemCd);
			// 製品構成の子品目を置換
			replaceCompPs(parentData[0], fromItemCd, parentData[1], toItemCd, replaceDate,
					parentData[2]);
		}
		
		// Add Start 20140310 wanghp
		// 置換先が子構成ありの場合
		if(hasCompPs){
			if(replaceHasCompPs(fromItemCd, toItemCd, replaceDate)){
				++hasWarning;
			}
		}
		// Add End 20140310 wanghp
		
		int compListSize = compDataList.size();
		for (int i = 0; i < compListSize; i++) {
			// 置換対象製品構成の子品目番号と製品構成版数を１組取得
			String[] compData = (String[])compDataList.get(i);
			// 製品構成の品目手配区分検査
			testMrpOrderType(toItemCd, compData[0]);
			// 製品構成の親品目を置換
			replaceParentPs(fromItemCd, compData[0], compData[1], toItemCd, replaceDate,
					compData[2]);
		}
		
		// Add Start 20140310 wanghp
		if(ReplaceCount == 0){
			throw new ExpjBadException("AA00220");
		}
		
		return hasWarning;
		// Add End 20140310 wanghp
	}
	
	// Add Start 20140306 wanghp
	/**
	 * 置換元親構成と置換先親構成の同じチェック
	 * @param parentItemCd 置換元親構成の品目番号
	 * @param toItemCd 置換先品目番号
	 * @return true:置換元親構成と置換先親構成が同じ  false:置換元親構成と置換先親構成が同じしない
	 * @throws SQLException DBアクセスに失敗
	 */
	private boolean isParentSame(String parentItemCd, String toItemCd) throws SQLException{
		// 置換先親構成の一覧を取得
		List parentPsList = getParentPsList(toItemCd);
		deleteDuplicateItemCd(parentPsList);
		String[] parentPs = new String[5];
		for(int i = 0; i < parentPsList.size(); i++){
			parentPs = (String[])parentPsList.get(i);
			if(parentItemCd.equals(parentPs[0])){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 置換先の子構成品目（置換先品目と子の子構成も含む）と置換元の親構成品目（親の親構成も含む）が等しいのチェック
	 * @param fromItemCd　置換元品目
	 * @param toItemCd　置換先品目
	 * @throws SQLException DBアクセスに失敗
	 * @throws PsLoopException
	 */
	private void isParentCompEqual(String fromItemCd, String toItemCd) throws SQLException, PsLoopException{
		try {
			// 子品目の同一品目検査（ループ検査）
			testLoopingParentPs(fromItemCd ,toItemCd);
			
			// 置換先子構成の一覧を取得
	        List compPsList = getCompPsList(toItemCd);
	        deleteDuplicateItemCd(compPsList);
	        String[] grandCompPs = new String[5];
	        String grandCompItemCd = new String();
	        for(int i = 0; i < compPsList.size(); i ++){
	        	grandCompPs = (String[])compPsList.get(i);
	        	grandCompItemCd = grandCompPs[0];
	 			// 孫品目の同一品目検査（ループ検査）
				testLoopingParentPs(fromItemCd ,grandCompItemCd);
 			
				isParentCompEqual(fromItemCd, grandCompItemCd);
	        }
		} catch (PsLoopException e) {
			throw new PsLoopException(new ExpjMessage("AA00055"));
		}
	}
	
	// Add End 20140306 wanghp

	/**
	 * 親製品構成にループがないか調べます
	 *
	 * @param  parentItemCd 検査する製品構成の親品目番号
	 * @param  compItemCd 検査する製品構成の子品目番号
	 * @throws SQLException DBアクセスに失敗
	 * @throws PsLoopException 親製品構成にループあり
	 */
	public void testLoopingParentPs(String parentItemCd, String compItemCd)
			throws SQLException, PsLoopException
	{
		// 親品目と子品目の同一品目検査（ループ検査）
		if (parentItemCd.equals(compItemCd) == true) {
			// ループあり
			throw new PsLoopException(new ExpjMessage("ZZ01006",
				"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
		}
		// 親の親品目番号の一覧を取得
		List grandParentPsList = getParentPsList(parentItemCd);
		deleteDuplicateItemCd(grandParentPsList);
		int listSize = grandParentPsList.size();
		for (int i = 0; i < listSize; i++) {
			String[] grandParentPs = (String[])grandParentPsList.get(i);
			String grandParentItemCd = grandParentPs[0];
			// 親の親品目の同一品目検査（ループ検査）
			if (compItemCd.equals(grandParentItemCd) == true) {
				// ループあり
				throw new PsLoopException(new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
			}
			// 親の親の親品目のループ検査
			testLoopingParentPs(grandParentItemCd, compItemCd);
		}
		// ループなし
	}

	/**
	 * 子製品構成にループがないか調べます
	 *
	 * @param  parentItemCd 検査する製品構成の親品目番号
	 * @param  compItemCd 検査する製品構成の子品目番号
	 * @throws SQLException DBアクセスに失敗
	 * @throws PsLoopException 子製品構成にループあり
	 */
	public void testLoopingCompPs(String parentItemCd, String compItemCd)
			throws SQLException, PsLoopException
	{
		// 親品目と子品目の同一品目検査（ループ検査）
		if (parentItemCd.equals(compItemCd) == true) {
			// ループあり
			throw new PsLoopException(new ExpjMessage("ZZ01006",
				"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
		}
		// 孫品目番号の一覧を取得
		List grandCompPsList = getCompPsList(compItemCd);
		deleteDuplicateItemCd(grandCompPsList);
		int listSize = grandCompPsList.size();
		for (int i = 0; i < listSize; i++) {
			String[] grandCompPs = (String[])grandCompPsList.get(i);
			String grandCompItemCd = grandCompPs[0];
			// 孫品目の同一品目検査（ループ検査）
			if (parentItemCd.equals(grandCompItemCd) == true) {
				// ループあり
				throw new PsLoopException(new ExpjMessage("ZZ01006",
					"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
			}
			// 曽孫品目のループ検査
			testLoopingCompPs(parentItemCd, grandCompItemCd);
		}
		// ループなし
	}

	/**
	 * 追加しようとしている製品構成に有効期間の重複がないか調べます
	 *
	 * @param  parentItemCd 検査する製品構成の親品目番号
	 * @param  compItemCd 検査する製品構成の子品目番号
	 * @param  inDate 製品構成有効開始日
	 * @param  inDate 製品構成有効開始日
	 * @throws SQLException DBアクセスに失敗
	 * @throws ParseException 日付の形式変換に失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws PsEffPhaseException 有効期間に重複あり
	 */
	public void testConflictEffPhase(String parentItemCd, String compItemCd, String inDate,
			String outDate)
			throws SQLException, ParseException, FoundationException, PsEffPhaseException
	{
		// 指定された親品目と子品目の製品構成の有効期間の一覧を取得
		List dateList = getEffPhaseList(parentItemCd, compItemCd);
		// 指定された開始日と終了日と有効期間の一覧を重複検査
		testConflictEffPhaseSub(dateList, inDate, outDate);
	}

	/**
	 * 修正しようとしている製品構成に有効期間の重複がないか調べます
	 *
	 * @param  parentItemCd 検査する製品構成の親品目番号
	 * @param  compItemCd 検査する製品構成の子品目番号
	 * @param  psEdition 検査する製品構成の版数
	 * @param  inDate 製品構成有効開始日
	 * @param  inDate 製品構成有効開始日
	 * @throws SQLException DBアクセスに失敗
	 * @throws ParseException 日付の形式変換に失敗
	 * @throws FoundationException 履歴情報登録用SQL文の生成に失敗
	 * @throws PsEffPhaseException 有効期間に重複あり
	 */
	public void testConflictEffPhase(String parentItemCd, String compItemCd, String psEdition,
			String inDate, String outDate)
			throws SQLException, ParseException, FoundationException, PsEffPhaseException
	{
		// 指定された親品目と子品目の製品構成の有効期間の一覧を取得
		// ただし、指定された構成品目版数のものを除外
		List dateList = getEffPhaseListWoPse(parentItemCd, compItemCd, psEdition);
		// 指定された開始日と終了日と有効期間の一覧を重複検査
		testConflictEffPhaseSub(dateList, inDate, outDate);
	}

	/**
	 * 製品構成に品目手配区分の矛盾がないか調べます
	 *
	 * @param  parentItemCd 検査する製品構成の親品目番号
	 * @param  compItemCd 検査する製品構成の子品目番号
	 * @throws SQLException DBアクセスに失敗
	 * @throws NoDataException 品目が存在しない
	 * @throws PsMrpOdrTypException 品目手配区分に矛盾あり
	 */
	public void testMrpOrderType(String parentItemCd, String compItemCd)
			throws SQLException, NoDataException, PsMrpOdrTypException
	{
		Integer parentType = null;	// 親品目の品目手配区分
		Integer compType = null;	// 子品目の品目手配区分
		// 親品目の品目手配区分を取得
		parentType = getMrpOrderType(parentItemCd);
		// 子品目の品目手配区分を取得
		compType = getMrpOrderType(compItemCd);
		if (parentType.intValue() == MRP_ODR_TYP_MANUAL
				|| parentType.intValue() == MRP_ODR_TYP_LOT_QTY
				|| parentType.intValue() == MRP_ODR_TYP_FIXED_QTY
				|| parentType.intValue() == MRP_ODR_TYP_ORDER_POINT)
		{
			// 親品目が④マニュアル手配品目、⑤ロット手配品目、⑥定量手配品目、
			// ⑦発注点手配品目のいずれかの場合
			if (compType.intValue() == MRP_ODR_TYP_ORDER_CD
					|| compType.intValue() == MRP_ODR_TYP_STOCK_ALLOC)
			{
				// 子品目が①個別品目 ②在庫引当型個別品目ならば：
				// 品目手配区分に矛盾あり
				throw new PsMrpOdrTypException(new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
			}
		}
		if (parentType.intValue() == MRP_ODR_TYP_PSEUDO_ITEM) {
			// 親品目が⑧擬似品目の場合
			if (compType.intValue() == MRP_ODR_TYP_PSEUDO_ITEM) {
				// 子品目が⑧擬似品目ならば：
				// 品目手配区分に矛盾あり
				throw new PsMrpOdrTypException(new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
			}
			if (compType.intValue() == MRP_ODR_TYP_MANUAL
					|| compType.intValue() == MRP_ODR_TYP_LOT_QTY
					|| compType.intValue() == MRP_ODR_TYP_FIXED_QTY
					|| compType.intValue() == MRP_ODR_TYP_ORDER_POINT)
			{
				// 子品目が④マニュアル手配品目、⑤ロット手配品目、⑥定量手配品目、
				// ⑦発注点手配品目のいずれかならば：
				// 品目手配区分に矛盾なし
				return;
			}
			// それ以外(①個別品目 ②在庫引当型個別品目)ならば：
			// 親品目が子品目となる製品構成の親品目を取得
			List psList = getParentPsList(parentItemCd);
			deleteDuplicateItemCd(psList);
			int listSize = psList.size();
			for (int i = 0; i < listSize; i++) {
				// 取得した親品目の品目手配区分取得
				String[] workPs = (String[])psList.get(i);
				Integer type = getMrpOrderType(workPs[0]);
				if (type.intValue() == MRP_ODR_TYP_MANUAL
						|| type.intValue() == MRP_ODR_TYP_LOT_QTY
						|| type.intValue() == MRP_ODR_TYP_FIXED_QTY
						|| type.intValue() == MRP_ODR_TYP_ORDER_POINT)
				{
					// 親品目が④マニュアル手配品目、⑤ロット手配品目、
					// ⑥定量手配品目、⑦発注点手配品目のいずれかならば：
					// 品目手配区分に矛盾あり
					throw new PsMrpOdrTypException(new ExpjMessage("ZZ01006",
							"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:"
							+ parentItemCd + "," + compItemCd));
				}
			}
		}
		if (compType.intValue() == MRP_ODR_TYP_PSEUDO_ITEM) {
			// 子品目が⑧擬似品目の場合
			if (parentType.intValue() == MRP_ODR_TYP_PSEUDO_ITEM) {
				// 親品目が⑧擬似品目ならば：
				// 品目手配区分に矛盾あり
				throw new PsMrpOdrTypException(new ExpjMessage("ZZ01006",
						"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
			}
			if (parentType.intValue() == MRP_ODR_TYP_ORDER_CD
					|| parentType.intValue() == MRP_ODR_TYP_STOCK_ALLOC)
			{
				// 親品目が①個別品目 ②在庫引当型個別品目のいずれかならば：
				// 品目手配区分に矛盾なし
				return;
			}
			// それ以外(④マニュアル手配品目、⑤ロット手配品目、⑥定量手配品目、
			// ⑦発注点手配品目)ならば：
			// 子品目が親品目となる製品構成の子品目を取得
			List psList = getCompPsList(compItemCd);
			deleteDuplicateItemCd(psList);
			int listSize = psList.size();
			for (int i = 0; i < listSize; i++) {
				// 取得した子品目の品目手配区分取得
				String[] workPs = (String[])psList.get(i);
				Integer type = getMrpOrderType(workPs[0]);
				if (type.intValue() == MRP_ODR_TYP_ORDER_CD
						|| type.intValue() == MRP_ODR_TYP_STOCK_ALLOC)
				{
					// 子品目が①個別品目 ②在庫引当型個別品目のいずれかならば：
					// 品目手配区分に矛盾あり
					throw new PsMrpOdrTypException(new ExpjMessage("ZZ01006",
							"M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:"
							+ parentItemCd + "," + compItemCd));
				}
			}
		}
		// 品目手配区分に矛盾なし
	}

// 2008/07/15 SYSCOM 小林 ADD START
	/**
	 * 工数管理品目区分のチェックを行います。
	 *
	 * @param  itemCd 検査する親となる品目番号
	 * @throws SQLException DBアクセスに失敗
	 * @throws NoDataException 品目が存在しない
	 * @throws PsManhourTypException 親品目が工数管理品目だった場合
	 */
	public void testManhourTyp(String itemCd)
			throws SQLException, NoDataException, PsManhourTypException
	{
		Integer manhourTyp = null;	// 工数管理品目区分
		
		// 工数管理品目区分を取得
		manhourTyp = getManhourTyp(itemCd);

		if (manhourTyp.intValue() == MANHOUR_TYP_CTRL)
		{
			throw new PsManhourTypException(new ExpjMessage("ZZ01006",
					"M_ITEM.ITEM_CD:" + itemCd));
		}
		// 工数管理品目ではない
	}
// 2008/07/15 SYSCOM 小林 ADD END

	/**
	 * SQL例外発生時のエラー情報をクリアします
	 */
	public void clearErrorInfo()
	{
		_errorInfo = null;
	}

	/**
	 * SQL例外発生時のエラー情報を返却します
	 *
	 * @return エラーの情報
	 */
	public ExpjMessage getErrorInfo()
	{
		if (_errorInfo == null) {
			return null;
		} else {
			return _errorInfo;
		}
	}

	/**
	 * PsMaintenanceオブジェクトを構築します
	 *
	 * @param connection コネクションオブジェクト
	 * @param userCode ユーザコード
	 * @param programName プログラム名
	 * @param sysdate 処理時刻
	 */
	public PsMaintenance(IDbConnection connection, String userCode, String programName,
			String sysdate)
	{
		_connection = connection.getConn();
		_userCode = userCode;
		_programName = programName;
		_sysdate = sysdate;
		clearErrorInfo();
	}
}