//------------------------------------------------------------------------------
// (#)ProductStructureRepository.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/09 新規作成 K.Matsumoto
// 2003/06/16 パッケージを修正 K.Matsumoto
//            前：com.nec.jp.orteus.metamorBase.util.ProductStructureRepository
//            後：com.nec.jp.orteus.metamorBase.util.common
// 2003/06/24 OrteusStudioバージョンアップに伴う修正 Y.Inada
//            前：doConnection[ver1.00.03]
//            後：IDbConnection[ver1.00.05]
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
// 2003/08/08 パッケージ名変更 M.Isoda
//            前：com.nec.jp.orteus.metamorBase.util.common
//            後：com.nec.jp.orteus.metamorBase.common01.Accessor
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.Accessor;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;

/**
 * 製品構成を展開するためのユーティリティクラス。
 *
 * @author  M.Sakamoto
 * @version 1.00
 */
public class ProductStructureRepository
{
	/**
	 * 展開(順展開)。
	 * @param  itemCd 基準品目番号
	 * @return 品目番号一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	public ArrayList orderDeployment(String itemCd) throws SQLException
	{
		return deploymentOnly(itemCd, _sqlOrderDeployment);
	}

	/**
	 * 展開(順展開) 日付指定あり。
	 * @param  itemCd 基準品目番号
	 * @param  targetDate 指定日付
	 * @return 品目番号一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	public ArrayList orderDeployment(String itemCd, Date targetDate) throws SQLException
	{
		if(null == targetDate)
			return orderDeployment(itemCd);
		else
			return deploymentOnlyDate(itemCd, targetDate, _sqlOrderDeploymentDate);
	}

	/**
	 * 展開(逆展開)。
	 * @param  itemCd 基準品目番号
	 * @return 品目番号一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	public ArrayList reverseDeployment(String itemCd) throws SQLException
	{
		return deploymentOnly(itemCd, _sqlReverseDeployment);
	}

	/**
	 * 展開(逆展開) 日付指定あり。
	 * @param  itemCd 基準品目番号
	 * @param  targetDate 指定日付
	 * @return 品目番号一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	public ArrayList reverseDeployment(String itemCd, Date targetDate) throws SQLException
	{
		if(null == targetDate)
			return reverseDeployment(itemCd);
		else
			return deploymentOnlyDate(itemCd, targetDate, _sqlReverseDeploymentDate);
	}

	/**
	 * 展開実行:日付指定なし(単体展開)。
	 * @param  itemCd 基準品目番号
	 * @param  sql SQL文
	 * @return 品目番号一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	private ArrayList deploymentOnly(String itemCd, String sql) throws SQLException
	{
		ArrayList list = null;
		PreparedStatement stmt = null;
		try {
			// 展開準備
			stmt = (_connection.getConn()).prepareStatement(sql);
			stmt.setString(1, itemCd);
			list = executeQueryOnly(stmt);
		} finally {
			if(null != stmt) stmt.close();
		}
		return list;
	}

	/**
	 * 展開:日付指定あり(単体展開)。
	 * @param  itemCd 基準品目番号
	 * @param  targetDate 指定日付
	 * @param  sql SQL文
	 * @return 品目番号一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	private ArrayList deploymentOnlyDate(
			String itemCd, Date targetDate, String sql) throws SQLException
	{
		ArrayList list = null;
		PreparedStatement stmt = null;
		try {
			// 展開準備
			SimpleDateFormat formatter = new SimpleDateFormat(_dateFormat);
			stmt = (_connection.getConn()).prepareStatement(sql);
			stmt.setString(1, itemCd);
			stmt.setString(2, formatter.format(targetDate));
			stmt.setString(3, formatter.format(targetDate));
			list = executeQueryOnly(stmt);
		} finally {
			if(null != stmt) stmt.close();
		}
		return list;
	}

	/**
	 * SQL発行(単体展開)。
	 * @param  stmt SQL構築済みのPreparedStatement
	 * @return 品目番号一覧
	 * @throws SQLException DBアクセスに失敗
	 */
	private ArrayList executeQueryOnly(PreparedStatement stmt) throws SQLException
	{
		ArrayList list = new ArrayList(0);
		ResultSet result = null;
		try {
			// SQL発行
			result = stmt.executeQuery();

			// 展開
			while(true == result.next()) {
				String value = new String(result.getString(1));
				list.add(value);
			}
		} finally {
			if(null != result) result.close();
		}
		return list;
	}

	/**
	 * 構築。
	 * @param connection コネクションオブジェクト
	 */
	public ProductStructureRepository(IDbConnection connection)
	{
		_connection = connection;
	}


	/** SQL定義。 順展開取得用 */
	private final String _sqlOrderDeployment =
		  "select M_PS.\"COMP_ITEM_CD\" as \"ITEM_CD\" "
		+ "from M_PS "
		+ "where M_PS.\"PARENT_ITEM_CD\" = ? "
		+ "order by M_PS.\"PS_REF_NO\", M_PS.\"COMP_ITEM_CD\"";

	/**  SQL定義。 順展開取得用(日付あり) */
	private final String _sqlOrderDeploymentDate =
		  "select M_PS.\"COMP_ITEM_CD\" as \"ITEM_CD\" "
		+ "from M_PS "
		+ "where M_PS.\"PARENT_ITEM_CD\" = ? "
		+ "and TO_CHAR(M_PS.\"EFF_PHASE_IN_DATE\", 'YYYYMMDD') <= ? "
		+ "and ? <= TO_CHAR(M_PS.\"EFF_PHASE_OUT_DATE\", 'YYYYMMDD') "
		+ "order by M_PS.\"PS_REF_NO\", M_PS.\"COMP_ITEM_CD\"";

	/**  SQL定義。 逆展開取得用 */
	private final String _sqlReverseDeployment =
		  "select M_PS.\"PARENT_ITEM_CD\" as \"ITEM_CD\" "
		+ "from M_PS "
		+ "where M_PS.\"COMP_ITEM_CD\" = ? "
		+ "order by M_PS.\"PS_REF_NO\", M_PS.\"PARENT_ITEM_CD\"";

	/**  SQL定義。 逆展開取得用(日付あり) */
	private final String _sqlReverseDeploymentDate =
		  "select M_PS.\"PARENT_ITEM_CD\" as \"ITEM_CD\" "
		+ "from M_PS "
		+ "where M_PS.\"COMP_ITEM_CD\" = ? "
		+ "and TO_CHAR(M_PS.\"EFF_PHASE_IN_DATE\", 'YYYYMMDD') <= ? "
		+ "and ? <= TO_CHAR(M_PS.\"EFF_PHASE_OUT_DATE\", 'YYYYMMDD') "
		+ "order by M_PS.\"PS_REF_NO\", M_PS.\"PARENT_ITEM_CD\"";

	/** 日付指定を行う場合の有効フォーマット。 */
	private final String _dateFormat = "yyyyMMdd";

	/** コネクションオブジェクト。 */
	private IDbConnection _connection = null;
}
