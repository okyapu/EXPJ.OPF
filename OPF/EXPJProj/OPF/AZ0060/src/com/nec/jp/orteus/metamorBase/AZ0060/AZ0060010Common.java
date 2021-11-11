package com.nec.jp.orteus.metamorBase.AZ0060;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;

import java.util.*;
import java.sql.*;

import com.nec.jp.orteus.expj.exception.*;


public class AZ0060010Common extends DataObject {
	// selectMST_APPRクラス インスタンス
	public selectMST_APPR mselectMST_APPR = new selectMST_APPR();

	// checkAPPR_POWERクラス インスタンス
	public checkAPPR_POWER mcheckAPPR_POWER = new checkAPPR_POWER();

	// selectUSER_MSTクラス インスタンス
	public selectUSER_MST mselectUSER_MST = new selectUSER_MST();

	// selectM_UNIT_COSTクラス インスタンス
	public selectM_UNIT_COST mselectM_UNIT_COST = new selectM_UNIT_COST();

	// selectM_CONS_UNIT_COSTクラス インスタンス
	public selectM_CONS_UNIT_COST mselectM_CONS_UNIT_COST = new selectM_CONS_UNIT_COST();

	// selectM_SBCNT_UNIT_COSTクラス インスタンス
	public selectM_SBCNT_UNIT_COST mselectM_SBCNT_UNIT_COST = new selectM_SBCNT_UNIT_COST();

	// selectM_SBCNT_UNIT_COST_Hクラス インスタンス
	public selectM_SBCNT_UNIT_COST_H mselectM_SBCNT_UNIT_COST_H = new selectM_SBCNT_UNIT_COST_H();

	// selectM_PUCH_UNIT_COST_Hクラス インスタンス
	public selectM_PUCH_UNIT_COST_H mselectM_PUCH_UNIT_COST_H = new selectM_PUCH_UNIT_COST_H();

	// selectM_PUCH_UNIT_COSTクラス インスタンス
	public selectM_PUCH_UNIT_COST mselectM_PUCH_UNIT_COST = new selectM_PUCH_UNIT_COST();

	// selectM_VEND_CTRLクラス インスタンス
	public selectM_VEND_CTRL mselectM_VEND_CTRL = new selectM_VEND_CTRL();

	// selectM_CUST_STL_CTRLクラス インスタンス
	public selectM_CUST_STL_CTRL mselectM_CUST_STL_CTRL = new selectM_CUST_STL_CTRL();

	// selectM_CLAIM_CUST_CTRLクラス インスタンス
	public selectM_CLAIM_CUST_CTRL mselectM_CLAIM_CUST_CTRL = new selectM_CLAIM_CUST_CTRL();

	// selectM_CUSTクラス インスタンス
	public selectM_CUST mselectM_CUST = new selectM_CUST();

	// selectM_EXCH_RATEクラス インスタンス
	public selectM_EXCH_RATE mselectM_EXCH_RATE = new selectM_EXCH_RATE();

	// selectM_COMPANYクラス インスタンス
	public selectM_COMPANY mselectM_COMPANY = new selectM_COMPANY();

	// selectM_USER_COMPANYクラス インスタンス
	public selectM_USER_COMPANY mselectM_USER_COMPANY = new selectM_USER_COMPANY();

	// selectM_BANK_Hクラス インスタンス
	public selectM_BANK_H mselectM_BANK_H = new selectM_BANK_H();

	// selectM_B_ACCTクラス インスタンス
	public selectM_B_ACCT mselectM_B_ACCT = new selectM_B_ACCT();

	// selectM_REVAL_EXCH_RATEクラス インスタンス
	public selectM_REVAL_EXCH_RATE mselectM_REVAL_EXCH_RATE = new selectM_REVAL_EXCH_RATE();

	// selectM_ACCTクラス インスタンス
	public selectM_ACCT mselectM_ACCT = new selectM_ACCT();

	// selectM_BANK_FEEクラス インスタンス
	public selectM_BANK_FEE mselectM_BANK_FEE = new selectM_BANK_FEE();

	// selectM_VEND_PAY_CTRLクラス インスタンス
	public selectM_VEND_PAY_CTRL mselectM_VEND_PAY_CTRL = new selectM_VEND_PAY_CTRL();

	// selectM_PAY_METHODクラス インスタンス
	public selectM_PAY_METHOD mselectM_PAY_METHOD = new selectM_PAY_METHOD();

	// selectM_USER_CTRL_Hクラス インスタンス
	public selectM_USER_CTRL_H mselectM_USER_CTRL_H = new selectM_USER_CTRL_H();

	// selectM_PAY_PATTERNクラス インスタンス
	public selectM_PAY_PATTERN mselectM_PAY_PATTERN = new selectM_PAY_PATTERN();

	// selectM_AUTO_JNLクラス インスタンス
	public selectM_AUTO_JNL mselectM_AUTO_JNL = new selectM_AUTO_JNL();

	// selectM_CUST_BASEクラス インスタンス
	public selectM_CUST_BASE mselectM_CUST_BASE = new selectM_CUST_BASE();

	// selectM_BANKクラス インスタンス
	public selectM_BANK mselectM_BANK = new selectM_BANK();

	// selectM_CUST_BRANCHクラス インスタンス
	public selectM_CUST_BRANCH mselectM_CUST_BRANCH = new selectM_CUST_BRANCH();

	// selectM_SALES_UNIT_COSTクラス インスタンス
	public selectM_SALES_UNIT_COST mselectM_SALES_UNIT_COST = new selectM_SALES_UNIT_COST();

	// selectM_CUST_BRANCHクラス インスタンス
	public selectM_CUSTJa mselectM_CUSTJa = new selectM_CUSTJa();

	// selectM_DLV_LOCクラス インスタンス
	public selectM_DLV_LOC mselectM_DLV_LOC = new selectM_DLV_LOC();

	// selectM_CUST_DESINATED_DLV_LOCクラス インスタンス
	public selectM_CUST_DESINATED_DLV_LOC mselectM_CUST_DESINATED_DLV_LOC = new selectM_CUST_DESINATED_DLV_LOC();

	// selectM_CUST_DESINATED_DLV_LOCクラス インスタンス
	public selectM_ITEM mselectM_ITEM = new selectM_ITEM();
	
	// selectM_UNIT_COSTクラス インスタンス
	public selectM_UNIT_COST_JF mselectM_UNIT_COST_JF = new selectM_UNIT_COST_JF();
	
	// selectM_STOCK_STSクラス インスタンス
	public selectM_STOCK_STS mselectM_STOCK_STS = new selectM_STOCK_STS();

	// selectM_STOCK_STSクラス インスタンス
	public selectM_CUST_COMB mselectM_CUST_COMB = new selectM_CUST_COMB();
	
	// selectM_CUST_JFクラス インスタンス
	public selectM_CUST_JF mselectM_CUST_JF = new selectM_CUST_JF();
	
	// selectM_CUST_DESINATED_DLV_LOCクラス インスタンス
	public selectM_ITEM_JF mselectM_ITEM_JF = new selectM_ITEM_JF();
	
	// checkAppr4クラス インスタンス
	public checkAppr4 mcheckAppr4 = new checkAppr4();

	// checkAppr3クラス インスタンス
	public checkAppr3 mcheckAppr3 = new checkAppr3();

	// checkAppr2クラス インスタンス
	public checkAppr2 mcheckAppr2 = new checkAppr2();
	
	// checkAppr1クラス インスタンス
	public checkAppr1 mcheckAppr1 = new checkAppr1();

	// checkAppr5クラス インスタンス
	public checkAppr5 mcheckAppr5 = new checkAppr5();
	
	/**
	 * Entity定義 静的SQL
	 */
	public class selectMST_APPR extends DataObject {
		protected String m_selcmd = "SELECT " + "  MST_APPR.APPR_ID " + "FROM "
				+ "  MST_APPR " + "WHERE " + "  MST_APPR.APPR_ID = ? "
				+ "  AND MST_APPR.MODIFY_COUNT = ? " + "FOR UPDATE NOWAIT";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:selectMST_APPR_read
			if (m_selcmd == null)
				throw new FoundationException("selectMST_APPR", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:selectMST_APPR_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.geth_APPR_ID());
				if (isNull(data.geth_APPR_ID()))
					isNull = true;
				ary.addElement(data.geth_MODIFY_COUNT());
				if (isNull(data.geth_MODIFY_COUNT()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.geth_APPR_ID(), stmt);
			// 静的SQL文の生成
			setString(no++, data.geth_MODIFY_COUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.seth_APPR_ID(getString(1, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class checkAPPR_POWER extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.APPR_POWER_TYP " + "FROM "
				+ "  USER_MST A " + "WHERE " + "  A.USER_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:checkAPPR_POWER_read
			if (m_selcmd == null)
				throw new FoundationException("checkAPPR_POWER", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:checkAPPR_POWER_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getLOGIN_USER_CD());
				if (isNull(data.getLOGIN_USER_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getLOGIN_USER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.seth_APPR_POWER_TYP(getString(1, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectUSER_MST extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  USER_MST.USER_CD AS USER_CD, "
				+ "  USER_MST.USER_NAME AS USER_NAME, "
				+ "  USER_MST.PLANT_CD AS PLANT_CD, "
				+ "  USER_MST.SECTION_CD AS SECTION_CD, "
				+ "  USER_MST.PASSWORD AS PASSWORD, "
				+ "  USER_MST.ADDRESS AS ADDRESS, "
				+ "  USER_MST.LOCALE AS LOCALE, "
				+ "  USER_MST.APPR_POWER_TYP AS APPR_POWER_TYP " + "FROM "
				+ "  USER_MST " + "WHERE " + "  USER_MST.USER_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectUSER_MST", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getUSER_CD());
				if (isNull(data.getUSER_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getUSER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_USER_CD(getString(1, rs));
			data.setd_OLD_USER_NAME(getString(2, rs));
			data.setd_OLD_PLANT_CD(getString(3, rs));
			data.setd_OLD_SECTION_CD(getString(4, rs));
			data.setd_OLD_PASSWORD(getString(5, rs));
			data.setd_OLD_ADDRESS(getString(6, rs));
			data.setd_OLD_LOCALE(getString(7, rs));
			data.setd_OLD_APPR_POWER_TYP(getString(8, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_UNIT_COST extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.ITEM_CD, "
				+ "  A.CUST_CD, "
				+ "  TO_CHAR(A.EFF_PHASE_IN_DATE, 'YYYY/MM/DD'), "
				+ "  A.UNIT_COST_TYP, " + "  A.UNIT_COST " + "FROM "
				+ "  M_UNIT_COST A " + "WHERE " + "  A.COMPANY_CD = ? "
				+ "  AND A.CUST_CD = ? " + "  AND A.ITEM_CD = ? "
				+ "  AND A.EFF_PHASE_IN_DATE = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_UNIT_COST", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;
				ary.addElement(data.getITEM_CD());
				if (isNull(data.getITEM_CD()))
					isNull = true;
				ary.addElement(data.getEFF_PHASE_IN_DATE());
				if (isNull(data.getEFF_PHASE_IN_DATE()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEFF_PHASE_IN_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_ITEM_CD(getString(1, rs));
			data.setd_OLD_CUST_CD(getString(2, rs));
			data.setd_OLD_EFF_PHASE_IN_DATE(getString(3, rs));
			data.setd_OLD_UNIT_COST_TYP(getString(4, rs));
			data.setd_OLD_UNIT_COST(getString(5, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CONS_UNIT_COST extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_CONS_UNIT_COST.\"ITEM_CD\" AS \"ITEM_CD\", "
				+ "  M_CONS_UNIT_COST.\"VEND_CD\" AS \"VEND_CD\", "
				+ "  TO_CHAR(M_CONS_UNIT_COST.\"EFF_PHASE_IN_DATE\", 'YYYY/MM/DD') AS \"EFF_PHASE_IN_DATE\", "
				+ "  M_CONS_UNIT_COST.\"UNIT_COST_TYP\" AS \"UNIT_COST_TYP\", "
				+ "  M_CONS_UNIT_COST.\"UNIT_COST\" AS \"UNIT_COST\", "
				+ "  M_CONS_UNIT_COST.\"ONEROUS_FLG\" AS \"ONEROUS_FLG\" "
				+ "FROM " + "  M_CONS_UNIT_COST " + "WHERE "
				+ "  M_CONS_UNIT_COST.\"COMPANY_CD\" = ? "
				+ "  AND M_CONS_UNIT_COST.\"VEND_CD\" = ? "
				+ "  AND M_CONS_UNIT_COST.\"PLANT_CD\" = ? "
				+ "  AND M_CONS_UNIT_COST.\"ITEM_CD\" = ? "
				+ "  AND M_CONS_UNIT_COST.\"EFF_PHASE_IN_DATE\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_CONS_UNIT_COST", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getVEND_CD());
				if (isNull(data.getVEND_CD()))
					isNull = true;
				ary.addElement(data.getPLANT_CD());
				if (isNull(data.getPLANT_CD()))
					isNull = true;
				ary.addElement(data.getITEM_CD());
				if (isNull(data.getITEM_CD()))
					isNull = true;
				ary.addElement(data.getEFF_PHASE_IN_DATE());
				if (isNull(data.getEFF_PHASE_IN_DATE()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEFF_PHASE_IN_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_ITEM_CD(getString(1, rs));
			data.setd_OLD_VEND_CD(getString(2, rs));
			data.setd_OLD_EFF_PHASE_IN_DATE(getString(3, rs));
			data.setd_OLD_UNIT_COST_TYP(getString(4, rs));
			data.setd_OLD_UNIT_COST(getString(5, rs));
			data.setd_OLD_ONEROUS_FLG(getString(6, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_SBCNT_UNIT_COST extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_SBCNT_UNIT_COST.ITEM_CD AS ITEM_CD, "
				+ "  M_SBCNT_UNIT_COST.PROC_CD AS PROC_CD, "
				+ "  M_SBCNT_UNIT_COST.VEND_CD AS VEND_CD, "
				+ "  TO_CHAR(M_SBCNT_UNIT_COST.\"EFF_PHASE_IN_DATE\", 'YYYY/MM/DD') AS \"EFF_PHASE_IN_DATE\", "
				+ "  M_SBCNT_UNIT_COST.\"UNIT_COST\" AS \"UNIT_COST\", "
				+ "  M_SBCNT_UNIT_COST.\"UNIT_COST_TYP\" AS \"UNIT_COST_TYP\", "
				+ "  M_SBCNT_UNIT_COST.\"PROCESSING_COST\" AS \"PROCESSING_COST\", "
				+ "  M_SBCNT_UNIT_COST.\"MATERIAL_COST\" AS \"MATERIAL_COST\", "
				+ "  M_SBCNT_UNIT_COST.\"OTHER_OVERHEADS\" AS \"OTHER_OVERHEADS\" "
				+ "FROM " + "  M_SBCNT_UNIT_COST " + "WHERE "
				+ "  M_SBCNT_UNIT_COST.\"COMPANY_CD\" = ? "
				+ "  AND M_SBCNT_UNIT_COST.\"VEND_CD\" = ? "
				+ "  AND M_SBCNT_UNIT_COST.\"PLANT_CD\" = ? "
				+ "  AND M_SBCNT_UNIT_COST.\"ITEM_CD\" = ? "
				+ "  AND M_SBCNT_UNIT_COST.\"PROC_CD\" = ? "
				+ "  AND M_SBCNT_UNIT_COST.\"EFF_PHASE_IN_DATE\" = ? "
				+ "  AND M_SBCNT_UNIT_COST.\"SBCNT_SIZE\" = 0";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_SBCNT_UNIT_COST",
						"read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getVEND_CD());
				if (isNull(data.getVEND_CD()))
					isNull = true;
				ary.addElement(data.getPLANT_CD());
				if (isNull(data.getPLANT_CD()))
					isNull = true;
				ary.addElement(data.getITEM_CD());
				if (isNull(data.getITEM_CD()))
					isNull = true;
				ary.addElement(data.getPROC_CD());
				if (isNull(data.getPROC_CD()))
					isNull = true;
				ary.addElement(data.getEFF_PHASE_IN_DATE());
				if (isNull(data.getEFF_PHASE_IN_DATE()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPROC_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEFF_PHASE_IN_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_ITEM_CD(getString(1, rs));
			data.setd_OLD_PROC_CD(getString(2, rs));
			data.setd_OLD_VEND_CD(getString(3, rs));
			data.setd_OLD_EFF_PHASE_IN_DATE(getString(4, rs));
			data.setd_OLD_UNIT_COST(getString(5, rs));
			data.setd_OLD_UNIT_COST_TYP(getString(6, rs));
			data.setd_OLD_PROCESSING_COST(getString(7, rs));
			data.setd_OLD_MATERIAL_COST(getString(8, rs));
			data.setd_OLD_OTHER_OVERHEADS(getString(9, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_SBCNT_UNIT_COST_H extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_SBCNT_UNIT_COST_H.ITEM_CD AS ITEM_CD, "
				+ "  M_SBCNT_UNIT_COST_H.PROC_CD AS PROC_CD, "
				+ "  M_SBCNT_UNIT_COST_H.VEND_CD AS VEND_CD, "
				+ "  M_SBCNT_UNIT_COST_H.VEND_ITEM_CD AS VEND_ITEM_CD "
				+ "FROM " + "  M_SBCNT_UNIT_COST_H " + "WHERE "
				+ "  M_SBCNT_UNIT_COST_H.\"COMPANY_CD\" = ? "
				+ "  AND M_SBCNT_UNIT_COST_H.\"VEND_CD\" = ? "
				+ "  AND M_SBCNT_UNIT_COST_H.\"PLANT_CD\" = ? "
				+ "  AND M_SBCNT_UNIT_COST_H.\"ITEM_CD\" = ? "
				+ "  AND M_SBCNT_UNIT_COST_H.\"PROC_CD\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_SBCNT_UNIT_COST_H",
						"read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getVEND_CD());
				if (isNull(data.getVEND_CD()))
					isNull = true;
				ary.addElement(data.getPLANT_CD());
				if (isNull(data.getPLANT_CD()))
					isNull = true;
				ary.addElement(data.getITEM_CD());
				if (isNull(data.getITEM_CD()))
					isNull = true;
				ary.addElement(data.getPROC_CD());
				if (isNull(data.getPROC_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPROC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_ITEM_CD(getString(1, rs));
			data.setd_OLD_PROC_CD(getString(2, rs));
			data.setd_OLD_VEND_CD(getString(3, rs));
			data.setd_OLD_VEND_ITEM_CD(getString(4, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PUCH_UNIT_COST_H extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_PUCH_UNIT_COST_H.ITEM_CD AS ITEM_CD, "
				+ "  M_PUCH_UNIT_COST_H.VEND_CD AS VEND_CD, "
				+ "  M_PUCH_UNIT_COST_H.PUCH_PRIORITY_REF_NO AS PUCH_PRIORITY_REF_NO, "
				+ "  M_PUCH_UNIT_COST_H.VEND_ITEM_CD AS VEND_ITEM_CD "
				+ "FROM " + "  M_PUCH_UNIT_COST_H " + "WHERE "
				+ "  M_PUCH_UNIT_COST_H.COMPANY_CD = ? "
				+ "  AND M_PUCH_UNIT_COST_H.VEND_CD = ? "
				+ "  AND M_PUCH_UNIT_COST_H.PLANT_CD = ? "
				+ "  AND M_PUCH_UNIT_COST_H.ITEM_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_PUCH_UNIT_COST_H",
						"read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getVEND_CD());
				if (isNull(data.getVEND_CD()))
					isNull = true;
				ary.addElement(data.getPLANT_CD());
				if (isNull(data.getPLANT_CD()))
					isNull = true;
				ary.addElement(data.getITEM_CD());
				if (isNull(data.getITEM_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_ITEM_CD(getString(1, rs));
			data.setd_OLD_VEND_CD(getString(2, rs));
			data.setd_OLD_PUCH_PRIORITY_REF_NO(getString(3, rs));
			data.setd_OLD_VEND_ITEM_CD(getString(4, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PUCH_UNIT_COST extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_PUCH_UNIT_COST.ITEM_CD AS ITEM_CD, "
				+ "  M_PUCH_UNIT_COST.VEND_CD AS VEND_CD, "
				+ "  TO_CHAR(M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE,'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "
				+ "  M_PUCH_UNIT_COST.PUCH_SIZE AS PUCH_SIZE, "
				+ "  M_PUCH_UNIT_COST.UNIT_COST_TYP AS UNIT_COST_TYP, "
				+ "  M_PUCH_UNIT_COST.UNIT_COST AS UNIT_COST, "
				+ "  M_PUCH_UNIT_COST.PROCESSING_COST AS PROCESSING_COST, "
				+ "  M_PUCH_UNIT_COST.MATERIAL_COST AS MATERIAL_COST, "
				+ "  M_PUCH_UNIT_COST.OTHER_OVERHEADS AS OTHER_OVERHEADS "
				+ "FROM " + "  M_PUCH_UNIT_COST " + "WHERE "
				+ "  M_PUCH_UNIT_COST.COMPANY_CD = ? "
				+ "  AND M_PUCH_UNIT_COST.VEND_CD = ? "
				+ "  AND M_PUCH_UNIT_COST.PLANT_CD = ? "
				+ "  AND M_PUCH_UNIT_COST.ITEM_CD = ? "
				+ "  AND M_PUCH_UNIT_COST.EFF_PHASE_IN_DATE = ? "
				+ "  AND M_PUCH_UNIT_COST.PUCH_SIZE = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_PUCH_UNIT_COST", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getVEND_CD());
				if (isNull(data.getVEND_CD()))
					isNull = true;
				ary.addElement(data.getPLANT_CD());
				if (isNull(data.getPLANT_CD()))
					isNull = true;
				ary.addElement(data.getITEM_CD());
				if (isNull(data.getITEM_CD()))
					isNull = true;
				ary.addElement(data.getEFF_PHASE_IN_DATE());
				if (isNull(data.getEFF_PHASE_IN_DATE()))
					isNull = true;
				ary.addElement(data.getPUCH_SIZE());
				if (isNull(data.getPUCH_SIZE()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPLANT_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEFF_PHASE_IN_DATE(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPUCH_SIZE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_ITEM_CD(getString(1, rs));
			data.setd_OLD_VEND_CD(getString(2, rs));
			data.setd_OLD_EFF_PHASE_IN_DATE(getString(3, rs));
			data.setd_OLD_PUCH_SIZE(getString(4, rs));
			data.setd_OLD_UNIT_COST_TYP(getString(5, rs));
			data.setd_OLD_UNIT_COST(getString(6, rs));
			data.setd_OLD_PROCESSING_COST(getString(7, rs));
			data.setd_OLD_MATERIAL_COST(getString(8, rs));
			data.setd_OLD_OTHER_OVERHEADS(getString(9, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_VEND_CTRL extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.VEND_CD, "
				+ "  A.VEND_NAME, " + "  A.VEND_ANAME, " + "  A.VEND_KNAME, "
				+ "  A.ZIP_CD, " + "  A.ADDRESS_1, " + "  A.ADDRESS_2, "
				+ "  A.ADDRESS_K_1, " + "  A.ADDRESS_K_2, " + "  A.TEL, "
				+ "  A.FAX, " + "  A.EMAIL, " + "  A.VEND_ORG, "
				+ "  A.VEND_PERSON, " + "  A.OWN_ORG_CD, "
				+ "  A.OWN_ORG_NAME, " + "  A.OWN_PERSON_CD, "
				+ "  A.ROUND_TYP, " + "  A.TAX_CD, " + "  A.TAX_APPLY_TYP, "
				+ "  A.TAX_CALC_TYP, " + "  A.INSPC_ACPT_APP_TYP, "
				+ "  A.VEND_REM, " + "  A.CUR_CD, " + "  A.EXCH_TYP, "
				+ "  A.IMPORT_TRN_TYP " + "FROM " + "  M_VEND_CTRL A "
				+ "WHERE " + "  A.COMPANY_CD = ? " + "  AND A.VEND_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_VEND_CTRL", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getVEND_CD());
				if (isNull(data.getVEND_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getVEND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_VEND_CD(getString(1, rs));
			data.setd_OLD_VEND_NAME(getString(2, rs));
			data.setd_OLD_VEND_ANAME(getString(3, rs));
			data.setd_OLD_VEND_KNAME(getString(4, rs));
			data.setd_OLD_ZIP_CD(getString(5, rs));
			data.setd_OLD_ADDRESS_1(getString(6, rs));
			data.setd_OLD_ADDRESS_2(getString(7, rs));
			data.setd_OLD_ADDRESS_K_1(getString(8, rs));
			data.setd_OLD_ADDRESS_K_2(getString(9, rs));
			data.setd_OLD_TEL(getString(10, rs));
			data.setd_OLD_FAX(getString(11, rs));
			data.setd_OLD_EMAIL(getString(12, rs));
			data.setd_OLD_VEND_ORG(getString(13, rs));
			data.setd_OLD_VEND_PERSON(getString(14, rs));
			data.setd_OLD_OWN_ORG_CD(getString(15, rs));
			data.setd_OLD_OWN_ORG_NAME(getString(16, rs));
			data.setd_OLD_OWN_PERSON_CD(getString(17, rs));
			data.setd_OLD_ROUND_TYP(getString(18, rs));
			data.setd_OLD_TAX_CD(getString(19, rs));
			data.setd_OLD_TAX_APPLY_TYP(getString(20, rs));
			data.setd_OLD_TAX_CALC_TYP(getString(21, rs));
			data.setd_OLD_INSPC_ACPT_APP_TYP(getString(22, rs));
			data.setd_OLD_VEND_REM(getString(23, rs));
			data.setd_OLD_CUR_CD(getString(24, rs));
			data.setd_OLD_EXCH_TYP(getString(25, rs));
			data.setd_OLD_IMPORT_TRN_TYP(getString(26, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CUST_STL_CTRL extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.BILL_ADDRESSEE_CD, "
				+ "  A.STL_COND_CD, " + "  A.CLAIM_ORG_CD, "
				+ "  A.EDI_TRN_BILL_TYP, " + "  A.EDI_TRN_RM_TYP, "
				+ "  A.BILL_BALANCE_CTRL_FLG, " + "  A.AR_BALANCE_CTRL_FLG, "
				+ "  A.COLLECTION_STD_AMOUNT, " + "  A.RM_OFFSET_TYP "
				+ "FROM " + "  M_CUST_STL_CTRL A " + "WHERE "
				+ "  A.COMPANY_CD = ? " + "  AND A.BILL_ADDRESSEE_CD = ? "
				+ "  AND A.STL_COND_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_CUST_STL_CTRL", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getBILL_ADDRESSEE_CD());
				if (isNull(data.getBILL_ADDRESSEE_CD()))
					isNull = true;
				ary.addElement(data.getSTL_COND_CD());
				if (isNull(data.getSTL_COND_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getBILL_ADDRESSEE_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getSTL_COND_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_BILL_ADDRESSEE_CD(getString(1, rs));
			data.setd_OLD_STL_COND_CD(getString(2, rs));
			data.setd_OLD_CLAIM_ORG_CD(getString(3, rs));
			data.setd_OLD_EDI_TRN_BILL_TYP(getString(4, rs));
			data.setd_OLD_EDI_TRN_RM_TYP(getString(5, rs));
			data.setd_OLD_BILL_BALANCE_CTRL_FLG(getString(6, rs));
			data.setd_OLD_AR_BALANCE_CTRL_FLG(getString(7, rs));
			data.setd_OLD_COLLECTION_STD_AMOUNT(getString(8, rs));
			data.setd_OLD_RM_OFFSET_TYP(getString(9, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CLAIM_CUST_CTRL extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.BILL_ADDRESSEE_CD, "
				+ "  A.STL_COND_CD, " + "  A.CUST_CD, " + "  B.CUST_FNAME "
				+ "FROM " + "  M_CLAIM_CUST_CTRL A, " + "  M_CUST B "
				+ "WHERE " + "  A.COMPANY_CD = ? "
				+ "  AND A.BILL_ADDRESSEE_CD = ? " + "  AND A.STL_COND_CD = ? "
				+ "  AND A.CUST_CD = ? " + "  AND A.CUST_CD = B.CUST_CD(+)";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_CLAIM_CUST_CTRL",
						"read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getBILL_ADDRESSEE_CD());
				if (isNull(data.getBILL_ADDRESSEE_CD()))
					isNull = true;
				ary.addElement(data.getSTL_COND_CD());
				if (isNull(data.getSTL_COND_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getBILL_ADDRESSEE_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getSTL_COND_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_BILL_ADDRESSEE_CD(getString(1, rs));
			data.setd_OLD_STL_COND_CD(getString(2, rs));
			data.setd_OLD_LINE_CUST_CD(getString(3, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CUST extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.CUST_CD, "
				+ "  A.CUST_FNAME, " + "  A.CUST_NAME, " + "  A.CUST_ANAME, "
				+ "  A.CUST_KNAME, " + "  A.CUST_ENAME, "
				+ "  A.OWNER_EXECUTIVE, " + "  A.OWNER_NAME, "
				+ "  A.OWN_ORG_CD, " + "  A.OWN_PERSON_CD, " + "  A.CUR_CD, "
				+ "  A.INSPC_ACPT_TYP, " + "  A.EXCH_TYP, " + "  A.TAX_CD, "
				+ "  A.TAX_CALC_TYP, " + "  A.TAX_APPLY_TYP, "
				+ "  A.EDI_CUST_VEND_CD, " + "  A.DETAIL_ROUND_TYP, "
				+ "  A.PARTIAL_SHIP_INST_FLG " + "FROM " + "  M_CUST A "
				+ "WHERE " + "  A.COMPANY_CD = ? " + "  AND A.CUST_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_CUST", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_CUST_CD(getString(1, rs));
			data.setd_OLD_CUST_FNAME(getString(2, rs));
			data.setd_OLD_CUST_NAME(getString(3, rs));
			data.setd_OLD_CUST_ANAME(getString(4, rs));
			data.setd_OLD_CUST_KNAME(getString(5, rs));
			data.setd_OLD_CUST_ENAME(getString(6, rs));
			data.setd_OLD_OWNER_EXECUTIVE(getString(7, rs));
			data.setd_OLD_OWNER_NAME(getString(8, rs));
			data.setd_OLD_OWN_ORG_CD(getString(9, rs));
			data.setd_OLD_OWN_PERSON_CD(getString(10, rs));
			data.setd_OLD_CUR_CD(getString(11, rs));
			data.setd_OLD_INSPC_ACPT_TYP(getString(12, rs));
			data.setd_OLD_EXCH_TYP(getString(13, rs));
			data.setd_OLD_TAX_CD(getString(14, rs));
			data.setd_OLD_TAX_CALC_TYP(getString(15, rs));
			data.setd_OLD_TAX_APPLY_TYP(getString(16, rs));
			data.setd_OLD_EDI_CUST_VEND_CD(getString(17, rs));
			data.setd_OLD_DETAIL_ROUND_TYP(getString(18, rs));
			data.setd_OLD_PARTIAL_SHIP_INST_FLG(getString(19, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CUST_JF extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.CUST_CD, "
				+ "  A.CUST_FNAME, " + "  A.CUST_NAME, " + "  A.CUST_ANAME, "
				+ "  A.CUST_KNAME, " + "  A.CUST_ENAME, "
				+ "  A.OWNER_EXECUTIVE, " + "  A.OWNER_NAME, "
				+ "  A.OWN_ORG_CD, " + "  A.OWN_PERSON_CD, " + "  A.CUR_CD, "
				+ "  A.INSPC_ACPT_TYP, " + "  A.EXCH_TYP, " + "  A.TAX_CD, "
				+ "  A.TAX_CALC_TYP, " + "  A.TAX_APPLY_TYP, "
				+ "  A.EDI_CUST_VEND_CD, " + "  A.DETAIL_ROUND_TYP, "				
				+ "  A.PARTIAL_SHIP_INST_FLG, " 				
				+ "  A.BILL_ADDRESSEE_FLG, " + "  A.RM_FLG, "
				+ "  A.CLAIM_CYCLE_TYP, " + "  A.TEMP_UNIT_PRICE_SALES_FLG, "
				+ "  A.RM_INP_TYP, " + "  A.TRN_STOP_FLG, "				
				+ "  A.CUST_GRP_CD, " + "  A.CUST_DLV_LOC_CD, "
				+ "  A.CUST_FLG, " + "  A.DELIVERY_FLG, "
				+ "  A.BALA_ACCO_FLG, " + "  A.UNIT_COST_USE_TYP "
				+ "FROM " + "  M_CUST A "
				+ "WHERE " + "  A.COMPANY_CD = ? " + "  AND A.CUST_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_CUST", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_CUST_CD(getString(1, rs));
			data.setd_OLD_CUST_FNAME(getString(2, rs));
			data.setd_OLD_CUST_NAME(getString(3, rs));
			data.setd_OLD_CUST_ANAME(getString(4, rs));
			data.setd_OLD_CUST_KNAME(getString(5, rs));
			data.setd_OLD_CUST_ENAME(getString(6, rs));
			data.setd_OLD_OWNER_EXECUTIVE(getString(7, rs));
			data.setd_OLD_OWNER_NAME(getString(8, rs));
			data.setd_OLD_OWN_ORG_CD(getString(9, rs));
			data.setd_OLD_OWN_PERSON_CD(getString(10, rs));
			data.setd_OLD_CUR_CD(getString(11, rs));
			data.setd_OLD_INSPC_ACPT_TYP(getString(12, rs));
			data.setd_OLD_EXCH_TYP(getString(13, rs));
			data.setd_OLD_TAX_CD(getString(14, rs));
			data.setd_OLD_TAX_CALC_TYP(getString(15, rs));
			data.setd_OLD_TAX_APPLY_TYP(getString(16, rs));
			data.setd_OLD_EDI_CUST_VEND_CD(getString(17, rs));
			data.setd_OLD_DETAIL_ROUND_TYP(getString(18, rs));
			data.setd_OLD_PARTIAL_SHIP_INST_FLG(getString(19, rs));
			data.setd_OLD_BILL_ADDRESSEE_FLG(getString(20, rs));
			data.setd_OLD_RM_FLG(getString(21, rs));
			data.setd_OLD_CLAIM_CYCLE_TYP(getString(22, rs));
			data.setd_OLD_TEMP_UNIT_PRICE_SALES_FLG(getString(23, rs));
			data.setd_OLD_RM_INP_TYP(getString(24, rs));
			data.setd_OLD_TRN_STOP_FLG(getString(25, rs));			
			data.setd_OLD_CUST_GRP_CD(getString(26, rs));
			data.setd_OLD_CUST_DLV_LOC_CD(getString(27, rs));
			data.setd_OLD_CUST_FLG(getString(28, rs));
			data.setd_OLD_DELIVERY_FLG(getString(29, rs));
			data.setd_OLD_BALA_ACCO_FLG(getString(30, rs));
			data.setd_OLD_UNIT_COST_USE_TYP(getString(31, rs));
			return data;
		}
	}
	
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_EXCH_RATE extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.CUR_CD, "
				+ "  A.EXCH_TYP, " + "  A.EXCH_RESERVE_CD, "
				+ "  TO_CHAR(A.EXCH_START_DATE,'YYYY/MM/DD'), "
				+ "  A.EXCH_RATE " + "FROM " + "  M_EXCH_RATE A " + "WHERE "
				+ "  A.COMPANY_CD = ? " + "  AND A.CUR_CD = ? "
				+ "  AND A.EXCH_TYP = ? "
				+ "	AND (A.EXCH_TYP !=2 OR A.EXCH_RESERVE_CD = ? )"
				+ "  AND A.EXCH_START_DATE = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_EXCH_RATE", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUR_CD());
				if (isNull(data.getCUR_CD()))
					isNull = true;
				ary.addElement(data.getEXCH_TYP());
				if (isNull(data.getEXCH_TYP()))
					isNull = true;
				ary.addElement(data.getEXCH_RESERVE_CD());
				if (isNull(data.getEXCH_RESERVE_CD()))
					isNull = true;
				ary.addElement(data.getEXCH_START_DATE());
				if (isNull(data.getEXCH_START_DATE()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUR_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEXCH_TYP(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEXCH_RESERVE_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEXCH_START_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_CUR_CD(getString(1, rs));
			data.setd_OLD_EXCH_TYP(getString(2, rs));
			data.setd_OLD_EXCH_RESERVE_CD(getString(3, rs));
			data.setd_OLD_EXCH_START_DATE(getString(4, rs));
			data.setd_OLD_EXCH_RATE(getString(5, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_COMPANY extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.COMPANY_CD, "
				+ "  A.COMPANY_FNAME, " + "  A.COMPANY_NAME, "
				+ "  A.COMPANY_KNAME, " + "  A.COMPANY_ENAME, "
				+ "  A.ZIP_CD, " + "  A.ADDRESS_1, " + "  A.ADDRESS_2, "
				+ "  A.ADDRESS_K_1, " + "  A.ADDRESS_K_2, " + "  A.TEL, "
				+ "  A.FAX " + "FROM " + "  M_COMPANY A " + "WHERE "
				+ "  A.COMPANY_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_COMPANY", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_COMPANY_CD(getString(1, rs));
			data.setd_OLD_COMPANY_FNAME(getString(2, rs));
			data.setd_OLD_COMPANY_NAME(getString(3, rs));
			data.setd_OLD_COMPANY_KNAME(getString(4, rs));
			data.setd_OLD_COMPANY_ENAME(getString(5, rs));
			data.setd_OLD_ZIP_CD(getString(6, rs));
			data.setd_OLD_ADDRESS_1(getString(7, rs));
			data.setd_OLD_ADDRESS_2(getString(8, rs));
			data.setd_OLD_ADDRESS_K_1(getString(9, rs));
			data.setd_OLD_ADDRESS_K_2(getString(10, rs));
			data.setd_OLD_TEL(getString(11, rs));
			data.setd_OLD_FAX(getString(12, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_USER_COMPANY extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.USER_CD, "
				+ "  A.COMPANY_CD, " + "  A.USER_TYP " + "FROM "
				+ "  M_USER_COMPANY A " + "WHERE " + "  A.USER_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_USER_COMPANY", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getUSER_CD());
				if (isNull(data.getUSER_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getUSER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_USER_CD(getString(1, rs));
			data.setd_OLD_COMPANY_CD(getString(2, rs));
			data.setd_OLD_USER_TYP(getString(3, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_BANK_H extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.BANK_CD, "
				+ "  A.BANK_NAME, " + "  A.BANK_ANAME, " + "  A.BANK_KNAME, "
				+ "  A.BANK_ENAME, " + "  A.BANK_FB_NAME " + "FROM "
				+ "  M_BANK_H A " + "WHERE " + "  A.BANK_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_BANK_H", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getBANK_CD());
				if (isNull(data.getBANK_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getBANK_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_BANK_CD(getString(1, rs));
			data.setd_OLD_BANK_NAME(getString(2, rs));
			data.setd_OLD_BANK_ANAME(getString(3, rs));
			data.setd_OLD_BANK_KNAME(getString(4, rs));
			data.setd_OLD_BANK_ENAME(getString(5, rs));
			data.setd_OLD_BANK_FB_NAME(getString(6, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_B_ACCT extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.B_ACCT_CTRL_CD, "
				+ "  A.B_ACCT_MNG_NAME, " + "  A.BANK_CD, "
				+ "  A.BANK_BR_CD, " + "  A.B_ACCT_TYP_CD, "
				+ "  A.B_ACCT_NO, " + "  A.B_ACCT_NAME, " + "  A.FB_DATA_TYP, "
				+ "  A.TRF_REQUEST_CD, " + "  A.B_ACCT_FB_NAME " + "FROM "
				+ "  M_B_ACCT A " + "WHERE " + "  A.COMPANY_CD = ? "
				+ "  AND A.B_ACCT_CTRL_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_B_ACCT", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getB_ACCT_CTRL_CD());
				if (isNull(data.getB_ACCT_CTRL_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getB_ACCT_CTRL_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_B_ACCT_CTRL_CD(getString(1, rs));
			data.setd_OLD_B_ACCT_MNG_NAME(getString(2, rs));
			data.setd_OLD_BANK_CD(getString(3, rs));
			data.setd_OLD_BANK_BR_CD(getString(4, rs));
			data.setd_OLD_B_ACCT_TYP_CD(getString(5, rs));
			data.setd_OLD_B_ACCT_NO(getString(6, rs));
			data.setd_OLD_B_ACCT_NAME(getString(7, rs));
			data.setd_OLD_FB_DATA_TYP(getString(8, rs));
			data.setd_OLD_TRF_REQUEST_CD(getString(9, rs));
			data.setd_OLD_B_ACCT_FB_NAME(getString(10, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_REVAL_EXCH_RATE extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.CUR_CD, "
				+ "  A.EXCH_TYP, " + "  A.EXCH_RESERVE_CD, "
				+ "  TO_CHAR(A.EXCH_START_DATE,'YYYY/MM/DD'), "
				+ "  A.EXCH_RATE " + "FROM " + "  M_REVAL_EXCH_RATE A "
				+ "WHERE " + "  A.COMPANY_CD = ? " + "  AND A.CUR_CD = ? "
				+ "  AND A.EXCH_TYP = ? "
				+ "	AND (A.EXCH_TYP != 2 OR A.EXCH_RESERVE_CD = ?) "
				+ "  AND A.EXCH_START_DATE = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_REVAL_EXCH_RATE",
						"read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUR_CD());
				if (isNull(data.getCUR_CD()))
					isNull = true;
				ary.addElement(data.getEXCH_TYP());
				if (isNull(data.getEXCH_TYP()))
					isNull = true;
				ary.addElement(data.getEXCH_RESERVE_CD());
				if (isNull(data.getEXCH_RESERVE_CD()))
					isNull = true;
				ary.addElement(data.getEXCH_START_DATE());
				if (isNull(data.getEXCH_START_DATE()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUR_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEXCH_TYP(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEXCH_RESERVE_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEXCH_START_DATE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_CUR_CD(getString(1, rs));
			data.setd_OLD_EXCH_TYP(getString(2, rs));
			data.setd_OLD_EXCH_RESERVE_CD(getString(3, rs));
			data.setd_OLD_EXCH_START_DATE(getString(4, rs));
			data.setd_OLD_EXCH_RATE(getString(5, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_ACCT extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.ACCT_CD, "
				+ "  A.SUB_ACCT_CD, " + "  A.ACCT_NAME, " + "  A.ACCT_ANAME, "
				+ "  A.ACCT_KNAME, " + "  A.PRIMITIVE_TYP, "
				+ "  A.DR_CR_TYP, " + "  A.ACCT_TYP, "
				+ "  A.SUB_ACCT_TYP_DEFAULT, " + "  A.INTERNAL_TRN_TYP "
				+ "FROM " + "  M_ACCT A " + "WHERE " + "  A.COMPANY_CD = ? "
				+ "  AND A.ACCT_CD = ? " + "  AND A.SUB_ACCT_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_ACCT", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getACCT_CD());
				if (isNull(data.getACCT_CD()))
					isNull = true;
				ary.addElement(data.getSUB_ACCT_CD());
				if (isNull(data.getSUB_ACCT_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getACCT_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getSUB_ACCT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_ACCT_CD(getString(1, rs));
			data.setd_OLD_SUB_ACCT_CD(getString(2, rs));
			data.setd_OLD_ACCT_NAME(getString(3, rs));
			data.setd_OLD_ACCT_ANAME(getString(4, rs));
			data.setd_OLD_ACCT_KNAME(getString(5, rs));
			data.setd_OLD_PRIMITIVE_TYP(getString(6, rs));
			data.setd_OLD_DR_CR_TYP(getString(7, rs));
			data.setd_OLD_ACCT_TYP(getString(8, rs));
			data.setd_OLD_SUB_ACCT_TYP_DEFAULT(getString(9, rs));
			data.setd_OLD_INTERNAL_TRN_TYP(getString(10, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_BANK_FEE extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.BANK_CD, "
				+ "  A.TRF_TYP, " + "  A.CONTENTS_TYP, " + "  A.INFO_TYP, "
				+ "  TO_CHAR(A.VALID_START_DATE,'YYYY/MM/DD'), "
				+ "  A.MIN_AMOUNT, "
				+ "  TO_CHAR(A.VALID_END_DATE,'YYYY/MM/DD'), "
				+ "  A.MAX_AMOUNT, " + "  A.TRF_FEE, " + "  A.TAX_CD "
				+ "FROM " + "  M_BANK_FEE A " + "WHERE " + "  A.BANK_CD = ? "
				+ "  AND A.TRF_TYP = ? " + "  AND A.FB_FLG = ? "
				+ "  AND A.CONTENTS_TYP = ? " + "  AND A.INFO_TYP = ? "
				+ "  AND A.VALID_START_DATE = ? " + "  AND A.MIN_AMOUNT = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_BANK_FEE", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getBANK_CD());
				if (isNull(data.getBANK_CD()))
					isNull = true;
				ary.addElement(data.getTRF_TYP());
				if (isNull(data.getTRF_TYP()))
					isNull = true;
				ary.addElement(data.getFB_FLG());
				if (isNull(data.getFB_FLG()))
					isNull = true;
				ary.addElement(data.getCONTENTS_TYP());
				if (isNull(data.getCONTENTS_TYP()))
					isNull = true;
				ary.addElement(data.getINFO_TYP());
				if (isNull(data.getINFO_TYP()))
					isNull = true;
				ary.addElement(data.getVALID_START_DATE());
				if (isNull(data.getVALID_START_DATE()))
					isNull = true;
				ary.addElement(data.getMIN_AMOUNT());
				if (isNull(data.getMIN_AMOUNT()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getBANK_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getTRF_TYP(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getFB_FLG(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCONTENTS_TYP(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getINFO_TYP(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getVALID_START_DATE(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getMIN_AMOUNT(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_BANK_CD(getString(1, rs));
			data.setd_OLD_TRF_TYP(getString(2, rs));
			data.setd_OLD_CONTENTS_TYP(getString(3, rs));
			data.setd_OLD_INFO_TYP(getString(4, rs));
			data.setd_OLD_VALID_START_DATE(getString(5, rs));
			data.setd_OLD_MIN_AMOUNT(getString(6, rs));
			data.setd_OLD_VALID_END_DATE(getString(7, rs));
			data.setd_OLD_MAX_AMOUNT(getString(8, rs));
			data.setd_OLD_TRF_FEE(getString(9, rs));
			data.setd_OLD_TAX_CD(getString(10, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_VEND_PAY_CTRL extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.VEND_CD, "
				+ "  A.ACCT_CD, " + "  A.SUB_ACCT_CD, "
				+ "  A.PAY_PATTERN_CD, " + "  A.ROUND_TYP " + "FROM "
				+ "  M_VEND_PAY_CTRL A " + "WHERE " + "  A.COMPANY_CD = ? "
				+ "  AND A.VEND_CD = ? " + "  AND A.ACCT_CD = ? "
				+ "  AND A.SUB_ACCT_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_VEND_PAY_CTRL", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getVEND_CD());
				if (isNull(data.getVEND_CD()))
					isNull = true;
				ary.addElement(data.getACCT_CD());
				if (isNull(data.getACCT_CD()))
					isNull = true;
				ary.addElement(data.getSUB_ACCT_CD());
				if (isNull(data.getSUB_ACCT_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getVEND_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getACCT_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getSUB_ACCT_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_VEND_CD(getString(1, rs));
			data.setd_OLD_ACCT_CD(getString(2, rs));
			data.setd_OLD_SUB_ACCT_CD(getString(3, rs));
			data.setd_OLD_PAY_PATTERN_CD(getString(4, rs));
			data.setd_OLD_ROUND_TYP(getString(5, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PAY_METHOD extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.PAY_METHOD_CD, "
				+ "  A.PAY_METHOD, " + "  A.ACCT_CD, " + "  A.SUB_ACCT_CD, "
				+ "  A.PAY_TARGET_TYP " + "FROM " + "  M_PAY_METHOD A "
				+ "WHERE " + "  A.COMPANY_CD = ? "
				+ "  AND A.PAY_METHOD_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_PAY_METHOD", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getPAY_METHOD_CD());
				if (isNull(data.getPAY_METHOD_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPAY_METHOD_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_PAY_METHOD_CD(getString(1, rs));
			data.setd_OLD_PAY_METHOD(getString(2, rs));
			data.setd_OLD_ACCT_CD(getString(3, rs));
			data.setd_OLD_SUB_ACCT_CD(getString(4, rs));
			data.setd_OLD_PAY_TARGET_TYP(getString(5, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_USER_CTRL_H extends DataObject {
		protected String m_selcmd = "SELECT " + "  A.USER_CD, "
				+ "  A.ORG_CD, " + "  A.SLIP_CTRL_ORG_CD, "
				+ "  A.CLOSING_CTRL_ORG_CD, " + "  A.PAY_CALC_CTRL_ORG_CD, "
				+ "  A.PAY_FIX_CTRL_ORG_CD " + "FROM " + "  M_USER_CTRL_H A "
				+ "WHERE " + "  A.USER_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_USER_CTRL_H", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getUSER_CD());
				if (isNull(data.getUSER_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getUSER_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_USER_CD(getString(1, rs));
			data.setd_OLD_ORG_CD(getString(2, rs));
			data.setd_OLD_SLIP_CTRL_ORG_CD(getString(3, rs));
			data.setd_OLD_CLOSING_CTRL_ORG_CD(getString(4, rs));
			data.setd_OLD_PAY_CALC_CTRL_ORG_CD(getString(5, rs));
			data.setd_OLD_PAY_FIX_CTRL_ORG_CD(getString(6, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_PAY_PATTERN extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_PAY_PATTERN.\"PAY_PATTERN_CD\" AS \"PAY_PATTERN_CD\", "
				+ "  M_PAY_PATTERN.\"PAY_ODR_TYP\" AS \"PAY_ODR_TYP\", "
				+ "  M_PAY_PATTERN.\"PAY_METHOD_CD_1\" AS \"PAY_METHOD_CD_1\", "
				+ "  M_PAY_PATTERN.\"PAY_METHOD_CD_2\" AS \"PAY_METHOD_CD_2\", "
				+ "  M_PAY_PATTERN.\"STD_AMOUNT\" AS \"STD_AMOUNT\", "
				+ "  M_PAY_PATTERN.\"RATIO_1\" AS \"RATIO_1\", "
				+ "  M_PAY_PATTERN.\"RATIO_2\" AS \"RATIO_2\", "
				+ "  M_PAY_PATTERN.\"PAY_PATTERN_NAME\" AS \"PAY_PATTERN_NAME\" "
				+ "FROM " + "  M_PAY_PATTERN " + "WHERE "
				+ "  M_PAY_PATTERN.\"COMPANY_CD\" = ? "
				+ "  AND M_PAY_PATTERN.\"PAY_PATTERN_CD\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_PAY_PATTERN", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getPAY_PATTERN_CD());
				if (isNull(data.getPAY_PATTERN_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPAY_PATTERN_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_PAY_PATTERN_CD(getString(1, rs));
			data.setd_OLD_PAY_ODR_TYP(getString(2, rs));
			data.setd_OLD_PAY_METHOD_CD_1(getString(3, rs));
			data.setd_OLD_PAY_METHOD_CD_2(getString(4, rs));
			data.setd_OLD_STD_AMOUNT(getString(5, rs));
			data.setd_OLD_RATIO_1(getString(6, rs));
			data.setd_OLD_RATIO_2(getString(7, rs));
			data.setd_OLD_PAY_PATTERN_NAME(getString(8, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_AUTO_JNL extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_AUTO_JNL.\"PATTERN_CD\" AS \"PATTERN_CD\", "
				+ "  M_AUTO_JNL.\"CLASS_1\" AS \"CLASS_1\", "
				+ "  M_AUTO_JNL.\"CLASS_2\" AS \"CLASS_2\", "
				+ "  M_AUTO_JNL.\"CLASS_3\" AS \"CLASS_3\", "
				+ "  M_AUTO_JNL.\"AUTO_JNL_NAME\" AS \"AUTO_JNL_NAME\", "
				+ "  M_AUTO_JNL.\"DR_ACCT_CD\" AS \"DR_ACCT_CD\", "
				+ "  M_AUTO_JNL.\"DR_SUB_ACCT_CD\" AS \"DR_SUB_ACCT_CD\", "
				+ "  M_AUTO_JNL.\"DR_ORG_TYP\" AS \"DR_ORG_TYP\", "
				+ "  M_AUTO_JNL.\"DR_ORG_CD\" AS \"DR_ORG_CD\", "
				+ "  M_AUTO_JNL.\"CR_ACCT_CD\" AS \"CR_ACCT_CD\", "
				+ "  M_AUTO_JNL.\"CR_SUB_ACCT_CD\" AS \"CR_SUB_ACCT_CD\", "
				+ "  M_AUTO_JNL.\"CR_ORG_TYP\" AS \"CR_ORG_TYP\", "
				+ "  M_AUTO_JNL.\"CR_ORG_CD\" AS \"CR_ORG_CD\", "
				+ "  M_AUTO_JNL.\"ACCT_JNL_PATTERN_CD\" AS \"ACCT_JNL_PATTERN_CD\", "
				+ "  M_AUTO_JNL.\"ACCT_SLIP_NUM\" AS \"ACCT_SLIP_NUM\" "
				+ "FROM " + "  M_AUTO_JNL " + "WHERE "
				+ "  M_AUTO_JNL.\"COMPANY_CD\" = ? "
				+ "  AND M_AUTO_JNL.\"PATTERN_CD\" = ? "
				+ "  AND M_AUTO_JNL.\"CLASS_1\" = ? "
				+ "  AND M_AUTO_JNL.\"CLASS_2\" = ? "
				+ "  AND M_AUTO_JNL.\"CLASS_3\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_AUTO_JNL", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getPATTERN_CD());
				if (isNull(data.getPATTERN_CD()))
					isNull = true;
				ary.addElement(data.getCLASS_1());
				if (isNull(data.getCLASS_1()))
					isNull = true;
				ary.addElement(data.getCLASS_2());
				if (isNull(data.getCLASS_2()))
					isNull = true;
				ary.addElement(data.getCLASS_3());
				if (isNull(data.getCLASS_3()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPATTERN_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCLASS_1(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCLASS_2(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCLASS_3(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_PATTERN_CD(getString(1, rs));
			data.setd_OLD_CLASS_1(getString(2, rs));
			data.setd_OLD_CLASS_2(getString(3, rs));
			data.setd_OLD_CLASS_3(getString(4, rs));
			data.setd_OLD_AUTO_JNL_NAME(getString(5, rs));
			data.setd_OLD_DR_ACCT_CD(getString(6, rs));
			data.setd_OLD_DR_SUB_ACCT_CD(getString(7, rs));
			data.setd_OLD_DR_ORG_TYP(getString(8, rs));
			data.setd_OLD_DR_ORG_CD(getString(9, rs));
			data.setd_OLD_CR_ACCT_CD(getString(10, rs));
			data.setd_OLD_CR_SUB_ACCT_CD(getString(11, rs));
			data.setd_OLD_CR_ORG_TYP(getString(12, rs));
			data.setd_OLD_CR_ORG_CD(getString(13, rs));
			data.setd_OLD_ACCT_JNL_PATTERN_CD(getString(14, rs));
			data.setd_OLD_ACCT_SLIP_NUM(getString(15, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CUST_BASE extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_CUST_BASE.\"CUST_CD\" AS \"CUST_CD\", "
				+ "  M_CUST_BASE.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
				+ "  M_CUST_BASE.\"DLV_LOC_NAME\" AS \"DLV_LOC_NAME\", "
				+ "  M_CUST_BASE.\"DLV_LOC_KNAME\" AS \"DLV_LOC_KNAME\", "
				+ "  M_CUST_BASE.\"DLV_LOC_ENAME\" AS \"DLV_LOC_ENAME\", "
				+ "  M_CUST_BASE.\"ZIP_CD\" AS \"ZIP_CD\", "
				+ "  M_CUST_BASE.\"ADDRESS_1\" AS \"ADDRESS_1\", "
				+ "  M_CUST_BASE.\"ADDRESS_2\" AS \"ADDRESS_2\", "
				+ "  M_CUST_BASE.\"ADDRESS_K_1\" AS \"ADDRESS_K_1\", "
				+ "  M_CUST_BASE.\"ADDRESS_K_2\" AS \"ADDRESS_K_2\", "
				+ "  M_CUST_BASE.\"TEL\" AS \"TEL\", "
				+ "  M_CUST_BASE.\"FAX\" AS \"FAX\", "
				+ "  M_CUST_BASE.\"SHIP_WH_CD\" AS \"SHIP_WH_CD\", "
				+ "  M_CUST_BASE.\"DEPO_WH_CD\" AS \"DEPO_WH_CD\", "
				+ "  M_CUST_BASE.\"TRANSPORT_CD\" AS \"TRANSPORT_CD\", "
				+ "  M_CUST_BASE.\"TRANSPORT_LT\" AS \"TRANSPORT_LT\", "
				+ "  M_CUST_BASE.\"BUSINESS_WH_FLG\" AS \"BUSINESS_WH_FLG\", "
				+ "  M_CUST_BASE.\"REPRESENT_FLG\" AS \"REPRESENT_FLG\" "
				+ "FROM " + "  M_CUST_BASE " + "WHERE "
				+ "  M_CUST_BASE.\"COMPANY_CD\" = ? "
				+ "  AND M_CUST_BASE.\"CUST_CD\" = ? "
				+ "  AND M_CUST_BASE.\"DLV_LOC_CD\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:selectM_CUST_BASE_read
			if (m_selcmd == null)
				throw new FoundationException("selectM_CUST_BASE", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:selectM_CUST_BASE_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;
				ary.addElement(data.getDLV_LOC_CD());
				if (isNull(data.getDLV_LOC_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getDLV_LOC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_CUST_CD(getString(1, rs));
			data.setd_OLD_DLV_LOC_CD(getString(2, rs));
			data.setd_OLD_DLV_LOC_NAME(getString(3, rs));
			data.setd_OLD_DLV_LOC_KNAME(getString(4, rs));
			data.setd_OLD_DLV_LOC_ENAME(getString(5, rs));
			data.setd_OLD_ZIP_CD(getString(6, rs));
			data.setd_OLD_ADDRESS_1(getString(7, rs));
			data.setd_OLD_ADDRESS_2(getString(8, rs));
			data.setd_OLD_ADDRESS_K_1(getString(9, rs));
			data.setd_OLD_ADDRESS_K_2(getString(10, rs));
			data.setd_OLD_TEL(getString(11, rs));
			data.setd_OLD_FAX(getString(12, rs));
			data.setd_OLD_SHIP_WH_CD(getString(13, rs));
			data.setd_OLD_DEPO_WH_CD(getString(14, rs));
			data.setd_OLD_TRANSPORT_CD(getString(15, rs));
			data.setd_OLD_TRANSPORT_LT(getString(16, rs));
			data.setd_OLD_BUSINESS_WH_FLG(getString(17, rs));
			data.setd_OLD_REPRESENT_FLG(getString(18, rs));
			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_BANK extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_BANK.\"BANK_CD\" AS \"BANK_CD\", "
				+ "  M_BANK.\"BANK_BR_CD\" AS \"BANK_BR_CD\", "
				+ "  M_BANK.\"CAL_NO\" AS \"CAL_NO\", "
				+ "  M_BANK.\"BANK_BR_NAME\" AS \"BANK_BR_NAME\", "
				+ "  M_BANK.\"BANK_BR_ANAME\" AS \"BANK_BR_ANAME\", "
				+ "  M_BANK.\"BANK_BR_KNAME\" AS \"BANK_BR_KNAME\", "
				+ "  M_BANK.\"BANK_BR_ENAME\" AS \"BANK_BR_ENAME\", "
				+ "  M_BANK.\"BANK_BR_FB_NAME\" AS \"BANK_BR_FB_NAME\", "
				+ "  M_BANK.\"BANK_BR_CNAME\" AS \"BANK_BR_CNAME\", "
				+ "  M_BANK.\"BANK_BR_ECNAME\" AS \"BANK_BR_ECNAME\", "
				+ "  M_BANK.\"ZIP_CD\" AS \"ZIP_CD\", "
				+ "  M_BANK.\"ADDRESS_1\" AS \"ADDRESS_1\", "
				+ "  M_BANK.\"ADDRESS_2\" AS \"ADDRESS_2\", "
				+ "  M_BANK.\"ADDRESS_K_1\" AS \"ADDRESS_K_1\", "
				+ "  M_BANK.\"ADDRESS_K_2\" AS \"ADDRESS_K_2\", "
				+ "  M_BANK.\"TEL\" AS \"TEL\", "
				+ "  M_BANK.\"FAX\" AS \"FAX\" " + "FROM " + "  M_BANK "
				+ "WHERE " + "  M_BANK.\"BANK_CD\" = ? "
				+ "  AND M_BANK.\"BANK_BR_CD\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:selectM_BANK_read
			if (m_selcmd == null)
				throw new FoundationException("selectM_BANK", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:selectM_BANK_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getBANK_CD());
				if (isNull(data.getBANK_CD()))
					isNull = true;
				ary.addElement(data.getBANK_BR_CD());
				if (isNull(data.getBANK_BR_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getBANK_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getBANK_BR_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_BANK_CD(getString(1, rs));
			data.setd_OLD_BANK_BR_CD(getString(2, rs));
			data.setd_OLD_CAL_NO(getString(3, rs));
			data.setd_OLD_BANK_BR_NAME(getString(4, rs));
			data.setd_OLD_BANK_BR_ANAME(getString(5, rs));
			data.setd_OLD_BANK_BR_KNAME(getString(6, rs));
			data.setd_OLD_BANK_BR_ENAME(getString(7, rs));
			data.setd_OLD_BANK_BR_FB_NAME(getString(8, rs));
			data.setd_OLD_BANK_BR_CNAME(getString(9, rs));
			data.setd_OLD_BANK_BR_ECNAME(getString(10, rs));
			data.setd_OLD_ZIP_CD(getString(11, rs));
			data.setd_OLD_ADDRESS_1(getString(12, rs));
			data.setd_OLD_ADDRESS_2(getString(13, rs));
			data.setd_OLD_ADDRESS_K_1(getString(14, rs));
			data.setd_OLD_ADDRESS_K_2(getString(15, rs));
			data.setd_OLD_TEL(getString(16, rs));
			data.setd_OLD_FAX(getString(17, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CUST_BRANCH extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_CUST_BRANCH.\"CUST_CD\" AS \"CUST_CD\", "
				+ "  M_CUST_BRANCH.\"BRANCH_CD\" AS \"BRANCH_CD\", "
				+ "  M_CUST_BRANCH.\"BRANCH_FNAME\" AS \"BRANCH_FNAME\", "
				+ "  M_CUST_BRANCH.\"BRANCH_NAME\" AS \"BRANCH_NAME\", "
				+ "  M_CUST_BRANCH.\"BRANCH_KNAME\" AS \"BRANCH_KNAME\", "
				+ "  M_CUST_BRANCH.\"BRANCH_ENAME\" AS \"BRANCH_ENAME\", "
				+ "  M_CUST_BRANCH.\"BRANCH_SEQ_CD\" AS \"BRANCH_SEQ_CD\", "
				+ "  M_CUST_BRANCH.\"CHARGE_ORG_NAME\" AS \"CHARGE_ORG_NAME\", "
				+ "  M_CUST_BRANCH.\"CHARGE_PERSON_NAME\" AS \"CHARGE_PERSON_NAME\", "
				+ "  M_CUST_BRANCH.\"ZIP_CD\" AS \"ZIP_CD\", "
				+ "  M_CUST_BRANCH.\"ADDRESS_1\" AS \"ADDRESS_1\", "
				+ "  M_CUST_BRANCH.\"ADDRESS_2\" AS \"ADDRESS_2\", "
				+ "  M_CUST_BRANCH.\"ADDRESS_K_1\" AS \"ADDRESS_K_1\", "
				+ "  M_CUST_BRANCH.\"ADDRESS_K_2\" AS \"ADDRESS_K_2\", "
				+ "  M_CUST_BRANCH.\"TEL\" AS \"TEL\", "
				+ "  M_CUST_BRANCH.\"FAX\" AS \"FAX\", "
				+ "  M_CUST_BRANCH.\"OWN_ORG_CD\" AS \"OWN_ORG_CD\", "
				+ "  M_CUST_BRANCH.\"OWN_PERSON_CD\" AS \"OWN_PERSON_CD\", "
				+ "  M_CUST_BRANCH.\"EDI_CUST_VEND_CD\" AS \"EDI_CUST_VEND_CD\", "
				+ "  M_CUST_BRANCH.\"EDI_OWN_VEND_CD\" AS \"EDI_OWN_VEND_CD\", "
				+ "  M_CUST_BRANCH.\"REMARKS_1\" AS \"REMARKS_1\", "
				+ "  M_CUST_BRANCH.\"REMARKS_2\" AS \"REMARKS_2\", "
				+ "  M_CUST_BRANCH.\"REMARKS_3\" AS \"REMARKS_3\" " + "FROM "
				+ "  M_CUST_BRANCH " + "WHERE "
				+ "  M_CUST_BRANCH.\"COMPANY_CD\" = ? "
				+ "  AND M_CUST_BRANCH.\"CUST_CD\" = ? "
				+ "  AND M_CUST_BRANCH.\"BRANCH_CD\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:selectM_CUST_BRANCH_read
			if (m_selcmd == null)
				throw new FoundationException("selectM_CUST_BRANCH", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:selectM_CUST_BRANCH_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;
				ary.addElement(data.getBRANCH_CD());
				if (isNull(data.getBRANCH_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getBRANCH_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_CUST_CD(getString(1, rs));
			data.setd_OLD_BRANCH_CD(getString(2, rs));
			data.setd_OLD_BRANCH_FNAME(getString(3, rs));
			data.setd_OLD_BRANCH_NAME(getString(4, rs));
			data.setd_OLD_BRANCH_KNAME(getString(5, rs));
			data.setd_OLD_BRANCH_ENAME(getString(6, rs));
			data.setd_OLD_BRANCH_SEQ_CD(getString(7, rs));
			data.setd_OLD_CHARGE_ORG_NAME(getString(8, rs));
			data.setd_OLD_CHARGE_PERSON_NAME(getString(9, rs));
			data.setd_OLD_ZIP_CD(getString(10, rs));
			data.setd_OLD_ADDRESS_1(getString(11, rs));
			data.setd_OLD_ADDRESS_2(getString(12, rs));
			data.setd_OLD_ADDRESS_K_1(getString(13, rs));
			data.setd_OLD_ADDRESS_K_2(getString(14, rs));
			data.setd_OLD_TEL(getString(15, rs));
			data.setd_OLD_FAX(getString(16, rs));
			data.setd_OLD_OWN_ORG_CD(getString(17, rs));
			data.setd_OLD_OWN_PERSON_CD(getString(18, rs));
			data.setd_OLD_EDI_CUST_VEND_CD(getString(19, rs));
			data.setd_OLD_EDI_OWN_VEND_CD(getString(20, rs));
			data.setd_OLD_REMARKS_1(getString(21, rs));
			data.setd_OLD_REMARKS_2(getString(22, rs));
			data.setd_OLD_REMARKS_3(getString(23, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_SALES_UNIT_COST extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_SALES_UNIT_COST.\"CUST_CD\" AS \"CUST_CD\", "
				+ "  M_SALES_UNIT_COST.\"ITEM_CD\" AS \"ITEM_CD\", "
				+ "  M_SALES_UNIT_COST.\"PURPOSE_UNIT_PRICE_TYP\" AS \"PURPOSE_UNIT_PRICE_TYP\", "
				+ "  TO_CHAR(M_SALES_UNIT_COST.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS \"EFF_PHASE_IN_DATE\", "
				+ "  M_SALES_UNIT_COST.\"SALES_UNIT_SIZE\" AS \"SALES_UNIT_SIZE\", "
				+ "  M_SALES_UNIT_COST.\"SALES_UNIT_COST\" AS \"SALES_UNIT_COST\", "
				+ "  M_SALES_UNIT_COST.\"UNIT_COST_TYP\" AS \"UNIT_COST_TYP\" "
				+ "FROM " + "  M_SALES_UNIT_COST " + "WHERE "
				+ "  M_SALES_UNIT_COST.\"COMPANY_CD\" = ? "
				+ "  AND M_SALES_UNIT_COST.\"CUST_CD\" = ? "
				+ "  AND M_SALES_UNIT_COST.\"ITEM_CD\" = ? "
				+ "  AND M_SALES_UNIT_COST.\"PURPOSE_UNIT_PRICE_TYP\" = ? "
				+ "  AND M_SALES_UNIT_COST.\"EFF_PHASE_IN_DATE\" = ? "
				+ "  AND M_SALES_UNIT_COST.\"SALES_UNIT_SIZE\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:selectM_SALES_UNIT_COST_read
			if (m_selcmd == null)
				throw new FoundationException("selectM_SALES_UNIT_COST",
						"read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:selectM_SALES_UNIT_COST_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;
				ary.addElement(data.getITEM_CD());
				if (isNull(data.getITEM_CD()))
					isNull = true;
				ary.addElement(data.getPURPOSE_UNIT_PRICE_TYP());
				if (isNull(data.getPURPOSE_UNIT_PRICE_TYP()))
					isNull = true;
				ary.addElement(data.getEFF_PHASE_IN_DATE());
				if (isNull(data.getEFF_PHASE_IN_DATE()))
					isNull = true;
				ary.addElement(data.getSALES_UNIT_SIZE());
				if (isNull(data.getSALES_UNIT_SIZE()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getPURPOSE_UNIT_PRICE_TYP(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getEFF_PHASE_IN_DATE(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getSALES_UNIT_SIZE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_CUST_CD(getString(1, rs));
			data.setd_OLD_ITEM_CD(getString(2, rs));
			data.setd_OLD_PURPOSE_UNIT_PRICE_TYP(getString(3, rs));
			data.setd_OLD_EFF_PHASE_IN_DATE(getString(4, rs));
			data.setd_OLD_SALES_UNIT_SIZE(getString(5, rs));
			data.setd_OLD_SALES_UNIT_COST(getString(6, rs));
			data.setd_OLD_UNIT_COST_TYP(getString(7, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CUSTJa extends DataObject {
		protected String m_selcmd = "SELECT " + "  M_CUST.CUST_CD, "
				+ "  M_CUST.CUST_NAME, " + "  M_CUST.CUST_ANAME, "
				+ "  M_CUST.CUST_KNAME, " + "  M_CUST.OWN_ORG_CD, "
				+ "  M_CUST.OWN_PERSON_CD, " + "  M_CUST.CUR_CD, "
				+ "  M_CUST.INSPC_ACPT_TYP, " + "  M_CUST.EXCH_TYP, "
				+ "  M_CUST.TAX_CD, " + "  M_CUST.TAX_CALC_TYP, "
				+ "  M_CUST.TAX_APPLY_TYP, " + "  M_CUST.DETAIL_ROUND_TYP, "
				+ "  M_CUST.CUST_GRP_CD " + "FROM " + "  M_CUST " + "WHERE "
				+ "  M_CUST.COMPANY_CD = ? " + "  AND M_CUST.CUST_CD = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:selectM_CUSTJa_read
			if (m_selcmd == null)
				throw new FoundationException("selectM_CUSTJa", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:selectM_CUSTJa_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_CUST_CD(getString(1, rs));
			data.setd_OLD_CUST_NAME(getString(2, rs));
			data.setd_OLD_CUST_ANAME(getString(3, rs));
			data.setd_OLD_CUST_KNAME(getString(4, rs));
			data.setd_OLD_OWN_ORG_CD(getString(5, rs));
			data.setd_OLD_OWN_PERSON_CD(getString(6, rs));
			data.setd_OLD_CUR_CD(getString(7, rs));
			data.setd_OLD_INSPC_ACPT_TYP(getString(8, rs));
			data.setd_OLD_EXCH_TYP(getString(9, rs));
			data.setd_OLD_TAX_CD(getString(10, rs));
			data.setd_OLD_TAX_CALC_TYP(getString(11, rs));
			data.setd_OLD_TAX_APPLY_TYP(getString(12, rs));
			data.setd_OLD_DETAIL_ROUND_TYP(getString(13, rs));
			data.setd_OLD_CUST_GRP_CD(getString(14, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_DLV_LOC extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_DLV_LOC.\"CUST_CD\" AS \"CUST_CD\", "
				+ "  M_DLV_LOC.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
				+ "  M_DLV_LOC.\"DLV_LOC_NAME\" AS \"DLV_LOC_NAME\", "
				+ "  M_DLV_LOC.\"DLV_LOC_KNAME\" AS \"DLV_LOC_KNAME\", "
				+ "  M_DLV_LOC.\"DLV_LOC_ENAME\" AS \"DLV_LOC_ENAME\", "
				+ "  M_DLV_LOC.\"ZIP_CD\" AS \"ZIP_CD\", "
				+ "  M_DLV_LOC.\"ADDRESS_1\" AS \"ADDRESS_1\", "
				+ "  M_DLV_LOC.\"ADDRESS_2\" AS \"ADDRESS_2\", "
				+ "  M_DLV_LOC.\"ADDRESS_K_1\" AS \"ADDRESS_K_1\", "
				+ "  M_DLV_LOC.\"ADDRESS_K_2\" AS \"ADDRESS_K_2\", "
				+ "  M_DLV_LOC.\"TEL\" AS \"TEL\", "
				+ "  M_DLV_LOC.\"FAX\" AS \"FAX\", "
				+ "  M_DLV_LOC.\"CNCNTRT_DLV_LOC_CD\" AS \"CNCNTRT_DLV_LOC_CD\", "
				+ "  M_DLV_LOC.\"SHIP_CTL_TYP\" AS \"SHIP_CTL_TYP\", "
				+ "  M_DLV_LOC.\"DLV_SLIP_ISS_FLG\" AS \"DLV_SLIP_ISS_FLG\", "
				+ "  M_DLV_LOC.\"IDENT_CARD_F_ISS_TYP\" AS \"IDENT_CARD_F_ISS_TYP\", "
				+ "  M_DLV_LOC.\"IDENT_CARD_F_FORMAT_TYP\" AS \"IDENT_CARD_F_FORMAT_TYP\", "
				+ "  M_DLV_LOC.\"SHIP_FIX_TERM\" AS \"SHIP_FIX_TERM\", "
				+ "  M_DLV_LOC.\"MASS_PRODUCT_TYP\" AS \"MASS_PRODUCT_TYP\", "
				+ "  M_DLV_LOC.\"DECISION_REPLACE_PTN\" AS \"DECISION_REPLACE_PTN\", "
				+ "  M_DLV_LOC.\"SHIP_RSLT_APPLY_TYP\" AS \"SHIP_RSLT_APPLY_TYP\", "
				+ "  M_DLV_LOC.\"CNCNTRT_SHIP_RSLT_APPLY_TYP\" AS \"CNCNTRT_SHIP_RSLT_APPLY_TYP\", "
				+ "  M_DLV_LOC.\"NEXT_DLV_SHIFT_EFF_FLG\" AS \"NEXT_DLV_SHIFT_EFF_FLG\", "
				+ "  M_DLV_LOC.\"UNCNFM_PLAN_AVG_FLG\" AS \"UNCNFM_PLAN_AVG_FLG\", "
				+ "  M_DLV_LOC.\"TRANSPORT_CD\" AS \"TRANSPORT_CD\", "
				+ "  M_DLV_LOC.\"CNCNTRT_TRANS_LT\" AS \"CNCNTRT_TRANS_LT\", "
				+ "  M_DLV_LOC.\"CUST_TRANS_LT\" AS \"CUST_TRANS_LT\" "
				+ "FROM " + "  M_DLV_LOC " + "WHERE "
				+ "  M_DLV_LOC.\"COMPANY_CD\" = ? "
				+ "  AND M_DLV_LOC.\"CUST_CD\" = ? "
				+ "  AND M_DLV_LOC.\"DLV_LOC_CD\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:selectM_DLV_LOC_read
			if (m_selcmd == null)
				throw new FoundationException("selectM_DLV_LOC", "read",
						"クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:selectM_DLV_LOC_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;
				ary.addElement(data.getDLV_LOC_CD());
				if (isNull(data.getDLV_LOC_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getDLV_LOC_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_CUST_CD(getString(1, rs));
			data.setd_OLD_DLV_LOC_CD(getString(2, rs));
			data.setd_OLD_DLV_LOC_NAME(getString(3, rs));
			data.setd_OLD_DLV_LOC_KNAME(getString(4, rs));
			data.setd_OLD_DLV_LOC_ENAME(getString(5, rs));
			data.setd_OLD_ZIP_CD(getString(6, rs));
			data.setd_OLD_ADDRESS_1(getString(7, rs));
			data.setd_OLD_ADDRESS_2(getString(8, rs));
			data.setd_OLD_ADDRESS_K_1(getString(9, rs));
			data.setd_OLD_ADDRESS_K_2(getString(10, rs));
			data.setd_OLD_TEL(getString(11, rs));
			data.setd_OLD_FAX(getString(12, rs));
			data.setd_OLD_CNCNTRT_DLV_LOC_CD(getString(13, rs));
			data.setd_OLD_SHIP_CTL_TYP(getString(14, rs));
			data.setd_OLD_DLV_SLIP_ISS_FLG(getString(15, rs));
			data.setd_OLD_IDENT_CARD_F_ISS_TYP(getString(16, rs));
			data.setd_OLD_IDENT_CARD_F_FORMAT_TYP(getString(17, rs));
			data.setd_OLD_SHIP_FIX_TERM(getString(18, rs));
			data.setd_OLD_MASS_PRODUCT_TYP(getString(19, rs));
			data.setd_OLD_DECISION_REPLACE_PTN(getString(20, rs));
			data.setd_OLD_SHIP_RSLT_APPLY_TYP(getString(21, rs));
			data.setd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP(getString(22, rs));
			data.setd_OLD_NEXT_DLV_SHIFT_EFF_FLG(getString(23, rs));
			data.setd_OLD_UNCNFM_PLAN_AVG_FLG(getString(24, rs));
			data.setd_OLD_TRANSPORT_CD(getString(25, rs));
			data.setd_OLD_CNCNTRT_TRANS_LT(getString(26, rs));
			data.setd_OLD_CUST_TRANS_LT(getString(27, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CUST_DESINATED_DLV_LOC extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_CUST_DESINATED_DLV_LOC.\"CUST_CD\" AS \"CUST_CD\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"CUST_DESINATED_DLV_LOC_CD\" AS \"CUST_DESINATED_DLV_LOC_CD\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"DLV_LOC_OPTION_CHANGE_VALUE\" AS \"DLV_LOC_OPTION_CHANGE_VALUE\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"CUST_DESINATED_DLV_LOC_NAME\" AS \"CUST_DESINATED_DLV_LOC_NAME\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"CUST_DESINATED_DLV_LOC_KNAME\" AS \"CUST_DESINATED_DLV_LOC_KNAME\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"CUST_DESINATED_DLV_LOC_ENAME\" AS \"CUST_DESINATED_DLV_LOC_ENAME\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"ZIP_CD\" AS \"ZIP_CD\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"ADDRESS_1\" AS \"ADDRESS_1\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"ADDRESS_2\" AS \"ADDRESS_2\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"ADDRESS_K_1\" AS \"ADDRESS_K_1\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"ADDRESS_K_2\" AS \"ADDRESS_K_2\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"TEL\" AS \"TEL\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"FAX\" AS \"FAX\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"DLV_LOC_CD\" AS \"DLV_LOC_CD\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"REMARKS_1\" AS \"REMARKS_1\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"REMARKS_2\" AS \"REMARKS_2\", "
				+ "  M_CUST_DESINATED_DLV_LOC.\"REMARKS_3\" AS \"REMARKS_3\" "
				+ "FROM "
				+ "  M_CUST_DESINATED_DLV_LOC "
				+ "WHERE "
				+ "  M_CUST_DESINATED_DLV_LOC.\"COMPANY_CD\" = ? "
				+ "  AND M_CUST_DESINATED_DLV_LOC.\"CUST_CD\" = ? "
				+ "  AND M_CUST_DESINATED_DLV_LOC.\"CUST_DESINATED_DLV_LOC_CD\" = ? "
				+ "  AND M_CUST_DESINATED_DLV_LOC.\"DLV_LOC_OPTION_CHANGE_VALUE\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:selectM_CUST_DESINATED_DLV_LOC_read
			if (m_selcmd == null)
				throw new FoundationException("selectM_CUST_DESINATED_DLV_LOC",
						"read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:selectM_CUST_DESINATED_DLV_LOC_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;
				ary.addElement(data.getCUST_DESINATED_DLV_LOC_CD());
				if (isNull(data.getCUST_DESINATED_DLV_LOC_CD()))
					isNull = true;
				ary.addElement(data.getDLV_LOC_OPTION_CHANGE_VALUE());
				if (isNull(data.getDLV_LOC_OPTION_CHANGE_VALUE()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_DESINATED_DLV_LOC_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getDLV_LOC_OPTION_CHANGE_VALUE(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_CUST_CD(getString(1, rs));
			data.setd_OLD_CUST_DESINATED_DLV_LOC_CD(getString(2, rs));
			data.setd_OLD_DLV_LOC_OPTION_CHANGE_VALUE(getString(3, rs));
			data.setd_OLD_CUST_DESINATED_DLV_LOC_NAME(getString(4, rs));
			data.setd_OLD_CUST_DESINATED_DLV_LOC_KNAME(getString(5, rs));
			data.setd_OLD_CUST_DESINATED_DLV_LOC_ENAME(getString(6, rs));
			data.setd_OLD_ZIP_CD(getString(7, rs));
			data.setd_OLD_ADDRESS_1(getString(8, rs));
			data.setd_OLD_ADDRESS_2(getString(9, rs));
			data.setd_OLD_ADDRESS_K_1(getString(10, rs));
			data.setd_OLD_ADDRESS_K_2(getString(11, rs));
			data.setd_OLD_TEL(getString(12, rs));
			data.setd_OLD_FAX(getString(13, rs));
			data.setd_OLD_DLV_LOC_CD(getString(14, rs));
			data.setd_OLD_REMARKS_1(getString(15, rs));
			data.setd_OLD_REMARKS_2(getString(16, rs));
			data.setd_OLD_REMARKS_3(getString(17, rs));

			return data;
		}
	}

	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_ITEM extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_ITEM.\"ITEM_CD\" AS \"ITEM_CD\", "
				+ "  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
				+ "  M_ITEM.\"DRAW_CD\" AS \"DRAW_CD\", "
				+ "  M_ITEM.\"SPEC\" AS \"SPEC\", "
				+ "  M_ITEM.\"HIGH_LEVEL_NO\" AS \"HIGH_LEVEL_NO\", "
				+ "  M_ITEM.\"MRP_ODR_TYP\" AS \"MRP_ODR_TYP\", "
				+ "  M_ITEM.\"OUTSIDE_TYP\" AS \"OUTSIDE_TYP\", "
				+ "  M_ITEM.\"STOCK_UNIT_FLG\" AS \"STOCK_UNIT_FLG\", "
				+ "  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
				+ "  M_ITEM.\"PKG_UNIT\" AS \"PKG_UNIT\", "
				+ "  M_ITEM.\"PKG_UNIT_QTY\" AS \"PKG_UNIT_QTY\", "
				+ "  M_ITEM.\"UNIT_QTY_TYP\" AS \"UNIT_QTY_TYP\", "
				+ "  M_ITEM.\"ODR_LT\" AS \"ODR_LT\", "
				+ "  M_ITEM.\"FIXED_LT\" AS \"FIXED_LT\", "
				+ "  M_ITEM.\"PROP_LT\" AS \"PROP_LT\", "
				+ "  M_ITEM.\"SAFETY_LT\" AS \"SAFETY_LT\", "
				+ "  M_ITEM.\"ISSUE_LT\" AS \"ISSUE_LT\", "
				+ "  M_ITEM.\"PROP_LOT_SIZE\" AS \"PROP_LOT_SIZE\", "
				+ "  M_ITEM.\"ITEM_SPOIL\" AS \"ITEM_SPOIL\", "
				+ "  M_ITEM.\"SAFETY_STOCK\" AS \"SAFETY_STOCK\", "
				+ "  M_ITEM.\"LOT_SIZING_TYP\" AS \"LOT_SIZING_TYP\", "
				+ "  M_ITEM.\"MAX_PERIOD\" AS \"MAX_PERIOD\", "
				+ "  M_ITEM.\"MAX_ODR_QTY\" AS \"MAX_ODR_QTY\", "
				+ "  M_ITEM.\"ODR_POINT\" AS \"ODR_POINT\", "
				+ "  M_ITEM.\"FIXED_ODR_QTY\" AS \"FIXED_ODR_QTY\", "
				+ "  M_ITEM.\"MIN_ODR_QTY\" AS \"MIN_ODR_QTY\", "
				+ "  M_ITEM.\"MUL_ODR_QTY\" AS \"MUL_ODR_QTY\", "
				+ "  M_ITEM.\"ISSUE_TYP\" AS \"ISSUE_TYP\", "
				+ "  M_ITEM.\"MPS_FLG\" AS \"MPS_FLG\", "
				+ "  M_ITEM.\"ACPT_INSPC_TYP\" AS \"ACPT_INSPC_TYP\", "
				+ "  M_ITEM.\"PRODUCT_TYP\" AS \"PRODUCT_TYP\", "
				+ "  M_ITEM.\"CLASIFICATION_CD\" AS \"CLASIFICATION_CD\", "
				+ "  M_ITEM.\"UNIT_WEIGHT\" AS \"UNIT_WEIGHT\", "
				+ "  M_ITEM.\"ABC_TYP\" AS \"ABC_TYP\", "
				+ "  M_ITEM.\"OPR_RSLT_TYP\" AS \"OPR_RSLT_TYP\", "
				+ "  M_ITEM.\"SPL_ITEM_TYP\" AS \"SPL_ITEM_TYP\", "
				+ "  M_ITEM.\"TAX_CD\" AS \"TAX_CD\", "
				+ "  M_ITEM.\"CAL_NO\" AS \"CAL_NO\", "
				+ "  M_ITEM.\"BEST_BEFORE_YEAR\" AS \"BEST_BEFORE_YEAR\", "
				+ "  M_ITEM.\"BEST_BEFORE_MONTH\" AS \"BEST_BEFORE_MONTH\", "
				+ "  M_ITEM.\"BEST_BEFORE_DAY\" AS \"BEST_BEFORE_DAY\", "
				+ "  M_ITEM.\"LOT_CTRL_FLG\" AS \"LOT_CTRL_FLG\", "
				+ "  M_ITEM.\"LOT_NUMBERING_TYP\" AS \"LOT_NUMBERING_TYP\", "
				+ "  M_ITEM.\"DEPO_TYP\" AS \"DEPO_TYP\", "
				+ "  M_ITEM.\"MANHOUR_TYP\" AS \"MANHOUR_TYP\" "+ "FROM "
				+ "  M_ITEM " + "WHERE " + "  M_ITEM.\"ITEM_CD\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData()
						.getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:SELECT_read
			if (m_selcmd == null)
				throw new FoundationException("SELECT", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:SELECT_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getITEM_CD());
				if (isNull(data.getITEM_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_ITEM_CD(getString(1, rs));
			data.setd_OLD_ITEM_NAME(getString(2, rs));
			data.setd_OLD_DRAW_CD(getString(3, rs));
			data.setd_OLD_SPEC(getString(4, rs));
			data.setd_OLD_HIGH_LEVEL_NO(getString(5, rs));
			data.setd_OLD_MRP_ODR_TYP(getString(6, rs));
			data.setd_OLD_OUTSIDE_TYP(getString(7, rs));
			data.setd_OLD_STOCK_UNIT_FLG(getString(8, rs));
			data.setd_OLD_STOCK_UNIT(getString(9, rs));
			data.setd_OLD_PKG_UNIT(getString(10, rs));
			data.setd_OLD_PKG_UNIT_QTY(getString(11, rs));
			data.setd_OLD_UNIT_QTY_TYP(getString(12, rs));
			data.setd_OLD_ODR_LT(getString(13, rs));
			data.setd_OLD_FIXED_LT(getString(14, rs));
			data.setd_OLD_PROP_LT(getString(15, rs));
			data.setd_OLD_SAFETY_LT(getString(16, rs));
			data.setd_OLD_ISSUE_LT(getString(17, rs));
			data.setd_OLD_PROP_LOT_SIZE(getString(18, rs));
			data.setd_OLD_ITEM_SPOIL(getString(19, rs));
			data.setd_OLD_SAFETY_STOCK(getString(20, rs));
			data.setd_OLD_LOT_SIZING_TYP(getString(21, rs));
			data.setd_OLD_MAX_PERIOD(getString(22, rs));
			data.setd_OLD_MAX_ODR_QTY(getString(23, rs));
			data.setd_OLD_ODR_POINT(getString(24, rs));
			data.setd_OLD_FIXED_ODR_QTY(getString(25, rs));
			data.setd_OLD_MIN_ODR_QTY(getString(26, rs));
			data.setd_OLD_MUL_ODR_QTY(getString(27, rs));
			data.setd_OLD_ISSUE_TYP(getString(28, rs));
			data.setd_OLD_MPS_FLG(getString(29, rs));
			data.setd_OLD_ACPT_INSPC_TYP(getString(30, rs));
			data.setd_OLD_PRODUCT_TYP(getString(31, rs));
			data.setd_OLD_CLASIFICATION_CD(getString(32, rs));
			data.setd_OLD_UNIT_WEIGHT(getString(33, rs));
			data.setd_OLD_ABC_TYP(getString(34, rs));
			data.setd_OLD_OPR_RSLT_TYP(getString(35, rs));
			data.setd_OLD_SPL_ITEM_TYP(getString(36, rs));
			data.setd_OLD_TAX_CD(getString(37, rs));
			data.setd_OLD_CAL_NO(getString(38, rs));
			data.setd_OLD_BEST_BEFORE_YEAR(getString(39, rs));
			data.setd_OLD_BEST_BEFORE_MONTH(getString(40, rs));
			data.setd_OLD_BEST_BEFORE_DAY(getString(41, rs));
			data.setd_OLD_LOT_CTRL_FLG(getString(42, rs));
			data.setd_OLD_LOT_NUMBERING_TYP(getString(43, rs));
			data.setd_OLD_DEPO_TYP(getString(44, rs));
			data.setd_OLD_MANHOUR_TYP(getString(45, rs));

			return data;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_UNIT_COST_JF extends DataObject {
		protected String m_selcmd ="SELECT "
			+"  M_UNIT_COST.COMPANY_CD as COMPANY_CD, "
			+"  M_UNIT_COST.CUST_CD as CUST_CD, "
			+"  M_UNIT_COST.ITEM_CD as TEM_CD, "
			+"  M_UNIT_COST.SPCL_PRICE_TYP as SPCL_PRICE_TYP, "
			+"  M_UNIT_COST.UNIT_CD as UNIT_CD, "
			+"  TO_CHAR(M_UNIT_COST.EFF_PHASE_IN_DATE, 'YYYY/MM/DD') as EFF_PHASE_IN_DATE, "
			+"  M_UNIT_COST.SEQNO as SEQNO, "
			+"  M_UNIT_COST.SALE_SIZE as SALE_SIZE, "
			+"  M_UNIT_COST.UNIT_COST as UNIT_COST, "
			+"  TO_CHAR(M_UNIT_COST.EFF_PHASE_OUT_DATE, 'YYYY/MM/DD') as EFF_PHASE_OUT_DATE, "
			+"  M_UNIT_COST.UNIT_COST_TYP as UNIT_COST_TYP, "
			+"  M_CUST.CUST_NAME as CUST_NAME, "
			+"  M_CUST.CUR_CD as CUR_CD, "
			+"  M_CUR.CUR_NAME as CUR_NAME, "
			+"  M_ITEM.ITEM_NAME as ITEM_NAME "
			+"FROM "
			+"  M_UNIT_COST, "
			+"  M_CUST, "
			+"  M_CUR, "
			+"  M_ITEM "
			+"WHERE "
			+"  M_UNIT_COST.COMPANY_CD = ? "
			+"  AND M_UNIT_COST.CUST_CD = ? "
			+"  AND M_UNIT_COST.ITEM_CD = ? "
			+"  AND M_UNIT_COST.SPCL_PRICE_TYP = ? "
			+"  AND M_UNIT_COST.UNIT_CD = ? "
			+"  AND M_UNIT_COST.SEQNO = ? "
			+"  AND M_UNIT_COST.COMPANY_CD = M_CUST.COMPANY_CD(+) "
			+"  AND M_UNIT_COST.CUST_CD = M_CUST.CUST_CD(+) "
			+"  AND M_CUST.CUR_CD = M_CUR.CUR_CD(+) "
			+"  AND M_UNIT_COST.ITEM_CD = M_ITEM.ITEM_CD(+)";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			if (m_selcmd == null)
				throw new FoundationException("selectM_UNIT_COST", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getCOMPANY_CD());
				if (isNull(data.getCOMPANY_CD()))
					isNull = true;
				ary.addElement(data.getCUST_CD());
				if (isNull(data.getCUST_CD()))
					isNull = true;
				ary.addElement(data.getITEM_CD());
				if (isNull(data.getITEM_CD()))
					isNull = true;
				ary.addElement(data.getSPCL_PRICE_TYP());
				if (isNull(data.getSPCL_PRICE_TYP()))
					isNull = true;
				ary.addElement(data.getUNIT_CD());
				if (isNull(data.getUNIT_CD()))
					isNull = true;
				ary.addElement(data.getSEQNO());
				if (isNull(data.getSEQNO()))
					isNull = true;
				
				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getCOMPANY_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getCUST_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getITEM_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getSPCL_PRICE_TYP(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getUNIT_CD(), stmt);
			// 静的SQL文の生成
			setString(no++, data.getSEQNO(), stmt);
			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_ITEM_CD(getString(3, rs));
			data.setd_OLD_CUST_CD(getString(2, rs));
			
			data.setd_OLD_SPCL_PRICE_TYP(getString(4, rs));
			data.setd_OLD_UNIT_CD(getString(5, rs));
			data.setd_OLD_EFF_PHASE_IN_DATE(getString(6, rs));
			data.setd_OLD_SALE_SIZE(getString(8, rs));
			data.setd_OLD_EFF_PHASE_OUT_DATE(getString(10, rs));
			data.setd_OLD_UNIT_COST_TYP(getString(11, rs));
			data.setd_OLD_CUR_CD(getString(13, rs));
			data.setd_OLD_UNIT_COST(getString(9, rs));

			return data;
		}
	}
	
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_STOCK_STS extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_STOCK_STS.\"STOCK_STATUS\" AS \"STOCK_STATUS\", "
				+ "  M_STOCK_STS.\"STOCK_STATUS_NAME\" AS \"STOCK_STATUS_NAME\", "
				+ "  M_STOCK_STS.\"STOCK_TYP\" AS \"STOCK_TYP\", "
				+ "  M_STOCK_STS.\"EFF_STOCK_TYP\" AS \"EFF_STOCK_TYP\", "
				+ "  M_STOCK_STS.\"SHIP_TYP\" AS \"SHIP_TYP\", "
				+ "  M_STOCK_STS.\"REF_NO\" AS \"REF_NO\", "
				+ "   M_STOCK_STS.\"MODIFY_COUNT\" AS \"MODIFY_COUNT\" "
				+ "FROM " + "  M_STOCK_STS " + "WHERE "
				+ "  M_STOCK_STS.\"STOCK_STATUS\" = ? ";
 	/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:selectM_STOCK_STS_read
			if (m_selcmd == null)
				throw new FoundationException("selectM_STOCK_STS", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:selectM_STOCK_STS_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				 ary.addElement(data.getSTOCK_STATUS());
				 if (isNull(data.getSTOCK_STATUS()))
					isNull = true;
				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			   setString(no++, data.getSTOCK_STATUS(), stmt);
			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();
			data.setd_OLD_STOCK_STATUS(getString(1, rs));
			data.setd_OLD_STOCK_STATUS_NAME(getString(2, rs));
			data.setd_OLD_STOCK_TYP(getString(3, rs));
			data.setd_OLD_EFF_STOCK_TYP(getString(4, rs));
			data.setd_OLD_SHIP_TYP(getString(5, rs));
			data.setd_OLD_REF_NO(getString(6, rs));
			return data;
		}
	}
	
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_CUST_COMB extends DataObject {
		protected String m_selcmd = "select "
			+"  M_BALA_ACCOUT_COMB.DELIVERY_CD, "
			+"  M_CUSTDLV.CUST_ANAME, "
			+"  M_BALA_ACCOUT_COMB.CUST_CD, "
			+"  M_CUST.CUST_ANAME, "
			+"  M_CUST_COMB.PRIORITY_REF_NO, "
			+"  M_BALA_ACCOUT_COMB.BALA_ACCO_PATTERN_CD, "
			+"  M_BALA_ACCOUT_COMB.PRIORITY_REF_NO, "
			+"  M_CUSTBALA1.CUST_CD, "
			+"  M_CUSTBALA1.CUST_ANAME, "
			+"  M_CUSTBALA2.CUST_CD, "
			+"  M_CUSTBALA2.CUST_ANAME, "
			+"  M_CUSTBALA3.CUST_CD, "
			+"  M_CUSTBALA3.CUST_ANAME, "
			+"  M_CUST_COMB.MODIFY_COUNT, "
			+"  M_BALA_ACCOUT_COMB.MODIFY_COUNT "
			+"from "
			+"  M_CUST_COMB, "
			+"  M_BALA_ACCOUT_COMB, "
			+"  M_CUST, "
			+"  M_CUST M_CUSTDLV, "
			+"  M_CUST M_CUSTBALA1, "
			+"  M_CUST M_CUSTBALA2, "
			+"  M_CUST M_CUSTBALA3 "
			+"where "
			+"  M_BALA_ACCOUT_COMB.COMPANY_CD = ? "
			+"  AND M_BALA_ACCOUT_COMB.CUST_CD LIKE ? "
			+"  AND M_BALA_ACCOUT_COMB.DELIVERY_CD LIKE ? "
			+"  AND M_BALA_ACCOUT_COMB.BALA_ACCO_PATTERN_CD LIKE ? "
			+"  AND M_BALA_ACCOUT_COMB.COMPANY_CD = M_CUST_COMB.COMPANY_CD "
			+"  AND M_BALA_ACCOUT_COMB.CUST_CD = M_CUST_COMB.CUST_CD "
			+"  AND M_BALA_ACCOUT_COMB.DELIVERY_CD = M_CUST_COMB.DELIVERY_CD "
			+"  AND M_CUSTDLV.COMPANY_CD = M_BALA_ACCOUT_COMB.COMPANY_CD "
			+"  AND M_CUSTDLV.CUST_CD = M_BALA_ACCOUT_COMB.DELIVERY_CD "
			+"  AND M_CUSTDLV.DELIVERY_FLG = 1 "
			+"  AND M_CUST.COMPANY_CD = M_BALA_ACCOUT_COMB.COMPANY_CD "
			+"  AND M_CUST.CUST_CD = M_BALA_ACCOUT_COMB.CUST_CD "
			+"  AND M_CUST.CUST_FLG = 1 "
			+"  AND M_CUSTBALA1.COMPANY_CD(+) = M_BALA_ACCOUT_COMB.COMPANY_CD "
			+"  AND M_CUSTBALA1.CUST_CD(+) = M_BALA_ACCOUT_COMB.BALA_ACCO_CD_1 "
			+"  AND M_CUSTBALA1.BALA_ACCO_FLG(+) = 1 "
			+"  AND M_CUSTBALA2.COMPANY_CD(+) = M_BALA_ACCOUT_COMB.COMPANY_CD "
			+"  AND M_CUSTBALA2.CUST_CD(+) = M_BALA_ACCOUT_COMB.BALA_ACCO_CD_2 "
			+"  AND M_CUSTBALA2.BALA_ACCO_FLG(+) = 1 "
			+"  AND M_CUSTBALA3.COMPANY_CD(+) = M_BALA_ACCOUT_COMB.COMPANY_CD "
			+"  AND M_CUSTBALA3.CUST_CD(+) = M_BALA_ACCOUT_COMB.BALA_ACCO_CD_3 "
			+"  AND M_CUSTBALA3.BALA_ACCO_FLG(+) = 1 "
			+"order by "
			+"  M_BALA_ACCOUT_COMB.DELIVERY_CD, "
			+"  M_BALA_ACCOUT_COMB.CUST_CD";
		
		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:selectM_STOCK_STS_read
			if (m_selcmd == null)
				throw new FoundationException("selectM_CUST_COMB", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:selectM_STOCK_STS_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				 ary.addElement(data.getCOMPANY_CD());
				 if (isNull(data.getCOMPANY_CD()))
					isNull = true;				 
				 ary.addElement(data.getCUST_CD());
				 if (isNull(data.getCUST_CD()))
					isNull = true;
				 ary.addElement(data.getDELIVERY_CD());
				 if (isNull(data.getDELIVERY_CD()))
					isNull = true;
				 ary.addElement(data.getBALA_ACCO_PATTERN_CD());
				 if (isNull(data.getBALA_ACCO_PATTERN_CD()))
					isNull = true;
				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			   setString(no++, data.getCOMPANY_CD(), stmt);
			   setString(no++, data.getCUST_CD(), stmt);
			   setString(no++, data.getDELIVERY_CD(), stmt);
			   setString(no++, data.getBALA_ACCO_PATTERN_CD(), stmt);
			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();
			data.setd_OLD_DELIVERY_CD(getString(1, rs));
			data.setd_OLD_CUST_CD(getString(3, rs));
			data.setd_OLD_BALA_ACCO_PATTERN_CD(getString(6, rs));
			data.setd_OLD_CUST_PRIORITY_REF_NO(getString(5, rs));			
			data.setd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO(getString(7, rs));
			data.setd_OLD_BALA_ACCO_CD_1(getString(8, rs));
			data.setd_OLD_BALA_ACCO_CD_2(getString(10, rs));
			data.setd_OLD_BALA_ACCO_CD_3(getString(12, rs));
			return data;
		}
	}	
	
	/**
	 * Entity定義 静的SQL
	 */
	public class selectM_ITEM_JF extends DataObject {
		protected String m_selcmd = "SELECT "
				+ "  M_ITEM.\"ITEM_CD\" AS \"ITEM_CD\", "
				+ "  M_ITEM.\"ITEM_NAME\" AS \"ITEM_NAME\", "
				+ "  M_ITEM.\"DRAW_CD\" AS \"DRAW_CD\", "
				+ "  M_ITEM.\"SPEC\" AS \"SPEC\", "
				+ "  M_ITEM.\"HIGH_LEVEL_NO\" AS \"HIGH_LEVEL_NO\", "
				+ "  M_ITEM.\"MRP_ODR_TYP\" AS \"MRP_ODR_TYP\", "
				+ "  M_ITEM.\"OUTSIDE_TYP\" AS \"OUTSIDE_TYP\", "
				+ "  M_ITEM.\"STOCK_UNIT_FLG\" AS \"STOCK_UNIT_FLG\", "
				+ "  M_ITEM.\"STOCK_UNIT\" AS \"STOCK_UNIT\", "
				+ "  M_ITEM.\"PATTERN_CD\" AS \"PATTERN_CD\", "
				+ "  M_ITEM.\"SET_LT\" AS \"SET_LT\", "
				+ "  M_ITEM.\"UNIT_QTY_TYP\" AS \"UNIT_QTY_TYP\", "
				+ "  M_ITEM.\"ODR_LT\" AS \"ODR_LT\", "
				+ "  M_ITEM.\"FIXED_LT\" AS \"FIXED_LT\", "
				+ "  M_ITEM.\"PROP_LT\" AS \"PROP_LT\", "
				+ "  M_ITEM.\"SAFETY_LT\" AS \"SAFETY_LT\", "
				+ "  M_ITEM.\"ISSUE_LT\" AS \"ISSUE_LT\", "
				+ "  M_ITEM.\"PROP_LOT_SIZE\" AS \"PROP_LOT_SIZE\", "
				+ "  M_ITEM.\"ITEM_SPOIL\" AS \"ITEM_SPOIL\", "
				+ "  M_ITEM.\"SAFETY_STOCK\" AS \"SAFETY_STOCK\", "
				+ "  M_ITEM.\"LOT_SIZING_TYP\" AS \"LOT_SIZING_TYP\", "
				+ "  M_ITEM.\"MAX_PERIOD\" AS \"MAX_PERIOD\", "
				+ "  M_ITEM.\"MAX_ODR_QTY\" AS \"MAX_ODR_QTY\", "
				+ "  M_ITEM.\"ODR_POINT\" AS \"ODR_POINT\", "
				+ "  M_ITEM.\"FIXED_ODR_QTY\" AS \"FIXED_ODR_QTY\", "
				+ "  M_ITEM.\"MIN_ODR_QTY\" AS \"MIN_ODR_QTY\", "
				+ "  M_ITEM.\"MUL_ODR_QTY\" AS \"MUL_ODR_QTY\", "
				+ "  M_ITEM.\"ISSUE_TYP\" AS \"ISSUE_TYP\", "
				+ "  M_ITEM.\"MPS_FLG\" AS \"MPS_FLG\", "
				+ "  M_ITEM.\"ACPT_INSPC_TYP\" AS \"ACPT_INSPC_TYP\", "
				+ "  M_ITEM.\"PRODUCT_TYP\" AS \"PRODUCT_TYP\", "
				+ "  M_ITEM.\"CLASIFICATION_CD\" AS \"CLASIFICATION_CD\", "
				+ "  M_ITEM.\"UNIT_WEIGHT\" AS \"UNIT_WEIGHT\", "
				+ "  M_ITEM.\"ABC_TYP\" AS \"ABC_TYP\", "
				+ "  M_ITEM.\"OPR_RSLT_TYP\" AS \"OPR_RSLT_TYP\", "
				+ "  M_ITEM.\"SPL_ITEM_TYP\" AS \"SPL_ITEM_TYP\", "
				+ "  M_ITEM.\"TAX_CD\" AS \"TAX_CD\", "
				+ "  M_ITEM.\"CAL_NO\" AS \"CAL_NO\", "
				+ "  M_ITEM.\"BEST_BEFORE_YEAR\" AS \"BEST_BEFORE_YEAR\", "
				+ "  M_ITEM.\"BEST_BEFORE_MONTH\" AS \"BEST_BEFORE_MONTH\", "
				+ "  M_ITEM.\"BEST_BEFORE_DAY\" AS \"BEST_BEFORE_DAY\", "
				+ "  M_ITEM.\"LOT_CTRL_FLG\" AS \"LOT_CTRL_FLG\", "
				+ "  M_ITEM.\"LOT_NUMBERING_TYP\" AS \"LOT_NUMBERING_TYP\", "
				+ "  M_ITEM.\"DEPO_TYP\" AS \"DEPO_TYP\", "
				+ "  M_ITEM.\"JANCODE\" AS \"JANCODE\", "				
				+ "  M_ITEM.\"MAX_STOCK_QTY\" AS \"MAX_STOCK_QTY\", "
				+ "  M_ITEM.\"STOCK_STATUS\" AS \"STOCK_STATUS\", "
				+ "  M_ITEM.\"SHIP_DEADLINE_YEAR\" AS \"SHIP_DEADLINE_YEAR\", "
				+ "  M_ITEM.\"SHIP_DEADLINE_MONTH\" AS \"SHIP_DEADLINE_MONTH\", "
				+ "  M_ITEM.\"SHIP_DEADLINE_DAY\" AS \"SHIP_DEADLINE_DAY\" "
				+ "FROM "
				+ "  M_ITEM " + "WHERE " + "  M_ITEM.\"ITEM_CD\" = ?";

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            IDbConnectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			try {
				return read(conn.getConn(), data);
			} catch (SQLException e) {
				if (("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName()))
						&& (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 * 
		 * @param conn
		 *            Native Connectionクラスインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data)
				throws FoundationException, SQLException {
			// {{user_implement_dev:SELECT_read
			if (m_selcmd == null)
				throw new FoundationException("SELECT", "read", "クエリー未登録");

			PreparedStatement stmt = prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			// }}user_implement_dev:SELECT_read
		}

		/**
		 * データ読出し処理
		 * 
		 * @return Struct結果リスト
		 * @param stmt
		 *            PreparedStatementインスタンス
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data)
				throws FoundationException, SQLException {
			ResultSet rs = executeQuery(stmt, data);

			try {
				List list = new ArrayList();

				while ((data = next(rs)) != null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 * 
		 * @return PreparedStatementインスタンスを返します
		 * @param conn
		 *            Native Connectionインスタンス
		 * @param query
		 *            SQL文字列
		 * @param data
		 *            Structクラスインスタンス
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query,
				AZ0060010Struct data) throws FoundationException, SQLException {
			PreparedStatement stmt;
			Vector ary = new Vector();
			String dyn_query;
			boolean isNull = false;

			try {
				ary.addElement(data.getITEM_CD());
				if (isNull(data.getITEM_CD()))
					isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 * 
		 * @exception <
		 *                <コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt,
				AZ0060010Struct data) throws FoundationException, SQLException {
			int no = 1;

			// 静的SQL文の生成
			setString(no++, data.getITEM_CD(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException,
				SQLException {
			if (rs.next() == false)
				return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.setd_OLD_ITEM_CD(getString(1, rs));
			data.setd_OLD_ITEM_NAME(getString(2, rs));
			data.setd_OLD_DRAW_CD(getString(3, rs));
			data.setd_OLD_SPEC(getString(4, rs));
			data.setd_OLD_HIGH_LEVEL_NO(getString(5, rs));
			data.setd_OLD_MRP_ODR_TYP(getString(6, rs));
			data.setd_OLD_OUTSIDE_TYP(getString(7, rs));
			data.setd_OLD_STOCK_UNIT_FLG(getString(8, rs));
			data.setd_OLD_STOCK_UNIT(getString(9, rs));
			data.setd_OLD_PATTERN_CD(getString(10, rs));
			data.setd_OLD_SET_LT(getString(11, rs));
			data.setd_OLD_UNIT_QTY_TYP(getString(12, rs));
			data.setd_OLD_ODR_LT(getString(13, rs));
			data.setd_OLD_FIXED_LT(getString(14, rs));
			data.setd_OLD_PROP_LT(getString(15, rs));
			data.setd_OLD_SAFETY_LT(getString(16, rs));
			data.setd_OLD_ISSUE_LT(getString(17, rs));
			data.setd_OLD_PROP_LOT_SIZE(getString(18, rs));
			data.setd_OLD_ITEM_SPOIL(getString(19, rs));
			data.setd_OLD_SAFETY_STOCK(getString(20, rs));
			data.setd_OLD_LOT_SIZING_TYP(getString(21, rs));
			data.setd_OLD_MAX_PERIOD(getString(22, rs));
			data.setd_OLD_MAX_ODR_QTY(getString(23, rs));
			data.setd_OLD_ODR_POINT(getString(24, rs));
			data.setd_OLD_FIXED_ODR_QTY(getString(25, rs));
			data.setd_OLD_MIN_ODR_QTY(getString(26, rs));
			data.setd_OLD_MUL_ODR_QTY(getString(27, rs));
			data.setd_OLD_ISSUE_TYP(getString(28, rs));
			data.setd_OLD_MPS_FLG(getString(29, rs));
			data.setd_OLD_ACPT_INSPC_TYP(getString(30, rs));
			data.setd_OLD_PRODUCT_TYP(getString(31, rs));
			data.setd_OLD_CLASIFICATION_CD(getString(32, rs));
			data.setd_OLD_UNIT_WEIGHT(getString(33, rs));
			data.setd_OLD_ABC_TYP(getString(34, rs));
			data.setd_OLD_OPR_RSLT_TYP(getString(35, rs));
			data.setd_OLD_SPL_ITEM_TYP(getString(36, rs));
			data.setd_OLD_TAX_CD(getString(37, rs));
			data.setd_OLD_CAL_NO(getString(38, rs));
			data.setd_OLD_BEST_BEFORE_YEAR(getString(39, rs));
			data.setd_OLD_BEST_BEFORE_MONTH(getString(40, rs));
			data.setd_OLD_BEST_BEFORE_DAY(getString(41, rs));
			data.setd_OLD_LOT_CTRL_FLG(getString(42, rs));
			data.setd_OLD_LOT_NUMBERING_TYP(getString(43, rs));
			data.setd_OLD_DEPO_TYP(getString(44, rs));
			data.setd_OLD_JANCODE(getString(45, rs));			
			data.setd_OLD_MAX_STOCK_QTY(getString(46, rs));
			data.setd_OLD_STOCK_STATUS(getString(47, rs));
			data.setd_OLD_SHIP_DEADLINE_YEAR(getString(48, rs));
			data.setd_OLD_SHIP_DEADLINE_MONTH(getString(49, rs));
			data.setd_OLD_SHIP_DEADLINE_DAY(getString(50, rs));

			return data;
		}
	}
	/**
	 * Entity定義 静的SQL
	 */
	public class checkAppr4 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M.APPR_ID "
+"FROM "
+"  MST_APPR M, "
+"  MST_APPR_KEY A, "
+"  MST_APPR_KEY B, "
+"  MST_APPR_KEY C, "
+"  MST_APPR_KEY D "
+"WHERE "
+"  M.APPR_ID = A.APPR_ID "
+"  AND A.APPR_ID = B.APPR_ID "
+"  AND B.APPR_ID = C.APPR_ID "
+"  AND C.APPR_ID = D.APPR_ID "
+"  AND A.KEY_NAME = ? "
+"  AND A.KEY_VALUE = ? "
+"  AND A.TABLE_NAME = ? "
+"  AND B.KEY_NAME = ? "
+"  AND B.KEY_VALUE = ? "
+"  AND B.TABLE_NAME = ? "
+"  AND C.KEY_NAME = ? "
+"  AND C.KEY_VALUE = ? "
+"  AND C.TABLE_NAME = ? "
+"  AND D.KEY_NAME = ? "
+"  AND D.KEY_VALUE = ? "
+"  AND D.TABLE_NAME = ? "
+"  AND M.PROC_TYP = ? "
+"  AND M.STATUS <> 3";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkAppr4_def
			// TODO: ユーザ定義のコードを記述してください
		//}}user_implement_dev:checkAppr4_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr4_read
			if(m_selcmd==null) throw new FoundationException("checkAppr4", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr4_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr4_read2
			if(m_selcmd==null) throw new FoundationException("checkAppr4", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr4_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr4_read3
			if(m_selcmd==null) throw new FoundationException("checkAppr4", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr4_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AZ0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_KEY1());
				if(isNull(data.geth_KEY1())) isNull = true;
				ary.addElement(data.geth_VALUE1());
				if(isNull(data.geth_VALUE1())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_KEY2());
				if(isNull(data.geth_KEY2())) isNull = true;
				ary.addElement(data.geth_VALUE2());
				if(isNull(data.geth_VALUE2())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_KEY3());
				if(isNull(data.geth_KEY3())) isNull = true;
				ary.addElement(data.geth_VALUE3());
				if(isNull(data.geth_VALUE3())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_KEY4());
				if(isNull(data.geth_KEY4())) isNull = true;
				ary.addElement(data.geth_VALUE4());
				if(isNull(data.geth_VALUE4())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_PROC_TYP());
				if(isNull(data.geth_PROC_TYP())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AZ0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_KEY1(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE1(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_KEY2(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE2(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_KEY3(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE3(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_KEY4(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE4(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_PROC_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.seth_APPR_ID( getString(1, rs) );

			return data;
		}
	}
	
	/**
	 * Entity定義 静的SQL
	 */
	public class checkAppr3 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M.APPR_ID "
+"FROM "
+"  MST_APPR M, "
+"  MST_APPR_KEY A, "
+"  MST_APPR_KEY B, "
+"  MST_APPR_KEY C "
+"WHERE "
+"  M.APPR_ID = A.APPR_ID "
+"  AND A.APPR_ID = B.APPR_ID "
+"  AND B.APPR_ID = C.APPR_ID "
+"  AND A.KEY_NAME = ? "
+"  AND A.KEY_VALUE = ? "
+"  AND A.TABLE_NAME = ? "
+"  AND B.KEY_NAME = ? "
+"  AND B.KEY_VALUE = ? "
+"  AND B.TABLE_NAME = ? "
+"  AND C.KEY_NAME = ? "
+"  AND C.KEY_VALUE = ? "
+"  AND C.TABLE_NAME = ? "
+"  AND M.PROC_TYP = ? "
+"  AND M.STATUS <> 3";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkAppr3_def
			// TODO: ユーザ定義のコードを記述してください
		//}}user_implement_dev:checkAppr3_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr3_read
			if(m_selcmd==null) throw new FoundationException("checkAppr3", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr3_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr3_read2
			if(m_selcmd==null) throw new FoundationException("checkAppr3", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr3_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr3_read3
			if(m_selcmd==null) throw new FoundationException("checkAppr3", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr3_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AZ0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_KEY1());
				if(isNull(data.geth_KEY1())) isNull = true;
				ary.addElement(data.geth_VALUE1());
				if(isNull(data.geth_VALUE1())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_KEY2());
				if(isNull(data.geth_KEY2())) isNull = true;
				ary.addElement(data.geth_VALUE2());
				if(isNull(data.geth_VALUE2())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_KEY3());
				if(isNull(data.geth_KEY3())) isNull = true;
				ary.addElement(data.geth_VALUE3());
				if(isNull(data.geth_VALUE3())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_PROC_TYP());
				if(isNull(data.geth_PROC_TYP())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AZ0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_KEY1(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE1(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_KEY2(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE2(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_KEY3(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE3(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_PROC_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.seth_APPR_ID( getString(1, rs) );

			return data;
		}
	}
	
	
	/**
	 * Entity定義 静的SQL
	 */
	public class checkAppr2 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M.APPR_ID "
+"FROM "
+"  MST_APPR M, "
+"  MST_APPR_KEY A, "
+"  MST_APPR_KEY B "
+"WHERE "
+"  M.APPR_ID = A.APPR_ID "
+"  AND A.APPR_ID = B.APPR_ID "
+"  AND A.KEY_NAME = ? "
+"  AND A.KEY_VALUE = ? "
+"  AND A.TABLE_NAME = ? "
+"  AND B.KEY_NAME = ? "
+"  AND B.KEY_VALUE = ? "
+"  AND B.TABLE_NAME = ? "
+"  AND M.PROC_TYP = ? "
+"  AND M.STATUS <> 3";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkAppr2_def
			// TODO: ユーザ定義のコードを記述してください
		//}}user_implement_dev:checkAppr2_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr2_read
			if(m_selcmd==null) throw new FoundationException("checkAppr2", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr2_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr2_read2
			if(m_selcmd==null) throw new FoundationException("checkAppr2", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr2_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr2_read3
			if(m_selcmd==null) throw new FoundationException("checkAppr2", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr2_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AZ0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_KEY1());
				if(isNull(data.geth_KEY1())) isNull = true;
				ary.addElement(data.geth_VALUE1());
				if(isNull(data.geth_VALUE1())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_KEY2());
				if(isNull(data.geth_KEY2())) isNull = true;
				ary.addElement(data.geth_VALUE2());
				if(isNull(data.geth_VALUE2())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_PROC_TYP());
				if(isNull(data.geth_PROC_TYP())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AZ0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_KEY1(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE1(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_KEY2(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE2(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_PROC_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.seth_APPR_ID( getString(1, rs) );

			return data;
		}
	}
	
	/**
	 * Entity定義 静的SQL
	 */
	public class checkAppr5 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M.APPR_ID "
+"FROM "
+"  MST_APPR M, "
+"  MST_APPR_KEY A, "
+"  MST_APPR_KEY B, "
+"  MST_APPR_KEY C, "
+"  MST_APPR_KEY D, "
+"  MST_APPR_KEY E "
+"WHERE "
+"  M.APPR_ID = A.APPR_ID "
+"  AND A.APPR_ID = B.APPR_ID "
+"  AND B.APPR_ID = C.APPR_ID "
+"  AND C.APPR_ID = D.APPR_ID "
+"  AND D.APPR_ID = E.APPR_ID "
+"  AND A.KEY_NAME = ? "
+"  AND A.KEY_VALUE = ? "
+"  AND A.TABLE_NAME = ? "
+"  AND B.KEY_NAME = ? "
+"  AND B.KEY_VALUE = ? "
+"  AND B.TABLE_NAME = ? "
+"  AND C.KEY_NAME = ? "
+"  AND C.KEY_VALUE = ? "
+"  AND C.TABLE_NAME = ? "
+"  AND D.KEY_NAME = ? "
+"  AND D.KEY_VALUE = ? "
+"  AND D.TABLE_NAME = ? "
+"  AND E.KEY_NAME = ? "
+"  AND E.KEY_VALUE = ? "
+"  AND E.TABLE_NAME = ? "
+"  AND M.PROC_TYP = ? "
+"  AND M.STATUS <> 3";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkAppr5_def
			// TODO: ユーザ定義のコードを記述してください
		//}}user_implement_dev:checkAppr5_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr5_read
			if(m_selcmd==null) throw new FoundationException("checkAppr5", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr5_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr5_read2
			if(m_selcmd==null) throw new FoundationException("checkAppr5", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr5_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr5_read3
			if(m_selcmd==null) throw new FoundationException("checkAppr5", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr5_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AZ0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_KEY1());
				if(isNull(data.geth_KEY1())) isNull = true;
				ary.addElement(data.geth_VALUE1());
				if(isNull(data.geth_VALUE1())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_KEY2());
				if(isNull(data.geth_KEY2())) isNull = true;
				ary.addElement(data.geth_VALUE2());
				if(isNull(data.geth_VALUE2())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_KEY3());
				if(isNull(data.geth_KEY3())) isNull = true;
				ary.addElement(data.geth_VALUE3());
				if(isNull(data.geth_VALUE3())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_KEY4());
				if(isNull(data.geth_KEY4())) isNull = true;
				ary.addElement(data.geth_VALUE4());
				if(isNull(data.geth_VALUE4())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_KEY5());
				if(isNull(data.geth_KEY5())) isNull = true;
				ary.addElement(data.geth_VALUE5());
				if(isNull(data.geth_VALUE5())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_PROC_TYP());
				if(isNull(data.geth_PROC_TYP())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AZ0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_KEY1(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE1(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_KEY2(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE2(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_KEY3(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE3(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_KEY4(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE4(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_KEY5(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE5(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_PROC_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.seth_APPR_ID( getString(1, rs) );

			return data;
		}
	}
	
	/**
	 * Entity定義 静的SQL
	 */
	public class checkAppr1 extends DataObject
	{
		protected String m_selcmd = "SELECT "
+"  M.APPR_ID "
+"FROM "
+"  MST_APPR M, "
+"  MST_APPR_KEY A "
+"WHERE "
+"  M.APPR_ID = A.APPR_ID "
+"  AND A.KEY_NAME = ? "
+"  AND A.KEY_VALUE = ? "
+"  AND A.TABLE_NAME = ? "
+"  AND M.PROC_TYP = ? "
+"  AND M.STATUS <> 3";
		protected String m_chkcmd = null;
		protected String m_inscmd = null;
		protected String m_updcmd = null;
		protected String m_delcmd = null;
		protected String m_spcmd = null;



		//////////////////////////////

		//{{user_implement_dev:checkAppr1_def
			// TODO: ユーザ定義のコードを記述してください
		//}}user_implement_dev:checkAppr1_def

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data) throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStr);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn IDbConnectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(IDbConnection conn, AZ0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			try {
				return read(conn.getConn(), data, replaceStrs);
			} catch(SQLException e) {
				if(("Oracle".equals(conn.getConn().getMetaData().getDatabaseProductName())) && (e.getErrorCode() == 54)) {
					ResourceBusyException rbe = new ResourceBusyException();
					throw rbe;
				} else {
					throw e;
				}
			}
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data) throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr1_read
			if(m_selcmd==null) throw new FoundationException("checkAppr1", "read", "クエリー未登録");

			PreparedStatement stmt=prepare(conn, m_selcmd, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr1_read
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStr 置換文字列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data, String replaceStr)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr1_read2
			if(m_selcmd==null) throw new FoundationException("checkAppr1", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStr);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr1_read2
		}

		/**
		 * データ読出し処理
		 *
		 * @param conn Native Connectionクラスインスタンス
		 * @param data Structクラスインスタンス
		 * @param replaceStrs 置換文字列配列
		 * @exception <<コメントを記述してください>>
		 */
		public List read(Connection conn, AZ0060010Struct data, String[] replaceStrs)
				throws FoundationException, SQLException
		{
			//{{user_implement_dev:checkAppr1_read3
			if(m_selcmd==null) throw new FoundationException("checkAppr1", "read", "クエリー未登録");
			String sql = replaceSql(m_selcmd, replaceStrs);
			PreparedStatement stmt=prepare(conn, sql, data);

			try {
				return read(stmt, data);
			} finally {
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
			}
			//}}user_implement_dev:checkAppr1_read3
		}

		/**
		 * データ読出し処理
		 *
		 * @return Struct結果リスト
		 * @param stmt PreparedStatementインスタンス
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public List read(PreparedStatement stmt, AZ0060010Struct data) throws FoundationException, SQLException
		{
			ResultSet rs=executeQuery(stmt, data);

			try {
				List list=new ArrayList();

				while((data=next(rs))!=null) {
					list.add(data);
				}

				return list;
			} finally {
				rs.close();
				rs = null;
			}
		}

		/**
		 * クエリーのprepare処理
		 *
		 * @return PreparedStatementインスタンスを返します
		 * @param conn Native Connectionインスタンス
		 * @param query SQL文字列
		 * @param data Structクラスインスタンス
		 * @exception <<コメントを記述してください>>
		 */
		public PreparedStatement prepare(Connection conn, String query, AZ0060010Struct data) throws FoundationException, SQLException
		{
			PreparedStatement stmt;
			Vector ary=new Vector();
			String dyn_query;
			boolean isNull=false;

			try {
				ary.addElement(data.geth_KEY1());
				if(isNull(data.geth_KEY1())) isNull = true;
				ary.addElement(data.geth_VALUE1());
				if(isNull(data.geth_VALUE1())) isNull = true;
				ary.addElement(data.geth_TABLE_NAME());
				if(isNull(data.geth_TABLE_NAME())) isNull = true;
				ary.addElement(data.geth_PROC_TYP());
				if(isNull(data.geth_PROC_TYP())) isNull = true;

				// 静的SQL文の生成
				stmt = conn.prepareStatement(query);

			} finally {
				ary.removeAllElements();
				ary = null;
			}

			return stmt;
		}

		/**
		 * データ読出し処理
		 *
		 * @exception <<コメントを記述してください>>
		 */
		public ResultSet executeQuery(PreparedStatement stmt, AZ0060010Struct data) throws FoundationException, SQLException
		{
			int no=1;

			// 静的SQL文の生成
			setString(no ++, data.geth_KEY1(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_VALUE1(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_TABLE_NAME(), stmt);
			// 静的SQL文の生成
			setString(no ++, data.geth_PROC_TYP(), stmt);

			return stmt.executeQuery();
		}

		/**
		 * レコードデータをStructに格納して返します
		 */
		public AZ0060010Struct next(ResultSet rs) throws FoundationException, SQLException
		{
			if(rs.next()==false) return null;

			AZ0060010Struct data = new AZ0060010Struct();

			data.seth_APPR_ID( getString(1, rs) );

			return data;
		}
	}
	
	// null文字列、空白文字列の場合にtrueを返します
	public boolean isNull(Object obj) {
		return (obj == null || obj.toString().length() == 0 ? true : false);
	}

	/**
	 * AZ0060010クラスの標準コンストラクタ
	 */
	public AZ0060010Common() throws FoundationException {
		return;
	}
}
