/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/LeftGet.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import javax.servlet.http.HttpSession;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.xaf.foundation.IDbRecordset;
import com.nec.jp.orteus.util.CoreTools;

/**
 * 左フレームのモデルクラス(EXPLANNER/J(expj)用補助)
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:12 $
*/

public class LeftGet {

	private HttpSession so;
	private String myName = null;
	private String myPlantCd = null;
	private String myPlantName = null;

	/**
	 * コンストラクタ<BR>
	 * ユーザ名取得処理実行
	 * @param so セッションオブジェクト
	 */
	public LeftGet(HttpSession so) {
		this.so = so;

		try{
			String query = "SELECT USER_MST.USER_NAME" +
						   " FROM USER_MST" +
						   " WHERE USER_MST.USER_CD='"+ (String)so.getAttribute("UserId") + "'";

			IDbConnection conn = CoreTools.getDefaultConnection();
			IDbAdapter adapt = conn.getAdapter(query); // アダプタの取得
			IDbRecordset rs = adapt.execQuery(true); // クエリの実行

			if (rs.next()) {
				myName = rs.getString(1);
			} else {
				myName = "";
			}

			rs.close();
			adapt.close();
			CoreTools.closeDefaultConnection(conn);
			rs = null;
			adapt = null;
			conn = null;

		}catch(Exception e){
				myPlantCd = "";
				myPlantName = "";
		}
	}

	/**
	 * 自分のユーザ名を取得します。
	 * @return ユーザ名
	 */
	public String getMyName(){
		return myName;
	}

	/**
	 * 自分の所属する工場コードを取得します。
	 * @return 工場コード
	 */
	public String getPlantCd(){
		return myPlantCd;
	}

	/**
	 * 自分の所属する工場名を取得します。
	 * @return 工場名
	 */
	public String getPlantName(){
		return myPlantName;
	}

	/**
	 * ユーザコードをキーとして、自分が所属する工場コードと工場名を取得します。<br>
	 * 取得できなかった場合は、工場コードと工場名を空文字とします。
	 *
	 * @param user_cd ユーザコード
	 */
	public void makePlantData(String user_cd) {
		try{
			String query = "SELECT " +
							"USER_MST.PLANT_CD," +
							"M_PLANT.PLANT_NAME" +
							" FROM " +
							"USER_MST," +
							"M_PLANT" +
							" WHERE " +
							"USER_MST.PLANT_CD = M_PLANT.PLANT_CD (+) AND " +
							"USER_MST.USER_CD='"+ user_cd + "' ";

			IDbConnection conn = CoreTools.getDefaultConnection();
			IDbAdapter adapt = conn.getAdapter(query); // アダプタの取得
			IDbRecordset rs = adapt.execQuery(true); // クエリの実行

			if (rs.next()) {
				myPlantCd = rs.getString(1);
				myPlantName = rs.getString(2);
			} else {
				myPlantCd = "";
				myPlantName = "";
			}

			rs.close();
			adapt.close();
			CoreTools.closeDefaultConnection(conn);
			rs = null;
			adapt = null;
			conn = null;

		}catch(Exception e){
				myPlantCd = "";
				myPlantName = "";
		}
	}
}
