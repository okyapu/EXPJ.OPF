/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/arap/ArApNumbering.java,v $
 * 
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 * 
 */
package com.nec.jp.orteus.expj.arap;

import com.nec.jp.orteus.expj.util.SystemConfig;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * <pre>
 * 買掛売掛伝票の伝票番号採番を行うクラスです
 * 伝票コントロールテーブルに登録してある伝票種類についてのみ、
 * 伝票番号採番をおこなうことができます
 * ストアドプロシジャ部品(SqlGetSlipCd4ARAP.sql)を利用しています。</pre>
 * <ul type=disc>機能説明  :
 * <li><pre>(1)処理種類＝１でかつ自動採番の場合、引数条件をもとに
 *        伝票番号を採番し､伝票採番コントロールマスタの最終伝票番号を更新する｡
 *        → 伝票採番コントロールマスタが存在する場合は最終伝票番号を更新し､
 *           存在しない場合はレコードを追加する｡</pre>
 *
 * <li><pre>(2)処理種類＝０、または処理種類＝１でかつ手動採番の場合、引数条件を
 *        もとに伝票番号以外の項目を通知し､伝票採番コントロールマスタの
 *        最終伝票番号の更新は行わない｡(現在、未サポート)</pre>
 * </ul>
 * 
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.2 $ $Date: 2014/11/20 01:12:36 $
 *
 */
public class ArApNumbering {
	
	private IDbConnection _conn = null;
	private String _userCd = null;       // ユーザコード
	private String _businessCd = null;   // 業務コード
	private String _plantCd = null;      // 工場コード
	private String _companyCd = null;    // 会社コード
	private String _actionTyp = null;    // 処理種類
	private String _slipTyp = null;      // 伝票種類
	private String _slipDate  = null;    // 伝票日付
	private String _logMode = null;      // LOGモード
	private String _outPutMode = null;   // 出力モード
	private String _outPutPath = null;   // 出力ファイルパス
	private String _outPutName = null;   // 出力ファイル名
	private String _gdate = null;        // 年月度
	private String _numberingcd = null;  // 採番コード
	private String _slipcd = null;       // 最終伝票番号
	private String _term = null;         // 基数
	private Integer _resultStatus = null;// 結果ステータス
	 
	
	/**
	 * コンストラクタ
	 * @param  iConn         DBコネクション
	 * @param  iUserCd       ユーザコード
	 * @param  iBusinessCd   業務コード
	 * @param  iPlantCd      工場コード
	 * @param  iCompanyCd    会社コード
	 * @param  iActionTyp    処理種類
	 * @param  iSlipTyp      伝票種類
	 * @param  iSlipDate     伝票日付
	*/
	public ArApNumbering(IDbConnection iConn,
	                      String iUserCd,
	                      String iBusinessCd,
	                      String iPlantCd,
	                      String iCompanyCd,
	                      String iActionTyp,
	                      String iSlipTyp,
	                      String iSlipDate)
			throws FoundationException {

		_conn = iConn;
		_userCd = iUserCd;
		_businessCd = iBusinessCd;
		_plantCd = iPlantCd;
		_companyCd = iCompanyCd;
		_actionTyp = iActionTyp;
		_slipTyp = iSlipTyp;
		_slipDate = iSlipDate;

		this.readProperty();
	}
	
	/**
	 * 採番した番号を返却します。<br>
	 * (SP部品 SqlGetSlipCd4ARAP.sql 使用）
	 *
	 * @return	採番された番号を返却します。採番されなかった場合は、null を返却します。
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public String getSlipCd()
			throws FoundationException {
		//引数チェック
		if (_userCd == null     ||
		    _businessCd == null ||
		    _plantCd == null    ||
		    _actionTyp == null  ||
		    _slipTyp == null    ||
		    _slipDate == null   ||
		    _companyCd == null  ||
		    _logMode == null    ||
		    _outPutMode == null ||
		    _outPutPath == null ||
		    _outPutName == null)  {
				return null;
		}

		_resultStatus = null;
		_slipcd = null;
		IDbAdapter adapt = null;
		
		try{
			adapt = _conn.getSpAdapter("begin SQLGETSLIPCD4ARAP(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); end;");
			adapt.setString(1,_logMode);     // LOGモード
			adapt.setString(2,_outPutMode);  // 出力モード
			adapt.setString(3,_outPutPath);  // 出力ファイルパス
			adapt.setString(4,_outPutName);  // 出力ファイル名
			adapt.setString(5,_userCd);      // ユーザID
			adapt.setString(6,_businessCd);  // 業務名
			adapt.setString(7,_plantCd);     // 工場コード
			adapt.setString(8,_companyCd);   // 会社コード
			adapt.setString(9,_actionTyp);   // 処理種類
			adapt.setString(10,_slipTyp);    // 伝票種類
			adapt.setString(11,_slipDate);   // 伝票日付
			adapt.setOutString(12);          // 年月度
			adapt.setOutString(13);          // 採番コード
			adapt.setOutString(14);          // 最終伝票番号
			adapt.setOutString(15);          // 期数
			adapt.setOutInteger(16);         // ステータス

			adapt.execUpdate();

			_gdate = adapt.getOutString(12);
			_numberingcd = adapt.getOutString(13);
			_slipcd = adapt.getOutString(14);
			_term = adapt.getOutString(15);
			_resultStatus = adapt.getOutInteger(16);

		}finally{
			if (adapt != null){
				adapt.close();
				adapt = null;
			}
		}
		return _slipcd;
	}
	
	
	/**
	 * LOG出力情報をプロパティファイルから読み込みます
	*/
	private void readProperty()
			throws FoundationException {
		try{
			ResourceBundle rb = SystemConfig.getBundle();
			_logMode = SystemConfig.getProperty("LOG_MODE",rb);
			_outPutMode = SystemConfig.getProperty("OUTPUT_MODE",rb);
			_outPutPath = SystemConfig.getProperty("OUTPUT_PATH",rb);
			_outPutName = SystemConfig.getProperty("OUTPUT_NAME",rb);
		}catch(MissingResourceException mre){
			FoundationException fe = new FoundationException(
                                        "ArApNumbering",mre.getMessage(),
                                        "Can Not Open PropertyFile(SystemConfig)");
			fe.setPreviousException(mre);
			throw fe;
		}
	}

	/**
	 * 処理結果を取得します
	 * @return	採番結果のステータスを取得
	 */
	public Integer getResultStatus() {
		return _resultStatus;
	}	
}