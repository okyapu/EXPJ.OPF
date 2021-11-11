/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010030Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010;

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
 * CLASS     : KQ0010030Servlet �N���X
 * �t�@�C���E�N���X����
 * @author \$Author\$
 * @version \$Revision\$ \$Date\$
 *
 */
//}}user_implement_dev:header

public class KQ0010030Servlet extends HttpServlet
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
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, KQ0010030Control control)
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
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, KQ0010030Control control)
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
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
			logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			LogWriter.write( Level.ALL, "KQ0010030"+" $Revision: 1.9 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			LogWriter.write(Level.ALL, objMessage.getIDMsg("KQ0010030-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �I�����F�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	public String onClickApprAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickApprAssort");
		//{{user_implement_dev:<onClickApprAssort>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ApprAssort");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickApprAssort>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickApprAssort");

		return nextUrl;
	}

	/**
	 * �I��ۗ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	public String onClickReserveAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickReserveAssort");
		//{{user_implement_dev:<onClickReserveAssort>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ReserveAssort");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReserveAssort>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickReserveAssort");

		return nextUrl;
	}

	/**
	 * �I��ۗ������{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	public String onClickReserveDelAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickReserveDelAssort");
		//{{user_implement_dev:<onClickReserveDelAssort>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ReserveDelAssort");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickReserveDelAssort>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickReserveDelAssort");

		return nextUrl;
	}

	/**
	 * �I���˗��폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	public String onClickApprDelAssort(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickApprDelAssort");
		//{{user_implement_dev:<onClickApprDelAssort>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ApprDelAssort");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickApprDelAssort>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickApprDelAssort");

		return nextUrl;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	public String onClickCheckAll(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickCheckAll");
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
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickCheckAll");

		return nextUrl;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	public String onClickCheckClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickCheckClear");
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
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickCheckClear");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
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
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}

	/**
	 * ���׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control KQ0010030Control�N���X�C���X�^���X
	 */
	public String onClickClickDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					KQ0010030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/KQ0010030detail.jsp";		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClickDetail");
		//{{user_implement_dev:<onClickClickDetail>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("ClickDetail");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClickDetail>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"onClickClickDetail");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, KQ0010030Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] h_APPR_POWER_TYP = ((params.containsKey("h_APPR_POWER_TYP")) ? (String[])params.get("h_APPR_POWER_TYP") : (String[])null);
		String[] r1_FILTER1 = ((params.containsKey("r1_FILTER1")) ? (String[])params.get("r1_FILTER1") : (String[])null);
		String[] r2_FILTER1 = ((params.containsKey("r2_FILTER1")) ? (String[])params.get("r2_FILTER1") : (String[])null);
		String[] r3_FILTER1 = ((params.containsKey("r3_FILTER1")) ? (String[])params.get("r3_FILTER1") : (String[])null);
		String[] h_SELECT_TYP = ((params.containsKey("h_SELECT_TYP")) ? (String[])params.get("h_SELECT_TYP") : (String[])null);
		String[] h_REQUEST_APPR_SAME = ((params.containsKey("h_REQUEST_APPR_SAME")) ? (String[])params.get("h_REQUEST_APPR_SAME") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] START_DATE = ((params.containsKey("START_DATE")) ? (String[])params.get("START_DATE") : (String[])null);
		String[] END_DATE = ((params.containsKey("END_DATE")) ? (String[])params.get("END_DATE") : (String[])null);
		String[] RESERVE_CAUSE = ((params.containsKey("RESERVE_CAUSE")) ? (String[])params.get("RESERVE_CAUSE") : (String[])null);
		String[] l_PROC_TYP_VALUE = ((params.containsKey("l_PROC_TYP_VALUE")) ? (String[])params.get("l_PROC_TYP_VALUE") : (String[])null);
		String[] h_PROC_TYP = ((params.containsKey("h_PROC_TYP")) ? (String[])params.get("h_PROC_TYP") : (String[])null);
		String[] l_REQUEST_BY_NAME = ((params.containsKey("l_REQUEST_BY_NAME")) ? (String[])params.get("l_REQUEST_BY_NAME") : (String[])null);
		String[] l_REQUEST_DATE = ((params.containsKey("l_REQUEST_DATE")) ? (String[])params.get("l_REQUEST_DATE") : (String[])null);
		String[] l_APPR_REMARKS = ((params.containsKey("l_APPR_REMARKS")) ? (String[])params.get("l_APPR_REMARKS") : (String[])null);
		String[] l_RESERVE_CAUSE = ((params.containsKey("l_RESERVE_CAUSE")) ? (String[])params.get("l_RESERVE_CAUSE") : (String[])null);
		String[] l_ODR_TYP_DN = ((params.containsKey("l_ODR_TYP_DN")) ? (String[])params.get("l_ODR_TYP_DN") : (String[])null);
		String[] l_ODR_TYP = ((params.containsKey("l_ODR_TYP")) ? (String[])params.get("l_ODR_TYP") : (String[])null);
		String[] l_CUST_ODR_NO = ((params.containsKey("l_CUST_ODR_NO")) ? (String[])params.get("l_CUST_ODR_NO") : (String[])null);
		String[] l_CUST_ITEM_CD = ((params.containsKey("l_CUST_ITEM_CD")) ? (String[])params.get("l_CUST_ITEM_CD") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_CUST_CD = ((params.containsKey("l_CUST_CD")) ? (String[])params.get("l_CUST_CD") : (String[])null);
		String[] l_CUST_ANAME = ((params.containsKey("l_CUST_ANAME")) ? (String[])params.get("l_CUST_ANAME") : (String[])null);
		String[] l_DESINATED_DLV_DATE = ((params.containsKey("l_DESINATED_DLV_DATE")) ? (String[])params.get("l_DESINATED_DLV_DATE") : (String[])null);
		String[] l_ODR_QTY = ((params.containsKey("l_ODR_QTY")) ? (String[])params.get("l_ODR_QTY") : (String[])null);
		String[] l_UNIT_CD = ((params.containsKey("l_UNIT_CD")) ? (String[])params.get("l_UNIT_CD") : (String[])null);
		String[] l_ODR_UNIT_PRICE = ((params.containsKey("l_ODR_UNIT_PRICE")) ? (String[])params.get("l_ODR_UNIT_PRICE") : (String[])null);
		String[] l_CUR_UNIT = ((params.containsKey("l_CUR_UNIT")) ? (String[])params.get("l_CUR_UNIT") : (String[])null);
		String[] l_SPCL_PRICE_TYP_DN = ((params.containsKey("l_SPCL_PRICE_TYP_DN")) ? (String[])params.get("l_SPCL_PRICE_TYP_DN") : (String[])null);
		String[] l_SPCL_PRICE_TYP = ((params.containsKey("l_SPCL_PRICE_TYP")) ? (String[])params.get("l_SPCL_PRICE_TYP") : (String[])null);
		String[] l_DLV_LOC_CD = ((params.containsKey("l_DLV_LOC_CD")) ? (String[])params.get("l_DLV_LOC_CD") : (String[])null);
		String[] l_DLV_LOC_NAME = ((params.containsKey("l_DLV_LOC_NAME")) ? (String[])params.get("l_DLV_LOC_NAME") : (String[])null);
		String[] l_DEPO_TYP_DN = ((params.containsKey("l_DEPO_TYP_DN")) ? (String[])params.get("l_DEPO_TYP_DN") : (String[])null);
		String[] l_DEPO_TYP = ((params.containsKey("l_DEPO_TYP")) ? (String[])params.get("l_DEPO_TYP") : (String[])null);
		String[] l_CUST_ITEM_NAME = ((params.containsKey("l_CUST_ITEM_NAME")) ? (String[])params.get("l_CUST_ITEM_NAME") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_ODR_ACPT_DATE = ((params.containsKey("l_ODR_ACPT_DATE")) ? (String[])params.get("l_ODR_ACPT_DATE") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] l_JOB_ODR_QTY = ((params.containsKey("l_JOB_ODR_QTY")) ? (String[])params.get("l_JOB_ODR_QTY") : (String[])null);
		String[] l_JOB_ODR_DLV_DATE = ((params.containsKey("l_JOB_ODR_DLV_DATE")) ? (String[])params.get("l_JOB_ODR_DLV_DATE") : (String[])null);
		String[] l_ALC_GRP_CD = ((params.containsKey("l_ALC_GRP_CD")) ? (String[])params.get("l_ALC_GRP_CD") : (String[])null);
		String[] l_REMARKS = ((params.containsKey("l_REMARKS")) ? (String[])params.get("l_REMARKS") : (String[])null);
		String[] l_CUS_DLV_KEY_CD = ((params.containsKey("l_CUS_DLV_KEY_CD")) ? (String[])params.get("l_CUS_DLV_KEY_CD") : (String[])null);
		String[] l_CUS_DLV_CD = ((params.containsKey("l_CUS_DLV_CD")) ? (String[])params.get("l_CUS_DLV_CD") : (String[])null);
		String[] d_OLD_CUST_ODR_NO = ((params.containsKey("d_OLD_CUST_ODR_NO")) ? (String[])params.get("d_OLD_CUST_ODR_NO") : (String[])null);
		String[] d_NEW_CUST_ODR_NO = ((params.containsKey("d_NEW_CUST_ODR_NO")) ? (String[])params.get("d_NEW_CUST_ODR_NO") : (String[])null);
		String[] d_CUST_ODR_NO_CHANGE = ((params.containsKey("d_CUST_ODR_NO_CHANGE")) ? (String[])params.get("d_CUST_ODR_NO_CHANGE") : (String[])null);
		String[] d_OLD_CUST_CD = ((params.containsKey("d_OLD_CUST_CD")) ? (String[])params.get("d_OLD_CUST_CD") : (String[])null);
		String[] d_NEW_CUST_CD = ((params.containsKey("d_NEW_CUST_CD")) ? (String[])params.get("d_NEW_CUST_CD") : (String[])null);
		String[] d_CUST_CD_CHANGE = ((params.containsKey("d_CUST_CD_CHANGE")) ? (String[])params.get("d_CUST_CD_CHANGE") : (String[])null);
		String[] d_OLD_CUST_ITEM_CD = ((params.containsKey("d_OLD_CUST_ITEM_CD")) ? (String[])params.get("d_OLD_CUST_ITEM_CD") : (String[])null);
		String[] d_NEW_CUST_ITEM_CD = ((params.containsKey("d_NEW_CUST_ITEM_CD")) ? (String[])params.get("d_NEW_CUST_ITEM_CD") : (String[])null);
		String[] d_CUST_ITEM_CD_CHANGE = ((params.containsKey("d_CUST_ITEM_CD_CHANGE")) ? (String[])params.get("d_CUST_ITEM_CD_CHANGE") : (String[])null);
		String[] d_DLV_LOC_CD_CHANGE = ((params.containsKey("d_DLV_LOC_CD_CHANGE")) ? (String[])params.get("d_DLV_LOC_CD_CHANGE") : (String[])null);
		String[] d_OLD_ODR_QTY = ((params.containsKey("d_OLD_ODR_QTY")) ? (String[])params.get("d_OLD_ODR_QTY") : (String[])null);
		String[] d_NEW_ODR_QTY = ((params.containsKey("d_NEW_ODR_QTY")) ? (String[])params.get("d_NEW_ODR_QTY") : (String[])null);
		String[] d_ODR_QTY_CHANGE = ((params.containsKey("d_ODR_QTY_CHANGE")) ? (String[])params.get("d_ODR_QTY_CHANGE") : (String[])null);
		String[] d_OLD_DESINATED_DLV_DATE = ((params.containsKey("d_OLD_DESINATED_DLV_DATE")) ? (String[])params.get("d_OLD_DESINATED_DLV_DATE") : (String[])null);
		String[] d_NEW_DESINATED_DLV_DATE = ((params.containsKey("d_NEW_DESINATED_DLV_DATE")) ? (String[])params.get("d_NEW_DESINATED_DLV_DATE") : (String[])null);
		String[] d_DESINATED_DLV_DATE_CHANGE = ((params.containsKey("d_DESINATED_DLV_DATE_CHANGE")) ? (String[])params.get("d_DESINATED_DLV_DATE_CHANGE") : (String[])null);
		String[] d_OLD_SPCL_PRICE_TYP = ((params.containsKey("d_OLD_SPCL_PRICE_TYP")) ? (String[])params.get("d_OLD_SPCL_PRICE_TYP") : (String[])null);
		String[] d_NEW_SPCL_PRICE_TYP = ((params.containsKey("d_NEW_SPCL_PRICE_TYP")) ? (String[])params.get("d_NEW_SPCL_PRICE_TYP") : (String[])null);
		String[] d_SPCL_PRICE_TYP_CHANGE = ((params.containsKey("d_SPCL_PRICE_TYP_CHANGE")) ? (String[])params.get("d_SPCL_PRICE_TYP_CHANGE") : (String[])null);
		String[] d_OLD_ODR_UNIT_PRICE = ((params.containsKey("d_OLD_ODR_UNIT_PRICE")) ? (String[])params.get("d_OLD_ODR_UNIT_PRICE") : (String[])null);
		String[] d_NEW_ODR_UNIT_PRICE = ((params.containsKey("d_NEW_ODR_UNIT_PRICE")) ? (String[])params.get("d_NEW_ODR_UNIT_PRICE") : (String[])null);
		String[] d_ODR_UNIT_PRICE_CHANGE = ((params.containsKey("d_ODR_UNIT_PRICE_CHANGE")) ? (String[])params.get("d_ODR_UNIT_PRICE_CHANGE") : (String[])null);
		String[] d_OLD_DLV_LOC_CD = ((params.containsKey("d_OLD_DLV_LOC_CD")) ? (String[])params.get("d_OLD_DLV_LOC_CD") : (String[])null);
		String[] d_NEW_DLV_LOC_CD = ((params.containsKey("d_NEW_DLV_LOC_CD")) ? (String[])params.get("d_NEW_DLV_LOC_CD") : (String[])null);
		String[] d_OLD_REMARKS = ((params.containsKey("d_OLD_REMARKS")) ? (String[])params.get("d_OLD_REMARKS") : (String[])null);
		String[] d_NEW_REMARKS = ((params.containsKey("d_NEW_REMARKS")) ? (String[])params.get("d_NEW_REMARKS") : (String[])null);
		String[] d_REMARKS_CHANGE = ((params.containsKey("d_REMARKS_CHANGE")) ? (String[])params.get("d_REMARKS_CHANGE") : (String[])null);
		String[] l_REQUEST_BY = ((params.containsKey("l_REQUEST_BY")) ? (String[])params.get("l_REQUEST_BY") : (String[])null);
		String[] h_STATUS = ((params.containsKey("h_STATUS")) ? (String[])params.get("h_STATUS") : (String[])null);
		String[] h_APPR_ID = ((params.containsKey("h_APPR_ID")) ? (String[])params.get("h_APPR_ID") : (String[])null);
		String[] h_SCREEN_URL = ((params.containsKey("h_SCREEN_URL")) ? (String[])params.get("h_SCREEN_URL") : (String[])null);
		String[] h_ODR_NO = ((params.containsKey("h_ODR_NO")) ? (String[])params.get("h_ODR_NO") : (String[])null);
		String[] d_OLD_ODR_NO = ((params.containsKey("d_OLD_ODR_NO")) ? (String[])params.get("d_OLD_ODR_NO") : (String[])null);
		String[] d_NEW_ODR_NO = ((params.containsKey("d_NEW_ODR_NO")) ? (String[])params.get("d_NEW_ODR_NO") : (String[])null);
		String[] d_ODR_NO_CHANGE = ((params.containsKey("d_ODR_NO_CHANGE")) ? (String[])params.get("d_ODR_NO_CHANGE") : (String[])null);
		String[] d_OLD_ODR_TYP = ((params.containsKey("d_OLD_ODR_TYP")) ? (String[])params.get("d_OLD_ODR_TYP") : (String[])null);
		String[] d_NEW_ODR_TYP = ((params.containsKey("d_NEW_ODR_TYP")) ? (String[])params.get("d_NEW_ODR_TYP") : (String[])null);
		String[] d_ODR_TYP_CHANGE = ((params.containsKey("d_ODR_TYP_CHANGE")) ? (String[])params.get("d_ODR_TYP_CHANGE") : (String[])null);
		String[] h_MODIFY_COUNT = ((params.containsKey("h_MODIFY_COUNT")) ? (String[])params.get("h_MODIFY_COUNT") : (String[])null);
		String[] l_STATUS_NAME = ((params.containsKey("l_STATUS_NAME")) ? (String[])params.get("l_STATUS_NAME") : (String[])null);
		String[] l_PROJECT_CD = ((params.containsKey("l_PROJECT_CD")) ? (String[])params.get("l_PROJECT_CD") : (String[])null);
		String[] l_ESTIMATE_NO = ((params.containsKey("l_ESTIMATE_NO")) ? (String[])params.get("l_ESTIMATE_NO") : (String[])null);
		String[] l_DETAL_NO = ((params.containsKey("l_DETAL_NO")) ? (String[])params.get("l_DETAL_NO") : (String[])null);
		String[] l_ESTIMATE_TYPE = ((params.containsKey("l_ESTIMATE_TYPE")) ? (String[])params.get("l_ESTIMATE_TYPE") : (String[])null);
		String[] l_h_ESTIMATE_TYPE = ((params.containsKey("l_h_ESTIMATE_TYPE")) ? (String[])params.get("l_h_ESTIMATE_TYPE") : (String[])null);
		String[] l_OWN_PERSON_CD = ((params.containsKey("l_OWN_PERSON_CD")) ? (String[])params.get("l_OWN_PERSON_CD") : (String[])null);
		String[] l_OWN_ORG_CD = ((params.containsKey("l_OWN_ORG_CD")) ? (String[])params.get("l_OWN_ORG_CD") : (String[])null);
		String[] l_ORGN_ODR_NO = ((params.containsKey("l_ORGN_ODR_NO")) ? (String[])params.get("l_ORGN_ODR_NO") : (String[])null);
		String[] l_ADD_ODR_FLG = ((params.containsKey("l_ADD_ODR_FLG")) ? (String[])params.get("l_ADD_ODR_FLG") : (String[])null);

		struct.seth_APPR_POWER_TYP( ((h_APPR_POWER_TYP == null) ? (String)null : h_APPR_POWER_TYP[0]) );
		struct.setList_h_APPR_POWER_TYP(TypeConverter.convert(h_APPR_POWER_TYP));
		struct.setr1_FILTER1( ((r1_FILTER1 == null) ? (String)null : r1_FILTER1[0]) );
		struct.setList_r1_FILTER1(TypeConverter.convert(r1_FILTER1));
		struct.setr2_FILTER1( ((r2_FILTER1 == null) ? (String)null : r2_FILTER1[0]) );
		struct.setList_r2_FILTER1(TypeConverter.convert(r2_FILTER1));
		struct.setr3_FILTER1( ((r3_FILTER1 == null) ? (String)null : r3_FILTER1[0]) );
		struct.setList_r3_FILTER1(TypeConverter.convert(r3_FILTER1));
		struct.seth_SELECT_TYP( ((h_SELECT_TYP == null) ? (String)null : h_SELECT_TYP[0]) );
		struct.setList_h_SELECT_TYP(TypeConverter.convert(h_SELECT_TYP));
		struct.seth_REQUEST_APPR_SAME( ((h_REQUEST_APPR_SAME == null) ? (String)null : h_REQUEST_APPR_SAME[0]) );
		struct.setList_h_REQUEST_APPR_SAME(TypeConverter.convert(h_REQUEST_APPR_SAME));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.setSTART_DATE( ((START_DATE == null) ? (String)null : START_DATE[0]) );
		struct.setList_START_DATE(TypeConverter.convert(START_DATE));
		struct.setEND_DATE( ((END_DATE == null) ? (String)null : END_DATE[0]) );
		struct.setList_END_DATE(TypeConverter.convert(END_DATE));
		struct.setRESERVE_CAUSE( ((RESERVE_CAUSE == null) ? (String)null : RESERVE_CAUSE[0]) );
		struct.setList_RESERVE_CAUSE(TypeConverter.convert(RESERVE_CAUSE));
		struct.setl_PROC_TYP_VALUE( ((l_PROC_TYP_VALUE == null) ? (String)null : l_PROC_TYP_VALUE[0]) );
		struct.setList_l_PROC_TYP_VALUE(TypeConverter.convert(l_PROC_TYP_VALUE));
		struct.seth_PROC_TYP( ((h_PROC_TYP == null) ? (String)null : h_PROC_TYP[0]) );
		struct.setList_h_PROC_TYP(TypeConverter.convert(h_PROC_TYP));
		struct.setl_REQUEST_BY_NAME( ((l_REQUEST_BY_NAME == null) ? (String)null : l_REQUEST_BY_NAME[0]) );
		struct.setList_l_REQUEST_BY_NAME(TypeConverter.convert(l_REQUEST_BY_NAME));
		struct.setl_REQUEST_DATE( ((l_REQUEST_DATE == null) ? (String)null : l_REQUEST_DATE[0]) );
		struct.setList_l_REQUEST_DATE(TypeConverter.convert(l_REQUEST_DATE));
		struct.setl_APPR_REMARKS( ((l_APPR_REMARKS == null) ? (String)null : l_APPR_REMARKS[0]) );
		struct.setList_l_APPR_REMARKS(TypeConverter.convert(l_APPR_REMARKS));
		struct.setl_RESERVE_CAUSE( ((l_RESERVE_CAUSE == null) ? (String)null : l_RESERVE_CAUSE[0]) );
		struct.setList_l_RESERVE_CAUSE(TypeConverter.convert(l_RESERVE_CAUSE));
		struct.setl_ODR_TYP_DN( ((l_ODR_TYP_DN == null) ? (String)null : l_ODR_TYP_DN[0]) );
		struct.setList_l_ODR_TYP_DN(TypeConverter.convert(l_ODR_TYP_DN));
		struct.setl_ODR_TYP( ((l_ODR_TYP == null) ? (String)null : l_ODR_TYP[0]) );
		struct.setList_l_ODR_TYP(TypeConverter.convert(l_ODR_TYP));
		struct.setl_CUST_ODR_NO( ((l_CUST_ODR_NO == null) ? (String)null : l_CUST_ODR_NO[0]) );
		struct.setList_l_CUST_ODR_NO(TypeConverter.convert(l_CUST_ODR_NO));
		struct.setl_CUST_ITEM_CD( ((l_CUST_ITEM_CD == null) ? (String)null : l_CUST_ITEM_CD[0]) );
		struct.setList_l_CUST_ITEM_CD(TypeConverter.convert(l_CUST_ITEM_CD));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_CUST_CD( ((l_CUST_CD == null) ? (String)null : l_CUST_CD[0]) );
		struct.setList_l_CUST_CD(TypeConverter.convert(l_CUST_CD));
		struct.setl_CUST_ANAME( ((l_CUST_ANAME == null) ? (String)null : l_CUST_ANAME[0]) );
		struct.setList_l_CUST_ANAME(TypeConverter.convert(l_CUST_ANAME));
		struct.setl_DESINATED_DLV_DATE( ((l_DESINATED_DLV_DATE == null) ? (String)null : l_DESINATED_DLV_DATE[0]) );
		struct.setList_l_DESINATED_DLV_DATE(TypeConverter.convert(l_DESINATED_DLV_DATE));
		struct.setl_ODR_QTY( ((l_ODR_QTY == null) ? (String)null : l_ODR_QTY[0]) );
		struct.setList_l_ODR_QTY(TypeConverter.convert(l_ODR_QTY));
		struct.setl_UNIT_CD( ((l_UNIT_CD == null) ? (String)null : l_UNIT_CD[0]) );
		struct.setList_l_UNIT_CD(TypeConverter.convert(l_UNIT_CD));
		struct.setl_ODR_UNIT_PRICE( ((l_ODR_UNIT_PRICE == null) ? (String)null : l_ODR_UNIT_PRICE[0]) );
		struct.setList_l_ODR_UNIT_PRICE(TypeConverter.convert(l_ODR_UNIT_PRICE));
		struct.setl_CUR_UNIT( ((l_CUR_UNIT == null) ? (String)null : l_CUR_UNIT[0]) );
		struct.setList_l_CUR_UNIT(TypeConverter.convert(l_CUR_UNIT));
		struct.setl_SPCL_PRICE_TYP_DN( ((l_SPCL_PRICE_TYP_DN == null) ? (String)null : l_SPCL_PRICE_TYP_DN[0]) );
		struct.setList_l_SPCL_PRICE_TYP_DN(TypeConverter.convert(l_SPCL_PRICE_TYP_DN));
		struct.setl_SPCL_PRICE_TYP( ((l_SPCL_PRICE_TYP == null) ? (String)null : l_SPCL_PRICE_TYP[0]) );
		struct.setList_l_SPCL_PRICE_TYP(TypeConverter.convert(l_SPCL_PRICE_TYP));
		struct.setl_DLV_LOC_CD( ((l_DLV_LOC_CD == null) ? (String)null : l_DLV_LOC_CD[0]) );
		struct.setList_l_DLV_LOC_CD(TypeConverter.convert(l_DLV_LOC_CD));
		struct.setl_DLV_LOC_NAME( ((l_DLV_LOC_NAME == null) ? (String)null : l_DLV_LOC_NAME[0]) );
		struct.setList_l_DLV_LOC_NAME(TypeConverter.convert(l_DLV_LOC_NAME));
		struct.setl_DEPO_TYP_DN( ((l_DEPO_TYP_DN == null) ? (String)null : l_DEPO_TYP_DN[0]) );
		struct.setList_l_DEPO_TYP_DN(TypeConverter.convert(l_DEPO_TYP_DN));
		struct.setl_DEPO_TYP( ((l_DEPO_TYP == null) ? (String)null : l_DEPO_TYP[0]) );
		struct.setList_l_DEPO_TYP(TypeConverter.convert(l_DEPO_TYP));
		struct.setl_CUST_ITEM_NAME( ((l_CUST_ITEM_NAME == null) ? (String)null : l_CUST_ITEM_NAME[0]) );
		struct.setList_l_CUST_ITEM_NAME(TypeConverter.convert(l_CUST_ITEM_NAME));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_ODR_ACPT_DATE( ((l_ODR_ACPT_DATE == null) ? (String)null : l_ODR_ACPT_DATE[0]) );
		struct.setList_l_ODR_ACPT_DATE(TypeConverter.convert(l_ODR_ACPT_DATE));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.setl_JOB_ODR_QTY( ((l_JOB_ODR_QTY == null) ? (String)null : l_JOB_ODR_QTY[0]) );
		struct.setList_l_JOB_ODR_QTY(TypeConverter.convert(l_JOB_ODR_QTY));
		struct.setl_JOB_ODR_DLV_DATE( ((l_JOB_ODR_DLV_DATE == null) ? (String)null : l_JOB_ODR_DLV_DATE[0]) );
		struct.setList_l_JOB_ODR_DLV_DATE(TypeConverter.convert(l_JOB_ODR_DLV_DATE));
		struct.setl_ALC_GRP_CD( ((l_ALC_GRP_CD == null) ? (String)null : l_ALC_GRP_CD[0]) );
		struct.setList_l_ALC_GRP_CD(TypeConverter.convert(l_ALC_GRP_CD));
		struct.setl_REMARKS( ((l_REMARKS == null) ? (String)null : l_REMARKS[0]) );
		struct.setList_l_REMARKS(TypeConverter.convert(l_REMARKS));
		struct.setl_CUS_DLV_KEY_CD( ((l_CUS_DLV_KEY_CD == null) ? (String)null : l_CUS_DLV_KEY_CD[0]) );
		struct.setList_l_CUS_DLV_KEY_CD(TypeConverter.convert(l_CUS_DLV_KEY_CD));
		struct.setl_CUS_DLV_CD( ((l_CUS_DLV_CD == null) ? (String)null : l_CUS_DLV_CD[0]) );
		struct.setList_l_CUS_DLV_CD(TypeConverter.convert(l_CUS_DLV_CD));
		struct.setd_OLD_CUST_ODR_NO( ((d_OLD_CUST_ODR_NO == null) ? (String)null : d_OLD_CUST_ODR_NO[0]) );
		struct.setList_d_OLD_CUST_ODR_NO(TypeConverter.convert(d_OLD_CUST_ODR_NO));
		struct.setd_NEW_CUST_ODR_NO( ((d_NEW_CUST_ODR_NO == null) ? (String)null : d_NEW_CUST_ODR_NO[0]) );
		struct.setList_d_NEW_CUST_ODR_NO(TypeConverter.convert(d_NEW_CUST_ODR_NO));
		struct.setd_CUST_ODR_NO_CHANGE( ((d_CUST_ODR_NO_CHANGE == null) ? (String)null : d_CUST_ODR_NO_CHANGE[0]) );
		struct.setList_d_CUST_ODR_NO_CHANGE(TypeConverter.convert(d_CUST_ODR_NO_CHANGE));
		struct.setd_OLD_CUST_CD( ((d_OLD_CUST_CD == null) ? (String)null : d_OLD_CUST_CD[0]) );
		struct.setList_d_OLD_CUST_CD(TypeConverter.convert(d_OLD_CUST_CD));
		struct.setd_NEW_CUST_CD( ((d_NEW_CUST_CD == null) ? (String)null : d_NEW_CUST_CD[0]) );
		struct.setList_d_NEW_CUST_CD(TypeConverter.convert(d_NEW_CUST_CD));
		struct.setd_CUST_CD_CHANGE( ((d_CUST_CD_CHANGE == null) ? (String)null : d_CUST_CD_CHANGE[0]) );
		struct.setList_d_CUST_CD_CHANGE(TypeConverter.convert(d_CUST_CD_CHANGE));
		struct.setd_OLD_CUST_ITEM_CD( ((d_OLD_CUST_ITEM_CD == null) ? (String)null : d_OLD_CUST_ITEM_CD[0]) );
		struct.setList_d_OLD_CUST_ITEM_CD(TypeConverter.convert(d_OLD_CUST_ITEM_CD));
		struct.setd_NEW_CUST_ITEM_CD( ((d_NEW_CUST_ITEM_CD == null) ? (String)null : d_NEW_CUST_ITEM_CD[0]) );
		struct.setList_d_NEW_CUST_ITEM_CD(TypeConverter.convert(d_NEW_CUST_ITEM_CD));
		struct.setd_CUST_ITEM_CD_CHANGE( ((d_CUST_ITEM_CD_CHANGE == null) ? (String)null : d_CUST_ITEM_CD_CHANGE[0]) );
		struct.setList_d_CUST_ITEM_CD_CHANGE(TypeConverter.convert(d_CUST_ITEM_CD_CHANGE));
		struct.setd_DLV_LOC_CD_CHANGE( ((d_DLV_LOC_CD_CHANGE == null) ? (String)null : d_DLV_LOC_CD_CHANGE[0]) );
		struct.setList_d_DLV_LOC_CD_CHANGE(TypeConverter.convert(d_DLV_LOC_CD_CHANGE));
		struct.setd_OLD_ODR_QTY( ((d_OLD_ODR_QTY == null) ? (String)null : d_OLD_ODR_QTY[0]) );
		struct.setList_d_OLD_ODR_QTY(TypeConverter.convert(d_OLD_ODR_QTY));
		struct.setd_NEW_ODR_QTY( ((d_NEW_ODR_QTY == null) ? (String)null : d_NEW_ODR_QTY[0]) );
		struct.setList_d_NEW_ODR_QTY(TypeConverter.convert(d_NEW_ODR_QTY));
		struct.setd_ODR_QTY_CHANGE( ((d_ODR_QTY_CHANGE == null) ? (String)null : d_ODR_QTY_CHANGE[0]) );
		struct.setList_d_ODR_QTY_CHANGE(TypeConverter.convert(d_ODR_QTY_CHANGE));
		struct.setd_OLD_DESINATED_DLV_DATE( ((d_OLD_DESINATED_DLV_DATE == null) ? (String)null : d_OLD_DESINATED_DLV_DATE[0]) );
		struct.setList_d_OLD_DESINATED_DLV_DATE(TypeConverter.convert(d_OLD_DESINATED_DLV_DATE));
		struct.setd_NEW_DESINATED_DLV_DATE( ((d_NEW_DESINATED_DLV_DATE == null) ? (String)null : d_NEW_DESINATED_DLV_DATE[0]) );
		struct.setList_d_NEW_DESINATED_DLV_DATE(TypeConverter.convert(d_NEW_DESINATED_DLV_DATE));
		struct.setd_DESINATED_DLV_DATE_CHANGE( ((d_DESINATED_DLV_DATE_CHANGE == null) ? (String)null : d_DESINATED_DLV_DATE_CHANGE[0]) );
		struct.setList_d_DESINATED_DLV_DATE_CHANGE(TypeConverter.convert(d_DESINATED_DLV_DATE_CHANGE));
		struct.setd_OLD_SPCL_PRICE_TYP( ((d_OLD_SPCL_PRICE_TYP == null) ? (String)null : d_OLD_SPCL_PRICE_TYP[0]) );
		struct.setList_d_OLD_SPCL_PRICE_TYP(TypeConverter.convert(d_OLD_SPCL_PRICE_TYP));
		struct.setd_NEW_SPCL_PRICE_TYP( ((d_NEW_SPCL_PRICE_TYP == null) ? (String)null : d_NEW_SPCL_PRICE_TYP[0]) );
		struct.setList_d_NEW_SPCL_PRICE_TYP(TypeConverter.convert(d_NEW_SPCL_PRICE_TYP));
		struct.setd_SPCL_PRICE_TYP_CHANGE( ((d_SPCL_PRICE_TYP_CHANGE == null) ? (String)null : d_SPCL_PRICE_TYP_CHANGE[0]) );
		struct.setList_d_SPCL_PRICE_TYP_CHANGE(TypeConverter.convert(d_SPCL_PRICE_TYP_CHANGE));
		struct.setd_OLD_ODR_UNIT_PRICE( ((d_OLD_ODR_UNIT_PRICE == null) ? (String)null : d_OLD_ODR_UNIT_PRICE[0]) );
		struct.setList_d_OLD_ODR_UNIT_PRICE(TypeConverter.convert(d_OLD_ODR_UNIT_PRICE));
		struct.setd_NEW_ODR_UNIT_PRICE( ((d_NEW_ODR_UNIT_PRICE == null) ? (String)null : d_NEW_ODR_UNIT_PRICE[0]) );
		struct.setList_d_NEW_ODR_UNIT_PRICE(TypeConverter.convert(d_NEW_ODR_UNIT_PRICE));
		struct.setd_ODR_UNIT_PRICE_CHANGE( ((d_ODR_UNIT_PRICE_CHANGE == null) ? (String)null : d_ODR_UNIT_PRICE_CHANGE[0]) );
		struct.setList_d_ODR_UNIT_PRICE_CHANGE(TypeConverter.convert(d_ODR_UNIT_PRICE_CHANGE));
		struct.setd_OLD_DLV_LOC_CD( ((d_OLD_DLV_LOC_CD == null) ? (String)null : d_OLD_DLV_LOC_CD[0]) );
		struct.setList_d_OLD_DLV_LOC_CD(TypeConverter.convert(d_OLD_DLV_LOC_CD));
		struct.setd_NEW_DLV_LOC_CD( ((d_NEW_DLV_LOC_CD == null) ? (String)null : d_NEW_DLV_LOC_CD[0]) );
		struct.setList_d_NEW_DLV_LOC_CD(TypeConverter.convert(d_NEW_DLV_LOC_CD));
		struct.setd_OLD_REMARKS( ((d_OLD_REMARKS == null) ? (String)null : d_OLD_REMARKS[0]) );
		struct.setList_d_OLD_REMARKS(TypeConverter.convert(d_OLD_REMARKS));
		struct.setd_NEW_REMARKS( ((d_NEW_REMARKS == null) ? (String)null : d_NEW_REMARKS[0]) );
		struct.setList_d_NEW_REMARKS(TypeConverter.convert(d_NEW_REMARKS));
		struct.setd_REMARKS_CHANGE( ((d_REMARKS_CHANGE == null) ? (String)null : d_REMARKS_CHANGE[0]) );
		struct.setList_d_REMARKS_CHANGE(TypeConverter.convert(d_REMARKS_CHANGE));
		struct.setl_REQUEST_BY( ((l_REQUEST_BY == null) ? (String)null : l_REQUEST_BY[0]) );
		struct.setList_l_REQUEST_BY(TypeConverter.convert(l_REQUEST_BY));
		struct.seth_STATUS( ((h_STATUS == null) ? (String)null : h_STATUS[0]) );
		struct.setList_h_STATUS(TypeConverter.convert(h_STATUS));
		struct.seth_APPR_ID( ((h_APPR_ID == null) ? (String)null : h_APPR_ID[0]) );
		struct.setList_h_APPR_ID(TypeConverter.convert(h_APPR_ID));
		struct.seth_SCREEN_URL( ((h_SCREEN_URL == null) ? (String)null : h_SCREEN_URL[0]) );
		struct.setList_h_SCREEN_URL(TypeConverter.convert(h_SCREEN_URL));
		struct.seth_ODR_NO( ((h_ODR_NO == null) ? (String)null : h_ODR_NO[0]) );
		struct.setList_h_ODR_NO(TypeConverter.convert(h_ODR_NO));
		struct.setd_OLD_ODR_NO( ((d_OLD_ODR_NO == null) ? (String)null : d_OLD_ODR_NO[0]) );
		struct.setList_d_OLD_ODR_NO(TypeConverter.convert(d_OLD_ODR_NO));
		struct.setd_NEW_ODR_NO( ((d_NEW_ODR_NO == null) ? (String)null : d_NEW_ODR_NO[0]) );
		struct.setList_d_NEW_ODR_NO(TypeConverter.convert(d_NEW_ODR_NO));
		struct.setd_ODR_NO_CHANGE( ((d_ODR_NO_CHANGE == null) ? (String)null : d_ODR_NO_CHANGE[0]) );
		struct.setList_d_ODR_NO_CHANGE(TypeConverter.convert(d_ODR_NO_CHANGE));
		struct.setd_OLD_ODR_TYP( ((d_OLD_ODR_TYP == null) ? (String)null : d_OLD_ODR_TYP[0]) );
		struct.setList_d_OLD_ODR_TYP(TypeConverter.convert(d_OLD_ODR_TYP));
		struct.setd_NEW_ODR_TYP( ((d_NEW_ODR_TYP == null) ? (String)null : d_NEW_ODR_TYP[0]) );
		struct.setList_d_NEW_ODR_TYP(TypeConverter.convert(d_NEW_ODR_TYP));
		struct.setd_ODR_TYP_CHANGE( ((d_ODR_TYP_CHANGE == null) ? (String)null : d_ODR_TYP_CHANGE[0]) );
		struct.setList_d_ODR_TYP_CHANGE(TypeConverter.convert(d_ODR_TYP_CHANGE));
		struct.seth_MODIFY_COUNT( ((h_MODIFY_COUNT == null) ? (String)null : h_MODIFY_COUNT[0]) );
		struct.setList_h_MODIFY_COUNT(TypeConverter.convert(h_MODIFY_COUNT));
		struct.setl_STATUS_NAME( ((l_STATUS_NAME == null) ? (String)null : l_STATUS_NAME[0]) );
		struct.setList_l_STATUS_NAME(TypeConverter.convert(l_STATUS_NAME));
		struct.setl_PROJECT_CD( ((l_PROJECT_CD == null) ? (String)null : l_PROJECT_CD[0]) );
		struct.setList_l_PROJECT_CD(TypeConverter.convert(l_PROJECT_CD));
		struct.setl_ESTIMATE_NO( ((l_ESTIMATE_NO == null) ? (String)null : l_ESTIMATE_NO[0]) );
		struct.setList_l_ESTIMATE_NO(TypeConverter.convert(l_ESTIMATE_NO));
		struct.setl_DETAL_NO( ((l_DETAL_NO == null) ? (String)null : l_DETAL_NO[0]) );
		struct.setList_l_DETAL_NO(TypeConverter.convert(l_DETAL_NO));
		struct.setl_ESTIMATE_TYPE( ((l_ESTIMATE_TYPE == null) ? (String)null : l_ESTIMATE_TYPE[0]) );
		struct.setList_l_ESTIMATE_TYPE(TypeConverter.convert(l_ESTIMATE_TYPE));
		struct.setl_h_ESTIMATE_TYPE( ((l_h_ESTIMATE_TYPE == null) ? (String)null : l_h_ESTIMATE_TYPE[0]) );
		struct.setList_l_h_ESTIMATE_TYPE(TypeConverter.convert(l_h_ESTIMATE_TYPE));
		struct.setl_OWN_PERSON_CD( ((l_OWN_PERSON_CD == null) ? (String)null : l_OWN_PERSON_CD[0]) );
		struct.setList_l_OWN_PERSON_CD(TypeConverter.convert(l_OWN_PERSON_CD));
		struct.setl_OWN_ORG_CD( ((l_OWN_ORG_CD == null) ? (String)null : l_OWN_ORG_CD[0]) );
		struct.setList_l_OWN_ORG_CD(TypeConverter.convert(l_OWN_ORG_CD));
		struct.setl_ORGN_ODR_NO( ((l_ORGN_ODR_NO == null) ? (String)null : l_ORGN_ODR_NO[0]) );
		struct.setList_l_ORGN_ODR_NO(TypeConverter.convert(l_ORGN_ODR_NO));
		struct.setl_ADD_ODR_FLG( ((l_ADD_ODR_FLG == null) ? (String)null : l_ADD_ODR_FLG[0]) );
		struct.setList_l_ADD_ODR_FLG(TypeConverter.convert(l_ADD_ODR_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/KQ0010030.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aKQ0010030Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aKQ0010030Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					KQ0010030Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		KQ0010030Entity entity = control.entity;
		KQ0010030Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("KQ0010030Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		KQ0010030Control control;
		KQ0010030Entity  entity = null;
		KQ0010030Struct  struct = null;

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

			if( (control = (KQ0010030Control)so.getAttribute("KQ0010030Control_"+request.getSession(false).getId())) == null ) {
				control = new KQ0010030Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new KQ0010030Control();
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
				} else if( isClick(request, "ApprAssort") ) {
					if ( !isCryptical(request, so, params, "ApprAssort") ) return ERROR_TARGET;
					target = onClickApprAssort(request, response, so, params, control);
					control.setButton("ApprAssort");
				} else if( isClick(request, "ReserveAssort") ) {
					if ( !isCryptical(request, so, params, "ReserveAssort") ) return ERROR_TARGET;
					target = onClickReserveAssort(request, response, so, params, control);
					control.setButton("ReserveAssort");
				} else if( isClick(request, "ReserveDelAssort") ) {
					if ( !isCryptical(request, so, params, "ReserveDelAssort") ) return ERROR_TARGET;
					target = onClickReserveDelAssort(request, response, so, params, control);
					control.setButton("ReserveDelAssort");
				} else if( isClick(request, "ApprDelAssort") ) {
					if ( !isCryptical(request, so, params, "ApprDelAssort") ) return ERROR_TARGET;
					target = onClickApprDelAssort(request, response, so, params, control);
					control.setButton("ApprDelAssort");
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
				} else if( isClick(request, "ClickDetail") ) {
					if ( !isCryptical(request, so, params, "ClickDetail") ) return ERROR_TARGET;
					target = onClickClickDetail(request, response, so, params, control);
					control.setButton("ClickDetail");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("KQ0010030Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "ApprAssort") && bFLG_DISCONNECT_ApprAssort)
				|| (isClick(request, "ReserveAssort") && bFLG_DISCONNECT_ReserveAssort)
				|| (isClick(request, "ReserveDelAssort") && bFLG_DISCONNECT_ReserveDelAssort)
				|| (isClick(request, "ApprDelAssort") && bFLG_DISCONNECT_ApprDelAssort)
				|| (isClick(request, "CheckAll") && bFLG_DISCONNECT_CheckAll)
				|| (isClick(request, "CheckClear") && bFLG_DISCONNECT_CheckClear)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "Close") && bFLG_DISCONNECT_Close)
				|| (isClick(request, "ClickDetail") && bFLG_DISCONNECT_ClickDetail)
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
	private  static boolean bFLG_DISCONNECT_ApprAssort = true;
	private  static boolean bFLG_DISCONNECT_ReserveAssort = true;
	private  static boolean bFLG_DISCONNECT_ReserveDelAssort = true;
	private  static boolean bFLG_DISCONNECT_ApprDelAssort = true;
	private  static boolean bFLG_DISCONNECT_CheckAll = true;
	private  static boolean bFLG_DISCONNECT_CheckClear = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_Close = true;
	private  static boolean bFLG_DISCONNECT_ClickDetail = true;

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
		return "com.nec.jp.orteus.metamorBase.KQ0010.KQ0010030Servlet";
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
	public KQ0010030Servlet()
	{
		//{{user_implement_dev:<KQ0010030_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_ApprAssort = true;
		bFLG_DISCONNECT_ReserveAssort = true;
		bFLG_DISCONNECT_ReserveDelAssort = true;
		bFLG_DISCONNECT_ApprDelAssort = true;
		bFLG_DISCONNECT_CheckAll = true;
		bFLG_DISCONNECT_CheckClear = true;
		bFLG_DISCONNECT_Clear = true;
		bFLG_DISCONNECT_Close = true;

                //}}user_implement_dev:<KQ0010030_DisConnect_FLG>

		//{{user_implement_dev:<KQ0010030Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<KQ0010030Servlet>
	}

	//////////////////////////////

}
