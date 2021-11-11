/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/file/FileNaming.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.file;

import java.lang.System;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.io.File;

/**
 * �t�@�C���l�[�~���O�B
 * �V�X�e���ɂ�����t�@�C�������@�\��񋟂���B<BR>
 * ��������t�@�C�����́A�V�X�e���ň�ӂł��邱�Ƃ�ۏ؂���B
 *
 * @see FileNaming
 * @author $Author: wang-derui $
 * @version $Revision: 1.4 $ $Date: 2008/03/26 07:27:55 $
 */

public class FileNaming
{
	/**  �@�\��  */
	private String _target = null;
	/**
	 * �@�\���ݒ�B
	 * @param target �@�\��
	 */
	public void setTarget(String target) { _target = target; }
	/**
	 * �@�\���擾�B
	 * @return �@�\��
	 */
	public String getTarget() { return _target; }


	/**  �A�v���P�[�V�����ԍ�  */
	private String _applicationNo = null;
	/**
	 * �A�v���P�[�V�����ԍ��ݒ�B
	 * @param appNo �A�v���P�[�V�����ԍ�
	 */
	public void setApplicationNo(String applicationNo) { _applicationNo = applicationNo; }
	/**
	 * �A�v���P�[�V�����ԍ��擾�B
	 * @return �A�v���P�[�V�����ԍ�
	 */
	public String getApplicationNo() { return _applicationNo; }


	/**  ���[�U  */
	private String _user = null;
	/**
	 * ���[�U�ݒ�B
	 * @param user ���[�U
	 */
	public void setUser(String user) { _user = user; }
	/**
	 * ���[�U�擾�B
	 * @return ���[�U
	 */
	public String getUser() { return _user; }


	/**  �ǉ�����  */
	private String _mark = null;
	/**
	 * �ǉ����ʐݒ�B
	 * @param mark �ǉ�����
	 */
	public void setMark(String mark) { _mark = mark; }
	/**
	 * �ǉ����ʎ擾�B
	 * @return �ǉ�����
	 */
	public String getMark() { return _user; }


	/**  �g���q  */
	private String _extension = null;
	/**
	 * �g���q�ݒ�B
	 * @param extension �g���q
	 */
	public void setExtension(String extension) { _extension = extension; }
	/**
	  * �g���q�擾�B
	  * @return �g���q
	*/
	public String getExtension() { return _extension; }


	/**  �f�B���N�g��  */
	private String _directory = null;
	/**
	 * �f�B���N�g���ݒ�B
	 * @param directory �f�B���N�g��
	 */
	public void setDirectory(String directory) { _directory = directory; }
	/**
	  * �f�B���N�g���擾�B
	  * @return �f�B���N�g��
	*/
	public String getDirectory() { return _directory; }


	/**  �t�@�C����  */
	private String _namingName = null;

	/**  �쐬����  */
	private String _namingTime = null;

	/**  �f�B���N�g��  */
	private String _namingDirectory = null;


	/**
	  * �����B
	  * @return �t�@�C����
	*/
	public String naming()
	{
		_namingName = null;
		_namingDirectory = null;
		_namingTime = null;

		// ���ݒ蔻��
		if(null == _directory || null == _extension)
			return null;	// ���ݒ�̂��߁A���ʈُ�

		// �f�B���N�g���`�F�b�N
		if(false == existsDir(_directory))
			return null;	// �f�B���N�g�����������Ȃ����߁A���ʈُ�

		// ����������擾(���ݎ���:YYYYMMDDHHmmSS)
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateformat = formatter.format((new Date(System.currentTimeMillis())));

		// �t�@�C�����p��(�@�\��/�A�v���P�[�V�����ԍ�/���[�U/���t �����̂�)
		String directoryformat = _directory + "/";
		StringBuffer fileformat = new StringBuffer();
		if(null != _target) fileformat.append(_target + "_");
		if(null != _applicationNo) fileformat.append(_applicationNo + "_");
		if(null != _user) fileformat.append(_user + "_");
		fileformat.append(dateformat + "_");
		if(null != _mark) fileformat.append(_mark);
		String extension = "." + _extension;

		// �t�@�C���m��
		int sequenceNo = -1;
		String filename = null;
		do {
			sequenceNo++;
			filename = fileformat.toString() + Integer.toString(sequenceNo) + extension;
		}
		while(true == exists(directoryformat + filename));

		// �m��
		_namingName = filename;
		_namingDirectory = _directory;
		_namingTime = dateformat;
		return getNamingPath();
	}

	/**
	  * �����t�@�C�����擾�B
	  * @return �t�@�C����
	*/
	public String getNamingName()
	{
		return _namingName;
	}

	/**
	  * �����f�B���N�g���擾�B
	  * @return �t�@�C����
	*/
	public String getNamingDirectory()
	{
		return _namingDirectory;
	}

	/**
	  * ��������������擾�B
	  * @return ����������:yyyyMMddHHmmss
	*/
	public String getNamingTime()
	{
		return _namingTime;
	}

	/**
	  * �����p�X�擾�B
	  * @return �t�@�C����
	*/
	public String getNamingPath()
	{
		if(null == _namingName || null == _namingDirectory) return null;
		return _namingDirectory + "/" + _namingName;
	}

	/**
	  * �t�@�C�����ݔ���B
	  * @return true:���݂��� / false:���݂��Ȃ�
	*/
	public boolean exists()
	{
		return exists(_namingDirectory + "/" + _namingName);
	}

	/**
	  * �f�B���N�g�����ݔ���B
	  * @return true:���݂��� / false:���݂��Ȃ�
	*/
	public boolean existsDir()
	{
		return existsDir(_namingDirectory);
	}

	/**
	  * �t�@�C�����ݔ���B
	  * @param path ����t�@�C���p�X
	  * @return true:���݂��� / false:���݂��Ȃ�
	*/
	public static boolean exists(String path)
	{
		if(null == path) return false;
		File file = new File(path);
		return file.isFile();
	}

	/**
	  * �f�B���N�g�����ݔ���B
	  * @param path ����f�B���N�g���p�X
	  * @return true:���݂��� / false:���݂��Ȃ�
	*/
	public static boolean existsDir(String path)
	{
		if(null == path) return false;
		File file = new File(path);
		return file.isDirectory();
	}

	/**
	  * �t�@�C���l�[�~���O�̍\�z�B
	*/
	public FileNaming()
	{
		_target = null;
		_applicationNo = null;
		_user = null;
		_extension = null;
		_directory = null;
		_namingName = null;
		_namingTime = null;
		_namingDirectory = null;
	}



}