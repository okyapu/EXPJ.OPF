//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040ColumnInfo �N���X
 * �t�@�C���E�N���X����
 * @author $Author: suganuma $
 * @version $Revision: 1.1 $ $Date: 2005/03/09 06:49:39 $
 *
 */
//-----------------------------------------------------------------------------
//package com.nec.jp.orteus.metamorBase.AZ0040;

package com.nec.jp.orteus.metamorBase.AZ0040;

/**
 * SQL��̓N���X
 * @author  Y.Hashimoto
 * @version 1.00
 * @see 
 */
public class AZ0040ColumnInfo
              implements AZ0040Const {
// ******* ���J�ϐ�,�萔 *********


// ******* Package���J�ϐ� *********

    // --------SQL���  -------------
    String    Table_Name;           // �e�[�u����
    String    Table_Name_Comment;   // �e�[�u�����R�����g
    String    Table_Name_Alias;     // �e�[�u�����ʖ�
    String    Column_Name;          // �J������
    String    Column_Name_Comment;  // �J�������R�����g
    String    Column_Name_Alias;    // �J�������ʖ�
    int       Column_Type;          // �J�����̂r�p�k�^(java.sql.Types)
    String    Column_Type_Ora;      // �J�����̑���(ORACLE DATA_TYPE)
    int       Column_Asflag;		// �e�[�u�����w��敪
    int       Cond_Type;            //���o�����i��r���Z�q�j
    String    Cond_Value1;          //���o�����l from
    String    Cond_Value2;          //���o�����l to
    boolean   Display_Flg;          //�\���敪
    int       Sort_Type;            //�\�[�g��ށi1:�����A2:�~���j
    int       Sort_No;              //�\�[�g�L�[��


// ******* ����J�萔�E�ϐ� *********


// ********  �R���X�g���N�^ **************
    /**
      * 
      * �R���X�g���N�^<br>
      *
      * @param xx
      * @see #xxxxx
      */
    AZ0040ColumnInfo() {
        //�l�ێ��̈�̏�����
        clear();
    }

//------------------------------------------------------------------
//  ���J�֐�
//------------------------------------------------------------------
    // *********  �l�擾�p���\�b�h*********************
    public final String  getTable_Name() {           // �e�[�u����
        return Table_Name;
    }


    public final String getTable_Name_Comment() {    // �e�[�u�����R�����g
        return Table_Name_Comment;
    }

    public final String getTable_Name_Alias() {    // �e�[�u�����ʖ�
        return Table_Name_Alias;
    }

    public final String getColumn_Name() {// �J������
        return Column_Name;
    }

    public final String getColumn_Name_Comment() {// �J�������R�����g
        return Column_Name_Comment;
    }

    public final String getColumn_Name_Alias() {// �J�������ʖ�
        return Column_Name_Alias;
    }

    public final int getColumn_Type() {  // �J�����̂r�p�k�^(java.sql.Types)
        return Column_Type;
    }

    public final String getColumn_Type_Ora() {  // �J��������(ORACLE DATA_TYPE)
        return Column_Type_Ora;
    }

    public final int getCond_Type() {//���o�����i��r���Z�q�j
        return Cond_Type;
    }
    public final String getCond_Value1() { //���o�����l from
        return Cond_Value1;
    }

    public final String getCond_Value2() { //���o�����l to
        return Cond_Value2;
    }

    public final boolean getDisplay_Flg() {//�\���敪
        return Display_Flg;
    }

    public final int getSort_Type() {//�\�[�g��ށi1:�����A2:�~���j
        return Sort_Type;
    }

    public final int getSort_No() {  //�\�[�g�L�[��
        return Sort_No;
    }


    // *********  �l�ݒ�p���\�b�h*********************

    public final void  setTable_Name(String w_value) {           // �e�[�u����
        Table_Name = w_value;
    }

    public final void setTable_Name_Comment(String w_value) {// �e�[�u�����R�����g
        Table_Name_Comment = w_value; 
    }

    public final void  setTable_Name_Alias(String w_value) {// �e�[�u�����ʖ�
        Table_Name_Alias = w_value;
    }

    public final void setColumn_Name(String w_value) {// �J������
        Column_Name = w_value; 
    }

    public final void setColumn_Name_Comment(String w_value) {//�J�������R�����g
        Column_Name_Comment = w_value;
    }

    public final void setColumn_Type(int w_value) {  // �J�����̂r�p�k�^(java.sql.Types)
        Column_Type = w_value;
    }

    public final void setColumn_Type_Ora(String w_value) {  // �J��������(ORACLE DATA_TYPE)
        Column_Type_Ora = w_value;
    }

    public final void setColumn_Asflag(int w_value) {  // �e�[�u�����w��敪
        Column_Asflag = w_value;
    }

    public final void setCond_Type(int w_value) {//���o�����i��r���Z�q�j
        Cond_Type = w_value; 
    }
    public final void setCond_Value1(String w_value) { //���o�����l from
        Cond_Value1 = w_value;;
    }

    public final void setCond_Value2(String w_value) { //���o�����l to
        Cond_Value2 = w_value;
    }

    public final void setDisplay_Flg(boolean w_value) {//�\���敪
        Display_Flg = w_value;
    }

    public final void setSort_Type(int w_value) {//�\�[�g��ށi1:�����A2:�~���j
        Sort_Type = w_value;
    }

    public final void setSort_No(int w_value) {  //�\�[�g�L�[��
        Sort_No = w_value;
    }

	//�����Ŏw�肳�ꂽColumnInfo�̏����A���C���X�^���X�Ɋi�[����B(���R�s�[�p���\�b�h�j
	public final void setColumnInfo(AZ0040ColumnInfo i_info) {
    	Table_Name          = i_info.Table_Name;           // �e�[�u����
    	Table_Name_Comment  = i_info.Table_Name_Comment;   // �e�[�u�����R�����g
        Table_Name_Alias    = i_info.Table_Name_Alias;     // �e�[�u�����ʖ�
        Column_Name         = i_info.Column_Name;          // �J������
        Column_Name_Comment = i_info.Column_Name_Comment;  // �J�������R�����g
        Column_Name_Alias   = i_info.Column_Name_Alias;    // �J�������ʖ�
        Column_Type         = i_info.Column_Type;          // �J�����̂r�p�k�^(java.sql.Types)
        Column_Type_Ora     = i_info.Column_Type_Ora;      // �J�����̑���(ORACLE DATA_TYPE)
        Column_Asflag       = i_info.Column_Asflag;		// �e�[�u�����w��敪
        Cond_Type           = i_info.Cond_Type;            //���o�����i��r���Z�q�j
        Cond_Value1         = i_info.Cond_Value1;          //���o�����l from
        Cond_Value2         = i_info.Cond_Value2;          //���o�����l to
        Display_Flg         = i_info.Display_Flg;          //�\���敪
        Sort_Type           = i_info.Sort_Type;            //�\�[�g��ށi1:�����A2:�~���j
        Sort_No             = i_info.Sort_No;              //�\�[�g�L�[��
	}

    //-------------------------------------------------------------------
    //  ����J���\�b�h
    //-------------------------------------------------------------------

    /**
      * �l�ێ��p�̈�̃N���A�B
      */
    private void clear() {
	    Table_Name = null;           // �e�[�u����
    	Table_Name_Comment = null;   // �e�[�u�����R�����g
    	Table_Name_Alias = null;   // �e�[�u�����ʖ�
    	Column_Name = null;          // �J������
    	Column_Name_Comment = null;  // �J�������R�����g
    	Column_Name_Alias = null;   // �J�������ʖ�
    	Column_Type = 0;          // �J�����̂r�p�k�^(java.sql.Types)
        Column_Type_Ora = null;      // �J�����̑���(ORACLE DATA_TYPE)
        Column_Asflag = C_AS_NONE;			// �e�[�u�����w��敪
    	Cond_Type = 0;            //���o�����i��r���Z�q�j
    	Cond_Value1 = null;          //���o�����l from
    	Cond_Value2 = null;          //���o�����l to
    	Display_Flg = true;          //�\���敪
    	Sort_Type = 0;            //�\�[�g��ށi1:�����A2:�~���j
    	Sort_No = 0;              //�\�[�g�L�[��
    }

}

