/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0010/src/com/nec/jp/orteus/metamorBase/AJ0010/AJ0010010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0010;

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

public class AJ0010010Servlet extends HttpServlet
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
	 * @param control AJ0010010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AJ0010010Control control)
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
		String[] PLANT_CD = (String[]) params.get("w_PLANT_CD");
		control.setPlantCd((PLANT_CD == null) ? null : PLANT_CD[0]);
		String[] ITEM_CD = (String[]) params.get("w_ITEM_CD");
		control.setItemCd((ITEM_CD == null) ? null : ITEM_CD[0]);
		String[] PRD_DUE_DATE_FROM = (String[]) params.get("w_date_from");
		control.setPrdDueDateFrom((PRD_DUE_DATE_FROM == null) ? null : PRD_DUE_DATE_FROM[0]);
		String[] PRD_DUE_DATE_TO = (String[]) params.get("w_date_to");
		control.setPrdDueDateTo((PRD_DUE_DATE_TO == null) ? null : PRD_DUE_DATE_TO[0]);
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AJ0010010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AJ0010010Control control)
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
	 * @param control AJ0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AJ0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AJ0010010Entity entity = control.entity;
		AJ0010010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
			logger.entering("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
//			objMessage.m_writer.write( Level.ALL, "AJ0010010"+" $Revision: 1.10 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AJ0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AJ0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AJ0010010Entity entity = control.entity;
		AJ0010010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0010010-E999","�����[�h����"));
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AJ0010010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AJ0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AJ0010010Entity entity = control.entity;
		AJ0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Select");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AJ0010010Control�N���X�C���X�^���X
	 */
	public String onClickCsvOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AJ0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AJ0010010Entity entity = control.entity;
		AJ0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");
		//{{user_implement_dev:<onClickCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CsvOut");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCsvOut>
		logger.exiting("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AJ0010010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AJ0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AJ0010010Entity entity = control.entity;
		AJ0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("Clear");
		} catch ( FoundationException e ) {
//			e.printStackTrace();
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ���ԕʐi���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AJ0010010Control�N���X�C���X�^���X
	 */
	public String onClickJobOdrProgLst(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AJ0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AJ0010010Entity entity = control.entity;
		AJ0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickJobOdrProgLst");
		//{{user_implement_dev:<onClickJobOdrProgLst>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("JobOdrProgLst");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickJobOdrProgLst>
		logger.exiting("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickJobOdrProgLst");

		return nextUrl;
	}

	/**
	 * ��Ǝw���i���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AJ0010010Control�N���X�C���X�^���X
	 */
	public String onClickWorkProgLst(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AJ0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AJ0010010Entity entity = control.entity;
		AJ0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickWorkProgLst");
		//{{user_implement_dev:<onClickWorkProgLst>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("WorkProgLst");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickWorkProgLst>
		logger.exiting("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickWorkProgLst");

		return nextUrl;
	}

	/**
	 * �����w���i���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AJ0010010Control�N���X�C���X�^���X
	 */
	public String onClickPuchProgLst(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AJ0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AJ0010010Entity entity = control.entity;
		AJ0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickPuchProgLst");
		//{{user_implement_dev:<onClickPuchProgLst>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("PuchProgLst");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickPuchProgLst>
		logger.exiting("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"onClickPuchProgLst");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AJ0010010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] r1_MRP_ODR_TYP = ((params.containsKey("r1_MRP_ODR_TYP")) ? (String[])params.get("r1_MRP_ODR_TYP") : (String[])null);
		String[] r2_MRP_ODR_TYP = ((params.containsKey("r2_MRP_ODR_TYP")) ? (String[])params.get("r2_MRP_ODR_TYP") : (String[])null);
		String[] r3_MRP_ODR_TYP = ((params.containsKey("r3_MRP_ODR_TYP")) ? (String[])params.get("r3_MRP_ODR_TYP") : (String[])null);
		String[] c1_PROGRESS_STS_TYP = ((params.containsKey("c1_PROGRESS_STS_TYP")) ? (String[])params.get("c1_PROGRESS_STS_TYP") : (String[])null);
		String[] PRD_DUE_DATE_FROM = ((params.containsKey("PRD_DUE_DATE_FROM")) ? (String[])params.get("PRD_DUE_DATE_FROM") : (String[])null);
		String[] PRD_DUE_DATE_TO = ((params.containsKey("PRD_DUE_DATE_TO")) ? (String[])params.get("PRD_DUE_DATE_TO") : (String[])null);
		String[] c2_PROGRESS_STS_TYP = ((params.containsKey("c2_PROGRESS_STS_TYP")) ? (String[])params.get("c2_PROGRESS_STS_TYP") : (String[])null);
		String[] PRD_START_DATE_FROM = ((params.containsKey("PRD_START_DATE_FROM")) ? (String[])params.get("PRD_START_DATE_FROM") : (String[])null);
		String[] PRD_START_DATE_TO = ((params.containsKey("PRD_START_DATE_TO")) ? (String[])params.get("PRD_START_DATE_TO") : (String[])null);
		String[] c1_ODR_STS_TYP = ((params.containsKey("c1_ODR_STS_TYP")) ? (String[])params.get("c1_ODR_STS_TYP") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] c2_ODR_STS_TYP = ((params.containsKey("c2_ODR_STS_TYP")) ? (String[])params.get("c2_ODR_STS_TYP") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] c3_ODR_STS_TYP = ((params.containsKey("c3_ODR_STS_TYP")) ? (String[])params.get("c3_ODR_STS_TYP") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] l_PROGRESS_STATUS_DN = ((params.containsKey("l_PROGRESS_STATUS_DN")) ? (String[])params.get("l_PROGRESS_STATUS_DN") : (String[])null);
		String[] l_ODR_STS_TYP_DN = ((params.containsKey("l_ODR_STS_TYP_DN")) ? (String[])params.get("l_ODR_STS_TYP_DN") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_OUTSIDE_TYP_DN = ((params.containsKey("l_OUTSIDE_TYP_DN")) ? (String[])params.get("l_OUTSIDE_TYP_DN") : (String[])null);
		String[] l_MRP_ODR_TYP_DN = ((params.containsKey("l_MRP_ODR_TYP_DN")) ? (String[])params.get("l_MRP_ODR_TYP_DN") : (String[])null);
		String[] l_ODR_START_DATE = ((params.containsKey("l_ODR_START_DATE")) ? (String[])params.get("l_ODR_START_DATE") : (String[])null);
		String[] l_PRD_START_DATE = ((params.containsKey("l_PRD_START_DATE")) ? (String[])params.get("l_PRD_START_DATE") : (String[])null);
		String[] l_PRD_DUE_DATE = ((params.containsKey("l_PRD_DUE_DATE")) ? (String[])params.get("l_PRD_DUE_DATE") : (String[])null);
		String[] l_ODR_QTY = ((params.containsKey("l_ODR_QTY")) ? (String[])params.get("l_ODR_QTY") : (String[])null);
		String[] l_TOTAL_RCV_QTY = ((params.containsKey("l_TOTAL_RCV_QTY")) ? (String[])params.get("l_TOTAL_RCV_QTY") : (String[])null);
		String[] l_JOB_ODR_CD = ((params.containsKey("l_JOB_ODR_CD")) ? (String[])params.get("l_JOB_ODR_CD") : (String[])null);
		String[] l_JOB_ODR_CANCEL_NO = ((params.containsKey("l_JOB_ODR_CANCEL_NO")) ? (String[])params.get("l_JOB_ODR_CANCEL_NO") : (String[])null);
		String[] l_JOB_ODR_TYP_DN = ((params.containsKey("l_JOB_ODR_TYP_DN")) ? (String[])params.get("l_JOB_ODR_TYP_DN") : (String[])null);
		String[] l_ALC_GRP_CD = ((params.containsKey("l_ALC_GRP_CD")) ? (String[])params.get("l_ALC_GRP_CD") : (String[])null);
		String[] l_OD_GNR_TYP_DN = ((params.containsKey("l_OD_GNR_TYP_DN")) ? (String[])params.get("l_OD_GNR_TYP_DN") : (String[])null);
		String[] l_EXTERNAL_PLAN_CD = ((params.containsKey("l_EXTERNAL_PLAN_CD")) ? (String[])params.get("l_EXTERNAL_PLAN_CD") : (String[])null);
		String[] l_OD_NO = ((params.containsKey("l_OD_NO")) ? (String[])params.get("l_OD_NO") : (String[])null);
		String[] l_RLSD_PUCH_ODR_QTY = ((params.containsKey("l_RLSD_PUCH_ODR_QTY")) ? (String[])params.get("l_RLSD_PUCH_ODR_QTY") : (String[])null);
		String[] l_WORK_IN_PROC_QTY = ((params.containsKey("l_WORK_IN_PROC_QTY")) ? (String[])params.get("l_WORK_IN_PROC_QTY") : (String[])null);
		String[] l_MRP_ODR_TYP = ((params.containsKey("l_MRP_ODR_TYP")) ? (String[])params.get("l_MRP_ODR_TYP") : (String[])null);
		String[] l_OPR_RSLT_TYP = ((params.containsKey("l_OPR_RSLT_TYP")) ? (String[])params.get("l_OPR_RSLT_TYP") : (String[])null);
		String[] l_ODR_STS_TYP = ((params.containsKey("l_ODR_STS_TYP")) ? (String[])params.get("l_ODR_STS_TYP") : (String[])null);
		String[] l_PROGRESS_STATUS = ((params.containsKey("l_PROGRESS_STATUS")) ? (String[])params.get("l_PROGRESS_STATUS") : (String[])null);
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] l_PLANT_CD = ((params.containsKey("l_PLANT_CD")) ? (String[])params.get("l_PLANT_CD") : (String[])null);
		String[] l_STOCK_UNIT = ((params.containsKey("l_STOCK_UNIT")) ? (String[])params.get("l_STOCK_UNIT") : (String[])null);
		String[] l_RCV_CMPLT_DATE = ((params.containsKey("l_RCV_CMPLT_DATE")) ? (String[])params.get("l_RCV_CMPLT_DATE") : (String[])null);
		String[] PRD_DUE_TIME_FROM = ((params.containsKey("PRD_DUE_TIME_FROM")) ? (String[])params.get("PRD_DUE_TIME_FROM") : (String[])null);
		String[] PRD_DUE_TIME_TO = ((params.containsKey("PRD_DUE_TIME_TO")) ? (String[])params.get("PRD_DUE_TIME_TO") : (String[])null);
		String[] PRD_START_TIME_FROM = ((params.containsKey("PRD_START_TIME_FROM")) ? (String[])params.get("PRD_START_TIME_FROM") : (String[])null);
		String[] PRD_START_TIME_TO = ((params.containsKey("PRD_START_TIME_TO")) ? (String[])params.get("PRD_START_TIME_TO") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);

		struct.setr1_MRP_ODR_TYP( ((r1_MRP_ODR_TYP == null) ? (String)null : r1_MRP_ODR_TYP[0]) );
		struct.setList_r1_MRP_ODR_TYP(TypeConverter.convert(r1_MRP_ODR_TYP));
		struct.setr2_MRP_ODR_TYP( ((r2_MRP_ODR_TYP == null) ? (String)null : r2_MRP_ODR_TYP[0]) );
		struct.setList_r2_MRP_ODR_TYP(TypeConverter.convert(r2_MRP_ODR_TYP));
		struct.setr3_MRP_ODR_TYP( ((r3_MRP_ODR_TYP == null) ? (String)null : r3_MRP_ODR_TYP[0]) );
		struct.setList_r3_MRP_ODR_TYP(TypeConverter.convert(r3_MRP_ODR_TYP));
		struct.setc1_PROGRESS_STS_TYP( ((c1_PROGRESS_STS_TYP == null) ? (String)null : c1_PROGRESS_STS_TYP[0]) );
		struct.setList_c1_PROGRESS_STS_TYP(TypeConverter.convert(c1_PROGRESS_STS_TYP));
		struct.setPRD_DUE_DATE_FROM( ((PRD_DUE_DATE_FROM == null) ? (String)null : PRD_DUE_DATE_FROM[0]) );
		struct.setList_PRD_DUE_DATE_FROM(TypeConverter.convert(PRD_DUE_DATE_FROM));
		struct.setPRD_DUE_DATE_TO( ((PRD_DUE_DATE_TO == null) ? (String)null : PRD_DUE_DATE_TO[0]) );
		struct.setList_PRD_DUE_DATE_TO(TypeConverter.convert(PRD_DUE_DATE_TO));
		struct.setc2_PROGRESS_STS_TYP( ((c2_PROGRESS_STS_TYP == null) ? (String)null : c2_PROGRESS_STS_TYP[0]) );
		struct.setList_c2_PROGRESS_STS_TYP(TypeConverter.convert(c2_PROGRESS_STS_TYP));
		struct.setPRD_START_DATE_FROM( ((PRD_START_DATE_FROM == null) ? (String)null : PRD_START_DATE_FROM[0]) );
		struct.setList_PRD_START_DATE_FROM(TypeConverter.convert(PRD_START_DATE_FROM));
		struct.setPRD_START_DATE_TO( ((PRD_START_DATE_TO == null) ? (String)null : PRD_START_DATE_TO[0]) );
		struct.setList_PRD_START_DATE_TO(TypeConverter.convert(PRD_START_DATE_TO));
		struct.setc1_ODR_STS_TYP( ((c1_ODR_STS_TYP == null) ? (String)null : c1_ODR_STS_TYP[0]) );
		struct.setList_c1_ODR_STS_TYP(TypeConverter.convert(c1_ODR_STS_TYP));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setc2_ODR_STS_TYP( ((c2_ODR_STS_TYP == null) ? (String)null : c2_ODR_STS_TYP[0]) );
		struct.setList_c2_ODR_STS_TYP(TypeConverter.convert(c2_ODR_STS_TYP));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setc3_ODR_STS_TYP( ((c3_ODR_STS_TYP == null) ? (String)null : c3_ODR_STS_TYP[0]) );
		struct.setList_c3_ODR_STS_TYP(TypeConverter.convert(c3_ODR_STS_TYP));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setl_PROGRESS_STATUS_DN( ((l_PROGRESS_STATUS_DN == null) ? (String)null : l_PROGRESS_STATUS_DN[0]) );
		struct.setList_l_PROGRESS_STATUS_DN(TypeConverter.convert(l_PROGRESS_STATUS_DN));
		struct.setl_ODR_STS_TYP_DN( ((l_ODR_STS_TYP_DN == null) ? (String)null : l_ODR_STS_TYP_DN[0]) );
		struct.setList_l_ODR_STS_TYP_DN(TypeConverter.convert(l_ODR_STS_TYP_DN));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_OUTSIDE_TYP_DN( ((l_OUTSIDE_TYP_DN == null) ? (String)null : l_OUTSIDE_TYP_DN[0]) );
		struct.setList_l_OUTSIDE_TYP_DN(TypeConverter.convert(l_OUTSIDE_TYP_DN));
		struct.setl_MRP_ODR_TYP_DN( ((l_MRP_ODR_TYP_DN == null) ? (String)null : l_MRP_ODR_TYP_DN[0]) );
		struct.setList_l_MRP_ODR_TYP_DN(TypeConverter.convert(l_MRP_ODR_TYP_DN));
		struct.setl_ODR_START_DATE( ((l_ODR_START_DATE == null) ? (String)null : l_ODR_START_DATE[0]) );
		struct.setList_l_ODR_START_DATE(TypeConverter.convert(l_ODR_START_DATE));
		struct.setl_PRD_START_DATE( ((l_PRD_START_DATE == null) ? (String)null : l_PRD_START_DATE[0]) );
		struct.setList_l_PRD_START_DATE(TypeConverter.convert(l_PRD_START_DATE));
		struct.setl_PRD_DUE_DATE( ((l_PRD_DUE_DATE == null) ? (String)null : l_PRD_DUE_DATE[0]) );
		struct.setList_l_PRD_DUE_DATE(TypeConverter.convert(l_PRD_DUE_DATE));
		struct.setl_ODR_QTY( ((l_ODR_QTY == null) ? (String)null : l_ODR_QTY[0]) );
		struct.setList_l_ODR_QTY(TypeConverter.convert(l_ODR_QTY));
		struct.setl_TOTAL_RCV_QTY( ((l_TOTAL_RCV_QTY == null) ? (String)null : l_TOTAL_RCV_QTY[0]) );
		struct.setList_l_TOTAL_RCV_QTY(TypeConverter.convert(l_TOTAL_RCV_QTY));
		struct.setl_JOB_ODR_CD( ((l_JOB_ODR_CD == null) ? (String)null : l_JOB_ODR_CD[0]) );
		struct.setList_l_JOB_ODR_CD(TypeConverter.convert(l_JOB_ODR_CD));
		struct.setl_JOB_ODR_CANCEL_NO( ((l_JOB_ODR_CANCEL_NO == null) ? (String)null : l_JOB_ODR_CANCEL_NO[0]) );
		struct.setList_l_JOB_ODR_CANCEL_NO(TypeConverter.convert(l_JOB_ODR_CANCEL_NO));
		struct.setl_JOB_ODR_TYP_DN( ((l_JOB_ODR_TYP_DN == null) ? (String)null : l_JOB_ODR_TYP_DN[0]) );
		struct.setList_l_JOB_ODR_TYP_DN(TypeConverter.convert(l_JOB_ODR_TYP_DN));
		struct.setl_ALC_GRP_CD( ((l_ALC_GRP_CD == null) ? (String)null : l_ALC_GRP_CD[0]) );
		struct.setList_l_ALC_GRP_CD(TypeConverter.convert(l_ALC_GRP_CD));
		struct.setl_OD_GNR_TYP_DN( ((l_OD_GNR_TYP_DN == null) ? (String)null : l_OD_GNR_TYP_DN[0]) );
		struct.setList_l_OD_GNR_TYP_DN(TypeConverter.convert(l_OD_GNR_TYP_DN));
		struct.setl_EXTERNAL_PLAN_CD( ((l_EXTERNAL_PLAN_CD == null) ? (String)null : l_EXTERNAL_PLAN_CD[0]) );
		struct.setList_l_EXTERNAL_PLAN_CD(TypeConverter.convert(l_EXTERNAL_PLAN_CD));
		struct.setl_OD_NO( ((l_OD_NO == null) ? (String)null : l_OD_NO[0]) );
		struct.setList_l_OD_NO(TypeConverter.convert(l_OD_NO));
		struct.setl_RLSD_PUCH_ODR_QTY( ((l_RLSD_PUCH_ODR_QTY == null) ? (String)null : l_RLSD_PUCH_ODR_QTY[0]) );
		struct.setList_l_RLSD_PUCH_ODR_QTY(TypeConverter.convert(l_RLSD_PUCH_ODR_QTY));
		struct.setl_WORK_IN_PROC_QTY( ((l_WORK_IN_PROC_QTY == null) ? (String)null : l_WORK_IN_PROC_QTY[0]) );
		struct.setList_l_WORK_IN_PROC_QTY(TypeConverter.convert(l_WORK_IN_PROC_QTY));
		if( (l_MRP_ODR_TYP == null)||("".equals(l_MRP_ODR_TYP[0])) ) {
		   struct.setl_MRP_ODR_TYP( (Integer)null );
		} else {
		   struct.setl_MRP_ODR_TYP( new Integer(l_MRP_ODR_TYP[0]) );
		   struct.setList_l_MRP_ODR_TYP(TypeConverter.convert(l_MRP_ODR_TYP));
		}
		if( (l_OPR_RSLT_TYP == null)||("".equals(l_OPR_RSLT_TYP[0])) ) {
		   struct.setl_OPR_RSLT_TYP( (Integer)null );
		} else {
		   struct.setl_OPR_RSLT_TYP( new Integer(l_OPR_RSLT_TYP[0]) );
		   struct.setList_l_OPR_RSLT_TYP(TypeConverter.convert(l_OPR_RSLT_TYP));
		}
		if( (l_ODR_STS_TYP == null)||("".equals(l_ODR_STS_TYP[0])) ) {
		   struct.setl_ODR_STS_TYP( (Integer)null );
		} else {
		   struct.setl_ODR_STS_TYP( new Integer(l_ODR_STS_TYP[0]) );
		   struct.setList_l_ODR_STS_TYP(TypeConverter.convert(l_ODR_STS_TYP));
		}
		if( (l_PROGRESS_STATUS == null)||("".equals(l_PROGRESS_STATUS[0])) ) {
		   struct.setl_PROGRESS_STATUS( (Integer)null );
		} else {
		   struct.setl_PROGRESS_STATUS( new Integer(l_PROGRESS_STATUS[0]) );
		   struct.setList_l_PROGRESS_STATUS(TypeConverter.convert(l_PROGRESS_STATUS));
		}
		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setl_PLANT_CD( ((l_PLANT_CD == null) ? (String)null : l_PLANT_CD[0]) );
		struct.setList_l_PLANT_CD(TypeConverter.convert(l_PLANT_CD));
		struct.setl_STOCK_UNIT( ((l_STOCK_UNIT == null) ? (String)null : l_STOCK_UNIT[0]) );
		struct.setList_l_STOCK_UNIT(TypeConverter.convert(l_STOCK_UNIT));
		struct.setl_RCV_CMPLT_DATE( ((l_RCV_CMPLT_DATE == null) ? (String)null : l_RCV_CMPLT_DATE[0]) );
		struct.setList_l_RCV_CMPLT_DATE(TypeConverter.convert(l_RCV_CMPLT_DATE));
		struct.setPRD_DUE_TIME_FROM( ((PRD_DUE_TIME_FROM == null) ? (String)null : PRD_DUE_TIME_FROM[0]) );
		struct.setList_PRD_DUE_TIME_FROM(TypeConverter.convert(PRD_DUE_TIME_FROM));
		struct.setPRD_DUE_TIME_TO( ((PRD_DUE_TIME_TO == null) ? (String)null : PRD_DUE_TIME_TO[0]) );
		struct.setList_PRD_DUE_TIME_TO(TypeConverter.convert(PRD_DUE_TIME_TO));
		struct.setPRD_START_TIME_FROM( ((PRD_START_TIME_FROM == null) ? (String)null : PRD_START_TIME_FROM[0]) );
		struct.setList_PRD_START_TIME_FROM(TypeConverter.convert(PRD_START_TIME_FROM));
		struct.setPRD_START_TIME_TO( ((PRD_START_TIME_TO == null) ? (String)null : PRD_START_TIME_TO[0]) );
		struct.setList_PRD_START_TIME_TO(TypeConverter.convert(PRD_START_TIME_TO));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AJ0010010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAJ0010010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAJ0010010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AJ0010010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AJ0010010Entity entity = control.entity;
		AJ0010010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AJ0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AJ0010010Control control;
		AJ0010010Entity  entity = null;
		AJ0010010Struct  struct = null;

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

			if( (control = (AJ0010010Control)so.getAttribute("AJ0010010Control_"+request.getSession(false).getId())) == null ) {
				control = new AJ0010010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AJ0010010Control();
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
				} else if( isClick(request, "CsvOut") ) {
					if ( !isCryptical(request, so, params, "CsvOut") ) return ERROR_TARGET;
					target = onClickCsvOut(request, response, so, params, control);
					control.setButton("CsvOut");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "JobOdrProgLst") ) {
					if ( !isCryptical(request, so, params, "JobOdrProgLst") ) return ERROR_TARGET;
					target = onClickJobOdrProgLst(request, response, so, params, control);
					control.setButton("JobOdrProgLst");
				} else if( isClick(request, "WorkProgLst") ) {
					if ( !isCryptical(request, so, params, "WorkProgLst") ) return ERROR_TARGET;
					target = onClickWorkProgLst(request, response, so, params, control);
					control.setButton("WorkProgLst");
				} else if( isClick(request, "PuchProgLst") ) {
					if ( !isCryptical(request, so, params, "PuchProgLst") ) return ERROR_TARGET;
					target = onClickPuchProgLst(request, response, so, params, control);
					control.setButton("PuchProgLst");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AJ0010010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "CsvOut") && bFLG_DISCONNECT_CsvOut)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "JobOdrProgLst") && bFLG_DISCONNECT_JobOdrProgLst)
				|| (isClick(request, "WorkProgLst") && bFLG_DISCONNECT_WorkProgLst)
				|| (isClick(request, "PuchProgLst") && bFLG_DISCONNECT_PuchProgLst)
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
	private  static boolean bFLG_DISCONNECT_CsvOut = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_JobOdrProgLst = true;
	private  static boolean bFLG_DISCONNECT_WorkProgLst = true;
	private  static boolean bFLG_DISCONNECT_PuchProgLst = true;

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
		return "com.nec.jp.orteus.metamorBase.AJ0010.AJ0010010Servlet";
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
	public AJ0010010Servlet()
	{
		//{{user_implement_dev:<AJ0010010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_Select = true;
		bFLG_DISCONNECT_CsvOut = true;
		bFLG_DISCONNECT_Clear = true;

                //}}user_implement_dev:<AJ0010010_DisConnect_FLG>

		//{{user_implement_dev:<AJ0010010Servlet>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AJ0010010Servlet>
	}

	//////////////////////////////

}
