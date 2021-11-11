/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0060/src/com/nec/jp/orteus/metamorBase/KR0060/KR0060010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0060;

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
 * CLASS     : KR0060010Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KR0060010Servlet extends HttpServlet
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
	 * @param control KR0060010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, KR0060010Control control)
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
	 * @param control KR0060010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, KR0060010Control control)
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
	 * @param control KR0060010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KR0060010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KR0060010Entity entity = control.entity;
		KR0060010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
			logger.entering("KR0060010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			LogWriter.write( Level.ALL, "KR0060010"+" $Revision: 1.8 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KR0060010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KR0060010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KR0060010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KR0060010Entity entity = control.entity;
		KR0060010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KR0060010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KR0060010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KR0060010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KR0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KR0060010Entity entity = control.entity;
		KR0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �I���X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KR0060010Control�N���X�C���X�^���X
	 */
	public String onClickUpdateAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KR0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KR0060010Entity entity = control.entity;
		KR0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdateAssort");
		//{{user_implement_dev:<onClickUpdateAssort>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("UpdateAssort");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickUpdateAssort>
		logger.exiting("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdateAssort");

		return nextUrl;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KR0060010Control�N���X�C���X�^���X
	 */
	public String onClickCheckAll(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KR0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KR0060010Entity entity = control.entity;
		KR0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickCheckAll");
		//{{user_implement_dev:<onClickCheckAll>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CheckAll");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCheckAll>
		logger.exiting("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickCheckAll");

		return nextUrl;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KR0060010Control�N���X�C���X�^���X
	 */
	public String onClickCheckClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KR0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KR0060010Entity entity = control.entity;
		KR0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickCheckClear");
		//{{user_implement_dev:<onClickCheckClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CheckClear");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCheckClear>
		logger.exiting("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickCheckClear");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KR0060010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KR0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KR0060010Entity entity = control.entity;
		KR0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KR0060010Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KR0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KR0060010Entity entity = control.entity;
		KR0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * ������юQ�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KR0060010Control�N���X�C���X�^���X
	 */
	public String onClickAppr_Hty_Rep(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KR0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KR0060010Entity entity = control.entity;
		KR0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickAppr_Hty_Rep");
		//{{user_implement_dev:<onClickAppr_Hty_Rep>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Appr_Hty_Rep");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickAppr_Hty_Rep>
		logger.exiting("KR0060010Servlet"+":USER="+request.getRemoteUser(),"onClickAppr_Hty_Rep");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KR0060010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] r_APPR_1 = ((params.containsKey("r_APPR_1")) ? (String[])params.get("r_APPR_1") : (String[])null);
		String[] r_APPR_2 = ((params.containsKey("r_APPR_2")) ? (String[])params.get("r_APPR_2") : (String[])null);
		String[] r_APPR_3 = ((params.containsKey("r_APPR_3")) ? (String[])params.get("r_APPR_3") : (String[])null);
		String[] r_APPR_4 = ((params.containsKey("r_APPR_4")) ? (String[])params.get("r_APPR_4") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] CUST_NAME = ((params.containsKey("CUST_NAME")) ? (String[])params.get("CUST_NAME") : (String[])null);
		String[] h_APPR_POWER_TYP = ((params.containsKey("h_APPR_POWER_TYP")) ? (String[])params.get("h_APPR_POWER_TYP") : (String[])null);
		String[] SALES_DATE_FROM = ((params.containsKey("SALES_DATE_FROM")) ? (String[])params.get("SALES_DATE_FROM") : (String[])null);
		String[] SALES_DATE_TO = ((params.containsKey("SALES_DATE_TO")) ? (String[])params.get("SALES_DATE_TO") : (String[])null);
		String[] RESERVE_CAUSE = ((params.containsKey("RESERVE_CAUSE")) ? (String[])params.get("RESERVE_CAUSE") : (String[])null);
		String[] l_APPR_ID = ((params.containsKey("l_APPR_ID")) ? (String[])params.get("l_APPR_ID") : (String[])null);
		String[] l_APPR_DATE = ((params.containsKey("l_APPR_DATE")) ? (String[])params.get("l_APPR_DATE") : (String[])null);
		String[] l_RESERVE_CAUSE = ((params.containsKey("l_RESERVE_CAUSE")) ? (String[])params.get("l_RESERVE_CAUSE") : (String[])null);
		String[] l_SHIP_ODR_NO = ((params.containsKey("l_SHIP_ODR_NO")) ? (String[])params.get("l_SHIP_ODR_NO") : (String[])null);
		String[] l_SLIP_CD = ((params.containsKey("l_SLIP_CD")) ? (String[])params.get("l_SLIP_CD") : (String[])null);
		String[] l_SALES_TYP = ((params.containsKey("l_SALES_TYP")) ? (String[])params.get("l_SALES_TYP") : (String[])null);
		String[] l_CUST_CD = ((params.containsKey("l_CUST_CD")) ? (String[])params.get("l_CUST_CD") : (String[])null);
		String[] l_CUST_NAME = ((params.containsKey("l_CUST_NAME")) ? (String[])params.get("l_CUST_NAME") : (String[])null);
		String[] l_SALES_DEPT_CD = ((params.containsKey("l_SALES_DEPT_CD")) ? (String[])params.get("l_SALES_DEPT_CD") : (String[])null);
		String[] l_ORG_NAME = ((params.containsKey("l_ORG_NAME")) ? (String[])params.get("l_ORG_NAME") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_CUST_ODR_NO = ((params.containsKey("l_CUST_ODR_NO")) ? (String[])params.get("l_CUST_ODR_NO") : (String[])null);
		String[] l_SALES_DATE = ((params.containsKey("l_SALES_DATE")) ? (String[])params.get("l_SALES_DATE") : (String[])null);
		String[] l_CUST_CHRG_PSN_CD = ((params.containsKey("l_CUST_CHRG_PSN_CD")) ? (String[])params.get("l_CUST_CHRG_PSN_CD") : (String[])null);
		String[] l_CUST_CHRG_PSN_NAME = ((params.containsKey("l_CUST_CHRG_PSN_NAME")) ? (String[])params.get("l_CUST_CHRG_PSN_NAME") : (String[])null);
		String[] l_ODR_ACPT_PSN_CD = ((params.containsKey("l_ODR_ACPT_PSN_CD")) ? (String[])params.get("l_ODR_ACPT_PSN_CD") : (String[])null);
		String[] l_ODR_ACPT_PSN_NAME = ((params.containsKey("l_ODR_ACPT_PSN_NAME")) ? (String[])params.get("l_ODR_ACPT_PSN_NAME") : (String[])null);
		String[] l_SALES_QTY = ((params.containsKey("l_SALES_QTY")) ? (String[])params.get("l_SALES_QTY") : (String[])null);
		String[] l_UNIT_COST = ((params.containsKey("l_UNIT_COST")) ? (String[])params.get("l_UNIT_COST") : (String[])null);
		String[] l_SALES_AMOUNT = ((params.containsKey("l_SALES_AMOUNT")) ? (String[])params.get("l_SALES_AMOUNT") : (String[])null);
		String[] l_SALES_AMOUNT_EXCH_RATES = ((params.containsKey("l_SALES_AMOUNT_EXCH_RATES")) ? (String[])params.get("l_SALES_AMOUNT_EXCH_RATES") : (String[])null);
		String[] l_INSPC_ACPT_DATE = ((params.containsKey("l_INSPC_ACPT_DATE")) ? (String[])params.get("l_INSPC_ACPT_DATE") : (String[])null);
		String[] l_INSPC_ACPT_QTY = ((params.containsKey("l_INSPC_ACPT_QTY")) ? (String[])params.get("l_INSPC_ACPT_QTY") : (String[])null);
		String[] l_EXTERNAL_TAX_SALES_AMOUNT = ((params.containsKey("l_EXTERNAL_TAX_SALES_AMOUNT")) ? (String[])params.get("l_EXTERNAL_TAX_SALES_AMOUNT") : (String[])null);
		String[] l_INTERNAL_TAX_SALES_AMOUNT = ((params.containsKey("l_INTERNAL_TAX_SALES_AMOUNT")) ? (String[])params.get("l_INTERNAL_TAX_SALES_AMOUNT") : (String[])null);
		String[] l_TAXFREE_SALES_AMOUNT = ((params.containsKey("l_TAXFREE_SALES_AMOUNT")) ? (String[])params.get("l_TAXFREE_SALES_AMOUNT") : (String[])null);
		String[] l_TAX_CREDIT_SALES_AMOUNT = ((params.containsKey("l_TAX_CREDIT_SALES_AMOUNT")) ? (String[])params.get("l_TAX_CREDIT_SALES_AMOUNT") : (String[])null);
		String[] l_EXTERNAL_TAX_AMOUNT = ((params.containsKey("l_EXTERNAL_TAX_AMOUNT")) ? (String[])params.get("l_EXTERNAL_TAX_AMOUNT") : (String[])null);
		String[] l_INTERNAL_TAX_AMOUNT = ((params.containsKey("l_INTERNAL_TAX_AMOUNT")) ? (String[])params.get("l_INTERNAL_TAX_AMOUNT") : (String[])null);
		String[] l_TAX_AMOUNT_1 = ((params.containsKey("l_TAX_AMOUNT_1")) ? (String[])params.get("l_TAX_AMOUNT_1") : (String[])null);
		String[] l_TAX_AMOUNT_2 = ((params.containsKey("l_TAX_AMOUNT_2")) ? (String[])params.get("l_TAX_AMOUNT_2") : (String[])null);
		String[] l_TAX_AMOUNT_3 = ((params.containsKey("l_TAX_AMOUNT_3")) ? (String[])params.get("l_TAX_AMOUNT_3") : (String[])null);
		String[] l_OWN_CUR_TAXCREDIT_SALES_AMOUNT = ((params.containsKey("l_OWN_CUR_TAXCREDIT_SALES_AMOUNT")) ? (String[])params.get("l_OWN_CUR_TAXCREDIT_SALES_AMOUNT") : (String[])null);
		String[] l_ORGN_SLIP_CD = ((params.containsKey("l_ORGN_SLIP_CD")) ? (String[])params.get("l_ORGN_SLIP_CD") : (String[])null);
		String[] l_CUR_CD = ((params.containsKey("l_CUR_CD")) ? (String[])params.get("l_CUR_CD") : (String[])null);
		String[] l_PCL_PRICE_CO = ((params.containsKey("l_PCL_PRICE_CO")) ? (String[])params.get("l_PCL_PRICE_CO") : (String[])null);
		String[] l_REMARKS = ((params.containsKey("l_REMARKS")) ? (String[])params.get("l_REMARKS") : (String[])null);
		String[] l_INSPC_ACPT_TYP = ((params.containsKey("l_INSPC_ACPT_TYP")) ? (String[])params.get("l_INSPC_ACPT_TYP") : (String[])null);
		String[] l_MODIFY_COUNT = ((params.containsKey("l_MODIFY_COUNT")) ? (String[])params.get("l_MODIFY_COUNT") : (String[])null);
		String[] l_UNIT_CD = ((params.containsKey("l_UNIT_CD")) ? (String[])params.get("l_UNIT_CD") : (String[])null);
		String[] l_SALES_SEQ_NO = ((params.containsKey("l_SALES_SEQ_NO")) ? (String[])params.get("l_SALES_SEQ_NO") : (String[])null);
		String[] l_ROWNO = ((params.containsKey("l_ROWNO")) ? (String[])params.get("l_ROWNO") : (String[])null);
		String[] h_INSTALL_FLG = ((params.containsKey("h_INSTALL_FLG")) ? (String[])params.get("h_INSTALL_FLG") : (String[])null);
		String[] l_CUST_SALES_QTY = ((params.containsKey("l_CUST_SALES_QTY")) ? (String[])params.get("l_CUST_SALES_QTY") : (String[])null);
		String[] l_CUST_UNIT_CD = ((params.containsKey("l_CUST_UNIT_CD")) ? (String[])params.get("l_CUST_UNIT_CD") : (String[])null);
		String[] l_CUST_INSPC_ACPT_QTY = ((params.containsKey("l_CUST_INSPC_ACPT_QTY")) ? (String[])params.get("l_CUST_INSPC_ACPT_QTY") : (String[])null);
		String[] l_SALES_H_NO = ((params.containsKey("l_SALES_H_NO")) ? (String[])params.get("l_SALES_H_NO") : (String[])null);
		String[] l_SHIP_DLV_H_NO = ((params.containsKey("l_SHIP_DLV_H_NO")) ? (String[])params.get("l_SHIP_DLV_H_NO") : (String[])null);
		String[] l_SHIP_DLV_D_NO = ((params.containsKey("l_SHIP_DLV_D_NO")) ? (String[])params.get("l_SHIP_DLV_D_NO") : (String[])null);
		String[] l_AI_AR_IF_FLG = ((params.containsKey("l_AI_AR_IF_FLG")) ? (String[])params.get("l_AI_AR_IF_FLG") : (String[])null);
		String[] l_ORGNAL_SHIP_DLV_H_NO = ((params.containsKey("l_ORGNAL_SHIP_DLV_H_NO")) ? (String[])params.get("l_ORGNAL_SHIP_DLV_H_NO") : (String[])null);
		String[] l_ORGNAL_SHIP_DLV_D_NO = ((params.containsKey("l_ORGNAL_SHIP_DLV_D_NO")) ? (String[])params.get("l_ORGNAL_SHIP_DLV_D_NO") : (String[])null);
		String[] l_TRANS_TYP = ((params.containsKey("l_TRANS_TYP")) ? (String[])params.get("l_TRANS_TYP") : (String[])null);
		String[] l_APPR_HISTORY = ((params.containsKey("l_APPR_HISTORY")) ? (String[])params.get("l_APPR_HISTORY") : (String[])null);
		String[] l_APPR_HISTORY_FLG = ((params.containsKey("l_APPR_HISTORY_FLG")) ? (String[])params.get("l_APPR_HISTORY_FLG") : (String[])null);

		struct.setr_APPR_1( ((r_APPR_1 == null) ? (String)null : r_APPR_1[0]) );
		struct.setList_r_APPR_1(TypeConverter.convert(r_APPR_1));
		struct.setr_APPR_2( ((r_APPR_2 == null) ? (String)null : r_APPR_2[0]) );
		struct.setList_r_APPR_2(TypeConverter.convert(r_APPR_2));
		struct.setr_APPR_3( ((r_APPR_3 == null) ? (String)null : r_APPR_3[0]) );
		struct.setList_r_APPR_3(TypeConverter.convert(r_APPR_3));
		struct.setr_APPR_4( ((r_APPR_4 == null) ? (String)null : r_APPR_4[0]) );
		struct.setList_r_APPR_4(TypeConverter.convert(r_APPR_4));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.setCUST_NAME( ((CUST_NAME == null) ? (String)null : CUST_NAME[0]) );
		struct.setList_CUST_NAME(TypeConverter.convert(CUST_NAME));
		struct.seth_APPR_POWER_TYP( ((h_APPR_POWER_TYP == null) ? (String)null : h_APPR_POWER_TYP[0]) );
		struct.setList_h_APPR_POWER_TYP(TypeConverter.convert(h_APPR_POWER_TYP));
		struct.setSALES_DATE_FROM( ((SALES_DATE_FROM == null) ? (String)null : SALES_DATE_FROM[0]) );
		struct.setList_SALES_DATE_FROM(TypeConverter.convert(SALES_DATE_FROM));
		struct.setSALES_DATE_TO( ((SALES_DATE_TO == null) ? (String)null : SALES_DATE_TO[0]) );
		struct.setList_SALES_DATE_TO(TypeConverter.convert(SALES_DATE_TO));
		struct.setRESERVE_CAUSE( ((RESERVE_CAUSE == null) ? (String)null : RESERVE_CAUSE[0]) );
		struct.setList_RESERVE_CAUSE(TypeConverter.convert(RESERVE_CAUSE));
		struct.setl_APPR_ID( ((l_APPR_ID == null) ? (String)null : l_APPR_ID[0]) );
		struct.setList_l_APPR_ID(TypeConverter.convert(l_APPR_ID));
		struct.setl_APPR_DATE( ((l_APPR_DATE == null) ? (String)null : l_APPR_DATE[0]) );
		struct.setList_l_APPR_DATE(TypeConverter.convert(l_APPR_DATE));
		struct.setl_RESERVE_CAUSE( ((l_RESERVE_CAUSE == null) ? (String)null : l_RESERVE_CAUSE[0]) );
		struct.setList_l_RESERVE_CAUSE(TypeConverter.convert(l_RESERVE_CAUSE));
		struct.setl_SHIP_ODR_NO( ((l_SHIP_ODR_NO == null) ? (String)null : l_SHIP_ODR_NO[0]) );
		struct.setList_l_SHIP_ODR_NO(TypeConverter.convert(l_SHIP_ODR_NO));
		struct.setl_SLIP_CD( ((l_SLIP_CD == null) ? (String)null : l_SLIP_CD[0]) );
		struct.setList_l_SLIP_CD(TypeConverter.convert(l_SLIP_CD));
		struct.setl_SALES_TYP( ((l_SALES_TYP == null) ? (String)null : l_SALES_TYP[0]) );
		struct.setList_l_SALES_TYP(TypeConverter.convert(l_SALES_TYP));
		struct.setl_CUST_CD( ((l_CUST_CD == null) ? (String)null : l_CUST_CD[0]) );
		struct.setList_l_CUST_CD(TypeConverter.convert(l_CUST_CD));
		struct.setl_CUST_NAME( ((l_CUST_NAME == null) ? (String)null : l_CUST_NAME[0]) );
		struct.setList_l_CUST_NAME(TypeConverter.convert(l_CUST_NAME));
		struct.setl_SALES_DEPT_CD( ((l_SALES_DEPT_CD == null) ? (String)null : l_SALES_DEPT_CD[0]) );
		struct.setList_l_SALES_DEPT_CD(TypeConverter.convert(l_SALES_DEPT_CD));
		struct.setl_ORG_NAME( ((l_ORG_NAME == null) ? (String)null : l_ORG_NAME[0]) );
		struct.setList_l_ORG_NAME(TypeConverter.convert(l_ORG_NAME));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_CUST_ODR_NO( ((l_CUST_ODR_NO == null) ? (String)null : l_CUST_ODR_NO[0]) );
		struct.setList_l_CUST_ODR_NO(TypeConverter.convert(l_CUST_ODR_NO));
		struct.setl_SALES_DATE( ((l_SALES_DATE == null) ? (String)null : l_SALES_DATE[0]) );
		struct.setList_l_SALES_DATE(TypeConverter.convert(l_SALES_DATE));
		struct.setl_CUST_CHRG_PSN_CD( ((l_CUST_CHRG_PSN_CD == null) ? (String)null : l_CUST_CHRG_PSN_CD[0]) );
		struct.setList_l_CUST_CHRG_PSN_CD(TypeConverter.convert(l_CUST_CHRG_PSN_CD));
		struct.setl_CUST_CHRG_PSN_NAME( ((l_CUST_CHRG_PSN_NAME == null) ? (String)null : l_CUST_CHRG_PSN_NAME[0]) );
		struct.setList_l_CUST_CHRG_PSN_NAME(TypeConverter.convert(l_CUST_CHRG_PSN_NAME));
		struct.setl_ODR_ACPT_PSN_CD( ((l_ODR_ACPT_PSN_CD == null) ? (String)null : l_ODR_ACPT_PSN_CD[0]) );
		struct.setList_l_ODR_ACPT_PSN_CD(TypeConverter.convert(l_ODR_ACPT_PSN_CD));
		struct.setl_ODR_ACPT_PSN_NAME( ((l_ODR_ACPT_PSN_NAME == null) ? (String)null : l_ODR_ACPT_PSN_NAME[0]) );
		struct.setList_l_ODR_ACPT_PSN_NAME(TypeConverter.convert(l_ODR_ACPT_PSN_NAME));
		struct.setl_SALES_QTY( ((l_SALES_QTY == null) ? (String)null : l_SALES_QTY[0]) );
		struct.setList_l_SALES_QTY(TypeConverter.convert(l_SALES_QTY));
		struct.setl_UNIT_COST( ((l_UNIT_COST == null) ? (String)null : l_UNIT_COST[0]) );
		struct.setList_l_UNIT_COST(TypeConverter.convert(l_UNIT_COST));
		struct.setl_SALES_AMOUNT( ((l_SALES_AMOUNT == null) ? (String)null : l_SALES_AMOUNT[0]) );
		struct.setList_l_SALES_AMOUNT(TypeConverter.convert(l_SALES_AMOUNT));
		struct.setl_SALES_AMOUNT_EXCH_RATES( ((l_SALES_AMOUNT_EXCH_RATES == null) ? (String)null : l_SALES_AMOUNT_EXCH_RATES[0]) );
		struct.setList_l_SALES_AMOUNT_EXCH_RATES(TypeConverter.convert(l_SALES_AMOUNT_EXCH_RATES));
		struct.setl_INSPC_ACPT_DATE( ((l_INSPC_ACPT_DATE == null) ? (String)null : l_INSPC_ACPT_DATE[0]) );
		struct.setList_l_INSPC_ACPT_DATE(TypeConverter.convert(l_INSPC_ACPT_DATE));
		struct.setl_INSPC_ACPT_QTY( ((l_INSPC_ACPT_QTY == null) ? (String)null : l_INSPC_ACPT_QTY[0]) );
		struct.setList_l_INSPC_ACPT_QTY(TypeConverter.convert(l_INSPC_ACPT_QTY));
		struct.setl_EXTERNAL_TAX_SALES_AMOUNT( ((l_EXTERNAL_TAX_SALES_AMOUNT == null) ? (String)null : l_EXTERNAL_TAX_SALES_AMOUNT[0]) );
		struct.setList_l_EXTERNAL_TAX_SALES_AMOUNT(TypeConverter.convert(l_EXTERNAL_TAX_SALES_AMOUNT));
		struct.setl_INTERNAL_TAX_SALES_AMOUNT( ((l_INTERNAL_TAX_SALES_AMOUNT == null) ? (String)null : l_INTERNAL_TAX_SALES_AMOUNT[0]) );
		struct.setList_l_INTERNAL_TAX_SALES_AMOUNT(TypeConverter.convert(l_INTERNAL_TAX_SALES_AMOUNT));
		struct.setl_TAXFREE_SALES_AMOUNT( ((l_TAXFREE_SALES_AMOUNT == null) ? (String)null : l_TAXFREE_SALES_AMOUNT[0]) );
		struct.setList_l_TAXFREE_SALES_AMOUNT(TypeConverter.convert(l_TAXFREE_SALES_AMOUNT));
		struct.setl_TAX_CREDIT_SALES_AMOUNT( ((l_TAX_CREDIT_SALES_AMOUNT == null) ? (String)null : l_TAX_CREDIT_SALES_AMOUNT[0]) );
		struct.setList_l_TAX_CREDIT_SALES_AMOUNT(TypeConverter.convert(l_TAX_CREDIT_SALES_AMOUNT));
		struct.setl_EXTERNAL_TAX_AMOUNT( ((l_EXTERNAL_TAX_AMOUNT == null) ? (String)null : l_EXTERNAL_TAX_AMOUNT[0]) );
		struct.setList_l_EXTERNAL_TAX_AMOUNT(TypeConverter.convert(l_EXTERNAL_TAX_AMOUNT));
		struct.setl_INTERNAL_TAX_AMOUNT( ((l_INTERNAL_TAX_AMOUNT == null) ? (String)null : l_INTERNAL_TAX_AMOUNT[0]) );
		struct.setList_l_INTERNAL_TAX_AMOUNT(TypeConverter.convert(l_INTERNAL_TAX_AMOUNT));
		struct.setl_TAX_AMOUNT_1( ((l_TAX_AMOUNT_1 == null) ? (String)null : l_TAX_AMOUNT_1[0]) );
		struct.setList_l_TAX_AMOUNT_1(TypeConverter.convert(l_TAX_AMOUNT_1));
		struct.setl_TAX_AMOUNT_2( ((l_TAX_AMOUNT_2 == null) ? (String)null : l_TAX_AMOUNT_2[0]) );
		struct.setList_l_TAX_AMOUNT_2(TypeConverter.convert(l_TAX_AMOUNT_2));
		struct.setl_TAX_AMOUNT_3( ((l_TAX_AMOUNT_3 == null) ? (String)null : l_TAX_AMOUNT_3[0]) );
		struct.setList_l_TAX_AMOUNT_3(TypeConverter.convert(l_TAX_AMOUNT_3));
		struct.setl_OWN_CUR_TAXCREDIT_SALES_AMOUNT( ((l_OWN_CUR_TAXCREDIT_SALES_AMOUNT == null) ? (String)null : l_OWN_CUR_TAXCREDIT_SALES_AMOUNT[0]) );
		struct.setList_l_OWN_CUR_TAXCREDIT_SALES_AMOUNT(TypeConverter.convert(l_OWN_CUR_TAXCREDIT_SALES_AMOUNT));
		struct.setl_ORGN_SLIP_CD( ((l_ORGN_SLIP_CD == null) ? (String)null : l_ORGN_SLIP_CD[0]) );
		struct.setList_l_ORGN_SLIP_CD(TypeConverter.convert(l_ORGN_SLIP_CD));
		struct.setl_CUR_CD( ((l_CUR_CD == null) ? (String)null : l_CUR_CD[0]) );
		struct.setList_l_CUR_CD(TypeConverter.convert(l_CUR_CD));
		struct.setl_PCL_PRICE_CO( ((l_PCL_PRICE_CO == null) ? (String)null : l_PCL_PRICE_CO[0]) );
		struct.setList_l_PCL_PRICE_CO(TypeConverter.convert(l_PCL_PRICE_CO));
		struct.setl_REMARKS( ((l_REMARKS == null) ? (String)null : l_REMARKS[0]) );
		struct.setList_l_REMARKS(TypeConverter.convert(l_REMARKS));
		struct.setl_INSPC_ACPT_TYP( ((l_INSPC_ACPT_TYP == null) ? (String)null : l_INSPC_ACPT_TYP[0]) );
		struct.setList_l_INSPC_ACPT_TYP(TypeConverter.convert(l_INSPC_ACPT_TYP));
		struct.setl_MODIFY_COUNT( ((l_MODIFY_COUNT == null) ? (String)null : l_MODIFY_COUNT[0]) );
		struct.setList_l_MODIFY_COUNT(TypeConverter.convert(l_MODIFY_COUNT));
		struct.setl_UNIT_CD( ((l_UNIT_CD == null) ? (String)null : l_UNIT_CD[0]) );
		struct.setList_l_UNIT_CD(TypeConverter.convert(l_UNIT_CD));
		struct.setl_SALES_SEQ_NO( ((l_SALES_SEQ_NO == null) ? (String)null : l_SALES_SEQ_NO[0]) );
		struct.setList_l_SALES_SEQ_NO(TypeConverter.convert(l_SALES_SEQ_NO));
		struct.setl_ROWNO( ((l_ROWNO == null) ? (String)null : l_ROWNO[0]) );
		struct.setList_l_ROWNO(TypeConverter.convert(l_ROWNO));
		struct.seth_INSTALL_FLG( ((h_INSTALL_FLG == null) ? (String)null : h_INSTALL_FLG[0]) );
		struct.setList_h_INSTALL_FLG(TypeConverter.convert(h_INSTALL_FLG));
		struct.setl_CUST_SALES_QTY( ((l_CUST_SALES_QTY == null) ? (String)null : l_CUST_SALES_QTY[0]) );
		struct.setList_l_CUST_SALES_QTY(TypeConverter.convert(l_CUST_SALES_QTY));
		struct.setl_CUST_UNIT_CD( ((l_CUST_UNIT_CD == null) ? (String)null : l_CUST_UNIT_CD[0]) );
		struct.setList_l_CUST_UNIT_CD(TypeConverter.convert(l_CUST_UNIT_CD));
		struct.setl_CUST_INSPC_ACPT_QTY( ((l_CUST_INSPC_ACPT_QTY == null) ? (String)null : l_CUST_INSPC_ACPT_QTY[0]) );
		struct.setList_l_CUST_INSPC_ACPT_QTY(TypeConverter.convert(l_CUST_INSPC_ACPT_QTY));
		struct.setl_SALES_H_NO( ((l_SALES_H_NO == null) ? (String)null : l_SALES_H_NO[0]) );
		struct.setList_l_SALES_H_NO(TypeConverter.convert(l_SALES_H_NO));
		struct.setl_SHIP_DLV_H_NO( ((l_SHIP_DLV_H_NO == null) ? (String)null : l_SHIP_DLV_H_NO[0]) );
		struct.setList_l_SHIP_DLV_H_NO(TypeConverter.convert(l_SHIP_DLV_H_NO));
		struct.setl_SHIP_DLV_D_NO( ((l_SHIP_DLV_D_NO == null) ? (String)null : l_SHIP_DLV_D_NO[0]) );
		struct.setList_l_SHIP_DLV_D_NO(TypeConverter.convert(l_SHIP_DLV_D_NO));
		struct.setl_AI_AR_IF_FLG( ((l_AI_AR_IF_FLG == null) ? (String)null : l_AI_AR_IF_FLG[0]) );
		struct.setList_l_AI_AR_IF_FLG(TypeConverter.convert(l_AI_AR_IF_FLG));
		struct.setl_ORGNAL_SHIP_DLV_H_NO( ((l_ORGNAL_SHIP_DLV_H_NO == null) ? (String)null : l_ORGNAL_SHIP_DLV_H_NO[0]) );
		struct.setList_l_ORGNAL_SHIP_DLV_H_NO(TypeConverter.convert(l_ORGNAL_SHIP_DLV_H_NO));
		struct.setl_ORGNAL_SHIP_DLV_D_NO( ((l_ORGNAL_SHIP_DLV_D_NO == null) ? (String)null : l_ORGNAL_SHIP_DLV_D_NO[0]) );
		struct.setList_l_ORGNAL_SHIP_DLV_D_NO(TypeConverter.convert(l_ORGNAL_SHIP_DLV_D_NO));
		struct.setl_TRANS_TYP( ((l_TRANS_TYP == null) ? (String)null : l_TRANS_TYP[0]) );
		struct.setList_l_TRANS_TYP(TypeConverter.convert(l_TRANS_TYP));
		struct.setl_APPR_HISTORY( ((l_APPR_HISTORY == null) ? (String)null : l_APPR_HISTORY[0]) );
		struct.setList_l_APPR_HISTORY(TypeConverter.convert(l_APPR_HISTORY));
		struct.setl_APPR_HISTORY_FLG( ((l_APPR_HISTORY_FLG == null) ? (String)null : l_APPR_HISTORY_FLG[0]) );
		struct.setList_l_APPR_HISTORY_FLG(TypeConverter.convert(l_APPR_HISTORY_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KR0060010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aKR0060010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aKR0060010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					KR0060010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KR0060010Entity entity = control.entity;
		KR0060010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0060");
		logger.entering("KR0060010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KR0060010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KR0060010Control control;
		KR0060010Entity  entity = null;
		KR0060010Struct  struct = null;

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

			if( (control = (KR0060010Control)so.getAttribute("KR0060010Control_"+request.getSession(false).getId())) == null ) {
				control = new KR0060010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KR0060010Control();
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
				} else if( isClick(request, "UpdateAssort") ) {
					if ( !isCryptical(request, so, params, "UpdateAssort") ) return ERROR_TARGET;
					target = onClickUpdateAssort(request, response, so, params, control);
					control.setButton("UpdateAssort");
				} else if( isClick(request, "CheckAll") ) {
					if ( !isCryptical(request, so, params, "CheckAll") ) return ERROR_TARGET;
					target = onClickCheckAll(request, response, so, params, control);
					control.setButton("CheckAll");
				} else if( isClick(request, "CheckClear") ) {
					if ( !isCryptical(request, so, params, "CheckClear") ) return ERROR_TARGET;
					target = onClickCheckClear(request, response, so, params, control);
					control.setButton("CheckClear");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else if( isClick(request, "Appr_Hty_Rep") ) {
					if ( !isCryptical(request, so, params, "Appr_Hty_Rep") ) return ERROR_TARGET;
					target = onClickAppr_Hty_Rep(request, response, so, params, control);
					control.setButton("Appr_Hty_Rep");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KR0060010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "UpdateAssort") && bFLG_DISCONNECT_UpdateAssort)
				|| (isClick(request, "CheckAll") && bFLG_DISCONNECT_CheckAll)
				|| (isClick(request, "CheckClear") && bFLG_DISCONNECT_CheckClear)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "Appr_Hty_Rep") && bFLG_DISCONNECT_Appr_Hty_Rep)
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
	private  static boolean bFLG_DISCONNECT_UpdateAssort = true;
	private  static boolean bFLG_DISCONNECT_CheckAll = true;
	private  static boolean bFLG_DISCONNECT_CheckClear = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_Appr_Hty_Rep = true;

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
		return "com.nec.jp.orteus.metamorBase.KR0060.KR0060010Servlet";
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
	public KR0060010Servlet()
	{
		//{{user_implement_dev:<KR0060010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_UpdateAssort = true;
		bFLG_DISCONNECT_CheckAll = true;
		bFLG_DISCONNECT_CheckClear = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<KR0060010_DisConnect_FLG>

		//{{user_implement_dev:<KR0060010Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<KR0060010Servlet>
	}

	//////////////////////////////

}
