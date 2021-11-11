/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0010/src/com/nec/jp/orteus/metamorBase/KM0010/KM0010010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0010;

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
 * CLASS     : KM0010010Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KM0010010Servlet extends HttpServlet
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
	 * @param control KM0010010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, KM0010010Control control)
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
	 * @param control KM0010010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, KM0010010Control control)
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
	 * @param control KM0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0010010Entity entity = control.entity;
		KM0010010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
			logger.entering("KM0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			LogWriter.write( Level.ALL, "KM0010010"+" $Revision: 1.1 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KM0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KM0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0010010Entity entity = control.entity;
		KM0010010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KM0010010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KM0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0010010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0010010Entity entity = control.entity;
		KM0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("select");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickselect>
		logger.exiting("KM0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0010010Control�N���X�C���X�^���X
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0010010Entity entity = control.entity;
		KM0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("insert");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("KM0010010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0010010Control�N���X�C���X�^���X
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0010010Entity entity = control.entity;
		KM0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("update");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("KM0010010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0010010Control�N���X�C���X�^���X
	 */
	public String onClickdelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0010010Entity entity = control.entity;
		KM0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");
		//{{user_implement_dev:<onClickdelete>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("delete");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickdelete>
		logger.exiting("KM0010010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0010010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0010010Entity entity = control.entity;
		KM0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("clear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickclear>
		logger.exiting("KM0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KM0010010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PROJECT_CD = ((params.containsKey("PROJECT_CD")) ? (String[])params.get("PROJECT_CD") : (String[])null);
		String[] h_PROJECT_CD = ((params.containsKey("h_PROJECT_CD")) ? (String[])params.get("h_PROJECT_CD") : (String[])null);
		String[] PROJECT_NAME = ((params.containsKey("PROJECT_NAME")) ? (String[])params.get("PROJECT_NAME") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] CUST_NAME = ((params.containsKey("CUST_NAME")) ? (String[])params.get("CUST_NAME") : (String[])null);
		String[] PROJECT_STAT = ((params.containsKey("PROJECT_STAT")) ? (String[])params.get("PROJECT_STAT") : (String[])null);
		String[] PROJECT_STAT_name = ((params.containsKey("PROJECT_STAT_name")) ? (String[])params.get("PROJECT_STAT_name") : (String[])null);
		String[] PROJECT_STAT_val = ((params.containsKey("PROJECT_STAT_val")) ? (String[])params.get("PROJECT_STAT_val") : (String[])null);
		String[] COMPLETE_STAT = ((params.containsKey("COMPLETE_STAT")) ? (String[])params.get("COMPLETE_STAT") : (String[])null);
		String[] ACCURACY_LEVEL = ((params.containsKey("ACCURACY_LEVEL")) ? (String[])params.get("ACCURACY_LEVEL") : (String[])null);
		String[] ACCURACY_LEVEL_name = ((params.containsKey("ACCURACY_LEVEL_name")) ? (String[])params.get("ACCURACY_LEVEL_name") : (String[])null);
		String[] ACCURACY_LEVEL_val = ((params.containsKey("ACCURACY_LEVEL_val")) ? (String[])params.get("ACCURACY_LEVEL_val") : (String[])null);
		String[] Vend_Date = ((params.containsKey("Vend_Date")) ? (String[])params.get("Vend_Date") : (String[])null);
		String[] AssumeDlv_date = ((params.containsKey("AssumeDlv_date")) ? (String[])params.get("AssumeDlv_date") : (String[])null);
		String[] AssumeAmount = ((params.containsKey("AssumeAmount")) ? (String[])params.get("AssumeAmount") : (String[])null);
		String[] CurUnit = ((params.containsKey("CurUnit")) ? (String[])params.get("CurUnit") : (String[])null);
		String[] DLV_LOC_CD = ((params.containsKey("DLV_LOC_CD")) ? (String[])params.get("DLV_LOC_CD") : (String[])null);
		String[] DLV_LOC_NAME = ((params.containsKey("DLV_LOC_NAME")) ? (String[])params.get("DLV_LOC_NAME") : (String[])null);
		String[] PJ_ORG_CD = ((params.containsKey("PJ_ORG_CD")) ? (String[])params.get("PJ_ORG_CD") : (String[])null);
		String[] ORG_NAME = ((params.containsKey("ORG_NAME")) ? (String[])params.get("ORG_NAME") : (String[])null);
		String[] PJ_USER_CD = ((params.containsKey("PJ_USER_CD")) ? (String[])params.get("PJ_USER_CD") : (String[])null);
		String[] USER_NAME = ((params.containsKey("USER_NAME")) ? (String[])params.get("USER_NAME") : (String[])null);
		String[] REMARKS1 = ((params.containsKey("REMARKS1")) ? (String[])params.get("REMARKS1") : (String[])null);
		String[] REMARKS2 = ((params.containsKey("REMARKS2")) ? (String[])params.get("REMARKS2") : (String[])null);
		String[] REMARKS3 = ((params.containsKey("REMARKS3")) ? (String[])params.get("REMARKS3") : (String[])null);
		String[] REMARKS4 = ((params.containsKey("REMARKS4")) ? (String[])params.get("REMARKS4") : (String[])null);
		String[] REMARKS5 = ((params.containsKey("REMARKS5")) ? (String[])params.get("REMARKS5") : (String[])null);
		String[] OD_COMP_FLG = ((params.containsKey("OD_COMP_FLG")) ? (String[])params.get("OD_COMP_FLG") : (String[])null);
		String[] PJ_CLASS_01_TYP = ((params.containsKey("PJ_CLASS_01_TYP")) ? (String[])params.get("PJ_CLASS_01_TYP") : (String[])null);
		String[] PJ_CLASS_01_CD = ((params.containsKey("PJ_CLASS_01_CD")) ? (String[])params.get("PJ_CLASS_01_CD") : (String[])null);
		String[] PJ_CLASS_01_NAME = ((params.containsKey("PJ_CLASS_01_NAME")) ? (String[])params.get("PJ_CLASS_01_NAME") : (String[])null);
		String[] PJ_CLASS_02_TYP = ((params.containsKey("PJ_CLASS_02_TYP")) ? (String[])params.get("PJ_CLASS_02_TYP") : (String[])null);
		String[] PJ_CLASS_02_CD = ((params.containsKey("PJ_CLASS_02_CD")) ? (String[])params.get("PJ_CLASS_02_CD") : (String[])null);
		String[] PJ_CLASS_02_NAME = ((params.containsKey("PJ_CLASS_02_NAME")) ? (String[])params.get("PJ_CLASS_02_NAME") : (String[])null);
		String[] PJ_CLASS_03_TYP = ((params.containsKey("PJ_CLASS_03_TYP")) ? (String[])params.get("PJ_CLASS_03_TYP") : (String[])null);
		String[] PJ_CLASS_03_CD = ((params.containsKey("PJ_CLASS_03_CD")) ? (String[])params.get("PJ_CLASS_03_CD") : (String[])null);
		String[] PJ_CLASS_03_NAME = ((params.containsKey("PJ_CLASS_03_NAME")) ? (String[])params.get("PJ_CLASS_03_NAME") : (String[])null);
		String[] PJ_CLASS_04_TYP = ((params.containsKey("PJ_CLASS_04_TYP")) ? (String[])params.get("PJ_CLASS_04_TYP") : (String[])null);
		String[] PJ_CLASS_04_CD = ((params.containsKey("PJ_CLASS_04_CD")) ? (String[])params.get("PJ_CLASS_04_CD") : (String[])null);
		String[] PJ_CLASS_04_NAME = ((params.containsKey("PJ_CLASS_04_NAME")) ? (String[])params.get("PJ_CLASS_04_NAME") : (String[])null);
		String[] PJ_CLASS_05_TYP = ((params.containsKey("PJ_CLASS_05_TYP")) ? (String[])params.get("PJ_CLASS_05_TYP") : (String[])null);
		String[] PJ_CLASS_05_CD = ((params.containsKey("PJ_CLASS_05_CD")) ? (String[])params.get("PJ_CLASS_05_CD") : (String[])null);
		String[] PJ_CLASS_05_NAME = ((params.containsKey("PJ_CLASS_05_NAME")) ? (String[])params.get("PJ_CLASS_05_NAME") : (String[])null);
		String[] PJ_CLASS_06_TYP = ((params.containsKey("PJ_CLASS_06_TYP")) ? (String[])params.get("PJ_CLASS_06_TYP") : (String[])null);
		String[] PJ_CLASS_06_CD = ((params.containsKey("PJ_CLASS_06_CD")) ? (String[])params.get("PJ_CLASS_06_CD") : (String[])null);
		String[] PJ_CLASS_06_NAME = ((params.containsKey("PJ_CLASS_06_NAME")) ? (String[])params.get("PJ_CLASS_06_NAME") : (String[])null);
		String[] PJ_CLASS_07_TYP = ((params.containsKey("PJ_CLASS_07_TYP")) ? (String[])params.get("PJ_CLASS_07_TYP") : (String[])null);
		String[] PJ_CLASS_07_CD = ((params.containsKey("PJ_CLASS_07_CD")) ? (String[])params.get("PJ_CLASS_07_CD") : (String[])null);
		String[] PJ_CLASS_07_NAME = ((params.containsKey("PJ_CLASS_07_NAME")) ? (String[])params.get("PJ_CLASS_07_NAME") : (String[])null);
		String[] PJ_CLASS_08_TYP = ((params.containsKey("PJ_CLASS_08_TYP")) ? (String[])params.get("PJ_CLASS_08_TYP") : (String[])null);
		String[] PJ_CLASS_08_CD = ((params.containsKey("PJ_CLASS_08_CD")) ? (String[])params.get("PJ_CLASS_08_CD") : (String[])null);
		String[] PJ_CLASS_08_NAME = ((params.containsKey("PJ_CLASS_08_NAME")) ? (String[])params.get("PJ_CLASS_08_NAME") : (String[])null);
		String[] PJ_CLASS_09_TYP = ((params.containsKey("PJ_CLASS_09_TYP")) ? (String[])params.get("PJ_CLASS_09_TYP") : (String[])null);
		String[] PJ_CLASS_09_CD = ((params.containsKey("PJ_CLASS_09_CD")) ? (String[])params.get("PJ_CLASS_09_CD") : (String[])null);
		String[] PJ_CLASS_09_NAME = ((params.containsKey("PJ_CLASS_09_NAME")) ? (String[])params.get("PJ_CLASS_09_NAME") : (String[])null);
		String[] PJ_CLASS_10_TYP = ((params.containsKey("PJ_CLASS_10_TYP")) ? (String[])params.get("PJ_CLASS_10_TYP") : (String[])null);
		String[] PJ_CLASS_10_CD = ((params.containsKey("PJ_CLASS_10_CD")) ? (String[])params.get("PJ_CLASS_10_CD") : (String[])null);
		String[] PJ_CLASS_10_NAME = ((params.containsKey("PJ_CLASS_10_NAME")) ? (String[])params.get("PJ_CLASS_10_NAME") : (String[])null);
		String[] PJ_CLASS_11_TYP = ((params.containsKey("PJ_CLASS_11_TYP")) ? (String[])params.get("PJ_CLASS_11_TYP") : (String[])null);
		String[] PJ_CLASS_11_CD = ((params.containsKey("PJ_CLASS_11_CD")) ? (String[])params.get("PJ_CLASS_11_CD") : (String[])null);
		String[] PJ_CLASS_11_NAME = ((params.containsKey("PJ_CLASS_11_NAME")) ? (String[])params.get("PJ_CLASS_11_NAME") : (String[])null);
		String[] PJ_CLASS_12_TYP = ((params.containsKey("PJ_CLASS_12_TYP")) ? (String[])params.get("PJ_CLASS_12_TYP") : (String[])null);
		String[] PJ_CLASS_12_CD = ((params.containsKey("PJ_CLASS_12_CD")) ? (String[])params.get("PJ_CLASS_12_CD") : (String[])null);
		String[] PJ_CLASS_12_NAME = ((params.containsKey("PJ_CLASS_12_NAME")) ? (String[])params.get("PJ_CLASS_12_NAME") : (String[])null);
		String[] ASSUME_AMOUNT_EXCH_RATES = ((params.containsKey("ASSUME_AMOUNT_EXCH_RATES")) ? (String[])params.get("ASSUME_AMOUNT_EXCH_RATES") : (String[])null);
		String[] PROJECT_CD_FLG = ((params.containsKey("PROJECT_CD_FLG")) ? (String[])params.get("PROJECT_CD_FLG") : (String[])null);
		String[] h_MODIFY_COUNT = ((params.containsKey("h_MODIFY_COUNT")) ? (String[])params.get("h_MODIFY_COUNT") : (String[])null);
		String[] h_OD_COMP_FLG = ((params.containsKey("h_OD_COMP_FLG")) ? (String[])params.get("h_OD_COMP_FLG") : (String[])null);
		String[] h_PROJECT_STAT = ((params.containsKey("h_PROJECT_STAT")) ? (String[])params.get("h_PROJECT_STAT") : (String[])null);
		String[] h_ESTIMATE = ((params.containsKey("h_ESTIMATE")) ? (String[])params.get("h_ESTIMATE") : (String[])null);
		String[] h_COMPLETE_STAT = ((params.containsKey("h_COMPLETE_STAT")) ? (String[])params.get("h_COMPLETE_STAT") : (String[])null);

		struct.setPROJECT_CD( ((PROJECT_CD == null) ? (String)null : PROJECT_CD[0]) );
		struct.setList_PROJECT_CD(TypeConverter.convert(PROJECT_CD));
		struct.seth_PROJECT_CD( ((h_PROJECT_CD == null) ? (String)null : h_PROJECT_CD[0]) );
		struct.setList_h_PROJECT_CD(TypeConverter.convert(h_PROJECT_CD));
		struct.setPROJECT_NAME( ((PROJECT_NAME == null) ? (String)null : PROJECT_NAME[0]) );
		struct.setList_PROJECT_NAME(TypeConverter.convert(PROJECT_NAME));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.setCUST_NAME( ((CUST_NAME == null) ? (String)null : CUST_NAME[0]) );
		struct.setList_CUST_NAME(TypeConverter.convert(CUST_NAME));
		struct.setPROJECT_STAT( ((PROJECT_STAT == null) ? (String)null : PROJECT_STAT[0]) );
		struct.setList_PROJECT_STAT(TypeConverter.convert(PROJECT_STAT));
		struct.setPROJECT_STAT_name( ((PROJECT_STAT_name == null) ? (String)null : PROJECT_STAT_name[0]) );
		struct.setList_PROJECT_STAT_name(TypeConverter.convert(PROJECT_STAT_name));
		struct.setPROJECT_STAT_val( ((PROJECT_STAT_val == null) ? (String)null : PROJECT_STAT_val[0]) );
		struct.setList_PROJECT_STAT_val(TypeConverter.convert(PROJECT_STAT_val));
		struct.setCOMPLETE_STAT( ((COMPLETE_STAT == null) ? (String)null : COMPLETE_STAT[0]) );
		struct.setList_COMPLETE_STAT(TypeConverter.convert(COMPLETE_STAT));
		struct.setACCURACY_LEVEL( ((ACCURACY_LEVEL == null) ? (String)null : ACCURACY_LEVEL[0]) );
		struct.setList_ACCURACY_LEVEL(TypeConverter.convert(ACCURACY_LEVEL));
		struct.setACCURACY_LEVEL_name( ((ACCURACY_LEVEL_name == null) ? (String)null : ACCURACY_LEVEL_name[0]) );
		struct.setList_ACCURACY_LEVEL_name(TypeConverter.convert(ACCURACY_LEVEL_name));
		struct.setACCURACY_LEVEL_val( ((ACCURACY_LEVEL_val == null) ? (String)null : ACCURACY_LEVEL_val[0]) );
		struct.setList_ACCURACY_LEVEL_val(TypeConverter.convert(ACCURACY_LEVEL_val));
		struct.setVend_Date( ((Vend_Date == null) ? (String)null : Vend_Date[0]) );
		struct.setList_Vend_Date(TypeConverter.convert(Vend_Date));
		struct.setAssumeDlv_date( ((AssumeDlv_date == null) ? (String)null : AssumeDlv_date[0]) );
		struct.setList_AssumeDlv_date(TypeConverter.convert(AssumeDlv_date));
		struct.setAssumeAmount( ((AssumeAmount == null) ? (String)null : AssumeAmount[0]) );
		struct.setList_AssumeAmount(TypeConverter.convert(AssumeAmount));
		struct.setCurUnit( ((CurUnit == null) ? (String)null : CurUnit[0]) );
		struct.setList_CurUnit(TypeConverter.convert(CurUnit));
		struct.setDLV_LOC_CD( ((DLV_LOC_CD == null) ? (String)null : DLV_LOC_CD[0]) );
		struct.setList_DLV_LOC_CD(TypeConverter.convert(DLV_LOC_CD));
		struct.setDLV_LOC_NAME( ((DLV_LOC_NAME == null) ? (String)null : DLV_LOC_NAME[0]) );
		struct.setList_DLV_LOC_NAME(TypeConverter.convert(DLV_LOC_NAME));
		struct.setPJ_ORG_CD( ((PJ_ORG_CD == null) ? (String)null : PJ_ORG_CD[0]) );
		struct.setList_PJ_ORG_CD(TypeConverter.convert(PJ_ORG_CD));
		struct.setORG_NAME( ((ORG_NAME == null) ? (String)null : ORG_NAME[0]) );
		struct.setList_ORG_NAME(TypeConverter.convert(ORG_NAME));
		struct.setPJ_USER_CD( ((PJ_USER_CD == null) ? (String)null : PJ_USER_CD[0]) );
		struct.setList_PJ_USER_CD(TypeConverter.convert(PJ_USER_CD));
		struct.setUSER_NAME( ((USER_NAME == null) ? (String)null : USER_NAME[0]) );
		struct.setList_USER_NAME(TypeConverter.convert(USER_NAME));
		struct.setREMARKS1( ((REMARKS1 == null) ? (String)null : REMARKS1[0]) );
		struct.setList_REMARKS1(TypeConverter.convert(REMARKS1));
		struct.setREMARKS2( ((REMARKS2 == null) ? (String)null : REMARKS2[0]) );
		struct.setList_REMARKS2(TypeConverter.convert(REMARKS2));
		struct.setREMARKS3( ((REMARKS3 == null) ? (String)null : REMARKS3[0]) );
		struct.setList_REMARKS3(TypeConverter.convert(REMARKS3));
		struct.setREMARKS4( ((REMARKS4 == null) ? (String)null : REMARKS4[0]) );
		struct.setList_REMARKS4(TypeConverter.convert(REMARKS4));
		struct.setREMARKS5( ((REMARKS5 == null) ? (String)null : REMARKS5[0]) );
		struct.setList_REMARKS5(TypeConverter.convert(REMARKS5));
		struct.setOD_COMP_FLG( ((OD_COMP_FLG == null) ? (String)null : OD_COMP_FLG[0]) );
		struct.setList_OD_COMP_FLG(TypeConverter.convert(OD_COMP_FLG));
		struct.setPJ_CLASS_01_TYP( ((PJ_CLASS_01_TYP == null) ? (String)null : PJ_CLASS_01_TYP[0]) );
		struct.setList_PJ_CLASS_01_TYP(TypeConverter.convert(PJ_CLASS_01_TYP));
		struct.setPJ_CLASS_01_CD( ((PJ_CLASS_01_CD == null) ? (String)null : PJ_CLASS_01_CD[0]) );
		struct.setList_PJ_CLASS_01_CD(TypeConverter.convert(PJ_CLASS_01_CD));
		struct.setPJ_CLASS_01_NAME( ((PJ_CLASS_01_NAME == null) ? (String)null : PJ_CLASS_01_NAME[0]) );
		struct.setList_PJ_CLASS_01_NAME(TypeConverter.convert(PJ_CLASS_01_NAME));
		struct.setPJ_CLASS_02_TYP( ((PJ_CLASS_02_TYP == null) ? (String)null : PJ_CLASS_02_TYP[0]) );
		struct.setList_PJ_CLASS_02_TYP(TypeConverter.convert(PJ_CLASS_02_TYP));
		struct.setPJ_CLASS_02_CD( ((PJ_CLASS_02_CD == null) ? (String)null : PJ_CLASS_02_CD[0]) );
		struct.setList_PJ_CLASS_02_CD(TypeConverter.convert(PJ_CLASS_02_CD));
		struct.setPJ_CLASS_02_NAME( ((PJ_CLASS_02_NAME == null) ? (String)null : PJ_CLASS_02_NAME[0]) );
		struct.setList_PJ_CLASS_02_NAME(TypeConverter.convert(PJ_CLASS_02_NAME));
		struct.setPJ_CLASS_03_TYP( ((PJ_CLASS_03_TYP == null) ? (String)null : PJ_CLASS_03_TYP[0]) );
		struct.setList_PJ_CLASS_03_TYP(TypeConverter.convert(PJ_CLASS_03_TYP));
		struct.setPJ_CLASS_03_CD( ((PJ_CLASS_03_CD == null) ? (String)null : PJ_CLASS_03_CD[0]) );
		struct.setList_PJ_CLASS_03_CD(TypeConverter.convert(PJ_CLASS_03_CD));
		struct.setPJ_CLASS_03_NAME( ((PJ_CLASS_03_NAME == null) ? (String)null : PJ_CLASS_03_NAME[0]) );
		struct.setList_PJ_CLASS_03_NAME(TypeConverter.convert(PJ_CLASS_03_NAME));
		struct.setPJ_CLASS_04_TYP( ((PJ_CLASS_04_TYP == null) ? (String)null : PJ_CLASS_04_TYP[0]) );
		struct.setList_PJ_CLASS_04_TYP(TypeConverter.convert(PJ_CLASS_04_TYP));
		struct.setPJ_CLASS_04_CD( ((PJ_CLASS_04_CD == null) ? (String)null : PJ_CLASS_04_CD[0]) );
		struct.setList_PJ_CLASS_04_CD(TypeConverter.convert(PJ_CLASS_04_CD));
		struct.setPJ_CLASS_04_NAME( ((PJ_CLASS_04_NAME == null) ? (String)null : PJ_CLASS_04_NAME[0]) );
		struct.setList_PJ_CLASS_04_NAME(TypeConverter.convert(PJ_CLASS_04_NAME));
		struct.setPJ_CLASS_05_TYP( ((PJ_CLASS_05_TYP == null) ? (String)null : PJ_CLASS_05_TYP[0]) );
		struct.setList_PJ_CLASS_05_TYP(TypeConverter.convert(PJ_CLASS_05_TYP));
		struct.setPJ_CLASS_05_CD( ((PJ_CLASS_05_CD == null) ? (String)null : PJ_CLASS_05_CD[0]) );
		struct.setList_PJ_CLASS_05_CD(TypeConverter.convert(PJ_CLASS_05_CD));
		struct.setPJ_CLASS_05_NAME( ((PJ_CLASS_05_NAME == null) ? (String)null : PJ_CLASS_05_NAME[0]) );
		struct.setList_PJ_CLASS_05_NAME(TypeConverter.convert(PJ_CLASS_05_NAME));
		struct.setPJ_CLASS_06_TYP( ((PJ_CLASS_06_TYP == null) ? (String)null : PJ_CLASS_06_TYP[0]) );
		struct.setList_PJ_CLASS_06_TYP(TypeConverter.convert(PJ_CLASS_06_TYP));
		struct.setPJ_CLASS_06_CD( ((PJ_CLASS_06_CD == null) ? (String)null : PJ_CLASS_06_CD[0]) );
		struct.setList_PJ_CLASS_06_CD(TypeConverter.convert(PJ_CLASS_06_CD));
		struct.setPJ_CLASS_06_NAME( ((PJ_CLASS_06_NAME == null) ? (String)null : PJ_CLASS_06_NAME[0]) );
		struct.setList_PJ_CLASS_06_NAME(TypeConverter.convert(PJ_CLASS_06_NAME));
		struct.setPJ_CLASS_07_TYP( ((PJ_CLASS_07_TYP == null) ? (String)null : PJ_CLASS_07_TYP[0]) );
		struct.setList_PJ_CLASS_07_TYP(TypeConverter.convert(PJ_CLASS_07_TYP));
		struct.setPJ_CLASS_07_CD( ((PJ_CLASS_07_CD == null) ? (String)null : PJ_CLASS_07_CD[0]) );
		struct.setList_PJ_CLASS_07_CD(TypeConverter.convert(PJ_CLASS_07_CD));
		struct.setPJ_CLASS_07_NAME( ((PJ_CLASS_07_NAME == null) ? (String)null : PJ_CLASS_07_NAME[0]) );
		struct.setList_PJ_CLASS_07_NAME(TypeConverter.convert(PJ_CLASS_07_NAME));
		struct.setPJ_CLASS_08_TYP( ((PJ_CLASS_08_TYP == null) ? (String)null : PJ_CLASS_08_TYP[0]) );
		struct.setList_PJ_CLASS_08_TYP(TypeConverter.convert(PJ_CLASS_08_TYP));
		struct.setPJ_CLASS_08_CD( ((PJ_CLASS_08_CD == null) ? (String)null : PJ_CLASS_08_CD[0]) );
		struct.setList_PJ_CLASS_08_CD(TypeConverter.convert(PJ_CLASS_08_CD));
		struct.setPJ_CLASS_08_NAME( ((PJ_CLASS_08_NAME == null) ? (String)null : PJ_CLASS_08_NAME[0]) );
		struct.setList_PJ_CLASS_08_NAME(TypeConverter.convert(PJ_CLASS_08_NAME));
		struct.setPJ_CLASS_09_TYP( ((PJ_CLASS_09_TYP == null) ? (String)null : PJ_CLASS_09_TYP[0]) );
		struct.setList_PJ_CLASS_09_TYP(TypeConverter.convert(PJ_CLASS_09_TYP));
		struct.setPJ_CLASS_09_CD( ((PJ_CLASS_09_CD == null) ? (String)null : PJ_CLASS_09_CD[0]) );
		struct.setList_PJ_CLASS_09_CD(TypeConverter.convert(PJ_CLASS_09_CD));
		struct.setPJ_CLASS_09_NAME( ((PJ_CLASS_09_NAME == null) ? (String)null : PJ_CLASS_09_NAME[0]) );
		struct.setList_PJ_CLASS_09_NAME(TypeConverter.convert(PJ_CLASS_09_NAME));
		struct.setPJ_CLASS_10_TYP( ((PJ_CLASS_10_TYP == null) ? (String)null : PJ_CLASS_10_TYP[0]) );
		struct.setList_PJ_CLASS_10_TYP(TypeConverter.convert(PJ_CLASS_10_TYP));
		struct.setPJ_CLASS_10_CD( ((PJ_CLASS_10_CD == null) ? (String)null : PJ_CLASS_10_CD[0]) );
		struct.setList_PJ_CLASS_10_CD(TypeConverter.convert(PJ_CLASS_10_CD));
		struct.setPJ_CLASS_10_NAME( ((PJ_CLASS_10_NAME == null) ? (String)null : PJ_CLASS_10_NAME[0]) );
		struct.setList_PJ_CLASS_10_NAME(TypeConverter.convert(PJ_CLASS_10_NAME));
		struct.setPJ_CLASS_11_TYP( ((PJ_CLASS_11_TYP == null) ? (String)null : PJ_CLASS_11_TYP[0]) );
		struct.setList_PJ_CLASS_11_TYP(TypeConverter.convert(PJ_CLASS_11_TYP));
		struct.setPJ_CLASS_11_CD( ((PJ_CLASS_11_CD == null) ? (String)null : PJ_CLASS_11_CD[0]) );
		struct.setList_PJ_CLASS_11_CD(TypeConverter.convert(PJ_CLASS_11_CD));
		struct.setPJ_CLASS_11_NAME( ((PJ_CLASS_11_NAME == null) ? (String)null : PJ_CLASS_11_NAME[0]) );
		struct.setList_PJ_CLASS_11_NAME(TypeConverter.convert(PJ_CLASS_11_NAME));
		struct.setPJ_CLASS_12_TYP( ((PJ_CLASS_12_TYP == null) ? (String)null : PJ_CLASS_12_TYP[0]) );
		struct.setList_PJ_CLASS_12_TYP(TypeConverter.convert(PJ_CLASS_12_TYP));
		struct.setPJ_CLASS_12_CD( ((PJ_CLASS_12_CD == null) ? (String)null : PJ_CLASS_12_CD[0]) );
		struct.setList_PJ_CLASS_12_CD(TypeConverter.convert(PJ_CLASS_12_CD));
		struct.setPJ_CLASS_12_NAME( ((PJ_CLASS_12_NAME == null) ? (String)null : PJ_CLASS_12_NAME[0]) );
		struct.setList_PJ_CLASS_12_NAME(TypeConverter.convert(PJ_CLASS_12_NAME));
		struct.setASSUME_AMOUNT_EXCH_RATES( ((ASSUME_AMOUNT_EXCH_RATES == null) ? (String)null : ASSUME_AMOUNT_EXCH_RATES[0]) );
		struct.setList_ASSUME_AMOUNT_EXCH_RATES(TypeConverter.convert(ASSUME_AMOUNT_EXCH_RATES));
		struct.setPROJECT_CD_FLG( ((PROJECT_CD_FLG == null) ? (String)null : PROJECT_CD_FLG[0]) );
		struct.setList_PROJECT_CD_FLG(TypeConverter.convert(PROJECT_CD_FLG));
		struct.seth_MODIFY_COUNT( ((h_MODIFY_COUNT == null) ? (String)null : h_MODIFY_COUNT[0]) );
		struct.setList_h_MODIFY_COUNT(TypeConverter.convert(h_MODIFY_COUNT));
		struct.seth_OD_COMP_FLG( ((h_OD_COMP_FLG == null) ? (String)null : h_OD_COMP_FLG[0]) );
		struct.setList_h_OD_COMP_FLG(TypeConverter.convert(h_OD_COMP_FLG));
		struct.seth_PROJECT_STAT( ((h_PROJECT_STAT == null) ? (String)null : h_PROJECT_STAT[0]) );
		struct.setList_h_PROJECT_STAT(TypeConverter.convert(h_PROJECT_STAT));
		struct.seth_ESTIMATE( ((h_ESTIMATE == null) ? (String)null : h_ESTIMATE[0]) );
		struct.setList_h_ESTIMATE(TypeConverter.convert(h_ESTIMATE));
		struct.seth_COMPLETE_STAT( ((h_COMPLETE_STAT == null) ? (String)null : h_COMPLETE_STAT[0]) );
		struct.setList_h_COMPLETE_STAT(TypeConverter.convert(h_COMPLETE_STAT));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KM0010010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aKM0010010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aKM0010010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					KM0010010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0010010Entity entity = control.entity;
		KM0010010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KM0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KM0010010Control control;
		KM0010010Entity  entity = null;
		KM0010010Struct  struct = null;

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

			if( (control = (KM0010010Control)so.getAttribute("KM0010010Control_"+request.getSession(false).getId())) == null ) {
				control = new KM0010010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KM0010010Control();
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
				} else if( isClick(request, "insert") ) {
					if ( !isCryptical(request, so, params, "insert") ) return ERROR_TARGET;
					target = onClickinsert(request, response, so, params, control);
					control.setButton("insert");
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "delete") ) {
					if ( !isCryptical(request, so, params, "delete") ) return ERROR_TARGET;
					target = onClickdelete(request, response, so, params, control);
					control.setButton("delete");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KM0010010Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "select") && bFLG_DISCONNECT_select)
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "delete") && bFLG_DISCONNECT_delete)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
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
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_delete = true;
	private  static boolean bFLG_DISCONNECT_clear = true;

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
		return "com.nec.jp.orteus.metamorBase.KM0010.KM0010010Servlet";
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
	public KM0010010Servlet()
	{
		//{{user_implement_dev:<KM0010010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_insert = true;
		bFLG_DISCONNECT_update = true;
		bFLG_DISCONNECT_delete = true;
		bFLG_DISCONNECT_clear = true;

                //}}user_implement_dev:<KM0010010_DisConnect_FLG>

		//{{user_implement_dev:<KM0010010Servlet>
//			bFLG_CSRF = false; // CSRF�̂��߂̔�����s��Ȃ��ꍇ�́A�R�����g�A�E�g���͂����Ă�������

			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<KM0010010Servlet>
	}

	//////////////////////////////

}
