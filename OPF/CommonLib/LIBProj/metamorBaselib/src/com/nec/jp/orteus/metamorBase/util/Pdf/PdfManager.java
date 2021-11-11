//------------------------------------------------------------------------------
// (#)PdfManager.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/26 �V�K�쐬 Y.Inada
// 2003/09/01 Y.Inada
//			  PDF�t�@�C���ێ����Ԃ̃`�F�b�N�����C�� 
//			  PDF�t�@�C�����擾���A�R�l�N�V������NULL�`�F�b�N�ǉ�
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.Pdf;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;

import com.nec.jp.orteus.metamorBase.util.common.FileNaming;
import com.nec.jp.orteus.metamorBase.util.common.FileCleaner;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;

import java.util.ResourceBundle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.io.File;

//------------------------------------------------------------------------------

/**
 * PDF�Ǘ��B
 * PDF�t�@�C���𖽖����A�m�肷��B<BR>
 * PDF�t�@�C������DB�����A�o�^�A�폜���s���B
 *
 * @author	Y.Inada
 * @version 1.00
*/
public class PdfManager
{
	/**
	  * PDF�Ǘ��̍\�z�B
	*/
	public PdfManager()
	{
		_fileNaming = new FileNaming();
		_applicationNo = null;
		_user = null;
	}

	/**
	  * �f�B���N�g���擾�B
	  * @return �f�B���N�g��
	*/
	public String getPdfDirectory()
	{
		return _fileNaming.getNamingDirectory();
	}

	/**
	  * �t�@�C�����擾�B
	  * @return �t�@�C����
	*/
	public String getPdfFile()
	{
		return _fileNaming.getNamingName();
	}

	/**
	  * ���������擾�B
	  * @return ��������:yyyyMMddHHmmss
	*/
	public String getPdfTime()
	{
		return _fileNaming.getNamingTime();
	}


	/**
	  * �m��B
	  * @param applicationNo �A�v���P�[�V�����ԍ�
	  * @param user ���[�U
	  * @return true:���� / false:���s
	*/
	public boolean naming(String target, String applicationNo, String user)
	{
		// ������
		_fileNaming = new FileNaming();

		// ���ݒ蔻��
		if(target == null || applicationNo == null || user == null){
			return false;		// ���ݒ�̂��߁A���ʈُ�
		}
		else{
			_applicationNo = applicationNo;
			_user = user;
		}

		// PDF�f�B���N�g���擾(�V�X�e����`)
		ResourceBundle bundle = SystemConfig.getBundle();
		String pdfdirectory = SystemConfig.getProperty("PDF�f�B���N�g��", bundle);
		if(pdfdirectory == null){
			return false;		// PDF�f�B���N�g���擾���s
		}

		// PDF�t�@�C�������m��
		_fileNaming.setTarget(target);
		_fileNaming.setApplicationNo(_applicationNo);
		_fileNaming.setUser(_user);
		_fileNaming.setExtension("pdf");
		_fileNaming.setDirectory(pdfdirectory);
		String pdfFileName = _fileNaming.naming();
		if(pdfFileName == null){
			return false;		// �t�@�C�������Ɏ��s
		}

		return true;
	}

	/**
	  * �o�^�B
	  * @param connect �R�l�N�V����
	  * @param comment1 �R�����g1
	  * @param comment2 �R�����g2
	  * @param comment3 �R�����g3
	  * @return true:���� / false:���s
	*/
	public boolean entry(IDbConnection connect, 
							String comment1, 
							String comment2, 
							String comment3) throws SQLException
	{
		// ���ݒ蔻��
		if(connect == null || _user == null || _applicationNo == null || 
				getPdfFile() == null || getPdfTime() == null)
			return false;		// ���ݒ�̂��߁A���ʈُ�

		// �����ϊ�
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		Date d_date = null;
		try{
			d_date = formatter.parse(getPdfTime());
		}catch(ParseException ex){
			return false;		// �����ϊ����s
		}

		PreparedStatement stmt = null;			// �X�e�[�g�����g
		try{
			// SQL�쐬
			stmt = connect.getConn().prepareStatement(_entrySql);

			stmt.setString(1, _user);
			stmt.setString(2, _applicationNo);
			stmt.setString(3, comment1);
			stmt.setString(4, comment2);
			stmt.setString(5, comment3);
			stmt.setString(6, getPdfFile());
			stmt.setTimestamp(7, new java.sql.Timestamp(d_date.getTime()));
			stmt.setString(8, "pdf");
			stmt.setString(9, _user);
			stmt.setString(10, _user);

			// SQL���s
			stmt.executeUpdate();

		}finally{
			if(stmt != null){
				try {
					stmt.close();
				}catch(SQLException e){}
			}
		}
		return true;
	}

	/**
	  * �폜�B
	  * @param connect �R�l�N�V����
	  * @return true:���� / false:���s
	*/
	public boolean clean(IDbConnection connect) throws SQLException
	{
		// ���ݒ蔻��
		if(connect == null)
			return false;		// ���ݒ�̂��߁A���ʈُ�

		// ����t�@�C���ێ����Ԏ擾
		Integer period =
			SystemConfig.getPropertyNumber("PDF�t�@�C���ێ�����(��)", SystemConfig.getBundle());
		if(period == null) return false;

		// �͈̓`�F�b�N
		if(period.intValue() < 1) return false;

		// �Ώۓ��t���쐬
		Date target = new Date(System.currentTimeMillis());
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(target);
		calendar.add(Calendar.DATE, (0 - period.intValue()));

		// PDF�t�@�C������DB����폜
		PreparedStatement stmt = null;			// �X�e�[�g�����g
		try{
			// �폜�p��SQL�쐬
			stmt = (connect.getConn()).prepareStatement(_cleanSql);
			stmt.setTimestamp(1, new java.sql.Timestamp(calendar.getTime().getTime()));

			// SQL���s
			stmt.executeUpdate();

		}finally{
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}

		// PDF�t�@�C���폜
		PdfCleaning pdfClean = new PdfCleaning();
		if(pdfClean.clear() == true)
			return true;
		else
			return false;
	}


	/**
	  * �擾�B
	  * @param connect �R�l�N�V����
	  * @param applicationNo �A�v���P�[�V�����ԍ�
	  * @param user ���[�U�R�[�h
	  * @param fromDate ���t(FROM)
	  * @param toDate ���t(TO)
	  * @param comment1 �R�����g1
	  * @param comment2 �R�����g2
	  * @param comment3 �R�����g3
	  * @return true:���� / false:���s
	*/
	public List get(IDbConnection connect, 
					String applicationNo,
					String user,
					Date fromDate,
					Date toDate,
					String comment1,
					String comment2,
					String comment3) throws SQLException
	{
		List infoList = new ArrayList(0);

		// ���ݒ蔻��
		if(connect == null)
			return infoList;		// ���ݒ�̂��߁A���ʈُ�

		// PDF�f�B���N�g���擾(�V�X�e����`)
		ResourceBundle bundle = SystemConfig.getBundle();
		String pdfdirectory = SystemConfig.getProperty("PDF�f�B���N�g��", bundle);
		if(pdfdirectory == null)
			return infoList;		// PDF�f�B���N�g���擾���s

		// �����pSQL�쐬
		String getSql = makeGetSql(applicationNo, user, fromDate, toDate,
									comment1, comment2, comment3);
		PreparedStatement stmt = null;
		ResultSet rset = null;
		try{
			// SQL���s
			stmt = (connect.getConn()).prepareStatement(getSql);
			rset = stmt.executeQuery();
	
			// ���ʂ��擾
			while(rset.next()){

				// �t�@�C���̑��݂����ꍇ
				File file = new File(pdfdirectory + "/" + rset.getString(6));
				if(file.isFile() == true){
					PdfInfomation info = new PdfInfomation();
					info.setUser(rset.getString(1));
					info.setApplicationNo(rset.getString(2));
					info.setComment1(rset.getString(3));
					info.setComment2(rset.getString(4));
					info.setComment3(rset.getString(5));
					info.setFileName(rset.getString(6));
					info.setFileDate(rset.getString(7));
					info.setSuffix(rset.getString(8));
					infoList.add(info);
				}
			}

			return infoList;

		}finally{
			if(rset != null){
				try{
					rset.close();
				}catch(Exception e){}
				rset = null;
			}
			if(stmt != null){
				try{
					stmt.close();
				}catch(Exception e){}
				stmt = null;
			}
		}
	}


	/**
	  * �����pSQL�쐬�B
	  * @param applicationNo �A�v���P�[�V�����ԍ�
	  * @param user ���[�U�R�[�h
	  * @param fromDate ���t(FROM)
	  * @param toDate ���t(TO)
	  * @param comment1 �R�����g1
	  * @param comment2 �R�����g2
	  * @param comment3 �R�����g3
	  * @return SQL������
	*/
	private String makeGetSql(String applicationNo,
									String user,
									Date fromDate,
									Date toDate,
									String comment1,
									String comment2,
									String comment3)
	{
		// �����ϊ�
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

		// SQL������쐬
		String s_appNo = "";
		String s_user = "";
		String s_fromDate = "";
		String s_toDate = "";
		String s_comment1 = "";
		String s_comment2 = "";
		String s_comment3 = "";
		String s_where = "";
		String s_selectSql = "";

		// ���������쐬
		if(applicationNo != null){
			s_appNo = "APPLICATION_NO = '" + applicationNo + "' ";
			s_where = s_where + s_appNo;
		}
		if(user != null){
			s_user = "USER_CD = '" + user + "' ";
			if(s_where.equals("") == true)
				s_where = s_where + s_user;
			else
				s_where = s_where + " and " + s_user;
		}
		if(fromDate != null){
			s_fromDate = "FILE_CREATED_DATE >= TO_DATE('" + formatter.format(fromDate) + "') ";
			if(s_where.equals("") == true)
				s_where = s_where + s_fromDate;
			else
				s_where = s_where + " and " + s_fromDate;
		}
		if(toDate != null){
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(toDate);
			calendar.add(Calendar.DATE, 1);
			Date d_date = new Date(calendar.getTime().getTime());

			s_toDate = "FILE_CREATED_DATE < TO_DATE('" + formatter.format(d_date) + "') ";
			if(s_where.equals("") == true)
				s_where = s_where + s_toDate;
			else
				s_where = s_where + " and " + s_toDate;
		}
		if(comment1 != null){
			s_comment1 = "FILE_COMMENT1 = '" + comment1 + "' ";
			if(s_where.equals("") == true)
				s_where = s_where + s_comment1;
			else
				s_where = s_where + " and " + s_comment1;
		}
		if(comment2 != null){
			s_comment2 = "FILE_COMMENT2 = '" + comment2 + "' ";
			if(s_where.equals("") == true)
				s_where = s_where + s_comment2;
			else
				s_where = s_where + " and " + s_comment2;
		}
		if(comment3 != null){
			s_comment3 = "FILE_COMMENT3 = '" + comment3 + "' ";
			if(s_where.equals("") == true)
				s_where = s_where + s_comment3;
			else
				s_where = s_where + " and " + s_comment3;
		}

		if(s_where.equals("") == true)
			s_selectSql = _getSql + _getSqlOrder;							// ����������
		else
			s_selectSql = _getSql + "where " + s_where + _getSqlOrder;		// ���������L

		return s_selectSql;
	}

	/** �t�@�C������ */
	private FileNaming _fileNaming = null;

	/** �A�v���P�[�V�����ԍ� */
	private String _applicationNo = null;

	/** ���[�U */
	private String _user = null;

	/** �t�@�C�����o�^SQL */
	private final static String _entrySql =
			"insert into SYS_FILE_INFORMATION " +
			"(USER_CD," +
			" APPLICATION_NO," +
			" FILE_COMMENT1," +
			" FILE_COMMENT2," +
			" FILE_COMMENT3," +
			" FILE_NAME," +
			" FILE_CREATED_DATE," +
			" FILE_SUFFIX," +
			" CREATED_DATE," +
			" CREATED_BY," +
			" CREATED_PRG_NM," +
			" UPDATED_DATE," +
			" UPDATED_BY," +
			" UPDATED_PRG_NM) " +
			"values" +
			"(?, ?, ?, ?, ?, ?, ?, ?," +
			" sysdate, ?, 'PDFManager', sysdate, ?, 'PDFManager')";

	/** �t�@�C�����폜SQL */
	private final static String _cleanSql =
			"delete from SYS_FILE_INFORMATION " +
			"where " +
			"FILE_CREATED_DATE < ?";

	/** �t�@�C�����擾SQL */
	private final static String _getSql =
			"select " +
				" USER_CD," +
				" APPLICATION_NO," +
				" FILE_COMMENT1," +
				" FILE_COMMENT2," +
				" FILE_COMMENT3," +
				" FILE_NAME," +
				" TO_CHAR(FILE_CREATED_DATE, 'YYYY/MM/DD HH24:MI:SS')," +
				" FILE_SUFFIX " +
			"from " +
				"SYS_FILE_INFORMATION ";

	/** �t�@�C�����擾SQL �������� */
	private final static String _getSqlOrder =
			"order by " +
				" FILE_CREATED_DATE ASC," + 
				" FILE_NAME ASC";

}
