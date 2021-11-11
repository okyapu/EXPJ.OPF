//------------------------------------------------------------------------------
// (#)SystemLogFileHandler.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/05/30 �V�K�쐬 M.Sakamoto
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.SystemLog;

import java.io.File;
import  java.io.IOException;
import com.nec.jp.orteus.util.logging.FileHandler;
import com.nec.jp.orteus.util.logging.LogStartupException;

/**
 * �t�@�C���n���h��
 *
 * @author  M.Sakamoto
 * @version 1.00
*/
public class SystemLogFileHandler extends FileHandler
{
	/**
	  * �g�p�\�t�@�C����T���B(FileHandler::searchAvailableFile()�̍Ē�`)
	  * @return File �g�p�\�t�@�C��
	  * @throws IOException �t�@�C���A�N�Z�X�Ɏ��s
	*/
	protected File searchAvailableFile() throws IOException
	{
		File file = new File(pattern);
		try {
			if(true == file.exists()) {
				// ���݂���
			}else{
				// ���݂��Ȃ����߁A�쐬����
				file.createNewFile();
			}
		}
		catch(IOException ioexception) {
			// ��������
		}
		if(false == file.canWrite()) {
			// �������ݕs�̂��߁A�ُ�
			throw new IOException("Log file creation failed: " + pattern);
		}
		return file;
	}

	/**
	  * ���l�[��(FileHandler::rename()�̍Ē�`)�B
	*/
	protected void rename()
	{
		String fromname = null;
		String toname = null;
		for(int i = count-2; i >= -1; i--) {
			// ���l�[�����A���l�[����̃t�@�C�����쐬
			if(i >= 0) {
				fromname = pattern + "." + i;
				toname = pattern + "." + (i + 1);
			}else{
				fromname = pattern;
				toname = pattern + "." + (i + 1);
			}

			// ���l�[��
			File fromfile = new File(fromname);
			File tofile = new File(toname);
			if(true == fromfile.exists()) {
				if(true == tofile.exists()) {
					tofile.delete();		// ���l�[����̃t�@�C�������݂��邽�ߍ폜
				}
				boolean ret = fromfile.renameTo(tofile);
				if(false == ret) {
					limit = 0;		// ���s�������߁A���ナ�l�[�����Ȃ�
				}
			}
		}
	}

	/**
	  * �t�@�C���n���h���̍\�z�B
	  * @param filename ���O�t�@�C���̃p�X
	*/
	public SystemLogFileHandler(String filename)
	{
		super(filename);
	}

	/**
	  * �t�@�C���n���h���̍\�z�B
	  * @param filename ���O�t�@�C���̃p�X
	  * @param limit ���O�t�@�C���؂�ւ��T�C�Y
	  * @param count ���O�t�@�C���o�b�N�A�b�v��
	*/
	public SystemLogFileHandler(String filename, int limit, int count)
	{
		super(filename, limit, count);
	}

}

