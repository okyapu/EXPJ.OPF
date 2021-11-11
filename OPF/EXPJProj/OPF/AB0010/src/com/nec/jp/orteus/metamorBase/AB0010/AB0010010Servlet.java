/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AB0010/src/com/nec/jp/orteus/metamorBase/AB0010/AB0010010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AB0010;

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
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
//}}user_implement_dev:import

//{{user_implement_dev:header
/**
 * CLASS     : AB0010010Servlet �N���X
 * HISTORY   : 2003/07/23 M.Isoda
            �V�K�쐬
             : 2003/08/05 M.Isoda
            ����
             : 2003/08/06 M.Isoda
               �N������initialEvent��2����s�����s����C��
                 ���ʂ�control.control_eventHandller("initial")�̋L�q���폜����
               System.out.printin()��SystemLog�N���X���g�p���ďo�͂�����@�֕ύX
             : 2003/08/08 M.Isoda
               MrpData,MrpManager�p�b�P�[�W���ɔ����Aimport��ǉ�
             : 2003/08/18 M.Isoda
               �V�X�e�����O�������G���[���̏������C��
                 �G���[�ɂȂ����V�X�e�����O�ϐ����g�p���Ă���֘A�������R�����g�Ƃ���
             : 2003/08/22 M.Isoda
               �s�v�R�����g�s�̍폜
             : 2003/09/05 M.Isoda
               �e�C�x���g�Ƀ��b�Z�[�W�N���A������ǉ��i���킹��control.java�̃��b�Z�[�W�N���A�������폜�j
               defaultEvent�փ��O�ݒ�o�͏�����ǉ�
               �X�V�����ŁA�����A���s�ɂ�����炸�Ǎ������������Ȃ���s����C��
               �\�[�X�R�[�h����
             : 2003/09/18 M.Isoda
               ���O�o�͋���
               ��O�������A"AlarmMessage.jsp"�ɑJ�ڂ���悤�C��
               �Ɩ����b�N�g�ݍ���
               �����������폜
               ��ʗ��p�����`�F�b�N�ǉ�
               import�ǉ�(BusinessLockAll,ScreenParam,ScreenPermission)
             : 2003/10/08 M.Isoda
               BusinessLockAll��p�~���A�ύX���ꂽBusinessLock�N���X���g�p����悤�ɕύX
             : 2003/10/09 M.Isoda
               �Ɩ����b�N�����ύX
               ���̃t�@�C���̃o�[�W�����p�~
             : 2003/11/21 M.Isoda
               ���p�Җ��Ǝ��H�ꖼ���擾����control�ɕێ����鏈����ǉ�
 */
//}}user_implement_dev:header

public class AB0010010Servlet extends HttpServlet
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
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AB0010010Control control)
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
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AB0010010Control control)
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
	 * @param control AB0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
			logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 objMessage.m_writer.write( Level.ALL, "AB0010010"+" $Revision: 1.30 $" );
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AB0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------------------
                try
                {
                 // ��ʑJ�ڃp�����[�^�̎擾
                 setScreenMoveParams(params, control);
                 control.control_eventHandller("reload");
              
                 if (control.isScreenMove()) {
                  getSessionParameters(so, params, struct);
                  control.control_eventHandller("select");
                 }
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage("ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------
                try
                {
                 // ���P�[���ݒ�
                 control.setLocale((String)so.getAttribute("LOCALE"));
              
                 // �Ǎ��������s
                 control.control_eventHandller("select");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage("ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
                //------------------------------------------------------------------
                try
                {
                 // �X�V�������s
                 control.control_eventHandller("update");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage("ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------
                try
                {
                 // �N���A�������s
                 control.control_eventHandller("clear");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage("ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * �����ʃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClicktime(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AB0010011.jsp";		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClicktime");
		//{{user_implement_dev:<onClicktime>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("time");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClicktime>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClicktime");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClickcancelSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelSub1");
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
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelSub1");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClicksubInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AB0010011.jsp";		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClicksubInsert");
		//{{user_implement_dev:<onClicksubInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("subInsert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClicksubInsert>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClicksubInsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClicksubUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AB0010011.jsp";		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClicksubUpdate");
		//{{user_implement_dev:<onClicksubUpdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("subUpdate");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClicksubUpdate>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClicksubUpdate");

		return nextUrl;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClicksubDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AB0010011.jsp";		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClicksubDelete");
		//{{user_implement_dev:<onClicksubDelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("subDelete");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClicksubDelete>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClicksubDelete");

		return nextUrl;
	}

	/**
	 * �ڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClickDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickDetail");
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
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickDetail");

		return nextUrl;
	}

	/**
	 * ���n����o�ɗ\��ꗗ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClickSrcmovToTimeInOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AG0050010.jsp";		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickSrcmovToTimeInOut");
		//{{user_implement_dev:<onClickSrcmovToTimeInOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("SrcmovToTimeInOut");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSrcmovToTimeInOut>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickSrcmovToTimeInOut");

		return nextUrl;
	}

	/**
	 * �I�[�_�ʐi���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AB0010010Control�N���X�C���X�^���X
	 */
	public String onClickOdrProgLst(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AB0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickOdrProgLst");
		//{{user_implement_dev:<onClickOdrProgLst>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("OdrProgLst");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickOdrProgLst>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"onClickOdrProgLst");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AB0010010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] ITEM_SPOIL = ((params.containsKey("ITEM_SPOIL")) ? (String[])params.get("ITEM_SPOIL") : (String[])null);
		String[] MAX_PERIOD = ((params.containsKey("MAX_PERIOD")) ? (String[])params.get("MAX_PERIOD") : (String[])null);
		String[] MUL_ODR_QTY = ((params.containsKey("MUL_ODR_QTY")) ? (String[])params.get("MUL_ODR_QTY") : (String[])null);
		String[] MAX_ODR_QTY = ((params.containsKey("MAX_ODR_QTY")) ? (String[])params.get("MAX_ODR_QTY") : (String[])null);
		String[] MIN_ODR_QTY = ((params.containsKey("MIN_ODR_QTY")) ? (String[])params.get("MIN_ODR_QTY") : (String[])null);
		String[] SAFETY_STOCK = ((params.containsKey("SAFETY_STOCK")) ? (String[])params.get("SAFETY_STOCK") : (String[])null);
		String[] w_date_from = ((params.containsKey("w_date_from")) ? (String[])params.get("w_date_from") : (String[])null);
		String[] w_date_to = ((params.containsKey("w_date_to")) ? (String[])params.get("w_date_to") : (String[])null);
		String[] STOCK_ON_HAND_QTY = ((params.containsKey("STOCK_ON_HAND_QTY")) ? (String[])params.get("STOCK_ON_HAND_QTY") : (String[])null);
		String[] w_PLANT_CD = ((params.containsKey("w_PLANT_CD")) ? (String[])params.get("w_PLANT_CD") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] MRP_ODR_NAME = ((params.containsKey("MRP_ODR_NAME")) ? (String[])params.get("MRP_ODR_NAME") : (String[])null);
		String[] OUTSIDE_NAME = ((params.containsKey("OUTSIDE_NAME")) ? (String[])params.get("OUTSIDE_NAME") : (String[])null);
		String[] UNIT_QTY_NAME = ((params.containsKey("UNIT_QTY_NAME")) ? (String[])params.get("UNIT_QTY_NAME") : (String[])null);
		String[] LOT_SIZING_NAME = ((params.containsKey("LOT_SIZING_NAME")) ? (String[])params.get("LOT_SIZING_NAME") : (String[])null);
		String[] PlanDate = ((params.containsKey("PlanDate")) ? (String[])params.get("PlanDate") : (String[])null);
		String[] FixDemand = ((params.containsKey("FixDemand")) ? (String[])params.get("FixDemand") : (String[])null);
		String[] PlanDemand = ((params.containsKey("PlanDemand")) ? (String[])params.get("PlanDemand") : (String[])null);
		String[] FixOrder = ((params.containsKey("FixOrder")) ? (String[])params.get("FixOrder") : (String[])null);
		String[] OldPlanOrder = ((params.containsKey("OldPlanOrder")) ? (String[])params.get("OldPlanOrder") : (String[])null);
		String[] h_saveNewPlanOrder = ((params.containsKey("h_saveNewPlanOrder")) ? (String[])params.get("h_saveNewPlanOrder") : (String[])null);
		String[] Difference = ((params.containsKey("Difference")) ? (String[])params.get("Difference") : (String[])null);
		String[] ValidStock = ((params.containsKey("ValidStock")) ? (String[])params.get("ValidStock") : (String[])null);
		String[] NewPlanOrder = ((params.containsKey("NewPlanOrder")) ? (String[])params.get("NewPlanOrder") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] UNIT_QTY_TYP = ((params.containsKey("UNIT_QTY_TYP")) ? (String[])params.get("UNIT_QTY_TYP") : (String[])null);
		String[] OUTSIDE_TYP = ((params.containsKey("OUTSIDE_TYP")) ? (String[])params.get("OUTSIDE_TYP") : (String[])null);
		String[] LOT_SIZING_TYP = ((params.containsKey("LOT_SIZING_TYP")) ? (String[])params.get("LOT_SIZING_TYP") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] sub_PlanDate = ((params.containsKey("sub_PlanDate")) ? (String[])params.get("sub_PlanDate") : (String[])null);
		String[] sub_PlanDate_TIME = ((params.containsKey("sub_PlanDate_TIME")) ? (String[])params.get("sub_PlanDate_TIME") : (String[])null);
		String[] sub_NEW_PLAN_ORDER = ((params.containsKey("sub_NEW_PLAN_ORDER")) ? (String[])params.get("sub_NEW_PLAN_ORDER") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);
		String[] PlanDate_nonCoron = ((params.containsKey("PlanDate_nonCoron")) ? (String[])params.get("PlanDate_nonCoron") : (String[])null);
		String[] sub_PlanDate_TIME_h = ((params.containsKey("sub_PlanDate_TIME_h")) ? (String[])params.get("sub_PlanDate_TIME_h") : (String[])null);
		String[] h_saveNewPlanOrder2 = ((params.containsKey("h_saveNewPlanOrder2")) ? (String[])params.get("h_saveNewPlanOrder2") : (String[])null);
		String[] h_saveMUL_ODR_QTY = ((params.containsKey("h_saveMUL_ODR_QTY")) ? (String[])params.get("h_saveMUL_ODR_QTY") : (String[])null);

		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setITEM_SPOIL( ((ITEM_SPOIL == null) ? (String)null : ITEM_SPOIL[0]) );
		struct.setList_ITEM_SPOIL(TypeConverter.convert(ITEM_SPOIL));
		struct.setMAX_PERIOD( ((MAX_PERIOD == null) ? (String)null : MAX_PERIOD[0]) );
		struct.setList_MAX_PERIOD(TypeConverter.convert(MAX_PERIOD));
		struct.setMUL_ODR_QTY( ((MUL_ODR_QTY == null) ? (String)null : MUL_ODR_QTY[0]) );
		struct.setList_MUL_ODR_QTY(TypeConverter.convert(MUL_ODR_QTY));
		struct.setMAX_ODR_QTY( ((MAX_ODR_QTY == null) ? (String)null : MAX_ODR_QTY[0]) );
		struct.setList_MAX_ODR_QTY(TypeConverter.convert(MAX_ODR_QTY));
		struct.setMIN_ODR_QTY( ((MIN_ODR_QTY == null) ? (String)null : MIN_ODR_QTY[0]) );
		struct.setList_MIN_ODR_QTY(TypeConverter.convert(MIN_ODR_QTY));
		struct.setSAFETY_STOCK( ((SAFETY_STOCK == null) ? (String)null : SAFETY_STOCK[0]) );
		struct.setList_SAFETY_STOCK(TypeConverter.convert(SAFETY_STOCK));
		struct.setw_date_from( ((w_date_from == null) ? (String)null : w_date_from[0]) );
		struct.setList_w_date_from(TypeConverter.convert(w_date_from));
		struct.setw_date_to( ((w_date_to == null) ? (String)null : w_date_to[0]) );
		struct.setList_w_date_to(TypeConverter.convert(w_date_to));
		struct.setSTOCK_ON_HAND_QTY( ((STOCK_ON_HAND_QTY == null) ? (String)null : STOCK_ON_HAND_QTY[0]) );
		struct.setList_STOCK_ON_HAND_QTY(TypeConverter.convert(STOCK_ON_HAND_QTY));
		struct.setw_PLANT_CD( ((w_PLANT_CD == null) ? (String)null : w_PLANT_CD[0]) );
		struct.setList_w_PLANT_CD(TypeConverter.convert(w_PLANT_CD));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setMRP_ODR_NAME( ((MRP_ODR_NAME == null) ? (String)null : MRP_ODR_NAME[0]) );
		struct.setList_MRP_ODR_NAME(TypeConverter.convert(MRP_ODR_NAME));
		struct.setOUTSIDE_NAME( ((OUTSIDE_NAME == null) ? (String)null : OUTSIDE_NAME[0]) );
		struct.setList_OUTSIDE_NAME(TypeConverter.convert(OUTSIDE_NAME));
		struct.setUNIT_QTY_NAME( ((UNIT_QTY_NAME == null) ? (String)null : UNIT_QTY_NAME[0]) );
		struct.setList_UNIT_QTY_NAME(TypeConverter.convert(UNIT_QTY_NAME));
		struct.setLOT_SIZING_NAME( ((LOT_SIZING_NAME == null) ? (String)null : LOT_SIZING_NAME[0]) );
		struct.setList_LOT_SIZING_NAME(TypeConverter.convert(LOT_SIZING_NAME));
		struct.setPlanDate( ((PlanDate == null) ? (String)null : PlanDate[0]) );
		struct.setList_PlanDate(TypeConverter.convert(PlanDate));
		struct.setFixDemand( ((FixDemand == null) ? (String)null : FixDemand[0]) );
		struct.setList_FixDemand(TypeConverter.convert(FixDemand));
		struct.setPlanDemand( ((PlanDemand == null) ? (String)null : PlanDemand[0]) );
		struct.setList_PlanDemand(TypeConverter.convert(PlanDemand));
		struct.setFixOrder( ((FixOrder == null) ? (String)null : FixOrder[0]) );
		struct.setList_FixOrder(TypeConverter.convert(FixOrder));
		struct.setOldPlanOrder( ((OldPlanOrder == null) ? (String)null : OldPlanOrder[0]) );
		struct.setList_OldPlanOrder(TypeConverter.convert(OldPlanOrder));
		struct.seth_saveNewPlanOrder( ((h_saveNewPlanOrder == null) ? (String)null : h_saveNewPlanOrder[0]) );
		struct.setList_h_saveNewPlanOrder(TypeConverter.convert(h_saveNewPlanOrder));
		struct.setDifference( ((Difference == null) ? (String)null : Difference[0]) );
		struct.setList_Difference(TypeConverter.convert(Difference));
		struct.setValidStock( ((ValidStock == null) ? (String)null : ValidStock[0]) );
		struct.setList_ValidStock(TypeConverter.convert(ValidStock));
		struct.setNewPlanOrder( ((NewPlanOrder == null) ? (String)null : NewPlanOrder[0]) );
		struct.setList_NewPlanOrder(TypeConverter.convert(NewPlanOrder));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.setUNIT_QTY_TYP( ((UNIT_QTY_TYP == null) ? (String)null : UNIT_QTY_TYP[0]) );
		struct.setList_UNIT_QTY_TYP(TypeConverter.convert(UNIT_QTY_TYP));
		struct.setOUTSIDE_TYP( ((OUTSIDE_TYP == null) ? (String)null : OUTSIDE_TYP[0]) );
		struct.setList_OUTSIDE_TYP(TypeConverter.convert(OUTSIDE_TYP));
		struct.setLOT_SIZING_TYP( ((LOT_SIZING_TYP == null) ? (String)null : LOT_SIZING_TYP[0]) );
		struct.setList_LOT_SIZING_TYP(TypeConverter.convert(LOT_SIZING_TYP));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setsub_PlanDate( ((sub_PlanDate == null) ? (String)null : sub_PlanDate[0]) );
		struct.setList_sub_PlanDate(TypeConverter.convert(sub_PlanDate));
		struct.setsub_PlanDate_TIME( ((sub_PlanDate_TIME == null) ? (String)null : sub_PlanDate_TIME[0]) );
		struct.setList_sub_PlanDate_TIME(TypeConverter.convert(sub_PlanDate_TIME));
		struct.setsub_NEW_PLAN_ORDER( ((sub_NEW_PLAN_ORDER == null) ? (String)null : sub_NEW_PLAN_ORDER[0]) );
		struct.setList_sub_NEW_PLAN_ORDER(TypeConverter.convert(sub_NEW_PLAN_ORDER));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));
		struct.setPlanDate_nonCoron( ((PlanDate_nonCoron == null) ? (String)null : PlanDate_nonCoron[0]) );
		struct.setList_PlanDate_nonCoron(TypeConverter.convert(PlanDate_nonCoron));
		struct.setsub_PlanDate_TIME_h( ((sub_PlanDate_TIME_h == null) ? (String)null : sub_PlanDate_TIME_h[0]) );
		struct.setList_sub_PlanDate_TIME_h(TypeConverter.convert(sub_PlanDate_TIME_h));
		struct.seth_saveNewPlanOrder2( ((h_saveNewPlanOrder2 == null) ? (String)null : h_saveNewPlanOrder2[0]) );
		struct.setList_h_saveNewPlanOrder2(TypeConverter.convert(h_saveNewPlanOrder2));
		struct.seth_saveMUL_ODR_QTY( ((h_saveMUL_ODR_QTY == null) ? (String)null : h_saveMUL_ODR_QTY[0]) );
		struct.setList_h_saveMUL_ODR_QTY(TypeConverter.convert(h_saveMUL_ODR_QTY));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AB0010010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAB0010010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAB0010010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AB0010010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AB0010010Entity entity = control.entity;
		AB0010010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //------------------------------------------------------------------
                //------------------------------------------------------------------
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AB0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AB0010010Control control;
		AB0010010Entity  entity = null;
		AB0010010Struct  struct = null;

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

			if( (control = (AB0010010Control)so.getAttribute("AB0010010Control_"+request.getSession(false).getId())) == null ) {
				control = new AB0010010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AB0010010Control();
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
				} else if( isClick(request, "time") ) {
					if ( !isCryptical(request, so, params, "time") ) return ERROR_TARGET;
					target = onClicktime(request, response, so, params, control);
					control.setButton("time");
				} else if( isClick(request, "cancelSub1") ) {
					if ( !isCryptical(request, so, params, "cancelSub1") ) return ERROR_TARGET;
					target = onClickcancelSub1(request, response, so, params, control);
					control.setButton("cancelSub1");
				} else if( isClick(request, "subInsert") ) {
					if ( !isCryptical(request, so, params, "subInsert") ) return ERROR_TARGET;
					target = onClicksubInsert(request, response, so, params, control);
					control.setButton("subInsert");
				} else if( isClick(request, "subUpdate") ) {
					if ( !isCryptical(request, so, params, "subUpdate") ) return ERROR_TARGET;
					target = onClicksubUpdate(request, response, so, params, control);
					control.setButton("subUpdate");
				} else if( isClick(request, "subDelete") ) {
					if ( !isCryptical(request, so, params, "subDelete") ) return ERROR_TARGET;
					target = onClicksubDelete(request, response, so, params, control);
					control.setButton("subDelete");
				} else if( isClick(request, "Detail") ) {
					if ( !isCryptical(request, so, params, "Detail") ) return ERROR_TARGET;
					target = onClickDetail(request, response, so, params, control);
					control.setButton("Detail");
				} else if( isClick(request, "SrcmovToTimeInOut") ) {
					if ( !isCryptical(request, so, params, "SrcmovToTimeInOut") ) return ERROR_TARGET;
					target = onClickSrcmovToTimeInOut(request, response, so, params, control);
					control.setButton("SrcmovToTimeInOut");
				} else if( isClick(request, "OdrProgLst") ) {
					if ( !isCryptical(request, so, params, "OdrProgLst") ) return ERROR_TARGET;
					target = onClickOdrProgLst(request, response, so, params, control);
					control.setButton("OdrProgLst");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AB0010010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "time") && bFLG_DISCONNECT_time)
				|| (isClick(request, "cancelSub1") && bFLG_DISCONNECT_cancelSub1)
				|| (isClick(request, "subInsert") && bFLG_DISCONNECT_subInsert)
				|| (isClick(request, "subUpdate") && bFLG_DISCONNECT_subUpdate)
				|| (isClick(request, "subDelete") && bFLG_DISCONNECT_subDelete)
				|| (isClick(request, "Detail") && bFLG_DISCONNECT_Detail)
				|| (isClick(request, "SrcmovToTimeInOut") && bFLG_DISCONNECT_SrcmovToTimeInOut)
				|| (isClick(request, "OdrProgLst") && bFLG_DISCONNECT_OdrProgLst)
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
	private  static boolean bFLG_DISCONNECT_time = true;
	private  static boolean bFLG_DISCONNECT_cancelSub1 = true;
	private  static boolean bFLG_DISCONNECT_subInsert = true;
	private  static boolean bFLG_DISCONNECT_subUpdate = true;
	private  static boolean bFLG_DISCONNECT_subDelete = true;
	private  static boolean bFLG_DISCONNECT_Detail = true;
	private  static boolean bFLG_DISCONNECT_SrcmovToTimeInOut = true;
	private  static boolean bFLG_DISCONNECT_OdrProgLst = true;

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
		return "com.nec.jp.orteus.metamorBase.AB0010.AB0010010Servlet";
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
	public AB0010010Servlet()
	{
		//{{user_implement_dev:<AB0010010_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = false;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_update = true;
                bFLG_DISCONNECT_clear = true;
              
                //}}user_implement_dev:<AB0010010_DisConnect_FLG>

		//{{user_implement_dev:<AB0010010Servlet>
                //}}user_implement_dev:<AB0010010Servlet>
	}

	//////////////////////////////

}
