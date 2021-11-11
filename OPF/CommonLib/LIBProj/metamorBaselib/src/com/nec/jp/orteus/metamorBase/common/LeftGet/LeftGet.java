//------------------------------------------------------------------------------
// (#)LeftGet.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/04 �V�K�쐬 T.Taniguchi
// 2003/08/08 �s�v�ȃR�����g�ƃ��b�Z�[�W�o�͂��폜 T.Taniguchi
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.common.LeftGet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.common.*;
import com.nec.jp.orteus.xaf.wa.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.log.*;
import com.nec.jp.orteus.util.*;
import javax.servlet.jsp.*;
import java.net.*;


/**
 * ���t���[���̃��f���N���X(metamorBase�p�⏕)
 * @author NaNES
 * @date 08/04,2003
 * @since Version 1.0
 * @version Version 1.0
 */
public class LeftGet
{
	private HttpSession so;
	private String myPlantCd = null;
	private String myPlantName = null;

	/**
	 * �R���X�g���N�^
	 * @since Version 1.0
	 * @param so �Z�b�V�����I�u�W�F�N�g
	 * @return �Ȃ�
	 * @throws �Ȃ�
	 */
	public LeftGet(HttpSession so) {
		this.so = so;
	}


	/**
	 * �����̏�������H��R�[�h���擾���܂��B
	 * @since Version 1.0
	 * @param �Ȃ�
	 * @return �H��R�[�h
	 * @throws �Ȃ�
	 */
	public String getPlantCd(){
		return myPlantCd;
	}


	/**
	 * �����̏�������H�ꖼ���擾���܂��B
	 * @since Version 1.0
	 * @param �Ȃ�
	 * @return �H��R�[�h
	 * @throws �Ȃ�
	 */
	public String getPlantName(){
		return myPlantName;
	}


	/**
	 * ���[�U�R�[�h���L�[�Ƃ��āA��������������H��R�[�h�ƍH�ꖼ���擾���܂��B
	 * @since Version 1.0
	 * @param USER_CD
	 * @return �Ȃ�
	 * @throws mcException
	 */
	public void makePlantData(String USER_CD) {
		try{
			String query = "SELECT " +
							"USER_MST.PLANT_CD," +
							"M_PLANT.PLANT_NAME" +
							" FROM " +
							"USER_MST," +
							"M_PLANT" +
							" WHERE " +
							"USER_MST.PLANT_CD = M_PLANT.PLANT_CD (+) AND " +
							"USER_MST.USER_CD='"+ USER_CD + "' ";

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
			rs = null;
			adapt.close();
			adapt = null;
			CoreTools.closeDefaultConnection(conn);
			conn = null;

		}catch(Exception e){
				myPlantCd = "";
				myPlantName = "";
		}
	}
}
