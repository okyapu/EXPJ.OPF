/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0070/src/com/nec/jp/orteus/metamorBase/KR0070/KZ1010P001.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.metamorBase.KR0070;

import java.util.List;

import com.nec.jp.orteus.metamorBase.KR0070.*;
import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;
import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;
import com.nec.jp.orteus.util.logging.*;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.exception.*;
import com.nec.jp.orteus.expj.combobox.*;
import com.nec.jp.orteus.expj.systemlog.*;
import com.nec.jp.orteus.expj.businesslock.*;
import com.nec.jp.orteus.expj.file.*;
import com.nec.jp.orteus.expj.csv.*;

/**
 * 売掛Ｉ／Ｆ(自部品用)
 *
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/02/21 07:52:29 $
*/
public class KZ1010P001 {
	protected KZ1010P001Control control;
	/**
	 * 指定のコネクションを持つオブジェクトを構築します。
	 *
	 * @param conn コネクションがOPENされているIDbConnection
	 * @param userId ログインユーザ
	 */
	public KZ1010P001(IDbConnection conn){
		try {
			control = new KZ1010P001Control();
			control.conn = conn; // コネクション設定
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * パラメータ
	 */
	private String _mode;
	private String _userId;
	private String _originalSlipCd;
	private String _redSlipCd;
	private String _blackSlipCd;

	/**
	 * パラメータを設定します。<BR>
	 * <BR>
	 * @param mode           処理モード
	 *                         1:出荷実績-登録
	 *                         2:出荷実績-取消
	 *                         3:出荷実績-返品
	 *                         6:その他売上-登録
	 *                         7:その他売上-更新
	 *                         8:その他売上-削除
	 * @param userId         呼出側利用者コード
	 * @param originalSlipCd 元伝票番号
	 * @param redSlipCd      赤伝票番号
	 * @param blackSlipCd    黒伝票番号
	 * @param taxCd          消費税コード
	 */
	public void setParameter(String mode, String userId, String originalSlipCd, String redSlipCd, String blackSlipCd, String taxCd) {
		_mode = mode;
		_userId = userId;
		_originalSlipCd = originalSlipCd;
		_redSlipCd = redSlipCd;
		_blackSlipCd = blackSlipCd;
		System.out.println("setParameter");
		// ユーザIDセット
		if ((userId != null) && (userId.length() > 0)) {
			control.setUserId(userId);
		} else {
			control.setUserId("SYSTEM");
		}
        // 消費税コード
        control.setTaxCd(taxCd);
	}

	/**
	 * メッセージ番号
	 */
	private String _messageNo = "0";

	/**
	 * 処理を実行します。<BR>
	 *
	 * @return メッセージ番号
	 *         正常終了時:"0"
	 */
	public String execute() {
		if ((_mode == null) || (_mode.length() != 1) || ((!"1".equals(_mode)) && (!"2".equals(_mode)) && (!"3".equals(_mode)) && (!"6".equals(_mode)) && (!"7".equals(_mode)) && (!"8".equals(_mode)))) {
			// 処理モード未設定 or 誤設定
			// 処理なし
			return "ZZ01104";
		} else {
			// システム日付を取得する
			
			// 処理共通情報抽出
			_messageNo = this.readCommon();
			if (!"0".equals(_messageNo)) return _messageNo;
			
			// 処理モード別
			if ("1".equals(_mode)) {
				// 1:出荷実績-登録
				control.setSlipCd(_blackSlipCd); // 黒伝票番号セット
				// 売掛金トラン追加
				_messageNo = this.addTrn();
				if (!"0".equals(_messageNo)) return _messageNo;
			} else if ("2".equals(_mode)) {
				// 2:出荷実績-取消
				control.setSlipCd(_originalSlipCd); // 元伝票番号セット
				// 売掛金トランヘッダ存在チェック
				boolean recordCheck;
				recordCheck = control.isSelectArLedgerHTrn();
				if (recordCheck) {
					// 売掛金トラン削除処理 (レコード存在時)
					// 売掛金トラン削除
					_messageNo = this.delTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				} else {
					// 売掛金トラン赤伝追加，売掛金元帳赤伝更新処理 (レコード未存在時)
					control.setSlipCd2(_redSlipCd); // 赤伝票番号セット(伝票番号2)
					// 売掛金トラン赤伝追加・更新
					_messageNo = this.redTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				}
			} else if ("3".equals(_mode)) {
				// 3:出荷実績-返品
				control.setSlipCd(_originalSlipCd); // 元伝票番号セット
				
				// 売掛金トランヘッダ存在チェック
				boolean recordCheck;
				recordCheck = control.isSelectArLedgerHTrn();
				if (recordCheck) {
					// 売掛金トラン更新処理 (レコード存在時)
					
					// 売掛金トラン削除
					_messageNo = this.delTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
					// 売掛金トラン追加
					_messageNo = this.addTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				} else {
					// 売掛金トラン赤伝追加，売掛金トラン黒伝追加，
					// 売掛金元帳赤伝更新処理 (レコード未存在時)
					control.setSlipCd2(_redSlipCd); // 赤伝票番号セット(伝票番号2)
					// 売掛金トラン赤伝追加・更新
					_messageNo = this.redTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
					control.setSlipCd(_blackSlipCd); // 黒伝票番号セット
					// 売掛金トラン追加
					_messageNo = this.addTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				}
			} else if ("6".equals(_mode)) {
				// 6:その他売上-登録
				control.setSlipCd(_blackSlipCd); // 黒伝票番号セット
				// 売掛金トラン追加
				_messageNo = this.addTrn();
				if (!"0".equals(_messageNo)) return _messageNo;
			} else if ("7".equals(_mode)) {
				// 7:その他売上-更新
				control.setSlipCd(_originalSlipCd); // 元伝票番号セット
				// 売掛金トランヘッダ存在チェック
				boolean recordCheck;
				recordCheck = control.isSelectArLedgerHTrn();
				if (recordCheck) {
					// 売掛金トラン更新処理 (レコード存在時)
					// 売掛金トラン削除
					_messageNo = this.delTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
					// 売掛金トラン追加
					_messageNo = this.addTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				} else {
					// 売掛金トラン赤伝追加，売掛金トラン黒伝追加，
					// 売掛金元帳赤伝更新処理 (レコード未存在時)
					control.setSlipCd2(_redSlipCd); // 赤伝票番号セット(伝票番号2)
					// 売掛金トラン赤伝追加・更新
					_messageNo = this.redTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
					control.setSlipCd(_blackSlipCd); // 黒伝票番号セット
					// 売掛金トラン追加
					_messageNo = this.addTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				}
			} else if ("8".equals(_mode)) {
				// 8:その他売上-削除
				control.setSlipCd(_originalSlipCd); // 元伝票番号セット
				// 売掛金トランヘッダ存在チェック
				boolean recordCheck;
				recordCheck = control.isSelectArLedgerHTrn();
				if (recordCheck) {
					// 売掛金トラン削除処理 (レコード存在時)
					// 売掛金トラン削除
					_messageNo = this.delTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				} else {
					// 売掛金トラン赤伝追加，売掛金元帳赤伝更新処理 (レコード未存在時)
					control.setSlipCd2(_redSlipCd); // 赤伝票番号セット(伝票番号2)
					// 売掛金トラン赤伝追加・更新
					_messageNo = this.redTrn();
					if (!"0".equals(_messageNo)) return _messageNo;
				}
			}
		}
		return _messageNo; // 正常終了
	}

	/**
	 * 共通処理<BR>
	 *
	 * @return メッセージ番号
	 *         正常終了時:"0"
	 */
	private String readCommon() {
		// 自社情報抽出
		_messageNo = control.selectMyCompany();
		if (!"0".equals(_messageNo)) return _messageNo;
		// 売掛システム管理マスタ抽出
		_messageNo = control.selectArCtrl();
		if (!"0".equals(_messageNo)) return _messageNo;
		// 区分コード抽出
		_messageNo = control.selectClassCode();
		if (!"0".equals(_messageNo)) return _messageNo;
		// 伝票区分マスタ抽出
		_messageNo = control.selectSlipTrn();
		if (!"0".equals(_messageNo)) return _messageNo;
		// 邦貨抽出
		_messageNo = control.selectHomeCur();
		if (!"0".equals(_messageNo)) return _messageNo;
		return _messageNo;
	}
	
	/**
	 * 売掛金トラン追加<BR>
	 * 処理モード1:出荷実績-登録
	 * 処理モード3:出荷実績-返品
	 * 処理モード6:その他売上-登録
	 * 処理モード7:その他売上-更新
	 *
	 * @return メッセージ番号
	 *         正常終了時:"0"
	 */
	private String addTrn() {
		// 売上実績抽出
		_messageNo = control.selectSales();
		if (!"0".equals(_messageNo)) return _messageNo;
		// 出荷実績抽出
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// 処理モード1:出荷実績-登録
			// 処理モード3:出荷実績-返品
			_messageNo = control.selectShip();
			if (!"0".equals(_messageNo)) return _messageNo; 
		}
		
		// 出荷指示抽出
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// 処理モード1:出荷実績-登録
			// 処理モード3:出荷実績-返品
			_messageNo = control.selectShipOdr();
			if (!"0".equals(_messageNo)) return _messageNo;
		}
		
		// 確定受注抽出
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// 処理モード1:出荷実績-登録
			// 処理モード3:出荷実績-返品
			_messageNo = control.selectOdr();
			if (!"0".equals(_messageNo)) return _messageNo;
		}
		
		// 製品単価抽出
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// 処理モード1:出荷実績-登録
			// 処理モード3:出荷実績-返品
			_messageNo = control.selectUnitCost();
			if (!"0".equals(_messageNo)) return _messageNo;
		}
		
		// 得意先マスタ抽出
		_messageNo = control.selectCust();
		if (!"0".equals(_messageNo)) return _messageNo;
		
		// 得意先支店マスタ抽出
		_messageNo = control.selectCustBranch();
		if (!"0".equals(_messageNo)) return _messageNo;
		
		// 請求得意先抽出
		_messageNo = control.selectClaimCustCtrl();
		if (!"0".equals(_messageNo)) return _messageNo;
		
		// 納品場所抽出
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// 処理モード1:出荷実績-登録
			// 処理モード3:出荷実績-返品
			_messageNo = control.selectCustBase();
			if (!"0".equals(_messageNo)) return _messageNo;
		}
		
		// 為替レートマスタ抽出
		_messageNo = control.selectHomeCurCd();
		if (!"0".equals(_messageNo)) return _messageNo;
		
		// 品目抽出
		if (("1".equals(_mode)) || ("3".equals(_mode))) {
			// 処理モード1:出荷実績-登録
			// 処理モード3:出荷実績-返品
			_messageNo = control.selectItem();
			if (!"0".equals(_messageNo)) return _messageNo;
		}
		// 消費税計算処理
		control.calculateTax(_mode);
		// 売掛金トランヘッダ作成
		_messageNo = control.insertArLedgerHTrn(_mode);
		if (!"0".equals(_messageNo)) return _messageNo;
		// 売掛金トラン明細作成
		_messageNo = control.insertArLedgerTrn(_mode);
		if (!"0".equals(_messageNo)) return _messageNo;
		return _messageNo;
	}
	
	/**
	 * 売掛金トラン削除<BR>
	 * 処理モード2:出荷実績-取消
	 * 処理モード3:出荷実績-返品
	 * 処理モード7:その他売上-更新
	 * 処理モード8:その他売上-削除
	 *
	 * @return メッセージ番号
	 *         正常終了時:"0"
	 */
	private String delTrn() {
		// 売掛金トランヘッダ削除
		_messageNo = control.deleteArLedgerHTrn();
		if (!"0".equals(_messageNo)) return _messageNo;
		// 売掛金トラン明細削除
		_messageNo = control.deleteArLedgerTrn();
		if (!"0".equals(_messageNo)) return _messageNo;
		return _messageNo;
	}

	/**
	 * 売掛金トラン赤伝追加・更新<BR>
	 * 処理モード2:出荷実績-取消
	 * 処理モード3:出荷実績-返品
	 * 処理モード7:その他売上-更新
	 * 処理モード8:その他売上-削除
	 *
	 * @return メッセージ番号
	 *         正常終了時:"0"
	 */
	private String redTrn() {
		if(control.isSelectArLedgerH()) {
			// 売掛金元帳に伝票番号が存在する場合
			// 売掛金トラン元帳ヘッダ赤伝更新
			_messageNo = control.updateArLedgerH();
			if (!"0".equals(_messageNo)) return _messageNo;
			//赤伝票番号のセット
			control.setSlipCd2(_redSlipCd);
			// 売掛金トランヘッダ赤伝追加・更新
			_messageNo = control.insertIntoeArLedgerHTrn();
			if (!"0".equals(_messageNo)) return _messageNo;
			//売売掛金トラン明細赤伝追加・更新
			_messageNo = control.insertIntoeArLedgerTrn();
			if (!"0".equals(_messageNo)) return _messageNo;
			return _messageNo;
		}
		return "0";
	}
	
	/**
     * 販売単価取得のワーニングリストを戻る<BR>
     *
     * @return 販売単価取得のワーニングリスト
     *
     */
    public List getSalesUnitPriceWarningList() {
        return control.getSalesUnitPriceWarningList();
    }
}
