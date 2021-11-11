/**
 *(#)ScreenParam.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author S.Takahashi
 * Date : 2003/08/20
 * @version 1.00
 * History 2003/08/20 新規作成 S.Takahashi
 *         2003/09/09 T.Taniguchi
 *                    ・getProcIdメソッド追加
 *                    ・getLogIdメソッド追加
 *                    ・getMaxLineメソッドの識別をパッケージ単位ではなく、処理ID単位に変更
 */
package com.nec.jp.orteus.metamorBase.common.util;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.nec.jp.orteus.xaf.util.FoundationException;

/**
 * 画面共通定義取得クラス
 */
public class ScreenParam{
	/**
	 * 全て含む
	*/
	static public final int ALL = 0;
	/**
	 * 省略する
	*/
	static public final int SHORT = ALL + 1;

	static protected final int MAX = SHORT;
	protected Class targetClass = null;


	/**
	 * コンストラクタ
	 * @param   targetClass クラス
	 */
	public ScreenParam(Class targetClass) throws FoundationException{
		if(targetClass == null){
			throw new FoundationException("ScreenParam","コンストラクタ","(SBM0865)引数が不正です。");
		}
		this.targetClass = targetClass;
	}


	/**
	 * パッケージ名を取得する。
	 * @param   format ALLの場合：パッケージ名全て、SHORTの場合：パッケージ最下名
	 * @return  パッケージ名
	 */
	public String getPackageName(int format){
		if(this.targetClass == null || format > MAX) return null;

		String packageName = this.targetClass.getPackage().getName();
		if(format == this.ALL){
			return packageName;
		}

		int index = packageName.lastIndexOf(".");
		if(index == -1){
			return packageName;
		}

		return packageName.substring(index + 1);
	}


	/**
	 * クラス名を取得する。
	 * @param   format ALLの場合：パッケージ名含む、SHORTの場合：クラス名
	 * @return  パッケージ名
	 */
	public String getClassName(int format){
		if(this.targetClass == null) return null;

		String className = this.targetClass.getName();
		if(format == this.ALL){
			return className;
		}

		int index = className.lastIndexOf(".");
		if(index == -1){
			return className;
		}

		return className.substring(index + 1);
	}


	/**
	 * 処理IDを取得する。
	 * @param   無し
	 * @return  処理ID
	 */
	public String getProcId(){
		if(this.targetClass == null) return null;

		String procId = this.getClassName(this.SHORT);
		int index = procId.indexOf("Control");
		if(index == -1){
			return procId;
		}
		return procId.substring(0, index);
	}


	/**
	 * ログIDを取得する。
	 * @param   無し
	 * @return  ログID
	 */
	public String getLogId(){
		if(this.targetClass == null) return null;

		String logId = this.getPackageName(this.ALL);
		int index = logId.lastIndexOf(".");
		if(index == -1){
			return this.getProcId();
		}
		return logId.substring(0, index + 1) + this.getProcId();
	}


	/**
	 * 画面最大表示行数を取得する。
	 * @param   idbConn idbConnection
	 * @param   key 同一パッケージでの識別キー
	 * @return		 画面最大表示行数（DBに定義されていない場合0を返却）
	 * @throws FoundationException
	 */
	public int getMaxLine(IDbConnection idbConn,int key) throws FoundationException{
		String packageName = this.getProcId();
		if(idbConn == null || packageName == null){
			throw new FoundationException("ScreenParam","getMaxLine","(SBM0865)引数が不正です。");
		}

		String query = "select MAX_DISPLAY_ROWNUM from SYS_SCREEN_PARM where ";
		query = query + "SERVLET_CD=? and ";
		query = query + "DISPLAY_CD=?";

		IDbAdapter adapt = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			Connection conn = idbConn.getConn();
			stmt = conn.prepareStatement(query);
			stmt.setString(1,packageName);
			stmt.setInt(2,key);
			rs = stmt.executeQuery();
			if(!rs.next()){
				return 0;
			}

			return rs.getInt("MAX_DISPLAY_ROWNUM");

		}catch(SQLException se){
			FoundationException fe = new FoundationException("ScreenParam","getMaxLine","(SBM0871)レコード検索に失敗しました。");
			fe.setPreviousException(se);
			throw fe;
		}finally{
			try{
				if(rs != null){
					rs.close();
					rs = null;
				}
				if(stmt != null){
					stmt.close();
					stmt = null;
				}
			}catch(Exception e){}
		}
	}

}
