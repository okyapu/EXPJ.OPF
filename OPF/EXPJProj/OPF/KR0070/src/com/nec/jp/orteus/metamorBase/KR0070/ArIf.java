/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/src/com/nec/jp/orteus/metamorBase/KR0070/ArIf.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.metamorBase.KR0070;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
/**
 * ���|�h�^�e
 *
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 07:52:15 $
*/
public class ArIf {

    /**
     * ���|�h�^�e�{��
     */
    private KZ0010P001 tempKZ0010P001;
    
    /**
     * ���|�h�^�e�{�́iJa�j
     */
    private KZ1010P001 tempKZ1010P001;
    
    /**
     * ���t���O 1:J 2:Ja
     */
    private String Flag;
    
    /**
     * setFlag
     * @param flag
     */
    public void setFlag(String flag){
    	Flag = flag;
    }

    /**
     * ���|�h�^�e���Ăяo���܂��B
     *
     * @param conn �R�l�N�V������OPEN����Ă���IDbConnection
     * @param userId ���O�C�����[�U
     */
    public ArIf(IDbConnection conn, String flag){
    	if ("1".equals(flag)) {
    		tempKZ0010P001 = new KZ0010P001(conn);
        } else {
        	tempKZ1010P001 = new KZ1010P001(conn);
        }
    	setFlag(flag);
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
    	if ("1".equals(Flag)) {
    		tempKZ0010P001.setParameter(mode, userId, originalSlipCd,
    				redSlipCd, blackSlipCd, taxCd);
        } else {
        	tempKZ1010P001.setParameter(mode, userId, originalSlipCd,
    				redSlipCd, blackSlipCd, taxCd);
        }
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
    	if ("1".equals(Flag)) {
    		return tempKZ0010P001.execute();
        } else {
        	return tempKZ1010P001.execute();
        }
    }
}