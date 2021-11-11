/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0040/src/com/nec/jp/orteus/metamorBase/KM0040/KM0040010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0040;

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
 * CLASS     : KM0040010Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KM0040010Servlet extends HttpServlet
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
	 * @param control KM0040010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, KM0040010Control control)
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
	 * @param control KM0040010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, KM0040010Control control)
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
	 * @param control KM0040010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
			logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			LogWriter.write( Level.ALL, "KM0040010"+" $Revision: 1.1 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KM0040010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KM0040010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0040010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0040010Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0040010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * ���ϓo�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0040010Control�N���X�C���X�^���X
	 */
	public String onClickGoSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub1");
		//{{user_implement_dev:<onClickGoSub1>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("GoSub1");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickGoSub1>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub1");

		return nextUrl;
	}

	/**
	 * �Č��i���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0040010Control�N���X�C���X�^���X
	 */
	public String onClickGoSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub2");
		//{{user_implement_dev:<onClickGoSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("GoSub2");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickGoSub2>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub2");

		return nextUrl;
	}

	/**
	 * �Č��󒍓o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0040010Control�N���X�C���X�^���X
	 */
	public String onClickGoSub3(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub3");
		//{{user_implement_dev:<onClickGoSub3>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("GoSub3");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickGoSub3>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickGoSub3");

		return nextUrl;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KM0040010Control�N���X�C���X�^���X
	 */
	public String onClickCSVOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KM0040010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickCSVOut");
		//{{user_implement_dev:<onClickCSVOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CSVOut");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCSVOut>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"onClickCSVOut");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KM0040010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] IN_PROJECT_CD = ((params.containsKey("IN_PROJECT_CD")) ? (String[])params.get("IN_PROJECT_CD") : (String[])null);
		String[] CHECK_1 = ((params.containsKey("CHECK_1")) ? (String[])params.get("CHECK_1") : (String[])null);
		String[] IN_CUST_CD = ((params.containsKey("IN_CUST_CD")) ? (String[])params.get("IN_CUST_CD") : (String[])null);
		String[] C1_PROJECT_STAT = ((params.containsKey("C1_PROJECT_STAT")) ? (String[])params.get("C1_PROJECT_STAT") : (String[])null);
		String[] C2_PROJECT_STAT = ((params.containsKey("C2_PROJECT_STAT")) ? (String[])params.get("C2_PROJECT_STAT") : (String[])null);
		String[] C3_PROJECT_STAT = ((params.containsKey("C3_PROJECT_STAT")) ? (String[])params.get("C3_PROJECT_STAT") : (String[])null);
		String[] C4_PROJECT_STAT = ((params.containsKey("C4_PROJECT_STAT")) ? (String[])params.get("C4_PROJECT_STAT") : (String[])null);
		String[] C5_PROJECT_STAT = ((params.containsKey("C5_PROJECT_STAT")) ? (String[])params.get("C5_PROJECT_STAT") : (String[])null);
		String[] PROJECT_CD = ((params.containsKey("PROJECT_CD")) ? (String[])params.get("PROJECT_CD") : (String[])null);
		String[] PROJECT_NAME = ((params.containsKey("PROJECT_NAME")) ? (String[])params.get("PROJECT_NAME") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] CUST_NAME = ((params.containsKey("CUST_NAME")) ? (String[])params.get("CUST_NAME") : (String[])null);
		String[] PROJECT_STAT = ((params.containsKey("PROJECT_STAT")) ? (String[])params.get("PROJECT_STAT") : (String[])null);
		String[] DLV_LOC_CD = ((params.containsKey("DLV_LOC_CD")) ? (String[])params.get("DLV_LOC_CD") : (String[])null);
		String[] ESTIMATE_NO = ((params.containsKey("ESTIMATE_NO")) ? (String[])params.get("ESTIMATE_NO") : (String[])null);
		String[] TXT_FILE = ((params.containsKey("TXT_FILE")) ? (String[])params.get("TXT_FILE") : (String[])null);
		String[] IN_ES_USER_CD = ((params.containsKey("IN_ES_USER_CD")) ? (String[])params.get("IN_ES_USER_CD") : (String[])null);
		String[] FROM_ASSUME_DLV_DATE = ((params.containsKey("FROM_ASSUME_DLV_DATE")) ? (String[])params.get("FROM_ASSUME_DLV_DATE") : (String[])null);
		String[] TO_ASSUME_DLV_DATE = ((params.containsKey("TO_ASSUME_DLV_DATE")) ? (String[])params.get("TO_ASSUME_DLV_DATE") : (String[])null);
		String[] VEND_DATE = ((params.containsKey("VEND_DATE")) ? (String[])params.get("VEND_DATE") : (String[])null);
		String[] ASSUME_DLV_DATE = ((params.containsKey("ASSUME_DLV_DATE")) ? (String[])params.get("ASSUME_DLV_DATE") : (String[])null);
		String[] ASSUME_AMOUNT = ((params.containsKey("ASSUME_AMOUNT")) ? (String[])params.get("ASSUME_AMOUNT") : (String[])null);
		String[] CUR_UNIT = ((params.containsKey("CUR_UNIT")) ? (String[])params.get("CUR_UNIT") : (String[])null);
		String[] ASSUME_AMOUNT_EXCH_RATES = ((params.containsKey("ASSUME_AMOUNT_EXCH_RATES")) ? (String[])params.get("ASSUME_AMOUNT_EXCH_RATES") : (String[])null);
		String[] PJ_ORG_CD = ((params.containsKey("PJ_ORG_CD")) ? (String[])params.get("PJ_ORG_CD") : (String[])null);
		String[] PJ_USER_CD = ((params.containsKey("PJ_USER_CD")) ? (String[])params.get("PJ_USER_CD") : (String[])null);
		String[] REMARKS1 = ((params.containsKey("REMARKS1")) ? (String[])params.get("REMARKS1") : (String[])null);
		String[] REMARKS2 = ((params.containsKey("REMARKS2")) ? (String[])params.get("REMARKS2") : (String[])null);
		String[] REMARKS3 = ((params.containsKey("REMARKS3")) ? (String[])params.get("REMARKS3") : (String[])null);
		String[] REMARKS4 = ((params.containsKey("REMARKS4")) ? (String[])params.get("REMARKS4") : (String[])null);
		String[] REMARKS5 = ((params.containsKey("REMARKS5")) ? (String[])params.get("REMARKS5") : (String[])null);
		String[] ESTIMATE_STAT = ((params.containsKey("ESTIMATE_STAT")) ? (String[])params.get("ESTIMATE_STAT") : (String[])null);
		String[] ES_COMMET1 = ((params.containsKey("ES_COMMET1")) ? (String[])params.get("ES_COMMET1") : (String[])null);
		String[] ES_COMMET2 = ((params.containsKey("ES_COMMET2")) ? (String[])params.get("ES_COMMET2") : (String[])null);
		String[] ES_COMMET3 = ((params.containsKey("ES_COMMET3")) ? (String[])params.get("ES_COMMET3") : (String[])null);
		String[] ES_COMMET4 = ((params.containsKey("ES_COMMET4")) ? (String[])params.get("ES_COMMET4") : (String[])null);
		String[] ES_COMMET5 = ((params.containsKey("ES_COMMET5")) ? (String[])params.get("ES_COMMET5") : (String[])null);
		String[] ES_ORG_CD = ((params.containsKey("ES_ORG_CD")) ? (String[])params.get("ES_ORG_CD") : (String[])null);
		String[] ES_USER_CD = ((params.containsKey("ES_USER_CD")) ? (String[])params.get("ES_USER_CD") : (String[])null);
		String[] ESTIMATE_AMOUNT = ((params.containsKey("ESTIMATE_AMOUNT")) ? (String[])params.get("ESTIMATE_AMOUNT") : (String[])null);
		String[] ESTIMATE_AMOUNT_JPN = ((params.containsKey("ESTIMATE_AMOUNT_JPN")) ? (String[])params.get("ESTIMATE_AMOUNT_JPN") : (String[])null);
		String[] ESREMARK1 = ((params.containsKey("ESREMARK1")) ? (String[])params.get("ESREMARK1") : (String[])null);
		String[] ESREMARK2 = ((params.containsKey("ESREMARK2")) ? (String[])params.get("ESREMARK2") : (String[])null);
		String[] ESREMARK3 = ((params.containsKey("ESREMARK3")) ? (String[])params.get("ESREMARK3") : (String[])null);
		String[] IN_PJ_USER_CD = ((params.containsKey("IN_PJ_USER_CD")) ? (String[])params.get("IN_PJ_USER_CD") : (String[])null);
		String[] IN_PJ_USER_NAME = ((params.containsKey("IN_PJ_USER_NAME")) ? (String[])params.get("IN_PJ_USER_NAME") : (String[])null);
		String[] IN_ES_USER_NAME = ((params.containsKey("IN_ES_USER_NAME")) ? (String[])params.get("IN_ES_USER_NAME") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] ACCURACY = ((params.containsKey("ACCURACY")) ? (String[])params.get("ACCURACY") : (String[])null);
		String[] FROM_ESTIMATE_DATE = ((params.containsKey("FROM_ESTIMATE_DATE")) ? (String[])params.get("FROM_ESTIMATE_DATE") : (String[])null);
		String[] TO_ESTIMATE_DATE = ((params.containsKey("TO_ESTIMATE_DATE")) ? (String[])params.get("TO_ESTIMATE_DATE") : (String[])null);
		String[] ESTIMATE_DATE = ((params.containsKey("ESTIMATE_DATE")) ? (String[])params.get("ESTIMATE_DATE") : (String[])null);
		String[] ORG_NAME_1 = ((params.containsKey("ORG_NAME_1")) ? (String[])params.get("ORG_NAME_1") : (String[])null);
		String[] USER_NAME_1 = ((params.containsKey("USER_NAME_1")) ? (String[])params.get("USER_NAME_1") : (String[])null);
		String[] ORG_NAME_2 = ((params.containsKey("ORG_NAME_2")) ? (String[])params.get("ORG_NAME_2") : (String[])null);
		String[] USER_NAME_2 = ((params.containsKey("USER_NAME_2")) ? (String[])params.get("USER_NAME_2") : (String[])null);
		String[] DLV_LOC_NAME = ((params.containsKey("DLV_LOC_NAME")) ? (String[])params.get("DLV_LOC_NAME") : (String[])null);
		String[] I_PROJECT_STAT = ((params.containsKey("I_PROJECT_STAT")) ? (String[])params.get("I_PROJECT_STAT") : (String[])null);
		String[] FROM_VEND_DATE = ((params.containsKey("FROM_VEND_DATE")) ? (String[])params.get("FROM_VEND_DATE") : (String[])null);
		String[] TO_VEND_DATE = ((params.containsKey("TO_VEND_DATE")) ? (String[])params.get("TO_VEND_DATE") : (String[])null);
		String[] C6_PROJECT_STAT = ((params.containsKey("C6_PROJECT_STAT")) ? (String[])params.get("C6_PROJECT_STAT") : (String[])null);

		struct.setIN_PROJECT_CD( ((IN_PROJECT_CD == null) ? (String)null : IN_PROJECT_CD[0]) );
		struct.setList_IN_PROJECT_CD(TypeConverter.convert(IN_PROJECT_CD));
		struct.setCHECK_1( ((CHECK_1 == null) ? (String)null : CHECK_1[0]) );
		struct.setList_CHECK_1(TypeConverter.convert(CHECK_1));
		struct.setIN_CUST_CD( ((IN_CUST_CD == null) ? (String)null : IN_CUST_CD[0]) );
		struct.setList_IN_CUST_CD(TypeConverter.convert(IN_CUST_CD));
		struct.setC1_PROJECT_STAT( ((C1_PROJECT_STAT == null) ? (String)null : C1_PROJECT_STAT[0]) );
		struct.setList_C1_PROJECT_STAT(TypeConverter.convert(C1_PROJECT_STAT));
		struct.setC2_PROJECT_STAT( ((C2_PROJECT_STAT == null) ? (String)null : C2_PROJECT_STAT[0]) );
		struct.setList_C2_PROJECT_STAT(TypeConverter.convert(C2_PROJECT_STAT));
		struct.setC3_PROJECT_STAT( ((C3_PROJECT_STAT == null) ? (String)null : C3_PROJECT_STAT[0]) );
		struct.setList_C3_PROJECT_STAT(TypeConverter.convert(C3_PROJECT_STAT));
		struct.setC4_PROJECT_STAT( ((C4_PROJECT_STAT == null) ? (String)null : C4_PROJECT_STAT[0]) );
		struct.setList_C4_PROJECT_STAT(TypeConverter.convert(C4_PROJECT_STAT));
		struct.setC5_PROJECT_STAT( ((C5_PROJECT_STAT == null) ? (String)null : C5_PROJECT_STAT[0]) );
		struct.setList_C5_PROJECT_STAT(TypeConverter.convert(C5_PROJECT_STAT));
		struct.setPROJECT_CD( ((PROJECT_CD == null) ? (String)null : PROJECT_CD[0]) );
		struct.setList_PROJECT_CD(TypeConverter.convert(PROJECT_CD));
		struct.setPROJECT_NAME( ((PROJECT_NAME == null) ? (String)null : PROJECT_NAME[0]) );
		struct.setList_PROJECT_NAME(TypeConverter.convert(PROJECT_NAME));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.setCUST_NAME( ((CUST_NAME == null) ? (String)null : CUST_NAME[0]) );
		struct.setList_CUST_NAME(TypeConverter.convert(CUST_NAME));
		struct.setPROJECT_STAT( ((PROJECT_STAT == null) ? (String)null : PROJECT_STAT[0]) );
		struct.setList_PROJECT_STAT(TypeConverter.convert(PROJECT_STAT));
		struct.setDLV_LOC_CD( ((DLV_LOC_CD == null) ? (String)null : DLV_LOC_CD[0]) );
		struct.setList_DLV_LOC_CD(TypeConverter.convert(DLV_LOC_CD));
		struct.setESTIMATE_NO( ((ESTIMATE_NO == null) ? (String)null : ESTIMATE_NO[0]) );
		struct.setList_ESTIMATE_NO(TypeConverter.convert(ESTIMATE_NO));
		struct.setTXT_FILE( ((TXT_FILE == null) ? (String)null : TXT_FILE[0]) );
		struct.setList_TXT_FILE(TypeConverter.convert(TXT_FILE));
		struct.setIN_ES_USER_CD( ((IN_ES_USER_CD == null) ? (String)null : IN_ES_USER_CD[0]) );
		struct.setList_IN_ES_USER_CD(TypeConverter.convert(IN_ES_USER_CD));
		struct.setFROM_ASSUME_DLV_DATE( ((FROM_ASSUME_DLV_DATE == null) ? (String)null : FROM_ASSUME_DLV_DATE[0]) );
		struct.setList_FROM_ASSUME_DLV_DATE(TypeConverter.convert(FROM_ASSUME_DLV_DATE));
		struct.setTO_ASSUME_DLV_DATE( ((TO_ASSUME_DLV_DATE == null) ? (String)null : TO_ASSUME_DLV_DATE[0]) );
		struct.setList_TO_ASSUME_DLV_DATE(TypeConverter.convert(TO_ASSUME_DLV_DATE));
		struct.setVEND_DATE( ((VEND_DATE == null) ? (String)null : VEND_DATE[0]) );
		struct.setList_VEND_DATE(TypeConverter.convert(VEND_DATE));
		struct.setASSUME_DLV_DATE( ((ASSUME_DLV_DATE == null) ? (String)null : ASSUME_DLV_DATE[0]) );
		struct.setList_ASSUME_DLV_DATE(TypeConverter.convert(ASSUME_DLV_DATE));
		struct.setASSUME_AMOUNT( ((ASSUME_AMOUNT == null) ? (String)null : ASSUME_AMOUNT[0]) );
		struct.setList_ASSUME_AMOUNT(TypeConverter.convert(ASSUME_AMOUNT));
		struct.setCUR_UNIT( ((CUR_UNIT == null) ? (String)null : CUR_UNIT[0]) );
		struct.setList_CUR_UNIT(TypeConverter.convert(CUR_UNIT));
		struct.setASSUME_AMOUNT_EXCH_RATES( ((ASSUME_AMOUNT_EXCH_RATES == null) ? (String)null : ASSUME_AMOUNT_EXCH_RATES[0]) );
		struct.setList_ASSUME_AMOUNT_EXCH_RATES(TypeConverter.convert(ASSUME_AMOUNT_EXCH_RATES));
		struct.setPJ_ORG_CD( ((PJ_ORG_CD == null) ? (String)null : PJ_ORG_CD[0]) );
		struct.setList_PJ_ORG_CD(TypeConverter.convert(PJ_ORG_CD));
		struct.setPJ_USER_CD( ((PJ_USER_CD == null) ? (String)null : PJ_USER_CD[0]) );
		struct.setList_PJ_USER_CD(TypeConverter.convert(PJ_USER_CD));
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
		struct.setESTIMATE_STAT( ((ESTIMATE_STAT == null) ? (String)null : ESTIMATE_STAT[0]) );
		struct.setList_ESTIMATE_STAT(TypeConverter.convert(ESTIMATE_STAT));
		struct.setES_COMMET1( ((ES_COMMET1 == null) ? (String)null : ES_COMMET1[0]) );
		struct.setList_ES_COMMET1(TypeConverter.convert(ES_COMMET1));
		struct.setES_COMMET2( ((ES_COMMET2 == null) ? (String)null : ES_COMMET2[0]) );
		struct.setList_ES_COMMET2(TypeConverter.convert(ES_COMMET2));
		struct.setES_COMMET3( ((ES_COMMET3 == null) ? (String)null : ES_COMMET3[0]) );
		struct.setList_ES_COMMET3(TypeConverter.convert(ES_COMMET3));
		struct.setES_COMMET4( ((ES_COMMET4 == null) ? (String)null : ES_COMMET4[0]) );
		struct.setList_ES_COMMET4(TypeConverter.convert(ES_COMMET4));
		struct.setES_COMMET5( ((ES_COMMET5 == null) ? (String)null : ES_COMMET5[0]) );
		struct.setList_ES_COMMET5(TypeConverter.convert(ES_COMMET5));
		struct.setES_ORG_CD( ((ES_ORG_CD == null) ? (String)null : ES_ORG_CD[0]) );
		struct.setList_ES_ORG_CD(TypeConverter.convert(ES_ORG_CD));
		struct.setES_USER_CD( ((ES_USER_CD == null) ? (String)null : ES_USER_CD[0]) );
		struct.setList_ES_USER_CD(TypeConverter.convert(ES_USER_CD));
		struct.setESTIMATE_AMOUNT( ((ESTIMATE_AMOUNT == null) ? (String)null : ESTIMATE_AMOUNT[0]) );
		struct.setList_ESTIMATE_AMOUNT(TypeConverter.convert(ESTIMATE_AMOUNT));
		struct.setESTIMATE_AMOUNT_JPN( ((ESTIMATE_AMOUNT_JPN == null) ? (String)null : ESTIMATE_AMOUNT_JPN[0]) );
		struct.setList_ESTIMATE_AMOUNT_JPN(TypeConverter.convert(ESTIMATE_AMOUNT_JPN));
		struct.setESREMARK1( ((ESREMARK1 == null) ? (String)null : ESREMARK1[0]) );
		struct.setList_ESREMARK1(TypeConverter.convert(ESREMARK1));
		struct.setESREMARK2( ((ESREMARK2 == null) ? (String)null : ESREMARK2[0]) );
		struct.setList_ESREMARK2(TypeConverter.convert(ESREMARK2));
		struct.setESREMARK3( ((ESREMARK3 == null) ? (String)null : ESREMARK3[0]) );
		struct.setList_ESREMARK3(TypeConverter.convert(ESREMARK3));
		struct.setIN_PJ_USER_CD( ((IN_PJ_USER_CD == null) ? (String)null : IN_PJ_USER_CD[0]) );
		struct.setList_IN_PJ_USER_CD(TypeConverter.convert(IN_PJ_USER_CD));
		struct.setIN_PJ_USER_NAME( ((IN_PJ_USER_NAME == null) ? (String)null : IN_PJ_USER_NAME[0]) );
		struct.setList_IN_PJ_USER_NAME(TypeConverter.convert(IN_PJ_USER_NAME));
		struct.setIN_ES_USER_NAME( ((IN_ES_USER_NAME == null) ? (String)null : IN_ES_USER_NAME[0]) );
		struct.setList_IN_ES_USER_NAME(TypeConverter.convert(IN_ES_USER_NAME));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setACCURACY( ((ACCURACY == null) ? (String)null : ACCURACY[0]) );
		struct.setList_ACCURACY(TypeConverter.convert(ACCURACY));
		struct.setFROM_ESTIMATE_DATE( ((FROM_ESTIMATE_DATE == null) ? (String)null : FROM_ESTIMATE_DATE[0]) );
		struct.setList_FROM_ESTIMATE_DATE(TypeConverter.convert(FROM_ESTIMATE_DATE));
		struct.setTO_ESTIMATE_DATE( ((TO_ESTIMATE_DATE == null) ? (String)null : TO_ESTIMATE_DATE[0]) );
		struct.setList_TO_ESTIMATE_DATE(TypeConverter.convert(TO_ESTIMATE_DATE));
		struct.setESTIMATE_DATE( ((ESTIMATE_DATE == null) ? (String)null : ESTIMATE_DATE[0]) );
		struct.setList_ESTIMATE_DATE(TypeConverter.convert(ESTIMATE_DATE));
		struct.setORG_NAME_1( ((ORG_NAME_1 == null) ? (String)null : ORG_NAME_1[0]) );
		struct.setList_ORG_NAME_1(TypeConverter.convert(ORG_NAME_1));
		struct.setUSER_NAME_1( ((USER_NAME_1 == null) ? (String)null : USER_NAME_1[0]) );
		struct.setList_USER_NAME_1(TypeConverter.convert(USER_NAME_1));
		struct.setORG_NAME_2( ((ORG_NAME_2 == null) ? (String)null : ORG_NAME_2[0]) );
		struct.setList_ORG_NAME_2(TypeConverter.convert(ORG_NAME_2));
		struct.setUSER_NAME_2( ((USER_NAME_2 == null) ? (String)null : USER_NAME_2[0]) );
		struct.setList_USER_NAME_2(TypeConverter.convert(USER_NAME_2));
		struct.setDLV_LOC_NAME( ((DLV_LOC_NAME == null) ? (String)null : DLV_LOC_NAME[0]) );
		struct.setList_DLV_LOC_NAME(TypeConverter.convert(DLV_LOC_NAME));
		struct.setI_PROJECT_STAT( ((I_PROJECT_STAT == null) ? (String)null : I_PROJECT_STAT[0]) );
		struct.setList_I_PROJECT_STAT(TypeConverter.convert(I_PROJECT_STAT));
		struct.setFROM_VEND_DATE( ((FROM_VEND_DATE == null) ? (String)null : FROM_VEND_DATE[0]) );
		struct.setList_FROM_VEND_DATE(TypeConverter.convert(FROM_VEND_DATE));
		struct.setTO_VEND_DATE( ((TO_VEND_DATE == null) ? (String)null : TO_VEND_DATE[0]) );
		struct.setList_TO_VEND_DATE(TypeConverter.convert(TO_VEND_DATE));
		struct.setC6_PROJECT_STAT( ((C6_PROJECT_STAT == null) ? (String)null : C6_PROJECT_STAT[0]) );
		struct.setList_C6_PROJECT_STAT(TypeConverter.convert(C6_PROJECT_STAT));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KM0040010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aKM0040010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aKM0040010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					KM0040010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KM0040010Entity entity = control.entity;
		KM0040010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0040");
		logger.entering("KM0040010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KM0040010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KM0040010Control control;
		KM0040010Entity  entity = null;
		KM0040010Struct  struct = null;

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

			if( (control = (KM0040010Control)so.getAttribute("KM0040010Control_"+request.getSession(false).getId())) == null ) {
				control = new KM0040010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KM0040010Control();
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
				if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "Select") ) {
					if ( !isCryptical(request, so, params, "Select") ) return ERROR_TARGET;
					target = onClickSelect(request, response, so, params, control);
					control.setButton("Select");
				} else if( isClick(request, "GoSub1") ) {
					if ( !isCryptical(request, so, params, "GoSub1") ) return ERROR_TARGET;
					target = onClickGoSub1(request, response, so, params, control);
					control.setButton("GoSub1");
				} else if( isClick(request, "GoSub2") ) {
					if ( !isCryptical(request, so, params, "GoSub2") ) return ERROR_TARGET;
					target = onClickGoSub2(request, response, so, params, control);
					control.setButton("GoSub2");
				} else if( isClick(request, "GoSub3") ) {
					if ( !isCryptical(request, so, params, "GoSub3") ) return ERROR_TARGET;
					target = onClickGoSub3(request, response, so, params, control);
					control.setButton("GoSub3");
				} else if( isClick(request, "CSVOut") ) {
					if ( !isCryptical(request, so, params, "CSVOut") ) return ERROR_TARGET;
					target = onClickCSVOut(request, response, so, params, control);
					control.setButton("CSVOut");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KM0040010Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "Select") && bFLG_DISCONNECT_Select)
				|| (isClick(request, "GoSub1") && bFLG_DISCONNECT_GoSub1)
				|| (isClick(request, "GoSub2") && bFLG_DISCONNECT_GoSub2)
				|| (isClick(request, "GoSub3") && bFLG_DISCONNECT_GoSub3)
				|| (isClick(request, "CSVOut") && bFLG_DISCONNECT_CSVOut)
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
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_Select = true;
	private  static boolean bFLG_DISCONNECT_GoSub1 = true;
	private  static boolean bFLG_DISCONNECT_GoSub2 = true;
	private  static boolean bFLG_DISCONNECT_GoSub3 = true;
	private  static boolean bFLG_DISCONNECT_CSVOut = true;

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
		return "com.nec.jp.orteus.metamorBase.KM0040.KM0040010Servlet";
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
	public KM0040010Servlet()
	{
		//{{user_implement_dev:<KM0040010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<KM0040010_DisConnect_FLG>

		//{{user_implement_dev:<KM0040010Servlet>
//			bFLG_CSRF = false; // CSRF�̂��߂̔�����s��Ȃ��ꍇ�́A�R�����g�A�E�g���͂����Ă�������

			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<KM0040010Servlet>
	}

	//////////////////////////////

}
