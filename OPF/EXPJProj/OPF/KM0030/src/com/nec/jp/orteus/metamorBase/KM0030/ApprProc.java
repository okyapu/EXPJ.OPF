package com.nec.jp.orteus.metamorBase.KM0030;

import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.tranappr.TranAppr;
import com.nec.jp.orteus.msg.util.Business;

public class ApprProc {
	
	/** óÔæª*/
	private static final String STATUS = "1";  
	/** Äóo^@\¼*/
	private static final String INSERTURL = "KM0030010Servlet";
	/** RlNVNX */
	protected IDbConnection _conn;
	
	public ApprProc (IDbConnection connect) {
		_conn = connect;
	}
	

	/**
	 * ó³FË(o^)
	 * @param apprId      ³FID
	 * @param screenUrl   æÊURL
	 * @param procTyp     æª 
	 * @param apprRemarks ³Fõl
	 * @param status      óÔæª
	 * @param requestBy   ËÒ
	 * @return UgZbg
	 * @throws SQLException DBANZXG[
	 */
    public static void execInsertProcess(IDbConnection conn,KM0030010Struct struct,KM0030010Control control) throws SQLException {
   	
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KM0030010");   // g³FËNX
    	/** ³FIDðæ¾*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [g³FË]ðo^ */
    	tranAppr.insertTranApr(apprId,INSERTURL,"1",struct.getl_APPR_REMARKS(),STATUS,struct.getsUser_ID(),control.get_businessOprDate());
    	
    	/** [gæÊf[^]ðo^ */
    	// æÊú»Éæ¾µ½f[^
    	tranAppr.insertTranSrc(apprId, "_companyCd", control.get_companyCd(),"2");                         // ©Ðîñ
    	tranAppr.insertTranSrc(apprId, "_plantWeb", control.get_plantWeb(), "2");                          // ÌÇpHêR[h
    	tranAppr.insertTranSrc(apprId, "_businessOprDate", control.get_businessOprDate(), "2");            // Æ±^pú
    	tranAppr.insertTranSrc(apprId, "_homeCurCd", control.get_homeCurCd(), "2");                        // MÝR[h
    	tranAppr.insertTranSrc(apprId, "_shipLt", control.get_shipLt(), "2");                              // o×õL/T
    	tranAppr.insertTranSrc(apprId, "_dlvDateCdt", control.get_dlvDateCdt(), "2");                      // Z[úÌ»èú
    	tranAppr.insertTranSrc(apprId, "PRD_REQ_JOB_ODR_TYP_1", control.getPRD_REQ_JOB_ODR_TYP_1(), "2");  // VXp@[ó»Ôo^]
    	tranAppr.insertTranSrc(apprId, "PRD_REQ_JOB_ODR_TYP_2", control.getPRD_REQ_JOB_ODR_TYP_2(), "2");  // VXpA[ó»Ôo^]
    	
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");          // [UR[h
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");      // [U¼
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");        // HêR[h
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");    // Hê¼
	
    	
    	// æÊüÍf[^
    	tranAppr.insertTranSrc(apprId, "l_h_ODR_TYP", struct.getl_h_ODR_TYP(),"0");                           // ¶æª
    	tranAppr.insertTranSrc(apprId, "l_ODR_TYP", struct.getl_ODR_TYP(), "0");                              // ¶æª
    	tranAppr.insertTranSrc(apprId, "l_CUST_ODR_NO", struct.getl_CUST_ODR_NO(), "0");                      // ¾Óæ¶Ô
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                                  // ¾ÓæR[h
    	tranAppr.insertTranSrc(apprId, "CUST_NAME", struct.getCUST_NAME(), "0");                              // ¾Óæ¼
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_CD", struct.getl_CUST_ITEM_CD(), "0");                    // ¾ÓæiÚÔ
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_NAME", struct.getl_CUST_ITEM_NAME(), "0");                // ¾ÓæiÚ¼
    	tranAppr.insertTranSrc(apprId, "l_ITEM_CD", struct.getl_ITEM_CD(), "0");                              // iÚÔ
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_CD", struct.getl_DLV_LOC_CD(), "0");                        // [iêR[h
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_NAME", struct.getl_DLV_LOC_NAME(), "0");                    // [iê¼
    	tranAppr.insertTranSrc(apprId, "l_DESINATED_DLV_DATE", struct.getl_DESINATED_DLV_DATE(), "0");        // wè[ú
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_UNIT_PRICE", struct.getl_ESTIMATE_UNIT_PRICE(), "0");      // P¿
    	tranAppr.insertTranSrc(apprId, "l_ODR_QTY", struct.getl_ODR_QTY(), "0");                              // óÊ
    	tranAppr.insertTranSrc(apprId, "l_CUR_UNIT", struct.getl_CUR_UNIT(), "0");                            // ÊÝPÊ
    	tranAppr.insertTranSrc(apprId, "l_REMARKS", struct.getl_REMARKS(), "0");                              // õl
    	tranAppr.insertTranSrc(apprId, "l_ODR_ACPT_DATE", struct.getl_ODR_ACPT_DATE(), "0");                  // óú
    	tranAppr.insertTranSrc(apprId, "l_c_DOODR", struct.getl_c_DOODR(), "0");                              // »Ôèzð¯És¤
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_QTY", struct.getl_ESTIMATE_QTY(), "0");                    // èzÊ
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_DLV_DATE", struct.getl_JOB_ODR_DLV_DATE(), "0");            // »Ô[ú
    	tranAppr.insertTranSrc(apprId, "l_ALC_GRP_CD", struct.getl_ALC_GRP_CD(), "0");                        // øO[vR[h
    	tranAppr.insertTranSrc(apprId, "c_INPUTODRCD", struct.getl_c_INPUTODRCD(), "0");                      // »ÔðèüÍ·é
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_CD", struct.getl_JOB_ODR_CD(), "0");                        // »Ô
    	tranAppr.insertTranSrc(apprId, "PROJECT_CD", struct.getPROJECT_CD(), "0");                            // ÄÔ
    	tranAppr.insertTranSrc(apprId, "ESTIMATE_NO", struct.getESTIMATE_NO(), "0");                          // ©ÏÔ
    	tranAppr.insertTranSrc(apprId, "l_DETAL_NO", struct.getl_DETAL_NO(), "0");                            // ¾×Ô
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_ITEM_NAME", struct.getl_ESTIMATE_ITEM_NAME(), "0");        // iÚ¼
    	tranAppr.insertTranSrc(apprId, "l_h_ESTIMATE_TYPE", struct.getl_h_ESTIMATE_TYPE(), "0");              // èziÚí
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_TYPE", struct.getl_ESTIMATE_TYPE(), "0");                  // èziÚí
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");                  // óSÒR[h
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                        // óSåR[h
    	tranAppr.insertTranSrc(apprId, "l_UNIT_CD", struct.getl_UNIT_CD(), "0");                              // PÊ
    	tranAppr.insertTranSrc(apprId, "l_DEPO_TYP", struct.getl_DEPO_TYP(), "0");                            // aõqÉæª
    	tranAppr.insertTranSrc(apprId, "l_h_DEPO_TYP", struct.getl_h_DEPO_TYP(), "0");                        // aõqÉæª
    }

    
    
    
    /**
	 * ó³FË(C³Aí)
	 * @param apprId      ³FID
	 * @param screenUrl   æÊURL
	 * @param procTyp     æª 
	 * @param apprRemarks ³Fõl
	 * @param status      óÔæª
	 * @param requestBy   ËÒ
	 * @return UgZbg
	 * @throws SQLException DBANZXG[
	 */
    public static void execUpdateProcess(IDbConnection conn,KM0030010Struct struct,KM0030010Control control,String procTyp) throws SQLException {
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KM0030010");   // g³FËNX
    	/** Ë¶Ý`FbNióÔÅj*/
    	boolean checkFlg = tranAppr.selectTranSrc("l_ODR_NO", struct.getl_ODR_NO());
    	if (checkFlg) {
    		control.setErrorMessage("KA00125", null);
    		return;
    	}
    	
    	/** ³FIDðæ¾*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [g³FË]ðo^ */
    	tranAppr.insertTranApr(apprId,INSERTURL,procTyp,struct.getl_APPR_REMARKS(),STATUS,struct.getsUser_ID(),control.get_businessOprDate());
    	
    	/** [gæÊf[^]ðo^ */
    	// æÊú»Éæ¾µ½f[^
    	tranAppr.insertTranSrc(apprId, "_companyCd", control.get_companyCd(),"2");                         // ©Ðîñ
    	tranAppr.insertTranSrc(apprId, "_businessOprDate", control.get_businessOprDate(), "2");            // Æ±^pú
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");                        // [UR[h
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");                    // [U¼
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");                      // HêR[h
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");                  // Hê¼   	
    	// æÊüÍf[^
    	tranAppr.insertTranSrc(apprId, "l_ODR_NO", struct.getl_ODR_NO(),"1");                                 // óÔ
    	tranAppr.insertTranSrc(apprId, "l_h_ODR_TYP", struct.getl_h_ODR_TYP(),"0");                           // ¶æª
    	tranAppr.insertTranSrc(apprId, "l_ODR_TYP", struct.getl_ODR_TYP(), "0");                              // ¶æª
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                                  // ¾ÓæR[h
    	tranAppr.insertTranSrc(apprId, "CUST_NAME", struct.getCUST_NAME(), "0");                              // ¾Óæ¼
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_CD", struct.getl_CUST_ITEM_CD(), "0");                    // ¾ÓæiÚÔ
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_NAME", struct.getl_CUST_ITEM_NAME(), "0");                // ¾ÓæiÚ¼
    	tranAppr.insertTranSrc(apprId, "l_DESINATED_DLV_DATE", struct.getl_DESINATED_DLV_DATE(), "0");        // wè[ú
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_UNIT_PRICE", struct.getl_ESTIMATE_UNIT_PRICE(),"0");       // P¿
    	tranAppr.insertTranSrc(apprId, "l_ODR_QTY", struct.getl_ODR_QTY(), "0");                              // óÊ
    	tranAppr.insertTranSrc(apprId, "l_REMARKS", struct.getl_REMARKS(), "0");                              // õl
    	tranAppr.insertTranSrc(apprId, "l_ITEM_CD", struct.getl_ITEM_CD(), "0");                              // iÚÔ
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_ITEM_NAME", struct.getl_ESTIMATE_ITEM_NAME(), "0");        // iÚ¼
    	tranAppr.insertTranSrc(apprId, "l_CUR_UNIT", struct.getl_CUR_UNIT(), "0");                            // ÊÝPÊ
    	tranAppr.insertTranSrc(apprId, "l_ODR_ACPT_DATE", struct.getl_ODR_ACPT_DATE(), "0");                  // óú
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_CD", struct.getl_DLV_LOC_CD(), "0");                        // [iêR[h
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_NAME", struct.getl_DLV_LOC_NAME(), "0");                    // [iê¼
    	tranAppr.insertTranSrc(apprId, "l_CUST_ODR_NO", struct.getl_CUST_ODR_NO(), "0");                      // ¾Óæ¶Ô
    	tranAppr.insertTranSrc(apprId, "PROJECT_CD", struct.getPROJECT_CD(), "0");                            // ÄÔ
    	tranAppr.insertTranSrc(apprId, "ESTIMATE_NO", struct.getESTIMATE_NO(), "0");                          // ©ÏÔ
    	tranAppr.insertTranSrc(apprId, "l_DETAL_NO", struct.getl_DETAL_NO(), "0");                            // ¾×Ô
    	tranAppr.insertTranSrc(apprId, "l_h_ESTIMATE_TYPE", struct.getl_h_ESTIMATE_TYPE(), "0");              // èziÚí
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_TYPE", struct.getl_ESTIMATE_TYPE(), "0");                  // èziÚí
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");                  // óSÒR[h
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                        // óSåR[h
    	tranAppr.insertTranSrc(apprId, "l_UNIT_CD", struct.getl_UNIT_CD(), "0");                              // PÊ
    	tranAppr.insertTranSrc(apprId, "l_DEPO_TYP", struct.getl_DEPO_TYP(), "0");                            // aõqÉæª
    	tranAppr.insertTranSrc(apprId, "l_h_DEPO_TYP", struct.getl_h_DEPO_TYP(), "0");                        // aõqÉæª
    	tranAppr.insertTranSrc(apprId, "l_c_DOODR", struct.getl_c_DOODR(), "0");                              // »Ôèzð¯És¤
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_QTY", struct.getl_ESTIMATE_QTY(), "0");                    // èzÊ
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_DLV_DATE", struct.getl_JOB_ODR_DLV_DATE(), "0");            // »Ô[ú
    	tranAppr.insertTranSrc(apprId, "l_ALC_GRP_CD", struct.getl_ALC_GRP_CD(), "0");                        // øO[vR[h
    	tranAppr.insertTranSrc(apprId, "c_INPUTODRCD", struct.getl_c_INPUTODRCD(), "0");                      // »ÔðèüÍ·é
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_CD", struct.getl_JOB_ODR_CD(), "0");                        // »Ô
    }
}
