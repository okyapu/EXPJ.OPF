package com.nec.jp.orteus.metamorBase.KR0070;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
import java.math.*;

import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.xaf.util.FoundationException;


/**
 * プロシージャをコールして処理を実行するクラス
 * （自部品テンプレート専用クラス）
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 07:52:15 $
 */
public class Common {

	/**
	 * 販売管理初期処理キー
	 */
	static final public int INITSALESPROCFD  =  1;
	
	/**
	 * 売掛IF処理キー
	 */
	static final public int EXCARFIFFD = INITSALESPROCFD + 1;
	
	/**
	 * 会社コード取得キー
	 */
	static final public int GETSCMCOMPANYCD = EXCARFIFFD + 1;
	
	/**
	 * 売上実績管理番号
	 */
	static final public int SALES_SEQ_NO = GETSCMCOMPANYCD + 1;
	
	/**
	 * 伝票番号（ＳＣＭ）
	 */
	static final public int SCM_SLIP_CD = SALES_SEQ_NO + 1;
	
	/**
	 * 伝票番号
	 */
	static final public int SLIP_CD = SCM_SLIP_CD + 1;
	
	/**
	 * 消費税計算キー
	 */
	static final public int CALCTAXFD = SLIP_CD + 1;
	
	/**
	 * 売上計上判定処理キー
	 */
	static final public int EXCSALESCHECK = CALCTAXFD + 1;
	
	/**
	 * 売上計上処理キー
	 */
	static final public int EXCSALESCONF = EXCSALESCHECK + 1;
	
	/**
	 * 売上計上処理キー
	 */
	static final public int EXCSALESCONFSCM = EXCSALESCONF + 1;
	
	/**
	 * 販売単価取得キー
	 */
	static final public int GETSALESUNITCOST = EXCSALESCONFSCM + 1;
	
	/**
	 * 0値設定用
	 */
	static final  BigDecimal BIG_DECIMAL_ZERO  = BigDecimal.valueOf(0);
	

	protected int collectKey = 0;
	protected String userCd = null;
	protected String businessCd = null;
	protected String plantCd = null;
	protected String companyCd = null;
	protected String logMode = null;
	protected String outPutMode = null;
	protected String outPutPath = null;
	protected String outPutName = null;
	protected SystemLog sysLog = null;
	protected IDbConnection conn = null;
	protected Integer resultStatus = null;
	protected List resultList = null;
	protected int resultchk = 0;

	
	/*********************************************************************
	 *** 共通関数
	 *********************************************************************/
	
	/**
	 * コンストラクタ
	 * @param  conn         DBコネクション
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	 */
	public Common(IDbConnection conn, String userCd,
			String businessCd, String plantCd, String companyCd) throws
			FoundationException {
		this.conn = conn;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;
		this.companyCd = companyCd;
		this.readProperty();
	}

    /**
     * 販売管理初期処理  <BR>
     *
     * @param 　
     * @param  
     * @return 取得結果を格納したリスト (: :エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List InitSalesProcFd() throws FoundationException {
                
        //引数チェック
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = INITSALESPROCFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode);       // LOGモード
            adapt.setString(2, this.outPutMode);    // 出力モード
            adapt.setString(3, this.outPutPath);    // 出力ファイルパス
            adapt.setString(4, this.outPutName);    // 出力ファイル名
            adapt.setString(5, this.userCd);        // ユーザID
            adapt.setString(6, this.businessCd);    // 業務名
            adapt.setString(7, this.plantCd);       // 工場コード
            adapt.setOutString(5);                  // 処理結果（ユーザID)
            adapt.setOutString(8);                  // 処理結果（会社コード)
            adapt.setOutString(9);                  // 処理結果（販売管理用工場コード)
            adapt.setOutString(10);                 // 処理結果（部門コード)
            adapt.setOutString(11);                 // 処理結果（部門名)
            adapt.setOutString(12);                 // 処理結果（ユーザ名)
            adapt.setOutString(13);                 // 処理結果（業務運用日)
            adapt.setOutString(14);                 // 処理結果（邦貨コード)
            adapt.setOutString(15);                 // 処理結果（エラーコード)
            adapt.setOutInteger(16);                // 処理結果（結果ステータス）

            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(16);
            if(adapt.getOutString(5) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
            }else{
                resultList.add(adapt.getOutString(5));  
            }
             
            //処理結果の格納
            for(int i =8 ; i< 17 ; i++)
            if(adapt.getOutString(i) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
            }else{
                resultList.add(adapt.getOutString(i)); 
            }
            
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    
    /**
     * 売掛IF処理処理  <BR>
     *
     * @param  procDiv      処理区分(1:出荷実績/出荷返品、2:受領・売上/受領・売上(返品)、3:その他売上
     * @param  updDiv       更新区分(1:登録、2:取消、3:修正)
     * @param  SlipCd       伝票番号(出荷納品伝票番号、出荷納品・その他売上伝票番号)
     * @return 取得結果を格納したリスト (: :エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
     * @throws FoundationException DB検索時になんらかのエラーが発生した場合
     */
    public List excArfIFFd(int procDiv, int updDiv, String SlipCd, String taxCd) throws FoundationException {
                
        //引数チェック
        if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
            outPutMode == null || outPutPath == null || outPutName == null) {
            return null;
        }
        this.collectKey = EXCARFIFFD;
        
        this.resultStatus = null;
        this. resultList = new ArrayList();
            
        IDbAdapter adapt = null;

        try {
            adapt =this.getAdapt(conn);
            adapt.setString(1, this.logMode);       // LOGモード
            adapt.setString(2, this.outPutMode);    // 出力モード
            adapt.setString(3, this.outPutPath);    // 出力ファイルパス
            adapt.setString(4, this.outPutName);    // 出力ファイル名
            adapt.setString(5, this.userCd);        // ユーザID
            adapt.setString(6, this.businessCd);    // 業務名
            adapt.setString(7, this.plantCd);       // 工場コード
            adapt.setString(8, SlipCd);             // 伝票番号
            adapt.setInt(9, procDiv);               // 処理区分
            adapt.setInt(10,updDiv);                // 更新区分
            adapt.setOutString(11);                 // 処理結果（エラーコード)
            adapt.setOutInteger(12);                // 処理結果（結果ステータス）
            adapt.setString(13,taxCd);                // 消費税コード

            adapt.execUpdate();

            //結果ステータスの格納
            this.resultStatus = adapt.getOutInteger(12);
            if(adapt.getOutString(11) == null){
                resultList.add("");    //処理結果がNULLであった場合空白をセット
            }else{
                resultList.add(adapt.getOutString(11)); 
            }
        }
        finally {
            if (adapt != null) {
                adapt.close();
                adapt = null;
            }
        }
        return resultList;
    }
    

	/**
	 * 会社コード取得
	 *
	 * @param  plantCd 工場コード
	 * @return String 会社コード
	 */
	public String getScmCompanyCd(String plantCd) throws FoundationException {

		//引数チェック
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}

		this.collectKey = GETSCMCOMPANYCD;

		this.resultStatus = null;
		this.resultList = new ArrayList();

		IDbAdapter adapt = null;

		String companyCd = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode);		//LOGモード
			adapt.setString(2, this.outPutMode);	//出力モード
			adapt.setString(3, this.outPutPath);	//出力ファイルパス
			adapt.setString(4, this.outPutName);	//出力ファイル名
			adapt.setString(5, this.userCd);		//ユーザID
			adapt.setString(6, this.businessCd);	//業務名
			adapt.setString(7, this.plantCd);		//工場コード
			adapt.setOutString(8);					// 処理結果(会社コード)

			adapt.execUpdate();

			// 処理結果の反映
			companyCd = adapt.getOutString(8);

		} finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return companyCd;
	}
	
	
	
	/**
	 * 採番した番号を返却します。（SP部品使用）
	 *
	 * @return	採番された番号を返却します。採番されなかった場合は、null を返却します。
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public String getNo() throws FoundationException {
		//引数チェック
		if (this.userCd == null ||
			this.businessCd == null || this.plantCd == null || 
			this.companyCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}
		this.collectKey = SALES_SEQ_NO;
		this.resultStatus = null;
		String returnNo = null;

		IDbAdapter adapt = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode);    //LOGモード
			adapt.setString(2, this.outPutMode); //出力モード
			adapt.setString(3, this.outPutPath); //出力ファイルパス
			adapt.setString(4, this.outPutName); //出力ファイル名
			adapt.setString(5, this.userCd);     //ユーザID
			adapt.setString(6, this.businessCd); //業務名
			adapt.setString(7, this.plantCd);    //工場コード
			adapt.setString(8, this.companyCd);  //会社コード
			adapt.setOutString(9);               //採番結果
			adapt.setOutInteger(10);              //採番番号

			adapt.execUpdate();

			returnNo = adapt.getOutString(9);
			this.resultStatus = adapt.getOutInteger(10);

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
	 * 採番した番号を返却します。（SP部品使用）
	 *
	 * @return	採番された番号を返却します。採番されなかった場合は、null を返却します。
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public String getSCM_SLIP_CD() throws FoundationException {
		//引数チェック
		if (this.userCd == null ||
			this.businessCd == null || this.plantCd == null || 
			this.companyCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}

		this.collectKey = SCM_SLIP_CD;
		this.resultStatus = null;
		String returnNo = null;

		IDbAdapter adapt = null;

		try {
			adapt = this.getAdapt(conn);
			adapt.setString(1, this.logMode);    //LOGモード
			adapt.setString(2, this.outPutMode); //出力モード
			adapt.setString(3, this.outPutPath); //出力ファイルパス
			adapt.setString(4, this.outPutName); //出力ファイル名
			adapt.setString(5, this.userCd);     //ユーザID
			adapt.setString(6, this.businessCd); //業務名
			adapt.setString(7, this.plantCd);    //工場コード
			adapt.setString(8, this.companyCd);  //会社コード
			adapt.setOutString(9);               //採番結果
			adapt.setOutInteger(10);              //採番番号

			adapt.execUpdate();

			returnNo = adapt.getOutString(9);
			this.resultStatus = adapt.getOutInteger(10);

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
	 * 採番した番号を返却します。（SP部品使用）
	 *
	 * @return	採番された番号を返却します。採番されなかった場合は、null を返却します。
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public String getSLIP_CD() throws FoundationException {
		//引数チェック
		if (this.userCd == null ||
			this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}

		this.collectKey = SLIP_CD;
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
	 * 消費税計算  <BR>
	 *
	 * @param  taxCd  消費税コード
	 * @param  newTaxRateStDate  新消費税率判定日
	 * @param  decimalFlg  小数桁数
	 * @param  amountIn  金額
	 * @return 取得結果を格納したリスト (1:税率1 2:税率2 3:税率3 4:税額1 5:税額2 6:税額3 7:税抜金額 8:消費税金額 9:税込金額 10:外税対象金額 11:内税対象金額 12:非課税対象金額 13:消費税額（外税） 14:消費税額（内税） 15:端数区分 16:エラーコード *例外：エラー等で未取得の場合サイズ０のリスト)
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public List calcTaxFd(String taxCd,String newTaxRateStDate,String decimalFlg,String amountIn) throws FoundationException {
				
		//引数チェック
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}
		this.collectKey = CALCTAXFD;
		
		this.resultStatus = null;
		this.resultList = new ArrayList();

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
			adapt.setString(8, taxCd); //消費税コード
			adapt.setString(9, newTaxRateStDate); //新消費税率判定日
			adapt.setString(10, decimalFlg); //小数桁数
			adapt.setString(11, amountIn); //金額
			adapt.setOutString(12); //処理結果（税率1)
			adapt.setOutString(13); //処理結果（税率2)
			adapt.setOutString(14); //処理結果（税率3)
			adapt.setOutString(15); //処理結果（税額1)
			adapt.setOutString(16); //処理結果（税額2)
			adapt.setOutString(17); //処理結果（税額3)
			adapt.setOutString(18); //処理結果（税抜金額)
			adapt.setOutString(19); //処理結果（消費税金額)
			adapt.setOutString(20); //処理結果（税込金額)
			adapt.setOutString(21); //処理結果（外税対象金額)
			adapt.setOutString(22); //処理結果（内税対象金額)
			adapt.setOutString(23); //処理結果（非課税対象金額)
			adapt.setOutString(24); //処理結果（消費税額（外税）)
			adapt.setOutString(25); //処理結果（消費税額（内税）)
			adapt.setOutString(26); //処理結果（端数区分)
			adapt.setOutString(27); //処理結果（エラーコード)
			adapt.setOutInteger(28); //処理結果（結果ステータス）

			adapt.execUpdate();
			
			//結果ステータスの格納
			this.resultStatus = adapt.getOutInteger(28);
			
			//処理結果の格納
			
			for(int i =12 ; i< 28 ; i++)
			if(adapt.getOutString(i) == null){
				resultList.add("");    //処理結果がNULLであった場合空白をセット
			}else{
					resultList.add(adapt.getOutString(i)); 
			}
		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return resultList;
	}
	
	
	/**
	 * 売上計上判定処理  <BR>
	 *
	 * @param  slipCd  伝票番号
	 * @return 判定結果(true、false)
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public boolean excSalesCheck(String slipCd) throws FoundationException {
				
		//引数チェック
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return false;
		}
		this.collectKey = EXCSALESCHECK;
		
		this.resultStatus = null;
		this. resultchk = 0;
		
		IDbAdapter adapt = null;

		try {
			adapt =this.getAdapt(conn);
			adapt.setString(1, this.logMode); //LOGモード
			adapt.setString(2, this.outPutMode); //出力モード
			adapt.setString(3, this.outPutPath); //出力ファイルパス
			adapt.setString(4, this.outPutName); //出力ファイル名
			adapt.setString(5, this.userCd); //ユーザID
			adapt.setString(6, this.businessCd); //業務名
			adapt.setString(7, this.plantCd); //工場コード
			adapt.setString(8, slipCd); //伝票番号
			adapt.setOutString(9); //処理結果（判定結果)
			adapt.setOutInteger(10); //処理結果（結果ステータス）

			adapt.execUpdate();

			//チェック結果の格納
			resultchk = adapt.getOutInteger(9).intValue(); 
			//結果ステータスの格納
			this.resultStatus = adapt.getOutInteger(10);
			
		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		
		if(resultchk == 1){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	/**
	 * 売上計上処理  <BR>
	 *
	 * @param  slipCd  伝票番号
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public void excSalesConf(String slipCd, int collectKey) throws FoundationException {
				
		//引数チェック
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return ;
		}
		this.collectKey = collectKey;
		
		this.resultStatus = null;
		
		IDbAdapter adapt = null;

		try {
			adapt =this.getAdapt(conn);
			adapt.setString(1, this.logMode); //LOGモード
			adapt.setString(2, this.outPutMode); //出力モード
			adapt.setString(3, this.outPutPath); //出力ファイルパス
			adapt.setString(4, this.outPutName); //出力ファイル名
			adapt.setString(5, this.userCd); //ユーザID
			adapt.setString(6, this.businessCd); //業務名
			adapt.setString(7, this.plantCd); //工場コード
			adapt.setString(8, slipCd); //伝票番号
			adapt.setOutInteger(9); //処理結果（結果ステータス）

			adapt.execUpdate();

			//結果ステータスの格納
			this.resultStatus = adapt.getOutInteger(9);
			
		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return;
	}
	

	/**
	 * 販売単価取得  <BR>
	 *
	 * @param  companyCd  会社コード
	 * @param  custCd  得意先コード
	 * @param  itemCd  品目番号
	 * @param  purposeunitpriceTyp  用途別単価区分
	 * @param  dlvDate  日付
	 * @param  Qty  数量
	 * @return 取得結果を格納したリスト (1:単価 2:単位区分 3:金額 *例外：エラー等で未取得の場合サイズ０のリスト)
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public List getSalesUnitCost(String companyCd,String custCd,String itemCd,String purposeunitpriceTyp,
		String dlvDate,String Qty) throws FoundationException {
				
		//引数チェック
		if ( this.userCd == null || this.businessCd == null || this.plantCd == null || logMode == null ||
			outPutMode == null || outPutPath == null || outPutName == null) {
			return null;
		}
		this.collectKey = GETSALESUNITCOST;
		
		this.resultStatus = null;
		this.resultList = new ArrayList();

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
			adapt.setString(8, companyCd); //会社コード
			adapt.setString(9, custCd); //得意先コード
			adapt.setString(10, itemCd); //品目番号
			adapt.setString(11, purposeunitpriceTyp); //用途別単価区分
			adapt.setString(12, dlvDate); //日付
			adapt.setString(13, Qty); //数量
			adapt.setOutString(14); //処理結果（単価)
			adapt.setOutString(15); //処理結果（単位区分)
			adapt.setOutString(16); //処理結果（金額)
			adapt.setOutInteger(17); //処理結果（結果ステータス）

			adapt.execUpdate();

			//結果ステータスの格納
			this.resultStatus = adapt.getOutInteger(17);
			
			//結果ステータスが正常終了の場合、処理結果の格納
			if(this.resultStatus.intValue() == 1){
				for(int i =14 ; i< 17 ; i++)
				if(adapt.getOutString(i) == null){
					resultList.add("");    //処理結果がNULLであった場合空白をセット
				}else{
					resultList.add(adapt.getOutString(i)); 
				}
			}
		}
		finally {
			if (adapt != null) {
				adapt.close();
				adapt = null;
			}
		}
		return resultList;
	}
	
	
    
    /*********************************************************************
     *** プライベート関数
     *********************************************************************/
    
    /**
     * IDbAdapterの返却
     *
     * @param  conn IDbConnection
     * @return  collectKeyによりIDbAdapterを取得
     * @throws FoundationException
     */
    private IDbAdapter getAdapt(IDbConnection conn) throws FoundationException {

        //collectKeyによりSP部品の呼び出しを切り分ける
        switch (this.collectKey) {
            case INITSALESPROCFD:          // 販売管理初期処理
                return conn.getSpAdapter("begin SQLINITSALESPROCFD(?,?,?,?,?,?,?,?,?,?," +
                                                                        "?,?,?,?,?,?); end;");

            case EXCARFIFFD:          // 売掛IF処理
                return conn.getSpAdapter("begin SQLEXCARFIFFD(?,?,?,?,?,?,?,?,?,?," +
                                                                        "?,?,?); end;");
            case GETSCMCOMPANYCD:
            	return conn.getSpAdapter("begin SQLGETSCMCOMPANY(?,?,?,?,?,?,?,?); end;");
			
            case SALES_SEQ_NO:      //売上実績管理番号
				return conn.getSpAdapter("begin SQLGETNEWSALESSEQNO(?,?,?,?,?,?,?,?,?,?); end;");
				
			case SCM_SLIP_CD:       //伝票番号（ＳＣＭ）
				return conn.getSpAdapter("begin SQLGETNEWSCMSLIPCD(?,?,?,?,?,?,?,?,?,?); end;");
			
			case SLIP_CD:       //伝票番号（ＳＣＭ）
				return conn.getSpAdapter("begin SQLGETNEWSLIPCD(?,?,?,?,?,?,?,?,?); end;");
                
			case CALCTAXFD://消費税計算
    			return conn.getSpAdapter("begin SQLCALCTAXFD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
    			
			case EXCSALESCHECK://売上計上判定処理
			    return conn.getSpAdapter("begin SQLEXCSALESCHECK(?,?,?,?,?,?,?,?,?,?); end;");

			case EXCSALESCONF://売上計上処理
			    return conn.getSpAdapter("begin SQLEXCSALESCONF(?,?,?,?,?,?,?,?,?); end;");

			case EXCSALESCONFSCM://売上計上処理
			    return conn.getSpAdapter("begin SQLEXCSALESCONFSCM(?,?,?,?,?,?,?,?,?); end;");

			case GETSALESUNITCOST://販売単価取得
			    return conn.getSpAdapter("begin SQLGETSALESUNITCOST(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
				
            default:
                throw new FoundationException("default", "getAdapt", "定義外のエラーが発生しました。");
        }
    }

    /**
     * プロパティファイルからのLOG出力情報取得
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
                mre.getMessage(), "プロパティファイルの読み込みに失敗しました。");
            fe.setPreviousException(mre);
            throw fe;
        }
    }




    
   /*********************************************************************
    *** 共通返却値
    *********************************************************************/
   
    /**
     * 処理結果ステータスの取得
     * @return  処理結果のステータスを取得(実行前、もしくはエラーで実行できなかった場合はnullを返却する）
     */
    public Integer getResultStatus() {
        return this.resultStatus;
    }
    
}
