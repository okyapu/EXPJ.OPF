package com.nec.jp.orteus.metamorBase.common03.ContractUnitCost;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigDecimal;
/**
 * �P�����擾����N���X
 */
public class ContractUnitCost{
	//�P���擾�N�G��
	private final static String query = 
		"select " +
		" to_char(M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE,'yyyy/mm/dd') as EFF_PHASE_IN_DATE, " +
		" to_char(M_SBCNT_UNIT_COST.SBCNT_SIZE,'fm999999999999999990.0999') as SBCNT_SIZE," +
		" to_char(M_SBCNT_UNIT_COST.UNIT_COST_TYP) as UNIT_COST_TYP, " +
		" to_char(M_SBCNT_UNIT_COST.UNIT_COST,'fm999999999999999990.0999') as UNIT_COST," +
		" to_char(M_SBCNT_UNIT_COST.PROCESSING_COST,'fm999999999999999990.0999') as PROCESSING_COST, " +
		" to_char(M_SBCNT_UNIT_COST.MATERIAL_COST,'fm999999999999999990.0999') as MATERIAL_COST," +
		" to_char(M_SBCNT_UNIT_COST.OTHER_OVERHEADS,'fm999999999999999990.0999') as OTHER_OVERHEADS," +
		" to_char(M_VEND_CTRL.ROUND_TYP) as ROUND_TYP" +
		" from " +
		" M_SBCNT_UNIT_COST,M_VEND_CTRL" +
		" where " +
		" M_SBCNT_UNIT_COST.COMPANY_CD=? and" +
		" M_SBCNT_UNIT_COST.VEND_CD=? and" +
		" M_SBCNT_UNIT_COST.PLANT_CD=? and" +
		" M_SBCNT_UNIT_COST.ITEM_CD=? and" +
		" M_SBCNT_UNIT_COST.PROC_CD=? and" +
		" to_char(M_SBCNT_UNIT_COST.EFF_PHASE_IN_DATE,'yyyy/mm/dd')<=? and" +
		" M_SBCNT_UNIT_COST.SBCNT_SIZE<=? and" +
		" M_SBCNT_UNIT_COST.COMPANY_CD=M_VEND_CTRL.COMPANY_CD and" +
		" M_SBCNT_UNIT_COST.VEND_CD=M_VEND_CTRL.VEND_CD" +
		" order by " +
		" EFF_PHASE_IN_DATE desc," +
		" SBCNT_SIZE desc";

	/**
	 * �P�������擾����
	 *
	 * @param  conn   IDbConnection
	 * @param  companyCd ��ЃR�[�h
	 * @param  vendCd    �����R�[�h
	 * @param  plantCd   �H��R�[�h
	 * @param  itemCd    �i�ڔԍ�
	 * @param  procCd    �i�ڕʍ�ƃR�[�h
	 * @param  startDate �n��ʒ����
	 * @param  size      ��Ǝw����
	 * @return �P�����ێ�Struct
	 * @throws FoundationException �P���擾���s����throw
	*/
	public static ContractUnitCostStruct getData(IDbConnection conn,String companyCd,String vendCd,
											String plantCd,String itemCd,String procCd,String startDate,String size) throws FoundationException{

        PreparedStatement stmt = null;
        ResultSet rs = null;

		ContractUnitCostStruct returnStruct = new ContractUnitCostStruct();
		try{
System.out.println("(SBM1201)���N�G���F" + query);
            stmt = (conn.getConn()).prepareStatement(query);
            stmt.setString(1, companyCd);
            stmt.setString(2, vendCd);
            stmt.setString(3, plantCd);
            stmt.setString(4, itemCd);
            stmt.setString(5, procCd);
            stmt.setString(6, startDate);
            stmt.setString(7, size);

            rs = stmt.executeQuery();
			if(!rs.next()){
				returnStruct.setEFF_PHASE_IN_DATE(startDate);
				returnStruct.setSBCNT_SIZE(size);
				returnStruct.setUNIT_COST_TYP("1");
				returnStruct.setUNIT_COST("0.0");
				returnStruct.setPROCESSING_COST("0.0");
				returnStruct.setMATERIAL_COST("0.0");
				returnStruct.setOTHER_OVERHEADS("0.0");
				returnStruct.setPUCH_ODR_AMOUNT("0.0");
			}else{
				returnStruct.setEFF_PHASE_IN_DATE(rs.getString("EFF_PHASE_IN_DATE"));
				returnStruct.setSBCNT_SIZE(rs.getString("SBCNT_SIZE"));
				returnStruct.setUNIT_COST_TYP(rs.getString("UNIT_COST_TYP"));
				returnStruct.setUNIT_COST(rs.getString("UNIT_COST"));
				returnStruct.setPROCESSING_COST(rs.getString("PROCESSING_COST"));
				returnStruct.setMATERIAL_COST(rs.getString("MATERIAL_COST"));
				returnStruct.setOTHER_OVERHEADS(rs.getString("OTHER_OVERHEADS"));

				int round = 0;
				switch(Integer.parseInt(rs.getString("ROUND_TYP"))){
					case 1:  round = BigDecimal.ROUND_HALF_UP;//�l�̌ܓ�
					case 2:  round = BigDecimal.ROUND_UP;//�؂�グ
					case 3:  round = BigDecimal.ROUND_DOWN;//�؎̂�
					default :  round = BigDecimal.ROUND_HALF_UP;//�l�̌ܓ�
				}
				
				BigDecimal bdUnitCost = new BigDecimal(returnStruct.getUNIT_COST());
				BigDecimal bdSize = new BigDecimal(size);
				BigDecimal sum = bdUnitCost.multiply(bdSize).setScale(0,round).setScale(1);
				returnStruct.setPUCH_ODR_AMOUNT(sum.toString());
			}

			return returnStruct;

		}catch(Exception e){
			FoundationException fe = new FoundationException("UnitCostPlan","getData","(SBM1202)�P���擾�Ɏ��s���܂����B");
			fe.setPreviousException(e);
			throw fe;
		}finally{
			try{
				if(rs != null){
					rs.close();
					rs = null;
				}
				if(stmt != null){
					stmt.close();
					stmt = null;
				}
			}catch(SQLException se){}
		}
	}
}

