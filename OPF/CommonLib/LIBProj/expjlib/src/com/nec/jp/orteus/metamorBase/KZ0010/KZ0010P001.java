/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KZ0010/src/com/nec/jp/orteus/metamorBase/KZ0010/KZ0010P001.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.metamorBase.KZ0010;

import com.nec.jp.orteus.metamorBase.KZ0010.*;

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
 * 売掛Ｉ／Ｆ
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.3 $ $Date: 2014/11/13 06:20:38 $
*/
public class KZ0010P001 {

    protected KZ0010P001Control control;

    /**
     * 指定のコネクションを持つオブジェクトを構築します。
     *
     * @param conn コネクションがOPENされているIDbConnection
     * @param userId ログインユーザ
     */
    public KZ0010P001(IDbConnection conn){
        try {
            control = new KZ0010P001Control();
            control.conn = conn; // コネクション設定
            //System.out.println("売掛管理I/F処理開始");
        }
        catch (Exception e) {
            //ExpjException ee = new ExpjException(e, "ZZ01106");
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
     *                         4:受領売上-登録
     *                         5:受領売上-取消
     *                         6:その他売上-登録
     *                         7:その他売上-更新
     *                         8:その他売上-削除
     *                         9:預託検収I/F
     * @param userId         呼出側利用者コード
     * @param originalSlipCd 元伝票番号
     * @param redSlipCd      赤伝票番号
     * @param blackSlipCd    黒伝票番号
     */
    public void setParameter(String mode, String userId, String originalSlipCd,
                             String redSlipCd, String blackSlipCd)
    {
        _mode = mode;
        _userId = userId;
        _originalSlipCd = originalSlipCd;
        _redSlipCd = redSlipCd;
        _blackSlipCd = blackSlipCd;

        // ユーザIDセット
        if ((userId != null) && (userId.length() > 0)) {
            control.setUserId(userId);
        }
        else {
            control.setUserId("SYSTEM");
        }

        //System.out.println("処理モード:" + _mode);
        //System.out.println("呼出側利用者コード:" + _userId);
        //System.out.println("元伝票番号:" + _originalSlipCd);
        //System.out.println("赤伝票番号:" + _redSlipCd);
        //System.out.println("黒伝票番号:" + _blackSlipCd);
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
        if ((_mode == null) || (_mode.length() != 1) ||
            ((!"1".equals(_mode)) && (!"2".equals(_mode)) &&
             (!"3".equals(_mode)) && (!"4".equals(_mode)) &&
             (!"5".equals(_mode)) && (!"6".equals(_mode)) &&
             (!"7".equals(_mode)) && (!"8".equals(_mode)) &&
             (!"9".equals(_mode)))) {
            // 処理モード未設定 or 誤設定
            //   処理なし
            //System.out.println("処理モード未設定 or 誤設定");
            return "ZZ01104";
        }

        else {
            // 処理共通情報抽出
            _messageNo = this.readCommon();
            //System.out.println("readCommon:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;

            // 処理モード別
            if ("1".equals(_mode)) {
                //System.out.println("1:出荷実績-登録 処理開始");
                // 1:出荷実績-登録
                control.setSlipCd(_blackSlipCd); // 黒伝票番号セット

                // 売掛金トラン追加
                _messageNo = this.addTrn();
                //System.out.println("addTrn:" + _messageNo);
                if (!"0".equals(_messageNo)) return _messageNo;
            }

            else if ("2".equals(_mode)) {
                //System.out.println("2:出荷実績-取消 処理開始");
                // 2:出荷実績-取消
                control.setSlipCd(_originalSlipCd); // 元伝票番号セット

                // 売掛金トランヘッダ存在チェック
                boolean recordCheck;
                recordCheck = control.isSelectArLedgerHTrn();
                //System.out.println("isSelectArLedgerHTrn:" + recordCheck);

                if (recordCheck) {
                    // 売掛金トラン削除処理 (レコード存在時)

                    // 売掛金トラン削除
                    _messageNo = this.delTrn();
                    //System.out.println("delTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }

                else {
                    // 売掛金トラン赤伝追加，売掛金元帳赤伝更新処理 (レコード未存在時)
                    control.setSlipCd2(_redSlipCd); // 赤伝票番号セット(伝票番号2)

                    // 売掛金トラン赤伝追加・更新
                    _messageNo = this.redTrn();
                    //System.out.println("redTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }
            }

            else if ("3".equals(_mode)) {
                //System.out.println("3:出荷実績-返品 処理開始");
                // 3:出荷実績-返品
                control.setSlipCd(_originalSlipCd); // 元伝票番号セット

                // 売掛金トランヘッダ存在チェック
                boolean recordCheck;
                recordCheck = control.isSelectArLedgerHTrn();
                //System.out.println("isSelectArLedgerHTrn:" + recordCheck);

                if (recordCheck) {
                    // 売掛金トラン更新処理 (レコード存在時)

                    // 売掛金トラン削除
                    _messageNo = this.delTrn();
                    //System.out.println("delTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;

                    // 売掛金トラン追加
                    _messageNo = this.addTrn();
                    //System.out.println("addTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }

                else {
                    // 売掛金トラン赤伝追加，売掛金トラン黒伝追加，
                    // 売掛金元帳赤伝更新処理 (レコード未存在時)
                    control.setSlipCd2(_redSlipCd); // 赤伝票番号セット(伝票番号2)

                    // 売掛金トラン赤伝追加・更新
                    _messageNo = this.redTrn();
                    //System.out.println("redTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;

                    control.setSlipCd(_blackSlipCd); // 黒伝票番号セット

                    // 売掛金トラン追加
                    _messageNo = this.addTrn();
                    //System.out.println("addTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }
            }

            else if ("4".equals(_mode)) {
                //System.out.println("4:受領売上-登録 処理開始");
                // 4:受領売上-登録
                control.setSlipCd(_originalSlipCd); // 元伝票番号セット

                // 売掛金トラン削除
                _messageNo = this.delTrn();
                //System.out.println("delTrn:" + _messageNo);
                if (!"0".equals(_messageNo)) return _messageNo;

                // 売掛金トラン追加
                _messageNo = this.addTrn();
                //System.out.println("addTrn:" + _messageNo);
                if (!"0".equals(_messageNo)) return _messageNo;
            }

            else if ("5".equals(_mode)) {
                //System.out.println("5:受領売上-取消 処理開始");
                // 5:受領売上-取消
                control.setSlipCd(_originalSlipCd); // 元伝票番号セット

                // 売掛金トランヘッダ存在チェック
                boolean recordCheck;
                recordCheck = control.isSelectArLedgerHTrn();
                //System.out.println("isSelectArLedgerHTrn:" + recordCheck);

                if (recordCheck) {
                    // 売掛金トラン状態区分更新処理 (レコード存在時)

                    // 売掛金トラン更新
                    _messageNo = this.upTrn();
                    //System.out.println("upTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }

                else {
                    // 売掛金トラン赤伝追加，売掛金トラン黒伝追加，
                    // 売掛金元帳赤伝更新処理 (レコード未存在時)
                    control.setSlipCd2(_redSlipCd); // 赤伝票番号セット(伝票番号2)

                    // 売掛金トラン赤伝追加・更新
                    _messageNo = this.redTrn();
                    //System.out.println("redTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;

                    control.setSlipCd2(_blackSlipCd); // 黒伝票番号セット(伝票番号2)

                    // 売掛金トラン黒伝追加
                    _messageNo = this.blackTrn();
                    //System.out.println("blackTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }
            }

            else if ("6".equals(_mode)) {
                //System.out.println("6:その他売上-登録 処理開始");
                // 6:その他売上-登録
                control.setSlipCd(_blackSlipCd); // 黒伝票番号セット

                // 売掛金トラン追加
                _messageNo = this.addTrn();
                //System.out.println("addTrn:" + _messageNo);
                if (!"0".equals(_messageNo)) return _messageNo;
            }

            else if ("7".equals(_mode)) {
                //System.out.println("7:その他売上-更新 処理開始");
                // 7:その他売上-更新
                control.setSlipCd(_originalSlipCd); // 元伝票番号セット

                // 売掛金トランヘッダ存在チェック
                boolean recordCheck;
                recordCheck = control.isSelectArLedgerHTrn();
                //System.out.println("isSelectArLedgerHTrn:" + recordCheck);

                if (recordCheck) {
                    // 売掛金トラン更新処理 (レコード存在時)

                    // 売掛金トラン削除
                    _messageNo = this.delTrn();
                    //System.out.println("delTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;

                    // 売掛金トラン追加
                    _messageNo = this.addTrn();
                    //System.out.println("addTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }

                else {
                    // 売掛金トラン赤伝追加，売掛金トラン黒伝追加，
                    // 売掛金元帳赤伝更新処理 (レコード未存在時)
                    control.setSlipCd2(_redSlipCd); // 赤伝票番号セット(伝票番号2)

                    // 売掛金トラン赤伝追加・更新
                    _messageNo = this.redTrn();
                    //System.out.println("redTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;

                    control.setSlipCd(_blackSlipCd); // 黒伝票番号セット

                    // 売掛金トラン追加
                    _messageNo = this.addTrn();
                    //System.out.println("addTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }
            }

            else if ("8".equals(_mode)) {
                //System.out.println("8:その他売上-削除 処理開始");
                // 8:その他売上-削除
                control.setSlipCd(_originalSlipCd); // 元伝票番号セット

                // 売掛金トランヘッダ存在チェック
                boolean recordCheck;
                recordCheck = control.isSelectArLedgerHTrn();
                //System.out.println("isSelectArLedgerHTrn:" + recordCheck);

                if (recordCheck) {
                    // 売掛金トラン削除処理 (レコード存在時)

                    // 売掛金トラン削除
                    _messageNo = this.delTrn();
                    //System.out.println("delTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }

                else {
                    // 売掛金トラン赤伝追加，売掛金元帳赤伝更新処理 (レコード未存在時)
                    control.setSlipCd2(_redSlipCd); // 赤伝票番号セット(伝票番号2)

                    // 売掛金トラン赤伝追加・更新
                    _messageNo = this.redTrn();
                    //System.out.println("redTrn:" + _messageNo);
                    if (!"0".equals(_messageNo)) return _messageNo;
                }
            }

            else if ("9".equals(_mode)) {
                //System.out.println("9:預託検収I/F 処理開始");
                // 9:預託検収I/F
                control.setSlipCd(_blackSlipCd); // 黒伝票番号セット

                // 売掛金トラン追加
                _messageNo = this.addTrn();
                //System.out.println("addTrn:" + _messageNo);
                if (!"0".equals(_messageNo)) return _messageNo;
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
        //System.out.println("共通処理開始");

        // 自社情報抽出
        _messageNo = control.selectMyCompany();
        //System.out.println("selectMyCompany:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 売掛システム管理マスタ抽出
        _messageNo = control.selectArCtrl();
        //System.out.println("selectArCtrl:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 区分コード抽出
        _messageNo = control.selectClassCode();
        //System.out.println("selectClassCode:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 伝票区分マスタ抽出
        _messageNo = control.selectSlipTrn();
        //System.out.println("selectSlipTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 邦貨抽出
        _messageNo = control.selectHomeCur();
        //System.out.println("selectHomeCur:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }

    /**
     * 売掛金トラン追加<BR>
     * 処理モード1:出荷実績-登録
     * 処理モード3:出荷実績-返品
     * 処理モード4:受領売上-登録
     * 処理モード6:その他売上-登録
     * 処理モード7:その他売上-更新
     * 処理モード9:預託検収I/F
     *
     * @return メッセージ番号
     *         正常終了時:"0"
     */
    private String addTrn() {
        //System.out.println("売掛金トラン追加処理開始");

        // 売上実績抽出
        _messageNo = control.selectSales();
        //System.out.println("selectSales:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 出荷実績抽出
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // 処理モード1:出荷実績-登録
            // 処理モード3:出荷実績-返品
            // 処理モード4:受領売上-登録
            // 処理モード9:預託検収I/F
            _messageNo = control.selectShip();
            //System.out.println("selectShip:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // 出荷指示抽出
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // 処理モード1:出荷実績-登録
            // 処理モード3:出荷実績-返品
            // 処理モード4:受領売上-登録
            // 処理モード9:預託検収I/F
            _messageNo = control.selectShipOdr();
            //System.out.println("selectShipOdr:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // 受注明細抽出
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode))) {
            // 処理モード1:出荷実績-登録
            // 処理モード3:出荷実績-返品
            // 処理モード4:受領売上-登録
            _messageNo = control.selectOdr();
            //System.out.println("selectOdr:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // 製品単価抽出
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // 処理モード1:出荷実績-登録
            // 処理モード3:出荷実績-返品
            // 処理モード4:受領売上-登録
            // 処理モード9:預託検収I/F
            _messageNo = control.selectUnitCost();
            //System.out.println("selectUnitCost:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // 得意先マスタ抽出
        _messageNo = control.selectCust();
        //System.out.println("selectCust:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 得意先支店マスタ抽出
        _messageNo = control.selectCustBranch();
        //System.out.println("selectCustBranch:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 請求得意先抽出
        _messageNo = control.selectClaimCustCtrl();
        //System.out.println("selectClaimCustCtrl:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 得意先納品場所抽出
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // 処理モード1:出荷実績-登録
            // 処理モード3:出荷実績-返品
            // 処理モード4:受領売上-登録
            // 処理モード9:預託検収I/F
            _messageNo = control.selectCustBase();
            //System.out.println("selectCustBase:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // 製品抽出
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // 処理モード1:出荷実績-登録
            // 処理モード3:出荷実績-返品
            // 処理モード4:受領売上-登録
            // 処理モード9:預託検収I/F
            _messageNo = control.selectItemSpec();
            //System.out.println("selectItemSpec:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // 検収情報IF抽出
        if ("9".equals(_mode)) {
            // 処理モード9:預託検収I/F
            _messageNo = control.selectInspcAcptInfoIf();
            //System.out.println("selectInspcAcptInfoIf:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // 品目抽出
        if (("1".equals(_mode)) || ("3".equals(_mode)) ||
            ("4".equals(_mode)) || ("9".equals(_mode))) {
            // 処理モード1:出荷実績-登録
            // 処理モード3:出荷実績-返品
            // 処理モード4:受領売上-登録
            // 処理モード9:預託検収I/F
            _messageNo = control.selectItem();
            //System.out.println("selectItem:" + _messageNo);
            if (!"0".equals(_messageNo)) return _messageNo;
        }

        // 消費税計算処理
        control.calculateTax(_mode);

        // 売掛金トランヘッダ作成
        _messageNo = control.insertArLedgerHTrn(_mode);
        //System.out.println("insertArLedgerHTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 売掛金トラン明細作成
        _messageNo = control.insertArLedgerTrn(_mode);
        //System.out.println("insertArLedgerTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }

    /**
     * 売掛金トラン削除<BR>
     * 処理モード2:出荷実績-取消
     * 処理モード3:出荷実績-返品
     * 処理モード4:受領売上-登録
     * 処理モード7:その他売上-更新
     * 処理モード8:その他売上-削除
     *
     * @return メッセージ番号
     *         正常終了時:"0"
     */
    private String delTrn() {
        //System.out.println("売掛金トラン削除処理開始");

        // 売掛金トランヘッダ削除
        _messageNo = control.deleteArLedgerHTrn();
        //System.out.println("deleteArLedgerHTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 売掛金トラン明細削除
        _messageNo = control.deleteArLedgerTrn();
        //System.out.println("deleteArLedgerTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }

    /**
     * 売掛金トラン赤伝追加・更新<BR>
     * 処理モード2:出荷実績-取消
     * 処理モード3:出荷実績-返品
     * 処理モード5:受領売上-取消
     * 処理モード7:その他売上-更新
     * 処理モード8:その他売上-削除
     *
     * @return メッセージ番号
     *         正常終了時:"0"
     */
    private String redTrn() {
        //System.out.println("売掛金トラン赤伝追加・更新処理開始");

        // 売掛金トラン元帳ヘッダ赤伝更新
        _messageNo = control.updateArLedgerH();
        //System.out.println("updateArLedgerH:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 売掛金トランヘッダ赤伝追加・更新
        _messageNo = control.insertIntoeArLedgerHTrn();
        //System.out.println("insertIntoeArLedgerHTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 売売掛金トラン明細赤伝追加・更新
        _messageNo = control.insertIntoeArLedgerTrn();
        //System.out.println("insertIntoeArLedgerTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }

    /**
     * 売掛金トラン更新<BR>
     * 処理モード5:受領売上-取消
     *
     * @return メッセージ番号
     *         正常終了時:"0"
     */
    private String upTrn() {
        //System.out.println("売掛金トラン削除処理開始");

        // 売掛金トランヘッダ更新
        _messageNo = control.updateArLedgerHTrn();
        //System.out.println("updateArLedgerHTrn:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }

    /**
     * 売掛金トラン黒伝追加<BR>
     * 処理モード5:受領売上-取消
     *
     * @return メッセージ番号
     *         正常終了時:"0"
     */
    private String blackTrn() {
        //System.out.println("売掛金トラン黒伝追加処理開始");

        // 売掛金トランヘッダ黒伝追加
        _messageNo = control.insertIntoeArLedgerHTrn2();
        //System.out.println("insertIntoeArLedgerHTrn2:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        // 売売掛金トラン明細黒伝追加
        _messageNo = control.insertIntoeArLedgerTrn2();
        //System.out.println("insertIntoeArLedgerTrn2:" + _messageNo);
        if (!"0".equals(_messageNo)) return _messageNo;

        return _messageNo;
    }
}
