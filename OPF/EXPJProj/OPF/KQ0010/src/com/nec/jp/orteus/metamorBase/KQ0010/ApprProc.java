package com.nec.jp.orteus.metamorBase.KQ0010;

import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.tranappr.TranAppr;
import com.nec.jp.orteus.msg.util.Business;

public class ApprProc {
	
	/** 状態区分*/
	private static final String STATUS = "1";  
	/** 受注登録機能名*/
	private static final String INSERTURL = "KQ0010010Servlet";
	/** 受注情報修正機能名*/
	private static final String UPDATETURL = "KQ0010020Servlet";
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
    public static void execInsertProcess(IDbConnection conn,KQ0010010Struct struct,KQ0010010Control control) throws SQLException {
   	
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KQ0010010");   // トラン承認依頼クラス
    	/** 承認IDを取得*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [トラン承認依頼]を登録 */
    	tranAppr.insertTranApr(apprId,INSERTURL,"1",struct.getl_APPR_REMARKS(),STATUS,struct.getsUser_ID(),control.get_businessOprDate());
    	
    	/** [トラン画面データ]を登録 */
    	// 画面初期化に取得したデータ
    	tranAppr.insertTranSrc(apprId, "_companyCd", control.get_companyCd(),"2");                         // 自社情報
    	tranAppr.insertTranSrc(apprId, "_plantWeb", control.get_plantWeb(), "2");                          // 販売管理用工場コード
    	tranAppr.insertTranSrc(apprId, "_businessOprDate", control.get_businessOprDate(), "2");            // 業務運用日
    	tranAppr.insertTranSrc(apprId, "_homeCurCd", control.get_homeCurCd(), "2");                        // 邦貨コード
    	tranAppr.insertTranSrc(apprId, "_shipLt", control.get_shipLt(), "2");                              // 出荷準備L/T
    	tranAppr.insertTranSrc(apprId, "_dlvDateCdt", control.get_dlvDateCdt(), "2");                      // 短納期の判定日数
    	tranAppr.insertTranSrc(apprId, "PRD_REQ_JOB_ODR_TYP_1", control.getPRD_REQ_JOB_ODR_TYP_1(), "2");  // シスパラ①[受注時製番登録]
    	tranAppr.insertTranSrc(apprId, "PRD_REQ_JOB_ODR_TYP_2", control.getPRD_REQ_JOB_ODR_TYP_2(), "2");  // シスパラ②[受注時製番登録]
    	
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");          // ユーザコード
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");      // ユーザ名
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");        // 工場コード
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");    // 工場名
	
    	
    	// 画面入力データ
    	tranAppr.insertTranSrc(apprId, "l_ODR_TYP", struct.getl_ODR_TYP(),"0");                         // 注文区分
    	tranAppr.insertTranSrc(apprId, "l_CUST_ODR_NO", struct.getl_CUST_ODR_NO(), "0");                // 得意先注文番号
    	tranAppr.insertTranSrc(apprId, "l_CUST_CD", struct.getl_CUST_CD(), "0");                        // 得意先コード
    	tranAppr.insertTranSrc(apprId, "l_CUST_ANAME", struct.getl_CUST_ANAME(), "0");                  // 得意先略称
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_CD", struct.getl_CUST_ITEM_CD(), "0");              // 得意先品目番号
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_NAME", struct.getl_CUST_ITEM_NAME(), "0");          // 得意先品目名
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_CD", struct.getl_DLV_LOC_CD(), "0");                  // 納品場所コード
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_NAME", struct.getl_DLV_LOC_NAME(), "0");              // 納品場所名
    	tranAppr.insertTranSrc(apprId, "l_DESINATED_DLV_DATE", struct.getl_DESINATED_DLV_DATE(), "0");  // 指定納期
    	tranAppr.insertTranSrc(apprId, "l_SPCL_PRICE_TYP", struct.getl_SPCL_PRICE_TYP(), "0");          // 特値区分
    	tranAppr.insertTranSrc(apprId, "l_ODR_UNIT_PRICE", struct.getl_ODR_UNIT_PRICE(), "0");          // 単価
    	tranAppr.insertTranSrc(apprId, "l_ODR_QTY", struct.getl_ODR_QTY(), "0");                        // 受注数量
    	tranAppr.insertTranSrc(apprId, "l_CUR_CD", struct.getl_CUR_CD(), "0");                          // 通貨コード
    	tranAppr.insertTranSrc(apprId, "l_CUR_UNIT", struct.getl_CUR_UNIT(), "0");                      // 通貨
    	tranAppr.insertTranSrc(apprId, "l_UNIT_CD", struct.getl_UNIT_CD(), "0");                        // 単位
    	tranAppr.insertTranSrc(apprId, "l_REMARKS", struct.getl_REMARKS(), "0");                        // 備考
    	tranAppr.insertTranSrc(apprId, "l_ODR_ACPT_DATE", struct.getl_ODR_ACPT_DATE(), "0");            // 受注日
    	tranAppr.insertTranSrc(apprId, "l_ITEM_CD", struct.getl_ITEM_CD(), "0");                        // 品目番号
    	tranAppr.insertTranSrc(apprId, "l_ITEM_NAME", struct.getl_ITEM_NAME(), "0");                    // 品目名    	
    	tranAppr.insertTranSrc(apprId, "l_DEPO_TYP", struct.getl_DEPO_TYP(), "0");                      // 預託倉庫区分
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_CD", struct.getl_JOB_ODR_CD(), "0");                  // 製番
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_QTY", struct.getl_JOB_ODR_QTY(), "0");                // 製番数
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_DLV_DATE", struct.getl_JOB_ODR_DLV_DATE(), "0");      // 製番納期
    	tranAppr.insertTranSrc(apprId, "l_ALC_GRP_CD", struct.getl_ALC_GRP_CD(), "0");                  // 引当グループコード
    	tranAppr.insertTranSrc(apprId, "h_DOODRFLG", struct.geth_DOODRFLG(), "0");                      // 製番手配を同時に行う
    	tranAppr.insertTranSrc(apprId, "h_INPUTODRCDFLG", struct.geth_INPUTODRCDFLG(), "0");            // 製番を手入力する
    	tranAppr.insertTranSrc(apprId, "h_MRP_ODR_TYP", struct.geth_MRP_ODR_TYP(), "0");                // 品目手配区分
    	tranAppr.insertTranSrc(apprId, "h_SHIP_PLANT_CD", struct.geth_SHIP_PLANT_CD(), "0");            // 工場コード
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                  // 受注担当部門
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");            // 受注担当者
    	tranAppr.insertTranSrc(apprId, "sUser_ID", struct.getsUser_ID(), "0");                          // システムユーザ
    	
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
    public static void execUpdateProcess(IDbConnection conn,KQ0010020Struct struct,KQ0010020Control control,String procTyp) throws SQLException {
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KQ0010010");   // トラン承認依頼クラス
    	/** 依頼存在チェック（受注番号で）*/
    	boolean checkFlg = tranAppr.selectTranSrc("IN_ODR_NO", struct.getIN_ODR_NO());
    	if (checkFlg) {
    		control.setAppErrorMessage("KA00125");
    		return;
    	}
    	
    	/** 承認IDを取得*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [トラン承認依頼]を登録 */
    	tranAppr.insertTranApr(apprId,UPDATETURL,procTyp,struct.getAPPR_REMARKS(),STATUS,struct.getsUser_ID(),control.get_businessOprDate());
    	
    	/** [トラン画面データ]を登録 */
    	// 画面初期化に取得したデータ
    	tranAppr.insertTranSrc(apprId, "_companyCd", control.get_companyCd(),"2");                         // 自社情報
    	tranAppr.insertTranSrc(apprId, "_plantWeb", control.get_plantWeb(), "2");                          // 販売管理用工場コード
    	tranAppr.insertTranSrc(apprId, "_businessOprDate", control.get_businessOprDate(), "2");            // 業務運用日
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");          // ユーザコード
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");      // ユーザ名
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");        // 工場コード
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");    // 工場名   	
    	// 画面入力データ
    	tranAppr.insertTranSrc(apprId, "IN_ODR_NO", struct.getIN_ODR_NO(),"1");                         // 受注番号
    	tranAppr.insertTranSrc(apprId, "h_ODR_NO", struct.geth_ODR_NO(),"0");                           // 受注番号
    	tranAppr.insertTranSrc(apprId, "ODR_QTY", struct.getODR_QTY(), "0");                            // 受注数量
    	tranAppr.insertTranSrc(apprId, "h_ODR_QTY", struct.geth_ODR_QTY(), "0");                        // 受注数量
    	tranAppr.insertTranSrc(apprId, "DESINATED_DLV_DATE", struct.getDESINATED_DLV_DATE(), "0");      // 指定納期
    	tranAppr.insertTranSrc(apprId, "h_DESINATED_DLV_DATE", struct.geth_DESINATED_DLV_DATE(), "0");  // 指定納期
    	tranAppr.insertTranSrc(apprId, "SPCL_PRICE_TYP", struct.getSPCL_PRICE_TYP(), "0");              // 特値区分
    	tranAppr.insertTranSrc(apprId, "h_SPCL_PRICE_TYP", struct.geth_SPCL_PRICE_TYP(), "0");          // 特値区分
    	tranAppr.insertTranSrc(apprId, "ODR_UNIT_PRICE", struct.getODR_UNIT_PRICE(), "0");              // 単価
    	tranAppr.insertTranSrc(apprId, "h_ODR_UNIT_PRICE", struct.geth_ODR_UNIT_PRICE(), "0");          // 単価
    	tranAppr.insertTranSrc(apprId, "CUS_DLV_KEY_CD", struct.getCUS_DLV_KEY_CD(), "0");              // 納品キー番号
    	tranAppr.insertTranSrc(apprId, "CUS_DLV_CD", struct.getCUS_DLV_CD(), "0");                      // 納入番号
    	tranAppr.insertTranSrc(apprId, "REMARKS", struct.getREMARKS(), "0");                            // 備考
    	tranAppr.insertTranSrc(apprId, "DLV_LOC_CD", struct.getDLV_LOC_CD(), "0");                      // 納品場所コード
    	tranAppr.insertTranSrc(apprId, "h_DLV_LOC_CD", struct.geth_DLV_LOC_CD(), "0");                  // 納品場所コード
    	tranAppr.insertTranSrc(apprId, "DLV_LOC_NAME_KANJI", struct.getDLV_LOC_NAME_KANJI(), "0");      // 納品場所名
    	tranAppr.insertTranSrc(apprId, "CUST_ODR_NO", struct.getCUST_ODR_NO(), "0");                    // 得意先注文番号	
    	tranAppr.insertTranSrc(apprId, "ITEM_CD", struct.getITEM_CD(), "0");                            // 品目番号
    	tranAppr.insertTranSrc(apprId, "ITEM_NAME", struct.getITEM_NAME(), "0");                        // 品目名    	
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                            // 得意先コード
    	tranAppr.insertTranSrc(apprId, "CUST_ANAME", struct.getCUST_ANAME(), "0");                      // 得意先名
    	tranAppr.insertTranSrc(apprId, "CUST_ITEM_CD", struct.getCUST_ITEM_CD(), "0");                  // 得意先品目番号
    	tranAppr.insertTranSrc(apprId, "CUST_ITEM_NAME", struct.getCUST_ITEM_NAME(), "0");              // 得意先品目名
    	tranAppr.insertTranSrc(apprId, "ODR_TYP", struct.getODR_TYP(), "0");                            // 注文区分名
    	tranAppr.insertTranSrc(apprId, "h_ODR_TYP", struct.geth_ODR_TYP(), "0");                                        // 注文区分
    	tranAppr.insertTranSrc(apprId, "h_REMAIN_UNCONFIRM_ODR_QTY", struct.geth_REMAIN_UNCONFIRM_ODR_QTY(), "0");      // 内示残数量
    	tranAppr.insertTranSrc(apprId, "h_SHIP_PLAN_REMAIN_QTY", struct.geth_SHIP_PLAN_REMAIN_QTY(), "0");              // 出荷計画残数量
    	tranAppr.insertTranSrc(apprId, "h_ANS_DLV_DATE_EXIST_FLG", struct.geth_ANS_DLV_DATE_EXIST_FLG(), "0");          // 出荷計画存在フラグ
    	tranAppr.insertTranSrc(apprId, "h_T_SHIP_ODR_EXIST_FLG", struct.geth_T_SHIP_ODR_EXIST_FLG(), "0");              // 出荷指示存在フラグ
    	tranAppr.insertTranSrc(apprId, "h_MODIFY_COUNT", struct.geth_MODIFY_COUNT(), "0");                              // 更新数
    	tranAppr.insertTranSrc(apprId, "h_BUSINESS_OPR_DATE", struct.geth_BUSINESS_OPR_DATE(), "0");                    // 業務日付
    	tranAppr.insertTranSrc(apprId, "UNIT_CD", struct.getUNIT_CD(), "0");                                            // 単位
    	tranAppr.insertTranSrc(apprId, "UNIT_NAME", struct.getUNIT_NAME(), "0");                                        // 単位名
    	tranAppr.insertTranSrc(apprId, "UNIT_QTY_TYP", struct.getUNIT_QTY_TYP(), "0");                                  // 在庫数単位区分
    	tranAppr.insertTranSrc(apprId, "STOCK_UNIT", struct.getSTOCK_UNIT(), "0");                                      // 計量単位
    	tranAppr.insertTranSrc(apprId, "h_ALCTED_UNCONFIRM_ODR_QTY", struct.geth_ALCTED_UNCONFIRM_ODR_QTY(), "0");      // 引当数量
    	tranAppr.insertTranSrc(apprId, "CUST_CHRG_ORG_CD", struct.getCUST_CHRG_ORG_CD(), "0");                          // 受注担当部門
    	tranAppr.insertTranSrc(apprId, "ODR_ACPT_DATE", struct.getODR_ACPT_DATE(), "0");                                // 受注日
    	tranAppr.insertTranSrc(apprId, "DEPO_TYP", struct.getDEPO_TYP(), "0");                                          // 預託倉庫区分
    	tranAppr.insertTranSrc(apprId, "sUser_ID", struct.getsUser_ID(), "0");                                          // システムユーザ
    	
    	/** 承認依頼成功メッセジーを出す*/
    	control.setInfoMessage("AZ00042");
    }    
}
