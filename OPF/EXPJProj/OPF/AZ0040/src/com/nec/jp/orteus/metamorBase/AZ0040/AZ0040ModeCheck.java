//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040ModeCheck クラス
 * ファイル・クラス説明
 * @author $Author: ootsuki-yasuko $
 * @version $Revision: 1.2 $ $Date: 2006/09/06 00:41:20 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0040;

/**
 * 一般検索（参照）実行中の動作モードの設定、取得を提供します。
 *
 * @author  K.Tamura
 * @version 1.00
 */
public class AZ0040ModeCheck
{
	private String _process_mode;    /** 処理モード */
	private int    _input_mode;      /** 入力モード */

	/**
	 * コンストラクタ。
	 */
	public AZ0040ModeCheck()
	{
		_process_mode = null;
		_input_mode   = 0;
	}


	/**
	 * モードの初期化<br>
	 *
	 */
    public void initialize()
	{
		_process_mode = AZ0040Const.C_PROCESS_REF;
		_input_mode   = AZ0040Const.C_INPUT_GUI;
	}


	/**
	 * 処理モードの設定<br>
	 *
	 * @param i_mode 処理モードを示す文字列
	 */
    public void setProcessMode(String i_mode)
	{
		_process_mode = i_mode;
	}


	/**
	 * 入力モードの設定<br>
	 *
	 * @param i_mode 入力モードを示す値
	 */
    public void setInputMode(int i_mode)
	{
		_input_mode = i_mode;
	}


	/**
	 * 処理モードの取得<br>
	 *
	 * @return String 処理モードを示す文字列
	 */
    public String getProcessMode()
	{
		return _process_mode;
	}


	/**
	 * 入力モードの取得<br>
	 *
	 * @return int 入力モードを示す値
	 */
    public int getInputMode()
	{
		return _input_mode;
	}


	/**
	 * 入力モードの取得<br>
	 *
	 * @return String 入力モードを示す文字列
	 */
    public String getInputModeString()
	{
		if(_input_mode == AZ0040Const.C_INPUT_GUI){
			return "GUI";
		} else {
			return "FREE";
		}
	}


	/**
	 * 処理モードの判定（追加）<br>
	 *
	 * @return boolean 追加モードなら true
	 *                 それ以外なら false
	 */
    public boolean isInsert()
	{
		boolean ret = false;

		if(_process_mode != null){
			if(_process_mode.equals(AZ0040Const.C_PROCESS_INS))
				ret = true;
		}
		return ret;
	}


	/**
	 * 処理モードの判定（複写）<br>
	 *
	 * @return boolean 複写モードなら true
	 *                 それ以外なら false
	 */
    public boolean isCopy()
	{
		boolean ret = false;

		if(_process_mode != null){
			if(_process_mode.equals(AZ0040Const.C_PROCESS_COPY))
				ret = true;
		}
		return ret;
	}


	/**
	 * 処理モードの判定（更新）<br>
	 *
	 * @return boolean 更新モードなら true
	 *                 それ以外なら false
	 */
    public boolean isUpdate()
	{
		boolean ret = false;

		if(_process_mode != null){
			if(_process_mode.equals(AZ0040Const.C_PROCESS_UPD))
				ret = true;
		}
		return ret;
	}


	/**
	 * 処理モードの判定（参照）<br>
	 *
	 * @return boolean 参照モードなら true
	 *                 それ以外なら false
	 */
    public boolean canReference()
	{
		boolean ret = false;

		if(_process_mode != null){
			if(_process_mode.equals(AZ0040Const.C_PROCESS_REF))
				ret = true;
		}
		return ret;
	}


	/**
	 * 処理モードの判定（参照以外）<br>
	 *
	 * @return boolean 参照モード以外なら true
	 *                 参照モードなら false
	 */
    public boolean isnotREF()
	{
		boolean ret = false;

		if(_process_mode != null){
			if(!_process_mode.equals(AZ0040Const.C_PROCESS_REF))
				ret = true;
		}
		return ret;
	}


	/**
	 * 入力モードの判定（ＧＵＩ）<br>
	 *
	 * @return boolean ＧＵＩモードなら true
	 *                 それ以外なら false
	 */
    public boolean isGUI()
	{
		boolean ret = false;

		if(_input_mode == AZ0040Const.C_INPUT_GUI)
			ret = true;
		return ret;
	}


	/**
	 * 入力モードの判定（フリー）<br>
	 *
	 * @return boolean フリー入力モードなら true
	 *                 それ以外なら false
	 */
    public boolean isFree()
	{
		boolean ret = false;

		if(_input_mode == AZ0040Const.C_INPUT_FREE)
			ret = true;
		return ret;
	}

	/**
	 * 行追加の判定（ＧＵＩ）<br>
	 *
	 * @return boolean 行追加(ＧＵＩ)なら true
	 *                 それ以外なら false
	 */
    public boolean isNew()
	{
		boolean ret = false;

		if(_process_mode != null){
			if((_process_mode.equals(AZ0040Const.C_PROCESS_INS))&&
				(_input_mode == AZ0040Const.C_INPUT_GUI))
				ret = true;
		}
		return ret;
	}
}
