//------------------------------------------------------------------------------
/**
 * CLASS     : AZ0050DBData �N���X
 * �t�@�C���E�N���X����
 * @author $Author: suganuma $
 * @version $Revision: 1.3 $ $Date: 2010/04/12 00:18:40 $
 *
 */
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.AZ0050;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * �ėp�����p���\�b�h��񋟂��܂��B
 * �����ɂ��Ă��ꂽ�r�p�k���𕪐͂��Ăc�a���������s���A
 * ���s���ʂ����ʊi�[�p�z��Ɋi�[���܂��B
 * ���ʊi�[�p�z��ɃA�N�Z�X���郁�\�b�h��񋟂��܂��B
 *
 * @author  Y.Hashimoto
 * @version 1.00
 */
public class AZ0050DBData
{
	private IDbConnection _conn = null;	    /** DB�R�l�N�V�����I�u�W�F�N�g */
	private ResultSet _rs = null;  			/** ResultSet */
	private ResultSetMetaData _rsmd = null; /** ResultSet META�f�[�^ */
	private PreparedStatement _stmt = null; /** PrepareStatement */
	private ResultSetMetaData _prmd = null; /** PrepareStatement META */

	private String _SqlStr = null;          /** SQL�� */

	private ArrayList _colNames;    /** ���ʃZ�b�g�̃J������ */
	private ArrayList _colTypes;    /** ���ʃZ�b�g��SQL�^ */
	private ArrayList _colComments;    /** ���ʃZ�b�g�̃J�����R�����g */
	private ArrayList _data;       /** ���ʃZ�b�g�̃f�[�^�z�� */

	/**
	 * �R���X�g���N�^�B
	 * @param  connection DB�R�l�N�V�����I�u�W�F�N�g
	 * @param  SqlStr     ���s����SQL��
	 * @throws SQLException DB�A�N�Z�X�Ɏ��s
	 */
	public AZ0050DBData(IDbConnection connection,
                        String SqlStr )
                        throws SQLException
	{
		_conn    = connection;
        _SqlStr  = SqlStr;
	}


    public boolean load() throws SQLException
	{
		
		this.clear();
		if(_conn == null) return false;
		
		try {
			// SQL������
			_stmt = (_conn.getConn()).prepareStatement(_SqlStr);
			// SQL���̎��s
			_rs = _stmt.executeQuery();
			
			// �J�������ESQL�̌^�̎擾�^�ݒ�
			_rsmd = _rs.getMetaData();
            // �J�������̎擾
			int cCnt = _rsmd.getColumnCount();

			for(int i=0; i<cCnt; i++){
				this._colTypes.add(new Integer(_rsmd.getColumnType(i+1)));
			}

			// �f�[�^�擾�|���ޔ�(String�^)
			while(_rs.next()){
				String[] strScmData = new String[cCnt];
				for(int i=0; i<cCnt; i++){
                    if (_rs.getObject(i+1) == null) {
					    strScmData[i] = "";

                    } else {
					    strScmData[i] = _rs.getObject(i+1).toString();
                    }
				}
				_data.add(strScmData);
			}
		}finally{
		}
		return true;
	}

	/**
	 * DB�̃J�������̎擾<br>
	 * 
	 * @return �J������(String)�̃��X�g
	 */
	public ArrayList getColNames() throws SQLException
	{
		// DB���^��񂪎擾�ς݂łȂ��ꍇ ��̃��X�g��ԋp
		if(_rsmd == null) { 
			return this._colNames;
		}	
		// ���łɂ��̏����擾�ς݂������� �����ς݃��X�g��ԋp
		if (this._colNames.size() > 0) {
			return this._colNames;
		}

		for(int i=0; i<_rsmd.getColumnCount(); i++){
			this._colNames.add(_rsmd.getColumnName(i+1));
		}
		return this._colNames;
		
	}
	
	/**
	 * �e���ڂ̌^�̎擾<br>
	 * 
	 * @return �e���ڂ̌^(String)�̃��X�g
	 */
	public ArrayList getColTypes() throws SQLException
	{
		// DB���^��񂪎擾�ς݂łȂ��ꍇ ��̃��X�g��ԋp
		if(_rsmd == null) { 
			return this._colTypes;
		}	
		// ���łɂ��̏����擾�ς݂������� �����ς݃��X�g��ԋp
		if (this._colTypes.size() > 0) {
			return this._colTypes;
		}
		for(int i=0; i<_rsmd.getColumnCount(); i++){
			this._colTypes.add(new Integer(_rsmd.getColumnType(i+1)));
		}
		return this._colTypes;
		
	}
	
	/**
	 * �������ʂ̎擾<br>
	 * 
	 * @return ��������(ResultSet)��String�^�ϊ������Q�������X�g
     *         (List*List)
	 */
	public ArrayList getData()
	{
		return this._data;
		
	}
	
	/**
	 * �������ʂ̎擾<br>
	 * 
	 * @return �������ʂ�N�Ԗڂ̃��R�[�h��List�ŕԋp
	 */
	public String[] getDetail(int cIdx)
	{
		return (String[])this._data.get(cIdx);
		
	}

	/**
	 * �v���y�A�h�X�e�[�g�����g�����
	 *
	 * @param statement ����Ώۂ̃X�e�[�g�����g
	 */
	private void closePreparedStatement(PreparedStatement statement)
	{
		if(statement == null)  return;
		try{
			statement.close();
			statement = null;
		}
		catch (SQLException e){}
	}

	/**
	 * ���U���g�Z�b�g�����
	 *
	 * @param resultset ����Ώۂ̃��U���g�Z�b�g
	 */
	private void closeResultSet(ResultSet resultset)
	{
		if(resultset == null)  return;
		try{
			resultset.close();
			resultset = null;
		}
		catch (SQLException e){}
	}
	
	/** �N���A */
	private void clear()
	{ 
		_colNames = new ArrayList();
		_colTypes = new ArrayList();
		_colComments = new ArrayList();
		_data = new ArrayList();
		_rs = null;
		_rsmd = null;
		_stmt = null;

	}

	protected void finalize() {
		this.closeResultSet(_rs);
		this.closePreparedStatement(_stmt);
	}

}
