/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/LIBProj/expjlib/src/com/nec/jp/orteus/expj/systemlog/SystemLogFormatter.java,v $
 *
 * Copyright (c) 2003-2004 NEC Corporation.
 * Copyright (c) 2003-2004 NEC Informatec Systems,Ltd.
 *
 */

package com.nec.jp.orteus.expj.systemlog;

import java.io.StringWriter;
import java.io.PrintWriter;
import java.lang.StringBuffer;

import com.nec.jp.orteus.util.logging.SimpleFormatter;
import com.nec.jp.orteus.util.logging.LogRecord;

/**
  * �t�H�[�}�b�^�[
 * 
 * @author $Author: wang-derui $
 * @version $Revision: 1.3 $ $Date: 2008/03/26 07:28:09 $
*/
public class SystemLogFormatter extends SimpleFormatter
{
	/** 
	 * �V�X�e���̃��C���Z�p���[�^ 
	 */
	private final static String LINE_SEP = System.getProperty("line.separator");

	/** 
	 * �V�X�e���̃��C���Z�p���[�^�� 
	 */
	private final static int LINE_SEP_LEN = LINE_SEP.length();

	/** 
	 * �X�^�b�N�g���[�X�擾�p��StringWriter 
	 */
	private StringWriter _swriter = new StringWriter();

	/** 
	 * �X�^�b�N�g���[�X�擾�p��PrintWriter 
	 */
	private PrintWriter _pwriter = new PrintWriter(_swriter);

	/** 
	 * m_environment ���s��(�J����/�^�p��) 
	 */
	private  int _environment = SystemLogCommon.ENVIRONMENT_UNKOWN;

	/**
	  * ���O������̃t�H�[�}�b�g(SimpleFormatter::format()�̍Ē�`)�B
	  * 
	  * @param record ���O��񃌃R�[�h
	  * @return ���O������
	*/
	public String format(LogRecord record)
	{
		// ���x��������̉��H(7�����ɖ����Ȃ��ꍇ�A�X�y�[�X�l)
		StringBuffer level = new StringBuffer(super.getLevel(record));
		while(level.length() < 7) {
			level.append(" ");
		}

		// ������쐬(�J����/�^�p������)
		StringBuffer buff = new StringBuffer(0);
		buff.append(super.getTime(record));
		buff.append(" ");
		buff.append(level.toString());
		buff.append("- ");
		buff.append(record.getMessage());

		// �J�����̏ꍇ�A�t�����o��(�t�@�C����/�s�ԍ�)
		if (_environment == SystemLogCommon.ENVIRONMENT_DEVELOPMENT) {
			buff.append(formatDevelopmentInfo(record));
		}

		return buff.toString();
	}

	/**
	  * �J�����p�̕t�����(�\�[�X��/�s�ԍ�)���擾���܂��B
	  * 
	  * @param record ���O��񃌃R�[�h
	  * @return ���O������
	*/
	private String formatDevelopmentInfo(LogRecord record)
	{
		int ibegin = 0;
		int iend = 0;
		String stacktrace = null;
		String traceinfo = null;

		// �X�^�b�N�g���[�X���擾
		Throwable throwinfo = new Throwable();
		synchronized(_swriter) {
			throwinfo.printStackTrace(_pwriter);
			stacktrace = _swriter.toString();
			_swriter.getBuffer().setLength(0);
		}

		ibegin = stacktrace.lastIndexOf(super.getSourceClassName(record));
		if (ibegin == -1) {
			return "";	// ������Ȃ����߁A�I��
		}
		ibegin = stacktrace.indexOf(LINE_SEP, ibegin);
		if (ibegin == -1) {
			return "";	// ������Ȃ����߁A�I��
		}
		ibegin += LINE_SEP_LEN;
		iend = stacktrace.indexOf(LINE_SEP, ibegin);
		if (iend == -1) {
			return "";	// ������Ȃ����߁A�I��
		}
		traceinfo = stacktrace.substring(ibegin, iend);
		if (traceinfo == null) {
			return "";	// ������Ȃ����߁A�I��
		}

		// �t�@�C����/�s�ԍ����擾
		String file = null;
		String line = null;
		iend = traceinfo.lastIndexOf(':');
		if (iend == -1) {
			return "";	// ������Ȃ����߁A�I��
		}
		ibegin = traceinfo.lastIndexOf('(', iend-1);
		file = traceinfo.substring(ibegin+1, iend);
		iend = traceinfo.lastIndexOf(')');
		ibegin = traceinfo.lastIndexOf(':', iend-1);
		if (ibegin == -1) {
			return "";	// ������Ȃ����߁A�I��
		}
		line = traceinfo.substring(ibegin+1, iend);

		// ���ԋp
		StringBuffer buff = new StringBuffer(0);
		buff.append(" (");
		buff.append(file);
		buff.append(":");
		buff.append(line);
		buff.append(")");

		return buff.toString();
	}

	/**
	  * �t�H�[�}�b�^�[�̍\�z�B
	  * 
	  * @param environment �����w��
	*/
	public SystemLogFormatter(int environment)
	{
		super();
		_environment = environment;
	}

}

