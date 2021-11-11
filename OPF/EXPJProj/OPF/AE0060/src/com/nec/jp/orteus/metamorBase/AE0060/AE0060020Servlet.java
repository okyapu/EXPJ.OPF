/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0060/src/com/nec/jp/orteus/metamorBase/AE0060/AE0060020Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0060;

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

public class AE0060020Servlet extends HttpServlet
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
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AE0060020Control control)
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
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AE0060020Control control)
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
	 * @param control AE0060020Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
			logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
			//			objMessage.m_writer.write( Level.ALL, "AE0060020"+" $Revision: 1.38 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AE0060020Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		try {
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������

			control.control_eventHandller("reload");

		} catch (FoundationException e) {
			//			e.printStackTrace();
			//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0060020-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Select");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickLineInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060021.jsp";		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");
		//{{user_implement_dev:<onClickLineInsert>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineInsert");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineInsert>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");

		return nextUrl;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickLineUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060021.jsp";		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");
		//{{user_implement_dev:<onClickLineUpdate>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineUpdate");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineUpdate>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");

		return nextUrl;
	}

	/**
	 * ���������{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickCancelComplete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickCancelComplete");
		//{{user_implement_dev:<onClickCancelComplete>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CancelComplete");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCancelComplete>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickCancelComplete");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Clear");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickSelectUnitCost(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060021.jsp";		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");
		//{{user_implement_dev:<onClickSelectUnitCost>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("SelectUnitCost");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelectUnitCost>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.setNextUrl(nextUrl);
			control.control_eventHandller("Insert");
			nextUrl = control.getNextUrl();
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.setNextUrl(nextUrl);
			control.control_eventHandller("Update");
			nextUrl = control.getNextUrl();
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickReturn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickReturn");
		//{{user_implement_dev:<onClickReturn>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Return");
		} catch (FoundationException e) {
			//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReturn>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickReturn");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickInsert2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickInsert2");
		//{{user_implement_dev:<onClickInsert2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Insert2");

			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AE0060022.jsp";
			}

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert2>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickInsert2");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickUpdate2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate2");
		//{{user_implement_dev:<onClickUpdate2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Update2");

			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AE0060022.jsp";
			}

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate2>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate2");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickReturn2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickReturn2");
		//{{user_implement_dev:<onClickReturn2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Return2");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReturn2>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickReturn2");

		return nextUrl;
	}

	/**
	 * �g�p���C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickNoUserParts(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060022.jsp";		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickNoUserParts");
		//{{user_implement_dev:<onClickNoUserParts>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("NoUserParts");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickNoUserParts>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickNoUserParts");

		return nextUrl;
	}

	/**
	 * �x���i�ǉ��o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickUseParts(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060022.jsp";		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUseParts");
		//{{user_implement_dev:<onClickUseParts>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("UseParts");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUseParts>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickUseParts");

		return nextUrl;
	}

	/**
	 * ClickShow�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickClickShow(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AE0060020iframe.jsp";		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickClickShow");
		//{{user_implement_dev:<onClickClickShow>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ClickShow");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClickShow>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickClickShow");

		return nextUrl;
	}

	/**
	 * ��������{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickCancelOdrCancel(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickCancelOdrCancel");
		//{{user_implement_dev:<onClickCancelOdrCancel>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CancelOdrCancel");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCancelOdrCancel>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickCancelOdrCancel");

		return nextUrl;
	}

	/**
	 * �ڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickDetail");
		//{{user_implement_dev:<onClickDetail>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Detail");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickDetail>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickDetail");

		return nextUrl;
	}

	/**
	 * ���b�g�Ǘ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AE0060020Control�N���X�C���X�^���X
	 */
	public String onClickLotInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AE0060020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLotInsert");
		//{{user_implement_dev:<onClickLotInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LotInsert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLotInsert>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"onClickLotInsert");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AE0060020Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PUCH_ODR_CD = ((params.containsKey("PUCH_ODR_CD")) ? (String[])params.get("PUCH_ODR_CD") : (String[])null);
		String[] l_ACPT_NO = ((params.containsKey("l_ACPT_NO")) ? (String[])params.get("l_ACPT_NO") : (String[])null);
		String[] l_ACPT_QTY = ((params.containsKey("l_ACPT_QTY")) ? (String[])params.get("l_ACPT_QTY") : (String[])null);
		String[] l_WH_CD = ((params.containsKey("l_WH_CD")) ? (String[])params.get("l_WH_CD") : (String[])null);
		String[] l_WH_NAME = ((params.containsKey("l_WH_NAME")) ? (String[])params.get("l_WH_NAME") : (String[])null);
		String[] l_DLV_CD = ((params.containsKey("l_DLV_CD")) ? (String[])params.get("l_DLV_CD") : (String[])null);
		String[] l_UNIT_COST = ((params.containsKey("l_UNIT_COST")) ? (String[])params.get("l_UNIT_COST") : (String[])null);
		String[] l_ACPT_STS_TYP_DN = ((params.containsKey("l_ACPT_STS_TYP_DN")) ? (String[])params.get("l_ACPT_STS_TYP_DN") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_NAME = ((params.containsKey("VEND_NAME")) ? (String[])params.get("VEND_NAME") : (String[])null);
		String[] SUM_ACPT_QTY = ((params.containsKey("SUM_ACPT_QTY")) ? (String[])params.get("SUM_ACPT_QTY") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] ACPT_INSPC_TYP_DN = ((params.containsKey("ACPT_INSPC_TYP_DN")) ? (String[])params.get("ACPT_INSPC_TYP_DN") : (String[])null);
		String[] PUCH_ODR_DLV_DATE = ((params.containsKey("PUCH_ODR_DLV_DATE")) ? (String[])params.get("PUCH_ODR_DLV_DATE") : (String[])null);
		String[] CONFIRM_DLV_DATE = ((params.containsKey("CONFIRM_DLV_DATE")) ? (String[])params.get("CONFIRM_DLV_DATE") : (String[])null);
		String[] PUCH_ODR_SLIP_ISS_DATE = ((params.containsKey("PUCH_ODR_SLIP_ISS_DATE")) ? (String[])params.get("PUCH_ODR_SLIP_ISS_DATE") : (String[])null);
		String[] PUCH_ODR_QTY = ((params.containsKey("PUCH_ODR_QTY")) ? (String[])params.get("PUCH_ODR_QTY") : (String[])null);
		String[] WORK_IN_PROC_CD = ((params.containsKey("WORK_IN_PROC_CD")) ? (String[])params.get("WORK_IN_PROC_CD") : (String[])null);
		String[] PROC_NAME = ((params.containsKey("PROC_NAME")) ? (String[])params.get("PROC_NAME") : (String[])null);
		String[] PUCH_ODR_PERSON = ((params.containsKey("PUCH_ODR_PERSON")) ? (String[])params.get("PUCH_ODR_PERSON") : (String[])null);
		String[] USER_NAME = ((params.containsKey("USER_NAME")) ? (String[])params.get("USER_NAME") : (String[])null);
		String[] SPL_ITEM_TYP_DN = ((params.containsKey("SPL_ITEM_TYP_DN")) ? (String[])params.get("SPL_ITEM_TYP_DN") : (String[])null);
		String[] PRODUCT_TYP_DN = ((params.containsKey("PRODUCT_TYP_DN")) ? (String[])params.get("PRODUCT_TYP_DN") : (String[])null);
		String[] PUCH_ODR_STS_TYP_DN = ((params.containsKey("PUCH_ODR_STS_TYP_DN")) ? (String[])params.get("PUCH_ODR_STS_TYP_DN") : (String[])null);
		String[] NON_NO_ITEM_FLG_DN = ((params.containsKey("NON_NO_ITEM_FLG_DN")) ? (String[])params.get("NON_NO_ITEM_FLG_DN") : (String[])null);
		String[] ACPT_NO = ((params.containsKey("ACPT_NO")) ? (String[])params.get("ACPT_NO") : (String[])null);
		String[] ACPT_QTY = ((params.containsKey("ACPT_QTY")) ? (String[])params.get("ACPT_QTY") : (String[])null);
		String[] c_COMPLETE = ((params.containsKey("c_COMPLETE")) ? (String[])params.get("c_COMPLETE") : (String[])null);
		String[] BUSINESS_OPR_DATE = ((params.containsKey("BUSINESS_OPR_DATE")) ? (String[])params.get("BUSINESS_OPR_DATE") : (String[])null);
		String[] ACPT_DATE = ((params.containsKey("ACPT_DATE")) ? (String[])params.get("ACPT_DATE") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] CUR_CD = ((params.containsKey("CUR_CD")) ? (String[])params.get("CUR_CD") : (String[])null);
		String[] CUR_NAME = ((params.containsKey("CUR_NAME")) ? (String[])params.get("CUR_NAME") : (String[])null);
		String[] UNIT_COST_TYP = ((params.containsKey("UNIT_COST_TYP")) ? (String[])params.get("UNIT_COST_TYP") : (String[])null);
		String[] UNIT_COST_TYP_name = ((params.containsKey("UNIT_COST_TYP_name")) ? (String[])params.get("UNIT_COST_TYP_name") : (String[])null);
		String[] UNIT_COST_TYP_val = ((params.containsKey("UNIT_COST_TYP_val")) ? (String[])params.get("UNIT_COST_TYP_val") : (String[])null);
		String[] UNIT_COST = ((params.containsKey("UNIT_COST")) ? (String[])params.get("UNIT_COST") : (String[])null);
		String[] VEND_CUR_UNIT = ((params.containsKey("VEND_CUR_UNIT")) ? (String[])params.get("VEND_CUR_UNIT") : (String[])null);
		String[] PROCESSING_COST = ((params.containsKey("PROCESSING_COST")) ? (String[])params.get("PROCESSING_COST") : (String[])null);
		String[] TAX_AMOUNT_1 = ((params.containsKey("TAX_AMOUNT_1")) ? (String[])params.get("TAX_AMOUNT_1") : (String[])null);
		String[] TAX_RATE_1 = ((params.containsKey("TAX_RATE_1")) ? (String[])params.get("TAX_RATE_1") : (String[])null);
		String[] MATERIAL_COST = ((params.containsKey("MATERIAL_COST")) ? (String[])params.get("MATERIAL_COST") : (String[])null);
		String[] TAX_AMOUNT_2 = ((params.containsKey("TAX_AMOUNT_2")) ? (String[])params.get("TAX_AMOUNT_2") : (String[])null);
		String[] TAX_RATE_2 = ((params.containsKey("TAX_RATE_2")) ? (String[])params.get("TAX_RATE_2") : (String[])null);
		String[] OTHER_OVERHEADS = ((params.containsKey("OTHER_OVERHEADS")) ? (String[])params.get("OTHER_OVERHEADS") : (String[])null);
		String[] TAX_AMOUNT_3 = ((params.containsKey("TAX_AMOUNT_3")) ? (String[])params.get("TAX_AMOUNT_3") : (String[])null);
		String[] TAX_RATE_3 = ((params.containsKey("TAX_RATE_3")) ? (String[])params.get("TAX_RATE_3") : (String[])null);
		String[] PUCH_ODR_AMOUNT = ((params.containsKey("PUCH_ODR_AMOUNT")) ? (String[])params.get("PUCH_ODR_AMOUNT") : (String[])null);
		String[] AMOUNT_INCLUDE_TAX = ((params.containsKey("AMOUNT_INCLUDE_TAX")) ? (String[])params.get("AMOUNT_INCLUDE_TAX") : (String[])null);
		String[] DISC_AMOUNT = ((params.containsKey("DISC_AMOUNT")) ? (String[])params.get("DISC_AMOUNT") : (String[])null);
		String[] HOME_CUR_AMOUNT = ((params.containsKey("HOME_CUR_AMOUNT")) ? (String[])params.get("HOME_CUR_AMOUNT") : (String[])null);
		String[] HOME_CUR_UNIT = ((params.containsKey("HOME_CUR_UNIT")) ? (String[])params.get("HOME_CUR_UNIT") : (String[])null);
		String[] NET_AMOUNT = ((params.containsKey("NET_AMOUNT")) ? (String[])params.get("NET_AMOUNT") : (String[])null);
		String[] EXCH_RATE = ((params.containsKey("EXCH_RATE")) ? (String[])params.get("EXCH_RATE") : (String[])null);
		String[] DLV_CD = ((params.containsKey("DLV_CD")) ? (String[])params.get("DLV_CD") : (String[])null);
		String[] ACPT_RSLT_COMMENT = ((params.containsKey("ACPT_RSLT_COMMENT")) ? (String[])params.get("ACPT_RSLT_COMMENT") : (String[])null);
		String[] INSPC_CMPLT_FLG_DN = ((params.containsKey("INSPC_CMPLT_FLG_DN")) ? (String[])params.get("INSPC_CMPLT_FLG_DN") : (String[])null);
		String[] SelectUnitCostFlag = ((params.containsKey("SelectUnitCostFlag")) ? (String[])params.get("SelectUnitCostFlag") : (String[])null);
		String[] PUCH_ODR_MODIFY_COUNT = ((params.containsKey("PUCH_ODR_MODIFY_COUNT")) ? (String[])params.get("PUCH_ODR_MODIFY_COUNT") : (String[])null);
		String[] ACPT_MODIFY_COUNT = ((params.containsKey("ACPT_MODIFY_COUNT")) ? (String[])params.get("ACPT_MODIFY_COUNT") : (String[])null);
		String[] ACPT_INSPC_TYP = ((params.containsKey("ACPT_INSPC_TYP")) ? (String[])params.get("ACPT_INSPC_TYP") : (String[])null);
		String[] PUCH_ODR_STS_TYP = ((params.containsKey("PUCH_ODR_STS_TYP")) ? (String[])params.get("PUCH_ODR_STS_TYP") : (String[])null);
		String[] INSPC_CMPLT_FLG = ((params.containsKey("INSPC_CMPLT_FLG")) ? (String[])params.get("INSPC_CMPLT_FLG") : (String[])null);
		String[] SPL_ITEM_TYP = ((params.containsKey("SPL_ITEM_TYP")) ? (String[])params.get("SPL_ITEM_TYP") : (String[])null);
		String[] PRODUCT_TYP = ((params.containsKey("PRODUCT_TYP")) ? (String[])params.get("PRODUCT_TYP") : (String[])null);
		String[] NON_NO_ITEM_FLG = ((params.containsKey("NON_NO_ITEM_FLG")) ? (String[])params.get("NON_NO_ITEM_FLG") : (String[])null);
		String[] UNIT_QTY_TYP_DN = ((params.containsKey("UNIT_QTY_TYP_DN")) ? (String[])params.get("UNIT_QTY_TYP_DN") : (String[])null);
		String[] UNIT_QTY_TYP = ((params.containsKey("UNIT_QTY_TYP")) ? (String[])params.get("UNIT_QTY_TYP") : (String[])null);
		String[] l_STOCK_UNIT = ((params.containsKey("l_STOCK_UNIT")) ? (String[])params.get("l_STOCK_UNIT") : (String[])null);
		String[] l_CUR_UNIT = ((params.containsKey("l_CUR_UNIT")) ? (String[])params.get("l_CUR_UNIT") : (String[])null);
		String[] SUPPLIED_ISSUE_QTY = ((params.containsKey("SUPPLIED_ISSUE_QTY")) ? (String[])params.get("SUPPLIED_ISSUE_QTY") : (String[])null);
		String[] TOTAL_ISSUE_QTY = ((params.containsKey("TOTAL_ISSUE_QTY")) ? (String[])params.get("TOTAL_ISSUE_QTY") : (String[])null);
		String[] SUPPLIED_DATE = ((params.containsKey("SUPPLIED_DATE")) ? (String[])params.get("SUPPLIED_DATE") : (String[])null);
		String[] STOCK_ON_HAND_QTY = ((params.containsKey("STOCK_ON_HAND_QTY")) ? (String[])params.get("STOCK_ON_HAND_QTY") : (String[])null);
		String[] PART_SUPPLIED_COMMENT = ((params.containsKey("PART_SUPPLIED_COMMENT")) ? (String[])params.get("PART_SUPPLIED_COMMENT") : (String[])null);
		String[] ISSUE_INST_CD = ((params.containsKey("ISSUE_INST_CD")) ? (String[])params.get("ISSUE_INST_CD") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] SUPPLIED_UNIT_NUMERATOR = ((params.containsKey("SUPPLIED_UNIT_NUMERATOR")) ? (String[])params.get("SUPPLIED_UNIT_NUMERATOR") : (String[])null);
		String[] SUPPLIED_UNIT_DENOMINATOR = ((params.containsKey("SUPPLIED_UNIT_DENOMINATOR")) ? (String[])params.get("SUPPLIED_UNIT_DENOMINATOR") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] l_SUPPLIED_GNR_TYP = ((params.containsKey("l_SUPPLIED_GNR_TYP")) ? (String[])params.get("l_SUPPLIED_GNR_TYP") : (String[])null);
		String[] l_SUPPLIED_QTY = ((params.containsKey("l_SUPPLIED_QTY")) ? (String[])params.get("l_SUPPLIED_QTY") : (String[])null);
		String[] l_TOTAL_ISSUE_QTY = ((params.containsKey("l_TOTAL_ISSUE_QTY")) ? (String[])params.get("l_TOTAL_ISSUE_QTY") : (String[])null);
		String[] l_SUPPLIED_DATE = ((params.containsKey("l_SUPPLIED_DATE")) ? (String[])params.get("l_SUPPLIED_DATE") : (String[])null);
		String[] l_HAND_QTY = ((params.containsKey("l_HAND_QTY")) ? (String[])params.get("l_HAND_QTY") : (String[])null);
		String[] l_PART_SUPPLIED_COMMENT = ((params.containsKey("l_PART_SUPPLIED_COMMENT")) ? (String[])params.get("l_PART_SUPPLIED_COMMENT") : (String[])null);
		String[] l_ISSUE_INST_CD = ((params.containsKey("l_ISSUE_INST_CD")) ? (String[])params.get("l_ISSUE_INST_CD") : (String[])null);
		String[] l_MRP_ODR_TYP = ((params.containsKey("l_MRP_ODR_TYP")) ? (String[])params.get("l_MRP_ODR_TYP") : (String[])null);
		String[] l_SUPPLIED_UNIT_DENOMINATOR = ((params.containsKey("l_SUPPLIED_UNIT_DENOMINATOR")) ? (String[])params.get("l_SUPPLIED_UNIT_DENOMINATOR") : (String[])null);
		String[] l_SUPPLIED_UNIT_NUMERATOR = ((params.containsKey("l_SUPPLIED_UNIT_NUMERATOR")) ? (String[])params.get("l_SUPPLIED_UNIT_NUMERATOR") : (String[])null);
		String[] l_STOCK_UNIT2 = ((params.containsKey("l_STOCK_UNIT2")) ? (String[])params.get("l_STOCK_UNIT2") : (String[])null);
		String[] STOCK_UNIT1 = ((params.containsKey("STOCK_UNIT1")) ? (String[])params.get("STOCK_UNIT1") : (String[])null);
		String[] STOCK_UNIT2 = ((params.containsKey("STOCK_UNIT2")) ? (String[])params.get("STOCK_UNIT2") : (String[])null);
		String[] STOCK_UNIT3 = ((params.containsKey("STOCK_UNIT3")) ? (String[])params.get("STOCK_UNIT3") : (String[])null);
		String[] STOCK_UNIT4 = ((params.containsKey("STOCK_UNIT4")) ? (String[])params.get("STOCK_UNIT4") : (String[])null);
		String[] STOCK_UNIT5 = ((params.containsKey("STOCK_UNIT5")) ? (String[])params.get("STOCK_UNIT5") : (String[])null);
		String[] l_SUPPLIED_RE_QTY = ((params.containsKey("l_SUPPLIED_RE_QTY")) ? (String[])params.get("l_SUPPLIED_RE_QTY") : (String[])null);
		String[] h_ACPT_QTY = ((params.containsKey("h_ACPT_QTY")) ? (String[])params.get("h_ACPT_QTY") : (String[])null);
		String[] h_ACPT_DATE = ((params.containsKey("h_ACPT_DATE")) ? (String[])params.get("h_ACPT_DATE") : (String[])null);
		String[] h_TOTAL_ISSUE_QTY = ((params.containsKey("h_TOTAL_ISSUE_QTY")) ? (String[])params.get("h_TOTAL_ISSUE_QTY") : (String[])null);
		String[] h_SUPPLIED_DATE = ((params.containsKey("h_SUPPLIED_DATE")) ? (String[])params.get("h_SUPPLIED_DATE") : (String[])null);
		String[] h_PART_SUPPLIED_COMMENT = ((params.containsKey("h_PART_SUPPLIED_COMMENT")) ? (String[])params.get("h_PART_SUPPLIED_COMMENT") : (String[])null);
		String[] h_PUCH_ODR_CD = ((params.containsKey("h_PUCH_ODR_CD")) ? (String[])params.get("h_PUCH_ODR_CD") : (String[])null);
		String[] l_UNIT_QTY_TYP = ((params.containsKey("l_UNIT_QTY_TYP")) ? (String[])params.get("l_UNIT_QTY_TYP") : (String[])null);
		String[] UNIT_QTY_TYP2 = ((params.containsKey("UNIT_QTY_TYP2")) ? (String[])params.get("UNIT_QTY_TYP2") : (String[])null);
		String[] h_ODR_CANCEL_SLIP_ISS_FLG = ((params.containsKey("h_ODR_CANCEL_SLIP_ISS_FLG")) ? (String[])params.get("h_ODR_CANCEL_SLIP_ISS_FLG") : (String[])null);
		String[] c_CANCEL = ((params.containsKey("c_CANCEL")) ? (String[])params.get("c_CANCEL") : (String[])null);
		String[] ODR_CANCEL_CAUSE_CD = ((params.containsKey("ODR_CANCEL_CAUSE_CD")) ? (String[])params.get("ODR_CANCEL_CAUSE_CD") : (String[])null);
		String[] h_ACPT_RSLT_COUNT = ((params.containsKey("h_ACPT_RSLT_COUNT")) ? (String[])params.get("h_ACPT_RSLT_COUNT") : (String[])null);
		String[] THIS_MONTH = ((params.containsKey("THIS_MONTH")) ? (String[])params.get("THIS_MONTH") : (String[])null);
		String[] INSTALL_FLG = ((params.containsKey("INSTALL_FLG")) ? (String[])params.get("INSTALL_FLG") : (String[])null);
		String[] PUCH_ODR_COMMENT = ((params.containsKey("PUCH_ODR_COMMENT")) ? (String[])params.get("PUCH_ODR_COMMENT") : (String[])null);
		String[] INSPC_WH_CD = ((params.containsKey("INSPC_WH_CD")) ? (String[])params.get("INSPC_WH_CD") : (String[])null);
		String[] INSPC_WH_NAME = ((params.containsKey("INSPC_WH_NAME")) ? (String[])params.get("INSPC_WH_NAME") : (String[])null);
		String[] ITEM_CD_DW = ((params.containsKey("ITEM_CD_DW")) ? (String[])params.get("ITEM_CD_DW") : (String[])null);
		String[] ITEM_NAME_DW = ((params.containsKey("ITEM_NAME_DW")) ? (String[])params.get("ITEM_NAME_DW") : (String[])null);
		String[] l_LOT_NO = ((params.containsKey("l_LOT_NO")) ? (String[])params.get("l_LOT_NO") : (String[])null);
		String[] LOT_NO = ((params.containsKey("LOT_NO")) ? (String[])params.get("LOT_NO") : (String[])null);
		String[] h_LOT_NUMBERING_TYP = ((params.containsKey("h_LOT_NUMBERING_TYP")) ? (String[])params.get("h_LOT_NUMBERING_TYP") : (String[])null);
		String[] h_LOT_CONTROL_FLG = ((params.containsKey("h_LOT_CONTROL_FLG")) ? (String[])params.get("h_LOT_CONTROL_FLG") : (String[])null);
		String[] h_FINAL_PROC_FLG = ((params.containsKey("h_FINAL_PROC_FLG")) ? (String[])params.get("h_FINAL_PROC_FLG") : (String[])null);
		String[] param1 = ((params.containsKey("param1")) ? (String[])params.get("param1") : (String[])null);
		String[] param2 = ((params.containsKey("param2")) ? (String[])params.get("param2") : (String[])null);
		String[] param3 = ((params.containsKey("param3")) ? (String[])params.get("param3") : (String[])null);
		String[] h_LINEUPDATE_FLG_1 = ((params.containsKey("h_LINEUPDATE_FLG_1")) ? (String[])params.get("h_LINEUPDATE_FLG_1") : (String[])null);
		String[] h_LINEUPDATE_FLG = ((params.containsKey("h_LINEUPDATE_FLG")) ? (String[])params.get("h_LINEUPDATE_FLG") : (String[])null);
		String[] ITEM_CD_LOT = ((params.containsKey("ITEM_CD_LOT")) ? (String[])params.get("ITEM_CD_LOT") : (String[])null);
		String[] JudgeFlg = ((params.containsKey("JudgeFlg")) ? (String[])params.get("JudgeFlg") : (String[])null);
		String[] h_LOTCTRL = ((params.containsKey("h_LOTCTRL")) ? (String[])params.get("h_LOTCTRL") : (String[])null);
		String[] h_WORK_ODR_CD = ((params.containsKey("h_WORK_ODR_CD")) ? (String[])params.get("h_WORK_ODR_CD") : (String[])null);
		String[] h_LOT_NO = ((params.containsKey("h_LOT_NO")) ? (String[])params.get("h_LOT_NO") : (String[])null);
		String[] h_BUSINESS_OPR_DATE = ((params.containsKey("h_BUSINESS_OPR_DATE")) ? (String[])params.get("h_BUSINESS_OPR_DATE") : (String[])null);
		String[] h_DATE_FLG = ((params.containsKey("h_DATE_FLG")) ? (String[])params.get("h_DATE_FLG") : (String[])null);

		struct.setPUCH_ODR_CD( ((PUCH_ODR_CD == null) ? (String)null : PUCH_ODR_CD[0]) );
		struct.setList_PUCH_ODR_CD(TypeConverter.convert(PUCH_ODR_CD));
		struct.setl_ACPT_NO( ((l_ACPT_NO == null) ? (String)null : l_ACPT_NO[0]) );
		struct.setList_l_ACPT_NO(TypeConverter.convert(l_ACPT_NO));
		struct.setl_ACPT_QTY( ((l_ACPT_QTY == null) ? (String)null : l_ACPT_QTY[0]) );
		struct.setList_l_ACPT_QTY(TypeConverter.convert(l_ACPT_QTY));
		struct.setl_WH_CD( ((l_WH_CD == null) ? (String)null : l_WH_CD[0]) );
		struct.setList_l_WH_CD(TypeConverter.convert(l_WH_CD));
		struct.setl_WH_NAME( ((l_WH_NAME == null) ? (String)null : l_WH_NAME[0]) );
		struct.setList_l_WH_NAME(TypeConverter.convert(l_WH_NAME));
		struct.setl_DLV_CD( ((l_DLV_CD == null) ? (String)null : l_DLV_CD[0]) );
		struct.setList_l_DLV_CD(TypeConverter.convert(l_DLV_CD));
		struct.setl_UNIT_COST( ((l_UNIT_COST == null) ? (String)null : l_UNIT_COST[0]) );
		struct.setList_l_UNIT_COST(TypeConverter.convert(l_UNIT_COST));
		struct.setl_ACPT_STS_TYP_DN( ((l_ACPT_STS_TYP_DN == null) ? (String)null : l_ACPT_STS_TYP_DN[0]) );
		struct.setList_l_ACPT_STS_TYP_DN(TypeConverter.convert(l_ACPT_STS_TYP_DN));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_NAME( ((VEND_NAME == null) ? (String)null : VEND_NAME[0]) );
		struct.setList_VEND_NAME(TypeConverter.convert(VEND_NAME));
		struct.setSUM_ACPT_QTY( ((SUM_ACPT_QTY == null) ? (String)null : SUM_ACPT_QTY[0]) );
		struct.setList_SUM_ACPT_QTY(TypeConverter.convert(SUM_ACPT_QTY));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setACPT_INSPC_TYP_DN( ((ACPT_INSPC_TYP_DN == null) ? (String)null : ACPT_INSPC_TYP_DN[0]) );
		struct.setList_ACPT_INSPC_TYP_DN(TypeConverter.convert(ACPT_INSPC_TYP_DN));
		struct.setPUCH_ODR_DLV_DATE( ((PUCH_ODR_DLV_DATE == null) ? (String)null : PUCH_ODR_DLV_DATE[0]) );
		struct.setList_PUCH_ODR_DLV_DATE(TypeConverter.convert(PUCH_ODR_DLV_DATE));
		struct.setCONFIRM_DLV_DATE( ((CONFIRM_DLV_DATE == null) ? (String)null : CONFIRM_DLV_DATE[0]) );
		struct.setList_CONFIRM_DLV_DATE(TypeConverter.convert(CONFIRM_DLV_DATE));
		struct.setPUCH_ODR_SLIP_ISS_DATE( ((PUCH_ODR_SLIP_ISS_DATE == null) ? (String)null : PUCH_ODR_SLIP_ISS_DATE[0]) );
		struct.setList_PUCH_ODR_SLIP_ISS_DATE(TypeConverter.convert(PUCH_ODR_SLIP_ISS_DATE));
		struct.setPUCH_ODR_QTY( ((PUCH_ODR_QTY == null) ? (String)null : PUCH_ODR_QTY[0]) );
		struct.setList_PUCH_ODR_QTY(TypeConverter.convert(PUCH_ODR_QTY));
		struct.setWORK_IN_PROC_CD( ((WORK_IN_PROC_CD == null) ? (String)null : WORK_IN_PROC_CD[0]) );
		struct.setList_WORK_IN_PROC_CD(TypeConverter.convert(WORK_IN_PROC_CD));
		struct.setPROC_NAME( ((PROC_NAME == null) ? (String)null : PROC_NAME[0]) );
		struct.setList_PROC_NAME(TypeConverter.convert(PROC_NAME));
		struct.setPUCH_ODR_PERSON( ((PUCH_ODR_PERSON == null) ? (String)null : PUCH_ODR_PERSON[0]) );
		struct.setList_PUCH_ODR_PERSON(TypeConverter.convert(PUCH_ODR_PERSON));
		struct.setUSER_NAME( ((USER_NAME == null) ? (String)null : USER_NAME[0]) );
		struct.setList_USER_NAME(TypeConverter.convert(USER_NAME));
		struct.setSPL_ITEM_TYP_DN( ((SPL_ITEM_TYP_DN == null) ? (String)null : SPL_ITEM_TYP_DN[0]) );
		struct.setList_SPL_ITEM_TYP_DN(TypeConverter.convert(SPL_ITEM_TYP_DN));
		struct.setPRODUCT_TYP_DN( ((PRODUCT_TYP_DN == null) ? (String)null : PRODUCT_TYP_DN[0]) );
		struct.setList_PRODUCT_TYP_DN(TypeConverter.convert(PRODUCT_TYP_DN));
		struct.setPUCH_ODR_STS_TYP_DN( ((PUCH_ODR_STS_TYP_DN == null) ? (String)null : PUCH_ODR_STS_TYP_DN[0]) );
		struct.setList_PUCH_ODR_STS_TYP_DN(TypeConverter.convert(PUCH_ODR_STS_TYP_DN));
		struct.setNON_NO_ITEM_FLG_DN( ((NON_NO_ITEM_FLG_DN == null) ? (String)null : NON_NO_ITEM_FLG_DN[0]) );
		struct.setList_NON_NO_ITEM_FLG_DN(TypeConverter.convert(NON_NO_ITEM_FLG_DN));
		struct.setACPT_NO( ((ACPT_NO == null) ? (String)null : ACPT_NO[0]) );
		struct.setList_ACPT_NO(TypeConverter.convert(ACPT_NO));
		struct.setACPT_QTY( ((ACPT_QTY == null) ? (String)null : ACPT_QTY[0]) );
		struct.setList_ACPT_QTY(TypeConverter.convert(ACPT_QTY));
		struct.setc_COMPLETE( ((c_COMPLETE == null) ? (String)null : c_COMPLETE[0]) );
		struct.setList_c_COMPLETE(TypeConverter.convert(c_COMPLETE));
		struct.setBUSINESS_OPR_DATE( ((BUSINESS_OPR_DATE == null) ? (String)null : BUSINESS_OPR_DATE[0]) );
		struct.setList_BUSINESS_OPR_DATE(TypeConverter.convert(BUSINESS_OPR_DATE));
		struct.setACPT_DATE( ((ACPT_DATE == null) ? (String)null : ACPT_DATE[0]) );
		struct.setList_ACPT_DATE(TypeConverter.convert(ACPT_DATE));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setCUR_CD( ((CUR_CD == null) ? (String)null : CUR_CD[0]) );
		struct.setList_CUR_CD(TypeConverter.convert(CUR_CD));
		struct.setCUR_NAME( ((CUR_NAME == null) ? (String)null : CUR_NAME[0]) );
		struct.setList_CUR_NAME(TypeConverter.convert(CUR_NAME));
		struct.setUNIT_COST_TYP( ((UNIT_COST_TYP == null) ? (String)null : UNIT_COST_TYP[0]) );
		struct.setList_UNIT_COST_TYP(TypeConverter.convert(UNIT_COST_TYP));
		struct.setUNIT_COST_TYP_name( ((UNIT_COST_TYP_name == null) ? (String)null : UNIT_COST_TYP_name[0]) );
		struct.setList_UNIT_COST_TYP_name(TypeConverter.convert(UNIT_COST_TYP_name));
		struct.setUNIT_COST_TYP_val( ((UNIT_COST_TYP_val == null) ? (String)null : UNIT_COST_TYP_val[0]) );
		struct.setList_UNIT_COST_TYP_val(TypeConverter.convert(UNIT_COST_TYP_val));
		struct.setUNIT_COST( ((UNIT_COST == null) ? (String)null : UNIT_COST[0]) );
		struct.setList_UNIT_COST(TypeConverter.convert(UNIT_COST));
		struct.setVEND_CUR_UNIT( ((VEND_CUR_UNIT == null) ? (String)null : VEND_CUR_UNIT[0]) );
		struct.setList_VEND_CUR_UNIT(TypeConverter.convert(VEND_CUR_UNIT));
		struct.setPROCESSING_COST( ((PROCESSING_COST == null) ? (String)null : PROCESSING_COST[0]) );
		struct.setList_PROCESSING_COST(TypeConverter.convert(PROCESSING_COST));
		struct.setTAX_AMOUNT_1( ((TAX_AMOUNT_1 == null) ? (String)null : TAX_AMOUNT_1[0]) );
		struct.setList_TAX_AMOUNT_1(TypeConverter.convert(TAX_AMOUNT_1));
		struct.setTAX_RATE_1( ((TAX_RATE_1 == null) ? (String)null : TAX_RATE_1[0]) );
		struct.setList_TAX_RATE_1(TypeConverter.convert(TAX_RATE_1));
		struct.setMATERIAL_COST( ((MATERIAL_COST == null) ? (String)null : MATERIAL_COST[0]) );
		struct.setList_MATERIAL_COST(TypeConverter.convert(MATERIAL_COST));
		struct.setTAX_AMOUNT_2( ((TAX_AMOUNT_2 == null) ? (String)null : TAX_AMOUNT_2[0]) );
		struct.setList_TAX_AMOUNT_2(TypeConverter.convert(TAX_AMOUNT_2));
		struct.setTAX_RATE_2( ((TAX_RATE_2 == null) ? (String)null : TAX_RATE_2[0]) );
		struct.setList_TAX_RATE_2(TypeConverter.convert(TAX_RATE_2));
		struct.setOTHER_OVERHEADS( ((OTHER_OVERHEADS == null) ? (String)null : OTHER_OVERHEADS[0]) );
		struct.setList_OTHER_OVERHEADS(TypeConverter.convert(OTHER_OVERHEADS));
		struct.setTAX_AMOUNT_3( ((TAX_AMOUNT_3 == null) ? (String)null : TAX_AMOUNT_3[0]) );
		struct.setList_TAX_AMOUNT_3(TypeConverter.convert(TAX_AMOUNT_3));
		struct.setTAX_RATE_3( ((TAX_RATE_3 == null) ? (String)null : TAX_RATE_3[0]) );
		struct.setList_TAX_RATE_3(TypeConverter.convert(TAX_RATE_3));
		struct.setPUCH_ODR_AMOUNT( ((PUCH_ODR_AMOUNT == null) ? (String)null : PUCH_ODR_AMOUNT[0]) );
		struct.setList_PUCH_ODR_AMOUNT(TypeConverter.convert(PUCH_ODR_AMOUNT));
		struct.setAMOUNT_INCLUDE_TAX( ((AMOUNT_INCLUDE_TAX == null) ? (String)null : AMOUNT_INCLUDE_TAX[0]) );
		struct.setList_AMOUNT_INCLUDE_TAX(TypeConverter.convert(AMOUNT_INCLUDE_TAX));
		struct.setDISC_AMOUNT( ((DISC_AMOUNT == null) ? (String)null : DISC_AMOUNT[0]) );
		struct.setList_DISC_AMOUNT(TypeConverter.convert(DISC_AMOUNT));
		struct.setHOME_CUR_AMOUNT( ((HOME_CUR_AMOUNT == null) ? (String)null : HOME_CUR_AMOUNT[0]) );
		struct.setList_HOME_CUR_AMOUNT(TypeConverter.convert(HOME_CUR_AMOUNT));
		struct.setHOME_CUR_UNIT( ((HOME_CUR_UNIT == null) ? (String)null : HOME_CUR_UNIT[0]) );
		struct.setList_HOME_CUR_UNIT(TypeConverter.convert(HOME_CUR_UNIT));
		struct.setNET_AMOUNT( ((NET_AMOUNT == null) ? (String)null : NET_AMOUNT[0]) );
		struct.setList_NET_AMOUNT(TypeConverter.convert(NET_AMOUNT));
		struct.setEXCH_RATE( ((EXCH_RATE == null) ? (String)null : EXCH_RATE[0]) );
		struct.setList_EXCH_RATE(TypeConverter.convert(EXCH_RATE));
		struct.setDLV_CD( ((DLV_CD == null) ? (String)null : DLV_CD[0]) );
		struct.setList_DLV_CD(TypeConverter.convert(DLV_CD));
		struct.setACPT_RSLT_COMMENT( ((ACPT_RSLT_COMMENT == null) ? (String)null : ACPT_RSLT_COMMENT[0]) );
		struct.setList_ACPT_RSLT_COMMENT(TypeConverter.convert(ACPT_RSLT_COMMENT));
		struct.setINSPC_CMPLT_FLG_DN( ((INSPC_CMPLT_FLG_DN == null) ? (String)null : INSPC_CMPLT_FLG_DN[0]) );
		struct.setList_INSPC_CMPLT_FLG_DN(TypeConverter.convert(INSPC_CMPLT_FLG_DN));
		struct.setSelectUnitCostFlag( ((SelectUnitCostFlag == null) ? (String)null : SelectUnitCostFlag[0]) );
		struct.setList_SelectUnitCostFlag(TypeConverter.convert(SelectUnitCostFlag));
		struct.setPUCH_ODR_MODIFY_COUNT( ((PUCH_ODR_MODIFY_COUNT == null) ? (String)null : PUCH_ODR_MODIFY_COUNT[0]) );
		struct.setList_PUCH_ODR_MODIFY_COUNT(TypeConverter.convert(PUCH_ODR_MODIFY_COUNT));
		struct.setACPT_MODIFY_COUNT( ((ACPT_MODIFY_COUNT == null) ? (String)null : ACPT_MODIFY_COUNT[0]) );
		struct.setList_ACPT_MODIFY_COUNT(TypeConverter.convert(ACPT_MODIFY_COUNT));
		struct.setACPT_INSPC_TYP( ((ACPT_INSPC_TYP == null) ? (String)null : ACPT_INSPC_TYP[0]) );
		struct.setList_ACPT_INSPC_TYP(TypeConverter.convert(ACPT_INSPC_TYP));
		struct.setPUCH_ODR_STS_TYP( ((PUCH_ODR_STS_TYP == null) ? (String)null : PUCH_ODR_STS_TYP[0]) );
		struct.setList_PUCH_ODR_STS_TYP(TypeConverter.convert(PUCH_ODR_STS_TYP));
		struct.setINSPC_CMPLT_FLG( ((INSPC_CMPLT_FLG == null) ? (String)null : INSPC_CMPLT_FLG[0]) );
		struct.setList_INSPC_CMPLT_FLG(TypeConverter.convert(INSPC_CMPLT_FLG));
		struct.setSPL_ITEM_TYP( ((SPL_ITEM_TYP == null) ? (String)null : SPL_ITEM_TYP[0]) );
		struct.setList_SPL_ITEM_TYP(TypeConverter.convert(SPL_ITEM_TYP));
		struct.setPRODUCT_TYP( ((PRODUCT_TYP == null) ? (String)null : PRODUCT_TYP[0]) );
		struct.setList_PRODUCT_TYP(TypeConverter.convert(PRODUCT_TYP));
		struct.setNON_NO_ITEM_FLG( ((NON_NO_ITEM_FLG == null) ? (String)null : NON_NO_ITEM_FLG[0]) );
		struct.setList_NON_NO_ITEM_FLG(TypeConverter.convert(NON_NO_ITEM_FLG));
		struct.setUNIT_QTY_TYP_DN( ((UNIT_QTY_TYP_DN == null) ? (String)null : UNIT_QTY_TYP_DN[0]) );
		struct.setList_UNIT_QTY_TYP_DN(TypeConverter.convert(UNIT_QTY_TYP_DN));
		struct.setUNIT_QTY_TYP( ((UNIT_QTY_TYP == null) ? (String)null : UNIT_QTY_TYP[0]) );
		struct.setList_UNIT_QTY_TYP(TypeConverter.convert(UNIT_QTY_TYP));
		struct.setl_STOCK_UNIT( ((l_STOCK_UNIT == null) ? (String)null : l_STOCK_UNIT[0]) );
		struct.setList_l_STOCK_UNIT(TypeConverter.convert(l_STOCK_UNIT));
		struct.setl_CUR_UNIT( ((l_CUR_UNIT == null) ? (String)null : l_CUR_UNIT[0]) );
		struct.setList_l_CUR_UNIT(TypeConverter.convert(l_CUR_UNIT));
		struct.setSUPPLIED_ISSUE_QTY( ((SUPPLIED_ISSUE_QTY == null) ? (String)null : SUPPLIED_ISSUE_QTY[0]) );
		struct.setList_SUPPLIED_ISSUE_QTY(TypeConverter.convert(SUPPLIED_ISSUE_QTY));
		struct.setTOTAL_ISSUE_QTY( ((TOTAL_ISSUE_QTY == null) ? (String)null : TOTAL_ISSUE_QTY[0]) );
		struct.setList_TOTAL_ISSUE_QTY(TypeConverter.convert(TOTAL_ISSUE_QTY));
		struct.setSUPPLIED_DATE( ((SUPPLIED_DATE == null) ? (String)null : SUPPLIED_DATE[0]) );
		struct.setList_SUPPLIED_DATE(TypeConverter.convert(SUPPLIED_DATE));
		struct.setSTOCK_ON_HAND_QTY( ((STOCK_ON_HAND_QTY == null) ? (String)null : STOCK_ON_HAND_QTY[0]) );
		struct.setList_STOCK_ON_HAND_QTY(TypeConverter.convert(STOCK_ON_HAND_QTY));
		struct.setPART_SUPPLIED_COMMENT( ((PART_SUPPLIED_COMMENT == null) ? (String)null : PART_SUPPLIED_COMMENT[0]) );
		struct.setList_PART_SUPPLIED_COMMENT(TypeConverter.convert(PART_SUPPLIED_COMMENT));
		struct.setISSUE_INST_CD( ((ISSUE_INST_CD == null) ? (String)null : ISSUE_INST_CD[0]) );
		struct.setList_ISSUE_INST_CD(TypeConverter.convert(ISSUE_INST_CD));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.setSUPPLIED_UNIT_NUMERATOR( ((SUPPLIED_UNIT_NUMERATOR == null) ? (String)null : SUPPLIED_UNIT_NUMERATOR[0]) );
		struct.setList_SUPPLIED_UNIT_NUMERATOR(TypeConverter.convert(SUPPLIED_UNIT_NUMERATOR));
		struct.setSUPPLIED_UNIT_DENOMINATOR( ((SUPPLIED_UNIT_DENOMINATOR == null) ? (String)null : SUPPLIED_UNIT_DENOMINATOR[0]) );
		struct.setList_SUPPLIED_UNIT_DENOMINATOR(TypeConverter.convert(SUPPLIED_UNIT_DENOMINATOR));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.setl_SUPPLIED_GNR_TYP( ((l_SUPPLIED_GNR_TYP == null) ? (String)null : l_SUPPLIED_GNR_TYP[0]) );
		struct.setList_l_SUPPLIED_GNR_TYP(TypeConverter.convert(l_SUPPLIED_GNR_TYP));
		struct.setl_SUPPLIED_QTY( ((l_SUPPLIED_QTY == null) ? (String)null : l_SUPPLIED_QTY[0]) );
		struct.setList_l_SUPPLIED_QTY(TypeConverter.convert(l_SUPPLIED_QTY));
		struct.setl_TOTAL_ISSUE_QTY( ((l_TOTAL_ISSUE_QTY == null) ? (String)null : l_TOTAL_ISSUE_QTY[0]) );
		struct.setList_l_TOTAL_ISSUE_QTY(TypeConverter.convert(l_TOTAL_ISSUE_QTY));
		struct.setl_SUPPLIED_DATE( ((l_SUPPLIED_DATE == null) ? (String)null : l_SUPPLIED_DATE[0]) );
		struct.setList_l_SUPPLIED_DATE(TypeConverter.convert(l_SUPPLIED_DATE));
		struct.setl_HAND_QTY( ((l_HAND_QTY == null) ? (String)null : l_HAND_QTY[0]) );
		struct.setList_l_HAND_QTY(TypeConverter.convert(l_HAND_QTY));
		struct.setl_PART_SUPPLIED_COMMENT( ((l_PART_SUPPLIED_COMMENT == null) ? (String)null : l_PART_SUPPLIED_COMMENT[0]) );
		struct.setList_l_PART_SUPPLIED_COMMENT(TypeConverter.convert(l_PART_SUPPLIED_COMMENT));
		struct.setl_ISSUE_INST_CD( ((l_ISSUE_INST_CD == null) ? (String)null : l_ISSUE_INST_CD[0]) );
		struct.setList_l_ISSUE_INST_CD(TypeConverter.convert(l_ISSUE_INST_CD));
		struct.setl_MRP_ODR_TYP( ((l_MRP_ODR_TYP == null) ? (String)null : l_MRP_ODR_TYP[0]) );
		struct.setList_l_MRP_ODR_TYP(TypeConverter.convert(l_MRP_ODR_TYP));
		struct.setl_SUPPLIED_UNIT_DENOMINATOR( ((l_SUPPLIED_UNIT_DENOMINATOR == null) ? (String)null : l_SUPPLIED_UNIT_DENOMINATOR[0]) );
		struct.setList_l_SUPPLIED_UNIT_DENOMINATOR(TypeConverter.convert(l_SUPPLIED_UNIT_DENOMINATOR));
		struct.setl_SUPPLIED_UNIT_NUMERATOR( ((l_SUPPLIED_UNIT_NUMERATOR == null) ? (String)null : l_SUPPLIED_UNIT_NUMERATOR[0]) );
		struct.setList_l_SUPPLIED_UNIT_NUMERATOR(TypeConverter.convert(l_SUPPLIED_UNIT_NUMERATOR));
		struct.setl_STOCK_UNIT2( ((l_STOCK_UNIT2 == null) ? (String)null : l_STOCK_UNIT2[0]) );
		struct.setList_l_STOCK_UNIT2(TypeConverter.convert(l_STOCK_UNIT2));
		struct.setSTOCK_UNIT1( ((STOCK_UNIT1 == null) ? (String)null : STOCK_UNIT1[0]) );
		struct.setList_STOCK_UNIT1(TypeConverter.convert(STOCK_UNIT1));
		struct.setSTOCK_UNIT2( ((STOCK_UNIT2 == null) ? (String)null : STOCK_UNIT2[0]) );
		struct.setList_STOCK_UNIT2(TypeConverter.convert(STOCK_UNIT2));
		struct.setSTOCK_UNIT3( ((STOCK_UNIT3 == null) ? (String)null : STOCK_UNIT3[0]) );
		struct.setList_STOCK_UNIT3(TypeConverter.convert(STOCK_UNIT3));
		struct.setSTOCK_UNIT4( ((STOCK_UNIT4 == null) ? (String)null : STOCK_UNIT4[0]) );
		struct.setList_STOCK_UNIT4(TypeConverter.convert(STOCK_UNIT4));
		struct.setSTOCK_UNIT5( ((STOCK_UNIT5 == null) ? (String)null : STOCK_UNIT5[0]) );
		struct.setList_STOCK_UNIT5(TypeConverter.convert(STOCK_UNIT5));
		struct.setl_SUPPLIED_RE_QTY( ((l_SUPPLIED_RE_QTY == null) ? (String)null : l_SUPPLIED_RE_QTY[0]) );
		struct.setList_l_SUPPLIED_RE_QTY(TypeConverter.convert(l_SUPPLIED_RE_QTY));
		struct.seth_ACPT_QTY( ((h_ACPT_QTY == null) ? (String)null : h_ACPT_QTY[0]) );
		struct.setList_h_ACPT_QTY(TypeConverter.convert(h_ACPT_QTY));
		struct.seth_ACPT_DATE( ((h_ACPT_DATE == null) ? (String)null : h_ACPT_DATE[0]) );
		struct.setList_h_ACPT_DATE(TypeConverter.convert(h_ACPT_DATE));
		struct.seth_TOTAL_ISSUE_QTY( ((h_TOTAL_ISSUE_QTY == null) ? (String)null : h_TOTAL_ISSUE_QTY[0]) );
		struct.setList_h_TOTAL_ISSUE_QTY(TypeConverter.convert(h_TOTAL_ISSUE_QTY));
		struct.seth_SUPPLIED_DATE( ((h_SUPPLIED_DATE == null) ? (String)null : h_SUPPLIED_DATE[0]) );
		struct.setList_h_SUPPLIED_DATE(TypeConverter.convert(h_SUPPLIED_DATE));
		struct.seth_PART_SUPPLIED_COMMENT( ((h_PART_SUPPLIED_COMMENT == null) ? (String)null : h_PART_SUPPLIED_COMMENT[0]) );
		struct.setList_h_PART_SUPPLIED_COMMENT(TypeConverter.convert(h_PART_SUPPLIED_COMMENT));
		struct.seth_PUCH_ODR_CD( ((h_PUCH_ODR_CD == null) ? (String)null : h_PUCH_ODR_CD[0]) );
		struct.setList_h_PUCH_ODR_CD(TypeConverter.convert(h_PUCH_ODR_CD));
		struct.setl_UNIT_QTY_TYP( ((l_UNIT_QTY_TYP == null) ? (String)null : l_UNIT_QTY_TYP[0]) );
		struct.setList_l_UNIT_QTY_TYP(TypeConverter.convert(l_UNIT_QTY_TYP));
		struct.setUNIT_QTY_TYP2( ((UNIT_QTY_TYP2 == null) ? (String)null : UNIT_QTY_TYP2[0]) );
		struct.setList_UNIT_QTY_TYP2(TypeConverter.convert(UNIT_QTY_TYP2));
		struct.seth_ODR_CANCEL_SLIP_ISS_FLG( ((h_ODR_CANCEL_SLIP_ISS_FLG == null) ? (String)null : h_ODR_CANCEL_SLIP_ISS_FLG[0]) );
		struct.setList_h_ODR_CANCEL_SLIP_ISS_FLG(TypeConverter.convert(h_ODR_CANCEL_SLIP_ISS_FLG));
		struct.setc_CANCEL( ((c_CANCEL == null) ? (String)null : c_CANCEL[0]) );
		struct.setList_c_CANCEL(TypeConverter.convert(c_CANCEL));
		struct.setODR_CANCEL_CAUSE_CD( ((ODR_CANCEL_CAUSE_CD == null) ? (String)null : ODR_CANCEL_CAUSE_CD[0]) );
		struct.setList_ODR_CANCEL_CAUSE_CD(TypeConverter.convert(ODR_CANCEL_CAUSE_CD));
		struct.seth_ACPT_RSLT_COUNT( ((h_ACPT_RSLT_COUNT == null) ? (String)null : h_ACPT_RSLT_COUNT[0]) );
		struct.setList_h_ACPT_RSLT_COUNT(TypeConverter.convert(h_ACPT_RSLT_COUNT));
		struct.setTHIS_MONTH( ((THIS_MONTH == null) ? (String)null : THIS_MONTH[0]) );
		struct.setList_THIS_MONTH(TypeConverter.convert(THIS_MONTH));
		struct.setINSTALL_FLG( ((INSTALL_FLG == null) ? (String)null : INSTALL_FLG[0]) );
		struct.setList_INSTALL_FLG(TypeConverter.convert(INSTALL_FLG));
		struct.setPUCH_ODR_COMMENT( ((PUCH_ODR_COMMENT == null) ? (String)null : PUCH_ODR_COMMENT[0]) );
		struct.setList_PUCH_ODR_COMMENT(TypeConverter.convert(PUCH_ODR_COMMENT));
		struct.setINSPC_WH_CD( ((INSPC_WH_CD == null) ? (String)null : INSPC_WH_CD[0]) );
		struct.setList_INSPC_WH_CD(TypeConverter.convert(INSPC_WH_CD));
		struct.setINSPC_WH_NAME( ((INSPC_WH_NAME == null) ? (String)null : INSPC_WH_NAME[0]) );
		struct.setList_INSPC_WH_NAME(TypeConverter.convert(INSPC_WH_NAME));
		struct.setITEM_CD_DW( ((ITEM_CD_DW == null) ? (String)null : ITEM_CD_DW[0]) );
		struct.setList_ITEM_CD_DW(TypeConverter.convert(ITEM_CD_DW));
		struct.setITEM_NAME_DW( ((ITEM_NAME_DW == null) ? (String)null : ITEM_NAME_DW[0]) );
		struct.setList_ITEM_NAME_DW(TypeConverter.convert(ITEM_NAME_DW));
		struct.setl_LOT_NO( ((l_LOT_NO == null) ? (String)null : l_LOT_NO[0]) );
		struct.setList_l_LOT_NO(TypeConverter.convert(l_LOT_NO));
		struct.setLOT_NO( ((LOT_NO == null) ? (String)null : LOT_NO[0]) );
		struct.setList_LOT_NO(TypeConverter.convert(LOT_NO));
		struct.seth_LOT_NUMBERING_TYP( ((h_LOT_NUMBERING_TYP == null) ? (String)null : h_LOT_NUMBERING_TYP[0]) );
		struct.setList_h_LOT_NUMBERING_TYP(TypeConverter.convert(h_LOT_NUMBERING_TYP));
		struct.seth_LOT_CONTROL_FLG( ((h_LOT_CONTROL_FLG == null) ? (String)null : h_LOT_CONTROL_FLG[0]) );
		struct.setList_h_LOT_CONTROL_FLG(TypeConverter.convert(h_LOT_CONTROL_FLG));
		struct.seth_FINAL_PROC_FLG( ((h_FINAL_PROC_FLG == null) ? (String)null : h_FINAL_PROC_FLG[0]) );
		struct.setList_h_FINAL_PROC_FLG(TypeConverter.convert(h_FINAL_PROC_FLG));
		struct.setparam1( ((param1 == null) ? (String)null : param1[0]) );
		struct.setList_param1(TypeConverter.convert(param1));
		struct.setparam2( ((param2 == null) ? (String)null : param2[0]) );
		struct.setList_param2(TypeConverter.convert(param2));
		struct.setparam3( ((param3 == null) ? (String)null : param3[0]) );
		struct.setList_param3(TypeConverter.convert(param3));
		struct.seth_LINEUPDATE_FLG_1( ((h_LINEUPDATE_FLG_1 == null) ? (String)null : h_LINEUPDATE_FLG_1[0]) );
		struct.setList_h_LINEUPDATE_FLG_1(TypeConverter.convert(h_LINEUPDATE_FLG_1));
		struct.seth_LINEUPDATE_FLG( ((h_LINEUPDATE_FLG == null) ? (String)null : h_LINEUPDATE_FLG[0]) );
		struct.setList_h_LINEUPDATE_FLG(TypeConverter.convert(h_LINEUPDATE_FLG));
		struct.setITEM_CD_LOT( ((ITEM_CD_LOT == null) ? (String)null : ITEM_CD_LOT[0]) );
		struct.setList_ITEM_CD_LOT(TypeConverter.convert(ITEM_CD_LOT));
		struct.setJudgeFlg( ((JudgeFlg == null) ? (String)null : JudgeFlg[0]) );
		struct.setList_JudgeFlg(TypeConverter.convert(JudgeFlg));
		struct.seth_LOTCTRL( ((h_LOTCTRL == null) ? (String)null : h_LOTCTRL[0]) );
		struct.setList_h_LOTCTRL(TypeConverter.convert(h_LOTCTRL));
		struct.seth_WORK_ODR_CD( ((h_WORK_ODR_CD == null) ? (String)null : h_WORK_ODR_CD[0]) );
		struct.setList_h_WORK_ODR_CD(TypeConverter.convert(h_WORK_ODR_CD));
		struct.seth_LOT_NO( ((h_LOT_NO == null) ? (String)null : h_LOT_NO[0]) );
		struct.setList_h_LOT_NO(TypeConverter.convert(h_LOT_NO));
		struct.seth_BUSINESS_OPR_DATE( ((h_BUSINESS_OPR_DATE == null) ? (String)null : h_BUSINESS_OPR_DATE[0]) );
		struct.setList_h_BUSINESS_OPR_DATE(TypeConverter.convert(h_BUSINESS_OPR_DATE));
		struct.seth_DATE_FLG( ((h_DATE_FLG == null) ? (String)null : h_DATE_FLG[0]) );
		struct.setList_h_DATE_FLG(TypeConverter.convert(h_DATE_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AE0060020.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAE0060020Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAE0060020Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AE0060020Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AE0060020Entity entity = control.entity;
		AE0060020Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0060");
		logger.entering("AE0060020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AE0060020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AE0060020Control control;
		AE0060020Entity  entity = null;
		AE0060020Struct  struct = null;

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

			if( (control = (AE0060020Control)so.getAttribute("AE0060020Control_"+request.getSession(false).getId())) == null ) {
				control = new AE0060020Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AE0060020Control();
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
				} else if( isClick(request, "LineInsert") ) {
					if ( !isCryptical(request, so, params, "LineInsert") ) return ERROR_TARGET;
					target = onClickLineInsert(request, response, so, params, control);
					control.setButton("LineInsert");
				} else if( isClick(request, "LineUpdate") ) {
					if ( !isCryptical(request, so, params, "LineUpdate") ) return ERROR_TARGET;
					target = onClickLineUpdate(request, response, so, params, control);
					control.setButton("LineUpdate");
				} else if( isClick(request, "CancelComplete") ) {
					if ( !isCryptical(request, so, params, "CancelComplete") ) return ERROR_TARGET;
					target = onClickCancelComplete(request, response, so, params, control);
					control.setButton("CancelComplete");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
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
				} else if( isClick(request, "Return") ) {
					if ( !isCryptical(request, so, params, "Return") ) return ERROR_TARGET;
					target = onClickReturn(request, response, so, params, control);
					control.setButton("Return");
				} else if( isClick(request, "Insert2") ) {
					if ( !isCryptical(request, so, params, "Insert2") ) return ERROR_TARGET;
					target = onClickInsert2(request, response, so, params, control);
					control.setButton("Insert2");
				} else if( isClick(request, "Update2") ) {
					if ( !isCryptical(request, so, params, "Update2") ) return ERROR_TARGET;
					target = onClickUpdate2(request, response, so, params, control);
					control.setButton("Update2");
				} else if( isClick(request, "Return2") ) {
					if ( !isCryptical(request, so, params, "Return2") ) return ERROR_TARGET;
					target = onClickReturn2(request, response, so, params, control);
					control.setButton("Return2");
				} else if( isClick(request, "NoUserParts") ) {
					if ( !isCryptical(request, so, params, "NoUserParts") ) return ERROR_TARGET;
					target = onClickNoUserParts(request, response, so, params, control);
					control.setButton("NoUserParts");
				} else if( isClick(request, "UseParts") ) {
					if ( !isCryptical(request, so, params, "UseParts") ) return ERROR_TARGET;
					target = onClickUseParts(request, response, so, params, control);
					control.setButton("UseParts");
				} else if( isClick(request, "ClickShow") ) {
					if ( !isCryptical(request, so, params, "ClickShow") ) return ERROR_TARGET;
					target = onClickClickShow(request, response, so, params, control);
					control.setButton("ClickShow");
				} else if( isClick(request, "CancelOdrCancel") ) {
					if ( !isCryptical(request, so, params, "CancelOdrCancel") ) return ERROR_TARGET;
					target = onClickCancelOdrCancel(request, response, so, params, control);
					control.setButton("CancelOdrCancel");
				} else if( isClick(request, "Detail") ) {
					if ( !isCryptical(request, so, params, "Detail") ) return ERROR_TARGET;
					target = onClickDetail(request, response, so, params, control);
					control.setButton("Detail");
				} else if( isClick(request, "LotInsert") ) {
					if ( !isCryptical(request, so, params, "LotInsert") ) return ERROR_TARGET;
					target = onClickLotInsert(request, response, so, params, control);
					control.setButton("LotInsert");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AE0060020Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "LineInsert") && bFLG_DISCONNECT_LineInsert)
				|| (isClick(request, "LineUpdate") && bFLG_DISCONNECT_LineUpdate)
				|| (isClick(request, "CancelComplete") && bFLG_DISCONNECT_CancelComplete)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "SelectUnitCost") && bFLG_DISCONNECT_SelectUnitCost)
				|| (isClick(request, "Insert") && bFLG_DISCONNECT_Insert)
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				|| (isClick(request, "Return") && bFLG_DISCONNECT_Return)
				|| (isClick(request, "Insert2") && bFLG_DISCONNECT_Insert2)
				|| (isClick(request, "Update2") && bFLG_DISCONNECT_Update2)
				|| (isClick(request, "Return2") && bFLG_DISCONNECT_Return2)
				|| (isClick(request, "NoUserParts") && bFLG_DISCONNECT_NoUserParts)
				|| (isClick(request, "UseParts") && bFLG_DISCONNECT_UseParts)
				|| (isClick(request, "ClickShow") && bFLG_DISCONNECT_ClickShow)
				|| (isClick(request, "CancelOdrCancel") && bFLG_DISCONNECT_CancelOdrCancel)
				|| (isClick(request, "Detail") && bFLG_DISCONNECT_Detail)
				|| (isClick(request, "LotInsert") && bFLG_DISCONNECT_LotInsert)
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
	private  static boolean bFLG_DISCONNECT_LineInsert = true;
	private  static boolean bFLG_DISCONNECT_LineUpdate = true;
	private  static boolean bFLG_DISCONNECT_CancelComplete = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_SelectUnitCost = true;
	private  static boolean bFLG_DISCONNECT_Insert = true;
	private  static boolean bFLG_DISCONNECT_Update = true;
	private  static boolean bFLG_DISCONNECT_Return = true;
	private  static boolean bFLG_DISCONNECT_Insert2 = true;
	private  static boolean bFLG_DISCONNECT_Update2 = true;
	private  static boolean bFLG_DISCONNECT_Return2 = true;
	private  static boolean bFLG_DISCONNECT_NoUserParts = true;
	private  static boolean bFLG_DISCONNECT_UseParts = true;
	private  static boolean bFLG_DISCONNECT_ClickShow = true;
	private  static boolean bFLG_DISCONNECT_CancelOdrCancel = true;
	private  static boolean bFLG_DISCONNECT_Detail = true;
	private  static boolean bFLG_DISCONNECT_LotInsert = true;

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
		return "com.nec.jp.orteus.metamorBase.AE0060.AE0060020Servlet";
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
	public AE0060020Servlet()
	{
		//{{user_implement_dev:<AE0060020_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_LineInsert = true;
		bFLG_DISCONNECT_LineUpdate = true;
		bFLG_DISCONNECT_CancelComplete = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_SelectUnitCost = true;
		bFLG_DISCONNECT_Insert = true;
		bFLG_DISCONNECT_Update = true;
		bFLG_DISCONNECT_Return = true;

                //}}user_implement_dev:<AE0060020_DisConnect_FLG>

		//{{user_implement_dev:<AE0060020Servlet>
		// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AE0060020Servlet>
	}

	//////////////////////////////

}
