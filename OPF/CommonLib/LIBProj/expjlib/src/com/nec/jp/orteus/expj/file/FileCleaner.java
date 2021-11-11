/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/file/FileCleaner.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * �t�@�C���N���[�i�[�B<br>
 * �^����ꂽ�����Ɉ�v����t�@�C�����폜���܂��B<br>
 * �t�@�C���폜�̏����́A�@�\���A�A�v���P�[�V�����ԍ��A���[�U�A�g���q�A�f�B���N�g���p�X�A���t�ł��B
 *
 * @see FileNaming
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:27:55 $
 */
public class FileCleaner
{
	/**
	 * �@�\��
	 */
	private String _target = null;
	
	/**
	 * �A�v���P�[�V�����ԍ�
	 */
	private String _applicationNo = null;
	
	/**
	 * ���[�U
	 */
	private String _user = null;
	
	/**
	 * �g���q
	 */
	private String _extension = null;
	
	/**
	 * �f�B���N�g���p�X
	 */
	private String _directory = null;

	/**
	 * �t�@�C���N���[�i�[�̍\�z�B
	 */
	public FileCleaner()
	{
		_target = null;
		_applicationNo = null;
		_user = null;
		_extension = null;
		_directory = null;
	}

	/**
	 * �A�v���P�[�V�����ԍ��ݒ�B
	 * @param applicationNo �A�v���P�[�V�����ԍ�
	 */
	public void setApplicationNo(String applicationNo)
	{
		_applicationNo = applicationNo;
	}

	/**
	 * �f�B���N�g���p�X�ݒ�B
	 * @param directory �f�B���N�g���p�X�ԍ�
	 */
	public void setDirectory(String directory)
	{
		_directory = directory;
	}

	/**
	 * �g���q�ݒ�B
	 * @param extension �g���q
	 */
	public void setExtension(String extension)
	{
		_extension = extension;
	}

	/**
	 * �@�\���ݒ�B
	 * @param target �@�\��
	 */
	public void setTarget(String target)
	{
		_target = target;
	}

	/**
	 * ���[�U�ݒ�B
	 * @param user ���[�U
	 */
	public void setUser(String user)
	{
		_user = user;
	}

	/**
	 * �A�v���P�[�V�����ԍ��擾�B
	 * @return �A�v���P�[�V�����ԍ�
	 */
	public String getApplicationNo()
	{
		return _applicationNo;
	}

	/**
	 * �f�B���N�g���p�X�擾�B
	 * @return �f�B���N�g���p�X
	 */
	public String getDirectory()
	{
		return _directory;
	}

	/**
	 * �g���q�擾�B
	 * @return �g���q
	 */
	public String getExtension()
	{
		return _extension;
	}

	/**
	 * �@�\���擾�B
	 * @return �@�\��
	 */
	public String getTarget()
	{
		return _target;
	}

	/**
	 * ���[�U�擾�B
	 * @return ���[�U
	 */
	public String getUser()
	{
		return _user;
	}

	/**
	 * �|���B�ێ�������Ɋ�Â��āA�t�@�C�����폜���܂��B
	 * @param before ���t�B
	 * @return �����̐��� true:����  false:���s
	 */
	public boolean cleanup(Date before)
	{
		// ���ݒ蔻��
		if (_directory == null || _extension == null) {
			return false;
		}
		// ��������
		if (before == null) {
			return false;
		}
		// �擾
		File[] files = null;
		if ((files = this.listFiles(_directory)) == null) {
			return false;
		}
		// ���t���H
		String date = this.convert(before);
		if (date.equals("") == true) {
			return false;
		}
		// ����
		Vector buf = new Vector();
		for (int i = 0; i < files.length; i++) {
			String name = files[i].getName();
			// �g���q��T��
			int index = name.lastIndexOf('.');
			if (index == -1) {
				continue;
			}
			if (name.substring(index + 1).equals(_extension) == false) {
				continue;
			}
			// �t�@�C�������g�[�N���ɕ�����
			StringTokenizer token = new StringTokenizer(name, "_");
			if (token.countTokens() < 2) {	// �������g�[�N��2�Ȃ̂�
				continue;
			}
			// �i�[
			String[] tmp = new String[token.countTokens()];
			for (int j = 0; token.hasMoreTokens() == true; j++) {
				tmp[j] = token.nextToken();
			}
			// ������r
			if (tmp[tmp.length - 2].compareTo(date) >= 0) {
				continue;
			}
			// �����t�@�C����
			StringBuffer comp1 = new StringBuffer();
			if(null != _target) comp1.append(_target + "_");
			if(null != _applicationNo) comp1.append(_applicationNo + "_");
			if(null != _user) comp1.append(_user + "_");

			// �Ώۃt�@�C����
			StringBuffer comp2 = new StringBuffer();
			for (int j = 0; j < tmp.length - 2; j++) {
				comp2.append(tmp[j] + "_");
			}
			// �t�@�C������r
			if (comp1.toString().equals(comp2.toString()) == false) {
				continue;
			}
			// ���o
			buf.add(files[i]);
		}
		// �폜
		return this.delete(buf);
	}

	/**
	 * �|���B�ێ�������Ɋ�Â��āA�t�@�C�����폜���܂��B
	 * @param before ���t
	 * @return �����̐��� true:����  false:���s
	 */
	public boolean cleanupWild(Date before)
	{
		// ���ݒ蔻��
		if (_directory == null || _extension == null) {
			return false;
		}
		// ��������
		if (before == null) {
			return false;
		}
		// �擾
		File[] files = null;
		if ((files = this.listFiles(_directory)) == null) {
			return false;
		}
		// ���t���H
		String date = this.convert(before);
		if (date.equals("") == true) {
			return false;
		}
		// ����
		Vector buf = new Vector();
		for (int i = 0; i < files.length; i++) {
			String name = files[i].getName();
			// �g���q��T��
			int index = name.lastIndexOf('.');
			if (index == -1) {
				continue;
			}
			if (name.substring(index + 1).equals(_extension) == false) {
				continue;
			}
			// �t�@�C�������g�[�N���ɕ�����
			StringTokenizer token = new StringTokenizer(name, "_");
			if (token.countTokens() != 5) {	// �t�@�C�����ȗ������̂ݑΏ�
				continue;
			}
			// �i�[
			String[] tmp = new String[token.countTokens()];
			for (int j = 0; token.hasMoreTokens() == true; j++) {
				tmp[j] = token.nextToken();
			}
			// ������r
			if (tmp[tmp.length - 2].compareTo(date) >= 0) {
				continue;
			}
			// ��r�t�@�C�����\�z
			StringBuffer comp1 = new StringBuffer();
			StringBuffer comp2 = new StringBuffer();
			if(null != _target) {
				comp1.append(_target);
				comp2.append(tmp[0]);
			}
			if(null != _applicationNo) {
				comp1.append(_applicationNo);
				comp2.append(tmp[1]);
			}
			if(null != _user) {
				comp1.append(_user);
				comp2.append(tmp[2]);
			}
			// �t�@�C������r
			if (comp1.toString().equals(comp2.toString()) == false) {
				continue;
			}
			// ���o
			buf.add(files[i]);
		}
		// �폜
		return this.delete(buf);
	}

	/**
	 * ���t�𕶎���ɕϊ��B
	 * @param before ���t
	 * @return �ϊ����ꂽ������
	 */
	private String convert(Date before)
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		// �����ϊ�
		return format.format(before);
	}

	/**
	 * �t�@�C���̈ꗗ���擾�B
	 * @param path �f�B���N�g���̃p�X
	 * @return �t�@�C���ꗗ
	 */
	private File[] listFiles(String path)
	{
		try {
			File file = new File(path);
			return file.listFiles();
		} catch (RuntimeException e) {
			return null;
		}
	}

	/**
	 * �t�@�C���폜�B
	 * @param files �t�@�C���ꗗ
	 * @return �����̐���
	 */
	private boolean delete(Vector files)
	{
		boolean flag = true;
		for (int i = 0; i < files.size(); i++) {
			try {
				if (((File)files.get(i)).delete() == false) {
					flag = false;
				}
			} catch (SecurityException e) {
				flag = false;
			}
		}
		return flag;
	}
}
