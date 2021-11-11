/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0100/src/com/nec/jp/orteus/metamorBase/AC0100/AC0100010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0100;

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

public class AC0100010Servlet extends HttpServlet
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
	 * @param control AC0100010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AC0100010Control control)
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
		String[] odNo = (String[])params.get("l_OD_NO");
		if (odNo == null) {
			control.setOdNo(null);
		} else {
			control.setOdNo(odNo[0]);
		}
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AC0100010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AC0100010Control control)
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
	 * @param control AC0100010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0100010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
			logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			objMessage.m_writer.write( Level.ALL, "AC0100010"+" $Revision: 1.13 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AC0100010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0100010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0100010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0100010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0100010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * �����C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0100010Control�N���X�C���X�^���X
	 */
	public String onClickAlcUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0100011.jsp";		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickAlcUpdate");
		//{{user_implement_dev:<onClickAlcUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("AlcUpdate");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickAlcUpdate>
		logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickAlcUpdate");

		return nextUrl;
	}

	/**
	 * �����폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0100010Control�N���X�C���X�^���X
	 */
	public String onClickAlcDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickAlcDelete");
		//{{user_implement_dev:<onClickAlcDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("AlcDelete");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickAlcDelete>
		logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickAlcDelete");

		return nextUrl;
	}

	/**
	 * �����ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0100010Control�N���X�C���X�^���X
	 */
	public String onClickAlcInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0100011.jsp";		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickAlcInsert");
		//{{user_implement_dev:<onClickAlcInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("AlcInsert");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickAlcInsert>
		logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickAlcInsert");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0100010Control�N���X�C���X�^���X
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0100010.jsp";		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Insert");
			nextUrl = control.getNextUrl();
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0100010Control�N���X�C���X�^���X
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0100010.jsp";		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Update");
			nextUrl = control.getNextUrl();
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0100010Control�N���X�C���X�^���X
	 */
	public String onClickReturn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0100010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickReturn");
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
		logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"onClickReturn");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AC0100010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] JOB_ODR_CANCEL_NO = ((params.containsKey("JOB_ODR_CANCEL_NO")) ? (String[])params.get("JOB_ODR_CANCEL_NO") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] OD_NO = ((params.containsKey("OD_NO")) ? (String[])params.get("OD_NO") : (String[])null);
		String[] DM_QTY = ((params.containsKey("DM_QTY")) ? (String[])params.get("DM_QTY") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] ALCD_QTY = ((params.containsKey("ALCD_QTY")) ? (String[])params.get("ALCD_QTY") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] l_ALCD_QTY = ((params.containsKey("l_ALCD_QTY")) ? (String[])params.get("l_ALCD_QTY") : (String[])null);
		String[] l_STOCK_ON_HAND_QTY = ((params.containsKey("l_STOCK_ON_HAND_QTY")) ? (String[])params.get("l_STOCK_ON_HAND_QTY") : (String[])null);
		String[] l_ODR_STS_TYP_DN = ((params.containsKey("l_ODR_STS_TYP_DN")) ? (String[])params.get("l_ODR_STS_TYP_DN") : (String[])null);
		String[] l_PRD_DUE_DATE = ((params.containsKey("l_PRD_DUE_DATE")) ? (String[])params.get("l_PRD_DUE_DATE") : (String[])null);
		String[] l_TOTAL_RCV_QTY = ((params.containsKey("l_TOTAL_RCV_QTY")) ? (String[])params.get("l_TOTAL_RCV_QTY") : (String[])null);
		String[] l_ODR_START_DATE = ((params.containsKey("l_ODR_START_DATE")) ? (String[])params.get("l_ODR_START_DATE") : (String[])null);
		String[] l_PRD_START_DATE = ((params.containsKey("l_PRD_START_DATE")) ? (String[])params.get("l_PRD_START_DATE") : (String[])null);
		String[] UNIT_QTY_TYP = ((params.containsKey("UNIT_QTY_TYP")) ? (String[])params.get("UNIT_QTY_TYP") : (String[])null);
		String[] SUM_OF_ALCD_QTY = ((params.containsKey("SUM_OF_ALCD_QTY")) ? (String[])params.get("SUM_OF_ALCD_QTY") : (String[])null);
		String[] ISSUEED_QTY = ((params.containsKey("ISSUEED_QTY")) ? (String[])params.get("ISSUEED_QTY") : (String[])null);
		String[] ODR_STS_TYP = ((params.containsKey("ODR_STS_TYP")) ? (String[])params.get("ODR_STS_TYP") : (String[])null);
		String[] TOTAL_RCV_QTY = ((params.containsKey("TOTAL_RCV_QTY")) ? (String[])params.get("TOTAL_RCV_QTY") : (String[])null);
		String[] STOCK_ON_HAND_QTY = ((params.containsKey("STOCK_ON_HAND_QTY")) ? (String[])params.get("STOCK_ON_HAND_QTY") : (String[])null);
		String[] PRD_DUE_DATE = ((params.containsKey("PRD_DUE_DATE")) ? (String[])params.get("PRD_DUE_DATE") : (String[])null);
		String[] ODR_START_DATE = ((params.containsKey("ODR_START_DATE")) ? (String[])params.get("ODR_START_DATE") : (String[])null);
		String[] PRD_START_DATE = ((params.containsKey("PRD_START_DATE")) ? (String[])params.get("PRD_START_DATE") : (String[])null);
		String[] ALC_GRP_CD = ((params.containsKey("ALC_GRP_CD")) ? (String[])params.get("ALC_GRP_CD") : (String[])null);
		String[] DM_STS_TYP = ((params.containsKey("DM_STS_TYP")) ? (String[])params.get("DM_STS_TYP") : (String[])null);
		String[] TOTAL_ISSUE_QTY = ((params.containsKey("TOTAL_ISSUE_QTY")) ? (String[])params.get("TOTAL_ISSUE_QTY") : (String[])null);
		String[] DUE_DATE = ((params.containsKey("DUE_DATE")) ? (String[])params.get("DUE_DATE") : (String[])null);
		String[] l_ODR_QTY = ((params.containsKey("l_ODR_QTY")) ? (String[])params.get("l_ODR_QTY") : (String[])null);
		String[] l_ALC_GRP_CD = ((params.containsKey("l_ALC_GRP_CD")) ? (String[])params.get("l_ALC_GRP_CD") : (String[])null);
		String[] l_JOB_ODR_STS_TYP_DN = ((params.containsKey("l_JOB_ODR_STS_TYP_DN")) ? (String[])params.get("l_JOB_ODR_STS_TYP_DN") : (String[])null);
		String[] ODR_QTY = ((params.containsKey("ODR_QTY")) ? (String[])params.get("ODR_QTY") : (String[])null);
		String[] l_ODR_STS_TYP = ((params.containsKey("l_ODR_STS_TYP")) ? (String[])params.get("l_ODR_STS_TYP") : (String[])null);
		String[] l_JOB_ODR_STS_TYP = ((params.containsKey("l_JOB_ODR_STS_TYP")) ? (String[])params.get("l_JOB_ODR_STS_TYP") : (String[])null);
		String[] ALLOCATABLE_QTY = ((params.containsKey("ALLOCATABLE_QTY")) ? (String[])params.get("ALLOCATABLE_QTY") : (String[])null);
		String[] l_ALLOCATABLE_QTY = ((params.containsKey("l_ALLOCATABLE_QTY")) ? (String[])params.get("l_ALLOCATABLE_QTY") : (String[])null);
		String[] SUM_OF_ALLOCATABLE_QTY = ((params.containsKey("SUM_OF_ALLOCATABLE_QTY")) ? (String[])params.get("SUM_OF_ALLOCATABLE_QTY") : (String[])null);
		String[] STOCK_UNIT_2 = ((params.containsKey("STOCK_UNIT_2")) ? (String[])params.get("STOCK_UNIT_2") : (String[])null);
		String[] STOCK_UNIT_3 = ((params.containsKey("STOCK_UNIT_3")) ? (String[])params.get("STOCK_UNIT_3") : (String[])null);
		String[] STOCK_UNIT_1 = ((params.containsKey("STOCK_UNIT_1")) ? (String[])params.get("STOCK_UNIT_1") : (String[])null);
		String[] STOCK_UNIT_4 = ((params.containsKey("STOCK_UNIT_4")) ? (String[])params.get("STOCK_UNIT_4") : (String[])null);
		String[] STOCK_UNIT_5 = ((params.containsKey("STOCK_UNIT_5")) ? (String[])params.get("STOCK_UNIT_5") : (String[])null);
		String[] STOCK_UNIT_6 = ((params.containsKey("STOCK_UNIT_6")) ? (String[])params.get("STOCK_UNIT_6") : (String[])null);
		String[] STOCK_UNIT_7 = ((params.containsKey("STOCK_UNIT_7")) ? (String[])params.get("STOCK_UNIT_7") : (String[])null);
		String[] STOCK_UNIT_8 = ((params.containsKey("STOCK_UNIT_8")) ? (String[])params.get("STOCK_UNIT_8") : (String[])null);
		String[] STOCK_UNIT_9 = ((params.containsKey("STOCK_UNIT_9")) ? (String[])params.get("STOCK_UNIT_9") : (String[])null);
		String[] STOCK_UNIT_10 = ((params.containsKey("STOCK_UNIT_10")) ? (String[])params.get("STOCK_UNIT_10") : (String[])null);
		String[] STOCK_UNIT_11 = ((params.containsKey("STOCK_UNIT_11")) ? (String[])params.get("STOCK_UNIT_11") : (String[])null);
		String[] SUM_OF_ALC_REMAIN_QTY = ((params.containsKey("SUM_OF_ALC_REMAIN_QTY")) ? (String[])params.get("SUM_OF_ALC_REMAIN_QTY") : (String[])null);
		String[] ISSUE_REMAIN_QTY = ((params.containsKey("ISSUE_REMAIN_QTY")) ? (String[])params.get("ISSUE_REMAIN_QTY") : (String[])null);
		String[] l_OD_NO = ((params.containsKey("l_OD_NO")) ? (String[])params.get("l_OD_NO") : (String[])null);
		String[] l_JOB_ODR_DETAIL_NO = ((params.containsKey("l_JOB_ODR_DETAIL_NO")) ? (String[])params.get("l_JOB_ODR_DETAIL_NO") : (String[])null);
		String[] l_JOB_ODR_CANCEL_NO = ((params.containsKey("l_JOB_ODR_CANCEL_NO")) ? (String[])params.get("l_JOB_ODR_CANCEL_NO") : (String[])null);
		String[] l_MODIFY_COUNT = ((params.containsKey("l_MODIFY_COUNT")) ? (String[])params.get("l_MODIFY_COUNT") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] JOB_ODR_EXP_TYP = ((params.containsKey("JOB_ODR_EXP_TYP")) ? (String[])params.get("JOB_ODR_EXP_TYP") : (String[])null);
		String[] OD_CALC_FLG = ((params.containsKey("OD_CALC_FLG")) ? (String[])params.get("OD_CALC_FLG") : (String[])null);
		String[] l_JOB_ODR_EXP_TYP = ((params.containsKey("l_JOB_ODR_EXP_TYP")) ? (String[])params.get("l_JOB_ODR_EXP_TYP") : (String[])null);
		String[] l_MRP_TYP = ((params.containsKey("l_MRP_TYP")) ? (String[])params.get("l_MRP_TYP") : (String[])null);
		String[] JOB_ODR_STS_TYP_2 = ((params.containsKey("JOB_ODR_STS_TYP_2")) ? (String[])params.get("JOB_ODR_STS_TYP_2") : (String[])null);
		String[] ALC_GRP_CD_2 = ((params.containsKey("ALC_GRP_CD_2")) ? (String[])params.get("ALC_GRP_CD_2") : (String[])null);
		String[] l_ALC_TYP_2 = ((params.containsKey("l_ALC_TYP_2")) ? (String[])params.get("l_ALC_TYP_2") : (String[])null);
		String[] l_ALC_TYP_2_DN = ((params.containsKey("l_ALC_TYP_2_DN")) ? (String[])params.get("l_ALC_TYP_2_DN") : (String[])null);
		String[] l_ISSUEED_QTY = ((params.containsKey("l_ISSUEED_QTY")) ? (String[])params.get("l_ISSUEED_QTY") : (String[])null);
		String[] ALC_TYP_2 = ((params.containsKey("ALC_TYP_2")) ? (String[])params.get("ALC_TYP_2") : (String[])null);
		String[] JOB_ODR_CD_2 = ((params.containsKey("JOB_ODR_CD_2")) ? (String[])params.get("JOB_ODR_CD_2") : (String[])null);
		String[] JOB_ODR_DETAIL_NO_2 = ((params.containsKey("JOB_ODR_DETAIL_NO_2")) ? (String[])params.get("JOB_ODR_DETAIL_NO_2") : (String[])null);
		String[] JOB_ODR_CANCEL_NO_2 = ((params.containsKey("JOB_ODR_CANCEL_NO_2")) ? (String[])params.get("JOB_ODR_CANCEL_NO_2") : (String[])null);
		String[] l_ISSUE_REMAIN_QTY = ((params.containsKey("l_ISSUE_REMAIN_QTY")) ? (String[])params.get("l_ISSUE_REMAIN_QTY") : (String[])null);
		String[] h_OD_NO = ((params.containsKey("h_OD_NO")) ? (String[])params.get("h_OD_NO") : (String[])null);
		String[] DM_STS_TYP_DN = ((params.containsKey("DM_STS_TYP_DN")) ? (String[])params.get("DM_STS_TYP_DN") : (String[])null);
		String[] ODR_STS_TYP_DN = ((params.containsKey("ODR_STS_TYP_DN")) ? (String[])params.get("ODR_STS_TYP_DN") : (String[])null);
		String[] ALC_TYP_2_DN = ((params.containsKey("ALC_TYP_2_DN")) ? (String[])params.get("ALC_TYP_2_DN") : (String[])null);
		String[] UNIT_QTY_TYP_DN = ((params.containsKey("UNIT_QTY_TYP_DN")) ? (String[])params.get("UNIT_QTY_TYP_DN") : (String[])null);
		String[] JOB_ODR_STS_TYP_DN_2 = ((params.containsKey("JOB_ODR_STS_TYP_DN_2")) ? (String[])params.get("JOB_ODR_STS_TYP_DN_2") : (String[])null);
		String[] JOB_ODR_STS_TYP = ((params.containsKey("JOB_ODR_STS_TYP")) ? (String[])params.get("JOB_ODR_STS_TYP") : (String[])null);
		String[] JOB_ODR_STS_TYP_DN = ((params.containsKey("JOB_ODR_STS_TYP_DN")) ? (String[])params.get("JOB_ODR_STS_TYP_DN") : (String[])null);
		String[] DUE_TIME = ((params.containsKey("DUE_TIME")) ? (String[])params.get("DUE_TIME") : (String[])null);
		String[] PRD_DUE_TIME = ((params.containsKey("PRD_DUE_TIME")) ? (String[])params.get("PRD_DUE_TIME") : (String[])null);
		String[] ODR_START_TIME = ((params.containsKey("ODR_START_TIME")) ? (String[])params.get("ODR_START_TIME") : (String[])null);
		String[] PRD_START_TIME = ((params.containsKey("PRD_START_TIME")) ? (String[])params.get("PRD_START_TIME") : (String[])null);

		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setJOB_ODR_CANCEL_NO( ((JOB_ODR_CANCEL_NO == null) ? (String)null : JOB_ODR_CANCEL_NO[0]) );
		struct.setList_JOB_ODR_CANCEL_NO(TypeConverter.convert(JOB_ODR_CANCEL_NO));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setOD_NO( ((OD_NO == null) ? (String)null : OD_NO[0]) );
		struct.setList_OD_NO(TypeConverter.convert(OD_NO));
		struct.setDM_QTY( ((DM_QTY == null) ? (String)null : DM_QTY[0]) );
		struct.setList_DM_QTY(TypeConverter.convert(DM_QTY));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setALCD_QTY( ((ALCD_QTY == null) ? (String)null : ALCD_QTY[0]) );
		struct.setList_ALCD_QTY(TypeConverter.convert(ALCD_QTY));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.setl_ALCD_QTY( ((l_ALCD_QTY == null) ? (String)null : l_ALCD_QTY[0]) );
		struct.setList_l_ALCD_QTY(TypeConverter.convert(l_ALCD_QTY));
		struct.setl_STOCK_ON_HAND_QTY( ((l_STOCK_ON_HAND_QTY == null) ? (String)null : l_STOCK_ON_HAND_QTY[0]) );
		struct.setList_l_STOCK_ON_HAND_QTY(TypeConverter.convert(l_STOCK_ON_HAND_QTY));
		struct.setl_ODR_STS_TYP_DN( ((l_ODR_STS_TYP_DN == null) ? (String)null : l_ODR_STS_TYP_DN[0]) );
		struct.setList_l_ODR_STS_TYP_DN(TypeConverter.convert(l_ODR_STS_TYP_DN));
		struct.setl_PRD_DUE_DATE( ((l_PRD_DUE_DATE == null) ? (String)null : l_PRD_DUE_DATE[0]) );
		struct.setList_l_PRD_DUE_DATE(TypeConverter.convert(l_PRD_DUE_DATE));
		struct.setl_TOTAL_RCV_QTY( ((l_TOTAL_RCV_QTY == null) ? (String)null : l_TOTAL_RCV_QTY[0]) );
		struct.setList_l_TOTAL_RCV_QTY(TypeConverter.convert(l_TOTAL_RCV_QTY));
		struct.setl_ODR_START_DATE( ((l_ODR_START_DATE == null) ? (String)null : l_ODR_START_DATE[0]) );
		struct.setList_l_ODR_START_DATE(TypeConverter.convert(l_ODR_START_DATE));
		struct.setl_PRD_START_DATE( ((l_PRD_START_DATE == null) ? (String)null : l_PRD_START_DATE[0]) );
		struct.setList_l_PRD_START_DATE(TypeConverter.convert(l_PRD_START_DATE));
		struct.setUNIT_QTY_TYP( ((UNIT_QTY_TYP == null) ? (String)null : UNIT_QTY_TYP[0]) );
		struct.setList_UNIT_QTY_TYP(TypeConverter.convert(UNIT_QTY_TYP));
		struct.setSUM_OF_ALCD_QTY( ((SUM_OF_ALCD_QTY == null) ? (String)null : SUM_OF_ALCD_QTY[0]) );
		struct.setList_SUM_OF_ALCD_QTY(TypeConverter.convert(SUM_OF_ALCD_QTY));
		struct.setISSUEED_QTY( ((ISSUEED_QTY == null) ? (String)null : ISSUEED_QTY[0]) );
		struct.setList_ISSUEED_QTY(TypeConverter.convert(ISSUEED_QTY));
		struct.setODR_STS_TYP( ((ODR_STS_TYP == null) ? (String)null : ODR_STS_TYP[0]) );
		struct.setList_ODR_STS_TYP(TypeConverter.convert(ODR_STS_TYP));
		struct.setTOTAL_RCV_QTY( ((TOTAL_RCV_QTY == null) ? (String)null : TOTAL_RCV_QTY[0]) );
		struct.setList_TOTAL_RCV_QTY(TypeConverter.convert(TOTAL_RCV_QTY));
		struct.setSTOCK_ON_HAND_QTY( ((STOCK_ON_HAND_QTY == null) ? (String)null : STOCK_ON_HAND_QTY[0]) );
		struct.setList_STOCK_ON_HAND_QTY(TypeConverter.convert(STOCK_ON_HAND_QTY));
		struct.setPRD_DUE_DATE( ((PRD_DUE_DATE == null) ? (String)null : PRD_DUE_DATE[0]) );
		struct.setList_PRD_DUE_DATE(TypeConverter.convert(PRD_DUE_DATE));
		struct.setODR_START_DATE( ((ODR_START_DATE == null) ? (String)null : ODR_START_DATE[0]) );
		struct.setList_ODR_START_DATE(TypeConverter.convert(ODR_START_DATE));
		struct.setPRD_START_DATE( ((PRD_START_DATE == null) ? (String)null : PRD_START_DATE[0]) );
		struct.setList_PRD_START_DATE(TypeConverter.convert(PRD_START_DATE));
		struct.setALC_GRP_CD( ((ALC_GRP_CD == null) ? (String)null : ALC_GRP_CD[0]) );
		struct.setList_ALC_GRP_CD(TypeConverter.convert(ALC_GRP_CD));
		struct.setDM_STS_TYP( ((DM_STS_TYP == null) ? (String)null : DM_STS_TYP[0]) );
		struct.setList_DM_STS_TYP(TypeConverter.convert(DM_STS_TYP));
		struct.setTOTAL_ISSUE_QTY( ((TOTAL_ISSUE_QTY == null) ? (String)null : TOTAL_ISSUE_QTY[0]) );
		struct.setList_TOTAL_ISSUE_QTY(TypeConverter.convert(TOTAL_ISSUE_QTY));
		struct.setDUE_DATE( ((DUE_DATE == null) ? (String)null : DUE_DATE[0]) );
		struct.setList_DUE_DATE(TypeConverter.convert(DUE_DATE));
		struct.setl_ODR_QTY( ((l_ODR_QTY == null) ? (String)null : l_ODR_QTY[0]) );
		struct.setList_l_ODR_QTY(TypeConverter.convert(l_ODR_QTY));
		struct.setl_ALC_GRP_CD( ((l_ALC_GRP_CD == null) ? (String)null : l_ALC_GRP_CD[0]) );
		struct.setList_l_ALC_GRP_CD(TypeConverter.convert(l_ALC_GRP_CD));
		struct.setl_JOB_ODR_STS_TYP_DN( ((l_JOB_ODR_STS_TYP_DN == null) ? (String)null : l_JOB_ODR_STS_TYP_DN[0]) );
		struct.setList_l_JOB_ODR_STS_TYP_DN(TypeConverter.convert(l_JOB_ODR_STS_TYP_DN));
		struct.setODR_QTY( ((ODR_QTY == null) ? (String)null : ODR_QTY[0]) );
		struct.setList_ODR_QTY(TypeConverter.convert(ODR_QTY));
		struct.setl_ODR_STS_TYP( ((l_ODR_STS_TYP == null) ? (String)null : l_ODR_STS_TYP[0]) );
		struct.setList_l_ODR_STS_TYP(TypeConverter.convert(l_ODR_STS_TYP));
		struct.setl_JOB_ODR_STS_TYP( ((l_JOB_ODR_STS_TYP == null) ? (String)null : l_JOB_ODR_STS_TYP[0]) );
		struct.setList_l_JOB_ODR_STS_TYP(TypeConverter.convert(l_JOB_ODR_STS_TYP));
		struct.setALLOCATABLE_QTY( ((ALLOCATABLE_QTY == null) ? (String)null : ALLOCATABLE_QTY[0]) );
		struct.setList_ALLOCATABLE_QTY(TypeConverter.convert(ALLOCATABLE_QTY));
		struct.setl_ALLOCATABLE_QTY( ((l_ALLOCATABLE_QTY == null) ? (String)null : l_ALLOCATABLE_QTY[0]) );
		struct.setList_l_ALLOCATABLE_QTY(TypeConverter.convert(l_ALLOCATABLE_QTY));
		struct.setSUM_OF_ALLOCATABLE_QTY( ((SUM_OF_ALLOCATABLE_QTY == null) ? (String)null : SUM_OF_ALLOCATABLE_QTY[0]) );
		struct.setList_SUM_OF_ALLOCATABLE_QTY(TypeConverter.convert(SUM_OF_ALLOCATABLE_QTY));
		struct.setSTOCK_UNIT_2( ((STOCK_UNIT_2 == null) ? (String)null : STOCK_UNIT_2[0]) );
		struct.setList_STOCK_UNIT_2(TypeConverter.convert(STOCK_UNIT_2));
		struct.setSTOCK_UNIT_3( ((STOCK_UNIT_3 == null) ? (String)null : STOCK_UNIT_3[0]) );
		struct.setList_STOCK_UNIT_3(TypeConverter.convert(STOCK_UNIT_3));
		struct.setSTOCK_UNIT_1( ((STOCK_UNIT_1 == null) ? (String)null : STOCK_UNIT_1[0]) );
		struct.setList_STOCK_UNIT_1(TypeConverter.convert(STOCK_UNIT_1));
		struct.setSTOCK_UNIT_4( ((STOCK_UNIT_4 == null) ? (String)null : STOCK_UNIT_4[0]) );
		struct.setList_STOCK_UNIT_4(TypeConverter.convert(STOCK_UNIT_4));
		struct.setSTOCK_UNIT_5( ((STOCK_UNIT_5 == null) ? (String)null : STOCK_UNIT_5[0]) );
		struct.setList_STOCK_UNIT_5(TypeConverter.convert(STOCK_UNIT_5));
		struct.setSTOCK_UNIT_6( ((STOCK_UNIT_6 == null) ? (String)null : STOCK_UNIT_6[0]) );
		struct.setList_STOCK_UNIT_6(TypeConverter.convert(STOCK_UNIT_6));
		struct.setSTOCK_UNIT_7( ((STOCK_UNIT_7 == null) ? (String)null : STOCK_UNIT_7[0]) );
		struct.setList_STOCK_UNIT_7(TypeConverter.convert(STOCK_UNIT_7));
		struct.setSTOCK_UNIT_8( ((STOCK_UNIT_8 == null) ? (String)null : STOCK_UNIT_8[0]) );
		struct.setList_STOCK_UNIT_8(TypeConverter.convert(STOCK_UNIT_8));
		struct.setSTOCK_UNIT_9( ((STOCK_UNIT_9 == null) ? (String)null : STOCK_UNIT_9[0]) );
		struct.setList_STOCK_UNIT_9(TypeConverter.convert(STOCK_UNIT_9));
		struct.setSTOCK_UNIT_10( ((STOCK_UNIT_10 == null) ? (String)null : STOCK_UNIT_10[0]) );
		struct.setList_STOCK_UNIT_10(TypeConverter.convert(STOCK_UNIT_10));
		struct.setSTOCK_UNIT_11( ((STOCK_UNIT_11 == null) ? (String)null : STOCK_UNIT_11[0]) );
		struct.setList_STOCK_UNIT_11(TypeConverter.convert(STOCK_UNIT_11));
		struct.setSUM_OF_ALC_REMAIN_QTY( ((SUM_OF_ALC_REMAIN_QTY == null) ? (String)null : SUM_OF_ALC_REMAIN_QTY[0]) );
		struct.setList_SUM_OF_ALC_REMAIN_QTY(TypeConverter.convert(SUM_OF_ALC_REMAIN_QTY));
		struct.setISSUE_REMAIN_QTY( ((ISSUE_REMAIN_QTY == null) ? (String)null : ISSUE_REMAIN_QTY[0]) );
		struct.setList_ISSUE_REMAIN_QTY(TypeConverter.convert(ISSUE_REMAIN_QTY));
		struct.setl_OD_NO( ((l_OD_NO == null) ? (String)null : l_OD_NO[0]) );
		struct.setList_l_OD_NO(TypeConverter.convert(l_OD_NO));
		struct.setl_JOB_ODR_DETAIL_NO( ((l_JOB_ODR_DETAIL_NO == null) ? (String)null : l_JOB_ODR_DETAIL_NO[0]) );
		struct.setList_l_JOB_ODR_DETAIL_NO(TypeConverter.convert(l_JOB_ODR_DETAIL_NO));
		struct.setl_JOB_ODR_CANCEL_NO( ((l_JOB_ODR_CANCEL_NO == null) ? (String)null : l_JOB_ODR_CANCEL_NO[0]) );
		struct.setList_l_JOB_ODR_CANCEL_NO(TypeConverter.convert(l_JOB_ODR_CANCEL_NO));
		struct.setl_MODIFY_COUNT( ((l_MODIFY_COUNT == null) ? (String)null : l_MODIFY_COUNT[0]) );
		struct.setList_l_MODIFY_COUNT(TypeConverter.convert(l_MODIFY_COUNT));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setJOB_ODR_EXP_TYP( ((JOB_ODR_EXP_TYP == null) ? (String)null : JOB_ODR_EXP_TYP[0]) );
		struct.setList_JOB_ODR_EXP_TYP(TypeConverter.convert(JOB_ODR_EXP_TYP));
		struct.setOD_CALC_FLG( ((OD_CALC_FLG == null) ? (String)null : OD_CALC_FLG[0]) );
		struct.setList_OD_CALC_FLG(TypeConverter.convert(OD_CALC_FLG));
		struct.setl_JOB_ODR_EXP_TYP( ((l_JOB_ODR_EXP_TYP == null) ? (String)null : l_JOB_ODR_EXP_TYP[0]) );
		struct.setList_l_JOB_ODR_EXP_TYP(TypeConverter.convert(l_JOB_ODR_EXP_TYP));
		struct.setl_MRP_TYP( ((l_MRP_TYP == null) ? (String)null : l_MRP_TYP[0]) );
		struct.setList_l_MRP_TYP(TypeConverter.convert(l_MRP_TYP));
		struct.setJOB_ODR_STS_TYP_2( ((JOB_ODR_STS_TYP_2 == null) ? (String)null : JOB_ODR_STS_TYP_2[0]) );
		struct.setList_JOB_ODR_STS_TYP_2(TypeConverter.convert(JOB_ODR_STS_TYP_2));
		struct.setALC_GRP_CD_2( ((ALC_GRP_CD_2 == null) ? (String)null : ALC_GRP_CD_2[0]) );
		struct.setList_ALC_GRP_CD_2(TypeConverter.convert(ALC_GRP_CD_2));
		struct.setl_ALC_TYP_2( ((l_ALC_TYP_2 == null) ? (String)null : l_ALC_TYP_2[0]) );
		struct.setList_l_ALC_TYP_2(TypeConverter.convert(l_ALC_TYP_2));
		struct.setl_ALC_TYP_2_DN( ((l_ALC_TYP_2_DN == null) ? (String)null : l_ALC_TYP_2_DN[0]) );
		struct.setList_l_ALC_TYP_2_DN(TypeConverter.convert(l_ALC_TYP_2_DN));
		struct.setl_ISSUEED_QTY( ((l_ISSUEED_QTY == null) ? (String)null : l_ISSUEED_QTY[0]) );
		struct.setList_l_ISSUEED_QTY(TypeConverter.convert(l_ISSUEED_QTY));
		struct.setALC_TYP_2( ((ALC_TYP_2 == null) ? (String)null : ALC_TYP_2[0]) );
		struct.setList_ALC_TYP_2(TypeConverter.convert(ALC_TYP_2));
		struct.setJOB_ODR_CD_2( ((JOB_ODR_CD_2 == null) ? (String)null : JOB_ODR_CD_2[0]) );
		struct.setList_JOB_ODR_CD_2(TypeConverter.convert(JOB_ODR_CD_2));
		struct.setJOB_ODR_DETAIL_NO_2( ((JOB_ODR_DETAIL_NO_2 == null) ? (String)null : JOB_ODR_DETAIL_NO_2[0]) );
		struct.setList_JOB_ODR_DETAIL_NO_2(TypeConverter.convert(JOB_ODR_DETAIL_NO_2));
		struct.setJOB_ODR_CANCEL_NO_2( ((JOB_ODR_CANCEL_NO_2 == null) ? (String)null : JOB_ODR_CANCEL_NO_2[0]) );
		struct.setList_JOB_ODR_CANCEL_NO_2(TypeConverter.convert(JOB_ODR_CANCEL_NO_2));
		struct.setl_ISSUE_REMAIN_QTY( ((l_ISSUE_REMAIN_QTY == null) ? (String)null : l_ISSUE_REMAIN_QTY[0]) );
		struct.setList_l_ISSUE_REMAIN_QTY(TypeConverter.convert(l_ISSUE_REMAIN_QTY));
		struct.seth_OD_NO( ((h_OD_NO == null) ? (String)null : h_OD_NO[0]) );
		struct.setList_h_OD_NO(TypeConverter.convert(h_OD_NO));
		struct.setDM_STS_TYP_DN( ((DM_STS_TYP_DN == null) ? (String)null : DM_STS_TYP_DN[0]) );
		struct.setList_DM_STS_TYP_DN(TypeConverter.convert(DM_STS_TYP_DN));
		struct.setODR_STS_TYP_DN( ((ODR_STS_TYP_DN == null) ? (String)null : ODR_STS_TYP_DN[0]) );
		struct.setList_ODR_STS_TYP_DN(TypeConverter.convert(ODR_STS_TYP_DN));
		struct.setALC_TYP_2_DN( ((ALC_TYP_2_DN == null) ? (String)null : ALC_TYP_2_DN[0]) );
		struct.setList_ALC_TYP_2_DN(TypeConverter.convert(ALC_TYP_2_DN));
		struct.setUNIT_QTY_TYP_DN( ((UNIT_QTY_TYP_DN == null) ? (String)null : UNIT_QTY_TYP_DN[0]) );
		struct.setList_UNIT_QTY_TYP_DN(TypeConverter.convert(UNIT_QTY_TYP_DN));
		struct.setJOB_ODR_STS_TYP_DN_2( ((JOB_ODR_STS_TYP_DN_2 == null) ? (String)null : JOB_ODR_STS_TYP_DN_2[0]) );
		struct.setList_JOB_ODR_STS_TYP_DN_2(TypeConverter.convert(JOB_ODR_STS_TYP_DN_2));
		struct.setJOB_ODR_STS_TYP( ((JOB_ODR_STS_TYP == null) ? (String)null : JOB_ODR_STS_TYP[0]) );
		struct.setList_JOB_ODR_STS_TYP(TypeConverter.convert(JOB_ODR_STS_TYP));
		struct.setJOB_ODR_STS_TYP_DN( ((JOB_ODR_STS_TYP_DN == null) ? (String)null : JOB_ODR_STS_TYP_DN[0]) );
		struct.setList_JOB_ODR_STS_TYP_DN(TypeConverter.convert(JOB_ODR_STS_TYP_DN));
		struct.setDUE_TIME( ((DUE_TIME == null) ? (String)null : DUE_TIME[0]) );
		struct.setList_DUE_TIME(TypeConverter.convert(DUE_TIME));
		struct.setPRD_DUE_TIME( ((PRD_DUE_TIME == null) ? (String)null : PRD_DUE_TIME[0]) );
		struct.setList_PRD_DUE_TIME(TypeConverter.convert(PRD_DUE_TIME));
		struct.setODR_START_TIME( ((ODR_START_TIME == null) ? (String)null : ODR_START_TIME[0]) );
		struct.setList_ODR_START_TIME(TypeConverter.convert(ODR_START_TIME));
		struct.setPRD_START_TIME( ((PRD_START_TIME == null) ? (String)null : PRD_START_TIME[0]) );
		struct.setList_PRD_START_TIME(TypeConverter.convert(PRD_START_TIME));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AC0100010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAC0100010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAC0100010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AC0100010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0100010Entity entity = control.entity;
		AC0100010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0100");
		logger.entering("AC0100010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AC0100010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AC0100010Control control;
		AC0100010Entity  entity = null;
		AC0100010Struct  struct = null;

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

			if( (control = (AC0100010Control)so.getAttribute("AC0100010Control_"+request.getSession(false).getId())) == null ) {
				control = new AC0100010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AC0100010Control();
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
				} else if( isClick(request, "AlcUpdate") ) {
					if ( !isCryptical(request, so, params, "AlcUpdate") ) return ERROR_TARGET;
					target = onClickAlcUpdate(request, response, so, params, control);
					control.setButton("AlcUpdate");
				} else if( isClick(request, "AlcDelete") ) {
					if ( !isCryptical(request, so, params, "AlcDelete") ) return ERROR_TARGET;
					target = onClickAlcDelete(request, response, so, params, control);
					control.setButton("AlcDelete");
				} else if( isClick(request, "AlcInsert") ) {
					if ( !isCryptical(request, so, params, "AlcInsert") ) return ERROR_TARGET;
					target = onClickAlcInsert(request, response, so, params, control);
					control.setButton("AlcInsert");
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
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AC0100010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "AlcUpdate") && bFLG_DISCONNECT_AlcUpdate)
				|| (isClick(request, "AlcDelete") && bFLG_DISCONNECT_AlcDelete)
				|| (isClick(request, "AlcInsert") && bFLG_DISCONNECT_AlcInsert)
				|| (isClick(request, "Insert") && bFLG_DISCONNECT_Insert)
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				|| (isClick(request, "Return") && bFLG_DISCONNECT_Return)
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
	private  static boolean bFLG_DISCONNECT_AlcUpdate = true;
	private  static boolean bFLG_DISCONNECT_AlcDelete = true;
	private  static boolean bFLG_DISCONNECT_AlcInsert = true;
	private  static boolean bFLG_DISCONNECT_Insert = true;
	private  static boolean bFLG_DISCONNECT_Update = true;
	private  static boolean bFLG_DISCONNECT_Return = true;

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
		return "com.nec.jp.orteus.metamorBase.AC0100.AC0100010Servlet";
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
	public AC0100010Servlet()
	{
		//{{user_implement_dev:<AC0100010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_AlcUpdate = true;
		bFLG_DISCONNECT_AlcDelete = true;
		bFLG_DISCONNECT_AlcInsert = true;
		bFLG_DISCONNECT_Insert = true;
		bFLG_DISCONNECT_Update = true;
		bFLG_DISCONNECT_Return = true;

                //}}user_implement_dev:<AC0100010_DisConnect_FLG>

		//{{user_implement_dev:<AC0100010Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AC0100010Servlet>
	}

	//////////////////////////////

}
