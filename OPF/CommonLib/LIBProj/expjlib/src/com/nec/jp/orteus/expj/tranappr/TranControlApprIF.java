/*	
* $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/tranappr/TranControlApprIF.java,v $	
	
*	
* Copyright (c) 2003-2004 NEC Corporation.	
* Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.	
*/	
package com.nec.jp.orteus.expj.tranappr;	
	
import java.util.List;	
import com.nec.jp.orteus.xaf.foundation.IDbConnection;	
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.wa.BusinessProcessException;
import com.nec.jp.orteus.msg.util.Business;	
import com.nec.jp.orteus.expj.systemlog.SystemLog;	
import com.nec.jp.orteus.expj.util.MessageStruct;	
	
/**	
 * <pre>	
 * トラン承認インタフェース	
 * </pre>	
 * @author $Author: wang-derui $	
 * @version $Revision: 1.1 $ $Date: 2008/10/20 08:53:03 $	
 *	
 **/	
public abstract interface TranControlApprIF {	
	
	
	/**
	 * Structの値のセットします<BR>
	 * @param TranStructApprIF tempstruct
	 */
	public abstract void setApprStruct(TranStructApprIF tempstruct) ; 
	
	/**
	 * connのセット<BR>
	 * @param IDbConnection conn
	 */
	public abstract void setConn(IDbConnection conn) ; 
	
	/**
	 * Businessオブジェクトアクセサメソッド<BR>
	 * @param Business business
	 */
	public abstract void setBusiness(Business business) ; 
	
	/**
	 * メッセージストラクト作成（多言語対応）<BR>
	 */
	public abstract void createMsgStruct() ; 
	
	/**
	 * 承認者のセット<BR>
	 * @param String apprBy
	 */
	public abstract void setAPPR_BY(String apprBy) ; 
	
	/**
	 * 承認日付のセット<BR>
	 * @param String apprDate
	 */
	public abstract void setAPPR_DATE(String apprDate) ; 
	
	/**
	 * メッセージストラクト<BR>
	 * @return MessageStruct
	 */
	public abstract MessageStruct getMsgStruct() ; 
	
	/**
	 * シスログ<BR>
	 * @param SystemLog sysLog
	 */
	public abstract void setSysLog(SystemLog sysLog) ; 
	
	/**
	 * リストのセット<BR>
	 * @param List list
	 */
	public abstract void setList(List list) ; 
	
	//1/2選択
	
	/**
	 * Ja確定受注承認のゲット<BR>
	 * @param String aprJaOdr
	 */
	public abstract void set_APR_JA_ODR(String aprJaOdr) ; 
	
	/**
	 * Ja内示受注承認<BR>
	 * @param String aprJaUncnfmOdr
	 */
	public abstract void set_APR_JA_UNCNFM_ODR(String aprJaUncnfmOdr) ; 
	
	//KQ1070010Control
	
	/**
	 * ユーザコード<BR>
	 * @param String sysUSER_CD
	 */
	public abstract void setsysUSER_CD(String sysUSER_CD) ; 
	
	/**
	 * ユーザ名<BR>
	 * @param String sysUSER_NAME
	 */
	public abstract void setsysUSER_NAME(String sysUSER_NAME) ; 
	
	/**
	 * 工場コード<BR>
	 * @param String sysPLANT_CD
	 */
	public abstract void setsysPLANT_CD(String sysPLANT_CD) ; 
	
	/**
	 * 工場名   <BR>
	 * @param String sysPLANT_NAME
	 */
	public abstract void setsysPLANT_NAME(String sysPLANT_NAME) ; 
	
	/**
	 * 業務ID<BR>
	 * @param String ScreenId
	 */
	public abstract void setScreenId(String ScreenId) ; 
	
	/**
	 * <BR>
	 */
	public abstract void controlInsert()throws BusinessProcessException, FoundationException ; 
	
	/**
	 * <BR>
	 */
	public abstract void controlUpdate()throws BusinessProcessException, FoundationException ; 
	
	/**
	 * <BR>
	 */
	public abstract void controlDelete()throws BusinessProcessException, FoundationException ; 
	
	//KQ1080010Control
	
	/**
	 * 会社コード<BR>
	 * @param String COMPANY_CD
	 */
	public abstract void setCOMPANY_CD(String COMPANY_CD) ; 
	
	/**
	 * 既定値設定確認有無フラグ<BR>
	 * @param String EST_CONF_SET_FLG
	 */
	public abstract void setEST_CONF_SET_FLG(String EST_CONF_SET_FLG) ; 
	
	/**
	 * 業務日付<BR>
	 * @param String BUSINESSOPRDATE
	 */
	public abstract void setBUSINESSOPRDATE(String BUSINESSOPRDATE) ; 
	
	//KQ1090010Control
	
	//KQ1130010Control
	
	/**
	 * 自社コード<BR>
	 * @param String MyCompanyCd
	 */
	public abstract void setMyCompanyCd(String MyCompanyCd) ; 
	
	/**
	 * 販売管理工場コード<BR>
	 * @param String MpSalesPlantCd
	 */
	public abstract void setMpSalesPlantCd(String MpSalesPlantCd) ; 
	
	/**
	 * 業務運用日<BR>
	 * @param String BusinessOprDate
	 */
	public abstract void setBusinessOprDate(String BusinessOprDate) ; 
	
	/**
	 * 既定値設定確認有無フラグ<BR>
	 * @param String EstConfSetFlg
	 */
	public abstract void setEstConfSetFlg(String EstConfSetFlg) ; 
	
	/**
	 * 出荷指示種別<BR>
	 * @param String ShipOdrCnd
	 */
	public abstract void setShipOdrCnd(String ShipOdrCnd) ; 
	
	//KQ1140010Control
	
	/**
	 * 自社情報<BR>
	 * @param String _myCompanyCode
	 */
	public abstract void set_myCompanyCode(String _myCompanyCode) ; 
	
	/**
	 * 業務運用日<BR>
	 * @param String _businessOprDate
	 */
	public abstract void set_businessOprDate(String _businessOprDate) ; 

	/**
	 * 自社情報<BR>
	 * @param String _plantCd
	 */
	public abstract void set_plantCd(String _plantCd) ; 

	/**
	 * 内示管理番号,編集可能フラグ,更新数保持用配列 <BR>
	 * @param String dayArrayList[][]
	 */
	public abstract void set_dayArrayList(String dayArrayList[][]) ; 

} 	
