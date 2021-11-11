/**
 *(#)CsvWriter.java
 *
 * Copyright (c) 2003 NEC informatec Systems,Ltd.
 *
 * @author S.Takahashi
 * Date : 2003/08/18
 * @version 1.00
 * History 2003/08/18 �V�K�쐬 S.Takahashi
 * @version 1.01
 * History 2003/08/25 S.Takahashi
 * CSV�폜���\�b�h��ǉ�(delete)�B
 */
package com.nec.jp.orteus.metamorBase.common.CsvWriter;

import com.nec.jp.orteus.metamorBase.common.util.Converter;
import com.nec.jp.orteus.xaf.util.FoundationException;
import com.nec.jp.orteus.xaf.eo.WriteCsv;
import java.io.File;
import java.util.List;
import com.nec.jp.orteus.util.CoreTools;
import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import java.lang.NumberFormatException;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.io.File;
import java.util.Date;

public class CsvWriter{

	protected File writePath = null;
	protected String path = null;
	protected String fileName = null;
	protected String webRoot = null;


	/**
	 * ��ӂƂȂ�t�@�C�������擾����
	 * @param userId   ���[�UID
	 * @return         �t�@�C�����i���[�UID�{���t[yyyyMMddHHmmssSSS]�j
	 */
	public static String getFileName(String userId){
		return userId + "_" + Converter.dateToStr(new Date(),"yyyyMMddHHmmssSSS") + ".csv";
	}


	/**
	 * �R���X�g���N�^
	 * @param path	 webroot����̃p�X
	 * @param fileName CSV�t�@�C����
	 * @throws FoundationException
	 */
	public CsvWriter(String fileName) throws FoundationException{
		if(fileName == null){
			throw new FoundationException(this.getClass().getName(),"CsvWriter","(SBM0858)�R���X�g���N�^�̈������s���ł�");
		}
		this.fileName = fileName;
		this.readProperty();
	}


	/**
	 * CSV���o�͂���
	 * String�z��̃��X�g�������ɓn���B�i��s�ڂ̓^�C�g���j
	 * @param list	 String�z��̃��X�g
	 * @param fileName CSV�t�@�C����
	 * @throws FoundationException ������null�̏ꍇ
	 */
	public void write(List list) throws FoundationException {
		this.checkPath();
		write(list, writePath.getPath(), fileName);
	}


	/**
	 * CSV�o�͏����v���p�e�B�t�@�C������ǂݍ���
	*/
	private void readProperty() throws FoundationException{
		try{
			ResourceBundle rb = SystemConfig.getBundle();
			this.webRoot = SystemConfig.getProperty("WEBROOT",rb);
			this.path = SystemConfig.getProperty("CSV�f�B���N�g��",rb);
		}catch(MissingResourceException mre){
			FoundationException fe = new FoundationException("CollectNumber",mre.getMessage(),"(SBM0854)�v���p�e�B�t�@�C���̓ǂݍ��݂Ɏ��s���܂����B");
			fe.setPreviousException(mre);
			throw fe;
		}
	}


	/**
	 * CSV���o�͂���
	 */
	protected void write(List list, String path, String fileName) throws FoundationException {
			WriteCsv m_writer = null;
		try {
			m_writer = new WriteCsv();
			m_writer.useDoubleQuote(true);

			m_writer.open(path, fileName);
			int size = list.size();
			// �f�[�^�̐ݒ�
			String sColums[] = null;
			for(int i = 0; i < size; i++) {
				m_writer.beginIns();
				sColums = (String[])list.get(i);
				for(int j = 0; j < sColums.length; j++) {
					m_writer.addCell( replaceQuat(sColums[j]) );
				}
				m_writer.endIns();
			}
		}finally {
			if(m_writer != null){
				m_writer.close();
				m_writer = null;
			}
		}
	}


	/**
	 * �w�肳�ꂽ�t�@�C���E�p�X�����Ƀf�B���N�g�����̃`�F�b�N���s��
	 * �iCSV�̏o�̓f�B���N�g�������݂��Ȃ��ꍇ�̓f�B���N�g���̍쐬���s���j
	 */
	private void checkPath() throws FoundationException {
		writePath = new File(this.webRoot, path);
		if(!writePath.exists()) {
			if(!writePath.mkdirs()) {
				throw new FoundationException(this.getClass().getName(), "checkPath()", "(SBM0864)�f�B���N�g���̍쐬�Ɏ��s���܂����B�F"+writePath.getPath());
			}
		}
	}


	/**
	 * CSV�f�[�^�Ɂu"�v(�_�u���N�H�[�e�[�V����)���܂܂��ꍇ�ɁA�G�X�P�[�v�������s��
	 */
	private String replaceQuat(String str) {
		if(str == null){
			str = "";
		}
		String before = "\"";
		String after = "\"\"";
		StringBuffer strBuf = new StringBuffer(str);
		int pos = 0;
		while((pos = strBuf.toString().indexOf(before, pos)) != -1) {
			strBuf.replace(pos, pos + before.length(), after);
			pos = pos + after.length();
		}
		return strBuf.toString();
	}


	/**
	 * CSV�_�E�����[�hURL���擾����
	 * @param response HttpServletResponse
	 * @return CSV�_�E�����[�hURL
	 */
	public String getUrl(javax.servlet.http.HttpServletResponse response) {
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "filename=\""+fileName+"\"");
		String urlPath = this.path;
		if(!urlPath.startsWith("/")){
			urlPath = "/" + urlPath;
		}
		if(!urlPath.endsWith("/")){
			urlPath = urlPath + "/";
		}
		String urlFileName = this.fileName;
		if(urlFileName.startsWith("/")){
			urlFileName = urlFileName.substring(1);
		}

		return urlPath + urlFileName;
	}


	/**
	 * �ۑ����Ԃ��߂���CSV���폜����
	 * @param  today �{�����t
	 * @throws FoundationException
	 */
	public static void delete(Date today) throws FoundationException{
		try{
			if(today == null){
				throw new FoundationException("CsvWriter","delete","(SBM0865)�������s���ł��B");
			}

			ResourceBundle rb = SystemConfig.getBundle();
			String delWebRoot = SystemConfig.getProperty("WEBROOT",rb);
			String delPath = SystemConfig.getProperty("CSV�f�B���N�g��",rb);
			String delTermStr = SystemConfig.getProperty("CSV�t�@�C���ێ�����",rb);

			if(delWebRoot == null || delPath == null || delTermStr == null){
				throw new FoundationException("CsvWriter","delete","(SBM0866)�v���p�e�B�t�@�C���̐ݒ肪�s���ł��B");
			}

			//�폜����
			int delTerm = Integer.parseInt(delTermStr);

			//CSV�f�B���N�g���̎擾
			if(!delWebRoot.endsWith("/")){
				delWebRoot = delWebRoot + "/";
			}
			if(delPath.startsWith("/")){
				delPath = delPath.substring(1);
			}
			if(!delPath.endsWith("/")){
				delPath = delPath + "/";
			}
			String csvDir = delWebRoot + delPath;

			//CSV�t�@�C���̎擾
			File tempFile = new File(csvDir);
			File [] csvFiles = tempFile.listFiles();
			if(csvFiles == null || csvFiles.length == 0){
				//CSV�t�@�C�����P���Ȃ�
				return;
			}

			for(int i=0;i<csvFiles.length;i++){
				String fileName = csvFiles[i].getName();
				if(fileName.indexOf(".csv") == -1){
					continue;
				}

				int startIndex = fileName.lastIndexOf("_");
				int lastIndex = fileName.lastIndexOf(".csv");
				if(startIndex == -1 || lastIndex == -1){
					continue;
				}
				String fileDateStr = fileName.substring(startIndex+1,lastIndex);
				Date keepDate = null;
				try{
					Date fileDate = Converter.strToDate(fileDateStr,"yyyyMMddHHmmssSSS");
					GregorianCalendar cal = new GregorianCalendar();
					cal.setTime(fileDate);
					cal.add(Calendar.DATE, delTerm);
					keepDate = cal.getTime();
				}catch(Exception pe){
					continue;
				}

				//�ێ����Ԃ��������O��CSV�t�@�C�����폜����
				if(keepDate.compareTo(today) < 0){
					csvFiles[i].delete();
				}
			}

		}catch(MissingResourceException mre){
			FoundationException fe = new FoundationException("CsvWriter","delete","(SBM0867)�v���p�e�B�t�@�C����������܂���B");
			fe.setPreviousException(mre);
			throw fe;
		}catch(NumberFormatException ne){
			FoundationException fe = new FoundationException("CsvWriter","delete","(SBM0868)CSV�ێ����Ԃ̒l���s���ł��B");
			fe.setPreviousException(ne);
			throw fe;
		}catch(FoundationException foe){
			throw foe;
		}catch(Exception e){
			FoundationException fe = new FoundationException("CsvWriter","delete","(SBM0869)�\�����ʃG���[�ł��B");
			fe.setPreviousException(e);
			throw fe;
		}
	}
}
