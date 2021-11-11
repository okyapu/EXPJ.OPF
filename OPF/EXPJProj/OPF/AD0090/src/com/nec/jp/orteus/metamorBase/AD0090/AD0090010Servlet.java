/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0090/src/com/nec/jp/orteus/metamorBase/AD0090/AD0090010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0090;

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
/**
 * CLASS     : AD0090010Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class AD0090010Servlet extends HttpServlet
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
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AD0090010Control control)
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
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AD0090010Control control)
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
	 * @param control AD0090010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
			logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			LogWriter.write( Level.ALL, "AD0090010"+" $Revision: 1.8 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AD0090010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("AD0090010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �ڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	public String onClickDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickDetail");
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
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickDetail");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/AD0090010.jsp";		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Insert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * ���������{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	public String onClickCancelComplete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelComplete");
		//{{user_implement_dev:<onClickCancelComplete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CancelComplete");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCancelComplete>
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelComplete");

		return nextUrl;
	}

	/**
	 * �����e�i���X�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	public String onClickMainTain(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickMainTain");
		//{{user_implement_dev:<onClickMainTain>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("MainTain");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickMainTain>
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickMainTain");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	public String onClickPrintShow(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickPrintShow");
		//{{user_implement_dev:<onClickPrintShow>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("PrintShow");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickPrintShow>
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickPrintShow");

		return nextUrl;
	}

	/**
	 * ���b�g�Ǘ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AD0090010Control�N���X�C���X�^���X
	 */
	public String onClickLotInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AD0090010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickLotInsert");
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
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"onClickLotInsert");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AD0090010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] IN_OPR_INST_CD = ((params.containsKey("IN_OPR_INST_CD")) ? (String[])params.get("IN_OPR_INST_CD") : (String[])null);
		String[] PARTIAL_PRD_NO = ((params.containsKey("PARTIAL_PRD_NO")) ? (String[])params.get("PARTIAL_PRD_NO") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] chk_COMPLETE = ((params.containsKey("chk_COMPLETE")) ? (String[])params.get("chk_COMPLETE") : (String[])null);
		String[] WORK_IN_PROC_CD = ((params.containsKey("WORK_IN_PROC_CD")) ? (String[])params.get("WORK_IN_PROC_CD") : (String[])null);
		String[] PROC_NAME = ((params.containsKey("PROC_NAME")) ? (String[])params.get("PROC_NAME") : (String[])null);
		String[] OPR_DATE = ((params.containsKey("OPR_DATE")) ? (String[])params.get("OPR_DATE") : (String[])null);
		String[] OPRATION_TIME = ((params.containsKey("OPRATION_TIME")) ? (String[])params.get("OPRATION_TIME") : (String[])null);
		String[] OPR_INST_QTY = ((params.containsKey("OPR_INST_QTY")) ? (String[])params.get("OPR_INST_QTY") : (String[])null);
		String[] chk_OUTPUT = ((params.containsKey("chk_OUTPUT")) ? (String[])params.get("chk_OUTPUT") : (String[])null);
		String[] ACPT_QTY = ((params.containsKey("ACPT_QTY")) ? (String[])params.get("ACPT_QTY") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] SUM_ACPT_QTY = ((params.containsKey("SUM_ACPT_QTY")) ? (String[])params.get("SUM_ACPT_QTY") : (String[])null);
		String[] DEFECT_QTY = ((params.containsKey("DEFECT_QTY")) ? (String[])params.get("DEFECT_QTY") : (String[])null);
		String[] d1_STOCK_UNIT = ((params.containsKey("d1_STOCK_UNIT")) ? (String[])params.get("d1_STOCK_UNIT") : (String[])null);
		String[] SUM_DEFECT_QTY = ((params.containsKey("SUM_DEFECT_QTY")) ? (String[])params.get("SUM_DEFECT_QTY") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] WS_CD = ((params.containsKey("WS_CD")) ? (String[])params.get("WS_CD") : (String[])null);
		String[] WS_NAME = ((params.containsKey("WS_NAME")) ? (String[])params.get("WS_NAME") : (String[])null);
		String[] LOT_NO = ((params.containsKey("LOT_NO")) ? (String[])params.get("LOT_NO") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] OPR_RSLT_PERSON = ((params.containsKey("OPR_RSLT_PERSON")) ? (String[])params.get("OPR_RSLT_PERSON") : (String[])null);
		String[] OPR_TIME_UNIT_TYP = ((params.containsKey("OPR_TIME_UNIT_TYP")) ? (String[])params.get("OPR_TIME_UNIT_TYP") : (String[])null);
		String[] OPR_TIME_UNIT_TYP_name = ((params.containsKey("OPR_TIME_UNIT_TYP_name")) ? (String[])params.get("OPR_TIME_UNIT_TYP_name") : (String[])null);
		String[] OPR_TIME_UNIT_TYP_val = ((params.containsKey("OPR_TIME_UNIT_TYP_val")) ? (String[])params.get("OPR_TIME_UNIT_TYP_val") : (String[])null);
		String[] PRE_ARRANGEMENT_TIME = ((params.containsKey("PRE_ARRANGEMENT_TIME")) ? (String[])params.get("PRE_ARRANGEMENT_TIME") : (String[])null);
		String[] OPR_TIME = ((params.containsKey("OPR_TIME")) ? (String[])params.get("OPR_TIME") : (String[])null);
		String[] POST_ARRANGEMENT_TIME = ((params.containsKey("POST_ARRANGEMENT_TIME")) ? (String[])params.get("POST_ARRANGEMENT_TIME") : (String[])null);
		String[] CESSATION_TIME = ((params.containsKey("CESSATION_TIME")) ? (String[])params.get("CESSATION_TIME") : (String[])null);
		String[] CESSATION_CAUSE = ((params.containsKey("CESSATION_CAUSE")) ? (String[])params.get("CESSATION_CAUSE") : (String[])null);
		String[] OPR_RSLT_COMMENT = ((params.containsKey("OPR_RSLT_COMMENT")) ? (String[])params.get("OPR_RSLT_COMMENT") : (String[])null);
		String[] l_DEFECT_CAUSE_CD = ((params.containsKey("l_DEFECT_CAUSE_CD")) ? (String[])params.get("l_DEFECT_CAUSE_CD") : (String[])null);
		String[] l_DEFECT_CAUSE_CD_name = ((params.containsKey("l_DEFECT_CAUSE_CD_name")) ? (String[])params.get("l_DEFECT_CAUSE_CD_name") : (String[])null);
		String[] l_DEFECT_CAUSE_CD_val = ((params.containsKey("l_DEFECT_CAUSE_CD_val")) ? (String[])params.get("l_DEFECT_CAUSE_CD_val") : (String[])null);
		String[] l_DEFECT_QTY = ((params.containsKey("l_DEFECT_QTY")) ? (String[])params.get("l_DEFECT_QTY") : (String[])null);
		String[] l_DEFECT_COMMENT = ((params.containsKey("l_DEFECT_COMMENT")) ? (String[])params.get("l_DEFECT_COMMENT") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] MRP_ODR_TYP_DN = ((params.containsKey("MRP_ODR_TYP_DN")) ? (String[])params.get("MRP_ODR_TYP_DN") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] WORK_ODR_DLV_DATE = ((params.containsKey("WORK_ODR_DLV_DATE")) ? (String[])params.get("WORK_ODR_DLV_DATE") : (String[])null);
		String[] OPR_INST_START_DATE = ((params.containsKey("OPR_INST_START_DATE")) ? (String[])params.get("OPR_INST_START_DATE") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] LOT_CTRL_FLG = ((params.containsKey("LOT_CTRL_FLG")) ? (String[])params.get("LOT_CTRL_FLG") : (String[])null);
		String[] h_OPR_DATE = ((params.containsKey("h_OPR_DATE")) ? (String[])params.get("h_OPR_DATE") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);
		String[] h_BUSINESS_OPR_DATE = ((params.containsKey("h_BUSINESS_OPR_DATE")) ? (String[])params.get("h_BUSINESS_OPR_DATE") : (String[])null);
		String[] h_FINAL_PROC_FLG = ((params.containsKey("h_FINAL_PROC_FLG")) ? (String[])params.get("h_FINAL_PROC_FLG") : (String[])null);
		String[] h_SYS_LOT_CTRL_FLG = ((params.containsKey("h_SYS_LOT_CTRL_FLG")) ? (String[])params.get("h_SYS_LOT_CTRL_FLG") : (String[])null);
		String[] chk_CHILD_RSLTUPDATE = ((params.containsKey("chk_CHILD_RSLTUPDATE")) ? (String[])params.get("chk_CHILD_RSLTUPDATE") : (String[])null);
		String[] LOT_NUMBERING_TYP = ((params.containsKey("LOT_NUMBERING_TYP")) ? (String[])params.get("LOT_NUMBERING_TYP") : (String[])null);
		String[] param1 = ((params.containsKey("param1")) ? (String[])params.get("param1") : (String[])null);
		String[] param2 = ((params.containsKey("param2")) ? (String[])params.get("param2") : (String[])null);
		String[] param3 = ((params.containsKey("param3")) ? (String[])params.get("param3") : (String[])null);
		String[] h_PROCESS_MANAGE_FLG = ((params.containsKey("h_PROCESS_MANAGE_FLG")) ? (String[])params.get("h_PROCESS_MANAGE_FLG") : (String[])null);

		struct.setIN_OPR_INST_CD( ((IN_OPR_INST_CD == null) ? (String)null : IN_OPR_INST_CD[0]) );
		struct.setList_IN_OPR_INST_CD(TypeConverter.convert(IN_OPR_INST_CD));
		struct.setPARTIAL_PRD_NO( ((PARTIAL_PRD_NO == null) ? (String)null : PARTIAL_PRD_NO[0]) );
		struct.setList_PARTIAL_PRD_NO(TypeConverter.convert(PARTIAL_PRD_NO));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setchk_COMPLETE( ((chk_COMPLETE == null) ? (String)null : chk_COMPLETE[0]) );
		struct.setList_chk_COMPLETE(TypeConverter.convert(chk_COMPLETE));
		struct.setWORK_IN_PROC_CD( ((WORK_IN_PROC_CD == null) ? (String)null : WORK_IN_PROC_CD[0]) );
		struct.setList_WORK_IN_PROC_CD(TypeConverter.convert(WORK_IN_PROC_CD));
		struct.setPROC_NAME( ((PROC_NAME == null) ? (String)null : PROC_NAME[0]) );
		struct.setList_PROC_NAME(TypeConverter.convert(PROC_NAME));
		struct.setOPR_DATE( ((OPR_DATE == null) ? (String)null : OPR_DATE[0]) );
		struct.setList_OPR_DATE(TypeConverter.convert(OPR_DATE));
		struct.setOPRATION_TIME( ((OPRATION_TIME == null) ? (String)null : OPRATION_TIME[0]) );
		struct.setList_OPRATION_TIME(TypeConverter.convert(OPRATION_TIME));
		struct.setOPR_INST_QTY( ((OPR_INST_QTY == null) ? (String)null : OPR_INST_QTY[0]) );
		struct.setList_OPR_INST_QTY(TypeConverter.convert(OPR_INST_QTY));
		struct.setchk_OUTPUT( ((chk_OUTPUT == null) ? (String)null : chk_OUTPUT[0]) );
		struct.setList_chk_OUTPUT(TypeConverter.convert(chk_OUTPUT));
		struct.setACPT_QTY( ((ACPT_QTY == null) ? (String)null : ACPT_QTY[0]) );
		struct.setList_ACPT_QTY(TypeConverter.convert(ACPT_QTY));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setSUM_ACPT_QTY( ((SUM_ACPT_QTY == null) ? (String)null : SUM_ACPT_QTY[0]) );
		struct.setList_SUM_ACPT_QTY(TypeConverter.convert(SUM_ACPT_QTY));
		struct.setDEFECT_QTY( ((DEFECT_QTY == null) ? (String)null : DEFECT_QTY[0]) );
		struct.setList_DEFECT_QTY(TypeConverter.convert(DEFECT_QTY));
		struct.setd1_STOCK_UNIT( ((d1_STOCK_UNIT == null) ? (String)null : d1_STOCK_UNIT[0]) );
		struct.setList_d1_STOCK_UNIT(TypeConverter.convert(d1_STOCK_UNIT));
		struct.setSUM_DEFECT_QTY( ((SUM_DEFECT_QTY == null) ? (String)null : SUM_DEFECT_QTY[0]) );
		struct.setList_SUM_DEFECT_QTY(TypeConverter.convert(SUM_DEFECT_QTY));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setWS_CD( ((WS_CD == null) ? (String)null : WS_CD[0]) );
		struct.setList_WS_CD(TypeConverter.convert(WS_CD));
		struct.setWS_NAME( ((WS_NAME == null) ? (String)null : WS_NAME[0]) );
		struct.setList_WS_NAME(TypeConverter.convert(WS_NAME));
		struct.setLOT_NO( ((LOT_NO == null) ? (String)null : LOT_NO[0]) );
		struct.setList_LOT_NO(TypeConverter.convert(LOT_NO));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setOPR_RSLT_PERSON( ((OPR_RSLT_PERSON == null) ? (String)null : OPR_RSLT_PERSON[0]) );
		struct.setList_OPR_RSLT_PERSON(TypeConverter.convert(OPR_RSLT_PERSON));
		struct.setOPR_TIME_UNIT_TYP( ((OPR_TIME_UNIT_TYP == null) ? (String)null : OPR_TIME_UNIT_TYP[0]) );
		struct.setList_OPR_TIME_UNIT_TYP(TypeConverter.convert(OPR_TIME_UNIT_TYP));
		struct.setOPR_TIME_UNIT_TYP_name( ((OPR_TIME_UNIT_TYP_name == null) ? (String)null : OPR_TIME_UNIT_TYP_name[0]) );
		struct.setList_OPR_TIME_UNIT_TYP_name(TypeConverter.convert(OPR_TIME_UNIT_TYP_name));
		struct.setOPR_TIME_UNIT_TYP_val( ((OPR_TIME_UNIT_TYP_val == null) ? (String)null : OPR_TIME_UNIT_TYP_val[0]) );
		struct.setList_OPR_TIME_UNIT_TYP_val(TypeConverter.convert(OPR_TIME_UNIT_TYP_val));
		struct.setPRE_ARRANGEMENT_TIME( ((PRE_ARRANGEMENT_TIME == null) ? (String)null : PRE_ARRANGEMENT_TIME[0]) );
		struct.setList_PRE_ARRANGEMENT_TIME(TypeConverter.convert(PRE_ARRANGEMENT_TIME));
		struct.setOPR_TIME( ((OPR_TIME == null) ? (String)null : OPR_TIME[0]) );
		struct.setList_OPR_TIME(TypeConverter.convert(OPR_TIME));
		struct.setPOST_ARRANGEMENT_TIME( ((POST_ARRANGEMENT_TIME == null) ? (String)null : POST_ARRANGEMENT_TIME[0]) );
		struct.setList_POST_ARRANGEMENT_TIME(TypeConverter.convert(POST_ARRANGEMENT_TIME));
		struct.setCESSATION_TIME( ((CESSATION_TIME == null) ? (String)null : CESSATION_TIME[0]) );
		struct.setList_CESSATION_TIME(TypeConverter.convert(CESSATION_TIME));
		struct.setCESSATION_CAUSE( ((CESSATION_CAUSE == null) ? (String)null : CESSATION_CAUSE[0]) );
		struct.setList_CESSATION_CAUSE(TypeConverter.convert(CESSATION_CAUSE));
		struct.setOPR_RSLT_COMMENT( ((OPR_RSLT_COMMENT == null) ? (String)null : OPR_RSLT_COMMENT[0]) );
		struct.setList_OPR_RSLT_COMMENT(TypeConverter.convert(OPR_RSLT_COMMENT));
		struct.setl_DEFECT_CAUSE_CD( ((l_DEFECT_CAUSE_CD == null) ? (String)null : l_DEFECT_CAUSE_CD[0]) );
		struct.setList_l_DEFECT_CAUSE_CD(TypeConverter.convert(l_DEFECT_CAUSE_CD));
		struct.setl_DEFECT_CAUSE_CD_name( ((l_DEFECT_CAUSE_CD_name == null) ? (String)null : l_DEFECT_CAUSE_CD_name[0]) );
		struct.setList_l_DEFECT_CAUSE_CD_name(TypeConverter.convert(l_DEFECT_CAUSE_CD_name));
		struct.setl_DEFECT_CAUSE_CD_val( ((l_DEFECT_CAUSE_CD_val == null) ? (String)null : l_DEFECT_CAUSE_CD_val[0]) );
		struct.setList_l_DEFECT_CAUSE_CD_val(TypeConverter.convert(l_DEFECT_CAUSE_CD_val));
		struct.setl_DEFECT_QTY( ((l_DEFECT_QTY == null) ? (String)null : l_DEFECT_QTY[0]) );
		struct.setList_l_DEFECT_QTY(TypeConverter.convert(l_DEFECT_QTY));
		struct.setl_DEFECT_COMMENT( ((l_DEFECT_COMMENT == null) ? (String)null : l_DEFECT_COMMENT[0]) );
		struct.setList_l_DEFECT_COMMENT(TypeConverter.convert(l_DEFECT_COMMENT));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setMRP_ODR_TYP_DN( ((MRP_ODR_TYP_DN == null) ? (String)null : MRP_ODR_TYP_DN[0]) );
		struct.setList_MRP_ODR_TYP_DN(TypeConverter.convert(MRP_ODR_TYP_DN));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setWORK_ODR_DLV_DATE( ((WORK_ODR_DLV_DATE == null) ? (String)null : WORK_ODR_DLV_DATE[0]) );
		struct.setList_WORK_ODR_DLV_DATE(TypeConverter.convert(WORK_ODR_DLV_DATE));
		struct.setOPR_INST_START_DATE( ((OPR_INST_START_DATE == null) ? (String)null : OPR_INST_START_DATE[0]) );
		struct.setList_OPR_INST_START_DATE(TypeConverter.convert(OPR_INST_START_DATE));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setLOT_CTRL_FLG( ((LOT_CTRL_FLG == null) ? (String)null : LOT_CTRL_FLG[0]) );
		struct.setList_LOT_CTRL_FLG(TypeConverter.convert(LOT_CTRL_FLG));
		struct.seth_OPR_DATE( ((h_OPR_DATE == null) ? (String)null : h_OPR_DATE[0]) );
		struct.setList_h_OPR_DATE(TypeConverter.convert(h_OPR_DATE));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));
		struct.seth_BUSINESS_OPR_DATE( ((h_BUSINESS_OPR_DATE == null) ? (String)null : h_BUSINESS_OPR_DATE[0]) );
		struct.setList_h_BUSINESS_OPR_DATE(TypeConverter.convert(h_BUSINESS_OPR_DATE));
		struct.seth_FINAL_PROC_FLG( ((h_FINAL_PROC_FLG == null) ? (String)null : h_FINAL_PROC_FLG[0]) );
		struct.setList_h_FINAL_PROC_FLG(TypeConverter.convert(h_FINAL_PROC_FLG));
		struct.seth_SYS_LOT_CTRL_FLG( ((h_SYS_LOT_CTRL_FLG == null) ? (String)null : h_SYS_LOT_CTRL_FLG[0]) );
		struct.setList_h_SYS_LOT_CTRL_FLG(TypeConverter.convert(h_SYS_LOT_CTRL_FLG));
		struct.setchk_CHILD_RSLTUPDATE( ((chk_CHILD_RSLTUPDATE == null) ? (String)null : chk_CHILD_RSLTUPDATE[0]) );
		struct.setList_chk_CHILD_RSLTUPDATE(TypeConverter.convert(chk_CHILD_RSLTUPDATE));
		struct.setLOT_NUMBERING_TYP( ((LOT_NUMBERING_TYP == null) ? (String)null : LOT_NUMBERING_TYP[0]) );
		struct.setList_LOT_NUMBERING_TYP(TypeConverter.convert(LOT_NUMBERING_TYP));
		struct.setparam1( ((param1 == null) ? (String)null : param1[0]) );
		struct.setList_param1(TypeConverter.convert(param1));
		struct.setparam2( ((param2 == null) ? (String)null : param2[0]) );
		struct.setList_param2(TypeConverter.convert(param2));
		struct.setparam3( ((param3 == null) ? (String)null : param3[0]) );
		struct.setList_param3(TypeConverter.convert(param3));
		struct.seth_PROCESS_MANAGE_FLG( ((h_PROCESS_MANAGE_FLG == null) ? (String)null : h_PROCESS_MANAGE_FLG[0]) );
		struct.setList_h_PROCESS_MANAGE_FLG(TypeConverter.convert(h_PROCESS_MANAGE_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AD0090010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAD0090010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAD0090010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AD0090010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AD0090010Entity entity = control.entity;
		AD0090010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AD0090010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AD0090010Control control;
		AD0090010Entity  entity = null;
		AD0090010Struct  struct = null;

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

			if( (control = (AD0090010Control)so.getAttribute("AD0090010Control_"+request.getSession(false).getId())) == null ) {
				control = new AD0090010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AD0090010Control();
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
				if( isClick(request, "Detail") ) {
					if ( !isCryptical(request, so, params, "Detail") ) return ERROR_TARGET;
					target = onClickDetail(request, response, so, params, control);
					control.setButton("Detail");
				} else if( isClick(request, "Select") ) {
					if ( !isCryptical(request, so, params, "Select") ) return ERROR_TARGET;
					target = onClickSelect(request, response, so, params, control);
					control.setButton("Select");
				} else if( isClick(request, "Insert") ) {
					if ( !isCryptical(request, so, params, "Insert") ) return ERROR_TARGET;
					target = onClickInsert(request, response, so, params, control);
					control.setButton("Insert");
				} else if( isClick(request, "CancelComplete") ) {
					if ( !isCryptical(request, so, params, "CancelComplete") ) return ERROR_TARGET;
					target = onClickCancelComplete(request, response, so, params, control);
					control.setButton("CancelComplete");
				} else if( isClick(request, "MainTain") ) {
					if ( !isCryptical(request, so, params, "MainTain") ) return ERROR_TARGET;
					target = onClickMainTain(request, response, so, params, control);
					control.setButton("MainTain");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "PrintShow") ) {
					if ( !isCryptical(request, so, params, "PrintShow") ) return ERROR_TARGET;
					target = onClickPrintShow(request, response, so, params, control);
					control.setButton("PrintShow");
				} else if( isClick(request, "LotInsert") ) {
					if ( !isCryptical(request, so, params, "LotInsert") ) return ERROR_TARGET;
					target = onClickLotInsert(request, response, so, params, control);
					control.setButton("LotInsert");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AD0090010Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "Detail") && bFLG_DISCONNECT_Detail)
				|| (isClick(request, "Select") && bFLG_DISCONNECT_Select)
				|| (isClick(request, "Insert") && bFLG_DISCONNECT_Insert)
				|| (isClick(request, "CancelComplete") && bFLG_DISCONNECT_CancelComplete)
				|| (isClick(request, "MainTain") && bFLG_DISCONNECT_MainTain)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "PrintShow") && bFLG_DISCONNECT_PrintShow)
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
	private  static boolean bFLG_DISCONNECT_Detail = true;
	private  static boolean bFLG_DISCONNECT_Select = true;
	private  static boolean bFLG_DISCONNECT_Insert = true;
	private  static boolean bFLG_DISCONNECT_CancelComplete = true;
	private  static boolean bFLG_DISCONNECT_MainTain = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_PrintShow = true;
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
		return "com.nec.jp.orteus.metamorBase.AD0090.AD0090010Servlet";
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
	public AD0090010Servlet()
	{
		//{{user_implement_dev:<AD0090010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Detail = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_Insert = true;
		bFLG_DISCONNECT_CancelComplete = true;
		bFLG_DISCONNECT_MainTain = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<AD0090010_DisConnect_FLG>

		//{{user_implement_dev:<AD0090010Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AD0090010Servlet>
	}

	//////////////////////////////

}
