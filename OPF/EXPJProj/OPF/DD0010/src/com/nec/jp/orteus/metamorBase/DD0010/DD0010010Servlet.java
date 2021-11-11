/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0010/src/com/nec/jp/orteus/metamorBase/DD0010/DD0010010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.DD0010;

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

public class DD0010010Servlet extends HttpServlet
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
	 * @param control DD0010010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, DD0010010Control control)
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
String[] PLANT_CD = (String[]) params.get("PLANT_CD");
control.setPlantCd((PLANT_CD == null) ? null : PLANT_CD[0]);
String[] YEAR = (String[]) params.get("YEAR");
control.setYear((YEAR == null) ? null : YEAR[0]);
String[] HALF_TERM_TYP = (String[]) params.get("HALF_TERM_TYP");
control.setHalfTermTyp((HALF_TERM_TYP == null) ? null : HALF_TERM_TYP[0]);
String[] ROOT_ITEM_CD = (String[]) params.get("ROOT_ITEM_CD");
control.setRootItemCd((ROOT_ITEM_CD == null) ? null : ROOT_ITEM_CD[0]);
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control DD0010010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, DD0010010Control control)
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
	 * @param control DD0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DD0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DD0010010Entity entity = control.entity;
		DD0010010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
			logger.entering("DD0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              //			objMessage.m_writer.write( Level.ALL, "DD0010010"+" $Revision: 1.5 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("DD0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control DD0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DD0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DD0010010Entity entity = control.entity;
		DD0010010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
              //			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DD0010010-E999","�����[�h����"));
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("DD0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DD0010010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DD0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DD0010010Entity entity = control.entity;
		DD0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * FlashTree�������{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DD0010010Control�N���X�C���X�^���X
	 */
	public String onClickFlashTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DD0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DD0010010Entity entity = control.entity;
		DD0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");
		//{{user_implement_dev:<onClickFlashTree>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("FlashTree");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickFlashTree>
		logger.exiting("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickFlashTree");

		return nextUrl;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DD0010010Control�N���X�C���X�^���X
	 */
	public String onClickCsvOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DD0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DD0010010Entity entity = control.entity;
		DD0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");
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
		logger.exiting("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DD0010010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DD0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DD0010010Entity entity = control.entity;
		DD0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * AddTree�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DD0010010Control�N���X�C���X�^���X
	 */
	public String onClickAddTree(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DD0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/DD0010010Control.jsp";		// �ړ���t�q�k
		DD0010010Entity entity = control.entity;
		DD0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");
		//{{user_implement_dev:<onClickAddTree>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("AddTree");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickAddTree>
		logger.exiting("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickAddTree");

		return nextUrl;
	}

	/**
	 * ShowDetail�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DD0010010Control�N���X�C���X�^���X
	 */
	public String onClickShowDetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DD0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = "/DD0010010Detail.jsp";		// �ړ���t�q�k
		DD0010010Entity entity = control.entity;
		DD0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");
		//{{user_implement_dev:<onClickShowDetail>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("ShowDetail");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickShowDetail>
		logger.exiting("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickShowDetail");

		return nextUrl;
	}

	/**
	 * �ꗗ�\���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DD0010010Control�N���X�C���X�^���X
	 */
	public String onClickMoveList(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DD0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DD0010010Entity entity = control.entity;
		DD0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickMoveList");
		//{{user_implement_dev:<onClickMoveList>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("MoveList");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickMoveList>
		logger.exiting("DD0010010Servlet"+":USER="+request.getRemoteUser(),"onClickMoveList");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, DD0010010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] d_PARENT_ITEM_CD = ((params.containsKey("d_PARENT_ITEM_CD")) ? (String[])params.get("d_PARENT_ITEM_CD") : (String[])null);
		String[] d_PARENT_ITEM_NAME = ((params.containsKey("d_PARENT_ITEM_NAME")) ? (String[])params.get("d_PARENT_ITEM_NAME") : (String[])null);
		String[] d_ITEM_CD = ((params.containsKey("d_ITEM_CD")) ? (String[])params.get("d_ITEM_CD") : (String[])null);
		String[] d_ITEM_NAME = ((params.containsKey("d_ITEM_NAME")) ? (String[])params.get("d_ITEM_NAME") : (String[])null);
		String[] d_MRP_ODR_TYP_DN = ((params.containsKey("d_MRP_ODR_TYP_DN")) ? (String[])params.get("d_MRP_ODR_TYP_DN") : (String[])null);
		String[] d_OUTSIDE_TYP_DN = ((params.containsKey("d_OUTSIDE_TYP_DN")) ? (String[])params.get("d_OUTSIDE_TYP_DN") : (String[])null);
		String[] d_PROC_OUTSIDE_TYP_DN = ((params.containsKey("d_PROC_OUTSIDE_TYP_DN")) ? (String[])params.get("d_PROC_OUTSIDE_TYP_DN") : (String[])null);
		String[] d_PS_UNIT_QTY = ((params.containsKey("d_PS_UNIT_QTY")) ? (String[])params.get("d_PS_UNIT_QTY") : (String[])null);
		String[] d_STOCK_UNIT = ((params.containsKey("d_STOCK_UNIT")) ? (String[])params.get("d_STOCK_UNIT") : (String[])null);
		String[] d_NECESSARY_QTY = ((params.containsKey("d_NECESSARY_QTY")) ? (String[])params.get("d_NECESSARY_QTY") : (String[])null);
		String[] d_PS_INPUT_RATIO = ((params.containsKey("d_PS_INPUT_RATIO")) ? (String[])params.get("d_PS_INPUT_RATIO") : (String[])null);
		String[] d_ITEM_INPUT_RATIO = ((params.containsKey("d_ITEM_INPUT_RATIO")) ? (String[])params.get("d_ITEM_INPUT_RATIO") : (String[])null);
		String[] d_TOTAL_COST = ((params.containsKey("d_TOTAL_COST")) ? (String[])params.get("d_TOTAL_COST") : (String[])null);
		String[] d_HOME_CUR_UNIT = ((params.containsKey("d_HOME_CUR_UNIT")) ? (String[])params.get("d_HOME_CUR_UNIT") : (String[])null);
		String[] d_OWN_MATR_COST = ((params.containsKey("d_OWN_MATR_COST")) ? (String[])params.get("d_OWN_MATR_COST") : (String[])null);
		String[] d_TOTAL_MATR_COST = ((params.containsKey("d_TOTAL_MATR_COST")) ? (String[])params.get("d_TOTAL_MATR_COST") : (String[])null);
		String[] d_OWN_SBCNT_MATR_COST = ((params.containsKey("d_OWN_SBCNT_MATR_COST")) ? (String[])params.get("d_OWN_SBCNT_MATR_COST") : (String[])null);
		String[] d_TOTAL_SBCNT_MATR_COST = ((params.containsKey("d_TOTAL_SBCNT_MATR_COST")) ? (String[])params.get("d_TOTAL_SBCNT_MATR_COST") : (String[])null);
		String[] d_OWN_PROC_COST_SUM_ALL = ((params.containsKey("d_OWN_PROC_COST_SUM_ALL")) ? (String[])params.get("d_OWN_PROC_COST_SUM_ALL") : (String[])null);
		String[] d_TOTAL_PROC_COST_SUM_ALL = ((params.containsKey("d_TOTAL_PROC_COST_SUM_ALL")) ? (String[])params.get("d_TOTAL_PROC_COST_SUM_ALL") : (String[])null);
		String[] d_VOLUNT_SPL_FLG_DN = ((params.containsKey("d_VOLUNT_SPL_FLG_DN")) ? (String[])params.get("d_VOLUNT_SPL_FLG_DN") : (String[])null);
		String[] d_ONEROUS_CONS_FLG_DN = ((params.containsKey("d_ONEROUS_CONS_FLG_DN")) ? (String[])params.get("d_ONEROUS_CONS_FLG_DN") : (String[])null);
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] YEAR = ((params.containsKey("YEAR")) ? (String[])params.get("YEAR") : (String[])null);
		String[] HALF_TERM_TYP = ((params.containsKey("HALF_TERM_TYP")) ? (String[])params.get("HALF_TERM_TYP") : (String[])null);
		String[] HALF_TERM_TYP_name = ((params.containsKey("HALF_TERM_TYP_name")) ? (String[])params.get("HALF_TERM_TYP_name") : (String[])null);
		String[] HALF_TERM_TYP_val = ((params.containsKey("HALF_TERM_TYP_val")) ? (String[])params.get("HALF_TERM_TYP_val") : (String[])null);
		String[] ROOT_ITEM_CD = ((params.containsKey("ROOT_ITEM_CD")) ? (String[])params.get("ROOT_ITEM_CD") : (String[])null);
		String[] ROOT_ITEM_NAME = ((params.containsKey("ROOT_ITEM_NAME")) ? (String[])params.get("ROOT_ITEM_NAME") : (String[])null);
		String[] InitLevel = ((params.containsKey("InitLevel")) ? (String[])params.get("InitLevel") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] h_MaxLevel = ((params.containsKey("h_MaxLevel")) ? (String[])params.get("h_MaxLevel") : (String[])null);
		String[] h_ProcTyp = ((params.containsKey("h_ProcTyp")) ? (String[])params.get("h_ProcTyp") : (String[])null);
		String[] DD0010010tree1 = ((params.containsKey("DD0010010tree1")) ? (String[])params.get("DD0010010tree1") : (String[])null);
		String[] id = ((params.containsKey("id")) ? (String[])params.get("id") : (String[])null);
		String[] lvl = ((params.containsKey("lvl")) ? (String[])params.get("lvl") : (String[])null);
		String[] parent = ((params.containsKey("parent")) ? (String[])params.get("parent") : (String[])null);
		String[] label = ((params.containsKey("label")) ? (String[])params.get("label") : (String[])null);
		String[] ctx = ((params.containsKey("ctx")) ? (String[])params.get("ctx") : (String[])null);
		String[] maxid = ((params.containsKey("maxid")) ? (String[])params.get("maxid") : (String[])null);
		String[] t_ITEM_CD = ((params.containsKey("t_ITEM_CD")) ? (String[])params.get("t_ITEM_CD") : (String[])null);
		String[] t_ITEM_NAME = ((params.containsKey("t_ITEM_NAME")) ? (String[])params.get("t_ITEM_NAME") : (String[])null);
		String[] t_PARENT_ITEM_CD = ((params.containsKey("t_PARENT_ITEM_CD")) ? (String[])params.get("t_PARENT_ITEM_CD") : (String[])null);
		String[] t_PS_EDITION = ((params.containsKey("t_PS_EDITION")) ? (String[])params.get("t_PS_EDITION") : (String[])null);
		String[] t_EFF_PHASE_IN_DATE = ((params.containsKey("t_EFF_PHASE_IN_DATE")) ? (String[])params.get("t_EFF_PHASE_IN_DATE") : (String[])null);
		String[] t_EFF_PHASE_OUT_DATE = ((params.containsKey("t_EFF_PHASE_OUT_DATE")) ? (String[])params.get("t_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] t_DMY_ITEM_FLG = ((params.containsKey("t_DMY_ITEM_FLG")) ? (String[])params.get("t_DMY_ITEM_FLG") : (String[])null);
		String[] t_COST_EXCLUDE_FLG = ((params.containsKey("t_COST_EXCLUDE_FLG")) ? (String[])params.get("t_COST_EXCLUDE_FLG") : (String[])null);
		String[] d_CLASIFICATION_CD = ((params.containsKey("d_CLASIFICATION_CD")) ? (String[])params.get("d_CLASIFICATION_CD") : (String[])null);
		String[] d_CS_PROC_CD = ((params.containsKey("d_CS_PROC_CD")) ? (String[])params.get("d_CS_PROC_CD") : (String[])null);
		String[] d_CS_PROC_NAME = ((params.containsKey("d_CS_PROC_NAME")) ? (String[])params.get("d_CS_PROC_NAME") : (String[])null);
		String[] t_YEAR = ((params.containsKey("t_YEAR")) ? (String[])params.get("t_YEAR") : (String[])null);
		String[] t_HALF_TERM_TYP = ((params.containsKey("t_HALF_TERM_TYP")) ? (String[])params.get("t_HALF_TERM_TYP") : (String[])null);
		String[] t_PLANT_CD = ((params.containsKey("t_PLANT_CD")) ? (String[])params.get("t_PLANT_CD") : (String[])null);
		String[] t_ROOT_ITEM_CD = ((params.containsKey("t_ROOT_ITEM_CD")) ? (String[])params.get("t_ROOT_ITEM_CD") : (String[])null);
		String[] t_COST_STATEMENT_NO = ((params.containsKey("t_COST_STATEMENT_NO")) ? (String[])params.get("t_COST_STATEMENT_NO") : (String[])null);
		String[] d_COST_UP_TYP_DN = ((params.containsKey("d_COST_UP_TYP_DN")) ? (String[])params.get("d_COST_UP_TYP_DN") : (String[])null);

		struct.setd_PARENT_ITEM_CD( ((d_PARENT_ITEM_CD == null) ? (String)null : d_PARENT_ITEM_CD[0]) );
		struct.setList_d_PARENT_ITEM_CD(TypeConverter.convert(d_PARENT_ITEM_CD));
		struct.setd_PARENT_ITEM_NAME( ((d_PARENT_ITEM_NAME == null) ? (String)null : d_PARENT_ITEM_NAME[0]) );
		struct.setList_d_PARENT_ITEM_NAME(TypeConverter.convert(d_PARENT_ITEM_NAME));
		struct.setd_ITEM_CD( ((d_ITEM_CD == null) ? (String)null : d_ITEM_CD[0]) );
		struct.setList_d_ITEM_CD(TypeConverter.convert(d_ITEM_CD));
		struct.setd_ITEM_NAME( ((d_ITEM_NAME == null) ? (String)null : d_ITEM_NAME[0]) );
		struct.setList_d_ITEM_NAME(TypeConverter.convert(d_ITEM_NAME));
		struct.setd_MRP_ODR_TYP_DN( ((d_MRP_ODR_TYP_DN == null) ? (String)null : d_MRP_ODR_TYP_DN[0]) );
		struct.setList_d_MRP_ODR_TYP_DN(TypeConverter.convert(d_MRP_ODR_TYP_DN));
		struct.setd_OUTSIDE_TYP_DN( ((d_OUTSIDE_TYP_DN == null) ? (String)null : d_OUTSIDE_TYP_DN[0]) );
		struct.setList_d_OUTSIDE_TYP_DN(TypeConverter.convert(d_OUTSIDE_TYP_DN));
		struct.setd_PROC_OUTSIDE_TYP_DN( ((d_PROC_OUTSIDE_TYP_DN == null) ? (String)null : d_PROC_OUTSIDE_TYP_DN[0]) );
		struct.setList_d_PROC_OUTSIDE_TYP_DN(TypeConverter.convert(d_PROC_OUTSIDE_TYP_DN));
		struct.setd_PS_UNIT_QTY( ((d_PS_UNIT_QTY == null) ? (String)null : d_PS_UNIT_QTY[0]) );
		struct.setList_d_PS_UNIT_QTY(TypeConverter.convert(d_PS_UNIT_QTY));
		struct.setd_STOCK_UNIT( ((d_STOCK_UNIT == null) ? (String)null : d_STOCK_UNIT[0]) );
		struct.setList_d_STOCK_UNIT(TypeConverter.convert(d_STOCK_UNIT));
		struct.setd_NECESSARY_QTY( ((d_NECESSARY_QTY == null) ? (String)null : d_NECESSARY_QTY[0]) );
		struct.setList_d_NECESSARY_QTY(TypeConverter.convert(d_NECESSARY_QTY));
		struct.setd_PS_INPUT_RATIO( ((d_PS_INPUT_RATIO == null) ? (String)null : d_PS_INPUT_RATIO[0]) );
		struct.setList_d_PS_INPUT_RATIO(TypeConverter.convert(d_PS_INPUT_RATIO));
		struct.setd_ITEM_INPUT_RATIO( ((d_ITEM_INPUT_RATIO == null) ? (String)null : d_ITEM_INPUT_RATIO[0]) );
		struct.setList_d_ITEM_INPUT_RATIO(TypeConverter.convert(d_ITEM_INPUT_RATIO));
		struct.setd_TOTAL_COST( ((d_TOTAL_COST == null) ? (String)null : d_TOTAL_COST[0]) );
		struct.setList_d_TOTAL_COST(TypeConverter.convert(d_TOTAL_COST));
		struct.setd_HOME_CUR_UNIT( ((d_HOME_CUR_UNIT == null) ? (String)null : d_HOME_CUR_UNIT[0]) );
		struct.setList_d_HOME_CUR_UNIT(TypeConverter.convert(d_HOME_CUR_UNIT));
		struct.setd_OWN_MATR_COST( ((d_OWN_MATR_COST == null) ? (String)null : d_OWN_MATR_COST[0]) );
		struct.setList_d_OWN_MATR_COST(TypeConverter.convert(d_OWN_MATR_COST));
		struct.setd_TOTAL_MATR_COST( ((d_TOTAL_MATR_COST == null) ? (String)null : d_TOTAL_MATR_COST[0]) );
		struct.setList_d_TOTAL_MATR_COST(TypeConverter.convert(d_TOTAL_MATR_COST));
		struct.setd_OWN_SBCNT_MATR_COST( ((d_OWN_SBCNT_MATR_COST == null) ? (String)null : d_OWN_SBCNT_MATR_COST[0]) );
		struct.setList_d_OWN_SBCNT_MATR_COST(TypeConverter.convert(d_OWN_SBCNT_MATR_COST));
		struct.setd_TOTAL_SBCNT_MATR_COST( ((d_TOTAL_SBCNT_MATR_COST == null) ? (String)null : d_TOTAL_SBCNT_MATR_COST[0]) );
		struct.setList_d_TOTAL_SBCNT_MATR_COST(TypeConverter.convert(d_TOTAL_SBCNT_MATR_COST));
		struct.setd_OWN_PROC_COST_SUM_ALL( ((d_OWN_PROC_COST_SUM_ALL == null) ? (String)null : d_OWN_PROC_COST_SUM_ALL[0]) );
		struct.setList_d_OWN_PROC_COST_SUM_ALL(TypeConverter.convert(d_OWN_PROC_COST_SUM_ALL));
		struct.setd_TOTAL_PROC_COST_SUM_ALL( ((d_TOTAL_PROC_COST_SUM_ALL == null) ? (String)null : d_TOTAL_PROC_COST_SUM_ALL[0]) );
		struct.setList_d_TOTAL_PROC_COST_SUM_ALL(TypeConverter.convert(d_TOTAL_PROC_COST_SUM_ALL));
		struct.setd_VOLUNT_SPL_FLG_DN( ((d_VOLUNT_SPL_FLG_DN == null) ? (String)null : d_VOLUNT_SPL_FLG_DN[0]) );
		struct.setList_d_VOLUNT_SPL_FLG_DN(TypeConverter.convert(d_VOLUNT_SPL_FLG_DN));
		struct.setd_ONEROUS_CONS_FLG_DN( ((d_ONEROUS_CONS_FLG_DN == null) ? (String)null : d_ONEROUS_CONS_FLG_DN[0]) );
		struct.setList_d_ONEROUS_CONS_FLG_DN(TypeConverter.convert(d_ONEROUS_CONS_FLG_DN));
		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setYEAR( ((YEAR == null) ? (String)null : YEAR[0]) );
		struct.setList_YEAR(TypeConverter.convert(YEAR));
		struct.setHALF_TERM_TYP( ((HALF_TERM_TYP == null) ? (String)null : HALF_TERM_TYP[0]) );
		struct.setList_HALF_TERM_TYP(TypeConverter.convert(HALF_TERM_TYP));
		struct.setHALF_TERM_TYP_name( ((HALF_TERM_TYP_name == null) ? (String)null : HALF_TERM_TYP_name[0]) );
		struct.setList_HALF_TERM_TYP_name(TypeConverter.convert(HALF_TERM_TYP_name));
		struct.setHALF_TERM_TYP_val( ((HALF_TERM_TYP_val == null) ? (String)null : HALF_TERM_TYP_val[0]) );
		struct.setList_HALF_TERM_TYP_val(TypeConverter.convert(HALF_TERM_TYP_val));
		struct.setROOT_ITEM_CD( ((ROOT_ITEM_CD == null) ? (String)null : ROOT_ITEM_CD[0]) );
		struct.setList_ROOT_ITEM_CD(TypeConverter.convert(ROOT_ITEM_CD));
		struct.setROOT_ITEM_NAME( ((ROOT_ITEM_NAME == null) ? (String)null : ROOT_ITEM_NAME[0]) );
		struct.setList_ROOT_ITEM_NAME(TypeConverter.convert(ROOT_ITEM_NAME));
		struct.setInitLevel( ((InitLevel == null) ? (String)null : InitLevel[0]) );
		struct.setList_InitLevel(TypeConverter.convert(InitLevel));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.seth_MaxLevel( ((h_MaxLevel == null) ? (String)null : h_MaxLevel[0]) );
		struct.setList_h_MaxLevel(TypeConverter.convert(h_MaxLevel));
		struct.seth_ProcTyp( ((h_ProcTyp == null) ? (String)null : h_ProcTyp[0]) );
		struct.setList_h_ProcTyp(TypeConverter.convert(h_ProcTyp));
		struct.setDD0010010tree1( ((DD0010010tree1 == null) ? (String)null : DD0010010tree1[0]) );
		struct.setList_DD0010010tree1(TypeConverter.convert(DD0010010tree1));
		struct.setid( ((id == null) ? (String)null : id[0]) );
		struct.setList_id(TypeConverter.convert(id));
		struct.setlvl( ((lvl == null) ? (String)null : lvl[0]) );
		struct.setList_lvl(TypeConverter.convert(lvl));
		struct.setparent( ((parent == null) ? (String)null : parent[0]) );
		struct.setList_parent(TypeConverter.convert(parent));
		struct.setlabel( ((label == null) ? (String)null : label[0]) );
		struct.setList_label(TypeConverter.convert(label));
		struct.setctx( ((ctx == null) ? (String)null : ctx[0]) );
		struct.setList_ctx(TypeConverter.convert(ctx));
		struct.setmaxid( ((maxid == null) ? (String)null : maxid[0]) );
		struct.setList_maxid(TypeConverter.convert(maxid));
		struct.sett_ITEM_CD( ((t_ITEM_CD == null) ? (String)null : t_ITEM_CD[0]) );
		struct.setList_t_ITEM_CD(TypeConverter.convert(t_ITEM_CD));
		struct.sett_ITEM_NAME( ((t_ITEM_NAME == null) ? (String)null : t_ITEM_NAME[0]) );
		struct.setList_t_ITEM_NAME(TypeConverter.convert(t_ITEM_NAME));
		struct.sett_PARENT_ITEM_CD( ((t_PARENT_ITEM_CD == null) ? (String)null : t_PARENT_ITEM_CD[0]) );
		struct.setList_t_PARENT_ITEM_CD(TypeConverter.convert(t_PARENT_ITEM_CD));
		struct.sett_PS_EDITION( ((t_PS_EDITION == null) ? (String)null : t_PS_EDITION[0]) );
		struct.setList_t_PS_EDITION(TypeConverter.convert(t_PS_EDITION));
		struct.sett_EFF_PHASE_IN_DATE( ((t_EFF_PHASE_IN_DATE == null) ? (String)null : t_EFF_PHASE_IN_DATE[0]) );
		struct.setList_t_EFF_PHASE_IN_DATE(TypeConverter.convert(t_EFF_PHASE_IN_DATE));
		struct.sett_EFF_PHASE_OUT_DATE( ((t_EFF_PHASE_OUT_DATE == null) ? (String)null : t_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_t_EFF_PHASE_OUT_DATE(TypeConverter.convert(t_EFF_PHASE_OUT_DATE));
		struct.sett_DMY_ITEM_FLG( ((t_DMY_ITEM_FLG == null) ? (String)null : t_DMY_ITEM_FLG[0]) );
		struct.setList_t_DMY_ITEM_FLG(TypeConverter.convert(t_DMY_ITEM_FLG));
		struct.sett_COST_EXCLUDE_FLG( ((t_COST_EXCLUDE_FLG == null) ? (String)null : t_COST_EXCLUDE_FLG[0]) );
		struct.setList_t_COST_EXCLUDE_FLG(TypeConverter.convert(t_COST_EXCLUDE_FLG));
		struct.setd_CLASIFICATION_CD( ((d_CLASIFICATION_CD == null) ? (String)null : d_CLASIFICATION_CD[0]) );
		struct.setList_d_CLASIFICATION_CD(TypeConverter.convert(d_CLASIFICATION_CD));
		struct.setd_CS_PROC_CD( ((d_CS_PROC_CD == null) ? (String)null : d_CS_PROC_CD[0]) );
		struct.setList_d_CS_PROC_CD(TypeConverter.convert(d_CS_PROC_CD));
		struct.setd_CS_PROC_NAME( ((d_CS_PROC_NAME == null) ? (String)null : d_CS_PROC_NAME[0]) );
		struct.setList_d_CS_PROC_NAME(TypeConverter.convert(d_CS_PROC_NAME));
		struct.sett_YEAR( ((t_YEAR == null) ? (String)null : t_YEAR[0]) );
		struct.setList_t_YEAR(TypeConverter.convert(t_YEAR));
		struct.sett_HALF_TERM_TYP( ((t_HALF_TERM_TYP == null) ? (String)null : t_HALF_TERM_TYP[0]) );
		struct.setList_t_HALF_TERM_TYP(TypeConverter.convert(t_HALF_TERM_TYP));
		struct.sett_PLANT_CD( ((t_PLANT_CD == null) ? (String)null : t_PLANT_CD[0]) );
		struct.setList_t_PLANT_CD(TypeConverter.convert(t_PLANT_CD));
		struct.sett_ROOT_ITEM_CD( ((t_ROOT_ITEM_CD == null) ? (String)null : t_ROOT_ITEM_CD[0]) );
		struct.setList_t_ROOT_ITEM_CD(TypeConverter.convert(t_ROOT_ITEM_CD));
		struct.sett_COST_STATEMENT_NO( ((t_COST_STATEMENT_NO == null) ? (String)null : t_COST_STATEMENT_NO[0]) );
		struct.setList_t_COST_STATEMENT_NO(TypeConverter.convert(t_COST_STATEMENT_NO));
		struct.setd_COST_UP_TYP_DN( ((d_COST_UP_TYP_DN == null) ? (String)null : d_COST_UP_TYP_DN[0]) );
		struct.setList_d_COST_UP_TYP_DN(TypeConverter.convert(d_COST_UP_TYP_DN));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/DD0010010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aDD0010010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aDD0010010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					DD0010010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DD0010010Entity entity = control.entity;
		DD0010010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("DD0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		DD0010010Control control;
		DD0010010Entity  entity = null;
		DD0010010Struct  struct = null;

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

			if( (control = (DD0010010Control)so.getAttribute("DD0010010Control_"+request.getSession(false).getId())) == null ) {
				control = new DD0010010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new DD0010010Control();
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
				} else if( isClick(request, "FlashTree") ) {
					if ( !isCryptical(request, so, params, "FlashTree") ) return ERROR_TARGET;
					target = onClickFlashTree(request, response, so, params, control);
					control.setButton("FlashTree");
				} else if( isClick(request, "CsvOut") ) {
					if ( !isCryptical(request, so, params, "CsvOut") ) return ERROR_TARGET;
					target = onClickCsvOut(request, response, so, params, control);
					control.setButton("CsvOut");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else if( isClick(request, "AddTree") ) {
					if ( !isCryptical(request, so, params, "AddTree") ) return ERROR_TARGET;
					target = onClickAddTree(request, response, so, params, control);
					control.setButton("AddTree");
				} else if( isClick(request, "ShowDetail") ) {
					if ( !isCryptical(request, so, params, "ShowDetail") ) return ERROR_TARGET;
					target = onClickShowDetail(request, response, so, params, control);
					control.setButton("ShowDetail");
				} else if( isClick(request, "MoveList") ) {
					if ( !isCryptical(request, so, params, "MoveList") ) return ERROR_TARGET;
					target = onClickMoveList(request, response, so, params, control);
					control.setButton("MoveList");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("DD0010010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "FlashTree") && bFLG_DISCONNECT_FlashTree)
				|| (isClick(request, "CsvOut") && bFLG_DISCONNECT_CsvOut)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
				|| (isClick(request, "AddTree") && bFLG_DISCONNECT_AddTree)
				|| (isClick(request, "ShowDetail") && bFLG_DISCONNECT_ShowDetail)
				|| (isClick(request, "MoveList") && bFLG_DISCONNECT_MoveList)
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
	private  static boolean bFLG_DISCONNECT_FlashTree = true;
	private  static boolean bFLG_DISCONNECT_CsvOut = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;
	private  static boolean bFLG_DISCONNECT_AddTree = true;
	private  static boolean bFLG_DISCONNECT_ShowDetail = true;
	private  static boolean bFLG_DISCONNECT_MoveList = true;

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
		return "com.nec.jp.orteus.metamorBase.DD0010.DD0010010Servlet";
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
	public DD0010010Servlet()
	{
		//{{user_implement_dev:<DD0010010_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_Select = true;
                bFLG_DISCONNECT_FlashTree = true;
                bFLG_DISCONNECT_CsvOut = true;
                bFLG_DISCONNECT_Clear = true;
                bFLG_DISCONNECT_AddTree = true;
                bFLG_DISCONNECT_ShowDetail = true;
              
                //}}user_implement_dev:<DD0010010_DisConnect_FLG>

		//{{user_implement_dev:<DD0010010Servlet>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<DD0010010Servlet>
	}

	//////////////////////////////

}
