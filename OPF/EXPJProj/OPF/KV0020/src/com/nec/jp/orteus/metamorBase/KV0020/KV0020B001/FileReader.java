/*
 * COPYRIGHT (C) 2002,2003   NEC INFORMATEC SYSTEMS, LTD.
 *
 * ALL RIGHTS RESERVED  BY   NEC INFORMATEC SYSTEMS, LTD.
 * THIS PROGRAM MUST BE USED SOLELY  FOR  THE PURPOSE FOR
 * WHICH IT WAS FURNISHED BY NEC INFORMATEC SYSTEMS, LTD,
 * NO PART OF THIS PROGRAM MAY BE REPRODUCED OR DISCLOSED
 * TO  OTHERS,  IN ANY FORM  WITHOUT  THE  PRIOR  WRITTEN
 * PERMISSION OF NEC INFORMATEC SYSTEMS, LTD.
 * USE OF COPYRIGHT NOTICE  DOES NOT EVIDENCE PUBLICATION
 * OF THE PROGRAM
 *
 * NEC INFORMATEC SYSTEMS  CONFIDENTIAL  AND  PROPRIETARY
 *
 * バージョン管理キーワード設定
 * $Date: 2005/03/09 08:29:29 $
 * $Revision: 1.1 $
 * $Log: FileReader.java,v $
 * Revision 1.1  2005/03/09 08:29:29  suganuma
 * no message
 *
 * Revision 1.1.1.1  2004/10/28 09:38:24  expj
 * no message
 *
 * Revision 1.1  2004/09/07 04:06:40  matsumoto
 * expj2dev､ｫ､魏ﾜﾆｰ
 *
 * Revision 1.1.1.1  2004/07/05 02:10:07  taniguchi
 * no message
 *
 * Revision 1.3  2004/07/02 12:50:50  yamakiexpj
 * system.out.println､ﾃ､ｷ､ｿ
 *
 * Revision 1.2  2004/05/24 06:12:08  yamakiexpj
 * 5/24ｴﾟﾋﾜｻ眇､ﾀｵ
 *
 * Revision 1.1  2004/02/16 03:59:13  k-noguchi
 * ファイル読み込みを独自クラスで行うように修正
 *
 */
package com.nec.jp.orteus.metamorBase.KV0020.KV0020B001;

import java.io.*;
import java.util.*;
/**
 * Title:        FileReader
 * Description:　指定されたファイルを読み込み、解析し、データを出力するクラス
 * Copyright:    Copyright (c) 2004
 * Company:      NISSIN
 * @author      K.Noguchi
 * @version 1.0  2004/02/14
 */
public class FileReader
{
	/**
     * ソース管理用
     *
     */
    private static String strVersion = "@(#) $Id: FileReader.java,v 1.1 2005/03/09 08:29:29 suganuma Exp $";

	/**
	 * 読み込んだデータを格納する
	 *
	 */
    private List vectRow;

	/**
	 * 行のインデックス値
	 *
	 */
    private int nCurRow;

	/**
	 * エンコーディング名
	 *
	 */
    private String strEncTypeName;

	/**
	 * 行を格納
	 *
	 */
    private String lineData;

	/*********************************************************
    * ファイル名を指定してFilereaderを構築する
 	* @param	strFileName	ファイル名
    * @return
    * @exception
    *********************************************************/
    public FileReader(String strFileName,String strFileEncoding)        throws Exception
    {

        vectRow = new ArrayList();
        nCurRow = -1;
        strEncTypeName = strFileEncoding;
		//ファイルを読み込む
        read(strFileName);
    }

	/*********************************************************
    * 次の要素があるかどうかを判定する。次の要素を取得
 	* @param
    * @return	次の要素がある場合True
    * @exception
    *********************************************************/
    public boolean next()
    {
        nCurRow++;
        if(nCurRow >= vectRow.size())
        {
            return false;
        } else
        {
            lineData = (String)vectRow.get(nCurRow);
            return true;
        }
    }

	/*********************************************************
    * ファイルを読み込む
 	* @param	strFileName ファイル名
    * @return
    * @exception
    *********************************************************/
    private void read(String strFileName)        throws Exception
    {
        vectRow.clear();
        FileInputStream fis = null;
        BufferedReader br = null;
		String strLine;


        try
        {

            fis = new FileInputStream(strFileName);
            if(strEncTypeName == null)
                br = new BufferedReader(new InputStreamReader(fis));
            else
                br = new BufferedReader(new InputStreamReader(fis, strEncTypeName));

            while((strLine = br.readLine()) != null)
            {
				//Vectorに追加
                vectRow.add(strLine);
            }
        }
		//エラー処理
        catch(FileNotFoundException e)
        {
			System.err.println(e.getMessage());
			e.printStackTrace();
            throw e;
        }
        catch(UnsupportedEncodingException e)
        {
			System.err.println(e.getMessage());
			e.printStackTrace();
            throw e;
        }
        catch(IOException e)
        {
			System.err.println(e.getMessage());
			e.printStackTrace();
            throw e;
        }
        finally
        {
            try
            {
				//バッファをクローズ
                if(br != null)
                    br.close();
				//ファイル入力ストリームをクローズ
                if(fis != null)
                    fis.close();
            }
			//エラー処理
            catch(IOException e)
            {
//                CmLog.log.write(16, this, "Close Failed");
            }
        }
    }

	/*********************************************************
    * 値を取得する
 	* @param
    * @return	値を返す
    * @exception
    *********************************************************/
    public String getValue()
    {
        return new String(lineData);
    }
}
