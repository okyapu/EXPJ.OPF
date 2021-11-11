/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/process/IssueComplete.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.process;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.pr.rcvissue.common.RcvIssueConst;
import com.nec.jp.orteus.expj.pr.rcvissue.common.UpdateInfo;

/**
 * <pre>
 * �o�Ɋ��������N���X
 * �u�o�Ɋ����v�Ƃ����o�Ɏw���ɑ΂��Ċ����������s�����Ƃ��ł��܂��B
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.5 $ $Date: 2009/10/22 06:13:49 $
 *
 **/

public class IssueComplete implements RcvIssueConst{

    /**
     * �R���X�g���N�^
     */
    private IssueComplete(){
    }

    //-------  ���J���\�b�h  -------------------------------
    /**
     * �o�Ɏw���ԍ��A�I�[�_�f�}���h�ԍ������ɏo�Ɋ����������������s���B<br>
     * ���R�~�b�g�͍s���܂���B<br>
     * ���Ώۃ��R�[�h�̔r���������s���܂��B
     *
     * @param iConnect �R�l�N�V������OPEN����Ă���IDbConnection
     * @param iIssueInstCd      �o�Ɏw���ԍ�
     * @param iOdNo       �I�[�_�f�}���h�ԍ�
     * @param iUpInfo       �X�V���擾�N���X
     * @return int<br>STS_OK�F����I��<br>STS_NO_RECORD�F�f�[�^�����݂��Ȃ�<br>
	 * STS_UPDATED�F�f�[�^���X�V�ς�<br>STS_OTHER�F���̑��̃G���[
     * @throws SQLException DB�A�N�Z�X�G���[
     */
    public static final int Cancel(IDbConnection iConnect, String iIssueInstCd, String iOdNo, UpdateInfo iUpInfo)
        throws SQLException {

        PreparedStatement psSelectTIssueInst = null;
        PreparedStatement psTIssueInst = null;
        PreparedStatement psTOd = null;
        ResultSet rs = null;

        // �����`�F�b�N
        if( iConnect == null || iUpInfo == null ||
            !StringUtil.Validate(iIssueInstCd) || !StringUtil.Validate(iOdNo) ){
            IllegalArgumentException e = new IllegalArgumentException("IssueComplete.Cancel()");
			throw e;
        }

        Connection conn = iConnect.getConn();

        /* [�o�Ɏw��]�f�[�^�Ǎ�(�r�����[�h)��SQL */
        String selectTIssueInst =
            "select "
                + "  T_ISSUE_INST.MODIFY_COUNT "
                + "from "
                + "  T_ISSUE_INST "
                + "where "
                + "  T_ISSUE_INST.ISSUE_INST_CD = ? "
                + "for update nowait";

        /* [�o�Ɏw��]�f�[�^�X�V��SQL */
        String updateTIssueInst =
            "update "
                + "  T_ISSUE_INST "
                + "set "
                + "  T_ISSUE_INST.ISSUE_CMPLT_DATE = null, "                                    // �o�Ɋ����� �� NULL
                + "  T_ISSUE_INST.ISSUE_CMPLT_FLG = ?, "    // �o�Ɋ����t���O �� 0:��
                + "  T_ISSUE_INST.UPDATED_DATE = SYSDATE, "
                + "  T_ISSUE_INST.UPDATED_BY = ?, "
                + "  T_ISSUE_INST.UPDATED_PRG_NM = ?, "
                + "  T_ISSUE_INST.MODIFY_COUNT = T_ISSUE_INST.MODIFY_COUNT + 1 "
                + "where "
                + "  T_ISSUE_INST.ISSUE_INST_CD = ? ";

        /* [���v��]�f�[�^�X�V��SQL */
        String updateTOd =
            "update "
                + "  T_OD "
                + "set "
                + "  T_OD.DM_STS_TYP = ?, "  // �f�}���h��ԋ敪 �� 2:�m��(����)
                + "  T_OD.ISSUE_CMPLT_DATE = null, "                            // �o�Ɋ����� �� NULL
                + "  T_OD.UPDATED_DATE = SYSDATE, "
                + "  T_OD.UPDATED_BY = ?, "
                + "  T_OD.UPDATED_PRG_NM = ?, "
                + "  T_OD.MODIFY_COUNT = T_OD.MODIFY_COUNT + 1 "
                + "where "
                + "  T_OD.OD_NO = ? ";

        try {
            // [�o�Ɏw��]�f�[�^�Ǎ���SQL�쐬
            psSelectTIssueInst = conn.prepareStatement(selectTIssueInst);
            psSelectTIssueInst.setString(1, iIssueInstCd);
            rs = psSelectTIssueInst.executeQuery();

            // [�o�Ɏw��]�̑��݃`�F�b�N
            if(!rs.next()){
                return RcvIssueConst.STS_NO_RECORD;
            }

            // [�o�Ɏw��]."�X�V��"�̃`�F�b�N����
            if( rs.getInt(1) != iUpInfo.getModifyCount() ){
                return RcvIssueConst.STS_UPDATED;
            }

            // [�o�Ɏw��]�f�[�^�X�V��SQL�쐬
            psTIssueInst = conn.prepareStatement(updateTIssueInst);
            psTIssueInst.setInt(1, RcvIssueConst.ISSUE_CMPLT_YET);
            psTIssueInst.setString(2, iUpInfo.getUpdateBy());
            psTIssueInst.setString(3, iUpInfo.getUpdatePrgNm());
            psTIssueInst.setString(4, iIssueInstCd);

            // [���v��]�f�[�^�X�V��SQL�쐬
            psTOd = conn.prepareStatement(updateTOd);
            psTOd.setInt(1, RcvIssueConst.DM_STS_ALREADY);
            psTOd.setString(2, iUpInfo.getUpdateBy());
            psTOd.setString(3, iUpInfo.getUpdatePrgNm());
            psTOd.setString(4, iOdNo);

            // SQL���s
            psTIssueInst.executeQuery();
            psTOd.executeQuery();

            return RcvIssueConst.STS_OK;
        } finally {
			if (psSelectTIssueInst != null) {
				try {
					psSelectTIssueInst.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				psSelectTIssueInst = null;
			}
			if (psTIssueInst != null) {
				psTIssueInst.close();
			}

			if (psTOd != null) {
				psTOd.close();
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				rs = null;
			}
		}
    }
}
