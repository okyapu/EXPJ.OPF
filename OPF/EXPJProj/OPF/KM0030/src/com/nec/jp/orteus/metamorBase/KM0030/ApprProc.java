package com.nec.jp.orteus.metamorBase.KM0030;

import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.tranappr.TranAppr;
import com.nec.jp.orteus.msg.util.Business;

public class ApprProc {
	
	/** 状態区分*/
	private static final String STATUS = "1";  
	/** 案件受注登録機能名*/
	private static final String INSERTURL = "KM0030010Servlet";
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
    public static void execInsertProcess(IDbConnection conn,KM0030010Struct struct,KM0030010Control control) throws SQLException {
   	
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KM0030010");   // トラン承認依頼クラス
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
    	tranAppr.insertTranSrc(apprId, "l_h_ODR_TYP", struct.getl_h_ODR_TYP(),"0");                           // 注文区分
    	tranAppr.insertTranSrc(apprId, "l_ODR_TYP", struct.getl_ODR_TYP(), "0");                              // 注文区分
    	tranAppr.insertTranSrc(apprId, "l_CUST_ODR_NO", struct.getl_CUST_ODR_NO(), "0");                      // 得意先注文番号
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                                  // 得意先コード
    	tranAppr.insertTranSrc(apprId, "CUST_NAME", struct.getCUST_NAME(), "0");                              // 得意先名
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_CD", struct.getl_CUST_ITEM_CD(), "0");                    // 得意先品目番号
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_NAME", struct.getl_CUST_ITEM_NAME(), "0");                // 得意先品目名
    	tranAppr.insertTranSrc(apprId, "l_ITEM_CD", struct.getl_ITEM_CD(), "0");                              // 品目番号
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_CD", struct.getl_DLV_LOC_CD(), "0");                        // 納品場所コード
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_NAME", struct.getl_DLV_LOC_NAME(), "0");                    // 納品場所名
    	tranAppr.insertTranSrc(apprId, "l_DESINATED_DLV_DATE", struct.getl_DESINATED_DLV_DATE(), "0");        // 指定納期
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_UNIT_PRICE", struct.getl_ESTIMATE_UNIT_PRICE(), "0");      // 単価
    	tranAppr.insertTranSrc(apprId, "l_ODR_QTY", struct.getl_ODR_QTY(), "0");                              // 受注数量
    	tranAppr.insertTranSrc(apprId, "l_CUR_UNIT", struct.getl_CUR_UNIT(), "0");                            // 通貨単位
    	tranAppr.insertTranSrc(apprId, "l_REMARKS", struct.getl_REMARKS(), "0");                              // 備考
    	tranAppr.insertTranSrc(apprId, "l_ODR_ACPT_DATE", struct.getl_ODR_ACPT_DATE(), "0");                  // 受注日
    	tranAppr.insertTranSrc(apprId, "l_c_DOODR", struct.getl_c_DOODR(), "0");                              // 製番手配を同時に行う
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_QTY", struct.getl_ESTIMATE_QTY(), "0");                    // 手配数量
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_DLV_DATE", struct.getl_JOB_ODR_DLV_DATE(), "0");            // 製番納期
    	tranAppr.insertTranSrc(apprId, "l_ALC_GRP_CD", struct.getl_ALC_GRP_CD(), "0");                        // 引当グループコード
    	tranAppr.insertTranSrc(apprId, "c_INPUTODRCD", struct.getl_c_INPUTODRCD(), "0");                      // 製番を手入力する
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_CD", struct.getl_JOB_ODR_CD(), "0");                        // 製番
    	tranAppr.insertTranSrc(apprId, "PROJECT_CD", struct.getPROJECT_CD(), "0");                            // 案件番号
    	tranAppr.insertTranSrc(apprId, "ESTIMATE_NO", struct.getESTIMATE_NO(), "0");                          // 見積番号
    	tranAppr.insertTranSrc(apprId, "l_DETAL_NO", struct.getl_DETAL_NO(), "0");                            // 明細番号
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_ITEM_NAME", struct.getl_ESTIMATE_ITEM_NAME(), "0");        // 品目名
    	tranAppr.insertTranSrc(apprId, "l_h_ESTIMATE_TYPE", struct.getl_h_ESTIMATE_TYPE(), "0");              // 手配品目種
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_TYPE", struct.getl_ESTIMATE_TYPE(), "0");                  // 手配品目種
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");                  // 受注担当者コード
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                        // 受注担当部門コード
    	tranAppr.insertTranSrc(apprId, "l_UNIT_CD", struct.getl_UNIT_CD(), "0");                              // 単位
    	tranAppr.insertTranSrc(apprId, "l_DEPO_TYP", struct.getl_DEPO_TYP(), "0");                            // 預託倉庫区分
    	tranAppr.insertTranSrc(apprId, "l_h_DEPO_TYP", struct.getl_h_DEPO_TYP(), "0");                        // 預託倉庫区分
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
    public static void execUpdateProcess(IDbConnection conn,KM0030010Struct struct,KM0030010Control control,String procTyp) throws SQLException {
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KM0030010");   // トラン承認依頼クラス
    	/** 依頼存在チェック（受注番号で）*/
    	boolean checkFlg = tranAppr.selectTranSrc("l_ODR_NO", struct.getl_ODR_NO());
    	if (checkFlg) {
    		control.setErrorMessage("KA00125", null);
    		return;
    	}
    	
    	/** 承認IDを取得*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [トラン承認依頼]を登録 */
    	tranAppr.insertTranApr(apprId,INSERTURL,procTyp,struct.getl_APPR_REMARKS(),STATUS,struct.getsUser_ID(),control.get_businessOprDate());
    	
    	/** [トラン画面データ]を登録 */
    	// 画面初期化に取得したデータ
    	tranAppr.insertTranSrc(apprId, "_companyCd", control.get_companyCd(),"2");                         // 自社情報
    	tranAppr.insertTranSrc(apprId, "_businessOprDate", control.get_businessOprDate(), "2");            // 業務運用日
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");                        // ユーザコード
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");                    // ユーザ名
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");                      // 工場コード
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");                  // 工場名   	
    	// 画面入力データ
    	tranAppr.insertTranSrc(apprId, "l_ODR_NO", struct.getl_ODR_NO(),"1");                                 // 受注番号
    	tranAppr.insertTranSrc(apprId, "l_h_ODR_TYP", struct.getl_h_ODR_TYP(),"0");                           // 注文区分
    	tranAppr.insertTranSrc(apprId, "l_ODR_TYP", struct.getl_ODR_TYP(), "0");                              // 注文区分
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                                  // 得意先コード
    	tranAppr.insertTranSrc(apprId, "CUST_NAME", struct.getCUST_NAME(), "0");                              // 得意先名
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_CD", struct.getl_CUST_ITEM_CD(), "0");                    // 得意先品目番号
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_NAME", struct.getl_CUST_ITEM_NAME(), "0");                // 得意先品目名
    	tranAppr.insertTranSrc(apprId, "l_DESINATED_DLV_DATE", struct.getl_DESINATED_DLV_DATE(), "0");        // 指定納期
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_UNIT_PRICE", struct.getl_ESTIMATE_UNIT_PRICE(),"0");       // 単価
    	tranAppr.insertTranSrc(apprId, "l_ODR_QTY", struct.getl_ODR_QTY(), "0");                              // 受注数量
    	tranAppr.insertTranSrc(apprId, "l_REMARKS", struct.getl_REMARKS(), "0");                              // 備考
    	tranAppr.insertTranSrc(apprId, "l_ITEM_CD", struct.getl_ITEM_CD(), "0");                              // 品目番号
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_ITEM_NAME", struct.getl_ESTIMATE_ITEM_NAME(), "0");        // 品目名
    	tranAppr.insertTranSrc(apprId, "l_CUR_UNIT", struct.getl_CUR_UNIT(), "0");                            // 通貨単位
    	tranAppr.insertTranSrc(apprId, "l_ODR_ACPT_DATE", struct.getl_ODR_ACPT_DATE(), "0");                  // 受注日
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_CD", struct.getl_DLV_LOC_CD(), "0");                        // 納品場所コード
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_NAME", struct.getl_DLV_LOC_NAME(), "0");                    // 納品場所名
    	tranAppr.insertTranSrc(apprId, "l_CUST_ODR_NO", struct.getl_CUST_ODR_NO(), "0");                      // 得意先注文番号
    	tranAppr.insertTranSrc(apprId, "PROJECT_CD", struct.getPROJECT_CD(), "0");                            // 案件番号
    	tranAppr.insertTranSrc(apprId, "ESTIMATE_NO", struct.getESTIMATE_NO(), "0");                          // 見積番号
    	tranAppr.insertTranSrc(apprId, "l_DETAL_NO", struct.getl_DETAL_NO(), "0");                            // 明細番号
    	tranAppr.insertTranSrc(apprId, "l_h_ESTIMATE_TYPE", struct.getl_h_ESTIMATE_TYPE(), "0");              // 手配品目種
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_TYPE", struct.getl_ESTIMATE_TYPE(), "0");                  // 手配品目種
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");                  // 受注担当者コード
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                        // 受注担当部門コード
    	tranAppr.insertTranSrc(apprId, "l_UNIT_CD", struct.getl_UNIT_CD(), "0");                              // 単位
    	tranAppr.insertTranSrc(apprId, "l_DEPO_TYP", struct.getl_DEPO_TYP(), "0");                            // 預託倉庫区分
    	tranAppr.insertTranSrc(apprId, "l_h_DEPO_TYP", struct.getl_h_DEPO_TYP(), "0");                        // 預託倉庫区分
    	tranAppr.insertTranSrc(apprId, "l_c_DOODR", struct.getl_c_DOODR(), "0");                              // 製番手配を同時に行う
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_QTY", struct.getl_ESTIMATE_QTY(), "0");                    // 手配数量
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_DLV_DATE", struct.getl_JOB_ODR_DLV_DATE(), "0");            // 製番納期
    	tranAppr.insertTranSrc(apprId, "l_ALC_GRP_CD", struct.getl_ALC_GRP_CD(), "0");                        // 引当グループコード
    	tranAppr.insertTranSrc(apprId, "c_INPUTODRCD", struct.getl_c_INPUTODRCD(), "0");                      // 製番を手入力する
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_CD", struct.getl_JOB_ODR_CD(), "0");                        // 製番
    }
}
