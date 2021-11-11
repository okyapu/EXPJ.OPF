/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0020/src/com/nec/jp/orteus/metamorBase/DA0020/DA0020010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0020;

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

public class DA0020010Servlet extends HttpServlet
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
	 * @param control DA0020010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, DA0020010Control control)
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
	 * @param control DA0020010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, DA0020010Control control)
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
	 * @param control DA0020010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
			logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              //			objMessage.m_writer.write( Level.ALL, "DA0020010"+" $Revision: 1.3 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control DA0020010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
              //			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0020010-E999","�����[�h����"));
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DA0020010Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
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
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DA0020010Control�N���X�C���X�^���X
	 */
	public String onClickInsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");
		//{{user_implement_dev:<onClickInsert>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("Insert");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickInsert>
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickInsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DA0020010Control�N���X�C���X�^���X
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
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
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DA0020010Control�N���X�C���X�^���X
	 */
	public String onClickDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickDelete");
		//{{user_implement_dev:<onClickDelete>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("Delete");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickDelete>
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickDelete");

		return nextUrl;
	}

	/**
	 * �폜����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DA0020010Control�N���X�C���X�^���X
	 */
	public String onClickCancelDelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelDelete");
		//{{user_implement_dev:<onClickCancelDelete>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("CancelDelete");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //}}user_implement_dev:<onClickCancelDelete>
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelDelete");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control DA0020010Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					DA0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
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
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, DA0020010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] h_PLANT_CD = ((params.containsKey("h_PLANT_CD")) ? (String[])params.get("h_PLANT_CD") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] YEAR = ((params.containsKey("YEAR")) ? (String[])params.get("YEAR") : (String[])null);
		String[] h_YEAR = ((params.containsKey("h_YEAR")) ? (String[])params.get("h_YEAR") : (String[])null);
		String[] HALF_TERM_TYP = ((params.containsKey("HALF_TERM_TYP")) ? (String[])params.get("HALF_TERM_TYP") : (String[])null);
		String[] HALF_TERM_TYP_name = ((params.containsKey("HALF_TERM_TYP_name")) ? (String[])params.get("HALF_TERM_TYP_name") : (String[])null);
		String[] HALF_TERM_TYP_val = ((params.containsKey("HALF_TERM_TYP_val")) ? (String[])params.get("HALF_TERM_TYP_val") : (String[])null);
		String[] h_HALF_TERM_TYP = ((params.containsKey("h_HALF_TERM_TYP")) ? (String[])params.get("h_HALF_TERM_TYP") : (String[])null);
		String[] COST_TYP = ((params.containsKey("COST_TYP")) ? (String[])params.get("COST_TYP") : (String[])null);
		String[] COST_TYP_name = ((params.containsKey("COST_TYP_name")) ? (String[])params.get("COST_TYP_name") : (String[])null);
		String[] COST_TYP_val = ((params.containsKey("COST_TYP_val")) ? (String[])params.get("COST_TYP_val") : (String[])null);
		String[] h_COST_TYP = ((params.containsKey("h_COST_TYP")) ? (String[])params.get("h_COST_TYP") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] h_ITEM_CD = ((params.containsKey("h_ITEM_CD")) ? (String[])params.get("h_ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] CS_PUCH_TYP = ((params.containsKey("CS_PUCH_TYP")) ? (String[])params.get("CS_PUCH_TYP") : (String[])null);
		String[] CS_PUCH_TYP_name = ((params.containsKey("CS_PUCH_TYP_name")) ? (String[])params.get("CS_PUCH_TYP_name") : (String[])null);
		String[] CS_PUCH_TYP_val = ((params.containsKey("CS_PUCH_TYP_val")) ? (String[])params.get("CS_PUCH_TYP_val") : (String[])null);
		String[] h_CS_PUCH_TYP = ((params.containsKey("h_CS_PUCH_TYP")) ? (String[])params.get("h_CS_PUCH_TYP") : (String[])null);
		String[] CS_PROC_CD = ((params.containsKey("CS_PROC_CD")) ? (String[])params.get("CS_PROC_CD") : (String[])null);
		String[] CS_PROC_NAME = ((params.containsKey("CS_PROC_NAME")) ? (String[])params.get("CS_PROC_NAME") : (String[])null);
		String[] UNIT_COST_ACCEPT_TYP = ((params.containsKey("UNIT_COST_ACCEPT_TYP")) ? (String[])params.get("UNIT_COST_ACCEPT_TYP") : (String[])null);
		String[] UNIT_COST_ACCEPT_TYP_name = ((params.containsKey("UNIT_COST_ACCEPT_TYP_name")) ? (String[])params.get("UNIT_COST_ACCEPT_TYP_name") : (String[])null);
		String[] UNIT_COST_ACCEPT_TYP_val = ((params.containsKey("UNIT_COST_ACCEPT_TYP_val")) ? (String[])params.get("UNIT_COST_ACCEPT_TYP_val") : (String[])null);
		String[] CLASIFICATION_CD = ((params.containsKey("CLASIFICATION_CD")) ? (String[])params.get("CLASIFICATION_CD") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] ORG_CD = ((params.containsKey("ORG_CD")) ? (String[])params.get("ORG_CD") : (String[])null);
		String[] ORG_NAME = ((params.containsKey("ORG_NAME")) ? (String[])params.get("ORG_NAME") : (String[])null);
		String[] ONEROUS_CONS_FLG = ((params.containsKey("ONEROUS_CONS_FLG")) ? (String[])params.get("ONEROUS_CONS_FLG") : (String[])null);
		String[] ONEROUS_CONS_FLG_name = ((params.containsKey("ONEROUS_CONS_FLG_name")) ? (String[])params.get("ONEROUS_CONS_FLG_name") : (String[])null);
		String[] ONEROUS_CONS_FLG_val = ((params.containsKey("ONEROUS_CONS_FLG_val")) ? (String[])params.get("ONEROUS_CONS_FLG_val") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_NAME = ((params.containsKey("VEND_NAME")) ? (String[])params.get("VEND_NAME") : (String[])null);
		String[] UNIT_COST = ((params.containsKey("UNIT_COST")) ? (String[])params.get("UNIT_COST") : (String[])null);
		String[] CUR_UNIT = ((params.containsKey("CUR_UNIT")) ? (String[])params.get("CUR_UNIT") : (String[])null);
		String[] UNIT_COST_TYP = ((params.containsKey("UNIT_COST_TYP")) ? (String[])params.get("UNIT_COST_TYP") : (String[])null);
		String[] UNIT_COST_TYP_name = ((params.containsKey("UNIT_COST_TYP_name")) ? (String[])params.get("UNIT_COST_TYP_name") : (String[])null);
		String[] UNIT_COST_TYP_val = ((params.containsKey("UNIT_COST_TYP_val")) ? (String[])params.get("UNIT_COST_TYP_val") : (String[])null);
		String[] PUCH_UNIT_QTY = ((params.containsKey("PUCH_UNIT_QTY")) ? (String[])params.get("PUCH_UNIT_QTY") : (String[])null);
		String[] CUR_CD = ((params.containsKey("CUR_CD")) ? (String[])params.get("CUR_CD") : (String[])null);
		String[] CUR_NAME = ((params.containsKey("CUR_NAME")) ? (String[])params.get("CUR_NAME") : (String[])null);
		String[] EXCH_RATE = ((params.containsKey("EXCH_RATE")) ? (String[])params.get("EXCH_RATE") : (String[])null);
		String[] SUB_VEND_CD = ((params.containsKey("SUB_VEND_CD")) ? (String[])params.get("SUB_VEND_CD") : (String[])null);
		String[] SUB_VEND_NAME = ((params.containsKey("SUB_VEND_NAME")) ? (String[])params.get("SUB_VEND_NAME") : (String[])null);
		String[] SUB_UNIT_COST = ((params.containsKey("SUB_UNIT_COST")) ? (String[])params.get("SUB_UNIT_COST") : (String[])null);
		String[] SUB_CUR_UNIT = ((params.containsKey("SUB_CUR_UNIT")) ? (String[])params.get("SUB_CUR_UNIT") : (String[])null);
		String[] SUB_UNIT_COST_TYP = ((params.containsKey("SUB_UNIT_COST_TYP")) ? (String[])params.get("SUB_UNIT_COST_TYP") : (String[])null);
		String[] SUB_UNIT_COST_TYP_name = ((params.containsKey("SUB_UNIT_COST_TYP_name")) ? (String[])params.get("SUB_UNIT_COST_TYP_name") : (String[])null);
		String[] SUB_UNIT_COST_TYP_val = ((params.containsKey("SUB_UNIT_COST_TYP_val")) ? (String[])params.get("SUB_UNIT_COST_TYP_val") : (String[])null);
		String[] SUB_PUCH_UNIT_QTY = ((params.containsKey("SUB_PUCH_UNIT_QTY")) ? (String[])params.get("SUB_PUCH_UNIT_QTY") : (String[])null);
		String[] SUB_CUR_CD = ((params.containsKey("SUB_CUR_CD")) ? (String[])params.get("SUB_CUR_CD") : (String[])null);
		String[] SUB_CUR_NAME = ((params.containsKey("SUB_CUR_NAME")) ? (String[])params.get("SUB_CUR_NAME") : (String[])null);
		String[] SUB_EXCH_RATE = ((params.containsKey("SUB_EXCH_RATE")) ? (String[])params.get("SUB_EXCH_RATE") : (String[])null);
		String[] DEL_FLG = ((params.containsKey("DEL_FLG")) ? (String[])params.get("DEL_FLG") : (String[])null);
		String[] c_NoCheckClasificationCd = ((params.containsKey("c_NoCheckClasificationCd")) ? (String[])params.get("c_NoCheckClasificationCd") : (String[])null);
		String[] c_NoCheckStockUnit = ((params.containsKey("c_NoCheckStockUnit")) ? (String[])params.get("c_NoCheckStockUnit") : (String[])null);

		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.seth_PLANT_CD( ((h_PLANT_CD == null) ? (String)null : h_PLANT_CD[0]) );
		struct.setList_h_PLANT_CD(TypeConverter.convert(h_PLANT_CD));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setYEAR( ((YEAR == null) ? (String)null : YEAR[0]) );
		struct.setList_YEAR(TypeConverter.convert(YEAR));
		struct.seth_YEAR( ((h_YEAR == null) ? (String)null : h_YEAR[0]) );
		struct.setList_h_YEAR(TypeConverter.convert(h_YEAR));
		struct.setHALF_TERM_TYP( ((HALF_TERM_TYP == null) ? (String)null : HALF_TERM_TYP[0]) );
		struct.setList_HALF_TERM_TYP(TypeConverter.convert(HALF_TERM_TYP));
		struct.setHALF_TERM_TYP_name( ((HALF_TERM_TYP_name == null) ? (String)null : HALF_TERM_TYP_name[0]) );
		struct.setList_HALF_TERM_TYP_name(TypeConverter.convert(HALF_TERM_TYP_name));
		struct.setHALF_TERM_TYP_val( ((HALF_TERM_TYP_val == null) ? (String)null : HALF_TERM_TYP_val[0]) );
		struct.setList_HALF_TERM_TYP_val(TypeConverter.convert(HALF_TERM_TYP_val));
		struct.seth_HALF_TERM_TYP( ((h_HALF_TERM_TYP == null) ? (String)null : h_HALF_TERM_TYP[0]) );
		struct.setList_h_HALF_TERM_TYP(TypeConverter.convert(h_HALF_TERM_TYP));
		struct.setCOST_TYP( ((COST_TYP == null) ? (String)null : COST_TYP[0]) );
		struct.setList_COST_TYP(TypeConverter.convert(COST_TYP));
		struct.setCOST_TYP_name( ((COST_TYP_name == null) ? (String)null : COST_TYP_name[0]) );
		struct.setList_COST_TYP_name(TypeConverter.convert(COST_TYP_name));
		struct.setCOST_TYP_val( ((COST_TYP_val == null) ? (String)null : COST_TYP_val[0]) );
		struct.setList_COST_TYP_val(TypeConverter.convert(COST_TYP_val));
		struct.seth_COST_TYP( ((h_COST_TYP == null) ? (String)null : h_COST_TYP[0]) );
		struct.setList_h_COST_TYP(TypeConverter.convert(h_COST_TYP));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.seth_ITEM_CD( ((h_ITEM_CD == null) ? (String)null : h_ITEM_CD[0]) );
		struct.setList_h_ITEM_CD(TypeConverter.convert(h_ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setCS_PUCH_TYP( ((CS_PUCH_TYP == null) ? (String)null : CS_PUCH_TYP[0]) );
		struct.setList_CS_PUCH_TYP(TypeConverter.convert(CS_PUCH_TYP));
		struct.setCS_PUCH_TYP_name( ((CS_PUCH_TYP_name == null) ? (String)null : CS_PUCH_TYP_name[0]) );
		struct.setList_CS_PUCH_TYP_name(TypeConverter.convert(CS_PUCH_TYP_name));
		struct.setCS_PUCH_TYP_val( ((CS_PUCH_TYP_val == null) ? (String)null : CS_PUCH_TYP_val[0]) );
		struct.setList_CS_PUCH_TYP_val(TypeConverter.convert(CS_PUCH_TYP_val));
		struct.seth_CS_PUCH_TYP( ((h_CS_PUCH_TYP == null) ? (String)null : h_CS_PUCH_TYP[0]) );
		struct.setList_h_CS_PUCH_TYP(TypeConverter.convert(h_CS_PUCH_TYP));
		struct.setCS_PROC_CD( ((CS_PROC_CD == null) ? (String)null : CS_PROC_CD[0]) );
		struct.setList_CS_PROC_CD(TypeConverter.convert(CS_PROC_CD));
		struct.setCS_PROC_NAME( ((CS_PROC_NAME == null) ? (String)null : CS_PROC_NAME[0]) );
		struct.setList_CS_PROC_NAME(TypeConverter.convert(CS_PROC_NAME));
		struct.setUNIT_COST_ACCEPT_TYP( ((UNIT_COST_ACCEPT_TYP == null) ? (String)null : UNIT_COST_ACCEPT_TYP[0]) );
		struct.setList_UNIT_COST_ACCEPT_TYP(TypeConverter.convert(UNIT_COST_ACCEPT_TYP));
		struct.setUNIT_COST_ACCEPT_TYP_name( ((UNIT_COST_ACCEPT_TYP_name == null) ? (String)null : UNIT_COST_ACCEPT_TYP_name[0]) );
		struct.setList_UNIT_COST_ACCEPT_TYP_name(TypeConverter.convert(UNIT_COST_ACCEPT_TYP_name));
		struct.setUNIT_COST_ACCEPT_TYP_val( ((UNIT_COST_ACCEPT_TYP_val == null) ? (String)null : UNIT_COST_ACCEPT_TYP_val[0]) );
		struct.setList_UNIT_COST_ACCEPT_TYP_val(TypeConverter.convert(UNIT_COST_ACCEPT_TYP_val));
		struct.setCLASIFICATION_CD( ((CLASIFICATION_CD == null) ? (String)null : CLASIFICATION_CD[0]) );
		struct.setList_CLASIFICATION_CD(TypeConverter.convert(CLASIFICATION_CD));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setORG_CD( ((ORG_CD == null) ? (String)null : ORG_CD[0]) );
		struct.setList_ORG_CD(TypeConverter.convert(ORG_CD));
		struct.setORG_NAME( ((ORG_NAME == null) ? (String)null : ORG_NAME[0]) );
		struct.setList_ORG_NAME(TypeConverter.convert(ORG_NAME));
		struct.setONEROUS_CONS_FLG( ((ONEROUS_CONS_FLG == null) ? (String)null : ONEROUS_CONS_FLG[0]) );
		struct.setList_ONEROUS_CONS_FLG(TypeConverter.convert(ONEROUS_CONS_FLG));
		struct.setONEROUS_CONS_FLG_name( ((ONEROUS_CONS_FLG_name == null) ? (String)null : ONEROUS_CONS_FLG_name[0]) );
		struct.setList_ONEROUS_CONS_FLG_name(TypeConverter.convert(ONEROUS_CONS_FLG_name));
		struct.setONEROUS_CONS_FLG_val( ((ONEROUS_CONS_FLG_val == null) ? (String)null : ONEROUS_CONS_FLG_val[0]) );
		struct.setList_ONEROUS_CONS_FLG_val(TypeConverter.convert(ONEROUS_CONS_FLG_val));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_NAME( ((VEND_NAME == null) ? (String)null : VEND_NAME[0]) );
		struct.setList_VEND_NAME(TypeConverter.convert(VEND_NAME));
		struct.setUNIT_COST( ((UNIT_COST == null) ? (String)null : UNIT_COST[0]) );
		struct.setList_UNIT_COST(TypeConverter.convert(UNIT_COST));
		struct.setCUR_UNIT( ((CUR_UNIT == null) ? (String)null : CUR_UNIT[0]) );
		struct.setList_CUR_UNIT(TypeConverter.convert(CUR_UNIT));
		struct.setUNIT_COST_TYP( ((UNIT_COST_TYP == null) ? (String)null : UNIT_COST_TYP[0]) );
		struct.setList_UNIT_COST_TYP(TypeConverter.convert(UNIT_COST_TYP));
		struct.setUNIT_COST_TYP_name( ((UNIT_COST_TYP_name == null) ? (String)null : UNIT_COST_TYP_name[0]) );
		struct.setList_UNIT_COST_TYP_name(TypeConverter.convert(UNIT_COST_TYP_name));
		struct.setUNIT_COST_TYP_val( ((UNIT_COST_TYP_val == null) ? (String)null : UNIT_COST_TYP_val[0]) );
		struct.setList_UNIT_COST_TYP_val(TypeConverter.convert(UNIT_COST_TYP_val));
		struct.setPUCH_UNIT_QTY( ((PUCH_UNIT_QTY == null) ? (String)null : PUCH_UNIT_QTY[0]) );
		struct.setList_PUCH_UNIT_QTY(TypeConverter.convert(PUCH_UNIT_QTY));
		struct.setCUR_CD( ((CUR_CD == null) ? (String)null : CUR_CD[0]) );
		struct.setList_CUR_CD(TypeConverter.convert(CUR_CD));
		struct.setCUR_NAME( ((CUR_NAME == null) ? (String)null : CUR_NAME[0]) );
		struct.setList_CUR_NAME(TypeConverter.convert(CUR_NAME));
		struct.setEXCH_RATE( ((EXCH_RATE == null) ? (String)null : EXCH_RATE[0]) );
		struct.setList_EXCH_RATE(TypeConverter.convert(EXCH_RATE));
		struct.setSUB_VEND_CD( ((SUB_VEND_CD == null) ? (String)null : SUB_VEND_CD[0]) );
		struct.setList_SUB_VEND_CD(TypeConverter.convert(SUB_VEND_CD));
		struct.setSUB_VEND_NAME( ((SUB_VEND_NAME == null) ? (String)null : SUB_VEND_NAME[0]) );
		struct.setList_SUB_VEND_NAME(TypeConverter.convert(SUB_VEND_NAME));
		struct.setSUB_UNIT_COST( ((SUB_UNIT_COST == null) ? (String)null : SUB_UNIT_COST[0]) );
		struct.setList_SUB_UNIT_COST(TypeConverter.convert(SUB_UNIT_COST));
		struct.setSUB_CUR_UNIT( ((SUB_CUR_UNIT == null) ? (String)null : SUB_CUR_UNIT[0]) );
		struct.setList_SUB_CUR_UNIT(TypeConverter.convert(SUB_CUR_UNIT));
		struct.setSUB_UNIT_COST_TYP( ((SUB_UNIT_COST_TYP == null) ? (String)null : SUB_UNIT_COST_TYP[0]) );
		struct.setList_SUB_UNIT_COST_TYP(TypeConverter.convert(SUB_UNIT_COST_TYP));
		struct.setSUB_UNIT_COST_TYP_name( ((SUB_UNIT_COST_TYP_name == null) ? (String)null : SUB_UNIT_COST_TYP_name[0]) );
		struct.setList_SUB_UNIT_COST_TYP_name(TypeConverter.convert(SUB_UNIT_COST_TYP_name));
		struct.setSUB_UNIT_COST_TYP_val( ((SUB_UNIT_COST_TYP_val == null) ? (String)null : SUB_UNIT_COST_TYP_val[0]) );
		struct.setList_SUB_UNIT_COST_TYP_val(TypeConverter.convert(SUB_UNIT_COST_TYP_val));
		struct.setSUB_PUCH_UNIT_QTY( ((SUB_PUCH_UNIT_QTY == null) ? (String)null : SUB_PUCH_UNIT_QTY[0]) );
		struct.setList_SUB_PUCH_UNIT_QTY(TypeConverter.convert(SUB_PUCH_UNIT_QTY));
		struct.setSUB_CUR_CD( ((SUB_CUR_CD == null) ? (String)null : SUB_CUR_CD[0]) );
		struct.setList_SUB_CUR_CD(TypeConverter.convert(SUB_CUR_CD));
		struct.setSUB_CUR_NAME( ((SUB_CUR_NAME == null) ? (String)null : SUB_CUR_NAME[0]) );
		struct.setList_SUB_CUR_NAME(TypeConverter.convert(SUB_CUR_NAME));
		struct.setSUB_EXCH_RATE( ((SUB_EXCH_RATE == null) ? (String)null : SUB_EXCH_RATE[0]) );
		struct.setList_SUB_EXCH_RATE(TypeConverter.convert(SUB_EXCH_RATE));
		struct.setDEL_FLG( ((DEL_FLG == null) ? (String)null : DEL_FLG[0]) );
		struct.setList_DEL_FLG(TypeConverter.convert(DEL_FLG));
		struct.setc_NoCheckClasificationCd( ((c_NoCheckClasificationCd == null) ? (String)null : c_NoCheckClasificationCd[0]) );
		struct.setList_c_NoCheckClasificationCd(TypeConverter.convert(c_NoCheckClasificationCd));
		struct.setc_NoCheckStockUnit( ((c_NoCheckStockUnit == null) ? (String)null : c_NoCheckStockUnit[0]) );
		struct.setList_c_NoCheckStockUnit(TypeConverter.convert(c_NoCheckStockUnit));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/DA0020010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aDA0020010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aDA0020010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					DA0020010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		DA0020010Entity entity = control.entity;
		DA0020010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("DA0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		DA0020010Control control;
		DA0020010Entity  entity = null;
		DA0020010Struct  struct = null;

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

			if( (control = (DA0020010Control)so.getAttribute("DA0020010Control_"+request.getSession(false).getId())) == null ) {
				control = new DA0020010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new DA0020010Control();
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
				} else if( isClick(request, "Insert") ) {
					if ( !isCryptical(request, so, params, "Insert") ) return ERROR_TARGET;
					target = onClickInsert(request, response, so, params, control);
					control.setButton("Insert");
				} else if( isClick(request, "Update") ) {
					if ( !isCryptical(request, so, params, "Update") ) return ERROR_TARGET;
					target = onClickUpdate(request, response, so, params, control);
					control.setButton("Update");
				} else if( isClick(request, "Delete") ) {
					if ( !isCryptical(request, so, params, "Delete") ) return ERROR_TARGET;
					target = onClickDelete(request, response, so, params, control);
					control.setButton("Delete");
				} else if( isClick(request, "CancelDelete") ) {
					if ( !isCryptical(request, so, params, "CancelDelete") ) return ERROR_TARGET;
					target = onClickCancelDelete(request, response, so, params, control);
					control.setButton("CancelDelete");
				} else if( isClick(request, "Clear") ) {
					if ( !isCryptical(request, so, params, "Clear") ) return ERROR_TARGET;
					target = onClickClear(request, response, so, params, control);
					control.setButton("Clear");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("DA0020010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "Insert") && bFLG_DISCONNECT_Insert)
				|| (isClick(request, "Update") && bFLG_DISCONNECT_Update)
				|| (isClick(request, "Delete") && bFLG_DISCONNECT_Delete)
				|| (isClick(request, "CancelDelete") && bFLG_DISCONNECT_CancelDelete)
				|| (isClick(request, "Clear") && bFLG_DISCONNECT_Clear)
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
	private  static boolean bFLG_DISCONNECT_Insert = true;
	private  static boolean bFLG_DISCONNECT_Update = true;
	private  static boolean bFLG_DISCONNECT_Delete = true;
	private  static boolean bFLG_DISCONNECT_CancelDelete = true;
	private  static boolean bFLG_DISCONNECT_Clear = true;

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
		return "com.nec.jp.orteus.metamorBase.DA0020.DA0020010Servlet";
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
	public DA0020010Servlet()
	{
		//{{user_implement_dev:<DA0020010_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_Select = true;
                bFLG_DISCONNECT_Insert = true;
                bFLG_DISCONNECT_Update = true;
                bFLG_DISCONNECT_Delete = true;
                bFLG_DISCONNECT_CancelDelete = true;
                bFLG_DISCONNECT_Clear = true;
              
                //}}user_implement_dev:<DA0020010_DisConnect_FLG>

		//{{user_implement_dev:<DA0020010Servlet>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<DA0020010Servlet>
	}

	//////////////////////////////

}
