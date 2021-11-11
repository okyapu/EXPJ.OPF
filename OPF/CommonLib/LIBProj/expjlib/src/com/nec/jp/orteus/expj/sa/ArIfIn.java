/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/sa/ArIfIn.java,v $
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
 * @author $Author: zhang-yan $
 * @version $Revision: 1.1 $ $Date: 2015/04/16 05:06:25 $
*/
public class ArIfIn {

    /**
     * ���|�h�^�e�{��
     */
    private KZ0010P002 tempKZ0010P002;

    /**
     * ���|�h�^�e���Ăяo���܂��B
     *
     * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
     * @param userId ���O�C�����[�U
     */
    public ArIfIn(IDbConnection conn){
        tempKZ0010P002 = new KZ0010P002(conn);
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
     * @param taxCd          ����ŃR�[�h
     */
    public void setParameter(String mode, String userId, String originalSlipCd,
                             String redSlipCd, String blackSlipCd, String taxCd)
    {
        tempKZ0010P002.setParameter(mode, userId, originalSlipCd,
                                    redSlipCd, blackSlipCd, taxCd);
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
        return tempKZ0010P002.execute();
    }
}