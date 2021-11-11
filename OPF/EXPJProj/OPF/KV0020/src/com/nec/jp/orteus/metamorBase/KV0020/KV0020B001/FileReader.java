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
 * �o�[�W�����Ǘ��L�[���[�h�ݒ�
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
 * expj2dev�����ư
 *
 * Revision 1.1.1.1  2004/07/05 02:10:07  taniguchi
 * no message
 *
 * Revision 1.3  2004/07/02 12:50:50  yamakiexpj
 * system.out.println��ä���
 *
 * Revision 1.2  2004/05/24 06:12:08  yamakiexpj
 * 5/24���ܻὤ��
 *
 * Revision 1.1  2004/02/16 03:59:13  k-noguchi
 * �t�@�C���ǂݍ��݂�Ǝ��N���X�ōs���悤�ɏC��
 *
 */
package com.nec.jp.orteus.metamorBase.KV0020.KV0020B001;

import java.io.*;
import java.util.*;
/**
 * Title:        FileReader
 * Description:�@�w�肳�ꂽ�t�@�C����ǂݍ��݁A��͂��A�f�[�^���o�͂���N���X
 * Copyright:    Copyright (c) 2004
 * Company:      NISSIN
 * @author      K.Noguchi
 * @version 1.0  2004/02/14
 */
public class FileReader
{
	/**
     * �\�[�X�Ǘ��p
     *
     */
    private static String strVersion = "@(#) $Id: FileReader.java,v 1.1 2005/03/09 08:29:29 suganuma Exp $";

	/**
	 * �ǂݍ��񂾃f�[�^���i�[����
	 *
	 */
    private List vectRow;

	/**
	 * �s�̃C���f�b�N�X�l
	 *
	 */
    private int nCurRow;

	/**
	 * �G���R�[�f�B���O��
	 *
	 */
    private String strEncTypeName;

	/**
	 * �s���i�[
	 *
	 */
    private String lineData;

	/*********************************************************
    * �t�@�C�������w�肵��Filereader���\�z����
 	* @param	strFileName	�t�@�C����
    * @return
    * @exception
    *********************************************************/
    public FileReader(String strFileName,String strFileEncoding)        throws Exception
    {

        vectRow = new ArrayList();
        nCurRow = -1;
        strEncTypeName = strFileEncoding;
		//�t�@�C����ǂݍ���
        read(strFileName);
    }

	/*********************************************************
    * ���̗v�f�����邩�ǂ����𔻒肷��B���̗v�f���擾
 	* @param
    * @return	���̗v�f������ꍇTrue
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
    * �t�@�C����ǂݍ���
 	* @param	strFileName �t�@�C����
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
				//Vector�ɒǉ�
                vectRow.add(strLine);
            }
        }
		//�G���[����
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
				//�o�b�t�@���N���[�Y
                if(br != null)
                    br.close();
				//�t�@�C�����̓X�g���[�����N���[�Y
                if(fis != null)
                    fis.close();
            }
			//�G���[����
            catch(IOException e)
            {
//                CmLog.log.write(16, this, "Close Failed");
            }
        }
    }

	/*********************************************************
    * �l���擾����
 	* @param
    * @return	�l��Ԃ�
    * @exception
    *********************************************************/
    public String getValue()
    {
        return new String(lineData);
    }
}
