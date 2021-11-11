//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0050Const �N���X
 * �t�@�C���E�N���X����
 * @author $Author: suganuma $
 * @version $Revision: 1.3 $ $Date: 2010/04/12 00:18:39 $
 *
 */
//-----------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.AZ0050;



/**
 * AZ0050���� �萔��`�C���^�t�F�[�X�N���X
 * @author  Y.Hashimoto
 * @version 1.00
 * @see 
 */
public interface AZ0050Const
{
// ******* ���J�ϐ�,�萔 *********

    /**  �J��������(ORACLE) ****/
    public static final String C_VARCHAR = "VARCHAR2";   //VARCHAR2
    public static final String C_NUMBER = "NUMBER";   //VARCHAR2
    public static final String C_DATE = "DATE";   //VARCHAR2

    /** ��ʎw��Ȃ� */
    public static final int C_NONE = 0; // �Ȃ�

    /** �\�[�g��� */
    public static final int C_ASC = 1;   //����
    public static final int C_DESC = 2;  //�~��

    /** select�� �ɂ�����e�[�u�����w��敪 */
    public static final int C_AS_NONE = 1;   //�e�[�u�����w��Ȃ�
    public static final int C_AS_TB = 2;     //�e�[�u�����w��
    public static final int C_AS_ALIAS = 3;  //�e�[�u�����ʖ��w��

    //WHERE�����̎��(���������A��r����)
    public static final String C_JOIN_EQUAL = "="; //�e�[�u����������(inner join)
    public static final String C_LEFT_JOIN  = "left"; //�e�[�u����������(left outer join)
    public static final String C_RIGHT_JOIN = "right"; //�e�[�u����������(right outer join)

    /** WHERE��̔�r������(��͗p) */
    /*  ��̓��W�b�N�ւ̉e�������邽�߁A���Ԃ������Ă͂����Ȃ�yo�I */
    public static final String[] COMP_STR =
            {"!=","<=",">=","=",">","<",
             " LIKE "," BETWEEN "," IN ",
             "IS NULL","IS NOT NULL"};

    /** WHERE��̔�r������(��ʗp) */
    public static final String[] COMP_STR_DISP =
            {" ","LIKE","=","!=","<=",">=","<",">",
             "BETWEEN","IN",
             "IS NULL","IS NOT NULL"};

    public final static int C_LIKE    = 1;    // like 
    public final static int C_EQ      = 2;    // = 
    public final static int C_NE      = 3;    // != 
    public final static int C_LT      = 4;    // <= 
    public final static int C_GT      = 5;    // >= 
    public final static int C_LS      = 6;    // < 
    public final static int C_GR      = 7;    // > 
    public final static int C_RANG    = 8;    // between
    public final static int C_IN      = 9;    // in 
    public final static int C_ISNULL  = 10;   // is null 
    public final static int C_NOTNULL = 11;   // is not null 
    //****************
    
    //  �Ɩ��������[�h */
    /** �Q�ƃ��[�h (DB�X�V�Ȃ�) */
    public final static String C_PROCESS_REF = new String("REF");
    /** �X�V���[�h (DB�X�V����) */
    public final static String C_PROCESS_UPD = new String("UPD");
    /** �ǉ����[�h (DB�X�V����) */
    public final static String C_PROCESS_INS = new String("INS");
    /** ���ʃ��[�h (DB�X�V����) */
    public final static String C_PROCESS_COPY = new String("COPY");

    //  ���̓��[�h */
    /** GUI���[�h */
    public final static int C_INPUT_GUI = 0;
    /** �t���[���[�h */
    public final static int C_INPUT_FREE = 1;
}
