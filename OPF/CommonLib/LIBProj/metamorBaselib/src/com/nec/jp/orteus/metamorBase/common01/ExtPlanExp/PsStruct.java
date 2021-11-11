//------------------------------------------------------------------------------
// (#)PsStruct.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/20 新規作成 J.Higashi
//
// 2004/02/26 M.Hotokebuchi
// ・Structクラスの名称を ExtPlanExpStruct2 → PsStruct に変更
// ・Double,IntegerをStringに変更 全面的に改訂
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.ExtPlanExp;

/**
 * <B>PsStruct</B><BR>
 * 構成展開読込用のデータクラス<BR>
 * <BR>
 * @author  J.Higashi
 * @version 1.00
 */
public class PsStruct
{
    /**
     * 値格納用メンバ変数
     */
    public Integer m_LEVEL = null;                  // 階層レベル
    public String  m_PARENT_ITEM_CD = null;         // 親品目番号
    public String  m_COMP_ITEM_CD = null;           // 子品目番号
    public String  m_PS_EDITION = null;             // 製品構成版数
    public String  m_PS_UNIT_DENOMINATOR = null;    // 製品構成単位数分母
    public String  m_PS_UNIT_NUMERATOR = null;      // 製品構成単位数分子
    public String  m_EFF_PHASE_IN_DATE = null;      // 製品構成有効開始日
    public String  m_EFF_PHASE_OUT_DATE = null;     // 製品構成有効終了日
    public String  m_PS_SPOIL = null;               // 構成仕損率
    public String  m_CONS_TYP = null;               // 支給区分
    public String  m_PS_LT_FLG = null;              // 製品構成LT使用フラグ
    public String  m_PS_FIXED_LT = null;            // 製品構成固定分LT
    public String  m_PS_PROP_LT = null;             // 製品構成比例分LT
    public String  m_PS_PROP_LOT_SIZE = null;       // 製品構成比例分LS
    public String  m_PS_REF_NO = null;              // 製品構成照会キー
    public String  m_COST_UP_TYP = null;            // 原価積上区分
    public String  m_MRP_EXP_TYP = null;            // 所要量展開区分

    /**
     * 要素取得関数
     */
    public Integer getLEVEL() { return m_LEVEL; }                               // 階層レベル
    public String  getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }             // 親品目番号
    public String  getCOMP_ITEM_CD() { return m_COMP_ITEM_CD; }                 // 子品目番号
    public String  getPS_EDITION() { return m_PS_EDITION; }                     // 製品構成版数
    public String  getPS_UNIT_DENOMINATOR() { return m_PS_UNIT_DENOMINATOR; }   // 製品構成単位数分母
    public String  getPS_UNIT_NUMERATOR() { return m_PS_UNIT_NUMERATOR; }       // 製品構成単位数分子
    public String  getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }       // 製品構成有効開始日
    public String  getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }     // 製品構成有効終了日
    public String  getPS_SPOIL() { return m_PS_SPOIL; }                         // 構成仕損率
    public String  getCONS_TYP() { return m_CONS_TYP; }                         // 支給区分
    public String  getPS_LT_FLG() { return m_PS_LT_FLG; }                       // 製品構成LT使用フラグ
    public String  getPS_FIXED_LT() { return m_PS_FIXED_LT; }                   // 製品構成固定分LT
    public String  getPS_PROP_LT() { return m_PS_PROP_LT; }                     // 製品構成比例分LT
    public String  getPS_PROP_LOT_SIZE() { return m_PS_PROP_LOT_SIZE; }         // 製品構成比例分LS
    public String  getPS_REF_NO() { return m_PS_REF_NO; }                       // 製品構成照会キー
    public String  getCOST_UP_TYP() { return m_COST_UP_TYP; }                   // 原価積上区分
    public String  getMRP_EXP_TYP() { return m_MRP_EXP_TYP; }                   // 所要量展開区分

    /**
     * 要素設定関数
     */
    public void setLEVEL(Integer val) { m_LEVEL = val; }                            // 階層レベル
    public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }           // 親品目番号
    public void setCOMP_ITEM_CD(String val) { m_COMP_ITEM_CD = val; }               // 子品目番号
    public void setPS_EDITION(String val) { m_PS_EDITION = val; }                   // 製品構成版数
    public void setPS_UNIT_DENOMINATOR(String val) { m_PS_UNIT_DENOMINATOR = val; } // 製品構成単位数分母
    public void setPS_UNIT_NUMERATOR(String val) { m_PS_UNIT_NUMERATOR = val; }     // 製品構成単位数分子
    public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }     // 製品構成有効開始日
    public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }   // 製品構成有効終了日
    public void setPS_SPOIL(String val) { m_PS_SPOIL = val; }                       // 構成仕損率
    public void setCONS_TYP(String  val) { m_CONS_TYP = val; }                      // 支給区分
    public void setPS_LT_FLG(String  val) { m_PS_LT_FLG = val; }                    // 製品構成LT使用フラグ
    public void setPS_FIXED_LT(String  val) { m_PS_FIXED_LT = val; }                // 製品構成固定分LT
    public void setPS_PROP_LT(String  val) { m_PS_PROP_LT = val; }                  // 製品構成比例分LT
    public void setPS_PROP_LOT_SIZE(String val) { m_PS_PROP_LOT_SIZE = val; }       // 製品構成比例分LS
    public void setPS_REF_NO(String  val) { m_PS_REF_NO = val; }                    // 製品構成照会キー
    public void setCOST_UP_TYP(String  val) { m_COST_UP_TYP = val; }                // 原価積上区分
    public void setMRP_EXP_TYP(String  val) { m_MRP_EXP_TYP = val; }                // 所要量展開区分

    /**
     * コンストラクタ
     *
     * @param なし
     */
    public PsStruct()
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
        m_LEVEL = null;                 // 階層レベル
        m_PARENT_ITEM_CD = null;        // 親品目番号
        m_COMP_ITEM_CD = null;          // 子品目番号
        m_PS_EDITION = null;            // 製品構成版数
        m_PS_UNIT_DENOMINATOR = null;   // 製品構成単位数分母
        m_PS_UNIT_NUMERATOR = null;     // 製品構成単位数分子
        m_EFF_PHASE_IN_DATE = null;     // 製品構成有効開始日
        m_EFF_PHASE_OUT_DATE = null;    // 製品構成有効終了日
        m_PS_SPOIL = null;              // 構成仕損率
        m_CONS_TYP = null;              // 支給区分
        m_PS_LT_FLG = null;             // 製品構成LT使用フラグ
        m_PS_FIXED_LT = null;           // 製品構成固定分LT
        m_PS_PROP_LT = null;            // 製品構成比例分LT
        m_PS_PROP_LOT_SIZE = null;      // 製品構成比例分LS
        m_PS_REF_NO = null;             // 製品構成照会キー
        m_COST_UP_TYP = null;           // 原価積上区分
        m_MRP_EXP_TYP = null;           // 所要量展開区分
    }

    /**
     * インスタンス破壊時に行う処理
     *
     * @param なし
     */
    public void finalize()
    {
        clear();        // クリア
        return;
    }

    /**
     * 初期化
     */
    public void initialize()
    {
        m_LEVEL = new Integer(0);                // 階層レベル
        m_PARENT_ITEM_CD = null;                 // 親品目番号
        m_COMP_ITEM_CD = null;                   // 子品目番号
        m_PS_EDITION = null;                     // 製品構成版数
        m_PS_UNIT_DENOMINATOR = new String("0"); // 製品構成単位数分母
        m_PS_UNIT_NUMERATOR = new String("0");   // 製品構成単位数分子
        m_EFF_PHASE_IN_DATE = null;              // 製品構成有効開始日
        m_EFF_PHASE_OUT_DATE = null;             // 製品構成有効終了日
        m_PS_SPOIL = new String("0");            // 構成仕損率
        m_CONS_TYP = new String("0");            // 支給区分
        m_PS_LT_FLG = new String("0");           // 製品構成LT使用フラグ
        m_PS_FIXED_LT = new String("0");         // 製品構成固定分LT
        m_PS_PROP_LT = new String("0");          // 製品構成比例分LT
        m_PS_PROP_LOT_SIZE = new String("0");    // 製品構成比例分LS
        m_PS_REF_NO = new String("0");           // 製品構成照会キー
        m_COST_UP_TYP = new String("0");         // 原価積上区分
        m_MRP_EXP_TYP = new String("0");         // 所要量展開区分
    }

    /**
     * コピー
     */
    public void copy(PsStruct struct)
    {
        clear();        // クリア
        m_LEVEL               = (struct.m_LEVEL               == null) ? null : struct.getLEVEL();                  // 階層レベル
        m_PARENT_ITEM_CD      = (struct.m_PARENT_ITEM_CD      == null) ? null : struct.getPARENT_ITEM_CD();         // 親品目番号
        m_COMP_ITEM_CD        = (struct.m_COMP_ITEM_CD        == null) ? null : struct.getCOMP_ITEM_CD();           // 子品目番号
        m_PS_EDITION          = (struct.m_PS_EDITION          == null) ? null : struct.getPS_EDITION();             // 製品構成版数
        m_PS_UNIT_DENOMINATOR = (struct.m_PS_UNIT_DENOMINATOR == null) ? null : struct.getPS_UNIT_DENOMINATOR();    // 製品構成単位数分母
        m_PS_UNIT_NUMERATOR   = (struct.m_PS_UNIT_NUMERATOR   == null) ? null : struct.getPS_UNIT_NUMERATOR();      // 製品構成単位数分子
        m_EFF_PHASE_IN_DATE   = (struct.m_EFF_PHASE_IN_DATE   == null) ? null : struct.getEFF_PHASE_IN_DATE();      // 製品構成有効開始日
        m_EFF_PHASE_OUT_DATE  = (struct.m_EFF_PHASE_OUT_DATE  == null) ? null : struct.getEFF_PHASE_OUT_DATE();     // 製品構成有効終了日
        m_PS_SPOIL            = (struct.m_PS_SPOIL            == null) ? null : struct.getPS_SPOIL();               // 構成仕損率
        m_CONS_TYP            = (struct.m_CONS_TYP            == null) ? null : struct.getCONS_TYP();               // 支給区分
        m_PS_LT_FLG           = (struct.m_PS_LT_FLG           == null) ? null : struct.getPS_LT_FLG();              // 製品構成LT使用フラグ
        m_PS_FIXED_LT         = (struct.m_PS_FIXED_LT         == null) ? null : struct.getPS_FIXED_LT();            // 製品構成固定分LT
        m_PS_PROP_LT          = (struct.m_PS_PROP_LT          == null) ? null : struct.getPS_PROP_LT();             // 製品構成比例分LT
        m_PS_PROP_LOT_SIZE    = (struct.m_PS_PROP_LOT_SIZE    == null) ? null : struct.getPS_PROP_LOT_SIZE();       // 製品構成比例分LS
        m_PS_REF_NO           = (struct.m_PS_REF_NO           == null) ? null : struct.getPS_REF_NO();              // 製品構成照会キー
        m_COST_UP_TYP         = (struct.m_COST_UP_TYP         == null) ? null : struct.getCOST_UP_TYP();            // 原価積上区分
        m_MRP_EXP_TYP         = (struct.m_MRP_EXP_TYP         == null) ? null : struct.getMRP_EXP_TYP();            // 所要量展開区分
    }

    /**
     * コピーコンストラクタ
     */
     public PsStruct(PsStruct struct)
     {
        copy(struct);
     }

    // 構成展開
    public static final String _expandPs =
        "SELECT " +
            "LEVEL," +
            "PARENT_ITEM_CD," +
            "COMP_ITEM_CD," +
            "PS_EDITION," +
            "TO_CHAR(PS_UNIT_DENOMINATOR, 'FM99999999999990.0999')," +
            "TO_CHAR(PS_UNIT_NUMERATOR, 'FM99999999999990.0999')," +
            "TO_CHAR(EFF_PHASE_IN_DATE, 'YYYY/MM/DD')," +
            "TO_CHAR(EFF_PHASE_OUT_DATE, 'YYYY/MM/DD')," +
            "TO_CHAR(PS_SPOIL, 'FM99990.0999')," +
            "CONS_TYP," +
            "PS_LT_FLG," +
            "TO_CHAR(PS_FIXED_LT, 'FM999990')," +
            "TO_CHAR(PS_PROP_LT, 'FM999990')," +
            "TO_CHAR(PS_PROP_LOT_SIZE, 'FM99999999999990.0999')," +
            "TO_CHAR(PS_REF_NO, 'FM999990')," +
            "COST_UP_TYP," +
            "MRP_EXP_TYP" +
        " FROM (SELECT * FROM M_PS WHERE MRP_EXP_TYP = 1)" +
        " START WITH PARENT_ITEM_CD = ?" +
        " CONNECT BY PRIOR COMP_ITEM_CD = PARENT_ITEM_CD";

}