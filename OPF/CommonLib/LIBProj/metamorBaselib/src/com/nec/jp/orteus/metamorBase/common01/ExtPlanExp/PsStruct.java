//------------------------------------------------------------------------------
// (#)PsStruct.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/20 �V�K�쐬 J.Higashi
//
// 2004/02/26 M.Hotokebuchi
// �EStruct�N���X�̖��̂� ExtPlanExpStruct2 �� PsStruct �ɕύX
// �EDouble,Integer��String�ɕύX �S�ʓI�ɉ���
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common01.ExtPlanExp;

/**
 * <B>PsStruct</B><BR>
 * �\���W�J�Ǎ��p�̃f�[�^�N���X<BR>
 * <BR>
 * @author  J.Higashi
 * @version 1.00
 */
public class PsStruct
{
    /**
     * �l�i�[�p�����o�ϐ�
     */
    public Integer m_LEVEL = null;                  // �K�w���x��
    public String  m_PARENT_ITEM_CD = null;         // �e�i�ڔԍ�
    public String  m_COMP_ITEM_CD = null;           // �q�i�ڔԍ�
    public String  m_PS_EDITION = null;             // ���i�\���Ő�
    public String  m_PS_UNIT_DENOMINATOR = null;    // ���i�\���P�ʐ�����
    public String  m_PS_UNIT_NUMERATOR = null;      // ���i�\���P�ʐ����q
    public String  m_EFF_PHASE_IN_DATE = null;      // ���i�\���L���J�n��
    public String  m_EFF_PHASE_OUT_DATE = null;     // ���i�\���L���I����
    public String  m_PS_SPOIL = null;               // �\���d����
    public String  m_CONS_TYP = null;               // �x���敪
    public String  m_PS_LT_FLG = null;              // ���i�\��LT�g�p�t���O
    public String  m_PS_FIXED_LT = null;            // ���i�\���Œ蕪LT
    public String  m_PS_PROP_LT = null;             // ���i�\����ᕪLT
    public String  m_PS_PROP_LOT_SIZE = null;       // ���i�\����ᕪLS
    public String  m_PS_REF_NO = null;              // ���i�\���Ɖ�L�[
    public String  m_COST_UP_TYP = null;            // �����Ϗ�敪
    public String  m_MRP_EXP_TYP = null;            // ���v�ʓW�J�敪

    /**
     * �v�f�擾�֐�
     */
    public Integer getLEVEL() { return m_LEVEL; }                               // �K�w���x��
    public String  getPARENT_ITEM_CD() { return m_PARENT_ITEM_CD; }             // �e�i�ڔԍ�
    public String  getCOMP_ITEM_CD() { return m_COMP_ITEM_CD; }                 // �q�i�ڔԍ�
    public String  getPS_EDITION() { return m_PS_EDITION; }                     // ���i�\���Ő�
    public String  getPS_UNIT_DENOMINATOR() { return m_PS_UNIT_DENOMINATOR; }   // ���i�\���P�ʐ�����
    public String  getPS_UNIT_NUMERATOR() { return m_PS_UNIT_NUMERATOR; }       // ���i�\���P�ʐ����q
    public String  getEFF_PHASE_IN_DATE() { return m_EFF_PHASE_IN_DATE; }       // ���i�\���L���J�n��
    public String  getEFF_PHASE_OUT_DATE() { return m_EFF_PHASE_OUT_DATE; }     // ���i�\���L���I����
    public String  getPS_SPOIL() { return m_PS_SPOIL; }                         // �\���d����
    public String  getCONS_TYP() { return m_CONS_TYP; }                         // �x���敪
    public String  getPS_LT_FLG() { return m_PS_LT_FLG; }                       // ���i�\��LT�g�p�t���O
    public String  getPS_FIXED_LT() { return m_PS_FIXED_LT; }                   // ���i�\���Œ蕪LT
    public String  getPS_PROP_LT() { return m_PS_PROP_LT; }                     // ���i�\����ᕪLT
    public String  getPS_PROP_LOT_SIZE() { return m_PS_PROP_LOT_SIZE; }         // ���i�\����ᕪLS
    public String  getPS_REF_NO() { return m_PS_REF_NO; }                       // ���i�\���Ɖ�L�[
    public String  getCOST_UP_TYP() { return m_COST_UP_TYP; }                   // �����Ϗ�敪
    public String  getMRP_EXP_TYP() { return m_MRP_EXP_TYP; }                   // ���v�ʓW�J�敪

    /**
     * �v�f�ݒ�֐�
     */
    public void setLEVEL(Integer val) { m_LEVEL = val; }                            // �K�w���x��
    public void setPARENT_ITEM_CD(String val) { m_PARENT_ITEM_CD = val; }           // �e�i�ڔԍ�
    public void setCOMP_ITEM_CD(String val) { m_COMP_ITEM_CD = val; }               // �q�i�ڔԍ�
    public void setPS_EDITION(String val) { m_PS_EDITION = val; }                   // ���i�\���Ő�
    public void setPS_UNIT_DENOMINATOR(String val) { m_PS_UNIT_DENOMINATOR = val; } // ���i�\���P�ʐ�����
    public void setPS_UNIT_NUMERATOR(String val) { m_PS_UNIT_NUMERATOR = val; }     // ���i�\���P�ʐ����q
    public void setEFF_PHASE_IN_DATE(String val) { m_EFF_PHASE_IN_DATE = val; }     // ���i�\���L���J�n��
    public void setEFF_PHASE_OUT_DATE(String val) { m_EFF_PHASE_OUT_DATE = val; }   // ���i�\���L���I����
    public void setPS_SPOIL(String val) { m_PS_SPOIL = val; }                       // �\���d����
    public void setCONS_TYP(String  val) { m_CONS_TYP = val; }                      // �x���敪
    public void setPS_LT_FLG(String  val) { m_PS_LT_FLG = val; }                    // ���i�\��LT�g�p�t���O
    public void setPS_FIXED_LT(String  val) { m_PS_FIXED_LT = val; }                // ���i�\���Œ蕪LT
    public void setPS_PROP_LT(String  val) { m_PS_PROP_LT = val; }                  // ���i�\����ᕪLT
    public void setPS_PROP_LOT_SIZE(String val) { m_PS_PROP_LOT_SIZE = val; }       // ���i�\����ᕪLS
    public void setPS_REF_NO(String  val) { m_PS_REF_NO = val; }                    // ���i�\���Ɖ�L�[
    public void setCOST_UP_TYP(String  val) { m_COST_UP_TYP = val; }                // �����Ϗ�敪
    public void setMRP_EXP_TYP(String  val) { m_MRP_EXP_TYP = val; }                // ���v�ʓW�J�敪

    /**
     * �R���X�g���N�^
     *
     * @param �Ȃ�
     */
    public PsStruct()
    {
        initialize();       // ������
        return;
    }

    /**
     * �����o�ϐ��̃N���A
     *
     * @param �Ȃ�
     */
    public void clear()
    {
        m_LEVEL = null;                 // �K�w���x��
        m_PARENT_ITEM_CD = null;        // �e�i�ڔԍ�
        m_COMP_ITEM_CD = null;          // �q�i�ڔԍ�
        m_PS_EDITION = null;            // ���i�\���Ő�
        m_PS_UNIT_DENOMINATOR = null;   // ���i�\���P�ʐ�����
        m_PS_UNIT_NUMERATOR = null;     // ���i�\���P�ʐ����q
        m_EFF_PHASE_IN_DATE = null;     // ���i�\���L���J�n��
        m_EFF_PHASE_OUT_DATE = null;    // ���i�\���L���I����
        m_PS_SPOIL = null;              // �\���d����
        m_CONS_TYP = null;              // �x���敪
        m_PS_LT_FLG = null;             // ���i�\��LT�g�p�t���O
        m_PS_FIXED_LT = null;           // ���i�\���Œ蕪LT
        m_PS_PROP_LT = null;            // ���i�\����ᕪLT
        m_PS_PROP_LOT_SIZE = null;      // ���i�\����ᕪLS
        m_PS_REF_NO = null;             // ���i�\���Ɖ�L�[
        m_COST_UP_TYP = null;           // �����Ϗ�敪
        m_MRP_EXP_TYP = null;           // ���v�ʓW�J�敪
    }

    /**
     * �C���X�^���X�j�󎞂ɍs������
     *
     * @param �Ȃ�
     */
    public void finalize()
    {
        clear();        // �N���A
        return;
    }

    /**
     * ������
     */
    public void initialize()
    {
        m_LEVEL = new Integer(0);                // �K�w���x��
        m_PARENT_ITEM_CD = null;                 // �e�i�ڔԍ�
        m_COMP_ITEM_CD = null;                   // �q�i�ڔԍ�
        m_PS_EDITION = null;                     // ���i�\���Ő�
        m_PS_UNIT_DENOMINATOR = new String("0"); // ���i�\���P�ʐ�����
        m_PS_UNIT_NUMERATOR = new String("0");   // ���i�\���P�ʐ����q
        m_EFF_PHASE_IN_DATE = null;              // ���i�\���L���J�n��
        m_EFF_PHASE_OUT_DATE = null;             // ���i�\���L���I����
        m_PS_SPOIL = new String("0");            // �\���d����
        m_CONS_TYP = new String("0");            // �x���敪
        m_PS_LT_FLG = new String("0");           // ���i�\��LT�g�p�t���O
        m_PS_FIXED_LT = new String("0");         // ���i�\���Œ蕪LT
        m_PS_PROP_LT = new String("0");          // ���i�\����ᕪLT
        m_PS_PROP_LOT_SIZE = new String("0");    // ���i�\����ᕪLS
        m_PS_REF_NO = new String("0");           // ���i�\���Ɖ�L�[
        m_COST_UP_TYP = new String("0");         // �����Ϗ�敪
        m_MRP_EXP_TYP = new String("0");         // ���v�ʓW�J�敪
    }

    /**
     * �R�s�[
     */
    public void copy(PsStruct struct)
    {
        clear();        // �N���A
        m_LEVEL               = (struct.m_LEVEL               == null) ? null : struct.getLEVEL();                  // �K�w���x��
        m_PARENT_ITEM_CD      = (struct.m_PARENT_ITEM_CD      == null) ? null : struct.getPARENT_ITEM_CD();         // �e�i�ڔԍ�
        m_COMP_ITEM_CD        = (struct.m_COMP_ITEM_CD        == null) ? null : struct.getCOMP_ITEM_CD();           // �q�i�ڔԍ�
        m_PS_EDITION          = (struct.m_PS_EDITION          == null) ? null : struct.getPS_EDITION();             // ���i�\���Ő�
        m_PS_UNIT_DENOMINATOR = (struct.m_PS_UNIT_DENOMINATOR == null) ? null : struct.getPS_UNIT_DENOMINATOR();    // ���i�\���P�ʐ�����
        m_PS_UNIT_NUMERATOR   = (struct.m_PS_UNIT_NUMERATOR   == null) ? null : struct.getPS_UNIT_NUMERATOR();      // ���i�\���P�ʐ����q
        m_EFF_PHASE_IN_DATE   = (struct.m_EFF_PHASE_IN_DATE   == null) ? null : struct.getEFF_PHASE_IN_DATE();      // ���i�\���L���J�n��
        m_EFF_PHASE_OUT_DATE  = (struct.m_EFF_PHASE_OUT_DATE  == null) ? null : struct.getEFF_PHASE_OUT_DATE();     // ���i�\���L���I����
        m_PS_SPOIL            = (struct.m_PS_SPOIL            == null) ? null : struct.getPS_SPOIL();               // �\���d����
        m_CONS_TYP            = (struct.m_CONS_TYP            == null) ? null : struct.getCONS_TYP();               // �x���敪
        m_PS_LT_FLG           = (struct.m_PS_LT_FLG           == null) ? null : struct.getPS_LT_FLG();              // ���i�\��LT�g�p�t���O
        m_PS_FIXED_LT         = (struct.m_PS_FIXED_LT         == null) ? null : struct.getPS_FIXED_LT();            // ���i�\���Œ蕪LT
        m_PS_PROP_LT          = (struct.m_PS_PROP_LT          == null) ? null : struct.getPS_PROP_LT();             // ���i�\����ᕪLT
        m_PS_PROP_LOT_SIZE    = (struct.m_PS_PROP_LOT_SIZE    == null) ? null : struct.getPS_PROP_LOT_SIZE();       // ���i�\����ᕪLS
        m_PS_REF_NO           = (struct.m_PS_REF_NO           == null) ? null : struct.getPS_REF_NO();              // ���i�\���Ɖ�L�[
        m_COST_UP_TYP         = (struct.m_COST_UP_TYP         == null) ? null : struct.getCOST_UP_TYP();            // �����Ϗ�敪
        m_MRP_EXP_TYP         = (struct.m_MRP_EXP_TYP         == null) ? null : struct.getMRP_EXP_TYP();            // ���v�ʓW�J�敪
    }

    /**
     * �R�s�[�R���X�g���N�^
     */
     public PsStruct(PsStruct struct)
     {
        copy(struct);
     }

    // �\���W�J
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