/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0120/src/com/nec/jp/orteus/metamorBase/AC0120/AC0120010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0120;

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

public class AC0120010Servlet extends HttpServlet
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
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AC0120010Control control)
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
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AC0120010Control control)
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
	 * @param control AC0120010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
			logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			objMessage.m_writer.write( Level.ALL, "AC0120010"+" $Revision: 1.18 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AC0120010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0120010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * FlashTree�������{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickFlashTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");
		//{{user_implement_dev:<onClickFlashTree>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("FlashTree");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickFlashTree>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");

		return nextUrl;
	}

	/**
	 * �s�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickappend(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120011.jsp";		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickappend");
		//{{user_implement_dev:<onClickappend>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
          control.setNextUrl(nextUrl);
			control.control_eventHandller("append");
          nextUrl = control.getNextUrl();
            // �q��ʂɑJ��
           // nextUrl = "/AC0120011.jsp";

		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickappend>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickappend");

		return nextUrl;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickmodify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120011.jsp";		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");
		//{{user_implement_dev:<onClickmodify>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
          control.setNextUrl(nextUrl);
			control.control_eventHandller("modify");
          nextUrl = control.getNextUrl();
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickmodify>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * PeekerItemCd�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickPeekerItemCd(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickPeekerItemCd");
		//{{user_implement_dev:<onClickPeekerItemCd>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("PeekerItemCd");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickPeekerItemCd>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickPeekerItemCd");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.setNextUrl(nextUrl);
          
			control.control_eventHandller("insert");
			nextUrl = control.getNextUrl();

        } catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
          control.setNextUrl(nextUrl);
          control.control_eventHandller("update");
          nextUrl = control.getNextUrl();

		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickcancelSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120010.jsp";		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelSub1");
		//{{user_implement_dev:<onClickcancelSub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("cancelSub1");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickcancelSub1>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelSub1");

		return nextUrl;
	}

	/**
	 * �ڍו\���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickShowDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120010Detail.jsp";		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");
		//{{user_implement_dev:<onClickShowDetail>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ShowDetail");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickShowDetail>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");

		return nextUrl;
	}

	/**
	 * �c���[�ǉ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickAddTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120010Control.jsp";		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");
		//{{user_implement_dev:<onClickAddTree>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("AddTree");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickAddTree>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickselectSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AC0120011.jsp";		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickselectSub1");
		//{{user_implement_dev:<onClickselectSub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("selectSub1");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickselectSub1>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickselectSub1");

		return nextUrl;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0120010Control�N���X�C���X�^���X
	 */
	public String onClickCsvOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0120010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");
		//{{user_implement_dev:<onClickCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CsvOut");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCsvOut>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AC0120010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] JOB_ODR_CANCEL_NO = ((params.containsKey("JOB_ODR_CANCEL_NO")) ? (String[])params.get("JOB_ODR_CANCEL_NO") : (String[])null);
		String[] InitLevel = ((params.containsKey("InitLevel")) ? (String[])params.get("InitLevel") : (String[])null);
		String[] id = ((params.containsKey("id")) ? (String[])params.get("id") : (String[])null);
		String[] lvl = ((params.containsKey("lvl")) ? (String[])params.get("lvl") : (String[])null);
		String[] parent = ((params.containsKey("parent")) ? (String[])params.get("parent") : (String[])null);
		String[] label = ((params.containsKey("label")) ? (String[])params.get("label") : (String[])null);
		String[] ctx = ((params.containsKey("ctx")) ? (String[])params.get("ctx") : (String[])null);
		String[] maxid = ((params.containsKey("maxid")) ? (String[])params.get("maxid") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] OD_NO = ((params.containsKey("OD_NO")) ? (String[])params.get("OD_NO") : (String[])null);
		String[] MRP_TYP = ((params.containsKey("MRP_TYP")) ? (String[])params.get("MRP_TYP") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] ODR_STS_TYP = ((params.containsKey("ODR_STS_TYP")) ? (String[])params.get("ODR_STS_TYP") : (String[])null);
		String[] DM_STS_TYP = ((params.containsKey("DM_STS_TYP")) ? (String[])params.get("DM_STS_TYP") : (String[])null);
		String[] OD_TYP = ((params.containsKey("OD_TYP")) ? (String[])params.get("OD_TYP") : (String[])null);
		String[] JOB_ODR_STS_TYP = ((params.containsKey("JOB_ODR_STS_TYP")) ? (String[])params.get("JOB_ODR_STS_TYP") : (String[])null);
		String[] PARENT_OD_NO = ((params.containsKey("PARENT_OD_NO")) ? (String[])params.get("PARENT_OD_NO") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] OUTSIDE_TYP_DN = ((params.containsKey("OUTSIDE_TYP_DN")) ? (String[])params.get("OUTSIDE_TYP_DN") : (String[])null);
		String[] ITEM_SPOIL = ((params.containsKey("ITEM_SPOIL")) ? (String[])params.get("ITEM_SPOIL") : (String[])null);
		String[] UNIT_QTY_TYP_DN = ((params.containsKey("UNIT_QTY_TYP_DN")) ? (String[])params.get("UNIT_QTY_TYP_DN") : (String[])null);
		String[] DUE_DATE = ((params.containsKey("DUE_DATE")) ? (String[])params.get("DUE_DATE") : (String[])null);
		String[] PRD_DUE_DATE = ((params.containsKey("PRD_DUE_DATE")) ? (String[])params.get("PRD_DUE_DATE") : (String[])null);
		String[] PRD_START_DATE = ((params.containsKey("PRD_START_DATE")) ? (String[])params.get("PRD_START_DATE") : (String[])null);
		String[] ODR_START_DATE = ((params.containsKey("ODR_START_DATE")) ? (String[])params.get("ODR_START_DATE") : (String[])null);
		String[] DM_QTY = ((params.containsKey("DM_QTY")) ? (String[])params.get("DM_QTY") : (String[])null);
		String[] ODR_QTY = ((params.containsKey("ODR_QTY")) ? (String[])params.get("ODR_QTY") : (String[])null);
		String[] SUM_ALCD_QTY = ((params.containsKey("SUM_ALCD_QTY")) ? (String[])params.get("SUM_ALCD_QTY") : (String[])null);
		String[] ODR_STS_TYP_DN = ((params.containsKey("ODR_STS_TYP_DN")) ? (String[])params.get("ODR_STS_TYP_DN") : (String[])null);
		String[] DM_STS_TYP_DN = ((params.containsKey("DM_STS_TYP_DN")) ? (String[])params.get("DM_STS_TYP_DN") : (String[])null);
		String[] OD_TYP_DN = ((params.containsKey("OD_TYP_DN")) ? (String[])params.get("OD_TYP_DN") : (String[])null);
		String[] Sub1_Parent_ITEM_CD = ((params.containsKey("Sub1_Parent_ITEM_CD")) ? (String[])params.get("Sub1_Parent_ITEM_CD") : (String[])null);
		String[] Sub1_Parent_ITEM_NAME = ((params.containsKey("Sub1_Parent_ITEM_NAME")) ? (String[])params.get("Sub1_Parent_ITEM_NAME") : (String[])null);
		String[] Sub1_Comp_ITEM_CD = ((params.containsKey("Sub1_Comp_ITEM_CD")) ? (String[])params.get("Sub1_Comp_ITEM_CD") : (String[])null);
		String[] Sub1_Comp_ITEM_NAME = ((params.containsKey("Sub1_Comp_ITEM_NAME")) ? (String[])params.get("Sub1_Comp_ITEM_NAME") : (String[])null);
		String[] Sub1_DRAW_CD = ((params.containsKey("Sub1_DRAW_CD")) ? (String[])params.get("Sub1_DRAW_CD") : (String[])null);
		String[] Sub1_SPEC = ((params.containsKey("Sub1_SPEC")) ? (String[])params.get("Sub1_SPEC") : (String[])null);
		String[] Sub1_PS_UNIT_DENOMINATOR = ((params.containsKey("Sub1_PS_UNIT_DENOMINATOR")) ? (String[])params.get("Sub1_PS_UNIT_DENOMINATOR") : (String[])null);
		String[] Sub1_PS_UNIT_NUMERATOR = ((params.containsKey("Sub1_PS_UNIT_NUMERATOR")) ? (String[])params.get("Sub1_PS_UNIT_NUMERATOR") : (String[])null);
		String[] Sub1_DM_QTY = ((params.containsKey("Sub1_DM_QTY")) ? (String[])params.get("Sub1_DM_QTY") : (String[])null);
		String[] Sub1_ODR_QTY = ((params.containsKey("Sub1_ODR_QTY")) ? (String[])params.get("Sub1_ODR_QTY") : (String[])null);
		String[] Sub1_DUE_DATE = ((params.containsKey("Sub1_DUE_DATE")) ? (String[])params.get("Sub1_DUE_DATE") : (String[])null);
		String[] Sub1_PRD_DUE_DATE = ((params.containsKey("Sub1_PRD_DUE_DATE")) ? (String[])params.get("Sub1_PRD_DUE_DATE") : (String[])null);
		String[] Sub1_PRD_START_DATE = ((params.containsKey("Sub1_PRD_START_DATE")) ? (String[])params.get("Sub1_PRD_START_DATE") : (String[])null);
		String[] Sub1_ODR_START_DATE = ((params.containsKey("Sub1_ODR_START_DATE")) ? (String[])params.get("Sub1_ODR_START_DATE") : (String[])null);
		String[] Sub1_OUTSIDE_TYP = ((params.containsKey("Sub1_OUTSIDE_TYP")) ? (String[])params.get("Sub1_OUTSIDE_TYP") : (String[])null);
		String[] Sub1_OUTSIDE_TYP_name = ((params.containsKey("Sub1_OUTSIDE_TYP_name")) ? (String[])params.get("Sub1_OUTSIDE_TYP_name") : (String[])null);
		String[] Sub1_OUTSIDE_TYP_val = ((params.containsKey("Sub1_OUTSIDE_TYP_val")) ? (String[])params.get("Sub1_OUTSIDE_TYP_val") : (String[])null);
		String[] Sub1_ITEM_SPOIL = ((params.containsKey("Sub1_ITEM_SPOIL")) ? (String[])params.get("Sub1_ITEM_SPOIL") : (String[])null);
		String[] Sub1_PS_SPOIL = ((params.containsKey("Sub1_PS_SPOIL")) ? (String[])params.get("Sub1_PS_SPOIL") : (String[])null);
		String[] h_Sub1_PS_UNIT_QTY = ((params.containsKey("h_Sub1_PS_UNIT_QTY")) ? (String[])params.get("h_Sub1_PS_UNIT_QTY") : (String[])null);
		String[] Sub1_MRP_ODR_TYP_DN = ((params.containsKey("Sub1_MRP_ODR_TYP_DN")) ? (String[])params.get("Sub1_MRP_ODR_TYP_DN") : (String[])null);
		String[] Sub1_UNIT_QTY_TYP_DN = ((params.containsKey("Sub1_UNIT_QTY_TYP_DN")) ? (String[])params.get("Sub1_UNIT_QTY_TYP_DN") : (String[])null);
		String[] Sub1_STOCK_UNIT = ((params.containsKey("Sub1_STOCK_UNIT")) ? (String[])params.get("Sub1_STOCK_UNIT") : (String[])null);
		String[] h_Sub1_Parent_ODR_QTY = ((params.containsKey("h_Sub1_Parent_ODR_QTY")) ? (String[])params.get("h_Sub1_Parent_ODR_QTY") : (String[])null);
		String[] h_Sub1_MRP_ODR_TYP = ((params.containsKey("h_Sub1_MRP_ODR_TYP")) ? (String[])params.get("h_Sub1_MRP_ODR_TYP") : (String[])null);
		String[] h_Sub1_UNIT_QTY_TYP = ((params.containsKey("h_Sub1_UNIT_QTY_TYP")) ? (String[])params.get("h_Sub1_UNIT_QTY_TYP") : (String[])null);
		String[] h_Sub1_Parent_ODR_START_DATE = ((params.containsKey("h_Sub1_Parent_ODR_START_DATE")) ? (String[])params.get("h_Sub1_Parent_ODR_START_DATE") : (String[])null);
		String[] h_Parent_OD_MODIFY_COUNT = ((params.containsKey("h_Parent_OD_MODIFY_COUNT")) ? (String[])params.get("h_Parent_OD_MODIFY_COUNT") : (String[])null);
		String[] h_Comp_ITEM_MODIFY_COUNT = ((params.containsKey("h_Comp_ITEM_MODIFY_COUNT")) ? (String[])params.get("h_Comp_ITEM_MODIFY_COUNT") : (String[])null);
		String[] h_Sub1_Parent_OD_LEVEL_NO = ((params.containsKey("h_Sub1_Parent_OD_LEVEL_NO")) ? (String[])params.get("h_Sub1_Parent_OD_LEVEL_NO") : (String[])null);
		String[] h_Sub1_ISSUE_TYP = ((params.containsKey("h_Sub1_ISSUE_TYP")) ? (String[])params.get("h_Sub1_ISSUE_TYP") : (String[])null);
		String[] h_Sub1_Parent_ALC_GRP_CD = ((params.containsKey("h_Sub1_Parent_ALC_GRP_CD")) ? (String[])params.get("h_Sub1_Parent_ALC_GRP_CD") : (String[])null);
		String[] AC0120010tree1 = ((params.containsKey("AC0120010tree1")) ? (String[])params.get("AC0120010tree1") : (String[])null);
		String[] c_JOB_ODR_DEL = ((params.containsKey("c_JOB_ODR_DEL")) ? (String[])params.get("c_JOB_ODR_DEL") : (String[])null);
		String[] h_BUSINESS_OPR_DATE = ((params.containsKey("h_BUSINESS_OPR_DATE")) ? (String[])params.get("h_BUSINESS_OPR_DATE") : (String[])null);
		String[] h_Sub1_OD_MODIFY_COUNT = ((params.containsKey("h_Sub1_OD_MODIFY_COUNT")) ? (String[])params.get("h_Sub1_OD_MODIFY_COUNT") : (String[])null);
		String[] OD_GNR_TYP_DN = ((params.containsKey("OD_GNR_TYP_DN")) ? (String[])params.get("OD_GNR_TYP_DN") : (String[])null);
		String[] Detail_ITEM_NAME = ((params.containsKey("Detail_ITEM_NAME")) ? (String[])params.get("Detail_ITEM_NAME") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] Sub1_DUE_TIME = ((params.containsKey("Sub1_DUE_TIME")) ? (String[])params.get("Sub1_DUE_TIME") : (String[])null);
		String[] Sub1_DUE_TIME2 = ((params.containsKey("Sub1_DUE_TIME2")) ? (String[])params.get("Sub1_DUE_TIME2") : (String[])null);
		String[] Sub1_DUE_TIME3 = ((params.containsKey("Sub1_DUE_TIME3")) ? (String[])params.get("Sub1_DUE_TIME3") : (String[])null);
		String[] Sub1_PRD_DUE_TIME = ((params.containsKey("Sub1_PRD_DUE_TIME")) ? (String[])params.get("Sub1_PRD_DUE_TIME") : (String[])null);
		String[] Sub1_PRD_START_TIME = ((params.containsKey("Sub1_PRD_START_TIME")) ? (String[])params.get("Sub1_PRD_START_TIME") : (String[])null);
		String[] Sub1_ODR_START_TIME = ((params.containsKey("Sub1_ODR_START_TIME")) ? (String[])params.get("Sub1_ODR_START_TIME") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);
		String[] MANHOUR_TYP = ((params.containsKey("MANHOUR_TYP")) ? (String[])params.get("MANHOUR_TYP") : (String[])null);
		String[] MANHOUR_TYP_DN = ((params.containsKey("MANHOUR_TYP_DN")) ? (String[])params.get("MANHOUR_TYP_DN") : (String[])null);
		String[] h_Sub1_MANHOUR_TYP = ((params.containsKey("h_Sub1_MANHOUR_TYP")) ? (String[])params.get("h_Sub1_MANHOUR_TYP") : (String[])null);
		String[] OPR_RSLT_TYP_DN = ((params.containsKey("OPR_RSLT_TYP_DN")) ? (String[])params.get("OPR_RSLT_TYP_DN") : (String[])null);
		String[] TOTAL_RCV_QTY = ((params.containsKey("TOTAL_RCV_QTY")) ? (String[])params.get("TOTAL_RCV_QTY") : (String[])null);
		String[] TOTAL_ISSUE_QTY = ((params.containsKey("TOTAL_ISSUE_QTY")) ? (String[])params.get("TOTAL_ISSUE_QTY") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] OPR_RSLT_TYP = ((params.containsKey("OPR_RSLT_TYP")) ? (String[])params.get("OPR_RSLT_TYP") : (String[])null);
		String[] JOB_ODR_STS_TYP1 = ((params.containsKey("JOB_ODR_STS_TYP1")) ? (String[])params.get("JOB_ODR_STS_TYP1") : (String[])null);
		String[] CHIID_OD_NO = ((params.containsKey("CHIID_OD_NO")) ? (String[])params.get("CHIID_OD_NO") : (String[])null);
		String[] h_DM_STS_TYP = ((params.containsKey("h_DM_STS_TYP")) ? (String[])params.get("h_DM_STS_TYP") : (String[])null);
		String[] h_ODR_STS_TYP = ((params.containsKey("h_ODR_STS_TYP")) ? (String[])params.get("h_ODR_STS_TYP") : (String[])null);
		String[] h_size = ((params.containsKey("h_size")) ? (String[])params.get("h_size") : (String[])null);

		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setJOB_ODR_CANCEL_NO( ((JOB_ODR_CANCEL_NO == null) ? (String)null : JOB_ODR_CANCEL_NO[0]) );
		struct.setList_JOB_ODR_CANCEL_NO(TypeConverter.convert(JOB_ODR_CANCEL_NO));
		struct.setInitLevel( ((InitLevel == null) ? (String)null : InitLevel[0]) );
		struct.setList_InitLevel(TypeConverter.convert(InitLevel));
		struct.setid( ((id == null) ? (String)null : id[0]) );
		struct.setList_id(TypeConverter.convert(id));
		struct.setlvl( ((lvl == null) ? (String)null : lvl[0]) );
		struct.setList_lvl(TypeConverter.convert(lvl));
		struct.setparent( ((parent == null) ? (String)null : parent[0]) );
		struct.setList_parent(TypeConverter.convert(parent));
		struct.setlabel( ((label == null) ? (String)null : label[0]) );
		struct.setList_label(TypeConverter.convert(label));
		struct.setctx( ((ctx == null) ? (String)null : ctx[0]) );
		struct.setList_ctx(TypeConverter.convert(ctx));
		struct.setmaxid( ((maxid == null) ? (String)null : maxid[0]) );
		struct.setList_maxid(TypeConverter.convert(maxid));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setOD_NO( ((OD_NO == null) ? (String)null : OD_NO[0]) );
		struct.setList_OD_NO(TypeConverter.convert(OD_NO));
		struct.setMRP_TYP( ((MRP_TYP == null) ? (String)null : MRP_TYP[0]) );
		struct.setList_MRP_TYP(TypeConverter.convert(MRP_TYP));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.setODR_STS_TYP( ((ODR_STS_TYP == null) ? (String)null : ODR_STS_TYP[0]) );
		struct.setList_ODR_STS_TYP(TypeConverter.convert(ODR_STS_TYP));
		struct.setDM_STS_TYP( ((DM_STS_TYP == null) ? (String)null : DM_STS_TYP[0]) );
		struct.setList_DM_STS_TYP(TypeConverter.convert(DM_STS_TYP));
		struct.setOD_TYP( ((OD_TYP == null) ? (String)null : OD_TYP[0]) );
		struct.setList_OD_TYP(TypeConverter.convert(OD_TYP));
		struct.setJOB_ODR_STS_TYP( ((JOB_ODR_STS_TYP == null) ? (String)null : JOB_ODR_STS_TYP[0]) );
		struct.setList_JOB_ODR_STS_TYP(TypeConverter.convert(JOB_ODR_STS_TYP));
		struct.setPARENT_OD_NO( ((PARENT_OD_NO == null) ? (String)null : PARENT_OD_NO[0]) );
		struct.setList_PARENT_OD_NO(TypeConverter.convert(PARENT_OD_NO));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setOUTSIDE_TYP_DN( ((OUTSIDE_TYP_DN == null) ? (String)null : OUTSIDE_TYP_DN[0]) );
		struct.setList_OUTSIDE_TYP_DN(TypeConverter.convert(OUTSIDE_TYP_DN));
		struct.setITEM_SPOIL( ((ITEM_SPOIL == null) ? (String)null : ITEM_SPOIL[0]) );
		struct.setList_ITEM_SPOIL(TypeConverter.convert(ITEM_SPOIL));
		struct.setUNIT_QTY_TYP_DN( ((UNIT_QTY_TYP_DN == null) ? (String)null : UNIT_QTY_TYP_DN[0]) );
		struct.setList_UNIT_QTY_TYP_DN(TypeConverter.convert(UNIT_QTY_TYP_DN));
		struct.setDUE_DATE( ((DUE_DATE == null) ? (String)null : DUE_DATE[0]) );
		struct.setList_DUE_DATE(TypeConverter.convert(DUE_DATE));
		struct.setPRD_DUE_DATE( ((PRD_DUE_DATE == null) ? (String)null : PRD_DUE_DATE[0]) );
		struct.setList_PRD_DUE_DATE(TypeConverter.convert(PRD_DUE_DATE));
		struct.setPRD_START_DATE( ((PRD_START_DATE == null) ? (String)null : PRD_START_DATE[0]) );
		struct.setList_PRD_START_DATE(TypeConverter.convert(PRD_START_DATE));
		struct.setODR_START_DATE( ((ODR_START_DATE == null) ? (String)null : ODR_START_DATE[0]) );
		struct.setList_ODR_START_DATE(TypeConverter.convert(ODR_START_DATE));
		struct.setDM_QTY( ((DM_QTY == null) ? (String)null : DM_QTY[0]) );
		struct.setList_DM_QTY(TypeConverter.convert(DM_QTY));
		struct.setODR_QTY( ((ODR_QTY == null) ? (String)null : ODR_QTY[0]) );
		struct.setList_ODR_QTY(TypeConverter.convert(ODR_QTY));
		struct.setSUM_ALCD_QTY( ((SUM_ALCD_QTY == null) ? (String)null : SUM_ALCD_QTY[0]) );
		struct.setList_SUM_ALCD_QTY(TypeConverter.convert(SUM_ALCD_QTY));
		struct.setODR_STS_TYP_DN( ((ODR_STS_TYP_DN == null) ? (String)null : ODR_STS_TYP_DN[0]) );
		struct.setList_ODR_STS_TYP_DN(TypeConverter.convert(ODR_STS_TYP_DN));
		struct.setDM_STS_TYP_DN( ((DM_STS_TYP_DN == null) ? (String)null : DM_STS_TYP_DN[0]) );
		struct.setList_DM_STS_TYP_DN(TypeConverter.convert(DM_STS_TYP_DN));
		struct.setOD_TYP_DN( ((OD_TYP_DN == null) ? (String)null : OD_TYP_DN[0]) );
		struct.setList_OD_TYP_DN(TypeConverter.convert(OD_TYP_DN));
		struct.setSub1_Parent_ITEM_CD( ((Sub1_Parent_ITEM_CD == null) ? (String)null : Sub1_Parent_ITEM_CD[0]) );
		struct.setList_Sub1_Parent_ITEM_CD(TypeConverter.convert(Sub1_Parent_ITEM_CD));
		struct.setSub1_Parent_ITEM_NAME( ((Sub1_Parent_ITEM_NAME == null) ? (String)null : Sub1_Parent_ITEM_NAME[0]) );
		struct.setList_Sub1_Parent_ITEM_NAME(TypeConverter.convert(Sub1_Parent_ITEM_NAME));
		struct.setSub1_Comp_ITEM_CD( ((Sub1_Comp_ITEM_CD == null) ? (String)null : Sub1_Comp_ITEM_CD[0]) );
		struct.setList_Sub1_Comp_ITEM_CD(TypeConverter.convert(Sub1_Comp_ITEM_CD));
		struct.setSub1_Comp_ITEM_NAME( ((Sub1_Comp_ITEM_NAME == null) ? (String)null : Sub1_Comp_ITEM_NAME[0]) );
		struct.setList_Sub1_Comp_ITEM_NAME(TypeConverter.convert(Sub1_Comp_ITEM_NAME));
		struct.setSub1_DRAW_CD( ((Sub1_DRAW_CD == null) ? (String)null : Sub1_DRAW_CD[0]) );
		struct.setList_Sub1_DRAW_CD(TypeConverter.convert(Sub1_DRAW_CD));
		struct.setSub1_SPEC( ((Sub1_SPEC == null) ? (String)null : Sub1_SPEC[0]) );
		struct.setList_Sub1_SPEC(TypeConverter.convert(Sub1_SPEC));
		struct.setSub1_PS_UNIT_DENOMINATOR( ((Sub1_PS_UNIT_DENOMINATOR == null) ? (String)null : Sub1_PS_UNIT_DENOMINATOR[0]) );
		struct.setList_Sub1_PS_UNIT_DENOMINATOR(TypeConverter.convert(Sub1_PS_UNIT_DENOMINATOR));
		struct.setSub1_PS_UNIT_NUMERATOR( ((Sub1_PS_UNIT_NUMERATOR == null) ? (String)null : Sub1_PS_UNIT_NUMERATOR[0]) );
		struct.setList_Sub1_PS_UNIT_NUMERATOR(TypeConverter.convert(Sub1_PS_UNIT_NUMERATOR));
		struct.setSub1_DM_QTY( ((Sub1_DM_QTY == null) ? (String)null : Sub1_DM_QTY[0]) );
		struct.setList_Sub1_DM_QTY(TypeConverter.convert(Sub1_DM_QTY));
		struct.setSub1_ODR_QTY( ((Sub1_ODR_QTY == null) ? (String)null : Sub1_ODR_QTY[0]) );
		struct.setList_Sub1_ODR_QTY(TypeConverter.convert(Sub1_ODR_QTY));
		struct.setSub1_DUE_DATE( ((Sub1_DUE_DATE == null) ? (String)null : Sub1_DUE_DATE[0]) );
		struct.setList_Sub1_DUE_DATE(TypeConverter.convert(Sub1_DUE_DATE));
		struct.setSub1_PRD_DUE_DATE( ((Sub1_PRD_DUE_DATE == null) ? (String)null : Sub1_PRD_DUE_DATE[0]) );
		struct.setList_Sub1_PRD_DUE_DATE(TypeConverter.convert(Sub1_PRD_DUE_DATE));
		struct.setSub1_PRD_START_DATE( ((Sub1_PRD_START_DATE == null) ? (String)null : Sub1_PRD_START_DATE[0]) );
		struct.setList_Sub1_PRD_START_DATE(TypeConverter.convert(Sub1_PRD_START_DATE));
		struct.setSub1_ODR_START_DATE( ((Sub1_ODR_START_DATE == null) ? (String)null : Sub1_ODR_START_DATE[0]) );
		struct.setList_Sub1_ODR_START_DATE(TypeConverter.convert(Sub1_ODR_START_DATE));
		struct.setSub1_OUTSIDE_TYP( ((Sub1_OUTSIDE_TYP == null) ? (String)null : Sub1_OUTSIDE_TYP[0]) );
		struct.setList_Sub1_OUTSIDE_TYP(TypeConverter.convert(Sub1_OUTSIDE_TYP));
		struct.setSub1_OUTSIDE_TYP_name( ((Sub1_OUTSIDE_TYP_name == null) ? (String)null : Sub1_OUTSIDE_TYP_name[0]) );
		struct.setList_Sub1_OUTSIDE_TYP_name(TypeConverter.convert(Sub1_OUTSIDE_TYP_name));
		struct.setSub1_OUTSIDE_TYP_val( ((Sub1_OUTSIDE_TYP_val == null) ? (String)null : Sub1_OUTSIDE_TYP_val[0]) );
		struct.setList_Sub1_OUTSIDE_TYP_val(TypeConverter.convert(Sub1_OUTSIDE_TYP_val));
		struct.setSub1_ITEM_SPOIL( ((Sub1_ITEM_SPOIL == null) ? (String)null : Sub1_ITEM_SPOIL[0]) );
		struct.setList_Sub1_ITEM_SPOIL(TypeConverter.convert(Sub1_ITEM_SPOIL));
		struct.setSub1_PS_SPOIL( ((Sub1_PS_SPOIL == null) ? (String)null : Sub1_PS_SPOIL[0]) );
		struct.setList_Sub1_PS_SPOIL(TypeConverter.convert(Sub1_PS_SPOIL));
		struct.seth_Sub1_PS_UNIT_QTY( ((h_Sub1_PS_UNIT_QTY == null) ? (String)null : h_Sub1_PS_UNIT_QTY[0]) );
		struct.setList_h_Sub1_PS_UNIT_QTY(TypeConverter.convert(h_Sub1_PS_UNIT_QTY));
		struct.setSub1_MRP_ODR_TYP_DN( ((Sub1_MRP_ODR_TYP_DN == null) ? (String)null : Sub1_MRP_ODR_TYP_DN[0]) );
		struct.setList_Sub1_MRP_ODR_TYP_DN(TypeConverter.convert(Sub1_MRP_ODR_TYP_DN));
		struct.setSub1_UNIT_QTY_TYP_DN( ((Sub1_UNIT_QTY_TYP_DN == null) ? (String)null : Sub1_UNIT_QTY_TYP_DN[0]) );
		struct.setList_Sub1_UNIT_QTY_TYP_DN(TypeConverter.convert(Sub1_UNIT_QTY_TYP_DN));
		struct.setSub1_STOCK_UNIT( ((Sub1_STOCK_UNIT == null) ? (String)null : Sub1_STOCK_UNIT[0]) );
		struct.setList_Sub1_STOCK_UNIT(TypeConverter.convert(Sub1_STOCK_UNIT));
		struct.seth_Sub1_Parent_ODR_QTY( ((h_Sub1_Parent_ODR_QTY == null) ? (String)null : h_Sub1_Parent_ODR_QTY[0]) );
		struct.setList_h_Sub1_Parent_ODR_QTY(TypeConverter.convert(h_Sub1_Parent_ODR_QTY));
		struct.seth_Sub1_MRP_ODR_TYP( ((h_Sub1_MRP_ODR_TYP == null) ? (String)null : h_Sub1_MRP_ODR_TYP[0]) );
		struct.setList_h_Sub1_MRP_ODR_TYP(TypeConverter.convert(h_Sub1_MRP_ODR_TYP));
		struct.seth_Sub1_UNIT_QTY_TYP( ((h_Sub1_UNIT_QTY_TYP == null) ? (String)null : h_Sub1_UNIT_QTY_TYP[0]) );
		struct.setList_h_Sub1_UNIT_QTY_TYP(TypeConverter.convert(h_Sub1_UNIT_QTY_TYP));
		struct.seth_Sub1_Parent_ODR_START_DATE( ((h_Sub1_Parent_ODR_START_DATE == null) ? (String)null : h_Sub1_Parent_ODR_START_DATE[0]) );
		struct.setList_h_Sub1_Parent_ODR_START_DATE(TypeConverter.convert(h_Sub1_Parent_ODR_START_DATE));
		struct.seth_Parent_OD_MODIFY_COUNT( ((h_Parent_OD_MODIFY_COUNT == null) ? (String)null : h_Parent_OD_MODIFY_COUNT[0]) );
		struct.setList_h_Parent_OD_MODIFY_COUNT(TypeConverter.convert(h_Parent_OD_MODIFY_COUNT));
		struct.seth_Comp_ITEM_MODIFY_COUNT( ((h_Comp_ITEM_MODIFY_COUNT == null) ? (String)null : h_Comp_ITEM_MODIFY_COUNT[0]) );
		struct.setList_h_Comp_ITEM_MODIFY_COUNT(TypeConverter.convert(h_Comp_ITEM_MODIFY_COUNT));
		struct.seth_Sub1_Parent_OD_LEVEL_NO( ((h_Sub1_Parent_OD_LEVEL_NO == null) ? (String)null : h_Sub1_Parent_OD_LEVEL_NO[0]) );
		struct.setList_h_Sub1_Parent_OD_LEVEL_NO(TypeConverter.convert(h_Sub1_Parent_OD_LEVEL_NO));
		struct.seth_Sub1_ISSUE_TYP( ((h_Sub1_ISSUE_TYP == null) ? (String)null : h_Sub1_ISSUE_TYP[0]) );
		struct.setList_h_Sub1_ISSUE_TYP(TypeConverter.convert(h_Sub1_ISSUE_TYP));
		struct.seth_Sub1_Parent_ALC_GRP_CD( ((h_Sub1_Parent_ALC_GRP_CD == null) ? (String)null : h_Sub1_Parent_ALC_GRP_CD[0]) );
		struct.setList_h_Sub1_Parent_ALC_GRP_CD(TypeConverter.convert(h_Sub1_Parent_ALC_GRP_CD));
		struct.setAC0120010tree1( ((AC0120010tree1 == null) ? (String)null : AC0120010tree1[0]) );
		struct.setList_AC0120010tree1(TypeConverter.convert(AC0120010tree1));
		struct.setc_JOB_ODR_DEL( ((c_JOB_ODR_DEL == null) ? (String)null : c_JOB_ODR_DEL[0]) );
		struct.setList_c_JOB_ODR_DEL(TypeConverter.convert(c_JOB_ODR_DEL));
		struct.seth_BUSINESS_OPR_DATE( ((h_BUSINESS_OPR_DATE == null) ? (String)null : h_BUSINESS_OPR_DATE[0]) );
		struct.setList_h_BUSINESS_OPR_DATE(TypeConverter.convert(h_BUSINESS_OPR_DATE));
		struct.seth_Sub1_OD_MODIFY_COUNT( ((h_Sub1_OD_MODIFY_COUNT == null) ? (String)null : h_Sub1_OD_MODIFY_COUNT[0]) );
		struct.setList_h_Sub1_OD_MODIFY_COUNT(TypeConverter.convert(h_Sub1_OD_MODIFY_COUNT));
		struct.setOD_GNR_TYP_DN( ((OD_GNR_TYP_DN == null) ? (String)null : OD_GNR_TYP_DN[0]) );
		struct.setList_OD_GNR_TYP_DN(TypeConverter.convert(OD_GNR_TYP_DN));
		struct.setDetail_ITEM_NAME( ((Detail_ITEM_NAME == null) ? (String)null : Detail_ITEM_NAME[0]) );
		struct.setList_Detail_ITEM_NAME(TypeConverter.convert(Detail_ITEM_NAME));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setSub1_DUE_TIME( ((Sub1_DUE_TIME == null) ? (String)null : Sub1_DUE_TIME[0]) );
		struct.setList_Sub1_DUE_TIME(TypeConverter.convert(Sub1_DUE_TIME));
		struct.setSub1_DUE_TIME2( ((Sub1_DUE_TIME2 == null) ? (String)null : Sub1_DUE_TIME2[0]) );
		struct.setList_Sub1_DUE_TIME2(TypeConverter.convert(Sub1_DUE_TIME2));
		struct.setSub1_DUE_TIME3( ((Sub1_DUE_TIME3 == null) ? (String)null : Sub1_DUE_TIME3[0]) );
		struct.setList_Sub1_DUE_TIME3(TypeConverter.convert(Sub1_DUE_TIME3));
		struct.setSub1_PRD_DUE_TIME( ((Sub1_PRD_DUE_TIME == null) ? (String)null : Sub1_PRD_DUE_TIME[0]) );
		struct.setList_Sub1_PRD_DUE_TIME(TypeConverter.convert(Sub1_PRD_DUE_TIME));
		struct.setSub1_PRD_START_TIME( ((Sub1_PRD_START_TIME == null) ? (String)null : Sub1_PRD_START_TIME[0]) );
		struct.setList_Sub1_PRD_START_TIME(TypeConverter.convert(Sub1_PRD_START_TIME));
		struct.setSub1_ODR_START_TIME( ((Sub1_ODR_START_TIME == null) ? (String)null : Sub1_ODR_START_TIME[0]) );
		struct.setList_Sub1_ODR_START_TIME(TypeConverter.convert(Sub1_ODR_START_TIME));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));
		struct.setMANHOUR_TYP( ((MANHOUR_TYP == null) ? (String)null : MANHOUR_TYP[0]) );
		struct.setList_MANHOUR_TYP(TypeConverter.convert(MANHOUR_TYP));
		struct.setMANHOUR_TYP_DN( ((MANHOUR_TYP_DN == null) ? (String)null : MANHOUR_TYP_DN[0]) );
		struct.setList_MANHOUR_TYP_DN(TypeConverter.convert(MANHOUR_TYP_DN));
		struct.seth_Sub1_MANHOUR_TYP( ((h_Sub1_MANHOUR_TYP == null) ? (String)null : h_Sub1_MANHOUR_TYP[0]) );
		struct.setList_h_Sub1_MANHOUR_TYP(TypeConverter.convert(h_Sub1_MANHOUR_TYP));
		struct.setOPR_RSLT_TYP_DN( ((OPR_RSLT_TYP_DN == null) ? (String)null : OPR_RSLT_TYP_DN[0]) );
		struct.setList_OPR_RSLT_TYP_DN(TypeConverter.convert(OPR_RSLT_TYP_DN));
		struct.setTOTAL_RCV_QTY( ((TOTAL_RCV_QTY == null) ? (String)null : TOTAL_RCV_QTY[0]) );
		struct.setList_TOTAL_RCV_QTY(TypeConverter.convert(TOTAL_RCV_QTY));
		struct.setTOTAL_ISSUE_QTY( ((TOTAL_ISSUE_QTY == null) ? (String)null : TOTAL_ISSUE_QTY[0]) );
		struct.setList_TOTAL_ISSUE_QTY(TypeConverter.convert(TOTAL_ISSUE_QTY));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setOPR_RSLT_TYP( ((OPR_RSLT_TYP == null) ? (String)null : OPR_RSLT_TYP[0]) );
		struct.setList_OPR_RSLT_TYP(TypeConverter.convert(OPR_RSLT_TYP));
		struct.setJOB_ODR_STS_TYP1( ((JOB_ODR_STS_TYP1 == null) ? (String)null : JOB_ODR_STS_TYP1[0]) );
		struct.setList_JOB_ODR_STS_TYP1(TypeConverter.convert(JOB_ODR_STS_TYP1));
		struct.setCHIID_OD_NO( ((CHIID_OD_NO == null) ? (String)null : CHIID_OD_NO[0]) );
		struct.setList_CHIID_OD_NO(TypeConverter.convert(CHIID_OD_NO));
		struct.seth_DM_STS_TYP( ((h_DM_STS_TYP == null) ? (String)null : h_DM_STS_TYP[0]) );
		struct.setList_h_DM_STS_TYP(TypeConverter.convert(h_DM_STS_TYP));
		struct.seth_ODR_STS_TYP( ((h_ODR_STS_TYP == null) ? (String)null : h_ODR_STS_TYP[0]) );
		struct.setList_h_ODR_STS_TYP(TypeConverter.convert(h_ODR_STS_TYP));
		struct.seth_size( ((h_size == null) ? (String)null : h_size[0]) );
		struct.setList_h_size(TypeConverter.convert(h_size));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AC0120010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAC0120010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAC0120010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AC0120010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0120010Entity entity = control.entity;
		AC0120010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AC0120010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AC0120010Control control;
		AC0120010Entity  entity = null;
		AC0120010Struct  struct = null;

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

			if( (control = (AC0120010Control)so.getAttribute("AC0120010Control_"+request.getSession(false).getId())) == null ) {
				control = new AC0120010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AC0120010Control();
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
				} else if( isClick(request, "FlashTree") ) {
					if ( !isCryptical(request, so, params, "FlashTree") ) return ERROR_TARGET;
					target = onClickFlashTree(request, response, so, params, control);
					control.setButton("FlashTree");
				} else if( isClick(request, "append") ) {
					if ( !isCryptical(request, so, params, "append") ) return ERROR_TARGET;
					target = onClickappend(request, response, so, params, control);
					control.setButton("append");
				} else if( isClick(request, "modify") ) {
					if ( !isCryptical(request, so, params, "modify") ) return ERROR_TARGET;
					target = onClickmodify(request, response, so, params, control);
					control.setButton("modify");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "PeekerItemCd") ) {
					if ( !isCryptical(request, so, params, "PeekerItemCd") ) return ERROR_TARGET;
					target = onClickPeekerItemCd(request, response, so, params, control);
					control.setButton("PeekerItemCd");
				} else if( isClick(request, "insert") ) {
					if ( !isCryptical(request, so, params, "insert") ) return ERROR_TARGET;
					target = onClickinsert(request, response, so, params, control);
					control.setButton("insert");
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "cancelSub1") ) {
					if ( !isCryptical(request, so, params, "cancelSub1") ) return ERROR_TARGET;
					target = onClickcancelSub1(request, response, so, params, control);
					control.setButton("cancelSub1");
				} else if( isClick(request, "ShowDetail") ) {
					if ( !isCryptical(request, so, params, "ShowDetail") ) return ERROR_TARGET;
					target = onClickShowDetail(request, response, so, params, control);
					control.setButton("ShowDetail");
				} else if( isClick(request, "AddTree") ) {
					if ( !isCryptical(request, so, params, "AddTree") ) return ERROR_TARGET;
					target = onClickAddTree(request, response, so, params, control);
					control.setButton("AddTree");
				} else if( isClick(request, "selectSub1") ) {
					if ( !isCryptical(request, so, params, "selectSub1") ) return ERROR_TARGET;
					target = onClickselectSub1(request, response, so, params, control);
					control.setButton("selectSub1");
				} else if( isClick(request, "CsvOut") ) {
					if ( !isCryptical(request, so, params, "CsvOut") ) return ERROR_TARGET;
					target = onClickCsvOut(request, response, so, params, control);
					control.setButton("CsvOut");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AC0120010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "FlashTree") && bFLG_DISCONNECT_FlashTree)
				|| (isClick(request, "append") && bFLG_DISCONNECT_append)
				|| (isClick(request, "modify") && bFLG_DISCONNECT_modify)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "PeekerItemCd") && bFLG_DISCONNECT_PeekerItemCd)
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "cancelSub1") && bFLG_DISCONNECT_cancelSub1)
				|| (isClick(request, "ShowDetail") && bFLG_DISCONNECT_ShowDetail)
				|| (isClick(request, "AddTree") && bFLG_DISCONNECT_AddTree)
				|| (isClick(request, "selectSub1") && bFLG_DISCONNECT_selectSub1)
				|| (isClick(request, "CsvOut") && bFLG_DISCONNECT_CsvOut)
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
	private  static boolean bFLG_DISCONNECT_FlashTree = true;
	private  static boolean bFLG_DISCONNECT_append = true;
	private  static boolean bFLG_DISCONNECT_modify = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_PeekerItemCd = true;
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_cancelSub1 = true;
	private  static boolean bFLG_DISCONNECT_ShowDetail = true;
	private  static boolean bFLG_DISCONNECT_AddTree = true;
	private  static boolean bFLG_DISCONNECT_selectSub1 = true;
	private  static boolean bFLG_DISCONNECT_CsvOut = true;

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
		return "com.nec.jp.orteus.metamorBase.AC0120.AC0120010Servlet";
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
	public AC0120010Servlet()
	{
		//{{user_implement_dev:<AC0120010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_FlashTree = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_ShowDetail = true;
		bFLG_DISCONNECT_AddTree = true;

                //}}user_implement_dev:<AC0120010_DisConnect_FLG>

		//{{user_implement_dev:<AC0120010Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AC0120010Servlet>
	}

	//////////////////////////////

}
