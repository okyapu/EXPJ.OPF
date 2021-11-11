/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/sa/ArIf.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.sa;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.metamorBase.KZ0010.*;

/**
 * ���|�h�^�e
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:08 $
*/
public class ArIf {

    /**
     * ���|�h�^�e�{��
     */
    private KZ0010P001 tempKZ0010P001;

    /**
     * ���|�h�^�e���Ăяo���܂��B
     *
     * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
     * @param userId ���O�C�����[�U
     */
    public ArIf(IDbConnection conn){
        tempKZ0010P001 = new KZ0010P001(conn);
    }

    /**
     * �p�����[�^��ݒ肵�܂��B<BR>
     * <BR>
     * @param mode           �������[�h
     *                         1:�o�׎���-�o�^
     *                         2:�o�׎���-���
     *                         3:�o�׎���-�ԕi
     *                         4:��̔���-�o�^
     *                         5:��̔���-���
     *                         6:���̑�����-�o�^
     *                         7:���̑�����-�X�V
     *                         8:���̑�����-�폜
     *                         9:�a������I/F
     * @param userId         �ďo�����p�҃R�[�h
     * @param originalSlipCd ���`�[�ԍ�
     * @param redSlipCd      �ԓ`�[�ԍ�
     * @param blackSlipCd    ���`�[�ԍ�
     */
    public void setParameter(String mode, String userId, String originalSlipCd,
                             String redSlipCd, String blackSlipCd)
    {
        tempKZ0010P001.setParameter(mode, userId, originalSlipCd,
                                    redSlipCd, blackSlipCd);
    }

    /**
     * ���b�Z�[�W�ԍ�
     */
    private String _messageNo = "0";

    /**
     * ���������s���܂��B<BR>
     *
     * @return ���b�Z�[�W�ԍ�
     *         ����I����:"0"
     */
    public String execute() {
        return tempKZ0010P001.execute();
    }
}