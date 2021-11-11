/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/RcvIssueEntity.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.Numbering;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;


/**
 * <pre>
 * �ۊǋ�ʓ��o�Ƀt�@�C���@�f�[�^����N���X
 * �@�\�T�v�F�ۊǋ�ʓ��o�Ƀt�@�C���̌����A�o�^�Ȃǂ��s���N���X�ł��B
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.4 $ $Date: 2008/03/26 07:28:03 $
 *
 */
public class RcvIssueEntity {
    private	IDbConnection _iconn;			// �g�����U�N�V�����R�l�N�V�������
    private	Connection _conn;				// �R�l�N�V�������
    private	UpdateInfo _updInfo;			// ���p�ҊǗ����(�C���i�[�N���X)

    private final static BigDecimal bdZero = new BigDecimal("0");    

    /**
     * �R���X�g���N�^
     *
     */
    protected RcvIssueEntity(IDbConnection conn, UpdateInfo iUpdInfo) {
    	_iconn = conn;
    	_conn =	_iconn.getConn();
    	_updInfo = iUpdInfo;
    }    
    
	protected String insert(RcvIssueStruct inData) 
	                     throws SQLException,FoundationException {
		String strOdrCd = "";
		PreparedStatement ps = null;
		try {
			int iIndex = 1;
			Numbering ODR_CD = null;
			String sql = "insert into "
					+ " T_RCV_ISSUE( "
					+ " RCV_ISSUE_CTRL_CD," // ���o�ɊǗ��ԍ�
					+ "RCV_ISSUE_TYP," // ���o�ɋ敪
					+ "ITEM_CD," // �i�ڔԍ�
					+ "PLANT_CD," // �H��R�[�h
					+ "WH_CD," // �ۊǋ�R�[�h
					+ "JOB_ODR_CD," // ����
					+ "JOB_ODR_DETAIL_NO," // ���Ԏ}��
					+ "PUCH_ODR_CD," // �����ԍ�
					+ "ACPT_NO," // �����
					+ "ACPT_RSLT_CRCT_NO," // ������ђ�����
					+ "INSPEC_RSLT_CRCT_NO," // �������ђ�����
					+ "WORK_ODR_CD," // ��ƌv��ԍ�
					+ "WORK_IN_PROC_CD," // �d�|��ƃR�[�h
					+ "PARTIAL_PRD_NO," // �����
					+ "OPR_RSLT_CRCT_NO," // ��Ǝ��ђ�����
					+ "ISSUE_INST_CD," // �o�Ɏw���ԍ�
					+ "RCV_ISSUE_QTY," // ���o�ɐ�
					+ "RCV_ISSUE_AMOUNT," // ���o�ɋ��z
					+ "RCV_ISSUE_DATE," // ���o�ɔN����
					+ "RCV_ISSUE_GNR_TYP," // ���o�ɔ����敪
					+ "RCV_ISSUE_ODD_QTY," // ���o�ɒ[��
					+ "DEFECT_CAUSE_CD," // ���o�ɕs�Ǘ��R�R�[�h
					+ "STOCK_UPD_TYP," // �݌ɍX�V�敪
					+ "RCV_ISSUE_CMPLT_FLG," // ���o�Ɋ����t���O
					+ "OD_NO," // �I�[�_�f�}���h�ԍ�
					+ "VEND_LOT_NO," // ���[�J���b�g�ԍ�
					+ "RCV_ISSUE_COMMENT," // ���o�ɔ��l
					+ "COMPANY_CD," // ��ЃR�[�h
					+ "VEND_CD," // �����R�[�h
					+ "CONS_TYP," // �x���敪
					+ "CONS_EXEC_DATE," // �L���x�����ђ��o��
					+ "CREATED_BY," // �쐬��
					+ "CREATED_PRG_NM," // �쐬�v���O������
					+ "UPDATED_BY," // �X�V��
					+ "UPDATED_PRG_NM," // �X�V�v���O������
					+ "MODIFY_COUNT," // �X�V��
					+ "LOT_NO)"        //  �݌Ƀ��b�g�ԍ�
					+ "values ("
					+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
					+ " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			// _log.methodStart();

			if (ps == null) {
				ps = _conn.prepareStatement(sql);
			}

			// ���o�ɊǗ��ԍ��̍̔�
			ODR_CD = new Numbering(_iconn, Numbering.ISSUE_CD, _updInfo.getUpdateBy(), _updInfo.getUpdatePrgNm(),
					inData.m_PLANT_CD);
			strOdrCd = ODR_CD.getNo();

			// << �ۊǋ�ʓ��o�ɂ̓o�^ >>
			ps.setString(iIndex++, strOdrCd); // ���o�ɊǗ��ԍ�
			ps.setInt(iIndex++, inData.m_RCV_ISSUE_TYP); // ���o�ɋ敪
			ps.setString(iIndex++, Nvl(inData.m_ITEM_CD)); // �i�ڔԍ�
			ps.setString(iIndex++, Nvl(inData.m_PLANT_CD)); // �H��R�[�h
			setNvl(iIndex++, inData.m_WH_CD, ps); // �ۊǋ�R�[�h
			setNvl(iIndex++, inData.m_JOB_ODR_CD, ps); // ����
			ps.setDouble(iIndex++, inData.m_JOB_ODR_DETAIL_NO); // ���Ԏ}��
			ps.setString(iIndex++, inData.m_PUCH_ODR_CD); // �����ԍ�
			ps.setDouble(iIndex++, inData.m_ACPT_NO); // �����
			ps.setDouble(iIndex++, inData.m_ACPT_RSLT_CRCT_NO); // ������ђ�����
			ps.setDouble(iIndex++, inData.m_INSPEC_RSLT_CRCT_NO); // �������ђ�����
			ps.setString(iIndex++, inData.m_WORK_ODR_CD); // ��ƌv��ԍ�
			ps.setString(iIndex++, inData.m_WORK_IN_PROC_CD); // �d�|��ƃR�[�h
			ps.setDouble(iIndex++, inData.m_PARTIAL_PRD_NO); // �����
			ps.setDouble(iIndex++, inData.m_OPR_RSLT_CRCT_NO); // ��Ǝ��ђ�����
			ps.setString(iIndex++, inData.m_ISSUE_INST_CD); // �o�Ɏw���ԍ�
			ps.setBigDecimal(iIndex++, inData.m_RCV_ISSUE_QTY); // ���o�ɐ�
			ps.setBigDecimal(iIndex++, inData.m_RCV_ISSUE_AMOUNT); // ���o�ɋ��z
			setNvl(iIndex++, inData.m_RCV_ISSUE_DATE, ps); // ���o�ɔN����
			ps.setInt(iIndex++, inData.m_RCV_ISSUE_GNR_TYP); // ���o�ɔ����敪
			ps.setBigDecimal(iIndex++, inData.m_RCV_ISSUE_ODD_QTY); // ���o�ɒ[��
			setNvl(iIndex++, inData.m_DEFECT_CAUSE_CD, ps); // ���o�ɕs�Ǘ��R�R�[�h
			ps.setInt(iIndex++, inData.m_STOCK_UPD_TYP); // �݌ɍX�V�敪(�X�V�ς�)
			ps.setInt(iIndex++, inData.m_RCV_ISSUE_CMPLT_FLG); // ���o�Ɋ����t���O
			ps.setString(iIndex++, inData.m_OD_NO); // �I�[�_�f�}���h�ԍ�
			ps.setString(iIndex++, inData.m_VEND_LOT_NO); // ���[�J���b�g�ԍ�
			ps.setString(iIndex++, inData.m_RCV_ISSUE_COMMENT); // ���o�ɔ��l
			ps.setString(iIndex++, inData.m_COMPANY_CD); // ��ЃR�[�h
			ps.setString(iIndex++, inData.m_VEND_CD); // �����R�[�h
			ps.setDouble(iIndex++, inData.m_CONS_TYP); // �x���敪
			setNvl(iIndex++, inData.m_CONS_EXEC_DATE, ps); // �L���x�����ђ��o��
			// -----------------------------------------------------------------
			ps.setString(iIndex++, _updInfo.getUpdateBy()); // �쐬��
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm()); // �쐬�v���O������
			ps.setString(iIndex++, _updInfo.getUpdateBy()); // �X�V��
			ps.setString(iIndex++, _updInfo.getUpdatePrgNm()); // �X�V�v���O������
			ps.setDouble(iIndex++, 0); // �X�V��
		    ps.setString(iIndex++, inData.m_LOT_NO);                //  �݌Ƀ��b�g�ԍ�

			int iCnt = ps.executeUpdate();
			// DEBUG
			// _log.message("�ۊǋ�ʓ��o�ɂ̓o�^��=["+iIndex+"]");
			// _log.message(sql);

			ps.close(); // ������ƍH�v����\��B

			// _log.methodEnd();

			return strOdrCd;
		} catch (SQLException e) {
			throw e;
		} catch (FoundationException ee) {
			throw ee;
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				ps = null;
			}
		}
	}
	// -------------------------------------------------------
	//      ����J���\�b�h
	//-------------------------------------------------------

	/**
	 * �P�D�w�肳�ꂽ������NULL�̏ꍇ�A�����O�̕������ԋp���܂��B
	 * �Q�D�w�肳�ꂽ������NUll�łȂ��ꍇ�́A�w�肳�ꂽ�������
	 *     ���̂܂ܕԋp���܂��B
	 */
	private String Nvl(String iStr) {
		String ret_str;
		if (iStr == null) {
			ret_str = "";
		}else{
			ret_str = iStr;
		}
		return ret_str;
		
	}
	/**
	 * �P�D�w�肳�ꂽ���t�^��NULL�̏ꍇ�A�����O�̕������ԋp���܂��B
	 * �Q�D�w�肳�ꂽ���t�^��NUll�łȂ��ꍇ�́A
	 *     �w�肳�ꂽ������(���t)��/�t���ɕϊ����ĕԋp���܂��B
	 */
	private String Nvl(Date iDate) {
		String ret_str;

		if (iDate == null) {
			ret_str = "";
		}else{
			ret_str = Converter.dateToStr(iDate,Converter.SLASH_DATE);
		}
		return ret_str;
	}
	
	
	/**
	 * PrearedStatment�ɁA�w�肳�ꂽ�l��ݒ肵�܂��B
	 * @param idx    ���ڈʒu���
	 * @param iStr   �ݒ蕶����   
	 * @param iPs    PreparedStatement
	 * @throws SQLException
	 *
	 */
	private void setNvl(int idx, String iStr, PreparedStatement iPs) 
	                throws SQLException {
		
		if (iStr == null) {
			iPs.setNull(idx,Types.VARCHAR);
		} else {
			iPs.setString(idx,iStr);
		}
	}
	private void setNvl(int idx, Date iDate, PreparedStatement iPs) 
					throws SQLException {
		
		if (iDate == null) {
			iPs.setNull(idx,Types.DATE);
		} else {
			iPs.setDate(idx,new java.sql.Date(iDate.getTime()));
		}
	}

}
