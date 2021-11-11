package com.nec.jp.orteus.metamorBase.KQ0090;

import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.tranappr.TranAppr;
import com.nec.jp.orteus.msg.util.Business;

public class ApprProc {
	
	/** 状態区分*/
	private static final String STATUS = "1";  
	/** 非在庫品受注登録機能名*/
	private static final String INSERTURL = "KQ0090010Servlet";
	/** コネクションクラス */
	protected IDbConnection _conn;
	
	public ApprProc (IDbConnection connect) {
		_conn = connect;
	}
	

	/**
	 * 受注承認依頼処理(登録)
	 * @param apprId      承認ID
	 * @param screenUrl   画面URL
	 * @param procTyp     処理区分 
	 * @param apprRemarks 承認備考
	 * @param status      状態区分
	 * @param requestBy   依頼者
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
    public static void execInsertProcess(IDbConnection conn,KQ0090010Struct struct,KQ0090010Control control) throws SQLException {
   	
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KQ0090010");   // トラン承認依頼クラス
    	/** 承認IDを取得*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [トラン承認依頼]を登録 */
    	tranAppr.insertTranApr(apprId,INSERTURL,"1",struct.getAPPROVED_COMMENT(),STATUS,struct.getsUser_ID(),struct.geth_BUSINESS_OPR_DATE());
    	
    	/** [トラン画面データ]を登録 */
    	// 画面初期化に取得したデータ
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");                       // ユーザコード
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");                   // ユーザ名
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");                     // 工場コード
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");                 // 工場名
    	
    	tranAppr.insertTranSrc(apprId, "h_SYS_COMPANY_CODE", struct.geth_SYS_COMPANY_CODE(),"0");         // 自社情報
    	tranAppr.insertTranSrc(apprId, "h_BUSINESS_OPR_DATE", struct.geth_BUSINESS_OPR_DATE(), "0");      // 業務運用日
    	tranAppr.insertTranSrc(apprId, "SPCL_PRICE_TYP","1", "0");                                        // 特値区分
    	tranAppr.insertTranSrc(apprId, "h_ODR_TYP", "3", "0");                                            // 注文区分
    	tranAppr.insertTranSrc(apprId, "DEPO_TYP", "10", "0");                                            // 預託倉庫区分
    	tranAppr.insertTranSrc(apprId, "l_h_ESTIMATE_TYPE", "3", "0");                                    // 手配品目種⇒３：非在庫品

    	// 画面入力データ
    	tranAppr.insertTranSrc(apprId, "ORGN_ODR_NO", struct.getORGN_ODR_NO(), "0");                      // 元受注番号
    	tranAppr.insertTranSrc(apprId, "w_ADD_ODR_FLG", ("true".equals(struct.getchkADD_ODR_FLG()) ? "1" : "0"), "0");                  // 増額受注 1 or 0
    	tranAppr.insertTranSrc(apprId, "chkADD_ODR_FLG", struct.getchkADD_ODR_FLG(), "0");;             // 増額受注 true or fasle 
    	tranAppr.insertTranSrc(apprId, "ODR_ACPT_DATE", struct.getODR_ACPT_DATE(), "0");                  // 受注日
    	tranAppr.insertTranSrc(apprId, "CUST_ODR_NO", struct.getCUST_ODR_NO(), "0");                      // 得意先注文番号
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                              // 得意先コード
    	tranAppr.insertTranSrc(apprId, "CUST_ANAME", struct.getCUST_ANAME(), "0");                        // 得意先名
    	tranAppr.insertTranSrc(apprId, "CUST_CHRG_PSN_CD", struct.getCUST_CHRG_PSN_CD(), "0");            // 営業担当者コード
    	tranAppr.insertTranSrc(apprId, "ITEM_CD", struct.getITEM_CD(), "0");                              // 品目番号
    	tranAppr.insertTranSrc(apprId, "ITEM_NAME", struct.getITEM_NAME(), "0");                          // 品目名
    	tranAppr.insertTranSrc(apprId, "DESINATED_DLV_DATE", struct.getDESINATED_DLV_DATE(), "0");        // 指定納期
    	tranAppr.insertTranSrc(apprId, "ODR_UNIT_PRICE", struct.getODR_UNIT_PRICE(), "0");                // 単価
    	tranAppr.insertTranSrc(apprId, "ODR_QTY", struct.getODR_QTY(), "0");                              // 受注数量
    	tranAppr.insertTranSrc(apprId, "STOCK_UNIT", struct.getSTOCK_UNIT(), "0");                        // 計量単位
    	tranAppr.insertTranSrc(apprId, "ODR_AMOUNT", struct.getODR_AMOUNT(), "0");                        // 受注金額
    	tranAppr.insertTranSrc(apprId, "CUR_UNIT_AMOUNT", struct.getCUR_UNIT_AMOUNT(), "0");              // 通貨単位
    	tranAppr.insertTranSrc(apprId, "TAX_CD", struct.getTAX_CD(), "0");                                // 消費税コード
    	tranAppr.insertTranSrc(apprId, "REMARKS", struct.getREMARKS(), "0");                              // 備考
    	tranAppr.insertTranSrc(apprId, "sUser_ID", struct.getsUser_ID(), "0");                            // システムユーザ
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");              // 受注担当者コード
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                    // 受注担当部門コード
    }
    
    
    /**
	 * 受注承認依頼処理(修正、削除)
	 * @param apprId      承認ID
	 * @param screenUrl   画面URL
	 * @param procTyp     処理区分 
	 * @param apprRemarks 承認備考
	 * @param status      状態区分
	 * @param requestBy   依頼者
	 * @return リザルトセット
	 * @throws SQLException DBアクセスエラー
	 */
    public static void execUpdateProcess(IDbConnection conn,KQ0090010Struct struct,KQ0090010Control control,String procTyp) throws SQLException {
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KQ0090010");   // トラン承認依頼クラス
    	/** 依頼存在チェック（受注番号で）*/
    	boolean checkFlg = tranAppr.selectTranSrc("ODR_NO", struct.getODR_NO());
    	if (checkFlg) {
    		control.setAppErrorMessage("KA00125");
    		return;
    	}
    	
    	/** 承認IDを取得*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [トラン承認依頼]を登録 */
    	tranAppr.insertTranApr(apprId,INSERTURL,procTyp,struct.getAPPROVED_COMMENT(),STATUS,struct.getsUser_ID(),struct.geth_BUSINESS_OPR_DATE());
    	
    	/** [トラン画面データ]を登録 */
    	// 画面初期化に取得したデータ
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");                        // ユーザコード
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");                    // ユーザ名
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");                      // 工場コード
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");                  // 工場名 
    	
    	
    	tranAppr.insertTranSrc(apprId, "h_SYS_COMPANY_CODE", struct.geth_SYS_COMPANY_CODE(),"0");         // 自社情報
    	tranAppr.insertTranSrc(apprId, "h_BUSINESS_OPR_DATE", struct.geth_BUSINESS_OPR_DATE(), "0");      // 業務運用日
    	tranAppr.insertTranSrc(apprId, "SPCL_PRICE_TYP","1", "0");                                        // 特値区分
    	tranAppr.insertTranSrc(apprId, "h_ODR_TYP", "3", "0");                                            // 注文区分
    	tranAppr.insertTranSrc(apprId, "DEPO_TYP", "10", "0");                                            // 預託倉庫区分
    	tranAppr.insertTranSrc(apprId, "l_h_ESTIMATE_TYPE", "3", "0");                                    // 手配品目種⇒３：非在庫品
    	
    	// 画面入力データ
    	tranAppr.insertTranSrc(apprId, "ODR_NO", struct.getODR_NO(), "1");                                // 入力条件_受注番号
    	tranAppr.insertTranSrc(apprId, "ORGN_ODR_NO", struct.getORGN_ODR_NO(), "0");                      // 元受注番号
    	tranAppr.insertTranSrc(apprId, "w_ADD_ODR_FLG", ("true".equals(struct.getchkADD_ODR_FLG()) ? "1" : "0"), "0");                  // 増額受注
    	tranAppr.insertTranSrc(apprId, "chkADD_ODR_FLG", struct.getchkADD_ODR_FLG(), "0");;             // 増額受注 true or fasle 
    	tranAppr.insertTranSrc(apprId, "ODR_ACPT_DATE", struct.getODR_ACPT_DATE(), "0");                  // 受注日
    	tranAppr.insertTranSrc(apprId, "CUST_ODR_NO", struct.getCUST_ODR_NO(), "0");                      // 得意先注文番号
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                              // 得意先コード
    	tranAppr.insertTranSrc(apprId, "CUST_ANAME", struct.getCUST_ANAME(), "0");                        // 得意先名
    	tranAppr.insertTranSrc(apprId, "CUST_CHRG_PSN_CD", struct.getCUST_CHRG_PSN_CD(), "0");            // 営業担当者コード
    	tranAppr.insertTranSrc(apprId, "ITEM_CD", struct.getITEM_CD(), "0");                              // 品目番号
    	tranAppr.insertTranSrc(apprId, "ITEM_NAME", struct.getITEM_NAME(), "0");                          // 品目名
    	tranAppr.insertTranSrc(apprId, "DESINATED_DLV_DATE", struct.getDESINATED_DLV_DATE(), "0");        // 指定納期
    	tranAppr.insertTranSrc(apprId, "ODR_UNIT_PRICE", struct.getODR_UNIT_PRICE(), "0");                // 単価
    	tranAppr.insertTranSrc(apprId, "ODR_QTY", struct.getODR_QTY(), "0");                              // 受注数量
    	tranAppr.insertTranSrc(apprId, "STOCK_UNIT", struct.getSTOCK_UNIT(), "0");                        // 計量単位
    	tranAppr.insertTranSrc(apprId, "ODR_AMOUNT", struct.getODR_AMOUNT(), "0");                        // 受注金額
    	tranAppr.insertTranSrc(apprId, "CUR_UNIT_AMOUNT", struct.getCUR_UNIT_AMOUNT(), "0");              // 通貨単位
    	tranAppr.insertTranSrc(apprId, "TAX_CD", struct.getTAX_CD(), "0");                                // 消費税コード
    	tranAppr.insertTranSrc(apprId, "REMARKS", struct.getREMARKS(), "0");                              // 備考
    	tranAppr.insertTranSrc(apprId, "sUser_ID", struct.getsUser_ID(), "0");                            // システムユーザ
    	tranAppr.insertTranSrc(apprId, "h_MODIFY_COUNT", struct.geth_MODIFY_COUNT(), "0");                // 更新数
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");              // 受注担当者コード
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                    // 受注担当部門コード
    }
}
