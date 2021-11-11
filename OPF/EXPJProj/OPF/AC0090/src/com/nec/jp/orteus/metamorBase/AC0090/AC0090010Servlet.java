/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0090/src/com/nec/jp/orteus/metamorBase/AC0090/AC0090010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0090;

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

public class AC0090010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
        //------------------------------------------------------------------------------
       
        /** 
         * ��ʑI���f�[�^
         * @param req HttpServletRequest request
         * @param con AC0090010Control control
         */
        //20070514 takahashi��
		//private void setSelectRadioNo(AC0090010Control con, HttpServletRequest req)
        //{
        // con.setCheckNumber(new Integer(req.getParameter("r_Btn")));
        //}
        //20070514 takahashi��
		
        //------------------------------------------------------------------------------
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
	 * @param control AC0090010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AC0090010Control control)
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
	 * @param control AC0090010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AC0090010Control control)
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
	 * @param control AC0090010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
			logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 objMessage.m_writer.write( Level.ALL, "AC0090010"+" $Revision: 1.6 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AC0090010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------
              
                try {
              
                 setScreenMoveParams(params, control);
                 control.control_eventHandller("reload");
                 if(control.isScreenMove()) {
                  getSessionParameters(so, params, struct);
                  control.control_eventHandller("select");
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
              
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0090010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------
                 
                try {
                 // ���b�Z�[�W�N���A
                 control.getMessage().clearAll();
                 
                 // �Ǎ�����
                 control.control_eventHandller("select");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0090010Control�N���X�C���X�^���X
	 */
	public String onClickmodify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");
		//{{user_implement_dev:<onClickmodify>
                //------------------------------------------------------------------------------
              
                try {
              
                 // �O���f�}���h�R�t���T�u����
                 control.control_eventHandller("modify");
              
                 // �q��ʂɑJ��
                 nextUrl = "/AC0090011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //}}user_implement_dev:<onClickmodify>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");

		return nextUrl;
	}

	/**
	 * �R�t�������{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0090010Control�N���X�C���X�^���X
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
                //------------------------------------------------------------------------------
                 
                try {
                 
                 // �X�V����
                 control.control_eventHandller("update");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0090010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------
                try {
                 // ���b�Z�[�W�N���A
                 control.getMessage().clearAll();
                 
                 // �N���A����
                 control.control_eventHandller("clear");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0090010Control�N���X�C���X�^���X
	 */
	public String onClickselect_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub1");
		//{{user_implement_dev:<onClickselect_sub1>
                //------------------------------------------------------------------------------
              
                try {
              
                 // �Ǎ�����
                 control.control_eventHandller("select_sub1");
              
                 // �q��ʂɑJ��
                 nextUrl = "/AC0090011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //}}user_implement_dev:<onClickselect_sub1>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub1");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0090010Control�N���X�C���X�^���X
	 */
	public String onClickreturn_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");
		//{{user_implement_dev:<onClickreturn_sub1>
                //---------------------------------------------------------------------
                 
                try {
              
                 // �߂鏈��
                 control.control_eventHandller("return_sub1");
              
                 // �e��ʂɑJ��
                 nextUrl = "/AC0090010.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //}}user_implement_dev:<onClickreturn_sub1>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AC0090010Control�N���X�C���X�^���X
	 */
	public String onClickupdate_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AC0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub1");
		//{{user_implement_dev:<onClickupdate_sub1>
                //------------------------------------------------------------------------------
                 
                try {
              
                 // �X�V����
                 control.control_eventHandller("update_sub1");
                 
                 // �G���[�����̏ꍇ�A�q��ʂɑJ��
                 if(control.getMessage().sizeError() > 0) {
                  nextUrl = "/AC0090011.jsp";
                 } else {
                  // �e��ʂɑJ��
                  nextUrl = "/AC0090010.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate_sub1>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub1");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AC0090010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_PLANT_CD = ((params.containsKey("w_PLANT_CD")) ? (String[])params.get("w_PLANT_CD") : (String[])null);
		String[] w_PLANT_NAME = ((params.containsKey("w_PLANT_NAME")) ? (String[])params.get("w_PLANT_NAME") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] w_ITEM_NAME = ((params.containsKey("w_ITEM_NAME")) ? (String[])params.get("w_ITEM_NAME") : (String[])null);
		String[] w_DATE_FROM = ((params.containsKey("w_DATE_FROM")) ? (String[])params.get("w_DATE_FROM") : (String[])null);
		String[] w_DATE_TO = ((params.containsKey("w_DATE_TO")) ? (String[])params.get("w_DATE_TO") : (String[])null);
		String[] w_DRAW_CD = ((params.containsKey("w_DRAW_CD")) ? (String[])params.get("w_DRAW_CD") : (String[])null);
		String[] w_SPEC = ((params.containsKey("w_SPEC")) ? (String[])params.get("w_SPEC") : (String[])null);
		String[] w_MRP_ODR_TYP = ((params.containsKey("w_MRP_ODR_TYP")) ? (String[])params.get("w_MRP_ODR_TYP") : (String[])null);
		String[] w_OUTSIDE_TYP = ((params.containsKey("w_OUTSIDE_TYP")) ? (String[])params.get("w_OUTSIDE_TYP") : (String[])null);
		String[] w_ITEM_SPOIL = ((params.containsKey("w_ITEM_SPOIL")) ? (String[])params.get("w_ITEM_SPOIL") : (String[])null);
		String[] w_UNIT_QTY_TYP = ((params.containsKey("w_UNIT_QTY_TYP")) ? (String[])params.get("w_UNIT_QTY_TYP") : (String[])null);
		String[] w_LOT_SIZING_TYP = ((params.containsKey("w_LOT_SIZING_TYP")) ? (String[])params.get("w_LOT_SIZING_TYP") : (String[])null);
		String[] w_MAX_PERIOD = ((params.containsKey("w_MAX_PERIOD")) ? (String[])params.get("w_MAX_PERIOD") : (String[])null);
		String[] w_MUL_ODR_QTY = ((params.containsKey("w_MUL_ODR_QTY")) ? (String[])params.get("w_MUL_ODR_QTY") : (String[])null);
		String[] w_SAFETY_STOCK = ((params.containsKey("w_SAFETY_STOCK")) ? (String[])params.get("w_SAFETY_STOCK") : (String[])null);
		String[] w_MAX_ODR_QTY = ((params.containsKey("w_MAX_ODR_QTY")) ? (String[])params.get("w_MAX_ODR_QTY") : (String[])null);
		String[] w_MIN_ODR_QTY = ((params.containsKey("w_MIN_ODR_QTY")) ? (String[])params.get("w_MIN_ODR_QTY") : (String[])null);
		String[] EXTERNAL_PLAN_CD = ((params.containsKey("EXTERNAL_PLAN_CD")) ? (String[])params.get("EXTERNAL_PLAN_CD") : (String[])null);
		String[] DUE_DATE = ((params.containsKey("DUE_DATE")) ? (String[])params.get("DUE_DATE") : (String[])null);
		String[] DM_QTY = ((params.containsKey("DM_QTY")) ? (String[])params.get("DM_QTY") : (String[])null);
		String[] ODR_START_DATE = ((params.containsKey("ODR_START_DATE")) ? (String[])params.get("ODR_START_DATE") : (String[])null);
		String[] w_subDUE_DATE = ((params.containsKey("w_subDUE_DATE")) ? (String[])params.get("w_subDUE_DATE") : (String[])null);
		String[] w_subDM_QTY = ((params.containsKey("w_subDM_QTY")) ? (String[])params.get("w_subDM_QTY") : (String[])null);
		String[] w_subITEM_CD = ((params.containsKey("w_subITEM_CD")) ? (String[])params.get("w_subITEM_CD") : (String[])null);
		String[] w_subITEM_NAME = ((params.containsKey("w_subITEM_NAME")) ? (String[])params.get("w_subITEM_NAME") : (String[])null);
		String[] w_subEXTERNAL_PLAN_CD = ((params.containsKey("w_subEXTERNAL_PLAN_CD")) ? (String[])params.get("w_subEXTERNAL_PLAN_CD") : (String[])null);
		String[] w_subPLANT_CD = ((params.containsKey("w_subPLANT_CD")) ? (String[])params.get("w_subPLANT_CD") : (String[])null);
		String[] w_subPLANT_NAME = ((params.containsKey("w_subPLANT_NAME")) ? (String[])params.get("w_subPLANT_NAME") : (String[])null);
		String[] w_subDATE_FROM = ((params.containsKey("w_subDATE_FROM")) ? (String[])params.get("w_subDATE_FROM") : (String[])null);
		String[] w_subDATE_TO = ((params.containsKey("w_subDATE_TO")) ? (String[])params.get("w_subDATE_TO") : (String[])null);
		String[] subITEM_CD = ((params.containsKey("subITEM_CD")) ? (String[])params.get("subITEM_CD") : (String[])null);
		String[] subITEM_NAME = ((params.containsKey("subITEM_NAME")) ? (String[])params.get("subITEM_NAME") : (String[])null);
		String[] subODR_START_DATE = ((params.containsKey("subODR_START_DATE")) ? (String[])params.get("subODR_START_DATE") : (String[])null);
		String[] subPRD_START_DATE = ((params.containsKey("subPRD_START_DATE")) ? (String[])params.get("subPRD_START_DATE") : (String[])null);
		String[] subODR_QTY = ((params.containsKey("subODR_QTY")) ? (String[])params.get("subODR_QTY") : (String[])null);
		String[] subSU_DM_QTY = ((params.containsKey("subSU_DM_QTY")) ? (String[])params.get("subSU_DM_QTY") : (String[])null);
		String[] subRE_ODR_QTY = ((params.containsKey("subRE_ODR_QTY")) ? (String[])params.get("subRE_ODR_QTY") : (String[])null);
		String[] subPRD_DUE_DATE = ((params.containsKey("subPRD_DUE_DATE")) ? (String[])params.get("subPRD_DUE_DATE") : (String[])null);
		String[] subJOB_ODR_CD = ((params.containsKey("subJOB_ODR_CD")) ? (String[])params.get("subJOB_ODR_CD") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] subMODIFY_COUNT = ((params.containsKey("subMODIFY_COUNT")) ? (String[])params.get("subMODIFY_COUNT") : (String[])null);
		String[] OD_NO = ((params.containsKey("OD_NO")) ? (String[])params.get("OD_NO") : (String[])null);
		String[] CP_UNIT = ((params.containsKey("CP_UNIT")) ? (String[])params.get("CP_UNIT") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] subOD_NO = ((params.containsKey("subOD_NO")) ? (String[])params.get("subOD_NO") : (String[])null);
		String[] subPS_UNIT_NUMERATOR = ((params.containsKey("subPS_UNIT_NUMERATOR")) ? (String[])params.get("subPS_UNIT_NUMERATOR") : (String[])null);
		String[] subPS_UNIT_DENOMINATOR = ((params.containsKey("subPS_UNIT_DENOMINATOR")) ? (String[])params.get("subPS_UNIT_DENOMINATOR") : (String[])null);
		String[] w_TIME_FROM = ((params.containsKey("w_TIME_FROM")) ? (String[])params.get("w_TIME_FROM") : (String[])null);
		String[] w_TIME_TO = ((params.containsKey("w_TIME_TO")) ? (String[])params.get("w_TIME_TO") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);
		String[] w_subTIME_FROM = ((params.containsKey("w_subTIME_FROM")) ? (String[])params.get("w_subTIME_FROM") : (String[])null);
		String[] w_subTIME_TO = ((params.containsKey("w_subTIME_TO")) ? (String[])params.get("w_subTIME_TO") : (String[])null);
		String[] w_subDUE_TIME = ((params.containsKey("w_subDUE_TIME")) ? (String[])params.get("w_subDUE_TIME") : (String[])null);

		struct.setw_PLANT_CD( ((w_PLANT_CD == null) ? (String)null : w_PLANT_CD[0]) );
		struct.setList_w_PLANT_CD(TypeConverter.convert(w_PLANT_CD));
		struct.setw_PLANT_NAME( ((w_PLANT_NAME == null) ? (String)null : w_PLANT_NAME[0]) );
		struct.setList_w_PLANT_NAME(TypeConverter.convert(w_PLANT_NAME));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setw_ITEM_NAME( ((w_ITEM_NAME == null) ? (String)null : w_ITEM_NAME[0]) );
		struct.setList_w_ITEM_NAME(TypeConverter.convert(w_ITEM_NAME));
		struct.setw_DATE_FROM( ((w_DATE_FROM == null) ? (String)null : w_DATE_FROM[0]) );
		struct.setList_w_DATE_FROM(TypeConverter.convert(w_DATE_FROM));
		struct.setw_DATE_TO( ((w_DATE_TO == null) ? (String)null : w_DATE_TO[0]) );
		struct.setList_w_DATE_TO(TypeConverter.convert(w_DATE_TO));
		struct.setw_DRAW_CD( ((w_DRAW_CD == null) ? (String)null : w_DRAW_CD[0]) );
		struct.setList_w_DRAW_CD(TypeConverter.convert(w_DRAW_CD));
		struct.setw_SPEC( ((w_SPEC == null) ? (String)null : w_SPEC[0]) );
		struct.setList_w_SPEC(TypeConverter.convert(w_SPEC));
		struct.setw_MRP_ODR_TYP( ((w_MRP_ODR_TYP == null) ? (String)null : w_MRP_ODR_TYP[0]) );
		struct.setList_w_MRP_ODR_TYP(TypeConverter.convert(w_MRP_ODR_TYP));
		struct.setw_OUTSIDE_TYP( ((w_OUTSIDE_TYP == null) ? (String)null : w_OUTSIDE_TYP[0]) );
		struct.setList_w_OUTSIDE_TYP(TypeConverter.convert(w_OUTSIDE_TYP));
		struct.setw_ITEM_SPOIL( ((w_ITEM_SPOIL == null) ? (String)null : w_ITEM_SPOIL[0]) );
		struct.setList_w_ITEM_SPOIL(TypeConverter.convert(w_ITEM_SPOIL));
		struct.setw_UNIT_QTY_TYP( ((w_UNIT_QTY_TYP == null) ? (String)null : w_UNIT_QTY_TYP[0]) );
		struct.setList_w_UNIT_QTY_TYP(TypeConverter.convert(w_UNIT_QTY_TYP));
		struct.setw_LOT_SIZING_TYP( ((w_LOT_SIZING_TYP == null) ? (String)null : w_LOT_SIZING_TYP[0]) );
		struct.setList_w_LOT_SIZING_TYP(TypeConverter.convert(w_LOT_SIZING_TYP));
		struct.setw_MAX_PERIOD( ((w_MAX_PERIOD == null) ? (String)null : w_MAX_PERIOD[0]) );
		struct.setList_w_MAX_PERIOD(TypeConverter.convert(w_MAX_PERIOD));
		struct.setw_MUL_ODR_QTY( ((w_MUL_ODR_QTY == null) ? (String)null : w_MUL_ODR_QTY[0]) );
		struct.setList_w_MUL_ODR_QTY(TypeConverter.convert(w_MUL_ODR_QTY));
		struct.setw_SAFETY_STOCK( ((w_SAFETY_STOCK == null) ? (String)null : w_SAFETY_STOCK[0]) );
		struct.setList_w_SAFETY_STOCK(TypeConverter.convert(w_SAFETY_STOCK));
		struct.setw_MAX_ODR_QTY( ((w_MAX_ODR_QTY == null) ? (String)null : w_MAX_ODR_QTY[0]) );
		struct.setList_w_MAX_ODR_QTY(TypeConverter.convert(w_MAX_ODR_QTY));
		struct.setw_MIN_ODR_QTY( ((w_MIN_ODR_QTY == null) ? (String)null : w_MIN_ODR_QTY[0]) );
		struct.setList_w_MIN_ODR_QTY(TypeConverter.convert(w_MIN_ODR_QTY));
		struct.setEXTERNAL_PLAN_CD( ((EXTERNAL_PLAN_CD == null) ? (String)null : EXTERNAL_PLAN_CD[0]) );
		struct.setList_EXTERNAL_PLAN_CD(TypeConverter.convert(EXTERNAL_PLAN_CD));
		struct.setDUE_DATE( ((DUE_DATE == null) ? (String)null : DUE_DATE[0]) );
		struct.setList_DUE_DATE(TypeConverter.convert(DUE_DATE));
		struct.setDM_QTY( ((DM_QTY == null) ? (String)null : DM_QTY[0]) );
		struct.setList_DM_QTY(TypeConverter.convert(DM_QTY));
		struct.setODR_START_DATE( ((ODR_START_DATE == null) ? (String)null : ODR_START_DATE[0]) );
		struct.setList_ODR_START_DATE(TypeConverter.convert(ODR_START_DATE));
		struct.setw_subDUE_DATE( ((w_subDUE_DATE == null) ? (String)null : w_subDUE_DATE[0]) );
		struct.setList_w_subDUE_DATE(TypeConverter.convert(w_subDUE_DATE));
		struct.setw_subDM_QTY( ((w_subDM_QTY == null) ? (String)null : w_subDM_QTY[0]) );
		struct.setList_w_subDM_QTY(TypeConverter.convert(w_subDM_QTY));
		struct.setw_subITEM_CD( ((w_subITEM_CD == null) ? (String)null : w_subITEM_CD[0]) );
		struct.setList_w_subITEM_CD(TypeConverter.convert(w_subITEM_CD));
		struct.setw_subITEM_NAME( ((w_subITEM_NAME == null) ? (String)null : w_subITEM_NAME[0]) );
		struct.setList_w_subITEM_NAME(TypeConverter.convert(w_subITEM_NAME));
		struct.setw_subEXTERNAL_PLAN_CD( ((w_subEXTERNAL_PLAN_CD == null) ? (String)null : w_subEXTERNAL_PLAN_CD[0]) );
		struct.setList_w_subEXTERNAL_PLAN_CD(TypeConverter.convert(w_subEXTERNAL_PLAN_CD));
		struct.setw_subPLANT_CD( ((w_subPLANT_CD == null) ? (String)null : w_subPLANT_CD[0]) );
		struct.setList_w_subPLANT_CD(TypeConverter.convert(w_subPLANT_CD));
		struct.setw_subPLANT_NAME( ((w_subPLANT_NAME == null) ? (String)null : w_subPLANT_NAME[0]) );
		struct.setList_w_subPLANT_NAME(TypeConverter.convert(w_subPLANT_NAME));
		struct.setw_subDATE_FROM( ((w_subDATE_FROM == null) ? (String)null : w_subDATE_FROM[0]) );
		struct.setList_w_subDATE_FROM(TypeConverter.convert(w_subDATE_FROM));
		struct.setw_subDATE_TO( ((w_subDATE_TO == null) ? (String)null : w_subDATE_TO[0]) );
		struct.setList_w_subDATE_TO(TypeConverter.convert(w_subDATE_TO));
		struct.setsubITEM_CD( ((subITEM_CD == null) ? (String)null : subITEM_CD[0]) );
		struct.setList_subITEM_CD(TypeConverter.convert(subITEM_CD));
		struct.setsubITEM_NAME( ((subITEM_NAME == null) ? (String)null : subITEM_NAME[0]) );
		struct.setList_subITEM_NAME(TypeConverter.convert(subITEM_NAME));
		struct.setsubODR_START_DATE( ((subODR_START_DATE == null) ? (String)null : subODR_START_DATE[0]) );
		struct.setList_subODR_START_DATE(TypeConverter.convert(subODR_START_DATE));
		struct.setsubPRD_START_DATE( ((subPRD_START_DATE == null) ? (String)null : subPRD_START_DATE[0]) );
		struct.setList_subPRD_START_DATE(TypeConverter.convert(subPRD_START_DATE));
		struct.setsubODR_QTY( ((subODR_QTY == null) ? (String)null : subODR_QTY[0]) );
		struct.setList_subODR_QTY(TypeConverter.convert(subODR_QTY));
		struct.setsubSU_DM_QTY( ((subSU_DM_QTY == null) ? (String)null : subSU_DM_QTY[0]) );
		struct.setList_subSU_DM_QTY(TypeConverter.convert(subSU_DM_QTY));
		struct.setsubRE_ODR_QTY( ((subRE_ODR_QTY == null) ? (String)null : subRE_ODR_QTY[0]) );
		struct.setList_subRE_ODR_QTY(TypeConverter.convert(subRE_ODR_QTY));
		struct.setsubPRD_DUE_DATE( ((subPRD_DUE_DATE == null) ? (String)null : subPRD_DUE_DATE[0]) );
		struct.setList_subPRD_DUE_DATE(TypeConverter.convert(subPRD_DUE_DATE));
		struct.setsubJOB_ODR_CD( ((subJOB_ODR_CD == null) ? (String)null : subJOB_ODR_CD[0]) );
		struct.setList_subJOB_ODR_CD(TypeConverter.convert(subJOB_ODR_CD));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		struct.setsubMODIFY_COUNT( ((subMODIFY_COUNT == null) ? (String)null : subMODIFY_COUNT[0]) );
		struct.setList_subMODIFY_COUNT(TypeConverter.convert(subMODIFY_COUNT));
		struct.setOD_NO( ((OD_NO == null) ? (String)null : OD_NO[0]) );
		struct.setList_OD_NO(TypeConverter.convert(OD_NO));
		struct.setCP_UNIT( ((CP_UNIT == null) ? (String)null : CP_UNIT[0]) );
		struct.setList_CP_UNIT(TypeConverter.convert(CP_UNIT));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setsubOD_NO( ((subOD_NO == null) ? (String)null : subOD_NO[0]) );
		struct.setList_subOD_NO(TypeConverter.convert(subOD_NO));
		struct.setsubPS_UNIT_NUMERATOR( ((subPS_UNIT_NUMERATOR == null) ? (String)null : subPS_UNIT_NUMERATOR[0]) );
		struct.setList_subPS_UNIT_NUMERATOR(TypeConverter.convert(subPS_UNIT_NUMERATOR));
		struct.setsubPS_UNIT_DENOMINATOR( ((subPS_UNIT_DENOMINATOR == null) ? (String)null : subPS_UNIT_DENOMINATOR[0]) );
		struct.setList_subPS_UNIT_DENOMINATOR(TypeConverter.convert(subPS_UNIT_DENOMINATOR));
		struct.setw_TIME_FROM( ((w_TIME_FROM == null) ? (String)null : w_TIME_FROM[0]) );
		struct.setList_w_TIME_FROM(TypeConverter.convert(w_TIME_FROM));
		struct.setw_TIME_TO( ((w_TIME_TO == null) ? (String)null : w_TIME_TO[0]) );
		struct.setList_w_TIME_TO(TypeConverter.convert(w_TIME_TO));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));
		struct.setw_subTIME_FROM( ((w_subTIME_FROM == null) ? (String)null : w_subTIME_FROM[0]) );
		struct.setList_w_subTIME_FROM(TypeConverter.convert(w_subTIME_FROM));
		struct.setw_subTIME_TO( ((w_subTIME_TO == null) ? (String)null : w_subTIME_TO[0]) );
		struct.setList_w_subTIME_TO(TypeConverter.convert(w_subTIME_TO));
		struct.setw_subDUE_TIME( ((w_subDUE_TIME == null) ? (String)null : w_subDUE_TIME[0]) );
		struct.setList_w_subDUE_TIME(TypeConverter.convert(w_subDUE_TIME));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AC0090010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAC0090010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAC0090010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AC0090010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AC0090010Entity entity = control.entity;
		AC0090010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AC0090010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AC0090010Control control;
		AC0090010Entity  entity = null;
		AC0090010Struct  struct = null;

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

			if( (control = (AC0090010Control)so.getAttribute("AC0090010Control_"+request.getSession(false).getId())) == null ) {
				control = new AC0090010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AC0090010Control();
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
				} else if( isClick(request, "modify") ) {
					if ( !isCryptical(request, so, params, "modify") ) return ERROR_TARGET;
					target = onClickmodify(request, response, so, params, control);
					control.setButton("modify");
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "select_sub1") ) {
					if ( !isCryptical(request, so, params, "select_sub1") ) return ERROR_TARGET;
					target = onClickselect_sub1(request, response, so, params, control);
					control.setButton("select_sub1");
				} else if( isClick(request, "return_sub1") ) {
					if ( !isCryptical(request, so, params, "return_sub1") ) return ERROR_TARGET;
					target = onClickreturn_sub1(request, response, so, params, control);
					control.setButton("return_sub1");
				} else if( isClick(request, "update_sub1") ) {
					if ( !isCryptical(request, so, params, "update_sub1") ) return ERROR_TARGET;
					target = onClickupdate_sub1(request, response, so, params, control);
					control.setButton("update_sub1");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AC0090010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "modify") && bFLG_DISCONNECT_modify)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "select_sub1") && bFLG_DISCONNECT_select_sub1)
				|| (isClick(request, "return_sub1") && bFLG_DISCONNECT_return_sub1)
				|| (isClick(request, "update_sub1") && bFLG_DISCONNECT_update_sub1)
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
	private  static boolean bFLG_DISCONNECT_modify = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_select_sub1 = true;
	private  static boolean bFLG_DISCONNECT_return_sub1 = true;
	private  static boolean bFLG_DISCONNECT_update_sub1 = true;

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
		return "com.nec.jp.orteus.metamorBase.AC0090.AC0090010Servlet";
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
	public AC0090010Servlet()
	{
		//{{user_implement_dev:<AC0090010_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_modify = true;
                bFLG_DISCONNECT_update = true;
                bFLG_DISCONNECT_clear = true;
              
                //}}user_implement_dev:<AC0090010_DisConnect_FLG>

		//{{user_implement_dev:<AC0090010Servlet>
                 
                //}}user_implement_dev:<AC0090010Servlet>
	}

	//////////////////////////////

}
