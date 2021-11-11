//------------------------------------------------------------------------------
/**
 * CLASS     : AC0060Const �N���X
 * �t�@�C���E�N���X����
 * @author $Author: izukura $
 * @version $Revision: 1.2 $ $Date: 2007/04/06 07:44:26 $
 *
 */
//-----------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.AC0060;

/**
 * AC0060���� �萔��`�C���^�t�F�[�X�N���X
 */
public interface AC0060Const
{
	//--------------------------------------------------------------------------
	// M_CAL �ғ�/��ғ�

	/** �ғ� */
	public final static int C_WORKDAY = 0;
	/** ��ғ� */
	public final static int C_HOLIDAY = 1;

	//--------------------------------------------------------------------------
	// M_ITEM �i�ڎ�z�敪(MRP_ODR_TYP)

	/** �i�ڎ�z�敪:�}�j���A����z�i�� */
	public final static String C_ODR_MANUAL = "4";
	/** �i�ڎ�z�敪:���b�g��z�i�� */
	public final static String C_ODR_LOT = "5";

	//--------------------------------------------------------------------------
	// M_ITEM �݌ɐ��ʒP�ʋ敪(UNIT_QTY_TYP)

	/** �݌ɐ��ʒP�ʋ敪:�����Ǘ� */
	public final static String C_UNIT_QTY_INTEGER = "1";

	//--------------------------------------------------------------------------
	// T_OD �I�[�_��ԋ敪(ODR_STS_TYP)

	/** �I�[�_��ԋ敪:�I�[�_�łȂ� */
	public final static String C_ODR_STS_NONE = "0";
	/** �I�[�_��ԋ敪:�v�� */
	public final static String C_ODR_STS_PLAN = "1";

	//--------------------------------------------------------------------------
	// T_OD �f�}���h��ԋ敪(DM_STS_TYP)

	/** �f�}���h��ԋ敪:�f�}���h�łȂ� */
	public final static String C_DM_STS_NONE = "0";
	/** �f�}���h��ԋ敪:�v�� */
	public final static String C_DM_STS_PLAN = "1";

	//--------------------------------------------------------------------------
	// T_OD ���v�ʏ����敪(MRP_TYP)

	/** ���v�ʏ����敪:�� */
	public final static String C_MRP_DONE = "9";
	/** ���v�ʏ����敪:�ǉ� */
	public final static String C_MRP_ADD = "1";

	//--------------------------------------------------------------------------
	// T_OD �I�[�_�f�}���h�敪(OD_TYP)

	/** �I�[�_�f�}���h�敪:�I�[�_ */
	public final static String C_KIND_ODER = "2";
	/** �I�[�_�f�}���h�敪:�f�}���h */
	public final static String C_KIND_DMD = "3";
	
	//--------------------------------------------------------------------------
	// T_OD �O���f�}���h�t���O(EXTERNAL_DM_FLG)

	/** �O���f�}���h�t���O:�����f�}���h */
	public final static String C_EXT_DM_NO = "0";
	/** �O���f�}���h�t���O:�O���f�}���h */
	public final static String C_EXT_DM_YES = "1";

	//--------------------------------------------------------------------------
	// T_OD �I�[�_�����ς݃t���O(ODR_RELEASE_FLG)/����O���v��̃T�}�����g�p

	/** �I�[�_�����σt���O:�� */
	public final static String C_RELEASE_YET = "0";
	/** �I�[�_�����σt���O:�� */
	public final static String C_RELEASE_DONE = "1";

	//--------------------------------------------------------------------------
	// T_EXTERNAL_PLAN �폜�t���O(EXTERNAL_PLAN_DEL_FLG)

	/** �O���v��폜�t���O:�� */
	public final static String C_EXT_DEL_NO = "0";
	/** �O���v��폜�t���O:�폜�Ώ� */
	public final static String C_EXT_DEL_YES = "1";

	//--------------------------------------------------------------------------
	// T_EXTERNAL_PLAN �����敪

	/** �O���v�揈���敪:�ǉ� */
	public final static String C_EXT_EXP_ADD = "1";
	/** �O���v�揈���敪:�ύX */
	public final static String C_EXT_EXP_CHANGE = "2";

	//--------------------------------------------------------------------------
	// ��ʃ��[�h

	/** ��ʃ��[�h:�������� */
	public final static String C_SELECT = "select";
	/** ��ʃ��[�h:�o�^ */
	public final static String C_INSERT = "insert";
	/** ��ʃ��[�h:�X�V */
	public final static String C_UPDATE = "udpate";
	/** ��ʃ��[�h:����/����ȊO�̏��� */
	public final static String C_NORMAL = "normal";
	/** ��ʃ��[�h:���鏈�� */
	public final static String C_CLOSE = "close";

	//--------------------------------------------------------------------------
	// ��ʃ`�F�b�N�{�b�N�X�ݒ�l(���ʕ��i��W�J����)  ��ʐݒ聨Control����

	/** �`�F�b�N�{�b�N�X:ON */
	public final static String C_CHECK_YES = "on";
	/** �`�F�b�N�{�b�N�X:OFF */
	public final static String C_CHECK_NO = "off";

	//--------------------------------------------------------------------------
	/** ���\�[�X�o���h����ꖼ(����) */
	public final static String C_DICNAME = "OrteusUserDic";
	
	/** �����́u�ߋ��v�L�[ */
	public final static String C_KEYWORD_PAST = "Expj.Cmt0030";
}
