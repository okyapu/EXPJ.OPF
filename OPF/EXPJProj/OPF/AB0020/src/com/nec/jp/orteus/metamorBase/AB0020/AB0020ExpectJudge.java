//------------------------------------------------------------------------------
/**
 * CLASS     : AB0020ExpectJudge �N���X
 * �t�@�C���E�N���X����
 * @author $Author: kong-haijing $
 * @version $Revision: 1.2 $ $Date: 2007/11/02 03:49:08 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AB0020;

public class AB0020ExpectJudge
{
	//--------------------------------------------------------------------------
	// �\�z
	/** �R���X�g���N�^ */
	AB0020ExpectJudge(){ clear(); }

	//--------------------------------------------------------------------------
	// ��`

	// ���茋�� ----------------------------------------------------------------
	/** YES */
	public final static int YES = 1;
	/** NO */
	public final static int NO = 0;
	/** �֌W�Ȃ� */
	public final static int IRRELEVANT = -1;

	// �eDB���ڂ̒萔 ----------------------------------------------------------
	// ��ԋ敪
	private final static int STS_YET_MRP = 1;
	private final static int STS_MRP = 2;
	private final static int STS_MRP_DONE = 3;
	private final static int STS_CHILD_FIXED = 4;
	private final static int STS_OWN_FIXED = 5;
	private final static int STS_COMPLETED = 9;

	// �����敪
	private final static int EXP_ADD = 1;
	private final static int EXP_CHANGE = 2;
	private final static int EXP_COMPLETED = 9;

	// �폜�t���O
	private final static int DEL_NO = 0;
	private final static int DEL_YES = 1;

	//--------------------------------------------------------------------------
	// ����
	/**
	 * ������{<br>
	 * �w��̏�Ԃ� ���v�ʌv�Z�Ώ�/�Čv�Z/�폜 �𔻒肵�ێ�����B
	 * @param stsTyp ��ԋ敪
	 * @param expTyp �����敪
	 * @param delFlg �폜�t���O
	 * @return true: �����
	 */
	public boolean expect(int stsTyp, int expTyp, int delFlg)
	{
		clear();
		// ���v�ʌv�Z?
		switch(stsTyp){
			case STS_YET_MRP:
				_isCalculate = NO;  break;
			case STS_MRP:
				_isCalculate = YES; break;
		}
		// �폜?
		switch(stsTyp){
			case STS_YET_MRP:
			case STS_MRP:
				_isDelete = NO;
				break;
			case STS_MRP_DONE:
			case STS_CHILD_FIXED:
				if(delFlg == DEL_NO || expTyp == EXP_ADD)
					_isDelete = NO;
				else
					_isDelete = YES;
				break;
			default: break;
		}
		// �Čv�Z?
		switch(stsTyp){
			case STS_YET_MRP:
			case STS_MRP:
				_isRecalculate = NO;
				break;
			case STS_MRP_DONE:
			case STS_CHILD_FIXED:
				if(expTyp == EXP_ADD)
					_isRecalculate = YES;
				else
					_isRecalculate = NO;
				break;
			default:
				break;
		}
		return true;
	}
	/**
	 * ���v�ʌv�Z�ΏۂƂ��邩 ?
	 * @return ���O�̔���̌��ʂ�ԋp�B
	 * AA0020ExpectJudge.YES: ���v�ʌv�Z�Ώ�/
	 * AA0020ExpectJudge.NO: ���v�ʌv�Z�ΏۊO/
	 * AA0020ExpectJudge.IRRELEVANT: ����ΏۊO�A���薢���{
	 */
	public int isCalculate(){ return _isCalculate; }
	/**
	 * ��������ɍČv�Z���邩 ?
	 * @return ���O�̔���̌��ʂ�ԋp�B
	 * AA0020ExpectJudge.YES: �Čv�Z����/
	 * AA0020ExpectJudge.NO: �Čv�Z���Ȃ�/
	 * AA0020ExpectJudge.IRRELEVANT: ����ΏۊO�A���薢���{
	 */
	public int isRecalculate(){ return _isRecalculate; }
	/**
	 * ���̐��Ԃ��폜����?
	 * @return ���O�̔���̌��ʂ�ԋp�B
	 * AA0020ExpectJudge.YES: �폜����/
	 * AA0020ExpectJudge.NO: �폜���Ȃ�/
	 * AA0020ExpectJudge.IRRELEVANT: ����ΏۊO�A���薢���{
	 */
	public int isDelete(){ return _isDelete; }
	/**
	 * ���茋�ʂ̃N���A<br>
	 * ���茋�ʂ�S�� �֌W�Ȃ� �ɐݒ肷��
	 */
	public void clear()
	{
		_isCalculate = IRRELEVANT;
		_isRecalculate = IRRELEVANT;
		_isDelete = IRRELEVANT;
	}

	//--------------------------------------------------------------------------
	// ����

	/** ���v�ʌv�Z�ΏۂƂ���? */
	private int _isCalculate;

	/** �Čv�Z����? */
	private int _isRecalculate;

	/** �폜����? */
	private int _isDelete;
}
