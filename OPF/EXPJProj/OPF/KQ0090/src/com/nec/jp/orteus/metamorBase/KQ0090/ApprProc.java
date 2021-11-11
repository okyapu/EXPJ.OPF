package com.nec.jp.orteus.metamorBase.KQ0090;

import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.tranappr.TranAppr;
import com.nec.jp.orteus.msg.util.Business;

public class ApprProc {
	
	/** ��ԋ敪*/
	private static final String STATUS = "1";  
	/** ��݌ɕi�󒍓o�^�@�\��*/
	private static final String INSERTURL = "KQ0090010Servlet";
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
    public static void execInsertProcess(IDbConnection conn,KQ0090010Struct struct,KQ0090010Control control) throws SQLException {
   	
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KQ0090010");   // �g�������F�˗��N���X
    	/** ���FID���擾*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [�g�������F�˗�]��o�^ */
    	tranAppr.insertTranApr(apprId,INSERTURL,"1",struct.getAPPROVED_COMMENT(),STATUS,struct.getsUser_ID(),struct.geth_BUSINESS_OPR_DATE());
    	
    	/** [�g������ʃf�[�^]��o�^ */
    	// ��ʏ������Ɏ擾�����f�[�^
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");                       // ���[�U�R�[�h
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");                   // ���[�U��
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");                     // �H��R�[�h
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");                 // �H�ꖼ
    	
    	tranAppr.insertTranSrc(apprId, "h_SYS_COMPANY_CODE", struct.geth_SYS_COMPANY_CODE(),"0");         // ���Џ��
    	tranAppr.insertTranSrc(apprId, "h_BUSINESS_OPR_DATE", struct.geth_BUSINESS_OPR_DATE(), "0");      // �Ɩ��^�p��
    	tranAppr.insertTranSrc(apprId, "SPCL_PRICE_TYP","1", "0");                                        // ���l�敪
    	tranAppr.insertTranSrc(apprId, "h_ODR_TYP", "3", "0");                                            // �����敪
    	tranAppr.insertTranSrc(apprId, "DEPO_TYP", "10", "0");                                            // �a���q�ɋ敪
    	tranAppr.insertTranSrc(apprId, "l_h_ESTIMATE_TYPE", "3", "0");                                    // ��z�i�ڎ�˂R�F��݌ɕi

    	// ��ʓ��̓f�[�^
    	tranAppr.insertTranSrc(apprId, "ORGN_ODR_NO", struct.getORGN_ODR_NO(), "0");                      // ���󒍔ԍ�
    	tranAppr.insertTranSrc(apprId, "w_ADD_ODR_FLG", ("true".equals(struct.getchkADD_ODR_FLG()) ? "1" : "0"), "0");                  // ���z�� 1 or 0
    	tranAppr.insertTranSrc(apprId, "chkADD_ODR_FLG", struct.getchkADD_ODR_FLG(), "0");;             // ���z�� true or fasle 
    	tranAppr.insertTranSrc(apprId, "ODR_ACPT_DATE", struct.getODR_ACPT_DATE(), "0");                  // �󒍓�
    	tranAppr.insertTranSrc(apprId, "CUST_ODR_NO", struct.getCUST_ODR_NO(), "0");                      // ���Ӑ撍���ԍ�
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                              // ���Ӑ�R�[�h
    	tranAppr.insertTranSrc(apprId, "CUST_ANAME", struct.getCUST_ANAME(), "0");                        // ���Ӑ於
    	tranAppr.insertTranSrc(apprId, "CUST_CHRG_PSN_CD", struct.getCUST_CHRG_PSN_CD(), "0");            // �c�ƒS���҃R�[�h
    	tranAppr.insertTranSrc(apprId, "ITEM_CD", struct.getITEM_CD(), "0");                              // �i�ڔԍ�
    	tranAppr.insertTranSrc(apprId, "ITEM_NAME", struct.getITEM_NAME(), "0");                          // �i�ږ�
    	tranAppr.insertTranSrc(apprId, "DESINATED_DLV_DATE", struct.getDESINATED_DLV_DATE(), "0");        // �w��[��
    	tranAppr.insertTranSrc(apprId, "ODR_UNIT_PRICE", struct.getODR_UNIT_PRICE(), "0");                // �P��
    	tranAppr.insertTranSrc(apprId, "ODR_QTY", struct.getODR_QTY(), "0");                              // �󒍐���
    	tranAppr.insertTranSrc(apprId, "STOCK_UNIT", struct.getSTOCK_UNIT(), "0");                        // �v�ʒP��
    	tranAppr.insertTranSrc(apprId, "ODR_AMOUNT", struct.getODR_AMOUNT(), "0");                        // �󒍋��z
    	tranAppr.insertTranSrc(apprId, "CUR_UNIT_AMOUNT", struct.getCUR_UNIT_AMOUNT(), "0");              // �ʉݒP��
    	tranAppr.insertTranSrc(apprId, "TAX_CD", struct.getTAX_CD(), "0");                                // ����ŃR�[�h
    	tranAppr.insertTranSrc(apprId, "REMARKS", struct.getREMARKS(), "0");                              // ���l
    	tranAppr.insertTranSrc(apprId, "sUser_ID", struct.getsUser_ID(), "0");                            // �V�X�e�����[�U
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");              // �󒍒S���҃R�[�h
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                    // �󒍒S������R�[�h
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
    public static void execUpdateProcess(IDbConnection conn,KQ0090010Struct struct,KQ0090010Control control,String procTyp) throws SQLException {
    	TranAppr tranAppr = new TranAppr(conn,struct.getsUser_ID(),"KQ0090010");   // �g�������F�˗��N���X
    	/** �˗����݃`�F�b�N�i�󒍔ԍ��Łj*/
    	boolean checkFlg = tranAppr.selectTranSrc("ODR_NO", struct.getODR_NO());
    	if (checkFlg) {
    		control.setAppErrorMessage("KA00125");
    		return;
    	}
    	
    	/** ���FID���擾*/
    	String apprId = tranAppr.selectSEQ_APPR_ID();

    	/** [�g�������F�˗�]��o�^ */
    	tranAppr.insertTranApr(apprId,INSERTURL,procTyp,struct.getAPPROVED_COMMENT(),STATUS,struct.getsUser_ID(),struct.geth_BUSINESS_OPR_DATE());
    	
    	/** [�g������ʃf�[�^]��o�^ */
    	// ��ʏ������Ɏ擾�����f�[�^
    	tranAppr.insertTranSrc(apprId, "sysUSER_CD", control.getsysUSER_CD(), "2");                        // ���[�U�R�[�h
    	tranAppr.insertTranSrc(apprId, "sysUSER_NAME", control.getsysUSER_NAME(), "2");                    // ���[�U��
    	tranAppr.insertTranSrc(apprId, "sysPLANT_CD", control.getsysPLANT_CD(), "2");                      // �H��R�[�h
    	tranAppr.insertTranSrc(apprId, "sysPLANT_NAME", control.getsysPLANT_NAME(), "2");                  // �H�ꖼ 
    	
    	
    	tranAppr.insertTranSrc(apprId, "h_SYS_COMPANY_CODE", struct.geth_SYS_COMPANY_CODE(),"0");         // ���Џ��
    	tranAppr.insertTranSrc(apprId, "h_BUSINESS_OPR_DATE", struct.geth_BUSINESS_OPR_DATE(), "0");      // �Ɩ��^�p��
    	tranAppr.insertTranSrc(apprId, "SPCL_PRICE_TYP","1", "0");                                        // ���l�敪
    	tranAppr.insertTranSrc(apprId, "h_ODR_TYP", "3", "0");                                            // �����敪
    	tranAppr.insertTranSrc(apprId, "DEPO_TYP", "10", "0");                                            // �a���q�ɋ敪
    	tranAppr.insertTranSrc(apprId, "l_h_ESTIMATE_TYPE", "3", "0");                                    // ��z�i�ڎ�˂R�F��݌ɕi
    	
    	// ��ʓ��̓f�[�^
    	tranAppr.insertTranSrc(apprId, "ODR_NO", struct.getODR_NO(), "1");                                // ���͏���_�󒍔ԍ�
    	tranAppr.insertTranSrc(apprId, "ORGN_ODR_NO", struct.getORGN_ODR_NO(), "0");                      // ���󒍔ԍ�
    	tranAppr.insertTranSrc(apprId, "w_ADD_ODR_FLG", ("true".equals(struct.getchkADD_ODR_FLG()) ? "1" : "0"), "0");                  // ���z��
    	tranAppr.insertTranSrc(apprId, "chkADD_ODR_FLG", struct.getchkADD_ODR_FLG(), "0");;             // ���z�� true or fasle 
    	tranAppr.insertTranSrc(apprId, "ODR_ACPT_DATE", struct.getODR_ACPT_DATE(), "0");                  // �󒍓�
    	tranAppr.insertTranSrc(apprId, "CUST_ODR_NO", struct.getCUST_ODR_NO(), "0");                      // ���Ӑ撍���ԍ�
    	tranAppr.insertTranSrc(apprId, "CUST_CD", struct.getCUST_CD(), "0");                              // ���Ӑ�R�[�h
    	tranAppr.insertTranSrc(apprId, "CUST_ANAME", struct.getCUST_ANAME(), "0");                        // ���Ӑ於
    	tranAppr.insertTranSrc(apprId, "CUST_CHRG_PSN_CD", struct.getCUST_CHRG_PSN_CD(), "0");            // �c�ƒS���҃R�[�h
    	tranAppr.insertTranSrc(apprId, "ITEM_CD", struct.getITEM_CD(), "0");                              // �i�ڔԍ�
    	tranAppr.insertTranSrc(apprId, "ITEM_NAME", struct.getITEM_NAME(), "0");                          // �i�ږ�
    	tranAppr.insertTranSrc(apprId, "DESINATED_DLV_DATE", struct.getDESINATED_DLV_DATE(), "0");        // �w��[��
    	tranAppr.insertTranSrc(apprId, "ODR_UNIT_PRICE", struct.getODR_UNIT_PRICE(), "0");                // �P��
    	tranAppr.insertTranSrc(apprId, "ODR_QTY", struct.getODR_QTY(), "0");                              // �󒍐���
    	tranAppr.insertTranSrc(apprId, "STOCK_UNIT", struct.getSTOCK_UNIT(), "0");                        // �v�ʒP��
    	tranAppr.insertTranSrc(apprId, "ODR_AMOUNT", struct.getODR_AMOUNT(), "0");                        // �󒍋��z
    	tranAppr.insertTranSrc(apprId, "CUR_UNIT_AMOUNT", struct.getCUR_UNIT_AMOUNT(), "0");              // �ʉݒP��
    	tranAppr.insertTranSrc(apprId, "TAX_CD", struct.getTAX_CD(), "0");                                // ����ŃR�[�h
    	tranAppr.insertTranSrc(apprId, "REMARKS", struct.getREMARKS(), "0");                              // ���l
    	tranAppr.insertTranSrc(apprId, "sUser_ID", struct.getsUser_ID(), "0");                            // �V�X�e�����[�U
    	tranAppr.insertTranSrc(apprId, "h_MODIFY_COUNT", struct.geth_MODIFY_COUNT(), "0");                // �X�V��
    	tranAppr.insertTranSrc(apprId, "l_OWN_PERSON_CD", struct.getl_OWN_PERSON_CD(), "0");              // �󒍒S���҃R�[�h
    	tranAppr.insertTranSrc(apprId, "l_OWN_ORG_CD", struct.getl_OWN_ORG_CD(), "0");                    // �󒍒S������R�[�h
    }
}
