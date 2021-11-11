/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0010/src/com/nec/jp/orteus/metamorBase/AH0010/AH0010020Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0010;

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
//}}user_implement_dev:import

//{{user_implement_dev:header
//}}user_implement_dev:header

public class AH0010020Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
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
	 * @param control AH0010020Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AH0010020Control control)
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
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AH0010020Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AH0010020Control control)
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
	 * @param control AH0010020Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
			logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
              //			objMessage.m_writer.write( Level.ALL, "AH0010020"+" $Revision: 1.3 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AH0010020Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------
                try {
                 control.control_eventHandller("reload");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0010020Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------
                try {
                 control.control_eventHandller("select");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0010020Control�N���X�C���X�^���X
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
                //------------------------------------------------------------------
                try {
                 control.control_eventHandller("update");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0010020Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------
                try {
                 control.control_eventHandller("clear");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0010020Control�N���X�C���X�^���X
	 */
	public String onClickCsvImport(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AH0010021.jsp";		// �ړ���t�q�k
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImport");
		//{{user_implement_dev:<onClickCsvImport>
                //------------------------------------------------------------------------------
                try {
                 control.control_eventHandller("CsvImport");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickCsvImport>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImport");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0010020Control�N���X�C���X�^���X
	 */
	public String onClickreturn_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");
		//{{user_implement_dev:<onClickreturn_sub1>
                //---------------------------------------------------------------------
                try {
                 control.control_eventHandller("return_sub1");
              
                 // �e��ʂɑJ��
                 nextUrl = "/AH0010020.jsp";
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickreturn_sub1>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");

		return nextUrl;
	}

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0010020Control�N���X�C���X�^���X
	 */
	public String onClickBrowse(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");
		//{{user_implement_dev:<onClickBrowse>
                //---------------------------------------------------------------------
                try {
                 control.control_eventHandller("Browse");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickBrowse>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");

		return nextUrl;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0010020Control�N���X�C���X�^���X
	 */
	public String onClickCsvIn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0010020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");
		//{{user_implement_dev:<onClickCsvIn>
                //------------------------------------------------------------------------------
                try {
                 control.setCsvReader(new CsvReader(request));
                 control.control_eventHandller("CsvIn");
                 control.setCsvReader(null);
              
                 if(control.getMessage().sizeError() > 0)
                 {
                  // �G���[������ꍇ�A�q��ʂ̂܂�
                  nextUrl = "/AH0010021.jsp";
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickCsvIn>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AH0010020Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_ITEM_NAME = ((params.containsKey("w_ITEM_NAME")) ? (String[])params.get("w_ITEM_NAME") : (String[])null);
		String[] w_DRAW_CD = ((params.containsKey("w_DRAW_CD")) ? (String[])params.get("w_DRAW_CD") : (String[])null);
		String[] w_SPEC = ((params.containsKey("w_SPEC")) ? (String[])params.get("w_SPEC") : (String[])null);
		String[] w_MRP_ODR_TYP = ((params.containsKey("w_MRP_ODR_TYP")) ? (String[])params.get("w_MRP_ODR_TYP") : (String[])null);
		String[] w_OUTSIDE_TYP = ((params.containsKey("w_OUTSIDE_TYP")) ? (String[])params.get("w_OUTSIDE_TYP") : (String[])null);
		String[] w_ABC_TYP = ((params.containsKey("w_ABC_TYP")) ? (String[])params.get("w_ABC_TYP") : (String[])null);
		String[] h_INV_FLG_JAN = ((params.containsKey("h_INV_FLG_JAN")) ? (String[])params.get("h_INV_FLG_JAN") : (String[])null);
		String[] h_INV_FLG_FEB = ((params.containsKey("h_INV_FLG_FEB")) ? (String[])params.get("h_INV_FLG_FEB") : (String[])null);
		String[] h_INV_FLG_MAR = ((params.containsKey("h_INV_FLG_MAR")) ? (String[])params.get("h_INV_FLG_MAR") : (String[])null);
		String[] h_INV_FLG_APR = ((params.containsKey("h_INV_FLG_APR")) ? (String[])params.get("h_INV_FLG_APR") : (String[])null);
		String[] h_INV_FLG_MAY = ((params.containsKey("h_INV_FLG_MAY")) ? (String[])params.get("h_INV_FLG_MAY") : (String[])null);
		String[] h_INV_FLG_JUN = ((params.containsKey("h_INV_FLG_JUN")) ? (String[])params.get("h_INV_FLG_JUN") : (String[])null);
		String[] h_INV_FLG_JUL = ((params.containsKey("h_INV_FLG_JUL")) ? (String[])params.get("h_INV_FLG_JUL") : (String[])null);
		String[] h_INV_FLG_AUG = ((params.containsKey("h_INV_FLG_AUG")) ? (String[])params.get("h_INV_FLG_AUG") : (String[])null);
		String[] h_INV_FLG_SEP = ((params.containsKey("h_INV_FLG_SEP")) ? (String[])params.get("h_INV_FLG_SEP") : (String[])null);
		String[] h_INV_FLG_OCT = ((params.containsKey("h_INV_FLG_OCT")) ? (String[])params.get("h_INV_FLG_OCT") : (String[])null);
		String[] h_INV_FLG_NOV = ((params.containsKey("h_INV_FLG_NOV")) ? (String[])params.get("h_INV_FLG_NOV") : (String[])null);
		String[] h_INV_FLG_DEC = ((params.containsKey("h_INV_FLG_DEC")) ? (String[])params.get("h_INV_FLG_DEC") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] ERR_ADR = ((params.containsKey("ERR_ADR")) ? (String[])params.get("ERR_ADR") : (String[])null);
		String[] ERR_MSG = ((params.containsKey("ERR_MSG")) ? (String[])params.get("ERR_MSG") : (String[])null);
		String[] c_INV_FLG_JAN = ((params.containsKey("c_INV_FLG_JAN")) ? (String[])params.get("c_INV_FLG_JAN") : (String[])null);
		String[] c_INV_FLG_FEB = ((params.containsKey("c_INV_FLG_FEB")) ? (String[])params.get("c_INV_FLG_FEB") : (String[])null);
		String[] c_INV_FLG_MAR = ((params.containsKey("c_INV_FLG_MAR")) ? (String[])params.get("c_INV_FLG_MAR") : (String[])null);
		String[] c_INV_FLG_APR = ((params.containsKey("c_INV_FLG_APR")) ? (String[])params.get("c_INV_FLG_APR") : (String[])null);
		String[] c_INV_FLG_MAY = ((params.containsKey("c_INV_FLG_MAY")) ? (String[])params.get("c_INV_FLG_MAY") : (String[])null);
		String[] c_INV_FLG_JUN = ((params.containsKey("c_INV_FLG_JUN")) ? (String[])params.get("c_INV_FLG_JUN") : (String[])null);
		String[] c_INV_FLG_JUL = ((params.containsKey("c_INV_FLG_JUL")) ? (String[])params.get("c_INV_FLG_JUL") : (String[])null);
		String[] c_INV_FLG_AUG = ((params.containsKey("c_INV_FLG_AUG")) ? (String[])params.get("c_INV_FLG_AUG") : (String[])null);
		String[] c_INV_FLG_SEP = ((params.containsKey("c_INV_FLG_SEP")) ? (String[])params.get("c_INV_FLG_SEP") : (String[])null);
		String[] c_INV_FLG_OCT = ((params.containsKey("c_INV_FLG_OCT")) ? (String[])params.get("c_INV_FLG_OCT") : (String[])null);
		String[] c_INV_FLG_NOV = ((params.containsKey("c_INV_FLG_NOV")) ? (String[])params.get("c_INV_FLG_NOV") : (String[])null);
		String[] c_INV_FLG_DEC = ((params.containsKey("c_INV_FLG_DEC")) ? (String[])params.get("c_INV_FLG_DEC") : (String[])null);
		String[] h_saveITEM_CD = ((params.containsKey("h_saveITEM_CD")) ? (String[])params.get("h_saveITEM_CD") : (String[])null);
		String[] FileName = ((params.containsKey("FileName")) ? (String[])params.get("FileName") : (String[])null);

		struct.setw_ITEM_NAME( ((w_ITEM_NAME == null) ? (String)null : w_ITEM_NAME[0]) );
		struct.setList_w_ITEM_NAME(TypeConverter.convert(w_ITEM_NAME));
		struct.setw_DRAW_CD( ((w_DRAW_CD == null) ? (String)null : w_DRAW_CD[0]) );
		struct.setList_w_DRAW_CD(TypeConverter.convert(w_DRAW_CD));
		struct.setw_SPEC( ((w_SPEC == null) ? (String)null : w_SPEC[0]) );
		struct.setList_w_SPEC(TypeConverter.convert(w_SPEC));
		struct.setw_MRP_ODR_TYP( ((w_MRP_ODR_TYP == null) ? (String)null : w_MRP_ODR_TYP[0]) );
		struct.setList_w_MRP_ODR_TYP(TypeConverter.convert(w_MRP_ODR_TYP));
		struct.setw_OUTSIDE_TYP( ((w_OUTSIDE_TYP == null) ? (String)null : w_OUTSIDE_TYP[0]) );
		struct.setList_w_OUTSIDE_TYP(TypeConverter.convert(w_OUTSIDE_TYP));
		struct.setw_ABC_TYP( ((w_ABC_TYP == null) ? (String)null : w_ABC_TYP[0]) );
		struct.setList_w_ABC_TYP(TypeConverter.convert(w_ABC_TYP));
		struct.seth_INV_FLG_JAN( ((h_INV_FLG_JAN == null) ? (String)null : h_INV_FLG_JAN[0]) );
		struct.setList_h_INV_FLG_JAN(TypeConverter.convert(h_INV_FLG_JAN));
		struct.seth_INV_FLG_FEB( ((h_INV_FLG_FEB == null) ? (String)null : h_INV_FLG_FEB[0]) );
		struct.setList_h_INV_FLG_FEB(TypeConverter.convert(h_INV_FLG_FEB));
		struct.seth_INV_FLG_MAR( ((h_INV_FLG_MAR == null) ? (String)null : h_INV_FLG_MAR[0]) );
		struct.setList_h_INV_FLG_MAR(TypeConverter.convert(h_INV_FLG_MAR));
		struct.seth_INV_FLG_APR( ((h_INV_FLG_APR == null) ? (String)null : h_INV_FLG_APR[0]) );
		struct.setList_h_INV_FLG_APR(TypeConverter.convert(h_INV_FLG_APR));
		struct.seth_INV_FLG_MAY( ((h_INV_FLG_MAY == null) ? (String)null : h_INV_FLG_MAY[0]) );
		struct.setList_h_INV_FLG_MAY(TypeConverter.convert(h_INV_FLG_MAY));
		struct.seth_INV_FLG_JUN( ((h_INV_FLG_JUN == null) ? (String)null : h_INV_FLG_JUN[0]) );
		struct.setList_h_INV_FLG_JUN(TypeConverter.convert(h_INV_FLG_JUN));
		struct.seth_INV_FLG_JUL( ((h_INV_FLG_JUL == null) ? (String)null : h_INV_FLG_JUL[0]) );
		struct.setList_h_INV_FLG_JUL(TypeConverter.convert(h_INV_FLG_JUL));
		struct.seth_INV_FLG_AUG( ((h_INV_FLG_AUG == null) ? (String)null : h_INV_FLG_AUG[0]) );
		struct.setList_h_INV_FLG_AUG(TypeConverter.convert(h_INV_FLG_AUG));
		struct.seth_INV_FLG_SEP( ((h_INV_FLG_SEP == null) ? (String)null : h_INV_FLG_SEP[0]) );
		struct.setList_h_INV_FLG_SEP(TypeConverter.convert(h_INV_FLG_SEP));
		struct.seth_INV_FLG_OCT( ((h_INV_FLG_OCT == null) ? (String)null : h_INV_FLG_OCT[0]) );
		struct.setList_h_INV_FLG_OCT(TypeConverter.convert(h_INV_FLG_OCT));
		struct.seth_INV_FLG_NOV( ((h_INV_FLG_NOV == null) ? (String)null : h_INV_FLG_NOV[0]) );
		struct.setList_h_INV_FLG_NOV(TypeConverter.convert(h_INV_FLG_NOV));
		struct.seth_INV_FLG_DEC( ((h_INV_FLG_DEC == null) ? (String)null : h_INV_FLG_DEC[0]) );
		struct.setList_h_INV_FLG_DEC(TypeConverter.convert(h_INV_FLG_DEC));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setERR_ADR( ((ERR_ADR == null) ? (String)null : ERR_ADR[0]) );
		struct.setList_ERR_ADR(TypeConverter.convert(ERR_ADR));
		struct.setERR_MSG( ((ERR_MSG == null) ? (String)null : ERR_MSG[0]) );
		struct.setList_ERR_MSG(TypeConverter.convert(ERR_MSG));
		struct.setc_INV_FLG_JAN( ((c_INV_FLG_JAN == null) ? (String)null : c_INV_FLG_JAN[0]) );
		struct.setList_c_INV_FLG_JAN(TypeConverter.convert(c_INV_FLG_JAN));
		struct.setc_INV_FLG_FEB( ((c_INV_FLG_FEB == null) ? (String)null : c_INV_FLG_FEB[0]) );
		struct.setList_c_INV_FLG_FEB(TypeConverter.convert(c_INV_FLG_FEB));
		struct.setc_INV_FLG_MAR( ((c_INV_FLG_MAR == null) ? (String)null : c_INV_FLG_MAR[0]) );
		struct.setList_c_INV_FLG_MAR(TypeConverter.convert(c_INV_FLG_MAR));
		struct.setc_INV_FLG_APR( ((c_INV_FLG_APR == null) ? (String)null : c_INV_FLG_APR[0]) );
		struct.setList_c_INV_FLG_APR(TypeConverter.convert(c_INV_FLG_APR));
		struct.setc_INV_FLG_MAY( ((c_INV_FLG_MAY == null) ? (String)null : c_INV_FLG_MAY[0]) );
		struct.setList_c_INV_FLG_MAY(TypeConverter.convert(c_INV_FLG_MAY));
		struct.setc_INV_FLG_JUN( ((c_INV_FLG_JUN == null) ? (String)null : c_INV_FLG_JUN[0]) );
		struct.setList_c_INV_FLG_JUN(TypeConverter.convert(c_INV_FLG_JUN));
		struct.setc_INV_FLG_JUL( ((c_INV_FLG_JUL == null) ? (String)null : c_INV_FLG_JUL[0]) );
		struct.setList_c_INV_FLG_JUL(TypeConverter.convert(c_INV_FLG_JUL));
		struct.setc_INV_FLG_AUG( ((c_INV_FLG_AUG == null) ? (String)null : c_INV_FLG_AUG[0]) );
		struct.setList_c_INV_FLG_AUG(TypeConverter.convert(c_INV_FLG_AUG));
		struct.setc_INV_FLG_SEP( ((c_INV_FLG_SEP == null) ? (String)null : c_INV_FLG_SEP[0]) );
		struct.setList_c_INV_FLG_SEP(TypeConverter.convert(c_INV_FLG_SEP));
		struct.setc_INV_FLG_OCT( ((c_INV_FLG_OCT == null) ? (String)null : c_INV_FLG_OCT[0]) );
		struct.setList_c_INV_FLG_OCT(TypeConverter.convert(c_INV_FLG_OCT));
		struct.setc_INV_FLG_NOV( ((c_INV_FLG_NOV == null) ? (String)null : c_INV_FLG_NOV[0]) );
		struct.setList_c_INV_FLG_NOV(TypeConverter.convert(c_INV_FLG_NOV));
		struct.setc_INV_FLG_DEC( ((c_INV_FLG_DEC == null) ? (String)null : c_INV_FLG_DEC[0]) );
		struct.setList_c_INV_FLG_DEC(TypeConverter.convert(c_INV_FLG_DEC));
		struct.seth_saveITEM_CD( ((h_saveITEM_CD == null) ? (String)null : h_saveITEM_CD[0]) );
		struct.setList_h_saveITEM_CD(TypeConverter.convert(h_saveITEM_CD));
		struct.setFileName( ((FileName == null) ? (String)null : FileName[0]) );
		struct.setList_FileName(TypeConverter.convert(FileName));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AH0010020.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAH0010020Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAH0010020Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AH0010020Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0010020Entity entity = control.entity;
		AH0010020Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0010");
		logger.entering("AH0010020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AH0010020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AH0010020Control control;
		AH0010020Entity  entity = null;
		AH0010020Struct  struct = null;

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

			if( (control = (AH0010020Control)so.getAttribute("AH0010020Control_"+request.getSession(false).getId())) == null ) {
				control = new AH0010020Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AH0010020Control();
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
				if( isClick(request, "select") ) {
					if ( !isCryptical(request, so, params, "select") ) return ERROR_TARGET;
					target = onClickselect(request, response, so, params, control);
					control.setButton("select");
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "CsvImport") ) {
					if ( !isCryptical(request, so, params, "CsvImport") ) return ERROR_TARGET;
					target = onClickCsvImport(request, response, so, params, control);
					control.setButton("CsvImport");
				} else if( isClick(request, "return_sub1") ) {
					if ( !isCryptical(request, so, params, "return_sub1") ) return ERROR_TARGET;
					target = onClickreturn_sub1(request, response, so, params, control);
					control.setButton("return_sub1");
				} else if( isClick(request, "Browse") ) {
					if ( !isCryptical(request, so, params, "Browse") ) return ERROR_TARGET;
					target = onClickBrowse(request, response, so, params, control);
					control.setButton("Browse");
				} else if( isClick(request, "CsvIn") ) {
					if ( !isCryptical(request, so, params, "CsvIn") ) return ERROR_TARGET;
					target = onClickCsvIn(request, response, so, params, control);
					control.setButton("CsvIn");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AH0010020Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
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
				if((isClick(request, "select") && bFLG_DISCONNECT_select)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "CsvImport") && bFLG_DISCONNECT_CsvImport)
				|| (isClick(request, "return_sub1") && bFLG_DISCONNECT_return_sub1)
				|| (isClick(request, "Browse") && bFLG_DISCONNECT_Browse)
				|| (isClick(request, "CsvIn") && bFLG_DISCONNECT_CsvIn)
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
	private  static boolean bFLG_DISCONNECT_select = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_CsvImport = true;
	private  static boolean bFLG_DISCONNECT_return_sub1 = true;
	private  static boolean bFLG_DISCONNECT_Browse = true;
	private  static boolean bFLG_DISCONNECT_CsvIn = true;

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
		return "com.nec.jp.orteus.metamorBase.AH0010.AH0010020Servlet";
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
	public AH0010020Servlet()
	{
		//{{user_implement_dev:<AH0010020_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_update = true;
                bFLG_DISCONNECT_clear = true;
                bFLG_DISCONNECT_CsvImport = true;
                bFLG_DISCONNECT_return_sub1 = true;
                bFLG_DISCONNECT_Browse = true;
                bFLG_DISCONNECT_CsvIn = true;
              
                //}}user_implement_dev:<AH0010020_DisConnect_FLG>

		//{{user_implement_dev:<AH0010020Servlet>
                //}}user_implement_dev:<AH0010020Servlet>
	}

	//////////////////////////////

}
