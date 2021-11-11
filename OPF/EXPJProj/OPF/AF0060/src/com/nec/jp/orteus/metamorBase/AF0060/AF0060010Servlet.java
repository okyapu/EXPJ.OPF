/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0060/src/com/nec/jp/orteus/metamorBase/AF0060/AF0060010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0060;

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
//}}user_implement_dev:import

//{{user_implement_dev:header
//}}user_implement_dev:header

public class AF0060010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
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
	 * @param control AF0060010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AF0060010Control control)
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
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AF0060010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AF0060010Control control)
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
	 * @param control AF0060010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
			logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
              //			objMessage.m_writer.write( Level.ALL, "AF0060010"+" $Revision: 1.18 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AF0060010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //---------------------------------------------------------------------
                try {
                 // �H��R�[�h�擾
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 control.control_eventHandller("reload");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0060010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //---------------------------------------------------------------------
                try {
                 // �H��R�[�h�擾
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 control.control_eventHandller("select");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0060010Control�N���X�C���X�^���X
	 */
	public String onClickmodify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");
		//{{user_implement_dev:<onClickmodify>
                //------------------------------------------------------------------
                try {
                 // �H��R�[�h�擾
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 control.control_eventHandller("modify");
              
                 if(control.getMessage().sizeError() <= 0){
                  // �q��ʂɑJ��
                  nextUrl = "/AF0060011.jsp";
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickmodify>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0060010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //---------------------------------------------------------------------
                try {
                 // �H��R�[�h�擾
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 control.control_eventHandller("clear");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0060010Control�N���X�C���X�^���X
	 */
	public String onClickinsertSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");
		//{{user_implement_dev:<onClickinsertSub1>
                //---------------------------------------------------------------------
                try {
                 // �H��R�[�h�擾
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 control.control_eventHandller("insertSub1");
              
                 // �`�F�b�N�ŃG���[���������Ă���ꍇ
                 if(control.getMessage().sizeError() > 0)
                 {
                  // �Ăюq��ʂɑJ��
                  nextUrl = "/AF0060011.jsp";
                 }
                 else {
                  // �Ǎ�����
                  control.controlselect();
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsertSub1>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0060010Control�N���X�C���X�^���X
	 */
	public String onClickcloseSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");
		//{{user_implement_dev:<onClickcloseSub1>
                //------------------------------------------------------------------
                try{
                 // �H��R�[�h�擾
                 struct.setw_PLANT_CD(control.getsysPLANT_CD());
              
                 // �e��ʂɑJ��
                 nextUrl = "/AF0060010.jsp";
              
                 control.control_eventHandller("closeSub1");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickcloseSub1>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");

		return nextUrl;
	}

	/**
	 * �I�����������{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0060010Control�N���X�C���X�^���X
	 */
	public String onClickCancelCompleteChoice(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0060010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelCompleteChoice");
		//{{user_implement_dev:<onClickCancelCompleteChoice>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CancelCompleteChoice");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCancelCompleteChoice>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"onClickCancelCompleteChoice");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AF0060010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] RCV_WH_CD = ((params.containsKey("RCV_WH_CD")) ? (String[])params.get("RCV_WH_CD") : (String[])null);
		String[] TRANSPORT_CMPLT_TYP = ((params.containsKey("TRANSPORT_CMPLT_TYP")) ? (String[])params.get("TRANSPORT_CMPLT_TYP") : (String[])null);
		String[] TRANSPORT_CMPLT_TYP_name = ((params.containsKey("TRANSPORT_CMPLT_TYP_name")) ? (String[])params.get("TRANSPORT_CMPLT_TYP_name") : (String[])null);
		String[] TRANSPORT_CMPLT_TYP_val = ((params.containsKey("TRANSPORT_CMPLT_TYP_val")) ? (String[])params.get("TRANSPORT_CMPLT_TYP_val") : (String[])null);
		String[] TRANSPORT_SLIP_CD = ((params.containsKey("TRANSPORT_SLIP_CD")) ? (String[])params.get("TRANSPORT_SLIP_CD") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] ISSUE_PLANT_CD = ((params.containsKey("ISSUE_PLANT_CD")) ? (String[])params.get("ISSUE_PLANT_CD") : (String[])null);
		String[] ISSUE_PLANT_NAME = ((params.containsKey("ISSUE_PLANT_NAME")) ? (String[])params.get("ISSUE_PLANT_NAME") : (String[])null);
		String[] ISSUE_WH_CD = ((params.containsKey("ISSUE_WH_CD")) ? (String[])params.get("ISSUE_WH_CD") : (String[])null);
		String[] ISSUE_WH_NAME = ((params.containsKey("ISSUE_WH_NAME")) ? (String[])params.get("ISSUE_WH_NAME") : (String[])null);
		String[] RCV_PLANT_CD = ((params.containsKey("RCV_PLANT_CD")) ? (String[])params.get("RCV_PLANT_CD") : (String[])null);
		String[] RCV_PLANT_NAME = ((params.containsKey("RCV_PLANT_NAME")) ? (String[])params.get("RCV_PLANT_NAME") : (String[])null);
		String[] RCV_WH_NAME = ((params.containsKey("RCV_WH_NAME")) ? (String[])params.get("RCV_WH_NAME") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] ISSUE_DATE = ((params.containsKey("ISSUE_DATE")) ? (String[])params.get("ISSUE_DATE") : (String[])null);
		String[] ISSUE_QTY = ((params.containsKey("ISSUE_QTY")) ? (String[])params.get("ISSUE_QTY") : (String[])null);
		String[] RCV_DATE = ((params.containsKey("RCV_DATE")) ? (String[])params.get("RCV_DATE") : (String[])null);
		String[] RCV_QTY = ((params.containsKey("RCV_QTY")) ? (String[])params.get("RCV_QTY") : (String[])null);
		String[] w_WH_STOCK_ON_HAND_QTY = ((params.containsKey("w_WH_STOCK_ON_HAND_QTY")) ? (String[])params.get("w_WH_STOCK_ON_HAND_QTY") : (String[])null);
		String[] w_TOTAL_STOCK_ON_HAND_QTY = ((params.containsKey("w_TOTAL_STOCK_ON_HAND_QTY")) ? (String[])params.get("w_TOTAL_STOCK_ON_HAND_QTY") : (String[])null);
		String[] RCV_ISSUE_DATE = ((params.containsKey("RCV_ISSUE_DATE")) ? (String[])params.get("RCV_ISSUE_DATE") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] w_LEAVE_RCV_QTY = ((params.containsKey("w_LEAVE_RCV_QTY")) ? (String[])params.get("w_LEAVE_RCV_QTY") : (String[])null);
		String[] w_UNIT_QTY_TYP = ((params.containsKey("w_UNIT_QTY_TYP")) ? (String[])params.get("w_UNIT_QTY_TYP") : (String[])null);
		String[] w_BUSINESS_OPR_DATE = ((params.containsKey("w_BUSINESS_OPR_DATE")) ? (String[])params.get("w_BUSINESS_OPR_DATE") : (String[])null);
		String[] h_TRANSPORT_CMPLT_TYP = ((params.containsKey("h_TRANSPORT_CMPLT_TYP")) ? (String[])params.get("h_TRANSPORT_CMPLT_TYP") : (String[])null);
		String[] w_MODIFY_COUNT = ((params.containsKey("w_MODIFY_COUNT")) ? (String[])params.get("w_MODIFY_COUNT") : (String[])null);
		String[] RCV_ISSUE_QTY = ((params.containsKey("RCV_ISSUE_QTY")) ? (String[])params.get("RCV_ISSUE_QTY") : (String[])null);
		String[] c_TRANSPORT_CMPLT_TYP = ((params.containsKey("c_TRANSPORT_CMPLT_TYP")) ? (String[])params.get("c_TRANSPORT_CMPLT_TYP") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] h_lotCtrl = ((params.containsKey("h_lotCtrl")) ? (String[])params.get("h_lotCtrl") : (String[])null);
		String[] LOT_NO = ((params.containsKey("LOT_NO")) ? (String[])params.get("LOT_NO") : (String[])null);
		String[] STOCK_ON_HAND_QTY = ((params.containsKey("STOCK_ON_HAND_QTY")) ? (String[])params.get("STOCK_ON_HAND_QTY") : (String[])null);
		String[] DEFECT_QTY = ((params.containsKey("DEFECT_QTY")) ? (String[])params.get("DEFECT_QTY") : (String[])null);
		String[] ALLOCABLE_QTY = ((params.containsKey("ALLOCABLE_QTY")) ? (String[])params.get("ALLOCABLE_QTY") : (String[])null);
		String[] h_lotFlg = ((params.containsKey("h_lotFlg")) ? (String[])params.get("h_lotFlg") : (String[])null);
		String[] RCV_ISSUE_COMMENT = ((params.containsKey("RCV_ISSUE_COMMENT")) ? (String[])params.get("RCV_ISSUE_COMMENT") : (String[])null);
		String[] ISSUE_COMMENT = ((params.containsKey("ISSUE_COMMENT")) ? (String[])params.get("ISSUE_COMMENT") : (String[])null);
		String[] hid_TRANSPORT_CMPLT_TYP = ((params.containsKey("hid_TRANSPORT_CMPLT_TYP")) ? (String[])params.get("hid_TRANSPORT_CMPLT_TYP") : (String[])null);

		struct.setRCV_WH_CD( ((RCV_WH_CD == null) ? (String)null : RCV_WH_CD[0]) );
		struct.setList_RCV_WH_CD(TypeConverter.convert(RCV_WH_CD));
		if( (TRANSPORT_CMPLT_TYP == null)||("".equals(TRANSPORT_CMPLT_TYP[0])) ) {
		   struct.setTRANSPORT_CMPLT_TYP( (Integer)null );
		} else {
		   struct.setTRANSPORT_CMPLT_TYP( new Integer(TRANSPORT_CMPLT_TYP[0]) );
		   struct.setList_TRANSPORT_CMPLT_TYP(TypeConverter.convert(TRANSPORT_CMPLT_TYP));
		}
		struct.setTRANSPORT_CMPLT_TYP_name( ((TRANSPORT_CMPLT_TYP_name == null) ? (String)null : TRANSPORT_CMPLT_TYP_name[0]) );
		struct.setList_TRANSPORT_CMPLT_TYP_name(TypeConverter.convert(TRANSPORT_CMPLT_TYP_name));
		if( (TRANSPORT_CMPLT_TYP_val == null)||("".equals(TRANSPORT_CMPLT_TYP_val[0])) ) {
		   struct.setTRANSPORT_CMPLT_TYP_val( (Integer)null );
		} else {
		   struct.setTRANSPORT_CMPLT_TYP_val( new Integer(TRANSPORT_CMPLT_TYP_val[0]) );
		   struct.setList_TRANSPORT_CMPLT_TYP_val(TypeConverter.convert(TRANSPORT_CMPLT_TYP_val));
		}
		struct.setTRANSPORT_SLIP_CD( ((TRANSPORT_SLIP_CD == null) ? (String)null : TRANSPORT_SLIP_CD[0]) );
		struct.setList_TRANSPORT_SLIP_CD(TypeConverter.convert(TRANSPORT_SLIP_CD));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setISSUE_PLANT_CD( ((ISSUE_PLANT_CD == null) ? (String)null : ISSUE_PLANT_CD[0]) );
		struct.setList_ISSUE_PLANT_CD(TypeConverter.convert(ISSUE_PLANT_CD));
		struct.setISSUE_PLANT_NAME( ((ISSUE_PLANT_NAME == null) ? (String)null : ISSUE_PLANT_NAME[0]) );
		struct.setList_ISSUE_PLANT_NAME(TypeConverter.convert(ISSUE_PLANT_NAME));
		struct.setISSUE_WH_CD( ((ISSUE_WH_CD == null) ? (String)null : ISSUE_WH_CD[0]) );
		struct.setList_ISSUE_WH_CD(TypeConverter.convert(ISSUE_WH_CD));
		struct.setISSUE_WH_NAME( ((ISSUE_WH_NAME == null) ? (String)null : ISSUE_WH_NAME[0]) );
		struct.setList_ISSUE_WH_NAME(TypeConverter.convert(ISSUE_WH_NAME));
		struct.setRCV_PLANT_CD( ((RCV_PLANT_CD == null) ? (String)null : RCV_PLANT_CD[0]) );
		struct.setList_RCV_PLANT_CD(TypeConverter.convert(RCV_PLANT_CD));
		struct.setRCV_PLANT_NAME( ((RCV_PLANT_NAME == null) ? (String)null : RCV_PLANT_NAME[0]) );
		struct.setList_RCV_PLANT_NAME(TypeConverter.convert(RCV_PLANT_NAME));
		struct.setRCV_WH_NAME( ((RCV_WH_NAME == null) ? (String)null : RCV_WH_NAME[0]) );
		struct.setList_RCV_WH_NAME(TypeConverter.convert(RCV_WH_NAME));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.setISSUE_DATE( ((ISSUE_DATE == null) ? (String)null : ISSUE_DATE[0]) );
		struct.setList_ISSUE_DATE(TypeConverter.convert(ISSUE_DATE));
		struct.setISSUE_QTY( ((ISSUE_QTY == null) ? (String)null : ISSUE_QTY[0]) );
		struct.setList_ISSUE_QTY(TypeConverter.convert(ISSUE_QTY));
		struct.setRCV_DATE( ((RCV_DATE == null) ? (String)null : RCV_DATE[0]) );
		struct.setList_RCV_DATE(TypeConverter.convert(RCV_DATE));
		struct.setRCV_QTY( ((RCV_QTY == null) ? (String)null : RCV_QTY[0]) );
		struct.setList_RCV_QTY(TypeConverter.convert(RCV_QTY));
		struct.setw_WH_STOCK_ON_HAND_QTY( ((w_WH_STOCK_ON_HAND_QTY == null) ? (String)null : w_WH_STOCK_ON_HAND_QTY[0]) );
		struct.setList_w_WH_STOCK_ON_HAND_QTY(TypeConverter.convert(w_WH_STOCK_ON_HAND_QTY));
		struct.setw_TOTAL_STOCK_ON_HAND_QTY( ((w_TOTAL_STOCK_ON_HAND_QTY == null) ? (String)null : w_TOTAL_STOCK_ON_HAND_QTY[0]) );
		struct.setList_w_TOTAL_STOCK_ON_HAND_QTY(TypeConverter.convert(w_TOTAL_STOCK_ON_HAND_QTY));
		struct.setRCV_ISSUE_DATE( ((RCV_ISSUE_DATE == null) ? (String)null : RCV_ISSUE_DATE[0]) );
		struct.setList_RCV_ISSUE_DATE(TypeConverter.convert(RCV_ISSUE_DATE));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setw_LEAVE_RCV_QTY( ((w_LEAVE_RCV_QTY == null) ? (String)null : w_LEAVE_RCV_QTY[0]) );
		struct.setList_w_LEAVE_RCV_QTY(TypeConverter.convert(w_LEAVE_RCV_QTY));
		if( (w_UNIT_QTY_TYP == null)||("".equals(w_UNIT_QTY_TYP[0])) ) {
		   struct.setw_UNIT_QTY_TYP( (Integer)null );
		} else {
		   struct.setw_UNIT_QTY_TYP( new Integer(w_UNIT_QTY_TYP[0]) );
		   struct.setList_w_UNIT_QTY_TYP(TypeConverter.convert(w_UNIT_QTY_TYP));
		}
		struct.setw_BUSINESS_OPR_DATE( ((w_BUSINESS_OPR_DATE == null) ? (String)null : w_BUSINESS_OPR_DATE[0]) );
		struct.setList_w_BUSINESS_OPR_DATE(TypeConverter.convert(w_BUSINESS_OPR_DATE));
		struct.seth_TRANSPORT_CMPLT_TYP( ((h_TRANSPORT_CMPLT_TYP == null) ? (String)null : h_TRANSPORT_CMPLT_TYP[0]) );
		struct.setList_h_TRANSPORT_CMPLT_TYP(TypeConverter.convert(h_TRANSPORT_CMPLT_TYP));
		struct.setw_MODIFY_COUNT( ((w_MODIFY_COUNT == null) ? (String)null : w_MODIFY_COUNT[0]) );
		struct.setList_w_MODIFY_COUNT(TypeConverter.convert(w_MODIFY_COUNT));
		struct.setRCV_ISSUE_QTY( ((RCV_ISSUE_QTY == null) ? (String)null : RCV_ISSUE_QTY[0]) );
		struct.setList_RCV_ISSUE_QTY(TypeConverter.convert(RCV_ISSUE_QTY));
		struct.setc_TRANSPORT_CMPLT_TYP( ((c_TRANSPORT_CMPLT_TYP == null) ? (String)null : c_TRANSPORT_CMPLT_TYP[0]) );
		struct.setList_c_TRANSPORT_CMPLT_TYP(TypeConverter.convert(c_TRANSPORT_CMPLT_TYP));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.seth_lotCtrl( ((h_lotCtrl == null) ? (String)null : h_lotCtrl[0]) );
		struct.setList_h_lotCtrl(TypeConverter.convert(h_lotCtrl));
		struct.setLOT_NO( ((LOT_NO == null) ? (String)null : LOT_NO[0]) );
		struct.setList_LOT_NO(TypeConverter.convert(LOT_NO));
		struct.setSTOCK_ON_HAND_QTY( ((STOCK_ON_HAND_QTY == null) ? (String)null : STOCK_ON_HAND_QTY[0]) );
		struct.setList_STOCK_ON_HAND_QTY(TypeConverter.convert(STOCK_ON_HAND_QTY));
		struct.setDEFECT_QTY( ((DEFECT_QTY == null) ? (String)null : DEFECT_QTY[0]) );
		struct.setList_DEFECT_QTY(TypeConverter.convert(DEFECT_QTY));
		struct.setALLOCABLE_QTY( ((ALLOCABLE_QTY == null) ? (String)null : ALLOCABLE_QTY[0]) );
		struct.setList_ALLOCABLE_QTY(TypeConverter.convert(ALLOCABLE_QTY));
		struct.seth_lotFlg( ((h_lotFlg == null) ? (String)null : h_lotFlg[0]) );
		struct.setList_h_lotFlg(TypeConverter.convert(h_lotFlg));
		struct.setRCV_ISSUE_COMMENT( ((RCV_ISSUE_COMMENT == null) ? (String)null : RCV_ISSUE_COMMENT[0]) );
		struct.setList_RCV_ISSUE_COMMENT(TypeConverter.convert(RCV_ISSUE_COMMENT));
		struct.setISSUE_COMMENT( ((ISSUE_COMMENT == null) ? (String)null : ISSUE_COMMENT[0]) );
		struct.setList_ISSUE_COMMENT(TypeConverter.convert(ISSUE_COMMENT));
		struct.sethid_TRANSPORT_CMPLT_TYP( ((hid_TRANSPORT_CMPLT_TYP == null) ? (String)null : hid_TRANSPORT_CMPLT_TYP[0]) );
		struct.setList_hid_TRANSPORT_CMPLT_TYP(TypeConverter.convert(hid_TRANSPORT_CMPLT_TYP));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AF0060010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAF0060010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAF0060010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AF0060010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0060010Entity entity = control.entity;
		AF0060010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AF0060010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AF0060010Control control;
		AF0060010Entity  entity = null;
		AF0060010Struct  struct = null;

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

			if( (control = (AF0060010Control)so.getAttribute("AF0060010Control_"+request.getSession(false).getId())) == null ) {
				control = new AF0060010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AF0060010Control();
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
				} else if( isClick(request, "modify") ) {
					if ( !isCryptical(request, so, params, "modify") ) return ERROR_TARGET;
					target = onClickmodify(request, response, so, params, control);
					control.setButton("modify");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "insertSub1") ) {
					if ( !isCryptical(request, so, params, "insertSub1") ) return ERROR_TARGET;
					target = onClickinsertSub1(request, response, so, params, control);
					control.setButton("insertSub1");
				} else if( isClick(request, "closeSub1") ) {
					if ( !isCryptical(request, so, params, "closeSub1") ) return ERROR_TARGET;
					target = onClickcloseSub1(request, response, so, params, control);
					control.setButton("closeSub1");
				} else if( isClick(request, "CancelCompleteChoice") ) {
					if ( !isCryptical(request, so, params, "CancelCompleteChoice") ) return ERROR_TARGET;
					target = onClickCancelCompleteChoice(request, response, so, params, control);
					control.setButton("CancelCompleteChoice");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AF0060010Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
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
				|| (isClick(request, "modify") && bFLG_DISCONNECT_modify)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "insertSub1") && bFLG_DISCONNECT_insertSub1)
				|| (isClick(request, "closeSub1") && bFLG_DISCONNECT_closeSub1)
				|| (isClick(request, "CancelCompleteChoice") && bFLG_DISCONNECT_CancelCompleteChoice)
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
	private  static boolean bFLG_DISCONNECT_modify = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_insertSub1 = true;
	private  static boolean bFLG_DISCONNECT_closeSub1 = true;
	private  static boolean bFLG_DISCONNECT_CancelCompleteChoice = true;

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
		return "com.nec.jp.orteus.metamorBase.AF0060.AF0060010Servlet";
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
	public AF0060010Servlet()
	{
		//{{user_implement_dev:<AF0060010_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_modify = true;
                bFLG_DISCONNECT_clear = true;
                bFLG_DISCONNECT_insertSub1 = true;
                bFLG_DISCONNECT_closeSub1 = true;
              
                //}}user_implement_dev:<AF0060010_DisConnect_FLG>

		//{{user_implement_dev:<AF0060010Servlet>
                //}}user_implement_dev:<AF0060010Servlet>
	}

	//////////////////////////////

}
