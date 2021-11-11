/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0030/src/com/nec/jp/orteus/metamorBase/KU0030/KU0030010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0030;

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

public class KU0030010Servlet extends HttpServlet
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
	 * @param control KU0030010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, KU0030010Control control)
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
	 * @param control KU0030010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, KU0030010Control control)
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
	 * @param control KU0030010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KU0030010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KU0030010Entity entity = control.entity;
		KU0030010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
			logger.entering("KU0030010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              //			objMessage.m_writer.write( Level.ALL, "KU0030010"+" $Revision: 1.25 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KU0030010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KU0030010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KU0030010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KU0030010Entity entity = control.entity;
		KU0030010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
              //			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0030010-E999","�����[�h����"));
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KU0030010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KU0030010Control�N���X�C���X�^���X
	 */
	public String onClicksearch(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KU0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KU0030010Entity entity = control.entity;
		KU0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClicksearch");
		//{{user_implement_dev:<onClicksearch>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                          // �������ʃt���O��NG�ɐݒ�
                 struct.seth_RESULT("NG");
                          struct.seth_SELECT_FG("NG");
                 control.control_eventHandller("search");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClicksearch>
		logger.exiting("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClicksearch");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KU0030010Control�N���X�C���X�^���X
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KU0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KU0030010Entity entity = control.entity;
		KU0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 // �}�X�^�Q��OK�̏ꍇ�́A�o�^�������s��
                 ///if(struct.geth_RESULT().equals("OK")){
                  // �������ʃt���O��NG�ɐݒ�
                  struct.seth_RESULT("NG");
                  control.control_eventHandller("insert");
                 ///}else{
                 ///	control.control_eventHandller("search");
                 ///}
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * �ԕi�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KU0030010Control�N���X�C���X�^���X
	 */
	public String onClickrecall(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KU0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KU0030010Entity entity = control.entity;
		KU0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClickrecall");
		//{{user_implement_dev:<onClickrecall>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 // �}�X�^�Q��OK�̏ꍇ�́A�o�^�������s��
                 ///if(struct.geth_RESULT().equals("OK")){
                  // �������ʃt���O��NG�ɐݒ�
                  struct.seth_RESULT("NG");
                  control.control_eventHandller("recall");
                 ///}else{
                 ///	control.control_eventHandller("search");
                 ///}
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickrecall>
		logger.exiting("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClickrecall");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KU0030010Control�N���X�C���X�^���X
	 */
	public String onClicktorikeshi(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KU0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KU0030010Entity entity = control.entity;
		KU0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClicktorikeshi");
		//{{user_implement_dev:<onClicktorikeshi>
                 // TODO: ���U��`�̃R�[�h���L�q���Ă�������
                try {
                 // �}�X�^�Q��OK�̏ꍇ�́A�o�^�������s��
                 ///if(struct.geth_RESULT().equals("OK")){
                  // �������ʃt���O��NG�ɐݒ�
                  struct.seth_RESULT("NG");
                  control.control_eventHandller("torikeshi");
                 ///}else{
                 ///	control.control_eventHandller("search");
                 ///}
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClicktorikeshi>
		logger.exiting("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClicktorikeshi");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KU0030010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KU0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KU0030010Entity entity = control.entity;
		KU0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("clear");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickclear>
		logger.exiting("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KU0030010Control�N���X�C���X�^���X
	 */
	public String onClickclose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KU0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KU0030010Entity entity = control.entity;
		KU0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");
		//{{user_implement_dev:<onClickclose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("close");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickclose>
		logger.exiting("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClickclose");

		return nextUrl;
	}

	/**
	 * �P���Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KU0030010Control�N���X�C���X�^���X
	 */
	public String onClickSelectUnitCost(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KU0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KU0030010Entity entity = control.entity;
		KU0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");
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
		logger.exiting("KU0030010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectUnitCost");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KU0030010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] k_MODE = ((params.containsKey("k_MODE")) ? (String[])params.get("k_MODE") : (String[])null);
		String[] h_RESULT = ((params.containsKey("h_RESULT")) ? (String[])params.get("h_RESULT") : (String[])null);
		String[] r_SEL_PTN = ((params.containsKey("r_SEL_PTN")) ? (String[])params.get("r_SEL_PTN") : (String[])null);
		String[] g_SLIP_CD = ((params.containsKey("g_SLIP_CD")) ? (String[])params.get("g_SLIP_CD") : (String[])null);
		String[] g_DESINATED_SHIP_DATE = ((params.containsKey("g_DESINATED_SHIP_DATE")) ? (String[])params.get("g_DESINATED_SHIP_DATE") : (String[])null);
		String[] g_SHIP_QTY = ((params.containsKey("g_SHIP_QTY")) ? (String[])params.get("g_SHIP_QTY") : (String[])null);
		String[] g_SHIP_QTY2 = ((params.containsKey("g_SHIP_QTY2")) ? (String[])params.get("g_SHIP_QTY2") : (String[])null);
		String[] g_UNIT_PRICE = ((params.containsKey("g_UNIT_PRICE")) ? (String[])params.get("g_UNIT_PRICE") : (String[])null);
		String[] g_CURRNCY = ((params.containsKey("g_CURRNCY")) ? (String[])params.get("g_CURRNCY") : (String[])null);
		String[] g_SHIP_ODR_AMOUNT = ((params.containsKey("g_SHIP_ODR_AMOUNT")) ? (String[])params.get("g_SHIP_ODR_AMOUNT") : (String[])null);
		String[] g_WH_CD = ((params.containsKey("g_WH_CD")) ? (String[])params.get("g_WH_CD") : (String[])null);
		String[] g_REMARKS = ((params.containsKey("g_REMARKS")) ? (String[])params.get("g_REMARKS") : (String[])null);
		String[] g_CUST_ANAME = ((params.containsKey("g_CUST_ANAME")) ? (String[])params.get("g_CUST_ANAME") : (String[])null);
		String[] g_CUST_ITEM_CD = ((params.containsKey("g_CUST_ITEM_CD")) ? (String[])params.get("g_CUST_ITEM_CD") : (String[])null);
		String[] g_ITEM_CD = ((params.containsKey("g_ITEM_CD")) ? (String[])params.get("g_ITEM_CD") : (String[])null);
		String[] h_AP_SECRTY_TYP = ((params.containsKey("h_AP_SECRTY_TYP")) ? (String[])params.get("h_AP_SECRTY_TYP") : (String[])null);
		String[] h_SHIP_QTY = ((params.containsKey("h_SHIP_QTY")) ? (String[])params.get("h_SHIP_QTY") : (String[])null);
		String[] h_ITEM_CD = ((params.containsKey("h_ITEM_CD")) ? (String[])params.get("h_ITEM_CD") : (String[])null);
		String[] h_GYOMU_DATE = ((params.containsKey("h_GYOMU_DATE")) ? (String[])params.get("h_GYOMU_DATE") : (String[])null);
		String[] h_EXCH_TYP = ((params.containsKey("h_EXCH_TYP")) ? (String[])params.get("h_EXCH_TYP") : (String[])null);
		String[] h_MODFIY_CNT = ((params.containsKey("h_MODFIY_CNT")) ? (String[])params.get("h_MODFIY_CNT") : (String[])null);
		String[] h_RETURN_QTY = ((params.containsKey("h_RETURN_QTY")) ? (String[])params.get("h_RETURN_QTY") : (String[])null);
		String[] h_TOTAL_SHIP_QTY = ((params.containsKey("h_TOTAL_SHIP_QTY")) ? (String[])params.get("h_TOTAL_SHIP_QTY") : (String[])null);
		String[] m_selRadio = ((params.containsKey("m_selRadio")) ? (String[])params.get("m_selRadio") : (String[])null);
		String[] r_SEL_PTN1 = ((params.containsKey("r_SEL_PTN1")) ? (String[])params.get("r_SEL_PTN1") : (String[])null);
		String[] r_SEL_PTN2 = ((params.containsKey("r_SEL_PTN2")) ? (String[])params.get("r_SEL_PTN2") : (String[])null);
		String[] r_SEL_PTN3 = ((params.containsKey("r_SEL_PTN3")) ? (String[])params.get("r_SEL_PTN3") : (String[])null);
		String[] g_DATE = ((params.containsKey("g_DATE")) ? (String[])params.get("g_DATE") : (String[])null);
		String[] h_SELECT_FG = ((params.containsKey("h_SELECT_FG")) ? (String[])params.get("h_SELECT_FG") : (String[])null);
		String[] g_CUR_UNIT = ((params.containsKey("g_CUR_UNIT")) ? (String[])params.get("g_CUR_UNIT") : (String[])null);
		String[] h_UNIT_PRICE = ((params.containsKey("h_UNIT_PRICE")) ? (String[])params.get("h_UNIT_PRICE") : (String[])null);
		String[] g_STOCK_UNIT = ((params.containsKey("g_STOCK_UNIT")) ? (String[])params.get("g_STOCK_UNIT") : (String[])null);
		String[] g_STOCK_UNIT2 = ((params.containsKey("g_STOCK_UNIT2")) ? (String[])params.get("g_STOCK_UNIT2") : (String[])null);
		String[] g_CUR_UNIT2 = ((params.containsKey("g_CUR_UNIT2")) ? (String[])params.get("g_CUR_UNIT2") : (String[])null);
		String[] g_WH_NAME = ((params.containsKey("g_WH_NAME")) ? (String[])params.get("g_WH_NAME") : (String[])null);
		String[] g_SALES_DEPT_CD = ((params.containsKey("g_SALES_DEPT_CD")) ? (String[])params.get("g_SALES_DEPT_CD") : (String[])null);
		String[] g_ORG_NAME = ((params.containsKey("g_ORG_NAME")) ? (String[])params.get("g_ORG_NAME") : (String[])null);
		String[] g_CUST_CD = ((params.containsKey("g_CUST_CD")) ? (String[])params.get("g_CUST_CD") : (String[])null);
		String[] g_CUST_ITEM_NAME = ((params.containsKey("g_CUST_ITEM_NAME")) ? (String[])params.get("g_CUST_ITEM_NAME") : (String[])null);
		String[] g_ITEM_NAME = ((params.containsKey("g_ITEM_NAME")) ? (String[])params.get("g_ITEM_NAME") : (String[])null);
		String[] g_CUST_ODR_NO = ((params.containsKey("g_CUST_ODR_NO")) ? (String[])params.get("g_CUST_ODR_NO") : (String[])null);
		String[] g_ODR_NO = ((params.containsKey("g_ODR_NO")) ? (String[])params.get("g_ODR_NO") : (String[])null);
		String[] g_PART_DLV_SEQ_NO = ((params.containsKey("g_PART_DLV_SEQ_NO")) ? (String[])params.get("g_PART_DLV_SEQ_NO") : (String[])null);
		String[] g_SHIP_ODR_NO = ((params.containsKey("g_SHIP_ODR_NO")) ? (String[])params.get("g_SHIP_ODR_NO") : (String[])null);
		String[] h_DATE = ((params.containsKey("h_DATE")) ? (String[])params.get("h_DATE") : (String[])null);
		String[] g_JOB_ODR_CD = ((params.containsKey("g_JOB_ODR_CD")) ? (String[])params.get("g_JOB_ODR_CD") : (String[])null);
		String[] c_JOB_ODR_CD = ((params.containsKey("c_JOB_ODR_CD")) ? (String[])params.get("c_JOB_ODR_CD") : (String[])null);
		String[] h_MRP_ODR_TYP = ((params.containsKey("h_MRP_ODR_TYP")) ? (String[])params.get("h_MRP_ODR_TYP") : (String[])null);
		String[] g_DIRECT_DLV_FLG = ((params.containsKey("g_DIRECT_DLV_FLG")) ? (String[])params.get("g_DIRECT_DLV_FLG") : (String[])null);
		String[] h_JOB_ODR_CD = ((params.containsKey("h_JOB_ODR_CD")) ? (String[])params.get("h_JOB_ODR_CD") : (String[])null);
		String[] g_STOCK_LOT_CD = ((params.containsKey("g_STOCK_LOT_CD")) ? (String[])params.get("g_STOCK_LOT_CD") : (String[])null);
		String[] h_STOCK_LOT_CD = ((params.containsKey("h_STOCK_LOT_CD")) ? (String[])params.get("h_STOCK_LOT_CD") : (String[])null);
		String[] h_LOT_CTRL_FLG = ((params.containsKey("h_LOT_CTRL_FLG")) ? (String[])params.get("h_LOT_CTRL_FLG") : (String[])null);
		String[] param1 = ((params.containsKey("param1")) ? (String[])params.get("param1") : (String[])null);
		String[] param2 = ((params.containsKey("param2")) ? (String[])params.get("param2") : (String[])null);
		String[] param3 = ((params.containsKey("param3")) ? (String[])params.get("param3") : (String[])null);

		struct.setk_MODE( ((k_MODE == null) ? (String)null : k_MODE[0]) );
		struct.setList_k_MODE(TypeConverter.convert(k_MODE));
		struct.seth_RESULT( ((h_RESULT == null) ? (String)null : h_RESULT[0]) );
		struct.setList_h_RESULT(TypeConverter.convert(h_RESULT));
		struct.setr_SEL_PTN( ((r_SEL_PTN == null) ? (String)null : r_SEL_PTN[0]) );
		struct.setList_r_SEL_PTN(TypeConverter.convert(r_SEL_PTN));
		struct.setg_SLIP_CD( ((g_SLIP_CD == null) ? (String)null : g_SLIP_CD[0]) );
		struct.setList_g_SLIP_CD(TypeConverter.convert(g_SLIP_CD));
		struct.setg_DESINATED_SHIP_DATE( ((g_DESINATED_SHIP_DATE == null) ? (String)null : g_DESINATED_SHIP_DATE[0]) );
		struct.setList_g_DESINATED_SHIP_DATE(TypeConverter.convert(g_DESINATED_SHIP_DATE));
		struct.setg_SHIP_QTY( ((g_SHIP_QTY == null) ? (String)null : g_SHIP_QTY[0]) );
		struct.setList_g_SHIP_QTY(TypeConverter.convert(g_SHIP_QTY));
		struct.setg_SHIP_QTY2( ((g_SHIP_QTY2 == null) ? (String)null : g_SHIP_QTY2[0]) );
		struct.setList_g_SHIP_QTY2(TypeConverter.convert(g_SHIP_QTY2));
		struct.setg_UNIT_PRICE( ((g_UNIT_PRICE == null) ? (String)null : g_UNIT_PRICE[0]) );
		struct.setList_g_UNIT_PRICE(TypeConverter.convert(g_UNIT_PRICE));
		struct.setg_CURRNCY( ((g_CURRNCY == null) ? (String)null : g_CURRNCY[0]) );
		struct.setList_g_CURRNCY(TypeConverter.convert(g_CURRNCY));
		struct.setg_SHIP_ODR_AMOUNT( ((g_SHIP_ODR_AMOUNT == null) ? (String)null : g_SHIP_ODR_AMOUNT[0]) );
		struct.setList_g_SHIP_ODR_AMOUNT(TypeConverter.convert(g_SHIP_ODR_AMOUNT));
		struct.setg_WH_CD( ((g_WH_CD == null) ? (String)null : g_WH_CD[0]) );
		struct.setList_g_WH_CD(TypeConverter.convert(g_WH_CD));
		struct.setg_REMARKS( ((g_REMARKS == null) ? (String)null : g_REMARKS[0]) );
		struct.setList_g_REMARKS(TypeConverter.convert(g_REMARKS));
		struct.setg_CUST_ANAME( ((g_CUST_ANAME == null) ? (String)null : g_CUST_ANAME[0]) );
		struct.setList_g_CUST_ANAME(TypeConverter.convert(g_CUST_ANAME));
		struct.setg_CUST_ITEM_CD( ((g_CUST_ITEM_CD == null) ? (String)null : g_CUST_ITEM_CD[0]) );
		struct.setList_g_CUST_ITEM_CD(TypeConverter.convert(g_CUST_ITEM_CD));
		struct.setg_ITEM_CD( ((g_ITEM_CD == null) ? (String)null : g_ITEM_CD[0]) );
		struct.setList_g_ITEM_CD(TypeConverter.convert(g_ITEM_CD));
		struct.seth_AP_SECRTY_TYP( ((h_AP_SECRTY_TYP == null) ? (String)null : h_AP_SECRTY_TYP[0]) );
		struct.setList_h_AP_SECRTY_TYP(TypeConverter.convert(h_AP_SECRTY_TYP));
		struct.seth_SHIP_QTY( ((h_SHIP_QTY == null) ? (String)null : h_SHIP_QTY[0]) );
		struct.setList_h_SHIP_QTY(TypeConverter.convert(h_SHIP_QTY));
		struct.seth_ITEM_CD( ((h_ITEM_CD == null) ? (String)null : h_ITEM_CD[0]) );
		struct.setList_h_ITEM_CD(TypeConverter.convert(h_ITEM_CD));
		struct.seth_GYOMU_DATE( ((h_GYOMU_DATE == null) ? (String)null : h_GYOMU_DATE[0]) );
		struct.setList_h_GYOMU_DATE(TypeConverter.convert(h_GYOMU_DATE));
		struct.seth_EXCH_TYP( ((h_EXCH_TYP == null) ? (String)null : h_EXCH_TYP[0]) );
		struct.setList_h_EXCH_TYP(TypeConverter.convert(h_EXCH_TYP));
		struct.seth_MODFIY_CNT( ((h_MODFIY_CNT == null) ? (String)null : h_MODFIY_CNT[0]) );
		struct.setList_h_MODFIY_CNT(TypeConverter.convert(h_MODFIY_CNT));
		struct.seth_RETURN_QTY( ((h_RETURN_QTY == null) ? (String)null : h_RETURN_QTY[0]) );
		struct.setList_h_RETURN_QTY(TypeConverter.convert(h_RETURN_QTY));
		struct.seth_TOTAL_SHIP_QTY( ((h_TOTAL_SHIP_QTY == null) ? (String)null : h_TOTAL_SHIP_QTY[0]) );
		struct.setList_h_TOTAL_SHIP_QTY(TypeConverter.convert(h_TOTAL_SHIP_QTY));
		struct.setm_selRadio( ((m_selRadio == null) ? (String)null : m_selRadio[0]) );
		struct.setList_m_selRadio(TypeConverter.convert(m_selRadio));
		struct.setr_SEL_PTN1( ((r_SEL_PTN1 == null) ? (String)null : r_SEL_PTN1[0]) );
		struct.setList_r_SEL_PTN1(TypeConverter.convert(r_SEL_PTN1));
		struct.setr_SEL_PTN2( ((r_SEL_PTN2 == null) ? (String)null : r_SEL_PTN2[0]) );
		struct.setList_r_SEL_PTN2(TypeConverter.convert(r_SEL_PTN2));
		struct.setr_SEL_PTN3( ((r_SEL_PTN3 == null) ? (String)null : r_SEL_PTN3[0]) );
		struct.setList_r_SEL_PTN3(TypeConverter.convert(r_SEL_PTN3));
		struct.setg_DATE( ((g_DATE == null) ? (String)null : g_DATE[0]) );
		struct.setList_g_DATE(TypeConverter.convert(g_DATE));
		struct.seth_SELECT_FG( ((h_SELECT_FG == null) ? (String)null : h_SELECT_FG[0]) );
		struct.setList_h_SELECT_FG(TypeConverter.convert(h_SELECT_FG));
		struct.setg_CUR_UNIT( ((g_CUR_UNIT == null) ? (String)null : g_CUR_UNIT[0]) );
		struct.setList_g_CUR_UNIT(TypeConverter.convert(g_CUR_UNIT));
		struct.seth_UNIT_PRICE( ((h_UNIT_PRICE == null) ? (String)null : h_UNIT_PRICE[0]) );
		struct.setList_h_UNIT_PRICE(TypeConverter.convert(h_UNIT_PRICE));
		struct.setg_STOCK_UNIT( ((g_STOCK_UNIT == null) ? (String)null : g_STOCK_UNIT[0]) );
		struct.setList_g_STOCK_UNIT(TypeConverter.convert(g_STOCK_UNIT));
		struct.setg_STOCK_UNIT2( ((g_STOCK_UNIT2 == null) ? (String)null : g_STOCK_UNIT2[0]) );
		struct.setList_g_STOCK_UNIT2(TypeConverter.convert(g_STOCK_UNIT2));
		struct.setg_CUR_UNIT2( ((g_CUR_UNIT2 == null) ? (String)null : g_CUR_UNIT2[0]) );
		struct.setList_g_CUR_UNIT2(TypeConverter.convert(g_CUR_UNIT2));
		struct.setg_WH_NAME( ((g_WH_NAME == null) ? (String)null : g_WH_NAME[0]) );
		struct.setList_g_WH_NAME(TypeConverter.convert(g_WH_NAME));
		struct.setg_SALES_DEPT_CD( ((g_SALES_DEPT_CD == null) ? (String)null : g_SALES_DEPT_CD[0]) );
		struct.setList_g_SALES_DEPT_CD(TypeConverter.convert(g_SALES_DEPT_CD));
		struct.setg_ORG_NAME( ((g_ORG_NAME == null) ? (String)null : g_ORG_NAME[0]) );
		struct.setList_g_ORG_NAME(TypeConverter.convert(g_ORG_NAME));
		struct.setg_CUST_CD( ((g_CUST_CD == null) ? (String)null : g_CUST_CD[0]) );
		struct.setList_g_CUST_CD(TypeConverter.convert(g_CUST_CD));
		struct.setg_CUST_ITEM_NAME( ((g_CUST_ITEM_NAME == null) ? (String)null : g_CUST_ITEM_NAME[0]) );
		struct.setList_g_CUST_ITEM_NAME(TypeConverter.convert(g_CUST_ITEM_NAME));
		struct.setg_ITEM_NAME( ((g_ITEM_NAME == null) ? (String)null : g_ITEM_NAME[0]) );
		struct.setList_g_ITEM_NAME(TypeConverter.convert(g_ITEM_NAME));
		struct.setg_CUST_ODR_NO( ((g_CUST_ODR_NO == null) ? (String)null : g_CUST_ODR_NO[0]) );
		struct.setList_g_CUST_ODR_NO(TypeConverter.convert(g_CUST_ODR_NO));
		struct.setg_ODR_NO( ((g_ODR_NO == null) ? (String)null : g_ODR_NO[0]) );
		struct.setList_g_ODR_NO(TypeConverter.convert(g_ODR_NO));
		struct.setg_PART_DLV_SEQ_NO( ((g_PART_DLV_SEQ_NO == null) ? (String)null : g_PART_DLV_SEQ_NO[0]) );
		struct.setList_g_PART_DLV_SEQ_NO(TypeConverter.convert(g_PART_DLV_SEQ_NO));
		struct.setg_SHIP_ODR_NO( ((g_SHIP_ODR_NO == null) ? (String)null : g_SHIP_ODR_NO[0]) );
		struct.setList_g_SHIP_ODR_NO(TypeConverter.convert(g_SHIP_ODR_NO));
		struct.seth_DATE( ((h_DATE == null) ? (String)null : h_DATE[0]) );
		struct.setList_h_DATE(TypeConverter.convert(h_DATE));
		struct.setg_JOB_ODR_CD( ((g_JOB_ODR_CD == null) ? (String)null : g_JOB_ODR_CD[0]) );
		struct.setList_g_JOB_ODR_CD(TypeConverter.convert(g_JOB_ODR_CD));
		struct.setc_JOB_ODR_CD( ((c_JOB_ODR_CD == null) ? (String)null : c_JOB_ODR_CD[0]) );
		struct.setList_c_JOB_ODR_CD(TypeConverter.convert(c_JOB_ODR_CD));
		struct.seth_MRP_ODR_TYP( ((h_MRP_ODR_TYP == null) ? (String)null : h_MRP_ODR_TYP[0]) );
		struct.setList_h_MRP_ODR_TYP(TypeConverter.convert(h_MRP_ODR_TYP));
		struct.setg_DIRECT_DLV_FLG( ((g_DIRECT_DLV_FLG == null) ? (String)null : g_DIRECT_DLV_FLG[0]) );
		struct.setList_g_DIRECT_DLV_FLG(TypeConverter.convert(g_DIRECT_DLV_FLG));
		struct.seth_JOB_ODR_CD( ((h_JOB_ODR_CD == null) ? (String)null : h_JOB_ODR_CD[0]) );
		struct.setList_h_JOB_ODR_CD(TypeConverter.convert(h_JOB_ODR_CD));
		struct.setg_STOCK_LOT_CD( ((g_STOCK_LOT_CD == null) ? (String)null : g_STOCK_LOT_CD[0]) );
		struct.setList_g_STOCK_LOT_CD(TypeConverter.convert(g_STOCK_LOT_CD));
		struct.seth_STOCK_LOT_CD( ((h_STOCK_LOT_CD == null) ? (String)null : h_STOCK_LOT_CD[0]) );
		struct.setList_h_STOCK_LOT_CD(TypeConverter.convert(h_STOCK_LOT_CD));
		struct.seth_LOT_CTRL_FLG( ((h_LOT_CTRL_FLG == null) ? (String)null : h_LOT_CTRL_FLG[0]) );
		struct.setList_h_LOT_CTRL_FLG(TypeConverter.convert(h_LOT_CTRL_FLG));
		struct.setparam1( ((param1 == null) ? (String)null : param1[0]) );
		struct.setList_param1(TypeConverter.convert(param1));
		struct.setparam2( ((param2 == null) ? (String)null : param2[0]) );
		struct.setList_param2(TypeConverter.convert(param2));
		struct.setparam3( ((param3 == null) ? (String)null : param3[0]) );
		struct.setList_param3(TypeConverter.convert(param3));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KU0030010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aKU0030010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aKU0030010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					KU0030010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KU0030010Entity entity = control.entity;
		KU0030010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0030");
		logger.entering("KU0030010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KU0030010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KU0030010Control control;
		KU0030010Entity  entity = null;
		KU0030010Struct  struct = null;

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

			if( (control = (KU0030010Control)so.getAttribute("KU0030010Control_"+request.getSession(false).getId())) == null ) {
				control = new KU0030010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KU0030010Control();
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
				if( isClick(request, "search") ) {
					if ( !isCryptical(request, so, params, "search") ) return ERROR_TARGET;
					target = onClicksearch(request, response, so, params, control);
					control.setButton("search");
				} else if( isClick(request, "insert") ) {
					if ( !isCryptical(request, so, params, "insert") ) return ERROR_TARGET;
					target = onClickinsert(request, response, so, params, control);
					control.setButton("insert");
				} else if( isClick(request, "recall") ) {
					if ( !isCryptical(request, so, params, "recall") ) return ERROR_TARGET;
					target = onClickrecall(request, response, so, params, control);
					control.setButton("recall");
				} else if( isClick(request, "torikeshi") ) {
					if ( !isCryptical(request, so, params, "torikeshi") ) return ERROR_TARGET;
					target = onClicktorikeshi(request, response, so, params, control);
					control.setButton("torikeshi");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "close") ) {
					if ( !isCryptical(request, so, params, "close") ) return ERROR_TARGET;
					target = onClickclose(request, response, so, params, control);
					control.setButton("close");
				} else if( isClick(request, "SelectUnitCost") ) {
					if ( !isCryptical(request, so, params, "SelectUnitCost") ) return ERROR_TARGET;
					target = onClickSelectUnitCost(request, response, so, params, control);
					control.setButton("SelectUnitCost");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KU0030010Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "search") && bFLG_DISCONNECT_search)
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "recall") && bFLG_DISCONNECT_recall)
				|| (isClick(request, "torikeshi") && bFLG_DISCONNECT_torikeshi)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "close") && bFLG_DISCONNECT_close)
				|| (isClick(request, "SelectUnitCost") && bFLG_DISCONNECT_SelectUnitCost)
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
	private  static boolean bFLG_DISCONNECT_search = true;
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_recall = true;
	private  static boolean bFLG_DISCONNECT_torikeshi = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_close = true;
	private  static boolean bFLG_DISCONNECT_SelectUnitCost = true;

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
		return "com.nec.jp.orteus.metamorBase.KU0030.KU0030010Servlet";
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
	public KU0030010Servlet()
	{
		//{{user_implement_dev:<KU0030010_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_search = true;
                bFLG_DISCONNECT_insert = true;
                bFLG_DISCONNECT_recall = true;
                bFLG_DISCONNECT_torikeshi = true;
                bFLG_DISCONNECT_clear = true;
                bFLG_DISCONNECT_close = true;
              
                //}}user_implement_dev:<KU0030010_DisConnect_FLG>

		//{{user_implement_dev:<KU0030010Servlet>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<KU0030010Servlet>
	}

	//////////////////////////////

}