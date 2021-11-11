/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/WhAutoIssueProc.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.lot.LotStock;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.mst.ConsUnitCost;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.expj.util.PrivateConfig;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * <pre>
 *   自動出庫、およびマニュアル・キット一括出庫のの共通処理を行います。
 *   このクラスは、以下の業務処理から呼び出されます。
 *   　１．作業実績入力
 *   　２．出来高実績入力
 *   　３．受入実績入力、受入実績メンテナンス
 *   　４．キット出庫
 *   　５．マニュアル出庫（一括更新時）
 *  
 *   このクラス内部からは、SQLExceptionが発生する可能性があります。
 * </pre>
 * 
 * @author $Author: geng-jia $
 * @version $Revision: 1.14 $ $Date: 2015/12/23 01:49:56 $
 */

public class WhAutoIssueProc implements RcvIssueConst {

	/** 自動出庫処理区分 1:キット出庫 */
	public final static int RCV_ISSUE_TYP_KIT = 1;

	/** 自動出庫処理区分 2:自動出庫 */
	public final static int RCV_ISSUE_TYP_AUTO = 2;

	/** 自動出庫処理区分 4:マニュアル出庫 */
	public final static int RCV_ISSUE_TYP_MANUAL = 4;

	private IDbConnection _iconn; // トランザクションコネクション情報

	private Connection _conn; // コネクション情報

	private String _plantCd; // 工場コード

	private UpdateInfo _updInfo; // 利用者管理情報(インナークラス)

	private Log _log; // ログ情報(インナークラス)

	private AutoIssueParam gin; // 自動出庫起動パラメータ

	private final static BigDecimal bdZero = new BigDecimal("0");

	// 出庫結果出力用文字列（出庫指示番号）
	private final static String strDtl = "T_ISSUE_INST.ISSUE_INST_CD:";

	private final static String strItem = "品目番号:";

	/**
	 * <pre>
	 *   コンストラクタ
	 *   newするときには下記のパラメータを設定する。
	 *   工場コード,ユーザID,業務名は別途setterで設定し直すことも可能。
	 * </pre>
	 * 
	 * @param conn
	 *            コネクション情報
	 * @param plantCd
	 *            工場コード
	 * @param userId
	 *            ユーザID
	 * @param businessName
	 *            業務名
	 */
	public WhAutoIssueProc(IDbConnection conn, String plantCd, String userId,
			String businessName) {

		_iconn = conn;
		_conn = _iconn.getConn();
		_plantCd = plantCd;
		_updInfo = new UpdateInfo(userId, businessName, 0);

		// ログ用部品の初期化を行う
		String className = this.getClass().getName();
		className = className.substring(0, className.lastIndexOf("."));
		_log = new Log(className, _iconn);
	}

	// ----------------------------------------------------
	// 公開メソッド
	// ----------------------------------------------------
	/**
	 * <pre>
	 *   【保管区自動出庫処理】
	 *    指定された出庫指示情報について自動出庫を行います。
	 *   　出庫元の品目在庫、製番在庫の選択、および出庫元保管区の選択を
	 *   　自動判定して出庫を行います。（みなし出庫）
	 * </pre>
	 * 
	 * @param inParam
	 *            自動出庫起動パラメータ
	 * 
	 * <pre>
	 *     m_WORK_ODR_CD			  作業計画番号
	 *     m_WORK_IN_PROC_CD		  作業コード
	 *     m_PARTIAL_PRD_NO		  分作回数
	 *     m_OPR_RSLT_CRCT_NO		  作業実績訂正回数
	 *     m_PUCH_ODR_CD			  発注番号
	 *     m_ACPT_NO				  受入回数
	 *     m_ACPT_RSLT_CRCT_NO	  受入訂正回数
	 *     m_RCV_ISSUE_TYP		  自動出庫処理区分
	 *     m_RCV_ISSUE_DATE		  出庫年月日
	 *     m_RCV_ISSUE_RSLT_NO	  処理対象実績数
	 *     m_RCV_ISSUE_CMPLT_FLG	  出庫完了フラグ
	 *     m_PLANT_CD				  工場コード
	 * </pre>
	 * 
	 * @param iIssueInstStruct
	 *            出庫指示情報
	 * @return true;正常終了（警告メッセージ有りの場合も含む）、 false エラーあり
	 * 
	 * <pre>
	 *            メッセージコードリスト形式:  String[]のList 
	 *                                         String[0]--&gt; メッセージコード
	 *                                         String[1]--&gt; メッセージ詳細（品目コード）
	 * </pre>
	 * 
	 * @throws SQLException
	 * @throws FoundationException
	 */

	public boolean exec(AutoIssueParam inParam, IssueInstStruct iIssueInstStruct)
			throws SQLException, FoundationException {

		BigDecimal dIssueNO;
		BigDecimal dRC;
		BigDecimal dRC1;
		BigDecimal dAutoIssueNo;

		List l_WH = null; // 品目ごとの出庫元保管区リスト
		boolean ret = false; // 出庫処理結果

		try {
			_log.methodStart();

			// 起動パラメータを退避
			gin = inParam;

			/* DEBUG */_log.message("(SBM0451) 作業計画番号(引数)=[" + gin.m_WORK_ODR_CD + "]");
			/*
			 * _log.message("作業コード=["+gin.m_WORK_IN_PROC_CD+"]");
			 * _log.message("分作回数=["+gin.m_PARTIAL_PRD_NO+"]");
			 * _log.message("作業実績訂正回数=["+gin.m_OPR_RSLT_CRCT_NO+"]");
			 * _log.message("発注番号=["+gin.m_PUCH_ODR_CD+"]");
			 * _log.message("受入回数=["+gin.m_ACPT_NO+"]");
			 * _log.message("受入訂正回数=["+gin.m_ACPT_RSLT_CRCT_NO+"]");
			 * _log.message("自動出庫処理区分=["+gin.m_RCV_ISSUE_TYP+"]");
			 * _log.message("出庫年月日=["+gin.m_RCV_ISSUE_DATE+"]");
			 * _log.message("処理対象実績数=["+gin.m_RCV_ISSUE_RSLT_NO+"]");
			 * _log.message("出庫完了フラグ=["+gin.m_RCV_ISSUE_CMPLT_FLG+"]");
			 * _log.message("工場コード=["+gin.m_PLANT_CD+"]");
			 */

			// 入力パラメータチェック
			if (gin.m_PUCH_ODR_CD == null || gin.m_PUCH_ODR_CD.equals("")) {
				if (gin.m_OPR_RSLT_CRCT_NO < 0) {
					_log.message("(SBM0883) 作業実績訂正回数=[" + gin.m_OPR_RSLT_CRCT_NO
							+ "] が不正なので、" + "処理を終了します。");
					IllegalArgumentException e = new IllegalArgumentException(
							this.getClass().getName());
					throw e;

				}
				;
			} else {
				if (gin.m_ACPT_RSLT_CRCT_NO < 0) {
					_log.message("(SBM0884) 受入訂正回数=[" + gin.m_ACPT_RSLT_CRCT_NO
							+ "] が不正なので、" + "処理を終了します。");
					IllegalArgumentException e = new IllegalArgumentException(
							this.getClass().getName());
					throw e;
				}
				;
			}

			// 出庫対象品目情報の取り出し
			IssueInstStruct stII = iIssueInstStruct;

			// その品目の「自動出庫数」を取得
			dAutoIssueNo = stII.m_AUTO_ISSUE_QTY;
			/* DEBUG */_log.message("(SBM0909) 自動出庫数=[" + dAutoIssueNo + "]");

			// 「自動出庫数」がZeroのとき
			if (dAutoIssueNo.compareTo(bdZero) == 0) {
				// [保管区別入出庫]へ追加 & 出庫処理
				ret = issue_AT_ZERO(stII);
				/* DEBUG */_log.message("((SBM0848) ゼロ出庫しました)issue_AT_ZERO");
			} else {

				// 品目ごとの出庫元保管区リストを取得
				l_WH = ValidateWh.getAutoIssue(_iconn, stII.m_PLANT_CD, stII.m_ITEM_CD);

				if (l_WH.size() == 0) {
					setErrorList("AD10003", stII.m_ISSUE_INST_CD);
					ret = false;
				} else {
					ret = true;
				}

				if (ret) {
					/* DEBUG */_log.message("(SBM0910) 出庫品目の品目手配区分=["
							+ stII.m_MRP_ODR_TYP + "]");
					switch (stII.m_MRP_ODR_TYP) { // 品目手配区分
					case 1: // 「製番品目」の場合
						ret = issueProcForJobOdr(stII, l_WH);
						break;

					case 2: // 「在庫引当型製番品目」の場合
						ret = issueProcForJobOdrAlc(stII, l_WH);
						break;

					case 3:
						break;

					default: // 「ＭＲＰ品目」である場合
						/*
						 * 出庫品目の品目手配区分が １(製番品目)、２(在庫引当型製番品目)、３(欠番) 以外であるとき
						 */
						// 自動出庫数を全て出庫するまで
						// 【ＭＲＰ品の払出保管区の順序】で出庫
						dRC = commonMRP(stII, dAutoIssueNo, l_WH, 1);
						if (dRC == null) {
							ret = false;
						} else {
							ret = true;
						}
						break;
					}
				}
			}
			_log.methodEnd();
		} finally {
		}

		return ret;
	}

	// -------------------------------------------------------
	// 非公開メソッド
	// -------------------------------------------------------
	/**
	 * 製番品目の自動出庫処理
	 */
	private boolean issueProcForJobOdr(IssueInstStruct iIssueInstStruct,
			List iWhList) throws SQLException, FoundationException {
		_log.methodStart();
		BigDecimal dIssueNO;
		BigDecimal dRC;

		IssueInstStruct stII = iIssueInstStruct;
		dIssueNO = stII.m_AUTO_ISSUE_QTY;

		// [所要量]を検索（出庫可能数、製番情報を取得）
		IssueRemain sIssueRemain = new IssueRemain(_iconn);
		IssueRemain.ResultByOd w_ret = sIssueRemain
				.getRemainQtyByOd(stII.m_OD_NO);
		stII.m_JOB_ODR_CD = w_ret.jobOdrCd; // [所要量].製番
		stII.m_JOB_ODR_DETAIL_NO = w_ret.jobOdrDetailNo; // [所要量].製番枝番

		// *******************************************************
		// 1.個別手配分出庫可能数の算出
		dRC = issue_BY_ODR(stII, dIssueNO, iWhList, w_ret);
		if (dRC == null) {
			return false;
		}
		/* DEBUG */_log.message("(SBM0911) 個別手配分出庫数=[" + dRC + "]");
		dIssueNO = dIssueNO.subtract(dRC);

		// *******************************************************
		// 2.製番引当分出庫可能数（同一製番）の算出
		/* DEBUG */_log.message("(SBM0913) 出庫要求数（製番引当分出庫可能数（同一製番））=[" + dIssueNO + "]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_JOBALC_SAME(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 3.製番引当分出庫可能数（他製番）の算出
		/* DEBUG */_log.message("(SBM0914) 出庫要求数（製番引当分出庫可能数（他製番））=[" + dIssueNO + "]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_JOBALC_OTHER(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}
		// *******************************************************
		// 4.在庫引当分出庫可能数の算出
		/* DEBUG */_log.message("(SBM0915) 出庫要求数（在庫引当分出庫可能数）=[" + dIssueNO + "]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_ITEMALC(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 5. 個別手配分(余剰在庫)からの出庫 残数全てを割り当てる
		/* DEBUG */_log.message("(SBM0911) 個別手配分出庫数=[" + dRC + "]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			// 自動出庫数を全て出庫するまで【製番品の払出保管区の順序】で出庫
			dRC = commonJOBODR(stII, stII.m_JOB_ODR_CD,
					stII.m_JOB_ODR_DETAIL_NO, iWhList, dIssueNO, true);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		/* DEBUG */_log.message("(SBM0916) 出庫残数=[" + dIssueNO + "] *** ０でない場合は異常です");
		_log.methodEnd();
		return true;
	}

	/**
	 * 在庫引当型製番品目の自動出庫処理
	 * 
	 * @return
	 */
	private boolean issueProcForJobOdrAlc(IssueInstStruct iIssueInstStruct,
			List iWhList) throws SQLException, FoundationException {
		_log.methodStart();

		BigDecimal dIssueNO;
		BigDecimal dRC;

		IssueInstStruct stII = iIssueInstStruct;
		dIssueNO = stII.m_AUTO_ISSUE_QTY;

		// [所要量]から情報取得
		// [所要量]を検索（出庫可能数、製番情報を取得）
		IssueRemain sIssueRemain = new IssueRemain(_iconn);
		IssueRemain.ResultByOd w_ret = sIssueRemain
				.getRemainQtyByOd(stII.m_OD_NO);
		stII.m_JOB_ODR_CD = w_ret.jobOdrCd; // [所要量].製番
		stII.m_JOB_ODR_DETAIL_NO = w_ret.jobOdrDetailNo; // [所要量].製番枝番

		// *******************************************************
		// 1. 個別手配分出庫可能数の算出
		dRC = issue_BY_ODR(stII, dIssueNO, iWhList, w_ret);
		if (dRC == null) {
			return false;
		}
		// _log.message("個別手配分出庫数=["+dRC+"]");
		dIssueNO = dIssueNO.subtract(dRC);

		// *******************************************************
		// 2. 製番引当分出庫可能数（同一製番）の算出
		// _log.message("出庫要求数（製番引当分出庫可能数（同一製番））=["+dIssueNO+"]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_JOBALC_SAME(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 3. 製番引当分出庫可能数（他製番）の算出
		// DEBUG
		// _log.message("出庫要求数（製番引当分出庫可能数（他製番））=["+dIssueNO+"]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_JOBALC_OTHER(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 4. 在庫引当分出庫可能数の算出
		// DEBUG
		// _log.message("出庫要求数（在庫引当分出庫可能数）=["+dIssueNO+"]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_ITEMALC(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 5. 個別手配分（余剰在庫）からの出庫
		// 出庫可能数の算出 手持在庫の範囲内で割り当てる
		// DEBUG
		// _log.message("出庫要求数（個別手配分（再）出庫可能数）=["+dIssueNO+"]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_ODR_REMAIN(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			}
			dIssueNO = dIssueNO.subtract(dRC);
		}

		// *******************************************************
		// 6. 品目在庫(余剰在庫)からの出庫
		// 出庫残数すべてを割り当てる
		/* DEBUG */_log.message("(SBM0917) 出庫要求数（品目余剰在庫からの出庫要求数）=[" + dIssueNO + "]");
		if (dIssueNO.compareTo(bdZero) > 0) {
			dRC = issue_BY_ITEM_REMAIN(stII, dIssueNO, iWhList);
			if (dRC == null) {
				return false;
			} else {
				setWarnList("AD60002", stII.m_ITEM_CD);
				// 業務メッセージテーブルへの出力
				outBusinessMessage("AD60003", strItem + "[" + stII.m_ITEM_CD
						+ "]");
			}
		}
		/* DEBUG */_log.message("(SBM0912) 品目余剰在庫からの出庫数=[" + dRC + "]");
		_log.methodEnd();
		return true;
	}

	/**
	 * 「処理対象実績数」がZeroのとき、[保管区別入出庫]にレコードを追加します。
	 * 
	 * @param iInIndex
	 * @return String 登録した[保管区別入出庫]の入出庫管理番号
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private boolean issue_AT_ZERO(IssueInstStruct iIssueInstStruct)
			throws SQLException, FoundationException {
		String strOdrCd = "";
		IssueProcess wIssueProcess; // 出庫処理のオブジェクト
		boolean ret; // 出庫処理結果
		boolean ret_issue = false; // ゼロ出庫処理結果
		String MsgCd = null;

		try {
			_log.methodStart();

			IssueInstStruct stII = iIssueInstStruct;

			// 登録データの設定
			RcvIssueStruct sData = new RcvIssueStruct();

			sData.m_RCV_ISSUE_TYP = 2; // 入出庫区分
			sData.m_ITEM_CD = stII.m_ITEM_CD; // 品目番号
			sData.m_PLANT_CD = stII.m_PLANT_CD; // 工場コード
			sData.m_WH_CD = null; // 保管区コード
			sData.m_JOB_ODR_CD = null; // 製番
			sData.m_JOB_ODR_DETAIL_NO = 0; // 製番枝番
			sData.m_PUCH_ODR_CD = stII.m_PUCH_ODR_CD; // 発注番号
			sData.m_ACPT_NO = gin.m_ACPT_NO; // 受入回数
			sData.m_ACPT_RSLT_CRCT_NO = gin.m_ACPT_RSLT_CRCT_NO; // 受入実績訂正回数
			sData.m_INSPEC_RSLT_CRCT_NO = 0; // 検査実績訂正回数
			sData.m_WORK_ODR_CD = stII.m_WORK_ODR_CD; // 作業計画番号
			sData.m_WORK_IN_PROC_CD = stII.m_WORK_IN_PROC_CD; // 仕掛作業コード
			sData.m_PARTIAL_PRD_NO = gin.m_PARTIAL_PRD_NO; // 分作回数
			sData.m_OPR_RSLT_CRCT_NO = gin.m_OPR_RSLT_CRCT_NO; // 作業実績訂正回数
			sData.m_ISSUE_INST_CD = stII.m_ISSUE_INST_CD; // 出庫指示番号
			sData.m_RCV_ISSUE_QTY = bdZero; // 入出庫数
			sData.m_RCV_ISSUE_AMOUNT = bdZero; // 入出庫金額
			sData.m_RCV_ISSUE_DATE = Converter.strToDate(gin.m_RCV_ISSUE_DATE,
					Converter.SLASH_DATE); // 入出庫年月日
			sData.m_RCV_ISSUE_GNR_TYP = 21; // 入出庫発生区分
			sData.m_RCV_ISSUE_ODD_QTY = bdZero; // 入出庫端数
			sData.m_DEFECT_CAUSE_CD = null; // 入出庫不良理由コード
			sData.m_STOCK_UPD_TYP = 2; // 在庫更新区分
			sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG; // 入出庫完了フラグ
			sData.m_OD_NO = stII.m_OD_NO; // オーダデマンド番号
			sData.m_VEND_LOT_NO = gin.m_VEND_LOT_NO; // メーカロット番号
			// ---------------------------------------------------------------
			sData.m_RCV_ISSUE_COMMENT = ""; // 入出庫備考
			sData.m_COMPANY_CD = SystemInformation.getSysMyCompanyCd(_iconn);// 会社コード
			sData.m_VEND_CD = stII.m_VEND_CD; // 取引先コード
			sData.m_CONS_TYP = 0; // 支給区分
			sData.m_CONS_EXEC_DATE = null; // 有償支給実績抽出日

			// << 保管区別入出庫の登録 >>
			RcvIssueEntity sRcvIssueEntity = new RcvIssueEntity(_iconn,
					_updInfo);
			strOdrCd = sRcvIssueEntity.insert(sData);
			if (!strOdrCd.equals("")) {
				sData.m_RCV_ISSUE_CTRL_CD = strOdrCd; // 入出庫管理番号
			}

			// 出庫処理を呼び出し
			_log.message("(SBM0904) 出庫処理を呼び出します(ゼロ出庫)");
			wIssueProcess = new IssueProcess(_iconn, strOdrCd);
			ret = wIssueProcess.execProcess();
			if (ret) {
				// インフォメーションメッセージを保存
				for (Iterator itr = wIssueProcess.getInfoList().iterator(); itr
						.hasNext();) {
					MsgCd = (String) itr.next();
					setInfoList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
				}
				// ワーニングメッセージは保存しない（現在、IssueProxessから返却されていないため）
				ret_issue = true;
			} else {
				_infoList.clear();
				_warnList.clear();
				// エラーメッセージを保存
				for (Iterator itr = wIssueProcess.getErrorList().iterator(); itr
						.hasNext();) {
					MsgCd = (String) itr.next();
					setErrorList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
				}
				ret_issue = false;
			}
			_log.methodEnd();
		} catch (ParseException pe) {
			StackTraceElement e = (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName = e.getMethodName();
			throw new FoundationException(className, methodName,
					"ParseException");
		} finally {
		}
		return ret_issue;
	};

	/**
	 * 
	 * 【ＭＲＰ品の払出保管区の順序】に従って、自動出庫数を満たすまで 各保管区からの出庫処理を実行します。
	 * 
	 * @param iIssueInstStruct
	 *            出庫指示データ
	 * @param dInISSUE_NO
	 *            自動出庫数
	 * @param iWhList
	 *            品目ごとの出庫元保管区リスト
	 * @param iInTyp
	 * @return 実際に出庫した数（全保管区の合計）
	 * @throws SQLException
	 * @throws Exception
	 * @throws
	 * 
	 */

	private BigDecimal commonMRP(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUE_NO, List iWhList, int iInTyp)
			throws SQLException, FoundationException {

		String strOdrCd = "";
		IssueProcess wIssueProcess; // 出庫処理のオブジェクト
		boolean ret; // 出庫処理結果
		int iCount;
		BigDecimal dIssueNO = bdZero;
		BigDecimal dIssueCountTemp = bdZero;
		BigDecimal dTotalIssueCnt = bdZero; // 出庫数（累積）

		String sWH_CD = "";
		// 「品目別保管先優先順位」が最小の保管区、もしくは最小コードの保管区
		String sWH_CD_MIN = "";
		// 最小のロット、もしくは最小コードのロットコード
		String sLOT_NO_MIN = "";

		ItemStock sItemStock;
		BigDecimal bdHandQtr = bdZero; // 保管区毎の手持在庫数

		try {
			_log.methodStart();

			// 出庫指示情報を取得
			IssueInstStruct stII = iIssueInstStruct;
			dIssueNO = dInISSUE_NO;

			// 全保管区共通の登録データ設定 -------------------------------
			RcvIssueStruct sData = new RcvIssueStruct();

			sData.m_RCV_ISSUE_TYP = 2; // 入出庫区分
			sData.m_ITEM_CD = stII.m_ITEM_CD; // 品目番号
			sData.m_PLANT_CD = stII.m_PLANT_CD; // 工場コード
			sData.m_WH_CD = ""; // 保管区コード(★後で保管区別に設定)
			sData.m_JOB_ODR_CD = null; // 製番
			sData.m_JOB_ODR_DETAIL_NO = 0; // 製番枝番
			sData.m_PUCH_ODR_CD = stII.m_PUCH_ODR_CD; // 発注番号
			sData.m_ACPT_NO = gin.m_ACPT_NO; // 受入回数
			sData.m_ACPT_RSLT_CRCT_NO = gin.m_ACPT_RSLT_CRCT_NO; // 受入実績訂正回数
			sData.m_INSPEC_RSLT_CRCT_NO = 0; // 検査実績訂正回数
			sData.m_WORK_ODR_CD = stII.m_WORK_ODR_CD; // 作業計画番号
			sData.m_WORK_IN_PROC_CD = stII.m_WORK_IN_PROC_CD; // 仕掛作業コード
			sData.m_PARTIAL_PRD_NO = gin.m_PARTIAL_PRD_NO; // 分作回数
			sData.m_OPR_RSLT_CRCT_NO = gin.m_OPR_RSLT_CRCT_NO; // 作業実績訂正回数
			sData.m_ISSUE_INST_CD = stII.m_ISSUE_INST_CD; // 出庫指示番号
			sData.m_RCV_ISSUE_QTY = bdZero; // 入出庫数(★後で保管区別に設定)
			sData.m_RCV_ISSUE_AMOUNT = bdZero; // 入出庫金額
			sData.m_RCV_ISSUE_DATE = Converter.strToDate(gin.m_RCV_ISSUE_DATE,
					Converter.SLASH_DATE); // 入出庫年月日
			sData.m_RCV_ISSUE_GNR_TYP = 21; // 入出庫発生区分
			sData.m_RCV_ISSUE_ODD_QTY = bdZero; // 入出庫端数
			sData.m_DEFECT_CAUSE_CD = null; // 入出庫不良理由コード
			sData.m_STOCK_UPD_TYP = 1; // 在庫更新区分
			sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_YET; // 入出庫完了フラグ(★後で保管区別に設定)
			sData.m_OD_NO = stII.m_OD_NO; // オーダデマンド番号
			sData.m_VEND_LOT_NO = gin.m_VEND_LOT_NO; // メーカロット番号
			// ------------------------------------------------------------------------
			sData.m_RCV_ISSUE_COMMENT = ""; // 入出庫備考
			sData.m_COMPANY_CD = SystemInformation.getSysMyCompanyCd(_iconn); // 会社コード
			sData.m_VEND_CD = stII.m_VEND_CD; // 取引先コード
			sData.m_CONS_TYP = stII.m_CONS_TYP; // 支給区分
			sData.m_CONS_EXEC_DATE = null; // 有償支給実績抽出日
			// ------------------------------------------------------------------------

			/* DEBUG */_log.message("(SBM0918) 品目コード=[" + stII.m_ITEM_CD + "]");

			int iLotFlag = getLotFlag(_iconn, stII.m_ITEM_CD);
			/* DEBUG */_log.message("lotfalg=[" + iLotFlag + "]");
			if (iLotFlag == 1) {
				// 出庫品目がロット管理品目である場合
				PrivateConfig pc = new PrivateConfig(_iconn);
				String AUTOISSUE_BEST_BEFORE = pc.getString("AUTOISSUE_BEST_BEFORE");
				LotStock sLotStock = null;
				if (AUTOISSUE_BEST_BEFORE == null) {
					AUTOISSUE_BEST_BEFORE = "0";
				}
				/* DEBUG */_log.message("AUTOISSUE_BEST_BEFORE=["
						+ AUTOISSUE_BEST_BEFORE + "]");
				// 該当保管区の品目在庫を検索
				List LotStockList = null;
				int iLSLCount = 0;
				sLotStock = new LotStock(_iconn);
				LotStock.LotStockStruct LSS = sLotStock.new LotStockStruct();

				System.out.println("stII.m_PLANT_CD = " + stII.m_PLANT_CD);

				LotStockList = sLotStock.getHandQty(stII.m_ITEM_CD, sData.m_RCV_ISSUE_DATE, AUTOISSUE_BEST_BEFORE, stII.m_PLANT_CD);
				if (LotStockList == null) {
					iLSLCount = 0;

				} else {
					iLSLCount = LotStockList.size();
				}
				if (iLSLCount == 0) {
					setErrorList("ZZ20001", stII.m_ISSUE_INST_CD);
					// setWarnList("ZZ20001", strDtl + stII.m_ISSUE_INST_CD);
					_log.message("(SBM0919) 不足の場合エラーZZ20001とする、 かつ　nullを返却");
					return null;
				}
				/* DEBUG */_log.message("iLSLCount=[" + iLSLCount + "]");
				for (int cnt = 0; cnt < iLSLCount; cnt++) {
					LSS = (LotStock.LotStockStruct) LotStockList.get(cnt);
					bdHandQtr = LSS.m_STOCK_ON_HAND_QTY;
					sData.m_WH_CD = LSS.m_WH_CD;
					sData.m_LOT_NO = LSS.m_LOT_NO;
					/* DEBUG */_log.message("sData.m_WH_CD=[" + sData.m_WH_CD
							+ "]");
					/* DEBUG */_log.message("sData.m_LOT_NO=["
							+ sData.m_LOT_NO + "]");
					/* DEBUG */_log.message("bdHandQtr=[" + bdHandQtr + "]");
					// 最初の保管区コードを退避しておく。
					if (sWH_CD_MIN.equals("")) {
						sWH_CD_MIN = sData.m_WH_CD;
					}
					// 最初の保管区コードと最初のロットコードを退避しておく。
					if (sLOT_NO_MIN.equals("")) {
						sLOT_NO_MIN = sData.m_LOT_NO;
					}

					if ((bdHandQtr != null)
							&& (bdHandQtr.compareTo(bdZero) != 0)) {
						// 保管区毎の登録データ設定 ------------------------------
						dIssueCountTemp = bdHandQtr;// 手持在庫数
						if (dIssueCountTemp.compareTo(dIssueNO) >= 0) {
							dIssueCountTemp = dIssueNO;
						}

						sData.m_RCV_ISSUE_QTY = dIssueCountTemp.multiply(new BigDecimal("-1")); // 入出庫数

						// 出庫完了フラグの設定
						if (gin.m_RCV_ISSUE_TYP == RCV_ISSUE_TYP_AUTO) {
							sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG;
						} else {
							if (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE && dIssueNO.subtract(dIssueCountTemp).compareTo(bdZero) == 0) {
								sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE;
							}
						}
						// ------------------------------------------------------

						// << 保管区別入出庫の登録＆出庫処理 ＆有償支給履歴登録 >>
						ret = insert_issue_process(sData, stII);

						if (ret) {
							dTotalIssueCnt = dTotalIssueCnt.add(dIssueCountTemp);
							dIssueNO = dIssueNO.subtract(dIssueCountTemp);
						} else {
							return null;
						}
					}
					if (dIssueNO.compareTo(bdZero) == 0) {
						break;
					}
				}
				// 不足の場合エラーとする（ZZ20001）
				if (dIssueNO.compareTo(bdZero) > 0) {
					/*
					 * DELETE BY SAI 2007/06/16 FOR: IN STOCK LACK START
					 * sData.m_RCV_ISSUE_QTY = dIssueNO.multiply(new BigDecimal(
					 * "-1")); sData.m_WH_CD = sWH_CD_MIN; sData.m_LOT_NO =
					 * sLOT_NO_MIN; // 出庫完了フラグの設定 if (gin.m_RCV_ISSUE_TYP ==
					 * RCV_ISSUE_TYP_AUTO) { sData.m_RCV_ISSUE_CMPLT_FLG =
					 * gin.m_RCV_ISSUE_CMPLT_FLG; } else { if
					 * (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE &&
					 * dIssueNO.subtract(dIssueCountTemp) .compareTo(bdZero) ==
					 * 0) { sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE; } } //
					 * ------------------------------------------------------
					 * 
					 * ret = insert_issue_process(sData, stII); DELETE BY SAI
					 * 2007/06/16 FOR: IN STOCK LACK END
					 */

					// エラーメッセージを保存
					// if (ret) {
					setErrorList("ZZ20001", stII.m_ISSUE_INST_CD);
					// setWarnList("ZZ20001", strDtl + stII.m_ISSUE_INST_CD);
					_log.message("(SBM0919) 不足の場合エラーZZ20001とする、 かつ　nullを返却");
					return null;
					// }
				}
			} else {
				iCount = 0;
				for (Iterator itr = iWhList.iterator(); itr.hasNext();) {
					// 出庫元の保管区コードを取り出す
					sWH_CD = (String) itr.next();

					// 最初の保管区コードを退避しておく。
					if (sWH_CD_MIN.equals("")) {
						sWH_CD_MIN = sWH_CD;
					}

					/* DEBUG */_log.message("iCount=[" + iCount + "]");
					/* DEBUG */_log.message("(SBM0920) 品目別保管先優先順位・保管区コード・sWH_CD=["
							+ sWH_CD + "]");

					// 該当保管区の品目在庫を検索
					sItemStock = new ItemStock(_iconn);
					bdHandQtr = sItemStock.getHandQty(stII.m_ITEM_CD, sWH_CD, 0);

					if ((bdHandQtr != null) && (bdHandQtr.compareTo(bdZero) != 0)) {
						// 保管区毎の登録データ設定 ------------------------------
						sData.m_WH_CD = sWH_CD; // 保管区コード
						dIssueCountTemp = bdHandQtr;// 手持在庫数
						if (dIssueCountTemp.compareTo(dIssueNO) >= 0) {
							dIssueCountTemp = dIssueNO;
						}

						sData.m_RCV_ISSUE_QTY = dIssueCountTemp.multiply(new BigDecimal("-1")); // 入出庫数

						// 出庫完了フラグの設定
						if (gin.m_RCV_ISSUE_TYP == RCV_ISSUE_TYP_AUTO) {
							sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG;
						} else {
							if (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE
									&& dIssueNO.subtract(dIssueCountTemp)
											.compareTo(bdZero) == 0) {
								sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE;
							}
						}
						// ------------------------------------------------------

						// << 保管区別入出庫の登録＆出庫処理 ＆有償支給履歴登録 >>
						ret = insert_issue_process(sData, stII);

						if (ret) {
							iCount++;
							dTotalIssueCnt = dTotalIssueCnt.add(dIssueCountTemp);
							dIssueNO = dIssueNO.subtract(dIssueCountTemp);
						} else {
							return null;
						}
					}
					if (dIssueNO.compareTo(bdZero) == 0) {
						break;
					}
				}

				// すべての保管区から出庫してもまだ出庫残がある場合、
				// 最初の保管区から残数すべてを出庫する。
				if (dIssueNO.compareTo(bdZero) > 0) {
					// DEBUG
					// 20031104 _log.message("品目別保管先優先順位の最小保管区から、出庫");
					// 保管区毎の登録データの設定 ------------------------------
					sData.m_WH_CD = sWH_CD_MIN; // 最小の保管区コード
					sData.m_RCV_ISSUE_QTY = dIssueNO.multiply(new BigDecimal(
							"-1")); // 入出庫数
					// ★

					// 出庫完了フラグの設定
					if (gin.m_RCV_ISSUE_TYP == RCV_ISSUE_TYP_AUTO) {
						sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG;
					} else {
						if (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE) {
							sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE;
						}
					}
					// ------------------------------------------------------------------------------

					// << 保管区別入出庫の登録 >>
					// << 保管区別入出庫の登録＆出庫処理 ＆有償支給履歴登録 >>-----------
					ret = insert_issue_process(sData, stII);

					if (ret) {
						iCount++;
						dTotalIssueCnt = dTotalIssueCnt.add(dIssueNO);
					} else {
						return null;
					}
				}
				_log.methodEnd();
			}

		} catch (ParseException pe) {
			StackTraceElement e = (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName = e.getMethodName();
			throw new FoundationException(className, methodName,
					"ParseException");
		} finally {
		}
		return dTotalIssueCnt;
	}

	/**
	 * 
	 * 【製番品の払出保管区の順序】に従い、指定された出庫可能数を満たすまで 出庫処理を行う。
	 * 
	 * @param iIssueInstStruct
	 *            出庫指示情報
	 * @param iJobOdrCd
	 *            製番（製番在庫を検索するときのキー値）
	 * @param iJobOdrDetailNo
	 *            製番枝番（製番在庫を検索するときのキー値）
	 * @param iWhList
	 *            品目ごとの出庫元保管区リスト
	 * @param dInISSUENO
	 *            自動出庫数
	 * @param chkFlg
	 *             【 ＳＴＥＰ2 】かどうか行う
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private BigDecimal commonJOBODR(IssueInstStruct iIssueInstStruct,
			String iJobOdrCd, int iJobOdrDetailNo, List iWhList,
			BigDecimal dInISSUENO,boolean chkFlg) throws SQLException, FoundationException {

		IssueProcess wIssueProcess; // 出庫処理のオブジェクト
		boolean ret; // 出庫処理結果

		int iCount = 0;
		BigDecimal dIssueNO = bdZero;
		BigDecimal dIssueCountTemp = bdZero;
		BigDecimal dTotalIssueCnt = bdZero;

		JobOdrStock sJobOdrStock; // 製番在庫クラス
		BigDecimal bdHandQtr = bdZero; // 保管区毎の手持在庫数

		String sWH_CD = "";
		String sWH_CD_MIN = ""; // 「品目別保管先優先順位」が最小の保管区コード
		// (または優先順位データがない場合は、最小コードの保管区コード）

		try {
			_log.methodStart();

			// 出庫指示情報を取得
			IssueInstStruct stII = iIssueInstStruct;

			dIssueNO = dInISSUENO;

			// 全保管区共通の登録データ設定 -------------------------------
			RcvIssueStruct sData = new RcvIssueStruct();

			sData.m_RCV_ISSUE_TYP = 2; // 入出庫区分
			sData.m_ITEM_CD = stII.m_ITEM_CD; // 品目番号
			sData.m_PLANT_CD = stII.m_PLANT_CD; // 工場コード
			sData.m_WH_CD = ""; // 保管区コード(★後で保管区別に設定)
			sData.m_JOB_ODR_CD = iJobOdrCd; // 製番
			sData.m_JOB_ODR_DETAIL_NO = 0; // 製番枝番
			sData.m_PUCH_ODR_CD = stII.m_PUCH_ODR_CD; // 発注番号
			sData.m_ACPT_NO = gin.m_ACPT_NO; // 受入回数
			sData.m_ACPT_RSLT_CRCT_NO = gin.m_ACPT_RSLT_CRCT_NO; // 受入実績訂正回数
			sData.m_INSPEC_RSLT_CRCT_NO = 0; // 検査実績訂正回数
			sData.m_WORK_ODR_CD = stII.m_WORK_ODR_CD; // 作業計画番号
			sData.m_WORK_IN_PROC_CD = stII.m_WORK_IN_PROC_CD; // 仕掛作業コード
			sData.m_PARTIAL_PRD_NO = gin.m_PARTIAL_PRD_NO; // 分作回数
			sData.m_OPR_RSLT_CRCT_NO = gin.m_OPR_RSLT_CRCT_NO; // 作業実績訂正回数
			sData.m_ISSUE_INST_CD = stII.m_ISSUE_INST_CD; // 出庫指示番号
			sData.m_RCV_ISSUE_QTY = bdZero; // 入出庫数(★後で保管区別に設定)
			sData.m_RCV_ISSUE_AMOUNT = new BigDecimal(0); // 入出庫金額
			sData.m_RCV_ISSUE_DATE = Converter.strToDate(gin.m_RCV_ISSUE_DATE,
					Converter.SLASH_DATE); // 入出庫年月日
			sData.m_RCV_ISSUE_GNR_TYP = 21; // 入出庫発生区分
			sData.m_RCV_ISSUE_ODD_QTY = bdZero; // 入出庫端数
			sData.m_DEFECT_CAUSE_CD = null; // 入出庫不良理由コード
			sData.m_STOCK_UPD_TYP = 1; // 在庫更新区分
			sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_YET; // 入出庫完了フラグ(★後で保管区別に設定)
			sData.m_OD_NO = stII.m_OD_NO; // オーダデマンド番号
			sData.m_VEND_LOT_NO = gin.m_VEND_LOT_NO; // メーカロット番号
			// ---------------------------------------------------------------
			sData.m_RCV_ISSUE_COMMENT = ""; // 入出庫備考
			sData.m_COMPANY_CD = SystemInformation.getSysMyCompanyCd(_iconn); // 会社コード
			sData.m_VEND_CD = stII.m_VEND_CD; // 取引先コード
			sData.m_CONS_TYP = stII.m_CONS_TYP; // 支給区分
			sData.m_CONS_EXEC_DATE = null; // 有償支給実績抽出日
			// ---------------------------------------------------------------

			/*******************************************************************
			 * 【 ＳＴＥＰ１ 】 出庫元保管区リスト順に出庫する。
			 ******************************************************************/
			for (Iterator itr = iWhList.iterator(); itr.hasNext();) {
				// 出庫元保管区コードを取り出す
				sWH_CD = (String) itr.next();

				// 最初の保管区コードを退避しておく。
				if (sWH_CD_MIN.equals("")) {
					sWH_CD_MIN = sWH_CD;
				}

				// 該当保管区の製番在庫を検索
				sJobOdrStock = new JobOdrStock(_iconn);
				bdHandQtr = sJobOdrStock.getHandQty(iJobOdrCd, iJobOdrDetailNo,
						stII.m_ITEM_CD, sWH_CD, 0);

				if (bdHandQtr != null && bdHandQtr.compareTo(bdZero) != 0) {
					// 保管区毎の登録データ設定----------------------------------
					sData.m_WH_CD = sWH_CD; // 保管区コード
					// 入出庫数 手持在庫数≧自動出庫数 の場合、入出庫数=自動出庫数
					dIssueCountTemp = bdHandQtr;
					if (dIssueCountTemp.compareTo(dIssueNO) >= 0) {
						dIssueCountTemp = dIssueNO;
					}
					sData.m_RCV_ISSUE_QTY = dIssueCountTemp
							.multiply(new BigDecimal("-1"));

					// 出庫完了フラグの設定
					if (gin.m_RCV_ISSUE_TYP == RCV_ISSUE_TYP_AUTO) {
						sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG;
					} else {
						if (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE
								&& dIssueNO.subtract(dIssueCountTemp)
										.compareTo(bdZero) == 0) {
							sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE;
						}
					}
					// ------------------------------------------------------------
					// << 保管区別入出庫の登録＆出庫処理 ＆有償支給履歴登録 >>
					ret = insert_issue_process(sData, stII);

					if (ret) {
						iCount++;
						dTotalIssueCnt = dTotalIssueCnt.add(dIssueCountTemp);
						dIssueNO = dIssueNO.subtract(dIssueCountTemp);
					} else {
						return null;
					}
				}
				if (dIssueNO.compareTo(bdZero) == 0) {
					break;
				}

			}

			/*******************************************************************
			 * 【 ＳＴＥＰ２ 】 すべての保管区から出庫してもまだ出庫残がある場合、 最初の保管区から残数すべてを出庫する。
			 ******************************************************************/
			if (dIssueNO.compareTo(bdZero) > 0 && chkFlg == true) {
				// 保管区毎の登録データの設定-------------------------------------
				sData.m_WH_CD = sWH_CD_MIN; // 保管区コード
				sData.m_RCV_ISSUE_QTY = dIssueNO.multiply(new BigDecimal("-1")); // 入出庫数

				// 出庫完了フラグの設定
				if (gin.m_RCV_ISSUE_TYP == RCV_ISSUE_TYP_AUTO) {
					sData.m_RCV_ISSUE_CMPLT_FLG = gin.m_RCV_ISSUE_CMPLT_FLG;
				} else {
					if (gin.m_RCV_ISSUE_CMPLT_FLG == ISSUE_CMPLT_DONE) {
						sData.m_RCV_ISSUE_CMPLT_FLG = ISSUE_CMPLT_DONE;
					}
				}
				// ------------------------------------------------------------

				// << 保管区別入出庫の登録＆出庫処理 ＆有償支給履歴登録 >>
				ret = insert_issue_process(sData, stII);
				if (ret) {
					iCount++;
					dTotalIssueCnt = dTotalIssueCnt.add(dIssueNO);
				} else {
					return null;
				}
			}
			_log.methodEnd();
		} catch (ParseException pe) {
			StackTraceElement e = (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName = e.getMethodName();
			throw new FoundationException(className, methodName,
					"ParseException");
		}
		return dTotalIssueCnt;
	};

	/**
	 * 
	 * @param sData
	 *            登録する保管区別入出庫データ
	 * @param stII
	 *            出庫指示情報
	 * @return
	 * @throws SQLException
	 * @throws FoundationException
	 */

	private boolean insert_issue_process(RcvIssueStruct sData,
			IssueInstStruct stII) throws SQLException, FoundationException {

		String strOdrCd = "";
		boolean ret;
		// 出庫結果メッセージ
		String MsgCd = null;

		// << 保管区別入出庫の登録 >> ----------------------------
		RcvIssueEntity sRcvIssueEntity = new RcvIssueEntity(_iconn, _updInfo);
		_log.message("LotNo=[" + sData.m_LOT_NO + "]");
		strOdrCd = sRcvIssueEntity.insert(sData);

		if (!strOdrCd.equals("")) {
			sData.m_RCV_ISSUE_CTRL_CD = strOdrCd; // 入出庫管理番号
			// dTotalIssueCnt = dTotalIssueCnt.add(dIssueCountTemp);
			// dIssueNO = dIssueNO.subtract(dIssueCountTemp);
		}

		// 出庫処理を呼び出し
		_log.message("(SBM0902) 出庫処理を呼び出します");
		_log.message("(SBM0700) 入出庫管理番号=[" + strOdrCd + "]");
		IssueProcess wIssueProcess = new IssueProcess(_iconn, strOdrCd);
		ret = wIssueProcess.execProcess();
		_log.message("(SBM0902) 出庫処理を呼び出しますend");

		if (ret) {
			// インフォメーションメッセージを保存
			for (Iterator itr = wIssueProcess.getInfoList().iterator(); itr
					.hasNext();) {
				MsgCd = (String) itr.next();
				setInfoList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
			}
			// ワーニングメッセージは保存しない（現在、IssueProxessから返却されていないため）

		} else {
			_infoList.clear();
			_warnList.clear();
			// エラーメッセージを保存
			for (Iterator itr = wIssueProcess.getErrorList().iterator(); itr
					.hasNext();) {
				MsgCd = (String) itr.next();
				setErrorList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
			}
			_log.message("(SBM0921) 出庫処理 false");
			return false;
		}
		_log.message("(SBM0932) [有償支給履歴]への追加");

		// [有償支給履歴]への追加
		// [出庫指示]."支給区分"=1：有償支給の場合[有償支給履歴]へ追加
		if (stII.m_CONS_TYP == 1) {
			insertPastOnerousCons(stII, sData);
		}
		_log.message("(SBM0933) ロットトレースの登録");
		// 2.9.8.4 ロットトレースの登録
		BizCommon bc = new BizCommon(this._iconn, this._updInfo.getUpdateBy(),
				this._updInfo.getUpdatePrgNm(), this._plantCd);
		List t_list = new ArrayList();
		t_list = getItemcd(gin);
		if (t_list != null && t_list.size() > 2) {
			String sItemcd = (String) t_list.get(0);
			String sLotno = (String) t_list.get(1);
			String LOT_CTRL_FLG = (String) t_list.get(2);
			String lotTraceTyp = "";
			int fromLotTraceTyp = getLotFlag(_iconn, sData.m_ITEM_CD);
			if (LOT_CTRL_FLG != null && LOT_CTRL_FLG.equals("1")
					&& fromLotTraceTyp == 1) {
				/*
				 * 「発注番号」 ＝ Null かつ [作業実績]."出来高実績番号"＝NULLの場合 2:作業実績 「発注番号」 ＝
				 * Null かつ [作業実績]."出来高実績番号"≠NULLの場合 3:出来高実績 「発注番号」 ≠ Nullの場合
				 * 1:受入実績
				 */
				if (StringUtil.Validate(stII.m_PUCH_ODR_CD)) {
					lotTraceTyp = "1";
				} else {
					String OUTPUT_RSLT_CD = (String) t_list.get(3);
					if (StringUtil.Validate(OUTPUT_RSLT_CD)) {
						lotTraceTyp = "3";
					} else {
						lotTraceTyp = "2";
					}
				}
				List temp_list = new ArrayList();
				temp_list = bc.excMakeLotTraceFd(sData.m_ITEM_CD,
						sData.m_LOT_NO, sItemcd, sLotno, lotTraceTyp);
				// if (temp_list.get(0) != null || !temp_list.get(0).equals(""))
				// {
				// return false;
				// }
				//ロットトレース登録・更新処理が成功する
				if (bc.getResultStatus().intValue() != 3) {
					// 元品目番号の発注番号の検索
					String sFromPuchOdrCd = getFromPuchOdrCd(sData.m_ITEM_CD, sData.m_LOT_NO);
					
					// 元品目番号の発注番号 ≠ Null、または、パラメータ「発注番号」 ≠ Nullの場合、ロットトレースの更新を行う
					if ((StringUtil.Validate(sFromPuchOdrCd)) || (StringUtil.Validate(stII.m_PUCH_ODR_CD))) {
						_log.message("(SBM0933) ロットトレースの更新");
						UpdateLotTraceFd(stII, sData.m_ITEM_CD, sData.m_LOT_NO, sFromPuchOdrCd, sItemcd, sLotno, lotTraceTyp);
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * 
	 * [ロットトレース]の更新
	 * 
	 * @param
	 * @param iIssueInstStruct
	 *            出庫指示情報
	 * @param fromItemCd
	 *            元品目コード
     * @param fromLotNo
	 *            元ロット番号
	 * @param fromPuchOdrCd
	 *            元発注番号
	 * @param toItemCd
	 *            先品目コード
     * @param toLotNo
	 *            先ロット番号
	 * @param lotTraceTyp
	 *            区分
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private void UpdateLotTraceFd(IssueInstStruct iIssueInstStruct,String fromItemCd,String fromLotNo,String fromPuchOdrCd,
	String toItemCd,String toLotNo, String lotTraceTyp) throws SQLException,FoundationException {
		
	    PreparedStatement ps = null;
	    String sql = "";
	    int iRC = 0;
	    try {
	        //出庫指示情報を取得
	        IssueInstStruct stII = iIssueInstStruct;
	            //［ロットトレース］の更新を行う。
	            sql	= "	UPDATE T_LOT_TRACE " +
	                  "SET FROM_PUCH_ODR_CD = ? " +
	                  ", TO_PUCH_ODR_CD = ? " +
	                  ", UPDATED_DATE = sysdate " +
	                  ", UPDATED_BY = ? " +
	                  ", UPDATED_PRG_NM = ? " +
	                  ", MODIFY_COUNT = MODIFY_COUNT + 1 " +
	                  " WHERE FROM_ITEM_CD = ?" +
	                  " AND FROM_LOT_NO = ?" +
	                  " AND TO_ITEM_CD = ?" +
	                  " AND TO_LOT_NO = ?" +
	                  " AND LOT_TRACE_TYP = ?";
	            ps = _conn.prepareStatement(sql);
	            ps.setString(1,	fromPuchOdrCd);
	            ps.setString(2,	stII.m_PUCH_ODR_CD);
	            ps.setString(3,	_updInfo.getUpdateBy());
	            ps.setString(4,	_updInfo.getUpdatePrgNm());
	            ps.setString(5,	fromItemCd);
	            ps.setString(6,	fromLotNo);
	            ps.setString(7,	toItemCd);
	            ps.setString(8,	toLotNo);
	            ps.setInt(9,	Integer.parseInt(lotTraceTyp));
	            iRC	= ps.executeUpdate();
	       } finally {
	            if (ps != null) {
	                ps.close();
	            }
	       }
	}

	/**
	 * 
	 * 元品目番号の発注番号の検索
	 * 
	 * @param
	 * @param fromItemCd
	 *            元品目コード
     * @param fromLotNo
	 *            元ロット番号
	 * @return 元発注番号
	 * @throws SQLException
	 * 
	 */
	private String getFromPuchOdrCd(String fromItemCd, String fromLotNo) throws SQLException {
		_log.methodStart();

		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		String sFromPuchOdrCd = null;
		String Sql = "";

		try {
			Sql = "SELECT A.PUCH_ODR_CD"
				+ " FROM T_ACPT_RSLT A"
				+ " WHERE A.ITEM_CD = ?"
				+ " AND A.LOT_NO = ?"
				+ " ORDER BY A.PUCH_ODR_CD DESC, A.ACPT_NO DESC";

			selectStmt = _conn.prepareStatement(Sql);
			selectStmt.setString(1, fromItemCd);
			selectStmt.setString(2, fromLotNo);

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if (selectRslt.next()) {
				// 先頭1件を返却
				sFromPuchOdrCd = selectRslt.getString("PUCH_ODR_CD");
			}
			_log.methodEnd();
			return sFromPuchOdrCd;
		} finally {
			selectRslt.close();
			selectStmt.close();
		}

	}
	
	// 先品目番号の検索
	private List getItemcd(AutoIssueParam AIP) throws SQLException {
		_log.methodStart();

		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		List sList = new ArrayList();
		String Sql = "";
		if (!StringUtil.Validate(AIP.m_PUCH_ODR_CD)) {
			if (!StringUtil.Validate(AIP.m_WORK_IN_PROC_CD)) {
				Sql = "SELECT A.ITEM_CD,A.LOT_NO,B.LOT_CTRL_FLG,A.OUTPUT_RSLT_CD"
						+ " FROM T_OPR_RSLT A,M_ITEM B,T_WORK_IN_PROC_BY_ITEM C"
						+ " WHERE A.ITEM_CD = B.ITEM_CD"
						+ " AND A.PARTIAL_PRD_NO = ?"
						+ " AND A.OPR_INST_CD = C.OPR_INST_CD"
						+ " AND C.WORK_ODR_CD =?";
			} else {
				Sql = "SELECT A.ITEM_CD,A.LOT_NO,B.LOT_CTRL_FLG,A.OUTPUT_RSLT_CD"
						+ " FROM T_OPR_RSLT A,M_ITEM B,T_WORK_IN_PROC_BY_PROC C"
						+ " WHERE A.ITEM_CD = B.ITEM_CD"
						+ " AND A.PARTIAL_PRD_NO = ?"
						+ " AND A.OPR_INST_CD = C.OPR_INST_CD"
						+ " AND C.WORK_IN_PROC_CD =? AND C.WORK_ODR_CD =?";
			}
		} else {
			Sql = "SELECT A.ITEM_CD,C.LOT_NO,B.LOT_CTRL_FLG"
					+ " FROM T_RLSD_PUCH_ODR A,M_ITEM B,T_ACPT_RSLT C"
					+ " WHERE A.ITEM_CD = B.ITEM_CD" + " AND C.ACPT_NO =?"
					+ " AND A.PUCH_ODR_CD =C.PUCH_ODR_CD"
					+ " AND A.PUCH_ODR_CD =?";
		}
		try {
			selectStmt = _iconn.getConn().prepareStatement(Sql);
			if (!StringUtil.Validate(AIP.m_PUCH_ODR_CD)) {
				if (!StringUtil.Validate(AIP.m_WORK_IN_PROC_CD)) {
					selectStmt.setInt(1, AIP.m_PARTIAL_PRD_NO);
					selectStmt.setString(2, AIP.m_WORK_ODR_CD);
				} else {

					selectStmt.setInt(1, AIP.m_PARTIAL_PRD_NO);
					selectStmt.setString(2, AIP.m_WORK_IN_PROC_CD);
					selectStmt.setString(3, AIP.m_WORK_ODR_CD);
				}
			} else {
				selectStmt.setInt(1, AIP.m_ACPT_NO);
				selectStmt.setString(2, AIP.m_PUCH_ODR_CD);
			}

			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if (selectRslt.next()) {

				if (!StringUtil.Validate(AIP.m_PUCH_ODR_CD)) {
					sList.add(0, selectRslt.getString("ITEM_CD"));
					sList.add(1, selectRslt.getString("LOT_NO"));
					sList.add(2, selectRslt.getString("LOT_CTRL_FLG"));
					sList.add(3, selectRslt.getString("OUTPUT_RSLT_CD"));
				} else {
					sList.add(0, selectRslt.getString("ITEM_CD"));
					sList.add(1, selectRslt.getString("LOT_NO"));
					sList.add(2, selectRslt.getString("LOT_CTRL_FLG"));
				}
			}
			_log.methodEnd();
			return sList;
		} finally {
			selectRslt.close();
			selectStmt.close();
		}

	}

	/**
	 * 
	 * 2.10.7.1 個別手配分出庫可能数の算出を行います
	 * 
	 * @param iInIndex
	 *            処理対象品目のindex
	 * @param dInISSUENO
	 *            自動出庫数
	 * @param iWhList
	 *            品目ごとの出庫元保管区リスト
	 * @param iRet
	 *            所要量情報
	 * @return 個別手配分出庫可能数
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private BigDecimal issue_BY_ODR(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList, IssueRemain.ResultByOd iRet)
			throws SQLException, FoundationException {
		BigDecimal dRC = bdZero;
		BigDecimal ret_RC = bdZero;

		try {
			_log.methodStart();

			if (dInISSUENO.compareTo(bdZero) <= 0) {
				return bdZero;
			}

			// 出庫指示情報を取得
			IssueInstStruct stII = iIssueInstStruct;

			/*******************************************************************
			 * ***** 出庫可能数の算出 個別手配分出庫可能数(iRet.remainQty) ＝ [所要量].オーダ数 -
			 * Σ[所要量].出庫累計数 - Σ[製番引当].出庫済数
			 */
			dRC = iRet.remainQty; // 個別手配分出庫可能数(出庫残数)

			if (dRC.compareTo(dInISSUENO) >= 0) {
				dRC = dInISSUENO;
			}

			// 個別手配分出庫可能数 ＞ 0
			if (dRC.compareTo(bdZero) > 0) {
				// 自動出庫数を全て出庫するまで【製番品の払出保管区の順序】で出庫
				ret_RC = commonJOBODR(stII, iRet.jobOdrCd, iRet.jobOdrDetailNo,
						iWhList, dRC, false);
			}
			// _log.message("製番引当・出庫済み数合計・dISSUEED_QTY_SUM=["+dISSUEED_QTY_SUM+"]");
			// _log.message("出庫要求数・dInISSUENO=["+dInISSUENO+"]");
			// _log.message("出庫算出数・dRC=["+dRC+"]");
			// _log.message("出庫済数・dRC1=["+dRC1+"]");

			_log.methodEnd();
		} finally {
		}
		return ret_RC;
	};

	/**
	 * 
	 * 個別手配分の余剰在庫から出庫を行います。 手持在庫数を参照し、出庫可能な範囲で出庫します。
	 * 
	 * @param iIssueInstStruct
	 *            処理対象品目の出庫指示情報
	 * @param dInISSUENO
	 *            自動出庫数
	 * @param iWhList
	 *            品目ごとの出庫元保管区リスト
	 * @return 個別手配分出庫数
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private BigDecimal issue_BY_ODR_REMAIN(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList) throws SQLException,
			FoundationException {
		BigDecimal dSUM_HAND_QTY = bdZero;
		BigDecimal dRC = bdZero;
		BigDecimal dRC1 = bdZero;

		try {
			_log.methodStart();

			if (dInISSUENO.compareTo(bdZero) <= 0) {
				return bdZero;
			}

			// 出庫指示情報を取得
			IssueInstStruct stII = iIssueInstStruct;

			// 製番在庫の検索
			/*
			 * [保管区別製番在庫].“製番”＝[出庫指示].オーダデマンド番号で一致する[所要量]の製番 [保管区別製番在庫].“品目番号” ＝
			 * [出庫指示].品目番号 [保管区別製番在庫].“工場コード” ＝ [出庫指示].工場コード
			 */

			/* ***** 出庫可能数の算出 **** */
			// << [製番在庫より Σ手持在庫数 の取得 >>
			JobOdrStock wJobOdrStock = new JobOdrStock(_iconn);
			dSUM_HAND_QTY = wJobOdrStock.getSumHandQty(stII.m_JOB_ODR_CD,
					stII.m_JOB_ODR_DETAIL_NO, stII.m_ITEM_CD, stII.m_PLANT_CD);
			if (dSUM_HAND_QTY != null && dSUM_HAND_QTY.compareTo(bdZero) > 0) {
				if (dSUM_HAND_QTY.compareTo(dInISSUENO) < 0) {
					dRC = dSUM_HAND_QTY;
				} else {
					dRC = dInISSUENO;
				}
			}

			// 個別手配分出庫可能数 ＞ 0
			if (dRC.compareTo(bdZero) > 0) {
				// 自動出庫数を全て出庫するまで
				// 【製番品の払出保管区の順序】
				dRC1 = commonJOBODR(stII, stII.m_JOB_ODR_CD,
						stII.m_JOB_ODR_DETAIL_NO, iWhList, dRC, false);
			}
			// _log.message("製番引当・出庫済み数合計・dISSUEED_QTY_SUM=["+dISSUEED_QTY_SUM+"]");
			// _log.message("出庫要求数・dInISSUENO=["+dInISSUENO+"]");
			// _log.message("出庫算出数・dRC=["+dRC+"]");
			// _log.message("出庫済数・dRC1=["+dRC1+"]");

			_log.methodEnd();
		} finally {
		}
		return dRC1;
	};

	/**
	 * <pre>
	 *   製番引当分出庫可能数（同一製番）からの出庫を行い、
	 *   同一製番在庫から出庫した数を返却します。
	 *   
	 *   @param iIssueInstStruct	出庫指示情報
	 *   @param dInISSUENO       自動出庫残数
	 *   @param iWhList          品目ごとの出庫元保管区リスト
	 *   @return　同一製番在庫から出庫した数
	 *   @throws SQLException
	 * 
	 */
	private BigDecimal issue_BY_JOBALC_SAME(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList) throws SQLException,
			FoundationException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "";

		BigDecimal dALCD_QTY = bdZero; // 引当済数
		BigDecimal dISSUEED_QTY = bdZero; // 出庫済数
		BigDecimal dRC = bdZero;
		BigDecimal dRC1 = bdZero;
		BigDecimal dISSUENO = bdZero;
		String sJOB_ODR_CD = "";
		int jobOdrDetailNo = 0;

		try {
			_log.methodStart();

			if (dInISSUENO.compareTo(bdZero) <= 0) {
				return bdZero;
			}

			// 出庫指示情報を取得
			IssueInstStruct stII = iIssueInstStruct;
			dISSUENO = dInISSUENO;

			// << 製番引当の検索 >>
			sql = " SELECT JOB_ODR_CD,  JOB_ODR_DETAIL_NO, "
					+ "ITEM_CD, ALCD_QTY, ISSUEED_QTY "
					+ " FROM T_JOB_ODR_ALC "
					+ " WHERE ( (OD_NO=?)  AND (ALC_STOCK_TYP=2)  "
					+ " AND (JOB_ODR_CD=?) AND (JOB_ODR_DETAIL_NO = ?) ) "
					+ " ORDER BY JOB_ODR_CD ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, stII.m_OD_NO);
			ps.setString(2, stII.m_JOB_ODR_CD);
			ps.setInt(3, stII.m_JOB_ODR_DETAIL_NO);
			rs = ps.executeQuery();
			/* DEBUG */_log.message("(SBM0934) 製番引当の検索");
			/* DEBUG */_log.message("sql=[" + sql + "]");
			if (rs.next()) {
				sJOB_ODR_CD = Nvl(rs.getString("JOB_ODR_CD"));
				jobOdrDetailNo = rs.getInt("JOB_ODR_DETAIL_NO");
				dALCD_QTY = rs.getBigDecimal("ALCD_QTY");
				dISSUEED_QTY = rs.getBigDecimal("ISSUEED_QTY");
				dRC = dALCD_QTY.subtract(dISSUEED_QTY); // 出庫可能数(出庫残数)

				/* DEBUG */_log.message("(SBM0935) 所要量・共通変数「製番」sJOB_ODR_CD=["
						+ sJOB_ODR_CD + "]");
				/* DEBUG */_log.message("(SBM0936) 製番引当・引当済み数・dALCD_QTY=[" + dALCD_QTY
						+ "]");
				/* DEBUG */_log.message("(SBM0937) 製番引当・出庫済み数・dISSUEED_QTY=["
						+ dISSUEED_QTY + "]");
				/* DEBUG */_log.message("dRC=[" + dRC + "]");

				// 出庫可能数>０ならば、出庫処理する
				if (dRC.compareTo(bdZero) > 0) {
					if (dRC.compareTo(dISSUENO) >= 0) {
						dRC = dISSUENO;
					}
					/* DEBUG */_log.message("(SBM0845) 出庫要求数・dISSUENO=[" + dISSUENO
							+ "]");
					/* DEBUG */_log.message("(SBM0938) 出庫可能数・dRC=[" + dRC + "]");
					// 製番引当分出庫可能数（同一製番）> 0 かつ、自動出庫残数 > 0
					// 自動出庫数を全て出庫するまで
					// 【製番品の払出保管区の順序】
					dRC1 = commonJOBODR(stII, sJOB_ODR_CD, jobOdrDetailNo,
							iWhList, dRC, false); // dRC1:製番在庫から出庫した数

					/* DEBUG */_log.message("(SBM0939) 出庫数・dRC1=[" + dRC1 + "]");
				}
			}
			_log.methodEnd();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
		// 製番引当分出庫可能数（同一製番）からの出庫数を返却
		return dRC1;
	};

	/**
	 * 【 製番引当分出庫可能数（他製番）からの出庫 】 製番引当分出庫可能数（他製番）からの出庫を行い、 他製番在庫から出庫した数を返却します。
	 * 
	 * @param iIssueInstStruct
	 *            出庫指示情報
	 * @param dInISSUENO
	 *            自動出庫残数
	 * @param iWhList
	 *            品目ごとの出庫元保管区リスト
	 * @return 他製番在庫から出庫した数
	 * @throws SQLException
	 * @throws FoundationException
	 * 
	 */
	private BigDecimal issue_BY_JOBALC_OTHER(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList) throws SQLException,
			FoundationException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "";

		BigDecimal dALCD_QTY = bdZero;
		BigDecimal dISSUEED_QTY = bdZero;
		BigDecimal dISSUENO = bdZero;
		BigDecimal dRC = bdZero;
		BigDecimal dRC1 = bdZero;
		BigDecimal dAllCount = bdZero;

		String jobOdrCd = ""; // [製番引当]の製番
		int jobOdrDetailNo = 0; // [製番引当]の製番枝番

		try {
			_log.methodStart();

			if (dInISSUENO.compareTo(bdZero) <= 0) {
				return bdZero;
			}

			// 出庫指示情報を取得
			IssueInstStruct stII = iIssueInstStruct;
			dISSUENO = dInISSUENO;

			// << 製番引当の検索 >>
			sql = " SELECT JOB_ODR_CD,  JOB_ODR_DETAIL_NO, "
					+ " ITEM_CD, ALCD_QTY, ISSUEED_QTY "
					+ " FROM T_JOB_ODR_ALC "
					+ " WHERE OD_NO=? AND ALC_STOCK_TYP=2 AND JOB_ODR_CD <> ? "
					+ " ORDER BY JOB_ODR_CD ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1, stII.m_OD_NO);
			ps.setString(2, stII.m_JOB_ODR_CD);

			rs = ps.executeQuery();
			/* DEBUG */_log.message("(SBM0934) 製番引当の検索");
			/* DEBUG */_log.message("sql=[" + sql + "]");
			while (rs.next()) {
				jobOdrCd = rs.getString("JOB_ODR_CD"); // [製番引当]の製番を取得
				jobOdrDetailNo = rs.getInt("JOB_ODR_DETAIL_NO");// [製番引当]の製番枝番を取得

				// 出庫可能数の算出 ( 引当済数－出庫済数 )
				dALCD_QTY = rs.getBigDecimal("ALCD_QTY"); // 引当済み数
				dISSUEED_QTY = rs.getBigDecimal("ISSUEED_QTY"); // 出庫済み数
				dRC = dALCD_QTY.subtract(dISSUEED_QTY); // 出庫可能数
				/* DEBUG */
				_log.message("(SBM0974) 製番引当・「製番」・jobOdrCd=[" + jobOdrCd + "]");
				/* DEBUG */_log.message("(SBM0936) 製番引当・引当済数・dALCD_QTY=[" + dALCD_QTY
						+ "]");
				/* DEBUG */_log.message("(SBM0937) 製番引当・出庫済数・dISSUEED_QTY=["
						+ dISSUEED_QTY + "]");
				/* DEBUG */_log.message("dRC=[" + dRC + "]");

				// 出庫可能数が０以下ならば、次の引当情報を処理する
				if (dRC.compareTo(bdZero) <= 0) {
					continue;
				}

				if (dRC.compareTo(dISSUENO) >= 0) {
					dRC = dISSUENO;
				}
				/* DEBUG */_log.message("(SBM0845) 出庫要求数・dISSUENO=[" + dISSUENO + "]");
				/* DEBUG */_log.message("(SBM0938) 出庫可能数・dRC=[" + dRC + "]");

				// 製番引当分出庫可能数（他製番）＞ 0 かつ、自動出庫残数 ＞0
				// 自動出庫数を全て出庫するまで
				// 【製番品の払出保管区の順序】
				dRC1 = commonJOBODR(stII, jobOdrCd, jobOdrDetailNo, iWhList,
						dRC,false);
				if (dRC1 == null) {
					return null;
				}

				dISSUENO = dISSUENO.subtract(dRC1);
				dAllCount = dAllCount.add(dRC1);
				/* DEBUG */_log.message("(SBM0975) 出庫要求残数・dISSUENO=[" + dISSUENO + "]");
				/* DEBUG */_log.message("(SBM0976) 出庫数合計・dAllCount=[" + dAllCount + "]");
				if (dISSUENO.compareTo(bdZero) == 0) {
					break;
				}
			}
			_log.methodEnd();
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
		return dAllCount;
	};

	/**
	 * 2.10.7.3 在庫引当分出庫可能数からの出庫 3 在庫引当分出庫可能数からの出庫を行い、 在庫引当分の品目在庫から出庫した数を返却します。
	 * 
	 * @param iIssueInstStruct
	 *            出庫指示情報
	 * @param dInISSUENO
	 *            自動出庫数
	 * @param iWhList
	 *            品目ごとの出庫元保管区リスト
	 * @return
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private BigDecimal issue_BY_ITEMALC(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList) throws SQLException,
			FoundationException {
		BigDecimal dISSUENO = bdZero;
		BigDecimal dRC = bdZero;
		BigDecimal dRC1 = bdZero;

		try {
			_log.methodStart();
			if (dInISSUENO.compareTo(bdZero) <= 0) {
				return bdZero;
			}
			// 出庫指示情報を取得
			IssueInstStruct stII = iIssueInstStruct;

			dISSUENO = dInISSUENO;

			// 引当済みの品目在庫からの出庫残数を取得
			// 出庫可能数 = 引当済数 - 出庫済み数
			IssueRemain sIssueRemain = new IssueRemain(_iconn);
			dRC = sIssueRemain.getRemainQtyByItem(stII.m_OD_NO);

			// DEBUG
			// _log.message("出庫要求数・dISSUENO=["+dISSUENO+"]");
			// _log.message("出庫可能数・dRC=["+dRC+"]");

			if (dRC.compareTo(dISSUENO) >= 0) {
				dRC = dISSUENO;
			}
			// 自動出庫数を全て出庫するまで【ＭＲＰ品の払出保管区の順序】で出庫
			if (dRC.compareTo(bdZero) > 0) {
				dRC1 = commonMRP(stII, dRC, iWhList, 3);
			}

			_log.methodEnd();
		} finally {
		}
		return dRC1;
	};

	/**
	 * 
	 * 2.10.7.4 品目在庫（余剰在庫）からの出庫 品目在庫（余剰在庫）からの出庫を行い、 余剰在庫から出庫した数を返却します。
	 * 
	 * @param iIssueInstStruct
	 *            出庫指示情報
	 * @param dInISSUENO
	 *            自動出庫数
	 * @param iWhList
	 *            品目ごとの出庫元保管区リスト
	 * @return 余剰在庫からの出庫数
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private BigDecimal issue_BY_ITEM_REMAIN(IssueInstStruct iIssueInstStruct,
			BigDecimal dInISSUENO, List iWhList) throws SQLException,
			FoundationException {
		BigDecimal dRC = bdZero;
		int iRC = 0;

		_log.methodStart();
		if (dInISSUENO.compareTo(bdZero) <= 0) {
			return bdZero;
		}

		// 出庫指示情報を取得
		IssueInstStruct stII = iIssueInstStruct;

		// [製番引当]の更新（引当済数の更新）
		JobOdrAlc wAlc = new JobOdrAlc(_iconn);
		wAlc.updateAlcQty(stII, dInISSUENO, _updInfo);

		// 自動出庫数を全て出庫するまで
		// 【ＭＲＰ品の払出保管区の順序】
		dRC = commonMRP(stII, dInISSUENO, iWhList, 3);
		_log.methodEnd();
		return dRC;
	};

	/**
	 * 
	 * [有償支給履歴]ファイルへのレコード追加
	 * 
	 * @param
	 * @param istII
	 *            出庫指示情報
	 * @param istRCI
	 *            保管区別入出庫データ
	 * @throws SQLException
	 * @throws Exception
	 * 
	 */
	private void insertPastOnerousCons(IssueInstStruct istII,
			RcvIssueStruct istRCI) throws SQLException, FoundationException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "";
		int iIndex = 0;
		int iRC = 0;
		String strOdrCd = "";
		boolean ret;

		java.util.Date dtDate = null;
		try {
			_log.methodStart();
			// [支給単価]を検索
			ConsUnitCost sCost = new ConsUnitCost(_iconn);
			ret = sCost.read(istII.m_COMPANY_CD, istII.m_VEND_CD,
					istII.m_PLANT_CD, istII.m_ITEM_CD, gin.m_RCV_ISSUE_DATE);

			_log.message("(SBM0905) 有償支給番号の採番");
			// 有償支給番号の採番
			Numbering ODR_CD = new Numbering(_iconn, Numbering.ONERCONS_CD,
					_updInfo.getUpdateBy(), _updInfo.getUpdatePrgNm(), _plantCd);
			strOdrCd = ODR_CD.getNo();
			// Insert
			sql = " INSERT INTO  T_PAST_ONEROUS_CONS ( "
					+ " ONEROUS_CONS_NO	," // 有償支給番号
					+ " COMPANY_CD ," // 会社コード
					+ " VEND_CD ," // 取引先コード
					+ " PLANT_CD ," // 工場コード
					+ " JOB_ODR_CD ," // 製番
					+ " JOB_ODR_DETAIL_NO ," // 製番枝番
					+ " ITEM_CD ," // 品目番号
					+ " ISSUE_DATE ," // 出庫日
					+ " ISSUE_QTY ," // 出庫数
					+ " UNIT_COST ," // 単価
					+ " UNIT_COST_TYP ," // 単価区分
					+ " ONEROUS_CONS_COMMENT ," // 有償支給備考
					+ " VEND_LOT_NO ," // メーカロット番号
					+ " RCV_ISSUE_CTRL_CD ," // 入出庫管理番号
					+ " WORK_ODR_CD ," // 作業計画番号
					+ " WORK_IN_PROC_CD ," // 仕掛作業コード
					+ " PUCH_ODR_CD ," // 発注番号
					+ " ISSUE_INST_CD ," // 出庫指示番号
					+ " RETURNED_WH_CD ," // 返品先保管区コード
					+ " RETURNED_CAUSE_CD ," // 返品理由コード
					+ " RETURNED_GNR_TYP ," // 返品発生処理区分
					+ " AP_PROC_TYP ," // 買掛処理区分
					+ " CREATED_BY ," // 作成者
					+ " CREATED_PRG_NM ," // 作成プログラム名
					+ " UPDATED_BY ," // 更新者
					+ " UPDATED_PRG_NM ," // 更新プログラム名
					+ " MODIFY_COUNT )" // 更新数
					+ " values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			iIndex = 1;
			ps = _conn.prepareStatement(sql);
			ps.setString(iIndex++, strOdrCd); // 有償支給番号
			ps.setString(iIndex++, istII.m_COMPANY_CD); // 会社コード
			ps.setString(iIndex++, istII.m_VEND_CD); // 取引先コード
			ps.setString(iIndex++, istII.m_PLANT_CD); // 工場コード
			setNvl(iIndex++, istRCI.m_JOB_ODR_CD, ps); // 製番
			ps.setInt(iIndex++, istRCI.m_JOB_ODR_DETAIL_NO); // 製番枝番
			ps.setString(iIndex++, (String) istII.m_ITEM_CD); // 品目番号

			dtDate = Converter.strToDate(gin.m_RCV_ISSUE_DATE,
					Converter.SLASH_DATE);
			ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime())); // 入出庫年月日
			ps.setBigDecimal(iIndex++, istRCI.m_RCV_ISSUE_QTY
					.multiply(new BigDecimal(-1)));// 出庫数
			if (ret) { // 支給単価レコードが存在した場合
				// 単価
				if (sCost.getOnerousFlg() == 1) {
					ps.setBigDecimal(iIndex++, sCost.getUnitCost());
				} else if (sCost.getOnerousFlg() == 0) {
					ps.setDouble(iIndex++, 0);
				}
				// 単価区分
				ps.setInt(iIndex++, sCost.getUnitCostTyp());
			} else { // 支給単価レコードが存在しなかった場合
				ps.setDouble(iIndex++, 0); // 単価
				ps.setInt(iIndex++, 0); // 単価区分
			}
			ps.setNull(iIndex++, Types.VARCHAR); // 有償支給備考
			setNvl(iIndex++, istRCI.m_VEND_LOT_NO, ps); // メーカロット番号
			ps.setString(iIndex++, istRCI.m_RCV_ISSUE_CTRL_CD); // 入出庫管理番号
			ps.setNull(iIndex++, Types.VARCHAR); // 作業計画番号
			ps.setNull(iIndex++, Types.VARCHAR); // 仕掛作業コード
			ps.setString(iIndex++, istII.m_PUCH_ODR_CD); // 発注番号
			ps.setString(iIndex++, istII.m_ISSUE_INST_CD); // 出庫指示番号
			ps.setNull(iIndex++, Types.VARCHAR); // 返品先保管区コード
			ps.setNull(iIndex++, Types.VARCHAR); // 返品理由コード
			ps.setInt(iIndex++, 0); // 返品発生処理区分
			ps.setInt(iIndex++, 0); // 買掛処理区分
			// -----------------------------------------------------------------------
			ps.setString(iIndex++, _updInfo.getUpdateBy()); // 作成者
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm()); // 作成プログラム名
			ps.setString(iIndex++, _updInfo.getUpdateBy()); // 更新者
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm()); // 更新プログラム名
			ps.setDouble(iIndex++, 0); // 更新数
			iRC = ps.executeUpdate();

			/* DEBUG */_log.message("(SBM0940) 有償支給履歴の登録");
			/* DEBUG */_log.message("sql=[" + sql + "]");
			/* DEBUG */_log.message("(SBM0941) 有償支給履歴の管理番号=[" + strOdrCd + "]");
			/* DEBUG */_log.message("(SBM0942) 有償支給履歴の登録件数=[" + iRC + "]");
			_log.methodEnd();
		} catch (ParseException pe) {
			StackTraceElement e = (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName = e.getMethodName();
			throw new FoundationException(className, methodName,
					"ParseException");

		} finally {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
		}
		return;
	}

	// ************************************************************************************
	// メッセージ処理用メソッド
	// ************************************************************************************
	// 自動出庫結果格納用のメッセージリスト
	private List retMsg = new ArrayList();// 自動出庫結果格納用のメッセージリスト

	/** 情報メッセージ格納リスト */
	private ArrayList _infoList = new ArrayList();

	/** 警告メッセージ格納リスト */
	private ArrayList _warnList = new ArrayList();

	/** エラーメッセージ格納リスト */
	private ArrayList _errorList = new ArrayList();

	/**
	 * インフォメーションメッセージ設定
	 * 
	 * @param iMsgCd
	 *            メッセージコード
	 * @param iMsgDetail
	 *            メッセージ詳細（出庫指示番号）
	 */
	private void setInfoList(String iMsgCd, String iMsgDetail) {
		String[] w_msg = new String[2];

		w_msg[0] = iMsgCd;
		w_msg[1] = iMsgDetail;
		_infoList.add(w_msg);
		return;
	}

	/**
	 * ワーニングメッセージ設定
	 * 
	 * @param iMsgCd
	 *            メッセージコード
	 * @param iMsgDetail
	 *            メッセージ詳細（品目番号）
	 */
	private void setWarnList(String iMsgCd, String iMsgDetail) {
		String[] w_msg = new String[2];

		w_msg[0] = iMsgCd;
		w_msg[1] = iMsgDetail;
		_warnList.add(w_msg);
		return;
	}

	/**
	 * エラーメッセージ設定
	 * 
	 * @param iMsgCd
	 *            メッセージコード
	 * @param iMsgDetail
	 *            メッセージ詳細（出庫指示番号）
	 */
	private void setErrorList(String iMsgCd, String iMsgDetail) {
		String[] w_msg = new String[2];

		_infoList.clear();
		_warnList.clear();
		w_msg[0] = iMsgCd;
		w_msg[1] = iMsgDetail;
		_errorList.add(w_msg);
		return;
	}

	/**
	 * メッセージ取得
	 * 
	 * @return エラーリスト(メッセージコード(String) のリスト）
	 */
	protected ArrayList getErrorList() {
		return _errorList;
	}

	/**
	 * メッセージ取得
	 * 
	 * @return infoリスト
	 */
	protected ArrayList getInfoList() {
		return _infoList;
	}

	/**
	 * メッセージ取得
	 * 
	 * @return warnリスト
	 */
	protected ArrayList getWarnList() {
		return _warnList;
	}

	/**
	 * 業務メッセージの出力を行う。(業務メッセージテーブルへの出力）
	 * 
	 * @param conn
	 *            DBコネクション
	 * @param businessName
	 *            業務名
	 * @param userId
	 *            ユーザコード
	 * @param plantCd
	 *            工場コード
	 * @param businessErrCode
	 *            メッセージコード
	 * @param errNote
	 *            メッセージ詳細
	 * 
	 * @throws SQLException
	 * @throws FoundationException
	 * 
	 */
	private void outBusinessMessage(String businessErrCode, String errNote)
			throws SQLException, FoundationException {

		outBusinessMessage(_iconn, _updInfo.getUpdatePrgNm(), _updInfo
				.getUpdateBy(), _plantCd, businessErrCode, errNote);
	}

	/**
	 * 業務メッセージの出力を行う。(業務メッセージテーブルへの出力）
	 * 
	 * @param conn
	 *            DBコネクション
	 * @param businessName
	 *            業務名
	 * @param userId
	 *            ユーザコード
	 * @param plantCd
	 *            工場コード
	 * @param businessErrCode
	 *            メッセージコード
	 * @param errNote
	 *            メッセージ詳細
	 * 
	 * @throws SQLException
	 * @throws FoundationException
	 * 
	 */
	public final static void outBusinessMessage(IDbConnection conn,
			String businessName, String userId, String plantCd,
			String businessErrCode, String errNote) throws SQLException,
			FoundationException {

		// 業務メッセージの準備
		BusinessMessageAccessor businessMsgAcc = new BusinessMessageAccessor();
		BusinessMessage businessMsg = new BusinessMessage();
		businessMsgAcc.init(conn);
		businessMsg.setBusinessOperatingName(businessName);
		businessMsg.setUser(userId);
		businessMsg.setPlantCode(plantCd);
		businessMsg.setMessageCode(businessErrCode);
		businessMsg.setData(errNote);

		Numbering logCd = new Numbering(conn, Numbering.LOG_CD, userId,
				businessName, plantCd);
		businessMsg.setLogCode(logCd.getNo());
		businessMsgAcc.add(businessMsg);
	}

	// ************************************************************************************

	// ******************************************************************
	// 文字列編集
	// ******************************************************************

	/**
	 * １．指定された文字列がNULLの場合、長さ０の文字列を返却します。 ２．指定された文字列がNUllでない場合は、指定された文字列を
	 * そのまま返却します。
	 */
	private String Nvl(String iStr) {
		String ret_str;
		if (iStr == null) {
			ret_str = "";
		} else {
			ret_str = iStr;
		}
		return ret_str;

	}

	/**
	 * １．指定された日付型がNULLの場合、長さ０の文字列を返却します。 ２．指定された日付型がNUllでない場合は、
	 * 指定された文字列(日付)を/付きに変換して返却します。
	 */
	private String Nvl(Date iDate) {
		String ret_str;

		if (iDate == null) {
			ret_str = "";
		} else {
			ret_str = Converter.dateToStr(iDate, Converter.SLASH_DATE);
		}
		return ret_str;
	}

	/**
	 * PrearedStatmentに、指定された値を設定します。
	 * 
	 * @param idx
	 *            項目位置情報
	 * @param iStr
	 *            設定文字列
	 * @param iPs
	 *            PreparedStatement
	 * @throws SQLException
	 * 
	 */
	private void setNvl(int idx, String iStr, PreparedStatement iPs)
			throws SQLException {

		if (iStr == null) {
			iPs.setNull(idx, Types.VARCHAR);
		} else {
			iPs.setString(idx, iStr);
		}
	}

	private void setNvl(int idx, Date iDate, PreparedStatement iPs)
			throws SQLException {

		if (iDate == null) {
			iPs.setNull(idx, Types.DATE);
		} else {
			iPs.setDate(idx, new java.sql.Date(iDate.getTime()));
		}
	}

	// -------------------------------------------------------------------------------------------
	// Common Sub Class
	// -------------------------------------------------------------------------------------------
	/**
	 * 自動出庫処理 起動パラメータクラス （自動出庫処理共通情報）
	 * 
	 */
	public class AutoIssueParam {
		// 自動出庫品目 共通情報
		public int m_RCV_ISSUE_TYP = 0; // 自動出庫処理区分

		public String m_WORK_ODR_CD = null; // 作業計画番号

		public String m_WORK_IN_PROC_CD = null; // 仕掛作業コード

		public int m_PARTIAL_PRD_NO = 0; // 分作回数

		public int m_OPR_RSLT_CRCT_NO = 0; // 作業実績訂正回数

		public String m_PUCH_ODR_CD = null; // 発注番号

		public int m_ACPT_NO = 0; // 受入回数

		public int m_ACPT_RSLT_CRCT_NO = 0; // 受入実績訂正回数

		public String m_RCV_ISSUE_DATE = null; // 出庫年月日(yyyy/MM/DD形式)
		
		public String m_INSPC_ACPT_DATE = null; // 検収実績年月日(yyyy/MM/DD形式)

		public String m_RCV_ISSUE_RSLT_NO = null; // 処理対象実績数

		public int m_RCV_ISSUE_CMPLT_FLG = 0; // 出庫完了フラグ

		public String m_PLANT_CD = null; // 工場コード

		public String m_VEND_LOT_NO = null; // メーカロット番号(キット一括出庫時に使用)
	}

	/**
	 * ログ出力(インナークラス)
	 */
	class Log {
		private int indent = 0;

		private SystemLog _syslog = new SystemLog(); // ★★ログ出力クラス

		// コンストラクタ // 2003/08/11 connection取得部修正
		public Log(String className, IDbConnection conn) {
			// ★★ 初期化
			// _syslog.init(className);
			_syslog.init("AUTO_ISSUE");
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

			// このメソッドを呼び出したメソッドを取得
			StackTraceElement e = (new Throwable()).getStackTrace()[2];

			String className = e.getClassName();
			String methodName = e.getMethodName();

			// パッケージ名を除くクラス名を取得
			StringTokenizer st = new StringTokenizer(className, ".");
			String lastClassName = "";
			while (st.hasMoreTokens()) {
				lastClassName = st.nextToken();
			}
			// 今の時間を取得
			Date now = new Date();
			SimpleDateFormat f = new SimpleDateFormat("M/d HH:mm:ss.SSS");
			String sNow = f.format(now);
			String out = sNow + " <" + indent + "> [" + lastClassName + "/"
					+ methodName + "] " + message;

			// ★★ ログ出力
			_syslog.fine_d(out, _updInfo.getUpdateBy());

			// ログ出力(System.out版)
			// System.out.println(out);
		}
	}

	/**
	 * ロットfalgを取得
	 * 
	 * @param connect
	 * @param iItemCd
	 * @return ロットfalg
	 * @throws SQLException
	 * @serialData 2007/04/19
	 */
	private int getLotFlag(IDbConnection connect, String iItemCd)
			throws SQLException {
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		int i = 0;
		// 引数チェック
		if (!StringUtil.Validate(iItemCd)) {
			IllegalArgumentException e = new IllegalArgumentException(this
					.getClass().getName());
			throw e;
		}

		/** ロットflag読込用 SQL */
		String selectStr = "SELECT" + " LOT_CTRL_FLG " + "FROM" + " M_ITEM "
				+ "WHERE" + " ITEM_CD = ?";

		try {
			selectStmt = connect.getConn().prepareStatement(selectStr);
			selectStmt.setString(1, iItemCd);
			selectRslt = selectStmt.executeQuery();

			// 検索件数が0件だったらnullを返却
			if (selectRslt.next() == false)
				return 0;
			if (selectRslt.getString("LOT_CTRL_FLG") == null) {
				i = 0;
			} else {

				i = selectRslt.getInt("LOT_CTRL_FLG");
			}
			return i;

		} finally {
			selectRslt.close();
			selectStmt.close();
		}
	}

	/**
	 * <pre>
	 *    工場コード、品目番号、所要量計算対象フラグを元に
	 *    [品目別保管先優先順位]、[保管区]から保管区コード一覧を
	 *    優先順位番号の昇順または降順で取得する。
	 * </pre>
	 * 
	 * @param iConnect
	 *            コネクションがOPENされていないIDbConnection
	 * @param iPlantCd
	 *            工場コード
	 * @param iItemCd
	 *            品目番号
	 * @param iSortTyp
	 *            ソートフラグ TRUE：昇順、FALSE：降順
	 * @return List 優先保管区コード([品目別保管先優先順位]."品目別保管先優先順位"の昇順or降順)<br>
	 *         データが存在しない場合はリストサイズが0。
	 * @throws SQLException
	 *             DBアクセスエラー
	 */
	private static final List getMrpWhAllF(IDbConnection iConnect,
			String iPlantCd, String iItemCd, boolean iSortTyp)
			throws SQLException {

		PreparedStatement ps = null;
		ResultSet rs = null;

		// 引数チェック
		if (iConnect == null || !StringUtil.Validate(iPlantCd)
				|| !StringUtil.Validate(iItemCd)) {
			IllegalArgumentException e = new IllegalArgumentException(
					"ValidateWh.getPriorityByItem()");
			throw e;
		}

		Connection conn = iConnect.getConn();
		List outList = new ArrayList();

		// ソートタイプの設定
		String selectMWhPriority = "";
		if (iSortTyp) {
			selectMWhPriority = "SELECT WH_CD FROM "
				+ "((select "
				+ "M_WH_PRIORITY.WH_CD WH_CD, M_WH_PRIORITY.WH_PRIORITY_REF_NO WH_PRIORITY_REF_NO "
				+ "from "
				+ "M_WH_PRIORITY, "
				+ "M_WH "
				+ "where "
				+ "M_WH_PRIORITY.WH_CD = M_WH.WH_CD "
				+ "and M_WH_PRIORITY.PLANT_CD =  ? "
				+ "and M_WH_PRIORITY.ITEM_CD =  ? "
				+ "and M_WH.MRP_FLG = ?) "
				+ "union "
				+ "(select "
				+ "M_WH.WH_CD WH_CD, to_number(?) WH_PRIORITY_REF_NO "
				+ "from "
				+ "M_WH "
				+ "where "
				+ " M_WH.PLANT_CD =  ? "
				+ "and M_WH.WH_CD IN   ( SELECT WH_CD FROM t_item_STOCK WHERE ITEM_cd= ?"
				+ " ) " + "AND M_WH.WH_CD NOT IN (select "
				+ "  M_WH_PRIORITY.WH_CD WH_CD " + "   from"
				+ "   M_WH_PRIORITY, " + "   M_WH" + "   where "
				+ "   M_WH_PRIORITY.WH_CD = M_WH.WH_CD "
				+ "   and M_WH_PRIORITY.PLANT_CD =  ?"
				+ "   and M_WH_PRIORITY.ITEM_CD =  ?"
				+ "   and M_WH.MRP_FLG =  ?) "
				+ "and M_WH.MRP_FLG =  ?)) "
				+ "order by " + "WH_PRIORITY_REF_NO,WH_CD ASC";
		} else {
			selectMWhPriority = "SELECT WH_CD FROM "
				+ "((select "
				+ "M_WH_PRIORITY.WH_CD WH_CD, M_WH_PRIORITY.WH_PRIORITY_REF_NO WH_PRIORITY_REF_NO "
				+ "from "
				+ "M_WH_PRIORITY, "
				+ "M_WH "
				+ "where "
				+ "M_WH_PRIORITY.WH_CD = M_WH.WH_CD "
				+ "and M_WH_PRIORITY.PLANT_CD =  ? "
				+ "and M_WH_PRIORITY.ITEM_CD =  ? "
				+ "and M_WH.MRP_FLG = ?) "
				+ "union "
				+ "(select "
				+ "M_WH.WH_CD WH_CD, to_number(?) WH_PRIORITY_REF_NO "
				+ "from "
				+ "M_WH "
				+ "where "
				+ " M_WH.PLANT_CD =  ? "
				+ "and M_WH.WH_CD IN   ( SELECT WH_CD FROM t_item_STOCK WHERE ITEM_cd= ?"
				+ " ) " + "AND M_WH.WH_CD NOT IN (select "
				+ "  M_WH_PRIORITY.WH_CD WH_CD " + "   from"
				+ "   M_WH_PRIORITY, " + "   M_WH" + "   where "
				+ "   M_WH_PRIORITY.WH_CD = M_WH.WH_CD "
				+ "   and M_WH_PRIORITY.PLANT_CD =  ?"
				+ "   and M_WH_PRIORITY.ITEM_CD =  ?"
				+ "   and M_WH.MRP_FLG =  ?) "
				+ "and M_WH.MRP_FLG =  ?)) "
				+ "order by " + "WH_PRIORITY_REF_NO,WH_CD DESC";
		}
		try {
			// データ読込のSQL作成
			ps = conn.prepareStatement(selectMWhPriority);
			ps.setString(1, iPlantCd);
			ps.setString(2, iItemCd);
			ps.setInt(3, RcvIssueConst.MRP_TARGET);
			ps.setString(4, RcvIssueConst.STR_WH_PRIORITY_REF_NO);
			ps.setString(5, iPlantCd);
			ps.setString(6, iItemCd);
			ps.setString(7, iPlantCd);
			ps.setString(8, iItemCd);
			ps.setInt(9, RcvIssueConst.MRP_TARGET);
			ps.setInt(10, RcvIssueConst.MRP_TARGET);
			rs = ps.executeQuery();

			// 存在チェック
			if (rs.next()) {
				// 結果を設定
				outList.add(rs.getString(1));
				while (rs.next()) {
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
