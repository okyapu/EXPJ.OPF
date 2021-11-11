/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0010/src/com/nec/jp/orteus/metamorBase/AF0010/AF0010010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0010;

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
//import com.nec.jp.orteus.metamorBase.common.CsvWriter.CsvWriter;
//------------------------------------------------------------------------------
//}}user_implement_dev:import

//{{user_implement_dev:header
//}}user_implement_dev:header

public class AF0010010Servlet extends HttpServlet
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
	 * @param control AF0010010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AF0010010Control control)
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
	 * @param control AF0010010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AF0010010Control control)
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
	 * @param control AF0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0010010Entity entity = control.entity;
		AF0010010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
			logger.entering("AF0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
//			objMessage.m_writer.write( Level.ALL, "AF0010010"+" $Revision: 1.21 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AF0010010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AF0010010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0010010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0010010Entity entity = control.entity;
		AF0010010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		//------------------------------------------------------------------------------
		try {
			// ���O�C�����[�U�[�̍H��R�[�h�擾
			struct.setw_PLANT_CD(control.getsysPLANT_CD());

			control.control_eventHandller("reload");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AF0010010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0010010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0010010Entity entity = control.entity;
		AF0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		//------------------------------------------------------------------
		try {
			// ���O�C�����[�U�[�̍H��R�[�h�ޔ�
			struct.setw_PLANT_CD(control.getsysPLANT_CD());

			// ���������i���W�I�{�^���j�̒l�ޔ�
			// struct.setw_CHOICE(request.getParameter("r_SELECT_CHOICE"));

			// �L�[���ڑޔ�
			control.setKeyStruct(struct);

			control.control_eventHandller("select");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AF0010010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �b�r�u�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0010010Control�N���X�C���X�^���X
	 */
	public String onClickcsv(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0010010Entity entity = control.entity;
		AF0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Servlet"+":USER="+request.getRemoteUser(),"onClickcsv");
		//{{user_implement_dev:<onClickcsv>
		//------------------------------------------------------------------
		try{
			control.control_eventHandller("csv");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickcsv>
		logger.exiting("AF0010010Servlet"+":USER="+request.getRemoteUser(),"onClickcsv");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0010010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0010010Entity entity = control.entity;
		AF0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
		//------------------------------------------------------------------
		try{
			control.control_eventHandller("clear");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AF0010010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AF0010010Control�N���X�C���X�^���X
	 */
	public String onClickprint(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AF0010010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0010010Entity entity = control.entity;
		AF0010010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Servlet"+":USER="+request.getRemoteUser(),"onClickprint");
		//{{user_implement_dev:<onClickprint>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("print");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickprint>
		logger.exiting("AF0010010Servlet"+":USER="+request.getRemoteUser(),"onClickprint");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AF0010010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] ISSUE_INST_CD = ((params.containsKey("ISSUE_INST_CD")) ? (String[])params.get("ISSUE_INST_CD") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] PUCH_ODR_CD = ((params.containsKey("PUCH_ODR_CD")) ? (String[])params.get("PUCH_ODR_CD") : (String[])null);
		String[] CONS_TYP = ((params.containsKey("CONS_TYP")) ? (String[])params.get("CONS_TYP") : (String[])null);
		String[] ISSUE_INST_QTY = ((params.containsKey("ISSUE_INST_QTY")) ? (String[])params.get("ISSUE_INST_QTY") : (String[])null);
		String[] TOTAL_ISSUE_QTY = ((params.containsKey("TOTAL_ISSUE_QTY")) ? (String[])params.get("TOTAL_ISSUE_QTY") : (String[])null);
		String[] SCDL_ISSUE_DATE = ((params.containsKey("SCDL_ISSUE_DATE")) ? (String[])params.get("SCDL_ISSUE_DATE") : (String[])null);
		String[] ISSUE_CMPLT_DATE = ((params.containsKey("ISSUE_CMPLT_DATE")) ? (String[])params.get("ISSUE_CMPLT_DATE") : (String[])null);
		String[] ISSUE_CMPLT_FLG = ((params.containsKey("ISSUE_CMPLT_FLG")) ? (String[])params.get("ISSUE_CMPLT_FLG") : (String[])null);
		String[] WS_NAME = ((params.containsKey("WS_NAME")) ? (String[])params.get("WS_NAME") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] WORK_ODR_CD = ((params.containsKey("WORK_ODR_CD")) ? (String[])params.get("WORK_ODR_CD") : (String[])null);
		String[] WORK_IN_PROC_CD = ((params.containsKey("WORK_IN_PROC_CD")) ? (String[])params.get("WORK_IN_PROC_CD") : (String[])null);
		String[] PROC_NAME = ((params.containsKey("PROC_NAME")) ? (String[])params.get("PROC_NAME") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] ISSUE_INST_COMMENT = ((params.containsKey("ISSUE_INST_COMMENT")) ? (String[])params.get("ISSUE_INST_COMMENT") : (String[])null);
		String[] w_WS_CD = ((params.containsKey("w_WS_CD")) ? (String[])params.get("w_WS_CD") : (String[])null);
		String[] w_VEND_CD = ((params.containsKey("w_VEND_CD")) ? (String[])params.get("w_VEND_CD") : (String[])null);
		String[] w_SHIP_REMAIN_QTY = ((params.containsKey("w_SHIP_REMAIN_QTY")) ? (String[])params.get("w_SHIP_REMAIN_QTY") : (String[])null);
		String[] ISSUE_TYP = ((params.containsKey("ISSUE_TYP")) ? (String[])params.get("ISSUE_TYP") : (String[])null);
		String[] OD_NO = ((params.containsKey("OD_NO")) ? (String[])params.get("OD_NO") : (String[])null);
		String[] PS_EDITION = ((params.containsKey("PS_EDITION")) ? (String[])params.get("PS_EDITION") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] w_WS_NAME = ((params.containsKey("w_WS_NAME")) ? (String[])params.get("w_WS_NAME") : (String[])null);
		String[] w_VEND_ANAME = ((params.containsKey("w_VEND_ANAME")) ? (String[])params.get("w_VEND_ANAME") : (String[])null);
		String[] ISSUE_INST_UNIT_NUMERATOR = ((params.containsKey("ISSUE_INST_UNIT_NUMERATOR")) ? (String[])params.get("ISSUE_INST_UNIT_NUMERATOR") : (String[])null);
		String[] ISSUE_INST_UNIT_DENOMINATOR = ((params.containsKey("ISSUE_INST_UNIT_DENOMINATOR")) ? (String[])params.get("ISSUE_INST_UNIT_DENOMINATOR") : (String[])null);
		String[] ISSUE_CMPLT_NAME = ((params.containsKey("ISSUE_CMPLT_NAME")) ? (String[])params.get("ISSUE_CMPLT_NAME") : (String[])null);
		String[] ISSUE_NAME = ((params.containsKey("ISSUE_NAME")) ? (String[])params.get("ISSUE_NAME") : (String[])null);
		String[] CONS_NAME = ((params.containsKey("CONS_NAME")) ? (String[])params.get("CONS_NAME") : (String[])null);
		String[] s_OPR_INST_CD = ((params.containsKey("s_OPR_INST_CD")) ? (String[])params.get("s_OPR_INST_CD") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] PLANT_NAME = ((params.containsKey("PLANT_NAME")) ? (String[])params.get("PLANT_NAME") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] l_PLANT_CD = ((params.containsKey("l_PLANT_CD")) ? (String[])params.get("l_PLANT_CD") : (String[])null);
		String[] l_WS_CD = ((params.containsKey("l_WS_CD")) ? (String[])params.get("l_WS_CD") : (String[])null);
		String[] l_VEND_CD = ((params.containsKey("l_VEND_CD")) ? (String[])params.get("l_VEND_CD") : (String[])null);
		String[] OPR_INST_CD = ((params.containsKey("OPR_INST_CD")) ? (String[])params.get("OPR_INST_CD") : (String[])null);
		String[] scdl_issue_date_from = ((params.containsKey("scdl_issue_date_from")) ? (String[])params.get("scdl_issue_date_from") : (String[])null);
		String[] scdl_issue_date_to = ((params.containsKey("scdl_issue_date_to")) ? (String[])params.get("scdl_issue_date_to") : (String[])null);
		String[] h_issue_cmplt_flg = ((params.containsKey("h_issue_cmplt_flg")) ? (String[])params.get("h_issue_cmplt_flg") : (String[])null);
		String[] c1_WORK_STS_TYP = ((params.containsKey("c1_WORK_STS_TYP")) ? (String[])params.get("c1_WORK_STS_TYP") : (String[])null);
		String[] c2_WORK_STS_TYP = ((params.containsKey("c2_WORK_STS_TYP")) ? (String[])params.get("c2_WORK_STS_TYP") : (String[])null);
		String[] c3_WORK_STS_TYP = ((params.containsKey("c3_WORK_STS_TYP")) ? (String[])params.get("c3_WORK_STS_TYP") : (String[])null);
		String[] c4_WORK_STS_TYP = ((params.containsKey("c4_WORK_STS_TYP")) ? (String[])params.get("c4_WORK_STS_TYP") : (String[])null);
		String[] c5_WORK_STS_TYP = ((params.containsKey("c5_WORK_STS_TYP")) ? (String[])params.get("c5_WORK_STS_TYP") : (String[])null);
		String[] l_STATUS_DN = ((params.containsKey("l_STATUS_DN")) ? (String[])params.get("l_STATUS_DN") : (String[])null);
		String[] TIME_CTRL = ((params.containsKey("TIME_CTRL")) ? (String[])params.get("TIME_CTRL") : (String[])null);
		String[] scdl_issue_time_from = ((params.containsKey("scdl_issue_time_from")) ? (String[])params.get("scdl_issue_time_from") : (String[])null);
		String[] scdl_issue_time_to = ((params.containsKey("scdl_issue_time_to")) ? (String[])params.get("scdl_issue_time_to") : (String[])null);
		String[] c1_ISSUE_TYP = ((params.containsKey("c1_ISSUE_TYP")) ? (String[])params.get("c1_ISSUE_TYP") : (String[])null);
		String[] c2_ISSUE_TYP = ((params.containsKey("c2_ISSUE_TYP")) ? (String[])params.get("c2_ISSUE_TYP") : (String[])null);
		String[] c3_ISSUE_TYP = ((params.containsKey("c3_ISSUE_TYP")) ? (String[])params.get("c3_ISSUE_TYP") : (String[])null);
		String[] c_RE_PRINT = ((params.containsKey("c_RE_PRINT")) ? (String[])params.get("c_RE_PRINT") : (String[])null);
		String[] B_WH_CD = ((params.containsKey("B_WH_CD")) ? (String[])params.get("B_WH_CD") : (String[])null);
		String[] B_WH_NAME = ((params.containsKey("B_WH_NAME")) ? (String[])params.get("B_WH_NAME") : (String[])null);
		String[] l_h_B_WH_CD = ((params.containsKey("l_h_B_WH_CD")) ? (String[])params.get("l_h_B_WH_CD") : (String[])null);
		String[] l_h_HAND_QTY = ((params.containsKey("l_h_HAND_QTY")) ? (String[])params.get("l_h_HAND_QTY") : (String[])null);
		String[] l_h_LOT_NO = ((params.containsKey("l_h_LOT_NO")) ? (String[])params.get("l_h_LOT_NO") : (String[])null);
		String[] l_h_B_WH_NAME = ((params.containsKey("l_h_B_WH_NAME")) ? (String[])params.get("l_h_B_WH_NAME") : (String[])null);
		String[] l_h_JOB_ODR_DETAIL_NO = ((params.containsKey("l_h_JOB_ODR_DETAIL_NO")) ? (String[])params.get("l_h_JOB_ODR_DETAIL_NO") : (String[])null);
		String[] l_ISSUE_INST_CD = ((params.containsKey("l_ISSUE_INST_CD")) ? (String[])params.get("l_ISSUE_INST_CD") : (String[])null);
		String[] l_ITEM_CD = ((params.containsKey("l_ITEM_CD")) ? (String[])params.get("l_ITEM_CD") : (String[])null);
		String[] l_ITEM_NAME = ((params.containsKey("l_ITEM_NAME")) ? (String[])params.get("l_ITEM_NAME") : (String[])null);
		String[] l_WH_CD = ((params.containsKey("l_WH_CD")) ? (String[])params.get("l_WH_CD") : (String[])null);
		String[] l_WH_NAME = ((params.containsKey("l_WH_NAME")) ? (String[])params.get("l_WH_NAME") : (String[])null);
		String[] l_PUCH_ODR_CD = ((params.containsKey("l_PUCH_ODR_CD")) ? (String[])params.get("l_PUCH_ODR_CD") : (String[])null);

		struct.setISSUE_INST_CD( ((ISSUE_INST_CD == null) ? (String)null : ISSUE_INST_CD[0]) );
		struct.setList_ISSUE_INST_CD(TypeConverter.convert(ISSUE_INST_CD));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		struct.setPUCH_ODR_CD( ((PUCH_ODR_CD == null) ? (String)null : PUCH_ODR_CD[0]) );
		struct.setList_PUCH_ODR_CD(TypeConverter.convert(PUCH_ODR_CD));
		if( (CONS_TYP == null)||("".equals(CONS_TYP[0])) ) {
		   struct.setCONS_TYP( (Integer)null );
		} else {
		   struct.setCONS_TYP( new Integer(CONS_TYP[0]) );
		   struct.setList_CONS_TYP(TypeConverter.convert(CONS_TYP));
		}
		struct.setISSUE_INST_QTY( ((ISSUE_INST_QTY == null) ? (String)null : ISSUE_INST_QTY[0]) );
		struct.setList_ISSUE_INST_QTY(TypeConverter.convert(ISSUE_INST_QTY));
		struct.setTOTAL_ISSUE_QTY( ((TOTAL_ISSUE_QTY == null) ? (String)null : TOTAL_ISSUE_QTY[0]) );
		struct.setList_TOTAL_ISSUE_QTY(TypeConverter.convert(TOTAL_ISSUE_QTY));
		struct.setSCDL_ISSUE_DATE( ((SCDL_ISSUE_DATE == null) ? (String)null : SCDL_ISSUE_DATE[0]) );
		struct.setList_SCDL_ISSUE_DATE(TypeConverter.convert(SCDL_ISSUE_DATE));
		struct.setISSUE_CMPLT_DATE( ((ISSUE_CMPLT_DATE == null) ? (String)null : ISSUE_CMPLT_DATE[0]) );
		struct.setList_ISSUE_CMPLT_DATE(TypeConverter.convert(ISSUE_CMPLT_DATE));
		if( (ISSUE_CMPLT_FLG == null)||("".equals(ISSUE_CMPLT_FLG[0])) ) {
		   struct.setISSUE_CMPLT_FLG( (Integer)null );
		} else {
		   struct.setISSUE_CMPLT_FLG( new Integer(ISSUE_CMPLT_FLG[0]) );
		   struct.setList_ISSUE_CMPLT_FLG(TypeConverter.convert(ISSUE_CMPLT_FLG));
		}
		struct.setWS_NAME( ((WS_NAME == null) ? (String)null : WS_NAME[0]) );
		struct.setList_WS_NAME(TypeConverter.convert(WS_NAME));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setWORK_ODR_CD( ((WORK_ODR_CD == null) ? (String)null : WORK_ODR_CD[0]) );
		struct.setList_WORK_ODR_CD(TypeConverter.convert(WORK_ODR_CD));
		struct.setWORK_IN_PROC_CD( ((WORK_IN_PROC_CD == null) ? (String)null : WORK_IN_PROC_CD[0]) );
		struct.setList_WORK_IN_PROC_CD(TypeConverter.convert(WORK_IN_PROC_CD));
		struct.setPROC_NAME( ((PROC_NAME == null) ? (String)null : PROC_NAME[0]) );
		struct.setList_PROC_NAME(TypeConverter.convert(PROC_NAME));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setISSUE_INST_COMMENT( ((ISSUE_INST_COMMENT == null) ? (String)null : ISSUE_INST_COMMENT[0]) );
		struct.setList_ISSUE_INST_COMMENT(TypeConverter.convert(ISSUE_INST_COMMENT));
		struct.setw_WS_CD( ((w_WS_CD == null) ? (String)null : w_WS_CD[0]) );
		struct.setList_w_WS_CD(TypeConverter.convert(w_WS_CD));
		struct.setw_VEND_CD( ((w_VEND_CD == null) ? (String)null : w_VEND_CD[0]) );
		struct.setList_w_VEND_CD(TypeConverter.convert(w_VEND_CD));
		struct.setw_SHIP_REMAIN_QTY( ((w_SHIP_REMAIN_QTY == null) ? (String)null : w_SHIP_REMAIN_QTY[0]) );
		struct.setList_w_SHIP_REMAIN_QTY(TypeConverter.convert(w_SHIP_REMAIN_QTY));
		if( (ISSUE_TYP == null)||("".equals(ISSUE_TYP[0])) ) {
		   struct.setISSUE_TYP( (Integer)null );
		} else {
		   struct.setISSUE_TYP( new Integer(ISSUE_TYP[0]) );
		   struct.setList_ISSUE_TYP(TypeConverter.convert(ISSUE_TYP));
		}
		struct.setOD_NO( ((OD_NO == null) ? (String)null : OD_NO[0]) );
		struct.setList_OD_NO(TypeConverter.convert(OD_NO));
		struct.setPS_EDITION( ((PS_EDITION == null) ? (String)null : PS_EDITION[0]) );
		struct.setList_PS_EDITION(TypeConverter.convert(PS_EDITION));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.setw_WS_NAME( ((w_WS_NAME == null) ? (String)null : w_WS_NAME[0]) );
		struct.setList_w_WS_NAME(TypeConverter.convert(w_WS_NAME));
		struct.setw_VEND_ANAME( ((w_VEND_ANAME == null) ? (String)null : w_VEND_ANAME[0]) );
		struct.setList_w_VEND_ANAME(TypeConverter.convert(w_VEND_ANAME));
		struct.setISSUE_INST_UNIT_NUMERATOR( ((ISSUE_INST_UNIT_NUMERATOR == null) ? (String)null : ISSUE_INST_UNIT_NUMERATOR[0]) );
		struct.setList_ISSUE_INST_UNIT_NUMERATOR(TypeConverter.convert(ISSUE_INST_UNIT_NUMERATOR));
		struct.setISSUE_INST_UNIT_DENOMINATOR( ((ISSUE_INST_UNIT_DENOMINATOR == null) ? (String)null : ISSUE_INST_UNIT_DENOMINATOR[0]) );
		struct.setList_ISSUE_INST_UNIT_DENOMINATOR(TypeConverter.convert(ISSUE_INST_UNIT_DENOMINATOR));
		struct.setISSUE_CMPLT_NAME( ((ISSUE_CMPLT_NAME == null) ? (String)null : ISSUE_CMPLT_NAME[0]) );
		struct.setList_ISSUE_CMPLT_NAME(TypeConverter.convert(ISSUE_CMPLT_NAME));
		struct.setISSUE_NAME( ((ISSUE_NAME == null) ? (String)null : ISSUE_NAME[0]) );
		struct.setList_ISSUE_NAME(TypeConverter.convert(ISSUE_NAME));
		struct.setCONS_NAME( ((CONS_NAME == null) ? (String)null : CONS_NAME[0]) );
		struct.setList_CONS_NAME(TypeConverter.convert(CONS_NAME));
		struct.sets_OPR_INST_CD( ((s_OPR_INST_CD == null) ? (String)null : s_OPR_INST_CD[0]) );
		struct.setList_s_OPR_INST_CD(TypeConverter.convert(s_OPR_INST_CD));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setPLANT_NAME( ((PLANT_NAME == null) ? (String)null : PLANT_NAME[0]) );
		struct.setList_PLANT_NAME(TypeConverter.convert(PLANT_NAME));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setl_PLANT_CD( ((l_PLANT_CD == null) ? (String)null : l_PLANT_CD[0]) );
		struct.setList_l_PLANT_CD(TypeConverter.convert(l_PLANT_CD));
		struct.setl_WS_CD( ((l_WS_CD == null) ? (String)null : l_WS_CD[0]) );
		struct.setList_l_WS_CD(TypeConverter.convert(l_WS_CD));
		struct.setl_VEND_CD( ((l_VEND_CD == null) ? (String)null : l_VEND_CD[0]) );
		struct.setList_l_VEND_CD(TypeConverter.convert(l_VEND_CD));
		struct.setOPR_INST_CD( ((OPR_INST_CD == null) ? (String)null : OPR_INST_CD[0]) );
		struct.setList_OPR_INST_CD(TypeConverter.convert(OPR_INST_CD));
		struct.setscdl_issue_date_from( ((scdl_issue_date_from == null) ? (String)null : scdl_issue_date_from[0]) );
		struct.setList_scdl_issue_date_from(TypeConverter.convert(scdl_issue_date_from));
		struct.setscdl_issue_date_to( ((scdl_issue_date_to == null) ? (String)null : scdl_issue_date_to[0]) );
		struct.setList_scdl_issue_date_to(TypeConverter.convert(scdl_issue_date_to));
		struct.seth_issue_cmplt_flg( ((h_issue_cmplt_flg == null) ? (String)null : h_issue_cmplt_flg[0]) );
		struct.setList_h_issue_cmplt_flg(TypeConverter.convert(h_issue_cmplt_flg));
		struct.setc1_WORK_STS_TYP( ((c1_WORK_STS_TYP == null) ? (String)null : c1_WORK_STS_TYP[0]) );
		struct.setList_c1_WORK_STS_TYP(TypeConverter.convert(c1_WORK_STS_TYP));
		struct.setc2_WORK_STS_TYP( ((c2_WORK_STS_TYP == null) ? (String)null : c2_WORK_STS_TYP[0]) );
		struct.setList_c2_WORK_STS_TYP(TypeConverter.convert(c2_WORK_STS_TYP));
		struct.setc3_WORK_STS_TYP( ((c3_WORK_STS_TYP == null) ? (String)null : c3_WORK_STS_TYP[0]) );
		struct.setList_c3_WORK_STS_TYP(TypeConverter.convert(c3_WORK_STS_TYP));
		struct.setc4_WORK_STS_TYP( ((c4_WORK_STS_TYP == null) ? (String)null : c4_WORK_STS_TYP[0]) );
		struct.setList_c4_WORK_STS_TYP(TypeConverter.convert(c4_WORK_STS_TYP));
		struct.setc5_WORK_STS_TYP( ((c5_WORK_STS_TYP == null) ? (String)null : c5_WORK_STS_TYP[0]) );
		struct.setList_c5_WORK_STS_TYP(TypeConverter.convert(c5_WORK_STS_TYP));
		struct.setl_STATUS_DN( ((l_STATUS_DN == null) ? (String)null : l_STATUS_DN[0]) );
		struct.setList_l_STATUS_DN(TypeConverter.convert(l_STATUS_DN));
		struct.setTIME_CTRL( ((TIME_CTRL == null) ? (String)null : TIME_CTRL[0]) );
		struct.setList_TIME_CTRL(TypeConverter.convert(TIME_CTRL));
		struct.setscdl_issue_time_from( ((scdl_issue_time_from == null) ? (String)null : scdl_issue_time_from[0]) );
		struct.setList_scdl_issue_time_from(TypeConverter.convert(scdl_issue_time_from));
		struct.setscdl_issue_time_to( ((scdl_issue_time_to == null) ? (String)null : scdl_issue_time_to[0]) );
		struct.setList_scdl_issue_time_to(TypeConverter.convert(scdl_issue_time_to));
		struct.setc1_ISSUE_TYP( ((c1_ISSUE_TYP == null) ? (String)null : c1_ISSUE_TYP[0]) );
		struct.setList_c1_ISSUE_TYP(TypeConverter.convert(c1_ISSUE_TYP));
		struct.setc2_ISSUE_TYP( ((c2_ISSUE_TYP == null) ? (String)null : c2_ISSUE_TYP[0]) );
		struct.setList_c2_ISSUE_TYP(TypeConverter.convert(c2_ISSUE_TYP));
		struct.setc3_ISSUE_TYP( ((c3_ISSUE_TYP == null) ? (String)null : c3_ISSUE_TYP[0]) );
		struct.setList_c3_ISSUE_TYP(TypeConverter.convert(c3_ISSUE_TYP));
		struct.setc_RE_PRINT( ((c_RE_PRINT == null) ? (String)null : c_RE_PRINT[0]) );
		struct.setList_c_RE_PRINT(TypeConverter.convert(c_RE_PRINT));
		struct.setB_WH_CD( ((B_WH_CD == null) ? (String)null : B_WH_CD[0]) );
		struct.setList_B_WH_CD(TypeConverter.convert(B_WH_CD));
		struct.setB_WH_NAME( ((B_WH_NAME == null) ? (String)null : B_WH_NAME[0]) );
		struct.setList_B_WH_NAME(TypeConverter.convert(B_WH_NAME));
		struct.setl_h_B_WH_CD( ((l_h_B_WH_CD == null) ? (String)null : l_h_B_WH_CD[0]) );
		struct.setList_l_h_B_WH_CD(TypeConverter.convert(l_h_B_WH_CD));
		struct.setl_h_HAND_QTY( ((l_h_HAND_QTY == null) ? (String)null : l_h_HAND_QTY[0]) );
		struct.setList_l_h_HAND_QTY(TypeConverter.convert(l_h_HAND_QTY));
		struct.setl_h_LOT_NO( ((l_h_LOT_NO == null) ? (String)null : l_h_LOT_NO[0]) );
		struct.setList_l_h_LOT_NO(TypeConverter.convert(l_h_LOT_NO));
		struct.setl_h_B_WH_NAME( ((l_h_B_WH_NAME == null) ? (String)null : l_h_B_WH_NAME[0]) );
		struct.setList_l_h_B_WH_NAME(TypeConverter.convert(l_h_B_WH_NAME));
		struct.setl_h_JOB_ODR_DETAIL_NO( ((l_h_JOB_ODR_DETAIL_NO == null) ? (String)null : l_h_JOB_ODR_DETAIL_NO[0]) );
		struct.setList_l_h_JOB_ODR_DETAIL_NO(TypeConverter.convert(l_h_JOB_ODR_DETAIL_NO));
		struct.setl_ISSUE_INST_CD( ((l_ISSUE_INST_CD == null) ? (String)null : l_ISSUE_INST_CD[0]) );
		struct.setList_l_ISSUE_INST_CD(TypeConverter.convert(l_ISSUE_INST_CD));
		struct.setl_ITEM_CD( ((l_ITEM_CD == null) ? (String)null : l_ITEM_CD[0]) );
		struct.setList_l_ITEM_CD(TypeConverter.convert(l_ITEM_CD));
		struct.setl_ITEM_NAME( ((l_ITEM_NAME == null) ? (String)null : l_ITEM_NAME[0]) );
		struct.setList_l_ITEM_NAME(TypeConverter.convert(l_ITEM_NAME));
		struct.setl_WH_CD( ((l_WH_CD == null) ? (String)null : l_WH_CD[0]) );
		struct.setList_l_WH_CD(TypeConverter.convert(l_WH_CD));
		struct.setl_WH_NAME( ((l_WH_NAME == null) ? (String)null : l_WH_NAME[0]) );
		struct.setList_l_WH_NAME(TypeConverter.convert(l_WH_NAME));
		struct.setl_PUCH_ODR_CD( ((l_PUCH_ODR_CD == null) ? (String)null : l_PUCH_ODR_CD[0]) );
		struct.setList_l_PUCH_ODR_CD(TypeConverter.convert(l_PUCH_ODR_CD));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AF0010010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAF0010010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAF0010010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AF0010010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AF0010010Entity entity = control.entity;
		AF0010010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AF0010010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AF0010010Control control;
		AF0010010Entity  entity = null;
		AF0010010Struct  struct = null;

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

			if( (control = (AF0010010Control)so.getAttribute("AF0010010Control_"+request.getSession(false).getId())) == null ) {
				control = new AF0010010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AF0010010Control();
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
				} else if( isClick(request, "csv") ) {
					if ( !isCryptical(request, so, params, "csv") ) return ERROR_TARGET;
					target = onClickcsv(request, response, so, params, control);
					control.setButton("csv");
				} else if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "print") ) {
					if ( !isCryptical(request, so, params, "print") ) return ERROR_TARGET;
					target = onClickprint(request, response, so, params, control);
					control.setButton("print");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AF0010010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "csv") && bFLG_DISCONNECT_csv)
				|| (isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "print") && bFLG_DISCONNECT_print)
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
	private  static boolean bFLG_DISCONNECT_csv = true;
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_print = true;

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
		return "com.nec.jp.orteus.metamorBase.AF0010.AF0010010Servlet";
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
	public AF0010010Servlet()
	{
		//{{user_implement_dev:<AF0010010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_csv = true;
		bFLG_DISCONNECT_clear = true;

                //}}user_implement_dev:<AF0010010_DisConnect_FLG>

		//{{user_implement_dev:<AF0010010Servlet>
                //}}user_implement_dev:<AF0010010Servlet>
	}

	//////////////////////////////

}
