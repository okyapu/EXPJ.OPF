/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/systemlog/SystemLogFileHandler.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.systemlog;

import java.io.File;
import java.io.IOException;
import com.nec.jp.orteus.util.logging.FileHandler;
import com.nec.jp.orteus.util.logging.LogStartupException;

/**
 * ファイルハンドラ
 * 
 * @author $Author NIS $
 * @version $Revision 1.0 $ $Date 2004/02/01 $
*/
public class SystemLogFileHandler extends FileHandler
{
	/**
	  * 使用可能ファイルを探します。(FileHandler::searchAvailableFile()の再定義)
	  * 
	  * @return File 使用可能ファイル
	  * @throws IOException ファイルアクセスに失敗
	*/
	protected File searchAvailableFile() 
			throws IOException
	{
		File file = new File(pattern);
		try {
			if (true != file.exists()) {
				// 存在しないため、作成します
				file.createNewFile();
			}
		}
		catch(IOException ioexception) {
			// 無視します
		}
		if (false == file.canWrite()) {
			// 書き込み不可のため、異常
			throw new IOException("Log file creation failed: " + pattern);
		}
		return file;
	}

	/**
	  * リネーム(FileHandler::rename()の再定義)。
	*/
	protected void rename()
	{
		String fromname = null;
		String toname = null;
		for (int i = count-2; i >= -1; i--) {
			// リネーム元、リネーム後のファイル名作成
			if (i >= 0) {
				fromname = pattern + "." + i;
				toname = pattern + "." + (i + 1);
			}else{
				fromname = pattern;
				toname = pattern + "." + (i + 1);
			}

			// リネーム
			File fromfile = new File(fromname);
			File tofile = new File(toname);
			if (true == fromfile.exists()) {
				if (true == tofile.exists()) {
					tofile.delete();		// リネーム後のファイルが存在するため削除
				}
				boolean ret = fromfile.renameTo(tofile);
				if (false == ret) {
					limit = 0;		// 失敗したため、今後リネームしない
				}
			}
		}
	}

	/**
	  * ファイルハンドラの構築。
	  * 
	  * @param filename ログファイルのパス
	*/
	public SystemLogFileHandler(String filename)
	{
		super(filename);
	}

	/**
	  * ファイルハンドラの構築。
	  * 
	  * @param filename ログファイルのパス
	  * @param limit ログファイル切り替えサイズ
	  * @param count ログファイルバックアップ数
	*/
	public SystemLogFileHandler(String filename, int limit, int count)
	{
		super(filename, limit, count);
	}

}

