/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common03/CommonIssue/CommonIssue.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

//package com.nec.jp.orteus.expj.stock;
package com.nec.jp.orteus.metamorBase.common03.CommonIssue;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Hashtable;
import java.math.BigDecimal;

import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.WorkCalendar;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.RcvIssue.IssueProcess;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
//import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
/**
 * <pre>
 * 自動出庫の共通処理を行う
 *
 * このクラス内部からは、SQLExceptionが発生する可能性があります。
 * </pre>
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.7 $ $Date: 2013/06/27 03:38:17 $
 */

public class CommonIssue {

	private	IDbConnection _iconn;					// トランザクションコネクション情報
	private	Connection _conn;						// コネクション情報
	private	String _plantCd;						// 工場コード
	private	UserInfo _userInfo;						// 利用者管理情報(インナークラス)
	private	Log	_log;								// ログ情報(インナークラス)
	private	IssueProcess _IssueProcess;				// 出庫処理のオブジェクト


	private		String	ginWORK_ODR_CD			  ;	//	作業計画番号
	private		String	ginWORK_IN_PROC_CD		  ;	//	作業コード
	private		String	ginPARTIAL_PRD_NO		  ;	//	分作回数
	private		String	ginOPR_RSLT_CRCT_NO		  ;	//	作業実績訂正回数
//	private		String	ginPRE_OPR_RSLT_CRCT_NO	  ;	//	前回作業実績訂正回数??????
	private		String	ginPUCH_ODR_CD			  ;	//	発注番号
	private		String	ginACPT_NO				  ;	//	受入回数
	private		String	ginACPT_RSLT_CRCT_NO	  ;	//	受入訂正回数???????????
//	private		String	ginPRE_ACPT_RSLT_CRCT_NO  ;	//	前回受入訂正回数?????????????
	private		String	ginRCV_ISSUE_TYP		  ;	//	自動出庫処理区分?????
	private		String	ginRCV_ISSUE_DATE		  ;	//	出庫年月日
	private		String	ginRCV_ISSUE_RSLT_NO	  ;	//	処理対象実績数????
	private		String	ginRCV_ISSUE_CMPLT_FLG	  ;	//	出庫完了フラグ
	private		String	ginPLANT_CD				  ;	//	工場コード

	//出庫指示の情報保存
	private	ArrayList alT_ISSUE_INST = new ArrayList();
	private	Hashtable htT_ISSUE_INST = new Hashtable();
	//保管区別入出庫の情報
	private	Hashtable htT_RCV_ISSUE	= new Hashtable();

	private	Hashtable	htIssueNO=new Hashtable();			//自動出庫数
	private	Hashtable	htUNIT_QTY_TYP=new Hashtable();		//在庫数単位区分
	private	Hashtable	htMRP_ODR_TYP=new Hashtable();		//品目手配区分

	private	Hashtable	htT_OD=new Hashtable();				//所要量情報
	private	String gsJOB_ODR_CD	= "";						//製番品の払出保管区の順序の検索条件「製番」
															//「個別手配分出庫可能数からの出庫」の場合、[出庫指示]."オーダデマンド番号"で一致する[所要量]の製番。
															//「製番引当分出庫可能数からの出庫」の場合、検索した[製番引当]."製番"

	/**
	 * コンストラクタ
	 * newするときには下記のパラメータを送る。工場コード,ユーザID,業務名は別途setterで設定し直すことも可能
	 *
	 * @param conn コネクション情報
	 * @param plantCd 工場コード
	 * @param userId ユーザID
	 * @param businessName 業務名
	 */
	public CommonIssue(IDbConnection conn, String plantCd, String userId, String businessName) {

		_iconn = conn;
		_conn =	_iconn.getConn();
		_plantCd = plantCd;
		_userInfo =	new	UserInfo(userId,businessName);

		// ログ用部品の初期化を行う
		String className = this.getClass().getName();
		className	= className.substring(0,className.lastIndexOf("."));
		_log = new Log(className,_iconn);
	}
	// setter
	public void	setPlantCd(String plantCd) {
		this._plantCd =	plantCd;
	}
	public void	setUserId(String userId) {
		_userInfo.userId = userId;
	}
	public void	setBusinessName(String businessName) {
		_userInfo.businessName = businessName;
	}

	/**
	 * 自動入庫処理・メイン処理
	 *
	 * @param inWORK_ODR_CD					  作業計画番号
	 * @param inWORK_IN_PROC_CD				  作業コード
	 * @param inPARTIAL_PRD_NO				  分作回数
	 * @param inOPR_RSLT_CRCT_NO			  作業実績訂正回数
	 * @param inPUCH_ODR_CD					  発注番号
	 * @param inACPT_NO						  受入回数
	 * @param inACPT_RSLT_CRCT_NO			  受入訂正回数
	 * @param inRCV_ISSUE_TYP				  自動出庫処理区分
	 * @param inRCV_ISSUE_DATE				  出庫年月日
	 * @param inRCV_ISSUE_RSLT_NO			  処理対象実績数
	 * @param inRCV_ISSUE_CMPLT_FLG			  出庫完了フラグ
	 * @param inPLANT_CD					  工場コード
	 * @throws SQLException
	 * @throws ApsComException
	 */
	public void	AutoIssueOpr(
		String	inWORK_ODR_CD			,	//作業計画番号
		String	inWORK_IN_PROC_CD		,	//作業コード
		String	inPARTIAL_PRD_NO		,	//分作回数
		String	inOPR_RSLT_CRCT_NO		,	//作業実績訂正回数
		String	inPUCH_ODR_CD			,	//発注番号
		String	inACPT_NO				,	//受入回数
		String	inACPT_RSLT_CRCT_NO		,	//受入訂正回数
		String	inRCV_ISSUE_TYP			,	//自動出庫処理区分
		String	inRCV_ISSUE_DATE		,	//出庫年月日
		String	inRCV_ISSUE_RSLT_NO		,	//処理対象実績数
		String	inRCV_ISSUE_CMPLT_FLG	,	//出庫完了フラグ
		String	inPLANT_CD			  )		//工場コード
			throws SQLException,Exception{

		//変数を初期化する
//20031121		ResultSet rs=null;
		String sRC = "";
		double dIssueNO=0;
		double dRC = 0;
		double dRC1 = 0;
		Hashtable htRC = new Hashtable();
		int	iRC	= 0;
		int	iMRP_ODR_TYP = 0;
		double	dAutoIssueNo = 0;
		int	iIssueCount	= 0;
		//double	dIssueNO = 0;
		boolean	bRC;

		try
		{
			_log.methodStart();
			//入力パラメータを取得
			ginWORK_ODR_CD			=inWORK_ODR_CD			;//作業計画番号
			ginWORK_IN_PROC_CD		=inWORK_IN_PROC_CD		;//作業コード
			ginPARTIAL_PRD_NO		=inPARTIAL_PRD_NO		;//分作回数
			ginOPR_RSLT_CRCT_NO		=inOPR_RSLT_CRCT_NO		;//作業実績訂正回数
			ginPUCH_ODR_CD			=inPUCH_ODR_CD			;//発注番号
			ginACPT_NO				=inACPT_NO				;//受入回数
			ginACPT_RSLT_CRCT_NO	=inACPT_RSLT_CRCT_NO	;//受入訂正回数
			ginRCV_ISSUE_TYP		=inRCV_ISSUE_TYP		;//自動出庫処理区分
			ginRCV_ISSUE_DATE		=inRCV_ISSUE_DATE		;//出庫年月日
			ginRCV_ISSUE_RSLT_NO	=inRCV_ISSUE_RSLT_NO	;//処理対象実績数
			ginRCV_ISSUE_CMPLT_FLG	=inRCV_ISSUE_CMPLT_FLG	;//出庫完了フラグ
			ginPLANT_CD				=inPLANT_CD				;//工場コード
			//DEBUG
			_log.message("(SBM0451)作業計画番号=["+ginWORK_ODR_CD+"]");
//20031104			_log.message("作業コード=["+ginWORK_IN_PROC_CD+"]");
//20031104			_log.message("分作回数=["+ginPARTIAL_PRD_NO+"]");
//20031104			_log.message("作業実績訂正回数=["+ginOPR_RSLT_CRCT_NO+"]");
//20031104			_log.message("発注番号=["+ginPUCH_ODR_CD+"]");
//20031104			_log.message("受入回数=["+ginACPT_NO+"]");
//20031104			_log.message("受入訂正回数=["+ginACPT_RSLT_CRCT_NO+"]");
//20031104			_log.message("自動出庫処理区分=["+ginRCV_ISSUE_TYP+"]");
//20031104			_log.message("出庫年月日=["+ginRCV_ISSUE_DATE+"]");
//20031104			_log.message("処理対象実績数=["+ginRCV_ISSUE_RSLT_NO+"]");
//20031104			_log.message("出庫完了フラグ=["+ginRCV_ISSUE_CMPLT_FLG+"]");
//20031104			_log.message("工場コード=["+ginPLANT_CD+"]");
			//2.10.3 入力パラメータチェック
			if (ginPUCH_ODR_CD == null || ginPUCH_ODR_CD.equals(""))
			{
				if ((ginOPR_RSLT_CRCT_NO == null) || (Integer.parseInt(ginOPR_RSLT_CRCT_NO) < 0) ) //20031008修正(0の時エラーでなくした)
				{
					_log.message("(SBM1197)作業実績訂正回数=["+ginOPR_RSLT_CRCT_NO+"] が不正なので、処理は終了する。");  //20031010修正
					return;
				};
			} else {
				if ((ginACPT_RSLT_CRCT_NO == null) || (Integer.parseInt(ginACPT_RSLT_CRCT_NO) < 0) ) //20031008修正(0の時エラーでなくした)
				{
					_log.message("(SBM1198)受入訂正回数=["+ginACPT_RSLT_CRCT_NO+"] が不正なので、処理は終了する。");  //20031010修正
					return;
				};
			}

			//2.10.3.1	出庫済自動出庫品目の出庫取消処理
			if (ginRCV_ISSUE_TYP.equals("2"))
			{
				if (ginPUCH_ODR_CD == null || ginPUCH_ODR_CD.equals(""))
				{
					if (Integer.parseInt(ginOPR_RSLT_CRCT_NO) >	0 )
					{
						//「発注番号」＝Nullの場合　かつ　作業実績訂正回数　>　0
// 20031121修正開始
						JDB0001();
/*
						rs = JDB0001();
						while (rs.next())
						{
							sRC	= JDB0003(rs);
							//DEBUG
//20031104							_log.message("入出庫管理番号JDB0001=["+sRC+"]");
							//出庫処理を呼び出し
							_log.message("出庫処理を呼び出し......");
							_IssueProcess = new IssueProcess(_iconn, sRC);
							_IssueProcess.execProcess();
						}
*/
// 20031121修正終了
					}
				} else {
					if (Integer.parseInt(ginACPT_RSLT_CRCT_NO) > 0)
					{
						//「発注番号」＝NotNullの場合　かつ　受入訂正回数　>　0

// 20031121修正開始
						JDB0002();
/*
						rs = JDB0002();
						while (rs.next())
						{
							sRC	= JDB0003(rs);
							//DEBUG
//20031104							_log.message("入出庫管理番号JDB0002=["+sRC+"]");
							//出庫処理
							_log.message("出庫処理を呼び出し......");
							_IssueProcess = new IssueProcess(_iconn, sRC);
							_IssueProcess.execProcess();
						}
*/
// 20031121修正終了
					}
				}
			}
			// 2.10.4	自動出庫対象品目の検索
			if (ginRCV_ISSUE_TYP.equals("2"))
			{
				if (ginPUCH_ODR_CD==null || ginPUCH_ODR_CD.equals(""))
				{
					//自動出庫処理対象品目検索（出庫指示の自動出庫の作業計画番号検索）
					//自動出庫処理対象品目セット情報生成（自動出庫数の算出）
					//DEBUG
//20031104					_log.message("出庫指示の自動出庫の作業計画番号検索");
					dIssueNO = JDB0004("1");
				} else {
					//自動出庫処理対象品目検索（出庫指示の自動出庫の発注番号検索）
					//自動出庫処理対象品目セット情報生成（自動出庫数の算出）
					//DEBUG
//20031104					_log.message("出庫指示の自動出庫の発注番号検索");
					dIssueNO = JDB0004("2");
				}
			}
			// 自動出庫処理対象品目セット情報がある間
			iIssueCount	= htIssueNO.size();
			//DEBUG
//20031104			_log.message("自動出庫処理対象品目件数=["+iIssueCount+"]");
			while (iIssueCount > 0)
			{
				//[自動出庫数]を取得
				dAutoIssueNo = Double.parseDouble((String)htIssueNO.get(Integer.toString(iIssueCount)));
				//DEBUG
//20031104				_log.message("自動出庫数=["+dAutoIssueNo+"]");
				//2.10.5	「自動出庫数」がZeroのとき
				if (dAutoIssueNo ==	0)
				{
					//保管区別入出庫]へ追加を行い
					sRC	= JDB0006(iIssueCount);
					//DEBUG
//20031104					_log.message("入出庫管理番号JDB0006=["+sRC+"]");
//20031103			//出庫処理を呼び出し
//20031103			_log.message("出庫処理を呼び出し......");
//20031103			_IssueProcess = new IssueProcess(_iconn, sRC);
//20031103			_IssueProcess.execProcess();
					// return ;
				} else {
					//2.10.6	MRP品目の自動出庫処理
					//出庫品目の品目手配区分が１(個別手配品目)、２(在庫引当型個別手配品目)、３(欠番)以外であるとき
					iMRP_ODR_TYP = Integer.parseInt((String)htMRP_ODR_TYP.get(Integer.toString(iIssueCount)));
					//DEBUG
//20031104					_log.message("出庫品目の品目手配区分=["+iMRP_ODR_TYP+"]");
					if (iMRP_ODR_TYP !=1 &&	iMRP_ODR_TYP !=	2 && iMRP_ODR_TYP != 3)
					{
						//品目別保管先優先順位の検索
//20031121				rs = JDB0007(iIssueCount);
						//自動出庫数を全て出庫するまで
						//【ＭＲＰ品の払出保管区の順序】
//20031121				dRC	= JDB0008(rs, iIssueCount, dAutoIssueNo, 1);
						dRC	= JDB0008(iIssueCount, dAutoIssueNo, 1);
						//DEBUG
//20031104						_log.message("自動出庫数を全て出庫=【ＭＲＰ品の払出保管区の順序】JDB0008");
					} else {
						// 09-25 仕様確認より修正
						if (iMRP_ODR_TYP ==1 ||	iMRP_ODR_TYP ==	2){
							dIssueNO = Double.parseDouble((String)htIssueNO.get(Integer.toString(iIssueCount)));
							//2.10.7.1 個別手配分出庫可能数の算出
							dRC	= JDB0009(iIssueCount, dIssueNO);
							//DEBUG
//20031104							_log.message("個別手配分出庫可能数=["+dRC+"]");
							//個別手配分出庫可能数　＞　0
							if (dRC	> 0)
							{
								//品目別保管先優先順位の検索
//20031121						rs = JDB0007(iIssueCount);
								//自動出庫数を全て出庫するまで
								//【製番品の払出保管区の順序】
//20031121						dRC1 = JDB0018(rs, iIssueCount, dRC);
								dRC1 = JDB0018(iIssueCount, dRC);
							}
							dIssueNO = dIssueNO	- dRC1;
							//DEBUG
//20031104							_log.message("出庫要求数JDB0011（製番引当分出庫可能数（同一製番））=["+dIssueNO+"]");
							//2.10.7.2 製番引当分出庫可能数（同一製番）の算出
							dRC	= JDB0011(iIssueCount, dIssueNO);
							dIssueNO = dIssueNO	- dRC;
							//DEBUG
//20031104							_log.message("出庫要求数JDB0013（製番引当分出庫可能数（他製番））=["+dIssueNO+"]");
							//2.10.7.2 製番引当分出庫可能数（他製番）の算出
							dRC	= JDB0013(iIssueCount, dIssueNO);
							dIssueNO = dIssueNO	- dRC;
							//DEBUG
//20031104							_log.message("出庫要求数JDB0014（在庫引当分出庫可能数）=["+dIssueNO+"]");
							//2.10.7.3 在庫引当分出庫可能数の算出
							dRC	= JDB0014(iIssueCount, dIssueNO);
							dIssueNO = dIssueNO	- dRC;
							//DEBUG
//20031104							_log.message("出庫要求数JDB0015（品目在庫出庫可能数）=["+dIssueNO+"]");
							//2.10.7.4 品目在庫出庫可能数の算出
							dRC	= JDB0015(iIssueCount, dIssueNO);
							//DEBUG
//20031104							_log.message("品目在庫出庫可能数=["+dRC+"]");
							if (dRC	> 0)
							{
								//品目別保管先優先順位の検索
//20031121						rs = JDB0007(iIssueCount);
								//自動出庫数を全て出庫するまで
								//【ＭＲＰ品の払出保管区の順序】
//20031121						dRC1 = JDB0008(rs, iIssueCount, dRC, 3);
								dRC1 = JDB0008(iIssueCount, dRC, 3);
							}
						}
					}
				}
				iIssueCount--;
			}
			//_conn.commit();
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
// 20031121修正開始
/*
			if (rs != null)
			{
				rs.close();
			}
*/
// 20031121修正終了
			//_conn.rollback();
		}

		return;
	}

	//2.10.3.1	出庫済自動出庫品目の出庫取消処理 「発注番号」＝Nullの場合
	//	《「発注番号」＝Nullの場合の[保管区別入出庫]に対する検索条件》
	//	[保管区別入出庫]."作業計画番号"＝「作業計画番号」
	//	[保管区別入出庫]."作業コード"＝「作業コード」
	//	[保管区別入出庫]."分作回数"＝「分作回数」
	//	[保管区別入出庫]."作業実績訂正回数"＝「作業実績訂正回数」－１
	//	[保管区別入出庫]."在庫更新区分"＝2(更新済)
	//	[保管区別入出庫]."入出庫管理番号"の昇順
	//	[出庫指示]注1."出庫指示出庫区分"＝3(自動出庫)
//	private	ResultSet JDB0001()
	private	void JDB0001()
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		String sRC = "";
		try
		{
			_log.methodStart();
			// << 保管区別入出庫を検索 >>
			if(ginWORK_IN_PROC_CD == null || ginWORK_IN_PROC_CD.equals("")) {
				sql	= "select "
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
				+" T_RCV_ISSUE.CONS_EXEC_DATE as CONS_EXEC_DATE,"
				+" T_RCV_ISSUE.CREATED_DATE as CREATED_DATE,"
				+" T_RCV_ISSUE.CREATED_BY as CREATED_BY,"
				+" T_RCV_ISSUE.CREATED_PRG_NM as CREATED_PRG_NM,"
				+" T_RCV_ISSUE.UPDATED_DATE as UPDATED_DATE,"
				+" T_RCV_ISSUE.UPDATED_BY as UPDATED_BY,"
				+" T_RCV_ISSUE.UPDATED_PRG_NM as UPDATED_PRG_NM,"
				+" T_RCV_ISSUE.MODIFY_COUNT as MODIFY_COUNT "
				+"from "
				+" T_RCV_ISSUE , T_ISSUE_INST "
				+"where "
				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD "
				+" and T_RCV_ISSUE.WORK_ODR_CD = ? "
//20031017削除				+" and T_RCV_ISSUE.WORK_IN_PROC_CD = ? "
				+" and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
				+" and T_RCV_ISSUE.OPR_RSLT_CRCT_NO = ? "
				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2 "
				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
				+" order by "
				+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD ";
			} else {
				sql	= "select "
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
				+" T_RCV_ISSUE.CONS_EXEC_DATE as CONS_EXEC_DATE,"
				+" T_RCV_ISSUE.CREATED_DATE as CREATED_DATE,"
				+" T_RCV_ISSUE.CREATED_BY as CREATED_BY,"
				+" T_RCV_ISSUE.CREATED_PRG_NM as CREATED_PRG_NM,"
				+" T_RCV_ISSUE.UPDATED_DATE as UPDATED_DATE,"
				+" T_RCV_ISSUE.UPDATED_BY as UPDATED_BY,"
				+" T_RCV_ISSUE.UPDATED_PRG_NM as UPDATED_PRG_NM,"
				+" T_RCV_ISSUE.MODIFY_COUNT as MODIFY_COUNT "
				+"from "
				+" T_RCV_ISSUE , T_ISSUE_INST "
				+"where "
				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD "
				+" and T_RCV_ISSUE.WORK_ODR_CD = ? "
				+" and T_RCV_ISSUE.WORK_IN_PROC_CD = ? "
				+" and T_RCV_ISSUE.PARTIAL_PRD_NO = ? "
				+" and T_RCV_ISSUE.OPR_RSLT_CRCT_NO = ? "
				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2 "
				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
				+" order by "
				+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD ";
			}

			ps = _conn.prepareStatement(sql);
			if(ginWORK_IN_PROC_CD == null || ginWORK_IN_PROC_CD.equals("")) {
				ps.setString(1,	ginWORK_ODR_CD);				//作業計画番号
//				ps.setString(2,	ginWORK_IN_PROC_CD);				//作業コード
				ps.setDouble(2,	Double.parseDouble(ginPARTIAL_PRD_NO));		//分作回数
				ps.setDouble(3,	Double.parseDouble(ginOPR_RSLT_CRCT_NO)	-1);	//作業実績訂正回数
			} else {
				ps.setString(1,	ginWORK_ODR_CD);				//作業計画番号
				ps.setString(2,	ginWORK_IN_PROC_CD);				//作業コード
				ps.setDouble(3,	Double.parseDouble(ginPARTIAL_PRD_NO));		//分作回数
				ps.setDouble(4,	Double.parseDouble(ginOPR_RSLT_CRCT_NO)	-1);	//作業実績訂正回数
			}
			
//200031017修正			ps.setString(1,	ginWORK_ODR_CD);				//作業計画番号
//200031017修正			ps.setString(2,	ginWORK_IN_PROC_CD);				//作業コード
//200031017修正			ps.setDouble(3,	Double.parseDouble(ginPARTIAL_PRD_NO));		//分作回数
//200031017修正			ps.setDouble(4,	Double.parseDouble(ginOPR_RSLT_CRCT_NO)	-1);	//作業実績訂正回数

//20031104			_log.message(sql);
			rs = ps.executeQuery();

//20031121修正開始
			while (rs.next())
			{
				sRC	= JDB0003(rs);
				//DEBUG
				//出庫処理を呼び出し
				_log.message("(SBM1199)出庫処理を呼び出し......");
				_IssueProcess = new IssueProcess(_iconn, sRC);
				_IssueProcess.execProcess();
			}
//20031121修正終了

			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//20031121修正開始
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
//20031121修正終了
//			if (rs != null)
//			{
//				rs.close();
//			}
//			if (ps != null)
//			{
//				ps.close();
//			}
		}
	};

	//2.10.3.1	出庫済自動出庫品目の出庫取消処理 「発注番号」＝NotNullの場合
	//	《「発注番号」＝NotNullの場合の[保管区別入出庫]に対する検索条件》
	//	[保管区別入出庫]."発注番号"＝「発注番号」
	//	[保管区別入出庫]."受入回数"＝「受入回数」
	//	[保管区別入出庫]."受入実績訂正回数"＝「受入訂正回数」－１
	//	[保管区別入出庫]."在庫更新区分"＝2（更新済）
	//	[保管区別入出庫]."入出庫管理番号"の昇順
	//	[出庫指示]注1."出庫指示出庫区分"＝3(自動出庫)
//	private	ResultSet JDB0002()
	private	void JDB0002()
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		String sRC = "";
		try
		{
			_log.methodStart();
			// << 保管区別入出庫の検索 >>
			sql	= "select "
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
				+" T_RCV_ISSUE.CONS_EXEC_DATE as CONS_EXEC_DATE,"
				+" T_RCV_ISSUE.CREATED_DATE as CREATED_DATE,"
				+" T_RCV_ISSUE.CREATED_BY as CREATED_BY,"
				+" T_RCV_ISSUE.CREATED_PRG_NM as CREATED_PRG_NM,"
				+" T_RCV_ISSUE.UPDATED_DATE as UPDATED_DATE,"
				+" T_RCV_ISSUE.UPDATED_BY as UPDATED_BY,"
				+" T_RCV_ISSUE.UPDATED_PRG_NM as UPDATED_PRG_NM,"
				+" T_RCV_ISSUE.MODIFY_COUNT as MODIFY_COUNT "
				+"from "
				+" T_RCV_ISSUE , T_ISSUE_INST "
				+"where "
				+" T_RCV_ISSUE.ISSUE_INST_CD = T_ISSUE_INST.ISSUE_INST_CD"
				+" and T_RCV_ISSUE.PUCH_ODR_CD = ?"
				+" and T_RCV_ISSUE.ACPT_NO = ?"
				+" and T_RCV_ISSUE.ACPT_RSLT_CRCT_NO = ?"
				+" and T_RCV_ISSUE.STOCK_UPD_TYP = 2"
				+" and T_ISSUE_INST.ISSUE_TYP = 3 "
				+"order by "
				+" T_RCV_ISSUE.RCV_ISSUE_CTRL_CD ";

			ps = _conn.prepareStatement(sql);
			ps.setString(1,	ginPUCH_ODR_CD);								//発注番号
			ps.setDouble(2,	Double.parseDouble(ginACPT_NO));				//受入回数
			ps.setDouble(3,	Double.parseDouble(ginACPT_RSLT_CRCT_NO) - 1);	//受入訂正回数
//20031104			_log.message(sql);
			rs = ps.executeQuery();

//20031121修正開始
			while (rs.next())
			{
				sRC	= JDB0003(rs);
				//DEBUG
				//出庫処理
				_log.message("(SBM1199)出庫処理を呼び出し......");
				_IssueProcess = new IssueProcess(_iconn, sRC);
				_IssueProcess.execProcess();
			}
//20031121修正終了

			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//20031121修正開始
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
//20031121修正終了
//			if (rs != null)
//			{
//				rs.close();
//			}
//			if (ps != null)
//			{
//				ps.close();
//			}
		}
	};

	//[保管区別入出庫]への追加内容
	private	String JDB0003(ResultSet rs	)
			throws SQLException,Exception{
		String strOdrCd="";
		String sql="";
		PreparedStatement ps=null;
		int	iIndex = 1;
		CollectNumber ODR_CD=null;

		try
		{
			_log.methodStart();
			//入出庫番号の採番
			ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD	,_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
			strOdrCd = ODR_CD.getNo();

			// << 保管区別入出庫の登録 >>
			sql	= "insert into "
				+" T_RCV_ISSUE( "
				+" RCV_ISSUE_CTRL_CD,"			//	入出庫管理番号
				+	"RCV_ISSUE_TYP,"		//	入出庫区分
				+	"ITEM_CD,"			//	品目番号
				+	"PLANT_CD,"			//	工場コード
				+	"WH_CD,"			//	保管区コード
				+	"JOB_ODR_CD,"			//	製番
				+	"JOB_ODR_DETAIL_NO,"		//	製番枝番
				+	"PUCH_ODR_CD,"			//	発注番号
				+	"ACPT_NO,"			//	受入回数
				+	"ACPT_RSLT_CRCT_NO,"		//	受入実績訂正回数
				+	"INSPEC_RSLT_CRCT_NO,"		//	検査実績訂正回数
				+	"WORK_ODR_CD,"			//	作業計画番号
				+	"WORK_IN_PROC_CD,"		//	仕掛作業コード
				+	"PARTIAL_PRD_NO,"		//	分作回数
				+	"OPR_RSLT_CRCT_NO,"		//	作業実績訂正回数
				+	"ISSUE_INST_CD,"		//	出庫指示番号
				+	"RCV_ISSUE_QTY,"		//	入出庫数
				+	"RCV_ISSUE_AMOUNT,"		//	入出庫金額
				+	"RCV_ISSUE_DATE,"		//	入出庫年月日
				+	"RCV_ISSUE_GNR_TYP,"		//	入出庫発生区分
				+	"RCV_ISSUE_ODD_QTY,"		//	入出庫端数
				+	"DEFECT_CAUSE_CD,"		//	入出庫不良理由コード
				+	"STOCK_UPD_TYP,"		//	在庫更新区分
				+	"RCV_ISSUE_CMPLT_FLG,"		//	入出庫完了フラグ
				+	"OD_NO,"			//	オーダデマンド番号
				+	"VEND_LOT_NO,"			//	メーカロット番号
				+	"RCV_ISSUE_COMMENT,"		//	入出庫備考
				+	"COMPANY_CD,"			//	会社コード
				+	"VEND_CD,"			//	取引先コード
				+	"CONS_TYP,"			//	支給区分
				+	"CONS_EXEC_DATE,"		//	有償支給実績抽出日
//				+	"CREATED_DATE,"			//	作成日
				+	"CREATED_BY,"			//	作成者
				+	"CREATED_PRG_NM,"		//	作成プログラム名
//				+	"UPDATED_DATE,"			//	更新日
				+	"UPDATED_BY,"			//	更新者
				+	"UPDATED_PRG_NM,"		//	更新プログラム名
				+	"MODIFY_COUNT) "		//	更新数
				+ "values ("
					+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//					+" ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					+" ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			ps = _conn.prepareStatement(sql);

			ps.setString(iIndex++, strOdrCd);								//	入出庫管理番号
			ps.setDouble(iIndex++, 2);										//	入出庫区分
			ps.setString(iIndex++, rs.getString("ITEM_CD"));				//	品目番号
			ps.setString(iIndex++, rs.getString("PLANT_CD"));				//	工場コード
			ps.setString(iIndex++, rs.getString("WH_CD"));					//	保管区コード
			ps.setString(iIndex++, rs.getString("JOB_ODR_CD"));				//	製番
			ps.setDouble(iIndex++, rs.getDouble("JOB_ODR_DETAIL_NO"));		//	製番枝番
			ps.setString(iIndex++, rs.getString("PUCH_ODR_CD"));			//	発注番号
			ps.setDouble(iIndex++, rs.getDouble("ACPT_NO"));				//	受入回数
			ps.setDouble(iIndex++, rs.getDouble("ACPT_RSLT_CRCT_NO"));		//	受入実績訂正回数
			ps.setDouble(iIndex++, rs.getDouble("INSPEC_RSLT_CRCT_NO"));	//	検査実績訂正回数
			ps.setString(iIndex++, rs.getString("WORK_ODR_CD"));			//	作業計画番号
			ps.setString(iIndex++, rs.getString("WORK_IN_PROC_CD"));		//	仕掛作業コード
			ps.setDouble(iIndex++, rs.getDouble("PARTIAL_PRD_NO"));			//	分作回数
			ps.setDouble(iIndex++, rs.getDouble("OPR_RSLT_CRCT_NO"));		//	作業実績訂正回数
			ps.setString(iIndex++, rs.getString("ISSUE_INST_CD"));			//	出庫指示番号
			ps.setDouble(iIndex++, rs.getDouble("RCV_ISSUE_QTY") * -1);		//	入出庫数
			ps.setDouble(iIndex++, rs.getDouble("RCV_ISSUE_AMOUNT"));		//	入出庫金額
			ps.setDate(iIndex++, rs.getDate("RCV_ISSUE_DATE"));				//	入出庫年月日
			ps.setDouble(iIndex++, 29);										//	入出庫発生区分
			ps.setDouble(iIndex++, rs.getDouble("RCV_ISSUE_ODD_QTY"));		//	入出庫端数
			ps.setString(iIndex++, rs.getString("DEFECT_CAUSE_CD"));		//	入出庫不良理由コード
			ps.setDouble(iIndex++, 1);										//	在庫更新区分
			ps.setDouble(iIndex++, rs.getDouble("RCV_ISSUE_CMPLT_FLG"));	//	入出庫完了フラグ
			ps.setString(iIndex++, rs.getString("OD_NO"));					//	オーダデマンド番号
			//-----------------------------------------------------------------
			ps.setString(iIndex++, rs.getString("VEND_LOT_NO"));			//	メーカロット番号
			ps.setString(iIndex++, rs.getString("RCV_ISSUE_COMMENT"));		//	入出庫備考
			ps.setString(iIndex++, rs.getString("COMPANY_CD"));				//	会社コード
			ps.setString(iIndex++, rs.getString("VEND_CD"));				//	取引先コード
			ps.setDouble(iIndex++, rs.getDouble("CONS_TYP"));				//	支給区分
			ps.setDate(iIndex++, rs.getDate("CONS_EXEC_DATE"));				//	有償支給実績抽出日
//			ps.setDate(iIndex++, rs.getDate("CREATED_DATE"));				//	作成日
			ps.setString(iIndex++, rs.getString("CREATED_BY"));				//	作成者
			ps.setString(iIndex++, rs.getString("CREATED_PRG_NM"));			//	作成プログラム名
//			ps.setDate(iIndex++, rs.getDate("UPDATED_DATE"));				//	更新日
			ps.setString(iIndex++, rs.getString("UPDATED_BY"));				//	更新者
			ps.setString(iIndex++, rs.getString("UPDATED_PRG_NM"));			//	更新プログラム名
			ps.setString(iIndex++, rs.getString("MODIFY_COUNT"));			//	更新数

			htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);												//入出庫管理番号
			htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");															//入出庫区分
			if (rs.getString("ITEM_CD") == null)
			{
				htT_RCV_ISSUE.put("ITEM_CD","");
			}else{
				htT_RCV_ISSUE.put("ITEM_CD",rs.getString("ITEM_CD"));											//品目番号
			}
			if (rs.getString("PLANT_CD") == null)
			{
				htT_RCV_ISSUE.put("PLANT_CD","");
			}else{
				htT_RCV_ISSUE.put("PLANT_CD",rs.getString("PLANT_CD"));											//工場コード
			}
			if (rs.getString("WH_CD") == null)
			{
				htT_RCV_ISSUE.put("WH_CD","");
			}else{
				htT_RCV_ISSUE.put("WH_CD",rs.getString("WH_CD"));												//保管区コード
			}
			if (rs.getString("JOB_ODR_CD") == null)
			{
				htT_RCV_ISSUE.put("JOB_ODR_CD","");
			}else{
				htT_RCV_ISSUE.put("JOB_ODR_CD",rs.getString("JOB_ODR_CD"));										//製番
			}
			if (rs.getString("PUCH_ODR_CD") == null)
			{
				htT_RCV_ISSUE.put("PUCH_ODR_CD","");
			}else{
				htT_RCV_ISSUE.put("PUCH_ODR_CD",rs.getString("PUCH_ODR_CD"));									//発注番号
			}
			if (rs.getString("WORK_ODR_CD") == null)
			{
				htT_RCV_ISSUE.put("WORK_ODR_CD","");
			}else{
				htT_RCV_ISSUE.put("WORK_ODR_CD",rs.getString("WORK_ODR_CD"));									//作業計画番号
			}
			if (rs.getString("WORK_IN_PROC_CD") == null)
			{
				htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
			}else{
				htT_RCV_ISSUE.put("WORK_IN_PROC_CD",rs.getString("WORK_IN_PROC_CD"));							//仕掛作業コード
			}
			if (rs.getString("ISSUE_INST_CD") == null)
			{
				htT_RCV_ISSUE.put("ISSUE_INST_CD","");
			}else{
				htT_RCV_ISSUE.put("ISSUE_INST_CD",rs.getString("ISSUE_INST_CD"));								//出庫指示番号
			}
			if (rs.getString("RCV_ISSUE_DATE") == null)
			{
				htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
			}else{
				
				htT_RCV_ISSUE.put("RCV_ISSUE_DATE",Converter.dateToStr(rs.getDate("RCV_ISSUE_DATE"),Converter.SLASH_DATE));	//入出庫年月日
			}
			if (rs.getString("DEFECT_CAUSE_CD") == null)
			{
				htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");
			}else{
				htT_RCV_ISSUE.put("DEFECT_CAUSE_CD",rs.getString("DEFECT_CAUSE_CD"));							//入出庫不良理由コード
			}
			if (rs.getString("OD_NO") == null)
			{
				htT_RCV_ISSUE.put("OD_NO","");
			}else{
				htT_RCV_ISSUE.put("OD_NO",rs.getString("OD_NO"));												//オーダデマンド番号
			}
			if (rs.getString("VEND_LOT_NO") == null)
			{
				htT_RCV_ISSUE.put("VEND_LOT_NO","");
			}else{
				htT_RCV_ISSUE.put("VEND_LOT_NO",rs.getString("VEND_LOT_NO"));									//メーカロット番号
			}
			if (rs.getString("RCV_ISSUE_COMMENT") == null)
			{
				htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");
			}else{
				htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT",rs.getString("RCV_ISSUE_COMMENT"));						//入出庫備考
			}
			if (rs.getString("COMPANY_CD") == null)
			{
				htT_RCV_ISSUE.put("COMPANY_CD","");
			}else{
				htT_RCV_ISSUE.put("COMPANY_CD",rs.getString("COMPANY_CD"));										//会社コード
			}
			if (rs.getString("VEND_CD") == null)
			{
				htT_RCV_ISSUE.put("VEND_CD","");
			}else{
				htT_RCV_ISSUE.put("VEND_CD",rs.getString("VEND_CD"));											//取引先コード
			}
			if (rs.getString("CONS_EXEC_DATE") == null)
			{
				htT_RCV_ISSUE.put("CONS_EXEC_DATE","");
			}else{
				htT_RCV_ISSUE.put("CONS_EXEC_DATE",Converter.dateToStr(rs.getDate("CONS_EXEC_DATE"),Converter.SLASH_DATE));	//有償支給実績抽出日
			}
			htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO",Double.toString(rs.getDouble("JOB_ODR_DETAIL_NO")));		//製番枝番
			htT_RCV_ISSUE.put("ACPT_NO",Double.toString(rs.getDouble("ACPT_NO")));							//受入回数
			htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",Double.toString(rs.getDouble("ACPT_RSLT_CRCT_NO")));		//受入実績訂正回数
			htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO",Double.toString(rs.getDouble("INSPEC_RSLT_CRCT_NO")));	//検査実績訂正回数
			htT_RCV_ISSUE.put("PARTIAL_PRD_NO",Double.toString(rs.getDouble("PARTIAL_PRD_NO")));			//分作回数
			htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",Double.toString(rs.getDouble("OPR_RSLT_CRCT_NO")));		//作業実績訂正回数
			htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(rs.getDouble("RCV_ISSUE_QTY")	* -1));			//入出庫数
			htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT",Double.toString(rs.getDouble("RCV_ISSUE_AMOUNT")));		//入出庫金額
			htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","29");													//入出庫発生区分
			htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY",Double.toString(rs.getDouble("RCV_ISSUE_ODD_QTY")));		//入出庫端数
			htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");															//在庫更新区分
			htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",Double.toString(rs.getDouble("RCV_ISSUE_CMPLT_FLG")));	//入出庫完了フラグ
			htT_RCV_ISSUE.put("CONS_TYP",Double.toString(rs.getDouble("CONS_TYP")));						//支給区分

			iIndex=ps.executeUpdate();
			ps.close();
			//DEBUG
//20031104			_log.message("保管区別入出庫の登録数=["+iIndex+"]");

//20031104			_log.message(sql);
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//			if (rs != null)
//			{
//				rs.close();
//			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return strOdrCd;
	};

	//2.10.4	自動出庫対象品目の検索
	//自動出庫処理対象品目セット情報生成（自動出庫数の算出）
	private	double JDB0004(String sTyp)
		throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String lsTyp="";
		String sql="";
		double dIssueNO	= 0;
		int	iCount = 0;
		int	iIndex = 0;
		int	iTyp = 0;
		BigDecimal bdIssueNO0=null; //20031211
		BigDecimal bdIssueNO1=null;
		BigDecimal bdIssueNO2=null;
		BigDecimal bdIssueNO3=null;
		try
		{
			_log.methodStart();

			lsTyp =	sTyp;
			htIssueNO = new Hashtable();
			if (lsTyp.equals("1"))
			{
				//自動出庫処理対象品目検索（出庫指示の自動出庫の作業計画番号検索）
				//《「発注番号」＝Nullのとき》
				//"作業計画番号"＝「作業計画番号」
				//"作業コード"＝「作業コード」
				//"出庫区分"＝3(自動出庫)
				//"出庫指示番号"の昇順
				if(ginWORK_IN_PROC_CD == null || ginWORK_IN_PROC_CD.equals(""))
				{
					sql	= "SELECT T_ISSUE_INST.ISSUE_INST_CD, T_ISSUE_INST.PLANT_CD, T_ISSUE_INST.OD_NO, "
					+" T_ISSUE_INST.ITEM_CD, T_ISSUE_INST.PS_EDITION, T_ISSUE_INST.PUCH_ODR_CD, T_ISSUE_INST.COMPANY_CD, "
					+" T_ISSUE_INST.VEND_CD, T_ISSUE_INST.CONS_TYP, T_ISSUE_INST.WORK_ODR_CD, T_ISSUE_INST.WORK_IN_PROC_CD, "
					+" T_ISSUE_INST.WS_CD, T_ISSUE_INST.WH_CD, T_ISSUE_INST.ISSUE_INST_UNIT_QTY, T_ISSUE_INST.ISSUE_INST_UNIT_DENOMINATOR, "
					+" T_ISSUE_INST.ISSUE_INST_UNIT_NUMERATOR, T_ISSUE_INST.ISSUE_INST_QTY, T_ISSUE_INST.TOTAL_ISSUE_QTY, "
					+" T_ISSUE_INST.SCDL_ISSUE_DATE, T_ISSUE_INST.ISSUE_CMPLT_DATE, T_ISSUE_INST.ISSUE_TYP, T_ISSUE_INST.ISSUE_CMPLT_FLG, "
					+" T_ISSUE_INST.ISSUE_INST_ISS_FLG, T_ISSUE_INST.ISSUE_INST_ISS_DATE, T_ISSUE_INST.ISSUE_INST_COMMENT, "
					+" T_ISSUE_INST.CREATED_DATE, T_ISSUE_INST.CREATED_BY, T_ISSUE_INST.CREATED_PRG_NM, T_ISSUE_INST.UPDATED_DATE, "
					+" T_ISSUE_INST.UPDATED_BY, T_ISSUE_INST.UPDATED_PRG_NM, T_ISSUE_INST.MODIFY_COUNT "
					+" FROM T_ISSUE_INST "
//20031017削除					+" WHERE (((T_ISSUE_INST.WORK_ODR_CD)=?) AND ((T_ISSUE_INST.WORK_IN_PROC_CD)=?) AND ((T_ISSUE_INST.ISSUE_TYP)=3)) "
					+" WHERE (((T_ISSUE_INST.WORK_ODR_CD)=?) AND ((T_ISSUE_INST.ISSUE_TYP)=3)) "
					+" ORDER BY T_ISSUE_INST.ISSUE_INST_CD " ;
				} else {
					sql	= "SELECT T_ISSUE_INST.ISSUE_INST_CD, T_ISSUE_INST.PLANT_CD, T_ISSUE_INST.OD_NO, "
					+" T_ISSUE_INST.ITEM_CD, T_ISSUE_INST.PS_EDITION, T_ISSUE_INST.PUCH_ODR_CD, T_ISSUE_INST.COMPANY_CD, "
					+" T_ISSUE_INST.VEND_CD, T_ISSUE_INST.CONS_TYP, T_ISSUE_INST.WORK_ODR_CD, T_ISSUE_INST.WORK_IN_PROC_CD, "
					+" T_ISSUE_INST.WS_CD, T_ISSUE_INST.WH_CD, T_ISSUE_INST.ISSUE_INST_UNIT_QTY, T_ISSUE_INST.ISSUE_INST_UNIT_DENOMINATOR, "
					+" T_ISSUE_INST.ISSUE_INST_UNIT_NUMERATOR, T_ISSUE_INST.ISSUE_INST_QTY, T_ISSUE_INST.TOTAL_ISSUE_QTY, "
					+" T_ISSUE_INST.SCDL_ISSUE_DATE, T_ISSUE_INST.ISSUE_CMPLT_DATE, T_ISSUE_INST.ISSUE_TYP, T_ISSUE_INST.ISSUE_CMPLT_FLG, "
					+" T_ISSUE_INST.ISSUE_INST_ISS_FLG, T_ISSUE_INST.ISSUE_INST_ISS_DATE, T_ISSUE_INST.ISSUE_INST_COMMENT, "
					+" T_ISSUE_INST.CREATED_DATE, T_ISSUE_INST.CREATED_BY, T_ISSUE_INST.CREATED_PRG_NM, T_ISSUE_INST.UPDATED_DATE, "
					+" T_ISSUE_INST.UPDATED_BY, T_ISSUE_INST.UPDATED_PRG_NM, T_ISSUE_INST.MODIFY_COUNT "
					+" FROM T_ISSUE_INST "
					+" WHERE (((T_ISSUE_INST.WORK_ODR_CD)=?) AND ((T_ISSUE_INST.WORK_IN_PROC_CD)=?) AND ((T_ISSUE_INST.ISSUE_TYP)=3)) "
					+" ORDER BY T_ISSUE_INST.ISSUE_INST_CD " ;
				}

				ps = _conn.prepareStatement(sql);
				ps.setString(1,	ginWORK_ODR_CD);
				if(ginWORK_IN_PROC_CD == null || ginWORK_IN_PROC_CD.equals(""))
				{ 
				} else {
					ps.setString(2,	ginWORK_IN_PROC_CD);
				}
			} else if (lsTyp.equals("2"))
			{
				//自動出庫処理対象品目検索（出庫指示の自動出庫の発注番号検索）
				//《「発注番号」＝Not Nullのとき》
				//"発注番号"＝「発注番号」
				//"出庫区分"＝3(自動出庫)
				//"出庫指示番号"の昇順
				sql	= "SELECT T_ISSUE_INST.ISSUE_INST_CD, T_ISSUE_INST.PLANT_CD, T_ISSUE_INST.OD_NO, "
				+" T_ISSUE_INST.ITEM_CD, T_ISSUE_INST.PS_EDITION, T_ISSUE_INST.PUCH_ODR_CD, T_ISSUE_INST.COMPANY_CD, "
				+" T_ISSUE_INST.VEND_CD, T_ISSUE_INST.CONS_TYP, T_ISSUE_INST.WORK_ODR_CD, T_ISSUE_INST.WORK_IN_PROC_CD, "
				+" T_ISSUE_INST.WS_CD, T_ISSUE_INST.WH_CD, T_ISSUE_INST.ISSUE_INST_UNIT_QTY, T_ISSUE_INST.ISSUE_INST_UNIT_DENOMINATOR, "
				+" T_ISSUE_INST.ISSUE_INST_UNIT_NUMERATOR, T_ISSUE_INST.ISSUE_INST_QTY, T_ISSUE_INST.TOTAL_ISSUE_QTY, "
				+" T_ISSUE_INST.SCDL_ISSUE_DATE, T_ISSUE_INST.ISSUE_CMPLT_DATE, T_ISSUE_INST.ISSUE_TYP, T_ISSUE_INST.ISSUE_CMPLT_FLG, "
				+" T_ISSUE_INST.ISSUE_INST_ISS_FLG, T_ISSUE_INST.ISSUE_INST_ISS_DATE, T_ISSUE_INST.ISSUE_INST_COMMENT, "
				+" T_ISSUE_INST.CREATED_DATE, T_ISSUE_INST.CREATED_BY, T_ISSUE_INST.CREATED_PRG_NM, T_ISSUE_INST.UPDATED_DATE, "
				+" T_ISSUE_INST.UPDATED_BY, T_ISSUE_INST.UPDATED_PRG_NM, T_ISSUE_INST.MODIFY_COUNT "
				+" FROM T_ISSUE_INST "
				+" WHERE ((T_ISSUE_INST.PUCH_ODR_CD=?) AND (T_ISSUE_INST.ISSUE_TYP=3)) "
				+" ORDER BY T_ISSUE_INST.ISSUE_INST_CD " ;
				ps = _conn.prepareStatement(sql);
				ps.setString(1,	ginPUCH_ODR_CD);
			}else{
				ps = _conn.prepareStatement(sql);
			}
			//DEBUG
//20031104			_log.message("自動出庫処理対象品目検索(作業計画番号検索or発注番号検索)lsTyp=["+lsTyp+"]");
//20031104			_log.message("ｓｑｌ=["+sql+"]");

			rs = ps.executeQuery();

			iCount = 0;
			while (rs.next())
			{
				iIndex = ++iCount;
				// 品目を検索
				JDB0005(iIndex,	rs.getString("ITEM_CD"));

				//DEBUG
//20031104				_log.message("出庫指示単位数分子=["+rs.getDouble("ISSUE_INST_UNIT_NUMERATOR")+"]");
//20031104				_log.message("出庫指示単位数分母=["+rs.getDouble("ISSUE_INST_UNIT_DENOMINATOR")+"]");
				iTyp = Integer.parseInt((String)htUNIT_QTY_TYP.get(Integer.toString(iIndex)));

//20031211 ins ↓
				//自動出庫数を算出
				bdIssueNO1 = new BigDecimal(ginRCV_ISSUE_RSLT_NO);
				bdIssueNO2 = new BigDecimal(rs.getString("ISSUE_INST_UNIT_NUMERATOR"));
				bdIssueNO3 = new BigDecimal(rs.getString("ISSUE_INST_UNIT_DENOMINATOR"));

				//出庫指示数 =   発注指示数 * 出庫単位数分子 / 出庫単位数分母
				bdIssueNO0 = ((bdIssueNO1.multiply
								(bdIssueNO2)).divide
								(bdIssueNO3, 10, BigDecimal.ROUND_UP));

//20031211 ins ↑

				if (iTyp ==	1)				// 整数管理
				{
/* 20031211 del
					//出庫指示数 =   発注指示数 * 出庫単位数分子 / 出庫単位数分母
					//小数切上げ
//20031017修正					dIssueNO = Integer.parseInt(ginRCV_ISSUE_RSLT_NO) *	rs.getDouble("ISSUE_INST_UNIT_NUMERATOR")
//20031017修正								/ rs.getDouble("ISSUE_INST_UNIT_DENOMINATOR");
					dIssueNO = Double.parseDouble(ginRCV_ISSUE_RSLT_NO) *	rs.getDouble("ISSUE_INST_UNIT_NUMERATOR")
								/ rs.getDouble("ISSUE_INST_UNIT_DENOMINATOR");
					htIssueNO.put(Integer.toString(iIndex),	Integer.toString((new Double(dIssueNO)).intValue()));
					//DEBUG
//20031104					_log.message("整数管理=["+dIssueNO+"]");
*/
					//小数切上げ
					bdIssueNO0 = bdIssueNO0.setScale(0,	BigDecimal.ROUND_UP); //20031211

				} else if (iTyp	== 2)		// 小数管理
				{
/* 20031211
					//出庫単位数 = 親データ.出庫単位数 * 子データ出庫単位数
					//小数第５位切上げ切上げ
//20031211					bdIssueNO1 = new BigDecimal(Double.parseDouble(ginRCV_ISSUE_RSLT_NO));
//20031211					bdIssueNO2 = new BigDecimal(rs.getDouble("ISSUE_INST_UNIT_NUMERATOR"));
//20031211					bdIssueNO3 = new BigDecimal(rs.getDouble("ISSUE_INST_UNIT_DENOMINATOR"));
					bdIssueNO1 = (bdIssueNO1.multiply
									(bdIssueNO2)).divide
									(bdIssueNO3,BigDecimal.ROUND_HALF_DOWN);
*/
					//小数第５位切上げ切上げ
					bdIssueNO0 = bdIssueNO0.setScale(4,	BigDecimal.ROUND_UP);

//20031211					htIssueNO.put(Integer.toString(iIndex),	bdIssueNO1.toString());
					//DEBUG
//20031104					_log.message("小数管理=["+bdIssueNO1.toString()+"]");
				}

				htIssueNO.put(Integer.toString(iIndex),	bdIssueNO0.toString()); //20031211
				dIssueNO = Double.parseDouble(bdIssueNO0.toString()); //20031211

				//ほか情報を取得
				htT_ISSUE_INST = new Hashtable();
				if (rs.getString("ISSUE_INST_CD") == null)
				{
					htT_ISSUE_INST.put("ISSUE_INST_CD",	"");									//出庫指示番号
				}else{
					htT_ISSUE_INST.put("ISSUE_INST_CD",	rs.getString("ISSUE_INST_CD"));									//出庫指示番号
				}
				if (rs.getString("PLANT_CD") == null)
				{
					htT_ISSUE_INST.put("PLANT_CD",	"");		
				}else{
					htT_ISSUE_INST.put("PLANT_CD",	rs.getString("PLANT_CD"));			
				}
				if (rs.getString("OD_NO") == null)
				{
					htT_ISSUE_INST.put("OD_NO",	"");		
				}else{
					htT_ISSUE_INST.put("OD_NO",	rs.getString("OD_NO"));
				}
				if (rs.getString("ITEM_CD") == null)
				{
					htT_ISSUE_INST.put("ITEM_CD",	"");		
				}else{
					htT_ISSUE_INST.put("ITEM_CD",	rs.getString("ITEM_CD"));			
				}
				if (rs.getString("PS_EDITION") == null)
				{
					htT_ISSUE_INST.put("PS_EDITION",	"");		
				}else{
					htT_ISSUE_INST.put("PS_EDITION",	rs.getString("PS_EDITION"));			
				}
				if (rs.getString("PUCH_ODR_CD") == null)
				{
					htT_ISSUE_INST.put("PUCH_ODR_CD",	"");		
				}else{
					htT_ISSUE_INST.put("PUCH_ODR_CD",	rs.getString("PUCH_ODR_CD"));			
				}
				if (rs.getString("COMPANY_CD") == null)
				{
					htT_ISSUE_INST.put("COMPANY_CD",	"");		
				}else{
					htT_ISSUE_INST.put("COMPANY_CD",	rs.getString("COMPANY_CD"));			
				}
				if (rs.getString("VEND_CD") == null)
				{
					htT_ISSUE_INST.put("VEND_CD",	"");		
				}else{
					htT_ISSUE_INST.put("VEND_CD",	rs.getString("VEND_CD"));			
				}
				if (rs.getString("WORK_ODR_CD") == null)
				{
					htT_ISSUE_INST.put("WORK_ODR_CD",	"");		
				}else{
					htT_ISSUE_INST.put("WORK_ODR_CD",	rs.getString("WORK_ODR_CD"));			
				}
				if (rs.getString("WORK_IN_PROC_CD") == null)
				{
					htT_ISSUE_INST.put("WORK_IN_PROC_CD",	"");		
				}else{
					htT_ISSUE_INST.put("WORK_IN_PROC_CD",	rs.getString("WORK_IN_PROC_CD"));			
				}
				if (rs.getString("WS_CD") == null)
				{
					htT_ISSUE_INST.put("WS_CD",	"");		
				}else{
					htT_ISSUE_INST.put("WS_CD",	rs.getString("WS_CD"));			
				}
				if (rs.getString("WH_CD") == null)
				{
					htT_ISSUE_INST.put("WH_CD",	"");		
				}else{
					htT_ISSUE_INST.put("WH_CD",	rs.getString("WH_CD"));			
				}
				if (rs.getString("SCDL_ISSUE_DATE") == null)
				{
					htT_ISSUE_INST.put("SCDL_ISSUE_DATE",	"");		
				}else{
					htT_ISSUE_INST.put("SCDL_ISSUE_DATE",
						Converter.dateToStr(rs.getDate("SCDL_ISSUE_DATE"),Converter.SLASH_DATE));								//出庫予定日
				}
				if (rs.getString("ISSUE_CMPLT_DATE") == null)
				{
					htT_ISSUE_INST.put("ISSUE_CMPLT_DATE",	"");		
				}else{
					htT_ISSUE_INST.put("ISSUE_CMPLT_DATE",
						Converter.dateToStr(rs.getDate("ISSUE_CMPLT_DATE"),Converter.SLASH_DATE));							//出庫完了日
				}
				if (rs.getString("ISSUE_INST_ISS_DATE") == null)
				{
					htT_ISSUE_INST.put("ISSUE_INST_ISS_DATE",	"");		
				}else{
					htT_ISSUE_INST.put("ISSUE_INST_ISS_DATE",
						Converter.dateToStr(rs.getDate("ISSUE_INST_ISS_DATE"),Converter.SLASH_DATE));						//出庫指示書発行日
				}
				if (rs.getString("ISSUE_INST_COMMENT") == null)
				{
					htT_ISSUE_INST.put("ISSUE_INST_COMMENT",	"");		
				}else{
					htT_ISSUE_INST.put("ISSUE_INST_COMMENT",	rs.getString("ISSUE_INST_COMMENT"));			
				}

//				htT_ISSUE_INST.put("PLANT_CD", rs.getString("PLANT_CD"));											//工場コード
//				htT_ISSUE_INST.put("OD_NO",	rs.getString("OD_NO"));													//オーダデマンド番号
//				htT_ISSUE_INST.put("ITEM_CD", rs.getString("ITEM_CD"));												//出庫品目番号
//				htT_ISSUE_INST.put("PS_EDITION", rs.getString("PS_EDITION"));										//出庫品目構成版数
//				htT_ISSUE_INST.put("PUCH_ODR_CD", rs.getString("PUCH_ODR_CD"));										//発注番号
//				htT_ISSUE_INST.put("COMPANY_CD", rs.getString("COMPANY_CD"));										//会社コード
//				htT_ISSUE_INST.put("VEND_CD", rs.getString("VEND_CD"));												//取引先コード
				htT_ISSUE_INST.put("CONS_TYP", Double.toString(rs.getDouble("CONS_TYP")));							//支給区分
//				htT_ISSUE_INST.put("WORK_ODR_CD", rs.getString("WORK_ODR_CD"));										//作業計画番号
//				htT_ISSUE_INST.put("WORK_IN_PROC_CD", rs.getString("WORK_IN_PROC_CD"));								//仕掛作業コード
//				htT_ISSUE_INST.put("WS_CD",	rs.getString("WS_CD"));													//作業区コード
//				htT_ISSUE_INST.put("WH_CD",	rs.getString("WH_CD"));													//工程保管場所コード
				htT_ISSUE_INST.put("ISSUE_INST_UNIT_QTY", Double.toString(rs.getDouble("ISSUE_INST_UNIT_QTY")));	//出庫指示単位数
				htT_ISSUE_INST.put("ISSUE_INST_UNIT_DENOMINATOR", Double.toString(rs.getDouble("ISSUE_INST_UNIT_DENOMINATOR")));		//出庫指示単位数分母
				htT_ISSUE_INST.put("ISSUE_INST_UNIT_NUMERATOR",	Double.toString(rs.getDouble("ISSUE_INST_UNIT_NUMERATOR")));			//出庫指示単位数分子
				htT_ISSUE_INST.put("ISSUE_INST_QTY", Double.toString(rs.getDouble("ISSUE_INST_QTY")));								//出庫指示数
				htT_ISSUE_INST.put("TOTAL_ISSUE_QTY", Double.toString(rs.getDouble("TOTAL_ISSUE_QTY")));								//出庫累計数
//				htT_ISSUE_INST.put("SCDL_ISSUE_DATE",
//					Converter.dateToStr(rs.getDate("SCDL_ISSUE_DATE"),Converter.SLASH_DATE));								//出庫予定日
//				htT_ISSUE_INST.put("ISSUE_CMPLT_DATE",
//					Converter.dateToStr(rs.getDate("ISSUE_CMPLT_DATE"),Converter.SLASH_DATE));							//出庫完了日
				htT_ISSUE_INST.put("ISSUE_TYP",	Double.toString(rs.getDouble("ISSUE_TYP")));						//出庫指示出庫区分
				htT_ISSUE_INST.put("ISSUE_CMPLT_FLG", Double.toString(rs.getDouble("ISSUE_CMPLT_FLG")));			//出庫完了フラグ
				htT_ISSUE_INST.put("ISSUE_INST_ISS_FLG", Double.toString(rs.getDouble("ISSUE_INST_ISS_FLG")));		//出庫指示書発行済みフラグ
//				htT_ISSUE_INST.put("ISSUE_INST_ISS_DATE",
//					Converter.dateToStr(rs.getDate("ISSUE_INST_ISS_DATE"),Converter.SLASH_DATE));						//出庫指示書発行日
//				htT_ISSUE_INST.put("ISSUE_INST_COMMENT", rs.getString("ISSUE_INST_COMMENT"));						//出庫指示備考
	//			htT_ISSUE_INST.put("CREATED_DATE", rs.getString("CREATED_DATE"));									//作成日
	//			htT_ISSUE_INST.put("CREATED_BY", rs.getString("CREATED_BY"));										//作成者
	//			htT_ISSUE_INST.put("CREATED_PRG_NM", rs.getString("CREATED_PRG_NM"));								//作成プログラム名
	//			htT_ISSUE_INST.put("UPDATED_DATE", rs.getString("UPDATED_DATE"));									//更新日
	//			htT_ISSUE_INST.put("UPDATED_BY", rs.getString("UPDATED_BY"));										//更新者
	//			htT_ISSUE_INST.put("UPDATED_PRG_NM", rs.getString("UPDATED_PRG_NM"));								//更新プログラム名
	//			htT_ISSUE_INST.put("MODIFY_COUNT", rs.getString("MODIFY_COUNT"));									//更新数
				alT_ISSUE_INST.add(htT_ISSUE_INST);
	//			  htISSUE_INST_CD.put(Integer.toString(iIndex),	rs.getString("ISSUE_INST_CD"));	  //出庫指示番号
	//			  htPLANT_CD.put(Integer.toString(iIndex), rs.getString("PLANT_CD"));			  //工場コード
	//			  htOD_NO.put(Integer.toString(iIndex),	rs.getString("OD_NO"));					  //オーダデマンド番号
	//			  htITEM_CD.put(Integer.toString(iIndex), rs.getString("ITEM_CD"));				  //出庫品目番号
			};
			rs.close();
			ps.close();

			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return dIssueNO;
	};

	// 品目を検索
	private	void JDB0005(int iIndex, String	sITEM_CD)
		throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String lsTyp="";
		String sql="";
		try
		{
			_log.methodStart();
			// 品目を検索
			sql	= "SELECT M_ITEM.ITEM_CD, M_ITEM.UNIT_QTY_TYP, M_ITEM.MRP_ODR_TYP "
				+ " FROM M_ITEM "
				+ " WHERE ((M_ITEM.ITEM_CD=?)) ";

			ps = _conn.prepareStatement(sql);
			ps.setString(1,	sITEM_CD);
			rs = ps.executeQuery();
			if (rs.next())
			{
				htUNIT_QTY_TYP.put(Integer.toString(iIndex), Integer.toString((new Double(rs.getDouble("UNIT_QTY_TYP"))).intValue()));	//在庫数単位区分
				htMRP_ODR_TYP.put(Integer.toString(iIndex),Integer.toString((new Double(rs.getDouble("MRP_ODR_TYP"))).intValue()));		//品目手配区分
			}
			//DEBUG
//20031104			_log.message("iIndex=["+iIndex+"]");
//20031104			_log.message("品目・品目番号sITEM_CD=["+sITEM_CD+"]");
//20031104			_log.message("品目・在庫数単位区分htUNIT_QTY_TYP=["+rs.getDouble("UNIT_QTY_TYP")+"]");
//20031104			_log.message("品目・品目手配区分htMRP_ODR_TYP=["+rs.getDouble("MRP_ODR_TYP")+"]");
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}

		return ;
	};


	//2.10.5	「処理対象実績数」がZeroのとき
	// << 保管区別入出庫の登録 >>
	private	String JDB0006(int iInIndex)
			throws SQLException,Exception{
		String strOdrCd="";
		String sql="";
		PreparedStatement ps=null;
		java.util.Date dtDate = null;
		int	iIndex = 1;
		Hashtable htT =	new	Hashtable();
		CollectNumber ODR_CD=null;
		try
		{
			_log.methodStart();
//System.out.println("start▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
//System.out.println("<< 保管区別入出庫の登録 >>");
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			//入出庫番号の採番
			ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD	,
				_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
			strOdrCd = ODR_CD.getNo();

			// << 保管区別入出庫の登録 >>
			sql	= "insert into "
				+"	T_RCV_ISSUE( "
				+" RCV_ISSUE_CTRL_CD,"		//	入出庫管理番号
				+	"RCV_ISSUE_TYP,"		//	入出庫区分
				+	"ITEM_CD,"				//	品目番号
				+	"PLANT_CD,"				//	工場コード
				+	"WH_CD,"				//	保管区コード
				+	"JOB_ODR_CD,"			//	製番
				+	"JOB_ODR_DETAIL_NO,"	//	製番枝番
				+	"PUCH_ODR_CD,"			//	発注番号
				+	"ACPT_NO,"				//	受入回数
				+	"ACPT_RSLT_CRCT_NO,"	//	受入実績訂正回数
				+	"INSPEC_RSLT_CRCT_NO,"	//	検査実績訂正回数
				+	"WORK_ODR_CD,"			//	作業計画番号
				+	"WORK_IN_PROC_CD,"		//	仕掛作業コード
				+	"PARTIAL_PRD_NO,"		//	分作回数
				+	"OPR_RSLT_CRCT_NO,"		//	作業実績訂正回数
				+	"ISSUE_INST_CD,"		//	出庫指示番号
				+	"RCV_ISSUE_QTY,"		//	入出庫数
				+	"RCV_ISSUE_AMOUNT,"		//	入出庫金額
				+	"RCV_ISSUE_DATE,"		//	入出庫年月日
				+	"RCV_ISSUE_GNR_TYP,"	//	入出庫発生区分
				+	"RCV_ISSUE_ODD_QTY,"	//	入出庫端数
				+	"DEFECT_CAUSE_CD,"		//	入出庫不良理由コード
				+	"STOCK_UPD_TYP,"		//	在庫更新区分
				+	"RCV_ISSUE_CMPLT_FLG,"	//	入出庫完了フラグ
				+	"OD_NO,"				//	オーダデマンド番号
				+	"VEND_LOT_NO,"			//	メーカロット番号
				+	"RCV_ISSUE_COMMENT,"	//	入出庫備考
				+	"COMPANY_CD,"			//	会社コード
				+	"VEND_CD,"				//	取引先コード
				+	"CONS_TYP,"				//	支給区分
				+	"CONS_EXEC_DATE,"		//	有償支給実績抽出日
//				+	"CREATED_DATE,"			//	作成日
				+	"CREATED_BY,"			//	作成者
				+	"CREATED_PRG_NM,"		//	作成プログラム名
//				+	"UPDATED_DATE,"			//	更新日
				+	"UPDATED_BY,"			//	更新者
				+	"UPDATED_PRG_NM,"		//	更新プログラム名
				+	"MODIFY_COUNT)	 "		//	更新数
				+ "values ("
					+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//					+" sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
					+" ?, ?, ?, ?, ?)";
			ps = _conn.prepareStatement(sql);

			ps.setString(iIndex++, strOdrCd);												//	入出庫管理番号
			ps.setDouble(iIndex++, 2);														//	入出庫区分
			ps.setString(iIndex++, (String)htT.get("ITEM_CD"));								//	品目番号
			ps.setString(iIndex++, (String)htT.get("PLANT_CD"));							//	工場コード
			ps.setNull(iIndex++,Types.VARCHAR);												//	保管区コード
			ps.setNull(iIndex++,Types.VARCHAR);												//	製番
			ps.setDouble(iIndex++,0);														//	製番枝番
			ps.setString(iIndex++, ginPUCH_ODR_CD);											//	発注番号
			ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));							//	受入回数
			ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	受入訂正回数
			ps.setDouble(iIndex++, 0);														//	検査実績訂正回数
			ps.setString(iIndex++, ginWORK_ODR_CD);											//	作業計画番号
			ps.setString(iIndex++, ginWORK_IN_PROC_CD);										//	仕掛作業コード
			ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	分作回数
			ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	作業実績訂正回数
			ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));						//	出庫指示番号
			ps.setDouble(iIndex++, 0);														//	入出庫数
			ps.setDouble(iIndex++, 0);														//	入出庫金額
			dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
			ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));						//  入出庫年月日????????
//			ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));	//	入出庫年月日 ????
			ps.setDouble(iIndex++, 21);														//	入出庫発生区分
			ps.setDouble(iIndex++, 0);														//	入出庫端数
			ps.setNull(iIndex++, Types.VARCHAR);											//	入出庫不良理由コード
//20031103	ps.setDouble(iIndex++, 1);														//	在庫更新区分
			ps.setDouble(iIndex++, 2);														//	在庫更新区分(更新済み)
			ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	入出庫完了フラグ
			ps.setString(iIndex++, (String)htT.get("OD_NO"));								//	オーダデマンド番号
			//-----------------------------------------------------------------
			ps.setString(iIndex++, "");														//	メーカロット番号
			ps.setString(iIndex++, "");														//	入出庫備考
			ps.setString(iIndex++, "");														//	会社コード
			ps.setString(iIndex++, "");														//	取引先コード
			ps.setDouble(iIndex++, 0);														//	支給区分
			ps.setNull(iIndex++, Types.DATE);												//	有償支給実績抽出日
	//			ps.setDate(iIndex++, "");		//	作成日
				ps.setString(iIndex++, _userInfo.getUserId());			//	作成者
				ps.setString(iIndex++, _userInfo.getBusinessName());	//	作成プログラム名
	//			ps.setString(iIndex++, "");		//	更新日
				ps.setString(iIndex++, _userInfo.getUserId());			//	更新者
				ps.setString(iIndex++, _userInfo.getBusinessName());	//	更新プログラム名
				ps.setDouble(iIndex++, 0);		//	更新数

			iIndex=ps.executeUpdate();
			ps.close();
			if ( ginPUCH_ODR_CD== null)
			{
				htT_RCV_ISSUE.put("PUCH_ODR_CD","");
			}else{
				htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);					//発注番号
			}
			if ( ginACPT_NO== null)
			{
				htT_RCV_ISSUE.put("ACPT_NO","");
			}else{
				htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);							//受入回数
			}
			if ( ginACPT_RSLT_CRCT_NO== null)
			{
				htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
			}else{
				htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);		//受入実績訂正回数
			}
			if (ginWORK_ODR_CD == null)
			{
				htT_RCV_ISSUE.put("WORK_ODR_CD","");
			}else{
				htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);					//作業計画番号
			}
			if (ginWORK_IN_PROC_CD == null)
			{
				htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
			}else{
				htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);			//仕掛作業コード
			}
			if (ginPARTIAL_PRD_NO == null)
			{
				htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
			}else{
				htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);				//分作回数
			}
			if (ginOPR_RSLT_CRCT_NO == null)
			{
				htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
			}else{
				htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);			//作業実績訂正回数
			}
			if (ginRCV_ISSUE_DATE == null)
			{
				htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
			}else{
				htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);				//入出庫年月日
			}
			if (ginRCV_ISSUE_CMPLT_FLG == null)
			{
				htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
			}else{
				htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);	//入出庫完了フラグ
			}

			htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);					//入出庫管理番号
			htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");								//入出庫区分
			htT_RCV_ISSUE.put("ITEM_CD",(String)htT.get("ITEM_CD"));			//品目番号
			htT_RCV_ISSUE.put("PLANT_CD",(String)htT.get("PLANT_CD"));			//工場コード
			htT_RCV_ISSUE.put("WH_CD","");										//保管区コード
			htT_RCV_ISSUE.put("JOB_ODR_CD","");									//製番
			htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");							//製番枝番
			htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");						//検査実績訂正回数
			htT_RCV_ISSUE.put("ISSUE_INST_CD",(String)htT.get("ISSUE_INST_CD"));//出庫指示番号
			htT_RCV_ISSUE.put("RCV_ISSUE_QTY","0");								//入出庫数
			htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");							//入出庫金額
			htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");						//入出庫発生区分
			htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");							//入出庫端数
			htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");							//入出庫不良理由コード
			htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");								//在庫更新区分
			htT_RCV_ISSUE.put("OD_NO",(String)htT.get("OD_NO"));				//オーダデマンド番号
			htT_RCV_ISSUE.put("VEND_LOT_NO","");								//メーカロット番号
			htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");							//入出庫備考
			htT_RCV_ISSUE.put("COMPANY_CD","");									//会社コード
			htT_RCV_ISSUE.put("VEND_CD","");									//取引先コード
			htT_RCV_ISSUE.put("CONS_TYP","");									//支給区分
			htT_RCV_ISSUE.put("CONS_EXEC_DATE","");								//有償支給実績抽出日

//20031104			_log.message(sql);
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//			if (rs != null)
//			{
//				rs.close();
//			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return strOdrCd;
	};

//20031121修正開始
/*
	//品目別保管先優先順位の検索
	private	ResultSet JDB0007(int iIndex)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		Hashtable htT=null;
		String sITEM_CD="";
		String sPLANT_CD="";
		try
		{
			_log.methodStart();

			htT	= (Hashtable)alT_ISSUE_INST.get(iIndex-1);
			sITEM_CD = (String)htT.get("ITEM_CD");
			sPLANT_CD =	(String)htT.get("PLANT_CD");


			// << 品目別保管先優先順位の検索 >>
			sql	= "SELECT M_WH_PRIORITY.ITEM_CD, M_WH_PRIORITY.WH_CD, M_WH_PRIORITY.PLANT_CD, "
			+" M_WH_PRIORITY.WH_PRIORITY_REF_NO "
			+" FROM M_WH_PRIORITY "
			+" WHERE ((M_WH_PRIORITY.ITEM_CD=?) AND (M_WH_PRIORITY.PLANT_CD=?)) "
			+" ORDER BY WH_PRIORITY_REF_NO ";

			ps = _conn.prepareStatement(sql);
			ps.setString(1,	sITEM_CD);
			ps.setString(2,	sPLANT_CD);
			rs = ps.executeQuery();

			//DEBUG
//20031104			_log.message("iIndex=["+iIndex+"]");
//20031104			_log.message("品目別保管先優先順位・品目・sITEM_CD=["+sITEM_CD+"]");
//20031104			_log.message("品目別保管先優先順位・工場コード・sPLANT_CD=["+sPLANT_CD+"]");
//20031104			_log.message(sql);
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//			if (rs != null)
//			{
//				rs.close();
//			}
//			if (ps != null)
//			{
//				ps.close();
//			}
		}
		return rs;
	};
*/
//20031121修正終了

	//【ＭＲＰ品の払出保管区の順序】
//20031121修正開始
//	private	double	JDB0008(ResultSet rsIN, int iInIndex,	double	dInISSUE_NO, int iInTyp)
//			throws SQLException,Exception{
	private	double	JDB0008(int iInIndex,	double	dInISSUE_NO, int iInTyp)
			throws SQLException,Exception{
		ResultSet rsIN=null;
		PreparedStatement psIN=null;
		PreparedStatement psREAD=null;
//20031121修正終了
		CollectNumber ODR_CD=null;
		String strOdrCd="";
		ResultSet rs=null;
		PreparedStatement ps=null;
		String sql="";
		int	iCount =0;
		int	iIndex =1;
		double	dIssueNO =0;
		double	dIssueNOOld	=0;
		double	dIssueCountTemp=0;
		Hashtable htT =	new	Hashtable();
		java.util.Date dtDate = null;

		String sITEM_CD_MIN	= "";				//「品目別保管先優先順位」が最小の保管区
		String sWH_CD_MIN =	"";				//「品目別保管先優先順位」が最小の保管区
		String sPLANT_CD_MIN = "";				//「品目別保管先優先順位」が最小の保管区
		String sWH_PRIORITY_REF_NO_MIN = "";			//「品目別保管先優先順位」が最小の保管区

		String sITEM_CD="";
		String sWH_CD="";
		String sPLANT_CD="";
		String sWH_PRIORITY_REF_NO="";
		String sPlantWH_CD = "";
		double dISSUECOUNT = 0;

		int WH_PRIORITY_FLG = 0;				//品目別保管先優先順位フラグ：データがない場合０　20031012追記

		try
		{
			_log.methodStart();

			//自動出庫数を取得
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);

//20031121修正開始
			// << 品目別保管先優先順位の検索 >>
			sql= "SELECT M_WH_PRIORITY.ITEM_CD, M_WH_PRIORITY.WH_CD, M_WH_PRIORITY.PLANT_CD, "
			+" M_WH_PRIORITY.WH_PRIORITY_REF_NO "
			+" FROM M_WH_PRIORITY "
			+" WHERE ((M_WH_PRIORITY.ITEM_CD=?) AND (M_WH_PRIORITY.PLANT_CD=?)) "
			+" ORDER BY WH_PRIORITY_REF_NO ";
			psIN = _conn.prepareStatement(sql);
			psIN.setString(1,	(String)htT.get("ITEM_CD"));
			psIN.setString(2,	(String)htT.get("PLANT_CD"));
			rsIN = psIN.executeQuery();
//20031121修正終了

			dIssueNO = dInISSUE_NO;
			dIssueNOOld	= dIssueNO;

			//DEBUG
//20031104			_log.message("有償支給履歴登録条件");
//20031104			_log.message("出庫指示・発注番号・PUCH_ODR_CD=["+(String)htT.get("PUCH_ODR_CD")+"]");
//20031104			_log.message("出庫指示・作業計画番号・WORK_ODR_CD=["+(String)htT.get("WORK_ODR_CD")+"]");
//20031104			_log.message("出庫指示・支給区分・CONS_TYP=["+(String)htT.get("CONS_TYP")+"]");

			while (rsIN.next())
			{

				WH_PRIORITY_FLG = 1;

				sITEM_CD=rsIN.getString("ITEM_CD");
				sWH_CD=rsIN.getString("WH_CD");
				sPLANT_CD=rsIN.getString("PLANT_CD");
				sWH_PRIORITY_REF_NO=rsIN.getString("WH_PRIORITY_REF_NO");
				if (sWH_CD_MIN.equals(""))
				{
					sITEM_CD_MIN=rsIN.getString("ITEM_CD");
					sWH_CD_MIN=rsIN.getString("WH_CD");
					sPLANT_CD_MIN=rsIN.getString("PLANT_CD");
					sWH_PRIORITY_REF_NO_MIN=rsIN.getString("WH_PRIORITY_REF_NO");
				}
				//DEBUG
//20031104				_log.message("iCount=["+iCount+"]");
//20031104				_log.message("品目別保管先優先順位・品目番号・sITEM_CD=["+sITEM_CD+"]");
//20031104				_log.message("品目別保管先優先順位・保管区コード・sWH_CD=["+sWH_CD+"]");
//20031104				_log.message("品目別保管先優先順位・工場コード・sPLANT_CD=["+sPLANT_CD+"]");
//20031104				_log.message("品目別保管先優先順位・品目別保管先優先順位・sWH_PRIORITY_REF_NO=["+sWH_PRIORITY_REF_NO+"]");

				// << 保管区別品目在庫の検索 >>
				sql	= "SELECT T_ITEM_STOCK.ITEM_CD, T_ITEM_STOCK.WH_CD, T_ITEM_STOCK.PLANT_CD, "
				+" T_ITEM_STOCK.STOCK_ON_HAND_QTY, T_ITEM_STOCK.DEFECT_QTY, T_ITEM_STOCK.PRVS_DAYEND_STOCK_QTY, "
				+" T_ITEM_STOCK.PRVS_MONTHEND_STOCK_QTY, T_ITEM_STOCK.PRVS_TERMEND_STOCK_QTY "
				+" FROM T_ITEM_STOCK , M_WH "
				+" WHERE ((T_ITEM_STOCK.ITEM_CD=?) AND (T_ITEM_STOCK.WH_CD=?) AND (T_ITEM_STOCK.PLANT_CD=?) "
				+" AND (T_ITEM_STOCK.STOCK_ON_HAND_QTY>0) "
				+" AND (T_ITEM_STOCK.WH_CD = M_WH.WH_CD) "
				+" AND (M_WH.MRP_FLG = 1)) ";

//20031121修正開始
				psREAD = _conn.prepareStatement(sql);
				psREAD.setString(1,	sITEM_CD);
				psREAD.setString(2,	sWH_CD);
				psREAD.setString(3,	sPLANT_CD);
				rs = psREAD.executeQuery();
//				ps = _conn.prepareStatement(sql);
//				ps.setString(1,	sITEM_CD);
//				ps.setString(2,	sWH_CD);
//				ps.setString(3,	sPLANT_CD);
//				//DEBUG
////20031104				_log.message("sql=["+sql+"]");
//				rs = ps.executeQuery();
//20031121修正終了

				if (rs.next())
				{
					//入出庫番号の採番
					ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,
						_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
					strOdrCd = ODR_CD.getNo();

					// << 保管区別入出庫の登録 >>
					sql	= "insert into "
						+"	T_RCV_ISSUE( "
						+" RCV_ISSUE_CTRL_CD,"		//	入出庫管理番号
						+	"RCV_ISSUE_TYP,"		//	入出庫区分
						+	"ITEM_CD,"				//	品目番号
						+	"PLANT_CD,"				//	工場コード
						+	"WH_CD,"				//	保管区コード
						+	"JOB_ODR_CD,"			//	製番
						+	"JOB_ODR_DETAIL_NO,"	//	製番枝番
						+	"PUCH_ODR_CD,"			//	発注番号
						+	"ACPT_NO,"				//	受入回数
						+	"ACPT_RSLT_CRCT_NO,"	//	受入実績訂正回数
						+	"INSPEC_RSLT_CRCT_NO,"	//	検査実績訂正回数
						+	"WORK_ODR_CD,"			//	作業計画番号
						+	"WORK_IN_PROC_CD,"		//	仕掛作業コード
						+	"PARTIAL_PRD_NO,"		//	分作回数
						+	"OPR_RSLT_CRCT_NO,"		//	作業実績訂正回数
						+	"ISSUE_INST_CD,"		//	出庫指示番号
						+	"RCV_ISSUE_QTY,"		//	入出庫数
						+	"RCV_ISSUE_AMOUNT,"		//	入出庫金額
						+	"RCV_ISSUE_DATE,"		//	入出庫年月日
						+	"RCV_ISSUE_GNR_TYP,"	//	入出庫発生区分
						+	"RCV_ISSUE_ODD_QTY,"	//	入出庫端数
						+	"DEFECT_CAUSE_CD,"		//	入出庫不良理由コード
						+	"STOCK_UPD_TYP,"		//	在庫更新区分
						+	"RCV_ISSUE_CMPLT_FLG,"	//	入出庫完了フラグ
						+	"OD_NO,"				//	オーダデマンド番号
						+	"VEND_LOT_NO,"			//	メーカロット番号
						+	"RCV_ISSUE_COMMENT,"	//	入出庫備考
						+	"COMPANY_CD,"			//	会社コード
						+	"VEND_CD,"				//	取引先コード
						+	"CONS_TYP,"				//	支給区分
						+	"CONS_EXEC_DATE,"		//	有償支給実績抽出日
//						+	"CREATED_DATE,"			//	作成日
						+	"CREATED_BY,"			//	作成者
						+	"CREATED_PRG_NM,"		//	作成プログラム名
//						+	"UPDATED_DATE,"			//	更新日
						+	"UPDATED_BY,"			//	更新者
						+	"UPDATED_PRG_NM,"		//	更新プログラム名
						+	"MODIFY_COUNT) "		//	更新数
					+ "values ("
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//						+"sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
						+"?, ?, ?, ?, ?)";
					ps = _conn.prepareStatement(sql);

					ps.setString(iIndex++, strOdrCd);												//	入出庫管理番号
					ps.setDouble(iIndex++, 2);														//	入出庫区分
					ps.setString(iIndex++, rs.getString("ITEM_CD"));								//	品目番号
					ps.setString(iIndex++, (String)htT.get("PLANT_CD"));							//	工場コード
					ps.setString(iIndex++, rs.getString("WH_CD"));									//	保管区コード
					//09-25仕様確認より修正、再変更可能性がある。
//					if (iInTyp == 3)
//					{
//						ps.setString(iIndex++, (String)htT_OD.get("JOB_ODR_CD"));					//	製番			OK?
//						ps.setDouble(iIndex++, 0);													//	製番枝番		OK?
//					} else {
//						ps.setNull(iIndex++, Types.VARCHAR);										//	製番			OK?
//						ps.setNull(iIndex++, Types.NUMERIC);										//	製番枝番		OK?
//					}
					ps.setNull(iIndex++, Types.VARCHAR);											//	製番			OK?
					ps.setDouble(iIndex++, 0);														//	製番枝番		OK?
					ps.setString(iIndex++, ginPUCH_ODR_CD);											//	発注番号
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));							//	受入回数
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	受入訂正回数
					ps.setDouble(iIndex++, 0);														//	検査実績訂正回数
					ps.setString(iIndex++, ginWORK_ODR_CD);											//	作業計画番号
					ps.setString(iIndex++, ginWORK_IN_PROC_CD);										//	作業コード
					ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	分作回数
					ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	作業実績訂正回数
					ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));						//	出庫指示番号
					dIssueCountTemp	= rs.getDouble("STOCK_ON_HAND_QTY");
					if (dIssueCountTemp	>= dIssueNO)
					{
						dIssueCountTemp	= dIssueNO;

//						dIssueNO = 0;
//					} else {
//						dIssueNO = dIssueNO	- dIssueCountTemp;
					}
					ps.setDouble(iIndex++, dIssueCountTemp * -1);									//	入出庫数
					ps.setDouble(iIndex++, 0);														//	入出庫金額
					dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
					ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));						//  入出庫年月日????????
					ps.setDouble(iIndex++, 21);														//	入出庫発生区分
					ps.setDouble(iIndex++, 0);														//	入出庫端数
					ps.setNull(iIndex++, Types.VARCHAR);											//	入出庫不良理由コード	OK?
					ps.setDouble(iIndex++, 1);														//	在庫更新区分
					ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	入出庫完了フラグ
					ps.setString(iIndex++, (String)htT.get("OD_NO"));								//	オーダデマンド番号
					//-----------------------------------------------------------------
					ps.setString(iIndex++, "");														//	メーカロット番号
					ps.setString(iIndex++, "");														//	入出庫備考
					ps.setString(iIndex++, "");														//	会社コード
					ps.setString(iIndex++, "");														//	取引先コード
					ps.setDouble(iIndex++, 0);														//	支給区分
					ps.setNull(iIndex++, Types.DATE);												//	有償支給実績抽出日
		//			ps.setDate(iIndex++, "");		//	作成日
					ps.setString(iIndex++, _userInfo.getUserId());			//	作成者
					ps.setString(iIndex++, _userInfo.getBusinessName());	//	作成プログラム名
		//			ps.setString(iIndex++, "");		//	更新日
					ps.setString(iIndex++, _userInfo.getUserId());			//	更新者
					ps.setString(iIndex++, _userInfo.getBusinessName());	//	更新プログラム名
					ps.setDouble(iIndex++, 0);		//	更新数

					iIndex=ps.executeUpdate();
					if (iIndex > 0)
					{
						iCount++;
						dISSUECOUNT = dISSUECOUNT + dIssueCountTemp;
						dIssueNO = dIssueNO	- dIssueCountTemp;

					}
					ps.close();
					ps = null;
					//DEBUG
//20031104					_log.message("保管区別入出庫の登録番号01=["+strOdrCd+"]");
//20031104					_log.message("保管区別入出庫の登録件数01=["+iIndex+"]");

					//出庫処理を呼び出し
					_log.message("(SBM1199)出庫処理を呼び出し......");
					_IssueProcess = new IssueProcess(_iconn, strOdrCd);
					_IssueProcess.execProcess();

					if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
						(((String)htT.get("WORK_ODR_CD")).equals("")) &&
						(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
					{
						//DEBUG
//20031104						_log.message("有償支給履歴登録");
						// 登録した保管区別入出庫を保存
						htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);							//	入出庫管理番号
						htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");										//	入出庫区分
						htT_RCV_ISSUE.put("PLANT_CD",(String)htT.get("PLANT_CD"));					//	工場コード
//						//09-25仕様確認より修正、再変更可能性がある。
//						if (iInTyp == 3)
//						{
//							htT_RCV_ISSUE.put("JOB_ODR_CD",(String)htT_OD.get("JOB_ODR_CD"));		//	製番OK?
//							htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");								//	製番枝番OK?
//						} else {
//							htT_RCV_ISSUE.put("JOB_ODR_CD","");										//	製番OK?
//							htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","");								//	製番枝番OK?
//						}
						if (rs.getString("ITEM_CD") == null)
						{
							htT_RCV_ISSUE.put("ITEM_CD","");
						}else{
							htT_RCV_ISSUE.put("ITEM_CD",rs.getString("ITEM_CD"));						//	品目番号
						}
						if (rs.getString("WH_CD") == null)
						{
							htT_RCV_ISSUE.put("WH_CD","");
						}else{
							htT_RCV_ISSUE.put("WH_CD",rs.getString("WH_CD"));							//	保管区コード
						}
						if (ginPUCH_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("PUCH_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);							//	発注番号
						}
						if (ginACPT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);									//	受入回数
						}
						if (ginACPT_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);				//	受入実績訂正回数
						}
						if (ginWORK_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);							//	作業計画番号
						}
						if (ginWORK_IN_PROC_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);					//	仕掛作業コード
						}
						if (ginPARTIAL_PRD_NO == null)
						{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
						}else{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);						//	分作回数
						}
						if (ginOPR_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);					//	作業実績訂正回数
						}
						if (ginRCV_ISSUE_DATE == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);						//	入出庫年月日
						}
						if (ginRCV_ISSUE_CMPLT_FLG == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);			//	入出庫完了フラグ
						}
						htT_RCV_ISSUE.put("JOB_ODR_CD","");											//	製番OK?
						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");									//	製番枝番OK?
						htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");								//	検査実績訂正回数
						htT_RCV_ISSUE.put("ISSUE_INST_CD",(String)htT.get("ISSUE_INST_CD"));		//	出庫指示番号
						htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueCountTemp *	-1));	//	入出庫数
						htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");									//	入出庫金額
						htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");								//	入出庫発生区分
						htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");									//	入出庫端数
						htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");									//	入出庫不良理由コード
						htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");										//	在庫更新区分
						htT_RCV_ISSUE.put("OD_NO",(String)htT.get("OD_NO"));						//	オーダデマンド番号
						htT_RCV_ISSUE.put("VEND_LOT_NO","");										//	メーカロット番号
						htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");									//	入出庫備考
						htT_RCV_ISSUE.put("COMPANY_CD","");											//	会社コード
						htT_RCV_ISSUE.put("VEND_CD","");											//	取引先コード
						htT_RCV_ISSUE.put("CONS_TYP","");											//	支給区分
						htT_RCV_ISSUE.put("CONS_EXEC_DATE","");										//	有償支給実績抽出日
						// [有償支給履歴]への追加
						JDB0016(iInIndex,1);
					}
				}
//20031121追加
//20031125
				if (psREAD != null)
				{
					psREAD.close();
				}
				if (dIssueNO==0)
				{
					break;
				}
			}
			//

//200310112削除			if (iCount != 0	&& dIssueNO	> 0)
			if (WH_PRIORITY_FLG == 1 && dIssueNO	> 0)
			{
				//DEBUG
//20031104				_log.message("品目別保管先優先順位の最小保管区から、出庫");
				//入出庫番号の採番
				ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
				strOdrCd = ODR_CD.getNo();
				// << 保管区別入出庫の登録 >>
				sql	= "insert into "
					+"	T_RCV_ISSUE( "
					+" RCV_ISSUE_CTRL_CD,"			//	入出庫管理番号
					+	"RCV_ISSUE_TYP,"		//	入出庫区分
					+	"ITEM_CD,"			//	品目番号
					+	"PLANT_CD,"			//	工場コード
					+	"WH_CD,"			//	保管区コード
					+	"JOB_ODR_CD,"			//	製番
					+	"JOB_ODR_DETAIL_NO,"		//	製番枝番
					+	"PUCH_ODR_CD,"			//	発注番号
					+	"ACPT_NO,"			//	受入回数
					+	"ACPT_RSLT_CRCT_NO,"		//	受入実績訂正回数
					+	"INSPEC_RSLT_CRCT_NO,"		//	検査実績訂正回数
					+	"WORK_ODR_CD,"			//	作業計画番号
					+	"WORK_IN_PROC_CD,"		//	仕掛作業コード
					+	"PARTIAL_PRD_NO,"		//	分作回数
					+	"OPR_RSLT_CRCT_NO,"		//	作業実績訂正回数
					+	"ISSUE_INST_CD,"		//	出庫指示番号
					+	"RCV_ISSUE_QTY,"		//	入出庫数
					+	"RCV_ISSUE_AMOUNT,"		//	入出庫金額
					+	"RCV_ISSUE_DATE,"		//	入出庫年月日
					+	"RCV_ISSUE_GNR_TYP,"		//	入出庫発生区分
					+	"RCV_ISSUE_ODD_QTY,"		//	入出庫端数
					+	"DEFECT_CAUSE_CD,"		//	入出庫不良理由コード
					+	"STOCK_UPD_TYP,"		//	在庫更新区分
					+	"RCV_ISSUE_CMPLT_FLG,"		//	入出庫完了フラグ
					+	"OD_NO,"			//	オーダデマンド番号
					+	"VEND_LOT_NO,"			//	メーカロット番号
					+	"RCV_ISSUE_COMMENT,"		//	入出庫備考
					+	"COMPANY_CD,"			//	会社コード
					+	"VEND_CD,"			//	取引先コード
					+	"CONS_TYP,"			//	支給区分
					+	"CONS_EXEC_DATE,"		//	有償支給実績抽出日
//					+	"CREATED_DATE,"			//	作成日
					+	"CREATED_BY,"			//	作成者
					+	"CREATED_PRG_NM,"		//	作成プログラム名
//					+	"UPDATED_DATE,"			//	更新日
					+	"UPDATED_BY,"			//	更新者
					+	"UPDATED_PRG_NM,"		//	更新プログラム名
					+	"MODIFY_COUNT) "		//	更新数
				+ "values ("
					+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//					+" ?, ?, ?, ?, ?, ?, ?, ?, sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
					+" ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				ps = _conn.prepareStatement(sql);
				iIndex = 1;
				//DEBUG
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("iIndex=["+iIndex+"]");
//20031104				_log.message("strOdrCd=["+strOdrCd+"]");
				ps.setString(iIndex++, strOdrCd);								//	入出庫管理番号
				ps.setDouble(iIndex++, 2);									//	入出庫区分
				ps.setString(iIndex++, sITEM_CD_MIN);								//	品目番号
				ps.setString(iIndex++, (String)htT.get("PLANT_CD"));						//	工場コード
				ps.setString(iIndex++, sWH_CD_MIN);								//	保管区コード
//				//09-25仕様確認より修正、再変更可能性がある。
//				if (iInTyp == 3)
//				{
//					ps.setString(iIndex++, (String)htT_OD.get("JOB_ODR_CD"));					//	製番			OK?
//					ps.setDouble(iIndex++, 0);													//	製番枝番		OK?
//				} else {
//					ps.setNull(iIndex++, Types.VARCHAR);										//	製番			OK?
//					ps.setNull(iIndex++, Types.NUMERIC);										//	製番枝番		OK?
//				}
				ps.setNull(iIndex++, Types.VARCHAR);								//	製番			OK?
				ps.setDouble(iIndex++, 0);									//	製番枝番		OK?
				ps.setString(iIndex++, ginPUCH_ODR_CD);								//	発注番号
				ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));						//	受入回数
				ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	受入訂正回数
				ps.setDouble(iIndex++, 0);									//	検査実績訂正回数
				ps.setString(iIndex++, ginWORK_ODR_CD);								//	作業計画番号
				ps.setString(iIndex++, ginWORK_IN_PROC_CD);							//	仕掛作業コード
				ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	分作回数
				ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	作業実績訂正回数
				ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));					//	出庫指示番号
				ps.setDouble(iIndex++, dIssueNO	* -1);								//	入出庫数
				ps.setDouble(iIndex++, 0);									//	入出庫金額
				dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
				ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));					//  入出庫年月日????????
//				ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));	//	入出庫年月日?????????
				ps.setDouble(iIndex++, 21);									//	入出庫発生区分
				ps.setDouble(iIndex++, 0);									//	入出庫端数
				ps.setNull(iIndex++, Types.VARCHAR);								//	入出庫不良理由コード?
				ps.setDouble(iIndex++, 1);									//	在庫更新区分
				ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	入出庫完了フラグ
				ps.setString(iIndex++, (String)htT.get("OD_NO"));						//	オーダデマンド番号
				//-----------------------------------------------------------------
				ps.setString(iIndex++, "");									//	メーカロット番号
				ps.setString(iIndex++, "");									//	入出庫備考
				ps.setString(iIndex++, "");									//	会社コード
				ps.setString(iIndex++, "");									//	取引先コード
				ps.setDouble(iIndex++, 0);									//	支給区分
				ps.setNull(iIndex++, Types.DATE);								//	有償支給実績抽出日
	//			ps.setDate(iIndex++, "");		//	作成日
				ps.setString(iIndex++, _userInfo.getUserId());							//	作成者
				ps.setString(iIndex++, _userInfo.getBusinessName());						//	作成プログラム名
	//			ps.setString(iIndex++, "");		//	更新日
				ps.setString(iIndex++, _userInfo.getUserId());							//	更新者
				ps.setString(iIndex++, _userInfo.getBusinessName());						//	更新プログラム名
				ps.setDouble(iIndex++, 0);									//	更新数

				iIndex=ps.executeUpdate();
				ps.close();
				if (iIndex > 0)
				{
					iCount++;  //20031012追記
					dISSUECOUNT = dISSUECOUNT + dIssueNO;
				}
				//DEBUG
//20031104				_log.message("保管区別入出庫の登録番号02=["+strOdrCd+"]");
//20031104				_log.message("保管区別入出庫の登録件数02=["+iIndex+"]");

				//出庫処理を呼び出し
				_log.message("(SBM1199)出庫処理を呼び出し......");
				_IssueProcess = new IssueProcess(_iconn, strOdrCd);
				_IssueProcess.execProcess();

				if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
					(((String)htT.get("WORK_ODR_CD")).equals("")) &&
					(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
				{
					//DEBUG
//20031104					_log.message("有償支給履歴登録");
					// 登録した保管区別入出庫を保存
					htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);									//	入出庫管理番号
					htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");												//	入出庫区分
					htT_RCV_ISSUE.put("PLANT_CD",(String)htT.get("PLANT_CD"));							//	工場コード
//					//09-25仕様確認より修正、再変更可能性がある。
//					if (iInTyp == 3)
//					{
//						htT_RCV_ISSUE.put("JOB_ODR_CD",(String)htT_OD.get("JOB_ODR_CD"));				//	製番OK?
//						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");										//	製番枝番OK?
//					} else {
//						htT_RCV_ISSUE.put("JOB_ODR_CD","");												//	製番OK?
//						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","");										//	製番枝番OK?
//					}
					if (sITEM_CD_MIN == null)
					{
						htT_RCV_ISSUE.put("ITEM_CD","");
					}else{
						htT_RCV_ISSUE.put("ITEM_CD",sITEM_CD_MIN);											//	品目番号
					}
					if (sWH_CD_MIN == null)
					{
						htT_RCV_ISSUE.put("WH_CD","");
					}else{
						htT_RCV_ISSUE.put("WH_CD",sWH_CD_MIN);												//	保管区コード
					}
					if (ginPUCH_ODR_CD == null)
					{
						htT_RCV_ISSUE.put("PUCH_ODR_CD","");
					}else{
						htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);									//	発注番号
					}
					if (ginACPT_NO == null)
					{
						htT_RCV_ISSUE.put("ACPT_NO","");
					}else{
						htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);											//	受入回数
					}
					if (ginACPT_RSLT_CRCT_NO == null)
					{
						htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
					}else{
						htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);						//	受入実績訂正回数
					}
					if (ginWORK_ODR_CD == null)
					{
						htT_RCV_ISSUE.put("WORK_ODR_CD","");
					}else{
						htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);									//	作業計画番号
					}
					if (ginWORK_IN_PROC_CD == null)
					{
						htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
					}else{
						htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);							//	仕掛作業コード
					}
					if (ginPARTIAL_PRD_NO == null)
					{
						htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
					}else{
						htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);								//	分作回数
					}
					if (ginOPR_RSLT_CRCT_NO == null)
					{
						htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
					}else{
						htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);							//	作業実績訂正回数
					}
					if (ginRCV_ISSUE_DATE == null)
					{
						htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
					}else{
						htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);								//	入出庫年月日
					}
					if (ginRCV_ISSUE_CMPLT_FLG == null)
					{
						htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
					}else{
						htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);					//	入出庫完了フラグ
					}
					htT_RCV_ISSUE.put("JOB_ODR_CD","");													//	製番OK?
					htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");											//	製番枝番OK?
					htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");										//	検査実績訂正回数
					htT_RCV_ISSUE.put("ISSUE_INST_CD",(String)htT.get("ISSUE_INST_CD"));				//	出庫指示番号
					htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueNO *	-1));				//	入出庫数
					htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");											//	入出庫金額
					htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");										//	入出庫発生区分
					htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");											//	入出庫端数
					htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");											//	入出庫不良理由コード
					htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");												//	在庫更新区分
					htT_RCV_ISSUE.put("OD_NO",(String)htT.get("OD_NO"));								//	オーダデマンド番号
					htT_RCV_ISSUE.put("VEND_LOT_NO","");												//	メーカロット番号
					htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");											//	入出庫備考
					htT_RCV_ISSUE.put("COMPANY_CD","");													//	会社コード
					htT_RCV_ISSUE.put("VEND_CD","");													//	取引先コード
					htT_RCV_ISSUE.put("CONS_TYP","");													//	支給区分
					htT_RCV_ISSUE.put("CONS_EXEC_DATE","");												//	有償支給実績抽出日
					// [有償支給履歴]への追加
					JDB0016(iInIndex,1);
				}
			}
//20031012修正
			//④①で存在しない場合は、[工場]を以下の条件で検索し、「代表納入場所コード」を取得する。
			if (iCount == 0	&& dIssueNO	> 0)
			{
				//DEBUG
//20031104				_log.message("「代表納入場所コード」から、出庫");
				// << 保管区別品目在庫の検索 >>
				sql	= "SELECT M_PLANT.PLANT_CD, M_PLANT.WH_CD "
					+" FROM M_PLANT "
					+" WHERE (((M_PLANT.PLANT_CD)=?)) ";
				ps = _conn.prepareStatement(sql);
				ps.setString(1,	(String)htT.get("PLANT_CD"));
				rs = ps.executeQuery();
				if (rs.next())
				{
					sPlantWH_CD	= rs.getString("WH_CD");
				}
				ps.close();
				rs.close();

				if (sPlantWH_CD == null || sPlantWH_CD.equals(""))	// 20031031追加
				{
					// << 保管区の検索 >>
					sql	= "SELECT M_WH.WH_CD "
						+ " FROM M_WH "
						+ " WHERE ((M_WH.PLANT_CD=?) "	// 20031031追加
						+ " AND (M_WH.MRP_FLG = 1)) "	// 20031031追加
						+ " ORDER BY M_WH.WH_CD ";
//20031121修正開始
					psREAD = _conn.prepareStatement(sql);
					psREAD.setString(1,	(String)htT.get("PLANT_CD"));	// 20031031追加
					rs = psREAD.executeQuery();
//					ps = _conn.prepareStatement(sql);
//					ps.setString(1,	(String)htT.get("PLANT_CD"));	// 20031031追加
//					rs = ps.executeQuery();
//20031121修正終了


					if (rs.next())
					{
						sPlantWH_CD	= rs.getString("WH_CD");
					}
				}
				
//20031012削除				// << 保管区別品目在庫の検索 >>
//20031012削除				sql	= "SELECT T_ITEM_STOCK.ITEM_CD, T_ITEM_STOCK.WH_CD, T_ITEM_STOCK.PLANT_CD, "
//20031012削除				+" T_ITEM_STOCK.STOCK_ON_HAND_QTY, T_ITEM_STOCK.DEFECT_QTY, T_ITEM_STOCK.PRVS_DAYEND_STOCK_QTY, "
//20031012削除				+" T_ITEM_STOCK.PRVS_MONTHEND_STOCK_QTY, T_ITEM_STOCK.PRVS_TERMEND_STOCK_QTY "
//20031012削除				+" FROM T_ITEM_STOCK , M_WH "
//20031012削除				+" WHERE ((T_ITEM_STOCK.ITEM_CD=?) AND (T_ITEM_STOCK.WH_CD=?) AND (T_ITEM_STOCK.PLANT_CD=?) "
//20031012削除				+" AND (T_ITEM_STOCK.WH_CD = M_WH.WH_CD) "
//20031012削除				+" AND (M_WH.MRP_FLG = 1)) ";

//20031012削除				ps = _conn.prepareStatement(sql);
//20031012削除				ps.setString(1,	(String)htT.get("ITEM_CD"));
//20031012削除				ps.setString(2,	sPlantWH_CD);
//20031012削除				ps.setString(3,	(String)htT.get("PLANT_CD"));
//20031012削除				rs = ps.executeQuery();
				//DEBUG
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("出庫指示・品目番号・ITEM_CD=["+(String)htT.get("ITEM_CD")+"]");
//20031104				_log.message("代表納入場所コード・sPlantWH_CD=["+sPlantWH_CD+"]");
//20031104				_log.message("出庫指示・工場コード・PLANT_CD=["+(String)htT.get("PLANT_CD")+"]");

//20031012削除				if (rs.next())
//20031012削除				{
				if(sPlantWH_CD != null || !sPlantWH_CD.equals(""))
				{
					//入出庫番号の採番
					ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
					strOdrCd = ODR_CD.getNo();

					// << 保管区別入出庫の登録 >>
					sql	= "insert into "
						+"	T_RCV_ISSUE( "
						+" RCV_ISSUE_CTRL_CD,"			//	入出庫管理番号
						+	"RCV_ISSUE_TYP,"		//	入出庫区分
						+	"ITEM_CD,"			//	品目番号
						+	"PLANT_CD,"			//	工場コード
						+	"WH_CD,"			//	保管区コード
						+	"JOB_ODR_CD,"			//	製番
						+	"JOB_ODR_DETAIL_NO,"		//	製番枝番
						+	"PUCH_ODR_CD,"			//	発注番号
						+	"ACPT_NO,"			//	受入回数
						+	"ACPT_RSLT_CRCT_NO,"		//	受入実績訂正回数
						+	"INSPEC_RSLT_CRCT_NO,"		//	検査実績訂正回数
						+	"WORK_ODR_CD,"			//	作業計画番号
						+	"WORK_IN_PROC_CD,"		//	仕掛作業コード
						+	"PARTIAL_PRD_NO,"		//	分作回数
						+	"OPR_RSLT_CRCT_NO,"		//	作業実績訂正回数
						+	"ISSUE_INST_CD,"		//	出庫指示番号
						+	"RCV_ISSUE_QTY,"		//	入出庫数
						+	"RCV_ISSUE_AMOUNT,"		//	入出庫金額
						+	"RCV_ISSUE_DATE,"		//	入出庫年月日
						+	"RCV_ISSUE_GNR_TYP,"		//	入出庫発生区分
						+	"RCV_ISSUE_ODD_QTY,"		//	入出庫端数
						+	"DEFECT_CAUSE_CD,"		//	入出庫不良理由コード
						+	"STOCK_UPD_TYP,"		//	在庫更新区分
						+	"RCV_ISSUE_CMPLT_FLG,"		//	入出庫完了フラグ
						+	"OD_NO,"			//	オーダデマンド番号
						+	"VEND_LOT_NO,"			//	メーカロット番号
						+	"RCV_ISSUE_COMMENT,"		//	入出庫備考
						+	"COMPANY_CD,"			//	会社コード
						+	"VEND_CD,"			//	取引先コード
						+	"CONS_TYP,"			//	支給区分
						+	"CONS_EXEC_DATE,"		//	有償支給実績抽出日
//						+	"CREATED_DATE,"			//	作成日
						+	"CREATED_BY,"			//	作成者
						+	"CREATED_PRG_NM,"		//	作成プログラム名
//						+	"UPDATED_DATE,"			//	更新日
						+	"UPDATED_BY,"			//	更新者
						+	"UPDATED_PRG_NM,"		//	更新プログラム名
						+	"MODIFY_COUNT) "		//	更新数
					+ "values ("
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//						+"?, ?, ?, ?, ?, sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					ps = _conn.prepareStatement(sql);

					iIndex = 1;
					ps.setString(iIndex++, strOdrCd);								//	入出庫管理番号
					ps.setDouble(iIndex++, 2);									//	入出庫区分
//20031012修正					ps.setString(iIndex++, rs.getString("ITEM_CD"));						//	品目番号
					ps.setString(iIndex++, (String)htT.get("ITEM_CD"));						//	品目番号
					ps.setString(iIndex++, (String)htT.get("PLANT_CD"));						//  工場コード
//20031012修正					ps.setString(iIndex++, rs.getString("WH_CD"));							//	保管区コード
					ps.setString(iIndex++, sPlantWH_CD);

//					//09-25仕様確認より修正、再変更可能性がある。
//					if (iInTyp == 3)
//					{
//						ps.setString(iIndex++, (String)htT_OD.get("JOB_ODR_CD"));				//	製番			OK?
//						ps.setDouble(iIndex++, 0);								//	製番枝番		OK?
//					} else {
//						ps.setNull(iIndex++, Types.VARCHAR);							//	製番			OK?
//						ps.setNull(iIndex++, Types.NUMERIC);							//	製番枝番		OK?
//					}
					ps.setNull(iIndex++, Types.VARCHAR);								//	製番			OK?
					ps.setDouble(iIndex++, 0);									//	製番枝番		OK?
					ps.setString(iIndex++, ginPUCH_ODR_CD);								//	発注番号
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));						//	受入回数
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	受入実績訂正回数
					ps.setDouble(iIndex++, 0);									//	検査実績訂正回数
					ps.setString(iIndex++, ginWORK_ODR_CD);								//	作業計画番号
					ps.setString(iIndex++, ginWORK_IN_PROC_CD);							//	仕掛作業コード
					ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	分作回数
					ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	作業実績訂正回数
					ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));					//  出庫指示番号
					ps.setDouble(iIndex++, dIssueNO	* -1);								//	入出庫数
					ps.setDouble(iIndex++, 0);									//	入出庫金額
					dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
					ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));					//  入出庫年月日????????
//					ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));//  入出庫年月日
					ps.setDouble(iIndex++, 21);									//	入出庫発生区分
					ps.setDouble(iIndex++, 0);									//	入出庫端数
					ps.setString(iIndex++, "");									//	入出庫不良理由コード?
					ps.setDouble(iIndex++, 1);									//	在庫更新区分
					ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	入出庫完了フラグ
					ps.setString(iIndex++, (String)htT.get("OD_NO"));						//  オーダデマンド番号
					//-----------------------------------------------------------------
					ps.setString(iIndex++, "");									//	メーカロット番号
					ps.setString(iIndex++, "");									//	入出庫備考
					ps.setString(iIndex++, "");									//	会社コード
					ps.setString(iIndex++, "");									//	取引先コード
					ps.setDouble(iIndex++, 0);									//	支給区分
					ps.setNull(iIndex++, Types.DATE);								//  有償支給実績抽出日
		//			ps.setDate(iIndex++, "");		//	作成日
					ps.setString(iIndex++, _userInfo.getUserId());							//	作成者
					ps.setString(iIndex++, _userInfo.getBusinessName());						//	作成プログラム名
		//			ps.setString(iIndex++, "");		//	更新日
					ps.setString(iIndex++, _userInfo.getUserId());							//	更新者
					ps.setString(iIndex++, _userInfo.getBusinessName());						//	更新プログラム名
					ps.setDouble(iIndex++, 0);		//	更新数

					iIndex=ps.executeUpdate();
					if (iIndex > 0)
					{
						dISSUECOUNT = dISSUECOUNT + dIssueNO;
					}
					ps.close();
					//DEBUG
//20031104					_log.message("保管区別入出庫の登録番号03=["+strOdrCd+"]");
//20031104					_log.message("保管区別入出庫の登録件数03=["+iIndex+"]");

					//出庫処理を呼び出し
					_log.message("(SBM1199)出庫処理を呼び出し......");
					_IssueProcess = new IssueProcess(_iconn, strOdrCd);
					_IssueProcess.execProcess();

					if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
						(((String)htT.get("WORK_ODR_CD")).equals("")) &&
						(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
					{
						//DEBUG
//20031104						_log.message("有償支給履歴登録");
						// 登録した保管区別入出庫を保存
						htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);							//	入出庫管理番号
						htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");										//	入出庫区分
						htT_RCV_ISSUE.put("PLANT_CD",(String)htT.get("PLANT_CD"));					//	工場コード
//						//09-25仕様確認より修正、再変更可能性がある。
//						if (iInTyp == 3)
//						{
//							htT_RCV_ISSUE.put("JOB_ODR_CD",(String)htT_OD.get("JOB_ODR_CD"));		//	製番OK?
//							htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");								//	製番枝番OK?
//						} else {
//							htT_RCV_ISSUE.put("JOB_ODR_CD","");										//	製番OK?
//							htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","");								//	製番枝番OK?
//						}
/*20031012修正
						if (rs.getString("ITEM_CD") == null)
						{
							htT_RCV_ISSUE.put("ITEM_CD","");
						}else{
							htT_RCV_ISSUE.put("ITEM_CD",rs.getString("ITEM_CD"));						//	品目番号
						}
*/
						if ((String)htT.get("ITEM_CD") == null)
						{
							htT_RCV_ISSUE.put("ITEM_CD","");
						}else{
							htT_RCV_ISSUE.put("ITEM_CD",(String)htT.get("ITEM_CD"));						//	品目番号
						}
/*20031012修正
						if (rs.getString("WH_CD") == null)
						{
							htT_RCV_ISSUE.put("WH_CD","");
						}else{
							htT_RCV_ISSUE.put("WH_CD",rs.getString("WH_CD"));							//	保管区コード
						}
*/
						if (sPlantWH_CD == null)
						{
							htT_RCV_ISSUE.put("WH_CD","");
						}else{
							htT_RCV_ISSUE.put("WH_CD",sPlantWH_CD);							//	保管区コード
						}
						if (ginPUCH_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("PUCH_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);							//	発注番号
						}
						if (ginACPT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);									//	受入回数
						}
						if (ginACPT_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);				//	受入実績訂正回数
						}
						if (ginWORK_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);							//	作業計画番号
						}
						if (ginWORK_IN_PROC_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);					//	仕掛作業コード
						}
						if (ginPARTIAL_PRD_NO == null)
						{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
						}else{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);						//	分作回数
						}
						if (ginOPR_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);					//	作業実績訂正回数
						}
						if (ginRCV_ISSUE_DATE == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);						//	入出庫年月日
						}
						if (ginRCV_ISSUE_CMPLT_FLG == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);			//	入出庫完了フラグ
						}
						htT_RCV_ISSUE.put("JOB_ODR_CD","");											//	製番OK?
						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");									//	製番枝番OK?
						htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");								//	検査実績訂正回数
						htT_RCV_ISSUE.put("ISSUE_INST_CD",(String)htT.get("ISSUE_INST_CD"));		//	出庫指示番号
						htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueNO *	-1));		//	入出庫数
						htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");									//	入出庫金額
						htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");								//	入出庫発生区分
						htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");									//	入出庫端数
						htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");									//	入出庫不良理由コード
						htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");										//	在庫更新区分
						htT_RCV_ISSUE.put("OD_NO",(String)htT.get("OD_NO"));						//	オーダデマンド番号
						htT_RCV_ISSUE.put("VEND_LOT_NO","");										//	メーカロット番号
						htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");									//	入出庫備考
						htT_RCV_ISSUE.put("COMPANY_CD","");											//	会社コード
						htT_RCV_ISSUE.put("VEND_CD","");											//	取引先コード
						htT_RCV_ISSUE.put("CONS_TYP","");											//	支給区分
						htT_RCV_ISSUE.put("CONS_EXEC_DATE","");										//	有償支給実績抽出日
						// [有償支給履歴]への追加
						JDB0016(iInIndex,1);
					}
				} else {
					_log.message("(SBM1200)保管区コードが取得できませんでしたので、出庫処理は行われませんでした。");
				}
//20031121追加
//20031125
			if (psREAD != null)
			{
				psREAD.close();
			}
//20031012削除				}
			}

			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//20031121修正開始
//			if (rs != null)
//			{
//				rs.close();
//			}
			if (psIN != null)
			{
				psIN.close();
			}
			if (psREAD != null)
			{
				psREAD.close();
			}
//20031121修正終了
			if (ps != null)
			{
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
			if (rsIN != null){
				try{
					rsIN.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				rsIN = null;
			}
		}
		return dISSUECOUNT;
	};

	//2.10.7.1	個別手配分出庫可能数からの出庫
	private	double	JDB0009(int	iInIndex, double dInISSUENO)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		double dODR_QTY	= 0;
		double dTOTAL_ISSUE_QTY	= 0;
		double dISSUEED_QTY_SUM	= 0;
		double dRC = 0;
		int	iRC=0;
		Hashtable htT =	new	Hashtable();
		try
		{
			_log.methodStart();

			if (dInISSUENO <= 0)
			{
				return 0;
			}
			htT_OD = new Hashtable();
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			// << 所要量の検索 >>
			sql	= "SELECT T_OD.OD_NO, T_OD.ODR_QTY, T_OD.TOTAL_ISSUE_QTY , T_OD.JOB_ODR_CD , "
				+ " T_OD.JOB_ODR_DETAIL_NO, T_OD.ITEM_CD "
				+ " FROM T_OD "
				+ " WHERE (((T_OD.OD_NO)=?)) ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			rs = ps.executeQuery();
			if (rs.next())
			{
				dODR_QTY = rs.getDouble("ODR_QTY");
				dTOTAL_ISSUE_QTY = rs.getDouble("TOTAL_ISSUE_QTY");
				//DEBUG
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("所要量・オーダ数・dODR_QTY=["+dODR_QTY+"]");
//20031104				_log.message("所要量・出庫累計数・dTOTAL_ISSUE_QTY=["+dTOTAL_ISSUE_QTY+"]");
//20031104				_log.message("所要量・製番・JOB_ODR_CD=["+rs.getString("JOB_ODR_CD")+"]");
//20031104				_log.message("所要量・共通変数「製番」・gsJOB_ODR_CD=["+rs.getString("JOB_ODR_CD")+"]");
//20031104				_log.message("所要量・品目番号・ITEM_CD=["+rs.getString("ITEM_CD")+"]");

				if (rs.getString("OD_NO") == null)
				{
					htT_OD.put("OD_NO","");
				}else{
					htT_OD.put("OD_NO",	rs.getString("OD_NO"));											//オーダデマンド番号
				}
				if (rs.getString("JOB_ODR_CD") == null)
				{
					htT_OD.put("JOB_ODR_CD","");
				}else{
					htT_OD.put("JOB_ODR_CD", rs.getString("JOB_ODR_CD"));								//製番
				}
				if (rs.getString("ITEM_CD") == null)
				{
					htT_OD.put("ITEM_CD","");
				}else{
					htT_OD.put("ITEM_CD", rs.getString("ITEM_CD"));										//品目番号
				}
				if (rs.getString("JOB_ODR_CD") == null)
				{
					gsJOB_ODR_CD="";
				}else{
					gsJOB_ODR_CD=rs.getString("JOB_ODR_CD");
				}
				htT_OD.put("ODR_QTY", Double.toString(rs.getDouble("ODR_QTY")));					//オーダ数
				htT_OD.put("TOTAL_ISSUE_QTY", Double.toString(rs.getDouble("TOTAL_ISSUE_QTY")));	//出庫累計数
				htT_OD.put("JOB_ODR_DETAIL_NO",	Double.toString(rs.getDouble("JOB_ODR_DETAIL_NO")));//製番枝番
			}

			rs.close();
			ps.close();

			// << 製番引当の検索 >>
			sql	= "	SELECT	SUM(T_JOB_ODR_ALC.ISSUEED_QTY) AS ISSUEED_QTY_SUM "
				+ "	FROM T_JOB_ODR_ALC "
				+ "	WHERE (((T_JOB_ODR_ALC.OD_NO)=?)) ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			rs = ps.executeQuery();
			if (rs.next())
			{
				dISSUEED_QTY_SUM = rs.getDouble("ISSUEED_QTY_SUM");
			}
			rs.close();
			ps.close();

			dRC	= dODR_QTY - dTOTAL_ISSUE_QTY -	dISSUEED_QTY_SUM;
			//iRC	= (new Double(dRC)).intValue();
			if (dRC	>= dInISSUENO)
			{
				dRC	= dInISSUENO;
			}
			//DEBUG
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("製番引当・出庫済み数合計・dISSUEED_QTY_SUM=["+dISSUEED_QTY_SUM+"]");
//20031104			_log.message("出庫要求数・dInISSUENO=["+dInISSUENO+"]");
//20031104			_log.message("出庫算出数・dRC=["+dRC+"]");
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return dRC;
	};

	//2.10.7.2 製番引当分出庫可能数（同一製番）の算出
	private	double	JDB0011(int	iInIndex, double dInISSUENO)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		ResultSet rsTmp=null;
		String sql="";
		double dALCD_QTY = 0;
		double dISSUEED_QTY	= 0;
		double dISSUEED_QTY_SUM	= 0;
		double dRC = 0;
		double dRC1 = 0;
		double dISSUENO = 0;
		double	dAllCount =	0;
		boolean	bRC=true;
		Hashtable htT =	new	Hashtable();
		String sJOB_ODR_CD = "";
		try
		{
			_log.methodStart();

			if (dInISSUENO <=0)
			{
				return 0;
			}
			dISSUENO = dInISSUENO;
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			// << 所要量の検索 >>
			sql	= "SELECT T_OD.OD_NO, T_OD.ODR_QTY, T_OD.TOTAL_ISSUE_QTY ,JOB_ODR_CD , JOB_ODR_DETAIL_NO, ITEM_CD "
				+ " FROM T_OD "
				+ " WHERE (((T_OD.OD_NO)=?)) ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			rs = ps.executeQuery();
			if (rs.next())
			{
				sJOB_ODR_CD=rs.getString("JOB_ODR_CD");
			}

			//DEBUG
//20031104			_log.message("所要量の検索");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("出庫指示・オーダデマンド番号・OD_NO=["+(String)htT.get("OD_NO")+"]");
//20031104			_log.message("所要量・製番・sJOB_ODR_CD=["+sJOB_ODR_CD+"]");

			rs.close();
			ps.close();

			// << 製番引当の検索 >>
			sql	= " SELECT T_JOB_ODR_ALC.JOB_ODR_CD,  T_JOB_ODR_ALC.JOB_ODR_DETAIL_NO, "
				+ "T_JOB_ODR_ALC.ITEM_CD, T_JOB_ODR_ALC.ALCD_QTY, T_JOB_ODR_ALC.ISSUEED_QTY "
				+ " FROM T_JOB_ODR_ALC "
				+ " WHERE ((T_JOB_ODR_ALC.OD_NO=?) "
				+ " AND (T_JOB_ODR_ALC.ALC_STOCK_TYP=2)  "
				+ " AND (T_JOB_ODR_ALC.JOB_ODR_CD=?) ) "
				+ " ORDER BY T_JOB_ODR_ALC.JOB_ODR_CD ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			ps.setString(2,	sJOB_ODR_CD);
			rs = ps.executeQuery();
			//DEBUG
//20031104			_log.message("製番引当の検索");
//20031104			_log.message("sql=["+sql+"]");
			while (rs.next())
			{
				if (rs.getString("JOB_ODR_CD") == null)
				{
					gsJOB_ODR_CD = "";
				}else{
					gsJOB_ODR_CD = rs.getString("JOB_ODR_CD");
				}

				dALCD_QTY =	rs.getDouble("ALCD_QTY");
				dISSUEED_QTY = rs.getDouble("ISSUEED_QTY");
				dRC	= dALCD_QTY	- dISSUEED_QTY;
//				iRC	= (new Double(dRC)).intValue();

				//DEBUG
//20031104				_log.message("所要量・共通変数「製番」・gsJOB_ODR_CD=["+gsJOB_ODR_CD+"]");
//20031104				_log.message("製番引当・引当済み数・dALCD_QTY=["+dALCD_QTY+"]");
//20031104				_log.message("製番引当・出庫済み数・dISSUEED_QTY=["+dISSUEED_QTY+"]");
//20031104				_log.message("dRC=["+dRC+"]");

				if (dRC	> 0)
				{
					if (dRC	>= dISSUENO)
					{
						dRC	= dISSUENO;
					}
					//DEBUG
//20031104					_log.message("出庫要求数・dISSUENO=["+dISSUENO+"]");
//20031104					_log.message("出庫可能数・dRC=["+dRC+"]");
					//製番引当分出庫可能数（同一製番）　＞　0　かつ、自動出庫残数　＞　0
					//品目別保管先優先順位の検索
//20031121			rsTmp =	JDB0007(iInIndex);
					//自動出庫数を全て出庫するまで
					//【製番品の払出保管区の順序】
//20031121			dRC1 = JDB0018(rsTmp, iInIndex, dRC);
					dRC1 = JDB0018(iInIndex, dRC);

					dISSUENO = dISSUENO	- dRC1;
					dAllCount =	dAllCount +	dRC1;
					//DEBUG
//20031104					_log.message("出庫要求残数・dISSUENO=["+dISSUENO+"]");
//20031104					_log.message("出庫数合計・dAllCount=["+dAllCount+"]");
					if (dISSUENO == 0)
					{
						break;
					}
				}
			}
			rs.close();
			ps.close();

			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (rsTmp != null)
			{
				rsTmp.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return dAllCount;
	};

	//2.10.7.2 製番引当分出庫可能数（他製番）の算出
	private	double	JDB0013(int	iInIndex, double dInISSUENO)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		ResultSet rsTmp=null;
		String sql="";
		double dALCD_QTY = 0;
		double dISSUEED_QTY	= 0;
		double dISSUEED_QTY_SUM	= 0;
		double dISSUENO = 0;
		double dRC = 0;
		double dRC1 = 0;
		double	dAllCount =	0;
		boolean	bRC=true;
		Hashtable htT =	new	Hashtable();
		String sJOB_ODR_CD = "";
		String sTmp = "";

		try
		{
			_log.methodStart();

			if (dInISSUENO <=0)
			{
				return 0;
			}
			dISSUENO = dInISSUENO;
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			// << 所要量の検索 >>
			sql	= "SELECT T_OD.OD_NO, T_OD.ODR_QTY, T_OD.TOTAL_ISSUE_QTY ,JOB_ODR_CD , JOB_ODR_DETAIL_NO, ITEM_CD "
				+ " FROM T_OD "
				+ " WHERE (((T_OD.OD_NO)=?)) ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			rs = ps.executeQuery();
			if (rs.next())
			{
				sJOB_ODR_CD=rs.getString("JOB_ODR_CD");
			}
			//DEBUG
//20031104			_log.message("所要量の検索");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("出庫指示・オーダデマンド番号・OD_NO=["+(String)htT.get("OD_NO")+"]");
//20031104			_log.message("所要量・製番・sJOB_ODR_CD=["+sJOB_ODR_CD+"]");

			rs.close();
			ps.close();

			// << 製番引当の検索 >>
			sql	= " SELECT T_JOB_ODR_ALC.JOB_ODR_CD,  T_JOB_ODR_ALC.JOB_ODR_DETAIL_NO, "
				+ "T_JOB_ODR_ALC.ITEM_CD, T_JOB_ODR_ALC.ALCD_QTY, T_JOB_ODR_ALC.ISSUEED_QTY "
				+ " FROM T_JOB_ODR_ALC "
				+ " WHERE ((T_JOB_ODR_ALC.OD_NO=?) "
				+ " AND (T_JOB_ODR_ALC.ALC_STOCK_TYP=2)  "
//				+ " AND (T_JOB_ODR_ALC.JOB_ODR_CD != ?)  "
				+ " ) ORDER BY T_JOB_ODR_ALC.JOB_ODR_CD ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
//			ps.setString(2,	sJOB_ODR_CD);
			rs = ps.executeQuery();
			//DEBUG
//20031104			_log.message("製番引当の検索");
//20031104			_log.message("sql=["+sql+"]");
			while (rs.next())
			{
				if (rs.getString("JOB_ODR_CD") == null)
				{
					sTmp = "";
				}else{
					sTmp = rs.getString("JOB_ODR_CD");
				}
				if (!sTmp.equals(sJOB_ODR_CD))
				{
					if (rs.getString("JOB_ODR_CD") == null)
					{
						gsJOB_ODR_CD = "";
					}else{
						gsJOB_ODR_CD = rs.getString("JOB_ODR_CD");
					}

					dALCD_QTY =	rs.getDouble("ALCD_QTY");
					dISSUEED_QTY = rs.getDouble("ISSUEED_QTY");
					dRC	= dALCD_QTY	- dISSUEED_QTY;
	//				iRC	= (new Double(dRC)).intValue() ;
					//DEBUG
//20031104					_log.message("所要量・共通変数「製番」・gsJOB_ODR_CD=["+gsJOB_ODR_CD+"]");
//20031104					_log.message("製番引当・引当済み数・dALCD_QTY=["+dALCD_QTY+"]");
//20031104					_log.message("製番引当・出庫済み数・dISSUEED_QTY=["+dISSUEED_QTY+"]");
//20031104					_log.message("dRC=["+dRC+"]");

					if (dRC	> 0)
					{
						if (dRC	>= dISSUENO)
						{
							dRC	= dISSUENO;
						}
						//DEBUG
//20031104						_log.message("出庫要求数・dISSUENO=["+dISSUENO+"]");
//20031104						_log.message("出庫可能数・dRC=["+dRC+"]");
						//製番引当分出庫可能数（同一製番）　＞　0　かつ、自動出庫残数　＞　0
						//品目別保管先優先順位の検索
//20031121				rsTmp =	JDB0007(iInIndex);
						//自動出庫数を全て出庫するまで
						//【製番品の払出保管区の順序】
//20031121				dRC1 = JDB0018(rsTmp, iInIndex, dRC);
						dRC1 = JDB0018(iInIndex, dRC);

						dISSUENO = dISSUENO	- dRC1;
						dAllCount =	dAllCount +	dRC1;
						//DEBUG
//20031104						_log.message("出庫要求残高数・dISSUENO=["+dISSUENO+"]");
//20031104						_log.message("出庫数合計・dAllCount=["+dAllCount+"]");
						if (dISSUENO == 0)
						{
							break;
						}
					}
				}
			}
			rs.close();
			ps.close();

//20031104			_log.message(sql);
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (rsTmp != null)
			{
				rsTmp.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return dAllCount;
	};

	//2.10.7.3 在庫引当分出庫可能数の算出
	private	double	JDB0014(int	iInIndex, double dInISSUENO)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		double dALCD_QTY = 0;
		double dISSUEED_QTY	= 0;
		double dISSUEED_QTY_SUM	= 0;
		double dISSUENO	= 0;
		double dRC = 0;
		double dRC1 = 0;
		boolean	bRC=true;
		double	dAllCount =	0;
		Hashtable htT =	new	Hashtable();
		try
		{
			_log.methodStart();
			if (dInISSUENO <=0)
			{
				return 0;
			}
			dISSUENO = dInISSUENO;
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			// << 製番引当の検索 >>
			sql	= " SELECT T_JOB_ODR_ALC.JOB_ODR_CD,  T_JOB_ODR_ALC.JOB_ODR_DETAIL_NO, "
				+ "T_JOB_ODR_ALC.ITEM_CD, T_JOB_ODR_ALC.ALCD_QTY, T_JOB_ODR_ALC.ISSUEED_QTY "
				+ " FROM T_JOB_ODR_ALC "
				+ " WHERE ((T_JOB_ODR_ALC.OD_NO=?) "
				+ " AND (T_JOB_ODR_ALC.ALC_STOCK_TYP=1))  "
				+ " ORDER BY T_JOB_ODR_ALC.JOB_ODR_CD ";
			ps = _conn.prepareStatement(sql);
			ps.setString(1,	(String)htT.get("OD_NO"));
			rs = ps.executeQuery();
			//DEBUG
//20031104			_log.message("製番引当の検索");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("出庫指示・オーダデマンド番号・OD_NO=["+(String)htT.get("OD_NO")+"]");
			while (rs.next())
			{
	//			  htRC.put("JOB_ODR_CD", rs.getString("JOB_ODR_CD"));
	//			  htRC.put("JOB_ODR_DETAIL_NO",	rs.getString("JOB_ODR_DETAIL_NO"));
	//			  htRC.put("ITEM_CD", rs.getString("ITEM_CD"));
				dALCD_QTY =	rs.getDouble("ALCD_QTY");
				dISSUEED_QTY = rs.getDouble("ISSUEED_QTY");
				dRC	= dALCD_QTY	- dISSUEED_QTY;
//				iRC	= (new Double(dRC)).intValue() ;
				//DEBUG
//20031104				_log.message("製番引当・引当済み数・dALCD_QTY=["+dALCD_QTY+"]");
//20031104				_log.message("製番引当・出庫済み数・dISSUEED_QTY=["+dISSUEED_QTY+"]");
//20031104				_log.message("dRC=["+dRC+"]");

				if (dRC	> 0)
				{
					if (dRC	>= dISSUENO)
					{
						dRC	= dISSUENO;
					}
					//DEBUG
//20031104					_log.message("出庫要求数・dISSUENO=["+dISSUENO+"]");
//20031104					_log.message("出庫可能数・dRC=["+dRC+"]");
					//品目別保管先優先順位の検索
//20031121			rs = JDB0007(iInIndex);
					//自動出庫数を全て出庫するまで
					//【ＭＲＰ品の払出保管区の順序】
//20031121			dRC1 = JDB0008(rs, iInIndex, dRC, 3);
					dRC1 = JDB0008(iInIndex, dRC, 3);

					dISSUENO = dISSUENO	- dRC1;
					dAllCount =	dAllCount +	dRC1;
					//DEBUG
//20031104					_log.message("出庫要求残高数・dISSUENO=["+dISSUENO+"]");
//20031104					_log.message("出庫数合計・dAllCount=["+dAllCount+"]");
					if (dISSUENO == 0)
					{
						break;
					}
				}
			}
			rs.close();
			ps.close();
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return dAllCount;
	};

	//2.10.7.4 品目在庫出庫可能数の算出
	private	double	JDB0015(int	iInIndex, double dInISSUENO)
			throws SQLException,Exception{
//20031121追加
		PreparedStatement psREAD=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		String sJOB_ODR_ALC_CD="";
		String strOdrCd="";
		double dALCD_QTY = 0;
		double dTOTAL_ISSUE_QTY	= 0;
		double dISSUEED_QTY_SUM	= 0;
		double dRC = 0;
		int iRC = 0;
		double	dISSUENO = 0;
		boolean	bRC=true;
		int	iIndex=0;
		Hashtable htT =	new	Hashtable();
		try
		{
			_log.methodStart();

			if (dInISSUENO <=0 )
			{
				return 0;
			}
			dISSUENO = dInISSUENO;
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);

			// << 製番引当の検索 >>
			sql	= " SELECT T_JOB_ODR_ALC.JOB_ODR_CD,  T_JOB_ODR_ALC.JOB_ODR_ALC_CD, T_JOB_ODR_ALC.JOB_ODR_DETAIL_NO, "
				+ "T_JOB_ODR_ALC.ITEM_CD, T_JOB_ODR_ALC.ALCD_QTY, T_JOB_ODR_ALC.ISSUEED_QTY "
				+ " FROM T_JOB_ODR_ALC "
				+ " WHERE ((T_JOB_ODR_ALC.OD_NO=?) "
				+ " AND (T_JOB_ODR_ALC.ITEM_CD=?)  "
//20031012修正：検索条件２→１				+ " AND (T_JOB_ODR_ALC.ALC_STOCK_TYP=2))  "
				+ " AND (T_JOB_ODR_ALC.ALC_STOCK_TYP=1))  "
				+ " ORDER BY T_JOB_ODR_ALC.JOB_ODR_CD ";
//20031121修正開始
			psREAD = _conn.prepareStatement(sql);
			psREAD.setString(1,	(String)htT.get("OD_NO"));
			psREAD.setString(2,	(String)htT.get("ITEM_CD"));
			rs = psREAD.executeQuery();
//			ps = _conn.prepareStatement(sql);
//			ps.setString(1,	(String)htT.get("OD_NO"));
//			ps.setString(2,	(String)htT.get("ITEM_CD"));
//			rs = ps.executeQuery();
//20031121修正終了
			//DEBUG
//20031104			_log.message("製番引当の検索");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("出庫指示・オーダデマンド番号・OD_NO=["+(String)htT.get("OD_NO")+"]");
//20031104			_log.message("出庫指示・品目番号・ITEM_CD=["+(String)htT.get("ITEM_CD")+"]");
//20031104			_log.message("出庫指示・工場コード・PLANT_CD=["+(String)htT.get("PLANT_CD")+"]");
			if (rs.next())
			{
				sJOB_ODR_ALC_CD	= rs.getString("JOB_ODR_ALC_CD");	//????????????
				dALCD_QTY =	rs.getDouble("ALCD_QTY");
				//Update
				sql	= "	UPDATE T_JOB_ODR_ALC SET "
					+ "	ALCD_QTY = ? "
					+ "	WHERE JOB_ODR_ALC_CD = ? ";
				ps = _conn.prepareStatement(sql);
				ps.setDouble(1,	dALCD_QTY +	dISSUENO);
				ps.setString(2,	sJOB_ODR_ALC_CD);
				iRC	= ps.executeUpdate();
				//DEBUG
//20031104				_log.message("製番引当の更新");
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("製番引当・引当済み数・dALCD_QTY +iInISSUENO=["+(dALCD_QTY +dISSUENO)+"]");
//20031104				_log.message("製番引当管理番号・sJOB_ODR_ALC_CD=["+sJOB_ODR_ALC_CD+"]");

			} else {
//				//製番計画の採番 --20031012修正　製番の採番ではなく製番計画の採番　※後で製番計画の採番に変更する
//				CollectNumber ODR_CD = new CollectNumber(CollectNumber.JOB_OD_CD ,
//					_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);

				//製番計画の採番 --20031017修正　製番の採番ではなく製番計画の採番
				CollectNumber ODR_CD = new CollectNumber(CollectNumber.JOB_OD_ALC_CD ,
					_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);

				strOdrCd = ODR_CD.getNo();
				//Insert
				sql	= " INSERT INTO  T_JOB_ODR_ALC ( "
					+" JOB_ODR_ALC_CD, "
					+" OD_NO, "
					+" PLANT_CD, "
					+" ITEM_CD, "
					+" ALC_STOCK_TYP, "
					+" JOB_ODR_CD, "
					+" JOB_ODR_DETAIL_NO, "
					+" ALCD_QTY, "
					+" ISSUEED_QTY, "
					+" ISSUE_CMPLT_FLG, "
//					+" CREATED_DATE, "
					+" CREATED_BY, "
					+" CREATED_PRG_NM, "
//					+" UPDATED_DATE, "
					+" UPDATED_BY, "
					+" UPDATED_PRG_NM, "
					+" MODIFY_COUNT "
					+" ) "
					+" values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
				iIndex = 1;
				ps = _conn.prepareStatement(sql);
				ps.setString(iIndex++, strOdrCd);				// 製番引当管理番号
				ps.setString(iIndex++, (String)htT.get("OD_NO"));		// オーダデマンド番号
				ps.setString(iIndex++, (String)htT.get("PLANT_CD"));		// 工場コード
				ps.setString(iIndex++, (String)htT.get("ITEM_CD"));		// 品目番号
//20031012修正：登録値２→１				ps.setDouble(iIndex++, 2);					// 引当在庫区分
				ps.setDouble(iIndex++, 1);					// 引当在庫区分
				ps.setNull(iIndex++, Types.VARCHAR);				// 製番
				ps.setDouble(iIndex++, 0 );					// 製番枝番
				ps.setDouble(iIndex++, dISSUENO);				// 引当済み数
				ps.setDouble(iIndex++, 0);					// 出庫済み数
	//			ps.setString(iIndex++, "Off");					// 出庫完了フラグ?????
				ps.setDouble(iIndex++, 0);					// 出庫完了フラグ?????
				ps.setString(iIndex++, _userInfo.getUserId());			// 
				ps.setString(iIndex++, _userInfo.getBusinessName());			// 
				ps.setString(iIndex++, _userInfo.getUserId());			// 
				ps.setString(iIndex++, _userInfo.getBusinessName());			// 
				ps.setDouble(iIndex++, 0);									// 
//20031104				_log.message("製番引当の登録");
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("製番引当の管理番号=["+strOdrCd+"]");
				iRC	= ps.executeUpdate();
				//DEBUG
			}

			rs.close();
			ps.close();
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
//20031121修正開始
			if (psREAD != null)
			{
				psREAD.close();
			}
//20031121修正終了
		}
		return dISSUENO;
	};

	//[有償支給履歴]への追加
	private	void JDB0016(int iInIndex,int iTyp)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		int	iIndex =0;
		int	iRC	= 0;
		String strOdrCd="";
		Hashtable htTmp	= new Hashtable();
		Hashtable htT =	new	Hashtable();
		java.util.Date dtDate = null;
		try
		{
			_log.methodStart();
			//出庫指示情報を取得
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);
			//[支給単価]を検索
			htTmp =	JDB0017(iInIndex);
			
			if (htTmp.size() == 0)
			{
				return;
			}
			_log.message("(SBM0905)有償支給番号の採番");
			//有償支給番号の採番
			CollectNumber ODR_CD = new CollectNumber(CollectNumber.ONERCONS_CD	,
				_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
			strOdrCd = ODR_CD.getNo();
			//Insert
			sql	= " INSERT INTO  T_PAST_ONEROUS_CONS ( "
				+" ONEROUS_CONS_NO	,"				//有償支給番号
				+" COMPANY_CD ,"					//会社コード
				+" VEND_CD ,"						//取引先コード
				+" PLANT_CD ,"						//工場コード
				+" JOB_ODR_CD ,"					//製番
				+" JOB_ODR_DETAIL_NO ,"					//製番枝番
				+" ITEM_CD ,"						//品目番号
				+" ISSUE_DATE ,"					//出庫日
				+" ISSUE_QTY ,"						//出庫数
				+" UNIT_COST ,"						//単価
				+" UNIT_COST_TYP ,"					//単価区分
				+" ONEROUS_CONS_COMMENT ,"				//有償支給備考
				+" VEND_LOT_NO ,"					//メーカロット番号
				+" RCV_ISSUE_CTRL_CD ,"					//入出庫管理番号
				+" WORK_ODR_CD ,"					//作業計画番号
				+" WORK_IN_PROC_CD ,"					//仕掛作業コード
				+" PUCH_ODR_CD ,"					//発注番号
//				+" CREATED_DATE ,"					//作成日
				+" CREATED_BY ,"					//作成者
				+" CREATED_PRG_NM ,"					//作成プログラム名
//				+" UPDATED_DATE ,"					//更新日
				+" UPDATED_BY ,"					//更新者
				+" UPDATED_PRG_NM ,"					//更新プログラム名
				+" MODIFY_COUNT )"						//更新数
				+" values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
				+" ?, ?, ?,	?,? ) ";

			iIndex = 1;
			ps = _conn.prepareStatement(sql);
			ps.setString(iIndex++, strOdrCd);										//有償支給番号
			ps.setString(iIndex++, (String)htT.get("COMPANY_CD"));					//会社コード
			ps.setString(iIndex++, (String)htT.get("VEND_CD"));						//取引先コード
			ps.setString(iIndex++, (String)htT.get("PLANT_CD"));					//工場コード
			if (iTyp == 1)
			{
				ps.setNull(iIndex++, Types.VARCHAR);								//製番
				ps.setDouble(iIndex++, 0);											//製番枝番
			}else if (iTyp == 2)
			{
				ps.setString(iIndex++, (String)htT_RCV_ISSUE.get("JOB_ODR_CD"));				//製番	09-24-13-35?
				ps.setDouble(iIndex++, Double.parseDouble((String)htT_RCV_ISSUE.get("JOB_ODR_DETAIL_NO")));	//製番枝番09-24-13-35?
			}
			ps.setString(iIndex++, (String)htT.get("ITEM_CD"));						//品目番号

			dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
			ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));						//  入出庫年月日????????
//			ps.setDate(iIndex++,
//				(java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));	//出庫日
			ps.setDouble(iIndex++, Double.parseDouble((String)htT_RCV_ISSUE.get("RCV_ISSUE_QTY")) *	-1);	//出庫数
			if (((String)htTmp.get("COMPANY_CD")).equals(""))									//単価
			{
				ps.setDouble(iIndex++, 0);
			} else {
				if (((String)htTmp.get("EFF_PHASE_IN_DATE")).compareTo(ginRCV_ISSUE_DATE) <= 0)		//???????????
				{
					if (htTmp.get("ONEROUS_FLG").equals("1"))
					{
						ps.setDouble(iIndex++, Double.parseDouble(((String)htTmp.get("UNIT_COST"))));
					} else if (htTmp.get("ONEROUS_FLG").equals("0"))
					{
						ps.setDouble(iIndex++, 0);
					}
				} else {
					ps.setDouble(iIndex++, 0);
				}
			}
			if (htTmp.get("COMPANY_CD").equals(""))									//単価区分
			{
				ps.setDouble(iIndex++, 0);
			} else {
				ps.setDouble(iIndex++, Double.parseDouble((String)htTmp.get("UNIT_COST_TYP")));
			}
			ps.setNull(iIndex++, Types.VARCHAR);									//有償支給備考
			ps.setNull(iIndex++, Types.VARCHAR);									//メーカロット番号
			ps.setString(iIndex++, (String)htT_RCV_ISSUE.get("RCV_ISSUE_CTRL_CD"));	//入出庫管理番号
			ps.setNull(iIndex++, Types.VARCHAR);									//作業計画番号
			ps.setNull(iIndex++, Types.VARCHAR);									//仕掛作業コード
			ps.setString(iIndex++, (String)htT.get("PUCH_ODR_CD"));					//発注番号
			ps.setString(iIndex++, _userInfo.getUserId());					//
			ps.setString(iIndex++, _userInfo.getBusinessName());					//
			ps.setString(iIndex++, _userInfo.getUserId());					//
			ps.setString(iIndex++, _userInfo.getBusinessName());					//
			ps.setDouble(iIndex++, 0);
			iRC	= ps.executeUpdate();

			//DEBUG
//20031104			_log.message("有償支給履歴の登録");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("有償支給履歴の管理番号=["+strOdrCd+"]");
//20031104			_log.message("有償支給履歴の登録件数=["+iRC+"]");
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return ;
	}

	//[支給単価]を検索
	private	Hashtable JDB0017(int iIndex)
			throws SQLException,Exception{
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";

		//検索条件を取得
		Hashtable htRC = new Hashtable();
		Hashtable htT =	new	Hashtable();
		String sCOMPANY_CD = "";
		String sVEND_CD	= "";
		String sITEM_CD	= "";
		try
		{
			_log.methodStart();

			htT	= (Hashtable)alT_ISSUE_INST.get(iIndex-1);
			sCOMPANY_CD	= (String)htT.get("COMPANY_CD");
			sVEND_CD = (String)htT.get("VEND_CD");
			sITEM_CD = (String)htT.get("ITEM_CD");
			//返却値を初期化する。
			htRC.put("COMPANY_CD","");
			htRC.put("VEND_CD","");
			htRC.put("PLANT_CD","");
			htRC.put("ITEM_CD","");
			htRC.put("EFF_PHASE_IN_DATE","");
			htRC.put("UNIT_COST","");
			htRC.put("UNIT_COST_TYP","");
			htRC.put("ONEROUS_FLG","");
			//[支給単価]を検索
			sql	= "SELECT M_CONS_UNIT_COST.COMPANY_CD, M_CONS_UNIT_COST.VEND_CD, M_CONS_UNIT_COST.PLANT_CD, "
				+ " M_CONS_UNIT_COST.ITEM_CD, M_CONS_UNIT_COST.UNIT_COST, M_CONS_UNIT_COST.UNIT_COST_TYP, "
				+ " M_CONS_UNIT_COST.EFF_PHASE_IN_DATE , M_CONS_UNIT_COST.ONEROUS_FLG"
				+ " FROM M_CONS_UNIT_COST "
				+ " WHERE ((M_CONS_UNIT_COST.COMPANY_CD=?) AND (M_CONS_UNIT_COST.VEND_CD=?) "
				+ " AND (M_CONS_UNIT_COST.ITEM_CD=?)) ";

			ps = _conn.prepareStatement(sql);
			ps.setString(1,	sCOMPANY_CD);
			ps.setString(2,	sVEND_CD);
			ps.setString(3,	sITEM_CD);
			rs = ps.executeQuery();

			//DEBUG
//20031104			_log.message("支給単価の検索");
//20031104			_log.message("sql=["+sql+"]");
//20031104			_log.message("出庫指示・会社コード・sCOMPANY_CD=["+sCOMPANY_CD+"]");
//20031104			_log.message("出庫指示・取引先コード・sVEND_CD=["+sVEND_CD+"]");
//20031104			_log.message("出庫指示・出庫品目番号・sITEM_CD=["+sITEM_CD+"]");

			if (rs.next())
			{
				if (rs.getString("COMPANY_CD") == null)
				{
					htRC.put("COMPANY_CD","");
				}else{
					htRC.put("COMPANY_CD",rs.getString("COMPANY_CD"));					//会社コード
				}
				if (rs.getString("VEND_CD") == null)
				{
					htRC.put("VEND_CD","");
				}else{
					htRC.put("VEND_CD",rs.getString("VEND_CD"));						//取引先コード
				}
				if (rs.getString("PLANT_CD") == null)
				{
					htRC.put("PLANT_CD","");
				}else{
					htRC.put("PLANT_CD",rs.getString("PLANT_CD"));						//工場コード
				}
				if (rs.getString("ITEM_CD") == null)
				{
					htRC.put("ITEM_CD","");
				}else{
					htRC.put("ITEM_CD",rs.getString("ITEM_CD"));						//品目番号
				}
				if (rs.getDate("EFF_PHASE_IN_DATE") == null)
				{
					htRC.put("EFF_PHASE_IN_DATE","");
				}else{
					htRC.put("EFF_PHASE_IN_DATE",
						Converter.dateToStr(
							rs.getDate("EFF_PHASE_IN_DATE"),
							Converter.SLASH_DATE));							//支給単価有効開始日
				}
				if (rs.getString("UNIT_COST") == null)
				{
					htRC.put("UNIT_COST","");
				}else{
					htRC.put("UNIT_COST",rs.getString("UNIT_COST"));					//単価
				}
				if (rs.getString("UNIT_COST_TYP") == null)
				{
					htRC.put("UNIT_COST_TYP","");
				}else{
					htRC.put("UNIT_COST_TYP",rs.getString("UNIT_COST_TYP"));			//単価区分
				}
				if (rs.getString("ONEROUS_FLG") == null)
				{
					htRC.put("ONEROUS_FLG","");
				}else{
					htRC.put("ONEROUS_FLG",rs.getString("ONEROUS_FLG"));				//有償フラグ
				}
				//DEBUG
//20031104				_log.message("支給単価有効開始日=["+Converter.dateToStr(rs.getDate("EFF_PHASE_IN_DATE"),Converter.SLASH_DATE)+"]");
//20031104				_log.message("単価=["+rs.getString("UNIT_COST")+"]");
//20031104				_log.message("単価区分=["+rs.getString("UNIT_COST_TYP")+"]");
//20031104				_log.message("有償フラグ=["+rs.getString("ONEROUS_FLG")+"]");
			}
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			if (rs != null)
			{
				rs.close();
			}
			if (ps != null)
			{
				ps.close();
			}
		}
		return htRC;
	}

	//【製番品の払出保管区の順序】
//20031121修正開始
//	private	double	JDB0018(ResultSet rsIN, int iInIndex,	double	dInISSUENO)
//			throws SQLException,Exception{
	private	double	JDB0018(int iInIndex,	double	dInISSUENO)
			throws SQLException,Exception{
		ResultSet rsIN=null;
		PreparedStatement psIN=null;
		PreparedStatement psREAD=null;
//20031121修正終了
		CollectNumber ODR_CD=null;
		String strOdrCd="";
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="";
		int	iCount =0;
		int	iIndex =1;
		double	dIssueNO =0;
		double	dIssueNOOld	=0;
		double dIssueCountTemp=0;
		java.util.Date dtDate = null;
		Hashtable htT =	new	Hashtable();
		String sITEM_CD_MIN	= "";				//「品目別保管先優先順位」が最小の保管区の品目番号
		String sWH_CD_MIN =	"";				//「品目別保管先優先順位」が最小の保管区の保管区コード
		String sPLANT_CD_MIN = "";				//「品目別保管先優先順位」が最小の保管区の工場コード
		String sWH_PRIORITY_REF_NO_MIN = "";			//「品目別保管先優先順位」が最小の保管区
		String sJOB_ODR_CD_MIN = "";				//「品目別保管先優先順位」が最小の保管区
		String sJOB_ODR_DETAIL_NO_MIN = "0";			//「品目別保管先優先順位」が最小の保管区

		String sITEM_CD="";
		String sWH_CD="";
		String sPLANT_CD="";
		String sWH_PRIORITY_REF_NO="";
		String sPlantWH_CD = "";
		double dISSUECOUNT = 0;

		int WH_PRIORITY_FLG = 0;				//品目別保管先優先順位フラグ：データがない場合０　20031012追記

		try
		{
			_log.methodStart();
			//自動出庫数を取得
			htT	= (Hashtable)alT_ISSUE_INST.get(iInIndex-1);

//20031121修正開始
			// << 品目別保管先優先順位の検索 >>
			sql= "SELECT M_WH_PRIORITY.ITEM_CD, M_WH_PRIORITY.WH_CD, M_WH_PRIORITY.PLANT_CD, "
			+" M_WH_PRIORITY.WH_PRIORITY_REF_NO "
			+" FROM M_WH_PRIORITY "
			+" WHERE ((M_WH_PRIORITY.ITEM_CD=?) AND (M_WH_PRIORITY.PLANT_CD=?)) "
			+" ORDER BY WH_PRIORITY_REF_NO ";
			psIN = _conn.prepareStatement(sql);
			psIN.setString(1,	(String)htT.get("ITEM_CD"));
			psIN.setString(2,	(String)htT.get("PLANT_CD"));
			rsIN = psIN.executeQuery();
//20031121修正終了

			dIssueNO = dInISSUENO;
			dIssueNOOld	= dIssueNO;

			//DEBUG
//20031104			_log.message("有償支給履歴登録条件");
//20031104			_log.message("出庫指示・発注番号・PUCH_ODR_CD=["+(String)htT.get("PUCH_ODR_CD")+"]");
//20031104			_log.message("出庫指示・作業計画番号・WORK_ODR_CD=["+(String)htT.get("WORK_ODR_CD")+"]");
//20031104			_log.message("出庫指示・支給区分・CONS_TYP=["+(String)htT.get("CONS_TYP")+"]");
			while (rsIN.next())
			{

				WH_PRIORITY_FLG = 1;

				sITEM_CD=rsIN.getString("ITEM_CD");
				sWH_CD=rsIN.getString("WH_CD");
				sPLANT_CD=rsIN.getString("PLANT_CD");
				sWH_PRIORITY_REF_NO=rsIN.getString("WH_PRIORITY_REF_NO");
				//DEBUG
//20031104				_log.message("iCount=["+iCount+"]");
//20031104				_log.message("品目別保管先優先順位・品目番号・sITEM_CD=["+sITEM_CD+"]");
//20031104				_log.message("品目別保管先優先順位・保管区コード・sWH_CD=["+sWH_CD+"]");
//20031104				_log.message("品目別保管先優先順位・工場コード・sPLANT_CD=["+sPLANT_CD+"]");
//20031104				_log.message("品目別保管先優先順位・品目別保管先優先順位・sWH_PRIORITY_REF_NO=["+sWH_PRIORITY_REF_NO+"]");
//20031104				_log.message("所要量・共通変数「製番」・gsJOB_ODR_CD=["+gsJOB_ODR_CD+"]");

				//20031011移動※１
				if (sWH_CD_MIN.equals(""))
				{
					sITEM_CD_MIN=sITEM_CD;
					sWH_CD_MIN=sWH_CD;
					sPLANT_CD_MIN=sPLANT_CD;
					sWH_PRIORITY_REF_NO_MIN=sWH_PRIORITY_REF_NO;
					sJOB_ODR_CD_MIN=gsJOB_ODR_CD;   //20031011修正　(旧)rs.getString("JOB_ODR_CD");
					sJOB_ODR_DETAIL_NO_MIN="0";       //20031011修正　(旧)Double.toString(rs.getDouble("JOB_ODR_DETAIL_NO"));
					//DEBUG
//20031104					_log.message("iCount=["+iCount+"]");
//20031104					_log.message("保管区別製番在庫（最小順）・品目番号・sITEM_CD=["+sITEM_CD+"]");
//20031104					_log.message("保管区別製番在庫（最小順）・保管区コード・sWH_CD=["+sWH_CD+"]");
//20031104					_log.message("保管区別製番在庫（最小順）・工場コード・sPLANT_CD=["+sPLANT_CD+"]");
//20031104					_log.message("保管区別製番在庫（最小順）・製番・sJOB_ODR_CD_MIN=["+sJOB_ODR_CD_MIN+"]");
//20031104					_log.message("保管区別製番在庫（最小順）・製番枝sJOB_ODR_DETAIL_NO_MIN=["+sJOB_ODR_DETAIL_NO_MIN+"]");
				}

				// << 保管区別製番在庫の検索 >>
				sql	= "SELECT T_JOB_ODR_CD_STOCK.JOB_ODR_CD, T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
					+ " T_JOB_ODR_CD_STOCK.ITEM_CD, T_JOB_ODR_CD_STOCK.WH_CD, T_JOB_ODR_CD_STOCK.PLANT_CD, "
					+ " T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY, T_JOB_ODR_CD_STOCK.PRVS_DAYEND_STOCK_QTY,  "
					+ " T_JOB_ODR_CD_STOCK.PRVS_MONTHEND_STOCK_QTY, T_JOB_ODR_CD_STOCK.PRVS_TERMEND_STOCK_QTY "
					+ " FROM T_JOB_ODR_CD_STOCK,M_WH "
					+ " WHERE ((T_JOB_ODR_CD_STOCK.ITEM_CD=?) AND (T_JOB_ODR_CD_STOCK.WH_CD=?) "
					+ " AND (T_JOB_ODR_CD_STOCK.PLANT_CD=?) AND (T_JOB_ODR_CD_STOCK.JOB_ODR_CD=?)  "
					+ " AND (T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY>0) "
					+" AND (T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD) "
					+" AND (M_WH.MRP_FLG = 1)) ";

//20031121修正開始
				psREAD = _conn.prepareStatement(sql);
				psREAD.setString(1,	(String)htT.get("ITEM_CD"));
				psREAD.setString(2,	sWH_CD);
				psREAD.setString(3,	(String)htT.get("PLANT_CD"));
				psREAD.setString(4,	gsJOB_ODR_CD);				//前処理に取得した製番？？？
				rs = psREAD.executeQuery();
//				ps = _conn.prepareStatement(sql);
//				ps.setString(1,	(String)htT.get("ITEM_CD"));
//				ps.setString(2,	sWH_CD);
//				ps.setString(3,	(String)htT.get("PLANT_CD"));
//				ps.setString(4,	gsJOB_ODR_CD);				//前処理に取得した製番？？？
//
//				//DEBUG
////20031104				_log.message("sql=["+sql+"]");
//				rs = ps.executeQuery();
//20031121修正終了

				if (rs.next())
				{

					//20031011移動※１

					//入出庫番号の採番
					ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,
						_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
					strOdrCd = ODR_CD.getNo();

					// << 保管区別入出庫の登録 >>
					sql	= "insert into "
						+"	T_RCV_ISSUE( "
						+" RCV_ISSUE_CTRL_CD,"			//	入出庫管理番号
						+	"RCV_ISSUE_TYP,"		//	入出庫区分
						+	"ITEM_CD,"			//	品目番号
						+	"PLANT_CD,"			//	工場コード
						+	"WH_CD,"			//	保管区コード
						+	"JOB_ODR_CD,"			//	製番
						+	"JOB_ODR_DETAIL_NO,"		//	製番枝番
						+	"PUCH_ODR_CD,"			//	発注番号
						+	"ACPT_NO,"			//	受入回数
						+	"ACPT_RSLT_CRCT_NO,"		//	受入実績訂正回数
						+	"INSPEC_RSLT_CRCT_NO,"		//	検査実績訂正回数
						+	"WORK_ODR_CD,"			//	作業計画番号
						+	"WORK_IN_PROC_CD,"		//	仕掛作業コード
						+	"PARTIAL_PRD_NO,"		//	分作回数
						+	"OPR_RSLT_CRCT_NO,"		//	作業実績訂正回数
						+	"ISSUE_INST_CD,"		//	出庫指示番号
						+	"RCV_ISSUE_QTY,"		//	入出庫数
						+	"RCV_ISSUE_AMOUNT,"		//	入出庫金額
						+	"RCV_ISSUE_DATE,"		//	入出庫年月日
						+	"RCV_ISSUE_GNR_TYP,"		//	入出庫発生区分
						+	"RCV_ISSUE_ODD_QTY,"		//	入出庫端数
						+	"DEFECT_CAUSE_CD,"		//	入出庫不良理由コード
						+	"STOCK_UPD_TYP,"		//	在庫更新区分
						+	"RCV_ISSUE_CMPLT_FLG,"		//	入出庫完了フラグ
						+	"OD_NO,"			//	オーダデマンド番号
						+	"VEND_LOT_NO,"			//	メーカロット番号
						+	"RCV_ISSUE_COMMENT,"		//	入出庫備考
						+	"COMPANY_CD,"			//	会社コード
						+	"VEND_CD,"			//	取引先コード
						+	"CONS_TYP,"			//	支給区分
						+	"CONS_EXEC_DATE,"		//	有償支給実績抽出日
//						+	"CREATED_DATE,"			//	作成日
						+	"CREATED_BY,"			//	作成者
						+	"CREATED_PRG_NM,"		//	作成プログラム名
//						+	"UPDATED_DATE,"			//	更新日
						+	"UPDATED_BY,"			//	更新者
						+	"UPDATED_PRG_NM,"		//	更新プログラム名
						+	"MODIFY_COUNT) "		//	更新数
					+ "values ("
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//						+ "?, ?, ?, ?, ?, sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
						+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					ps = _conn.prepareStatement(sql);

					ps.setString(iIndex++, strOdrCd);								//	入出庫管理番号
					ps.setDouble(iIndex++, 2);									//	入出庫区分
					ps.setString(iIndex++, rs.getString("ITEM_CD"));						//	品目番号
					ps.setString(iIndex++, (String)htT.get("PLANT_CD"));						//	工場コード
					ps.setString(iIndex++, rs.getString("WH_CD"));							//	保管区コード
					ps.setString(iIndex++, rs.getString("JOB_ODR_CD"));						//	製番	09-24-13-30?
					ps.setDouble(iIndex++, rs.getDouble("JOB_ODR_DETAIL_NO"));					//	 製番枝番09-24-13-30?
					ps.setString(iIndex++, ginPUCH_ODR_CD);								//	発注番号
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));						//	受入回数
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	受入訂正回数
					ps.setDouble(iIndex++, 0);									//	検査実績訂正回数
					ps.setString(iIndex++, ginWORK_ODR_CD);								//	作業計画番号
					ps.setString(iIndex++, ginWORK_IN_PROC_CD);							//	作業コード
					ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	分作回数
					ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	作業実績訂正回数
					ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));					//	出庫指示番号
					dIssueCountTemp	= rs.getDouble("STOCK_ON_HAND_QTY");
//					dIssueCountTemp	= (new Double(dIssueCountTemp)).intValue();
					if (dIssueCountTemp	>= dIssueNO)
					{
						dIssueCountTemp	= dIssueNO;
//						dIssueNO = 0;
//					} else {
//						dIssueNO = dIssueNO	- dIssueCountTemp;
					}
					ps.setDouble(iIndex++, dIssueCountTemp * -1);							//	入出庫数
					ps.setDouble(iIndex++, 0);									//	入出庫金額
					dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
					ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));						//  入出庫年月日????????
//					ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));	//  入出庫年月日???????????
					ps.setDouble(iIndex++, 21);														//	入出庫発生区分
					ps.setDouble(iIndex++, 0);														//	入出庫端数
					ps.setNull(iIndex++, Types.VARCHAR);											//	入出庫不良理由コード	OK?
					ps.setDouble(iIndex++, 1);														//	在庫更新区分
					ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	入出庫完了フラグ
					ps.setString(iIndex++, (String)htT.get("OD_NO"));								//  オーダデマンド番号
					//-----------------------------------------------------------------
					ps.setString(iIndex++, "");														//	メーカロット番号
					ps.setString(iIndex++, "");														//	入出庫備考
					ps.setString(iIndex++, "");														//	会社コード
					ps.setString(iIndex++, "");														//	取引先コード
					ps.setDouble(iIndex++, 0);														//  支給区分
					ps.setNull(iIndex++, Types.DATE);												//  有償支給実績抽出日
		//			ps.setDate(iIndex++, "");		//	作成日
					ps.setString(iIndex++, _userInfo.getUserId());		//	作成者
					ps.setString(iIndex++, _userInfo.getBusinessName());		//	作成プログラム名
		//			ps.setString(iIndex++, "");		//	更新日
					ps.setString(iIndex++, _userInfo.getUserId());		//	更新者
					ps.setString(iIndex++, _userInfo.getBusinessName());		//	更新プログラム名
					ps.setDouble(iIndex++, 0);		//	更新数

					iIndex=ps.executeUpdate();
					ps.close();
					if (iIndex > 0)
					{
						iCount++;
						dISSUECOUNT = dISSUECOUNT + dIssueCountTemp;
						dIssueNO = dIssueNO	- dIssueCountTemp;
					}
					//DEBUG
//20031104					_log.message("保管区別入出庫の登録番号01=["+strOdrCd+"]");
//20031104					_log.message("保管区別入出庫の登録件数01=["+iIndex+"]");

					//出庫処理を呼び出し
					_log.message("(SBM1199)出庫処理を呼び出し......");
					_IssueProcess = new IssueProcess(_iconn, strOdrCd);
					_IssueProcess.execProcess();

					if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
						(((String)htT.get("WORK_ODR_CD")).equals("")) &&
						(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
					{
						//DEBUG
//20031104						_log.message("有償支給履歴登録");
						// 登録した保管区別入出庫を保存
						if (rs.getString("ITEM_CD") == null)
						{
							htT_RCV_ISSUE.put("ITEM_CD","");
						}else{
							htT_RCV_ISSUE.put("ITEM_CD",rs.getString("ITEM_CD"));					//	品目番号
						}
						if (rs.getString("WH_CD") == null)
						{
							htT_RCV_ISSUE.put("WH_CD","");
						}else{
							htT_RCV_ISSUE.put("WH_CD",rs.getString("WH_CD"));					//	保管区コード
						}
						if (ginPUCH_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("PUCH_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);					//	発注番号
						}
						if (ginACPT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);						//	受入回数
						}
						if (ginACPT_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);				//	受入実績訂正回数
						}
						if (ginWORK_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);					//	作業計画番号
						}
						if (ginWORK_IN_PROC_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);				//	仕掛作業コード
						}
						if (ginPARTIAL_PRD_NO == null)
						{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
						}else{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);					//	分作回数
						}
						if (ginOPR_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);				//	作業実績訂正回数
						}
						if (ginRCV_ISSUE_DATE == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);					//	入出庫年月日
						}
						if (ginRCV_ISSUE_CMPLT_FLG == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);			//	入出庫完了フラグ
						}
						htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);						//	入出庫管理番号
						htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");								//	入出庫区分
						htT_RCV_ISSUE.put("PLANT_CD",htT.get("PLANT_CD"));						//	工場コード
						if (rs.getString("JOB_ODR_CD") == null)
						{
							htT_RCV_ISSUE.put("JOB_ODR_CD","");							//	製番
						}else{
							htT_RCV_ISSUE.put("JOB_ODR_CD",rs.getString("JOB_ODR_CD"));				//	製番
						}
						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO",Double.toString(rs.getDouble("JOB_ODR_DETAIL_NO")));	//	製番枝番
						htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");							//	検査実績訂正回数
						htT_RCV_ISSUE.put("ISSUE_INST_CD",htT.get("ISSUE_INST_CD"));					//	出庫指示番号
						htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueCountTemp *	-1));			//	入出庫数
						htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");							//	入出庫金額
						htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");							//	入出庫発生区分
						htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");							//	入出庫端数
						htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");							//	入出庫不良理由コード
						htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");								//	在庫更新区分
						htT_RCV_ISSUE.put("OD_NO",htT.get("OD_NO"));							//	オーダデマンド番号
						htT_RCV_ISSUE.put("VEND_LOT_NO","");								//	メーカロット番号
						htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");							//	入出庫備考
						htT_RCV_ISSUE.put("COMPANY_CD","");								//	会社コード
						htT_RCV_ISSUE.put("VEND_CD","");								//	取引先コード
						htT_RCV_ISSUE.put("CONS_TYP","");								//	支給区分
						htT_RCV_ISSUE.put("CONS_EXEC_DATE","");								//	有償支給実績抽出日

						// [有償支給履歴]への追加
						JDB0016(iInIndex, 2);
					}
				}
//20031121追加
//20031125
				if (psREAD != null)
				{
					psREAD.close();
				}
				if (dIssueNO==0)
				{
					break;
				}

			}
			//
//20031012削除			if (iCount != 0	&& dIssueNO	> 0)
			if (WH_PRIORITY_FLG == 1 && dIssueNO	> 0)
			{
				//DEBUG
//20031104				_log.message("品目別保管先優先順位の最小保管区から、出庫");
				//入出庫番号の採番
				ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
				strOdrCd = ODR_CD.getNo();

				// << 保管区別入出庫の登録 >>
				sql	= "insert into "
					+" T_RCV_ISSUE( "
					+" RCV_ISSUE_CTRL_CD,"			//	入出庫管理番号
					+	"RCV_ISSUE_TYP,"		//	入出庫区分
					+	"ITEM_CD,"			//	品目番号
					+	"PLANT_CD,"			//	工場コード
					+	"WH_CD,"			//	保管区コード
					+	"JOB_ODR_CD,"			//	製番
					+	"JOB_ODR_DETAIL_NO,"		//	製番枝番
					+	"PUCH_ODR_CD,"			//	発注番号
					+	"ACPT_NO,"			//	受入回数
					+	"ACPT_RSLT_CRCT_NO,"		//	受入実績訂正回数
					+	"INSPEC_RSLT_CRCT_NO,"		//	検査実績訂正回数
					+	"WORK_ODR_CD,"			//	作業計画番号
					+	"WORK_IN_PROC_CD,"		//	仕掛作業コード
					+	"PARTIAL_PRD_NO,"		//	分作回数
					+	"OPR_RSLT_CRCT_NO,"		//	作業実績訂正回数
					+	"ISSUE_INST_CD,"		//	出庫指示番号
					+	"RCV_ISSUE_QTY,"		//	入出庫数
					+	"RCV_ISSUE_AMOUNT,"		//	入出庫金額
					+	"RCV_ISSUE_DATE,"		//	入出庫年月日
					+	"RCV_ISSUE_GNR_TYP,"		//	入出庫発生区分
					+	"RCV_ISSUE_ODD_QTY,"		//	入出庫端数
					+	"DEFECT_CAUSE_CD,"		//	入出庫不良理由コード
					+	"STOCK_UPD_TYP,"		//	在庫更新区分
					+	"RCV_ISSUE_CMPLT_FLG,"		//	入出庫完了フラグ
					+	"OD_NO,"			//	オーダデマンド番号
					+	"VEND_LOT_NO,"			//	メーカロット番号
					+	"RCV_ISSUE_COMMENT,"		//	入出庫備考
					+	"COMPANY_CD,"			//	会社コード
					+	"VEND_CD,"			//	取引先コード
					+	"CONS_TYP,"			//	支給区分
					+	"CONS_EXEC_DATE,"		//	有償支給実績抽出日
//					+	"CREATED_DATE,"			//	作成日
					+	"CREATED_BY,"			//	作成者
					+	"CREATED_PRG_NM,"		//	作成プログラム名
//					+	"UPDATED_DATE,"			//	更新日
					+	"UPDATED_BY,"			//	更新者
					+	"UPDATED_PRG_NM,"		//	更新プログラム名
					+	"MODIFY_COUNT)	"		//	更新数
				+ "values ("
					+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//					+" ?, ?, ?, sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
					+" ?, ?, ?, ?, ?, ?, ?, ?)";
				ps = _conn.prepareStatement(sql);
				iIndex = 1;
				ps.setString(iIndex++, strOdrCd);								//	入出庫管理番号
				ps.setDouble(iIndex++, 2);									//	入出庫区分
				ps.setString(iIndex++, sITEM_CD_MIN);								//	品目番号
				ps.setString(iIndex++, (String)htT.get("PLANT_CD"));						//  工場コード
				ps.setString(iIndex++, sWH_CD_MIN);								//	保管区コード
				ps.setString(iIndex++, sJOB_ODR_CD_MIN);							//	 製番			 OK?
				ps.setDouble(iIndex++, Double.parseDouble(sJOB_ODR_DETAIL_NO_MIN));				//  製番枝番		  OK?
//20031012				ps.setDouble(iIndex++, 0);									//  製番枝番		  OK?
				ps.setString(iIndex++, ginPUCH_ODR_CD);								//	発注番号
				ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));						//	受入回数
				ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	受入実績訂正回数
				ps.setDouble(iIndex++, 0);									//	検査実績訂正回数
				ps.setString(iIndex++, ginWORK_ODR_CD);								//	作業計画番号
				ps.setString(iIndex++, ginWORK_IN_PROC_CD);							//	仕掛作業コード
				ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	分作回数
				ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	作業実績訂正回数
				ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));					//  出庫指示番号
				ps.setDouble(iIndex++, dIssueNO	* -1);								//	入出庫数
				ps.setDouble(iIndex++, 0);									//	入出庫金額
				dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
				ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));					//  入出庫年月日????????
//				ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));//	入出庫年月日???????????
				ps.setDouble(iIndex++, 21);									//	入出庫発生区分
				ps.setDouble(iIndex++, 0);									//	入出庫端数
				ps.setNull(iIndex++, Types.VARCHAR);								//	 入出庫不良理由コード		 ?
				ps.setDouble(iIndex++, 1);									//	在庫更新区分
				ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	入出庫完了フラグ
				ps.setString(iIndex++, (String)htT.get("OD_NO"));						//  オーダデマンド番号
				//-----------------------------------------------------------------
				ps.setString(iIndex++, "");									//	メーカロット番号
				ps.setString(iIndex++, "");									//	入出庫備考
				ps.setString(iIndex++, "");									//	会社コード
				ps.setString(iIndex++, "");									//	取引先コード
				ps.setDouble(iIndex++, 0);									//  支給区分
				ps.setNull(iIndex++, Types.DATE);								//  有償支給実績抽出日
	//			ps.setDate(iIndex++, "");		//	作成日
				ps.setString(iIndex++, _userInfo.getUserId());							//	作成者
				ps.setString(iIndex++, _userInfo.getBusinessName());						//	作成プログラム名
	//			ps.setString(iIndex++, "");				//	更新日
				ps.setString(iIndex++, _userInfo.getUserId());							//	更新者
				ps.setString(iIndex++, _userInfo.getBusinessName());						//	更新プログラム名
				ps.setDouble(iIndex++, 0);									//	更新数

				iIndex=ps.executeUpdate();
				if (iIndex > 0)
				{
					iCount++;  //20031012追記
					dISSUECOUNT = dISSUECOUNT + dIssueNO;
				}
				ps.close();
				//DEBUG
//20031104				_log.message("保管区別入出庫の登録番号02=["+strOdrCd+"]");
//20031104				_log.message("保管区別入出庫の登録件数02=["+iIndex+"]");

				//出庫処理を呼び出し
				_log.message("(SBM1199)出庫処理を呼び出し......");
				_IssueProcess = new IssueProcess(_iconn, strOdrCd);
				_IssueProcess.execProcess();

				if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
					(((String)htT.get("WORK_ODR_CD")).equals("")) &&
					(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
				{
					//DEBUG
//20031104					_log.message("有償支給履歴登録");
					// 登録した保管区別入出庫を保存
					if (sITEM_CD_MIN == null)
					{
						htT_RCV_ISSUE.put("ITEM_CD","");
					}else{
						htT_RCV_ISSUE.put("ITEM_CD",sITEM_CD_MIN);					//	品目番号
					}
					if (sWH_CD_MIN == null)
					{
						htT_RCV_ISSUE.put("WH_CD","");
					}else{
						htT_RCV_ISSUE.put("WH_CD",sWH_CD_MIN);						//	保管区コード
					}
					if (ginPUCH_ODR_CD == null)
					{
						htT_RCV_ISSUE.put("PUCH_ODR_CD","");
					}else{
						htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);				//	発注番号
					}
					if (ginACPT_NO == null)
					{
						htT_RCV_ISSUE.put("ACPT_NO","");
					}else{
						htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);					//	受入回数
					}
					if (ginACPT_RSLT_CRCT_NO == null)
					{
						htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
					}else{
						htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);			//	受入実績訂正回数
					}
					if (ginWORK_ODR_CD == null)
					{
						htT_RCV_ISSUE.put("WORK_ODR_CD","");
					}else{
						htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);				//	作業計画番号
					}
					if (ginWORK_IN_PROC_CD == null)
					{
						htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
					}else{
						htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);			//	仕掛作業コード
					}
					if (ginPARTIAL_PRD_NO == null)
					{
						htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
					}else{
						htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);				//	分作回数
					}
					if (ginOPR_RSLT_CRCT_NO == null)
					{
						htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
					}else{
						htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);			//	作業実績訂正回数
					}
					if (ginRCV_ISSUE_DATE == null)
					{
						htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
					}else{
						htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);				//	入出庫年月日
					}
					if (ginRCV_ISSUE_CMPLT_FLG == null)
					{
						htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
					}else{
						htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);		//	入出庫完了フラグ
					}
					htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);					//	入出庫管理番号
					htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");							//	入出庫区分
					htT_RCV_ISSUE.put("PLANT_CD",htT.get("PLANT_CD"));					//	工場コード
					if (sJOB_ODR_CD_MIN == null)
					{
						htT_RCV_ISSUE.put("JOB_ODR_CD","");						//	製番
					}else{
						htT_RCV_ISSUE.put("JOB_ODR_CD",sJOB_ODR_CD_MIN);				//	製番
					}
					htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO",sJOB_ODR_DETAIL_NO_MIN);				//	製番枝番
//20031012					htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");						//	製番枝番
					htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");						//	検査実績訂正回数
					htT_RCV_ISSUE.put("ISSUE_INST_CD",htT.get("ISSUE_INST_CD"));				//	出庫指示番号
					htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueNO * -1));			//	入出庫数
					htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");						//	入出庫金額
					htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");						//	入出庫発生区分
					htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");						//	入出庫端数
					htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");						//	入出庫不良理由コード
					htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");							//	在庫更新区分
					htT_RCV_ISSUE.put("OD_NO",htT.get("OD_NO"));						//	オーダデマンド番号
					htT_RCV_ISSUE.put("VEND_LOT_NO","");							//	メーカロット番号
					htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");						//	入出庫備考
					htT_RCV_ISSUE.put("COMPANY_CD","");							//	会社コード
					htT_RCV_ISSUE.put("VEND_CD","");							//	取引先コード
					htT_RCV_ISSUE.put("CONS_TYP","");							//	支給区分
					htT_RCV_ISSUE.put("CONS_EXEC_DATE","");							//	有償支給実績抽出日

					// [有償支給履歴]への追加
					JDB0016(iInIndex,2);
				}
			}

//---20031010修正版
			//④①で存在しない場合は、[工場]を以下の条件で検索し、「代表納入場所コード」を取得する。
			if (iCount == 0	&& dIssueNO	> 0)
			{
				//DEBUG
//20031104				_log.message("「代表納入場所コード」から、出庫");
				// << 工場の検索 >>
				sql	= "SELECT M_PLANT.PLANT_CD, M_PLANT.WH_CD "
					+" FROM M_PLANT "
					+" WHERE (((M_PLANT.PLANT_CD)=?)) ";
				ps = _conn.prepareStatement(sql);
				ps.setString(1,	(String)htT.get("PLANT_CD"));
				rs = ps.executeQuery();
				if (rs.next())
				{
					sPlantWH_CD	= rs.getString("WH_CD");
				}
				ps.close();
				rs.close();

				if (sPlantWH_CD == null || sPlantWH_CD.equals(""))	// 20031031追加
				{
					// << 保管区の検索 >>
					sql	= "SELECT M_WH.WH_CD "
						+ " FROM M_WH "
						+ " WHERE ((M_WH.PLANT_CD=?) "	// 20031031追加
						+ " AND (M_WH.MRP_FLG = 1)) "	// 20031031追加
						+ " ORDER BY M_WH.WH_CD ";
//20031121修正開始
					psREAD = _conn.prepareStatement(sql);
					psREAD.setString(1,	(String)htT.get("PLANT_CD"));	// 20031031追加
					rs = psREAD.executeQuery();
//					ps = _conn.prepareStatement(sql);
//					ps.setString(1,	(String)htT.get("PLANT_CD"));	// 20031031追加
//					rs = ps.executeQuery();
//20031121修正終了


					if (rs.next())
					{
						sPlantWH_CD	= rs.getString("WH_CD");
					}
				}
				// << 保管区別製番在庫の検索 >>
//20031010				sql	= "SELECT T_JOB_ODR_CD_STOCK.JOB_ODR_CD, T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO, "
//					+ " T_JOB_ODR_CD_STOCK.ITEM_CD, T_JOB_ODR_CD_STOCK.WH_CD, T_JOB_ODR_CD_STOCK.PLANT_CD, "
//					+ " T_JOB_ODR_CD_STOCK.STOCK_ON_HAND_QTY, T_JOB_ODR_CD_STOCK.PRVS_DAYEND_STOCK_QTY,  "
//					+ " T_JOB_ODR_CD_STOCK.PRVS_MONTHEND_STOCK_QTY, T_JOB_ODR_CD_STOCK.PRVS_TERMEND_STOCK_QTY "
//					+ " FROM T_JOB_ODR_CD_STOCK,M_WH "
//					+ " WHERE ((T_JOB_ODR_CD_STOCK.ITEM_CD=?) AND (T_JOB_ODR_CD_STOCK.WH_CD=?) "
//					+ " AND (T_JOB_ODR_CD_STOCK.PLANT_CD=?) AND (T_JOB_ODR_CD_STOCK.JOB_ODR_CD=?)  "
//					+" AND (T_JOB_ODR_CD_STOCK.WH_CD = M_WH.WH_CD) "
//					+" AND (M_WH.MRP_FLG = 1)) ";
//				ps = _conn.prepareStatement(sql);
//				ps.setString(1,	(String)htT.get("ITEM_CD"));
//				ps.setString(2,	sPlantWH_CD);
//				ps.setString(3,	(String)htT.get("PLANT_CD"));
//				ps.setString(4,	gsJOB_ODR_CD);				//前処理に取得した製番？？？
//				rs = ps.executeQuery();
				//DEBUG
//20031104				_log.message("sql=["+sql+"]");
//20031104				_log.message("ITEM_CD=["+(String)htT.get("ITEM_CD")+"]");
//20031104				_log.message("sPlantWH_CD=["+sPlantWH_CD+"]");
//20031104				_log.message("PLANT_CD=["+(String)htT.get("PLANT_CD")+"]");
//20031104				_log.message("gsJOB_ODR_CD=["+gsJOB_ODR_CD+"]");

//20031010				if (rs.next())
				if(sPlantWH_CD != null || !sPlantWH_CD.equals(""))
				{
					//入出庫番号の採番
					ODR_CD = new CollectNumber(CollectNumber.ISSUE_CD ,
						_userInfo.getUserId(),_userInfo.getBusinessName(),_plantCd);
					strOdrCd = ODR_CD.getNo();

					// << 保管区別入出庫の登録 >>
					sql	= "insert into "
						+"	T_RCV_ISSUE( "
						+" RCV_ISSUE_CTRL_CD,"			//	入出庫管理番号
						+	"RCV_ISSUE_TYP,"		//	入出庫区分
						+	"ITEM_CD,"			//	品目番号
						+	"PLANT_CD,"			//	工場コード
						+	"WH_CD,"			//	保管区コード
						+	"JOB_ODR_CD,"			//	製番
						+	"JOB_ODR_DETAIL_NO,"		//	製番枝番
						+	"PUCH_ODR_CD,"			//	発注番号
						+	"ACPT_NO,"			//	受入回数
						+	"ACPT_RSLT_CRCT_NO,"		//	受入実績訂正回数
						+	"INSPEC_RSLT_CRCT_NO,"		//	検査実績訂正回数
						+	"WORK_ODR_CD,"			//	作業計画番号
						+	"WORK_IN_PROC_CD,"		//	仕掛作業コード
						+	"PARTIAL_PRD_NO,"		//	分作回数
						+	"OPR_RSLT_CRCT_NO,"		//	作業実績訂正回数
						+	"ISSUE_INST_CD,"		//	出庫指示番号
						+	"RCV_ISSUE_QTY,"		//	入出庫数
						+	"RCV_ISSUE_AMOUNT,"		//	入出庫金額
						+	"RCV_ISSUE_DATE,"		//	入出庫年月日
						+	"RCV_ISSUE_GNR_TYP,"		//	入出庫発生区分
						+	"RCV_ISSUE_ODD_QTY,"		//	入出庫端数
						+	"DEFECT_CAUSE_CD,"		//	入出庫不良理由コード
						+	"STOCK_UPD_TYP,"		//	在庫更新区分
						+	"RCV_ISSUE_CMPLT_FLG,"		//	入出庫完了フラグ
						+	"OD_NO,"			//	オーダデマンド番号
						+	"VEND_LOT_NO,"			//	メーカロット番号
						+	"RCV_ISSUE_COMMENT,"		//	入出庫備考
						+	"COMPANY_CD,"			//	会社コード
						+	"VEND_CD,"			//	取引先コード
						+	"CONS_TYP,"			//	支給区分
						+	"CONS_EXEC_DATE,"		//	有償支給実績抽出日
//						+	"CREATED_DATE,"			//	作成日
						+	"CREATED_BY,"			//	作成者
						+	"CREATED_PRG_NM,"		//	作成プログラム名
//						+	"UPDATED_DATE,"			//	更新日
						+	"UPDATED_BY,"			//	更新者
						+	"UPDATED_PRG_NM,"		//	更新プログラム名
						+	"MODIFY_COUNT)	"		//	更新数
					+ "values ("
						+"?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
//						+"?, ?, ?, ?, sysdate(), 'SYSTEM', 'SYSTEM', sysdate(), 'SYSTEM', 'SYSTEM', 0)";
						+"?, ?, ?, ?, ?, ?, ?, ?, ?)";
					ps = _conn.prepareStatement(sql);

					iIndex = 1;
					ps.setString(iIndex++, strOdrCd);								//	入出庫管理番号
					ps.setDouble(iIndex++, 2);									//	入出庫区分
//20031010					ps.setString(iIndex++, rs.getString("ITEM_CD"));						//	品目番号
					ps.setString(iIndex++, (String)htT.get("ITEM_CD"));						//	品目番号
					ps.setString(iIndex++, (String)htT.get("PLANT_CD"));						//  工場コード
//20031010					ps.setString(iIndex++, rs.getString("WH_CD"));							//	保管区コード
					ps.setString(iIndex++, sPlantWH_CD);								//	保管区コード
//20031010					ps.setString(iIndex++, rs.getString("JOB_ODR_CD"));						//	 製番		 OK?
					ps.setString(iIndex++, gsJOB_ODR_CD);								//	 製番		 OK?
//20031010					ps.setDouble(iIndex++, rs.getDouble("JOB_ODR_DETAIL_NO"));					//  製番枝番	  OK?
					ps.setDouble(iIndex++, 0);									//  製番枝番	  OK?
					ps.setString(iIndex++, ginPUCH_ODR_CD);								//	発注番号
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_NO));						//	受入回数
					ps.setDouble(iIndex++, Double.parseDouble(ginACPT_RSLT_CRCT_NO));				//	受入実績訂正回数
					ps.setDouble(iIndex++, 0);									//	検査実績訂正回数
					ps.setString(iIndex++, ginWORK_ODR_CD);								//	作業計画番号
					ps.setString(iIndex++, ginWORK_IN_PROC_CD);							//	仕掛作業コード
					ps.setDouble(iIndex++, Double.parseDouble(ginPARTIAL_PRD_NO));					//	分作回数
					ps.setDouble(iIndex++, Double.parseDouble(ginOPR_RSLT_CRCT_NO));				//	作業実績訂正回数
					ps.setString(iIndex++, (String)htT.get("ISSUE_INST_CD"));					//  出庫指示番号
					ps.setDouble(iIndex++, dIssueNO * -1);								//	入出庫数
					ps.setDouble(iIndex++, 0);									//	入出庫金額
					dtDate = Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE);
					ps.setDate(iIndex++, new java.sql.Date(dtDate.getTime()));					//  入出庫年月日????????
//					ps.setDate(iIndex++, (java.sql.Date)Converter.strToDate(ginRCV_ISSUE_DATE,Converter.SLASH_DATE));//  入出庫年月日????????
					ps.setDouble(iIndex++, 21);									//	入出庫発生区分
					ps.setDouble(iIndex++, 0);									//	入出庫端数
					ps.setString(iIndex++, "");									//	入出庫不良理由コード?
					ps.setDouble(iIndex++, 1);									//	在庫更新区分
					ps.setDouble(iIndex++, Double.parseDouble(ginRCV_ISSUE_CMPLT_FLG));				//	入出庫完了フラグ
					ps.setString(iIndex++, (String)htT.get("OD_NO"));						//  オーダデマンド番号
					//-----------------------------------------------------------------
					ps.setString(iIndex++, "");									//	メーカロット番号
					ps.setString(iIndex++, "");									//	入出庫備考
					ps.setString(iIndex++, "");									//	会社コード
					ps.setString(iIndex++, "");									//	取引先コード
					ps.setDouble(iIndex++, 0);									//	支給区分
					ps.setNull(iIndex++, Types.DATE);								//  有償支給実績抽出日
		//			ps.setDate(iIndex++, "");		//	作成日
					ps.setString(iIndex++, _userInfo.getUserId());							//	作成者
					ps.setString(iIndex++, _userInfo.getBusinessName());						//	作成プログラム名
		//			ps.setString(iIndex++, "");		//	更新日
					ps.setString(iIndex++, _userInfo.getUserId());							//	更新者
					ps.setString(iIndex++, _userInfo.getBusinessName());						//	更新プログラム名
					ps.setDouble(iIndex++, 0);									//	更新数

					iIndex=ps.executeUpdate();
					if (iIndex > 0)
					{
						dISSUECOUNT = dISSUECOUNT + dIssueNO;
					}
					ps.close();
					//DEBUG
//20031104					_log.message("保管区別入出庫の登録番号03=["+strOdrCd+"]");
//20031104					_log.message("保管区別入出庫の登録件数03=["+iIndex+"]");

					//出庫処理を呼び出し
					_log.message("(SBM1199)出庫処理を呼び出し......");
					_IssueProcess = new IssueProcess(_iconn, strOdrCd);
					_IssueProcess.execProcess();

					if ((!((String)htT.get("PUCH_ODR_CD")).equals("")) &&
						(((String)htT.get("WORK_ODR_CD")).equals("")) &&
						(Double.parseDouble((String)htT.get("CONS_TYP")) == 1))
					{
						//DEBUG
//20031104						_log.message("有償支給履歴登録");
						// 登録した保管区別入出庫を保存
						if ((String)htT.get("ITEM_CD") == null)
						{
							htT_RCV_ISSUE.put("ITEM_CD","");
						}else{
							htT_RCV_ISSUE.put("ITEM_CD",(String)htT.get("ITEM_CD"));			//	品目番号
						}
						if (sPlantWH_CD == null)
						{
							htT_RCV_ISSUE.put("WH_CD","");
						}else{
							htT_RCV_ISSUE.put("WH_CD",sPlantWH_CD);						//	保管区コード
						}
						if (ginPUCH_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("PUCH_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("PUCH_ODR_CD",ginPUCH_ODR_CD);				//	発注番号
						}
						if (ginACPT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_NO",ginACPT_NO);					//	受入回数
						}
						if (ginACPT_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("ACPT_RSLT_CRCT_NO",ginACPT_RSLT_CRCT_NO);			//	受入実績訂正回数
						}
						if (ginWORK_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_ODR_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_ODR_CD",ginWORK_ODR_CD);				//	作業計画番号
						}
						if (ginWORK_IN_PROC_CD == null)
						{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD","");
						}else{
							htT_RCV_ISSUE.put("WORK_IN_PROC_CD",ginWORK_IN_PROC_CD);			//	仕掛作業コード
						}
						if (ginPARTIAL_PRD_NO == null)
						{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO","");
						}else{
							htT_RCV_ISSUE.put("PARTIAL_PRD_NO",ginPARTIAL_PRD_NO);				//	分作回数
						}
						if (ginOPR_RSLT_CRCT_NO == null)
						{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO","");
						}else{
							htT_RCV_ISSUE.put("OPR_RSLT_CRCT_NO",ginOPR_RSLT_CRCT_NO);			//	作業実績訂正回数
						}
						if (ginRCV_ISSUE_DATE == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_DATE",ginRCV_ISSUE_DATE);				//	入出庫年月日
						}
						if (ginRCV_ISSUE_CMPLT_FLG == null)
						{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG","");
						}else{
							htT_RCV_ISSUE.put("RCV_ISSUE_CMPLT_FLG",ginRCV_ISSUE_CMPLT_FLG);		//	入出庫完了フラグ
						}
						htT_RCV_ISSUE.put("RCV_ISSUE_CTRL_CD",strOdrCd);					//	入出庫管理番号
						htT_RCV_ISSUE.put("RCV_ISSUE_TYP","2");							//	入出庫区分
						htT_RCV_ISSUE.put("PLANT_CD",htT.get("PLANT_CD"));					//	工場コード
						if (gsJOB_ODR_CD == null)
						{
							htT_RCV_ISSUE.put("JOB_ODR_CD","");						//	製番
						}else{
							htT_RCV_ISSUE.put("JOB_ODR_CD",gsJOB_ODR_CD);					//	製番
						}
						htT_RCV_ISSUE.put("JOB_ODR_DETAIL_NO","0");						//	製番枝番
						htT_RCV_ISSUE.put("INSPEC_RSLT_CRCT_NO","0");						//	検査実績訂正回数
						htT_RCV_ISSUE.put("ISSUE_INST_CD",htT.get("ISSUE_INST_CD"));				//	出庫指示番号
						htT_RCV_ISSUE.put("RCV_ISSUE_QTY",Double.toString(dIssueNO * -1));			//	入出庫数
						htT_RCV_ISSUE.put("RCV_ISSUE_AMOUNT","0");						//	入出庫金額
						htT_RCV_ISSUE.put("RCV_ISSUE_GNR_TYP","21");						//	入出庫発生区分
						htT_RCV_ISSUE.put("RCV_ISSUE_ODD_QTY","0");						//	入出庫端数
						htT_RCV_ISSUE.put("DEFECT_CAUSE_CD","");						//	入出庫不良理由コード
						htT_RCV_ISSUE.put("STOCK_UPD_TYP","1");							//	在庫更新区分
						htT_RCV_ISSUE.put("OD_NO",htT.get("OD_NO"));						//	オーダデマンド番号
						htT_RCV_ISSUE.put("VEND_LOT_NO","");							//	メーカロット番号
						htT_RCV_ISSUE.put("RCV_ISSUE_COMMENT","");						//	入出庫備考
						htT_RCV_ISSUE.put("COMPANY_CD","");							//	会社コード
						htT_RCV_ISSUE.put("VEND_CD","");							//	取引先コード
						htT_RCV_ISSUE.put("CONS_TYP","");							//	支給区分
						htT_RCV_ISSUE.put("CONS_EXEC_DATE","");							//	有償支給実績抽出日

						// [有償支給履歴]への追加
						JDB0016(iInIndex,2);
					}
				} else {
					_log.message("(SBM1200)保管区コードが取得できませんでしたので、出庫処理は行われませんでした。");
				}
//20031121追加
//20031125
				if (psREAD != null)
				{
					psREAD.close();
				}
			}

//20031104			_log.message(sql);
			_log.methodEnd();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally {
//20031121修正開始
//			if (rs != null)
//			{
//				rs.close();
//			}
			if (psIN != null)
			{
				psIN.close();
			}
			if (psREAD != null)
			{
				psREAD.close();
			}
//20031121修正終了
			if (ps != null)
			{
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
			if (rsIN != null) {
				try {
					rsIN.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rsIN = null;
			}
		}
		return dISSUECOUNT;
	};

	// -------------------------------------------------------------------------------------------
	//	 Common	Sub	Class
	// -------------------------------------------------------------------------------------------
	/**
	 *　ユーザ情報保持用クラス(インナークラス)
	 */
	class UserInfo {

		private	String userId;			   // ユーザID
		private	String businessName;	   // 業務名

		public UserInfo(String userId, String businessName)	{
			this.userId	= userId;
			this.businessName =	businessName;
		}
		public String getUserId() {
			return userId;
		}
		public String getBusinessName()	{
			return businessName;
		}
	}
	/**
	 * ログ出力(インナークラス)
	 */
	class Log {
		private	int	indent = 0;
		private	SystemLog _syslog =	new	SystemLog();   // ★★ログ出力クラス

		// コンストラクタ	  // 2003/08/11	connection取得部修正
		public Log(String className,IDbConnection	conn){
			// ★★	初期化
			_syslog.init(className);
			_syslog.setConnection(conn);
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
			// (JDK1.3の場合SecurityManager#getStackTrace()を使う)
			StackTraceElement e	= (new Throwable()).getStackTrace()[2];
//			SecurityManager	e =	(new Throwable()).getStackTrace()[2];

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
			_syslog.fine_d(	out, _userInfo.getUserId() );

			// ログ出力(System.out版)
//			System.out.println(out);
		}
	}
}
