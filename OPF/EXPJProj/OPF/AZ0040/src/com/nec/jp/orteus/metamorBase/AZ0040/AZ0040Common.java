//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040SQLEdit �N���X
 * �t�@�C���E�N���X����
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2017/01/09 08:54:38 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0040;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.apache.commons.lang.StringUtils;

/**
 * AZ0040���ʃ��W���[��
 */
public class AZ0040Common
{
	
	public static final String DATE_FORMAT = "YYYY/MM/DD HH24:MI:SS";
	
	//--------------------------------------------------------------------------
	// ����
	
	/**
	 * �N�G���g�p�\�e�[�u�����擾����
	 *
	 * @param conn DB�Ƃ̃R�l�N�V����
	 * @return �N�G���g�p�\�e�[�u��
	 */
	public final static ArrayList GetUsefulTable(IDbConnection conn) throws SQLException
	{
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList Table = new ArrayList();
		
		String sql = "select TABLE_NAME  from user_tables";

		// SQL������
		stmt = (conn.getConn()).prepareStatement(sql);
		
		// SQL�̎��s
		rs = stmt.executeQuery();
		
		while(rs.next())
		{
			Table.add(rs.getString(1));
		}
		
		// �v���y�A�h�X�e�[�g�����g�����
		stmt.close();
		
		// ���U���g�Z�b�g�����
		rs.close();
		
		// ���ʂ̕ԋp
		return Table;
	}
	
	/**
	 * �t���[�œ��͂��ꂽSQL�����Ɏg�p�s�����񂪂Ȃ���<br>
	 * �`�F�b�N���s��
	 *
	 * @param strSql �t���[���͂ŋL�q���ꂽSQL
	 * @return treu/false
	 */
	public final static boolean checkFreeSqlStr(String strSql)
	{
		int size = 0;
		int i = 0;
		List temp_list = new ArrayList();
		
		// �X�y�[�X�ŕ�������
		StringTokenizer st = new StringTokenizer(strSql, " ");
		size = st.countTokens();
		for (i=0; i<size; i++)
		{
			temp_list.add(st.nextToken().trim());
		}
		
		// SQL���Ɏg�p�s�̕����񂪂��邩�`�F�b�N
		for(i=0; i<temp_list.size(); i++)
		{
			String buffer = (String)temp_list.get(i);

			if(buffer.compareToIgnoreCase("UPDATE") == 0 ||
			   buffer.compareToIgnoreCase("INSERT") == 0 ||
			   buffer.compareToIgnoreCase("DELETE") == 0   )
			{
				return false;
			}
		}

		return true;
	}

    /**
    *   VARCHAR�^���ڂ�SQL�������A�l�ɕϊ����܂��B
    *  ('' ����菜��)
    *
    *
    *
    */
	public final static String UnescapeSQL(String i_str) {

		//�J���}��؂�
        String[] w_str = StringUtils.split(i_str, ",");
		List w_str_o = new ArrayList(w_str.length);
		for (int i=0; i<w_str.length; i++) {
			//�e�l�́A''���폜(��ԊO����''�̃y�A����菜��)
			w_str_o.add(StringUtils.strip(w_str[i], "'")); 
		}
		Iterator itr = w_str_o.iterator();
		String w_unescape = StringUtils.join(itr, ",");
		return w_unescape;
	}

    /**
    *   VARCHAR�^���ڂ̒l��SQL�����ɕϊ����܂��B
    *  ('' ������)
    *
    *
    *
    */
	public final static String EscapeSQL(String i_str) {

		//�J���}��؂�
        String[] w_str = StringUtils.split(i_str, ",");

		List w_str_o = new ArrayList(w_str.length);

		for (int i=0; i<w_str.length; i++) {
			//�e�l�̍ŏ��ƍŌ�ɁA''������
			w_str_o.add("'" + w_str[i] + "'"); 
		}
        Iterator itr = w_str_o.iterator();
		String w_escape = StringUtils.join(itr, ",");
		return w_escape;
	}
	
    /**
    *   DATE�^���ڂ�SQL�������A�l�ɕϊ����܂��B
    *  (TO_DATE ����菜��)
    *
    *
    *
    */
	public final static String UnescapeSQL_Date(String i_str) {

		String val;
		String[] w_str = null;
		//�J���}��؂�
		// ���ԊǗ��ꍇ
		if(i_str.indexOf("))") != -1) {
			w_str = StringUtils.split(i_str, "))");
		} else {
			w_str = StringUtils.split(i_str, ")");
		}
		List w_str_o = new ArrayList(w_str.length);
		for (int i=0; i<w_str.length; i++) {
			val = StringUtils.stripStart(w_str[i], ",");
			if(val.indexOf("TRUNC(TO_DATE(") != -1) {
				val = StringUtils.stripStart(val, "TRUNC(TO_DATE(");
			} else {
				val = StringUtils.stripStart(val, "TO_DATE(");
			}
			String sDate = val.substring(0, val.indexOf(",")).trim();

			//�e�l�́A���t�����𔲂�����
			w_str_o.add(StringUtils.strip(sDate, "'"));
		}
		Iterator itr = w_str_o.iterator();
		String w_unescape = StringUtils.join(itr, ",");
		return w_unescape;
	}

    /**
    *   DATE�^���ڂ̒l��SQL�����ɕϊ����܂��B
    *  (TO_DATE ������)
    *
    *
    *
    */
	public final static String EscapeSQL_Date(String i_str) {

		//�J���}��؂�
        String[] w_str = StringUtils.split(i_str, ",");

		List w_str_o = new ArrayList(w_str.length);

		for (int i=0; i<w_str.length; i++) {
			//�e�l��TO_DATE������
			w_str_o.add("TO_DATE('" + w_str[i] + "', '" + DATE_FORMAT + "')");
		}
        Iterator itr = w_str_o.iterator();
		String w_escape = StringUtils.join(itr, ",");
		return w_escape;
	}


    // SQL���ꕶ���ϊ����\�b�h
    /**
     *  �������SQL�̕������e�����Ƃ��Ďg�p���邽�߂ɁA
     *  ���ꕶ��()���G�X�P�[�v���ĕԋp���܂��B
     *  <pre>
     *  �G�X�P�[�v���镶���́A'(�V���O���N�I�[�g)�ł��B
     *  </pre>
     *
     * @param    i_str       �ϊ��O������
     * @return   (String)    �ϊ��㕶����
     */
    public static String toSqlString(String i_str) {

		//�ϊ������������̎w��i�����w��\�j
        /** SQL���ꕶ���ϊ��O */
        String SPECIAL_CHAR[] = {"'"};

        /** SQL���ꕶ���ϊ��� */
        String REPLACE_CHAR[] = {"''"};

        // �u���Ώۗ̈�
        StringBuffer w_stringBuffer = null;
        int          w_notCheckedLength = 0;
        int          w_specialCharNo = SPECIAL_CHAR.length;

        // �������샏�[�N
        String w_string        = null;
        int    w_index = 0;
        int    w_start = 0;

        if (i_str == null) {
            w_stringBuffer = new StringBuffer(null);
        } else {
            // ������
            w_stringBuffer = new StringBuffer(i_str);

            // �`�F�b�N
            for (int charNo=0; charNo<w_specialCharNo; charNo++) {
                // �����̒����擾
                w_notCheckedLength = w_stringBuffer.length();
                w_start            = 0;

                // �����̖��[�܂Ō���
                while(w_notCheckedLength > 0) {
                    w_string = w_stringBuffer.substring(w_start);
                    w_index = w_string.indexOf(SPECIAL_CHAR[charNo]);
                    if (w_index == -1) {
                        break;
                    } else {
                        w_notCheckedLength -= (w_index + 1);
                        w_start += w_index;
                        w_stringBuffer.replace(w_start,
                                               w_start+1,
                                               REPLACE_CHAR[charNo]);
                        w_start += REPLACE_CHAR[charNo].length();
                    }
                }
            }
        }
        return w_stringBuffer.toString();
    }

}