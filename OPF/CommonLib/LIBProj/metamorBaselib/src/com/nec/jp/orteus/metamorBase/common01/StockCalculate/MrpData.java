//------------------------------------------------------------------------------
// (#)MrpData.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// History
// 2003/07/04 �V�K�쐬 K.Matsumoto
// 2003/08/05 version 1.00 ���� M.Isoda
// 2003/08/08 version 1.01 �p�b�P�[�W���ɔ����ύX M.Isoda
//            �O�Fcom.nec.jp.orteus.metamorBase.AB0010
//            ��Fcom.nec.jp.orteus.metamorBase.common01.StockCalculate
//            ���\�b�h�igetNewPlanOrder_double(), setNewPlanOrder()�j��public�֕ύX
//------------------------------------------------------------------------------

//------------------------------------------------------------------------------
// 2003/08/08 M.Isoda
//------------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.common01.StockCalculate;
//------------------------------------------------------------------------------

/**
 * MRP�̃f�[�^�N���X�B
 *
 * @author K.Matsumoto
 * @version 1.00
 */
public class MrpData
{
	private String _fixDemand			= "0.0";
	private String _planDemand			= "0.0";
	private String _fixOrder			= "0.0";
	private String _planOrder			= "0.0";
	private String _stock				= "0.0";

	/**
	 * �m��f�}���h�擾�B
	 * @return String �m��f�}���h
	 */
	public String getFixDemand()
	{
		return _fixDemand;
	}

	/**
	 * �v��f�}���h�擾�B
	 * @return String �v��f�}���h
	 */
	public String getPlanDemand()
	{
		return _planDemand;
	}

	/**
	 * �m��I�[�_�擾�B
	 * @return String �m��I�[�_
	 */
	public String getFixOrder()
	{
		return _fixOrder;
	}

	/**
	 * �v��I�[�_�擾�B
	 * @return String �v��I�[�_
	 */
	public String getPlanOrder()
	{
		return _planOrder;
	}

	/**
	 * �L���݌Ɏ擾�B
	 * @return String �L���݌�
	 */
	public String getStock()
	{
		return _stock;
	}

	/**
	 * �m��f�}���h�擾�B
	 * @return double �m��f�}���h
	 */
	double getFixDemand_double()
	{
		try {
			return Double.parseDouble(_fixDemand);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	/**
	 * �v��f�}���h�擾�B
	 * @return double �v��f�}���h
	 */
	double getPlanDemand_double()
	{
		try {
			return Double.parseDouble(_planDemand);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	/**
	 * �m��I�[�_�擾�B
	 * @return double �m��I�[�_
	 */
	double getFixOrder_double()
	{
		try {
			return Double.parseDouble(_fixOrder);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	/**
	 * �v��I�[�_�擾�B
	 * @return double �v��I�[�_
	 */
	double getPlanOrder_double()
	{
		try {
			return Double.parseDouble(_planOrder);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	/**
	 * �L���݌Ɏ擾�B
	 * @return double �L���݌�
	 */
	double getStock_double()
	{
		try {
			return Double.parseDouble(_stock);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}




	/**
	 * �m��f�}���h�ݒ�B
	 * @param fixDemand �m��f�}���h
	 */
	void setFixDemand(String fixDemand)
	{
		_fixDemand = fixDemand;
	}

	/**
	 * �v��f�}���h�ݒ�B
	 * @param planDemant �v��f�}���h
	 */
	void setPlanDemand(String planDemant)
	{
		_planDemand = planDemant;
	}

	/**
	 * �m��I�[�_�ݒ�B
	 * @param fixOrder �m��I�[�_
	 */
	void setFixOrder(String fixOrder)
	{
		_fixOrder = fixOrder;
	}

	/**
	 * �v��I�[�_�ݒ�B
	 * @param planOrder �v��I�[�_
	 */
	void setPlanOrder(String planOrder)
	{
		_planOrder = planOrder;
	}

	/**
	 * �L���݌ɐݒ�B
	 * @param stock �L���݌�
	 */
	void setStock(String stock)
	{
		_stock = stock;
	}



//------------------------------------------------------------------------------
// 2003/07/25 M.Isoda
//------------------------------------------------------------------------------
	private String _newPlanOrder		= "0.0";
	private String _planDate			= "";

	/**
	 * �V�v��I�[�_�擾�B
	 * @return String �V�v��I�[�_
	 */
	public String getNewPlanOrder()
	{
		return _newPlanOrder;
	}
	/**
	 * �V�v��I�[�_�擾�B
	 * @return double �V�v��I�[�_
	 */
	public double getNewPlanOrder_double()
	{
		try {
			return Double.parseDouble(_newPlanOrder);
		} catch(Exception e) {
			e.printStackTrace();
			return 0.0;
		}
	}
	/**
	 * �V�v��I�[�_�ݒ�B
	 * @param newPlanOrder �V�v��I�[�_
	 */
	public void setNewPlanOrder(String newPlanOrder)
	{
		_newPlanOrder = newPlanOrder;
	}



	/**
	 * �v����t�擾�B
	 * @return String ���t
	 */
	public String getPlanDate()
	{
		return _planDate;
	}

	/**
	 * �v����t�ݒ�B
	 * @param String ���t
	 */
	void setPlanDate(String planDate)
	{
		_planDate = planDate;
	}

//------------------------------------------------------------------------------
// 2003/07/30 M.Isoda
//------------------------------------------------------------------------------
	// �x���t���O
	private boolean _holiday			= false;

	/**
	 * �x���t���O�擾�B
	 * @return �x���t���O
	 */
	public boolean getHoliday()
	{
		return _holiday;
	}

	/**
	 * �x���t���O�ݒ�B
	 * @param boolean �x���t���O
	 */
	public void setHoliday(boolean holiday)
	{
		_holiday = holiday;
	}

}
