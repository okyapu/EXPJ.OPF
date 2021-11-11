/**
 *(#)SessionAttributeListener.java
 *
 * Copyright (c) 2008 NEC Informatec Systems,Ltd.
 *
 * History 2008/09/10 Orteus/Studio���̓��N���X�����ɍ쐬
 *                    EXPLANNNER/J�̃��O�ɏ����o�͂���@�\��ǉ�
 */
package com.nec.jp.orteus.expj.util;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import com.nec.jp.orteus.util.logging.*;
import com.nec.jp.orteus.expj.systemlog.*;

/**
 * ���O�C���E���O�A�E�g���O�o�̓N���X
 * ���O�C���A���O�A�E�g(�Z�b�V�����^�C���A�E�g���܂�)�����R���\�[����ʁA�y��
 * ���O�t�@�C���ɏo�͂��邽�߂̃N���X�ł��B
 * �g�p���邽�߂ɂ́A"web.xml"�t�@�C����<listener>�^�O�ŃN���X���`���Ă����K�v��
 * ����܂��B
 *
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.2 $
 */
public class SessionAttributeListener implements HttpSessionAttributeListener {

	/** 
	 * �V�X�e�����O���������s���b�Z�[�W
	 */
	private final static String initErr = "(SBM1219)�V�X�e�����O�̏������Ɏ��s���܂���";

	/**
	 * ���O�C�������o�͂��܂��B
	 */
	public void attributeAdded(HttpSessionBindingEvent sbe) {
		if("UserId".equals(sbe.getName())) {
			String message = "(SBM1220)�Z�b�V����(UserId:" + sbe.getValue() + ")���ݒ肳��܂����B";
			System.out.println(message);
			SystemLog sysLog = new SystemLog();
			boolean logInit = sysLog.init(getClass().getName());
			if(!logInit){
				//�V�X�e�����O�̏������Ɏ��s���܂���
				System.out.println(initErr);
			}
			sysLog.info("ZZ01006", (String)sbe.getValue(), message);
		}
	}

	/**
	 * ���O�A�E�g(�Z�b�V�����^�C���A�E�g�܂�)�����o�͂��܂��B
	 */
	public void attributeRemoved(HttpSessionBindingEvent sbe) {
		if("UserId".equals(sbe.getName())) {
			String message = "(SBM1221)�Z�b�V����(UserId:" + sbe.getValue() + ")���폜����܂����B";
			System.out.println(message);
			SystemLog sysLog = new SystemLog();
			boolean logInit = sysLog.init(getClass().getName());
			if(!logInit){
				//�V�X�e�����O�̏������Ɏ��s���܂���
				System.out.println(initErr);
			}
			sysLog.info("ZZ01006", (String)sbe.getValue(), message);
		}
	}

	/**
	 * �Z�b�V�������u�����ꂽ�ۂ̏����o�͂��܂��B
	 * EXPLANNERJ 2.5.0�ȑO�̊��ł́A���O�A�E�g���ɃZ�b�V�����u���������s���܂��B
	 */
	public void attributeReplaced(HttpSessionBindingEvent sbe) {
		if("UserId".equals(sbe.getName())) {
			String message = "(SBM1222)�Z�b�V����(UserId:" + sbe.getValue() + ")���u���������܂����B";
			System.out.println(message);
			SystemLog sysLog = new SystemLog();
			boolean logInit = sysLog.init(getClass().getName());
			if(!logInit){
				//�V�X�e�����O�̏������Ɏ��s���܂���
				System.out.println(initErr);
			}
			sysLog.info("ZZ01006", (String)sbe.getValue(), message);
		}
	}

}
