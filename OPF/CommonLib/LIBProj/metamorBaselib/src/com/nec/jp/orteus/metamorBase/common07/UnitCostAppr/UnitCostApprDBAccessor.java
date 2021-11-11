package com.nec.jp.orteus.metamorBase.common07.UnitCostAppr;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.wa.DataObject;

public class UnitCostApprDBAccessor extends DataObject {
	
	/** �w���P�����F�˗��Ǎ��p��SQL*/
	private String _selectM_PUCH_UNIT_COST_APPR = "SELECT "
		+"  A.\"PROC_TYP\" AS PROC_TYP, "                  							// �����敪
		+"  A.\"APPR_REMARKS\" AS APPR_REMARKS, "         							// ���F���l
		+"  A.\"ITEM_CD\" AS ITEM_CD, "					   							// �i�ڔԍ�	 							
		+"  B.\"ITEM_NAME\" AS ITEM_NAME, "                							// �i�ږ�
		+"  C.\"VEND_NAME\" AS VEND_NAME, "                							// ����於
		+"  A.\"VEND_CD\" AS VEND_CD, "                    							// �����R�[�h
		+"  '' AS CUST_NAME, "                             							// ���Ӑ於
		+"  '' AS CUST_CD, "                               							// ���Ӑ�R�[�h
		+"  '' AS PROC_NAME, "                             							// �i�ڍ�ʍ�Ɩ�
		+"  '' AS PROC_CD, "                               							// �i�ڍ�ʍ�ƃR�[�h
		+"  TO_CHAR(A.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "   // �L���J�n��
		+"  A.\"UNIT_COST\" AS UNIT_COST, "                     					// �P��
		+"  A.\"UNIT_COST_TYP\" AS UNIT_COST_TYP, "             					// �P���敪
		+"  A.\"PROCESSING_COST\" AS PROCESSING_COST, "         					// ���H��
		+"  A.\"MATERIAL_COST\" AS MATERIAL_COST, "             					// �ޗ���
		+"  A.\"OTHER_OVERHEADS\" AS OTHER_OVERHEADS, "         					// ���̑��o��
		+"  D.\"CUR_NAME\" AS CUR_NAME, "                       					// �ʉ�
		+"  A.\"PUCH_SIZE\" AS PUCH_SIZE, "                     					// �T�C�Y
		+"  '' AS ONEROUS_FLG, "                                					// �L���t���O
		+"  E.\"USER_NAME\" AS REQUEST_BY_NAME, "                					// �˗��Җ�
		+"  A.\"REQUEST_BY\" AS REQUEST_BY, "                   					// �˗��҃R�[�h
		+"  A.\"RESERVE_CAUSE\" AS RESERVE_CAUSE, "             					// �ۗ����R
		+"  A.\"MODIFY_COUNT\" AS MODIFY_COUNT, "                					// �X�V��
		+"  '' AS PURPOSE_UNIT_PRICE_TYP "                                          // �p�r�ʒP���敪
		+"FROM "   
		+"  M_PUCH_UNIT_COST_APPR A, "
		+"  M_ITEM B, "
		+"  M_VEND_CTRL C, "
		+"  M_CUR D, "
		+"  USER_MST E "
		+"WHERE "
		+"  A.PLANT_CD = ? "
		+"  AND A.STATUS = ? "
		+"  AND A.ITEM_CD = B.ITEM_CD "
		+"  AND A.VEND_CD = C.VEND_CD "
		+"  AND A.VEND_CD = C.VEND_CD "
		+"  AND C.CUR_CD = D.CUR_CD "
		+"  AND A.REQUEST_BY = E.USER_CD "
		+"ORDER BY "
		+"  A.PROC_TYP, "
		+"  A.CREATED_DATE ";
	
	/** �w���P���w�b�_�`�F�b�N�p��SQL*/
	private String _checkM_PUCH_UNIT_COST_H = "SELECT "
		+" A.EFF_PHASE_IN_DATE "
		+"FROM "
		+"  M_PUCH_UNIT_COST A "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE <> ? "
		+"UNION "
		+"SELECT "
		+"  B.EFF_PHASE_IN_DATE "
		+"FROM "
		+"  M_PUCH_UNIT_COST_APPR B "
		+"WHERE "
		+"  B.COMPANY_CD = ? "
		+"  AND B.VEND_CD = ? "
		+"  AND B.PLANT_CD = ? "
		+"  AND B.ITEM_CD = ? "
		+"  AND B.EFF_PHASE_IN_DATE <> ? "
		+"  AND B.PUCH_SIZE <> ? "
		+"  AND B.STATUS IN (1, 2) ";

	
	/** �x���i�P�����F�˗��Ǎ��p��SQL*/
	private String _selectM_CONS_UNIT_COST_APPR = "SELECT "
		+"  A.\"PROC_TYP\" AS PROC_TYP, "											// �����敪
		+"  A.\"APPR_REMARKS\" AS APPR_REMARKS, "									// ���F���l
		+"  A.\"ITEM_CD\" AS ITEM_CD, "												// �i�ڔԍ�	 	
		+"  B.\"ITEM_NAME\" AS ITEM_NAME, "                							// �i�ږ�
		+"  C.\"VEND_NAME\" AS VEND_NAME, "                							// ����於
		+"  A.\"VEND_CD\" AS VEND_CD, "                    							// �����R�[�h
		+"  '' AS CUST_NAME, "                             							// ���Ӑ於
		+"  '' AS CUST_CD, "                               							// ���Ӑ�R�[�h
		+"  '' AS PROC_NAME, "                             							// �i�ڍ�ʍ�Ɩ�
		+"  '' AS PROC_CD, "                               							// �i�ڍ�ʍ�ƃR�[�h
		+"  TO_CHAR(A.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "   // �L���J�n��
		+"  A.\"UNIT_COST\" AS UNIT_COST, "                     					// �P��
		+"  A.\"UNIT_COST_TYP\" AS UNIT_COST_TYP, "             					// �P���敪
		+"  '' AS PROCESSING_COST, "         										// ���H��
		+"  '' AS MATERIAL_COST, "            										// �ޗ���
		+"  '' AS OTHER_OVERHEADS, "         										// ���̑��o��
		+"  D.\"CUR_NAME\" AS CUR_NAME, "                       					// �ʉ�
		+"  '' AS PUCH_SIZE, "                     									// �T�C�Y
		+"  A.\"ONEROUS_FLG\" AS ONEROUS_FLG, "                                		// �L���t���O
		+"  E.\"USER_NAME\" AS REQUEST_BY_NAME, "                					// �˗��Җ�
		+"  A.\"REQUEST_BY\" AS REQUEST_BY, "                   					// �˗��҃R�[�h
		+"  A.\"RESERVE_CAUSE\" AS RESERVE_CAUSE, "             					// �ۗ����R
		+"  A.\"MODIFY_COUNT\" AS MODIFY_COUNT, "                					// �X�V��
		+"  '' AS PURPOSE_UNIT_PRICE_TYP "                                          // �p�r�ʒP���敪
		+"FROM "
		+"  M_CONS_UNIT_COST_APPR A, "
		+"  M_ITEM B, "
		+"  M_VEND_CTRL C, "
		+"  M_CUR D, "
		+"  USER_MST E "
		+"WHERE "
		+"  A.PLANT_CD = ? "
		+"  AND A.STATUS = ? "
		+"  AND A.ITEM_CD = B.ITEM_CD "
		+"  AND A.VEND_CD = C.VEND_CD "
		+"  AND C.CUR_CD = D.CUR_CD "
		+"  AND A.REQUEST_BY = E.USER_CD "
		+"ORDER BY "
		+"  A.PROC_TYP, "
		+"  A.CREATED_DATE";
	
	/** �O���P�����F�˗��Ǎ��p��SQL*/
	private String _selectM_SBCNT_UNIT_COST_APPR = "SELECT "
		+"  A.\"PROC_TYP\" AS PROC_TYP, "											// �����敪
		+"  A.\"APPR_REMARKS\" AS APPR_REMARKS, "									// ���F���l
		+"  A.\"ITEM_CD\" AS ITEM_CD, "												// �i�ڔԍ�
		+"  B.\"ITEM_NAME\" AS ITEM_NAME, "											// �i�ږ�
		+"  C.\"VEND_NAME\" AS VEND_NAME, "											// ����於
		+"  A.\"VEND_CD\" AS VEND_CD, "												// �����R�[�h
		+"  '' AS CUST_NAME, "														// ���Ӑ於
		+"  '' AS CUST_CD, "														// ���Ӑ�R�[�h
		+"  D.\"PROC_NAME\" AS PROC_NAME, "											// �i�ڍ�ʍ�Ɩ�
		+"  A.\"PROC_CD\" AS PROC_CD, "												// �i�ڍ�ʍ�ƃR�[�h
		+"  TO_CHAR(A.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "	// �L���J�n��
		+"  A.\"UNIT_COST\" AS UNIT_COST, "											// �P��
		+"  A.\"UNIT_COST_TYP\" AS UNIT_COST_TYP, "									// �P���敪
		+"  A.\"PROCESSING_COST\" AS PROCESSING_COST, "								// ���H��
		+"  A.\"MATERIAL_COST\" AS MATERIAL_COST, "									// �ޗ���
		+"  A.\"OTHER_OVERHEADS\" AS OTHER_OVERHEADS, "								// ���̑��o��
		+"  E.\"CUR_NAME\" AS CUR_NAME, "											// �ʉ�
		+"  A.\"SBCNT_SIZE\" AS PUCH_SIZE, "										// �T�C�Y
		+"  '' AS ONEROUS_FLG, "													// �L���t���O
		+"  F.\"USER_NAME\" AS REQUEST_BY_NAME,"									// �˗��Җ�
		+"  A.\"REQUEST_BY\" AS REQUEST_BY, "										// �˗��҃R�[�h
		+"  A.\"RESERVE_CAUSE\" AS RESERVE_CAUSE, "									// �ۗ����R
		+"  A.\"MODIFY_COUNT\" AS MODIFY_COUNT, "									// �X�V��
		+"  '' AS PURPOSE_UNIT_PRICE_TYP "                                          // �p�r�ʒP���敪
		+"FROM "
		+"  M_SBCNT_UNIT_COST_APPR A, "
		+"  M_ITEM B, "
		+"  M_VEND_CTRL C, "
		+"  M_PROC_GRP D, "
		+"  M_CUR E, "
		+"  USER_MST F "
		+"WHERE "
		+"  A.PLANT_CD = ? "
		+"  AND A.STATUS = ? "
		+"  AND A.ITEM_CD = B.ITEM_CD "
		+"  AND A.VEND_CD = C.VEND_CD "
		+"  AND A.ITEM_CD = D.ITEM_CD "
		+"  AND A.PROC_CD = D.PROC_CD "
		+"  AND A.VEND_CD = C.VEND_CD "
		+"  AND C.CUR_CD = E.CUR_CD "
		+"  AND A.REQUEST_BY = F.USER_CD "
		+"ORDER BY "
		+"  A.PROC_TYP, "
		+"  A.CREATED_DATE";
	
	/** �O���P���w�b�_�`�F�b�N�p��SQL*/
	private String _checkM_SBCNT_UNIT_COST_H = "SELECT "
		+" A.EFF_PHASE_IN_DATE "
		+"FROM "
		+"  M_SBCNT_UNIT_COST A "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE <> ? "
		+"UNION "
		+"SELECT "
		+"  B.EFF_PHASE_IN_DATE "
		+"FROM "
		+"  M_SBCNT_UNIT_COST_APPR B "
		+"WHERE "
		+"  B.COMPANY_CD = ? "
		+"  AND B.VEND_CD = ? "
		+"  AND B.PLANT_CD = ? "
		+"  AND B.ITEM_CD = ? "
		+"  AND B.PROC_CD = ? "
		+"  AND B.EFF_PHASE_IN_DATE <> ? "
		+"  AND B.SBCNT_SIZE <> ? "
		+"  AND B.STATUS IN (1, 2) ";


	/** ���i�P�����F�˗��Ǎ��p��SQL*/
	private String _selectM_UNIT_COST_APPR = "SELECT "
		+"  A.\"PROC_TYP\" AS PROC_TYP, "											// �����敪
		+"  A.\"APPR_REMARKS\" AS APPR_REMARKS, "									// ���F���l
		+"  A.\"ITEM_CD\" AS ITEM_CD, "												// �i�ڔԍ�
		+"  B.\"ITEM_NAME\" AS ITEM_NAME, "											// �i�ږ�
		+"  '' AS VEND_NAME, "														// ����於
		+"  '' as VEND_CD, "														// �����R�[�h
		+"  C.\"CUST_NAME\" AS CUST_NAME, "											// ���Ӑ於
		+"  A.\"CUST_CD\" as CUST_CD, "												// ���Ӑ�R�[�h
		+"  '' AS PROC_NAME, "														// �i�ڍ�ʍ�Ɩ�
		+"  '' as PROC_CD, "														// �i�ڍ�ʍ�ƃR�[�h
		+"  TO_CHAR(A.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "	// �L���J�n��
		+"  A.\"UNIT_COST\" AS UNIT_COST, "											// �P��
		+"  A.\"UNIT_COST_TYP\" AS UNIT_COST_TYP, "									// �P���敪
		+"  '' AS PROCESSING_COST, "												// ���H��
		+"  '' AS MATERIAL_COST, "													// �ޗ���
		+"  '' AS OTHER_OVERHEADS, "												// ���̑��o��
		+"  D.\"CUR_NAME\" AS CUR_NAME, "											// �ʉ�
		+"  '' AS SALES_UNIT_SIZE, "														// �T�C�Y
		+"  '' AS ONEROUS_FLG, "													// �L���t���O
		+"  E.\"USER_NAME\" AS REQUEST_BY_NAME,"									// �˗��Җ�
		+"  A.\"REQUEST_BY\" AS REQUEST_BY, "										// �˗��҃R�[�h
		+"  A.\"RESERVE_CAUSE\" AS RESERVE_CAUSE, "									// �ۗ����R
		+"  A.\"MODIFY_COUNT\" AS MODIFY_COUNT, "									// �X�V��
		+"  '' AS PURPOSE_UNIT_PRICE_TYP "                                          // �p�r�ʒP���敪
		+"FROM "
		+"  M_UNIT_COST_APPR A, "
		+"  M_ITEM B, "
		+"  M_CUST C, "
		+"  M_CUR D, "
		+"  USER_MST E "
		+"WHERE "
		+"  A.STATUS = ? "
		+"  AND A.ITEM_CD = B.ITEM_CD "
		+"  AND A.CUST_CD = C.CUST_CD "
		+"  AND C.CUR_CD = D.CUR_CD "
		+"  AND A.REQUEST_BY = E.USER_CD "
		+"ORDER BY "
		+"  A.PROC_TYP, "
		+"  A.CREATED_DATE";
	
	/** �̔��P�����F�˗��Ǎ��p��SQL*/
	private String _selectM_SALES_UNIT_COST_APPR = "SELECT "
		+"  A.\"PROC_TYP\" AS PROC_TYP, "											// �����敪
		+"  A.\"APPR_REMARKS\" AS APPR_REMARKS, "									// ���F���l
		+"  A.\"ITEM_CD\" AS ITEM_CD, "												// �i�ڔԍ�
		+"  B.\"ITEM_NAME\" AS ITEM_NAME, "											// �i�ږ�
		+"  '' AS VEND_NAME, "														// ����於
		+"  '' as VEND_CD, "														// �����R�[�h
		+"  C.\"CUST_NAME\" AS CUST_NAME, "											// ���Ӑ於
		+"  A.\"CUST_CD\" as CUST_CD, "												// ���Ӑ�R�[�h
		+"  '' AS PROC_NAME, "														// �i�ڍ�ʍ�Ɩ�
		+"  '' as PROC_CD, "														// �i�ڍ�ʍ�ƃR�[�h
		+"  TO_CHAR(A.\"EFF_PHASE_IN_DATE\",'YYYY/MM/DD') AS EFF_PHASE_IN_DATE, "	// �L���J�n��
		+"  A.\"SALES_UNIT_COST\" AS SALES_UNIT_COST, "							    // �̔��P��
		+"  A.\"UNIT_COST_TYP\" AS UNIT_COST_TYP, "									// �P���敪
		+"  '' AS PROCESSING_COST, "												// ���H��
		+"  '' AS MATERIAL_COST, "													// �ޗ���
		+"  '' AS OTHER_OVERHEADS, "												// ���̑��o��
		+"  D.\"CUR_NAME\" AS CUR_NAME, "											// �ʉ�
		+"  A.SALES_UNIT_SIZE AS SALES_UNIT_SIZE, "		      								// �T�C�Y
		+"  '' AS ONEROUS_FLG, "													// �L���t���O
		+"  E.\"USER_NAME\" AS REQUEST_BY_NAME,"									// �˗��Җ�
		+"  A.\"REQUEST_BY\" AS REQUEST_BY, "										// �˗��҃R�[�h
		+"  A.\"RESERVE_CAUSE\" AS RESERVE_CAUSE, "									// �ۗ����R
		+"  A.\"MODIFY_COUNT\" AS MODIFY_COUNT, "									// �X�V��
		+"  A.\"PURPOSE_UNIT_PRICE_TYP\" AS PURPOSE_UNIT_PRICE_TYP "                // �p�r�ʒP���敪
		+"FROM "
		+"  M_SALES_UNIT_COST_APPR A, "
		+"  M_ITEM B, "
		+"  M_CUST C, "
		+"  M_CUR D, "
		+"  USER_MST E "
		+"WHERE "
		+"  A.STATUS = ? "
		+"  AND A.ITEM_CD = B.ITEM_CD "
		+"  AND A.CUST_CD = C.CUST_CD "
		+"  AND C.CUR_CD = D.CUR_CD "
		+"  AND A.REQUEST_BY = E.USER_CD "
		+"ORDER BY "
		+"  A.PROC_TYP, "
		+"  A.CREATED_DATE";
	
	/** �w���P�����F�˗��Ǎ��p��SQL*/
	private String _selectM_PUCH_UNIT_COST_APPR_record = "SELECT " 
		+"  A.PROC_TYP AS PROC_TYP, " 												// �����敪
		+"  A.UNIT_COST AS UNIT_COST, " 											// �P��
		+"  A.UNIT_COST_TYP AS UNIT_COST_TYP, " 									// �P���敪
		+"  A.PROCESSING_COST AS PROCESSING_COST, " 								// ���H��
		+"  A.MATERIAL_COST AS MATERIAL_COST, " 									// �ޗ���
		+"  A.OTHER_OVERHEADS AS OTHER_OVERHEADS "  								// ���̑��o��
		+"FROM " 
		+"  M_PUCH_UNIT_COST_APPR A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.PUCH_SIZE = ? ";
	
	
	/** �x���i�P�����F�˗��Ǎ��p��SQL*/
	private String _selectM_CONS_UNIT_COST_APPR_record = "SELECT " 
		+"  A.PROC_TYP AS PROC_TYP, "  												// �����敪
		+"  A.UNIT_COST AS UNIT_COST, "												// �P��
		+"  A.UNIT_COST_TYP AS UNIT_COST_TYP, "  									// �P���敪 	
		+"  A.ONEROUS_FLG AS ONEROUS_FLG "											// �L���t���O
		+"FROM " 
		+"  M_CONS_UNIT_COST_APPR A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** �O���P�����F�˗��Ǎ��p��SQL*/
	private String _selectM_SBCNT_UNIT_COST_APPR_record = "SELECT "
		+"  A.PROC_TYP AS PROC_TYP, "  												// �����敪
		+"  A.UNIT_COST AS UNIT_COST, " 											// �P��
		+"  A.UNIT_COST_TYP AS UNIT_COST_TYP, "   									// �P���敪 	
		+"  A.PROCESSING_COST AS PROCESSING_COST, " 								// ���H��
		+"  A.MATERIAL_COST AS MATERIAL_COST, "										// �ޗ���
		+"  A.OTHER_OVERHEADS AS OTHER_OVERHEADS "  								// ���̑��o��
		+"FROM " 
		+"  M_SBCNT_UNIT_COST_APPR A "
		+"WHERE " 
		+"  A.COMPANY_CD = ?"
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SBCNT_SIZE = ? "; 
		
	/** ���i�P�����F�˗��Ǎ��p��SQL*/
	private String _selectM_UNIT_COST_APPR_record = "SELECT " 
		+"A.PROC_TYP AS PROC_TYP, "   												// �����敪
		+"  A.UNIT_COST AS UNIT_COST, "  											// �P��
		+"  A.UNIT_COST_TYP AS UNIT_COST_TYP "    									// �P���敪 
		+"FROM " 
		+"  M_UNIT_COST_APPR A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** �̔��P�����F�˗��Ǎ��p��SQL*/
	private String _selectM_SALES_UNIT_COST_APPR_record = "SELECT " 
		+"A.PROC_TYP AS PROC_TYP, "   												// �����敪
		+"  A.SALES_UNIT_COST AS SALES_UNIT_COST, "  								// �̔��P��
		+"  A.UNIT_COST_TYP AS UNIT_COST_TYP "    									// �P���敪 
		+"FROM " 
		+"  M_SALES_UNIT_COST_APPR A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PURPOSE_UNIT_PRICE_TYP = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SALES_UNIT_SIZE = ? ";
		
	/** �w���P�����F�˗��X�V�p��SQL*/
	private String _updateM_PUCH_UNIT_COST_APPR = "UPDATE "
		+"  M_PUCH_UNIT_COST_APPR A "
		+"SET "
		+"  A.STATUS = ?, "
		+"  A.RESERVE_CAUSE = ?, "
		+"  A.APPR_BY = ?,"
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, "
		+"  A.UPDATED_PRG_NM = ?, "
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT + 1 "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.PUCH_SIZE = ? ";
	
	/** �x���i�P�����F�˗��X�V�p��SQL*/
	private String _updateM_CONS_UNIT_COST_APPR = "UPDATE "
		+"  M_CONS_UNIT_COST_APPR A "
		+"SET "
		+"  A.STATUS = ?, "
		+"  A.RESERVE_CAUSE = ?, "
		+"  A.APPR_BY = ?,"
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, "
		+"  A.UPDATED_PRG_NM = ?, "
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT + 1 "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** �O���P�����F�˗��X�V�p��SQL*/
	private String _updateM_SBCNT_UNIT_COST_APPR = "UPDATE "
		+"  M_SBCNT_UNIT_COST_APPR A "
		+"SET "
		+"  A.STATUS = ?, "
		+"  A.RESERVE_CAUSE = ?, "
		+"  A.APPR_BY = ?,"
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, "
		+"  A.UPDATED_PRG_NM = ?, "
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT + 1 "
		+"WHERE "
		+"  A.COMPANY_CD = ?"
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SBCNT_SIZE = ? "; 
	
	/** ���i�P�����F�˗��X�V�p��SQL*/
	private String _updateM_UNIT_COST_APPR = "UPDATE "
		+"  M_UNIT_COST_APPR A "
		+"SET "
		+"  A.STATUS = ?, "
		+"  A.RESERVE_CAUSE = ?, "
		+"  A.APPR_BY = ?,"
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, "
		+"  A.UPDATED_PRG_NM = ?, "
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT + 1 "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** �̔��P�����F�˗��X�V�p��SQL*/
	private String _updateM_SALES_UNIT_COST_APPR = "UPDATE "
		+"  M_SALES_UNIT_COST_APPR A "
		+"SET "
		+"  A.STATUS = ?, "
		+"  A.RESERVE_CAUSE = ?, "
		+"  A.APPR_BY = ?,"
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, "
		+"  A.UPDATED_PRG_NM = ?, "
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT + 1 "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PURPOSE_UNIT_PRICE_TYP = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SALES_UNIT_SIZE = ? ";
	
	/** �w���P���o�^�p��SQL*/
	private String _insertM_PUCH_UNIT_COST ="INSERT INTO M_PUCH_UNIT_COST" 
			+"(COMPANY_CD,VEND_CD,PLANT_CD,ITEM_CD,EFF_PHASE_IN_DATE,PUCH_SIZE,UNIT_COST,UNIT_COST_TYP,PROCESSING_COST,MATERIAL_COST,OTHER_OVERHEADS,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT) " 
			+"VALUES (?,?,?,?,?,?,?,?,?,?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,0)";
	
	/** �x���i�P���o�^�p��SQL*/
	private String _insertM_CONS_UNIT_COST = "INSERT INTO M_CONS_UNIT_COST" 
		+"(COMPANY_CD,VEND_CD,PLANT_CD,ITEM_CD,EFF_PHASE_IN_DATE,UNIT_COST,UNIT_COST_TYP,ONEROUS_FLG,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT) " 
		+"VALUES(?,?,?,?,?,?,?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,0)";
	
	/** �O���P���o�^�p��SQL*/
	private String _insertM_SBCNT_UNIT_COST ="INSERT INTO M_SBCNT_UNIT_COST" 
			+"(COMPANY_CD,VEND_CD,PLANT_CD,ITEM_CD,PROC_CD,EFF_PHASE_IN_DATE,SBCNT_SIZE,UNIT_COST,UNIT_COST_TYP,PROCESSING_COST,MATERIAL_COST,OTHER_OVERHEADS,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT) " 
			+"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,0)";
	
	/** ���i�P���o�^�p��SQL*/
	private String _insertM_UNIT_COST = "INSERT INTO M_UNIT_COST " 
			+"(COMPANY_CD,CUST_CD,ITEM_CD,EFF_PHASE_IN_DATE,UNIT_COST,UNIT_COST_TYP,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT) " 
			+"VALUES(?,?,?,?,?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,0)";
	
	/** �̔��P���o�^�p��SQL*/
	private String _insertM_SALES_UNIT_COST = "INSERT INTO M_SALES_UNIT_COST " 
			+"(COMPANY_CD,CUST_CD,ITEM_CD,PURPOSE_UNIT_PRICE_TYP,EFF_PHASE_IN_DATE,SALES_UNIT_SIZE,SALES_UNIT_COST,UNIT_COST_TYP,CREATED_DATE,CREATED_BY,CREATED_PRG_NM,UPDATED_DATE,UPDATED_BY,UPDATED_PRG_NM,MODIFY_COUNT) " 
			+"VALUES(?,?,?,?,?,?,?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'),?,?,0)";
	
	/** �w���P���X�V�p��SQL*/
	private String _updateM_PUCH_UNIT_COST ="UPDATE " 
		+"M_PUCH_UNIT_COST A " 
		+"SET " 
		+"  A.UNIT_COST = ?, " 
		+"  A.UNIT_COST_TYP = ?, " 
		+"  A.PROCESSING_COST = ?, " 
		+"  A.MATERIAL_COST = ?, " 
		+"  A.OTHER_OVERHEADS = ?, " 
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, " 
		+"  A.UPDATED_PRG_NM = ?, " 
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT +1 " 
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "	
		+"  AND A.PUCH_SIZE = ? ";

	/** �x���i�P���X�V�p��SQL*/
	private String _updateM_CONS_UNIT_COST = "UPDATE "
		+"M_CONS_UNIT_COST A "
		+"SET "
		+"  A.UNIT_COST = ?, "
		+"  A.UNIT_COST_TYP = ?, "
		+"  A.ONEROUS_FLG = ?, "
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, " 
		+"  A.UPDATED_PRG_NM = ?, " 
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT +1 "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ?";
	
	/** �O���P���X�V�p��SQL*/
	private String _updateM_SBCNT_UNIT_COST = "UPDATE " 
		+"M_SBCNT_UNIT_COST A "
		+"SET "
		+"  A.UNIT_COST = ?, "
		+"  A.UNIT_COST_TYP = ?, "
		+"  A.PROCESSING_COST = ?, " 
		+"  A.MATERIAL_COST = ?, "
		+"  A.OTHER_OVERHEADS = ?, "
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, " 
		+"  A.UPDATED_PRG_NM = ?, " 
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT +1 "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ?"
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SBCNT_SIZE = ? ";
	
	/** ���i�P���X�V�p��SQL*/
	private String _updateM_UNIT_COST = "UPDATE " 
		+"M_UNIT_COST A "
		+"SET " 
		+"  A.UNIT_COST = ?, "
		+"  A.UNIT_COST_TYP = ?, "
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, " 
		+"  A.UPDATED_PRG_NM = ?, " 
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT +1 "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** �̔��P���X�V�p��SQL*/
	private String _updateM_SALES_UNIT_COST = "UPDATE " 
		+"M_SALES_UNIT_COST A "
		+"SET " 
		+"  A.SALES_UNIT_COST = ?, "
		+"  A.UNIT_COST_TYP = ?, "
		+"  A.UPDATED_DATE = TO_DATE(?,'YYYY/MM/DD HH24/MI/SS'), "
		+"  A.UPDATED_BY = ?, " 
		+"  A.UPDATED_PRG_NM = ?, " 
		+"  A.MODIFY_COUNT = A.MODIFY_COUNT +1 "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PURPOSE_UNIT_PRICE_TYP = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SALES_UNIT_SIZE = ? ";
	
	/** �w���P���폜�p��SQL*/
	private String _deleteM_PUCH_UNIT_COST ="DELETE FROM " 
		+"M_PUCH_UNIT_COST A " 
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "	
		+"  AND A.PUCH_SIZE = ? ";
	
	/** �w���P���w�b�_�폜�p��SQL*/
	private String _deleteM_PUCH_UNIT_COST_H ="DELETE FROM " 
		+"M_PUCH_UNIT_COST_H A " 
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? ";
	
	/** �x���i�P���폜�p��SQL*/
	private String _deleteM_CONS_UNIT_COST = "DELETE FROM " 
		+"M_CONS_UNIT_COST A "
		+"WHERE "
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ?";
	
	/** �O���P���폜�p��SQL*/
	private String _deleteM_SBCNT_UNIT_COST = "DELETE FROM " 
		+"M_SBCNT_UNIT_COST A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ?"
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SBCNT_SIZE = ? ";
	
	/** �O���P���w�b�_�폜�p��SQL*/
	private String _deleteM_SBCNT_UNIT_COST_H = "DELETE FROM " 
		+"M_SBCNT_UNIT_COST_H A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.VEND_CD = ? "
		+"  AND A.PLANT_CD = ?"
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PROC_CD = ? ";
	
	/** ���i�P���폜�p��SQL*/
	private String _deleteM_UNIT_COST = "DELETE FROM " 
		+"M_UNIT_COST A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? ";
	
	/** �̔��P���폜�p��SQL*/
	private String _deleteM_SALES_UNIT_COST = "DELETE FROM " 
		+"M_SALES_UNIT_COST A "
		+"WHERE " 
		+"  A.COMPANY_CD = ? "
		+"  AND A.CUST_CD = ? "
		+"  AND A.ITEM_CD = ? "
		+"  AND A.PURPOSE_UNIT_PRICE_TYP = ? "
		+"  AND A.EFF_PHASE_IN_DATE = ? "
		+"  AND A.SALES_UNIT_SIZE = ? ";
	
	/** SYSDATE�擾�p��SQL */
	private String _selectSysDate = 
		"select TO_CHAR(sysdate,'YYYY/MM/DD HH24:MI:SS') from DUAL ";
	
	/** �w���P�����F�˗��Ǎ�
	 * 
	 * @param plantCD �H��R�[�h
	 * @param status ��ԋ敪
	 * 
	 * @return  resultList 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public List selectM_PUCH_UNIT_COST_APPR(String plantCD,String status) throws SQLException, FoundationException{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			List resultList = new ArrayList();
			UnitCostApprStruct data = null;
			selectStmt = _conn.getConn().prepareStatement(_selectM_PUCH_UNIT_COST_APPR);
			selectStmt.setString(1, plantCD);
			selectStmt.setString(2, status);
			selectRslt = selectStmt.executeQuery();
			while ((data = next(selectRslt)) != null) {
				resultList.add(data);
			}
			return resultList;
		}finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** �w���P���w�b�_�`�F�b�N
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return  boolean 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public boolean checkM_PUCH_UNIT_COST_H(UnitCostApprStruct struct) throws SQLException, FoundationException{
		
		PreparedStatement checkStmt = null;
		ResultSet checkRslt = null;
		boolean ret = true;
		try{
			checkStmt = _conn.getConn().prepareStatement(_checkM_PUCH_UNIT_COST_H);
			checkStmt.setString(1,struct.getM_COMPANY_CD());
			checkStmt.setString(2,struct.getM_VEND_CD());
			checkStmt.setString(3,struct.getM_PLANT_CD());
			checkStmt.setString(4,struct.getM_ITEM_CD());
			checkStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			checkStmt.setString(6,struct.getM_COMPANY_CD());
			checkStmt.setString(7,struct.getM_VEND_CD());
			checkStmt.setString(8,struct.getM_PLANT_CD());
			checkStmt.setString(9,struct.getM_ITEM_CD());
			checkStmt.setString(10,struct.getM_EFF_PHASE_IN_DATE());
			checkStmt.setString(11,struct.getM_SIZE());
			checkRslt = checkStmt.executeQuery();
			if(checkRslt.next()== false){
				return false;
			}
			return ret;
		}finally {
			this.closeResultSet(checkRslt);
			this.closePreparedStatement(checkStmt);
		}
		
	}
	
	/** �x���i�P�����F�˗��Ǎ�
	 * 
	 * @param plantCD �H��R�[�h
	 * @param status ��ԋ敪
	 * 
	 * @return  resultList 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public List selectM_CONS_UNIT_COST_APPR(String plantCD,String status) throws SQLException, FoundationException{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			List resultList = new ArrayList();
			UnitCostApprStruct data = null;
			selectStmt = _conn.getConn().prepareStatement(_selectM_CONS_UNIT_COST_APPR);
			selectStmt.setString(1, plantCD);
			selectStmt.setString(2, status);
			selectRslt = selectStmt.executeQuery();
			while ((data = next(selectRslt)) != null) {
				resultList.add(data);
			}
			return resultList;
		}finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** �O���P�����F�˗��Ǎ�
	 * 
	 * @param plantCD �H��R�[�h
	 * @param status ��ԋ敪
	 * 
	 * @return  resultList 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public List selectM_SBCNT_UNIT_COST_APPR(String plantCD,String status) throws SQLException, FoundationException{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			List resultList = new ArrayList();
			UnitCostApprStruct data = null;
			selectStmt = _conn.getConn().prepareStatement(_selectM_SBCNT_UNIT_COST_APPR);
			selectStmt.setString(1, plantCD);
			selectStmt.setString(2, status);
			selectRslt = selectStmt.executeQuery();
			while ((data = next(selectRslt)) != null) {
				resultList.add(data);
			}
			return resultList;
		}finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** �O���P���w�b�_�`�F�b�N
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return  boolean 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public boolean checkM_SBCNT_UNIT_COST_H(UnitCostApprStruct struct) throws SQLException, FoundationException{
		
		PreparedStatement checkStmt = null;
		ResultSet checkRslt = null;
		boolean ret = true;
		try{
			checkStmt = _conn.getConn().prepareStatement(_checkM_SBCNT_UNIT_COST_H);
			checkStmt.setString(1,struct.getM_COMPANY_CD());
			checkStmt.setString(2,struct.getM_VEND_CD());
			checkStmt.setString(3,struct.getM_PLANT_CD());
			checkStmt.setString(4,struct.getM_ITEM_CD());
			checkStmt.setString(5,struct.getM_PROC_CD());
			checkStmt.setString(6,struct.getM_EFF_PHASE_IN_DATE());
			checkStmt.setString(7,struct.getM_COMPANY_CD());
			checkStmt.setString(8,struct.getM_VEND_CD());
			checkStmt.setString(9,struct.getM_PLANT_CD());
			checkStmt.setString(10,struct.getM_ITEM_CD());
			checkStmt.setString(11,struct.getM_PROC_CD());
			checkStmt.setString(12,struct.getM_EFF_PHASE_IN_DATE());
			checkStmt.setString(13,struct.getM_SIZE());
			checkRslt = checkStmt.executeQuery();
			if(checkRslt.next()== false){
				return false;
			}
			return ret;
		}finally {
			this.closeResultSet(checkRslt);
			this.closePreparedStatement(checkStmt);
		}
		
	}
	
	
	/** ���i�P�����F�˗��Ǎ�
	 * 
	 * @param status ��ԋ敪
	 * 
	 * @return  resultList 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public List selectM_UNIT_COST_APPR(String status) throws SQLException, FoundationException{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			List resultList = new ArrayList();
			UnitCostApprStruct data = null;
			selectStmt = _conn.getConn().prepareStatement(_selectM_UNIT_COST_APPR);
			selectStmt.setString(1, status);
			selectRslt = selectStmt.executeQuery();
			while ((data = next(selectRslt)) != null) {
				resultList.add(data);
			}
			return resultList;
		}finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** �̔��P�����F�˗��Ǎ�
	 * 
	 * @param status ��ԋ敪
	 * 
	 * @return  resultList 
	 * 
	 * @throws SQLException 
	 * @throws FoundationException */
	public List selectM_SALES_UNIT_COST_APPR(String status) throws SQLException, FoundationException{
		
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			List resultList = new ArrayList();
			UnitCostApprStruct data = null;
			selectStmt = _conn.getConn().prepareStatement(_selectM_SALES_UNIT_COST_APPR);
			selectStmt.setString(1, status);
			selectRslt = selectStmt.executeQuery();
			while ((data = next(selectRslt)) != null) {
				resultList.add(data);
			}
			return resultList;
		}finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** �w���P�����F�˗��Ǎ�
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @throws SQLException 
	 * @throws SQLException 
	 * @throws FoundationException */
	public UnitCostApprStruct selectM_PUCH_UNIT_COST_APPR_record(UnitCostApprStruct struct) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			selectStmt = _conn.getConn().prepareStatement(_selectM_PUCH_UNIT_COST_APPR_record);
			selectStmt.setString(1,struct.getM_COMPANY_CD());
			selectStmt.setString(2,struct.getM_VEND_CD());
			selectStmt.setString(3,struct.getM_PLANT_CD());
			selectStmt.setString(4,struct.getM_ITEM_CD());
			selectStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			selectStmt.setString(6,struct.getM_SIZE());
			selectRslt = selectStmt.executeQuery();
			while(selectRslt.next()){
				struct.setM_PROC_TYP(selectRslt.getString(1));
				struct.setM_UNIT_COST(selectRslt.getString(2));
				struct.setM_UNIT_COST_TYP(selectRslt.getString(3));
				struct.setM_PROCESSING_COST(selectRslt.getString(4));
				struct.setM_MATERIAL_COST(selectRslt.getString(5));
				struct.setM_OTHER_OVERHEADS(selectRslt.getString(6));
			}
			return struct;
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** �x���i�P�����F�˗��Ǎ��p
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @throws SQLException 
	 * @throws SQLException 
	 * @throws FoundationException */
	public UnitCostApprStruct selectM_CONS_UNIT_COST_APPR_record(UnitCostApprStruct struct) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			selectStmt = _conn.getConn().prepareStatement(_selectM_CONS_UNIT_COST_APPR_record);
			selectStmt.setString(1,struct.getM_COMPANY_CD());
			selectStmt.setString(2,struct.getM_VEND_CD());
			selectStmt.setString(3,struct.getM_PLANT_CD());
			selectStmt.setString(4,struct.getM_ITEM_CD());
			selectStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			selectRslt = selectStmt.executeQuery();
			while(selectRslt.next()){
				struct.setM_PROC_TYP(selectRslt.getString(1));
				struct.setM_UNIT_COST(selectRslt.getString(2));
				struct.setM_UNIT_COST_TYP(selectRslt.getString(3));
				struct.setM_ONEROUS_FLG(selectRslt.getString(4));
			}
			return struct;
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** �O���P�����F�˗��Ǎ�
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @throws SQLException 
	 * @throws SQLException 
	 * @throws FoundationException */
	public UnitCostApprStruct selectM_SBCNT_UNIT_COST_APPR_record(UnitCostApprStruct struct) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			selectStmt = _conn.getConn().prepareStatement(_selectM_SBCNT_UNIT_COST_APPR_record);
			selectStmt.setString(1,struct.getM_COMPANY_CD());
			selectStmt.setString(2,struct.getM_VEND_CD());
			selectStmt.setString(3,struct.getM_PLANT_CD());
			selectStmt.setString(4,struct.getM_ITEM_CD());
			selectStmt.setString(5,struct.getM_PROC_CD());
			selectStmt.setString(6,struct.getM_EFF_PHASE_IN_DATE());
			selectStmt.setString(7,struct.getM_SIZE());
			selectRslt = selectStmt.executeQuery();
			while(selectRslt.next()){
				struct.setM_PROC_TYP(selectRslt.getString(1));
				struct.setM_UNIT_COST(selectRslt.getString(2));
				struct.setM_UNIT_COST_TYP(selectRslt.getString(3));
				struct.setM_PROCESSING_COST(selectRslt.getString(4));
				struct.setM_MATERIAL_COST(selectRslt.getString(5));
				struct.setM_OTHER_OVERHEADS(selectRslt.getString(6));
			}
			return struct;
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** ���i�P�����F�˗��Ǎ�
	 * 
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @throws SQLException 
	 * @throws SQLException 
	 * @throws FoundationException */
	public UnitCostApprStruct selectM_UNIT_COST_APPR_record(UnitCostApprStruct struct) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			selectStmt = _conn.getConn().prepareStatement(_selectM_UNIT_COST_APPR_record);
			selectStmt.setString(1,struct.getM_COMPANY_CD());
			selectStmt.setString(2,struct.getM_CUST_CD());
			selectStmt.setString(3,struct.getM_ITEM_CD());
			selectStmt.setString(4,struct.getM_EFF_PHASE_IN_DATE());
			selectRslt = selectStmt.executeQuery();
			while(selectRslt.next()){
				struct.setM_PROC_TYP(selectRslt.getString(1));
				struct.setM_UNIT_COST(selectRslt.getString(2));
				struct.setM_UNIT_COST_TYP(selectRslt.getString(3));
			}
			return struct;
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/** �̔��P�����F�˗��Ǎ�
	 * 
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @throws SQLException 
	 * @throws SQLException 
	 * @throws FoundationException */
	public UnitCostApprStruct selectM_SALES_UNIT_COST_APPR_record(UnitCostApprStruct struct) throws SQLException{
		PreparedStatement selectStmt = null;
		ResultSet selectRslt = null;
		try{
			selectStmt = _conn.getConn().prepareStatement(_selectM_SALES_UNIT_COST_APPR_record);
			selectStmt.setString(1,struct.getM_COMPANY_CD());
			selectStmt.setString(2,struct.getM_CUST_CD());
			selectStmt.setString(3,struct.getM_ITEM_CD());
			selectStmt.setString(4,struct.getM_PURPOSE_UNIT_PRICE_TYP());
			selectStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			selectStmt.setString(6,struct.getM_SIZE());
			selectRslt = selectStmt.executeQuery();
			while(selectRslt.next()){
				struct.setM_PROC_TYP(selectRslt.getString(1));
				struct.setM_UNIT_COST(selectRslt.getString(2));
				struct.setM_UNIT_COST_TYP(selectRslt.getString(3));
			}
			return struct;
		}finally{
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * �w���P�����F�˗��X�V
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 *  
	 * @throws SQLException 
	 */
	public int updateM_PUCH_UNIT_COST_APPR(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_PUCH_UNIT_COST_APPR);
			updateStmt.setString(1, struct.getM_STATUS());
			updateStmt.setString(2,struct.getM_RESERVE_CAUSE());
			updateStmt.setString(3,struct.getM_APPR_BY());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5, struct.getM_UPDATED_BY());
			updateStmt.setString(6, struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(7, struct.getM_COMPANY_CD());
			updateStmt.setString(8, struct.getM_VEND_CD());
			updateStmt.setString(9, struct.getM_PLANT_CD());
			updateStmt.setString(10, struct.getM_ITEM_CD());
			updateStmt.setString(11, struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(12, struct.getM_SIZE());

			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �x���i�P�����F�˗��X�V
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int updateM_CONS_UNIT_COST_APPR(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_CONS_UNIT_COST_APPR);
			
			updateStmt.setString(1,struct.getM_STATUS());
			updateStmt.setString(2,struct.getM_RESERVE_CAUSE());
			updateStmt.setString(3,struct.getM_APPR_BY());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5,struct.getM_UPDATED_BY());
			updateStmt.setString(6,struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(7, struct.getM_COMPANY_CD());
			updateStmt.setString(8,struct.getM_VEND_CD());
			updateStmt.setString(9,struct.getM_PLANT_CD());
			updateStmt.setString(10,struct.getM_ITEM_CD());
			updateStmt.setString(11,struct.getM_EFF_PHASE_IN_DATE());
			

			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �O���P�����F�˗��X�V
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int updateM_SBCNT_UNIT_COST_APPR(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_SBCNT_UNIT_COST_APPR);

			updateStmt.setString(1,struct.getM_STATUS());
			updateStmt.setString(2,struct.getM_RESERVE_CAUSE());
			updateStmt.setString(3,struct.getM_APPR_BY());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5,struct.getM_UPDATED_BY());
			updateStmt.setString(6,struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(7,struct.getM_COMPANY_CD());
			updateStmt.setString(8,struct.getM_VEND_CD());
			updateStmt.setString(9,struct.getM_PLANT_CD());
			updateStmt.setString(10,struct.getM_ITEM_CD());
			updateStmt.setString(11,struct.getM_PROC_CD());
			updateStmt.setString(12,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(13,struct.getM_SIZE());

			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * ���i�P�����F�˗��X�V
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int updateM_UNIT_COST_APPR(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_UNIT_COST_APPR);

			updateStmt.setString(1,struct.getM_STATUS());
			updateStmt.setString(2,struct.getM_RESERVE_CAUSE());
			updateStmt.setString(3,struct.getM_APPR_BY());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5,struct.getM_UPDATED_BY());
			updateStmt.setString(6,struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(7,struct.getM_COMPANY_CD());
			updateStmt.setString(8,struct.getM_CUST_CD());;
			updateStmt.setString(9,struct.getM_ITEM_CD());
			updateStmt.setString(10,struct.getM_EFF_PHASE_IN_DATE());

			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �̔��P�����F�˗��X�V
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int updateM_SALES_UNIT_COST_APPR(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_SALES_UNIT_COST_APPR);

			updateStmt.setString(1,struct.getM_STATUS());
			updateStmt.setString(2,struct.getM_RESERVE_CAUSE());
			updateStmt.setString(3,struct.getM_APPR_BY());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5,struct.getM_UPDATED_BY());
			updateStmt.setString(6,struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(7,struct.getM_COMPANY_CD());
			updateStmt.setString(8,struct.getM_CUST_CD());;
			updateStmt.setString(9,struct.getM_ITEM_CD());
			updateStmt.setString(10,struct.getM_PURPOSE_UNIT_PRICE_TYP());
			updateStmt.setString(11,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(12,struct.getM_SIZE());

			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �w���P���o�^
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int insertM_PUCH_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertM_PUCH_UNIT_COST);

			insertStmt.setString(1,struct.getM_COMPANY_CD());
			insertStmt.setString(2,struct.getM_VEND_CD());
			insertStmt.setString(3,struct.getM_PLANT_CD());
			insertStmt.setString(4,struct.getM_ITEM_CD());;
			insertStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			insertStmt.setString(6,struct.getM_SIZE());
			insertStmt.setString(7,struct.getM_UNIT_COST());
			insertStmt.setString(8,struct.getM_UNIT_COST_TYP());
			insertStmt.setString(9,struct.getM_PROCESSING_COST());
			insertStmt.setString(10,struct.getM_MATERIAL_COST());
			insertStmt.setString(11,struct.getM_OTHER_OVERHEADS());
			insertStmt.setString(12,struct.getM_SYSDATE());
			insertStmt.setString(13,struct.getM_CREATED_BY());
			insertStmt.setString(14,struct.getM_CREATED_PRG_NM());
			insertStmt.setString(15,struct.getM_SYSDATE());
			insertStmt.setString(16,struct.getM_UPDATED_BY());
			insertStmt.setString(17,struct.getM_UPDATED_PRG_NM());
			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * �x���i�P���o�^
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int insertM_CONS_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertM_CONS_UNIT_COST);

			insertStmt.setString(1,struct.getM_COMPANY_CD());
			insertStmt.setString(2,struct.getM_VEND_CD());
			insertStmt.setString(3,struct.getM_PLANT_CD());
			insertStmt.setString(4,struct.getM_ITEM_CD());;
			insertStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			insertStmt.setString(6,struct.getM_UNIT_COST());
			insertStmt.setString(7,struct.getM_UNIT_COST_TYP());
			insertStmt.setString(8,struct.getM_ONEROUS_FLG());
			insertStmt.setString(9,struct.getM_SYSDATE());
			insertStmt.setString(10,struct.getM_CREATED_BY());
			insertStmt.setString(11,struct.getM_CREATED_PRG_NM());
			insertStmt.setString(12,struct.getM_SYSDATE());
			insertStmt.setString(13,struct.getM_UPDATED_BY());
			insertStmt.setString(14,struct.getM_UPDATED_PRG_NM());
			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * �O���P���o�^
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int insertM_SBCNT_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertM_SBCNT_UNIT_COST);

			insertStmt.setString(1,struct.getM_COMPANY_CD());
			insertStmt.setString(2,struct.getM_VEND_CD());
			insertStmt.setString(3,struct.getM_PLANT_CD());
			insertStmt.setString(4,struct.getM_ITEM_CD());;
			insertStmt.setString(5,struct.getM_PROC_CD());
			insertStmt.setString(6,struct.getM_EFF_PHASE_IN_DATE());
			insertStmt.setString(7,struct.getM_SIZE());
			insertStmt.setString(8,struct.getM_UNIT_COST());
			insertStmt.setString(9,struct.getM_UNIT_COST_TYP());
			insertStmt.setString(10,struct.getM_PROCESSING_COST());
			insertStmt.setString(11,struct.getM_MATERIAL_COST());
			insertStmt.setString(12,struct.getM_OTHER_OVERHEADS());
			insertStmt.setString(13,struct.getM_SYSDATE());
			insertStmt.setString(14,struct.getM_CREATED_BY());
			insertStmt.setString(15,struct.getM_CREATED_PRG_NM());
			insertStmt.setString(16,struct.getM_SYSDATE());
			insertStmt.setString(17,struct.getM_UPDATED_BY());
			insertStmt.setString(18,struct.getM_UPDATED_PRG_NM());
			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * ���i�P���o�^
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int insertM_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertM_UNIT_COST);

			insertStmt.setString(1,struct.getM_COMPANY_CD());
			insertStmt.setString(2,struct.getM_CUST_CD());
			insertStmt.setString(3,struct.getM_ITEM_CD());
			insertStmt.setString(4,struct.getM_EFF_PHASE_IN_DATE());;
			insertStmt.setString(5,struct.getM_UNIT_COST());
			insertStmt.setString(6,struct.getM_UNIT_COST_TYP());
			insertStmt.setString(7,struct.getM_SYSDATE());
			insertStmt.setString(8,struct.getM_CREATED_BY());
			insertStmt.setString(9,struct.getM_CREATED_PRG_NM());
			insertStmt.setString(10,struct.getM_SYSDATE());
			insertStmt.setString(11,struct.getM_UPDATED_BY());
			insertStmt.setString(12,struct.getM_UPDATED_PRG_NM());

			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * �̔��P���o�^
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int insertM_SALES_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement insertStmt = null;

		try {
			insertStmt = _conn.getConn().prepareStatement(_insertM_SALES_UNIT_COST);

			insertStmt.setString(1,struct.getM_COMPANY_CD());
			insertStmt.setString(2,struct.getM_CUST_CD());
			insertStmt.setString(3,struct.getM_ITEM_CD());
			insertStmt.setString(4,struct.getM_PURPOSE_UNIT_PRICE_TYP());
			insertStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());;
			insertStmt.setString(6,struct.getM_SIZE());;
			insertStmt.setString(7,struct.getM_UNIT_COST());
			insertStmt.setString(8,struct.getM_UNIT_COST_TYP());
			insertStmt.setString(9,struct.getM_SYSDATE());
			insertStmt.setString(10,struct.getM_CREATED_BY());
			insertStmt.setString(11,struct.getM_CREATED_PRG_NM());
			insertStmt.setString(12,struct.getM_SYSDATE());
			insertStmt.setString(13,struct.getM_UPDATED_BY());
			insertStmt.setString(14,struct.getM_UPDATED_PRG_NM());

			return insertStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(insertStmt);
		}
	}
	
	/**
	 * �w���P���X�V
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int updateM_PUCH_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_PUCH_UNIT_COST);

			updateStmt.setString(1,struct.getM_UNIT_COST());
			updateStmt.setString(2,struct.getM_UNIT_COST_TYP());
			updateStmt.setString(3,struct.getM_PROCESSING_COST());
			updateStmt.setString(4,struct.getM_MATERIAL_COST());;
			updateStmt.setString(5,struct.getM_OTHER_OVERHEADS());
			updateStmt.setString(6,struct.getM_SYSDATE());
			updateStmt.setString(7,struct.getM_UPDATED_BY());
			updateStmt.setString(8,struct.getM_UPDATED_PRG_NM());
			updateStmt.setString(9,struct.getM_COMPANY_CD());
			updateStmt.setString(10,struct.getM_VEND_CD());
			updateStmt.setString(11,struct.getM_PLANT_CD());
			updateStmt.setString(12,struct.getM_ITEM_CD());
			updateStmt.setString(13,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(14,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �x���i�P���X�V
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int updateM_CONS_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_CONS_UNIT_COST);

			updateStmt.setString(1,struct.getM_UNIT_COST());
			updateStmt.setString(2,struct.getM_UNIT_COST_TYP());
			updateStmt.setString(3,struct.getM_ONEROUS_FLG());
			updateStmt.setString(4,struct.getM_SYSDATE());
			updateStmt.setString(5,struct.getM_UPDATED_BY());
			updateStmt.setString(6,struct.getM_UPDATED_PRG_NM());
			
			updateStmt.setString(7,struct.getM_COMPANY_CD());
			updateStmt.setString(8,struct.getM_VEND_CD());
			updateStmt.setString(9,struct.getM_PLANT_CD());
			updateStmt.setString(10,struct.getM_ITEM_CD());
			updateStmt.setString(11,struct.getM_EFF_PHASE_IN_DATE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * �O���P���X�V
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int updateM_SBCNT_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_SBCNT_UNIT_COST);

			updateStmt.setString(1,struct.getM_UNIT_COST());
			updateStmt.setString(2,struct.getM_UNIT_COST_TYP());
			updateStmt.setString(3,struct.getM_PROCESSING_COST());
			updateStmt.setString(4,struct.getM_MATERIAL_COST());
			updateStmt.setString(5,struct.getM_OTHER_OVERHEADS());
			updateStmt.setString(6,struct.getM_SYSDATE());
			updateStmt.setString(7,struct.getM_UPDATED_BY());
			updateStmt.setString(8,struct.getM_UPDATED_PRG_NM());
			
			updateStmt.setString(9,struct.getM_COMPANY_CD());
			updateStmt.setString(10,struct.getM_VEND_CD());
			updateStmt.setString(11,struct.getM_PLANT_CD());
			updateStmt.setString(12,struct.getM_ITEM_CD());
			updateStmt.setString(13,struct.getM_PROC_CD());
			updateStmt.setString(14,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(15,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * ���i�P���X�V
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int updateM_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_UNIT_COST);

			updateStmt.setString(1,struct.getM_UNIT_COST());
			updateStmt.setString(2,struct.getM_UNIT_COST_TYP());
			updateStmt.setString(3,struct.getM_SYSDATE());
			updateStmt.setString(4,struct.getM_UPDATED_BY());
			updateStmt.setString(5,struct.getM_UPDATED_PRG_NM());
			
			updateStmt.setString(6,struct.getM_COMPANY_CD());
			updateStmt.setString(7,struct.getM_CUST_CD());
			updateStmt.setString(8,struct.getM_ITEM_CD());
			updateStmt.setString(9,struct.getM_EFF_PHASE_IN_DATE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �̔��P���X�V
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int updateM_SALES_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_updateM_SALES_UNIT_COST);

			updateStmt.setString(1,struct.getM_UNIT_COST());
			updateStmt.setString(2,struct.getM_UNIT_COST_TYP());
			updateStmt.setString(3,struct.getM_SYSDATE());
			updateStmt.setString(4,struct.getM_UPDATED_BY());
			updateStmt.setString(5,struct.getM_UPDATED_PRG_NM());
			
			updateStmt.setString(6,struct.getM_COMPANY_CD());
			updateStmt.setString(7,struct.getM_CUST_CD());
			updateStmt.setString(8,struct.getM_ITEM_CD());
			updateStmt.setString(9,struct.getM_PURPOSE_UNIT_PRICE_TYP());
			updateStmt.setString(10,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(11,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �w���P���폜
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_PUCH_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_PUCH_UNIT_COST);

			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_VEND_CD());
			updateStmt.setString(3,struct.getM_PLANT_CD());
			updateStmt.setString(4,struct.getM_ITEM_CD());
			updateStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(6,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �w���P���w�b�_�폜
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_PUCH_UNIT_COST_H(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_PUCH_UNIT_COST_H);

			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_VEND_CD());
			updateStmt.setString(3,struct.getM_PLANT_CD());
			updateStmt.setString(4,struct.getM_ITEM_CD());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �x���i�P���폜
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_CONS_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_CONS_UNIT_COST);

			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_VEND_CD());
			updateStmt.setString(3,struct.getM_PLANT_CD());
			updateStmt.setString(4,struct.getM_ITEM_CD());
			updateStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * �O���P���폜
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_SBCNT_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_SBCNT_UNIT_COST);

			
			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_VEND_CD());
			updateStmt.setString(3,struct.getM_PLANT_CD());
			updateStmt.setString(4,struct.getM_ITEM_CD());
			updateStmt.setString(5,struct.getM_PROC_CD());
			updateStmt.setString(6,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(7,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �O���P���w�b�_�폜
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_SBCNT_UNIT_COST_H(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_SBCNT_UNIT_COST_H);

			
			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_VEND_CD());
			updateStmt.setString(3,struct.getM_PLANT_CD());
			updateStmt.setString(4,struct.getM_ITEM_CD());
			updateStmt.setString(5,struct.getM_PROC_CD());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}

	/**
	 * ���i�P���폜
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_UNIT_COST);
			
			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_CUST_CD());
			updateStmt.setString(3,struct.getM_ITEM_CD());
			updateStmt.setString(4,struct.getM_EFF_PHASE_IN_DATE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	
	/**
	 * �̔��P���폜
	 * 
	 * @param struct UnitCostApprStruct
	 * 
	 * @return �s��
	 * 
	 * @throws SQLException 
	 */
	public int deleteM_SALES_UNIT_COST(UnitCostApprStruct struct)throws SQLException 
	{
		PreparedStatement updateStmt = null;

		try {
			updateStmt = _conn.getConn().prepareStatement(_deleteM_SALES_UNIT_COST);
			
			updateStmt.setString(1,struct.getM_COMPANY_CD());
			updateStmt.setString(2,struct.getM_CUST_CD());
			updateStmt.setString(3,struct.getM_ITEM_CD());
			updateStmt.setString(4,struct.getM_PURPOSE_UNIT_PRICE_TYP());
			updateStmt.setString(5,struct.getM_EFF_PHASE_IN_DATE());
			updateStmt.setString(6,struct.getM_SIZE());
			
			return updateStmt.executeUpdate();
		} finally {
			this.closePreparedStatement(updateStmt);
		}
	}
	/**
	 * ���R�[�h�f�[�^��Struct�Ɋi�[���ĕԂ��܂�
	 * @param rs ResultSet
	 * 
	 * @return struct UnitCostApprStruct
	 * 
	 * @exception FoundationException
	 * @exception SQLException
	 */
	public UnitCostApprStruct next(ResultSet rs) throws FoundationException,SQLException {
		if (rs.next() == false)
			return null;

		UnitCostApprStruct data = new UnitCostApprStruct();

		data.setM_PROC_TYP(getString(1, rs));
		data.setM_APPR_REMARKS(getString(2, rs));
		data.setM_ITEM_CD(getString(3, rs));
		data.setM_ITEM_NAME(getString(4, rs));
		data.setM_VEND_NAME(getString(5, rs));
		data.setM_VEND_CD(getString(6, rs));
		data.setM_CUST_NAME(getString(7, rs));
		data.setM_CUST_CD(getString(8, rs));
		data.setM_PROC_NAME(getString(9, rs));
		data.setM_PROC_CD(getString(10, rs));
		data.setM_EFF_PHASE_IN_DATE(getString(11, rs));
		data.setM_UNIT_COST(getString(12, rs));
		data.setM_UNIT_COST_TYP(getString(13,rs));
		data.setM_PROCESSING_COST(getString(14, rs));
		data.setM_MATERIAL_COST(getString(15, rs));
		data.setM_OTHER_OVERHEADS(getString(16, rs));
		data.setM_CUR_NAME(getString(17, rs));
		data.setM_SIZE(getString(18, rs));
		data.setM_ONEROUS_FLG(getString(19, rs));
		data.setM_REQUEST_BY_NAME(getString(20, rs));
		data.setM_REQUEST_BY(getString(21, rs));
		data.setM_RESERVE_CAUSE(getString(22, rs));
		data.setM_MODIFY_COUNT(getString(23, rs));
		data.setM_PURPOSE_UNIT_PRICE_TYP(getString(24, rs));
		return data;
	}
	
	/**
	 * SYSTEM�����̎擾
	 *
	 * @param  struct �o�ɏ����f�[�^�N���X
	 * @return struct �o�ɏ����f�[�^�N���X
	 * @throws SQLException
	 *         SQL�̔��s�Ɏ��s�����ꍇ
	 */
	public UnitCostApprStruct selectSYSDATE(UnitCostApprStruct struct) throws SQLException
	{
		PreparedStatement selectStmt = null;	// select
		ResultSet selectRslt = null;			// ����

		try {
			selectStmt = _conn.getConn().prepareStatement(_selectSysDate);

			selectRslt = selectStmt.executeQuery();

			// ����������0����������null��ԋp
			if(selectRslt.next()==false) return null;

			UnitCostApprStruct rtnStruct = new UnitCostApprStruct(struct);

			rtnStruct.setM_SYSDATE( getString(1, selectRslt) );

			return rtnStruct;

		} finally {
			this.closeResultSet(selectRslt);
			this.closePreparedStatement(selectStmt);
		}
	}
	
	/**
	 * �R���X�g���N�^
	 */
	public UnitCostApprDBAccessor() {
	}

	/**
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public UnitCostApprDBAccessor(IDbConnection connect) {
		_conn = connect;
	}

	/**
	 * �R�l�N�V�����ݒ�<BR>
	 * �R�l�N�V�����̎Q�Ƃ𖳌��ɂ���ꍇ�A������null��ݒ肷�邱��
	 *
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public void setConnection(IDbConnection connect) {
		_conn = connect;
	}

	/** �P�����F�����p�R�l�N�V���� */
	private IDbConnection _conn = null;

	/**
	 * �v���y�A�h�X�e�[�g�����g�����
	 *
	 * @param statement ����Ώۂ̃X�e�[�g�����g
	 */
	private void closePreparedStatement(PreparedStatement statement) {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				statement = null;
			}
		}
	}

	/**
	 * ���U���g�Z�b�g�����
	 *
	 * @param resultset ����Ώۂ̃��U���g�Z�b�g
	 */
	private void closeResultSet(ResultSet resultset) {
		if (resultset != null) {
			try {
				resultset.close();
			} catch (SQLException e) {
				resultset = null;
			}
		}
	}
}
