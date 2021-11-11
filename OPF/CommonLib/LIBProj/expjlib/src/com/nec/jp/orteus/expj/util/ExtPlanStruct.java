//------------------------------------------------------------------------------
// (#)ExtPlanStruct.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/20 新規作成 J.Higashi
//
// 2004/02/26 M.Hotokebuchi
// ・Structクラスの名称を ExtPlanExpStruct1 → ExtPlanStruct に変更
// ・Double,IntegerをStringに変更 全面的に改訂
//------------------------------------------------------------------------------
package com.nec.jp.orteus.expj.util;

/**
 * <B>ExtPlanStruct</B><BR>
 * 外部計画読込用のデータクラス<BR>
 * <BR>
 * @author  J.Higashi
 * @version 1.00
 */
public class ExtPlanStruct
{
    /**
     * 値格納用メンバ変数
     */
    public String  m_LEVEL = null;                      // 階層レベル
    public String  m_EXTERNAL_PLAN_CD = null;           // 外部計画番号
    public String  m_PLANT_CD = null;                   // 工場コード
    public String  m_EXTERNAL_PLAN_REG_TYP = null;      // 外部計画登録区分
    public String  m_EXTERNAL_PLAN_EXP_TYP = null;      // 外部計画処理区分
    public String  m_EXTERNAL_PLAN_DEL_FLG = null;      // 外部計画削除区分
    public String  m_OD_NO = null;                      // オーダデマンド番号
    public String  m_ITEM_CD = null;                    // 品目番号
    public String  m_ODR_STS_TYP = null;                // オーダ状態区分
    public String  m_DUE_DATE = null;                   // 要求納期
    public String  m_ODR_START_DATE = null;             // 手配着手日
    public String  m_PRD_DUE_DATE = null;               // 製造納期
    public String  m_PRD_START_DATE = null;             // 製造着手日
    public String  m_ODR_QTY = null;                    // オーダ数
    public String  m_MRP_ODR_TYP = null;                // 品目手配区分
    public String  m_EXTERNAL_DM_FLG = null;            // 外部デマンドフラグ
    public String  m_OD_LEVEL_NO = null;                // 所要量レベル番号
    public String  m_EXT_LEVEL_NO = null;               // 外部計画相対レベル番号

    /**
     * 要素取得関数
     */
    public String  getLEVEL() { return m_LEVEL; }                                   // 階層レベル
    public String  getEXTERNAL_PLAN_CD() { return m_EXTERNAL_PLAN_CD; }             // 外部計画番号
    public String  getPLANT_CD() { return m_PLANT_CD; }                             // 工場コード
    public String  getEXTERNAL_PLAN_REG_TYP() { return m_EXTERNAL_PLAN_REG_TYP; }   // 外部計画登録区分
    public String  getEXTERNAL_PLAN_EXP_TYP() { return m_EXTERNAL_PLAN_EXP_TYP; }   // 外部計画処理区分
    public String  getEXTERNAL_PLAN_DEL_FLG() { return m_EXTERNAL_PLAN_DEL_FLG; }   // 外部計画削除区分
    public String  getOD_NO() { return m_OD_NO; }                                   // オーダデマンド番号
    public String  getITEM_CD() { return m_ITEM_CD; }                               // 品目番号
    public String  getODR_STS_TYP() { return m_ODR_STS_TYP; }                       // オーダ状態区分
    public String  getDUE_DATE() { return m_DUE_DATE; }                             // 要求納期
    public String  getODR_START_DATE() { return m_ODR_START_DATE; }                 // 手配着手日
    public String  getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }                     // 製造納期
    public String  getPRD_START_DATE() { return m_PRD_START_DATE; }                 // 製造着手日
    public String  getODR_QTY() { return m_ODR_QTY; }                               // オーダ数
    public String  getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }                       // 品目手配区分
    public String  getEXTERNAL_DM_FLG() { return m_EXTERNAL_DM_FLG; }               // 外部デマンドフラグ
    public String  getOD_LEVEL_NO() { return m_OD_LEVEL_NO; }                       // 所要量レベル番号
    public String  getEXT_LEVEL_NO() { return m_EXT_LEVEL_NO; }                     // 外部計画相対レベル番号

    /**
     * 要素設定関数
     */
    public void setLEVEL(String  val) { m_LEVEL = val; }                                    // 階層レベル
    public void setEXTERNAL_PLAN_CD(String val) { m_EXTERNAL_PLAN_CD = val; }               // 外部計画番号
    public void setPLANT_CD(String val) { m_PLANT_CD = val; }                               // 工場コード
    public void setEXTERNAL_PLAN_REG_TYP(String  val) { m_EXTERNAL_PLAN_REG_TYP = val; }    // 外部計画登録区分
    public void setEXTERNAL_PLAN_EXP_TYP(String  val) { m_EXTERNAL_PLAN_EXP_TYP = val; }    // 外部計画処理区分
    public void setEXTERNAL_PLAN_DEL_FLG(String  val) { m_EXTERNAL_PLAN_DEL_FLG = val; }    // 外部計画削除区分
    public void setOD_NO(String val) { m_OD_NO = val; }                                     // オーダデマンド番号
    public void setITEM_CD(String val) { m_ITEM_CD = val; }                                 // 品目番号
    public void setODR_STS_TYP(String  val) { m_ODR_STS_TYP = val; }                        // オーダ状態区分
    public void setDUE_DATE(String val) { m_DUE_DATE = val; }                               // 要求納期
    public void setODR_START_DATE(String val) { m_ODR_START_DATE = val; }                   // 手配着手日
    public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }                       // 製造納期
    public void setPRD_START_DATE(String val) { m_PRD_START_DATE = val; }                   // 製造着手日
    public void setODR_QTY(String val) { m_ODR_QTY = val; }                                 // オーダ数
    public void setMRP_ODR_TYP(String  val) { m_MRP_ODR_TYP = val; }                        // 品目手配区分
    public void setEXTERNAL_DM_FLG(String  val) { m_EXTERNAL_DM_FLG = val; }                // 外部デマンドフラグ
    public void setOD_LEVEL_NO(String  val) { m_OD_LEVEL_NO = val; }                        // 所要量レベル番号
    public void setEXT_LEVEL_NO(String  val) { m_EXT_LEVEL_NO = val; }                      // 外部計画相対レベル番号

    /**
     * コンストラクタ
     *
     * @param なし
     */
    public ExtPlanStruct()
    {
        initialize();       // 初期化
        return;
    }

    /**
     * メンバ変数のクリア
     *
     * @param なし
     */
    public void clear()
    {
        m_LEVEL = null;                     // 階層レベル
        m_EXTERNAL_PLAN_CD = null;          // 外部計画番号
        m_PLANT_CD = null;                  // 工場コード
        m_EXTERNAL_PLAN_REG_TYP = null;     // 外部計画登録区分
        m_EXTERNAL_PLAN_EXP_TYP = null;     // 外部計画処理区分
        m_EXTERNAL_PLAN_DEL_FLG = null;     // 外部計画削除区分
        m_OD_NO = null;                     // オーダデマンド番号
        m_ITEM_CD = null;                   // 品目番号
        m_ODR_STS_TYP = null;               // オーダ状態区分
        m_DUE_DATE = null;                  // 要求納期
        m_ODR_START_DATE = null;            // 手配着手日
        m_PRD_DUE_DATE = null;              // 製造納期
        m_PRD_START_DATE = null;            // 製造着手日
        m_ODR_QTY = null;                   // オーダ数
        m_MRP_ODR_TYP = null;               // 品目手配区分
        m_EXTERNAL_DM_FLG = null;           // 外部デマンドフラグ
        m_OD_LEVEL_NO = null;               // 所要量レベル番号
        m_EXT_LEVEL_NO = null;              // 外部計画相対レベル番号
    }

    /**
     * インスタンス破壊時に行う処理
     *
     * @param なし
     */
    public void finalize()
    {
        clear();    // クリア
        return;
    }

    /**
     * 初期化
     */
    public void initialize()
    {
        m_LEVEL = new String("0");                  // 階層レベル
        m_EXTERNAL_PLAN_CD = null;                  // 外部計画番号
        m_PLANT_CD = null;                          // 工場コード
        m_EXTERNAL_PLAN_REG_TYP = new String("0");  // 外部計画登録区分
        m_EXTERNAL_PLAN_EXP_TYP = new String("0");  // 外部計画処理区分
        m_EXTERNAL_PLAN_DEL_FLG = new String("0");  // 外部計画削除区分
        m_OD_NO = null;                             // オーダデマンド番号
        m_ITEM_CD = null;                           // 品目番号
        m_ODR_STS_TYP = new String("0");            // オーダ状態区分
        m_DUE_DATE = null;                          // 要求納期
        m_ODR_START_DATE = null;                    // 手配着手日
        m_PRD_DUE_DATE = null;                      // 製造納期
        m_PRD_START_DATE = null;                    // 製造着手日
        m_ODR_QTY = new String("0");                // オーダ数
        m_MRP_ODR_TYP = new String("0");            // 品目手配区分
        m_EXTERNAL_DM_FLG = new String("0");        // 外部デマンドフラグ
        m_OD_LEVEL_NO = new String("0");            // 所要量レベル番号
        m_EXT_LEVEL_NO = new String("0");           // 外部計画相対レベル番号
    }

    /**
     * コピー
     */
    public void copy(ExtPlanStruct struct)
    {
        clear();        // クリア
        m_LEVEL                 = (struct.m_LEVEL                 == null) ? null : struct.getLEVEL();                  // 階層レベル
        m_EXTERNAL_PLAN_CD      = (struct.m_EXTERNAL_PLAN_CD      == null) ? null : struct.getEXTERNAL_PLAN_CD();       // 外部計画番号
        m_PLANT_CD              = (struct.m_PLANT_CD              == null) ? null : struct.getPLANT_CD();               // 工場コード
        m_EXTERNAL_PLAN_REG_TYP = (struct.m_EXTERNAL_PLAN_REG_TYP == null) ? null : struct.getEXTERNAL_PLAN_REG_TYP();  // 外部計画登録区分
        m_EXTERNAL_PLAN_EXP_TYP = (struct.m_EXTERNAL_PLAN_EXP_TYP == null) ? null : struct.getEXTERNAL_PLAN_EXP_TYP();  // 外部計画処理区分
        m_EXTERNAL_PLAN_DEL_FLG = (struct.m_EXTERNAL_PLAN_DEL_FLG == null) ? null : struct.getEXTERNAL_PLAN_DEL_FLG();  // 外部計画削除区分
        m_OD_NO                 = (struct.m_OD_NO                 == null) ? null : struct.getOD_NO();                  // オーダデマンド番号
        m_ITEM_CD               = (struct.m_ITEM_CD               == null) ? null : struct.getITEM_CD();                // 品目番号
        m_ODR_STS_TYP           = (struct.m_ODR_STS_TYP           == null) ? null : struct.getODR_STS_TYP();            // オーダ状態区分
        m_DUE_DATE              = (struct.m_DUE_DATE              == null) ? null : struct.getDUE_DATE();               // 要求納期
        m_ODR_START_DATE        = (struct.m_ODR_START_DATE        == null) ? null : struct.getODR_START_DATE();         // 手配着手日
        m_PRD_DUE_DATE          = (struct.m_PRD_DUE_DATE          == null) ? null : struct.getPRD_DUE_DATE();           // 製造納期
        m_PRD_START_DATE        = (struct.m_PRD_START_DATE        == null) ? null : struct.getPRD_START_DATE();         // 製造着手日
        m_ODR_QTY               = (struct.m_ODR_QTY               == null) ? null : struct.getODR_QTY();                // オーダ数
        m_MRP_ODR_TYP           = (struct.m_MRP_ODR_TYP           == null) ? null : struct.getMRP_ODR_TYP();            // 品目手配区分
        m_EXTERNAL_DM_FLG       = (struct.m_EXTERNAL_DM_FLG       == null) ? null : struct.getEXTERNAL_DM_FLG();        // 外部デマンドフラグ
        m_OD_LEVEL_NO           = (struct.m_OD_LEVEL_NO           == null) ? null : struct.getOD_LEVEL_NO();            // 所要量レベル番号
        m_EXT_LEVEL_NO          = (struct.m_EXT_LEVEL_NO          == null) ? null : struct.getEXT_LEVEL_NO();           // 外部計画相対レベル番号
    }

    /**
     * コピーコンストラクタ
     */
     public ExtPlanStruct(ExtPlanStruct struct)
     {
        copy(struct);
     }

    // 外部計画の検索用SQL定義
    public static final String _selectExtPlan =
        "SELECT " +
            "T0.EXTERNAL_PLAN_CD," +
            "T0.PLANT_CD," +
            "T0.EXTERNAL_PLAN_REG_TYP," +
            "T0.EXTERNAL_PLAN_EXP_TYP," +
            "T0.EXTERNAL_PLAN_DEL_FLG," +
            "T0.OD_NO," +
            "T1.ITEM_CD," +
            "T1.ODR_STS_TYP," +
            "TO_CHAR(T1.DUE_DATE, 'YYYY/MM/DD')," +
            "TO_CHAR(T1.ODR_START_DATE, 'YYYY/MM/DD')," +
            "TO_CHAR(T1.PRD_DUE_DATE, 'YYYY/MM/DD')," +
            "TO_CHAR(T1.PRD_START_DATE, 'YYYY/MM/DD')," +
            "TO_CHAR(T1.ODR_QTY, 'FM99999999999990.0999')," +
            "T1.MRP_ODR_TYP," +
            "T1.EXTERNAL_DM_FLG" +
        " FROM  T_EXTERNAL_PLAN T0, T_OD T1" +
        " WHERE  T0.PLANT_CD              = ?" +
        "   AND  T0.EXTERNAL_PLAN_REG_TYP = 1" +
        "   AND (T0.EXTERNAL_PLAN_EXP_TYP = 1" +
        "    OR  T0.EXTERNAL_PLAN_EXP_TYP = 2)" +
        "   AND  T0.OD_NO                 = T1.OD_NO" +
        "   AND  T1.OD_TYP                = 2" +
        "   AND  T1.EXTERNAL_DM_FLG       = 1";

    /* 外部計画処理区分 */
    public static final String PLAN_EXP_TYP_INSERT = new String("1");   // 1:追加
    public static final String PLAN_EXP_TYP_UPDATE = new String("2");   // 2:変更

    /* 外部計画削除フラグ */
    public static final String PLAN_DEL_FLG_OFF    = new String("0");   // 0:非
    public static final String PLAN_DEL_FLG_ON     = new String("1");   // 1:削除

    /** 外部デマンドフラグ */
    public static final String DM_FLG_INT_DEMAND   = new String("0");   // 1:内部デマンド
    public static final String DM_FLG_EXT_DEMAND   = new String("1");   // 1:外部デマンド
}
