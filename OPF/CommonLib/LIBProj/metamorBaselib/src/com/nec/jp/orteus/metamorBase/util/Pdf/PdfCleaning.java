//------------------------------------------------------------------------------
// (#)PdfCleaning.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/17 �V�K�쐬 M.Sakamoto
// 2003/06/25 Copyright�̋L�q�C�� Y.Inada
//            �O�FCopyright (c) 2003 NEC informatec Systems,Ltd.
//            ��FCopyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc�p�R�����g�̑̍ق𐮂���
// 2003/08/27 �N���X���C�� Y.Inada
//            �O�FPrintCleaning
//            ��FPdfCleaning
// 2003/09/01 PDF�t�@�C���ێ����Ԃ̃`�F�b�N�����C�� Y.Inada
//------------------------------------------------------------------------------

package com.nec.jp.orteus.metamorBase.util.Pdf;

import com.nec.jp.orteus.metamorBase.util.common.SystemConfig;
import com.nec.jp.orteus.metamorBase.util.common.FileNaming;
import com.nec.jp.orteus.metamorBase.util.common.FileCleaner;

import java.io.File;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.InterruptedException;

/**
  * �N���[�j���O�B���[����p�ɐ�������PDF�t�@�C�����폜����B
  *
  * @author M.Sakamoto
  * @version 1.00
  */
public class PdfCleaning
{
	/**
	  * �폜(�t�@�C���w��)�B
	  * @param filename �Ώۃt�@�C����
	  * @return true�F����  false�F���s
	  */
	public boolean clear(String fileName)
	{
		// �t�@�C�����ݒ�
		if(null == fileName) return false;

		// �ݒ�l�擾
		String directory = getConfigDirectory();
		Integer interval = getConfigInterval();
		Integer retry = getConfigRetry();
		if(null == directory || null == interval || null == retry) return false;

		// ���s
		boolean ret = execClear(
				directory, fileName, null, interval, retry, CleanerThread.EXEC_MODE_FILE);
		return ret;
	}

	/**
	  * �폜(�ꊇ�폜)�B
	  * @return true�F����  false�F���s
	  */
	public boolean clear()
	{
		// �ݒ�l�擾
		String directory = getConfigDirectory();
		Date period = getConfigPeriod();
		Integer interval = getConfigInterval();
		Integer retry = getConfigRetry();
		if(null == directory || null == period || null == interval || null == retry)
			return false;

		// ���s
		boolean ret = execClear(
				directory, null, period, interval, retry, CleanerThread.EXEC_MODE_PERIOD);
		return ret;
	}

	/**
	  * �폜(�t�@�C���w�� + �ꊇ�폜)�B
	  * @param filename �Ώۃt�@�C����
	  * @return true�F����  false�F���s
	  */
	public boolean cleanup(String fileName)
	{
		// �t�@�C�����ݒ�
		if(null == fileName) return false;

		// �ݒ�l�擾
		String directory = getConfigDirectory();
		Date period = getConfigPeriod();
		Integer interval = getConfigInterval();
		Integer retry = getConfigRetry();
		if(null == directory || null == period || null == interval || null == retry)
			return false;

		// ���s
		boolean ret = execClear(
				directory, fileName, period, interval, retry, CleanerThread.EXEC_MODE_FILE_PERIOD);
		return ret;
	}

	/**
	  * �폜���s�B
	  * @param directory �f�B���N�g��
	  * @param file �t�@�C����
	  * @param period �ێ�����
	  * @param interval �C���^�[�o��
	  * @param retry ���g���C
	  * @param mode ���[�h
	  * @return true�F����  false�F���s
	  */
	private boolean execClear(
			String directory, String file, Date period, Integer interval, Integer retry, int mode)
	{
		// �X���b�h����
		CleanerThread thread = new CleanerThread();
		thread.setDirectory(directory);
		thread.setFile(file);
		thread.setPeriod(period);
		thread.setInterval(interval.intValue());
		thread.setRetry(retry.intValue());
		thread.setMode(mode);

		// �N��
		thread.start();
		return true;
	}

	/**
	  * �ݒ�l�擾(PDF�f�B���N�g��)�B
	  * @return ����:�ݒ�l ���s:null
	  */
	private String getConfigDirectory()
	{
		// �ݒ�l�擾
		String directory =
			SystemConfig.getProperty("PDF�f�B���N�g��", SystemConfig.getBundle());

		// ���ݔ���
		if(false == FileNaming.existsDir(directory)) return null;
		return directory;
	}

	/**
	  * �ݒ�l�擾(�ێ�����)�B
	  * @return ����:�ێ����� ���s:null
	  */
	private Date getConfigPeriod()
	{
		// �ݒ�l�擾
		Integer period =
			SystemConfig.getPropertyNumber("PDF�t�@�C���ێ�����(��)", SystemConfig.getBundle());
		if(null == period) return null;

		// �͈̓`�F�b�N
		if(period.intValue() < 1) return null;

		// �Ώۓ��t���쐬
		Date target = new Date(System.currentTimeMillis());
		GregorianCalendar fomatter = new GregorianCalendar();
		fomatter.setTime(target);
		fomatter.add(Calendar.DATE, (0 - period.intValue()));
		return fomatter.getTime();
	}

	/**
	  * �ݒ�l�擾(�C���^�[�o��)�B
	  * @return ����:�ݒ�l ���s:null
	  */
	private Integer getConfigInterval()
	{
		// �ݒ�l�擾
		Integer interval =
			SystemConfig.getPropertyNumber("PDF�폜�C���^�[�o��", SystemConfig.getBundle());
		if(null == interval) return null;

		// �͈̓`�F�b�N
		if(interval.intValue() < 1 || 99 < interval.intValue()) return null;
		return interval;
	}

	/**
	  * �ݒ�l�擾(���g���C��)�B
	  * @return ����:�ݒ�l ���s:null
	  */
	private Integer getConfigRetry()
	{
		// �ݒ�l�擾
		Integer retry =
			SystemConfig.getPropertyNumber("PDF�폜���g���C��", SystemConfig.getBundle());
		if(null == retry) return null;

		// �͈̓`�F�b�N
		if(retry.intValue() < 0 || 9 < retry.intValue()) return null;
		return retry;
	}

	/** �\�z�B*/
	public PdfCleaning(){}

	/**
	  * �X���b�h�N���X(�t�@�C���폜���{)�B
	  */
	private class CleanerThread extends Thread
	{
		/**
		  * �f�B���N�g���ݒ�B
		  * @param directory �f�B���N�g��
		  */
		public void setDirectory(String directory)
		{
			_directory = directory;
		}

		/**
		  * �t�@�C�����ݒ�B
		  * @param file �t�@�C����
		  */
		public void setFile(String file)
		{
			_file = file;
		}

		/**
		  * �ێ����Ԑݒ�B
		  * @param period �ێ�����
		  */
		public void setPeriod(Date period)
		{
			_period = period;
		}

		/**
		  * �C���^�[�o���ݒ�B
		  * @param interval �C���^�[�o��
		  */
		public void setInterval(int interval)
		{
			_interval = interval;
		}

		/**
		  * ���g���C�񐔐ݒ�B
		  * @param retry ���g���C��
		  */
		public void setRetry(int retry)
		{
			_retry = retry;
		}

		/**
		  * �폜���[�h�ݒ�B
		  * @param mode �폜���[�h
		  */
		public void setMode(int mode)
		{
			_mode = mode;
		}

		/**
		  * �폜�����B
		  */
		public void run()
		{
			// �폜���s(�t�@�C���w��)
			if(EXEC_MODE_FILE == _mode || EXEC_MODE_FILE_PERIOD == _mode)
				execFileDelete();

			// �폜���s(�ꊇ�폜)
			if(EXEC_MODE_PERIOD == _mode || EXEC_MODE_FILE_PERIOD == _mode)
				execPeriodDelete();
		}

		/** �폜���s(�t�@�C���w��)�B*/
		private void execFileDelete()
		{
			// ���{
			boolean continueOn = true;
			int retry = _retry;
			File file = new File(_directory + "/" + _file);
			do
			{
				// �ҋ@
				try {
					retry--;
					sleep(_interval * 1000);
				}catch(InterruptedException ex) {
					// ���荞�ݖ���
				}

				// �폜���{
				if(false == file.exists()) {
					// ������Ȃ����߁A�폜����
					continueOn = false;
				}else{
					// ���݂��邽�߁A�폜���s
					boolean ret = file.delete();
					if(true == ret)
						continueOn = false;		// �폜����
				}
			}
			while(true == continueOn  && 0 <= retry);
		}

		/** �폜���s(�ꊇ)�B*/
		private void execPeriodDelete()
		{
			// �t�@�C���N���[�i�[
			FileCleaner cleaner = new FileCleaner();
			cleaner.setTarget("PRT");
			cleaner.setExtension("pdf");
			cleaner.setDirectory(_directory);

			// ���{
			boolean continueOn = true;
			int retry = _retry;
			do
			{
				// �ҋ@
				try {
					retry--;
					sleep(_interval * 1000);
				}catch(InterruptedException ex) {
					// ���荞�ݖ���
				}

				// �폜���{
				boolean ret = cleaner.cleanupWild(_period);
				if(true == ret)
					continueOn = false;		// �폜����
			}
			while(true == continueOn  && 0 <= retry);
		}


		/** �f�B���N�g�� */
		private String _directory = null;

		/** �t�@�C���� */
		private String _file = null;

		/** �ێ����� */
		private Date _period = null;

		/** �C���^�[�o�� */
		private int _interval = 0;

		/** ���g���C�� */
		private int _retry = 0;

		/** �폜���[�h */
		private int _mode = EXEC_MODE_NONE;

		/** �폜���[�h �t�@�C���w�� */
		public static final int EXEC_MODE_FILE			= 1;

		/** �폜���[�h �ꊇ�폜 */
		public static final int EXEC_MODE_PERIOD		= 2;

		/** �폜���[�h �t�@�C���w��A�ꊇ�폜 */
		public static final int EXEC_MODE_FILE_PERIOD	= 3;

		/** �폜���[�h ���� */
		public static final int EXEC_MODE_NONE			= 99;
	}
}
