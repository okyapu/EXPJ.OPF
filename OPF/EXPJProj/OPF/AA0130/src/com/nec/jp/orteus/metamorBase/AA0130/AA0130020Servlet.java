/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0130/src/com/nec/jp/orteus/metamorBase/AA0130/AA0130020Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0130;

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

public class AA0130020Servlet extends HttpServlet
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
	 * @param control AA0130020Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AA0130020Control control)
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
	 * @param control AA0130020Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AA0130020Control control)
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

String[] lowerItemCds = null;
if (params.containsKey("Lower_ITEM_CD")) {
 lowerItemCds = (String[])params.get("Lower_ITEM_CD");
} else {
 lowerItemCds = (String[])null;
}
if (lowerItemCds == null) {
 control.setITEM_CD((String)null);
} else {
 control.setITEM_CD(lowerItemCds[0]);
}

String[] targetDates = null;
if (params.containsKey("TargetDate")) {
 targetDates = (String[])params.get("TargetDate");
} else {
 targetDates = (String[])null;
}
if (targetDates == null) {
 control.setTargetDate((String)null);
} else {
 control.setTargetDate(targetDates[0]);
}

String[] developTyp = null;
if (params.containsKey("DEVELOP_TYP")) {
 developTyp = (String[])params.get("DEVELOP_TYP");
} else {
 developTyp = (String[])null;
}
if (developTyp == null) {
 control.setDEVELOP_TYP((String)null);
} else {
 control.setDEVELOP_TYP(developTyp[0]);
}

String[] procTyp = null;
if (params.containsKey("h_ProcTyp")) {
 procTyp = (String[])params.get("h_ProcTyp");
} else {
 procTyp = (String[])null;
}
if (procTyp == null) {
 control.setProcTyp((String)null);
} else {
 control.setProcTyp(procTyp[0]);
}

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
	 * @param control AA0130020Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0130020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0130020Entity entity = control.entity;
		AA0130020Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0130");
			logger.entering("AA0130020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              //			objMessage.m_writer.write( Level.ALL, "AA0130020"+" $Revision: 1.11 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0130020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0130020Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0130020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0130020Entity entity = control.entity;
		AA0130020Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0130");
		logger.entering("AA0130020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                try {
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
              
                 if (control.isScreenMove()) {
                  getSessionParameters(so, params, struct);
                 }
              
                 control.control_eventHandller("reload");
              
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
              //			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0130020-E999","�����[�h����"));
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0130020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0130020Control�N���X�C���X�^���X
	 */
	public String onClickSelect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0130020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0130020Entity entity = control.entity;
		AA0130020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0130");
		logger.entering("AA0130020Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");
		//{{user_implement_dev:<onClickSelect>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("Select");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickSelect>
		logger.exiting("AA0130020Servlet"+":USER="+request.getRemoteUser(),"onClickSelect");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0130020Control�N���X�C���X�^���X
	 */
	public String onClickUpdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0130020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0130020Entity entity = control.entity;
		AA0130020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0130");
		logger.entering("AA0130020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");
		//{{user_implement_dev:<onClickUpdate>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("Update");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickUpdate>
		logger.exiting("AA0130020Servlet"+":USER="+request.getRemoteUser(),"onClickUpdate");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0130020Control�N���X�C���X�^���X
	 */
	public String onClickClear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0130020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0130020Entity entity = control.entity;
		AA0130020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0130");
		logger.entering("AA0130020Servlet"+":USER="+request.getRemoteUser(),"onClickClear");
		//{{user_implement_dev:<onClickClear>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("Clear");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickClear>
		logger.exiting("AA0130020Servlet"+":USER="+request.getRemoteUser(),"onClickClear");

		return nextUrl;
	}

	/**
	 * ����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0130020Control�N���X�C���X�^���X
	 */
	public String onClickClose(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0130020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0130020Entity entity = control.entity;
		AA0130020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0130");
		logger.entering("AA0130020Servlet"+":USER="+request.getRemoteUser(),"onClickClose");
		//{{user_implement_dev:<onClickClose>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                try {
                 control.control_eventHandller("Close");
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //}}user_implement_dev:<onClickClose>
		logger.exiting("AA0130020Servlet"+":USER="+request.getRemoteUser(),"onClickClose");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0130020Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] FrUp_ITEM_CD = ((params.containsKey("FrUp_ITEM_CD")) ? (String[])params.get("FrUp_ITEM_CD") : (String[])null);
		String[] FrUp_ITEM_NAME = ((params.containsKey("FrUp_ITEM_NAME")) ? (String[])params.get("FrUp_ITEM_NAME") : (String[])null);
		String[] ToUp_ITEM_CD = ((params.containsKey("ToUp_ITEM_CD")) ? (String[])params.get("ToUp_ITEM_CD") : (String[])null);
		String[] ToUp_ITEM_NAME = ((params.containsKey("ToUp_ITEM_NAME")) ? (String[])params.get("ToUp_ITEM_NAME") : (String[])null);
		String[] TargetDate = ((params.containsKey("TargetDate")) ? (String[])params.get("TargetDate") : (String[])null);
		String[] DEVELOP_TYP = ((params.containsKey("DEVELOP_TYP")) ? (String[])params.get("DEVELOP_TYP") : (String[])null);
		String[] FrLo_ITEM_CD = ((params.containsKey("FrLo_ITEM_CD")) ? (String[])params.get("FrLo_ITEM_CD") : (String[])null);
		String[] Fr_PS_EDITION = ((params.containsKey("Fr_PS_EDITION")) ? (String[])params.get("Fr_PS_EDITION") : (String[])null);
		String[] FrLo_ITEM_NAME = ((params.containsKey("FrLo_ITEM_NAME")) ? (String[])params.get("FrLo_ITEM_NAME") : (String[])null);
		String[] Fr_EFF_PHASE_IN_DATE = ((params.containsKey("Fr_EFF_PHASE_IN_DATE")) ? (String[])params.get("Fr_EFF_PHASE_IN_DATE") : (String[])null);
		String[] Fr_EFF_PHASE_OUT_DATE = ((params.containsKey("Fr_EFF_PHASE_OUT_DATE")) ? (String[])params.get("Fr_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] h_Fr_MODIFY_COUNT = ((params.containsKey("h_Fr_MODIFY_COUNT")) ? (String[])params.get("h_Fr_MODIFY_COUNT") : (String[])null);
		String[] ToLo_ITEM_CD = ((params.containsKey("ToLo_ITEM_CD")) ? (String[])params.get("ToLo_ITEM_CD") : (String[])null);
		String[] To_PS_EDITION = ((params.containsKey("To_PS_EDITION")) ? (String[])params.get("To_PS_EDITION") : (String[])null);
		String[] ToLo_ITEM_NAME = ((params.containsKey("ToLo_ITEM_NAME")) ? (String[])params.get("ToLo_ITEM_NAME") : (String[])null);
		String[] To_EFF_PHASE_IN_DATE = ((params.containsKey("To_EFF_PHASE_IN_DATE")) ? (String[])params.get("To_EFF_PHASE_IN_DATE") : (String[])null);
		String[] To_EFF_PHASE_OUT_DATE = ((params.containsKey("To_EFF_PHASE_OUT_DATE")) ? (String[])params.get("To_EFF_PHASE_OUT_DATE") : (String[])null);
		String[] h_FrUp_ITEM_CD = ((params.containsKey("h_FrUp_ITEM_CD")) ? (String[])params.get("h_FrUp_ITEM_CD") : (String[])null);
		String[] h_ToUp_ITEM_CD = ((params.containsKey("h_ToUp_ITEM_CD")) ? (String[])params.get("h_ToUp_ITEM_CD") : (String[])null);
		String[] h_TargetDate = ((params.containsKey("h_TargetDate")) ? (String[])params.get("h_TargetDate") : (String[])null);
		String[] h_DEVELOP_TYP = ((params.containsKey("h_DEVELOP_TYP")) ? (String[])params.get("h_DEVELOP_TYP") : (String[])null);
		String[] DEVELOP_TYP_name = ((params.containsKey("DEVELOP_TYP_name")) ? (String[])params.get("DEVELOP_TYP_name") : (String[])null);
		String[] DEVELOP_TYP_val = ((params.containsKey("DEVELOP_TYP_val")) ? (String[])params.get("DEVELOP_TYP_val") : (String[])null);

		struct.setFrUp_ITEM_CD( ((FrUp_ITEM_CD == null) ? (String)null : FrUp_ITEM_CD[0]) );
		struct.setList_FrUp_ITEM_CD(TypeConverter.convert(FrUp_ITEM_CD));
		struct.setFrUp_ITEM_NAME( ((FrUp_ITEM_NAME == null) ? (String)null : FrUp_ITEM_NAME[0]) );
		struct.setList_FrUp_ITEM_NAME(TypeConverter.convert(FrUp_ITEM_NAME));
		struct.setToUp_ITEM_CD( ((ToUp_ITEM_CD == null) ? (String)null : ToUp_ITEM_CD[0]) );
		struct.setList_ToUp_ITEM_CD(TypeConverter.convert(ToUp_ITEM_CD));
		struct.setToUp_ITEM_NAME( ((ToUp_ITEM_NAME == null) ? (String)null : ToUp_ITEM_NAME[0]) );
		struct.setList_ToUp_ITEM_NAME(TypeConverter.convert(ToUp_ITEM_NAME));
		struct.setTargetDate( ((TargetDate == null) ? (String)null : TargetDate[0]) );
		struct.setList_TargetDate(TypeConverter.convert(TargetDate));
		struct.setDEVELOP_TYP( ((DEVELOP_TYP == null) ? (String)null : DEVELOP_TYP[0]) );
		struct.setList_DEVELOP_TYP(TypeConverter.convert(DEVELOP_TYP));
		struct.setFrLo_ITEM_CD( ((FrLo_ITEM_CD == null) ? (String)null : FrLo_ITEM_CD[0]) );
		struct.setList_FrLo_ITEM_CD(TypeConverter.convert(FrLo_ITEM_CD));
		struct.setFr_PS_EDITION( ((Fr_PS_EDITION == null) ? (String)null : Fr_PS_EDITION[0]) );
		struct.setList_Fr_PS_EDITION(TypeConverter.convert(Fr_PS_EDITION));
		struct.setFrLo_ITEM_NAME( ((FrLo_ITEM_NAME == null) ? (String)null : FrLo_ITEM_NAME[0]) );
		struct.setList_FrLo_ITEM_NAME(TypeConverter.convert(FrLo_ITEM_NAME));
		struct.setFr_EFF_PHASE_IN_DATE( ((Fr_EFF_PHASE_IN_DATE == null) ? (String)null : Fr_EFF_PHASE_IN_DATE[0]) );
		struct.setList_Fr_EFF_PHASE_IN_DATE(TypeConverter.convert(Fr_EFF_PHASE_IN_DATE));
		struct.setFr_EFF_PHASE_OUT_DATE( ((Fr_EFF_PHASE_OUT_DATE == null) ? (String)null : Fr_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_Fr_EFF_PHASE_OUT_DATE(TypeConverter.convert(Fr_EFF_PHASE_OUT_DATE));
		struct.seth_Fr_MODIFY_COUNT( ((h_Fr_MODIFY_COUNT == null) ? (String)null : h_Fr_MODIFY_COUNT[0]) );
		struct.setList_h_Fr_MODIFY_COUNT(TypeConverter.convert(h_Fr_MODIFY_COUNT));
		struct.setToLo_ITEM_CD( ((ToLo_ITEM_CD == null) ? (String)null : ToLo_ITEM_CD[0]) );
		struct.setList_ToLo_ITEM_CD(TypeConverter.convert(ToLo_ITEM_CD));
		struct.setTo_PS_EDITION( ((To_PS_EDITION == null) ? (String)null : To_PS_EDITION[0]) );
		struct.setList_To_PS_EDITION(TypeConverter.convert(To_PS_EDITION));
		struct.setToLo_ITEM_NAME( ((ToLo_ITEM_NAME == null) ? (String)null : ToLo_ITEM_NAME[0]) );
		struct.setList_ToLo_ITEM_NAME(TypeConverter.convert(ToLo_ITEM_NAME));
		struct.setTo_EFF_PHASE_IN_DATE( ((To_EFF_PHASE_IN_DATE == null) ? (String)null : To_EFF_PHASE_IN_DATE[0]) );
		struct.setList_To_EFF_PHASE_IN_DATE(TypeConverter.convert(To_EFF_PHASE_IN_DATE));
		struct.setTo_EFF_PHASE_OUT_DATE( ((To_EFF_PHASE_OUT_DATE == null) ? (String)null : To_EFF_PHASE_OUT_DATE[0]) );
		struct.setList_To_EFF_PHASE_OUT_DATE(TypeConverter.convert(To_EFF_PHASE_OUT_DATE));
		struct.seth_FrUp_ITEM_CD( ((h_FrUp_ITEM_CD == null) ? (String)null : h_FrUp_ITEM_CD[0]) );
		struct.setList_h_FrUp_ITEM_CD(TypeConverter.convert(h_FrUp_ITEM_CD));
		struct.seth_ToUp_ITEM_CD( ((h_ToUp_ITEM_CD == null) ? (String)null : h_ToUp_ITEM_CD[0]) );
		struct.setList_h_ToUp_ITEM_CD(TypeConverter.convert(h_ToUp_ITEM_CD));
		struct.seth_TargetDate( ((h_TargetDate == null) ? (String)null : h_TargetDate[0]) );
		struct.setList_h_TargetDate(TypeConverter.convert(h_TargetDate));
		struct.seth_DEVELOP_TYP( ((h_DEVELOP_TYP == null) ? (String)null : h_DEVELOP_TYP[0]) );
		struct.setList_h_DEVELOP_TYP(TypeConverter.convert(h_DEVELOP_TYP));
		struct.setDEVELOP_TYP_name( ((DEVELOP_TYP_name == null) ? (String)null : DEVELOP_TYP_name[0]) );
		struct.setList_DEVELOP_TYP_name(TypeConverter.convert(DEVELOP_TYP_name));
		struct.setDEVELOP_TYP_val( ((DEVELOP_TYP_val == null) ? (String)null : DEVELOP_TYP_val[0]) );
		struct.setList_DEVELOP_TYP_val(TypeConverter.convert(DEVELOP_TYP_val));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0130020.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAA0130020Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAA0130020Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AA0130020Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0130020Entity entity = control.entity;
		AA0130020Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0130");
		logger.entering("AA0130020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0130020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0130020Control control;
		AA0130020Entity  entity = null;
		AA0130020Struct  struct = null;

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

			if( (control = (AA0130020Control)so.getAttribute("AA0130020Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0130020Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0130020Control();
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

				so.setAttribute("AA0130020Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
                                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                                 ////! �n���ꂽ�p�����^�����ׂďo�͂���DEBUG�p�R�[�h
                                 //System.out.println("---< start >--------------------");
                                 //Enumeration paramNames = request.getParameterNames();
                                 //while (paramNames.hasMoreElements()) {
                                 //	String paramName = (String)paramNames.nextElement();
                                 //	System.out.println(" paramName: " + paramName);
                                 //	String[] paramValues = request.getParameterValues(paramName);
                                 //	if (paramValues.length == 1) {
                                 //		String paramValue = paramValues[0];
                                 //		if (paramValue.length() == 0) {
                                 //			System.out.println("paramValue:");
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
		return "com.nec.jp.orteus.metamorBase.AA0130.AA0130020Servlet";
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
	public AA0130020Servlet()
	{
		//{{user_implement_dev:<AA0130020_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_Select = true;
                bFLG_DISCONNECT_Update = true;
                bFLG_DISCONNECT_Clear = true;
                bFLG_DISCONNECT_Close = true;
              
                //}}user_implement_dev:<AA0130020_DisConnect_FLG>

		//{{user_implement_dev:<AA0130020Servlet>
                 // TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
                //}}user_implement_dev:<AA0130020Servlet>
	}

	//////////////////////////////

}
