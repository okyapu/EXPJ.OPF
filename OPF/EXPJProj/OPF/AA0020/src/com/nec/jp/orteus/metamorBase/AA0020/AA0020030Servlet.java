/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0020/src/com/nec/jp/orteus/metamorBase/AA0020/AA0020030Servlet.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0020;

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
/**
 * CLASS     : AA0020030Servlet �N���X
 * VERSION   : 1.0.0.0
 * DATE      : <���t>
 * AUTHOR    : <�J���Җ�>
 * HISTORY
 *           : 1.0.0.0�A<���t>�A�V�K�쐬
 *         [ : <�o�[�W����>�A<���t>�A<���e> ]
 *                        �E �E �E
 */
//}}user_implement_dev:header

public class AA0020030Servlet extends HttpServlet
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
	 * @param control AA0020030Control�N���X�C���X�^���X
	 */
	private void setScreenMoveParams(Hashtable params, AA0020030Control control)
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
	 * @param control AA0020030Control�N���X�C���X�^���X
	 */
	private void setScreenCommonParams(Hashtable params, AA0020030Control control)
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
	 * @param control AA0020030Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String initialEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0020030Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0020030Entity entity = control.entity;
		AA0020030Struct struct = control.struct;

		try {
			// ��������
			CoreTools.initialize(request);

			// ���O�t�@�C���̏�����
			DisplayMessageUtil objMessageDummy = new DisplayMessageUtil(request.getRemoteUser());
			objMessage.m_writer.setUserID(request.getRemoteUser());

			nextUrl = DEFAULT_TARGET;

			Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
			logger.entering("AA0020030Servlet"+":USER="+request.getRemoteUser(),"initialEvent");
		//{{user_implement_dev:<initialEvent>
                 objMessage.m_writer.write( Level.ALL, "AA0020030"+" $Revision: 1.9 $" );
                 control.control_eventHandller("initial");
                //}}user_implement_dev:<initialEvent>
			logger.exiting("AA0020030Servlet"+":USER="+request.getRemoteUser(),"initialEvent");

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
	 * @param control AA0020030Control�N���X�C���X�^���X
	 * @return �ړ���̂t�q�k
	 */
	public String reloadEvent(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0020030Control control ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0020030Entity entity = control.entity;
		AA0020030Struct struct = control.struct;
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		// ��ʑJ�ڃp�����[�^�̎擾
		setScreenMoveParams(params, control);
		if (control.isScreenMove()) {
			getSessionParameters(so, params, struct);
		}

		//{{user_implement_dev:<reloadEvent>
                //------------------------------------------------------------------------------
                try {
                 if (control.isScreenMove()) {
                  getSessionParameters(so, params, struct);
                 }
              
                 // �����[�h����
                 control.control_eventHandller("reload");
              
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<reloadEvent>
		logger.exiting("AA0020030Servlet"+":USER="+request.getRemoteUser(),"reloadEvent");

		return nextUrl;
	}

	/**
	 * �N���A�{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0020030Control�N���X�C���X�^���X
	 */
	public String onClickclear(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0020030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0020030Entity entity = control.entity;
		AA0020030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Servlet"+":USER="+request.getRemoteUser(),"onClickclear");
		//{{user_implement_dev:<onClickclear>
                //------------------------------------------------------------------------------
                try {
                 // �N���A����
                 control.control_eventHandller("clear");
              
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickclear>
		logger.exiting("AA0020030Servlet"+":USER="+request.getRemoteUser(),"onClickclear");

		return nextUrl;
	}

	/**
	 * ���[�o�̓{�^���������Ɏ��s����鏈���ł��B
	 *
	 * @param request HttpRequest�N���X�C���X�^���X
	 * @param response HttpResponse�N���X�C���X�^���X
	 * @param so HttpSession�N���X�C���X�^���X
	 * @param params Hashtable�N���X�C���X�^���X
	 * @param control AA0020030Control�N���X�C���X�^���X
	 */
	public String onClickPrint(
					HttpServletRequest request,
					HttpServletResponse response,
					HttpSession so,
					Hashtable params,
					AA0020030Control control ) throws BusinessProcessException, ServletException, IOException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0020030Entity entity = control.entity;
		AA0020030Struct struct = control.struct;
		getSessionParameters(so, params, struct);

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Servlet"+":USER="+request.getRemoteUser(),"onClickPrint");
		//{{user_implement_dev:<onClickPrint>
                //------------------------------------------------------------------------------
                try {
                 control.control_eventHandller("Print");
              
                } catch ( FoundationException e ) {
              //			e.printStackTrace();
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", "ProcessId:" + control.sp.getProcId());
                 throw ee;
                }
                //------------------------------------------------------------------------------
                //}}user_implement_dev:<onClickPrint>
		logger.exiting("AA0020030Servlet"+":USER="+request.getRemoteUser(),"onClickPrint");

		return nextUrl;
	}


	public void getSessionParameters(HttpSession so, Hashtable params, AA0020030Struct struct)
	{
		String locale = (String) so.getAttribute("LOCALE");
		
		String[] w_TARGET_ITEM_CD = ((params.containsKey("w_TARGET_ITEM_CD")) ? (String[])params.get("w_TARGET_ITEM_CD") : (String[])null);
		String[] w_TARGET_DATE = ((params.containsKey("w_TARGET_DATE")) ? (String[])params.get("w_TARGET_DATE") : (String[])null);
		String[] s_DEVELOP_TYP = ((params.containsKey("s_DEVELOP_TYP")) ? (String[])params.get("s_DEVELOP_TYP") : (String[])null);
		String[] s_DEVELOP_TYP_name = ((params.containsKey("s_DEVELOP_TYP_name")) ? (String[])params.get("s_DEVELOP_TYP_name") : (String[])null);
		String[] s_DEVELOP_TYP_val = ((params.containsKey("s_DEVELOP_TYP_val")) ? (String[])params.get("s_DEVELOP_TYP_val") : (String[])null);
		String[] w_LEVEL = ((params.containsKey("w_LEVEL")) ? (String[])params.get("w_LEVEL") : (String[])null);
		String[] DOWNLOAD_FILE = ((params.containsKey("DOWNLOAD_FILE")) ? (String[])params.get("DOWNLOAD_FILE") : (String[])null);
		String[] in_DEVELOP_TYP = ((params.containsKey("in_DEVELOP_TYP")) ? (String[])params.get("in_DEVELOP_TYP") : (String[])null);
		String[] in_ITEM_CD = ((params.containsKey("in_ITEM_CD")) ? (String[])params.get("in_ITEM_CD") : (String[])null);
		String[] PRINT_DATE = ((params.containsKey("PRINT_DATE")) ? (String[])params.get("PRINT_DATE") : (String[])null);
		String[] PRINT_TIME = ((params.containsKey("PRINT_TIME")) ? (String[])params.get("PRINT_TIME") : (String[])null);
		String[] in_ITEM_NAME = ((params.containsKey("in_ITEM_NAME")) ? (String[])params.get("in_ITEM_NAME") : (String[])null);
		String[] in_TARGET_DATE = ((params.containsKey("in_TARGET_DATE")) ? (String[])params.get("in_TARGET_DATE") : (String[])null);
		String[] in_LEVEL = ((params.containsKey("in_LEVEL")) ? (String[])params.get("in_LEVEL") : (String[])null);
		String[] CURRENT_PAGE = ((params.containsKey("CURRENT_PAGE")) ? (String[])params.get("CURRENT_PAGE") : (String[])null);
		String[] TOTAL_PAGE = ((params.containsKey("TOTAL_PAGE")) ? (String[])params.get("TOTAL_PAGE") : (String[])null);
		String[] LEVEL = ((params.containsKey("LEVEL")) ? (String[])params.get("LEVEL") : (String[])null);
		String[] PARENT_ITEM_CD = ((params.containsKey("PARENT_ITEM_CD")) ? (String[])params.get("PARENT_ITEM_CD") : (String[])null);
		String[] COMP_ITEM_CD = ((params.containsKey("COMP_ITEM_CD")) ? (String[])params.get("COMP_ITEM_CD") : (String[])null);
		String[] PS_LT_FLG = ((params.containsKey("PS_LT_FLG")) ? (String[])params.get("PS_LT_FLG") : (String[])null);
		String[] PS_EDITION = ((params.containsKey("PS_EDITION")) ? (String[])params.get("PS_EDITION") : (String[])null);
		String[] PS_REF_NO = ((params.containsKey("PS_REF_NO")) ? (String[])params.get("PS_REF_NO") : (String[])null);
		String[] EFF_PHASE_IN_DATE = ((params.containsKey("EFF_PHASE_IN_DATE")) ? (String[])params.get("EFF_PHASE_IN_DATE") : (String[])null);
		String[] EFF_PHASE_OUT_DATE = ((params.containsKey("EFF_PHASE_OUT_DATE")) ? (String[])params.get("EFF_PHASE_OUT_DATE") : (String[])null);
		String[] PARENT_ITEM_NAME = ((params.containsKey("PARENT_ITEM_NAME")) ? (String[])params.get("PARENT_ITEM_NAME") : (String[])null);
		String[] COMP_ITEM_NAME = ((params.containsKey("COMP_ITEM_NAME")) ? (String[])params.get("COMP_ITEM_NAME") : (String[])null);
		String[] COST_UP_TYP = ((params.containsKey("COST_UP_TYP")) ? (String[])params.get("COST_UP_TYP") : (String[])null);
		String[] PS_FIXED_LT = ((params.containsKey("PS_FIXED_LT")) ? (String[])params.get("PS_FIXED_LT") : (String[])null);
		String[] PS_UNIT_NUMERATOR = ((params.containsKey("PS_UNIT_NUMERATOR")) ? (String[])params.get("PS_UNIT_NUMERATOR") : (String[])null);
		String[] PARENT_MRP_ODR_TYP = ((params.containsKey("PARENT_MRP_ODR_TYP")) ? (String[])params.get("PARENT_MRP_ODR_TYP") : (String[])null);
		String[] MRP_ODR_TYP = ((params.containsKey("MRP_ODR_TYP")) ? (String[])params.get("MRP_ODR_TYP") : (String[])null);
		String[] MRP_EXP_TYP = ((params.containsKey("MRP_EXP_TYP")) ? (String[])params.get("MRP_EXP_TYP") : (String[])null);
		String[] PS_PROP_LT = ((params.containsKey("PS_PROP_LT")) ? (String[])params.get("PS_PROP_LT") : (String[])null);
		String[] STOCK_UNIT = ((params.containsKey("STOCK_UNIT")) ? (String[])params.get("STOCK_UNIT") : (String[])null);
		String[] PS_UNIT_DENOMINATOR = ((params.containsKey("PS_UNIT_DENOMINATOR")) ? (String[])params.get("PS_UNIT_DENOMINATOR") : (String[])null);
		String[] PARENT_OUTSIDE_TYP = ((params.containsKey("PARENT_OUTSIDE_TYP")) ? (String[])params.get("PARENT_OUTSIDE_TYP") : (String[])null);
		String[] OUTSIDE_TYP = ((params.containsKey("OUTSIDE_TYP")) ? (String[])params.get("OUTSIDE_TYP") : (String[])null);
		String[] PS_SPOIL = ((params.containsKey("PS_SPOIL")) ? (String[])params.get("PS_SPOIL") : (String[])null);
		String[] CONS_TYP = ((params.containsKey("CONS_TYP")) ? (String[])params.get("CONS_TYP") : (String[])null);
		String[] PS_PROP_LOT_SIZE = ((params.containsKey("PS_PROP_LOT_SIZE")) ? (String[])params.get("PS_PROP_LOT_SIZE") : (String[])null);
		String[] in_DEVELOP_TYP_flg = ((params.containsKey("in_DEVELOP_TYP_flg")) ? (String[])params.get("in_DEVELOP_TYP_flg") : (String[])null);
		String[] in_ITEM_CD_flg = ((params.containsKey("in_ITEM_CD_flg")) ? (String[])params.get("in_ITEM_CD_flg") : (String[])null);
		String[] in_ITEM_NAME_flg = ((params.containsKey("in_ITEM_NAME_flg")) ? (String[])params.get("in_ITEM_NAME_flg") : (String[])null);
		String[] in_TARGET_DATE_flg = ((params.containsKey("in_TARGET_DATE_flg")) ? (String[])params.get("in_TARGET_DATE_flg") : (String[])null);
		String[] in_LEVEL_flg = ((params.containsKey("in_LEVEL_flg")) ? (String[])params.get("in_LEVEL_flg") : (String[])null);

		struct.setw_TARGET_ITEM_CD( ((w_TARGET_ITEM_CD == null) ? (String)null : w_TARGET_ITEM_CD[0]) );
		struct.setList_w_TARGET_ITEM_CD(TypeConverter.convert(w_TARGET_ITEM_CD));
		struct.setw_TARGET_DATE( ((w_TARGET_DATE == null) ? (String)null : w_TARGET_DATE[0]) );
		struct.setList_w_TARGET_DATE(TypeConverter.convert(w_TARGET_DATE));
		if( (s_DEVELOP_TYP == null)||("".equals(s_DEVELOP_TYP[0])) ) {
		   struct.sets_DEVELOP_TYP( (Integer)null );
		} else {
		   struct.sets_DEVELOP_TYP( new Integer(s_DEVELOP_TYP[0]) );
		   struct.setList_s_DEVELOP_TYP(TypeConverter.convert(s_DEVELOP_TYP));
		}
		struct.sets_DEVELOP_TYP_name( ((s_DEVELOP_TYP_name == null) ? (String)null : s_DEVELOP_TYP_name[0]) );
		struct.setList_s_DEVELOP_TYP_name(TypeConverter.convert(s_DEVELOP_TYP_name));
		struct.sets_DEVELOP_TYP_val( ((s_DEVELOP_TYP_val == null) ? (String)null : s_DEVELOP_TYP_val[0]) );
		struct.setList_s_DEVELOP_TYP_val(TypeConverter.convert(s_DEVELOP_TYP_val));
		struct.setw_LEVEL( ((w_LEVEL == null) ? (String)null : w_LEVEL[0]) );
		struct.setList_w_LEVEL(TypeConverter.convert(w_LEVEL));
		struct.setDOWNLOAD_FILE( ((DOWNLOAD_FILE == null) ? (String)null : DOWNLOAD_FILE[0]) );
		struct.setList_DOWNLOAD_FILE(TypeConverter.convert(DOWNLOAD_FILE));
		struct.setin_DEVELOP_TYP( ((in_DEVELOP_TYP == null) ? (String)null : in_DEVELOP_TYP[0]) );
		struct.setList_in_DEVELOP_TYP(TypeConverter.convert(in_DEVELOP_TYP));
		struct.setin_ITEM_CD( ((in_ITEM_CD == null) ? (String)null : in_ITEM_CD[0]) );
		struct.setList_in_ITEM_CD(TypeConverter.convert(in_ITEM_CD));
		struct.setPRINT_DATE( ((PRINT_DATE == null) ? (String)null : PRINT_DATE[0]) );
		struct.setList_PRINT_DATE(TypeConverter.convert(PRINT_DATE));
		struct.setPRINT_TIME( ((PRINT_TIME == null) ? (String)null : PRINT_TIME[0]) );
		struct.setList_PRINT_TIME(TypeConverter.convert(PRINT_TIME));
		struct.setin_ITEM_NAME( ((in_ITEM_NAME == null) ? (String)null : in_ITEM_NAME[0]) );
		struct.setList_in_ITEM_NAME(TypeConverter.convert(in_ITEM_NAME));
		struct.setin_TARGET_DATE( ((in_TARGET_DATE == null) ? (String)null : in_TARGET_DATE[0]) );
		struct.setList_in_TARGET_DATE(TypeConverter.convert(in_TARGET_DATE));
		struct.setin_LEVEL( ((in_LEVEL == null) ? (String)null : in_LEVEL[0]) );
		struct.setList_in_LEVEL(TypeConverter.convert(in_LEVEL));
		struct.setCURRENT_PAGE( ((CURRENT_PAGE == null) ? (String)null : CURRENT_PAGE[0]) );
		struct.setList_CURRENT_PAGE(TypeConverter.convert(CURRENT_PAGE));
		struct.setTOTAL_PAGE( ((TOTAL_PAGE == null) ? (String)null : TOTAL_PAGE[0]) );
		struct.setList_TOTAL_PAGE(TypeConverter.convert(TOTAL_PAGE));
		struct.setLEVEL( ((LEVEL == null) ? (String)null : LEVEL[0]) );
		struct.setList_LEVEL(TypeConverter.convert(LEVEL));
		struct.setPARENT_ITEM_CD( ((PARENT_ITEM_CD == null) ? (String)null : PARENT_ITEM_CD[0]) );
		struct.setList_PARENT_ITEM_CD(TypeConverter.convert(PARENT_ITEM_CD));
		struct.setCOMP_ITEM_CD( ((COMP_ITEM_CD == null) ? (String)null : COMP_ITEM_CD[0]) );
		struct.setList_COMP_ITEM_CD(TypeConverter.convert(COMP_ITEM_CD));
		if( (PS_LT_FLG == null)||("".equals(PS_LT_FLG[0])) ) {
		   struct.setPS_LT_FLG( (Integer)null );
		} else {
		   struct.setPS_LT_FLG( new Integer(PS_LT_FLG[0]) );
		   struct.setList_PS_LT_FLG(TypeConverter.convert(PS_LT_FLG));
		}
		struct.setPS_EDITION( ((PS_EDITION == null) ? (String)null : PS_EDITION[0]) );
		struct.setList_PS_EDITION(TypeConverter.convert(PS_EDITION));
		struct.setPS_REF_NO( ((PS_REF_NO == null) ? (String)null : PS_REF_NO[0]) );
		struct.setList_PS_REF_NO(TypeConverter.convert(PS_REF_NO));
		struct.setEFF_PHASE_IN_DATE( ((EFF_PHASE_IN_DATE == null) ? (String)null : EFF_PHASE_IN_DATE[0]) );
		struct.setList_EFF_PHASE_IN_DATE(TypeConverter.convert(EFF_PHASE_IN_DATE));
		struct.setEFF_PHASE_OUT_DATE( ((EFF_PHASE_OUT_DATE == null) ? (String)null : EFF_PHASE_OUT_DATE[0]) );
		struct.setList_EFF_PHASE_OUT_DATE(TypeConverter.convert(EFF_PHASE_OUT_DATE));
		struct.setPARENT_ITEM_NAME( ((PARENT_ITEM_NAME == null) ? (String)null : PARENT_ITEM_NAME[0]) );
		struct.setList_PARENT_ITEM_NAME(TypeConverter.convert(PARENT_ITEM_NAME));
		struct.setCOMP_ITEM_NAME( ((COMP_ITEM_NAME == null) ? (String)null : COMP_ITEM_NAME[0]) );
		struct.setList_COMP_ITEM_NAME(TypeConverter.convert(COMP_ITEM_NAME));
		struct.setCOST_UP_TYP( ((COST_UP_TYP == null) ? (String)null : COST_UP_TYP[0]) );
		struct.setList_COST_UP_TYP(TypeConverter.convert(COST_UP_TYP));
		struct.setPS_FIXED_LT( ((PS_FIXED_LT == null) ? (String)null : PS_FIXED_LT[0]) );
		struct.setList_PS_FIXED_LT(TypeConverter.convert(PS_FIXED_LT));
		struct.setPS_UNIT_NUMERATOR( ((PS_UNIT_NUMERATOR == null) ? (String)null : PS_UNIT_NUMERATOR[0]) );
		struct.setList_PS_UNIT_NUMERATOR(TypeConverter.convert(PS_UNIT_NUMERATOR));
		struct.setPARENT_MRP_ODR_TYP( ((PARENT_MRP_ODR_TYP == null) ? (String)null : PARENT_MRP_ODR_TYP[0]) );
		struct.setList_PARENT_MRP_ODR_TYP(TypeConverter.convert(PARENT_MRP_ODR_TYP));
		struct.setMRP_ODR_TYP( ((MRP_ODR_TYP == null) ? (String)null : MRP_ODR_TYP[0]) );
		struct.setList_MRP_ODR_TYP(TypeConverter.convert(MRP_ODR_TYP));
		struct.setMRP_EXP_TYP( ((MRP_EXP_TYP == null) ? (String)null : MRP_EXP_TYP[0]) );
		struct.setList_MRP_EXP_TYP(TypeConverter.convert(MRP_EXP_TYP));
		struct.setPS_PROP_LT( ((PS_PROP_LT == null) ? (String)null : PS_PROP_LT[0]) );
		struct.setList_PS_PROP_LT(TypeConverter.convert(PS_PROP_LT));
		struct.setSTOCK_UNIT( ((STOCK_UNIT == null) ? (String)null : STOCK_UNIT[0]) );
		struct.setList_STOCK_UNIT(TypeConverter.convert(STOCK_UNIT));
		struct.setPS_UNIT_DENOMINATOR( ((PS_UNIT_DENOMINATOR == null) ? (String)null : PS_UNIT_DENOMINATOR[0]) );
		struct.setList_PS_UNIT_DENOMINATOR(TypeConverter.convert(PS_UNIT_DENOMINATOR));
		struct.setPARENT_OUTSIDE_TYP( ((PARENT_OUTSIDE_TYP == null) ? (String)null : PARENT_OUTSIDE_TYP[0]) );
		struct.setList_PARENT_OUTSIDE_TYP(TypeConverter.convert(PARENT_OUTSIDE_TYP));
		struct.setOUTSIDE_TYP( ((OUTSIDE_TYP == null) ? (String)null : OUTSIDE_TYP[0]) );
		struct.setList_OUTSIDE_TYP(TypeConverter.convert(OUTSIDE_TYP));
		struct.setPS_SPOIL( ((PS_SPOIL == null) ? (String)null : PS_SPOIL[0]) );
		struct.setList_PS_SPOIL(TypeConverter.convert(PS_SPOIL));
		struct.setCONS_TYP( ((CONS_TYP == null) ? (String)null : CONS_TYP[0]) );
		struct.setList_CONS_TYP(TypeConverter.convert(CONS_TYP));
		struct.setPS_PROP_LOT_SIZE( ((PS_PROP_LOT_SIZE == null) ? (String)null : PS_PROP_LOT_SIZE[0]) );
		struct.setList_PS_PROP_LOT_SIZE(TypeConverter.convert(PS_PROP_LOT_SIZE));
		struct.setin_DEVELOP_TYP_flg( ((in_DEVELOP_TYP_flg == null) ? (String)null : in_DEVELOP_TYP_flg[0]) );
		struct.setList_in_DEVELOP_TYP_flg(TypeConverter.convert(in_DEVELOP_TYP_flg));
		struct.setin_ITEM_CD_flg( ((in_ITEM_CD_flg == null) ? (String)null : in_ITEM_CD_flg[0]) );
		struct.setList_in_ITEM_CD_flg(TypeConverter.convert(in_ITEM_CD_flg));
		struct.setin_ITEM_NAME_flg( ((in_ITEM_NAME_flg == null) ? (String)null : in_ITEM_NAME_flg[0]) );
		struct.setList_in_ITEM_NAME_flg(TypeConverter.convert(in_ITEM_NAME_flg));
		struct.setin_TARGET_DATE_flg( ((in_TARGET_DATE_flg == null) ? (String)null : in_TARGET_DATE_flg[0]) );
		struct.setList_in_TARGET_DATE_flg(TypeConverter.convert(in_TARGET_DATE_flg));
		struct.setin_LEVEL_flg( ((in_LEVEL_flg == null) ? (String)null : in_LEVEL_flg[0]) );
		struct.setList_in_LEVEL_flg(TypeConverter.convert(in_LEVEL_flg));

		return;
	}

	//////////////////////////////

	public static String DEFAULT_TARGET = "/AA0020030.jsp";          // �ړ���URL�̎w��
	public static String JSP_BIND_NAME_Control = "aAA0020030Control"; // JSP��̃o�C���h��(Control)�̎w��
	public static String JSP_BIND_NAME_Struct = "aAA0020030Struct";   // JSP��̃o�C���h��(Struct)�̎w��
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
					AA0020030Control control,
					String refererURL ) throws BusinessProcessException, ServletException, IOException, MessageApiException
	{
		String nextUrl = null;		// �ړ���t�q�k
		AA0020030Entity entity = control.entity;
		AA0020030Struct struct = control.struct;

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

		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");
		//{{user_implement_dev:<defaultEvent>
                //}}user_implement_dev:<defaultEvent>
		logger.exiting("AA0020030Servlet"+":USER="+request.getRemoteUser(),"defaultEvent");

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
		AA0020030Control control;
		AA0020030Entity  entity = null;
		AA0020030Struct  struct = null;

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

			if( (control = (AA0020030Control)so.getAttribute("AA0020030Control_"+request.getSession(false).getId())) == null ) {
				control = new AA0020030Control();
				struct = control.struct;
				entity = control.entity;
				struct.setsUser_ID( request.getRemoteUser() );
				entity.setUsrId( request.getRemoteUser() );
				control.setBusiness(Business.getCurrentBusiness(so, request));
			} else {
				if(request.getParameter("MSG_CONTEXT_NO") != null) {
					if(control.getBusiness().getContextNumber() != Integer.parseInt(request.getParameter("MSG_CONTEXT_NO"))) {
						control = new AA0020030Control();
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
				if( isClick(request, "clear") ) {
					if ( !isCryptical(request, so, params, "clear") ) return ERROR_TARGET;
					target = onClickclear(request, response, so, params, control);
					control.setButton("clear");
				} else if( isClick(request, "Print") ) {
					if ( !isCryptical(request, so, params, "Print") ) return ERROR_TARGET;
					target = onClickPrint(request, response, so, params, control);
					control.setButton("Print");
				} else {
					target = defaultEvent(request, response, so, params, control, refererURL);
				}

				so.setAttribute("AA0020030Control_"+request.getSession(false).getId(),control);

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
				if((isClick(request, "clear") && bFLG_DISCONNECT_clear)
				|| (isClick(request, "Print") && bFLG_DISCONNECT_Print)
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
	private  static boolean bFLG_DISCONNECT_clear = true;
	private  static boolean bFLG_DISCONNECT_Print = true;

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
		return "com.nec.jp.orteus.metamorBase.AA0020.AA0020030Servlet";
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
	public AA0020030Servlet()
	{
		//{{user_implement_dev:<AA0020030_DisConnect_FLG>
                // submit�{�^���������R�l�N�V�����������I��close���邽�߂̃t���O �����ؒf���Ftrue�i�f�t�H���g�j
                bFLG_DISCONNECT_defaultEvent = true;
                bFLG_DISCONNECT_clear = true;
                bFLG_DISCONNECT_Print = true;
              
                //}}user_implement_dev:<AA0020030_DisConnect_FLG>

		//{{user_implement_dev:<AA0020030Servlet>
                //}}user_implement_dev:<AA0020030Servlet>
	}

	//////////////////////////////

}
