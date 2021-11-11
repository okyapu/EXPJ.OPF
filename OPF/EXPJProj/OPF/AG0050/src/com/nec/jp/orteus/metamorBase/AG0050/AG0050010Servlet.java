/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AG0050/src/com/nec/jp/orteus/metamorBase/AG0050/AG0050010Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AG0050;

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

public class AG0050010Servlet extends HttpServlet
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
	 * @param control AG0050010Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AG0050010Control control)
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
        if(params.containsKey("w_PLANT_CD")){
        	String [] PLANT_CD = (String[]) params.get("w_PLANT_CD");
    		control.setPlantCd((PLANT_CD==null)?null:PLANT_CD[0]);
    		String [] ITEM_CD =(String[]) params.get("w_ITEM_CD");
    		control.setItemCd((ITEM_CD==null)?null:ITEM_CD[0]);
        }
        else if(params.containsKey("PLANT_CD")){
        	String [] PLANT_CD = (String[]) params.get("PLANT_CD");
    		control.setPlantCd((PLANT_CD==null)?null:PLANT_CD[0]);
    		String [] ITEM_CD =(String[]) params.get("ITEM_CD");
    		control.setItemCd((ITEM_CD==null)?null:ITEM_CD[0]);
        }
//}}user_implement_dev:<setScreenMoveParams>

	}

	/** 
	 * ��ʋ��ʃp�����[�^�擾
	 * @param params  Hashtable�N���X�C���X�^���X
	 * @param control AG0050010Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AG0050010Control control)
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
	 * @param control AG0050010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0050010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
			logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
//			objMessage.m_writer.write( Level.ALL, "AG0050010"+" $Revision: 1.14 $" );
			control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AG0050010Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0050010Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

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
		logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �Ǎ��{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0050010Control�N���X�C���X�^���X
	 */
	public String onClickselect(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");
		//{{user_implement_dev:<onClickselect>
		//------------------------------------------------------------------
		try {
			// �L�[���ڑޔ�
			control.setKeyStruct(struct);
			// �X�g���N�g�N���A���ăL�[���ڂ��ăZ�b�g
			//struct.clear();
			//struct.initialize();
			//struct.setw_PLANT_CD(control.getKeyStruct().getw_PLANT_CD());
			//struct.setw_ITEM_CD(control.getKeyStruct().getw_ITEM_CD());

			control.control_eventHandller("select");

		} catch ( FoundationException e ) {
			ExpjException ee = new ExpjException(e, "ZZ01106");
			ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
			ee.add(emsg);
			throw ee;
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<onClickselect>
		logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickselect");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0050010Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
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
		logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * CSV�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AG0050010Control�N���X�C���X�^���X
	 */
	public String onClickCsvOut(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AG0050010Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");
		//{{user_implement_dev:<onClickCsvOut>
			// TODO: ���[�U��`�̃R�[�h���L�q���Ă�������
		try {
			control.control_eventHandller("CsvOut");
		} catch(FoundationException e) {
//			e.printStackTrace();
			// �G���[�������L�q���Ă��������B
			ExpjException ee = new ExpjException(e, "ZZ01106");
			throw ee;
		}
                //}}user_implement_dev:<onClickCsvOut>
		logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"onClickCsvOut");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AG0050010Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_PLANT_CD = ((params.containsKey("w_PLANT_CD")) ? (String[])params.get("w_PLANT_CD") : (String[])null);
		String[] w_ITEM_CD = ((params.containsKey("w_ITEM_CD")) ? (String[])params.get("w_ITEM_CD") : (String[])null);
		String[] WH_NAME = ((params.containsKey("WH_NAME")) ? (String[])params.get("WH_NAME") : (String[])null);
		String[] JOB_ODR_CD = ((params.containsKey("JOB_ODR_CD")) ? (String[])params.get("JOB_ODR_CD") : (String[])null);
		String[] w_PLANT_NAME = ((params.containsKey("w_PLANT_NAME")) ? (String[])params.get("w_PLANT_NAME") : (String[])null);
		String[] w_ITEM_NAME = ((params.containsKey("w_ITEM_NAME")) ? (String[])params.get("w_ITEM_NAME") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] WH_CD = ((params.containsKey("WH_CD")) ? (String[])params.get("WH_CD") : (String[])null);
		String[] SCDL_ISSUE_TOTAL_FIX = ((params.containsKey("SCDL_ISSUE_TOTAL_FIX")) ? (String[])params.get("SCDL_ISSUE_TOTAL_FIX") : (String[])null);
		String[] SCDL_RCV_TOTAL_FIX = ((params.containsKey("SCDL_RCV_TOTAL_FIX")) ? (String[])params.get("SCDL_RCV_TOTAL_FIX") : (String[])null);
		String[] STOCK_UNIT_3 = ((params.containsKey("STOCK_UNIT_3")) ? (String[])params.get("STOCK_UNIT_3") : (String[])null);
		String[] SCDL_ISSUE_TOTAL_NOFIX = ((params.containsKey("SCDL_ISSUE_TOTAL_NOFIX")) ? (String[])params.get("SCDL_ISSUE_TOTAL_NOFIX") : (String[])null);
		String[] STOCK_UNIT_1 = ((params.containsKey("STOCK_UNIT_1")) ? (String[])params.get("STOCK_UNIT_1") : (String[])null);
		String[] SCDL_RCV_TOTAL_NOFIX = ((params.containsKey("SCDL_RCV_TOTAL_NOFIX")) ? (String[])params.get("SCDL_RCV_TOTAL_NOFIX") : (String[])null);
		String[] STOCK_UNIT_4 = ((params.containsKey("STOCK_UNIT_4")) ? (String[])params.get("STOCK_UNIT_4") : (String[])null);
		String[] SCDL_ISSUE_TOTAL = ((params.containsKey("SCDL_ISSUE_TOTAL")) ? (String[])params.get("SCDL_ISSUE_TOTAL") : (String[])null);
		String[] STOCK_UNIT_2 = ((params.containsKey("STOCK_UNIT_2")) ? (String[])params.get("STOCK_UNIT_2") : (String[])null);
		String[] SCDL_RCV_TOTAL = ((params.containsKey("SCDL_RCV_TOTAL")) ? (String[])params.get("SCDL_RCV_TOTAL") : (String[])null);
		String[] STOCK_UNIT_5 = ((params.containsKey("STOCK_UNIT_5")) ? (String[])params.get("STOCK_UNIT_5") : (String[])null);
		String[] DELIVERY_DATE = ((params.containsKey("DELIVERY_DATE")) ? (String[])params.get("DELIVERY_DATE") : (String[])null);
		String[] INSIDE_ODR_QTY = ((params.containsKey("INSIDE_ODR_QTY")) ? (String[])params.get("INSIDE_ODR_QTY") : (String[])null);
		String[] DEMAND_QTY = ((params.containsKey("DEMAND_QTY")) ? (String[])params.get("DEMAND_QTY") : (String[])null);
		String[] STOCK_ODR_QTY = ((params.containsKey("STOCK_ODR_QTY")) ? (String[])params.get("STOCK_ODR_QTY") : (String[])null);
		String[] ADD_SUBTRACT = ((params.containsKey("ADD_SUBTRACT")) ? (String[])params.get("ADD_SUBTRACT") : (String[])null);
		String[] EFFECT_STOCK_QTY = ((params.containsKey("EFFECT_STOCK_QTY")) ? (String[])params.get("EFFECT_STOCK_QTY") : (String[])null);
		String[] PURCHASE_UNIT = ((params.containsKey("PURCHASE_UNIT")) ? (String[])params.get("PURCHASE_UNIT") : (String[])null);
		String[] STATUS = ((params.containsKey("STATUS")) ? (String[])params.get("STATUS") : (String[])null);
		String[] DEMAND_NO = ((params.containsKey("DEMAND_NO")) ? (String[])params.get("DEMAND_NO") : (String[])null);
		String[] ORDER_NO = ((params.containsKey("ORDER_NO")) ? (String[])params.get("ORDER_NO") : (String[])null);
		String[] GNR_TYP = ((params.containsKey("GNR_TYP")) ? (String[])params.get("GNR_TYP") : (String[])null);
		String[] JOB_ODR_CANCEL_NO = ((params.containsKey("JOB_ODR_CANCEL_NO")) ? (String[])params.get("JOB_ODR_CANCEL_NO") : (String[])null);
		String[] PARENT_ORDER_NO = ((params.containsKey("PARENT_ORDER_NO")) ? (String[])params.get("PARENT_ORDER_NO") : (String[])null);
		String[] rdoItemCd = ((params.containsKey("rdoItemCd")) ? (String[])params.get("rdoItemCd") : (String[])null);
		String[] rdoParentItemCd = ((params.containsKey("rdoParentItemCd")) ? (String[])params.get("rdoParentItemCd") : (String[])null);
		String[] rdoCompItemCd = ((params.containsKey("rdoCompItemCd")) ? (String[])params.get("rdoCompItemCd") : (String[])null);
		String[] CUST_CD = ((params.containsKey("CUST_CD")) ? (String[])params.get("CUST_CD") : (String[])null);
		String[] DLV_LOC_CD = ((params.containsKey("DLV_LOC_CD")) ? (String[])params.get("DLV_LOC_CD") : (String[])null);
		String[] DESINATED_DLV_DATE = ((params.containsKey("DESINATED_DLV_DATE")) ? (String[])params.get("DESINATED_DLV_DATE") : (String[])null);
		String[] w_PARENT_ITEM_CD = ((params.containsKey("w_PARENT_ITEM_CD")) ? (String[])params.get("w_PARENT_ITEM_CD") : (String[])null);
		String[] w_PARENT_ITEM_NAME = ((params.containsKey("w_PARENT_ITEM_NAME")) ? (String[])params.get("w_PARENT_ITEM_NAME") : (String[])null);
		String[] w_COMP_ITEM_CD = ((params.containsKey("w_COMP_ITEM_CD")) ? (String[])params.get("w_COMP_ITEM_CD") : (String[])null);
		String[] w_COMP_ITEM_NAME = ((params.containsKey("w_COMP_ITEM_NAME")) ? (String[])params.get("w_COMP_ITEM_NAME") : (String[])null);
		String[] VEND_CD = ((params.containsKey("VEND_CD")) ? (String[])params.get("VEND_CD") : (String[])null);
		String[] ODR_START_DATE = ((params.containsKey("ODR_START_DATE")) ? (String[])params.get("ODR_START_DATE") : (String[])null);
		String[] PUCH_ODR_START_DATE = ((params.containsKey("PUCH_ODR_START_DATE")) ? (String[])params.get("PUCH_ODR_START_DATE") : (String[])null);
		String[] PARENT_ORDER_ITEM_NO = ((params.containsKey("PARENT_ORDER_ITEM_NO")) ? (String[])params.get("PARENT_ORDER_ITEM_NO") : (String[])null);
		String[] PARENT_ORDER_ITEM_NAME = ((params.containsKey("PARENT_ORDER_ITEM_NAME")) ? (String[])params.get("PARENT_ORDER_ITEM_NAME") : (String[])null);
		String[] ODR_ACPT_DATE = ((params.containsKey("ODR_ACPT_DATE")) ? (String[])params.get("ODR_ACPT_DATE") : (String[])null);
		String[] checkMrpFlg = ((params.containsKey("checkMrpFlg")) ? (String[])params.get("checkMrpFlg") : (String[])null);
		String[] checkProdPlan = ((params.containsKey("checkProdPlan")) ? (String[])params.get("checkProdPlan") : (String[])null);
		String[] checkUncnfm = ((params.containsKey("checkUncnfm")) ? (String[])params.get("checkUncnfm") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] h_INSTALL_FLG = ((params.containsKey("h_INSTALL_FLG")) ? (String[])params.get("h_INSTALL_FLG") : (String[])null);
		String[] INTEGRATE_ODR_QTY = ((params.containsKey("INTEGRATE_ODR_QTY")) ? (String[])params.get("INTEGRATE_ODR_QTY") : (String[])null);
		String[] FIX_ODR_QTY = ((params.containsKey("FIX_ODR_QTY")) ? (String[])params.get("FIX_ODR_QTY") : (String[])null);
		String[] UNOFFICIAL_ODR_QTY = ((params.containsKey("UNOFFICIAL_ODR_QTY")) ? (String[])params.get("UNOFFICIAL_ODR_QTY") : (String[])null);
		String[] DEPOT_QTY = ((params.containsKey("DEPOT_QTY")) ? (String[])params.get("DEPOT_QTY") : (String[])null);
		String[] CUST_ANAME = ((params.containsKey("CUST_ANAME")) ? (String[])params.get("CUST_ANAME") : (String[])null);
		String[] VEND_ANAME = ((params.containsKey("VEND_ANAME")) ? (String[])params.get("VEND_ANAME") : (String[])null);
		String[] checkQty = ((params.containsKey("checkQty")) ? (String[])params.get("checkQty") : (String[])null);
		String[] ODR_DEPOT_CTL_NO = ((params.containsKey("ODR_DEPOT_CTL_NO")) ? (String[])params.get("ODR_DEPOT_CTL_NO") : (String[])null);
		String[] CUST_ODR_NO = ((params.containsKey("CUST_ODR_NO")) ? (String[])params.get("CUST_ODR_NO") : (String[])null);
		String[] ODR_CHARACTERISTIC = ((params.containsKey("ODR_CHARACTERISTIC")) ? (String[])params.get("ODR_CHARACTERISTIC") : (String[])null);
		String[] h_DM_CREATE_BASE_TBL = ((params.containsKey("h_DM_CREATE_BASE_TBL")) ? (String[])params.get("h_DM_CREATE_BASE_TBL") : (String[])null);

		struct.setw_PLANT_CD( ((w_PLANT_CD == null) ? (String)null : w_PLANT_CD[0]) );
		struct.setList_w_PLANT_CD(TypeConverter.convert(w_PLANT_CD));
		struct.setw_ITEM_CD( ((w_ITEM_CD == null) ? (String)null : w_ITEM_CD[0]) );
		struct.setList_w_ITEM_CD(TypeConverter.convert(w_ITEM_CD));
		struct.setWH_NAME( ((WH_NAME == null) ? (String)null : WH_NAME[0]) );
		struct.setList_WH_NAME(TypeConverter.convert(WH_NAME));
		struct.setJOB_ODR_CD( ((JOB_ODR_CD == null) ? (String)null : JOB_ODR_CD[0]) );
		struct.setList_JOB_ODR_CD(TypeConverter.convert(JOB_ODR_CD));
		struct.setw_PLANT_NAME( ((w_PLANT_NAME == null) ? (String)null : w_PLANT_NAME[0]) );
		struct.setList_w_PLANT_NAME(TypeConverter.convert(w_PLANT_NAME));
		struct.setw_ITEM_NAME( ((w_ITEM_NAME == null) ? (String)null : w_ITEM_NAME[0]) );
		struct.setList_w_ITEM_NAME(TypeConverter.convert(w_ITEM_NAME));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setWH_CD( ((WH_CD == null) ? (String)null : WH_CD[0]) );
		struct.setList_WH_CD(TypeConverter.convert(WH_CD));
		struct.setSCDL_ISSUE_TOTAL_FIX( ((SCDL_ISSUE_TOTAL_FIX == null) ? (String)null : SCDL_ISSUE_TOTAL_FIX[0]) );
		struct.setList_SCDL_ISSUE_TOTAL_FIX(TypeConverter.convert(SCDL_ISSUE_TOTAL_FIX));
		struct.setSCDL_RCV_TOTAL_FIX( ((SCDL_RCV_TOTAL_FIX == null) ? (String)null : SCDL_RCV_TOTAL_FIX[0]) );
		struct.setList_SCDL_RCV_TOTAL_FIX(TypeConverter.convert(SCDL_RCV_TOTAL_FIX));
		struct.setSTOCK_UNIT_3( ((STOCK_UNIT_3 == null) ? (String)null : STOCK_UNIT_3[0]) );
		struct.setList_STOCK_UNIT_3(TypeConverter.convert(STOCK_UNIT_3));
		struct.setSCDL_ISSUE_TOTAL_NOFIX( ((SCDL_ISSUE_TOTAL_NOFIX == null) ? (String)null : SCDL_ISSUE_TOTAL_NOFIX[0]) );
		struct.setList_SCDL_ISSUE_TOTAL_NOFIX(TypeConverter.convert(SCDL_ISSUE_TOTAL_NOFIX));
		struct.setSTOCK_UNIT_1( ((STOCK_UNIT_1 == null) ? (String)null : STOCK_UNIT_1[0]) );
		struct.setList_STOCK_UNIT_1(TypeConverter.convert(STOCK_UNIT_1));
		struct.setSCDL_RCV_TOTAL_NOFIX( ((SCDL_RCV_TOTAL_NOFIX == null) ? (String)null : SCDL_RCV_TOTAL_NOFIX[0]) );
		struct.setList_SCDL_RCV_TOTAL_NOFIX(TypeConverter.convert(SCDL_RCV_TOTAL_NOFIX));
		struct.setSTOCK_UNIT_4( ((STOCK_UNIT_4 == null) ? (String)null : STOCK_UNIT_4[0]) );
		struct.setList_STOCK_UNIT_4(TypeConverter.convert(STOCK_UNIT_4));
		struct.setSCDL_ISSUE_TOTAL( ((SCDL_ISSUE_TOTAL == null) ? (String)null : SCDL_ISSUE_TOTAL[0]) );
		struct.setList_SCDL_ISSUE_TOTAL(TypeConverter.convert(SCDL_ISSUE_TOTAL));
		struct.setSTOCK_UNIT_2( ((STOCK_UNIT_2 == null) ? (String)null : STOCK_UNIT_2[0]) );
		struct.setList_STOCK_UNIT_2(TypeConverter.convert(STOCK_UNIT_2));
		struct.setSCDL_RCV_TOTAL( ((SCDL_RCV_TOTAL == null) ? (String)null : SCDL_RCV_TOTAL[0]) );
		struct.setList_SCDL_RCV_TOTAL(TypeConverter.convert(SCDL_RCV_TOTAL));
		struct.setSTOCK_UNIT_5( ((STOCK_UNIT_5 == null) ? (String)null : STOCK_UNIT_5[0]) );
		struct.setList_STOCK_UNIT_5(TypeConverter.convert(STOCK_UNIT_5));
		struct.setDELIVERY_DATE( ((DELIVERY_DATE == null) ? (String)null : DELIVERY_DATE[0]) );
		struct.setList_DELIVERY_DATE(TypeConverter.convert(DELIVERY_DATE));
		struct.setINSIDE_ODR_QTY( ((INSIDE_ODR_QTY == null) ? (String)null : INSIDE_ODR_QTY[0]) );
		struct.setList_INSIDE_ODR_QTY(TypeConverter.convert(INSIDE_ODR_QTY));
		struct.setDEMAND_QTY( ((DEMAND_QTY == null) ? (String)null : DEMAND_QTY[0]) );
		struct.setList_DEMAND_QTY(TypeConverter.convert(DEMAND_QTY));
		struct.setSTOCK_ODR_QTY( ((STOCK_ODR_QTY == null) ? (String)null : STOCK_ODR_QTY[0]) );
		struct.setList_STOCK_ODR_QTY(TypeConverter.convert(STOCK_ODR_QTY));
		struct.setADD_SUBTRACT( ((ADD_SUBTRACT == null) ? (String)null : ADD_SUBTRACT[0]) );
		struct.setList_ADD_SUBTRACT(TypeConverter.convert(ADD_SUBTRACT));
		struct.setEFFECT_STOCK_QTY( ((EFFECT_STOCK_QTY == null) ? (String)null : EFFECT_STOCK_QTY[0]) );
		struct.setList_EFFECT_STOCK_QTY(TypeConverter.convert(EFFECT_STOCK_QTY));
		struct.setPURCHASE_UNIT( ((PURCHASE_UNIT == null) ? (String)null : PURCHASE_UNIT[0]) );
		struct.setList_PURCHASE_UNIT(TypeConverter.convert(PURCHASE_UNIT));
		struct.setSTATUS( ((STATUS == null) ? (String)null : STATUS[0]) );
		struct.setList_STATUS(TypeConverter.convert(STATUS));
		struct.setDEMAND_NO( ((DEMAND_NO == null) ? (String)null : DEMAND_NO[0]) );
		struct.setList_DEMAND_NO(TypeConverter.convert(DEMAND_NO));
		struct.setORDER_NO( ((ORDER_NO == null) ? (String)null : ORDER_NO[0]) );
		struct.setList_ORDER_NO(TypeConverter.convert(ORDER_NO));
		struct.setGNR_TYP( ((GNR_TYP == null) ? (String)null : GNR_TYP[0]) );
		struct.setList_GNR_TYP(TypeConverter.convert(GNR_TYP));
		struct.setJOB_ODR_CANCEL_NO( ((JOB_ODR_CANCEL_NO == null) ? (String)null : JOB_ODR_CANCEL_NO[0]) );
		struct.setList_JOB_ODR_CANCEL_NO(TypeConverter.convert(JOB_ODR_CANCEL_NO));
		struct.setPARENT_ORDER_NO( ((PARENT_ORDER_NO == null) ? (String)null : PARENT_ORDER_NO[0]) );
		struct.setList_PARENT_ORDER_NO(TypeConverter.convert(PARENT_ORDER_NO));
		struct.setrdoItemCd( ((rdoItemCd == null) ? (String)null : rdoItemCd[0]) );
		struct.setList_rdoItemCd(TypeConverter.convert(rdoItemCd));
		struct.setrdoParentItemCd( ((rdoParentItemCd == null) ? (String)null : rdoParentItemCd[0]) );
		struct.setList_rdoParentItemCd(TypeConverter.convert(rdoParentItemCd));
		struct.setrdoCompItemCd( ((rdoCompItemCd == null) ? (String)null : rdoCompItemCd[0]) );
		struct.setList_rdoCompItemCd(TypeConverter.convert(rdoCompItemCd));
		struct.setCUST_CD( ((CUST_CD == null) ? (String)null : CUST_CD[0]) );
		struct.setList_CUST_CD(TypeConverter.convert(CUST_CD));
		struct.setDLV_LOC_CD( ((DLV_LOC_CD == null) ? (String)null : DLV_LOC_CD[0]) );
		struct.setList_DLV_LOC_CD(TypeConverter.convert(DLV_LOC_CD));
		struct.setDESINATED_DLV_DATE( ((DESINATED_DLV_DATE == null) ? (String)null : DESINATED_DLV_DATE[0]) );
		struct.setList_DESINATED_DLV_DATE(TypeConverter.convert(DESINATED_DLV_DATE));
		struct.setw_PARENT_ITEM_CD( ((w_PARENT_ITEM_CD == null) ? (String)null : w_PARENT_ITEM_CD[0]) );
		struct.setList_w_PARENT_ITEM_CD(TypeConverter.convert(w_PARENT_ITEM_CD));
		struct.setw_PARENT_ITEM_NAME( ((w_PARENT_ITEM_NAME == null) ? (String)null : w_PARENT_ITEM_NAME[0]) );
		struct.setList_w_PARENT_ITEM_NAME(TypeConverter.convert(w_PARENT_ITEM_NAME));
		struct.setw_COMP_ITEM_CD( ((w_COMP_ITEM_CD == null) ? (String)null : w_COMP_ITEM_CD[0]) );
		struct.setList_w_COMP_ITEM_CD(TypeConverter.convert(w_COMP_ITEM_CD));
		struct.setw_COMP_ITEM_NAME( ((w_COMP_ITEM_NAME == null) ? (String)null : w_COMP_ITEM_NAME[0]) );
		struct.setList_w_COMP_ITEM_NAME(TypeConverter.convert(w_COMP_ITEM_NAME));
		struct.setVEND_CD( ((VEND_CD == null) ? (String)null : VEND_CD[0]) );
		struct.setList_VEND_CD(TypeConverter.convert(VEND_CD));
		struct.setODR_START_DATE( ((ODR_START_DATE == null) ? (String)null : ODR_START_DATE[0]) );
		struct.setList_ODR_START_DATE(TypeConverter.convert(ODR_START_DATE));
		struct.setPUCH_ODR_START_DATE( ((PUCH_ODR_START_DATE == null) ? (String)null : PUCH_ODR_START_DATE[0]) );
		struct.setList_PUCH_ODR_START_DATE(TypeConverter.convert(PUCH_ODR_START_DATE));
		struct.setPARENT_ORDER_ITEM_NO( ((PARENT_ORDER_ITEM_NO == null) ? (String)null : PARENT_ORDER_ITEM_NO[0]) );
		struct.setList_PARENT_ORDER_ITEM_NO(TypeConverter.convert(PARENT_ORDER_ITEM_NO));
		struct.setPARENT_ORDER_ITEM_NAME( ((PARENT_ORDER_ITEM_NAME == null) ? (String)null : PARENT_ORDER_ITEM_NAME[0]) );
		struct.setList_PARENT_ORDER_ITEM_NAME(TypeConverter.convert(PARENT_ORDER_ITEM_NAME));
		struct.setODR_ACPT_DATE( ((ODR_ACPT_DATE == null) ? (String)null : ODR_ACPT_DATE[0]) );
		struct.setList_ODR_ACPT_DATE(TypeConverter.convert(ODR_ACPT_DATE));
		struct.setcheckMrpFlg( ((checkMrpFlg == null) ? (String)null : checkMrpFlg[0]) );
		struct.setList_checkMrpFlg(TypeConverter.convert(checkMrpFlg));
		struct.setcheckProdPlan( ((checkProdPlan == null) ? (String)null : checkProdPlan[0]) );
		struct.setList_checkProdPlan(TypeConverter.convert(checkProdPlan));
		struct.setcheckUncnfm( ((checkUncnfm == null) ? (String)null : checkUncnfm[0]) );
		struct.setList_checkUncnfm(TypeConverter.convert(checkUncnfm));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.seth_INSTALL_FLG( ((h_INSTALL_FLG == null) ? (String)null : h_INSTALL_FLG[0]) );
		struct.setList_h_INSTALL_FLG(TypeConverter.convert(h_INSTALL_FLG));
		struct.setINTEGRATE_ODR_QTY( ((INTEGRATE_ODR_QTY == null) ? (String)null : INTEGRATE_ODR_QTY[0]) );
		struct.setList_INTEGRATE_ODR_QTY(TypeConverter.convert(INTEGRATE_ODR_QTY));
		struct.setFIX_ODR_QTY( ((FIX_ODR_QTY == null) ? (String)null : FIX_ODR_QTY[0]) );
		struct.setList_FIX_ODR_QTY(TypeConverter.convert(FIX_ODR_QTY));
		struct.setUNOFFICIAL_ODR_QTY( ((UNOFFICIAL_ODR_QTY == null) ? (String)null : UNOFFICIAL_ODR_QTY[0]) );
		struct.setList_UNOFFICIAL_ODR_QTY(TypeConverter.convert(UNOFFICIAL_ODR_QTY));
		struct.setDEPOT_QTY( ((DEPOT_QTY == null) ? (String)null : DEPOT_QTY[0]) );
		struct.setList_DEPOT_QTY(TypeConverter.convert(DEPOT_QTY));
		struct.setCUST_ANAME( ((CUST_ANAME == null) ? (String)null : CUST_ANAME[0]) );
		struct.setList_CUST_ANAME(TypeConverter.convert(CUST_ANAME));
		struct.setVEND_ANAME( ((VEND_ANAME == null) ? (String)null : VEND_ANAME[0]) );
		struct.setList_VEND_ANAME(TypeConverter.convert(VEND_ANAME));
		struct.setcheckQty( ((checkQty == null) ? (String)null : checkQty[0]) );
		struct.setList_checkQty(TypeConverter.convert(checkQty));
		struct.setODR_DEPOT_CTL_NO( ((ODR_DEPOT_CTL_NO == null) ? (String)null : ODR_DEPOT_CTL_NO[0]) );
		struct.setList_ODR_DEPOT_CTL_NO(TypeConverter.convert(ODR_DEPOT_CTL_NO));
		struct.setCUST_ODR_NO( ((CUST_ODR_NO == null) ? (String)null : CUST_ODR_NO[0]) );
		struct.setList_CUST_ODR_NO(TypeConverter.convert(CUST_ODR_NO));
		struct.setODR_CHARACTERISTIC( ((ODR_CHARACTERISTIC == null) ? (String)null : ODR_CHARACTERISTIC[0]) );
		struct.setList_ODR_CHARACTERISTIC(TypeConverter.convert(ODR_CHARACTERISTIC));
		struct.seth_DM_CREATE_BASE_TBL( ((h_DM_CREATE_BASE_TBL == null) ? (String)null : h_DM_CREATE_BASE_TBL[0]) );
		struct.setList_h_DM_CREATE_BASE_TBL(TypeConverter.convert(h_DM_CREATE_BASE_TBL));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AG0050010.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAG0050010Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAG0050010Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AG0050010Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AG0050010Entity entity = control.entity;
		AG0050010Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AG0050");
		logger.entering("AG0050010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AG0050010Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AG0050010Control control;
		AG0050010Entity  entity = null;
		AG0050010Struct  struct = null;

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

			if( (control = (AG0050010Control)so.getAttribute("AG0050010Control_"+request.getSession(false).getId())) == null ) {
				control = new AG0050010Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AG0050010Control();
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
				} else if( isClick(request, "CsvOut") ) {
					if ( !isCryptical(request, so, params, "CsvOut") ) return ERROR_TARGET;
					target = onClickCsvOut(request, response, so, params, control);
					control.setButton("CsvOut");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AG0050010Control_"+request.getSession(false).getId(),control);

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
				|| (isClick(request, "CsvOut") && bFLG_DISCONNECT_CsvOut)
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
	private  static boolean bFLG_DISCONNECT_CsvOut = true;

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
		return "com.nec.jp.orteus.metamorBase.AG0050.AG0050010Servlet";
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
	public AG0050010Servlet()
	{
		//{{user_implement_dev:<AG0050010_DisConnect_FLG>
		// submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
		bFLG_DISCONNECT_defaultEvent = true;
		bFLG_DISCONNECT_select = true;
		bFLG_DISCONNECT_clear = true;

                //}}user_implement_dev:<AG0050010_DisConnect_FLG>

		//{{user_implement_dev:<AG0050010Servlet>
                //}}user_implement_dev:<AG0050010Servlet>
	}

	//////////////////////////////

}
