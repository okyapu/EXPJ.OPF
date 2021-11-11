/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/JobOdrAlc.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */
package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

public class JobOdrAlc {
    
	/** �R�l�N�V���� */
	private IDbConnection _iconn = null;
	private Connection _conn = null;

	private final static BigDecimal bdZero = new BigDecimal("0");
	
	/**
	 * <pre>
	 * �R���X�g���N�^
	 * �w��̃R�l�N�V���������I�u�W�F�N�g���\�z����
	 * </pre>
	 * @param  connect �R�l�N�V������OPEN����Ă���IDbConnection
	 */
	public JobOdrAlc(IDbConnection connect){
		_iconn = connect;
		_conn = connect.getConn();
	}

	/**
	 * <pre>
	 * [���Ԉ���]�̈����ϐ����X�V���܂��B
	 * 
	 * �����Ŏw�肳�ꂽ�o�Ɏw�����ɑΉ�����[���Ԉ���]�̈����ϐ���
	 * �o�ɐ������Z���܂��B
	 * �Y������[���Ԉ���]�����݂��Ȃ��ꍇ�́A���R�[�h�ǉ����܂��B
	 * </pre>
	 * @param iIssueInstStruct �o�Ɏw�����
	 * @param iIssueNo          �o�ɐ�
	 * @param iUpdInfo         ���[�U���
	 * @throws SQLException
	 */
	public void updateAlcQty(IssueInstStruct iIssueInstStruct,
	                           BigDecimal iIssueNo,
	                           UpdateInfo iUpdInfo) 
	        throws SQLException ,FoundationException {
	    PreparedStatement psREAD=null;
	    PreparedStatement ps=null;
	    ResultSet rs=null;
	    String sql="";
	    
	    String sJOB_ODR_ALC_CD="";
	    String strOdrCd="";
	    BigDecimal dALCD_QTY = bdZero;
	    BigDecimal dISSUEED_QTY_SUM	= bdZero;
	    BigDecimal dRC = bdZero;
	    int iRC = 0;
	    BigDecimal	dISSUENO = bdZero;
	    boolean	bRC=true;
	    int	iIndex=0;
	    
	    try
	    {
	        //�o�Ɏw�������擾
	        IssueInstStruct stII = iIssueInstStruct;
	        dISSUENO = iIssueNo;
	        
	        // << ���Ԉ����̌��� >>
	        sql	= " SELECT JOB_ODR_CD," +
	              "JOB_ODR_ALC_CD, JOB_ODR_DETAIL_NO, " +
	              "ITEM_CD, ALCD_QTY, ISSUEED_QTY " +
	              " FROM T_JOB_ODR_ALC " +
	              " WHERE (OD_NO=? AND ALC_STOCK_TYP=1) ";
	        psREAD = _conn.prepareStatement(sql);
	        psREAD.setString(1,	stII.m_OD_NO);
	        rs = psREAD.executeQuery();
	        if (rs.next())
	        {
	            //<< ���Ԉ����̍X�V >>
	        	// �o�ɐ��̂����ŏo�Ɏc����葽������"�����ϐ�"�ɏ�悹���čX�V����B
	        	// �����ϐ��{�i�o�ɐ��|�i�����ϐ��|�o�ɍϐ��j�j
	        	// �܂�A�o�ɐ��{�o�ɍϐ� ��"�����ϐ�"���X�V���邱�ƂɂȂ�B
	            sJOB_ODR_ALC_CD	= rs.getString("JOB_ODR_ALC_CD");	//���Ԉ����Ǘ��ԍ�
	            dALCD_QTY =	rs.getBigDecimal("ISSUEED_QTY");
	            sql	= "	UPDATE T_JOB_ODR_ALC " +
                      "SET ALCD_QTY = ? " +
	                  "WHERE JOB_ODR_ALC_CD = ? ";
	            ps = _conn.prepareStatement(sql);
	            ps.setBigDecimal(1,	dALCD_QTY.add(dISSUENO));
	            ps.setString(2,	sJOB_ODR_ALC_CD);
	            iRC	= ps.executeUpdate();
	            
	        } else {
	            //<< ���Ԉ����̒ǉ� >>
	            //���Ԉ����Ǘ��ԍ��̍̔�
	            Numbering ODR_CD = new Numbering(_iconn,Numbering.JOB_OD_ALC_CD ,
	                                             iUpdInfo.getUpdateBy(),
	                                             iUpdInfo.getUpdatePrgNm(),
	                                             stII.m_PLANT_CD);
	            
	            strOdrCd = ODR_CD.getNo();
	            sql	= " INSERT INTO  T_JOB_ODR_ALC ( "
	                +" JOB_ODR_ALC_CD, "
	                +" OD_NO, "
	                +" PLANT_CD, "
	                +" ITEM_CD, "
	                +" ALC_STOCK_TYP, "
	                +" JOB_ODR_CD, "
	                +" JOB_ODR_DETAIL_NO, "
	                +" ALCD_QTY, "
	                +" ISSUEED_QTY, "
	                +" ISSUE_CMPLT_FLG, "
	                +" CREATED_BY, "
	                +" CREATED_PRG_NM, "
	                +" UPDATED_BY, "
	                +" UPDATED_PRG_NM, "
	                +" MODIFY_COUNT "
	                +" ) "
	                +" values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
	            iIndex = 1;
	            ps = _conn.prepareStatement(sql);
	            ps.setString(iIndex++, strOdrCd);			// ���Ԉ����Ǘ��ԍ�
	            ps.setString(iIndex++, stII.m_OD_NO);		// �I�[�_�f�}���h�ԍ�
	            ps.setString(iIndex++, stII.m_PLANT_CD);	// �H��R�[�h
	            ps.setString(iIndex++, stII.m_ITEM_CD);		// �i�ڔԍ�
	            ps.setInt(iIndex++, 1);						// �����݌ɋ敪
	            ps.setNull(iIndex++, Types.VARCHAR);		// ����
	            ps.setInt(iIndex++, 0 );					// ���Ԏ}��
	            ps.setBigDecimal(iIndex++, dISSUENO);		// �����ςݐ�
	            ps.setInt(iIndex++, 0);						// �o�ɍςݐ�
	            ps.setInt(iIndex++, 0);						// �o�Ɋ����t���O
	            ps.setString(iIndex++, iUpdInfo.getUpdateBy()); 
	            ps.setString(iIndex++, iUpdInfo.getUpdatePrgNm()); 
	            ps.setString(iIndex++, iUpdInfo.getUpdateBy()); 
	            ps.setString(iIndex++, iUpdInfo.getUpdatePrgNm()); 
	            ps.setDouble(iIndex++, 0); 
	            iRC	= ps.executeUpdate();
	        }
	    } finally {
			if (rs != null)    { rs.close(); }
			if (ps != null)    { ps.close(); }
			if (psREAD != null){
				try{
					psREAD.close();
				}catch(Exception e){
					e.printStackTrace();
				}
				psREAD = null;
			}
	    }
	}    
}
