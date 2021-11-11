//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0050ModeCheck �N���X
 * �t�@�C���E�N���X����
 * @author $Author: suganuma $
 * @version $Revision: 1.3 $ $Date: 2010/04/12 00:18:40 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0050;

/**
 * ��ʌ������s���̓��샂�[�h�̐ݒ�A�擾��񋟂��܂��B
 *
 * @author  K.Tamura
 * @version 1.00
 */
public class AZ0050ModeCheck
{
	private String _process_mode;    /** �������[�h */
	private int    _input_mode;      /** ���̓��[�h */

	/**
	 * �R���X�g���N�^�B
	 */
	public AZ0050ModeCheck()
	{
		_process_mode = null;
		_input_mode   = 0;
	}


	/**
	 * ���[�h�̏�����<br>
	 *
	 */
    public void initialize()
	{
		_process_mode = AZ0050Const.C_PROCESS_REF;
		_input_mode   = AZ0050Const.C_INPUT_GUI;
	}


	/**
	 * �������[�h�̐ݒ�<br>
	 *
	 * @param i_mode �������[�h������������
	 */
    public void setProcessMode(String i_mode)
	{
		_process_mode = i_mode;
	}


	/**
	 * ���̓��[�h�̐ݒ�<br>
	 *
	 * @param i_mode ���̓��[�h�������l
	 */
    public void setInputMode(int i_mode)
	{
		_input_mode = i_mode;
	}


	/**
	 * �������[�h�̎擾<br>
	 *
	 * @return String �������[�h������������
	 */
    public String getProcessMode()
	{
		return _process_mode;
	}


	/**
	 * ���̓��[�h�̎擾<br>
	 *
	 * @return int ���̓��[�h�������l
	 */
    public int getInputMode()
	{
		return _input_mode;
	}


	/**
	 * ���̓��[�h�̎擾<br>
	 *
	 * @return String ���̓��[�h������������
	 */
    public String getInputModeString()
	{
		if(_input_mode == AZ0050Const.C_INPUT_GUI){
			return "GUI";
		} else {
			return "FREE";
		}
	}


	/**
	 * �������[�h�̔���i�ǉ��j<br>
	 *
	 * @return boolean �ǉ����[�h�Ȃ� true
	 *                 ����ȊO�Ȃ� false
	 */
    public boolean isInsert()
	{
		boolean ret = false;

		if(_process_mode != null){
			if(_process_mode.equals(AZ0050Const.C_PROCESS_INS))
				ret = true;
		}
		return ret;
	}


	/**
	 * �������[�h�̔���i���ʁj<br>
	 *
	 * @return boolean ���ʃ��[�h�Ȃ� true
	 *                 ����ȊO�Ȃ� false
	 */
    public boolean isCopy()
	{
		boolean ret = false;

		if(_process_mode != null){
			if(_process_mode.equals(AZ0050Const.C_PROCESS_COPY))
				ret = true;
		}
		return ret;
	}


	/**
	 * �������[�h�̔���i�X�V�j<br>
	 *
	 * @return boolean �X�V���[�h�Ȃ� true
	 *                 ����ȊO�Ȃ� false
	 */
    public boolean isUpdate()
	{
		boolean ret = false;

		if(_process_mode != null){
			if(_process_mode.equals(AZ0050Const.C_PROCESS_UPD))
				ret = true;
		}
		return ret;
	}


	/**
	 * �������[�h�̔���i�Q�Ɓj<br>
	 *
	 * @return boolean �Q�ƃ��[�h�Ȃ� true
	 *                 ����ȊO�Ȃ� false
	 */
    public boolean canReference()
	{
		boolean ret = false;

		if(_process_mode != null){
			if(_process_mode.equals(AZ0050Const.C_PROCESS_REF))
				ret = true;
		}
		return ret;
	}


	/**
	 * �������[�h�̔���i�Q�ƈȊO�j<br>
	 *
	 * @return boolean �Q�ƃ��[�h�ȊO�Ȃ� true
	 *                 �Q�ƃ��[�h�Ȃ� false
	 */
    public boolean isnotREF()
	{
		boolean ret = false;

		if(_process_mode != null){
			if(!_process_mode.equals(AZ0050Const.C_PROCESS_REF))
				ret = true;
		}
		return ret;
	}


	/**
	 * ���̓��[�h�̔���i�f�t�h�j<br>
	 *
	 * @return boolean �f�t�h���[�h�Ȃ� true
	 *                 ����ȊO�Ȃ� false
	 */
    public boolean isGUI()
	{
		boolean ret = false;

		if(_input_mode == AZ0050Const.C_INPUT_GUI)
			ret = true;
		return ret;
	}


	/**
	 * ���̓��[�h�̔���i�t���[�j<br>
	 *
	 * @return boolean �t���[���̓��[�h�Ȃ� true
	 *                 ����ȊO�Ȃ� false
	 */
    public boolean isFree()
	{
		boolean ret = false;

		if(_input_mode == AZ0050Const.C_INPUT_FREE)
			ret = true;
		return ret;
	}

	/**
	 * �s�ǉ��̔���i�f�t�h�j<br>
	 *
	 * @return boolean �s�ǉ�(�f�t�h)�Ȃ� true
	 *                 ����ȊO�Ȃ� false
	 */
    public boolean isNew()
	{
		boolean ret = false;

		if(_process_mode != null){
			if((_process_mode.equals(AZ0050Const.C_PROCESS_INS))&&
				(_input_mode == AZ0050Const.C_INPUT_GUI))
				ret = true;
		}
		return ret;
	}
}
