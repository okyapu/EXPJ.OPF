/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/mstappr/MstControlApprIF.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.expj.mstappr;

import java.sql.SQLException;
import java.util.List;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.MessageStruct;

/**
 * <pre>
 * マスタ承認インタフェース
 * </pre>
 * @author $Author: xing-qy $
 * @version $Revision: 1.2 $ $Date: 2008/10/23 05:36:53 $
 *
 **/
public abstract interface MstControlApprIF {
	
	/**
	 * メッセージストラクト作成
	 */
	public abstract void createMsgStruct();
	
	/**
	 * システムログ
	 * @param systemLog
	 */
	public abstract void setSysLog(SystemLog systemLog);
	
	/** 
	 * システム使用のユーザコード
	 * @param sysUSER_CD
	 */
	public abstract void setsysUSER_CD(String sysUSER_CD);
	
	/**
	 * DB接続処理
	 * @param conn
	 */
	public abstract void setConn(IDbConnection conn);
	
	/**
	 * リストのセット
	 * @param list
	 */
	public abstract void setList(List list);
	
	/**
	 * Structのセット
	 * @param struct
	 */
	public abstract void setStruct(MstStructApprIF struct);
	
	/**
	 * メッセージストラクト取得
	 * @param struct
	 */
	public abstract MessageStruct getMsgStruct();
	
	/**
	 * 登録チェック
	 * @return true , false
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public abstract boolean insertCheck()throws SQLException,FoundationException;
	
	/**
	 * 更新チェック
	 * @return true , false
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public abstract boolean updateCheck()throws SQLException,FoundationException;
	
	/**
	 * 削除チェック
	 * @return true , false
	 * @throws SQLException
	 * @throws FoundationException
	 */
	public abstract boolean deleteCheck()throws SQLException,FoundationException;
	
	/**
	 * 出荷管理先区分のセット（KA1040用）
	 * @param shipCtlTyp
	 */
	public abstract void set_shipCtlTyp(String shipCtlTyp);
}
