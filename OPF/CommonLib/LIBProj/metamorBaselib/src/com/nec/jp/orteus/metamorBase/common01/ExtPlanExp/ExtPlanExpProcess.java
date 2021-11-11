//------------------------------------------------------------------------------
// (#)ExtPlanExpProcess.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// History
// 2004/01/20 新規作成 J.Higashi
//
// 2004/02/23 M.Hotokebuchi
// ・オーダ数が最大手配数量よりも大きい場合、オーダ分割する処理をコメントし
//   最大手配数よりも大きくてもそのままの数でオーダを立てるよう修正
//
// 2004/02/26 M.Hotokebuchi
// ・Structクラスの名称を変更
// ・削除フラグの立っている所要量レコードを削除する処理を追加
// ・Double,IntegerをStringに変更 全面的に改訂
//
// 2004/03/02 業務運用日の取得処理を本パッケージ内のクラスを使用  K.Shiraki
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.ExtPlanExp;

//----- パッケージインポート定義 -----------------------------------------------
// JAVA 標準パッケージ
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

// ORTEUS 標準パッケージ
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;

// EXPLANNER/J 共通パッケージ
import com.nec.jp.orteus.metamorBase.common.WorkDay.WorkCalendar;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessage;

/**
 * MRPの情報を取得するクラス。
 *
 * @author J.Higashi
 * @version 1.01
 */
public class ExtPlanExpProcess
{

//----- 変数定義 ---------------------------------------------------------------
    private IDbConnection _conn;                    // DB接続
    private String        _userCd         = null;   // 利用者コード
    private String        _plantCd        = null;   // 工場コード
    private String        _strProgramName = null;   // プログラム名
    private boolean       _roundFlg       = false;  // まるめフラグ
    private Date          _oprDate        = null;   // 業務運用日
    private int           _expIndex       = 0;

    private ExtPlanStruct _extStruct;       // 外部計画参照用データクラス
    private PsStruct _psStruct;             // 展開構成参照用データクラス
    private ArrayList         _extPs;       // 展開構成格納用

//----- エラー出力用 ----------
    List      errCodeList = new ArrayList();    // エラーリスト
    Hashtable errNoteHash = new Hashtable();    // エラーノート
    //エラーノートセッター
    public void setErrNote(String note){
        errNoteHash.put(Integer.toString(errCodeList.size()-1),note);
    }

//------------------------------------------------------------------------------

    // 所要量計算制御(所要量計算中フラグ取得用)
    private String _odCalcCtrlSql =
        "SELECT TO_CHAR(OD_CALC_FLG) FROM SYS_OD_CALC_CTRL WHERE PLANT_CD = ?";

    // 所要量計算制御更新
    private String _updOdCalcCtrlSql =
        "UPDATE SYS_OD_CALC_CTRL " +
        "   SET OD_CALC_FLG    = ?" +
        "      ,UPDATED_DATE   = SYSDATE" +
        "      ,UPDATED_BY     = ?" +
        "      ,UPDATED_PRG_NM = ?" +
        "      ,MODIFY_COUNT   = MODIFY_COUNT + 1" +
        " WHERE PLANT_CD = ?";

    // 所要量計算制御更新
    private String _updExtPlanSql =
        "UPDATE T_EXTERNAL_PLAN" +
        "   SET EXTERNAL_PLAN_EXP_TYP = 9" +
        "      ,UPDATED_DATE          = SYSDATE" +
        "      ,UPDATED_BY            = ?" +
        "      ,UPDATED_PRG_NM        = ?" +
        "      ,MODIFY_COUNT          = MODIFY_COUNT + 1" +
        " WHERE EXTERNAL_PLAN_CD = ? AND OD_NO = ?";

    // 品目情報検索
    private String _selectItem =
        "SELECT * FROM M_ITEM WHERE ITEM_CD = ?";

    // 所要量情報削除
    private String _delOd =
        "DELETE FROM T_OD WHERE OD_NO IN " +
            "(SELECT OD_NO FROM T_EXTERNAL_PLAN WHERE EXTERNAL_PLAN_CD = ? AND EXTERNAL_PLAN_REG_TYP = 2)";

    // 削除フラグのついた所要量情報削除
    private String _delFlgOd =
        "DELETE FROM T_OD WHERE OD_NO IN " +
            "(SELECT OD_NO FROM T_EXTERNAL_PLAN WHERE EXTERNAL_PLAN_CD = ? AND EXTERNAL_PLAN_DEL_FLG = 1)";

    // 外部計画削除
    private String _delExtPlan =
        "DELETE FROM T_EXTERNAL_PLAN WHERE EXTERNAL_PLAN_CD = ? AND EXTERNAL_PLAN_REG_TYP = 2";


    /*------------------------------------------------------*
     * 引数なしコンストラクタ。
     *------------------------------------------------------*/
    public ExtPlanExpProcess()
    {
        initialize();
    }

    /*------------------------------------------------------*
     * 引数ありコンストラクタ。
     * @param conn           DB接続
     * @param userCd         利用者コード
     * @param plantCd        工場コード
     * @param strProgramName プログラム名
     * @param roundFlg       まるめフラグ
     *------------------------------------------------------*/
    public ExtPlanExpProcess(IDbConnection conn,
                             String userCd,
                             String plantCd,
                             String strProgramName,
                             boolean roundFlg)
    {
        initialize();
        _conn           = conn;
        _userCd         = userCd;
        _plantCd        = plantCd;
        _strProgramName = strProgramName;
        _roundFlg       = roundFlg;
    }

    /**
     * ワーク用エリアの初期化を行う。
     */
    private void initialize()
    {
        _extStruct = new ExtPlanStruct();
        _psStruct  = new PsStruct();
        _extPs     = new ArrayList();
    }

    /*------------------------------------------------------*
     * MRPの情報を構築。
     *
     * @return 正常：true  異常：false
     *------------------------------------------------------*/
    public boolean execute()
    {
        try {
            // 引数が取得できていない場合にはエラー
            if (_conn    == null || _userCd         == null ||
                _plantCd == null || _strProgramName == null) {
                return false;
            }
            initialize();       // 初期化
            if (getInitialInfo() == false)  return false;   // 初期データ取得処理

            try {
                if (extPlanLoop() == false)  return false;      // メイン処理
            }
            finally {
                if (updCalcCtrl("0") == false) return false;    // 所要量計算制御の更新(1:処理中 → 0:未処理)
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {
            errCodeList.add("AC10022");     // 外部オーダからの総所要量展開を終了しました。
            setErrNote("");
            businessMessageWrite();     // 業務ログ情報の出力
        }
        return true;
    }

    /*------------------------------------------------------*
     * 初期データ取得処理
     *
     * @return 正常：true  異常：false
     *------------------------------------------------------*/
    private boolean getInitialInfo()  throws SQLException
    {
        SimpleDateFormat strFmt = new SimpleDateFormat("yyyy/MM/dd");
        String oprDate;
        try {
            errCodeList.add("AC10021");     // 外部オーダからの総所要量展開を開始しました。
            setErrNote("(SBM0620)工場コード：[" + _plantCd + "]");

            // 所要量計算制御の確認
            if (chkCalcCtrl() == false) return false;


            // 所要量計算制御の更新(0:未処理 → 1:処理中)
            if (updCalcCtrl("1") == false) return false;

            // 業務運用日の取得
            oprDate = doRunning();
            if (oprDate == null || oprDate.equals("") == true) return false;
            _oprDate = strFmt.parse(oprDate);   // 文字列→日付変換

            _conn.commit();     // ここでいったんコミットを実行
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /*------------------------------------------------------*
     * 所要量計算制御の確認
     * @param _plantCd  工場コード
     * @return 正常：true  異常：false
     * @throws SQLException
     *         SQLの発行に失敗した場合
     *------------------------------------------------------*/
    private boolean chkCalcCtrl()
    {
        PreparedStatement stmt = null;
        ResultSet rslt  = null;
        String odCalcFlg = "";
        boolean sts = false;

        try {
            // 所要量計算中フラグ取得
            stmt = _conn.getConn().prepareStatement(_odCalcCtrlSql);
            stmt.setString(1, _plantCd);
            rslt = stmt.executeQuery();
            if (rslt.next() == true) {
                sts =true;
                odCalcFlg = rslt.getString(1);
                if (odCalcFlg.equals("1") == true) {
                    errCodeList.add("AC32162"); // 所要量計算処理が実行中のため処理が行えません。
                    setErrNote("(SBM0620)工場コード：[" + _plantCd + "]");
                    sts =false;
                }
            }
            else {
                errCodeList.add("AC50552"); // 所要量計算制御データが存在しません。
                setErrNote("(SBM0620)工場コード：[ " + _plantCd + " ]");
                sts =false;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0656)所要量計算制御の読込でエラーが発生しました。 工場コード：[ " + _plantCd + " ]");
            return false;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {
            closeResultSet(rslt);
            closePreparedStatement(stmt);
        }
        return sts;
     }

    /*------------------------------------------------------*
     * 所要量計算制御の更新
     * @param _odCalcCtrlFlg  所要量計算中フラグ
     * @return 正常：true  異常：false
     *------------------------------------------------------*/
    private boolean updCalcCtrl(String _odCalcCtrlFlg)
    {
        PreparedStatement stmt = null;
        try {
            // 所要量計算中フラグの更新
            stmt = _conn.getConn().prepareStatement(_updOdCalcCtrlSql);
            stmt.setString(1, _odCalcCtrlFlg);
            stmt.setString(2, _userCd);
            stmt.setString(3, _strProgramName);
            stmt.setString(4, _plantCd);
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0656)所要量計算制御の更新でエラーが発生しました。 工場コード：[ " + _plantCd + " ]");
            e.printStackTrace();
            return false;
        }
        finally {
            closePreparedStatement(stmt);
        }
        return true;
     }

    /*------------------------------------------------------*
     * 業務運用日を取得します。
     *
     * @return 業務運用日
     *------------------------------------------------------*/
    private String doRunning()
    {
        String oprDate  = "";
        try {
            DateCtrl dateCtrl = new DateCtrl(_conn);
            oprDate = dateCtrl.getBusinessOprDate(_conn, _plantCd);
            if (oprDate == null) {
                errCodeList.add("AC00115"); // 日付制御の読込に失敗しました。
                setErrNote("(SBM0620)工場コード：[ " + _plantCd + " ]");
            }
        }
        catch (SQLException e) {
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0657)日付制御の読込でエラーが発生しました。 工場コード：[ " + _plantCd + " ]");
            return null;
        }
        return oprDate;
     }

    /*------------------------------------------------------*
     * メインループ処理
     *
     * @return 正常：true  異常：false
     *------------------------------------------------------*/
    private boolean extPlanLoop()
    {
        PreparedStatement stmt = null;
        ResultSet rslt = null;

        try {
            // 外部計画情報検索
            stmt = _conn.getConn().prepareStatement(_extStruct._selectExtPlan);
            stmt.setString(1, _plantCd);
            rslt = stmt.executeQuery();
            int index = 1;

            while (rslt.next() == true) {

                _conn.beginTrans();     // トランザクション開始

                _extStruct.setLEVEL(new String("0"));                               // 階層レベル
                _extStruct.setEXTERNAL_PLAN_CD(rslt.getString(1));                  // 外部計画番号
                _extStruct.setPLANT_CD(rslt.getString(2));                          // 工場コード
                _extStruct.setEXTERNAL_PLAN_REG_TYP(rslt.getString(3));             // 外部計画登録区分
                _extStruct.setEXTERNAL_PLAN_EXP_TYP(rslt.getString(4));             // 外部計画処理区分
                _extStruct.setEXTERNAL_PLAN_DEL_FLG(rslt.getString(5));             // 外部計画削除フラグ
                _extStruct.setOD_NO(rslt.getString(6));                             // オーダデマンド番号
                _extStruct.setITEM_CD(rslt.getString(7));                           // 品目番号
                _extStruct.setODR_STS_TYP(rslt.getString(8));                       // オーダ状態区分
                _extStruct.setDUE_DATE(rslt.getString(9));                          // 要求納期
                _extStruct.setODR_START_DATE(rslt.getString(10));                   // 手配着手日
                _extStruct.setPRD_DUE_DATE(rslt.getString(11));                     // 製造納期
                _extStruct.setPRD_START_DATE(rslt.getString(12));                   // 製造着手日
                _extStruct.setODR_QTY(rslt.getString(13));                          // オーダ数
                _extStruct.setMRP_ODR_TYP(rslt.getString(14));                      // 品目手配区分
                _extStruct.setEXTERNAL_DM_FLG(rslt.getString(15));                  // 外部デマンドフラグ
                _extStruct.setOD_LEVEL_NO(new String("1"));                         // 所要量レベル番号
                _extStruct.setEXT_LEVEL_NO(new String("1"));                        // 外部計画相対レベル番号

                System.out.println("");
                System.out.println("(SBM0853)[" + index + "]件目 外部オーダ=====================================");
                System.out.println("        (SBM1019)階層レベル：[" + _extStruct.getLEVEL() + "]");
                System.out.println("      (SBM0847)外部計画番号：[" + _extStruct.getEXTERNAL_PLAN_CD() + "]");
                System.out.println("        (SBM0399)工場コード：[" + _extStruct.getPLANT_CD() + "]");
                System.out.println("  (SBM0849)外部計画登録区分：[" + _extStruct.getEXTERNAL_PLAN_REG_TYP() + "]");
                System.out.println("  (SBM0850)外部計画処理区分：[" + _extStruct.getEXTERNAL_PLAN_EXP_TYP() + "]");
                System.out.println("(SBM0851)外部計画削除フラグ：[" + _extStruct.getEXTERNAL_PLAN_DEL_FLG() + "]");
                System.out.println("(SBM0852)オーダデマンド番号：[" + _extStruct.getOD_NO() + "]");
                System.out.println("          (SBM0688)品目番号：[" + _extStruct.getITEM_CD() + "]");
                System.out.println("    (SBM1020)オーダ状態区分：[" + _extStruct.getODR_STS_TYP() + "]");
                System.out.println("          (SBM1021)要求納期：[" + _extStruct.getDUE_DATE() + "]");
                System.out.println("        (SBM1022)手配着手日：[" + _extStruct.getODR_START_DATE() + "]");
                System.out.println("          (SBM1023)製造納期：[" + _extStruct.getPRD_DUE_DATE() + "]");
                System.out.println("        (SBM1024)製造着手日：[" + _extStruct.getPRD_START_DATE() + "]");
                System.out.println("          (SBM1025)オーダ数：[" + _extStruct.getODR_QTY() + "]");
                System.out.println("      (SBM1026)品目手配区分：[" + _extStruct.getMRP_ODR_TYP() + "]");
                System.out.println("(SBM1027)外部デマンドフラグ：[" + _extStruct.getEXTERNAL_DM_FLG() + "]");
                System.out.println("  (SBM1028)所要量レベル番号：[" + _extStruct.getOD_LEVEL_NO() + "]");
                System.out.println("(SBM1029)外部計画相対レベル：[" + _extStruct.getEXT_LEVEL_NO() + "]");
                System.out.println("=======================================================");

                // 変更があった外部計画の場合、以前展開した外部計画・所要量を削除
                if (_extStruct.getEXTERNAL_PLAN_EXP_TYP().equals(_extStruct.PLAN_EXP_TYP_UPDATE)) {
                    if (delExtPlan() == false )  return false ;     // 外部計画・所要量削除
                }

                // 追加or更新のあった外部計画を元に構成展開を行い、オーダ・デマンドを作成
                if (((_extStruct.getEXTERNAL_PLAN_EXP_TYP().equals(_extStruct.PLAN_EXP_TYP_INSERT)) ||
                     (_extStruct.getEXTERNAL_PLAN_EXP_TYP().equals(_extStruct.PLAN_EXP_TYP_UPDATE))) &&
                     (_extStruct.getEXTERNAL_PLAN_DEL_FLG().equals(_extStruct.PLAN_DEL_FLG_OFF))) {
                    _extPs.clear();                 // これまでの構成をクリア
                    _extPs.add(0, _extStruct);      // 最上位の品目を配列にセット
                    _expIndex = 1;                  // 展開インデックスを初期化
                    if (expandExtPlan() == false) return false;     // 外部計画構成展開処理
                }

                // 外部計画処理区分を"9"(済)に更新
                if (updateExtPlan(_extStruct.getEXTERNAL_PLAN_CD(), _extStruct.getOD_NO()) == false)  return false;

                _conn.commit();     // コミット
                index++;
            }
        }
        catch (FoundationException fe) {
            // Commit処理が失敗した場合
            fe.printStackTrace();
            return false;
        }
        catch (Exception e) {
            try {
                _conn.rollback();     // ロールバック
            }
            catch (FoundationException fe) {
                fe.printStackTrace();
                return false;
            }
            e.printStackTrace();
            return false;
        }
        finally {
            try {
                _conn.rollback();     // ロールバック
            }
            catch (FoundationException fe) {
                fe.printStackTrace();
                return false;
            }
            closeResultSet(rslt);
            closePreparedStatement(stmt);
        }
        return true;
    }
    /*------------------------------------------------------*
     * 外部計画・所要量削除
     *
     * @return 正常：true  異常：false
     *------------------------------------------------------*/
    private boolean delExtPlan() {
        PreparedStatement stmt = null;

        // 所要量の削除
        try {
            stmt = _conn.getConn().prepareStatement(_delOd);
            stmt.setString(1, _extStruct.getEXTERNAL_PLAN_CD());
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0697)所要量の削除でエラーが発生しました。 外部計画番号：[ " + _extStruct.getEXTERNAL_PLAN_CD() + " ]" + e);
            return false;
        }
        finally {
            closePreparedStatement(stmt);
        }

        // 削除フラグのついた所要量の削除
        try {
            stmt = _conn.getConn().prepareStatement(_delFlgOd);
            stmt.setString(1, _extStruct.getEXTERNAL_PLAN_CD());
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0697)所要量の削除でエラーが発生しました。 外部計画番号：[ " + _extStruct.getEXTERNAL_PLAN_CD() + " ]" + e);
            return false;
        }
        finally {
            closePreparedStatement(stmt);
        }

        // 外部計画の削除
        try {
            stmt = _conn.getConn().prepareStatement(_delExtPlan);
            stmt.setString(1, _extStruct.getEXTERNAL_PLAN_CD());
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
            // 外部計画の削除に失敗しました
            errCodeList.add("AC53401"); // Oracle Error
            setErrNote("(SBM0659)外部計画の削除でエラーが発生しました。 外部計画番号：[" + _extStruct.getEXTERNAL_PLAN_CD() + "] " + e);
            return false;
        }
        finally {
            closePreparedStatement(stmt);
        }
        return true;
    }

    /*------------------------------------------------------*
     * 外部計画構成展開処理
     *
     * @return 正常：true  異常：false
     *------------------------------------------------------*/
    private boolean expandExtPlan()
    {
        PreparedStatement stmt = null;
        ResultSet rslt = null;
        Calculate calc = new Calculate();
        DateConverter dc = new DateConverter();
        Date odrStartDate = new Date();
        Date effPhaseInDate = new Date();
        Date effPhaseOutDate = new Date();
        int  expLevel = 0;
        int  ps_size;
        ExtPlanStruct   odData;     // 登録オーダ格納用ワーク

        try {
            // 外部計画オーダ構成展開
            stmt = _conn.getConn().prepareStatement(_psStruct._expandPs);
            stmt.setString(1, _extStruct.getITEM_CD());
            rslt = stmt.executeQuery();
            int index = 1;

            while (rslt.next() == true) {

                _psStruct.setLEVEL(new Integer(rslt.getInt(1)));                    // 構成レベル
                _psStruct.setPARENT_ITEM_CD(rslt.getString(2));                     // 親品目番号
                _psStruct.setCOMP_ITEM_CD(rslt.getString(3));                       // 子品目番号
                _psStruct.setPS_EDITION(rslt.getString(4));                         // 構成版数
                _psStruct.setPS_UNIT_DENOMINATOR(rslt.getString(5));                // 構成単位数分母
                _psStruct.setPS_UNIT_NUMERATOR(rslt.getString(6));                  // 構成単位数分子
                _psStruct.setEFF_PHASE_IN_DATE(rslt.getString(7));                  // 構成有効開始日
                _psStruct.setEFF_PHASE_OUT_DATE(rslt.getString(8));                 // 構成有効終了日
                _psStruct.setPS_SPOIL(rslt.getString(9));                           // 構成仕損率
                _psStruct.setCONS_TYP(rslt.getString(10));                          // 支給区分
                _psStruct.setPS_LT_FLG(rslt.getString(11));                         // 構成LT使用フラグ
                _psStruct.setPS_FIXED_LT(rslt.getString(12));                       // 構成固定分LT
                _psStruct.setPS_PROP_LT(rslt.getString(13));                        // 構成比例分LT
                _psStruct.setPS_PROP_LOT_SIZE(rslt.getString(14));                  // 構成比例分LS
                _psStruct.setPS_REF_NO(rslt.getString(15));                         // 構成照会キー
                _psStruct.setCOST_UP_TYP(rslt.getString(16));                       // 原価積上区分
                _psStruct.setMRP_EXP_TYP(rslt.getString(17));                       // 所要量展開区分

                System.out.println(" (SBM1030)[" + index + "]レベル 構成-------------------------------------");
                System.out.print("    (SBM1031)構成レベル：[" + _psStruct.getLEVEL() + "];");
                System.out.print(" (SBM1032)親品目番号：[" + _psStruct.getPARENT_ITEM_CD() + "];");
                System.out.print(" (SBM1033)子品目番号：[" + _psStruct.getCOMP_ITEM_CD() + "];");
                System.out.print(" (SBM1034)構成版数：[" + _psStruct.getPS_EDITION() + "];");
                System.out.print(" (SBM1035)構成単位数分母：[" + _psStruct.getPS_UNIT_DENOMINATOR() + "];");
                System.out.print(" (SBM1036)構成単位数分子：[" + _psStruct.getPS_UNIT_NUMERATOR() + "];");
                System.out.print(" (SBM1037)構成有効開始日：[" + _psStruct.getEFF_PHASE_IN_DATE() + "];");
                System.out.print(" (SBM1038)構成有効終了日：[" + _psStruct.getEFF_PHASE_OUT_DATE() + "];");
                System.out.print(" (SBM1039)構成仕損率：[" + _psStruct.getPS_SPOIL() + "];");
                System.out.print(" (SBM1040)支給区分：[" + _psStruct.getCONS_TYP() + "];");
                System.out.print(" (SBM1041)構成LT使用フラグ：[" + _psStruct.getPS_LT_FLG() + "];");
                System.out.print(" (SBM1042)構成固定分LT：[" + _psStruct.getPS_FIXED_LT() + "];");
                System.out.print(" (SBM1043)構成比例分LT：[" + _psStruct.getPS_PROP_LT() + "];");
                System.out.print(" (SBM1044)構成比例分LS：[" + _psStruct.getPS_PROP_LOT_SIZE() + "];");
                System.out.print(" (SBM1045)構成照会キー：[" + _psStruct.getPS_REF_NO() + "];");
                System.out.print(" (SBM1046)原価積上区分：[" + _psStruct.getCOST_UP_TYP() + "];");
                System.out.println(" (SBM1047)所要量展開区分：[" + _psStruct.getMRP_EXP_TYP() + "]");
                System.out.println(" -------------------------------------------------------");

                // 同レベルか上位の構成が検索されてきたので不要な情報を削除
                if (expLevel >= _psStruct.getLEVEL().intValue()) {
                    expLevel = _psStruct.getLEVEL().intValue();
                    ps_size = _extPs.size();
                    for (int i=ps_size-1;i>=0;i--) {
                        odData = (ExtPlanStruct)_extPs.get(i);
                        if (calc.compare(odData.getLEVEL(), _psStruct.getLEVEL().toString()) >= 0) {
                            _extPs.remove(i);
                        }
                    }
                    _extPs.trimToSize();
                }

                // 下位デマンド/オーダ情報登録
                ps_size = _extPs.size();
                for (int i=0;i<ps_size;i++) {
                    odData = (ExtPlanStruct)_extPs.get(i);
                    if (odData.getLEVEL().equals(calc.subtract(_psStruct.getLEVEL().toString(), "1"))) {
                        // 手配着手日が構成の有効期間内の場合、下位デマンド・オーダを作成
                        odrStartDate = dc.str2date(odData.getODR_START_DATE());
                        effPhaseInDate = dc.str2date(_psStruct.getEFF_PHASE_IN_DATE());
                        effPhaseOutDate = dc.str2date(_psStruct.getEFF_PHASE_OUT_DATE());

                        if ((odrStartDate.compareTo(effPhaseInDate)  >= 0) &&
                            (odrStartDate.compareTo(effPhaseOutDate) <= 0)) {
                            expLevel++;
                            if (createOd(odData, _psStruct) == false)  return false ;  // オーダ・デマンド生成
                        }
                    }
                }
                index++;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {
            closeResultSet(rslt);
            closePreparedStatement(stmt);
        }

        return true;
    }

    /*------------------------------------------------------*
     * オーダ・デマンド生成処理
     * @param odData    外部計画情報
     * @param psData    構成情報
     * @return 正常：true  異常：false
     *------------------------------------------------------*/
    private boolean createOd(ExtPlanStruct odData, PsStruct psData)
        throws SQLException {
        PreparedStatement stItem   = null;    // 品目検索用
        ResultSet         rsItem   = null;    // 品目検索用
        Statement         stOd     = null;    // 所要量追加用
        int               rsRows   = 0;
        String            sql      = null;    // 所要量追加用SQL文格納用
        SimpleDateFormat  dtFmt    = new SimpleDateFormat();
        DateConverter     dc       = new DateConverter();
        Calculate         calc     = new Calculate();
        int               extLevel = 0;

        try {
            dtFmt.applyPattern("yyyy/MM/dd");   // 日付→文字変換のフォーマット設定

            // 子品目の情報を検索
            stItem = _conn.getConn().prepareStatement(_selectItem);
            stItem.setString(1, psData.getCOMP_ITEM_CD());
            rsItem = stItem.executeQuery();
            if ( rsItem.next() ) {
                String itemSpoil   = rsItem.getString("ITEM_SPOIL");         // 品目仕損率
                String odrLt       = rsItem.getString("ODR_LT");             // 手配リードタイム
                String issueLt     = rsItem.getString("ISSUE_LT");           // 払出リードタイム
                String fixedLt     = rsItem.getString("FIXED_LT");           // 固定分リードタイム
                String propLotSize = rsItem.getString("PROP_LOT_SIZE");      // 比例分ロットサイズ
                String propLt      = rsItem.getString("PROP_LT");            // 比例分リードタイム
                String safetyLt    = rsItem.getString("SAFETY_LT");          // 安全日数
                String mrpOdrTyp   = rsItem.getString("MRP_ODR_TYP");        // 品目手配区分
                String odrStsTyp   = ( mrpOdrTyp.equals("8") ) ? "1" : "0";  // オーダ状態区分(1:計画/0:オーダでない)
                String odTyp       = ( mrpOdrTyp.equals("8") ) ? "4" : "3";  // オーダデマンド区分(4:疑似/3:デマンド)
                String propQty     = "0";                                    // 比例分ロット数
                String lt          = "0";                                    // 比例分リードタイム日数
                String mulOdrQty   = rsItem.getString("MUL_ODR_QTY");        // まるめ単位
                String outSideTyp  = rsItem.getString("OUTSIDE_TYP");
                String issueTyp    = rsItem.getString("ISSUE_TYP");

                extLevel = new Integer(odData.getEXT_LEVEL_NO()).intValue();

                // 構成単位数の計算
                String psDenominator = psData.getPS_UNIT_DENOMINATOR();           // 構成単位数分母
                String psNumerator   = psData.getPS_UNIT_NUMERATOR();             // 構成単位数分子
                String psUnitQty = ( psDenominator.equals("0.0") )                // 構成単位数
                                     ? psDenominator 
                                       : calc.divide(psNumerator, psDenominator, 4, calc._FLOOR);

                // デマンド数量の計算
                String parentOdrQty = odData.getODR_QTY();                                              // 親のオーダ数
                String psSpoil      = ( mrpOdrTyp.equals("8") ) ? "0.0" : psData.getPS_SPOIL();         // 構成仕損率
                String dmQty        =  calc.multiply( parentOdrQty, calc.multiply( psUnitQty, 
                                       ( calc.add("1", calc.divide( psSpoil, "100", 6, calc._FLOOR)))));// デマンド数
                String odrQty       = "0.0";                                                            // オーダ数

                // 在庫数量単位区分(0:整数/1:小数)による丸め
                String unitQtyTyp = rsItem.getString("UNIT_QTY_TYP");
                psUnitQty      = changeQtyUp(psUnitQty, unitQtyTyp);
                dmQty          = changeQtyUp(dmQty, unitQtyTyp);

                // リードタイムの計算
                String psLtFlg       = psData.getPS_FIXED_LT();            // 製品構成リードタイム使用フラグ
                String psFixedLt     = psData.getPS_FIXED_LT();            // 固定分リードタイム
                String psPropLotSize = psData.getPS_PROP_LOT_SIZE();       // 製品構成比例分ロットサイズ
                String psPropLt      = psData.getPS_PROP_LT();             // 製品構成比例分リードタイム
                Date   cDueDate      = new Date();                         // 要求納期
                Date   cPrdDueDate   = new Date();                         // 製造納期
                Date   cPrdStartDate = new Date();                         // 製造着手日
                Date   cOdrStartDate = new Date();                         // 手配着手日

                if ( psLtFlg.equals("0") ) {
                    cDueDate = dc.str2date(odData.getODR_START_DATE());       // 親の手配着手日と同じ
                }
                else {
                    // 親の製造納期 - 構成リードタイムで計算
                    if ( psPropLotSize.equals("0")) {
                        errCodeList.add("AC50417"); // 製品構成比例分ロットサイズが未入力です
                        setErrNote("(SBM0684)親品目番号：[" + psData.getPARENT_ITEM_CD() + "] " +
                                   "子品目番号：[" + psData.getCOMP_ITEM_CD()   + "] " +
                                   "構成版数：["   + psData.getPS_EDITION()     + "]");
                        return false;
                    }
                    // 製品構成比例分数量 = オーダ数(親)/製品構成比例分ロットサイズ (整数に切り上げ)
                    String psPropQty = calc.divide(parentOdrQty, psPropLotSize, 0, calc._CEIL);
                    if ( psPropQty.equals("0") ) psPropQty = "1";        // 製品構成比例分数量=0 の場合、=1とする
                    // 構成リードタイム=製品構成固定リードタイム + 製品構成比例リードタイム*製品構成比例分数量(整数に切り上げ)
                    String psLt = calc.ceil( calc.add( psFixedLt, calc.multiply( psPropLt, psPropQty)), 0);
                    // 稼働日シフト (上位オーダの製造納期から過去にシフト)
                    cPrdDueDate = dc.str2date(odData.getPRD_DUE_DATE());
                    cDueDate = this.shiftDate(psLt, cPrdDueDate);
               }

                String newOdNo = this.getNewNumber(Numbering.ODNO);     // オーダデマンド番号採番
                if (newOdNo == null) {
                    errCodeList.add("AC53401"); // Oracle Error
                    setErrNote("(SBM0685)オーダデマンド番号の採番に失敗しました。");
                    return false;
                }

                if(cDueDate == null){
                    errCodeList.add("AC50502"); // カレンダ明細データが存在しません。
                    setErrNote("(SBM0686)オーダデマンド番号：[" + newOdNo + "] " +
                               "要求納期 に 業務運用日[" + dc.date2str(_oprDate) + "]を再設定しました。");
                    cDueDate = _oprDate;
                }

                // 要求納期が業務運用日より過去日付の場合には、業務運用日を要求納期にセット
                if (cDueDate.compareTo(_oprDate) < 0) {
                    errCodeList.add("AC50774"); // 日付が業務運用日より過去です。
                    setErrNote("(SBM0687)オーダデマンド番号：[" + newOdNo + "] " +
                               "要求納期[" + dtFmt.format(cDueDate) + "]に" +
                               "業務運用日[" + dtFmt.format(_oprDate) + "]を再設定しました。");
                    cDueDate = _oprDate;
                }
                cPrdDueDate = cDueDate;

                // SQL発行用に変換
                String sDueDate      = "{d '" + new java.sql.Date(cDueDate.getTime()) + "'}";    // 要求納期
                String sPrdDueDate   = "{d '" + new java.sql.Date(cPrdDueDate.getTime()) + "'}"; // 製造納期
                String sOdrStartDate = "null";                                                  // 手配着手日
                String sPrdStartDate = "null";                                                  // 製造着手日

                if ( mrpOdrTyp.equals("8") ) {
                    // オーダ数 = デマンド数量 * ( 1 + ( 所要量品目仕損率 / 100 )
                    odrQty = calc.multiply(dmQty, ( calc.add("1", calc.divide( itemSpoil, "100", 6, calc._FLOOR))));
                    odrQty = changeQtyUp(odrQty, unitQtyTyp);   // 丸め処理

                    // 製造納期 = 要求納期 - 払出リードタイム (稼働日チェック)
                    cPrdDueDate = this.shiftDate(issueLt, cDueDate);
                    if(cPrdDueDate == null){
                        errCodeList.add("AC50502"); // カレンダ明細データが存在しません。
                        setErrNote("(SBM0589)オーダデマンド番号：[" + newOdNo + "] " +
                                   "製造納期 に 業務運用日[" + dc.date2str(_oprDate) + "]を再設定しました。");
                        cPrdDueDate = _oprDate;
                    }
                    // 製造納期が業務運用日より過去日付の場合には、業務運用日を製造納期にセット
                    if (cPrdDueDate.compareTo(_oprDate) < 0) {
                        errCodeList.add("AC50774"); // 日付が業務運用日より過去です。
                        setErrNote("(SBM0692)オーダデマンド番号：[" + newOdNo + "] " +
                                   "製造納期[" + dtFmt.format(cPrdDueDate) + "]に" +
                                   "業務運用日[" + dtFmt.format(_oprDate) + "]を再設定しました。");
                        cPrdDueDate = _oprDate;
                    }

                    // 製造着手日 = 製造納期 - 品目リードタイム
                    if ( propLotSize.equals("0")) {
                        errCodeList.add("AC50416"); // 比例分ロットサイズが未入力です
                        setErrNote("(SBM0688)品目番号：[" + psData.getCOMP_ITEM_CD() + "]");
                        return false;
                    }
                    propQty = calc.divide(odrQty, propLotSize, 0, calc._CEIL);
                    if ( propQty.equals("0") ) propQty = "1";                    // 比例分数量=0 の場合、=1とする

                    // 品目リードタイム = 固定リードタイム + ( 比例リードタイム * 分数量) + 安全日数 (整数に切り上げ)
                    lt = calc.ceil( calc.add(calc.add( fixedLt, calc.multiply( propLt, propQty)), safetyLt), 0);

                    cPrdStartDate = this.shiftDate(lt, cPrdDueDate);
                    if(cPrdStartDate == null){
                        errCodeList.add("AC50502"); // カレンダ明細データが存在しません。
                        setErrNote("(SBM0693)オーダデマンド番号：[" + newOdNo + "] " +
                                   "製造着手日 に 業務運用日[" + dc.date2str(_oprDate) + "]を再設定しました。");
                        cPrdStartDate = _oprDate;
                    }
                    // 製造着手日が業務運用日より過去日付の場合には、業務運用日を製造着手日にセット
                    if (cPrdStartDate.compareTo(_oprDate) < 0) {
                        errCodeList.add("AC50774"); // 日付が業務運用日より過去です。
                        setErrNote("(SBM0694)オーダデマンド番号：[" + newOdNo + "] " +
                                   "製造着手日[" + dtFmt.format(cPrdStartDate) + "]に" +
                                   "業務運用日[" + dtFmt.format(_oprDate) + "]を再設定しました。");
                        cPrdStartDate = _oprDate;
                    }

                    cOdrStartDate = this.shiftDate(odrLt, cPrdStartDate);
                    if(cOdrStartDate == null){
                        errCodeList.add("AC50502"); // カレンダ明細データが存在しません。
                        setErrNote("(SBM0689)オーダデマンド番号：[" + newOdNo + "] " +
                                   "手配着手日 に 業務運用日[" + dc.date2str(_oprDate) + "]を再設定しました。");
                        cOdrStartDate = _oprDate;
                    }
                    // 手配着手日が業務運用日より過去日付の場合には、業務運用日を手配着手日にセット
                    if (cOdrStartDate.compareTo(_oprDate) < 0) {
                        errCodeList.add("AC50774"); // 日付が業務運用日より過去です。
                        setErrNote("(SBM0690)オーダデマンド番号：[" + newOdNo + "] " +
                                   "手配着手日[" + dtFmt.format(cOdrStartDate) + "]に" +
                                   "業務運用日[" + dtFmt.format(_oprDate) + "]を再設定しました。");
                        cOdrStartDate = _oprDate;
                    }

                    sPrdDueDate = "{d '" + new java.sql.Date(cPrdDueDate.getTime()) + "'}";
                    sOdrStartDate = "{d '" + new java.sql.Date(cOdrStartDate.getTime()) + "'}";
                    sPrdStartDate = "{d '" + new java.sql.Date(cPrdStartDate.getTime()) + "'}";
                }

                // デマンドorオーダデマンド情報登録
                sql = "INSERT INTO T_OD ( "
                    + " OD_NO"                          // オーダデマンド番号
                    + ",ALC_GRP_CD"                     // 引当グループコード
                    + ",PLANT_CD"                       // 工場コード
                    + ",ITEM_CD"                        // 品目番号
                    + ",PS_EDITION"                     // 所要量品目構成版数
                    + ",JOB_ODR_CD"                     // 製番
                    + ",JOB_ODR_DETAIL_NO"              // 製番枝番
                    + ",JOB_ODR_CANCEL_NO"              // 製番取消発生番号
                    + ",ODR_STS_TYP"                    // オーダ状態区分
                    + ",DM_STS_TYP"                     // デマンド状態区分
                    + ",OD_TYP"                         // オーダデマンド区分
                    + ",DUE_DATE"                       // 要求納期
                    + ",ODR_START_DATE"                 // 手配着手日
                    + ",PRD_DUE_DATE"                   // 製造納期
                    + ",PRD_START_DATE"                 // 製造着手日
                    + ",DM_QTY"                         // デマンド数
                    + ",ODR_QTY"                        // オーダ数
                    + ",MRP_ODR_TYP"                    // 品目手配区分
                    + ",OUTSIDE_TYP"                    // 所要量内外作区分
                    + ",ISSUE_TYP"                      // 所要量出庫区分
                    + ",ODR_LT"                         // 手配リードタイム
                    + ",FIXED_LT"                       // 固定分リードタイム
                    + ",PROP_LT"                        // 比例分リードタイム
                    + ",SAFETY_LT"                      // 安全日数
                    + ",ISSUE_LT"                       // 払出リードタイム
                    + ",PROP_LOT_SIZE"                  // 比例分ロットサイズ
                    + ",PS_LT_FLG"                      // 製品構成リードタイム使用フラグ
                    + ",PS_FIXED_LT"                    // 製品構成固定分リードタイム
                    + ",PS_PROP_LT"                     // 製品構成比例分リードタイム
                    + ",PS_PROP_LOT_SIZE"               // 製品構成比例分ロットサイズ
                    + ",PS_UNIT_QTY"                    // 製品構成単位数
                    + ",PS_UNIT_NUMERATOR"              // 製品構成単位数分子
                    + ",PS_UNIT_DENOMINATOR"            // 製品構成単位数分母
                    + ",TOTAL_RCV_QTY"                  // 入庫累計数
                    + ",RCV_CMPLT_DATE"                 // 入庫完了日
                    + ",TOTAL_ISSUE_INST_QTY"           // 出庫指示累計数
                    + ",TOTAL_ISSUE_QTY"                // 出庫累計数
                    + ",ISSUE_CMPLT_DATE"               // 出庫完了日
                    + ",OD_GNR_TYP"                     // 所要量発生処理区分
                    + ",OD_LEVEL_NO"                    // 所要量レベル番号
                    + ",PARENT_OD_NO"                   // 親オーダデマンド番号
                    + ",ITEM_SPOIL"                     // 所要量品目仕損率
                    + ",PS_SPOIL"                       // 所要量構成仕損率
                    + ",CONS_TYP"                       // 構成支給区分
                    + ",EFF_PHASE_IN_DATE"              // 所要量有効開始日
                    + ",EFF_PHASE_OUT_DATE"             // 所要量有効終了日
                    + ",MRP_TYP"                        // 所要量処理区分
                    + ",EXTERNAL_DM_FLG"                // 外部デマンドフラグ
                    + ",ODR_RELEASE_FLG"                // オーダ発効済フラグ
                    + ",CREATED_BY"                     // 作成者
                    + ",CREATED_PRG_NM"                 // 作成プログラム名
                    + ",UPDATED_BY"                     // 更新者
                    + ",UPDATED_PRG_NM"                 // 更新プログラム名
                    + ",MODIFY_COUNT"                   // 更新数
                    + ") values ("
                    + "'" + newOdNo + "'"                             // オーダデマンド番号
                    + ",null"                                         // 引当グループコード
                    + ",'" + _plantCd + "'"                           // 工場コード
                    + ",'" + psData.getCOMP_ITEM_CD() + "'"           // 品目番号
                    + ",'" + psData.getPS_EDITION() + "'"             // 所要量品目構成版数
                    + ",null"                                         // 製番
                    + ",0"                                            // 製番枝番
                    + ",0"                                            // 製番取消発生番号
                    + "," + odrStsTyp                                 // オーダ状態区分
                    + ",1"                                            // デマンド状態区分
                    + "," + odTyp                                     // オーダデマンド区分
                    + "," + sDueDate                                  // 要求納期
                    + "," + sOdrStartDate                             // 手配着手日
                    + "," + sPrdDueDate                               // 製造納期
                    + "," + sPrdStartDate                             // 製造着手日
                    + "," + dmQty                                     // デマンド数
                    + "," + odrQty                                    // オーダ数
                    + "," + mrpOdrTyp                                 // 品目手配区分
                    + "," + outSideTyp                                // 所要量内外作区分
                    + "," + issueTyp                                  // 所要量出庫区分
                    + "," + odrLt                                     // 手配リードタイム
                    + "," + fixedLt                                   // 固定分リードタイム
                    + "," + propLt                                    // 比例分リードタイム
                    + "," + safetyLt                                  // 安全日数
                    + "," + issueLt                                   // 払出リードタイム
                    + "," + propLotSize                               // 比例分ロットサイズ
                    + "," + psLtFlg                                   // 製品構成リードタイム使用フラグ
                    + "," + psFixedLt                                 // 製品構成固定分リードタイム
                    + "," + psPropLt                                  // 製品構成比例分リードタイム
                    + "," + psPropLotSize                             // 製品構成比例分ロットサイズ
                    + "," + psUnitQty                                 // 製品構成単位数
                    + "," + psNumerator                               // 製品構成単位数分子
                    + "," + psDenominator                             // 製品構成単位数分母
                    + ",0"                                            // 入庫累計数
                    + ",null"                                         // 入庫完了日
                    + ",0"                                            // 出庫指示累計数
                    + ",0"                                            // 出庫累計数
                    + ",null"                                         // 出庫完了日
                    + ",9"                                            // 所要量発生処理区分
                    + "," + calc.add(odData.getOD_LEVEL_NO(), "1")    // 所要量レベル番号
                    + ",'" + odData.getOD_NO() + "'"                  // 親オーダデマンド番号
                    + "," + itemSpoil                                 // 所要量品目仕損率
                    + "," + psSpoil                                   // 所要量構成仕損率
                    + "," + psData.getCONS_TYP()                      // 構成支給区分
                    + ",{d '" + psData.getEFF_PHASE_IN_DATE() + "'}"  // 所要量有効開始日
                    + ",{d '" + psData.getEFF_PHASE_OUT_DATE() + "'}" // 所要量有効終了日
                    + ",9"                                            // 所要量処理区分
                    + ",1"                                            // 外部デマンドフラグ
                    + ",0"                                            // オーダ発効済フラグ
                    + ",'" + _userCd + "'"                            // 作成者
                    + ",'" + _strProgramName + "'"                    // 作成プログラム名
                    + ",'" + _userCd + "'"                            // 更新者
                    + ",'" + _strProgramName + "'"                    // 更新プログラム名
                    + ",0"                                            // 更新数
                    + ")";

                    System.out.println("     (SBM1048)▲デマンド登録 ----------------------------------------------");
                    System.out.print("       (SBM0852)オーダデマンド番号：[" + newOdNo + "];");
                    System.out.print(" (SBM0688)品目番号：[" + psData.getCOMP_ITEM_CD() + "];");
                    System.out.print(" (SBM1020)オーダ状態区分：[" + odrStsTyp + "];");
                    System.out.print(" (SBM1052)デマンド状態区分：[" + "1" + "];");
                    System.out.print(" (SBM1053)オーダデマンド区分：[" + odTyp + "];");
                    System.out.print(" (SBM1021)要求納期：[" + sDueDate + "];");
                    System.out.print(" (SBM1022)手配着手日：[" + sOdrStartDate + "];");
                    System.out.print(" (SBM1023)製造納期：[" + sPrdDueDate + "];");
                    System.out.print(" (SBM1024)製造着手日：[" + sPrdStartDate + "];");
                    System.out.print(" (SBM1058)デマンド数：[" + dmQty + "];");
                    System.out.print(" (SBM1025)オーダ数：[" + odrQty + "];");
                    System.out.print(" (SBM1026)品目手配区分：[" + mrpOdrTyp + "];");
                    System.out.print(" (SBM1061)所要量内外作区分：[" + outSideTyp + "];");
                    System.out.print(" (SBM1062)手配LT：[" + odrLt + "];");
                    System.out.print(" (SBM1063)固定分LT：[" + fixedLt + "];");
                    System.out.print(" (SBM1064)比例分LT：[" + propLt + "];");
                    System.out.print(" (SBM1065)安全日数：[" + safetyLt + "];");
                    System.out.print(" (SBM1066)払出LT：[" + issueLt + "];");
                    System.out.print(" (SBM1067)比例分LS：[" + propLotSize + "];");
                    System.out.print(" (SBM1068)所要量処理区分：[" + "9" + "];");
                    System.out.println(" (SBM1069)外部デマンドフラグ：[" + "1" + "];");

                try {
                    stOd = _conn.getConn().createStatement();
                    rsRows = stOd.executeUpdate(sql);

                    // 外部計画情報登録(デマンドorオーダデマンド分)
                    if (insertExtPlan(odData.getEXTERNAL_PLAN_CD(), newOdNo, extLevel + 1) == false)   return false;
                }
                catch (SQLException edm) {
                    errCodeList.add("AC53401"); // Oracle Error
                    setErrNote("(SBM0691)デマンド情報の登録でエラーが発生しました。 品目番号：[" + psData.getCOMP_ITEM_CD() +
                               "] デマンド数：[" + dmQty + "] " + edm);
                    return false;
                }
                finally {
                    closeStatement(stOd);
                }

                if ( mrpOdrTyp.equals("8") ) {
                    // オーダリストに登録
                    ExtPlanStruct odList = new ExtPlanStruct();
                    odList.setLEVEL(calc.add(odData.getLEVEL(), "1"));               // 階層レベル
                    odList.setEXTERNAL_PLAN_CD(odData.getEXTERNAL_PLAN_CD());        // 外部計画番号
                    odList.setPLANT_CD(_plantCd);                                    // 工場コード
                    odList.setEXTERNAL_PLAN_REG_TYP("2");                            // 外部計画登録区分
                    odList.setEXTERNAL_PLAN_EXP_TYP("9");                            // 外部計画処理区分
                    odList.setEXTERNAL_PLAN_DEL_FLG("0");                            // 外部計画削除フラグ
                    odList.setOD_NO(newOdNo);                                        // オーダデマンド番号
                    odList.setITEM_CD(psData.getCOMP_ITEM_CD());                     // 品目番号
                    odList.setODR_STS_TYP("1");                                      // オーダ状態区分
                    odList.setDUE_DATE(dc.date2str(cDueDate));                       // 要求納期
                    odList.setODR_START_DATE(dc.date2str(cOdrStartDate));            // 手配着手日
                    odList.setPRD_DUE_DATE(dc.date2str(cPrdDueDate));                // 製造納期
                    odList.setPRD_START_DATE(dc.date2str(cPrdStartDate));            // 製造着手日
                    odList.setODR_QTY(odrQty);                                       // オーダ数
                    odList.setMRP_ODR_TYP(mrpOdrTyp);                                // 品目手配区分
                    odList.setEXTERNAL_DM_FLG("1");                                  // 外部デマンドフラグ
                    odList.setOD_LEVEL_NO(calc.add(odData.getOD_LEVEL_NO(), "1"));   // 所要量レベル番号
                    odList.setEXT_LEVEL_NO("" + (extLevel + 1));                     // 外部計画相対レベル番号
                    _extPs.add(odList); // オーダ情報をリストに追加
                }

                // ロット手配品目or定量発注品目の場合、オーダ情報の登録
                if ((mrpOdrTyp.equals("5")) || (mrpOdrTyp.equals("6"))){
                    try {
                        // オーダ数 = デマンド数量 * ( 1 + ( 所要量品目仕損率 / 100 )
                        String ttlOdrQty = calc.multiply(dmQty, ( calc.add("1", calc.divide(itemSpoil, "100", 6, calc._FLOOR ))));
                        String maxOdrQty = rsItem.getString("MAX_ODR_QTY");     // 最大手配数量
                        String minOdrQty = rsItem.getString("MIN_ODR_QTY");     // 最小手配数量
                        String fixOdrQty = rsItem.getString("FIXED_ODR_QTY");   // 定量発注数

                        stOd = _conn.getConn().createStatement();

                        do {
                            // オーダ数の計算
                            if (mrpOdrTyp.equals("5")) {       // ロット手配品目の場合
                                if (calc.compare(ttlOdrQty, maxOdrQty) >= 0) {
                                    // 最大手配数以上の場合には、最大手配数をオーダ数とする(複数オーダへの分割)
                                    // odrQty = maxOdrQty;

                                    // 2004-02-23 M.Hotokebuchi
                                    // 手配数をオーダ数とする(最大手配数量は考慮しない)
                                    odrQty = ttlOdrQty;
                                }
                                else {
                                    // 最小手配数以下の場合には、最小手配数をオーダ数とする
                                    if (calc.compare(ttlOdrQty, minOdrQty) <= 0) {
                                        odrQty = minOdrQty;
                                    }
                                    else {
                                        // 在庫数単位区分(整数/小数)によるオーダまるめ
                                        odrQty =  changeQtyUp(ttlOdrQty, unitQtyTyp) ;
                                        // まるめ単位によるオーダまるめ
                                        if (_roundFlg == true) {
                                            if (mulOdrQty.equals("0")) mulOdrQty = "1";
                                            String unit = calc.divide(calc.subtract(odrQty, minOdrQty), mulOdrQty, 0, calc._CEIL);
                                            if (odrQty.equals(calc.add(calc.multiply(unit, mulOdrQty), minOdrQty)) == false)
                                               calc.add(unit, "1");
                                            odrQty = calc.add(calc.multiply(unit, mulOdrQty), minOdrQty);
                                        }
                                    }
                                }
                            }
                            else {  // 定量発注品目の場合、定量発注数をセット
                                odrQty =   fixOdrQty ;
                            }
                            ttlOdrQty = calc.subtract(ttlOdrQty, odrQty);

                            newOdNo = this.getNewNumber(Numbering.ODNO);        // オーダデマンド番号採番
                            if (newOdNo == null) {
                                errCodeList.add("AC53401"); // Oracle Error
                                setErrNote("(SBM0685)オーダデマンド番号の採番に失敗しました。");
                                return false;
                            }

                            // 製造納期 = 要求納期 - 払出リードタイム (稼働日チェック)
                            cPrdDueDate = this.shiftDate(issueLt, cDueDate);
                            if(cPrdDueDate == null){
                                errCodeList.add("AC50502"); // カレンダ明細データが存在しません。
                                setErrNote("(SBM0589)オーダデマンド番号：[" + newOdNo + "] " +
                                           "製造納期 に 業務運用日[" + dc.date2str(_oprDate) + "]を再設定しました。");
                                cPrdDueDate = _oprDate;
                            }
                            // 製造納期が業務運用日より過去日付の場合には、業務運用日を製造納期にセット
                            if (cPrdDueDate.compareTo(_oprDate) < 0) {
                                errCodeList.add("AC50774"); // 日付が業務運用日より過去です。
                                setErrNote("(SBM0692)オーダデマンド番号：[" + newOdNo + "] " +
                                           "製造納期[" + dtFmt.format(cPrdDueDate) + "]に" +
                                           "業務運用日[" + dtFmt.format(_oprDate) + "]を再設定しました。");
                                cPrdDueDate = _oprDate;
                            }

                            // 製造着手日 = 製造納期 - 品目リードタイム
                            if ( propLotSize.equals("0")) {
                                errCodeList.add("AC50416"); // 比例分ロットサイズが未入力です
                                setErrNote("(SBM0688)品目番号：[" + psData.getCOMP_ITEM_CD() + "]");
                                return false;
                            }
                            propQty = calc.divide( odrQty, propLotSize, 0, calc._CEIL );

                            // 比例分数量=0 の場合、=1とする
                            if ( propQty.equals("0") ) propQty = "1";

                            // 品目リードタイム = 固定リードタイム + ( 比例リードタイム * 分数量) + 安全日数 (整数に切り上げ)
                            lt = calc.ceil( calc.add(calc.add(fixedLt, calc.multiply( propLt, propQty )), safetyLt), 0);

                            cPrdStartDate = this.shiftDate(lt, cPrdDueDate);
                            if(cPrdStartDate == null){
                                errCodeList.add("AC50502"); // カレンダ明細データが存在しません。
                                setErrNote("(SBM0693)オーダデマンド番号：[" + newOdNo + "] " +
                                           "製造着手日 に 業務運用日[" + dc.date2str(_oprDate) + "]を再設定しました。");
                                cPrdStartDate = _oprDate;
                            }
                            // 製造着手日が業務運用日より過去日付の場合には、業務運用日を製造着手日にセット
                            if (cPrdStartDate.compareTo(_oprDate) < 0) {
                                errCodeList.add("AC50774"); // 日付が業務運用日より過去です。
                                setErrNote("(SBM0694)オーダデマンド番号：[" + newOdNo + "] " +
                                           "製造着手日[" + dtFmt.format(cPrdStartDate) + "]に" +
                                           "業務運用日[" + dtFmt.format(_oprDate) + "]を再設定しました。");
                                cPrdStartDate = _oprDate;
                            }

                            // 手配着手日 = 製造着手日 - 手配リードタイム
                            cOdrStartDate = this.shiftDate(odrLt, cPrdStartDate);
                            if(cOdrStartDate == null){
                                errCodeList.add("AC50502"); // カレンダ明細データが存在しません。
                                setErrNote("(SBM0689)オーダデマンド番号：[" + newOdNo + "] " +
                                           "手配着手日 に 業務運用日[" + dc.date2str(_oprDate) + "]を再設定しました。");
                                cOdrStartDate = _oprDate;
                            }
                            // 手配着手日が業務運用日より過去日付の場合には、業務運用日を手配着手日にセット
                            if (cOdrStartDate.compareTo(_oprDate) < 0) {
                                errCodeList.add("AC50774"); // 日付が業務運用日より過去です。
                                setErrNote("(SBM0690)オーダデマンド番号：[" + newOdNo + "] " +
                                           "手配着手日[" + dtFmt.format(cOdrStartDate) + "]に" +
                                           "業務運用日[" + dtFmt.format(_oprDate) + "]を再設定しました。");
                                cOdrStartDate = _oprDate;
                            }

                            sDueDate      = "{d '" + new java.sql.Date(cDueDate.getTime()) + "'}";       // 要求納期
                            sPrdDueDate   = "{d '" + new java.sql.Date(cPrdDueDate.getTime()) + "'}";    // 製造納期
                            sOdrStartDate = "{d '" + new java.sql.Date(cPrdStartDate.getTime()) + "'}";  // 手配着手日
                            sPrdStartDate = "{d '" + new java.sql.Date(cOdrStartDate.getTime()) + "'}";  // 製造着手日

                            // オーダ情報登録
                            sql = "INSERT INTO T_OD ( "
                                + " OD_NO"                          // オーダデマンド番号
                                + ",ALC_GRP_CD"                     // 引当グループコード
                                + ",PLANT_CD"                       // 工場コード
                                + ",ITEM_CD"                        // 品目番号
                                + ",PS_EDITION"                     // 所要量品目構成版数
                                + ",JOB_ODR_CD"                     // 製番
                                + ",JOB_ODR_DETAIL_NO"              // 製番枝番
                                + ",JOB_ODR_CANCEL_NO"              // 製番取消発生番号
                                + ",ODR_STS_TYP"                    // オーダ状態区分
                                + ",DM_STS_TYP"                     // デマンド状態区分
                                + ",OD_TYP"                         // オーダデマンド区分
                                + ",DUE_DATE"                       // 要求納期
                                + ",ODR_START_DATE"                 // 手配着手日
                                + ",PRD_DUE_DATE"                   // 製造納期
                                + ",PRD_START_DATE"                 // 製造着手日
                                + ",DM_QTY"                         // デマンド数
                                + ",ODR_QTY"                        // オーダ数
                                + ",MRP_ODR_TYP"                    // 品目手配区分
                                + ",OUTSIDE_TYP"                    // 所要量内外作区分
                                + ",ISSUE_TYP"                      // 所要量出庫区分
                                + ",ODR_LT"                         // 手配リードタイム
                                + ",FIXED_LT"                       // 固定分リードタイム
                                + ",PROP_LT"                        // 比例分リードタイム
                                + ",SAFETY_LT"                      // 安全日数
                                + ",ISSUE_LT"                       // 払出リードタイム
                                + ",PROP_LOT_SIZE"                  // 比例分ロットサイズ
                                + ",PS_LT_FLG"                      // 製品構成リードタイム使用フラグ
                                + ",PS_FIXED_LT"                    // 製品構成固定分リードタイム
                                + ",PS_PROP_LT"                     // 製品構成比例分リードタイム
                                + ",PS_PROP_LOT_SIZE"               // 製品構成比例分ロットサイズ
                                + ",PS_UNIT_QTY"                    // 製品構成単位数
                                + ",PS_UNIT_NUMERATOR"              // 製品構成単位数分子
                                + ",PS_UNIT_DENOMINATOR"            // 製品構成単位数分母
                                + ",TOTAL_RCV_QTY"                  // 入庫累計数
                                + ",RCV_CMPLT_DATE"                 // 入庫完了日
                                + ",TOTAL_ISSUE_INST_QTY"           // 出庫指示累計数
                                + ",TOTAL_ISSUE_QTY"                // 出庫累計数
                                + ",ISSUE_CMPLT_DATE"               // 出庫完了日
                                + ",OD_GNR_TYP"                     // 所要量発生処理区分
                                + ",OD_LEVEL_NO"                    // 所要量レベル番号
                                + ",PARENT_OD_NO"                   // 親オーダデマンド番号
                                + ",ITEM_SPOIL"                     // 所要量品目仕損率
                                + ",PS_SPOIL"                       // 所要量構成仕損率
                                + ",CONS_TYP"                       // 構成支給区分
                                + ",EFF_PHASE_IN_DATE"              // 所要量有効開始日
                                + ",EFF_PHASE_OUT_DATE"             // 所要量有効終了日
                                + ",MRP_TYP"                        // 所要量処理区分
                                + ",EXTERNAL_DM_FLG"                // 外部デマンドフラグ
                                + ",ODR_RELEASE_FLG"                // オーダ発効済フラグ
                                + ",CREATED_BY"                     // 作成者
                                + ",CREATED_PRG_NM"                 // 作成プログラム名
                                + ",UPDATED_BY"                     // 更新者
                                + ",UPDATED_PRG_NM"                 // 更新プログラム名
                                + ",MODIFY_COUNT"                   // 更新数
                                + ") values ("
                                + "'" + newOdNo + "'"                             // オーダデマンド番号
                                + ",null"                                         // 引当グループコード
                                + ",'" + _plantCd + "'"                           // 工場コード
                                + ",'" + psData.getCOMP_ITEM_CD() + "'"           // 品目番号
                                + ",null"                                         // 所要量品目構成版数
                                + ",null"                                         // 製番
                                + ",0"                                            // 製番枝番
                                + ",0"                                            // 製番取消発生番号
                                + ",1"                                            // オーダ状態区分
                                + ",0"                                            // デマンド状態区分
                                + ",2"                                            // オーダデマンド区分
                                + ",null"                                         // 要求納期
                                + "," + sOdrStartDate                             // 手配着手日
                                + "," + sPrdDueDate                               // 製造納期
                                + "," + sPrdStartDate                             // 製造着手日
                                + ",0"                                            // デマンド数
                                + "," + odrQty                                    // オーダ数
                                + "," + mrpOdrTyp                                 // 品目手配区分
                                + "," + outSideTyp                                // 所要量内外作区分
                                + "," + issueTyp                                  // 所要量出庫区分
                                + "," + odrLt                                     // 手配リードタイム
                                + "," + fixedLt                                   // 固定分リードタイム
                                + "," + propLt                                    // 比例分リードタイム
                                + "," + safetyLt                                  // 安全日数
                                + "," + issueLt                                   // 払出リードタイム
                                + "," + propLotSize                               // 比例分ロットサイズ
                                + ",0"                                            // 製品構成リードタイム使用フラグ
                                + ",0"                                            // 製品構成固定分リードタイム
                                + ",0"                                            // 製品構成比例分リードタイム
                                + ",0"                                            // 製品構成比例分ロットサイズ
                                + ",0"                                            // 製品構成単位数
                                + ",0"                                            // 製品構成単位数分子
                                + ",1"                                            // 製品構成単位数分母
                                + ",0"                                            // 入庫累計数
                                + ",null"                                         // 入庫完了日
                                + ",0"                                            // 出庫指示累計数
                                + ",0"                                            // 出庫累計数
                                + ",null"                                         // 出庫完了日
                                + ",9"                                            // 所要量発生処理区分
                                + ",1"                                            // 所要量レベル番号
                                + ",null"                                         // 親オーダデマンド番号
                                + "," + itemSpoil                                 // 所要量品目仕損率
                                + ",0"                                            // 所要量構成仕損率
                                + ",0"                                            // 構成支給区分
                                + ",null"                                         // 所要量有効開始日
                                + ",null"                                         // 所要量有効終了日
                                + ",9"                                            // 所要量処理区分
                                + ",1"                                            // 外部デマンドフラグ
                                + ",0"                                            // オーダ発効済フラグ
                                + ",'" + _userCd + "'"                            // 作成者
                                + ",'" + _strProgramName + "'"                    // 作成プログラム名
                                + ",'" + _userCd + "'"                            // 更新者
                                + ",'" + _strProgramName + "'"                    // 更新プログラム名
                                + ",0"                                            // 更新数
                                + ")";

                            System.out.println("     (SBM1070)●オーダ登録 ----------------------------------------------");
                            System.out.print("       (SBM0852)オーダデマンド番号：[" + newOdNo + "];");
                            System.out.print(" (SBM0688)品目番号：[" + psData.getCOMP_ITEM_CD() + "];");
                            System.out.print(" (SBM1071)オーダ状態区分：[" + "1" + "];");
                            System.out.print(" (SBM1072)デマンド状態区分：[" + "0" + "];");
                            System.out.print(" (SBM1073)オーダデマンド区分：[" + "2" + "];");
                            System.out.print(" (SBM1074)要求納期：[" + "null" + "];");
                            System.out.print(" (SBM1022)手配着手日：[" + sOdrStartDate + "];");
                            System.out.print(" (SBM1023)製造納期：[" + sPrdDueDate + "];");
                            System.out.print(" (SBM1024)製造着手日：[" + sPrdStartDate + "];");
                            System.out.print(" (SBM1075)デマンド数：[" + "0" + "];");
                            System.out.print(" (SBM1025)オーダ数：[" + odrQty + "];");
                            System.out.print(" (SBM1026)品目手配区分：[" + mrpOdrTyp + "];");
                            System.out.print(" (SBM1061)所要量内外作区分：[" + outSideTyp + "];");
                            System.out.print(" (SBM1062)手配LT：[" + odrLt + "];");
                            System.out.print(" (SBM1063)固定分LT：[" + fixedLt + "];");
                            System.out.print(" (SBM1064)比例分LT：[" + propLt + "];");
                            System.out.print(" (SBM1065)安全日数：[" + safetyLt + "];");
                            System.out.print(" (SBM1066)払出LT：[" + issueLt + "];");
                            System.out.print(" (SBM1067)比例分LS：[" + propLotSize + "];");
                            System.out.print(" (SBM1068)所要量処理区分：[" + "9" + "];");
                            System.out.println(" (SBM1069)外部デマンドフラグ：[" + "1" + "];");

                            rsRows = stOd.executeUpdate(sql);
                            // 外部計画登録(オーダ分)
                            if (insertExtPlan(odData.getEXTERNAL_PLAN_CD(), newOdNo, extLevel + 1) == false)   return false;

                            // オーダリストに登録
                            ExtPlanStruct odList = new ExtPlanStruct();
                            odList.setLEVEL(calc.add(odData.getLEVEL(), "1"));              // 階層レベル
                            odList.setEXTERNAL_PLAN_CD(odData.getEXTERNAL_PLAN_CD());        // 外部計画番号
                            odList.setPLANT_CD(_plantCd);                                    // 工場コード
                            odList.setEXTERNAL_PLAN_REG_TYP("2");                            // 外部計画登録区分
                            odList.setEXTERNAL_PLAN_EXP_TYP("9");                            // 外部計画処理区分
                            odList.setEXTERNAL_PLAN_DEL_FLG("0");                            // 外部計画削除フラグ
                            odList.setOD_NO(newOdNo);                                        // オーダデマンド番号
                            odList.setITEM_CD(psData.getCOMP_ITEM_CD());                     // 品目番号
                            odList.setODR_STS_TYP("1");                                      // オーダ状態区分
                            odList.setDUE_DATE(dc.date2str(cDueDate));                       // 要求納期
                            odList.setODR_START_DATE(dc.date2str(cOdrStartDate));            // 手配着手日
                            odList.setPRD_DUE_DATE(dc.date2str(cPrdDueDate));                // 製造納期
                            odList.setPRD_START_DATE(dc.date2str(cPrdStartDate));            // 製造着手日
                            odList.setODR_QTY(odrQty);                                       // オーダ数
                            odList.setMRP_ODR_TYP(mrpOdrTyp);                                // 品目手配区分
                            odList.setEXTERNAL_DM_FLG("1");                                  // 外部デマンドフラグ
                            odList.setOD_LEVEL_NO("1");                                      // 所要量レベル番号
                            odList.setEXT_LEVEL_NO("" + (extLevel + 1));                     // 外部計画相対レベル番号
                            _extPs.add(odList); // オーダ情報をリストに追加

                        } while(calc.compare(ttlOdrQty, "0") > 0); // オーダ数がゼロ以下になるまでオーダ登録処理を実施
                    }
                    catch (SQLException e) {
                        e.printStackTrace();
                        errCodeList.add("AC53401"); // Oracle Error
                        setErrNote("(SBM0695)オーダ情報の登録でエラーが発生しました。 品目番号：[" + psData.getCOMP_ITEM_CD() +
                                   "] オーダ数：[" + dmQty + "]  " + e);
                        return false;
                    }
                    finally {
                        closeStatement(stOd);
                    }
                }

                rsItem.close();
            } else {
                // 50509 品目データが存在しません
                errCodeList.add("AC50509"); // 品目データが存在しません
                setErrNote("(SBM0688)品目番号：[" + psData.getCOMP_ITEM_CD() + "]");
                return false;
            }
        }
        finally {
            closeResultSet(rsItem);
            closePreparedStatement(stItem);
        }
        return true;
    }

    /*------------------------------------------------------*
     * 外部計画情報の登録
     * @param extPlanCd 外部計画番号
     * @param odNo      オーダデマンド番号
     * @return 正常：true  異常：false
     *------------------------------------------------------*/
    private boolean insertExtPlan(String extPlanCd, String odNo, int extLevel) {
        PreparedStatement stmt = null;
        //Statement stExtPlan = null;
        try {
            // 外部計画登録用SQL文生成
            String sql = "INSERT INTO T_EXTERNAL_PLAN ( "
                + " EXTERNAL_PLAN_CD"               // 外部計画番号
                + ",OD_NO"                          // オーダデマンド番号
                + ",PLANT_CD"                       // 工場コード
                + ",EXTERNAL_PLAN_REG_TYP"          // 外部計画登録区分
                + ",EXTERNAL_PLAN_EXP_TYP"          // 外部計画処理区分
                + ",EXTERNAL_PLAN_DEL_FLG"          // 外部計画削除区分
                + ",EXTERNAL_EXP_INDEX"             // 外部計画展開インデックス
                + ",EXTERNAL_LEVEL_NO"              // 相対レベル番号
                + ",CREATED_DATE"                   // 作成日
                + ",CREATED_BY"                     // 作成者
                + ",CREATED_PRG_NM"                 // 作成プログラム名
                + ",UPDATED_DATE"                   // 更新日
                + ",UPDATED_BY"                     // 更新者
                + ",UPDATED_PRG_NM"                 // 更新プログラム名
                + ",MODIFY_COUNT"                   // 更新数
                + ") values ( ?, ?, ?, 2, 9, 0, ?, ?, SYSDATE, ?, ?, SYSDATE, ?, ?, 0) ";
            stmt = _conn.getConn().prepareStatement(sql);
            stmt.setString(1, extPlanCd);
            stmt.setString(2, odNo);
            stmt.setString(3, _plantCd);
            stmt.setInt(4, ++_expIndex);
            stmt.setInt(5, extLevel);
            stmt.setString(6, _userCd);
            stmt.setString(7, _strProgramName);
            stmt.setString(8, _userCd);
            stmt.setString(9, _strProgramName);
            stmt.executeUpdate();
        
        }
        catch (SQLException ex) {
            errCodeList.add("AC53401"); // Oracle Error
            String ErrMsg = "(SBM0696)外部計画の登録でエラーが発生しました。 " +
                            "外部計画番号：[ " + extPlanCd + " ] " +
                            "オーダデマンド番号：[ " + odNo + " ] ";
            setErrNote(ErrMsg);
            ex.printStackTrace();
            return false;
        }
        finally {
            closePreparedStatement(stmt);
            }
        return true;
    }

    /*------------------------------------------------------*
     * 外部計画情報の更新
     * @param extPlanCd 外部計画番号
     * @return 正常：true  異常：false
     *------------------------------------------------------*/
    private boolean updateExtPlan(String extPlanCd, String odNo) {
        PreparedStatement stmt = null;
        try {
            stmt = _conn.getConn().prepareStatement(_updExtPlanSql);
            stmt.setString(1, _userCd);
            stmt.setString(2, _strProgramName);
            stmt.setString(3, extPlanCd);
            stmt.setString(4, odNo);
            stmt.executeUpdate();
        }
        catch (SQLException e) {
            errCodeList.add("AC53401"); // Oracle Error
            String ErrMsg = "(SBM0696)外部計画の更新でエラーが発生しました。 " +
                            "外部計画番号：[ " + extPlanCd + " ] " +
                            "オーダデマンド番号：[ " + odNo + " ] ";
            setErrNote(ErrMsg);
            e.printStackTrace();
            return false;
        }
        finally {
            closePreparedStatement(stmt);
        }
        return true;
    }

    /**
     * 各種番号採番
     * @return 新しく採番した番号
     */
    private String getNewNumber(int collectKey) {
        String newNumber = "";
        try{
            Numbering cn = new Numbering( _conn, collectKey, _userCd, _strProgramName, _plantCd );
            newNumber = cn.getNo();
            cn = null;
        } catch (FoundationException ex) {
            return null;
        }
        return newNumber;
    }

//---------- 以下、共通ファンクション ----------------------------------------
    /**
     * 数量まるめ（切上げ型）
     * 引数で渡された数量、在庫数量単位区分をもとに数量まるめを行う。
     *  1.整数管理で、引数＝小数値の場合、小数値を切上げて整数に変換する
     *  2.小数管理で、引数の小数第5位≠0の場合、小数第5位を切上げる
     *  3.小数管理で、引数の小数第5位＝0の場合、小数第5位以下を切り捨てる
     *
     * @param qty 数量
     * @param unitQtyTyp 在庫数量単位区分番号
     * @return 数量まるめ結果
     */
    private String changeQtyUp(String qty, String unitQtyTyp){
        String  result = "0";
        Calculate calc = new Calculate();

        // 在庫数量単位区分＝整数管理
        if ( unitQtyTyp.equals("1") ) {
            result = calc.ceil( qty, 0);
        }
        //在庫数量単位区分＝小数管理
        if ( unitQtyTyp.equals("2") ) {
            result = calc.ceil( qty, 4);
        }
        return result;
     }

    /**
     * 日付シフト処理
     * @param difference シフト日数
     * @param startDate 基準日
     * @return シフトした日付
     */
    private Date shiftDate(String difference, Date startDate)
    {
        Date shiftDate = new Date();
        Calculate calc = new Calculate();
        int  diff = new Integer(calc.formatInteger(difference)).intValue();

        try{
            WorkCalendar workDay = new WorkCalendar( _conn, _userCd, _strProgramName,
                                           _plantCd, startDate, -diff, false );
            shiftDate = workDay.calcDate();
            workDay = null;
        }
        catch (FoundationException ex) {
            return null;
        }
        return shiftDate;
    }

    /**
     * PreparedStatementを閉じる。
     *
     * @param statement 閉じる対象のstatment
     */
    private void closePreparedStatement(PreparedStatement statement)
    {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {}
        }
    }

    /**
     * Statementを閉じる。
     *
     * @param statement 閉じる対象のstatment
     */
    private void closeStatement(Statement statement)
    {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {}
        }
    }

    /**
     * ResultSetを閉じる。
     *
     * @param resultset 閉じる対象のresultset
     */
    private void closeResultSet(ResultSet resultset)
    {
        if (resultset != null) {
            try {
                resultset.close();
            }
            catch (SQLException e){}
        }
    }

    /**
     * 業務メッセージ登録処理
     *
     * @return  true:成功 / false:失敗
     */
    private boolean businessMessageWrite()
    {
        boolean bResult = true;
        try
        {
            // metamorBase業務メッセージ
            BusinessMessageAccessor businessMsgAcc = null;
            BusinessMessage businessMsg = null;     // metamorBase業務メッセージ

            // 業務メッセージの準備
            businessMsgAcc = new BusinessMessageAccessor();
            businessMsg = new BusinessMessage();
            businessMsgAcc.init(_conn);
            businessMsg.setBusinessOperatingName(_strProgramName);
            businessMsg.setUser(_userCd);
            businessMsg.setPlantCode(_plantCd);

            // 業務メッセージの登録
            String errCode;
            String errNote;
            for(int i = 0; i < errCodeList.size(); i++)
            {
                errCode = (String)errCodeList.get(i);
                errNote = (String)errNoteHash.get(Integer.toString(i));
                try{
                    Numbering numbering = new Numbering(_conn, Numbering.LOG_CD, _userCd, _strProgramName, _plantCd);
                    businessMsg.setLogCode(numbering.getNo());
                    businessMsg.setMessageCode(errCode);
                    businessMsg.setData(errNote);
                    businessMsgAcc.add(businessMsg);
                }
                catch (FoundationException ex) {
                    ex.printStackTrace();
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            bResult = false;
        }
        return bResult;
    }
}
