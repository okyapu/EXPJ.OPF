//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0040DBInfo �N���X
 * �t�@�C���E�N���X����
 * @author $Author: suganuma $
 * @version $Revision: 1.1 $ $Date: 2005/03/09 06:49:40 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0040;

import java.util.List;
import java.util.ArrayList;

public class AZ0040DBInfo
{
	//--------------------------------------------------------------------------
	// �\�z

	/** �R���X�g���N�^ */
	public AZ0040DBInfo(){ clear(); }

	//--------------------------------------------------------------------------
	//         ���J�֐�

	//---------------------------------
	// �l�ݒ�p���\�b�h

	/** �e�[�u�����̐ݒ� */
	public void setTablename(String tablename){ 
		_tablename = tablename;
	}
	/** �e�[�u�����̃R�����g�̐ݒ� */
	public void setTableComment(String tableComment){ 
		_tableComment = tableComment;
	}
	/** �J���������̐ݒ� */
	public void setColumnTypes(List columnTypes){
		_columnTypes.clear();
        _columnTypes.addAll(columnTypes);
    }
	/** �J�������̐ݒ� */
	public void setColumnNames(List columnNames){
		_columnNames.clear();
		_columnNames.addAll(columnNames);
    }

	/** �J�������R�����g�̐ݒ� */
	public void setColumnComments(List columnComments){ 
		_columnComments.clear();
        _columnComments.addAll(columnComments);
    }

	//---------------------------------
	// �l�擾�p���\�b�h

	/** �e�[�u�����̎擾 */
	public String getTablename(){ return _tablename; }

	/** �J���������X�g�̎擾 */
	public List getColumnNames(){ return _columnNames; }

	/** �e�[�u�����̃R�����g�̎擾 */
	public String getTableComment(){ return _tableComment; }

	/** �J�������R�����g���X�g�̎擾 */
	public List getColumnComments(){ return _columnComments; }
	
	
	/** �J�����������X�g�̎擾 */
	public List getColumnTypes(){ return _columnTypes; }

	//----------------------------------------------------------------------------
	//         �p�b�P�[�W���J�֐�
	//----------------------------------------------------------------------------

	/** �J�����R�����g�̎擾(�J�������w��) */
	String getColumnComment(String iColumnName){
		String w_comment = null; 
		//�J���������X�g�̒�����A�w�肳�ꂽ�J��������index���擾����B
		int idx = _columnNames.indexOf(iColumnName);
		if(idx > -1) {
			w_comment = _columnComments.get(idx).toString();
		}
		return w_comment; 
	}

	/** �J���������̎擾(�J�������w��) */
	String getColumnType(String iColumnName){
		String w_type = null; 
		//�J���������X�g�̒�����A�w�肳�ꂽ�J��������index���擾����B
		int idx = _columnNames.indexOf(iColumnName);
		if(idx > -1) {
			w_type = _columnTypes.get(idx).toString();
		}
		return w_type; 
	}

	//-------------------------------------------
	//         ����J�֐�
	//-------------------------------------------
	/** �N���A */
	private void clear()
	{ 
		_tablename = null; 
		_tableComment = null;
		_columnNames = new ArrayList();
		_columnComments = new ArrayList();
		_columnTypes = new ArrayList();
	}

	//--------------------------------------------------------------------------
	// ����
	/** �e�[�u���� */
	private String _tablename = null;
	/** �e�[�u���R�����g */
	private String _tableComment = null;
	/** �J������ */
	private List _columnNames;
	/** �J�����R�����g */
	private List _columnComments;
	/** �J���������@java.sql.Types  */
	private List _columnTypes;
}