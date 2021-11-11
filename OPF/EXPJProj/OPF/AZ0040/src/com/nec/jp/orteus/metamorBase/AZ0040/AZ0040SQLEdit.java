//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040SQLEdit �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.4 $ $Date: 2015/04/07 11:58:22 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0040;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import com.nec.jp.orteus.expj.systemlog.SystemLog;

/**
 * SQL�����e���ڂ��Ƃɕ������ĉ�͂��s��
 */
public class AZ0040SQLEdit 
              implements AZ0040Const
{
	//--------------------------------------------------------------------------
	// �\�z

	/** �R���X�g���N�^ */

	public AZ0040SQLEdit(SystemLog i_syslog, String i_userid){
	    //SystemLog�p
		_sysLog = i_syslog;
    	_UserId = i_userid;

		clear();
	}

	public AZ0040SQLEdit(){
		clear();
	}

	//--------------------------------------------------------------------------
	// ����
	
	//******************************************/
	//                  ���J�֐�                /
	//******************************************/

	/**
	 * @param conn DB�Ƃ̃R�l�N�V����
	 * @param str_sql ��͂���SQL��
	 * @return true:���� / false:���s
	 */
	public final boolean Analize(IDbConnection conn, String str_sql ) 
                                                 throws SQLException
	{
		try
		{
			int cnt = 0;
			List parts_list = new ArrayList();
			
			sql = str_sql.trim();

			//SQL����"SELECT"�Ŏn�܂邩�ǂ����`�F�b�N
			if(!sql.startsWith("SELECT") ) {
				return false;
			}

			//*****  SQL���̊e�p�[�c�����o���B*****************************
			
			// SELECT����擾����
			_SELECT_VALUE = this.PatternSplit(_SELECT);
			
			// ALL, DISTINCT, UNIQUE���`�F�b�N����
			if(_SELECT_VALUE.indexOf("ALL ") != -1 ||
	           _SELECT_VALUE.indexOf("DISTINCT ") != -1 ||
			   _SELECT_VALUE.indexOf("UNIQUE ") != -1)
			{
				_sysLog.finest_d("It does not correspond to SELECT ALL, DISTINCT, and UNIQUE",_UserId);
				return false;
			}

			// ���⍇������
			if(_temp_sql.indexOf("(SELECT ") == -1 && _temp_sql.indexOf(" SELECT ") == -1)
			{
				// FROM����擾����
				_FROM_VALUE = this.PatternSplit(_FROM);
			}
			else
			{
				_sysLog.finest_d("Analize:It does not correspond to a subinquiry",_UserId);
				return false;
			}

			// WHERE����擾����
			if(sql.indexOf(" WHERE ") != -1 && _sql_flg == 0)
			{
				_WHERE_VALUE = this.PatternSplit(_WHERE);
				if(_WHERE_VALUE == null)
				{
					_sysLog.finest_d("Analize:There is no description to a WHERE phrase",_UserId);
					return false;
				}
			}

			// GROPU BY����擾����
			if(sql.indexOf(" GROUP BY ") != -1 && _sql_flg == 0)
			{
				_GROUP_BY_VALUE = this.PatternSplit(_GROUP);
				if(_GROUP_BY_VALUE == null)
				{
					return false;
				}
				else
				{
					_sysLog.finest_d("Analize:It does not correspond to a GROUP BY phrase",_UserId);
					return false;
				}
			}
			
			// HAVING����擾����
			if(_GROUP_BY_VALUE != null && sql.indexOf(" HAVING ") != -1)
			{
				_HAVING_VALUE = this.PatternSplit(_HAVING);
				if(_HAVING_VALUE == null)
				{
					_sysLog.finest_d("Analize:There is no description to a HAVING phrase",_UserId);
					return false;
				}
			}

			// ORDER BY����擾����
			if(_sql_flg == 0)
			{
				_ORDER_BY_VALUE = this.PatternSplit(_ORDER);
				if(_ORDER_BY_VALUE == null)
				{
					_sysLog.finest_d("Analize:There is no description to an ORDER BY phrase",_UserId);
					return false;
				}
			}

			//*****  SQL���̊e�p�[�c����͂���B*****************************
			
			// FROM��̉�͂��s���B*************************************
	
			// FROM����J���}�ŋ�؂�ו�������
			parts_list.clear();
			parts_list = PartsSplit(_FROM_VALUE);
			
			for(cnt=0; cnt<parts_list.size(); cnt++)
			{
				this.frTableSet((String)parts_list.get(cnt));
			}

			//�g�p���Ă���e�[�u���̉�͂��I�������̂ŁA
			// �e�e�[�u���̃R�����g�A�S�J�������A�S�J�����R�����g�����擾����
			if(!_dbutil.load(conn,_w_cdata.Table_Names)) {
				return false;
			}

			//�e�[�u���R�����g��񃊃X�g��ݒ肷��B
			for (Iterator itr=_w_cdata.Table_Names.iterator(); itr.hasNext();) {
				String w_tbname = itr.next().toString();
				_w_cdata.Table_Name_Comments.add(_dbutil.getTableComment(w_tbname));
			}

			// SELECT��̉�͂��s���B*************************************
			// �A�X�^���X�N�w��̏ꍇ
			if(_SELECT_VALUE.equals("*"))
			{
				setAllColumns();
			}
			else
			{
				// SELECT�������ɍו�������
				parts_list.clear();
				parts_list = PartsSplit(_SELECT_VALUE);
				for(cnt=0; cnt<parts_list.size(); cnt++)
				{
					// �J������񃊃X�g�ɐݒ肷��
					this.seColumnSet((String)parts_list.get(cnt));
				}
					
			}
				
			// �e�[�u���R�����g�A�J�����R�����g�A�J����������ݒ肷��
			for(cnt=0; cnt<_w_cdata.Column_infos.size(); cnt++)
			{
				AZ0040ColumnInfo col_info = (AZ0040ColumnInfo)_w_cdata.Column_infos.get(cnt);
				this.setColumnInfo(col_info);
			}

			// WHERE��̉�͂��s���B*************************************
			if(!_WHERE_VALUE.equals(""))
			{
				this.analizeWhere(_WHERE_VALUE);
				
			}

			// ORDER BY�傪����ꍇ�͕��͂��s�� *************************
			if(_ORDER_BY_VALUE != null)
			{
				// FROM����J���}�ŋ�؂�ו�������
				parts_list.clear();
				parts_list = PartsSplit(_ORDER_BY_VALUE);

				// ORDER BY�唻��p���X�g�̍쐬
				List oderList = this.setOrderByList(parts_list);
				
				// Package���J�ϐ���ORDER BY���ݒ肷��
				this.setColumnInfoOrderBy(oderList);
			}		
			return true;
		} catch(SQLException e){
			throw e;
		} catch(Exception e2){
			_sysLog.finest_d("Analise error : " + e2.getMessage(), _UserId);
			return false;
		}
	}
	


//***************************************************
//      �p�b�P�[�W���J�֐�
//***************************************************
	/**
	 * ��͂���SQL���̌���(ColumnData�N���X)���擾����
	 * @return AZ0040ColumnData  ��͂���SQL�f�[�^
	 */
	public AZ0040ColumnData getColumnData()
	{
		return _w_cdata;
	}
	
	/**
	 * ��͂���SQL���g�p���Ă���e�[�u���̃J�������N���X
	 * (DBUtil�N���X)���擾����
	 * @return AZ0040DBUtil ��͂���SQL�f�[�^
	 */
	public final AZ0040DBUtil getDBUtil() {
		return _dbutil;
	}

	//---------------------------------------------------------------------------
	//    ColumnData,ColumnInfo���̍č\�z�p���\�b�h
	//---------------------------------------------------------------------------

	/* ��ʓ��͏������ƂɁA�e�[�u�����(ColumnData)���č\�z����B
	 * ���̃��\�b�h�𔭍s����ƁA������ColumnData�N���X���̃e�[�u�����
     * ������������B
     * @param tlist �e�[�u���I����ʂŎw�肳�ꂽ�e�[�u�������X�g<-- struct���
     * @param clist �e�[�u���I����ʂŎw�肳�ꂽ�e�[�u���ʖ����X�g<-- struct���
     * @return true/false
	 *
	 * �O������Ƃ��āA�e���X�g�̍s���͓����ł��邱�ƁB
     *
     */
	protected final boolean setTables(IDbConnection conn,List tlist,List clist) 
                                    throws SQLException
 	{
		//�e�[�u���ʖ����Ė������邵�āAColumnData�N���X�Ƀe�[�u���ʖ�����ݒ肵�Ȃ���
		_w_cdata.renewTableAlias(tlist);
		//ColumnData�N���X�Ƀe�[�u������ݒ肵�Ȃ����B
		_w_cdata.setTableNames(tlist);
		//ColumnData�N���X�Ƀe�[�u���R�����g����ݒ肵�Ȃ����B
		_w_cdata.setTableNameComments(clist);

		//�e�[�u�����(DBUtil�N���X)���č쐬����B
		if(!_dbutil.load(conn,tlist)) {
			return false;
		} 
		return true;
	}
	/*
	 * ��ʂŎw�肳�ꂽ�e�[�u������������(Struct)��
     * ColumnData�N���X�̌����������(Join_Infos�AJoinList)�Ɋi�[����B
	 *  Control�N���X����Ăяo�����B
	 * @param left_tlist   ��ʓ��͏�񃊃X�g(���Ӄe�[�u����) <-- struct
	 * @param left_alist   ��ʓ��͏�񃊃X�g(���Ӄe�[�u���ʖ�) <-- struct
	 * @param left_clist   ��ʓ��͏�񃊃X�g(���ӃJ������) <-- struct
	 * @param right_tlist  ��ʓ��͏�񃊃X�g(�E�Ӄe�[�u����) <-- struct
	 * @param right_alist  ��ʓ��͏�񃊃X�g(�E�Ӄe�[�u����) <-- struct
	 * @param right_clist  ��ʓ��͏�񃊃X�g(�E�Ӄe�[�u����) <-- struct
	 * @param cond_list    ��ʓ��͏�񃊃X�g
     *                      (��������(C_JOIN_EQUAL/C_JOIN_LEFT/C_JOIN_RIGHT)) <-- struct
	 * �O������Ƃ��āA�e���X�g�̍s���͓����ł��邱�ƁB
     *
	 */
	protected final boolean setJoinInfo(List left_tlist,  List left_alist, 
                                        List left_clist,  List right_tlist,
										List right_alist, List right_clist,
                                        List cond_list) {

		String[] w_input = null;
				 //�f�[�^�i�[�`��
                 //String[0] ���ӂ̃e�[�u����
                 //String[1] ���ӂ̃e�[�u�����ʖ�
                 //String[2] ���ӂ̃J������
                 //String[3] ��������(C_JOIN_EQUAL/C_JOIN_LEFT/C_JOIN_RIGHT)
                 //String[4] �E�ӂ̃e�[�u����
                 //String[5] �E�ӂ̃e�[�u�����ʖ�
                 //String[6] �E�ӂ̃J������
		
		ArrayList w_InputList = new ArrayList(left_tlist.size());
		// 
		for (int i=0; i<left_tlist.size(); i++) {
			w_input = new String[7];
			/***** ���ӏ�� *****/
			w_input[0] = left_tlist.get(i).toString();
			w_input[1] = left_alist.get(i).toString();
			w_input[2] = left_clist.get(i).toString();
			/***** �������� *****/
			w_input[3] = cond_list.get(i).toString();
			/***** �E�ӏ�� *****/
			w_input[4] = right_tlist.get(i).toString();
			w_input[5] = right_alist.get(i).toString();
			w_input[6] = right_clist.get(i).toString();

			w_InputList.add(w_input);
		}
		boolean w_ret = _w_cdata.setJoinInfo(w_InputList);
		return w_ret;
	}

	/* ��ʓ��͏������ƂɁA���ڏ��(ColumnInfo)���č\�z����B
	 * ���̃��\�b�h�𔭍s����ƁA������ColumnData�N���X����ColumnInfo���
     * ������������B
     * @param l_table ���ڑI����ʂŎw�肳�ꂽ���ڏ��(�e�[�u�������X�g�j<-- struct���
     * @param l_talias ���ڑI����ʂŎw�肳�ꂽ���ڏ��(�e�[�u���ʖ����X�g�j<-- struct���
     * @param l_column ���ڑI����ʂŎw�肳�ꂽ���ڏ��i�J���������X�g�j<-- struct���
     * @return true/false
	 *
	 * �O������Ƃ��āA�e���X�g�̍s���͓����ł��邱�ƁB
     *
     */
	protected final boolean renewColumnInfos(List l_table, List l_talias, List l_column)
	{
		String w_tableName = null;
		String w_tableAlias = null;
		String w_columnName = null;

		//�ŐV�̍��ڏ����i�[���郊�X�g�𐶐�		
		List new_INFOS = new ArrayList(l_table.size());
		
		int count = 1;
		String check_tableAlias = null;
		String check_columnName = null;

		for(int i=0; i<l_table.size(); i++) {
			//�V����ColumnInfo ����
			AZ0040ColumnInfo new_info = new AZ0040ColumnInfo();

			w_tableName = l_table.get(i).toString();
			w_tableAlias = l_talias.get(i).toString();
			w_columnName = l_column.get(i).toString();
			
			count = 1;
			// �����J�����̍s��
			for (int j = 0; j < i; j++) {
				check_tableAlias = l_talias.get(j).toString();
				check_columnName = l_column.get(j).toString();
				if (w_tableAlias != null && check_tableAlias != null) {
					if (w_tableAlias.equals(check_tableAlias) && w_columnName.equals(check_columnName)) {
						count++;
					}
				} else if (w_tableAlias == null && check_tableAlias == null) {
					if (w_columnName.equals(check_columnName)) {
						count++;
					} 
				}
			}

			//���̍��ڏ�񃊃X�g�ɂ��邩�`�F�b�N
			AZ0040ColumnInfo org_info = _w_cdata.getColumnInfo(w_tableAlias, w_columnName, count);

			if(org_info != null) {
				new_info.setColumnInfo(org_info);
			} else {
				// �e�[�u����
				new_info.setTable_Name(w_tableName);
				// �e�[�u�����ʖ�		
				new_info.setTable_Name_Alias(w_tableAlias);	
				//�e�[�u�����w��敪
				new_info.setColumn_Asflag(C_AS_ALIAS);
			    // �J������
				new_info.setColumn_Name(w_columnName);		
				// �e�[�u�����R�����g
			    new_info.setTable_Name_Comment(_dbutil.getTableComment(w_tableName));
				// �J�������R�����g
   				new_info.setColumn_Name_Comment(
                                 _dbutil.getColumnComment(w_tableName,w_columnName));
				//�J�����̑���(ORACLE DATA_TYPE)
			    new_info.setColumn_Type_Ora(_dbutil.getColumnType(w_tableName,w_columnName));
			}
			new_INFOS.add(new_info);
		}

		//�Â����ڏ����N���A
		_w_cdata.Column_infos.clear();
		
		//�V���������Z�b�g���Ȃ����B
		for(Iterator itr=new_INFOS.iterator(); itr.hasNext();) {
			_w_cdata.Column_infos.add((AZ0040ColumnInfo)itr.next());
		}
		new_INFOS.clear();
		return true;
	}

//***************************************************
//      ����J�֐�
//***************************************************
	
	/**
	 * SQL���̊e�������擾����<br>
	 * <br>
	 * @param SelectNum �e�����p�^�[��
	 * @return ������ �擾������SQL�����̊e���� �擾�ł��Ȃ��ꍇ��null
	 */
	private String PatternSplit(int SelectNum)
	{
		String token = null;
		
		switch(SelectNum)
		{
			// SELECT
			case _SELECT:
				// SELECT���o����
				index_first = 6;
				token = this.GetPattern(" FROM ");
			break;
			
			// FROM
			case _FROM:
				// FROM���o����
				token = this.GetPattern(" WHERE ");
				// WHERE���Ȃ��ꍇ
				if(token == null)
				{
					token = this.GetPattern(" GROUP BY ");
				}
				// GROUP BY���Ȃ��ꍇ
				if(token == null)
				{
					token = this.GetPattern(" ORDER BY ");
				}
				// ORDER BY���Ȃ��ꍇ
				if(_sql_flg == 0 && token == null)
				{
					token = sql.substring(index_first, sql.length()).trim();
					_sql_flg = 1;
				}
			break;
			
			// WHERE
			case _WHERE:
				// WHERE���o����
				token = this.GetPattern(" GROUP BY ");
				// GROUP BY���Ȃ��ꍇ
				if(token == null)
				{
					token = this.GetPattern(" ORDER BY ");
				}
				if(token == null)
				{
					token = this.GetPattern(" HAVING ");
				}
				// ORDER BY���Ȃ��ꍇ
				if(_sql_flg == 0 && token == null)
				{
					token = sql.substring(index_first, sql.length()).trim();
					_sql_flg = 1;
				}
			break;
			
			// GROPU BY
			case _GROUP:
				// GROUP BY���o����
				token = this.GetPattern(" HAVING ");
				// HAVING���Ȃ��ꍇ
				if(token == null)
				{
					token = this.GetPattern(" ORDER BY ");
				}
				// ORDER BY���Ȃ��ꍇ
				if(_sql_flg == 0 && token == null)
				{
					token = sql.substring(index_first, sql.length()).trim();
					_sql_flg = 1;
				}
			break;
			
			// HAVING
			case _HAVING:
				// HAVING���o����
				token = this.GetPattern(" ORDER BY ");
				// ORDER BY���Ȃ��ꍇ
				if(_sql_flg == 0 && token == null)
				{
					token = sql.substring(index_first, sql.length()).trim();
					_sql_flg = 1;
				}
			break;
			
			// ORDER BY
			case _ORDER:
				// ORDER BY���o����
				if(_sql_flg == 0)
				{
					token = sql.substring(index_first, sql.length()).trim();
					_sql_flg = 1;
				}
			break;
		}
		
		return token;
	}
	
	/** �eSQL���̎擾 */
	/**
	 * SQL���̊e���ڕ������Ɏ擾���s��<br>
	 * @param target �������镶����
	 * @return pattern ��������������
	 */
	private String GetPattern(String target)
	{
		String pattern = "";
		
		// �w�肳�ꂽ���������񂪍ŏ��ɏo������ʒu���擾
		index_end = sql.indexOf(target);
		if(index_end == -1)
		{
			return null;
		}

		// �擾�������eSQL�����X�y�[�X���폜���Ď擾
		pattern = sql.substring(index_first, index_end).trim();
		index_first = index_end + (target.length()-1);
		
		_temp_sql = sql.substring(index_end + (target.length()-1)).trim();

		return pattern;
	}
	
			
	/**
	 * �J���}�ŋ�؂肵�ו������s��<br>
	 * @param value SQL���𕪉������e����
	 * @return temp_list �J���}�ŕ����������X�g(String)
	 */
	private List PartsSplit(String value)
	{
		int size = 0;
		int i = 0;
		
		List temp_list = new ArrayList();
		
		// �J���}�ŕ�������
		StringTokenizer st = new StringTokenizer(value, ",");
		size = st.countTokens();
		
		String token[] = new String[size];
		for (i=0; i<size; i++)
		{
			temp_list.add(st.nextToken().trim());
		}
		
		return temp_list;
	}
	
	/**
	 * �X�y�[�X�ŕ������s���A<br>
	 * �e�[�u�����A�e�[�u���ʖ����X�g�ɐݒ肷��<br>
	 * @param val �J���}��؂��FROM��
	 * @return �Ȃ�
	 */
	private void frTableSet(String val)
	{
		// �X�y�[�X�ŕ���
		StringTokenizer Alias_st = new StringTokenizer(val, " ");
		int Alias_tk_size = Alias_st.countTokens();
		String token[] = new String[Alias_tk_size];

		for (int i=0; i<Alias_tk_size; i++)
		{
			token[i] = Alias_st.nextToken().trim();
		}

		// �e�[�u�����̂�
		if(Alias_tk_size == 1)
		{
			_w_cdata.Table_Names.add(token[0]);
			_w_cdata.Table_Name_Aliass.add("");
		}
		else if(Alias_tk_size == 2)
		{
			// Ailas�ݒ�̏ꍇ
			_w_cdata.Table_Names.add(token[0]);
			_w_cdata.Table_Name_Aliass.add(token[1]);
		}
	}

			
	/**
	 * �G���A�X�w��A�e�[�u���w�肩�̃`�F�b�N���s��<br>
	 * Package���J�ϐ��ɐݒ���s��<br>
	 * @param val �J���}�ŋ�؂�ꂽSELECT����
	 * @return �Ȃ�
	 */
	private void seColumnSet(String val)
	{
		int index = 0;
		String AsValue[] = new String[2];
		
		AZ0040ColumnInfo w_cinfo = new AZ0040ColumnInfo();
		
		// alias�w��`�F�b�N
		index = val.indexOf(" AS ");
		if(index != -1)
		{
			AsValue[0] = val.substring(0, index).trim();
			AsValue[1] = val.substring((index+3), val.length()).trim();
			// �e�[�u�����w��`�F�b�N
			index = AsValue[0].indexOf(".");
			if(index != -1)
			{
				// TYPE [�e�[�u����.�J������ AS �G���A�X��]
				w_cinfo.Table_Name = AsValue[0].substring(0, index).trim();
				w_cinfo.Column_Name = AsValue[0].substring((index+1), AsValue[0].length()).trim();
				w_cinfo.Column_Name_Alias = AsValue[1];
			}
			else
			{
				// TYPE [�J������ AS �G���A�X��]
				w_cinfo.Column_Name = AsValue[0].substring((index+1), AsValue[0].length()).trim();
				w_cinfo.Column_Name_Alias = AsValue[1];
			}
			
			// �\���t���O
			if ( "undisplayed".equals(AsValue[1]) )
			{
				w_cinfo.Display_Flg = false;
			} 
			else
			{
				w_cinfo.Display_Flg = true;
			}
		}
		else
		{
			// �e�[�u�����w��`�F�b�N
			index = val.indexOf(".");
			if(index != -1)
			{
				// TYPE [�e�[�u����.�J������]
				w_cinfo.Table_Name = val.substring(0, index).trim();
				w_cinfo.Column_Name = val.substring((index+1), val.length()).trim();
				
				// �J��������"*"�w��̏ꍇ
				if(w_cinfo.Column_Name.equals("*"))
				{
					this.setAllColumns(w_cinfo.Table_Name);
					return ;
				}
			}
			else
			{
				// TYPE [�J������]
				w_cinfo.Column_Name = val.trim();
			}
			
		}
		
		_w_cdata.Column_infos.add(w_cinfo);
	}

	/**
	 * �����Ŏw�肳�ꂽ�e�[�u���̑S�J���������擾��<br>
	 * ���ڏ��N���X(ColumnInfo�N���X)�ɐݒ���s��<br>
	 * @param table �e�[�u����
	 * @return �Ȃ�
	 */
	private void setAllColumns(String table)
	{
		//�Y������J�������N���X(DBInfo)�����o��
		AZ0040DBInfo dbinfo = _dbutil.getDBInfo(table);
		
		// �J�������ݒ�
		for(Iterator cols=dbinfo.getColumnNames().iterator(); cols.hasNext();)
		{
			//���ڏ��N���X�̐���
			AZ0040ColumnInfo w_cinfo = new AZ0040ColumnInfo();
			
			// �e�[�u����,�J�����������ڏ��N���X(ColumnInfo)�ɐݒ�
			w_cinfo.Table_Name  = dbinfo.getTablename();
			w_cinfo.Column_Name = cols.next().toString();
			
			//ColumnData�N���X�ɒǉ�
			_w_cdata.Column_infos.add(w_cinfo);
		}
	}
		
	/**
	 * �S�Ẵe�[�u���̃J���������擾��<br>
	 * Package���J�ϐ��ɐݒ���s��<br>
	 * @return �Ȃ�
	 */
	private void setAllColumns()
	{
		String w_tableName = null;
		for(Iterator itr=_w_cdata.Table_Names.iterator();itr.hasNext();) {
			w_tableName = itr.next().toString();
			this.setAllColumns(w_tableName);
		}
	}
			
	/**
	 * �e�J�����̏���ݒ肷��
	 * @param col_info �J�����̏��
	 * @return �Ȃ�
	 */
	private void setColumnInfo(AZ0040ColumnInfo col_info)
	{
		int i = 0;
		String buffer = null;

		// �e�[�u������null���ǂ�������
		if(col_info.Table_Name != null)
		{
			// �e�[�u�����w��敪�Ƀe�[�u�����w���ݒ�
			col_info.Column_Asflag = C_AS_TB;
			
			// �ݒ肵�Ă���e�[�u�������G���A�X�����肷��
			int w_idx = -1;
			w_idx = _w_cdata.Table_Name_Aliass.indexOf(col_info.Table_Name);
				// �G���A�X�w��̏ꍇ
			if(w_idx > -1) {
					// ���݂̃e�[�u�������e�[�u���ʖ��ɐݒ�
					col_info.Table_Name_Alias = col_info.Table_Name;
					// �e�[�u�������X�g���e�[�u������ݒ�
					col_info.Table_Name = (String)_w_cdata.Table_Names.get(w_idx);
					// �e�[�u�����w��敪�Ƀe�[�u���ʖ��w���ݒ�
					col_info.Column_Asflag = C_AS_ALIAS;
			}
		}
		else
		{
			// �e�[�u�����w��敪�Ƀe�[�u�����w��Ȃ���ݒ�
			col_info.Column_Asflag = C_AS_NONE;
			
			// �e�[�u�����w�肪�Ȃ�  
            //  -->  �S�e�[�u�����ŏ��Ɉ�v����e�[�u������ݒ肷��
			for(i=0; i<_w_cdata.Table_Names.size(); i++)
			{
				buffer = _dbutil.getColumnComment((String)_w_cdata.Table_Names.get(i), col_info.Column_Name);
				// �Y������DBInfo��񂪌��������ꍇ
				if(buffer != null)
				{
					// �e�[�u�����A�e�[�u���ʖ���ݒ肷��
					col_info.Table_Name = (String)_w_cdata.Table_Names.get(i);
					col_info.Table_Name_Alias = (String)_w_cdata.Table_Name_Aliass.get(i);
					break;
				}
			}
		}

		// �e�[�u���R�����g��ݒ�
		col_info.Table_Name_Comment = _dbutil.getTableComment(col_info.Table_Name);

		// �J�����R�����g��ݒ�
		col_info.Column_Name_Comment = _dbutil.getColumnComment(col_info.Table_Name, col_info.Column_Name);

		// �J����������ݒ�
		col_info.Column_Type_Ora = _dbutil.getColumnType(col_info.Table_Name, col_info.Column_Name);

	}

	/**
	 * �e�J�����̃\�[�g���A��ނ�ݒ肷��
	 * @param valList �\�[�g�L�[�̏��
	 * @return �Ȃ�
	 */
	private void setColumnInfoOrderBy(List valList)
	{
		String table = null;
		String column = null;
		AZ0040ColumnInfo col_info = null;
		
		String checkTable = null;
		String checkColumn = null;
		String[] checkValues = new String[2];
		int count = 1;

		for(int i=0; i<valList.size(); i++)
		{
			String[] values = new String[2];
			values = (String[])valList.get(i);
			// values �̌`��
			//  values[0] �J������ Table.Column  or Column (Alias����)
			//  values[1] �\�[�g��� ASC or DSESC

			if(values[0].indexOf(".") != -1) {
				// �e�[�u�������擾
				table = values[0].substring(0, values[0].indexOf(".")).trim();
				// �J���������擾
				column = values[0].substring(values[0].indexOf(".")+1).trim();
			} else {
				column = values[0];
			}
			
			count = 1;
			// �����J�����̍s��
			for (int j = 0; j < i; j++) {
				checkValues = (String[]) valList.get(j);
				if(checkValues[0].indexOf(".") != -1) {
					// �e�[�u�������擾
					checkTable = checkValues[0].substring(0, checkValues[0].indexOf(".")).trim();
					// �J���������擾
					checkColumn = checkValues[0].substring(checkValues[0].indexOf(".")+1).trim();
				} else {
					checkColumn = checkValues[0];
				}
				if (table != null && checkTable != null) {
					if (table.equals(checkTable) && column.equals(checkColumn)) {
						count++;
					}
				} else if (table == null && checkTable == null) {
					if (column.equals(checkColumn)) {
						count++;
					}
				}
			}

			//�\�[�g�L�[�w�肳��Ă���J�����ɊY������ColumnInfo���擾����B
			col_info = _w_cdata.getColumnInfo(table,column,count);
			// �\�[�g����ݒ�
			col_info.Sort_No = (i+1);
			// �\�[�g��ނ�ݒ�
			col_info.Sort_Type = Integer.parseInt(values[1]);
		}
	}
			
	/**
	 * �󔒂ŕ������A�\�[�g�̎�ނƏ�����ݒ肷��
	 * @param valList �\�[�g�L�[�̏��
	 * @return temp_list �\�[�g���̃��X�g�iString�z��j
	 */
	private List setOrderByList(List valList)
	{
		int cnt = 0;
		List temp_list = new ArrayList();
		

		for(int i=0; i<valList.size(); i++)
		{
			String token[] = new String[2];
			
			// �X�y�[�X�ŕ���
			StringTokenizer st = new StringTokenizer((String)valList.get(i), " ");
			int size =st.countTokens();

			// ASC,DESC�w�肠��
			if(size == 2)
			{
				for (cnt=0; cnt<size; cnt++)
				{
					token[cnt] = st.nextToken().trim();
				}
				// �����A�~���`�F�b�N
				if(token[1].equals("DESC"))
				{
					token[1] = "2";
				}
				else
				{
					token[1] = "1";
				}
			}
			else
			{
				for (cnt=0; cnt<size; cnt++)
				{
					token[cnt] = st.nextToken().trim();
				}
				token[1] = "1";
			}
			// ���X�g�ɃZ�b�g����
			temp_list.add(token);
		}
		
		return temp_list;
	}

    /**
     * comment SQL(WHERE��)����͂��A���ʂ�AZ0040ColumnData��
     *         �i�[����B
     * @param 
     */
    private void analizeWhere(String i_str)  {

    	String w_cond = null;
    	String[] w_comps = new String[6];
        List w_where_infos = new ArrayList();  //��͌���

        // (AND) �ŋ�؂�
        List w_cond_list = where_separate(i_str);
        for (Iterator itr = w_cond_list.iterator(); itr.hasNext();) {
            w_cond = (String)itr.next();
            //BETWEEN�傪����ꍇ�̏���
            if(w_cond.indexOf("BETWEEN") > 0) {
                w_cond += " AND ";              // between��ɑ΂���and
                w_cond += (String)itr.next();   // �͈͎w��(To)
			}
            // ��؂��������߂̉�́E����
            w_comps = condition_separate(w_cond);

            w_where_infos.add(w_comps);
        }

		// �J�������N���X(ColumnData)��WHERE�����ݒ肷��
		this.setColumnInfoWhere(w_where_infos,w_cond_list);
    }

    /**
    *  (AND)�� ��؂��������߂���́E����
    *   <<�z�肷��`��>>
    *   (1) �e�[�u����������
    *     Table.column = Table.column
    *   (2)���o����
    *     Table.column [��r���Z�q] value
    *       
    */

    private static String[] condition_separate(String i_str) {     

        // �������샏�[�N
        int    w_index = 0;
        int    w_index2 = 0;
        String[]  w_info = new String[6];  //�ԋp��� (format�͉��L)
                                           //[0] C_JOIN/C_COMP
                                           //[1] ����(�e�[�u����)
                                           //[2] ����(�J������)
                                           //[3] ��r���Z�q
                                           //[4] �E��(�e�[�u���� or ��r�l)
                                           //[5] �E��(�J������ or ��r�l)
        // �`�F�b�N
        String w_left = null;
        String w_cond_right = null;
        String w_right = null;
        StringTokenizer st = null; 

        // ��r���Z�q�ŋ�؂�B
        w_index = StringUtils.indexOfAny(i_str, COMP_STR);
	    if (w_index == -1) {
			//�Ȃɂ����Ȃ��B
	    } else {
            // ���ӂ����o���B
            w_left = i_str.substring(0,w_index).trim();
            // ���Z�q + �E�ӂ����o��
            w_cond_right = i_str.substring(w_index);
            // ���Z�q + �E�ӂ𕪂���
            for ( int i=0; i<COMP_STR.length; i++) {
                //���Z�q�͂Ȃɂ��H
                if (w_cond_right.startsWith(COMP_STR[i])) {
                    w_info[3] = COMP_STR[i].trim();
                    w_index2 = w_index + COMP_STR[i].length();
                    break;
                }
            }
            w_right = i_str.substring(w_index2);
      	}

        //���ӂ��e�[�u����.�J������ �ɕ����� w_info[1],[2] �ɃZ�b�g
        st = new StringTokenizer(w_left,".");
        if ( st.countTokens() == 1) {
            w_info[1] = null;    //�e�[�u����
            w_info[2] = st.nextToken().trim(); //�J������
            int w_info_tochar = w_info[2].indexOf("TO_CHAR(");
            if(w_info_tochar>=0){
            	int w_info_tochar2 = w_info[2].indexOf(",");
            	w_info[2] = w_info[2].substring(w_info_tochar+8, w_info_tochar2);
            }
        } else {
        	w_info[1] = st.nextToken().trim(); //�e�[�u����
    		w_info[2] = st.nextToken().trim(); //�J������
        	int w_info_tochar = w_info[1].indexOf("TO_CHAR(");
        	int w_info_tochar2 = w_info[2].indexOf(",");
        	if (w_info_tochar>=0 && w_info_tochar2>=0) {
        		w_info[1] = w_info[1].substring(w_info_tochar+8);
        		w_info[2] = w_info[2].substring(0,w_info_tochar2);
        	}
        }
        
		//��r���Z�q�̎�ʂ��Ƃ� �E�ӂ̕�������

        // IS NULL, IS NOT NULL
        if (w_info[3].equals("IS NULL") || w_info[3].equals("IS NOT NULL") ) {
	            w_info[0] = C_COMP;
				w_info[4] = null;
				w_info[5] = null;
		// BETWEEN
		} else if (w_info[3].equals("BETWEEN")) {
			int w_position = w_right.indexOf(" AND ");
			String w_from = w_right.substring(0, w_position);
			String w_to   = w_right.substring(w_position+5);
	        w_info[0] = C_COMP;
			w_info[4] = w_from.trim();
			w_info[5] = w_to.trim();
		// IN
		} else if (w_info[3].equals("IN")) {
			int w_first = w_right.indexOf("(");
			int w_last =  w_right.lastIndexOf(")"); 
	        w_info[0] = C_COMP;
			w_info[4] = null;
			w_info[5] = w_right.substring(w_first+1,w_last).trim();
		// LIKE
		} else if (w_info[3].equals("LIKE")) {
	        w_info[0] = C_COMP;
			w_info[4] = null;
			w_info[5] = w_right.trim();
		// �e�[�u����������(=) or ��r����(=,!= ,<,>,<=,>=)
		} else {
	        //�E�ӂ͐��l���H(�E�ӓ��̃h�b�g�������_���ǂ���������)
	        if(NumberUtils.isNumber(w_right)) {;
	            w_info[0] = C_COMP;
				w_info[4] = null;
				w_info[5] = w_right.trim();
	        } else {
	            //�E��(�e�[�u����.�J������) �𕪊��B�܂��͔�r�l�����o���B
	            st = new StringTokenizer(w_right,".");
	            if ( st.countTokens() == 1) {
	                w_info[0] = C_COMP;
	                w_info[4] = null;
	                w_info[5] = st.nextToken().trim(); //��r�l
	            } else {
                    if (w_info[3].equals("=")) { 
		                w_info[0] = C_JOIN;
					} else {
		                w_info[0] = C_COMP;
					}
	                w_info[4] = st.nextToken().trim(); //�e�[�u����
	                w_info[5] = st.nextToken().trim(); //�J������
	            }
	        }
		}

        return w_info;
	}
    /**
    *
    *  WHERE�����́E��������
    *   <<�z�肷��`��>>
    *   ���� AND ���� AND ����......
    *
    */
    private static ArrayList where_separate(String i_str) {     
        /** SQL where��̕���������؂蕶���� */
        String[] SEPARATOR_STR = {" AND "};

        // �������샏�[�N
        String w_string        = null;
        int    w_index = 0;
        int    w_index2 = 0;
        int    w_start = 0;
        ArrayList   w_cond_list = new ArrayList();

        // �`�F�b�N
        String w_separator = null;
        String w_condition = null;

        w_start = 0;
        while(true) {
            //����������������o���B
	        w_string = i_str.substring(w_start);

            // (" AND ") �ŋ�؂��Ă��邩�ǂ����𒲂ׂ�B
            w_index = StringUtils.indexOfAny(w_string, SEPARATOR_STR);
	        if (w_index == -1) {
                w_cond_list.add(w_string.trim());
	            break;
	        } else {
                // (" AND ") �ŋ�؂��Ă�������̍��������o���B
                w_condition = w_string.substring(0,w_index);
                // ���������X�g�ɑޔ�
                w_cond_list.add(w_condition.trim());
	            w_start += w_index;
                
                // ��؂���������i�E���j�̍��[����(AND)�����o��
                w_string = i_str.substring(w_start);
                //
                w_index2 = w_string.indexOf(" ",1);
                w_separator = w_string.substring(0,w_index2).trim();
                w_start += (w_index2 + 1);
	        }
      	}
        return w_cond_list;
	}

	/**
	 * �e�J�����̌���������AZ0040ColumnData�ɐݒ肷��
	 * @param valList �����������(������������)
	 * @param condList �����������(�����������O)
	 * @return �Ȃ�
	 */
	private void setColumnInfoWhere(List valList,List condList)
	{
		String[] w_comps = new String[6];
        AZ0040ColumnInfo col_info = null;
		
        //****  valList[i]�̌`��  ********************
	        //[0] ��������/��r�����̋敪 C_JOIN/C_COMP
            //[1] ����(�e�[�u����)
            //[2] ����(�J������)
            //[3] ��r���Z�q
            //[4] �E��(�e�[�u���� or ��r�l)
            //[5] �E��(�J������ or ��r�l)
		//*********************************************
		_w_cdata.JoinList.clear();
		_w_cdata.Join_Infos.clear();
		
		String[] check_comps = new String[6];
		int count = 1;

		for(int i=0; i<valList.size(); i++)
		{
			w_comps = (String[])valList.get(i);
            if (w_comps[0].equals(C_JOIN)) { 		//���������������ꍇ
				_w_cdata.setJoinList(w_comps,(String)condList.get(i));
			} else {						    //��r�����������ꍇ
				count = 1;
				// �����J�����̍s��
				for (int j = 0; j < i; j++) {
					check_comps = (String[])valList.get(j);
					if (!check_comps[0].equals(C_JOIN)) {
						if (w_comps[1] != null && check_comps[1] != null){
							if (w_comps[1].equals(check_comps[1]) && w_comps[2].equals(check_comps[2])) {
								count++;
							}
						} else if (w_comps[1] == null && check_comps[1] == null) {
							if (w_comps[2].equals(check_comps[2])) {
								count++;
							}
						}
					}
				}

				//WHERE��Ŏw�肳��Ă���J�����ɊY������ColumnInfo���擾����B
				col_info = _w_cdata.getColumnInfo(w_comps[1],w_comps[2], count);
				//��r���Z�q�̐ݒ�
				col_info.Cond_Type = getCondTypeNo(w_comps[3]);

				//�����l�̐ݒ� 
                if (w_comps[3].equals("BETWEEN")) {
					col_info.Cond_Value1 = w_comps[4]; // from
					col_info.Cond_Value2 = w_comps[5]; // to
				} else {
					col_info.Cond_Value1 = w_comps[5]; // from�̂�
				}
			}
		}
	}

    /**
    *  @param  ��r������(String)
    *  @return ��r�����ԍ�(��ʏ�R���{�{�b�N�X��̔ԍ�)
    *
    *
    */
    protected int getCondTypeNo(String w_cond) {
        int w_no = 0;
        for (int i=0; i< COMP_STR_DISP.length; i++) {
        	if (w_cond.equals(COMP_STR_DISP[i])) {
				w_no = i;
                break;
			}
    	}
        return w_no;
    }

	/** �N���A */
	private void clear()
	{ 
		_w_cdata = new AZ0040ColumnData();
		_dbutil = new AZ0040DBUtil(_sysLog,_UserId);
	}
    


    //***********  �萔�E�ϐ���`  ******/

	//Syslog�p
    SystemLog _sysLog = null;
    String _UserId = null;

	private AZ0040ColumnData _w_cdata;		
	private AZ0040DBUtil _dbutil;			

	private int index_first = 0;			
	private int index_end   = 0;			
	private int _sql_flg = 0;				
	private String sql = "";				
	private String _temp_sql = "";			
	private String _SELECT_VALUE   = "";	
	private String _FROM_VALUE     = "";	
	private String _WHERE_VALUE    = "";	
	private String _GROUP_BY_VALUE = "";	
	private String _HAVING_VALUE   = "";	
	private String _ORDER_BY_VALUE = "";	
	private final int _SELECT = 1;
	private final int _FROM   = 2;
	private final int _WHERE  = 3;
	private final int _GROUP  = 4;
	private final int _HAVING = 5;
	private final int _ORDER  = 6;

    //WHERE�����̎��(���������A��r����)
    private static final String C_JOIN = "JOIN"; //�e�[�u����������
    private static final String C_COMP = "COMP"; //��r����



}