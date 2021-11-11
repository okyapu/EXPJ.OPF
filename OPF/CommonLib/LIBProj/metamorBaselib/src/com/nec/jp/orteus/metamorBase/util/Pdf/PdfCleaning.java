//------------------------------------------------------------------------------
// (#)PdfCleaning.java
//
// Copyright (c) 2003 NEC Informatec Systems,Ltd.
//
// 2003/06/17 新規作成 M.Sakamoto
// 2003/06/25 Copyrightの記述修正 Y.Inada
//            前：Copyright (c) 2003 NEC informatec Systems,Ltd.
//            後：Copyright (c) 2003 NEC Informatec Systems,Ltd.
//            JavaDoc用コメントの体裁を整える
// 2003/08/27 クラス名修正 Y.Inada
//            前：PrintCleaning
//            後：PdfCleaning
// 2003/09/01 PDFファイル保持期間のチェック処理修正 Y.Inada
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
  * クリーニング。帳票印刷用に生成したPDFファイルを削除する。
  *
  * @author M.Sakamoto
  * @version 1.00
  */
public class PdfCleaning
{
	/**
	  * 削除(ファイル指定)。
	  * @param filename 対象ファイル名
	  * @return true：成功  false：失敗
	  */
	public boolean clear(String fileName)
	{
		// ファイル名設定
		if(null == fileName) return false;

		// 設定値取得
		String directory = getConfigDirectory();
		Integer interval = getConfigInterval();
		Integer retry = getConfigRetry();
		if(null == directory || null == interval || null == retry) return false;

		// 実行
		boolean ret = execClear(
				directory, fileName, null, interval, retry, CleanerThread.EXEC_MODE_FILE);
		return ret;
	}

	/**
	  * 削除(一括削除)。
	  * @return true：成功  false：失敗
	  */
	public boolean clear()
	{
		// 設定値取得
		String directory = getConfigDirectory();
		Date period = getConfigPeriod();
		Integer interval = getConfigInterval();
		Integer retry = getConfigRetry();
		if(null == directory || null == period || null == interval || null == retry)
			return false;

		// 実行
		boolean ret = execClear(
				directory, null, period, interval, retry, CleanerThread.EXEC_MODE_PERIOD);
		return ret;
	}

	/**
	  * 削除(ファイル指定 + 一括削除)。
	  * @param filename 対象ファイル名
	  * @return true：成功  false：失敗
	  */
	public boolean cleanup(String fileName)
	{
		// ファイル名設定
		if(null == fileName) return false;

		// 設定値取得
		String directory = getConfigDirectory();
		Date period = getConfigPeriod();
		Integer interval = getConfigInterval();
		Integer retry = getConfigRetry();
		if(null == directory || null == period || null == interval || null == retry)
			return false;

		// 実行
		boolean ret = execClear(
				directory, fileName, period, interval, retry, CleanerThread.EXEC_MODE_FILE_PERIOD);
		return ret;
	}

	/**
	  * 削除実行。
	  * @param directory ディレクトリ
	  * @param file ファイル名
	  * @param period 保持期間
	  * @param interval インターバル
	  * @param retry リトライ
	  * @param mode モード
	  * @return true：成功  false：失敗
	  */
	private boolean execClear(
			String directory, String file, Date period, Integer interval, Integer retry, int mode)
	{
		// スレッド準備
		CleanerThread thread = new CleanerThread();
		thread.setDirectory(directory);
		thread.setFile(file);
		thread.setPeriod(period);
		thread.setInterval(interval.intValue());
		thread.setRetry(retry.intValue());
		thread.setMode(mode);

		// 起動
		thread.start();
		return true;
	}

	/**
	  * 設定値取得(PDFディレクトリ)。
	  * @return 成功:設定値 失敗:null
	  */
	private String getConfigDirectory()
	{
		// 設定値取得
		String directory =
			SystemConfig.getProperty("PDFディレクトリ", SystemConfig.getBundle());

		// 存在判定
		if(false == FileNaming.existsDir(directory)) return null;
		return directory;
	}

	/**
	  * 設定値取得(保持期間)。
	  * @return 成功:保持期間 失敗:null
	  */
	private Date getConfigPeriod()
	{
		// 設定値取得
		Integer period =
			SystemConfig.getPropertyNumber("PDFファイル保持期間(日)", SystemConfig.getBundle());
		if(null == period) return null;

		// 範囲チェック
		if(period.intValue() < 1) return null;

		// 対象日付を作成
		Date target = new Date(System.currentTimeMillis());
		GregorianCalendar fomatter = new GregorianCalendar();
		fomatter.setTime(target);
		fomatter.add(Calendar.DATE, (0 - period.intValue()));
		return fomatter.getTime();
	}

	/**
	  * 設定値取得(インターバル)。
	  * @return 成功:設定値 失敗:null
	  */
	private Integer getConfigInterval()
	{
		// 設定値取得
		Integer interval =
			SystemConfig.getPropertyNumber("PDF削除インターバル", SystemConfig.getBundle());
		if(null == interval) return null;

		// 範囲チェック
		if(interval.intValue() < 1 || 99 < interval.intValue()) return null;
		return interval;
	}

	/**
	  * 設定値取得(リトライ回数)。
	  * @return 成功:設定値 失敗:null
	  */
	private Integer getConfigRetry()
	{
		// 設定値取得
		Integer retry =
			SystemConfig.getPropertyNumber("PDF削除リトライ回数", SystemConfig.getBundle());
		if(null == retry) return null;

		// 範囲チェック
		if(retry.intValue() < 0 || 9 < retry.intValue()) return null;
		return retry;
	}

	/** 構築。*/
	public PdfCleaning(){}

	/**
	  * スレッドクラス(ファイル削除実施)。
	  */
	private class CleanerThread extends Thread
	{
		/**
		  * ディレクトリ設定。
		  * @param directory ディレクトリ
		  */
		public void setDirectory(String directory)
		{
			_directory = directory;
		}

		/**
		  * ファイル名設定。
		  * @param file ファイル名
		  */
		public void setFile(String file)
		{
			_file = file;
		}

		/**
		  * 保持期間設定。
		  * @param period 保持期間
		  */
		public void setPeriod(Date period)
		{
			_period = period;
		}

		/**
		  * インターバル設定。
		  * @param interval インターバル
		  */
		public void setInterval(int interval)
		{
			_interval = interval;
		}

		/**
		  * リトライ回数設定。
		  * @param retry リトライ回数
		  */
		public void setRetry(int retry)
		{
			_retry = retry;
		}

		/**
		  * 削除モード設定。
		  * @param mode 削除モード
		  */
		public void setMode(int mode)
		{
			_mode = mode;
		}

		/**
		  * 削除処理。
		  */
		public void run()
		{
			// 削除試行(ファイル指定)
			if(EXEC_MODE_FILE == _mode || EXEC_MODE_FILE_PERIOD == _mode)
				execFileDelete();

			// 削除試行(一括削除)
			if(EXEC_MODE_PERIOD == _mode || EXEC_MODE_FILE_PERIOD == _mode)
				execPeriodDelete();
		}

		/** 削除試行(ファイル指定)。*/
		private void execFileDelete()
		{
			// 実施
			boolean continueOn = true;
			int retry = _retry;
			File file = new File(_directory + "/" + _file);
			do
			{
				// 待機
				try {
					retry--;
					sleep(_interval * 1000);
				}catch(InterruptedException ex) {
					// 割り込み無視
				}

				// 削除実施
				if(false == file.exists()) {
					// 見つからないため、削除成功
					continueOn = false;
				}else{
					// 存在するため、削除試行
					boolean ret = file.delete();
					if(true == ret)
						continueOn = false;		// 削除成功
				}
			}
			while(true == continueOn  && 0 <= retry);
		}

		/** 削除試行(一括)。*/
		private void execPeriodDelete()
		{
			// ファイルクリーナー
			FileCleaner cleaner = new FileCleaner();
			cleaner.setTarget("PRT");
			cleaner.setExtension("pdf");
			cleaner.setDirectory(_directory);

			// 実施
			boolean continueOn = true;
			int retry = _retry;
			do
			{
				// 待機
				try {
					retry--;
					sleep(_interval * 1000);
				}catch(InterruptedException ex) {
					// 割り込み無視
				}

				// 削除実施
				boolean ret = cleaner.cleanupWild(_period);
				if(true == ret)
					continueOn = false;		// 削除成功
			}
			while(true == continueOn  && 0 <= retry);
		}


		/** ディレクトリ */
		private String _directory = null;

		/** ファイル名 */
		private String _file = null;

		/** 保持期間 */
		private Date _period = null;

		/** インターバル */
		private int _interval = 0;

		/** リトライ回数 */
		private int _retry = 0;

		/** 削除モード */
		private int _mode = EXEC_MODE_NONE;

		/** 削除モード ファイル指定 */
		public static final int EXEC_MODE_FILE			= 1;

		/** 削除モード 一括削除 */
		public static final int EXEC_MODE_PERIOD		= 2;

		/** 削除モード ファイル指定、一括削除 */
		public static final int EXEC_MODE_FILE_PERIOD	= 3;

		/** 削除モード 無効 */
		public static final int EXEC_MODE_NONE			= 99;
	}
}
