/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/pr/rcvissue/common/RcvIssueConst.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 */

package com.nec.jp.orteus.expj.pr.rcvissue.common;

/**
 * <pre>
 * ���o�ɒ萔��`�C���^�t�F�[�X
 * </pre>
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:58 $
 *
 **/

public interface RcvIssueConst {

    /** �X�e�[�^�X�F����I��(0) */
    final static int STS_OK = 0;

    /** �X�e�[�^�X�F���R�[�h�����݂��Ȃ�(-1) */
    final static int STS_NO_RECORD = -1;

    /** �X�e�[�^�X�F�Ώۃ��R�[�h���X�V�ς�(-2) */
    final static int STS_UPDATED = -2;

    /** �X�e�[�^�X�F���̑��̃G���[(-9) */
    final static int STS_OTHER = -9;

    /** �o�Ɋ����t���O 0:�� */
    final static int ISSUE_CMPLT_YET = 0;

    /** �o�Ɋ����t���O 1:���� */
    final static int ISSUE_CMPLT_DONE = 1;

    /** �f�}���h��ԋ敪 0:�f�}���h���ł͂Ȃ� */
    final static int DM_STS_NO_DEMAND = 0;

    /** �f�}���h��ԋ敪 1:�v��(������) */
    final static int DM_STS_PLAN = 1;

    /** �f�}���h��ԋ敪 2:�m��(������) */
    final static int DM_STS_ALREADY = 2;

    /** �f�}���h��ԋ敪 9:���� */
    final static int DM_STS_COMPLETE = 9;

    /** ���v�ʑΏۃt���O 0:�� */
    final static int MRP_NONE = 0;

    /** ���v�ʑΏۃt���O 1:���v�ʌv�Z�Ώ� */
    final static int MRP_TARGET = 1;

    /** �����\�t���O 0:��\�łȂ� */
    final static int WH_INSIDE_NO_TYPICAL = 0;

    /** �����\�t���O 1:��\ */
    final static int WH_INSIDE_TYPICAL = 1;

    /** �O���\�t���O 0:��\�łȂ� */
    final static int WH_OUTSIDE_NO_TYPICAL = 0;

    /** �O���\�t���O 1:��\ */
    final static int WH_OUTSIDE_TYPICAL = 1;

    /** �\�[�g�t���O ���� */
    final static boolean SORT_ASC = true;

    /** �\�[�g�t���O �~�� */
    final static boolean SORT_DESC = false;

    /** �����݌ɋ敪 1:�i�ڍ݌� */
    final static int ALC_STOCK_ITEM = 1;

    /** �����݌ɋ敪 2:���ԍ݌ɁE��s��z���� */
    final static int ALC_STOCK_JOB_ODR = 2;

    /** ���Ԏ}�� ZERO */
    final static int JOB_ODR_DETAIL_ZERO = 0;

    /** �Ǎ����[�h �r�����b�N�Ȃ� */
    final static int NONE_LOCK = 0;

    /** �Ǎ����[�h �r�����b�N���� */
    final static int SELECT_FOR_UPDATE = 1;
    
    /** WH_PRIORITY_REF_NO */
    final static String STR_WH_PRIORITY_REF_NO = "999999999999999999";
}