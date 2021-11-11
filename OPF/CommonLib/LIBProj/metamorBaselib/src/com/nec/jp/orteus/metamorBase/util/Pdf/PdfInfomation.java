//------------------------------------------------------------------------------
// (#)PdfInfomation.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/08/26 �V�K�쐬 Y.Inada
// 2003/09/01 JavaDoc�p�R�����g�C�� Y.Inada
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.Pdf;

/**
 * �t�@�C�����B
 * �t�@�C������ێ�����B
 *
 * @author  Y.Inada
 * @version 1.00
*/
public class PdfInfomation
{
	/**
	  * �t�@�C�����̍\�z�B
	*/
	public PdfInfomation(){}

	/**
	  * �A�v���P�[�V�����ԍ��ݒ�B
	  * @param appNo �A�v���P�[�V�����ԍ�
	*/
	public void setApplicationNo(String applicationNo)
	{
		_applicationNo = applicationNo;
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
	  * �R�����g1�ݒ�B
	  * @param comment1 �R�����g1
	*/
	public void setComment1(String comment1)
	{
		_comment1 = comment1;
	}

	/**
	  * �R�����g2�ݒ�B
	  * @param comment2 �R�����g2
	*/
	public void setComment2(String comment2)
	{
		_comment2 = comment2;
	}

	/**
	  * �R�����g3�ݒ�B
	  * @param comment3 �R�����g3
	*/
	public void setComment3(String comment3)
	{
		_comment3 = comment3;
	}

	/**
	  * �t�@�C�����ݒ�B
	  * @param fileName �t�@�C����
	*/
	public void setFileName(String fileName)
	{
		_fileName = fileName;
	}

	/**
	  * �t�@�C���쐬���ݒ�B
	  * @param fileDate �t�@�C���쐬��
	*/
	public void setFileDate(String fileDate)
	{
		_fileDate = fileDate;
	}

	/**
	  * �T�t�B�b�N�X�ݒ�B
	  * @param suffix �T�t�B�b�N�X
	*/
	public void setSuffix(String suffix)
	{
		_suffix = suffix;
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
	  * ���[�U�擾�B
	  * @return ���[�U
	*/
	public String getUser()
	{
		return _user;
	}

	/**
	  * �R�����g1�擾�B
	  * @return �R�����g1
	*/
	public String getComment1()
	{
		return _comment1;
	}

	/**
	  * �R�����g2�擾�B
	  * @return �R�����g1
	*/
	public String getComment2()
	{
		return _comment2;
	}

	/**
	  * �R�����g3�擾�B
	  * @return �R�����g1
	*/
	public String getComment3()
	{
		return _comment3;
	}

	/**
	  * �t�@�C�����擾�B
	  * @return �t�@�C����
	*/
	public String getFileName()
	{
		return _fileName;
	}

	/**
	  * �t�@�C���쐬���擾�B
	  * @return �t�@�C���쐬��
	*/
	public String getFileDate()
	{
		return _fileDate;
	}

	/**
	  * �T�t�B�b�N�X�擾�B
	  * @param �T�t�B�b�N�X
	*/
	public String getSuffix()
	{
		return _suffix;
	}

	/** ���[�U */
	private String _user = null;

	/** �A�v���P�[�V�����ԍ� */
	private String _applicationNo = null;

	/** �R�����g1 */
	private String _comment1 = null;

	/** �R�����g2 */
	private String _comment2 = null;

	/** �R�����g3 */
	private String _comment3 = null;

	/** �t�@�C���� */
	private String _fileName = null;

	/** �t�@�C���쐬�� */
	private String _fileDate = null;

	/** �T�t�B�b�N�X */
	private String _suffix = null;

}
