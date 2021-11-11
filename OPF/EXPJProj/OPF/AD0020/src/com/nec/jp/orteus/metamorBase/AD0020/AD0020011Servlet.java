/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0020/src/com/nec/jp/orteus/metamorBase/AD0020/AD0020011Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0020;

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

public class AD0020011Servlet extends HttpServlet
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
	 * @param control AD0020011Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AD0020011Control control)
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
	 * @param control AD0020011Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AD0020011Control control)
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


		//�I�[�_�f�}���h�ԍ�
		String[] OD_NO = (String[]) params.get("OD_NO");
		if (OD_NO == null) {
			control.setOdNo(null);
		} else {
			control.setOdNo(OD_NO[0]);
		}


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
	 * @param control AD0020011Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0020011Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0020011Entity entity = control.entity;
		AD0020011Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
			logger.entering("AD0020011Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			objMessage.m_writer.write( Level.ALL, "AD0020011"+" $Revision: 1.7 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AD0020011Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AD0020011Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0020011Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0020011Entity entity = control.entity;
		AD0020011Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0020011-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AD0020011Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0020011Control�N���X�C���X�^���X
	 */
	public String onClickReturn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0020011Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0020011.jsp";		// �ړ���t�q�k
		AD0020011Entity entity = control.entity;
		AD0020011Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickReturn");
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
		logger.exiting("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickReturn");

		return nextUrl;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0020011Control�N���X�C���X�^���X
	 */
	public String onClickLineInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0020011Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0020012.jsp";		// �ړ���t�q�k
		AD0020011Entity entity = control.entity;
		AD0020011Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");
		//{{user_implement_dev:<onClickLineInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineInsert");

			if (control.getMsgStruct().getError().size() != 0 ) {
				nextUrl = "/AD0020011.jsp";
			}

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineInsert>
		logger.exiting("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickLineInsert");

		return nextUrl;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0020011Control�N���X�C���X�^���X
	 */
	public String onClickLineUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0020011Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0020012.jsp";		// �ړ���t�q�k
		AD0020011Entity entity = control.entity;
		AD0020011Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");
		//{{user_implement_dev:<onClickLineUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineUpdate");

			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0020011.jsp";
			}

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineUpdate>
		logger.exiting("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickLineUpdate");

		return nextUrl;
	}

	/**
	 * �s���ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0020011Control�N���X�C���X�^���X
	 */
	public String onClickLineCopy(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0020011Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0020012.jsp";		// �ړ���t�q�k
		AD0020011Entity entity = control.entity;
		AD0020011Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickLineCopy");
		//{{user_implement_dev:<onClickLineCopy>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("LineCopy");

			if (control.getMsgStruct().getError().size() != 0) {
				nextUrl = "/AD0020011.jsp";
			}

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickLineCopy>
		logger.exiting("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickLineCopy");

		return nextUrl;
	}

	/**
	 * �s�폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0020011Control�N���X�C���X�^���X
	 */
	public String onClickLineDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0020011Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0020011Entity entity = control.entity;
		AD0020011Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickLineDelete");
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
		logger.exiting("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickLineDelete");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0020011Control�N���X�C���X�^���X
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0020011Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0020011.jsp";		// �ړ���t�q�k
		AD0020011Entity entity = control.entity;
		AD0020011Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Insert");

			if (control.getMsgStruct().getError().size() != 0 
					&& control.getScreenMoveFlg() == 0) {
				nextUrl = "/AD0020012.jsp";
			} else {
				control.setScreenMoveFlg(0);
			}

		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0020011Control�N���X�C���X�^���X
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0020011Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0020011.jsp";		// �ړ���t�q�k
		AD0020011Entity entity = control.entity;
		AD0020011Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Update");

			if (control.getMsgStruct().getError().size() != 0 
					&& control.getScreenMoveFlg() == 0) {
				nextUrl = "/AD0020012.jsp";
			} else {
				control.setScreenMoveFlg(0);
			}


		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("AD0020011Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AD0020011Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] WORK_ODR_CD = ((params.containsKey("WORK_ODR_CD")) ? (String[])params.get("WORK_ODR_CD") : (String[])null);
		String[] WORK_ODR_DLV_DATE = ((params.containsKey("WORK_ODR_DLV_DATE")) ? (String[])params.get("WORK_ODR_DLV_DATE") : (String[])null);
		String[] OPR_INST_START_DATE = ((params.containsKey("OPR_INST_START_DATE")) ? (String[])params.get("OPR_INST_START_DATE") : (String[])null);
		String[] OPR_INST_QTY = ((params.containsKey("OPR_INST_QTY")) ? (String[])params.get("OPR_INST_QTY") : (String[])null);
		String[] OUTSIDE_TYP = ((params.containsKey("OUTSIDE_TYP")) ? (String[])params.get("OUTSIDE_TYP") : (String[])null);
		String[] WORK_IN_PROC_COMMENT = ((params.containsKey("WORK_IN_PROC_COMMENT")) ? (String[])params.get("WORK_IN_PROC_COMMENT") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] JOB_ODR_DLV_DATE = ((params.containsKey("JOB_ODR_DLV_DATE")) ? (String[])params.get("JOB_ODR_DLV_DATE") : (String[])null);
		String[] DUE_DATE = ((params.containsKey("DUE_DATE")) ? (String[])params.get("DUE_DATE") : (String[])null);
		String[] DM_QTY = ((params.containsKey("DM_QTY")) ? (String[])params.get("DM_QTY") : (String[])null);
		String[] ALCD_QTY = ((params.containsKey("ALCD_QTY")) ? (String[])params.get("ALCD_QTY") : (String[])null);
		String[] PRD_DUE_DATE = ((params.containsKey("PRD_DUE_DATE")) ? (String[])params.get("PRD_DUE_DATE") : (String[])null);
		String[] PRD_START_DATE = ((params.containsKey("PRD_START_DATE")) ? (String[])params.get("PRD_START_DATE") : (String[])null);
		String[] ODR_START_DATE = ((params.containsKey("ODR_START_DATE")) ? (String[])params.get("ODR_START_DATE") : (String[])null);
		String[] ODR_QTY = ((params.containsKey("ODR_QTY")) ? (String[])params.get("ODR_QTY") : (String[])null);
		String[] PUCH_ODR_QTY = ((params.containsKey("PUCH_ODR_QTY")) ? (String[])params.get("PUCH_ODR_QTY") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] JOB_ODR_CANCEL_NO = ((params.containsKey("JOB_ODR_CANCEL_NO")) ? (String[])params.get("JOB_ODR_CANCEL_NO") : (String[])null);
		String[] OUTSIDE_TYP_name = ((params.containsKey("OUTSIDE_TYP_name")) ? (String[])params.get("OUTSIDE_TYP_name") : (String[])null);
		String[] OUTSIDE_TYP_val = ((params.containsKey("OUTSIDE_TYP_val")) ? (String[])params.get("OUTSIDE_TYP_val") : (String[])null);
		String[] h_PARENT_OD_NO = ((params.containsKey("h_PARENT_OD_NO")) ? (String[])params.get("h_PARENT_OD_NO") : (String[])null);
		String[] h_PROC_EXPLOSION_FLG = ((params.containsKey("h_PROC_EXPLOSION_FLG")) ? (String[])params.get("h_PROC_EXPLOSION_FLG") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] h_BUSINESS_OPR_DATE = ((params.containsKey("h_BUSINESS_OPR_DATE")) ? (String[])params.get("h_BUSINESS_OPR_DATE") : (String[])null);
		String[] h_CHILD = ((params.containsKey("h_CHILD")) ? (String[])params.get("h_CHILD") : (String[])null);
		String[] h_UNIT_QTY_TYP = ((params.containsKey("h_UNIT_QTY_TYP")) ? (String[])params.get("h_UNIT_QTY_TYP") : (String[])null);
		String[] PROC_EXPLOSION_FLG_DN = ((params.containsKey("PROC_EXPLOSION_FLG_DN")) ? (String[])params.get("PROC_EXPLOSION_FLG_DN") : (String[])null);
		String[] MRP_ODR_TYP_DN = ((params.containsKey("MRP_ODR_TYP_DN")) ? (String[])params.get("MRP_ODR_TYP_DN") : (String[])null);
		String[] OUTSIDE_TYP_DN = ((params.containsKey("OUTSIDE_TYP_DN")) ? (String[])params.get("OUTSIDE_TYP_DN") : (String[])null);
		String[] OPR_RSLT_TYP_DN = ((params.containsKey("OPR_RSLT_TYP_DN")) ? (String[])params.get("OPR_RSLT_TYP_DN") : (String[])null);
		String[] h_DUE_DATE = ((params.containsKey("h_DUE_DATE")) ? (String[])params.get("h_DUE_DATE") : (String[])null);
		String[] h_ODR_START_DATE = ((params.containsKey("h_ODR_START_DATE")) ? (String[])params.get("h_ODR_START_DATE") : (String[])null);
		String[] h_ITEM_MODIFY_COUNT = ((params.containsKey("h_ITEM_MODIFY_COUNT")) ? (String[])params.get("h_ITEM_MODIFY_COUNT") : (String[])null);
		String[] l_UNIT_QTY_TYP = ((params.containsKey("l_UNIT_QTY_TYP")) ? (String[])params.get("l_UNIT_QTY_TYP") : (String[])null);
		String[] JOB_ODR_DLV_DATE_TIME = ((params.containsKey("JOB_ODR_DLV_DATE_TIME")) ? (String[])params.get("JOB_ODR_DLV_DATE_TIME") : (String[])null);
		String[] DUE_DATE_TIME = ((params.containsKey("DUE_DATE_TIME")) ? (String[])params.get("DUE_DATE_TIME") : (String[])null);
		String[] PRD_DUE_DATE_TIME = ((params.containsKey("PRD_DUE_DATE_TIME")) ? (String[])params.get("PRD_DUE_DATE_TIME") : (String[])null);
		String[] PRD_START_DATE_TIME = ((params.containsKey("PRD_START_DATE_TIME")) ? (String[])params.get("PRD_START_DATE_TIME") : (String[])null);
		String[] ODR_START_DATE_TIME = ((params.containsKey("ODR_START_DATE_TIME")) ? (String[])params.get("ODR_START_DATE_TIME") : (String[])null);
		String[] WORK_ODR_DLV_DATE_TIME = ((params.containsKey("WORK_ODR_DLV_DATE_TIME")) ? (String[])params.get("WORK_ODR_DLV_DATE_TIME") : (String[])null);
		String[] OPR_INST_START_DATE_TIME = ((params.containsKey("OPR_INST_START_DATE_TIME")) ? (String[])params.get("OPR_INST_START_DATE_TIME") : (String[])null);
		String[] h_DUE_DATE_TIME = ((params.containsKey("h_DUE_DATE_TIME")) ? (String[])params.get("h_DUE_DATE_TIME") : (String[])null);
		String[] h_ODR_START_DATE_TIME = ((params.containsKey("h_ODR_START_DATE_TIME")) ? (String[])params.get("h_ODR_START_DATE_TIME") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);
		String[] h_MANHOUR_TYP = ((params.containsKey("h_MANHOUR_TYP")) ? (String[])params.get("h_MANHOUR_TYP") : (String[])null);

		struct.setWORK_ODR_CD( ((WORK_ODR_CD == null) ? (String)null : WORK_ODR_CD[0]) );
		struct.setList_WORK_ODR_CD(TypeConverter.convert(WORK_ODR_CD));
		struct.setWORK_ODR_DLV_DATE( ((WORK_ODR_DLV_DATE == null) ? (String)null : WORK_ODR_DLV_DATE[0]) );
		struct.setList_WORK_ODR_DLV_DATE(TypeConverter.convert(WORK_ODR_DLV_DATE));
		struct.setOPR_INST_START_DATE( ((OPR_INST_START_DATE == null) ? (String)null : OPR_INST_START_DATE[0]) );
		struct.setList_OPR_INST_START_DATE(TypeConverter.convert(OPR_INST_START_DATE));
		struct.setOPR_INST_QTY( ((OPR_INST_QTY == null) ? (String)null : OPR_INST_QTY[0]) );
		struct.setList_OPR_INST_QTY(TypeConverter.convert(OPR_INST_QTY));
		struct.setOUTSIDE_TYP( ((OUTSIDE_TYP == null) ? (String)null : OUTSIDE_TYP[0]) );
		struct.setList_OUTSIDE_TYP(TypeConverter.convert(OUTSIDE_TYP));
		struct.setWORK_IN_PROC_COMMENT( ((WORK_IN_PROC_COMMENT == null) ? (String)null : WORK_IN_PROC_COMMENT[0]) );
		struct.setList_WORK_IN_PROC_COMMENT(TypeConverter.convert(WORK_IN_PROC_COMMENT));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setJOB_ODR_DLV_DATE( ((JOB_ODR_DLV_DATE == null) ? (String)null : JOB_ODR_DLV_DATE[0]) );
		struct.setList_JOB_ODR_DLV_DATE(TypeConverter.convert(JOB_ODR_DLV_DATE));
		struct.setDUE_DATE( ((DUE_DATE == null) ? (String)null : DUE_DATE[0]) );
		struct.setList_DUE_DATE(TypeConverter.convert(DUE_DATE));
		struct.setDM_QTY( ((DM_QTY == null) ? (String)null : DM_QTY[0]) );
		struct.setList_DM_QTY(TypeConverter.convert(DM_QTY));
		struct.setALCD_QTY( ((ALCD_QTY == null) ? (String)null : ALCD_QTY[0]) );
		struct.setList_ALCD_QTY(TypeConverter.convert(ALCD_QTY));
		struct.setPRD_DUE_DATE( ((PRD_DUE_DATE == null) ? (String)null : PRD_DUE_DATE[0]) );
		struct.setList_PRD_DUE_DATE(TypeConverter.convert(PRD_DUE_DATE));
		struct.setPRD_START_DATE( ((PRD_START_DATE == null) ? (String)null : PRD_START_DATE[0]) );
		struct.setList_PRD_START_DATE(TypeConverter.convert(PRD_START_DATE));
		struct.setODR_START_DATE( ((ODR_START_DATE == null) ? (String)null : ODR_START_DATE[0]) );
		struct.setList_ODR_START_DATE(TypeConverter.convert(ODR_START_DATE));
		struct.setODR_QTY( ((ODR_QTY == null) ? (String)null : ODR_QTY[0]) );
		struct.setList_ODR_QTY(TypeConverter.convert(ODR_QTY));
		struct.setPUCH_ODR_QTY( ((PUCH_ODR_QTY == null) ? (String)null : PUCH_ODR_QTY[0]) );
		struct.setList_PUCH_ODR_QTY(TypeConverter.convert(PUCH_ODR_QTY));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setJOB_ODR_CANCEL_NO( ((JOB_ODR_CANCEL_NO == null) ? (String)null : JOB_ODR_CANCEL_NO[0]) );
		struct.setList_JOB_ODR_CANCEL_NO(TypeConverter.convert(JOB_ODR_CANCEL_NO));
		struct.setOUTSIDE_TYP_name( ((OUTSIDE_TYP_name == null) ? (String)null : OUTSIDE_TYP_name[0]) );
		struct.setList_OUTSIDE_TYP_name(TypeConverter.convert(OUTSIDE_TYP_name));
		struct.setOUTSIDE_TYP_val( ((OUTSIDE_TYP_val == null) ? (String)null : OUTSIDE_TYP_val[0]) );
		struct.setList_OUTSIDE_TYP_val(TypeConverter.convert(OUTSIDE_TYP_val));
		struct.seth_PARENT_OD_NO( ((h_PARENT_OD_NO == null) ? (String)null : h_PARENT_OD_NO[0]) );
		struct.setList_h_PARENT_OD_NO(TypeConverter.convert(h_PARENT_OD_NO));
		struct.seth_PROC_EXPLOSION_FLG( ((h_PROC_EXPLOSION_FLG == null) ? (String)null : h_PROC_EXPLOSION_FLG[0]) );
		struct.setList_h_PROC_EXPLOSION_FLG(TypeConverter.convert(h_PROC_EXPLOSION_FLG));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.seth_BUSINESS_OPR_DATE( ((h_BUSINESS_OPR_DATE == null) ? (String)null : h_BUSINESS_OPR_DATE[0]) );
		struct.setList_h_BUSINESS_OPR_DATE(TypeConverter.convert(h_BUSINESS_OPR_DATE));
		struct.seth_CHILD( ((h_CHILD == null) ? (String)null : h_CHILD[0]) );
		struct.setList_h_CHILD(TypeConverter.convert(h_CHILD));
		struct.seth_UNIT_QTY_TYP( ((h_UNIT_QTY_TYP == null) ? (String)null : h_UNIT_QTY_TYP[0]) );
		struct.setList_h_UNIT_QTY_TYP(TypeConverter.convert(h_UNIT_QTY_TYP));
		struct.setPROC_EXPLOSION_FLG_DN( ((PROC_EXPLOSION_FLG_DN == null) ? (String)null : PROC_EXPLOSION_FLG_DN[0]) );
		struct.setList_PROC_EXPLOSION_FLG_DN(TypeConverter.convert(PROC_EXPLOSION_FLG_DN));
		struct.setMRP_ODR_TYP_DN( ((MRP_ODR_TYP_DN == null) ? (String)null : MRP_ODR_TYP_DN[0]) );
		struct.setList_MRP_ODR_TYP_DN(TypeConverter.convert(MRP_ODR_TYP_DN));
		struct.setOUTSIDE_TYP_DN( ((OUTSIDE_TYP_DN == null) ? (String)null : OUTSIDE_TYP_DN[0]) );
		struct.setList_OUTSIDE_TYP_DN(TypeConverter.convert(OUTSIDE_TYP_DN));
		struct.setOPR_RSLT_TYP_DN( ((OPR_RSLT_TYP_DN == null) ? (String)null : OPR_RSLT_TYP_DN[0]) );
		struct.setList_OPR_RSLT_TYP_DN(TypeConverter.convert(OPR_RSLT_TYP_DN));
		struct.seth_DUE_DATE( ((h_DUE_DATE == null) ? (String)null : h_DUE_DATE[0]) );
		struct.setList_h_DUE_DATE(TypeConverter.convert(h_DUE_DATE));
		struct.seth_ODR_START_DATE( ((h_ODR_START_DATE == null) ? (String)null : h_ODR_START_DATE[0]) );
		struct.setList_h_ODR_START_DATE(TypeConverter.convert(h_ODR_START_DATE));
		struct.seth_ITEM_MODIFY_COUNT( ((h_ITEM_MODIFY_COUNT == null) ? (String)null : h_ITEM_MODIFY_COUNT[0]) );
		struct.setList_h_ITEM_MODIFY_COUNT(TypeConverter.convert(h_ITEM_MODIFY_COUNT));
		struct.setl_UNIT_QTY_TYP( ((l_UNIT_QTY_TYP == null) ? (String)null : l_UNIT_QTY_TYP[0]) );
		struct.setList_l_UNIT_QTY_TYP(TypeConverter.convert(l_UNIT_QTY_TYP));
		struct.setJOB_ODR_DLV_DATE_TIME( ((JOB_ODR_DLV_DATE_TIME == null) ? (String)null : JOB_ODR_DLV_DATE_TIME[0]) );
		struct.setList_JOB_ODR_DLV_DATE_TIME(TypeConverter.convert(JOB_ODR_DLV_DATE_TIME));
		struct.setDUE_DATE_TIME( ((DUE_DATE_TIME == null) ? (String)null : DUE_DATE_TIME[0]) );
		struct.setList_DUE_DATE_TIME(TypeConverter.convert(DUE_DATE_TIME));
		struct.setPRD_DUE_DATE_TIME( ((PRD_DUE_DATE_TIME == null) ? (String)null : PRD_DUE_DATE_TIME[0]) );
		struct.setList_PRD_DUE_DATE_TIME(TypeConverter.convert(PRD_DUE_DATE_TIME));
		struct.setPRD_START_DATE_TIME( ((PRD_START_DATE_TIME == null) ? (String)null : PRD_START_DATE_TIME[0]) );
		struct.setList_PRD_START_DATE_TIME(TypeConverter.convert(PRD_START_DATE_TIME));
		struct.setODR_START_DATE_TIME( ((ODR_START_DATE_TIME == null) ? (String)null : ODR_START_DATE_TIME[0]) );
		struct.setList_ODR_START_DATE_TIME(TypeConverter.convert(ODR_START_DATE_TIME));
		struct.setWORK_ODR_DLV_DATE_TIME( ((WORK_ODR_DLV_DATE_TIME == null) ? (String)null : WORK_ODR_DLV_DATE_TIME[0]) );
		struct.setList_WORK_ODR_DLV_DATE_TIME(TypeConverter.convert(WORK_ODR_DLV_DATE_TIME));
		struct.setOPR_INST_START_DATE_TIME( ((OPR_INST_START_DATE_TIME == null) ? (String)null : OPR_INST_START_DATE_TIME[0]) );
		struct.setList_OPR_INST_START_DATE_TIME(TypeConverter.convert(OPR_INST_START_DATE_TIME));
		struct.seth_DUE_DATE_TIME( ((h_DUE_DATE_TIME == null) ? (String)null : h_DUE_DATE_TIME[0]) );
		struct.setList_h_DUE_DATE_TIME(TypeConverter.convert(h_DUE_DATE_TIME));
		struct.seth_ODR_START_DATE_TIME( ((h_ODR_START_DATE_TIME == null) ? (String)null : h_ODR_START_DATE_TIME[0]) );
		struct.setList_h_ODR_START_DATE_TIME(TypeConverter.convert(h_ODR_START_DATE_TIME));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));
		struct.seth_MANHOUR_TYP( ((h_MANHOUR_TYP == null) ? (String)null : h_MANHOUR_TYP[0]) );
		struct.setList_h_MANHOUR_TYP(TypeConverter.convert(h_MANHOUR_TYP));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AD0020011.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAD0020011Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAD0020011Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AD0020011Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0020011Entity entity = control.entity;
		AD0020011Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0020");
		logger.entering("AD0020011Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AD0020011Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AD0020011Control control;
		AD0020011Entity  entity = null;
		AD0020011Struct  struct = null;

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

			if( (control = (AD0020011Control)so.getAttribute("AD0020011Control_"+request.getSession(false).getId())) == null ) {
				control = new AD0020011Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AD0020011Control();
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
				if( isClick(request, "Return") ) {
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

				so.setAttribute("AD0020011Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "Return") && bFLG_DISCONNECT_Return)
				|| (isClick(request, "LineInsert") && bFLG_DISCONNECT_LineInsert)
				|| (isClick(request, "LineUpdate") && bFLG_DISCONNECT_LineUpdate)
				|| (isClick(request, "LineCopy") && bFLG_DISCONNECT_LineCopy)
				|| (isClick(request, "LineDelete") && bFLG_DISCONNECT_LineDelete)
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
	private  static boolean bFLG_DISCONNECT_Return = true;
	private  static boolean bFLG_DISCONNECT_LineInsert = true;
	private  static boolean bFLG_DISCONNECT_LineUpdate = true;
	private  static boolean bFLG_DISCONNECT_LineCopy = true;
	private  static boolean bFLG_DISCONNECT_LineDelete = true;
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
		return "com.nec.jp.orteus.metamorBase.AD0020.AD0020011Servlet";
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
	public AD0020011Servlet()
	{
		//{{user_implement_dev:<AD0020011_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Return = true;
		bFLG_DISCONNECT_LineInsert = true;
		bFLG_DISCONNECT_LineUpdate = true;
		bFLG_DISCONNECT_LineCopy = true;
		bFLG_DISCONNECT_LineDelete = true;
		bFLG_DISCONNECT_Insert = true;
		bFLG_DISCONNECT_Update = true;

                //}}user_implement_dev:<AD0020011_DisConnect_FLG>

		//{{user_implement_dev:<AD0020011Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AD0020011Servlet>
	}

	//////////////////////////////

}
