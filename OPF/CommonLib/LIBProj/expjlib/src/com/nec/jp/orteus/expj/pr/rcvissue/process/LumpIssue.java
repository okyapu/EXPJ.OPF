/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/LumpIssue.java,v $
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
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;


/**
 * <pre>
 * 一括出庫の共通処理を行います。
 * このクラスは、以下の業務処理から呼び出されます。
 * 　１．キット出庫(一括更新)
 * 　２．マニュアル出庫（一括更新時）
 *
 * このクラス内部からは、SQLExceptionが発生する可能性があります。
 * </pre>
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2013/06/27 02:36:07 $
 */

public class LumpIssue implements RcvIssueConst {

	private	IDbConnection _iconn;			// トランザクションコネクション情報
	private	Connection _conn;				// コネクション情報
	private	String _plantCd;				// 工場コード
	private	UpdateInfo _updInfo;			// 利用者管理情報(インナークラス)
	private	Log	_log;						// ログ情報(インナークラス)
	private	IssueProcess _IssueProcess;		// 出庫処理のオブジェクト

	private	int		ginRCV_ISSUE_TYP;		//	自動出庫処理区分
	private	String	ginRCV_ISSUE_DATE;		//	出庫年月日
	private	int		ginRCV_ISSUE_CMPLT_FLG;	//	出庫完了フラグ
	private	String	ginVEND_LOT_NO;			//	メーカロット番号

	//入庫結果出力用文字列（出庫指示番号）
	static final  String strDtl = "T_ISSUE_INST.ISSUE_INST_CD:";

	private final static BigDecimal bdZero = new BigDecimal("0");
	/**
	 * <pre>
	 * コンストラクタ
	 * newするときには下記のパラメータを設定する。
	 * 工場コード,ユーザID,業務名は別途setterで設定し直すことも可能。
	 * </pre>
	 *
	 * @param conn コネクション情報
	 * @param plantCd 工場コード
	 * @param userId ユーザID
	 * @param businessName 業務名
	 */
	public LumpIssue(IDbConnection conn, String plantCd, String userId, String businessName) {

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
	 * 一括出庫処理・メイン処理
	 *
	 * @param inRcvIssueTyp	   自動出庫処理区分
	 * @param inRcvIssueDate  出庫年月日(YYYY/MM/DD形式）
	 * @param inCmpltFlg      出庫完了フラグ
	 * @param inVendLotNo     メーカロット番号(キット一括出庫時に使用。画面入力値)
	 * @param iIssueInstList  出庫指示情報リスト(IssueInstStructクラスのリスト）
	 * 
	 * @return true:正常終了(警告メッセージ含む場合あり）　false:エラーあり
	 *  <pre>
	 *          メッセージコードリスト形式:  String[]のList 
	 *                                       String[0]--> メッセージコード
	 *                                       String[1]--> メッセージ詳細（品目コード）
	 *  </pre>
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public boolean LumpIssueOpr(int	inRcvIssueTyp,
	                          String	inRcvIssueDate,
	                          int		inCmpltFlg,
	                          String    inVendLotNo,
	                          List		iIssueInstList
			  )		
			throws SQLException, FoundationException {

		int	iIssueCount	= 0;
		boolean ret = false;	//自動出庫処理結果
		String StrOdrCd = "";	//入庫処理結果（保管区別入出庫管理番号）
		
		//入力パラメータを取得
		ginRCV_ISSUE_TYP		= inRcvIssueTyp;		//自動出庫処理区分
		ginRCV_ISSUE_DATE		= inRcvIssueDate;		//出庫年月日
		ginRCV_ISSUE_CMPLT_FLG	= inCmpltFlg;			//出庫完了フラグ
		ginVEND_LOT_NO          = inVendLotNo;			//メーカロット番号
		try
		{
			_log.methodStart();
			//入力パラメータを取得(型変換も行う）
			//DEBUG

//DEBUG			_log.message("自動出庫処理区分=["+inRcvIssueTyp+"]");
//DEBUG			_log.message("出庫年月日=["+inRcvIssueTyp+"]");
//DEBUG			_log.message("出庫完了フラグ=["+inRcvIssueTyp+"]");

			//2.10.3 入力パラメータチェック
			//自動出庫処理区分が「1：キット出庫、 4:マニュアル出庫」以外の場合エラー
			if (ginRCV_ISSUE_TYP != 1 && ginRCV_ISSUE_TYP != 4){
				_log.message("(SBM0908) 自動出庫処理区分=["+ginRCV_ISSUE_TYP+"] が不正(1,4以外)なので、" +
						"処理を終了します。");
				IllegalArgumentException e = new IllegalArgumentException(
                        this.getClass().getName());
				throw e;
			}

			//自動出庫起動パラメータの設定
			WhAutoIssueProc wAi = new WhAutoIssueProc(_iconn,
                                                      _plantCd,
                                                      _updInfo.getUpdateBy(),
                                                      _updInfo.getUpdatePrgNm());			
			WhAutoIssueProc.AutoIssueParam inParam = wAi.new AutoIssueParam();

			inParam.m_RCV_ISSUE_TYP = inRcvIssueTyp;		//自動出庫処理区分
			inParam.m_RCV_ISSUE_DATE = inRcvIssueDate;		//出庫年月日
			inParam.m_RCV_ISSUE_CMPLT_FLG = inCmpltFlg;		//出庫完了フラグ
			inParam.m_VEND_LOT_NO = inVendLotNo;			//メーカロット番号
			inParam.m_PLANT_CD = _plantCd;					//工場コード
			
			//**************************************************
			//    引数指定された一括出庫品目の【出庫&入庫処理】
			//**************************************************
			
			// 自動出庫処理対象品目セット情報がある間
			iIssueCount	= iIssueInstList.size();
			//DEBUG
//			_log.message("自動出庫処理対象品目件数=["+iIssueCount+"]");
			for(int cnt=0; cnt < iIssueCount; cnt++)
			{
			    
			    // 出庫対象品目情報の取り出し
				IssueInstStruct stII = (IssueInstStruct)iIssueInstList.get(cnt);

				//***********************
				//    【出庫処理】
				//***********************
				//--- <自動出庫処理> ------
				WhAutoIssueProc sProc = new WhAutoIssueProc(_iconn,
			            								_plantCd,
			                                            _updInfo.getUpdateBy(),
			                                            _updInfo.getUpdatePrgNm());
			    ret = sProc.exec(inParam, stII);
			    if (ret) {
			        _infoList.addAll(sProc.getInfoList());
			        _warnList.addAll(sProc.getWarnList());
			    } else {
				    _infoList.clear();	
				    _warnList.clear();
				    _errorList.addAll(sProc.getErrorList());
				    break;
			    }
			    
				//*************************
				//    【入庫処理】
				//*************************
					if (stII.m_WH_CD != null && "".equals(stII.m_WH_CD) == false) {
						ret = rcvProc(stII);
					} else {
						ret = true;
					}
			    if (!ret) {
			        break;
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
	/**
	 * 
	 * 工程保管場所への入庫のための[保管区別入出庫]を追加します。
	 * @param IssueInstStruct  登録情報(出庫指示情報)
	 * @return　String 登録したレコードの入出庫管理番号
	 * @throws SQLException
	 * @throws Exception
	 *
	 */
	private	boolean rcvProc(IssueInstStruct iIssueInstStruct)
			throws SQLException,FoundationException {
		String strOdrCd="";
		int	iCnt = 0;

		RcvProcess wRcvProc;		//入庫処理クラス
		boolean ret;				//入庫処理結果
		String MsgCd = null;
		
		try
		{
			_log.methodStart();

			//出庫指示情報を取得
			IssueInstStruct stII = iIssueInstStruct;
			
			//登録データ設定   -------------------------------
			RcvIssueStruct sData = new RcvIssueStruct();
			
			sData.m_RCV_ISSUE_TYP = 1;							//	入出庫区分
			sData.m_ITEM_CD = stII.m_ITEM_CD;					//	品目番号
			sData.m_PLANT_CD = stII.m_PLANT_CD;					//	工場コード
			sData.m_WH_CD = stII.m_WH_CD;						//	工程保管場所コード
			//親品目が製番品の場合のみ、製番情報をセット
			if ((stII.m_MRP_ODR_TYP == 1) || (stII.m_MRP_ODR_TYP == 2)) { 
			    sData.m_JOB_ODR_CD = stII.m_JOB_ODR_CD;					//	製番
			    sData.m_JOB_ODR_DETAIL_NO = stII.m_JOB_ODR_DETAIL_NO;	//	製番枝番
			} else {
			    sData.m_JOB_ODR_CD = null;					//	製番
			    sData.m_JOB_ODR_DETAIL_NO = 0;				//	製番枝番
			}
			sData.m_PUCH_ODR_CD = stII.m_PUCH_ODR_CD;			//	発注番号
			sData.m_ACPT_NO = 0;								//	受入回数
			sData.m_ACPT_RSLT_CRCT_NO = 0;						//	受入実績訂正回数
			sData.m_INSPEC_RSLT_CRCT_NO = 0;					//	検査実績訂正回数
			sData.m_WORK_ODR_CD = stII.m_WORK_ODR_CD;			//	作業計画番号
			sData.m_WORK_IN_PROC_CD = stII.m_WORK_IN_PROC_CD;	//	仕掛作業コード
			sData.m_PARTIAL_PRD_NO = 0;							//	分作回数
			sData.m_OPR_RSLT_CRCT_NO = 0;						//	作業実績訂正回数
			sData.m_ISSUE_INST_CD = stII.m_ISSUE_INST_CD;		//	出庫指示番号
			sData.m_RCV_ISSUE_QTY = stII.m_AUTO_ISSUE_QTY;		//	入出庫数(自動出庫数)
			sData.m_RCV_ISSUE_AMOUNT = bdZero;					//	入出庫金額
			sData.m_RCV_ISSUE_DATE = Converter.strToDate(
					 ginRCV_ISSUE_DATE,Converter.SLASH_DATE);	//	入出庫年月日
			if (stII.m_CONS_TYP == 0) {
				sData.m_RCV_ISSUE_GNR_TYP = 61;						//	入出庫発生区分(61:工程在庫入庫）
			} else {
				sData.m_RCV_ISSUE_GNR_TYP = 81;						//	入出庫発生区分(81:取引先在庫入庫）
			}
			sData.m_RCV_ISSUE_ODD_QTY = bdZero;					//	入出庫端数
			sData.m_DEFECT_CAUSE_CD = null;						//	入出庫不良理由コード
			sData.m_STOCK_UPD_TYP = 1;							//	在庫更新区分
			sData.m_RCV_ISSUE_CMPLT_FLG = ginRCV_ISSUE_CMPLT_FLG;	//	入出庫完了フラグ
			sData.m_OD_NO = stII.m_OD_NO;						//	オーダデマンド番号
			sData.m_VEND_LOT_NO = ginVEND_LOT_NO;				//	メーカロット番号
			//------------------------------------------------------------------------------
			sData.m_RCV_ISSUE_COMMENT = null;					//	入出庫備考
			sData.m_COMPANY_CD = SystemInformation.getSysMyCompanyCd();		//	会社コード
			sData.m_VEND_CD = stII.m_VEND_CD;					//	取引先コード
			sData.m_CONS_TYP = stII.m_CONS_TYP;					//	支給区分
			sData.m_CONS_EXEC_DATE = null;						//	有償支給実績抽出日
			//------------------------------------------------------------------------
			
			
//			<< 保管区別入出庫の登録 >>
			RcvIssueEntity sRcvIssueEntity = new RcvIssueEntity(_iconn,_updInfo);
			strOdrCd = sRcvIssueEntity.insert(sData);
			if (!strOdrCd.equals("")) {
			    sData.m_RCV_ISSUE_CTRL_CD = strOdrCd;		//入出庫管理番号
			}
			
			//入庫処理を呼び出し
			wRcvProc = new RcvProcess(_iconn, strOdrCd);
			ret = wRcvProc.execProcess();
			if (ret) {
			    //インフォメーションメッセージを保存
			    for (Iterator itr=wRcvProc.getInfoList().iterator(); itr.hasNext(); ) {
			        MsgCd = (String)itr.next();
			        setInfoList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
			    }
			    //ワーニングメッセージは保存しない（現在、RcvProcessから返却されていないため）
			} else {
			    _infoList.clear();
			    _warnList.clear();
			    //エラーメッセージを保存
			    for (Iterator itr=wRcvProc.getErrorList().iterator(); itr.hasNext(); ) {
			        MsgCd = (String)itr.next();
			        setErrorList(MsgCd, strDtl + stII.m_ISSUE_INST_CD);
			    }
			    return false;
			}			
			_log.methodEnd();
		} catch(ParseException pe) {
				StackTraceElement e	= (new Throwable()).getStackTrace()[1];
				String className = e.getClassName();
				String methodName =	e.getMethodName();
				throw new FoundationException(className,methodName,"ParseException");
		} finally {
		}
		return true;
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
	 * ワーニングメッセージ設定
	 * @param iMsgCd　メッセージコード
	 * @param iMsgDetail　メッセージ詳細（品目番号）
	 */
	private void setWarnList(String iMsgCd, String iMsgDetail)
	{
	    String[] w_msg =  new String[2];
	    
	    w_msg[0] = iMsgCd;
	    w_msg[1] = iMsgDetail;
	    _warnList.add(w_msg);
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
	 * メッセージ取得 
	 * @return エラーリスト(メッセージコード(String) のリスト）
	 */
	public ArrayList getErrorList()
	{
		return _errorList;
	}

	/**
	 * メッセージ取得 
	 * @return infoリスト
	 */
	public ArrayList getInfoList()
	{
		return _infoList;
	}

	/**
	 * メッセージ取得 
	 * @return warnリスト
	 */
	public ArrayList getWarnList()
	{
		return _warnList;
	}
	//********************************************************************
	
	
	//********************************************************************
	//     文字列編集
	//********************************************************************
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

	// -------------------------------------------------------------------------------------------
	//	 Common	Sub	Class
	// -------------------------------------------------------------------------------------------

	/**
	 * ログ出力(インナークラス)
	 */
	class Log {
		private	int	indent = 0;
		private	SystemLog _syslog =	new	SystemLog();   // ★★ログ出力クラス

		// コンストラクタ	  // 2003/08/11	connection取得部修正
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
