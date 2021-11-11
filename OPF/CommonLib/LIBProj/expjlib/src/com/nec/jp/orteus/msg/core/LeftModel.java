/*
 * COPYRIGHT (C) 2003        NEC INFORMATEC SYSTEMS, LTD.
 *
 * ALL RIGHTS RESERVED  BY   NEC INFORMATEC SYSTEMS, LTD.
 * THIS PROGRAM MUST BE USED SOLELY  FOR  THE PURPOSE FOR
 * WHICH IT WAS FURNISHED BY NEC INFORMATEC SYSTEMS, LTD,
 * NO PART OF THIS PROGRAM MAY BE REPRODUCED OR DISCLOSED
 * TO  OTHERS,  IN ANY FORM  WITHOUT  THE  PRIOR  WRITTEN
 * PERMISSION OF NEC INFORMATEC SYSTEMS, LTD.
 * USE OF COPYRIGHT NOTICE  DOES NOT EVIDENCE PUBLICATION
 * OF THE PROGRAM
 *
 * NEC INFORMATEC SYSTEMS  CONFIDENTIAL  AND  PROPRIETARY
  *
  * @(#)  LeftModel.java
  *
  * ����
  * EXPJ (2005/03/22) ���ꕶ��('"�Ȃ�)�ϊ��@�\�ǉ�
  *                   com.nec.jp.orteus.expj.util.Converter �N���X�g�p
  * EXPJ (2005/03/18) ��݃��j���[�쐬�i�����C���j�ƃ��b�Z�[�W���j���[�i�V�K�j�쐬�@�\�𕪗�
  * EXPJ (2005/01/26) JavaDoc�C��
  * EXPJ (2004/12/28) �v�����^���擾���� �ǉ�
  *
  * 2.0.3.4 (2004/12/15),��������ʂ̃��j���[�\���Ή�
  * 2.0.3.3 (2004/11/24),��ʑJ�ڌ����Ή�
  * 2.0.3.2 (2004/03/11),WebSphere5.1�p��LeftModel()�R���X�g���N�^��ǉ�
  * 2.0.3.1 (2004/02/26),���ۉ��Ή�
  * 2.0.3.0 (2004/01/26),SQL Server �Ή�
  * 2.0.2.0 (2003/07/15),makeBusinessMessageCount���\�b�h�C��
  * 2.0.1.0 (2003/07/09),DBType���������ǉ�
  * 2.0.0.0 (2003/03/17),CopyRight�ǉ�
  *
  * �o�[�W�����Ǘ��L�[���[�h�ݒ�
  * \$Date\$
  * \$Revision\$
  * \$Log\$
  */

package com.nec.jp.orteus.msg.core;

import com.nec.jp.orteus.msg.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.nec.jp.orteus.common.*;
import com.nec.jp.orteus.eo.*;
import com.nec.jp.orteus.util.*;

import com.nec.jp.orteus.xaf.foundation.*;

import com.nec.jp.orteus.xaf.log.*;
import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.util.logging.*;
import com.nec.jp.orteus.msg.util.*;

import javax.servlet.jsp.*;
import java.net.*;

import com.nec.jp.orteus.expj.util.Converter;

/**
 * ���t���[���̃��f���N���X
 * @author NEC Informatec Systems, Ltd.
 * @date 08/09,2001
 * @since Version 1.0
 * @version Version 1.0
 */
public class LeftModel extends Model
{
	private HttpSession so;
	private MasterCash masterCash = null;
	private String [] m_myBusinessGroupCdList = null;
	private Hashtable m_recvBusinessHash = null;
	private Hashtable m_businessClassHash = null;
	private Hashtable m_parmBusinessHash = null;
	private Hashtable m_businessClassNameHash = null;
	private Hashtable m_shutFlagHash = null;
	private Hashtable m_businessMessageCountHash = null;
	private int m_sendedCount = 0;
	private int m_completedCount = 0;
	private Hashtable m_urlHash = null;
	private String strLocale = null;
	private ResourceBundle rbOrMenuDic = null;

	// EXPJ �v�����^���
	private Hashtable m_printerDlgFlgHash = null;
	private Hashtable m_msgCdHash = null;
	private Hashtable m_printerTypHash = null;
	private Hashtable m_printerNameHash = null;
	private Hashtable m_printerSeqNoHash = null;

	/**
	 * ��ʑJ�ڌ������C���t���O
	 * @since Version 2.4.2
	 */
	private final static String SCREEN_TRANS_LINE_FLAG = "2";

	/**
	 * �R���X�g���N�^
	 * @since Version 3.0
	 * @return �Ȃ�
	 * @throws �Ȃ�
	 */
	public LeftModel() {
	}

	/**
	 * �R���X�g���N�^
	 * @since Version 1.0
	 * @param so �Z�b�V�����I�u�W�F�N�g
	 * @return �Ȃ�
	 * @throws �Ȃ�
	 */
	public LeftModel(HttpSession so) {
		this.so = so;
	}

	/**
	 * ���N�G�X�g���������܂��B
	 * @since Version 1.0
	 * @param request ���N�G�X�g���w�肵�܂��B
	 * @throws MessageControlException
	 */
	public void parseRequest(HttpServletRequest request) throws MessageControlException{
		try{
//			CORETools.traceDEBUG("** LeftModel:parseRequest **");

			strLocale = (String)so.getAttribute("LOCALE");
			CoreTools.traceDEBUG("(SBM1223)** LeftModel:parseRequest ** Locale=" + strLocale + "�ŏ������܂�");
			// �f�t�H���g���P�[���ȊO�́A���\�[�X�o���h�����擾���Ă���
			if(!CoreTools.getLocale(null).equals(strLocale)) {
				rbOrMenuDic = CoreTools.getResourceBundle("OrteusMenuDic", strLocale);
			}

			masterCash = (MasterCash)so.getAttribute("MSG_MASTER_CASH");
			if(masterCash == null){
				CoreTools.traceDEBUG("(SBM1224)** LeftModel:parseRequest ** �Z�b�V��������MasterCash�I�u�W�F�N�g���擾�ł��܂���ł���");
				masterCash = new MasterCash(strLocale);
				so.setAttribute("MSG_MASTER_CASH",masterCash);
			}
			// �p�X���[�h�ύX���ƋƖ��^�p���̔�r
			if(!chkSaveMonth((String)so.getAttribute("UserId"))) return;
			makeMyBusinessGroupCdList(); //�Ɩ��O���[�v�ꗗ���쐬
				
			//makeRecvBusissCdListHash();  //�Ɩ��O���[�v���Ƃ̎�M�Ɩ��R�[�h�ꗗ���쐬
			makeBusissClassListHash();   //�Ɩ��O���[�v���Ƃ̎d�����O���[�v�ꗗ���쐬
			makeParmBusissCdListHash();  //�Ɩ��O���[�v���ƁA�d�����O���[�v���Ƃ̏�݋Ɩ��R�[�h�ꗗ���쐬
			makeClassInfoHash();         //�Ɩ��O���[�v���ƁA�d�����O���[�v���Ƃ̎d�������i�d�����O���[�v���A�t���O�j���쐬
			//makeBusinessMessageCount();   //�Ɩ����Ƃ̎�M���b�Z�[�W�����쐬
			//makeSendMessageCount();       //���M�ς݃��b�Z�[�W�����쐬
			//makeCompleteMessageCount();   //�������b�Z�[�W�����쐬
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0206");			// ���N�G�X�g�����Ɏ��s
			thisMce.setNextException(mce);
			throw thisMce;
		}
	}


	/**
	 * �Ɩ��O���[�v�b�c����Ɩ��O���[�v�����擾���܂��B
	 * @since Version 1.0
	 * @param businessGroupCd �Ɩ��O���[�v�b�c���w�肵�܂��B
	 * @return �Ɩ��O���[�v��
	 * @throws �Ȃ�
	 */
	public String getNameFromBusinessGroupCd(String businessGroupCd){
		String businessGroupName = masterCash.getNameFromBusinessGroupCd(businessGroupCd);
		businessGroupName = Converter.changeSpecialCharacter(businessGroupName);
		return businessGroupName;
	}


	/**
	 * �w�肵���Ɩ��R�[�h����Ɩ������擾���܂��B
	 * @since Version 1.0
	 * @param businessCd �Ɩ��R�[�h
	 * @return �Ɩ���
	 * @throws �Ȃ�
	 */
	public String getNameFromBusinessCd(String businessCd){
		String businessName = masterCash.getNameFromBusinessCd(businessCd);
		businessName = Converter.changeSpecialCharacter(businessName);
		return businessName;
	}


	/**
	 * ���O�C�����[�U�̒S���Ɩ��O���[�v���ꗗ��ԋp���܂��B
	 * @since Version 1.0
	 * @return ���O�C�����[�U�̒S���Ɩ��O���[�v���ꗗ
	 */
	public String [] getMyBusinessGroupCdList(){
		return m_myBusinessGroupCdList;
	}


	/**
	 * ���O�C�����[�U�̒S���Ɩ��O���[�v�b�c�ꗗ���쐬���܂��B
	 * �쐬�����Ɩ��O���[�v�b�c�ꗗ�̓n�b�V���e�[�u���ɕۑ�����܂��B
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	private void makeMyBusinessGroupCdList() throws MessageControlException{
		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			ss = new SqlSelect("BELONG_MST");
			ss.addCol("BUSINESS_GROUP_CD");
			ss.addKey("USER_CD",(String)so.getAttribute("UserId"));
			ss.setDistinct(true);
			ss.addOrder("BUSINESS_GROUP_CD");
			ss.execute(conn);
			m_myBusinessGroupCdList = new String[ss.getRowSize()];

			int count = 0;
			while(ss.next()){
				m_myBusinessGroupCdList[count] = ss.getString("BUSINESS_GROUP_CD");
				count++;
			}
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0202");
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0202");
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}catch(Exception e){
				CoreTools.traceDEBUG("(SBM1225)LeftModel.makeMyBusinessGroupCdList:�f�[�^�x�[�X����Ɏ��s���܂����B");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * ���O�C�����[�U�̖��O��ԋp���܂��B
	 * @since Version 1.0
	 * @return myName ���O�C�����[�U�̖��O
	 */
	public String getMyName(){
		String myName = masterCash.getNameFromUserCd((String)so.getAttribute("UserId"));
		return myName;
	}


	/**
	 * ��M�Ɩ��R�[�h�̈ꗗ���擾���܂��B
	 * @since Version 1.0
	 * @param businessGroupCd �Ɩ����[�v�R�[�h
	 * @return ��M�Ɩ��R�[�h�ꗗ
	 */
	public String [] getRecvBusinessCdList(String businessGroupCd){
		String [] recvBusinessList = (String [])m_recvBusinessHash.get(businessGroupCd);
		return recvBusinessList;
	}


	/**
	 * �Ɩ��O���[�v���Ƃ̎�M�Ɩ��R�[�h�ꗗ�̃n�b�V�����쐬���܂��B
	 * �쐬�����Ɩ��O���[�v�b�c�ꗗ�̓n�b�V���e�[�u���ɕۑ�����܂��B
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	private void makeRecvBusissCdListHash() throws MessageControlException{
		m_recvBusinessHash = new Hashtable();

		IDbConnection conn = null;
		SqlSelect ss = null;
		SqlSelect ssFlag = null;
		String lineFlag = null;
		String currentBusinessCd = null;
		String [] businessCd = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			// DBType���擾���ADISPLAY_ORDER�̃\�[�g�p��������쐬
			String sortStr = null;
			String dbType = CoreTools.getDBType();
			if (dbType.equals(CoreTools.DBTYPE_DB2) == true) {
				sortStr = "DECIMAL(DISPLAY_ORDER)";
			} else if (dbType.equals(CoreTools.DBTYPE_SQL_SERVER) == true) {
				sortStr = "CAST(DISPLAY_ORDER AS INT)";
			} else {
				sortStr = "TO_NUMBER(DISPLAY_ORDER)";
			}

			for(int i=0;i<m_myBusinessGroupCdList.length;i++){
				ss = new SqlSelect("GROUP_RECV_BUSINESS_MST");
				ss.addCol("BUSINESS_CD");
				ss.addKey("BUSINESS_GROUP_CD",m_myBusinessGroupCdList[i]);
				ss.addOrder("BUSINESS_GROUP_CD");
				// �\�����̏C��varchar��order by���Ă������̂�number�ɏC�� 2003.01.17 R.Hashimoto
//				ss.addOrder("DISPLAY_ORDER");
				//ss.addOrder("TO_NUMBER(DISPLAY_ORDER)");
				// DBType ��������
				ss.addOrder(sortStr);
				ss.execute(conn);

				businessCd = new String[ss.getRowSize()];
				lineFlag = null;
				int count = 0;
				while(ss.next()){
					currentBusinessCd = ss.getString("BUSINESS_CD");

					// �Ɩ��֌W�}�X�^�̃��C���t���O�̊m�F
					// ���C���t���O�� '2' �̏ꍇ�A��ʑJ�ڌ����Ɣ��f���Am_recvBusinessHash �ɒǉ����Ȃ�
					ssFlag = new SqlSelect("BUSINESS_RELATION_MST");
					ssFlag.setDistinct(true);
					ssFlag.addCol("LINE_FLAG");
					ssFlag.addKey("BUSINESS_CD_TO", currentBusinessCd);
					ssFlag.execute(conn);

					if(ssFlag.getRowSize() == 1){
						ssFlag.next();
						lineFlag = ssFlag.getString("LINE_FLAG");
					}

					if( (lineFlag != null) && (!SCREEN_TRANS_LINE_FLAG.equals(lineFlag)) ){
						businessCd[count] = currentBusinessCd;
						count++;
					}

					ssFlag.close();
					ssFlag = null;
				}

				String[] businessCdBuff = new String[count];
				System.arraycopy(businessCd, 0, businessCdBuff, 0, count);
				m_recvBusinessHash.put(m_myBusinessGroupCdList[i], businessCdBuff);

				ss.close();
				ss = null;
			}

		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//��M�Ɩ��R�[�h�ꗗ�̃n�b�V���̍쐬�Ɏ��s���܂����B
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//��M�Ɩ��R�[�h�ꗗ�̃n�b�V���̍쐬�Ɏ��s���܂����B
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(ssFlag != null){
					ssFlag.close();
					ssFlag = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}catch(Exception e){
				CoreTools.traceDEBUG("(SBM1226)LeftModel.makeRecvBusissCdListHash:�f�[�^�x�[�X����Ɏ��s���܂����B");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * ��݋Ɩ��R�[�h�̈ꗗ���擾���܂��B
	 * @since Version 1.0
	 * @param businessGroupCd �Ɩ��O���[�v�R�[�h
	 * @param businessClassCd �d�����O���[�v�R�[�h
	 * @return ��݋Ɩ��R�[�h�ꗗ
	 */
	public String [] getParmBusinessCdList(String businessGroupCd,String businessClassCd){
		Hashtable businessHash = (Hashtable)m_parmBusinessHash.get(businessGroupCd);
		String [] parmBusinessCd = (String [])businessHash.get(businessClassCd);
		return parmBusinessCd;
	}


	/**
	 * �Ɩ��O���[�v�R�[�h����d�����O���[�v�R�[�h�ꗗ���擾���܂��B
	 * @since Version 1.0
	 * @param businessGroupCd �Ɩ��O���[�v�R�[�h
	 * @return �d�����O���[�v�R�[�h�ꗗ
	 */
	public String [] getBusinessClassCdList(String businessGroupCd){
		String [] businessClassList = (String [])m_businessClassHash.get(businessGroupCd);
		return businessClassList;
	}


	/**
	 * �Ɩ��O���[�v���Ƃ̎d�����O���[�v�R�[�h�ꗗ�̃n�b�V�����쐬���܂��B
	 * �쐬�����d�����O���[�v�b�c�ꗗ�̓n�b�V���e�[�u���ɕۑ�����܂��B
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	private void makeBusissClassListHash() throws MessageControlException{
		m_businessClassHash = new Hashtable();

		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			for(int i=0;i<m_myBusinessGroupCdList.length;i++){
				ss = new SqlSelect("BUSINESS_CLASS_MST");
				ss.addCol("BUSINESS_CLASS_CD");
				ss.addKey("BUSINESS_GROUP_CD",m_myBusinessGroupCdList[i]);
				ss.execute(conn);

				String [] businessClassCd = new String[ss.getRowSize()];
				int count = 0;
				while(ss.next()){
					businessClassCd[count] = ss.getString("BUSINESS_CLASS_CD");
					count++;
				}
				m_businessClassHash.put(m_myBusinessGroupCdList[i],businessClassCd);

				ss.close();
				ss = null;
			}

		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//��M�Ɩ��R�[�h�ꗗ�̃n�b�V���̍쐬�Ɏ��s���܂����B
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//��M�Ɩ��R�[�h�ꗗ�̃n�b�V���̍쐬�Ɏ��s���܂����B
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1227)LeftModel.makeBusissClassListHash:�f�[�^�x�[�X����Ɏ��s���܂����B");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * �Ɩ��O���[�v���ƁA�d�����O���[�v���Ƃ̏�݋Ɩ��R�[�h�ꗗ�̃n�b�V�����쐬���܂��B
	 * �쐬�����Ɩ��O���[�v�b�c�ꗗ�̓n�b�V���e�[�u���ɕۑ�����܂��B
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	private void makeParmBusissCdListHash() throws MessageControlException{
		m_parmBusinessHash = new Hashtable();
		m_urlHash = new Hashtable();

		// EXPJ �v�����^���
		m_printerDlgFlgHash = new Hashtable();
		m_msgCdHash = new Hashtable();
		m_printerTypHash = new Hashtable();
		m_printerNameHash = new Hashtable();
		m_printerSeqNoHash = new Hashtable();

		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			// DBType���擾���A�\�[�g�p��������쐬
			String doSortStr = null;
			String snoSortStr = null;
			String dbType = CoreTools.getDBType();
			if (dbType.equals(CoreTools.DBTYPE_DB2) == true) {
				doSortStr = "DECIMAL(DISPLAY_ORDER)";
				snoSortStr = "DECIMAL(SCREEN_NO)";
			} else if (dbType.equals(CoreTools.DBTYPE_SQL_SERVER) == true) {
				doSortStr = "CAST(DISPLAY_ORDER AS INT)";
				snoSortStr = "CAST(SCREEN_NO AS INT)";
			} else {
				doSortStr = "TO_NUMBER(DISPLAY_ORDER)";
				snoSortStr = "TO_NUMBER(SCREEN_NO)";
			}

			Hashtable classHash = null;
			for(int groupCount=0;groupCount<m_myBusinessGroupCdList.length;groupCount++){
				classHash = new Hashtable();
				String [] businessClassCd = (String [])m_businessClassHash.get(m_myBusinessGroupCdList[groupCount]);
				for(int classCount=0;classCount<businessClassCd.length;classCount++){
					ss = new SqlSelect("GROUP_PARM_BUSINESS_MST");
					ss.addCol("BUSINESS_CD");
					ss.addKey("BUSINESS_GROUP_CD",m_myBusinessGroupCdList[groupCount]);
					ss.addKey("BUSINESS_CLASS_CD",businessClassCd[classCount]);
					// �\�����̏C��varchar��order by���Ă������̂�number�ɏC�� 2003.01.17 R.Hashimoto
//				    ss.addOrder("DISPLAY_ORDER");
					//ss.addOrder("TO_NUMBER(DISPLAY_ORDER)");
					// DBType��������
					ss.addOrder(doSortStr);
					ss.execute(conn);

					String [] businessCd = new String[ss.getRowSize()];
					int count = 0;
					while(ss.next()){
						businessCd[count] = ss.getString("BUSINESS_CD");
						count++;
					}
					classHash.put(businessClassCd[classCount],businessCd);

					ss.close();
					ss = null;

					for(int businessCount=0;businessCount<businessCd.length;businessCount++){
						ss = new SqlSelect("CONDUCT_MST");
						ss.addCol("CONDUCT_CD");
						ss.addKey("BUSINESS_CD",businessCd[businessCount]);
						// �\�����̏C��varchar��order by���Ă������̂�number�ɏC�� 2003.01.17 R.Hashimoto
//				        ss.addOrder("DISPLAY_ORDER");
						//ss.addOrder("TO_NUMBER(DISPLAY_ORDER)");
						// DBType��������
						ss.addOrder(doSortStr);
						ss.execute(conn);

						String [] conductCd = new String[ss.getRowSize()];

						count = 0;
						while(ss.next()){
							conductCd[count] = ss.getString("CONDUCT_CD");
							count++;
						}
						ss.close();
						ss = null;

						Hashtable conductHash = new Hashtable();

						for(int conductCount=0;conductCount<conductCd.length;conductCount++){

							// EXPJ �v�����^���ǉ�
							String tableString = "(SELECT"
											   + "  USER_MST.USER_CD"
											   + ", SYS_PRINT_PARM.PROGRAM_CD"
											   + ", SYS_PRINT_PARM.PLANT_CD"
											   + ", SYS_PRINT_PARM.PRINTER_DLG_FLG"
											   + ", SYS_PRINT_PARM.MSG_CD"
											   + ", SYS_PRINTERS.SEQ_NO"
											   + ", NVL(SYS_PRINTERS.PRINTER_TYP, 0) PRINTER_TYP"
											   + ", SYS_PRINTERS.PRINTER_NAME "
											   + "FROM SYS_PRINT_PARM,SYS_PRINTERS,USER_MST "
											   + "WHERE SYS_PRINT_PARM.SEQ_NO = SYS_PRINTERS.SEQ_NO(+) "
											   + "AND  SYS_PRINT_PARM.PLANT_CD = USER_MST.PLANT_CD"
											   + ") PRINT_PARM,"
											   + "SCREEN_MST";

							//ss = new SqlSelect("SCREEN_MST");
							ss = new SqlSelect(tableString);

							//ss.addCol("SCREEN_URL");
							ss.addCol("SCREEN_MST.SCREEN_URL");
							ss.addCol("TO_CHAR(PRINT_PARM.PRINTER_DLG_FLG) PRINTER_DLG_FLG");
							ss.addCol("PRINT_PARM.MSG_CD");
							ss.addCol("NVL(TO_CHAR(PRINT_PARM.PRINTER_TYP), '0') PRINTER_TYP");
							ss.addCol("PRINT_PARM.PRINTER_NAME");
							ss.addCol("PRINT_PARM.SEQ_NO");

							//ss.addKey("CONDUCT_CD",conductCd[conductCount]);
							//ss.addKey("BUSINESS_CD",businessCd[businessCount]);
							ss.addKey("SCREEN_MST.CONDUCT_CD",conductCd[conductCount]);
							ss.addKey("SCREEN_MST.BUSINESS_CD",businessCd[businessCount]);
							ss.addKey("PRINT_PARM.USER_CD(+)",(String)so.getAttribute("UserId"));
							ss.addKey("PRINT_PARM.PROGRAM_CD(+) = REPLACE(UPPER(SCREEN_MST.SCREEN_URL), 'SERVLET')");
							// ������\�[�g�̂��߂ɐ��l�^�ɂ��\�[�g�ɏC�� 2003.06.15 R.Hashimoto
//							ss.addOrder("SCREEN_NO");
							//ss.addOrder("TO_NUMBER(SCREEN_NO)");
							// DBType��������
							ss.addOrder(snoSortStr);
							ss.execute(conn);

							if(ss.getRowSize() == 0){
								MessageControlException mce = new MessageControlException("MSG-E0108");
								//��ʃ}�X�^�Ƀ��R�[�h�����݂��܂���B
								mce.addDetail("BUSINESS_CD = " + businessCd[businessCount]);
								mce.addDetail("CONDUCT_CD = " + conductCd[conductCount]);
								throw mce;
							}

							String url = ss.getString("SCREEN_URL");
							if (url==null) {
								url="NoDesign.jsp";
							}
							conductHash.put(conductCd[conductCount],url);

							String tempBUSINESS_CD = businessCd[businessCount];

							String printerDlgFlg = ss.getString("PRINTER_DLG_FLG");
							if(printerDlgFlg != null) {
								m_printerDlgFlgHash.put(tempBUSINESS_CD,printerDlgFlg);
							}

							String msgCd = ss.getString("MSG_CD");
							if(msgCd != null) {
								m_msgCdHash.put(tempBUSINESS_CD,msgCd);
							}

							String printerTyp = ss.getString("PRINTER_TYP");
							if(printerTyp != null) {
								m_printerTypHash.put(tempBUSINESS_CD,printerTyp);
							}

							String printerName = ss.getString("PRINTER_NAME");
							if(printerName != null) {
								m_printerNameHash.put(tempBUSINESS_CD,printerName);
							}

							String printerSeqNo = ss.getString("SEQ_NO");
							if(printerSeqNo != null) {
								m_printerSeqNoHash.put(tempBUSINESS_CD,printerSeqNo);
							}

							ss.close();
							ss = null;
						}
						m_urlHash.put(businessCd[businessCount],conductHash);
					}
				}

				m_parmBusinessHash.put(m_myBusinessGroupCdList[groupCount],classHash);

			}

		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0212");
			//��݋Ɩ��R�[�h�ꗗ�̃n�b�V���̍쐬�Ɏ��s���܂����B
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0212");
			//��݋Ɩ��R�[�h�ꗗ�̃n�b�V���̍쐬�Ɏ��s���܂����B
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1228)LeftModel.makeParmBusissCdListHash:�f�[�^�x�[�X����Ɏ��s���܂����B");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * �Ɩ��O���[�v���ƁA�d�����O���[�v���Ƃ̎d�����O���[�v���A�t���O�̃n�b�V�����쐬���܂��B
	 * �쐬�����Ɩ��O���[�v�b�c�ꗗ�̓n�b�V���e�[�u���ɕۑ�����܂��B
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	private void makeClassInfoHash() throws MessageControlException{
		m_businessClassNameHash = new Hashtable();
		m_shutFlagHash = new Hashtable();

		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			Hashtable shutHash = null;
			Hashtable nameHash = null;
			String businessClassName = null;
			String strKey = null;
			for(int groupCount=0;groupCount<m_myBusinessGroupCdList.length;groupCount++){
				shutHash = new Hashtable();
				nameHash = new Hashtable();
				String [] businessClassCd = (String [])m_businessClassHash.get(m_myBusinessGroupCdList[groupCount]);
				for(int classCount=0;classCount<businessClassCd.length;classCount++){
					ss = new SqlSelect("BUSINESS_CLASS_MST");
					ss.addCol("BUSINESS_CLASS_NAME");
					ss.addCol("SHUT_FLAG");
					ss.addKey("BUSINESS_GROUP_CD",m_myBusinessGroupCdList[groupCount]);
					ss.addKey("BUSINESS_CLASS_CD",businessClassCd[classCount]);
					ss.execute(conn);

					if(ss.getRowSize() != 1){
						MessageControlException thisMce = new MessageControlException("MSG-E0213");
						//�Ɩ��d�����}�X�^�Ƀ��R�[�h�����݂��܂���B
						throw thisMce;
					}

					businessClassName = null;
					strKey = "Orteus.BUSINESS_CLASS_MST.BUSINESS_CLASS_NAME."
						   + m_myBusinessGroupCdList[groupCount] + "_"
						   + businessClassCd[classCount];
					// �f�t�H���g���P�[���̏ꍇ�́ADB����f�[�^���擾
					if(CoreTools.getLocale(null).equals(strLocale)) {
						businessClassName = ss.getString("BUSINESS_CLASS_NAME");
					}
					// �f�t�H���g���P�[���ȊO�́A���j���[�p�v���p�e�B�t�@�C������f�[�^���擾
					else {
						try {
							businessClassName = CoreTools.getRBString(strKey, rbOrMenuDic);
						} catch(MissingResourceException e) {
							businessClassName = "Not Defined";
							CoreTools.traceDEBUG("LeftModel.makeClassInfoHash() Exception ["+e.toString()+"]");
						}
					}
					String shutFlag = ss.getString("SHUT_FLAG");

					nameHash.put(businessClassCd[classCount],businessClassName);
					shutHash.put(businessClassCd[classCount],shutFlag);

					ss.close();
					ss = null;
				}

				m_businessClassNameHash.put(m_myBusinessGroupCdList[groupCount],nameHash);
				m_shutFlagHash.put(m_myBusinessGroupCdList[groupCount],shutHash);

			}

		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0214");
			//�Ɩ��d�������̍쐬�Ɏ��s���܂����B
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0214");
			//�Ɩ��d�������̍쐬�Ɏ��s���܂����B
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1229)LeftModel.makeClassInfoHash:�f�[�^�x�[�X����Ɏ��s���܂����B");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * �w�肵���d�����O���[�v�R�[�h����d�����O���[�v�����擾���܂��B
	 * @since Version 1.0
	 * @param businessGroupCd �Ɩ��O���[�v�R�[�h
	 * @param businessClassCd �d�����O���[�v�R�[�h
	 * @return �d�����O���[�v��
	 */
	public String getNameFromBusinessClassCd(String businessGroupCd,String businessClassCd){
		Hashtable businessHash = (Hashtable)m_businessClassNameHash.get(businessGroupCd);
		String businessClassName = (String)businessHash.get(businessClassCd);
		businessClassName = Converter.changeSpecialCharacter(businessClassName);
		return businessClassName;
	}


	/**
	 * �w�肵���d�����O���[�v�R�[�h����t���O��Ԃ��擾���܂��B
	 * @since Version 1.0
	 * @param businessGroupCd �Ɩ��O���[�v�R�[�h
	 * @param businessClassCd �d�����O���[�v�R�[�h
	 * @return �t���O���
	 */
	public boolean getShutFlag(String businessGroupCd,String businessClassCd){
		boolean bShut = false;
		Hashtable businessHash = (Hashtable)m_shutFlagHash.get(businessGroupCd);
		String shutFlag = (String)businessHash.get(businessClassCd);

		if(shutFlag != null && shutFlag.equals("1")){
			bShut = true;
		}

		return bShut;
	}


	/**
	 * �w�肵���Ɩ��O���[�v�̎�M���b�Z�[�W�����擾���܂��B
	 * @since Version 1.0
	 * @param businessGroupCd �Ɩ��O���[�v�R�[�h
	 * @return ��M���b�Z�[�W��
	 */
	public int getGroupMessageCount(String businessGroupCd){
		int count = 0;
		String [] businessCd = getRecvBusinessCdList(businessGroupCd);

		for(int i=0;businessCd != null && i<businessCd.length;i++){
			count = count + getBusinessMessageCount(businessCd[i]);
		}

		return count;
	}


	/**
	 * �w�肵���Ɩ��̎�M���b�Z�[�W�����擾���܂��B
	 * @since Version 1.0
	 * @param businessCd �Ɩ��O���[�v�R�[�h
	 * @return ��M���b�Z�[�W��
	 */
	public int getBusinessMessageCount(String businessCd){
		int count = 0;

		try{
			String countStr = (String)m_businessMessageCountHash.get(businessCd);
			count = Integer.parseInt(countStr);
		}
		catch(Exception e){
				CoreTools.traceDEBUG("(SBM1230)LeftModel.getBusinessMessageCount:�f�[�^�x�[�X����Ɏ��s���܂����B");
				CoreTools.traceDEBUG(e.toString());
		}

		return count;
	}

	/**
	 * �Ɩ����Ƃ̎�M���b�Z�[�W�����쐬���܂��B
	 * MSG_USER_CD �����݂���ꍇ�́A�l���b�Z�[�W�����쐬���܂��B
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	public void makeBusinessMessageCount() throws MessageControlException{
		// MSG_USER_CD ���擾���� 2003/07/17 m-kusunoki
		String user = (String)so.getAttribute("MSG_USER_CD");
		CoreTools.traceDEBUG("**** LeftModel makeBusinessMessageCount() user=" + user);

		m_businessMessageCountHash = new Hashtable();

		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			for(int groupCount=0;groupCount<m_myBusinessGroupCdList.length;groupCount++){
				String [] businessCd = (String [])m_recvBusinessHash.get(m_myBusinessGroupCdList[groupCount]);
				for(int businessCount=0;businessCount<businessCd.length;businessCount++){
					ss = new SqlSelect("MESSAGES");
					ss.addCol("MESSAGE_ID");
					ss.addKey("BUSINESS_CD",businessCd[businessCount]);
					ss.addKey("LOCK_STATE","<>",Message.LOCK_CANCEL);
					ss.addKey("COMPLETE_FLAG","<>","1");
					ss.addKey("DELETE_FLAG","0");

					// ���C�����b�Z�[�W�����݂��A���l�̏ꍇ�A������ǉ����� 2003/07/17 m-kusunoki
					if((MessageListModel.isLineMessage(businessCd[businessCount]) == true) && (user != null) && (user.equals("") != true)){
						String addStr = "TRANSMITTING_USER_CD IN (SELECT LINE_MST.USER_CD_FROM FROM LINE_MST, BUSINESS_RELATION_MST WHERE LINE_MST.USER_CD_TO='"
								 + user
								 + "' AND LINE_MST.BUSINESS_CD_FROM=BUSINESS_RELATION_MST.BUSINESS_CD_FROM AND BUSINESS_RELATION_MST.BUSINESS_CD_TO='"
								 + businessCd[businessCount]
								 + "' AND BUSINESS_RELATION_MST.LINE_FLAG='1')";

						ss.addKey(addStr);
					}

					ss.execute(conn);

					m_businessMessageCountHash.put(businessCd[businessCount],"" + ss.getRowSize());
					ss.close();
					ss = null;
				}
			}
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//�Ɩ����Ƃ̎�M���b�Z�[�W���̍쐬�Ɏ��s���܂����B
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0211");
			//�Ɩ����Ƃ̎�M���b�Z�[�W���̍쐬�Ɏ��s���܂����B
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1231)LeftModel.makeBusinessMessageCount:�f�[�^�x�[�X����Ɏ��s���܂����B");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}

	/**
	 * ���M�ς݃��b�Z�[�W�����擾���܂��B
	 * @since Version 1.0
	 * @return ���M�ς݃��b�Z�[�W��
	 */
	public int getSendMessageCount(){
		return m_sendedCount;
	}


	/**
	 * ���M�ς݃��b�Z�[�W�����쐬���܂��B
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	public void makeSendMessageCount() throws MessageControlException{
		m_sendedCount = 0;

		String sendedUser = (String)so.getAttribute("MSG_SENDED_USER_CD");
		if(sendedUser == null){
			sendedUser = (String)so.getAttribute("UserId");
		}

		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			if(sendedUser.equals("")){
				for(int i=0;i<m_myBusinessGroupCdList.length;i++){
					ss = new SqlSelect("MESSAGES");
					ss.addCol("MESSAGE_ID");
					ss.addKey("TRANSMITTING_GROUP_CD",m_myBusinessGroupCdList[i]);
					ss.addKey("DELETE_FLAG","0");
					ss.execute(conn);

					m_sendedCount = m_sendedCount + ss.getRowSize();

					ss.close();
					ss = null;
				}
			}else{
				ss = new SqlSelect("MESSAGES");
				ss.addCol("MESSAGE_ID");
				ss.addKey("TRANSMITTING_USER_CD",sendedUser);
				ss.addKey("DELETE_FLAG","0");
				ss.execute(conn);

				m_sendedCount = ss.getRowSize();

				ss.close();
				ss = null;
			}
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0216");
			//���M�ς݃��b�Z�[�W���̍쐬�Ɏ��s���܂����B
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0216");
			//���M�ς݃��b�Z�[�W���̍쐬�Ɏ��s���܂����B
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1232)LeftModel.makeSendMessageCount:�f�[�^�x�[�X����Ɏ��s���܂����B");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * �������b�Z�[�W�����擾���܂��B
	 * @since Version 1.0
	 * @return �������b�Z�[�W��
	 */
	public int getCompleteMessageCount(){
		return m_completedCount;
	}


	/**
	 * �������b�Z�[�W�����쐬���܂��B
	 * @since Version 1.0
	 * @throws MessageControlException
	 */
	public void makeCompleteMessageCount() throws MessageControlException{
		m_completedCount = 0;

		String completedUser = (String)so.getAttribute("MSG_COMPLETED_USER_CD");
		if(completedUser == null){
			completedUser = (String)so.getAttribute("UserId");
		}

		Hashtable messageCountHash = new Hashtable();
		IDbConnection conn = null;
		SqlSelect ss = null;
		try{
//			conn = CoreTools.getDefaultConnection();
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();

			if(completedUser.equals("")){
				for(int groupCount=0;groupCount<m_myBusinessGroupCdList.length;groupCount++){
					String [] businessCd = getRecvBusinessCdList(m_myBusinessGroupCdList[groupCount]);
					for(int businessCount=0;businessCd != null && businessCount<businessCd.length;businessCount++){
						ss = new SqlSelect("MESSAGES");
						ss.addCol("MESSAGE_ID");
						ss.addKey("BUSINESS_CD",businessCd[businessCount]);
						ss.addKey("LOCK_STATE","<>",Message.LOCK_CANCEL);
						ss.addKey("COMPLETE_FLAG","1");
						ss.addKey("DELETE_FLAG","0");
						ss.execute(conn);

						messageCountHash.put(businessCd[businessCount],"" + ss.getRowSize());

						ss.close();
						ss = null;

					}
				}

				Enumeration enum1 = messageCountHash.elements();
				while(enum1.hasMoreElements()){
					String countStr = (String)enum1.nextElement();
					m_completedCount = m_completedCount + Integer.parseInt(countStr);
				}
			}else{
				ss = new SqlSelect("MESSAGES");
				ss.addCol("MESSAGE_ID");
				ss.addKey("UPDATED_BY",completedUser);
				ss.addKey("COMPLETE_FLAG","1");
				ss.addKey("DELETE_FLAG","0");
				ss.execute(conn);

				m_completedCount = ss.getRowSize();

				ss.close();
				ss = null;
			}
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0217");
			//�������b�Z�[�W���̍쐬�Ɏ��s���܂����B
			thisMce.setNextException(mce);
			throw thisMce;
		}
		catch(FoundationException afe){
			MessageControlException thisMce = new MessageControlException("MSG-E0217");
			//�������b�Z�[�W���̍쐬�Ɏ��s���܂����B
			thisMce.addDetail(afe.toString());
			throw thisMce;
		}
		finally{
			try{
				if(ss != null){
					ss.close();
					ss = null;
				}
				if(conn != null){
					conn.commit();
//					CoreTools.closeDefaultConnection(conn);
					CoreTools.closeTransConnection(conn);
					conn = null;
				}
			}
			catch(Exception e){
				CoreTools.traceDEBUG("(SBM1233)LeftModel.makeCompleteMessageCount:�f�[�^�x�[�X����Ɏ��s���܂����B");
				CoreTools.traceDEBUG(e.toString());
			}
		}
	}


	/**
	 * ��݋Ɩ���URL���擾���܂��B
	 * @since Version 1.0
	 * @param businessCd �Ɩ��R�[�h
	 * @return ��݋Ɩ���URL
	 */
	public String getUrl(String businessCd/*,String conductCd*/){
		String url = null;
		try{
			Hashtable conductHash = (Hashtable)m_urlHash.get(businessCd);

//			url = (String)conductHash.get(conductCd);
			Enumeration enum1 = conductHash.elements();
			if(enum1.hasMoreElements()){
				url = (String)enum1.nextElement();
			}
		}
		catch(Exception e){
			CoreTools.traceDEBUG("Exception:" + e.toString());
		}

		if(url == null){
//			CORETools.traceDEBUG("LeftModel.getUrl()  businessCd:" + businessCd + " conductCd:" + conductCd + " �̂Ƃ�URL�擾���s");
			CoreTools.traceDEBUG("(SBM1234)LeftModel.getUrl()  businessCd:" + businessCd + " �̂Ƃ�URL�擾���s");
			url = "";
		}

		return url;
	}

	/**
	 * �w�肵���Ɩ��R�[�h����v�����^�_�C�A���O�t���O���擾���܂��B
	 * @since Version 1.0
	 * @param businessCd �Ɩ��R�[�h
	 * @return �v�����^�_�C�A���O�t���O
	 */
	public String getPrinterDlgFlgFromBusinessCd(String businessCd){
		String printerDlgFlg = (String)m_printerDlgFlgHash.get(businessCd);
		return printerDlgFlg;
	}

	/**
	 * �w�肵���Ɩ��R�[�h���烁�b�Z�[�W�R�[�h���擾���܂��B
	 * @since Version 1.0
	 * @param businessCd �Ɩ��R�[�h
	 * @return ���b�Z�[�W�R�[�h
	 */
	public String getMsgCdFromBusinessCd(String businessCd){
		String msgCd = (String)m_msgCdHash.get(businessCd);
		return msgCd;
	}

	/**
	 * �w�肵���Ɩ��R�[�h����v�����^��ʂ��擾���܂��B
	 * @since Version 1.0
	 * @param businessCd �Ɩ��R�[�h
	 * @return �v�����^���
	 */
	public String getPrinterTypFromBusinessCd(String businessCd){
		String printerTyp = (String)m_printerTypHash.get(businessCd);
		return printerTyp;
	}

	/**
	 * �w�肵���Ɩ��R�[�h���畨���v�����^�����擾���܂��B
	 * @since Version 1.0
	 * @param businessCd �Ɩ��R�[�h
	 * @return �����v�����^��
	 */
	public String getPrinterNameFromBusinessCd(String businessCd){
		String printerName = (String)m_printerNameHash.get(businessCd);
		return printerName;
	}

	/**
	 * �w�肵���Ɩ��R�[�h����v�����^���ʔԍ����擾���܂��B
	 * @since Version 1.0
	 * @param businessCd �Ɩ��R�[�h
	 * @return �v�����^���ʔԍ�
	 */
	public String getPrinterSeqNoFromBusinessCd(String businessCd){
		String printerSeqNo = (String)m_printerSeqNoHash.get(businessCd);
		return printerSeqNo;
	}

	/**
	 * ���N�G�X�g���������āA���b�Z�[�W��񕔕������\�z���܂��B
	 * @since Version 1.0
	 * @param request ���N�G�X�g���w�肵�܂��B
	 * @throws MessageControlException
	 */
	public void parseMsgRequest(HttpServletRequest request) throws MessageControlException{
		try{
//			CORETools.traceDEBUG("** LeftModel:parseRequest **");

			strLocale = (String)so.getAttribute("LOCALE");
			CoreTools.traceDEBUG("(SBM1223)** LeftModel:parseRequest ** Locale=" + strLocale + "�ŏ������܂�");
			// �f�t�H���g���P�[���ȊO�́A���\�[�X�o���h�����擾���Ă���
			if(!CoreTools.getLocale(null).equals(strLocale)) {
				rbOrMenuDic = CoreTools.getResourceBundle("OrteusMenuDic", strLocale);
			}

			masterCash = (MasterCash)so.getAttribute("MSG_MASTER_CASH");
			if(masterCash == null){
				CoreTools.traceDEBUG("(SBM1224)** LeftModel:parseRequest ** �Z�b�V��������MasterCash�I�u�W�F�N�g���擾�ł��܂���ł���");
				masterCash = new MasterCash(strLocale);
				so.setAttribute("MSG_MASTER_CASH",masterCash);
			}
			// �p�X���[�h�ύX���ƋƖ��^�p���̔�r
			if(!chkSaveMonth((String)so.getAttribute("UserId"))) return;
			
			makeMyBusinessGroupCdList(); //�Ɩ��O���[�v�ꗗ���쐬
			makeRecvBusissCdListHash();  //�Ɩ��O���[�v���Ƃ̎�M�Ɩ��R�[�h�ꗗ���쐬
			//makeBusissClassListHash();   //�Ɩ��O���[�v���Ƃ̎d�����O���[�v�ꗗ���쐬
			//makeParmBusissCdListHash();  //�Ɩ��O���[�v���ƁA�d�����O���[�v���Ƃ̏�݋Ɩ��R�[�h�ꗗ���쐬
			//makeClassInfoHash();         //�Ɩ��O���[�v���ƁA�d�����O���[�v���Ƃ̎d�������i�d�����O���[�v���A�t���O�j���쐬
			makeBusinessMessageCount();   //�Ɩ����Ƃ̎�M���b�Z�[�W�����쐬
			makeSendMessageCount();       //���M�ς݃��b�Z�[�W�����쐬
			makeCompleteMessageCount();   //�������b�Z�[�W�����쐬
		}
		catch(MessageControlException mce){
			MessageControlException thisMce = new MessageControlException("MSG-E0206");			// ���N�G�X�g�����Ɏ��s
			thisMce.setNextException(mce);
			throw thisMce;
		}
	}
	/**
	 * �p�X���[�h�ύX���ƋƖ��^�p���̔�r
	 *
	 * @param	IDbConnection	DB�ڑ�
	 * @param	userId	���[�UID
	 * 
	 */
	public boolean chkSaveMonth(String userId){
		PreparedStatement stmt = null;
		ResultSet rset = null;
		String pwdUpdate = null;
		String pwdMonth = null;
		String busOprDate = null;
		IDbConnection conn = null;
		// �p�X���[�h�ύX���A�Ɩ��^�p���擾�pSQL
		String strUserSQL = "SELECT "
			+ "TO_CHAR(SYS_DATE_CTRL.BUSINESS_OPR_DATE, 'YYYY/MM/DD'), "
			+ "TO_CHAR(USER_MST.PASSWORD_CHG_DATE, 'YYYY/MM/DD') "
			+ "FROM "
			+ "USER_MST,SYS_DATE_CTRL "
			+ "WHERE "
			+ "USER_MST.PLANT_CD = SYS_DATE_CTRL.PLANT_CD " 
			+ "AND USER_MST.USER_CD = ?";		
		// �p�X���[�h�����擾�pSQL
		String strParamSQL = "SELECT VALUE FROM SYS_PARAMETER WHERE NAME = 'PSW_EFFECT_MONTHS'";

		try{	
			conn = CoreTools.getTransConnection();
			conn.beginTransWeb();
			// ���O�C�����[�U���	
			stmt = conn.getConn().prepareStatement(strUserSQL);
			stmt.setString(1, userId);
			rset = stmt.executeQuery();
			if (rset.next()) {
				busOprDate = rset.getString(1);
				pwdUpdate = rset.getString(2);
			}
			closeResultSet(rset);
			closePreparedStatement(stmt);

			if (busOprDate == null || "".equals(busOprDate)
					|| pwdUpdate == null || "".equals(pwdUpdate))
				return false;

			// �p�X���[�h�����̎擾
			stmt = conn.getConn().prepareStatement(strParamSQL);
			rset = stmt.executeQuery();
			if (rset.next())
				pwdMonth = rset.getString(1);
			if (pwdMonth == null || "".equals(pwdMonth))
				return false;

			// �p�X���[�h�ύX�� �{ �p�X���[�h���� > �Ɩ��^�p���̃`���b�N
			if ("0".equals(pwdMonth) || checkDate(pwdUpdate, busOprDate, Integer.parseInt(pwdMonth)) >= 0)
				return true;

		}catch(Exception e){			
			CoreTools.traceDEBUG("LeftModel.chkSaveMonth:SQLException");
			CoreTools.traceDEBUG(e.toString());
			return false;
		}finally
		{
			closeResultSet(rset);
			closePreparedStatement(stmt);
			closeConn(conn);
		}
		return false;
	}
	/**
	 * �p�X���[�h�ύX���ƋƖ��^�p���̔�r
	 *
	 * @param	pwdUpdDate	�p�X���[�h�ύX��
	 * @param	strOprDate	�Ɩ��^�p��
	 * @param	month	�p�X���[�h����
	 * 
	 */
	public static int checkDate(String pwdUpdDate, String strOprDate,
			int month) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		Date busOprDate = null;
		try {
			cal.setTime(dateFormat.parse(pwdUpdDate));
			// �Ɩ��^�p��
			busOprDate = dateFormat.parse(strOprDate);
		} catch (ParseException e) {
			e.printStackTrace();
			CoreTools.traceDEBUG("LeftModel.checkDate:ParseException");
			CoreTools.traceDEBUG(e.toString());
		}
		cal.add(cal.MONTH, month);
		// �p�X���[�h�ύX�� + �p�X���[�h����
		Date pwdUpdate = cal.getTime();
		
		return pwdUpdate.compareTo(busOprDate);
	}

	/**
	 * ���U���g�Z�b�g�����
	 *
	 * @param	resultset	����Ώۂ̃��U���g�Z�b�g
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


	/**
	 * �v���y�A�h�X�e�[�g�����g�����
	 *
	 * @param	statement	����Ώۂ̃X�e�[�g�����g
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
	 * @param	resultset	����Ώۂ̃��U���g�Z�b�g
	 */
	private void closeConn(IDbConnection conn)
	{
		if(conn != null){
			try {
				conn.commit();
			} catch (FoundationException e) {
			}
			CoreTools.closeTransConnection(conn);
			conn = null;
		}
	}
}
