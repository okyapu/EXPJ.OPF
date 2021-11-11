/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/common/UpdateInfo.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.common;

/**
 * <pre>
 * �X�V���N���X
 * �X�V���(�X�V���A�X�V�ҁA�X�V�v���O������)��ێ����邱�Ƃ��ł��܂��B
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:58 $
 *
 **/

public class UpdateInfo{

    /* �X�V���ێ��p �ϐ���` */
    private String _updateBy;       // �X�V��
    private String _updatePrgNm;    // �X�V�v���O����
    private int _modifyCount;       // �X�V�v���O����
    private int[] _someModifyCount; // �X�V��(����)

    /**
     * �R���X�g���N�^
     * @param iUpdateBy �X�V��
     * @param iUpdatePrgNm     �X�V�v���O����
     * @param iModifyCount �X�V��
     */
    public UpdateInfo(String iUpdateBy, String iUpdatePrgNm, int iModifyCount){
        _updateBy = iUpdateBy;
        _updatePrgNm = iUpdatePrgNm;
        _modifyCount = iModifyCount;
    }

    /**
     * �R���X�g���N�^<br>
     * ���X�V���������K�v�ȏꍇ�̃R���X�g���N�^�B
     * @param iUpdateBy �X�V��
     * @param iUpdatePrgNm     �X�V�v���O����
     * @param iModifyCount �X�V��(����)
     */
    public UpdateInfo(String iUpdateBy, String iUpdatePrgNm, int[] iSomeModifyCount){
        _updateBy = iUpdateBy;
        _updatePrgNm = iUpdatePrgNm;
        _someModifyCount = iSomeModifyCount;
    }

    //-------  ���J���\�b�h  -------------------------------
    /**
     * �X�V�҂�Ԃ��܂��B
     * @return �X�V��
     */
    public String getUpdateBy(){
        return _updateBy;
    }

    /**
     * �X�V�v���O������Ԃ��܂��B
     * @return �X�V��
     */
    public String getUpdatePrgNm(){
        return _updatePrgNm;
    }

    /**
     * �X�V����Ԃ��܂��B
     * @return �X�V��
     */
    public int getModifyCount(){
        return _modifyCount;
    }

    /**
     * �����̍X�V����Ԃ��܂��B
     * @return �X�V���̔z��
     */
    public int[] getSomeModifyCount(){
        return _someModifyCount;
    }
}
