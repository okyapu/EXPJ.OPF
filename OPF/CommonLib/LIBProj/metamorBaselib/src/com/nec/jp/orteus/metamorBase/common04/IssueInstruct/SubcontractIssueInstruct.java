/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/metamorBaselib/src/com/nec/jp/orteus/metamorBase/common04/IssueInstruct/SubcontractIssueInstruct.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */
package com.nec.jp.orteus.metamorBase.common04.IssueInstruct;

import java.sql.*;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;

/**
 * �o�Ɏw���N���X
 * @author $Author: tai-yanhong $
 * @version $Revision: 1.18 $ $Date: 2012/10/11 09:21:38 $
 */
public class SubcontractIssueInstruct {
    /** DB�A�N�Z�X�p�̃R�l�N�V���� */
    private IDbConnection conn = null;

    private String userCd = null;
    private String businessID = null;

    /** �����f�[�^�擾�p��SQL */
    private String selectOdSql
            = "select "
              + "  T_OD.OD_NO as OD_NO, "
              + "  T_OD.ITEM_CD as ITEM_CD, "
              + "  T_OD.PS_EDITION as PS_EDITION, "
              + "  to_char(T_OD.ODR_QTY, 'fm999999999999999990.0999') as ODR_QTY, "
              + "  to_char(T_OD.ISSUE_TYP) as ISSUE_TYP, "
              + "  to_char(T_OD.PS_UNIT_QTY, 'fm999999999999999990.0999') as PS_UNIT_QTY, "
              + "  to_char(T_OD.PS_UNIT_DENOMINATOR, 'fm999999999999999990.0999') as PS_UNIT_DENOMINATOR, "
              + "  to_char(T_OD.PS_UNIT_NUMERATOR, 'fm999999999999999990.0999') as PS_UNIT_NUMERATOR, "
              + "  to_char(T_OD.MRP_ODR_TYP) as MRP_ODR_TYP, "
              + "  to_char(M_ITEM.UNIT_QTY_TYP) as UNIT_QTY_TYP, "
              + "  to_char(T_OD.DUE_DATE,'YYYY/MM/DD') as DUE_DATE, "
              + "  to_char(T_OD.PS_SPOIL,'fm999999990.0999') as PS_SPOIL "
              + "from "
              + "  T_OD, "
              + "  M_ITEM "
              + "where "
              + "  T_OD.ITEM_CD = M_ITEM.ITEM_CD "
              + "  and T_OD.PARENT_OD_NO = ? ";
    /** �x���敪���f�f�[�^�擾SQL */
    private String selectConsUnitCostSql
            = "select "
              + "  M_CONS_UNIT_COST.ONEROUS_FLG as ONEROUS_FLG "
              + "from "
              + "  M_CONS_UNIT_COST, "
              + "  ( "
              + "    select "
              + "      MAX(M_CONS_UNIT_COST.EFF_PHASE_IN_DATE) as EFF_PHASE_IN_DATE "
              + "    from "
              + "      M_CONS_UNIT_COST "
              + "    where "
              + "      M_CONS_UNIT_COST.COMPANY_CD = ? "
              + "      and M_CONS_UNIT_COST.VEND_CD = ? "
              + "      and M_CONS_UNIT_COST.PLANT_CD = ? "
              + "      and M_CONS_UNIT_COST.ITEM_CD = ? "
              + "      and M_CONS_UNIT_COST.EFF_PHASE_IN_DATE <= to_date(?, 'YYYY/MM/DD') "
              + "  ) T1 "
              + "where  M_CONS_UNIT_COST.EFF_PHASE_IN_DATE = T1.EFF_PHASE_IN_DATE "
              + "   and M_CONS_UNIT_COST.COMPANY_CD = ? "
              + "   and M_CONS_UNIT_COST.VEND_CD = ? "
              + "   and M_CONS_UNIT_COST.PLANT_CD = ? "
              + "   and M_CONS_UNIT_COST.ITEM_CD = ? ";
    /** �o�Ɏw���o�^SQL */
    private String insertIssueInstSql
            = " insert into "
              + "  T_ISSUE_INST(ISSUE_INST_CD, PLANT_CD, OD_NO, ITEM_CD, PS_EDITION, PUCH_ODR_CD, COMPANY_CD, VEND_CD, CONS_TYP, WORK_ODR_CD, WORK_IN_PROC_CD, WS_CD, WH_CD, ISSUE_INST_UNIT_QTY, ISSUE_INST_UNIT_DENOMINATOR, ISSUE_INST_UNIT_NUMERATOR, ISSUE_INST_QTY, TOTAL_ISSUE_QTY, SCDL_ISSUE_DATE, ISSUE_CMPLT_DATE, ISSUE_TYP, ISSUE_CMPLT_FLG, ISSUE_INST_ISS_FLG, ISSUE_INST_ISS_DATE, ISSUE_INST_COMMENT, CREATED_DATE, CREATED_BY, CREATED_PRG_NM, UPDATED_DATE, UPDATED_BY, UPDATED_PRG_NM, MODIFY_COUNT) "
              + "values "
              + "  (?, ?, ?, ?, ?, ?, ?, ?, to_number(?), NULL, NULL, NULL, ?, to_number(?), to_number(?), to_number(?), to_number(?), 0, to_date(?, 'YYYY/MM/DD HH24:MI'), NULL, to_number(?), 0, 0, NULL, NULL, sysdate, ?, ?, sysdate, ?, ?, 0) ";
    private String selectSysParameterSql
            = "select "
              + "  upper(SYS_PARAMETER.VALUE) as VALUE "
              + "from "
              + "  SYS_PARAMETER "
              + "where "
              + "   SYS_PARAMETER.NAME = ? ";
    private String selectWhSql
            = "select "
              + "  M_WH.WH_CD as WH_CD "
              + "from "
              + "  M_WH "
              + "where "
              + "  M_WH.COMPANY_CD = ? "
              + "  and M_WH.PLANT_CD = ?"
              + "  and M_WH.VEND_CD = ? ";
// ���� 2008/08/06 ADD START -TSUCHIDA����
	/** �H���Ǘ��i�ڋ敪�f�[�^�擾SQL **/
	private String selectItemSql
			= "select "
			  + "  to_char(M_ITEM.MANHOUR_TYP) as MANHOUR_TYP "
			  + "from "
			  + "  M_ITEM "
			  + "where "
			  + "  M_ITEM.ITEM_CD = ? ";
// ���� 2008/08/06 ADD END -TSUCHIDA����

    /**
     * �R���X�g���N�^
     * @param connect �R�l�N�V������OPEN����Ă���IDbConnection
     * @param busineId �Ɩ�ID
     * @param userCd ���[�U�R�[�h
     */
    public SubcontractIssueInstruct(IDbConnection connect,
                                    String busineId,
                                    String userCd) {
        this.conn = connect;
        this.businessID = busineId;
        this.userCd = userCd;
    }

    /**
     * �w�肳�ꂽ�L�[�̃R���{�{�b�N�X�f�[�^���擾����B
     * @param puchOdrCd �����R�[�h
     * @param odNo �I�[�_�[�f�}���h�ԍ�
     * @param puchOdrQty ������
     * @param itemCd �i�ڔԍ�
     * @param puchOdrStartDate �����\���
     * @param plantCd �H��R�[�h
     * @param companyCd ��ЃR�[�h
     * @param vendCd �����R�[�h
     * @throws SQLException DB�A�N�Z�X�Ɏ��s
     * @throws FoundationException �����̔Ԏ��s
     * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
     */
    public void addIssueInstruct(String puchOdrCd,
                                 String odNo,
                                 String puchOdrQty,
                                 String itemCd,
                                 String puchOdrStartDate,
                                 String plantCd,
                                 String companyCd,
                                 String vendCd) throws SQLException,
            FoundationException,
            DataNotFoundException {

        try {
            addIssueInstructCore(puchOdrCd,
                                 odNo,
                                 puchOdrQty,
                                 itemCd,
                                 puchOdrStartDate,
                                 plantCd,
                                 companyCd,
                                 vendCd,
                                 "1",
                                 "1",
                                 "1");
        } catch (DataNotFoundException ex) {
            throw ex;
        } catch (SQLException ex) {
            throw ex;
        } catch (FoundationException ex) {
            throw ex;
        }
    }

    /**
     * �ċA�I�ɏ��v�ʂ�ǂݍ���ŁA�o�Ɏw���ɓo�^���郁�\�b�h
     * @param puchOdrCd �����R�[�h
     * @param odNo �I�[�_�[�f�}���h�ԍ�
     * @param puchOdrQty ������
     * @param itemCd �i�ڔԍ�
     * @param puchOdrStartDate �����\���
     * @param plantCd �H��R�[�h
     * @param companyCd ��ЃR�[�h
     * @param vendCd �����R�[�h
     * @param parentPsUnitQty �e�������p���ł����\���P�ʐ�
     * @param parentPsUnitDenominator �e�������p���ł����\���P�ʐ�����
     * @param parentPsUnitNumerator �e�������p���ł����\���P�ʐ����q
     * @throws SQLException DB�A�N�Z�X�Ɏ��s
     * @throws FoundationException �����̔Ԏ��s
     * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
     */
    private void addIssueInstructCore(String puchOdrCd,
                                      String odNo,
                                      String puchOdrQty,
                                      String itemCd,
                                      String puchOdrStartDate,
                                      String plantCd,
                                      String companyCd,
                                      String vendCd,
                                      String parentPsUnitQty,
                                      String parentPsUnitDenominator,
                                      String parentPsUnitNumerator) throws
            SQLException,
            FoundationException,
            DataNotFoundException {

        PreparedStatement ps = null;
        ResultSet rs = null;
        String SPOILFLG  = null;
        String puchQdrQtyBak = null;

        try {
            // SQL�쐬
            ps = this.conn.getConn().prepareStatement(this.selectOdSql);
            ps.setString(1, odNo);
            // SQL���s
            rs = ps.executeQuery();
            SPOILFLG = this.getValue("SPOIL_FLG");
            // ��������ޔ�
            puchQdrQtyBak = puchOdrQty;
            // ���ʂ�ݒ�
            while (rs.next()) {

                // �[�����ǂ����𔻒f���邽�߂ɕK�v�ȃf�[�^���擾
                String OD_NO = rs.getString("OD_NO");
                String PS_UNIT_QTY = rs.getString("PS_UNIT_QTY");
                String MRP_ODR_TYP = rs.getString("MRP_ODR_TYP");
                String PS_UNIT_DENOMINATOR = rs.getString("PS_UNIT_DENOMINATOR");
                String PS_UNIT_NUMERATOR = rs.getString("PS_UNIT_NUMERATOR");
                String PS_SPOIL = rs.getString("PS_SPOIL");
                String UNIT_QTY_TYP = rs.getString("UNIT_QTY_TYP");
                puchOdrStartDate = rs.getString("DUE_DATE");
                puchOdrQty = puchQdrQtyBak;
                if ("8".equals(MRP_ODR_TYP)) {
                	/* �[���i�ڂ̔����w�����Čv�Z */
                    puchOdrQty = Calculate.divide(Calculate.multiply(puchOdrQty, PS_UNIT_NUMERATOR), PS_UNIT_DENOMINATOR, 10, Calculate._CEIL);
                    if ("2".equals(UNIT_QTY_TYP)) {
                    	puchOdrQty = Calculate.ceil(puchOdrQty, 4);
                    } else {
                    	puchOdrQty = Calculate.ceil(puchOdrQty, 0);
                    }
                    // �[���i�ڂ̏ꍇ�͍ċA
                    addIssueInstructCore(
                            puchOdrCd,
                            OD_NO,
                            puchOdrQty,
                            itemCd,
                            puchOdrStartDate,
                            plantCd,
                            companyCd,
                            vendCd,
                            Calculate.multiply(parentPsUnitQty, PS_UNIT_QTY),
                            Calculate.multiply(parentPsUnitDenominator, PS_UNIT_DENOMINATOR),
                            Calculate.multiply(parentPsUnitNumerator, PS_UNIT_NUMERATOR));
                } else {
                    // �[���i�ڈȊO�̏ꍇ��DB�o�^
                    // DB�o�^�ɕK�v�ȃf�[�^���擾�����Z
                    Numbering issueInstCdNumbering = new Numbering(this.conn,
                            Numbering.ISS_INST_CD,
                            this.userCd,
                            this.businessID,
                            plantCd);
                    String ISSUE_INST_CD = issueInstCdNumbering.getNo();
                    String ITEM_CD = rs.getString("ITEM_CD");
                    String PS_EDITION = rs.getString("PS_EDITION");
                    String ISSUE_TYP = rs.getString("ISSUE_TYP");
                    
                    String PLANT_CD = plantCd;
                    String PUCH_ODR_CD = puchOdrCd;
                    String COMPANY_CD = companyCd;
                    String VEND_CD = vendCd;
                    String CONS_TYP = this.getConsTyp(
                            companyCd,
                            vendCd,
                            plantCd,
                            ITEM_CD,
                            puchOdrStartDate);
                	
                	String ISSUE_INST_UNIT_DENOMINATOR = Calculate.ceil(Calculate.multiply(parentPsUnitDenominator, PS_UNIT_DENOMINATOR), 4);;
                    String ISSUE_INST_UNIT_NUMERATOR = Calculate.ceil(Calculate.multiply(parentPsUnitNumerator, PS_UNIT_NUMERATOR), 4);                	                   	
                    String ISSUE_INST_UNIT_QTY = null;
                    String a = Calculate.multiply(parentPsUnitQty, PS_UNIT_NUMERATOR);
                    String b = Calculate.divide(a, PS_UNIT_DENOMINATOR, 10, Calculate._CEIL);
                   
                    if ("2".equals(UNIT_QTY_TYP)) {
                        ISSUE_INST_UNIT_QTY = Calculate.ceil(b, 4);
                    } else {
                        ISSUE_INST_UNIT_QTY = Calculate.ceil(b, 0);
                    }

                    String ISSUE_INST_QTY = null;
                    if("1".equals(SPOILFLG)){
                        /*���v�ʍ\���d����*/
                        puchOdrQty =Calculate.multiply(puchOdrQty,Calculate.add("1", Calculate.divide(PS_SPOIL, "100",10, Calculate._CEIL)));
                    }
                	/*�o�Ɏw����*/
                	ISSUE_INST_QTY = Calculate.divide( Calculate.multiply(puchOdrQty, PS_UNIT_NUMERATOR), PS_UNIT_DENOMINATOR, 10, Calculate._CEIL);
                    if ("2".equals(UNIT_QTY_TYP)) {
                        ISSUE_INST_QTY = Calculate.ceil(ISSUE_INST_QTY, 4);
                    } else {
                        ISSUE_INST_QTY = Calculate.ceil(ISSUE_INST_QTY, 0);
                    }

                    String SCDL_ISSUE_DATE = puchOdrStartDate;

                    String WH_CD = null;
                    String value = null;
                    if ("1".equals(CONS_TYP)) {
                        // �p�����[�^�擾
                        value = this.getValue(plantCd + "_ONEROUS_CONS_INV_TYP");
                        if ("TRUE".equals(value)) {
                            WH_CD = this.getWhCd(
                                companyCd,
                                plantCd,
                                vendCd);
                        } else {
                            WH_CD = null;
                        }
                    } else {
                        WH_CD = this.getWhCd(
                                    companyCd,
                                    plantCd,
                                    vendCd);
                    }

// ���� 2008/08/06 ADD START -TSUCHIDA����

					PreparedStatement psMItem = null;
					ResultSet rsMItem = null;

					// SQL�쐬
					psMItem = this.conn.getConn().prepareStatement(this.selectItemSql);
					psMItem.setString(1, ITEM_CD);
					// SQL���s
					rsMItem = psMItem.executeQuery();

					rsMItem.next();

					String MANHOUR_TYP = rsMItem.getString("MANHOUR_TYP");

					if (!"1".equals(MANHOUR_TYP)) {
	// ���� 2008/08/06 ADD END -TSUCHIDA����
	                    this.insertIssueInst(ISSUE_INST_CD,
	                                         PLANT_CD,
	                                         OD_NO,
	                                         ITEM_CD,
	                                         PS_EDITION,
	                                         PUCH_ODR_CD,
	                                         COMPANY_CD,
	                                         VEND_CD,
	                                         CONS_TYP,
	                                         WH_CD,
	                                         ISSUE_INST_UNIT_QTY,
	                                         ISSUE_INST_UNIT_DENOMINATOR,
	                                         ISSUE_INST_UNIT_NUMERATOR,
	                                         ISSUE_INST_QTY,
	                                         SCDL_ISSUE_DATE,
	                                         ISSUE_TYP);
	// ���� 2008/08/06 ADD START -TSUCHIDA����
					}
					
					if(rsMItem != null){
						try{
							rsMItem.close();
							rsMItem = null;
						}catch(Exception e){
							e.printStackTrace();
						}
					}
					
					if(psMItem != null){
						try{
							psMItem.close();
							psMItem = null;
						}catch(Exception e){
							e.printStackTrace();
						}
					}
// ���� 2008/08/06 ADD END -TSUCHIDA����
                }
            }
        } catch (DataNotFoundException ex) {
            throw ex;
        } catch (SQLException ex) {
            throw ex;
        } catch (FoundationException ex) {
            throw ex;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }

    /**
     * �x���敪�擾���\�b�h
     * @param companyCd ��ЃR�[�h
     * @param vendCd �����R�[�h
     * @param plantCd �H��R�[�h
     * @param itemCd �i�ڔԍ�
     * @param puchOdrStartDate �����\���
     * @return �x���敪
     * @throws SQLException DB�A�N�Z�X�Ɏ��s�����Ƃ�
     */
    private String getConsTyp(String companyCd,
                              String vendCd,
                              String plantCd,
                              String itemCd,
                              String puchOdrStartDate) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String dtpuchOdrStartDate = "";
            if(!puchOdrStartDate.equals("") && !puchOdrStartDate.equals(null) && puchOdrStartDate.length() >= 10){
				dtpuchOdrStartDate = puchOdrStartDate.substring(0,10);
			}
            
            // SQL�쐬
            ps = this.conn.getConn().prepareStatement(this.
                    selectConsUnitCostSql);
            ps.setString(1, companyCd);
            ps.setString(2, vendCd);
            ps.setString(3, plantCd);
            ps.setString(4, itemCd);
            ps.setString(5, dtpuchOdrStartDate);
            ps.setString(6, companyCd);
            ps.setString(7, vendCd);
            ps.setString(8, plantCd);
            ps.setString(9, itemCd);
            // SQL���s
            rs = ps.executeQuery();
            // ���ʂ�ݒ�
            if (rs.next()) {
                // �m�x���P���n.�h�L���x���t���O�h���P�i�L���j�̏ꍇ�A
                if ("1".equals(rs.getString("ONEROUS_FLG"))) {
                    return "1";
                }
            }
        } catch (SQLException ex) {
            throw ex;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return "2";
    }

    /**
     * �o�Ɏw���f�[�^�o�^
     * @param ISSUE_INST_CD �H�H
     * @param PLANT_CD �H�H
     * @param OD_NO �H�H
     * @param ITEM_CD �H�H
     * @param PS_EDITION �H�H
     * @param PUCH_ODR_CD �H�H
     * @param COMPANY_CD �H�H
     * @param VEND_CD �H�H
     * @param CONS_TYP �H�H
     * @param WH_CD
     * @param ISSUE_INST_UNIT_QTY �H�H
     * @param ISSUE_INST_UNIT_DENOMINATOR �H�H
     * @param ISSUE_INST_UNIT_NUMERATOR �H�H
     * @param ISSUE_INST_QTY �H�H
     * @param SCDL_ISSUE_DATE �H�H
     * @param ISSUE_TYP �H�H
     * @return �o�^�������R�[�h��
     * @throws SQLException DB�A�N�Z�X�G���[
     * @throws DataNotFoundException �Y�����R�[�h�����݂��Ȃ��ꍇ
     */
    private int insertIssueInst(String ISSUE_INST_CD,
                                String PLANT_CD,
                                String OD_NO,
                                String ITEM_CD,
                                String PS_EDITION,
                                String PUCH_ODR_CD,
                                String COMPANY_CD,
                                String VEND_CD,
                                String CONS_TYP,
                                String WH_CD,
                                String ISSUE_INST_UNIT_QTY,
                                String ISSUE_INST_UNIT_DENOMINATOR,
                                String ISSUE_INST_UNIT_NUMERATOR,
                                String ISSUE_INST_QTY,
                                String SCDL_ISSUE_DATE,
                                String ISSUE_TYP) throws SQLException, DataNotFoundException {

        PreparedStatement ps = null;
        try {
            // SQL�쐬
            ps = this.conn.getConn().prepareStatement(this.insertIssueInstSql);
            // �C���T�[�g�f�[�^��ݒ�
            ps.setString(1, ISSUE_INST_CD);
            ps.setString(2, PLANT_CD);
            ps.setString(3, OD_NO);
            ps.setString(4, ITEM_CD);
            ps.setString(5, PS_EDITION);
            ps.setString(6, PUCH_ODR_CD);
            ps.setString(7, COMPANY_CD);
            ps.setString(8, VEND_CD);
            ps.setString(9, CONS_TYP);
            ps.setString(10, WH_CD);
            ps.setString(11, ISSUE_INST_UNIT_QTY);
            ps.setString(12, ISSUE_INST_UNIT_DENOMINATOR);
            ps.setString(13, ISSUE_INST_UNIT_NUMERATOR);
            ps.setString(14, ISSUE_INST_QTY);
            ps.setString(15, SCDL_ISSUE_DATE);
            ps.setString(16, ISSUE_TYP);
            ps.setString(17, this.userCd);
            ps.setString(18, this.businessID);
            ps.setString(19, this.userCd);
            ps.setString(20, this.businessID);
            // SQL���s
            int row = ps.executeUpdate();
            return row;
        } catch (SQLException e) {
            throw e;
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    /**
     * �p�����[�^�擾���\�b�h
     * @param name ���O
     * @return �ݒ�l
     * @throws SQLException DB�A�N�Z�X�Ɏ��s�����Ƃ�
     */
    private String getValue(String name) 
        throws SQLException, DataNotFoundException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String ret = null;
        try {
            // SQL�쐬
            ps = this.conn.getConn().prepareStatement(this.
                    selectSysParameterSql);
            ps.setString(1, name);
            // SQL���s
            rs = ps.executeQuery();
            // ���ʂ�ݒ�
            if (rs.next()) {
                ret = rs.getString("VALUE");
            } else {
                // �p�����[�^�����݂��Ȃ��ꍇ
                throw new DataNotFoundException("ZZ06001");
            }
        } catch (DataNotFoundException ex) {
            throw ex;
        } catch (SQLException ex) {
            throw ex;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return ret;
    }
    /**
     * �ۊǋ�擾���\�b�h
     * @param companyCd ��ЃR�[�h
     * @param plantCd �H��R�[�h
     * @param vendCd �����R�[�h
     * @return �ۊǋ�R�[�h
     * @throws SQLException DB�A�N�Z�X�Ɏ��s�����Ƃ�
     * @throws DataNotFoundException �ۊǋ悪���݂��Ȃ��ꍇ
     */
    private String getWhCd(String companyCd, String plantCd, String vendCd) 
        throws SQLException, DataNotFoundException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        String ret = null;
        try {
            // SQL�쐬
            ps = this.conn.getConn().prepareStatement(this.selectWhSql);
            ps.setString(1, companyCd);
            ps.setString(2, plantCd);
            ps.setString(3, vendCd);
            // SQL���s
            rs = ps.executeQuery();
            // ���ʂ�ݒ�
            if (rs.next()) {
                ret = rs.getString("WH_CD");
            } else {
                // �ۊǋ悪���݂��Ȃ��ꍇ
                throw new DataNotFoundException("ZZ11006");
            }
        } catch (DataNotFoundException ex) {
            throw ex;
        } catch (SQLException ex) {
            throw ex;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return ret;
    }
}
