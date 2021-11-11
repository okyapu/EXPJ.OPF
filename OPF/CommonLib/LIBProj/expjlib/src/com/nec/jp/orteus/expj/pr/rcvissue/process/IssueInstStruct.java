/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueInstStruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;

/**
 * <pre>
 * 出庫指示情報クラス
 * 自動出庫対象の出庫指示情報を保持するクラスです。
 * </pre>
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:00 $
 */
public class IssueInstStruct {
    /** 出庫指示番号   */
    public String  m_ISSUE_INST_CD = null;
    /** 工場コード   */
    public String  m_PLANT_CD = null;			
    /** オーダデマンド番号   */
    public String  m_OD_NO = null;
    /** この出庫指示情報の[所要量].製番   */
    public String  m_JOB_ODR_CD = null;
    /** この出庫指示情報の[所要量].製番枝番  */
    public int		m_JOB_ODR_DETAIL_NO = 0;
    /** 出庫品目番号 */
    public String  m_ITEM_CD = null;		
    /** 発注番号    */
    public String  m_PUCH_ODR_CD = null;
    /** 会社コード    */
    public String  m_COMPANY_CD = null;
    /** 取引先コード    */
    public String  m_VEND_CD = null;
    /** 作業計画番号    */
    public String  m_WORK_ODR_CD = null;		
    /** 仕掛作業コード    */
    public String  m_WORK_IN_PROC_CD = null;
    /** 作業区コード    */
    public String  m_WS_CD = null;
    /** 工程保管場所コード    */
	public String  m_WH_CD = null;						
    /** 支給区分    */
	public int     m_CONS_TYP = 0;
    /** 出庫指示出庫区分    */
	//public int     m_ISSUE_TYP = 0;
    /** 品目手配区分 */
	public int     m_MRP_ODR_TYP = 0;
    /** 在庫数単位区分 */
	public int     m_UNIT_QTY_TYP = 0;
    /** 自動出庫数（処理対象実績数を元に算出した値）*/
	public BigDecimal m_AUTO_ISSUE_QTY = null;


	//------------------------------------------------------
	//     【公開メソッド】
	//------------------------------------------------------
	
	/**
	 * <pre>
	 * 工程保管場所への入庫処理を行うかどうかの判定を行います。
	 * (OPFから利用します）
	 * 
     * 工程保管場所≠Null("") の場合、　または
     * 作業計画番号＝Null("") AND 支給区分＝２:無償
     * の場合、true(工程保管場所へ入庫する)を返却します。
	 * </pre>
	 * 
	 * @param iWhCd       工程保管場所コード
	 * @param iWorkOdrCd  作業計画番号
	 * @param iConsTyp    支給区分
	 *
	 * @return true/false   (true:工程保管場所へ入庫する)
	 */
	final static public boolean isWhRcv(String iWhCd, String iWorkOdrCd, String iConsTyp) {
	    
	    return isWhRcv(iWhCd,iWorkOdrCd,Integer.parseInt(iConsTyp));
	}

	/**
	 * 工程保管場所への入庫処理を行うかどうかの判定を行います。
	 * (マニュアル・キット一括出庫クラスから利用します)
	 *
	 * @return true/false   (true:工程保管場所へ入庫する)
	 */
	protected boolean isWhRcv() {
	    
	    return isWhRcv(this.m_WH_CD, this.m_WORK_ODR_CD,this.m_CONS_TYP);
	}
	
	/**
	 * <pre>
	 * [有償支給履歴]ファイルへの追加判定を行います。
	 * (OPFから利用します)
	 *
	 * 発注番号≠Null("")  AND 作業計画番号＝Null("") AND 支給区分＝１:有償
	 * の場合、true(有償支給)を返却します。
	 * </pre>
	 *
	 * @param iPuchOdrCd　発注番号
	 * @param iWorkOdrCd　作業計画番号
	 * @param iConsTyp　　支給区分
	 * 
	 * @return true/false   (true:有償支給品である)
	 */
	final static public boolean isOnerous(String iPuchOdrCd, String iWorkOdrCd, String iConsTyp) {
	    return isOnerous(iPuchOdrCd,
	                      iWorkOdrCd,
	                      Integer.parseInt(iConsTyp));
	}
	
	/**
	 * <pre>
	 * [有償支給履歴]ファイルへの追加判定を行います。
	 * (自動出庫クラス、マニュアル・キット一括出庫クラスから利用します)
	 *
	 * </pre>
	 * 
	 * @return true/false   (true:有償支給品である)
	 */
	protected boolean isOnerous() {
	    return isOnerous(this.m_PUCH_ODR_CD,
	                      this.m_WORK_ODR_CD,
	                      this.m_CONS_TYP);
	}

	//------------------------------------------------------
	//     【非公開メソッド】
	//------------------------------------------------------
	/**
	 * [有償支給履歴]ファイルへの追加判定を行います。
     *
	 * 発注番号≠Null("")  AND 作業計画番号＝Null("") AND 支給区分＝１:有償
	 * の場合、true(有償支給)を返却します。
     *
	 * @param iPuchOdrCd　発注番号
	 * @param iWorkOdrCd　作業計画番号
	 * @param iConsTyp　　支給区分
	 * 
	 * @return true/false   (true:有償支給品である)
	 */
	final static private boolean isOnerous(String iPuchOdrCd, String iWorkOdrCd, int iConsTyp) {
	    boolean ConsFlg = false;
	    /*
	     * 発注番号≠Null("")  AND 作業計画番号＝Null("") AND 支給区分＝１:有償
	     * の場合、有償支給とする。
	     */
		if ( ((iPuchOdrCd != null) && !iPuchOdrCd.equals("")) && 
		     ((iWorkOdrCd == null) || iWorkOdrCd.equals("") ) &&
		     (iConsTyp == 1)) {
			ConsFlg = true;
		}
	    return ConsFlg;
	}

	/**
	 * 工程保管場所への入庫処理を行うかどうかの判定を行います。
	 * 
     * 工程保管場所≠Null("") の場合、　または
     * 作業計画番号＝Null("") AND 支給区分＝２:無償
     * の場合、true(工程保管場所へ入庫する)を返却します。
	 * 
	 * @param iWhCd       工程保管場所コード
	 * @param iWorkOdrCd  作業計画番号
	 * @param iConsTyp    支給区分
	 *
	 * @return true/false   (true:工程保管場所へ入庫する)
	 */
	final static private boolean isWhRcv(String iWhCd, String iWorkOdrCd, int iConsTyp) {
	    /*
	     * 工程保管場所≠Null("") の場合、「工程保管場所へ入庫する」と判定する。
	     */
	    if ((iWhCd!= null) && !iWhCd.equals("")){
	        return true;
	    }
	    /*
	     * 作業計画番号＝Null("") AND 支給区分＝２:無償
	     * の場合、「工程保管場所へ入庫する」と判定する。
	     */
		if (( iWorkOdrCd == null || iWorkOdrCd.equals("") ) &&
		     (iConsTyp == 2)) {
		    return  true;
		}
	    return false;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
