/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0080/src/com/nec/jp/orteus/metamorBase/AA0080/AA0080020Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0080;

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

public class AA0080020Servlet extends HttpServlet
{

	//////////////////////////////

	//{{user_implement_dev:class_head
        //------------------------------------------------------------------------------
        
         /** �R�����g���X�g */
         private List _commentList = new ArrayList(0);
       
         /** �x�����X�g */
         private List _holidayList = new ArrayList(0);
       
         /** �x�� OFF */
         private final static String _s_Off = "0";
       
         /** �x�� OFF */
         private final static String _s_On = "1";
       
         /** �x�� OFF */
         private final static Integer _i_Off = new Integer(0);
       
         /** �x�� ON */
         private final static Integer _i_On = new Integer(1);
       
         /** �󕶎� */
         private final static String _emptyStr = "";
       
        //------------------------------------------------------------------------------
        /** 
         * �ꗗ���擾�ݒ菈��
         *
         * @param	AA0080020Control	control
         * @return	�Ȃ�
        */
        private void setListData(AA0080020Control control)
        {
         // �ꗗ���擾�ݒ�
         List list = control.getNowCalendarList();
         list.clear();
         if(control.struct.getList_CAL_DATE() != null)
         {
          // �ꗗ�ɕ\������Ă���f�[�^�����������J��Ԃ�
          for(int i = 0; i < control.struct.getList_CAL_DATE().size(); i++)
          {
           // �f�[�^�擾
           AA0080020Struct targetStruct = new AA0080020Struct();
                 targetStruct.importData(control.struct, i);
                 //�J�����_�ԍ��ݒ�
                 targetStruct.setCAL_NO(control.struct.getCAL_NO());
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
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AA0080020Control control)
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
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AA0080020Control control)
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
	 * @param control AA0080020Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
			logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 objMessage.m_writer.write( Level.ALL, "AA0080020"+" $Revision: 1.7 $" );
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0080020Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------------------
                try {
              
                 setScreenMoveParams(params, control);
                 control.control_eventHandller("reload");
                 if(control.isScreenMove()) {
                  getSessionParameters(so, params, struct);
                  control.control_eventHandller("select");
                 }
              
                }catch( FoundationException e ) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
                //------------------------------------------------------------------
                try {
              
                 control.control_eventHandller("select");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �J�����_�쐬�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	public String onClickinsert(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");
		//{{user_implement_dev:<onClickinsert>
                //------------------------------------------------------------------
                try {
                 // �ꗗ���擾�ݒ菈��(�G���[���Ή��̂���)
                 setListData(control);
              
                 control.control_eventHandller("insert");
              
                 // �G���[���������Ă��Ȃ��ꍇ�A�q��ʑJ��
                 if(control.getMessage().sizeError() <= 0)
                  nextUrl = "/AA0080021.jsp";
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsert>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickinsert");

		return nextUrl;
	}

	/**
	 * �x���Đݒ�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	public String onClickchange(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickchange");
		//{{user_implement_dev:<onClickchange>
                //------------------------------------------------------------------
                try {
                 // �ꗗ���擾�ݒ菈��(�G���[���Ή��̂���)
                 setListData(control);
              
                 control.control_eventHandller("change");
              
                 // �G���[���������Ă��Ȃ��ꍇ�A�q��ʑJ��
                 if(control.getMessage().sizeError() <= 0)
                  nextUrl = "/AA0080021.jsp";
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickchange>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickchange");

		return nextUrl;
	}

	/**
	 * �O���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	public String onClickbefore(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickbefore");
		//{{user_implement_dev:<onClickbefore>
                //------------------------------------------------------------------
                try {
                 // �ꗗ���擾�ݒ菈��(�G���[���Ή��̂���)
                 setListData(control);
              
                 control.control_eventHandller("before");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickbefore>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickbefore");

		return nextUrl;
	}

	/**
	 * �����{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	public String onClicknext(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClicknext");
		//{{user_implement_dev:<onClicknext>
                //------------------------------------------------------------------
                try {
                 // �ꗗ���擾�ݒ菈��(�G���[���Ή��̂���)
                 setListData(control);
              
                 control.control_eventHandller("next");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClicknext>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClicknext");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	public String onClickupdate(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");
		//{{user_implement_dev:<onClickupdate>
                //------------------------------------------------------------------
                try {
                 // �ꗗ���擾�ݒ菈��
                 setListData(control);
              
                 // �X�V���ϊ�(�x��)
                 int size = control.getNowCalendarList().size();
                 _commentList.clear();
                 _holidayList.clear();
              
                 for(int i = 0; i < size; i++){
                  AA0080020Struct targetStruct = (AA0080020Struct)(((List)control.getNowCalendarList()).get(i));
              
                  // �x���`�F�b�N�{�b�N�X�̃`�F�b�N��Ԃ��t���O�l�ɕϊ�
                  String strTemp = targetStruct.getc_HOLIDAY_FLG();
                  if("true".equals(strTemp) != true)
                   targetStruct.setHOLIDAY_FLG(_i_Off);
                  else
                   targetStruct.setHOLIDAY_FLG(_i_On);
              
                  targetStruct.seth_TIME_CTRL(struct.geth_TIME_CTRL());
                 }
              
                 control.control_eventHandller("update");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdate>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickupdate");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------
                try {
              
                 control.control_eventHandller("clear");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * �o�^�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	public String onClickinsertSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");
		//{{user_implement_dev:<onClickinsertSub1>
                //------------------------------------------------------------------
                try {
              
                 control.control_eventHandller("insertSub1");
              
                 // �G���[�����̏ꍇ�A�q��ʂɑJ��
                 if(control.getMessage().sizeError() > 0)
                 {
                  nextUrl = "/AA0080021.jsp";
                 }
                 else
                 {
                  // �e��ʓǍ�����
                  control.readParentData();
                 }
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsertSub1>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	public String onClickupdateSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub1");
		//{{user_implement_dev:<onClickupdateSub1>
                //------------------------------------------------------------------
                try {
              
                 control.control_eventHandller("updateSub1");
              
                 // �G���[�����̏ꍇ�A�q��ʂɑJ��
                 if(control.getMessage().sizeError() > 0)
                 {
                  nextUrl = "/AA0080021.jsp";
                 }
                 else
                 {
                  // �e��ʓǍ�����
                  control.readParentData();
                 }
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickupdateSub1>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickupdateSub1");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0080020Control�N���X�C���X�^���X
	 */
	public String onClickcloseSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0080020Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");
		//{{user_implement_dev:<onClickcloseSub1>
                //------------------------------------------------------------------
                try {
              
                 control.control_eventHandller("closeSub1");
              
                }catch(FoundationException e) {
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 ee.add(emsg);
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<onClickcloseSub1>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0080020Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] CAL_NO = ((params.containsKey("CAL_NO")) ? (String[])params.get("CAL_NO") : (String[])null);
		String[] CAL_NAME = ((params.containsKey("CAL_NAME")) ? (String[])params.get("CAL_NAME") : (String[])null);
		String[] DATE_FROM = ((params.containsKey("DATE_FROM")) ? (String[])params.get("DATE_FROM") : (String[])null);
		String[] CAL_DATE = ((params.containsKey("CAL_DATE")) ? (String[])params.get("CAL_DATE") : (String[])null);
		String[] CAL_DATE_WEEK = ((params.containsKey("CAL_DATE_WEEK")) ? (String[])params.get("CAL_DATE_WEEK") : (String[])null);
		String[] h_HOLIDAY_SUN = ((params.containsKey("h_HOLIDAY_SUN")) ? (String[])params.get("h_HOLIDAY_SUN") : (String[])null);
		String[] h_HOLIDAY_MON = ((params.containsKey("h_HOLIDAY_MON")) ? (String[])params.get("h_HOLIDAY_MON") : (String[])null);
		String[] h_HOLIDAY_TUE = ((params.containsKey("h_HOLIDAY_TUE")) ? (String[])params.get("h_HOLIDAY_TUE") : (String[])null);
		String[] h_HOLIDAY_WED = ((params.containsKey("h_HOLIDAY_WED")) ? (String[])params.get("h_HOLIDAY_WED") : (String[])null);
		String[] h_HOLIDAY_THU = ((params.containsKey("h_HOLIDAY_THU")) ? (String[])params.get("h_HOLIDAY_THU") : (String[])null);
		String[] h_HOLIDAY_FRI = ((params.containsKey("h_HOLIDAY_FRI")) ? (String[])params.get("h_HOLIDAY_FRI") : (String[])null);
		String[] h_HOLIDAY_SAT = ((params.containsKey("h_HOLIDAY_SAT")) ? (String[])params.get("h_HOLIDAY_SAT") : (String[])null);
		String[] DATE_TO = ((params.containsKey("DATE_TO")) ? (String[])params.get("DATE_TO") : (String[])null);
		String[] w_DATE_FROM = ((params.containsKey("w_DATE_FROM")) ? (String[])params.get("w_DATE_FROM") : (String[])null);
		String[] w_DATE_TO = ((params.containsKey("w_DATE_TO")) ? (String[])params.get("w_DATE_TO") : (String[])null);
		String[] HEAD_DATE = ((params.containsKey("HEAD_DATE")) ? (String[])params.get("HEAD_DATE") : (String[])null);
		String[] CAL_COMMENT = ((params.containsKey("CAL_COMMENT")) ? (String[])params.get("CAL_COMMENT") : (String[])null);
		String[] c_HOLIDAY_FLG = ((params.containsKey("c_HOLIDAY_FLG")) ? (String[])params.get("c_HOLIDAY_FLG") : (String[])null);
		String[] c_HOLIDAY_SUN = ((params.containsKey("c_HOLIDAY_SUN")) ? (String[])params.get("c_HOLIDAY_SUN") : (String[])null);
		String[] c_HOLIDAY_MON = ((params.containsKey("c_HOLIDAY_MON")) ? (String[])params.get("c_HOLIDAY_MON") : (String[])null);
		String[] c_HOLIDAY_TUE = ((params.containsKey("c_HOLIDAY_TUE")) ? (String[])params.get("c_HOLIDAY_TUE") : (String[])null);
		String[] c_HOLIDAY_WED = ((params.containsKey("c_HOLIDAY_WED")) ? (String[])params.get("c_HOLIDAY_WED") : (String[])null);
		String[] c_HOLIDAY_THU = ((params.containsKey("c_HOLIDAY_THU")) ? (String[])params.get("c_HOLIDAY_THU") : (String[])null);
		String[] c_HOLIDAY_FRI = ((params.containsKey("c_HOLIDAY_FRI")) ? (String[])params.get("c_HOLIDAY_FRI") : (String[])null);
		String[] c_HOLIDAY_SAT = ((params.containsKey("c_HOLIDAY_SAT")) ? (String[])params.get("c_HOLIDAY_SAT") : (String[])null);
		String[] MODIFY_COUNT = ((params.containsKey("MODIFY_COUNT")) ? (String[])params.get("MODIFY_COUNT") : (String[])null);
		String[] HOLIDAY_FLG = ((params.containsKey("HOLIDAY_FLG")) ? (String[])params.get("HOLIDAY_FLG") : (String[])null);
		String[] ASP_SHIFT_CD = ((params.containsKey("ASP_SHIFT_CD")) ? (String[])params.get("ASP_SHIFT_CD") : (String[])null);
		String[] t_HOLIDAY_SUN = ((params.containsKey("t_HOLIDAY_SUN")) ? (String[])params.get("t_HOLIDAY_SUN") : (String[])null);
		String[] t_HOLIDAY_MON = ((params.containsKey("t_HOLIDAY_MON")) ? (String[])params.get("t_HOLIDAY_MON") : (String[])null);
		String[] t_HOLIDAY_TUE = ((params.containsKey("t_HOLIDAY_TUE")) ? (String[])params.get("t_HOLIDAY_TUE") : (String[])null);
		String[] t_HOLIDAY_WED = ((params.containsKey("t_HOLIDAY_WED")) ? (String[])params.get("t_HOLIDAY_WED") : (String[])null);
		String[] t_HOLIDAY_THU = ((params.containsKey("t_HOLIDAY_THU")) ? (String[])params.get("t_HOLIDAY_THU") : (String[])null);
		String[] t_HOLIDAY_FRI = ((params.containsKey("t_HOLIDAY_FRI")) ? (String[])params.get("t_HOLIDAY_FRI") : (String[])null);
		String[] t_HOLIDAY_SAT = ((params.containsKey("t_HOLIDAY_SAT")) ? (String[])params.get("t_HOLIDAY_SAT") : (String[])null);
		String[] h_TIME_CTRL = ((params.containsKey("h_TIME_CTRL")) ? (String[])params.get("h_TIME_CTRL") : (String[])null);

		struct.setCAL_NO( ((CAL_NO == null) ? (String)null : CAL_NO[0]) );
		struct.setList_CAL_NO(TypeConverter.convert(CAL_NO));
		struct.setCAL_NAME( ((CAL_NAME == null) ? (String)null : CAL_NAME[0]) );
		struct.setList_CAL_NAME(TypeConverter.convert(CAL_NAME));
		struct.setDATE_FROM( ((DATE_FROM == null) ? (String)null : DATE_FROM[0]) );
		struct.setList_DATE_FROM(TypeConverter.convert(DATE_FROM));
		struct.setCAL_DATE( ((CAL_DATE == null) ? (String)null : CAL_DATE[0]) );
		struct.setList_CAL_DATE(TypeConverter.convert(CAL_DATE));
		struct.setCAL_DATE_WEEK( ((CAL_DATE_WEEK == null) ? (String)null : CAL_DATE_WEEK[0]) );
		struct.setList_CAL_DATE_WEEK(TypeConverter.convert(CAL_DATE_WEEK));
		if( (h_HOLIDAY_SUN == null)||("".equals(h_HOLIDAY_SUN[0])) ) {
		   struct.seth_HOLIDAY_SUN( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_SUN( new Integer(h_HOLIDAY_SUN[0]) );
		   struct.setList_h_HOLIDAY_SUN(TypeConverter.convert(h_HOLIDAY_SUN));
		}
		if( (h_HOLIDAY_MON == null)||("".equals(h_HOLIDAY_MON[0])) ) {
		   struct.seth_HOLIDAY_MON( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_MON( new Integer(h_HOLIDAY_MON[0]) );
		   struct.setList_h_HOLIDAY_MON(TypeConverter.convert(h_HOLIDAY_MON));
		}
		if( (h_HOLIDAY_TUE == null)||("".equals(h_HOLIDAY_TUE[0])) ) {
		   struct.seth_HOLIDAY_TUE( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_TUE( new Integer(h_HOLIDAY_TUE[0]) );
		   struct.setList_h_HOLIDAY_TUE(TypeConverter.convert(h_HOLIDAY_TUE));
		}
		if( (h_HOLIDAY_WED == null)||("".equals(h_HOLIDAY_WED[0])) ) {
		   struct.seth_HOLIDAY_WED( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_WED( new Integer(h_HOLIDAY_WED[0]) );
		   struct.setList_h_HOLIDAY_WED(TypeConverter.convert(h_HOLIDAY_WED));
		}
		if( (h_HOLIDAY_THU == null)||("".equals(h_HOLIDAY_THU[0])) ) {
		   struct.seth_HOLIDAY_THU( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_THU( new Integer(h_HOLIDAY_THU[0]) );
		   struct.setList_h_HOLIDAY_THU(TypeConverter.convert(h_HOLIDAY_THU));
		}
		if( (h_HOLIDAY_FRI == null)||("".equals(h_HOLIDAY_FRI[0])) ) {
		   struct.seth_HOLIDAY_FRI( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_FRI( new Integer(h_HOLIDAY_FRI[0]) );
		   struct.setList_h_HOLIDAY_FRI(TypeConverter.convert(h_HOLIDAY_FRI));
		}
		if( (h_HOLIDAY_SAT == null)||("".equals(h_HOLIDAY_SAT[0])) ) {
		   struct.seth_HOLIDAY_SAT( (Integer)null );
		} else {
		   struct.seth_HOLIDAY_SAT( new Integer(h_HOLIDAY_SAT[0]) );
		   struct.setList_h_HOLIDAY_SAT(TypeConverter.convert(h_HOLIDAY_SAT));
		}
		struct.setDATE_TO( ((DATE_TO == null) ? (String)null : DATE_TO[0]) );
		struct.setList_DATE_TO(TypeConverter.convert(DATE_TO));
		struct.setw_DATE_FROM( ((w_DATE_FROM == null) ? (String)null : w_DATE_FROM[0]) );
		struct.setList_w_DATE_FROM(TypeConverter.convert(w_DATE_FROM));
		struct.setw_DATE_TO( ((w_DATE_TO == null) ? (String)null : w_DATE_TO[0]) );
		struct.setList_w_DATE_TO(TypeConverter.convert(w_DATE_TO));
		struct.setHEAD_DATE( ((HEAD_DATE == null) ? (String)null : HEAD_DATE[0]) );
		struct.setList_HEAD_DATE(TypeConverter.convert(HEAD_DATE));
		struct.setCAL_COMMENT( ((CAL_COMMENT == null) ? (String)null : CAL_COMMENT[0]) );
		struct.setList_CAL_COMMENT(TypeConverter.convert(CAL_COMMENT));
		struct.setc_HOLIDAY_FLG( ((c_HOLIDAY_FLG == null) ? (String)null : c_HOLIDAY_FLG[0]) );
		struct.setList_c_HOLIDAY_FLG(TypeConverter.convert(c_HOLIDAY_FLG));
		struct.setc_HOLIDAY_SUN( ((c_HOLIDAY_SUN == null) ? (String)null : c_HOLIDAY_SUN[0]) );
		struct.setList_c_HOLIDAY_SUN(TypeConverter.convert(c_HOLIDAY_SUN));
		struct.setc_HOLIDAY_MON( ((c_HOLIDAY_MON == null) ? (String)null : c_HOLIDAY_MON[0]) );
		struct.setList_c_HOLIDAY_MON(TypeConverter.convert(c_HOLIDAY_MON));
		struct.setc_HOLIDAY_TUE( ((c_HOLIDAY_TUE == null) ? (String)null : c_HOLIDAY_TUE[0]) );
		struct.setList_c_HOLIDAY_TUE(TypeConverter.convert(c_HOLIDAY_TUE));
		struct.setc_HOLIDAY_WED( ((c_HOLIDAY_WED == null) ? (String)null : c_HOLIDAY_WED[0]) );
		struct.setList_c_HOLIDAY_WED(TypeConverter.convert(c_HOLIDAY_WED));
		struct.setc_HOLIDAY_THU( ((c_HOLIDAY_THU == null) ? (String)null : c_HOLIDAY_THU[0]) );
		struct.setList_c_HOLIDAY_THU(TypeConverter.convert(c_HOLIDAY_THU));
		struct.setc_HOLIDAY_FRI( ((c_HOLIDAY_FRI == null) ? (String)null : c_HOLIDAY_FRI[0]) );
		struct.setList_c_HOLIDAY_FRI(TypeConverter.convert(c_HOLIDAY_FRI));
		struct.setc_HOLIDAY_SAT( ((c_HOLIDAY_SAT == null) ? (String)null : c_HOLIDAY_SAT[0]) );
		struct.setList_c_HOLIDAY_SAT(TypeConverter.convert(c_HOLIDAY_SAT));
		struct.setMODIFY_COUNT( ((MODIFY_COUNT == null) ? (String)null : MODIFY_COUNT[0]) );
		struct.setList_MODIFY_COUNT(TypeConverter.convert(MODIFY_COUNT));
		if( (HOLIDAY_FLG == null)||("".equals(HOLIDAY_FLG[0])) ) {
		   struct.setHOLIDAY_FLG( (Integer)null );
		} else {
		   struct.setHOLIDAY_FLG( new Integer(HOLIDAY_FLG[0]) );
		   struct.setList_HOLIDAY_FLG(TypeConverter.convert(HOLIDAY_FLG));
		}
		struct.setASP_SHIFT_CD( ((ASP_SHIFT_CD == null) ? (String)null : ASP_SHIFT_CD[0]) );
		struct.setList_ASP_SHIFT_CD(TypeConverter.convert(ASP_SHIFT_CD));
		struct.sett_HOLIDAY_SUN( ((t_HOLIDAY_SUN == null) ? (String)null : t_HOLIDAY_SUN[0]) );
		struct.setList_t_HOLIDAY_SUN(TypeConverter.convert(t_HOLIDAY_SUN));
		struct.sett_HOLIDAY_MON( ((t_HOLIDAY_MON == null) ? (String)null : t_HOLIDAY_MON[0]) );
		struct.setList_t_HOLIDAY_MON(TypeConverter.convert(t_HOLIDAY_MON));
		struct.sett_HOLIDAY_TUE( ((t_HOLIDAY_TUE == null) ? (String)null : t_HOLIDAY_TUE[0]) );
		struct.setList_t_HOLIDAY_TUE(TypeConverter.convert(t_HOLIDAY_TUE));
		struct.sett_HOLIDAY_WED( ((t_HOLIDAY_WED == null) ? (String)null : t_HOLIDAY_WED[0]) );
		struct.setList_t_HOLIDAY_WED(TypeConverter.convert(t_HOLIDAY_WED));
		struct.sett_HOLIDAY_THU( ((t_HOLIDAY_THU == null) ? (String)null : t_HOLIDAY_THU[0]) );
		struct.setList_t_HOLIDAY_THU(TypeConverter.convert(t_HOLIDAY_THU));
		struct.sett_HOLIDAY_FRI( ((t_HOLIDAY_FRI == null) ? (String)null : t_HOLIDAY_FRI[0]) );
		struct.setList_t_HOLIDAY_FRI(TypeConverter.convert(t_HOLIDAY_FRI));
		struct.sett_HOLIDAY_SAT( ((t_HOLIDAY_SAT == null) ? (String)null : t_HOLIDAY_SAT[0]) );
		struct.setList_t_HOLIDAY_SAT(TypeConverter.convert(t_HOLIDAY_SAT));
		struct.seth_TIME_CTRL( ((h_TIME_CTRL == null) ? (String)null : h_TIME_CTRL[0]) );
		struct.setList_h_TIME_CTRL(TypeConverter.convert(h_TIME_CTRL));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0080020.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAA0080020Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAA0080020Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AA0080020Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0080020Entity entity = control.entity;
		AA0080020Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                 
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0080020Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0080020Control control;
		AA0080020Entity  entity = null;
		AA0080020Struct  struct = null;

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

			if( (control = (AA0080020Control)so.getAttribute("AA0080020Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0080020Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0080020Control();
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
				} else if( isClick(request, "insert") ) {
					if ( !isCryptical(request, so, params, "insert") ) return ERROR_TARGET;
					target = onClickinsert(request, response, so, params, control);
					control.setButton("insert");
				} else if( isClick(request, "change") ) {
					if ( !isCryptical(request, so, params, "change") ) return ERROR_TARGET;
					target = onClickchange(request, response, so, params, control);
					control.setButton("change");
				} else if( isClick(request, "before") ) {
					if ( !isCryptical(request, so, params, "before") ) return ERROR_TARGET;
					target = onClickbefore(request, response, so, params, control);
					control.setButton("before");
				} else if( isClick(request, "next") ) {
					if ( !isCryptical(request, so, params, "next") ) return ERROR_TARGET;
					target = onClicknext(request, response, so, params, control);
					control.setButton("next");
				} else if( isClick(request, "update") ) {
					if ( !isCryptical(request, so, params, "update") ) return ERROR_TARGET;
					target = onClickupdate(request, response, so, params, control);
					control.setButton("update");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "insertSub1") ) {
					if ( !isCryptical(request, so, params, "insertSub1") ) return ERROR_TARGET;
					target = onClickinsertSub1(request, response, so, params, control);
					control.setButton("insertSub1");
				} else if( isClick(request, "updateSub1") ) {
					if ( !isCryptical(request, so, params, "updateSub1") ) return ERROR_TARGET;
					target = onClickupdateSub1(request, response, so, params, control);
					control.setButton("updateSub1");
				} else if( isClick(request, "closeSub1") ) {
					if ( !isCryptical(request, so, params, "closeSub1") ) return ERROR_TARGET;
					target = onClickcloseSub1(request, response, so, params, control);
					control.setButton("closeSub1");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AA0080020Control_"+request.getSession(false).getId(),control);

				//{{user_implement_dev:<eventHandling>
                                 
                                //------------------------------------------------------------------
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
				|| (isClick(request, "insert") && bFLG_DISCONNECT_insert)
				|| (isClick(request, "change") && bFLG_DISCONNECT_change)
				|| (isClick(request, "before") && bFLG_DISCONNECT_before)
				|| (isClick(request, "next") && bFLG_DISCONNECT_next)
				|| (isClick(request, "update") && bFLG_DISCONNECT_update)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "insertSub1") && bFLG_DISCONNECT_insertSub1)
				|| (isClick(request, "updateSub1") && bFLG_DISCONNECT_updateSub1)
				|| (isClick(request, "closeSub1") && bFLG_DISCONNECT_closeSub1)
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
	private  static boolean bFLG_DISCONNECT_insert = true;
	private  static boolean bFLG_DISCONNECT_change = true;
	private  static boolean bFLG_DISCONNECT_before = true;
	private  static boolean bFLG_DISCONNECT_next = true;
	private  static boolean bFLG_DISCONNECT_update = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_insertSub1 = true;
	private  static boolean bFLG_DISCONNECT_updateSub1 = true;
	private  static boolean bFLG_DISCONNECT_closeSub1 = true;

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
		return "com.nec.jp.orteus.metamorBase.AA0080.AA0080020Servlet";
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
	public AA0080020Servlet()
	{
		//{{user_implement_dev:<AA0080020_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_select = true;
                bFLG_DISCONNECT_insert = true;
                bFLG_DISCONNECT_change = true;
                bFLG_DISCONNECT_before = true;
                bFLG_DISCONNECT_next = true;
                bFLG_DISCONNECT_update = true;
                bFLG_DISCONNECT_clear = true;
                bFLG_DISCONNECT_insertSub1 = true;
                bFLG_DISCONNECT_updateSub1 = true;
                bFLG_DISCONNECT_closeSub1 = true;
              
                //}}user_implement_dev:<AA0080020_DisConnect_FLG>

		//{{user_implement_dev:<AA0080020Servlet>
                 
                //}}user_implement_dev:<AA0080020Servlet>
	}

	//////////////////////////////

}
