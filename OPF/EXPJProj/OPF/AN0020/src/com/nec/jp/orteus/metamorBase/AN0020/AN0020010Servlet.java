/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AN0020/src/com/nec/jp/orteus/metamorBase/AN0020/AN0020010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AN0020;

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

public class AN0020010Servlet extends HttpServlet
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
	 * @param control AN0020010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AN0020010Control control)
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
	 * @param control AN0020010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AN0020010Control control)
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
	 * @param control AN0020010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
			logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              //			objMessage.m_writer.write( Level.ALL, "AN0020010"+" $Revision: 1.3 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AN0020010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
              //			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AN0020010-E999","�����[�h����"));
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AN0020010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AN0020010Control�N���X�C���X�^���X
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("Update");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AN0020010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AN0020010Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AN0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
		//{{user_implement_dev:<onClickClose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("Close");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickClose>
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AN0020010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] CHART_CD = ((params.containsKey("CHART_CD")) ? (String[])params.get("CHART_CD") : (String[])null);
		String[] CHART_NAME = ((params.containsKey("CHART_NAME")) ? (String[])params.get("CHART_NAME") : (String[])null);
		String[] CHART_TYP = ((params.containsKey("CHART_TYP")) ? (String[])params.get("CHART_TYP") : (String[])null);
		String[] CHART_TYP_name = ((params.containsKey("CHART_TYP_name")) ? (String[])params.get("CHART_TYP_name") : (String[])null);
		String[] CHART_TYP_val = ((params.containsKey("CHART_TYP_val")) ? (String[])params.get("CHART_TYP_val") : (String[])null);
		String[] DIMENSION_TYP = ((params.containsKey("DIMENSION_TYP")) ? (String[])params.get("DIMENSION_TYP") : (String[])null);
		String[] DIMENSION_TYP_name = ((params.containsKey("DIMENSION_TYP_name")) ? (String[])params.get("DIMENSION_TYP_name") : (String[])null);
		String[] DIMENSION_TYP_val = ((params.containsKey("DIMENSION_TYP_val")) ? (String[])params.get("DIMENSION_TYP_val") : (String[])null);
		String[] MAX_SCALE_RATE = ((params.containsKey("MAX_SCALE_RATE")) ? (String[])params.get("MAX_SCALE_RATE") : (String[])null);
		String[] SCALE_STEP = ((params.containsKey("SCALE_STEP")) ? (String[])params.get("SCALE_STEP") : (String[])null);
		String[] HIGH_LOAD = ((params.containsKey("HIGH_LOAD")) ? (String[])params.get("HIGH_LOAD") : (String[])null);
		String[] MIDDLE_LOAD = ((params.containsKey("MIDDLE_LOAD")) ? (String[])params.get("MIDDLE_LOAD") : (String[])null);
		String[] LOW_LOAD = ((params.containsKey("LOW_LOAD")) ? (String[])params.get("LOW_LOAD") : (String[])null);
		String[] BACKGROUNDCOLOR_R = ((params.containsKey("BACKGROUNDCOLOR_R")) ? (String[])params.get("BACKGROUNDCOLOR_R") : (String[])null);
		String[] BACKGROUNDCOLOR_G = ((params.containsKey("BACKGROUNDCOLOR_G")) ? (String[])params.get("BACKGROUNDCOLOR_G") : (String[])null);
		String[] BACKGROUNDCOLOR_B = ((params.containsKey("BACKGROUNDCOLOR_B")) ? (String[])params.get("BACKGROUNDCOLOR_B") : (String[])null);
		String[] CHART_COLOR0_R = ((params.containsKey("CHART_COLOR0_R")) ? (String[])params.get("CHART_COLOR0_R") : (String[])null);
		String[] CHART_COLOR0_G = ((params.containsKey("CHART_COLOR0_G")) ? (String[])params.get("CHART_COLOR0_G") : (String[])null);
		String[] CHART_COLOR0_B = ((params.containsKey("CHART_COLOR0_B")) ? (String[])params.get("CHART_COLOR0_B") : (String[])null);
		String[] CHART_COLOR1_R = ((params.containsKey("CHART_COLOR1_R")) ? (String[])params.get("CHART_COLOR1_R") : (String[])null);
		String[] CHART_COLOR1_G = ((params.containsKey("CHART_COLOR1_G")) ? (String[])params.get("CHART_COLOR1_G") : (String[])null);
		String[] CHART_COLOR1_B = ((params.containsKey("CHART_COLOR1_B")) ? (String[])params.get("CHART_COLOR1_B") : (String[])null);
		String[] CHART_COLOR2_R = ((params.containsKey("CHART_COLOR2_R")) ? (String[])params.get("CHART_COLOR2_R") : (String[])null);
		String[] CHART_COLOR2_G = ((params.containsKey("CHART_COLOR2_G")) ? (String[])params.get("CHART_COLOR2_G") : (String[])null);
		String[] CHART_COLOR2_B = ((params.containsKey("CHART_COLOR2_B")) ? (String[])params.get("CHART_COLOR2_B") : (String[])null);
		String[] CHART_COLOR9_R = ((params.containsKey("CHART_COLOR9_R")) ? (String[])params.get("CHART_COLOR9_R") : (String[])null);
		String[] CHART_COLOR9_G = ((params.containsKey("CHART_COLOR9_G")) ? (String[])params.get("CHART_COLOR9_G") : (String[])null);
		String[] CHART_COLOR9_B = ((params.containsKey("CHART_COLOR9_B")) ? (String[])params.get("CHART_COLOR9_B") : (String[])null);
		String[] HIGH_LOAD_COLOR_R = ((params.containsKey("HIGH_LOAD_COLOR_R")) ? (String[])params.get("HIGH_LOAD_COLOR_R") : (String[])null);
		String[] HIGH_LOAD_COLOR_G = ((params.containsKey("HIGH_LOAD_COLOR_G")) ? (String[])params.get("HIGH_LOAD_COLOR_G") : (String[])null);
		String[] HIGH_LOAD_COLOR_B = ((params.containsKey("HIGH_LOAD_COLOR_B")) ? (String[])params.get("HIGH_LOAD_COLOR_B") : (String[])null);
		String[] h_MODIFY_COUNT = ((params.containsKey("h_MODIFY_COUNT")) ? (String[])params.get("h_MODIFY_COUNT") : (String[])null);
		String[] LOW_LOAD_COLOR_R = ((params.containsKey("LOW_LOAD_COLOR_R")) ? (String[])params.get("LOW_LOAD_COLOR_R") : (String[])null);
		String[] LOW_LOAD_COLOR_G = ((params.containsKey("LOW_LOAD_COLOR_G")) ? (String[])params.get("LOW_LOAD_COLOR_G") : (String[])null);
		String[] LOW_LOAD_COLOR_B = ((params.containsKey("LOW_LOAD_COLOR_B")) ? (String[])params.get("LOW_LOAD_COLOR_B") : (String[])null);
		String[] MIDDLE_LOAD_COLOR_R = ((params.containsKey("MIDDLE_LOAD_COLOR_R")) ? (String[])params.get("MIDDLE_LOAD_COLOR_R") : (String[])null);
		String[] MIDDLE_LOAD_COLOR_G = ((params.containsKey("MIDDLE_LOAD_COLOR_G")) ? (String[])params.get("MIDDLE_LOAD_COLOR_G") : (String[])null);
		String[] MIDDLE_LOAD_COLOR_B = ((params.containsKey("MIDDLE_LOAD_COLOR_B")) ? (String[])params.get("MIDDLE_LOAD_COLOR_B") : (String[])null);

		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setCHART_CD( ((CHART_CD == null) ? (String)null : CHART_CD[0]) );
		struct.setList_CHART_CD(TypeConverter.convert(CHART_CD));
		struct.setCHART_NAME( ((CHART_NAME == null) ? (String)null : CHART_NAME[0]) );
		struct.setList_CHART_NAME(TypeConverter.convert(CHART_NAME));
		struct.setCHART_TYP( ((CHART_TYP == null) ? (String)null : CHART_TYP[0]) );
		struct.setList_CHART_TYP(TypeConverter.convert(CHART_TYP));
		struct.setCHART_TYP_name( ((CHART_TYP_name == null) ? (String)null : CHART_TYP_name[0]) );
		struct.setList_CHART_TYP_name(TypeConverter.convert(CHART_TYP_name));
		struct.setCHART_TYP_val( ((CHART_TYP_val == null) ? (String)null : CHART_TYP_val[0]) );
		struct.setList_CHART_TYP_val(TypeConverter.convert(CHART_TYP_val));
		struct.setDIMENSION_TYP( ((DIMENSION_TYP == null) ? (String)null : DIMENSION_TYP[0]) );
		struct.setList_DIMENSION_TYP(TypeConverter.convert(DIMENSION_TYP));
		struct.setDIMENSION_TYP_name( ((DIMENSION_TYP_name == null) ? (String)null : DIMENSION_TYP_name[0]) );
		struct.setList_DIMENSION_TYP_name(TypeConverter.convert(DIMENSION_TYP_name));
		struct.setDIMENSION_TYP_val( ((DIMENSION_TYP_val == null) ? (String)null : DIMENSION_TYP_val[0]) );
		struct.setList_DIMENSION_TYP_val(TypeConverter.convert(DIMENSION_TYP_val));
		struct.setMAX_SCALE_RATE( ((MAX_SCALE_RATE == null) ? (String)null : MAX_SCALE_RATE[0]) );
		struct.setList_MAX_SCALE_RATE(TypeConverter.convert(MAX_SCALE_RATE));
		struct.setSCALE_STEP( ((SCALE_STEP == null) ? (String)null : SCALE_STEP[0]) );
		struct.setList_SCALE_STEP(TypeConverter.convert(SCALE_STEP));
		struct.setHIGH_LOAD( ((HIGH_LOAD == null) ? (String)null : HIGH_LOAD[0]) );
		struct.setList_HIGH_LOAD(TypeConverter.convert(HIGH_LOAD));
		struct.setMIDDLE_LOAD( ((MIDDLE_LOAD == null) ? (String)null : MIDDLE_LOAD[0]) );
		struct.setList_MIDDLE_LOAD(TypeConverter.convert(MIDDLE_LOAD));
		struct.setLOW_LOAD( ((LOW_LOAD == null) ? (String)null : LOW_LOAD[0]) );
		struct.setList_LOW_LOAD(TypeConverter.convert(LOW_LOAD));
		struct.setBACKGROUNDCOLOR_R( ((BACKGROUNDCOLOR_R == null) ? (String)null : BACKGROUNDCOLOR_R[0]) );
		struct.setList_BACKGROUNDCOLOR_R(TypeConverter.convert(BACKGROUNDCOLOR_R));
		struct.setBACKGROUNDCOLOR_G( ((BACKGROUNDCOLOR_G == null) ? (String)null : BACKGROUNDCOLOR_G[0]) );
		struct.setList_BACKGROUNDCOLOR_G(TypeConverter.convert(BACKGROUNDCOLOR_G));
		struct.setBACKGROUNDCOLOR_B( ((BACKGROUNDCOLOR_B == null) ? (String)null : BACKGROUNDCOLOR_B[0]) );
		struct.setList_BACKGROUNDCOLOR_B(TypeConverter.convert(BACKGROUNDCOLOR_B));
		struct.setCHART_COLOR0_R( ((CHART_COLOR0_R == null) ? (String)null : CHART_COLOR0_R[0]) );
		struct.setList_CHART_COLOR0_R(TypeConverter.convert(CHART_COLOR0_R));
		struct.setCHART_COLOR0_G( ((CHART_COLOR0_G == null) ? (String)null : CHART_COLOR0_G[0]) );
		struct.setList_CHART_COLOR0_G(TypeConverter.convert(CHART_COLOR0_G));
		struct.setCHART_COLOR0_B( ((CHART_COLOR0_B == null) ? (String)null : CHART_COLOR0_B[0]) );
		struct.setList_CHART_COLOR0_B(TypeConverter.convert(CHART_COLOR0_B));
		struct.setCHART_COLOR1_R( ((CHART_COLOR1_R == null) ? (String)null : CHART_COLOR1_R[0]) );
		struct.setList_CHART_COLOR1_R(TypeConverter.convert(CHART_COLOR1_R));
		struct.setCHART_COLOR1_G( ((CHART_COLOR1_G == null) ? (String)null : CHART_COLOR1_G[0]) );
		struct.setList_CHART_COLOR1_G(TypeConverter.convert(CHART_COLOR1_G));
		struct.setCHART_COLOR1_B( ((CHART_COLOR1_B == null) ? (String)null : CHART_COLOR1_B[0]) );
		struct.setList_CHART_COLOR1_B(TypeConverter.convert(CHART_COLOR1_B));
		struct.setCHART_COLOR2_R( ((CHART_COLOR2_R == null) ? (String)null : CHART_COLOR2_R[0]) );
		struct.setList_CHART_COLOR2_R(TypeConverter.convert(CHART_COLOR2_R));
		struct.setCHART_COLOR2_G( ((CHART_COLOR2_G == null) ? (String)null : CHART_COLOR2_G[0]) );
		struct.setList_CHART_COLOR2_G(TypeConverter.convert(CHART_COLOR2_G));
		struct.setCHART_COLOR2_B( ((CHART_COLOR2_B == null) ? (String)null : CHART_COLOR2_B[0]) );
		struct.setList_CHART_COLOR2_B(TypeConverter.convert(CHART_COLOR2_B));
		struct.setCHART_COLOR9_R( ((CHART_COLOR9_R == null) ? (String)null : CHART_COLOR9_R[0]) );
		struct.setList_CHART_COLOR9_R(TypeConverter.convert(CHART_COLOR9_R));
		struct.setCHART_COLOR9_G( ((CHART_COLOR9_G == null) ? (String)null : CHART_COLOR9_G[0]) );
		struct.setList_CHART_COLOR9_G(TypeConverter.convert(CHART_COLOR9_G));
		struct.setCHART_COLOR9_B( ((CHART_COLOR9_B == null) ? (String)null : CHART_COLOR9_B[0]) );
		struct.setList_CHART_COLOR9_B(TypeConverter.convert(CHART_COLOR9_B));
		struct.setHIGH_LOAD_COLOR_R( ((HIGH_LOAD_COLOR_R == null) ? (String)null : HIGH_LOAD_COLOR_R[0]) );
		struct.setList_HIGH_LOAD_COLOR_R(TypeConverter.convert(HIGH_LOAD_COLOR_R));
		struct.setHIGH_LOAD_COLOR_G( ((HIGH_LOAD_COLOR_G == null) ? (String)null : HIGH_LOAD_COLOR_G[0]) );
		struct.setList_HIGH_LOAD_COLOR_G(TypeConverter.convert(HIGH_LOAD_COLOR_G));
		struct.setHIGH_LOAD_COLOR_B( ((HIGH_LOAD_COLOR_B == null) ? (String)null : HIGH_LOAD_COLOR_B[0]) );
		struct.setList_HIGH_LOAD_COLOR_B(TypeConverter.convert(HIGH_LOAD_COLOR_B));
		struct.seth_MODIFY_COUNT( ((h_MODIFY_COUNT == null) ? (String)null : h_MODIFY_COUNT[0]) );
		struct.setList_h_MODIFY_COUNT(TypeConverter.convert(h_MODIFY_COUNT));
		struct.setLOW_LOAD_COLOR_R( ((LOW_LOAD_COLOR_R == null) ? (String)null : LOW_LOAD_COLOR_R[0]) );
		struct.setList_LOW_LOAD_COLOR_R(TypeConverter.convert(LOW_LOAD_COLOR_R));
		struct.setLOW_LOAD_COLOR_G( ((LOW_LOAD_COLOR_G == null) ? (String)null : LOW_LOAD_COLOR_G[0]) );
		struct.setList_LOW_LOAD_COLOR_G(TypeConverter.convert(LOW_LOAD_COLOR_G));
		struct.setLOW_LOAD_COLOR_B( ((LOW_LOAD_COLOR_B == null) ? (String)null : LOW_LOAD_COLOR_B[0]) );
		struct.setList_LOW_LOAD_COLOR_B(TypeConverter.convert(LOW_LOAD_COLOR_B));
		struct.setMIDDLE_LOAD_COLOR_R( ((MIDDLE_LOAD_COLOR_R == null) ? (String)null : MIDDLE_LOAD_COLOR_R[0]) );
		struct.setList_MIDDLE_LOAD_COLOR_R(TypeConverter.convert(MIDDLE_LOAD_COLOR_R));
		struct.setMIDDLE_LOAD_COLOR_G( ((MIDDLE_LOAD_COLOR_G == null) ? (String)null : MIDDLE_LOAD_COLOR_G[0]) );
		struct.setList_MIDDLE_LOAD_COLOR_G(TypeConverter.convert(MIDDLE_LOAD_COLOR_G));
		struct.setMIDDLE_LOAD_COLOR_B( ((MIDDLE_LOAD_COLOR_B == null) ? (String)null : MIDDLE_LOAD_COLOR_B[0]) );
		struct.setList_MIDDLE_LOAD_COLOR_B(TypeConverter.convert(MIDDLE_LOAD_COLOR_B));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AN0020010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAN0020010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAN0020010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AN0020010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AN0020010Entity entity = control.entity;
		AN0020010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AN0020");
		logger.entering("AN0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AN0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AN0020010Control control;
		AN0020010Entity  entity = null;
		AN0020010Struct  struct = null;

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

			if( (control = (AN0020010Control)so.getAttribute("AN0020010Control_"+request.getSession(false).getId())) == null ) {
				control = new AN0020010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AN0020010Control();
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
				} else if( isClick(request, "Update") ) {
					if ( !isCryptical(request, so, params, "Update") ) return ERROR_TARGET;
					target = onClickUpdate(request, response, so, params, control);
					control.setButton("Update");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "Close") ) {
					if ( !isCryptical(request, so, params, "Close") ) return ERROR_TARGET;
					target = onClickClose(request, response, so, params, control);
					control.setButton("Close");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AN0020010Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
                                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                                 ////! �n���ꂽ�p�����^�����ׂďo�͂���e�X�g�p�R�[�h
                                 //System.out.println("---< start >--------------------");
                                 //Enumeration paramNames = request.getParameterNames();
                                 //while (paramNames.hasMoreElements()) {
                                 //	String paramName = (String)paramNames.nextElement();
                                 //	System.out.println(" paramName: " + paramName);
                                 //	String[] paramValues = request.getParameterValues(paramName);
                                 //	if (paramValues.length == 1) {
                                 //		String paramValue = paramValues[0];
                                 //		if (paramValue.length() == 0) {
                                 //			System.out.println("paramValue: null");
                                 //		} else {
                                 //			System.out.println("paramValue: " + paramValue);
                                 //		}
                                 //	} else {
                                 //		String paramValue = paramValues[0];
                                 //		for (int i = 1; i < paramValues.length; i++) {
                                 //			paramValue = paramValue + "/" + paramValues[i];
                                 //		}
                                 //		System.out.println("paramValue: " + paramValue);
                                 //	}
                                 //}
                                 //System.out.println("---< end >----------------------");
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
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
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
	private  static boolean bFLG_DISCONNECT_Select = true;
	private  static boolean bFLG_DISCONNECT_Update = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
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
		return "com.nec.jp.orteus.metamorBase.AN0020.AN0020010Servlet";
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
	public AN0020010Servlet()
	{
		//{{user_implement_dev:<AN0020010_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_Select = true;
                bFLG_DISCONNECT_Update = true;
                bFLG_DISCONNECT_Clear = true;
                bFLG_DISCONNECT_Close = true;
              
                //}}user_implement_dev:<AN0020010_DisConnect_FLG>

		//{{user_implement_dev:<AN0020010Servlet>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AN0020010Servlet>
	}

	//////////////////////////////

}
