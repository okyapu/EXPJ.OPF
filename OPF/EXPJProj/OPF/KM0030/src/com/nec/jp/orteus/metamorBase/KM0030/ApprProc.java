package com.nec.jp.orteus.metamorBase.KM0030;

import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.tranappr.TranAppr;
import com.nec.jp.orteus.msg.util.Business;

public class ApprProc {
	
	/** ��ԋ敪*/
	private static final String STATUS = "1";  
	/** �Č��󒍓o�^�@�\��*/
	private static final String INSERTURL = "KM0030010Servlet";
	/** �R�l�N�V�����N���X */
	protected IDbConnection _conn;
	
	public ApprProc (IDbConnection connect) {
		_conn = connect;
	}
	

	/**
	 * �󒍏��F�˗�����(�o�^)
	 * @param apprId      ���FID
	 * @param screenUrl   ���URL
	 * @param procTyp     �����敪 
	 * @param apprRemarks ���F���l
	 * @param status      ��ԋ敪
	 * @param requestBy   �˗���
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
    public static void execInsertProcess(IDbConnection conn,KM0030010Struct struct,KM0030010Control control) throws SQLException {
   	
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KM0030010");   // �g�������F�˗��N���X
    	/** ���FID���擾*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [�g�������F�˗�]��o�^ */
    	tranAppr.insertTranApr(apprId,INSERTURL,"1",struct.getl_APPR_REMARKS(),STATUS,struct.getsUser_ID(),control.get_businessOprDate());
    	
    	/** [�g������ʃf�[�^]��o�^ */
    	// ��ʏ������Ɏ擾�����f�[�^
    	tranAppr.insertTranSrc(apprId, "_companyCd", control.get_companyCd(),"2");                         // ���Џ��
    	tranAppr.insertTranSrc(apprId, "_plantWeb", control.get_plantWeb(), "2");                          // �̔��Ǘ��p�H��R�[�h
    	tranAppr.insertTranSrc(apprId, "_businessOprDate", control.get_businessOprDate(), "2");            // �Ɩ��^�p��
    	tranAppr.insertTranSrc(apprId, "_homeCurCd", control.get_homeCurCd(), "2");                        // �M�݃R�[�h
    	tranAppr.insertTranSrc(apprId, "_shipLt", control.get_shipLt(), "2");                              // �o�׏���L/T
    	tranAppr.insertTranSrc(apprId, "_dlvDateCdt", control.get_dlvDateCdt(), "2");                      // �Z�[���̔������
    	tranAppr.insertTranSrc(apprId, "PRD_REQ_JOB_ODR_TYP_1", control.getPRD_REQ_JOB_ODR_TYP_1(), "2");  // �V�X�p���@[�󒍎����ԓo�^]
    	tranAppr.insertTranSrc(apprId, "PRD_REQ_JOB_ODR_TYP_2", control.getPRD_REQ_JOB_ODR_TYP_2(), "2");  // �V�X�p���A[�󒍎����ԓo�^]
    	
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");          // ���[�U�R�[�h
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");      // ���[�U��
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");        // �H��R�[�h
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");    // �H�ꖼ
	
    	
    	// ��ʓ��̓f�[�^
    	tranAppr.insertTranSrc(apprId, "l_h_ODR_TYP", struct.getl_h_ODR_TYP(),"0");                           // �����敪
    	tranAppr.insertTranSrc(apprId, "l_ODR_TYP", struct.getl_ODR_TYP(), "0");                              // �����敪
    	tranAppr.insertTranSrc(apprId, "l_CUST_ODR_NO", struct.getl_CUST_ODR_NO(), "0");                      // ���Ӑ撍���ԍ�
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                                  // ���Ӑ�R�[�h
    	tranAppr.insertTranSrc(apprId, "CUST_NAME", struct.getCUST_NAME(), "0");                              // ���Ӑ於
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_CD", struct.getl_CUST_ITEM_CD(), "0");                    // ���Ӑ�i�ڔԍ�
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_NAME", struct.getl_CUST_ITEM_NAME(), "0");                // ���Ӑ�i�ږ�
    	tranAppr.insertTranSrc(apprId, "l_ITEM_CD", struct.getl_ITEM_CD(), "0");                              // �i�ڔԍ�
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_CD", struct.getl_DLV_LOC_CD(), "0");                        // �[�i�ꏊ�R�[�h
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_NAME", struct.getl_DLV_LOC_NAME(), "0");                    // �[�i�ꏊ��
    	tranAppr.insertTranSrc(apprId, "l_DESINATED_DLV_DATE", struct.getl_DESINATED_DLV_DATE(), "0");        // �w��[��
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_UNIT_PRICE", struct.getl_ESTIMATE_UNIT_PRICE(), "0");      // �P��
    	tranAppr.insertTranSrc(apprId, "l_ODR_QTY", struct.getl_ODR_QTY(), "0");                              // �󒍐���
    	tranAppr.insertTranSrc(apprId, "l_CUR_UNIT", struct.getl_CUR_UNIT(), "0");                            // �ʉݒP��
    	tranAppr.insertTranSrc(apprId, "l_REMARKS", struct.getl_REMARKS(), "0");                              // ���l
    	tranAppr.insertTranSrc(apprId, "l_ODR_ACPT_DATE", struct.getl_ODR_ACPT_DATE(), "0");                  // �󒍓�
    	tranAppr.insertTranSrc(apprId, "l_c_DOODR", struct.getl_c_DOODR(), "0");                              // ���Ԏ�z�𓯎��ɍs��
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_QTY", struct.getl_ESTIMATE_QTY(), "0");                    // ��z����
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_DLV_DATE", struct.getl_JOB_ODR_DLV_DATE(), "0");            // ���Ԕ[��
    	tranAppr.insertTranSrc(apprId, "l_ALC_GRP_CD", struct.getl_ALC_GRP_CD(), "0");                        // �����O���[�v�R�[�h
    	tranAppr.insertTranSrc(apprId, "c_INPUTODRCD", struct.getl_c_INPUTODRCD(), "0");                      // ���Ԃ�����͂���
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_CD", struct.getl_JOB_ODR_CD(), "0");                        // ����
    	tranAppr.insertTranSrc(apprId, "PROJECT_CD", struct.getPROJECT_CD(), "0");                            // �Č��ԍ�
    	tranAppr.insertTranSrc(apprId, "ESTIMATE_NO", struct.getESTIMATE_NO(), "0");                          // ���ϔԍ�
    	tranAppr.insertTranSrc(apprId, "l_DETAL_NO", struct.getl_DETAL_NO(), "0");                            // ���הԍ�
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_ITEM_NAME", struct.getl_ESTIMATE_ITEM_NAME(), "0");        // �i�ږ�
    	tranAppr.insertTranSrc(apprId, "l_h_ESTIMATE_TYPE", struct.getl_h_ESTIMATE_TYPE(), "0");              // ��z�i�ڎ�
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_TYPE", struct.getl_ESTIMATE_TYPE(), "0");                  // ��z�i�ڎ�
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");                  // �󒍒S���҃R�[�h
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                        // �󒍒S������R�[�h
    	tranAppr.insertTranSrc(apprId, "l_UNIT_CD", struct.getl_UNIT_CD(), "0");                              // �P��
    	tranAppr.insertTranSrc(apprId, "l_DEPO_TYP", struct.getl_DEPO_TYP(), "0");                            // �a���q�ɋ敪
    	tranAppr.insertTranSrc(apprId, "l_h_DEPO_TYP", struct.getl_h_DEPO_TYP(), "0");                        // �a���q�ɋ敪
    }

    
    
    
    /**
	 * �󒍏��F�˗�����(�C���A�폜)
	 * @param apprId      ���FID
	 * @param screenUrl   ���URL
	 * @param procTyp     �����敪 
	 * @param apprRemarks ���F���l
	 * @param status      ��ԋ敪
	 * @param requestBy   �˗���
	 * @return ���U���g�Z�b�g
	 * @throws SQLException DB�A�N�Z�X�G���[
	 */
    public static void execUpdateProcess(IDbConnection conn,KM0030010Struct struct,KM0030010Control control,String procTyp) throws SQLException {
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KM0030010");   // �g�������F�˗��N���X
    	/** �˗����݃`�F�b�N�i�󒍔ԍ��Łj*/
    	boolean checkFlg = tranAppr.selectTranSrc("l_ODR_NO", struct.getl_ODR_NO());
    	if (checkFlg) {
    		control.setErrorMessage("KA00125", null);
    		return;
    	}
    	
    	/** ���FID���擾*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [�g�������F�˗�]��o�^ */
    	tranAppr.insertTranApr(apprId,INSERTURL,procTyp,struct.getl_APPR_REMARKS(),STATUS,struct.getsUser_ID(),control.get_businessOprDate());
    	
    	/** [�g������ʃf�[�^]��o�^ */
    	// ��ʏ������Ɏ擾�����f�[�^
    	tranAppr.insertTranSrc(apprId, "_companyCd", control.get_companyCd(),"2");                         // ���Џ��
    	tranAppr.insertTranSrc(apprId, "_businessOprDate", control.get_businessOprDate(), "2");            // �Ɩ��^�p��
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");                        // ���[�U�R�[�h
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");                    // ���[�U��
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");                      // �H��R�[�h
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");                  // �H�ꖼ   	
    	// ��ʓ��̓f�[�^
    	tranAppr.insertTranSrc(apprId, "l_ODR_NO", struct.getl_ODR_NO(),"1");                                 // �󒍔ԍ�
    	tranAppr.insertTranSrc(apprId, "l_h_ODR_TYP", struct.getl_h_ODR_TYP(),"0");                           // �����敪
    	tranAppr.insertTranSrc(apprId, "l_ODR_TYP", struct.getl_ODR_TYP(), "0");                              // �����敪
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                                  // ���Ӑ�R�[�h
    	tranAppr.insertTranSrc(apprId, "CUST_NAME", struct.getCUST_NAME(), "0");                              // ���Ӑ於
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_CD", struct.getl_CUST_ITEM_CD(), "0");                    // ���Ӑ�i�ڔԍ�
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_NAME", struct.getl_CUST_ITEM_NAME(), "0");                // ���Ӑ�i�ږ�
    	tranAppr.insertTranSrc(apprId, "l_DESINATED_DLV_DATE", struct.getl_DESINATED_DLV_DATE(), "0");        // �w��[��
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_UNIT_PRICE", struct.getl_ESTIMATE_UNIT_PRICE(),"0");       // �P��
    	tranAppr.insertTranSrc(apprId, "l_ODR_QTY", struct.getl_ODR_QTY(), "0");                              // �󒍐���
    	tranAppr.insertTranSrc(apprId, "l_REMARKS", struct.getl_REMARKS(), "0");                              // ���l
    	tranAppr.insertTranSrc(apprId, "l_ITEM_CD", struct.getl_ITEM_CD(), "0");                              // �i�ڔԍ�
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_ITEM_NAME", struct.getl_ESTIMATE_ITEM_NAME(), "0");        // �i�ږ�
    	tranAppr.insertTranSrc(apprId, "l_CUR_UNIT", struct.getl_CUR_UNIT(), "0");                            // �ʉݒP��
    	tranAppr.insertTranSrc(apprId, "l_ODR_ACPT_DATE", struct.getl_ODR_ACPT_DATE(), "0");                  // �󒍓�
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_CD", struct.getl_DLV_LOC_CD(), "0");                        // �[�i�ꏊ�R�[�h
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_NAME", struct.getl_DLV_LOC_NAME(), "0");                    // �[�i�ꏊ��
    	tranAppr.insertTranSrc(apprId, "l_CUST_ODR_NO", struct.getl_CUST_ODR_NO(), "0");                      // ���Ӑ撍���ԍ�
    	tranAppr.insertTranSrc(apprId, "PROJECT_CD", struct.getPROJECT_CD(), "0");                            // �Č��ԍ�
    	tranAppr.insertTranSrc(apprId, "ESTIMATE_NO", struct.getESTIMATE_NO(), "0");                          // ���ϔԍ�
    	tranAppr.insertTranSrc(apprId, "l_DETAL_NO", struct.getl_DETAL_NO(), "0");                            // ���הԍ�
    	tranAppr.insertTranSrc(apprId, "l_h_ESTIMATE_TYPE", struct.getl_h_ESTIMATE_TYPE(), "0");              // ��z�i�ڎ�
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_TYPE", struct.getl_ESTIMATE_TYPE(), "0");                  // ��z�i�ڎ�
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");                  // �󒍒S���҃R�[�h
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                        // �󒍒S������R�[�h
    	tranAppr.insertTranSrc(apprId, "l_UNIT_CD", struct.getl_UNIT_CD(), "0");                              // �P��
    	tranAppr.insertTranSrc(apprId, "l_DEPO_TYP", struct.getl_DEPO_TYP(), "0");                            // �a���q�ɋ敪
    	tranAppr.insertTranSrc(apprId, "l_h_DEPO_TYP", struct.getl_h_DEPO_TYP(), "0");                        // �a���q�ɋ敪
    	tranAppr.insertTranSrc(apprId, "l_c_DOODR", struct.getl_c_DOODR(), "0");                              // ���Ԏ�z�𓯎��ɍs��
    	tranAppr.insertTranSrc(apprId, "l_ESTIMATE_QTY", struct.getl_ESTIMATE_QTY(), "0");                    // ��z����
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_DLV_DATE", struct.getl_JOB_ODR_DLV_DATE(), "0");            // ���Ԕ[��
    	tranAppr.insertTranSrc(apprId, "l_ALC_GRP_CD", struct.getl_ALC_GRP_CD(), "0");                        // �����O���[�v�R�[�h
    	tranAppr.insertTranSrc(apprId, "c_INPUTODRCD", struct.getl_c_INPUTODRCD(), "0");                      // ���Ԃ�����͂���
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_CD", struct.getl_JOB_ODR_CD(), "0");                        // ����
    }
}
