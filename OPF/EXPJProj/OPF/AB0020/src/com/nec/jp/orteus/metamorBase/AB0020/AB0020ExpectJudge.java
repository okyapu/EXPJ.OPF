//------------------------------------------------------------------------------
/**
 * CLASS     : AB0020ExpectJudge クラス
 * ファイル・クラス説明
 * @author $Author: kong-haijing $
 * @version $Revision: 1.2 $ $Date: 2007/11/02 03:49:08 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AB0020;

public class AB0020ExpectJudge
{
	//--------------------------------------------------------------------------
	// 構築
	/** コンストラクタ */
	AB0020ExpectJudge(){ clear(); }

	//--------------------------------------------------------------------------
	// 定義

	// 判定結果 ----------------------------------------------------------------
	/** YES */
	public final static int YES = 1;
	/** NO */
	public final static int NO = 0;
	/** 関係なし */
	public final static int IRRELEVANT = -1;

	// 各DB項目の定数 ----------------------------------------------------------
	// 状態区分
	private final static int STS_YET_MRP = 1;
	private final static int STS_MRP = 2;
	private final static int STS_MRP_DONE = 3;
	private final static int STS_CHILD_FIXED = 4;
	private final static int STS_OWN_FIXED = 5;
	private final static int STS_COMPLETED = 9;

	// 処理区分
	private final static int EXP_ADD = 1;
	private final static int EXP_CHANGE = 2;
	private final static int EXP_COMPLETED = 9;

	// 削除フラグ
	private final static int DEL_NO = 0;
	private final static int DEL_YES = 1;

	//--------------------------------------------------------------------------
	// 操作
	/**
	 * 判定実施<br>
	 * 指定の状態の 所要量計算対象/再計算/削除 を判定し保持する。
	 * @param stsTyp 状態区分
	 * @param expTyp 処理区分
	 * @param delFlg 削除フラグ
	 * @return true: 判定済
	 */
	public boolean expect(int stsTyp, int expTyp, int delFlg)
	{
		clear();
		// 所要量計算?
		switch(stsTyp){
			case STS_YET_MRP:
				_isCalculate = NO;  break;
			case STS_MRP:
				_isCalculate = YES; break;
		}
		// 削除?
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
		// 再計算?
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
	 * 所要量計算対象とするか ?
	 * @return 直前の判定の結果を返却。
	 * AA0020ExpectJudge.YES: 所要量計算対象/
	 * AA0020ExpectJudge.NO: 所要量計算対象外/
	 * AA0020ExpectJudge.IRRELEVANT: 判定対象外、判定未実施
	 */
	public int isCalculate(){ return _isCalculate; }
	/**
	 * 基準情報を元に再計算するか ?
	 * @return 直前の判定の結果を返却。
	 * AA0020ExpectJudge.YES: 再計算する/
	 * AA0020ExpectJudge.NO: 再計算しない/
	 * AA0020ExpectJudge.IRRELEVANT: 判定対象外、判定未実施
	 */
	public int isRecalculate(){ return _isRecalculate; }
	/**
	 * この製番を削除する?
	 * @return 直前の判定の結果を返却。
	 * AA0020ExpectJudge.YES: 削除する/
	 * AA0020ExpectJudge.NO: 削除しない/
	 * AA0020ExpectJudge.IRRELEVANT: 判定対象外、判定未実施
	 */
	public int isDelete(){ return _isDelete; }
	/**
	 * 判定結果のクリア<br>
	 * 判定結果を全て 関係なし に設定する
	 */
	public void clear()
	{
		_isCalculate = IRRELEVANT;
		_isRecalculate = IRRELEVANT;
		_isDelete = IRRELEVANT;
	}

	//--------------------------------------------------------------------------
	// 属性

	/** 所要量計算対象とする? */
	private int _isCalculate;

	/** 再計算する? */
	private int _isRecalculate;

	/** 削除する? */
	private int _isDelete;
}
