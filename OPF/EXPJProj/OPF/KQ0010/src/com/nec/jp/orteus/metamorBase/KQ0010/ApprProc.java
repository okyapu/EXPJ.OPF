package com.nec.jp.orteus.metamorBase.KQ0010;

import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.tranappr.TranAppr;
import com.nec.jp.orteus.msg.util.Business;

public class ApprProc {
	
	/** ��ԋ敪*/
	private static final String STATUS = "1";  
	/** �󒍓o�^�@�\��*/
	private static final String INSERTURL = "KQ0010010Servlet";
	/** �󒍏��C���@�\��*/
	private static final String UPDATETURL = "KQ0010020Servlet";
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
    public static void execInsertProcess(IDbConnection conn,KQ0010010Struct struct,KQ0010010Control control) throws SQLException {
   	
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KQ0010010");   // �g�������F�˗��N���X
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
    	tranAppr.insertTranSrc(apprId, "l_ODR_TYP", struct.getl_ODR_TYP(),"0");                         // �����敪
    	tranAppr.insertTranSrc(apprId, "l_CUST_ODR_NO", struct.getl_CUST_ODR_NO(), "0");                // ���Ӑ撍���ԍ�
    	tranAppr.insertTranSrc(apprId, "l_CUST_CD", struct.getl_CUST_CD(), "0");                        // ���Ӑ�R�[�h
    	tranAppr.insertTranSrc(apprId, "l_CUST_ANAME", struct.getl_CUST_ANAME(), "0");                  // ���Ӑ旪��
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_CD", struct.getl_CUST_ITEM_CD(), "0");              // ���Ӑ�i�ڔԍ�
    	tranAppr.insertTranSrc(apprId, "l_CUST_ITEM_NAME", struct.getl_CUST_ITEM_NAME(), "0");          // ���Ӑ�i�ږ�
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_CD", struct.getl_DLV_LOC_CD(), "0");                  // �[�i�ꏊ�R�[�h
    	tranAppr.insertTranSrc(apprId, "l_DLV_LOC_NAME", struct.getl_DLV_LOC_NAME(), "0");              // �[�i�ꏊ��
    	tranAppr.insertTranSrc(apprId, "l_DESINATED_DLV_DATE", struct.getl_DESINATED_DLV_DATE(), "0");  // �w��[��
    	tranAppr.insertTranSrc(apprId, "l_SPCL_PRICE_TYP", struct.getl_SPCL_PRICE_TYP(), "0");          // ���l�敪
    	tranAppr.insertTranSrc(apprId, "l_ODR_UNIT_PRICE", struct.getl_ODR_UNIT_PRICE(), "0");          // �P��
    	tranAppr.insertTranSrc(apprId, "l_ODR_QTY", struct.getl_ODR_QTY(), "0");                        // �󒍐���
    	tranAppr.insertTranSrc(apprId, "l_CUR_CD", struct.getl_CUR_CD(), "0");                          // �ʉ݃R�[�h
    	tranAppr.insertTranSrc(apprId, "l_CUR_UNIT", struct.getl_CUR_UNIT(), "0");                      // �ʉ�
    	tranAppr.insertTranSrc(apprId, "l_UNIT_CD", struct.getl_UNIT_CD(), "0");                        // �P��
    	tranAppr.insertTranSrc(apprId, "l_REMARKS", struct.getl_REMARKS(), "0");                        // ���l
    	tranAppr.insertTranSrc(apprId, "l_ODR_ACPT_DATE", struct.getl_ODR_ACPT_DATE(), "0");            // �󒍓�
    	tranAppr.insertTranSrc(apprId, "l_ITEM_CD", struct.getl_ITEM_CD(), "0");                        // �i�ڔԍ�
    	tranAppr.insertTranSrc(apprId, "l_ITEM_NAME", struct.getl_ITEM_NAME(), "0");                    // �i�ږ�    	
    	tranAppr.insertTranSrc(apprId, "l_DEPO_TYP", struct.getl_DEPO_TYP(), "0");                      // �a���q�ɋ敪
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_CD", struct.getl_JOB_ODR_CD(), "0");                  // ����
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_QTY", struct.getl_JOB_ODR_QTY(), "0");                // ���Ԑ�
    	tranAppr.insertTranSrc(apprId, "l_JOB_ODR_DLV_DATE", struct.getl_JOB_ODR_DLV_DATE(), "0");      // ���Ԕ[��
    	tranAppr.insertTranSrc(apprId, "l_ALC_GRP_CD", struct.getl_ALC_GRP_CD(), "0");                  // �����O���[�v�R�[�h
    	tranAppr.insertTranSrc(apprId, "h_DOODRFLG", struct.geth_DOODRFLG(), "0");                      // ���Ԏ�z�𓯎��ɍs��
    	tranAppr.insertTranSrc(apprId, "h_INPUTODRCDFLG", struct.geth_INPUTODRCDFLG(), "0");            // ���Ԃ�����͂���
    	tranAppr.insertTranSrc(apprId, "h_MRP_ODR_TYP", struct.geth_MRP_ODR_TYP(), "0");                // �i�ڎ�z�敪
    	tranAppr.insertTranSrc(apprId, "h_SHIP_PLANT_CD", struct.geth_SHIP_PLANT_CD(), "0");            // �H��R�[�h
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                  // �󒍒S������
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");            // �󒍒S����
    	tranAppr.insertTranSrc(apprId, "sUser_ID", struct.getsUser_ID(), "0");                          // �V�X�e�����[�U
    	
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
    public static void execUpdateProcess(IDbConnection conn,KQ0010020Struct struct,KQ0010020Control control,String procTyp) throws SQLException {
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KQ0010010");   // �g�������F�˗��N���X
    	/** �˗����݃`�F�b�N�i�󒍔ԍ��Łj*/
    	boolean checkFlg = tranAppr.selectTranSrc("IN_ODR_NO", struct.getIN_ODR_NO());
    	if (checkFlg) {
    		control.setAppErrorMessage("KA00125");
    		return;
    	}
    	
    	/** ���FID���擾*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [�g�������F�˗�]��o�^ */
    	tranAppr.insertTranApr(apprId,UPDATETURL,procTyp,struct.getAPPR_REMARKS(),STATUS,struct.getsUser_ID(),control.get_businessOprDate());
    	
    	/** [�g������ʃf�[�^]��o�^ */
    	// ��ʏ������Ɏ擾�����f�[�^
    	tranAppr.insertTranSrc(apprId, "_companyCd", control.get_companyCd(),"2");                         // ���Џ��
    	tranAppr.insertTranSrc(apprId, "_plantWeb", control.get_plantWeb(), "2");                          // �̔��Ǘ��p�H��R�[�h
    	tranAppr.insertTranSrc(apprId, "_businessOprDate", control.get_businessOprDate(), "2");            // �Ɩ��^�p��
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");          // ���[�U�R�[�h
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");      // ���[�U��
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");        // �H��R�[�h
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");    // �H�ꖼ   	
    	// ��ʓ��̓f�[�^
    	tranAppr.insertTranSrc(apprId, "IN_ODR_NO", struct.getIN_ODR_NO(),"1");                         // �󒍔ԍ�
    	tranAppr.insertTranSrc(apprId, "h_ODR_NO", struct.geth_ODR_NO(),"0");                           // �󒍔ԍ�
    	tranAppr.insertTranSrc(apprId, "ODR_QTY", struct.getODR_QTY(), "0");                            // �󒍐���
    	tranAppr.insertTranSrc(apprId, "h_ODR_QTY", struct.geth_ODR_QTY(), "0");                        // �󒍐���
    	tranAppr.insertTranSrc(apprId, "DESINATED_DLV_DATE", struct.getDESINATED_DLV_DATE(), "0");      // �w��[��
    	tranAppr.insertTranSrc(apprId, "h_DESINATED_DLV_DATE", struct.geth_DESINATED_DLV_DATE(), "0");  // �w��[��
    	tranAppr.insertTranSrc(apprId, "SPCL_PRICE_TYP", struct.getSPCL_PRICE_TYP(), "0");              // ���l�敪
    	tranAppr.insertTranSrc(apprId, "h_SPCL_PRICE_TYP", struct.geth_SPCL_PRICE_TYP(), "0");          // ���l�敪
    	tranAppr.insertTranSrc(apprId, "ODR_UNIT_PRICE", struct.getODR_UNIT_PRICE(), "0");              // �P��
    	tranAppr.insertTranSrc(apprId, "h_ODR_UNIT_PRICE", struct.geth_ODR_UNIT_PRICE(), "0");          // �P��
    	tranAppr.insertTranSrc(apprId, "CUS_DLV_KEY_CD", struct.getCUS_DLV_KEY_CD(), "0");              // �[�i�L�[�ԍ�
    	tranAppr.insertTranSrc(apprId, "CUS_DLV_CD", struct.getCUS_DLV_CD(), "0");                      // �[���ԍ�
    	tranAppr.insertTranSrc(apprId, "REMARKS", struct.getREMARKS(), "0");                            // ���l
    	tranAppr.insertTranSrc(apprId, "DLV_LOC_CD", struct.getDLV_LOC_CD(), "0");                      // �[�i�ꏊ�R�[�h
    	tranAppr.insertTranSrc(apprId, "h_DLV_LOC_CD", struct.geth_DLV_LOC_CD(), "0");                  // �[�i�ꏊ�R�[�h
    	tranAppr.insertTranSrc(apprId, "DLV_LOC_NAME_KANJI", struct.getDLV_LOC_NAME_KANJI(), "0");      // �[�i�ꏊ��
    	tranAppr.insertTranSrc(apprId, "CUST_ODR_NO", struct.getCUST_ODR_NO(), "0");                    // ���Ӑ撍���ԍ�	
    	tranAppr.insertTranSrc(apprId, "ITEM_CD", struct.getITEM_CD(), "0");                            // �i�ڔԍ�
    	tranAppr.insertTranSrc(apprId, "ITEM_NAME", struct.getITEM_NAME(), "0");                        // �i�ږ�    	
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                            // ���Ӑ�R�[�h
    	tranAppr.insertTranSrc(apprId, "CUST_ANAME", struct.getCUST_ANAME(), "0");                      // ���Ӑ於
    	tranAppr.insertTranSrc(apprId, "CUST_ITEM_CD", struct.getCUST_ITEM_CD(), "0");                  // ���Ӑ�i�ڔԍ�
    	tranAppr.insertTranSrc(apprId, "CUST_ITEM_NAME", struct.getCUST_ITEM_NAME(), "0");              // ���Ӑ�i�ږ�
    	tranAppr.insertTranSrc(apprId, "ODR_TYP", struct.getODR_TYP(), "0");                            // �����敪��
    	tranAppr.insertTranSrc(apprId, "h_ODR_TYP", struct.geth_ODR_TYP(), "0");                                        // �����敪
    	tranAppr.insertTranSrc(apprId, "h_REMAIN_UNCONFIRM_ODR_QTY", struct.geth_REMAIN_UNCONFIRM_ODR_QTY(), "0");      // �����c����
    	tranAppr.insertTranSrc(apprId, "h_SHIP_PLAN_REMAIN_QTY", struct.geth_SHIP_PLAN_REMAIN_QTY(), "0");              // �o�׌v��c����
    	tranAppr.insertTranSrc(apprId, "h_ANS_DLV_DATE_EXIST_FLG", struct.geth_ANS_DLV_DATE_EXIST_FLG(), "0");          // �o�׌v�摶�݃t���O
    	tranAppr.insertTranSrc(apprId, "h_T_SHIP_ODR_EXIST_FLG", struct.geth_T_SHIP_ODR_EXIST_FLG(), "0");              // �o�׎w�����݃t���O
    	tranAppr.insertTranSrc(apprId, "h_MODIFY_COUNT", struct.geth_MODIFY_COUNT(), "0");                              // �X�V��
    	tranAppr.insertTranSrc(apprId, "h_BUSINESS_OPR_DATE", struct.geth_BUSINESS_OPR_DATE(), "0");                    // �Ɩ����t
    	tranAppr.insertTranSrc(apprId, "UNIT_CD", struct.getUNIT_CD(), "0");                                            // �P��
    	tranAppr.insertTranSrc(apprId, "UNIT_NAME", struct.getUNIT_NAME(), "0");                                        // �P�ʖ�
    	tranAppr.insertTranSrc(apprId, "UNIT_QTY_TYP", struct.getUNIT_QTY_TYP(), "0");                                  // �݌ɐ��P�ʋ敪
    	tranAppr.insertTranSrc(apprId, "STOCK_UNIT", struct.getSTOCK_UNIT(), "0");                                      // �v�ʒP��
    	tranAppr.insertTranSrc(apprId, "h_ALCTED_UNCONFIRM_ODR_QTY", struct.geth_ALCTED_UNCONFIRM_ODR_QTY(), "0");      // ��������
    	tranAppr.insertTranSrc(apprId, "CUST_CHRG_ORG_CD", struct.getCUST_CHRG_ORG_CD(), "0");                          // �󒍒S������
    	tranAppr.insertTranSrc(apprId, "ODR_ACPT_DATE", struct.getODR_ACPT_DATE(), "0");                                // �󒍓�
    	tranAppr.insertTranSrc(apprId, "DEPO_TYP", struct.getDEPO_TYP(), "0");                                          // �a���q�ɋ敪
    	tranAppr.insertTranSrc(apprId, "sUser_ID", struct.getsUser_ID(), "0");                                          // �V�X�e�����[�U
    	
    	/** ���F�˗��������b�Z�W�[���o��*/
    	control.setInfoMessage("AZ00042");
    }    
}
