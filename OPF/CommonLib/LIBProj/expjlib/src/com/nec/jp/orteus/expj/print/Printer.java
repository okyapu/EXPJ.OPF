/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/print/Printer.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.print;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 * 使用可能なプリンタ用のデータクラス。
 * リストボックスデータを取得する為のユーティリティクラス。<BR>
 * データを取得(getData)する前にコネクションの設定をしてください。
 *
 * @see PrinterStruct
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:06 $
 */
public class Printer {
	
	/** 
	 * DBアクセス用のコネクション 
	 */
	private IDbConnection _conn = null;

	/** 
	 * データ取得用のSQL 
	 */
	private String _selectSql = 
		"select P.SEQ_NO,P.PRINTER_DISPLAY_NAME,DECODE(P.PRINTER_TYP='2',P.SPOOL_SERVER,PRINTER_NAME),P.PRINTER_TYP "
		+"from  SYS_PRINTERS P "
		+"where P.PLANT_CD = ? "
		+"  and P.PRINTER_USABLE_FLG = 1 "
		+"order by P.SEQ_NO";

	/**
	 * オブジェクトを構築します。
	 */
	public Printer(){
	}

	/**
	 * 指定のコネクションを持つオブジェクトを構築します。
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public Printer(IDbConnection connect){
		_conn = connect;
	}

	/**
	 * コネクション設定。<BR>
	 * コネクションの参照を無効にする場合、引数にnullを設定してください。
	 *
	 * @param  connect コネクションがOPENされているIDbConnection
	 */
	public void setConnection(IDbConnection connect){
		_conn = connect;
	}

	/**
	 * 指定された工場コードのプリンタ定義データを取得します。
	 *
	 * @param  plantCd 工場コード
	 * @return 取得したプリンタ定義データ。データはSQQ_NOの昇順に格納されています。
	 * @throws SQLException SQLの発行に失敗した場合
	 */
	public PrinterStruct getData(String plantCd) 
			throws SQLException
	{
		PrinterStruct rPrinter = new PrinterStruct();	// コンボボックスデータ
		PreparedStatement stmt = null;					// ステートメント
		ResultSet rset = null;							// リザルトセット

		try{
			// SQL作成
			stmt = (_conn.getConn()).prepareStatement(_selectSql);
			stmt.setString(1, plantCd);
		
			// SQL実行
			rset = stmt.executeQuery();
		
			// 結果を設定
			while (rset.next()){
				String val = new String(rset.getString(1));
				String explan = new String(rset.getString(2));
				String printer = new String(rset.getString(3));
				String type = new String(rset.getString(4));
				rPrinter.addData(val, explan, printer, type);
			}
			
			// 取得データが0以下の場合、例外発生
			if (rPrinter.size() <= 0){
				String val     = new String("0");
				String explan  = new String("クライアント印刷");
				String printer = new String("クライアント印刷");
				String type    = new String("1");
				rPrinter.addData(val, explan, printer, type);
			}
			return rPrinter;
		}catch(Exception e){
			// 取得データが0以下の場合、例外発生
			if (rPrinter.size() <= 0){
				String val     = new String("0");
				String explan  = new String("クライアント印刷");
				String printer = new String("クライアント印刷");
				String type    = new String("1");
				rPrinter.addData(val, explan, printer, type);
			}
			return rPrinter;
		}finally{
			if (rset != null){
				try{
					rset.close();
				}catch(Exception e){}
				rset = null;
			}
			if (stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}
}

