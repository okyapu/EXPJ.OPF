//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0050ColumnData �N���X
 * �t�@�C���E�N���X����
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.6 $ $Date: 2012/05/30 08:00:32 $
 *
 */
//-----------------------------------------------------------------------------
package com.nec.jp.orteus.metamorBase.AZ0050;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.commons.lang.StringUtils;

/**
 * SQL��̓N���X
 * @author  Y.Hashimoto
 * @version 1.00
 * @see 
 */
public class AZ0050ColumnData
              implements AZ0050Const 
{
// ******* Package���J�ϐ� *********


    // --------SQL���  -------------
    List Column_infos = null;		// �J������񃊃X�g

    //������index�̏ꏊ�Ƀe�[�u�����ƕʖ����i�[����B
    List Table_Names = null;	    // �e�[�u�������X�g
    List Table_Name_Aliass = null;	// �e�[�u�����ʖ����X�g
    List Table_Name_Comments = null;	// �e�[�u�����ʖ����X�g
    List Join_Infos = null;		    // �e�[�u������������(table.col = table.col �̌`���j
	public List JoinList = null;			// �e�[�u�����������iWhereInfo�N���X�̃��X�g)

// ******* ����J�萔�E�ϐ� *********

    //���������̊e�������ӁA�E�ӂɕ����������
	protected class WhereInfo {
		public String left_TableName = "";	    //�e�[�u����
		public String left_TableNameAlias = ""; //�e�[�u���ʖ�
		public String left_ColumnName = "";     //�J������
		public String right_TableName = "";     //�e�[�u����
		public String right_TableNameAlias = "";//�e�[�u���ʖ�
		public String right_ColumnName = "";    //�J������
		public String condition; //�������� ((C_JOIN_EQUAL/C_JOIN_LEFT/C_JOIN_RIGHT)
	}

    //����������ʂ̕\��/��\���w��
    int [] Disp_flg = null;

// ********  �R���X�g���N�^ **************
    /**
      * 
      * �R���X�g���N�^<br>
      *
      * @param xx
      * @see #xxxxx
      */
    AZ0050ColumnData() {
    	Column_infos = new ArrayList();		 // �J������񃊃X�g
 		Table_Names = new ArrayList();		 // �e�[�u�������X�g
     	Table_Name_Aliass = new ArrayList(); // �e�[�u�����ʖ����X�g
		Table_Name_Comments = new ArrayList();//�e�[�u���R�����g��񃊃X�g
     	Join_Infos = new ArrayList();        // �e�[�u������������
		JoinList = new ArrayList();
    }

//------------------------------------------------------------------
//  ���J�֐�
//------------------------------------------------------------------
    // *********  �l�擾�p���\�b�h*********************
    public final List  getColumnInfos() { // �J������񃊃X�g
        return Column_infos;
    }

    public final AZ0050ColumnInfo  getColumnInfo(int Idx) { // �J�������N���X
        return (AZ0050ColumnInfo)Column_infos.get(Idx);
    }

    public final List  getTableNames() { // �e�[�u����񃊃X�g
        return Table_Names;
    }

    public final List  getTableComments() { // �e�[�u���R�����g��񃊃X�g
        return Table_Name_Comments;
    }


     public final List  getJoinInfos() { // �e�[�u����������
        return Join_Infos;
    }
//------------------------------------------------------------------
//  �p�b�P�[�W���J�֐�
//------------------------------------------------------------------
    void  setTableNames(List list) { // �e�[�u����񃊃X�g
        Table_Names.clear();
        Table_Names.addAll(list);
    }
    void  setTableNameComments(List list) { // �e�[�u����񃊃X�g
        Table_Name_Comments.clear();
        Table_Name_Comments.addAll(list);
    }

	/* �w�肳�ꂽ�e�[�u�����i�܂��̓e�[�u���ʖ��j�A�J�������i�܂��̓J�����ʖ�)
	 *�@������ColumnInfo�N���X���擾����B
	 * @param TableName �e�[�u�����A�܂��̓e�[�u���ʖ�
	 * @param ColumnName �J�������A�܂��̓J�����ʖ�)
	 * @param ColumnCount �J�����̍s��
	 *
	*/
	AZ0050ColumnInfo getColumnInfo(String TableName, String ColumnName, int ColumnCount) {
		AZ0050ColumnInfo w_info = null;
		int checkCount = 0;
		for (Iterator itr=Column_infos.iterator(); itr.hasNext();) {
			AZ0050ColumnInfo col_info = (AZ0050ColumnInfo)itr.next();
			if(TableName != null) {
				if((TableName.equals(col_info.Table_Name) ||
					TableName.equals(col_info.Table_Name_Alias)) &&
			  	 (ColumnName.equals(col_info.Column_Name) ||
				  ColumnName.equals(col_info.Column_Name_Alias))) {
					checkCount++;
					if (checkCount == ColumnCount) {
						w_info = col_info;
						return w_info;
					}
				}
			} else {
				// �J�������A�Ⴕ���̓G���A�X���ƈ�v
				if(ColumnName.equals(col_info.Column_Name) ||
				   ColumnName.equals(col_info.Column_Name_Alias)) {
					checkCount++;
					if (checkCount == ColumnCount) {
						w_info = col_info;
						return w_info;
					}
				}
			}
		}
		return w_info;
	}

	/*
	 * SQL���𕪐͂������ʁi�e�[�u�������������j��
     * Join_Infos���X�g�A�����JoinList���X�g
	 * (WhereInfo�N���X�̃��X�g)�ɂP�s�ǉ�����B
	 * AZ0050SQLEdit.Analize()����setColumnInfoWhere()�o�R�ŌĂяo�����B
	 *
	 */
	boolean setJoinList(String[] comps, String str_where) {
        //****  comps�̌`��  ********************
	        //[0] ��������/��r�����̋敪 C_JOIN/C_COMP
            //[1] ����(�e�[�u����)
            //[2] ����(�J������)
            //[3] ��r���Z�q
            //[4] �E��(�e�[�u���� or ��r�l)
            //[5] �E��(�J������ or ��r�l)
		//*********************************************
		int idx;
		int idx_t = -1;
		//----- JoinList �̐ݒ� -------------
		WhereInfo w_whereinfo = new WhereInfo();
		  //��������
		w_whereinfo.condition       = C_JOIN_EQUAL;	//default

		  //���� �e�[�u����
		idx_t = -1;
		idx_t = Table_Name_Aliass.indexOf(comps[1]);
		if( idx_t > -1) {	//�G���A�X���w�肾�����ꍇ
			w_whereinfo.left_TableNameAlias  = comps[1];
			w_whereinfo.left_TableName = Table_Names.get(idx_t).toString();
		} else {			//�G���A�X���w�肳��Ă��Ȃ��ꍇ
			idx_t = Table_Names.indexOf(comps[1]);
			if(idx_t > -1) {
				w_whereinfo.left_TableNameAlias  = "";
				w_whereinfo.left_TableName = comps[1];
			} else {
				return false;
			}
		}
		 //���Ӂ@�J������
		idx = comps[2].indexOf("(+)");
		if(idx == -1) {
			w_whereinfo.left_ColumnName = comps[2];
		} else {
			w_whereinfo.left_ColumnName = comps[2].substring(0,idx);
			w_whereinfo.condition       = C_RIGHT_JOIN;
		}
		  //�E�� �e�[�u����
		idx_t = -1;
		idx_t = Table_Name_Aliass.indexOf(comps[4]);
		if( idx_t > -1) {	//�G���A�X���w�肾�����ꍇ
			w_whereinfo.right_TableNameAlias  = comps[4];
			w_whereinfo.right_TableName = Table_Names.get(idx_t).toString();
		} else {			//�G���A�X���w�肳��Ă��Ȃ��ꍇ
			idx_t = Table_Names.indexOf(comps[4]);
			if(idx_t > -1) {
				w_whereinfo.right_TableNameAlias  = "";
				w_whereinfo.right_TableName = comps[4];
			} else {
				return false;
			}
		}
		//�E�Ӂ@�J������
		idx = comps[5].indexOf("(+)");
		if(idx == -1) {
			w_whereinfo.right_ColumnName = comps[5];
		} else {
			w_whereinfo.right_ColumnName = comps[5].substring(0,idx);
			w_whereinfo.condition       = C_LEFT_JOIN;
		}
		// JoinList�֒ǉ� --------------
		JoinList.add(w_whereinfo);

		//----- Join_Infos�@�̐ݒ� --------------
		Join_Infos.add(str_where);
		
		return true;
	}

	/*
	 * ��ʂŎw�肳�ꂽ�e�[�u��������������
     * Join_Infos���X�g�A�����JoinList���X�g�Ɋi�[����
	 * AZ0050SQLEdit.setJoinInfo() ����Ăяo�����
	 * @param InputInfo  ��ʓ��͏���ێ��������X�g
     *  InputInfo(i)�̊e�v�f��String[]�B�f�[�^�`���͉��L�̂Ƃ���B
     *            String[0] ���ӂ̃e�[�u����
     *            String[1] ���ӂ̃e�[�u�����ʖ�
     *            String[2] ���ӂ̃J������
     *            String[3] ��������(C_JOIN_EQUAL/C_JOIN_LEFT/C_JOIN_RIGHT)
     *            String[4] �E�ӂ̃e�[�u����
     *            String[5] �E�ӂ̃e�[�u�����ʖ�
     *            String[6] �E�ӂ̃J������
	 */
	boolean setJoinInfo(List InputInfo) {
		String[] w_comps = null;
		StringBuffer w_str = null;
		//���̏����N���A����
		Join_Infos.clear();
		JoinList.clear();

		//�ŐV�̌������������Z�b�g����B
		for(Iterator itr=InputInfo.iterator(); itr.hasNext();) {
			//----- JoinList �̐ݒ� -----------------------------------
			w_comps = (String[])itr.next();
			WhereInfo w_whereinfo = new WhereInfo();
			w_whereinfo.left_TableName       = w_comps[0];
			w_whereinfo.left_TableNameAlias  = w_comps[1];
			w_whereinfo.left_ColumnName      = w_comps[2];
			w_whereinfo.condition            = w_comps[3];
			w_whereinfo.right_TableName      = w_comps[4];
			w_whereinfo.right_TableNameAlias = w_comps[5];
			w_whereinfo.right_ColumnName     = w_comps[6];
			JoinList.add(w_whereinfo);

			//---- Join_Infos�@�̐ݒ� ----------------------------------
			w_str = new StringBuffer("");
			//���ӑg�ݗ���
			if(w_comps[1] != null) {	//�ʖ��w��̏ꍇ�A�ʖ����Z�b�g
				w_str.append(w_comps[1]);
			} else {
				w_str.append(w_comps[0]);
			}
			w_str.append(".").append( w_comps[2]);	//���ӑg�ݗ���
			if (w_comps[3].equals(C_RIGHT_JOIN)) {	//�E���O�������̏ꍇ(�E�ӂ��ׂāj
				w_str.append("(+)");
			}				
			w_str.append(" = ");
			//�E�ӑg�ݗ���
			if(w_comps[5] != null) {	//�ʖ��w��̏ꍇ�A�ʖ����Z�b�g
				w_str.append(w_comps[5]);
			} else {
				w_str.append(w_comps[4]);
			}
			w_str.append(".").append( w_comps[6]);
			if (w_comps[3].equals(C_LEFT_JOIN)) {  //�����O�������̏ꍇ(���ӂ��ׂāj
				w_str.append("(+)");
			}
			Join_Infos.add(w_str.toString());
		}
		return true;
	}


	/*-----------------------------------------------------------
    // ��ʏ�őI�����ꂽ�e�[�u���ɑ΂��āA�e�[�u���ʖ������蓖�Ă�B
    //    �����K��:   ����e�[�u�������̒ʔԂ�U��  
    //                (ex)  A,A,B,C,B,D  --> A1,A2,B1,C1,B2,D1  
    //
	/------------------------------------------------------------*/
	final void renewTableAlias(List tableList)
	{
		// �V�����e�[�u�����X�g�ɑΉ��������̃G���A�X���X�g���쐬
		List TempAliasList = new ArrayList(tableList.size());
		
		// ���G���A�X���X�g�̏�����
		for(int i=0; i<tableList.size(); i++)
		{
			// �����G���A�X����̏ꍇ
			if(Table_Name_Aliass.size() != 0 && i<Table_Name_Aliass.size())
			{
				TempAliasList.add((String)Table_Name_Aliass.get(i));
			}
			else
			{
				TempAliasList.add("");
			}
		}
		
		// �e�[�u���ɑ΂���ݒ�G���A�X�����J�E���g����Map
		HashMap hashAlias = new HashMap();
		
		for(int i=0; i<tableList.size(); i++)
		{
			int count=0;
			
			// �G���A�X��null��Map��Ƀf�[�^�����݂��Ȃ��ꍇ
			if(((String)TempAliasList.get(i)).equals("") && hashAlias.get(tableList.get(i)) == null)
			{
				// 
				hashAlias.put(tableList.get(i), new Integer(1));

				TempAliasList.remove(i);
				TempAliasList.add(i, (String)tableList.get(i) + "1");
			}
			
			// �G���A�X��null��Map��Ƀf�[�^������ꍇ
			else if(((String)TempAliasList.get(i)).equals("") && hashAlias.get(tableList.get(i)) != null)
			{
				// �G���A�X�w�茏���̎擾
				count = ((Integer)hashAlias.get(tableList.get(i))).intValue();
				
				// �G���A�X�̌����ɂP���������l��ݒ肷��
				hashAlias.remove(tableList.get(i));
				hashAlias.put(tableList.get(i), new Integer(count + 1));
				
				TempAliasList.remove(i);
				count++;
				TempAliasList.add(i, (String)tableList.get(i) + Integer.toString(count));
			}
			
			// �G���A�X�Ƀf�[�^������Map�Ƀf�[�^���Ȃ��ꍇ
			else if(((String)TempAliasList.get(i)).equals("") == false && hashAlias.get(tableList.get(i)) == null)
			{
				// �G���A�X�ɐݒ肵�Ă��鐔�����擾����
				//String val = StringUtils.stripStart((String)TempAliasList.get(i), (String)tableList.get(i));
				String val = StringUtils.replace(((String)TempAliasList.get(i)),((String)tableList.get(i)),"");
				count = Integer.parseInt(val);
				
				// �擾�����l��Map�֐ݒ肷��
				hashAlias.put(tableList.get(i), new Integer(count));
			}
			
			// �G���A�X,Map�㋤�Ƀf�[�^������ꍇ
			else if(((String)TempAliasList.get(i)).equals("") == false && hashAlias.get(tableList.get(i)) != null)
			{
				// �G���A�X�ɐݒ肵�Ă��鐔�����擾����
				//String val = StringUtils.stripStart((String)TempAliasList.get(i), (String)tableList.get(i));
				String val = StringUtils.replace(((String)TempAliasList.get(i)),((String)tableList.get(i)),"");
				count = Integer.parseInt(val);

				// Map��ɐݒ肵�Ă���l���r����
				if(((Integer)hashAlias.get(tableList.get(i))).intValue() < count)
				{
					hashAlias.remove(tableList.get(i));
					hashAlias.put(tableList.get(i), new Integer(count));
				}
			}
		}
		
		Table_Name_Aliass.clear();
		Table_Name_Aliass.addAll(TempAliasList);
	}

}

