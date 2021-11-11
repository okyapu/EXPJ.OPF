/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/csv/CsvReader.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.csv;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.PrivateConfig;

import com.nec.jp.orteus.xaf.foundation.IDbConnection;
import com.nec.jp.orteus.xaf.util.FoundationException;
//import com.nec.jp.orteus.eo.*;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.nec.jp.orteus.util.CoreTools;

/**
 * �b�r�u�A�b�v���[�h���i
 *
 * @author $Author: geng-jia $
 * @version $Revision: 1.8 $ $Date: 2015/07/09 07:37:36 $
*/
public class CsvReader extends com.nec.jp.orteus.eo.CsvReader {

	protected HttpServletRequest req = null;
	private int maxSize = 1024 * 1024 * 1;  // �ő�t�@�C���T�C�Y1MB
	private int minSize = 1024; //�ŏ����t�@�C���T�C�Y1KB
	private String charset = null;
	private String encoding = null;
	private int csvLenth = 0;
	private static final String PROP_FILE = "Encoding";	// �v���p�e�B�t�@�C��
	private static final String PROP_KEY = ".csv.read";	// �v���p�e�B�L�[
	private static final String DEFAULT_ENCODING = "Windows-31J";	// �f�t�H���g�����G���R�[�h

 /**
 * �R���X�g���N�^
 * @param request	�C���v�b�g�X�g���[�����܂�HTTP���N�G�X�g
 * @throws FoundationException �������������Ȃ��ꍇ
*/
	public CsvReader(HttpServletRequest request)
			throws FoundationException {
		if (request == null){
			throw new FoundationException(this.getClass().getName(),"CsvReader","(SBM0858) �R���X�g���N�^�̈������s���ł�");
		}
		this.req = request;
	}

	public void setCharset(String str) {
		if ((str != null) && (str.length() != 0)) charset = str;
		else charset = "iso-2022-jp";
	}

	public void setEncoding(String str) {
		if ((str != null) && (str.length() != 0)) encoding = str;
		else encoding = "SJIS";
	}

	/**
	 *  CSV�T�C�Y�̎擾
	 *
	 * @return CSV�T�C�Y
	 * @throws SQLException 
	 * @throws �G���[
	 */
	public int getCsvReadSize() throws SQLException{
		int n = 1;
		IDbConnection conn = null;
		try {
			conn = CoreTools.getTransConnection();
			PrivateConfig privateConfig = new PrivateConfig(conn);
			String csvReadSize = privateConfig.getString("CSV_READ_SIZE");
			if (csvReadSize == null || "".equals(csvReadSize)){
				n = 1;
			} else {
				try{
					n = Integer.parseInt(csvReadSize);
					if ( n <= 0){
						n = 1;
					}
				} catch(Exception e){
					n = 1;
				}
			}
		} catch (FoundationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			CoreTools.closeTransConnection(conn);
			conn = null;
		}
		return n;
	}
	/**
	 *  �A�b�v���[�h�f�[�^���X�g�����O�z��Ɏ�荞�݂܂��B
	 *
	 * @return �X�g�����O�z��
	 * @throws FoundationException �t�@�C���ǂݍ��ݎ��̃G���[
	 */
	public String[] lineRead()
			throws FoundationException{
		Hashtable ctt_tbl = new Hashtable();
		try {

			String errorMsg = checkUploadFileFormat(this.req);
			if (errorMsg != null) {
				throw new FoundationException(this.getClass().getName(),"CsvReader",errorMsg);
			}
			else {

				// charset�擾
				String user_cd = req.getRemoteUser();
				String locale = CoreTools.getLocale(user_cd);
				setCharset(CoreTools.getCharset(locale));

				// �uEncoding.properties�v�ŁA�L�[�uXX.csv.read�v�����݂��Ȃ��ꍇ�A
				//  �L�[�uXX�v�̒l���g�p�B�A���AXX �̓��P�[���̒l�ł���
				ResourceBundle rb = CoreTools.getResourceBundle(PROP_FILE);
				String enc = null;
				try{
					enc = rb.getString(locale + PROP_KEY);
				} catch (MissingResourceException e) {
					enc = null;
				}

				if(enc == null || enc.length() <= 0){
					setEncoding(DEFAULT_ENCODING);
				} else {
					setEncoding(enc);
				}

				/*
				String e = CoreTools.getEncoding(locale + PROP_KEY);
				if(e == null || e.length() <= 0) {
					setEncoding(CoreTools.getEncoding(locale));
				} else {
					setEncoding(e);
				}
				*/

				//�}���`�E�p�[�g�̃f�[�^����K�v�ȃf�[�^�𒊏o
				int ind = this.req.getContentType().indexOf("boundary=");
				String boundary = this.req.getContentType().substring(ind + 9);
				csvLenth = this.req.getContentLength();
				ctt_tbl = parseMultipart(boundary, this.req.getInputStream());   // �}���`�E�p�[�g���
//				String ctt_str = ((ByteArrayOutputStream) ctt_tbl.get("content")).toString();
				String ctt_str = new String(((ByteArrayOutputStream)ctt_tbl.get("content")).toByteArray(), charset);

				//�o�C�g�z������s�ŕ�������������z��֕ϊ�
				StringTokenizer token = new StringTokenizer(ctt_str, "\n");
				String[] data_buff = new String[token.countTokens()];
				for (int i = 0; token.hasMoreTokens(); i++) {
					String current = token.nextToken();
					if ((current != null) && (current.length() > 0)) {
						if ("\r".equals(current.substring(current.length()-1,current.length()))) {
							data_buff[i] = current.substring(0,current.length()-1);
						}
						else {
							data_buff[i] = current;
						}
					}
					else {
						data_buff[i] = "";
					}
				}
				return data_buff;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			throw new FoundationException("CsvReader", "lineRead", "(SBM0859) �t�@�C���̓ǂݍ��ݎ��ɃG���[���������܂���");
		} finally {
			if (ctt_tbl != null) {
				ctt_tbl = null;
			}
		}
	}

	/**
	 *  �}���`�E�p�[�g�̃f�[�^����K�v�ȃf�[�^(file��,content-type��,content�f�[�^)�𒊏o���܂�
	 *
	 * @param bdry �}���`�E�p�[�g�E�f�[�^
	 * @param in ���̓X�g���[��
	 * @return ���o�f�[�^
	 * @exception IOException  I/O��O
	 * @throws SQLException 
	 */
	public Hashtable parseMultipart(String bdry, ServletInputStream in)
			throws IOException, SQLException {
		Hashtable tbl = new Hashtable();
		if (csvLenth<minSize) {
			csvLenth = minSize;
		}
		int buffer_size = csvLenth;
		byte[] b = new byte[buffer_size];
		String line = null;
		String lowerline = null;
		int len;
		ByteArrayOutputStream content = new ByteArrayOutputStream(buffer_size);
		String name = null;

		while ((len = in.readLine(b, 0, buffer_size)) != -1) {
			line = new String(b, 0, len - 2);   //���s�R�[�h\r\n������
			lowerline = line.toLowerCase();

			//content-disposition�̊Ď�
			if (lowerline.startsWith("content-disposition")) {
				//name(���ʃL�[����)�̎擾
				int s1 = lowerline.indexOf("name=\"");
				int e1 = lowerline.indexOf("\"", s1 + 7);
				if (s1 != -1 && e1 != -1) {
					name = line.substring(s1 + 6, e1);
					//name��[upload]�̏ꍇ��contents�܂Ŏ擾���܂�
					if (name.equals("upload")) {
						//filename�̎擾
						int s2 = lowerline.indexOf("filename=\"", e1 + 2);
						int e2 = lowerline.indexOf("\"", s2 + 10);
						if (s2 != -1 && e2 != -1) {
							tbl.put("filename", line.substring(s2 + 10, e2));
						}

						//content-type�̎擾�@�u�����N�s�܂œǂݔ�΂��܂�
						while ((len = in.readLine(b, 0, buffer_size)) != 2) {
							line = new String(b, 0, len - 2);
							lowerline = line.toLowerCase();
							if (lowerline.startsWith("content-type")) {
								int s3 = lowerline.indexOf(" ");
								if (s3 != -1) {
									//contenttype���o
									tbl.put("contenttype", lowerline.substring(s3 + 1));
								}
							}
						}

						//content�̎擾
						ByteArrayOutputStream content_cache = new ByteArrayOutputStream();

						//while ((len = in.readLine(b, 0, buffer_size)) != -1) {
						//	content_cache.write(b, 0, len);
						//}

						String encCont;
						byte[] charsetCont;
						boolean keyCheck = (encoding.toLowerCase()).equals(charset.toLowerCase());

						while ((len = in.readLine(b, 0, buffer_size)) != -1) {
							if(keyCheck){
								content_cache.write(b, 0, len);

							// �uEncoding.properties�v�Őݒ肵�����e�ƁuCharSet.properties�v�̓��e�ƈقȂ�ꍇ
							// �o�C�g�X�g���[���@���@������@���@�o�C�g�X�g���[��
							// �@�@�@�@�@�@�@�@Encoding�@�@Charset
							} else {
								encCont = new String(b, 0, len, encoding);
								charsetCont = encCont.getBytes(charset);
								content_cache.write(charsetCont, 0, charsetCont.length);
							}
						}


						//boundary��������тɉ��s���������Đ��`
						content.write(content_cache.toByteArray(),
								0,
								(content_cache.toByteArray()).length - ("--" + bdry + "--").length() - 4);
						tbl.put("content", content);
						content_cache.close();
						content.close();

					}
					else if (name.equals("tablename")) {
						//tablename�̎擾
						String s_cache = null;
						while (lowerline.indexOf(bdry) == -1) {
							s_cache = line;
							len = in.readLine(b, 0, buffer_size);
							line = new String(b, 0, len - 2);
							lowerline = line.toLowerCase();
						}
						//tablename���o
						tbl.put(name, s_cache);
					}
					else {
						//nextPage�̎擾
						String s_cache = null;
						while (lowerline.indexOf(bdry) == -1) {
							s_cache = line;
							len = in.readLine(b, 0, buffer_size);
							line = new String(b, 0, len - 2);
							lowerline = line.toLowerCase();
						}
						//tablename���o
						tbl.put(name, s_cache);
					}
				}
			}
		}
		in.close();
		return tbl;
	}


	/**
	 *  �t�@�C�����A�b�v���[�h�\���`�F�b�N���܂��B
	 *
	 *@param req HTTP���N�G�X�g
	 *@return �G���[�E���b�Z�[�W�B�G���[���Ȃ����null��Ԃ��܂��B
	 * @throws SQLException 
	 */
	private String checkUploadFileFormat(HttpServletRequest req) throws SQLException {
		String errorMsg = null;

		//ContentType�̃`�F�b�N
		if (!req.getContentType().toLowerCase().startsWith("multipart/form-data")) {
			errorMsg = "(SBM0860) FORM�^�O�Ŏw�肳�ꂽcontent-type������������܂���B";
		}

		//�t�@�C���T�C�Y�̃`�F�b�N
		else if (req.getContentLength() > maxSize * getCsvReadSize()) {
		    errorMsg = "(SBM0861) �t�@�C���̃T�C�Y���傫�����܂��B" + maxSize *getCsvReadSize() + " �ȉ��ɂ��ĉ������B";
		}

		//boundary�l�̃`�F�b�N (RFC1867��Ή��̃u���E�U�Ŕ�������j
		else if (req.getContentType().indexOf("boundary=") == -1) {
			errorMsg = "(SBM0863) ���g���̃u���E�U��RFC1867�ɏ������Ă��Ȃ��̂ŃT�[�r�X�𗘗p�ł��܂���B";
		}


		return errorMsg;
	}

}
