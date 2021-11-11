/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0150/src/com/nec/jp/orteus/metamorBase/AA0150/AA0150010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0150;

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

public class AA0150010Servlet extends HttpServlet
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
	 * @param control AA0150010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AA0150010Control control)
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
	 * @param control AA0150010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AA0150010Control control)
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
	 * @param control AA0150010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0150010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0150010Entity entity = control.entity;
		AA0150010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
			logger.entering("AA0150010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			objMessage.m_writer.write( Level.ALL, "AA0150010"+" $Revision: 1.12 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0150010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0150010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0150010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0150010Entity entity = control.entity;
		AA0150010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0150010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0150010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0150010Control�N���X�C���X�^���X
	 */
	public String onClickCsvImport(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0150011.jsp";		// �ړ���t�q�k
		AA0150010Entity entity = control.entity;
		AA0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImport");
		//{{user_implement_dev:<onClickCsvImport>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CsvImport");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCsvImport>
		logger.exiting("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImport");

		return nextUrl;
	}

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0150010Control�N���X�C���X�^���X
	 */
	public String onClickBrowse(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0150010Entity entity = control.entity;
		AA0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");
		//{{user_implement_dev:<onClickBrowse>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Browse");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickBrowse>
		logger.exiting("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");

		return nextUrl;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0150010Control�N���X�C���X�^���X
	 */
	public String onClickCsvIn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0150011.jsp";		// �ړ���t�q�k
		AA0150010Entity entity = control.entity;
		AA0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");
		//{{user_implement_dev:<onClickCsvIn>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.setCsvReader(new CsvReader(request));
			control.control_eventHandller("CsvIn");
			control.setCsvReader(null);
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCsvIn>
		logger.exiting("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0150010Control�N���X�C���X�^���X
	 */
	public String onClickreturn_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0150010Entity entity = control.entity;
		AA0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");
		//{{user_implement_dev:<onClickreturn_sub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("return_sub1");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickreturn_sub1>
		logger.exiting("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0150010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0150010Entity entity = control.entity;
		AA0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
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
		logger.exiting("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0150010Control�N���X�C���X�^���X
	 */
	public String onClickCsvOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AA0150011.jsp";		// �ړ���t�q�k
		AA0150010Entity entity = control.entity;
		AA0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");
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
		logger.exiting("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0150010Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0150010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0150010Entity entity = control.entity;
		AA0150010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
		//{{user_implement_dev:<onClickClose>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Close");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClose>
		logger.exiting("AA0150010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0150010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] rdoInsert = ((params.containsKey("rdoInsert")) ? (String[])params.get("rdoInsert") : (String[])null);
		String[] rdoUpdate = ((params.containsKey("rdoUpdate")) ? (String[])params.get("rdoUpdate") : (String[])null);
		String[] rdoDelete = ((params.containsKey("rdoDelete")) ? (String[])params.get("rdoDelete") : (String[])null);
		String[] FileName = ((params.containsKey("FileName")) ? (String[])params.get("FileName") : (String[])null);
		String[] DO_CHK = ((params.containsKey("DO_CHK")) ? (String[])params.get("DO_CHK") : (String[])null);
		String[] ERROR_IN = ((params.containsKey("ERROR_IN")) ? (String[])params.get("ERROR_IN") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ERR_CTR_NM = ((params.containsKey("ERR_CTR_NM")) ? (String[])params.get("ERR_CTR_NM") : (String[])null);
		String[] ERR_INFO = ((params.containsKey("ERR_INFO")) ? (String[])params.get("ERR_INFO") : (String[])null);
		String[] h_SYORI_KUBUN = ((params.containsKey("h_SYORI_KUBUN")) ? (String[])params.get("h_SYORI_KUBUN") : (String[])null);
		String[] h_ITEM_CD = ((params.containsKey("h_ITEM_CD")) ? (String[])params.get("h_ITEM_CD") : (String[])null);
		String[] h_ITEM_NAME = ((params.containsKey("h_ITEM_NAME")) ? (String[])params.get("h_ITEM_NAME") : (String[])null);
		String[] h_DRAW_CD = ((params.containsKey("h_DRAW_CD")) ? (String[])params.get("h_DRAW_CD") : (String[])null);
		String[] h_SPEC = ((params.containsKey("h_SPEC")) ? (String[])params.get("h_SPEC") : (String[])null);
		String[] h_HIGH_LEVEL_NO = ((params.containsKey("h_HIGH_LEVEL_NO")) ? (String[])params.get("h_HIGH_LEVEL_NO") : (String[])null);
		String[] h_MRP_ODR_TYP = ((params.containsKey("h_MRP_ODR_TYP")) ? (String[])params.get("h_MRP_ODR_TYP") : (String[])null);
		String[] h_OUTSIDE_TYP = ((params.containsKey("h_OUTSIDE_TYP")) ? (String[])params.get("h_OUTSIDE_TYP") : (String[])null);
		String[] h_STOCK_UNIT_FLG = ((params.containsKey("h_STOCK_UNIT_FLG")) ? (String[])params.get("h_STOCK_UNIT_FLG") : (String[])null);
		String[] h_STOCK_UNIT = ((params.containsKey("h_STOCK_UNIT")) ? (String[])params.get("h_STOCK_UNIT") : (String[])null);
		String[] h_PKG_UNIT = ((params.containsKey("h_PKG_UNIT")) ? (String[])params.get("h_PKG_UNIT") : (String[])null);
		String[] h_PKG_UNIT_QTY = ((params.containsKey("h_PKG_UNIT_QTY")) ? (String[])params.get("h_PKG_UNIT_QTY") : (String[])null);
		String[] h_UNIT_QTY_TYP = ((params.containsKey("h_UNIT_QTY_TYP")) ? (String[])params.get("h_UNIT_QTY_TYP") : (String[])null);
		String[] h_ODR_LT = ((params.containsKey("h_ODR_LT")) ? (String[])params.get("h_ODR_LT") : (String[])null);
		String[] h_FIXED_LT = ((params.containsKey("h_FIXED_LT")) ? (String[])params.get("h_FIXED_LT") : (String[])null);
		String[] h_PROP_LT = ((params.containsKey("h_PROP_LT")) ? (String[])params.get("h_PROP_LT") : (String[])null);
		String[] h_SAFETY_LT = ((params.containsKey("h_SAFETY_LT")) ? (String[])params.get("h_SAFETY_LT") : (String[])null);
		String[] h_ISSUE_LT = ((params.containsKey("h_ISSUE_LT")) ? (String[])params.get("h_ISSUE_LT") : (String[])null);
		String[] h_PROP_LOT_SIZE = ((params.containsKey("h_PROP_LOT_SIZE")) ? (String[])params.get("h_PROP_LOT_SIZE") : (String[])null);
		String[] h_ITEM_SPOIL = ((params.containsKey("h_ITEM_SPOIL")) ? (String[])params.get("h_ITEM_SPOIL") : (String[])null);
		String[] h_SAFETY_STOCK = ((params.containsKey("h_SAFETY_STOCK")) ? (String[])params.get("h_SAFETY_STOCK") : (String[])null);
		String[] h_LOT_SIZING_TYP = ((params.containsKey("h_LOT_SIZING_TYP")) ? (String[])params.get("h_LOT_SIZING_TYP") : (String[])null);
		String[] h_MAX_PERIOD = ((params.containsKey("h_MAX_PERIOD")) ? (String[])params.get("h_MAX_PERIOD") : (String[])null);
		String[] h_MAX_ODR_QTY = ((params.containsKey("h_MAX_ODR_QTY")) ? (String[])params.get("h_MAX_ODR_QTY") : (String[])null);
		String[] h_ODR_POINT = ((params.containsKey("h_ODR_POINT")) ? (String[])params.get("h_ODR_POINT") : (String[])null);
		String[] h_FIXED_ODR_QTY = ((params.containsKey("h_FIXED_ODR_QTY")) ? (String[])params.get("h_FIXED_ODR_QTY") : (String[])null);
		String[] h_MIN_ODR_QTY = ((params.containsKey("h_MIN_ODR_QTY")) ? (String[])params.get("h_MIN_ODR_QTY") : (String[])null);
		String[] h_MUL_ODR_QTY = ((params.containsKey("h_MUL_ODR_QTY")) ? (String[])params.get("h_MUL_ODR_QTY") : (String[])null);
		String[] h_ISSUE_TYP = ((params.containsKey("h_ISSUE_TYP")) ? (String[])params.get("h_ISSUE_TYP") : (String[])null);
		String[] h_MPS_FLG = ((params.containsKey("h_MPS_FLG")) ? (String[])params.get("h_MPS_FLG") : (String[])null);
		String[] h_ACPT_INSPC_TYP = ((params.containsKey("h_ACPT_INSPC_TYP")) ? (String[])params.get("h_ACPT_INSPC_TYP") : (String[])null);
		String[] h_PRODUCT_TYP = ((params.containsKey("h_PRODUCT_TYP")) ? (String[])params.get("h_PRODUCT_TYP") : (String[])null);
		String[] h_CLASIFICATION_CD = ((params.containsKey("h_CLASIFICATION_CD")) ? (String[])params.get("h_CLASIFICATION_CD") : (String[])null);
		String[] h_UNIT_WEIGHT = ((params.containsKey("h_UNIT_WEIGHT")) ? (String[])params.get("h_UNIT_WEIGHT") : (String[])null);
		String[] h_ABC_TYP = ((params.containsKey("h_ABC_TYP")) ? (String[])params.get("h_ABC_TYP") : (String[])null);
		String[] h_OPR_RSLT_TYP = ((params.containsKey("h_OPR_RSLT_TYP")) ? (String[])params.get("h_OPR_RSLT_TYP") : (String[])null);
		String[] h_SPL_ITEM_TYP = ((params.containsKey("h_SPL_ITEM_TYP")) ? (String[])params.get("h_SPL_ITEM_TYP") : (String[])null);
		String[] h_TAX_CD = ((params.containsKey("h_TAX_CD")) ? (String[])params.get("h_TAX_CD") : (String[])null);
		String[] h_WH_CD = ((params.containsKey("h_WH_CD")) ? (String[])params.get("h_WH_CD") : (String[])null);
		String[] CANCEL_FILE = ((params.containsKey("CANCEL_FILE")) ? (String[])params.get("CANCEL_FILE") : (String[])null);
		String[] JUDGMENT_TXT = ((params.containsKey("JUDGMENT_TXT")) ? (String[])params.get("JUDGMENT_TXT") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] h_CAL_NO = ((params.containsKey("h_CAL_NO")) ? (String[])params.get("h_CAL_NO") : (String[])null);
		String[] ERR_TYP = ((params.containsKey("ERR_TYP")) ? (String[])params.get("ERR_TYP") : (String[])null);
		String[] h_DEPT_CD = ((params.containsKey("h_DEPT_CD")) ? (String[])params.get("h_DEPT_CD") : (String[])null);
		String[] h_PJ_CD = ((params.containsKey("h_PJ_CD")) ? (String[])params.get("h_PJ_CD") : (String[])null);
		String[] h_SEG_CONTENTS_1 = ((params.containsKey("h_SEG_CONTENTS_1")) ? (String[])params.get("h_SEG_CONTENTS_1") : (String[])null);
		String[] h_SEG_CONTENTS_2 = ((params.containsKey("h_SEG_CONTENTS_2")) ? (String[])params.get("h_SEG_CONTENTS_2") : (String[])null);
		String[] h_SEG_CONTENTS_3 = ((params.containsKey("h_SEG_CONTENTS_3")) ? (String[])params.get("h_SEG_CONTENTS_3") : (String[])null);
		String[] h_SEG_CONTENTS_4 = ((params.containsKey("h_SEG_CONTENTS_4")) ? (String[])params.get("h_SEG_CONTENTS_4") : (String[])null);

		struct.setrdoInsert( ((rdoInsert == null) ? (String)null : rdoInsert[0]) );
		struct.setList_rdoInsert(TypeConverter.convert(rdoInsert));
		struct.setrdoUpdate( ((rdoUpdate == null) ? (String)null : rdoUpdate[0]) );
		struct.setList_rdoUpdate(TypeConverter.convert(rdoUpdate));
		struct.setrdoDelete( ((rdoDelete == null) ? (String)null : rdoDelete[0]) );
		struct.setList_rdoDelete(TypeConverter.convert(rdoDelete));
		struct.setFileName( ((FileName == null) ? (String)null : FileName[0]) );
		struct.setList_FileName(TypeConverter.convert(FileName));
		struct.setDO_CHK( ((DO_CHK == null) ? (String)null : DO_CHK[0]) );
		struct.setList_DO_CHK(TypeConverter.convert(DO_CHK));
		struct.setERROR_IN( ((ERROR_IN == null) ? (String)null : ERROR_IN[0]) );
		struct.setList_ERROR_IN(TypeConverter.convert(ERROR_IN));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setERR_CTR_NM( ((ERR_CTR_NM == null) ? (String)null : ERR_CTR_NM[0]) );
		struct.setList_ERR_CTR_NM(TypeConverter.convert(ERR_CTR_NM));
		struct.setERR_INFO( ((ERR_INFO == null) ? (String)null : ERR_INFO[0]) );
		struct.setList_ERR_INFO(TypeConverter.convert(ERR_INFO));
		struct.seth_SYORI_KUBUN( ((h_SYORI_KUBUN == null) ? (String)null : h_SYORI_KUBUN[0]) );
		struct.setList_h_SYORI_KUBUN(TypeConverter.convert(h_SYORI_KUBUN));
		struct.seth_ITEM_CD( ((h_ITEM_CD == null) ? (String)null : h_ITEM_CD[0]) );
		struct.setList_h_ITEM_CD(TypeConverter.convert(h_ITEM_CD));
		struct.seth_ITEM_NAME( ((h_ITEM_NAME == null) ? (String)null : h_ITEM_NAME[0]) );
		struct.setList_h_ITEM_NAME(TypeConverter.convert(h_ITEM_NAME));
		struct.seth_DRAW_CD( ((h_DRAW_CD == null) ? (String)null : h_DRAW_CD[0]) );
		struct.setList_h_DRAW_CD(TypeConverter.convert(h_DRAW_CD));
		struct.seth_SPEC( ((h_SPEC == null) ? (String)null : h_SPEC[0]) );
		struct.setList_h_SPEC(TypeConverter.convert(h_SPEC));
		struct.seth_HIGH_LEVEL_NO( ((h_HIGH_LEVEL_NO == null) ? (String)null : h_HIGH_LEVEL_NO[0]) );
		struct.setList_h_HIGH_LEVEL_NO(TypeConverter.convert(h_HIGH_LEVEL_NO));
		struct.seth_MRP_ODR_TYP( ((h_MRP_ODR_TYP == null) ? (String)null : h_MRP_ODR_TYP[0]) );
		struct.setList_h_MRP_ODR_TYP(TypeConverter.convert(h_MRP_ODR_TYP));
		struct.seth_OUTSIDE_TYP( ((h_OUTSIDE_TYP == null) ? (String)null : h_OUTSIDE_TYP[0]) );
		struct.setList_h_OUTSIDE_TYP(TypeConverter.convert(h_OUTSIDE_TYP));
		struct.seth_STOCK_UNIT_FLG( ((h_STOCK_UNIT_FLG == null) ? (String)null : h_STOCK_UNIT_FLG[0]) );
		struct.setList_h_STOCK_UNIT_FLG(TypeConverter.convert(h_STOCK_UNIT_FLG));
		struct.seth_STOCK_UNIT( ((h_STOCK_UNIT == null) ? (String)null : h_STOCK_UNIT[0]) );
		struct.setList_h_STOCK_UNIT(TypeConverter.convert(h_STOCK_UNIT));
		struct.seth_PKG_UNIT( ((h_PKG_UNIT == null) ? (String)null : h_PKG_UNIT[0]) );
		struct.setList_h_PKG_UNIT(TypeConverter.convert(h_PKG_UNIT));
		struct.seth_PKG_UNIT_QTY( ((h_PKG_UNIT_QTY == null) ? (String)null : h_PKG_UNIT_QTY[0]) );
		struct.setList_h_PKG_UNIT_QTY(TypeConverter.convert(h_PKG_UNIT_QTY));
		struct.seth_UNIT_QTY_TYP( ((h_UNIT_QTY_TYP == null) ? (String)null : h_UNIT_QTY_TYP[0]) );
		struct.setList_h_UNIT_QTY_TYP(TypeConverter.convert(h_UNIT_QTY_TYP));
		struct.seth_ODR_LT( ((h_ODR_LT == null) ? (String)null : h_ODR_LT[0]) );
		struct.setList_h_ODR_LT(TypeConverter.convert(h_ODR_LT));
		struct.seth_FIXED_LT( ((h_FIXED_LT == null) ? (String)null : h_FIXED_LT[0]) );
		struct.setList_h_FIXED_LT(TypeConverter.convert(h_FIXED_LT));
		struct.seth_PROP_LT( ((h_PROP_LT == null) ? (String)null : h_PROP_LT[0]) );
		struct.setList_h_PROP_LT(TypeConverter.convert(h_PROP_LT));
		struct.seth_SAFETY_LT( ((h_SAFETY_LT == null) ? (String)null : h_SAFETY_LT[0]) );
		struct.setList_h_SAFETY_LT(TypeConverter.convert(h_SAFETY_LT));
		struct.seth_ISSUE_LT( ((h_ISSUE_LT == null) ? (String)null : h_ISSUE_LT[0]) );
		struct.setList_h_ISSUE_LT(TypeConverter.convert(h_ISSUE_LT));
		struct.seth_PROP_LOT_SIZE( ((h_PROP_LOT_SIZE == null) ? (String)null : h_PROP_LOT_SIZE[0]) );
		struct.setList_h_PROP_LOT_SIZE(TypeConverter.convert(h_PROP_LOT_SIZE));
		struct.seth_ITEM_SPOIL( ((h_ITEM_SPOIL == null) ? (String)null : h_ITEM_SPOIL[0]) );
		struct.setList_h_ITEM_SPOIL(TypeConverter.convert(h_ITEM_SPOIL));
		struct.seth_SAFETY_STOCK( ((h_SAFETY_STOCK == null) ? (String)null : h_SAFETY_STOCK[0]) );
		struct.setList_h_SAFETY_STOCK(TypeConverter.convert(h_SAFETY_STOCK));
		struct.seth_LOT_SIZING_TYP( ((h_LOT_SIZING_TYP == null) ? (String)null : h_LOT_SIZING_TYP[0]) );
		struct.setList_h_LOT_SIZING_TYP(TypeConverter.convert(h_LOT_SIZING_TYP));
		struct.seth_MAX_PERIOD( ((h_MAX_PERIOD == null) ? (String)null : h_MAX_PERIOD[0]) );
		struct.setList_h_MAX_PERIOD(TypeConverter.convert(h_MAX_PERIOD));
		struct.seth_MAX_ODR_QTY( ((h_MAX_ODR_QTY == null) ? (String)null : h_MAX_ODR_QTY[0]) );
		struct.setList_h_MAX_ODR_QTY(TypeConverter.convert(h_MAX_ODR_QTY));
		struct.seth_ODR_POINT( ((h_ODR_POINT == null) ? (String)null : h_ODR_POINT[0]) );
		struct.setList_h_ODR_POINT(TypeConverter.convert(h_ODR_POINT));
		struct.seth_FIXED_ODR_QTY( ((h_FIXED_ODR_QTY == null) ? (String)null : h_FIXED_ODR_QTY[0]) );
		struct.setList_h_FIXED_ODR_QTY(TypeConverter.convert(h_FIXED_ODR_QTY));
		struct.seth_MIN_ODR_QTY( ((h_MIN_ODR_QTY == null) ? (String)null : h_MIN_ODR_QTY[0]) );
		struct.setList_h_MIN_ODR_QTY(TypeConverter.convert(h_MIN_ODR_QTY));
		struct.seth_MUL_ODR_QTY( ((h_MUL_ODR_QTY == null) ? (String)null : h_MUL_ODR_QTY[0]) );
		struct.setList_h_MUL_ODR_QTY(TypeConverter.convert(h_MUL_ODR_QTY));
		struct.seth_ISSUE_TYP( ((h_ISSUE_TYP == null) ? (String)null : h_ISSUE_TYP[0]) );
		struct.setList_h_ISSUE_TYP(TypeConverter.convert(h_ISSUE_TYP));
		struct.seth_MPS_FLG( ((h_MPS_FLG == null) ? (String)null : h_MPS_FLG[0]) );
		struct.setList_h_MPS_FLG(TypeConverter.convert(h_MPS_FLG));
		struct.seth_ACPT_INSPC_TYP( ((h_ACPT_INSPC_TYP == null) ? (String)null : h_ACPT_INSPC_TYP[0]) );
		struct.setList_h_ACPT_INSPC_TYP(TypeConverter.convert(h_ACPT_INSPC_TYP));
		struct.seth_PRODUCT_TYP( ((h_PRODUCT_TYP == null) ? (String)null : h_PRODUCT_TYP[0]) );
		struct.setList_h_PRODUCT_TYP(TypeConverter.convert(h_PRODUCT_TYP));
		struct.seth_CLASIFICATION_CD( ((h_CLASIFICATION_CD == null) ? (String)null : h_CLASIFICATION_CD[0]) );
		struct.setList_h_CLASIFICATION_CD(TypeConverter.convert(h_CLASIFICATION_CD));
		struct.seth_UNIT_WEIGHT( ((h_UNIT_WEIGHT == null) ? (String)null : h_UNIT_WEIGHT[0]) );
		struct.setList_h_UNIT_WEIGHT(TypeConverter.convert(h_UNIT_WEIGHT));
		struct.seth_ABC_TYP( ((h_ABC_TYP == null) ? (String)null : h_ABC_TYP[0]) );
		struct.setList_h_ABC_TYP(TypeConverter.convert(h_ABC_TYP));
		struct.seth_OPR_RSLT_TYP( ((h_OPR_RSLT_TYP == null) ? (String)null : h_OPR_RSLT_TYP[0]) );
		struct.setList_h_OPR_RSLT_TYP(TypeConverter.convert(h_OPR_RSLT_TYP));
		struct.seth_SPL_ITEM_TYP( ((h_SPL_ITEM_TYP == null) ? (String)null : h_SPL_ITEM_TYP[0]) );
		struct.setList_h_SPL_ITEM_TYP(TypeConverter.convert(h_SPL_ITEM_TYP));
		struct.seth_TAX_CD( ((h_TAX_CD == null) ? (String)null : h_TAX_CD[0]) );
		struct.setList_h_TAX_CD(TypeConverter.convert(h_TAX_CD));
		struct.seth_WH_CD( ((h_WH_CD == null) ? (String)null : h_WH_CD[0]) );
		struct.setList_h_WH_CD(TypeConverter.convert(h_WH_CD));
		struct.setCANCEL_FILE( ((CANCEL_FILE == null) ? (String)null : CANCEL_FILE[0]) );
		struct.setList_CANCEL_FILE(TypeConverter.convert(CANCEL_FILE));
		struct.setJUDGMENT_TXT( ((JUDGMENT_TXT == null) ? (String)null : JUDGMENT_TXT[0]) );
		struct.setList_JUDGMENT_TXT(TypeConverter.convert(JUDGMENT_TXT));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.seth_CAL_NO( ((h_CAL_NO == null) ? (String)null : h_CAL_NO[0]) );
		struct.setList_h_CAL_NO(TypeConverter.convert(h_CAL_NO));
		struct.setERR_TYP( ((ERR_TYP == null) ? (String)null : ERR_TYP[0]) );
		struct.setList_ERR_TYP(TypeConverter.convert(ERR_TYP));
		struct.seth_DEPT_CD( ((h_DEPT_CD == null) ? (String)null : h_DEPT_CD[0]) );
		struct.setList_h_DEPT_CD(TypeConverter.convert(h_DEPT_CD));
		struct.seth_PJ_CD( ((h_PJ_CD == null) ? (String)null : h_PJ_CD[0]) );
		struct.setList_h_PJ_CD(TypeConverter.convert(h_PJ_CD));
		struct.seth_SEG_CONTENTS_1( ((h_SEG_CONTENTS_1 == null) ? (String)null : h_SEG_CONTENTS_1[0]) );
		struct.setList_h_SEG_CONTENTS_1(TypeConverter.convert(h_SEG_CONTENTS_1));
		struct.seth_SEG_CONTENTS_2( ((h_SEG_CONTENTS_2 == null) ? (String)null : h_SEG_CONTENTS_2[0]) );
		struct.setList_h_SEG_CONTENTS_2(TypeConverter.convert(h_SEG_CONTENTS_2));
		struct.seth_SEG_CONTENTS_3( ((h_SEG_CONTENTS_3 == null) ? (String)null : h_SEG_CONTENTS_3[0]) );
		struct.setList_h_SEG_CONTENTS_3(TypeConverter.convert(h_SEG_CONTENTS_3));
		struct.seth_SEG_CONTENTS_4( ((h_SEG_CONTENTS_4 == null) ? (String)null : h_SEG_CONTENTS_4[0]) );
		struct.setList_h_SEG_CONTENTS_4(TypeConverter.convert(h_SEG_CONTENTS_4));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0150010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAA0150010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAA0150010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AA0150010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0150010Entity entity = control.entity;
		AA0150010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0150010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0150010Control control;
		AA0150010Entity  entity = null;
		AA0150010Struct  struct = null;

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

			if( (control = (AA0150010Control)so.getAttribute("AA0150010Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0150010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0150010Control();
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
				if( isClick(request, "CsvImport") ) {
					if ( !isCryptical(request, so, params, "CsvImport") ) return ERROR_TARGET;
					target = onClickCsvImport(request, response, so, params, control);
					control.setButton("CsvImport");
				} else if( isClick(request, "Browse") ) {
					if ( !isCryptical(request, so, params, "Browse") ) return ERROR_TARGET;
					target = onClickBrowse(request, response, so, params, control);
					control.setButton("Browse");
				} else if( isClick(request, "CsvIn") ) {
					if ( !isCryptical(request, so, params, "CsvIn") ) return ERROR_TARGET;
					target = onClickCsvIn(request, response, so, params, control);
					control.setButton("CsvIn");
				} else if( isClick(request, "return_sub1") ) {
					if ( !isCryptical(request, so, params, "return_sub1") ) return ERROR_TARGET;
					target = onClickreturn_sub1(request, response, so, params, control);
					control.setButton("return_sub1");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "CsvOut") ) {
					if ( !isCryptical(request, so, params, "CsvOut") ) return ERROR_TARGET;
					target = onClickCsvOut(request, response, so, params, control);
					control.setButton("CsvOut");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AA0150010Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "CsvImport") && bFLG_DISCONNECT_CsvImport)
				|| (isClick(request, "Browse") && bFLG_DISCONNECT_Browse)
				|| (isClick(request, "CsvIn") && bFLG_DISCONNECT_CsvIn)
				|| (isClick(request, "return_sub1") && bFLG_DISCONNECT_return_sub1)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "CsvOut") && bFLG_DISCONNECT_CsvOut)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
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
	private  static boolean bFLG_DISCONNECT_CsvImport = true;
	private  static boolean bFLG_DISCONNECT_Browse = true;
	private  static boolean bFLG_DISCONNECT_CsvIn = true;
	private  static boolean bFLG_DISCONNECT_return_sub1 = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_CsvOut = true;
	private  static boolean bFLG_DISCONNECT_Close = true;

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
		return "com.nec.jp.orteus.metamorBase.AA0150.AA0150010Servlet";
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
	public AA0150010Servlet()
	{
		//{{user_implement_dev:<AA0150010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		//bFLG_DISCONNECT_defaultEvent = true;
		//bFLG_DISCONNECT_CsvFDailog = true;
		//bFLG_DISCONNECT_ErrFDailog = true;
		//bFLG_DISCONNECT_CsvIn = true;

                //}}user_implement_dev:<AA0150010_DisConnect_FLG>

		//{{user_implement_dev:<AA0150010Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AA0150010Servlet>
	}

	//////////////////////////////

}
