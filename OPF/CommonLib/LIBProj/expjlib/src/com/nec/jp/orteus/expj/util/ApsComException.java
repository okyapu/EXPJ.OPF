/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/ApsComException.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

public class ApsComException extends Exception {
	int no;   // エラー番号

	/**
	 * メッセージを返す(エラー番号対応)
	 */
	public String getMessage() {
		return "(AC" + no + ") " + super.getMessage();
	}
	/**
	 * コンストラクタ(エラー番号対応)
	 */
	public ApsComException(int no, String message) {
		super(message);
		this.no = no;
	}
	/**
	 * エラー番号を返す
	 */
	public String getExceptionNo(){
		return "AC" + no;
	}

 
   ///----　以下、Exceptionクラスのコンストラクタにあるものをそのままオーバーライド
	public ApsComException() {
	}
	public ApsComException(String message) {
		super(message);
	}
	public ApsComException(String message, Throwable cause) {
		super(message, cause);
	}
	public ApsComException(Throwable cause) {
		super(cause);
	}
}
