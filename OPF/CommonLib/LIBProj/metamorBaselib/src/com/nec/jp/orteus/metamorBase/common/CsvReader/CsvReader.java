/**
 *(#)CsvReader.java
 *
 * Copyright (c) 2004 NEC informatec Systems,Ltd.
 *
 * @author T.Taniguchi
 *
 * �o�[�W�����Ǘ��L�[���[�h�ݒ�
 * \$Date\$
 * \$Revision\$
 * \$Log\$
 */

package com.nec.jp.orteus.metamorBase.common.CsvReader;

import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.eo.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CsvReader extends com.nec.jp.orteus.eo.CsvReader {

	protected HttpServletRequest req = null;
	private int maxSize = 1024 * 1024 * 1;  // �ő�t�@�C���T�C�Y1MB

	/**
	 * �R���X�g���N�^
	 * @param request	�C���v�b�g�X�g���[�����܂�HTTP���N�G�X�g
	 * @throws FoundationException
	 */
	public CsvReader(HttpServletRequest request) throws FoundationException{
		if(request == null){
			throw new FoundationException(this.getClass().getName(),"CsvReader","(SBM0858)�R���X�g���N�^�̈������s���ł�");
		}
		this.req = request;
	}


	/**
	 *  �A�b�v���[�h�f�[�^���X�g�����O�z��Ɏ�荞�ށB<p>
	 *
	 * @throws FoundationException
	 */
	public String[] lineRead() throws FoundationException{
		Hashtable ctt_tbl = new Hashtable();
		try {

			/*
			 *  �t�@�C���`�F�b�N
			 */
			String errorMsg = checkUploadFileFormat(this.req);
			if (errorMsg != null) {
				/*
				 *  �G���[�̕\��
				 */
				throw new FoundationException(this.getClass().getName(),"CsvReader",errorMsg);
			}
			else {
				/*
				 *  �}���`�E�p�[�g�̃f�[�^����K�v�ȃf�[�^�𒊏o����B
				 */
				int ind = this.req.getContentType().indexOf("boundary=");
				String boundary = this.req.getContentType().substring(ind + 9);
				ctt_tbl = parseMultipart(boundary, this.req.getInputStream());   // �}���`�E�p�[�g���
				String ctt_str = ((ByteArrayOutputStream) ctt_tbl.get("content")).toString();

				/*
				 *  �o�C�g�z������s�ŕ�������������z��֕ϊ�
				 */
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
			throw new FoundationException("CsvReader", "lineRead", "(SBM0859)�t�@�C���̓ǂݍ��ݎ��ɃG���[���������܂���");
		} finally {
			if (ctt_tbl != null) {
				ctt_tbl = null;
			}
		}
	}


	/**
	 *  �}���`�E�p�[�g�̃f�[�^����K�v�ȃf�[�^(file��,content-type��,content�f�[�^)�𒊏o����B<p>
	 *
	 *@param  bdry             �}���`�E�p�[�g�E�f�[�^
	 *@param  in               ���̓X�g���[��
	 *@return                  ���o�f�[�^
	 *@exception  IOException  I/O��O
	 *@since
	 */
	public Hashtable parseMultipart(String bdry, ServletInputStream in)
			throws IOException {
		Hashtable tbl = new Hashtable();
		int buffer_size = maxSize;
		byte[] b = new byte[buffer_size];
		String line = null;
		String lowerline = null;
		int len;
		ByteArrayOutputStream content = new ByteArrayOutputStream(buffer_size);
		String name = null;

		while ((len = in.readLine(b, 0, buffer_size)) != -1) {
			line = new String(b, 0, len - 2);   //���s�R�[�h\r\n������
			lowerline = line.toLowerCase();

			/*
			 *  content-disposition�̊Ď�
			 */
			if (lowerline.startsWith("content-disposition")) {

				/*
				 *  name(���ʃL�[����)�̎擾
				 */
				int s1 = lowerline.indexOf("name=\"");
				int e1 = lowerline.indexOf("\"", s1 + 7);
				if (s1 != -1 && e1 != -1) {
					name = line.substring(s1 + 6, e1);

					/*
					 *  name��[upload]�̏ꍇ��contents�܂Ŏ擾����
					 */
					if (name.equals("upload")) {

						/*
						 *  filename�̎擾
						 */
						int s2 = lowerline.indexOf("filename=\"", e1 + 2);
						int e2 = lowerline.indexOf("\"", s2 + 10);
						if (s2 != -1 && e2 != -1) {
							//filename���o
							tbl.put("filename", line.substring(s2 + 10, e2));
						}

						/*
						 *  content-type�̎擾
						 *  �u�����N�s�܂œǂݔ�΂�
						 */
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

						/*
						 *  content�̎擾
						 */
						ByteArrayOutputStream content_cache = new ByteArrayOutputStream();
						while ((len = in.readLine(b, 0, buffer_size)) != -1) {
							content_cache.write(b, 0, len);
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
						/*
						 *  tablename�̎擾
						 */
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
						/*
						 *  nextPage�̎擾
						 */
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
	 *  �t�@�C�����A�b�v���[�h�\���`�F�b�N����B
	 *
	 *@param  req  HTTP���N�G�X�g
	 *@return      �G���[�E���b�Z�[�W�B�G���[���Ȃ����null��Ԃ��B
	 *@since
	 */
	private String checkUploadFileFormat(HttpServletRequest req) {
		String errorMsg = null;

		/*
		 *  ContentType�̃`�F�b�N
		 */
		if (!req.getContentType().toLowerCase().startsWith("multipart/form-data")) {
			errorMsg = "(SBM0860)FORM�^�O�Ŏw�肳�ꂽcontent-type������������܂���B";
		}

		/*
		 *  �t�@�C���T�C�Y�̃`�F�b�N
		 *
		 *  �T�C�Y�̑傫�ȃt�@�C�����w�肵�ĉ��L��getContentLength()���R�[�������
		 *  �G���[����������B�T�C�Y�̏���͊m�F�ł��Ă��Ȃ����A�Q�l�ɂ����T���v��
		 *  �����ł����l�̌��ۂƂȂ�̂ŁAWebLogic�̖��Ǝv����B
		 *  �����Ƃ��āA�T�C�Y�`�F�b�N���s��Ȃ����Ƃ���B
		 */
		else if (req.getContentLength() > maxSize) {
		    errorMsg = "(SBM0861)�t�@�C���̃T�C�Y���傫�����܂��B" + maxSize + " �ȉ��ɂ��ĉ������B";
		}

		/*
		 *  boundary�l�̃`�F�b�N (RFC1867��Ή��̃u���E�U�Ŕ�������j
		 */
		else if (req.getContentType().indexOf("boundary=") == -1) {
			errorMsg = "(SBM0863)���g���̃u���E�U��RFC1867�ɏ������Ă��Ȃ��̂ŃT�[�r�X�𗘗p�ł��܂���B";
		}

		return errorMsg;
	}
}
