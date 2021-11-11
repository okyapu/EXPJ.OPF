/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/util/LeftGet.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.util;

import javax.servlet.http.HttpSession;
import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.foundation.IDbAdapter;
import com.nec.jp.orteus.xaf.foundation.IDbRecordset;
import com.nec.jp.orteus.util.CoreTools;

/**
 * ���t���[���̃��f���N���X(EXPLANNER/J(expj)�p�⏕)
 *
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:12 $
*/

public class LeftGet {

	private HttpSession so;
	private String myName = null;
	private String myPlantCd = null;
	private String myPlantName = null;

	/**
	 * �R���X�g���N�^<BR>
	 * ���[�U���擾�������s
	 * @param so �Z�b�V�����I�u�W�F�N�g
	 */
	public LeftGet(HttpSession so) {
		this.so = so;

		try{
			String query = "SELECT USER_MST.USER_NAME" +
						   " FROM USER_MST" +
						   " WHERE USER_MST.USER_CD='"+ (String)so.getAttribute("UserId") + "'";

			IDbConnection conn = CoreTools.getDefaultConnection();
			IDbAdapter adapt = conn.getAdapter(query); // �A�_�v�^�̎擾
			IDbRecordset rs = adapt.execQuery(true); // �N�G���̎��s

			if (rs.next()) {
				myName = rs.getString(1);
			} else {
				myName = "";
			}

			rs.close();
			adapt.close();
			CoreTools.closeDefaultConnection(conn);
			rs = null;
			adapt = null;
			conn = null;

		}catch(Exception e){
				myPlantCd = "";
				myPlantName = "";
		}
	}

	/**
	 * �����̃��[�U�����擾���܂��B
	 * @return ���[�U��
	 */
	public String getMyName(){
		return myName;
	}

	/**
	 * �����̏�������H��R�[�h���擾���܂��B
	 * @return �H��R�[�h
	 */
	public String getPlantCd(){
		return myPlantCd;
	}

	/**
	 * �����̏�������H�ꖼ���擾���܂��B
	 * @return �H�ꖼ
	 */
	public String getPlantName(){
		return myPlantName;
	}

	/**
	 * ���[�U�R�[�h���L�[�Ƃ��āA��������������H��R�[�h�ƍH�ꖼ���擾���܂��B<br>
	 * �擾�ł��Ȃ������ꍇ�́A�H��R�[�h�ƍH�ꖼ���󕶎��Ƃ��܂��B
	 *
	 * @param user_cd ���[�U�R�[�h
	 */
	public void makePlantData(String user_cd) {
		try{
			String query = "SELECT " +
							"USER_MST.PLANT_CD," +
							"M_PLANT.PLANT_NAME" +
							" FROM " +
							"USER_MST," +
							"M_PLANT" +
							" WHERE " +
							"USER_MST.PLANT_CD = M_PLANT.PLANT_CD (+) AND " +
							"USER_MST.USER_CD='"+ user_cd + "' ";

			IDbConnection conn = CoreTools.getDefaultConnection();
			IDbAdapter adapt = conn.getAdapter(query); // �A�_�v�^�̎擾
			IDbRecordset rs = adapt.execQuery(true); // �N�G���̎��s

			if (rs.next()) {
				myPlantCd = rs.getString(1);
				myPlantName = rs.getString(2);
			} else {
				myPlantCd = "";
				myPlantName = "";
			}

			rs.close();
			adapt.close();
			CoreTools.closeDefaultConnection(conn);
			rs = null;
			adapt = null;
			conn = null;

		}catch(Exception e){
				myPlantCd = "";
				myPlantName = "";
		}
	}
}
