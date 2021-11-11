/**
 *(#)CollectNumber.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author S.Takahashi
 * Date : 2003/07/29
 * @version 1.00
 * History 2003/07/29 新規作成 S.Takahashi
 * @version 1.01
 * History 2003/08/01 パッケージ名の変更 S.Takahashi
 * @version 1.02
 * History 2003/08/06 S.Takahashi
 * ・作業計画番号、作業指示番号、発注番号、出庫指示番号、入出庫番号、出来高実績番号の採番処理を追加。
 * ・負荷識別番号、計画識別番号、有償支給番号、積送伝票番号の採番処理を追加
 * ・製番の番号体系チェックメソッドの追加(checkNumber,checkJOB_OD_CD）
 * @version 1.02
 * History 2003/08/06 S.Takahashi
 * ・製番の番号体系チェック方式変更。(prefix + 工場コード + 連番)
 * ・工場コードが1桁の場合、工場コードの前に"_"を付加する
 * ・製番の番号体系チェックメソッド（引数に製番のみ）追加。(checkNumber,checkJOB_OD_CD)
 * ・製番、LOG識別番号の採番処理を追加
 * @version 1.03
 * History 2003/08/10 K.Murakami
 * ・負荷識別番号、計画識別番号の採番処理名を変更、負荷構成区別キー、LOG識別番号の採番処理を追加。
 * @version 1.04
 * History 2003/08/13 T.Taniguchi
 * ・使用するコネクションを外部より指定する形式に変更。
 * @version 1.05
 * History 2003/08/16 実態をNumberingとし、その拡張として再作成 T.Taniguchi
 */
package com.nec.jp.orteus.metamorBase.common.CollectNumber;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.metamorBase.util.SystemLog.SystemLog;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.xaf.util.FoundationException;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 採番を行うクラス
 */
public class CollectNumber extends Numbering {


	/**
	 * コンストラクタ
	 *
	 * @param  collectKey   採番キー
	 * @param  userCd       ユーザコード
	 * @param  businessCd   業務コード
	 * @param  plantCd      工場コード
	*/
	public CollectNumber(int collectKey,String userCd,String businessCd,String plantCd) throws FoundationException{
		super(null,collectKey,userCd,businessCd,plantCd);
		this.collectKey = collectKey;
		this.userCd = userCd;
		this.businessCd = businessCd;
		this.plantCd = plantCd;

		this.readProperty();
	}


	/**
	 * 採番した番号を返却する。（SP部品使用）
	 *
	 * @return         採番された番号を返却、採番されなかった場合nullを返却
	 * @throws FoundationException DB検索時になんらかのエラーが発生した場合
	 */
	public String getNo() throws FoundationException{
		String returnNo = null;
		//引数チェック
		if(collectKey < 1 || collectKey > this.MAX || this.userCd == null || 
			this.businessCd == null || this.plantCd == null || logMode == null || 
			outPutMode == null || outPutPath == null || outPutName == null){
			return null;
		}

		this.resultStatus = null;
		IDbConnection conn = null;
		try{
			conn = CoreTools.getTransConnection();
			Numbering MyNo = new Numbering(conn,collectKey,userCd,businessCd,plantCd);
			returnNo = MyNo.getNo();
			this.resultStatus =MyNo.getResultStatus();
			MyNo = null;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
			}
		}

		return returnNo;
	}


	/**
	 * LOG出力情報をプロパティファイルから読み込む
	*/
	private void readProperty() throws FoundationException{
		try{
			ResourceBundle rb = SystemConfig.getBundle();
			this.logMode = SystemConfig.getProperty("LOG_MODE",rb);
			this.outPutMode = SystemConfig.getProperty("OUTPUT_MODE",rb);
			this.outPutPath = SystemConfig.getProperty("OUTPUT_PATH",rb);
			this.outPutName = SystemConfig.getProperty("OUTPUT_NAME",rb);
		}catch(MissingResourceException mre){
			FoundationException fe = new FoundationException("CollectNumber",mre.getMessage(),"(SBM0854)プロパティファイルの読み込みに失敗しました。");
			fe.setPreviousException(mre);
			throw fe;
		}
	}


	/**
	 * 処理結果を取得する
	 * @return         採番結果のステータスを取得
	 */
	public Integer getResultStatus(){
		return this.resultStatus;
	}


	/**
	 * 採番体系をチェックする（現状は製番のみ対応）
	 *
	 * @param  collectKey   採番キー
	 * @param  plantCd      工場コード
	 * @param  number       チェック対象番号
	 * @return         チェックOKならばtrue、NGならばfalse
	 * @throws FoundationException
	 */
	public static boolean checkNumber(int collectKey,String plantCd,String number) throws FoundationException{

		IDbConnection conn = null;
		boolean flag = false;
		try{
			conn = CoreTools.getTransConnection();
			Numbering MyNo = new Numbering(conn,(int)0,(String)"",(String)"",(String)"");
			flag = MyNo.checkNumber(conn,collectKey,plantCd,number);
			MyNo = null;
		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
			}
		}
		return true;
	}


	/**
	 * 製番体系をチェックする
	 *
	 * @param  plantCd      工場コード
	 * @param  number       製番
	 * @return         チェックOKならばtrue、NGならばfalse
	 * @throws FoundationException,SQLException
	 */
	public static boolean checkJOB_OD_CD(String plantCd,String number) throws FoundationException,SQLException{

		IDbConnection conn = null;
		boolean flag = false;
		try{
			conn = CoreTools.getTransConnection();
			Numbering MyNo = new Numbering(conn,(int)0,(String)"",(String)"",(String)"");
			flag = MyNo.checkJOB_OD_CD(conn,plantCd,number);
			MyNo = null;
		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
			}
		}
		return flag;
	} 


	/**
	 * 採番体系をチェックする（現状は製番のみ対応）
	 *
	 * @param  collectKey   採番キー
	 * @param  number       チェック対象番号
	 * @return         チェックOKならばtrue、NGならばfalse
	 * @throws FoundationException
	 */
	public static boolean checkNumber(int collectKey,String number) throws FoundationException{
		IDbConnection conn = null;
		boolean flag = false;
		try{
			conn = CoreTools.getTransConnection();
			Numbering MyNo = new Numbering(conn,(int)0,(String)"",(String)"",(String)"");
			flag = MyNo.checkNumber(conn,collectKey,number);
			MyNo = null;
		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
			}
		}
		return flag;
	} 


	/**
	 * 製番体系をチェックする
	 *
	 * @param  number       製番
	 * @return         チェックOKならばtrue、NGならばfalse
	 * @throws FoundationException,SQLException
	 */
	public static boolean checkJOB_OD_CD(String number) throws FoundationException,SQLException{
		IDbConnection conn = null;
		boolean flag = false;
		try{
			conn = CoreTools.getTransConnection();
			Numbering MyNo = new Numbering(conn,(int)0,(String)"",(String)"",(String)"");
			flag = MyNo.checkJOB_OD_CD(conn,number);
			MyNo = null;
		}
		catch(FoundationException e) {
			throw e;
		}finally{
			if(conn != null){
				CoreTools.closeTransConnection(conn);
				conn = null;
			}
		}
		return flag;
	} 
}

