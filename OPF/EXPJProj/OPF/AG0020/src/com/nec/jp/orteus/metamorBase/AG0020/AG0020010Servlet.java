/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0020/src/com/nec/jp/orteus/metamorBase/AG0020/AG0020010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0020;

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

public class AG0020010Servlet extends HttpServlet
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
	 * @param control AG0020010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AG0020010Control control)
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
	 * @param control AG0020010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AG0020010Control control)
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
	 * @param control AG0020010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0020010Entity entity = control.entity;
		AG0020010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
			logger.entering("AG0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
//			objMessage.m_writer.write( Level.ALL, "AG0020010"+" $Revision: 1.11 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AG0020010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AG0020010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0020010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0020010Entity entity = control.entity;
		AG0020010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
		//------------------------------------------------------------------------------
		try {
			control.control_eventHandller("reload");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AG0020010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0020010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0020010Entity entity = control.entity;
		AG0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		//------------------------------------------------------------------
		try {
			//���O�C�����[�U�[�̍H��R�[�h�擾
			struct.seth_PLANT_CD(control.getsysPLANT_CD());

			//���o�ɋ敪�̔���
			String choice = request.getParameter("r_SELECT_CHOICE");
			if(("1").equals(choice) == true){
				struct.setw_CHOICE(choice);      //����
			}
			else if(("2").equals(choice) == true){
				struct.setw_CHOICE(choice);      //�o��
			}
			else{
				struct.setw_CHOICE(null);        //���o��
			}

			control.control_eventHandller("select");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AG0020010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0020010Control�N���X�C���X�^���X
	 */
	public String onClickcsv(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0020010Entity entity = control.entity;
		AG0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcsv");
		//{{user_implement_dev:<onClickcsv>
		//------------------------------------------------------------------
		try{

			// �b�r�u�捞����
			control.control_eventHandller("csv");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickcsv>
		logger.exiting("AG0020010Servlet"+":USER="+request.getRemoteUser(),"onClickcsv");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0020010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0020010Entity entity = control.entity;
		AG0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
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
		logger.exiting("AG0020010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * ���b�g�g���[�X�Q�ƃ{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0020010Control�N���X�C���X�^���X
	 */
	public String onClickSelectLotTraceRef(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0020010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0020010Entity entity = control.entity;
		AG0020010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectLotTraceRef");
		//{{user_implement_dev:<onClickSelectLotTraceRef>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("SelectLotTraceRef");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickSelectLotTraceRef>
		logger.exiting("AG0020010Servlet"+":USER="+request.getRemoteUser(),"onClickSelectLotTraceRef");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AG0020010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_FROM_DATE = ((params.containsKey("w_FROM_DATE")) ? (String[])params.get("w_FROM_DATE") : (String[])null);
		String[] w_TO_DATE = ((params.containsKey("w_TO_DATE")) ? (String[])params.get("w_TO_DATE") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] w_JOB_ODR_CD = ((params.containsKey("w_JOB_ODR_CD")) ? (String[])params.get("w_JOB_ODR_CD") : (String[])null);
		String[] w_WH_CD = ((params.containsKey("w_WH_CD")) ? (String[])params.get("w_WH_CD") : (String[])null);
		String[] RCV_ISSUE_TYP = ((params.containsKey("RCV_ISSUE_TYP")) ? (String[])params.get("RCV_ISSUE_TYP") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] ITEM_CD = ((params.containsKey("ITEM_CD")) ? (String[])params.get("ITEM_CD") : (String[])null);
		String[] ITEM_NAME = ((params.containsKey("ITEM_NAME")) ? (String[])params.get("ITEM_NAME") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] PUCH_ODR_CD = ((params.containsKey("PUCH_ODR_CD")) ? (String[])params.get("PUCH_ODR_CD") : (String[])null);
		String[] ACPT_NO = ((params.containsKey("ACPT_NO")) ? (String[])params.get("ACPT_NO") : (String[])null);
		String[] ACPT_RSLT_CRCT_NO = ((params.containsKey("ACPT_RSLT_CRCT_NO")) ? (String[])params.get("ACPT_RSLT_CRCT_NO") : (String[])null);
		String[] INSPEC_RSLT_CRCT_NO = ((params.containsKey("INSPEC_RSLT_CRCT_NO")) ? (String[])params.get("INSPEC_RSLT_CRCT_NO") : (String[])null);
		String[] WORK_ODR_CD = ((params.containsKey("WORK_ODR_CD")) ? (String[])params.get("WORK_ODR_CD") : (String[])null);
		String[] WORK_IN_PROC_CD = ((params.containsKey("WORK_IN_PROC_CD")) ? (String[])params.get("WORK_IN_PROC_CD") : (String[])null);
		String[] PARTIAL_PRD_NO = ((params.containsKey("PARTIAL_PRD_NO")) ? (String[])params.get("PARTIAL_PRD_NO") : (String[])null);
		String[] OPR_RSLT_CRCT_NO = ((params.containsKey("OPR_RSLT_CRCT_NO")) ? (String[])params.get("OPR_RSLT_CRCT_NO") : (String[])null);
		String[] RCV_ISSUE_CTRL_CD = ((params.containsKey("RCV_ISSUE_CTRL_CD")) ? (String[])params.get("RCV_ISSUE_CTRL_CD") : (String[])null);
		String[] ISSUE_INST_CD = ((params.containsKey("ISSUE_INST_CD")) ? (String[])params.get("ISSUE_INST_CD") : (String[])null);
		String[] RCV_ISSUE_QTY = ((params.containsKey("RCV_ISSUE_QTY")) ? (String[])params.get("RCV_ISSUE_QTY") : (String[])null);
		String[] RCV_ISSUE_DATE = ((params.containsKey("RCV_ISSUE_DATE")) ? (String[])params.get("RCV_ISSUE_DATE") : (String[])null);
		String[] RCV_ISSUE_GNR_TYP = ((params.containsKey("RCV_ISSUE_GNR_TYP")) ? (String[])params.get("RCV_ISSUE_GNR_TYP") : (String[])null);
		String[] DEFECT_CAUSE_CD = ((params.containsKey("DEFECT_CAUSE_CD")) ? (String[])params.get("DEFECT_CAUSE_CD") : (String[])null);
		String[] STOCK_UPD_TYP = ((params.containsKey("STOCK_UPD_TYP")) ? (String[])params.get("STOCK_UPD_TYP") : (String[])null);
		String[] RCV_ISSUE_CMPLT_FLG = ((params.containsKey("RCV_ISSUE_CMPLT_FLG")) ? (String[])params.get("RCV_ISSUE_CMPLT_FLG") : (String[])null);
		String[] CREATED_BY = ((params.containsKey("CREATED_BY")) ? (String[])params.get("CREATED_BY") : (String[])null);
		String[] w_WH_NAME = ((params.containsKey("w_WH_NAME")) ? (String[])params.get("w_WH_NAME") : (String[])null);
		String[] r_SELECT_CHOICE1 = ((params.containsKey("r_SELECT_CHOICE1")) ? (String[])params.get("r_SELECT_CHOICE1") : (String[])null);
		String[] r_SELECT_CHOICE2 = ((params.containsKey("r_SELECT_CHOICE2")) ? (String[])params.get("r_SELECT_CHOICE2") : (String[])null);
		String[] r_SELECT_CHOICE3 = ((params.containsKey("r_SELECT_CHOICE3")) ? (String[])params.get("r_SELECT_CHOICE3") : (String[])null);
		String[] r_SELECT_CHOICE = ((params.containsKey("r_SELECT_CHOICE")) ? (String[])params.get("r_SELECT_CHOICE") : (String[])null);
		String[] RCV_ISSUE_CMPLT_NAME = ((params.containsKey("RCV_ISSUE_CMPLT_NAME")) ? (String[])params.get("RCV_ISSUE_CMPLT_NAME") : (String[])null);
		String[] RCV_ISSUE_GNR_NAME = ((params.containsKey("RCV_ISSUE_GNR_NAME")) ? (String[])params.get("RCV_ISSUE_GNR_NAME") : (String[])null);
		String[] STOCK_UPD_NAME = ((params.containsKey("STOCK_UPD_NAME")) ? (String[])params.get("STOCK_UPD_NAME") : (String[])null);
		String[] MRP_ODR_NAME = ((params.containsKey("MRP_ODR_NAME")) ? (String[])params.get("MRP_ODR_NAME") : (String[])null);
		String[] RCV_ISSUE_NAME = ((params.containsKey("RCV_ISSUE_NAME")) ? (String[])params.get("RCV_ISSUE_NAME") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] w_PLANT_CD = ((params.containsKey("w_PLANT_CD")) ? (String[])params.get("w_PLANT_CD") : (String[])null);
		String[] w_PLANT_NAME = ((params.containsKey("w_PLANT_NAME")) ? (String[])params.get("w_PLANT_NAME") : (String[])null);
		String[] PLANT_CD = ((params.containsKey("PLANT_CD")) ? (String[])params.get("PLANT_CD") : (String[])null);
		String[] RCV_ISSUE_BEFORE_QTY = ((params.containsKey("RCV_ISSUE_BEFORE_QTY")) ? (String[])params.get("RCV_ISSUE_BEFORE_QTY") : (String[])null);
		String[] RCV_ISSUE_AFTER_QTY = ((params.containsKey("RCV_ISSUE_AFTER_QTY")) ? (String[])params.get("RCV_ISSUE_AFTER_QTY") : (String[])null);
		String[] NON_PLANNED_CAUSE_CD = ((params.containsKey("NON_PLANNED_CAUSE_CD")) ? (String[])params.get("NON_PLANNED_CAUSE_CD") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] w_VEND_CD = ((params.containsKey("w_VEND_CD")) ? (String[])params.get("w_VEND_CD") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] VEND_NAME = ((params.containsKey("VEND_NAME")) ? (String[])params.get("VEND_NAME") : (String[])null);
		String[] RCV_ISSUE_COMMENT = ((params.containsKey("RCV_ISSUE_COMMENT")) ? (String[])params.get("RCV_ISSUE_COMMENT") : (String[])null);
		String[] w_ITEM_NAME = ((params.containsKey("w_ITEM_NAME")) ? (String[])params.get("w_ITEM_NAME") : (String[])null);
		String[] w_VEND_NAME = ((params.containsKey("w_VEND_NAME")) ? (String[])params.get("w_VEND_NAME") : (String[])null);
		String[] CREATED_DATE = ((params.containsKey("CREATED_DATE")) ? (String[])params.get("CREATED_DATE") : (String[])null);
		String[] VEND_LOT_NO = ((params.containsKey("VEND_LOT_NO")) ? (String[])params.get("VEND_LOT_NO") : (String[])null);
		String[] l_check = ((params.containsKey("l_check")) ? (String[])params.get("l_check") : (String[])null);
		String[] w_LOT_NO = ((params.containsKey("w_LOT_NO")) ? (String[])params.get("w_LOT_NO") : (String[])null);
		String[] h_lotCtrl = ((params.containsKey("h_lotCtrl")) ? (String[])params.get("h_lotCtrl") : (String[])null);
		String[] LOT_NO = ((params.containsKey("LOT_NO")) ? (String[])params.get("LOT_NO") : (String[])null);
		String[] l_SHIP_ITEM_CD = ((params.containsKey("l_SHIP_ITEM_CD")) ? (String[])params.get("l_SHIP_ITEM_CD") : (String[])null);
		String[] l_INV_LOT_NO = ((params.containsKey("l_INV_LOT_NO")) ? (String[])params.get("l_INV_LOT_NO") : (String[])null);

		struct.setw_FROM_DATE( ((w_FROM_DATE == null) ? (String)null : w_FROM_DATE[0]) );
		struct.setList_w_FROM_DATE(TypeConverter.convert(w_FROM_DATE));
		struct.setw_TO_DATE( ((w_TO_DATE == null) ? (String)null : w_TO_DATE[0]) );
		struct.setList_w_TO_DATE(TypeConverter.convert(w_TO_DATE));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setw_JOB_ODR_CD( ((w_JOB_ODR_CD == null) ? (String)null : w_JOB_ODR_CD[0]) );
		struct.setList_w_JOB_ODR_CD(TypeConverter.convert(w_JOB_ODR_CD));
		struct.setw_WH_CD( ((w_WH_CD == null) ? (String)null : w_WH_CD[0]) );
		struct.setList_w_WH_CD(TypeConverter.convert(w_WH_CD));
		if( (RCV_ISSUE_TYP == null)||("".equals(RCV_ISSUE_TYP[0])) ) {
		   struct.setRCV_ISSUE_TYP( (Integer)null );
		} else {
		   struct.setRCV_ISSUE_TYP( new Integer(RCV_ISSUE_TYP[0]) );
		   struct.setList_RCV_ISSUE_TYP(TypeConverter.convert(RCV_ISSUE_TYP));
		}
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setITEM_CD( ((ITEM_CD == null) ? (String)null : ITEM_CD[0]) );
		struct.setList_ITEM_CD(TypeConverter.convert(ITEM_CD));
		struct.setITEM_NAME( ((ITEM_NAME == null) ? (String)null : ITEM_NAME[0]) );
		struct.setList_ITEM_NAME(TypeConverter.convert(ITEM_NAME));
		if( (MRP_ODR_TYP == null)||("".equals(MRP_ODR_TYP[0])) ) {
		   struct.setMRP_ODR_TYP( (Integer)null );
		} else {
		   struct.setMRP_ODR_TYP( new Integer(MRP_ODR_TYP[0]) );
		   struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		}
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setPUCH_ODR_CD( ((PUCH_ODR_CD == null) ? (String)null : PUCH_ODR_CD[0]) );
		struct.setList_PUCH_ODR_CD(TypeConverter.convert(PUCH_ODR_CD));
		if( (ACPT_NO == null)||("".equals(ACPT_NO[0])) ) {
		   struct.setACPT_NO( (Integer)null );
		} else {
		   struct.setACPT_NO( new Integer(ACPT_NO[0]) );
		   struct.setList_ACPT_NO(TypeConverter.convert(ACPT_NO));
		}
		if( (ACPT_RSLT_CRCT_NO == null)||("".equals(ACPT_RSLT_CRCT_NO[0])) ) {
		   struct.setACPT_RSLT_CRCT_NO( (Integer)null );
		} else {
		   struct.setACPT_RSLT_CRCT_NO( new Integer(ACPT_RSLT_CRCT_NO[0]) );
		   struct.setList_ACPT_RSLT_CRCT_NO(TypeConverter.convert(ACPT_RSLT_CRCT_NO));
		}
		if( (INSPEC_RSLT_CRCT_NO == null)||("".equals(INSPEC_RSLT_CRCT_NO[0])) ) {
		   struct.setINSPEC_RSLT_CRCT_NO( (Integer)null );
		} else {
		   struct.setINSPEC_RSLT_CRCT_NO( new Integer(INSPEC_RSLT_CRCT_NO[0]) );
		   struct.setList_INSPEC_RSLT_CRCT_NO(TypeConverter.convert(INSPEC_RSLT_CRCT_NO));
		}
		struct.setWORK_ODR_CD( ((WORK_ODR_CD == null) ? (String)null : WORK_ODR_CD[0]) );
		struct.setList_WORK_ODR_CD(TypeConverter.convert(WORK_ODR_CD));
		struct.setWORK_IN_PROC_CD( ((WORK_IN_PROC_CD == null) ? (String)null : WORK_IN_PROC_CD[0]) );
		struct.setList_WORK_IN_PROC_CD(TypeConverter.convert(WORK_IN_PROC_CD));
		if( (PARTIAL_PRD_NO == null)||("".equals(PARTIAL_PRD_NO[0])) ) {
		   struct.setPARTIAL_PRD_NO( (Integer)null );
		} else {
		   struct.setPARTIAL_PRD_NO( new Integer(PARTIAL_PRD_NO[0]) );
		   struct.setList_PARTIAL_PRD_NO(TypeConverter.convert(PARTIAL_PRD_NO));
		}
		if( (OPR_RSLT_CRCT_NO == null)||("".equals(OPR_RSLT_CRCT_NO[0])) ) {
		   struct.setOPR_RSLT_CRCT_NO( (Integer)null );
		} else {
		   struct.setOPR_RSLT_CRCT_NO( new Integer(OPR_RSLT_CRCT_NO[0]) );
		   struct.setList_OPR_RSLT_CRCT_NO(TypeConverter.convert(OPR_RSLT_CRCT_NO));
		}
		struct.setRCV_ISSUE_CTRL_CD( ((RCV_ISSUE_CTRL_CD == null) ? (String)null : RCV_ISSUE_CTRL_CD[0]) );
		struct.setList_RCV_ISSUE_CTRL_CD(TypeConverter.convert(RCV_ISSUE_CTRL_CD));
		struct.setISSUE_INST_CD( ((ISSUE_INST_CD == null) ? (String)null : ISSUE_INST_CD[0]) );
		struct.setList_ISSUE_INST_CD(TypeConverter.convert(ISSUE_INST_CD));
		struct.setRCV_ISSUE_QTY( ((RCV_ISSUE_QTY == null) ? (String)null : RCV_ISSUE_QTY[0]) );
		struct.setList_RCV_ISSUE_QTY(TypeConverter.convert(RCV_ISSUE_QTY));
		struct.setRCV_ISSUE_DATE( ((RCV_ISSUE_DATE == null) ? (String)null : RCV_ISSUE_DATE[0]) );
		struct.setList_RCV_ISSUE_DATE(TypeConverter.convert(RCV_ISSUE_DATE));
		if( (RCV_ISSUE_GNR_TYP == null)||("".equals(RCV_ISSUE_GNR_TYP[0])) ) {
		   struct.setRCV_ISSUE_GNR_TYP( (Integer)null );
		} else {
		   struct.setRCV_ISSUE_GNR_TYP( new Integer(RCV_ISSUE_GNR_TYP[0]) );
		   struct.setList_RCV_ISSUE_GNR_TYP(TypeConverter.convert(RCV_ISSUE_GNR_TYP));
		}
		struct.setDEFECT_CAUSE_CD( ((DEFECT_CAUSE_CD == null) ? (String)null : DEFECT_CAUSE_CD[0]) );
		struct.setList_DEFECT_CAUSE_CD(TypeConverter.convert(DEFECT_CAUSE_CD));
		if( (STOCK_UPD_TYP == null)||("".equals(STOCK_UPD_TYP[0])) ) {
		   struct.setSTOCK_UPD_TYP( (Integer)null );
		} else {
		   struct.setSTOCK_UPD_TYP( new Integer(STOCK_UPD_TYP[0]) );
		   struct.setList_STOCK_UPD_TYP(TypeConverter.convert(STOCK_UPD_TYP));
		}
		if( (RCV_ISSUE_CMPLT_FLG == null)||("".equals(RCV_ISSUE_CMPLT_FLG[0])) ) {
		   struct.setRCV_ISSUE_CMPLT_FLG( (Integer)null );
		} else {
		   struct.setRCV_ISSUE_CMPLT_FLG( new Integer(RCV_ISSUE_CMPLT_FLG[0]) );
		   struct.setList_RCV_ISSUE_CMPLT_FLG(TypeConverter.convert(RCV_ISSUE_CMPLT_FLG));
		}
		struct.setCREATED_BY( ((CREATED_BY == null) ? (String)null : CREATED_BY[0]) );
		struct.setList_CREATED_BY(TypeConverter.convert(CREATED_BY));
		struct.setw_WH_NAME( ((w_WH_NAME == null) ? (String)null : w_WH_NAME[0]) );
		struct.setList_w_WH_NAME(TypeConverter.convert(w_WH_NAME));
		struct.setr_SELECT_CHOICE1( ((r_SELECT_CHOICE1 == null) ? (String)null : r_SELECT_CHOICE1[0]) );
		struct.setList_r_SELECT_CHOICE1(TypeConverter.convert(r_SELECT_CHOICE1));
		struct.setr_SELECT_CHOICE2( ((r_SELECT_CHOICE2 == null) ? (String)null : r_SELECT_CHOICE2[0]) );
		struct.setList_r_SELECT_CHOICE2(TypeConverter.convert(r_SELECT_CHOICE2));
		struct.setr_SELECT_CHOICE3( ((r_SELECT_CHOICE3 == null) ? (String)null : r_SELECT_CHOICE3[0]) );
		struct.setList_r_SELECT_CHOICE3(TypeConverter.convert(r_SELECT_CHOICE3));
		struct.setr_SELECT_CHOICE( ((r_SELECT_CHOICE == null) ? (String)null : r_SELECT_CHOICE[0]) );
		struct.setList_r_SELECT_CHOICE(TypeConverter.convert(r_SELECT_CHOICE));
		struct.setRCV_ISSUE_CMPLT_NAME( ((RCV_ISSUE_CMPLT_NAME == null) ? (String)null : RCV_ISSUE_CMPLT_NAME[0]) );
		struct.setList_RCV_ISSUE_CMPLT_NAME(TypeConverter.convert(RCV_ISSUE_CMPLT_NAME));
		struct.setRCV_ISSUE_GNR_NAME( ((RCV_ISSUE_GNR_NAME == null) ? (String)null : RCV_ISSUE_GNR_NAME[0]) );
		struct.setList_RCV_ISSUE_GNR_NAME(TypeConverter.convert(RCV_ISSUE_GNR_NAME));
		struct.setSTOCK_UPD_NAME( ((STOCK_UPD_NAME == null) ? (String)null : STOCK_UPD_NAME[0]) );
		struct.setList_STOCK_UPD_NAME(TypeConverter.convert(STOCK_UPD_NAME));
		struct.setMRP_ODR_NAME( ((MRP_ODR_NAME == null) ? (String)null : MRP_ODR_NAME[0]) );
		struct.setList_MRP_ODR_NAME(TypeConverter.convert(MRP_ODR_NAME));
		struct.setRCV_ISSUE_NAME( ((RCV_ISSUE_NAME == null) ? (String)null : RCV_ISSUE_NAME[0]) );
		struct.setList_RCV_ISSUE_NAME(TypeConverter.convert(RCV_ISSUE_NAME));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setw_PLANT_CD( ((w_PLANT_CD == null) ? (String)null : w_PLANT_CD[0]) );
		struct.setList_w_PLANT_CD(TypeConverter.convert(w_PLANT_CD));
		struct.setw_PLANT_NAME( ((w_PLANT_NAME == null) ? (String)null : w_PLANT_NAME[0]) );
		struct.setList_w_PLANT_NAME(TypeConverter.convert(w_PLANT_NAME));
		struct.setPLANT_CD( ((PLANT_CD == null) ? (String)null : PLANT_CD[0]) );
		struct.setList_PLANT_CD(TypeConverter.convert(PLANT_CD));
		struct.setRCV_ISSUE_BEFORE_QTY( ((RCV_ISSUE_BEFORE_QTY == null) ? (String)null : RCV_ISSUE_BEFORE_QTY[0]) );
		struct.setList_RCV_ISSUE_BEFORE_QTY(TypeConverter.convert(RCV_ISSUE_BEFORE_QTY));
		struct.setRCV_ISSUE_AFTER_QTY( ((RCV_ISSUE_AFTER_QTY == null) ? (String)null : RCV_ISSUE_AFTER_QTY[0]) );
		struct.setList_RCV_ISSUE_AFTER_QTY(TypeConverter.convert(RCV_ISSUE_AFTER_QTY));
		struct.setNON_PLANNED_CAUSE_CD( ((NON_PLANNED_CAUSE_CD == null) ? (String)null : NON_PLANNED_CAUSE_CD[0]) );
		struct.setList_NON_PLANNED_CAUSE_CD(TypeConverter.convert(NON_PLANNED_CAUSE_CD));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setw_VEND_CD( ((w_VEND_CD == null) ? (String)null : w_VEND_CD[0]) );
		struct.setList_w_VEND_CD(TypeConverter.convert(w_VEND_CD));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setVEND_NAME( ((VEND_NAME == null) ? (String)null : VEND_NAME[0]) );
		struct.setList_VEND_NAME(TypeConverter.convert(VEND_NAME));
		struct.setRCV_ISSUE_COMMENT( ((RCV_ISSUE_COMMENT == null) ? (String)null : RCV_ISSUE_COMMENT[0]) );
		struct.setList_RCV_ISSUE_COMMENT(TypeConverter.convert(RCV_ISSUE_COMMENT));
		struct.setw_ITEM_NAME( ((w_ITEM_NAME == null) ? (String)null : w_ITEM_NAME[0]) );
		struct.setList_w_ITEM_NAME(TypeConverter.convert(w_ITEM_NAME));
		struct.setw_VEND_NAME( ((w_VEND_NAME == null) ? (String)null : w_VEND_NAME[0]) );
		struct.setList_w_VEND_NAME(TypeConverter.convert(w_VEND_NAME));
		struct.setCREATED_DATE( ((CREATED_DATE == null) ? (String)null : CREATED_DATE[0]) );
		struct.setList_CREATED_DATE(TypeConverter.convert(CREATED_DATE));
		struct.setVEND_LOT_NO( ((VEND_LOT_NO == null) ? (String)null : VEND_LOT_NO[0]) );
		struct.setList_VEND_LOT_NO(TypeConverter.convert(VEND_LOT_NO));
		struct.setl_check( ((l_check == null) ? (String)null : l_check[0]) );
		struct.setList_l_check(TypeConverter.convert(l_check));
		struct.setw_LOT_NO( ((w_LOT_NO == null) ? (String)null : w_LOT_NO[0]) );
		struct.setList_w_LOT_NO(TypeConverter.convert(w_LOT_NO));
		struct.seth_lotCtrl( ((h_lotCtrl == null) ? (String)null : h_lotCtrl[0]) );
		struct.setList_h_lotCtrl(TypeConverter.convert(h_lotCtrl));
		struct.setLOT_NO( ((LOT_NO == null) ? (String)null : LOT_NO[0]) );
		struct.setList_LOT_NO(TypeConverter.convert(LOT_NO));
		struct.setl_SHIP_ITEM_CD( ((l_SHIP_ITEM_CD == null) ? (String)null : l_SHIP_ITEM_CD[0]) );
		struct.setList_l_SHIP_ITEM_CD(TypeConverter.convert(l_SHIP_ITEM_CD));
		struct.setl_INV_LOT_NO( ((l_INV_LOT_NO == null) ? (String)null : l_INV_LOT_NO[0]) );
		struct.setList_l_INV_LOT_NO(TypeConverter.convert(l_INV_LOT_NO));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AG0020010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAG0020010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAG0020010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AG0020010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0020010Entity entity = control.entity;
		AG0020010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0020");
		logger.entering("AG0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AG0020010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AG0020010Control control;
		AG0020010Entity  entity = null;
		AG0020010Struct  struct = null;

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

			if( (control = (AG0020010Control)so.getAttribute("AG0020010Control_"+request.getSession(false).getId())) == null ) {
				control = new AG0020010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AG0020010Control();
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
				} else if( isClick(request, "SelectLotTraceRef") ) {
					if ( !isCryptical(request, so, params, "SelectLotTraceRef") ) return ERROR_TARGET;
					target = onClickSelectLotTraceRef(request, response, so, params, control);
					control.setButton("SelectLotTraceRef");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AG0020010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "SelectLotTraceRef") && bFLG_DISCONNECT_SelectLotTraceRef)
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
	private  static boolean bFLG_DISCONNECT_SelectLotTraceRef = true;

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
		return "com.nec.jp.orteus.metamorBase.AG0020.AG0020010Servlet";
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
	public AG0020010Servlet()
	{
		//{{user_implement_dev:<AG0020010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_csv = true;
		bFLG_DISCONNECT_clear = true;

                //}}user_implement_dev:<AG0020010_DisConnect_FLG>

		//{{user_implement_dev:<AG0020010Servlet>
                //}}user_implement_dev:<AG0020010Servlet>
	}

	//////////////////////////////

}
