//------------------------------------------------------------------------------
// (#)ExtPlanStruct.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2004/01/20 �V�K�쐬 J.Higashi
//
// 2004/02/26 M.Hotokebuchi
// �EStruct�N���X�̖��̂� ExtPlanExpStruct1 �� ExtPlanStruct �ɕύX
// �EDouble,Integer��String�ɕύX �S�ʓI�ɉ���
//------------------------------------------------------------------------------
package com.nec.jp.orteus.expj.util;

/**
 * <B>ExtPlanStruct</B><BR>
 * �O���v��Ǎ��p�̃f�[�^�N���X<BR>
 * <BR>
 * @author  J.Higashi
 * @version 1.00
 */
public class ExtPlanStruct
{
    /**
     * �l�i�[�p�����o�ϐ�
     */
    public String  m_LEVEL = null;                      // �K�w���x��
    public String  m_EXTERNAL_PLAN_CD = null;           // �O���v��ԍ�
    public String  m_PLANT_CD = null;                   // �H��R�[�h
    public String  m_EXTERNAL_PLAN_REG_TYP = null;      // �O���v��o�^�敪
    public String  m_EXTERNAL_PLAN_EXP_TYP = null;      // �O���v�揈���敪
    public String  m_EXTERNAL_PLAN_DEL_FLG = null;      // �O���v��폜�敪
    public String  m_OD_NO = null;                      // �I�[�_�f�}���h�ԍ�
    public String  m_ITEM_CD = null;                    // �i�ڔԍ�
    public String  m_ODR_STS_TYP = null;                // �I�[�_��ԋ敪
    public String  m_DUE_DATE = null;                   // �v���[��
    public String  m_ODR_START_DATE = null;             // ��z�����
    public String  m_PRD_DUE_DATE = null;               // �����[��
    public String  m_PRD_START_DATE = null;             // ���������
    public String  m_ODR_QTY = null;                    // �I�[�_��
    public String  m_MRP_ODR_TYP = null;                // �i�ڎ�z�敪
    public String  m_EXTERNAL_DM_FLG = null;            // �O���f�}���h�t���O
    public String  m_OD_LEVEL_NO = null;                // ���v�ʃ��x���ԍ�
    public String  m_EXT_LEVEL_NO = null;               // �O���v�摊�΃��x���ԍ�

    /**
     * �v�f�擾�֐�
     */
    public String  getLEVEL() { return m_LEVEL; }                                   // �K�w���x��
    public String  getEXTERNAL_PLAN_CD() { return m_EXTERNAL_PLAN_CD; }             // �O���v��ԍ�
    public String  getPLANT_CD() { return m_PLANT_CD; }                             // �H��R�[�h
    public String  getEXTERNAL_PLAN_REG_TYP() { return m_EXTERNAL_PLAN_REG_TYP; }   // �O���v��o�^�敪
    public String  getEXTERNAL_PLAN_EXP_TYP() { return m_EXTERNAL_PLAN_EXP_TYP; }   // �O���v�揈���敪
    public String  getEXTERNAL_PLAN_DEL_FLG() { return m_EXTERNAL_PLAN_DEL_FLG; }   // �O���v��폜�敪
    public String  getOD_NO() { return m_OD_NO; }                                   // �I�[�_�f�}���h�ԍ�
    public String  getITEM_CD() { return m_ITEM_CD; }                               // �i�ڔԍ�
    public String  getODR_STS_TYP() { return m_ODR_STS_TYP; }                       // �I�[�_��ԋ敪
    public String  getDUE_DATE() { return m_DUE_DATE; }                             // �v���[��
    public String  getODR_START_DATE() { return m_ODR_START_DATE; }                 // ��z�����
    public String  getPRD_DUE_DATE() { return m_PRD_DUE_DATE; }                     // �����[��
    public String  getPRD_START_DATE() { return m_PRD_START_DATE; }                 // ���������
    public String  getODR_QTY() { return m_ODR_QTY; }                               // �I�[�_��
    public String  getMRP_ODR_TYP() { return m_MRP_ODR_TYP; }                       // �i�ڎ�z�敪
    public String  getEXTERNAL_DM_FLG() { return m_EXTERNAL_DM_FLG; }               // �O���f�}���h�t���O
    public String  getOD_LEVEL_NO() { return m_OD_LEVEL_NO; }                       // ���v�ʃ��x���ԍ�
    public String  getEXT_LEVEL_NO() { return m_EXT_LEVEL_NO; }                     // �O���v�摊�΃��x���ԍ�

    /**
     * �v�f�ݒ�֐�
     */
    public void setLEVEL(String  val) { m_LEVEL = val; }                                    // �K�w���x��
    public void setEXTERNAL_PLAN_CD(String val) { m_EXTERNAL_PLAN_CD = val; }               // �O���v��ԍ�
    public void setPLANT_CD(String val) { m_PLANT_CD = val; }                               // �H��R�[�h
    public void setEXTERNAL_PLAN_REG_TYP(String  val) { m_EXTERNAL_PLAN_REG_TYP = val; }    // �O���v��o�^�敪
    public void setEXTERNAL_PLAN_EXP_TYP(String  val) { m_EXTERNAL_PLAN_EXP_TYP = val; }    // �O���v�揈���敪
    public void setEXTERNAL_PLAN_DEL_FLG(String  val) { m_EXTERNAL_PLAN_DEL_FLG = val; }    // �O���v��폜�敪
    public void setOD_NO(String val) { m_OD_NO = val; }                                     // �I�[�_�f�}���h�ԍ�
    public void setITEM_CD(String val) { m_ITEM_CD = val; }                                 // �i�ڔԍ�
    public void setODR_STS_TYP(String  val) { m_ODR_STS_TYP = val; }                        // �I�[�_��ԋ敪
    public void setDUE_DATE(String val) { m_DUE_DATE = val; }                               // �v���[��
    public void setODR_START_DATE(String val) { m_ODR_START_DATE = val; }                   // ��z�����
    public void setPRD_DUE_DATE(String val) { m_PRD_DUE_DATE = val; }                       // �����[��
    public void setPRD_START_DATE(String val) { m_PRD_START_DATE = val; }                   // ���������
    public void setODR_QTY(String val) { m_ODR_QTY = val; }                                 // �I�[�_��
    public void setMRP_ODR_TYP(String  val) { m_MRP_ODR_TYP = val; }                        // �i�ڎ�z�敪
    public void setEXTERNAL_DM_FLG(String  val) { m_EXTERNAL_DM_FLG = val; }                // �O���f�}���h�t���O
    public void setOD_LEVEL_NO(String  val) { m_OD_LEVEL_NO = val; }                        // ���v�ʃ��x���ԍ�
    public void setEXT_LEVEL_NO(String  val) { m_EXT_LEVEL_NO = val; }                      // �O���v�摊�΃��x���ԍ�

    /**
     * �R���X�g���N�^
     *
     * @param �Ȃ�
     */
    public ExtPlanStruct()
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
        m_LEVEL = null;                     // �K�w���x��
        m_EXTERNAL_PLAN_CD = null;          // �O���v��ԍ�
        m_PLANT_CD = null;                  // �H��R�[�h
        m_EXTERNAL_PLAN_REG_TYP = null;     // �O���v��o�^�敪
        m_EXTERNAL_PLAN_EXP_TYP = null;     // �O���v�揈���敪
        m_EXTERNAL_PLAN_DEL_FLG = null;     // �O���v��폜�敪
        m_OD_NO = null;                     // �I�[�_�f�}���h�ԍ�
        m_ITEM_CD = null;                   // �i�ڔԍ�
        m_ODR_STS_TYP = null;               // �I�[�_��ԋ敪
        m_DUE_DATE = null;                  // �v���[��
        m_ODR_START_DATE = null;            // ��z�����
        m_PRD_DUE_DATE = null;              // �����[��
        m_PRD_START_DATE = null;            // ���������
        m_ODR_QTY = null;                   // �I�[�_��
        m_MRP_ODR_TYP = null;               // �i�ڎ�z�敪
        m_EXTERNAL_DM_FLG = null;           // �O���f�}���h�t���O
        m_OD_LEVEL_NO = null;               // ���v�ʃ��x���ԍ�
        m_EXT_LEVEL_NO = null;              // �O���v�摊�΃��x���ԍ�
    }

    /**
     * �C���X�^���X�j�󎞂ɍs������
     *
     * @param �Ȃ�
     */
    public void finalize()
    {
        clear();    // �N���A
        return;
    }

    /**
     * ������
     */
    public void initialize()
    {
        m_LEVEL = new String("0");                  // �K�w���x��
        m_EXTERNAL_PLAN_CD = null;                  // �O���v��ԍ�
        m_PLANT_CD = null;                          // �H��R�[�h
        m_EXTERNAL_PLAN_REG_TYP = new String("0");  // �O���v��o�^�敪
        m_EXTERNAL_PLAN_EXP_TYP = new String("0");  // �O���v�揈���敪
        m_EXTERNAL_PLAN_DEL_FLG = new String("0");  // �O���v��폜�敪
        m_OD_NO = null;                             // �I�[�_�f�}���h�ԍ�
        m_ITEM_CD = null;                           // �i�ڔԍ�
        m_ODR_STS_TYP = new String("0");            // �I�[�_��ԋ敪
        m_DUE_DATE = null;                          // �v���[��
        m_ODR_START_DATE = null;                    // ��z�����
        m_PRD_DUE_DATE = null;                      // �����[��
        m_PRD_START_DATE = null;                    // ���������
        m_ODR_QTY = new String("0");                // �I�[�_��
        m_MRP_ODR_TYP = new String("0");            // �i�ڎ�z�敪
        m_EXTERNAL_DM_FLG = new String("0");        // �O���f�}���h�t���O
        m_OD_LEVEL_NO = new String("0");            // ���v�ʃ��x���ԍ�
        m_EXT_LEVEL_NO = new String("0");           // �O���v�摊�΃��x���ԍ�
    }

    /**
     * �R�s�[
     */
    public void copy(ExtPlanStruct struct)
    {
        clear();        // �N���A
        m_LEVEL                 = (struct.m_LEVEL                 == null) ? null : struct.getLEVEL();                  // �K�w���x��
        m_EXTERNAL_PLAN_CD      = (struct.m_EXTERNAL_PLAN_CD      == null) ? null : struct.getEXTERNAL_PLAN_CD();       // �O���v��ԍ�
        m_PLANT_CD              = (struct.m_PLANT_CD              == null) ? null : struct.getPLANT_CD();               // �H��R�[�h
        m_EXTERNAL_PLAN_REG_TYP = (struct.m_EXTERNAL_PLAN_REG_TYP == null) ? null : struct.getEXTERNAL_PLAN_REG_TYP();  // �O���v��o�^�敪
        m_EXTERNAL_PLAN_EXP_TYP = (struct.m_EXTERNAL_PLAN_EXP_TYP == null) ? null : struct.getEXTERNAL_PLAN_EXP_TYP();  // �O���v�揈���敪
        m_EXTERNAL_PLAN_DEL_FLG = (struct.m_EXTERNAL_PLAN_DEL_FLG == null) ? null : struct.getEXTERNAL_PLAN_DEL_FLG();  // �O���v��폜�敪
        m_OD_NO                 = (struct.m_OD_NO                 == null) ? null : struct.getOD_NO();                  // �I�[�_�f�}���h�ԍ�
        m_ITEM_CD               = (struct.m_ITEM_CD               == null) ? null : struct.getITEM_CD();                // �i�ڔԍ�
        m_ODR_STS_TYP           = (struct.m_ODR_STS_TYP           == null) ? null : struct.getODR_STS_TYP();            // �I�[�_��ԋ敪
        m_DUE_DATE              = (struct.m_DUE_DATE              == null) ? null : struct.getDUE_DATE();               // �v���[��
        m_ODR_START_DATE        = (struct.m_ODR_START_DATE        == null) ? null : struct.getODR_START_DATE();         // ��z�����
        m_PRD_DUE_DATE          = (struct.m_PRD_DUE_DATE          == null) ? null : struct.getPRD_DUE_DATE();           // �����[��
        m_PRD_START_DATE        = (struct.m_PRD_START_DATE        == null) ? null : struct.getPRD_START_DATE();         // ���������
        m_ODR_QTY               = (struct.m_ODR_QTY               == null) ? null : struct.getODR_QTY();                // �I�[�_��
        m_MRP_ODR_TYP           = (struct.m_MRP_ODR_TYP           == null) ? null : struct.getMRP_ODR_TYP();            // �i�ڎ�z�敪
        m_EXTERNAL_DM_FLG       = (struct.m_EXTERNAL_DM_FLG       == null) ? null : struct.getEXTERNAL_DM_FLG();        // �O���f�}���h�t���O
        m_OD_LEVEL_NO           = (struct.m_OD_LEVEL_NO           == null) ? null : struct.getOD_LEVEL_NO();            // ���v�ʃ��x���ԍ�
        m_EXT_LEVEL_NO          = (struct.m_EXT_LEVEL_NO          == null) ? null : struct.getEXT_LEVEL_NO();           // �O���v�摊�΃��x���ԍ�
    }

    /**
     * �R�s�[�R���X�g���N�^
     */
     public ExtPlanStruct(ExtPlanStruct struct)
     {
        copy(struct);
     }

    // �O���v��̌����pSQL��`
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

    /* �O���v�揈���敪 */
    public static final String PLAN_EXP_TYP_INSERT = new String("1");   // 1:�ǉ�
    public static final String PLAN_EXP_TYP_UPDATE = new String("2");   // 2:�ύX

    /* �O���v��폜�t���O */
    public static final String PLAN_DEL_FLG_OFF    = new String("0");   // 0:��
    public static final String PLAN_DEL_FLG_ON     = new String("1");   // 1:�폜

    /** �O���f�}���h�t���O */
    public static final String DM_FLG_INT_DEMAND   = new String("0");   // 1:�����f�}���h
    public static final String DM_FLG_EXT_DEMAND   = new String("1");   // 1:�O���f�}���h
}
