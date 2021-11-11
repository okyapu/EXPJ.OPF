/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/AutoIssue.java,v $
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.text.ParseException;

import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.expj.pr.rcvissue.mst.ConsUnitCost;
import com.nec.jp.orteus.expj.util.Numbering;


/**
 * <pre>
 * 自動出庫の共通処理を行います。
 * このクラスは、以下の業務処理から呼び出されます。
 * 　１．作業実績入力
 * 　２．出来高実績入力
 * 　３．受入実績入力、受入実績メンテナンス
 * </pre>
 *
 * @author $Author: li-lu $
 * @version $Revision: 1.8 $ $Date: 2014/12/29 07:36:57 $
 */

public class AutoIssue {

	private	IDbConnection _iconn;			// トランザクションコネクション情報
	private	Connection _conn;				// コネクション情報
	private	String _plantCd;				// 工場コード
	private	UpdateInfo _updInfo;			// 利用者管理情報(インナークラス)
	private	Log	_log;						// ログ情報(インナークラス)

	private WhAutoIssueProc.AutoIssueParam gin;	//自動出庫起動パラメータ

	//入庫結果出力用文字列（出庫指示番号）
	static final  String strDtl = "T_ISSUE_INST.ISSUE_INST_CD:";
	
	/**
	 * コンストラクタ
	 *
	 * @param conn コネクション情報
	 * @param plantCd 工場コード
	 * @param userId ユーザID
	 * @param businessName 業務名
	 */
	public AutoIssue(IDbConnection conn, String plantCd, String userId, String businessName) {

		_iconn = conn;
		_conn =	_iconn.getConn();
		_plantCd = plantCd;
		_updInfo =	new	UpdateInfo(userId,businessName,0);

		// ログ用部品の初期化を行う
		String className = this.getClass().getName();
		className	= className.substring(0,className.lastIndexOf("."));
		_log = new Log(className,_iconn);
	}
	
	//----------------------------------------------------
	//      公開メソッド
	//----------------------------------------------------

	/**
	 * 自動出庫処理・メイン処理
	 * @param inParam 自動出庫起動パラメータ<pre>
	 *   m_WORK_ODR_CD          作業計画番号
	 *   m_WORK_IN_PROC_CD      作業コード
	 *   m_PARTIAL_PRD_NO       分作回数
	 *   m_OPR_RSLT_CRCT_NO     作業実績訂正回数
	 *   m_PUCH_ODR_CD          発注番号
	 *   m_ACPT_NO              受入回数
	 *   m_ACPT_RSLT_CRCT_NO    受入訂正回数
	 *   m_RCV_ISSUE_TYP        自動出庫処理区分
	 *   m_RCV_ISSUE_DATE       出庫年月日
	 *   m_RCV_ISSUE_RSLT_NO    処理対象実績数
	 *   m_RCV_ISSUE_CMPLT_FLG  出庫完了フラグ
	 *   m_PLANT_CD             工場コード
	 * </pre>
	 * 
	 * @return true/false  (true;正常終了(警告を含む) false; 異常終了）
	 *  <pre>
	 *  実行結果がfalseの場合は、自動出庫結果のメッセージコードリストを取得して
	 *  適宜、エラーメッセージ出力処理を行う必要があります。
	 *          メッセージコードリスト形式:  String[]のList 
	 *                                       String[0]--> メッセージコード
	 *                                       String[1]--> メッセージ詳細（品目コードまたは出庫指示番号）
	 *  </pre>
	 * @throws SQLException
	 */
	public boolean AutoIssueOpr(WhAutoIssueProc.AutoIssueParam inParam)		
			throws SQLException, FoundationException {

		int	iIssueCount	= 0;
		boolean ret = false;	//自動出庫処理結果

		//自動出庫対象品目の出庫指示情報リスト
		List alT_ISSUE_INST = null;
		
		try
		{
			_log.methodStart();
			//入力パラメータを取得
			gin = inParam;

/**DEGUB**/			_log.message("(SBM0451) 作業計画番号=["+gin.m_WORK_ODR_CD+"]");
/**DEGUB**/			_log.message("(SBM0873) 作業コード=["+gin.m_WORK_IN_PROC_CD+"]");
/**DEGUB**/			_log.message("(SBM0874) 分作回数=["+gin.m_PARTIAL_PRD_NO+"]");
/**DEGUB**/			_log.message("(SBM0875) 作業実績訂正回数=["+gin.m_OPR_RSLT_CRCT_NO+"]");
/**DEGUB**/			_log.message("(SBM0452) 発注番号=["+gin.m_PUCH_ODR_CD+"]");
/**DEGUB**/			_log.message("(SBM0876) 受入回数=["+gin.m_ACPT_NO+"]");
/**DEGUB**/			_log.message("(SBM0877) 受入訂正回数=["+gin.m_ACPT_RSLT_CRCT_NO+"]");
/**DEGUB**/			_log.message("(SBM0878) 自動出庫処理区分=["+gin.m_RCV_ISSUE_TYP+"]");
/**DEGUB**/			_log.message("(SBM0879) 出庫年月日=["+gin.m_RCV_ISSUE_DATE+"]");
/**DEGUB**/			_log.message("(SBM0880) 処理対象実績数=["+gin.m_RCV_ISSUE_RSLT_NO+"]");
/**DEGUB**/			_log.message("(SBM0881) 出庫完了フラグ=["+gin.m_RCV_ISSUE_CMPLT_FLG+"]");
/**DEGUB**/			_log.message("(SBM0399) 工場コード=["+gin.m_PLANT_CD+"]");

			// 【入力パラメータチェック】
			//自動出庫処理区分が２：自動出庫　でない場合エラー
			if (gin.m_RCV_ISSUE_TYP != 2){
				_log.message("(SBM0882) 自動出庫処理区分=["+gin.m_RCV_ISSUE_TYP+"] が不正(2以外)なので、" +
						"処理を終了します。");
				IllegalArgumentException e = new IllegalArgumentException(
                        this.getClass().getName());
				throw e;
			}

			if (gin.m_PUCH_ODR_CD == null || gin.m_PUCH_ODR_CD.equals(""))
			{
				if (inParam.m_OPR_RSLT_CRCT_NO < 0 )
				{
					_log.message("(SBM0883) 作業実績訂正回数=["+inParam.m_OPR_RSLT_CRCT_NO+"] が不正なので、" +
							"処理を終了します。");
					IllegalArgumentException e = new IllegalArgumentException(
					                               this.getClass().getName());
					throw e;
				};
			} else {
				if (gin.m_ACPT_RSLT_CRCT_NO < 0 )
				{
					_log.message("(SBM0884) 受入訂正回数=["+gin.m_ACPT_RSLT_CRCT_NO+"] が不正なので、" +
							"処理を終了します。");
					IllegalArgumentException e = new IllegalArgumentException(
                            this.getClass().getName());
					throw e;
				};
			}
			//**************************************************
			//    前回出庫済の自動出庫品目の【出庫取消処理】
			//**************************************************
			if (StringUtil.Validate(inParam.m_PUCH_ODR_CD))
			{
				if (inParam.m_ACPT_RSLT_CRCT_NO > 0)
				{
					//「発注番号」＝NotNullの場合　かつ　受入訂正回数　>　0
					ret = cancel_AutoIssue("2");
				}
				else{
					ret = true;
				}
			} else {
				if (inParam.m_OPR_RSLT_CRCT_NO >	0 )
				{
					//「発注番号」＝Nullの場合　かつ　作業実績訂正回数　>　0
					ret = cancel_AutoIssue("1");
				}
				else{
					ret = true;
				}
			}
			if (!ret) {
			    return false;
			}

			//**************************************************
			//    今回の自動出庫品目の【出庫処理】
			//**************************************************

			// 	＜自動出庫対象品目の検索＞
			if (StringUtil.Validate(inParam.m_PUCH_ODR_CD))
			{
				//自動出庫処理対象品目検索（発注番号による検索）
/**DEGUB**/			_log.message("(SBM0899) 自動出庫の発注番号検索");
			    alT_ISSUE_INST = getItemList("2");
			} else {
			    //自動出庫処理対象品目検索（作業計画番号による検索）
/**DEGUB**/			_log.message("(SBM0900) 自動出庫の作業計画番号検索");
			  	alT_ISSUE_INST = getItemList("1");
			}
			
			// 自動出庫処理対象品目セット情報がある間
			iIssueCount	= alT_ISSUE_INST.size();
/**DEGUB**/		_log.message("(SBM0901) 自動出庫処理対象品目件数=["+iIssueCount+"]");

			for(int cnt=0; cnt < iIssueCount; cnt++)
			{
			    // 出庫対象品目情報の取り出し
				IssueInstStruct stII = (IssueInstStruct)alT_ISSUE_INST.get(cnt);
			    
			    WhAutoIssueProc sProc = new WhAutoIssueProc(_iconn,
			            								_plantCd,
			                                            _updInfo.getUpdateBy(),
			                                            _updInfo.getUpdatePrgNm());
			    ret = sProc.exec(inParam, stII);
			    if (ret) {
//			        _infoList.addAll(sProc.getInfoList());
//			        _warnList.addAll(sProc.getWarnList());
			    } else {
				    _infoList.clear();	
				    _warnList.clear();
				    _errorList.addAll(sProc.getErrorList());
			    }
			}
			if(iIssueCount == 0)  ret = true;

			_log.methodEnd();
		} catch (IllegalArgumentException ie) {
			StackTraceElement e	= (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName =	e.getMethodName();
		    throw new FoundationException(className,methodName,"(SBM0890) 引数エラー");
		}
		finally {
		}

		return ret;
	}
	
	//-------------------------------------------------------
	//      非公開メソッド
	//-------------------------------------------------------
	/*
	 *   <pre>
	 *   【	出庫済自動出庫品目の出庫取消処理　】
	 * 
	 * 	《１．「発注番号」＝Nullの場合の[保管区別入出庫]に対する検索条件》
	 *	[保管区別入出庫]."作業計画番号"＝「作業計画番号」
	 *	[保管区別入出庫]."作業コード"＝「作業コード」
	 *	[保管区別入出庫]."分作回数"＝「分作回数」
	 *	[保管区別入出庫]."作業実績訂正回数"＝「作業実績訂正回数」－１
	 *	[保管区別入出庫]."在庫更新区分"＝2(更新済)
	 *	[保管区別入出庫]."入出庫管理番号"の昇順
	 *	[出庫指示]注1."出庫指示出庫区分"＝3(自動出庫)
	 *
	 *	《２．「発注番号」＝NotNullの場合の[保管区別入出庫]に対する検索条件》
	 *	[保管区別入出庫]."発注番号"＝「発注番号」
	 *	[保管区別入出庫]."受入回数"＝「受入回数」
	 *	[保管区別入出庫]."受入実績訂正回数"＝「受入訂正回数」－１
	 *	[保管区別入出庫]."在庫更新区分"＝2（更新済）
	 *	[保管区別入出庫]."入出庫管理番号"の昇順
	 *	[出庫指示]注1."出庫指示出庫区分"＝3(自動出庫)
	 *
	 *  </pre>
	 * @throws SQLException
	 */
	private	boolean cancel_AutoIssue(String iTyp)	
	                       throws SQLException,FoundationException {

	    
	    /**
		 * [保管区別入出庫]に対する検索条件のSELECT区の共通定義
		 */	
		final String SqlStr_SELECT_RCV_ISSUE = 
		    "select "
			+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD as RCV_ISSUE_CTRL_CD, "
			+" T_RCV_ISSUE.RCV_ISSUE_TYP as RCV_ISSUE_TYP,"
			+" T_RCV_ISSUE.ITEM_CD as ITEM_CD,"
			+" T_RCV_ISSUE.PLANT_CD as PLANT_CD,"
			+" T_RCV_ISSUE.WH_CD as WH_CD,"
			+" T_RCV_ISSUE.JOB_ODR_CD as JOB_ODR_CD,"
			+" T_RCV_ISSUE.JOB_ODR_DETAIL_NO as JOB_ODR_DETAIL_NO,"
			+" T_RCV_ISSUE.PUCH_ODR_CD as PUCH_ODR_CD,"
			+" T_RCV_ISSUE.ACPT_NO as ACPT_NO,"
			+" T_RCV_ISSUE.ACPT_RSLT_CRCT_NO as ACPT_RSLT_CRCT_NO,"
			+" T_RCV_ISSUE.INSPEC_RSLT_CRCT_NO as INSPEC_RSLT_CRCT_NO,"
			+" T_RCV_ISSUE.WORK_ODR_CD as WORK_ODR_CD,"
			+" T_RCV_ISSUE.WORK_IN_PROC_CD as WORK_IN_PROC_CD,"
			+" T_RCV_ISSUE.PARTIAL_PRD_NO as PARTIAL_PRD_NO,"
			+" T_RCV_ISSUE.OPR_RSLT_CRCT_NO as OPR_RSLT_CRCT_NO,"
			+" T_RCV_ISSUE.ISSUE_INST_CD as ISSUE_INST_CD,"
			+" T_RCV_ISSUE.RCV_ISSUE_QTY as RCV_ISSUE_QTY,"
			+" T_RCV_ISSUE.RCV_ISSUE_AMOUNT as RCV_ISSUE_AMOUNT,"
			+" T_RCV_ISSUE.RCV_ISSUE_DATE as RCV_ISSUE_DATE,"
			+" T_RCV_ISSUE.RCV_ISSUE_GNR_TYP as RCV_ISSUE_GNR_TYP,"
			+" T_RCV_ISSUE.RCV_ISSUE_ODD_QTY as RCV_ISSUE_ODD_QTY,"
			+" T_RCV_ISSUE.DEFECT_CAUSE_CD as DEFECT_CAUSE_CD,"
			+" T_RCV_ISSUE.STOCK_UPD_TYP as STOCK_UPD_TYP,"
			+" T_RCV_ISSUE.RCV_ISSUE_CMPLT_FLG as RCV_ISSUE_CMPLT_FLG,"
			+" T_RCV_ISSUE.OD_NO as OD_NO,"
			+" T_RCV_ISSUE.VEND_LOT_NO as VEND_LOT_NO,"
			+" T_RCV_ISSUE.RCV_ISSUE_COMMENT as RCV_ISSUE_COMMENT,"
			+" T_RCV_ISSUE.COMPANY_CD as COMPANY_CD,"
			+" T_RCV_ISSUE.VEND_CD as VEND_CD,"
			+" T_RCV_ISSUE.CONS_TYP as CONS_TYP,"
			+" T_RCV_ISSUE.CONS_EXEC_DATE as CONS_EXEC_DATE, "
			+" T_ISSUE_INST.COMPANY_CD as ISSUE_INST_COMPANY_CD, "
			+" T_ISSUE_INST.VEND_CD as ISSUE_INST_VEND_CD, "
			+" T_ISSUE_INST.PLANT_CD as ISSUE_INST_PLANT_CD, "
			+" DECODE(T_OD.MRP_ODR_TYP, 1, T_OD.JOB_ODR_CD, 2, T_OD.JOB_ODR_CD, null) as OD_JOB_ODR_CD, "
			+" DECODE(T_OD.MRP_ODR_TYP, 1, T_OD.JOB_ODR_DETAIL_NO, 2, T_OD.JOB_ODR_DETAIL_NO, 0) as OD_JOB_ODR_DETAIL_NO, "
			+" T_ISSUE_INST.ITEM_CD as ISSUE_INST_ITEM_CD, "
            +" T_ISSUE_INST.CONS_TYP as ISSUE_INST_CONS_TYP, "
            +" T_RCV_ISSUE.LOT_NO as LOT_NO "; // 在庫ロット番号
		final String SqlStr_FROM_RCV_ISSUE = 
		    "from  T_RCV_ISSUE , T_ISSUE_INST, T_OD ";	//[保管区別入出庫] , [出庫指示]
		final String SqlStr_ODRBY_RCV_ISSUE = 
			"order by T_RCV_ISSUE.RCV_ISSUE_CTRL_CD ";
		
	    PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		String sCtrlCd = "";	//入出庫管理番号
		
		boolean ret_issue = false;		//出庫処理結果
		
		try
		{
			_log.methodStart();
			
			// << 保管区別入出庫を検索 >>
			
			if (iTyp.equals("1")) {
    			if(StringUtil.Validate(gin.m_WORK_IN_PROC_CD)) {
    				sql	= SqlStr_SELECT_RCV_ISSUE
    				+ SqlStr_FROM_RCV_ISSUE
    				+"where "
    				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD "
						+" and T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
    				+" and T_RCV_ISSUE.WORK_ODR_CD = ? "
    				+" and T_RCV_ISSUE.WORK_IN_PROC_CD = ? "
    				+" and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
    				+" and T_RCV_ISSUE.OPR_RSLT_CRCT_NO = ? "
    				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2 "
    				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
    				+ SqlStr_ODRBY_RCV_ISSUE;

    				ps = _conn.prepareStatement(sql);
    				ps.setString(1,	gin.m_WORK_ODR_CD);			//作業計画番号
    				ps.setString(2,	gin.m_WORK_IN_PROC_CD);		//仕掛作業コード
    				ps.setInt(3,	gin.m_PARTIAL_PRD_NO);			//分作回数
    				ps.setInt(4,	gin.m_OPR_RSLT_CRCT_NO	-1);	//作業実績訂正回数

    			} else {
    				sql	= SqlStr_SELECT_RCV_ISSUE
    				+ SqlStr_FROM_RCV_ISSUE
    				+"where "
    				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD "
						+" and T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
    				+" and T_RCV_ISSUE.WORK_ODR_CD = ? "
    				+" and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
    				+" and T_RCV_ISSUE.OPR_RSLT_CRCT_NO = ? "
    				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2 "
    				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
    				+ SqlStr_ODRBY_RCV_ISSUE;
    				ps = _conn.prepareStatement(sql);
    				ps.setString(1,	gin.m_WORK_ODR_CD);			//作業計画番号
    				ps.setInt(2,	gin.m_PARTIAL_PRD_NO);		//分作回数
    				ps.setInt(3,	gin.m_OPR_RSLT_CRCT_NO	-1);//作業実績訂正回数
    			}
			} else if (iTyp.equals("2")) {
    			sql	= SqlStr_SELECT_RCV_ISSUE
				+ SqlStr_FROM_RCV_ISSUE
				+"where "
				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD"
				+" and T_ISSUE_INST.OD_NO = T_OD.OD_NO(+) "
				+" and T_RCV_ISSUE.PUCH_ODR_CD = ?"
				+" and T_RCV_ISSUE.ACPT_NO = ?"
				+" and T_RCV_ISSUE.ACPT_RSLT_CRCT_NO = ?"
				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2"
				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
				+ SqlStr_ODRBY_RCV_ISSUE;
    			ps = _conn.prepareStatement(sql);
    			ps.setString(1,	gin.m_PUCH_ODR_CD);				//発注番号
    			ps.setInt(2,	gin.m_ACPT_NO);					//受入回数
    			ps.setInt(3,	gin.m_ACPT_RSLT_CRCT_NO - 1);	//受入訂正回数
			}
			
/**DEGUB**/		_log.message(sql);
			rs = ps.executeQuery();
			
			IssueProcess wIssueProcess;		// 出庫処理のオブジェクト
			String MsgCd = null;
			
			ret_issue = true;
			while (rs.next())
			{
			    MsgCd = "";
			    //出庫取消のための保管区別入出庫レコード登録
				sCtrlCd	= cancel_RcvIssue(rs);
				//出庫処理を呼び出し
				_log.message("(SBM0903) 出庫処理を呼び出します（前回出庫の取消）");
				wIssueProcess = new IssueProcess(_iconn, sCtrlCd);
				ret_issue = wIssueProcess.execProcess();
			    if (ret_issue) {
			        //インフォメーションメッセージを保存
			        for (Iterator itr=wIssueProcess.getInfoList().iterator(); itr.hasNext(); ) {
			            MsgCd = (String)itr.next();
			            setInfoList(MsgCd, strDtl + rs.getString("ISSUE_INST_CD"));
			        }
			        //ワーニングメッセージは保存しない（現在、IssueProxessから返却されていないため）
			    } else {
			        _infoList.clear();	
			        _warnList.clear();
			        //エラーメッセージを保存
			        for (Iterator itr=wIssueProcess.getErrorList().iterator(); itr.hasNext(); ) {
			            MsgCd = (String)itr.next();
			            setErrorList(MsgCd, strDtl + rs.getString("ISSUE_INST_CD"));
			        }
			        break;
			    }
				// [出庫指示]."支給区分"=1：有償支給の場合、[有償支給履歴]に追加する
				if (rs.getInt("ISSUE_INST_CONS_TYP") == 1) {
					// [有償支給履歴追加]
					insertPastOnerousCons(_iconn, rs, sCtrlCd);
				}
			}
			
			_log.methodEnd();
		}
		finally {
			if (rs != null)		{ rs.close();}
			if (ps != null)		{ ps.close();}
		}
		
		return ret_issue;
	}

	/**
	 * 
	 * 前回の出庫取消のための[保管区別入出庫]を追加します。
	 * （赤レコード追加処理）
	 * @param rs  登録情報(ResultSet)
	 * @return　String 登録したレコードの入出庫管理番号
	 * @throws SQLException
	 * @throws Exception
	 *
	 */
	private	String cancel_RcvIssue(ResultSet rs	)
			throws SQLException,FoundationException {
		String strOdrCd="";

		try
		{
			_log.methodStart();
	
			//登録データの設定
			RcvIssueStruct sData = new RcvIssueStruct();
			
			sData.m_RCV_ISSUE_TYP = 2;											//	入出庫区分
			sData.m_ITEM_CD = rs.getString("ITEM_CD");							//	品目番号
			sData.m_PLANT_CD = rs.getString("PLANT_CD");						//	工場コード
			sData.m_WH_CD = rs.getString("WH_CD");								//	保管区コード
			sData.m_JOB_ODR_CD = rs.getString("JOB_ODR_CD");					//	製番
			sData.m_JOB_ODR_DETAIL_NO = rs.getInt("JOB_ODR_DETAIL_NO");			//	製番枝番
			sData.m_PUCH_ODR_CD = rs.getString("PUCH_ODR_CD");					//	発注番号
			sData.m_ACPT_NO = rs.getInt("ACPT_NO");								//	受入回数
			sData.m_ACPT_RSLT_CRCT_NO = rs.getInt("ACPT_RSLT_CRCT_NO");			//	受入実績訂正回数
			sData.m_INSPEC_RSLT_CRCT_NO = rs.getInt("INSPEC_RSLT_CRCT_NO");		//	検査実績訂正回数
			sData.m_WORK_ODR_CD = rs.getString("WORK_ODR_CD");					//	作業計画番号
			sData.m_WORK_IN_PROC_CD = rs.getString("WORK_IN_PROC_CD");			//	仕掛作業コード
			sData.m_PARTIAL_PRD_NO = rs.getInt("PARTIAL_PRD_NO");				//	分作回数
			sData.m_OPR_RSLT_CRCT_NO = rs.getInt("OPR_RSLT_CRCT_NO");			//	作業実績訂正回数
			sData.m_ISSUE_INST_CD = rs.getString("ISSUE_INST_CD");				//	出庫指示番号
			sData.m_RCV_ISSUE_QTY = 
					rs.getBigDecimal("RCV_ISSUE_QTY").multiply(new BigDecimal(-1));	//	入出庫数
			sData.m_RCV_ISSUE_AMOUNT = rs.getBigDecimal("RCV_ISSUE_AMOUNT");	//	入出庫金額
			sData.m_RCV_ISSUE_DATE = rs.getDate("RCV_ISSUE_DATE");				//	入出庫年月日
			sData.m_RCV_ISSUE_GNR_TYP = 29;										//	入出庫発生区分
			sData.m_RCV_ISSUE_ODD_QTY = rs.getBigDecimal("RCV_ISSUE_ODD_QTY");	//	入出庫端数
			sData.m_DEFECT_CAUSE_CD = rs.getString("DEFECT_CAUSE_CD");			//	入出庫不良理由コード
			sData.m_STOCK_UPD_TYP = 1;											//	在庫更新区分
			sData.m_RCV_ISSUE_CMPLT_FLG = rs.getInt("RCV_ISSUE_CMPLT_FLG");		//	入出庫完了フラグ
			sData.m_OD_NO = rs.getString("OD_NO");								//	オーダデマンド番号
			sData.m_VEND_LOT_NO = rs.getString("VEND_LOT_NO");					//	メーカロット番号
			sData.m_RCV_ISSUE_COMMENT = rs.getString("RCV_ISSUE_COMMENT");		//	入出庫備考
			sData.m_COMPANY_CD = rs.getString("COMPANY_CD");					//	会社コード
			sData.m_VEND_CD = rs.getString("VEND_CD");							//	取引先コード
			sData.m_CONS_TYP = rs.getInt("CONS_TYP");							//	支給区分
			sData.m_CONS_EXEC_DATE = rs.getDate("CONS_EXEC_DATE");				//	有償支給実績抽出日
            sData.m_LOT_NO = rs.getString("LOT_NO"); // 在庫ロット番号
			//<< 保管区別入出庫の登録 >>
			RcvIssueEntity sRcvIssueEntity = new RcvIssueEntity(_iconn,_updInfo);
			strOdrCd = sRcvIssueEntity.insert(sData);

			_log.methodEnd();
		}
		finally {
		}
		return strOdrCd;
	};

	/**
	 * 
	 *   [有償支給履歴]ファイルへのレコード追加
	 * @param conn コネクション情報
	 * @param rs 保管区別入出庫データ 
	 * @param sCtrlCd 入出庫管理番号
	 * @throws SQLException
	 * @throws Exception
	 *
	 */
	private	void insertPastOnerousCons(IDbConnection conn, ResultSet rs, String sCtrlCd) 
			throws SQLException, FoundationException {
		PreparedStatement ps=null;
		String sql="";
		int	iIndex =0;
		int	iRC	= 0;
		String strOdrCd="";
		boolean ret;
		
		java.util.Date dtDate = null;
		try
		{
			_log.methodStart();
			//[支給単価]を検索
			ConsUnitCost sCost = new ConsUnitCost(_iconn);
			ret = false;
			ret = sCost.read(rs.getString("ISSUE_INST_COMPANY_CD"), rs.getString("ISSUE_INST_VEND_CD"),
			                 rs.getString("ISSUE_INST_PLANT_CD"), rs.getString("ISSUE_INST_ITEM_CD"),
			                 gin.m_RCV_ISSUE_DATE);
			                 
			_log.message("(SBM0905) 有償支給番号の採番");
			//有償支給番号の採番
			Numbering ODR_CD = new Numbering(_iconn,Numbering.ONERCONS_CD,
				                             _updInfo.getUpdateBy(),
				                             _updInfo.getUpdatePrgNm(),
				                             _plantCd);
			strOdrCd = ODR_CD.getNo();
			//Insert
			sql	= " INSERT INTO  T_PAST_ONEROUS_CONS ( "
				+" ONEROUS_CONS_NO	,"				//有償支給番号
				+" COMPANY_CD ,"					//会社コード
				+" VEND_CD ,"						//取引先コード
				+" PLANT_CD ,"						//工場コード
				+" JOB_ODR_CD ,"					//製番
				+" JOB_ODR_DETAIL_NO ,"				//製番枝番
				+" ITEM_CD ,"						//品目番号
				+" ISSUE_DATE ,"					//出庫日
				+" ISSUE_QTY ,"						//出庫数
				+" UNIT_COST ,"						//単価
				+" UNIT_COST_TYP ,"					//単価区分
				+" ONEROUS_CONS_COMMENT ,"			//有償支給備考
				+" VEND_LOT_NO ,"					//メーカロット番号
				+" RCV_ISSUE_CTRL_CD ,"				//入出庫管理番号
				+" WORK_ODR_CD ,"					//作業計画番号
				+" WORK_IN_PROC_CD ,"				//仕掛作業コード
				+" PUCH_ODR_CD ,"					//発注番号
				+" ISSUE_INST_CD ,"					//出庫指示番号
				+" RETURNED_WH_CD ,"					//返品先保管区コード
				+" RETURNED_CAUSE_CD ,"					//返品理由コード
				+" RETURNED_GNR_TYP ,"					//返品発生処理区分
				+" AP_PROC_TYP ,"					//買掛処理区分
				+" CREATED_BY ,"					//作成者
				+" CREATED_PRG_NM ,"				//作成プログラム名
				+" UPDATED_BY ,"					//更新者
				+" UPDATED_PRG_NM ,"				//更新プログラム名
				+" MODIFY_COUNT , "					//更新数
				+" LOT_NO )"
				+" values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
				+" ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
			iIndex = 1;
			ps = _conn.prepareStatement(sql);
			ps.setString(iIndex++, strOdrCd);						//有償支給番号
			ps.setString(iIndex++, rs.getString("ISSUE_INST_COMPANY_CD"));				//会社コード
			ps.setString(iIndex++, rs.getString("ISSUE_INST_VEND_CD"));				//取引先コード
			ps.setString(iIndex++, rs.getString("ISSUE_INST_PLANT_CD"));				//工場コード
			setNvl(iIndex++, rs.getString("OD_JOB_ODR_CD"), ps);				//製番
			ps.setInt(iIndex++, rs.getInt("OD_JOB_ODR_DETAIL_NO"));		//製番枝番
			ps.setString(iIndex++, rs.getString("ISSUE_INST_ITEM_CD"));		//品目番号

			dtDate = Converter.strToDate(gin.m_INSPC_ACPT_DATE,Converter.SLASH_DATE);
			ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));						//入出庫年月日
			ps.setBigDecimal(iIndex++, rs.getBigDecimal("RCV_ISSUE_QTY"));//出庫数
			if (ret) {	//支給単価レコードが存在した場合
				//単価
				if (sCost.getOnerousFlg() == 1) {
					ps.setBigDecimal(iIndex++, sCost.getUnitCost());
				} else if (sCost.getOnerousFlg() == 0) {
					ps.setDouble(iIndex++, 0);
				}
				//単価区分
			    ps.setInt(iIndex++, sCost.getUnitCostTyp());
			} else {	//支給単価レコードが存在しなかった場合				
				ps.setDouble(iIndex++, 0);		//単価
			    ps.setInt(iIndex++, 0);			//単価区分		    
			}
			ps.setNull(iIndex++, Types.VARCHAR);					//有償支給備考
			setNvl(iIndex++, rs.getString("VEND_LOT_NO"), ps);				//メーカロット番号
			ps.setString(iIndex++, sCtrlCd);		//入出庫管理番号
			ps.setString(iIndex++, rs.getString("WORK_ODR_CD"));					//作業計画番号
			ps.setString(iIndex++, rs.getString("WORK_IN_PROC_CD"));					//仕掛作業コード
			ps.setString(iIndex++, rs.getString("PUCH_ODR_CD"));			//発注番号
			ps.setString(iIndex++, rs.getString("ISSUE_INST_CD"));			//出庫指示番号
			ps.setString(iIndex++, rs.getString("WH_CD"));				//返品先保管区コード
			ps.setNull(iIndex++, Types.VARCHAR);				//返品理由コード
			ps.setInt(iIndex++, 3);			//返品発生処理区分
			ps.setInt(iIndex++, 0);			//買掛処理区分
			//-----------------------------------------------------------------------
			ps.setString(iIndex++, _updInfo.getUpdateBy());			//作成者
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm());		//作成プログラム名
			ps.setString(iIndex++, _updInfo.getUpdateBy());			//更新者
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm());		//更新プログラム名
			ps.setDouble(iIndex++, 0);								//更新数
            ps.setString(iIndex++, rs.getString("LOT_NO")); // 在庫ロット番号
			iRC	= ps.executeUpdate();
			
			_log.methodEnd();
		} catch(ParseException pe) {
			StackTraceElement e	= (new Throwable()).getStackTrace()[1];
			String className = e.getClassName();
			String methodName =	e.getMethodName();
			throw new FoundationException(className,methodName,"ParseException");
		} finally {
			if (ps != null){
				try{
					ps.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				ps = null;
			}
		}
		return ;
	}

	/**
	 * <pre>
	 * 【自動出庫対象品目の検索】	
	 * 自動出庫処理対象品目セット情報生成（自動出庫数の算出）
	 * </pre>
　　 * 
     */
	private	List getItemList(String sTyp)
		throws SQLException {
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		String sql_select = "SELECT " +
				" A.ISSUE_INST_CD," +
				" A.PLANT_CD," +
				" A.OD_NO," +
				" A.ITEM_CD," +
				" A.PS_EDITION," +
				" A.PUCH_ODR_CD," +
				" A.COMPANY_CD, " +
				" A.VEND_CD," +
				" A.CONS_TYP," +
				" A.WORK_ODR_CD," +
				" A.WORK_IN_PROC_CD," +
				" A.WS_CD," +
				" A.WH_CD," +
				" A.ISSUE_INST_UNIT_QTY," +
				" A.ISSUE_INST_UNIT_DENOMINATOR," +
				" A.ISSUE_INST_UNIT_NUMERATOR," +
				" A.ISSUE_INST_QTY," +
				" A.TOTAL_ISSUE_QTY," +
				" A.SCDL_ISSUE_DATE," +
				" A.ISSUE_CMPLT_DATE," +
				" A.ISSUE_TYP," +
				" A.ISSUE_CMPLT_FLG," +
				" A.ISSUE_INST_ISS_FLG," +
				" A.ISSUE_INST_ISS_DATE," +
				" A.ISSUE_INST_COMMENT," +
				" B.UNIT_QTY_TYP," +
				" C.MRP_ODR_TYP "; 	

		String sql_from = " FROM T_ISSUE_INST A, M_ITEM B, T_OD C ";
		String sql_where = " WHERE A.ITEM_CD = B.ITEM_CD  AND A.OD_NO = C.OD_NO ";

		IssueInstStruct stIssueInst;
		
		List alT_ISSUE_INST = new ArrayList();
		
		int	iCount = 0;
		int	iIndex = 0;
		int	wUnitQtyTyp = 0;
		BigDecimal bdIssueNO0=null;
		BigDecimal bdIssueNO1=null;
		BigDecimal bdIssueNO2=null;
		BigDecimal bdIssueNO3=null;
		try
		{
			_log.methodStart();

			if (!sTyp.equals("1") && !sTyp.equals("2")) {
				return alT_ISSUE_INST;
			}

			if (sTyp.equals("1")) {		//--- 作業計画番号による検索 ---
				//《「発注番号」＝Nullのとき》
				//"作業計画番号"＝「作業計画番号」
				//"作業コード"＝「作業コード」
				//"出庫区分"＝3(自動出庫)
				//"出庫指示番号"の昇順
			    if(StringUtil.Validate(gin.m_WORK_IN_PROC_CD))
			    {
			        sql	= sql_select + sql_from +
			        sql_where +
			        " AND (A.WORK_ODR_CD=? AND A.WORK_IN_PROC_CD=?" +
			        " AND A.ISSUE_TYP=3) " +
			        " ORDER BY A.ISSUE_INST_CD ";
			        ps = _conn.prepareStatement(sql);
			        ps.setString(1,	gin.m_WORK_ODR_CD);
			        ps.setString(2,	gin.m_WORK_IN_PROC_CD);
			    } else {
			        sql	= sql_select + sql_from +
			        sql_where +
			        " AND (A.WORK_ODR_CD=? AND A.ISSUE_TYP=3) " +
			        " ORDER BY A.ISSUE_INST_CD ";
			        ps = _conn.prepareStatement(sql);
			        ps.setString(1,	gin.m_WORK_ODR_CD);
			    }
			} else if (sTyp.equals("2")) {	//--- 発注番号による検索
				//《「発注番号」＝Not Nullのとき》
				//"発注番号"＝「発注番号」
				//"出庫区分"＝3(自動出庫)
				//"出庫指示番号"の昇順
				sql	= sql_select + sql_from +
				      sql_where + 
				      " AND (A.PUCH_ODR_CD=? AND A.ISSUE_TYP=3) " +
				      " ORDER BY A.ISSUE_INST_CD " ;
				ps = _conn.prepareStatement(sql);
				ps.setString(1,	gin.m_PUCH_ODR_CD);
			}
/**DEGUB**/			_log.message("(SBM0906) 自動出庫処理対象品目検索(作業計画番号検索or発注番号検索)sTyp=["+sTyp+"]");
/**DEGUB**/			_log.message("ｓｑｌ=["+sql+"]");

			rs = ps.executeQuery();

			while (rs.next())
			{							
				
				//品目ごとの自動出庫数を算出
				bdIssueNO1 = new BigDecimal(gin.m_RCV_ISSUE_RSLT_NO);	//処理対象実績数
				bdIssueNO2 = new BigDecimal(rs.getString("ISSUE_INST_UNIT_NUMERATOR"));//分子
				bdIssueNO3 = new BigDecimal(rs.getString("ISSUE_INST_UNIT_DENOMINATOR"));//分母
				wUnitQtyTyp = rs.getInt("UNIT_QTY_TYP");		//在庫数単位区分;

				//出庫指示数 =   処理対象実績数 * 出庫単位数分子 / 出庫単位数分母
				bdIssueNO0 = ((bdIssueNO1.multiply
								(bdIssueNO2)).divide
								(bdIssueNO3, 10, BigDecimal.ROUND_UP));

				if (wUnitQtyTyp == 1) {				// 整数管理
					//小数切上げ
					bdIssueNO0 = bdIssueNO0.setScale(0,	BigDecimal.ROUND_UP);

				} else if (wUnitQtyTyp == 2) {		// 小数管理
					//小数第５位切上げ切上げ
					bdIssueNO0 = bdIssueNO0.setScale(4,	BigDecimal.ROUND_UP);
					
/**DEGUB**/		_log.message("(SBM0907) 小数管理=["+bdIssueNO1.toString()+"]");
				}

				//出庫対象品目情報を退避
				stIssueInst = new IssueInstStruct();
				
				stIssueInst.m_AUTO_ISSUE_QTY = bdIssueNO0;		//処理対象実績数を元に算出した自動出庫数
				stIssueInst.m_ISSUE_INST_CD =	Nvl(rs.getString("ISSUE_INST_CD"));	//出庫指示番号
				stIssueInst.m_PLANT_CD =		Nvl(rs.getString("PLANT_CD"));		//工場コード			
				stIssueInst.m_OD_NO =			Nvl(rs.getString("OD_NO"));			//オーダデマンド番号
				stIssueInst.m_ITEM_CD =			Nvl(rs.getString("ITEM_CD"));		//品目コード	
				stIssueInst.m_PUCH_ODR_CD =		Nvl(rs.getString("PUCH_ODR_CD"));	//発注番号		
				stIssueInst.m_COMPANY_CD =		Nvl(rs.getString("COMPANY_CD"));	//会社コード		
				stIssueInst.m_VEND_CD =			Nvl(rs.getString("VEND_CD"));		//取引先コード	
				stIssueInst.m_WORK_ODR_CD =		Nvl(rs.getString("WORK_ODR_CD"));	//作業計画番号		
				stIssueInst.m_WORK_IN_PROC_CD =	Nvl(rs.getString("WORK_IN_PROC_CD"));//仕掛作業コード			
				stIssueInst.m_WS_CD =		 	Nvl(rs.getString("WS_CD"));			//作業区コード
				stIssueInst.m_WH_CD =		 	Nvl(rs.getString("WH_CD"));			//工程保管場所コード			
				stIssueInst.m_CONS_TYP =		rs.getInt("CONS_TYP");				//支給区分
				stIssueInst.m_MRP_ODR_TYP = 	rs.getInt("MRP_ODR_TYP");			//品目手配区分
				stIssueInst.m_UNIT_QTY_TYP = 	rs.getInt("UNIT_QTY_TYP");			//在庫数単位区分
				
				alT_ISSUE_INST.add(stIssueInst);
			};
			rs.close();
			ps.close();

			_log.methodEnd();
		}
		finally {
			if (rs != null)	{ rs.close(); }
			if (ps != null)	{ ps.close(); }
		}
		return alT_ISSUE_INST;
	};

	//************************************************************************************
	//      メッセージ処理用メソッド
	//************************************************************************************
	/** 情報メッセージ格納リスト */
	private ArrayList _infoList = new ArrayList();
	/** 警告メッセージ格納リスト */
	private ArrayList _warnList = new ArrayList();
	/** エラーメッセージ格納リスト */
	private ArrayList _errorList = new ArrayList();

	/**
	 * インフォメーションメッセージ設定
	 * @param iMsgCd　メッセージコード
	 * @param iMsgDetail　メッセージ詳細（出庫指示番号）
	 */
	private void setInfoList(String iMsgCd, String iMsgDetail)
	{
	    String[] w_msg =  new String[2];
	    
	    w_msg[0] = iMsgCd;
	    w_msg[1] = iMsgDetail;
	    _infoList.add(w_msg);
		return;
	}
	/**
	 * エラーメッセージ設定
	 * @param iMsgCd　メッセージコード
	 * @param iMsgDetail　メッセージ詳細（出庫指示番号）
	 */
	private void setErrorList(String iMsgCd,String iMsgDetail)
	{
	    String[] w_msg =  new String[2];

	    _infoList.clear();	
	    _warnList.clear();
	    w_msg[0] = iMsgCd;
	    w_msg[1] = iMsgDetail;
	    _errorList.add(w_msg);
		return;
	}
	
	/**
	 * エラーメッセージを取得します。 
	 * @return エラーリスト(メッセージコード(String) のリスト）
	 * 	<pre> メッセージコードリスト形式:
	 *                     String[]のList 
	 *                     String[0]--> メッセージコード
	 *                     String[1]--> メッセージ詳細（出庫指示番号）
     *  </pre>
	 * 
	 */
	public ArrayList getErrorList()
	{
		return _errorList;
	}

	/**
	 * インフォメーションメッセージを取得します。 
	 * @return infoリスト
	 * 	<pre> メッセージコードリスト形式:
	 *                     String[]のList 
	 *                     String[0]--> メッセージコード
	 *                     String[1]--> メッセージ詳細（出庫指示番号）
     *  </pre>
	 */
	public ArrayList getInfoList()
	{
		return _infoList;
	}

	/**
	 * 警告メッセージを取得します。 
	 * @return warnリスト
	 * 	<pre> メッセージコードリスト形式:
	 *                     String[]のList 
	 *                     String[0]--> メッセージコード
	 *                     String[1]--> メッセージ詳細（品目番号）
     *  </pre>
	 */
	public ArrayList getWarnList()
	{
		return _warnList;
	}
	
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
	//***************************************************************
	
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

	// -------------------------------------------------------------------------------------------
	//	 Common	Sub	Class
	// -------------------------------------------------------------------------------------------

	/**
	 * ログ出力(インナークラス)
	 */
	class Log {
		private	int	indent = 0;
		private	SystemLog _syslog =	new	SystemLog();   // ★★ログ出力クラス

		// コンストラクタ
		public Log(String className,IDbConnection	conn){
			// ★★	初期化
//			_syslog.init(className);
			_syslog.init("AUTO_ISSUE");
		}

		public void	methodStart() {
			log("start");
			indent++;
		}
		public void	methodEnd()	{
			indent--;
			log("end");
		}
		public void	message(String message)	{
			log(message);
		}
		private	void log(String	message) {

			// このメソッドを呼び出したメソッドを取得
			StackTraceElement e	= (new Throwable()).getStackTrace()[2];

			String className = e.getClassName();
			String methodName =	e.getMethodName();

			// パッケージ名を除くクラス名を取得
			StringTokenizer	st = new StringTokenizer(className,	".");
			String lastClassName = "";
			while (st.hasMoreTokens()) {
				lastClassName =	st.nextToken();
			}
			// 今の時間を取得
			Date now = new Date();
			SimpleDateFormat f = new SimpleDateFormat("M/d HH:mm:ss.SSS");
			String sNow	= f.format(now);
			String out = sNow +	" <" + indent +	"> [" +	lastClassName +	"/"	+ methodName + "] "	+  message;

			// ★★	ログ出力
			_syslog.fine_d(	out, _updInfo.getUpdateBy() );

			// ログ出力(System.out版)
//			System.out.println(out);
		}
	}
}
