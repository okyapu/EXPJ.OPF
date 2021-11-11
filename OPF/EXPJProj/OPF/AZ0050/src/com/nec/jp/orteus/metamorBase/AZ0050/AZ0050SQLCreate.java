//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0050SQLCreat �N���X
 * �t�@�C���E�N���X����
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.7 $ $Date: 2015/04/07 11:59:00 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0050;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.expj.systemlog.SystemLog;
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.text.MessageFormat;

/**
 * SQL����g���Ă�
 */
public class AZ0050SQLCreate implements AZ0050Const
{
	//--------------------------------------------------------------------------
	// �\�z

	public final static int C_DISPLAY = 0;
	public final static int C_WRITE = 1;
	public int ColumnNameAliasCount = 0;
	private String w_format = "";

	/** �R���X�g���N�^ */
	public AZ0050SQLCreate(SystemLog sysLog, String User_ID)
	{
		_sysLog = sysLog;
		_User_ID = User_ID;
	}

	//--------------------------------------------------------------------------
	// ����

	//---------------------------------------
	//  ���J�֐�
	//---------------------------------------
	
	/**
	 * @param conn DB�Ƃ̃R�l�N�V����
	 * @param w_cdata AZ0050ColumnData ��ʐݒ���
	 * @param display_flg �r�p�k������쐬���� (0:�\���p/1:�c�a�o�^�p) 
	 * @return true:���� / false:���s
	 */
	public final void Create(IDbConnection conn,AZ0050ColumnData w_cdata,int display_flg) 
                            throws SQLException
	{
			int cnt = 0;
			String sSQL     = "";
			String sSELECT  = "";
			String sFROM    = "";
			String sWHERE   = "";
			String sORDERBY = "";
			String val      = "";
			String tmpWHERE = "";
			AZ0050ColumnInfo col_info;

			if(display_flg == C_DISPLAY) {
				//SYSTEM_PARAMETER�e�[�u������A���t�\���`���̎擾
 				PrivateConfig prconf = new PrivateConfig(conn);
				w_format = prconf.getString("DISPLAY_DATE_FORMAT");
			}

			//------------------------------------------------------------------------------
			// SELECT��̑g����
			//------------------------------------------------------------------------------
			for(cnt=0; cnt<w_cdata.Column_infos.size(); cnt++)
			{
				col_info = (AZ0050ColumnInfo)w_cdata.Column_infos.get(cnt);
				String w_colName = "";
				String checkFlg = "";
				//��������r�p�k������́A�\���p or �o�^�p���𔻒肷��
				if(display_flg == C_DISPLAY) {
					// �\��/��\���t���O�`�F�b�N
					if(col_info.Display_Flg == true)
					{
						for (int j=0; j < cnt; j++){
							if(col_info.getColumn_Name().equals(((AZ0050ColumnInfo)w_cdata.Column_infos.get(j)).getColumn_Name())){
								checkFlg="1";
								break;
							}else{
								checkFlg="0";
							}
						}
						w_colName =  this.getColumnName(col_info,checkFlg);

						val += w_colName + ",";
					}
				} else {
					w_colName =  this.getColumnNameAlias(col_info);
					val += w_colName + ",";
				}
			}
			// �Ō�ɃJ���}������ꍇ�́A�폜��SELECT��𐶐�����
			if(val.lastIndexOf(",") != -1)
			{
				if((val.lastIndexOf(",")+1) == val.length())
				{
					// �Ō�̃J���}���폜
					sSELECT = val.substring(0, val.lastIndexOf(",")).trim();
				}
				else
				{
					sSELECT = val.trim();
				}
			}

			//------------------------------------------------------------------------------
			// FROM��̑g����
			//------------------------------------------------------------------------------
			val = "";
			for(cnt=0; cnt<w_cdata.Table_Names.size(); cnt++)
			{
				// �G���A�X�̎w�肪���邩�`�F�b�N
				if(w_cdata.Table_Name_Aliass.get(cnt).equals(""))
				{
					// �G���A�X�w��Ȃ�
					val += w_cdata.Table_Names.get(cnt) + ",";
				}
				else
				{
					// �G���A�X�w�肠��
					val += w_cdata.Table_Names.get(cnt) + " " + w_cdata.Table_Name_Aliass.get(cnt) + ",";
				}
				// �Ō�ɃJ���}������ꍇ�́A�폜��FROM��𐶐�����
				if(val.lastIndexOf(",") != -1)
				{
					if((val.lastIndexOf(",")+1) == val.length())
					{
						// �Ō�̃J���}���폜
						sFROM = val.substring(0, val.lastIndexOf(",")).trim();
					}
					else
					{
						sFROM = val.trim();
					}
				}
			}
			
			//------------------------------------------------------------------------------
			// WHERE��̑g����
			//------------------------------------------------------------------------------
			// ��r�������̐���
			val = "";
			for(cnt=0; cnt<w_cdata.Column_infos.size(); cnt++)
			{
				col_info = (AZ0050ColumnInfo)w_cdata.Column_infos.get(cnt);
				
				// �e�J�����̔�r���Z�q�𔻒�
				String wBuffer = this.MakesWhere(col_info);

				// null�`�F�b�N
				if(wBuffer != null)
				{
					val += wBuffer + " AND ";
				}
			}
			// �Ō��" AND "������ꍇ�́A�폜��WHERE��𐶐�����
			if(val.equals("") != true)
			{
				if((val.lastIndexOf(" AND ")+5) == val.length())
				{
					// �Ō��" AND "���폜
					tmpWHERE = val.substring(0, val.lastIndexOf(" AND ")).trim();
				}
				else
				{
					tmpWHERE = val.trim();
				}
			}

			// �e�[�u�������������̐���
			val = "";
			for(cnt=0; cnt<w_cdata.Join_Infos.size(); cnt++)
			{
				if(cnt == (w_cdata.Join_Infos.size()-1))
				{
					val += w_cdata.Join_Infos.get(cnt);
				}
				else
				{
					val += w_cdata.Join_Infos.get(cnt) + " AND ";
				}
			}

			// WHERE��̐���
			if(val.equals("") != true && tmpWHERE.equals("") != true)
			{
				sWHERE = val + " AND " + tmpWHERE;
			}
			else if(val.equals("") != true && tmpWHERE.equals("") == true)
			{
				sWHERE = val;
			}
			else if(val.equals("") == true && tmpWHERE.equals("") != true)
			{
				sWHERE = tmpWHERE;
			}

			//------------------------------------------------------------------------------
			// ORDER BY��̑g����
			//------------------------------------------------------------------------------
			HashMap ha = new HashMap();
			List sortList = new ArrayList();
			
			for(cnt=0; cnt<w_cdata.Column_infos.size(); cnt++)
			{
				
				col_info = (AZ0050ColumnInfo)w_cdata.Column_infos.get(cnt);
				
				// �\�[�g����J�������𔻒�
				if(col_info.Sort_No != 0)
				{
					ha.put(new Integer(col_info.Sort_No), new Integer(cnt));
				}
			}
			
			TreeMap tm = new TreeMap(ha);
			Iterator itr = tm.entrySet().iterator();

			// �\�[�g�����X�g�̍쐬
			while(itr.hasNext())
			{
				Map.Entry Entry = (Map.Entry)itr.next();
				sortList.add(Entry.getValue());
			}
				
			val = "";
			for(cnt=0; cnt<sortList.size(); cnt++)
			{
				int index = ((Integer)sortList.get(cnt)).intValue();
				String SortTyp = "";
				
				col_info = (AZ0050ColumnInfo)w_cdata.Column_infos.get(index);
				
				// ���~���`�F�b�N
				if(col_info.Sort_Type == C_ASC)
				{
					SortTyp = " ASC";
				}
				else
				{
					SortTyp = " DESC";
				}
				
				val += this.getColumnName(col_info,"notochar") + SortTyp + ",";
			}
			
			// �Ō�ɃJ���}������ꍇ�́A�폜��ORDER BY��𐶐�����
			if(val.lastIndexOf(",") != -1)
			{
				if((val.lastIndexOf(",")+1) == val.length())
				{
					// �Ō�̃J���}���폜
					sORDERBY = val.substring(0, val.lastIndexOf(",")).trim();
				}
				else
				{
					sORDERBY = val.trim();
				}
			}
			
			//------------------------------------------------------------------------------
			// SQL�p�^�[���̌����ASQL���쐬
			//------------------------------------------------------------------------------
			if(sWHERE.equals("") != true && sORDERBY.equals("") != true)
			{
				sSQL = "SELECT {0} FROM {1} WHERE {2} ORDER BY {3}";
				String[] sSqlArgs = {sSELECT, sFROM, sWHERE, sORDERBY};
				sql = MessageFormat.format(sSQL, sSqlArgs);
			}
			else if(sWHERE.equals("") != true && sORDERBY.equals("") == true)
			{
				sSQL = "SELECT {0} FROM {1} WHERE {2}";
				String[] sSqlArgs = {sSELECT, sFROM, sWHERE};
				sql = MessageFormat.format(sSQL, sSqlArgs);
			}
			else if(sWHERE.equals("") == true && sORDERBY.equals("") != true)
			{
				sSQL = "SELECT {0} FROM {1} ORDER BY {2}";
				String[] sSqlArgs = {sSELECT, sFROM, sORDERBY};
				sql = MessageFormat.format(sSQL, sSqlArgs);
			}
			else
			{
				sSQL = "SELECT {0} FROM {1}";
				String[] sSqlArgs = {sSELECT, sFROM};
				sql = MessageFormat.format(sSQL, sSqlArgs);
			}
	}
	
	/**
	 * WHERE�̏������\�z����<br>
	 * <br>
	 * @param info ��J�����̏��
	 * @return WHERE��
	 */
	private String MakesWhere(AZ0050ColumnInfo info)
	{
		String buf = null;

		switch(info.Cond_Type)
		{
		case C_NE:	// !=
		case C_LT:	// <=
		case C_GT:	// >=
		case C_EQ:	// =
		case C_LS:	// >
		case C_GR:	// <
			
			buf = this.getColumnNameWhere(info,"notochar") + " " + info.Cond_Value1;
			break;

			// like
		case C_LIKE:
			buf = this.getColumnNameWhere(info,"like") + " " + info.Cond_Value1;
			break;
			
			// between
		case C_RANG:
			// �e�[�u�����w��敪�̔���
			buf = this.getColumnNameWhere(info,"notochar") + " " + 
                  info.Cond_Value1 + " AND " + info.Cond_Value2;
			break;
			
			// in
		case C_IN:
			buf = this.getColumnNameWhere(info,"notochar") + " (" + info.Cond_Value1 + ")";
			break;
			
		case C_ISNULL:	// is null
		case C_NOTNULL:	// is not null
			buf = this.getColumnNameWhere(info,"notochar");
			break;
			
		default:
			break;
		}
		
		return buf;
	}
	
	/**
	 * SQL�����擾����<br>
	 * <br>
	 * @return �\�z����SQL
	 */
	public String getSQL()
	{
		return sql;
	}
	

	//---------------------------------------
	//  ����J�֐�
	//---------------------------------------
	private String getColumnName(AZ0050ColumnInfo i_info,String checkAlias) {
		String w_tableName = "";
		String w_columnName = "";
		if(i_info.Column_Asflag == C_AS_ALIAS)	{
			// �G���A�X�w��
			w_tableName = i_info.Table_Name_Alias;
		} else {
			// �e�[�u�����w��
			w_tableName = i_info.Table_Name;
		}
		w_columnName = w_tableName + "." + i_info.Column_Name;
		// ���t�^�̏ꍇ�A�t�H�[�}�b�g�]��
		if (i_info.Column_Type_Ora.equals(C_DATE)) {
			if (!("notochar").equals(checkAlias)) {
				w_columnName = "TO_CHAR(" + w_columnName + ",'" + w_format + "')";
			}
		}
		if("1".equals(checkAlias)){
			w_columnName = w_columnName  +" AS " +i_info.Column_Name + ColumnNameAliasCount++;
		}
		return w_columnName;	
	}
	
	/**
	 * �J���������擾�A�ʖ����l������
	 * @param i_info ��J�����̏��
	 * @return �J������
	 */
	private String getColumnNameAlias(AZ0050ColumnInfo i_info) {
		String w_tableName = "";
		String w_columnName = "";
		if(i_info.Column_Asflag == C_AS_ALIAS)	{
			// �G���A�X�w��
			w_tableName = i_info.Table_Name_Alias;
		} else {
			// �e�[�u�����w��
			w_tableName = i_info.Table_Name;
		}
		w_columnName = w_tableName + "." + i_info.Column_Name;
		// ��\���ꍇ�A�ʖ��uundisplayed�v��ǉ��B
		if (!i_info.Display_Flg) {
			w_columnName = w_columnName + " AS undisplayed";
		}
		return w_columnName;	
	}

	private String getColumnNameWhere(AZ0050ColumnInfo i_info,String strAlias) {
		String w_columnName = this.getColumnName(i_info,strAlias) + 
                              " " + COMP_STR_DISP[i_info.Cond_Type];
		return w_columnName;
	}

	private String sql = null;
	private SystemLog _sysLog = null;
	private String _User_ID = null;
}