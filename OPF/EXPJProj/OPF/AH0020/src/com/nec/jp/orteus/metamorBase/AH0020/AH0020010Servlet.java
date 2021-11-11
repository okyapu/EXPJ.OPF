/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0020/src/com/nec/jp/orteus/metamorBase/AH0020/AH0020010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0020;

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

public class AH0020010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
       
        //------------------------------------------------------------------------------
        /** 
         * �ꗗ���擾�ݒ菈��
         *
         * @param	AH0020010Control	control
         * @return	�Ȃ�
        */
        private void setListData(AH0020010Control control)
        {
         if(control.struct.getList_w_target() != null)
         {
          // �ꗗ�ɕ\������Ă���f�[�^�����������J��Ԃ�
          List list = control.getList();
          list.clear();
          for(int i = 0; i < control.struct.getList_w_target().size(); i++)
          {
           // �f�[�^�擾
           AH0020010Struct targetStruct = new AH0020010Struct();
                 targetStruct.importData(control.struct, i);
                 if("true".equals(targetStruct.getc_target())==true)
                 {
                  targetStruct.setw_target("1");
                 }
                 else
                 {
                  targetStruct.setw_target("0");
                 }
                 list.add(targetStruct);
          }
         }
         return;
        }
        //------------------------------------------------------------------------------
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
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AH0020010Control control)
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
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AH0020010Control control)
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
	 * @param control AH0020010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
			logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 objMessage.m_writer.write( Level.ALL, "AH0020010"+" $Revision: 1.5 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AH0020010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------------------
                try {
                 // �����[�h����
                 control.control_eventHandller("reload");
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------------------
                try {
              
                 // �Ǎ�����
                 control.control_eventHandller("select");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �ۊǋ�w��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickselect_wh(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_wh");
		//{{user_implement_dev:<onClickselect_wh>
                //------------------------------------------------------------------------------
                try {
              
                 // �ۊǋ�w�菈��
                 control.control_eventHandller("select_wh");
              
                 // �G���[�Ȃ��̏ꍇ�A�q��ʂɑJ��
                 if(control.getMessage().sizeError() <= 0)
                 {
                  nextUrl = "/AH0020011.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect_wh>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_wh");

		return nextUrl;
	}

	/**
	 * �i�ڎw��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickselect_item(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_item");
		//{{user_implement_dev:<onClickselect_item>
                //------------------------------------------------------------------------------
                try {
              
                 // �i�ڎw�菈��
                 control.control_eventHandller("select_item");
              
                 // �G���[�Ȃ��̏ꍇ�A�q��ʂɑJ��
                 if(control.getMessage().sizeError() <= 0)
                 {
                  nextUrl = "/AH0020012.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect_item>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_item");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
                //------------------------------------------------------------------------------
                try {
              
                 // �o�^����
                 control.control_eventHandller("insert");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
                //------------------------------------------------------------------------------
                try {
              
                 // �X�V����
                 control.control_eventHandller("update");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * �폜�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickdelete(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");
		//{{user_implement_dev:<onClickdelete>
                //------------------------------------------------------------------------------
                try {
              
                 // �폜����
                 control.control_eventHandller("delete");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickdelete>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickdelete");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------------------
                try {
              
                 // �N���A����
                 control.control_eventHandller("clear");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickselect_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub1");
		//{{user_implement_dev:<onClickselect_sub1>
                //------------------------------------------------------------------------------
                try {
              
                 // �Ǎ�����
                 control.control_eventHandller("select_sub1");
              
                 // �q��ʂɑJ��
                 nextUrl = "/AH0020011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect_sub1>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub1");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickupdate_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub1");
		//{{user_implement_dev:<onClickupdate_sub1>
                //------------------------------------------------------------------------------
                try {
              
                 // �ꗗ���擾�ݒ菈��
                 setListData(control);
              
                 // �X�V����
                 control.control_eventHandller("update_sub1");
              
                 // �q��ʂɑJ��
                 nextUrl = "/AH0020011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate_sub1>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub1");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickclear_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear_sub1");
		//{{user_implement_dev:<onClickclear_sub1>
                //------------------------------------------------------------------------------
                try {
              
                 // �N���A����
                 control.control_eventHandller("clear_sub1");
              
                 // �q��ʂɑJ��
                 nextUrl = "/AH0020011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear_sub1>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear_sub1");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickreturn_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");
		//{{user_implement_dev:<onClickreturn_sub1>
                //---------------------------------------------------------------------
                try {
              
                 // �߂鏈��
                 control.control_eventHandller("return_sub1");
              
                 // �e��ʂɑJ��
                 nextUrl = "/AH0020010.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickreturn_sub1>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickselect_sub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub2");
		//{{user_implement_dev:<onClickselect_sub2>
                //------------------------------------------------------------------------------
                try {
              
                 // �Ǎ�����
                 control.control_eventHandller("select_sub2");
              
                 // �q��ʂɑJ��
                 nextUrl = "/AH0020012.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect_sub2>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect_sub2");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickupdate_sub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub2");
		//{{user_implement_dev:<onClickupdate_sub2>
                //------------------------------------------------------------------------------
                try {
              
                 // �ꗗ���擾�ݒ菈��
                 setListData(control);
              
                 // �X�V����
                 control.control_eventHandller("update_sub2");
              
                 // �q��ʂɑJ��
                 nextUrl = "/AH0020012.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate_sub2>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickupdate_sub2");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickclear_sub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear_sub2");
		//{{user_implement_dev:<onClickclear_sub2>
                //------------------------------------------------------------------------------
                try {
              
                 // �N���A����
                 control.control_eventHandller("clear_sub2");
              
                 // �q��ʂɑJ��
                 nextUrl = "/AH0020012.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear_sub2>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear_sub2");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickreturn_sub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub2");
		//{{user_implement_dev:<onClickreturn_sub2>
                //---------------------------------------------------------------------
                try {
              
                 // �߂鏈��
                 control.control_eventHandller("return_sub2");
              
                 // �e��ʂɑJ��
                 nextUrl = "/AH0020010.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickreturn_sub2>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub2");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickreturn_sub3(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub3");
		//{{user_implement_dev:<onClickreturn_sub3>
                //---------------------------------------------------------------------
                try {
              
                 // �߂鏈��
                 control.control_eventHandller("return_sub3");
              
                 if(control.FLG_INV_TARGET_WH.equals(control.getInvTargetFlg()) == true)
                 {
                  // �q��ʁi�ۊǋ�w��j�ɑJ��
                  nextUrl = "/AH0020011.jsp";
                 }
                 else
                 {
                  // �q��ʁi�i�ڎw��j�ɑJ��
                  nextUrl = "/AH0020012.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickreturn_sub3>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub3");

		return nextUrl;
	}

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickCsvImportWh(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImportWh");
		//{{user_implement_dev:<onClickCsvImportWh>
                //------------------------------------------------------------------------------
                try {
              
                 // �b�r�u�捞����
                 control.control_eventHandller("CsvImportWh");
              
                 if(control.getMessage().sizeError() <= 0)
                 {
                  // �G���[�Ȃ��̏ꍇ�ACSV��ʂɑJ��
                  nextUrl = "/AH0020013.jsp";
                 }
                 else
                 {
                  // �G���[����̏ꍇ�A�q��ʂ̂܂�
                  nextUrl = "/AH0020011.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickCsvImportWh>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImportWh");

		return nextUrl;
	}

	/**
	 * CSV�捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickCsvImportItem(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImportItem");
		//{{user_implement_dev:<onClickCsvImportItem>
                //------------------------------------------------------------------------------
                try {
              
                 // �b�r�u�捞����
                 control.control_eventHandller("CsvImportItem");
              
                 if(control.getMessage().sizeError() <= 0)
                 {
                  // �G���[�Ȃ��̏ꍇ�ACSV��ʂɑJ��
                  nextUrl = "/AH0020013.jsp";
                 }
                 else
                 {
                  // �G���[����̏ꍇ�A�q��ʂ̂܂�
                  nextUrl = "/AH0020012.jsp";
                 }
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickCsvImportItem>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvImportItem");

		return nextUrl;
	}

	/**
	 * �Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickBrowse(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");
		//{{user_implement_dev:<onClickBrowse>
                //---------------------------------------------------------------------
                try {
                 control.control_eventHandller("Browse");
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickBrowse>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickBrowse");

		return nextUrl;
	}

	/**
	 * �捞�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickCsvIn(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");
		//{{user_implement_dev:<onClickCsvIn>
                //------------------------------------------------------------------------------
                try {
                 control.setCsvReader(new CsvReader(request));
                 control.control_eventHandller("CsvIn");
                 control.setCsvReader(null);
              
                 if(control.getMessage().sizeError() > 0)
                 {
                  // �G���[������ꍇ�A�q��ʂ̂܂�
                  nextUrl = "/AH0020013.jsp";
                 }
                 else
                 {
                  if(control.FLG_INV_TARGET_WH.equals(control.getInvTargetFlg()) == true)
                  {
                   // �q��ʁi�ۊǋ�w��j�ɑJ��
                   nextUrl = "/AH0020011.jsp";
                  }
                  else
                  {
                   // �q��ʁi�i�ڎw��j�ɑJ��
                   nextUrl = "/AH0020012.jsp";
                  }
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickCsvIn>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvIn");

		return nextUrl;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickselectall(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselectall");
		//{{user_implement_dev:<onClickselectall>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("selectall");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickselectall>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselectall");

		return nextUrl;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AH0020010Control�N���X�C���X�^���X
	 */
	public String onClickcancelselectall(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AH0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelselectall");
		//{{user_implement_dev:<onClickcancelselectall>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("cancelselectall");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickcancelselectall>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelselectall");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AH0020010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] INV_DATE = ((params.containsKey("INV_DATE")) ? (String[])params.get("INV_DATE") : (String[])null);
		String[] w_INV_STS_TYP = ((params.containsKey("w_INV_STS_TYP")) ? (String[])params.get("w_INV_STS_TYP") : (String[])null);
		String[] h_REGULAR_INV_FLG = ((params.containsKey("h_REGULAR_INV_FLG")) ? (String[])params.get("h_REGULAR_INV_FLG") : (String[])null);
		String[] h_CYCLE_INV_FLG = ((params.containsKey("h_CYCLE_INV_FLG")) ? (String[])params.get("h_CYCLE_INV_FLG") : (String[])null);
		String[] h_TEMP_INV_FLG = ((params.containsKey("h_TEMP_INV_FLG")) ? (String[])params.get("h_TEMP_INV_FLG") : (String[])null);
		String[] INV_COMMENT = ((params.containsKey("INV_COMMENT")) ? (String[])params.get("INV_COMMENT") : (String[])null);
		String[] INV_START_DATE = ((params.containsKey("INV_START_DATE")) ? (String[])params.get("INV_START_DATE") : (String[])null);
		String[] STOCK_SAVE_DATE = ((params.containsKey("STOCK_SAVE_DATE")) ? (String[])params.get("STOCK_SAVE_DATE") : (String[])null);
		String[] INV_UPDATED_DATE = ((params.containsKey("INV_UPDATED_DATE")) ? (String[])params.get("INV_UPDATED_DATE") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] w_MRP_FLG = ((params.containsKey("w_MRP_FLG")) ? (String[])params.get("w_MRP_FLG") : (String[])null);
		String[] w_WH_TYP = ((params.containsKey("w_WH_TYP")) ? (String[])params.get("w_WH_TYP") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] w_MRP_ODR_TYP = ((params.containsKey("w_MRP_ODR_TYP")) ? (String[])params.get("w_MRP_ODR_TYP") : (String[])null);
		String[] w_OUTSIDE_TYP = ((params.containsKey("w_OUTSIDE_TYP")) ? (String[])params.get("w_OUTSIDE_TYP") : (String[])null);
		String[] WH_VEND_CD = ((params.containsKey("WH_VEND_CD")) ? (String[])params.get("WH_VEND_CD") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] h_disp_entry_wh = ((params.containsKey("h_disp_entry_wh")) ? (String[])params.get("h_disp_entry_wh") : (String[])null);
		String[] w_WH_CD = ((params.containsKey("w_WH_CD")) ? (String[])params.get("w_WH_CD") : (String[])null);
		String[] h_disp_entry_item = ((params.containsKey("h_disp_entry_item")) ? (String[])params.get("h_disp_entry_item") : (String[])null);
		String[] h_INV_STS_TYP = ((params.containsKey("h_INV_STS_TYP")) ? (String[])params.get("h_INV_STS_TYP") : (String[])null);
		String[] w_ABC_TYP = ((params.containsKey("w_ABC_TYP")) ? (String[])params.get("w_ABC_TYP") : (String[])null);
		String[] s_ABC_TYP = ((params.containsKey("s_ABC_TYP")) ? (String[])params.get("s_ABC_TYP") : (String[])null);
		String[] s_ABC_TYP_name = ((params.containsKey("s_ABC_TYP_name")) ? (String[])params.get("s_ABC_TYP_name") : (String[])null);
		String[] s_ABC_TYP_val = ((params.containsKey("s_ABC_TYP_val")) ? (String[])params.get("s_ABC_TYP_val") : (String[])null);
		String[] ERR_ADR = ((params.containsKey("ERR_ADR")) ? (String[])params.get("ERR_ADR") : (String[])null);
		String[] ERR_MSG = ((params.containsKey("ERR_MSG")) ? (String[])params.get("ERR_MSG") : (String[])null);
		String[] h_saveINV_DATE = ((params.containsKey("h_saveINV_DATE")) ? (String[])params.get("h_saveINV_DATE") : (String[])null);
		String[] c_REGULAR_INV_FLG = ((params.containsKey("c_REGULAR_INV_FLG")) ? (String[])params.get("c_REGULAR_INV_FLG") : (String[])null);
		String[] c_CYCLE_INV_FLG = ((params.containsKey("c_CYCLE_INV_FLG")) ? (String[])params.get("c_CYCLE_INV_FLG") : (String[])null);
		String[] c_TEMP_INV_FLG = ((params.containsKey("c_TEMP_INV_FLG")) ? (String[])params.get("c_TEMP_INV_FLG") : (String[])null);
		String[] c_disp_entry_wh = ((params.containsKey("c_disp_entry_wh")) ? (String[])params.get("c_disp_entry_wh") : (String[])null);
		String[] c_disp_entry_item = ((params.containsKey("c_disp_entry_item")) ? (String[])params.get("c_disp_entry_item") : (String[])null);
		String[] c_target = ((params.containsKey("c_target")) ? (String[])params.get("c_target") : (String[])null);
		String[] h_saveINV_STS_TYP = ((params.containsKey("h_saveINV_STS_TYP")) ? (String[])params.get("h_saveINV_STS_TYP") : (String[])null);
		String[] INV_WH_CD = ((params.containsKey("INV_WH_CD")) ? (String[])params.get("INV_WH_CD") : (String[])null);
		String[] MRP_FLG = ((params.containsKey("MRP_FLG")) ? (String[])params.get("MRP_FLG") : (String[])null);
		String[] WH_TYP = ((params.containsKey("WH_TYP")) ? (String[])params.get("WH_TYP") : (String[])null);
		String[] INV_ITEM_CD = ((params.containsKey("INV_ITEM_CD")) ? (String[])params.get("INV_ITEM_CD") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] OUTSIDE_TYP = ((params.containsKey("OUTSIDE_TYP")) ? (String[])params.get("OUTSIDE_TYP") : (String[])null);
		String[] ABC_TYP = ((params.containsKey("ABC_TYP")) ? (String[])params.get("ABC_TYP") : (String[])null);
		String[] w_target = ((params.containsKey("w_target")) ? (String[])params.get("w_target") : (String[])null);
		String[] r1_inv_target = ((params.containsKey("r1_inv_target")) ? (String[])params.get("r1_inv_target") : (String[])null);
		String[] r2_inv_target = ((params.containsKey("r2_inv_target")) ? (String[])params.get("r2_inv_target") : (String[])null);
		String[] FileName = ((params.containsKey("FileName")) ? (String[])params.get("FileName") : (String[])null);
		String[] h_saveTEMP_INV_FLG = ((params.containsKey("h_saveTEMP_INV_FLG")) ? (String[])params.get("h_saveTEMP_INV_FLG") : (String[])null);

		struct.setINV_DATE( ((INV_DATE == null) ? (String)null : INV_DATE[0]) );
		struct.setList_INV_DATE(TypeConverter.convert(INV_DATE));
		struct.setw_INV_STS_TYP( ((w_INV_STS_TYP == null) ? (String)null : w_INV_STS_TYP[0]) );
		struct.setList_w_INV_STS_TYP(TypeConverter.convert(w_INV_STS_TYP));
		struct.seth_REGULAR_INV_FLG( ((h_REGULAR_INV_FLG == null) ? (String)null : h_REGULAR_INV_FLG[0]) );
		struct.setList_h_REGULAR_INV_FLG(TypeConverter.convert(h_REGULAR_INV_FLG));
		struct.seth_CYCLE_INV_FLG( ((h_CYCLE_INV_FLG == null) ? (String)null : h_CYCLE_INV_FLG[0]) );
		struct.setList_h_CYCLE_INV_FLG(TypeConverter.convert(h_CYCLE_INV_FLG));
		struct.seth_TEMP_INV_FLG( ((h_TEMP_INV_FLG == null) ? (String)null : h_TEMP_INV_FLG[0]) );
		struct.setList_h_TEMP_INV_FLG(TypeConverter.convert(h_TEMP_INV_FLG));
		struct.setINV_COMMENT( ((INV_COMMENT == null) ? (String)null : INV_COMMENT[0]) );
		struct.setList_INV_COMMENT(TypeConverter.convert(INV_COMMENT));
		struct.setINV_START_DATE( ((INV_START_DATE == null) ? (String)null : INV_START_DATE[0]) );
		struct.setList_INV_START_DATE(TypeConverter.convert(INV_START_DATE));
		struct.setSTOCK_SAVE_DATE( ((STOCK_SAVE_DATE == null) ? (String)null : STOCK_SAVE_DATE[0]) );
		struct.setList_STOCK_SAVE_DATE(TypeConverter.convert(STOCK_SAVE_DATE));
		struct.setINV_UPDATED_DATE( ((INV_UPDATED_DATE == null) ? (String)null : INV_UPDATED_DATE[0]) );
		struct.setList_INV_UPDATED_DATE(TypeConverter.convert(INV_UPDATED_DATE));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setw_MRP_FLG( ((w_MRP_FLG == null) ? (String)null : w_MRP_FLG[0]) );
		struct.setList_w_MRP_FLG(TypeConverter.convert(w_MRP_FLG));
		struct.setw_WH_TYP( ((w_WH_TYP == null) ? (String)null : w_WH_TYP[0]) );
		struct.setList_w_WH_TYP(TypeConverter.convert(w_WH_TYP));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setw_MRP_ODR_TYP( ((w_MRP_ODR_TYP == null) ? (String)null : w_MRP_ODR_TYP[0]) );
		struct.setList_w_MRP_ODR_TYP(TypeConverter.convert(w_MRP_ODR_TYP));
		struct.setw_OUTSIDE_TYP( ((w_OUTSIDE_TYP == null) ? (String)null : w_OUTSIDE_TYP[0]) );
		struct.setList_w_OUTSIDE_TYP(TypeConverter.convert(w_OUTSIDE_TYP));
		struct.setWH_VEND_CD( ((WH_VEND_CD == null) ? (String)null : WH_VEND_CD[0]) );
		struct.setList_WH_VEND_CD(TypeConverter.convert(WH_VEND_CD));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.seth_disp_entry_wh( ((h_disp_entry_wh == null) ? (String)null : h_disp_entry_wh[0]) );
		struct.setList_h_disp_entry_wh(TypeConverter.convert(h_disp_entry_wh));
		struct.setw_WH_CD( ((w_WH_CD == null) ? (String)null : w_WH_CD[0]) );
		struct.setList_w_WH_CD(TypeConverter.convert(w_WH_CD));
		struct.seth_disp_entry_item( ((h_disp_entry_item == null) ? (String)null : h_disp_entry_item[0]) );
		struct.setList_h_disp_entry_item(TypeConverter.convert(h_disp_entry_item));
		struct.seth_INV_STS_TYP( ((h_INV_STS_TYP == null) ? (String)null : h_INV_STS_TYP[0]) );
		struct.setList_h_INV_STS_TYP(TypeConverter.convert(h_INV_STS_TYP));
		struct.setw_ABC_TYP( ((w_ABC_TYP == null) ? (String)null : w_ABC_TYP[0]) );
		struct.setList_w_ABC_TYP(TypeConverter.convert(w_ABC_TYP));
		struct.sets_ABC_TYP( ((s_ABC_TYP == null) ? (String)null : s_ABC_TYP[0]) );
		struct.setList_s_ABC_TYP(TypeConverter.convert(s_ABC_TYP));
		struct.sets_ABC_TYP_name( ((s_ABC_TYP_name == null) ? (String)null : s_ABC_TYP_name[0]) );
		struct.setList_s_ABC_TYP_name(TypeConverter.convert(s_ABC_TYP_name));
		struct.sets_ABC_TYP_val( ((s_ABC_TYP_val == null) ? (String)null : s_ABC_TYP_val[0]) );
		struct.setList_s_ABC_TYP_val(TypeConverter.convert(s_ABC_TYP_val));
		struct.setERR_ADR( ((ERR_ADR == null) ? (String)null : ERR_ADR[0]) );
		struct.setList_ERR_ADR(TypeConverter.convert(ERR_ADR));
		struct.setERR_MSG( ((ERR_MSG == null) ? (String)null : ERR_MSG[0]) );
		struct.setList_ERR_MSG(TypeConverter.convert(ERR_MSG));
		struct.seth_saveINV_DATE( ((h_saveINV_DATE == null) ? (String)null : h_saveINV_DATE[0]) );
		struct.setList_h_saveINV_DATE(TypeConverter.convert(h_saveINV_DATE));
		struct.setc_REGULAR_INV_FLG( ((c_REGULAR_INV_FLG == null) ? (String)null : c_REGULAR_INV_FLG[0]) );
		struct.setList_c_REGULAR_INV_FLG(TypeConverter.convert(c_REGULAR_INV_FLG));
		struct.setc_CYCLE_INV_FLG( ((c_CYCLE_INV_FLG == null) ? (String)null : c_CYCLE_INV_FLG[0]) );
		struct.setList_c_CYCLE_INV_FLG(TypeConverter.convert(c_CYCLE_INV_FLG));
		struct.setc_TEMP_INV_FLG( ((c_TEMP_INV_FLG == null) ? (String)null : c_TEMP_INV_FLG[0]) );
		struct.setList_c_TEMP_INV_FLG(TypeConverter.convert(c_TEMP_INV_FLG));
		struct.setc_disp_entry_wh( ((c_disp_entry_wh == null) ? (String)null : c_disp_entry_wh[0]) );
		struct.setList_c_disp_entry_wh(TypeConverter.convert(c_disp_entry_wh));
		struct.setc_disp_entry_item( ((c_disp_entry_item == null) ? (String)null : c_disp_entry_item[0]) );
		struct.setList_c_disp_entry_item(TypeConverter.convert(c_disp_entry_item));
		struct.setc_target( ((c_target == null) ? (String)null : c_target[0]) );
		struct.setList_c_target(TypeConverter.convert(c_target));
		struct.seth_saveINV_STS_TYP( ((h_saveINV_STS_TYP == null) ? (String)null : h_saveINV_STS_TYP[0]) );
		struct.setList_h_saveINV_STS_TYP(TypeConverter.convert(h_saveINV_STS_TYP));
		struct.setINV_WH_CD( ((INV_WH_CD == null) ? (String)null : INV_WH_CD[0]) );
		struct.setList_INV_WH_CD(TypeConverter.convert(INV_WH_CD));
		struct.setMRP_FLG( ((MRP_FLG == null) ? (String)null : MRP_FLG[0]) );
		struct.setList_MRP_FLG(TypeConverter.convert(MRP_FLG));
		struct.setWH_TYP( ((WH_TYP == null) ? (String)null : WH_TYP[0]) );
		struct.setList_WH_TYP(TypeConverter.convert(WH_TYP));
		struct.setINV_ITEM_CD( ((INV_ITEM_CD == null) ? (String)null : INV_ITEM_CD[0]) );
		struct.setList_INV_ITEM_CD(TypeConverter.convert(INV_ITEM_CD));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.setOUTSIDE_TYP( ((OUTSIDE_TYP == null) ? (String)null : OUTSIDE_TYP[0]) );
		struct.setList_OUTSIDE_TYP(TypeConverter.convert(OUTSIDE_TYP));
		struct.setABC_TYP( ((ABC_TYP == null) ? (String)null : ABC_TYP[0]) );
		struct.setList_ABC_TYP(TypeConverter.convert(ABC_TYP));
		struct.setw_target( ((w_target == null) ? (String)null : w_target[0]) );
		struct.setList_w_target(TypeConverter.convert(w_target));
		struct.setr1_inv_target( ((r1_inv_target == null) ? (String)null : r1_inv_target[0]) );
		struct.setList_r1_inv_target(TypeConverter.convert(r1_inv_target));
		struct.setr2_inv_target( ((r2_inv_target == null) ? (String)null : r2_inv_target[0]) );
		struct.setList_r2_inv_target(TypeConverter.convert(r2_inv_target));
		struct.setFileName( ((FileName == null) ? (String)null : FileName[0]) );
		struct.setList_FileName(TypeConverter.convert(FileName));
		struct.seth_saveTEMP_INV_FLG( ((h_saveTEMP_INV_FLG == null) ? (String)null : h_saveTEMP_INV_FLG[0]) );
		struct.setList_h_saveTEMP_INV_FLG(TypeConverter.convert(h_saveTEMP_INV_FLG));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AH0020010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAH0020010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAH0020010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AH0020010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AH0020010Entity entity = control.entity;
		AH0020010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AH0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AH0020010Control control;
		AH0020010Entity  entity = null;
		AH0020010Struct  struct = null;

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

			if( (control = (AH0020010Control)so.getAttribute("AH0020010Control_"+request.getSession(false).getId())) == null ) {
				control = new AH0020010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AH0020010Control();
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
				} else if( isClick(request, "select_wh") ) {
					if ( !isCryptical(request, so, params, "select_wh") ) return ERROR_TARGET;
					target = onClickselect_wh(request, response, so, params, control);
					control.setButton("select_wh");
				} else if( isClick(request, "select_item") ) {
					if ( !isCryptical(request, so, params, "select_item") ) return ERROR_TARGET;
					target = onClickselect_item(request, response, so, params, control);
					control.setButton("select_item");
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
				} else if( isClick(request, "select_sub1") ) {
					if ( !isCryptical(request, so, params, "select_sub1") ) return ERROR_TARGET;
					target = onClickselect_sub1(request, response, so, params, control);
					control.setButton("select_sub1");
				} else if( isClick(request, "update_sub1") ) {
					if ( !isCryptical(request, so, params, "update_sub1") ) return ERROR_TARGET;
					target = onClickupdate_sub1(request, response, so, params, control);
					control.setButton("update_sub1");
				} else if( isClick(request, "clear_sub1") ) {
					if ( !isCryptical(request, so, params, "clear_sub1") ) return ERROR_TARGET;
					target = onClickclear_sub1(request, response, so, params, control);
					control.setButton("clear_sub1");
				} else if( isClick(request, "return_sub1") ) {
					if ( !isCryptical(request, so, params, "return_sub1") ) return ERROR_TARGET;
					target = onClickreturn_sub1(request, response, so, params, control);
					control.setButton("return_sub1");
				} else if( isClick(request, "select_sub2") ) {
					if ( !isCryptical(request, so, params, "select_sub2") ) return ERROR_TARGET;
					target = onClickselect_sub2(request, response, so, params, control);
					control.setButton("select_sub2");
				} else if( isClick(request, "update_sub2") ) {
					if ( !isCryptical(request, so, params, "update_sub2") ) return ERROR_TARGET;
					target = onClickupdate_sub2(request, response, so, params, control);
					control.setButton("update_sub2");
				} else if( isClick(request, "clear_sub2") ) {
					if ( !isCryptical(request, so, params, "clear_sub2") ) return ERROR_TARGET;
					target = onClickclear_sub2(request, response, so, params, control);
					control.setButton("clear_sub2");
				} else if( isClick(request, "return_sub2") ) {
					if ( !isCryptical(request, so, params, "return_sub2") ) return ERROR_TARGET;
					target = onClickreturn_sub2(request, response, so, params, control);
					control.setButton("return_sub2");
				} else if( isClick(request, "return_sub3") ) {
					if ( !isCryptical(request, so, params, "return_sub3") ) return ERROR_TARGET;
					target = onClickreturn_sub3(request, response, so, params, control);
					control.setButton("return_sub3");
				} else if( isClick(request, "CsvImportWh") ) {
					if ( !isCryptical(request, so, params, "CsvImportWh") ) return ERROR_TARGET;
					target = onClickCsvImportWh(request, response, so, params, control);
					control.setButton("CsvImportWh");
				} else if( isClick(request, "CsvImportItem") ) {
					if ( !isCryptical(request, so, params, "CsvImportItem") ) return ERROR_TARGET;
					target = onClickCsvImportItem(request, response, so, params, control);
					control.setButton("CsvImportItem");
				} else if( isClick(request, "Browse") ) {
					if ( !isCryptical(request, so, params, "Browse") ) return ERROR_TARGET;
					target = onClickBrowse(request, response, so, params, control);
					control.setButton("Browse");
				} else if( isClick(request, "CsvIn") ) {
					if ( !isCryptical(request, so, params, "CsvIn") ) return ERROR_TARGET;
					target = onClickCsvIn(request, response, so, params, control);
					control.setButton("CsvIn");
				} else if( isClick(request, "selectall") ) {
					if ( !isCryptical(request, so, params, "selectall") ) return ERROR_TARGET;
					target = onClickselectall(request, response, so, params, control);
					control.setButton("selectall");
				} else if( isClick(request, "cancelselectall") ) {
					if ( !isCryptical(request, so, params, "cancelselectall") ) return ERROR_TARGET;
					target = onClickcancelselectall(request, response, so, params, control);
					control.setButton("cancelselectall");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AH0020010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "select_wh") && bFLG_DISCONNECT_select_wh)
				|| (isClick(request, "select_item") && bFLG_DISCONNECT_select_item)
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "delete") && bFLG_DISCONNECT_delete)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "select_sub1") && bFLG_DISCONNECT_select_sub1)
				|| (isClick(request, "update_sub1") && bFLG_DISCONNECT_update_sub1)
				|| (isClick(request, "clear_sub1") && bFLG_DISCONNECT_clear_sub1)
				|| (isClick(request, "return_sub1") && bFLG_DISCONNECT_return_sub1)
				|| (isClick(request, "select_sub2") && bFLG_DISCONNECT_select_sub2)
				|| (isClick(request, "update_sub2") && bFLG_DISCONNECT_update_sub2)
				|| (isClick(request, "clear_sub2") && bFLG_DISCONNECT_clear_sub2)
				|| (isClick(request, "return_sub2") && bFLG_DISCONNECT_return_sub2)
				|| (isClick(request, "return_sub3") && bFLG_DISCONNECT_return_sub3)
				|| (isClick(request, "CsvImportWh") && bFLG_DISCONNECT_CsvImportWh)
				|| (isClick(request, "CsvImportItem") && bFLG_DISCONNECT_CsvImportItem)
				|| (isClick(request, "Browse") && bFLG_DISCONNECT_Browse)
				|| (isClick(request, "CsvIn") && bFLG_DISCONNECT_CsvIn)
				|| (isClick(request, "selectall") && bFLG_DISCONNECT_selectall)
				|| (isClick(request, "cancelselectall") && bFLG_DISCONNECT_cancelselectall)
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
	private  static boolean bFLG_DISCONNECT_select_wh = true;
	private  static boolean bFLG_DISCONNECT_select_item = true;
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_delete = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_select_sub1 = true;
	private  static boolean bFLG_DISCONNECT_update_sub1 = true;
	private  static boolean bFLG_DISCONNECT_clear_sub1 = true;
	private  static boolean bFLG_DISCONNECT_return_sub1 = true;
	private  static boolean bFLG_DISCONNECT_select_sub2 = true;
	private  static boolean bFLG_DISCONNECT_update_sub2 = true;
	private  static boolean bFLG_DISCONNECT_clear_sub2 = true;
	private  static boolean bFLG_DISCONNECT_return_sub2 = true;
	private  static boolean bFLG_DISCONNECT_return_sub3 = true;
	private  static boolean bFLG_DISCONNECT_CsvImportWh = true;
	private  static boolean bFLG_DISCONNECT_CsvImportItem = true;
	private  static boolean bFLG_DISCONNECT_Browse = true;
	private  static boolean bFLG_DISCONNECT_CsvIn = true;
	private  static boolean bFLG_DISCONNECT_selectall = true;
	private  static boolean bFLG_DISCONNECT_cancelselectall = true;

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
		return "com.nec.jp.orteus.metamorBase.AH0020.AH0020010Servlet";
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
	public AH0020010Servlet()
	{
		//{{user_implement_dev:<AH0020010_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_select_wh = true;
                bFLG_DISCONNECT_select_item = true;
                bFLG_DISCONNECT_insert = true;
                bFLG_DISCONNECT_update = true;
                bFLG_DISCONNECT_delete = true;
                bFLG_DISCONNECT_clear = true;
                bFLG_DISCONNECT_select_sub1 = true;
                bFLG_DISCONNECT_update_sub1 = true;
                bFLG_DISCONNECT_clear_sub1 = true;
                bFLG_DISCONNECT_return_sub1 = true;
                bFLG_DISCONNECT_select_sub2 = true;
                bFLG_DISCONNECT_update_sub2 = true;
                bFLG_DISCONNECT_clear_sub2 = true;
                bFLG_DISCONNECT_return_sub2 = true;
              
                //}}user_implement_dev:<AH0020010_DisConnect_FLG>

		//{{user_implement_dev:<AH0020010Servlet>
                //}}user_implement_dev:<AH0020010Servlet>
	}

	//////////////////////////////

}
