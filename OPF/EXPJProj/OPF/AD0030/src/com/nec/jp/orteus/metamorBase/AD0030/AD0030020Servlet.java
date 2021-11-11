/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030020Servlet.java,v $
 *
 * Copyright (c) 2003-2005 NEC Corporation.
 * Copyright (c) 2003-2005 NEC Informatec Systems,Ltd.
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
 * �e���v���[�g�����F
 * EXPJ    (2005/01/31),SRCGEN�Ή��A���b�Z�[�W�̑�����Ή�(MessageStruct)
 * EXPJ    (2004/09/08),FLASH SUBMIT���@�ύX
 * EXPJ    (2004/06/24),FLASH�A�g���\�b�h�ǉ�
 * EXPJ    (2004/04/20),CSV �A�b�v���[�h�@�\�ǉ�
 * EXPJ    (2004/04/09),�R�����g�C�� "���X�G�X��"->"���N�G�X�g"
 * EXPJ    (2004/04/06),user_implement ��}}�w�肷��ׂ�������{{�ɂȂ��Ă����̂��C��
 *                      setScreenCommonParams���\�b�h�Ƀp�����[�^��ǉ��i����p�j
 *                      StructDump����toString()���폜�iNull�l�΍�j
 * EXPJ    (2004/04/01),CsvOut���\�b�h�̏������폜��Control��CsvOut���\�b�h�ɂĎ��{����
 *                      user_implement_dev:<setScreenMoveParams>�𕜊�
 *                      ���퓮��̃g�����U�N�V�����������ɂ�conn.commit���s���悤�ɏC��
 * EXPJ    (2004/03/20),���r���[���ʂ𔽉f
 * EXPJ    (2004/03/13),���M���{�^���o�^�ǉ�
 * EXPJ    (2004/03/09),setScreenMoveParams���\�b�h����setScreenCommonParams���\�b�h�𕪗�
 *                      setScreenMoveParams�ďo��reload���\�b�h�ɖ߂��A�C�x���g�n���h�������setScreenCommonParams�ďo
 *                      Exception�̏������C��
 *                      SystemLog�o�̖͂��_�Ή�
 * EXPJ    (2004/03/04),���b�Z�[�W�n���i�����Ή�
 *                     ,CsvOut���\�b�h�̏�����ǉ�
 *                     ,Print���\�b�h�̏�����EXPLANNER/J�p�ɉ���
 * EXPJ    (2004/03/04),���b�Z�[�W�n���i�����Ή�
 * EXPJ    (2004/03/03),�������C��
 *                     ,Orteus�e���v���[�g�̂��Ẵo�O���C�� "reloadEvent"��"reload"
 *                     ,reloadEvent���\�b�h��control��"Select"�ŌĂяo���̂𒆎~
 *                     ,��ʑJ�ڃp�����[�^�̎擾�����Ăяo����reloadEvent���\�b�h����C�x���g�n���h���Ɉړ�
 * EXPJ    (2004/03/02),EXPLANNER/J�p�ɉ���
 * 4.0.3.8 (2004/08/02),TRUST-V�v���W�F�N�g�̃t�B�[�h�o�b�N�i�y�[�W���䕔�i�Ή��j
 * 4.0.3.7 (2004/05/24),�_�E�����[�h�Ή���ǉ��B
 * 4.0.3.6 (2004/05/21),event-type=print��ǉ��B�R�l�N�V�����̐ڑ��E�ؒf���@�̃o�O���C��
 * 4.0.3.5 (2004/05/07),Web�T�[�o�^�C�v�̏��������폜�AdefaultEvent��nextUrl�����A���O�t�@�C���̏������C��
 *                      setReferURL()->getReferURL()�A�R�l�N�V�����̐ڑ��E�ؒf���@�ύX
 * 4.0.3.4 (2004/04/07),isClick���\�b�h�̃��[�U�L�q��`�~�X���C��
 * 4.0.3.3 (2004/02/23),Control::getPdfFileName()�Ή�
 * 4.0.3.2 (2004/01/23),���[�c�[���A�g�p�R�[�h��ǉ�
 * 4.0.3.1 (2003/10/24),isClick���\�b�h��OwnCoding�̈��ǉ�
 * 4.0.3.0 (2003/10/07),bFLG_DISCONNECT_defaultEvent�̏����l��true�ɏC��
 * 4.0.2.0 (2003/08/05),Sesstion Timeout���̑J�ڎw��ǉ�
 * 4.0.1.0 (2003/05/19),Connection�t���O�̒�`�C��
 * 4.0.0.1 (2003/04/24),Struct�o�C���h�C��
 * 4.0.0.0 (2003/04/23),�N���X���W�����Ή�
 * 3.0.1.0 (2003/03/31),control method�Ăяo��,reload event�ł�Connection close�ǉ�
 * 3.0.0.0 (2003/03/19),Time,Timestamp�^�Ή�
 * 2.1.0.0 (2002/12/17),User OwnCode�����M���O�ǉ�,Logging package�C��
 * 2.0.0.1 (2002/07/05),Connection�Ή�
 * 2.0.0.0 (2002/05/27),new foundation�Ή�
 *
 */

package com.nec.jp.orteus.metamorBase.AD0030;

import com.nec.jp.orteus.util.*;
import com.nec.jp.orteus.msg.util.*;
import com.nec.jp.orteus.msg.core.*;

import com.nec.jp.orteus.xaf.foundation.*;
import com.nec.jp.orteus.xaf.common.*;
import com.nec.jp.orteus.xaf.util.*;
import com.nec.jp.orteus.xaf.wa.*;

import com.nec.jp.orteus.util.logging.*;

import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.expj.csv.*;
import com.nec.jp.orteus.expj.flash.FlashServletRequest;

import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.Date;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.io.*;

//{{user_implement_dev:import
	// TODO: ������import�p�b�P�[�W���L�q���Ă�������
//}}user_implement_dev:import

//{{user_implement_dev:header
//}}user_implement_dev:header

public class AD0030020Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
        //}}user_implement_dev:class_head

	/**
	 * Throwable��printStackTrace()�𕶎���ŕԋp���܂�
	 * @param   Throwable e  Exception
	 * @return  String  �ϊ��㕶����
	 */
	private String getStackTrace(Throwable e)
	{
		ByteArrayOutputStream temp = new ByteArrayOutputStream();
		try {
			if (e == null) {
				throw new Exception();
			}
			PrintStream out = new PrintStream(temp);
			e.printStackTrace(out);
			return temp.toString();
		} catch ( Exception ex ) {
			return "";
		} finally {
			try {
				temp.close();
			} catch (IOException ee){}
		}
	}

	/** 
	 * ��ʑJ�ڃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AD0030020Control control)
	{
		if (params == null) {
			control.setScreenMoveFlg (false);
			control.setScreenId((String)null);
			return;
		}

		if (control == null) {
			control.setScreenMoveFlg (false);
			control.setScreenId((String)null);
			return;
		}

		//��ʑJ�ڂ���̌Ăяo���ł��邩�ǂ����������p�����[�^���擾
		String[] screenMoveFlg = null;
		if(params.containsKey("SCREEN_MOVE_FLG")) {
			screenMoveFlg = (String[])params.get("SCREEN_MOVE_FLG");
		}
		else {
			screenMoveFlg = (String[])null;
		}
		if(screenMoveFlg == null) {
			control.setScreenMoveFlg (false);
		}
		else {
			control.setScreenMoveFlg (true);
		}

//{{user_implement_dev:<setScreenMoveParams>
		//��ʑJ�ڂ���̌����p�����[�^(��ʌŗL)���擾���Acontrol�̕ϐ��֊i�[
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AD0030020Control control)
	{
		if (params == null) {
			control.setButtonType((String)null);
			control.setPdfOutputType("0");
			control.setPdfOutputPrinter((String)null);
			return;
		}

		if (control == null) {
			control.setButtonType((String)null);
			control.setPdfOutputType("0");
			control.setPdfOutputPrinter((String)null);
			return;
		}

		// �����{�^�����
		if(params.containsKey("SUBMIT_BUTTON_TYPE")) {
			control.setButtonType(((String[])params.get("SUBMIT_BUTTON_TYPE"))[0]);
		}
		else {
			control.setButtonType((String)null);
		}

		// ���[�o�̓^�C�v
		if(params.containsKey("PRINTER_TYPE")) {
			control.setPdfOutputType(((String[])params.get("PRINTER_TYPE"))[0]);
		}
		else {
			control.setPdfOutputType("0");
		}

		// ���[�o�͐�
		if(params.containsKey("SELECTED_PRINTER")) {
			control.setPdfOutputPrinter(((String[])params.get("SELECTED_PRINTER"))[0]);
		}
		else {
			control.setPdfOutputPrinter((String)null);
		}

		// ���[�o�̓��X�g�p�^�[��
		if(params.containsKey("PRINT_PATTERN")) {
			control.setPdfOutputListPattern(((String[])params.get("PRINT_PATTERN"))[0]);
		}
		else {
			control.setPdfOutputListPattern("2");
		}

		// ���[�o�̓��X�g�s
		if(params.containsKey("PRINT_TARGET")) {
			control.setPdfOutputListLine((String[])params.get("PRINT_TARGET"));
		}
		else {
			control.setPdfOutputListLine((String[])null);
		}

		// ���M���v���O����ID��荞��
		if(params.containsKey("SUBMIT_PROGRAM")) {
			control.setProgramId(((String[])params.get("SUBMIT_PROGRAM"))[0]);
		}
		else {
			control.setProgramId((String)null);
		}

		// ���M�����ID��荞��
		if(params.containsKey("SUBMIT_SCREEN")) {
			control.setScreenId(((String[])params.get("SUBMIT_SCREEN"))[0]);
		}
		else {
			control.setScreenId((String)null);
		}

		// �V�K��ʃt���O
		String[] newScreenFlg = null;
		if(params.containsKey("NEW_SCREEN_FLG")) {
			newScreenFlg = (String[])params.get("NEW_SCREEN_FLG");
		}
		else {
			newScreenFlg = (String[])null;
		}
		if((newScreenFlg != null) && ("FALSE".equalsIgnoreCase(newScreenFlg[0]))) {
			control.setNewScreenFlg(false);
		}
		else {
			control.setNewScreenFlg(true);
		}

//{{user_implement_dev:<setScreenCommonParams>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//}}user_implement_dev:<setScreenCommonParams>

	}

	//////////////////////////////

	/**
	 * ���񎞂̂ݎ��s����鏈��
	 * initialEvent���\�b�h
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
			logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			objMessage.m_writer.write( Level.ALL, "AD0030020"+" $Revision: 1.20 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}

		return nextUrl;
	}

	/**
	 * �����[�h���̂ݎ��s����鏈��
	 * reloadEvent���\�b�h
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		try {
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

			control.control_eventHandller("reload");

		} catch ( FoundationException e ) {
//			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030020-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Select");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Clear");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	public String onClickReturn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0030020.jsp";		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickReturn");
		//{{user_implement_dev:<onClickReturn>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Return");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReturn>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickReturn");

		return nextUrl;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	public String onClickLineInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0030021.jsp";		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");
		//{{user_implement_dev:<onClickLineInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineInsert");
			
			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0030020.jsp";
			}
			
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineInsert>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");

		return nextUrl;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	public String onClickLineUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0030021.jsp";		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");
		//{{user_implement_dev:<onClickLineUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineUpdate");

			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0030020.jsp";
			}

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineUpdate>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");

		return nextUrl;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	public String onClickLineCopy(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0030021.jsp";		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickLineCopy");
		//{{user_implement_dev:<onClickLineCopy>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineCopy");

			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0030020.jsp";
			}

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineCopy>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickLineCopy");

		return nextUrl;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	public String onClickLineDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickLineDelete");
		//{{user_implement_dev:<onClickLineDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineDelete");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineDelete>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickLineDelete");

		return nextUrl;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	public String onClickSelectUnitCost(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0030021.jsp";		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");
		//{{user_implement_dev:<onClickSelectUnitCost>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("SelectUnitCost");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelectUnitCost>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0030020.jsp";		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Insert");


			if (control.getMsgStruct().getError().size() != 0 
					&& control.getScreenMoveFlg() == 0) {
				nextUrl = "/AD0030021.jsp";
			} else {
				control.setScreenMoveFlg(0);
			}



		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0030020Control�N���X�C���X�^���X
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0030020.jsp";		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Update");


			if (control.getMsgStruct().getError().size() != 0 
					&& control.getScreenMoveFlg() == 0) {
				nextUrl = "/AD0030021.jsp";
			} else {
				control.setScreenMoveFlg(0);
			}


		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AD0030020Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] WORK_ODR_CD = ((params.containsKey("WORK_ODR_CD")) ? (String[])params.get("WORK_ODR_CD") : (String[])null);
		String[] WORK_IN_PROC_CD = ((params.containsKey("WORK_IN_PROC_CD")) ? (String[])params.get("WORK_IN_PROC_CD") : (String[])null);
		String[] PROC_NAME = ((params.containsKey("PROC_NAME")) ? (String[])params.get("PROC_NAME") : (String[])null);
		String[] PROC_NO = ((params.containsKey("PROC_NO")) ? (String[])params.get("PROC_NO") : (String[])null);
		String[] OPR_INST_QTY = ((params.containsKey("OPR_INST_QTY")) ? (String[])params.get("OPR_INST_QTY") : (String[])null);
		String[] OUTSIDE_TYP = ((params.containsKey("OUTSIDE_TYP")) ? (String[])params.get("OUTSIDE_TYP") : (String[])null);
		String[] WS_CD = ((params.containsKey("WS_CD")) ? (String[])params.get("WS_CD") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] OPR_INST_CD = ((params.containsKey("OPR_INST_CD")) ? (String[])params.get("OPR_INST_CD") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] OUTSIDE_TYP_name = ((params.containsKey("OUTSIDE_TYP_name")) ? (String[])params.get("OUTSIDE_TYP_name") : (String[])null);
		String[] OUTSIDE_TYP_val = ((params.containsKey("OUTSIDE_TYP_val")) ? (String[])params.get("OUTSIDE_TYP_val") : (String[])null);
		String[] WS_NAME = ((params.containsKey("WS_NAME")) ? (String[])params.get("WS_NAME") : (String[])null);
		String[] ACPT_INSPC_TYP = ((params.containsKey("ACPT_INSPC_TYP")) ? (String[])params.get("ACPT_INSPC_TYP") : (String[])null);
		String[] ACPT_INSPC_TYP_name = ((params.containsKey("ACPT_INSPC_TYP_name")) ? (String[])params.get("ACPT_INSPC_TYP_name") : (String[])null);
		String[] ACPT_INSPC_TYP_val = ((params.containsKey("ACPT_INSPC_TYP_val")) ? (String[])params.get("ACPT_INSPC_TYP_val") : (String[])null);
		String[] CUR_CD = ((params.containsKey("CUR_CD")) ? (String[])params.get("CUR_CD") : (String[])null);
		String[] UNIT_COST = ((params.containsKey("UNIT_COST")) ? (String[])params.get("UNIT_COST") : (String[])null);
		String[] PROCESSING_COST = ((params.containsKey("PROCESSING_COST")) ? (String[])params.get("PROCESSING_COST") : (String[])null);
		String[] MATERIAL_COST = ((params.containsKey("MATERIAL_COST")) ? (String[])params.get("MATERIAL_COST") : (String[])null);
		String[] OTHER_OVERHEADS = ((params.containsKey("OTHER_OVERHEADS")) ? (String[])params.get("OTHER_OVERHEADS") : (String[])null);
		String[] DISC_AMOUNT = ((params.containsKey("DISC_AMOUNT")) ? (String[])params.get("DISC_AMOUNT") : (String[])null);
		String[] WORK_IN_PROC_COMMENT = ((params.containsKey("WORK_IN_PROC_COMMENT")) ? (String[])params.get("WORK_IN_PROC_COMMENT") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] h_UNIT_COST_TYP = ((params.containsKey("h_UNIT_COST_TYP")) ? (String[])params.get("h_UNIT_COST_TYP") : (String[])null);
		String[] CUR_NAME = ((params.containsKey("CUR_NAME")) ? (String[])params.get("CUR_NAME") : (String[])null);
		String[] UNIT_COST_TYP = ((params.containsKey("UNIT_COST_TYP")) ? (String[])params.get("UNIT_COST_TYP") : (String[])null);
		String[] UNIT_COST_TYP_name = ((params.containsKey("UNIT_COST_TYP_name")) ? (String[])params.get("UNIT_COST_TYP_name") : (String[])null);
		String[] UNIT_COST_TYP_val = ((params.containsKey("UNIT_COST_TYP_val")) ? (String[])params.get("UNIT_COST_TYP_val") : (String[])null);
		String[] WORK_ODR_DLV_DATE_BY_PROC = ((params.containsKey("WORK_ODR_DLV_DATE_BY_PROC")) ? (String[])params.get("WORK_ODR_DLV_DATE_BY_PROC") : (String[])null);
		String[] OPR_INST_START_DATE_BY_PROC = ((params.containsKey("OPR_INST_START_DATE_BY_PROC")) ? (String[])params.get("OPR_INST_START_DATE_BY_PROC") : (String[])null);
		String[] WORK_ODR_DLV_DATE_BY_ITEM = ((params.containsKey("WORK_ODR_DLV_DATE_BY_ITEM")) ? (String[])params.get("WORK_ODR_DLV_DATE_BY_ITEM") : (String[])null);
		String[] OPR_INST_START_DATE_BY_ITEM = ((params.containsKey("OPR_INST_START_DATE_BY_ITEM")) ? (String[])params.get("OPR_INST_START_DATE_BY_ITEM") : (String[])null);
		String[] h_UNIT_QTY_TYP = ((params.containsKey("h_UNIT_QTY_TYP")) ? (String[])params.get("h_UNIT_QTY_TYP") : (String[])null);
		String[] h_PARENT_OD_NO = ((params.containsKey("h_PARENT_OD_NO")) ? (String[])params.get("h_PARENT_OD_NO") : (String[])null);
		String[] h_BUSINESS_OPR_DATE = ((params.containsKey("h_BUSINESS_OPR_DATE")) ? (String[])params.get("h_BUSINESS_OPR_DATE") : (String[])null);
		String[] h_ODR_START_DATE = ((params.containsKey("h_ODR_START_DATE")) ? (String[])params.get("h_ODR_START_DATE") : (String[])null);
		String[] h_PLANT_CD = ((params.containsKey("h_PLANT_CD")) ? (String[])params.get("h_PLANT_CD") : (String[])null);
		String[] h_COMPANY_CD = ((params.containsKey("h_COMPANY_CD")) ? (String[])params.get("h_COMPANY_CD") : (String[])null);
		String[] PUCH_ODR_AMOUNT = ((params.containsKey("PUCH_ODR_AMOUNT")) ? (String[])params.get("PUCH_ODR_AMOUNT") : (String[])null);
		String[] AFTER_DISC_AMOUNT = ((params.containsKey("AFTER_DISC_AMOUNT")) ? (String[])params.get("AFTER_DISC_AMOUNT") : (String[])null);
		String[] OUTSIDE_TYP_DN = ((params.containsKey("OUTSIDE_TYP_DN")) ? (String[])params.get("OUTSIDE_TYP_DN") : (String[])null);
		String[] VEND_CUR_UNIT = ((params.containsKey("VEND_CUR_UNIT")) ? (String[])params.get("VEND_CUR_UNIT") : (String[])null);
		String[] PROVISIONAL_HOME_CUR_AMOUNT = ((params.containsKey("PROVISIONAL_HOME_CUR_AMOUNT")) ? (String[])params.get("PROVISIONAL_HOME_CUR_AMOUNT") : (String[])null);
		String[] HOME_CUR_UNIT = ((params.containsKey("HOME_CUR_UNIT")) ? (String[])params.get("HOME_CUR_UNIT") : (String[])null);
		String[] EXCH_RATE = ((params.containsKey("EXCH_RATE")) ? (String[])params.get("EXCH_RATE") : (String[])null);
		String[] TAX_AMOUNT_1 = ((params.containsKey("TAX_AMOUNT_1")) ? (String[])params.get("TAX_AMOUNT_1") : (String[])null);
		String[] TAX_AMOUNT_2 = ((params.containsKey("TAX_AMOUNT_2")) ? (String[])params.get("TAX_AMOUNT_2") : (String[])null);
		String[] AMOUNT_INCLUDE_TAX = ((params.containsKey("AMOUNT_INCLUDE_TAX")) ? (String[])params.get("AMOUNT_INCLUDE_TAX") : (String[])null);
		String[] h_WORK_STS_TYP = ((params.containsKey("h_WORK_STS_TYP")) ? (String[])params.get("h_WORK_STS_TYP") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] h_VEND_DECIMAL_FIG = ((params.containsKey("h_VEND_DECIMAL_FIG")) ? (String[])params.get("h_VEND_DECIMAL_FIG") : (String[])null);
		String[] h_HOME_DECIMAL_FIG = ((params.containsKey("h_HOME_DECIMAL_FIG")) ? (String[])params.get("h_HOME_DECIMAL_FIG") : (String[])null);
		String[] h_TAX_RATE_1 = ((params.containsKey("h_TAX_RATE_1")) ? (String[])params.get("h_TAX_RATE_1") : (String[])null);
		String[] h_TAX_RATE_2 = ((params.containsKey("h_TAX_RATE_2")) ? (String[])params.get("h_TAX_RATE_2") : (String[])null);
		String[] h_TAX_RATE_3 = ((params.containsKey("h_TAX_RATE_3")) ? (String[])params.get("h_TAX_RATE_3") : (String[])null);
		String[] h_JOB_ODR_CD = ((params.containsKey("h_JOB_ODR_CD")) ? (String[])params.get("h_JOB_ODR_CD") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] TAX_AMOUNT_3 = ((params.containsKey("TAX_AMOUNT_3")) ? (String[])params.get("TAX_AMOUNT_3") : (String[])null);
		String[] h_MODIFY_COUNT_BY_ITEM = ((params.containsKey("h_MODIFY_COUNT_BY_ITEM")) ? (String[])params.get("h_MODIFY_COUNT_BY_ITEM") : (String[])null);
		String[] h_MODIFY_COUNT_BY_PROC = ((params.containsKey("h_MODIFY_COUNT_BY_PROC")) ? (String[])params.get("h_MODIFY_COUNT_BY_PROC") : (String[])null);
		String[] h_MODIFY_COUNT_OPR_INST = ((params.containsKey("h_MODIFY_COUNT_OPR_INST")) ? (String[])params.get("h_MODIFY_COUNT_OPR_INST") : (String[])null);
		String[] MRP_ODR_TYP_DN = ((params.containsKey("MRP_ODR_TYP_DN")) ? (String[])params.get("MRP_ODR_TYP_DN") : (String[])null);
		String[] h_WORK_ODR_DLV_DATE_BY_PROC = ((params.containsKey("h_WORK_ODR_DLV_DATE_BY_PROC")) ? (String[])params.get("h_WORK_ODR_DLV_DATE_BY_PROC") : (String[])null);
		String[] h_OPR_INST_START_DATE_BY_PROC = ((params.containsKey("h_OPR_INST_START_DATE_BY_PROC")) ? (String[])params.get("h_OPR_INST_START_DATE_BY_PROC") : (String[])null);
		String[] h_OPR_INST_QTY = ((params.containsKey("h_OPR_INST_QTY")) ? (String[])params.get("h_OPR_INST_QTY") : (String[])null);
		String[] h_OD_NO = ((params.containsKey("h_OD_NO")) ? (String[])params.get("h_OD_NO") : (String[])null);
		String[] SelectUnitCostFlag = ((params.containsKey("SelectUnitCostFlag")) ? (String[])params.get("SelectUnitCostFlag") : (String[])null);
		String[] h_JOB_ODR_CANCEL_NO = ((params.containsKey("h_JOB_ODR_CANCEL_NO")) ? (String[])params.get("h_JOB_ODR_CANCEL_NO") : (String[])null);
		String[] WORK_ODR_DLV_DATE_BY_ITEM_TIME = ((params.containsKey("WORK_ODR_DLV_DATE_BY_ITEM_TIME")) ? (String[])params.get("WORK_ODR_DLV_DATE_BY_ITEM_TIME") : (String[])null);
		String[] OPR_INST_START_DATE_BY_ITEM_TIME = ((params.containsKey("OPR_INST_START_DATE_BY_ITEM_TIME")) ? (String[])params.get("OPR_INST_START_DATE_BY_ITEM_TIME") : (String[])null);
		String[] WORK_ODR_DLV_DATE_BY_PROC_TIME = ((params.containsKey("WORK_ODR_DLV_DATE_BY_PROC_TIME")) ? (String[])params.get("WORK_ODR_DLV_DATE_BY_PROC_TIME") : (String[])null);
		String[] OPR_INST_START_DATE_BY_PROC_TIME = ((params.containsKey("OPR_INST_START_DATE_BY_PROC_TIME")) ? (String[])params.get("OPR_INST_START_DATE_BY_PROC_TIME") : (String[])null);
		String[] h_ODR_START_DATE_TIME = ((params.containsKey("h_ODR_START_DATE_TIME")) ? (String[])params.get("h_ODR_START_DATE_TIME") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);
		String[] h_WORK_ODR_DLV_DATE_BY_PROC_TIME = ((params.containsKey("h_WORK_ODR_DLV_DATE_BY_PROC_TIME")) ? (String[])params.get("h_WORK_ODR_DLV_DATE_BY_PROC_TIME") : (String[])null);
		String[] h_OPR_INST_START_DATE_BY_PROC_TIME = ((params.containsKey("h_OPR_INST_START_DATE_BY_PROC_TIME")) ? (String[])params.get("h_OPR_INST_START_DATE_BY_PROC_TIME") : (String[])null);
		String[] h_MANHOUR_TYP = ((params.containsKey("h_MANHOUR_TYP")) ? (String[])params.get("h_MANHOUR_TYP") : (String[])null);

		struct.setWORK_ODR_CD( ((WORK_ODR_CD == null) ? (String)null : WORK_ODR_CD[0]) );
		struct.setList_WORK_ODR_CD(TypeConverter.convert(WORK_ODR_CD));
		struct.setWORK_IN_PROC_CD( ((WORK_IN_PROC_CD == null) ? (String)null : WORK_IN_PROC_CD[0]) );
		struct.setList_WORK_IN_PROC_CD(TypeConverter.convert(WORK_IN_PROC_CD));
		struct.setPROC_NAME( ((PROC_NAME == null) ? (String)null : PROC_NAME[0]) );
		struct.setList_PROC_NAME(TypeConverter.convert(PROC_NAME));
		struct.setPROC_NO( ((PROC_NO == null) ? (String)null : PROC_NO[0]) );
		struct.setList_PROC_NO(TypeConverter.convert(PROC_NO));
		struct.setOPR_INST_QTY( ((OPR_INST_QTY == null) ? (String)null : OPR_INST_QTY[0]) );
		struct.setList_OPR_INST_QTY(TypeConverter.convert(OPR_INST_QTY));
		struct.setOUTSIDE_TYP( ((OUTSIDE_TYP == null) ? (String)null : OUTSIDE_TYP[0]) );
		struct.setList_OUTSIDE_TYP(TypeConverter.convert(OUTSIDE_TYP));
		struct.setWS_CD( ((WS_CD == null) ? (String)null : WS_CD[0]) );
		struct.setList_WS_CD(TypeConverter.convert(WS_CD));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setOPR_INST_CD( ((OPR_INST_CD == null) ? (String)null : OPR_INST_CD[0]) );
		struct.setList_OPR_INST_CD(TypeConverter.convert(OPR_INST_CD));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setOUTSIDE_TYP_name( ((OUTSIDE_TYP_name == null) ? (String)null : OUTSIDE_TYP_name[0]) );
		struct.setList_OUTSIDE_TYP_name(TypeConverter.convert(OUTSIDE_TYP_name));
		struct.setOUTSIDE_TYP_val( ((OUTSIDE_TYP_val == null) ? (String)null : OUTSIDE_TYP_val[0]) );
		struct.setList_OUTSIDE_TYP_val(TypeConverter.convert(OUTSIDE_TYP_val));
		struct.setWS_NAME( ((WS_NAME == null) ? (String)null : WS_NAME[0]) );
		struct.setList_WS_NAME(TypeConverter.convert(WS_NAME));
		struct.setACPT_INSPC_TYP( ((ACPT_INSPC_TYP == null) ? (String)null : ACPT_INSPC_TYP[0]) );
		struct.setList_ACPT_INSPC_TYP(TypeConverter.convert(ACPT_INSPC_TYP));
		struct.setACPT_INSPC_TYP_name( ((ACPT_INSPC_TYP_name == null) ? (String)null : ACPT_INSPC_TYP_name[0]) );
		struct.setList_ACPT_INSPC_TYP_name(TypeConverter.convert(ACPT_INSPC_TYP_name));
		struct.setACPT_INSPC_TYP_val( ((ACPT_INSPC_TYP_val == null) ? (String)null : ACPT_INSPC_TYP_val[0]) );
		struct.setList_ACPT_INSPC_TYP_val(TypeConverter.convert(ACPT_INSPC_TYP_val));
		struct.setCUR_CD( ((CUR_CD == null) ? (String)null : CUR_CD[0]) );
		struct.setList_CUR_CD(TypeConverter.convert(CUR_CD));
		struct.setUNIT_COST( ((UNIT_COST == null) ? (String)null : UNIT_COST[0]) );
		struct.setList_UNIT_COST(TypeConverter.convert(UNIT_COST));
		struct.setPROCESSING_COST( ((PROCESSING_COST == null) ? (String)null : PROCESSING_COST[0]) );
		struct.setList_PROCESSING_COST(TypeConverter.convert(PROCESSING_COST));
		struct.setMATERIAL_COST( ((MATERIAL_COST == null) ? (String)null : MATERIAL_COST[0]) );
		struct.setList_MATERIAL_COST(TypeConverter.convert(MATERIAL_COST));
		struct.setOTHER_OVERHEADS( ((OTHER_OVERHEADS == null) ? (String)null : OTHER_OVERHEADS[0]) );
		struct.setList_OTHER_OVERHEADS(TypeConverter.convert(OTHER_OVERHEADS));
		struct.setDISC_AMOUNT( ((DISC_AMOUNT == null) ? (String)null : DISC_AMOUNT[0]) );
		struct.setList_DISC_AMOUNT(TypeConverter.convert(DISC_AMOUNT));
		struct.setWORK_IN_PROC_COMMENT( ((WORK_IN_PROC_COMMENT == null) ? (String)null : WORK_IN_PROC_COMMENT[0]) );
		struct.setList_WORK_IN_PROC_COMMENT(TypeConverter.convert(WORK_IN_PROC_COMMENT));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.seth_UNIT_COST_TYP( ((h_UNIT_COST_TYP == null) ? (String)null : h_UNIT_COST_TYP[0]) );
		struct.setList_h_UNIT_COST_TYP(TypeConverter.convert(h_UNIT_COST_TYP));
		struct.setCUR_NAME( ((CUR_NAME == null) ? (String)null : CUR_NAME[0]) );
		struct.setList_CUR_NAME(TypeConverter.convert(CUR_NAME));
		struct.setUNIT_COST_TYP( ((UNIT_COST_TYP == null) ? (String)null : UNIT_COST_TYP[0]) );
		struct.setList_UNIT_COST_TYP(TypeConverter.convert(UNIT_COST_TYP));
		struct.setUNIT_COST_TYP_name( ((UNIT_COST_TYP_name == null) ? (String)null : UNIT_COST_TYP_name[0]) );
		struct.setList_UNIT_COST_TYP_name(TypeConverter.convert(UNIT_COST_TYP_name));
		struct.setUNIT_COST_TYP_val( ((UNIT_COST_TYP_val == null) ? (String)null : UNIT_COST_TYP_val[0]) );
		struct.setList_UNIT_COST_TYP_val(TypeConverter.convert(UNIT_COST_TYP_val));
		struct.setWORK_ODR_DLV_DATE_BY_PROC( ((WORK_ODR_DLV_DATE_BY_PROC == null) ? (String)null : WORK_ODR_DLV_DATE_BY_PROC[0]) );
		struct.setList_WORK_ODR_DLV_DATE_BY_PROC(TypeConverter.convert(WORK_ODR_DLV_DATE_BY_PROC));
		struct.setOPR_INST_START_DATE_BY_PROC( ((OPR_INST_START_DATE_BY_PROC == null) ? (String)null : OPR_INST_START_DATE_BY_PROC[0]) );
		struct.setList_OPR_INST_START_DATE_BY_PROC(TypeConverter.convert(OPR_INST_START_DATE_BY_PROC));
		struct.setWORK_ODR_DLV_DATE_BY_ITEM( ((WORK_ODR_DLV_DATE_BY_ITEM == null) ? (String)null : WORK_ODR_DLV_DATE_BY_ITEM[0]) );
		struct.setList_WORK_ODR_DLV_DATE_BY_ITEM(TypeConverter.convert(WORK_ODR_DLV_DATE_BY_ITEM));
		struct.setOPR_INST_START_DATE_BY_ITEM( ((OPR_INST_START_DATE_BY_ITEM == null) ? (String)null : OPR_INST_START_DATE_BY_ITEM[0]) );
		struct.setList_OPR_INST_START_DATE_BY_ITEM(TypeConverter.convert(OPR_INST_START_DATE_BY_ITEM));
		struct.seth_UNIT_QTY_TYP( ((h_UNIT_QTY_TYP == null) ? (String)null : h_UNIT_QTY_TYP[0]) );
		struct.setList_h_UNIT_QTY_TYP(TypeConverter.convert(h_UNIT_QTY_TYP));
		struct.seth_PARENT_OD_NO( ((h_PARENT_OD_NO == null) ? (String)null : h_PARENT_OD_NO[0]) );
		struct.setList_h_PARENT_OD_NO(TypeConverter.convert(h_PARENT_OD_NO));
		struct.seth_BUSINESS_OPR_DATE( ((h_BUSINESS_OPR_DATE == null) ? (String)null : h_BUSINESS_OPR_DATE[0]) );
		struct.setList_h_BUSINESS_OPR_DATE(TypeConverter.convert(h_BUSINESS_OPR_DATE));
		struct.seth_ODR_START_DATE( ((h_ODR_START_DATE == null) ? (String)null : h_ODR_START_DATE[0]) );
		struct.setList_h_ODR_START_DATE(TypeConverter.convert(h_ODR_START_DATE));
		struct.seth_PLANT_CD( ((h_PLANT_CD == null) ? (String)null : h_PLANT_CD[0]) );
		struct.setList_h_PLANT_CD(TypeConverter.convert(h_PLANT_CD));
		struct.seth_COMPANY_CD( ((h_COMPANY_CD == null) ? (String)null : h_COMPANY_CD[0]) );
		struct.setList_h_COMPANY_CD(TypeConverter.convert(h_COMPANY_CD));
		struct.setPUCH_ODR_AMOUNT( ((PUCH_ODR_AMOUNT == null) ? (String)null : PUCH_ODR_AMOUNT[0]) );
		struct.setList_PUCH_ODR_AMOUNT(TypeConverter.convert(PUCH_ODR_AMOUNT));
		struct.setAFTER_DISC_AMOUNT( ((AFTER_DISC_AMOUNT == null) ? (String)null : AFTER_DISC_AMOUNT[0]) );
		struct.setList_AFTER_DISC_AMOUNT(TypeConverter.convert(AFTER_DISC_AMOUNT));
		struct.setOUTSIDE_TYP_DN( ((OUTSIDE_TYP_DN == null) ? (String)null : OUTSIDE_TYP_DN[0]) );
		struct.setList_OUTSIDE_TYP_DN(TypeConverter.convert(OUTSIDE_TYP_DN));
		struct.setVEND_CUR_UNIT( ((VEND_CUR_UNIT == null) ? (String)null : VEND_CUR_UNIT[0]) );
		struct.setList_VEND_CUR_UNIT(TypeConverter.convert(VEND_CUR_UNIT));
		struct.setPROVISIONAL_HOME_CUR_AMOUNT( ((PROVISIONAL_HOME_CUR_AMOUNT == null) ? (String)null : PROVISIONAL_HOME_CUR_AMOUNT[0]) );
		struct.setList_PROVISIONAL_HOME_CUR_AMOUNT(TypeConverter.convert(PROVISIONAL_HOME_CUR_AMOUNT));
		struct.setHOME_CUR_UNIT( ((HOME_CUR_UNIT == null) ? (String)null : HOME_CUR_UNIT[0]) );
		struct.setList_HOME_CUR_UNIT(TypeConverter.convert(HOME_CUR_UNIT));
		struct.setEXCH_RATE( ((EXCH_RATE == null) ? (String)null : EXCH_RATE[0]) );
		struct.setList_EXCH_RATE(TypeConverter.convert(EXCH_RATE));
		struct.setTAX_AMOUNT_1( ((TAX_AMOUNT_1 == null) ? (String)null : TAX_AMOUNT_1[0]) );
		struct.setList_TAX_AMOUNT_1(TypeConverter.convert(TAX_AMOUNT_1));
		struct.setTAX_AMOUNT_2( ((TAX_AMOUNT_2 == null) ? (String)null : TAX_AMOUNT_2[0]) );
		struct.setList_TAX_AMOUNT_2(TypeConverter.convert(TAX_AMOUNT_2));
		struct.setAMOUNT_INCLUDE_TAX( ((AMOUNT_INCLUDE_TAX == null) ? (String)null : AMOUNT_INCLUDE_TAX[0]) );
		struct.setList_AMOUNT_INCLUDE_TAX(TypeConverter.convert(AMOUNT_INCLUDE_TAX));
		struct.seth_WORK_STS_TYP( ((h_WORK_STS_TYP == null) ? (String)null : h_WORK_STS_TYP[0]) );
		struct.setList_h_WORK_STS_TYP(TypeConverter.convert(h_WORK_STS_TYP));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.seth_VEND_DECIMAL_FIG( ((h_VEND_DECIMAL_FIG == null) ? (String)null : h_VEND_DECIMAL_FIG[0]) );
		struct.setList_h_VEND_DECIMAL_FIG(TypeConverter.convert(h_VEND_DECIMAL_FIG));
		struct.seth_HOME_DECIMAL_FIG( ((h_HOME_DECIMAL_FIG == null) ? (String)null : h_HOME_DECIMAL_FIG[0]) );
		struct.setList_h_HOME_DECIMAL_FIG(TypeConverter.convert(h_HOME_DECIMAL_FIG));
		struct.seth_TAX_RATE_1( ((h_TAX_RATE_1 == null) ? (String)null : h_TAX_RATE_1[0]) );
		struct.setList_h_TAX_RATE_1(TypeConverter.convert(h_TAX_RATE_1));
		struct.seth_TAX_RATE_2( ((h_TAX_RATE_2 == null) ? (String)null : h_TAX_RATE_2[0]) );
		struct.setList_h_TAX_RATE_2(TypeConverter.convert(h_TAX_RATE_2));
		struct.seth_TAX_RATE_3( ((h_TAX_RATE_3 == null) ? (String)null : h_TAX_RATE_3[0]) );
		struct.setList_h_TAX_RATE_3(TypeConverter.convert(h_TAX_RATE_3));
		struct.seth_JOB_ODR_CD( ((h_JOB_ODR_CD == null) ? (String)null : h_JOB_ODR_CD[0]) );
		struct.setList_h_JOB_ODR_CD(TypeConverter.convert(h_JOB_ODR_CD));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.setTAX_AMOUNT_3( ((TAX_AMOUNT_3 == null) ? (String)null : TAX_AMOUNT_3[0]) );
		struct.setList_TAX_AMOUNT_3(TypeConverter.convert(TAX_AMOUNT_3));
		struct.seth_MODIFY_COUNT_BY_ITEM( ((h_MODIFY_COUNT_BY_ITEM == null) ? (String)null : h_MODIFY_COUNT_BY_ITEM[0]) );
		struct.setList_h_MODIFY_COUNT_BY_ITEM(TypeConverter.convert(h_MODIFY_COUNT_BY_ITEM));
		struct.seth_MODIFY_COUNT_BY_PROC( ((h_MODIFY_COUNT_BY_PROC == null) ? (String)null : h_MODIFY_COUNT_BY_PROC[0]) );
		struct.setList_h_MODIFY_COUNT_BY_PROC(TypeConverter.convert(h_MODIFY_COUNT_BY_PROC));
		struct.seth_MODIFY_COUNT_OPR_INST( ((h_MODIFY_COUNT_OPR_INST == null) ? (String)null : h_MODIFY_COUNT_OPR_INST[0]) );
		struct.setList_h_MODIFY_COUNT_OPR_INST(TypeConverter.convert(h_MODIFY_COUNT_OPR_INST));
		struct.setMRP_ODR_TYP_DN( ((MRP_ODR_TYP_DN == null) ? (String)null : MRP_ODR_TYP_DN[0]) );
		struct.setList_MRP_ODR_TYP_DN(TypeConverter.convert(MRP_ODR_TYP_DN));
		struct.seth_WORK_ODR_DLV_DATE_BY_PROC( ((h_WORK_ODR_DLV_DATE_BY_PROC == null) ? (String)null : h_WORK_ODR_DLV_DATE_BY_PROC[0]) );
		struct.setList_h_WORK_ODR_DLV_DATE_BY_PROC(TypeConverter.convert(h_WORK_ODR_DLV_DATE_BY_PROC));
		struct.seth_OPR_INST_START_DATE_BY_PROC( ((h_OPR_INST_START_DATE_BY_PROC == null) ? (String)null : h_OPR_INST_START_DATE_BY_PROC[0]) );
		struct.setList_h_OPR_INST_START_DATE_BY_PROC(TypeConverter.convert(h_OPR_INST_START_DATE_BY_PROC));
		struct.seth_OPR_INST_QTY( ((h_OPR_INST_QTY == null) ? (String)null : h_OPR_INST_QTY[0]) );
		struct.setList_h_OPR_INST_QTY(TypeConverter.convert(h_OPR_INST_QTY));
		struct.seth_OD_NO( ((h_OD_NO == null) ? (String)null : h_OD_NO[0]) );
		struct.setList_h_OD_NO(TypeConverter.convert(h_OD_NO));
		struct.setSelectUnitCostFlag( ((SelectUnitCostFlag == null) ? (String)null : SelectUnitCostFlag[0]) );
		struct.setList_SelectUnitCostFlag(TypeConverter.convert(SelectUnitCostFlag));
		struct.seth_JOB_ODR_CANCEL_NO( ((h_JOB_ODR_CANCEL_NO == null) ? (String)null : h_JOB_ODR_CANCEL_NO[0]) );
		struct.setList_h_JOB_ODR_CANCEL_NO(TypeConverter.convert(h_JOB_ODR_CANCEL_NO));
		struct.setWORK_ODR_DLV_DATE_BY_ITEM_TIME( ((WORK_ODR_DLV_DATE_BY_ITEM_TIME == null) ? (String)null : WORK_ODR_DLV_DATE_BY_ITEM_TIME[0]) );
		struct.setList_WORK_ODR_DLV_DATE_BY_ITEM_TIME(TypeConverter.convert(WORK_ODR_DLV_DATE_BY_ITEM_TIME));
		struct.setOPR_INST_START_DATE_BY_ITEM_TIME( ((OPR_INST_START_DATE_BY_ITEM_TIME == null) ? (String)null : OPR_INST_START_DATE_BY_ITEM_TIME[0]) );
		struct.setList_OPR_INST_START_DATE_BY_ITEM_TIME(TypeConverter.convert(OPR_INST_START_DATE_BY_ITEM_TIME));
		struct.setWORK_ODR_DLV_DATE_BY_PROC_TIME( ((WORK_ODR_DLV_DATE_BY_PROC_TIME == null) ? (String)null : WORK_ODR_DLV_DATE_BY_PROC_TIME[0]) );
		struct.setList_WORK_ODR_DLV_DATE_BY_PROC_TIME(TypeConverter.convert(WORK_ODR_DLV_DATE_BY_PROC_TIME));
		struct.setOPR_INST_START_DATE_BY_PROC_TIME( ((OPR_INST_START_DATE_BY_PROC_TIME == null) ? (String)null : OPR_INST_START_DATE_BY_PROC_TIME[0]) );
		struct.setList_OPR_INST_START_DATE_BY_PROC_TIME(TypeConverter.convert(OPR_INST_START_DATE_BY_PROC_TIME));
		struct.seth_ODR_START_DATE_TIME( ((h_ODR_START_DATE_TIME == null) ? (String)null : h_ODR_START_DATE_TIME[0]) );
		struct.setList_h_ODR_START_DATE_TIME(TypeConverter.convert(h_ODR_START_DATE_TIME));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));
		struct.seth_WORK_ODR_DLV_DATE_BY_PROC_TIME( ((h_WORK_ODR_DLV_DATE_BY_PROC_TIME == null) ? (String)null : h_WORK_ODR_DLV_DATE_BY_PROC_TIME[0]) );
		struct.setList_h_WORK_ODR_DLV_DATE_BY_PROC_TIME(TypeConverter.convert(h_WORK_ODR_DLV_DATE_BY_PROC_TIME));
		struct.seth_OPR_INST_START_DATE_BY_PROC_TIME( ((h_OPR_INST_START_DATE_BY_PROC_TIME == null) ? (String)null : h_OPR_INST_START_DATE_BY_PROC_TIME[0]) );
		struct.setList_h_OPR_INST_START_DATE_BY_PROC_TIME(TypeConverter.convert(h_OPR_INST_START_DATE_BY_PROC_TIME));
		struct.seth_MANHOUR_TYP( ((h_MANHOUR_TYP == null) ? (String)null : h_MANHOUR_TYP[0]) );
		struct.setList_h_MANHOUR_TYP(TypeConverter.convert(h_MANHOUR_TYP));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AD0030020.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAD0030020Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAD0030020Struct";   // JSP��̃o�C���h��(Struct)�̎w��
	public static int WEBSERVER_TYPE = 0;                               // Web�T�[�o�^�C�v�̒�`
	public static String MENU_TARGET = "/main.jsp";					// ���j���[�y�[�W�̐ݒ�
	public static String ERROR_TARGET = "/ExpjMessage.jsp";					// �G���[�y�[�W�̐ݒ�
	public static String EVENT_STATUS = "event_status";					// Session Object�Ɋi�[����C�x���g��Ԃ�Name
	public static String BEGIN_EVENT = "begin";							// Session Object�Ɋi�[���鏉���C�x���g�̒l
	public static String EXECUTE_EVENT = "execute";						// Session Object�Ɋi�[���郊���[�h�C�x���g�̒l

	//////////////////////////////

	/**
	 * ���O���i�C���X�^���X
	 */
	public DisplayMessageUtil objMessage = new DisplayMessageUtil();

	/**
	 * �f�t�H���g�Ŏ��s����鏈��
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String defaultEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0030020Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0030020Entity entity = control.entity;
		AD0030020Struct struct = control.struct;

		if( so == null ) return ERROR_TARGET;
		if( refererURL == null ) return nextUrl;

		// �e��ʂ̏����N���̔���
		if( (so.getAttribute(refererURL) == null)&&(so.getAttribute(refererURL+EVENT_STATUS) == null) ) {
			so.setAttribute(refererURL+EVENT_STATUS,BEGIN_EVENT);
			nextUrl = initialEvent(request, response, so, params, control);
			String nextUrlTmp = reloadEvent(request, response, so, params, control);
			if(nextUrlTmp != null) {
				nextUrl = nextUrlTmp;
			}
		} else {
			so.setAttribute(refererURL,BEGIN_EVENT);
			nextUrl = reloadEvent(request, response, so, params, control);
		}

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AD0030020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

		return nextUrl;
	}

	/**
	 * �C�x���g�n���h��
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 */
	public String eventHandling(
					HttpServletRequest request,
					HttpServletResponse response) throws ServletException, IOException
	{
		ManageContainer  container;
		HttpSession so;
		Hashtable     params  = null;
		String        target  = null;
		String        refererURL = null;
		AD0030020Control control;
		AD0030020Entity  entity = null;
		AD0030020Struct  struct = null;

		try {
			container = CoreTools.getContainer();
			if (request.getAttribute("MSG_SERVLET_FORWARDED") == null) {
				params = CoreTools.getParamsList(request);
			} else {
				// Servlet�ԑJ�ڂ̏ꍇ�̓p�����[�^��ݒ肵�Ȃ��B
				params = new Hashtable();
			}
			so = request.getSession();
			
			// Session Timeout���̏���
			if(so == null || so.getAttribute("UserId") == null) return MENU_TARGET;

			// �Q�ƌ�URL�̊i�[
			refererURL = getReferURL(request);

			if( (control = (AD0030020Control)so.getAttribute("AD0030020Control_"+request.getSession(false).getId())) == null ) {
				control = new AD0030020Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AD0030020Control();
						struct = control.struct;
						entity = control.entity;
						struct.setsUser_ID( request.getRemoteUser() );
						entity.setUsrId( request.getRemoteUser() );
						control.setBusiness(Business.getCurrentBusiness(so, request));
					}
				}
			}

			// ���[�U���̃Z�b�g
			control.setUsrId( request.getRemoteUser() );
			control.setsysUSER_CD((String)request.getRemoteUser() );
			control.setsysPLANT_CD((String)so.getAttribute("PlantCd"));
			control.setsysUSER_NAME((String)so.getAttribute( "UserName" ));
			control.setsysPLANT_NAME((String)so.getAttribute( "PlantName" ));

			// ���b�Z�[�W�X�g���N�g�쐬
			if (control.getMsgStruct() == null) {
				control.createMsgStruct();
			}

			// ��ʋ��ʃp�����[�^�̎擾
			setScreenCommonParams(params, control);
			// �R�l�N�V�����̎擾
			//if(control.conn == null || control.conn.getConn() == null) { control.conn = CoreTools.getTransConnection(); }
			control.connect();
			// �\�������ݒ�
			ArrayList revokeCtrlList = Screen.getRevokeControlList(control.conn, control.getBusiness().getBusinessCd());
			Screen.setRevokeControlListToRequest(request, revokeCtrlList);

			try {
				// �C�x���g�̏���
				if( isClick(request, "Select") ) {
					if ( !isCryptical(request, so, params, "Select") ) return ERROR_TARGET;
					target = onClickSelect(request, response, so, params, control);
					control.setButton("Select");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Return") ) {
					if ( !isCryptical(request, so, params, "Return") ) return ERROR_TARGET;
					target = onClickReturn(request, response, so, params, control);
					control.setButton("Return");
				} else if( isClick(request, "LineInsert") ) {
					if ( !isCryptical(request, so, params, "LineInsert") ) return ERROR_TARGET;
					target = onClickLineInsert(request, response, so, params, control);
					control.setButton("LineInsert");
				} else if( isClick(request, "LineUpdate") ) {
					if ( !isCryptical(request, so, params, "LineUpdate") ) return ERROR_TARGET;
					target = onClickLineUpdate(request, response, so, params, control);
					control.setButton("LineUpdate");
				} else if( isClick(request, "LineCopy") ) {
					if ( !isCryptical(request, so, params, "LineCopy") ) return ERROR_TARGET;
					target = onClickLineCopy(request, response, so, params, control);
					control.setButton("LineCopy");
				} else if( isClick(request, "LineDelete") ) {
					if ( !isCryptical(request, so, params, "LineDelete") ) return ERROR_TARGET;
					target = onClickLineDelete(request, response, so, params, control);
					control.setButton("LineDelete");
				} else if( isClick(request, "SelectUnitCost") ) {
					if ( !isCryptical(request, so, params, "SelectUnitCost") ) return ERROR_TARGET;
					target = onClickSelectUnitCost(request, response, so, params, control);
					control.setButton("SelectUnitCost");
				} else if( isClick(request, "Insert") ) {
					if ( !isCryptical(request, so, params, "Insert") ) return ERROR_TARGET;
					target = onClickInsert(request, response, so, params, control);
					control.setButton("Insert");
				} else if( isClick(request, "Update") ) {
					if ( !isCryptical(request, so, params, "Update") ) return ERROR_TARGET;
					target = onClickUpdate(request, response, so, params, control);
					control.setButton("Update");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AD0030020Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
					// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                                //}}user_implement_dev:<eventHandling>

				if(target==null) { target = DEFAULT_TARGET; }

				// target�̕ҏW
				int exist = target.indexOf("?");
				String uri = null;
				String args = null;
				if(exist != -1) {
					uri = target.substring(0,exist);
					args = target.substring(exist+1,target.length());
					if((args != null) &&  (args.length() != 0) && (args.equals("") != true)) {
						target = uri + "?MSG_CONTEXT_NO=" + control.getBusiness().getContextNumber() + "&" + args;
					} else {
						target = uri + "?MSG_CONTEXT_NO=" + control.getBusiness().getContextNumber();
					}
				} else {
					target += "?MSG_CONTEXT_NO=" + control.getBusiness().getContextNumber();
				}

				// Servlet�ւ̑����̓o�^
				if (control.getBusiness().getAutoSendMessageId() != 0) {
					request.setAttribute("MSG_MESSAGE_ID", String.valueOf(control.getBusiness().getAutoSendMessageId()));
					request.setAttribute("MSG_BUSINESS_CD", control.getBusiness().getAutoSendBusinessCdTo());
					request.setAttribute("MSG_SERVLET_FORWARDED", new Object());
				}

				// JSP�ւ̑����̓o�^
				request.setAttribute(JSP_BIND_NAME_Control,control);
				request.setAttribute(JSP_BIND_NAME_Struct,control.getStruct());
				try {
					control.conn.commit();
				} catch (Exception ex){
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "Commit fault"); //�R�~�b�g���s
				}
			} catch (ExpjException ee){
				try {
					control.conn.rollback();
				} catch (Exception ex){
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "RollBack fault"); //���[���o�b�N���s
				}
				ee.printStackTrace();
				if(control.logInit){
					control.sysLog.severe( ee.getExpjMessage(), control.getsysUSER_CD()); //�G���[���b�Z�[�W
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), ee.toString()); //�G���[�ڍ�
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "ProcessId:" + control.sp.getProcId()); //�Ɩ���
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "PlantCd:" + control.getsysPLANT_CD()); //�H��R�[�h
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "UserCd:" + control.getsysUSER_CD()); //���[�U�R�[�h
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "StructDump�F" + struct); //�X�g���N�g�_���v
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), getStackTrace((Throwable)ee)); //�X�^�b�N�g���[�X
				}
				throw ee;
			} catch(Exception e) {
				try {
					control.conn.rollback();
				} catch (Exception ex){
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "RollBack fault"); //���[���o�b�N���s
				}
				ExpjException ee = new ExpjException(e, "ZZ01106");
				ee.printStackTrace();
				if(control.logInit){
					control.sysLog.severe( ee.getExpjMessage(), control.getsysUSER_CD()); //�G���[���b�Z�[�W
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), ee.toString()); //�G���[�ڍ�
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "ProcessId:" + control.sp.getProcId()); //�Ɩ���
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "PlantCd:" + control.getsysPLANT_CD()); //�H��R�[�h
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "UserCd:" + control.getsysUSER_CD()); //���[�U�R�[�h
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), "StructDump�F" + struct); //�X�g���N�g�_���v
					control.sysLog.severe("ZZ01006", control.getsysUSER_CD(), getStackTrace((Throwable)ee)); //�X�^�b�N�g���[�X
				}
				throw ee;
			} finally {
				// �R�l�N�V�����̐ؒf
				if((isClick(request, "Select") && bFLG_DISCONNECT_Select)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Return") && bFLG_DISCONNECT_Return)
				|| (isClick(request, "LineInsert") && bFLG_DISCONNECT_LineInsert)
				|| (isClick(request, "LineUpdate") && bFLG_DISCONNECT_LineUpdate)
				|| (isClick(request, "LineCopy") && bFLG_DISCONNECT_LineCopy)
				|| (isClick(request, "LineDelete") && bFLG_DISCONNECT_LineDelete)
				|| (isClick(request, "SelectUnitCost") && bFLG_DISCONNECT_SelectUnitCost)
				|| (isClick(request, "Insert") && bFLG_DISCONNECT_Insert)
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				) {
					//if(control.conn != null) {CoreTools.closeTransConnection(control.conn);}
					//control.conn = null;
					control.disconnect(control.conn);
					control.conn = null;
				} else if(bFLG_DISCONNECT_defaultEvent) {
					//if(control.conn != null) {CoreTools.closeTransConnection(control.conn);}
					//control.conn = null;
					control.disconnect(control.conn);
					control.conn = null;
				}
			}
			return target;
		} catch (ExpjException ee){
			ee.setToRequest(request);
			return ERROR_TARGET;
		} catch (FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ee.printStackTrace();
			ee.setToRequest(request);
			return ERROR_TARGET;
		} catch( Exception e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			e.printStackTrace();
			ee.setToRequest(request);
			return ERROR_TARGET;
		} finally {
			if(params!=null) params.clear();
		}
	}

	/**
	 * submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O
	 * �����ؒf���Ftrue�i�f�t�H���g�j
	 * �g�����U�N�V�����p�����Ffalse
	 * ��ݒ肵�܂��B
	 * �ݒ�l�̕ύX�̓R���X�g���N�^�ōs���Ă��������B
	 */
	private  static boolean bFLG_DISCONNECT_defaultEvent = true;
	private  static boolean bFLG_DISCONNECT_Select = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Return = true;
	private  static boolean bFLG_DISCONNECT_LineInsert = true;
	private  static boolean bFLG_DISCONNECT_LineUpdate = true;
	private  static boolean bFLG_DISCONNECT_LineCopy = true;
	private  static boolean bFLG_DISCONNECT_LineDelete = true;
	private  static boolean bFLG_DISCONNECT_SelectUnitCost = true;
	private  static boolean bFLG_DISCONNECT_Insert = true;
	private  static boolean bFLG_DISCONNECT_Update = true;

	//////////////////////////////

	// ����������
	public void init(ServletConfig config) throws ServletException
	{
		super.init( config );
		return;
	}

	// doGet���\�b�h�̏���
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FlashServletRequest req = new FlashServletRequest(request);
		move( eventHandling(req, response), req, response );
		return;
	}

	// doPost���\�b�h�̏���
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		FlashServletRequest req = new FlashServletRequest(request);
		move( eventHandling(req, response), req, response );
		return;
	}

	//////////////////////////////

	/*
	 * �w�肳�ꂽURL�Ɉړ����܂��B
	 *
	 * @param url �ړ���URL
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 *
	 */
	void move(String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// JSP�Ƀ��N�G�X�g�̃t�H���[�h
		if(url != null) {
			if (!url.startsWith("/")) {
				url = "/" + url;
			}
			ServletContext sContext = getServletContext();
			sContext.getRequestDispatcher(url).forward(request, response);
		}
		return;
	}

	/**
	 * �Q�ƌ�URL���擾���܂��B
	 */
	String getReferURL(HttpServletRequest request)
	{
		return (request.getHeader("referer") == null ? request.getRequestURI() : request.getHeader("referer"));
	}

	/*
	 * �N���b�N���ꂽ���ǂ������`�F�b�N���܂�
	 */
	boolean isClick(HttpServletRequest request, String buttonName)
	{
		// Servlet�ԑJ�ڂ̏ꍇ�́A�N���b�N�𔻒肵�Ȃ��B
		if (request.getAttribute("MSG_SERVLET_FORWARDED") != null) {
			return false;
		}

		boolean click = false;
		click = (request.getParameterValues(buttonName)==null ? false : true);
		if ( (!click) && ( "CsvIn".equals(buttonName) ) ) {
			boolean bCsvIn = false;
			try {
				bCsvIn = request.getContentType().toLowerCase().startsWith("multipart/form-data");
			} catch ( Exception e ) {
				bCsvIn = false;
			}
			click = bCsvIn;
		}
		//{{user_implement_dev:<isClick>
					// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<isClick>
		return click;
	}

	static private boolean bFLG_CSRF = true;
	static private String algorithm = null;

	/*
	 * �b�r�q�e�΍�Ƃ��āA�n�b�V�������ꂽ�Z�b�V����ID�̉�ʂ���̎�M�󋵂��`�F�b�N���܂�
	 */
	boolean isCryptical(HttpServletRequest request, HttpSession so, Hashtable params, String buttonName) throws ExpjException
	{
		if( request == null ) {
			ExpjException ee = new ExpjException((Exception)null, "ZZ01106");
			ee.add(new ExpjMessage("ZZ01006", "request is null"));
			throw ee;
		}

		if ( "CsvIn".equals(buttonName) ) {
			if ( request.getParameterValues(buttonName) == null ) {
				try {
					if ( request.getContentType().toLowerCase().startsWith("multipart/form-data") ) {
						// CSV�A�b�v���[�h���̓`�F�b�N�ΏۊO
						return true;
					}
				} catch ( Exception e ) {// NO ACTION}
				}
			}
		}

		if( bFLG_CSRF ) {
			ExpjException ee = new ExpjException((Exception)null, "ZZ01106");
			if ( so == null ) {
				ee.add(new ExpjMessage("ZZ01006", "session is null"));
				throw ee;
			}
			String sessionId = so.getId();
			if( sessionId == null ) {
				ee.add(new ExpjMessage("ZZ01006", "id from session is null"));
				throw ee;
			}

			if ( params == null ) {
				ee.add(new ExpjMessage("ZZ01006", "parameters is null"));
				throw ee;
			}
			String[] hashes = (String[])params.get("ORTEUS_HASHED");
			String hashed = null;
			if ( ( hashes != null ) && ( hashes.length > 0 ) ) {
				hashed = hashes[0];
			}
			if( hashed == null ) {
				ee.add(new ExpjMessage("ZZ01006", "keyword from screen is null"));
				throw ee;
			}

			if (algorithm == null) {
				algorithm = "SHA-1";
				try {
					algorithm = AppServerResources.getInstance().getString("orteus.csrf.algorithm");
				} catch(Exception e) {
					// NO ACTION
				}
			}
			String sessionIdHash = XafTools.getCryptString(sessionId, algorithm);
			if ( !sessionIdHash.equals(hashed) ) {
				ee.add(new ExpjMessage("ZZ01006", "session id hash is NG"));
				throw ee;
			}
		}
		return true;
	}

	/*
	 * Servlet���̎擾
	 */
	public String getServletInfo()
	{
		return "com.nec.jp.orteus.metamorBase.AD0030.AD0030020Servlet";
	}

	/**
	 * ���Ŏ��̏���
	 */
	public void destroy()
	{
		objMessage = null;
	}

	/*
	 * �W���R���X�g���N�^
	 */
	public AD0030020Servlet()
	{
		//{{user_implement_dev:<AD0030020_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Return = true;
		bFLG_DISCONNECT_LineInsert = true;
		bFLG_DISCONNECT_LineUpdate = true;
		bFLG_DISCONNECT_LineCopy = true;
		bFLG_DISCONNECT_LineDelete = true;
		bFLG_DISCONNECT_SelectUnitCost = true;
		bFLG_DISCONNECT_Insert = true;
		bFLG_DISCONNECT_Update = true;

                //}}user_implement_dev:<AD0030020_DisConnect_FLG>

		//{{user_implement_dev:<AD0030020Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AD0030020Servlet>
	}

	//////////////////////////////

}
