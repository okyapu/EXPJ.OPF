//------------------------------------------------------------------------------
// (#)LeftGet.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/04 新規作成 T.Taniguchi
// 2003/08/08 不要なコメントとメッセージ出力を削除 T.Taniguchi
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common.LeftGet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.common.*;
import com.nec.jp.orteus.xaf.wa.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.log.*;
import com.nec.jp.orteus.util.*;
import javax.servlet.jsp.*;
import java.net.*;


/**
 * 左フレームのモデルクラス(metamorBase用補助)
 * @author NaNES
 * @date 08/04,2003
 * @since Version 1.0
 * @version Version 1.0
 */
public class LeftGet
{
	private HttpSession so;
	private String myPlantCd = null;
	private String myPlantName = null;

	/**
	 * コンストラクタ
	 * @since Version 1.0
	 * @param so セッションオブジェクト
	 * @return なし
	 * @throws なし
	 */
	public LeftGet(HttpSession so) {
		this.so = so;
	}


	/**
	 * 自分の所属する工場コードを取得します。
	 * @since Version 1.0
	 * @param なし
	 * @return 工場コード
	 * @throws なし
	 */
	public String getPlantCd(){
		return myPlantCd;
	}


	/**
	 * 自分の所属する工場名を取得します。
	 * @since Version 1.0
	 * @param なし
	 * @return 工場コード
	 * @throws なし
	 */
	public String getPlantName(){
		return myPlantName;
	}


	/**
	 * ユーザコードをキーとして、自分が所属する工場コードと工場名を取得します。
	 * @since Version 1.0
	 * @param USER_CD
	 * @return なし
	 * @throws mcException
	 */
	public void makePlantData(String USER_CD) {
		try{
			String query = "SELECT " +
							"USER_MST.PLANT_CD," +
							"M_PLANT.PLANT_NAME" +
							" FROM " +
							"USER_MST," +
							"M_PLANT" +
							" WHERE " +
							"USER_MST.PLANT_CD = M_PLANT.PLANT_CD (+) AND " +
							"USER_MST.USER_CD='"+ USER_CD + "' ";

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
			rs = null;
			adapt.close();
			adapt = null;
			CoreTools.closeDefaultConnection(conn);
			conn = null;

		}catch(Exception e){
				myPlantCd = "";
				myPlantName = "";
		}
	}
}
