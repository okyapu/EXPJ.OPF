/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0080/src/com/nec/jp/orteus/metamorBase/AF0080/AF0080010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0080;

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

public class AF0080010Servlet extends HttpServlet
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
	 * @param control AF0080010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AF0080010Control control)
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
	 * @param control AF0080010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AF0080010Control control)
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
	 * @param control AF0080010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0080010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
			logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
//			objMessage.m_writer.write( Level.ALL, "AF0080010"+" $Revision: 1.14 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AF0080010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0080010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
		logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0080010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0080010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		//---------------------------------------------------------------------
		try {
			// �H��R�[�h�擾
			struct.setw_PLANT_CD(control.getsysPLANT_CD());

			control.control_eventHandller("select");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �s�C���{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0080010Control�N���X�C���X�^���X
	 */
	public String onClickmodify(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0080010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");
		//{{user_implement_dev:<onClickmodify>
		//------------------------------------------------------------------
		try {
			// �H��R�[�h�擾
			struct.setw_PLANT_CD(control.getsysPLANT_CD());
			
			// ���b�g�Ǘ��t���O��0�ꍇ
			if ("0".equals(struct.getLOT_CTRL_FLG())){
				// �ǉ��o�Ɏ��ѓ��̓T�u1�t�H�[����\������
				if(control.getMessage().sizeError() <= 0){
					// �q��ʂɑJ��
					nextUrl = "/AF0080011.jsp";
				}				
			} 
			// ���b�g�Ǘ��t���O��1�ꍇ
			else if ("1".equals(struct.getLOT_CTRL_FLG())) {
				// �ǉ��o�Ɏ��ѓ��̓T�u2�t�H�[����\������
				if(control.getMessage().sizeError() <= 0){
					// �q��ʂɑJ��
					nextUrl = "/AF0080012.jsp";
				}	
			}
			control.control_eventHandller("modify");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickmodify>
		logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickmodify");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0080010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0080010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
		//---------------------------------------------------------------------
		try {
			// �H��R�[�h�擾
			struct.setw_PLANT_CD(control.getsysPLANT_CD());

			control.control_eventHandller("clear");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0080010Control�N���X�C���X�^���X
	 */
	public String onClickinsertSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0080010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");
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
				nextUrl = "/AF0080011.jsp";
			}
			else {
				// �Ǎ�����
				control.controlselect();
			}

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<onClickinsertSub1>
		logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub1");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0080010Control�N���X�C���X�^���X
	 */
	public String onClickcloseSub1(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0080010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");
		//{{user_implement_dev:<onClickcloseSub1>
		//------------------------------------------------------------------
		try{
			// �H��R�[�h�擾
			struct.setw_PLANT_CD(control.getsysPLANT_CD());

			// �e��ʂɑJ��
			nextUrl = "/AF0080010.jsp";

			control.control_eventHandller("closeSub1");

		} catch(FoundationException e) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickcloseSub1>
		logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub1");

		return nextUrl;
	}

	/**
	 * �X�V�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0080010Control�N���X�C���X�^���X
	 */
	public String onClickinsertSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0080010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub2");
		//{{user_implement_dev:<onClickinsertSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("insertSub2");
			
			// �`�F�b�N�ŃG���[���������Ă���ꍇ
			if(control.getMessage().sizeError() > 0){
				// �q��ʂɑJ��
				nextUrl = "/AF0080012.jsp";
			} else {
				// �Ǎ�����
				control.controlselect();
			}
		} catch(FoundationException e) {
			
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickinsertSub2>
		logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickinsertSub2");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0080010Control�N���X�C���X�^���X
	 */
	public String onClickSelectSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0080010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectSub2");
		//{{user_implement_dev:<onClickSelectSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("SelectSub2");
			
			// �T�u�Q��ʂɑJ��
			nextUrl = "/AF0080012.jsp";
		} catch(FoundationException e) {
			
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelectSub2>
		logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectSub2");

		return nextUrl;
	}

	/**
	 * �߂�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0080010Control�N���X�C���X�^���X
	 */
	public String onClickcloseSub2(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0080010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub2");
		//{{user_implement_dev:<onClickcloseSub2>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("closeSub2");
			
			// �e��ʂɑJ��
			nextUrl = "/AF0080010.jsp";
		} catch(FoundationException e) {
			
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickcloseSub2>
		logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"onClickcloseSub2");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AF0080010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_OPR_INST_CD = ((params.containsKey("w_OPR_INST_CD")) ? (String[])params.get("w_OPR_INST_CD") : (String[])null);
		String[] w_PUCH_ODR_CD = ((params.containsKey("w_PUCH_ODR_CD")) ? (String[])params.get("w_PUCH_ODR_CD") : (String[])null);
		String[] w_ISSUE_INST_CD = ((params.containsKey("w_ISSUE_INST_CD")) ? (String[])params.get("w_ISSUE_INST_CD") : (String[])null);
		String[] ISSUE_INST_CD = ((params.containsKey("ISSUE_INST_CD")) ? (String[])params.get("ISSUE_INST_CD") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] WORK_ODR_CD = ((params.containsKey("WORK_ODR_CD")) ? (String[])params.get("WORK_ODR_CD") : (String[])null);
		String[] WORK_IN_PROC_CD = ((params.containsKey("WORK_IN_PROC_CD")) ? (String[])params.get("WORK_IN_PROC_CD") : (String[])null);
		String[] w_PROC_NAME = ((params.containsKey("w_PROC_NAME")) ? (String[])params.get("w_PROC_NAME") : (String[])null);
		String[] WS_CD = ((params.containsKey("WS_CD")) ? (String[])params.get("WS_CD") : (String[])null);
		String[] WS_NAME = ((params.containsKey("WS_NAME")) ? (String[])params.get("WS_NAME") : (String[])null);
		String[] PUCH_ODR_CD = ((params.containsKey("PUCH_ODR_CD")) ? (String[])params.get("PUCH_ODR_CD") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] ISSUE_INST_QTY = ((params.containsKey("ISSUE_INST_QTY")) ? (String[])params.get("ISSUE_INST_QTY") : (String[])null);
		String[] TOTAL_ISSUE_QTY = ((params.containsKey("TOTAL_ISSUE_QTY")) ? (String[])params.get("TOTAL_ISSUE_QTY") : (String[])null);
		String[] ISSUE_CMPLT_FLG = ((params.containsKey("ISSUE_CMPLT_FLG")) ? (String[])params.get("ISSUE_CMPLT_FLG") : (String[])null);
		String[] w_WH_FROM_CD = ((params.containsKey("w_WH_FROM_CD")) ? (String[])params.get("w_WH_FROM_CD") : (String[])null);
		String[] RCV_ISSUE_QTY = ((params.containsKey("RCV_ISSUE_QTY")) ? (String[])params.get("RCV_ISSUE_QTY") : (String[])null);
		String[] w_WH_TO_CD = ((params.containsKey("w_WH_TO_CD")) ? (String[])params.get("w_WH_TO_CD") : (String[])null);
		String[] RCV_ISSUE_DATE = ((params.containsKey("RCV_ISSUE_DATE")) ? (String[])params.get("RCV_ISSUE_DATE") : (String[])null);
		String[] RCV_ISSUE_COMMENT = ((params.containsKey("RCV_ISSUE_COMMENT")) ? (String[])params.get("RCV_ISSUE_COMMENT") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] DRAW_CD = ((params.containsKey("DRAW_CD")) ? (String[])params.get("DRAW_CD") : (String[])null);
		String[] SPEC = ((params.containsKey("SPEC")) ? (String[])params.get("SPEC") : (String[])null);
		String[] SCDL_ISSUE_DATE = ((params.containsKey("SCDL_ISSUE_DATE")) ? (String[])params.get("SCDL_ISSUE_DATE") : (String[])null);
		String[] ISSUE_CMPLT_DATE = ((params.containsKey("ISSUE_CMPLT_DATE")) ? (String[])params.get("ISSUE_CMPLT_DATE") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] CONS_TYP = ((params.containsKey("CONS_TYP")) ? (String[])params.get("CONS_TYP") : (String[])null);
		String[] w_BUSINESS_OPR_DATE = ((params.containsKey("w_BUSINESS_OPR_DATE")) ? (String[])params.get("w_BUSINESS_OPR_DATE") : (String[])null);
		String[] w_UNIT_QTY_TYP = ((params.containsKey("w_UNIT_QTY_TYP")) ? (String[])params.get("w_UNIT_QTY_TYP") : (String[])null);
		String[] w_OD_NO = ((params.containsKey("w_OD_NO")) ? (String[])params.get("w_OD_NO") : (String[])null);
		String[] w_COMPANY_CD = ((params.containsKey("w_COMPANY_CD")) ? (String[])params.get("w_COMPANY_CD") : (String[])null);
		String[] w_WH_FROM_NAME = ((params.containsKey("w_WH_FROM_NAME")) ? (String[])params.get("w_WH_FROM_NAME") : (String[])null);
		String[] w_WH_TO_NAME = ((params.containsKey("w_WH_TO_NAME")) ? (String[])params.get("w_WH_TO_NAME") : (String[])null);
		String[] w_CHOICE_1 = ((params.containsKey("w_CHOICE_1")) ? (String[])params.get("w_CHOICE_1") : (String[])null);
		String[] w_CHOICE_2 = ((params.containsKey("w_CHOICE_2")) ? (String[])params.get("w_CHOICE_2") : (String[])null);
		String[] w_CHOICE_3 = ((params.containsKey("w_CHOICE_3")) ? (String[])params.get("w_CHOICE_3") : (String[])null);
		String[] w_CHOICE = ((params.containsKey("w_CHOICE")) ? (String[])params.get("w_CHOICE") : (String[])null);
		String[] ISSUE_CMPLT_NAME = ((params.containsKey("ISSUE_CMPLT_NAME")) ? (String[])params.get("ISSUE_CMPLT_NAME") : (String[])null);
		String[] CONS_NAME = ((params.containsKey("CONS_NAME")) ? (String[])params.get("CONS_NAME") : (String[])null);
		String[] s_OPR_INST_CD = ((params.containsKey("s_OPR_INST_CD")) ? (String[])params.get("s_OPR_INST_CD") : (String[])null);
		String[] c_JOB_ODR_CD = ((params.containsKey("c_JOB_ODR_CD")) ? (String[])params.get("c_JOB_ODR_CD") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] OWN_ISSUED_QTY = ((params.containsKey("OWN_ISSUED_QTY")) ? (String[])params.get("OWN_ISSUED_QTY") : (String[])null);
		String[] OTHER_ISSUED_QTY = ((params.containsKey("OTHER_ISSUED_QTY")) ? (String[])params.get("OTHER_ISSUED_QTY") : (String[])null);
		String[] ITEM_ISSUED_QTY = ((params.containsKey("ITEM_ISSUED_QTY")) ? (String[])params.get("ITEM_ISSUED_QTY") : (String[])null);
		String[] h_JOB_ODR_CD = ((params.containsKey("h_JOB_ODR_CD")) ? (String[])params.get("h_JOB_ODR_CD") : (String[])null);
		String[] SAVE_JOB_ODR_CD = ((params.containsKey("SAVE_JOB_ODR_CD")) ? (String[])params.get("SAVE_JOB_ODR_CD") : (String[])null);
		String[] h_WH_FROM_CD = ((params.containsKey("h_WH_FROM_CD")) ? (String[])params.get("h_WH_FROM_CD") : (String[])null);
		String[] h_ISSUE_TYP = ((params.containsKey("h_ISSUE_TYP")) ? (String[])params.get("h_ISSUE_TYP") : (String[])null);
		String[] INSTALL_FLG = ((params.containsKey("INSTALL_FLG")) ? (String[])params.get("INSTALL_FLG") : (String[])null);
		String[] THIS_MONTH = ((params.containsKey("THIS_MONTH")) ? (String[])params.get("THIS_MONTH") : (String[])null);
		String[] h_RCV_ISSUE_DATE = ((params.containsKey("h_RCV_ISSUE_DATE")) ? (String[])params.get("h_RCV_ISSUE_DATE") : (String[])null);
		String[] h_lotCtrl = ((params.containsKey("h_lotCtrl")) ? (String[])params.get("h_lotCtrl") : (String[])null);
		String[] LOT_CTRL_FLG = ((params.containsKey("LOT_CTRL_FLG")) ? (String[])params.get("LOT_CTRL_FLG") : (String[])null);
		String[] LOT_CTRL_FLG_name = ((params.containsKey("LOT_CTRL_FLG_name")) ? (String[])params.get("LOT_CTRL_FLG_name") : (String[])null);
		String[] LOT_CTRL_FLG_val = ((params.containsKey("LOT_CTRL_FLG_val")) ? (String[])params.get("LOT_CTRL_FLG_val") : (String[])null);
		String[] w_LOT_NO = ((params.containsKey("w_LOT_NO")) ? (String[])params.get("w_LOT_NO") : (String[])null);
		String[] w_LOT_CTRL_FLG = ((params.containsKey("w_LOT_CTRL_FLG")) ? (String[])params.get("w_LOT_CTRL_FLG") : (String[])null);
		String[] l_LOT_NO = ((params.containsKey("l_LOT_NO")) ? (String[])params.get("l_LOT_NO") : (String[])null);
		String[] l_TOTAL_ISSUE_QTY = ((params.containsKey("l_TOTAL_ISSUE_QTY")) ? (String[])params.get("l_TOTAL_ISSUE_QTY") : (String[])null);
		String[] l_ISSUE_DATE = ((params.containsKey("l_ISSUE_DATE")) ? (String[])params.get("l_ISSUE_DATE") : (String[])null);
		String[] l_STOCK_ON_HAND_QTY = ((params.containsKey("l_STOCK_ON_HAND_QTY")) ? (String[])params.get("l_STOCK_ON_HAND_QTY") : (String[])null);
		String[] l_DEFECT_QTY = ((params.containsKey("l_DEFECT_QTY")) ? (String[])params.get("l_DEFECT_QTY") : (String[])null);
		String[] l_ALLOCABLE_QTY = ((params.containsKey("l_ALLOCABLE_QTY")) ? (String[])params.get("l_ALLOCABLE_QTY") : (String[])null);
		String[] l_STOCK_UNIT = ((params.containsKey("l_STOCK_UNIT")) ? (String[])params.get("l_STOCK_UNIT") : (String[])null);
		String[] l_EXTERNAL_LOT_NO = ((params.containsKey("l_EXTERNAL_LOT_NO")) ? (String[])params.get("l_EXTERNAL_LOT_NO") : (String[])null);
		String[] l_BEST_BEFORE_DATE = ((params.containsKey("l_BEST_BEFORE_DATE")) ? (String[])params.get("l_BEST_BEFORE_DATE") : (String[])null);
		String[] l_PRD_CMPLT_DATE = ((params.containsKey("l_PRD_CMPLT_DATE")) ? (String[])params.get("l_PRD_CMPLT_DATE") : (String[])null);
		String[] h_Param_Div = ((params.containsKey("h_Param_Div")) ? (String[])params.get("h_Param_Div") : (String[])null);

		struct.setw_OPR_INST_CD( ((w_OPR_INST_CD == null) ? (String)null : w_OPR_INST_CD[0]) );
		struct.setList_w_OPR_INST_CD(TypeConverter.convert(w_OPR_INST_CD));
		struct.setw_PUCH_ODR_CD( ((w_PUCH_ODR_CD == null) ? (String)null : w_PUCH_ODR_CD[0]) );
		struct.setList_w_PUCH_ODR_CD(TypeConverter.convert(w_PUCH_ODR_CD));
		struct.setw_ISSUE_INST_CD( ((w_ISSUE_INST_CD == null) ? (String)null : w_ISSUE_INST_CD[0]) );
		struct.setList_w_ISSUE_INST_CD(TypeConverter.convert(w_ISSUE_INST_CD));
		struct.setISSUE_INST_CD( ((ISSUE_INST_CD == null) ? (String)null : ISSUE_INST_CD[0]) );
		struct.setList_ISSUE_INST_CD(TypeConverter.convert(ISSUE_INST_CD));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setWORK_ODR_CD( ((WORK_ODR_CD == null) ? (String)null : WORK_ODR_CD[0]) );
		struct.setList_WORK_ODR_CD(TypeConverter.convert(WORK_ODR_CD));
		struct.setWORK_IN_PROC_CD( ((WORK_IN_PROC_CD == null) ? (String)null : WORK_IN_PROC_CD[0]) );
		struct.setList_WORK_IN_PROC_CD(TypeConverter.convert(WORK_IN_PROC_CD));
		struct.setw_PROC_NAME( ((w_PROC_NAME == null) ? (String)null : w_PROC_NAME[0]) );
		struct.setList_w_PROC_NAME(TypeConverter.convert(w_PROC_NAME));
		struct.setWS_CD( ((WS_CD == null) ? (String)null : WS_CD[0]) );
		struct.setList_WS_CD(TypeConverter.convert(WS_CD));
		struct.setWS_NAME( ((WS_NAME == null) ? (String)null : WS_NAME[0]) );
		struct.setList_WS_NAME(TypeConverter.convert(WS_NAME));
		struct.setPUCH_ODR_CD( ((PUCH_ODR_CD == null) ? (String)null : PUCH_ODR_CD[0]) );
		struct.setList_PUCH_ODR_CD(TypeConverter.convert(PUCH_ODR_CD));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setISSUE_INST_QTY( ((ISSUE_INST_QTY == null) ? (String)null : ISSUE_INST_QTY[0]) );
		struct.setList_ISSUE_INST_QTY(TypeConverter.convert(ISSUE_INST_QTY));
		struct.setTOTAL_ISSUE_QTY( ((TOTAL_ISSUE_QTY == null) ? (String)null : TOTAL_ISSUE_QTY[0]) );
		struct.setList_TOTAL_ISSUE_QTY(TypeConverter.convert(TOTAL_ISSUE_QTY));
		if( (ISSUE_CMPLT_FLG == null)||("".equals(ISSUE_CMPLT_FLG[0])) ) {
		   struct.setISSUE_CMPLT_FLG( (Integer)null );
		} else {
		   struct.setISSUE_CMPLT_FLG( new Integer(ISSUE_CMPLT_FLG[0]) );
		   struct.setList_ISSUE_CMPLT_FLG(TypeConverter.convert(ISSUE_CMPLT_FLG));
		}
		struct.setw_WH_FROM_CD( ((w_WH_FROM_CD == null) ? (String)null : w_WH_FROM_CD[0]) );
		struct.setList_w_WH_FROM_CD(TypeConverter.convert(w_WH_FROM_CD));
		struct.setRCV_ISSUE_QTY( ((RCV_ISSUE_QTY == null) ? (String)null : RCV_ISSUE_QTY[0]) );
		struct.setList_RCV_ISSUE_QTY(TypeConverter.convert(RCV_ISSUE_QTY));
		struct.setw_WH_TO_CD( ((w_WH_TO_CD == null) ? (String)null : w_WH_TO_CD[0]) );
		struct.setList_w_WH_TO_CD(TypeConverter.convert(w_WH_TO_CD));
		struct.setRCV_ISSUE_DATE( ((RCV_ISSUE_DATE == null) ? (String)null : RCV_ISSUE_DATE[0]) );
		struct.setList_RCV_ISSUE_DATE(TypeConverter.convert(RCV_ISSUE_DATE));
		struct.setRCV_ISSUE_COMMENT( ((RCV_ISSUE_COMMENT == null) ? (String)null : RCV_ISSUE_COMMENT[0]) );
		struct.setList_RCV_ISSUE_COMMENT(TypeConverter.convert(RCV_ISSUE_COMMENT));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setDRAW_CD( ((DRAW_CD == null) ? (String)null : DRAW_CD[0]) );
		struct.setList_DRAW_CD(TypeConverter.convert(DRAW_CD));
		struct.setSPEC( ((SPEC == null) ? (String)null : SPEC[0]) );
		struct.setList_SPEC(TypeConverter.convert(SPEC));
		struct.setSCDL_ISSUE_DATE( ((SCDL_ISSUE_DATE == null) ? (String)null : SCDL_ISSUE_DATE[0]) );
		struct.setList_SCDL_ISSUE_DATE(TypeConverter.convert(SCDL_ISSUE_DATE));
		struct.setISSUE_CMPLT_DATE( ((ISSUE_CMPLT_DATE == null) ? (String)null : ISSUE_CMPLT_DATE[0]) );
		struct.setList_ISSUE_CMPLT_DATE(TypeConverter.convert(ISSUE_CMPLT_DATE));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		if( (CONS_TYP == null)||("".equals(CONS_TYP[0])) ) {
		   struct.setCONS_TYP( (Integer)null );
		} else {
		   struct.setCONS_TYP( new Integer(CONS_TYP[0]) );
		   struct.setList_CONS_TYP(TypeConverter.convert(CONS_TYP));
		}
		struct.setw_BUSINESS_OPR_DATE( ((w_BUSINESS_OPR_DATE == null) ? (String)null : w_BUSINESS_OPR_DATE[0]) );
		struct.setList_w_BUSINESS_OPR_DATE(TypeConverter.convert(w_BUSINESS_OPR_DATE));
		if( (w_UNIT_QTY_TYP == null)||("".equals(w_UNIT_QTY_TYP[0])) ) {
		   struct.setw_UNIT_QTY_TYP( (Integer)null );
		} else {
		   struct.setw_UNIT_QTY_TYP( new Integer(w_UNIT_QTY_TYP[0]) );
		   struct.setList_w_UNIT_QTY_TYP(TypeConverter.convert(w_UNIT_QTY_TYP));
		}
		struct.setw_OD_NO( ((w_OD_NO == null) ? (String)null : w_OD_NO[0]) );
		struct.setList_w_OD_NO(TypeConverter.convert(w_OD_NO));
		struct.setw_COMPANY_CD( ((w_COMPANY_CD == null) ? (String)null : w_COMPANY_CD[0]) );
		struct.setList_w_COMPANY_CD(TypeConverter.convert(w_COMPANY_CD));
		struct.setw_WH_FROM_NAME( ((w_WH_FROM_NAME == null) ? (String)null : w_WH_FROM_NAME[0]) );
		struct.setList_w_WH_FROM_NAME(TypeConverter.convert(w_WH_FROM_NAME));
		struct.setw_WH_TO_NAME( ((w_WH_TO_NAME == null) ? (String)null : w_WH_TO_NAME[0]) );
		struct.setList_w_WH_TO_NAME(TypeConverter.convert(w_WH_TO_NAME));
		struct.setw_CHOICE_1( ((w_CHOICE_1 == null) ? (String)null : w_CHOICE_1[0]) );
		struct.setList_w_CHOICE_1(TypeConverter.convert(w_CHOICE_1));
		struct.setw_CHOICE_2( ((w_CHOICE_2 == null) ? (String)null : w_CHOICE_2[0]) );
		struct.setList_w_CHOICE_2(TypeConverter.convert(w_CHOICE_2));
		struct.setw_CHOICE_3( ((w_CHOICE_3 == null) ? (String)null : w_CHOICE_3[0]) );
		struct.setList_w_CHOICE_3(TypeConverter.convert(w_CHOICE_3));
		struct.setw_CHOICE( ((w_CHOICE == null) ? (String)null : w_CHOICE[0]) );
		struct.setList_w_CHOICE(TypeConverter.convert(w_CHOICE));
		struct.setISSUE_CMPLT_NAME( ((ISSUE_CMPLT_NAME == null) ? (String)null : ISSUE_CMPLT_NAME[0]) );
		struct.setList_ISSUE_CMPLT_NAME(TypeConverter.convert(ISSUE_CMPLT_NAME));
		struct.setCONS_NAME( ((CONS_NAME == null) ? (String)null : CONS_NAME[0]) );
		struct.setList_CONS_NAME(TypeConverter.convert(CONS_NAME));
		struct.sets_OPR_INST_CD( ((s_OPR_INST_CD == null) ? (String)null : s_OPR_INST_CD[0]) );
		struct.setList_s_OPR_INST_CD(TypeConverter.convert(s_OPR_INST_CD));
		struct.setc_JOB_ODR_CD( ((c_JOB_ODR_CD == null) ? (String)null : c_JOB_ODR_CD[0]) );
		struct.setList_c_JOB_ODR_CD(TypeConverter.convert(c_JOB_ODR_CD));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setOWN_ISSUED_QTY( ((OWN_ISSUED_QTY == null) ? (String)null : OWN_ISSUED_QTY[0]) );
		struct.setList_OWN_ISSUED_QTY(TypeConverter.convert(OWN_ISSUED_QTY));
		struct.setOTHER_ISSUED_QTY( ((OTHER_ISSUED_QTY == null) ? (String)null : OTHER_ISSUED_QTY[0]) );
		struct.setList_OTHER_ISSUED_QTY(TypeConverter.convert(OTHER_ISSUED_QTY));
		struct.setITEM_ISSUED_QTY( ((ITEM_ISSUED_QTY == null) ? (String)null : ITEM_ISSUED_QTY[0]) );
		struct.setList_ITEM_ISSUED_QTY(TypeConverter.convert(ITEM_ISSUED_QTY));
		struct.seth_JOB_ODR_CD( ((h_JOB_ODR_CD == null) ? (String)null : h_JOB_ODR_CD[0]) );
		struct.setList_h_JOB_ODR_CD(TypeConverter.convert(h_JOB_ODR_CD));
		struct.setSAVE_JOB_ODR_CD( ((SAVE_JOB_ODR_CD == null) ? (String)null : SAVE_JOB_ODR_CD[0]) );
		struct.setList_SAVE_JOB_ODR_CD(TypeConverter.convert(SAVE_JOB_ODR_CD));
		struct.seth_WH_FROM_CD( ((h_WH_FROM_CD == null) ? (String)null : h_WH_FROM_CD[0]) );
		struct.setList_h_WH_FROM_CD(TypeConverter.convert(h_WH_FROM_CD));
		struct.seth_ISSUE_TYP( ((h_ISSUE_TYP == null) ? (String)null : h_ISSUE_TYP[0]) );
		struct.setList_h_ISSUE_TYP(TypeConverter.convert(h_ISSUE_TYP));
		struct.setINSTALL_FLG( ((INSTALL_FLG == null) ? (String)null : INSTALL_FLG[0]) );
		struct.setList_INSTALL_FLG(TypeConverter.convert(INSTALL_FLG));
		struct.setTHIS_MONTH( ((THIS_MONTH == null) ? (String)null : THIS_MONTH[0]) );
		struct.setList_THIS_MONTH(TypeConverter.convert(THIS_MONTH));
		struct.seth_RCV_ISSUE_DATE( ((h_RCV_ISSUE_DATE == null) ? (String)null : h_RCV_ISSUE_DATE[0]) );
		struct.setList_h_RCV_ISSUE_DATE(TypeConverter.convert(h_RCV_ISSUE_DATE));
		struct.seth_lotCtrl( ((h_lotCtrl == null) ? (String)null : h_lotCtrl[0]) );
		struct.setList_h_lotCtrl(TypeConverter.convert(h_lotCtrl));
		struct.setLOT_CTRL_FLG( ((LOT_CTRL_FLG == null) ? (String)null : LOT_CTRL_FLG[0]) );
		struct.setList_LOT_CTRL_FLG(TypeConverter.convert(LOT_CTRL_FLG));
		struct.setLOT_CTRL_FLG_name( ((LOT_CTRL_FLG_name == null) ? (String)null : LOT_CTRL_FLG_name[0]) );
		struct.setList_LOT_CTRL_FLG_name(TypeConverter.convert(LOT_CTRL_FLG_name));
		struct.setLOT_CTRL_FLG_val( ((LOT_CTRL_FLG_val == null) ? (String)null : LOT_CTRL_FLG_val[0]) );
		struct.setList_LOT_CTRL_FLG_val(TypeConverter.convert(LOT_CTRL_FLG_val));
		struct.setw_LOT_NO( ((w_LOT_NO == null) ? (String)null : w_LOT_NO[0]) );
		struct.setList_w_LOT_NO(TypeConverter.convert(w_LOT_NO));
		struct.setw_LOT_CTRL_FLG( ((w_LOT_CTRL_FLG == null) ? (String)null : w_LOT_CTRL_FLG[0]) );
		struct.setList_w_LOT_CTRL_FLG(TypeConverter.convert(w_LOT_CTRL_FLG));
		struct.setl_LOT_NO( ((l_LOT_NO == null) ? (String)null : l_LOT_NO[0]) );
		struct.setList_l_LOT_NO(TypeConverter.convert(l_LOT_NO));
		struct.setl_TOTAL_ISSUE_QTY( ((l_TOTAL_ISSUE_QTY == null) ? (String)null : l_TOTAL_ISSUE_QTY[0]) );
		struct.setList_l_TOTAL_ISSUE_QTY(TypeConverter.convert(l_TOTAL_ISSUE_QTY));
		struct.setl_ISSUE_DATE( ((l_ISSUE_DATE == null) ? (String)null : l_ISSUE_DATE[0]) );
		struct.setList_l_ISSUE_DATE(TypeConverter.convert(l_ISSUE_DATE));
		struct.setl_STOCK_ON_HAND_QTY( ((l_STOCK_ON_HAND_QTY == null) ? (String)null : l_STOCK_ON_HAND_QTY[0]) );
		struct.setList_l_STOCK_ON_HAND_QTY(TypeConverter.convert(l_STOCK_ON_HAND_QTY));
		struct.setl_DEFECT_QTY( ((l_DEFECT_QTY == null) ? (String)null : l_DEFECT_QTY[0]) );
		struct.setList_l_DEFECT_QTY(TypeConverter.convert(l_DEFECT_QTY));
		struct.setl_ALLOCABLE_QTY( ((l_ALLOCABLE_QTY == null) ? (String)null : l_ALLOCABLE_QTY[0]) );
		struct.setList_l_ALLOCABLE_QTY(TypeConverter.convert(l_ALLOCABLE_QTY));
		struct.setl_STOCK_UNIT( ((l_STOCK_UNIT == null) ? (String)null : l_STOCK_UNIT[0]) );
		struct.setList_l_STOCK_UNIT(TypeConverter.convert(l_STOCK_UNIT));
		struct.setl_EXTERNAL_LOT_NO( ((l_EXTERNAL_LOT_NO == null) ? (String)null : l_EXTERNAL_LOT_NO[0]) );
		struct.setList_l_EXTERNAL_LOT_NO(TypeConverter.convert(l_EXTERNAL_LOT_NO));
		struct.setl_BEST_BEFORE_DATE( ((l_BEST_BEFORE_DATE == null) ? (String)null : l_BEST_BEFORE_DATE[0]) );
		struct.setList_l_BEST_BEFORE_DATE(TypeConverter.convert(l_BEST_BEFORE_DATE));
		struct.setl_PRD_CMPLT_DATE( ((l_PRD_CMPLT_DATE == null) ? (String)null : l_PRD_CMPLT_DATE[0]) );
		struct.setList_l_PRD_CMPLT_DATE(TypeConverter.convert(l_PRD_CMPLT_DATE));
		struct.seth_Param_Div( ((h_Param_Div == null) ? (String)null : h_Param_Div[0]) );
		struct.setList_h_Param_Div(TypeConverter.convert(h_Param_Div));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AF0080010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAF0080010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAF0080010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AF0080010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0080010Entity entity = control.entity;
		AF0080010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0080");
		logger.entering("AF0080010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AF0080010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AF0080010Control control;
		AF0080010Entity  entity = null;
		AF0080010Struct  struct = null;

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

			if( (control = (AF0080010Control)so.getAttribute("AF0080010Control_"+request.getSession(false).getId())) == null ) {
				control = new AF0080010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AF0080010Control();
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
				} else if( isClick(request, "insertSub2") ) {
					if ( !isCryptical(request, so, params, "insertSub2") ) return ERROR_TARGET;
					target = onClickinsertSub2(request, response, so, params, control);
					control.setButton("insertSub2");
				} else if( isClick(request, "SelectSub2") ) {
					if ( !isCryptical(request, so, params, "SelectSub2") ) return ERROR_TARGET;
					target = onClickSelectSub2(request, response, so, params, control);
					control.setButton("SelectSub2");
				} else if( isClick(request, "closeSub2") ) {
					if ( !isCryptical(request, so, params, "closeSub2") ) return ERROR_TARGET;
					target = onClickcloseSub2(request, response, so, params, control);
					control.setButton("closeSub2");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AF0080010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "insertSub2") && bFLG_DISCONNECT_insertSub2)
				|| (isClick(request, "SelectSub2") && bFLG_DISCONNECT_SelectSub2)
				|| (isClick(request, "closeSub2") && bFLG_DISCONNECT_closeSub2)
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
	private  static boolean bFLG_DISCONNECT_insertSub2 = true;
	private  static boolean bFLG_DISCONNECT_SelectSub2 = true;
	private  static boolean bFLG_DISCONNECT_closeSub2 = true;

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
		return "com.nec.jp.orteus.metamorBase.AF0080.AF0080010Servlet";
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
	public AF0080010Servlet()
	{
		//{{user_implement_dev:<AF0080010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_modify = true;
		bFLG_DISCONNECT_clear = true;
		bFLG_DISCONNECT_insertSub1 = true;
		bFLG_DISCONNECT_closeSub1 = true;

                //}}user_implement_dev:<AF0080010_DisConnect_FLG>

		//{{user_implement_dev:<AF0080010Servlet>
                //}}user_implement_dev:<AF0080010Servlet>
	}

	//////////////////////////////

}
