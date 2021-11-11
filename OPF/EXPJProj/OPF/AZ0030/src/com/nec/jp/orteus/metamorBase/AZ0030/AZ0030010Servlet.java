/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0030/src/com/nec/jp/orteus/metamorBase/AZ0030/AZ0030010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0030;

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
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
//}}user_implement_dev:import

//{{user_implement_dev:header
//}}user_implement_dev:header

public class AZ0030010Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
       //------------------------------------------------------------------------------
       
        /** 
         * �e��ʂ̈ꗗ�u�m�F�v���̃`�F�b�N�{�b�N�X�̃`�F�b�N��Ԃ��擾���Acontrol�̃����o�֐ݒ肷��
         * @param HttpServletRequest request
         * @param Hashtable params
         * @param AZ0030010Struct control
        */
        private void setCheckboxStatus(
            HttpServletRequest request,
            Hashtable params,
            AZ0030010Control control)
        {
         for(int i = 0; i < control.getListsize(); i++)
         {
          AZ0030010Struct temp_struct = (AZ0030010Struct)control.getListvalue(control.convListDataIndex(i));
          String[] val = ((params.containsKey("h_confirm_flg" + i)) ? (String[])params.get("h_confirm_flg" + i) : (String[])null);
          if(val != null && "1".equals(val[0]))
          {
           temp_struct.setw_confirm_flg(new Integer(1));
          }
          else
          {
           temp_struct.setw_confirm_flg(new Integer(0));
          }
         }
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
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AZ0030010Control control)
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
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AZ0030010Control control)
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
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
			logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 objMessage.m_writer.write( Level.ALL, "AZ0030010"+" $Revision: 1.9 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------------------
              
                try {
              
                 // �����[�h����
                 setScreenMoveParams(params, control);
                 control.control_eventHandller("reload");
                 if(control.isScreenMove()) {
                  getSessionParameters(so, params, struct);
                  control.control_eventHandller("select");
                 }
              
                } catch ( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------------------
              
                try {
              
                 // ��ʏ�̐ݒ�l���擾
                 String[] val = null;
              
                 // �u�Ώہvradio�̑I���󋵂��擾�ݒ�
                 val = ((params.containsKey("h_plant_flg")) ? (String[])params.get("h_plant_flg") : (String[])null);
                 if(val != null && "1".equals(val[0]))
                 {
                  struct.seth_plant_flg(new Integer(1));
                 }
                 else
                 {
                  struct.seth_plant_flg(new Integer(0));
                 }
              
                 // �u�����[�U�\���vcheckbox�̃`�F�b�N�󋵂��擾�ݒ�
                 val = ((params.containsKey("h_own_flg")) ? (String[])params.get("h_own_flg") : (String[])null);
                 if(val != null && "1".equals(val[0]))
                 {
                  struct.seth_own_flg(new Integer(1));
                 }
                 else
                 {
                  struct.seth_own_flg(new Integer(0));
                 }
              
                 // �u�\�����vradio�̑I���󋵂��擾�ݒ�
                 val = ((params.containsKey("h_sort_flg")) ? (String[])params.get("h_sort_flg") : (String[])null);
                 if(val != null && "1".equals(val[0]))
                 {
                  struct.seth_sort_flg("1");
                 }
                 else
                 {
                  struct.seth_sort_flg("0");
                 }
              
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
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
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
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * �ڍ׃{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	public String onClickdetail(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickdetail");
		//{{user_implement_dev:<onClickdetail>
                //------------------------------------------------------------------------------
              
                try {
              
                 // �ڍו\������
                 control.control_eventHandller("detail");
              
                 // �G���[�Ȃ��̏ꍇ�A�q��ʂɑJ��
                 if(control.getMessage().sizeError() <= 0)
                 {
                  nextUrl = "/AZ0030011.jsp";
                 }
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickdetail>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickdetail");

		return nextUrl;
	}

	/**
	 * �m�F�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	public String onClickconfirm(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickconfirm");
		//{{user_implement_dev:<onClickconfirm>
                //------------------------------------------------------------------------------
              
                try {
              
                 // �m�F����
                 control.control_eventHandller("confirm");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickconfirm>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickconfirm");

		return nextUrl;
	}

	/**
	 * �O�փ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	public String onClickprev_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickprev_sub1");
		//{{user_implement_dev:<onClickprev_sub1>
                //------------------------------------------------------------------------------
              
                try {
              
                 // �O�f�[�^�ݒ菈��
                 control.control_eventHandller("prev_sub1");
              
                 // �e��ʂɖ߂�Ȃ��悤�ɂ��鏈��
                 nextUrl = "/AZ0030011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickprev_sub1>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickprev_sub1");

		return nextUrl;
	}

	/**
	 * ���փ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	public String onClicknext_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClicknext_sub1");
		//{{user_implement_dev:<onClicknext_sub1>
                //------------------------------------------------------------------------------
              
                try {
              
                 // ���f�[�^�ݒ菈��
                 control.control_eventHandller("next_sub1");
              
                 // �e��ʂɖ߂�Ȃ��悤�ɂ��鏈��
                 nextUrl = "/AZ0030011.jsp";
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClicknext_sub1>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClicknext_sub1");

		return nextUrl;
	}

	/**
	 * �m�F�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	public String onClickconfirm_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickconfirm_sub1");
		//{{user_implement_dev:<onClickconfirm_sub1>
                //---------------------------------------------------------------------
              
                try{
              
                 // �Ώۃf�[�^�m�F����
                 control.control_eventHandller("confirm_sub1");
              
                 // �e��ʂɖ߂�Ȃ��悤�ɂ��鏈��
                 nextUrl = "/AZ0030011.jsp";
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickconfirm_sub1>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickconfirm_sub1");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	public String onClickreturn_sub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");
		//{{user_implement_dev:<onClickreturn_sub1>
                //---------------------------------------------------------------------
              
                try {
              
                 // �߂鏈��
                 control.control_eventHandller("return_sub1");
              
                } catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<onClickreturn_sub1>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickreturn_sub1");

		return nextUrl;
	}

	/**
	 * �S�I���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	public String onClickselectall(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickselectall");
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
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickselectall");

		return nextUrl;
	}

	/**
	 * �S�����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AZ0030010Control�N���X�C���X�^���X
	 */
	public String onClickcancelselectall(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AZ0030010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelselectall");
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
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"onClickcancelselectall");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AZ0030010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] LOG_CD = ((params.containsKey("LOG_CD")) ? (String[])params.get("LOG_CD") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] USER_NAME = ((params.containsKey("USER_NAME")) ? (String[])params.get("USER_NAME") : (String[])null);
		String[] FROM_DATE = ((params.containsKey("FROM_DATE")) ? (String[])params.get("FROM_DATE") : (String[])null);
		String[] h_FROM_TIME = ((params.containsKey("h_FROM_TIME")) ? (String[])params.get("h_FROM_TIME") : (String[])null);
		String[] s_FROM_TIME = ((params.containsKey("s_FROM_TIME")) ? (String[])params.get("s_FROM_TIME") : (String[])null);
		String[] s_FROM_TIME_name = ((params.containsKey("s_FROM_TIME_name")) ? (String[])params.get("s_FROM_TIME_name") : (String[])null);
		String[] s_FROM_TIME_val = ((params.containsKey("s_FROM_TIME_val")) ? (String[])params.get("s_FROM_TIME_val") : (String[])null);
		String[] TO_DATE = ((params.containsKey("TO_DATE")) ? (String[])params.get("TO_DATE") : (String[])null);
		String[] s_TO_TIME = ((params.containsKey("s_TO_TIME")) ? (String[])params.get("s_TO_TIME") : (String[])null);
		String[] s_TO_TIME_name = ((params.containsKey("s_TO_TIME_name")) ? (String[])params.get("s_TO_TIME_name") : (String[])null);
		String[] s_TO_TIME_val = ((params.containsKey("s_TO_TIME_val")) ? (String[])params.get("s_TO_TIME_val") : (String[])null);
		String[] h_TO_TIME = ((params.containsKey("h_TO_TIME")) ? (String[])params.get("h_TO_TIME") : (String[])null);
		String[] h_plant_flg = ((params.containsKey("h_plant_flg")) ? (String[])params.get("h_plant_flg") : (String[])null);
		String[] h_own_flg = ((params.containsKey("h_own_flg")) ? (String[])params.get("h_own_flg") : (String[])null);
		String[] h_sort_flg = ((params.containsKey("h_sort_flg")) ? (String[])params.get("h_sort_flg") : (String[])null);
		String[] h_detail_flg = ((params.containsKey("h_detail_flg")) ? (String[])params.get("h_detail_flg") : (String[])null);
		String[] CREATED_DATE = ((params.containsKey("CREATED_DATE")) ? (String[])params.get("CREATED_DATE") : (String[])null);
		String[] MSG = ((params.containsKey("MSG")) ? (String[])params.get("MSG") : (String[])null);
		String[] DATA_STRING = ((params.containsKey("DATA_STRING")) ? (String[])params.get("DATA_STRING") : (String[])null);
		String[] CONFIRM_DATE = ((params.containsKey("CONFIRM_DATE")) ? (String[])params.get("CONFIRM_DATE") : (String[])null);
		String[] w_BUSINESS_NAME = ((params.containsKey("w_BUSINESS_NAME")) ? (String[])params.get("w_BUSINESS_NAME") : (String[])null);
		String[] w_DATA_STRING = ((params.containsKey("w_DATA_STRING")) ? (String[])params.get("w_DATA_STRING") : (String[])null);
		String[] r_PLANT_ALL = ((params.containsKey("r_PLANT_ALL")) ? (String[])params.get("r_PLANT_ALL") : (String[])null);
		String[] r_PLANT = ((params.containsKey("r_PLANT")) ? (String[])params.get("r_PLANT") : (String[])null);
		String[] c_OWN = ((params.containsKey("c_OWN")) ? (String[])params.get("c_OWN") : (String[])null);
		String[] r_SORT_NEW = ((params.containsKey("r_SORT_NEW")) ? (String[])params.get("r_SORT_NEW") : (String[])null);
		String[] r_SORT_OLD = ((params.containsKey("r_SORT_OLD")) ? (String[])params.get("r_SORT_OLD") : (String[])null);
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] USER_CD = ((params.containsKey("USER_CD")) ? (String[])params.get("USER_CD") : (String[])null);
		String[] h_PLAN_TYP = ((params.containsKey("h_PLAN_TYP")) ? (String[])params.get("h_PLAN_TYP") : (String[])null);
		String[] BUSINESS_NAME = ((params.containsKey("BUSINESS_NAME")) ? (String[])params.get("BUSINESS_NAME") : (String[])null);

		struct.setLOG_CD( ((LOG_CD == null) ? (String)null : LOG_CD[0]) );
		struct.setList_LOG_CD(TypeConverter.convert(LOG_CD));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setUSER_NAME( ((USER_NAME == null) ? (String)null : USER_NAME[0]) );
		struct.setList_USER_NAME(TypeConverter.convert(USER_NAME));
		struct.setFROM_DATE( ((FROM_DATE == null) ? (String)null : FROM_DATE[0]) );
		struct.setList_FROM_DATE(TypeConverter.convert(FROM_DATE));
		struct.seth_FROM_TIME( ((h_FROM_TIME == null) ? (String)null : h_FROM_TIME[0]) );
		struct.setList_h_FROM_TIME(TypeConverter.convert(h_FROM_TIME));
		struct.sets_FROM_TIME( ((s_FROM_TIME == null) ? (String)null : s_FROM_TIME[0]) );
		struct.setList_s_FROM_TIME(TypeConverter.convert(s_FROM_TIME));
		struct.sets_FROM_TIME_name( ((s_FROM_TIME_name == null) ? (String)null : s_FROM_TIME_name[0]) );
		struct.setList_s_FROM_TIME_name(TypeConverter.convert(s_FROM_TIME_name));
		struct.sets_FROM_TIME_val( ((s_FROM_TIME_val == null) ? (String)null : s_FROM_TIME_val[0]) );
		struct.setList_s_FROM_TIME_val(TypeConverter.convert(s_FROM_TIME_val));
		struct.setTO_DATE( ((TO_DATE == null) ? (String)null : TO_DATE[0]) );
		struct.setList_TO_DATE(TypeConverter.convert(TO_DATE));
		struct.sets_TO_TIME( ((s_TO_TIME == null) ? (String)null : s_TO_TIME[0]) );
		struct.setList_s_TO_TIME(TypeConverter.convert(s_TO_TIME));
		struct.sets_TO_TIME_name( ((s_TO_TIME_name == null) ? (String)null : s_TO_TIME_name[0]) );
		struct.setList_s_TO_TIME_name(TypeConverter.convert(s_TO_TIME_name));
		struct.sets_TO_TIME_val( ((s_TO_TIME_val == null) ? (String)null : s_TO_TIME_val[0]) );
		struct.setList_s_TO_TIME_val(TypeConverter.convert(s_TO_TIME_val));
		struct.seth_TO_TIME( ((h_TO_TIME == null) ? (String)null : h_TO_TIME[0]) );
		struct.setList_h_TO_TIME(TypeConverter.convert(h_TO_TIME));
		if( (h_plant_flg == null)||("".equals(h_plant_flg[0])) ) {
		   struct.seth_plant_flg( (Integer)null );
		} else {
		   struct.seth_plant_flg( new Integer(h_plant_flg[0]) );
		   struct.setList_h_plant_flg(TypeConverter.convert(h_plant_flg));
		}
		if( (h_own_flg == null)||("".equals(h_own_flg[0])) ) {
		   struct.seth_own_flg( (Integer)null );
		} else {
		   struct.seth_own_flg( new Integer(h_own_flg[0]) );
		   struct.setList_h_own_flg(TypeConverter.convert(h_own_flg));
		}
		if( (h_sort_flg == null)||("".equals(h_sort_flg[0])) ) {
		   struct.seth_sort_flg( (Integer)null );
		} else {
		   struct.seth_sort_flg( new Integer(h_sort_flg[0]) );
		   struct.setList_h_sort_flg(TypeConverter.convert(h_sort_flg));
		}
		if( (h_detail_flg == null)||("".equals(h_detail_flg[0])) ) {
		   struct.seth_detail_flg( (Integer)null );
		} else {
		   struct.seth_detail_flg( new Integer(h_detail_flg[0]) );
		   struct.setList_h_detail_flg(TypeConverter.convert(h_detail_flg));
		}
		struct.setCREATED_DATE( ((CREATED_DATE == null) ? (String)null : CREATED_DATE[0]) );
		struct.setList_CREATED_DATE(TypeConverter.convert(CREATED_DATE));
		struct.setMSG( ((MSG == null) ? (String)null : MSG[0]) );
		struct.setList_MSG(TypeConverter.convert(MSG));
		struct.setDATA_STRING( ((DATA_STRING == null) ? (String)null : DATA_STRING[0]) );
		struct.setList_DATA_STRING(TypeConverter.convert(DATA_STRING));
		struct.setCONFIRM_DATE( ((CONFIRM_DATE == null) ? (String)null : CONFIRM_DATE[0]) );
		struct.setList_CONFIRM_DATE(TypeConverter.convert(CONFIRM_DATE));
		struct.setw_BUSINESS_NAME( ((w_BUSINESS_NAME == null) ? (String)null : w_BUSINESS_NAME[0]) );
		struct.setList_w_BUSINESS_NAME(TypeConverter.convert(w_BUSINESS_NAME));
		struct.setw_DATA_STRING( ((w_DATA_STRING == null) ? (String)null : w_DATA_STRING[0]) );
		struct.setList_w_DATA_STRING(TypeConverter.convert(w_DATA_STRING));
		struct.setr_PLANT_ALL( ((r_PLANT_ALL == null) ? (String)null : r_PLANT_ALL[0]) );
		struct.setList_r_PLANT_ALL(TypeConverter.convert(r_PLANT_ALL));
		struct.setr_PLANT( ((r_PLANT == null) ? (String)null : r_PLANT[0]) );
		struct.setList_r_PLANT(TypeConverter.convert(r_PLANT));
		struct.setc_OWN( ((c_OWN == null) ? (String)null : c_OWN[0]) );
		struct.setList_c_OWN(TypeConverter.convert(c_OWN));
		struct.setr_SORT_NEW( ((r_SORT_NEW == null) ? (String)null : r_SORT_NEW[0]) );
		struct.setList_r_SORT_NEW(TypeConverter.convert(r_SORT_NEW));
		struct.setr_SORT_OLD( ((r_SORT_OLD == null) ? (String)null : r_SORT_OLD[0]) );
		struct.setList_r_SORT_OLD(TypeConverter.convert(r_SORT_OLD));
		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setUSER_CD( ((USER_CD == null) ? (String)null : USER_CD[0]) );
		struct.setList_USER_CD(TypeConverter.convert(USER_CD));
		struct.seth_PLAN_TYP( ((h_PLAN_TYP == null) ? (String)null : h_PLAN_TYP[0]) );
		struct.setList_h_PLAN_TYP(TypeConverter.convert(h_PLAN_TYP));
		struct.setBUSINESS_NAME( ((BUSINESS_NAME == null) ? (String)null : BUSINESS_NAME[0]) );
		struct.setList_BUSINESS_NAME(TypeConverter.convert(BUSINESS_NAME));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AZ0030010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAZ0030010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAZ0030010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AZ0030010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AZ0030010Entity entity = control.entity;
		AZ0030010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AZ0030010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AZ0030010Control control;
		AZ0030010Entity  entity = null;
		AZ0030010Struct  struct = null;

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

			if( (control = (AZ0030010Control)so.getAttribute("AZ0030010Control_"+request.getSession(false).getId())) == null ) {
				control = new AZ0030010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AZ0030010Control();
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
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "detail") ) {
					if ( !isCryptical(request, so, params, "detail") ) return ERROR_TARGET;
					target = onClickdetail(request, response, so, params, control);
					control.setButton("detail");
				} else if( isClick(request, "confirm") ) {
					if ( !isCryptical(request, so, params, "confirm") ) return ERROR_TARGET;
					target = onClickconfirm(request, response, so, params, control);
					control.setButton("confirm");
				} else if( isClick(request, "prev_sub1") ) {
					if ( !isCryptical(request, so, params, "prev_sub1") ) return ERROR_TARGET;
					target = onClickprev_sub1(request, response, so, params, control);
					control.setButton("prev_sub1");
				} else if( isClick(request, "next_sub1") ) {
					if ( !isCryptical(request, so, params, "next_sub1") ) return ERROR_TARGET;
					target = onClicknext_sub1(request, response, so, params, control);
					control.setButton("next_sub1");
				} else if( isClick(request, "confirm_sub1") ) {
					if ( !isCryptical(request, so, params, "confirm_sub1") ) return ERROR_TARGET;
					target = onClickconfirm_sub1(request, response, so, params, control);
					control.setButton("confirm_sub1");
				} else if( isClick(request, "return_sub1") ) {
					if ( !isCryptical(request, so, params, "return_sub1") ) return ERROR_TARGET;
					target = onClickreturn_sub1(request, response, so, params, control);
					control.setButton("return_sub1");
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

				so.setAttribute("AZ0030010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "detail") && bFLG_DISCONNECT_detail)
				|| (isClick(request, "confirm") && bFLG_DISCONNECT_confirm)
				|| (isClick(request, "prev_sub1") && bFLG_DISCONNECT_prev_sub1)
				|| (isClick(request, "next_sub1") && bFLG_DISCONNECT_next_sub1)
				|| (isClick(request, "confirm_sub1") && bFLG_DISCONNECT_confirm_sub1)
				|| (isClick(request, "return_sub1") && bFLG_DISCONNECT_return_sub1)
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
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_detail = true;
	private  static boolean bFLG_DISCONNECT_confirm = true;
	private  static boolean bFLG_DISCONNECT_prev_sub1 = true;
	private  static boolean bFLG_DISCONNECT_next_sub1 = true;
	private  static boolean bFLG_DISCONNECT_confirm_sub1 = true;
	private  static boolean bFLG_DISCONNECT_return_sub1 = true;
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
		return "com.nec.jp.orteus.metamorBase.AZ0030.AZ0030010Servlet";
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
	public AZ0030010Servlet()
	{
		//{{user_implement_dev:<AZ0030010_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
              
                //}}user_implement_dev:<AZ0030010_DisConnect_FLG>

		//{{user_implement_dev:<AZ0030010Servlet>
                 
                //}}user_implement_dev:<AZ0030010Servlet>
	}

	//////////////////////////////

}
