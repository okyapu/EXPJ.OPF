/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/Numbering.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import com.nec.jp.orteus.xaf.util.FoundationException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 採番を行うクラス
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.4 $ $Date: 2013/06/27 02:53:18 $
 */
public class Numbering {

	/**
	 * 作業計画番号採番キー
	 */
	static final public int ODR_CD = 1;

	/**
	 * 作業指示番号採番キー
	 */
	static final public int INST_CD = ODR_CD + 1;

	/**
	 * 発注番号採番キー
	 */
	static final public int PUCH_CD = INST_CD + 1;

	/**
	 * 出庫指示番号採番キー
	 */
	static final public int ISS_INST_CD = PUCH_CD + 1;

	/**
	 * 入出庫番号採番キー
	 */
	static final public int ISSUE_CD = ISS_INST_CD + 1;

	/**
	 * 出来高実績番号採番キー
	 */
	static final public int OUT_RSLT_CD = ISSUE_CD + 1;

	/**
	 * 負荷識別番号採番キー
	 */
	static final public int LOAD_CD = OUT_RSLT_CD + 1;

	/**
	 * 計画識別番号採番キー
	 */
	static final public int LOAD_PLAN_CD = LOAD_CD + 1;

	/**
	 * 構成区別キー採番キー
	 */
	static final public int LOAD_PS_CD = LOAD_PLAN_CD + 1;

	/**
	 * 有償支給番号採番キー
	 */
	static final public int ONERCONS_CD = LOAD_PS_CD + 1;

	/**
	 * 積送伝票番号採番キー
	 */
	static final public int TRANSLIP_CD = ONERCONS_CD + 1;

	/**
	 * 製番採番キー
	 */
	static final public int JOB_OD_CD = TRANSLIP_CD + 1;

	/**
	 * LOG識別番号採番キー
	 */
	static final public int LOG_CD = JOB_OD_CD + 1;

	/**
	 * オーダデマンド番号採番キー
	 */
	static final public int ODNO = LOG_CD + 1;

	/**
	 * 製番引当管理番号採番キー
	 */
	static final public int JOB_OD_ALC_CD = ODNO + 1;

	/**
	 * クエリー番号採番キー
	 */
	static final public int QUERY_CD = JOB_OD_ALC_CD + 1;

	/**
	 * 外部計画番号採番キー
	 */
	static final public int EXTERNAL_PLAN_CD = QUERY_CD + 1;

	/**
	 * 出荷伝票番号採番キー
	 */
	static final public int SLIP_CD = EXTERNAL_PLAN_CD + 1;

	/**
	 * 出荷指示番号採番キー
	 */
	static final public int SHIP_ODR_NO = SLIP_CD + 1;

	/**
	 * 原価一括登録エラー番号採番キー
	 */
	static final public int CS_ERROR_CD = SHIP_ODR_NO + 1;

	/**
	 * 最大
	 */
	static final public int MAX = CS_ERROR_CD;

	protected int collectKey = 0;
	protected String userCd = null;
	protected String businessCd = null;
	protected String plantCd = null;
	protected String logMode = null;
	protected String outPutMode = null;
	protected String outPutPath = null;
	protected String outPutName = null;
	protected Integer resultStatus = null;
	protected SystemLog sysLog = null;
	protected IDbConnection conn = null;

	/**
	 * コンストラクタ
	 * @param  conn         DBコネクション
	 * @param  collectKey   採番キー
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	 */
	public Numbering(IDbConnection conn, int collectKey, String userCd,
					 String businessCd, String plantCd) throws
		FoundationException {
		this.conn = conn;
		this.collectKey = collectKey;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;

		this.readProperty();
	}

	/**
	 * 採番した番号を返却します。（SP部品使用）
	 *
	 * @return	採番された番号を返却します。採番されなかった場合は、null を返却します。
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public String getNo() throws FoundationException {
		//引数チェック
		if (collectKey < 1 || collectKey > this.MAX || this.userCd == null ||
			this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}

		this.resultStatus = null;
		String returnNo = null;

		IDbAdapter adapt = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode); //LOGモード
			adapt.setString(2, this.outPutMode); //出力モード
			adapt.setString(3, this.outPutPath); //出力ファイルパス
			adapt.setString(4, this.outPutName); //出力ファイル名
			adapt.setString(5, this.userCd); //ユーザID
			adapt.setString(6, this.businessCd); //業務名
			adapt.setString(7, this.plantCd); //工場コード
			adapt.setOutString(8); //採番結果
			adapt.setOutInteger(9); //採番結果

			adapt.execUpdate();

			returnNo = adapt.getOutString(8);
			this.resultStatus = adapt.getOutInteger(9);

		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return returnNo;
	}

	/**
	 * IDbAdapterを返却します
	 *
	 * @param  conn IDbConnection
	 * @return	collectKeyによりIDbAdapterを取得
	 * @throws FoundationException
	 */
	private IDbAdapter getAdapt(IDbConnection conn) throws FoundationException {

		//collectKeyによりSP部品の呼び出しを切り分ける
		switch (this.collectKey) {
			case ODR_CD: //作業計画
				return conn.getSpAdapter("begin SQLGETNEWODRCD(?,?,?,?,?,?,?,?,?); end;");
			case INST_CD: //作業指示
				return conn.getSpAdapter("begin SQLGETNEWINSTCD(?,?,?,?,?,?,?,?,?); end;");
			case PUCH_CD: //発注番号
				return conn.getSpAdapter("begin SQLGETNEWPUCHCD(?,?,?,?,?,?,?,?,?); end;");
			case ISS_INST_CD: //出庫指示
				return conn.getSpAdapter("begin SQLGETNEWISSINSTCD(?,?,?,?,?,?,?,?,?); end;");
			case ISSUE_CD: //入出庫
				return conn.getSpAdapter("begin SQLGETNEWISSUECD(?,?,?,?,?,?,?,?,?); end;");
			case OUT_RSLT_CD: //出来高実績
				return conn.getSpAdapter("begin SQLGETNEWOUTRSLTCD(?,?,?,?,?,?,?,?,?); end;");
			case LOAD_CD: //負荷識別
				return conn.getSpAdapter("begin SQLGETNEWLOADCD(?,?,?,?,?,?,?,?,?); end;");
			case LOAD_PLAN_CD: //計画識別
				return conn.getSpAdapter("begin SQLGETNEWLOADPLANCD(?,?,?,?,?,?,?,?,?); end;");
			case LOAD_PS_CD: //計画識別
				return conn.getSpAdapter("begin SQLGETNEWLOADPSCD(?,?,?,?,?,?,?,?,?); end;");
			case ONERCONS_CD: //有償支給
				return conn.getSpAdapter("begin SQLGETNEWONERCONSCD(?,?,?,?,?,?,?,?,?); end;");
			case TRANSLIP_CD: //積送伝票
				return conn.getSpAdapter("begin SQLGETNEWTRANSLIPCD(?,?,?,?,?,?,?,?,?); end;");
			case JOB_OD_CD: //製番
				return conn.getSpAdapter("begin SQLGETNEWJOBODRCD(?,?,?,?,?,?,?,?,?); end;");
			case LOG_CD: //LOG識別番号
				return conn.getSpAdapter("begin SQLGETNEWLOGCD(?,?,?,?,?,?,?,?,?); end;");
			case ODNO: //オーダデマンド
				return conn.getSpAdapter("begin SQLGETNEWODNO(?,?,?,?,?,?,?,?,?); end;");
			case JOB_OD_ALC_CD: //製番引当
				return conn.getSpAdapter("begin SQLGETNEWJOBODRALCD(?,?,?,?,?,?,?,?,?); end;");
			case QUERY_CD: //クエリー番号
				return conn.getSpAdapter("begin SQLGETNEWQUERYCD(?,?,?,?,?,?,?,?,?); end;");
			case EXTERNAL_PLAN_CD: //外部計画番号
				return conn.getSpAdapter("begin SQLGETNEWEXTPLANCD(?,?,?,?,?,?,?,?,?); end;");
			case SLIP_CD: //出荷伝票番号
				return conn.getSpAdapter("begin SQLGETNEWSLIPCD(?,?,?,?,?,?,?,?,?); end;");
			case SHIP_ODR_NO: //出荷指示番号
				return conn.getSpAdapter("begin SQLGETNEWSHIPODRNO(?,?,?,?,?,?,?,?,?); end;");
			case CS_ERROR_CD: //原価一括登録エラー番号
				return conn.getSpAdapter("begin SQLGETNEWCSERRORCD(?,?,?,?,?,?,?,?,?); end;");
			default:
				throw new FoundationException("Numbering", "getAdapt", "(SBM0855)定義されていない採番キーがセットされました。");
		}
	}

	/**
	 * LOG出力情報をプロパティファイルから読み込みます
	 */
	private void readProperty() throws FoundationException {
		try {
			ResourceBundle rb = SystemConfig.getBundle();
			this.logMode = SystemConfig.getProperty("LOG_MODE", rb);
			this.outPutMode = SystemConfig.getProperty("OUTPUT_MODE", rb);
			this.outPutPath = SystemConfig.getProperty("OUTPUT_PATH", rb);
			this.outPutName = SystemConfig.getProperty("OUTPUT_NAME", rb);
		}
		catch (MissingResourceException mre) {
			FoundationException fe = new FoundationException("Numbering",
				mre.getMessage(), "(SBM0854)プロパティファイルの読み込みに失敗しました。");
			fe.setPreviousException(mre);
			throw fe;
		}
	}

	/**
	 * 処理結果を取得します
	 * @return	採番結果のステータスを取得
	 */
	public Integer getResultStatus() {
		return this.resultStatus;
	}

	/**
	 * 採番体系をチェックします（現状は製番のみ対応）
	 *
	 * @param	conn         DBコネクション
	 * @param	collectKey   採番キー
	 * @param	plantCd      工場コード
	 * @param	number       チェック対象番号
	 * @return	チェックOKならばtrue、NGならばfalse
	 * @throws FoundationException
	 */
	public static boolean checkNumber(IDbConnection conn, int collectKey,
									  String plantCd, String number) throws
		FoundationException {
		if (plantCd == null || number == null) {
			return false;
		}
		try {
			switch (collectKey) {
				case JOB_OD_CD:
					return checkJOB_OD_CD(conn, plantCd, number);
				default:
					throw new FoundationException("Numbering", "checkNumber",
												  "(SBM0856)採番キーが不正です");
			}
		}
		catch (SQLException e) {
			FoundationException fe = new FoundationException("Numbering",
				"checkNumber", "(SBM0857)体系チェック時にDBエラーが発生しました");
			fe.setPreviousException(e);
			throw fe;
		}
	}

	/**
	 * 製番体系をチェックします
	 *
	 * @param  conn         DBコネクション
	 * @param  plantCd      工場コード
	 * @param  number       製番
	 * @return         チェックOKならばtrue、NGならばfalse
	 * @throws FoundationException,SQLException
	 */
	public static boolean checkJOB_OD_CD(IDbConnection conn, String plantCd,
										 String number) throws
		FoundationException, SQLException {
		String query = "select length(JOB_OD_CD) as LENGTH,JOB_OD_CD_PREFIX AS PREFIX from SYS_JOB_ODR_CD_CTRL ";
		query = query + "WHERE PLANT_CD=?";

		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.getConn().prepareStatement(query);
			stmt.setString(1, plantCd);
			rs = stmt.executeQuery();
			if (!rs.next()) {
				return false;
			}
			int strLength = rs.getInt("LENGTH"); //番号の桁数
			String prefix = rs.getString("PREFIX"); //PREFIX

			if (plantCd == null || prefix == null) {
				return false;
			}

			//工場コードが1桁の場合"_"を付加する
			if (plantCd.length() == 1) {
				plantCd = "_" + plantCd;
			}

			//対象番号の桁数チェック
			if (number.length() !=
				prefix.length() + plantCd.length() + strLength) {
				return false;
			}

			String numberPrefix = number.substring(0, prefix.length());
			//プレフィックスチェック
			if (!prefix.equals(numberPrefix)) {
				return false;
			}

			//工場コードチェック
			int index = prefix.length();
			String numberPlantCd = number.substring(index,
				index + plantCd.length());
			if (!plantCd.equals(numberPlantCd)) {
				return false;
			}
		}
		finally {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		}
		return true;
	}

	/**
	 * 採番体系をチェックします（現状は製番のみ対応）
	 *
	 * @param  conn         DBコネクション
	 * @param  collectKey   採番キー
	 * @param  number       チェック対象番号
	 * @return         チェックOKならばtrue、NGならばfalse
	 * @throws FoundationException
	 */
	public static boolean checkNumber(IDbConnection conn, int collectKey,
									  String number) throws FoundationException {
		if (number == null) {
			return false;
		}
		try {
			switch (collectKey) {
				case JOB_OD_CD: //製番
					return checkJOB_OD_CD(conn, number);
				default:
					throw new FoundationException("Numbering", "checkNumber",
												  "(SBM0856)採番キーが不正です");
			}
		}
		catch (SQLException e) {
			FoundationException fe = new FoundationException("Numbering",
				"checkNumber", "(SBM0857)体系チェック時にDBエラーが発生しました");
			fe.setPreviousException(e);
			throw fe;
		}
	}

	/**
	 * 製番体系をチェックします
	 *
	 * @param  conn         DBコネクション
	 * @param  number       製番
	 * @return         チェックOKならばtrue、NGならばfalse
	 * @throws FoundationException,SQLException
	 */
	public static boolean checkJOB_OD_CD(IDbConnection conn, String number) throws
		FoundationException, SQLException {
		String query = "select PLANT_CD,length(JOB_OD_CD) as LENGTH,JOB_OD_CD_PREFIX AS PREFIX from SYS_JOB_ODR_CD_CTRL";

		IDbAdapter adapt = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		boolean checkNumber = false;
		try {
			stmt = conn.getConn().prepareStatement(query);
			rs = stmt.executeQuery();

			while (!checkNumber && rs.next()) {
				String plantCd = rs.getString("PLANT_CD");
				int strLength = rs.getInt("LENGTH"); //番号の桁数
				String prefix = rs.getString("PREFIX"); //PREFIX

				if (plantCd == null || prefix == null) {
					continue;
				}

				//工場コードが1桁の場合"_"を付加する
				if (plantCd.length() == 1) {
					plantCd = "_" + plantCd;
				}

				//対象番号の桁数チェック
				if (number.length() !=
					prefix.length() + plantCd.length() + strLength) {
					continue;
				}

				String numberPrefix = number.substring(0, prefix.length());
				//プレフィックスチェック
				if (!prefix.equals(numberPrefix)) {
					continue;
				}

				//工場コードチェック
				int index = prefix.length();
				String numberPlantCd = number.substring(index,
					index + plantCd.length());
				if (!plantCd.equals(numberPlantCd)) {
					continue;
				}

				checkNumber = true;
			}
		}
		finally {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		}
		return checkNumber;
	}
}
